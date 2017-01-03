package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object storagegateway {
  type ActivationKey = String
  type BandwidthDownloadRateLimit = Long
  type BandwidthType = String
  type BandwidthUploadRateLimit = Long
  type CachediSCSIVolumes = js.Array[CachediSCSIVolume]
  type ChapCredentials = js.Array[ChapInfo]
  type ChapSecret = String
  type ClientToken = String
  type CreatedDate = js.Date
  type DayOfWeek = Integer
  type Description = String
  type DeviceType = String
  type DiskAllocationType = String
  type DiskId = String
  type DiskIds = js.Array[DiskId]
  type Disks = js.Array[Disk]
  type DoubleObject = Double
  type ErrorCode = String
  type FileShareARN = String
  type FileShareARNList = js.Array[FileShareARN]
  type FileShareId = String
  type FileShareInfoList = js.Array[FileShareInfo]
  type FileShareStatus = String
  type GatewayARN = String
  type GatewayId = String
  type GatewayName = String
  type GatewayNetworkInterfaces = js.Array[NetworkInterface]
  type GatewayOperationalState = String
  type GatewayState = String
  type GatewayTimezone = String
  type GatewayType = String
  type Gateways = js.Array[GatewayInfo]
  type HourOfDay = Integer
  type Initiator = String
  type Initiators = js.Array[Initiator]
  type IqnName = String
  type KMSKey = String
  type LastSoftwareUpdate = String
  type LocalConsolePassword = String
  type LocationARN = String
  type Marker = String
  type MediumChangerType = String
  type MinuteOfHour = Integer
  type NFSFileShareInfoList = js.Array[NFSFileShareInfo]
  type NetworkInterfaceId = String
  type NextUpdateAvailabilityDate = String
  type NumTapesToCreate = Integer
  type Path = String
  type PermissionId = Long
  type PermissionMode = String
  type PositiveIntObject = Integer
  type RecurrenceInHours = Integer
  type RegionId = String
  type ResourceARN = String
  type Role = String
  type SnapshotDescription = String
  type SnapshotId = String
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
  type TapeSize = Long
  type TapeStatus = String
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
  type boolean = Boolean
  type double = Double
  type errorDetails = js.Dictionary[string]
  type integer = Integer
  type long = Long
  type string = String
}

package storagegateway {
  @js.native
  trait Storagegateway extends js.Object {
    def activateGateway(params: ActivateGatewayInput, callback: Callback[ActivateGatewayOutput]): Unit = js.native
    def activateGateway(params: ActivateGatewayInput): Request[ActivateGatewayOutput] = js.native
    def addCache(params: AddCacheInput, callback: Callback[AddCacheOutput]): Unit = js.native
    def addCache(params: AddCacheInput): Request[AddCacheOutput] = js.native
    def addTagsToResource(params: AddTagsToResourceInput, callback: Callback[AddTagsToResourceOutput]): Unit = js.native
    def addTagsToResource(params: AddTagsToResourceInput): Request[AddTagsToResourceOutput] = js.native
    def addUploadBuffer(params: AddUploadBufferInput, callback: Callback[AddUploadBufferOutput]): Unit = js.native
    def addUploadBuffer(params: AddUploadBufferInput): Request[AddUploadBufferOutput] = js.native
    def addWorkingStorage(params: AddWorkingStorageInput, callback: Callback[AddWorkingStorageOutput]): Unit = js.native
    def addWorkingStorage(params: AddWorkingStorageInput): Request[AddWorkingStorageOutput] = js.native
    def cancelArchival(params: CancelArchivalInput, callback: Callback[CancelArchivalOutput]): Unit = js.native
    def cancelArchival(params: CancelArchivalInput): Request[CancelArchivalOutput] = js.native
    def cancelRetrieval(params: CancelRetrievalInput, callback: Callback[CancelRetrievalOutput]): Unit = js.native
    def cancelRetrieval(params: CancelRetrievalInput): Request[CancelRetrievalOutput] = js.native
    def createCachediSCSIVolume(params: CreateCachediSCSIVolumeInput, callback: Callback[CreateCachediSCSIVolumeOutput]): Unit = js.native
    def createCachediSCSIVolume(params: CreateCachediSCSIVolumeInput): Request[CreateCachediSCSIVolumeOutput] = js.native
    def createNFSFileShare(params: CreateNFSFileShareInput, callback: Callback[CreateNFSFileShareOutput]): Unit = js.native
    def createNFSFileShare(params: CreateNFSFileShareInput): Request[CreateNFSFileShareOutput] = js.native
    def createSnapshot(params: CreateSnapshotInput, callback: Callback[CreateSnapshotOutput]): Unit = js.native
    def createSnapshot(params: CreateSnapshotInput): Request[CreateSnapshotOutput] = js.native
    def createSnapshotFromVolumeRecoveryPoint(params: CreateSnapshotFromVolumeRecoveryPointInput, callback: Callback[CreateSnapshotFromVolumeRecoveryPointOutput]): Unit = js.native
    def createSnapshotFromVolumeRecoveryPoint(params: CreateSnapshotFromVolumeRecoveryPointInput): Request[CreateSnapshotFromVolumeRecoveryPointOutput] = js.native
    def createStorediSCSIVolume(params: CreateStorediSCSIVolumeInput, callback: Callback[CreateStorediSCSIVolumeOutput]): Unit = js.native
    def createStorediSCSIVolume(params: CreateStorediSCSIVolumeInput): Request[CreateStorediSCSIVolumeOutput] = js.native
    def createTapeWithBarcode(params: CreateTapeWithBarcodeInput, callback: Callback[CreateTapeWithBarcodeOutput]): Unit = js.native
    def createTapeWithBarcode(params: CreateTapeWithBarcodeInput): Request[CreateTapeWithBarcodeOutput] = js.native
    def createTapes(params: CreateTapesInput, callback: Callback[CreateTapesOutput]): Unit = js.native
    def createTapes(params: CreateTapesInput): Request[CreateTapesOutput] = js.native
    def deleteBandwidthRateLimit(params: DeleteBandwidthRateLimitInput, callback: Callback[DeleteBandwidthRateLimitOutput]): Unit = js.native
    def deleteBandwidthRateLimit(params: DeleteBandwidthRateLimitInput): Request[DeleteBandwidthRateLimitOutput] = js.native
    def deleteChapCredentials(params: DeleteChapCredentialsInput, callback: Callback[DeleteChapCredentialsOutput]): Unit = js.native
    def deleteChapCredentials(params: DeleteChapCredentialsInput): Request[DeleteChapCredentialsOutput] = js.native
    def deleteFileShare(params: DeleteFileShareInput, callback: Callback[DeleteFileShareOutput]): Unit = js.native
    def deleteFileShare(params: DeleteFileShareInput): Request[DeleteFileShareOutput] = js.native
    def deleteGateway(params: DeleteGatewayInput, callback: Callback[DeleteGatewayOutput]): Unit = js.native
    def deleteGateway(params: DeleteGatewayInput): Request[DeleteGatewayOutput] = js.native
    def deleteSnapshotSchedule(params: DeleteSnapshotScheduleInput, callback: Callback[DeleteSnapshotScheduleOutput]): Unit = js.native
    def deleteSnapshotSchedule(params: DeleteSnapshotScheduleInput): Request[DeleteSnapshotScheduleOutput] = js.native
    def deleteTape(params: DeleteTapeInput, callback: Callback[DeleteTapeOutput]): Unit = js.native
    def deleteTape(params: DeleteTapeInput): Request[DeleteTapeOutput] = js.native
    def deleteTapeArchive(params: DeleteTapeArchiveInput, callback: Callback[DeleteTapeArchiveOutput]): Unit = js.native
    def deleteTapeArchive(params: DeleteTapeArchiveInput): Request[DeleteTapeArchiveOutput] = js.native
    def deleteVolume(params: DeleteVolumeInput, callback: Callback[DeleteVolumeOutput]): Unit = js.native
    def deleteVolume(params: DeleteVolumeInput): Request[DeleteVolumeOutput] = js.native
    def describeBandwidthRateLimit(params: DescribeBandwidthRateLimitInput, callback: Callback[DescribeBandwidthRateLimitOutput]): Unit = js.native
    def describeBandwidthRateLimit(params: DescribeBandwidthRateLimitInput): Request[DescribeBandwidthRateLimitOutput] = js.native
    def describeCache(params: DescribeCacheInput, callback: Callback[DescribeCacheOutput]): Unit = js.native
    def describeCache(params: DescribeCacheInput): Request[DescribeCacheOutput] = js.native
    def describeCachediSCSIVolumes(params: DescribeCachediSCSIVolumesInput, callback: Callback[DescribeCachediSCSIVolumesOutput]): Unit = js.native
    def describeCachediSCSIVolumes(params: DescribeCachediSCSIVolumesInput): Request[DescribeCachediSCSIVolumesOutput] = js.native
    def describeChapCredentials(params: DescribeChapCredentialsInput, callback: Callback[DescribeChapCredentialsOutput]): Unit = js.native
    def describeChapCredentials(params: DescribeChapCredentialsInput): Request[DescribeChapCredentialsOutput] = js.native
    def describeGatewayInformation(params: DescribeGatewayInformationInput, callback: Callback[DescribeGatewayInformationOutput]): Unit = js.native
    def describeGatewayInformation(params: DescribeGatewayInformationInput): Request[DescribeGatewayInformationOutput] = js.native
    def describeMaintenanceStartTime(params: DescribeMaintenanceStartTimeInput, callback: Callback[DescribeMaintenanceStartTimeOutput]): Unit = js.native
    def describeMaintenanceStartTime(params: DescribeMaintenanceStartTimeInput): Request[DescribeMaintenanceStartTimeOutput] = js.native
    def describeNFSFileShares(params: DescribeNFSFileSharesInput, callback: Callback[DescribeNFSFileSharesOutput]): Unit = js.native
    def describeNFSFileShares(params: DescribeNFSFileSharesInput): Request[DescribeNFSFileSharesOutput] = js.native
    def describeSnapshotSchedule(params: DescribeSnapshotScheduleInput, callback: Callback[DescribeSnapshotScheduleOutput]): Unit = js.native
    def describeSnapshotSchedule(params: DescribeSnapshotScheduleInput): Request[DescribeSnapshotScheduleOutput] = js.native
    def describeStorediSCSIVolumes(params: DescribeStorediSCSIVolumesInput, callback: Callback[DescribeStorediSCSIVolumesOutput]): Unit = js.native
    def describeStorediSCSIVolumes(params: DescribeStorediSCSIVolumesInput): Request[DescribeStorediSCSIVolumesOutput] = js.native
    def describeTapeArchives(params: DescribeTapeArchivesInput, callback: Callback[DescribeTapeArchivesOutput]): Unit = js.native
    def describeTapeArchives(params: DescribeTapeArchivesInput): Request[DescribeTapeArchivesOutput] = js.native
    def describeTapeRecoveryPoints(params: DescribeTapeRecoveryPointsInput, callback: Callback[DescribeTapeRecoveryPointsOutput]): Unit = js.native
    def describeTapeRecoveryPoints(params: DescribeTapeRecoveryPointsInput): Request[DescribeTapeRecoveryPointsOutput] = js.native
    def describeTapes(params: DescribeTapesInput, callback: Callback[DescribeTapesOutput]): Unit = js.native
    def describeTapes(params: DescribeTapesInput): Request[DescribeTapesOutput] = js.native
    def describeUploadBuffer(params: DescribeUploadBufferInput, callback: Callback[DescribeUploadBufferOutput]): Unit = js.native
    def describeUploadBuffer(params: DescribeUploadBufferInput): Request[DescribeUploadBufferOutput] = js.native
    def describeVTLDevices(params: DescribeVTLDevicesInput, callback: Callback[DescribeVTLDevicesOutput]): Unit = js.native
    def describeVTLDevices(params: DescribeVTLDevicesInput): Request[DescribeVTLDevicesOutput] = js.native
    def describeWorkingStorage(params: DescribeWorkingStorageInput, callback: Callback[DescribeWorkingStorageOutput]): Unit = js.native
    def describeWorkingStorage(params: DescribeWorkingStorageInput): Request[DescribeWorkingStorageOutput] = js.native
    def disableGateway(params: DisableGatewayInput, callback: Callback[DisableGatewayOutput]): Unit = js.native
    def disableGateway(params: DisableGatewayInput): Request[DisableGatewayOutput] = js.native
    def listFileShares(params: ListFileSharesInput, callback: Callback[ListFileSharesOutput]): Unit = js.native
    def listFileShares(params: ListFileSharesInput): Request[ListFileSharesOutput] = js.native
    def listGateways(params: ListGatewaysInput, callback: Callback[ListGatewaysOutput]): Unit = js.native
    def listGateways(params: ListGatewaysInput): Request[ListGatewaysOutput] = js.native
    def listLocalDisks(params: ListLocalDisksInput, callback: Callback[ListLocalDisksOutput]): Unit = js.native
    def listLocalDisks(params: ListLocalDisksInput): Request[ListLocalDisksOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput, callback: Callback[ListTagsForResourceOutput]): Unit = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listTapes(params: ListTapesInput, callback: Callback[ListTapesOutput]): Unit = js.native
    def listTapes(params: ListTapesInput): Request[ListTapesOutput] = js.native
    def listVolumeInitiators(params: ListVolumeInitiatorsInput, callback: Callback[ListVolumeInitiatorsOutput]): Unit = js.native
    def listVolumeInitiators(params: ListVolumeInitiatorsInput): Request[ListVolumeInitiatorsOutput] = js.native
    def listVolumeRecoveryPoints(params: ListVolumeRecoveryPointsInput, callback: Callback[ListVolumeRecoveryPointsOutput]): Unit = js.native
    def listVolumeRecoveryPoints(params: ListVolumeRecoveryPointsInput): Request[ListVolumeRecoveryPointsOutput] = js.native
    def listVolumes(params: ListVolumesInput, callback: Callback[ListVolumesOutput]): Unit = js.native
    def listVolumes(params: ListVolumesInput): Request[ListVolumesOutput] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceInput, callback: Callback[RemoveTagsFromResourceOutput]): Unit = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceInput): Request[RemoveTagsFromResourceOutput] = js.native
    def resetCache(params: ResetCacheInput, callback: Callback[ResetCacheOutput]): Unit = js.native
    def resetCache(params: ResetCacheInput): Request[ResetCacheOutput] = js.native
    def retrieveTapeArchive(params: RetrieveTapeArchiveInput, callback: Callback[RetrieveTapeArchiveOutput]): Unit = js.native
    def retrieveTapeArchive(params: RetrieveTapeArchiveInput): Request[RetrieveTapeArchiveOutput] = js.native
    def retrieveTapeRecoveryPoint(params: RetrieveTapeRecoveryPointInput, callback: Callback[RetrieveTapeRecoveryPointOutput]): Unit = js.native
    def retrieveTapeRecoveryPoint(params: RetrieveTapeRecoveryPointInput): Request[RetrieveTapeRecoveryPointOutput] = js.native
    def setLocalConsolePassword(params: SetLocalConsolePasswordInput, callback: Callback[SetLocalConsolePasswordOutput]): Unit = js.native
    def setLocalConsolePassword(params: SetLocalConsolePasswordInput): Request[SetLocalConsolePasswordOutput] = js.native
    def shutdownGateway(params: ShutdownGatewayInput, callback: Callback[ShutdownGatewayOutput]): Unit = js.native
    def shutdownGateway(params: ShutdownGatewayInput): Request[ShutdownGatewayOutput] = js.native
    def startGateway(params: StartGatewayInput, callback: Callback[StartGatewayOutput]): Unit = js.native
    def startGateway(params: StartGatewayInput): Request[StartGatewayOutput] = js.native
    def updateBandwidthRateLimit(params: UpdateBandwidthRateLimitInput, callback: Callback[UpdateBandwidthRateLimitOutput]): Unit = js.native
    def updateBandwidthRateLimit(params: UpdateBandwidthRateLimitInput): Request[UpdateBandwidthRateLimitOutput] = js.native
    def updateChapCredentials(params: UpdateChapCredentialsInput, callback: Callback[UpdateChapCredentialsOutput]): Unit = js.native
    def updateChapCredentials(params: UpdateChapCredentialsInput): Request[UpdateChapCredentialsOutput] = js.native
    def updateGatewayInformation(params: UpdateGatewayInformationInput, callback: Callback[UpdateGatewayInformationOutput]): Unit = js.native
    def updateGatewayInformation(params: UpdateGatewayInformationInput): Request[UpdateGatewayInformationOutput] = js.native
    def updateGatewaySoftwareNow(params: UpdateGatewaySoftwareNowInput, callback: Callback[UpdateGatewaySoftwareNowOutput]): Unit = js.native
    def updateGatewaySoftwareNow(params: UpdateGatewaySoftwareNowInput): Request[UpdateGatewaySoftwareNowOutput] = js.native
    def updateMaintenanceStartTime(params: UpdateMaintenanceStartTimeInput, callback: Callback[UpdateMaintenanceStartTimeOutput]): Unit = js.native
    def updateMaintenanceStartTime(params: UpdateMaintenanceStartTimeInput): Request[UpdateMaintenanceStartTimeOutput] = js.native
    def updateNFSFileShare(params: UpdateNFSFileShareInput, callback: Callback[UpdateNFSFileShareOutput]): Unit = js.native
    def updateNFSFileShare(params: UpdateNFSFileShareInput): Request[UpdateNFSFileShareOutput] = js.native
    def updateSnapshotSchedule(params: UpdateSnapshotScheduleInput, callback: Callback[UpdateSnapshotScheduleOutput]): Unit = js.native
    def updateSnapshotSchedule(params: UpdateSnapshotScheduleInput): Request[UpdateSnapshotScheduleOutput] = js.native
    def updateVTLDeviceType(params: UpdateVTLDeviceTypeInput, callback: Callback[UpdateVTLDeviceTypeOutput]): Unit = js.native
    def updateVTLDeviceType(params: UpdateVTLDeviceTypeInput): Request[UpdateVTLDeviceTypeOutput] = js.native
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>ActivateGatewayInput$ActivationKey</a> </p> </li> <li> <p> <a>ActivateGatewayInput$GatewayName</a> </p> </li> <li> <p> <a>ActivateGatewayInput$GatewayRegion</a> </p> </li> <li> <p> <a>ActivateGatewayInput$GatewayTimezone</a> </p> </li> <li> <p> <a>ActivateGatewayInput$GatewayType</a> </p> </li> <li> <p> <a>ActivateGatewayInput$TapeDriveType</a> </p> </li> <li> <p> <a>ActivateGatewayInput$MediumChangerType</a> </p> </li> </ul>
   */
  @js.native
  trait ActivateGatewayInput extends js.Object {
    var MediumChangerType: MediumChangerType
    var GatewayTimezone: GatewayTimezone
    var GatewayRegion: RegionId
    var TapeDriveType: TapeDriveType
    var ActivationKey: ActivationKey
    var GatewayName: GatewayName
    var GatewayType: GatewayType
  }

  object ActivateGatewayInput {
    def apply(
      MediumChangerType: js.UndefOr[MediumChangerType] = js.undefined,
      GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined,
      GatewayRegion: js.UndefOr[RegionId] = js.undefined,
      TapeDriveType: js.UndefOr[TapeDriveType] = js.undefined,
      ActivationKey: js.UndefOr[ActivationKey] = js.undefined,
      GatewayName: js.UndefOr[GatewayName] = js.undefined,
      GatewayType: js.UndefOr[GatewayType] = js.undefined
    ): ActivateGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MediumChangerType" -> MediumChangerType.map { x => x: js.Any }),
        ("GatewayTimezone" -> GatewayTimezone.map { x => x: js.Any }),
        ("GatewayRegion" -> GatewayRegion.map { x => x: js.Any }),
        ("TapeDriveType" -> TapeDriveType.map { x => x: js.Any }),
        ("ActivationKey" -> ActivationKey.map { x => x: js.Any }),
        ("GatewayName" -> GatewayName.map { x => x: js.Any }),
        ("GatewayType" -> GatewayType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivateGatewayInput]
    }
  }

  /**
   * <p>AWS Storage Gateway returns the Amazon Resource Name (ARN) of the activated gateway. It is a string made of information such as your account, gateway name, and region. This ARN is used to reference the gateway in other API operations as well as resource-based authorization.</p> <note> <p>For gateways activated prior to September 02, 2015 the gateway ARN contains the gateway name rather than the gateway id. Changing the name of the gateway has no effect on the gateway ARN.</p> </note>
   */
  @js.native
  trait ActivateGatewayOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ActivateGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ActivateGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActivateGatewayOutput]
    }
  }

  @js.native
  trait AddCacheInput extends js.Object {
    var GatewayARN: GatewayARN
    var DiskIds: DiskIds
  }

  object AddCacheInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined
    ): AddCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("DiskIds" -> DiskIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCacheInput]
    }
  }

  @js.native
  trait AddCacheOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object AddCacheOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): AddCacheOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddCacheOutput]
    }
  }

  /**
   * <p>AddTagsToResourceInput</p>
   */
  @js.native
  trait AddTagsToResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var Tags: Tags
  }

  object AddTagsToResourceInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined
    ): AddTagsToResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceARN" -> ResourceARN.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceInput]
    }
  }

  /**
   * <p>AddTagsToResourceOutput</p>
   */
  @js.native
  trait AddTagsToResourceOutput extends js.Object {
    var ResourceARN: ResourceARN
  }

  object AddTagsToResourceOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    ): AddTagsToResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceARN" -> ResourceARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceOutput]
    }
  }

  @js.native
  trait AddUploadBufferInput extends js.Object {
    var GatewayARN: GatewayARN
    var DiskIds: DiskIds
  }

  object AddUploadBufferInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined
    ): AddUploadBufferInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("DiskIds" -> DiskIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddUploadBufferInput]
    }
  }

  @js.native
  trait AddUploadBufferOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object AddUploadBufferOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): AddUploadBufferOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddUploadBufferOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>AddWorkingStorageInput$DiskIds</a> </p> </li> </ul>
   */
  @js.native
  trait AddWorkingStorageInput extends js.Object {
    var GatewayARN: GatewayARN
    var DiskIds: DiskIds
  }

  object AddWorkingStorageInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined
    ): AddWorkingStorageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("DiskIds" -> DiskIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddWorkingStorageInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway for which working storage was configured.</p>
   */
  @js.native
  trait AddWorkingStorageOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object AddWorkingStorageOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): AddWorkingStorageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddWorkingStorageOutput]
    }
  }

  /**
   * <p>Describes an iSCSI cached volume.</p>
   */
  @js.native
  trait CachediSCSIVolume extends js.Object {
    var VolumeType: VolumeType
    var CreatedDate: CreatedDate
    var VolumeId: VolumeId
    var VolumeProgress: DoubleObject
    var VolumeStatus: VolumeStatus
    var VolumeARN: VolumeARN
    var VolumeiSCSIAttributes: VolumeiSCSIAttributes
    var VolumeSizeInBytes: long
    var SourceSnapshotId: SnapshotId
  }

  object CachediSCSIVolume {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
      VolumeId: js.UndefOr[VolumeId] = js.undefined,
      VolumeProgress: js.UndefOr[DoubleObject] = js.undefined,
      VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): CachediSCSIVolume = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("CreatedDate" -> CreatedDate.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("VolumeProgress" -> VolumeProgress.map { x => x: js.Any }),
        ("VolumeStatus" -> VolumeStatus.map { x => x: js.Any }),
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("VolumeiSCSIAttributes" -> VolumeiSCSIAttributes.map { x => x: js.Any }),
        ("VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x: js.Any }),
        ("SourceSnapshotId" -> SourceSnapshotId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CachediSCSIVolume]
    }
  }

  /**
   * <p>CancelArchivalInput</p>
   */
  @js.native
  trait CancelArchivalInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  object CancelArchivalInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): CancelArchivalInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelArchivalInput]
    }
  }

  /**
   * <p>CancelArchivalOutput</p>
   */
  @js.native
  trait CancelArchivalOutput extends js.Object {
    var TapeARN: TapeARN
  }

  object CancelArchivalOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): CancelArchivalOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelArchivalOutput]
    }
  }

  /**
   * <p>CancelRetrievalInput</p>
   */
  @js.native
  trait CancelRetrievalInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  object CancelRetrievalInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): CancelRetrievalInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelRetrievalInput]
    }
  }

  /**
   * <p>CancelRetrievalOutput</p>
   */
  @js.native
  trait CancelRetrievalOutput extends js.Object {
    var TapeARN: TapeARN
  }

  object CancelRetrievalOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): CancelRetrievalOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelRetrievalOutput]
    }
  }

  /**
   * <p>Describes Challenge-Handshake Authentication Protocol (CHAP) information that supports authentication between your gateway and iSCSI initiators.</p>
   */
  @js.native
  trait ChapInfo extends js.Object {
    var TargetARN: TargetARN
    var SecretToAuthenticateInitiator: ChapSecret
    var InitiatorName: IqnName
    var SecretToAuthenticateTarget: ChapSecret
  }

  object ChapInfo {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined,
      SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined
    ): ChapInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetARN" -> TargetARN.map { x => x: js.Any }),
        ("SecretToAuthenticateInitiator" -> SecretToAuthenticateInitiator.map { x => x: js.Any }),
        ("InitiatorName" -> InitiatorName.map { x => x: js.Any }),
        ("SecretToAuthenticateTarget" -> SecretToAuthenticateTarget.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ChapInfo]
    }
  }

  @js.native
  trait CreateCachediSCSIVolumeInput extends js.Object {
    var SourceVolumeARN: VolumeARN
    var TargetName: TargetName
    var ClientToken: ClientToken
    var SnapshotId: SnapshotId
    var GatewayARN: GatewayARN
    var NetworkInterfaceId: NetworkInterfaceId
    var VolumeSizeInBytes: long
  }

  object CreateCachediSCSIVolumeInput {
    def apply(
      SourceVolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      TargetName: js.UndefOr[TargetName] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined
    ): CreateCachediSCSIVolumeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceVolumeARN" -> SourceVolumeARN.map { x => x: js.Any }),
        ("TargetName" -> TargetName.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCachediSCSIVolumeInput]
    }
  }

  @js.native
  trait CreateCachediSCSIVolumeOutput extends js.Object {
    var VolumeARN: VolumeARN
    var TargetARN: TargetARN
  }

  object CreateCachediSCSIVolumeOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined
    ): CreateCachediSCSIVolumeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("TargetARN" -> TargetARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCachediSCSIVolumeOutput]
    }
  }

  /**
   * <p>CreateNFSFileShareInput</p>
   */
  @js.native
  trait CreateNFSFileShareInput extends js.Object {
    var Role: Role
    var ClientToken: ClientToken
    var LocationARN: LocationARN
    var GatewayARN: GatewayARN
    var NFSFileShareDefaults: NFSFileShareDefaults
    var KMSEncrypted: Boolean
    var DefaultStorageClass: StorageClass
    var KMSKey: KMSKey
  }

  object CreateNFSFileShareInput {
    def apply(
      Role: js.UndefOr[Role] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      LocationARN: js.UndefOr[LocationARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined
    ): CreateNFSFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Role" -> Role.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("LocationARN" -> LocationARN.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("NFSFileShareDefaults" -> NFSFileShareDefaults.map { x => x: js.Any }),
        ("KMSEncrypted" -> KMSEncrypted.map { x => x: js.Any }),
        ("DefaultStorageClass" -> DefaultStorageClass.map { x => x: js.Any }),
        ("KMSKey" -> KMSKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNFSFileShareInput]
    }
  }

  /**
   * <p>CreateNFSFileShareOutput</p>
   */
  @js.native
  trait CreateNFSFileShareOutput extends js.Object {
    var FileShareARN: FileShareARN
  }

  object CreateNFSFileShareOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    ): CreateNFSFileShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FileShareARN" -> FileShareARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNFSFileShareOutput]
    }
  }

  @js.native
  trait CreateSnapshotFromVolumeRecoveryPointInput extends js.Object {
    var VolumeARN: VolumeARN
    var SnapshotDescription: SnapshotDescription
  }

  object CreateSnapshotFromVolumeRecoveryPointInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      SnapshotDescription: js.UndefOr[SnapshotDescription] = js.undefined
    ): CreateSnapshotFromVolumeRecoveryPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("SnapshotDescription" -> SnapshotDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotFromVolumeRecoveryPointInput]
    }
  }

  @js.native
  trait CreateSnapshotFromVolumeRecoveryPointOutput extends js.Object {
    var SnapshotId: SnapshotId
    var VolumeARN: VolumeARN
    var VolumeRecoveryPointTime: string
  }

  object CreateSnapshotFromVolumeRecoveryPointOutput {
    def apply(
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeRecoveryPointTime: js.UndefOr[string] = js.undefined
    ): CreateSnapshotFromVolumeRecoveryPointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("VolumeRecoveryPointTime" -> VolumeRecoveryPointTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotFromVolumeRecoveryPointOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>CreateSnapshotInput$SnapshotDescription</a> </p> </li> <li> <p> <a>CreateSnapshotInput$VolumeARN</a> </p> </li> </ul>
   */
  @js.native
  trait CreateSnapshotInput extends js.Object {
    var VolumeARN: VolumeARN
    var SnapshotDescription: SnapshotDescription
  }

  object CreateSnapshotInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      SnapshotDescription: js.UndefOr[SnapshotDescription] = js.undefined
    ): CreateSnapshotInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("SnapshotDescription" -> SnapshotDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait CreateSnapshotOutput extends js.Object {
    var VolumeARN: VolumeARN
    var SnapshotId: SnapshotId
  }

  object CreateSnapshotOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): CreateSnapshotOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>CreateStorediSCSIVolumeInput$DiskId</a> </p> </li> <li> <p> <a>CreateStorediSCSIVolumeInput$NetworkInterfaceId</a> </p> </li> <li> <p> <a>CreateStorediSCSIVolumeInput$PreserveExistingData</a> </p> </li> <li> <p> <a>CreateStorediSCSIVolumeInput$SnapshotId</a> </p> </li> <li> <p> <a>CreateStorediSCSIVolumeInput$TargetName</a> </p> </li> </ul>
   */
  @js.native
  trait CreateStorediSCSIVolumeInput extends js.Object {
    var TargetName: TargetName
    var SnapshotId: SnapshotId
    var GatewayARN: GatewayARN
    var DiskId: DiskId
    var NetworkInterfaceId: NetworkInterfaceId
    var PreserveExistingData: boolean
  }

  object CreateStorediSCSIVolumeInput {
    def apply(
      TargetName: js.UndefOr[TargetName] = js.undefined,
      SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskId: js.UndefOr[DiskId] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      PreserveExistingData: js.UndefOr[boolean] = js.undefined
    ): CreateStorediSCSIVolumeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetName" -> TargetName.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("DiskId" -> DiskId.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("PreserveExistingData" -> PreserveExistingData.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStorediSCSIVolumeInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait CreateStorediSCSIVolumeOutput extends js.Object {
    var VolumeARN: VolumeARN
    var VolumeSizeInBytes: long
    var TargetARN: TargetARN
  }

  object CreateStorediSCSIVolumeOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined
    ): CreateStorediSCSIVolumeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x: js.Any }),
        ("TargetARN" -> TargetARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStorediSCSIVolumeOutput]
    }
  }

  /**
   * <p>CreateTapeWithBarcodeInput</p>
   */
  @js.native
  trait CreateTapeWithBarcodeInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeSizeInBytes: TapeSize
    var TapeBarcode: TapeBarcode
  }

  object CreateTapeWithBarcodeInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined
    ): CreateTapeWithBarcodeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("TapeSizeInBytes" -> TapeSizeInBytes.map { x => x: js.Any }),
        ("TapeBarcode" -> TapeBarcode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapeWithBarcodeInput]
    }
  }

  /**
   * <p>CreateTapeOutput</p>
   */
  @js.native
  trait CreateTapeWithBarcodeOutput extends js.Object {
    var TapeARN: TapeARN
  }

  object CreateTapeWithBarcodeOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): CreateTapeWithBarcodeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapeWithBarcodeOutput]
    }
  }

  /**
   * <p>CreateTapesInput</p>
   */
  @js.native
  trait CreateTapesInput extends js.Object {
    var TapeSizeInBytes: TapeSize
    var TapeBarcodePrefix: TapeBarcodePrefix
    var ClientToken: ClientToken
    var GatewayARN: GatewayARN
    var NumTapesToCreate: NumTapesToCreate
  }

  object CreateTapesInput {
    def apply(
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeBarcodePrefix: js.UndefOr[TapeBarcodePrefix] = js.undefined,
      ClientToken: js.UndefOr[ClientToken] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      NumTapesToCreate: js.UndefOr[NumTapesToCreate] = js.undefined
    ): CreateTapesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeSizeInBytes" -> TapeSizeInBytes.map { x => x: js.Any }),
        ("TapeBarcodePrefix" -> TapeBarcodePrefix.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("NumTapesToCreate" -> NumTapesToCreate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapesInput]
    }
  }

  /**
   * <p>CreateTapeOutput</p>
   */
  @js.native
  trait CreateTapesOutput extends js.Object {
    var TapeARNs: TapeARNs
  }

  object CreateTapesOutput {
    def apply(
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined
    ): CreateTapesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARNs" -> TapeARNs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTapesOutput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p> <ul> <li> <p> <a>DeleteBandwidthRateLimitInput$BandwidthType</a> </p> </li> </ul>
   */
  @js.native
  trait DeleteBandwidthRateLimitInput extends js.Object {
    var GatewayARN: GatewayARN
    var BandwidthType: BandwidthType
  }

  object DeleteBandwidthRateLimitInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      BandwidthType: js.UndefOr[BandwidthType] = js.undefined
    ): DeleteBandwidthRateLimitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("BandwidthType" -> BandwidthType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBandwidthRateLimitInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway whose bandwidth rate information was deleted.</p>
   */
  @js.native
  trait DeleteBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DeleteBandwidthRateLimitOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DeleteBandwidthRateLimitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBandwidthRateLimitOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>DeleteChapCredentialsInput$InitiatorName</a> </p> </li> <li> <p> <a>DeleteChapCredentialsInput$TargetARN</a> </p> </li> </ul>
   */
  @js.native
  trait DeleteChapCredentialsInput extends js.Object {
    var TargetARN: TargetARN
    var InitiatorName: IqnName
  }

  object DeleteChapCredentialsInput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined
    ): DeleteChapCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetARN" -> TargetARN.map { x => x: js.Any }),
        ("InitiatorName" -> InitiatorName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChapCredentialsInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DeleteChapCredentialsOutput extends js.Object {
    var TargetARN: TargetARN
    var InitiatorName: IqnName
  }

  object DeleteChapCredentialsOutput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined
    ): DeleteChapCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetARN" -> TargetARN.map { x => x: js.Any }),
        ("InitiatorName" -> InitiatorName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteChapCredentialsOutput]
    }
  }

  /**
   * <p>DeleteFileShareInput</p>
   */
  @js.native
  trait DeleteFileShareInput extends js.Object {
    var FileShareARN: FileShareARN
  }

  object DeleteFileShareInput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    ): DeleteFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FileShareARN" -> FileShareARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileShareInput]
    }
  }

  /**
   * <p>DeleteFileShareOutput</p>
   */
  @js.native
  trait DeleteFileShareOutput extends js.Object {
    var FileShareARN: FileShareARN
  }

  object DeleteFileShareOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    ): DeleteFileShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FileShareARN" -> FileShareARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFileShareOutput]
    }
  }

  /**
   * <p>A JSON object containing the id of the gateway to delete.</p>
   */
  @js.native
  trait DeleteGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DeleteGatewayInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DeleteGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGatewayInput]
    }
  }

  /**
   * <p>A JSON object containing the id of the deleted gateway.</p>
   */
  @js.native
  trait DeleteGatewayOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DeleteGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DeleteGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGatewayOutput]
    }
  }

  @js.native
  trait DeleteSnapshotScheduleInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object DeleteSnapshotScheduleInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DeleteSnapshotScheduleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotScheduleInput]
    }
  }

  @js.native
  trait DeleteSnapshotScheduleOutput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object DeleteSnapshotScheduleOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DeleteSnapshotScheduleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotScheduleOutput]
    }
  }

  /**
   * <p>DeleteTapeArchiveInput</p>
   */
  @js.native
  trait DeleteTapeArchiveInput extends js.Object {
    var TapeARN: TapeARN
  }

  object DeleteTapeArchiveInput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): DeleteTapeArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeArchiveInput]
    }
  }

  /**
   * <p>DeleteTapeArchiveOutput</p>
   */
  @js.native
  trait DeleteTapeArchiveOutput extends js.Object {
    var TapeARN: TapeARN
  }

  object DeleteTapeArchiveOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): DeleteTapeArchiveOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeArchiveOutput]
    }
  }

  /**
   * <p>DeleteTapeInput</p>
   */
  @js.native
  trait DeleteTapeInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  object DeleteTapeInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): DeleteTapeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeInput]
    }
  }

  /**
   * <p>DeleteTapeOutput</p>
   */
  @js.native
  trait DeleteTapeOutput extends js.Object {
    var TapeARN: TapeARN
  }

  object DeleteTapeOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): DeleteTapeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTapeOutput]
    }
  }

  /**
   * <p>A JSON object containing the <a>DeleteVolumeInput$VolumeARN</a> to delete.</p>
   */
  @js.native
  trait DeleteVolumeInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object DeleteVolumeInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DeleteVolumeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVolumeInput]
    }
  }

  /**
   * <p>A JSON object containing the of the storage volume that was deleted</p>
   */
  @js.native
  trait DeleteVolumeOutput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object DeleteVolumeOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DeleteVolumeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVolumeOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway.</p>
   */
  @js.native
  trait DescribeBandwidthRateLimitInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeBandwidthRateLimitInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DescribeBandwidthRateLimitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBandwidthRateLimitInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DescribeBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: GatewayARN
    var AverageUploadRateLimitInBitsPerSec: BandwidthUploadRateLimit
    var AverageDownloadRateLimitInBitsPerSec: BandwidthDownloadRateLimit
  }

  object DescribeBandwidthRateLimitOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined,
      AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined
    ): DescribeBandwidthRateLimitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("AverageUploadRateLimitInBitsPerSec" -> AverageUploadRateLimitInBitsPerSec.map { x => x: js.Any }),
        ("AverageDownloadRateLimitInBitsPerSec" -> AverageDownloadRateLimitInBitsPerSec.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBandwidthRateLimitOutput]
    }
  }

  @js.native
  trait DescribeCacheInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeCacheInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DescribeCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheInput]
    }
  }

  @js.native
  trait DescribeCacheOutput extends js.Object {
    var CacheDirtyPercentage: double
    var DiskIds: DiskIds
    var CacheUsedPercentage: double
    var GatewayARN: GatewayARN
    var CacheMissPercentage: double
    var CacheHitPercentage: double
    var CacheAllocatedInBytes: long
  }

  object DescribeCacheOutput {
    def apply(
      CacheDirtyPercentage: js.UndefOr[double] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined,
      CacheUsedPercentage: js.UndefOr[double] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      CacheMissPercentage: js.UndefOr[double] = js.undefined,
      CacheHitPercentage: js.UndefOr[double] = js.undefined,
      CacheAllocatedInBytes: js.UndefOr[long] = js.undefined
    ): DescribeCacheOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CacheDirtyPercentage" -> CacheDirtyPercentage.map { x => x: js.Any }),
        ("DiskIds" -> DiskIds.map { x => x: js.Any }),
        ("CacheUsedPercentage" -> CacheUsedPercentage.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("CacheMissPercentage" -> CacheMissPercentage.map { x => x: js.Any }),
        ("CacheHitPercentage" -> CacheHitPercentage.map { x => x: js.Any }),
        ("CacheAllocatedInBytes" -> CacheAllocatedInBytes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCacheOutput]
    }
  }

  @js.native
  trait DescribeCachediSCSIVolumesInput extends js.Object {
    var VolumeARNs: VolumeARNs
  }

  object DescribeCachediSCSIVolumesInput {
    def apply(
      VolumeARNs: js.UndefOr[VolumeARNs] = js.undefined
    ): DescribeCachediSCSIVolumesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARNs" -> VolumeARNs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCachediSCSIVolumesInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DescribeCachediSCSIVolumesOutput extends js.Object {
    var CachediSCSIVolumes: CachediSCSIVolumes
  }

  object DescribeCachediSCSIVolumesOutput {
    def apply(
      CachediSCSIVolumes: js.UndefOr[CachediSCSIVolumes] = js.undefined
    ): DescribeCachediSCSIVolumesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CachediSCSIVolumes" -> CachediSCSIVolumes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCachediSCSIVolumesOutput]
    }
  }

  /**
   * <p>A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target.</p>
   */
  @js.native
  trait DescribeChapCredentialsInput extends js.Object {
    var TargetARN: TargetARN
  }

  object DescribeChapCredentialsInput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined
    ): DescribeChapCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetARN" -> TargetARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChapCredentialsInput]
    }
  }

  /**
   * <p>A JSON object containing a .</p>
   */
  @js.native
  trait DescribeChapCredentialsOutput extends js.Object {
    var ChapCredentials: ChapCredentials
  }

  object DescribeChapCredentialsOutput {
    def apply(
      ChapCredentials: js.UndefOr[ChapCredentials] = js.undefined
    ): DescribeChapCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ChapCredentials" -> ChapCredentials.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeChapCredentialsOutput]
    }
  }

  /**
   * <p>A JSON object containing the id of the gateway.</p>
   */
  @js.native
  trait DescribeGatewayInformationInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeGatewayInformationInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DescribeGatewayInformationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGatewayInformationInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DescribeGatewayInformationOutput extends js.Object {
    var GatewayNetworkInterfaces: GatewayNetworkInterfaces
    var LastSoftwareUpdate: LastSoftwareUpdate
    var NextUpdateAvailabilityDate: NextUpdateAvailabilityDate
    var GatewayTimezone: GatewayTimezone
    var GatewayARN: GatewayARN
    var GatewayState: GatewayState
    var GatewayName: string
    var GatewayType: GatewayType
    var GatewayId: GatewayId
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
      GatewayId: js.UndefOr[GatewayId] = js.undefined
    ): DescribeGatewayInformationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayNetworkInterfaces" -> GatewayNetworkInterfaces.map { x => x: js.Any }),
        ("LastSoftwareUpdate" -> LastSoftwareUpdate.map { x => x: js.Any }),
        ("NextUpdateAvailabilityDate" -> NextUpdateAvailabilityDate.map { x => x: js.Any }),
        ("GatewayTimezone" -> GatewayTimezone.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("GatewayState" -> GatewayState.map { x => x: js.Any }),
        ("GatewayName" -> GatewayName.map { x => x: js.Any }),
        ("GatewayType" -> GatewayType.map { x => x: js.Any }),
        ("GatewayId" -> GatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGatewayInformationOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway.</p>
   */
  @js.native
  trait DescribeMaintenanceStartTimeInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeMaintenanceStartTimeInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DescribeMaintenanceStartTimeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceStartTimeInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p> <ul> <li> <p> <a>DescribeMaintenanceStartTimeOutput$DayOfWeek</a> </p> </li> <li> <p> <a>DescribeMaintenanceStartTimeOutput$HourOfDay</a> </p> </li> <li> <p> <a>DescribeMaintenanceStartTimeOutput$MinuteOfHour</a> </p> </li> <li> <p> <a>DescribeMaintenanceStartTimeOutput$Timezone</a> </p> </li> </ul>
   */
  @js.native
  trait DescribeMaintenanceStartTimeOutput extends js.Object {
    var Timezone: GatewayTimezone
    var MinuteOfHour: MinuteOfHour
    var GatewayARN: GatewayARN
    var DayOfWeek: DayOfWeek
    var HourOfDay: HourOfDay
  }

  object DescribeMaintenanceStartTimeOutput {
    def apply(
      Timezone: js.UndefOr[GatewayTimezone] = js.undefined,
      MinuteOfHour: js.UndefOr[MinuteOfHour] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
      HourOfDay: js.UndefOr[HourOfDay] = js.undefined
    ): DescribeMaintenanceStartTimeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Timezone" -> Timezone.map { x => x: js.Any }),
        ("MinuteOfHour" -> MinuteOfHour.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("DayOfWeek" -> DayOfWeek.map { x => x: js.Any }),
        ("HourOfDay" -> HourOfDay.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMaintenanceStartTimeOutput]
    }
  }

  /**
   * <p>DescribeNFSFileSharesInput</p>
   */
  @js.native
  trait DescribeNFSFileSharesInput extends js.Object {
    var FileShareARNList: FileShareARNList
  }

  object DescribeNFSFileSharesInput {
    def apply(
      FileShareARNList: js.UndefOr[FileShareARNList] = js.undefined
    ): DescribeNFSFileSharesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FileShareARNList" -> FileShareARNList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNFSFileSharesInput]
    }
  }

  /**
   * <p>DescribeNFSFileSharesOutput</p>
   */
  @js.native
  trait DescribeNFSFileSharesOutput extends js.Object {
    var NFSFileShareInfoList: NFSFileShareInfoList
  }

  object DescribeNFSFileSharesOutput {
    def apply(
      NFSFileShareInfoList: js.UndefOr[NFSFileShareInfoList] = js.undefined
    ): DescribeNFSFileSharesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NFSFileShareInfoList" -> NFSFileShareInfoList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNFSFileSharesOutput]
    }
  }

  /**
   * <p>A JSON object containing the <a>DescribeSnapshotScheduleInput$VolumeARN</a> of the volume.</p>
   */
  @js.native
  trait DescribeSnapshotScheduleInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object DescribeSnapshotScheduleInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DescribeSnapshotScheduleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotScheduleInput]
    }
  }

  @js.native
  trait DescribeSnapshotScheduleOutput extends js.Object {
    var Timezone: GatewayTimezone
    var StartAt: HourOfDay
    var Description: Description
    var RecurrenceInHours: RecurrenceInHours
    var VolumeARN: VolumeARN
  }

  object DescribeSnapshotScheduleOutput {
    def apply(
      Timezone: js.UndefOr[GatewayTimezone] = js.undefined,
      StartAt: js.UndefOr[HourOfDay] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      RecurrenceInHours: js.UndefOr[RecurrenceInHours] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DescribeSnapshotScheduleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Timezone" -> Timezone.map { x => x: js.Any }),
        ("StartAt" -> StartAt.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("RecurrenceInHours" -> RecurrenceInHours.map { x => x: js.Any }),
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotScheduleOutput]
    }
  }

  /**
   * <p>A JSON object containing a list of <a>DescribeStorediSCSIVolumesInput$VolumeARNs</a>.</p>
   */
  @js.native
  trait DescribeStorediSCSIVolumesInput extends js.Object {
    var VolumeARNs: VolumeARNs
  }

  object DescribeStorediSCSIVolumesInput {
    def apply(
      VolumeARNs: js.UndefOr[VolumeARNs] = js.undefined
    ): DescribeStorediSCSIVolumesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARNs" -> VolumeARNs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStorediSCSIVolumesInput]
    }
  }

  @js.native
  trait DescribeStorediSCSIVolumesOutput extends js.Object {
    var StorediSCSIVolumes: StorediSCSIVolumes
  }

  object DescribeStorediSCSIVolumesOutput {
    def apply(
      StorediSCSIVolumes: js.UndefOr[StorediSCSIVolumes] = js.undefined
    ): DescribeStorediSCSIVolumesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StorediSCSIVolumes" -> StorediSCSIVolumes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStorediSCSIVolumesOutput]
    }
  }

  /**
   * <p>DescribeTapeArchivesInput</p>
   */
  @js.native
  trait DescribeTapeArchivesInput extends js.Object {
    var TapeARNs: TapeARNs
    var Marker: Marker
    var Limit: PositiveIntObject
  }

  object DescribeTapeArchivesInput {
    def apply(
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined
    ): DescribeTapeArchivesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARNs" -> TapeARNs.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeArchivesInput]
    }
  }

  /**
   * <p>DescribeTapeArchivesOutput</p>
   */
  @js.native
  trait DescribeTapeArchivesOutput extends js.Object {
    var TapeArchives: TapeArchives
    var Marker: Marker
  }

  object DescribeTapeArchivesOutput {
    def apply(
      TapeArchives: js.UndefOr[TapeArchives] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): DescribeTapeArchivesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeArchives" -> TapeArchives.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeArchivesOutput]
    }
  }

  /**
   * <p>DescribeTapeRecoveryPointsInput</p>
   */
  @js.native
  trait DescribeTapeRecoveryPointsInput extends js.Object {
    var GatewayARN: GatewayARN
    var Marker: Marker
    var Limit: PositiveIntObject
  }

  object DescribeTapeRecoveryPointsInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined
    ): DescribeTapeRecoveryPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeRecoveryPointsInput]
    }
  }

  /**
   * <p>DescribeTapeRecoveryPointsOutput</p>
   */
  @js.native
  trait DescribeTapeRecoveryPointsOutput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeRecoveryPointInfos: TapeRecoveryPointInfos
    var Marker: Marker
  }

  object DescribeTapeRecoveryPointsOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeRecoveryPointInfos: js.UndefOr[TapeRecoveryPointInfos] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): DescribeTapeRecoveryPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("TapeRecoveryPointInfos" -> TapeRecoveryPointInfos.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapeRecoveryPointsOutput]
    }
  }

  /**
   * <p>DescribeTapesInput</p>
   */
  @js.native
  trait DescribeTapesInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARNs: TapeARNs
    var Marker: Marker
    var Limit: PositiveIntObject
  }

  object DescribeTapesInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined
    ): DescribeTapesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("TapeARNs" -> TapeARNs.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapesInput]
    }
  }

  /**
   * <p>DescribeTapesOutput</p>
   */
  @js.native
  trait DescribeTapesOutput extends js.Object {
    var Tapes: Tapes
    var Marker: Marker
  }

  object DescribeTapesOutput {
    def apply(
      Tapes: js.UndefOr[Tapes] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): DescribeTapesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Tapes" -> Tapes.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTapesOutput]
    }
  }

  @js.native
  trait DescribeUploadBufferInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeUploadBufferInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DescribeUploadBufferInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUploadBufferInput]
    }
  }

  @js.native
  trait DescribeUploadBufferOutput extends js.Object {
    var GatewayARN: GatewayARN
    var DiskIds: DiskIds
    var UploadBufferUsedInBytes: long
    var UploadBufferAllocatedInBytes: long
  }

  object DescribeUploadBufferOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined,
      UploadBufferUsedInBytes: js.UndefOr[long] = js.undefined,
      UploadBufferAllocatedInBytes: js.UndefOr[long] = js.undefined
    ): DescribeUploadBufferOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("DiskIds" -> DiskIds.map { x => x: js.Any }),
        ("UploadBufferUsedInBytes" -> UploadBufferUsedInBytes.map { x => x: js.Any }),
        ("UploadBufferAllocatedInBytes" -> UploadBufferAllocatedInBytes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUploadBufferOutput]
    }
  }

  /**
   * <p>DescribeVTLDevicesInput</p>
   */
  @js.native
  trait DescribeVTLDevicesInput extends js.Object {
    var GatewayARN: GatewayARN
    var VTLDeviceARNs: VTLDeviceARNs
    var Marker: Marker
    var Limit: PositiveIntObject
  }

  object DescribeVTLDevicesInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      VTLDeviceARNs: js.UndefOr[VTLDeviceARNs] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined
    ): DescribeVTLDevicesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("VTLDeviceARNs" -> VTLDeviceARNs.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVTLDevicesInput]
    }
  }

  /**
   * <p>DescribeVTLDevicesOutput</p>
   */
  @js.native
  trait DescribeVTLDevicesOutput extends js.Object {
    var GatewayARN: GatewayARN
    var VTLDevices: VTLDevices
    var Marker: Marker
  }

  object DescribeVTLDevicesOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      VTLDevices: js.UndefOr[VTLDevices] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): DescribeVTLDevicesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("VTLDevices" -> VTLDevices.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVTLDevicesOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway.</p>
   */
  @js.native
  trait DescribeWorkingStorageInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeWorkingStorageInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DescribeWorkingStorageInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkingStorageInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait DescribeWorkingStorageOutput extends js.Object {
    var GatewayARN: GatewayARN
    var DiskIds: DiskIds
    var WorkingStorageUsedInBytes: long
    var WorkingStorageAllocatedInBytes: long
  }

  object DescribeWorkingStorageOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      DiskIds: js.UndefOr[DiskIds] = js.undefined,
      WorkingStorageUsedInBytes: js.UndefOr[long] = js.undefined,
      WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.undefined
    ): DescribeWorkingStorageOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("DiskIds" -> DiskIds.map { x => x: js.Any }),
        ("WorkingStorageUsedInBytes" -> WorkingStorageUsedInBytes.map { x => x: js.Any }),
        ("WorkingStorageAllocatedInBytes" -> WorkingStorageAllocatedInBytes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeWorkingStorageOutput]
    }
  }

  /**
   * <p>Lists iSCSI information about a VTL device.</p>
   */
  @js.native
  trait DeviceiSCSIAttributes extends js.Object {
    var TargetARN: TargetARN
    var NetworkInterfaceId: NetworkInterfaceId
    var NetworkInterfacePort: integer
    var ChapEnabled: boolean
  }

  object DeviceiSCSIAttributes {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      NetworkInterfacePort: js.UndefOr[integer] = js.undefined,
      ChapEnabled: js.UndefOr[boolean] = js.undefined
    ): DeviceiSCSIAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetARN" -> TargetARN.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("NetworkInterfacePort" -> NetworkInterfacePort.map { x => x: js.Any }),
        ("ChapEnabled" -> ChapEnabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceiSCSIAttributes]
    }
  }

  /**
   * <p>DisableGatewayInput</p>
   */
  @js.native
  trait DisableGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DisableGatewayInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DisableGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableGatewayInput]
    }
  }

  /**
   * <p>DisableGatewayOutput</p>
   */
  @js.native
  trait DisableGatewayOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DisableGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DisableGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableGatewayOutput]
    }
  }

  @js.native
  trait Disk extends js.Object {
    var DiskPath: string
    var DiskAllocationResource: string
    var DiskNode: string
    var DiskStatus: string
    var DiskId: DiskId
    var DiskAllocationType: DiskAllocationType
    var DiskSizeInBytes: long
  }

  object Disk {
    def apply(
      DiskPath: js.UndefOr[string] = js.undefined,
      DiskAllocationResource: js.UndefOr[string] = js.undefined,
      DiskNode: js.UndefOr[string] = js.undefined,
      DiskStatus: js.UndefOr[string] = js.undefined,
      DiskId: js.UndefOr[DiskId] = js.undefined,
      DiskAllocationType: js.UndefOr[DiskAllocationType] = js.undefined,
      DiskSizeInBytes: js.UndefOr[long] = js.undefined
    ): Disk = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DiskPath" -> DiskPath.map { x => x: js.Any }),
        ("DiskAllocationResource" -> DiskAllocationResource.map { x => x: js.Any }),
        ("DiskNode" -> DiskNode.map { x => x: js.Any }),
        ("DiskStatus" -> DiskStatus.map { x => x: js.Any }),
        ("DiskId" -> DiskId.map { x => x: js.Any }),
        ("DiskAllocationType" -> DiskAllocationType.map { x => x: js.Any }),
        ("DiskSizeInBytes" -> DiskSizeInBytes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Disk]
    }
  }


  object ErrorCodeEnum {
    val ActivationKeyExpired = "ActivationKeyExpired"
    val ActivationKeyInvalid = "ActivationKeyInvalid"
    val ActivationKeyNotFound = "ActivationKeyNotFound"
    val GatewayInternalError = "GatewayInternalError"
    val GatewayNotConnected = "GatewayNotConnected"
    val GatewayNotFound = "GatewayNotFound"
    val GatewayProxyNetworkConnectionBusy = "GatewayProxyNetworkConnectionBusy"
    val AuthenticationFailure = "AuthenticationFailure"
    val BandwidthThrottleScheduleNotFound = "BandwidthThrottleScheduleNotFound"
    val Blocked = "Blocked"
    val CannotExportSnapshot = "CannotExportSnapshot"
    val ChapCredentialNotFound = "ChapCredentialNotFound"
    val DiskAlreadyAllocated = "DiskAlreadyAllocated"
    val DiskDoesNotExist = "DiskDoesNotExist"
    val DiskSizeGreaterThanVolumeMaxSize = "DiskSizeGreaterThanVolumeMaxSize"
    val DiskSizeLessThanVolumeSize = "DiskSizeLessThanVolumeSize"
    val DiskSizeNotGigAligned = "DiskSizeNotGigAligned"
    val DuplicateCertificateInfo = "DuplicateCertificateInfo"
    val DuplicateSchedule = "DuplicateSchedule"
    val EndpointNotFound = "EndpointNotFound"
    val IAMNotSupported = "IAMNotSupported"
    val InitiatorInvalid = "InitiatorInvalid"
    val InitiatorNotFound = "InitiatorNotFound"
    val InternalError = "InternalError"
    val InvalidGateway = "InvalidGateway"
    val InvalidEndpoint = "InvalidEndpoint"
    val InvalidParameters = "InvalidParameters"
    val InvalidSchedule = "InvalidSchedule"
    val LocalStorageLimitExceeded = "LocalStorageLimitExceeded"
    val `LunAlreadyAllocated ` = "LunAlreadyAllocated "
    val LunInvalid = "LunInvalid"
    val MaximumContentLengthExceeded = "MaximumContentLengthExceeded"
    val MaximumTapeCartridgeCountExceeded = "MaximumTapeCartridgeCountExceeded"
    val MaximumVolumeCountExceeded = "MaximumVolumeCountExceeded"
    val NetworkConfigurationChanged = "NetworkConfigurationChanged"
    val NoDisksAvailable = "NoDisksAvailable"
    val NotImplemented = "NotImplemented"
    val NotSupported = "NotSupported"
    val OperationAborted = "OperationAborted"
    val OutdatedGateway = "OutdatedGateway"
    val ParametersNotImplemented = "ParametersNotImplemented"
    val RegionInvalid = "RegionInvalid"
    val RequestTimeout = "RequestTimeout"
    val ServiceUnavailable = "ServiceUnavailable"
    val SnapshotDeleted = "SnapshotDeleted"
    val SnapshotIdInvalid = "SnapshotIdInvalid"
    val SnapshotInProgress = "SnapshotInProgress"
    val SnapshotNotFound = "SnapshotNotFound"
    val SnapshotScheduleNotFound = "SnapshotScheduleNotFound"
    val StagingAreaFull = "StagingAreaFull"
    val StorageFailure = "StorageFailure"
    val TapeCartridgeNotFound = "TapeCartridgeNotFound"
    val TargetAlreadyExists = "TargetAlreadyExists"
    val TargetInvalid = "TargetInvalid"
    val TargetNotFound = "TargetNotFound"
    val UnauthorizedOperation = "UnauthorizedOperation"
    val VolumeAlreadyExists = "VolumeAlreadyExists"
    val VolumeIdInvalid = "VolumeIdInvalid"
    val VolumeInUse = "VolumeInUse"
    val VolumeNotFound = "VolumeNotFound"
    val VolumeNotReady = "VolumeNotReady"

    val values = IndexedSeq(ActivationKeyExpired, ActivationKeyInvalid, ActivationKeyNotFound, GatewayInternalError, GatewayNotConnected, GatewayNotFound, GatewayProxyNetworkConnectionBusy, AuthenticationFailure, BandwidthThrottleScheduleNotFound, Blocked, CannotExportSnapshot, ChapCredentialNotFound, DiskAlreadyAllocated, DiskDoesNotExist, DiskSizeGreaterThanVolumeMaxSize, DiskSizeLessThanVolumeSize, DiskSizeNotGigAligned, DuplicateCertificateInfo, DuplicateSchedule, EndpointNotFound, IAMNotSupported, InitiatorInvalid, InitiatorNotFound, InternalError, InvalidGateway, InvalidEndpoint, InvalidParameters, InvalidSchedule, LocalStorageLimitExceeded, `LunAlreadyAllocated `, LunInvalid, MaximumContentLengthExceeded, MaximumTapeCartridgeCountExceeded, MaximumVolumeCountExceeded, NetworkConfigurationChanged, NoDisksAvailable, NotImplemented, NotSupported, OperationAborted, OutdatedGateway, ParametersNotImplemented, RegionInvalid, RequestTimeout, ServiceUnavailable, SnapshotDeleted, SnapshotIdInvalid, SnapshotInProgress, SnapshotNotFound, SnapshotScheduleNotFound, StagingAreaFull, StorageFailure, TapeCartridgeNotFound, TargetAlreadyExists, TargetInvalid, TargetNotFound, UnauthorizedOperation, VolumeAlreadyExists, VolumeIdInvalid, VolumeInUse, VolumeNotFound, VolumeNotReady)
  }

  /**
   * <p>Describes a file share.</p>
   */
  @js.native
  trait FileShareInfo extends js.Object {
    var FileShareARN: FileShareARN
    var FileShareId: FileShareId
    var FileShareStatus: FileShareStatus
    var GatewayARN: GatewayARN
  }

  object FileShareInfo {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      FileShareId: js.UndefOr[FileShareId] = js.undefined,
      FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): FileShareInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FileShareARN" -> FileShareARN.map { x => x: js.Any }),
        ("FileShareId" -> FileShareId.map { x => x: js.Any }),
        ("FileShareStatus" -> FileShareStatus.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FileShareInfo]
    }
  }

  /**
   * <p>Describes a gateway object.</p>
   */
  @js.native
  trait GatewayInfo extends js.Object {
    var GatewayARN: GatewayARN
    var GatewayName: string
    var GatewayType: GatewayType
    var GatewayOperationalState: GatewayOperationalState
    var GatewayId: GatewayId
  }

  object GatewayInfo {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayName: js.UndefOr[string] = js.undefined,
      GatewayType: js.UndefOr[GatewayType] = js.undefined,
      GatewayOperationalState: js.UndefOr[GatewayOperationalState] = js.undefined,
      GatewayId: js.UndefOr[GatewayId] = js.undefined
    ): GatewayInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("GatewayName" -> GatewayName.map { x => x: js.Any }),
        ("GatewayType" -> GatewayType.map { x => x: js.Any }),
        ("GatewayOperationalState" -> GatewayOperationalState.map { x => x: js.Any }),
        ("GatewayId" -> GatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GatewayInfo]
    }
  }

  /**
   * <p>An internal server error has occurred during the request. For more information, see the error and message fields.</p>
   */
  @js.native
  trait InternalServerErrorException extends js.Object {
    var message: string
    var error: StorageGatewayError
  }

  /**
   * <p>An exception occurred because an invalid gateway request was issued to the service. For more information, see the error and message fields.</p>
   */
  @js.native
  trait InvalidGatewayRequestExceptionException extends js.Object {
    var message: string
    var error: StorageGatewayError
  }

  /**
   * <p>ListFileShareInput</p>
   */
  @js.native
  trait ListFileSharesInput extends js.Object {
    var GatewayARN: GatewayARN
    var Limit: PositiveIntObject
    var Marker: Marker
  }

  object ListFileSharesInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListFileSharesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFileSharesInput]
    }
  }

  /**
   * <p>ListFileShareOutput</p>
   */
  @js.native
  trait ListFileSharesOutput extends js.Object {
    var Marker: Marker
    var NextMarker: Marker
    var FileShareInfoList: FileShareInfoList
  }

  object ListFileSharesOutput {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      NextMarker: js.UndefOr[Marker] = js.undefined,
      FileShareInfoList: js.UndefOr[FileShareInfoList] = js.undefined
    ): ListFileSharesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("NextMarker" -> NextMarker.map { x => x: js.Any }),
        ("FileShareInfoList" -> FileShareInfoList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFileSharesOutput]
    }
  }

  /**
   * <p>A JSON object containing zero or more of the following fields:</p> <ul> <li> <p> <a>ListGatewaysInput$Limit</a> </p> </li> <li> <p> <a>ListGatewaysInput$Marker</a> </p> </li> </ul>
   */
  @js.native
  trait ListGatewaysInput extends js.Object {
    var Marker: Marker
    var Limit: PositiveIntObject
  }

  object ListGatewaysInput {
    def apply(
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined
    ): ListGatewaysInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGatewaysInput]
    }
  }

  @js.native
  trait ListGatewaysOutput extends js.Object {
    var Gateways: Gateways
    var Marker: Marker
  }

  object ListGatewaysOutput {
    def apply(
      Gateways: js.UndefOr[Gateways] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListGatewaysOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Gateways" -> Gateways.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGatewaysOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway.</p>
   */
  @js.native
  trait ListLocalDisksInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ListLocalDisksInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ListLocalDisksInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocalDisksInput]
    }
  }

  @js.native
  trait ListLocalDisksOutput extends js.Object {
    var GatewayARN: GatewayARN
    var Disks: Disks
  }

  object ListLocalDisksOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Disks: js.UndefOr[Disks] = js.undefined
    ): ListLocalDisksOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("Disks" -> Disks.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLocalDisksOutput]
    }
  }

  /**
   * <p>ListTagsForResourceInput</p>
   */
  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var Marker: Marker
    var Limit: PositiveIntObject
  }

  object ListTagsForResourceInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined
    ): ListTagsForResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceARN" -> ResourceARN.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceInput]
    }
  }

  /**
   * <p>ListTagsForResourceOutput</p>
   */
  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var ResourceARN: ResourceARN
    var Marker: Marker
    var Tags: Tags
  }

  object ListTagsForResourceOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceARN" -> ResourceARN.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /**
   * <p>A JSON object that contains one or more of the following fields:</p> <ul> <li> <p> <a>ListTapesInput$Limit</a> </p> </li> <li> <p> <a>ListTapesInput$Marker</a> </p> </li> <li> <p> <a>ListTapesInput$TapeARNs</a> </p> </li> </ul>
   */
  @js.native
  trait ListTapesInput extends js.Object {
    var TapeARNs: TapeARNs
    var Marker: Marker
    var Limit: PositiveIntObject
  }

  object ListTapesInput {
    def apply(
      TapeARNs: js.UndefOr[TapeARNs] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined
    ): ListTapesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARNs" -> TapeARNs.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTapesInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p> <ul> <li> <p> <a>ListTapesOutput$Marker</a> </p> </li> <li> <p> <a>ListTapesOutput$VolumeInfos</a> </p> </li> </ul>
   */
  @js.native
  trait ListTapesOutput extends js.Object {
    var TapeInfos: TapeInfos
    var Marker: Marker
  }

  object ListTapesOutput {
    def apply(
      TapeInfos: js.UndefOr[TapeInfos] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined
    ): ListTapesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeInfos" -> TapeInfos.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTapesOutput]
    }
  }

  /**
   * <p>ListVolumeInitiatorsInput</p>
   */
  @js.native
  trait ListVolumeInitiatorsInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object ListVolumeInitiatorsInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): ListVolumeInitiatorsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumeInitiatorsInput]
    }
  }

  /**
   * <p>ListVolumeInitiatorsOutput</p>
   */
  @js.native
  trait ListVolumeInitiatorsOutput extends js.Object {
    var Initiators: Initiators
  }

  object ListVolumeInitiatorsOutput {
    def apply(
      Initiators: js.UndefOr[Initiators] = js.undefined
    ): ListVolumeInitiatorsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Initiators" -> Initiators.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumeInitiatorsOutput]
    }
  }

  @js.native
  trait ListVolumeRecoveryPointsInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ListVolumeRecoveryPointsInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ListVolumeRecoveryPointsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumeRecoveryPointsInput]
    }
  }

  @js.native
  trait ListVolumeRecoveryPointsOutput extends js.Object {
    var GatewayARN: GatewayARN
    var VolumeRecoveryPointInfos: VolumeRecoveryPointInfos
  }

  object ListVolumeRecoveryPointsOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      VolumeRecoveryPointInfos: js.UndefOr[VolumeRecoveryPointInfos] = js.undefined
    ): ListVolumeRecoveryPointsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("VolumeRecoveryPointInfos" -> VolumeRecoveryPointInfos.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumeRecoveryPointsOutput]
    }
  }

  /**
   * <p>A JSON object that contains one or more of the following fields:</p> <ul> <li> <p> <a>ListVolumesInput$Limit</a> </p> </li> <li> <p> <a>ListVolumesInput$Marker</a> </p> </li> </ul>
   */
  @js.native
  trait ListVolumesInput extends js.Object {
    var GatewayARN: GatewayARN
    var Marker: Marker
    var Limit: PositiveIntObject
  }

  object ListVolumesInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      Limit: js.UndefOr[PositiveIntObject] = js.undefined
    ): ListVolumesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Limit" -> Limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumesInput]
    }
  }

  @js.native
  trait ListVolumesOutput extends js.Object {
    var GatewayARN: GatewayARN
    var Marker: Marker
    var VolumeInfos: VolumeInfos
  }

  object ListVolumesOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      Marker: js.UndefOr[Marker] = js.undefined,
      VolumeInfos: js.UndefOr[VolumeInfos] = js.undefined
    ): ListVolumesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("VolumeInfos" -> VolumeInfos.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVolumesOutput]
    }
  }

  /**
   * <p>Describes file share default values. Files and folders stored as Amazon S3 objects in S3 buckets don't, by default, have Unix file permissions assigned to them. Upon discovery in an S3 bucket by Storage Gateway, the S3 objects that represent files and folders are assigned these default Unix permissions. </p>
   */
  @js.native
  trait NFSFileShareDefaults extends js.Object {
    var FileMode: PermissionMode
    var DirectoryMode: PermissionMode
    var GroupId: PermissionId
    var OwnerId: PermissionId
  }

  object NFSFileShareDefaults {
    def apply(
      FileMode: js.UndefOr[PermissionMode] = js.undefined,
      DirectoryMode: js.UndefOr[PermissionMode] = js.undefined,
      GroupId: js.UndefOr[PermissionId] = js.undefined,
      OwnerId: js.UndefOr[PermissionId] = js.undefined
    ): NFSFileShareDefaults = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FileMode" -> FileMode.map { x => x: js.Any }),
        ("DirectoryMode" -> DirectoryMode.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NFSFileShareDefaults]
    }
  }

  /**
   * <p>The Unix file permissions and ownership information assigned, by default, to native S3 objects when Storage Gateway discovers them in S3 buckets.</p>
   */
  @js.native
  trait NFSFileShareInfo extends js.Object {
    var Role: Role
    var Path: Path
    var LocationARN: LocationARN
    var GatewayARN: GatewayARN
    var FileShareStatus: FileShareStatus
    var NFSFileShareDefaults: NFSFileShareDefaults
    var FileShareARN: FileShareARN
    var KMSEncrypted: boolean
    var FileShareId: FileShareId
    var DefaultStorageClass: StorageClass
    var KMSKey: KMSKey
  }

  object NFSFileShareInfo {
    def apply(
      Role: js.UndefOr[Role] = js.undefined,
      Path: js.UndefOr[Path] = js.undefined,
      LocationARN: js.UndefOr[LocationARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined,
      NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      KMSEncrypted: js.UndefOr[boolean] = js.undefined,
      FileShareId: js.UndefOr[FileShareId] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined
    ): NFSFileShareInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Role" -> Role.map { x => x: js.Any }),
        ("Path" -> Path.map { x => x: js.Any }),
        ("LocationARN" -> LocationARN.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("FileShareStatus" -> FileShareStatus.map { x => x: js.Any }),
        ("NFSFileShareDefaults" -> NFSFileShareDefaults.map { x => x: js.Any }),
        ("FileShareARN" -> FileShareARN.map { x => x: js.Any }),
        ("KMSEncrypted" -> KMSEncrypted.map { x => x: js.Any }),
        ("FileShareId" -> FileShareId.map { x => x: js.Any }),
        ("DefaultStorageClass" -> DefaultStorageClass.map { x => x: js.Any }),
        ("KMSKey" -> KMSKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NFSFileShareInfo]
    }
  }

  /**
   * <p>Describes a gateway's network interface.</p>
   */
  @js.native
  trait NetworkInterface extends js.Object {
    var Ipv4Address: string
    var MacAddress: string
    var Ipv6Address: string
  }

  object NetworkInterface {
    def apply(
      Ipv4Address: js.UndefOr[string] = js.undefined,
      MacAddress: js.UndefOr[string] = js.undefined,
      Ipv6Address: js.UndefOr[string] = js.undefined
    ): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv4Address" -> Ipv4Address.map { x => x: js.Any }),
        ("MacAddress" -> MacAddress.map { x => x: js.Any }),
        ("Ipv6Address" -> Ipv6Address.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
    }
  }

  /**
   * <p>RemoveTagsFromResourceInput</p>
   */
  @js.native
  trait RemoveTagsFromResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var TagKeys: TagKeys
  }

  object RemoveTagsFromResourceInput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      TagKeys: js.UndefOr[TagKeys] = js.undefined
    ): RemoveTagsFromResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceARN" -> ResourceARN.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceInput]
    }
  }

  /**
   * <p>RemoveTagsFromResourceOutput</p>
   */
  @js.native
  trait RemoveTagsFromResourceOutput extends js.Object {
    var ResourceARN: ResourceARN
  }

  object RemoveTagsFromResourceOutput {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    ): RemoveTagsFromResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceARN" -> ResourceARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceOutput]
    }
  }

  @js.native
  trait ResetCacheInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ResetCacheInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ResetCacheInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetCacheInput]
    }
  }

  @js.native
  trait ResetCacheOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ResetCacheOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ResetCacheOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetCacheOutput]
    }
  }

  /**
   * <p>RetrieveTapeArchiveInput</p>
   */
  @js.native
  trait RetrieveTapeArchiveInput extends js.Object {
    var TapeARN: TapeARN
    var GatewayARN: GatewayARN
  }

  object RetrieveTapeArchiveInput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): RetrieveTapeArchiveInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeArchiveInput]
    }
  }

  /**
   * <p>RetrieveTapeArchiveOutput</p>
   */
  @js.native
  trait RetrieveTapeArchiveOutput extends js.Object {
    var TapeARN: TapeARN
  }

  object RetrieveTapeArchiveOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): RetrieveTapeArchiveOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeArchiveOutput]
    }
  }

  /**
   * <p>RetrieveTapeRecoveryPointInput</p>
   */
  @js.native
  trait RetrieveTapeRecoveryPointInput extends js.Object {
    var TapeARN: TapeARN
    var GatewayARN: GatewayARN
  }

  object RetrieveTapeRecoveryPointInput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): RetrieveTapeRecoveryPointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeRecoveryPointInput]
    }
  }

  /**
   * <p>RetrieveTapeRecoveryPointOutput</p>
   */
  @js.native
  trait RetrieveTapeRecoveryPointOutput extends js.Object {
    var TapeARN: TapeARN
  }

  object RetrieveTapeRecoveryPointOutput {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): RetrieveTapeRecoveryPointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveTapeRecoveryPointOutput]
    }
  }

  /**
   * <p>An internal server error has occurred because the service is unavailable. For more information, see the error and message fields.</p>
   */
  @js.native
  trait ServiceUnavailableErrorException extends js.Object {
    var message: string
    var error: StorageGatewayError
  }

  /**
   * <p>SetLocalConsolePasswordInput</p>
   */
  @js.native
  trait SetLocalConsolePasswordInput extends js.Object {
    var GatewayARN: GatewayARN
    var LocalConsolePassword: LocalConsolePassword
  }

  object SetLocalConsolePasswordInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      LocalConsolePassword: js.UndefOr[LocalConsolePassword] = js.undefined
    ): SetLocalConsolePasswordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("LocalConsolePassword" -> LocalConsolePassword.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLocalConsolePasswordInput]
    }
  }

  @js.native
  trait SetLocalConsolePasswordOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object SetLocalConsolePasswordOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): SetLocalConsolePasswordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetLocalConsolePasswordOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway to shut down.</p>
   */
  @js.native
  trait ShutdownGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ShutdownGatewayInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ShutdownGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShutdownGatewayInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway that was shut down.</p>
   */
  @js.native
  trait ShutdownGatewayOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ShutdownGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ShutdownGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShutdownGatewayOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway to start.</p>
   */
  @js.native
  trait StartGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object StartGatewayInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): StartGatewayInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartGatewayInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway that was restarted.</p>
   */
  @js.native
  trait StartGatewayOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object StartGatewayOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): StartGatewayOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartGatewayOutput]
    }
  }

  /**
   * <p>Provides additional information about an error that was returned by the service as an or. See the <code>errorCode</code> and <code>errorDetails</code> members for more information about the error.</p>
   */
  @js.native
  trait StorageGatewayError extends js.Object {
    var errorCode: ErrorCode
    var errorDetails: errorDetails
  }

  object StorageGatewayError {
    def apply(
      errorCode: js.UndefOr[ErrorCode] = js.undefined,
      errorDetails: js.UndefOr[errorDetails] = js.undefined
    ): StorageGatewayError = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("errorCode" -> errorCode.map { x => x: js.Any }),
        ("errorDetails" -> errorDetails.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageGatewayError]
    }
  }

  /**
   * <p>Describes an iSCSI stored volume.</p>
   */
  @js.native
  trait StorediSCSIVolume extends js.Object {
    var VolumeType: VolumeType
    var VolumeDiskId: DiskId
    var CreatedDate: CreatedDate
    var VolumeId: VolumeId
    var PreservedExistingData: boolean
    var VolumeProgress: DoubleObject
    var VolumeStatus: VolumeStatus
    var VolumeARN: VolumeARN
    var VolumeiSCSIAttributes: VolumeiSCSIAttributes
    var VolumeSizeInBytes: long
    var SourceSnapshotId: SnapshotId
  }

  object StorediSCSIVolume {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      VolumeDiskId: js.UndefOr[DiskId] = js.undefined,
      CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
      VolumeId: js.UndefOr[VolumeId] = js.undefined,
      PreservedExistingData: js.UndefOr[boolean] = js.undefined,
      VolumeProgress: js.UndefOr[DoubleObject] = js.undefined,
      VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): StorediSCSIVolume = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("VolumeDiskId" -> VolumeDiskId.map { x => x: js.Any }),
        ("CreatedDate" -> CreatedDate.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("PreservedExistingData" -> PreservedExistingData.map { x => x: js.Any }),
        ("VolumeProgress" -> VolumeProgress.map { x => x: js.Any }),
        ("VolumeStatus" -> VolumeStatus.map { x => x: js.Any }),
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("VolumeiSCSIAttributes" -> VolumeiSCSIAttributes.map { x => x: js.Any }),
        ("VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x: js.Any }),
        ("SourceSnapshotId" -> SourceSnapshotId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Describes a virtual tape object.</p>
   */
  @js.native
  trait Tape extends js.Object {
    var TapeSizeInBytes: TapeSize
    var TapeStatus: TapeStatus
    var VTLDevice: VTLDeviceARN
    var TapeCreatedDate: Time
    var TapeBarcode: TapeBarcode
    var TapeARN: TapeARN
    var Progress: DoubleObject
  }

  object Tape {
    def apply(
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeStatus] = js.undefined,
      VTLDevice: js.UndefOr[VTLDeviceARN] = js.undefined,
      TapeCreatedDate: js.UndefOr[Time] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      Progress: js.UndefOr[DoubleObject] = js.undefined
    ): Tape = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeSizeInBytes" -> TapeSizeInBytes.map { x => x: js.Any }),
        ("TapeStatus" -> TapeStatus.map { x => x: js.Any }),
        ("VTLDevice" -> VTLDevice.map { x => x: js.Any }),
        ("TapeCreatedDate" -> TapeCreatedDate.map { x => x: js.Any }),
        ("TapeBarcode" -> TapeBarcode.map { x => x: js.Any }),
        ("TapeARN" -> TapeARN.map { x => x: js.Any }),
        ("Progress" -> Progress.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tape]
    }
  }

  /**
   * <p>Represents a virtual tape that is archived in the virtual tape shelf (VTS).</p>
   */
  @js.native
  trait TapeArchive extends js.Object {
    var TapeSizeInBytes: TapeSize
    var TapeStatus: TapeArchiveStatus
    var TapeCreatedDate: Time
    var CompletionTime: Time
    var TapeBarcode: TapeBarcode
    var TapeARN: TapeARN
    var RetrievedTo: GatewayARN
  }

  object TapeArchive {
    def apply(
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeArchiveStatus] = js.undefined,
      TapeCreatedDate: js.UndefOr[Time] = js.undefined,
      CompletionTime: js.UndefOr[Time] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      RetrievedTo: js.UndefOr[GatewayARN] = js.undefined
    ): TapeArchive = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeSizeInBytes" -> TapeSizeInBytes.map { x => x: js.Any }),
        ("TapeStatus" -> TapeStatus.map { x => x: js.Any }),
        ("TapeCreatedDate" -> TapeCreatedDate.map { x => x: js.Any }),
        ("CompletionTime" -> CompletionTime.map { x => x: js.Any }),
        ("TapeBarcode" -> TapeBarcode.map { x => x: js.Any }),
        ("TapeARN" -> TapeARN.map { x => x: js.Any }),
        ("RetrievedTo" -> RetrievedTo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TapeArchive]
    }
  }

  /**
   * <p>Describes a virtual tape.</p>
   */
  @js.native
  trait TapeInfo extends js.Object {
    var TapeSizeInBytes: TapeSize
    var TapeStatus: TapeStatus
    var GatewayARN: GatewayARN
    var TapeBarcode: TapeBarcode
    var TapeARN: TapeARN
  }

  object TapeInfo {
    def apply(
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeStatus] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
      TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): TapeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeSizeInBytes" -> TapeSizeInBytes.map { x => x: js.Any }),
        ("TapeStatus" -> TapeStatus.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("TapeBarcode" -> TapeBarcode.map { x => x: js.Any }),
        ("TapeARN" -> TapeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TapeInfo]
    }
  }

  /**
   * <p>Describes a recovery point.</p>
   */
  @js.native
  trait TapeRecoveryPointInfo extends js.Object {
    var TapeARN: TapeARN
    var TapeRecoveryPointTime: Time
    var TapeSizeInBytes: TapeSize
    var TapeStatus: TapeRecoveryPointStatus
  }

  object TapeRecoveryPointInfo {
    def apply(
      TapeARN: js.UndefOr[TapeARN] = js.undefined,
      TapeRecoveryPointTime: js.UndefOr[Time] = js.undefined,
      TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
      TapeStatus: js.UndefOr[TapeRecoveryPointStatus] = js.undefined
    ): TapeRecoveryPointInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TapeARN" -> TapeARN.map { x => x: js.Any }),
        ("TapeRecoveryPointTime" -> TapeRecoveryPointTime.map { x => x: js.Any }),
        ("TapeSizeInBytes" -> TapeSizeInBytes.map { x => x: js.Any }),
        ("TapeStatus" -> TapeStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TapeRecoveryPointInfo]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>UpdateBandwidthRateLimitInput$AverageDownloadRateLimitInBitsPerSec</a> </p> </li> <li> <p> <a>UpdateBandwidthRateLimitInput$AverageUploadRateLimitInBitsPerSec</a> </p> </li> </ul>
   */
  @js.native
  trait UpdateBandwidthRateLimitInput extends js.Object {
    var GatewayARN: GatewayARN
    var AverageUploadRateLimitInBitsPerSec: BandwidthUploadRateLimit
    var AverageDownloadRateLimitInBitsPerSec: BandwidthDownloadRateLimit
  }

  object UpdateBandwidthRateLimitInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined,
      AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined
    ): UpdateBandwidthRateLimitInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("AverageUploadRateLimitInBitsPerSec" -> AverageUploadRateLimitInBitsPerSec.map { x => x: js.Any }),
        ("AverageDownloadRateLimitInBitsPerSec" -> AverageDownloadRateLimitInBitsPerSec.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBandwidthRateLimitInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway whose throttle information was updated.</p>
   */
  @js.native
  trait UpdateBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object UpdateBandwidthRateLimitOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): UpdateBandwidthRateLimitOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBandwidthRateLimitOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>UpdateChapCredentialsInput$InitiatorName</a> </p> </li> <li> <p> <a>UpdateChapCredentialsInput$SecretToAuthenticateInitiator</a> </p> </li> <li> <p> <a>UpdateChapCredentialsInput$SecretToAuthenticateTarget</a> </p> </li> <li> <p> <a>UpdateChapCredentialsInput$TargetARN</a> </p> </li> </ul>
   */
  @js.native
  trait UpdateChapCredentialsInput extends js.Object {
    var TargetARN: TargetARN
    var SecretToAuthenticateInitiator: ChapSecret
    var InitiatorName: IqnName
    var SecretToAuthenticateTarget: ChapSecret
  }

  object UpdateChapCredentialsInput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      SecretToAuthenticateInitiator: js.UndefOr[ChapSecret] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined,
      SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined
    ): UpdateChapCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetARN" -> TargetARN.map { x => x: js.Any }),
        ("SecretToAuthenticateInitiator" -> SecretToAuthenticateInitiator.map { x => x: js.Any }),
        ("InitiatorName" -> InitiatorName.map { x => x: js.Any }),
        ("SecretToAuthenticateTarget" -> SecretToAuthenticateTarget.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChapCredentialsInput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p>
   */
  @js.native
  trait UpdateChapCredentialsOutput extends js.Object {
    var TargetARN: TargetARN
    var InitiatorName: IqnName
  }

  object UpdateChapCredentialsOutput {
    def apply(
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      InitiatorName: js.UndefOr[IqnName] = js.undefined
    ): UpdateChapCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetARN" -> TargetARN.map { x => x: js.Any }),
        ("InitiatorName" -> InitiatorName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateChapCredentialsOutput]
    }
  }

  @js.native
  trait UpdateGatewayInformationInput extends js.Object {
    var GatewayARN: GatewayARN
    var GatewayName: GatewayName
    var GatewayTimezone: GatewayTimezone
  }

  object UpdateGatewayInformationInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayName: js.UndefOr[GatewayName] = js.undefined,
      GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined
    ): UpdateGatewayInformationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("GatewayName" -> GatewayName.map { x => x: js.Any }),
        ("GatewayTimezone" -> GatewayTimezone.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewayInformationInput]
    }
  }

  /**
   * <p>A JSON object containing the ARN of the gateway that was updated.</p>
   */
  @js.native
  trait UpdateGatewayInformationOutput extends js.Object {
    var GatewayARN: GatewayARN
    var GatewayName: string
  }

  object UpdateGatewayInformationOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      GatewayName: js.UndefOr[string] = js.undefined
    ): UpdateGatewayInformationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("GatewayName" -> GatewayName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewayInformationOutput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway to update.</p>
   */
  @js.native
  trait UpdateGatewaySoftwareNowInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object UpdateGatewaySoftwareNowInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): UpdateGatewaySoftwareNowInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewaySoftwareNowInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway that was updated.</p>
   */
  @js.native
  trait UpdateGatewaySoftwareNowOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object UpdateGatewaySoftwareNowOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): UpdateGatewaySoftwareNowOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGatewaySoftwareNowOutput]
    }
  }

  /**
   * <p>A JSON object containing the following fields:</p> <ul> <li> <p> <a>UpdateMaintenanceStartTimeInput$DayOfWeek</a> </p> </li> <li> <p> <a>UpdateMaintenanceStartTimeInput$HourOfDay</a> </p> </li> <li> <p> <a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a> </p> </li> </ul>
   */
  @js.native
  trait UpdateMaintenanceStartTimeInput extends js.Object {
    var GatewayARN: GatewayARN
    var HourOfDay: HourOfDay
    var MinuteOfHour: MinuteOfHour
    var DayOfWeek: DayOfWeek
  }

  object UpdateMaintenanceStartTimeInput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      HourOfDay: js.UndefOr[HourOfDay] = js.undefined,
      MinuteOfHour: js.UndefOr[MinuteOfHour] = js.undefined,
      DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    ): UpdateMaintenanceStartTimeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("HourOfDay" -> HourOfDay.map { x => x: js.Any }),
        ("MinuteOfHour" -> MinuteOfHour.map { x => x: js.Any }),
        ("DayOfWeek" -> DayOfWeek.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceStartTimeInput]
    }
  }

  /**
   * <p>A JSON object containing the of the gateway whose maintenance start time is updated.</p>
   */
  @js.native
  trait UpdateMaintenanceStartTimeOutput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object UpdateMaintenanceStartTimeOutput {
    def apply(
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): UpdateMaintenanceStartTimeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMaintenanceStartTimeOutput]
    }
  }

  /**
   * <p>UpdateNFSFileShareInput</p>
   */
  @js.native
  trait UpdateNFSFileShareInput extends js.Object {
    var NFSFileShareDefaults: NFSFileShareDefaults
    var FileShareARN: FileShareARN
    var KMSEncrypted: Boolean
    var DefaultStorageClass: StorageClass
    var KMSKey: KMSKey
  }

  object UpdateNFSFileShareInput {
    def apply(
      NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
      KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
      DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
      KMSKey: js.UndefOr[KMSKey] = js.undefined
    ): UpdateNFSFileShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NFSFileShareDefaults" -> NFSFileShareDefaults.map { x => x: js.Any }),
        ("FileShareARN" -> FileShareARN.map { x => x: js.Any }),
        ("KMSEncrypted" -> KMSEncrypted.map { x => x: js.Any }),
        ("DefaultStorageClass" -> DefaultStorageClass.map { x => x: js.Any }),
        ("KMSKey" -> KMSKey.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNFSFileShareInput]
    }
  }

  /**
   * <p>UpdateNFSFileShareOutput</p>
   */
  @js.native
  trait UpdateNFSFileShareOutput extends js.Object {
    var FileShareARN: FileShareARN
  }

  object UpdateNFSFileShareOutput {
    def apply(
      FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    ): UpdateNFSFileShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FileShareARN" -> FileShareARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNFSFileShareOutput]
    }
  }

  /**
   * <p>A JSON object containing one or more of the following fields:</p> <ul> <li> <p> <a>UpdateSnapshotScheduleInput$Description</a> </p> </li> <li> <p> <a>UpdateSnapshotScheduleInput$RecurrenceInHours</a> </p> </li> <li> <p> <a>UpdateSnapshotScheduleInput$StartAt</a> </p> </li> <li> <p> <a>UpdateSnapshotScheduleInput$VolumeARN</a> </p> </li> </ul>
   */
  @js.native
  trait UpdateSnapshotScheduleInput extends js.Object {
    var VolumeARN: VolumeARN
    var StartAt: HourOfDay
    var RecurrenceInHours: RecurrenceInHours
    var Description: Description
  }

  object UpdateSnapshotScheduleInput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      StartAt: js.UndefOr[HourOfDay] = js.undefined,
      RecurrenceInHours: js.UndefOr[RecurrenceInHours] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): UpdateSnapshotScheduleInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("StartAt" -> StartAt.map { x => x: js.Any }),
        ("RecurrenceInHours" -> RecurrenceInHours.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSnapshotScheduleInput]
    }
  }

  /**
   * <p>A JSON object containing the of the updated storage volume.</p>
   */
  @js.native
  trait UpdateSnapshotScheduleOutput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object UpdateSnapshotScheduleOutput {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): UpdateSnapshotScheduleOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSnapshotScheduleOutput]
    }
  }

  @js.native
  trait UpdateVTLDeviceTypeInput extends js.Object {
    var VTLDeviceARN: VTLDeviceARN
    var DeviceType: DeviceType
  }

  object UpdateVTLDeviceTypeInput {
    def apply(
      VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined,
      DeviceType: js.UndefOr[DeviceType] = js.undefined
    ): UpdateVTLDeviceTypeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VTLDeviceARN" -> VTLDeviceARN.map { x => x: js.Any }),
        ("DeviceType" -> DeviceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVTLDeviceTypeInput]
    }
  }

  /**
   * <p>UpdateVTLDeviceTypeOutput</p>
   */
  @js.native
  trait UpdateVTLDeviceTypeOutput extends js.Object {
    var VTLDeviceARN: VTLDeviceARN
  }

  object UpdateVTLDeviceTypeOutput {
    def apply(
      VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined
    ): UpdateVTLDeviceTypeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VTLDeviceARN" -> VTLDeviceARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVTLDeviceTypeOutput]
    }
  }

  /**
   * <p>Represents a device object associated with a gateway-VTL.</p>
   */
  @js.native
  trait VTLDevice extends js.Object {
    var VTLDeviceType: VTLDeviceType
    var VTLDeviceARN: VTLDeviceARN
    var DeviceiSCSIAttributes: DeviceiSCSIAttributes
    var VTLDeviceVendor: VTLDeviceVendor
    var VTLDeviceProductIdentifier: VTLDeviceProductIdentifier
  }

  object VTLDevice {
    def apply(
      VTLDeviceType: js.UndefOr[VTLDeviceType] = js.undefined,
      VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined,
      DeviceiSCSIAttributes: js.UndefOr[DeviceiSCSIAttributes] = js.undefined,
      VTLDeviceVendor: js.UndefOr[VTLDeviceVendor] = js.undefined,
      VTLDeviceProductIdentifier: js.UndefOr[VTLDeviceProductIdentifier] = js.undefined
    ): VTLDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VTLDeviceType" -> VTLDeviceType.map { x => x: js.Any }),
        ("VTLDeviceARN" -> VTLDeviceARN.map { x => x: js.Any }),
        ("DeviceiSCSIAttributes" -> DeviceiSCSIAttributes.map { x => x: js.Any }),
        ("VTLDeviceVendor" -> VTLDeviceVendor.map { x => x: js.Any }),
        ("VTLDeviceProductIdentifier" -> VTLDeviceProductIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VTLDevice]
    }
  }

  /**
   * <p>Describes a storage volume object.</p>
   */
  @js.native
  trait VolumeInfo extends js.Object {
    var VolumeType: VolumeType
    var VolumeId: VolumeId
    var GatewayARN: GatewayARN
    var VolumeARN: VolumeARN
    var VolumeSizeInBytes: long
    var GatewayId: GatewayId
  }

  object VolumeInfo {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      VolumeId: js.UndefOr[VolumeId] = js.undefined,
      GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      GatewayId: js.UndefOr[GatewayId] = js.undefined
    ): VolumeInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("GatewayARN" -> GatewayARN.map { x => x: js.Any }),
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x: js.Any }),
        ("GatewayId" -> GatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeInfo]
    }
  }

  @js.native
  trait VolumeRecoveryPointInfo extends js.Object {
    var VolumeARN: VolumeARN
    var VolumeSizeInBytes: long
    var VolumeUsageInBytes: long
    var VolumeRecoveryPointTime: string
  }

  object VolumeRecoveryPointInfo {
    def apply(
      VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
      VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
      VolumeUsageInBytes: js.UndefOr[long] = js.undefined,
      VolumeRecoveryPointTime: js.UndefOr[string] = js.undefined
    ): VolumeRecoveryPointInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeARN" -> VolumeARN.map { x => x: js.Any }),
        ("VolumeSizeInBytes" -> VolumeSizeInBytes.map { x => x: js.Any }),
        ("VolumeUsageInBytes" -> VolumeUsageInBytes.map { x => x: js.Any }),
        ("VolumeRecoveryPointTime" -> VolumeRecoveryPointTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeRecoveryPointInfo]
    }
  }

  /**
   * <p>Lists iSCSI information about a volume.</p>
   */
  @js.native
  trait VolumeiSCSIAttributes extends js.Object {
    var LunNumber: PositiveIntObject
    var ChapEnabled: boolean
    var TargetARN: TargetARN
    var NetworkInterfaceId: NetworkInterfaceId
    var NetworkInterfacePort: integer
  }

  object VolumeiSCSIAttributes {
    def apply(
      LunNumber: js.UndefOr[PositiveIntObject] = js.undefined,
      ChapEnabled: js.UndefOr[boolean] = js.undefined,
      TargetARN: js.UndefOr[TargetARN] = js.undefined,
      NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
      NetworkInterfacePort: js.UndefOr[integer] = js.undefined
    ): VolumeiSCSIAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LunNumber" -> LunNumber.map { x => x: js.Any }),
        ("ChapEnabled" -> ChapEnabled.map { x => x: js.Any }),
        ("TargetARN" -> TargetARN.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("NetworkInterfacePort" -> NetworkInterfacePort.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeiSCSIAttributes]
    }
  }
}
