package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object batch {
  type ArrayJobDependency = String
  type ArrayJobStatusSummary = js.Dictionary[Int]
  type AttemptDetails = js.Array[AttemptDetail]
  type CEState = String
  type CEStatus = String
  type CEType = String
  type CRType = String
  type ComputeEnvironmentDetailList = js.Array[ComputeEnvironmentDetail]
  type ComputeEnvironmentOrders = js.Array[ComputeEnvironmentOrder]
  type EnvironmentVariables = js.Array[KeyValuePair]
  type JQState = String
  type JQStatus = String
  type JobDefinitionList = js.Array[JobDefinition]
  type JobDefinitionType = String
  type JobDependencyList = js.Array[JobDependency]
  type JobDetailList = js.Array[JobDetail]
  type JobQueueDetailList = js.Array[JobQueueDetail]
  type JobStatus = String
  type JobSummaryList = js.Array[JobSummary]
  type MountPoints = js.Array[MountPoint]
  type ParametersMap = js.Dictionary[String]
  type StringList = js.Array[String]
  type TagsMap = js.Dictionary[String]
  type Ulimits = js.Array[Ulimit]
  type Volumes = js.Array[Volume]
}

package batch {
  @js.native
  @JSImport("aws-sdk", "Batch")
  class Batch(config: AWSConfig) extends js.Object {
    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse] = js.native
    def createComputeEnvironment(params: CreateComputeEnvironmentRequest): Request[CreateComputeEnvironmentResponse] = js.native
    def createJobQueue(params: CreateJobQueueRequest): Request[CreateJobQueueResponse] = js.native
    def deleteComputeEnvironment(params: DeleteComputeEnvironmentRequest): Request[DeleteComputeEnvironmentResponse] = js.native
    def deleteJobQueue(params: DeleteJobQueueRequest): Request[DeleteJobQueueResponse] = js.native
    def deregisterJobDefinition(params: DeregisterJobDefinitionRequest): Request[DeregisterJobDefinitionResponse] = js.native
    def describeComputeEnvironments(params: DescribeComputeEnvironmentsRequest): Request[DescribeComputeEnvironmentsResponse] = js.native
    def describeJobDefinitions(params: DescribeJobDefinitionsRequest): Request[DescribeJobDefinitionsResponse] = js.native
    def describeJobQueues(params: DescribeJobQueuesRequest): Request[DescribeJobQueuesResponse] = js.native
    def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResponse] = js.native
    def registerJobDefinition(params: RegisterJobDefinitionRequest): Request[RegisterJobDefinitionResponse] = js.native
    def submitJob(params: SubmitJobRequest): Request[SubmitJobResponse] = js.native
    def terminateJob(params: TerminateJobRequest): Request[TerminateJobResponse] = js.native
    def updateComputeEnvironment(params: UpdateComputeEnvironmentRequest): Request[UpdateComputeEnvironmentResponse] = js.native
    def updateJobQueue(params: UpdateJobQueueRequest): Request[UpdateJobQueueResponse] = js.native
  }

  object ArrayJobDependencyEnum {
    val N_TO_N = "N_TO_N"
    val SEQUENTIAL = "SEQUENTIAL"

    val values = IndexedSeq(N_TO_N, SEQUENTIAL)
  }

  /**
   * <p>An object representing an AWS Batch array job.</p>
   */
  @js.native
  trait ArrayProperties extends js.Object {
    var size: js.UndefOr[Int]
  }

  object ArrayProperties {
    def apply(
      size: js.UndefOr[Int] = js.undefined): ArrayProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "size" -> size.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArrayProperties]
    }
  }

  /**
   * <p>An object representing the array properties of a job.</p>
   */
  @js.native
  trait ArrayPropertiesDetail extends js.Object {
    var statusSummary: js.UndefOr[ArrayJobStatusSummary]
    var size: js.UndefOr[Int]
    var index: js.UndefOr[Int]
  }

  object ArrayPropertiesDetail {
    def apply(
      statusSummary: js.UndefOr[ArrayJobStatusSummary] = js.undefined,
      size: js.UndefOr[Int] = js.undefined,
      index: js.UndefOr[Int] = js.undefined): ArrayPropertiesDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusSummary" -> statusSummary.map { x => x.asInstanceOf[js.Any] },
        "size" -> size.map { x => x.asInstanceOf[js.Any] },
        "index" -> index.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArrayPropertiesDetail]
    }
  }

  /**
   * <p>An object representing the array properties of a job.</p>
   */
  @js.native
  trait ArrayPropertiesSummary extends js.Object {
    var size: js.UndefOr[Int]
    var index: js.UndefOr[Int]
  }

  object ArrayPropertiesSummary {
    def apply(
      size: js.UndefOr[Int] = js.undefined,
      index: js.UndefOr[Int] = js.undefined): ArrayPropertiesSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "size" -> size.map { x => x.asInstanceOf[js.Any] },
        "index" -> index.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArrayPropertiesSummary]
    }
  }

  /**
   * <p>An object representing the details of a container that is part of a job attempt.</p>
   */
  @js.native
  trait AttemptContainerDetail extends js.Object {
    var exitCode: js.UndefOr[Int]
    var reason: js.UndefOr[String]
    var logStreamName: js.UndefOr[String]
    var taskArn: js.UndefOr[String]
    var containerInstanceArn: js.UndefOr[String]
  }

  object AttemptContainerDetail {
    def apply(
      exitCode: js.UndefOr[Int] = js.undefined,
      reason: js.UndefOr[String] = js.undefined,
      logStreamName: js.UndefOr[String] = js.undefined,
      taskArn: js.UndefOr[String] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined): AttemptContainerDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exitCode" -> exitCode.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "taskArn" -> taskArn.map { x => x.asInstanceOf[js.Any] },
        "containerInstanceArn" -> containerInstanceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttemptContainerDetail]
    }
  }

  /**
   * <p>An object representing a job attempt.</p>
   */
  @js.native
  trait AttemptDetail extends js.Object {
    var container: js.UndefOr[AttemptContainerDetail]
    var startedAt: js.UndefOr[Double]
    var stoppedAt: js.UndefOr[Double]
    var statusReason: js.UndefOr[String]
  }

  object AttemptDetail {
    def apply(
      container: js.UndefOr[AttemptContainerDetail] = js.undefined,
      startedAt: js.UndefOr[Double] = js.undefined,
      stoppedAt: js.UndefOr[Double] = js.undefined,
      statusReason: js.UndefOr[String] = js.undefined): AttemptDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "container" -> container.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "stoppedAt" -> stoppedAt.map { x => x.asInstanceOf[js.Any] },
        "statusReason" -> statusReason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttemptDetail]
    }
  }

  object CEStateEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  object CEStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val DELETED = "DELETED"
    val VALID = "VALID"
    val INVALID = "INVALID"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
  }

  object CETypeEnum {
    val MANAGED = "MANAGED"
    val UNMANAGED = "UNMANAGED"

    val values = IndexedSeq(MANAGED, UNMANAGED)
  }

  object CRTypeEnum {
    val EC2 = "EC2"
    val SPOT = "SPOT"

    val values = IndexedSeq(EC2, SPOT)
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var jobId: js.UndefOr[String]
    var reason: js.UndefOr[String]
  }

  object CancelJobRequest {
    def apply(
      jobId: js.UndefOr[String] = js.undefined,
      reason: js.UndefOr[String] = js.undefined): CancelJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {

  }

  object CancelJobResponse {
    def apply(): CancelJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobResponse]
    }
  }

  /**
   * <p>An object representing an AWS Batch compute environment.</p>
   */
  @js.native
  trait ComputeEnvironmentDetail extends js.Object {
    var statusReason: js.UndefOr[String]
    var state: js.UndefOr[CEState]
    var serviceRole: js.UndefOr[String]
    var computeEnvironmentName: js.UndefOr[String]
    var computeResources: js.UndefOr[ComputeResource]
    var computeEnvironmentArn: js.UndefOr[String]
    var status: js.UndefOr[CEStatus]
    var `type`: js.UndefOr[CEType]
    var ecsClusterArn: js.UndefOr[String]
  }

  object ComputeEnvironmentDetail {
    def apply(
      statusReason: js.UndefOr[String] = js.undefined,
      state: js.UndefOr[CEState] = js.undefined,
      serviceRole: js.UndefOr[String] = js.undefined,
      computeEnvironmentName: js.UndefOr[String] = js.undefined,
      computeResources: js.UndefOr[ComputeResource] = js.undefined,
      computeEnvironmentArn: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[CEStatus] = js.undefined,
      `type`: js.UndefOr[CEType] = js.undefined,
      ecsClusterArn: js.UndefOr[String] = js.undefined): ComputeEnvironmentDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusReason" -> statusReason.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "serviceRole" -> serviceRole.map { x => x.asInstanceOf[js.Any] },
        "computeEnvironmentName" -> computeEnvironmentName.map { x => x.asInstanceOf[js.Any] },
        "computeResources" -> computeResources.map { x => x.asInstanceOf[js.Any] },
        "computeEnvironmentArn" -> computeEnvironmentArn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "ecsClusterArn" -> ecsClusterArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeEnvironmentDetail]
    }
  }

  /**
   * <p>The order in which compute environments are tried for job placement within a queue. Compute environments are tried in ascending order. For example, if two compute environments are associated with a job queue, the compute environment with a lower order integer value is tried for job placement first.</p>
   */
  @js.native
  trait ComputeEnvironmentOrder extends js.Object {
    var order: js.UndefOr[Int]
    var computeEnvironment: js.UndefOr[String]
  }

  object ComputeEnvironmentOrder {
    def apply(
      order: js.UndefOr[Int] = js.undefined,
      computeEnvironment: js.UndefOr[String] = js.undefined): ComputeEnvironmentOrder = {
      val _fields = IndexedSeq[(String, js.Any)](
        "order" -> order.map { x => x.asInstanceOf[js.Any] },
        "computeEnvironment" -> computeEnvironment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeEnvironmentOrder]
    }
  }

  /**
   * <p>An object representing an AWS Batch compute resource.</p>
   */
  @js.native
  trait ComputeResource extends js.Object {
    var subnets: js.UndefOr[StringList]
    var spotIamFleetRole: js.UndefOr[String]
    var instanceRole: js.UndefOr[String]
    var tags: js.UndefOr[TagsMap]
    var desiredvCpus: js.UndefOr[Int]
    var ec2KeyPair: js.UndefOr[String]
    var securityGroupIds: js.UndefOr[StringList]
    var launchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var instanceTypes: js.UndefOr[StringList]
    var bidPercentage: js.UndefOr[Int]
    var minvCpus: js.UndefOr[Int]
    var imageId: js.UndefOr[String]
    var maxvCpus: js.UndefOr[Int]
    var `type`: js.UndefOr[CRType]
  }

  object ComputeResource {
    def apply(
      subnets: js.UndefOr[StringList] = js.undefined,
      spotIamFleetRole: js.UndefOr[String] = js.undefined,
      instanceRole: js.UndefOr[String] = js.undefined,
      tags: js.UndefOr[TagsMap] = js.undefined,
      desiredvCpus: js.UndefOr[Int] = js.undefined,
      ec2KeyPair: js.UndefOr[String] = js.undefined,
      securityGroupIds: js.UndefOr[StringList] = js.undefined,
      launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
      instanceTypes: js.UndefOr[StringList] = js.undefined,
      bidPercentage: js.UndefOr[Int] = js.undefined,
      minvCpus: js.UndefOr[Int] = js.undefined,
      imageId: js.UndefOr[String] = js.undefined,
      maxvCpus: js.UndefOr[Int] = js.undefined,
      `type`: js.UndefOr[CRType] = js.undefined): ComputeResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subnets" -> subnets.map { x => x.asInstanceOf[js.Any] },
        "spotIamFleetRole" -> spotIamFleetRole.map { x => x.asInstanceOf[js.Any] },
        "instanceRole" -> instanceRole.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "desiredvCpus" -> desiredvCpus.map { x => x.asInstanceOf[js.Any] },
        "ec2KeyPair" -> ec2KeyPair.map { x => x.asInstanceOf[js.Any] },
        "securityGroupIds" -> securityGroupIds.map { x => x.asInstanceOf[js.Any] },
        "launchTemplate" -> launchTemplate.map { x => x.asInstanceOf[js.Any] },
        "instanceTypes" -> instanceTypes.map { x => x.asInstanceOf[js.Any] },
        "bidPercentage" -> bidPercentage.map { x => x.asInstanceOf[js.Any] },
        "minvCpus" -> minvCpus.map { x => x.asInstanceOf[js.Any] },
        "imageId" -> imageId.map { x => x.asInstanceOf[js.Any] },
        "maxvCpus" -> maxvCpus.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeResource]
    }
  }

  /**
   * <p>An object representing the attributes of a compute environment that can be updated.</p>
   */
  @js.native
  trait ComputeResourceUpdate extends js.Object {
    var minvCpus: js.UndefOr[Int]
    var maxvCpus: js.UndefOr[Int]
    var desiredvCpus: js.UndefOr[Int]
  }

  object ComputeResourceUpdate {
    def apply(
      minvCpus: js.UndefOr[Int] = js.undefined,
      maxvCpus: js.UndefOr[Int] = js.undefined,
      desiredvCpus: js.UndefOr[Int] = js.undefined): ComputeResourceUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "minvCpus" -> minvCpus.map { x => x.asInstanceOf[js.Any] },
        "maxvCpus" -> maxvCpus.map { x => x.asInstanceOf[js.Any] },
        "desiredvCpus" -> desiredvCpus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeResourceUpdate]
    }
  }

  /**
   * <p>An object representing the details of a container that is part of a job.</p>
   */
  @js.native
  trait ContainerDetail extends js.Object {
    var ulimits: js.UndefOr[Ulimits]
    var mountPoints: js.UndefOr[MountPoints]
    var vcpus: js.UndefOr[Int]
    var readonlyRootFilesystem: js.UndefOr[Boolean]
    var image: js.UndefOr[String]
    var exitCode: js.UndefOr[Int]
    var command: js.UndefOr[StringList]
    var reason: js.UndefOr[String]
    var volumes: js.UndefOr[Volumes]
    var logStreamName: js.UndefOr[String]
    var environment: js.UndefOr[EnvironmentVariables]
    var taskArn: js.UndefOr[String]
    var containerInstanceArn: js.UndefOr[String]
    var privileged: js.UndefOr[Boolean]
    var jobRoleArn: js.UndefOr[String]
    var user: js.UndefOr[String]
    var memory: js.UndefOr[Int]
  }

  object ContainerDetail {
    def apply(
      ulimits: js.UndefOr[Ulimits] = js.undefined,
      mountPoints: js.UndefOr[MountPoints] = js.undefined,
      vcpus: js.UndefOr[Int] = js.undefined,
      readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
      image: js.UndefOr[String] = js.undefined,
      exitCode: js.UndefOr[Int] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined,
      reason: js.UndefOr[String] = js.undefined,
      volumes: js.UndefOr[Volumes] = js.undefined,
      logStreamName: js.UndefOr[String] = js.undefined,
      environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      taskArn: js.UndefOr[String] = js.undefined,
      containerInstanceArn: js.UndefOr[String] = js.undefined,
      privileged: js.UndefOr[Boolean] = js.undefined,
      jobRoleArn: js.UndefOr[String] = js.undefined,
      user: js.UndefOr[String] = js.undefined,
      memory: js.UndefOr[Int] = js.undefined): ContainerDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ulimits" -> ulimits.map { x => x.asInstanceOf[js.Any] },
        "mountPoints" -> mountPoints.map { x => x.asInstanceOf[js.Any] },
        "vcpus" -> vcpus.map { x => x.asInstanceOf[js.Any] },
        "readonlyRootFilesystem" -> readonlyRootFilesystem.map { x => x.asInstanceOf[js.Any] },
        "image" -> image.map { x => x.asInstanceOf[js.Any] },
        "exitCode" -> exitCode.map { x => x.asInstanceOf[js.Any] },
        "command" -> command.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] },
        "volumes" -> volumes.map { x => x.asInstanceOf[js.Any] },
        "logStreamName" -> logStreamName.map { x => x.asInstanceOf[js.Any] },
        "environment" -> environment.map { x => x.asInstanceOf[js.Any] },
        "taskArn" -> taskArn.map { x => x.asInstanceOf[js.Any] },
        "containerInstanceArn" -> containerInstanceArn.map { x => x.asInstanceOf[js.Any] },
        "privileged" -> privileged.map { x => x.asInstanceOf[js.Any] },
        "jobRoleArn" -> jobRoleArn.map { x => x.asInstanceOf[js.Any] },
        "user" -> user.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDetail]
    }
  }

  /**
   * <p>The overrides that should be sent to a container.</p>
   */
  @js.native
  trait ContainerOverrides extends js.Object {
    var vcpus: js.UndefOr[Int]
    var memory: js.UndefOr[Int]
    var command: js.UndefOr[StringList]
    var environment: js.UndefOr[EnvironmentVariables]
  }

  object ContainerOverrides {
    def apply(
      vcpus: js.UndefOr[Int] = js.undefined,
      memory: js.UndefOr[Int] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined,
      environment: js.UndefOr[EnvironmentVariables] = js.undefined): ContainerOverrides = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vcpus" -> vcpus.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] },
        "command" -> command.map { x => x.asInstanceOf[js.Any] },
        "environment" -> environment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerOverrides]
    }
  }

  /**
   * <p>Container properties are used in job definitions to describe the container that is launched as part of a job.</p>
   */
  @js.native
  trait ContainerProperties extends js.Object {
    var ulimits: js.UndefOr[Ulimits]
    var mountPoints: js.UndefOr[MountPoints]
    var vcpus: js.UndefOr[Int]
    var readonlyRootFilesystem: js.UndefOr[Boolean]
    var image: js.UndefOr[String]
    var command: js.UndefOr[StringList]
    var volumes: js.UndefOr[Volumes]
    var environment: js.UndefOr[EnvironmentVariables]
    var privileged: js.UndefOr[Boolean]
    var jobRoleArn: js.UndefOr[String]
    var user: js.UndefOr[String]
    var memory: js.UndefOr[Int]
  }

  object ContainerProperties {
    def apply(
      ulimits: js.UndefOr[Ulimits] = js.undefined,
      mountPoints: js.UndefOr[MountPoints] = js.undefined,
      vcpus: js.UndefOr[Int] = js.undefined,
      readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
      image: js.UndefOr[String] = js.undefined,
      command: js.UndefOr[StringList] = js.undefined,
      volumes: js.UndefOr[Volumes] = js.undefined,
      environment: js.UndefOr[EnvironmentVariables] = js.undefined,
      privileged: js.UndefOr[Boolean] = js.undefined,
      jobRoleArn: js.UndefOr[String] = js.undefined,
      user: js.UndefOr[String] = js.undefined,
      memory: js.UndefOr[Int] = js.undefined): ContainerProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ulimits" -> ulimits.map { x => x.asInstanceOf[js.Any] },
        "mountPoints" -> mountPoints.map { x => x.asInstanceOf[js.Any] },
        "vcpus" -> vcpus.map { x => x.asInstanceOf[js.Any] },
        "readonlyRootFilesystem" -> readonlyRootFilesystem.map { x => x.asInstanceOf[js.Any] },
        "image" -> image.map { x => x.asInstanceOf[js.Any] },
        "command" -> command.map { x => x.asInstanceOf[js.Any] },
        "volumes" -> volumes.map { x => x.asInstanceOf[js.Any] },
        "environment" -> environment.map { x => x.asInstanceOf[js.Any] },
        "privileged" -> privileged.map { x => x.asInstanceOf[js.Any] },
        "jobRoleArn" -> jobRoleArn.map { x => x.asInstanceOf[js.Any] },
        "user" -> user.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerProperties]
    }
  }

  /**
   * <p>An object representing summary details of a container within a job.</p>
   */
  @js.native
  trait ContainerSummary extends js.Object {
    var exitCode: js.UndefOr[Int]
    var reason: js.UndefOr[String]
  }

  object ContainerSummary {
    def apply(
      exitCode: js.UndefOr[Int] = js.undefined,
      reason: js.UndefOr[String] = js.undefined): ContainerSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "exitCode" -> exitCode.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerSummary]
    }
  }

  @js.native
  trait CreateComputeEnvironmentRequest extends js.Object {
    var state: js.UndefOr[CEState]
    var serviceRole: js.UndefOr[String]
    var computeEnvironmentName: js.UndefOr[String]
    var computeResources: js.UndefOr[ComputeResource]
    var `type`: js.UndefOr[CEType]
  }

  object CreateComputeEnvironmentRequest {
    def apply(
      state: js.UndefOr[CEState] = js.undefined,
      serviceRole: js.UndefOr[String] = js.undefined,
      computeEnvironmentName: js.UndefOr[String] = js.undefined,
      computeResources: js.UndefOr[ComputeResource] = js.undefined,
      `type`: js.UndefOr[CEType] = js.undefined): CreateComputeEnvironmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "serviceRole" -> serviceRole.map { x => x.asInstanceOf[js.Any] },
        "computeEnvironmentName" -> computeEnvironmentName.map { x => x.asInstanceOf[js.Any] },
        "computeResources" -> computeResources.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateComputeEnvironmentRequest]
    }
  }

  @js.native
  trait CreateComputeEnvironmentResponse extends js.Object {
    var computeEnvironmentName: js.UndefOr[String]
    var computeEnvironmentArn: js.UndefOr[String]
  }

  object CreateComputeEnvironmentResponse {
    def apply(
      computeEnvironmentName: js.UndefOr[String] = js.undefined,
      computeEnvironmentArn: js.UndefOr[String] = js.undefined): CreateComputeEnvironmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironmentName" -> computeEnvironmentName.map { x => x.asInstanceOf[js.Any] },
        "computeEnvironmentArn" -> computeEnvironmentArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateComputeEnvironmentResponse]
    }
  }

  @js.native
  trait CreateJobQueueRequest extends js.Object {
    var jobQueueName: js.UndefOr[String]
    var state: js.UndefOr[JQState]
    var priority: js.UndefOr[Int]
    var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders]
  }

  object CreateJobQueueRequest {
    def apply(
      jobQueueName: js.UndefOr[String] = js.undefined,
      state: js.UndefOr[JQState] = js.undefined,
      priority: js.UndefOr[Int] = js.undefined,
      computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.undefined): CreateJobQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueueName" -> jobQueueName.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "priority" -> priority.map { x => x.asInstanceOf[js.Any] },
        "computeEnvironmentOrder" -> computeEnvironmentOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobQueueRequest]
    }
  }

  @js.native
  trait CreateJobQueueResponse extends js.Object {
    var jobQueueName: js.UndefOr[String]
    var jobQueueArn: js.UndefOr[String]
  }

  object CreateJobQueueResponse {
    def apply(
      jobQueueName: js.UndefOr[String] = js.undefined,
      jobQueueArn: js.UndefOr[String] = js.undefined): CreateJobQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueueName" -> jobQueueName.map { x => x.asInstanceOf[js.Any] },
        "jobQueueArn" -> jobQueueArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobQueueResponse]
    }
  }

  @js.native
  trait DeleteComputeEnvironmentRequest extends js.Object {
    var computeEnvironment: js.UndefOr[String]
  }

  object DeleteComputeEnvironmentRequest {
    def apply(
      computeEnvironment: js.UndefOr[String] = js.undefined): DeleteComputeEnvironmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironment" -> computeEnvironment.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteComputeEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteComputeEnvironmentResponse extends js.Object {

  }

  object DeleteComputeEnvironmentResponse {
    def apply(): DeleteComputeEnvironmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteComputeEnvironmentResponse]
    }
  }

  @js.native
  trait DeleteJobQueueRequest extends js.Object {
    var jobQueue: js.UndefOr[String]
  }

  object DeleteJobQueueRequest {
    def apply(
      jobQueue: js.UndefOr[String] = js.undefined): DeleteJobQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueue" -> jobQueue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobQueueRequest]
    }
  }

  @js.native
  trait DeleteJobQueueResponse extends js.Object {

  }

  object DeleteJobQueueResponse {
    def apply(): DeleteJobQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobQueueResponse]
    }
  }

  @js.native
  trait DeregisterJobDefinitionRequest extends js.Object {
    var jobDefinition: js.UndefOr[String]
  }

  object DeregisterJobDefinitionRequest {
    def apply(
      jobDefinition: js.UndefOr[String] = js.undefined): DeregisterJobDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinition" -> jobDefinition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterJobDefinitionRequest]
    }
  }

  @js.native
  trait DeregisterJobDefinitionResponse extends js.Object {

  }

  object DeregisterJobDefinitionResponse {
    def apply(): DeregisterJobDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterJobDefinitionResponse]
    }
  }

  @js.native
  trait DescribeComputeEnvironmentsRequest extends js.Object {
    var computeEnvironments: js.UndefOr[StringList]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object DescribeComputeEnvironmentsRequest {
    def apply(
      computeEnvironments: js.UndefOr[StringList] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): DescribeComputeEnvironmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironments" -> computeEnvironments.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComputeEnvironmentsRequest]
    }
  }

  @js.native
  trait DescribeComputeEnvironmentsResponse extends js.Object {
    var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeComputeEnvironmentsResponse {
    def apply(
      computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): DescribeComputeEnvironmentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironments" -> computeEnvironments.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComputeEnvironmentsResponse]
    }
  }

  @js.native
  trait DescribeJobDefinitionsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var jobDefinitions: js.UndefOr[StringList]
    var nextToken: js.UndefOr[String]
    var status: js.UndefOr[String]
    var jobDefinitionName: js.UndefOr[String]
  }

  object DescribeJobDefinitionsRequest {
    def apply(
      maxResults: js.UndefOr[Int] = js.undefined,
      jobDefinitions: js.UndefOr[StringList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      jobDefinitionName: js.UndefOr[String] = js.undefined): DescribeJobDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "jobDefinitions" -> jobDefinitions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "jobDefinitionName" -> jobDefinitionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobDefinitionsRequest]
    }
  }

  @js.native
  trait DescribeJobDefinitionsResponse extends js.Object {
    var jobDefinitions: js.UndefOr[JobDefinitionList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeJobDefinitionsResponse {
    def apply(
      jobDefinitions: js.UndefOr[JobDefinitionList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): DescribeJobDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinitions" -> jobDefinitions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobDefinitionsResponse]
    }
  }

  @js.native
  trait DescribeJobQueuesRequest extends js.Object {
    var jobQueues: js.UndefOr[StringList]
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object DescribeJobQueuesRequest {
    def apply(
      jobQueues: js.UndefOr[StringList] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): DescribeJobQueuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueues" -> jobQueues.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobQueuesRequest]
    }
  }

  @js.native
  trait DescribeJobQueuesResponse extends js.Object {
    var jobQueues: js.UndefOr[JobQueueDetailList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeJobQueuesResponse {
    def apply(
      jobQueues: js.UndefOr[JobQueueDetailList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): DescribeJobQueuesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueues" -> jobQueues.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobQueuesResponse]
    }
  }

  @js.native
  trait DescribeJobsRequest extends js.Object {
    var jobs: js.UndefOr[StringList]
  }

  object DescribeJobsRequest {
    def apply(
      jobs: js.UndefOr[StringList] = js.undefined): DescribeJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobs" -> jobs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobsRequest]
    }
  }

  @js.native
  trait DescribeJobsResponse extends js.Object {
    var jobs: js.UndefOr[JobDetailList]
  }

  object DescribeJobsResponse {
    def apply(
      jobs: js.UndefOr[JobDetailList] = js.undefined): DescribeJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobs" -> jobs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobsResponse]
    }
  }

  /**
   * <p>The contents of the <code>host</code> parameter determine whether your data volume persists on the host container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for your data volume, but the data is not guaranteed to persist after the containers associated with it stop running.</p>
   */
  @js.native
  trait Host extends js.Object {
    var sourcePath: js.UndefOr[String]
  }

  object Host {
    def apply(
      sourcePath: js.UndefOr[String] = js.undefined): Host = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sourcePath" -> sourcePath.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Host]
    }
  }

  object JQStateEnum {
    val ENABLED = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  object JQStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val DELETED = "DELETED"
    val VALID = "VALID"
    val INVALID = "INVALID"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
  }

  /**
   * <p>An object representing an AWS Batch job definition.</p>
   */
  @js.native
  trait JobDefinition extends js.Object {
    var retryStrategy: js.UndefOr[RetryStrategy]
    var containerProperties: js.UndefOr[ContainerProperties]
    var revision: js.UndefOr[Int]
    var status: js.UndefOr[String]
    var jobDefinitionArn: js.UndefOr[String]
    var `type`: js.UndefOr[String]
    var timeout: js.UndefOr[JobTimeout]
    var parameters: js.UndefOr[ParametersMap]
    var jobDefinitionName: js.UndefOr[String]
  }

  object JobDefinition {
    def apply(
      retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
      containerProperties: js.UndefOr[ContainerProperties] = js.undefined,
      revision: js.UndefOr[Int] = js.undefined,
      status: js.UndefOr[String] = js.undefined,
      jobDefinitionArn: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[String] = js.undefined,
      timeout: js.UndefOr[JobTimeout] = js.undefined,
      parameters: js.UndefOr[ParametersMap] = js.undefined,
      jobDefinitionName: js.UndefOr[String] = js.undefined): JobDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "retryStrategy" -> retryStrategy.map { x => x.asInstanceOf[js.Any] },
        "containerProperties" -> containerProperties.map { x => x.asInstanceOf[js.Any] },
        "revision" -> revision.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "jobDefinitionArn" -> jobDefinitionArn.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "timeout" -> timeout.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] },
        "jobDefinitionName" -> jobDefinitionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobDefinition]
    }
  }

  object JobDefinitionTypeEnum {
    val container = "container"

    val values = IndexedSeq(container)
  }

  /**
   * <p>An object representing an AWS Batch job dependency.</p>
   */
  @js.native
  trait JobDependency extends js.Object {
    var jobId: js.UndefOr[String]
    var `type`: js.UndefOr[ArrayJobDependency]
  }

  object JobDependency {
    def apply(
      jobId: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[ArrayJobDependency] = js.undefined): JobDependency = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobDependency]
    }
  }

  /**
   * <p>An object representing an AWS Batch job.</p>
   */
  @js.native
  trait JobDetail extends js.Object {
    var jobDefinition: js.UndefOr[String]
    var jobName: js.UndefOr[String]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var statusReason: js.UndefOr[String]
    var attempts: js.UndefOr[AttemptDetails]
    var jobQueue: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
    var container: js.UndefOr[ContainerDetail]
    var dependsOn: js.UndefOr[JobDependencyList]
    var status: js.UndefOr[JobStatus]
    var jobId: js.UndefOr[String]
    var createdAt: js.UndefOr[Double]
    var startedAt: js.UndefOr[Double]
    var timeout: js.UndefOr[JobTimeout]
    var parameters: js.UndefOr[ParametersMap]
    var arrayProperties: js.UndefOr[ArrayPropertiesDetail]
  }

  object JobDetail {
    def apply(
      jobDefinition: js.UndefOr[String] = js.undefined,
      jobName: js.UndefOr[String] = js.undefined,
      retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
      statusReason: js.UndefOr[String] = js.undefined,
      attempts: js.UndefOr[AttemptDetails] = js.undefined,
      jobQueue: js.UndefOr[String] = js.undefined,
      stoppedAt: js.UndefOr[Double] = js.undefined,
      container: js.UndefOr[ContainerDetail] = js.undefined,
      dependsOn: js.UndefOr[JobDependencyList] = js.undefined,
      status: js.UndefOr[JobStatus] = js.undefined,
      jobId: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Double] = js.undefined,
      startedAt: js.UndefOr[Double] = js.undefined,
      timeout: js.UndefOr[JobTimeout] = js.undefined,
      parameters: js.UndefOr[ParametersMap] = js.undefined,
      arrayProperties: js.UndefOr[ArrayPropertiesDetail] = js.undefined): JobDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinition" -> jobDefinition.map { x => x.asInstanceOf[js.Any] },
        "jobName" -> jobName.map { x => x.asInstanceOf[js.Any] },
        "retryStrategy" -> retryStrategy.map { x => x.asInstanceOf[js.Any] },
        "statusReason" -> statusReason.map { x => x.asInstanceOf[js.Any] },
        "attempts" -> attempts.map { x => x.asInstanceOf[js.Any] },
        "jobQueue" -> jobQueue.map { x => x.asInstanceOf[js.Any] },
        "stoppedAt" -> stoppedAt.map { x => x.asInstanceOf[js.Any] },
        "container" -> container.map { x => x.asInstanceOf[js.Any] },
        "dependsOn" -> dependsOn.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "timeout" -> timeout.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] },
        "arrayProperties" -> arrayProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobDetail]
    }
  }

  /**
   * <p>An object representing the details of an AWS Batch job queue.</p>
   */
  @js.native
  trait JobQueueDetail extends js.Object {
    var jobQueueName: js.UndefOr[String]
    var priority: js.UndefOr[Int]
    var statusReason: js.UndefOr[String]
    var state: js.UndefOr[JQState]
    var jobQueueArn: js.UndefOr[String]
    var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders]
    var status: js.UndefOr[JQStatus]
  }

  object JobQueueDetail {
    def apply(
      jobQueueName: js.UndefOr[String] = js.undefined,
      priority: js.UndefOr[Int] = js.undefined,
      statusReason: js.UndefOr[String] = js.undefined,
      state: js.UndefOr[JQState] = js.undefined,
      jobQueueArn: js.UndefOr[String] = js.undefined,
      computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.undefined,
      status: js.UndefOr[JQStatus] = js.undefined): JobQueueDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueueName" -> jobQueueName.map { x => x.asInstanceOf[js.Any] },
        "priority" -> priority.map { x => x.asInstanceOf[js.Any] },
        "statusReason" -> statusReason.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "jobQueueArn" -> jobQueueArn.map { x => x.asInstanceOf[js.Any] },
        "computeEnvironmentOrder" -> computeEnvironmentOrder.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobQueueDetail]
    }
  }

  object JobStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val PENDING = "PENDING"
    val RUNNABLE = "RUNNABLE"
    val STARTING = "STARTING"
    val RUNNING = "RUNNING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"

    val values = IndexedSeq(SUBMITTED, PENDING, RUNNABLE, STARTING, RUNNING, SUCCEEDED, FAILED)
  }

  /**
   * <p>An object representing summary details of a job.</p>
   */
  @js.native
  trait JobSummary extends js.Object {
    var jobName: js.UndefOr[String]
    var statusReason: js.UndefOr[String]
    var stoppedAt: js.UndefOr[Double]
    var container: js.UndefOr[ContainerSummary]
    var status: js.UndefOr[JobStatus]
    var jobId: js.UndefOr[String]
    var createdAt: js.UndefOr[Double]
    var startedAt: js.UndefOr[Double]
    var arrayProperties: js.UndefOr[ArrayPropertiesSummary]
  }

  object JobSummary {
    def apply(
      jobName: js.UndefOr[String] = js.undefined,
      statusReason: js.UndefOr[String] = js.undefined,
      stoppedAt: js.UndefOr[Double] = js.undefined,
      container: js.UndefOr[ContainerSummary] = js.undefined,
      status: js.UndefOr[JobStatus] = js.undefined,
      jobId: js.UndefOr[String] = js.undefined,
      createdAt: js.UndefOr[Double] = js.undefined,
      startedAt: js.UndefOr[Double] = js.undefined,
      arrayProperties: js.UndefOr[ArrayPropertiesSummary] = js.undefined): JobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobName" -> jobName.map { x => x.asInstanceOf[js.Any] },
        "statusReason" -> statusReason.map { x => x.asInstanceOf[js.Any] },
        "stoppedAt" -> stoppedAt.map { x => x.asInstanceOf[js.Any] },
        "container" -> container.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "arrayProperties" -> arrayProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobSummary]
    }
  }

  /**
   * <p>An object representing a job timeout configuration.</p>
   */
  @js.native
  trait JobTimeout extends js.Object {
    var attemptDurationSeconds: js.UndefOr[Int]
  }

  object JobTimeout {
    def apply(
      attemptDurationSeconds: js.UndefOr[Int] = js.undefined): JobTimeout = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attemptDurationSeconds" -> attemptDurationSeconds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobTimeout]
    }
  }

  /**
   * <p>A key-value pair object.</p>
   */
  @js.native
  trait KeyValuePair extends js.Object {
    var name: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object KeyValuePair {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      value: js.UndefOr[String] = js.undefined): KeyValuePair = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyValuePair]
    }
  }

  /**
   * <p>An object representing a launch template associated with a compute resource. You must specify either the launch template ID or launch template name in the request, but not both. </p>
   */
  @js.native
  trait LaunchTemplateSpecification extends js.Object {
    var launchTemplateId: js.UndefOr[String]
    var launchTemplateName: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object LaunchTemplateSpecification {
    def apply(
      launchTemplateId: js.UndefOr[String] = js.undefined,
      launchTemplateName: js.UndefOr[String] = js.undefined,
      version: js.UndefOr[String] = js.undefined): LaunchTemplateSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "launchTemplateId" -> launchTemplateId.map { x => x.asInstanceOf[js.Any] },
        "launchTemplateName" -> launchTemplateName.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateSpecification]
    }
  }

  @js.native
  trait ListJobsRequest extends js.Object {
    var jobQueue: js.UndefOr[String]
    var maxResults: js.UndefOr[Int]
    var jobStatus: js.UndefOr[JobStatus]
    var nextToken: js.UndefOr[String]
    var arrayJobId: js.UndefOr[String]
  }

  object ListJobsRequest {
    def apply(
      jobQueue: js.UndefOr[String] = js.undefined,
      maxResults: js.UndefOr[Int] = js.undefined,
      jobStatus: js.UndefOr[JobStatus] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      arrayJobId: js.UndefOr[String] = js.undefined): ListJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueue" -> jobQueue.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "jobStatus" -> jobStatus.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "arrayJobId" -> arrayJobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var jobSummaryList: js.UndefOr[JobSummaryList]
    var nextToken: js.UndefOr[String]
  }

  object ListJobsResponse {
    def apply(
      jobSummaryList: js.UndefOr[JobSummaryList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummaryList" -> jobSummaryList.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsResponse]
    }
  }

  /**
   * <p>Details on a Docker volume mount point that is used in a job's container properties.</p>
   */
  @js.native
  trait MountPoint extends js.Object {
    var containerPath: js.UndefOr[String]
    var readOnly: js.UndefOr[Boolean]
    var sourceVolume: js.UndefOr[String]
  }

  object MountPoint {
    def apply(
      containerPath: js.UndefOr[String] = js.undefined,
      readOnly: js.UndefOr[Boolean] = js.undefined,
      sourceVolume: js.UndefOr[String] = js.undefined): MountPoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerPath" -> containerPath.map { x => x.asInstanceOf[js.Any] },
        "readOnly" -> readOnly.map { x => x.asInstanceOf[js.Any] },
        "sourceVolume" -> sourceVolume.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MountPoint]
    }
  }

  @js.native
  trait RegisterJobDefinitionRequest extends js.Object {
    var retryStrategy: js.UndefOr[RetryStrategy]
    var containerProperties: js.UndefOr[ContainerProperties]
    var `type`: js.UndefOr[JobDefinitionType]
    var timeout: js.UndefOr[JobTimeout]
    var parameters: js.UndefOr[ParametersMap]
    var jobDefinitionName: js.UndefOr[String]
  }

  object RegisterJobDefinitionRequest {
    def apply(
      retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
      containerProperties: js.UndefOr[ContainerProperties] = js.undefined,
      `type`: js.UndefOr[JobDefinitionType] = js.undefined,
      timeout: js.UndefOr[JobTimeout] = js.undefined,
      parameters: js.UndefOr[ParametersMap] = js.undefined,
      jobDefinitionName: js.UndefOr[String] = js.undefined): RegisterJobDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "retryStrategy" -> retryStrategy.map { x => x.asInstanceOf[js.Any] },
        "containerProperties" -> containerProperties.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "timeout" -> timeout.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] },
        "jobDefinitionName" -> jobDefinitionName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterJobDefinitionRequest]
    }
  }

  @js.native
  trait RegisterJobDefinitionResponse extends js.Object {
    var jobDefinitionName: js.UndefOr[String]
    var jobDefinitionArn: js.UndefOr[String]
    var revision: js.UndefOr[Int]
  }

  object RegisterJobDefinitionResponse {
    def apply(
      jobDefinitionName: js.UndefOr[String] = js.undefined,
      jobDefinitionArn: js.UndefOr[String] = js.undefined,
      revision: js.UndefOr[Int] = js.undefined): RegisterJobDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinitionName" -> jobDefinitionName.map { x => x.asInstanceOf[js.Any] },
        "jobDefinitionArn" -> jobDefinitionArn.map { x => x.asInstanceOf[js.Any] },
        "revision" -> revision.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterJobDefinitionResponse]
    }
  }

  /**
   * <p>The retry strategy associated with a job.</p>
   */
  @js.native
  trait RetryStrategy extends js.Object {
    var attempts: js.UndefOr[Int]
  }

  object RetryStrategy {
    def apply(
      attempts: js.UndefOr[Int] = js.undefined): RetryStrategy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attempts" -> attempts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetryStrategy]
    }
  }

  @js.native
  trait SubmitJobRequest extends js.Object {
    var jobDefinition: js.UndefOr[String]
    var jobName: js.UndefOr[String]
    var retryStrategy: js.UndefOr[RetryStrategy]
    var containerOverrides: js.UndefOr[ContainerOverrides]
    var jobQueue: js.UndefOr[String]
    var dependsOn: js.UndefOr[JobDependencyList]
    var timeout: js.UndefOr[JobTimeout]
    var parameters: js.UndefOr[ParametersMap]
    var arrayProperties: js.UndefOr[ArrayProperties]
  }

  object SubmitJobRequest {
    def apply(
      jobDefinition: js.UndefOr[String] = js.undefined,
      jobName: js.UndefOr[String] = js.undefined,
      retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
      containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined,
      jobQueue: js.UndefOr[String] = js.undefined,
      dependsOn: js.UndefOr[JobDependencyList] = js.undefined,
      timeout: js.UndefOr[JobTimeout] = js.undefined,
      parameters: js.UndefOr[ParametersMap] = js.undefined,
      arrayProperties: js.UndefOr[ArrayProperties] = js.undefined): SubmitJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinition" -> jobDefinition.map { x => x.asInstanceOf[js.Any] },
        "jobName" -> jobName.map { x => x.asInstanceOf[js.Any] },
        "retryStrategy" -> retryStrategy.map { x => x.asInstanceOf[js.Any] },
        "containerOverrides" -> containerOverrides.map { x => x.asInstanceOf[js.Any] },
        "jobQueue" -> jobQueue.map { x => x.asInstanceOf[js.Any] },
        "dependsOn" -> dependsOn.map { x => x.asInstanceOf[js.Any] },
        "timeout" -> timeout.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] },
        "arrayProperties" -> arrayProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitJobRequest]
    }
  }

  @js.native
  trait SubmitJobResponse extends js.Object {
    var jobName: js.UndefOr[String]
    var jobId: js.UndefOr[String]
  }

  object SubmitJobResponse {
    def apply(
      jobName: js.UndefOr[String] = js.undefined,
      jobId: js.UndefOr[String] = js.undefined): SubmitJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobName" -> jobName.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitJobResponse]
    }
  }

  @js.native
  trait TerminateJobRequest extends js.Object {
    var jobId: js.UndefOr[String]
    var reason: js.UndefOr[String]
  }

  object TerminateJobRequest {
    def apply(
      jobId: js.UndefOr[String] = js.undefined,
      reason: js.UndefOr[String] = js.undefined): TerminateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "reason" -> reason.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateJobRequest]
    }
  }

  @js.native
  trait TerminateJobResponse extends js.Object {

  }

  object TerminateJobResponse {
    def apply(): TerminateJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateJobResponse]
    }
  }

  /**
   * <p>The <code>ulimit</code> settings to pass to the container.</p>
   */
  @js.native
  trait Ulimit extends js.Object {
    var hardLimit: js.UndefOr[Int]
    var name: js.UndefOr[String]
    var softLimit: js.UndefOr[Int]
  }

  object Ulimit {
    def apply(
      hardLimit: js.UndefOr[Int] = js.undefined,
      name: js.UndefOr[String] = js.undefined,
      softLimit: js.UndefOr[Int] = js.undefined): Ulimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hardLimit" -> hardLimit.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "softLimit" -> softLimit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ulimit]
    }
  }

  @js.native
  trait UpdateComputeEnvironmentRequest extends js.Object {
    var computeEnvironment: js.UndefOr[String]
    var state: js.UndefOr[CEState]
    var computeResources: js.UndefOr[ComputeResourceUpdate]
    var serviceRole: js.UndefOr[String]
  }

  object UpdateComputeEnvironmentRequest {
    def apply(
      computeEnvironment: js.UndefOr[String] = js.undefined,
      state: js.UndefOr[CEState] = js.undefined,
      computeResources: js.UndefOr[ComputeResourceUpdate] = js.undefined,
      serviceRole: js.UndefOr[String] = js.undefined): UpdateComputeEnvironmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironment" -> computeEnvironment.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "computeResources" -> computeResources.map { x => x.asInstanceOf[js.Any] },
        "serviceRole" -> serviceRole.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateComputeEnvironmentRequest]
    }
  }

  @js.native
  trait UpdateComputeEnvironmentResponse extends js.Object {
    var computeEnvironmentName: js.UndefOr[String]
    var computeEnvironmentArn: js.UndefOr[String]
  }

  object UpdateComputeEnvironmentResponse {
    def apply(
      computeEnvironmentName: js.UndefOr[String] = js.undefined,
      computeEnvironmentArn: js.UndefOr[String] = js.undefined): UpdateComputeEnvironmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironmentName" -> computeEnvironmentName.map { x => x.asInstanceOf[js.Any] },
        "computeEnvironmentArn" -> computeEnvironmentArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateComputeEnvironmentResponse]
    }
  }

  @js.native
  trait UpdateJobQueueRequest extends js.Object {
    var jobQueue: js.UndefOr[String]
    var state: js.UndefOr[JQState]
    var priority: js.UndefOr[Int]
    var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders]
  }

  object UpdateJobQueueRequest {
    def apply(
      jobQueue: js.UndefOr[String] = js.undefined,
      state: js.UndefOr[JQState] = js.undefined,
      priority: js.UndefOr[Int] = js.undefined,
      computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.undefined): UpdateJobQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueue" -> jobQueue.map { x => x.asInstanceOf[js.Any] },
        "state" -> state.map { x => x.asInstanceOf[js.Any] },
        "priority" -> priority.map { x => x.asInstanceOf[js.Any] },
        "computeEnvironmentOrder" -> computeEnvironmentOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobQueueRequest]
    }
  }

  @js.native
  trait UpdateJobQueueResponse extends js.Object {
    var jobQueueName: js.UndefOr[String]
    var jobQueueArn: js.UndefOr[String]
  }

  object UpdateJobQueueResponse {
    def apply(
      jobQueueName: js.UndefOr[String] = js.undefined,
      jobQueueArn: js.UndefOr[String] = js.undefined): UpdateJobQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueueName" -> jobQueueName.map { x => x.asInstanceOf[js.Any] },
        "jobQueueArn" -> jobQueueArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobQueueResponse]
    }
  }

  /**
   * <p>A data volume used in a job's container properties.</p>
   */
  @js.native
  trait Volume extends js.Object {
    var host: js.UndefOr[Host]
    var name: js.UndefOr[String]
  }

  object Volume {
    def apply(
      host: js.UndefOr[Host] = js.undefined,
      name: js.UndefOr[String] = js.undefined): Volume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "host" -> host.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Volume]
    }
  }
}
