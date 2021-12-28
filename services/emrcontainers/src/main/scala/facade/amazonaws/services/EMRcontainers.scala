package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object emrcontainers {
  type ACMCertArn = String
  type ClientToken = String
  type ConfigurationList = js.Array[Configuration]
  type Date = js.Date
  type EndpointArn = String
  type EndpointStates = js.Array[EndpointState]
  type EndpointType = String
  type EndpointTypes = js.Array[EndpointType]
  type Endpoints = js.Array[Endpoint]
  type EntryPointArgument = String
  type EntryPointArguments = js.Array[EntryPointArgument]
  type EntryPointPath = String
  type IAMRoleArn = String
  type JavaInteger = Int
  type JobArn = String
  type JobRunStates = js.Array[JobRunState]
  type JobRuns = js.Array[JobRun]
  type LogGroupName = String
  type NextToken = String
  type ReleaseLabel = String
  type RequestIdentityUserArn = String
  type ResourceIdString = String
  type ResourceNameString = String
  type RsiArn = String
  type SensitivePropertiesMap = js.Dictionary[String1024]
  type SparkSubmitParameters = String
  type String1024 = String
  type String128 = String
  type String256 = String
  type StringEmpty256 = String
  type SubnetIds = js.Array[String256]
  type TagKeyList = js.Array[String128]
  type TagMap = js.Dictionary[StringEmpty256]
  type UriString = String
  type VirtualClusterArn = String
  type VirtualClusterStates = js.Array[VirtualClusterState]
  type VirtualClusters = js.Array[VirtualCluster]

  final class EMRcontainersOps(private val service: EMRcontainers) extends AnyVal {

    @inline def cancelJobRunFuture(params: CancelJobRunRequest): Future[CancelJobRunResponse] = service.cancelJobRun(params).promise().toFuture
    @inline def createManagedEndpointFuture(params: CreateManagedEndpointRequest): Future[CreateManagedEndpointResponse] = service.createManagedEndpoint(params).promise().toFuture
    @inline def createVirtualClusterFuture(params: CreateVirtualClusterRequest): Future[CreateVirtualClusterResponse] = service.createVirtualCluster(params).promise().toFuture
    @inline def deleteManagedEndpointFuture(params: DeleteManagedEndpointRequest): Future[DeleteManagedEndpointResponse] = service.deleteManagedEndpoint(params).promise().toFuture
    @inline def deleteVirtualClusterFuture(params: DeleteVirtualClusterRequest): Future[DeleteVirtualClusterResponse] = service.deleteVirtualCluster(params).promise().toFuture
    @inline def describeJobRunFuture(params: DescribeJobRunRequest): Future[DescribeJobRunResponse] = service.describeJobRun(params).promise().toFuture
    @inline def describeManagedEndpointFuture(params: DescribeManagedEndpointRequest): Future[DescribeManagedEndpointResponse] = service.describeManagedEndpoint(params).promise().toFuture
    @inline def describeVirtualClusterFuture(params: DescribeVirtualClusterRequest): Future[DescribeVirtualClusterResponse] = service.describeVirtualCluster(params).promise().toFuture
    @inline def listJobRunsFuture(params: ListJobRunsRequest): Future[ListJobRunsResponse] = service.listJobRuns(params).promise().toFuture
    @inline def listManagedEndpointsFuture(params: ListManagedEndpointsRequest): Future[ListManagedEndpointsResponse] = service.listManagedEndpoints(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listVirtualClustersFuture(params: ListVirtualClustersRequest): Future[ListVirtualClustersResponse] = service.listVirtualClusters(params).promise().toFuture
    @inline def startJobRunFuture(params: StartJobRunRequest): Future[StartJobRunResponse] = service.startJobRun(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/emrcontainers", JSImport.Namespace, "AWS.EMRcontainers")
  class EMRcontainers() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelJobRun(params: CancelJobRunRequest): Request[CancelJobRunResponse] = js.native
    def createManagedEndpoint(params: CreateManagedEndpointRequest): Request[CreateManagedEndpointResponse] = js.native
    def createVirtualCluster(params: CreateVirtualClusterRequest): Request[CreateVirtualClusterResponse] = js.native
    def deleteManagedEndpoint(params: DeleteManagedEndpointRequest): Request[DeleteManagedEndpointResponse] = js.native
    def deleteVirtualCluster(params: DeleteVirtualClusterRequest): Request[DeleteVirtualClusterResponse] = js.native
    def describeJobRun(params: DescribeJobRunRequest): Request[DescribeJobRunResponse] = js.native
    def describeManagedEndpoint(params: DescribeManagedEndpointRequest): Request[DescribeManagedEndpointResponse] = js.native
    def describeVirtualCluster(params: DescribeVirtualClusterRequest): Request[DescribeVirtualClusterResponse] = js.native
    def listJobRuns(params: ListJobRunsRequest): Request[ListJobRunsResponse] = js.native
    def listManagedEndpoints(params: ListManagedEndpointsRequest): Request[ListManagedEndpointsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listVirtualClusters(params: ListVirtualClustersRequest): Request[ListVirtualClustersResponse] = js.native
    def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object EMRcontainers {
    @inline implicit def toOps(service: EMRcontainers): EMRcontainersOps = {
      new EMRcontainersOps(service)
    }
  }

  @js.native
  trait CancelJobRunRequest extends js.Object {
    var id: ResourceIdString
    var virtualClusterId: ResourceIdString
  }

  object CancelJobRunRequest {
    @inline
    def apply(
        id: ResourceIdString,
        virtualClusterId: ResourceIdString
    ): CancelJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "virtualClusterId" -> virtualClusterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelJobRunRequest]
    }
  }

  @js.native
  trait CancelJobRunResponse extends js.Object {
    var id: js.UndefOr[ResourceIdString]
    var virtualClusterId: js.UndefOr[ResourceIdString]
  }

  object CancelJobRunResponse {
    @inline
    def apply(
        id: js.UndefOr[ResourceIdString] = js.undefined,
        virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
    ): CancelJobRunResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      virtualClusterId.foreach(__v => __obj.updateDynamic("virtualClusterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelJobRunResponse]
    }
  }

  /** A configuration for CloudWatch monitoring. You can configure your jobs to send log information to CloudWatch Logs.
    */
  @js.native
  trait CloudWatchMonitoringConfiguration extends js.Object {
    var logGroupName: LogGroupName
    var logStreamNamePrefix: js.UndefOr[String256]
  }

  object CloudWatchMonitoringConfiguration {
    @inline
    def apply(
        logGroupName: LogGroupName,
        logStreamNamePrefix: js.UndefOr[String256] = js.undefined
    ): CloudWatchMonitoringConfiguration = {
      val __obj = js.Dynamic.literal(
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )

      logStreamNamePrefix.foreach(__v => __obj.updateDynamic("logStreamNamePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchMonitoringConfiguration]
    }
  }

  /** A configuration specification to be used when provisioning virtual clusters, which can include configurations for applications and software bundled with Amazon EMR on EKS. A configuration consists of a classification, properties, and optional nested configurations. A classification refers to an application-specific configuration file. Properties are the settings you want to change in that file.
    */
  @js.native
  trait Configuration extends js.Object {
    var classification: String1024
    var configurations: js.UndefOr[ConfigurationList]
    var properties: js.UndefOr[SensitivePropertiesMap]
  }

  object Configuration {
    @inline
    def apply(
        classification: String1024,
        configurations: js.UndefOr[ConfigurationList] = js.undefined,
        properties: js.UndefOr[SensitivePropertiesMap] = js.undefined
    ): Configuration = {
      val __obj = js.Dynamic.literal(
        "classification" -> classification.asInstanceOf[js.Any]
      )

      configurations.foreach(__v => __obj.updateDynamic("configurations")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Configuration]
    }
  }

  /** A configuration specification to be used to override existing configurations.
    */
  @js.native
  trait ConfigurationOverrides extends js.Object {
    var applicationConfiguration: js.UndefOr[ConfigurationList]
    var monitoringConfiguration: js.UndefOr[MonitoringConfiguration]
  }

  object ConfigurationOverrides {
    @inline
    def apply(
        applicationConfiguration: js.UndefOr[ConfigurationList] = js.undefined,
        monitoringConfiguration: js.UndefOr[MonitoringConfiguration] = js.undefined
    ): ConfigurationOverrides = {
      val __obj = js.Dynamic.literal()
      applicationConfiguration.foreach(__v => __obj.updateDynamic("applicationConfiguration")(__v.asInstanceOf[js.Any]))
      monitoringConfiguration.foreach(__v => __obj.updateDynamic("monitoringConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationOverrides]
    }
  }

  /** The information about the container used for a job run or a managed endpoint.
    */
  @js.native
  trait ContainerInfo extends js.Object {
    var eksInfo: js.UndefOr[EksInfo]
  }

  object ContainerInfo {
    @inline
    def apply(
        eksInfo: js.UndefOr[EksInfo] = js.undefined
    ): ContainerInfo = {
      val __obj = js.Dynamic.literal()
      eksInfo.foreach(__v => __obj.updateDynamic("eksInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerInfo]
    }
  }

  /** The information about the container provider.
    */
  @js.native
  trait ContainerProvider extends js.Object {
    var id: String256
    var `type`: ContainerProviderType
    var info: js.UndefOr[ContainerInfo]
  }

  object ContainerProvider {
    @inline
    def apply(
        id: String256,
        `type`: ContainerProviderType,
        info: js.UndefOr[ContainerInfo] = js.undefined
    ): ContainerProvider = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      info.foreach(__v => __obj.updateDynamic("info")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerProvider]
    }
  }

  @js.native
  sealed trait ContainerProviderType extends js.Any
  object ContainerProviderType {
    val EKS = "EKS".asInstanceOf[ContainerProviderType]

    @inline def values = js.Array(EKS)
  }

  @js.native
  trait CreateManagedEndpointRequest extends js.Object {
    var certificateArn: ACMCertArn
    var clientToken: ClientToken
    var executionRoleArn: IAMRoleArn
    var name: ResourceNameString
    var releaseLabel: ReleaseLabel
    var `type`: EndpointType
    var virtualClusterId: ResourceIdString
    var configurationOverrides: js.UndefOr[ConfigurationOverrides]
    var tags: js.UndefOr[TagMap]
  }

  object CreateManagedEndpointRequest {
    @inline
    def apply(
        certificateArn: ACMCertArn,
        clientToken: ClientToken,
        executionRoleArn: IAMRoleArn,
        name: ResourceNameString,
        releaseLabel: ReleaseLabel,
        `type`: EndpointType,
        virtualClusterId: ResourceIdString,
        configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateManagedEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "certificateArn" -> certificateArn.asInstanceOf[js.Any],
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "executionRoleArn" -> executionRoleArn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "releaseLabel" -> releaseLabel.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any],
        "virtualClusterId" -> virtualClusterId.asInstanceOf[js.Any]
      )

      configurationOverrides.foreach(__v => __obj.updateDynamic("configurationOverrides")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateManagedEndpointRequest]
    }
  }

  @js.native
  trait CreateManagedEndpointResponse extends js.Object {
    var arn: js.UndefOr[EndpointArn]
    var id: js.UndefOr[ResourceIdString]
    var name: js.UndefOr[ResourceNameString]
    var virtualClusterId: js.UndefOr[ResourceIdString]
  }

  object CreateManagedEndpointResponse {
    @inline
    def apply(
        arn: js.UndefOr[EndpointArn] = js.undefined,
        id: js.UndefOr[ResourceIdString] = js.undefined,
        name: js.UndefOr[ResourceNameString] = js.undefined,
        virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
    ): CreateManagedEndpointResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      virtualClusterId.foreach(__v => __obj.updateDynamic("virtualClusterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateManagedEndpointResponse]
    }
  }

  @js.native
  trait CreateVirtualClusterRequest extends js.Object {
    var clientToken: ClientToken
    var containerProvider: ContainerProvider
    var name: ResourceNameString
    var tags: js.UndefOr[TagMap]
  }

  object CreateVirtualClusterRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        containerProvider: ContainerProvider,
        name: ResourceNameString,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateVirtualClusterRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "containerProvider" -> containerProvider.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualClusterRequest]
    }
  }

  @js.native
  trait CreateVirtualClusterResponse extends js.Object {
    var arn: js.UndefOr[VirtualClusterArn]
    var id: js.UndefOr[ResourceIdString]
    var name: js.UndefOr[ResourceNameString]
  }

  object CreateVirtualClusterResponse {
    @inline
    def apply(
        arn: js.UndefOr[VirtualClusterArn] = js.undefined,
        id: js.UndefOr[ResourceIdString] = js.undefined,
        name: js.UndefOr[ResourceNameString] = js.undefined
    ): CreateVirtualClusterResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualClusterResponse]
    }
  }

  @js.native
  trait DeleteManagedEndpointRequest extends js.Object {
    var id: ResourceIdString
    var virtualClusterId: ResourceIdString
  }

  object DeleteManagedEndpointRequest {
    @inline
    def apply(
        id: ResourceIdString,
        virtualClusterId: ResourceIdString
    ): DeleteManagedEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "virtualClusterId" -> virtualClusterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteManagedEndpointRequest]
    }
  }

  @js.native
  trait DeleteManagedEndpointResponse extends js.Object {
    var id: js.UndefOr[ResourceIdString]
    var virtualClusterId: js.UndefOr[ResourceIdString]
  }

  object DeleteManagedEndpointResponse {
    @inline
    def apply(
        id: js.UndefOr[ResourceIdString] = js.undefined,
        virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
    ): DeleteManagedEndpointResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      virtualClusterId.foreach(__v => __obj.updateDynamic("virtualClusterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteManagedEndpointResponse]
    }
  }

  @js.native
  trait DeleteVirtualClusterRequest extends js.Object {
    var id: ResourceIdString
  }

  object DeleteVirtualClusterRequest {
    @inline
    def apply(
        id: ResourceIdString
    ): DeleteVirtualClusterRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVirtualClusterRequest]
    }
  }

  @js.native
  trait DeleteVirtualClusterResponse extends js.Object {
    var id: js.UndefOr[ResourceIdString]
  }

  object DeleteVirtualClusterResponse {
    @inline
    def apply(
        id: js.UndefOr[ResourceIdString] = js.undefined
    ): DeleteVirtualClusterResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVirtualClusterResponse]
    }
  }

  @js.native
  trait DescribeJobRunRequest extends js.Object {
    var id: ResourceIdString
    var virtualClusterId: ResourceIdString
  }

  object DescribeJobRunRequest {
    @inline
    def apply(
        id: ResourceIdString,
        virtualClusterId: ResourceIdString
    ): DescribeJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "virtualClusterId" -> virtualClusterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeJobRunRequest]
    }
  }

  @js.native
  trait DescribeJobRunResponse extends js.Object {
    var jobRun: js.UndefOr[JobRun]
  }

  object DescribeJobRunResponse {
    @inline
    def apply(
        jobRun: js.UndefOr[JobRun] = js.undefined
    ): DescribeJobRunResponse = {
      val __obj = js.Dynamic.literal()
      jobRun.foreach(__v => __obj.updateDynamic("jobRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobRunResponse]
    }
  }

  @js.native
  trait DescribeManagedEndpointRequest extends js.Object {
    var id: ResourceIdString
    var virtualClusterId: ResourceIdString
  }

  object DescribeManagedEndpointRequest {
    @inline
    def apply(
        id: ResourceIdString,
        virtualClusterId: ResourceIdString
    ): DescribeManagedEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "virtualClusterId" -> virtualClusterId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeManagedEndpointRequest]
    }
  }

  @js.native
  trait DescribeManagedEndpointResponse extends js.Object {
    var endpoint: js.UndefOr[Endpoint]
  }

  object DescribeManagedEndpointResponse {
    @inline
    def apply(
        endpoint: js.UndefOr[Endpoint] = js.undefined
    ): DescribeManagedEndpointResponse = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeManagedEndpointResponse]
    }
  }

  @js.native
  trait DescribeVirtualClusterRequest extends js.Object {
    var id: ResourceIdString
  }

  object DescribeVirtualClusterRequest {
    @inline
    def apply(
        id: ResourceIdString
    ): DescribeVirtualClusterRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeVirtualClusterRequest]
    }
  }

  @js.native
  trait DescribeVirtualClusterResponse extends js.Object {
    var virtualCluster: js.UndefOr[VirtualCluster]
  }

  object DescribeVirtualClusterResponse {
    @inline
    def apply(
        virtualCluster: js.UndefOr[VirtualCluster] = js.undefined
    ): DescribeVirtualClusterResponse = {
      val __obj = js.Dynamic.literal()
      virtualCluster.foreach(__v => __obj.updateDynamic("virtualCluster")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVirtualClusterResponse]
    }
  }

  /** The information about the EKS cluster.
    */
  @js.native
  trait EksInfo extends js.Object {
    var namespace: js.UndefOr[String256]
  }

  object EksInfo {
    @inline
    def apply(
        namespace: js.UndefOr[String256] = js.undefined
    ): EksInfo = {
      val __obj = js.Dynamic.literal()
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksInfo]
    }
  }

  /** This entity represents the endpoint that is managed by Amazon EMR on EKS.
    */
  @js.native
  trait Endpoint extends js.Object {
    var arn: js.UndefOr[EndpointArn]
    var certificateArn: js.UndefOr[ACMCertArn]
    var configurationOverrides: js.UndefOr[ConfigurationOverrides]
    var createdAt: js.UndefOr[Date]
    var executionRoleArn: js.UndefOr[IAMRoleArn]
    var id: js.UndefOr[ResourceIdString]
    var name: js.UndefOr[ResourceNameString]
    var releaseLabel: js.UndefOr[ReleaseLabel]
    var securityGroup: js.UndefOr[String256]
    var serverUrl: js.UndefOr[UriString]
    var state: js.UndefOr[EndpointState]
    var subnetIds: js.UndefOr[SubnetIds]
    var tags: js.UndefOr[TagMap]
    var `type`: js.UndefOr[EndpointType]
    var virtualClusterId: js.UndefOr[ResourceIdString]
  }

  object Endpoint {
    @inline
    def apply(
        arn: js.UndefOr[EndpointArn] = js.undefined,
        certificateArn: js.UndefOr[ACMCertArn] = js.undefined,
        configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined,
        createdAt: js.UndefOr[Date] = js.undefined,
        executionRoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        id: js.UndefOr[ResourceIdString] = js.undefined,
        name: js.UndefOr[ResourceNameString] = js.undefined,
        releaseLabel: js.UndefOr[ReleaseLabel] = js.undefined,
        securityGroup: js.UndefOr[String256] = js.undefined,
        serverUrl: js.UndefOr[UriString] = js.undefined,
        state: js.UndefOr[EndpointState] = js.undefined,
        subnetIds: js.UndefOr[SubnetIds] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        `type`: js.UndefOr[EndpointType] = js.undefined,
        virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
    ): Endpoint = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      certificateArn.foreach(__v => __obj.updateDynamic("certificateArn")(__v.asInstanceOf[js.Any]))
      configurationOverrides.foreach(__v => __obj.updateDynamic("configurationOverrides")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      executionRoleArn.foreach(__v => __obj.updateDynamic("executionRoleArn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      releaseLabel.foreach(__v => __obj.updateDynamic("releaseLabel")(__v.asInstanceOf[js.Any]))
      securityGroup.foreach(__v => __obj.updateDynamic("securityGroup")(__v.asInstanceOf[js.Any]))
      serverUrl.foreach(__v => __obj.updateDynamic("serverUrl")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      virtualClusterId.foreach(__v => __obj.updateDynamic("virtualClusterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Endpoint]
    }
  }

  @js.native
  sealed trait EndpointState extends js.Any
  object EndpointState {
    val CREATING = "CREATING".asInstanceOf[EndpointState]
    val ACTIVE = "ACTIVE".asInstanceOf[EndpointState]
    val TERMINATING = "TERMINATING".asInstanceOf[EndpointState]
    val TERMINATED = "TERMINATED".asInstanceOf[EndpointState]
    val TERMINATED_WITH_ERRORS = "TERMINATED_WITH_ERRORS".asInstanceOf[EndpointState]

    @inline def values = js.Array(CREATING, ACTIVE, TERMINATING, TERMINATED, TERMINATED_WITH_ERRORS)
  }

  @js.native
  sealed trait FailureReason extends js.Any
  object FailureReason {
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[FailureReason]
    val USER_ERROR = "USER_ERROR".asInstanceOf[FailureReason]
    val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[FailureReason]
    val CLUSTER_UNAVAILABLE = "CLUSTER_UNAVAILABLE".asInstanceOf[FailureReason]

    @inline def values = js.Array(INTERNAL_ERROR, USER_ERROR, VALIDATION_ERROR, CLUSTER_UNAVAILABLE)
  }

  /** Specify the driver that the job runs on.
    */
  @js.native
  trait JobDriver extends js.Object {
    var sparkSubmitJobDriver: js.UndefOr[SparkSubmitJobDriver]
  }

  object JobDriver {
    @inline
    def apply(
        sparkSubmitJobDriver: js.UndefOr[SparkSubmitJobDriver] = js.undefined
    ): JobDriver = {
      val __obj = js.Dynamic.literal()
      sparkSubmitJobDriver.foreach(__v => __obj.updateDynamic("sparkSubmitJobDriver")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDriver]
    }
  }

  /** This entity describes a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you submit to Amazon EMR on EKS.
    */
  @js.native
  trait JobRun extends js.Object {
    var arn: js.UndefOr[JobArn]
    var clientToken: js.UndefOr[ClientToken]
    var configurationOverrides: js.UndefOr[ConfigurationOverrides]
    var createdAt: js.UndefOr[Date]
    var createdBy: js.UndefOr[RequestIdentityUserArn]
    var executionRoleArn: js.UndefOr[IAMRoleArn]
    var failureReason: js.UndefOr[FailureReason]
    var finishedAt: js.UndefOr[Date]
    var id: js.UndefOr[ResourceIdString]
    var jobDriver: js.UndefOr[JobDriver]
    var name: js.UndefOr[ResourceNameString]
    var releaseLabel: js.UndefOr[ReleaseLabel]
    var state: js.UndefOr[JobRunState]
    var stateDetails: js.UndefOr[String256]
    var tags: js.UndefOr[TagMap]
    var virtualClusterId: js.UndefOr[ResourceIdString]
  }

  object JobRun {
    @inline
    def apply(
        arn: js.UndefOr[JobArn] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined,
        createdAt: js.UndefOr[Date] = js.undefined,
        createdBy: js.UndefOr[RequestIdentityUserArn] = js.undefined,
        executionRoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        failureReason: js.UndefOr[FailureReason] = js.undefined,
        finishedAt: js.UndefOr[Date] = js.undefined,
        id: js.UndefOr[ResourceIdString] = js.undefined,
        jobDriver: js.UndefOr[JobDriver] = js.undefined,
        name: js.UndefOr[ResourceNameString] = js.undefined,
        releaseLabel: js.UndefOr[ReleaseLabel] = js.undefined,
        state: js.UndefOr[JobRunState] = js.undefined,
        stateDetails: js.UndefOr[String256] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
    ): JobRun = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      configurationOverrides.foreach(__v => __obj.updateDynamic("configurationOverrides")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      createdBy.foreach(__v => __obj.updateDynamic("createdBy")(__v.asInstanceOf[js.Any]))
      executionRoleArn.foreach(__v => __obj.updateDynamic("executionRoleArn")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      finishedAt.foreach(__v => __obj.updateDynamic("finishedAt")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      jobDriver.foreach(__v => __obj.updateDynamic("jobDriver")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      releaseLabel.foreach(__v => __obj.updateDynamic("releaseLabel")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      stateDetails.foreach(__v => __obj.updateDynamic("stateDetails")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      virtualClusterId.foreach(__v => __obj.updateDynamic("virtualClusterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobRun]
    }
  }

  @js.native
  sealed trait JobRunState extends js.Any
  object JobRunState {
    val PENDING = "PENDING".asInstanceOf[JobRunState]
    val SUBMITTED = "SUBMITTED".asInstanceOf[JobRunState]
    val RUNNING = "RUNNING".asInstanceOf[JobRunState]
    val FAILED = "FAILED".asInstanceOf[JobRunState]
    val CANCELLED = "CANCELLED".asInstanceOf[JobRunState]
    val CANCEL_PENDING = "CANCEL_PENDING".asInstanceOf[JobRunState]
    val COMPLETED = "COMPLETED".asInstanceOf[JobRunState]

    @inline def values = js.Array(PENDING, SUBMITTED, RUNNING, FAILED, CANCELLED, CANCEL_PENDING, COMPLETED)
  }

  @js.native
  trait ListJobRunsRequest extends js.Object {
    var virtualClusterId: ResourceIdString
    var createdAfter: js.UndefOr[Date]
    var createdBefore: js.UndefOr[Date]
    var maxResults: js.UndefOr[JavaInteger]
    var name: js.UndefOr[ResourceNameString]
    var nextToken: js.UndefOr[NextToken]
    var states: js.UndefOr[JobRunStates]
  }

  object ListJobRunsRequest {
    @inline
    def apply(
        virtualClusterId: ResourceIdString,
        createdAfter: js.UndefOr[Date] = js.undefined,
        createdBefore: js.UndefOr[Date] = js.undefined,
        maxResults: js.UndefOr[JavaInteger] = js.undefined,
        name: js.UndefOr[ResourceNameString] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        states: js.UndefOr[JobRunStates] = js.undefined
    ): ListJobRunsRequest = {
      val __obj = js.Dynamic.literal(
        "virtualClusterId" -> virtualClusterId.asInstanceOf[js.Any]
      )

      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      states.foreach(__v => __obj.updateDynamic("states")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobRunsRequest]
    }
  }

  @js.native
  trait ListJobRunsResponse extends js.Object {
    var jobRuns: js.UndefOr[JobRuns]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobRunsResponse {
    @inline
    def apply(
        jobRuns: js.UndefOr[JobRuns] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobRunsResponse = {
      val __obj = js.Dynamic.literal()
      jobRuns.foreach(__v => __obj.updateDynamic("jobRuns")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobRunsResponse]
    }
  }

  @js.native
  trait ListManagedEndpointsRequest extends js.Object {
    var virtualClusterId: ResourceIdString
    var createdAfter: js.UndefOr[Date]
    var createdBefore: js.UndefOr[Date]
    var maxResults: js.UndefOr[JavaInteger]
    var nextToken: js.UndefOr[NextToken]
    var states: js.UndefOr[EndpointStates]
    var types: js.UndefOr[EndpointTypes]
  }

  object ListManagedEndpointsRequest {
    @inline
    def apply(
        virtualClusterId: ResourceIdString,
        createdAfter: js.UndefOr[Date] = js.undefined,
        createdBefore: js.UndefOr[Date] = js.undefined,
        maxResults: js.UndefOr[JavaInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        states: js.UndefOr[EndpointStates] = js.undefined,
        types: js.UndefOr[EndpointTypes] = js.undefined
    ): ListManagedEndpointsRequest = {
      val __obj = js.Dynamic.literal(
        "virtualClusterId" -> virtualClusterId.asInstanceOf[js.Any]
      )

      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      states.foreach(__v => __obj.updateDynamic("states")(__v.asInstanceOf[js.Any]))
      types.foreach(__v => __obj.updateDynamic("types")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedEndpointsRequest]
    }
  }

  @js.native
  trait ListManagedEndpointsResponse extends js.Object {
    var endpoints: js.UndefOr[Endpoints]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListManagedEndpointsResponse {
    @inline
    def apply(
        endpoints: js.UndefOr[Endpoints] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListManagedEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      endpoints.foreach(__v => __obj.updateDynamic("endpoints")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedEndpointsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: RsiArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: RsiArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListVirtualClustersRequest extends js.Object {
    var containerProviderId: js.UndefOr[String1024]
    var containerProviderType: js.UndefOr[ContainerProviderType]
    var createdAfter: js.UndefOr[Date]
    var createdBefore: js.UndefOr[Date]
    var maxResults: js.UndefOr[JavaInteger]
    var nextToken: js.UndefOr[NextToken]
    var states: js.UndefOr[VirtualClusterStates]
  }

  object ListVirtualClustersRequest {
    @inline
    def apply(
        containerProviderId: js.UndefOr[String1024] = js.undefined,
        containerProviderType: js.UndefOr[ContainerProviderType] = js.undefined,
        createdAfter: js.UndefOr[Date] = js.undefined,
        createdBefore: js.UndefOr[Date] = js.undefined,
        maxResults: js.UndefOr[JavaInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        states: js.UndefOr[VirtualClusterStates] = js.undefined
    ): ListVirtualClustersRequest = {
      val __obj = js.Dynamic.literal()
      containerProviderId.foreach(__v => __obj.updateDynamic("containerProviderId")(__v.asInstanceOf[js.Any]))
      containerProviderType.foreach(__v => __obj.updateDynamic("containerProviderType")(__v.asInstanceOf[js.Any]))
      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      states.foreach(__v => __obj.updateDynamic("states")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualClustersRequest]
    }
  }

  @js.native
  trait ListVirtualClustersResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var virtualClusters: js.UndefOr[VirtualClusters]
  }

  object ListVirtualClustersResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        virtualClusters: js.UndefOr[VirtualClusters] = js.undefined
    ): ListVirtualClustersResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      virtualClusters.foreach(__v => __obj.updateDynamic("virtualClusters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualClustersResponse]
    }
  }

  /** Configuration setting for monitoring.
    */
  @js.native
  trait MonitoringConfiguration extends js.Object {
    var cloudWatchMonitoringConfiguration: js.UndefOr[CloudWatchMonitoringConfiguration]
    var persistentAppUI: js.UndefOr[PersistentAppUI]
    var s3MonitoringConfiguration: js.UndefOr[S3MonitoringConfiguration]
  }

  object MonitoringConfiguration {
    @inline
    def apply(
        cloudWatchMonitoringConfiguration: js.UndefOr[CloudWatchMonitoringConfiguration] = js.undefined,
        persistentAppUI: js.UndefOr[PersistentAppUI] = js.undefined,
        s3MonitoringConfiguration: js.UndefOr[S3MonitoringConfiguration] = js.undefined
    ): MonitoringConfiguration = {
      val __obj = js.Dynamic.literal()
      cloudWatchMonitoringConfiguration.foreach(__v => __obj.updateDynamic("cloudWatchMonitoringConfiguration")(__v.asInstanceOf[js.Any]))
      persistentAppUI.foreach(__v => __obj.updateDynamic("persistentAppUI")(__v.asInstanceOf[js.Any]))
      s3MonitoringConfiguration.foreach(__v => __obj.updateDynamic("s3MonitoringConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitoringConfiguration]
    }
  }

  @js.native
  sealed trait PersistentAppUI extends js.Any
  object PersistentAppUI {
    val ENABLED = "ENABLED".asInstanceOf[PersistentAppUI]
    val DISABLED = "DISABLED".asInstanceOf[PersistentAppUI]

    @inline def values = js.Array(ENABLED, DISABLED)
  }

  /** Amazon S3 configuration for monitoring log publishing. You can configure your jobs to send log information to Amazon S3.
    */
  @js.native
  trait S3MonitoringConfiguration extends js.Object {
    var logUri: UriString
  }

  object S3MonitoringConfiguration {
    @inline
    def apply(
        logUri: UriString
    ): S3MonitoringConfiguration = {
      val __obj = js.Dynamic.literal(
        "logUri" -> logUri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3MonitoringConfiguration]
    }
  }

  /** The information about job driver for Spark submit.
    */
  @js.native
  trait SparkSubmitJobDriver extends js.Object {
    var entryPoint: EntryPointPath
    var entryPointArguments: js.UndefOr[EntryPointArguments]
    var sparkSubmitParameters: js.UndefOr[SparkSubmitParameters]
  }

  object SparkSubmitJobDriver {
    @inline
    def apply(
        entryPoint: EntryPointPath,
        entryPointArguments: js.UndefOr[EntryPointArguments] = js.undefined,
        sparkSubmitParameters: js.UndefOr[SparkSubmitParameters] = js.undefined
    ): SparkSubmitJobDriver = {
      val __obj = js.Dynamic.literal(
        "entryPoint" -> entryPoint.asInstanceOf[js.Any]
      )

      entryPointArguments.foreach(__v => __obj.updateDynamic("entryPointArguments")(__v.asInstanceOf[js.Any]))
      sparkSubmitParameters.foreach(__v => __obj.updateDynamic("sparkSubmitParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SparkSubmitJobDriver]
    }
  }

  @js.native
  trait StartJobRunRequest extends js.Object {
    var clientToken: ClientToken
    var executionRoleArn: IAMRoleArn
    var jobDriver: JobDriver
    var releaseLabel: ReleaseLabel
    var virtualClusterId: ResourceIdString
    var configurationOverrides: js.UndefOr[ConfigurationOverrides]
    var name: js.UndefOr[ResourceNameString]
    var tags: js.UndefOr[TagMap]
  }

  object StartJobRunRequest {
    @inline
    def apply(
        clientToken: ClientToken,
        executionRoleArn: IAMRoleArn,
        jobDriver: JobDriver,
        releaseLabel: ReleaseLabel,
        virtualClusterId: ResourceIdString,
        configurationOverrides: js.UndefOr[ConfigurationOverrides] = js.undefined,
        name: js.UndefOr[ResourceNameString] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartJobRunRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "executionRoleArn" -> executionRoleArn.asInstanceOf[js.Any],
        "jobDriver" -> jobDriver.asInstanceOf[js.Any],
        "releaseLabel" -> releaseLabel.asInstanceOf[js.Any],
        "virtualClusterId" -> virtualClusterId.asInstanceOf[js.Any]
      )

      configurationOverrides.foreach(__v => __obj.updateDynamic("configurationOverrides")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartJobRunRequest]
    }
  }

  @js.native
  trait StartJobRunResponse extends js.Object {
    var arn: js.UndefOr[JobArn]
    var id: js.UndefOr[ResourceIdString]
    var name: js.UndefOr[ResourceNameString]
    var virtualClusterId: js.UndefOr[ResourceIdString]
  }

  object StartJobRunResponse {
    @inline
    def apply(
        arn: js.UndefOr[JobArn] = js.undefined,
        id: js.UndefOr[ResourceIdString] = js.undefined,
        name: js.UndefOr[ResourceNameString] = js.undefined,
        virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
    ): StartJobRunResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      virtualClusterId.foreach(__v => __obj.updateDynamic("virtualClusterId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartJobRunResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: RsiArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: RsiArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: RsiArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: RsiArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** This entity describes a virtual cluster. A virtual cluster is a Kubernetes namespace that Amazon EMR is registered with. Amazon EMR uses virtual clusters to run jobs and host endpoints. Multiple virtual clusters can be backed by the same physical cluster. However, each virtual cluster maps to one namespace on an EKS cluster. Virtual clusters do not create any active resources that contribute to your bill or that require lifecycle management outside the service.
    */
  @js.native
  trait VirtualCluster extends js.Object {
    var arn: js.UndefOr[VirtualClusterArn]
    var containerProvider: js.UndefOr[ContainerProvider]
    var createdAt: js.UndefOr[Date]
    var id: js.UndefOr[ResourceIdString]
    var name: js.UndefOr[ResourceNameString]
    var state: js.UndefOr[VirtualClusterState]
    var tags: js.UndefOr[TagMap]
  }

  object VirtualCluster {
    @inline
    def apply(
        arn: js.UndefOr[VirtualClusterArn] = js.undefined,
        containerProvider: js.UndefOr[ContainerProvider] = js.undefined,
        createdAt: js.UndefOr[Date] = js.undefined,
        id: js.UndefOr[ResourceIdString] = js.undefined,
        name: js.UndefOr[ResourceNameString] = js.undefined,
        state: js.UndefOr[VirtualClusterState] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): VirtualCluster = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      containerProvider.foreach(__v => __obj.updateDynamic("containerProvider")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualCluster]
    }
  }

  @js.native
  sealed trait VirtualClusterState extends js.Any
  object VirtualClusterState {
    val RUNNING = "RUNNING".asInstanceOf[VirtualClusterState]
    val TERMINATING = "TERMINATING".asInstanceOf[VirtualClusterState]
    val TERMINATED = "TERMINATED".asInstanceOf[VirtualClusterState]
    val ARRESTED = "ARRESTED".asInstanceOf[VirtualClusterState]

    @inline def values = js.Array(RUNNING, TERMINATING, TERMINATED, ARRESTED)
  }
}
