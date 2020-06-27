package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object batch {
  type ArrayJobStatusSummary        = js.Dictionary[Int]
  type AttemptDetails               = js.Array[AttemptDetail]
  type ComputeEnvironmentDetailList = js.Array[ComputeEnvironmentDetail]
  type ComputeEnvironmentOrders     = js.Array[ComputeEnvironmentOrder]
  type DeviceCgroupPermissions      = js.Array[DeviceCgroupPermission]
  type DevicesList                  = js.Array[Device]
  type EnvironmentVariables         = js.Array[KeyValuePair]
  type JobDefinitionList            = js.Array[JobDefinition]
  type JobDependencyList            = js.Array[JobDependency]
  type JobDetailList                = js.Array[JobDetail]
  type JobQueueDetailList           = js.Array[JobQueueDetail]
  type JobSummaryList               = js.Array[JobSummary]
  type MountPoints                  = js.Array[MountPoint]
  type NetworkInterfaceList         = js.Array[NetworkInterface]
  type NodePropertyOverrides        = js.Array[NodePropertyOverride]
  type NodeRangeProperties          = js.Array[NodeRangeProperty]
  type ParametersMap                = js.Dictionary[String]
  type ResourceRequirements         = js.Array[ResourceRequirement]
  type StringList                   = js.Array[String]
  type TagsMap                      = js.Dictionary[String]
  type Ulimits                      = js.Array[Ulimit]
  type Volumes                      = js.Array[Volume]

  implicit final class BatchOps(private val service: Batch) extends AnyVal {

    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] =
      service.cancelJob(params).promise().toFuture
    @inline def createComputeEnvironmentFuture(
        params: CreateComputeEnvironmentRequest
    ): Future[CreateComputeEnvironmentResponse] = service.createComputeEnvironment(params).promise().toFuture
    @inline def createJobQueueFuture(params: CreateJobQueueRequest): Future[CreateJobQueueResponse] =
      service.createJobQueue(params).promise().toFuture
    @inline def deleteComputeEnvironmentFuture(
        params: DeleteComputeEnvironmentRequest
    ): Future[DeleteComputeEnvironmentResponse] = service.deleteComputeEnvironment(params).promise().toFuture
    @inline def deleteJobQueueFuture(params: DeleteJobQueueRequest): Future[DeleteJobQueueResponse] =
      service.deleteJobQueue(params).promise().toFuture
    @inline def deregisterJobDefinitionFuture(
        params: DeregisterJobDefinitionRequest
    ): Future[DeregisterJobDefinitionResponse] = service.deregisterJobDefinition(params).promise().toFuture
    @inline def describeComputeEnvironmentsFuture(
        params: DescribeComputeEnvironmentsRequest
    ): Future[DescribeComputeEnvironmentsResponse] = service.describeComputeEnvironments(params).promise().toFuture
    @inline def describeJobDefinitionsFuture(
        params: DescribeJobDefinitionsRequest
    ): Future[DescribeJobDefinitionsResponse] = service.describeJobDefinitions(params).promise().toFuture
    @inline def describeJobQueuesFuture(params: DescribeJobQueuesRequest): Future[DescribeJobQueuesResponse] =
      service.describeJobQueues(params).promise().toFuture
    @inline def describeJobsFuture(params: DescribeJobsRequest): Future[DescribeJobsResponse] =
      service.describeJobs(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] =
      service.listJobs(params).promise().toFuture
    @inline def registerJobDefinitionFuture(
        params: RegisterJobDefinitionRequest
    ): Future[RegisterJobDefinitionResponse] = service.registerJobDefinition(params).promise().toFuture
    @inline def submitJobFuture(params: SubmitJobRequest): Future[SubmitJobResponse] =
      service.submitJob(params).promise().toFuture
    @inline def terminateJobFuture(params: TerminateJobRequest): Future[TerminateJobResponse] =
      service.terminateJob(params).promise().toFuture
    @inline def updateComputeEnvironmentFuture(
        params: UpdateComputeEnvironmentRequest
    ): Future[UpdateComputeEnvironmentResponse] = service.updateComputeEnvironment(params).promise().toFuture
    @inline def updateJobQueueFuture(params: UpdateJobQueueRequest): Future[UpdateJobQueueResponse] =
      service.updateJobQueue(params).promise().toFuture
  }
}

package batch {
  @js.native
  @JSImport("aws-sdk", "Batch")
  class Batch() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse] = js.native
    def createComputeEnvironment(params: CreateComputeEnvironmentRequest): Request[CreateComputeEnvironmentResponse] =
      js.native
    def createJobQueue(params: CreateJobQueueRequest): Request[CreateJobQueueResponse] = js.native
    def deleteComputeEnvironment(params: DeleteComputeEnvironmentRequest): Request[DeleteComputeEnvironmentResponse] =
      js.native
    def deleteJobQueue(params: DeleteJobQueueRequest): Request[DeleteJobQueueResponse] = js.native
    def deregisterJobDefinition(params: DeregisterJobDefinitionRequest): Request[DeregisterJobDefinitionResponse] =
      js.native
    def describeComputeEnvironments(
        params: DescribeComputeEnvironmentsRequest
    ): Request[DescribeComputeEnvironmentsResponse] = js.native
    def describeJobDefinitions(params: DescribeJobDefinitionsRequest): Request[DescribeJobDefinitionsResponse] =
      js.native
    def describeJobQueues(params: DescribeJobQueuesRequest): Request[DescribeJobQueuesResponse]             = js.native
    def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse]                            = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse]                                        = js.native
    def registerJobDefinition(params: RegisterJobDefinitionRequest): Request[RegisterJobDefinitionResponse] = js.native
    def submitJob(params: SubmitJobRequest): Request[SubmitJobResponse]                                     = js.native
    def terminateJob(params: TerminateJobRequest): Request[TerminateJobResponse]                            = js.native
    def updateComputeEnvironment(params: UpdateComputeEnvironmentRequest): Request[UpdateComputeEnvironmentResponse] =
      js.native
    def updateJobQueue(params: UpdateJobQueueRequest): Request[UpdateJobQueueResponse] = js.native
  }

  @js.native
  sealed trait ArrayJobDependency extends js.Any
  object ArrayJobDependency extends js.Object {
    val N_TO_N     = "N_TO_N".asInstanceOf[ArrayJobDependency]
    val SEQUENTIAL = "SEQUENTIAL".asInstanceOf[ArrayJobDependency]

    val values = js.Object.freeze(js.Array(N_TO_N, SEQUENTIAL))
  }

  /**
    * An object representing an AWS Batch array job.
    */
  @js.native
  @Factory
  trait ArrayProperties extends js.Object {
    var size: js.UndefOr[Int]
  }

  /**
    * An object representing the array properties of a job.
    */
  @js.native
  @Factory
  trait ArrayPropertiesDetail extends js.Object {
    var index: js.UndefOr[Int]
    var size: js.UndefOr[Int]
    var statusSummary: js.UndefOr[ArrayJobStatusSummary]
  }

  /**
    * An object representing the array properties of a job.
    */
  @js.native
  @Factory
  trait ArrayPropertiesSummary extends js.Object {
    var index: js.UndefOr[Int]
    var size: js.UndefOr[Int]
  }

  /**
    * An object representing the details of a container that is part of a job attempt.
    */
  @js.native
  @Factory
  trait AttemptContainerDetail extends js.Object {
    var containerInstanceArn: js.UndefOr[String]
    var exitCode: js.UndefOr[Int]
    var logStreamName: js.UndefOr[String]
    var networkInterfaces: js.UndefOr[NetworkInterfaceList]
    var reason: js.UndefOr[String]
    var taskArn: js.UndefOr[String]
  }

  /**
    * An object representing a job attempt.
    */
  @js.native
  @Factory
  trait AttemptDetail extends js.Object {
    var container: js.UndefOr[AttemptContainerDetail]
    var startedAt: js.UndefOr[Double]
    var statusReason: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
  }

  @js.native
  sealed trait CEState extends js.Any
  object CEState extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[CEState]
    val DISABLED = "DISABLED".asInstanceOf[CEState]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  sealed trait CEStatus extends js.Any
  object CEStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[CEStatus]
    val UPDATING = "UPDATING".asInstanceOf[CEStatus]
    val DELETING = "DELETING".asInstanceOf[CEStatus]
    val DELETED  = "DELETED".asInstanceOf[CEStatus]
    val VALID    = "VALID".asInstanceOf[CEStatus]
    val INVALID  = "INVALID".asInstanceOf[CEStatus]

    val values = js.Object.freeze(js.Array(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID))
  }

  @js.native
  sealed trait CEType extends js.Any
  object CEType extends js.Object {
    val MANAGED   = "MANAGED".asInstanceOf[CEType]
    val UNMANAGED = "UNMANAGED".asInstanceOf[CEType]

    val values = js.Object.freeze(js.Array(MANAGED, UNMANAGED))
  }

  @js.native
  sealed trait CRAllocationStrategy extends js.Any
  object CRAllocationStrategy extends js.Object {
    val BEST_FIT                = "BEST_FIT".asInstanceOf[CRAllocationStrategy]
    val BEST_FIT_PROGRESSIVE    = "BEST_FIT_PROGRESSIVE".asInstanceOf[CRAllocationStrategy]
    val SPOT_CAPACITY_OPTIMIZED = "SPOT_CAPACITY_OPTIMIZED".asInstanceOf[CRAllocationStrategy]

    val values = js.Object.freeze(js.Array(BEST_FIT, BEST_FIT_PROGRESSIVE, SPOT_CAPACITY_OPTIMIZED))
  }

  @js.native
  sealed trait CRType extends js.Any
  object CRType extends js.Object {
    val EC2  = "EC2".asInstanceOf[CRType]
    val SPOT = "SPOT".asInstanceOf[CRType]

    val values = js.Object.freeze(js.Array(EC2, SPOT))
  }

  @js.native
  @Factory
  trait CancelJobRequest extends js.Object {
    var jobId: String
    var reason: String
  }

  @js.native
  @Factory
  trait CancelJobResponse extends js.Object {}

  /**
    * An object representing an AWS Batch compute environment.
    */
  @js.native
  @Factory
  trait ComputeEnvironmentDetail extends js.Object {
    var computeEnvironmentArn: String
    var computeEnvironmentName: String
    var ecsClusterArn: String
    var computeResources: js.UndefOr[ComputeResource]
    var serviceRole: js.UndefOr[String]
    var state: js.UndefOr[CEState]
    var status: js.UndefOr[CEStatus]
    var statusReason: js.UndefOr[String]
    var `type`: js.UndefOr[CEType]
  }

  /**
    * The order in which compute environments are tried for job placement within a queue. Compute environments are tried in ascending order. For example, if two compute environments are associated with a job queue, the compute environment with a lower order integer value is tried for job placement first.
    */
  @js.native
  @Factory
  trait ComputeEnvironmentOrder extends js.Object {
    var computeEnvironment: String
    var order: Int
  }

  /**
    * An object representing an AWS Batch compute resource.
    */
  @js.native
  @Factory
  trait ComputeResource extends js.Object {
    var instanceRole: String
    var instanceTypes: StringList
    var maxvCpus: Int
    var minvCpus: Int
    var subnets: StringList
    var `type`: CRType
    var allocationStrategy: js.UndefOr[CRAllocationStrategy]
    var bidPercentage: js.UndefOr[Int]
    var desiredvCpus: js.UndefOr[Int]
    var ec2KeyPair: js.UndefOr[String]
    var imageId: js.UndefOr[String]
    var launchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var placementGroup: js.UndefOr[String]
    var securityGroupIds: js.UndefOr[StringList]
    var spotIamFleetRole: js.UndefOr[String]
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * An object representing the attributes of a compute environment that can be updated.
    */
  @js.native
  @Factory
  trait ComputeResourceUpdate extends js.Object {
    var desiredvCpus: js.UndefOr[Int]
    var maxvCpus: js.UndefOr[Int]
    var minvCpus: js.UndefOr[Int]
  }

  /**
    * An object representing the details of a container that is part of a job.
    */
  @js.native
  @Factory
  trait ContainerDetail extends js.Object {
    var command: js.UndefOr[StringList]
    var containerInstanceArn: js.UndefOr[String]
    var environment: js.UndefOr[EnvironmentVariables]
    var exitCode: js.UndefOr[Int]
    var image: js.UndefOr[String]
    var instanceType: js.UndefOr[String]
    var jobRoleArn: js.UndefOr[String]
    var linuxParameters: js.UndefOr[LinuxParameters]
    var logStreamName: js.UndefOr[String]
    var memory: js.UndefOr[Int]
    var mountPoints: js.UndefOr[MountPoints]
    var networkInterfaces: js.UndefOr[NetworkInterfaceList]
    var privileged: js.UndefOr[Boolean]
    var readonlyRootFilesystem: js.UndefOr[Boolean]
    var reason: js.UndefOr[String]
    var resourceRequirements: js.UndefOr[ResourceRequirements]
    var taskArn: js.UndefOr[String]
    var ulimits: js.UndefOr[Ulimits]
    var user: js.UndefOr[String]
    var vcpus: js.UndefOr[Int]
    var volumes: js.UndefOr[Volumes]
  }

  /**
    * The overrides that should be sent to a container.
    */
  @js.native
  @Factory
  trait ContainerOverrides extends js.Object {
    var command: js.UndefOr[StringList]
    var environment: js.UndefOr[EnvironmentVariables]
    var instanceType: js.UndefOr[String]
    var memory: js.UndefOr[Int]
    var resourceRequirements: js.UndefOr[ResourceRequirements]
    var vcpus: js.UndefOr[Int]
  }

  /**
    * Container properties are used in job definitions to describe the container that is launched as part of a job.
    */
  @js.native
  @Factory
  trait ContainerProperties extends js.Object {
    var command: js.UndefOr[StringList]
    var environment: js.UndefOr[EnvironmentVariables]
    var image: js.UndefOr[String]
    var instanceType: js.UndefOr[String]
    var jobRoleArn: js.UndefOr[String]
    var linuxParameters: js.UndefOr[LinuxParameters]
    var memory: js.UndefOr[Int]
    var mountPoints: js.UndefOr[MountPoints]
    var privileged: js.UndefOr[Boolean]
    var readonlyRootFilesystem: js.UndefOr[Boolean]
    var resourceRequirements: js.UndefOr[ResourceRequirements]
    var ulimits: js.UndefOr[Ulimits]
    var user: js.UndefOr[String]
    var vcpus: js.UndefOr[Int]
    var volumes: js.UndefOr[Volumes]
  }

  /**
    * An object representing summary details of a container within a job.
    */
  @js.native
  @Factory
  trait ContainerSummary extends js.Object {
    var exitCode: js.UndefOr[Int]
    var reason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateComputeEnvironmentRequest extends js.Object {
    var computeEnvironmentName: String
    var serviceRole: String
    var `type`: CEType
    var computeResources: js.UndefOr[ComputeResource]
    var state: js.UndefOr[CEState]
  }

  @js.native
  @Factory
  trait CreateComputeEnvironmentResponse extends js.Object {
    var computeEnvironmentArn: js.UndefOr[String]
    var computeEnvironmentName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateJobQueueRequest extends js.Object {
    var computeEnvironmentOrder: ComputeEnvironmentOrders
    var jobQueueName: String
    var priority: Int
    var state: js.UndefOr[JQState]
  }

  @js.native
  @Factory
  trait CreateJobQueueResponse extends js.Object {
    var jobQueueArn: String
    var jobQueueName: String
  }

  @js.native
  @Factory
  trait DeleteComputeEnvironmentRequest extends js.Object {
    var computeEnvironment: String
  }

  @js.native
  @Factory
  trait DeleteComputeEnvironmentResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteJobQueueRequest extends js.Object {
    var jobQueue: String
  }

  @js.native
  @Factory
  trait DeleteJobQueueResponse extends js.Object {}

  @js.native
  @Factory
  trait DeregisterJobDefinitionRequest extends js.Object {
    var jobDefinition: String
  }

  @js.native
  @Factory
  trait DeregisterJobDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeComputeEnvironmentsRequest extends js.Object {
    var computeEnvironments: js.UndefOr[StringList]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeComputeEnvironmentsResponse extends js.Object {
    var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeJobDefinitionsRequest extends js.Object {
    var jobDefinitionName: js.UndefOr[String]
    var jobDefinitions: js.UndefOr[StringList]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
    var status: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeJobDefinitionsResponse extends js.Object {
    var jobDefinitions: js.UndefOr[JobDefinitionList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeJobQueuesRequest extends js.Object {
    var jobQueues: js.UndefOr[StringList]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeJobQueuesResponse extends js.Object {
    var jobQueues: js.UndefOr[JobQueueDetailList]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeJobsRequest extends js.Object {
    var jobs: StringList
  }

  @js.native
  @Factory
  trait DescribeJobsResponse extends js.Object {
    var jobs: js.UndefOr[JobDetailList]
  }

  /**
    * An object representing a container instance host device.
    */
  @js.native
  @Factory
  trait Device extends js.Object {
    var hostPath: String
    var containerPath: js.UndefOr[String]
    var permissions: js.UndefOr[DeviceCgroupPermissions]
  }

  @js.native
  sealed trait DeviceCgroupPermission extends js.Any
  object DeviceCgroupPermission extends js.Object {
    val READ  = "READ".asInstanceOf[DeviceCgroupPermission]
    val WRITE = "WRITE".asInstanceOf[DeviceCgroupPermission]
    val MKNOD = "MKNOD".asInstanceOf[DeviceCgroupPermission]

    val values = js.Object.freeze(js.Array(READ, WRITE, MKNOD))
  }

  /**
    * Determine whether your data volume persists on the host container instance and where it is stored. If this parameter is empty, then the Docker daemon assigns a host path for your data volume, but the data is not guaranteed to persist after the containers associated with it stop running.
    */
  @js.native
  @Factory
  trait Host extends js.Object {
    var sourcePath: js.UndefOr[String]
  }

  @js.native
  sealed trait JQState extends js.Any
  object JQState extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[JQState]
    val DISABLED = "DISABLED".asInstanceOf[JQState]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  @js.native
  sealed trait JQStatus extends js.Any
  object JQStatus extends js.Object {
    val CREATING = "CREATING".asInstanceOf[JQStatus]
    val UPDATING = "UPDATING".asInstanceOf[JQStatus]
    val DELETING = "DELETING".asInstanceOf[JQStatus]
    val DELETED  = "DELETED".asInstanceOf[JQStatus]
    val VALID    = "VALID".asInstanceOf[JQStatus]
    val INVALID  = "INVALID".asInstanceOf[JQStatus]

    val values = js.Object.freeze(js.Array(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID))
  }

  /**
    * An object representing an AWS Batch job definition.
    */
  @js.native
  @Factory
  trait JobDefinition extends js.Object {
    var jobDefinitionArn: String
    var jobDefinitionName: String
    var revision: Int
    var `type`: String
    var containerProperties: js.UndefOr[ContainerProperties]
    var nodeProperties: js.UndefOr[NodeProperties]
    var parameters: js.UndefOr[ParametersMap]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var status: js.UndefOr[String]
    var timeout: js.UndefOr[JobTimeout]
  }

  @js.native
  sealed trait JobDefinitionType extends js.Any
  object JobDefinitionType extends js.Object {
    val container = "container".asInstanceOf[JobDefinitionType]
    val multinode = "multinode".asInstanceOf[JobDefinitionType]

    val values = js.Object.freeze(js.Array(container, multinode))
  }

  /**
    * An object representing an AWS Batch job dependency.
    */
  @js.native
  @Factory
  trait JobDependency extends js.Object {
    var jobId: js.UndefOr[String]
    var `type`: js.UndefOr[ArrayJobDependency]
  }

  /**
    * An object representing an AWS Batch job.
    */
  @js.native
  @Factory
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
    var nodeDetails: js.UndefOr[NodeDetails]
    var nodeProperties: js.UndefOr[NodeProperties]
    var parameters: js.UndefOr[ParametersMap]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var statusReason: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
    var timeout: js.UndefOr[JobTimeout]
  }

  /**
    * An object representing the details of an AWS Batch job queue.
    */
  @js.native
  @Factory
  trait JobQueueDetail extends js.Object {
    var computeEnvironmentOrder: ComputeEnvironmentOrders
    var jobQueueArn: String
    var jobQueueName: String
    var priority: Int
    var state: JQState
    var status: js.UndefOr[JQStatus]
    var statusReason: js.UndefOr[String]
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
    val PENDING   = "PENDING".asInstanceOf[JobStatus]
    val RUNNABLE  = "RUNNABLE".asInstanceOf[JobStatus]
    val STARTING  = "STARTING".asInstanceOf[JobStatus]
    val RUNNING   = "RUNNING".asInstanceOf[JobStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[JobStatus]
    val FAILED    = "FAILED".asInstanceOf[JobStatus]

    val values = js.Object.freeze(js.Array(SUBMITTED, PENDING, RUNNABLE, STARTING, RUNNING, SUCCEEDED, FAILED))
  }

  /**
    * An object representing summary details of a job.
    */
  @js.native
  @Factory
  trait JobSummary extends js.Object {
    var jobId: String
    var jobName: String
    var arrayProperties: js.UndefOr[ArrayPropertiesSummary]
    var container: js.UndefOr[ContainerSummary]
    var createdAt: js.UndefOr[Double]
    var nodeProperties: js.UndefOr[NodePropertiesSummary]
    var startedAt: js.UndefOr[Double]
    var status: js.UndefOr[JobStatus]
    var statusReason: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
  }

  /**
    * An object representing a job timeout configuration.
    */
  @js.native
  @Factory
  trait JobTimeout extends js.Object {
    var attemptDurationSeconds: js.UndefOr[Int]
  }

  /**
    * A key-value pair object.
    */
  @js.native
  @Factory
  trait KeyValuePair extends js.Object {
    var name: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  /**
    * An object representing a launch template associated with a compute resource. You must specify either the launch template ID or launch template name in the request, but not both.
    */
  @js.native
  @Factory
  trait LaunchTemplateSpecification extends js.Object {
    var launchTemplateId: js.UndefOr[String]
    var launchTemplateName: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  /**
    * Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  @js.native
  @Factory
  trait LinuxParameters extends js.Object {
    var devices: js.UndefOr[DevicesList]
  }

  @js.native
  @Factory
  trait ListJobsRequest extends js.Object {
    var arrayJobId: js.UndefOr[String]
    var jobQueue: js.UndefOr[String]
    var jobStatus: js.UndefOr[JobStatus]
    var maxResults: js.UndefOr[Int]
    var multiNodeJobId: js.UndefOr[String]
    var nextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListJobsResponse extends js.Object {
    var jobSummaryList: JobSummaryList
    var nextToken: js.UndefOr[String]
  }

  /**
    * Details on a Docker volume mount point that is used in a job's container properties. This parameter maps to <code>Volumes</code> in the [[https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/#create-a-container|Create a container]] section of the Docker Remote API and the <code>--volume</code> option to docker run.
    */
  @js.native
  @Factory
  trait MountPoint extends js.Object {
    var containerPath: js.UndefOr[String]
    var readOnly: js.UndefOr[Boolean]
    var sourceVolume: js.UndefOr[String]
  }

  /**
    * An object representing the elastic network interface for a multi-node parallel job node.
    */
  @js.native
  @Factory
  trait NetworkInterface extends js.Object {
    var attachmentId: js.UndefOr[String]
    var ipv6Address: js.UndefOr[String]
    var privateIpv4Address: js.UndefOr[String]
  }

  /**
    * An object representing the details of a multi-node parallel job node.
    */
  @js.native
  @Factory
  trait NodeDetails extends js.Object {
    var isMainNode: js.UndefOr[Boolean]
    var nodeIndex: js.UndefOr[Int]
  }

  /**
    * Object representing any node overrides to a job definition that is used in a <a>SubmitJob</a> API operation.
    */
  @js.native
  @Factory
  trait NodeOverrides extends js.Object {
    var nodePropertyOverrides: js.UndefOr[NodePropertyOverrides]
    var numNodes: js.UndefOr[Int]
  }

  /**
    * An object representing the node properties of a multi-node parallel job.
    */
  @js.native
  @Factory
  trait NodeProperties extends js.Object {
    var mainNode: Int
    var nodeRangeProperties: NodeRangeProperties
    var numNodes: Int
  }

  /**
    * An object representing the properties of a node that is associated with a multi-node parallel job.
    */
  @js.native
  @Factory
  trait NodePropertiesSummary extends js.Object {
    var isMainNode: js.UndefOr[Boolean]
    var nodeIndex: js.UndefOr[Int]
    var numNodes: js.UndefOr[Int]
  }

  /**
    * Object representing any node overrides to a job definition that is used in a <a>SubmitJob</a> API operation.
    */
  @js.native
  @Factory
  trait NodePropertyOverride extends js.Object {
    var targetNodes: String
    var containerOverrides: js.UndefOr[ContainerOverrides]
  }

  /**
    * An object representing the properties of the node range for a multi-node parallel job.
    */
  @js.native
  @Factory
  trait NodeRangeProperty extends js.Object {
    var targetNodes: String
    var container: js.UndefOr[ContainerProperties]
  }

  @js.native
  @Factory
  trait RegisterJobDefinitionRequest extends js.Object {
    var jobDefinitionName: String
    var `type`: JobDefinitionType
    var containerProperties: js.UndefOr[ContainerProperties]
    var nodeProperties: js.UndefOr[NodeProperties]
    var parameters: js.UndefOr[ParametersMap]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var timeout: js.UndefOr[JobTimeout]
  }

  @js.native
  @Factory
  trait RegisterJobDefinitionResponse extends js.Object {
    var jobDefinitionArn: String
    var jobDefinitionName: String
    var revision: Int
  }

  /**
    * The type and amount of a resource to assign to a container. Currently, the only supported resource type is <code>GPU</code>.
    */
  @js.native
  @Factory
  trait ResourceRequirement extends js.Object {
    var `type`: ResourceType
    var value: String
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val GPU = "GPU".asInstanceOf[ResourceType]

    val values = js.Object.freeze(js.Array(GPU))
  }

  /**
    * The retry strategy associated with a job.
    */
  @js.native
  @Factory
  trait RetryStrategy extends js.Object {
    var attempts: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait SubmitJobRequest extends js.Object {
    var jobDefinition: String
    var jobName: String
    var jobQueue: String
    var arrayProperties: js.UndefOr[ArrayProperties]
    var containerOverrides: js.UndefOr[ContainerOverrides]
    var dependsOn: js.UndefOr[JobDependencyList]
    var nodeOverrides: js.UndefOr[NodeOverrides]
    var parameters: js.UndefOr[ParametersMap]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var timeout: js.UndefOr[JobTimeout]
  }

  @js.native
  @Factory
  trait SubmitJobResponse extends js.Object {
    var jobId: String
    var jobName: String
  }

  @js.native
  @Factory
  trait TerminateJobRequest extends js.Object {
    var jobId: String
    var reason: String
  }

  @js.native
  @Factory
  trait TerminateJobResponse extends js.Object {}

  /**
    * The <code>ulimit</code> settings to pass to the container.
    */
  @js.native
  @Factory
  trait Ulimit extends js.Object {
    var hardLimit: Int
    var name: String
    var softLimit: Int
  }

  @js.native
  @Factory
  trait UpdateComputeEnvironmentRequest extends js.Object {
    var computeEnvironment: String
    var computeResources: js.UndefOr[ComputeResourceUpdate]
    var serviceRole: js.UndefOr[String]
    var state: js.UndefOr[CEState]
  }

  @js.native
  @Factory
  trait UpdateComputeEnvironmentResponse extends js.Object {
    var computeEnvironmentArn: js.UndefOr[String]
    var computeEnvironmentName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateJobQueueRequest extends js.Object {
    var jobQueue: String
    var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders]
    var priority: js.UndefOr[Int]
    var state: js.UndefOr[JQState]
  }

  @js.native
  @Factory
  trait UpdateJobQueueResponse extends js.Object {
    var jobQueueArn: js.UndefOr[String]
    var jobQueueName: js.UndefOr[String]
  }

  /**
    * A data volume used in a job's container properties.
    */
  @js.native
  @Factory
  trait Volume extends js.Object {
    var host: js.UndefOr[Host]
    var name: js.UndefOr[String]
  }
}
