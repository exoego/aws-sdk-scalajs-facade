package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  type CloudWatchLogGroupARN      = String
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
  type TimeoutInSeconds           = Int
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

  implicit final class StorageGatewayOps(private val service: StorageGateway) extends AnyVal {

    @inline def activateGatewayFuture(params: ActivateGatewayInput): Future[ActivateGatewayOutput] =
      service.activateGateway(params).promise().toFuture
    @inline def addCacheFuture(params: AddCacheInput): Future[AddCacheOutput] =
      service.addCache(params).promise().toFuture
    @inline def addTagsToResourceFuture(params: AddTagsToResourceInput): Future[AddTagsToResourceOutput] =
      service.addTagsToResource(params).promise().toFuture
    @inline def addUploadBufferFuture(params: AddUploadBufferInput): Future[AddUploadBufferOutput] =
      service.addUploadBuffer(params).promise().toFuture
    @inline def addWorkingStorageFuture(params: AddWorkingStorageInput): Future[AddWorkingStorageOutput] =
      service.addWorkingStorage(params).promise().toFuture
    @inline def assignTapePoolFuture(params: AssignTapePoolInput): Future[AssignTapePoolOutput] =
      service.assignTapePool(params).promise().toFuture
    @inline def attachVolumeFuture(params: AttachVolumeInput): Future[AttachVolumeOutput] =
      service.attachVolume(params).promise().toFuture
    @inline def cancelArchivalFuture(params: CancelArchivalInput): Future[CancelArchivalOutput] =
      service.cancelArchival(params).promise().toFuture
    @inline def cancelRetrievalFuture(params: CancelRetrievalInput): Future[CancelRetrievalOutput] =
      service.cancelRetrieval(params).promise().toFuture
    @inline def createCachediSCSIVolumeFuture(
        params: CreateCachediSCSIVolumeInput
    ): Future[CreateCachediSCSIVolumeOutput] = service.createCachediSCSIVolume(params).promise().toFuture
    @inline def createNFSFileShareFuture(params: CreateNFSFileShareInput): Future[CreateNFSFileShareOutput] =
      service.createNFSFileShare(params).promise().toFuture
    @inline def createSMBFileShareFuture(params: CreateSMBFileShareInput): Future[CreateSMBFileShareOutput] =
      service.createSMBFileShare(params).promise().toFuture
    @inline def createSnapshotFromVolumeRecoveryPointFuture(
        params: CreateSnapshotFromVolumeRecoveryPointInput
    ): Future[CreateSnapshotFromVolumeRecoveryPointOutput] =
      service.createSnapshotFromVolumeRecoveryPoint(params).promise().toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotInput): Future[CreateSnapshotOutput] =
      service.createSnapshot(params).promise().toFuture
    @inline def createStorediSCSIVolumeFuture(
        params: CreateStorediSCSIVolumeInput
    ): Future[CreateStorediSCSIVolumeOutput] = service.createStorediSCSIVolume(params).promise().toFuture
    @inline def createTapeWithBarcodeFuture(params: CreateTapeWithBarcodeInput): Future[CreateTapeWithBarcodeOutput] =
      service.createTapeWithBarcode(params).promise().toFuture
    @inline def createTapesFuture(params: CreateTapesInput): Future[CreateTapesOutput] =
      service.createTapes(params).promise().toFuture
    @inline def deleteBandwidthRateLimitFuture(
        params: DeleteBandwidthRateLimitInput
    ): Future[DeleteBandwidthRateLimitOutput] = service.deleteBandwidthRateLimit(params).promise().toFuture
    @inline def deleteChapCredentialsFuture(params: DeleteChapCredentialsInput): Future[DeleteChapCredentialsOutput] =
      service.deleteChapCredentials(params).promise().toFuture
    @inline def deleteFileShareFuture(params: DeleteFileShareInput): Future[DeleteFileShareOutput] =
      service.deleteFileShare(params).promise().toFuture
    @inline def deleteGatewayFuture(params: DeleteGatewayInput): Future[DeleteGatewayOutput] =
      service.deleteGateway(params).promise().toFuture
    @inline def deleteSnapshotScheduleFuture(
        params: DeleteSnapshotScheduleInput
    ): Future[DeleteSnapshotScheduleOutput] = service.deleteSnapshotSchedule(params).promise().toFuture
    @inline def deleteTapeArchiveFuture(params: DeleteTapeArchiveInput): Future[DeleteTapeArchiveOutput] =
      service.deleteTapeArchive(params).promise().toFuture
    @inline def deleteTapeFuture(params: DeleteTapeInput): Future[DeleteTapeOutput] =
      service.deleteTape(params).promise().toFuture
    @inline def deleteVolumeFuture(params: DeleteVolumeInput): Future[DeleteVolumeOutput] =
      service.deleteVolume(params).promise().toFuture
    @inline def describeAvailabilityMonitorTestFuture(
        params: DescribeAvailabilityMonitorTestInput
    ): Future[DescribeAvailabilityMonitorTestOutput] =
      service.describeAvailabilityMonitorTest(params).promise().toFuture
    @inline def describeBandwidthRateLimitFuture(
        params: DescribeBandwidthRateLimitInput
    ): Future[DescribeBandwidthRateLimitOutput] = service.describeBandwidthRateLimit(params).promise().toFuture
    @inline def describeCacheFuture(params: DescribeCacheInput): Future[DescribeCacheOutput] =
      service.describeCache(params).promise().toFuture
    @inline def describeCachediSCSIVolumesFuture(
        params: DescribeCachediSCSIVolumesInput
    ): Future[DescribeCachediSCSIVolumesOutput] = service.describeCachediSCSIVolumes(params).promise().toFuture
    @inline def describeChapCredentialsFuture(
        params: DescribeChapCredentialsInput
    ): Future[DescribeChapCredentialsOutput] = service.describeChapCredentials(params).promise().toFuture
    @inline def describeGatewayInformationFuture(
        params: DescribeGatewayInformationInput
    ): Future[DescribeGatewayInformationOutput] = service.describeGatewayInformation(params).promise().toFuture
    @inline def describeMaintenanceStartTimeFuture(
        params: DescribeMaintenanceStartTimeInput
    ): Future[DescribeMaintenanceStartTimeOutput] = service.describeMaintenanceStartTime(params).promise().toFuture
    @inline def describeNFSFileSharesFuture(params: DescribeNFSFileSharesInput): Future[DescribeNFSFileSharesOutput] =
      service.describeNFSFileShares(params).promise().toFuture
    @inline def describeSMBFileSharesFuture(params: DescribeSMBFileSharesInput): Future[DescribeSMBFileSharesOutput] =
      service.describeSMBFileShares(params).promise().toFuture
    @inline def describeSMBSettingsFuture(params: DescribeSMBSettingsInput): Future[DescribeSMBSettingsOutput] =
      service.describeSMBSettings(params).promise().toFuture
    @inline def describeSnapshotScheduleFuture(
        params: DescribeSnapshotScheduleInput
    ): Future[DescribeSnapshotScheduleOutput] = service.describeSnapshotSchedule(params).promise().toFuture
    @inline def describeStorediSCSIVolumesFuture(
        params: DescribeStorediSCSIVolumesInput
    ): Future[DescribeStorediSCSIVolumesOutput] = service.describeStorediSCSIVolumes(params).promise().toFuture
    @inline def describeTapeArchivesFuture(params: DescribeTapeArchivesInput): Future[DescribeTapeArchivesOutput] =
      service.describeTapeArchives(params).promise().toFuture
    @inline def describeTapeRecoveryPointsFuture(
        params: DescribeTapeRecoveryPointsInput
    ): Future[DescribeTapeRecoveryPointsOutput] = service.describeTapeRecoveryPoints(params).promise().toFuture
    @inline def describeTapesFuture(params: DescribeTapesInput): Future[DescribeTapesOutput] =
      service.describeTapes(params).promise().toFuture
    @inline def describeUploadBufferFuture(params: DescribeUploadBufferInput): Future[DescribeUploadBufferOutput] =
      service.describeUploadBuffer(params).promise().toFuture
    @inline def describeVTLDevicesFuture(params: DescribeVTLDevicesInput): Future[DescribeVTLDevicesOutput] =
      service.describeVTLDevices(params).promise().toFuture
    @inline def describeWorkingStorageFuture(
        params: DescribeWorkingStorageInput
    ): Future[DescribeWorkingStorageOutput] = service.describeWorkingStorage(params).promise().toFuture
    @inline def detachVolumeFuture(params: DetachVolumeInput): Future[DetachVolumeOutput] =
      service.detachVolume(params).promise().toFuture
    @inline def disableGatewayFuture(params: DisableGatewayInput): Future[DisableGatewayOutput] =
      service.disableGateway(params).promise().toFuture
    @inline def joinDomainFuture(params: JoinDomainInput): Future[JoinDomainOutput] =
      service.joinDomain(params).promise().toFuture
    @inline def listFileSharesFuture(params: ListFileSharesInput): Future[ListFileSharesOutput] =
      service.listFileShares(params).promise().toFuture
    @inline def listGatewaysFuture(params: ListGatewaysInput): Future[ListGatewaysOutput] =
      service.listGateways(params).promise().toFuture
    @inline def listLocalDisksFuture(params: ListLocalDisksInput): Future[ListLocalDisksOutput] =
      service.listLocalDisks(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTapesFuture(params: ListTapesInput): Future[ListTapesOutput] =
      service.listTapes(params).promise().toFuture
    @inline def listVolumeInitiatorsFuture(params: ListVolumeInitiatorsInput): Future[ListVolumeInitiatorsOutput] =
      service.listVolumeInitiators(params).promise().toFuture
    @inline def listVolumeRecoveryPointsFuture(
        params: ListVolumeRecoveryPointsInput
    ): Future[ListVolumeRecoveryPointsOutput] = service.listVolumeRecoveryPoints(params).promise().toFuture
    @inline def listVolumesFuture(params: ListVolumesInput): Future[ListVolumesOutput] =
      service.listVolumes(params).promise().toFuture
    @inline def notifyWhenUploadedFuture(params: NotifyWhenUploadedInput): Future[NotifyWhenUploadedOutput] =
      service.notifyWhenUploaded(params).promise().toFuture
    @inline def refreshCacheFuture(params: RefreshCacheInput): Future[RefreshCacheOutput] =
      service.refreshCache(params).promise().toFuture
    @inline def removeTagsFromResourceFuture(
        params: RemoveTagsFromResourceInput
    ): Future[RemoveTagsFromResourceOutput] = service.removeTagsFromResource(params).promise().toFuture
    @inline def resetCacheFuture(params: ResetCacheInput): Future[ResetCacheOutput] =
      service.resetCache(params).promise().toFuture
    @inline def retrieveTapeArchiveFuture(params: RetrieveTapeArchiveInput): Future[RetrieveTapeArchiveOutput] =
      service.retrieveTapeArchive(params).promise().toFuture
    @inline def retrieveTapeRecoveryPointFuture(
        params: RetrieveTapeRecoveryPointInput
    ): Future[RetrieveTapeRecoveryPointOutput] = service.retrieveTapeRecoveryPoint(params).promise().toFuture
    @inline def setLocalConsolePasswordFuture(
        params: SetLocalConsolePasswordInput
    ): Future[SetLocalConsolePasswordOutput] = service.setLocalConsolePassword(params).promise().toFuture
    @inline def setSMBGuestPasswordFuture(params: SetSMBGuestPasswordInput): Future[SetSMBGuestPasswordOutput] =
      service.setSMBGuestPassword(params).promise().toFuture
    @inline def shutdownGatewayFuture(params: ShutdownGatewayInput): Future[ShutdownGatewayOutput] =
      service.shutdownGateway(params).promise().toFuture
    @inline def startAvailabilityMonitorTestFuture(
        params: StartAvailabilityMonitorTestInput
    ): Future[StartAvailabilityMonitorTestOutput] = service.startAvailabilityMonitorTest(params).promise().toFuture
    @inline def startGatewayFuture(params: StartGatewayInput): Future[StartGatewayOutput] =
      service.startGateway(params).promise().toFuture
    @inline def updateBandwidthRateLimitFuture(
        params: UpdateBandwidthRateLimitInput
    ): Future[UpdateBandwidthRateLimitOutput] = service.updateBandwidthRateLimit(params).promise().toFuture
    @inline def updateChapCredentialsFuture(params: UpdateChapCredentialsInput): Future[UpdateChapCredentialsOutput] =
      service.updateChapCredentials(params).promise().toFuture
    @inline def updateGatewayInformationFuture(
        params: UpdateGatewayInformationInput
    ): Future[UpdateGatewayInformationOutput] = service.updateGatewayInformation(params).promise().toFuture
    @inline def updateGatewaySoftwareNowFuture(
        params: UpdateGatewaySoftwareNowInput
    ): Future[UpdateGatewaySoftwareNowOutput] = service.updateGatewaySoftwareNow(params).promise().toFuture
    @inline def updateMaintenanceStartTimeFuture(
        params: UpdateMaintenanceStartTimeInput
    ): Future[UpdateMaintenanceStartTimeOutput] = service.updateMaintenanceStartTime(params).promise().toFuture
    @inline def updateNFSFileShareFuture(params: UpdateNFSFileShareInput): Future[UpdateNFSFileShareOutput] =
      service.updateNFSFileShare(params).promise().toFuture
    @inline def updateSMBFileShareFuture(params: UpdateSMBFileShareInput): Future[UpdateSMBFileShareOutput] =
      service.updateSMBFileShare(params).promise().toFuture
    @inline def updateSMBSecurityStrategyFuture(
        params: UpdateSMBSecurityStrategyInput
    ): Future[UpdateSMBSecurityStrategyOutput] = service.updateSMBSecurityStrategy(params).promise().toFuture
    @inline def updateSnapshotScheduleFuture(
        params: UpdateSnapshotScheduleInput
    ): Future[UpdateSnapshotScheduleOutput] = service.updateSnapshotSchedule(params).promise().toFuture
    @inline def updateVTLDeviceTypeFuture(params: UpdateVTLDeviceTypeInput): Future[UpdateVTLDeviceTypeOutput] =
      service.updateVTLDeviceType(params).promise().toFuture
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
    def describeAvailabilityMonitorTest(
        params: DescribeAvailabilityMonitorTestInput
    ): Request[DescribeAvailabilityMonitorTestOutput] = js.native
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
    def startAvailabilityMonitorTest(
        params: StartAvailabilityMonitorTestInput
    ): Request[StartAvailabilityMonitorTestOutput]                           = js.native
    def startGateway(params: StartGatewayInput): Request[StartGatewayOutput] = js.native
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
  @Factory
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

  /**
    * AWS Storage Gateway returns the Amazon Resource Name (ARN) of the activated gateway. It is a string made of information such as your account, gateway name, and AWS Region. This ARN is used to reference the gateway in other API operations as well as resource-based authorization.
    *
    * '''Note:'''For gateways activated prior to September 02, 2015, the gateway ARN contains the gateway name rather than the gateway ID. Changing the name of the gateway has no effect on the gateway ARN.
    */
  @js.native
  @Factory
  trait ActivateGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  sealed trait ActiveDirectoryStatus extends js.Any
  object ActiveDirectoryStatus extends js.Object {
    val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ActiveDirectoryStatus]
    val DETACHED      = "DETACHED".asInstanceOf[ActiveDirectoryStatus]
    val JOINED        = "JOINED".asInstanceOf[ActiveDirectoryStatus]
    val JOINING       = "JOINING".asInstanceOf[ActiveDirectoryStatus]
    val NETWORK_ERROR = "NETWORK_ERROR".asInstanceOf[ActiveDirectoryStatus]
    val TIMEOUT       = "TIMEOUT".asInstanceOf[ActiveDirectoryStatus]
    val UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[ActiveDirectoryStatus]

    val values =
      js.Object.freeze(js.Array(ACCESS_DENIED, DETACHED, JOINED, JOINING, NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR))
  }

  @js.native
  @Factory
  trait AddCacheInput extends js.Object {
    var DiskIds: DiskIds
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait AddCacheOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
  trait AddTagsToResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var Tags: Tags
  }

  @js.native
  @Factory
  trait AddTagsToResourceOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  @js.native
  @Factory
  trait AddUploadBufferInput extends js.Object {
    var DiskIds: DiskIds
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait AddUploadBufferOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * A JSON object containing one or more of the following fields:
    * * DiskIds
    */
  @js.native
  @Factory
  trait AddWorkingStorageInput extends js.Object {
    var DiskIds: DiskIds
    var GatewayARN: GatewayARN
  }

  /**
    * A JSON object containing the of the gateway for which working storage was configured.
    */
  @js.native
  @Factory
  trait AddWorkingStorageOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
  trait AssignTapePoolInput extends js.Object {
    var PoolId: PoolId
    var TapeARN: TapeARN
  }

  @js.native
  @Factory
  trait AssignTapePoolOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  @js.native
  @Factory
  trait AttachVolumeInput extends js.Object {
    var GatewayARN: GatewayARN
    var NetworkInterfaceId: NetworkInterfaceId
    var VolumeARN: VolumeARN
    var DiskId: js.UndefOr[DiskId]
    var TargetName: js.UndefOr[TargetName]
  }

  @js.native
  @Factory
  trait AttachVolumeOutput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  @js.native
  sealed trait AvailabilityMonitorTestStatus extends js.Any
  object AvailabilityMonitorTestStatus extends js.Object {
    val COMPLETE = "COMPLETE".asInstanceOf[AvailabilityMonitorTestStatus]
    val FAILED   = "FAILED".asInstanceOf[AvailabilityMonitorTestStatus]
    val PENDING  = "PENDING".asInstanceOf[AvailabilityMonitorTestStatus]

    val values = js.Object.freeze(js.Array(COMPLETE, FAILED, PENDING))
  }

  /**
    * Describes an iSCSI cached volume.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CancelArchivalInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  @js.native
  @Factory
  trait CancelArchivalOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  @js.native
  @Factory
  trait CancelRetrievalInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  @js.native
  @Factory
  trait CancelRetrievalOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  /**
    * Describes Challenge-Handshake Authentication Protocol (CHAP) information that supports authentication between your gateway and iSCSI initiators.
    */
  @js.native
  @Factory
  trait ChapInfo extends js.Object {
    var InitiatorName: js.UndefOr[IqnName]
    var SecretToAuthenticateInitiator: js.UndefOr[ChapSecret]
    var SecretToAuthenticateTarget: js.UndefOr[ChapSecret]
    var TargetARN: js.UndefOr[TargetARN]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateCachediSCSIVolumeOutput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateNFSFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateSMBFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  @js.native
  @Factory
  trait CreateSnapshotFromVolumeRecoveryPointInput extends js.Object {
    var SnapshotDescription: SnapshotDescription
    var VolumeARN: VolumeARN
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateSnapshotFromVolumeRecoveryPointOutput extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeRecoveryPointTime: js.UndefOr[String]
  }

  /**
    * A JSON object containing one or more of the following fields:
    * * SnapshotDescription
    *  * VolumeARN
    */
  @js.native
  @Factory
  trait CreateSnapshotInput extends js.Object {
    var SnapshotDescription: SnapshotDescription
    var VolumeARN: VolumeARN
    var Tags: js.UndefOr[Tags]
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  @Factory
  trait CreateSnapshotOutput extends js.Object {
    var SnapshotId: js.UndefOr[SnapshotId]
    var VolumeARN: js.UndefOr[VolumeARN]
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
  @Factory
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

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  @Factory
  trait CreateStorediSCSIVolumeOutput extends js.Object {
    var TargetARN: js.UndefOr[TargetARN]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeSizeInBytes: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait CreateTapeWithBarcodeInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeBarcode: TapeBarcode
    var TapeSizeInBytes: TapeSize
    var KMSEncrypted: js.UndefOr[Boolean]
    var KMSKey: js.UndefOr[KMSKey]
    var PoolId: js.UndefOr[PoolId]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * CreateTapeOutput
    */
  @js.native
  @Factory
  trait CreateTapeWithBarcodeOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  @js.native
  @Factory
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

  /**
    * CreateTapeOutput
    */
  @js.native
  @Factory
  trait CreateTapesOutput extends js.Object {
    var TapeARNs: js.UndefOr[TapeARNs]
  }

  /**
    * A JSON object containing the following fields:
    * * BandwidthType
    */
  @js.native
  @Factory
  trait DeleteBandwidthRateLimitInput extends js.Object {
    var BandwidthType: BandwidthType
    var GatewayARN: GatewayARN
  }

  /**
    * A JSON object containing the of the gateway whose bandwidth rate information was deleted.
    */
  @js.native
  @Factory
  trait DeleteBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * A JSON object containing one or more of the following fields:
    * * InitiatorName
    *  * TargetARN
    */
  @js.native
  @Factory
  trait DeleteChapCredentialsInput extends js.Object {
    var InitiatorName: IqnName
    var TargetARN: TargetARN
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  @Factory
  trait DeleteChapCredentialsOutput extends js.Object {
    var InitiatorName: js.UndefOr[IqnName]
    var TargetARN: js.UndefOr[TargetARN]
  }

  @js.native
  @Factory
  trait DeleteFileShareInput extends js.Object {
    var FileShareARN: FileShareARN
    var ForceDelete: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  /**
    * A JSON object containing the ID of the gateway to delete.
    */
  @js.native
  @Factory
  trait DeleteGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  /**
    * A JSON object containing the ID of the deleted gateway.
    */
  @js.native
  @Factory
  trait DeleteGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
  trait DeleteSnapshotScheduleInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  @js.native
  @Factory
  trait DeleteSnapshotScheduleOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  @js.native
  @Factory
  trait DeleteTapeArchiveInput extends js.Object {
    var TapeARN: TapeARN
  }

  @js.native
  @Factory
  trait DeleteTapeArchiveOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  @js.native
  @Factory
  trait DeleteTapeInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  @js.native
  @Factory
  trait DeleteTapeOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  /**
    * A JSON object containing the VolumeARN to delete.
    */
  @js.native
  @Factory
  trait DeleteVolumeInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  /**
    * A JSON object containing the of the storage volume that was deleted
    */
  @js.native
  @Factory
  trait DeleteVolumeOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  @js.native
  @Factory
  trait DescribeAvailabilityMonitorTestInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait DescribeAvailabilityMonitorTestOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var StartTime: js.UndefOr[Time]
    var Status: js.UndefOr[AvailabilityMonitorTestStatus]
  }

  /**
    * A JSON object containing the of the gateway.
    */
  @js.native
  @Factory
  trait DescribeBandwidthRateLimitInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  @Factory
  trait DescribeBandwidthRateLimitOutput extends js.Object {
    var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit]
    var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
  trait DescribeCacheInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait DescribeCacheOutput extends js.Object {
    var CacheAllocatedInBytes: js.UndefOr[Double]
    var CacheDirtyPercentage: js.UndefOr[double]
    var CacheHitPercentage: js.UndefOr[double]
    var CacheMissPercentage: js.UndefOr[double]
    var CacheUsedPercentage: js.UndefOr[double]
    var DiskIds: js.UndefOr[DiskIds]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
  trait DescribeCachediSCSIVolumesInput extends js.Object {
    var VolumeARNs: VolumeARNs
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  @Factory
  trait DescribeCachediSCSIVolumesOutput extends js.Object {
    var CachediSCSIVolumes: js.UndefOr[CachediSCSIVolumes]
  }

  /**
    * A JSON object containing the Amazon Resource Name (ARN) of the iSCSI volume target.
    */
  @js.native
  @Factory
  trait DescribeChapCredentialsInput extends js.Object {
    var TargetARN: TargetARN
  }

  /**
    * A JSON object containing a .
    */
  @js.native
  @Factory
  trait DescribeChapCredentialsOutput extends js.Object {
    var ChapCredentials: js.UndefOr[ChapCredentials]
  }

  /**
    * A JSON object containing the ID of the gateway.
    */
  @js.native
  @Factory
  trait DescribeGatewayInformationInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  @Factory
  trait DescribeGatewayInformationOutput extends js.Object {
    var CloudWatchLogGroupARN: js.UndefOr[CloudWatchLogGroupARN]
    var Ec2InstanceId: js.UndefOr[Ec2InstanceId]
    var Ec2InstanceRegion: js.UndefOr[Ec2InstanceRegion]
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayId: js.UndefOr[GatewayId]
    var GatewayName: js.UndefOr[String]
    var GatewayNetworkInterfaces: js.UndefOr[GatewayNetworkInterfaces]
    var GatewayState: js.UndefOr[GatewayState]
    var GatewayTimezone: js.UndefOr[GatewayTimezone]
    var GatewayType: js.UndefOr[GatewayType]
    var HostEnvironment: js.UndefOr[HostEnvironment]
    var LastSoftwareUpdate: js.UndefOr[LastSoftwareUpdate]
    var NextUpdateAvailabilityDate: js.UndefOr[NextUpdateAvailabilityDate]
    var Tags: js.UndefOr[Tags]
    var VPCEndpoint: js.UndefOr[String]
  }

  /**
    * A JSON object containing the of the gateway.
    */
  @js.native
  @Factory
  trait DescribeMaintenanceStartTimeInput extends js.Object {
    var GatewayARN: GatewayARN
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
  @Factory
  trait DescribeMaintenanceStartTimeOutput extends js.Object {
    var DayOfMonth: js.UndefOr[DayOfMonth]
    var DayOfWeek: js.UndefOr[DayOfWeek]
    var GatewayARN: js.UndefOr[GatewayARN]
    var HourOfDay: js.UndefOr[HourOfDay]
    var MinuteOfHour: js.UndefOr[MinuteOfHour]
    var Timezone: js.UndefOr[GatewayTimezone]
  }

  @js.native
  @Factory
  trait DescribeNFSFileSharesInput extends js.Object {
    var FileShareARNList: FileShareARNList
  }

  @js.native
  @Factory
  trait DescribeNFSFileSharesOutput extends js.Object {
    var NFSFileShareInfoList: js.UndefOr[NFSFileShareInfoList]
  }

  @js.native
  @Factory
  trait DescribeSMBFileSharesInput extends js.Object {
    var FileShareARNList: FileShareARNList
  }

  @js.native
  @Factory
  trait DescribeSMBFileSharesOutput extends js.Object {
    var SMBFileShareInfoList: js.UndefOr[SMBFileShareInfoList]
  }

  @js.native
  @Factory
  trait DescribeSMBSettingsInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait DescribeSMBSettingsOutput extends js.Object {
    var ActiveDirectoryStatus: js.UndefOr[ActiveDirectoryStatus]
    var DomainName: js.UndefOr[DomainName]
    var GatewayARN: js.UndefOr[GatewayARN]
    var SMBGuestPasswordSet: js.UndefOr[Boolean]
    var SMBSecurityStrategy: js.UndefOr[SMBSecurityStrategy]
  }

  /**
    * A JSON object containing the VolumeARN of the volume.
    */
  @js.native
  @Factory
  trait DescribeSnapshotScheduleInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  @js.native
  @Factory
  trait DescribeSnapshotScheduleOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var RecurrenceInHours: js.UndefOr[RecurrenceInHours]
    var StartAt: js.UndefOr[HourOfDay]
    var Tags: js.UndefOr[Tags]
    var Timezone: js.UndefOr[GatewayTimezone]
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  /**
    * A JSON object containing a list of VolumeARNs.
    */
  @js.native
  @Factory
  trait DescribeStorediSCSIVolumesInput extends js.Object {
    var VolumeARNs: VolumeARNs
  }

  @js.native
  @Factory
  trait DescribeStorediSCSIVolumesOutput extends js.Object {
    var StorediSCSIVolumes: js.UndefOr[StorediSCSIVolumes]
  }

  @js.native
  @Factory
  trait DescribeTapeArchivesInput extends js.Object {
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
    var TapeARNs: js.UndefOr[TapeARNs]
  }

  @js.native
  @Factory
  trait DescribeTapeArchivesOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var TapeArchives: js.UndefOr[TapeArchives]
  }

  @js.native
  @Factory
  trait DescribeTapeRecoveryPointsInput extends js.Object {
    var GatewayARN: GatewayARN
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait DescribeTapeRecoveryPointsOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Marker: js.UndefOr[Marker]
    var TapeRecoveryPointInfos: js.UndefOr[TapeRecoveryPointInfos]
  }

  @js.native
  @Factory
  trait DescribeTapesInput extends js.Object {
    var GatewayARN: GatewayARN
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
    var TapeARNs: js.UndefOr[TapeARNs]
  }

  @js.native
  @Factory
  trait DescribeTapesOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var Tapes: js.UndefOr[Tapes]
  }

  @js.native
  @Factory
  trait DescribeUploadBufferInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait DescribeUploadBufferOutput extends js.Object {
    var DiskIds: js.UndefOr[DiskIds]
    var GatewayARN: js.UndefOr[GatewayARN]
    var UploadBufferAllocatedInBytes: js.UndefOr[Double]
    var UploadBufferUsedInBytes: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait DescribeVTLDevicesInput extends js.Object {
    var GatewayARN: GatewayARN
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
    var VTLDeviceARNs: js.UndefOr[VTLDeviceARNs]
  }

  @js.native
  @Factory
  trait DescribeVTLDevicesOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Marker: js.UndefOr[Marker]
    var VTLDevices: js.UndefOr[VTLDevices]
  }

  /**
    * A JSON object containing the of the gateway.
    */
  @js.native
  @Factory
  trait DescribeWorkingStorageInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  @Factory
  trait DescribeWorkingStorageOutput extends js.Object {
    var DiskIds: js.UndefOr[DiskIds]
    var GatewayARN: js.UndefOr[GatewayARN]
    var WorkingStorageAllocatedInBytes: js.UndefOr[Double]
    var WorkingStorageUsedInBytes: js.UndefOr[Double]
  }

  /**
    * AttachVolumeInput
    */
  @js.native
  @Factory
  trait DetachVolumeInput extends js.Object {
    var VolumeARN: VolumeARN
    var ForceDetach: js.UndefOr[Boolean]
  }

  /**
    * AttachVolumeOutput
    */
  @js.native
  @Factory
  trait DetachVolumeOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  /**
    * Lists iSCSI information about a VTL device.
    */
  @js.native
  @Factory
  trait DeviceiSCSIAttributes extends js.Object {
    var ChapEnabled: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NetworkInterfacePort: js.UndefOr[Int]
    var TargetARN: js.UndefOr[TargetARN]
  }

  @js.native
  @Factory
  trait DisableGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait DisableGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * Represents a gateway's local disk.
    */
  @js.native
  @Factory
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

  /**
    * Describes a file share.
    */
  @js.native
  @Factory
  trait FileShareInfo extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
    var FileShareId: js.UndefOr[FileShareId]
    var FileShareStatus: js.UndefOr[FileShareStatus]
    var FileShareType: js.UndefOr[FileShareType]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * The type of the file share.
    */
  @js.native
  sealed trait FileShareType extends js.Any
  object FileShareType extends js.Object {
    val NFS = "NFS".asInstanceOf[FileShareType]
    val SMB = "SMB".asInstanceOf[FileShareType]

    val values = js.Object.freeze(js.Array(NFS, SMB))
  }

  /**
    * Describes a gateway object.
    */
  @js.native
  @Factory
  trait GatewayInfo extends js.Object {
    var Ec2InstanceId: js.UndefOr[Ec2InstanceId]
    var Ec2InstanceRegion: js.UndefOr[Ec2InstanceRegion]
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayId: js.UndefOr[GatewayId]
    var GatewayName: js.UndefOr[String]
    var GatewayOperationalState: js.UndefOr[GatewayOperationalState]
    var GatewayType: js.UndefOr[GatewayType]
  }

  @js.native
  sealed trait HostEnvironment extends js.Any
  object HostEnvironment extends js.Object {
    val VMWARE    = "VMWARE".asInstanceOf[HostEnvironment]
    val `HYPER-V` = "HYPER-V".asInstanceOf[HostEnvironment]
    val EC2       = "EC2".asInstanceOf[HostEnvironment]
    val KVM       = "KVM".asInstanceOf[HostEnvironment]
    val OTHER     = "OTHER".asInstanceOf[HostEnvironment]

    val values = js.Object.freeze(js.Array(VMWARE, `HYPER-V`, EC2, KVM, OTHER))
  }

  @js.native
  @Factory
  trait JoinDomainInput extends js.Object {
    var DomainName: DomainName
    var GatewayARN: GatewayARN
    var Password: DomainUserPassword
    var UserName: DomainUserName
    var DomainControllers: js.UndefOr[Hosts]
    var OrganizationalUnit: js.UndefOr[OrganizationalUnit]
    var TimeoutInSeconds: js.UndefOr[TimeoutInSeconds]
  }

  @js.native
  @Factory
  trait JoinDomainOutput extends js.Object {
    var ActiveDirectoryStatus: js.UndefOr[ActiveDirectoryStatus]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * ListFileShareInput
    */
  @js.native
  @Factory
  trait ListFileSharesInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  /**
    * ListFileShareOutput
    */
  @js.native
  @Factory
  trait ListFileSharesOutput extends js.Object {
    var FileShareInfoList: js.UndefOr[FileShareInfoList]
    var Marker: js.UndefOr[Marker]
    var NextMarker: js.UndefOr[Marker]
  }

  /**
    * A JSON object containing zero or more of the following fields:
    * * Limit
    *  * Marker
    */
  @js.native
  @Factory
  trait ListGatewaysInput extends js.Object {
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait ListGatewaysOutput extends js.Object {
    var Gateways: js.UndefOr[Gateways]
    var Marker: js.UndefOr[Marker]
  }

  /**
    * A JSON object containing the of the gateway.
    */
  @js.native
  @Factory
  trait ListLocalDisksInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait ListLocalDisksOutput extends js.Object {
    var Disks: js.UndefOr[Disks]
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * A JSON object that contains one or more of the following fields:
    * * Limit
    *  * Marker
    *  * TapeARNs
    */
  @js.native
  @Factory
  trait ListTapesInput extends js.Object {
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
    var TapeARNs: js.UndefOr[TapeARNs]
  }

  /**
    * A JSON object containing the following fields:
    * * Marker
    *  * VolumeInfos
    */
  @js.native
  @Factory
  trait ListTapesOutput extends js.Object {
    var Marker: js.UndefOr[Marker]
    var TapeInfos: js.UndefOr[TapeInfos]
  }

  @js.native
  @Factory
  trait ListVolumeInitiatorsInput extends js.Object {
    var VolumeARN: VolumeARN
  }

  @js.native
  @Factory
  trait ListVolumeInitiatorsOutput extends js.Object {
    var Initiators: js.UndefOr[Initiators]
  }

  @js.native
  @Factory
  trait ListVolumeRecoveryPointsInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait ListVolumeRecoveryPointsOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var VolumeRecoveryPointInfos: js.UndefOr[VolumeRecoveryPointInfos]
  }

  /**
    * A JSON object that contains one or more of the following fields:
    * * Limit
    *  * Marker
    */
  @js.native
  @Factory
  trait ListVolumesInput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Limit: js.UndefOr[PositiveIntObject]
    var Marker: js.UndefOr[Marker]
  }

  /**
    * A JSON object containing the following fields:
    * * Marker
    *  * VolumeInfos
    */
  @js.native
  @Factory
  trait ListVolumesOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var Marker: js.UndefOr[Marker]
    var VolumeInfos: js.UndefOr[VolumeInfos]
  }

  /**
    * Describes Network File System (NFS) file share default values. Files and folders stored as Amazon S3 objects in S3 buckets don't, by default, have Unix file permissions assigned to them. Upon discovery in an S3 bucket by Storage Gateway, the S3 objects that represent files and folders are assigned these default Unix permissions. This operation is only supported for file gateways.
    */
  @js.native
  @Factory
  trait NFSFileShareDefaults extends js.Object {
    var DirectoryMode: js.UndefOr[PermissionMode]
    var FileMode: js.UndefOr[PermissionMode]
    var GroupId: js.UndefOr[PermissionId]
    var OwnerId: js.UndefOr[PermissionId]
  }

  /**
    * The Unix file permissions and ownership information assigned, by default, to native S3 objects when file gateway discovers them in S3 buckets. This operation is only supported in file gateways.
    */
  @js.native
  @Factory
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

  /**
    * Describes a gateway's network interface.
    */
  @js.native
  @Factory
  trait NetworkInterface extends js.Object {
    var Ipv4Address: js.UndefOr[String]
    var Ipv6Address: js.UndefOr[String]
    var MacAddress: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait NotifyWhenUploadedInput extends js.Object {
    var FileShareARN: FileShareARN
  }

  @js.native
  @Factory
  trait NotifyWhenUploadedOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
    var NotificationId: js.UndefOr[NotificationId]
  }

  /**
    * A value that sets the access control list permission for objects in the S3 bucket that a file gateway puts objects into. The default value is "private".
    */
  @js.native
  sealed trait ObjectACL extends js.Any
  object ObjectACL extends js.Object {
    val `private`                   = "private".asInstanceOf[ObjectACL]
    val `public-read`               = "public-read".asInstanceOf[ObjectACL]
    val `public-read-write`         = "public-read-write".asInstanceOf[ObjectACL]
    val `authenticated-read`        = "authenticated-read".asInstanceOf[ObjectACL]
    val `bucket-owner-read`         = "bucket-owner-read".asInstanceOf[ObjectACL]
    val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[ObjectACL]
    val `aws-exec-read`             = "aws-exec-read".asInstanceOf[ObjectACL]

    val values = js.Object.freeze(
      js.Array(
        `private`,
        `public-read`,
        `public-read-write`,
        `authenticated-read`,
        `bucket-owner-read`,
        `bucket-owner-full-control`,
        `aws-exec-read`
      )
    )
  }

  @js.native
  @Factory
  trait RefreshCacheInput extends js.Object {
    var FileShareARN: FileShareARN
    var FolderList: js.UndefOr[FolderList]
    var Recursive: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait RefreshCacheOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
    var NotificationId: js.UndefOr[NotificationId]
  }

  @js.native
  @Factory
  trait RemoveTagsFromResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var TagKeys: TagKeys
  }

  @js.native
  @Factory
  trait RemoveTagsFromResourceOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
  }

  @js.native
  @Factory
  trait ResetCacheInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait ResetCacheOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
  trait RetrieveTapeArchiveInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  @js.native
  @Factory
  trait RetrieveTapeArchiveOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  @js.native
  @Factory
  trait RetrieveTapeRecoveryPointInput extends js.Object {
    var GatewayARN: GatewayARN
    var TapeARN: TapeARN
  }

  @js.native
  @Factory
  trait RetrieveTapeRecoveryPointOutput extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
  }

  /**
    * The Windows file permissions and ownership information assigned, by default, to native S3 objects when file gateway discovers them in S3 buckets. This operation is only supported for file gateways.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait SMBSecurityStrategy extends js.Any
  object SMBSecurityStrategy extends js.Object {
    val ClientSpecified     = "ClientSpecified".asInstanceOf[SMBSecurityStrategy]
    val MandatorySigning    = "MandatorySigning".asInstanceOf[SMBSecurityStrategy]
    val MandatoryEncryption = "MandatoryEncryption".asInstanceOf[SMBSecurityStrategy]

    val values = js.Object.freeze(js.Array(ClientSpecified, MandatorySigning, MandatoryEncryption))
  }

  @js.native
  @Factory
  trait SetLocalConsolePasswordInput extends js.Object {
    var GatewayARN: GatewayARN
    var LocalConsolePassword: LocalConsolePassword
  }

  @js.native
  @Factory
  trait SetLocalConsolePasswordOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
  trait SetSMBGuestPasswordInput extends js.Object {
    var GatewayARN: GatewayARN
    var Password: SMBGuestPassword
  }

  @js.native
  @Factory
  trait SetSMBGuestPasswordOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * A JSON object containing the of the gateway to shut down.
    */
  @js.native
  @Factory
  trait ShutdownGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  /**
    * A JSON object containing the of the gateway that was shut down.
    */
  @js.native
  @Factory
  trait ShutdownGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
  trait StartAvailabilityMonitorTestInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  @js.native
  @Factory
  trait StartAvailabilityMonitorTestOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * A JSON object containing the of the gateway to start.
    */
  @js.native
  @Factory
  trait StartGatewayInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  /**
    * A JSON object containing the of the gateway that was restarted.
    */
  @js.native
  @Factory
  trait StartGatewayOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * Describes an iSCSI stored volume.
    */
  @js.native
  @Factory
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

  /**
    * A key-value pair that helps you manage, filter, and search for your resource. Allowed characters: letters, white space, and numbers, representable in UTF-8, and the following characters: + - = . _ : /
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  /**
    * Describes a virtual tape object.
    */
  @js.native
  @Factory
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

  /**
    * Represents a virtual tape that is archived in the virtual tape shelf (VTS).
    */
  @js.native
  @Factory
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

  /**
    * Describes a virtual tape.
    */
  @js.native
  @Factory
  trait TapeInfo extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var PoolId: js.UndefOr[PoolId]
    var TapeARN: js.UndefOr[TapeARN]
    var TapeBarcode: js.UndefOr[TapeBarcode]
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeStatus]
  }

  /**
    * Describes a recovery point.
    */
  @js.native
  @Factory
  trait TapeRecoveryPointInfo extends js.Object {
    var TapeARN: js.UndefOr[TapeARN]
    var TapeRecoveryPointTime: js.UndefOr[Time]
    var TapeSizeInBytes: js.UndefOr[TapeSize]
    var TapeStatus: js.UndefOr[TapeRecoveryPointStatus]
  }

  /**
    * A JSON object containing one or more of the following fields:
    * * AverageDownloadRateLimitInBitsPerSec
    *  * AverageUploadRateLimitInBitsPerSec
    */
  @js.native
  @Factory
  trait UpdateBandwidthRateLimitInput extends js.Object {
    var GatewayARN: GatewayARN
    var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit]
    var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit]
  }

  /**
    * A JSON object containing the of the gateway whose throttle information was updated.
    */
  @js.native
  @Factory
  trait UpdateBandwidthRateLimitOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * A JSON object containing one or more of the following fields:
    * * InitiatorName
    *  * SecretToAuthenticateInitiator
    *  * SecretToAuthenticateTarget
    *  * TargetARN
    */
  @js.native
  @Factory
  trait UpdateChapCredentialsInput extends js.Object {
    var InitiatorName: IqnName
    var SecretToAuthenticateInitiator: ChapSecret
    var TargetARN: TargetARN
    var SecretToAuthenticateTarget: js.UndefOr[ChapSecret]
  }

  /**
    * A JSON object containing the following fields:
    */
  @js.native
  @Factory
  trait UpdateChapCredentialsOutput extends js.Object {
    var InitiatorName: js.UndefOr[IqnName]
    var TargetARN: js.UndefOr[TargetARN]
  }

  @js.native
  @Factory
  trait UpdateGatewayInformationInput extends js.Object {
    var GatewayARN: GatewayARN
    var CloudWatchLogGroupARN: js.UndefOr[CloudWatchLogGroupARN]
    var GatewayName: js.UndefOr[GatewayName]
    var GatewayTimezone: js.UndefOr[GatewayTimezone]
  }

  /**
    * A JSON object containing the ARN of the gateway that was updated.
    */
  @js.native
  @Factory
  trait UpdateGatewayInformationOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayName: js.UndefOr[String]
  }

  /**
    * A JSON object containing the of the gateway to update.
    */
  @js.native
  @Factory
  trait UpdateGatewaySoftwareNowInput extends js.Object {
    var GatewayARN: GatewayARN
  }

  /**
    * A JSON object containing the of the gateway that was updated.
    */
  @js.native
  @Factory
  trait UpdateGatewaySoftwareNowOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * A JSON object containing the following fields:
    * * DayOfMonth
    *  * DayOfWeek
    *  * HourOfDay
    *  * MinuteOfHour
    */
  @js.native
  @Factory
  trait UpdateMaintenanceStartTimeInput extends js.Object {
    var GatewayARN: GatewayARN
    var HourOfDay: HourOfDay
    var MinuteOfHour: MinuteOfHour
    var DayOfMonth: js.UndefOr[DayOfMonth]
    var DayOfWeek: js.UndefOr[DayOfWeek]
  }

  /**
    * A JSON object containing the of the gateway whose maintenance start time is updated.
    */
  @js.native
  @Factory
  trait UpdateMaintenanceStartTimeOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateNFSFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateSMBFileShareOutput extends js.Object {
    var FileShareARN: js.UndefOr[FileShareARN]
  }

  @js.native
  @Factory
  trait UpdateSMBSecurityStrategyInput extends js.Object {
    var GatewayARN: GatewayARN
    var SMBSecurityStrategy: SMBSecurityStrategy
  }

  @js.native
  @Factory
  trait UpdateSMBSecurityStrategyOutput extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
  }

  /**
    * A JSON object containing one or more of the following fields:
    * * Description
    *  * RecurrenceInHours
    *  * StartAt
    *  * VolumeARN
    */
  @js.native
  @Factory
  trait UpdateSnapshotScheduleInput extends js.Object {
    var RecurrenceInHours: RecurrenceInHours
    var StartAt: HourOfDay
    var VolumeARN: VolumeARN
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * A JSON object containing the of the updated storage volume.
    */
  @js.native
  @Factory
  trait UpdateSnapshotScheduleOutput extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
  }

  @js.native
  @Factory
  trait UpdateVTLDeviceTypeInput extends js.Object {
    var DeviceType: DeviceType
    var VTLDeviceARN: VTLDeviceARN
  }

  @js.native
  @Factory
  trait UpdateVTLDeviceTypeOutput extends js.Object {
    var VTLDeviceARN: js.UndefOr[VTLDeviceARN]
  }

  /**
    * Represents a device object associated with a tape gateway.
    */
  @js.native
  @Factory
  trait VTLDevice extends js.Object {
    var DeviceiSCSIAttributes: js.UndefOr[DeviceiSCSIAttributes]
    var VTLDeviceARN: js.UndefOr[VTLDeviceARN]
    var VTLDeviceProductIdentifier: js.UndefOr[VTLDeviceProductIdentifier]
    var VTLDeviceType: js.UndefOr[VTLDeviceType]
    var VTLDeviceVendor: js.UndefOr[VTLDeviceVendor]
  }

  /**
    * Describes a storage volume object.
    */
  @js.native
  @Factory
  trait VolumeInfo extends js.Object {
    var GatewayARN: js.UndefOr[GatewayARN]
    var GatewayId: js.UndefOr[GatewayId]
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeAttachmentStatus: js.UndefOr[VolumeAttachmentStatus]
    var VolumeId: js.UndefOr[VolumeId]
    var VolumeSizeInBytes: js.UndefOr[Double]
    var VolumeType: js.UndefOr[VolumeType]
  }

  /**
    * Describes a storage volume recovery point object.
    */
  @js.native
  @Factory
  trait VolumeRecoveryPointInfo extends js.Object {
    var VolumeARN: js.UndefOr[VolumeARN]
    var VolumeRecoveryPointTime: js.UndefOr[String]
    var VolumeSizeInBytes: js.UndefOr[Double]
    var VolumeUsageInBytes: js.UndefOr[Double]
  }

  /**
    * Lists iSCSI information about a volume.
    */
  @js.native
  @Factory
  trait VolumeiSCSIAttributes extends js.Object {
    var ChapEnabled: js.UndefOr[Boolean]
    var LunNumber: js.UndefOr[PositiveIntObject]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NetworkInterfacePort: js.UndefOr[Int]
    var TargetARN: js.UndefOr[TargetARN]
  }
}
