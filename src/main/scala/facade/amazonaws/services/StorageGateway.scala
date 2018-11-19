package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object storagegateway {
  type ActivationKey = String
  type Authentication = String
  type BandwidthDownloadRateLimit = Double
  type BandwidthType = String
  type BandwidthUploadRateLimit = Double
  type CachediSCSIVolumes = js.Array[CachediSCSIVolume]
  type ChapCredentials = js.Array[ChapInfo]
  type ChapSecret = String
  type ClientToken = String
  type CreatedDate = js.Date
  type DayOfWeek = Int
  type Description = String
  type DeviceType = String
  type DiskAllocationType = String
  type DiskId = String
  type DiskIds = js.Array[DiskId]
  type Disks = js.Array[Disk]
  type DomainName = String
  type DomainUserName = String
  type DomainUserPassword = String
  type DoubleObject = Double
  type FileShareARN = String
  type FileShareARNList = js.Array[FileShareARN]
  type FileShareClientList = js.Array[IPV4AddressCIDR]
  type FileShareId = String
  type FileShareInfoList = js.Array[FileShareInfo]
  type FileShareStatus = String
  type FileShareType = String
  type FileShareUser = String
  type FileShareUserList = js.Array[FileShareUser]
  type Folder = String
  type FolderList = js.Array[Folder]
  type GatewayARN = String
  type GatewayId = String
  type GatewayName = String
  type GatewayNetworkInterfaces = js.Array[NetworkInterface]
  type GatewayOperationalState = String
  type GatewayState = String
  type GatewayTimezone = String
  type GatewayType = String
  type Gateways = js.Array[GatewayInfo]
  type HourOfDay = Int
  type IPV4AddressCIDR = String
  type Initiator = String
  type Initiators = js.Array[Initiator]
  type IqnName = String
  type KMSKey = String
  type LastSoftwareUpdate = String
  type LocalConsolePassword = String
  type LocationARN = String
  type Marker = String
  type MediumChangerType = String
  type MinuteOfHour = Int
  type NFSFileShareInfoList = js.Array[NFSFileShareInfo]
  type NetworkInterfaceId = String
  type NextUpdateAvailabilityDate = String
  type NotificationId = String
  type NumTapesToCreate = Int
  type ObjectACL = String
  type Path = String
  type PermissionId = Double
  type PermissionMode = String
  type PositiveIntObject = Int
  type RecurrenceInHours = Int
  type RegionId = String
  type ResourceARN = String
  type Role = String
  type SMBFileShareInfoList = js.Array[SMBFileShareInfo]
  type SMBGuestPassword = String
  type SnapshotDescription = String
  type SnapshotId = String
  type Squash = String
  type StorageClass = String
  type StorediSCSIVolumes = js.Array[StorediSCSIVolume]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TapeARN = String
  type TapeARNs = js.Array[TapeARN]
  type TapeArchiveStatus = String
  type TapeArchives = js.Array[TapeArchive]
  type TapeBarcode = String
  type TapeBarcodePrefix = String
  type TapeDriveType = String
  type TapeInfos = js.Array[TapeInfo]
  type TapeRecoveryPointInfos = js.Array[TapeRecoveryPointInfo]
  type TapeRecoveryPointStatus = String
  type TapeSize = Double
  type TapeStatus = String
  type TapeUsage = Double
  type Tapes = js.Array[Tape]
  type TargetARN = String
  type TargetName = String
  type Time = js.Date
  type VTLDeviceARN = String
  type VTLDeviceARNs = js.Array[VTLDeviceARN]
  type VTLDeviceProductIdentifier = String
  type VTLDeviceType = String
  type VTLDeviceVendor = String
  type VTLDevices = js.Array[VTLDevice]
  type VolumeARN = String
  type VolumeARNs = js.Array[VolumeARN]
  type VolumeId = String
  type VolumeInfos = js.Array[VolumeInfo]
  type VolumeRecoveryPointInfos = js.Array[VolumeRecoveryPointInfo]
  type VolumeStatus = String
  type VolumeType = String
  type VolumeUsedInBytes = Double
  type boolean = Boolean
  type double = Double
  type integer = Int
  type long = Double
  type string = String
}

package storagegateway {
  @js.native
  @JSImport("aws-sdk", "StorageGateway")
  class StorageGateway(config: AWSConfig) extends js.Object {
    def activateGateway(params: ActivateGatewayInput): Request[ActivateGatewayOutput] = js.native
    def addCache(params: AddCacheInput): Request[AddCacheOutput] = js.native
    def addTagsToResource(params: AddTagsToResourceInput): Request[AddTagsToResourceOutput] = js.native
    def addUploadBuffer(params: AddUploadBufferInput): Request[AddUploadBufferOutput] = js.native
    def addWorkingStorage(params: AddWorkingStorageInput): Request[AddWorkingStorageOutput] = js.native
    def cancelArchival(params: CancelArchivalInput): Request[CancelArchivalOutput] = js.native
    def cancelRetrieval(params: CancelRetrievalInput): Request[CancelRetrievalOutput] = js.native
    def createCachediSCSIVolume(params: CreateCachediSCSIVolumeInput): Request[CreateCachediSCSIVolumeOutput] = js.native
    def createNFSFileShare(params: CreateNFSFileShareInput): Request[CreateNFSFileShareOutput] = js.native
    def createSMBFileShare(params: CreateSMBFileShareInput): Request[CreateSMBFileShareOutput] = js.native
    def createSnapshot(params: CreateSnapshotInput): Request[CreateSnapshotOutput] = js.native
    def createSnapshotFromVolumeRecoveryPoint(params: CreateSnapshotFromVolumeRecoveryPointInput): Request[CreateSnapshotFromVolumeRecoveryPointOutput] = js.native
    def createStorediSCSIVolume(params: CreateStorediSCSIVolumeInput): Request[CreateStorediSCSIVolumeOutput] = js.native
    def createTapeWithBarcode(params: CreateTapeWithBarcodeInput): Request[CreateTapeWithBarcodeOutput] = js.native
    def createTapes(params: CreateTapesInput): Request[CreateTapesOutput] = js.native
    def deleteBandwidthRateLimit(params: DeleteBandwidthRateLimitInput): Request[DeleteBandwidthRateLimitOutput] = js.native
    def deleteChapCredentials(params: DeleteChapCredentialsInput): Request[DeleteChapCredentialsOutput] = js.native
    def deleteFileShare(params: DeleteFileShareInput): Request[DeleteFileShareOutput] = js.native
    def deleteGateway(params: DeleteGatewayInput): Request[DeleteGatewayOutput] = js.native
    def deleteSnapshotSchedule(params: DeleteSnapshotScheduleInput): Request[DeleteSnapshotScheduleOutput] = js.native
    def deleteTape(params: DeleteTapeInput): Request[DeleteTapeOutput] = js.native
    def deleteTapeArchive(params: DeleteTapeArchiveInput): Request[DeleteTapeArchiveOutput] = js.native
    def deleteVolume(params: DeleteVolumeInput): Request[DeleteVolumeOutput] = js.native
    def describeBandwidthRateLimit(params: DescribeBandwidthRateLimitInput): Request[DescribeBandwidthRateLimitOutput] = js.native
    def describeCache(params: DescribeCacheInput): Request[DescribeCacheOutput] = js.native
    def describeCachediSCSIVolumes(params: DescribeCachediSCSIVolumesInput): Request[DescribeCachediSCSIVolumesOutput] = js.native
    def describeChapCredentials(params: DescribeChapCredentialsInput): Request[DescribeChapCredentialsOutput] = js.native
    def describeGatewayInformation(params: DescribeGatewayInformationInput): Request[DescribeGatewayInformationOutput] = js.native
    def describeMaintenanceStartTime(params: DescribeMaintenanceStartTimeInput): Request[DescribeMaintenanceStartTimeOutput] = js.native
    def describeNFSFileShares(params: DescribeNFSFileSharesInput): Request[DescribeNFSFileSharesOutput] = js.native
    def describeSMBFileShares(params: DescribeSMBFileSharesInput): Request[DescribeSMBFileSharesOutput] = js.native
    def describeSMBSettings(params: DescribeSMBSettingsInput): Request[DescribeSMBSettingsOutput] = js.native
    def describeSnapshotSchedule(params: DescribeSnapshotScheduleInput): Request[DescribeSnapshotScheduleOutput] = js.native
    def describeStorediSCSIVolumes(params: DescribeStorediSCSIVolumesInput): Request[DescribeStorediSCSIVolumesOutput] = js.native
    def describeTapeArchives(params: DescribeTapeArchivesInput): Request[DescribeTapeArchivesOutput] = js.native
    def describeTapeRecoveryPoints(params: DescribeTapeRecoveryPointsInput): Request[DescribeTapeRecoveryPointsOutput] = js.native
    def describeTapes(params: DescribeTapesInput): Request[DescribeTapesOutput] = js.native
    def describeUploadBuffer(params: DescribeUploadBufferInput): Request[DescribeUploadBufferOutput] = js.native
    def describeVTLDevices(params: DescribeVTLDevicesInput): Request[DescribeVTLDevicesOutput] = js.native
    def describeWorkingStorage(params: DescribeWorkingStorageInput): Request[DescribeWorkingStorageOutput] = js.native
    def disableGateway(params: DisableGatewayInput): Request[DisableGatewayOutput] = js.native
    def joinDomain(params: JoinDomainInput): Request[JoinDomainOutput] = js.native
    def listFileShares(params: ListFileSharesInput): Request[ListFileSharesOutput] = js.native
    def listGateways(params: ListGatewaysInput): Request[ListGatewaysOutput] = js.native
    def listLocalDisks(params: ListLocalDisksInput): Request[ListLocalDisksOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listTapes(params: ListTapesInput): Request[ListTapesOutput] = js.native
    def listVolumeInitiators(params: ListVolumeInitiatorsInput): Request[ListVolumeInitiatorsOutput] = js.native
    def listVolumeRecoveryPoints(params: ListVolumeRecoveryPointsInput): Request[ListVolumeRecoveryPointsOutput] = js.native
    def listVolumes(params: ListVolumesInput): Request[ListVolumesOutput] = js.native
    def notifyWhenUploaded(params: NotifyWhenUploadedInput): Request[NotifyWhenUploadedOutput] = js.native
    def refreshCache(params: RefreshCacheInput): Request[RefreshCacheOutput] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceInput): Request[RemoveTagsFromResourceOutput] = js.native
    def resetCache(params: ResetCacheInput): Request[ResetCacheOutput] = js.native
    def retrieveTapeArchive(params: RetrieveTapeArchiveInput): Request[RetrieveTapeArchiveOutput] = js.native
    def retrieveTapeRecoveryPoint(params: RetrieveTapeRecoveryPointInput): Request[RetrieveTapeRecoveryPointOutput] = js.native
    def setLocalConsolePassword(params: SetLocalConsolePasswordInput): Request[SetLocalConsolePasswordOutput] = js.native
    def setSMBGuestPassword(params: SetSMBGuestPasswordInput): Request[SetSMBGuestPasswordOutput] = js.native
    def shutdownGateway(params: ShutdownGatewayInput): Request[ShutdownGatewayOutput] = js.native
    def startGateway(params: StartGatewayInput): Request[StartGatewayOutput] = js.native
    def updateBandwidthRateLimit(params: UpdateBandwidthRateLimitInput): Request[UpdateBandwidthRateLimitOutput] = js.native
    def updateChapCredentials(params: UpdateChapCredentialsInput): Request[UpdateChapCredentialsOutput] = js.native
    def updateGatewayInformation(params: UpdateGatewayInformationInput): Request[UpdateGatewayInformationOutput] = js.native
    def updateGatewaySoftwareNow(params: UpdateGatewaySoftwareNowInput): Request[UpdateGatewaySoftwareNowOutput] = js.native
    def updateMaintenanceStartTime(params: UpdateMaintenanceStartTimeInput): Request[UpdateMaintenanceStartTimeOutput] = js.native
    def updateNFSFileShare(params: UpdateNFSFileShareInput): Request[UpdateNFSFileShareOutput] = js.native
    def updateSMBFileShare(params: UpdateSMBFileShareInput): Request[UpdateSMBFileShareOutput] = js.native
    def updateSnapshotSchedule(params: UpdateSnapshotScheduleInput): Request[UpdateSnapshotScheduleOutput] = js.native
    def updateVTLDeviceType(params: UpdateVTLDeviceTypeInput): Request[UpdateVTLDeviceTypeOutput] = js.native
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>ActivateGatewayInput$ActivationKey</a> </p> </li> <li> <p> <a>ActivateGatewayInput$GatewayName</a> </p> </li> <li> <p> <a>ActivateGatewayInput$GatewayRegion</a> </p> </li> <li> <p> <a>ActivateGatewayInput$GatewayTimezone</a> </p> </li> <li> <p> <a>ActivateGatewayInput$GatewayType</a> </p> </li> <li> <p> <a>ActivateGatewayInput$TapeDriveType</a> </p> </li> <li> <p> <a>ActivateGatewayInput$MediumChangerType</a> </p> </li> </ul>
   */
  @js.native
  trait ActivateGatewayInput extends js.Object {
    var MediumChangerType: js.UndefOr[MediumChangerType]
    var GatewayTimezone: js.UndefOr[GatewayTimezone]
    var GatewayRegion: js.UndefOr[RegionId]
    var TapeDriveType: js.UndefOr[TapeDriveType]
    var ActivationKey: js.UndefOr[ActivationKey]
    var GatewayName: js.UndefOr[GatewayName]
    var GatewayType: js.UndefOr[GatewayType]
  }

  object ActivateGatewayInput {
    def apply(
      MediumChangerType: js.UndefOr[MediumChangerType] = js.undefined,
      GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined,
      GatewayRegion: js.UndefOr[RegionId] = js.undefined,
      TapeDriveType: js.UndefOr[TapeDriveType] = js.undefined,
      ActivationKey: js.UndefOr[ActivationKey] = js.undefined,
      GatewayName: js.UndefOr[GatewayName] = js.undefined,
      GatewayType: js.UndefOr[GatewayType] = js.undefined): ActivateGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MediumChangerType" -> MediumChangerType.map { x => x.asInstanceOf[js.Any] },
        "GatewayTimezone" -> GatewayTimezone.map { x => x.asInstanceOf[js.Any] },
        "GatewayRegion" -> GatewayRegion.map { x => x.asInstanceOf[js.Any] },
        "TapeDriveType" -> TapeDriveType.map { x => x.asInstanceOf[js.Any] },
        "ActivationKey" -> ActivationKey.map { x => x.asInstanceOf[js.Any] },
        "GatewayName" -> GatewayName.map { x => x.asInstanceOf[js.Any] },
        "GatewayType" -> GatewayType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivateGatewayInput]
    }
  }

  /**
   * <p>AWS Storage Gateway returns the Amazon Resource Name (ARN) of the activated gateway. It is a string made of information such as your account, gateway name, and region. This ARN is used to reference the gateway in other API operations as well as resource-based authorization.</p> <note> <p>For gateways activated prior to September 02, 2015, the gateway ARN contains the gateway name rather than the gateway ID. Changing the name of the gateway has no effect on the gateway ARN.</p> </note>
   */
  @js.native
  trait ActivateGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object ActivateGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): ActivateGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivateGatewayOutput]
    }
  }

  @js.native
  trait AddCacheInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var DiskIds: js.UndefOr[DiskIds]
  }

  object AddCacheInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined): AddCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "DiskIds" -> DiskIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCacheInput]
    }
  }

  @js.native
  trait AddCacheOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object AddCacheOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): AddCacheOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCacheOutput]
    }
  }

  /**
   * <p>AddTagsToResourceInput</p>
   */
  @js.native
  trait AddTagsToResourceInput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[Tags]
  }

  object AddTagsToResourceInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): AddTagsToResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceInput]
    }
  }

  /**
   * <p>AddTagsToResourceOutput</p>
   */
  @js.native
  trait AddTagsToResourceOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object AddTagsToResourceOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined): AddTagsToResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceOutput]
    }
  }

  @js.native
  trait AddUploadBufferInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var DiskIds: js.UndefOr[DiskIds]
  }

  object AddUploadBufferInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined): AddUploadBufferInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "DiskIds" -> DiskIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddUploadBufferInput]
    }
  }

  @js.native
  trait AddUploadBufferOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object AddUploadBufferOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): AddUploadBufferOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddUploadBufferOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>AddWorkingStorageInput$DiskIds</a> </p> </li> </ul>
   */
  @js.native
  trait AddWorkingStorageInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var DiskIds: js.UndefOr[DiskIds]
  }

  object AddWorkingStorageInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined): AddWorkingStorageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "DiskIds" -> DiskIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddWorkingStorageInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway for which working storage was configured.</p>
   */
  @js.native
  trait AddWorkingStorageOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object AddWorkingStorageOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): AddWorkingStorageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddWorkingStorageOutput]
    }
  }

  /**
   * <p>Describes an iSCSI cached volume.</p>
   */
  @js.native
  trait CachediSCSIVolume extends js.Object {
    var VolumeType: js.UndefOr[VolumeType]
    var CreatedDate: js.UndefOr[CreatedDate]
    var VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes]
    var VolumeId: js.UndefOr[VolumeId]
    var VolumeProgress: js.UndefOr[DoubleObject]
    var VolumeStatus: js.UndefOr[VolumeStatus]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes]
    var VolumeSizeInBytes: js.UndefOr[long]
    var SourceSnapshotId: js.UndefOr[SnapshotId]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object CachediSCSIVolume {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
      VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes] = js.undefined,
      VolumeId: js.UndefOr[VolumeId] = js.undefined,
      VolumeProgress: js.UndefOr[DoubleObject] = js.undefined,
      VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): CachediSCSIVolume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "VolumeUsedInBytes" -> VolumeUsedInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "VolumeProgress" -> VolumeProgress.map { x => x.asInstanceOf[js.Any] },
        "VolumeStatus" -> VolumeStatus.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeiSCSIAttributes" -> VolumeiSCSIAttributes.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "SourceSnapshotId" -> SourceSnapshotId.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CachediSCSIVolume]
    }
  }

  /**
   * <p>CancelArchivalInput</p>
   */
  @js.native
  trait CancelArchivalInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var TapeARN: js.UndefOr[TapeARN]
  }

  object CancelArchivalInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined): CancelArchivalInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelArchivalInput]
    }
  }

  /**
   * <p>CancelArchivalOutput</p>
   */
  @js.native
  trait CancelArchivalOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object CancelArchivalOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined): CancelArchivalOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelArchivalOutput]
    }
  }

  /**
   * <p>CancelRetrievalInput</p>
   */
  @js.native
  trait CancelRetrievalInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var TapeARN: js.UndefOr[TapeARN]
  }

  object CancelRetrievalInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined): CancelRetrievalInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelRetrievalInput]
    }
  }

  /**
   * <p>CancelRetrievalOutput</p>
   */
  @js.native
  trait CancelRetrievalOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object CancelRetrievalOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined): CancelRetrievalOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelRetrievalOutput]
    }
  }

  /**
   * <p>Describes Challenge-Handshake Authentication Protocol (CHAP) information that supports authentication between your gateway and iSCSI initiators.</p>
   */
  @js.native
  trait ChapInfo extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret]
    var InitiatorName: js.UndefOr[IqnName]
    var SecretToAuthenticateTarget: js.UndefOr[ChapSecret]
  }

  object ChapInfo {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined,
      SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined): ChapInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] },
        "SecretToAuthenticateInitiator" -> SecretToAuthenticateInitiator.map { x => x.asInstanceOf[js.Any] },
        "InitiatorName" -> InitiatorName.map { x => x.asInstanceOf[js.Any] },
        "SecretToAuthenticateTarget" -> SecretToAuthenticateTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChapInfo]
    }
  }

  @js.native
  trait CreateCachediSCSIVolumeInput extends js.Object {
    var SourceVolumeARN: js.UndefOr[VolumeARN]
    var TargetName: js.UndefOr[TargetName]
    var ClientToken: js.UndefOr[ClientToken]
    var SnapshotId: js.UndefOr[SnapshotId]
    var GatewayARN: js.UndefOr[GatewayARN]
    var KMSEncrypted: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var VolumeSizeInBytes: js.UndefOr[long]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object CreateCachediSCSIVolumeInput {
    def apply(
      SourceVolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      TargetName: js.UndefOr[TargetName] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): CreateCachediSCSIVolumeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceVolumeARN" -> SourceVolumeARN.map { x => x.asInstanceOf[js.Any] },
        "TargetName" -> TargetName.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCachediSCSIVolumeInput]
    }
  }

  @js.native
  trait CreateCachediSCSIVolumeOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var TargetARN: js.UndefOr[TargetARN]
  }

  object CreateCachediSCSIVolumeOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined): CreateCachediSCSIVolumeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCachediSCSIVolumeOutput]
    }
  }

  /**
   * <p>CreateNFSFileShareInput</p>
   */
  @js.native
  trait CreateNFSFileShareInput extends js.Object {
    var Role: js.UndefOr[Role]
    var RequesterPays: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[ClientToken]
    var LocationARN: js.UndefOr[LocationARN]
    var GatewayARN: js.UndefOr[GatewayARN]
    var ObjectACL: js.UndefOr[ObjectACL]
    var Squash: js.UndefOr[Squash]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var ReadOnly: js.UndefOr[Boolean]
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults]
    var KMSEncrypted: js.UndefOr[Boolean]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var KMSKey: js.UndefOr[KMSKey]
    var ClientList: js.UndefOr[FileShareClientList]
  }

  object CreateNFSFileShareInput {
    def apply(
      Role: js.UndefOr[Role] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      LocationARN: js.UndefOr[LocationARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      Squash: js.UndefOr[Squash] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      ClientList: js.UndefOr[FileShareClientList] = js.undefined): CreateNFSFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "LocationARN" -> LocationARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "Squash" -> Squash.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "NFSFileShareDefaults" -> NFSFileShareDefaults.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "ClientList" -> ClientList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNFSFileShareInput]
    }
  }

  /**
   * <p>CreateNFSFileShareOutput</p>
   */
  @js.native
  trait CreateNFSFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object CreateNFSFileShareOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined): CreateNFSFileShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNFSFileShareOutput]
    }
  }

  /**
   * <p>CreateSMBFileShareInput</p>
   */
  @js.native
  trait CreateSMBFileShareInput extends js.Object {
    var Authentication: js.UndefOr[Authentication]
    var Role: js.UndefOr[Role]
    var RequesterPays: js.UndefOr[Boolean]
    var InvalidUserList: js.UndefOr[FileShareUserList]
    var ClientToken: js.UndefOr[ClientToken]
    var ValidUserList: js.UndefOr[FileShareUserList]
    var LocationARN: js.UndefOr[LocationARN]
    var GatewayARN: js.UndefOr[GatewayARN]
    var ObjectACL: js.UndefOr[ObjectACL]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var ReadOnly: js.UndefOr[Boolean]
    var KMSEncrypted: js.UndefOr[Boolean]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object CreateSMBFileShareInput {
    def apply(
      Authentication: js.UndefOr[Authentication] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      ValidUserList: js.UndefOr[FileShareUserList] = js.undefined,
      LocationARN: js.UndefOr[LocationARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): CreateSMBFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Authentication" -> Authentication.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "InvalidUserList" -> InvalidUserList.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "ValidUserList" -> ValidUserList.map { x => x.asInstanceOf[js.Any] },
        "LocationARN" -> LocationARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSMBFileShareInput]
    }
  }

  /**
   * <p>CreateSMBFileShareOutput</p>
   */
  @js.native
  trait CreateSMBFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object CreateSMBFileShareOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined): CreateSMBFileShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSMBFileShareOutput]
    }
  }

  @js.native
  trait CreateSnapshotFromVolumeRecoveryPointInput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var SnapshotDescription: js.UndefOr[SnapshotDescription]
  }

  object CreateSnapshotFromVolumeRecoveryPointInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      SnapshotDescription: js.UndefOr[SnapshotDescription] = js.undefined): CreateSnapshotFromVolumeRecoveryPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "SnapshotDescription" -> SnapshotDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotFromVolumeRecoveryPointInput]
    }
  }

  @js.native
  trait CreateSnapshotFromVolumeRecoveryPointOutput extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeRecoveryPointTime: js.UndefOr[string]
  }

  object CreateSnapshotFromVolumeRecoveryPointOutput {
    def apply(
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeRecoveryPointTime: js.UndefOr[string] = js.undefined): CreateSnapshotFromVolumeRecoveryPointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeRecoveryPointTime" -> VolumeRecoveryPointTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotFromVolumeRecoveryPointOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>CreateSnapshotInput$SnapshotDescription</a> </p> </li> <li> <p> <a>CreateSnapshotInput$VolumeARN</a> </p> </li> </ul>
   */
  @js.native
  trait CreateSnapshotInput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var SnapshotDescription: js.UndefOr[SnapshotDescription]
  }

  object CreateSnapshotInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      SnapshotDescription: js.UndefOr[SnapshotDescription] = js.undefined): CreateSnapshotInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "SnapshotDescription" -> SnapshotDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait CreateSnapshotOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object CreateSnapshotOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined): CreateSnapshotOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>CreateStorediSCSIVolumeInput$DiskId</a> </p> </li> <li> <p> <a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a> </p> </li> <li> <p> <a>CreateStorediSCSIVolumeInput$PreserveExistingData</a> </p> </li> <li> <p> <a>CreateStorediSCSIVolumeInput$SnapshotId</a> </p> </li> <li> <p> <a>CreateStorediSCSIVolumeInput$TargetName</a> </p> </li> </ul>
   */
  @js.native
  trait CreateStorediSCSIVolumeInput extends js.Object {
    var TargetName: js.UndefOr[TargetName]
    var SnapshotId: js.UndefOr[SnapshotId]
    var GatewayARN: js.UndefOr[GatewayARN]
    var DiskId: js.UndefOr[DiskId]
    var KMSEncrypted: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var PreserveExistingData: js.UndefOr[boolean]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object CreateStorediSCSIVolumeInput {
    def apply(
      TargetName: js.UndefOr[TargetName] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskId: js.UndefOr[DiskId] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      PreserveExistingData: js.UndefOr[boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): CreateStorediSCSIVolumeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetName" -> TargetName.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "DiskId" -> DiskId.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "PreserveExistingData" -> PreserveExistingData.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStorediSCSIVolumeInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait CreateStorediSCSIVolumeOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeSizeInBytes: js.UndefOr[long]
    var TargetARN: js.UndefOr[TargetARN]
  }

  object CreateStorediSCSIVolumeOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined): CreateStorediSCSIVolumeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStorediSCSIVolumeOutput]
    }
  }

  /**
   * <p>CreateTapeWithBarcodeInput</p>
   */
  @js.native
  trait CreateTapeWithBarcodeInput extends js.Object {
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var GatewayARN: js.UndefOr[GatewayARN]
    var KMSEncrypted: js.UndefOr[Boolean]
    var TapeBarcode: js.UndefOr[TapeBarcode]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object CreateTapeWithBarcodeInput {
    def apply(
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): CreateTapeWithBarcodeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeSizeInBytes" -> TapeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "TapeBarcode" -> TapeBarcode.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapeWithBarcodeInput]
    }
  }

  /**
   * <p>CreateTapeOutput</p>
   */
  @js.native
  trait CreateTapeWithBarcodeOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object CreateTapeWithBarcodeOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined): CreateTapeWithBarcodeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapeWithBarcodeOutput]
    }
  }

  /**
   * <p>CreateTapesInput</p>
   */
  @js.native
  trait CreateTapesInput extends js.Object {
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeBarcodePrefix: js.UndefOr[TapeBarcodePrefix]
    var ClientToken: js.UndefOr[ClientToken]
    var GatewayARN: js.UndefOr[GatewayARN]
    var NumTapesToCreate: js.UndefOr[NumTapesToCreate]
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object CreateTapesInput {
    def apply(
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeBarcodePrefix: js.UndefOr[TapeBarcodePrefix] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      NumTapesToCreate: js.UndefOr[NumTapesToCreate] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): CreateTapesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeSizeInBytes" -> TapeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeBarcodePrefix" -> TapeBarcodePrefix.map { x => x.asInstanceOf[js.Any] },
        "ClientToken" -> ClientToken.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "NumTapesToCreate" -> NumTapesToCreate.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapesInput]
    }
  }

  /**
   * <p>CreateTapeOutput</p>
   */
  @js.native
  trait CreateTapesOutput extends js.Object {
    var TapeARNs: js.UndefOr[TapeARNs]
  }

  object CreateTapesOutput {
    def apply(
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined): CreateTapesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARNs" -> TapeARNs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapesOutput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p> <ul> <li> <p> <a>DeleteBandwidthRateLimitInput$BandwidthType</a> </p> </li> </ul>
   */
  @js.native
  trait DeleteBandwidthRateLimitInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var BandwidthType: js.UndefOr[BandwidthType]
  }

  object DeleteBandwidthRateLimitInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      BandwidthType: js.UndefOr[BandwidthType] = js.undefined): DeleteBandwidthRateLimitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "BandwidthType" -> BandwidthType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBandwidthRateLimitInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway whose bandwidth rate information was deleted.</p>
   */
  @js.native
  trait DeleteBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DeleteBandwidthRateLimitOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DeleteBandwidthRateLimitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBandwidthRateLimitOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>DeleteChapCredentialsInput$InitiatorName</a> </p> </li> <li> <p> <a>DeleteChapCredentialsInput$TargetARN</a> </p> </li> </ul>
   */
  @js.native
  trait DeleteChapCredentialsInput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var InitiatorName: js.UndefOr[IqnName]
  }

  object DeleteChapCredentialsInput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined): DeleteChapCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] },
        "InitiatorName" -> InitiatorName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChapCredentialsInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DeleteChapCredentialsOutput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var InitiatorName: js.UndefOr[IqnName]
  }

  object DeleteChapCredentialsOutput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined): DeleteChapCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] },
        "InitiatorName" -> InitiatorName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChapCredentialsOutput]
    }
  }

  /**
   * <p>DeleteFileShareInput</p>
   */
  @js.native
  trait DeleteFileShareInput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
    var ForceDelete: js.UndefOr[boolean]
  }

  object DeleteFileShareInput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      ForceDelete: js.UndefOr[boolean] = js.undefined): DeleteFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "ForceDelete" -> ForceDelete.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileShareInput]
    }
  }

  /**
   * <p>DeleteFileShareOutput</p>
   */
  @js.native
  trait DeleteFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object DeleteFileShareOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined): DeleteFileShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileShareOutput]
    }
  }

  /**
   * <p>A JSON object containing the ID of the gateway to delete.</p>
   */
  @js.native
  trait DeleteGatewayInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DeleteGatewayInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DeleteGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGatewayInput]
    }
  }

  /**
   * <p>A JSON object containing the ID of the deleted gateway.</p>
   */
  @js.native
  trait DeleteGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DeleteGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DeleteGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGatewayOutput]
    }
  }

  @js.native
  trait DeleteSnapshotScheduleInput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DeleteSnapshotScheduleInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): DeleteSnapshotScheduleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotScheduleInput]
    }
  }

  @js.native
  trait DeleteSnapshotScheduleOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DeleteSnapshotScheduleOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): DeleteSnapshotScheduleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotScheduleOutput]
    }
  }

  /**
   * <p>DeleteTapeArchiveInput</p>
   */
  @js.native
  trait DeleteTapeArchiveInput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object DeleteTapeArchiveInput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined): DeleteTapeArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeArchiveInput]
    }
  }

  /**
   * <p>DeleteTapeArchiveOutput</p>
   */
  @js.native
  trait DeleteTapeArchiveOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object DeleteTapeArchiveOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined): DeleteTapeArchiveOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeArchiveOutput]
    }
  }

  /**
   * <p>DeleteTapeInput</p>
   */
  @js.native
  trait DeleteTapeInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var TapeARN: js.UndefOr[TapeARN]
  }

  object DeleteTapeInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined): DeleteTapeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeInput]
    }
  }

  /**
   * <p>DeleteTapeOutput</p>
   */
  @js.native
  trait DeleteTapeOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object DeleteTapeOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined): DeleteTapeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeOutput]
    }
  }

  /**
   * <p>A JSON object containing the <a>DeleteVolumeInput$VolumeARN</a> to delete.</p>
   */
  @js.native
  trait DeleteVolumeInput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DeleteVolumeInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): DeleteVolumeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVolumeInput]
    }
  }

  /**
   * <p>A JSON object containing the of the storage volume that was deleted</p>
   */
  @js.native
  trait DeleteVolumeOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DeleteVolumeOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): DeleteVolumeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVolumeOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway.</p>
   */
  @js.native
  trait DescribeBandwidthRateLimitInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeBandwidthRateLimitInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DescribeBandwidthRateLimitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBandwidthRateLimitInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DescribeBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit]
    var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit]
  }

  object DescribeBandwidthRateLimitOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined,
      AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined): DescribeBandwidthRateLimitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "AverageUploadRateLimitInBitsPerSec" -> AverageUploadRateLimitInBitsPerSec.map { x => x.asInstanceOf[js.Any] },
        "AverageDownloadRateLimitInBitsPerSec" -> AverageDownloadRateLimitInBitsPerSec.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBandwidthRateLimitOutput]
    }
  }

  @js.native
  trait DescribeCacheInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeCacheInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DescribeCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheInput]
    }
  }

  @js.native
  trait DescribeCacheOutput extends js.Object {
    var CacheDirtyPercentage: js.UndefOr[double]
    var DiskIds: js.UndefOr[DiskIds]
    var CacheUsedPercentage: js.UndefOr[double]
    var GatewayARN: js.UndefOr[GatewayARN]
    var CacheMissPercentage: js.UndefOr[double]
    var CacheHitPercentage: js.UndefOr[double]
    var CacheAllocatedInBytes: js.UndefOr[long]
  }

  object DescribeCacheOutput {
    def apply(
      CacheDirtyPercentage: js.UndefOr[double] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined,
      CacheUsedPercentage: js.UndefOr[double] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      CacheMissPercentage: js.UndefOr[double] = js.undefined,
      CacheHitPercentage: js.UndefOr[double] = js.undefined,
      CacheAllocatedInBytes: js.UndefOr[long] = js.undefined): DescribeCacheOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheDirtyPercentage" -> CacheDirtyPercentage.map { x => x.asInstanceOf[js.Any] },
        "DiskIds" -> DiskIds.map { x => x.asInstanceOf[js.Any] },
        "CacheUsedPercentage" -> CacheUsedPercentage.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "CacheMissPercentage" -> CacheMissPercentage.map { x => x.asInstanceOf[js.Any] },
        "CacheHitPercentage" -> CacheHitPercentage.map { x => x.asInstanceOf[js.Any] },
        "CacheAllocatedInBytes" -> CacheAllocatedInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheOutput]
    }
  }

  @js.native
  trait DescribeCachediSCSIVolumesInput extends js.Object {
    var VolumeARNs: js.UndefOr[VolumeARNs]
  }

  object DescribeCachediSCSIVolumesInput {
    def apply(
      VolumeARNs: js.UndefOr[VolumeARNs] = js.undefined): DescribeCachediSCSIVolumesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARNs" -> VolumeARNs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCachediSCSIVolumesInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DescribeCachediSCSIVolumesOutput extends js.Object {
    var CachediSCSIVolumes: js.UndefOr[CachediSCSIVolumes]
  }

  object DescribeCachediSCSIVolumesOutput {
    def apply(
      CachediSCSIVolumes: js.UndefOr[CachediSCSIVolumes] = js.undefined): DescribeCachediSCSIVolumesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CachediSCSIVolumes" -> CachediSCSIVolumes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCachediSCSIVolumesOutput]
    }
  }

  /**
   * <p>A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target.</p>
   */
  @js.native
  trait DescribeChapCredentialsInput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
  }

  object DescribeChapCredentialsInput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined): DescribeChapCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChapCredentialsInput]
    }
  }

  /**
   * <p>A JSON object containing a .</p>
   */
  @js.native
  trait DescribeChapCredentialsOutput extends js.Object {
    var ChapCredentials: js.UndefOr[ChapCredentials]
  }

  object DescribeChapCredentialsOutput {
    def apply(
      ChapCredentials: js.UndefOr[ChapCredentials] = js.undefined): DescribeChapCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChapCredentials" -> ChapCredentials.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChapCredentialsOutput]
    }
  }

  /**
   * <p>A JSON object containing the ID of the gateway.</p>
   */
  @js.native
  trait DescribeGatewayInformationInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeGatewayInformationInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DescribeGatewayInformationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGatewayInformationInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DescribeGatewayInformationOutput extends js.Object {
    var GatewayNetworkInterfaces: js.UndefOr[GatewayNetworkInterfaces]
    var LastSoftwareUpdate: js.UndefOr[LastSoftwareUpdate]
    var NextUpdateAvailabilityDate: js.UndefOr[NextUpdateAvailabilityDate]
    var GatewayTimezone: js.UndefOr[GatewayTimezone]
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayState: js.UndefOr[GatewayState]
    var GatewayName: js.UndefOr[string]
    var GatewayType: js.UndefOr[GatewayType]
    var GatewayId: js.UndefOr[GatewayId]
  }

  object DescribeGatewayInformationOutput {
    def apply(
      GatewayNetworkInterfaces: js.UndefOr[GatewayNetworkInterfaces] = js.undefined,
      LastSoftwareUpdate: js.UndefOr[LastSoftwareUpdate] = js.undefined,
      NextUpdateAvailabilityDate: js.UndefOr[NextUpdateAvailabilityDate] = js.undefined,
      GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayState: js.UndefOr[GatewayState] = js.undefined,
      GatewayName: js.UndefOr[string] = js.undefined,
      GatewayType: js.UndefOr[GatewayType] = js.undefined,
      GatewayId: js.UndefOr[GatewayId] = js.undefined): DescribeGatewayInformationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayNetworkInterfaces" -> GatewayNetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "LastSoftwareUpdate" -> LastSoftwareUpdate.map { x => x.asInstanceOf[js.Any] },
        "NextUpdateAvailabilityDate" -> NextUpdateAvailabilityDate.map { x => x.asInstanceOf[js.Any] },
        "GatewayTimezone" -> GatewayTimezone.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayState" -> GatewayState.map { x => x.asInstanceOf[js.Any] },
        "GatewayName" -> GatewayName.map { x => x.asInstanceOf[js.Any] },
        "GatewayType" -> GatewayType.map { x => x.asInstanceOf[js.Any] },
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGatewayInformationOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway.</p>
   */
  @js.native
  trait DescribeMaintenanceStartTimeInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeMaintenanceStartTimeInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DescribeMaintenanceStartTimeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceStartTimeInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p> <ul> <li> <p> <a>DescribeMaintenanceStartTimeOutput$DayOfWeek</a> </p> </li> <li> <p> <a>DescribeMaintenanceStartTimeOutput$HourOfDay</a> </p> </li> <li> <p> <a>DescribeMaintenanceStartTimeOutput$MinuteOfHour</a> </p> </li> <li> <p> <a>DescribeMaintenanceStartTimeOutput$Timezone</a> </p> </li> </ul>
   */
  @js.native
  trait DescribeMaintenanceStartTimeOutput extends js.Object {
    var Timezone: js.UndefOr[GatewayTimezone]
    var MinuteOfHour: js.UndefOr[MinuteOfHour]
    var GatewayARN: js.UndefOr[GatewayARN]
    var DayOfWeek: js.UndefOr[DayOfWeek]
    var HourOfDay: js.UndefOr[HourOfDay]
  }

  object DescribeMaintenanceStartTimeOutput {
    def apply(
      Timezone: js.UndefOr[GatewayTimezone] = js.undefined,
      MinuteOfHour: js.UndefOr[MinuteOfHour] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
      HourOfDay: js.UndefOr[HourOfDay] = js.undefined): DescribeMaintenanceStartTimeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "MinuteOfHour" -> MinuteOfHour.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "DayOfWeek" -> DayOfWeek.map { x => x.asInstanceOf[js.Any] },
        "HourOfDay" -> HourOfDay.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceStartTimeOutput]
    }
  }

  /**
   * <p>DescribeNFSFileSharesInput</p>
   */
  @js.native
  trait DescribeNFSFileSharesInput extends js.Object {
    var FileShareARNList: js.UndefOr[FileShareARNList]
  }

  object DescribeNFSFileSharesInput {
    def apply(
      FileShareARNList: js.UndefOr[FileShareARNList] = js.undefined): DescribeNFSFileSharesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARNList" -> FileShareARNList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNFSFileSharesInput]
    }
  }

  /**
   * <p>DescribeNFSFileSharesOutput</p>
   */
  @js.native
  trait DescribeNFSFileSharesOutput extends js.Object {
    var NFSFileShareInfoList: js.UndefOr[NFSFileShareInfoList]
  }

  object DescribeNFSFileSharesOutput {
    def apply(
      NFSFileShareInfoList: js.UndefOr[NFSFileShareInfoList] = js.undefined): DescribeNFSFileSharesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NFSFileShareInfoList" -> NFSFileShareInfoList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNFSFileSharesOutput]
    }
  }

  /**
   * <p>DescribeSMBFileSharesInput</p>
   */
  @js.native
  trait DescribeSMBFileSharesInput extends js.Object {
    var FileShareARNList: js.UndefOr[FileShareARNList]
  }

  object DescribeSMBFileSharesInput {
    def apply(
      FileShareARNList: js.UndefOr[FileShareARNList] = js.undefined): DescribeSMBFileSharesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARNList" -> FileShareARNList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSMBFileSharesInput]
    }
  }

  /**
   * <p>DescribeSMBFileSharesOutput</p>
   */
  @js.native
  trait DescribeSMBFileSharesOutput extends js.Object {
    var SMBFileShareInfoList: js.UndefOr[SMBFileShareInfoList]
  }

  object DescribeSMBFileSharesOutput {
    def apply(
      SMBFileShareInfoList: js.UndefOr[SMBFileShareInfoList] = js.undefined): DescribeSMBFileSharesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SMBFileShareInfoList" -> SMBFileShareInfoList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSMBFileSharesOutput]
    }
  }

  @js.native
  trait DescribeSMBSettingsInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeSMBSettingsInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DescribeSMBSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSMBSettingsInput]
    }
  }

  @js.native
  trait DescribeSMBSettingsOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var DomainName: js.UndefOr[DomainName]
    var SMBGuestPasswordSet: js.UndefOr[Boolean]
  }

  object DescribeSMBSettingsOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined): DescribeSMBSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "SMBGuestPasswordSet" -> SMBGuestPasswordSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSMBSettingsOutput]
    }
  }

  /**
   * <p>A JSON object containing the <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.</p>
   */
  @js.native
  trait DescribeSnapshotScheduleInput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DescribeSnapshotScheduleInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): DescribeSnapshotScheduleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotScheduleInput]
    }
  }

  @js.native
  trait DescribeSnapshotScheduleOutput extends js.Object {
    var Timezone: js.UndefOr[GatewayTimezone]
    var StartAt: js.UndefOr[HourOfDay]
    var Description: js.UndefOr[Description]
    var RecurrenceInHours: js.UndefOr[RecurrenceInHours]
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DescribeSnapshotScheduleOutput {
    def apply(
      Timezone: js.UndefOr[GatewayTimezone] = js.undefined,
      StartAt: js.UndefOr[HourOfDay] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      RecurrenceInHours: js.UndefOr[RecurrenceInHours] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): DescribeSnapshotScheduleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "StartAt" -> StartAt.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RecurrenceInHours" -> RecurrenceInHours.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotScheduleOutput]
    }
  }

  /**
   * <p>A JSON object containing a list of <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.</p>
   */
  @js.native
  trait DescribeStorediSCSIVolumesInput extends js.Object {
    var VolumeARNs: js.UndefOr[VolumeARNs]
  }

  object DescribeStorediSCSIVolumesInput {
    def apply(
      VolumeARNs: js.UndefOr[VolumeARNs] = js.undefined): DescribeStorediSCSIVolumesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARNs" -> VolumeARNs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStorediSCSIVolumesInput]
    }
  }

  @js.native
  trait DescribeStorediSCSIVolumesOutput extends js.Object {
    var StorediSCSIVolumes: js.UndefOr[StorediSCSIVolumes]
  }

  object DescribeStorediSCSIVolumesOutput {
    def apply(
      StorediSCSIVolumes: js.UndefOr[StorediSCSIVolumes] = js.undefined): DescribeStorediSCSIVolumesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StorediSCSIVolumes" -> StorediSCSIVolumes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStorediSCSIVolumesOutput]
    }
  }

  /**
   * <p>DescribeTapeArchivesInput</p>
   */
  @js.native
  trait DescribeTapeArchivesInput extends js.Object {
    var TapeARNs: js.UndefOr[TapeARNs]
    var Marker: js.UndefOr[Marker]
    var Limit: js.UndefOr[PositiveIntObject]
  }

  object DescribeTapeArchivesInput {
    def apply(
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined): DescribeTapeArchivesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARNs" -> TapeARNs.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeArchivesInput]
    }
  }

  /**
   * <p>DescribeTapeArchivesOutput</p>
   */
  @js.native
  trait DescribeTapeArchivesOutput extends js.Object {
    var TapeArchives: js.UndefOr[TapeArchives]
    var Marker: js.UndefOr[Marker]
  }

  object DescribeTapeArchivesOutput {
    def apply(
      TapeArchives: js.UndefOr[TapeArchives] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): DescribeTapeArchivesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeArchives" -> TapeArchives.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeArchivesOutput]
    }
  }

  /**
   * <p>DescribeTapeRecoveryPointsInput</p>
   */
  @js.native
  trait DescribeTapeRecoveryPointsInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Marker: js.UndefOr[Marker]
    var Limit: js.UndefOr[PositiveIntObject]
  }

  object DescribeTapeRecoveryPointsInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined): DescribeTapeRecoveryPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeRecoveryPointsInput]
    }
  }

  /**
   * <p>DescribeTapeRecoveryPointsOutput</p>
   */
  @js.native
  trait DescribeTapeRecoveryPointsOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var TapeRecoveryPointInfos: js.UndefOr[TapeRecoveryPointInfos]
    var Marker: js.UndefOr[Marker]
  }

  object DescribeTapeRecoveryPointsOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeRecoveryPointInfos: js.UndefOr[TapeRecoveryPointInfos] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): DescribeTapeRecoveryPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "TapeRecoveryPointInfos" -> TapeRecoveryPointInfos.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeRecoveryPointsOutput]
    }
  }

  /**
   * <p>DescribeTapesInput</p>
   */
  @js.native
  trait DescribeTapesInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var TapeARNs: js.UndefOr[TapeARNs]
    var Marker: js.UndefOr[Marker]
    var Limit: js.UndefOr[PositiveIntObject]
  }

  object DescribeTapesInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined): DescribeTapesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "TapeARNs" -> TapeARNs.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapesInput]
    }
  }

  /**
   * <p>DescribeTapesOutput</p>
   */
  @js.native
  trait DescribeTapesOutput extends js.Object {
    var Tapes: js.UndefOr[Tapes]
    var Marker: js.UndefOr[Marker]
  }

  object DescribeTapesOutput {
    def apply(
      Tapes: js.UndefOr[Tapes] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): DescribeTapesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tapes" -> Tapes.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapesOutput]
    }
  }

  @js.native
  trait DescribeUploadBufferInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeUploadBufferInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DescribeUploadBufferInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUploadBufferInput]
    }
  }

  @js.native
  trait DescribeUploadBufferOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var DiskIds: js.UndefOr[DiskIds]
    var UploadBufferUsedInBytes: js.UndefOr[long]
    var UploadBufferAllocatedInBytes: js.UndefOr[long]
  }

  object DescribeUploadBufferOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined,
      UploadBufferUsedInBytes: js.UndefOr[long] = js.undefined,
      UploadBufferAllocatedInBytes: js.UndefOr[long] = js.undefined): DescribeUploadBufferOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "DiskIds" -> DiskIds.map { x => x.asInstanceOf[js.Any] },
        "UploadBufferUsedInBytes" -> UploadBufferUsedInBytes.map { x => x.asInstanceOf[js.Any] },
        "UploadBufferAllocatedInBytes" -> UploadBufferAllocatedInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUploadBufferOutput]
    }
  }

  /**
   * <p>DescribeVTLDevicesInput</p>
   */
  @js.native
  trait DescribeVTLDevicesInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var VTLDeviceARNs: js.UndefOr[VTLDeviceARNs]
    var Marker: js.UndefOr[Marker]
    var Limit: js.UndefOr[PositiveIntObject]
  }

  object DescribeVTLDevicesInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      VTLDeviceARNs: js.UndefOr[VTLDeviceARNs] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined): DescribeVTLDevicesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "VTLDeviceARNs" -> VTLDeviceARNs.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVTLDevicesInput]
    }
  }

  /**
   * <p>DescribeVTLDevicesOutput</p>
   */
  @js.native
  trait DescribeVTLDevicesOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var VTLDevices: js.UndefOr[VTLDevices]
    var Marker: js.UndefOr[Marker]
  }

  object DescribeVTLDevicesOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      VTLDevices: js.UndefOr[VTLDevices] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): DescribeVTLDevicesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "VTLDevices" -> VTLDevices.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVTLDevicesOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway.</p>
   */
  @js.native
  trait DescribeWorkingStorageInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeWorkingStorageInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DescribeWorkingStorageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkingStorageInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DescribeWorkingStorageOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var DiskIds: js.UndefOr[DiskIds]
    var WorkingStorageUsedInBytes: js.UndefOr[long]
    var WorkingStorageAllocatedInBytes: js.UndefOr[long]
  }

  object DescribeWorkingStorageOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined,
      WorkingStorageUsedInBytes: js.UndefOr[long] = js.undefined,
      WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.undefined): DescribeWorkingStorageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "DiskIds" -> DiskIds.map { x => x.asInstanceOf[js.Any] },
        "WorkingStorageUsedInBytes" -> WorkingStorageUsedInBytes.map { x => x.asInstanceOf[js.Any] },
        "WorkingStorageAllocatedInBytes" -> WorkingStorageAllocatedInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkingStorageOutput]
    }
  }

  /**
   * <p>Lists iSCSI information about a VTL device.</p>
   */
  @js.native
  trait DeviceiSCSIAttributes extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NetworkInterfacePort: js.UndefOr[integer]
    var ChapEnabled: js.UndefOr[boolean]
  }

  object DeviceiSCSIAttributes {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      NetworkInterfacePort: js.UndefOr[integer] = js.undefined,
      ChapEnabled: js.UndefOr[boolean] = js.undefined): DeviceiSCSIAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfacePort" -> NetworkInterfacePort.map { x => x.asInstanceOf[js.Any] },
        "ChapEnabled" -> ChapEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceiSCSIAttributes]
    }
  }

  /**
   * <p>DisableGatewayInput</p>
   */
  @js.native
  trait DisableGatewayInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DisableGatewayInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DisableGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableGatewayInput]
    }
  }

  /**
   * <p>DisableGatewayOutput</p>
   */
  @js.native
  trait DisableGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DisableGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DisableGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableGatewayOutput]
    }
  }

  @js.native
  trait Disk extends js.Object {
    var DiskPath: js.UndefOr[string]
    var DiskAllocationResource: js.UndefOr[string]
    var DiskNode: js.UndefOr[string]
    var DiskStatus: js.UndefOr[string]
    var DiskId: js.UndefOr[DiskId]
    var DiskAllocationType: js.UndefOr[DiskAllocationType]
    var DiskSizeInBytes: js.UndefOr[long]
  }

  object Disk {
    def apply(
      DiskPath: js.UndefOr[string] = js.undefined,
      DiskAllocationResource: js.UndefOr[string] = js.undefined,
      DiskNode: js.UndefOr[string] = js.undefined,
      DiskStatus: js.UndefOr[string] = js.undefined,
      DiskId: js.UndefOr[DiskId] = js.undefined,
      DiskAllocationType: js.UndefOr[DiskAllocationType] = js.undefined,
      DiskSizeInBytes: js.UndefOr[long] = js.undefined): Disk = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DiskPath" -> DiskPath.map { x => x.asInstanceOf[js.Any] },
        "DiskAllocationResource" -> DiskAllocationResource.map { x => x.asInstanceOf[js.Any] },
        "DiskNode" -> DiskNode.map { x => x.asInstanceOf[js.Any] },
        "DiskStatus" -> DiskStatus.map { x => x.asInstanceOf[js.Any] },
        "DiskId" -> DiskId.map { x => x.asInstanceOf[js.Any] },
        "DiskAllocationType" -> DiskAllocationType.map { x => x.asInstanceOf[js.Any] },
        "DiskSizeInBytes" -> DiskSizeInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Disk]
    }
  }

  /**
   * <p>Describes a file share.</p>
   */
  @js.native
  trait FileShareInfo extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var FileShareStatus: js.UndefOr[FileShareStatus]
    var FileShareType: js.UndefOr[FileShareType]
    var FileShareARN: js.UndefOr[FileShareARN]
    var FileShareId: js.UndefOr[FileShareId]
  }

  object FileShareInfo {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined,
      FileShareType: js.UndefOr[FileShareType] = js.undefined,
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      FileShareId: js.UndefOr[FileShareId] = js.undefined): FileShareInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "FileShareStatus" -> FileShareStatus.map { x => x.asInstanceOf[js.Any] },
        "FileShareType" -> FileShareType.map { x => x.asInstanceOf[js.Any] },
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "FileShareId" -> FileShareId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileShareInfo]
    }
  }

  /**
   * <p>The type of the file share.</p>
   */
  object FileShareTypeEnum {
    val NFS = "NFS"
    val SMB = "SMB"

    val values = IndexedSeq(NFS, SMB)
  }

  /**
   * <p>Describes a gateway object.</p>
   */
  @js.native
  trait GatewayInfo extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayName: js.UndefOr[string]
    var GatewayType: js.UndefOr[GatewayType]
    var GatewayOperationalState: js.UndefOr[GatewayOperationalState]
    var GatewayId: js.UndefOr[GatewayId]
  }

  object GatewayInfo {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayName: js.UndefOr[string] = js.undefined,
      GatewayType: js.UndefOr[GatewayType] = js.undefined,
      GatewayOperationalState: js.UndefOr[GatewayOperationalState] = js.undefined,
      GatewayId: js.UndefOr[GatewayId] = js.undefined): GatewayInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayName" -> GatewayName.map { x => x.asInstanceOf[js.Any] },
        "GatewayType" -> GatewayType.map { x => x.asInstanceOf[js.Any] },
        "GatewayOperationalState" -> GatewayOperationalState.map { x => x.asInstanceOf[js.Any] },
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GatewayInfo]
    }
  }

  /**
   * <p>JoinDomainInput</p>
   */
  @js.native
  trait JoinDomainInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var DomainName: js.UndefOr[DomainName]
    var UserName: js.UndefOr[DomainUserName]
    var Password: js.UndefOr[DomainUserPassword]
  }

  object JoinDomainInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      UserName: js.UndefOr[DomainUserName] = js.undefined,
      Password: js.UndefOr[DomainUserPassword] = js.undefined): JoinDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "UserName" -> UserName.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JoinDomainInput]
    }
  }

  /**
   * <p>JoinDomainOutput</p>
   */
  @js.native
  trait JoinDomainOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object JoinDomainOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): JoinDomainOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JoinDomainOutput]
    }
  }

  /**
   * <p>ListFileShareInput</p>
   */
  @js.native
  trait ListFileSharesInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  object ListFileSharesInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): ListFileSharesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFileSharesInput]
    }
  }

  /**
   * <p>ListFileShareOutput</p>
   */
  @js.native
  trait ListFileSharesOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var NextMarker: js.UndefOr[Marker]
    var FileShareInfoList: js.UndefOr[FileShareInfoList]
  }

  object ListFileSharesOutput {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined,
      FileShareInfoList: js.UndefOr[FileShareInfoList] = js.undefined): ListFileSharesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] },
        "FileShareInfoList" -> FileShareInfoList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFileSharesOutput]
    }
  }

  /**
   * <p>A JSON object containing zero or more of the following fields:</p> <ul> <li> <p> <a>ListGatewaysInput$Limit</a> </p> </li> <li> <p> <a>ListGatewaysInput$Marker</a> </p> </li> </ul>
   */
  @js.native
  trait ListGatewaysInput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var Limit: js.UndefOr[PositiveIntObject]
  }

  object ListGatewaysInput {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined): ListGatewaysInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGatewaysInput]
    }
  }

  @js.native
  trait ListGatewaysOutput extends js.Object {
    var Gateways: js.UndefOr[Gateways]
    var Marker: js.UndefOr[Marker]
  }

  object ListGatewaysOutput {
    def apply(
      Gateways: js.UndefOr[Gateways] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): ListGatewaysOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Gateways" -> Gateways.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGatewaysOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway.</p>
   */
  @js.native
  trait ListLocalDisksInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object ListLocalDisksInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): ListLocalDisksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocalDisksInput]
    }
  }

  @js.native
  trait ListLocalDisksOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Disks: js.UndefOr[Disks]
  }

  object ListLocalDisksOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Disks: js.UndefOr[Disks] = js.undefined): ListLocalDisksOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "Disks" -> Disks.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocalDisksOutput]
    }
  }

  /**
   * <p>ListTagsForResourceInput</p>
   */
  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var Marker: js.UndefOr[Marker]
    var Limit: js.UndefOr[PositiveIntObject]
  }

  object ListTagsForResourceInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined): ListTagsForResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceInput]
    }
  }

  /**
   * <p>ListTagsForResourceOutput</p>
   */
  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var Marker: js.UndefOr[Marker]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): ListTagsForResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /**
   * <p>A JSON object that contains one or more of the following fields:</p> <ul> <li> <p> <a>ListTapesInput$Limit</a> </p> </li> <li> <p> <a>ListTapesInput$Marker</a> </p> </li> <li> <p> <a>ListTapesInput$TapeARNs</a> </p> </li> </ul>
   */
  @js.native
  trait ListTapesInput extends js.Object {
    var TapeARNs: js.UndefOr[TapeARNs]
    var Marker: js.UndefOr[Marker]
    var Limit: js.UndefOr[PositiveIntObject]
  }

  object ListTapesInput {
    def apply(
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined): ListTapesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARNs" -> TapeARNs.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTapesInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p> <ul> <li> <p> <a>ListTapesOutput$Marker</a> </p> </li> <li> <p> <a>ListTapesOutput$VolumeInfos</a> </p> </li> </ul>
   */
  @js.native
  trait ListTapesOutput extends js.Object {
    var TapeInfos: js.UndefOr[TapeInfos]
    var Marker: js.UndefOr[Marker]
  }

  object ListTapesOutput {
    def apply(
      TapeInfos: js.UndefOr[TapeInfos] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): ListTapesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeInfos" -> TapeInfos.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTapesOutput]
    }
  }

  /**
   * <p>ListVolumeInitiatorsInput</p>
   */
  @js.native
  trait ListVolumeInitiatorsInput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object ListVolumeInitiatorsInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): ListVolumeInitiatorsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumeInitiatorsInput]
    }
  }

  /**
   * <p>ListVolumeInitiatorsOutput</p>
   */
  @js.native
  trait ListVolumeInitiatorsOutput extends js.Object {
    var Initiators: js.UndefOr[Initiators]
  }

  object ListVolumeInitiatorsOutput {
    def apply(
      Initiators: js.UndefOr[Initiators] = js.undefined): ListVolumeInitiatorsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Initiators" -> Initiators.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumeInitiatorsOutput]
    }
  }

  @js.native
  trait ListVolumeRecoveryPointsInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object ListVolumeRecoveryPointsInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): ListVolumeRecoveryPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumeRecoveryPointsInput]
    }
  }

  @js.native
  trait ListVolumeRecoveryPointsOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var VolumeRecoveryPointInfos: js.UndefOr[VolumeRecoveryPointInfos]
  }

  object ListVolumeRecoveryPointsOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      VolumeRecoveryPointInfos: js.UndefOr[VolumeRecoveryPointInfos] = js.undefined): ListVolumeRecoveryPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeRecoveryPointInfos" -> VolumeRecoveryPointInfos.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumeRecoveryPointsOutput]
    }
  }

  /**
   * <p>A JSON object that contains one or more of the following fields:</p> <ul> <li> <p> <a>ListVolumesInput$Limit</a> </p> </li> <li> <p> <a>ListVolumesInput$Marker</a> </p> </li> </ul>
   */
  @js.native
  trait ListVolumesInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Marker: js.UndefOr[Marker]
    var Limit: js.UndefOr[PositiveIntObject]
  }

  object ListVolumesInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined): ListVolumesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumesInput]
    }
  }

  @js.native
  trait ListVolumesOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Marker: js.UndefOr[Marker]
    var VolumeInfos: js.UndefOr[VolumeInfos]
  }

  object ListVolumesOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      VolumeInfos: js.UndefOr[VolumeInfos] = js.undefined): ListVolumesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "VolumeInfos" -> VolumeInfos.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumesOutput]
    }
  }

  /**
   * <p>Describes Network File System (NFS) file share default values. Files and folders stored as Amazon S3 objects in S3 buckets don't, by default, have Unix file permissions assigned to them. Upon discovery in an S3 bucket by Storage Gateway, the S3 objects that represent files and folders are assigned these default Unix permissions. This operation is only supported for file gateways.</p>
   */
  @js.native
  trait NFSFileShareDefaults extends js.Object {
    var FileMode: js.UndefOr[PermissionMode]
    var DirectoryMode: js.UndefOr[PermissionMode]
    var GroupId: js.UndefOr[PermissionId]
    var OwnerId: js.UndefOr[PermissionId]
  }

  object NFSFileShareDefaults {
    def apply(
      FileMode: js.UndefOr[PermissionMode] = js.undefined,
      DirectoryMode: js.UndefOr[PermissionMode] = js.undefined,
      GroupId: js.UndefOr[PermissionId] = js.undefined,
      OwnerId: js.UndefOr[PermissionId] = js.undefined): NFSFileShareDefaults = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileMode" -> FileMode.map { x => x.asInstanceOf[js.Any] },
        "DirectoryMode" -> DirectoryMode.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NFSFileShareDefaults]
    }
  }

  /**
   * <p>The Unix file permissions and ownership information assigned, by default, to native S3 objects when file gateway discovers them in S3 buckets. This operation is only supported in file gateways.</p>
   */
  @js.native
  trait NFSFileShareInfo extends js.Object {
    var Role: js.UndefOr[Role]
    var RequesterPays: js.UndefOr[Boolean]
    var Path: js.UndefOr[Path]
    var LocationARN: js.UndefOr[LocationARN]
    var GatewayARN: js.UndefOr[GatewayARN]
    var ObjectACL: js.UndefOr[ObjectACL]
    var FileShareStatus: js.UndefOr[FileShareStatus]
    var Squash: js.UndefOr[Squash]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var ReadOnly: js.UndefOr[Boolean]
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults]
    var FileShareARN: js.UndefOr[FileShareARN]
    var KMSEncrypted: js.UndefOr[boolean]
    var FileShareId: js.UndefOr[FileShareId]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var KMSKey: js.UndefOr[KMSKey]
    var ClientList: js.UndefOr[FileShareClientList]
  }

  object NFSFileShareInfo {
    def apply(
      Role: js.UndefOr[Role] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      Path: js.UndefOr[Path] = js.undefined,
      LocationARN: js.UndefOr[LocationARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined,
      Squash: js.UndefOr[Squash] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      KMSEncrypted: js.UndefOr[boolean] = js.undefined,
      FileShareId: js.UndefOr[FileShareId] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      ClientList: js.UndefOr[FileShareClientList] = js.undefined): NFSFileShareInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "LocationARN" -> LocationARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "FileShareStatus" -> FileShareStatus.map { x => x.asInstanceOf[js.Any] },
        "Squash" -> Squash.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "NFSFileShareDefaults" -> NFSFileShareDefaults.map { x => x.asInstanceOf[js.Any] },
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "FileShareId" -> FileShareId.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "ClientList" -> ClientList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NFSFileShareInfo]
    }
  }

  /**
   * <p>Describes a gateway's network interface.</p>
   */
  @js.native
  trait NetworkInterface extends js.Object {
    var Ipv4Address: js.UndefOr[string]
    var MacAddress: js.UndefOr[string]
    var Ipv6Address: js.UndefOr[string]
  }

  object NetworkInterface {
    def apply(
      Ipv4Address: js.UndefOr[string] = js.undefined,
      MacAddress: js.UndefOr[string] = js.undefined,
      Ipv6Address: js.UndefOr[string] = js.undefined): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv4Address" -> Ipv4Address.map { x => x.asInstanceOf[js.Any] },
        "MacAddress" -> MacAddress.map { x => x.asInstanceOf[js.Any] },
        "Ipv6Address" -> Ipv6Address.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
    }
  }

  @js.native
  trait NotifyWhenUploadedInput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object NotifyWhenUploadedInput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined): NotifyWhenUploadedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyWhenUploadedInput]
    }
  }

  @js.native
  trait NotifyWhenUploadedOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
    var NotificationId: js.UndefOr[NotificationId]
  }

  object NotifyWhenUploadedOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      NotificationId: js.UndefOr[NotificationId] = js.undefined): NotifyWhenUploadedOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "NotificationId" -> NotificationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NotifyWhenUploadedOutput]
    }
  }

  /**
   * <p>A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".</p>
   */
  object ObjectACLEnum {
    val `private` = "private"
    val `public-read` = "public-read"
    val `public-read-write` = "public-read-write"
    val `authenticated-read` = "authenticated-read"
    val `bucket-owner-read` = "bucket-owner-read"
    val `bucket-owner-full-control` = "bucket-owner-full-control"
    val `aws-exec-read` = "aws-exec-read"

    val values = IndexedSeq(`private`, `public-read`, `public-read-write`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`, `aws-exec-read`)
  }

  @js.native
  trait RefreshCacheInput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
    var FolderList: js.UndefOr[FolderList]
    var Recursive: js.UndefOr[Boolean]
  }

  object RefreshCacheInput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      FolderList: js.UndefOr[FolderList] = js.undefined,
      Recursive: js.UndefOr[Boolean] = js.undefined): RefreshCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "FolderList" -> FolderList.map { x => x.asInstanceOf[js.Any] },
        "Recursive" -> Recursive.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshCacheInput]
    }
  }

  /**
   * <p>RefreshCacheOutput</p>
   */
  @js.native
  trait RefreshCacheOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
    var NotificationId: js.UndefOr[NotificationId]
  }

  object RefreshCacheOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      NotificationId: js.UndefOr[NotificationId] = js.undefined): RefreshCacheOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "NotificationId" -> NotificationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshCacheOutput]
    }
  }

  /**
   * <p>RemoveTagsFromResourceInput</p>
   */
  @js.native
  trait RemoveTagsFromResourceInput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var TagKeys: js.UndefOr[TagKeys]
  }

  object RemoveTagsFromResourceInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      TagKeys: js.UndefOr[TagKeys] = js.undefined): RemoveTagsFromResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceInput]
    }
  }

  /**
   * <p>RemoveTagsFromResourceOutput</p>
   */
  @js.native
  trait RemoveTagsFromResourceOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object RemoveTagsFromResourceOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined): RemoveTagsFromResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceOutput]
    }
  }

  @js.native
  trait ResetCacheInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object ResetCacheInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): ResetCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetCacheInput]
    }
  }

  @js.native
  trait ResetCacheOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object ResetCacheOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): ResetCacheOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetCacheOutput]
    }
  }

  /**
   * <p>RetrieveTapeArchiveInput</p>
   */
  @js.native
  trait RetrieveTapeArchiveInput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object RetrieveTapeArchiveInput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): RetrieveTapeArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeArchiveInput]
    }
  }

  /**
   * <p>RetrieveTapeArchiveOutput</p>
   */
  @js.native
  trait RetrieveTapeArchiveOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object RetrieveTapeArchiveOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined): RetrieveTapeArchiveOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeArchiveOutput]
    }
  }

  /**
   * <p>RetrieveTapeRecoveryPointInput</p>
   */
  @js.native
  trait RetrieveTapeRecoveryPointInput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object RetrieveTapeRecoveryPointInput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): RetrieveTapeRecoveryPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeRecoveryPointInput]
    }
  }

  /**
   * <p>RetrieveTapeRecoveryPointOutput</p>
   */
  @js.native
  trait RetrieveTapeRecoveryPointOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object RetrieveTapeRecoveryPointOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined): RetrieveTapeRecoveryPointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeRecoveryPointOutput]
    }
  }

  /**
   * <p>The Windows file permissions and ownership information assigned, by default, to native S3 objects when file gateway discovers them in S3 buckets. This operation is only supported for file gateways.</p>
   */
  @js.native
  trait SMBFileShareInfo extends js.Object {
    var Authentication: js.UndefOr[Authentication]
    var Role: js.UndefOr[Role]
    var RequesterPays: js.UndefOr[Boolean]
    var InvalidUserList: js.UndefOr[FileShareUserList]
    var Path: js.UndefOr[Path]
    var ValidUserList: js.UndefOr[FileShareUserList]
    var LocationARN: js.UndefOr[LocationARN]
    var GatewayARN: js.UndefOr[GatewayARN]
    var ObjectACL: js.UndefOr[ObjectACL]
    var FileShareStatus: js.UndefOr[FileShareStatus]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var ReadOnly: js.UndefOr[Boolean]
    var FileShareARN: js.UndefOr[FileShareARN]
    var KMSEncrypted: js.UndefOr[boolean]
    var FileShareId: js.UndefOr[FileShareId]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object SMBFileShareInfo {
    def apply(
      Authentication: js.UndefOr[Authentication] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined,
      Path: js.UndefOr[Path] = js.undefined,
      ValidUserList: js.UndefOr[FileShareUserList] = js.undefined,
      LocationARN: js.UndefOr[LocationARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      KMSEncrypted: js.UndefOr[boolean] = js.undefined,
      FileShareId: js.UndefOr[FileShareId] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): SMBFileShareInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Authentication" -> Authentication.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "InvalidUserList" -> InvalidUserList.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "ValidUserList" -> ValidUserList.map { x => x.asInstanceOf[js.Any] },
        "LocationARN" -> LocationARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "FileShareStatus" -> FileShareStatus.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "FileShareId" -> FileShareId.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SMBFileShareInfo]
    }
  }

  /**
   * <p>SetLocalConsolePasswordInput</p>
   */
  @js.native
  trait SetLocalConsolePasswordInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var LocalConsolePassword: js.UndefOr[LocalConsolePassword]
  }

  object SetLocalConsolePasswordInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      LocalConsolePassword: js.UndefOr[LocalConsolePassword] = js.undefined): SetLocalConsolePasswordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "LocalConsolePassword" -> LocalConsolePassword.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLocalConsolePasswordInput]
    }
  }

  @js.native
  trait SetLocalConsolePasswordOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object SetLocalConsolePasswordOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): SetLocalConsolePasswordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLocalConsolePasswordOutput]
    }
  }

  /**
   * <p>SetSMBGuestPasswordInput</p>
   */
  @js.native
  trait SetSMBGuestPasswordInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Password: js.UndefOr[SMBGuestPassword]
  }

  object SetSMBGuestPasswordInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Password: js.UndefOr[SMBGuestPassword] = js.undefined): SetSMBGuestPasswordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "Password" -> Password.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSMBGuestPasswordInput]
    }
  }

  @js.native
  trait SetSMBGuestPasswordOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object SetSMBGuestPasswordOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): SetSMBGuestPasswordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSMBGuestPasswordOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway to shut down.</p>
   */
  @js.native
  trait ShutdownGatewayInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object ShutdownGatewayInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): ShutdownGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShutdownGatewayInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway that was shut down.</p>
   */
  @js.native
  trait ShutdownGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object ShutdownGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): ShutdownGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShutdownGatewayOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway to start.</p>
   */
  @js.native
  trait StartGatewayInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object StartGatewayInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): StartGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartGatewayInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway that was restarted.</p>
   */
  @js.native
  trait StartGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object StartGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): StartGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartGatewayOutput]
    }
  }

  /**
   * <p>Describes an iSCSI stored volume.</p>
   */
  @js.native
  trait StorediSCSIVolume extends js.Object {
    var VolumeType: js.UndefOr[VolumeType]
    var VolumeDiskId: js.UndefOr[DiskId]
    var CreatedDate: js.UndefOr[CreatedDate]
    var VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes]
    var VolumeId: js.UndefOr[VolumeId]
    var PreservedExistingData: js.UndefOr[boolean]
    var VolumeProgress: js.UndefOr[DoubleObject]
    var VolumeStatus: js.UndefOr[VolumeStatus]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes]
    var VolumeSizeInBytes: js.UndefOr[long]
    var SourceSnapshotId: js.UndefOr[SnapshotId]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object StorediSCSIVolume {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      VolumeDiskId: js.UndefOr[DiskId] = js.undefined,
      CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
      VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes] = js.undefined,
      VolumeId: js.UndefOr[VolumeId] = js.undefined,
      PreservedExistingData: js.UndefOr[boolean] = js.undefined,
      VolumeProgress: js.UndefOr[DoubleObject] = js.undefined,
      VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): StorediSCSIVolume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "VolumeDiskId" -> VolumeDiskId.map { x => x.asInstanceOf[js.Any] },
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "VolumeUsedInBytes" -> VolumeUsedInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "PreservedExistingData" -> PreservedExistingData.map { x => x.asInstanceOf[js.Any] },
        "VolumeProgress" -> VolumeProgress.map { x => x.asInstanceOf[js.Any] },
        "VolumeStatus" -> VolumeStatus.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeiSCSIAttributes" -> VolumeiSCSIAttributes.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "SourceSnapshotId" -> SourceSnapshotId.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorediSCSIVolume]
    }
  }

  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Describes a virtual tape object.</p>
   */
  @js.native
  trait Tape extends js.Object {
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeStatus]
    var VTLDevice: js.UndefOr[VTLDeviceARN]
    var TapeUsedInBytes: js.UndefOr[TapeUsage]
    var TapeCreatedDate: js.UndefOr[Time]
    var TapeBarcode: js.UndefOr[TapeBarcode]
    var TapeARN: js.UndefOr[TapeARN]
    var KMSKey: js.UndefOr[KMSKey]
    var Progress: js.UndefOr[DoubleObject]
  }

  object Tape {
    def apply(
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeStatus] = js.undefined,
      VTLDevice: js.UndefOr[VTLDeviceARN] = js.undefined,
      TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined,
      TapeCreatedDate: js.UndefOr[Time] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      Progress: js.UndefOr[DoubleObject] = js.undefined): Tape = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeSizeInBytes" -> TapeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeStatus" -> TapeStatus.map { x => x.asInstanceOf[js.Any] },
        "VTLDevice" -> VTLDevice.map { x => x.asInstanceOf[js.Any] },
        "TapeUsedInBytes" -> TapeUsedInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeCreatedDate" -> TapeCreatedDate.map { x => x.asInstanceOf[js.Any] },
        "TapeBarcode" -> TapeBarcode.map { x => x.asInstanceOf[js.Any] },
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tape]
    }
  }

  /**
   * <p>Represents a virtual tape that is archived in the virtual tape shelf (VTS).</p>
   */
  @js.native
  trait TapeArchive extends js.Object {
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeArchiveStatus]
    var TapeUsedInBytes: js.UndefOr[TapeUsage]
    var TapeCreatedDate: js.UndefOr[Time]
    var CompletionTime: js.UndefOr[Time]
    var TapeBarcode: js.UndefOr[TapeBarcode]
    var TapeARN: js.UndefOr[TapeARN]
    var KMSKey: js.UndefOr[KMSKey]
    var RetrievedTo: js.UndefOr[GatewayARN]
  }

  object TapeArchive {
    def apply(
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeArchiveStatus] = js.undefined,
      TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined,
      TapeCreatedDate: js.UndefOr[Time] = js.undefined,
      CompletionTime: js.UndefOr[Time] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      RetrievedTo: js.UndefOr[GatewayARN] = js.undefined): TapeArchive = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeSizeInBytes" -> TapeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeStatus" -> TapeStatus.map { x => x.asInstanceOf[js.Any] },
        "TapeUsedInBytes" -> TapeUsedInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeCreatedDate" -> TapeCreatedDate.map { x => x.asInstanceOf[js.Any] },
        "CompletionTime" -> CompletionTime.map { x => x.asInstanceOf[js.Any] },
        "TapeBarcode" -> TapeBarcode.map { x => x.asInstanceOf[js.Any] },
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "RetrievedTo" -> RetrievedTo.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TapeArchive]
    }
  }

  /**
   * <p>Describes a virtual tape.</p>
   */
  @js.native
  trait TapeInfo extends js.Object {
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeStatus]
    var GatewayARN: js.UndefOr[GatewayARN]
    var TapeBarcode: js.UndefOr[TapeBarcode]
    var TapeARN: js.UndefOr[TapeARN]
  }

  object TapeInfo {
    def apply(
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeStatus] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined): TapeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeSizeInBytes" -> TapeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeStatus" -> TapeStatus.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "TapeBarcode" -> TapeBarcode.map { x => x.asInstanceOf[js.Any] },
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TapeInfo]
    }
  }

  /**
   * <p>Describes a recovery point.</p>
   */
  @js.native
  trait TapeRecoveryPointInfo extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
    var TapeRecoveryPointTime: js.UndefOr[Time]
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeRecoveryPointStatus]
  }

  object TapeRecoveryPointInfo {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      TapeRecoveryPointTime: js.UndefOr[Time] = js.undefined,
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeRecoveryPointStatus] = js.undefined): TapeRecoveryPointInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] },
        "TapeRecoveryPointTime" -> TapeRecoveryPointTime.map { x => x.asInstanceOf[js.Any] },
        "TapeSizeInBytes" -> TapeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeStatus" -> TapeStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TapeRecoveryPointInfo]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec</a> </p> </li> <li> <p> <a>UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec</a> </p> </li> </ul>
   */
  @js.native
  trait UpdateBandwidthRateLimitInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit]
    var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit]
  }

  object UpdateBandwidthRateLimitInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined,
      AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined): UpdateBandwidthRateLimitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "AverageUploadRateLimitInBitsPerSec" -> AverageUploadRateLimitInBitsPerSec.map { x => x.asInstanceOf[js.Any] },
        "AverageDownloadRateLimitInBitsPerSec" -> AverageDownloadRateLimitInBitsPerSec.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBandwidthRateLimitInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway whose throttle information was updated.</p>
   */
  @js.native
  trait UpdateBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object UpdateBandwidthRateLimitOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): UpdateBandwidthRateLimitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBandwidthRateLimitOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>UpdateChapCredentialsInput$InitiatorName</a> </p> </li> <li> <p> <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a> </p> </li> <li> <p> <a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a> </p> </li> <li> <p> <a>UpdateChapCredentialsInput$TargetARN</a> </p> </li> </ul>
   */
  @js.native
  trait UpdateChapCredentialsInput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret]
    var InitiatorName: js.UndefOr[IqnName]
    var SecretToAuthenticateTarget: js.UndefOr[ChapSecret]
  }

  object UpdateChapCredentialsInput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined,
      SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined): UpdateChapCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] },
        "SecretToAuthenticateInitiator" -> SecretToAuthenticateInitiator.map { x => x.asInstanceOf[js.Any] },
        "InitiatorName" -> InitiatorName.map { x => x.asInstanceOf[js.Any] },
        "SecretToAuthenticateTarget" -> SecretToAuthenticateTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChapCredentialsInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait UpdateChapCredentialsOutput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var InitiatorName: js.UndefOr[IqnName]
  }

  object UpdateChapCredentialsOutput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined): UpdateChapCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] },
        "InitiatorName" -> InitiatorName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChapCredentialsOutput]
    }
  }

  @js.native
  trait UpdateGatewayInformationInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayName: js.UndefOr[GatewayName]
    var GatewayTimezone: js.UndefOr[GatewayTimezone]
  }

  object UpdateGatewayInformationInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayName: js.UndefOr[GatewayName] = js.undefined,
      GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined): UpdateGatewayInformationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayName" -> GatewayName.map { x => x.asInstanceOf[js.Any] },
        "GatewayTimezone" -> GatewayTimezone.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewayInformationInput]
    }
  }

  /**
   * <p>A JSON object containing the ARN of the gateway that was updated.</p>
   */
  @js.native
  trait UpdateGatewayInformationOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayName: js.UndefOr[string]
  }

  object UpdateGatewayInformationOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayName: js.UndefOr[string] = js.undefined): UpdateGatewayInformationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayName" -> GatewayName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewayInformationOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway to update.</p>
   */
  @js.native
  trait UpdateGatewaySoftwareNowInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object UpdateGatewaySoftwareNowInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): UpdateGatewaySoftwareNowInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewaySoftwareNowInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway that was updated.</p>
   */
  @js.native
  trait UpdateGatewaySoftwareNowOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object UpdateGatewaySoftwareNowOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): UpdateGatewaySoftwareNowOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewaySoftwareNowOutput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p> <ul> <li> <p> <a>UpdateMaintenanceStartTimeInput$DayOfWeek</a> </p> </li> <li> <p> <a>UpdateMaintenanceStartTimeInput$HourOfDay</a> </p> </li> <li> <p> <a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a> </p> </li> </ul>
   */
  @js.native
  trait UpdateMaintenanceStartTimeInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var HourOfDay: js.UndefOr[HourOfDay]
    var MinuteOfHour: js.UndefOr[MinuteOfHour]
    var DayOfWeek: js.UndefOr[DayOfWeek]
  }

  object UpdateMaintenanceStartTimeInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      HourOfDay: js.UndefOr[HourOfDay] = js.undefined,
      MinuteOfHour: js.UndefOr[MinuteOfHour] = js.undefined,
      DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined): UpdateMaintenanceStartTimeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "HourOfDay" -> HourOfDay.map { x => x.asInstanceOf[js.Any] },
        "MinuteOfHour" -> MinuteOfHour.map { x => x.asInstanceOf[js.Any] },
        "DayOfWeek" -> DayOfWeek.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceStartTimeInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway whose maintenance start time is updated.</p>
   */
  @js.native
  trait UpdateMaintenanceStartTimeOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object UpdateMaintenanceStartTimeOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): UpdateMaintenanceStartTimeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceStartTimeOutput]
    }
  }

  /**
   * <p>UpdateNFSFileShareInput</p>
   */
  @js.native
  trait UpdateNFSFileShareInput extends js.Object {
    var RequesterPays: js.UndefOr[Boolean]
    var ObjectACL: js.UndefOr[ObjectACL]
    var Squash: js.UndefOr[Squash]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var ReadOnly: js.UndefOr[Boolean]
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults]
    var FileShareARN: js.UndefOr[FileShareARN]
    var KMSEncrypted: js.UndefOr[Boolean]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var KMSKey: js.UndefOr[KMSKey]
    var ClientList: js.UndefOr[FileShareClientList]
  }

  object UpdateNFSFileShareInput {
    def apply(
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      Squash: js.UndefOr[Squash] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      ClientList: js.UndefOr[FileShareClientList] = js.undefined): UpdateNFSFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "Squash" -> Squash.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "NFSFileShareDefaults" -> NFSFileShareDefaults.map { x => x.asInstanceOf[js.Any] },
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "ClientList" -> ClientList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNFSFileShareInput]
    }
  }

  /**
   * <p>UpdateNFSFileShareOutput</p>
   */
  @js.native
  trait UpdateNFSFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object UpdateNFSFileShareOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined): UpdateNFSFileShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNFSFileShareOutput]
    }
  }

  /**
   * <p>UpdateSMBFileShareInput</p>
   */
  @js.native
  trait UpdateSMBFileShareInput extends js.Object {
    var RequesterPays: js.UndefOr[Boolean]
    var InvalidUserList: js.UndefOr[FileShareUserList]
    var ValidUserList: js.UndefOr[FileShareUserList]
    var ObjectACL: js.UndefOr[ObjectACL]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var ReadOnly: js.UndefOr[Boolean]
    var FileShareARN: js.UndefOr[FileShareARN]
    var KMSEncrypted: js.UndefOr[Boolean]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object UpdateSMBFileShareInput {
    def apply(
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined,
      ValidUserList: js.UndefOr[FileShareUserList] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): UpdateSMBFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "InvalidUserList" -> InvalidUserList.map { x => x.asInstanceOf[js.Any] },
        "ValidUserList" -> ValidUserList.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSMBFileShareInput]
    }
  }

  /**
   * <p>UpdateSMBFileShareOutput</p>
   */
  @js.native
  trait UpdateSMBFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object UpdateSMBFileShareOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined): UpdateSMBFileShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSMBFileShareOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>UpdateSnapshotScheduleInput$Description</a> </p> </li> <li> <p> <a>UpdateSnapshotScheduleInput$RecurrenceInHours</a> </p> </li> <li> <p> <a>UpdateSnapshotScheduleInput$StartAt</a> </p> </li> <li> <p> <a>UpdateSnapshotScheduleInput$VolumeARN</a> </p> </li> </ul>
   */
  @js.native
  trait UpdateSnapshotScheduleInput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var StartAt: js.UndefOr[HourOfDay]
    var RecurrenceInHours: js.UndefOr[RecurrenceInHours]
    var Description: js.UndefOr[Description]
  }

  object UpdateSnapshotScheduleInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      StartAt: js.UndefOr[HourOfDay] = js.undefined,
      RecurrenceInHours: js.UndefOr[RecurrenceInHours] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined): UpdateSnapshotScheduleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "StartAt" -> StartAt.map { x => x.asInstanceOf[js.Any] },
        "RecurrenceInHours" -> RecurrenceInHours.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSnapshotScheduleInput]
    }
  }

  /**
   * <p>A JSON object containing the of the updated storage volume.</p>
   */
  @js.native
  trait UpdateSnapshotScheduleOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object UpdateSnapshotScheduleOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): UpdateSnapshotScheduleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSnapshotScheduleOutput]
    }
  }

  @js.native
  trait UpdateVTLDeviceTypeInput extends js.Object {
    var VTLDeviceARN: js.UndefOr[VTLDeviceARN]
    var DeviceType: js.UndefOr[DeviceType]
  }

  object UpdateVTLDeviceTypeInput {
    def apply(
      VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined,
      DeviceType: js.UndefOr[DeviceType] = js.undefined): UpdateVTLDeviceTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VTLDeviceARN" -> VTLDeviceARN.map { x => x.asInstanceOf[js.Any] },
        "DeviceType" -> DeviceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVTLDeviceTypeInput]
    }
  }

  /**
   * <p>UpdateVTLDeviceTypeOutput</p>
   */
  @js.native
  trait UpdateVTLDeviceTypeOutput extends js.Object {
    var VTLDeviceARN: js.UndefOr[VTLDeviceARN]
  }

  object UpdateVTLDeviceTypeOutput {
    def apply(
      VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined): UpdateVTLDeviceTypeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VTLDeviceARN" -> VTLDeviceARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVTLDeviceTypeOutput]
    }
  }

  /**
   * <p>Represents a device object associated with a tape gateway.</p>
   */
  @js.native
  trait VTLDevice extends js.Object {
    var VTLDeviceType: js.UndefOr[VTLDeviceType]
    var VTLDeviceARN: js.UndefOr[VTLDeviceARN]
    var DeviceiSCSIAttributes: js.UndefOr[DeviceiSCSIAttributes]
    var VTLDeviceVendor: js.UndefOr[VTLDeviceVendor]
    var VTLDeviceProductIdentifier: js.UndefOr[VTLDeviceProductIdentifier]
  }

  object VTLDevice {
    def apply(
      VTLDeviceType: js.UndefOr[VTLDeviceType] = js.undefined,
      VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined,
      DeviceiSCSIAttributes: js.UndefOr[DeviceiSCSIAttributes] = js.undefined,
      VTLDeviceVendor: js.UndefOr[VTLDeviceVendor] = js.undefined,
      VTLDeviceProductIdentifier: js.UndefOr[VTLDeviceProductIdentifier] = js.undefined): VTLDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VTLDeviceType" -> VTLDeviceType.map { x => x.asInstanceOf[js.Any] },
        "VTLDeviceARN" -> VTLDeviceARN.map { x => x.asInstanceOf[js.Any] },
        "DeviceiSCSIAttributes" -> DeviceiSCSIAttributes.map { x => x.asInstanceOf[js.Any] },
        "VTLDeviceVendor" -> VTLDeviceVendor.map { x => x.asInstanceOf[js.Any] },
        "VTLDeviceProductIdentifier" -> VTLDeviceProductIdentifier.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VTLDevice]
    }
  }

  /**
   * <p>Describes a storage volume object.</p>
   */
  @js.native
  trait VolumeInfo extends js.Object {
    var VolumeType: js.UndefOr[VolumeType]
    var VolumeId: js.UndefOr[VolumeId]
    var GatewayARN: js.UndefOr[GatewayARN]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeSizeInBytes: js.UndefOr[long]
    var GatewayId: js.UndefOr[GatewayId]
  }

  object VolumeInfo {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      VolumeId: js.UndefOr[VolumeId] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      GatewayId: js.UndefOr[GatewayId] = js.undefined): VolumeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeInfo]
    }
  }

  @js.native
  trait VolumeRecoveryPointInfo extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeSizeInBytes: js.UndefOr[long]
    var VolumeUsageInBytes: js.UndefOr[long]
    var VolumeRecoveryPointTime: js.UndefOr[string]
  }

  object VolumeRecoveryPointInfo {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      VolumeUsageInBytes: js.UndefOr[long] = js.undefined,
      VolumeRecoveryPointTime: js.UndefOr[string] = js.undefined): VolumeRecoveryPointInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeUsageInBytes" -> VolumeUsageInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeRecoveryPointTime" -> VolumeRecoveryPointTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeRecoveryPointInfo]
    }
  }

  /**
   * <p>Lists iSCSI information about a volume.</p>
   */
  @js.native
  trait VolumeiSCSIAttributes extends js.Object {
    var LunNumber: js.UndefOr[PositiveIntObject]
    var ChapEnabled: js.UndefOr[boolean]
    var TargetARN: js.UndefOr[TargetARN]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NetworkInterfacePort: js.UndefOr[integer]
  }

  object VolumeiSCSIAttributes {
    def apply(
      LunNumber: js.UndefOr[PositiveIntObject] = js.undefined,
      ChapEnabled: js.UndefOr[boolean] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      NetworkInterfacePort: js.UndefOr[integer] = js.undefined): VolumeiSCSIAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LunNumber" -> LunNumber.map { x => x.asInstanceOf[js.Any] },
        "ChapEnabled" -> ChapEnabled.map { x => x.asInstanceOf[js.Any] },
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfacePort" -> NetworkInterfacePort.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeiSCSIAttributes]
    }
  }
}
