package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object panorama {
  type ApplicationInstanceArn = String
  type ApplicationInstanceId = String
  type ApplicationInstanceName = String
  type ApplicationInstanceStatusDescription = String
  type ApplicationInstances = js.Array[ApplicationInstance]
  type Bucket = String
  type BucketName = String
  type Certificates = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ClientToken = String
  type CreatedTime = js.Date
  type CurrentSoftware = String
  type DefaultGateway = String
  type DefaultRuntimeContextDevice = String
  type Description = String
  type DeviceArn = String
  type DeviceId = String
  type DeviceIdList = js.Array[DeviceId]
  type DeviceJobList = js.Array[DeviceJob]
  type DeviceList = js.Array[Device]
  type DeviceName = String
  type DeviceSerialNumber = String
  type Dns = String
  type DnsList = js.Array[Dns]
  type HwAddress = String
  type ImageVersion = String
  type InputPortList = js.Array[NodeInputPort]
  type IotThingName = String
  type IpAddress = String
  type JobId = String
  type JobList = js.Array[Job]
  type JobTagsList = js.Array[JobResourceTags]
  type LastUpdatedTime = js.Date
  type LatestSoftware = String
  type LeaseExpirationTime = js.Date
  type ManifestOverridesPayloadData = String
  type ManifestPayloadData = String
  type MarkLatestPatch = Boolean
  type Mask = String
  type MaxConnections = Int
  type MaxSize25 = Int
  type NextToken = String
  type NodeAssetName = String
  type NodeFromTemplateJobList = js.Array[NodeFromTemplateJob]
  type NodeFromTemplateJobStatusMessage = String
  type NodeId = String
  type NodeInstanceId = String
  type NodeInstances = js.Array[NodeInstance]
  type NodeName = String
  type NodePackageArn = String
  type NodePackageId = String
  type NodePackageName = String
  type NodePackagePatchVersion = String
  type NodePackageVersion = String
  type NodesList = js.Array[Node]
  type Object = String
  type ObjectKey = String
  type OutputPortList = js.Array[NodeOutputPort]
  type PackageImportJobList = js.Array[PackageImportJob]
  type PackageImportJobStatusMessage = String
  type PackageList = js.Array[PackageListItem]
  type PackageObjects = js.Array[PackageObject]
  type PackageOwnerAccount = String
  type PackageVersionStatusDescription = String
  type PortDefaultValue = String
  type PortName = String
  type PrincipalArn = String
  type PrincipalArnsList = js.Array[PrincipalArn]
  type Region = String
  type ResourceArn = String
  type RuntimeRoleArn = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TemplateKey = String
  type TemplateParametersMap = js.Dictionary[TemplateValue]
  type TemplateValue = String
  type TimeStamp = js.Date
  type Token = String
  type UpdateCreatedTime = js.Date

  final class PanoramaOps(private val service: Panorama) extends AnyVal {

    @inline def createApplicationInstanceFuture(params: CreateApplicationInstanceRequest): Future[CreateApplicationInstanceResponse] = service.createApplicationInstance(params).promise().toFuture
    @inline def createJobForDevicesFuture(params: CreateJobForDevicesRequest): Future[CreateJobForDevicesResponse] = service.createJobForDevices(params).promise().toFuture
    @inline def createNodeFromTemplateJobFuture(params: CreateNodeFromTemplateJobRequest): Future[CreateNodeFromTemplateJobResponse] = service.createNodeFromTemplateJob(params).promise().toFuture
    @inline def createPackageFuture(params: CreatePackageRequest): Future[CreatePackageResponse] = service.createPackage(params).promise().toFuture
    @inline def createPackageImportJobFuture(params: CreatePackageImportJobRequest): Future[CreatePackageImportJobResponse] = service.createPackageImportJob(params).promise().toFuture
    @inline def deleteDeviceFuture(params: DeleteDeviceRequest): Future[DeleteDeviceResponse] = service.deleteDevice(params).promise().toFuture
    @inline def deletePackageFuture(params: DeletePackageRequest): Future[DeletePackageResponse] = service.deletePackage(params).promise().toFuture
    @inline def deregisterPackageVersionFuture(params: DeregisterPackageVersionRequest): Future[DeregisterPackageVersionResponse] = service.deregisterPackageVersion(params).promise().toFuture
    @inline def describeApplicationInstanceDetailsFuture(params: DescribeApplicationInstanceDetailsRequest): Future[DescribeApplicationInstanceDetailsResponse] = service.describeApplicationInstanceDetails(params).promise().toFuture
    @inline def describeApplicationInstanceFuture(params: DescribeApplicationInstanceRequest): Future[DescribeApplicationInstanceResponse] = service.describeApplicationInstance(params).promise().toFuture
    @inline def describeDeviceFuture(params: DescribeDeviceRequest): Future[DescribeDeviceResponse] = service.describeDevice(params).promise().toFuture
    @inline def describeDeviceJobFuture(params: DescribeDeviceJobRequest): Future[DescribeDeviceJobResponse] = service.describeDeviceJob(params).promise().toFuture
    @inline def describeNodeFromTemplateJobFuture(params: DescribeNodeFromTemplateJobRequest): Future[DescribeNodeFromTemplateJobResponse] = service.describeNodeFromTemplateJob(params).promise().toFuture
    @inline def describeNodeFuture(params: DescribeNodeRequest): Future[DescribeNodeResponse] = service.describeNode(params).promise().toFuture
    @inline def describePackageFuture(params: DescribePackageRequest): Future[DescribePackageResponse] = service.describePackage(params).promise().toFuture
    @inline def describePackageImportJobFuture(params: DescribePackageImportJobRequest): Future[DescribePackageImportJobResponse] = service.describePackageImportJob(params).promise().toFuture
    @inline def describePackageVersionFuture(params: DescribePackageVersionRequest): Future[DescribePackageVersionResponse] = service.describePackageVersion(params).promise().toFuture
    @inline def listApplicationInstanceDependenciesFuture(params: ListApplicationInstanceDependenciesRequest): Future[ListApplicationInstanceDependenciesResponse] = service.listApplicationInstanceDependencies(params).promise().toFuture
    @inline def listApplicationInstanceNodeInstancesFuture(params: ListApplicationInstanceNodeInstancesRequest): Future[ListApplicationInstanceNodeInstancesResponse] = service.listApplicationInstanceNodeInstances(params).promise().toFuture
    @inline def listApplicationInstancesFuture(params: ListApplicationInstancesRequest): Future[ListApplicationInstancesResponse] = service.listApplicationInstances(params).promise().toFuture
    @inline def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResponse] = service.listDevices(params).promise().toFuture
    @inline def listDevicesJobsFuture(params: ListDevicesJobsRequest): Future[ListDevicesJobsResponse] = service.listDevicesJobs(params).promise().toFuture
    @inline def listNodeFromTemplateJobsFuture(params: ListNodeFromTemplateJobsRequest): Future[ListNodeFromTemplateJobsResponse] = service.listNodeFromTemplateJobs(params).promise().toFuture
    @inline def listNodesFuture(params: ListNodesRequest): Future[ListNodesResponse] = service.listNodes(params).promise().toFuture
    @inline def listPackageImportJobsFuture(params: ListPackageImportJobsRequest): Future[ListPackageImportJobsResponse] = service.listPackageImportJobs(params).promise().toFuture
    @inline def listPackagesFuture(params: ListPackagesRequest): Future[ListPackagesResponse] = service.listPackages(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def provisionDeviceFuture(params: ProvisionDeviceRequest): Future[ProvisionDeviceResponse] = service.provisionDevice(params).promise().toFuture
    @inline def registerPackageVersionFuture(params: RegisterPackageVersionRequest): Future[RegisterPackageVersionResponse] = service.registerPackageVersion(params).promise().toFuture
    @inline def removeApplicationInstanceFuture(params: RemoveApplicationInstanceRequest): Future[RemoveApplicationInstanceResponse] = service.removeApplicationInstance(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDeviceMetadataFuture(params: UpdateDeviceMetadataRequest): Future[UpdateDeviceMetadataResponse] = service.updateDeviceMetadata(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/panorama", JSImport.Namespace, "AWS.Panorama")
  class Panorama() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApplicationInstance(params: CreateApplicationInstanceRequest): Request[CreateApplicationInstanceResponse] = js.native
    def createJobForDevices(params: CreateJobForDevicesRequest): Request[CreateJobForDevicesResponse] = js.native
    def createNodeFromTemplateJob(params: CreateNodeFromTemplateJobRequest): Request[CreateNodeFromTemplateJobResponse] = js.native
    def createPackage(params: CreatePackageRequest): Request[CreatePackageResponse] = js.native
    def createPackageImportJob(params: CreatePackageImportJobRequest): Request[CreatePackageImportJobResponse] = js.native
    def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse] = js.native
    def deletePackage(params: DeletePackageRequest): Request[DeletePackageResponse] = js.native
    def deregisterPackageVersion(params: DeregisterPackageVersionRequest): Request[DeregisterPackageVersionResponse] = js.native
    def describeApplicationInstance(params: DescribeApplicationInstanceRequest): Request[DescribeApplicationInstanceResponse] = js.native
    def describeApplicationInstanceDetails(params: DescribeApplicationInstanceDetailsRequest): Request[DescribeApplicationInstanceDetailsResponse] = js.native
    def describeDevice(params: DescribeDeviceRequest): Request[DescribeDeviceResponse] = js.native
    def describeDeviceJob(params: DescribeDeviceJobRequest): Request[DescribeDeviceJobResponse] = js.native
    def describeNode(params: DescribeNodeRequest): Request[DescribeNodeResponse] = js.native
    def describeNodeFromTemplateJob(params: DescribeNodeFromTemplateJobRequest): Request[DescribeNodeFromTemplateJobResponse] = js.native
    def describePackage(params: DescribePackageRequest): Request[DescribePackageResponse] = js.native
    def describePackageImportJob(params: DescribePackageImportJobRequest): Request[DescribePackageImportJobResponse] = js.native
    def describePackageVersion(params: DescribePackageVersionRequest): Request[DescribePackageVersionResponse] = js.native
    def listApplicationInstanceDependencies(params: ListApplicationInstanceDependenciesRequest): Request[ListApplicationInstanceDependenciesResponse] = js.native
    def listApplicationInstanceNodeInstances(params: ListApplicationInstanceNodeInstancesRequest): Request[ListApplicationInstanceNodeInstancesResponse] = js.native
    def listApplicationInstances(params: ListApplicationInstancesRequest): Request[ListApplicationInstancesResponse] = js.native
    def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse] = js.native
    def listDevicesJobs(params: ListDevicesJobsRequest): Request[ListDevicesJobsResponse] = js.native
    def listNodeFromTemplateJobs(params: ListNodeFromTemplateJobsRequest): Request[ListNodeFromTemplateJobsResponse] = js.native
    def listNodes(params: ListNodesRequest): Request[ListNodesResponse] = js.native
    def listPackageImportJobs(params: ListPackageImportJobsRequest): Request[ListPackageImportJobsResponse] = js.native
    def listPackages(params: ListPackagesRequest): Request[ListPackagesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def provisionDevice(params: ProvisionDeviceRequest): Request[ProvisionDeviceResponse] = js.native
    def registerPackageVersion(params: RegisterPackageVersionRequest): Request[RegisterPackageVersionResponse] = js.native
    def removeApplicationInstance(params: RemoveApplicationInstanceRequest): Request[RemoveApplicationInstanceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDeviceMetadata(params: UpdateDeviceMetadataRequest): Request[UpdateDeviceMetadataResponse] = js.native
  }
  object Panorama {
    @inline implicit def toOps(service: Panorama): PanoramaOps = {
      new PanoramaOps(service)
    }
  }

  /** An application instance on a device.
    */
  @js.native
  trait ApplicationInstance extends js.Object {
    var ApplicationInstanceId: js.UndefOr[ApplicationInstanceId]
    var Arn: js.UndefOr[ApplicationInstanceArn]
    var CreatedTime: js.UndefOr[TimeStamp]
    var DefaultRuntimeContextDevice: js.UndefOr[DefaultRuntimeContextDevice]
    var DefaultRuntimeContextDeviceName: js.UndefOr[DeviceName]
    var Description: js.UndefOr[Description]
    var HealthStatus: js.UndefOr[ApplicationInstanceHealthStatus]
    var Name: js.UndefOr[ApplicationInstanceName]
    var Status: js.UndefOr[ApplicationInstanceStatus]
    var StatusDescription: js.UndefOr[ApplicationInstanceStatusDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object ApplicationInstance {
    @inline
    def apply(
        ApplicationInstanceId: js.UndefOr[ApplicationInstanceId] = js.undefined,
        Arn: js.UndefOr[ApplicationInstanceArn] = js.undefined,
        CreatedTime: js.UndefOr[TimeStamp] = js.undefined,
        DefaultRuntimeContextDevice: js.UndefOr[DefaultRuntimeContextDevice] = js.undefined,
        DefaultRuntimeContextDeviceName: js.UndefOr[DeviceName] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        HealthStatus: js.UndefOr[ApplicationInstanceHealthStatus] = js.undefined,
        Name: js.UndefOr[ApplicationInstanceName] = js.undefined,
        Status: js.UndefOr[ApplicationInstanceStatus] = js.undefined,
        StatusDescription: js.UndefOr[ApplicationInstanceStatusDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ApplicationInstance = {
      val __obj = js.Dynamic.literal()
      ApplicationInstanceId.foreach(__v => __obj.updateDynamic("ApplicationInstanceId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DefaultRuntimeContextDevice.foreach(__v => __obj.updateDynamic("DefaultRuntimeContextDevice")(__v.asInstanceOf[js.Any]))
      DefaultRuntimeContextDeviceName.foreach(__v => __obj.updateDynamic("DefaultRuntimeContextDeviceName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HealthStatus.foreach(__v => __obj.updateDynamic("HealthStatus")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDescription.foreach(__v => __obj.updateDynamic("StatusDescription")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationInstance]
    }
  }

  @js.native
  trait CreateApplicationInstanceRequest extends js.Object {
    var DefaultRuntimeContextDevice: DefaultRuntimeContextDevice
    var ManifestPayload: ManifestPayload
    var ApplicationInstanceIdToReplace: js.UndefOr[ApplicationInstanceId]
    var Description: js.UndefOr[Description]
    var ManifestOverridesPayload: js.UndefOr[ManifestOverridesPayload]
    var Name: js.UndefOr[ApplicationInstanceName]
    var RuntimeRoleArn: js.UndefOr[RuntimeRoleArn]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateApplicationInstanceRequest {
    @inline
    def apply(
        DefaultRuntimeContextDevice: DefaultRuntimeContextDevice,
        ManifestPayload: ManifestPayload,
        ApplicationInstanceIdToReplace: js.UndefOr[ApplicationInstanceId] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ManifestOverridesPayload: js.UndefOr[ManifestOverridesPayload] = js.undefined,
        Name: js.UndefOr[ApplicationInstanceName] = js.undefined,
        RuntimeRoleArn: js.UndefOr[RuntimeRoleArn] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateApplicationInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultRuntimeContextDevice" -> DefaultRuntimeContextDevice.asInstanceOf[js.Any],
        "ManifestPayload" -> ManifestPayload.asInstanceOf[js.Any]
      )

      ApplicationInstanceIdToReplace.foreach(__v => __obj.updateDynamic("ApplicationInstanceIdToReplace")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ManifestOverridesPayload.foreach(__v => __obj.updateDynamic("ManifestOverridesPayload")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RuntimeRoleArn.foreach(__v => __obj.updateDynamic("RuntimeRoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationInstanceRequest]
    }
  }

  @js.native
  trait CreateApplicationInstanceResponse extends js.Object {
    var ApplicationInstanceId: ApplicationInstanceId
  }

  object CreateApplicationInstanceResponse {
    @inline
    def apply(
        ApplicationInstanceId: ApplicationInstanceId
    ): CreateApplicationInstanceResponse = {
      val __obj = js.Dynamic.literal(
        "ApplicationInstanceId" -> ApplicationInstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateApplicationInstanceResponse]
    }
  }

  @js.native
  trait CreateJobForDevicesRequest extends js.Object {
    var DeviceIds: DeviceIdList
    var DeviceJobConfig: DeviceJobConfig
    var JobType: JobType
  }

  object CreateJobForDevicesRequest {
    @inline
    def apply(
        DeviceIds: DeviceIdList,
        DeviceJobConfig: DeviceJobConfig,
        JobType: JobType
    ): CreateJobForDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceIds" -> DeviceIds.asInstanceOf[js.Any],
        "DeviceJobConfig" -> DeviceJobConfig.asInstanceOf[js.Any],
        "JobType" -> JobType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateJobForDevicesRequest]
    }
  }

  @js.native
  trait CreateJobForDevicesResponse extends js.Object {
    var Jobs: JobList
  }

  object CreateJobForDevicesResponse {
    @inline
    def apply(
        Jobs: JobList
    ): CreateJobForDevicesResponse = {
      val __obj = js.Dynamic.literal(
        "Jobs" -> Jobs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateJobForDevicesResponse]
    }
  }

  @js.native
  trait CreateNodeFromTemplateJobRequest extends js.Object {
    var NodeName: NodeName
    var OutputPackageName: NodePackageName
    var OutputPackageVersion: NodePackageVersion
    var TemplateParameters: TemplateParametersMap
    var TemplateType: TemplateType
    var JobTags: js.UndefOr[JobTagsList]
    var NodeDescription: js.UndefOr[Description]
  }

  object CreateNodeFromTemplateJobRequest {
    @inline
    def apply(
        NodeName: NodeName,
        OutputPackageName: NodePackageName,
        OutputPackageVersion: NodePackageVersion,
        TemplateParameters: TemplateParametersMap,
        TemplateType: TemplateType,
        JobTags: js.UndefOr[JobTagsList] = js.undefined,
        NodeDescription: js.UndefOr[Description] = js.undefined
    ): CreateNodeFromTemplateJobRequest = {
      val __obj = js.Dynamic.literal(
        "NodeName" -> NodeName.asInstanceOf[js.Any],
        "OutputPackageName" -> OutputPackageName.asInstanceOf[js.Any],
        "OutputPackageVersion" -> OutputPackageVersion.asInstanceOf[js.Any],
        "TemplateParameters" -> TemplateParameters.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      JobTags.foreach(__v => __obj.updateDynamic("JobTags")(__v.asInstanceOf[js.Any]))
      NodeDescription.foreach(__v => __obj.updateDynamic("NodeDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNodeFromTemplateJobRequest]
    }
  }

  @js.native
  trait CreateNodeFromTemplateJobResponse extends js.Object {
    var JobId: JobId
  }

  object CreateNodeFromTemplateJobResponse {
    @inline
    def apply(
        JobId: JobId
    ): CreateNodeFromTemplateJobResponse = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateNodeFromTemplateJobResponse]
    }
  }

  @js.native
  trait CreatePackageImportJobRequest extends js.Object {
    var ClientToken: ClientToken
    var InputConfig: PackageImportJobInputConfig
    var JobType: PackageImportJobType
    var OutputConfig: PackageImportJobOutputConfig
    var JobTags: js.UndefOr[JobTagsList]
  }

  object CreatePackageImportJobRequest {
    @inline
    def apply(
        ClientToken: ClientToken,
        InputConfig: PackageImportJobInputConfig,
        JobType: PackageImportJobType,
        OutputConfig: PackageImportJobOutputConfig,
        JobTags: js.UndefOr[JobTagsList] = js.undefined
    ): CreatePackageImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "JobType" -> JobType.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any]
      )

      JobTags.foreach(__v => __obj.updateDynamic("JobTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackageImportJobRequest]
    }
  }

  @js.native
  trait CreatePackageImportJobResponse extends js.Object {
    var JobId: JobId
  }

  object CreatePackageImportJobResponse {
    @inline
    def apply(
        JobId: JobId
    ): CreatePackageImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePackageImportJobResponse]
    }
  }

  @js.native
  trait CreatePackageRequest extends js.Object {
    var PackageName: NodePackageName
    var Tags: js.UndefOr[TagMap]
  }

  object CreatePackageRequest {
    @inline
    def apply(
        PackageName: NodePackageName,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreatePackageRequest = {
      val __obj = js.Dynamic.literal(
        "PackageName" -> PackageName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackageRequest]
    }
  }

  @js.native
  trait CreatePackageResponse extends js.Object {
    var StorageLocation: StorageLocation
    var Arn: js.UndefOr[NodePackageArn]
    var PackageId: js.UndefOr[NodePackageId]
  }

  object CreatePackageResponse {
    @inline
    def apply(
        StorageLocation: StorageLocation,
        Arn: js.UndefOr[NodePackageArn] = js.undefined,
        PackageId: js.UndefOr[NodePackageId] = js.undefined
    ): CreatePackageResponse = {
      val __obj = js.Dynamic.literal(
        "StorageLocation" -> StorageLocation.asInstanceOf[js.Any]
      )

      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      PackageId.foreach(__v => __obj.updateDynamic("PackageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePackageResponse]
    }
  }

  @js.native
  trait DeleteDeviceRequest extends js.Object {
    var DeviceId: DeviceId
  }

  object DeleteDeviceRequest {
    @inline
    def apply(
        DeviceId: DeviceId
    ): DeleteDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDeviceRequest]
    }
  }

  @js.native
  trait DeleteDeviceResponse extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
  }

  object DeleteDeviceResponse {
    @inline
    def apply(
        DeviceId: js.UndefOr[DeviceId] = js.undefined
    ): DeleteDeviceResponse = {
      val __obj = js.Dynamic.literal()
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDeviceResponse]
    }
  }

  @js.native
  trait DeletePackageRequest extends js.Object {
    var PackageId: NodePackageId
    var ForceDelete: js.UndefOr[Boolean]
  }

  object DeletePackageRequest {
    @inline
    def apply(
        PackageId: NodePackageId,
        ForceDelete: js.UndefOr[Boolean] = js.undefined
    ): DeletePackageRequest = {
      val __obj = js.Dynamic.literal(
        "PackageId" -> PackageId.asInstanceOf[js.Any]
      )

      ForceDelete.foreach(__v => __obj.updateDynamic("ForceDelete")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePackageRequest]
    }
  }

  @js.native
  trait DeletePackageResponse extends js.Object

  object DeletePackageResponse {
    @inline
    def apply(): DeletePackageResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePackageResponse]
    }
  }

  @js.native
  trait DeregisterPackageVersionRequest extends js.Object {
    var PackageId: NodePackageId
    var PackageVersion: NodePackageVersion
    var PatchVersion: NodePackagePatchVersion
    var OwnerAccount: js.UndefOr[PackageOwnerAccount]
    var UpdatedLatestPatchVersion: js.UndefOr[NodePackagePatchVersion]
  }

  object DeregisterPackageVersionRequest {
    @inline
    def apply(
        PackageId: NodePackageId,
        PackageVersion: NodePackageVersion,
        PatchVersion: NodePackagePatchVersion,
        OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined,
        UpdatedLatestPatchVersion: js.UndefOr[NodePackagePatchVersion] = js.undefined
    ): DeregisterPackageVersionRequest = {
      val __obj = js.Dynamic.literal(
        "PackageId" -> PackageId.asInstanceOf[js.Any],
        "PackageVersion" -> PackageVersion.asInstanceOf[js.Any],
        "PatchVersion" -> PatchVersion.asInstanceOf[js.Any]
      )

      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      UpdatedLatestPatchVersion.foreach(__v => __obj.updateDynamic("UpdatedLatestPatchVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterPackageVersionRequest]
    }
  }

  @js.native
  trait DeregisterPackageVersionResponse extends js.Object

  object DeregisterPackageVersionResponse {
    @inline
    def apply(): DeregisterPackageVersionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeregisterPackageVersionResponse]
    }
  }

  @js.native
  trait DescribeApplicationInstanceDetailsRequest extends js.Object {
    var ApplicationInstanceId: ApplicationInstanceId
  }

  object DescribeApplicationInstanceDetailsRequest {
    @inline
    def apply(
        ApplicationInstanceId: ApplicationInstanceId
    ): DescribeApplicationInstanceDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationInstanceId" -> ApplicationInstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeApplicationInstanceDetailsRequest]
    }
  }

  @js.native
  trait DescribeApplicationInstanceDetailsResponse extends js.Object {
    var ApplicationInstanceId: js.UndefOr[ApplicationInstanceId]
    var ApplicationInstanceIdToReplace: js.UndefOr[ApplicationInstanceId]
    var CreatedTime: js.UndefOr[TimeStamp]
    var DefaultRuntimeContextDevice: js.UndefOr[DefaultRuntimeContextDevice]
    var Description: js.UndefOr[Description]
    var ManifestOverridesPayload: js.UndefOr[ManifestOverridesPayload]
    var ManifestPayload: js.UndefOr[ManifestPayload]
    var Name: js.UndefOr[ApplicationInstanceName]
  }

  object DescribeApplicationInstanceDetailsResponse {
    @inline
    def apply(
        ApplicationInstanceId: js.UndefOr[ApplicationInstanceId] = js.undefined,
        ApplicationInstanceIdToReplace: js.UndefOr[ApplicationInstanceId] = js.undefined,
        CreatedTime: js.UndefOr[TimeStamp] = js.undefined,
        DefaultRuntimeContextDevice: js.UndefOr[DefaultRuntimeContextDevice] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ManifestOverridesPayload: js.UndefOr[ManifestOverridesPayload] = js.undefined,
        ManifestPayload: js.UndefOr[ManifestPayload] = js.undefined,
        Name: js.UndefOr[ApplicationInstanceName] = js.undefined
    ): DescribeApplicationInstanceDetailsResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationInstanceId.foreach(__v => __obj.updateDynamic("ApplicationInstanceId")(__v.asInstanceOf[js.Any]))
      ApplicationInstanceIdToReplace.foreach(__v => __obj.updateDynamic("ApplicationInstanceIdToReplace")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DefaultRuntimeContextDevice.foreach(__v => __obj.updateDynamic("DefaultRuntimeContextDevice")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ManifestOverridesPayload.foreach(__v => __obj.updateDynamic("ManifestOverridesPayload")(__v.asInstanceOf[js.Any]))
      ManifestPayload.foreach(__v => __obj.updateDynamic("ManifestPayload")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationInstanceDetailsResponse]
    }
  }

  @js.native
  trait DescribeApplicationInstanceRequest extends js.Object {
    var ApplicationInstanceId: ApplicationInstanceId
  }

  object DescribeApplicationInstanceRequest {
    @inline
    def apply(
        ApplicationInstanceId: ApplicationInstanceId
    ): DescribeApplicationInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationInstanceId" -> ApplicationInstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeApplicationInstanceRequest]
    }
  }

  @js.native
  trait DescribeApplicationInstanceResponse extends js.Object {
    var ApplicationInstanceId: js.UndefOr[ApplicationInstanceId]
    var ApplicationInstanceIdToReplace: js.UndefOr[ApplicationInstanceId]
    var Arn: js.UndefOr[ApplicationInstanceArn]
    var CreatedTime: js.UndefOr[TimeStamp]
    var DefaultRuntimeContextDevice: js.UndefOr[DefaultRuntimeContextDevice]
    var DefaultRuntimeContextDeviceName: js.UndefOr[DeviceName]
    var Description: js.UndefOr[Description]
    var HealthStatus: js.UndefOr[ApplicationInstanceHealthStatus]
    var LastUpdatedTime: js.UndefOr[TimeStamp]
    var Name: js.UndefOr[ApplicationInstanceName]
    var RuntimeRoleArn: js.UndefOr[RuntimeRoleArn]
    var Status: js.UndefOr[ApplicationInstanceStatus]
    var StatusDescription: js.UndefOr[ApplicationInstanceStatusDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object DescribeApplicationInstanceResponse {
    @inline
    def apply(
        ApplicationInstanceId: js.UndefOr[ApplicationInstanceId] = js.undefined,
        ApplicationInstanceIdToReplace: js.UndefOr[ApplicationInstanceId] = js.undefined,
        Arn: js.UndefOr[ApplicationInstanceArn] = js.undefined,
        CreatedTime: js.UndefOr[TimeStamp] = js.undefined,
        DefaultRuntimeContextDevice: js.UndefOr[DefaultRuntimeContextDevice] = js.undefined,
        DefaultRuntimeContextDeviceName: js.UndefOr[DeviceName] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        HealthStatus: js.UndefOr[ApplicationInstanceHealthStatus] = js.undefined,
        LastUpdatedTime: js.UndefOr[TimeStamp] = js.undefined,
        Name: js.UndefOr[ApplicationInstanceName] = js.undefined,
        RuntimeRoleArn: js.UndefOr[RuntimeRoleArn] = js.undefined,
        Status: js.UndefOr[ApplicationInstanceStatus] = js.undefined,
        StatusDescription: js.UndefOr[ApplicationInstanceStatusDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeApplicationInstanceResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationInstanceId.foreach(__v => __obj.updateDynamic("ApplicationInstanceId")(__v.asInstanceOf[js.Any]))
      ApplicationInstanceIdToReplace.foreach(__v => __obj.updateDynamic("ApplicationInstanceIdToReplace")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DefaultRuntimeContextDevice.foreach(__v => __obj.updateDynamic("DefaultRuntimeContextDevice")(__v.asInstanceOf[js.Any]))
      DefaultRuntimeContextDeviceName.foreach(__v => __obj.updateDynamic("DefaultRuntimeContextDeviceName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HealthStatus.foreach(__v => __obj.updateDynamic("HealthStatus")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RuntimeRoleArn.foreach(__v => __obj.updateDynamic("RuntimeRoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusDescription.foreach(__v => __obj.updateDynamic("StatusDescription")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationInstanceResponse]
    }
  }

  @js.native
  trait DescribeDeviceJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeDeviceJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeDeviceJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDeviceJobRequest]
    }
  }

  @js.native
  trait DescribeDeviceJobResponse extends js.Object {
    var CreatedTime: js.UndefOr[UpdateCreatedTime]
    var DeviceArn: js.UndefOr[DeviceArn]
    var DeviceId: js.UndefOr[DeviceId]
    var DeviceName: js.UndefOr[DeviceName]
    var DeviceType: js.UndefOr[DeviceType]
    var ImageVersion: js.UndefOr[ImageVersion]
    var JobId: js.UndefOr[JobId]
    var Status: js.UndefOr[UpdateProgress]
  }

  object DescribeDeviceJobResponse {
    @inline
    def apply(
        CreatedTime: js.UndefOr[UpdateCreatedTime] = js.undefined,
        DeviceArn: js.UndefOr[DeviceArn] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        DeviceName: js.UndefOr[DeviceName] = js.undefined,
        DeviceType: js.UndefOr[DeviceType] = js.undefined,
        ImageVersion: js.UndefOr[ImageVersion] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        Status: js.UndefOr[UpdateProgress] = js.undefined
    ): DescribeDeviceJobResponse = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DeviceArn.foreach(__v => __obj.updateDynamic("DeviceArn")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      DeviceType.foreach(__v => __obj.updateDynamic("DeviceType")(__v.asInstanceOf[js.Any]))
      ImageVersion.foreach(__v => __obj.updateDynamic("ImageVersion")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeviceJobResponse]
    }
  }

  @js.native
  trait DescribeDeviceRequest extends js.Object {
    var DeviceId: DeviceId
  }

  object DescribeDeviceRequest {
    @inline
    def apply(
        DeviceId: DeviceId
    ): DescribeDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDeviceRequest]
    }
  }

  @js.native
  trait DescribeDeviceResponse extends js.Object {
    var Arn: js.UndefOr[DeviceArn]
    var CreatedTime: js.UndefOr[CreatedTime]
    var CurrentNetworkingStatus: js.UndefOr[NetworkStatus]
    var CurrentSoftware: js.UndefOr[CurrentSoftware]
    var Description: js.UndefOr[Description]
    var DeviceConnectionStatus: js.UndefOr[DeviceConnectionStatus]
    var DeviceId: js.UndefOr[DeviceId]
    var LatestSoftware: js.UndefOr[LatestSoftware]
    var LeaseExpirationTime: js.UndefOr[LeaseExpirationTime]
    var Name: js.UndefOr[DeviceName]
    var NetworkingConfiguration: js.UndefOr[NetworkPayload]
    var ProvisioningStatus: js.UndefOr[DeviceStatus]
    var SerialNumber: js.UndefOr[DeviceSerialNumber]
    var Tags: js.UndefOr[TagMap]
    var Type: js.UndefOr[DeviceType]
  }

  object DescribeDeviceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[DeviceArn] = js.undefined,
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        CurrentNetworkingStatus: js.UndefOr[NetworkStatus] = js.undefined,
        CurrentSoftware: js.UndefOr[CurrentSoftware] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DeviceConnectionStatus: js.UndefOr[DeviceConnectionStatus] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        LatestSoftware: js.UndefOr[LatestSoftware] = js.undefined,
        LeaseExpirationTime: js.UndefOr[LeaseExpirationTime] = js.undefined,
        Name: js.UndefOr[DeviceName] = js.undefined,
        NetworkingConfiguration: js.UndefOr[NetworkPayload] = js.undefined,
        ProvisioningStatus: js.UndefOr[DeviceStatus] = js.undefined,
        SerialNumber: js.UndefOr[DeviceSerialNumber] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Type: js.UndefOr[DeviceType] = js.undefined
    ): DescribeDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      CurrentNetworkingStatus.foreach(__v => __obj.updateDynamic("CurrentNetworkingStatus")(__v.asInstanceOf[js.Any]))
      CurrentSoftware.foreach(__v => __obj.updateDynamic("CurrentSoftware")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DeviceConnectionStatus.foreach(__v => __obj.updateDynamic("DeviceConnectionStatus")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      LatestSoftware.foreach(__v => __obj.updateDynamic("LatestSoftware")(__v.asInstanceOf[js.Any]))
      LeaseExpirationTime.foreach(__v => __obj.updateDynamic("LeaseExpirationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetworkingConfiguration.foreach(__v => __obj.updateDynamic("NetworkingConfiguration")(__v.asInstanceOf[js.Any]))
      ProvisioningStatus.foreach(__v => __obj.updateDynamic("ProvisioningStatus")(__v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.updateDynamic("SerialNumber")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeviceResponse]
    }
  }

  @js.native
  trait DescribeNodeFromTemplateJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribeNodeFromTemplateJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribeNodeFromTemplateJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeNodeFromTemplateJobRequest]
    }
  }

  @js.native
  trait DescribeNodeFromTemplateJobResponse extends js.Object {
    var CreatedTime: CreatedTime
    var JobId: JobId
    var LastUpdatedTime: LastUpdatedTime
    var NodeName: NodeName
    var OutputPackageName: NodePackageName
    var OutputPackageVersion: NodePackageVersion
    var Status: NodeFromTemplateJobStatus
    var StatusMessage: NodeFromTemplateJobStatusMessage
    var TemplateParameters: TemplateParametersMap
    var TemplateType: TemplateType
    var JobTags: js.UndefOr[JobTagsList]
    var NodeDescription: js.UndefOr[Description]
  }

  object DescribeNodeFromTemplateJobResponse {
    @inline
    def apply(
        CreatedTime: CreatedTime,
        JobId: JobId,
        LastUpdatedTime: LastUpdatedTime,
        NodeName: NodeName,
        OutputPackageName: NodePackageName,
        OutputPackageVersion: NodePackageVersion,
        Status: NodeFromTemplateJobStatus,
        StatusMessage: NodeFromTemplateJobStatusMessage,
        TemplateParameters: TemplateParametersMap,
        TemplateType: TemplateType,
        JobTags: js.UndefOr[JobTagsList] = js.undefined,
        NodeDescription: js.UndefOr[Description] = js.undefined
    ): DescribeNodeFromTemplateJobResponse = {
      val __obj = js.Dynamic.literal(
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any],
        "LastUpdatedTime" -> LastUpdatedTime.asInstanceOf[js.Any],
        "NodeName" -> NodeName.asInstanceOf[js.Any],
        "OutputPackageName" -> OutputPackageName.asInstanceOf[js.Any],
        "OutputPackageVersion" -> OutputPackageVersion.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "StatusMessage" -> StatusMessage.asInstanceOf[js.Any],
        "TemplateParameters" -> TemplateParameters.asInstanceOf[js.Any],
        "TemplateType" -> TemplateType.asInstanceOf[js.Any]
      )

      JobTags.foreach(__v => __obj.updateDynamic("JobTags")(__v.asInstanceOf[js.Any]))
      NodeDescription.foreach(__v => __obj.updateDynamic("NodeDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNodeFromTemplateJobResponse]
    }
  }

  @js.native
  trait DescribeNodeRequest extends js.Object {
    var NodeId: NodeId
    var OwnerAccount: js.UndefOr[PackageOwnerAccount]
  }

  object DescribeNodeRequest {
    @inline
    def apply(
        NodeId: NodeId,
        OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined
    ): DescribeNodeRequest = {
      val __obj = js.Dynamic.literal(
        "NodeId" -> NodeId.asInstanceOf[js.Any]
      )

      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNodeRequest]
    }
  }

  @js.native
  trait DescribeNodeResponse extends js.Object {
    var Category: NodeCategory
    var CreatedTime: TimeStamp
    var Description: Description
    var LastUpdatedTime: TimeStamp
    var Name: NodeName
    var NodeId: NodeId
    var NodeInterface: NodeInterface
    var OwnerAccount: PackageOwnerAccount
    var PackageId: NodePackageId
    var PackageName: NodePackageName
    var PackageVersion: NodePackageVersion
    var PatchVersion: NodePackagePatchVersion
    var AssetName: js.UndefOr[NodeAssetName]
    var PackageArn: js.UndefOr[NodePackageArn]
  }

  object DescribeNodeResponse {
    @inline
    def apply(
        Category: NodeCategory,
        CreatedTime: TimeStamp,
        Description: Description,
        LastUpdatedTime: TimeStamp,
        Name: NodeName,
        NodeId: NodeId,
        NodeInterface: NodeInterface,
        OwnerAccount: PackageOwnerAccount,
        PackageId: NodePackageId,
        PackageName: NodePackageName,
        PackageVersion: NodePackageVersion,
        PatchVersion: NodePackagePatchVersion,
        AssetName: js.UndefOr[NodeAssetName] = js.undefined,
        PackageArn: js.UndefOr[NodePackageArn] = js.undefined
    ): DescribeNodeResponse = {
      val __obj = js.Dynamic.literal(
        "Category" -> Category.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "LastUpdatedTime" -> LastUpdatedTime.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "NodeId" -> NodeId.asInstanceOf[js.Any],
        "NodeInterface" -> NodeInterface.asInstanceOf[js.Any],
        "OwnerAccount" -> OwnerAccount.asInstanceOf[js.Any],
        "PackageId" -> PackageId.asInstanceOf[js.Any],
        "PackageName" -> PackageName.asInstanceOf[js.Any],
        "PackageVersion" -> PackageVersion.asInstanceOf[js.Any],
        "PatchVersion" -> PatchVersion.asInstanceOf[js.Any]
      )

      AssetName.foreach(__v => __obj.updateDynamic("AssetName")(__v.asInstanceOf[js.Any]))
      PackageArn.foreach(__v => __obj.updateDynamic("PackageArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNodeResponse]
    }
  }

  @js.native
  trait DescribePackageImportJobRequest extends js.Object {
    var JobId: JobId
  }

  object DescribePackageImportJobRequest {
    @inline
    def apply(
        JobId: JobId
    ): DescribePackageImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePackageImportJobRequest]
    }
  }

  @js.native
  trait DescribePackageImportJobResponse extends js.Object {
    var CreatedTime: CreatedTime
    var InputConfig: PackageImportJobInputConfig
    var JobId: JobId
    var JobType: PackageImportJobType
    var LastUpdatedTime: LastUpdatedTime
    var Output: PackageImportJobOutput
    var OutputConfig: PackageImportJobOutputConfig
    var Status: PackageImportJobStatus
    var StatusMessage: PackageImportJobStatusMessage
    var ClientToken: js.UndefOr[ClientToken]
    var JobTags: js.UndefOr[JobTagsList]
  }

  object DescribePackageImportJobResponse {
    @inline
    def apply(
        CreatedTime: CreatedTime,
        InputConfig: PackageImportJobInputConfig,
        JobId: JobId,
        JobType: PackageImportJobType,
        LastUpdatedTime: LastUpdatedTime,
        Output: PackageImportJobOutput,
        OutputConfig: PackageImportJobOutputConfig,
        Status: PackageImportJobStatus,
        StatusMessage: PackageImportJobStatusMessage,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        JobTags: js.UndefOr[JobTagsList] = js.undefined
    ): DescribePackageImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "InputConfig" -> InputConfig.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any],
        "JobType" -> JobType.asInstanceOf[js.Any],
        "LastUpdatedTime" -> LastUpdatedTime.asInstanceOf[js.Any],
        "Output" -> Output.asInstanceOf[js.Any],
        "OutputConfig" -> OutputConfig.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "StatusMessage" -> StatusMessage.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      JobTags.foreach(__v => __obj.updateDynamic("JobTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackageImportJobResponse]
    }
  }

  @js.native
  trait DescribePackageRequest extends js.Object {
    var PackageId: NodePackageId
  }

  object DescribePackageRequest {
    @inline
    def apply(
        PackageId: NodePackageId
    ): DescribePackageRequest = {
      val __obj = js.Dynamic.literal(
        "PackageId" -> PackageId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePackageRequest]
    }
  }

  @js.native
  trait DescribePackageResponse extends js.Object {
    var Arn: NodePackageArn
    var CreatedTime: TimeStamp
    var PackageId: NodePackageId
    var PackageName: NodePackageName
    var StorageLocation: StorageLocation
    var Tags: TagMap
    var ReadAccessPrincipalArns: js.UndefOr[PrincipalArnsList]
    var WriteAccessPrincipalArns: js.UndefOr[PrincipalArnsList]
  }

  object DescribePackageResponse {
    @inline
    def apply(
        Arn: NodePackageArn,
        CreatedTime: TimeStamp,
        PackageId: NodePackageId,
        PackageName: NodePackageName,
        StorageLocation: StorageLocation,
        Tags: TagMap,
        ReadAccessPrincipalArns: js.UndefOr[PrincipalArnsList] = js.undefined,
        WriteAccessPrincipalArns: js.UndefOr[PrincipalArnsList] = js.undefined
    ): DescribePackageResponse = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "PackageId" -> PackageId.asInstanceOf[js.Any],
        "PackageName" -> PackageName.asInstanceOf[js.Any],
        "StorageLocation" -> StorageLocation.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      ReadAccessPrincipalArns.foreach(__v => __obj.updateDynamic("ReadAccessPrincipalArns")(__v.asInstanceOf[js.Any]))
      WriteAccessPrincipalArns.foreach(__v => __obj.updateDynamic("WriteAccessPrincipalArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackageResponse]
    }
  }

  @js.native
  trait DescribePackageVersionRequest extends js.Object {
    var PackageId: NodePackageId
    var PackageVersion: NodePackageVersion
    var OwnerAccount: js.UndefOr[PackageOwnerAccount]
    var PatchVersion: js.UndefOr[NodePackagePatchVersion]
  }

  object DescribePackageVersionRequest {
    @inline
    def apply(
        PackageId: NodePackageId,
        PackageVersion: NodePackageVersion,
        OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined,
        PatchVersion: js.UndefOr[NodePackagePatchVersion] = js.undefined
    ): DescribePackageVersionRequest = {
      val __obj = js.Dynamic.literal(
        "PackageId" -> PackageId.asInstanceOf[js.Any],
        "PackageVersion" -> PackageVersion.asInstanceOf[js.Any]
      )

      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      PatchVersion.foreach(__v => __obj.updateDynamic("PatchVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackageVersionRequest]
    }
  }

  @js.native
  trait DescribePackageVersionResponse extends js.Object {
    var IsLatestPatch: Boolean
    var PackageId: NodePackageId
    var PackageName: NodePackageName
    var PackageVersion: NodePackageVersion
    var PatchVersion: NodePackagePatchVersion
    var Status: PackageVersionStatus
    var OwnerAccount: js.UndefOr[PackageOwnerAccount]
    var PackageArn: js.UndefOr[NodePackageArn]
    var RegisteredTime: js.UndefOr[TimeStamp]
    var StatusDescription: js.UndefOr[PackageVersionStatusDescription]
  }

  object DescribePackageVersionResponse {
    @inline
    def apply(
        IsLatestPatch: Boolean,
        PackageId: NodePackageId,
        PackageName: NodePackageName,
        PackageVersion: NodePackageVersion,
        PatchVersion: NodePackagePatchVersion,
        Status: PackageVersionStatus,
        OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined,
        PackageArn: js.UndefOr[NodePackageArn] = js.undefined,
        RegisteredTime: js.UndefOr[TimeStamp] = js.undefined,
        StatusDescription: js.UndefOr[PackageVersionStatusDescription] = js.undefined
    ): DescribePackageVersionResponse = {
      val __obj = js.Dynamic.literal(
        "IsLatestPatch" -> IsLatestPatch.asInstanceOf[js.Any],
        "PackageId" -> PackageId.asInstanceOf[js.Any],
        "PackageName" -> PackageName.asInstanceOf[js.Any],
        "PackageVersion" -> PackageVersion.asInstanceOf[js.Any],
        "PatchVersion" -> PatchVersion.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      PackageArn.foreach(__v => __obj.updateDynamic("PackageArn")(__v.asInstanceOf[js.Any]))
      RegisteredTime.foreach(__v => __obj.updateDynamic("RegisteredTime")(__v.asInstanceOf[js.Any]))
      StatusDescription.foreach(__v => __obj.updateDynamic("StatusDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePackageVersionResponse]
    }
  }

  /** A device.
    */
  @js.native
  trait Device extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var DeviceId: js.UndefOr[DeviceId]
    var LastUpdatedTime: js.UndefOr[LastUpdatedTime]
    var LeaseExpirationTime: js.UndefOr[LeaseExpirationTime]
    var Name: js.UndefOr[DeviceName]
    var ProvisioningStatus: js.UndefOr[DeviceStatus]
  }

  object Device {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        LastUpdatedTime: js.UndefOr[LastUpdatedTime] = js.undefined,
        LeaseExpirationTime: js.UndefOr[LeaseExpirationTime] = js.undefined,
        Name: js.UndefOr[DeviceName] = js.undefined,
        ProvisioningStatus: js.UndefOr[DeviceStatus] = js.undefined
    ): Device = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      LeaseExpirationTime.foreach(__v => __obj.updateDynamic("LeaseExpirationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProvisioningStatus.foreach(__v => __obj.updateDynamic("ProvisioningStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  /** A job that runs on a device.
    */
  @js.native
  trait DeviceJob extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var DeviceId: js.UndefOr[DeviceId]
    var DeviceName: js.UndefOr[DeviceName]
    var JobId: js.UndefOr[JobId]
  }

  object DeviceJob {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        DeviceName: js.UndefOr[DeviceName] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined
    ): DeviceJob = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceJob]
    }
  }

  /** A job's configuration.
    */
  @js.native
  trait DeviceJobConfig extends js.Object {
    var OTAJobConfig: js.UndefOr[OTAJobConfig]
  }

  object DeviceJobConfig {
    @inline
    def apply(
        OTAJobConfig: js.UndefOr[OTAJobConfig] = js.undefined
    ): DeviceJobConfig = {
      val __obj = js.Dynamic.literal()
      OTAJobConfig.foreach(__v => __obj.updateDynamic("OTAJobConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceJobConfig]
    }
  }

  /** A device's network configuration.
    */
  @js.native
  trait EthernetPayload extends js.Object {
    var ConnectionType: ConnectionType
    var StaticIpConnectionInfo: js.UndefOr[StaticIpConnectionInfo]
  }

  object EthernetPayload {
    @inline
    def apply(
        ConnectionType: ConnectionType,
        StaticIpConnectionInfo: js.UndefOr[StaticIpConnectionInfo] = js.undefined
    ): EthernetPayload = {
      val __obj = js.Dynamic.literal(
        "ConnectionType" -> ConnectionType.asInstanceOf[js.Any]
      )

      StaticIpConnectionInfo.foreach(__v => __obj.updateDynamic("StaticIpConnectionInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EthernetPayload]
    }
  }

  /** A device's Ethernet status.
    */
  @js.native
  trait EthernetStatus extends js.Object {
    var ConnectionStatus: js.UndefOr[NetworkConnectionStatus]
    var HwAddress: js.UndefOr[HwAddress]
    var IpAddress: js.UndefOr[IpAddress]
  }

  object EthernetStatus {
    @inline
    def apply(
        ConnectionStatus: js.UndefOr[NetworkConnectionStatus] = js.undefined,
        HwAddress: js.UndefOr[HwAddress] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined
    ): EthernetStatus = {
      val __obj = js.Dynamic.literal()
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      HwAddress.foreach(__v => __obj.updateDynamic("HwAddress")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EthernetStatus]
    }
  }

  /** A job for a device.
    */
  @js.native
  trait Job extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
    var JobId: js.UndefOr[JobId]
  }

  object Job {
    @inline
    def apply(
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined
    ): Job = {
      val __obj = js.Dynamic.literal()
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /** Tags for a job.
    */
  @js.native
  trait JobResourceTags extends js.Object {
    var ResourceType: JobResourceType
    var Tags: TagMap
  }

  object JobResourceTags {
    @inline
    def apply(
        ResourceType: JobResourceType,
        Tags: TagMap
    ): JobResourceTags = {
      val __obj = js.Dynamic.literal(
        "ResourceType" -> ResourceType.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JobResourceTags]
    }
  }

  @js.native
  trait ListApplicationInstanceDependenciesRequest extends js.Object {
    var ApplicationInstanceId: ApplicationInstanceId
    var MaxResults: js.UndefOr[MaxSize25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationInstanceDependenciesRequest {
    @inline
    def apply(
        ApplicationInstanceId: ApplicationInstanceId,
        MaxResults: js.UndefOr[MaxSize25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationInstanceDependenciesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationInstanceId" -> ApplicationInstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationInstanceDependenciesRequest]
    }
  }

  @js.native
  trait ListApplicationInstanceDependenciesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PackageObjects: js.UndefOr[PackageObjects]
  }

  object ListApplicationInstanceDependenciesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PackageObjects: js.UndefOr[PackageObjects] = js.undefined
    ): ListApplicationInstanceDependenciesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PackageObjects.foreach(__v => __obj.updateDynamic("PackageObjects")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationInstanceDependenciesResponse]
    }
  }

  @js.native
  trait ListApplicationInstanceNodeInstancesRequest extends js.Object {
    var ApplicationInstanceId: ApplicationInstanceId
    var MaxResults: js.UndefOr[MaxSize25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationInstanceNodeInstancesRequest {
    @inline
    def apply(
        ApplicationInstanceId: ApplicationInstanceId,
        MaxResults: js.UndefOr[MaxSize25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationInstanceNodeInstancesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationInstanceId" -> ApplicationInstanceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationInstanceNodeInstancesRequest]
    }
  }

  @js.native
  trait ListApplicationInstanceNodeInstancesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var NodeInstances: js.UndefOr[NodeInstances]
  }

  object ListApplicationInstanceNodeInstancesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        NodeInstances: js.UndefOr[NodeInstances] = js.undefined
    ): ListApplicationInstanceNodeInstancesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      NodeInstances.foreach(__v => __obj.updateDynamic("NodeInstances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationInstanceNodeInstancesResponse]
    }
  }

  @js.native
  trait ListApplicationInstancesRequest extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
    var MaxResults: js.UndefOr[MaxSize25]
    var NextToken: js.UndefOr[NextToken]
    var StatusFilter: js.UndefOr[StatusFilter]
  }

  object ListApplicationInstancesRequest {
    @inline
    def apply(
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        MaxResults: js.UndefOr[MaxSize25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StatusFilter: js.UndefOr[StatusFilter] = js.undefined
    ): ListApplicationInstancesRequest = {
      val __obj = js.Dynamic.literal()
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusFilter.foreach(__v => __obj.updateDynamic("StatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationInstancesRequest]
    }
  }

  @js.native
  trait ListApplicationInstancesResponse extends js.Object {
    var ApplicationInstances: js.UndefOr[ApplicationInstances]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationInstancesResponse {
    @inline
    def apply(
        ApplicationInstances: js.UndefOr[ApplicationInstances] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationInstancesResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationInstances.foreach(__v => __obj.updateDynamic("ApplicationInstances")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationInstancesResponse]
    }
  }

  @js.native
  trait ListDevicesJobsRequest extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
    var MaxResults: js.UndefOr[MaxSize25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevicesJobsRequest {
    @inline
    def apply(
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        MaxResults: js.UndefOr[MaxSize25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesJobsRequest = {
      val __obj = js.Dynamic.literal()
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesJobsRequest]
    }
  }

  @js.native
  trait ListDevicesJobsResponse extends js.Object {
    var DeviceJobs: js.UndefOr[DeviceJobList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevicesJobsResponse {
    @inline
    def apply(
        DeviceJobs: js.UndefOr[DeviceJobList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesJobsResponse = {
      val __obj = js.Dynamic.literal()
      DeviceJobs.foreach(__v => __obj.updateDynamic("DeviceJobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesJobsResponse]
    }
  }

  @js.native
  trait ListDevicesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxSize25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevicesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxSize25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesRequest]
    }
  }

  @js.native
  trait ListDevicesResponse extends js.Object {
    var Devices: DeviceList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDevicesResponse {
    @inline
    def apply(
        Devices: DeviceList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDevicesResponse = {
      val __obj = js.Dynamic.literal(
        "Devices" -> Devices.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesResponse]
    }
  }

  @js.native
  trait ListNodeFromTemplateJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxSize25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNodeFromTemplateJobsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxSize25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListNodeFromTemplateJobsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodeFromTemplateJobsRequest]
    }
  }

  @js.native
  trait ListNodeFromTemplateJobsResponse extends js.Object {
    var NodeFromTemplateJobs: NodeFromTemplateJobList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNodeFromTemplateJobsResponse {
    @inline
    def apply(
        NodeFromTemplateJobs: NodeFromTemplateJobList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListNodeFromTemplateJobsResponse = {
      val __obj = js.Dynamic.literal(
        "NodeFromTemplateJobs" -> NodeFromTemplateJobs.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodeFromTemplateJobsResponse]
    }
  }

  @js.native
  trait ListNodesRequest extends js.Object {
    var Category: js.UndefOr[NodeCategory]
    var MaxResults: js.UndefOr[MaxSize25]
    var NextToken: js.UndefOr[Token]
    var OwnerAccount: js.UndefOr[PackageOwnerAccount]
    var PackageName: js.UndefOr[NodePackageName]
    var PackageVersion: js.UndefOr[NodePackageVersion]
    var PatchVersion: js.UndefOr[NodePackagePatchVersion]
  }

  object ListNodesRequest {
    @inline
    def apply(
        Category: js.UndefOr[NodeCategory] = js.undefined,
        MaxResults: js.UndefOr[MaxSize25] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined,
        PackageName: js.UndefOr[NodePackageName] = js.undefined,
        PackageVersion: js.UndefOr[NodePackageVersion] = js.undefined,
        PatchVersion: js.UndefOr[NodePackagePatchVersion] = js.undefined
    ): ListNodesRequest = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      PackageName.foreach(__v => __obj.updateDynamic("PackageName")(__v.asInstanceOf[js.Any]))
      PackageVersion.foreach(__v => __obj.updateDynamic("PackageVersion")(__v.asInstanceOf[js.Any]))
      PatchVersion.foreach(__v => __obj.updateDynamic("PatchVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodesRequest]
    }
  }

  @js.native
  trait ListNodesResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Nodes: js.UndefOr[NodesList]
  }

  object ListNodesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Nodes: js.UndefOr[NodesList] = js.undefined
    ): ListNodesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Nodes.foreach(__v => __obj.updateDynamic("Nodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNodesResponse]
    }
  }

  @js.native
  trait ListPackageImportJobsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxSize25]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPackageImportJobsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxSize25] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPackageImportJobsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackageImportJobsRequest]
    }
  }

  @js.native
  trait ListPackageImportJobsResponse extends js.Object {
    var PackageImportJobs: PackageImportJobList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPackageImportJobsResponse {
    @inline
    def apply(
        PackageImportJobs: PackageImportJobList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPackageImportJobsResponse = {
      val __obj = js.Dynamic.literal(
        "PackageImportJobs" -> PackageImportJobs.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackageImportJobsResponse]
    }
  }

  @js.native
  trait ListPackagesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxSize25]
    var NextToken: js.UndefOr[Token]
  }

  object ListPackagesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxSize25] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPackagesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagesRequest]
    }
  }

  @js.native
  trait ListPackagesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Packages: js.UndefOr[PackageList]
  }

  object ListPackagesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Packages: js.UndefOr[PackageList] = js.undefined
    ): ListPackagesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Packages.foreach(__v => __obj.updateDynamic("Packages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPackagesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Parameter overrides for an application instance. This is a JSON document that has a single key (<code>PayloadData</code>) where the value is an escaped string representation of the overrides document.
    */
  @js.native
  trait ManifestOverridesPayload extends js.Object {
    var PayloadData: js.UndefOr[ManifestOverridesPayloadData]
  }

  object ManifestOverridesPayload {
    @inline
    def apply(
        PayloadData: js.UndefOr[ManifestOverridesPayloadData] = js.undefined
    ): ManifestOverridesPayload = {
      val __obj = js.Dynamic.literal()
      PayloadData.foreach(__v => __obj.updateDynamic("PayloadData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManifestOverridesPayload]
    }
  }

  /** A application verion's manifest file. This is a JSON document that has a single key (<code>PayloadData</code>) where the value is an escaped string representation of the application manifest (<code>graph.json</code>). This file is located in the <code>graphs</code> folder in your application source.
    */
  @js.native
  trait ManifestPayload extends js.Object {
    var PayloadData: js.UndefOr[ManifestPayloadData]
  }

  object ManifestPayload {
    @inline
    def apply(
        PayloadData: js.UndefOr[ManifestPayloadData] = js.undefined
    ): ManifestPayload = {
      val __obj = js.Dynamic.literal()
      PayloadData.foreach(__v => __obj.updateDynamic("PayloadData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManifestPayload]
    }
  }

  /** The network configuration for a device.
    */
  @js.native
  trait NetworkPayload extends js.Object {
    var Ethernet0: js.UndefOr[EthernetPayload]
    var Ethernet1: js.UndefOr[EthernetPayload]
  }

  object NetworkPayload {
    @inline
    def apply(
        Ethernet0: js.UndefOr[EthernetPayload] = js.undefined,
        Ethernet1: js.UndefOr[EthernetPayload] = js.undefined
    ): NetworkPayload = {
      val __obj = js.Dynamic.literal()
      Ethernet0.foreach(__v => __obj.updateDynamic("Ethernet0")(__v.asInstanceOf[js.Any]))
      Ethernet1.foreach(__v => __obj.updateDynamic("Ethernet1")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkPayload]
    }
  }

  /** The network status of a device.
    */
  @js.native
  trait NetworkStatus extends js.Object {
    var Ethernet0Status: js.UndefOr[EthernetStatus]
    var Ethernet1Status: js.UndefOr[EthernetStatus]
  }

  object NetworkStatus {
    @inline
    def apply(
        Ethernet0Status: js.UndefOr[EthernetStatus] = js.undefined,
        Ethernet1Status: js.UndefOr[EthernetStatus] = js.undefined
    ): NetworkStatus = {
      val __obj = js.Dynamic.literal()
      Ethernet0Status.foreach(__v => __obj.updateDynamic("Ethernet0Status")(__v.asInstanceOf[js.Any]))
      Ethernet1Status.foreach(__v => __obj.updateDynamic("Ethernet1Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkStatus]
    }
  }

  /** An application node that represents a camera stream, a model, code, or output.
    */
  @js.native
  trait Node extends js.Object {
    var Category: NodeCategory
    var CreatedTime: TimeStamp
    var Name: NodeName
    var NodeId: NodeId
    var PackageId: NodePackageId
    var PackageName: NodePackageName
    var PackageVersion: NodePackageVersion
    var PatchVersion: NodePackagePatchVersion
    var Description: js.UndefOr[Description]
    var OwnerAccount: js.UndefOr[PackageOwnerAccount]
    var PackageArn: js.UndefOr[NodePackageArn]
  }

  object Node {
    @inline
    def apply(
        Category: NodeCategory,
        CreatedTime: TimeStamp,
        Name: NodeName,
        NodeId: NodeId,
        PackageId: NodePackageId,
        PackageName: NodePackageName,
        PackageVersion: NodePackageVersion,
        PatchVersion: NodePackagePatchVersion,
        Description: js.UndefOr[Description] = js.undefined,
        OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined,
        PackageArn: js.UndefOr[NodePackageArn] = js.undefined
    ): Node = {
      val __obj = js.Dynamic.literal(
        "Category" -> Category.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "NodeId" -> NodeId.asInstanceOf[js.Any],
        "PackageId" -> PackageId.asInstanceOf[js.Any],
        "PackageName" -> PackageName.asInstanceOf[js.Any],
        "PackageVersion" -> PackageVersion.asInstanceOf[js.Any],
        "PatchVersion" -> PatchVersion.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      PackageArn.foreach(__v => __obj.updateDynamic("PackageArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Node]
    }
  }

  /** A job to create a camera stream node.
    */
  @js.native
  trait NodeFromTemplateJob extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var JobId: js.UndefOr[JobId]
    var NodeName: js.UndefOr[NodeName]
    var Status: js.UndefOr[NodeFromTemplateJobStatus]
    var StatusMessage: js.UndefOr[NodeFromTemplateJobStatusMessage]
    var TemplateType: js.UndefOr[TemplateType]
  }

  object NodeFromTemplateJob {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        NodeName: js.UndefOr[NodeName] = js.undefined,
        Status: js.UndefOr[NodeFromTemplateJobStatus] = js.undefined,
        StatusMessage: js.UndefOr[NodeFromTemplateJobStatusMessage] = js.undefined,
        TemplateType: js.UndefOr[TemplateType] = js.undefined
    ): NodeFromTemplateJob = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      NodeName.foreach(__v => __obj.updateDynamic("NodeName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      TemplateType.foreach(__v => __obj.updateDynamic("TemplateType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeFromTemplateJob]
    }
  }

  /** A node input port.
    */
  @js.native
  trait NodeInputPort extends js.Object {
    var DefaultValue: js.UndefOr[PortDefaultValue]
    var Description: js.UndefOr[Description]
    var MaxConnections: js.UndefOr[MaxConnections]
    var Name: js.UndefOr[PortName]
    var Type: js.UndefOr[PortType]
  }

  object NodeInputPort {
    @inline
    def apply(
        DefaultValue: js.UndefOr[PortDefaultValue] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        MaxConnections: js.UndefOr[MaxConnections] = js.undefined,
        Name: js.UndefOr[PortName] = js.undefined,
        Type: js.UndefOr[PortType] = js.undefined
    ): NodeInputPort = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MaxConnections.foreach(__v => __obj.updateDynamic("MaxConnections")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeInputPort]
    }
  }

  /** A node instance.
    */
  @js.native
  trait NodeInstance extends js.Object {
    var CurrentStatus: NodeInstanceStatus
    var NodeInstanceId: NodeInstanceId
    var NodeId: js.UndefOr[NodeId]
    var NodeName: js.UndefOr[NodeName]
    var PackageName: js.UndefOr[NodePackageName]
    var PackagePatchVersion: js.UndefOr[NodePackagePatchVersion]
    var PackageVersion: js.UndefOr[NodePackageVersion]
  }

  object NodeInstance {
    @inline
    def apply(
        CurrentStatus: NodeInstanceStatus,
        NodeInstanceId: NodeInstanceId,
        NodeId: js.UndefOr[NodeId] = js.undefined,
        NodeName: js.UndefOr[NodeName] = js.undefined,
        PackageName: js.UndefOr[NodePackageName] = js.undefined,
        PackagePatchVersion: js.UndefOr[NodePackagePatchVersion] = js.undefined,
        PackageVersion: js.UndefOr[NodePackageVersion] = js.undefined
    ): NodeInstance = {
      val __obj = js.Dynamic.literal(
        "CurrentStatus" -> CurrentStatus.asInstanceOf[js.Any],
        "NodeInstanceId" -> NodeInstanceId.asInstanceOf[js.Any]
      )

      NodeId.foreach(__v => __obj.updateDynamic("NodeId")(__v.asInstanceOf[js.Any]))
      NodeName.foreach(__v => __obj.updateDynamic("NodeName")(__v.asInstanceOf[js.Any]))
      PackageName.foreach(__v => __obj.updateDynamic("PackageName")(__v.asInstanceOf[js.Any]))
      PackagePatchVersion.foreach(__v => __obj.updateDynamic("PackagePatchVersion")(__v.asInstanceOf[js.Any]))
      PackageVersion.foreach(__v => __obj.updateDynamic("PackageVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeInstance]
    }
  }

  /** A node interface.
    */
  @js.native
  trait NodeInterface extends js.Object {
    var Inputs: InputPortList
    var Outputs: OutputPortList
  }

  object NodeInterface {
    @inline
    def apply(
        Inputs: InputPortList,
        Outputs: OutputPortList
    ): NodeInterface = {
      val __obj = js.Dynamic.literal(
        "Inputs" -> Inputs.asInstanceOf[js.Any],
        "Outputs" -> Outputs.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NodeInterface]
    }
  }

  /** A node output port.
    */
  @js.native
  trait NodeOutputPort extends js.Object {
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[PortName]
    var Type: js.UndefOr[PortType]
  }

  object NodeOutputPort {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[PortName] = js.undefined,
        Type: js.UndefOr[PortType] = js.undefined
    ): NodeOutputPort = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeOutputPort]
    }
  }

  /** An over-the-air update (OTA) job configuration.
    */
  @js.native
  trait OTAJobConfig extends js.Object {
    var ImageVersion: ImageVersion
  }

  object OTAJobConfig {
    @inline
    def apply(
        ImageVersion: ImageVersion
    ): OTAJobConfig = {
      val __obj = js.Dynamic.literal(
        "ImageVersion" -> ImageVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OTAJobConfig]
    }
  }

  /** The location of an output object in Amazon S3.
    */
  @js.native
  trait OutPutS3Location extends js.Object {
    var BucketName: BucketName
    var ObjectKey: ObjectKey
  }

  object OutPutS3Location {
    @inline
    def apply(
        BucketName: BucketName,
        ObjectKey: ObjectKey
    ): OutPutS3Location = {
      val __obj = js.Dynamic.literal(
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "ObjectKey" -> ObjectKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutPutS3Location]
    }
  }

  /** A job to import a package version.
    */
  @js.native
  trait PackageImportJob extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var JobId: js.UndefOr[JobId]
    var JobType: js.UndefOr[PackageImportJobType]
    var LastUpdatedTime: js.UndefOr[LastUpdatedTime]
    var Status: js.UndefOr[PackageImportJobStatus]
    var StatusMessage: js.UndefOr[PackageImportJobStatusMessage]
  }

  object PackageImportJob {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        JobId: js.UndefOr[JobId] = js.undefined,
        JobType: js.UndefOr[PackageImportJobType] = js.undefined,
        LastUpdatedTime: js.UndefOr[LastUpdatedTime] = js.undefined,
        Status: js.UndefOr[PackageImportJobStatus] = js.undefined,
        StatusMessage: js.UndefOr[PackageImportJobStatusMessage] = js.undefined
    ): PackageImportJob = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      JobType.foreach(__v => __obj.updateDynamic("JobType")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageImportJob]
    }
  }

  /** A configuration for a package import job.
    */
  @js.native
  trait PackageImportJobInputConfig extends js.Object {
    var PackageVersionInputConfig: js.UndefOr[PackageVersionInputConfig]
  }

  object PackageImportJobInputConfig {
    @inline
    def apply(
        PackageVersionInputConfig: js.UndefOr[PackageVersionInputConfig] = js.undefined
    ): PackageImportJobInputConfig = {
      val __obj = js.Dynamic.literal()
      PackageVersionInputConfig.foreach(__v => __obj.updateDynamic("PackageVersionInputConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageImportJobInputConfig]
    }
  }

  /** Results of a package import job.
    */
  @js.native
  trait PackageImportJobOutput extends js.Object {
    var OutputS3Location: OutPutS3Location
    var PackageId: NodePackageId
    var PackageVersion: NodePackageVersion
    var PatchVersion: NodePackagePatchVersion
  }

  object PackageImportJobOutput {
    @inline
    def apply(
        OutputS3Location: OutPutS3Location,
        PackageId: NodePackageId,
        PackageVersion: NodePackageVersion,
        PatchVersion: NodePackagePatchVersion
    ): PackageImportJobOutput = {
      val __obj = js.Dynamic.literal(
        "OutputS3Location" -> OutputS3Location.asInstanceOf[js.Any],
        "PackageId" -> PackageId.asInstanceOf[js.Any],
        "PackageVersion" -> PackageVersion.asInstanceOf[js.Any],
        "PatchVersion" -> PatchVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PackageImportJobOutput]
    }
  }

  /** An output configuration for a package import job.
    */
  @js.native
  trait PackageImportJobOutputConfig extends js.Object {
    var PackageVersionOutputConfig: js.UndefOr[PackageVersionOutputConfig]
  }

  object PackageImportJobOutputConfig {
    @inline
    def apply(
        PackageVersionOutputConfig: js.UndefOr[PackageVersionOutputConfig] = js.undefined
    ): PackageImportJobOutputConfig = {
      val __obj = js.Dynamic.literal()
      PackageVersionOutputConfig.foreach(__v => __obj.updateDynamic("PackageVersionOutputConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageImportJobOutputConfig]
    }
  }

  /** A package summary.
    */
  @js.native
  trait PackageListItem extends js.Object {
    var Arn: js.UndefOr[NodePackageArn]
    var CreatedTime: js.UndefOr[TimeStamp]
    var PackageId: js.UndefOr[NodePackageId]
    var PackageName: js.UndefOr[NodePackageName]
    var Tags: js.UndefOr[TagMap]
  }

  object PackageListItem {
    @inline
    def apply(
        Arn: js.UndefOr[NodePackageArn] = js.undefined,
        CreatedTime: js.UndefOr[TimeStamp] = js.undefined,
        PackageId: js.UndefOr[NodePackageId] = js.undefined,
        PackageName: js.UndefOr[NodePackageName] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): PackageListItem = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      PackageId.foreach(__v => __obj.updateDynamic("PackageId")(__v.asInstanceOf[js.Any]))
      PackageName.foreach(__v => __obj.updateDynamic("PackageName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageListItem]
    }
  }

  /** A package object.
    */
  @js.native
  trait PackageObject extends js.Object {
    var Name: NodePackageName
    var PackageVersion: NodePackageVersion
    var PatchVersion: NodePackagePatchVersion
  }

  object PackageObject {
    @inline
    def apply(
        Name: NodePackageName,
        PackageVersion: NodePackageVersion,
        PatchVersion: NodePackagePatchVersion
    ): PackageObject = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "PackageVersion" -> PackageVersion.asInstanceOf[js.Any],
        "PatchVersion" -> PatchVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PackageObject]
    }
  }

  /** A package version input configuration.
    */
  @js.native
  trait PackageVersionInputConfig extends js.Object {
    var S3Location: S3Location
  }

  object PackageVersionInputConfig {
    @inline
    def apply(
        S3Location: S3Location
    ): PackageVersionInputConfig = {
      val __obj = js.Dynamic.literal(
        "S3Location" -> S3Location.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PackageVersionInputConfig]
    }
  }

  /** A package version output configuration.
    */
  @js.native
  trait PackageVersionOutputConfig extends js.Object {
    var PackageName: NodePackageName
    var PackageVersion: NodePackageVersion
    var MarkLatest: js.UndefOr[MarkLatestPatch]
  }

  object PackageVersionOutputConfig {
    @inline
    def apply(
        PackageName: NodePackageName,
        PackageVersion: NodePackageVersion,
        MarkLatest: js.UndefOr[MarkLatestPatch] = js.undefined
    ): PackageVersionOutputConfig = {
      val __obj = js.Dynamic.literal(
        "PackageName" -> PackageName.asInstanceOf[js.Any],
        "PackageVersion" -> PackageVersion.asInstanceOf[js.Any]
      )

      MarkLatest.foreach(__v => __obj.updateDynamic("MarkLatest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PackageVersionOutputConfig]
    }
  }

  @js.native
  trait ProvisionDeviceRequest extends js.Object {
    var Name: DeviceName
    var Description: js.UndefOr[Description]
    var NetworkingConfiguration: js.UndefOr[NetworkPayload]
    var Tags: js.UndefOr[TagMap]
  }

  object ProvisionDeviceRequest {
    @inline
    def apply(
        Name: DeviceName,
        Description: js.UndefOr[Description] = js.undefined,
        NetworkingConfiguration: js.UndefOr[NetworkPayload] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ProvisionDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NetworkingConfiguration.foreach(__v => __obj.updateDynamic("NetworkingConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionDeviceRequest]
    }
  }

  @js.native
  trait ProvisionDeviceResponse extends js.Object {
    var Arn: DeviceArn
    var Status: DeviceStatus
    var Certificates: js.UndefOr[Certificates]
    var DeviceId: js.UndefOr[DeviceId]
    var IotThingName: js.UndefOr[IotThingName]
  }

  object ProvisionDeviceResponse {
    @inline
    def apply(
        Arn: DeviceArn,
        Status: DeviceStatus,
        Certificates: js.UndefOr[Certificates] = js.undefined,
        DeviceId: js.UndefOr[DeviceId] = js.undefined,
        IotThingName: js.UndefOr[IotThingName] = js.undefined
    ): ProvisionDeviceResponse = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      Certificates.foreach(__v => __obj.updateDynamic("Certificates")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      IotThingName.foreach(__v => __obj.updateDynamic("IotThingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionDeviceResponse]
    }
  }

  @js.native
  trait RegisterPackageVersionRequest extends js.Object {
    var PackageId: NodePackageId
    var PackageVersion: NodePackageVersion
    var PatchVersion: NodePackagePatchVersion
    var MarkLatest: js.UndefOr[MarkLatestPatch]
    var OwnerAccount: js.UndefOr[PackageOwnerAccount]
  }

  object RegisterPackageVersionRequest {
    @inline
    def apply(
        PackageId: NodePackageId,
        PackageVersion: NodePackageVersion,
        PatchVersion: NodePackagePatchVersion,
        MarkLatest: js.UndefOr[MarkLatestPatch] = js.undefined,
        OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined
    ): RegisterPackageVersionRequest = {
      val __obj = js.Dynamic.literal(
        "PackageId" -> PackageId.asInstanceOf[js.Any],
        "PackageVersion" -> PackageVersion.asInstanceOf[js.Any],
        "PatchVersion" -> PatchVersion.asInstanceOf[js.Any]
      )

      MarkLatest.foreach(__v => __obj.updateDynamic("MarkLatest")(__v.asInstanceOf[js.Any]))
      OwnerAccount.foreach(__v => __obj.updateDynamic("OwnerAccount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterPackageVersionRequest]
    }
  }

  @js.native
  trait RegisterPackageVersionResponse extends js.Object

  object RegisterPackageVersionResponse {
    @inline
    def apply(): RegisterPackageVersionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterPackageVersionResponse]
    }
  }

  @js.native
  trait RemoveApplicationInstanceRequest extends js.Object {
    var ApplicationInstanceId: ApplicationInstanceId
  }

  object RemoveApplicationInstanceRequest {
    @inline
    def apply(
        ApplicationInstanceId: ApplicationInstanceId
    ): RemoveApplicationInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationInstanceId" -> ApplicationInstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveApplicationInstanceRequest]
    }
  }

  @js.native
  trait RemoveApplicationInstanceResponse extends js.Object

  object RemoveApplicationInstanceResponse {
    @inline
    def apply(): RemoveApplicationInstanceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveApplicationInstanceResponse]
    }
  }

  /** A location in Amazon S3.
    */
  @js.native
  trait S3Location extends js.Object {
    var BucketName: BucketName
    var ObjectKey: ObjectKey
    var Region: js.UndefOr[Region]
  }

  object S3Location {
    @inline
    def apply(
        BucketName: BucketName,
        ObjectKey: ObjectKey,
        Region: js.UndefOr[Region] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal(
        "BucketName" -> BucketName.asInstanceOf[js.Any],
        "ObjectKey" -> ObjectKey.asInstanceOf[js.Any]
      )

      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /** A static IP configuration.
    */
  @js.native
  trait StaticIpConnectionInfo extends js.Object {
    var DefaultGateway: DefaultGateway
    var Dns: DnsList
    var IpAddress: IpAddress
    var Mask: Mask
  }

  object StaticIpConnectionInfo {
    @inline
    def apply(
        DefaultGateway: DefaultGateway,
        Dns: DnsList,
        IpAddress: IpAddress,
        Mask: Mask
    ): StaticIpConnectionInfo = {
      val __obj = js.Dynamic.literal(
        "DefaultGateway" -> DefaultGateway.asInstanceOf[js.Any],
        "Dns" -> Dns.asInstanceOf[js.Any],
        "IpAddress" -> IpAddress.asInstanceOf[js.Any],
        "Mask" -> Mask.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StaticIpConnectionInfo]
    }
  }

  /** A storage location.
    */
  @js.native
  trait StorageLocation extends js.Object {
    var BinaryPrefixLocation: Object
    var Bucket: Bucket
    var GeneratedPrefixLocation: Object
    var ManifestPrefixLocation: Object
    var RepoPrefixLocation: Object
  }

  object StorageLocation {
    @inline
    def apply(
        BinaryPrefixLocation: Object,
        Bucket: Bucket,
        GeneratedPrefixLocation: Object,
        ManifestPrefixLocation: Object,
        RepoPrefixLocation: Object
    ): StorageLocation = {
      val __obj = js.Dynamic.literal(
        "BinaryPrefixLocation" -> BinaryPrefixLocation.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "GeneratedPrefixLocation" -> GeneratedPrefixLocation.asInstanceOf[js.Any],
        "ManifestPrefixLocation" -> ManifestPrefixLocation.asInstanceOf[js.Any],
        "RepoPrefixLocation" -> RepoPrefixLocation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StorageLocation]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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

  @js.native
  trait UpdateDeviceMetadataRequest extends js.Object {
    var DeviceId: DeviceId
    var Description: js.UndefOr[Description]
  }

  object UpdateDeviceMetadataRequest {
    @inline
    def apply(
        DeviceId: DeviceId,
        Description: js.UndefOr[Description] = js.undefined
    ): UpdateDeviceMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceMetadataRequest]
    }
  }

  @js.native
  trait UpdateDeviceMetadataResponse extends js.Object {
    var DeviceId: js.UndefOr[DeviceId]
  }

  object UpdateDeviceMetadataResponse {
    @inline
    def apply(
        DeviceId: js.UndefOr[DeviceId] = js.undefined
    ): UpdateDeviceMetadataResponse = {
      val __obj = js.Dynamic.literal()
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceMetadataResponse]
    }
  }
}
