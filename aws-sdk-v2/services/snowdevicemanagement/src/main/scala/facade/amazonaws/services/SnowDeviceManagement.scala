package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object snowdevicemanagement {
  type CapacityList = js.Array[Capacity]
  type CapacityNameString = String
  type CapacityUnitString = String
  type DeviceSummaryList = js.Array[DeviceSummary]
  type ExecutionId = String
  type ExecutionSummaryList = js.Array[ExecutionSummary]
  type IdempotencyToken = String
  type InstanceBlockDeviceMappingList = js.Array[InstanceBlockDeviceMapping]
  type InstanceIdsList = js.Array[String]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type JobId = String
  type ListDeviceResourcesInputTypeString = String
  type ManagedDeviceId = String
  type MaxResults = Int
  type NextToken = String
  type PhysicalNetworkInterfaceList = js.Array[PhysicalNetworkInterface]
  type ResourceSummaryList = js.Array[ResourceSummary]
  type SecurityGroupIdentifierList = js.Array[SecurityGroupIdentifier]
  type TagKeys = js.Array[String]
  type TagMap = js.Dictionary[String]
  type TargetList = js.Array[String]
  type TaskDescriptionString = String
  type TaskId = String
  type TaskSummaryList = js.Array[TaskSummary]
  type Timestamp = js.Date

  final class SnowDeviceManagementOps(private val service: SnowDeviceManagement) extends AnyVal {

    @inline def cancelTaskFuture(params: CancelTaskInput): Future[CancelTaskOutput] = service.cancelTask(params).promise().toFuture
    @inline def createTaskFuture(params: CreateTaskInput): Future[CreateTaskOutput] = service.createTask(params).promise().toFuture
    @inline def describeDeviceEc2InstancesFuture(params: DescribeDeviceEc2Input): Future[DescribeDeviceEc2Output] = service.describeDeviceEc2Instances(params).promise().toFuture
    @inline def describeDeviceFuture(params: DescribeDeviceInput): Future[DescribeDeviceOutput] = service.describeDevice(params).promise().toFuture
    @inline def describeExecutionFuture(params: DescribeExecutionInput): Future[DescribeExecutionOutput] = service.describeExecution(params).promise().toFuture
    @inline def describeTaskFuture(params: DescribeTaskInput): Future[DescribeTaskOutput] = service.describeTask(params).promise().toFuture
    @inline def listDeviceResourcesFuture(params: ListDeviceResourcesInput): Future[ListDeviceResourcesOutput] = service.listDeviceResources(params).promise().toFuture
    @inline def listDevicesFuture(params: ListDevicesInput): Future[ListDevicesOutput] = service.listDevices(params).promise().toFuture
    @inline def listExecutionsFuture(params: ListExecutionsInput): Future[ListExecutionsOutput] = service.listExecutions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def listTasksFuture(params: ListTasksInput): Future[ListTasksOutput] = service.listTasks(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[js.Object] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/snowdevicemanagement", JSImport.Namespace, "AWS.SnowDeviceManagement")
  class SnowDeviceManagement() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelTask(params: CancelTaskInput): Request[CancelTaskOutput] = js.native
    def createTask(params: CreateTaskInput): Request[CreateTaskOutput] = js.native
    def describeDevice(params: DescribeDeviceInput): Request[DescribeDeviceOutput] = js.native
    def describeDeviceEc2Instances(params: DescribeDeviceEc2Input): Request[DescribeDeviceEc2Output] = js.native
    def describeExecution(params: DescribeExecutionInput): Request[DescribeExecutionOutput] = js.native
    def describeTask(params: DescribeTaskInput): Request[DescribeTaskOutput] = js.native
    def listDeviceResources(params: ListDeviceResourcesInput): Request[ListDeviceResourcesOutput] = js.native
    def listDevices(params: ListDevicesInput): Request[ListDevicesOutput] = js.native
    def listExecutions(params: ListExecutionsInput): Request[ListExecutionsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listTasks(params: ListTasksInput): Request[ListTasksOutput] = js.native
    def tagResource(params: TagResourceInput): Request[js.Object] = js.native
    def untagResource(params: UntagResourceInput): Request[js.Object] = js.native
  }
  object SnowDeviceManagement {
    @inline implicit def toOps(service: SnowDeviceManagement): SnowDeviceManagementOps = {
      new SnowDeviceManagementOps(service)
    }
  }

  @js.native
  trait CancelTaskInput extends js.Object {
    var taskId: TaskId
  }

  object CancelTaskInput {
    @inline
    def apply(
        taskId: TaskId
    ): CancelTaskInput = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelTaskInput]
    }
  }

  @js.native
  trait CancelTaskOutput extends js.Object {
    var taskId: js.UndefOr[String]
  }

  object CancelTaskOutput {
    @inline
    def apply(
        taskId: js.UndefOr[String] = js.undefined
    ): CancelTaskOutput = {
      val __obj = js.Dynamic.literal()
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelTaskOutput]
    }
  }

  /** The physical capacity of the Amazon Web Services Snow Family device.
    */
  @js.native
  trait Capacity extends js.Object {
    var available: js.UndefOr[Double]
    var name: js.UndefOr[CapacityNameString]
    var total: js.UndefOr[Double]
    var unit: js.UndefOr[CapacityUnitString]
    var used: js.UndefOr[Double]
  }

  object Capacity {
    @inline
    def apply(
        available: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[CapacityNameString] = js.undefined,
        total: js.UndefOr[Double] = js.undefined,
        unit: js.UndefOr[CapacityUnitString] = js.undefined,
        used: js.UndefOr[Double] = js.undefined
    ): Capacity = {
      val __obj = js.Dynamic.literal()
      available.foreach(__v => __obj.updateDynamic("available")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      total.foreach(__v => __obj.updateDynamic("total")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      used.foreach(__v => __obj.updateDynamic("used")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Capacity]
    }
  }

  /** The command given to the device to execute.
    */
  @js.native
  trait Command extends js.Object {
    var reboot: js.UndefOr[Reboot]
    var unlock: js.UndefOr[Unlock]
  }

  object Command {
    @inline
    def apply(
        reboot: js.UndefOr[Reboot] = js.undefined,
        unlock: js.UndefOr[Unlock] = js.undefined
    ): Command = {
      val __obj = js.Dynamic.literal()
      reboot.foreach(__v => __obj.updateDynamic("reboot")(__v.asInstanceOf[js.Any]))
      unlock.foreach(__v => __obj.updateDynamic("unlock")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Command]
    }
  }

  /** The options for how a device's CPU is configured.
    */
  @js.native
  trait CpuOptions extends js.Object {
    var coreCount: js.UndefOr[Int]
    var threadsPerCore: js.UndefOr[Int]
  }

  object CpuOptions {
    @inline
    def apply(
        coreCount: js.UndefOr[Int] = js.undefined,
        threadsPerCore: js.UndefOr[Int] = js.undefined
    ): CpuOptions = {
      val __obj = js.Dynamic.literal()
      coreCount.foreach(__v => __obj.updateDynamic("coreCount")(__v.asInstanceOf[js.Any]))
      threadsPerCore.foreach(__v => __obj.updateDynamic("threadsPerCore")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CpuOptions]
    }
  }

  @js.native
  trait CreateTaskInput extends js.Object {
    var command: Command
    var targets: TargetList
    var clientToken: js.UndefOr[IdempotencyToken]
    var description: js.UndefOr[TaskDescriptionString]
    var tags: js.UndefOr[TagMap]
  }

  object CreateTaskInput {
    @inline
    def apply(
        command: Command,
        targets: TargetList,
        clientToken: js.UndefOr[IdempotencyToken] = js.undefined,
        description: js.UndefOr[TaskDescriptionString] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateTaskInput = {
      val __obj = js.Dynamic.literal(
        "command" -> command.asInstanceOf[js.Any],
        "targets" -> targets.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTaskInput]
    }
  }

  @js.native
  trait CreateTaskOutput extends js.Object {
    var taskArn: js.UndefOr[String]
    var taskId: js.UndefOr[String]
  }

  object CreateTaskOutput {
    @inline
    def apply(
        taskArn: js.UndefOr[String] = js.undefined,
        taskId: js.UndefOr[String] = js.undefined
    ): CreateTaskOutput = {
      val __obj = js.Dynamic.literal()
      taskArn.foreach(__v => __obj.updateDynamic("taskArn")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTaskOutput]
    }
  }

  @js.native
  trait DescribeDeviceEc2Input extends js.Object {
    var instanceIds: InstanceIdsList
    var managedDeviceId: ManagedDeviceId
  }

  object DescribeDeviceEc2Input {
    @inline
    def apply(
        instanceIds: InstanceIdsList,
        managedDeviceId: ManagedDeviceId
    ): DescribeDeviceEc2Input = {
      val __obj = js.Dynamic.literal(
        "instanceIds" -> instanceIds.asInstanceOf[js.Any],
        "managedDeviceId" -> managedDeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDeviceEc2Input]
    }
  }

  @js.native
  trait DescribeDeviceEc2Output extends js.Object {
    var instances: js.UndefOr[InstanceSummaryList]
  }

  object DescribeDeviceEc2Output {
    @inline
    def apply(
        instances: js.UndefOr[InstanceSummaryList] = js.undefined
    ): DescribeDeviceEc2Output = {
      val __obj = js.Dynamic.literal()
      instances.foreach(__v => __obj.updateDynamic("instances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeviceEc2Output]
    }
  }

  @js.native
  trait DescribeDeviceInput extends js.Object {
    var managedDeviceId: ManagedDeviceId
  }

  object DescribeDeviceInput {
    @inline
    def apply(
        managedDeviceId: ManagedDeviceId
    ): DescribeDeviceInput = {
      val __obj = js.Dynamic.literal(
        "managedDeviceId" -> managedDeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDeviceInput]
    }
  }

  @js.native
  trait DescribeDeviceOutput extends js.Object {
    var associatedWithJob: js.UndefOr[String]
    var deviceCapacities: js.UndefOr[CapacityList]
    var deviceState: js.UndefOr[UnlockState]
    var deviceType: js.UndefOr[String]
    var lastReachedOutAt: js.UndefOr[Timestamp]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var managedDeviceArn: js.UndefOr[String]
    var managedDeviceId: js.UndefOr[ManagedDeviceId]
    var physicalNetworkInterfaces: js.UndefOr[PhysicalNetworkInterfaceList]
    var software: js.UndefOr[SoftwareInformation]
    var tags: js.UndefOr[TagMap]
  }

  object DescribeDeviceOutput {
    @inline
    def apply(
        associatedWithJob: js.UndefOr[String] = js.undefined,
        deviceCapacities: js.UndefOr[CapacityList] = js.undefined,
        deviceState: js.UndefOr[UnlockState] = js.undefined,
        deviceType: js.UndefOr[String] = js.undefined,
        lastReachedOutAt: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        managedDeviceArn: js.UndefOr[String] = js.undefined,
        managedDeviceId: js.UndefOr[ManagedDeviceId] = js.undefined,
        physicalNetworkInterfaces: js.UndefOr[PhysicalNetworkInterfaceList] = js.undefined,
        software: js.UndefOr[SoftwareInformation] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeDeviceOutput = {
      val __obj = js.Dynamic.literal()
      associatedWithJob.foreach(__v => __obj.updateDynamic("associatedWithJob")(__v.asInstanceOf[js.Any]))
      deviceCapacities.foreach(__v => __obj.updateDynamic("deviceCapacities")(__v.asInstanceOf[js.Any]))
      deviceState.foreach(__v => __obj.updateDynamic("deviceState")(__v.asInstanceOf[js.Any]))
      deviceType.foreach(__v => __obj.updateDynamic("deviceType")(__v.asInstanceOf[js.Any]))
      lastReachedOutAt.foreach(__v => __obj.updateDynamic("lastReachedOutAt")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      managedDeviceArn.foreach(__v => __obj.updateDynamic("managedDeviceArn")(__v.asInstanceOf[js.Any]))
      managedDeviceId.foreach(__v => __obj.updateDynamic("managedDeviceId")(__v.asInstanceOf[js.Any]))
      physicalNetworkInterfaces.foreach(__v => __obj.updateDynamic("physicalNetworkInterfaces")(__v.asInstanceOf[js.Any]))
      software.foreach(__v => __obj.updateDynamic("software")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeviceOutput]
    }
  }

  @js.native
  trait DescribeExecutionInput extends js.Object {
    var managedDeviceId: ManagedDeviceId
    var taskId: TaskId
  }

  object DescribeExecutionInput {
    @inline
    def apply(
        managedDeviceId: ManagedDeviceId,
        taskId: TaskId
    ): DescribeExecutionInput = {
      val __obj = js.Dynamic.literal(
        "managedDeviceId" -> managedDeviceId.asInstanceOf[js.Any],
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeExecutionInput]
    }
  }

  @js.native
  trait DescribeExecutionOutput extends js.Object {
    var executionId: js.UndefOr[ExecutionId]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var managedDeviceId: js.UndefOr[ManagedDeviceId]
    var startedAt: js.UndefOr[Timestamp]
    var state: js.UndefOr[ExecutionState]
    var taskId: js.UndefOr[TaskId]
  }

  object DescribeExecutionOutput {
    @inline
    def apply(
        executionId: js.UndefOr[ExecutionId] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        managedDeviceId: js.UndefOr[ManagedDeviceId] = js.undefined,
        startedAt: js.UndefOr[Timestamp] = js.undefined,
        state: js.UndefOr[ExecutionState] = js.undefined,
        taskId: js.UndefOr[TaskId] = js.undefined
    ): DescribeExecutionOutput = {
      val __obj = js.Dynamic.literal()
      executionId.foreach(__v => __obj.updateDynamic("executionId")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      managedDeviceId.foreach(__v => __obj.updateDynamic("managedDeviceId")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeExecutionOutput]
    }
  }

  @js.native
  trait DescribeTaskInput extends js.Object {
    var taskId: TaskId
  }

  object DescribeTaskInput {
    @inline
    def apply(
        taskId: TaskId
    ): DescribeTaskInput = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTaskInput]
    }
  }

  @js.native
  trait DescribeTaskOutput extends js.Object {
    var completedAt: js.UndefOr[Timestamp]
    var createdAt: js.UndefOr[Timestamp]
    var description: js.UndefOr[TaskDescriptionString]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var state: js.UndefOr[TaskState]
    var tags: js.UndefOr[TagMap]
    var targets: js.UndefOr[TargetList]
    var taskArn: js.UndefOr[String]
    var taskId: js.UndefOr[String]
  }

  object DescribeTaskOutput {
    @inline
    def apply(
        completedAt: js.UndefOr[Timestamp] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[TaskDescriptionString] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        state: js.UndefOr[TaskState] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        targets: js.UndefOr[TargetList] = js.undefined,
        taskArn: js.UndefOr[String] = js.undefined,
        taskId: js.UndefOr[String] = js.undefined
    ): DescribeTaskOutput = {
      val __obj = js.Dynamic.literal()
      completedAt.foreach(__v => __obj.updateDynamic("completedAt")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      targets.foreach(__v => __obj.updateDynamic("targets")(__v.asInstanceOf[js.Any]))
      taskArn.foreach(__v => __obj.updateDynamic("taskArn")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTaskOutput]
    }
  }

  /** Identifying information about the device.
    */
  @js.native
  trait DeviceSummary extends js.Object {
    var associatedWithJob: js.UndefOr[String]
    var managedDeviceArn: js.UndefOr[String]
    var managedDeviceId: js.UndefOr[ManagedDeviceId]
    var tags: js.UndefOr[TagMap]
  }

  object DeviceSummary {
    @inline
    def apply(
        associatedWithJob: js.UndefOr[String] = js.undefined,
        managedDeviceArn: js.UndefOr[String] = js.undefined,
        managedDeviceId: js.UndefOr[ManagedDeviceId] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DeviceSummary = {
      val __obj = js.Dynamic.literal()
      associatedWithJob.foreach(__v => __obj.updateDynamic("associatedWithJob")(__v.asInstanceOf[js.Any]))
      managedDeviceArn.foreach(__v => __obj.updateDynamic("managedDeviceArn")(__v.asInstanceOf[js.Any]))
      managedDeviceId.foreach(__v => __obj.updateDynamic("managedDeviceId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceSummary]
    }
  }

  /** Describes a parameter used to set up an Amazon Elastic Block Store (Amazon EBS) volume in a block device mapping.
    */
  @js.native
  trait EbsInstanceBlockDevice extends js.Object {
    var attachTime: js.UndefOr[Timestamp]
    var deleteOnTermination: js.UndefOr[Boolean]
    var status: js.UndefOr[AttachmentStatus]
    var volumeId: js.UndefOr[String]
  }

  object EbsInstanceBlockDevice {
    @inline
    def apply(
        attachTime: js.UndefOr[Timestamp] = js.undefined,
        deleteOnTermination: js.UndefOr[Boolean] = js.undefined,
        status: js.UndefOr[AttachmentStatus] = js.undefined,
        volumeId: js.UndefOr[String] = js.undefined
    ): EbsInstanceBlockDevice = {
      val __obj = js.Dynamic.literal()
      attachTime.foreach(__v => __obj.updateDynamic("attachTime")(__v.asInstanceOf[js.Any]))
      deleteOnTermination.foreach(__v => __obj.updateDynamic("deleteOnTermination")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      volumeId.foreach(__v => __obj.updateDynamic("volumeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EbsInstanceBlockDevice]
    }
  }

  /** The summary of a task execution on a specified device.
    */
  @js.native
  trait ExecutionSummary extends js.Object {
    var executionId: js.UndefOr[ExecutionId]
    var managedDeviceId: js.UndefOr[ManagedDeviceId]
    var state: js.UndefOr[ExecutionState]
    var taskId: js.UndefOr[TaskId]
  }

  object ExecutionSummary {
    @inline
    def apply(
        executionId: js.UndefOr[ExecutionId] = js.undefined,
        managedDeviceId: js.UndefOr[ManagedDeviceId] = js.undefined,
        state: js.UndefOr[ExecutionState] = js.undefined,
        taskId: js.UndefOr[TaskId] = js.undefined
    ): ExecutionSummary = {
      val __obj = js.Dynamic.literal()
      executionId.foreach(__v => __obj.updateDynamic("executionId")(__v.asInstanceOf[js.Any]))
      managedDeviceId.foreach(__v => __obj.updateDynamic("managedDeviceId")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionSummary]
    }
  }

  /** The description of an instance. Currently, Amazon EC2 instances are the only supported instance type.
    */
  @js.native
  trait Instance extends js.Object {
    var amiLaunchIndex: js.UndefOr[Int]
    var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList]
    var cpuOptions: js.UndefOr[CpuOptions]
    var createdAt: js.UndefOr[Timestamp]
    var imageId: js.UndefOr[String]
    var instanceId: js.UndefOr[String]
    var instanceType: js.UndefOr[String]
    var privateIpAddress: js.UndefOr[String]
    var publicIpAddress: js.UndefOr[String]
    var rootDeviceName: js.UndefOr[String]
    var securityGroups: js.UndefOr[SecurityGroupIdentifierList]
    var state: js.UndefOr[InstanceState]
    var updatedAt: js.UndefOr[Timestamp]
  }

  object Instance {
    @inline
    def apply(
        amiLaunchIndex: js.UndefOr[Int] = js.undefined,
        blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined,
        cpuOptions: js.UndefOr[CpuOptions] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        imageId: js.UndefOr[String] = js.undefined,
        instanceId: js.UndefOr[String] = js.undefined,
        instanceType: js.UndefOr[String] = js.undefined,
        privateIpAddress: js.UndefOr[String] = js.undefined,
        publicIpAddress: js.UndefOr[String] = js.undefined,
        rootDeviceName: js.UndefOr[String] = js.undefined,
        securityGroups: js.UndefOr[SecurityGroupIdentifierList] = js.undefined,
        state: js.UndefOr[InstanceState] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal()
      amiLaunchIndex.foreach(__v => __obj.updateDynamic("amiLaunchIndex")(__v.asInstanceOf[js.Any]))
      blockDeviceMappings.foreach(__v => __obj.updateDynamic("blockDeviceMappings")(__v.asInstanceOf[js.Any]))
      cpuOptions.foreach(__v => __obj.updateDynamic("cpuOptions")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      imageId.foreach(__v => __obj.updateDynamic("imageId")(__v.asInstanceOf[js.Any]))
      instanceId.foreach(__v => __obj.updateDynamic("instanceId")(__v.asInstanceOf[js.Any]))
      instanceType.foreach(__v => __obj.updateDynamic("instanceType")(__v.asInstanceOf[js.Any]))
      privateIpAddress.foreach(__v => __obj.updateDynamic("privateIpAddress")(__v.asInstanceOf[js.Any]))
      publicIpAddress.foreach(__v => __obj.updateDynamic("publicIpAddress")(__v.asInstanceOf[js.Any]))
      rootDeviceName.foreach(__v => __obj.updateDynamic("rootDeviceName")(__v.asInstanceOf[js.Any]))
      securityGroups.foreach(__v => __obj.updateDynamic("securityGroups")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /** The description of a block device mapping.
    */
  @js.native
  trait InstanceBlockDeviceMapping extends js.Object {
    var deviceName: js.UndefOr[String]
    var ebs: js.UndefOr[EbsInstanceBlockDevice]
  }

  object InstanceBlockDeviceMapping {
    @inline
    def apply(
        deviceName: js.UndefOr[String] = js.undefined,
        ebs: js.UndefOr[EbsInstanceBlockDevice] = js.undefined
    ): InstanceBlockDeviceMapping = {
      val __obj = js.Dynamic.literal()
      deviceName.foreach(__v => __obj.updateDynamic("deviceName")(__v.asInstanceOf[js.Any]))
      ebs.foreach(__v => __obj.updateDynamic("ebs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceBlockDeviceMapping]
    }
  }

  /** The description of the current state of an instance.
    */
  @js.native
  trait InstanceState extends js.Object {
    var code: js.UndefOr[Int]
    var name: js.UndefOr[InstanceStateName]
  }

  object InstanceState {
    @inline
    def apply(
        code: js.UndefOr[Int] = js.undefined,
        name: js.UndefOr[InstanceStateName] = js.undefined
    ): InstanceState = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceState]
    }
  }

  /** The details about the instance.
    */
  @js.native
  trait InstanceSummary extends js.Object {
    var instance: js.UndefOr[Instance]
    var lastUpdatedAt: js.UndefOr[Timestamp]
  }

  object InstanceSummary {
    @inline
    def apply(
        instance: js.UndefOr[Instance] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): InstanceSummary = {
      val __obj = js.Dynamic.literal()
      instance.foreach(__v => __obj.updateDynamic("instance")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceSummary]
    }
  }

  @js.native
  trait ListDeviceResourcesInput extends js.Object {
    var managedDeviceId: ManagedDeviceId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var `type`: js.UndefOr[ListDeviceResourcesInputTypeString]
  }

  object ListDeviceResourcesInput {
    @inline
    def apply(
        managedDeviceId: ManagedDeviceId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        `type`: js.UndefOr[ListDeviceResourcesInputTypeString] = js.undefined
    ): ListDeviceResourcesInput = {
      val __obj = js.Dynamic.literal(
        "managedDeviceId" -> managedDeviceId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceResourcesInput]
    }
  }

  @js.native
  trait ListDeviceResourcesOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var resources: js.UndefOr[ResourceSummaryList]
  }

  object ListDeviceResourcesOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resources: js.UndefOr[ResourceSummaryList] = js.undefined
    ): ListDeviceResourcesOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resources.foreach(__v => __obj.updateDynamic("resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceResourcesOutput]
    }
  }

  @js.native
  trait ListDevicesInput extends js.Object {
    var jobId: js.UndefOr[JobId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDevicesInput {
    @inline
    def apply(
        jobId: js.UndefOr[JobId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesInput = {
      val __obj = js.Dynamic.literal()
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesInput]
    }
  }

  @js.native
  trait ListDevicesOutput extends js.Object {
    var devices: js.UndefOr[DeviceSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDevicesOutput {
    @inline
    def apply(
        devices: js.UndefOr[DeviceSummaryList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesOutput = {
      val __obj = js.Dynamic.literal()
      devices.foreach(__v => __obj.updateDynamic("devices")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesOutput]
    }
  }

  @js.native
  trait ListExecutionsInput extends js.Object {
    var taskId: TaskId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var state: js.UndefOr[ExecutionState]
  }

  object ListExecutionsInput {
    @inline
    def apply(
        taskId: TaskId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        state: js.UndefOr[ExecutionState] = js.undefined
    ): ListExecutionsInput = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExecutionsInput]
    }
  }

  @js.native
  trait ListExecutionsOutput extends js.Object {
    var executions: js.UndefOr[ExecutionSummaryList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListExecutionsOutput {
    @inline
    def apply(
        executions: js.UndefOr[ExecutionSummaryList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExecutionsOutput = {
      val __obj = js.Dynamic.literal()
      executions.foreach(__v => __obj.updateDynamic("executions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExecutionsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait ListTasksInput extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var state: js.UndefOr[TaskState]
  }

  object ListTasksInput {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        state: js.UndefOr[TaskState] = js.undefined
    ): ListTasksInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTasksInput]
    }
  }

  @js.native
  trait ListTasksOutput extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tasks: js.UndefOr[TaskSummaryList]
  }

  object ListTasksOutput {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tasks: js.UndefOr[TaskSummaryList] = js.undefined
    ): ListTasksOutput = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tasks.foreach(__v => __obj.updateDynamic("tasks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTasksOutput]
    }
  }

  /** The details about the physical network interface for the device.
    */
  @js.native
  trait PhysicalNetworkInterface extends js.Object {
    var defaultGateway: js.UndefOr[String]
    var ipAddress: js.UndefOr[String]
    var ipAddressAssignment: js.UndefOr[IpAddressAssignment]
    var macAddress: js.UndefOr[String]
    var netmask: js.UndefOr[String]
    var physicalConnectorType: js.UndefOr[PhysicalConnectorType]
    var physicalNetworkInterfaceId: js.UndefOr[String]
  }

  object PhysicalNetworkInterface {
    @inline
    def apply(
        defaultGateway: js.UndefOr[String] = js.undefined,
        ipAddress: js.UndefOr[String] = js.undefined,
        ipAddressAssignment: js.UndefOr[IpAddressAssignment] = js.undefined,
        macAddress: js.UndefOr[String] = js.undefined,
        netmask: js.UndefOr[String] = js.undefined,
        physicalConnectorType: js.UndefOr[PhysicalConnectorType] = js.undefined,
        physicalNetworkInterfaceId: js.UndefOr[String] = js.undefined
    ): PhysicalNetworkInterface = {
      val __obj = js.Dynamic.literal()
      defaultGateway.foreach(__v => __obj.updateDynamic("defaultGateway")(__v.asInstanceOf[js.Any]))
      ipAddress.foreach(__v => __obj.updateDynamic("ipAddress")(__v.asInstanceOf[js.Any]))
      ipAddressAssignment.foreach(__v => __obj.updateDynamic("ipAddressAssignment")(__v.asInstanceOf[js.Any]))
      macAddress.foreach(__v => __obj.updateDynamic("macAddress")(__v.asInstanceOf[js.Any]))
      netmask.foreach(__v => __obj.updateDynamic("netmask")(__v.asInstanceOf[js.Any]))
      physicalConnectorType.foreach(__v => __obj.updateDynamic("physicalConnectorType")(__v.asInstanceOf[js.Any]))
      physicalNetworkInterfaceId.foreach(__v => __obj.updateDynamic("physicalNetworkInterfaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhysicalNetworkInterface]
    }
  }

  /** A structure used to reboot the device.
    */
  @js.native
  trait Reboot extends js.Object

  object Reboot {
    @inline
    def apply(): Reboot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reboot]
    }
  }

  /** A summary of a resource available on the device.
    */
  @js.native
  trait ResourceSummary extends js.Object {
    var resourceType: String
    var arn: js.UndefOr[String]
    var id: js.UndefOr[String]
  }

  object ResourceSummary {
    @inline
    def apply(
        resourceType: String,
        arn: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined
    ): ResourceSummary = {
      val __obj = js.Dynamic.literal(
        "resourceType" -> resourceType.asInstanceOf[js.Any]
      )

      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceSummary]
    }
  }

  /** Information about the device's security group.
    */
  @js.native
  trait SecurityGroupIdentifier extends js.Object {
    var groupId: js.UndefOr[String]
    var groupName: js.UndefOr[String]
  }

  object SecurityGroupIdentifier {
    @inline
    def apply(
        groupId: js.UndefOr[String] = js.undefined,
        groupName: js.UndefOr[String] = js.undefined
    ): SecurityGroupIdentifier = {
      val __obj = js.Dynamic.literal()
      groupId.foreach(__v => __obj.updateDynamic("groupId")(__v.asInstanceOf[js.Any]))
      groupName.foreach(__v => __obj.updateDynamic("groupName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityGroupIdentifier]
    }
  }

  /** Information about the software on the device.
    */
  @js.native
  trait SoftwareInformation extends js.Object {
    var installState: js.UndefOr[String]
    var installedVersion: js.UndefOr[String]
    var installingVersion: js.UndefOr[String]
  }

  object SoftwareInformation {
    @inline
    def apply(
        installState: js.UndefOr[String] = js.undefined,
        installedVersion: js.UndefOr[String] = js.undefined,
        installingVersion: js.UndefOr[String] = js.undefined
    ): SoftwareInformation = {
      val __obj = js.Dynamic.literal()
      installState.foreach(__v => __obj.updateDynamic("installState")(__v.asInstanceOf[js.Any]))
      installedVersion.foreach(__v => __obj.updateDynamic("installedVersion")(__v.asInstanceOf[js.Any]))
      installingVersion.foreach(__v => __obj.updateDynamic("installingVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SoftwareInformation]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: String
    var tags: TagMap
  }

  object TagResourceInput {
    @inline
    def apply(
        resourceArn: String,
        tags: TagMap
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  /** Information about the task assigned to one or many devices.
    */
  @js.native
  trait TaskSummary extends js.Object {
    var taskId: TaskId
    var state: js.UndefOr[TaskState]
    var tags: js.UndefOr[TagMap]
    var taskArn: js.UndefOr[String]
  }

  object TaskSummary {
    @inline
    def apply(
        taskId: TaskId,
        state: js.UndefOr[TaskState] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        taskArn: js.UndefOr[String] = js.undefined
    ): TaskSummary = {
      val __obj = js.Dynamic.literal(
        "taskId" -> taskId.asInstanceOf[js.Any]
      )

      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      taskArn.foreach(__v => __obj.updateDynamic("taskArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskSummary]
    }
  }

  /** A structure used to unlock a device.
    */
  @js.native
  trait Unlock extends js.Object

  object Unlock {
    @inline
    def apply(): Unlock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Unlock]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  object UntagResourceInput {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeys
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }
}
