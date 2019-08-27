package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object storagegateway {
  type ActivationKey              = String
  type Authentication             = String
  type BandwidthDownloadRateLimit = Double
  type BandwidthType              = String
  type BandwidthUploadRateLimit   = Double
  type CachediSCSIVolumes         = js.Array[CachediSCSIVolume]
  type ChapCredentials            = js.Array[ChapInfo]
  type ChapSecret                 = String
  type ClientToken                = String
  type CreatedDate                = js.Date
  type DayOfMonth                 = Int
  type DayOfWeek                  = Int
  type Description                = String
  type DeviceType                 = String
  type DiskAllocationType         = String
  type DiskAttribute              = String
  type DiskAttributeList          = js.Array[DiskAttribute]
  type DiskId                     = String
  type DiskIds                    = js.Array[DiskId]
  type Disks                      = js.Array[Disk]
  type DomainName                 = String
  type DomainUserName             = String
  type DomainUserPassword         = String
  type DoubleObject               = Double
  type Ec2InstanceId              = String
  type Ec2InstanceRegion          = String
  type FileShareARN               = String
  type FileShareARNList           = js.Array[FileShareARN]
  type FileShareClientList        = js.Array[IPV4AddressCIDR]
  type FileShareId                = String
  type FileShareInfoList          = js.Array[FileShareInfo]
  type FileShareStatus            = String
  type FileShareType              = String
  type FileShareUser              = String
  type FileShareUserList          = js.Array[FileShareUser]
  type Folder                     = String
  type FolderList                 = js.Array[Folder]
  type GatewayARN                 = String
  type GatewayId                  = String
  type GatewayName                = String
  type GatewayNetworkInterfaces   = js.Array[NetworkInterface]
  type GatewayOperationalState    = String
  type GatewayState               = String
  type GatewayTimezone            = String
  type GatewayType                = String
  type Gateways                   = js.Array[GatewayInfo]
  type Host                       = String
  type Hosts                      = js.Array[Host]
  type HourOfDay                  = Int
  type IPV4AddressCIDR            = String
  type Initiator                  = String
  type Initiators                 = js.Array[Initiator]
  type IqnName                    = String
  type KMSKey                     = String
  type LastSoftwareUpdate         = String
  type LocalConsolePassword       = String
  type LocationARN                = String
  type Marker                     = String
  type MediumChangerType          = String
  type MinuteOfHour               = Int
  type NFSFileShareInfoList       = js.Array[NFSFileShareInfo]
  type NetworkInterfaceId         = String
  type NextUpdateAvailabilityDate = String
  type NotificationId             = String
  type NumTapesToCreate           = Int
  type ObjectACL                  = String
  type OrganizationalUnit         = String
  type Path                       = String
  type PermissionId               = Double
  type PermissionMode             = String
  type PoolId                     = String
  type PositiveIntObject          = Int
  type RecurrenceInHours          = Int
  type RegionId                   = String
  type ResourceARN                = String
  type Role                       = String
  type SMBFileShareInfoList       = js.Array[SMBFileShareInfo]
  type SMBGuestPassword           = String
  type SMBSecurityStrategy        = String
  type SnapshotDescription        = String
  type SnapshotId                 = String
  type Squash                     = String
  type StorageClass               = String
  type StorediSCSIVolumes         = js.Array[StorediSCSIVolume]
  type TagKey                     = String
  type TagKeys                    = js.Array[TagKey]
  type TagValue                   = String
  type Tags                       = js.Array[Tag]
  type TapeARN                    = String
  type TapeARNs                   = js.Array[TapeARN]
  type TapeArchiveStatus          = String
  type TapeArchives               = js.Array[TapeArchive]
  type TapeBarcode                = String
  type TapeBarcodePrefix          = String
  type TapeDriveType              = String
  type TapeInfos                  = js.Array[TapeInfo]
  type TapeRecoveryPointInfos     = js.Array[TapeRecoveryPointInfo]
  type TapeRecoveryPointStatus    = String
  type TapeSize                   = Double
  type TapeStatus                 = String
  type TapeUsage                  = Double
  type Tapes                      = js.Array[Tape]
  type TargetARN                  = String
  type TargetName                 = String
  type Time                       = js.Date
  type VTLDeviceARN               = String
  type VTLDeviceARNs              = js.Array[VTLDeviceARN]
  type VTLDeviceProductIdentifier = String
  type VTLDeviceType              = String
  type VTLDeviceVendor            = String
  type VTLDevices                 = js.Array[VTLDevice]
  type VolumeARN                  = String
  type VolumeARNs                 = js.Array[VolumeARN]
  type VolumeAttachmentStatus     = String
  type VolumeId                   = String
  type VolumeInfos                = js.Array[VolumeInfo]
  type VolumeRecoveryPointInfos   = js.Array[VolumeRecoveryPointInfo]
  type VolumeStatus               = String
  type VolumeType                 = String
  type VolumeUsedInBytes          = Double
  type double                     = Double

  implicit final class StorageGatewayOps(val service: StorageGateway) extends AnyVal {

    def activateGatewayFuture(params: ActivateGatewayInput): Future[ActivateGatewayOutput] =
      service.activateGateway(params).promise.toFuture
    def addCacheFuture(params: AddCacheInput): Future[AddCacheOutput] = service.addCache(params).promise.toFuture
    def addTagsToResourceFuture(params: AddTagsToResourceInput): Future[AddTagsToResourceOutput] =
      service.addTagsToResource(params).promise.toFuture
    def addUploadBufferFuture(params: AddUploadBufferInput): Future[AddUploadBufferOutput] =
      service.addUploadBuffer(params).promise.toFuture
    def addWorkingStorageFuture(params: AddWorkingStorageInput): Future[AddWorkingStorageOutput] =
      service.addWorkingStorage(params).promise.toFuture
    def assignTapePoolFuture(params: AssignTapePoolInput): Future[AssignTapePoolOutput] =
      service.assignTapePool(params).promise.toFuture
    def attachVolumeFuture(params: AttachVolumeInput): Future[AttachVolumeOutput] =
      service.attachVolume(params).promise.toFuture
    def cancelArchivalFuture(params: CancelArchivalInput): Future[CancelArchivalOutput] =
      service.cancelArchival(params).promise.toFuture
    def cancelRetrievalFuture(params: CancelRetrievalInput): Future[CancelRetrievalOutput] =
      service.cancelRetrieval(params).promise.toFuture
    def createCachediSCSIVolumeFuture(params: CreateCachediSCSIVolumeInput): Future[CreateCachediSCSIVolumeOutput] =
      service.createCachediSCSIVolume(params).promise.toFuture
    def createNFSFileShareFuture(params: CreateNFSFileShareInput): Future[CreateNFSFileShareOutput] =
      service.createNFSFileShare(params).promise.toFuture
    def createSMBFileShareFuture(params: CreateSMBFileShareInput): Future[CreateSMBFileShareOutput] =
      service.createSMBFileShare(params).promise.toFuture
    def createSnapshotFromVolumeRecoveryPointFuture(
        params: CreateSnapshotFromVolumeRecoveryPointInput
    ): Future[CreateSnapshotFromVolumeRecoveryPointOutput] =
      service.createSnapshotFromVolumeRecoveryPoint(params).promise.toFuture
    def createSnapshotFuture(params: CreateSnapshotInput): Future[CreateSnapshotOutput] =
      service.createSnapshot(params).promise.toFuture
    def createStorediSCSIVolumeFuture(params: CreateStorediSCSIVolumeInput): Future[CreateStorediSCSIVolumeOutput] =
      service.createStorediSCSIVolume(params).promise.toFuture
    def createTapeWithBarcodeFuture(params: CreateTapeWithBarcodeInput): Future[CreateTapeWithBarcodeOutput] =
      service.createTapeWithBarcode(params).promise.toFuture
    def createTapesFuture(params: CreateTapesInput): Future[CreateTapesOutput] =
      service.createTapes(params).promise.toFuture
    def deleteBandwidthRateLimitFuture(params: DeleteBandwidthRateLimitInput): Future[DeleteBandwidthRateLimitOutput] =
      service.deleteBandwidthRateLimit(params).promise.toFuture
    def deleteChapCredentialsFuture(params: DeleteChapCredentialsInput): Future[DeleteChapCredentialsOutput] =
      service.deleteChapCredentials(params).promise.toFuture
    def deleteFileShareFuture(params: DeleteFileShareInput): Future[DeleteFileShareOutput] =
      service.deleteFileShare(params).promise.toFuture
    def deleteGatewayFuture(params: DeleteGatewayInput): Future[DeleteGatewayOutput] =
      service.deleteGateway(params).promise.toFuture
    def deleteSnapshotScheduleFuture(params: DeleteSnapshotScheduleInput): Future[DeleteSnapshotScheduleOutput] =
      service.deleteSnapshotSchedule(params).promise.toFuture
    def deleteTapeArchiveFuture(params: DeleteTapeArchiveInput): Future[DeleteTapeArchiveOutput] =
      service.deleteTapeArchive(params).promise.toFuture
    def deleteTapeFuture(params: DeleteTapeInput): Future[DeleteTapeOutput] =
      service.deleteTape(params).promise.toFuture
    def deleteVolumeFuture(params: DeleteVolumeInput): Future[DeleteVolumeOutput] =
      service.deleteVolume(params).promise.toFuture
    def describeBandwidthRateLimitFuture(
        params: DescribeBandwidthRateLimitInput
    ): Future[DescribeBandwidthRateLimitOutput] = service.describeBandwidthRateLimit(params).promise.toFuture
    def describeCacheFuture(params: DescribeCacheInput): Future[DescribeCacheOutput] =
      service.describeCache(params).promise.toFuture
    def describeCachediSCSIVolumesFuture(
        params: DescribeCachediSCSIVolumesInput
    ): Future[DescribeCachediSCSIVolumesOutput] = service.describeCachediSCSIVolumes(params).promise.toFuture
    def describeChapCredentialsFuture(params: DescribeChapCredentialsInput): Future[DescribeChapCredentialsOutput] =
      service.describeChapCredentials(params).promise.toFuture
    def describeGatewayInformationFuture(
        params: DescribeGatewayInformationInput
    ): Future[DescribeGatewayInformationOutput] = service.describeGatewayInformation(params).promise.toFuture
    def describeMaintenanceStartTimeFuture(
        params: DescribeMaintenanceStartTimeInput
    ): Future[DescribeMaintenanceStartTimeOutput] = service.describeMaintenanceStartTime(params).promise.toFuture
    def describeNFSFileSharesFuture(params: DescribeNFSFileSharesInput): Future[DescribeNFSFileSharesOutput] =
      service.describeNFSFileShares(params).promise.toFuture
    def describeSMBFileSharesFuture(params: DescribeSMBFileSharesInput): Future[DescribeSMBFileSharesOutput] =
      service.describeSMBFileShares(params).promise.toFuture
    def describeSMBSettingsFuture(params: DescribeSMBSettingsInput): Future[DescribeSMBSettingsOutput] =
      service.describeSMBSettings(params).promise.toFuture
    def describeSnapshotScheduleFuture(params: DescribeSnapshotScheduleInput): Future[DescribeSnapshotScheduleOutput] =
      service.describeSnapshotSchedule(params).promise.toFuture
    def describeStorediSCSIVolumesFuture(
        params: DescribeStorediSCSIVolumesInput
    ): Future[DescribeStorediSCSIVolumesOutput] = service.describeStorediSCSIVolumes(params).promise.toFuture
    def describeTapeArchivesFuture(params: DescribeTapeArchivesInput): Future[DescribeTapeArchivesOutput] =
      service.describeTapeArchives(params).promise.toFuture
    def describeTapeRecoveryPointsFuture(
        params: DescribeTapeRecoveryPointsInput
    ): Future[DescribeTapeRecoveryPointsOutput] = service.describeTapeRecoveryPoints(params).promise.toFuture
    def describeTapesFuture(params: DescribeTapesInput): Future[DescribeTapesOutput] =
      service.describeTapes(params).promise.toFuture
    def describeUploadBufferFuture(params: DescribeUploadBufferInput): Future[DescribeUploadBufferOutput] =
      service.describeUploadBuffer(params).promise.toFuture
    def describeVTLDevicesFuture(params: DescribeVTLDevicesInput): Future[DescribeVTLDevicesOutput] =
      service.describeVTLDevices(params).promise.toFuture
    def describeWorkingStorageFuture(params: DescribeWorkingStorageInput): Future[DescribeWorkingStorageOutput] =
      service.describeWorkingStorage(params).promise.toFuture
    def detachVolumeFuture(params: DetachVolumeInput): Future[DetachVolumeOutput] =
      service.detachVolume(params).promise.toFuture
    def disableGatewayFuture(params: DisableGatewayInput): Future[DisableGatewayOutput] =
      service.disableGateway(params).promise.toFuture
    def joinDomainFuture(params: JoinDomainInput): Future[JoinDomainOutput] =
      service.joinDomain(params).promise.toFuture
    def listFileSharesFuture(params: ListFileSharesInput): Future[ListFileSharesOutput] =
      service.listFileShares(params).promise.toFuture
    def listGatewaysFuture(params: ListGatewaysInput): Future[ListGatewaysOutput] =
      service.listGateways(params).promise.toFuture
    def listLocalDisksFuture(params: ListLocalDisksInput): Future[ListLocalDisksOutput] =
      service.listLocalDisks(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise.toFuture
    def listTapesFuture(params: ListTapesInput): Future[ListTapesOutput] = service.listTapes(params).promise.toFuture
    def listVolumeInitiatorsFuture(params: ListVolumeInitiatorsInput): Future[ListVolumeInitiatorsOutput] =
      service.listVolumeInitiators(params).promise.toFuture
    def listVolumeRecoveryPointsFuture(params: ListVolumeRecoveryPointsInput): Future[ListVolumeRecoveryPointsOutput] =
      service.listVolumeRecoveryPoints(params).promise.toFuture
    def listVolumesFuture(params: ListVolumesInput): Future[ListVolumesOutput] =
      service.listVolumes(params).promise.toFuture
    def notifyWhenUploadedFuture(params: NotifyWhenUploadedInput): Future[NotifyWhenUploadedOutput] =
      service.notifyWhenUploaded(params).promise.toFuture
    def refreshCacheFuture(params: RefreshCacheInput): Future[RefreshCacheOutput] =
      service.refreshCache(params).promise.toFuture
    def removeTagsFromResourceFuture(params: RemoveTagsFromResourceInput): Future[RemoveTagsFromResourceOutput] =
      service.removeTagsFromResource(params).promise.toFuture
    def resetCacheFuture(params: ResetCacheInput): Future[ResetCacheOutput] =
      service.resetCache(params).promise.toFuture
    def retrieveTapeArchiveFuture(params: RetrieveTapeArchiveInput): Future[RetrieveTapeArchiveOutput] =
      service.retrieveTapeArchive(params).promise.toFuture
    def retrieveTapeRecoveryPointFuture(
        params: RetrieveTapeRecoveryPointInput
    ): Future[RetrieveTapeRecoveryPointOutput] = service.retrieveTapeRecoveryPoint(params).promise.toFuture
    def setLocalConsolePasswordFuture(params: SetLocalConsolePasswordInput): Future[SetLocalConsolePasswordOutput] =
      service.setLocalConsolePassword(params).promise.toFuture
    def setSMBGuestPasswordFuture(params: SetSMBGuestPasswordInput): Future[SetSMBGuestPasswordOutput] =
      service.setSMBGuestPassword(params).promise.toFuture
    def shutdownGatewayFuture(params: ShutdownGatewayInput): Future[ShutdownGatewayOutput] =
      service.shutdownGateway(params).promise.toFuture
    def startGatewayFuture(params: StartGatewayInput): Future[StartGatewayOutput] =
      service.startGateway(params).promise.toFuture
    def updateBandwidthRateLimitFuture(params: UpdateBandwidthRateLimitInput): Future[UpdateBandwidthRateLimitOutput] =
      service.updateBandwidthRateLimit(params).promise.toFuture
    def updateChapCredentialsFuture(params: UpdateChapCredentialsInput): Future[UpdateChapCredentialsOutput] =
      service.updateChapCredentials(params).promise.toFuture
    def updateGatewayInformationFuture(params: UpdateGatewayInformationInput): Future[UpdateGatewayInformationOutput] =
      service.updateGatewayInformation(params).promise.toFuture
    def updateGatewaySoftwareNowFuture(params: UpdateGatewaySoftwareNowInput): Future[UpdateGatewaySoftwareNowOutput] =
      service.updateGatewaySoftwareNow(params).promise.toFuture
    def updateMaintenanceStartTimeFuture(
        params: UpdateMaintenanceStartTimeInput
    ): Future[UpdateMaintenanceStartTimeOutput] = service.updateMaintenanceStartTime(params).promise.toFuture
    def updateNFSFileShareFuture(params: UpdateNFSFileShareInput): Future[UpdateNFSFileShareOutput] =
      service.updateNFSFileShare(params).promise.toFuture
    def updateSMBFileShareFuture(params: UpdateSMBFileShareInput): Future[UpdateSMBFileShareOutput] =
      service.updateSMBFileShare(params).promise.toFuture
    def updateSMBSecurityStrategyFuture(
        params: UpdateSMBSecurityStrategyInput
    ): Future[UpdateSMBSecurityStrategyOutput] = service.updateSMBSecurityStrategy(params).promise.toFuture
    def updateSnapshotScheduleFuture(params: UpdateSnapshotScheduleInput): Future[UpdateSnapshotScheduleOutput] =
      service.updateSnapshotSchedule(params).promise.toFuture
    def updateVTLDeviceTypeFuture(params: UpdateVTLDeviceTypeInput): Future[UpdateVTLDeviceTypeOutput] =
      service.updateVTLDeviceType(params).promise.toFuture
  }
}

package storagegateway {
  @js.native
  @JSImport("aws-sdk", "StorageGateway")
  class StorageGateway() extends js.Object {
    def this(config: AWSConfig) = this()

    def activateGateway(params: ActivateGatewayInput): Request[ActivateGatewayOutput]       = js.native
    def addCache(params: AddCacheInput): Request[AddCacheOutput]                            = js.native
    def addTagsToResource(params: AddTagsToResourceInput): Request[AddTagsToResourceOutput] = js.native
    def addUploadBuffer(params: AddUploadBufferInput): Request[AddUploadBufferOutput]       = js.native
    def addWorkingStorage(params: AddWorkingStorageInput): Request[AddWorkingStorageOutput] = js.native
    def assignTapePool(params: AssignTapePoolInput): Request[AssignTapePoolOutput]          = js.native
    def attachVolume(params: AttachVolumeInput): Request[AttachVolumeOutput]                = js.native
    def cancelArchival(params: CancelArchivalInput): Request[CancelArchivalOutput]          = js.native
    def cancelRetrieval(params: CancelRetrievalInput): Request[CancelRetrievalOutput]       = js.native
    def createCachediSCSIVolume(params: CreateCachediSCSIVolumeInput): Request[CreateCachediSCSIVolumeOutput] =
      js.native
    def createNFSFileShare(params: CreateNFSFileShareInput): Request[CreateNFSFileShareOutput] = js.native
    def createSMBFileShare(params: CreateSMBFileShareInput): Request[CreateSMBFileShareOutput] = js.native
    def createSnapshot(params: CreateSnapshotInput): Request[CreateSnapshotOutput]             = js.native
    def createSnapshotFromVolumeRecoveryPoint(
        params: CreateSnapshotFromVolumeRecoveryPointInput
    ): Request[CreateSnapshotFromVolumeRecoveryPointOutput] = js.native
    def createStorediSCSIVolume(params: CreateStorediSCSIVolumeInput): Request[CreateStorediSCSIVolumeOutput] =
      js.native
    def createTapeWithBarcode(params: CreateTapeWithBarcodeInput): Request[CreateTapeWithBarcodeOutput] = js.native
    def createTapes(params: CreateTapesInput): Request[CreateTapesOutput]                               = js.native
    def deleteBandwidthRateLimit(params: DeleteBandwidthRateLimitInput): Request[DeleteBandwidthRateLimitOutput] =
      js.native
    def deleteChapCredentials(params: DeleteChapCredentialsInput): Request[DeleteChapCredentialsOutput]    = js.native
    def deleteFileShare(params: DeleteFileShareInput): Request[DeleteFileShareOutput]                      = js.native
    def deleteGateway(params: DeleteGatewayInput): Request[DeleteGatewayOutput]                            = js.native
    def deleteSnapshotSchedule(params: DeleteSnapshotScheduleInput): Request[DeleteSnapshotScheduleOutput] = js.native
    def deleteTape(params: DeleteTapeInput): Request[DeleteTapeOutput]                                     = js.native
    def deleteTapeArchive(params: DeleteTapeArchiveInput): Request[DeleteTapeArchiveOutput]                = js.native
    def deleteVolume(params: DeleteVolumeInput): Request[DeleteVolumeOutput]                               = js.native
    def describeBandwidthRateLimit(params: DescribeBandwidthRateLimitInput): Request[DescribeBandwidthRateLimitOutput] =
      js.native
    def describeCache(params: DescribeCacheInput): Request[DescribeCacheOutput] = js.native
    def describeCachediSCSIVolumes(params: DescribeCachediSCSIVolumesInput): Request[DescribeCachediSCSIVolumesOutput] =
      js.native
    def describeChapCredentials(params: DescribeChapCredentialsInput): Request[DescribeChapCredentialsOutput] =
      js.native
    def describeGatewayInformation(params: DescribeGatewayInformationInput): Request[DescribeGatewayInformationOutput] =
      js.native
    def describeMaintenanceStartTime(
        params: DescribeMaintenanceStartTimeInput
    ): Request[DescribeMaintenanceStartTimeOutput]                                                      = js.native
    def describeNFSFileShares(params: DescribeNFSFileSharesInput): Request[DescribeNFSFileSharesOutput] = js.native
    def describeSMBFileShares(params: DescribeSMBFileSharesInput): Request[DescribeSMBFileSharesOutput] = js.native
    def describeSMBSettings(params: DescribeSMBSettingsInput): Request[DescribeSMBSettingsOutput]       = js.native
    def describeSnapshotSchedule(params: DescribeSnapshotScheduleInput): Request[DescribeSnapshotScheduleOutput] =
      js.native
    def describeStorediSCSIVolumes(params: DescribeStorediSCSIVolumesInput): Request[DescribeStorediSCSIVolumesOutput] =
      js.native
    def describeTapeArchives(params: DescribeTapeArchivesInput): Request[DescribeTapeArchivesOutput] = js.native
    def describeTapeRecoveryPoints(params: DescribeTapeRecoveryPointsInput): Request[DescribeTapeRecoveryPointsOutput] =
      js.native
    def describeTapes(params: DescribeTapesInput): Request[DescribeTapesOutput]                            = js.native
    def describeUploadBuffer(params: DescribeUploadBufferInput): Request[DescribeUploadBufferOutput]       = js.native
    def describeVTLDevices(params: DescribeVTLDevicesInput): Request[DescribeVTLDevicesOutput]             = js.native
    def describeWorkingStorage(params: DescribeWorkingStorageInput): Request[DescribeWorkingStorageOutput] = js.native
    def detachVolume(params: DetachVolumeInput): Request[DetachVolumeOutput]                               = js.native
    def disableGateway(params: DisableGatewayInput): Request[DisableGatewayOutput]                         = js.native
    def joinDomain(params: JoinDomainInput): Request[JoinDomainOutput]                                     = js.native
    def listFileShares(params: ListFileSharesInput): Request[ListFileSharesOutput]                         = js.native
    def listGateways(params: ListGatewaysInput): Request[ListGatewaysOutput]                               = js.native
    def listLocalDisks(params: ListLocalDisksInput): Request[ListLocalDisksOutput]                         = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]          = js.native
    def listTapes(params: ListTapesInput): Request[ListTapesOutput]                                        = js.native
    def listVolumeInitiators(params: ListVolumeInitiatorsInput): Request[ListVolumeInitiatorsOutput]       = js.native
    def listVolumeRecoveryPoints(params: ListVolumeRecoveryPointsInput): Request[ListVolumeRecoveryPointsOutput] =
      js.native
    def listVolumes(params: ListVolumesInput): Request[ListVolumesOutput]                                  = js.native
    def notifyWhenUploaded(params: NotifyWhenUploadedInput): Request[NotifyWhenUploadedOutput]             = js.native
    def refreshCache(params: RefreshCacheInput): Request[RefreshCacheOutput]                               = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceInput): Request[RemoveTagsFromResourceOutput] = js.native
    def resetCache(params: ResetCacheInput): Request[ResetCacheOutput]                                     = js.native
    def retrieveTapeArchive(params: RetrieveTapeArchiveInput): Request[RetrieveTapeArchiveOutput]          = js.native
    def retrieveTapeRecoveryPoint(params: RetrieveTapeRecoveryPointInput): Request[RetrieveTapeRecoveryPointOutput] =
      js.native
    def setLocalConsolePassword(params: SetLocalConsolePasswordInput): Request[SetLocalConsolePasswordOutput] =
      js.native
    def setSMBGuestPassword(params: SetSMBGuestPasswordInput): Request[SetSMBGuestPasswordOutput] = js.native
    def shutdownGateway(params: ShutdownGatewayInput): Request[ShutdownGatewayOutput]             = js.native
    def startGateway(params: StartGatewayInput): Request[StartGatewayOutput]                      = js.native
    def updateBandwidthRateLimit(params: UpdateBandwidthRateLimitInput): Request[UpdateBandwidthRateLimitOutput] =
      js.native
    def updateChapCredentials(params: UpdateChapCredentialsInput): Request[UpdateChapCredentialsOutput] = js.native
    def updateGatewayInformation(params: UpdateGatewayInformationInput): Request[UpdateGatewayInformationOutput] =
      js.native
    def updateGatewaySoftwareNow(params: UpdateGatewaySoftwareNowInput): Request[UpdateGatewaySoftwareNowOutput] =
      js.native
    def updateMaintenanceStartTime(params: UpdateMaintenanceStartTimeInput): Request[UpdateMaintenanceStartTimeOutput] =
      js.native
    def updateNFSFileShare(params: UpdateNFSFileShareInput): Request[UpdateNFSFileShareOutput] = js.native
    def updateSMBFileShare(params: UpdateSMBFileShareInput): Request[UpdateSMBFileShareOutput] = js.native
    def updateSMBSecurityStrategy(params: UpdateSMBSecurityStrategyInput): Request[UpdateSMBSecurityStrategyOutput] =
      js.native
    def updateSnapshotSchedule(params: UpdateSnapshotScheduleInput): Request[UpdateSnapshotScheduleOutput] = js.native
    def updateVTLDeviceType(params: UpdateVTLDeviceTypeInput): Request[UpdateVTLDeviceTypeOutput]          = js.native
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
    var Tags: js.UndefOr[Tags]
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
        Tags: js.UndefOr[Tags] = js.undefined,
        TapeDriveType: js.UndefOr[TapeDriveType] = js.undefined
    ): ActivateGatewayInput = {
      val __obj = js.Dictionary[js.Any](
        "ActivationKey"   -> ActivationKey.asInstanceOf[js.Any],
        "GatewayName"     -> GatewayName.asInstanceOf[js.Any],
        "GatewayRegion"   -> GatewayRegion.asInstanceOf[js.Any],
        "GatewayTimezone" -> GatewayTimezone.asInstanceOf[js.Any]
      )

      GatewayType.foreach(__v => __obj.update("GatewayType", __v.asInstanceOf[js.Any]))
      MediumChangerType.foreach(__v => __obj.update("MediumChangerType", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TapeDriveType.foreach(__v => __obj.update("TapeDriveType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateGatewayInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ActivateGatewayOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateGatewayOutput]
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
        GatewayARN: GatewayARN
    ): AddCacheInput = {
      val __obj = js.Dictionary[js.Any](
        "DiskIds"    -> DiskIds.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddCacheInput]
    }
  }

  @js.native
  trait AddCacheOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object AddCacheOutput {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): AddCacheOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddCacheOutput]
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
        Tags: Tags
    ): AddTagsToResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsToResourceInput]
    }
  }

  @js.native
  trait AddTagsToResourceOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object AddTagsToResourceOutput {
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    ): AddTagsToResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourceARN.foreach(__v => __obj.update("ResourceARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddTagsToResourceOutput]
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
        GatewayARN: GatewayARN
    ): AddUploadBufferInput = {
      val __obj = js.Dictionary[js.Any](
        "DiskIds"    -> DiskIds.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddUploadBufferInput]
    }
  }

  @js.native
  trait AddUploadBufferOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object AddUploadBufferOutput {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): AddUploadBufferOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddUploadBufferOutput]
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
        GatewayARN: GatewayARN
    ): AddWorkingStorageInput = {
      val __obj = js.Dictionary[js.Any](
        "DiskIds"    -> DiskIds.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddWorkingStorageInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): AddWorkingStorageOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddWorkingStorageOutput]
    }
  }

  @js.native
  trait AssignTapePoolInput extends js.Object {
    var PoolId: PoolId
    var TapeARN: TapeARN
  }

  object AssignTapePoolInput {
    def apply(
        PoolId: PoolId,
        TapeARN: TapeARN
    ): AssignTapePoolInput = {
      val __obj = js.Dictionary[js.Any](
        "PoolId"  -> PoolId.asInstanceOf[js.Any],
        "TapeARN" -> TapeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssignTapePoolInput]
    }
  }

  @js.native
  trait AssignTapePoolOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object AssignTapePoolOutput {
    def apply(
        TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): AssignTapePoolOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssignTapePoolOutput]
    }
  }

  @js.native
  trait AttachVolumeInput extends js.Object {
    var GatewayARN: GatewayARN
    var NetworkInterfaceId: NetworkInterfaceId
    var VolumeARN: VolumeARN
    var DiskId: js.UndefOr[DiskId]
    var TargetName: js.UndefOr[TargetName]
  }

  object AttachVolumeInput {
    def apply(
        GatewayARN: GatewayARN,
        NetworkInterfaceId: NetworkInterfaceId,
        VolumeARN: VolumeARN,
        DiskId: js.UndefOr[DiskId] = js.undefined,
        TargetName: js.UndefOr[TargetName] = js.undefined
    ): AttachVolumeInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN"         -> GatewayARN.asInstanceOf[js.Any],
        "NetworkInterfaceId" -> NetworkInterfaceId.asInstanceOf[js.Any],
        "VolumeARN"          -> VolumeARN.asInstanceOf[js.Any]
      )

      DiskId.foreach(__v => __obj.update("DiskId", __v.asInstanceOf[js.Any]))
      TargetName.foreach(__v => __obj.update("TargetName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachVolumeInput]
    }
  }

  @js.native
  trait AttachVolumeOutput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object AttachVolumeOutput {
    def apply(
        TargetARN: js.UndefOr[TargetARN] = js.undefined,
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): AttachVolumeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TargetARN.foreach(__v => __obj.update("TargetARN", __v.asInstanceOf[js.Any]))
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachVolumeOutput]
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
    var TargetName: js.UndefOr[TargetName]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus]
    var VolumeId: js.UndefOr[VolumeId]
    var VolumeProgress: js.UndefOr[DoubleObject]
    var VolumeSizeInBytes: js.UndefOr[Double]
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
        TargetName: js.UndefOr[TargetName] = js.undefined,
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
        VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus] = js.undefined,
        VolumeId: js.UndefOr[VolumeId] = js.undefined,
        VolumeProgress: js.UndefOr[DoubleObject] = js.undefined,
        VolumeSizeInBytes: js.UndefOr[Double] = js.undefined,
        VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined,
        VolumeType: js.UndefOr[VolumeType] = js.undefined,
        VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes] = js.undefined,
        VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined
    ): CachediSCSIVolume = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      SourceSnapshotId.foreach(__v => __obj.update("SourceSnapshotId", __v.asInstanceOf[js.Any]))
      TargetName.foreach(__v => __obj.update("TargetName", __v.asInstanceOf[js.Any]))
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      VolumeAttachmentStatus.foreach(__v => __obj.update("VolumeAttachmentStatus", __v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.update("VolumeId", __v.asInstanceOf[js.Any]))
      VolumeProgress.foreach(__v => __obj.update("VolumeProgress", __v.asInstanceOf[js.Any]))
      VolumeSizeInBytes.foreach(__v => __obj.update("VolumeSizeInBytes", __v.asInstanceOf[js.Any]))
      VolumeStatus.foreach(__v => __obj.update("VolumeStatus", __v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.update("VolumeType", __v.asInstanceOf[js.Any]))
      VolumeUsedInBytes.foreach(__v => __obj.update("VolumeUsedInBytes", __v.asInstanceOf[js.Any]))
      VolumeiSCSIAttributes.foreach(__v => __obj.update("VolumeiSCSIAttributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CachediSCSIVolume]
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
        TapeARN: TapeARN
    ): CancelArchivalInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN"    -> TapeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelArchivalInput]
    }
  }

  @js.native
  trait CancelArchivalOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object CancelArchivalOutput {
    def apply(
        TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): CancelArchivalOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelArchivalOutput]
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
        TapeARN: TapeARN
    ): CancelRetrievalInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN"    -> TapeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelRetrievalInput]
    }
  }

  @js.native
  trait CancelRetrievalOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object CancelRetrievalOutput {
    def apply(
        TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): CancelRetrievalOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelRetrievalOutput]
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
        TargetARN: js.UndefOr[TargetARN] = js.undefined
    ): ChapInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      InitiatorName.foreach(__v => __obj.update("InitiatorName", __v.asInstanceOf[js.Any]))
      SecretToAuthenticateInitiator.foreach(
        __v => __obj.update("SecretToAuthenticateInitiator", __v.asInstanceOf[js.Any])
      )
      SecretToAuthenticateTarget.foreach(__v => __obj.update("SecretToAuthenticateTarget", __v.asInstanceOf[js.Any]))
      TargetARN.foreach(__v => __obj.update("TargetARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChapInfo]
    }
  }

  @js.native
  trait CreateCachediSCSIVolumeInput extends js.Object {
    var ClientToken: ClientToken
    var GatewayARN: GatewayARN
    var NetworkInterfaceId: NetworkInterfaceId
    var TargetName: TargetName
    var VolumeSizeInBytes: Double
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var SnapshotId: js.UndefOr[SnapshotId]
    var SourceVolumeARN: js.UndefOr[VolumeARN]
    var Tags: js.UndefOr[Tags]
  }

  object CreateCachediSCSIVolumeInput {
    def apply(
        ClientToken: ClientToken,
        GatewayARN: GatewayARN,
        NetworkInterfaceId: NetworkInterfaceId,
        TargetName: TargetName,
        VolumeSizeInBytes: Double,
        KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        SourceVolumeARN: js.UndefOr[VolumeARN] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateCachediSCSIVolumeInput = {
      val __obj = js.Dictionary[js.Any](
        "ClientToken"        -> ClientToken.asInstanceOf[js.Any],
        "GatewayARN"         -> GatewayARN.asInstanceOf[js.Any],
        "NetworkInterfaceId" -> NetworkInterfaceId.asInstanceOf[js.Any],
        "TargetName"         -> TargetName.asInstanceOf[js.Any],
        "VolumeSizeInBytes"  -> VolumeSizeInBytes.asInstanceOf[js.Any]
      )

      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.update("SnapshotId", __v.asInstanceOf[js.Any]))
      SourceVolumeARN.foreach(__v => __obj.update("SourceVolumeARN", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCachediSCSIVolumeInput]
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
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): CreateCachediSCSIVolumeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TargetARN.foreach(__v => __obj.update("TargetARN", __v.asInstanceOf[js.Any]))
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCachediSCSIVolumeOutput]
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
    var Tags: js.UndefOr[Tags]
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
        Squash: js.UndefOr[Squash] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateNFSFileShareInput = {
      val __obj = js.Dictionary[js.Any](
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "GatewayARN"  -> GatewayARN.asInstanceOf[js.Any],
        "LocationARN" -> LocationARN.asInstanceOf[js.Any],
        "Role"        -> Role.asInstanceOf[js.Any]
      )

      ClientList.foreach(__v => __obj.update("ClientList", __v.asInstanceOf[js.Any]))
      DefaultStorageClass.foreach(__v => __obj.update("DefaultStorageClass", __v.asInstanceOf[js.Any]))
      GuessMIMETypeEnabled.foreach(__v => __obj.update("GuessMIMETypeEnabled", __v.asInstanceOf[js.Any]))
      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      NFSFileShareDefaults.foreach(__v => __obj.update("NFSFileShareDefaults", __v.asInstanceOf[js.Any]))
      ObjectACL.foreach(__v => __obj.update("ObjectACL", __v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.update("ReadOnly", __v.asInstanceOf[js.Any]))
      RequesterPays.foreach(__v => __obj.update("RequesterPays", __v.asInstanceOf[js.Any]))
      Squash.foreach(__v => __obj.update("Squash", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNFSFileShareInput]
    }
  }

  @js.native
  trait CreateNFSFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object CreateNFSFileShareOutput {
    def apply(
        FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    ): CreateNFSFileShareOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNFSFileShareOutput]
    }
  }

  @js.native
  trait CreateSMBFileShareInput extends js.Object {
    var ClientToken: ClientToken
    var GatewayARN: GatewayARN
    var LocationARN: LocationARN
    var Role: Role
    var AdminUserList: js.UndefOr[FileShareUserList]
    var Authentication: js.UndefOr[Authentication]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var InvalidUserList: js.UndefOr[FileShareUserList]
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var ObjectACL: js.UndefOr[ObjectACL]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var SMBACLEnabled: js.UndefOr[Boolean]
    var Tags: js.UndefOr[Tags]
    var ValidUserList: js.UndefOr[FileShareUserList]
  }

  object CreateSMBFileShareInput {
    def apply(
        ClientToken: ClientToken,
        GatewayARN: GatewayARN,
        LocationARN: LocationARN,
        Role: Role,
        AdminUserList: js.UndefOr[FileShareUserList] = js.undefined,
        Authentication: js.UndefOr[Authentication] = js.undefined,
        DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
        GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
        InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined,
        KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
        ReadOnly: js.UndefOr[Boolean] = js.undefined,
        RequesterPays: js.UndefOr[Boolean] = js.undefined,
        SMBACLEnabled: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
    ): CreateSMBFileShareInput = {
      val __obj = js.Dictionary[js.Any](
        "ClientToken" -> ClientToken.asInstanceOf[js.Any],
        "GatewayARN"  -> GatewayARN.asInstanceOf[js.Any],
        "LocationARN" -> LocationARN.asInstanceOf[js.Any],
        "Role"        -> Role.asInstanceOf[js.Any]
      )

      AdminUserList.foreach(__v => __obj.update("AdminUserList", __v.asInstanceOf[js.Any]))
      Authentication.foreach(__v => __obj.update("Authentication", __v.asInstanceOf[js.Any]))
      DefaultStorageClass.foreach(__v => __obj.update("DefaultStorageClass", __v.asInstanceOf[js.Any]))
      GuessMIMETypeEnabled.foreach(__v => __obj.update("GuessMIMETypeEnabled", __v.asInstanceOf[js.Any]))
      InvalidUserList.foreach(__v => __obj.update("InvalidUserList", __v.asInstanceOf[js.Any]))
      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      ObjectACL.foreach(__v => __obj.update("ObjectACL", __v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.update("ReadOnly", __v.asInstanceOf[js.Any]))
      RequesterPays.foreach(__v => __obj.update("RequesterPays", __v.asInstanceOf[js.Any]))
      SMBACLEnabled.foreach(__v => __obj.update("SMBACLEnabled", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      ValidUserList.foreach(__v => __obj.update("ValidUserList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSMBFileShareInput]
    }
  }

  @js.native
  trait CreateSMBFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object CreateSMBFileShareOutput {
    def apply(
        FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    ): CreateSMBFileShareOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSMBFileShareOutput]
    }
  }

  @js.native
  trait CreateSnapshotFromVolumeRecoveryPointInput extends js.Object {
    var SnapshotDescription: SnapshotDescription
    var VolumeARN: VolumeARN
    var Tags: js.UndefOr[Tags]
  }

  object CreateSnapshotFromVolumeRecoveryPointInput {
    def apply(
        SnapshotDescription: SnapshotDescription,
        VolumeARN: VolumeARN,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateSnapshotFromVolumeRecoveryPointInput = {
      val __obj = js.Dictionary[js.Any](
        "SnapshotDescription" -> SnapshotDescription.asInstanceOf[js.Any],
        "VolumeARN"           -> VolumeARN.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointInput]
    }
  }

  @js.native
  trait CreateSnapshotFromVolumeRecoveryPointOutput extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeRecoveryPointTime: js.UndefOr[String]
  }

  object CreateSnapshotFromVolumeRecoveryPointOutput {
    def apply(
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
        VolumeRecoveryPointTime: js.UndefOr[String] = js.undefined
    ): CreateSnapshotFromVolumeRecoveryPointOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      SnapshotId.foreach(__v => __obj.update("SnapshotId", __v.asInstanceOf[js.Any]))
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      VolumeRecoveryPointTime.foreach(__v => __obj.update("VolumeRecoveryPointTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointOutput]
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
    var Tags: js.UndefOr[Tags]
  }

  object CreateSnapshotInput {
    def apply(
        SnapshotDescription: SnapshotDescription,
        VolumeARN: VolumeARN,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateSnapshotInput = {
      val __obj = js.Dictionary[js.Any](
        "SnapshotDescription" -> SnapshotDescription.asInstanceOf[js.Any],
        "VolumeARN"           -> VolumeARN.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotInput]
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
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): CreateSnapshotOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      SnapshotId.foreach(__v => __obj.update("SnapshotId", __v.asInstanceOf[js.Any]))
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotOutput]
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
    var PreserveExistingData: Boolean
    var TargetName: TargetName
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var SnapshotId: js.UndefOr[SnapshotId]
    var Tags: js.UndefOr[Tags]
  }

  object CreateStorediSCSIVolumeInput {
    def apply(
        DiskId: DiskId,
        GatewayARN: GatewayARN,
        NetworkInterfaceId: NetworkInterfaceId,
        PreserveExistingData: Boolean,
        TargetName: TargetName,
        KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateStorediSCSIVolumeInput = {
      val __obj = js.Dictionary[js.Any](
        "DiskId"               -> DiskId.asInstanceOf[js.Any],
        "GatewayARN"           -> GatewayARN.asInstanceOf[js.Any],
        "NetworkInterfaceId"   -> NetworkInterfaceId.asInstanceOf[js.Any],
        "PreserveExistingData" -> PreserveExistingData.asInstanceOf[js.Any],
        "TargetName"           -> TargetName.asInstanceOf[js.Any]
      )

      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.update("SnapshotId", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStorediSCSIVolumeInput]
    }
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  trait CreateStorediSCSIVolumeOutput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeSizeInBytes: js.UndefOr[Double]
  }

  object CreateStorediSCSIVolumeOutput {
    def apply(
        TargetARN: js.UndefOr[TargetARN] = js.undefined,
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
        VolumeSizeInBytes: js.UndefOr[Double] = js.undefined
    ): CreateStorediSCSIVolumeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TargetARN.foreach(__v => __obj.update("TargetARN", __v.asInstanceOf[js.Any]))
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      VolumeSizeInBytes.foreach(__v => __obj.update("VolumeSizeInBytes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStorediSCSIVolumeOutput]
    }
  }

  @js.native
  trait CreateTapeWithBarcodeInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeBarcode: TapeBarcode
    var TapeSizeInBytes: TapeSize
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var PoolId: js.UndefOr[PoolId]
    var Tags: js.UndefOr[Tags]
  }

  object CreateTapeWithBarcodeInput {
    def apply(
        GatewayARN: GatewayARN,
        TapeBarcode: TapeBarcode,
        TapeSizeInBytes: TapeSize,
        KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        PoolId: js.UndefOr[PoolId] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateTapeWithBarcodeInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN"      -> GatewayARN.asInstanceOf[js.Any],
        "TapeBarcode"     -> TapeBarcode.asInstanceOf[js.Any],
        "TapeSizeInBytes" -> TapeSizeInBytes.asInstanceOf[js.Any]
      )

      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.update("PoolId", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTapeWithBarcodeInput]
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
        TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): CreateTapeWithBarcodeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTapeWithBarcodeOutput]
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
    var PoolId: js.UndefOr[PoolId]
    var Tags: js.UndefOr[Tags]
  }

  object CreateTapesInput {
    def apply(
        ClientToken: ClientToken,
        GatewayARN: GatewayARN,
        NumTapesToCreate: NumTapesToCreate,
        TapeBarcodePrefix: TapeBarcodePrefix,
        TapeSizeInBytes: TapeSize,
        KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        PoolId: js.UndefOr[PoolId] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateTapesInput = {
      val __obj = js.Dictionary[js.Any](
        "ClientToken"       -> ClientToken.asInstanceOf[js.Any],
        "GatewayARN"        -> GatewayARN.asInstanceOf[js.Any],
        "NumTapesToCreate"  -> NumTapesToCreate.asInstanceOf[js.Any],
        "TapeBarcodePrefix" -> TapeBarcodePrefix.asInstanceOf[js.Any],
        "TapeSizeInBytes"   -> TapeSizeInBytes.asInstanceOf[js.Any]
      )

      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.update("PoolId", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTapesInput]
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
        TapeARNs: js.UndefOr[TapeARNs] = js.undefined
    ): CreateTapesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARNs.foreach(__v => __obj.update("TapeARNs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTapesOutput]
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
        GatewayARN: GatewayARN
    ): DeleteBandwidthRateLimitInput = {
      val __obj = js.Dictionary[js.Any](
        "BandwidthType" -> BandwidthType.asInstanceOf[js.Any],
        "GatewayARN"    -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBandwidthRateLimitInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DeleteBandwidthRateLimitOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBandwidthRateLimitOutput]
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
        TargetARN: TargetARN
    ): DeleteChapCredentialsInput = {
      val __obj = js.Dictionary[js.Any](
        "InitiatorName" -> InitiatorName.asInstanceOf[js.Any],
        "TargetARN"     -> TargetARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteChapCredentialsInput]
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
        TargetARN: js.UndefOr[TargetARN] = js.undefined
    ): DeleteChapCredentialsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      InitiatorName.foreach(__v => __obj.update("InitiatorName", __v.asInstanceOf[js.Any]))
      TargetARN.foreach(__v => __obj.update("TargetARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteChapCredentialsOutput]
    }
  }

  @js.native
  trait DeleteFileShareInput extends js.Object {
    var FileShareARN: FileShareARN
    var ForceDelete: js.UndefOr[Boolean]
  }

  object DeleteFileShareInput {
    def apply(
        FileShareARN: FileShareARN,
        ForceDelete: js.UndefOr[Boolean] = js.undefined
    ): DeleteFileShareInput = {
      val __obj = js.Dictionary[js.Any](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any]
      )

      ForceDelete.foreach(__v => __obj.update("ForceDelete", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileShareInput]
    }
  }

  @js.native
  trait DeleteFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object DeleteFileShareOutput {
    def apply(
        FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    ): DeleteFileShareOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFileShareOutput]
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
        GatewayARN: GatewayARN
    ): DeleteGatewayInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGatewayInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DeleteGatewayOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGatewayOutput]
    }
  }

  @js.native
  trait DeleteSnapshotScheduleInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object DeleteSnapshotScheduleInput {
    def apply(
        VolumeARN: VolumeARN
    ): DeleteSnapshotScheduleInput = {
      val __obj = js.Dictionary[js.Any](
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSnapshotScheduleInput]
    }
  }

  @js.native
  trait DeleteSnapshotScheduleOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DeleteSnapshotScheduleOutput {
    def apply(
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DeleteSnapshotScheduleOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSnapshotScheduleOutput]
    }
  }

  @js.native
  trait DeleteTapeArchiveInput extends js.Object {
    var TapeARN: TapeARN
  }

  object DeleteTapeArchiveInput {
    def apply(
        TapeARN: TapeARN
    ): DeleteTapeArchiveInput = {
      val __obj = js.Dictionary[js.Any](
        "TapeARN" -> TapeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTapeArchiveInput]
    }
  }

  @js.native
  trait DeleteTapeArchiveOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object DeleteTapeArchiveOutput {
    def apply(
        TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): DeleteTapeArchiveOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTapeArchiveOutput]
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
        TapeARN: TapeARN
    ): DeleteTapeInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN"    -> TapeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTapeInput]
    }
  }

  @js.native
  trait DeleteTapeOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object DeleteTapeOutput {
    def apply(
        TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): DeleteTapeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTapeOutput]
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
        VolumeARN: VolumeARN
    ): DeleteVolumeInput = {
      val __obj = js.Dictionary[js.Any](
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVolumeInput]
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
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DeleteVolumeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVolumeOutput]
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
        GatewayARN: GatewayARN
    ): DescribeBandwidthRateLimitInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeBandwidthRateLimitInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DescribeBandwidthRateLimitOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      AverageDownloadRateLimitInBitsPerSec.foreach(
        __v => __obj.update("AverageDownloadRateLimitInBitsPerSec", __v.asInstanceOf[js.Any])
      )
      AverageUploadRateLimitInBitsPerSec.foreach(
        __v => __obj.update("AverageUploadRateLimitInBitsPerSec", __v.asInstanceOf[js.Any])
      )
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBandwidthRateLimitOutput]
    }
  }

  @js.native
  trait DescribeCacheInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeCacheInput {
    def apply(
        GatewayARN: GatewayARN
    ): DescribeCacheInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCacheInput]
    }
  }

  @js.native
  trait DescribeCacheOutput extends js.Object {
    var CacheAllocatedInBytes: js.UndefOr[Double]
    var CacheDirtyPercentage: js.UndefOr[double]
    var CacheHitPercentage: js.UndefOr[double]
    var CacheMissPercentage: js.UndefOr[double]
    var CacheUsedPercentage: js.UndefOr[double]
    var DiskIds: js.UndefOr[DiskIds]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DescribeCacheOutput {
    def apply(
        CacheAllocatedInBytes: js.UndefOr[Double] = js.undefined,
        CacheDirtyPercentage: js.UndefOr[double] = js.undefined,
        CacheHitPercentage: js.UndefOr[double] = js.undefined,
        CacheMissPercentage: js.UndefOr[double] = js.undefined,
        CacheUsedPercentage: js.UndefOr[double] = js.undefined,
        DiskIds: js.UndefOr[DiskIds] = js.undefined,
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DescribeCacheOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CacheAllocatedInBytes.foreach(__v => __obj.update("CacheAllocatedInBytes", __v.asInstanceOf[js.Any]))
      CacheDirtyPercentage.foreach(__v => __obj.update("CacheDirtyPercentage", __v.asInstanceOf[js.Any]))
      CacheHitPercentage.foreach(__v => __obj.update("CacheHitPercentage", __v.asInstanceOf[js.Any]))
      CacheMissPercentage.foreach(__v => __obj.update("CacheMissPercentage", __v.asInstanceOf[js.Any]))
      CacheUsedPercentage.foreach(__v => __obj.update("CacheUsedPercentage", __v.asInstanceOf[js.Any]))
      DiskIds.foreach(__v => __obj.update("DiskIds", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCacheOutput]
    }
  }

  @js.native
  trait DescribeCachediSCSIVolumesInput extends js.Object {
    var VolumeARNs: VolumeARNs
  }

  object DescribeCachediSCSIVolumesInput {
    def apply(
        VolumeARNs: VolumeARNs
    ): DescribeCachediSCSIVolumesInput = {
      val __obj = js.Dictionary[js.Any](
        "VolumeARNs" -> VolumeARNs.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeCachediSCSIVolumesInput]
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
        CachediSCSIVolumes: js.UndefOr[CachediSCSIVolumes] = js.undefined
    ): DescribeCachediSCSIVolumesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      CachediSCSIVolumes.foreach(__v => __obj.update("CachediSCSIVolumes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCachediSCSIVolumesOutput]
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
        TargetARN: TargetARN
    ): DescribeChapCredentialsInput = {
      val __obj = js.Dictionary[js.Any](
        "TargetARN" -> TargetARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeChapCredentialsInput]
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
        ChapCredentials: js.UndefOr[ChapCredentials] = js.undefined
    ): DescribeChapCredentialsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ChapCredentials.foreach(__v => __obj.update("ChapCredentials", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChapCredentialsOutput]
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
        GatewayARN: GatewayARN
    ): DescribeGatewayInformationInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeGatewayInformationInput]
    }
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  trait DescribeGatewayInformationOutput extends js.Object {
    var Ec2InstanceId: js.UndefOr[Ec2InstanceId]
    var Ec2InstanceRegion: js.UndefOr[Ec2InstanceRegion]
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayId: js.UndefOr[GatewayId]
    var GatewayName: js.UndefOr[String]
    var GatewayNetworkInterfaces: js.UndefOr[GatewayNetworkInterfaces]
    var GatewayState: js.UndefOr[GatewayState]
    var GatewayTimezone: js.UndefOr[GatewayTimezone]
    var GatewayType: js.UndefOr[GatewayType]
    var LastSoftwareUpdate: js.UndefOr[LastSoftwareUpdate]
    var NextUpdateAvailabilityDate: js.UndefOr[NextUpdateAvailabilityDate]
    var Tags: js.UndefOr[Tags]
    var VPCEndpoint: js.UndefOr[String]
  }

  object DescribeGatewayInformationOutput {
    def apply(
        Ec2InstanceId: js.UndefOr[Ec2InstanceId] = js.undefined,
        Ec2InstanceRegion: js.UndefOr[Ec2InstanceRegion] = js.undefined,
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        GatewayId: js.UndefOr[GatewayId] = js.undefined,
        GatewayName: js.UndefOr[String] = js.undefined,
        GatewayNetworkInterfaces: js.UndefOr[GatewayNetworkInterfaces] = js.undefined,
        GatewayState: js.UndefOr[GatewayState] = js.undefined,
        GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined,
        GatewayType: js.UndefOr[GatewayType] = js.undefined,
        LastSoftwareUpdate: js.UndefOr[LastSoftwareUpdate] = js.undefined,
        NextUpdateAvailabilityDate: js.UndefOr[NextUpdateAvailabilityDate] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VPCEndpoint: js.UndefOr[String] = js.undefined
    ): DescribeGatewayInformationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Ec2InstanceId.foreach(__v => __obj.update("Ec2InstanceId", __v.asInstanceOf[js.Any]))
      Ec2InstanceRegion.foreach(__v => __obj.update("Ec2InstanceRegion", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      GatewayId.foreach(__v => __obj.update("GatewayId", __v.asInstanceOf[js.Any]))
      GatewayName.foreach(__v => __obj.update("GatewayName", __v.asInstanceOf[js.Any]))
      GatewayNetworkInterfaces.foreach(__v => __obj.update("GatewayNetworkInterfaces", __v.asInstanceOf[js.Any]))
      GatewayState.foreach(__v => __obj.update("GatewayState", __v.asInstanceOf[js.Any]))
      GatewayTimezone.foreach(__v => __obj.update("GatewayTimezone", __v.asInstanceOf[js.Any]))
      GatewayType.foreach(__v => __obj.update("GatewayType", __v.asInstanceOf[js.Any]))
      LastSoftwareUpdate.foreach(__v => __obj.update("LastSoftwareUpdate", __v.asInstanceOf[js.Any]))
      NextUpdateAvailabilityDate.foreach(__v => __obj.update("NextUpdateAvailabilityDate", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      VPCEndpoint.foreach(__v => __obj.update("VPCEndpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGatewayInformationOutput]
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
        GatewayARN: GatewayARN
    ): DescribeMaintenanceStartTimeInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeMaintenanceStartTimeInput]
    }
  }

  /**
    * A JSON object containing the following fields:
    * * DayOfMonth
    *  * DayOfWeek
    *  * HourOfDay
    *  * MinuteOfHour
    *  * Timezone
    */
  @js.native
  trait DescribeMaintenanceStartTimeOutput extends js.Object {
    var DayOfMonth: js.UndefOr[DayOfMonth]
    var DayOfWeek: js.UndefOr[DayOfWeek]
    var GatewayARN: js.UndefOr[GatewayARN]
    var HourOfDay: js.UndefOr[HourOfDay]
    var MinuteOfHour: js.UndefOr[MinuteOfHour]
    var Timezone: js.UndefOr[GatewayTimezone]
  }

  object DescribeMaintenanceStartTimeOutput {
    def apply(
        DayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        HourOfDay: js.UndefOr[HourOfDay] = js.undefined,
        MinuteOfHour: js.UndefOr[MinuteOfHour] = js.undefined,
        Timezone: js.UndefOr[GatewayTimezone] = js.undefined
    ): DescribeMaintenanceStartTimeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      DayOfMonth.foreach(__v => __obj.update("DayOfMonth", __v.asInstanceOf[js.Any]))
      DayOfWeek.foreach(__v => __obj.update("DayOfWeek", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      HourOfDay.foreach(__v => __obj.update("HourOfDay", __v.asInstanceOf[js.Any]))
      MinuteOfHour.foreach(__v => __obj.update("MinuteOfHour", __v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.update("Timezone", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMaintenanceStartTimeOutput]
    }
  }

  @js.native
  trait DescribeNFSFileSharesInput extends js.Object {
    var FileShareARNList: FileShareARNList
  }

  object DescribeNFSFileSharesInput {
    def apply(
        FileShareARNList: FileShareARNList
    ): DescribeNFSFileSharesInput = {
      val __obj = js.Dictionary[js.Any](
        "FileShareARNList" -> FileShareARNList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeNFSFileSharesInput]
    }
  }

  @js.native
  trait DescribeNFSFileSharesOutput extends js.Object {
    var NFSFileShareInfoList: js.UndefOr[NFSFileShareInfoList]
  }

  object DescribeNFSFileSharesOutput {
    def apply(
        NFSFileShareInfoList: js.UndefOr[NFSFileShareInfoList] = js.undefined
    ): DescribeNFSFileSharesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NFSFileShareInfoList.foreach(__v => __obj.update("NFSFileShareInfoList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNFSFileSharesOutput]
    }
  }

  @js.native
  trait DescribeSMBFileSharesInput extends js.Object {
    var FileShareARNList: FileShareARNList
  }

  object DescribeSMBFileSharesInput {
    def apply(
        FileShareARNList: FileShareARNList
    ): DescribeSMBFileSharesInput = {
      val __obj = js.Dictionary[js.Any](
        "FileShareARNList" -> FileShareARNList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSMBFileSharesInput]
    }
  }

  @js.native
  trait DescribeSMBFileSharesOutput extends js.Object {
    var SMBFileShareInfoList: js.UndefOr[SMBFileShareInfoList]
  }

  object DescribeSMBFileSharesOutput {
    def apply(
        SMBFileShareInfoList: js.UndefOr[SMBFileShareInfoList] = js.undefined
    ): DescribeSMBFileSharesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      SMBFileShareInfoList.foreach(__v => __obj.update("SMBFileShareInfoList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSMBFileSharesOutput]
    }
  }

  @js.native
  trait DescribeSMBSettingsInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeSMBSettingsInput {
    def apply(
        GatewayARN: GatewayARN
    ): DescribeSMBSettingsInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSMBSettingsInput]
    }
  }

  @js.native
  trait DescribeSMBSettingsOutput extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var GatewayARN: js.UndefOr[GatewayARN]
    var SMBGuestPasswordSet: js.UndefOr[Boolean]
    var SMBSecurityStrategy: js.UndefOr[SMBSecurityStrategy]
  }

  object DescribeSMBSettingsOutput {
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined,
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined,
        SMBSecurityStrategy: js.UndefOr[SMBSecurityStrategy] = js.undefined
    ): DescribeSMBSettingsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainName.foreach(__v => __obj.update("DomainName", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      SMBGuestPasswordSet.foreach(__v => __obj.update("SMBGuestPasswordSet", __v.asInstanceOf[js.Any]))
      SMBSecurityStrategy.foreach(__v => __obj.update("SMBSecurityStrategy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSMBSettingsOutput]
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
        VolumeARN: VolumeARN
    ): DescribeSnapshotScheduleInput = {
      val __obj = js.Dictionary[js.Any](
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeSnapshotScheduleInput]
    }
  }

  @js.native
  trait DescribeSnapshotScheduleOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var RecurrenceInHours: js.UndefOr[RecurrenceInHours]
    var StartAt: js.UndefOr[HourOfDay]
    var Tags: js.UndefOr[Tags]
    var Timezone: js.UndefOr[GatewayTimezone]
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DescribeSnapshotScheduleOutput {
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        RecurrenceInHours: js.UndefOr[RecurrenceInHours] = js.undefined,
        StartAt: js.UndefOr[HourOfDay] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Timezone: js.UndefOr[GatewayTimezone] = js.undefined,
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DescribeSnapshotScheduleOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      RecurrenceInHours.foreach(__v => __obj.update("RecurrenceInHours", __v.asInstanceOf[js.Any]))
      StartAt.foreach(__v => __obj.update("StartAt", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Timezone.foreach(__v => __obj.update("Timezone", __v.asInstanceOf[js.Any]))
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSnapshotScheduleOutput]
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
        VolumeARNs: VolumeARNs
    ): DescribeStorediSCSIVolumesInput = {
      val __obj = js.Dictionary[js.Any](
        "VolumeARNs" -> VolumeARNs.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeStorediSCSIVolumesInput]
    }
  }

  @js.native
  trait DescribeStorediSCSIVolumesOutput extends js.Object {
    var StorediSCSIVolumes: js.UndefOr[StorediSCSIVolumes]
  }

  object DescribeStorediSCSIVolumesOutput {
    def apply(
        StorediSCSIVolumes: js.UndefOr[StorediSCSIVolumes] = js.undefined
    ): DescribeStorediSCSIVolumesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      StorediSCSIVolumes.foreach(__v => __obj.update("StorediSCSIVolumes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStorediSCSIVolumesOutput]
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
        TapeARNs: js.UndefOr[TapeARNs] = js.undefined
    ): DescribeTapeArchivesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      TapeARNs.foreach(__v => __obj.update("TapeARNs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTapeArchivesInput]
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
        TapeArchives: js.UndefOr[TapeArchives] = js.undefined
    ): DescribeTapeArchivesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      TapeArchives.foreach(__v => __obj.update("TapeArchives", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTapeArchivesOutput]
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
        Marker: js.UndefOr[Marker] = js.undefined
    ): DescribeTapeRecoveryPointsInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTapeRecoveryPointsInput]
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
        TapeRecoveryPointInfos: js.UndefOr[TapeRecoveryPointInfos] = js.undefined
    ): DescribeTapeRecoveryPointsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      TapeRecoveryPointInfos.foreach(__v => __obj.update("TapeRecoveryPointInfos", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTapeRecoveryPointsOutput]
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
        TapeARNs: js.UndefOr[TapeARNs] = js.undefined
    ): DescribeTapesInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      TapeARNs.foreach(__v => __obj.update("TapeARNs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTapesInput]
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
        Tapes: js.UndefOr[Tapes] = js.undefined
    ): DescribeTapesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      Tapes.foreach(__v => __obj.update("Tapes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTapesOutput]
    }
  }

  @js.native
  trait DescribeUploadBufferInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DescribeUploadBufferInput {
    def apply(
        GatewayARN: GatewayARN
    ): DescribeUploadBufferInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeUploadBufferInput]
    }
  }

  @js.native
  trait DescribeUploadBufferOutput extends js.Object {
    var DiskIds: js.UndefOr[DiskIds]
    var GatewayARN: js.UndefOr[GatewayARN]
    var UploadBufferAllocatedInBytes: js.UndefOr[Double]
    var UploadBufferUsedInBytes: js.UndefOr[Double]
  }

  object DescribeUploadBufferOutput {
    def apply(
        DiskIds: js.UndefOr[DiskIds] = js.undefined,
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        UploadBufferAllocatedInBytes: js.UndefOr[Double] = js.undefined,
        UploadBufferUsedInBytes: js.UndefOr[Double] = js.undefined
    ): DescribeUploadBufferOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      DiskIds.foreach(__v => __obj.update("DiskIds", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      UploadBufferAllocatedInBytes.foreach(
        __v => __obj.update("UploadBufferAllocatedInBytes", __v.asInstanceOf[js.Any])
      )
      UploadBufferUsedInBytes.foreach(__v => __obj.update("UploadBufferUsedInBytes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUploadBufferOutput]
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
        VTLDeviceARNs: js.UndefOr[VTLDeviceARNs] = js.undefined
    ): DescribeVTLDevicesInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      VTLDeviceARNs.foreach(__v => __obj.update("VTLDeviceARNs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVTLDevicesInput]
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
        VTLDevices: js.UndefOr[VTLDevices] = js.undefined
    ): DescribeVTLDevicesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      VTLDevices.foreach(__v => __obj.update("VTLDevices", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVTLDevicesOutput]
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
        GatewayARN: GatewayARN
    ): DescribeWorkingStorageInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeWorkingStorageInput]
    }
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  trait DescribeWorkingStorageOutput extends js.Object {
    var DiskIds: js.UndefOr[DiskIds]
    var GatewayARN: js.UndefOr[GatewayARN]
    var WorkingStorageAllocatedInBytes: js.UndefOr[Double]
    var WorkingStorageUsedInBytes: js.UndefOr[Double]
  }

  object DescribeWorkingStorageOutput {
    def apply(
        DiskIds: js.UndefOr[DiskIds] = js.undefined,
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        WorkingStorageAllocatedInBytes: js.UndefOr[Double] = js.undefined,
        WorkingStorageUsedInBytes: js.UndefOr[Double] = js.undefined
    ): DescribeWorkingStorageOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      DiskIds.foreach(__v => __obj.update("DiskIds", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      WorkingStorageAllocatedInBytes.foreach(
        __v => __obj.update("WorkingStorageAllocatedInBytes", __v.asInstanceOf[js.Any])
      )
      WorkingStorageUsedInBytes.foreach(__v => __obj.update("WorkingStorageUsedInBytes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeWorkingStorageOutput]
    }
  }

  /**
    * AttachVolumeInput
    */
  @js.native
  trait DetachVolumeInput extends js.Object {
    var VolumeARN: VolumeARN
    var ForceDetach: js.UndefOr[Boolean]
  }

  object DetachVolumeInput {
    def apply(
        VolumeARN: VolumeARN,
        ForceDetach: js.UndefOr[Boolean] = js.undefined
    ): DetachVolumeInput = {
      val __obj = js.Dictionary[js.Any](
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]
      )

      ForceDetach.foreach(__v => __obj.update("ForceDetach", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachVolumeInput]
    }
  }

  /**
    * AttachVolumeOutput
    */
  @js.native
  trait DetachVolumeOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  object DetachVolumeOutput {
    def apply(
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): DetachVolumeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DetachVolumeOutput]
    }
  }

  /**
    * Lists iSCSI information about a VTL device.
    */
  @js.native
  trait DeviceiSCSIAttributes extends js.Object {
    var ChapEnabled: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NetworkInterfacePort: js.UndefOr[Int]
    var TargetARN: js.UndefOr[TargetARN]
  }

  object DeviceiSCSIAttributes {
    def apply(
        ChapEnabled: js.UndefOr[Boolean] = js.undefined,
        NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
        NetworkInterfacePort: js.UndefOr[Int] = js.undefined,
        TargetARN: js.UndefOr[TargetARN] = js.undefined
    ): DeviceiSCSIAttributes = {
      val __obj = js.Dictionary.empty[js.Any]
      ChapEnabled.foreach(__v => __obj.update("ChapEnabled", __v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.update("NetworkInterfaceId", __v.asInstanceOf[js.Any]))
      NetworkInterfacePort.foreach(__v => __obj.update("NetworkInterfacePort", __v.asInstanceOf[js.Any]))
      TargetARN.foreach(__v => __obj.update("TargetARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceiSCSIAttributes]
    }
  }

  @js.native
  trait DisableGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object DisableGatewayInput {
    def apply(
        GatewayARN: GatewayARN
    ): DisableGatewayInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisableGatewayInput]
    }
  }

  @js.native
  trait DisableGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object DisableGatewayOutput {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): DisableGatewayOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisableGatewayOutput]
    }
  }

  /**
    * Represents a gateway's local disk.
    */
  @js.native
  trait Disk extends js.Object {
    var DiskAllocationResource: js.UndefOr[String]
    var DiskAllocationType: js.UndefOr[DiskAllocationType]
    var DiskAttributeList: js.UndefOr[DiskAttributeList]
    var DiskId: js.UndefOr[DiskId]
    var DiskNode: js.UndefOr[String]
    var DiskPath: js.UndefOr[String]
    var DiskSizeInBytes: js.UndefOr[Double]
    var DiskStatus: js.UndefOr[String]
  }

  object Disk {
    def apply(
        DiskAllocationResource: js.UndefOr[String] = js.undefined,
        DiskAllocationType: js.UndefOr[DiskAllocationType] = js.undefined,
        DiskAttributeList: js.UndefOr[DiskAttributeList] = js.undefined,
        DiskId: js.UndefOr[DiskId] = js.undefined,
        DiskNode: js.UndefOr[String] = js.undefined,
        DiskPath: js.UndefOr[String] = js.undefined,
        DiskSizeInBytes: js.UndefOr[Double] = js.undefined,
        DiskStatus: js.UndefOr[String] = js.undefined
    ): Disk = {
      val __obj = js.Dictionary.empty[js.Any]
      DiskAllocationResource.foreach(__v => __obj.update("DiskAllocationResource", __v.asInstanceOf[js.Any]))
      DiskAllocationType.foreach(__v => __obj.update("DiskAllocationType", __v.asInstanceOf[js.Any]))
      DiskAttributeList.foreach(__v => __obj.update("DiskAttributeList", __v.asInstanceOf[js.Any]))
      DiskId.foreach(__v => __obj.update("DiskId", __v.asInstanceOf[js.Any]))
      DiskNode.foreach(__v => __obj.update("DiskNode", __v.asInstanceOf[js.Any]))
      DiskPath.foreach(__v => __obj.update("DiskPath", __v.asInstanceOf[js.Any]))
      DiskSizeInBytes.foreach(__v => __obj.update("DiskSizeInBytes", __v.asInstanceOf[js.Any]))
      DiskStatus.foreach(__v => __obj.update("DiskStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Disk]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): FileShareInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      FileShareId.foreach(__v => __obj.update("FileShareId", __v.asInstanceOf[js.Any]))
      FileShareStatus.foreach(__v => __obj.update("FileShareStatus", __v.asInstanceOf[js.Any]))
      FileShareType.foreach(__v => __obj.update("FileShareType", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileShareInfo]
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
    var Ec2InstanceId: js.UndefOr[Ec2InstanceId]
    var Ec2InstanceRegion: js.UndefOr[Ec2InstanceRegion]
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayId: js.UndefOr[GatewayId]
    var GatewayName: js.UndefOr[String]
    var GatewayOperationalState: js.UndefOr[GatewayOperationalState]
    var GatewayType: js.UndefOr[GatewayType]
  }

  object GatewayInfo {
    def apply(
        Ec2InstanceId: js.UndefOr[Ec2InstanceId] = js.undefined,
        Ec2InstanceRegion: js.UndefOr[Ec2InstanceRegion] = js.undefined,
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        GatewayId: js.UndefOr[GatewayId] = js.undefined,
        GatewayName: js.UndefOr[String] = js.undefined,
        GatewayOperationalState: js.UndefOr[GatewayOperationalState] = js.undefined,
        GatewayType: js.UndefOr[GatewayType] = js.undefined
    ): GatewayInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      Ec2InstanceId.foreach(__v => __obj.update("Ec2InstanceId", __v.asInstanceOf[js.Any]))
      Ec2InstanceRegion.foreach(__v => __obj.update("Ec2InstanceRegion", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      GatewayId.foreach(__v => __obj.update("GatewayId", __v.asInstanceOf[js.Any]))
      GatewayName.foreach(__v => __obj.update("GatewayName", __v.asInstanceOf[js.Any]))
      GatewayOperationalState.foreach(__v => __obj.update("GatewayOperationalState", __v.asInstanceOf[js.Any]))
      GatewayType.foreach(__v => __obj.update("GatewayType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewayInfo]
    }
  }

  @js.native
  trait JoinDomainInput extends js.Object {
    var DomainName: DomainName
    var GatewayARN: GatewayARN
    var Password: DomainUserPassword
    var UserName: DomainUserName
    var DomainControllers: js.UndefOr[Hosts]
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
  }

  object JoinDomainInput {
    def apply(
        DomainName: DomainName,
        GatewayARN: GatewayARN,
        Password: DomainUserPassword,
        UserName: DomainUserName,
        DomainControllers: js.UndefOr[Hosts] = js.undefined,
        OrganizationalUnit: js.UndefOr[OrganizationalUnit] = js.undefined
    ): JoinDomainInput = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "Password"   -> Password.asInstanceOf[js.Any],
        "UserName"   -> UserName.asInstanceOf[js.Any]
      )

      DomainControllers.foreach(__v => __obj.update("DomainControllers", __v.asInstanceOf[js.Any]))
      OrganizationalUnit.foreach(__v => __obj.update("OrganizationalUnit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JoinDomainInput]
    }
  }

  @js.native
  trait JoinDomainOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object JoinDomainOutput {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): JoinDomainOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JoinDomainOutput]
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
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListFileSharesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFileSharesInput]
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
        NextMarker: js.UndefOr[Marker] = js.undefined
    ): ListFileSharesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FileShareInfoList.foreach(__v => __obj.update("FileShareInfoList", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      NextMarker.foreach(__v => __obj.update("NextMarker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFileSharesOutput]
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
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListGatewaysInput = {
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewaysInput]
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
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListGatewaysOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Gateways.foreach(__v => __obj.update("Gateways", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewaysOutput]
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
        GatewayARN: GatewayARN
    ): ListLocalDisksInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListLocalDisksInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ListLocalDisksOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Disks.foreach(__v => __obj.update("Disks", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLocalDisksOutput]
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
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
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
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.update("ResourceARN", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
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
        TapeARNs: js.UndefOr[TapeARNs] = js.undefined
    ): ListTapesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      TapeARNs.foreach(__v => __obj.update("TapeARNs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTapesInput]
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
        TapeInfos: js.UndefOr[TapeInfos] = js.undefined
    ): ListTapesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      TapeInfos.foreach(__v => __obj.update("TapeInfos", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTapesOutput]
    }
  }

  @js.native
  trait ListVolumeInitiatorsInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  object ListVolumeInitiatorsInput {
    def apply(
        VolumeARN: VolumeARN
    ): ListVolumeInitiatorsInput = {
      val __obj = js.Dictionary[js.Any](
        "VolumeARN" -> VolumeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListVolumeInitiatorsInput]
    }
  }

  @js.native
  trait ListVolumeInitiatorsOutput extends js.Object {
    var Initiators: js.UndefOr[Initiators]
  }

  object ListVolumeInitiatorsOutput {
    def apply(
        Initiators: js.UndefOr[Initiators] = js.undefined
    ): ListVolumeInitiatorsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Initiators.foreach(__v => __obj.update("Initiators", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVolumeInitiatorsOutput]
    }
  }

  @js.native
  trait ListVolumeRecoveryPointsInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ListVolumeRecoveryPointsInput {
    def apply(
        GatewayARN: GatewayARN
    ): ListVolumeRecoveryPointsInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListVolumeRecoveryPointsInput]
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
        VolumeRecoveryPointInfos: js.UndefOr[VolumeRecoveryPointInfos] = js.undefined
    ): ListVolumeRecoveryPointsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      VolumeRecoveryPointInfos.foreach(__v => __obj.update("VolumeRecoveryPointInfos", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVolumeRecoveryPointsOutput]
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
        Marker: js.UndefOr[Marker] = js.undefined
    ): ListVolumesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.update("Limit", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVolumesInput]
    }
  }

  /**
    * A JSON object containing the following fields:
    * * Marker
    *  * VolumeInfos
    */
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
        VolumeInfos: js.UndefOr[VolumeInfos] = js.undefined
    ): ListVolumesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      Marker.foreach(__v => __obj.update("Marker", __v.asInstanceOf[js.Any]))
      VolumeInfos.foreach(__v => __obj.update("VolumeInfos", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVolumesOutput]
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
        OwnerId: js.UndefOr[PermissionId] = js.undefined
    ): NFSFileShareDefaults = {
      val __obj = js.Dictionary.empty[js.Any]
      DirectoryMode.foreach(__v => __obj.update("DirectoryMode", __v.asInstanceOf[js.Any]))
      FileMode.foreach(__v => __obj.update("FileMode", __v.asInstanceOf[js.Any]))
      GroupId.foreach(__v => __obj.update("GroupId", __v.asInstanceOf[js.Any]))
      OwnerId.foreach(__v => __obj.update("OwnerId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NFSFileShareDefaults]
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
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var LocationARN: js.UndefOr[LocationARN]
    var NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults]
    var ObjectACL: js.UndefOr[ObjectACL]
    var Path: js.UndefOr[Path]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var Role: js.UndefOr[Role]
    var Squash: js.UndefOr[Squash]
    var Tags: js.UndefOr[Tags]
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
        KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        LocationARN: js.UndefOr[LocationARN] = js.undefined,
        NFSFileShareDefaults: js.UndefOr[NFSFileShareDefaults] = js.undefined,
        ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined,
        ReadOnly: js.UndefOr[Boolean] = js.undefined,
        RequesterPays: js.UndefOr[Boolean] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        Squash: js.UndefOr[Squash] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): NFSFileShareInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      ClientList.foreach(__v => __obj.update("ClientList", __v.asInstanceOf[js.Any]))
      DefaultStorageClass.foreach(__v => __obj.update("DefaultStorageClass", __v.asInstanceOf[js.Any]))
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      FileShareId.foreach(__v => __obj.update("FileShareId", __v.asInstanceOf[js.Any]))
      FileShareStatus.foreach(__v => __obj.update("FileShareStatus", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      GuessMIMETypeEnabled.foreach(__v => __obj.update("GuessMIMETypeEnabled", __v.asInstanceOf[js.Any]))
      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      LocationARN.foreach(__v => __obj.update("LocationARN", __v.asInstanceOf[js.Any]))
      NFSFileShareDefaults.foreach(__v => __obj.update("NFSFileShareDefaults", __v.asInstanceOf[js.Any]))
      ObjectACL.foreach(__v => __obj.update("ObjectACL", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.update("ReadOnly", __v.asInstanceOf[js.Any]))
      RequesterPays.foreach(__v => __obj.update("RequesterPays", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      Squash.foreach(__v => __obj.update("Squash", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NFSFileShareInfo]
    }
  }

  /**
    * Describes a gateway's network interface.
    */
  @js.native
  trait NetworkInterface extends js.Object {
    var Ipv4Address: js.UndefOr[String]
    var Ipv6Address: js.UndefOr[String]
    var MacAddress: js.UndefOr[String]
  }

  object NetworkInterface {
    def apply(
        Ipv4Address: js.UndefOr[String] = js.undefined,
        Ipv6Address: js.UndefOr[String] = js.undefined,
        MacAddress: js.UndefOr[String] = js.undefined
    ): NetworkInterface = {
      val __obj = js.Dictionary.empty[js.Any]
      Ipv4Address.foreach(__v => __obj.update("Ipv4Address", __v.asInstanceOf[js.Any]))
      Ipv6Address.foreach(__v => __obj.update("Ipv6Address", __v.asInstanceOf[js.Any]))
      MacAddress.foreach(__v => __obj.update("MacAddress", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkInterface]
    }
  }

  @js.native
  trait NotifyWhenUploadedInput extends js.Object {
    var FileShareARN: FileShareARN
  }

  object NotifyWhenUploadedInput {
    def apply(
        FileShareARN: FileShareARN
    ): NotifyWhenUploadedInput = {
      val __obj = js.Dictionary[js.Any](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NotifyWhenUploadedInput]
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
        NotificationId: js.UndefOr[NotificationId] = js.undefined
    ): NotifyWhenUploadedOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      NotificationId.foreach(__v => __obj.update("NotificationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyWhenUploadedOutput]
    }
  }

  /**
    * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
    */
  object ObjectACLEnum {
    val `private`                   = "private"
    val `public-read`               = "public-read"
    val `public-read-write`         = "public-read-write"
    val `authenticated-read`        = "authenticated-read"
    val `bucket-owner-read`         = "bucket-owner-read"
    val `bucket-owner-full-control` = "bucket-owner-full-control"
    val `aws-exec-read`             = "aws-exec-read"

    val values = IndexedSeq(
      `private`,
      `public-read`,
      `public-read-write`,
      `authenticated-read`,
      `bucket-owner-read`,
      `bucket-owner-full-control`,
      `aws-exec-read`
    )
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
        Recursive: js.UndefOr[Boolean] = js.undefined
    ): RefreshCacheInput = {
      val __obj = js.Dictionary[js.Any](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any]
      )

      FolderList.foreach(__v => __obj.update("FolderList", __v.asInstanceOf[js.Any]))
      Recursive.foreach(__v => __obj.update("Recursive", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RefreshCacheInput]
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
        NotificationId: js.UndefOr[NotificationId] = js.undefined
    ): RefreshCacheOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      NotificationId.foreach(__v => __obj.update("NotificationId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RefreshCacheOutput]
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
        TagKeys: TagKeys
    ): RemoveTagsFromResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsFromResourceInput]
    }
  }

  @js.native
  trait RemoveTagsFromResourceOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  object RemoveTagsFromResourceOutput {
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    ): RemoveTagsFromResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourceARN.foreach(__v => __obj.update("ResourceARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveTagsFromResourceOutput]
    }
  }

  @js.native
  trait ResetCacheInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  object ResetCacheInput {
    def apply(
        GatewayARN: GatewayARN
    ): ResetCacheInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResetCacheInput]
    }
  }

  @js.native
  trait ResetCacheOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object ResetCacheOutput {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ResetCacheOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetCacheOutput]
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
        TapeARN: TapeARN
    ): RetrieveTapeArchiveInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN"    -> TapeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RetrieveTapeArchiveInput]
    }
  }

  @js.native
  trait RetrieveTapeArchiveOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object RetrieveTapeArchiveOutput {
    def apply(
        TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): RetrieveTapeArchiveOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetrieveTapeArchiveOutput]
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
        TapeARN: TapeARN
    ): RetrieveTapeRecoveryPointInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "TapeARN"    -> TapeARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RetrieveTapeRecoveryPointInput]
    }
  }

  @js.native
  trait RetrieveTapeRecoveryPointOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  object RetrieveTapeRecoveryPointOutput {
    def apply(
        TapeARN: js.UndefOr[TapeARN] = js.undefined
    ): RetrieveTapeRecoveryPointOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetrieveTapeRecoveryPointOutput]
    }
  }

  /**
    * The Windows file permissions and ownership information assigned, by default, to native S3 objects when file gateway discovers them in S3 buckets. This operation is only supported for file gateways.
    */
  @js.native
  trait SMBFileShareInfo extends js.Object {
    var AdminUserList: js.UndefOr[FileShareUserList]
    var Authentication: js.UndefOr[Authentication]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var FileShareARN: js.UndefOr[FileShareARN]
    var FileShareId: js.UndefOr[FileShareId]
    var FileShareStatus: js.UndefOr[FileShareStatus]
    var GatewayARN: js.UndefOr[GatewayARN]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var InvalidUserList: js.UndefOr[FileShareUserList]
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var LocationARN: js.UndefOr[LocationARN]
    var ObjectACL: js.UndefOr[ObjectACL]
    var Path: js.UndefOr[Path]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var Role: js.UndefOr[Role]
    var SMBACLEnabled: js.UndefOr[Boolean]
    var Tags: js.UndefOr[Tags]
    var ValidUserList: js.UndefOr[FileShareUserList]
  }

  object SMBFileShareInfo {
    def apply(
        AdminUserList: js.UndefOr[FileShareUserList] = js.undefined,
        Authentication: js.UndefOr[Authentication] = js.undefined,
        DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
        FileShareARN: js.UndefOr[FileShareARN] = js.undefined,
        FileShareId: js.UndefOr[FileShareId] = js.undefined,
        FileShareStatus: js.UndefOr[FileShareStatus] = js.undefined,
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
        InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined,
        KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        LocationARN: js.UndefOr[LocationARN] = js.undefined,
        ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined,
        ReadOnly: js.UndefOr[Boolean] = js.undefined,
        RequesterPays: js.UndefOr[Boolean] = js.undefined,
        Role: js.UndefOr[Role] = js.undefined,
        SMBACLEnabled: js.UndefOr[Boolean] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
    ): SMBFileShareInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      AdminUserList.foreach(__v => __obj.update("AdminUserList", __v.asInstanceOf[js.Any]))
      Authentication.foreach(__v => __obj.update("Authentication", __v.asInstanceOf[js.Any]))
      DefaultStorageClass.foreach(__v => __obj.update("DefaultStorageClass", __v.asInstanceOf[js.Any]))
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      FileShareId.foreach(__v => __obj.update("FileShareId", __v.asInstanceOf[js.Any]))
      FileShareStatus.foreach(__v => __obj.update("FileShareStatus", __v.asInstanceOf[js.Any]))
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      GuessMIMETypeEnabled.foreach(__v => __obj.update("GuessMIMETypeEnabled", __v.asInstanceOf[js.Any]))
      InvalidUserList.foreach(__v => __obj.update("InvalidUserList", __v.asInstanceOf[js.Any]))
      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      LocationARN.foreach(__v => __obj.update("LocationARN", __v.asInstanceOf[js.Any]))
      ObjectACL.foreach(__v => __obj.update("ObjectACL", __v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.update("Path", __v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.update("ReadOnly", __v.asInstanceOf[js.Any]))
      RequesterPays.foreach(__v => __obj.update("RequesterPays", __v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.update("Role", __v.asInstanceOf[js.Any]))
      SMBACLEnabled.foreach(__v => __obj.update("SMBACLEnabled", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      ValidUserList.foreach(__v => __obj.update("ValidUserList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SMBFileShareInfo]
    }
  }

  object SMBSecurityStrategyEnum {
    val ClientSpecified     = "ClientSpecified"
    val MandatorySigning    = "MandatorySigning"
    val MandatoryEncryption = "MandatoryEncryption"

    val values = IndexedSeq(ClientSpecified, MandatorySigning, MandatoryEncryption)
  }

  @js.native
  trait SetLocalConsolePasswordInput extends js.Object {
    var GatewayARN: GatewayARN
    var LocalConsolePassword: LocalConsolePassword
  }

  object SetLocalConsolePasswordInput {
    def apply(
        GatewayARN: GatewayARN,
        LocalConsolePassword: LocalConsolePassword
    ): SetLocalConsolePasswordInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN"           -> GatewayARN.asInstanceOf[js.Any],
        "LocalConsolePassword" -> LocalConsolePassword.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetLocalConsolePasswordInput]
    }
  }

  @js.native
  trait SetLocalConsolePasswordOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object SetLocalConsolePasswordOutput {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): SetLocalConsolePasswordOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetLocalConsolePasswordOutput]
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
        Password: SMBGuestPassword
    ): SetSMBGuestPasswordInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any],
        "Password"   -> Password.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SetSMBGuestPasswordInput]
    }
  }

  @js.native
  trait SetSMBGuestPasswordOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object SetSMBGuestPasswordOutput {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): SetSMBGuestPasswordOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetSMBGuestPasswordOutput]
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
        GatewayARN: GatewayARN
    ): ShutdownGatewayInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ShutdownGatewayInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): ShutdownGatewayOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShutdownGatewayOutput]
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
        GatewayARN: GatewayARN
    ): StartGatewayInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartGatewayInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): StartGatewayOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartGatewayOutput]
    }
  }

  /**
    * Describes an iSCSI stored volume.
    */
  @js.native
  trait StorediSCSIVolume extends js.Object {
    var CreatedDate: js.UndefOr[CreatedDate]
    var KMSKey: js.UndefOr[KMSKey]
    var PreservedExistingData: js.UndefOr[Boolean]
    var SourceSnapshotId: js.UndefOr[SnapshotId]
    var TargetName: js.UndefOr[TargetName]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus]
    var VolumeDiskId: js.UndefOr[DiskId]
    var VolumeId: js.UndefOr[VolumeId]
    var VolumeProgress: js.UndefOr[DoubleObject]
    var VolumeSizeInBytes: js.UndefOr[Double]
    var VolumeStatus: js.UndefOr[VolumeStatus]
    var VolumeType: js.UndefOr[VolumeType]
    var VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes]
    var VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes]
  }

  object StorediSCSIVolume {
    def apply(
        CreatedDate: js.UndefOr[CreatedDate] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        PreservedExistingData: js.UndefOr[Boolean] = js.undefined,
        SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined,
        TargetName: js.UndefOr[TargetName] = js.undefined,
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
        VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus] = js.undefined,
        VolumeDiskId: js.UndefOr[DiskId] = js.undefined,
        VolumeId: js.UndefOr[VolumeId] = js.undefined,
        VolumeProgress: js.UndefOr[DoubleObject] = js.undefined,
        VolumeSizeInBytes: js.UndefOr[Double] = js.undefined,
        VolumeStatus: js.UndefOr[VolumeStatus] = js.undefined,
        VolumeType: js.UndefOr[VolumeType] = js.undefined,
        VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes] = js.undefined,
        VolumeiSCSIAttributes: js.UndefOr[VolumeiSCSIAttributes] = js.undefined
    ): StorediSCSIVolume = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      PreservedExistingData.foreach(__v => __obj.update("PreservedExistingData", __v.asInstanceOf[js.Any]))
      SourceSnapshotId.foreach(__v => __obj.update("SourceSnapshotId", __v.asInstanceOf[js.Any]))
      TargetName.foreach(__v => __obj.update("TargetName", __v.asInstanceOf[js.Any]))
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      VolumeAttachmentStatus.foreach(__v => __obj.update("VolumeAttachmentStatus", __v.asInstanceOf[js.Any]))
      VolumeDiskId.foreach(__v => __obj.update("VolumeDiskId", __v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.update("VolumeId", __v.asInstanceOf[js.Any]))
      VolumeProgress.foreach(__v => __obj.update("VolumeProgress", __v.asInstanceOf[js.Any]))
      VolumeSizeInBytes.foreach(__v => __obj.update("VolumeSizeInBytes", __v.asInstanceOf[js.Any]))
      VolumeStatus.foreach(__v => __obj.update("VolumeStatus", __v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.update("VolumeType", __v.asInstanceOf[js.Any]))
      VolumeUsedInBytes.foreach(__v => __obj.update("VolumeUsedInBytes", __v.asInstanceOf[js.Any]))
      VolumeiSCSIAttributes.foreach(__v => __obj.update("VolumeiSCSIAttributes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorediSCSIVolume]
    }
  }

  /**
    * A key-value pair that helps you manage, filter, and search for your resource. Allowed characters: letters, white space, and numbers, representable in UTF-8, and the following characters: + - = . _ : /
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * Describes a virtual tape object.
    */
  @js.native
  trait Tape extends js.Object {
    var KMSKey: js.UndefOr[KMSKey]
    var PoolId: js.UndefOr[PoolId]
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
        PoolId: js.UndefOr[PoolId] = js.undefined,
        Progress: js.UndefOr[DoubleObject] = js.undefined,
        TapeARN: js.UndefOr[TapeARN] = js.undefined,
        TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
        TapeCreatedDate: js.UndefOr[Time] = js.undefined,
        TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
        TapeStatus: js.UndefOr[TapeStatus] = js.undefined,
        TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined,
        VTLDevice: js.UndefOr[VTLDeviceARN] = js.undefined
    ): Tape = {
      val __obj = js.Dictionary.empty[js.Any]
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.update("PoolId", __v.asInstanceOf[js.Any]))
      Progress.foreach(__v => __obj.update("Progress", __v.asInstanceOf[js.Any]))
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      TapeBarcode.foreach(__v => __obj.update("TapeBarcode", __v.asInstanceOf[js.Any]))
      TapeCreatedDate.foreach(__v => __obj.update("TapeCreatedDate", __v.asInstanceOf[js.Any]))
      TapeSizeInBytes.foreach(__v => __obj.update("TapeSizeInBytes", __v.asInstanceOf[js.Any]))
      TapeStatus.foreach(__v => __obj.update("TapeStatus", __v.asInstanceOf[js.Any]))
      TapeUsedInBytes.foreach(__v => __obj.update("TapeUsedInBytes", __v.asInstanceOf[js.Any]))
      VTLDevice.foreach(__v => __obj.update("VTLDevice", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tape]
    }
  }

  /**
    * Represents a virtual tape that is archived in the virtual tape shelf (VTS).
    */
  @js.native
  trait TapeArchive extends js.Object {
    var CompletionTime: js.UndefOr[Time]
    var KMSKey: js.UndefOr[KMSKey]
    var PoolId: js.UndefOr[PoolId]
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
        PoolId: js.UndefOr[PoolId] = js.undefined,
        RetrievedTo: js.UndefOr[GatewayARN] = js.undefined,
        TapeARN: js.UndefOr[TapeARN] = js.undefined,
        TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
        TapeCreatedDate: js.UndefOr[Time] = js.undefined,
        TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
        TapeStatus: js.UndefOr[TapeArchiveStatus] = js.undefined,
        TapeUsedInBytes: js.UndefOr[TapeUsage] = js.undefined
    ): TapeArchive = {
      val __obj = js.Dictionary.empty[js.Any]
      CompletionTime.foreach(__v => __obj.update("CompletionTime", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.update("PoolId", __v.asInstanceOf[js.Any]))
      RetrievedTo.foreach(__v => __obj.update("RetrievedTo", __v.asInstanceOf[js.Any]))
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      TapeBarcode.foreach(__v => __obj.update("TapeBarcode", __v.asInstanceOf[js.Any]))
      TapeCreatedDate.foreach(__v => __obj.update("TapeCreatedDate", __v.asInstanceOf[js.Any]))
      TapeSizeInBytes.foreach(__v => __obj.update("TapeSizeInBytes", __v.asInstanceOf[js.Any]))
      TapeStatus.foreach(__v => __obj.update("TapeStatus", __v.asInstanceOf[js.Any]))
      TapeUsedInBytes.foreach(__v => __obj.update("TapeUsedInBytes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TapeArchive]
    }
  }

  /**
    * Describes a virtual tape.
    */
  @js.native
  trait TapeInfo extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var PoolId: js.UndefOr[PoolId]
    var TapeARN: js.UndefOr[TapeARN]
    var TapeBarcode: js.UndefOr[TapeBarcode]
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeStatus]
  }

  object TapeInfo {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        PoolId: js.UndefOr[PoolId] = js.undefined,
        TapeARN: js.UndefOr[TapeARN] = js.undefined,
        TapeBarcode: js.UndefOr[TapeBarcode] = js.undefined,
        TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
        TapeStatus: js.UndefOr[TapeStatus] = js.undefined
    ): TapeInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      PoolId.foreach(__v => __obj.update("PoolId", __v.asInstanceOf[js.Any]))
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      TapeBarcode.foreach(__v => __obj.update("TapeBarcode", __v.asInstanceOf[js.Any]))
      TapeSizeInBytes.foreach(__v => __obj.update("TapeSizeInBytes", __v.asInstanceOf[js.Any]))
      TapeStatus.foreach(__v => __obj.update("TapeStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TapeInfo]
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
        TapeStatus: js.UndefOr[TapeRecoveryPointStatus] = js.undefined
    ): TapeRecoveryPointInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      TapeARN.foreach(__v => __obj.update("TapeARN", __v.asInstanceOf[js.Any]))
      TapeRecoveryPointTime.foreach(__v => __obj.update("TapeRecoveryPointTime", __v.asInstanceOf[js.Any]))
      TapeSizeInBytes.foreach(__v => __obj.update("TapeSizeInBytes", __v.asInstanceOf[js.Any]))
      TapeStatus.foreach(__v => __obj.update("TapeStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TapeRecoveryPointInfo]
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
        AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined
    ): UpdateBandwidthRateLimitInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      AverageDownloadRateLimitInBitsPerSec.foreach(
        __v => __obj.update("AverageDownloadRateLimitInBitsPerSec", __v.asInstanceOf[js.Any])
      )
      AverageUploadRateLimitInBitsPerSec.foreach(
        __v => __obj.update("AverageUploadRateLimitInBitsPerSec", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[UpdateBandwidthRateLimitInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): UpdateBandwidthRateLimitOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBandwidthRateLimitOutput]
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
        SecretToAuthenticateTarget: js.UndefOr[ChapSecret] = js.undefined
    ): UpdateChapCredentialsInput = {
      val __obj = js.Dictionary[js.Any](
        "InitiatorName"                 -> InitiatorName.asInstanceOf[js.Any],
        "SecretToAuthenticateInitiator" -> SecretToAuthenticateInitiator.asInstanceOf[js.Any],
        "TargetARN"                     -> TargetARN.asInstanceOf[js.Any]
      )

      SecretToAuthenticateTarget.foreach(__v => __obj.update("SecretToAuthenticateTarget", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChapCredentialsInput]
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
        TargetARN: js.UndefOr[TargetARN] = js.undefined
    ): UpdateChapCredentialsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      InitiatorName.foreach(__v => __obj.update("InitiatorName", __v.asInstanceOf[js.Any]))
      TargetARN.foreach(__v => __obj.update("TargetARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChapCredentialsOutput]
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
        GatewayTimezone: js.UndefOr[GatewayTimezone] = js.undefined
    ): UpdateGatewayInformationInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      GatewayName.foreach(__v => __obj.update("GatewayName", __v.asInstanceOf[js.Any]))
      GatewayTimezone.foreach(__v => __obj.update("GatewayTimezone", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayInformationInput]
    }
  }

  /**
    * A JSON object containing the ARN of the gateway that was updated.
    */
  @js.native
  trait UpdateGatewayInformationOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayName: js.UndefOr[String]
  }

  object UpdateGatewayInformationOutput {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        GatewayName: js.UndefOr[String] = js.undefined
    ): UpdateGatewayInformationOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      GatewayName.foreach(__v => __obj.update("GatewayName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayInformationOutput]
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
        GatewayARN: GatewayARN
    ): UpdateGatewaySoftwareNowInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN" -> GatewayARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateGatewaySoftwareNowInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): UpdateGatewaySoftwareNowOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewaySoftwareNowOutput]
    }
  }

  /**
    * A JSON object containing the following fields:
    * * DayOfMonth
    *  * DayOfWeek
    *  * HourOfDay
    *  * MinuteOfHour
    */
  @js.native
  trait UpdateMaintenanceStartTimeInput extends js.Object {
    var GatewayARN: GatewayARN
    var HourOfDay: HourOfDay
    var MinuteOfHour: MinuteOfHour
    var DayOfMonth: js.UndefOr[DayOfMonth]
    var DayOfWeek: js.UndefOr[DayOfWeek]
  }

  object UpdateMaintenanceStartTimeInput {
    def apply(
        GatewayARN: GatewayARN,
        HourOfDay: HourOfDay,
        MinuteOfHour: MinuteOfHour,
        DayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    ): UpdateMaintenanceStartTimeInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN"   -> GatewayARN.asInstanceOf[js.Any],
        "HourOfDay"    -> HourOfDay.asInstanceOf[js.Any],
        "MinuteOfHour" -> MinuteOfHour.asInstanceOf[js.Any]
      )

      DayOfMonth.foreach(__v => __obj.update("DayOfMonth", __v.asInstanceOf[js.Any]))
      DayOfWeek.foreach(__v => __obj.update("DayOfWeek", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceStartTimeInput]
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
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): UpdateMaintenanceStartTimeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMaintenanceStartTimeOutput]
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
        Squash: js.UndefOr[Squash] = js.undefined
    ): UpdateNFSFileShareInput = {
      val __obj = js.Dictionary[js.Any](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any]
      )

      ClientList.foreach(__v => __obj.update("ClientList", __v.asInstanceOf[js.Any]))
      DefaultStorageClass.foreach(__v => __obj.update("DefaultStorageClass", __v.asInstanceOf[js.Any]))
      GuessMIMETypeEnabled.foreach(__v => __obj.update("GuessMIMETypeEnabled", __v.asInstanceOf[js.Any]))
      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      NFSFileShareDefaults.foreach(__v => __obj.update("NFSFileShareDefaults", __v.asInstanceOf[js.Any]))
      ObjectACL.foreach(__v => __obj.update("ObjectACL", __v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.update("ReadOnly", __v.asInstanceOf[js.Any]))
      RequesterPays.foreach(__v => __obj.update("RequesterPays", __v.asInstanceOf[js.Any]))
      Squash.foreach(__v => __obj.update("Squash", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNFSFileShareInput]
    }
  }

  @js.native
  trait UpdateNFSFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object UpdateNFSFileShareOutput {
    def apply(
        FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    ): UpdateNFSFileShareOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNFSFileShareOutput]
    }
  }

  @js.native
  trait UpdateSMBFileShareInput extends js.Object {
    var FileShareARN: FileShareARN
    var AdminUserList: js.UndefOr[FileShareUserList]
    var DefaultStorageClass: js.UndefOr[StorageClass]
    var GuessMIMETypeEnabled: js.UndefOr[Boolean]
    var InvalidUserList: js.UndefOr[FileShareUserList]
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var ObjectACL: js.UndefOr[ObjectACL]
    var ReadOnly: js.UndefOr[Boolean]
    var RequesterPays: js.UndefOr[Boolean]
    var SMBACLEnabled: js.UndefOr[Boolean]
    var ValidUserList: js.UndefOr[FileShareUserList]
  }

  object UpdateSMBFileShareInput {
    def apply(
        FileShareARN: FileShareARN,
        AdminUserList: js.UndefOr[FileShareUserList] = js.undefined,
        DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined,
        GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
        InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined,
        KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
        KMSKey: js.UndefOr[KMSKey] = js.undefined,
        ObjectACL: js.UndefOr[ObjectACL] = js.undefined,
        ReadOnly: js.UndefOr[Boolean] = js.undefined,
        RequesterPays: js.UndefOr[Boolean] = js.undefined,
        SMBACLEnabled: js.UndefOr[Boolean] = js.undefined,
        ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
    ): UpdateSMBFileShareInput = {
      val __obj = js.Dictionary[js.Any](
        "FileShareARN" -> FileShareARN.asInstanceOf[js.Any]
      )

      AdminUserList.foreach(__v => __obj.update("AdminUserList", __v.asInstanceOf[js.Any]))
      DefaultStorageClass.foreach(__v => __obj.update("DefaultStorageClass", __v.asInstanceOf[js.Any]))
      GuessMIMETypeEnabled.foreach(__v => __obj.update("GuessMIMETypeEnabled", __v.asInstanceOf[js.Any]))
      InvalidUserList.foreach(__v => __obj.update("InvalidUserList", __v.asInstanceOf[js.Any]))
      KMSEncrypted.foreach(__v => __obj.update("KMSEncrypted", __v.asInstanceOf[js.Any]))
      KMSKey.foreach(__v => __obj.update("KMSKey", __v.asInstanceOf[js.Any]))
      ObjectACL.foreach(__v => __obj.update("ObjectACL", __v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.update("ReadOnly", __v.asInstanceOf[js.Any]))
      RequesterPays.foreach(__v => __obj.update("RequesterPays", __v.asInstanceOf[js.Any]))
      SMBACLEnabled.foreach(__v => __obj.update("SMBACLEnabled", __v.asInstanceOf[js.Any]))
      ValidUserList.foreach(__v => __obj.update("ValidUserList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSMBFileShareInput]
    }
  }

  @js.native
  trait UpdateSMBFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  object UpdateSMBFileShareOutput {
    def apply(
        FileShareARN: js.UndefOr[FileShareARN] = js.undefined
    ): UpdateSMBFileShareOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      FileShareARN.foreach(__v => __obj.update("FileShareARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSMBFileShareOutput]
    }
  }

  @js.native
  trait UpdateSMBSecurityStrategyInput extends js.Object {
    var GatewayARN: GatewayARN
    var SMBSecurityStrategy: SMBSecurityStrategy
  }

  object UpdateSMBSecurityStrategyInput {
    def apply(
        GatewayARN: GatewayARN,
        SMBSecurityStrategy: SMBSecurityStrategy
    ): UpdateSMBSecurityStrategyInput = {
      val __obj = js.Dictionary[js.Any](
        "GatewayARN"          -> GatewayARN.asInstanceOf[js.Any],
        "SMBSecurityStrategy" -> SMBSecurityStrategy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateSMBSecurityStrategyInput]
    }
  }

  @js.native
  trait UpdateSMBSecurityStrategyOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  object UpdateSMBSecurityStrategyOutput {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined
    ): UpdateSMBSecurityStrategyOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSMBSecurityStrategyOutput]
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
    var Tags: js.UndefOr[Tags]
  }

  object UpdateSnapshotScheduleInput {
    def apply(
        RecurrenceInHours: RecurrenceInHours,
        StartAt: HourOfDay,
        VolumeARN: VolumeARN,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateSnapshotScheduleInput = {
      val __obj = js.Dictionary[js.Any](
        "RecurrenceInHours" -> RecurrenceInHours.asInstanceOf[js.Any],
        "StartAt"           -> StartAt.asInstanceOf[js.Any],
        "VolumeARN"         -> VolumeARN.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSnapshotScheduleInput]
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
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined
    ): UpdateSnapshotScheduleOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSnapshotScheduleOutput]
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
        VTLDeviceARN: VTLDeviceARN
    ): UpdateVTLDeviceTypeInput = {
      val __obj = js.Dictionary[js.Any](
        "DeviceType"   -> DeviceType.asInstanceOf[js.Any],
        "VTLDeviceARN" -> VTLDeviceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateVTLDeviceTypeInput]
    }
  }

  @js.native
  trait UpdateVTLDeviceTypeOutput extends js.Object {
    var VTLDeviceARN: js.UndefOr[VTLDeviceARN]
  }

  object UpdateVTLDeviceTypeOutput {
    def apply(
        VTLDeviceARN: js.UndefOr[VTLDeviceARN] = js.undefined
    ): UpdateVTLDeviceTypeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      VTLDeviceARN.foreach(__v => __obj.update("VTLDeviceARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVTLDeviceTypeOutput]
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
        VTLDeviceVendor: js.UndefOr[VTLDeviceVendor] = js.undefined
    ): VTLDevice = {
      val __obj = js.Dictionary.empty[js.Any]
      DeviceiSCSIAttributes.foreach(__v => __obj.update("DeviceiSCSIAttributes", __v.asInstanceOf[js.Any]))
      VTLDeviceARN.foreach(__v => __obj.update("VTLDeviceARN", __v.asInstanceOf[js.Any]))
      VTLDeviceProductIdentifier.foreach(__v => __obj.update("VTLDeviceProductIdentifier", __v.asInstanceOf[js.Any]))
      VTLDeviceType.foreach(__v => __obj.update("VTLDeviceType", __v.asInstanceOf[js.Any]))
      VTLDeviceVendor.foreach(__v => __obj.update("VTLDeviceVendor", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VTLDevice]
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
    var VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus]
    var VolumeId: js.UndefOr[VolumeId]
    var VolumeSizeInBytes: js.UndefOr[Double]
    var VolumeType: js.UndefOr[VolumeType]
  }

  object VolumeInfo {
    def apply(
        GatewayARN: js.UndefOr[GatewayARN] = js.undefined,
        GatewayId: js.UndefOr[GatewayId] = js.undefined,
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
        VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus] = js.undefined,
        VolumeId: js.UndefOr[VolumeId] = js.undefined,
        VolumeSizeInBytes: js.UndefOr[Double] = js.undefined,
        VolumeType: js.UndefOr[VolumeType] = js.undefined
    ): VolumeInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      GatewayARN.foreach(__v => __obj.update("GatewayARN", __v.asInstanceOf[js.Any]))
      GatewayId.foreach(__v => __obj.update("GatewayId", __v.asInstanceOf[js.Any]))
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      VolumeAttachmentStatus.foreach(__v => __obj.update("VolumeAttachmentStatus", __v.asInstanceOf[js.Any]))
      VolumeId.foreach(__v => __obj.update("VolumeId", __v.asInstanceOf[js.Any]))
      VolumeSizeInBytes.foreach(__v => __obj.update("VolumeSizeInBytes", __v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.update("VolumeType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeInfo]
    }
  }

  /**
    * Describes a storage volume recovery point object.
    */
  @js.native
  trait VolumeRecoveryPointInfo extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeRecoveryPointTime: js.UndefOr[String]
    var VolumeSizeInBytes: js.UndefOr[Double]
    var VolumeUsageInBytes: js.UndefOr[Double]
  }

  object VolumeRecoveryPointInfo {
    def apply(
        VolumeARN: js.UndefOr[VolumeARN] = js.undefined,
        VolumeRecoveryPointTime: js.UndefOr[String] = js.undefined,
        VolumeSizeInBytes: js.UndefOr[Double] = js.undefined,
        VolumeUsageInBytes: js.UndefOr[Double] = js.undefined
    ): VolumeRecoveryPointInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      VolumeARN.foreach(__v => __obj.update("VolumeARN", __v.asInstanceOf[js.Any]))
      VolumeRecoveryPointTime.foreach(__v => __obj.update("VolumeRecoveryPointTime", __v.asInstanceOf[js.Any]))
      VolumeSizeInBytes.foreach(__v => __obj.update("VolumeSizeInBytes", __v.asInstanceOf[js.Any]))
      VolumeUsageInBytes.foreach(__v => __obj.update("VolumeUsageInBytes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeRecoveryPointInfo]
    }
  }

  /**
    * Lists iSCSI information about a volume.
    */
  @js.native
  trait VolumeiSCSIAttributes extends js.Object {
    var ChapEnabled: js.UndefOr[Boolean]
    var LunNumber: js.UndefOr[PositiveIntObject]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NetworkInterfacePort: js.UndefOr[Int]
    var TargetARN: js.UndefOr[TargetARN]
  }

  object VolumeiSCSIAttributes {
    def apply(
        ChapEnabled: js.UndefOr[Boolean] = js.undefined,
        LunNumber: js.UndefOr[PositiveIntObject] = js.undefined,
        NetworkInterfaceId: js.UndefOr[NetworkInterfaceId] = js.undefined,
        NetworkInterfacePort: js.UndefOr[Int] = js.undefined,
        TargetARN: js.UndefOr[TargetARN] = js.undefined
    ): VolumeiSCSIAttributes = {
      val __obj = js.Dictionary.empty[js.Any]
      ChapEnabled.foreach(__v => __obj.update("ChapEnabled", __v.asInstanceOf[js.Any]))
      LunNumber.foreach(__v => __obj.update("LunNumber", __v.asInstanceOf[js.Any]))
      NetworkInterfaceId.foreach(__v => __obj.update("NetworkInterfaceId", __v.asInstanceOf[js.Any]))
      NetworkInterfacePort.foreach(__v => __obj.update("NetworkInterfacePort", __v.asInstanceOf[js.Any]))
      TargetARN.foreach(__v => __obj.update("TargetARN", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VolumeiSCSIAttributes]
    }
  }
}
