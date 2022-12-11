package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object batch {
  type ArrayJobStatusSummary = js.Dictionary[Int]
  type AttemptDetails = js.Array[AttemptDetail]
  type ComputeEnvironmentDetailList = js.Array[ComputeEnvironmentDetail]
  type ComputeEnvironmentOrders = js.Array[ComputeEnvironmentOrder]
  type DeviceCgroupPermissions = js.Array[DeviceCgroupPermission]
  type DevicesList = js.Array[Device]
  type Ec2ConfigurationList = js.Array[Ec2Configuration]
  type EksAttemptContainerDetails = js.Array[EksAttemptContainerDetail]
  type EksAttemptDetails = js.Array[EksAttemptDetail]
  type EksContainerDetails = js.Array[EksContainerDetail]
  type EksContainerEnvironmentVariables = js.Array[EksContainerEnvironmentVariable]
  type EksContainerOverrideList = js.Array[EksContainerOverride]
  type EksContainerVolumeMounts = js.Array[EksContainerVolumeMount]
  type EksContainers = js.Array[EksContainer]
  type EksLimits = js.Dictionary[Quantity]
  type EksRequests = js.Dictionary[Quantity]
  type EksVolumes = js.Array[EksVolume]
  type EnvironmentVariables = js.Array[KeyValuePair]
  type EvaluateOnExitList = js.Array[EvaluateOnExit]
  type ImageIdOverride = String
  type ImageType = String
  type JobDefinitionList = js.Array[JobDefinition]
  type JobDependencyList = js.Array[JobDependency]
  type JobDetailList = js.Array[JobDetail]
  type JobExecutionTimeoutMinutes = Double
  type JobQueueDetailList = js.Array[JobQueueDetail]
  type JobSummaryList = js.Array[JobSummary]
  type KubernetesVersion = String
  type ListJobsFilterList = js.Array[KeyValuesPair]
  type LogConfigurationOptionsMap = js.Dictionary[String]
  type MountPoints = js.Array[MountPoint]
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type NodePropertyOverrides = js.Array[NodePropertyOverride]
  type NodeRangeProperties = js.Array[NodeRangeProperty]
  type ParametersMap = js.Dictionary[String]
  type PlatformCapabilityList = js.Array[PlatformCapability]
  type Quantity = String
  type ResourceRequirements = js.Array[ResourceRequirement]
  type SchedulingPolicyDetailList = js.Array[SchedulingPolicyDetail]
  type SchedulingPolicyListingDetailList = js.Array[SchedulingPolicyListingDetail]
  type SecretList = js.Array[Secret]
  type ShareAttributesList = js.Array[ShareAttributes]
  type StringList = js.Array[String]
  type TagKey = String
  type TagKeysList = js.Array[TagKey]
  type TagValue = String
  type TagrisTagsMap = js.Dictionary[TagValue]
  type TagsMap = js.Dictionary[String]
  type TmpfsList = js.Array[Tmpfs]
  type Ulimits = js.Array[Ulimit]
  type Volumes = js.Array[Volume]

  final class BatchOps(private val service: Batch) extends AnyVal {

    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] = service.cancelJob(params).promise().toFuture
    @inline def createComputeEnvironmentFuture(params: CreateComputeEnvironmentRequest): Future[CreateComputeEnvironmentResponse] = service.createComputeEnvironment(params).promise().toFuture
    @inline def createJobQueueFuture(params: CreateJobQueueRequest): Future[CreateJobQueueResponse] = service.createJobQueue(params).promise().toFuture
    @inline def createSchedulingPolicyFuture(params: CreateSchedulingPolicyRequest): Future[CreateSchedulingPolicyResponse] = service.createSchedulingPolicy(params).promise().toFuture
    @inline def deleteComputeEnvironmentFuture(params: DeleteComputeEnvironmentRequest): Future[DeleteComputeEnvironmentResponse] = service.deleteComputeEnvironment(params).promise().toFuture
    @inline def deleteJobQueueFuture(params: DeleteJobQueueRequest): Future[DeleteJobQueueResponse] = service.deleteJobQueue(params).promise().toFuture
    @inline def deleteSchedulingPolicyFuture(params: DeleteSchedulingPolicyRequest): Future[DeleteSchedulingPolicyResponse] = service.deleteSchedulingPolicy(params).promise().toFuture
    @inline def deregisterJobDefinitionFuture(params: DeregisterJobDefinitionRequest): Future[DeregisterJobDefinitionResponse] = service.deregisterJobDefinition(params).promise().toFuture
    @inline def describeComputeEnvironmentsFuture(params: DescribeComputeEnvironmentsRequest): Future[DescribeComputeEnvironmentsResponse] = service.describeComputeEnvironments(params).promise().toFuture
    @inline def describeJobDefinitionsFuture(params: DescribeJobDefinitionsRequest): Future[DescribeJobDefinitionsResponse] = service.describeJobDefinitions(params).promise().toFuture
    @inline def describeJobQueuesFuture(params: DescribeJobQueuesRequest): Future[DescribeJobQueuesResponse] = service.describeJobQueues(params).promise().toFuture
    @inline def describeJobsFuture(params: DescribeJobsRequest): Future[DescribeJobsResponse] = service.describeJobs(params).promise().toFuture
    @inline def describeSchedulingPoliciesFuture(params: DescribeSchedulingPoliciesRequest): Future[DescribeSchedulingPoliciesResponse] = service.describeSchedulingPolicies(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] = service.listJobs(params).promise().toFuture
    @inline def listSchedulingPoliciesFuture(params: ListSchedulingPoliciesRequest): Future[ListSchedulingPoliciesResponse] = service.listSchedulingPolicies(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def registerJobDefinitionFuture(params: RegisterJobDefinitionRequest): Future[RegisterJobDefinitionResponse] = service.registerJobDefinition(params).promise().toFuture
    @inline def submitJobFuture(params: SubmitJobRequest): Future[SubmitJobResponse] = service.submitJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def terminateJobFuture(params: TerminateJobRequest): Future[TerminateJobResponse] = service.terminateJob(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateComputeEnvironmentFuture(params: UpdateComputeEnvironmentRequest): Future[UpdateComputeEnvironmentResponse] = service.updateComputeEnvironment(params).promise().toFuture
    @inline def updateJobQueueFuture(params: UpdateJobQueueRequest): Future[UpdateJobQueueResponse] = service.updateJobQueue(params).promise().toFuture
    @inline def updateSchedulingPolicyFuture(params: UpdateSchedulingPolicyRequest): Future[UpdateSchedulingPolicyResponse] = service.updateSchedulingPolicy(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/batch", JSImport.Namespace, "AWS.Batch")
  class Batch() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse] = js.native
    def createComputeEnvironment(params: CreateComputeEnvironmentRequest): Request[CreateComputeEnvironmentResponse] = js.native
    def createJobQueue(params: CreateJobQueueRequest): Request[CreateJobQueueResponse] = js.native
    def createSchedulingPolicy(params: CreateSchedulingPolicyRequest): Request[CreateSchedulingPolicyResponse] = js.native
    def deleteComputeEnvironment(params: DeleteComputeEnvironmentRequest): Request[DeleteComputeEnvironmentResponse] = js.native
    def deleteJobQueue(params: DeleteJobQueueRequest): Request[DeleteJobQueueResponse] = js.native
    def deleteSchedulingPolicy(params: DeleteSchedulingPolicyRequest): Request[DeleteSchedulingPolicyResponse] = js.native
    def deregisterJobDefinition(params: DeregisterJobDefinitionRequest): Request[DeregisterJobDefinitionResponse] = js.native
    def describeComputeEnvironments(params: DescribeComputeEnvironmentsRequest): Request[DescribeComputeEnvironmentsResponse] = js.native
    def describeJobDefinitions(params: DescribeJobDefinitionsRequest): Request[DescribeJobDefinitionsResponse] = js.native
    def describeJobQueues(params: DescribeJobQueuesRequest): Request[DescribeJobQueuesResponse] = js.native
    def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse] = js.native
    def describeSchedulingPolicies(params: DescribeSchedulingPoliciesRequest): Request[DescribeSchedulingPoliciesResponse] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse] = js.native
    def listSchedulingPolicies(params: ListSchedulingPoliciesRequest): Request[ListSchedulingPoliciesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def registerJobDefinition(params: RegisterJobDefinitionRequest): Request[RegisterJobDefinitionResponse] = js.native
    def submitJob(params: SubmitJobRequest): Request[SubmitJobResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def terminateJob(params: TerminateJobRequest): Request[TerminateJobResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateComputeEnvironment(params: UpdateComputeEnvironmentRequest): Request[UpdateComputeEnvironmentResponse] = js.native
    def updateJobQueue(params: UpdateJobQueueRequest): Request[UpdateJobQueueResponse] = js.native
    def updateSchedulingPolicy(params: UpdateSchedulingPolicyRequest): Request[UpdateSchedulingPolicyResponse] = js.native
  }
  object Batch {
    @inline implicit def toOps(service: Batch): BatchOps = {
      new BatchOps(service)
    }
  }

  /** An object that represents an Batch array job.
    */
  @js.native
  trait ArrayProperties extends js.Object {
    var size: js.UndefOr[Int]
  }

  object ArrayProperties {
    @inline
    def apply(
        size: js.UndefOr[Int] = js.undefined
    ): ArrayProperties = {
      val __obj = js.Dynamic.literal()
      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArrayProperties]
    }
  }

  /** An object that represents the array properties of a job.
    */
  @js.native
  trait ArrayPropertiesDetail extends js.Object {
    var index: js.UndefOr[Int]
    var size: js.UndefOr[Int]
    var statusSummary: js.UndefOr[ArrayJobStatusSummary]
  }

  object ArrayPropertiesDetail {
    @inline
    def apply(
        index: js.UndefOr[Int] = js.undefined,
        size: js.UndefOr[Int] = js.undefined,
        statusSummary: js.UndefOr[ArrayJobStatusSummary] = js.undefined
    ): ArrayPropertiesDetail = {
      val __obj = js.Dynamic.literal()
      index.foreach(__v => __obj.updateDynamic("index")(__v.asInstanceOf[js.Any]))
      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      statusSummary.foreach(__v => __obj.updateDynamic("statusSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArrayPropertiesDetail]
    }
  }

  /** An object that represents the array properties of a job.
    */
  @js.native
  trait ArrayPropertiesSummary extends js.Object {
    var index: js.UndefOr[Int]
    var size: js.UndefOr[Int]
  }

  object ArrayPropertiesSummary {
    @inline
    def apply(
        index: js.UndefOr[Int] = js.undefined,
        size: js.UndefOr[Int] = js.undefined
    ): ArrayPropertiesSummary = {
      val __obj = js.Dynamic.literal()
      index.foreach(__v => __obj.updateDynamic("index")(__v.asInstanceOf[js.Any]))
      size.foreach(__v => __obj.updateDynamic("size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArrayPropertiesSummary]
    }
  }

  /** An object that represents the details of a container that's part of a job attempt.
    */
  @js.native
  trait AttemptContainerDetail extends js.Object {
    var containerInstanceArn: js.UndefOr[String]
    var exitCode: js.UndefOr[Int]
    var logStreamName: js.UndefOr[String]
    var networkInterfaces: js.UndefOr[NetworkInterfaceList]
    var reason: js.UndefOr[String]
    var taskArn: js.UndefOr[String]
  }

  object AttemptContainerDetail {
    @inline
    def apply(
        containerInstanceArn: js.UndefOr[String] = js.undefined,
        exitCode: js.UndefOr[Int] = js.undefined,
        logStreamName: js.UndefOr[String] = js.undefined,
        networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        taskArn: js.UndefOr[String] = js.undefined
    ): AttemptContainerDetail = {
      val __obj = js.Dynamic.literal()
      containerInstanceArn.foreach(__v => __obj.updateDynamic("containerInstanceArn")(__v.asInstanceOf[js.Any]))
      exitCode.foreach(__v => __obj.updateDynamic("exitCode")(__v.asInstanceOf[js.Any]))
      logStreamName.foreach(__v => __obj.updateDynamic("logStreamName")(__v.asInstanceOf[js.Any]))
      networkInterfaces.foreach(__v => __obj.updateDynamic("networkInterfaces")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      taskArn.foreach(__v => __obj.updateDynamic("taskArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttemptContainerDetail]
    }
  }

  /** An object that represents a job attempt.
    */
  @js.native
  trait AttemptDetail extends js.Object {
    var container: js.UndefOr[AttemptContainerDetail]
    var startedAt: js.UndefOr[Double]
    var statusReason: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
  }

  object AttemptDetail {
    @inline
    def apply(
        container: js.UndefOr[AttemptContainerDetail] = js.undefined,
        startedAt: js.UndefOr[Double] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        stoppedAt: js.UndefOr[Double] = js.undefined
    ): AttemptDetail = {
      val __obj = js.Dynamic.literal()
      container.foreach(__v => __obj.updateDynamic("container")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      stoppedAt.foreach(__v => __obj.updateDynamic("stoppedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttemptDetail]
    }
  }

  /** Contains the parameters for <code>CancelJob</code>.
    */
  @js.native
  trait CancelJobRequest extends js.Object {
    var jobId: String
    var reason: String
  }

  object CancelJobRequest {
    @inline
    def apply(
        jobId: String,
        reason: String
    ): CancelJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "reason" -> reason.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object

  object CancelJobResponse {
    @inline
    def apply(): CancelJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelJobResponse]
    }
  }

  /** An object that represents an Batch compute environment.
    */
  @js.native
  trait ComputeEnvironmentDetail extends js.Object {
    var computeEnvironmentArn: String
    var computeEnvironmentName: String
    var computeResources: js.UndefOr[ComputeResource]
    var containerOrchestrationType: js.UndefOr[OrchestrationType]
    var ecsClusterArn: js.UndefOr[String]
    var eksConfiguration: js.UndefOr[EksConfiguration]
    var serviceRole: js.UndefOr[String]
    var state: js.UndefOr[CEState]
    var status: js.UndefOr[CEStatus]
    var statusReason: js.UndefOr[String]
    var tags: js.UndefOr[TagrisTagsMap]
    var `type`: js.UndefOr[CEType]
    var unmanagedvCpus: js.UndefOr[Int]
    var updatePolicy: js.UndefOr[UpdatePolicy]
    var uuid: js.UndefOr[String]
  }

  object ComputeEnvironmentDetail {
    @inline
    def apply(
        computeEnvironmentArn: String,
        computeEnvironmentName: String,
        computeResources: js.UndefOr[ComputeResource] = js.undefined,
        containerOrchestrationType: js.UndefOr[OrchestrationType] = js.undefined,
        ecsClusterArn: js.UndefOr[String] = js.undefined,
        eksConfiguration: js.UndefOr[EksConfiguration] = js.undefined,
        serviceRole: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[CEState] = js.undefined,
        status: js.UndefOr[CEStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined,
        `type`: js.UndefOr[CEType] = js.undefined,
        unmanagedvCpus: js.UndefOr[Int] = js.undefined,
        updatePolicy: js.UndefOr[UpdatePolicy] = js.undefined,
        uuid: js.UndefOr[String] = js.undefined
    ): ComputeEnvironmentDetail = {
      val __obj = js.Dynamic.literal(
        "computeEnvironmentArn" -> computeEnvironmentArn.asInstanceOf[js.Any],
        "computeEnvironmentName" -> computeEnvironmentName.asInstanceOf[js.Any]
      )

      computeResources.foreach(__v => __obj.updateDynamic("computeResources")(__v.asInstanceOf[js.Any]))
      containerOrchestrationType.foreach(__v => __obj.updateDynamic("containerOrchestrationType")(__v.asInstanceOf[js.Any]))
      ecsClusterArn.foreach(__v => __obj.updateDynamic("ecsClusterArn")(__v.asInstanceOf[js.Any]))
      eksConfiguration.foreach(__v => __obj.updateDynamic("eksConfiguration")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      unmanagedvCpus.foreach(__v => __obj.updateDynamic("unmanagedvCpus")(__v.asInstanceOf[js.Any]))
      updatePolicy.foreach(__v => __obj.updateDynamic("updatePolicy")(__v.asInstanceOf[js.Any]))
      uuid.foreach(__v => __obj.updateDynamic("uuid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeEnvironmentDetail]
    }
  }

  /** The order that compute environments are tried in for job placement within a queue. Compute environments are tried in ascending order. For example, if two compute environments are associated with a job queue, the compute environment with a lower order integer value is tried for job placement first. Compute environments must be in the <code>VALID</code> state before you can associate them with a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments can't be mixed.
    *
    * '''Note:'''All compute environments that are associated with a job queue must share the same architecture. Batch doesn't support mixing compute environment architecture types in a single job queue.
    */
  @js.native
  trait ComputeEnvironmentOrder extends js.Object {
    var computeEnvironment: String
    var order: Int
  }

  object ComputeEnvironmentOrder {
    @inline
    def apply(
        computeEnvironment: String,
        order: Int
    ): ComputeEnvironmentOrder = {
      val __obj = js.Dynamic.literal(
        "computeEnvironment" -> computeEnvironment.asInstanceOf[js.Any],
        "order" -> order.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ComputeEnvironmentOrder]
    }
  }

  /** An object that represents an Batch compute resource. For more information, see [[https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html|Compute environments]] in the <i>Batch User Guide</i>.
    */
  @js.native
  trait ComputeResource extends js.Object {
    var maxvCpus: Int
    var subnets: StringList
    var `type`: CRType
    var allocationStrategy: js.UndefOr[CRAllocationStrategy]
    var bidPercentage: js.UndefOr[Int]
    var desiredvCpus: js.UndefOr[Int]
    var ec2Configuration: js.UndefOr[Ec2ConfigurationList]
    var ec2KeyPair: js.UndefOr[String]
    var imageId: js.UndefOr[String]
    var instanceRole: js.UndefOr[String]
    var instanceTypes: js.UndefOr[StringList]
    var launchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var minvCpus: js.UndefOr[Int]
    var placementGroup: js.UndefOr[String]
    var securityGroupIds: js.UndefOr[StringList]
    var spotIamFleetRole: js.UndefOr[String]
    var tags: js.UndefOr[TagsMap]
  }

  object ComputeResource {
    @inline
    def apply(
        maxvCpus: Int,
        subnets: StringList,
        `type`: CRType,
        allocationStrategy: js.UndefOr[CRAllocationStrategy] = js.undefined,
        bidPercentage: js.UndefOr[Int] = js.undefined,
        desiredvCpus: js.UndefOr[Int] = js.undefined,
        ec2Configuration: js.UndefOr[Ec2ConfigurationList] = js.undefined,
        ec2KeyPair: js.UndefOr[String] = js.undefined,
        imageId: js.UndefOr[String] = js.undefined,
        instanceRole: js.UndefOr[String] = js.undefined,
        instanceTypes: js.UndefOr[StringList] = js.undefined,
        launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        minvCpus: js.UndefOr[Int] = js.undefined,
        placementGroup: js.UndefOr[String] = js.undefined,
        securityGroupIds: js.UndefOr[StringList] = js.undefined,
        spotIamFleetRole: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ComputeResource = {
      val __obj = js.Dynamic.literal(
        "maxvCpus" -> maxvCpus.asInstanceOf[js.Any],
        "subnets" -> subnets.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      allocationStrategy.foreach(__v => __obj.updateDynamic("allocationStrategy")(__v.asInstanceOf[js.Any]))
      bidPercentage.foreach(__v => __obj.updateDynamic("bidPercentage")(__v.asInstanceOf[js.Any]))
      desiredvCpus.foreach(__v => __obj.updateDynamic("desiredvCpus")(__v.asInstanceOf[js.Any]))
      ec2Configuration.foreach(__v => __obj.updateDynamic("ec2Configuration")(__v.asInstanceOf[js.Any]))
      ec2KeyPair.foreach(__v => __obj.updateDynamic("ec2KeyPair")(__v.asInstanceOf[js.Any]))
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      instanceRole.foreach(__v => __obj.updateDynamic("instanceRole")(__v.asInstanceOf[js.Any]))
      instanceTypes.foreach(__v => __obj.updateDynamic("instanceTypes")(__v.asInstanceOf[js.Any]))
      launchTemplate.foreach(__v => __obj.updateDynamic("launchTemplate")(__v.asInstanceOf[js.Any]))
      minvCpus.foreach(__v => __obj.updateDynamic("minvCpus")(__v.asInstanceOf[js.Any]))
      placementGroup.foreach(__v => __obj.updateDynamic("placementGroup")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      spotIamFleetRole.foreach(__v => __obj.updateDynamic("spotIamFleetRole")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeResource]
    }
  }

  /** An object that represents the attributes of a compute environment that can be updated. For more information, see [[https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html|Updating compute environments]] in the <i>Batch User Guide</i>.
    */
  @js.native
  trait ComputeResourceUpdate extends js.Object {
    var allocationStrategy: js.UndefOr[CRUpdateAllocationStrategy]
    var bidPercentage: js.UndefOr[Int]
    var desiredvCpus: js.UndefOr[Int]
    var ec2Configuration: js.UndefOr[Ec2ConfigurationList]
    var ec2KeyPair: js.UndefOr[String]
    var imageId: js.UndefOr[String]
    var instanceRole: js.UndefOr[String]
    var instanceTypes: js.UndefOr[StringList]
    var launchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var maxvCpus: js.UndefOr[Int]
    var minvCpus: js.UndefOr[Int]
    var placementGroup: js.UndefOr[String]
    var securityGroupIds: js.UndefOr[StringList]
    var subnets: js.UndefOr[StringList]
    var tags: js.UndefOr[TagsMap]
    var `type`: js.UndefOr[CRType]
    var updateToLatestImageVersion: js.UndefOr[Boolean]
  }

  object ComputeResourceUpdate {
    @inline
    def apply(
        allocationStrategy: js.UndefOr[CRUpdateAllocationStrategy] = js.undefined,
        bidPercentage: js.UndefOr[Int] = js.undefined,
        desiredvCpus: js.UndefOr[Int] = js.undefined,
        ec2Configuration: js.UndefOr[Ec2ConfigurationList] = js.undefined,
        ec2KeyPair: js.UndefOr[String] = js.undefined,
        imageId: js.UndefOr[String] = js.undefined,
        instanceRole: js.UndefOr[String] = js.undefined,
        instanceTypes: js.UndefOr[StringList] = js.undefined,
        launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        maxvCpus: js.UndefOr[Int] = js.undefined,
        minvCpus: js.UndefOr[Int] = js.undefined,
        placementGroup: js.UndefOr[String] = js.undefined,
        securityGroupIds: js.UndefOr[StringList] = js.undefined,
        subnets: js.UndefOr[StringList] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        `type`: js.UndefOr[CRType] = js.undefined,
        updateToLatestImageVersion: js.UndefOr[Boolean] = js.undefined
    ): ComputeResourceUpdate = {
      val __obj = js.Dynamic.literal()
      allocationStrategy.foreach(__v => __obj.updateDynamic("allocationStrategy")(__v.asInstanceOf[js.Any]))
      bidPercentage.foreach(__v => __obj.updateDynamic("bidPercentage")(__v.asInstanceOf[js.Any]))
      desiredvCpus.foreach(__v => __obj.updateDynamic("desiredvCpus")(__v.asInstanceOf[js.Any]))
      ec2Configuration.foreach(__v => __obj.updateDynamic("ec2Configuration")(__v.asInstanceOf[js.Any]))
      ec2KeyPair.foreach(__v => __obj.updateDynamic("ec2KeyPair")(__v.asInstanceOf[js.Any]))
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      instanceRole.foreach(__v => __obj.updateDynamic("instanceRole")(__v.asInstanceOf[js.Any]))
      instanceTypes.foreach(__v => __obj.updateDynamic("instanceTypes")(__v.asInstanceOf[js.Any]))
      launchTemplate.foreach(__v => __obj.updateDynamic("launchTemplate")(__v.asInstanceOf[js.Any]))
      maxvCpus.foreach(__v => __obj.updateDynamic("maxvCpus")(__v.asInstanceOf[js.Any]))
      minvCpus.foreach(__v => __obj.updateDynamic("minvCpus")(__v.asInstanceOf[js.Any]))
      placementGroup.foreach(__v => __obj.updateDynamic("placementGroup")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      subnets.foreach(__v => __obj.updateDynamic("subnets")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      updateToLatestImageVersion.foreach(__v => __obj.updateDynamic("updateToLatestImageVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeResourceUpdate]
    }
  }

  /** An object that represents the details of a container that's part of a job.
    */
  @js.native
  trait ContainerDetail extends js.Object {
    var command: js.UndefOr[StringList]
    var containerInstanceArn: js.UndefOr[String]
    var environment: js.UndefOr[EnvironmentVariables]
    var executionRoleArn: js.UndefOr[String]
    var exitCode: js.UndefOr[Int]
    var fargatePlatformConfiguration: js.UndefOr[FargatePlatformConfiguration]
    var image: js.UndefOr[String]
    var instanceType: js.UndefOr[String]
    var jobRoleArn: js.UndefOr[String]
    var linuxParameters: js.UndefOr[LinuxParameters]
    var logConfiguration: js.UndefOr[LogConfiguration]
    var logStreamName: js.UndefOr[String]
    var memory: js.UndefOr[Int]
    var mountPoints: js.UndefOr[MountPoints]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var networkInterfaces: js.UndefOr[NetworkInterfaceList]
    var privileged: js.UndefOr[Boolean]
    var readonlyRootFilesystem: js.UndefOr[Boolean]
    var reason: js.UndefOr[String]
    var resourceRequirements: js.UndefOr[ResourceRequirements]
    var secrets: js.UndefOr[SecretList]
    var taskArn: js.UndefOr[String]
    var ulimits: js.UndefOr[Ulimits]
    var user: js.UndefOr[String]
    var vcpus: js.UndefOr[Int]
    var volumes: js.UndefOr[Volumes]
  }

  object ContainerDetail {
    @inline
    def apply(
        command: js.UndefOr[StringList] = js.undefined,
        containerInstanceArn: js.UndefOr[String] = js.undefined,
        environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        executionRoleArn: js.UndefOr[String] = js.undefined,
        exitCode: js.UndefOr[Int] = js.undefined,
        fargatePlatformConfiguration: js.UndefOr[FargatePlatformConfiguration] = js.undefined,
        image: js.UndefOr[String] = js.undefined,
        instanceType: js.UndefOr[String] = js.undefined,
        jobRoleArn: js.UndefOr[String] = js.undefined,
        linuxParameters: js.UndefOr[LinuxParameters] = js.undefined,
        logConfiguration: js.UndefOr[LogConfiguration] = js.undefined,
        logStreamName: js.UndefOr[String] = js.undefined,
        memory: js.UndefOr[Int] = js.undefined,
        mountPoints: js.UndefOr[MountPoints] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined,
        privileged: js.UndefOr[Boolean] = js.undefined,
        readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined,
        secrets: js.UndefOr[SecretList] = js.undefined,
        taskArn: js.UndefOr[String] = js.undefined,
        ulimits: js.UndefOr[Ulimits] = js.undefined,
        user: js.UndefOr[String] = js.undefined,
        vcpus: js.UndefOr[Int] = js.undefined,
        volumes: js.UndefOr[Volumes] = js.undefined
    ): ContainerDetail = {
      val __obj = js.Dynamic.literal()
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      containerInstanceArn.foreach(__v => __obj.updateDynamic("containerInstanceArn")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      executionRoleArn.foreach(__v => __obj.updateDynamic("executionRoleArn")(__v.asInstanceOf[js.Any]))
      exitCode.foreach(__v => __obj.updateDynamic("exitCode")(__v.asInstanceOf[js.Any]))
      fargatePlatformConfiguration.foreach(__v => __obj.updateDynamic("fargatePlatformConfiguration")(__v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      jobRoleArn.foreach(__v => __obj.updateDynamic("jobRoleArn")(__v.asInstanceOf[js.Any]))
      linuxParameters.foreach(__v => __obj.updateDynamic("linuxParameters")(__v.asInstanceOf[js.Any]))
      logConfiguration.foreach(__v => __obj.updateDynamic("logConfiguration")(__v.asInstanceOf[js.Any]))
      logStreamName.foreach(__v => __obj.updateDynamic("logStreamName")(__v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.updateDynamic("memory")(__v.asInstanceOf[js.Any]))
      mountPoints.foreach(__v => __obj.updateDynamic("mountPoints")(__v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.updateDynamic("networkConfiguration")(__v.asInstanceOf[js.Any]))
      networkInterfaces.foreach(__v => __obj.updateDynamic("networkInterfaces")(__v.asInstanceOf[js.Any]))
      privileged.foreach(__v => __obj.updateDynamic("privileged")(__v.asInstanceOf[js.Any]))
      readonlyRootFilesystem.foreach(__v => __obj.updateDynamic("readonlyRootFilesystem")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      resourceRequirements.foreach(__v => __obj.updateDynamic("resourceRequirements")(__v.asInstanceOf[js.Any]))
      secrets.foreach(__v => __obj.updateDynamic("secrets")(__v.asInstanceOf[js.Any]))
      taskArn.foreach(__v => __obj.updateDynamic("taskArn")(__v.asInstanceOf[js.Any]))
      ulimits.foreach(__v => __obj.updateDynamic("ulimits")(__v.asInstanceOf[js.Any]))
      user.foreach(__v => __obj.updateDynamic("user")(__v.asInstanceOf[js.Any]))
      vcpus.foreach(__v => __obj.updateDynamic("vcpus")(__v.asInstanceOf[js.Any]))
      volumes.foreach(__v => __obj.updateDynamic("volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDetail]
    }
  }

  /** The overrides that should be sent to a container.
    */
  @js.native
  trait ContainerOverrides extends js.Object {
    var command: js.UndefOr[StringList]
    var environment: js.UndefOr[EnvironmentVariables]
    var instanceType: js.UndefOr[String]
    var memory: js.UndefOr[Int]
    var resourceRequirements: js.UndefOr[ResourceRequirements]
    var vcpus: js.UndefOr[Int]
  }

  object ContainerOverrides {
    @inline
    def apply(
        command: js.UndefOr[StringList] = js.undefined,
        environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        instanceType: js.UndefOr[String] = js.undefined,
        memory: js.UndefOr[Int] = js.undefined,
        resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined,
        vcpus: js.UndefOr[Int] = js.undefined
    ): ContainerOverrides = {
      val __obj = js.Dynamic.literal()
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.updateDynamic("memory")(__v.asInstanceOf[js.Any]))
      resourceRequirements.foreach(__v => __obj.updateDynamic("resourceRequirements")(__v.asInstanceOf[js.Any]))
      vcpus.foreach(__v => __obj.updateDynamic("vcpus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerOverrides]
    }
  }

  /** Container properties are used for Amazon ECS based job definitions. These properties to describe the container that's launched as part of a job.
    */
  @js.native
  trait ContainerProperties extends js.Object {
    var command: js.UndefOr[StringList]
    var environment: js.UndefOr[EnvironmentVariables]
    var executionRoleArn: js.UndefOr[String]
    var fargatePlatformConfiguration: js.UndefOr[FargatePlatformConfiguration]
    var image: js.UndefOr[String]
    var instanceType: js.UndefOr[String]
    var jobRoleArn: js.UndefOr[String]
    var linuxParameters: js.UndefOr[LinuxParameters]
    var logConfiguration: js.UndefOr[LogConfiguration]
    var memory: js.UndefOr[Int]
    var mountPoints: js.UndefOr[MountPoints]
    var networkConfiguration: js.UndefOr[NetworkConfiguration]
    var privileged: js.UndefOr[Boolean]
    var readonlyRootFilesystem: js.UndefOr[Boolean]
    var resourceRequirements: js.UndefOr[ResourceRequirements]
    var secrets: js.UndefOr[SecretList]
    var ulimits: js.UndefOr[Ulimits]
    var user: js.UndefOr[String]
    var vcpus: js.UndefOr[Int]
    var volumes: js.UndefOr[Volumes]
  }

  object ContainerProperties {
    @inline
    def apply(
        command: js.UndefOr[StringList] = js.undefined,
        environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        executionRoleArn: js.UndefOr[String] = js.undefined,
        fargatePlatformConfiguration: js.UndefOr[FargatePlatformConfiguration] = js.undefined,
        image: js.UndefOr[String] = js.undefined,
        instanceType: js.UndefOr[String] = js.undefined,
        jobRoleArn: js.UndefOr[String] = js.undefined,
        linuxParameters: js.UndefOr[LinuxParameters] = js.undefined,
        logConfiguration: js.UndefOr[LogConfiguration] = js.undefined,
        memory: js.UndefOr[Int] = js.undefined,
        mountPoints: js.UndefOr[MountPoints] = js.undefined,
        networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined,
        privileged: js.UndefOr[Boolean] = js.undefined,
        readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
        resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined,
        secrets: js.UndefOr[SecretList] = js.undefined,
        ulimits: js.UndefOr[Ulimits] = js.undefined,
        user: js.UndefOr[String] = js.undefined,
        vcpus: js.UndefOr[Int] = js.undefined,
        volumes: js.UndefOr[Volumes] = js.undefined
    ): ContainerProperties = {
      val __obj = js.Dynamic.literal()
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      executionRoleArn.foreach(__v => __obj.updateDynamic("executionRoleArn")(__v.asInstanceOf[js.Any]))
      fargatePlatformConfiguration.foreach(__v => __obj.updateDynamic("fargatePlatformConfiguration")(__v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      jobRoleArn.foreach(__v => __obj.updateDynamic("jobRoleArn")(__v.asInstanceOf[js.Any]))
      linuxParameters.foreach(__v => __obj.updateDynamic("linuxParameters")(__v.asInstanceOf[js.Any]))
      logConfiguration.foreach(__v => __obj.updateDynamic("logConfiguration")(__v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.updateDynamic("memory")(__v.asInstanceOf[js.Any]))
      mountPoints.foreach(__v => __obj.updateDynamic("mountPoints")(__v.asInstanceOf[js.Any]))
      networkConfiguration.foreach(__v => __obj.updateDynamic("networkConfiguration")(__v.asInstanceOf[js.Any]))
      privileged.foreach(__v => __obj.updateDynamic("privileged")(__v.asInstanceOf[js.Any]))
      readonlyRootFilesystem.foreach(__v => __obj.updateDynamic("readonlyRootFilesystem")(__v.asInstanceOf[js.Any]))
      resourceRequirements.foreach(__v => __obj.updateDynamic("resourceRequirements")(__v.asInstanceOf[js.Any]))
      secrets.foreach(__v => __obj.updateDynamic("secrets")(__v.asInstanceOf[js.Any]))
      ulimits.foreach(__v => __obj.updateDynamic("ulimits")(__v.asInstanceOf[js.Any]))
      user.foreach(__v => __obj.updateDynamic("user")(__v.asInstanceOf[js.Any]))
      vcpus.foreach(__v => __obj.updateDynamic("vcpus")(__v.asInstanceOf[js.Any]))
      volumes.foreach(__v => __obj.updateDynamic("volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerProperties]
    }
  }

  /** An object that represents summary details of a container within a job.
    */
  @js.native
  trait ContainerSummary extends js.Object {
    var exitCode: js.UndefOr[Int]
    var reason: js.UndefOr[String]
  }

  object ContainerSummary {
    @inline
    def apply(
        exitCode: js.UndefOr[Int] = js.undefined,
        reason: js.UndefOr[String] = js.undefined
    ): ContainerSummary = {
      val __obj = js.Dynamic.literal()
      exitCode.foreach(__v => __obj.updateDynamic("exitCode")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerSummary]
    }
  }

  /** Contains the parameters for <code>CreateComputeEnvironment</code>.
    */
  @js.native
  trait CreateComputeEnvironmentRequest extends js.Object {
    var computeEnvironmentName: String
    var `type`: CEType
    var computeResources: js.UndefOr[ComputeResource]
    var eksConfiguration: js.UndefOr[EksConfiguration]
    var serviceRole: js.UndefOr[String]
    var state: js.UndefOr[CEState]
    var tags: js.UndefOr[TagrisTagsMap]
    var unmanagedvCpus: js.UndefOr[Int]
  }

  object CreateComputeEnvironmentRequest {
    @inline
    def apply(
        computeEnvironmentName: String,
        `type`: CEType,
        computeResources: js.UndefOr[ComputeResource] = js.undefined,
        eksConfiguration: js.UndefOr[EksConfiguration] = js.undefined,
        serviceRole: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[CEState] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined,
        unmanagedvCpus: js.UndefOr[Int] = js.undefined
    ): CreateComputeEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "computeEnvironmentName" -> computeEnvironmentName.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      computeResources.foreach(__v => __obj.updateDynamic("computeResources")(__v.asInstanceOf[js.Any]))
      eksConfiguration.foreach(__v => __obj.updateDynamic("eksConfiguration")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      unmanagedvCpus.foreach(__v => __obj.updateDynamic("unmanagedvCpus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComputeEnvironmentRequest]
    }
  }

  @js.native
  trait CreateComputeEnvironmentResponse extends js.Object {
    var computeEnvironmentArn: js.UndefOr[String]
    var computeEnvironmentName: js.UndefOr[String]
  }

  object CreateComputeEnvironmentResponse {
    @inline
    def apply(
        computeEnvironmentArn: js.UndefOr[String] = js.undefined,
        computeEnvironmentName: js.UndefOr[String] = js.undefined
    ): CreateComputeEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      computeEnvironmentArn.foreach(__v => __obj.updateDynamic("computeEnvironmentArn")(__v.asInstanceOf[js.Any]))
      computeEnvironmentName.foreach(__v => __obj.updateDynamic("computeEnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComputeEnvironmentResponse]
    }
  }

  /** Contains the parameters for <code>CreateJobQueue</code>.
    */
  @js.native
  trait CreateJobQueueRequest extends js.Object {
    var computeEnvironmentOrder: ComputeEnvironmentOrders
    var jobQueueName: String
    var priority: Int
    var schedulingPolicyArn: js.UndefOr[String]
    var state: js.UndefOr[JQState]
    var tags: js.UndefOr[TagrisTagsMap]
  }

  object CreateJobQueueRequest {
    @inline
    def apply(
        computeEnvironmentOrder: ComputeEnvironmentOrders,
        jobQueueName: String,
        priority: Int,
        schedulingPolicyArn: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[JQState] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined
    ): CreateJobQueueRequest = {
      val __obj = js.Dynamic.literal(
        "computeEnvironmentOrder" -> computeEnvironmentOrder.asInstanceOf[js.Any],
        "jobQueueName" -> jobQueueName.asInstanceOf[js.Any],
        "priority" -> priority.asInstanceOf[js.Any]
      )

      schedulingPolicyArn.foreach(__v => __obj.updateDynamic("schedulingPolicyArn")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobQueueRequest]
    }
  }

  @js.native
  trait CreateJobQueueResponse extends js.Object {
    var jobQueueArn: String
    var jobQueueName: String
  }

  object CreateJobQueueResponse {
    @inline
    def apply(
        jobQueueArn: String,
        jobQueueName: String
    ): CreateJobQueueResponse = {
      val __obj = js.Dynamic.literal(
        "jobQueueArn" -> jobQueueArn.asInstanceOf[js.Any],
        "jobQueueName" -> jobQueueName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateJobQueueResponse]
    }
  }

  /** Contains the parameters for <code>CreateSchedulingPolicy</code>.
    */
  @js.native
  trait CreateSchedulingPolicyRequest extends js.Object {
    var name: String
    var fairsharePolicy: js.UndefOr[FairsharePolicy]
    var tags: js.UndefOr[TagrisTagsMap]
  }

  object CreateSchedulingPolicyRequest {
    @inline
    def apply(
        name: String,
        fairsharePolicy: js.UndefOr[FairsharePolicy] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined
    ): CreateSchedulingPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      fairsharePolicy.foreach(__v => __obj.updateDynamic("fairsharePolicy")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSchedulingPolicyRequest]
    }
  }

  @js.native
  trait CreateSchedulingPolicyResponse extends js.Object {
    var arn: String
    var name: String
  }

  object CreateSchedulingPolicyResponse {
    @inline
    def apply(
        arn: String,
        name: String
    ): CreateSchedulingPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSchedulingPolicyResponse]
    }
  }

  /** Contains the parameters for <code>DeleteComputeEnvironment</code>.
    */
  @js.native
  trait DeleteComputeEnvironmentRequest extends js.Object {
    var computeEnvironment: String
  }

  object DeleteComputeEnvironmentRequest {
    @inline
    def apply(
        computeEnvironment: String
    ): DeleteComputeEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "computeEnvironment" -> computeEnvironment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteComputeEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteComputeEnvironmentResponse extends js.Object

  object DeleteComputeEnvironmentResponse {
    @inline
    def apply(): DeleteComputeEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteComputeEnvironmentResponse]
    }
  }

  /** Contains the parameters for <code>DeleteJobQueue</code>.
    */
  @js.native
  trait DeleteJobQueueRequest extends js.Object {
    var jobQueue: String
  }

  object DeleteJobQueueRequest {
    @inline
    def apply(
        jobQueue: String
    ): DeleteJobQueueRequest = {
      val __obj = js.Dynamic.literal(
        "jobQueue" -> jobQueue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteJobQueueRequest]
    }
  }

  @js.native
  trait DeleteJobQueueResponse extends js.Object

  object DeleteJobQueueResponse {
    @inline
    def apply(): DeleteJobQueueResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteJobQueueResponse]
    }
  }

  /** Contains the parameters for <code>DeleteSchedulingPolicy</code>.
    */
  @js.native
  trait DeleteSchedulingPolicyRequest extends js.Object {
    var arn: String
  }

  object DeleteSchedulingPolicyRequest {
    @inline
    def apply(
        arn: String
    ): DeleteSchedulingPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSchedulingPolicyRequest]
    }
  }

  @js.native
  trait DeleteSchedulingPolicyResponse extends js.Object

  object DeleteSchedulingPolicyResponse {
    @inline
    def apply(): DeleteSchedulingPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSchedulingPolicyResponse]
    }
  }

  @js.native
  trait DeregisterJobDefinitionRequest extends js.Object {
    var jobDefinition: String
  }

  object DeregisterJobDefinitionRequest {
    @inline
    def apply(
        jobDefinition: String
    ): DeregisterJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "jobDefinition" -> jobDefinition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterJobDefinitionRequest]
    }
  }

  @js.native
  trait DeregisterJobDefinitionResponse extends js.Object

  object DeregisterJobDefinitionResponse {
    @inline
    def apply(): DeregisterJobDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterJobDefinitionResponse]
    }
  }

  /** Contains the parameters for <code>DescribeComputeEnvironments</code>.
    */
  @js.native
  trait DescribeComputeEnvironmentsRequest extends js.Object {
    var computeEnvironments: js.UndefOr[StringList]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object DescribeComputeEnvironmentsRequest {
    @inline
    def apply(
        computeEnvironments: js.UndefOr[StringList] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeComputeEnvironmentsRequest = {
      val __obj = js.Dynamic.literal()
      computeEnvironments.foreach(__v => __obj.updateDynamic("computeEnvironments")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComputeEnvironmentsRequest]
    }
  }

  @js.native
  trait DescribeComputeEnvironmentsResponse extends js.Object {
    var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeComputeEnvironmentsResponse {
    @inline
    def apply(
        computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeComputeEnvironmentsResponse = {
      val __obj = js.Dynamic.literal()
      computeEnvironments.foreach(__v => __obj.updateDynamic("computeEnvironments")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeComputeEnvironmentsResponse]
    }
  }

  /** Contains the parameters for <code>DescribeJobDefinitions</code>.
    */
  @js.native
  trait DescribeJobDefinitionsRequest extends js.Object {
    var jobDefinitionName: js.UndefOr[String]
    var jobDefinitions: js.UndefOr[StringList]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
    var status: js.UndefOr[String]
  }

  object DescribeJobDefinitionsRequest {
    @inline
    def apply(
        jobDefinitionName: js.UndefOr[String] = js.undefined,
        jobDefinitions: js.UndefOr[StringList] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[String] = js.undefined
    ): DescribeJobDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      jobDefinitionName.foreach(__v => __obj.updateDynamic("jobDefinitionName")(__v.asInstanceOf[js.Any]))
      jobDefinitions.foreach(__v => __obj.updateDynamic("jobDefinitions")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobDefinitionsRequest]
    }
  }

  @js.native
  trait DescribeJobDefinitionsResponse extends js.Object {
    var jobDefinitions: js.UndefOr[JobDefinitionList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeJobDefinitionsResponse {
    @inline
    def apply(
        jobDefinitions: js.UndefOr[JobDefinitionList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeJobDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      jobDefinitions.foreach(__v => __obj.updateDynamic("jobDefinitions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobDefinitionsResponse]
    }
  }

  /** Contains the parameters for <code>DescribeJobQueues</code>.
    */
  @js.native
  trait DescribeJobQueuesRequest extends js.Object {
    var jobQueues: js.UndefOr[StringList]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object DescribeJobQueuesRequest {
    @inline
    def apply(
        jobQueues: js.UndefOr[StringList] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeJobQueuesRequest = {
      val __obj = js.Dynamic.literal()
      jobQueues.foreach(__v => __obj.updateDynamic("jobQueues")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobQueuesRequest]
    }
  }

  @js.native
  trait DescribeJobQueuesResponse extends js.Object {
    var jobQueues: js.UndefOr[JobQueueDetailList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeJobQueuesResponse {
    @inline
    def apply(
        jobQueues: js.UndefOr[JobQueueDetailList] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): DescribeJobQueuesResponse = {
      val __obj = js.Dynamic.literal()
      jobQueues.foreach(__v => __obj.updateDynamic("jobQueues")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobQueuesResponse]
    }
  }

  /** Contains the parameters for <code>DescribeJobs</code>.
    */
  @js.native
  trait DescribeJobsRequest extends js.Object {
    var jobs: StringList
  }

  object DescribeJobsRequest {
    @inline
    def apply(
        jobs: StringList
    ): DescribeJobsRequest = {
      val __obj = js.Dynamic.literal(
        "jobs" -> jobs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeJobsRequest]
    }
  }

  @js.native
  trait DescribeJobsResponse extends js.Object {
    var jobs: js.UndefOr[JobDetailList]
  }

  object DescribeJobsResponse {
    @inline
    def apply(
        jobs: js.UndefOr[JobDetailList] = js.undefined
    ): DescribeJobsResponse = {
      val __obj = js.Dynamic.literal()
      jobs.foreach(__v => __obj.updateDynamic("jobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobsResponse]
    }
  }

  /** Contains the parameters for <code>DescribeSchedulingPolicies</code>.
    */
  @js.native
  trait DescribeSchedulingPoliciesRequest extends js.Object {
    var arns: StringList
  }

  object DescribeSchedulingPoliciesRequest {
    @inline
    def apply(
        arns: StringList
    ): DescribeSchedulingPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "arns" -> arns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSchedulingPoliciesRequest]
    }
  }

  @js.native
  trait DescribeSchedulingPoliciesResponse extends js.Object {
    var schedulingPolicies: js.UndefOr[SchedulingPolicyDetailList]
  }

  object DescribeSchedulingPoliciesResponse {
    @inline
    def apply(
        schedulingPolicies: js.UndefOr[SchedulingPolicyDetailList] = js.undefined
    ): DescribeSchedulingPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      schedulingPolicies.foreach(__v => __obj.updateDynamic("schedulingPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSchedulingPoliciesResponse]
    }
  }

  /** An object that represents a container instance host device.
    *
    * '''Note:'''This object isn't applicable to jobs that are running on Fargate resources and shouldn't be provided.
    */
  @js.native
  trait Device extends js.Object {
    var hostPath: String
    var containerPath: js.UndefOr[String]
    var permissions: js.UndefOr[DeviceCgroupPermissions]
  }

  object Device {
    @inline
    def apply(
        hostPath: String,
        containerPath: js.UndefOr[String] = js.undefined,
        permissions: js.UndefOr[DeviceCgroupPermissions] = js.undefined
    ): Device = {
      val __obj = js.Dynamic.literal(
        "hostPath" -> hostPath.asInstanceOf[js.Any]
      )

      containerPath.foreach(__v => __obj.updateDynamic("containerPath")(__v.asInstanceOf[js.Any]))
      permissions.foreach(__v => __obj.updateDynamic("permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  /** The authorization configuration details for the Amazon EFS file system.
    */
  @js.native
  trait EFSAuthorizationConfig extends js.Object {
    var accessPointId: js.UndefOr[String]
    var iam: js.UndefOr[EFSAuthorizationConfigIAM]
  }

  object EFSAuthorizationConfig {
    @inline
    def apply(
        accessPointId: js.UndefOr[String] = js.undefined,
        iam: js.UndefOr[EFSAuthorizationConfigIAM] = js.undefined
    ): EFSAuthorizationConfig = {
      val __obj = js.Dynamic.literal()
      accessPointId.foreach(__v => __obj.updateDynamic("accessPointId")(__v.asInstanceOf[js.Any]))
      iam.foreach(__v => __obj.updateDynamic("iam")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EFSAuthorizationConfig]
    }
  }

  /** This is used when you're using an Amazon Elastic File System file system for job storage. For more information, see [[https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html|Amazon EFS Volumes]] in the <i>Batch User Guide</i>.
    */
  @js.native
  trait EFSVolumeConfiguration extends js.Object {
    var fileSystemId: String
    var authorizationConfig: js.UndefOr[EFSAuthorizationConfig]
    var rootDirectory: js.UndefOr[String]
    var transitEncryption: js.UndefOr[EFSTransitEncryption]
    var transitEncryptionPort: js.UndefOr[Int]
  }

  object EFSVolumeConfiguration {
    @inline
    def apply(
        fileSystemId: String,
        authorizationConfig: js.UndefOr[EFSAuthorizationConfig] = js.undefined,
        rootDirectory: js.UndefOr[String] = js.undefined,
        transitEncryption: js.UndefOr[EFSTransitEncryption] = js.undefined,
        transitEncryptionPort: js.UndefOr[Int] = js.undefined
    ): EFSVolumeConfiguration = {
      val __obj = js.Dynamic.literal(
        "fileSystemId" -> fileSystemId.asInstanceOf[js.Any]
      )

      authorizationConfig.foreach(__v => __obj.updateDynamic("authorizationConfig")(__v.asInstanceOf[js.Any]))
      rootDirectory.foreach(__v => __obj.updateDynamic("rootDirectory")(__v.asInstanceOf[js.Any]))
      transitEncryption.foreach(__v => __obj.updateDynamic("transitEncryption")(__v.asInstanceOf[js.Any]))
      transitEncryptionPort.foreach(__v => __obj.updateDynamic("transitEncryptionPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EFSVolumeConfiguration]
    }
  }

  /** Provides information used to select Amazon Machine Images (AMIs) for instances in the compute environment. If <code>Ec2Configuration</code> isn't specified, the default is <code>ECS_AL2</code> ([[https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami|Amazon Linux 2]]).
    *
    * '''Note:'''This object isn't applicable to jobs that are running on Fargate resources.
    */
  @js.native
  trait Ec2Configuration extends js.Object {
    var imageType: ImageType
    var imageIdOverride: js.UndefOr[ImageIdOverride]
    var imageKubernetesVersion: js.UndefOr[KubernetesVersion]
  }

  object Ec2Configuration {
    @inline
    def apply(
        imageType: ImageType,
        imageIdOverride: js.UndefOr[ImageIdOverride] = js.undefined,
        imageKubernetesVersion: js.UndefOr[KubernetesVersion] = js.undefined
    ): Ec2Configuration = {
      val __obj = js.Dynamic.literal(
        "imageType" -> imageType.asInstanceOf[js.Any]
      )

      imageIdOverride.foreach(__v => __obj.updateDynamic("imageIdOverride")(__v.asInstanceOf[js.Any]))
      imageKubernetesVersion.foreach(__v => __obj.updateDynamic("imageKubernetesVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ec2Configuration]
    }
  }

  /** An object that represents the details for an attempt for a job attempt that an Amazon EKS container runs.
    */
  @js.native
  trait EksAttemptContainerDetail extends js.Object {
    var exitCode: js.UndefOr[Int]
    var reason: js.UndefOr[String]
  }

  object EksAttemptContainerDetail {
    @inline
    def apply(
        exitCode: js.UndefOr[Int] = js.undefined,
        reason: js.UndefOr[String] = js.undefined
    ): EksAttemptContainerDetail = {
      val __obj = js.Dynamic.literal()
      exitCode.foreach(__v => __obj.updateDynamic("exitCode")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksAttemptContainerDetail]
    }
  }

  /** An object that represents the details of a job attempt for a job attempt by an Amazon EKS container.
    */
  @js.native
  trait EksAttemptDetail extends js.Object {
    var containers: js.UndefOr[EksAttemptContainerDetails]
    var nodeName: js.UndefOr[String]
    var podName: js.UndefOr[String]
    var startedAt: js.UndefOr[Double]
    var statusReason: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
  }

  object EksAttemptDetail {
    @inline
    def apply(
        containers: js.UndefOr[EksAttemptContainerDetails] = js.undefined,
        nodeName: js.UndefOr[String] = js.undefined,
        podName: js.UndefOr[String] = js.undefined,
        startedAt: js.UndefOr[Double] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        stoppedAt: js.UndefOr[Double] = js.undefined
    ): EksAttemptDetail = {
      val __obj = js.Dynamic.literal()
      containers.foreach(__v => __obj.updateDynamic("containers")(__v.asInstanceOf[js.Any]))
      nodeName.foreach(__v => __obj.updateDynamic("nodeName")(__v.asInstanceOf[js.Any]))
      podName.foreach(__v => __obj.updateDynamic("podName")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      stoppedAt.foreach(__v => __obj.updateDynamic("stoppedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksAttemptDetail]
    }
  }

  /** Configuration for the Amazon EKS cluster that supports the Batch compute environment. The cluster must exist before the compute environment can be created.
    */
  @js.native
  trait EksConfiguration extends js.Object {
    var eksClusterArn: String
    var kubernetesNamespace: String
  }

  object EksConfiguration {
    @inline
    def apply(
        eksClusterArn: String,
        kubernetesNamespace: String
    ): EksConfiguration = {
      val __obj = js.Dynamic.literal(
        "eksClusterArn" -> eksClusterArn.asInstanceOf[js.Any],
        "kubernetesNamespace" -> kubernetesNamespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EksConfiguration]
    }
  }

  /** EKS container properties are used in job definitions for Amazon EKS based job definitions to describe the properties for a container node in the pod that's launched as part of a job. This can't be specified for Amazon ECS based job definitions.
    */
  @js.native
  trait EksContainer extends js.Object {
    var image: String
    var args: js.UndefOr[StringList]
    var command: js.UndefOr[StringList]
    var env: js.UndefOr[EksContainerEnvironmentVariables]
    var imagePullPolicy: js.UndefOr[String]
    var name: js.UndefOr[String]
    var resources: js.UndefOr[EksContainerResourceRequirements]
    var securityContext: js.UndefOr[EksContainerSecurityContext]
    var volumeMounts: js.UndefOr[EksContainerVolumeMounts]
  }

  object EksContainer {
    @inline
    def apply(
        image: String,
        args: js.UndefOr[StringList] = js.undefined,
        command: js.UndefOr[StringList] = js.undefined,
        env: js.UndefOr[EksContainerEnvironmentVariables] = js.undefined,
        imagePullPolicy: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        resources: js.UndefOr[EksContainerResourceRequirements] = js.undefined,
        securityContext: js.UndefOr[EksContainerSecurityContext] = js.undefined,
        volumeMounts: js.UndefOr[EksContainerVolumeMounts] = js.undefined
    ): EksContainer = {
      val __obj = js.Dynamic.literal(
        "image" -> image.asInstanceOf[js.Any]
      )

      args.foreach(__v => __obj.updateDynamic("args")(__v.asInstanceOf[js.Any]))
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      env.foreach(__v => __obj.updateDynamic("env")(__v.asInstanceOf[js.Any]))
      imagePullPolicy.foreach(__v => __obj.updateDynamic("imagePullPolicy")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      securityContext.foreach(__v => __obj.updateDynamic("securityContext")(__v.asInstanceOf[js.Any]))
      volumeMounts.foreach(__v => __obj.updateDynamic("volumeMounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksContainer]
    }
  }

  /** The details for container properties that are returned by <code>DescribeJobs</code> for jobs that use Amazon EKS.
    */
  @js.native
  trait EksContainerDetail extends js.Object {
    var args: js.UndefOr[StringList]
    var command: js.UndefOr[StringList]
    var env: js.UndefOr[EksContainerEnvironmentVariables]
    var exitCode: js.UndefOr[Int]
    var image: js.UndefOr[String]
    var imagePullPolicy: js.UndefOr[String]
    var name: js.UndefOr[String]
    var reason: js.UndefOr[String]
    var resources: js.UndefOr[EksContainerResourceRequirements]
    var securityContext: js.UndefOr[EksContainerSecurityContext]
    var volumeMounts: js.UndefOr[EksContainerVolumeMounts]
  }

  object EksContainerDetail {
    @inline
    def apply(
        args: js.UndefOr[StringList] = js.undefined,
        command: js.UndefOr[StringList] = js.undefined,
        env: js.UndefOr[EksContainerEnvironmentVariables] = js.undefined,
        exitCode: js.UndefOr[Int] = js.undefined,
        image: js.UndefOr[String] = js.undefined,
        imagePullPolicy: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        resources: js.UndefOr[EksContainerResourceRequirements] = js.undefined,
        securityContext: js.UndefOr[EksContainerSecurityContext] = js.undefined,
        volumeMounts: js.UndefOr[EksContainerVolumeMounts] = js.undefined
    ): EksContainerDetail = {
      val __obj = js.Dynamic.literal()
      args.foreach(__v => __obj.updateDynamic("args")(__v.asInstanceOf[js.Any]))
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      env.foreach(__v => __obj.updateDynamic("env")(__v.asInstanceOf[js.Any]))
      exitCode.foreach(__v => __obj.updateDynamic("exitCode")(__v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      imagePullPolicy.foreach(__v => __obj.updateDynamic("imagePullPolicy")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      securityContext.foreach(__v => __obj.updateDynamic("securityContext")(__v.asInstanceOf[js.Any]))
      volumeMounts.foreach(__v => __obj.updateDynamic("volumeMounts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksContainerDetail]
    }
  }

  /** An environment variable.
    */
  @js.native
  trait EksContainerEnvironmentVariable extends js.Object {
    var name: String
    var value: js.UndefOr[String]
  }

  object EksContainerEnvironmentVariable {
    @inline
    def apply(
        name: String,
        value: js.UndefOr[String] = js.undefined
    ): EksContainerEnvironmentVariable = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksContainerEnvironmentVariable]
    }
  }

  /** Object representing any Kubernetes overrides to a job definition that's used in a <a>SubmitJob</a> API operation.
    */
  @js.native
  trait EksContainerOverride extends js.Object {
    var args: js.UndefOr[StringList]
    var command: js.UndefOr[StringList]
    var env: js.UndefOr[EksContainerEnvironmentVariables]
    var image: js.UndefOr[String]
    var resources: js.UndefOr[EksContainerResourceRequirements]
  }

  object EksContainerOverride {
    @inline
    def apply(
        args: js.UndefOr[StringList] = js.undefined,
        command: js.UndefOr[StringList] = js.undefined,
        env: js.UndefOr[EksContainerEnvironmentVariables] = js.undefined,
        image: js.UndefOr[String] = js.undefined,
        resources: js.UndefOr[EksContainerResourceRequirements] = js.undefined
    ): EksContainerOverride = {
      val __obj = js.Dynamic.literal()
      args.foreach(__v => __obj.updateDynamic("args")(__v.asInstanceOf[js.Any]))
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      env.foreach(__v => __obj.updateDynamic("env")(__v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksContainerOverride]
    }
  }

  /** The type and amount of resources to assign to a container. The supported resources include <code>memory</code>, <code>cpu</code>, and <code>nvidia.com/gpu</code>. For more information, see [[https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/|Resource management for pods and containers]] in the <i>Kubernetes documentation</i>.
    */
  @js.native
  trait EksContainerResourceRequirements extends js.Object {
    var limits: js.UndefOr[EksLimits]
    var requests: js.UndefOr[EksRequests]
  }

  object EksContainerResourceRequirements {
    @inline
    def apply(
        limits: js.UndefOr[EksLimits] = js.undefined,
        requests: js.UndefOr[EksRequests] = js.undefined
    ): EksContainerResourceRequirements = {
      val __obj = js.Dynamic.literal()
      limits.foreach(__v => __obj.updateDynamic("limits")(__v.asInstanceOf[js.Any]))
      requests.foreach(__v => __obj.updateDynamic("requests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksContainerResourceRequirements]
    }
  }

  /** The security context for a job. For more information, see [[https://kubernetes.io/docs/tasks/configure-pod-container/security-context/|Configure a security context for a pod or container]] in the <i>Kubernetes documentation</i>.
    */
  @js.native
  trait EksContainerSecurityContext extends js.Object {
    var privileged: js.UndefOr[Boolean]
    var readOnlyRootFilesystem: js.UndefOr[Boolean]
    var runAsGroup: js.UndefOr[Double]
    var runAsNonRoot: js.UndefOr[Boolean]
    var runAsUser: js.UndefOr[Double]
  }

  object EksContainerSecurityContext {
    @inline
    def apply(
        privileged: js.UndefOr[Boolean] = js.undefined,
        readOnlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
        runAsGroup: js.UndefOr[Double] = js.undefined,
        runAsNonRoot: js.UndefOr[Boolean] = js.undefined,
        runAsUser: js.UndefOr[Double] = js.undefined
    ): EksContainerSecurityContext = {
      val __obj = js.Dynamic.literal()
      privileged.foreach(__v => __obj.updateDynamic("privileged")(__v.asInstanceOf[js.Any]))
      readOnlyRootFilesystem.foreach(__v => __obj.updateDynamic("readOnlyRootFilesystem")(__v.asInstanceOf[js.Any]))
      runAsGroup.foreach(__v => __obj.updateDynamic("runAsGroup")(__v.asInstanceOf[js.Any]))
      runAsNonRoot.foreach(__v => __obj.updateDynamic("runAsNonRoot")(__v.asInstanceOf[js.Any]))
      runAsUser.foreach(__v => __obj.updateDynamic("runAsUser")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksContainerSecurityContext]
    }
  }

  /** The volume mounts for a container for an Amazon EKS job. For more information about volumes and volume mounts in Kubernetes, see [[https://kubernetes.io/docs/concepts/storage/volumes/|Volumes]] in the <i>Kubernetes documentation</i>.
    */
  @js.native
  trait EksContainerVolumeMount extends js.Object {
    var mountPath: js.UndefOr[String]
    var name: js.UndefOr[String]
    var readOnly: js.UndefOr[Boolean]
  }

  object EksContainerVolumeMount {
    @inline
    def apply(
        mountPath: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        readOnly: js.UndefOr[Boolean] = js.undefined
    ): EksContainerVolumeMount = {
      val __obj = js.Dynamic.literal()
      mountPath.foreach(__v => __obj.updateDynamic("mountPath")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      readOnly.foreach(__v => __obj.updateDynamic("readOnly")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksContainerVolumeMount]
    }
  }

  /** Specifies the configuration of a Kubernetes <code>emptyDir</code> volume. An <code>emptyDir</code> volume is first created when a pod is assigned to a node. It exists as long as that pod is running on that node. The <code>emptyDir</code> volume is initially empty. All containers in the pod can read and write the files in the <code>emptyDir</code> volume. However, the <code>emptyDir</code> volume can be mounted at the same or different paths in each container. When a pod is removed from a node for any reason, the data in the <code>emptyDir</code> is deleted permanently. For more information, see [[https://kubernetes.io/docs/concepts/storage/volumes/#emptydir|emptyDir]] in the <i>Kubernetes documentation</i>.
    */
  @js.native
  trait EksEmptyDir extends js.Object {
    var medium: js.UndefOr[String]
    var sizeLimit: js.UndefOr[Quantity]
  }

  object EksEmptyDir {
    @inline
    def apply(
        medium: js.UndefOr[String] = js.undefined,
        sizeLimit: js.UndefOr[Quantity] = js.undefined
    ): EksEmptyDir = {
      val __obj = js.Dynamic.literal()
      medium.foreach(__v => __obj.updateDynamic("medium")(__v.asInstanceOf[js.Any]))
      sizeLimit.foreach(__v => __obj.updateDynamic("sizeLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksEmptyDir]
    }
  }

  /** Specifies the configuration of a Kubernetes <code>hostPath</code> volume. A <code>hostPath</code> volume mounts an existing file or directory from the host node's filesystem into your pod. For more information, see [[https://kubernetes.io/docs/concepts/storage/volumes/#hostpath|hostPath]] in the <i>Kubernetes documentation</i>.
    */
  @js.native
  trait EksHostPath extends js.Object {
    var path: js.UndefOr[String]
  }

  object EksHostPath {
    @inline
    def apply(
        path: js.UndefOr[String] = js.undefined
    ): EksHostPath = {
      val __obj = js.Dynamic.literal()
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksHostPath]
    }
  }

  /** The properties for the pod.
    */
  @js.native
  trait EksPodProperties extends js.Object {
    var containers: js.UndefOr[EksContainers]
    var dnsPolicy: js.UndefOr[String]
    var hostNetwork: js.UndefOr[Boolean]
    var serviceAccountName: js.UndefOr[String]
    var volumes: js.UndefOr[EksVolumes]
  }

  object EksPodProperties {
    @inline
    def apply(
        containers: js.UndefOr[EksContainers] = js.undefined,
        dnsPolicy: js.UndefOr[String] = js.undefined,
        hostNetwork: js.UndefOr[Boolean] = js.undefined,
        serviceAccountName: js.UndefOr[String] = js.undefined,
        volumes: js.UndefOr[EksVolumes] = js.undefined
    ): EksPodProperties = {
      val __obj = js.Dynamic.literal()
      containers.foreach(__v => __obj.updateDynamic("containers")(__v.asInstanceOf[js.Any]))
      dnsPolicy.foreach(__v => __obj.updateDynamic("dnsPolicy")(__v.asInstanceOf[js.Any]))
      hostNetwork.foreach(__v => __obj.updateDynamic("hostNetwork")(__v.asInstanceOf[js.Any]))
      serviceAccountName.foreach(__v => __obj.updateDynamic("serviceAccountName")(__v.asInstanceOf[js.Any]))
      volumes.foreach(__v => __obj.updateDynamic("volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksPodProperties]
    }
  }

  /** The details for the pod.
    */
  @js.native
  trait EksPodPropertiesDetail extends js.Object {
    var containers: js.UndefOr[EksContainerDetails]
    var dnsPolicy: js.UndefOr[String]
    var hostNetwork: js.UndefOr[Boolean]
    var nodeName: js.UndefOr[String]
    var podName: js.UndefOr[String]
    var serviceAccountName: js.UndefOr[String]
    var volumes: js.UndefOr[EksVolumes]
  }

  object EksPodPropertiesDetail {
    @inline
    def apply(
        containers: js.UndefOr[EksContainerDetails] = js.undefined,
        dnsPolicy: js.UndefOr[String] = js.undefined,
        hostNetwork: js.UndefOr[Boolean] = js.undefined,
        nodeName: js.UndefOr[String] = js.undefined,
        podName: js.UndefOr[String] = js.undefined,
        serviceAccountName: js.UndefOr[String] = js.undefined,
        volumes: js.UndefOr[EksVolumes] = js.undefined
    ): EksPodPropertiesDetail = {
      val __obj = js.Dynamic.literal()
      containers.foreach(__v => __obj.updateDynamic("containers")(__v.asInstanceOf[js.Any]))
      dnsPolicy.foreach(__v => __obj.updateDynamic("dnsPolicy")(__v.asInstanceOf[js.Any]))
      hostNetwork.foreach(__v => __obj.updateDynamic("hostNetwork")(__v.asInstanceOf[js.Any]))
      nodeName.foreach(__v => __obj.updateDynamic("nodeName")(__v.asInstanceOf[js.Any]))
      podName.foreach(__v => __obj.updateDynamic("podName")(__v.asInstanceOf[js.Any]))
      serviceAccountName.foreach(__v => __obj.updateDynamic("serviceAccountName")(__v.asInstanceOf[js.Any]))
      volumes.foreach(__v => __obj.updateDynamic("volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksPodPropertiesDetail]
    }
  }

  /** An object that contains overrides for the Kubernetes pod properties of a job.
    */
  @js.native
  trait EksPodPropertiesOverride extends js.Object {
    var containers: js.UndefOr[EksContainerOverrideList]
  }

  object EksPodPropertiesOverride {
    @inline
    def apply(
        containers: js.UndefOr[EksContainerOverrideList] = js.undefined
    ): EksPodPropertiesOverride = {
      val __obj = js.Dynamic.literal()
      containers.foreach(__v => __obj.updateDynamic("containers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksPodPropertiesOverride]
    }
  }

  /** An object that contains the properties for the Kubernetes resources of a job.
    */
  @js.native
  trait EksProperties extends js.Object {
    var podProperties: js.UndefOr[EksPodProperties]
  }

  object EksProperties {
    @inline
    def apply(
        podProperties: js.UndefOr[EksPodProperties] = js.undefined
    ): EksProperties = {
      val __obj = js.Dynamic.literal()
      podProperties.foreach(__v => __obj.updateDynamic("podProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksProperties]
    }
  }

  /** An object that contains the details for the Kubernetes resources of a job.
    */
  @js.native
  trait EksPropertiesDetail extends js.Object {
    var podProperties: js.UndefOr[EksPodPropertiesDetail]
  }

  object EksPropertiesDetail {
    @inline
    def apply(
        podProperties: js.UndefOr[EksPodPropertiesDetail] = js.undefined
    ): EksPropertiesDetail = {
      val __obj = js.Dynamic.literal()
      podProperties.foreach(__v => __obj.updateDynamic("podProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksPropertiesDetail]
    }
  }

  /** An object that contains overrides for the Kubernetes resources of a job.
    */
  @js.native
  trait EksPropertiesOverride extends js.Object {
    var podProperties: js.UndefOr[EksPodPropertiesOverride]
  }

  object EksPropertiesOverride {
    @inline
    def apply(
        podProperties: js.UndefOr[EksPodPropertiesOverride] = js.undefined
    ): EksPropertiesOverride = {
      val __obj = js.Dynamic.literal()
      podProperties.foreach(__v => __obj.updateDynamic("podProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksPropertiesOverride]
    }
  }

  /** Specifies the configuration of a Kubernetes <code>secret</code> volume. For more information, see [[https://kubernetes.io/docs/concepts/storage/volumes/#secret|secret]] in the <i>Kubernetes documentation</i>.
    */
  @js.native
  trait EksSecret extends js.Object {
    var secretName: String
    var optional: js.UndefOr[Boolean]
  }

  object EksSecret {
    @inline
    def apply(
        secretName: String,
        optional: js.UndefOr[Boolean] = js.undefined
    ): EksSecret = {
      val __obj = js.Dynamic.literal(
        "secretName" -> secretName.asInstanceOf[js.Any]
      )

      optional.foreach(__v => __obj.updateDynamic("optional")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksSecret]
    }
  }

  /** Specifies an Amazon EKS volume for a job definition.
    */
  @js.native
  trait EksVolume extends js.Object {
    var name: String
    var emptyDir: js.UndefOr[EksEmptyDir]
    var hostPath: js.UndefOr[EksHostPath]
    var secret: js.UndefOr[EksSecret]
  }

  object EksVolume {
    @inline
    def apply(
        name: String,
        emptyDir: js.UndefOr[EksEmptyDir] = js.undefined,
        hostPath: js.UndefOr[EksHostPath] = js.undefined,
        secret: js.UndefOr[EksSecret] = js.undefined
    ): EksVolume = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      emptyDir.foreach(__v => __obj.updateDynamic("emptyDir")(__v.asInstanceOf[js.Any]))
      hostPath.foreach(__v => __obj.updateDynamic("hostPath")(__v.asInstanceOf[js.Any]))
      secret.foreach(__v => __obj.updateDynamic("secret")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EksVolume]
    }
  }

  /** Specifies an array of up to 5 conditions to be met, and an action to take (<code>RETRY</code> or <code>EXIT</code>) if all conditions are met. If none of the <code>EvaluateOnExit</code> conditions in a <code>RetryStrategy</code> match, then the job is retried.
    */
  @js.native
  trait EvaluateOnExit extends js.Object {
    var action: RetryAction
    var onExitCode: js.UndefOr[String]
    var onReason: js.UndefOr[String]
    var onStatusReason: js.UndefOr[String]
  }

  object EvaluateOnExit {
    @inline
    def apply(
        action: RetryAction,
        onExitCode: js.UndefOr[String] = js.undefined,
        onReason: js.UndefOr[String] = js.undefined,
        onStatusReason: js.UndefOr[String] = js.undefined
    ): EvaluateOnExit = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any]
      )

      onExitCode.foreach(__v => __obj.updateDynamic("onExitCode")(__v.asInstanceOf[js.Any]))
      onReason.foreach(__v => __obj.updateDynamic("onReason")(__v.asInstanceOf[js.Any]))
      onStatusReason.foreach(__v => __obj.updateDynamic("onStatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EvaluateOnExit]
    }
  }

  /** The fair share policy for a scheduling policy.
    */
  @js.native
  trait FairsharePolicy extends js.Object {
    var computeReservation: js.UndefOr[Int]
    var shareDecaySeconds: js.UndefOr[Int]
    var shareDistribution: js.UndefOr[ShareAttributesList]
  }

  object FairsharePolicy {
    @inline
    def apply(
        computeReservation: js.UndefOr[Int] = js.undefined,
        shareDecaySeconds: js.UndefOr[Int] = js.undefined,
        shareDistribution: js.UndefOr[ShareAttributesList] = js.undefined
    ): FairsharePolicy = {
      val __obj = js.Dynamic.literal()
      computeReservation.foreach(__v => __obj.updateDynamic("computeReservation")(__v.asInstanceOf[js.Any]))
      shareDecaySeconds.foreach(__v => __obj.updateDynamic("shareDecaySeconds")(__v.asInstanceOf[js.Any]))
      shareDistribution.foreach(__v => __obj.updateDynamic("shareDistribution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FairsharePolicy]
    }
  }

  /** The platform configuration for jobs that are running on Fargate resources. Jobs that run on EC2 resources must not specify this parameter.
    */
  @js.native
  trait FargatePlatformConfiguration extends js.Object {
    var platformVersion: js.UndefOr[String]
  }

  object FargatePlatformConfiguration {
    @inline
    def apply(
        platformVersion: js.UndefOr[String] = js.undefined
    ): FargatePlatformConfiguration = {
      val __obj = js.Dynamic.literal()
      platformVersion.foreach(__v => __obj.updateDynamic("platformVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FargatePlatformConfiguration]
    }
  }

  /** Determine whether your data volume persists on the host container instance and where it's stored. If this parameter is empty, then the Docker daemon assigns a host path for your data volume. However, the data isn't guaranteed to persist after the containers that are associated with it stop running.
    */
  @js.native
  trait Host extends js.Object {
    var sourcePath: js.UndefOr[String]
  }

  object Host {
    @inline
    def apply(
        sourcePath: js.UndefOr[String] = js.undefined
    ): Host = {
      val __obj = js.Dynamic.literal()
      sourcePath.foreach(__v => __obj.updateDynamic("sourcePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Host]
    }
  }

  /** An object that represents an Batch job definition.
    */
  @js.native
  trait JobDefinition extends js.Object {
    var jobDefinitionArn: String
    var jobDefinitionName: String
    var revision: Int
    var `type`: String
    var containerOrchestrationType: js.UndefOr[OrchestrationType]
    var containerProperties: js.UndefOr[ContainerProperties]
    var eksProperties: js.UndefOr[EksProperties]
    var nodeProperties: js.UndefOr[NodeProperties]
    var parameters: js.UndefOr[ParametersMap]
    var platformCapabilities: js.UndefOr[PlatformCapabilityList]
    var propagateTags: js.UndefOr[Boolean]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var schedulingPriority: js.UndefOr[Int]
    var status: js.UndefOr[String]
    var tags: js.UndefOr[TagrisTagsMap]
    var timeout: js.UndefOr[JobTimeout]
  }

  object JobDefinition {
    @inline
    def apply(
        jobDefinitionArn: String,
        jobDefinitionName: String,
        revision: Int,
        `type`: String,
        containerOrchestrationType: js.UndefOr[OrchestrationType] = js.undefined,
        containerProperties: js.UndefOr[ContainerProperties] = js.undefined,
        eksProperties: js.UndefOr[EksProperties] = js.undefined,
        nodeProperties: js.UndefOr[NodeProperties] = js.undefined,
        parameters: js.UndefOr[ParametersMap] = js.undefined,
        platformCapabilities: js.UndefOr[PlatformCapabilityList] = js.undefined,
        propagateTags: js.UndefOr[Boolean] = js.undefined,
        retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
        schedulingPriority: js.UndefOr[Int] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined,
        timeout: js.UndefOr[JobTimeout] = js.undefined
    ): JobDefinition = {
      val __obj = js.Dynamic.literal(
        "jobDefinitionArn" -> jobDefinitionArn.asInstanceOf[js.Any],
        "jobDefinitionName" -> jobDefinitionName.asInstanceOf[js.Any],
        "revision" -> revision.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      containerOrchestrationType.foreach(__v => __obj.updateDynamic("containerOrchestrationType")(__v.asInstanceOf[js.Any]))
      containerProperties.foreach(__v => __obj.updateDynamic("containerProperties")(__v.asInstanceOf[js.Any]))
      eksProperties.foreach(__v => __obj.updateDynamic("eksProperties")(__v.asInstanceOf[js.Any]))
      nodeProperties.foreach(__v => __obj.updateDynamic("nodeProperties")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      platformCapabilities.foreach(__v => __obj.updateDynamic("platformCapabilities")(__v.asInstanceOf[js.Any]))
      propagateTags.foreach(__v => __obj.updateDynamic("propagateTags")(__v.asInstanceOf[js.Any]))
      retryStrategy.foreach(__v => __obj.updateDynamic("retryStrategy")(__v.asInstanceOf[js.Any]))
      schedulingPriority.foreach(__v => __obj.updateDynamic("schedulingPriority")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDefinition]
    }
  }

  /** An object that represents an Batch job dependency.
    */
  @js.native
  trait JobDependency extends js.Object {
    var jobId: js.UndefOr[String]
    var `type`: js.UndefOr[ArrayJobDependency]
  }

  object JobDependency {
    @inline
    def apply(
        jobId: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[ArrayJobDependency] = js.undefined
    ): JobDependency = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDependency]
    }
  }

  /** An object that represents an Batch job.
    */
  @js.native
  trait JobDetail extends js.Object {
    var jobDefinition: String
    var jobId: String
    var jobName: String
    var jobQueue: String
    var startedAt: Double
    var status: JobStatus
    var arrayProperties: js.UndefOr[ArrayPropertiesDetail]
    var attempts: js.UndefOr[AttemptDetails]
    var container: js.UndefOr[ContainerDetail]
    var createdAt: js.UndefOr[Double]
    var dependsOn: js.UndefOr[JobDependencyList]
    var eksAttempts: js.UndefOr[EksAttemptDetails]
    var eksProperties: js.UndefOr[EksPropertiesDetail]
    var jobArn: js.UndefOr[String]
    var nodeDetails: js.UndefOr[NodeDetails]
    var nodeProperties: js.UndefOr[NodeProperties]
    var parameters: js.UndefOr[ParametersMap]
    var platformCapabilities: js.UndefOr[PlatformCapabilityList]
    var propagateTags: js.UndefOr[Boolean]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var schedulingPriority: js.UndefOr[Int]
    var shareIdentifier: js.UndefOr[String]
    var statusReason: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
    var tags: js.UndefOr[TagrisTagsMap]
    var timeout: js.UndefOr[JobTimeout]
  }

  object JobDetail {
    @inline
    def apply(
        jobDefinition: String,
        jobId: String,
        jobName: String,
        jobQueue: String,
        startedAt: Double,
        status: JobStatus,
        arrayProperties: js.UndefOr[ArrayPropertiesDetail] = js.undefined,
        attempts: js.UndefOr[AttemptDetails] = js.undefined,
        container: js.UndefOr[ContainerDetail] = js.undefined,
        createdAt: js.UndefOr[Double] = js.undefined,
        dependsOn: js.UndefOr[JobDependencyList] = js.undefined,
        eksAttempts: js.UndefOr[EksAttemptDetails] = js.undefined,
        eksProperties: js.UndefOr[EksPropertiesDetail] = js.undefined,
        jobArn: js.UndefOr[String] = js.undefined,
        nodeDetails: js.UndefOr[NodeDetails] = js.undefined,
        nodeProperties: js.UndefOr[NodeProperties] = js.undefined,
        parameters: js.UndefOr[ParametersMap] = js.undefined,
        platformCapabilities: js.UndefOr[PlatformCapabilityList] = js.undefined,
        propagateTags: js.UndefOr[Boolean] = js.undefined,
        retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
        schedulingPriority: js.UndefOr[Int] = js.undefined,
        shareIdentifier: js.UndefOr[String] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        stoppedAt: js.UndefOr[Double] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined,
        timeout: js.UndefOr[JobTimeout] = js.undefined
    ): JobDetail = {
      val __obj = js.Dynamic.literal(
        "jobDefinition" -> jobDefinition.asInstanceOf[js.Any],
        "jobId" -> jobId.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any],
        "jobQueue" -> jobQueue.asInstanceOf[js.Any],
        "startedAt" -> startedAt.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      arrayProperties.foreach(__v => __obj.updateDynamic("arrayProperties")(__v.asInstanceOf[js.Any]))
      attempts.foreach(__v => __obj.updateDynamic("attempts")(__v.asInstanceOf[js.Any]))
      container.foreach(__v => __obj.updateDynamic("container")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      dependsOn.foreach(__v => __obj.updateDynamic("dependsOn")(__v.asInstanceOf[js.Any]))
      eksAttempts.foreach(__v => __obj.updateDynamic("eksAttempts")(__v.asInstanceOf[js.Any]))
      eksProperties.foreach(__v => __obj.updateDynamic("eksProperties")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      nodeDetails.foreach(__v => __obj.updateDynamic("nodeDetails")(__v.asInstanceOf[js.Any]))
      nodeProperties.foreach(__v => __obj.updateDynamic("nodeProperties")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      platformCapabilities.foreach(__v => __obj.updateDynamic("platformCapabilities")(__v.asInstanceOf[js.Any]))
      propagateTags.foreach(__v => __obj.updateDynamic("propagateTags")(__v.asInstanceOf[js.Any]))
      retryStrategy.foreach(__v => __obj.updateDynamic("retryStrategy")(__v.asInstanceOf[js.Any]))
      schedulingPriority.foreach(__v => __obj.updateDynamic("schedulingPriority")(__v.asInstanceOf[js.Any]))
      shareIdentifier.foreach(__v => __obj.updateDynamic("shareIdentifier")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      stoppedAt.foreach(__v => __obj.updateDynamic("stoppedAt")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDetail]
    }
  }

  /** An object that represents the details for an Batch job queue.
    */
  @js.native
  trait JobQueueDetail extends js.Object {
    var computeEnvironmentOrder: ComputeEnvironmentOrders
    var jobQueueArn: String
    var jobQueueName: String
    var priority: Int
    var state: JQState
    var schedulingPolicyArn: js.UndefOr[String]
    var status: js.UndefOr[JQStatus]
    var statusReason: js.UndefOr[String]
    var tags: js.UndefOr[TagrisTagsMap]
  }

  object JobQueueDetail {
    @inline
    def apply(
        computeEnvironmentOrder: ComputeEnvironmentOrders,
        jobQueueArn: String,
        jobQueueName: String,
        priority: Int,
        state: JQState,
        schedulingPolicyArn: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[JQStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined
    ): JobQueueDetail = {
      val __obj = js.Dynamic.literal(
        "computeEnvironmentOrder" -> computeEnvironmentOrder.asInstanceOf[js.Any],
        "jobQueueArn" -> jobQueueArn.asInstanceOf[js.Any],
        "jobQueueName" -> jobQueueName.asInstanceOf[js.Any],
        "priority" -> priority.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any]
      )

      schedulingPolicyArn.foreach(__v => __obj.updateDynamic("schedulingPolicyArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobQueueDetail]
    }
  }

  /** An object that represents summary details of a job.
    */
  @js.native
  trait JobSummary extends js.Object {
    var jobId: String
    var jobName: String
    var arrayProperties: js.UndefOr[ArrayPropertiesSummary]
    var container: js.UndefOr[ContainerSummary]
    var createdAt: js.UndefOr[Double]
    var jobArn: js.UndefOr[String]
    var jobDefinition: js.UndefOr[String]
    var nodeProperties: js.UndefOr[NodePropertiesSummary]
    var startedAt: js.UndefOr[Double]
    var status: js.UndefOr[JobStatus]
    var statusReason: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
  }

  object JobSummary {
    @inline
    def apply(
        jobId: String,
        jobName: String,
        arrayProperties: js.UndefOr[ArrayPropertiesSummary] = js.undefined,
        container: js.UndefOr[ContainerSummary] = js.undefined,
        createdAt: js.UndefOr[Double] = js.undefined,
        jobArn: js.UndefOr[String] = js.undefined,
        jobDefinition: js.UndefOr[String] = js.undefined,
        nodeProperties: js.UndefOr[NodePropertiesSummary] = js.undefined,
        startedAt: js.UndefOr[Double] = js.undefined,
        status: js.UndefOr[JobStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        stoppedAt: js.UndefOr[Double] = js.undefined
    ): JobSummary = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any]
      )

      arrayProperties.foreach(__v => __obj.updateDynamic("arrayProperties")(__v.asInstanceOf[js.Any]))
      container.foreach(__v => __obj.updateDynamic("container")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      jobDefinition.foreach(__v => __obj.updateDynamic("jobDefinition")(__v.asInstanceOf[js.Any]))
      nodeProperties.foreach(__v => __obj.updateDynamic("nodeProperties")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      stoppedAt.foreach(__v => __obj.updateDynamic("stoppedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSummary]
    }
  }

  /** An object that represents a job timeout configuration.
    */
  @js.native
  trait JobTimeout extends js.Object {
    var attemptDurationSeconds: js.UndefOr[Int]
  }

  object JobTimeout {
    @inline
    def apply(
        attemptDurationSeconds: js.UndefOr[Int] = js.undefined
    ): JobTimeout = {
      val __obj = js.Dynamic.literal()
      attemptDurationSeconds.foreach(__v => __obj.updateDynamic("attemptDurationSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobTimeout]
    }
  }

  /** A key-value pair object.
    */
  @js.native
  trait KeyValuePair extends js.Object {
    var name: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object KeyValuePair {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): KeyValuePair = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyValuePair]
    }
  }

  /** A filter name and value pair that's used to return a more specific list of results from a <code>ListJobs</code> API operation.
    */
  @js.native
  trait KeyValuesPair extends js.Object {
    var name: js.UndefOr[String]
    var values: js.UndefOr[StringList]
  }

  object KeyValuesPair {
    @inline
    def apply(
        name: js.UndefOr[String] = js.undefined,
        values: js.UndefOr[StringList] = js.undefined
    ): KeyValuesPair = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyValuesPair]
    }
  }

  /** An object that represents a launch template that's associated with a compute resource. You must specify either the launch template ID or launch template name in the request, but not both. If security groups are specified using both the <code>securityGroupIds</code> parameter of <code>CreateComputeEnvironment</code> and the launch template, the values in the <code>securityGroupIds</code> parameter of <code>CreateComputeEnvironment</code> will be used.
    *
    * '''Note:'''This object isn't applicable to jobs that are running on Fargate resources.
    */
  @js.native
  trait LaunchTemplateSpecification extends js.Object {
    var launchTemplateId: js.UndefOr[String]
    var launchTemplateName: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object LaunchTemplateSpecification {
    @inline
    def apply(
        launchTemplateId: js.UndefOr[String] = js.undefined,
        launchTemplateName: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): LaunchTemplateSpecification = {
      val __obj = js.Dynamic.literal()
      launchTemplateId.foreach(__v => __obj.updateDynamic("launchTemplateId")(__v.asInstanceOf[js.Any]))
      launchTemplateName.foreach(__v => __obj.updateDynamic("launchTemplateName")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplateSpecification]
    }
  }

  /** Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  @js.native
  trait LinuxParameters extends js.Object {
    var devices: js.UndefOr[DevicesList]
    var initProcessEnabled: js.UndefOr[Boolean]
    var maxSwap: js.UndefOr[Int]
    var sharedMemorySize: js.UndefOr[Int]
    var swappiness: js.UndefOr[Int]
    var tmpfs: js.UndefOr[TmpfsList]
  }

  object LinuxParameters {
    @inline
    def apply(
        devices: js.UndefOr[DevicesList] = js.undefined,
        initProcessEnabled: js.UndefOr[Boolean] = js.undefined,
        maxSwap: js.UndefOr[Int] = js.undefined,
        sharedMemorySize: js.UndefOr[Int] = js.undefined,
        swappiness: js.UndefOr[Int] = js.undefined,
        tmpfs: js.UndefOr[TmpfsList] = js.undefined
    ): LinuxParameters = {
      val __obj = js.Dynamic.literal()
      devices.foreach(__v => __obj.updateDynamic("devices")(__v.asInstanceOf[js.Any]))
      initProcessEnabled.foreach(__v => __obj.updateDynamic("initProcessEnabled")(__v.asInstanceOf[js.Any]))
      maxSwap.foreach(__v => __obj.updateDynamic("maxSwap")(__v.asInstanceOf[js.Any]))
      sharedMemorySize.foreach(__v => __obj.updateDynamic("sharedMemorySize")(__v.asInstanceOf[js.Any]))
      swappiness.foreach(__v => __obj.updateDynamic("swappiness")(__v.asInstanceOf[js.Any]))
      tmpfs.foreach(__v => __obj.updateDynamic("tmpfs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LinuxParameters]
    }
  }

  /** Contains the parameters for <code>ListJobs</code>.
    */
  @js.native
  trait ListJobsRequest extends js.Object {
    var arrayJobId: js.UndefOr[String]
    var filters: js.UndefOr[ListJobsFilterList]
    var jobQueue: js.UndefOr[String]
    var jobStatus: js.UndefOr[JobStatus]
    var maxResults: js.UndefOr[Int]
    var multiNodeJobId: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
  }

  object ListJobsRequest {
    @inline
    def apply(
        arrayJobId: js.UndefOr[String] = js.undefined,
        filters: js.UndefOr[ListJobsFilterList] = js.undefined,
        jobQueue: js.UndefOr[String] = js.undefined,
        jobStatus: js.UndefOr[JobStatus] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        multiNodeJobId: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      arrayJobId.foreach(__v => __obj.updateDynamic("arrayJobId")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      jobQueue.foreach(__v => __obj.updateDynamic("jobQueue")(__v.asInstanceOf[js.Any]))
      jobStatus.foreach(__v => __obj.updateDynamic("jobStatus")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      multiNodeJobId.foreach(__v => __obj.updateDynamic("multiNodeJobId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var jobSummaryList: JobSummaryList
    var nextToken: js.UndefOr[String]
  }

  object ListJobsResponse {
    @inline
    def apply(
        jobSummaryList: JobSummaryList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListJobsResponse = {
      val __obj = js.Dynamic.literal(
        "jobSummaryList" -> jobSummaryList.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResponse]
    }
  }

  /** Contains the parameters for <code>ListSchedulingPolicies</code>.
    */
  @js.native
  trait ListSchedulingPoliciesRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object ListSchedulingPoliciesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListSchedulingPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchedulingPoliciesRequest]
    }
  }

  @js.native
  trait ListSchedulingPoliciesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var schedulingPolicies: js.UndefOr[SchedulingPolicyListingDetailList]
  }

  object ListSchedulingPoliciesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        schedulingPolicies: js.UndefOr[SchedulingPolicyListingDetailList] = js.undefined
    ): ListSchedulingPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      schedulingPolicies.foreach(__v => __obj.updateDynamic("schedulingPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSchedulingPoliciesResponse]
    }
  }

  /** Contains the parameters for <code>ListTagsForResource</code>.
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagrisTagsMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagrisTagsMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Log configuration options to send to a custom log driver for the container.
    */
  @js.native
  trait LogConfiguration extends js.Object {
    var logDriver: LogDriver
    var options: js.UndefOr[LogConfigurationOptionsMap]
    var secretOptions: js.UndefOr[SecretList]
  }

  object LogConfiguration {
    @inline
    def apply(
        logDriver: LogDriver,
        options: js.UndefOr[LogConfigurationOptionsMap] = js.undefined,
        secretOptions: js.UndefOr[SecretList] = js.undefined
    ): LogConfiguration = {
      val __obj = js.Dynamic.literal(
        "logDriver" -> logDriver.asInstanceOf[js.Any]
      )

      options.foreach(__v => __obj.updateDynamic("options")(__v.asInstanceOf[js.Any]))
      secretOptions.foreach(__v => __obj.updateDynamic("secretOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogConfiguration]
    }
  }

  /** Details for a Docker volume mount point that's used in a job's container properties. This parameter maps to <code>Volumes</code> in the [[https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/#create-a-container|Create a container]] section of the <i>Docker Remote API</i> and the <code>--volume</code> option to docker run.
    */
  @js.native
  trait MountPoint extends js.Object {
    var containerPath: js.UndefOr[String]
    var readOnly: js.UndefOr[Boolean]
    var sourceVolume: js.UndefOr[String]
  }

  object MountPoint {
    @inline
    def apply(
        containerPath: js.UndefOr[String] = js.undefined,
        readOnly: js.UndefOr[Boolean] = js.undefined,
        sourceVolume: js.UndefOr[String] = js.undefined
    ): MountPoint = {
      val __obj = js.Dynamic.literal()
      containerPath.foreach(__v => __obj.updateDynamic("containerPath")(__v.asInstanceOf[js.Any]))
      readOnly.foreach(__v => __obj.updateDynamic("readOnly")(__v.asInstanceOf[js.Any]))
      sourceVolume.foreach(__v => __obj.updateDynamic("sourceVolume")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MountPoint]
    }
  }

  /** The network configuration for jobs that are running on Fargate resources. Jobs that are running on EC2 resources must not specify this parameter.
    */
  @js.native
  trait NetworkConfiguration extends js.Object {
    var assignPublicIp: js.UndefOr[AssignPublicIp]
  }

  object NetworkConfiguration {
    @inline
    def apply(
        assignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined
    ): NetworkConfiguration = {
      val __obj = js.Dynamic.literal()
      assignPublicIp.foreach(__v => __obj.updateDynamic("assignPublicIp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkConfiguration]
    }
  }

  /** An object that represents the elastic network interface for a multi-node parallel job node.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var attachmentId: js.UndefOr[String]
    var ipv6Address: js.UndefOr[String]
    var privateIpv4Address: js.UndefOr[String]
  }

  object NetworkInterface {
    @inline
    def apply(
        attachmentId: js.UndefOr[String] = js.undefined,
        ipv6Address: js.UndefOr[String] = js.undefined,
        privateIpv4Address: js.UndefOr[String] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dynamic.literal()
      attachmentId.foreach(__v => __obj.updateDynamic("attachmentId")(__v.asInstanceOf[js.Any]))
      ipv6Address.foreach(__v => __obj.updateDynamic("ipv6Address")(__v.asInstanceOf[js.Any]))
      privateIpv4Address.foreach(__v => __obj.updateDynamic("privateIpv4Address")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  /** An object that represents the details of a multi-node parallel job node.
    */
  @js.native
  trait NodeDetails extends js.Object {
    var isMainNode: js.UndefOr[Boolean]
    var nodeIndex: js.UndefOr[Int]
  }

  object NodeDetails {
    @inline
    def apply(
        isMainNode: js.UndefOr[Boolean] = js.undefined,
        nodeIndex: js.UndefOr[Int] = js.undefined
    ): NodeDetails = {
      val __obj = js.Dynamic.literal()
      isMainNode.foreach(__v => __obj.updateDynamic("isMainNode")(__v.asInstanceOf[js.Any]))
      nodeIndex.foreach(__v => __obj.updateDynamic("nodeIndex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeDetails]
    }
  }

  /** An object that represents any node overrides to a job definition that's used in a <a>SubmitJob</a> API operation.
    *
    * '''Note:'''This parameter isn't applicable to jobs that are running on Fargate resources. Don't provide it for these jobs. Rather, use <code>containerOverrides</code> instead.
    */
  @js.native
  trait NodeOverrides extends js.Object {
    var nodePropertyOverrides: js.UndefOr[NodePropertyOverrides]
    var numNodes: js.UndefOr[Int]
  }

  object NodeOverrides {
    @inline
    def apply(
        nodePropertyOverrides: js.UndefOr[NodePropertyOverrides] = js.undefined,
        numNodes: js.UndefOr[Int] = js.undefined
    ): NodeOverrides = {
      val __obj = js.Dynamic.literal()
      nodePropertyOverrides.foreach(__v => __obj.updateDynamic("nodePropertyOverrides")(__v.asInstanceOf[js.Any]))
      numNodes.foreach(__v => __obj.updateDynamic("numNodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeOverrides]
    }
  }

  /** An object that represents the node properties of a multi-node parallel job.
    *
    * '''Note:'''Node properties can't be specified for Amazon EKS based job definitions.
    */
  @js.native
  trait NodeProperties extends js.Object {
    var mainNode: Int
    var nodeRangeProperties: NodeRangeProperties
    var numNodes: Int
  }

  object NodeProperties {
    @inline
    def apply(
        mainNode: Int,
        nodeRangeProperties: NodeRangeProperties,
        numNodes: Int
    ): NodeProperties = {
      val __obj = js.Dynamic.literal(
        "mainNode" -> mainNode.asInstanceOf[js.Any],
        "nodeRangeProperties" -> nodeRangeProperties.asInstanceOf[js.Any],
        "numNodes" -> numNodes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NodeProperties]
    }
  }

  /** An object that represents the properties of a node that's associated with a multi-node parallel job.
    */
  @js.native
  trait NodePropertiesSummary extends js.Object {
    var isMainNode: js.UndefOr[Boolean]
    var nodeIndex: js.UndefOr[Int]
    var numNodes: js.UndefOr[Int]
  }

  object NodePropertiesSummary {
    @inline
    def apply(
        isMainNode: js.UndefOr[Boolean] = js.undefined,
        nodeIndex: js.UndefOr[Int] = js.undefined,
        numNodes: js.UndefOr[Int] = js.undefined
    ): NodePropertiesSummary = {
      val __obj = js.Dynamic.literal()
      isMainNode.foreach(__v => __obj.updateDynamic("isMainNode")(__v.asInstanceOf[js.Any]))
      nodeIndex.foreach(__v => __obj.updateDynamic("nodeIndex")(__v.asInstanceOf[js.Any]))
      numNodes.foreach(__v => __obj.updateDynamic("numNodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodePropertiesSummary]
    }
  }

  /** The object that represents any node overrides to a job definition that's used in a <a>SubmitJob</a> API operation.
    */
  @js.native
  trait NodePropertyOverride extends js.Object {
    var targetNodes: String
    var containerOverrides: js.UndefOr[ContainerOverrides]
  }

  object NodePropertyOverride {
    @inline
    def apply(
        targetNodes: String,
        containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined
    ): NodePropertyOverride = {
      val __obj = js.Dynamic.literal(
        "targetNodes" -> targetNodes.asInstanceOf[js.Any]
      )

      containerOverrides.foreach(__v => __obj.updateDynamic("containerOverrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodePropertyOverride]
    }
  }

  /** An object that represents the properties of the node range for a multi-node parallel job.
    */
  @js.native
  trait NodeRangeProperty extends js.Object {
    var targetNodes: String
    var container: js.UndefOr[ContainerProperties]
  }

  object NodeRangeProperty {
    @inline
    def apply(
        targetNodes: String,
        container: js.UndefOr[ContainerProperties] = js.undefined
    ): NodeRangeProperty = {
      val __obj = js.Dynamic.literal(
        "targetNodes" -> targetNodes.asInstanceOf[js.Any]
      )

      container.foreach(__v => __obj.updateDynamic("container")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeRangeProperty]
    }
  }

  /** Contains the parameters for <code>RegisterJobDefinition</code>.
    */
  @js.native
  trait RegisterJobDefinitionRequest extends js.Object {
    var jobDefinitionName: String
    var `type`: JobDefinitionType
    var containerProperties: js.UndefOr[ContainerProperties]
    var eksProperties: js.UndefOr[EksProperties]
    var nodeProperties: js.UndefOr[NodeProperties]
    var parameters: js.UndefOr[ParametersMap]
    var platformCapabilities: js.UndefOr[PlatformCapabilityList]
    var propagateTags: js.UndefOr[Boolean]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var schedulingPriority: js.UndefOr[Int]
    var tags: js.UndefOr[TagrisTagsMap]
    var timeout: js.UndefOr[JobTimeout]
  }

  object RegisterJobDefinitionRequest {
    @inline
    def apply(
        jobDefinitionName: String,
        `type`: JobDefinitionType,
        containerProperties: js.UndefOr[ContainerProperties] = js.undefined,
        eksProperties: js.UndefOr[EksProperties] = js.undefined,
        nodeProperties: js.UndefOr[NodeProperties] = js.undefined,
        parameters: js.UndefOr[ParametersMap] = js.undefined,
        platformCapabilities: js.UndefOr[PlatformCapabilityList] = js.undefined,
        propagateTags: js.UndefOr[Boolean] = js.undefined,
        retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
        schedulingPriority: js.UndefOr[Int] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined,
        timeout: js.UndefOr[JobTimeout] = js.undefined
    ): RegisterJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "jobDefinitionName" -> jobDefinitionName.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      containerProperties.foreach(__v => __obj.updateDynamic("containerProperties")(__v.asInstanceOf[js.Any]))
      eksProperties.foreach(__v => __obj.updateDynamic("eksProperties")(__v.asInstanceOf[js.Any]))
      nodeProperties.foreach(__v => __obj.updateDynamic("nodeProperties")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      platformCapabilities.foreach(__v => __obj.updateDynamic("platformCapabilities")(__v.asInstanceOf[js.Any]))
      propagateTags.foreach(__v => __obj.updateDynamic("propagateTags")(__v.asInstanceOf[js.Any]))
      retryStrategy.foreach(__v => __obj.updateDynamic("retryStrategy")(__v.asInstanceOf[js.Any]))
      schedulingPriority.foreach(__v => __obj.updateDynamic("schedulingPriority")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterJobDefinitionRequest]
    }
  }

  @js.native
  trait RegisterJobDefinitionResponse extends js.Object {
    var jobDefinitionArn: String
    var jobDefinitionName: String
    var revision: Int
  }

  object RegisterJobDefinitionResponse {
    @inline
    def apply(
        jobDefinitionArn: String,
        jobDefinitionName: String,
        revision: Int
    ): RegisterJobDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "jobDefinitionArn" -> jobDefinitionArn.asInstanceOf[js.Any],
        "jobDefinitionName" -> jobDefinitionName.asInstanceOf[js.Any],
        "revision" -> revision.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisterJobDefinitionResponse]
    }
  }

  /** The type and amount of a resource to assign to a container. The supported resources include <code>GPU</code>, <code>MEMORY</code>, and <code>VCPU</code>.
    */
  @js.native
  trait ResourceRequirement extends js.Object {
    var `type`: ResourceType
    var value: String
  }

  object ResourceRequirement {
    @inline
    def apply(
        `type`: ResourceType,
        value: String
    ): ResourceRequirement = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResourceRequirement]
    }
  }

  /** The retry strategy that's associated with a job. For more information, see [[https://docs.aws.amazon.com/batch/latest/userguide/job_retries.html|Automated job retries]] in the <i>Batch User Guide</i>.
    */
  @js.native
  trait RetryStrategy extends js.Object {
    var attempts: js.UndefOr[Int]
    var evaluateOnExit: js.UndefOr[EvaluateOnExitList]
  }

  object RetryStrategy {
    @inline
    def apply(
        attempts: js.UndefOr[Int] = js.undefined,
        evaluateOnExit: js.UndefOr[EvaluateOnExitList] = js.undefined
    ): RetryStrategy = {
      val __obj = js.Dynamic.literal()
      attempts.foreach(__v => __obj.updateDynamic("attempts")(__v.asInstanceOf[js.Any]))
      evaluateOnExit.foreach(__v => __obj.updateDynamic("evaluateOnExit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryStrategy]
    }
  }

  /** An object that represents a scheduling policy.
    */
  @js.native
  trait SchedulingPolicyDetail extends js.Object {
    var arn: String
    var name: String
    var fairsharePolicy: js.UndefOr[FairsharePolicy]
    var tags: js.UndefOr[TagrisTagsMap]
  }

  object SchedulingPolicyDetail {
    @inline
    def apply(
        arn: String,
        name: String,
        fairsharePolicy: js.UndefOr[FairsharePolicy] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined
    ): SchedulingPolicyDetail = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      fairsharePolicy.foreach(__v => __obj.updateDynamic("fairsharePolicy")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SchedulingPolicyDetail]
    }
  }

  /** An object that contains the details of a scheduling policy that's returned in a <code>ListSchedulingPolicy</code> action.
    */
  @js.native
  trait SchedulingPolicyListingDetail extends js.Object {
    var arn: String
  }

  object SchedulingPolicyListingDetail {
    @inline
    def apply(
        arn: String
    ): SchedulingPolicyListingDetail = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SchedulingPolicyListingDetail]
    }
  }

  /** An object that represents the secret to expose to your container. Secrets can be exposed to a container in the following ways: * To inject sensitive data into your containers as environment variables, use the <code>secrets</code> container definition parameter. * To reference sensitive information in the log configuration of a container, use the <code>secretOptions</code> container definition parameter. For more information, see [[https://docs.aws.amazon.com/batch/latest/userguide/specifying-sensitive-data.html|Specifying sensitive data]] in the <i>Batch User Guide</i>.
    */
  @js.native
  trait Secret extends js.Object {
    var name: String
    var valueFrom: String
  }

  object Secret {
    @inline
    def apply(
        name: String,
        valueFrom: String
    ): Secret = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "valueFrom" -> valueFrom.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Secret]
    }
  }

  /** Specifies the weights for the fair share identifiers for the fair share policy. Fair share identifiers that aren't included have a default weight of <code>1.0</code>.
    */
  @js.native
  trait ShareAttributes extends js.Object {
    var shareIdentifier: String
    var weightFactor: js.UndefOr[Float]
  }

  object ShareAttributes {
    @inline
    def apply(
        shareIdentifier: String,
        weightFactor: js.UndefOr[Float] = js.undefined
    ): ShareAttributes = {
      val __obj = js.Dynamic.literal(
        "shareIdentifier" -> shareIdentifier.asInstanceOf[js.Any]
      )

      weightFactor.foreach(__v => __obj.updateDynamic("weightFactor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareAttributes]
    }
  }

  /** Contains the parameters for <code>SubmitJob</code>.
    */
  @js.native
  trait SubmitJobRequest extends js.Object {
    var jobDefinition: String
    var jobName: String
    var jobQueue: String
    var arrayProperties: js.UndefOr[ArrayProperties]
    var containerOverrides: js.UndefOr[ContainerOverrides]
    var dependsOn: js.UndefOr[JobDependencyList]
    var eksPropertiesOverride: js.UndefOr[EksPropertiesOverride]
    var nodeOverrides: js.UndefOr[NodeOverrides]
    var parameters: js.UndefOr[ParametersMap]
    var propagateTags: js.UndefOr[Boolean]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var schedulingPriorityOverride: js.UndefOr[Int]
    var shareIdentifier: js.UndefOr[String]
    var tags: js.UndefOr[TagrisTagsMap]
    var timeout: js.UndefOr[JobTimeout]
  }

  object SubmitJobRequest {
    @inline
    def apply(
        jobDefinition: String,
        jobName: String,
        jobQueue: String,
        arrayProperties: js.UndefOr[ArrayProperties] = js.undefined,
        containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined,
        dependsOn: js.UndefOr[JobDependencyList] = js.undefined,
        eksPropertiesOverride: js.UndefOr[EksPropertiesOverride] = js.undefined,
        nodeOverrides: js.UndefOr[NodeOverrides] = js.undefined,
        parameters: js.UndefOr[ParametersMap] = js.undefined,
        propagateTags: js.UndefOr[Boolean] = js.undefined,
        retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
        schedulingPriorityOverride: js.UndefOr[Int] = js.undefined,
        shareIdentifier: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagrisTagsMap] = js.undefined,
        timeout: js.UndefOr[JobTimeout] = js.undefined
    ): SubmitJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobDefinition" -> jobDefinition.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any],
        "jobQueue" -> jobQueue.asInstanceOf[js.Any]
      )

      arrayProperties.foreach(__v => __obj.updateDynamic("arrayProperties")(__v.asInstanceOf[js.Any]))
      containerOverrides.foreach(__v => __obj.updateDynamic("containerOverrides")(__v.asInstanceOf[js.Any]))
      dependsOn.foreach(__v => __obj.updateDynamic("dependsOn")(__v.asInstanceOf[js.Any]))
      eksPropertiesOverride.foreach(__v => __obj.updateDynamic("eksPropertiesOverride")(__v.asInstanceOf[js.Any]))
      nodeOverrides.foreach(__v => __obj.updateDynamic("nodeOverrides")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      propagateTags.foreach(__v => __obj.updateDynamic("propagateTags")(__v.asInstanceOf[js.Any]))
      retryStrategy.foreach(__v => __obj.updateDynamic("retryStrategy")(__v.asInstanceOf[js.Any]))
      schedulingPriorityOverride.foreach(__v => __obj.updateDynamic("schedulingPriorityOverride")(__v.asInstanceOf[js.Any]))
      shareIdentifier.foreach(__v => __obj.updateDynamic("shareIdentifier")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitJobRequest]
    }
  }

  @js.native
  trait SubmitJobResponse extends js.Object {
    var jobId: String
    var jobName: String
    var jobArn: js.UndefOr[String]
  }

  object SubmitJobResponse {
    @inline
    def apply(
        jobId: String,
        jobName: String,
        jobArn: js.UndefOr[String] = js.undefined
    ): SubmitJobResponse = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any]
      )

      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitJobResponse]
    }
  }

  /** Contains the parameters for <code>TagResource</code>.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagrisTagsMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: TagrisTagsMap
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

  /** Contains the parameters for <code>TerminateJob</code>.
    */
  @js.native
  trait TerminateJobRequest extends js.Object {
    var jobId: String
    var reason: String
  }

  object TerminateJobRequest {
    @inline
    def apply(
        jobId: String,
        reason: String
    ): TerminateJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any],
        "reason" -> reason.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TerminateJobRequest]
    }
  }

  @js.native
  trait TerminateJobResponse extends js.Object

  object TerminateJobResponse {
    @inline
    def apply(): TerminateJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TerminateJobResponse]
    }
  }

  /** The container path, mount options, and size of the <code>tmpfs</code> mount.
    *
    * '''Note:'''This object isn't applicable to jobs that are running on Fargate resources.
    */
  @js.native
  trait Tmpfs extends js.Object {
    var containerPath: String
    var size: Int
    var mountOptions: js.UndefOr[StringList]
  }

  object Tmpfs {
    @inline
    def apply(
        containerPath: String,
        size: Int,
        mountOptions: js.UndefOr[StringList] = js.undefined
    ): Tmpfs = {
      val __obj = js.Dynamic.literal(
        "containerPath" -> containerPath.asInstanceOf[js.Any],
        "size" -> size.asInstanceOf[js.Any]
      )

      mountOptions.foreach(__v => __obj.updateDynamic("mountOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tmpfs]
    }
  }

  /** The <code>ulimit</code> settings to pass to the container.
    *
    * '''Note:'''This object isn't applicable to jobs that are running on Fargate resources.
    */
  @js.native
  trait Ulimit extends js.Object {
    var hardLimit: Int
    var name: String
    var softLimit: Int
  }

  object Ulimit {
    @inline
    def apply(
        hardLimit: Int,
        name: String,
        softLimit: Int
    ): Ulimit = {
      val __obj = js.Dynamic.literal(
        "hardLimit" -> hardLimit.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "softLimit" -> softLimit.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Ulimit]
    }
  }

  /** Contains the parameters for <code>UntagResource</code>.
    */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeysList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeysList
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

  /** Contains the parameters for <code>UpdateComputeEnvironment</code>.
    */
  @js.native
  trait UpdateComputeEnvironmentRequest extends js.Object {
    var computeEnvironment: String
    var computeResources: js.UndefOr[ComputeResourceUpdate]
    var serviceRole: js.UndefOr[String]
    var state: js.UndefOr[CEState]
    var unmanagedvCpus: js.UndefOr[Int]
    var updatePolicy: js.UndefOr[UpdatePolicy]
  }

  object UpdateComputeEnvironmentRequest {
    @inline
    def apply(
        computeEnvironment: String,
        computeResources: js.UndefOr[ComputeResourceUpdate] = js.undefined,
        serviceRole: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[CEState] = js.undefined,
        unmanagedvCpus: js.UndefOr[Int] = js.undefined,
        updatePolicy: js.UndefOr[UpdatePolicy] = js.undefined
    ): UpdateComputeEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "computeEnvironment" -> computeEnvironment.asInstanceOf[js.Any]
      )

      computeResources.foreach(__v => __obj.updateDynamic("computeResources")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      unmanagedvCpus.foreach(__v => __obj.updateDynamic("unmanagedvCpus")(__v.asInstanceOf[js.Any]))
      updatePolicy.foreach(__v => __obj.updateDynamic("updatePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateComputeEnvironmentRequest]
    }
  }

  @js.native
  trait UpdateComputeEnvironmentResponse extends js.Object {
    var computeEnvironmentArn: js.UndefOr[String]
    var computeEnvironmentName: js.UndefOr[String]
  }

  object UpdateComputeEnvironmentResponse {
    @inline
    def apply(
        computeEnvironmentArn: js.UndefOr[String] = js.undefined,
        computeEnvironmentName: js.UndefOr[String] = js.undefined
    ): UpdateComputeEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      computeEnvironmentArn.foreach(__v => __obj.updateDynamic("computeEnvironmentArn")(__v.asInstanceOf[js.Any]))
      computeEnvironmentName.foreach(__v => __obj.updateDynamic("computeEnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateComputeEnvironmentResponse]
    }
  }

  /** Contains the parameters for <code>UpdateJobQueue</code>.
    */
  @js.native
  trait UpdateJobQueueRequest extends js.Object {
    var jobQueue: String
    var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders]
    var priority: js.UndefOr[Int]
    var schedulingPolicyArn: js.UndefOr[String]
    var state: js.UndefOr[JQState]
  }

  object UpdateJobQueueRequest {
    @inline
    def apply(
        jobQueue: String,
        computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.undefined,
        priority: js.UndefOr[Int] = js.undefined,
        schedulingPolicyArn: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[JQState] = js.undefined
    ): UpdateJobQueueRequest = {
      val __obj = js.Dynamic.literal(
        "jobQueue" -> jobQueue.asInstanceOf[js.Any]
      )

      computeEnvironmentOrder.foreach(__v => __obj.updateDynamic("computeEnvironmentOrder")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      schedulingPolicyArn.foreach(__v => __obj.updateDynamic("schedulingPolicyArn")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobQueueRequest]
    }
  }

  @js.native
  trait UpdateJobQueueResponse extends js.Object {
    var jobQueueArn: js.UndefOr[String]
    var jobQueueName: js.UndefOr[String]
  }

  object UpdateJobQueueResponse {
    @inline
    def apply(
        jobQueueArn: js.UndefOr[String] = js.undefined,
        jobQueueName: js.UndefOr[String] = js.undefined
    ): UpdateJobQueueResponse = {
      val __obj = js.Dynamic.literal()
      jobQueueArn.foreach(__v => __obj.updateDynamic("jobQueueArn")(__v.asInstanceOf[js.Any]))
      jobQueueName.foreach(__v => __obj.updateDynamic("jobQueueName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobQueueResponse]
    }
  }

  /** Specifies the infrastructure update policy for the compute environment. For more information about infrastructure updates, see [[https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html|Updating compute environments]] in the <i>Batch User Guide</i>.
    */
  @js.native
  trait UpdatePolicy extends js.Object {
    var jobExecutionTimeoutMinutes: js.UndefOr[JobExecutionTimeoutMinutes]
    var terminateJobsOnUpdate: js.UndefOr[Boolean]
  }

  object UpdatePolicy {
    @inline
    def apply(
        jobExecutionTimeoutMinutes: js.UndefOr[JobExecutionTimeoutMinutes] = js.undefined,
        terminateJobsOnUpdate: js.UndefOr[Boolean] = js.undefined
    ): UpdatePolicy = {
      val __obj = js.Dynamic.literal()
      jobExecutionTimeoutMinutes.foreach(__v => __obj.updateDynamic("jobExecutionTimeoutMinutes")(__v.asInstanceOf[js.Any]))
      terminateJobsOnUpdate.foreach(__v => __obj.updateDynamic("terminateJobsOnUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePolicy]
    }
  }

  /** Contains the parameters for <code>UpdateSchedulingPolicy</code>.
    */
  @js.native
  trait UpdateSchedulingPolicyRequest extends js.Object {
    var arn: String
    var fairsharePolicy: js.UndefOr[FairsharePolicy]
  }

  object UpdateSchedulingPolicyRequest {
    @inline
    def apply(
        arn: String,
        fairsharePolicy: js.UndefOr[FairsharePolicy] = js.undefined
    ): UpdateSchedulingPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )

      fairsharePolicy.foreach(__v => __obj.updateDynamic("fairsharePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSchedulingPolicyRequest]
    }
  }

  @js.native
  trait UpdateSchedulingPolicyResponse extends js.Object

  object UpdateSchedulingPolicyResponse {
    @inline
    def apply(): UpdateSchedulingPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateSchedulingPolicyResponse]
    }
  }

  /** A data volume that's used in a job's container properties.
    */
  @js.native
  trait Volume extends js.Object {
    var efsVolumeConfiguration: js.UndefOr[EFSVolumeConfiguration]
    var host: js.UndefOr[Host]
    var name: js.UndefOr[String]
  }

  object Volume {
    @inline
    def apply(
        efsVolumeConfiguration: js.UndefOr[EFSVolumeConfiguration] = js.undefined,
        host: js.UndefOr[Host] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): Volume = {
      val __obj = js.Dynamic.literal()
      efsVolumeConfiguration.foreach(__v => __obj.updateDynamic("efsVolumeConfiguration")(__v.asInstanceOf[js.Any]))
      host.foreach(__v => __obj.updateDynamic("host")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Volume]
    }
  }
}
