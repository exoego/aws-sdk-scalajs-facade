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
  type DiskAttribute = String
  type DiskAttributeList = js.Array[DiskAttribute]
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
  class StorageGateway() extends js.Object {
    def this(config: AWSConfig) = this()

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
   * A JSON object containing one or more of the following fields:
   * * ActivationKey
   *  * GatewayName
   *  * GatewayRegion
   *  * GatewayTimezone
   *  * GatewayType
   *  * TapeDriveType
   *  * MediumChangerType
   */
  @js.native
  trait ActivateGatewayInput extends js.Object {
    var ActivationKey: ActivationKey
    var GatewayName: GatewayName
    var GatewayRegion: RegionId
    var GatewayTimezone: GatewayTimezone
    var GatewayType: js.UndefOr[GatewayType]
    var MediumChangerType: js.UndefOr[MediumChangerType]
    var TapeDriveType: js.UndefOr[TapeDriveType]
  }

  object ActivateGatewayInput {
    def apply(
      ActivationKey: ActivationKey,
      GatewayName: GatewayName,
      GatewayRegion: RegionId,
      GatewayTimezone: GatewayTimezone,
      GatewayType: js.UndefOr[GatewayType] = js.undefined,
      MediumChangerType: js.UndefOr[MediumChangerType] = js.undefined,
      TapeDriveType: js.UndefOr[TapeDriveType] = js.undefined): ActivateGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActivationKey" -> ActivationKey.asInstanceOf[js.Any],
        "GatewayName" -> GatewayName.asInstanceOf[js.Any],
        "GatewayRegion" -> GatewayRegion.asInstanceOf[js.Any],
        "GatewayTimezone" -> GatewayTimezone.asInstanceOf[js.Any],
        "GatewayType" -> GatewayType.map { x => x.asInstanceOf[js.Any] },
        "MediumChangerType" -> MediumChangerType.map { x => x.asInstanceOf[js.Any] },
        "TapeDriveType" -> TapeDriveType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivateGatewayInput]
    }
  }

  /**
   * AWS Storage Gateway returns the Amazon Resource Name (ARN) of the activated gateway. It is a string made of information such as your account, gateway name, and region. This ARN is used to reference the gateway in other API operations as well as resource-based authorization.
   *
   * '''Note:'''For gateways activated prior to September 02, 2015, the gateway ARN contains the gateway name rather than the gateway ID. Changing the name of the gateway has no effect on the gateway ARN.
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
    var DiskIds: DiskIds
    var GatewayARN: GatewayARN
  }

  object AddCacheInput {
    def apply(
      DiskIds: DiskIds,
      GatewayARN: GatewayARN): AddCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DiskIds" -> DiskIds.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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

  @js.native
  trait AddTagsToResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var Tags: Tags
  }

  object AddTagsToResourceInput {
    def apply(
      ResourceARN: ResourceARN,
      Tags: Tags): AddTagsToResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceInput]
    }
  }

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
    var DiskIds: DiskIds
    var GatewayARN: GatewayARN
  }

  object AddUploadBufferInput {
    def apply(
      DiskIds: DiskIds,
      GatewayARN: GatewayARN): AddUploadBufferInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DiskIds" -> DiskIds.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * A JSON object containing one or more of the following fields:
   * * DiskIds
   */
  @js.native
  trait AddWorkingStorageInput extends js.Object {
    var DiskIds: DiskIds
    var GatewayARN: GatewayARN
  }

  object AddWorkingStorageInput {
    def apply(
      DiskIds: DiskIds,
      GatewayARN: GatewayARN): AddWorkingStorageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DiskIds" -> DiskIds.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddWorkingStorageInput]
    }
  }

  /**
   * A JSON object containing the of the gateway for which working storage was configured.
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
   * Describes an iSCSI cached volume.
   */
  @js.native
  trait CachediSCSIVolume extends js.Object {
    var CreatedDate: js.UndefOr[CreatedDate]
    var KMSKey: js.UndefOr[KMSKey]
    var SourceSnapshotId: js.UndefOr[SnapshotId]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeId: js.UndefOr[VolumeId]
    var VolumeProgress: js.UndefOr[DoubleObject]
    var VolumeSizeInBytes: js.UndefOr[long]
    var VolumeStatus: js.UndefOr[VolumeStatus]
    var VolumeType: js.UndefOr[VolumeType]
    var VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes]
    var VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes]
  }

  object CachediSCSIVolume {
    def apply(
      CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeId: js.UndefOr[VolumeId] = js.undefined,
      VolumeProgress: js.UndefOr[DoubleObject] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined,
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes] = js.undefined,
      VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined): CachediSCSIVolume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "SourceSnapshotId" -> SourceSnapshotId.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "VolumeProgress" -> VolumeProgress.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeStatus" -> VolumeStatus.map { x => x.asInstanceOf[js.Any] },
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "VolumeUsedInBytes" -> VolumeUsedInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeiSCSIAttributes" -> VolumeiSCSIAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CachediSCSIVolume]
    }
  }

  @js.native
  trait CancelArchivalInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  object CancelArchivalInput {
    def apply(
      GatewayARN: GatewayARN,
      TapeARN: TapeARN): CancelArchivalInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN" -> TapeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelArchivalInput]
    }
  }

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

  @js.native
  trait CancelRetrievalInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  object CancelRetrievalInput {
    def apply(
      GatewayARN: GatewayARN,
      TapeARN: TapeARN): CancelRetrievalInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN" -> TapeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelRetrievalInput]
    }
  }

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
   * Describes Challenge-Handshake Authentication Protocol (CHAP) information that supports authentication between your gateway and iSCSI initiators.
   */
  @js.native
  trait ChapInfo extends js.Object {
    var InitiatorName: js.UndefOr[IqnName]
    var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret]
    var SecretToAuthenticateTarget: js.UndefOr[ChapSecret]
    var TargetARN: js.UndefOr[TargetARN]
  }

  object ChapInfo {
    def apply(
      InitiatorName: js.UndefOr[IqnName] = js.undefined,
      SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.undefined,
      SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined): ChapInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitiatorName" -> InitiatorName.map { x => x.asInstanceOf[js.Any] },
        "SecretToAuthenticateInitiator" -> SecretToAuthenticateInitiator.map { x => x.asInstanceOf[js.Any] },
        "SecretToAuthenticateTarget" -> SecretToAuthenticateTarget.map { x => x.asInstanceOf[js.Any] },
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChapInfo]
    }
  }

  @js.native
  trait CreateCachediSCSIVolumeInput extends js.Object {
    var ClientToken: ClientToken
    var GatewayARN: GatewayARN
    var NetworkInterfaceId: NetworkInterfaceId
    var TargetName: TargetName
    var VolumeSizeInBytes: long
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var SnapshotId: js.UndefOr[SnapshotId]
    var SourceVolumeARN: js.UndefOr[VolumeARN]
  }

  object CreateCachediSCSIVolumeInput {
    def apply(
      ClientToken: ClientToken,
      GatewayARN: GatewayARN,
      NetworkInterfaceId: NetworkInterfaceId,
      TargetName: TargetName,
      VolumeSizeInBytes: long,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      SourceVolumeARN: js.UndefOr[VolumeARN] = js.undefined): CreateCachediSCSIVolumeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "NetworkInterfaceId" -> NetworkInterfaceId.asInstanceOf[js.Any],
        "TargetName" -> TargetName.asInstanceOf[js.Any],
        "VolumeSizeInBytes" -> VolumeSizeInBytes.asInstanceOf[js.Any],
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "SourceVolumeARN" -> SourceVolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCachediSCSIVolumeInput]
    }
  }

  @js.native
  trait CreateCachediSCSIVolumeOutput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object CreateCachediSCSIVolumeOutput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): CreateCachediSCSIVolumeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCachediSCSIVolumeOutput]
    }
  }

  @js.native
  trait CreateNFSFileShareInput extends js.Object {
    var ClientToken: ClientToken
    var GatewayARN: GatewayARN
    var LocationARN: LocationARN
    var Role: Role
    var ClientList: js.UndefOr[FileShareClientList]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults]
    var ObjectACL: js.UndefOr[ObjectACL]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var Squash: js.UndefOr[Squash]
  }

  object CreateNFSFileShareInput {
    def apply(
      ClientToken: ClientToken,
      GatewayARN: GatewayARN,
      LocationARN: LocationARN,
      Role: Role,
      ClientList: js.UndefOr[FileShareClientList] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      Squash: js.UndefOr[Squash] = js.undefined): CreateNFSFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "LocationARN" -> LocationARN.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any],
        "ClientList" -> ClientList.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "NFSFileShareDefaults" -> NFSFileShareDefaults.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "Squash" -> Squash.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNFSFileShareInput]
    }
  }

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

  @js.native
  trait CreateSMBFileShareInput extends js.Object {
    var ClientToken: ClientToken
    var GatewayARN: GatewayARN
    var LocationARN: LocationARN
    var Role: Role
    var Authentication: js.UndefOr[Authentication]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var InvalidUserList: js.UndefOr[FileShareUserList]
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var ObjectACL: js.UndefOr[ObjectACL]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var ValidUserList: js.UndefOr[FileShareUserList]
  }

  object CreateSMBFileShareInput {
    def apply(
      ClientToken: ClientToken,
      GatewayARN: GatewayARN,
      LocationARN: LocationARN,
      Role: Role,
      Authentication: js.UndefOr[Authentication] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      ValidUserList: js.UndefOr[FileShareUserList] = js.undefined): CreateSMBFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "LocationARN" -> LocationARN.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any],
        "Authentication" -> Authentication.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "InvalidUserList" -> InvalidUserList.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "ValidUserList" -> ValidUserList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSMBFileShareInput]
    }
  }

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
    var SnapshotDescription: SnapshotDescription
    var VolumeARN: VolumeARN
  }

  object CreateSnapshotFromVolumeRecoveryPointInput {
    def apply(
      SnapshotDescription: SnapshotDescription,
      VolumeARN: VolumeARN): CreateSnapshotFromVolumeRecoveryPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotDescription" -> SnapshotDescription.asInstanceOf[js.Any],
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * A JSON object containing one or more of the following fields:
   * * SnapshotDescription
   *  * VolumeARN
   */
  @js.native
  trait CreateSnapshotInput extends js.Object {
    var SnapshotDescription: SnapshotDescription
    var VolumeARN: VolumeARN
  }

  object CreateSnapshotInput {
    def apply(
      SnapshotDescription: SnapshotDescription,
      VolumeARN: VolumeARN): CreateSnapshotInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotDescription" -> SnapshotDescription.asInstanceOf[js.Any],
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotInput]
    }
  }

  /**
   * A JSON object containing the following fields:
   */
  @js.native
  trait CreateSnapshotOutput extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object CreateSnapshotOutput {
    def apply(
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): CreateSnapshotOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotOutput]
    }
  }

  /**
   * A JSON object containing one or more of the following fields:
   * * DiskId
   *  * NetworkInterfaceId
   *  * PreserveExistingData
   *  * SnapshotId
   *  * TargetName
   */
  @js.native
  trait CreateStorediSCSIVolumeInput extends js.Object {
    var DiskId: DiskId
    var GatewayARN: GatewayARN
    var NetworkInterfaceId: NetworkInterfaceId
    var PreserveExistingData: boolean
    var TargetName: TargetName
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object CreateStorediSCSIVolumeInput {
    def apply(
      DiskId: DiskId,
      GatewayARN: GatewayARN,
      NetworkInterfaceId: NetworkInterfaceId,
      PreserveExistingData: boolean,
      TargetName: TargetName,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined): CreateStorediSCSIVolumeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DiskId" -> DiskId.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "NetworkInterfaceId" -> NetworkInterfaceId.asInstanceOf[js.Any],
        "PreserveExistingData" -> PreserveExistingData.asInstanceOf[js.Any],
        "TargetName" -> TargetName.asInstanceOf[js.Any],
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "SnapshotId" -> SnapshotId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStorediSCSIVolumeInput]
    }
  }

  /**
   * A JSON object containing the following fields:
   */
  @js.native
  trait CreateStorediSCSIVolumeOutput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeSizeInBytes: js.UndefOr[long]
  }

  object CreateStorediSCSIVolumeOutput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined): CreateStorediSCSIVolumeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStorediSCSIVolumeOutput]
    }
  }

  @js.native
  trait CreateTapeWithBarcodeInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeBarcode: TapeBarcode
    var TapeSizeInBytes: TapeSize
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object CreateTapeWithBarcodeInput {
    def apply(
      GatewayARN: GatewayARN,
      TapeBarcode: TapeBarcode,
      TapeSizeInBytes: TapeSize,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): CreateTapeWithBarcodeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeBarcode" -> TapeBarcode.asInstanceOf[js.Any],
        "TapeSizeInBytes" -> TapeSizeInBytes.asInstanceOf[js.Any],
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapeWithBarcodeInput]
    }
  }

  /**
   * CreateTapeOutput
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

  @js.native
  trait CreateTapesInput extends js.Object {
    var ClientToken: ClientToken
    var GatewayARN: GatewayARN
    var NumTapesToCreate: NumTapesToCreate
    var TapeBarcodePrefix: TapeBarcodePrefix
    var TapeSizeInBytes: TapeSize
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
  }

  object CreateTapesInput {
    def apply(
      ClientToken: ClientToken,
      GatewayARN: GatewayARN,
      NumTapesToCreate: NumTapesToCreate,
      TapeBarcodePrefix: TapeBarcodePrefix,
      TapeSizeInBytes: TapeSize,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined): CreateTapesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "NumTapesToCreate" -> NumTapesToCreate.asInstanceOf[js.Any],
        "TapeBarcodePrefix" -> TapeBarcodePrefix.asInstanceOf[js.Any],
        "TapeSizeInBytes" -> TapeSizeInBytes.asInstanceOf[js.Any],
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapesInput]
    }
  }

  /**
   * CreateTapeOutput
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
   * A JSON object containing the following fields:
   * * BandwidthType
   */
  @js.native
  trait DeleteBandwidthRateLimitInput extends js.Object {
    var BandwidthType: BandwidthType
    var GatewayARN: GatewayARN
  }

  object DeleteBandwidthRateLimitInput {
    def apply(
      BandwidthType: BandwidthType,
      GatewayARN: GatewayARN): DeleteBandwidthRateLimitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BandwidthType" -> BandwidthType.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBandwidthRateLimitInput]
    }
  }

  /**
   * A JSON object containing the of the gateway whose bandwidth rate information was deleted.
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
   * A JSON object containing one or more of the following fields:
   * * InitiatorName
   *  * TargetARN
   */
  @js.native
  trait DeleteChapCredentialsInput extends js.Object {
    var InitiatorName: IqnName
    var TargetARN: TargetARN
  }

  object DeleteChapCredentialsInput {
    def apply(
      InitiatorName: IqnName,
      TargetARN: TargetARN): DeleteChapCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitiatorName" -> InitiatorName.asInstanceOf[js.Any],
        "TargetARN" -> TargetARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChapCredentialsInput]
    }
  }

  /**
   * A JSON object containing the following fields:
   */
  @js.native
  trait DeleteChapCredentialsOutput extends js.Object {
    var InitiatorName: js.UndefOr[IqnName]
    var TargetARN: js.UndefOr[TargetARN]
  }

  object DeleteChapCredentialsOutput {
    def apply(
      InitiatorName: js.UndefOr[IqnName] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined): DeleteChapCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitiatorName" -> InitiatorName.map { x => x.asInstanceOf[js.Any] },
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChapCredentialsOutput]
    }
  }

  @js.native
  trait DeleteFileShareInput extends js.Object {
    var FileShareARN: FileShareARN
    var ForceDelete: js.UndefOr[boolean]
  }

  object DeleteFileShareInput {
    def apply(
      FileShareARN: FileShareARN,
      ForceDelete: js.UndefOr[boolean] = js.undefined): DeleteFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any],
        "ForceDelete" -> ForceDelete.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileShareInput]
    }
  }

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
   * A JSON object containing the ID of the gateway to delete.
   */
  @js.native
  trait DeleteGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DeleteGatewayInput {
    def apply(
      GatewayARN: GatewayARN): DeleteGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGatewayInput]
    }
  }

  /**
   * A JSON object containing the ID of the deleted gateway.
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
    var VolumeARN: VolumeARN
  }

  object DeleteSnapshotScheduleInput {
    def apply(
      VolumeARN: VolumeARN): DeleteSnapshotScheduleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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

  @js.native
  trait DeleteTapeArchiveInput extends js.Object {
    var TapeARN: TapeARN
  }

  object DeleteTapeArchiveInput {
    def apply(
      TapeARN: TapeARN): DeleteTapeArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TapeARN" -> TapeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeArchiveInput]
    }
  }

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

  @js.native
  trait DeleteTapeInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  object DeleteTapeInput {
    def apply(
      GatewayARN: GatewayARN,
      TapeARN: TapeARN): DeleteTapeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN" -> TapeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeInput]
    }
  }

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
   * A JSON object containing the VolumeARN to delete.
   */
  @js.native
  trait DeleteVolumeInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object DeleteVolumeInput {
    def apply(
      VolumeARN: VolumeARN): DeleteVolumeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVolumeInput]
    }
  }

  /**
   * A JSON object containing the of the storage volume that was deleted
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
   * A JSON object containing the of the gateway.
   */
  @js.native
  trait DescribeBandwidthRateLimitInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeBandwidthRateLimitInput {
    def apply(
      GatewayARN: GatewayARN): DescribeBandwidthRateLimitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBandwidthRateLimitInput]
    }
  }

  /**
   * A JSON object containing the following fields:
   */
  @js.native
  trait DescribeBandwidthRateLimitOutput extends js.Object {
    var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit]
    var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeBandwidthRateLimitOutput {
    def apply(
      AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined,
      AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DescribeBandwidthRateLimitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AverageDownloadRateLimitInBitsPerSec" -> AverageDownloadRateLimitInBitsPerSec.map { x => x.asInstanceOf[js.Any] },
        "AverageUploadRateLimitInBitsPerSec" -> AverageUploadRateLimitInBitsPerSec.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBandwidthRateLimitOutput]
    }
  }

  @js.native
  trait DescribeCacheInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeCacheInput {
    def apply(
      GatewayARN: GatewayARN): DescribeCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheInput]
    }
  }

  @js.native
  trait DescribeCacheOutput extends js.Object {
    var CacheAllocatedInBytes: js.UndefOr[long]
    var CacheDirtyPercentage: js.UndefOr[double]
    var CacheHitPercentage: js.UndefOr[double]
    var CacheMissPercentage: js.UndefOr[double]
    var CacheUsedPercentage: js.UndefOr[double]
    var DiskIds: js.UndefOr[DiskIds]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeCacheOutput {
    def apply(
      CacheAllocatedInBytes: js.UndefOr[long] = js.undefined,
      CacheDirtyPercentage: js.UndefOr[double] = js.undefined,
      CacheHitPercentage: js.UndefOr[double] = js.undefined,
      CacheMissPercentage: js.UndefOr[double] = js.undefined,
      CacheUsedPercentage: js.UndefOr[double] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): DescribeCacheOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CacheAllocatedInBytes" -> CacheAllocatedInBytes.map { x => x.asInstanceOf[js.Any] },
        "CacheDirtyPercentage" -> CacheDirtyPercentage.map { x => x.asInstanceOf[js.Any] },
        "CacheHitPercentage" -> CacheHitPercentage.map { x => x.asInstanceOf[js.Any] },
        "CacheMissPercentage" -> CacheMissPercentage.map { x => x.asInstanceOf[js.Any] },
        "CacheUsedPercentage" -> CacheUsedPercentage.map { x => x.asInstanceOf[js.Any] },
        "DiskIds" -> DiskIds.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheOutput]
    }
  }

  @js.native
  trait DescribeCachediSCSIVolumesInput extends js.Object {
    var VolumeARNs: VolumeARNs
  }

  object DescribeCachediSCSIVolumesInput {
    def apply(
      VolumeARNs: VolumeARNs): DescribeCachediSCSIVolumesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARNs" -> VolumeARNs.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCachediSCSIVolumesInput]
    }
  }

  /**
   * A JSON object containing the following fields:
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
   * A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target.
   */
  @js.native
  trait DescribeChapCredentialsInput extends js.Object {
    var TargetARN: TargetARN
  }

  object DescribeChapCredentialsInput {
    def apply(
      TargetARN: TargetARN): DescribeChapCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetARN" -> TargetARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChapCredentialsInput]
    }
  }

  /**
   * A JSON object containing a .
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
   * A JSON object containing the ID of the gateway.
   */
  @js.native
  trait DescribeGatewayInformationInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeGatewayInformationInput {
    def apply(
      GatewayARN: GatewayARN): DescribeGatewayInformationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGatewayInformationInput]
    }
  }

  /**
   * A JSON object containing the following fields:
   */
  @js.native
  trait DescribeGatewayInformationOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayId: js.UndefOr[GatewayId]
    var GatewayName: js.UndefOr[string]
    var GatewayNetworkInterfaces: js.UndefOr[GatewayNetworkInterfaces]
    var GatewayState: js.UndefOr[GatewayState]
    var GatewayTimezone: js.UndefOr[GatewayTimezone]
    var GatewayType: js.UndefOr[GatewayType]
    var LastSoftwareUpdate: js.UndefOr[LastSoftwareUpdate]
    var NextUpdateAvailabilityDate: js.UndefOr[NextUpdateAvailabilityDate]
  }

  object DescribeGatewayInformationOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayId: js.UndefOr[GatewayId] = js.undefined,
      GatewayName: js.UndefOr[string] = js.undefined,
      GatewayNetworkInterfaces: js.UndefOr[GatewayNetworkInterfaces] = js.undefined,
      GatewayState: js.UndefOr[GatewayState] = js.undefined,
      GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined,
      GatewayType: js.UndefOr[GatewayType] = js.undefined,
      LastSoftwareUpdate: js.UndefOr[LastSoftwareUpdate] = js.undefined,
      NextUpdateAvailabilityDate: js.UndefOr[NextUpdateAvailabilityDate] = js.undefined): DescribeGatewayInformationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] },
        "GatewayName" -> GatewayName.map { x => x.asInstanceOf[js.Any] },
        "GatewayNetworkInterfaces" -> GatewayNetworkInterfaces.map { x => x.asInstanceOf[js.Any] },
        "GatewayState" -> GatewayState.map { x => x.asInstanceOf[js.Any] },
        "GatewayTimezone" -> GatewayTimezone.map { x => x.asInstanceOf[js.Any] },
        "GatewayType" -> GatewayType.map { x => x.asInstanceOf[js.Any] },
        "LastSoftwareUpdate" -> LastSoftwareUpdate.map { x => x.asInstanceOf[js.Any] },
        "NextUpdateAvailabilityDate" -> NextUpdateAvailabilityDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGatewayInformationOutput]
    }
  }

  /**
   * A JSON object containing the of the gateway.
   */
  @js.native
  trait DescribeMaintenanceStartTimeInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeMaintenanceStartTimeInput {
    def apply(
      GatewayARN: GatewayARN): DescribeMaintenanceStartTimeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceStartTimeInput]
    }
  }

  /**
   * A JSON object containing the following fields:
   * * DayOfWeek
   *  * HourOfDay
   *  * MinuteOfHour
   *  * Timezone
   */
  @js.native
  trait DescribeMaintenanceStartTimeOutput extends js.Object {
    var DayOfWeek: js.UndefOr[DayOfWeek]
    var GatewayARN: js.UndefOr[GatewayARN]
    var HourOfDay: js.UndefOr[HourOfDay]
    var MinuteOfHour: js.UndefOr[MinuteOfHour]
    var Timezone: js.UndefOr[GatewayTimezone]
  }

  object DescribeMaintenanceStartTimeOutput {
    def apply(
      DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      HourOfDay: js.UndefOr[HourOfDay] = js.undefined,
      MinuteOfHour: js.UndefOr[MinuteOfHour] = js.undefined,
      Timezone: js.UndefOr[GatewayTimezone] = js.undefined): DescribeMaintenanceStartTimeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DayOfWeek" -> DayOfWeek.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "HourOfDay" -> HourOfDay.map { x => x.asInstanceOf[js.Any] },
        "MinuteOfHour" -> MinuteOfHour.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceStartTimeOutput]
    }
  }

  @js.native
  trait DescribeNFSFileSharesInput extends js.Object {
    var FileShareARNList: FileShareARNList
  }

  object DescribeNFSFileSharesInput {
    def apply(
      FileShareARNList: FileShareARNList): DescribeNFSFileSharesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARNList" -> FileShareARNList.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNFSFileSharesInput]
    }
  }

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

  @js.native
  trait DescribeSMBFileSharesInput extends js.Object {
    var FileShareARNList: FileShareARNList
  }

  object DescribeSMBFileSharesInput {
    def apply(
      FileShareARNList: FileShareARNList): DescribeSMBFileSharesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARNList" -> FileShareARNList.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSMBFileSharesInput]
    }
  }

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
    var GatewayARN: GatewayARN
  }

  object DescribeSMBSettingsInput {
    def apply(
      GatewayARN: GatewayARN): DescribeSMBSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSMBSettingsInput]
    }
  }

  @js.native
  trait DescribeSMBSettingsOutput extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var GatewayARN: js.UndefOr[GatewayARN]
    var SMBGuestPasswordSet: js.UndefOr[Boolean]
  }

  object DescribeSMBSettingsOutput {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined): DescribeSMBSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "SMBGuestPasswordSet" -> SMBGuestPasswordSet.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSMBSettingsOutput]
    }
  }

  /**
   * A JSON object containing the VolumeARN of the volume.
   */
  @js.native
  trait DescribeSnapshotScheduleInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object DescribeSnapshotScheduleInput {
    def apply(
      VolumeARN: VolumeARN): DescribeSnapshotScheduleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotScheduleInput]
    }
  }

  @js.native
  trait DescribeSnapshotScheduleOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var RecurrenceInHours: js.UndefOr[RecurrenceInHours]
    var StartAt: js.UndefOr[HourOfDay]
    var Timezone: js.UndefOr[GatewayTimezone]
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DescribeSnapshotScheduleOutput {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      RecurrenceInHours: js.UndefOr[RecurrenceInHours] = js.undefined,
      StartAt: js.UndefOr[HourOfDay] = js.undefined,
      Timezone: js.UndefOr[GatewayTimezone] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined): DescribeSnapshotScheduleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "RecurrenceInHours" -> RecurrenceInHours.map { x => x.asInstanceOf[js.Any] },
        "StartAt" -> StartAt.map { x => x.asInstanceOf[js.Any] },
        "Timezone" -> Timezone.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotScheduleOutput]
    }
  }

  /**
   * A JSON object containing a list of VolumeARNs.
   */
  @js.native
  trait DescribeStorediSCSIVolumesInput extends js.Object {
    var VolumeARNs: VolumeARNs
  }

  object DescribeStorediSCSIVolumesInput {
    def apply(
      VolumeARNs: VolumeARNs): DescribeStorediSCSIVolumesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARNs" -> VolumeARNs.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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

  @js.native
  trait DescribeTapeArchivesInput extends js.Object {
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
    var TapeARNs: js.UndefOr[TapeARNs]
  }

  object DescribeTapeArchivesInput {
    def apply(
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined): DescribeTapeArchivesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "TapeARNs" -> TapeARNs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeArchivesInput]
    }
  }

  @js.native
  trait DescribeTapeArchivesOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var TapeArchives: js.UndefOr[TapeArchives]
  }

  object DescribeTapeArchivesOutput {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      TapeArchives: js.UndefOr[TapeArchives] = js.undefined): DescribeTapeArchivesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "TapeArchives" -> TapeArchives.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeArchivesOutput]
    }
  }

  @js.native
  trait DescribeTapeRecoveryPointsInput extends js.Object {
    var GatewayARN: GatewayARN
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  object DescribeTapeRecoveryPointsInput {
    def apply(
      GatewayARN: GatewayARN,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): DescribeTapeRecoveryPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeRecoveryPointsInput]
    }
  }

  @js.native
  trait DescribeTapeRecoveryPointsOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Marker: js.UndefOr[Marker]
    var TapeRecoveryPointInfos: js.UndefOr[TapeRecoveryPointInfos]
  }

  object DescribeTapeRecoveryPointsOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      TapeRecoveryPointInfos: js.UndefOr[TapeRecoveryPointInfos] = js.undefined): DescribeTapeRecoveryPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "TapeRecoveryPointInfos" -> TapeRecoveryPointInfos.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeRecoveryPointsOutput]
    }
  }

  @js.native
  trait DescribeTapesInput extends js.Object {
    var GatewayARN: GatewayARN
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
    var TapeARNs: js.UndefOr[TapeARNs]
  }

  object DescribeTapesInput {
    def apply(
      GatewayARN: GatewayARN,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined): DescribeTapesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "TapeARNs" -> TapeARNs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapesInput]
    }
  }

  @js.native
  trait DescribeTapesOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var Tapes: js.UndefOr[Tapes]
  }

  object DescribeTapesOutput {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      Tapes: js.UndefOr[Tapes] = js.undefined): DescribeTapesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "Tapes" -> Tapes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapesOutput]
    }
  }

  @js.native
  trait DescribeUploadBufferInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeUploadBufferInput {
    def apply(
      GatewayARN: GatewayARN): DescribeUploadBufferInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUploadBufferInput]
    }
  }

  @js.native
  trait DescribeUploadBufferOutput extends js.Object {
    var DiskIds: js.UndefOr[DiskIds]
    var GatewayARN: js.UndefOr[GatewayARN]
    var UploadBufferAllocatedInBytes: js.UndefOr[long]
    var UploadBufferUsedInBytes: js.UndefOr[long]
  }

  object DescribeUploadBufferOutput {
    def apply(
      DiskIds: js.UndefOr[DiskIds] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      UploadBufferAllocatedInBytes: js.UndefOr[long] = js.undefined,
      UploadBufferUsedInBytes: js.UndefOr[long] = js.undefined): DescribeUploadBufferOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DiskIds" -> DiskIds.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "UploadBufferAllocatedInBytes" -> UploadBufferAllocatedInBytes.map { x => x.asInstanceOf[js.Any] },
        "UploadBufferUsedInBytes" -> UploadBufferUsedInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUploadBufferOutput]
    }
  }

  @js.native
  trait DescribeVTLDevicesInput extends js.Object {
    var GatewayARN: GatewayARN
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
    var VTLDeviceARNs: js.UndefOr[VTLDeviceARNs]
  }

  object DescribeVTLDevicesInput {
    def apply(
      GatewayARN: GatewayARN,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      VTLDeviceARNs: js.UndefOr[VTLDeviceARNs] = js.undefined): DescribeVTLDevicesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "VTLDeviceARNs" -> VTLDeviceARNs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVTLDevicesInput]
    }
  }

  @js.native
  trait DescribeVTLDevicesOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Marker: js.UndefOr[Marker]
    var VTLDevices: js.UndefOr[VTLDevices]
  }

  object DescribeVTLDevicesOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      VTLDevices: js.UndefOr[VTLDevices] = js.undefined): DescribeVTLDevicesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "VTLDevices" -> VTLDevices.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVTLDevicesOutput]
    }
  }

  /**
   * A JSON object containing the of the gateway.
   */
  @js.native
  trait DescribeWorkingStorageInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeWorkingStorageInput {
    def apply(
      GatewayARN: GatewayARN): DescribeWorkingStorageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkingStorageInput]
    }
  }

  /**
   * A JSON object containing the following fields:
   */
  @js.native
  trait DescribeWorkingStorageOutput extends js.Object {
    var DiskIds: js.UndefOr[DiskIds]
    var GatewayARN: js.UndefOr[GatewayARN]
    var WorkingStorageAllocatedInBytes: js.UndefOr[long]
    var WorkingStorageUsedInBytes: js.UndefOr[long]
  }

  object DescribeWorkingStorageOutput {
    def apply(
      DiskIds: js.UndefOr[DiskIds] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.undefined,
      WorkingStorageUsedInBytes: js.UndefOr[long] = js.undefined): DescribeWorkingStorageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DiskIds" -> DiskIds.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "WorkingStorageAllocatedInBytes" -> WorkingStorageAllocatedInBytes.map { x => x.asInstanceOf[js.Any] },
        "WorkingStorageUsedInBytes" -> WorkingStorageUsedInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkingStorageOutput]
    }
  }

  /**
   * Lists iSCSI information about a VTL device.
   */
  @js.native
  trait DeviceiSCSIAttributes extends js.Object {
    var ChapEnabled: js.UndefOr[boolean]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NetworkInterfacePort: js.UndefOr[integer]
    var TargetARN: js.UndefOr[TargetARN]
  }

  object DeviceiSCSIAttributes {
    def apply(
      ChapEnabled: js.UndefOr[boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      NetworkInterfacePort: js.UndefOr[integer] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined): DeviceiSCSIAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChapEnabled" -> ChapEnabled.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfacePort" -> NetworkInterfacePort.map { x => x.asInstanceOf[js.Any] },
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceiSCSIAttributes]
    }
  }

  @js.native
  trait DisableGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DisableGatewayInput {
    def apply(
      GatewayARN: GatewayARN): DisableGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableGatewayInput]
    }
  }

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

  /**
   * Represents a gateway's local disk.
   */
  @js.native
  trait Disk extends js.Object {
    var DiskAllocationResource: js.UndefOr[string]
    var DiskAllocationType: js.UndefOr[DiskAllocationType]
    var DiskAttributeList: js.UndefOr[DiskAttributeList]
    var DiskId: js.UndefOr[DiskId]
    var DiskNode: js.UndefOr[string]
    var DiskPath: js.UndefOr[string]
    var DiskSizeInBytes: js.UndefOr[long]
    var DiskStatus: js.UndefOr[string]
  }

  object Disk {
    def apply(
      DiskAllocationResource: js.UndefOr[string] = js.undefined,
      DiskAllocationType: js.UndefOr[DiskAllocationType] = js.undefined,
      DiskAttributeList: js.UndefOr[DiskAttributeList] = js.undefined,
      DiskId: js.UndefOr[DiskId] = js.undefined,
      DiskNode: js.UndefOr[string] = js.undefined,
      DiskPath: js.UndefOr[string] = js.undefined,
      DiskSizeInBytes: js.UndefOr[long] = js.undefined,
      DiskStatus: js.UndefOr[string] = js.undefined): Disk = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DiskAllocationResource" -> DiskAllocationResource.map { x => x.asInstanceOf[js.Any] },
        "DiskAllocationType" -> DiskAllocationType.map { x => x.asInstanceOf[js.Any] },
        "DiskAttributeList" -> DiskAttributeList.map { x => x.asInstanceOf[js.Any] },
        "DiskId" -> DiskId.map { x => x.asInstanceOf[js.Any] },
        "DiskNode" -> DiskNode.map { x => x.asInstanceOf[js.Any] },
        "DiskPath" -> DiskPath.map { x => x.asInstanceOf[js.Any] },
        "DiskSizeInBytes" -> DiskSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "DiskStatus" -> DiskStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Disk]
    }
  }

  /**
   * Describes a file share.
   */
  @js.native
  trait FileShareInfo extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
    var FileShareId: js.UndefOr[FileShareId]
    var FileShareStatus: js.UndefOr[FileShareStatus]
    var FileShareType: js.UndefOr[FileShareType]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object FileShareInfo {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      FileShareId: js.UndefOr[FileShareId] = js.undefined,
      FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined,
      FileShareType: js.UndefOr[FileShareType] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): FileShareInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "FileShareId" -> FileShareId.map { x => x.asInstanceOf[js.Any] },
        "FileShareStatus" -> FileShareStatus.map { x => x.asInstanceOf[js.Any] },
        "FileShareType" -> FileShareType.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileShareInfo]
    }
  }

  /**
   * The type of the file share.
   */
  object FileShareTypeEnum {
    val NFS = "NFS"
    val SMB = "SMB"

    val values = IndexedSeq(NFS, SMB)
  }

  /**
   * Describes a gateway object.
   */
  @js.native
  trait GatewayInfo extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayId: js.UndefOr[GatewayId]
    var GatewayName: js.UndefOr[string]
    var GatewayOperationalState: js.UndefOr[GatewayOperationalState]
    var GatewayType: js.UndefOr[GatewayType]
  }

  object GatewayInfo {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayId: js.UndefOr[GatewayId] = js.undefined,
      GatewayName: js.UndefOr[string] = js.undefined,
      GatewayOperationalState: js.UndefOr[GatewayOperationalState] = js.undefined,
      GatewayType: js.UndefOr[GatewayType] = js.undefined): GatewayInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] },
        "GatewayName" -> GatewayName.map { x => x.asInstanceOf[js.Any] },
        "GatewayOperationalState" -> GatewayOperationalState.map { x => x.asInstanceOf[js.Any] },
        "GatewayType" -> GatewayType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GatewayInfo]
    }
  }

  @js.native
  trait JoinDomainInput extends js.Object {
    var DomainName: DomainName
    var GatewayARN: GatewayARN
    var Password: DomainUserPassword
    var UserName: DomainUserName
  }

  object JoinDomainInput {
    def apply(
      DomainName: DomainName,
      GatewayARN: GatewayARN,
      Password: DomainUserPassword,
      UserName: DomainUserName): JoinDomainInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JoinDomainInput]
    }
  }

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
   * ListFileShareInput
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
   * ListFileShareOutput
   */
  @js.native
  trait ListFileSharesOutput extends js.Object {
    var FileShareInfoList: js.UndefOr[FileShareInfoList]
    var Marker: js.UndefOr[Marker]
    var NextMarker: js.UndefOr[Marker]
  }

  object ListFileSharesOutput {
    def apply(
      FileShareInfoList: js.UndefOr[FileShareInfoList] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined): ListFileSharesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareInfoList" -> FileShareInfoList.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "NextMarker" -> NextMarker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFileSharesOutput]
    }
  }

  /**
   * A JSON object containing zero or more of the following fields:
   * * Limit
   *  * Marker
   */
  @js.native
  trait ListGatewaysInput extends js.Object {
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  object ListGatewaysInput {
    def apply(
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): ListGatewaysInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * A JSON object containing the of the gateway.
   */
  @js.native
  trait ListLocalDisksInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ListLocalDisksInput {
    def apply(
      GatewayARN: GatewayARN): ListLocalDisksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocalDisksInput]
    }
  }

  @js.native
  trait ListLocalDisksOutput extends js.Object {
    var Disks: js.UndefOr[Disks]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object ListLocalDisksOutput {
    def apply(
      Disks: js.UndefOr[Disks] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined): ListLocalDisksOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Disks" -> Disks.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocalDisksOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  object ListTagsForResourceInput {
    def apply(
      ResourceARN: ResourceARN,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): ListTagsForResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceOutput {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): ListTagsForResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /**
   * A JSON object that contains one or more of the following fields:
   * * Limit
   *  * Marker
   *  * TapeARNs
   */
  @js.native
  trait ListTapesInput extends js.Object {
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
    var TapeARNs: js.UndefOr[TapeARNs]
  }

  object ListTapesInput {
    def apply(
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined): ListTapesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "TapeARNs" -> TapeARNs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTapesInput]
    }
  }

  /**
   * A JSON object containing the following fields:
   * * Marker
   *  * VolumeInfos
   */
  @js.native
  trait ListTapesOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var TapeInfos: js.UndefOr[TapeInfos]
  }

  object ListTapesOutput {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      TapeInfos: js.UndefOr[TapeInfos] = js.undefined): ListTapesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] },
        "TapeInfos" -> TapeInfos.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTapesOutput]
    }
  }

  @js.native
  trait ListVolumeInitiatorsInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object ListVolumeInitiatorsInput {
    def apply(
      VolumeARN: VolumeARN): ListVolumeInitiatorsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumeInitiatorsInput]
    }
  }

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
    var GatewayARN: GatewayARN
  }

  object ListVolumeRecoveryPointsInput {
    def apply(
      GatewayARN: GatewayARN): ListVolumeRecoveryPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * A JSON object that contains one or more of the following fields:
   * * Limit
   *  * Marker
   */
  @js.native
  trait ListVolumesInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  object ListVolumesInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined): ListVolumesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "Limit" -> Limit.map { x => x.asInstanceOf[js.Any] },
        "Marker" -> Marker.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
   * Describes Network File System (NFS) file share default values. Files and folders stored as Amazon S3 objects in S3 buckets don't, by default, have Unix file permissions assigned to them. Upon discovery in an S3 bucket by Storage Gateway, the S3 objects that represent files and folders are assigned these default Unix permissions. This operation is only supported for file gateways.
   */
  @js.native
  trait NFSFileShareDefaults extends js.Object {
    var DirectoryMode: js.UndefOr[PermissionMode]
    var FileMode: js.UndefOr[PermissionMode]
    var GroupId: js.UndefOr[PermissionId]
    var OwnerId: js.UndefOr[PermissionId]
  }

  object NFSFileShareDefaults {
    def apply(
      DirectoryMode: js.UndefOr[PermissionMode] = js.undefined,
      FileMode: js.UndefOr[PermissionMode] = js.undefined,
      GroupId: js.UndefOr[PermissionId] = js.undefined,
      OwnerId: js.UndefOr[PermissionId] = js.undefined): NFSFileShareDefaults = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DirectoryMode" -> DirectoryMode.map { x => x.asInstanceOf[js.Any] },
        "FileMode" -> FileMode.map { x => x.asInstanceOf[js.Any] },
        "GroupId" -> GroupId.map { x => x.asInstanceOf[js.Any] },
        "OwnerId" -> OwnerId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NFSFileShareDefaults]
    }
  }

  /**
   * The Unix file permissions and ownership information assigned, by default, to native S3 objects when file gateway discovers them in S3 buckets. This operation is only supported in file gateways.
   */
  @js.native
  trait NFSFileShareInfo extends js.Object {
    var ClientList: js.UndefOr[FileShareClientList]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var FileShareARN: js.UndefOr[FileShareARN]
    var FileShareId: js.UndefOr[FileShareId]
    var FileShareStatus: js.UndefOr[FileShareStatus]
    var GatewayARN: js.UndefOr[GatewayARN]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var KMSEncrypted: js.UndefOr[boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var LocationARN: js.UndefOr[LocationARN]
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults]
    var ObjectACL: js.UndefOr[ObjectACL]
    var Path: js.UndefOr[Path]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var Role: js.UndefOr[Role]
    var Squash: js.UndefOr[Squash]
  }

  object NFSFileShareInfo {
    def apply(
      ClientList: js.UndefOr[FileShareClientList] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      FileShareId: js.UndefOr[FileShareId] = js.undefined,
      FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      KMSEncrypted: js.UndefOr[boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      LocationARN: js.UndefOr[LocationARN] = js.undefined,
      NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      Path: js.UndefOr[Path] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      Squash: js.UndefOr[Squash] = js.undefined): NFSFileShareInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientList" -> ClientList.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "FileShareId" -> FileShareId.map { x => x.asInstanceOf[js.Any] },
        "FileShareStatus" -> FileShareStatus.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "LocationARN" -> LocationARN.map { x => x.asInstanceOf[js.Any] },
        "NFSFileShareDefaults" -> NFSFileShareDefaults.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "Squash" -> Squash.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NFSFileShareInfo]
    }
  }

  /**
   * Describes a gateway's network interface.
   */
  @js.native
  trait NetworkInterface extends js.Object {
    var Ipv4Address: js.UndefOr[string]
    var Ipv6Address: js.UndefOr[string]
    var MacAddress: js.UndefOr[string]
  }

  object NetworkInterface {
    def apply(
      Ipv4Address: js.UndefOr[string] = js.undefined,
      Ipv6Address: js.UndefOr[string] = js.undefined,
      MacAddress: js.UndefOr[string] = js.undefined): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ipv4Address" -> Ipv4Address.map { x => x.asInstanceOf[js.Any] },
        "Ipv6Address" -> Ipv6Address.map { x => x.asInstanceOf[js.Any] },
        "MacAddress" -> MacAddress.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
    }
  }

  @js.native
  trait NotifyWhenUploadedInput extends js.Object {
    var FileShareARN: FileShareARN
  }

  object NotifyWhenUploadedInput {
    def apply(
      FileShareARN: FileShareARN): NotifyWhenUploadedInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
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
    var FileShareARN: FileShareARN
    var FolderList: js.UndefOr[FolderList]
    var Recursive: js.UndefOr[Boolean]
  }

  object RefreshCacheInput {
    def apply(
      FileShareARN: FileShareARN,
      FolderList: js.UndefOr[FolderList] = js.undefined,
      Recursive: js.UndefOr[Boolean] = js.undefined): RefreshCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any],
        "FolderList" -> FolderList.map { x => x.asInstanceOf[js.Any] },
        "Recursive" -> Recursive.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RefreshCacheInput]
    }
  }

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

  @js.native
  trait RemoveTagsFromResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var TagKeys: TagKeys
  }

  object RemoveTagsFromResourceInput {
    def apply(
      ResourceARN: ResourceARN,
      TagKeys: TagKeys): RemoveTagsFromResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceInput]
    }
  }

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
    var GatewayARN: GatewayARN
  }

  object ResetCacheInput {
    def apply(
      GatewayARN: GatewayARN): ResetCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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

  @js.native
  trait RetrieveTapeArchiveInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  object RetrieveTapeArchiveInput {
    def apply(
      GatewayARN: GatewayARN,
      TapeARN: TapeARN): RetrieveTapeArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN" -> TapeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeArchiveInput]
    }
  }

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

  @js.native
  trait RetrieveTapeRecoveryPointInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  object RetrieveTapeRecoveryPointInput {
    def apply(
      GatewayARN: GatewayARN,
      TapeARN: TapeARN): RetrieveTapeRecoveryPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN" -> TapeARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeRecoveryPointInput]
    }
  }

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
   * The Windows file permissions and ownership information assigned, by default, to native S3 objects when file gateway discovers them in S3 buckets. This operation is only supported for file gateways.
   */
  @js.native
  trait SMBFileShareInfo extends js.Object {
    var Authentication: js.UndefOr[Authentication]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var FileShareARN: js.UndefOr[FileShareARN]
    var FileShareId: js.UndefOr[FileShareId]
    var FileShareStatus: js.UndefOr[FileShareStatus]
    var GatewayARN: js.UndefOr[GatewayARN]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var InvalidUserList: js.UndefOr[FileShareUserList]
    var KMSEncrypted: js.UndefOr[boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var LocationARN: js.UndefOr[LocationARN]
    var ObjectACL: js.UndefOr[ObjectACL]
    var Path: js.UndefOr[Path]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var Role: js.UndefOr[Role]
    var ValidUserList: js.UndefOr[FileShareUserList]
  }

  object SMBFileShareInfo {
    def apply(
      Authentication: js.UndefOr[Authentication] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      FileShareId: js.UndefOr[FileShareId] = js.undefined,
      FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined,
      KMSEncrypted: js.UndefOr[boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      LocationARN: js.UndefOr[LocationARN] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      Path: js.UndefOr[Path] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      Role: js.UndefOr[Role] = js.undefined,
      ValidUserList: js.UndefOr[FileShareUserList] = js.undefined): SMBFileShareInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Authentication" -> Authentication.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "FileShareARN" -> FileShareARN.map { x => x.asInstanceOf[js.Any] },
        "FileShareId" -> FileShareId.map { x => x.asInstanceOf[js.Any] },
        "FileShareStatus" -> FileShareStatus.map { x => x.asInstanceOf[js.Any] },
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "InvalidUserList" -> InvalidUserList.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "LocationARN" -> LocationARN.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "Path" -> Path.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "Role" -> Role.map { x => x.asInstanceOf[js.Any] },
        "ValidUserList" -> ValidUserList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SMBFileShareInfo]
    }
  }

  @js.native
  trait SetLocalConsolePasswordInput extends js.Object {
    var GatewayARN: GatewayARN
    var LocalConsolePassword: LocalConsolePassword
  }

  object SetLocalConsolePasswordInput {
    def apply(
      GatewayARN: GatewayARN,
      LocalConsolePassword: LocalConsolePassword): SetLocalConsolePasswordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "LocalConsolePassword" -> LocalConsolePassword.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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

  @js.native
  trait SetSMBGuestPasswordInput extends js.Object {
    var GatewayARN: GatewayARN
    var Password: SMBGuestPassword
  }

  object SetSMBGuestPasswordInput {
    def apply(
      GatewayARN: GatewayARN,
      Password: SMBGuestPassword): SetSMBGuestPasswordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

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
   * A JSON object containing the of the gateway to shut down.
   */
  @js.native
  trait ShutdownGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ShutdownGatewayInput {
    def apply(
      GatewayARN: GatewayARN): ShutdownGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShutdownGatewayInput]
    }
  }

  /**
   * A JSON object containing the of the gateway that was shut down.
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
   * A JSON object containing the of the gateway to start.
   */
  @js.native
  trait StartGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object StartGatewayInput {
    def apply(
      GatewayARN: GatewayARN): StartGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartGatewayInput]
    }
  }

  /**
   * A JSON object containing the of the gateway that was restarted.
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
   * Describes an iSCSI stored volume.
   */
  @js.native
  trait StorediSCSIVolume extends js.Object {
    var CreatedDate: js.UndefOr[CreatedDate]
    var KMSKey: js.UndefOr[KMSKey]
    var PreservedExistingData: js.UndefOr[boolean]
    var SourceSnapshotId: js.UndefOr[SnapshotId]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeDiskId: js.UndefOr[DiskId]
    var VolumeId: js.UndefOr[VolumeId]
    var VolumeProgress: js.UndefOr[DoubleObject]
    var VolumeSizeInBytes: js.UndefOr[long]
    var VolumeStatus: js.UndefOr[VolumeStatus]
    var VolumeType: js.UndefOr[VolumeType]
    var VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes]
    var VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes]
  }

  object StorediSCSIVolume {
    def apply(
      CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      PreservedExistingData: js.UndefOr[boolean] = js.undefined,
      SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeDiskId: js.UndefOr[DiskId] = js.undefined,
      VolumeId: js.UndefOr[VolumeId] = js.undefined,
      VolumeProgress: js.UndefOr[DoubleObject] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined,
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes] = js.undefined,
      VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined): StorediSCSIVolume = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedDate" -> CreatedDate.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "PreservedExistingData" -> PreservedExistingData.map { x => x.asInstanceOf[js.Any] },
        "SourceSnapshotId" -> SourceSnapshotId.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeDiskId" -> VolumeDiskId.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "VolumeProgress" -> VolumeProgress.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeStatus" -> VolumeStatus.map { x => x.asInstanceOf[js.Any] },
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "VolumeUsedInBytes" -> VolumeUsedInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeiSCSIAttributes" -> VolumeiSCSIAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorediSCSIVolume]
    }
  }

  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: TagValue): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * Describes a virtual tape object.
   */
  @js.native
  trait Tape extends js.Object {
    var KMSKey: js.UndefOr[KMSKey]
    var Progress: js.UndefOr[DoubleObject]
    var TapeARN: js.UndefOr[TapeARN]
    var TapeBarcode: js.UndefOr[TapeBarcode]
    var TapeCreatedDate: js.UndefOr[Time]
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeStatus]
    var TapeUsedInBytes: js.UndefOr[TapeUsage]
    var VTLDevice: js.UndefOr[VTLDeviceARN]
  }

  object Tape {
    def apply(
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      Progress: js.UndefOr[DoubleObject] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      TapeCreatedDate: js.UndefOr[Time] = js.undefined,
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeStatus] = js.undefined,
      TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined,
      VTLDevice: js.UndefOr[VTLDeviceARN] = js.undefined): Tape = {
      val _fields = IndexedSeq[(String, js.Any)](
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "Progress" -> Progress.map { x => x.asInstanceOf[js.Any] },
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] },
        "TapeBarcode" -> TapeBarcode.map { x => x.asInstanceOf[js.Any] },
        "TapeCreatedDate" -> TapeCreatedDate.map { x => x.asInstanceOf[js.Any] },
        "TapeSizeInBytes" -> TapeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeStatus" -> TapeStatus.map { x => x.asInstanceOf[js.Any] },
        "TapeUsedInBytes" -> TapeUsedInBytes.map { x => x.asInstanceOf[js.Any] },
        "VTLDevice" -> VTLDevice.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tape]
    }
  }

  /**
   * Represents a virtual tape that is archived in the virtual tape shelf (VTS).
   */
  @js.native
  trait TapeArchive extends js.Object {
    var CompletionTime: js.UndefOr[Time]
    var KMSKey: js.UndefOr[KMSKey]
    var RetrievedTo: js.UndefOr[GatewayARN]
    var TapeARN: js.UndefOr[TapeARN]
    var TapeBarcode: js.UndefOr[TapeBarcode]
    var TapeCreatedDate: js.UndefOr[Time]
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeArchiveStatus]
    var TapeUsedInBytes: js.UndefOr[TapeUsage]
  }

  object TapeArchive {
    def apply(
      CompletionTime: js.UndefOr[Time] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      RetrievedTo: js.UndefOr[GatewayARN] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      TapeCreatedDate: js.UndefOr[Time] = js.undefined,
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeArchiveStatus] = js.undefined,
      TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined): TapeArchive = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompletionTime" -> CompletionTime.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "RetrievedTo" -> RetrievedTo.map { x => x.asInstanceOf[js.Any] },
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] },
        "TapeBarcode" -> TapeBarcode.map { x => x.asInstanceOf[js.Any] },
        "TapeCreatedDate" -> TapeCreatedDate.map { x => x.asInstanceOf[js.Any] },
        "TapeSizeInBytes" -> TapeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeStatus" -> TapeStatus.map { x => x.asInstanceOf[js.Any] },
        "TapeUsedInBytes" -> TapeUsedInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TapeArchive]
    }
  }

  /**
   * Describes a virtual tape.
   */
  @js.native
  trait TapeInfo extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var TapeARN: js.UndefOr[TapeARN]
    var TapeBarcode: js.UndefOr[TapeBarcode]
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeStatus]
  }

  object TapeInfo {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeStatus] = js.undefined): TapeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "TapeARN" -> TapeARN.map { x => x.asInstanceOf[js.Any] },
        "TapeBarcode" -> TapeBarcode.map { x => x.asInstanceOf[js.Any] },
        "TapeSizeInBytes" -> TapeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "TapeStatus" -> TapeStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TapeInfo]
    }
  }

  /**
   * Describes a recovery point.
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
   * A JSON object containing one or more of the following fields:
   * * AverageDownloadRateLimitInBitsPerSec
   *  * AverageUploadRateLimitInBitsPerSec
   */
  @js.native
  trait UpdateBandwidthRateLimitInput extends js.Object {
    var GatewayARN: GatewayARN
    var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit]
    var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit]
  }

  object UpdateBandwidthRateLimitInput {
    def apply(
      GatewayARN: GatewayARN,
      AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined,
      AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined): UpdateBandwidthRateLimitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "AverageDownloadRateLimitInBitsPerSec" -> AverageDownloadRateLimitInBitsPerSec.map { x => x.asInstanceOf[js.Any] },
        "AverageUploadRateLimitInBitsPerSec" -> AverageUploadRateLimitInBitsPerSec.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBandwidthRateLimitInput]
    }
  }

  /**
   * A JSON object containing the of the gateway whose throttle information was updated.
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
   * A JSON object containing one or more of the following fields:
   * * InitiatorName
   *  * SecretToAuthenticateInitiator
   *  * SecretToAuthenticateTarget
   *  * TargetARN
   */
  @js.native
  trait UpdateChapCredentialsInput extends js.Object {
    var InitiatorName: IqnName
    var SecretToAuthenticateInitiator: ChapSecret
    var TargetARN: TargetARN
    var SecretToAuthenticateTarget: js.UndefOr[ChapSecret]
  }

  object UpdateChapCredentialsInput {
    def apply(
      InitiatorName: IqnName,
      SecretToAuthenticateInitiator: ChapSecret,
      TargetARN: TargetARN,
      SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined): UpdateChapCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitiatorName" -> InitiatorName.asInstanceOf[js.Any],
        "SecretToAuthenticateInitiator" -> SecretToAuthenticateInitiator.asInstanceOf[js.Any],
        "TargetARN" -> TargetARN.asInstanceOf[js.Any],
        "SecretToAuthenticateTarget" -> SecretToAuthenticateTarget.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChapCredentialsInput]
    }
  }

  /**
   * A JSON object containing the following fields:
   */
  @js.native
  trait UpdateChapCredentialsOutput extends js.Object {
    var InitiatorName: js.UndefOr[IqnName]
    var TargetARN: js.UndefOr[TargetARN]
  }

  object UpdateChapCredentialsOutput {
    def apply(
      InitiatorName: js.UndefOr[IqnName] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined): UpdateChapCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InitiatorName" -> InitiatorName.map { x => x.asInstanceOf[js.Any] },
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChapCredentialsOutput]
    }
  }

  @js.native
  trait UpdateGatewayInformationInput extends js.Object {
    var GatewayARN: GatewayARN
    var GatewayName: js.UndefOr[GatewayName]
    var GatewayTimezone: js.UndefOr[GatewayTimezone]
  }

  object UpdateGatewayInformationInput {
    def apply(
      GatewayARN: GatewayARN,
      GatewayName: js.UndefOr[GatewayName] = js.undefined,
      GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined): UpdateGatewayInformationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "GatewayName" -> GatewayName.map { x => x.asInstanceOf[js.Any] },
        "GatewayTimezone" -> GatewayTimezone.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewayInformationInput]
    }
  }

  /**
   * A JSON object containing the ARN of the gateway that was updated.
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
   * A JSON object containing the of the gateway to update.
   */
  @js.native
  trait UpdateGatewaySoftwareNowInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object UpdateGatewaySoftwareNowInput {
    def apply(
      GatewayARN: GatewayARN): UpdateGatewaySoftwareNowInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewaySoftwareNowInput]
    }
  }

  /**
   * A JSON object containing the of the gateway that was updated.
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
   * A JSON object containing the following fields:
   * * DayOfWeek
   *  * HourOfDay
   *  * MinuteOfHour
   */
  @js.native
  trait UpdateMaintenanceStartTimeInput extends js.Object {
    var DayOfWeek: DayOfWeek
    var GatewayARN: GatewayARN
    var HourOfDay: HourOfDay
    var MinuteOfHour: MinuteOfHour
  }

  object UpdateMaintenanceStartTimeInput {
    def apply(
      DayOfWeek: DayOfWeek,
      GatewayARN: GatewayARN,
      HourOfDay: HourOfDay,
      MinuteOfHour: MinuteOfHour): UpdateMaintenanceStartTimeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DayOfWeek" -> DayOfWeek.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "HourOfDay" -> HourOfDay.asInstanceOf[js.Any],
        "MinuteOfHour" -> MinuteOfHour.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceStartTimeInput]
    }
  }

  /**
   * A JSON object containing the of the gateway whose maintenance start time is updated.
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

  @js.native
  trait UpdateNFSFileShareInput extends js.Object {
    var FileShareARN: FileShareARN
    var ClientList: js.UndefOr[FileShareClientList]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults]
    var ObjectACL: js.UndefOr[ObjectACL]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var Squash: js.UndefOr[Squash]
  }

  object UpdateNFSFileShareInput {
    def apply(
      FileShareARN: FileShareARN,
      ClientList: js.UndefOr[FileShareClientList] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      Squash: js.UndefOr[Squash] = js.undefined): UpdateNFSFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any],
        "ClientList" -> ClientList.map { x => x.asInstanceOf[js.Any] },
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "NFSFileShareDefaults" -> NFSFileShareDefaults.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "Squash" -> Squash.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNFSFileShareInput]
    }
  }

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

  @js.native
  trait UpdateSMBFileShareInput extends js.Object {
    var FileShareARN: FileShareARN
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var InvalidUserList: js.UndefOr[FileShareUserList]
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var ObjectACL: js.UndefOr[ObjectACL]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var ValidUserList: js.UndefOr[FileShareUserList]
  }

  object UpdateSMBFileShareInput {
    def apply(
      FileShareARN: FileShareARN,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
      InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined,
      ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
      ReadOnly: js.UndefOr[Boolean] = js.undefined,
      RequesterPays: js.UndefOr[Boolean] = js.undefined,
      ValidUserList: js.UndefOr[FileShareUserList] = js.undefined): UpdateSMBFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any],
        "DefaultStorageClass" -> DefaultStorageClass.map { x => x.asInstanceOf[js.Any] },
        "GuessMIMETypeEnabled" -> GuessMIMETypeEnabled.map { x => x.asInstanceOf[js.Any] },
        "InvalidUserList" -> InvalidUserList.map { x => x.asInstanceOf[js.Any] },
        "KMSEncrypted" -> KMSEncrypted.map { x => x.asInstanceOf[js.Any] },
        "KMSKey" -> KMSKey.map { x => x.asInstanceOf[js.Any] },
        "ObjectACL" -> ObjectACL.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "RequesterPays" -> RequesterPays.map { x => x.asInstanceOf[js.Any] },
        "ValidUserList" -> ValidUserList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSMBFileShareInput]
    }
  }

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
   * A JSON object containing one or more of the following fields:
   * * Description
   *  * RecurrenceInHours
   *  * StartAt
   *  * VolumeARN
   */
  @js.native
  trait UpdateSnapshotScheduleInput extends js.Object {
    var RecurrenceInHours: RecurrenceInHours
    var StartAt: HourOfDay
    var VolumeARN: VolumeARN
    var Description: js.UndefOr[Description]
  }

  object UpdateSnapshotScheduleInput {
    def apply(
      RecurrenceInHours: RecurrenceInHours,
      StartAt: HourOfDay,
      VolumeARN: VolumeARN,
      Description: js.UndefOr[Description] = js.undefined): UpdateSnapshotScheduleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecurrenceInHours" -> RecurrenceInHours.asInstanceOf[js.Any],
        "StartAt" -> StartAt.asInstanceOf[js.Any],
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSnapshotScheduleInput]
    }
  }

  /**
   * A JSON object containing the of the updated storage volume.
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
    var DeviceType: DeviceType
    var VTLDeviceARN: VTLDeviceARN
  }

  object UpdateVTLDeviceTypeInput {
    def apply(
      DeviceType: DeviceType,
      VTLDeviceARN: VTLDeviceARN): UpdateVTLDeviceTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceType" -> DeviceType.asInstanceOf[js.Any],
        "VTLDeviceARN" -> VTLDeviceARN.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVTLDeviceTypeInput]
    }
  }

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
   * Represents a device object associated with a tape gateway.
   */
  @js.native
  trait VTLDevice extends js.Object {
    var DeviceiSCSIAttributes: js.UndefOr[DeviceiSCSIAttributes]
    var VTLDeviceARN: js.UndefOr[VTLDeviceARN]
    var VTLDeviceProductIdentifier: js.UndefOr[VTLDeviceProductIdentifier]
    var VTLDeviceType: js.UndefOr[VTLDeviceType]
    var VTLDeviceVendor: js.UndefOr[VTLDeviceVendor]
  }

  object VTLDevice {
    def apply(
      DeviceiSCSIAttributes: js.UndefOr[DeviceiSCSIAttributes] = js.undefined,
      VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined,
      VTLDeviceProductIdentifier: js.UndefOr[VTLDeviceProductIdentifier] = js.undefined,
      VTLDeviceType: js.UndefOr[VTLDeviceType] = js.undefined,
      VTLDeviceVendor: js.UndefOr[VTLDeviceVendor] = js.undefined): VTLDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceiSCSIAttributes" -> DeviceiSCSIAttributes.map { x => x.asInstanceOf[js.Any] },
        "VTLDeviceARN" -> VTLDeviceARN.map { x => x.asInstanceOf[js.Any] },
        "VTLDeviceProductIdentifier" -> VTLDeviceProductIdentifier.map { x => x.asInstanceOf[js.Any] },
        "VTLDeviceType" -> VTLDeviceType.map { x => x.asInstanceOf[js.Any] },
        "VTLDeviceVendor" -> VTLDeviceVendor.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VTLDevice]
    }
  }

  /**
   * Describes a storage volume object.
   */
  @js.native
  trait VolumeInfo extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayId: js.UndefOr[GatewayId]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeId: js.UndefOr[VolumeId]
    var VolumeSizeInBytes: js.UndefOr[long]
    var VolumeType: js.UndefOr[VolumeType]
  }

  object VolumeInfo {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayId: js.UndefOr[GatewayId] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeId: js.UndefOr[VolumeId] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      VolumeType: js.UndefOr[VolumeType] = js.undefined): VolumeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GatewayARN" -> GatewayARN.map { x => x.asInstanceOf[js.Any] },
        "GatewayId" -> GatewayId.map { x => x.asInstanceOf[js.Any] },
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeId" -> VolumeId.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeInfo]
    }
  }

  @js.native
  trait VolumeRecoveryPointInfo extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeRecoveryPointTime: js.UndefOr[string]
    var VolumeSizeInBytes: js.UndefOr[long]
    var VolumeUsageInBytes: js.UndefOr[long]
  }

  object VolumeRecoveryPointInfo {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeRecoveryPointTime: js.UndefOr[string] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      VolumeUsageInBytes: js.UndefOr[long] = js.undefined): VolumeRecoveryPointInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VolumeARN" -> VolumeARN.map { x => x.asInstanceOf[js.Any] },
        "VolumeRecoveryPointTime" -> VolumeRecoveryPointTime.map { x => x.asInstanceOf[js.Any] },
        "VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x.asInstanceOf[js.Any] },
        "VolumeUsageInBytes" -> VolumeUsageInBytes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeRecoveryPointInfo]
    }
  }

  /**
   * Lists iSCSI information about a volume.
   */
  @js.native
  trait VolumeiSCSIAttributes extends js.Object {
    var ChapEnabled: js.UndefOr[boolean]
    var LunNumber: js.UndefOr[PositiveIntObject]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NetworkInterfacePort: js.UndefOr[integer]
    var TargetARN: js.UndefOr[TargetARN]
  }

  object VolumeiSCSIAttributes {
    def apply(
      ChapEnabled: js.UndefOr[boolean] = js.undefined,
      LunNumber: js.UndefOr[PositiveIntObject] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      NetworkInterfacePort: js.UndefOr[integer] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined): VolumeiSCSIAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChapEnabled" -> ChapEnabled.map { x => x.asInstanceOf[js.Any] },
        "LunNumber" -> LunNumber.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfaceId" -> NetworkInterfaceId.map { x => x.asInstanceOf[js.Any] },
        "NetworkInterfacePort" -> NetworkInterfacePort.map { x => x.asInstanceOf[js.Any] },
        "TargetARN" -> TargetARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeiSCSIAttributes]
    }
  }
}
