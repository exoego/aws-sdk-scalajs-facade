package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object batch {
  type ArrayJobDependency           = String
  type ArrayJobStatusSummary        = js.Dictionary[Int]
  type AttemptDetails               = js.Array[AttemptDetail]
  type CEState                      = String
  type CEStatus                     = String
  type CEType                       = String
  type CRAllocationStrategy         = String
  type CRType                       = String
  type ComputeEnvironmentDetailList = js.Array[ComputeEnvironmentDetail]
  type ComputeEnvironmentOrders     = js.Array[ComputeEnvironmentOrder]
  type DeviceCgroupPermission       = String
  type DeviceCgroupPermissions      = js.Array[DeviceCgroupPermission]
  type DevicesList                  = js.Array[Device]
  type EnvironmentVariables         = js.Array[KeyValuePair]
  type JQState                      = String
  type JQStatus                     = String
  type JobDefinitionList            = js.Array[JobDefinition]
  type JobDefinitionType            = String
  type JobDependencyList            = js.Array[JobDependency]
  type JobDetailList                = js.Array[JobDetail]
  type JobQueueDetailList           = js.Array[JobQueueDetail]
  type JobStatus                    = String
  type JobSummaryList               = js.Array[JobSummary]
  type MountPoints                  = js.Array[MountPoint]
  type NetworkInterfaceList         = js.Array[NetworkInterface]
  type NodePropertyOverrides        = js.Array[NodePropertyOverride]
  type NodeRangeProperties          = js.Array[NodeRangeProperty]
  type ParametersMap                = js.Dictionary[String]
  type ResourceRequirements         = js.Array[ResourceRequirement]
  type ResourceType                 = String
  type StringList                   = js.Array[String]
  type TagsMap                      = js.Dictionary[String]
  type Ulimits                      = js.Array[Ulimit]
  type Volumes                      = js.Array[Volume]

  implicit final class BatchOps(private val service: Batch) extends AnyVal {
    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] =
      service.cancelJob(params).promise.toFuture
    @inline def createComputeEnvironmentFuture(
        params: CreateComputeEnvironmentRequest
    ): Future[CreateComputeEnvironmentResponse] = service.createComputeEnvironment(params).promise.toFuture
    @inline def createJobQueueFuture(params: CreateJobQueueRequest): Future[CreateJobQueueResponse] =
      service.createJobQueue(params).promise.toFuture
    @inline def deleteComputeEnvironmentFuture(
        params: DeleteComputeEnvironmentRequest
    ): Future[DeleteComputeEnvironmentResponse] = service.deleteComputeEnvironment(params).promise.toFuture
    @inline def deleteJobQueueFuture(params: DeleteJobQueueRequest): Future[DeleteJobQueueResponse] =
      service.deleteJobQueue(params).promise.toFuture
    @inline def deregisterJobDefinitionFuture(
        params: DeregisterJobDefinitionRequest
    ): Future[DeregisterJobDefinitionResponse] = service.deregisterJobDefinition(params).promise.toFuture
    @inline def describeComputeEnvironmentsFuture(
        params: DescribeComputeEnvironmentsRequest
    ): Future[DescribeComputeEnvironmentsResponse] = service.describeComputeEnvironments(params).promise.toFuture
    @inline def describeJobDefinitionsFuture(
        params: DescribeJobDefinitionsRequest
    ): Future[DescribeJobDefinitionsResponse] = service.describeJobDefinitions(params).promise.toFuture
    @inline def describeJobQueuesFuture(params: DescribeJobQueuesRequest): Future[DescribeJobQueuesResponse] =
      service.describeJobQueues(params).promise.toFuture
    @inline def describeJobsFuture(params: DescribeJobsRequest): Future[DescribeJobsResponse] =
      service.describeJobs(params).promise.toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResponse] =
      service.listJobs(params).promise.toFuture
    @inline def registerJobDefinitionFuture(
        params: RegisterJobDefinitionRequest
    ): Future[RegisterJobDefinitionResponse] = service.registerJobDefinition(params).promise.toFuture
    @inline def submitJobFuture(params: SubmitJobRequest): Future[SubmitJobResponse] =
      service.submitJob(params).promise.toFuture
    @inline def terminateJobFuture(params: TerminateJobRequest): Future[TerminateJobResponse] =
      service.terminateJob(params).promise.toFuture
    @inline def updateComputeEnvironmentFuture(
        params: UpdateComputeEnvironmentRequest
    ): Future[UpdateComputeEnvironmentResponse] = service.updateComputeEnvironment(params).promise.toFuture
    @inline def updateJobQueueFuture(params: UpdateJobQueueRequest): Future[UpdateJobQueueResponse] =
      service.updateJobQueue(params).promise.toFuture
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

  object ArrayJobDependencyEnum {
    val N_TO_N     = "N_TO_N"
    val SEQUENTIAL = "SEQUENTIAL"

    val values = js.Object.freeze(js.Array(N_TO_N, SEQUENTIAL))
  }

  /**
    * An object representing an AWS Batch array job.
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

  /**
    * An object representing the array properties of a job.
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

  /**
    * An object representing the array properties of a job.
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

  /**
    * An object representing the details of a container that is part of a job attempt.
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

  /**
    * An object representing a job attempt.
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

  object CEStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  object CEStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val DELETED  = "DELETED"
    val VALID    = "VALID"
    val INVALID  = "INVALID"

    val values = js.Object.freeze(js.Array(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID))
  }

  object CETypeEnum {
    val MANAGED   = "MANAGED"
    val UNMANAGED = "UNMANAGED"

    val values = js.Object.freeze(js.Array(MANAGED, UNMANAGED))
  }

  object CRAllocationStrategyEnum {
    val BEST_FIT                = "BEST_FIT"
    val BEST_FIT_PROGRESSIVE    = "BEST_FIT_PROGRESSIVE"
    val SPOT_CAPACITY_OPTIMIZED = "SPOT_CAPACITY_OPTIMIZED"

    val values = js.Object.freeze(js.Array(BEST_FIT, BEST_FIT_PROGRESSIVE, SPOT_CAPACITY_OPTIMIZED))
  }

  object CRTypeEnum {
    val EC2  = "EC2"
    val SPOT = "SPOT"

    val values = js.Object.freeze(js.Array(EC2, SPOT))
  }

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
        "jobId"  -> jobId.asInstanceOf[js.Any],
        "reason" -> reason.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {}

  object CancelJobResponse {
    @inline
    def apply(
        ): CancelJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[CancelJobResponse]
    }
  }

  /**
    * An object representing an AWS Batch compute environment.
    */
  @js.native
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

  object ComputeEnvironmentDetail {
    @inline
    def apply(
        computeEnvironmentArn: String,
        computeEnvironmentName: String,
        ecsClusterArn: String,
        computeResources: js.UndefOr[ComputeResource] = js.undefined,
        serviceRole: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[CEState] = js.undefined,
        status: js.UndefOr[CEStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[CEType] = js.undefined
    ): ComputeEnvironmentDetail = {
      val __obj = js.Dynamic.literal(
        "computeEnvironmentArn"  -> computeEnvironmentArn.asInstanceOf[js.Any],
        "computeEnvironmentName" -> computeEnvironmentName.asInstanceOf[js.Any],
        "ecsClusterArn"          -> ecsClusterArn.asInstanceOf[js.Any]
      )

      computeResources.foreach(__v => __obj.updateDynamic("computeResources")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeEnvironmentDetail]
    }
  }

  /**
    * The order in which compute environments are tried for job placement within a queue. Compute environments are tried in ascending order. For example, if two compute environments are associated with a job queue, the compute environment with a lower order integer value is tried for job placement first.
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
        "order"              -> order.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ComputeEnvironmentOrder]
    }
  }

  /**
    * An object representing an AWS Batch compute resource.
    */
  @js.native
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

  object ComputeResource {
    @inline
    def apply(
        instanceRole: String,
        instanceTypes: StringList,
        maxvCpus: Int,
        minvCpus: Int,
        subnets: StringList,
        `type`: CRType,
        allocationStrategy: js.UndefOr[CRAllocationStrategy] = js.undefined,
        bidPercentage: js.UndefOr[Int] = js.undefined,
        desiredvCpus: js.UndefOr[Int] = js.undefined,
        ec2KeyPair: js.UndefOr[String] = js.undefined,
        imageId: js.UndefOr[String] = js.undefined,
        launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
        placementGroup: js.UndefOr[String] = js.undefined,
        securityGroupIds: js.UndefOr[StringList] = js.undefined,
        spotIamFleetRole: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ComputeResource = {
      val __obj = js.Dynamic.literal(
        "instanceRole"  -> instanceRole.asInstanceOf[js.Any],
        "instanceTypes" -> instanceTypes.asInstanceOf[js.Any],
        "maxvCpus"      -> maxvCpus.asInstanceOf[js.Any],
        "minvCpus"      -> minvCpus.asInstanceOf[js.Any],
        "subnets"       -> subnets.asInstanceOf[js.Any],
        "type"          -> `type`.asInstanceOf[js.Any]
      )

      allocationStrategy.foreach(__v => __obj.updateDynamic("allocationStrategy")(__v.asInstanceOf[js.Any]))
      bidPercentage.foreach(__v => __obj.updateDynamic("bidPercentage")(__v.asInstanceOf[js.Any]))
      desiredvCpus.foreach(__v => __obj.updateDynamic("desiredvCpus")(__v.asInstanceOf[js.Any]))
      ec2KeyPair.foreach(__v => __obj.updateDynamic("ec2KeyPair")(__v.asInstanceOf[js.Any]))
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      launchTemplate.foreach(__v => __obj.updateDynamic("launchTemplate")(__v.asInstanceOf[js.Any]))
      placementGroup.foreach(__v => __obj.updateDynamic("placementGroup")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      spotIamFleetRole.foreach(__v => __obj.updateDynamic("spotIamFleetRole")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeResource]
    }
  }

  /**
    * An object representing the attributes of a compute environment that can be updated.
    */
  @js.native
  trait ComputeResourceUpdate extends js.Object {
    var desiredvCpus: js.UndefOr[Int]
    var maxvCpus: js.UndefOr[Int]
    var minvCpus: js.UndefOr[Int]
  }

  object ComputeResourceUpdate {
    @inline
    def apply(
        desiredvCpus: js.UndefOr[Int] = js.undefined,
        maxvCpus: js.UndefOr[Int] = js.undefined,
        minvCpus: js.UndefOr[Int] = js.undefined
    ): ComputeResourceUpdate = {
      val __obj = js.Dynamic.literal()
      desiredvCpus.foreach(__v => __obj.updateDynamic("desiredvCpus")(__v.asInstanceOf[js.Any]))
      maxvCpus.foreach(__v => __obj.updateDynamic("maxvCpus")(__v.asInstanceOf[js.Any]))
      minvCpus.foreach(__v => __obj.updateDynamic("minvCpus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComputeResourceUpdate]
    }
  }

  /**
    * An object representing the details of a container that is part of a job.
    */
  @js.native
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

  object ContainerDetail {
    @inline
    def apply(
        command: js.UndefOr[StringList] = js.undefined,
        containerInstanceArn: js.UndefOr[String] = js.undefined,
        environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        exitCode: js.UndefOr[Int] = js.undefined,
        image: js.UndefOr[String] = js.undefined,
        instanceType: js.UndefOr[String] = js.undefined,
        jobRoleArn: js.UndefOr[String] = js.undefined,
        linuxParameters: js.UndefOr[LinuxParameters] = js.undefined,
        logStreamName: js.UndefOr[String] = js.undefined,
        memory: js.UndefOr[Int] = js.undefined,
        mountPoints: js.UndefOr[MountPoints] = js.undefined,
        networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined,
        privileged: js.UndefOr[Boolean] = js.undefined,
        readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
        reason: js.UndefOr[String] = js.undefined,
        resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined,
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
      exitCode.foreach(__v => __obj.updateDynamic("exitCode")(__v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      jobRoleArn.foreach(__v => __obj.updateDynamic("jobRoleArn")(__v.asInstanceOf[js.Any]))
      linuxParameters.foreach(__v => __obj.updateDynamic("linuxParameters")(__v.asInstanceOf[js.Any]))
      logStreamName.foreach(__v => __obj.updateDynamic("logStreamName")(__v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.updateDynamic("memory")(__v.asInstanceOf[js.Any]))
      mountPoints.foreach(__v => __obj.updateDynamic("mountPoints")(__v.asInstanceOf[js.Any]))
      networkInterfaces.foreach(__v => __obj.updateDynamic("networkInterfaces")(__v.asInstanceOf[js.Any]))
      privileged.foreach(__v => __obj.updateDynamic("privileged")(__v.asInstanceOf[js.Any]))
      readonlyRootFilesystem.foreach(__v => __obj.updateDynamic("readonlyRootFilesystem")(__v.asInstanceOf[js.Any]))
      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      resourceRequirements.foreach(__v => __obj.updateDynamic("resourceRequirements")(__v.asInstanceOf[js.Any]))
      taskArn.foreach(__v => __obj.updateDynamic("taskArn")(__v.asInstanceOf[js.Any]))
      ulimits.foreach(__v => __obj.updateDynamic("ulimits")(__v.asInstanceOf[js.Any]))
      user.foreach(__v => __obj.updateDynamic("user")(__v.asInstanceOf[js.Any]))
      vcpus.foreach(__v => __obj.updateDynamic("vcpus")(__v.asInstanceOf[js.Any]))
      volumes.foreach(__v => __obj.updateDynamic("volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerDetail]
    }
  }

  /**
    * The overrides that should be sent to a container.
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

  /**
    * Container properties are used in job definitions to describe the container that is launched as part of a job.
    */
  @js.native
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

  object ContainerProperties {
    @inline
    def apply(
        command: js.UndefOr[StringList] = js.undefined,
        environment: js.UndefOr[EnvironmentVariables] = js.undefined,
        image: js.UndefOr[String] = js.undefined,
        instanceType: js.UndefOr[String] = js.undefined,
        jobRoleArn: js.UndefOr[String] = js.undefined,
        linuxParameters: js.UndefOr[LinuxParameters] = js.undefined,
        memory: js.UndefOr[Int] = js.undefined,
        mountPoints: js.UndefOr[MountPoints] = js.undefined,
        privileged: js.UndefOr[Boolean] = js.undefined,
        readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
        resourceRequirements: js.UndefOr[ResourceRequirements] = js.undefined,
        ulimits: js.UndefOr[Ulimits] = js.undefined,
        user: js.UndefOr[String] = js.undefined,
        vcpus: js.UndefOr[Int] = js.undefined,
        volumes: js.UndefOr[Volumes] = js.undefined
    ): ContainerProperties = {
      val __obj = js.Dynamic.literal()
      command.foreach(__v => __obj.updateDynamic("command")(__v.asInstanceOf[js.Any]))
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.updateDynamic("image")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      jobRoleArn.foreach(__v => __obj.updateDynamic("jobRoleArn")(__v.asInstanceOf[js.Any]))
      linuxParameters.foreach(__v => __obj.updateDynamic("linuxParameters")(__v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.updateDynamic("memory")(__v.asInstanceOf[js.Any]))
      mountPoints.foreach(__v => __obj.updateDynamic("mountPoints")(__v.asInstanceOf[js.Any]))
      privileged.foreach(__v => __obj.updateDynamic("privileged")(__v.asInstanceOf[js.Any]))
      readonlyRootFilesystem.foreach(__v => __obj.updateDynamic("readonlyRootFilesystem")(__v.asInstanceOf[js.Any]))
      resourceRequirements.foreach(__v => __obj.updateDynamic("resourceRequirements")(__v.asInstanceOf[js.Any]))
      ulimits.foreach(__v => __obj.updateDynamic("ulimits")(__v.asInstanceOf[js.Any]))
      user.foreach(__v => __obj.updateDynamic("user")(__v.asInstanceOf[js.Any]))
      vcpus.foreach(__v => __obj.updateDynamic("vcpus")(__v.asInstanceOf[js.Any]))
      volumes.foreach(__v => __obj.updateDynamic("volumes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContainerProperties]
    }
  }

  /**
    * An object representing summary details of a container within a job.
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

  @js.native
  trait CreateComputeEnvironmentRequest extends js.Object {
    var computeEnvironmentName: String
    var serviceRole: String
    var `type`: CEType
    var computeResources: js.UndefOr[ComputeResource]
    var state: js.UndefOr[CEState]
  }

  object CreateComputeEnvironmentRequest {
    @inline
    def apply(
        computeEnvironmentName: String,
        serviceRole: String,
        `type`: CEType,
        computeResources: js.UndefOr[ComputeResource] = js.undefined,
        state: js.UndefOr[CEState] = js.undefined
    ): CreateComputeEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "computeEnvironmentName" -> computeEnvironmentName.asInstanceOf[js.Any],
        "serviceRole"            -> serviceRole.asInstanceOf[js.Any],
        "type"                   -> `type`.asInstanceOf[js.Any]
      )

      computeResources.foreach(__v => __obj.updateDynamic("computeResources")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait CreateJobQueueRequest extends js.Object {
    var computeEnvironmentOrder: ComputeEnvironmentOrders
    var jobQueueName: String
    var priority: Int
    var state: js.UndefOr[JQState]
  }

  object CreateJobQueueRequest {
    @inline
    def apply(
        computeEnvironmentOrder: ComputeEnvironmentOrders,
        jobQueueName: String,
        priority: Int,
        state: js.UndefOr[JQState] = js.undefined
    ): CreateJobQueueRequest = {
      val __obj = js.Dynamic.literal(
        "computeEnvironmentOrder" -> computeEnvironmentOrder.asInstanceOf[js.Any],
        "jobQueueName"            -> jobQueueName.asInstanceOf[js.Any],
        "priority"                -> priority.asInstanceOf[js.Any]
      )

      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
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
        "jobQueueArn"  -> jobQueueArn.asInstanceOf[js.Any],
        "jobQueueName" -> jobQueueName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateJobQueueResponse]
    }
  }

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
  trait DeleteComputeEnvironmentResponse extends js.Object {}

  object DeleteComputeEnvironmentResponse {
    @inline
    def apply(
        ): DeleteComputeEnvironmentResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteComputeEnvironmentResponse]
    }
  }

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
  trait DeleteJobQueueResponse extends js.Object {}

  object DeleteJobQueueResponse {
    @inline
    def apply(
        ): DeleteJobQueueResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteJobQueueResponse]
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
  trait DeregisterJobDefinitionResponse extends js.Object {}

  object DeregisterJobDefinitionResponse {
    @inline
    def apply(
        ): DeregisterJobDefinitionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeregisterJobDefinitionResponse]
    }
  }

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

  /**
    * An object representing a container instance host device.
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

  object DeviceCgroupPermissionEnum {
    val READ  = "READ"
    val WRITE = "WRITE"
    val MKNOD = "MKNOD"

    val values = js.Object.freeze(js.Array(READ, WRITE, MKNOD))
  }

  /**
    * Determine whether your data volume persists on the host container instance and where it is stored. If this parameter is empty, then the Docker daemon assigns a host path for your data volume, but the data is not guaranteed to persist after the containers associated with it stop running.
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

  object JQStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  object JQStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val DELETED  = "DELETED"
    val VALID    = "VALID"
    val INVALID  = "INVALID"

    val values = js.Object.freeze(js.Array(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID))
  }

  /**
    * An object representing an AWS Batch job definition.
    */
  @js.native
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

  object JobDefinition {
    @inline
    def apply(
        jobDefinitionArn: String,
        jobDefinitionName: String,
        revision: Int,
        `type`: String,
        containerProperties: js.UndefOr[ContainerProperties] = js.undefined,
        nodeProperties: js.UndefOr[NodeProperties] = js.undefined,
        parameters: js.UndefOr[ParametersMap] = js.undefined,
        retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
        status: js.UndefOr[String] = js.undefined,
        timeout: js.UndefOr[JobTimeout] = js.undefined
    ): JobDefinition = {
      val __obj = js.Dynamic.literal(
        "jobDefinitionArn"  -> jobDefinitionArn.asInstanceOf[js.Any],
        "jobDefinitionName" -> jobDefinitionName.asInstanceOf[js.Any],
        "revision"          -> revision.asInstanceOf[js.Any],
        "type"              -> `type`.asInstanceOf[js.Any]
      )

      containerProperties.foreach(__v => __obj.updateDynamic("containerProperties")(__v.asInstanceOf[js.Any]))
      nodeProperties.foreach(__v => __obj.updateDynamic("nodeProperties")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      retryStrategy.foreach(__v => __obj.updateDynamic("retryStrategy")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDefinition]
    }
  }

  object JobDefinitionTypeEnum {
    val container = "container"
    val multinode = "multinode"

    val values = js.Object.freeze(js.Array(container, multinode))
  }

  /**
    * An object representing an AWS Batch job dependency.
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

  /**
    * An object representing an AWS Batch job.
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
    var nodeDetails: js.UndefOr[NodeDetails]
    var nodeProperties: js.UndefOr[NodeProperties]
    var parameters: js.UndefOr[ParametersMap]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var statusReason: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
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
        nodeDetails: js.UndefOr[NodeDetails] = js.undefined,
        nodeProperties: js.UndefOr[NodeProperties] = js.undefined,
        parameters: js.UndefOr[ParametersMap] = js.undefined,
        retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        stoppedAt: js.UndefOr[Double] = js.undefined,
        timeout: js.UndefOr[JobTimeout] = js.undefined
    ): JobDetail = {
      val __obj = js.Dynamic.literal(
        "jobDefinition" -> jobDefinition.asInstanceOf[js.Any],
        "jobId"         -> jobId.asInstanceOf[js.Any],
        "jobName"       -> jobName.asInstanceOf[js.Any],
        "jobQueue"      -> jobQueue.asInstanceOf[js.Any],
        "startedAt"     -> startedAt.asInstanceOf[js.Any],
        "status"        -> status.asInstanceOf[js.Any]
      )

      arrayProperties.foreach(__v => __obj.updateDynamic("arrayProperties")(__v.asInstanceOf[js.Any]))
      attempts.foreach(__v => __obj.updateDynamic("attempts")(__v.asInstanceOf[js.Any]))
      container.foreach(__v => __obj.updateDynamic("container")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      dependsOn.foreach(__v => __obj.updateDynamic("dependsOn")(__v.asInstanceOf[js.Any]))
      nodeDetails.foreach(__v => __obj.updateDynamic("nodeDetails")(__v.asInstanceOf[js.Any]))
      nodeProperties.foreach(__v => __obj.updateDynamic("nodeProperties")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      retryStrategy.foreach(__v => __obj.updateDynamic("retryStrategy")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      stoppedAt.foreach(__v => __obj.updateDynamic("stoppedAt")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobDetail]
    }
  }

  /**
    * An object representing the details of an AWS Batch job queue.
    */
  @js.native
  trait JobQueueDetail extends js.Object {
    var computeEnvironmentOrder: ComputeEnvironmentOrders
    var jobQueueArn: String
    var jobQueueName: String
    var priority: Int
    var state: JQState
    var status: js.UndefOr[JQStatus]
    var statusReason: js.UndefOr[String]
  }

  object JobQueueDetail {
    @inline
    def apply(
        computeEnvironmentOrder: ComputeEnvironmentOrders,
        jobQueueArn: String,
        jobQueueName: String,
        priority: Int,
        state: JQState,
        status: js.UndefOr[JQStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined
    ): JobQueueDetail = {
      val __obj = js.Dynamic.literal(
        "computeEnvironmentOrder" -> computeEnvironmentOrder.asInstanceOf[js.Any],
        "jobQueueArn"             -> jobQueueArn.asInstanceOf[js.Any],
        "jobQueueName"            -> jobQueueName.asInstanceOf[js.Any],
        "priority"                -> priority.asInstanceOf[js.Any],
        "state"                   -> state.asInstanceOf[js.Any]
      )

      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobQueueDetail]
    }
  }

  object JobStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val PENDING   = "PENDING"
    val RUNNABLE  = "RUNNABLE"
    val STARTING  = "STARTING"
    val RUNNING   = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED    = "FAILED"

    val values = js.Object.freeze(js.Array(SUBMITTED, PENDING, RUNNABLE, STARTING, RUNNING, SUCCEEDED, FAILED))
  }

  /**
    * An object representing summary details of a job.
    */
  @js.native
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

  object JobSummary {
    @inline
    def apply(
        jobId: String,
        jobName: String,
        arrayProperties: js.UndefOr[ArrayPropertiesSummary] = js.undefined,
        container: js.UndefOr[ContainerSummary] = js.undefined,
        createdAt: js.UndefOr[Double] = js.undefined,
        nodeProperties: js.UndefOr[NodePropertiesSummary] = js.undefined,
        startedAt: js.UndefOr[Double] = js.undefined,
        status: js.UndefOr[JobStatus] = js.undefined,
        statusReason: js.UndefOr[String] = js.undefined,
        stoppedAt: js.UndefOr[Double] = js.undefined
    ): JobSummary = {
      val __obj = js.Dynamic.literal(
        "jobId"   -> jobId.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any]
      )

      arrayProperties.foreach(__v => __obj.updateDynamic("arrayProperties")(__v.asInstanceOf[js.Any]))
      container.foreach(__v => __obj.updateDynamic("container")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      nodeProperties.foreach(__v => __obj.updateDynamic("nodeProperties")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.updateDynamic("statusReason")(__v.asInstanceOf[js.Any]))
      stoppedAt.foreach(__v => __obj.updateDynamic("stoppedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSummary]
    }
  }

  /**
    * An object representing a job timeout configuration.
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

  /**
    * A key-value pair object.
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

  /**
    * An object representing a launch template associated with a compute resource. You must specify either the launch template ID or launch template name in the request, but not both.
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

  /**
    * Linux-specific modifications that are applied to the container, such as details for device mappings.
    */
  @js.native
  trait LinuxParameters extends js.Object {
    var devices: js.UndefOr[DevicesList]
  }

  object LinuxParameters {
    @inline
    def apply(
        devices: js.UndefOr[DevicesList] = js.undefined
    ): LinuxParameters = {
      val __obj = js.Dynamic.literal()
      devices.foreach(__v => __obj.updateDynamic("devices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LinuxParameters]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var arrayJobId: js.UndefOr[String]
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
        jobQueue: js.UndefOr[String] = js.undefined,
        jobStatus: js.UndefOr[JobStatus] = js.undefined,
        maxResults: js.UndefOr[Int] = js.undefined,
        multiNodeJobId: js.UndefOr[String] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dynamic.literal()
      arrayJobId.foreach(__v => __obj.updateDynamic("arrayJobId")(__v.asInstanceOf[js.Any]))
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

  /**
    * Details on a Docker volume mount point that is used in a job's container properties. This parameter maps to <code>Volumes</code> in the [[https://docs.docker.com/engine/reference/api/docker_remote_api_v1.19/#create-a-container|Create a container]] section of the Docker Remote API and the <code>--volume</code> option to docker run.
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

  /**
    * An object representing the elastic network interface for a multi-node parallel job node.
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

  /**
    * An object representing the details of a multi-node parallel job node.
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

  /**
    * Object representing any node overrides to a job definition that is used in a <a>SubmitJob</a> API operation.
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

  /**
    * An object representing the node properties of a multi-node parallel job.
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
        "mainNode"            -> mainNode.asInstanceOf[js.Any],
        "nodeRangeProperties" -> nodeRangeProperties.asInstanceOf[js.Any],
        "numNodes"            -> numNodes.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NodeProperties]
    }
  }

  /**
    * An object representing the properties of a node that is associated with a multi-node parallel job.
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

  /**
    * Object representing any node overrides to a job definition that is used in a <a>SubmitJob</a> API operation.
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

  /**
    * An object representing the properties of the node range for a multi-node parallel job.
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

  @js.native
  trait RegisterJobDefinitionRequest extends js.Object {
    var jobDefinitionName: String
    var `type`: JobDefinitionType
    var containerProperties: js.UndefOr[ContainerProperties]
    var nodeProperties: js.UndefOr[NodeProperties]
    var parameters: js.UndefOr[ParametersMap]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var timeout: js.UndefOr[JobTimeout]
  }

  object RegisterJobDefinitionRequest {
    @inline
    def apply(
        jobDefinitionName: String,
        `type`: JobDefinitionType,
        containerProperties: js.UndefOr[ContainerProperties] = js.undefined,
        nodeProperties: js.UndefOr[NodeProperties] = js.undefined,
        parameters: js.UndefOr[ParametersMap] = js.undefined,
        retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
        timeout: js.UndefOr[JobTimeout] = js.undefined
    ): RegisterJobDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "jobDefinitionName" -> jobDefinitionName.asInstanceOf[js.Any],
        "type"              -> `type`.asInstanceOf[js.Any]
      )

      containerProperties.foreach(__v => __obj.updateDynamic("containerProperties")(__v.asInstanceOf[js.Any]))
      nodeProperties.foreach(__v => __obj.updateDynamic("nodeProperties")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      retryStrategy.foreach(__v => __obj.updateDynamic("retryStrategy")(__v.asInstanceOf[js.Any]))
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
        "jobDefinitionArn"  -> jobDefinitionArn.asInstanceOf[js.Any],
        "jobDefinitionName" -> jobDefinitionName.asInstanceOf[js.Any],
        "revision"          -> revision.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RegisterJobDefinitionResponse]
    }
  }

  /**
    * The type and amount of a resource to assign to a container. Currently, the only supported resource type is <code>GPU</code>.
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
        "type"  -> `type`.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceRequirement]
    }
  }

  object ResourceTypeEnum {
    val GPU = "GPU"

    val values = js.Object.freeze(js.Array(GPU))
  }

  /**
    * The retry strategy associated with a job.
    */
  @js.native
  trait RetryStrategy extends js.Object {
    var attempts: js.UndefOr[Int]
  }

  object RetryStrategy {
    @inline
    def apply(
        attempts: js.UndefOr[Int] = js.undefined
    ): RetryStrategy = {
      val __obj = js.Dynamic.literal()
      attempts.foreach(__v => __obj.updateDynamic("attempts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetryStrategy]
    }
  }

  @js.native
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

  object SubmitJobRequest {
    @inline
    def apply(
        jobDefinition: String,
        jobName: String,
        jobQueue: String,
        arrayProperties: js.UndefOr[ArrayProperties] = js.undefined,
        containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined,
        dependsOn: js.UndefOr[JobDependencyList] = js.undefined,
        nodeOverrides: js.UndefOr[NodeOverrides] = js.undefined,
        parameters: js.UndefOr[ParametersMap] = js.undefined,
        retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
        timeout: js.UndefOr[JobTimeout] = js.undefined
    ): SubmitJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobDefinition" -> jobDefinition.asInstanceOf[js.Any],
        "jobName"       -> jobName.asInstanceOf[js.Any],
        "jobQueue"      -> jobQueue.asInstanceOf[js.Any]
      )

      arrayProperties.foreach(__v => __obj.updateDynamic("arrayProperties")(__v.asInstanceOf[js.Any]))
      containerOverrides.foreach(__v => __obj.updateDynamic("containerOverrides")(__v.asInstanceOf[js.Any]))
      dependsOn.foreach(__v => __obj.updateDynamic("dependsOn")(__v.asInstanceOf[js.Any]))
      nodeOverrides.foreach(__v => __obj.updateDynamic("nodeOverrides")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      retryStrategy.foreach(__v => __obj.updateDynamic("retryStrategy")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubmitJobRequest]
    }
  }

  @js.native
  trait SubmitJobResponse extends js.Object {
    var jobId: String
    var jobName: String
  }

  object SubmitJobResponse {
    @inline
    def apply(
        jobId: String,
        jobName: String
    ): SubmitJobResponse = {
      val __obj = js.Dynamic.literal(
        "jobId"   -> jobId.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SubmitJobResponse]
    }
  }

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
        "jobId"  -> jobId.asInstanceOf[js.Any],
        "reason" -> reason.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TerminateJobRequest]
    }
  }

  @js.native
  trait TerminateJobResponse extends js.Object {}

  object TerminateJobResponse {
    @inline
    def apply(
        ): TerminateJobResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TerminateJobResponse]
    }
  }

  /**
    * The <code>ulimit</code> settings to pass to the container.
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
        "name"      -> name.asInstanceOf[js.Any],
        "softLimit" -> softLimit.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Ulimit]
    }
  }

  @js.native
  trait UpdateComputeEnvironmentRequest extends js.Object {
    var computeEnvironment: String
    var computeResources: js.UndefOr[ComputeResourceUpdate]
    var serviceRole: js.UndefOr[String]
    var state: js.UndefOr[CEState]
  }

  object UpdateComputeEnvironmentRequest {
    @inline
    def apply(
        computeEnvironment: String,
        computeResources: js.UndefOr[ComputeResourceUpdate] = js.undefined,
        serviceRole: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[CEState] = js.undefined
    ): UpdateComputeEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "computeEnvironment" -> computeEnvironment.asInstanceOf[js.Any]
      )

      computeResources.foreach(__v => __obj.updateDynamic("computeResources")(__v.asInstanceOf[js.Any]))
      serviceRole.foreach(__v => __obj.updateDynamic("serviceRole")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
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

  @js.native
  trait UpdateJobQueueRequest extends js.Object {
    var jobQueue: String
    var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders]
    var priority: js.UndefOr[Int]
    var state: js.UndefOr[JQState]
  }

  object UpdateJobQueueRequest {
    @inline
    def apply(
        jobQueue: String,
        computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.undefined,
        priority: js.UndefOr[Int] = js.undefined,
        state: js.UndefOr[JQState] = js.undefined
    ): UpdateJobQueueRequest = {
      val __obj = js.Dynamic.literal(
        "jobQueue" -> jobQueue.asInstanceOf[js.Any]
      )

      computeEnvironmentOrder.foreach(__v => __obj.updateDynamic("computeEnvironmentOrder")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
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

  /**
    * A data volume used in a job's container properties.
    */
  @js.native
  trait Volume extends js.Object {
    var host: js.UndefOr[Host]
    var name: js.UndefOr[String]
  }

  object Volume {
    @inline
    def apply(
        host: js.UndefOr[Host] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): Volume = {
      val __obj = js.Dynamic.literal()
      host.foreach(__v => __obj.updateDynamic("host")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Volume]
    }
  }
}
