package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object batch {
  type ArrayJobDependency           = String
  type ArrayJobStatusSummary        = js.Dictionary[Int]
  type AttemptDetails               = js.Array[AttemptDetail]
  type CEState                      = String
  type CEStatus                     = String
  type CEType                       = String
  type CRType                       = String
  type ComputeEnvironmentDetailList = js.Array[ComputeEnvironmentDetail]
  type ComputeEnvironmentOrders     = js.Array[ComputeEnvironmentOrder]
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
  type StringList                   = js.Array[String]
  type TagsMap                      = js.Dictionary[String]
  type Ulimits                      = js.Array[Ulimit]
  type Volumes                      = js.Array[Volume]
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

    val values = IndexedSeq(N_TO_N, SEQUENTIAL)
  }

  /**
    * An object representing an AWS Batch array job.
    */
  @js.native
  trait ArrayProperties extends js.Object {
    var size: js.UndefOr[Int]
  }

  object ArrayProperties {
    def apply(size: js.UndefOr[Int] = js.undefined): ArrayProperties = {
      val _fields = IndexedSeq[(String, js.Any)]("size" -> size.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArrayProperties]
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
    def apply(index: js.UndefOr[Int] = js.undefined,
              size: js.UndefOr[Int] = js.undefined,
              statusSummary: js.UndefOr[ArrayJobStatusSummary] = js.undefined): ArrayPropertiesDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "index" -> index.map { x =>
          x.asInstanceOf[js.Any]
        },
        "size" -> size.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusSummary" -> statusSummary.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArrayPropertiesDetail]
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
    def apply(index: js.UndefOr[Int] = js.undefined, size: js.UndefOr[Int] = js.undefined): ArrayPropertiesSummary = {
      val _fields = IndexedSeq[(String, js.Any)]("index" -> index.map { x =>
        x.asInstanceOf[js.Any]
      }, "size" -> size.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ArrayPropertiesSummary]
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
    def apply(containerInstanceArn: js.UndefOr[String] = js.undefined,
              exitCode: js.UndefOr[Int] = js.undefined,
              logStreamName: js.UndefOr[String] = js.undefined,
              networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined,
              reason: js.UndefOr[String] = js.undefined,
              taskArn: js.UndefOr[String] = js.undefined): AttemptContainerDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerInstanceArn" -> containerInstanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "exitCode" -> exitCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "logStreamName" -> logStreamName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "networkInterfaces" -> networkInterfaces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "reason" -> reason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskArn" -> taskArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttemptContainerDetail]
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
    def apply(container: js.UndefOr[AttemptContainerDetail] = js.undefined,
              startedAt: js.UndefOr[Double] = js.undefined,
              statusReason: js.UndefOr[String] = js.undefined,
              stoppedAt: js.UndefOr[Double] = js.undefined): AttemptDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "container" -> container.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startedAt" -> startedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusReason" -> statusReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stoppedAt" -> stoppedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttemptDetail]
    }
  }

  object CEStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  object CEStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val DELETED  = "DELETED"
    val VALID    = "VALID"
    val INVALID  = "INVALID"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
  }

  object CETypeEnum {
    val MANAGED   = "MANAGED"
    val UNMANAGED = "UNMANAGED"

    val values = IndexedSeq(MANAGED, UNMANAGED)
  }

  object CRTypeEnum {
    val EC2  = "EC2"
    val SPOT = "SPOT"

    val values = IndexedSeq(EC2, SPOT)
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var jobId: String
    var reason: String
  }

  object CancelJobRequest {
    def apply(jobId: String, reason: String): CancelJobRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("jobId" -> jobId.asInstanceOf[js.Any], "reason" -> reason.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {}

  object CancelJobResponse {
    def apply(): CancelJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelJobResponse]
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
    def apply(computeEnvironmentArn: String,
              computeEnvironmentName: String,
              ecsClusterArn: String,
              computeResources: js.UndefOr[ComputeResource] = js.undefined,
              serviceRole: js.UndefOr[String] = js.undefined,
              state: js.UndefOr[CEState] = js.undefined,
              status: js.UndefOr[CEStatus] = js.undefined,
              statusReason: js.UndefOr[String] = js.undefined,
              `type`: js.UndefOr[CEType] = js.undefined): ComputeEnvironmentDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironmentArn"  -> computeEnvironmentArn.asInstanceOf[js.Any],
        "computeEnvironmentName" -> computeEnvironmentName.asInstanceOf[js.Any],
        "ecsClusterArn"          -> ecsClusterArn.asInstanceOf[js.Any],
        "computeResources" -> computeResources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serviceRole" -> serviceRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusReason" -> statusReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "`type`" -> `type`.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeEnvironmentDetail]
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
    def apply(computeEnvironment: String, order: Int): ComputeEnvironmentOrder = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironment" -> computeEnvironment.asInstanceOf[js.Any],
        "order"              -> order.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeEnvironmentOrder]
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
    def apply(instanceRole: String,
              instanceTypes: StringList,
              maxvCpus: Int,
              minvCpus: Int,
              subnets: StringList,
              `type`: CRType,
              bidPercentage: js.UndefOr[Int] = js.undefined,
              desiredvCpus: js.UndefOr[Int] = js.undefined,
              ec2KeyPair: js.UndefOr[String] = js.undefined,
              imageId: js.UndefOr[String] = js.undefined,
              launchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined,
              placementGroup: js.UndefOr[String] = js.undefined,
              securityGroupIds: js.UndefOr[StringList] = js.undefined,
              spotIamFleetRole: js.UndefOr[String] = js.undefined,
              tags: js.UndefOr[TagsMap] = js.undefined): ComputeResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceRole"  -> instanceRole.asInstanceOf[js.Any],
        "instanceTypes" -> instanceTypes.asInstanceOf[js.Any],
        "maxvCpus"      -> maxvCpus.asInstanceOf[js.Any],
        "minvCpus"      -> minvCpus.asInstanceOf[js.Any],
        "subnets"       -> subnets.asInstanceOf[js.Any],
        "`type`"        -> `type`.asInstanceOf[js.Any],
        "bidPercentage" -> bidPercentage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "desiredvCpus" -> desiredvCpus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ec2KeyPair" -> ec2KeyPair.map { x =>
          x.asInstanceOf[js.Any]
        },
        "imageId" -> imageId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "launchTemplate" -> launchTemplate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "placementGroup" -> placementGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "securityGroupIds" -> securityGroupIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "spotIamFleetRole" -> spotIamFleetRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeResource]
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
    def apply(desiredvCpus: js.UndefOr[Int] = js.undefined,
              maxvCpus: js.UndefOr[Int] = js.undefined,
              minvCpus: js.UndefOr[Int] = js.undefined): ComputeResourceUpdate = {
      val _fields = IndexedSeq[(String, js.Any)](
        "desiredvCpus" -> desiredvCpus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxvCpus" -> maxvCpus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "minvCpus" -> minvCpus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComputeResourceUpdate]
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
    var logStreamName: js.UndefOr[String]
    var memory: js.UndefOr[Int]
    var mountPoints: js.UndefOr[MountPoints]
    var networkInterfaces: js.UndefOr[NetworkInterfaceList]
    var privileged: js.UndefOr[Boolean]
    var readonlyRootFilesystem: js.UndefOr[Boolean]
    var reason: js.UndefOr[String]
    var taskArn: js.UndefOr[String]
    var ulimits: js.UndefOr[Ulimits]
    var user: js.UndefOr[String]
    var vcpus: js.UndefOr[Int]
    var volumes: js.UndefOr[Volumes]
  }

  object ContainerDetail {
    def apply(command: js.UndefOr[StringList] = js.undefined,
              containerInstanceArn: js.UndefOr[String] = js.undefined,
              environment: js.UndefOr[EnvironmentVariables] = js.undefined,
              exitCode: js.UndefOr[Int] = js.undefined,
              image: js.UndefOr[String] = js.undefined,
              instanceType: js.UndefOr[String] = js.undefined,
              jobRoleArn: js.UndefOr[String] = js.undefined,
              logStreamName: js.UndefOr[String] = js.undefined,
              memory: js.UndefOr[Int] = js.undefined,
              mountPoints: js.UndefOr[MountPoints] = js.undefined,
              networkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined,
              privileged: js.UndefOr[Boolean] = js.undefined,
              readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
              reason: js.UndefOr[String] = js.undefined,
              taskArn: js.UndefOr[String] = js.undefined,
              ulimits: js.UndefOr[Ulimits] = js.undefined,
              user: js.UndefOr[String] = js.undefined,
              vcpus: js.UndefOr[Int] = js.undefined,
              volumes: js.UndefOr[Volumes] = js.undefined): ContainerDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "command" -> command.map { x =>
          x.asInstanceOf[js.Any]
        },
        "containerInstanceArn" -> containerInstanceArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "environment" -> environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "exitCode" -> exitCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "image" -> image.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceType" -> instanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobRoleArn" -> jobRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "logStreamName" -> logStreamName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "memory" -> memory.map { x =>
          x.asInstanceOf[js.Any]
        },
        "mountPoints" -> mountPoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "networkInterfaces" -> networkInterfaces.map { x =>
          x.asInstanceOf[js.Any]
        },
        "privileged" -> privileged.map { x =>
          x.asInstanceOf[js.Any]
        },
        "readonlyRootFilesystem" -> readonlyRootFilesystem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "reason" -> reason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "taskArn" -> taskArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ulimits" -> ulimits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "user" -> user.map { x =>
          x.asInstanceOf[js.Any]
        },
        "vcpus" -> vcpus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "volumes" -> volumes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerDetail]
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
    var vcpus: js.UndefOr[Int]
  }

  object ContainerOverrides {
    def apply(command: js.UndefOr[StringList] = js.undefined,
              environment: js.UndefOr[EnvironmentVariables] = js.undefined,
              instanceType: js.UndefOr[String] = js.undefined,
              memory: js.UndefOr[Int] = js.undefined,
              vcpus: js.UndefOr[Int] = js.undefined): ContainerOverrides = {
      val _fields = IndexedSeq[(String, js.Any)](
        "command" -> command.map { x =>
          x.asInstanceOf[js.Any]
        },
        "environment" -> environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceType" -> instanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "memory" -> memory.map { x =>
          x.asInstanceOf[js.Any]
        },
        "vcpus" -> vcpus.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerOverrides]
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
    var memory: js.UndefOr[Int]
    var mountPoints: js.UndefOr[MountPoints]
    var privileged: js.UndefOr[Boolean]
    var readonlyRootFilesystem: js.UndefOr[Boolean]
    var ulimits: js.UndefOr[Ulimits]
    var user: js.UndefOr[String]
    var vcpus: js.UndefOr[Int]
    var volumes: js.UndefOr[Volumes]
  }

  object ContainerProperties {
    def apply(command: js.UndefOr[StringList] = js.undefined,
              environment: js.UndefOr[EnvironmentVariables] = js.undefined,
              image: js.UndefOr[String] = js.undefined,
              instanceType: js.UndefOr[String] = js.undefined,
              jobRoleArn: js.UndefOr[String] = js.undefined,
              memory: js.UndefOr[Int] = js.undefined,
              mountPoints: js.UndefOr[MountPoints] = js.undefined,
              privileged: js.UndefOr[Boolean] = js.undefined,
              readonlyRootFilesystem: js.UndefOr[Boolean] = js.undefined,
              ulimits: js.UndefOr[Ulimits] = js.undefined,
              user: js.UndefOr[String] = js.undefined,
              vcpus: js.UndefOr[Int] = js.undefined,
              volumes: js.UndefOr[Volumes] = js.undefined): ContainerProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "command" -> command.map { x =>
          x.asInstanceOf[js.Any]
        },
        "environment" -> environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "image" -> image.map { x =>
          x.asInstanceOf[js.Any]
        },
        "instanceType" -> instanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobRoleArn" -> jobRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "memory" -> memory.map { x =>
          x.asInstanceOf[js.Any]
        },
        "mountPoints" -> mountPoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "privileged" -> privileged.map { x =>
          x.asInstanceOf[js.Any]
        },
        "readonlyRootFilesystem" -> readonlyRootFilesystem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ulimits" -> ulimits.map { x =>
          x.asInstanceOf[js.Any]
        },
        "user" -> user.map { x =>
          x.asInstanceOf[js.Any]
        },
        "vcpus" -> vcpus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "volumes" -> volumes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerProperties]
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
    def apply(exitCode: js.UndefOr[Int] = js.undefined, reason: js.UndefOr[String] = js.undefined): ContainerSummary = {
      val _fields = IndexedSeq[(String, js.Any)]("exitCode" -> exitCode.map { x =>
        x.asInstanceOf[js.Any]
      }, "reason" -> reason.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ContainerSummary]
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
    def apply(computeEnvironmentName: String,
              serviceRole: String,
              `type`: CEType,
              computeResources: js.UndefOr[ComputeResource] = js.undefined,
              state: js.UndefOr[CEState] = js.undefined): CreateComputeEnvironmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironmentName" -> computeEnvironmentName.asInstanceOf[js.Any],
        "serviceRole"            -> serviceRole.asInstanceOf[js.Any],
        "`type`"                 -> `type`.asInstanceOf[js.Any],
        "computeResources" -> computeResources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateComputeEnvironmentRequest]
    }
  }

  @js.native
  trait CreateComputeEnvironmentResponse extends js.Object {
    var computeEnvironmentArn: js.UndefOr[String]
    var computeEnvironmentName: js.UndefOr[String]
  }

  object CreateComputeEnvironmentResponse {
    def apply(computeEnvironmentArn: js.UndefOr[String] = js.undefined,
              computeEnvironmentName: js.UndefOr[String] = js.undefined): CreateComputeEnvironmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironmentArn" -> computeEnvironmentArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "computeEnvironmentName" -> computeEnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateComputeEnvironmentResponse]
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
    def apply(computeEnvironmentOrder: ComputeEnvironmentOrders,
              jobQueueName: String,
              priority: Int,
              state: js.UndefOr[JQState] = js.undefined): CreateJobQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironmentOrder" -> computeEnvironmentOrder.asInstanceOf[js.Any],
        "jobQueueName"            -> jobQueueName.asInstanceOf[js.Any],
        "priority"                -> priority.asInstanceOf[js.Any],
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobQueueRequest]
    }
  }

  @js.native
  trait CreateJobQueueResponse extends js.Object {
    var jobQueueArn: String
    var jobQueueName: String
  }

  object CreateJobQueueResponse {
    def apply(jobQueueArn: String, jobQueueName: String): CreateJobQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueueArn"  -> jobQueueArn.asInstanceOf[js.Any],
        "jobQueueName" -> jobQueueName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateJobQueueResponse]
    }
  }

  @js.native
  trait DeleteComputeEnvironmentRequest extends js.Object {
    var computeEnvironment: String
  }

  object DeleteComputeEnvironmentRequest {
    def apply(computeEnvironment: String): DeleteComputeEnvironmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("computeEnvironment" -> computeEnvironment.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteComputeEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteComputeEnvironmentResponse extends js.Object {}

  object DeleteComputeEnvironmentResponse {
    def apply(): DeleteComputeEnvironmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteComputeEnvironmentResponse]
    }
  }

  @js.native
  trait DeleteJobQueueRequest extends js.Object {
    var jobQueue: String
  }

  object DeleteJobQueueRequest {
    def apply(jobQueue: String): DeleteJobQueueRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("jobQueue" -> jobQueue.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobQueueRequest]
    }
  }

  @js.native
  trait DeleteJobQueueResponse extends js.Object {}

  object DeleteJobQueueResponse {
    def apply(): DeleteJobQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobQueueResponse]
    }
  }

  @js.native
  trait DeregisterJobDefinitionRequest extends js.Object {
    var jobDefinition: String
  }

  object DeregisterJobDefinitionRequest {
    def apply(jobDefinition: String): DeregisterJobDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("jobDefinition" -> jobDefinition.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterJobDefinitionRequest]
    }
  }

  @js.native
  trait DeregisterJobDefinitionResponse extends js.Object {}

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
    def apply(computeEnvironments: js.UndefOr[StringList] = js.undefined,
              maxResults: js.UndefOr[Int] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined): DescribeComputeEnvironmentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironments" -> computeEnvironments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComputeEnvironmentsRequest]
    }
  }

  @js.native
  trait DescribeComputeEnvironmentsResponse extends js.Object {
    var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeComputeEnvironmentsResponse {
    def apply(computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined): DescribeComputeEnvironmentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("computeEnvironments" -> computeEnvironments.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeComputeEnvironmentsResponse]
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
    def apply(jobDefinitionName: js.UndefOr[String] = js.undefined,
              jobDefinitions: js.UndefOr[StringList] = js.undefined,
              maxResults: js.UndefOr[Int] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined,
              status: js.UndefOr[String] = js.undefined): DescribeJobDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinitionName" -> jobDefinitionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobDefinitions" -> jobDefinitions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobDefinitionsRequest]
    }
  }

  @js.native
  trait DescribeJobDefinitionsResponse extends js.Object {
    var jobDefinitions: js.UndefOr[JobDefinitionList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeJobDefinitionsResponse {
    def apply(jobDefinitions: js.UndefOr[JobDefinitionList] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined): DescribeJobDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("jobDefinitions" -> jobDefinitions.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

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
    def apply(jobQueues: js.UndefOr[StringList] = js.undefined,
              maxResults: js.UndefOr[Int] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined): DescribeJobQueuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueues" -> jobQueues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobQueuesRequest]
    }
  }

  @js.native
  trait DescribeJobQueuesResponse extends js.Object {
    var jobQueues: js.UndefOr[JobQueueDetailList]
    var nextToken: js.UndefOr[String]
  }

  object DescribeJobQueuesResponse {
    def apply(jobQueues: js.UndefOr[JobQueueDetailList] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined): DescribeJobQueuesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("jobQueues" -> jobQueues.map { x =>
        x.asInstanceOf[js.Any]
      }, "nextToken" -> nextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobQueuesResponse]
    }
  }

  @js.native
  trait DescribeJobsRequest extends js.Object {
    var jobs: StringList
  }

  object DescribeJobsRequest {
    def apply(jobs: StringList): DescribeJobsRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("jobs" -> jobs.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobsRequest]
    }
  }

  @js.native
  trait DescribeJobsResponse extends js.Object {
    var jobs: js.UndefOr[JobDetailList]
  }

  object DescribeJobsResponse {
    def apply(jobs: js.UndefOr[JobDetailList] = js.undefined): DescribeJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("jobs" -> jobs.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobsResponse]
    }
  }

  /**
    * The contents of the <code>host</code> parameter determine whether your data volume persists on the host container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for your data volume, but the data is not guaranteed to persist after the containers associated with it stop running.
    */
  @js.native
  trait Host extends js.Object {
    var sourcePath: js.UndefOr[String]
  }

  object Host {
    def apply(sourcePath: js.UndefOr[String] = js.undefined): Host = {
      val _fields = IndexedSeq[(String, js.Any)]("sourcePath" -> sourcePath.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Host]
    }
  }

  object JQStateEnum {
    val ENABLED  = "ENABLED"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, DISABLED)
  }

  object JQStatusEnum {
    val CREATING = "CREATING"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"
    val DELETED  = "DELETED"
    val VALID    = "VALID"
    val INVALID  = "INVALID"

    val values = IndexedSeq(CREATING, UPDATING, DELETING, DELETED, VALID, INVALID)
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
    def apply(jobDefinitionArn: String,
              jobDefinitionName: String,
              revision: Int,
              `type`: String,
              containerProperties: js.UndefOr[ContainerProperties] = js.undefined,
              nodeProperties: js.UndefOr[NodeProperties] = js.undefined,
              parameters: js.UndefOr[ParametersMap] = js.undefined,
              retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
              status: js.UndefOr[String] = js.undefined,
              timeout: js.UndefOr[JobTimeout] = js.undefined): JobDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinitionArn"  -> jobDefinitionArn.asInstanceOf[js.Any],
        "jobDefinitionName" -> jobDefinitionName.asInstanceOf[js.Any],
        "revision"          -> revision.asInstanceOf[js.Any],
        "`type`"            -> `type`.asInstanceOf[js.Any],
        "containerProperties" -> containerProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nodeProperties" -> nodeProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameters" -> parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "retryStrategy" -> retryStrategy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeout" -> timeout.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobDefinition]
    }
  }

  object JobDefinitionTypeEnum {
    val container = "container"
    val multinode = "multinode"

    val values = IndexedSeq(container, multinode)
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
    def apply(jobId: js.UndefOr[String] = js.undefined,
              `type`: js.UndefOr[ArrayJobDependency] = js.undefined): JobDependency = {
      val _fields = IndexedSeq[(String, js.Any)]("jobId" -> jobId.map { x =>
        x.asInstanceOf[js.Any]
      }, "`type`" -> `type`.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobDependency]
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
    def apply(jobDefinition: String,
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
              timeout: js.UndefOr[JobTimeout] = js.undefined): JobDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinition" -> jobDefinition.asInstanceOf[js.Any],
        "jobId"         -> jobId.asInstanceOf[js.Any],
        "jobName"       -> jobName.asInstanceOf[js.Any],
        "jobQueue"      -> jobQueue.asInstanceOf[js.Any],
        "startedAt"     -> startedAt.asInstanceOf[js.Any],
        "status"        -> status.asInstanceOf[js.Any],
        "arrayProperties" -> arrayProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "attempts" -> attempts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "container" -> container.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dependsOn" -> dependsOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nodeDetails" -> nodeDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nodeProperties" -> nodeProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameters" -> parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "retryStrategy" -> retryStrategy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusReason" -> statusReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stoppedAt" -> stoppedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeout" -> timeout.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobDetail]
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
    def apply(computeEnvironmentOrder: ComputeEnvironmentOrders,
              jobQueueArn: String,
              jobQueueName: String,
              priority: Int,
              state: JQState,
              status: js.UndefOr[JQStatus] = js.undefined,
              statusReason: js.UndefOr[String] = js.undefined): JobQueueDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironmentOrder" -> computeEnvironmentOrder.asInstanceOf[js.Any],
        "jobQueueArn"             -> jobQueueArn.asInstanceOf[js.Any],
        "jobQueueName"            -> jobQueueName.asInstanceOf[js.Any],
        "priority"                -> priority.asInstanceOf[js.Any],
        "state"                   -> state.asInstanceOf[js.Any],
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusReason" -> statusReason.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobQueueDetail]
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

    val values = IndexedSeq(SUBMITTED, PENDING, RUNNABLE, STARTING, RUNNING, SUCCEEDED, FAILED)
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
    def apply(jobId: String,
              jobName: String,
              arrayProperties: js.UndefOr[ArrayPropertiesSummary] = js.undefined,
              container: js.UndefOr[ContainerSummary] = js.undefined,
              createdAt: js.UndefOr[Double] = js.undefined,
              nodeProperties: js.UndefOr[NodePropertiesSummary] = js.undefined,
              startedAt: js.UndefOr[Double] = js.undefined,
              status: js.UndefOr[JobStatus] = js.undefined,
              statusReason: js.UndefOr[String] = js.undefined,
              stoppedAt: js.UndefOr[Double] = js.undefined): JobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId"   -> jobId.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any],
        "arrayProperties" -> arrayProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "container" -> container.map { x =>
          x.asInstanceOf[js.Any]
        },
        "createdAt" -> createdAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nodeProperties" -> nodeProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "startedAt" -> startedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "statusReason" -> statusReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stoppedAt" -> stoppedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobSummary]
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
    def apply(attemptDurationSeconds: js.UndefOr[Int] = js.undefined): JobTimeout = {
      val _fields = IndexedSeq[(String, js.Any)]("attemptDurationSeconds" -> attemptDurationSeconds.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobTimeout]
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
    def apply(name: js.UndefOr[String] = js.undefined, value: js.UndefOr[String] = js.undefined): KeyValuePair = {
      val _fields = IndexedSeq[(String, js.Any)]("name" -> name.map { x =>
        x.asInstanceOf[js.Any]
      }, "value" -> value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyValuePair]
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
    def apply(launchTemplateId: js.UndefOr[String] = js.undefined,
              launchTemplateName: js.UndefOr[String] = js.undefined,
              version: js.UndefOr[String] = js.undefined): LaunchTemplateSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "launchTemplateId" -> launchTemplateId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "launchTemplateName" -> launchTemplateName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "version" -> version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplateSpecification]
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
    def apply(arrayJobId: js.UndefOr[String] = js.undefined,
              jobQueue: js.UndefOr[String] = js.undefined,
              jobStatus: js.UndefOr[JobStatus] = js.undefined,
              maxResults: js.UndefOr[Int] = js.undefined,
              multiNodeJobId: js.UndefOr[String] = js.undefined,
              nextToken: js.UndefOr[String] = js.undefined): ListJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arrayJobId" -> arrayJobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobQueue" -> jobQueue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobStatus" -> jobStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "multiNodeJobId" -> multiNodeJobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsRequest]
    }
  }

  @js.native
  trait ListJobsResponse extends js.Object {
    var jobSummaryList: JobSummaryList
    var nextToken: js.UndefOr[String]
  }

  object ListJobsResponse {
    def apply(jobSummaryList: JobSummaryList, nextToken: js.UndefOr[String] = js.undefined): ListJobsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummaryList" -> jobSummaryList.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsResponse]
    }
  }

  /**
    * Details on a Docker volume mount point that is used in a job's container properties.
    */
  @js.native
  trait MountPoint extends js.Object {
    var containerPath: js.UndefOr[String]
    var readOnly: js.UndefOr[Boolean]
    var sourceVolume: js.UndefOr[String]
  }

  object MountPoint {
    def apply(containerPath: js.UndefOr[String] = js.undefined,
              readOnly: js.UndefOr[Boolean] = js.undefined,
              sourceVolume: js.UndefOr[String] = js.undefined): MountPoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        "containerPath" -> containerPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "readOnly" -> readOnly.map { x =>
          x.asInstanceOf[js.Any]
        },
        "sourceVolume" -> sourceVolume.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MountPoint]
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
    def apply(attachmentId: js.UndefOr[String] = js.undefined,
              ipv6Address: js.UndefOr[String] = js.undefined,
              privateIpv4Address: js.UndefOr[String] = js.undefined): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attachmentId" -> attachmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ipv6Address" -> ipv6Address.map { x =>
          x.asInstanceOf[js.Any]
        },
        "privateIpv4Address" -> privateIpv4Address.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
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
    def apply(isMainNode: js.UndefOr[Boolean] = js.undefined,
              nodeIndex: js.UndefOr[Int] = js.undefined): NodeDetails = {
      val _fields = IndexedSeq[(String, js.Any)]("isMainNode" -> isMainNode.map { x =>
        x.asInstanceOf[js.Any]
      }, "nodeIndex" -> nodeIndex.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeDetails]
    }
  }

  /**
    * Object representing any node overrides to a job definition that is used in a <a>SubmitJob</a> API operation.
    */
  @js.native
  trait NodeOverrides extends js.Object {
    var nodePropertyOverrides: js.UndefOr[NodePropertyOverrides]
  }

  object NodeOverrides {
    def apply(nodePropertyOverrides: js.UndefOr[NodePropertyOverrides] = js.undefined): NodeOverrides = {
      val _fields = IndexedSeq[(String, js.Any)]("nodePropertyOverrides" -> nodePropertyOverrides.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeOverrides]
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
    def apply(mainNode: Int, nodeRangeProperties: NodeRangeProperties, numNodes: Int): NodeProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "mainNode"            -> mainNode.asInstanceOf[js.Any],
        "nodeRangeProperties" -> nodeRangeProperties.asInstanceOf[js.Any],
        "numNodes"            -> numNodes.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeProperties]
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
    def apply(isMainNode: js.UndefOr[Boolean] = js.undefined,
              nodeIndex: js.UndefOr[Int] = js.undefined,
              numNodes: js.UndefOr[Int] = js.undefined): NodePropertiesSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "isMainNode" -> isMainNode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nodeIndex" -> nodeIndex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "numNodes" -> numNodes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodePropertiesSummary]
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
    def apply(targetNodes: String,
              containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined): NodePropertyOverride = {
      val _fields = IndexedSeq[(String, js.Any)](
        "targetNodes" -> targetNodes.asInstanceOf[js.Any],
        "containerOverrides" -> containerOverrides.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodePropertyOverride]
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
    def apply(targetNodes: String, container: js.UndefOr[ContainerProperties] = js.undefined): NodeRangeProperty = {
      val _fields =
        IndexedSeq[(String, js.Any)]("targetNodes" -> targetNodes.asInstanceOf[js.Any], "container" -> container.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeRangeProperty]
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
    def apply(jobDefinitionName: String,
              `type`: JobDefinitionType,
              containerProperties: js.UndefOr[ContainerProperties] = js.undefined,
              nodeProperties: js.UndefOr[NodeProperties] = js.undefined,
              parameters: js.UndefOr[ParametersMap] = js.undefined,
              retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
              timeout: js.UndefOr[JobTimeout] = js.undefined): RegisterJobDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinitionName" -> jobDefinitionName.asInstanceOf[js.Any],
        "`type`"            -> `type`.asInstanceOf[js.Any],
        "containerProperties" -> containerProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nodeProperties" -> nodeProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameters" -> parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "retryStrategy" -> retryStrategy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeout" -> timeout.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterJobDefinitionRequest]
    }
  }

  @js.native
  trait RegisterJobDefinitionResponse extends js.Object {
    var jobDefinitionArn: String
    var jobDefinitionName: String
    var revision: Int
  }

  object RegisterJobDefinitionResponse {
    def apply(jobDefinitionArn: String, jobDefinitionName: String, revision: Int): RegisterJobDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinitionArn"  -> jobDefinitionArn.asInstanceOf[js.Any],
        "jobDefinitionName" -> jobDefinitionName.asInstanceOf[js.Any],
        "revision"          -> revision.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterJobDefinitionResponse]
    }
  }

  /**
    * The retry strategy associated with a job.
    */
  @js.native
  trait RetryStrategy extends js.Object {
    var attempts: js.UndefOr[Int]
  }

  object RetryStrategy {
    def apply(attempts: js.UndefOr[Int] = js.undefined): RetryStrategy = {
      val _fields = IndexedSeq[(String, js.Any)]("attempts" -> attempts.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetryStrategy]
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
    def apply(jobDefinition: String,
              jobName: String,
              jobQueue: String,
              arrayProperties: js.UndefOr[ArrayProperties] = js.undefined,
              containerOverrides: js.UndefOr[ContainerOverrides] = js.undefined,
              dependsOn: js.UndefOr[JobDependencyList] = js.undefined,
              nodeOverrides: js.UndefOr[NodeOverrides] = js.undefined,
              parameters: js.UndefOr[ParametersMap] = js.undefined,
              retryStrategy: js.UndefOr[RetryStrategy] = js.undefined,
              timeout: js.UndefOr[JobTimeout] = js.undefined): SubmitJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobDefinition" -> jobDefinition.asInstanceOf[js.Any],
        "jobName"       -> jobName.asInstanceOf[js.Any],
        "jobQueue"      -> jobQueue.asInstanceOf[js.Any],
        "arrayProperties" -> arrayProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "containerOverrides" -> containerOverrides.map { x =>
          x.asInstanceOf[js.Any]
        },
        "dependsOn" -> dependsOn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nodeOverrides" -> nodeOverrides.map { x =>
          x.asInstanceOf[js.Any]
        },
        "parameters" -> parameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "retryStrategy" -> retryStrategy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "timeout" -> timeout.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitJobRequest]
    }
  }

  @js.native
  trait SubmitJobResponse extends js.Object {
    var jobId: String
    var jobName: String
  }

  object SubmitJobResponse {
    def apply(jobId: String, jobName: String): SubmitJobResponse = {
      val _fields =
        IndexedSeq[(String, js.Any)]("jobId" -> jobId.asInstanceOf[js.Any], "jobName" -> jobName.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubmitJobResponse]
    }
  }

  @js.native
  trait TerminateJobRequest extends js.Object {
    var jobId: String
    var reason: String
  }

  object TerminateJobRequest {
    def apply(jobId: String, reason: String): TerminateJobRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("jobId" -> jobId.asInstanceOf[js.Any], "reason" -> reason.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateJobRequest]
    }
  }

  @js.native
  trait TerminateJobResponse extends js.Object {}

  object TerminateJobResponse {
    def apply(): TerminateJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateJobResponse]
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
    def apply(hardLimit: Int, name: String, softLimit: Int): Ulimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "hardLimit" -> hardLimit.asInstanceOf[js.Any],
        "name"      -> name.asInstanceOf[js.Any],
        "softLimit" -> softLimit.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ulimit]
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
    def apply(computeEnvironment: String,
              computeResources: js.UndefOr[ComputeResourceUpdate] = js.undefined,
              serviceRole: js.UndefOr[String] = js.undefined,
              state: js.UndefOr[CEState] = js.undefined): UpdateComputeEnvironmentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironment" -> computeEnvironment.asInstanceOf[js.Any],
        "computeResources" -> computeResources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "serviceRole" -> serviceRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateComputeEnvironmentRequest]
    }
  }

  @js.native
  trait UpdateComputeEnvironmentResponse extends js.Object {
    var computeEnvironmentArn: js.UndefOr[String]
    var computeEnvironmentName: js.UndefOr[String]
  }

  object UpdateComputeEnvironmentResponse {
    def apply(computeEnvironmentArn: js.UndefOr[String] = js.undefined,
              computeEnvironmentName: js.UndefOr[String] = js.undefined): UpdateComputeEnvironmentResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "computeEnvironmentArn" -> computeEnvironmentArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "computeEnvironmentName" -> computeEnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateComputeEnvironmentResponse]
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
    def apply(jobQueue: String,
              computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.undefined,
              priority: js.UndefOr[Int] = js.undefined,
              state: js.UndefOr[JQState] = js.undefined): UpdateJobQueueRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobQueue" -> jobQueue.asInstanceOf[js.Any],
        "computeEnvironmentOrder" -> computeEnvironmentOrder.map { x =>
          x.asInstanceOf[js.Any]
        },
        "priority" -> priority.map { x =>
          x.asInstanceOf[js.Any]
        },
        "state" -> state.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobQueueRequest]
    }
  }

  @js.native
  trait UpdateJobQueueResponse extends js.Object {
    var jobQueueArn: js.UndefOr[String]
    var jobQueueName: js.UndefOr[String]
  }

  object UpdateJobQueueResponse {
    def apply(jobQueueArn: js.UndefOr[String] = js.undefined,
              jobQueueName: js.UndefOr[String] = js.undefined): UpdateJobQueueResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("jobQueueArn" -> jobQueueArn.map { x =>
        x.asInstanceOf[js.Any]
      }, "jobQueueName" -> jobQueueName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobQueueResponse]
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
    def apply(host: js.UndefOr[Host] = js.undefined, name: js.UndefOr[String] = js.undefined): Volume = {
      val _fields = IndexedSeq[(String, js.Any)]("host" -> host.map { x =>
        x.asInstanceOf[js.Any]
      }, "name" -> name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Volume]
    }
  }
}
