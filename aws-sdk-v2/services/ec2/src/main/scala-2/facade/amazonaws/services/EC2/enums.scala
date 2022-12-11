package facade.amazonaws.services.ec2

import scalajs.js

@js.native
sealed trait AcceleratorManufacturer extends js.Any
object AcceleratorManufacturer {
  val nvidia = "nvidia".asInstanceOf[AcceleratorManufacturer]
  val amd = "amd".asInstanceOf[AcceleratorManufacturer]
  val `amazon-web-services` = "amazon-web-services".asInstanceOf[AcceleratorManufacturer]
  val xilinx = "xilinx".asInstanceOf[AcceleratorManufacturer]

  @inline def values: js.Array[AcceleratorManufacturer] = js.Array(nvidia, amd, `amazon-web-services`, xilinx)
}

@js.native
sealed trait AcceleratorName extends js.Any
object AcceleratorName {
  val a100 = "a100".asInstanceOf[AcceleratorName]
  val v100 = "v100".asInstanceOf[AcceleratorName]
  val k80 = "k80".asInstanceOf[AcceleratorName]
  val t4 = "t4".asInstanceOf[AcceleratorName]
  val m60 = "m60".asInstanceOf[AcceleratorName]
  val `radeon-pro-v520` = "radeon-pro-v520".asInstanceOf[AcceleratorName]
  val vu9p = "vu9p".asInstanceOf[AcceleratorName]
  val inferentia = "inferentia".asInstanceOf[AcceleratorName]
  val k520 = "k520".asInstanceOf[AcceleratorName]

  @inline def values: js.Array[AcceleratorName] = js.Array(a100, v100, k80, t4, m60, `radeon-pro-v520`, vu9p, inferentia, k520)
}

@js.native
sealed trait AcceleratorType extends js.Any
object AcceleratorType {
  val gpu = "gpu".asInstanceOf[AcceleratorType]
  val fpga = "fpga".asInstanceOf[AcceleratorType]
  val inference = "inference".asInstanceOf[AcceleratorType]

  @inline def values: js.Array[AcceleratorType] = js.Array(gpu, fpga, inference)
}

@js.native
sealed trait AccountAttributeName extends js.Any
object AccountAttributeName {
  val `supported-platforms` = "supported-platforms".asInstanceOf[AccountAttributeName]
  val `default-vpc` = "default-vpc".asInstanceOf[AccountAttributeName]

  @inline def values: js.Array[AccountAttributeName] = js.Array(`supported-platforms`, `default-vpc`)
}

@js.native
sealed trait ActivityStatus extends js.Any
object ActivityStatus {
  val error = "error".asInstanceOf[ActivityStatus]
  val pending_fulfillment = "pending_fulfillment".asInstanceOf[ActivityStatus]
  val pending_termination = "pending_termination".asInstanceOf[ActivityStatus]
  val fulfilled = "fulfilled".asInstanceOf[ActivityStatus]

  @inline def values: js.Array[ActivityStatus] = js.Array(error, pending_fulfillment, pending_termination, fulfilled)
}

@js.native
sealed trait AddressAttributeName extends js.Any
object AddressAttributeName {
  val `domain-name` = "domain-name".asInstanceOf[AddressAttributeName]

  @inline def values: js.Array[AddressAttributeName] = js.Array(`domain-name`)
}

@js.native
sealed trait AddressFamily extends js.Any
object AddressFamily {
  val ipv4 = "ipv4".asInstanceOf[AddressFamily]
  val ipv6 = "ipv6".asInstanceOf[AddressFamily]

  @inline def values: js.Array[AddressFamily] = js.Array(ipv4, ipv6)
}

@js.native
sealed trait AddressTransferStatus extends js.Any
object AddressTransferStatus {
  val pending = "pending".asInstanceOf[AddressTransferStatus]
  val disabled = "disabled".asInstanceOf[AddressTransferStatus]
  val accepted = "accepted".asInstanceOf[AddressTransferStatus]

  @inline def values: js.Array[AddressTransferStatus] = js.Array(pending, disabled, accepted)
}

@js.native
sealed trait Affinity extends js.Any
object Affinity {
  val default = "default".asInstanceOf[Affinity]
  val host = "host".asInstanceOf[Affinity]

  @inline def values: js.Array[Affinity] = js.Array(default, host)
}

@js.native
sealed trait AllocationState extends js.Any
object AllocationState {
  val available = "available".asInstanceOf[AllocationState]
  val `under-assessment` = "under-assessment".asInstanceOf[AllocationState]
  val `permanent-failure` = "permanent-failure".asInstanceOf[AllocationState]
  val released = "released".asInstanceOf[AllocationState]
  val `released-permanent-failure` = "released-permanent-failure".asInstanceOf[AllocationState]
  val pending = "pending".asInstanceOf[AllocationState]

  @inline def values: js.Array[AllocationState] = js.Array(available, `under-assessment`, `permanent-failure`, released, `released-permanent-failure`, pending)
}

@js.native
sealed trait AllocationStrategy extends js.Any
object AllocationStrategy {
  val lowestPrice = "lowestPrice".asInstanceOf[AllocationStrategy]
  val diversified = "diversified".asInstanceOf[AllocationStrategy]
  val capacityOptimized = "capacityOptimized".asInstanceOf[AllocationStrategy]
  val capacityOptimizedPrioritized = "capacityOptimizedPrioritized".asInstanceOf[AllocationStrategy]
  val priceCapacityOptimized = "priceCapacityOptimized".asInstanceOf[AllocationStrategy]

  @inline def values: js.Array[AllocationStrategy] = js.Array(lowestPrice, diversified, capacityOptimized, capacityOptimizedPrioritized, priceCapacityOptimized)
}

@js.native
sealed trait AllocationType extends js.Any
object AllocationType {
  val used = "used".asInstanceOf[AllocationType]

  @inline def values: js.Array[AllocationType] = js.Array(used)
}

@js.native
sealed trait AllowsMultipleInstanceTypes extends js.Any
object AllowsMultipleInstanceTypes {
  val on = "on".asInstanceOf[AllowsMultipleInstanceTypes]
  val off = "off".asInstanceOf[AllowsMultipleInstanceTypes]

  @inline def values: js.Array[AllowsMultipleInstanceTypes] = js.Array(on, off)
}

@js.native
sealed trait AnalysisStatus extends js.Any
object AnalysisStatus {
  val running = "running".asInstanceOf[AnalysisStatus]
  val succeeded = "succeeded".asInstanceOf[AnalysisStatus]
  val failed = "failed".asInstanceOf[AnalysisStatus]

  @inline def values: js.Array[AnalysisStatus] = js.Array(running, succeeded, failed)
}

@js.native
sealed trait ApplianceModeSupportValue extends js.Any
object ApplianceModeSupportValue {
  val enable = "enable".asInstanceOf[ApplianceModeSupportValue]
  val disable = "disable".asInstanceOf[ApplianceModeSupportValue]

  @inline def values: js.Array[ApplianceModeSupportValue] = js.Array(enable, disable)
}

@js.native
sealed trait ArchitectureType extends js.Any
object ArchitectureType {
  val i386 = "i386".asInstanceOf[ArchitectureType]
  val x86_64 = "x86_64".asInstanceOf[ArchitectureType]
  val arm64 = "arm64".asInstanceOf[ArchitectureType]
  val x86_64_mac = "x86_64_mac".asInstanceOf[ArchitectureType]
  val arm64_mac = "arm64_mac".asInstanceOf[ArchitectureType]

  @inline def values: js.Array[ArchitectureType] = js.Array(i386, x86_64, arm64, x86_64_mac, arm64_mac)
}

@js.native
sealed trait ArchitectureValues extends js.Any
object ArchitectureValues {
  val i386 = "i386".asInstanceOf[ArchitectureValues]
  val x86_64 = "x86_64".asInstanceOf[ArchitectureValues]
  val arm64 = "arm64".asInstanceOf[ArchitectureValues]
  val x86_64_mac = "x86_64_mac".asInstanceOf[ArchitectureValues]
  val arm64_mac = "arm64_mac".asInstanceOf[ArchitectureValues]

  @inline def values: js.Array[ArchitectureValues] = js.Array(i386, x86_64, arm64, x86_64_mac, arm64_mac)
}

@js.native
sealed trait AssociatedNetworkType extends js.Any
object AssociatedNetworkType {
  val vpc = "vpc".asInstanceOf[AssociatedNetworkType]

  @inline def values: js.Array[AssociatedNetworkType] = js.Array(vpc)
}

@js.native
sealed trait AssociationStatusCode extends js.Any
object AssociationStatusCode {
  val associating = "associating".asInstanceOf[AssociationStatusCode]
  val associated = "associated".asInstanceOf[AssociationStatusCode]
  val `association-failed` = "association-failed".asInstanceOf[AssociationStatusCode]
  val disassociating = "disassociating".asInstanceOf[AssociationStatusCode]
  val disassociated = "disassociated".asInstanceOf[AssociationStatusCode]

  @inline def values: js.Array[AssociationStatusCode] = js.Array(associating, associated, `association-failed`, disassociating, disassociated)
}

@js.native
sealed trait AttachmentStatus extends js.Any
object AttachmentStatus {
  val attaching = "attaching".asInstanceOf[AttachmentStatus]
  val attached = "attached".asInstanceOf[AttachmentStatus]
  val detaching = "detaching".asInstanceOf[AttachmentStatus]
  val detached = "detached".asInstanceOf[AttachmentStatus]

  @inline def values: js.Array[AttachmentStatus] = js.Array(attaching, attached, detaching, detached)
}

@js.native
sealed trait AutoAcceptSharedAssociationsValue extends js.Any
object AutoAcceptSharedAssociationsValue {
  val enable = "enable".asInstanceOf[AutoAcceptSharedAssociationsValue]
  val disable = "disable".asInstanceOf[AutoAcceptSharedAssociationsValue]

  @inline def values: js.Array[AutoAcceptSharedAssociationsValue] = js.Array(enable, disable)
}

@js.native
sealed trait AutoAcceptSharedAttachmentsValue extends js.Any
object AutoAcceptSharedAttachmentsValue {
  val enable = "enable".asInstanceOf[AutoAcceptSharedAttachmentsValue]
  val disable = "disable".asInstanceOf[AutoAcceptSharedAttachmentsValue]

  @inline def values: js.Array[AutoAcceptSharedAttachmentsValue] = js.Array(enable, disable)
}

@js.native
sealed trait AutoPlacement extends js.Any
object AutoPlacement {
  val on = "on".asInstanceOf[AutoPlacement]
  val off = "off".asInstanceOf[AutoPlacement]

  @inline def values: js.Array[AutoPlacement] = js.Array(on, off)
}

@js.native
sealed trait AvailabilityZoneOptInStatus extends js.Any
object AvailabilityZoneOptInStatus {
  val `opt-in-not-required` = "opt-in-not-required".asInstanceOf[AvailabilityZoneOptInStatus]
  val `opted-in` = "opted-in".asInstanceOf[AvailabilityZoneOptInStatus]
  val `not-opted-in` = "not-opted-in".asInstanceOf[AvailabilityZoneOptInStatus]

  @inline def values: js.Array[AvailabilityZoneOptInStatus] = js.Array(`opt-in-not-required`, `opted-in`, `not-opted-in`)
}

@js.native
sealed trait AvailabilityZoneState extends js.Any
object AvailabilityZoneState {
  val available = "available".asInstanceOf[AvailabilityZoneState]
  val information = "information".asInstanceOf[AvailabilityZoneState]
  val impaired = "impaired".asInstanceOf[AvailabilityZoneState]
  val unavailable = "unavailable".asInstanceOf[AvailabilityZoneState]

  @inline def values: js.Array[AvailabilityZoneState] = js.Array(available, information, impaired, unavailable)
}

@js.native
sealed trait BareMetal extends js.Any
object BareMetal {
  val included = "included".asInstanceOf[BareMetal]
  val required = "required".asInstanceOf[BareMetal]
  val excluded = "excluded".asInstanceOf[BareMetal]

  @inline def values: js.Array[BareMetal] = js.Array(included, required, excluded)
}

@js.native
sealed trait BatchState extends js.Any
object BatchState {
  val submitted = "submitted".asInstanceOf[BatchState]
  val active = "active".asInstanceOf[BatchState]
  val cancelled = "cancelled".asInstanceOf[BatchState]
  val failed = "failed".asInstanceOf[BatchState]
  val cancelled_running = "cancelled_running".asInstanceOf[BatchState]
  val cancelled_terminating = "cancelled_terminating".asInstanceOf[BatchState]
  val modifying = "modifying".asInstanceOf[BatchState]

  @inline def values: js.Array[BatchState] = js.Array(submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying)
}

@js.native
sealed trait BgpStatus extends js.Any
object BgpStatus {
  val up = "up".asInstanceOf[BgpStatus]
  val down = "down".asInstanceOf[BgpStatus]

  @inline def values: js.Array[BgpStatus] = js.Array(up, down)
}

@js.native
sealed trait BootModeType extends js.Any
object BootModeType {
  val `legacy-bios` = "legacy-bios".asInstanceOf[BootModeType]
  val uefi = "uefi".asInstanceOf[BootModeType]

  @inline def values: js.Array[BootModeType] = js.Array(`legacy-bios`, uefi)
}

@js.native
sealed trait BootModeValues extends js.Any
object BootModeValues {
  val `legacy-bios` = "legacy-bios".asInstanceOf[BootModeValues]
  val uefi = "uefi".asInstanceOf[BootModeValues]

  @inline def values: js.Array[BootModeValues] = js.Array(`legacy-bios`, uefi)
}

@js.native
sealed trait BundleTaskState extends js.Any
object BundleTaskState {
  val pending = "pending".asInstanceOf[BundleTaskState]
  val `waiting-for-shutdown` = "waiting-for-shutdown".asInstanceOf[BundleTaskState]
  val bundling = "bundling".asInstanceOf[BundleTaskState]
  val storing = "storing".asInstanceOf[BundleTaskState]
  val cancelling = "cancelling".asInstanceOf[BundleTaskState]
  val complete = "complete".asInstanceOf[BundleTaskState]
  val failed = "failed".asInstanceOf[BundleTaskState]

  @inline def values: js.Array[BundleTaskState] = js.Array(pending, `waiting-for-shutdown`, bundling, storing, cancelling, complete, failed)
}

@js.native
sealed trait BurstablePerformance extends js.Any
object BurstablePerformance {
  val included = "included".asInstanceOf[BurstablePerformance]
  val required = "required".asInstanceOf[BurstablePerformance]
  val excluded = "excluded".asInstanceOf[BurstablePerformance]

  @inline def values: js.Array[BurstablePerformance] = js.Array(included, required, excluded)
}

@js.native
sealed trait ByoipCidrState extends js.Any
object ByoipCidrState {
  val advertised = "advertised".asInstanceOf[ByoipCidrState]
  val deprovisioned = "deprovisioned".asInstanceOf[ByoipCidrState]
  val `failed-deprovision` = "failed-deprovision".asInstanceOf[ByoipCidrState]
  val `failed-provision` = "failed-provision".asInstanceOf[ByoipCidrState]
  val `pending-deprovision` = "pending-deprovision".asInstanceOf[ByoipCidrState]
  val `pending-provision` = "pending-provision".asInstanceOf[ByoipCidrState]
  val provisioned = "provisioned".asInstanceOf[ByoipCidrState]
  val `provisioned-not-publicly-advertisable` = "provisioned-not-publicly-advertisable".asInstanceOf[ByoipCidrState]

  @inline def values: js.Array[ByoipCidrState] = js.Array(
    advertised,
    deprovisioned,
    `failed-deprovision`,
    `failed-provision`,
    `pending-deprovision`,
    `pending-provision`,
    provisioned,
    `provisioned-not-publicly-advertisable`
  )
}

@js.native
sealed trait CancelBatchErrorCode extends js.Any
object CancelBatchErrorCode {
  val fleetRequestIdDoesNotExist = "fleetRequestIdDoesNotExist".asInstanceOf[CancelBatchErrorCode]
  val fleetRequestIdMalformed = "fleetRequestIdMalformed".asInstanceOf[CancelBatchErrorCode]
  val fleetRequestNotInCancellableState = "fleetRequestNotInCancellableState".asInstanceOf[CancelBatchErrorCode]
  val unexpectedError = "unexpectedError".asInstanceOf[CancelBatchErrorCode]

  @inline def values: js.Array[CancelBatchErrorCode] = js.Array(fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError)
}

@js.native
sealed trait CancelSpotInstanceRequestState extends js.Any
object CancelSpotInstanceRequestState {
  val active = "active".asInstanceOf[CancelSpotInstanceRequestState]
  val open = "open".asInstanceOf[CancelSpotInstanceRequestState]
  val closed = "closed".asInstanceOf[CancelSpotInstanceRequestState]
  val cancelled = "cancelled".asInstanceOf[CancelSpotInstanceRequestState]
  val completed = "completed".asInstanceOf[CancelSpotInstanceRequestState]

  @inline def values: js.Array[CancelSpotInstanceRequestState] = js.Array(active, open, closed, cancelled, completed)
}

@js.native
sealed trait CapacityReservationFleetState extends js.Any
object CapacityReservationFleetState {
  val submitted = "submitted".asInstanceOf[CapacityReservationFleetState]
  val modifying = "modifying".asInstanceOf[CapacityReservationFleetState]
  val active = "active".asInstanceOf[CapacityReservationFleetState]
  val partially_fulfilled = "partially_fulfilled".asInstanceOf[CapacityReservationFleetState]
  val expiring = "expiring".asInstanceOf[CapacityReservationFleetState]
  val expired = "expired".asInstanceOf[CapacityReservationFleetState]
  val cancelling = "cancelling".asInstanceOf[CapacityReservationFleetState]
  val cancelled = "cancelled".asInstanceOf[CapacityReservationFleetState]
  val failed = "failed".asInstanceOf[CapacityReservationFleetState]

  @inline def values: js.Array[CapacityReservationFleetState] = js.Array(submitted, modifying, active, partially_fulfilled, expiring, expired, cancelling, cancelled, failed)
}

@js.native
sealed trait CapacityReservationInstancePlatform extends js.Any
object CapacityReservationInstancePlatform {
  val `Linux/UNIX` = "Linux/UNIX".asInstanceOf[CapacityReservationInstancePlatform]
  val `Red Hat Enterprise Linux` = "Red Hat Enterprise Linux".asInstanceOf[CapacityReservationInstancePlatform]
  val `SUSE Linux` = "SUSE Linux".asInstanceOf[CapacityReservationInstancePlatform]
  val Windows = "Windows".asInstanceOf[CapacityReservationInstancePlatform]
  val `Windows with SQL Server` = "Windows with SQL Server".asInstanceOf[CapacityReservationInstancePlatform]
  val `Windows with SQL Server Enterprise` = "Windows with SQL Server Enterprise".asInstanceOf[CapacityReservationInstancePlatform]
  val `Windows with SQL Server Standard` = "Windows with SQL Server Standard".asInstanceOf[CapacityReservationInstancePlatform]
  val `Windows with SQL Server Web` = "Windows with SQL Server Web".asInstanceOf[CapacityReservationInstancePlatform]
  val `Linux with SQL Server Standard` = "Linux with SQL Server Standard".asInstanceOf[CapacityReservationInstancePlatform]
  val `Linux with SQL Server Web` = "Linux with SQL Server Web".asInstanceOf[CapacityReservationInstancePlatform]
  val `Linux with SQL Server Enterprise` = "Linux with SQL Server Enterprise".asInstanceOf[CapacityReservationInstancePlatform]
  val `RHEL with SQL Server Standard` = "RHEL with SQL Server Standard".asInstanceOf[CapacityReservationInstancePlatform]
  val `RHEL with SQL Server Enterprise` = "RHEL with SQL Server Enterprise".asInstanceOf[CapacityReservationInstancePlatform]
  val `RHEL with SQL Server Web` = "RHEL with SQL Server Web".asInstanceOf[CapacityReservationInstancePlatform]
  val `RHEL with HA` = "RHEL with HA".asInstanceOf[CapacityReservationInstancePlatform]
  val `RHEL with HA and SQL Server Standard` = "RHEL with HA and SQL Server Standard".asInstanceOf[CapacityReservationInstancePlatform]
  val `RHEL with HA and SQL Server Enterprise` = "RHEL with HA and SQL Server Enterprise".asInstanceOf[CapacityReservationInstancePlatform]

  @inline def values: js.Array[CapacityReservationInstancePlatform] = js.Array(
    `Linux/UNIX`,
    `Red Hat Enterprise Linux`,
    `SUSE Linux`,
    Windows,
    `Windows with SQL Server`,
    `Windows with SQL Server Enterprise`,
    `Windows with SQL Server Standard`,
    `Windows with SQL Server Web`,
    `Linux with SQL Server Standard`,
    `Linux with SQL Server Web`,
    `Linux with SQL Server Enterprise`,
    `RHEL with SQL Server Standard`,
    `RHEL with SQL Server Enterprise`,
    `RHEL with SQL Server Web`,
    `RHEL with HA`,
    `RHEL with HA and SQL Server Standard`,
    `RHEL with HA and SQL Server Enterprise`
  )
}

@js.native
sealed trait CapacityReservationPreference extends js.Any
object CapacityReservationPreference {
  val open = "open".asInstanceOf[CapacityReservationPreference]
  val none = "none".asInstanceOf[CapacityReservationPreference]

  @inline def values: js.Array[CapacityReservationPreference] = js.Array(open, none)
}

@js.native
sealed trait CapacityReservationState extends js.Any
object CapacityReservationState {
  val active = "active".asInstanceOf[CapacityReservationState]
  val expired = "expired".asInstanceOf[CapacityReservationState]
  val cancelled = "cancelled".asInstanceOf[CapacityReservationState]
  val pending = "pending".asInstanceOf[CapacityReservationState]
  val failed = "failed".asInstanceOf[CapacityReservationState]

  @inline def values: js.Array[CapacityReservationState] = js.Array(active, expired, cancelled, pending, failed)
}

@js.native
sealed trait CapacityReservationTenancy extends js.Any
object CapacityReservationTenancy {
  val default = "default".asInstanceOf[CapacityReservationTenancy]
  val dedicated = "dedicated".asInstanceOf[CapacityReservationTenancy]

  @inline def values: js.Array[CapacityReservationTenancy] = js.Array(default, dedicated)
}

@js.native
sealed trait CarrierGatewayState extends js.Any
object CarrierGatewayState {
  val pending = "pending".asInstanceOf[CarrierGatewayState]
  val available = "available".asInstanceOf[CarrierGatewayState]
  val deleting = "deleting".asInstanceOf[CarrierGatewayState]
  val deleted = "deleted".asInstanceOf[CarrierGatewayState]

  @inline def values: js.Array[CarrierGatewayState] = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait ClientCertificateRevocationListStatusCode extends js.Any
object ClientCertificateRevocationListStatusCode {
  val pending = "pending".asInstanceOf[ClientCertificateRevocationListStatusCode]
  val active = "active".asInstanceOf[ClientCertificateRevocationListStatusCode]

  @inline def values: js.Array[ClientCertificateRevocationListStatusCode] = js.Array(pending, active)
}

@js.native
sealed trait ClientVpnAuthenticationType extends js.Any
object ClientVpnAuthenticationType {
  val `certificate-authentication` = "certificate-authentication".asInstanceOf[ClientVpnAuthenticationType]
  val `directory-service-authentication` = "directory-service-authentication".asInstanceOf[ClientVpnAuthenticationType]
  val `federated-authentication` = "federated-authentication".asInstanceOf[ClientVpnAuthenticationType]

  @inline def values: js.Array[ClientVpnAuthenticationType] = js.Array(`certificate-authentication`, `directory-service-authentication`, `federated-authentication`)
}

@js.native
sealed trait ClientVpnAuthorizationRuleStatusCode extends js.Any
object ClientVpnAuthorizationRuleStatusCode {
  val authorizing = "authorizing".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]
  val active = "active".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]
  val failed = "failed".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]
  val revoking = "revoking".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]

  @inline def values: js.Array[ClientVpnAuthorizationRuleStatusCode] = js.Array(authorizing, active, failed, revoking)
}

@js.native
sealed trait ClientVpnConnectionStatusCode extends js.Any
object ClientVpnConnectionStatusCode {
  val active = "active".asInstanceOf[ClientVpnConnectionStatusCode]
  val `failed-to-terminate` = "failed-to-terminate".asInstanceOf[ClientVpnConnectionStatusCode]
  val terminating = "terminating".asInstanceOf[ClientVpnConnectionStatusCode]
  val terminated = "terminated".asInstanceOf[ClientVpnConnectionStatusCode]

  @inline def values: js.Array[ClientVpnConnectionStatusCode] = js.Array(active, `failed-to-terminate`, terminating, terminated)
}

@js.native
sealed trait ClientVpnEndpointAttributeStatusCode extends js.Any
object ClientVpnEndpointAttributeStatusCode {
  val applying = "applying".asInstanceOf[ClientVpnEndpointAttributeStatusCode]
  val applied = "applied".asInstanceOf[ClientVpnEndpointAttributeStatusCode]

  @inline def values: js.Array[ClientVpnEndpointAttributeStatusCode] = js.Array(applying, applied)
}

@js.native
sealed trait ClientVpnEndpointStatusCode extends js.Any
object ClientVpnEndpointStatusCode {
  val `pending-associate` = "pending-associate".asInstanceOf[ClientVpnEndpointStatusCode]
  val available = "available".asInstanceOf[ClientVpnEndpointStatusCode]
  val deleting = "deleting".asInstanceOf[ClientVpnEndpointStatusCode]
  val deleted = "deleted".asInstanceOf[ClientVpnEndpointStatusCode]

  @inline def values: js.Array[ClientVpnEndpointStatusCode] = js.Array(`pending-associate`, available, deleting, deleted)
}

@js.native
sealed trait ClientVpnRouteStatusCode extends js.Any
object ClientVpnRouteStatusCode {
  val creating = "creating".asInstanceOf[ClientVpnRouteStatusCode]
  val active = "active".asInstanceOf[ClientVpnRouteStatusCode]
  val failed = "failed".asInstanceOf[ClientVpnRouteStatusCode]
  val deleting = "deleting".asInstanceOf[ClientVpnRouteStatusCode]

  @inline def values: js.Array[ClientVpnRouteStatusCode] = js.Array(creating, active, failed, deleting)
}

@js.native
sealed trait ConnectionNotificationState extends js.Any
object ConnectionNotificationState {
  val Enabled = "Enabled".asInstanceOf[ConnectionNotificationState]
  val Disabled = "Disabled".asInstanceOf[ConnectionNotificationState]

  @inline def values: js.Array[ConnectionNotificationState] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ConnectionNotificationType extends js.Any
object ConnectionNotificationType {
  val Topic = "Topic".asInstanceOf[ConnectionNotificationType]

  @inline def values: js.Array[ConnectionNotificationType] = js.Array(Topic)
}

@js.native
sealed trait ConnectivityType extends js.Any
object ConnectivityType {
  val `private` = "private".asInstanceOf[ConnectivityType]
  val `public` = "public".asInstanceOf[ConnectivityType]

  @inline def values: js.Array[ConnectivityType] = js.Array(`private`, `public`)
}

@js.native
sealed trait ContainerFormat extends js.Any
object ContainerFormat {
  val ova = "ova".asInstanceOf[ContainerFormat]

  @inline def values: js.Array[ContainerFormat] = js.Array(ova)
}

@js.native
sealed trait ConversionTaskState extends js.Any
object ConversionTaskState {
  val active = "active".asInstanceOf[ConversionTaskState]
  val cancelling = "cancelling".asInstanceOf[ConversionTaskState]
  val cancelled = "cancelled".asInstanceOf[ConversionTaskState]
  val completed = "completed".asInstanceOf[ConversionTaskState]

  @inline def values: js.Array[ConversionTaskState] = js.Array(active, cancelling, cancelled, completed)
}

@js.native
sealed trait CopyTagsFromSource extends js.Any
object CopyTagsFromSource {
  val volume = "volume".asInstanceOf[CopyTagsFromSource]

  @inline def values: js.Array[CopyTagsFromSource] = js.Array(volume)
}

@js.native
sealed trait CpuManufacturer extends js.Any
object CpuManufacturer {
  val intel = "intel".asInstanceOf[CpuManufacturer]
  val amd = "amd".asInstanceOf[CpuManufacturer]
  val `amazon-web-services` = "amazon-web-services".asInstanceOf[CpuManufacturer]

  @inline def values: js.Array[CpuManufacturer] = js.Array(intel, amd, `amazon-web-services`)
}

@js.native
sealed trait CurrencyCodeValues extends js.Any
object CurrencyCodeValues {
  val USD = "USD".asInstanceOf[CurrencyCodeValues]

  @inline def values: js.Array[CurrencyCodeValues] = js.Array(USD)
}

@js.native
sealed trait DatafeedSubscriptionState extends js.Any
object DatafeedSubscriptionState {
  val Active = "Active".asInstanceOf[DatafeedSubscriptionState]
  val Inactive = "Inactive".asInstanceOf[DatafeedSubscriptionState]

  @inline def values: js.Array[DatafeedSubscriptionState] = js.Array(Active, Inactive)
}

@js.native
sealed trait DefaultRouteTableAssociationValue extends js.Any
object DefaultRouteTableAssociationValue {
  val enable = "enable".asInstanceOf[DefaultRouteTableAssociationValue]
  val disable = "disable".asInstanceOf[DefaultRouteTableAssociationValue]

  @inline def values: js.Array[DefaultRouteTableAssociationValue] = js.Array(enable, disable)
}

@js.native
sealed trait DefaultRouteTablePropagationValue extends js.Any
object DefaultRouteTablePropagationValue {
  val enable = "enable".asInstanceOf[DefaultRouteTablePropagationValue]
  val disable = "disable".asInstanceOf[DefaultRouteTablePropagationValue]

  @inline def values: js.Array[DefaultRouteTablePropagationValue] = js.Array(enable, disable)
}

@js.native
sealed trait DefaultTargetCapacityType extends js.Any
object DefaultTargetCapacityType {
  val spot = "spot".asInstanceOf[DefaultTargetCapacityType]
  val `on-demand` = "on-demand".asInstanceOf[DefaultTargetCapacityType]

  @inline def values: js.Array[DefaultTargetCapacityType] = js.Array(spot, `on-demand`)
}

@js.native
sealed trait DeleteFleetErrorCode extends js.Any
object DeleteFleetErrorCode {
  val fleetIdDoesNotExist = "fleetIdDoesNotExist".asInstanceOf[DeleteFleetErrorCode]
  val fleetIdMalformed = "fleetIdMalformed".asInstanceOf[DeleteFleetErrorCode]
  val fleetNotInDeletableState = "fleetNotInDeletableState".asInstanceOf[DeleteFleetErrorCode]
  val unexpectedError = "unexpectedError".asInstanceOf[DeleteFleetErrorCode]

  @inline def values: js.Array[DeleteFleetErrorCode] = js.Array(fleetIdDoesNotExist, fleetIdMalformed, fleetNotInDeletableState, unexpectedError)
}

@js.native
sealed trait DeleteQueuedReservedInstancesErrorCode extends js.Any
object DeleteQueuedReservedInstancesErrorCode {
  val `reserved-instances-id-invalid` = "reserved-instances-id-invalid".asInstanceOf[DeleteQueuedReservedInstancesErrorCode]
  val `reserved-instances-not-in-queued-state` = "reserved-instances-not-in-queued-state".asInstanceOf[DeleteQueuedReservedInstancesErrorCode]
  val `unexpected-error` = "unexpected-error".asInstanceOf[DeleteQueuedReservedInstancesErrorCode]

  @inline def values: js.Array[DeleteQueuedReservedInstancesErrorCode] = js.Array(`reserved-instances-id-invalid`, `reserved-instances-not-in-queued-state`, `unexpected-error`)
}

@js.native
sealed trait DestinationFileFormat extends js.Any
object DestinationFileFormat {
  val `plain-text` = "plain-text".asInstanceOf[DestinationFileFormat]
  val parquet = "parquet".asInstanceOf[DestinationFileFormat]

  @inline def values: js.Array[DestinationFileFormat] = js.Array(`plain-text`, parquet)
}

@js.native
sealed trait DeviceTrustProviderType extends js.Any
object DeviceTrustProviderType {
  val jamf = "jamf".asInstanceOf[DeviceTrustProviderType]
  val crowdstrike = "crowdstrike".asInstanceOf[DeviceTrustProviderType]

  @inline def values: js.Array[DeviceTrustProviderType] = js.Array(jamf, crowdstrike)
}

@js.native
sealed trait DeviceType extends js.Any
object DeviceType {
  val ebs = "ebs".asInstanceOf[DeviceType]
  val `instance-store` = "instance-store".asInstanceOf[DeviceType]

  @inline def values: js.Array[DeviceType] = js.Array(ebs, `instance-store`)
}

@js.native
sealed trait DiskImageFormat extends js.Any
object DiskImageFormat {
  val VMDK = "VMDK".asInstanceOf[DiskImageFormat]
  val RAW = "RAW".asInstanceOf[DiskImageFormat]
  val VHD = "VHD".asInstanceOf[DiskImageFormat]

  @inline def values: js.Array[DiskImageFormat] = js.Array(VMDK, RAW, VHD)
}

@js.native
sealed trait DiskType extends js.Any
object DiskType {
  val hdd = "hdd".asInstanceOf[DiskType]
  val ssd = "ssd".asInstanceOf[DiskType]

  @inline def values: js.Array[DiskType] = js.Array(hdd, ssd)
}

@js.native
sealed trait DnsNameState extends js.Any
object DnsNameState {
  val pendingVerification = "pendingVerification".asInstanceOf[DnsNameState]
  val verified = "verified".asInstanceOf[DnsNameState]
  val failed = "failed".asInstanceOf[DnsNameState]

  @inline def values: js.Array[DnsNameState] = js.Array(pendingVerification, verified, failed)
}

@js.native
sealed trait DnsRecordIpType extends js.Any
object DnsRecordIpType {
  val ipv4 = "ipv4".asInstanceOf[DnsRecordIpType]
  val dualstack = "dualstack".asInstanceOf[DnsRecordIpType]
  val ipv6 = "ipv6".asInstanceOf[DnsRecordIpType]
  val `service-defined` = "service-defined".asInstanceOf[DnsRecordIpType]

  @inline def values: js.Array[DnsRecordIpType] = js.Array(ipv4, dualstack, ipv6, `service-defined`)
}

@js.native
sealed trait DnsSupportValue extends js.Any
object DnsSupportValue {
  val enable = "enable".asInstanceOf[DnsSupportValue]
  val disable = "disable".asInstanceOf[DnsSupportValue]

  @inline def values: js.Array[DnsSupportValue] = js.Array(enable, disable)
}

@js.native
sealed trait DomainType extends js.Any
object DomainType {
  val vpc = "vpc".asInstanceOf[DomainType]
  val standard = "standard".asInstanceOf[DomainType]

  @inline def values: js.Array[DomainType] = js.Array(vpc, standard)
}

@js.native
sealed trait DynamicRoutingValue extends js.Any
object DynamicRoutingValue {
  val enable = "enable".asInstanceOf[DynamicRoutingValue]
  val disable = "disable".asInstanceOf[DynamicRoutingValue]

  @inline def values: js.Array[DynamicRoutingValue] = js.Array(enable, disable)
}

@js.native
sealed trait EbsEncryptionSupport extends js.Any
object EbsEncryptionSupport {
  val unsupported = "unsupported".asInstanceOf[EbsEncryptionSupport]
  val supported = "supported".asInstanceOf[EbsEncryptionSupport]

  @inline def values: js.Array[EbsEncryptionSupport] = js.Array(unsupported, supported)
}

@js.native
sealed trait EbsNvmeSupport extends js.Any
object EbsNvmeSupport {
  val unsupported = "unsupported".asInstanceOf[EbsNvmeSupport]
  val supported = "supported".asInstanceOf[EbsNvmeSupport]
  val required = "required".asInstanceOf[EbsNvmeSupport]

  @inline def values: js.Array[EbsNvmeSupport] = js.Array(unsupported, supported, required)
}

@js.native
sealed trait EbsOptimizedSupport extends js.Any
object EbsOptimizedSupport {
  val unsupported = "unsupported".asInstanceOf[EbsOptimizedSupport]
  val supported = "supported".asInstanceOf[EbsOptimizedSupport]
  val default = "default".asInstanceOf[EbsOptimizedSupport]

  @inline def values: js.Array[EbsOptimizedSupport] = js.Array(unsupported, supported, default)
}

@js.native
sealed trait ElasticGpuState extends js.Any
object ElasticGpuState {
  val ATTACHED = "ATTACHED".asInstanceOf[ElasticGpuState]

  @inline def values: js.Array[ElasticGpuState] = js.Array(ATTACHED)
}

@js.native
sealed trait ElasticGpuStatus extends js.Any
object ElasticGpuStatus {
  val OK = "OK".asInstanceOf[ElasticGpuStatus]
  val IMPAIRED = "IMPAIRED".asInstanceOf[ElasticGpuStatus]

  @inline def values: js.Array[ElasticGpuStatus] = js.Array(OK, IMPAIRED)
}

@js.native
sealed trait EnaSupport extends js.Any
object EnaSupport {
  val unsupported = "unsupported".asInstanceOf[EnaSupport]
  val supported = "supported".asInstanceOf[EnaSupport]
  val required = "required".asInstanceOf[EnaSupport]

  @inline def values: js.Array[EnaSupport] = js.Array(unsupported, supported, required)
}

@js.native
sealed trait EndDateType extends js.Any
object EndDateType {
  val unlimited = "unlimited".asInstanceOf[EndDateType]
  val limited = "limited".asInstanceOf[EndDateType]

  @inline def values: js.Array[EndDateType] = js.Array(unlimited, limited)
}

@js.native
sealed trait EphemeralNvmeSupport extends js.Any
object EphemeralNvmeSupport {
  val unsupported = "unsupported".asInstanceOf[EphemeralNvmeSupport]
  val supported = "supported".asInstanceOf[EphemeralNvmeSupport]
  val required = "required".asInstanceOf[EphemeralNvmeSupport]

  @inline def values: js.Array[EphemeralNvmeSupport] = js.Array(unsupported, supported, required)
}

@js.native
sealed trait EventCode extends js.Any
object EventCode {
  val `instance-reboot` = "instance-reboot".asInstanceOf[EventCode]
  val `system-reboot` = "system-reboot".asInstanceOf[EventCode]
  val `system-maintenance` = "system-maintenance".asInstanceOf[EventCode]
  val `instance-retirement` = "instance-retirement".asInstanceOf[EventCode]
  val `instance-stop` = "instance-stop".asInstanceOf[EventCode]

  @inline def values: js.Array[EventCode] = js.Array(`instance-reboot`, `system-reboot`, `system-maintenance`, `instance-retirement`, `instance-stop`)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val instanceChange = "instanceChange".asInstanceOf[EventType]
  val fleetRequestChange = "fleetRequestChange".asInstanceOf[EventType]
  val error = "error".asInstanceOf[EventType]
  val information = "information".asInstanceOf[EventType]

  @inline def values: js.Array[EventType] = js.Array(instanceChange, fleetRequestChange, error, information)
}

@js.native
sealed trait ExcessCapacityTerminationPolicy extends js.Any
object ExcessCapacityTerminationPolicy {
  val noTermination = "noTermination".asInstanceOf[ExcessCapacityTerminationPolicy]
  val default = "default".asInstanceOf[ExcessCapacityTerminationPolicy]

  @inline def values: js.Array[ExcessCapacityTerminationPolicy] = js.Array(noTermination, default)
}

@js.native
sealed trait ExportEnvironment extends js.Any
object ExportEnvironment {
  val citrix = "citrix".asInstanceOf[ExportEnvironment]
  val vmware = "vmware".asInstanceOf[ExportEnvironment]
  val microsoft = "microsoft".asInstanceOf[ExportEnvironment]

  @inline def values: js.Array[ExportEnvironment] = js.Array(citrix, vmware, microsoft)
}

@js.native
sealed trait ExportTaskState extends js.Any
object ExportTaskState {
  val active = "active".asInstanceOf[ExportTaskState]
  val cancelling = "cancelling".asInstanceOf[ExportTaskState]
  val cancelled = "cancelled".asInstanceOf[ExportTaskState]
  val completed = "completed".asInstanceOf[ExportTaskState]

  @inline def values: js.Array[ExportTaskState] = js.Array(active, cancelling, cancelled, completed)
}

@js.native
sealed trait FastLaunchResourceType extends js.Any
object FastLaunchResourceType {
  val snapshot = "snapshot".asInstanceOf[FastLaunchResourceType]

  @inline def values: js.Array[FastLaunchResourceType] = js.Array(snapshot)
}

@js.native
sealed trait FastLaunchStateCode extends js.Any
object FastLaunchStateCode {
  val enabling = "enabling".asInstanceOf[FastLaunchStateCode]
  val `enabling-failed` = "enabling-failed".asInstanceOf[FastLaunchStateCode]
  val enabled = "enabled".asInstanceOf[FastLaunchStateCode]
  val `enabled-failed` = "enabled-failed".asInstanceOf[FastLaunchStateCode]
  val disabling = "disabling".asInstanceOf[FastLaunchStateCode]
  val `disabling-failed` = "disabling-failed".asInstanceOf[FastLaunchStateCode]

  @inline def values: js.Array[FastLaunchStateCode] = js.Array(enabling, `enabling-failed`, enabled, `enabled-failed`, disabling, `disabling-failed`)
}

@js.native
sealed trait FastSnapshotRestoreStateCode extends js.Any
object FastSnapshotRestoreStateCode {
  val enabling = "enabling".asInstanceOf[FastSnapshotRestoreStateCode]
  val optimizing = "optimizing".asInstanceOf[FastSnapshotRestoreStateCode]
  val enabled = "enabled".asInstanceOf[FastSnapshotRestoreStateCode]
  val disabling = "disabling".asInstanceOf[FastSnapshotRestoreStateCode]
  val disabled = "disabled".asInstanceOf[FastSnapshotRestoreStateCode]

  @inline def values: js.Array[FastSnapshotRestoreStateCode] = js.Array(enabling, optimizing, enabled, disabling, disabled)
}

@js.native
sealed trait FindingsFound extends js.Any
object FindingsFound {
  val `true` = "true".asInstanceOf[FindingsFound]
  val `false` = "false".asInstanceOf[FindingsFound]
  val unknown = "unknown".asInstanceOf[FindingsFound]

  @inline def values: js.Array[FindingsFound] = js.Array(`true`, `false`, unknown)
}

@js.native
sealed trait FleetActivityStatus extends js.Any
object FleetActivityStatus {
  val error = "error".asInstanceOf[FleetActivityStatus]
  val pending_fulfillment = "pending_fulfillment".asInstanceOf[FleetActivityStatus]
  val pending_termination = "pending_termination".asInstanceOf[FleetActivityStatus]
  val fulfilled = "fulfilled".asInstanceOf[FleetActivityStatus]

  @inline def values: js.Array[FleetActivityStatus] = js.Array(error, pending_fulfillment, pending_termination, fulfilled)
}

@js.native
sealed trait FleetCapacityReservationTenancy extends js.Any
object FleetCapacityReservationTenancy {
  val default = "default".asInstanceOf[FleetCapacityReservationTenancy]

  @inline def values: js.Array[FleetCapacityReservationTenancy] = js.Array(default)
}

@js.native
sealed trait FleetCapacityReservationUsageStrategy extends js.Any
object FleetCapacityReservationUsageStrategy {
  val `use-capacity-reservations-first` = "use-capacity-reservations-first".asInstanceOf[FleetCapacityReservationUsageStrategy]

  @inline def values: js.Array[FleetCapacityReservationUsageStrategy] = js.Array(`use-capacity-reservations-first`)
}

@js.native
sealed trait FleetEventType extends js.Any
object FleetEventType {
  val `instance-change` = "instance-change".asInstanceOf[FleetEventType]
  val `fleet-change` = "fleet-change".asInstanceOf[FleetEventType]
  val `service-error` = "service-error".asInstanceOf[FleetEventType]

  @inline def values: js.Array[FleetEventType] = js.Array(`instance-change`, `fleet-change`, `service-error`)
}

@js.native
sealed trait FleetExcessCapacityTerminationPolicy extends js.Any
object FleetExcessCapacityTerminationPolicy {
  val `no-termination` = "no-termination".asInstanceOf[FleetExcessCapacityTerminationPolicy]
  val termination = "termination".asInstanceOf[FleetExcessCapacityTerminationPolicy]

  @inline def values: js.Array[FleetExcessCapacityTerminationPolicy] = js.Array(`no-termination`, termination)
}

@js.native
sealed trait FleetInstanceMatchCriteria extends js.Any
object FleetInstanceMatchCriteria {
  val open = "open".asInstanceOf[FleetInstanceMatchCriteria]

  @inline def values: js.Array[FleetInstanceMatchCriteria] = js.Array(open)
}

@js.native
sealed trait FleetOnDemandAllocationStrategy extends js.Any
object FleetOnDemandAllocationStrategy {
  val `lowest-price` = "lowest-price".asInstanceOf[FleetOnDemandAllocationStrategy]
  val prioritized = "prioritized".asInstanceOf[FleetOnDemandAllocationStrategy]

  @inline def values: js.Array[FleetOnDemandAllocationStrategy] = js.Array(`lowest-price`, prioritized)
}

@js.native
sealed trait FleetReplacementStrategy extends js.Any
object FleetReplacementStrategy {
  val launch = "launch".asInstanceOf[FleetReplacementStrategy]
  val `launch-before-terminate` = "launch-before-terminate".asInstanceOf[FleetReplacementStrategy]

  @inline def values: js.Array[FleetReplacementStrategy] = js.Array(launch, `launch-before-terminate`)
}

@js.native
sealed trait FleetStateCode extends js.Any
object FleetStateCode {
  val submitted = "submitted".asInstanceOf[FleetStateCode]
  val active = "active".asInstanceOf[FleetStateCode]
  val deleted = "deleted".asInstanceOf[FleetStateCode]
  val failed = "failed".asInstanceOf[FleetStateCode]
  val deleted_running = "deleted_running".asInstanceOf[FleetStateCode]
  val deleted_terminating = "deleted_terminating".asInstanceOf[FleetStateCode]
  val modifying = "modifying".asInstanceOf[FleetStateCode]

  @inline def values: js.Array[FleetStateCode] = js.Array(submitted, active, deleted, failed, deleted_running, deleted_terminating, modifying)
}

@js.native
sealed trait FleetType extends js.Any
object FleetType {
  val request = "request".asInstanceOf[FleetType]
  val maintain = "maintain".asInstanceOf[FleetType]
  val instant = "instant".asInstanceOf[FleetType]

  @inline def values: js.Array[FleetType] = js.Array(request, maintain, instant)
}

@js.native
sealed trait FlowLogsResourceType extends js.Any
object FlowLogsResourceType {
  val VPC = "VPC".asInstanceOf[FlowLogsResourceType]
  val Subnet = "Subnet".asInstanceOf[FlowLogsResourceType]
  val NetworkInterface = "NetworkInterface".asInstanceOf[FlowLogsResourceType]
  val TransitGateway = "TransitGateway".asInstanceOf[FlowLogsResourceType]
  val TransitGatewayAttachment = "TransitGatewayAttachment".asInstanceOf[FlowLogsResourceType]

  @inline def values: js.Array[FlowLogsResourceType] = js.Array(VPC, Subnet, NetworkInterface, TransitGateway, TransitGatewayAttachment)
}

@js.native
sealed trait FpgaImageAttributeName extends js.Any
object FpgaImageAttributeName {
  val description = "description".asInstanceOf[FpgaImageAttributeName]
  val name = "name".asInstanceOf[FpgaImageAttributeName]
  val loadPermission = "loadPermission".asInstanceOf[FpgaImageAttributeName]
  val productCodes = "productCodes".asInstanceOf[FpgaImageAttributeName]

  @inline def values: js.Array[FpgaImageAttributeName] = js.Array(description, name, loadPermission, productCodes)
}

@js.native
sealed trait FpgaImageStateCode extends js.Any
object FpgaImageStateCode {
  val pending = "pending".asInstanceOf[FpgaImageStateCode]
  val failed = "failed".asInstanceOf[FpgaImageStateCode]
  val available = "available".asInstanceOf[FpgaImageStateCode]
  val unavailable = "unavailable".asInstanceOf[FpgaImageStateCode]

  @inline def values: js.Array[FpgaImageStateCode] = js.Array(pending, failed, available, unavailable)
}

@js.native
sealed trait GatewayAssociationState extends js.Any
object GatewayAssociationState {
  val associated = "associated".asInstanceOf[GatewayAssociationState]
  val `not-associated` = "not-associated".asInstanceOf[GatewayAssociationState]
  val associating = "associating".asInstanceOf[GatewayAssociationState]
  val disassociating = "disassociating".asInstanceOf[GatewayAssociationState]

  @inline def values: js.Array[GatewayAssociationState] = js.Array(associated, `not-associated`, associating, disassociating)
}

@js.native
sealed trait GatewayType extends js.Any
object GatewayType {
  val `ipsec.1` = "ipsec.1".asInstanceOf[GatewayType]

  @inline def values: js.Array[GatewayType] = js.Array(`ipsec.1`)
}

@js.native
sealed trait HostRecovery extends js.Any
object HostRecovery {
  val on = "on".asInstanceOf[HostRecovery]
  val off = "off".asInstanceOf[HostRecovery]

  @inline def values: js.Array[HostRecovery] = js.Array(on, off)
}

@js.native
sealed trait HostTenancy extends js.Any
object HostTenancy {
  val dedicated = "dedicated".asInstanceOf[HostTenancy]
  val host = "host".asInstanceOf[HostTenancy]

  @inline def values: js.Array[HostTenancy] = js.Array(dedicated, host)
}

@js.native
sealed trait HostnameType extends js.Any
object HostnameType {
  val `ip-name` = "ip-name".asInstanceOf[HostnameType]
  val `resource-name` = "resource-name".asInstanceOf[HostnameType]

  @inline def values: js.Array[HostnameType] = js.Array(`ip-name`, `resource-name`)
}

@js.native
sealed trait HttpTokensState extends js.Any
object HttpTokensState {
  val optional = "optional".asInstanceOf[HttpTokensState]
  val required = "required".asInstanceOf[HttpTokensState]

  @inline def values: js.Array[HttpTokensState] = js.Array(optional, required)
}

@js.native
sealed trait HypervisorType extends js.Any
object HypervisorType {
  val ovm = "ovm".asInstanceOf[HypervisorType]
  val xen = "xen".asInstanceOf[HypervisorType]

  @inline def values: js.Array[HypervisorType] = js.Array(ovm, xen)
}

@js.native
sealed trait IamInstanceProfileAssociationState extends js.Any
object IamInstanceProfileAssociationState {
  val associating = "associating".asInstanceOf[IamInstanceProfileAssociationState]
  val associated = "associated".asInstanceOf[IamInstanceProfileAssociationState]
  val disassociating = "disassociating".asInstanceOf[IamInstanceProfileAssociationState]
  val disassociated = "disassociated".asInstanceOf[IamInstanceProfileAssociationState]

  @inline def values: js.Array[IamInstanceProfileAssociationState] = js.Array(associating, associated, disassociating, disassociated)
}

@js.native
sealed trait Igmpv2SupportValue extends js.Any
object Igmpv2SupportValue {
  val enable = "enable".asInstanceOf[Igmpv2SupportValue]
  val disable = "disable".asInstanceOf[Igmpv2SupportValue]

  @inline def values: js.Array[Igmpv2SupportValue] = js.Array(enable, disable)
}

@js.native
sealed trait ImageAttributeName extends js.Any
object ImageAttributeName {
  val description = "description".asInstanceOf[ImageAttributeName]
  val kernel = "kernel".asInstanceOf[ImageAttributeName]
  val ramdisk = "ramdisk".asInstanceOf[ImageAttributeName]
  val launchPermission = "launchPermission".asInstanceOf[ImageAttributeName]
  val productCodes = "productCodes".asInstanceOf[ImageAttributeName]
  val blockDeviceMapping = "blockDeviceMapping".asInstanceOf[ImageAttributeName]
  val sriovNetSupport = "sriovNetSupport".asInstanceOf[ImageAttributeName]
  val bootMode = "bootMode".asInstanceOf[ImageAttributeName]
  val tpmSupport = "tpmSupport".asInstanceOf[ImageAttributeName]
  val uefiData = "uefiData".asInstanceOf[ImageAttributeName]
  val lastLaunchedTime = "lastLaunchedTime".asInstanceOf[ImageAttributeName]
  val imdsSupport = "imdsSupport".asInstanceOf[ImageAttributeName]

  @inline def values: js.Array[ImageAttributeName] = js.Array(description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping, sriovNetSupport, bootMode, tpmSupport, uefiData, lastLaunchedTime, imdsSupport)
}

@js.native
sealed trait ImageState extends js.Any
object ImageState {
  val pending = "pending".asInstanceOf[ImageState]
  val available = "available".asInstanceOf[ImageState]
  val invalid = "invalid".asInstanceOf[ImageState]
  val deregistered = "deregistered".asInstanceOf[ImageState]
  val transient = "transient".asInstanceOf[ImageState]
  val failed = "failed".asInstanceOf[ImageState]
  val error = "error".asInstanceOf[ImageState]

  @inline def values: js.Array[ImageState] = js.Array(pending, available, invalid, deregistered, transient, failed, error)
}

@js.native
sealed trait ImageTypeValues extends js.Any
object ImageTypeValues {
  val machine = "machine".asInstanceOf[ImageTypeValues]
  val kernel = "kernel".asInstanceOf[ImageTypeValues]
  val ramdisk = "ramdisk".asInstanceOf[ImageTypeValues]

  @inline def values: js.Array[ImageTypeValues] = js.Array(machine, kernel, ramdisk)
}

@js.native
sealed trait ImdsSupportValues extends js.Any
object ImdsSupportValues {
  val `v2.0` = "v2.0".asInstanceOf[ImdsSupportValues]

  @inline def values: js.Array[ImdsSupportValues] = js.Array(`v2.0`)
}

@js.native
sealed trait InstanceAttributeName extends js.Any
object InstanceAttributeName {
  val instanceType = "instanceType".asInstanceOf[InstanceAttributeName]
  val kernel = "kernel".asInstanceOf[InstanceAttributeName]
  val ramdisk = "ramdisk".asInstanceOf[InstanceAttributeName]
  val userData = "userData".asInstanceOf[InstanceAttributeName]
  val disableApiTermination = "disableApiTermination".asInstanceOf[InstanceAttributeName]
  val instanceInitiatedShutdownBehavior = "instanceInitiatedShutdownBehavior".asInstanceOf[InstanceAttributeName]
  val rootDeviceName = "rootDeviceName".asInstanceOf[InstanceAttributeName]
  val blockDeviceMapping = "blockDeviceMapping".asInstanceOf[InstanceAttributeName]
  val productCodes = "productCodes".asInstanceOf[InstanceAttributeName]
  val sourceDestCheck = "sourceDestCheck".asInstanceOf[InstanceAttributeName]
  val groupSet = "groupSet".asInstanceOf[InstanceAttributeName]
  val ebsOptimized = "ebsOptimized".asInstanceOf[InstanceAttributeName]
  val sriovNetSupport = "sriovNetSupport".asInstanceOf[InstanceAttributeName]
  val enaSupport = "enaSupport".asInstanceOf[InstanceAttributeName]
  val enclaveOptions = "enclaveOptions".asInstanceOf[InstanceAttributeName]
  val disableApiStop = "disableApiStop".asInstanceOf[InstanceAttributeName]

  @inline def values: js.Array[InstanceAttributeName] = js.Array(
    instanceType,
    kernel,
    ramdisk,
    userData,
    disableApiTermination,
    instanceInitiatedShutdownBehavior,
    rootDeviceName,
    blockDeviceMapping,
    productCodes,
    sourceDestCheck,
    groupSet,
    ebsOptimized,
    sriovNetSupport,
    enaSupport,
    enclaveOptions,
    disableApiStop
  )
}

@js.native
sealed trait InstanceAutoRecoveryState extends js.Any
object InstanceAutoRecoveryState {
  val disabled = "disabled".asInstanceOf[InstanceAutoRecoveryState]
  val default = "default".asInstanceOf[InstanceAutoRecoveryState]

  @inline def values: js.Array[InstanceAutoRecoveryState] = js.Array(disabled, default)
}

@js.native
sealed trait InstanceEventWindowState extends js.Any
object InstanceEventWindowState {
  val creating = "creating".asInstanceOf[InstanceEventWindowState]
  val deleting = "deleting".asInstanceOf[InstanceEventWindowState]
  val active = "active".asInstanceOf[InstanceEventWindowState]
  val deleted = "deleted".asInstanceOf[InstanceEventWindowState]

  @inline def values: js.Array[InstanceEventWindowState] = js.Array(creating, deleting, active, deleted)
}

@js.native
sealed trait InstanceGeneration extends js.Any
object InstanceGeneration {
  val current = "current".asInstanceOf[InstanceGeneration]
  val previous = "previous".asInstanceOf[InstanceGeneration]

  @inline def values: js.Array[InstanceGeneration] = js.Array(current, previous)
}

@js.native
sealed trait InstanceHealthStatus extends js.Any
object InstanceHealthStatus {
  val healthy = "healthy".asInstanceOf[InstanceHealthStatus]
  val unhealthy = "unhealthy".asInstanceOf[InstanceHealthStatus]

  @inline def values: js.Array[InstanceHealthStatus] = js.Array(healthy, unhealthy)
}

@js.native
sealed trait InstanceInterruptionBehavior extends js.Any
object InstanceInterruptionBehavior {
  val hibernate = "hibernate".asInstanceOf[InstanceInterruptionBehavior]
  val stop = "stop".asInstanceOf[InstanceInterruptionBehavior]
  val terminate = "terminate".asInstanceOf[InstanceInterruptionBehavior]

  @inline def values: js.Array[InstanceInterruptionBehavior] = js.Array(hibernate, stop, terminate)
}

@js.native
sealed trait InstanceLifecycle extends js.Any
object InstanceLifecycle {
  val spot = "spot".asInstanceOf[InstanceLifecycle]
  val `on-demand` = "on-demand".asInstanceOf[InstanceLifecycle]

  @inline def values: js.Array[InstanceLifecycle] = js.Array(spot, `on-demand`)
}

@js.native
sealed trait InstanceLifecycleType extends js.Any
object InstanceLifecycleType {
  val spot = "spot".asInstanceOf[InstanceLifecycleType]
  val scheduled = "scheduled".asInstanceOf[InstanceLifecycleType]

  @inline def values: js.Array[InstanceLifecycleType] = js.Array(spot, scheduled)
}

@js.native
sealed trait InstanceMatchCriteria extends js.Any
object InstanceMatchCriteria {
  val open = "open".asInstanceOf[InstanceMatchCriteria]
  val targeted = "targeted".asInstanceOf[InstanceMatchCriteria]

  @inline def values: js.Array[InstanceMatchCriteria] = js.Array(open, targeted)
}

@js.native
sealed trait InstanceMetadataEndpointState extends js.Any
object InstanceMetadataEndpointState {
  val disabled = "disabled".asInstanceOf[InstanceMetadataEndpointState]
  val enabled = "enabled".asInstanceOf[InstanceMetadataEndpointState]

  @inline def values: js.Array[InstanceMetadataEndpointState] = js.Array(disabled, enabled)
}

@js.native
sealed trait InstanceMetadataOptionsState extends js.Any
object InstanceMetadataOptionsState {
  val pending = "pending".asInstanceOf[InstanceMetadataOptionsState]
  val applied = "applied".asInstanceOf[InstanceMetadataOptionsState]

  @inline def values: js.Array[InstanceMetadataOptionsState] = js.Array(pending, applied)
}

@js.native
sealed trait InstanceMetadataProtocolState extends js.Any
object InstanceMetadataProtocolState {
  val disabled = "disabled".asInstanceOf[InstanceMetadataProtocolState]
  val enabled = "enabled".asInstanceOf[InstanceMetadataProtocolState]

  @inline def values: js.Array[InstanceMetadataProtocolState] = js.Array(disabled, enabled)
}

@js.native
sealed trait InstanceMetadataTagsState extends js.Any
object InstanceMetadataTagsState {
  val disabled = "disabled".asInstanceOf[InstanceMetadataTagsState]
  val enabled = "enabled".asInstanceOf[InstanceMetadataTagsState]

  @inline def values: js.Array[InstanceMetadataTagsState] = js.Array(disabled, enabled)
}

@js.native
sealed trait InstanceStateName extends js.Any
object InstanceStateName {
  val pending = "pending".asInstanceOf[InstanceStateName]
  val running = "running".asInstanceOf[InstanceStateName]
  val `shutting-down` = "shutting-down".asInstanceOf[InstanceStateName]
  val terminated = "terminated".asInstanceOf[InstanceStateName]
  val stopping = "stopping".asInstanceOf[InstanceStateName]
  val stopped = "stopped".asInstanceOf[InstanceStateName]

  @inline def values: js.Array[InstanceStateName] = js.Array(pending, running, `shutting-down`, terminated, stopping, stopped)
}

@js.native
sealed trait InstanceStorageEncryptionSupport extends js.Any
object InstanceStorageEncryptionSupport {
  val unsupported = "unsupported".asInstanceOf[InstanceStorageEncryptionSupport]
  val required = "required".asInstanceOf[InstanceStorageEncryptionSupport]

  @inline def values: js.Array[InstanceStorageEncryptionSupport] = js.Array(unsupported, required)
}

@js.native
sealed trait InstanceType extends js.Any
object InstanceType {
  val `a1.medium` = "a1.medium".asInstanceOf[InstanceType]
  val `a1.large` = "a1.large".asInstanceOf[InstanceType]
  val `a1.xlarge` = "a1.xlarge".asInstanceOf[InstanceType]
  val `a1.2xlarge` = "a1.2xlarge".asInstanceOf[InstanceType]
  val `a1.4xlarge` = "a1.4xlarge".asInstanceOf[InstanceType]
  val `a1.metal` = "a1.metal".asInstanceOf[InstanceType]
  val `c1.medium` = "c1.medium".asInstanceOf[InstanceType]
  val `c1.xlarge` = "c1.xlarge".asInstanceOf[InstanceType]
  val `c3.large` = "c3.large".asInstanceOf[InstanceType]
  val `c3.xlarge` = "c3.xlarge".asInstanceOf[InstanceType]
  val `c3.2xlarge` = "c3.2xlarge".asInstanceOf[InstanceType]
  val `c3.4xlarge` = "c3.4xlarge".asInstanceOf[InstanceType]
  val `c3.8xlarge` = "c3.8xlarge".asInstanceOf[InstanceType]
  val `c4.large` = "c4.large".asInstanceOf[InstanceType]
  val `c4.xlarge` = "c4.xlarge".asInstanceOf[InstanceType]
  val `c4.2xlarge` = "c4.2xlarge".asInstanceOf[InstanceType]
  val `c4.4xlarge` = "c4.4xlarge".asInstanceOf[InstanceType]
  val `c4.8xlarge` = "c4.8xlarge".asInstanceOf[InstanceType]
  val `c5.large` = "c5.large".asInstanceOf[InstanceType]
  val `c5.xlarge` = "c5.xlarge".asInstanceOf[InstanceType]
  val `c5.2xlarge` = "c5.2xlarge".asInstanceOf[InstanceType]
  val `c5.4xlarge` = "c5.4xlarge".asInstanceOf[InstanceType]
  val `c5.9xlarge` = "c5.9xlarge".asInstanceOf[InstanceType]
  val `c5.12xlarge` = "c5.12xlarge".asInstanceOf[InstanceType]
  val `c5.18xlarge` = "c5.18xlarge".asInstanceOf[InstanceType]
  val `c5.24xlarge` = "c5.24xlarge".asInstanceOf[InstanceType]
  val `c5.metal` = "c5.metal".asInstanceOf[InstanceType]
  val `c5a.large` = "c5a.large".asInstanceOf[InstanceType]
  val `c5a.xlarge` = "c5a.xlarge".asInstanceOf[InstanceType]
  val `c5a.2xlarge` = "c5a.2xlarge".asInstanceOf[InstanceType]
  val `c5a.4xlarge` = "c5a.4xlarge".asInstanceOf[InstanceType]
  val `c5a.8xlarge` = "c5a.8xlarge".asInstanceOf[InstanceType]
  val `c5a.12xlarge` = "c5a.12xlarge".asInstanceOf[InstanceType]
  val `c5a.16xlarge` = "c5a.16xlarge".asInstanceOf[InstanceType]
  val `c5a.24xlarge` = "c5a.24xlarge".asInstanceOf[InstanceType]
  val `c5ad.large` = "c5ad.large".asInstanceOf[InstanceType]
  val `c5ad.xlarge` = "c5ad.xlarge".asInstanceOf[InstanceType]
  val `c5ad.2xlarge` = "c5ad.2xlarge".asInstanceOf[InstanceType]
  val `c5ad.4xlarge` = "c5ad.4xlarge".asInstanceOf[InstanceType]
  val `c5ad.8xlarge` = "c5ad.8xlarge".asInstanceOf[InstanceType]
  val `c5ad.12xlarge` = "c5ad.12xlarge".asInstanceOf[InstanceType]
  val `c5ad.16xlarge` = "c5ad.16xlarge".asInstanceOf[InstanceType]
  val `c5ad.24xlarge` = "c5ad.24xlarge".asInstanceOf[InstanceType]
  val `c5d.large` = "c5d.large".asInstanceOf[InstanceType]
  val `c5d.xlarge` = "c5d.xlarge".asInstanceOf[InstanceType]
  val `c5d.2xlarge` = "c5d.2xlarge".asInstanceOf[InstanceType]
  val `c5d.4xlarge` = "c5d.4xlarge".asInstanceOf[InstanceType]
  val `c5d.9xlarge` = "c5d.9xlarge".asInstanceOf[InstanceType]
  val `c5d.12xlarge` = "c5d.12xlarge".asInstanceOf[InstanceType]
  val `c5d.18xlarge` = "c5d.18xlarge".asInstanceOf[InstanceType]
  val `c5d.24xlarge` = "c5d.24xlarge".asInstanceOf[InstanceType]
  val `c5d.metal` = "c5d.metal".asInstanceOf[InstanceType]
  val `c5n.large` = "c5n.large".asInstanceOf[InstanceType]
  val `c5n.xlarge` = "c5n.xlarge".asInstanceOf[InstanceType]
  val `c5n.2xlarge` = "c5n.2xlarge".asInstanceOf[InstanceType]
  val `c5n.4xlarge` = "c5n.4xlarge".asInstanceOf[InstanceType]
  val `c5n.9xlarge` = "c5n.9xlarge".asInstanceOf[InstanceType]
  val `c5n.18xlarge` = "c5n.18xlarge".asInstanceOf[InstanceType]
  val `c5n.metal` = "c5n.metal".asInstanceOf[InstanceType]
  val `c6g.medium` = "c6g.medium".asInstanceOf[InstanceType]
  val `c6g.large` = "c6g.large".asInstanceOf[InstanceType]
  val `c6g.xlarge` = "c6g.xlarge".asInstanceOf[InstanceType]
  val `c6g.2xlarge` = "c6g.2xlarge".asInstanceOf[InstanceType]
  val `c6g.4xlarge` = "c6g.4xlarge".asInstanceOf[InstanceType]
  val `c6g.8xlarge` = "c6g.8xlarge".asInstanceOf[InstanceType]
  val `c6g.12xlarge` = "c6g.12xlarge".asInstanceOf[InstanceType]
  val `c6g.16xlarge` = "c6g.16xlarge".asInstanceOf[InstanceType]
  val `c6g.metal` = "c6g.metal".asInstanceOf[InstanceType]
  val `c6gd.medium` = "c6gd.medium".asInstanceOf[InstanceType]
  val `c6gd.large` = "c6gd.large".asInstanceOf[InstanceType]
  val `c6gd.xlarge` = "c6gd.xlarge".asInstanceOf[InstanceType]
  val `c6gd.2xlarge` = "c6gd.2xlarge".asInstanceOf[InstanceType]
  val `c6gd.4xlarge` = "c6gd.4xlarge".asInstanceOf[InstanceType]
  val `c6gd.8xlarge` = "c6gd.8xlarge".asInstanceOf[InstanceType]
  val `c6gd.12xlarge` = "c6gd.12xlarge".asInstanceOf[InstanceType]
  val `c6gd.16xlarge` = "c6gd.16xlarge".asInstanceOf[InstanceType]
  val `c6gd.metal` = "c6gd.metal".asInstanceOf[InstanceType]
  val `c6gn.medium` = "c6gn.medium".asInstanceOf[InstanceType]
  val `c6gn.large` = "c6gn.large".asInstanceOf[InstanceType]
  val `c6gn.xlarge` = "c6gn.xlarge".asInstanceOf[InstanceType]
  val `c6gn.2xlarge` = "c6gn.2xlarge".asInstanceOf[InstanceType]
  val `c6gn.4xlarge` = "c6gn.4xlarge".asInstanceOf[InstanceType]
  val `c6gn.8xlarge` = "c6gn.8xlarge".asInstanceOf[InstanceType]
  val `c6gn.12xlarge` = "c6gn.12xlarge".asInstanceOf[InstanceType]
  val `c6gn.16xlarge` = "c6gn.16xlarge".asInstanceOf[InstanceType]
  val `c6i.large` = "c6i.large".asInstanceOf[InstanceType]
  val `c6i.xlarge` = "c6i.xlarge".asInstanceOf[InstanceType]
  val `c6i.2xlarge` = "c6i.2xlarge".asInstanceOf[InstanceType]
  val `c6i.4xlarge` = "c6i.4xlarge".asInstanceOf[InstanceType]
  val `c6i.8xlarge` = "c6i.8xlarge".asInstanceOf[InstanceType]
  val `c6i.12xlarge` = "c6i.12xlarge".asInstanceOf[InstanceType]
  val `c6i.16xlarge` = "c6i.16xlarge".asInstanceOf[InstanceType]
  val `c6i.24xlarge` = "c6i.24xlarge".asInstanceOf[InstanceType]
  val `c6i.32xlarge` = "c6i.32xlarge".asInstanceOf[InstanceType]
  val `c6i.metal` = "c6i.metal".asInstanceOf[InstanceType]
  val `cc1.4xlarge` = "cc1.4xlarge".asInstanceOf[InstanceType]
  val `cc2.8xlarge` = "cc2.8xlarge".asInstanceOf[InstanceType]
  val `cg1.4xlarge` = "cg1.4xlarge".asInstanceOf[InstanceType]
  val `cr1.8xlarge` = "cr1.8xlarge".asInstanceOf[InstanceType]
  val `d2.xlarge` = "d2.xlarge".asInstanceOf[InstanceType]
  val `d2.2xlarge` = "d2.2xlarge".asInstanceOf[InstanceType]
  val `d2.4xlarge` = "d2.4xlarge".asInstanceOf[InstanceType]
  val `d2.8xlarge` = "d2.8xlarge".asInstanceOf[InstanceType]
  val `d3.xlarge` = "d3.xlarge".asInstanceOf[InstanceType]
  val `d3.2xlarge` = "d3.2xlarge".asInstanceOf[InstanceType]
  val `d3.4xlarge` = "d3.4xlarge".asInstanceOf[InstanceType]
  val `d3.8xlarge` = "d3.8xlarge".asInstanceOf[InstanceType]
  val `d3en.xlarge` = "d3en.xlarge".asInstanceOf[InstanceType]
  val `d3en.2xlarge` = "d3en.2xlarge".asInstanceOf[InstanceType]
  val `d3en.4xlarge` = "d3en.4xlarge".asInstanceOf[InstanceType]
  val `d3en.6xlarge` = "d3en.6xlarge".asInstanceOf[InstanceType]
  val `d3en.8xlarge` = "d3en.8xlarge".asInstanceOf[InstanceType]
  val `d3en.12xlarge` = "d3en.12xlarge".asInstanceOf[InstanceType]
  val `dl1.24xlarge` = "dl1.24xlarge".asInstanceOf[InstanceType]
  val `f1.2xlarge` = "f1.2xlarge".asInstanceOf[InstanceType]
  val `f1.4xlarge` = "f1.4xlarge".asInstanceOf[InstanceType]
  val `f1.16xlarge` = "f1.16xlarge".asInstanceOf[InstanceType]
  val `g2.2xlarge` = "g2.2xlarge".asInstanceOf[InstanceType]
  val `g2.8xlarge` = "g2.8xlarge".asInstanceOf[InstanceType]
  val `g3.4xlarge` = "g3.4xlarge".asInstanceOf[InstanceType]
  val `g3.8xlarge` = "g3.8xlarge".asInstanceOf[InstanceType]
  val `g3.16xlarge` = "g3.16xlarge".asInstanceOf[InstanceType]
  val `g3s.xlarge` = "g3s.xlarge".asInstanceOf[InstanceType]
  val `g4ad.xlarge` = "g4ad.xlarge".asInstanceOf[InstanceType]
  val `g4ad.2xlarge` = "g4ad.2xlarge".asInstanceOf[InstanceType]
  val `g4ad.4xlarge` = "g4ad.4xlarge".asInstanceOf[InstanceType]
  val `g4ad.8xlarge` = "g4ad.8xlarge".asInstanceOf[InstanceType]
  val `g4ad.16xlarge` = "g4ad.16xlarge".asInstanceOf[InstanceType]
  val `g4dn.xlarge` = "g4dn.xlarge".asInstanceOf[InstanceType]
  val `g4dn.2xlarge` = "g4dn.2xlarge".asInstanceOf[InstanceType]
  val `g4dn.4xlarge` = "g4dn.4xlarge".asInstanceOf[InstanceType]
  val `g4dn.8xlarge` = "g4dn.8xlarge".asInstanceOf[InstanceType]
  val `g4dn.12xlarge` = "g4dn.12xlarge".asInstanceOf[InstanceType]
  val `g4dn.16xlarge` = "g4dn.16xlarge".asInstanceOf[InstanceType]
  val `g4dn.metal` = "g4dn.metal".asInstanceOf[InstanceType]
  val `g5.xlarge` = "g5.xlarge".asInstanceOf[InstanceType]
  val `g5.2xlarge` = "g5.2xlarge".asInstanceOf[InstanceType]
  val `g5.4xlarge` = "g5.4xlarge".asInstanceOf[InstanceType]
  val `g5.8xlarge` = "g5.8xlarge".asInstanceOf[InstanceType]
  val `g5.12xlarge` = "g5.12xlarge".asInstanceOf[InstanceType]
  val `g5.16xlarge` = "g5.16xlarge".asInstanceOf[InstanceType]
  val `g5.24xlarge` = "g5.24xlarge".asInstanceOf[InstanceType]
  val `g5.48xlarge` = "g5.48xlarge".asInstanceOf[InstanceType]
  val `g5g.xlarge` = "g5g.xlarge".asInstanceOf[InstanceType]
  val `g5g.2xlarge` = "g5g.2xlarge".asInstanceOf[InstanceType]
  val `g5g.4xlarge` = "g5g.4xlarge".asInstanceOf[InstanceType]
  val `g5g.8xlarge` = "g5g.8xlarge".asInstanceOf[InstanceType]
  val `g5g.16xlarge` = "g5g.16xlarge".asInstanceOf[InstanceType]
  val `g5g.metal` = "g5g.metal".asInstanceOf[InstanceType]
  val `hi1.4xlarge` = "hi1.4xlarge".asInstanceOf[InstanceType]
  val `hpc6a.48xlarge` = "hpc6a.48xlarge".asInstanceOf[InstanceType]
  val `hs1.8xlarge` = "hs1.8xlarge".asInstanceOf[InstanceType]
  val `h1.2xlarge` = "h1.2xlarge".asInstanceOf[InstanceType]
  val `h1.4xlarge` = "h1.4xlarge".asInstanceOf[InstanceType]
  val `h1.8xlarge` = "h1.8xlarge".asInstanceOf[InstanceType]
  val `h1.16xlarge` = "h1.16xlarge".asInstanceOf[InstanceType]
  val `i2.xlarge` = "i2.xlarge".asInstanceOf[InstanceType]
  val `i2.2xlarge` = "i2.2xlarge".asInstanceOf[InstanceType]
  val `i2.4xlarge` = "i2.4xlarge".asInstanceOf[InstanceType]
  val `i2.8xlarge` = "i2.8xlarge".asInstanceOf[InstanceType]
  val `i3.large` = "i3.large".asInstanceOf[InstanceType]
  val `i3.xlarge` = "i3.xlarge".asInstanceOf[InstanceType]
  val `i3.2xlarge` = "i3.2xlarge".asInstanceOf[InstanceType]
  val `i3.4xlarge` = "i3.4xlarge".asInstanceOf[InstanceType]
  val `i3.8xlarge` = "i3.8xlarge".asInstanceOf[InstanceType]
  val `i3.16xlarge` = "i3.16xlarge".asInstanceOf[InstanceType]
  val `i3.metal` = "i3.metal".asInstanceOf[InstanceType]
  val `i3en.large` = "i3en.large".asInstanceOf[InstanceType]
  val `i3en.xlarge` = "i3en.xlarge".asInstanceOf[InstanceType]
  val `i3en.2xlarge` = "i3en.2xlarge".asInstanceOf[InstanceType]
  val `i3en.3xlarge` = "i3en.3xlarge".asInstanceOf[InstanceType]
  val `i3en.6xlarge` = "i3en.6xlarge".asInstanceOf[InstanceType]
  val `i3en.12xlarge` = "i3en.12xlarge".asInstanceOf[InstanceType]
  val `i3en.24xlarge` = "i3en.24xlarge".asInstanceOf[InstanceType]
  val `i3en.metal` = "i3en.metal".asInstanceOf[InstanceType]
  val `im4gn.large` = "im4gn.large".asInstanceOf[InstanceType]
  val `im4gn.xlarge` = "im4gn.xlarge".asInstanceOf[InstanceType]
  val `im4gn.2xlarge` = "im4gn.2xlarge".asInstanceOf[InstanceType]
  val `im4gn.4xlarge` = "im4gn.4xlarge".asInstanceOf[InstanceType]
  val `im4gn.8xlarge` = "im4gn.8xlarge".asInstanceOf[InstanceType]
  val `im4gn.16xlarge` = "im4gn.16xlarge".asInstanceOf[InstanceType]
  val `inf1.xlarge` = "inf1.xlarge".asInstanceOf[InstanceType]
  val `inf1.2xlarge` = "inf1.2xlarge".asInstanceOf[InstanceType]
  val `inf1.6xlarge` = "inf1.6xlarge".asInstanceOf[InstanceType]
  val `inf1.24xlarge` = "inf1.24xlarge".asInstanceOf[InstanceType]
  val `is4gen.medium` = "is4gen.medium".asInstanceOf[InstanceType]
  val `is4gen.large` = "is4gen.large".asInstanceOf[InstanceType]
  val `is4gen.xlarge` = "is4gen.xlarge".asInstanceOf[InstanceType]
  val `is4gen.2xlarge` = "is4gen.2xlarge".asInstanceOf[InstanceType]
  val `is4gen.4xlarge` = "is4gen.4xlarge".asInstanceOf[InstanceType]
  val `is4gen.8xlarge` = "is4gen.8xlarge".asInstanceOf[InstanceType]
  val `m1.small` = "m1.small".asInstanceOf[InstanceType]
  val `m1.medium` = "m1.medium".asInstanceOf[InstanceType]
  val `m1.large` = "m1.large".asInstanceOf[InstanceType]
  val `m1.xlarge` = "m1.xlarge".asInstanceOf[InstanceType]
  val `m2.xlarge` = "m2.xlarge".asInstanceOf[InstanceType]
  val `m2.2xlarge` = "m2.2xlarge".asInstanceOf[InstanceType]
  val `m2.4xlarge` = "m2.4xlarge".asInstanceOf[InstanceType]
  val `m3.medium` = "m3.medium".asInstanceOf[InstanceType]
  val `m3.large` = "m3.large".asInstanceOf[InstanceType]
  val `m3.xlarge` = "m3.xlarge".asInstanceOf[InstanceType]
  val `m3.2xlarge` = "m3.2xlarge".asInstanceOf[InstanceType]
  val `m4.large` = "m4.large".asInstanceOf[InstanceType]
  val `m4.xlarge` = "m4.xlarge".asInstanceOf[InstanceType]
  val `m4.2xlarge` = "m4.2xlarge".asInstanceOf[InstanceType]
  val `m4.4xlarge` = "m4.4xlarge".asInstanceOf[InstanceType]
  val `m4.10xlarge` = "m4.10xlarge".asInstanceOf[InstanceType]
  val `m4.16xlarge` = "m4.16xlarge".asInstanceOf[InstanceType]
  val `m5.large` = "m5.large".asInstanceOf[InstanceType]
  val `m5.xlarge` = "m5.xlarge".asInstanceOf[InstanceType]
  val `m5.2xlarge` = "m5.2xlarge".asInstanceOf[InstanceType]
  val `m5.4xlarge` = "m5.4xlarge".asInstanceOf[InstanceType]
  val `m5.8xlarge` = "m5.8xlarge".asInstanceOf[InstanceType]
  val `m5.12xlarge` = "m5.12xlarge".asInstanceOf[InstanceType]
  val `m5.16xlarge` = "m5.16xlarge".asInstanceOf[InstanceType]
  val `m5.24xlarge` = "m5.24xlarge".asInstanceOf[InstanceType]
  val `m5.metal` = "m5.metal".asInstanceOf[InstanceType]
  val `m5a.large` = "m5a.large".asInstanceOf[InstanceType]
  val `m5a.xlarge` = "m5a.xlarge".asInstanceOf[InstanceType]
  val `m5a.2xlarge` = "m5a.2xlarge".asInstanceOf[InstanceType]
  val `m5a.4xlarge` = "m5a.4xlarge".asInstanceOf[InstanceType]
  val `m5a.8xlarge` = "m5a.8xlarge".asInstanceOf[InstanceType]
  val `m5a.12xlarge` = "m5a.12xlarge".asInstanceOf[InstanceType]
  val `m5a.16xlarge` = "m5a.16xlarge".asInstanceOf[InstanceType]
  val `m5a.24xlarge` = "m5a.24xlarge".asInstanceOf[InstanceType]
  val `m5ad.large` = "m5ad.large".asInstanceOf[InstanceType]
  val `m5ad.xlarge` = "m5ad.xlarge".asInstanceOf[InstanceType]
  val `m5ad.2xlarge` = "m5ad.2xlarge".asInstanceOf[InstanceType]
  val `m5ad.4xlarge` = "m5ad.4xlarge".asInstanceOf[InstanceType]
  val `m5ad.8xlarge` = "m5ad.8xlarge".asInstanceOf[InstanceType]
  val `m5ad.12xlarge` = "m5ad.12xlarge".asInstanceOf[InstanceType]
  val `m5ad.16xlarge` = "m5ad.16xlarge".asInstanceOf[InstanceType]
  val `m5ad.24xlarge` = "m5ad.24xlarge".asInstanceOf[InstanceType]
  val `m5d.large` = "m5d.large".asInstanceOf[InstanceType]
  val `m5d.xlarge` = "m5d.xlarge".asInstanceOf[InstanceType]
  val `m5d.2xlarge` = "m5d.2xlarge".asInstanceOf[InstanceType]
  val `m5d.4xlarge` = "m5d.4xlarge".asInstanceOf[InstanceType]
  val `m5d.8xlarge` = "m5d.8xlarge".asInstanceOf[InstanceType]
  val `m5d.12xlarge` = "m5d.12xlarge".asInstanceOf[InstanceType]
  val `m5d.16xlarge` = "m5d.16xlarge".asInstanceOf[InstanceType]
  val `m5d.24xlarge` = "m5d.24xlarge".asInstanceOf[InstanceType]
  val `m5d.metal` = "m5d.metal".asInstanceOf[InstanceType]
  val `m5dn.large` = "m5dn.large".asInstanceOf[InstanceType]
  val `m5dn.xlarge` = "m5dn.xlarge".asInstanceOf[InstanceType]
  val `m5dn.2xlarge` = "m5dn.2xlarge".asInstanceOf[InstanceType]
  val `m5dn.4xlarge` = "m5dn.4xlarge".asInstanceOf[InstanceType]
  val `m5dn.8xlarge` = "m5dn.8xlarge".asInstanceOf[InstanceType]
  val `m5dn.12xlarge` = "m5dn.12xlarge".asInstanceOf[InstanceType]
  val `m5dn.16xlarge` = "m5dn.16xlarge".asInstanceOf[InstanceType]
  val `m5dn.24xlarge` = "m5dn.24xlarge".asInstanceOf[InstanceType]
  val `m5dn.metal` = "m5dn.metal".asInstanceOf[InstanceType]
  val `m5n.large` = "m5n.large".asInstanceOf[InstanceType]
  val `m5n.xlarge` = "m5n.xlarge".asInstanceOf[InstanceType]
  val `m5n.2xlarge` = "m5n.2xlarge".asInstanceOf[InstanceType]
  val `m5n.4xlarge` = "m5n.4xlarge".asInstanceOf[InstanceType]
  val `m5n.8xlarge` = "m5n.8xlarge".asInstanceOf[InstanceType]
  val `m5n.12xlarge` = "m5n.12xlarge".asInstanceOf[InstanceType]
  val `m5n.16xlarge` = "m5n.16xlarge".asInstanceOf[InstanceType]
  val `m5n.24xlarge` = "m5n.24xlarge".asInstanceOf[InstanceType]
  val `m5n.metal` = "m5n.metal".asInstanceOf[InstanceType]
  val `m5zn.large` = "m5zn.large".asInstanceOf[InstanceType]
  val `m5zn.xlarge` = "m5zn.xlarge".asInstanceOf[InstanceType]
  val `m5zn.2xlarge` = "m5zn.2xlarge".asInstanceOf[InstanceType]
  val `m5zn.3xlarge` = "m5zn.3xlarge".asInstanceOf[InstanceType]
  val `m5zn.6xlarge` = "m5zn.6xlarge".asInstanceOf[InstanceType]
  val `m5zn.12xlarge` = "m5zn.12xlarge".asInstanceOf[InstanceType]
  val `m5zn.metal` = "m5zn.metal".asInstanceOf[InstanceType]
  val `m6a.large` = "m6a.large".asInstanceOf[InstanceType]
  val `m6a.xlarge` = "m6a.xlarge".asInstanceOf[InstanceType]
  val `m6a.2xlarge` = "m6a.2xlarge".asInstanceOf[InstanceType]
  val `m6a.4xlarge` = "m6a.4xlarge".asInstanceOf[InstanceType]
  val `m6a.8xlarge` = "m6a.8xlarge".asInstanceOf[InstanceType]
  val `m6a.12xlarge` = "m6a.12xlarge".asInstanceOf[InstanceType]
  val `m6a.16xlarge` = "m6a.16xlarge".asInstanceOf[InstanceType]
  val `m6a.24xlarge` = "m6a.24xlarge".asInstanceOf[InstanceType]
  val `m6a.32xlarge` = "m6a.32xlarge".asInstanceOf[InstanceType]
  val `m6a.48xlarge` = "m6a.48xlarge".asInstanceOf[InstanceType]
  val `m6g.metal` = "m6g.metal".asInstanceOf[InstanceType]
  val `m6g.medium` = "m6g.medium".asInstanceOf[InstanceType]
  val `m6g.large` = "m6g.large".asInstanceOf[InstanceType]
  val `m6g.xlarge` = "m6g.xlarge".asInstanceOf[InstanceType]
  val `m6g.2xlarge` = "m6g.2xlarge".asInstanceOf[InstanceType]
  val `m6g.4xlarge` = "m6g.4xlarge".asInstanceOf[InstanceType]
  val `m6g.8xlarge` = "m6g.8xlarge".asInstanceOf[InstanceType]
  val `m6g.12xlarge` = "m6g.12xlarge".asInstanceOf[InstanceType]
  val `m6g.16xlarge` = "m6g.16xlarge".asInstanceOf[InstanceType]
  val `m6gd.metal` = "m6gd.metal".asInstanceOf[InstanceType]
  val `m6gd.medium` = "m6gd.medium".asInstanceOf[InstanceType]
  val `m6gd.large` = "m6gd.large".asInstanceOf[InstanceType]
  val `m6gd.xlarge` = "m6gd.xlarge".asInstanceOf[InstanceType]
  val `m6gd.2xlarge` = "m6gd.2xlarge".asInstanceOf[InstanceType]
  val `m6gd.4xlarge` = "m6gd.4xlarge".asInstanceOf[InstanceType]
  val `m6gd.8xlarge` = "m6gd.8xlarge".asInstanceOf[InstanceType]
  val `m6gd.12xlarge` = "m6gd.12xlarge".asInstanceOf[InstanceType]
  val `m6gd.16xlarge` = "m6gd.16xlarge".asInstanceOf[InstanceType]
  val `m6i.large` = "m6i.large".asInstanceOf[InstanceType]
  val `m6i.xlarge` = "m6i.xlarge".asInstanceOf[InstanceType]
  val `m6i.2xlarge` = "m6i.2xlarge".asInstanceOf[InstanceType]
  val `m6i.4xlarge` = "m6i.4xlarge".asInstanceOf[InstanceType]
  val `m6i.8xlarge` = "m6i.8xlarge".asInstanceOf[InstanceType]
  val `m6i.12xlarge` = "m6i.12xlarge".asInstanceOf[InstanceType]
  val `m6i.16xlarge` = "m6i.16xlarge".asInstanceOf[InstanceType]
  val `m6i.24xlarge` = "m6i.24xlarge".asInstanceOf[InstanceType]
  val `m6i.32xlarge` = "m6i.32xlarge".asInstanceOf[InstanceType]
  val `m6i.metal` = "m6i.metal".asInstanceOf[InstanceType]
  val `mac1.metal` = "mac1.metal".asInstanceOf[InstanceType]
  val `p2.xlarge` = "p2.xlarge".asInstanceOf[InstanceType]
  val `p2.8xlarge` = "p2.8xlarge".asInstanceOf[InstanceType]
  val `p2.16xlarge` = "p2.16xlarge".asInstanceOf[InstanceType]
  val `p3.2xlarge` = "p3.2xlarge".asInstanceOf[InstanceType]
  val `p3.8xlarge` = "p3.8xlarge".asInstanceOf[InstanceType]
  val `p3.16xlarge` = "p3.16xlarge".asInstanceOf[InstanceType]
  val `p3dn.24xlarge` = "p3dn.24xlarge".asInstanceOf[InstanceType]
  val `p4d.24xlarge` = "p4d.24xlarge".asInstanceOf[InstanceType]
  val `r3.large` = "r3.large".asInstanceOf[InstanceType]
  val `r3.xlarge` = "r3.xlarge".asInstanceOf[InstanceType]
  val `r3.2xlarge` = "r3.2xlarge".asInstanceOf[InstanceType]
  val `r3.4xlarge` = "r3.4xlarge".asInstanceOf[InstanceType]
  val `r3.8xlarge` = "r3.8xlarge".asInstanceOf[InstanceType]
  val `r4.large` = "r4.large".asInstanceOf[InstanceType]
  val `r4.xlarge` = "r4.xlarge".asInstanceOf[InstanceType]
  val `r4.2xlarge` = "r4.2xlarge".asInstanceOf[InstanceType]
  val `r4.4xlarge` = "r4.4xlarge".asInstanceOf[InstanceType]
  val `r4.8xlarge` = "r4.8xlarge".asInstanceOf[InstanceType]
  val `r4.16xlarge` = "r4.16xlarge".asInstanceOf[InstanceType]
  val `r5.large` = "r5.large".asInstanceOf[InstanceType]
  val `r5.xlarge` = "r5.xlarge".asInstanceOf[InstanceType]
  val `r5.2xlarge` = "r5.2xlarge".asInstanceOf[InstanceType]
  val `r5.4xlarge` = "r5.4xlarge".asInstanceOf[InstanceType]
  val `r5.8xlarge` = "r5.8xlarge".asInstanceOf[InstanceType]
  val `r5.12xlarge` = "r5.12xlarge".asInstanceOf[InstanceType]
  val `r5.16xlarge` = "r5.16xlarge".asInstanceOf[InstanceType]
  val `r5.24xlarge` = "r5.24xlarge".asInstanceOf[InstanceType]
  val `r5.metal` = "r5.metal".asInstanceOf[InstanceType]
  val `r5a.large` = "r5a.large".asInstanceOf[InstanceType]
  val `r5a.xlarge` = "r5a.xlarge".asInstanceOf[InstanceType]
  val `r5a.2xlarge` = "r5a.2xlarge".asInstanceOf[InstanceType]
  val `r5a.4xlarge` = "r5a.4xlarge".asInstanceOf[InstanceType]
  val `r5a.8xlarge` = "r5a.8xlarge".asInstanceOf[InstanceType]
  val `r5a.12xlarge` = "r5a.12xlarge".asInstanceOf[InstanceType]
  val `r5a.16xlarge` = "r5a.16xlarge".asInstanceOf[InstanceType]
  val `r5a.24xlarge` = "r5a.24xlarge".asInstanceOf[InstanceType]
  val `r5ad.large` = "r5ad.large".asInstanceOf[InstanceType]
  val `r5ad.xlarge` = "r5ad.xlarge".asInstanceOf[InstanceType]
  val `r5ad.2xlarge` = "r5ad.2xlarge".asInstanceOf[InstanceType]
  val `r5ad.4xlarge` = "r5ad.4xlarge".asInstanceOf[InstanceType]
  val `r5ad.8xlarge` = "r5ad.8xlarge".asInstanceOf[InstanceType]
  val `r5ad.12xlarge` = "r5ad.12xlarge".asInstanceOf[InstanceType]
  val `r5ad.16xlarge` = "r5ad.16xlarge".asInstanceOf[InstanceType]
  val `r5ad.24xlarge` = "r5ad.24xlarge".asInstanceOf[InstanceType]
  val `r5b.large` = "r5b.large".asInstanceOf[InstanceType]
  val `r5b.xlarge` = "r5b.xlarge".asInstanceOf[InstanceType]
  val `r5b.2xlarge` = "r5b.2xlarge".asInstanceOf[InstanceType]
  val `r5b.4xlarge` = "r5b.4xlarge".asInstanceOf[InstanceType]
  val `r5b.8xlarge` = "r5b.8xlarge".asInstanceOf[InstanceType]
  val `r5b.12xlarge` = "r5b.12xlarge".asInstanceOf[InstanceType]
  val `r5b.16xlarge` = "r5b.16xlarge".asInstanceOf[InstanceType]
  val `r5b.24xlarge` = "r5b.24xlarge".asInstanceOf[InstanceType]
  val `r5b.metal` = "r5b.metal".asInstanceOf[InstanceType]
  val `r5d.large` = "r5d.large".asInstanceOf[InstanceType]
  val `r5d.xlarge` = "r5d.xlarge".asInstanceOf[InstanceType]
  val `r5d.2xlarge` = "r5d.2xlarge".asInstanceOf[InstanceType]
  val `r5d.4xlarge` = "r5d.4xlarge".asInstanceOf[InstanceType]
  val `r5d.8xlarge` = "r5d.8xlarge".asInstanceOf[InstanceType]
  val `r5d.12xlarge` = "r5d.12xlarge".asInstanceOf[InstanceType]
  val `r5d.16xlarge` = "r5d.16xlarge".asInstanceOf[InstanceType]
  val `r5d.24xlarge` = "r5d.24xlarge".asInstanceOf[InstanceType]
  val `r5d.metal` = "r5d.metal".asInstanceOf[InstanceType]
  val `r5dn.large` = "r5dn.large".asInstanceOf[InstanceType]
  val `r5dn.xlarge` = "r5dn.xlarge".asInstanceOf[InstanceType]
  val `r5dn.2xlarge` = "r5dn.2xlarge".asInstanceOf[InstanceType]
  val `r5dn.4xlarge` = "r5dn.4xlarge".asInstanceOf[InstanceType]
  val `r5dn.8xlarge` = "r5dn.8xlarge".asInstanceOf[InstanceType]
  val `r5dn.12xlarge` = "r5dn.12xlarge".asInstanceOf[InstanceType]
  val `r5dn.16xlarge` = "r5dn.16xlarge".asInstanceOf[InstanceType]
  val `r5dn.24xlarge` = "r5dn.24xlarge".asInstanceOf[InstanceType]
  val `r5dn.metal` = "r5dn.metal".asInstanceOf[InstanceType]
  val `r5n.large` = "r5n.large".asInstanceOf[InstanceType]
  val `r5n.xlarge` = "r5n.xlarge".asInstanceOf[InstanceType]
  val `r5n.2xlarge` = "r5n.2xlarge".asInstanceOf[InstanceType]
  val `r5n.4xlarge` = "r5n.4xlarge".asInstanceOf[InstanceType]
  val `r5n.8xlarge` = "r5n.8xlarge".asInstanceOf[InstanceType]
  val `r5n.12xlarge` = "r5n.12xlarge".asInstanceOf[InstanceType]
  val `r5n.16xlarge` = "r5n.16xlarge".asInstanceOf[InstanceType]
  val `r5n.24xlarge` = "r5n.24xlarge".asInstanceOf[InstanceType]
  val `r5n.metal` = "r5n.metal".asInstanceOf[InstanceType]
  val `r6g.medium` = "r6g.medium".asInstanceOf[InstanceType]
  val `r6g.large` = "r6g.large".asInstanceOf[InstanceType]
  val `r6g.xlarge` = "r6g.xlarge".asInstanceOf[InstanceType]
  val `r6g.2xlarge` = "r6g.2xlarge".asInstanceOf[InstanceType]
  val `r6g.4xlarge` = "r6g.4xlarge".asInstanceOf[InstanceType]
  val `r6g.8xlarge` = "r6g.8xlarge".asInstanceOf[InstanceType]
  val `r6g.12xlarge` = "r6g.12xlarge".asInstanceOf[InstanceType]
  val `r6g.16xlarge` = "r6g.16xlarge".asInstanceOf[InstanceType]
  val `r6g.metal` = "r6g.metal".asInstanceOf[InstanceType]
  val `r6gd.medium` = "r6gd.medium".asInstanceOf[InstanceType]
  val `r6gd.large` = "r6gd.large".asInstanceOf[InstanceType]
  val `r6gd.xlarge` = "r6gd.xlarge".asInstanceOf[InstanceType]
  val `r6gd.2xlarge` = "r6gd.2xlarge".asInstanceOf[InstanceType]
  val `r6gd.4xlarge` = "r6gd.4xlarge".asInstanceOf[InstanceType]
  val `r6gd.8xlarge` = "r6gd.8xlarge".asInstanceOf[InstanceType]
  val `r6gd.12xlarge` = "r6gd.12xlarge".asInstanceOf[InstanceType]
  val `r6gd.16xlarge` = "r6gd.16xlarge".asInstanceOf[InstanceType]
  val `r6gd.metal` = "r6gd.metal".asInstanceOf[InstanceType]
  val `r6i.large` = "r6i.large".asInstanceOf[InstanceType]
  val `r6i.xlarge` = "r6i.xlarge".asInstanceOf[InstanceType]
  val `r6i.2xlarge` = "r6i.2xlarge".asInstanceOf[InstanceType]
  val `r6i.4xlarge` = "r6i.4xlarge".asInstanceOf[InstanceType]
  val `r6i.8xlarge` = "r6i.8xlarge".asInstanceOf[InstanceType]
  val `r6i.12xlarge` = "r6i.12xlarge".asInstanceOf[InstanceType]
  val `r6i.16xlarge` = "r6i.16xlarge".asInstanceOf[InstanceType]
  val `r6i.24xlarge` = "r6i.24xlarge".asInstanceOf[InstanceType]
  val `r6i.32xlarge` = "r6i.32xlarge".asInstanceOf[InstanceType]
  val `r6i.metal` = "r6i.metal".asInstanceOf[InstanceType]
  val `t1.micro` = "t1.micro".asInstanceOf[InstanceType]
  val `t2.nano` = "t2.nano".asInstanceOf[InstanceType]
  val `t2.micro` = "t2.micro".asInstanceOf[InstanceType]
  val `t2.small` = "t2.small".asInstanceOf[InstanceType]
  val `t2.medium` = "t2.medium".asInstanceOf[InstanceType]
  val `t2.large` = "t2.large".asInstanceOf[InstanceType]
  val `t2.xlarge` = "t2.xlarge".asInstanceOf[InstanceType]
  val `t2.2xlarge` = "t2.2xlarge".asInstanceOf[InstanceType]
  val `t3.nano` = "t3.nano".asInstanceOf[InstanceType]
  val `t3.micro` = "t3.micro".asInstanceOf[InstanceType]
  val `t3.small` = "t3.small".asInstanceOf[InstanceType]
  val `t3.medium` = "t3.medium".asInstanceOf[InstanceType]
  val `t3.large` = "t3.large".asInstanceOf[InstanceType]
  val `t3.xlarge` = "t3.xlarge".asInstanceOf[InstanceType]
  val `t3.2xlarge` = "t3.2xlarge".asInstanceOf[InstanceType]
  val `t3a.nano` = "t3a.nano".asInstanceOf[InstanceType]
  val `t3a.micro` = "t3a.micro".asInstanceOf[InstanceType]
  val `t3a.small` = "t3a.small".asInstanceOf[InstanceType]
  val `t3a.medium` = "t3a.medium".asInstanceOf[InstanceType]
  val `t3a.large` = "t3a.large".asInstanceOf[InstanceType]
  val `t3a.xlarge` = "t3a.xlarge".asInstanceOf[InstanceType]
  val `t3a.2xlarge` = "t3a.2xlarge".asInstanceOf[InstanceType]
  val `t4g.nano` = "t4g.nano".asInstanceOf[InstanceType]
  val `t4g.micro` = "t4g.micro".asInstanceOf[InstanceType]
  val `t4g.small` = "t4g.small".asInstanceOf[InstanceType]
  val `t4g.medium` = "t4g.medium".asInstanceOf[InstanceType]
  val `t4g.large` = "t4g.large".asInstanceOf[InstanceType]
  val `t4g.xlarge` = "t4g.xlarge".asInstanceOf[InstanceType]
  val `t4g.2xlarge` = "t4g.2xlarge".asInstanceOf[InstanceType]
  val `u-6tb1.56xlarge` = "u-6tb1.56xlarge".asInstanceOf[InstanceType]
  val `u-6tb1.112xlarge` = "u-6tb1.112xlarge".asInstanceOf[InstanceType]
  val `u-9tb1.112xlarge` = "u-9tb1.112xlarge".asInstanceOf[InstanceType]
  val `u-12tb1.112xlarge` = "u-12tb1.112xlarge".asInstanceOf[InstanceType]
  val `u-6tb1.metal` = "u-6tb1.metal".asInstanceOf[InstanceType]
  val `u-9tb1.metal` = "u-9tb1.metal".asInstanceOf[InstanceType]
  val `u-12tb1.metal` = "u-12tb1.metal".asInstanceOf[InstanceType]
  val `u-18tb1.metal` = "u-18tb1.metal".asInstanceOf[InstanceType]
  val `u-24tb1.metal` = "u-24tb1.metal".asInstanceOf[InstanceType]
  val `vt1.3xlarge` = "vt1.3xlarge".asInstanceOf[InstanceType]
  val `vt1.6xlarge` = "vt1.6xlarge".asInstanceOf[InstanceType]
  val `vt1.24xlarge` = "vt1.24xlarge".asInstanceOf[InstanceType]
  val `x1.16xlarge` = "x1.16xlarge".asInstanceOf[InstanceType]
  val `x1.32xlarge` = "x1.32xlarge".asInstanceOf[InstanceType]
  val `x1e.xlarge` = "x1e.xlarge".asInstanceOf[InstanceType]
  val `x1e.2xlarge` = "x1e.2xlarge".asInstanceOf[InstanceType]
  val `x1e.4xlarge` = "x1e.4xlarge".asInstanceOf[InstanceType]
  val `x1e.8xlarge` = "x1e.8xlarge".asInstanceOf[InstanceType]
  val `x1e.16xlarge` = "x1e.16xlarge".asInstanceOf[InstanceType]
  val `x1e.32xlarge` = "x1e.32xlarge".asInstanceOf[InstanceType]
  val `x2iezn.2xlarge` = "x2iezn.2xlarge".asInstanceOf[InstanceType]
  val `x2iezn.4xlarge` = "x2iezn.4xlarge".asInstanceOf[InstanceType]
  val `x2iezn.6xlarge` = "x2iezn.6xlarge".asInstanceOf[InstanceType]
  val `x2iezn.8xlarge` = "x2iezn.8xlarge".asInstanceOf[InstanceType]
  val `x2iezn.12xlarge` = "x2iezn.12xlarge".asInstanceOf[InstanceType]
  val `x2iezn.metal` = "x2iezn.metal".asInstanceOf[InstanceType]
  val `x2gd.medium` = "x2gd.medium".asInstanceOf[InstanceType]
  val `x2gd.large` = "x2gd.large".asInstanceOf[InstanceType]
  val `x2gd.xlarge` = "x2gd.xlarge".asInstanceOf[InstanceType]
  val `x2gd.2xlarge` = "x2gd.2xlarge".asInstanceOf[InstanceType]
  val `x2gd.4xlarge` = "x2gd.4xlarge".asInstanceOf[InstanceType]
  val `x2gd.8xlarge` = "x2gd.8xlarge".asInstanceOf[InstanceType]
  val `x2gd.12xlarge` = "x2gd.12xlarge".asInstanceOf[InstanceType]
  val `x2gd.16xlarge` = "x2gd.16xlarge".asInstanceOf[InstanceType]
  val `x2gd.metal` = "x2gd.metal".asInstanceOf[InstanceType]
  val `z1d.large` = "z1d.large".asInstanceOf[InstanceType]
  val `z1d.xlarge` = "z1d.xlarge".asInstanceOf[InstanceType]
  val `z1d.2xlarge` = "z1d.2xlarge".asInstanceOf[InstanceType]
  val `z1d.3xlarge` = "z1d.3xlarge".asInstanceOf[InstanceType]
  val `z1d.6xlarge` = "z1d.6xlarge".asInstanceOf[InstanceType]
  val `z1d.12xlarge` = "z1d.12xlarge".asInstanceOf[InstanceType]
  val `z1d.metal` = "z1d.metal".asInstanceOf[InstanceType]
  val `x2idn.16xlarge` = "x2idn.16xlarge".asInstanceOf[InstanceType]
  val `x2idn.24xlarge` = "x2idn.24xlarge".asInstanceOf[InstanceType]
  val `x2idn.32xlarge` = "x2idn.32xlarge".asInstanceOf[InstanceType]
  val `x2iedn.xlarge` = "x2iedn.xlarge".asInstanceOf[InstanceType]
  val `x2iedn.2xlarge` = "x2iedn.2xlarge".asInstanceOf[InstanceType]
  val `x2iedn.4xlarge` = "x2iedn.4xlarge".asInstanceOf[InstanceType]
  val `x2iedn.8xlarge` = "x2iedn.8xlarge".asInstanceOf[InstanceType]
  val `x2iedn.16xlarge` = "x2iedn.16xlarge".asInstanceOf[InstanceType]
  val `x2iedn.24xlarge` = "x2iedn.24xlarge".asInstanceOf[InstanceType]
  val `x2iedn.32xlarge` = "x2iedn.32xlarge".asInstanceOf[InstanceType]
  val `c6a.large` = "c6a.large".asInstanceOf[InstanceType]
  val `c6a.xlarge` = "c6a.xlarge".asInstanceOf[InstanceType]
  val `c6a.2xlarge` = "c6a.2xlarge".asInstanceOf[InstanceType]
  val `c6a.4xlarge` = "c6a.4xlarge".asInstanceOf[InstanceType]
  val `c6a.8xlarge` = "c6a.8xlarge".asInstanceOf[InstanceType]
  val `c6a.12xlarge` = "c6a.12xlarge".asInstanceOf[InstanceType]
  val `c6a.16xlarge` = "c6a.16xlarge".asInstanceOf[InstanceType]
  val `c6a.24xlarge` = "c6a.24xlarge".asInstanceOf[InstanceType]
  val `c6a.32xlarge` = "c6a.32xlarge".asInstanceOf[InstanceType]
  val `c6a.48xlarge` = "c6a.48xlarge".asInstanceOf[InstanceType]
  val `c6a.metal` = "c6a.metal".asInstanceOf[InstanceType]
  val `m6a.metal` = "m6a.metal".asInstanceOf[InstanceType]
  val `i4i.large` = "i4i.large".asInstanceOf[InstanceType]
  val `i4i.xlarge` = "i4i.xlarge".asInstanceOf[InstanceType]
  val `i4i.2xlarge` = "i4i.2xlarge".asInstanceOf[InstanceType]
  val `i4i.4xlarge` = "i4i.4xlarge".asInstanceOf[InstanceType]
  val `i4i.8xlarge` = "i4i.8xlarge".asInstanceOf[InstanceType]
  val `i4i.16xlarge` = "i4i.16xlarge".asInstanceOf[InstanceType]
  val `i4i.32xlarge` = "i4i.32xlarge".asInstanceOf[InstanceType]
  val `i4i.metal` = "i4i.metal".asInstanceOf[InstanceType]
  val `x2idn.metal` = "x2idn.metal".asInstanceOf[InstanceType]
  val `x2iedn.metal` = "x2iedn.metal".asInstanceOf[InstanceType]
  val `c7g.medium` = "c7g.medium".asInstanceOf[InstanceType]
  val `c7g.large` = "c7g.large".asInstanceOf[InstanceType]
  val `c7g.xlarge` = "c7g.xlarge".asInstanceOf[InstanceType]
  val `c7g.2xlarge` = "c7g.2xlarge".asInstanceOf[InstanceType]
  val `c7g.4xlarge` = "c7g.4xlarge".asInstanceOf[InstanceType]
  val `c7g.8xlarge` = "c7g.8xlarge".asInstanceOf[InstanceType]
  val `c7g.12xlarge` = "c7g.12xlarge".asInstanceOf[InstanceType]
  val `c7g.16xlarge` = "c7g.16xlarge".asInstanceOf[InstanceType]
  val `mac2.metal` = "mac2.metal".asInstanceOf[InstanceType]
  val `c6id.large` = "c6id.large".asInstanceOf[InstanceType]
  val `c6id.xlarge` = "c6id.xlarge".asInstanceOf[InstanceType]
  val `c6id.2xlarge` = "c6id.2xlarge".asInstanceOf[InstanceType]
  val `c6id.4xlarge` = "c6id.4xlarge".asInstanceOf[InstanceType]
  val `c6id.8xlarge` = "c6id.8xlarge".asInstanceOf[InstanceType]
  val `c6id.12xlarge` = "c6id.12xlarge".asInstanceOf[InstanceType]
  val `c6id.16xlarge` = "c6id.16xlarge".asInstanceOf[InstanceType]
  val `c6id.24xlarge` = "c6id.24xlarge".asInstanceOf[InstanceType]
  val `c6id.32xlarge` = "c6id.32xlarge".asInstanceOf[InstanceType]
  val `c6id.metal` = "c6id.metal".asInstanceOf[InstanceType]
  val `m6id.large` = "m6id.large".asInstanceOf[InstanceType]
  val `m6id.xlarge` = "m6id.xlarge".asInstanceOf[InstanceType]
  val `m6id.2xlarge` = "m6id.2xlarge".asInstanceOf[InstanceType]
  val `m6id.4xlarge` = "m6id.4xlarge".asInstanceOf[InstanceType]
  val `m6id.8xlarge` = "m6id.8xlarge".asInstanceOf[InstanceType]
  val `m6id.12xlarge` = "m6id.12xlarge".asInstanceOf[InstanceType]
  val `m6id.16xlarge` = "m6id.16xlarge".asInstanceOf[InstanceType]
  val `m6id.24xlarge` = "m6id.24xlarge".asInstanceOf[InstanceType]
  val `m6id.32xlarge` = "m6id.32xlarge".asInstanceOf[InstanceType]
  val `m6id.metal` = "m6id.metal".asInstanceOf[InstanceType]
  val `r6id.large` = "r6id.large".asInstanceOf[InstanceType]
  val `r6id.xlarge` = "r6id.xlarge".asInstanceOf[InstanceType]
  val `r6id.2xlarge` = "r6id.2xlarge".asInstanceOf[InstanceType]
  val `r6id.4xlarge` = "r6id.4xlarge".asInstanceOf[InstanceType]
  val `r6id.8xlarge` = "r6id.8xlarge".asInstanceOf[InstanceType]
  val `r6id.12xlarge` = "r6id.12xlarge".asInstanceOf[InstanceType]
  val `r6id.16xlarge` = "r6id.16xlarge".asInstanceOf[InstanceType]
  val `r6id.24xlarge` = "r6id.24xlarge".asInstanceOf[InstanceType]
  val `r6id.32xlarge` = "r6id.32xlarge".asInstanceOf[InstanceType]
  val `r6id.metal` = "r6id.metal".asInstanceOf[InstanceType]
  val `r6a.large` = "r6a.large".asInstanceOf[InstanceType]
  val `r6a.xlarge` = "r6a.xlarge".asInstanceOf[InstanceType]
  val `r6a.2xlarge` = "r6a.2xlarge".asInstanceOf[InstanceType]
  val `r6a.4xlarge` = "r6a.4xlarge".asInstanceOf[InstanceType]
  val `r6a.8xlarge` = "r6a.8xlarge".asInstanceOf[InstanceType]
  val `r6a.12xlarge` = "r6a.12xlarge".asInstanceOf[InstanceType]
  val `r6a.16xlarge` = "r6a.16xlarge".asInstanceOf[InstanceType]
  val `r6a.24xlarge` = "r6a.24xlarge".asInstanceOf[InstanceType]
  val `r6a.32xlarge` = "r6a.32xlarge".asInstanceOf[InstanceType]
  val `r6a.48xlarge` = "r6a.48xlarge".asInstanceOf[InstanceType]
  val `r6a.metal` = "r6a.metal".asInstanceOf[InstanceType]
  val `p4de.24xlarge` = "p4de.24xlarge".asInstanceOf[InstanceType]
  val `u-3tb1.56xlarge` = "u-3tb1.56xlarge".asInstanceOf[InstanceType]
  val `u-18tb1.112xlarge` = "u-18tb1.112xlarge".asInstanceOf[InstanceType]
  val `u-24tb1.112xlarge` = "u-24tb1.112xlarge".asInstanceOf[InstanceType]
  val `trn1.2xlarge` = "trn1.2xlarge".asInstanceOf[InstanceType]
  val `trn1.32xlarge` = "trn1.32xlarge".asInstanceOf[InstanceType]
  val `hpc6id.32xlarge` = "hpc6id.32xlarge".asInstanceOf[InstanceType]

  @inline def values: js.Array[InstanceType] = js.Array(
    `a1.medium`,
    `a1.large`,
    `a1.xlarge`,
    `a1.2xlarge`,
    `a1.4xlarge`,
    `a1.metal`,
    `c1.medium`,
    `c1.xlarge`,
    `c3.large`,
    `c3.xlarge`,
    `c3.2xlarge`,
    `c3.4xlarge`,
    `c3.8xlarge`,
    `c4.large`,
    `c4.xlarge`,
    `c4.2xlarge`,
    `c4.4xlarge`,
    `c4.8xlarge`,
    `c5.large`,
    `c5.xlarge`,
    `c5.2xlarge`,
    `c5.4xlarge`,
    `c5.9xlarge`,
    `c5.12xlarge`,
    `c5.18xlarge`,
    `c5.24xlarge`,
    `c5.metal`,
    `c5a.large`,
    `c5a.xlarge`,
    `c5a.2xlarge`,
    `c5a.4xlarge`,
    `c5a.8xlarge`,
    `c5a.12xlarge`,
    `c5a.16xlarge`,
    `c5a.24xlarge`,
    `c5ad.large`,
    `c5ad.xlarge`,
    `c5ad.2xlarge`,
    `c5ad.4xlarge`,
    `c5ad.8xlarge`,
    `c5ad.12xlarge`,
    `c5ad.16xlarge`,
    `c5ad.24xlarge`,
    `c5d.large`,
    `c5d.xlarge`,
    `c5d.2xlarge`,
    `c5d.4xlarge`,
    `c5d.9xlarge`,
    `c5d.12xlarge`,
    `c5d.18xlarge`,
    `c5d.24xlarge`,
    `c5d.metal`,
    `c5n.large`,
    `c5n.xlarge`,
    `c5n.2xlarge`,
    `c5n.4xlarge`,
    `c5n.9xlarge`,
    `c5n.18xlarge`,
    `c5n.metal`,
    `c6g.medium`,
    `c6g.large`,
    `c6g.xlarge`,
    `c6g.2xlarge`,
    `c6g.4xlarge`,
    `c6g.8xlarge`,
    `c6g.12xlarge`,
    `c6g.16xlarge`,
    `c6g.metal`,
    `c6gd.medium`,
    `c6gd.large`,
    `c6gd.xlarge`,
    `c6gd.2xlarge`,
    `c6gd.4xlarge`,
    `c6gd.8xlarge`,
    `c6gd.12xlarge`,
    `c6gd.16xlarge`,
    `c6gd.metal`,
    `c6gn.medium`,
    `c6gn.large`,
    `c6gn.xlarge`,
    `c6gn.2xlarge`,
    `c6gn.4xlarge`,
    `c6gn.8xlarge`,
    `c6gn.12xlarge`,
    `c6gn.16xlarge`,
    `c6i.large`,
    `c6i.xlarge`,
    `c6i.2xlarge`,
    `c6i.4xlarge`,
    `c6i.8xlarge`,
    `c6i.12xlarge`,
    `c6i.16xlarge`,
    `c6i.24xlarge`,
    `c6i.32xlarge`,
    `c6i.metal`,
    `cc1.4xlarge`,
    `cc2.8xlarge`,
    `cg1.4xlarge`,
    `cr1.8xlarge`,
    `d2.xlarge`,
    `d2.2xlarge`,
    `d2.4xlarge`,
    `d2.8xlarge`,
    `d3.xlarge`,
    `d3.2xlarge`,
    `d3.4xlarge`,
    `d3.8xlarge`,
    `d3en.xlarge`,
    `d3en.2xlarge`,
    `d3en.4xlarge`,
    `d3en.6xlarge`,
    `d3en.8xlarge`,
    `d3en.12xlarge`,
    `dl1.24xlarge`,
    `f1.2xlarge`,
    `f1.4xlarge`,
    `f1.16xlarge`,
    `g2.2xlarge`,
    `g2.8xlarge`,
    `g3.4xlarge`,
    `g3.8xlarge`,
    `g3.16xlarge`,
    `g3s.xlarge`,
    `g4ad.xlarge`,
    `g4ad.2xlarge`,
    `g4ad.4xlarge`,
    `g4ad.8xlarge`,
    `g4ad.16xlarge`,
    `g4dn.xlarge`,
    `g4dn.2xlarge`,
    `g4dn.4xlarge`,
    `g4dn.8xlarge`,
    `g4dn.12xlarge`,
    `g4dn.16xlarge`,
    `g4dn.metal`,
    `g5.xlarge`,
    `g5.2xlarge`,
    `g5.4xlarge`,
    `g5.8xlarge`,
    `g5.12xlarge`,
    `g5.16xlarge`,
    `g5.24xlarge`,
    `g5.48xlarge`,
    `g5g.xlarge`,
    `g5g.2xlarge`,
    `g5g.4xlarge`,
    `g5g.8xlarge`,
    `g5g.16xlarge`,
    `g5g.metal`,
    `hi1.4xlarge`,
    `hpc6a.48xlarge`,
    `hs1.8xlarge`,
    `h1.2xlarge`,
    `h1.4xlarge`,
    `h1.8xlarge`,
    `h1.16xlarge`,
    `i2.xlarge`,
    `i2.2xlarge`,
    `i2.4xlarge`,
    `i2.8xlarge`,
    `i3.large`,
    `i3.xlarge`,
    `i3.2xlarge`,
    `i3.4xlarge`,
    `i3.8xlarge`,
    `i3.16xlarge`,
    `i3.metal`,
    `i3en.large`,
    `i3en.xlarge`,
    `i3en.2xlarge`,
    `i3en.3xlarge`,
    `i3en.6xlarge`,
    `i3en.12xlarge`,
    `i3en.24xlarge`,
    `i3en.metal`,
    `im4gn.large`,
    `im4gn.xlarge`,
    `im4gn.2xlarge`,
    `im4gn.4xlarge`,
    `im4gn.8xlarge`,
    `im4gn.16xlarge`,
    `inf1.xlarge`,
    `inf1.2xlarge`,
    `inf1.6xlarge`,
    `inf1.24xlarge`,
    `is4gen.medium`,
    `is4gen.large`,
    `is4gen.xlarge`,
    `is4gen.2xlarge`,
    `is4gen.4xlarge`,
    `is4gen.8xlarge`,
    `m1.small`,
    `m1.medium`,
    `m1.large`,
    `m1.xlarge`,
    `m2.xlarge`,
    `m2.2xlarge`,
    `m2.4xlarge`,
    `m3.medium`,
    `m3.large`,
    `m3.xlarge`,
    `m3.2xlarge`,
    `m4.large`,
    `m4.xlarge`,
    `m4.2xlarge`,
    `m4.4xlarge`,
    `m4.10xlarge`,
    `m4.16xlarge`,
    `m5.large`,
    `m5.xlarge`,
    `m5.2xlarge`,
    `m5.4xlarge`,
    `m5.8xlarge`,
    `m5.12xlarge`,
    `m5.16xlarge`,
    `m5.24xlarge`,
    `m5.metal`,
    `m5a.large`,
    `m5a.xlarge`,
    `m5a.2xlarge`,
    `m5a.4xlarge`,
    `m5a.8xlarge`,
    `m5a.12xlarge`,
    `m5a.16xlarge`,
    `m5a.24xlarge`,
    `m5ad.large`,
    `m5ad.xlarge`,
    `m5ad.2xlarge`,
    `m5ad.4xlarge`,
    `m5ad.8xlarge`,
    `m5ad.12xlarge`,
    `m5ad.16xlarge`,
    `m5ad.24xlarge`,
    `m5d.large`,
    `m5d.xlarge`,
    `m5d.2xlarge`,
    `m5d.4xlarge`,
    `m5d.8xlarge`,
    `m5d.12xlarge`,
    `m5d.16xlarge`,
    `m5d.24xlarge`,
    `m5d.metal`,
    `m5dn.large`,
    `m5dn.xlarge`,
    `m5dn.2xlarge`,
    `m5dn.4xlarge`,
    `m5dn.8xlarge`,
    `m5dn.12xlarge`,
    `m5dn.16xlarge`,
    `m5dn.24xlarge`,
    `m5dn.metal`,
    `m5n.large`,
    `m5n.xlarge`,
    `m5n.2xlarge`,
    `m5n.4xlarge`,
    `m5n.8xlarge`,
    `m5n.12xlarge`,
    `m5n.16xlarge`,
    `m5n.24xlarge`,
    `m5n.metal`,
    `m5zn.large`,
    `m5zn.xlarge`,
    `m5zn.2xlarge`,
    `m5zn.3xlarge`,
    `m5zn.6xlarge`,
    `m5zn.12xlarge`,
    `m5zn.metal`,
    `m6a.large`,
    `m6a.xlarge`,
    `m6a.2xlarge`,
    `m6a.4xlarge`,
    `m6a.8xlarge`,
    `m6a.12xlarge`,
    `m6a.16xlarge`,
    `m6a.24xlarge`,
    `m6a.32xlarge`,
    `m6a.48xlarge`,
    `m6g.metal`,
    `m6g.medium`,
    `m6g.large`,
    `m6g.xlarge`,
    `m6g.2xlarge`,
    `m6g.4xlarge`,
    `m6g.8xlarge`,
    `m6g.12xlarge`,
    `m6g.16xlarge`,
    `m6gd.metal`,
    `m6gd.medium`,
    `m6gd.large`,
    `m6gd.xlarge`,
    `m6gd.2xlarge`,
    `m6gd.4xlarge`,
    `m6gd.8xlarge`,
    `m6gd.12xlarge`,
    `m6gd.16xlarge`,
    `m6i.large`,
    `m6i.xlarge`,
    `m6i.2xlarge`,
    `m6i.4xlarge`,
    `m6i.8xlarge`,
    `m6i.12xlarge`,
    `m6i.16xlarge`,
    `m6i.24xlarge`,
    `m6i.32xlarge`,
    `m6i.metal`,
    `mac1.metal`,
    `p2.xlarge`,
    `p2.8xlarge`,
    `p2.16xlarge`,
    `p3.2xlarge`,
    `p3.8xlarge`,
    `p3.16xlarge`,
    `p3dn.24xlarge`,
    `p4d.24xlarge`,
    `r3.large`,
    `r3.xlarge`,
    `r3.2xlarge`,
    `r3.4xlarge`,
    `r3.8xlarge`,
    `r4.large`,
    `r4.xlarge`,
    `r4.2xlarge`,
    `r4.4xlarge`,
    `r4.8xlarge`,
    `r4.16xlarge`,
    `r5.large`,
    `r5.xlarge`,
    `r5.2xlarge`,
    `r5.4xlarge`,
    `r5.8xlarge`,
    `r5.12xlarge`,
    `r5.16xlarge`,
    `r5.24xlarge`,
    `r5.metal`,
    `r5a.large`,
    `r5a.xlarge`,
    `r5a.2xlarge`,
    `r5a.4xlarge`,
    `r5a.8xlarge`,
    `r5a.12xlarge`,
    `r5a.16xlarge`,
    `r5a.24xlarge`,
    `r5ad.large`,
    `r5ad.xlarge`,
    `r5ad.2xlarge`,
    `r5ad.4xlarge`,
    `r5ad.8xlarge`,
    `r5ad.12xlarge`,
    `r5ad.16xlarge`,
    `r5ad.24xlarge`,
    `r5b.large`,
    `r5b.xlarge`,
    `r5b.2xlarge`,
    `r5b.4xlarge`,
    `r5b.8xlarge`,
    `r5b.12xlarge`,
    `r5b.16xlarge`,
    `r5b.24xlarge`,
    `r5b.metal`,
    `r5d.large`,
    `r5d.xlarge`,
    `r5d.2xlarge`,
    `r5d.4xlarge`,
    `r5d.8xlarge`,
    `r5d.12xlarge`,
    `r5d.16xlarge`,
    `r5d.24xlarge`,
    `r5d.metal`,
    `r5dn.large`,
    `r5dn.xlarge`,
    `r5dn.2xlarge`,
    `r5dn.4xlarge`,
    `r5dn.8xlarge`,
    `r5dn.12xlarge`,
    `r5dn.16xlarge`,
    `r5dn.24xlarge`,
    `r5dn.metal`,
    `r5n.large`,
    `r5n.xlarge`,
    `r5n.2xlarge`,
    `r5n.4xlarge`,
    `r5n.8xlarge`,
    `r5n.12xlarge`,
    `r5n.16xlarge`,
    `r5n.24xlarge`,
    `r5n.metal`,
    `r6g.medium`,
    `r6g.large`,
    `r6g.xlarge`,
    `r6g.2xlarge`,
    `r6g.4xlarge`,
    `r6g.8xlarge`,
    `r6g.12xlarge`,
    `r6g.16xlarge`,
    `r6g.metal`,
    `r6gd.medium`,
    `r6gd.large`,
    `r6gd.xlarge`,
    `r6gd.2xlarge`,
    `r6gd.4xlarge`,
    `r6gd.8xlarge`,
    `r6gd.12xlarge`,
    `r6gd.16xlarge`,
    `r6gd.metal`,
    `r6i.large`,
    `r6i.xlarge`,
    `r6i.2xlarge`,
    `r6i.4xlarge`,
    `r6i.8xlarge`,
    `r6i.12xlarge`,
    `r6i.16xlarge`,
    `r6i.24xlarge`,
    `r6i.32xlarge`,
    `r6i.metal`,
    `t1.micro`,
    `t2.nano`,
    `t2.micro`,
    `t2.small`,
    `t2.medium`,
    `t2.large`,
    `t2.xlarge`,
    `t2.2xlarge`,
    `t3.nano`,
    `t3.micro`,
    `t3.small`,
    `t3.medium`,
    `t3.large`,
    `t3.xlarge`,
    `t3.2xlarge`,
    `t3a.nano`,
    `t3a.micro`,
    `t3a.small`,
    `t3a.medium`,
    `t3a.large`,
    `t3a.xlarge`,
    `t3a.2xlarge`,
    `t4g.nano`,
    `t4g.micro`,
    `t4g.small`,
    `t4g.medium`,
    `t4g.large`,
    `t4g.xlarge`,
    `t4g.2xlarge`,
    `u-6tb1.56xlarge`,
    `u-6tb1.112xlarge`,
    `u-9tb1.112xlarge`,
    `u-12tb1.112xlarge`,
    `u-6tb1.metal`,
    `u-9tb1.metal`,
    `u-12tb1.metal`,
    `u-18tb1.metal`,
    `u-24tb1.metal`,
    `vt1.3xlarge`,
    `vt1.6xlarge`,
    `vt1.24xlarge`,
    `x1.16xlarge`,
    `x1.32xlarge`,
    `x1e.xlarge`,
    `x1e.2xlarge`,
    `x1e.4xlarge`,
    `x1e.8xlarge`,
    `x1e.16xlarge`,
    `x1e.32xlarge`,
    `x2iezn.2xlarge`,
    `x2iezn.4xlarge`,
    `x2iezn.6xlarge`,
    `x2iezn.8xlarge`,
    `x2iezn.12xlarge`,
    `x2iezn.metal`,
    `x2gd.medium`,
    `x2gd.large`,
    `x2gd.xlarge`,
    `x2gd.2xlarge`,
    `x2gd.4xlarge`,
    `x2gd.8xlarge`,
    `x2gd.12xlarge`,
    `x2gd.16xlarge`,
    `x2gd.metal`,
    `z1d.large`,
    `z1d.xlarge`,
    `z1d.2xlarge`,
    `z1d.3xlarge`,
    `z1d.6xlarge`,
    `z1d.12xlarge`,
    `z1d.metal`,
    `x2idn.16xlarge`,
    `x2idn.24xlarge`,
    `x2idn.32xlarge`,
    `x2iedn.xlarge`,
    `x2iedn.2xlarge`,
    `x2iedn.4xlarge`,
    `x2iedn.8xlarge`,
    `x2iedn.16xlarge`,
    `x2iedn.24xlarge`,
    `x2iedn.32xlarge`,
    `c6a.large`,
    `c6a.xlarge`,
    `c6a.2xlarge`,
    `c6a.4xlarge`,
    `c6a.8xlarge`,
    `c6a.12xlarge`,
    `c6a.16xlarge`,
    `c6a.24xlarge`,
    `c6a.32xlarge`,
    `c6a.48xlarge`,
    `c6a.metal`,
    `m6a.metal`,
    `i4i.large`,
    `i4i.xlarge`,
    `i4i.2xlarge`,
    `i4i.4xlarge`,
    `i4i.8xlarge`,
    `i4i.16xlarge`,
    `i4i.32xlarge`,
    `i4i.metal`,
    `x2idn.metal`,
    `x2iedn.metal`,
    `c7g.medium`,
    `c7g.large`,
    `c7g.xlarge`,
    `c7g.2xlarge`,
    `c7g.4xlarge`,
    `c7g.8xlarge`,
    `c7g.12xlarge`,
    `c7g.16xlarge`,
    `mac2.metal`,
    `c6id.large`,
    `c6id.xlarge`,
    `c6id.2xlarge`,
    `c6id.4xlarge`,
    `c6id.8xlarge`,
    `c6id.12xlarge`,
    `c6id.16xlarge`,
    `c6id.24xlarge`,
    `c6id.32xlarge`,
    `c6id.metal`,
    `m6id.large`,
    `m6id.xlarge`,
    `m6id.2xlarge`,
    `m6id.4xlarge`,
    `m6id.8xlarge`,
    `m6id.12xlarge`,
    `m6id.16xlarge`,
    `m6id.24xlarge`,
    `m6id.32xlarge`,
    `m6id.metal`,
    `r6id.large`,
    `r6id.xlarge`,
    `r6id.2xlarge`,
    `r6id.4xlarge`,
    `r6id.8xlarge`,
    `r6id.12xlarge`,
    `r6id.16xlarge`,
    `r6id.24xlarge`,
    `r6id.32xlarge`,
    `r6id.metal`,
    `r6a.large`,
    `r6a.xlarge`,
    `r6a.2xlarge`,
    `r6a.4xlarge`,
    `r6a.8xlarge`,
    `r6a.12xlarge`,
    `r6a.16xlarge`,
    `r6a.24xlarge`,
    `r6a.32xlarge`,
    `r6a.48xlarge`,
    `r6a.metal`,
    `p4de.24xlarge`,
    `u-3tb1.56xlarge`,
    `u-18tb1.112xlarge`,
    `u-24tb1.112xlarge`,
    `trn1.2xlarge`,
    `trn1.32xlarge`,
    `hpc6id.32xlarge`
  )
}

@js.native
sealed trait InstanceTypeHypervisor extends js.Any
object InstanceTypeHypervisor {
  val nitro = "nitro".asInstanceOf[InstanceTypeHypervisor]
  val xen = "xen".asInstanceOf[InstanceTypeHypervisor]

  @inline def values: js.Array[InstanceTypeHypervisor] = js.Array(nitro, xen)
}

@js.native
sealed trait InterfacePermissionType extends js.Any
object InterfacePermissionType {
  val `INSTANCE-ATTACH` = "INSTANCE-ATTACH".asInstanceOf[InterfacePermissionType]
  val `EIP-ASSOCIATE` = "EIP-ASSOCIATE".asInstanceOf[InterfacePermissionType]

  @inline def values: js.Array[InterfacePermissionType] = js.Array(`INSTANCE-ATTACH`, `EIP-ASSOCIATE`)
}

@js.native
sealed trait InterfaceProtocolType extends js.Any
object InterfaceProtocolType {
  val VLAN = "VLAN".asInstanceOf[InterfaceProtocolType]
  val GRE = "GRE".asInstanceOf[InterfaceProtocolType]

  @inline def values: js.Array[InterfaceProtocolType] = js.Array(VLAN, GRE)
}

@js.native
sealed trait IpAddressType extends js.Any
object IpAddressType {
  val ipv4 = "ipv4".asInstanceOf[IpAddressType]
  val dualstack = "dualstack".asInstanceOf[IpAddressType]
  val ipv6 = "ipv6".asInstanceOf[IpAddressType]

  @inline def values: js.Array[IpAddressType] = js.Array(ipv4, dualstack, ipv6)
}

@js.native
sealed trait IpamAddressHistoryResourceType extends js.Any
object IpamAddressHistoryResourceType {
  val eip = "eip".asInstanceOf[IpamAddressHistoryResourceType]
  val vpc = "vpc".asInstanceOf[IpamAddressHistoryResourceType]
  val subnet = "subnet".asInstanceOf[IpamAddressHistoryResourceType]
  val `network-interface` = "network-interface".asInstanceOf[IpamAddressHistoryResourceType]
  val instance = "instance".asInstanceOf[IpamAddressHistoryResourceType]

  @inline def values: js.Array[IpamAddressHistoryResourceType] = js.Array(eip, vpc, subnet, `network-interface`, instance)
}

@js.native
sealed trait IpamComplianceStatus extends js.Any
object IpamComplianceStatus {
  val compliant = "compliant".asInstanceOf[IpamComplianceStatus]
  val noncompliant = "noncompliant".asInstanceOf[IpamComplianceStatus]
  val unmanaged = "unmanaged".asInstanceOf[IpamComplianceStatus]
  val ignored = "ignored".asInstanceOf[IpamComplianceStatus]

  @inline def values: js.Array[IpamComplianceStatus] = js.Array(compliant, noncompliant, unmanaged, ignored)
}

@js.native
sealed trait IpamManagementState extends js.Any
object IpamManagementState {
  val managed = "managed".asInstanceOf[IpamManagementState]
  val unmanaged = "unmanaged".asInstanceOf[IpamManagementState]
  val ignored = "ignored".asInstanceOf[IpamManagementState]

  @inline def values: js.Array[IpamManagementState] = js.Array(managed, unmanaged, ignored)
}

@js.native
sealed trait IpamOverlapStatus extends js.Any
object IpamOverlapStatus {
  val overlapping = "overlapping".asInstanceOf[IpamOverlapStatus]
  val nonoverlapping = "nonoverlapping".asInstanceOf[IpamOverlapStatus]
  val ignored = "ignored".asInstanceOf[IpamOverlapStatus]

  @inline def values: js.Array[IpamOverlapStatus] = js.Array(overlapping, nonoverlapping, ignored)
}

@js.native
sealed trait IpamPoolAllocationResourceType extends js.Any
object IpamPoolAllocationResourceType {
  val `ipam-pool` = "ipam-pool".asInstanceOf[IpamPoolAllocationResourceType]
  val vpc = "vpc".asInstanceOf[IpamPoolAllocationResourceType]
  val `ec2-public-ipv4-pool` = "ec2-public-ipv4-pool".asInstanceOf[IpamPoolAllocationResourceType]
  val custom = "custom".asInstanceOf[IpamPoolAllocationResourceType]

  @inline def values: js.Array[IpamPoolAllocationResourceType] = js.Array(`ipam-pool`, vpc, `ec2-public-ipv4-pool`, custom)
}

@js.native
sealed trait IpamPoolAwsService extends js.Any
object IpamPoolAwsService {
  val ec2 = "ec2".asInstanceOf[IpamPoolAwsService]

  @inline def values: js.Array[IpamPoolAwsService] = js.Array(ec2)
}

@js.native
sealed trait IpamPoolCidrFailureCode extends js.Any
object IpamPoolCidrFailureCode {
  val `cidr-not-available` = "cidr-not-available".asInstanceOf[IpamPoolCidrFailureCode]

  @inline def values: js.Array[IpamPoolCidrFailureCode] = js.Array(`cidr-not-available`)
}

@js.native
sealed trait IpamPoolCidrState extends js.Any
object IpamPoolCidrState {
  val `pending-provision` = "pending-provision".asInstanceOf[IpamPoolCidrState]
  val provisioned = "provisioned".asInstanceOf[IpamPoolCidrState]
  val `failed-provision` = "failed-provision".asInstanceOf[IpamPoolCidrState]
  val `pending-deprovision` = "pending-deprovision".asInstanceOf[IpamPoolCidrState]
  val deprovisioned = "deprovisioned".asInstanceOf[IpamPoolCidrState]
  val `failed-deprovision` = "failed-deprovision".asInstanceOf[IpamPoolCidrState]
  val `pending-import` = "pending-import".asInstanceOf[IpamPoolCidrState]
  val `failed-import` = "failed-import".asInstanceOf[IpamPoolCidrState]

  @inline def values: js.Array[IpamPoolCidrState] = js.Array(`pending-provision`, provisioned, `failed-provision`, `pending-deprovision`, deprovisioned, `failed-deprovision`, `pending-import`, `failed-import`)
}

@js.native
sealed trait IpamPoolState extends js.Any
object IpamPoolState {
  val `create-in-progress` = "create-in-progress".asInstanceOf[IpamPoolState]
  val `create-complete` = "create-complete".asInstanceOf[IpamPoolState]
  val `create-failed` = "create-failed".asInstanceOf[IpamPoolState]
  val `modify-in-progress` = "modify-in-progress".asInstanceOf[IpamPoolState]
  val `modify-complete` = "modify-complete".asInstanceOf[IpamPoolState]
  val `modify-failed` = "modify-failed".asInstanceOf[IpamPoolState]
  val `delete-in-progress` = "delete-in-progress".asInstanceOf[IpamPoolState]
  val `delete-complete` = "delete-complete".asInstanceOf[IpamPoolState]
  val `delete-failed` = "delete-failed".asInstanceOf[IpamPoolState]
  val `isolate-in-progress` = "isolate-in-progress".asInstanceOf[IpamPoolState]
  val `isolate-complete` = "isolate-complete".asInstanceOf[IpamPoolState]
  val `restore-in-progress` = "restore-in-progress".asInstanceOf[IpamPoolState]

  @inline def values: js.Array[IpamPoolState] = js.Array(
    `create-in-progress`,
    `create-complete`,
    `create-failed`,
    `modify-in-progress`,
    `modify-complete`,
    `modify-failed`,
    `delete-in-progress`,
    `delete-complete`,
    `delete-failed`,
    `isolate-in-progress`,
    `isolate-complete`,
    `restore-in-progress`
  )
}

@js.native
sealed trait IpamResourceType extends js.Any
object IpamResourceType {
  val vpc = "vpc".asInstanceOf[IpamResourceType]
  val subnet = "subnet".asInstanceOf[IpamResourceType]
  val eip = "eip".asInstanceOf[IpamResourceType]
  val `public-ipv4-pool` = "public-ipv4-pool".asInstanceOf[IpamResourceType]
  val `ipv6-pool` = "ipv6-pool".asInstanceOf[IpamResourceType]

  @inline def values: js.Array[IpamResourceType] = js.Array(vpc, subnet, eip, `public-ipv4-pool`, `ipv6-pool`)
}

@js.native
sealed trait IpamScopeState extends js.Any
object IpamScopeState {
  val `create-in-progress` = "create-in-progress".asInstanceOf[IpamScopeState]
  val `create-complete` = "create-complete".asInstanceOf[IpamScopeState]
  val `create-failed` = "create-failed".asInstanceOf[IpamScopeState]
  val `modify-in-progress` = "modify-in-progress".asInstanceOf[IpamScopeState]
  val `modify-complete` = "modify-complete".asInstanceOf[IpamScopeState]
  val `modify-failed` = "modify-failed".asInstanceOf[IpamScopeState]
  val `delete-in-progress` = "delete-in-progress".asInstanceOf[IpamScopeState]
  val `delete-complete` = "delete-complete".asInstanceOf[IpamScopeState]
  val `delete-failed` = "delete-failed".asInstanceOf[IpamScopeState]
  val `isolate-in-progress` = "isolate-in-progress".asInstanceOf[IpamScopeState]
  val `isolate-complete` = "isolate-complete".asInstanceOf[IpamScopeState]
  val `restore-in-progress` = "restore-in-progress".asInstanceOf[IpamScopeState]

  @inline def values: js.Array[IpamScopeState] = js.Array(
    `create-in-progress`,
    `create-complete`,
    `create-failed`,
    `modify-in-progress`,
    `modify-complete`,
    `modify-failed`,
    `delete-in-progress`,
    `delete-complete`,
    `delete-failed`,
    `isolate-in-progress`,
    `isolate-complete`,
    `restore-in-progress`
  )
}

@js.native
sealed trait IpamScopeType extends js.Any
object IpamScopeType {
  val `public` = "public".asInstanceOf[IpamScopeType]
  val `private` = "private".asInstanceOf[IpamScopeType]

  @inline def values: js.Array[IpamScopeType] = js.Array(`public`, `private`)
}

@js.native
sealed trait IpamState extends js.Any
object IpamState {
  val `create-in-progress` = "create-in-progress".asInstanceOf[IpamState]
  val `create-complete` = "create-complete".asInstanceOf[IpamState]
  val `create-failed` = "create-failed".asInstanceOf[IpamState]
  val `modify-in-progress` = "modify-in-progress".asInstanceOf[IpamState]
  val `modify-complete` = "modify-complete".asInstanceOf[IpamState]
  val `modify-failed` = "modify-failed".asInstanceOf[IpamState]
  val `delete-in-progress` = "delete-in-progress".asInstanceOf[IpamState]
  val `delete-complete` = "delete-complete".asInstanceOf[IpamState]
  val `delete-failed` = "delete-failed".asInstanceOf[IpamState]
  val `isolate-in-progress` = "isolate-in-progress".asInstanceOf[IpamState]
  val `isolate-complete` = "isolate-complete".asInstanceOf[IpamState]
  val `restore-in-progress` = "restore-in-progress".asInstanceOf[IpamState]

  @inline def values: js.Array[IpamState] = js.Array(
    `create-in-progress`,
    `create-complete`,
    `create-failed`,
    `modify-in-progress`,
    `modify-complete`,
    `modify-failed`,
    `delete-in-progress`,
    `delete-complete`,
    `delete-failed`,
    `isolate-in-progress`,
    `isolate-complete`,
    `restore-in-progress`
  )
}

@js.native
sealed trait Ipv6SupportValue extends js.Any
object Ipv6SupportValue {
  val enable = "enable".asInstanceOf[Ipv6SupportValue]
  val disable = "disable".asInstanceOf[Ipv6SupportValue]

  @inline def values: js.Array[Ipv6SupportValue] = js.Array(enable, disable)
}

@js.native
sealed trait KeyFormat extends js.Any
object KeyFormat {
  val pem = "pem".asInstanceOf[KeyFormat]
  val ppk = "ppk".asInstanceOf[KeyFormat]

  @inline def values: js.Array[KeyFormat] = js.Array(pem, ppk)
}

@js.native
sealed trait KeyType extends js.Any
object KeyType {
  val rsa = "rsa".asInstanceOf[KeyType]
  val ed25519 = "ed25519".asInstanceOf[KeyType]

  @inline def values: js.Array[KeyType] = js.Array(rsa, ed25519)
}

@js.native
sealed trait LaunchTemplateAutoRecoveryState extends js.Any
object LaunchTemplateAutoRecoveryState {
  val default = "default".asInstanceOf[LaunchTemplateAutoRecoveryState]
  val disabled = "disabled".asInstanceOf[LaunchTemplateAutoRecoveryState]

  @inline def values: js.Array[LaunchTemplateAutoRecoveryState] = js.Array(default, disabled)
}

@js.native
sealed trait LaunchTemplateErrorCode extends js.Any
object LaunchTemplateErrorCode {
  val launchTemplateIdDoesNotExist = "launchTemplateIdDoesNotExist".asInstanceOf[LaunchTemplateErrorCode]
  val launchTemplateIdMalformed = "launchTemplateIdMalformed".asInstanceOf[LaunchTemplateErrorCode]
  val launchTemplateNameDoesNotExist = "launchTemplateNameDoesNotExist".asInstanceOf[LaunchTemplateErrorCode]
  val launchTemplateNameMalformed = "launchTemplateNameMalformed".asInstanceOf[LaunchTemplateErrorCode]
  val launchTemplateVersionDoesNotExist = "launchTemplateVersionDoesNotExist".asInstanceOf[LaunchTemplateErrorCode]
  val unexpectedError = "unexpectedError".asInstanceOf[LaunchTemplateErrorCode]

  @inline def values: js.Array[LaunchTemplateErrorCode] = js.Array(
    launchTemplateIdDoesNotExist,
    launchTemplateIdMalformed,
    launchTemplateNameDoesNotExist,
    launchTemplateNameMalformed,
    launchTemplateVersionDoesNotExist,
    unexpectedError
  )
}

@js.native
sealed trait LaunchTemplateHttpTokensState extends js.Any
object LaunchTemplateHttpTokensState {
  val optional = "optional".asInstanceOf[LaunchTemplateHttpTokensState]
  val required = "required".asInstanceOf[LaunchTemplateHttpTokensState]

  @inline def values: js.Array[LaunchTemplateHttpTokensState] = js.Array(optional, required)
}

@js.native
sealed trait LaunchTemplateInstanceMetadataEndpointState extends js.Any
object LaunchTemplateInstanceMetadataEndpointState {
  val disabled = "disabled".asInstanceOf[LaunchTemplateInstanceMetadataEndpointState]
  val enabled = "enabled".asInstanceOf[LaunchTemplateInstanceMetadataEndpointState]

  @inline def values: js.Array[LaunchTemplateInstanceMetadataEndpointState] = js.Array(disabled, enabled)
}

@js.native
sealed trait LaunchTemplateInstanceMetadataOptionsState extends js.Any
object LaunchTemplateInstanceMetadataOptionsState {
  val pending = "pending".asInstanceOf[LaunchTemplateInstanceMetadataOptionsState]
  val applied = "applied".asInstanceOf[LaunchTemplateInstanceMetadataOptionsState]

  @inline def values: js.Array[LaunchTemplateInstanceMetadataOptionsState] = js.Array(pending, applied)
}

@js.native
sealed trait LaunchTemplateInstanceMetadataProtocolIpv6 extends js.Any
object LaunchTemplateInstanceMetadataProtocolIpv6 {
  val disabled = "disabled".asInstanceOf[LaunchTemplateInstanceMetadataProtocolIpv6]
  val enabled = "enabled".asInstanceOf[LaunchTemplateInstanceMetadataProtocolIpv6]

  @inline def values: js.Array[LaunchTemplateInstanceMetadataProtocolIpv6] = js.Array(disabled, enabled)
}

@js.native
sealed trait LaunchTemplateInstanceMetadataTagsState extends js.Any
object LaunchTemplateInstanceMetadataTagsState {
  val disabled = "disabled".asInstanceOf[LaunchTemplateInstanceMetadataTagsState]
  val enabled = "enabled".asInstanceOf[LaunchTemplateInstanceMetadataTagsState]

  @inline def values: js.Array[LaunchTemplateInstanceMetadataTagsState] = js.Array(disabled, enabled)
}

@js.native
sealed trait ListingState extends js.Any
object ListingState {
  val available = "available".asInstanceOf[ListingState]
  val sold = "sold".asInstanceOf[ListingState]
  val cancelled = "cancelled".asInstanceOf[ListingState]
  val pending = "pending".asInstanceOf[ListingState]

  @inline def values: js.Array[ListingState] = js.Array(available, sold, cancelled, pending)
}

@js.native
sealed trait ListingStatus extends js.Any
object ListingStatus {
  val active = "active".asInstanceOf[ListingStatus]
  val pending = "pending".asInstanceOf[ListingStatus]
  val cancelled = "cancelled".asInstanceOf[ListingStatus]
  val closed = "closed".asInstanceOf[ListingStatus]

  @inline def values: js.Array[ListingStatus] = js.Array(active, pending, cancelled, closed)
}

@js.native
sealed trait LocalGatewayRouteState extends js.Any
object LocalGatewayRouteState {
  val pending = "pending".asInstanceOf[LocalGatewayRouteState]
  val active = "active".asInstanceOf[LocalGatewayRouteState]
  val blackhole = "blackhole".asInstanceOf[LocalGatewayRouteState]
  val deleting = "deleting".asInstanceOf[LocalGatewayRouteState]
  val deleted = "deleted".asInstanceOf[LocalGatewayRouteState]

  @inline def values: js.Array[LocalGatewayRouteState] = js.Array(pending, active, blackhole, deleting, deleted)
}

@js.native
sealed trait LocalGatewayRouteTableMode extends js.Any
object LocalGatewayRouteTableMode {
  val `direct-vpc-routing` = "direct-vpc-routing".asInstanceOf[LocalGatewayRouteTableMode]
  val coip = "coip".asInstanceOf[LocalGatewayRouteTableMode]

  @inline def values: js.Array[LocalGatewayRouteTableMode] = js.Array(`direct-vpc-routing`, coip)
}

@js.native
sealed trait LocalGatewayRouteType extends js.Any
object LocalGatewayRouteType {
  val static = "static".asInstanceOf[LocalGatewayRouteType]
  val propagated = "propagated".asInstanceOf[LocalGatewayRouteType]

  @inline def values: js.Array[LocalGatewayRouteType] = js.Array(static, propagated)
}

@js.native
sealed trait LocalStorage extends js.Any
object LocalStorage {
  val included = "included".asInstanceOf[LocalStorage]
  val required = "required".asInstanceOf[LocalStorage]
  val excluded = "excluded".asInstanceOf[LocalStorage]

  @inline def values: js.Array[LocalStorage] = js.Array(included, required, excluded)
}

@js.native
sealed trait LocalStorageType extends js.Any
object LocalStorageType {
  val hdd = "hdd".asInstanceOf[LocalStorageType]
  val ssd = "ssd".asInstanceOf[LocalStorageType]

  @inline def values: js.Array[LocalStorageType] = js.Array(hdd, ssd)
}

@js.native
sealed trait LocationType extends js.Any
object LocationType {
  val region = "region".asInstanceOf[LocationType]
  val `availability-zone` = "availability-zone".asInstanceOf[LocationType]
  val `availability-zone-id` = "availability-zone-id".asInstanceOf[LocationType]

  @inline def values: js.Array[LocationType] = js.Array(region, `availability-zone`, `availability-zone-id`)
}

@js.native
sealed trait LogDestinationType extends js.Any
object LogDestinationType {
  val `cloud-watch-logs` = "cloud-watch-logs".asInstanceOf[LogDestinationType]
  val s3 = "s3".asInstanceOf[LogDestinationType]
  val `kinesis-data-firehose` = "kinesis-data-firehose".asInstanceOf[LogDestinationType]

  @inline def values: js.Array[LogDestinationType] = js.Array(`cloud-watch-logs`, s3, `kinesis-data-firehose`)
}

@js.native
sealed trait MarketType extends js.Any
object MarketType {
  val spot = "spot".asInstanceOf[MarketType]

  @inline def values: js.Array[MarketType] = js.Array(spot)
}

@js.native
sealed trait MembershipType extends js.Any
object MembershipType {
  val static = "static".asInstanceOf[MembershipType]
  val igmp = "igmp".asInstanceOf[MembershipType]

  @inline def values: js.Array[MembershipType] = js.Array(static, igmp)
}

@js.native
sealed trait MetricType extends js.Any
object MetricType {
  val `aggregate-latency` = "aggregate-latency".asInstanceOf[MetricType]

  @inline def values: js.Array[MetricType] = js.Array(`aggregate-latency`)
}

@js.native
sealed trait ModifyAvailabilityZoneOptInStatus extends js.Any
object ModifyAvailabilityZoneOptInStatus {
  val `opted-in` = "opted-in".asInstanceOf[ModifyAvailabilityZoneOptInStatus]
  val `not-opted-in` = "not-opted-in".asInstanceOf[ModifyAvailabilityZoneOptInStatus]

  @inline def values: js.Array[ModifyAvailabilityZoneOptInStatus] = js.Array(`opted-in`, `not-opted-in`)
}

@js.native
sealed trait MonitoringState extends js.Any
object MonitoringState {
  val disabled = "disabled".asInstanceOf[MonitoringState]
  val disabling = "disabling".asInstanceOf[MonitoringState]
  val enabled = "enabled".asInstanceOf[MonitoringState]
  val pending = "pending".asInstanceOf[MonitoringState]

  @inline def values: js.Array[MonitoringState] = js.Array(disabled, disabling, enabled, pending)
}

@js.native
sealed trait MoveStatus extends js.Any
object MoveStatus {
  val movingToVpc = "movingToVpc".asInstanceOf[MoveStatus]
  val restoringToClassic = "restoringToClassic".asInstanceOf[MoveStatus]

  @inline def values: js.Array[MoveStatus] = js.Array(movingToVpc, restoringToClassic)
}

@js.native
sealed trait MulticastSupportValue extends js.Any
object MulticastSupportValue {
  val enable = "enable".asInstanceOf[MulticastSupportValue]
  val disable = "disable".asInstanceOf[MulticastSupportValue]

  @inline def values: js.Array[MulticastSupportValue] = js.Array(enable, disable)
}

@js.native
sealed trait NatGatewayState extends js.Any
object NatGatewayState {
  val pending = "pending".asInstanceOf[NatGatewayState]
  val failed = "failed".asInstanceOf[NatGatewayState]
  val available = "available".asInstanceOf[NatGatewayState]
  val deleting = "deleting".asInstanceOf[NatGatewayState]
  val deleted = "deleted".asInstanceOf[NatGatewayState]

  @inline def values: js.Array[NatGatewayState] = js.Array(pending, failed, available, deleting, deleted)
}

@js.native
sealed trait NetworkInterfaceAttribute extends js.Any
object NetworkInterfaceAttribute {
  val description = "description".asInstanceOf[NetworkInterfaceAttribute]
  val groupSet = "groupSet".asInstanceOf[NetworkInterfaceAttribute]
  val sourceDestCheck = "sourceDestCheck".asInstanceOf[NetworkInterfaceAttribute]
  val attachment = "attachment".asInstanceOf[NetworkInterfaceAttribute]

  @inline def values: js.Array[NetworkInterfaceAttribute] = js.Array(description, groupSet, sourceDestCheck, attachment)
}

@js.native
sealed trait NetworkInterfaceCreationType extends js.Any
object NetworkInterfaceCreationType {
  val efa = "efa".asInstanceOf[NetworkInterfaceCreationType]
  val branch = "branch".asInstanceOf[NetworkInterfaceCreationType]
  val trunk = "trunk".asInstanceOf[NetworkInterfaceCreationType]

  @inline def values: js.Array[NetworkInterfaceCreationType] = js.Array(efa, branch, trunk)
}

@js.native
sealed trait NetworkInterfacePermissionStateCode extends js.Any
object NetworkInterfacePermissionStateCode {
  val pending = "pending".asInstanceOf[NetworkInterfacePermissionStateCode]
  val granted = "granted".asInstanceOf[NetworkInterfacePermissionStateCode]
  val revoking = "revoking".asInstanceOf[NetworkInterfacePermissionStateCode]
  val revoked = "revoked".asInstanceOf[NetworkInterfacePermissionStateCode]

  @inline def values: js.Array[NetworkInterfacePermissionStateCode] = js.Array(pending, granted, revoking, revoked)
}

@js.native
sealed trait NetworkInterfaceStatus extends js.Any
object NetworkInterfaceStatus {
  val available = "available".asInstanceOf[NetworkInterfaceStatus]
  val associated = "associated".asInstanceOf[NetworkInterfaceStatus]
  val attaching = "attaching".asInstanceOf[NetworkInterfaceStatus]
  val `in-use` = "in-use".asInstanceOf[NetworkInterfaceStatus]
  val detaching = "detaching".asInstanceOf[NetworkInterfaceStatus]

  @inline def values: js.Array[NetworkInterfaceStatus] = js.Array(available, associated, attaching, `in-use`, detaching)
}

@js.native
sealed trait NetworkInterfaceType extends js.Any
object NetworkInterfaceType {
  val interface = "interface".asInstanceOf[NetworkInterfaceType]
  val natGateway = "natGateway".asInstanceOf[NetworkInterfaceType]
  val efa = "efa".asInstanceOf[NetworkInterfaceType]
  val trunk = "trunk".asInstanceOf[NetworkInterfaceType]
  val load_balancer = "load_balancer".asInstanceOf[NetworkInterfaceType]
  val network_load_balancer = "network_load_balancer".asInstanceOf[NetworkInterfaceType]
  val vpc_endpoint = "vpc_endpoint".asInstanceOf[NetworkInterfaceType]
  val branch = "branch".asInstanceOf[NetworkInterfaceType]
  val transit_gateway = "transit_gateway".asInstanceOf[NetworkInterfaceType]
  val lambda = "lambda".asInstanceOf[NetworkInterfaceType]
  val quicksight = "quicksight".asInstanceOf[NetworkInterfaceType]
  val global_accelerator_managed = "global_accelerator_managed".asInstanceOf[NetworkInterfaceType]
  val api_gateway_managed = "api_gateway_managed".asInstanceOf[NetworkInterfaceType]
  val gateway_load_balancer = "gateway_load_balancer".asInstanceOf[NetworkInterfaceType]
  val gateway_load_balancer_endpoint = "gateway_load_balancer_endpoint".asInstanceOf[NetworkInterfaceType]
  val iot_rules_managed = "iot_rules_managed".asInstanceOf[NetworkInterfaceType]
  val aws_codestar_connections_managed = "aws_codestar_connections_managed".asInstanceOf[NetworkInterfaceType]

  @inline def values: js.Array[NetworkInterfaceType] = js.Array(
    interface,
    natGateway,
    efa,
    trunk,
    load_balancer,
    network_load_balancer,
    vpc_endpoint,
    branch,
    transit_gateway,
    lambda,
    quicksight,
    global_accelerator_managed,
    api_gateway_managed,
    gateway_load_balancer,
    gateway_load_balancer_endpoint,
    iot_rules_managed,
    aws_codestar_connections_managed
  )
}

@js.native
sealed trait OfferingClassType extends js.Any
object OfferingClassType {
  val standard = "standard".asInstanceOf[OfferingClassType]
  val convertible = "convertible".asInstanceOf[OfferingClassType]

  @inline def values: js.Array[OfferingClassType] = js.Array(standard, convertible)
}

@js.native
sealed trait OfferingTypeValues extends js.Any
object OfferingTypeValues {
  val `Heavy Utilization` = "Heavy Utilization".asInstanceOf[OfferingTypeValues]
  val `Medium Utilization` = "Medium Utilization".asInstanceOf[OfferingTypeValues]
  val `Light Utilization` = "Light Utilization".asInstanceOf[OfferingTypeValues]
  val `No Upfront` = "No Upfront".asInstanceOf[OfferingTypeValues]
  val `Partial Upfront` = "Partial Upfront".asInstanceOf[OfferingTypeValues]
  val `All Upfront` = "All Upfront".asInstanceOf[OfferingTypeValues]

  @inline def values: js.Array[OfferingTypeValues] = js.Array(`Heavy Utilization`, `Medium Utilization`, `Light Utilization`, `No Upfront`, `Partial Upfront`, `All Upfront`)
}

@js.native
sealed trait OnDemandAllocationStrategy extends js.Any
object OnDemandAllocationStrategy {
  val lowestPrice = "lowestPrice".asInstanceOf[OnDemandAllocationStrategy]
  val prioritized = "prioritized".asInstanceOf[OnDemandAllocationStrategy]

  @inline def values: js.Array[OnDemandAllocationStrategy] = js.Array(lowestPrice, prioritized)
}

@js.native
sealed trait OperationType extends js.Any
object OperationType {
  val add = "add".asInstanceOf[OperationType]
  val remove = "remove".asInstanceOf[OperationType]

  @inline def values: js.Array[OperationType] = js.Array(add, remove)
}

@js.native
sealed trait PartitionLoadFrequency extends js.Any
object PartitionLoadFrequency {
  val none = "none".asInstanceOf[PartitionLoadFrequency]
  val daily = "daily".asInstanceOf[PartitionLoadFrequency]
  val weekly = "weekly".asInstanceOf[PartitionLoadFrequency]
  val monthly = "monthly".asInstanceOf[PartitionLoadFrequency]

  @inline def values: js.Array[PartitionLoadFrequency] = js.Array(none, daily, weekly, monthly)
}

@js.native
sealed trait PayerResponsibility extends js.Any
object PayerResponsibility {
  val ServiceOwner = "ServiceOwner".asInstanceOf[PayerResponsibility]

  @inline def values: js.Array[PayerResponsibility] = js.Array(ServiceOwner)
}

@js.native
sealed trait PaymentOption extends js.Any
object PaymentOption {
  val AllUpfront = "AllUpfront".asInstanceOf[PaymentOption]
  val PartialUpfront = "PartialUpfront".asInstanceOf[PaymentOption]
  val NoUpfront = "NoUpfront".asInstanceOf[PaymentOption]

  @inline def values: js.Array[PaymentOption] = js.Array(AllUpfront, PartialUpfront, NoUpfront)
}

@js.native
sealed trait PeriodType extends js.Any
object PeriodType {
  val `five-minutes` = "five-minutes".asInstanceOf[PeriodType]
  val `fifteen-minutes` = "fifteen-minutes".asInstanceOf[PeriodType]
  val `one-hour` = "one-hour".asInstanceOf[PeriodType]
  val `three-hours` = "three-hours".asInstanceOf[PeriodType]
  val `one-day` = "one-day".asInstanceOf[PeriodType]
  val `one-week` = "one-week".asInstanceOf[PeriodType]

  @inline def values: js.Array[PeriodType] = js.Array(`five-minutes`, `fifteen-minutes`, `one-hour`, `three-hours`, `one-day`, `one-week`)
}

@js.native
sealed trait PermissionGroup extends js.Any
object PermissionGroup {
  val all = "all".asInstanceOf[PermissionGroup]

  @inline def values: js.Array[PermissionGroup] = js.Array(all)
}

@js.native
sealed trait PlacementGroupState extends js.Any
object PlacementGroupState {
  val pending = "pending".asInstanceOf[PlacementGroupState]
  val available = "available".asInstanceOf[PlacementGroupState]
  val deleting = "deleting".asInstanceOf[PlacementGroupState]
  val deleted = "deleted".asInstanceOf[PlacementGroupState]

  @inline def values: js.Array[PlacementGroupState] = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait PlacementGroupStrategy extends js.Any
object PlacementGroupStrategy {
  val cluster = "cluster".asInstanceOf[PlacementGroupStrategy]
  val partition = "partition".asInstanceOf[PlacementGroupStrategy]
  val spread = "spread".asInstanceOf[PlacementGroupStrategy]

  @inline def values: js.Array[PlacementGroupStrategy] = js.Array(cluster, partition, spread)
}

@js.native
sealed trait PlacementStrategy extends js.Any
object PlacementStrategy {
  val cluster = "cluster".asInstanceOf[PlacementStrategy]
  val spread = "spread".asInstanceOf[PlacementStrategy]
  val partition = "partition".asInstanceOf[PlacementStrategy]

  @inline def values: js.Array[PlacementStrategy] = js.Array(cluster, spread, partition)
}

@js.native
sealed trait PlatformValues extends js.Any
object PlatformValues {
  val Windows = "Windows".asInstanceOf[PlatformValues]

  @inline def values: js.Array[PlatformValues] = js.Array(Windows)
}

@js.native
sealed trait PrefixListState extends js.Any
object PrefixListState {
  val `create-in-progress` = "create-in-progress".asInstanceOf[PrefixListState]
  val `create-complete` = "create-complete".asInstanceOf[PrefixListState]
  val `create-failed` = "create-failed".asInstanceOf[PrefixListState]
  val `modify-in-progress` = "modify-in-progress".asInstanceOf[PrefixListState]
  val `modify-complete` = "modify-complete".asInstanceOf[PrefixListState]
  val `modify-failed` = "modify-failed".asInstanceOf[PrefixListState]
  val `restore-in-progress` = "restore-in-progress".asInstanceOf[PrefixListState]
  val `restore-complete` = "restore-complete".asInstanceOf[PrefixListState]
  val `restore-failed` = "restore-failed".asInstanceOf[PrefixListState]
  val `delete-in-progress` = "delete-in-progress".asInstanceOf[PrefixListState]
  val `delete-complete` = "delete-complete".asInstanceOf[PrefixListState]
  val `delete-failed` = "delete-failed".asInstanceOf[PrefixListState]

  @inline def values: js.Array[PrefixListState] = js.Array(
    `create-in-progress`,
    `create-complete`,
    `create-failed`,
    `modify-in-progress`,
    `modify-complete`,
    `modify-failed`,
    `restore-in-progress`,
    `restore-complete`,
    `restore-failed`,
    `delete-in-progress`,
    `delete-complete`,
    `delete-failed`
  )
}

@js.native
sealed trait PrincipalType extends js.Any
object PrincipalType {
  val All = "All".asInstanceOf[PrincipalType]
  val Service = "Service".asInstanceOf[PrincipalType]
  val OrganizationUnit = "OrganizationUnit".asInstanceOf[PrincipalType]
  val Account = "Account".asInstanceOf[PrincipalType]
  val User = "User".asInstanceOf[PrincipalType]
  val Role = "Role".asInstanceOf[PrincipalType]

  @inline def values: js.Array[PrincipalType] = js.Array(All, Service, OrganizationUnit, Account, User, Role)
}

@js.native
sealed trait ProductCodeValues extends js.Any
object ProductCodeValues {
  val devpay = "devpay".asInstanceOf[ProductCodeValues]
  val marketplace = "marketplace".asInstanceOf[ProductCodeValues]

  @inline def values: js.Array[ProductCodeValues] = js.Array(devpay, marketplace)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val tcp = "tcp".asInstanceOf[Protocol]
  val udp = "udp".asInstanceOf[Protocol]

  @inline def values: js.Array[Protocol] = js.Array(tcp, udp)
}

@js.native
sealed trait ProtocolValue extends js.Any
object ProtocolValue {
  val gre = "gre".asInstanceOf[ProtocolValue]

  @inline def values: js.Array[ProtocolValue] = js.Array(gre)
}

@js.native
sealed trait RIProductDescription extends js.Any
object RIProductDescription {
  val `Linux/UNIX` = "Linux/UNIX".asInstanceOf[RIProductDescription]
  val `Linux/UNIX (Amazon VPC)` = "Linux/UNIX (Amazon VPC)".asInstanceOf[RIProductDescription]
  val Windows = "Windows".asInstanceOf[RIProductDescription]
  val `Windows (Amazon VPC)` = "Windows (Amazon VPC)".asInstanceOf[RIProductDescription]

  @inline def values: js.Array[RIProductDescription] = js.Array(`Linux/UNIX`, `Linux/UNIX (Amazon VPC)`, Windows, `Windows (Amazon VPC)`)
}

@js.native
sealed trait RecurringChargeFrequency extends js.Any
object RecurringChargeFrequency {
  val Hourly = "Hourly".asInstanceOf[RecurringChargeFrequency]

  @inline def values: js.Array[RecurringChargeFrequency] = js.Array(Hourly)
}

@js.native
sealed trait ReplaceRootVolumeTaskState extends js.Any
object ReplaceRootVolumeTaskState {
  val pending = "pending".asInstanceOf[ReplaceRootVolumeTaskState]
  val `in-progress` = "in-progress".asInstanceOf[ReplaceRootVolumeTaskState]
  val failing = "failing".asInstanceOf[ReplaceRootVolumeTaskState]
  val succeeded = "succeeded".asInstanceOf[ReplaceRootVolumeTaskState]
  val failed = "failed".asInstanceOf[ReplaceRootVolumeTaskState]
  val `failed-detached` = "failed-detached".asInstanceOf[ReplaceRootVolumeTaskState]

  @inline def values: js.Array[ReplaceRootVolumeTaskState] = js.Array(pending, `in-progress`, failing, succeeded, failed, `failed-detached`)
}

@js.native
sealed trait ReplacementStrategy extends js.Any
object ReplacementStrategy {
  val launch = "launch".asInstanceOf[ReplacementStrategy]
  val `launch-before-terminate` = "launch-before-terminate".asInstanceOf[ReplacementStrategy]

  @inline def values: js.Array[ReplacementStrategy] = js.Array(launch, `launch-before-terminate`)
}

@js.native
sealed trait ReportInstanceReasonCodes extends js.Any
object ReportInstanceReasonCodes {
  val `instance-stuck-in-state` = "instance-stuck-in-state".asInstanceOf[ReportInstanceReasonCodes]
  val unresponsive = "unresponsive".asInstanceOf[ReportInstanceReasonCodes]
  val `not-accepting-credentials` = "not-accepting-credentials".asInstanceOf[ReportInstanceReasonCodes]
  val `password-not-available` = "password-not-available".asInstanceOf[ReportInstanceReasonCodes]
  val `performance-network` = "performance-network".asInstanceOf[ReportInstanceReasonCodes]
  val `performance-instance-store` = "performance-instance-store".asInstanceOf[ReportInstanceReasonCodes]
  val `performance-ebs-volume` = "performance-ebs-volume".asInstanceOf[ReportInstanceReasonCodes]
  val `performance-other` = "performance-other".asInstanceOf[ReportInstanceReasonCodes]
  val other = "other".asInstanceOf[ReportInstanceReasonCodes]

  @inline def values: js.Array[ReportInstanceReasonCodes] = js.Array(
    `instance-stuck-in-state`,
    unresponsive,
    `not-accepting-credentials`,
    `password-not-available`,
    `performance-network`,
    `performance-instance-store`,
    `performance-ebs-volume`,
    `performance-other`,
    other
  )
}

@js.native
sealed trait ReportStatusType extends js.Any
object ReportStatusType {
  val ok = "ok".asInstanceOf[ReportStatusType]
  val impaired = "impaired".asInstanceOf[ReportStatusType]

  @inline def values: js.Array[ReportStatusType] = js.Array(ok, impaired)
}

@js.native
sealed trait ReservationState extends js.Any
object ReservationState {
  val `payment-pending` = "payment-pending".asInstanceOf[ReservationState]
  val `payment-failed` = "payment-failed".asInstanceOf[ReservationState]
  val active = "active".asInstanceOf[ReservationState]
  val retired = "retired".asInstanceOf[ReservationState]

  @inline def values: js.Array[ReservationState] = js.Array(`payment-pending`, `payment-failed`, active, retired)
}

@js.native
sealed trait ReservedInstanceState extends js.Any
object ReservedInstanceState {
  val `payment-pending` = "payment-pending".asInstanceOf[ReservedInstanceState]
  val active = "active".asInstanceOf[ReservedInstanceState]
  val `payment-failed` = "payment-failed".asInstanceOf[ReservedInstanceState]
  val retired = "retired".asInstanceOf[ReservedInstanceState]
  val queued = "queued".asInstanceOf[ReservedInstanceState]
  val `queued-deleted` = "queued-deleted".asInstanceOf[ReservedInstanceState]

  @inline def values: js.Array[ReservedInstanceState] = js.Array(`payment-pending`, active, `payment-failed`, retired, queued, `queued-deleted`)
}

@js.native
sealed trait ResetFpgaImageAttributeName extends js.Any
object ResetFpgaImageAttributeName {
  val loadPermission = "loadPermission".asInstanceOf[ResetFpgaImageAttributeName]

  @inline def values: js.Array[ResetFpgaImageAttributeName] = js.Array(loadPermission)
}

@js.native
sealed trait ResetImageAttributeName extends js.Any
object ResetImageAttributeName {
  val launchPermission = "launchPermission".asInstanceOf[ResetImageAttributeName]

  @inline def values: js.Array[ResetImageAttributeName] = js.Array(launchPermission)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val `capacity-reservation` = "capacity-reservation".asInstanceOf[ResourceType]
  val `client-vpn-endpoint` = "client-vpn-endpoint".asInstanceOf[ResourceType]
  val `customer-gateway` = "customer-gateway".asInstanceOf[ResourceType]
  val `carrier-gateway` = "carrier-gateway".asInstanceOf[ResourceType]
  val `coip-pool` = "coip-pool".asInstanceOf[ResourceType]
  val `dedicated-host` = "dedicated-host".asInstanceOf[ResourceType]
  val `dhcp-options` = "dhcp-options".asInstanceOf[ResourceType]
  val `egress-only-internet-gateway` = "egress-only-internet-gateway".asInstanceOf[ResourceType]
  val `elastic-ip` = "elastic-ip".asInstanceOf[ResourceType]
  val `elastic-gpu` = "elastic-gpu".asInstanceOf[ResourceType]
  val `export-image-task` = "export-image-task".asInstanceOf[ResourceType]
  val `export-instance-task` = "export-instance-task".asInstanceOf[ResourceType]
  val fleet = "fleet".asInstanceOf[ResourceType]
  val `fpga-image` = "fpga-image".asInstanceOf[ResourceType]
  val `host-reservation` = "host-reservation".asInstanceOf[ResourceType]
  val image = "image".asInstanceOf[ResourceType]
  val `import-image-task` = "import-image-task".asInstanceOf[ResourceType]
  val `import-snapshot-task` = "import-snapshot-task".asInstanceOf[ResourceType]
  val instance = "instance".asInstanceOf[ResourceType]
  val `instance-event-window` = "instance-event-window".asInstanceOf[ResourceType]
  val `internet-gateway` = "internet-gateway".asInstanceOf[ResourceType]
  val ipam = "ipam".asInstanceOf[ResourceType]
  val `ipam-pool` = "ipam-pool".asInstanceOf[ResourceType]
  val `ipam-scope` = "ipam-scope".asInstanceOf[ResourceType]
  val `ipv4pool-ec2` = "ipv4pool-ec2".asInstanceOf[ResourceType]
  val `ipv6pool-ec2` = "ipv6pool-ec2".asInstanceOf[ResourceType]
  val `key-pair` = "key-pair".asInstanceOf[ResourceType]
  val `launch-template` = "launch-template".asInstanceOf[ResourceType]
  val `local-gateway` = "local-gateway".asInstanceOf[ResourceType]
  val `local-gateway-route-table` = "local-gateway-route-table".asInstanceOf[ResourceType]
  val `local-gateway-virtual-interface` = "local-gateway-virtual-interface".asInstanceOf[ResourceType]
  val `local-gateway-virtual-interface-group` = "local-gateway-virtual-interface-group".asInstanceOf[ResourceType]
  val `local-gateway-route-table-vpc-association` = "local-gateway-route-table-vpc-association".asInstanceOf[ResourceType]
  val `local-gateway-route-table-virtual-interface-group-association` = "local-gateway-route-table-virtual-interface-group-association".asInstanceOf[ResourceType]
  val natgateway = "natgateway".asInstanceOf[ResourceType]
  val `network-acl` = "network-acl".asInstanceOf[ResourceType]
  val `network-interface` = "network-interface".asInstanceOf[ResourceType]
  val `network-insights-analysis` = "network-insights-analysis".asInstanceOf[ResourceType]
  val `network-insights-path` = "network-insights-path".asInstanceOf[ResourceType]
  val `network-insights-access-scope` = "network-insights-access-scope".asInstanceOf[ResourceType]
  val `network-insights-access-scope-analysis` = "network-insights-access-scope-analysis".asInstanceOf[ResourceType]
  val `placement-group` = "placement-group".asInstanceOf[ResourceType]
  val `prefix-list` = "prefix-list".asInstanceOf[ResourceType]
  val `replace-root-volume-task` = "replace-root-volume-task".asInstanceOf[ResourceType]
  val `reserved-instances` = "reserved-instances".asInstanceOf[ResourceType]
  val `route-table` = "route-table".asInstanceOf[ResourceType]
  val `security-group` = "security-group".asInstanceOf[ResourceType]
  val `security-group-rule` = "security-group-rule".asInstanceOf[ResourceType]
  val snapshot = "snapshot".asInstanceOf[ResourceType]
  val `spot-fleet-request` = "spot-fleet-request".asInstanceOf[ResourceType]
  val `spot-instances-request` = "spot-instances-request".asInstanceOf[ResourceType]
  val subnet = "subnet".asInstanceOf[ResourceType]
  val `subnet-cidr-reservation` = "subnet-cidr-reservation".asInstanceOf[ResourceType]
  val `traffic-mirror-filter` = "traffic-mirror-filter".asInstanceOf[ResourceType]
  val `traffic-mirror-session` = "traffic-mirror-session".asInstanceOf[ResourceType]
  val `traffic-mirror-target` = "traffic-mirror-target".asInstanceOf[ResourceType]
  val `transit-gateway` = "transit-gateway".asInstanceOf[ResourceType]
  val `transit-gateway-attachment` = "transit-gateway-attachment".asInstanceOf[ResourceType]
  val `transit-gateway-connect-peer` = "transit-gateway-connect-peer".asInstanceOf[ResourceType]
  val `transit-gateway-multicast-domain` = "transit-gateway-multicast-domain".asInstanceOf[ResourceType]
  val `transit-gateway-policy-table` = "transit-gateway-policy-table".asInstanceOf[ResourceType]
  val `transit-gateway-route-table` = "transit-gateway-route-table".asInstanceOf[ResourceType]
  val `transit-gateway-route-table-announcement` = "transit-gateway-route-table-announcement".asInstanceOf[ResourceType]
  val volume = "volume".asInstanceOf[ResourceType]
  val vpc = "vpc".asInstanceOf[ResourceType]
  val `vpc-endpoint` = "vpc-endpoint".asInstanceOf[ResourceType]
  val `vpc-endpoint-connection` = "vpc-endpoint-connection".asInstanceOf[ResourceType]
  val `vpc-endpoint-service` = "vpc-endpoint-service".asInstanceOf[ResourceType]
  val `vpc-endpoint-service-permission` = "vpc-endpoint-service-permission".asInstanceOf[ResourceType]
  val `vpc-peering-connection` = "vpc-peering-connection".asInstanceOf[ResourceType]
  val `vpn-connection` = "vpn-connection".asInstanceOf[ResourceType]
  val `vpn-gateway` = "vpn-gateway".asInstanceOf[ResourceType]
  val `vpc-flow-log` = "vpc-flow-log".asInstanceOf[ResourceType]
  val `capacity-reservation-fleet` = "capacity-reservation-fleet".asInstanceOf[ResourceType]
  val `traffic-mirror-filter-rule` = "traffic-mirror-filter-rule".asInstanceOf[ResourceType]
  val `vpc-endpoint-connection-device-type` = "vpc-endpoint-connection-device-type".asInstanceOf[ResourceType]
  val `verified-access-instance` = "verified-access-instance".asInstanceOf[ResourceType]
  val `verified-access-group` = "verified-access-group".asInstanceOf[ResourceType]
  val `verified-access-endpoint` = "verified-access-endpoint".asInstanceOf[ResourceType]
  val `verified-access-policy` = "verified-access-policy".asInstanceOf[ResourceType]
  val `verified-access-trust-provider` = "verified-access-trust-provider".asInstanceOf[ResourceType]
  val `vpn-connection-device-type` = "vpn-connection-device-type".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(
    `capacity-reservation`,
    `client-vpn-endpoint`,
    `customer-gateway`,
    `carrier-gateway`,
    `coip-pool`,
    `dedicated-host`,
    `dhcp-options`,
    `egress-only-internet-gateway`,
    `elastic-ip`,
    `elastic-gpu`,
    `export-image-task`,
    `export-instance-task`,
    fleet,
    `fpga-image`,
    `host-reservation`,
    image,
    `import-image-task`,
    `import-snapshot-task`,
    instance,
    `instance-event-window`,
    `internet-gateway`,
    ipam,
    `ipam-pool`,
    `ipam-scope`,
    `ipv4pool-ec2`,
    `ipv6pool-ec2`,
    `key-pair`,
    `launch-template`,
    `local-gateway`,
    `local-gateway-route-table`,
    `local-gateway-virtual-interface`,
    `local-gateway-virtual-interface-group`,
    `local-gateway-route-table-vpc-association`,
    `local-gateway-route-table-virtual-interface-group-association`,
    natgateway,
    `network-acl`,
    `network-interface`,
    `network-insights-analysis`,
    `network-insights-path`,
    `network-insights-access-scope`,
    `network-insights-access-scope-analysis`,
    `placement-group`,
    `prefix-list`,
    `replace-root-volume-task`,
    `reserved-instances`,
    `route-table`,
    `security-group`,
    `security-group-rule`,
    snapshot,
    `spot-fleet-request`,
    `spot-instances-request`,
    subnet,
    `subnet-cidr-reservation`,
    `traffic-mirror-filter`,
    `traffic-mirror-session`,
    `traffic-mirror-target`,
    `transit-gateway`,
    `transit-gateway-attachment`,
    `transit-gateway-connect-peer`,
    `transit-gateway-multicast-domain`,
    `transit-gateway-policy-table`,
    `transit-gateway-route-table`,
    `transit-gateway-route-table-announcement`,
    volume,
    vpc,
    `vpc-endpoint`,
    `vpc-endpoint-connection`,
    `vpc-endpoint-service`,
    `vpc-endpoint-service-permission`,
    `vpc-peering-connection`,
    `vpn-connection`,
    `vpn-gateway`,
    `vpc-flow-log`,
    `capacity-reservation-fleet`,
    `traffic-mirror-filter-rule`,
    `vpc-endpoint-connection-device-type`,
    `verified-access-instance`,
    `verified-access-group`,
    `verified-access-endpoint`,
    `verified-access-policy`,
    `verified-access-trust-provider`,
    `vpn-connection-device-type`
  )
}

@js.native
sealed trait RootDeviceType extends js.Any
object RootDeviceType {
  val ebs = "ebs".asInstanceOf[RootDeviceType]
  val `instance-store` = "instance-store".asInstanceOf[RootDeviceType]

  @inline def values: js.Array[RootDeviceType] = js.Array(ebs, `instance-store`)
}

@js.native
sealed trait RouteOrigin extends js.Any
object RouteOrigin {
  val CreateRouteTable = "CreateRouteTable".asInstanceOf[RouteOrigin]
  val CreateRoute = "CreateRoute".asInstanceOf[RouteOrigin]
  val EnableVgwRoutePropagation = "EnableVgwRoutePropagation".asInstanceOf[RouteOrigin]

  @inline def values: js.Array[RouteOrigin] = js.Array(CreateRouteTable, CreateRoute, EnableVgwRoutePropagation)
}

@js.native
sealed trait RouteState extends js.Any
object RouteState {
  val active = "active".asInstanceOf[RouteState]
  val blackhole = "blackhole".asInstanceOf[RouteState]

  @inline def values: js.Array[RouteState] = js.Array(active, blackhole)
}

@js.native
sealed trait RouteTableAssociationStateCode extends js.Any
object RouteTableAssociationStateCode {
  val associating = "associating".asInstanceOf[RouteTableAssociationStateCode]
  val associated = "associated".asInstanceOf[RouteTableAssociationStateCode]
  val disassociating = "disassociating".asInstanceOf[RouteTableAssociationStateCode]
  val disassociated = "disassociated".asInstanceOf[RouteTableAssociationStateCode]
  val failed = "failed".asInstanceOf[RouteTableAssociationStateCode]

  @inline def values: js.Array[RouteTableAssociationStateCode] = js.Array(associating, associated, disassociating, disassociated, failed)
}

@js.native
sealed trait RuleAction extends js.Any
object RuleAction {
  val allow = "allow".asInstanceOf[RuleAction]
  val deny = "deny".asInstanceOf[RuleAction]

  @inline def values: js.Array[RuleAction] = js.Array(allow, deny)
}

@js.native
sealed trait SelfServicePortal extends js.Any
object SelfServicePortal {
  val enabled = "enabled".asInstanceOf[SelfServicePortal]
  val disabled = "disabled".asInstanceOf[SelfServicePortal]

  @inline def values: js.Array[SelfServicePortal] = js.Array(enabled, disabled)
}

@js.native
sealed trait ServiceConnectivityType extends js.Any
object ServiceConnectivityType {
  val ipv4 = "ipv4".asInstanceOf[ServiceConnectivityType]
  val ipv6 = "ipv6".asInstanceOf[ServiceConnectivityType]

  @inline def values: js.Array[ServiceConnectivityType] = js.Array(ipv4, ipv6)
}

@js.native
sealed trait ServiceState extends js.Any
object ServiceState {
  val Pending = "Pending".asInstanceOf[ServiceState]
  val Available = "Available".asInstanceOf[ServiceState]
  val Deleting = "Deleting".asInstanceOf[ServiceState]
  val Deleted = "Deleted".asInstanceOf[ServiceState]
  val Failed = "Failed".asInstanceOf[ServiceState]

  @inline def values: js.Array[ServiceState] = js.Array(Pending, Available, Deleting, Deleted, Failed)
}

@js.native
sealed trait ServiceType extends js.Any
object ServiceType {
  val Interface = "Interface".asInstanceOf[ServiceType]
  val Gateway = "Gateway".asInstanceOf[ServiceType]
  val GatewayLoadBalancer = "GatewayLoadBalancer".asInstanceOf[ServiceType]

  @inline def values: js.Array[ServiceType] = js.Array(Interface, Gateway, GatewayLoadBalancer)
}

@js.native
sealed trait ShutdownBehavior extends js.Any
object ShutdownBehavior {
  val stop = "stop".asInstanceOf[ShutdownBehavior]
  val terminate = "terminate".asInstanceOf[ShutdownBehavior]

  @inline def values: js.Array[ShutdownBehavior] = js.Array(stop, terminate)
}

@js.native
sealed trait SnapshotAttributeName extends js.Any
object SnapshotAttributeName {
  val productCodes = "productCodes".asInstanceOf[SnapshotAttributeName]
  val createVolumePermission = "createVolumePermission".asInstanceOf[SnapshotAttributeName]

  @inline def values: js.Array[SnapshotAttributeName] = js.Array(productCodes, createVolumePermission)
}

@js.native
sealed trait SnapshotState extends js.Any
object SnapshotState {
  val pending = "pending".asInstanceOf[SnapshotState]
  val completed = "completed".asInstanceOf[SnapshotState]
  val error = "error".asInstanceOf[SnapshotState]
  val recoverable = "recoverable".asInstanceOf[SnapshotState]
  val recovering = "recovering".asInstanceOf[SnapshotState]

  @inline def values: js.Array[SnapshotState] = js.Array(pending, completed, error, recoverable, recovering)
}

@js.native
sealed trait SpotAllocationStrategy extends js.Any
object SpotAllocationStrategy {
  val `lowest-price` = "lowest-price".asInstanceOf[SpotAllocationStrategy]
  val diversified = "diversified".asInstanceOf[SpotAllocationStrategy]
  val `capacity-optimized` = "capacity-optimized".asInstanceOf[SpotAllocationStrategy]
  val `capacity-optimized-prioritized` = "capacity-optimized-prioritized".asInstanceOf[SpotAllocationStrategy]
  val `price-capacity-optimized` = "price-capacity-optimized".asInstanceOf[SpotAllocationStrategy]

  @inline def values: js.Array[SpotAllocationStrategy] = js.Array(`lowest-price`, diversified, `capacity-optimized`, `capacity-optimized-prioritized`, `price-capacity-optimized`)
}

@js.native
sealed trait SpotInstanceInterruptionBehavior extends js.Any
object SpotInstanceInterruptionBehavior {
  val hibernate = "hibernate".asInstanceOf[SpotInstanceInterruptionBehavior]
  val stop = "stop".asInstanceOf[SpotInstanceInterruptionBehavior]
  val terminate = "terminate".asInstanceOf[SpotInstanceInterruptionBehavior]

  @inline def values: js.Array[SpotInstanceInterruptionBehavior] = js.Array(hibernate, stop, terminate)
}

@js.native
sealed trait SpotInstanceState extends js.Any
object SpotInstanceState {
  val open = "open".asInstanceOf[SpotInstanceState]
  val active = "active".asInstanceOf[SpotInstanceState]
  val closed = "closed".asInstanceOf[SpotInstanceState]
  val cancelled = "cancelled".asInstanceOf[SpotInstanceState]
  val failed = "failed".asInstanceOf[SpotInstanceState]

  @inline def values: js.Array[SpotInstanceState] = js.Array(open, active, closed, cancelled, failed)
}

@js.native
sealed trait SpotInstanceType extends js.Any
object SpotInstanceType {
  val `one-time` = "one-time".asInstanceOf[SpotInstanceType]
  val persistent = "persistent".asInstanceOf[SpotInstanceType]

  @inline def values: js.Array[SpotInstanceType] = js.Array(`one-time`, persistent)
}

@js.native
sealed trait SpreadLevel extends js.Any
object SpreadLevel {
  val host = "host".asInstanceOf[SpreadLevel]
  val rack = "rack".asInstanceOf[SpreadLevel]

  @inline def values: js.Array[SpreadLevel] = js.Array(host, rack)
}

@js.native
sealed trait State extends js.Any
object State {
  val PendingAcceptance = "PendingAcceptance".asInstanceOf[State]
  val Pending = "Pending".asInstanceOf[State]
  val Available = "Available".asInstanceOf[State]
  val Deleting = "Deleting".asInstanceOf[State]
  val Deleted = "Deleted".asInstanceOf[State]
  val Rejected = "Rejected".asInstanceOf[State]
  val Failed = "Failed".asInstanceOf[State]
  val Expired = "Expired".asInstanceOf[State]

  @inline def values: js.Array[State] = js.Array(PendingAcceptance, Pending, Available, Deleting, Deleted, Rejected, Failed, Expired)
}

@js.native
sealed trait StaticSourcesSupportValue extends js.Any
object StaticSourcesSupportValue {
  val enable = "enable".asInstanceOf[StaticSourcesSupportValue]
  val disable = "disable".asInstanceOf[StaticSourcesSupportValue]

  @inline def values: js.Array[StaticSourcesSupportValue] = js.Array(enable, disable)
}

@js.native
sealed trait StatisticType extends js.Any
object StatisticType {
  val p50 = "p50".asInstanceOf[StatisticType]

  @inline def values: js.Array[StatisticType] = js.Array(p50)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val MoveInProgress = "MoveInProgress".asInstanceOf[Status]
  val InVpc = "InVpc".asInstanceOf[Status]
  val InClassic = "InClassic".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(MoveInProgress, InVpc, InClassic)
}

@js.native
sealed trait StatusName extends js.Any
object StatusName {
  val reachability = "reachability".asInstanceOf[StatusName]

  @inline def values: js.Array[StatusName] = js.Array(reachability)
}

@js.native
sealed trait StatusType extends js.Any
object StatusType {
  val passed = "passed".asInstanceOf[StatusType]
  val failed = "failed".asInstanceOf[StatusType]
  val `insufficient-data` = "insufficient-data".asInstanceOf[StatusType]
  val initializing = "initializing".asInstanceOf[StatusType]

  @inline def values: js.Array[StatusType] = js.Array(passed, failed, `insufficient-data`, initializing)
}

@js.native
sealed trait StorageTier extends js.Any
object StorageTier {
  val archive = "archive".asInstanceOf[StorageTier]
  val standard = "standard".asInstanceOf[StorageTier]

  @inline def values: js.Array[StorageTier] = js.Array(archive, standard)
}

@js.native
sealed trait SubnetCidrBlockStateCode extends js.Any
object SubnetCidrBlockStateCode {
  val associating = "associating".asInstanceOf[SubnetCidrBlockStateCode]
  val associated = "associated".asInstanceOf[SubnetCidrBlockStateCode]
  val disassociating = "disassociating".asInstanceOf[SubnetCidrBlockStateCode]
  val disassociated = "disassociated".asInstanceOf[SubnetCidrBlockStateCode]
  val failing = "failing".asInstanceOf[SubnetCidrBlockStateCode]
  val failed = "failed".asInstanceOf[SubnetCidrBlockStateCode]

  @inline def values: js.Array[SubnetCidrBlockStateCode] = js.Array(associating, associated, disassociating, disassociated, failing, failed)
}

@js.native
sealed trait SubnetCidrReservationType extends js.Any
object SubnetCidrReservationType {
  val prefix = "prefix".asInstanceOf[SubnetCidrReservationType]
  val explicit = "explicit".asInstanceOf[SubnetCidrReservationType]

  @inline def values: js.Array[SubnetCidrReservationType] = js.Array(prefix, explicit)
}

@js.native
sealed trait SubnetState extends js.Any
object SubnetState {
  val pending = "pending".asInstanceOf[SubnetState]
  val available = "available".asInstanceOf[SubnetState]

  @inline def values: js.Array[SubnetState] = js.Array(pending, available)
}

@js.native
sealed trait SummaryStatus extends js.Any
object SummaryStatus {
  val ok = "ok".asInstanceOf[SummaryStatus]
  val impaired = "impaired".asInstanceOf[SummaryStatus]
  val `insufficient-data` = "insufficient-data".asInstanceOf[SummaryStatus]
  val `not-applicable` = "not-applicable".asInstanceOf[SummaryStatus]
  val initializing = "initializing".asInstanceOf[SummaryStatus]

  @inline def values: js.Array[SummaryStatus] = js.Array(ok, impaired, `insufficient-data`, `not-applicable`, initializing)
}

@js.native
sealed trait TargetCapacityUnitType extends js.Any
object TargetCapacityUnitType {
  val vcpu = "vcpu".asInstanceOf[TargetCapacityUnitType]
  val `memory-mib` = "memory-mib".asInstanceOf[TargetCapacityUnitType]
  val units = "units".asInstanceOf[TargetCapacityUnitType]

  @inline def values: js.Array[TargetCapacityUnitType] = js.Array(vcpu, `memory-mib`, units)
}

@js.native
sealed trait TargetStorageTier extends js.Any
object TargetStorageTier {
  val archive = "archive".asInstanceOf[TargetStorageTier]

  @inline def values: js.Array[TargetStorageTier] = js.Array(archive)
}

@js.native
sealed trait TelemetryStatus extends js.Any
object TelemetryStatus {
  val UP = "UP".asInstanceOf[TelemetryStatus]
  val DOWN = "DOWN".asInstanceOf[TelemetryStatus]

  @inline def values: js.Array[TelemetryStatus] = js.Array(UP, DOWN)
}

@js.native
sealed trait Tenancy extends js.Any
object Tenancy {
  val default = "default".asInstanceOf[Tenancy]
  val dedicated = "dedicated".asInstanceOf[Tenancy]
  val host = "host".asInstanceOf[Tenancy]

  @inline def values: js.Array[Tenancy] = js.Array(default, dedicated, host)
}

@js.native
sealed trait TieringOperationStatus extends js.Any
object TieringOperationStatus {
  val `archival-in-progress` = "archival-in-progress".asInstanceOf[TieringOperationStatus]
  val `archival-completed` = "archival-completed".asInstanceOf[TieringOperationStatus]
  val `archival-failed` = "archival-failed".asInstanceOf[TieringOperationStatus]
  val `temporary-restore-in-progress` = "temporary-restore-in-progress".asInstanceOf[TieringOperationStatus]
  val `temporary-restore-completed` = "temporary-restore-completed".asInstanceOf[TieringOperationStatus]
  val `temporary-restore-failed` = "temporary-restore-failed".asInstanceOf[TieringOperationStatus]
  val `permanent-restore-in-progress` = "permanent-restore-in-progress".asInstanceOf[TieringOperationStatus]
  val `permanent-restore-completed` = "permanent-restore-completed".asInstanceOf[TieringOperationStatus]
  val `permanent-restore-failed` = "permanent-restore-failed".asInstanceOf[TieringOperationStatus]

  @inline def values: js.Array[TieringOperationStatus] = js.Array(
    `archival-in-progress`,
    `archival-completed`,
    `archival-failed`,
    `temporary-restore-in-progress`,
    `temporary-restore-completed`,
    `temporary-restore-failed`,
    `permanent-restore-in-progress`,
    `permanent-restore-completed`,
    `permanent-restore-failed`
  )
}

@js.native
sealed trait TpmSupportValues extends js.Any
object TpmSupportValues {
  val `v2.0` = "v2.0".asInstanceOf[TpmSupportValues]

  @inline def values: js.Array[TpmSupportValues] = js.Array(`v2.0`)
}

@js.native
sealed trait TrafficDirection extends js.Any
object TrafficDirection {
  val ingress = "ingress".asInstanceOf[TrafficDirection]
  val egress = "egress".asInstanceOf[TrafficDirection]

  @inline def values: js.Array[TrafficDirection] = js.Array(ingress, egress)
}

@js.native
sealed trait TrafficMirrorFilterRuleField extends js.Any
object TrafficMirrorFilterRuleField {
  val `destination-port-range` = "destination-port-range".asInstanceOf[TrafficMirrorFilterRuleField]
  val `source-port-range` = "source-port-range".asInstanceOf[TrafficMirrorFilterRuleField]
  val protocol = "protocol".asInstanceOf[TrafficMirrorFilterRuleField]
  val description = "description".asInstanceOf[TrafficMirrorFilterRuleField]

  @inline def values: js.Array[TrafficMirrorFilterRuleField] = js.Array(`destination-port-range`, `source-port-range`, protocol, description)
}

@js.native
sealed trait TrafficMirrorNetworkService extends js.Any
object TrafficMirrorNetworkService {
  val `amazon-dns` = "amazon-dns".asInstanceOf[TrafficMirrorNetworkService]

  @inline def values: js.Array[TrafficMirrorNetworkService] = js.Array(`amazon-dns`)
}

@js.native
sealed trait TrafficMirrorRuleAction extends js.Any
object TrafficMirrorRuleAction {
  val accept = "accept".asInstanceOf[TrafficMirrorRuleAction]
  val reject = "reject".asInstanceOf[TrafficMirrorRuleAction]

  @inline def values: js.Array[TrafficMirrorRuleAction] = js.Array(accept, reject)
}

@js.native
sealed trait TrafficMirrorSessionField extends js.Any
object TrafficMirrorSessionField {
  val `packet-length` = "packet-length".asInstanceOf[TrafficMirrorSessionField]
  val description = "description".asInstanceOf[TrafficMirrorSessionField]
  val `virtual-network-id` = "virtual-network-id".asInstanceOf[TrafficMirrorSessionField]

  @inline def values: js.Array[TrafficMirrorSessionField] = js.Array(`packet-length`, description, `virtual-network-id`)
}

@js.native
sealed trait TrafficMirrorTargetType extends js.Any
object TrafficMirrorTargetType {
  val `network-interface` = "network-interface".asInstanceOf[TrafficMirrorTargetType]
  val `network-load-balancer` = "network-load-balancer".asInstanceOf[TrafficMirrorTargetType]
  val `gateway-load-balancer-endpoint` = "gateway-load-balancer-endpoint".asInstanceOf[TrafficMirrorTargetType]

  @inline def values: js.Array[TrafficMirrorTargetType] = js.Array(`network-interface`, `network-load-balancer`, `gateway-load-balancer-endpoint`)
}

@js.native
sealed trait TrafficType extends js.Any
object TrafficType {
  val ACCEPT = "ACCEPT".asInstanceOf[TrafficType]
  val REJECT = "REJECT".asInstanceOf[TrafficType]
  val ALL = "ALL".asInstanceOf[TrafficType]

  @inline def values: js.Array[TrafficType] = js.Array(ACCEPT, REJECT, ALL)
}

@js.native
sealed trait TransitGatewayAssociationState extends js.Any
object TransitGatewayAssociationState {
  val associating = "associating".asInstanceOf[TransitGatewayAssociationState]
  val associated = "associated".asInstanceOf[TransitGatewayAssociationState]
  val disassociating = "disassociating".asInstanceOf[TransitGatewayAssociationState]
  val disassociated = "disassociated".asInstanceOf[TransitGatewayAssociationState]

  @inline def values: js.Array[TransitGatewayAssociationState] = js.Array(associating, associated, disassociating, disassociated)
}

@js.native
sealed trait TransitGatewayAttachmentResourceType extends js.Any
object TransitGatewayAttachmentResourceType {
  val vpc = "vpc".asInstanceOf[TransitGatewayAttachmentResourceType]
  val vpn = "vpn".asInstanceOf[TransitGatewayAttachmentResourceType]
  val `direct-connect-gateway` = "direct-connect-gateway".asInstanceOf[TransitGatewayAttachmentResourceType]
  val connect = "connect".asInstanceOf[TransitGatewayAttachmentResourceType]
  val peering = "peering".asInstanceOf[TransitGatewayAttachmentResourceType]
  val `tgw-peering` = "tgw-peering".asInstanceOf[TransitGatewayAttachmentResourceType]

  @inline def values: js.Array[TransitGatewayAttachmentResourceType] = js.Array(vpc, vpn, `direct-connect-gateway`, connect, peering, `tgw-peering`)
}

@js.native
sealed trait TransitGatewayAttachmentState extends js.Any
object TransitGatewayAttachmentState {
  val initiating = "initiating".asInstanceOf[TransitGatewayAttachmentState]
  val initiatingRequest = "initiatingRequest".asInstanceOf[TransitGatewayAttachmentState]
  val pendingAcceptance = "pendingAcceptance".asInstanceOf[TransitGatewayAttachmentState]
  val rollingBack = "rollingBack".asInstanceOf[TransitGatewayAttachmentState]
  val pending = "pending".asInstanceOf[TransitGatewayAttachmentState]
  val available = "available".asInstanceOf[TransitGatewayAttachmentState]
  val modifying = "modifying".asInstanceOf[TransitGatewayAttachmentState]
  val deleting = "deleting".asInstanceOf[TransitGatewayAttachmentState]
  val deleted = "deleted".asInstanceOf[TransitGatewayAttachmentState]
  val failed = "failed".asInstanceOf[TransitGatewayAttachmentState]
  val rejected = "rejected".asInstanceOf[TransitGatewayAttachmentState]
  val rejecting = "rejecting".asInstanceOf[TransitGatewayAttachmentState]
  val failing = "failing".asInstanceOf[TransitGatewayAttachmentState]

  @inline def values: js.Array[TransitGatewayAttachmentState] = js.Array(initiating, initiatingRequest, pendingAcceptance, rollingBack, pending, available, modifying, deleting, deleted, failed, rejected, rejecting, failing)
}

@js.native
sealed trait TransitGatewayConnectPeerState extends js.Any
object TransitGatewayConnectPeerState {
  val pending = "pending".asInstanceOf[TransitGatewayConnectPeerState]
  val available = "available".asInstanceOf[TransitGatewayConnectPeerState]
  val deleting = "deleting".asInstanceOf[TransitGatewayConnectPeerState]
  val deleted = "deleted".asInstanceOf[TransitGatewayConnectPeerState]

  @inline def values: js.Array[TransitGatewayConnectPeerState] = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait TransitGatewayMulitcastDomainAssociationState extends js.Any
object TransitGatewayMulitcastDomainAssociationState {
  val pendingAcceptance = "pendingAcceptance".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]
  val associating = "associating".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]
  val associated = "associated".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]
  val disassociating = "disassociating".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]
  val disassociated = "disassociated".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]
  val rejected = "rejected".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]
  val failed = "failed".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]

  @inline def values: js.Array[TransitGatewayMulitcastDomainAssociationState] = js.Array(pendingAcceptance, associating, associated, disassociating, disassociated, rejected, failed)
}

@js.native
sealed trait TransitGatewayMulticastDomainState extends js.Any
object TransitGatewayMulticastDomainState {
  val pending = "pending".asInstanceOf[TransitGatewayMulticastDomainState]
  val available = "available".asInstanceOf[TransitGatewayMulticastDomainState]
  val deleting = "deleting".asInstanceOf[TransitGatewayMulticastDomainState]
  val deleted = "deleted".asInstanceOf[TransitGatewayMulticastDomainState]

  @inline def values: js.Array[TransitGatewayMulticastDomainState] = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait TransitGatewayPolicyTableState extends js.Any
object TransitGatewayPolicyTableState {
  val pending = "pending".asInstanceOf[TransitGatewayPolicyTableState]
  val available = "available".asInstanceOf[TransitGatewayPolicyTableState]
  val deleting = "deleting".asInstanceOf[TransitGatewayPolicyTableState]
  val deleted = "deleted".asInstanceOf[TransitGatewayPolicyTableState]

  @inline def values: js.Array[TransitGatewayPolicyTableState] = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait TransitGatewayPrefixListReferenceState extends js.Any
object TransitGatewayPrefixListReferenceState {
  val pending = "pending".asInstanceOf[TransitGatewayPrefixListReferenceState]
  val available = "available".asInstanceOf[TransitGatewayPrefixListReferenceState]
  val modifying = "modifying".asInstanceOf[TransitGatewayPrefixListReferenceState]
  val deleting = "deleting".asInstanceOf[TransitGatewayPrefixListReferenceState]

  @inline def values: js.Array[TransitGatewayPrefixListReferenceState] = js.Array(pending, available, modifying, deleting)
}

@js.native
sealed trait TransitGatewayPropagationState extends js.Any
object TransitGatewayPropagationState {
  val enabling = "enabling".asInstanceOf[TransitGatewayPropagationState]
  val enabled = "enabled".asInstanceOf[TransitGatewayPropagationState]
  val disabling = "disabling".asInstanceOf[TransitGatewayPropagationState]
  val disabled = "disabled".asInstanceOf[TransitGatewayPropagationState]

  @inline def values: js.Array[TransitGatewayPropagationState] = js.Array(enabling, enabled, disabling, disabled)
}

@js.native
sealed trait TransitGatewayRouteState extends js.Any
object TransitGatewayRouteState {
  val pending = "pending".asInstanceOf[TransitGatewayRouteState]
  val active = "active".asInstanceOf[TransitGatewayRouteState]
  val blackhole = "blackhole".asInstanceOf[TransitGatewayRouteState]
  val deleting = "deleting".asInstanceOf[TransitGatewayRouteState]
  val deleted = "deleted".asInstanceOf[TransitGatewayRouteState]

  @inline def values: js.Array[TransitGatewayRouteState] = js.Array(pending, active, blackhole, deleting, deleted)
}

@js.native
sealed trait TransitGatewayRouteTableAnnouncementDirection extends js.Any
object TransitGatewayRouteTableAnnouncementDirection {
  val outgoing = "outgoing".asInstanceOf[TransitGatewayRouteTableAnnouncementDirection]
  val incoming = "incoming".asInstanceOf[TransitGatewayRouteTableAnnouncementDirection]

  @inline def values: js.Array[TransitGatewayRouteTableAnnouncementDirection] = js.Array(outgoing, incoming)
}

@js.native
sealed trait TransitGatewayRouteTableAnnouncementState extends js.Any
object TransitGatewayRouteTableAnnouncementState {
  val available = "available".asInstanceOf[TransitGatewayRouteTableAnnouncementState]
  val pending = "pending".asInstanceOf[TransitGatewayRouteTableAnnouncementState]
  val failing = "failing".asInstanceOf[TransitGatewayRouteTableAnnouncementState]
  val failed = "failed".asInstanceOf[TransitGatewayRouteTableAnnouncementState]
  val deleting = "deleting".asInstanceOf[TransitGatewayRouteTableAnnouncementState]
  val deleted = "deleted".asInstanceOf[TransitGatewayRouteTableAnnouncementState]

  @inline def values: js.Array[TransitGatewayRouteTableAnnouncementState] = js.Array(available, pending, failing, failed, deleting, deleted)
}

@js.native
sealed trait TransitGatewayRouteTableState extends js.Any
object TransitGatewayRouteTableState {
  val pending = "pending".asInstanceOf[TransitGatewayRouteTableState]
  val available = "available".asInstanceOf[TransitGatewayRouteTableState]
  val deleting = "deleting".asInstanceOf[TransitGatewayRouteTableState]
  val deleted = "deleted".asInstanceOf[TransitGatewayRouteTableState]

  @inline def values: js.Array[TransitGatewayRouteTableState] = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait TransitGatewayRouteType extends js.Any
object TransitGatewayRouteType {
  val static = "static".asInstanceOf[TransitGatewayRouteType]
  val propagated = "propagated".asInstanceOf[TransitGatewayRouteType]

  @inline def values: js.Array[TransitGatewayRouteType] = js.Array(static, propagated)
}

@js.native
sealed trait TransitGatewayState extends js.Any
object TransitGatewayState {
  val pending = "pending".asInstanceOf[TransitGatewayState]
  val available = "available".asInstanceOf[TransitGatewayState]
  val modifying = "modifying".asInstanceOf[TransitGatewayState]
  val deleting = "deleting".asInstanceOf[TransitGatewayState]
  val deleted = "deleted".asInstanceOf[TransitGatewayState]

  @inline def values: js.Array[TransitGatewayState] = js.Array(pending, available, modifying, deleting, deleted)
}

@js.native
sealed trait TransportProtocol extends js.Any
object TransportProtocol {
  val tcp = "tcp".asInstanceOf[TransportProtocol]
  val udp = "udp".asInstanceOf[TransportProtocol]

  @inline def values: js.Array[TransportProtocol] = js.Array(tcp, udp)
}

@js.native
sealed trait TrustProviderType extends js.Any
object TrustProviderType {
  val user = "user".asInstanceOf[TrustProviderType]
  val device = "device".asInstanceOf[TrustProviderType]

  @inline def values: js.Array[TrustProviderType] = js.Array(user, device)
}

@js.native
sealed trait TunnelInsideIpVersion extends js.Any
object TunnelInsideIpVersion {
  val ipv4 = "ipv4".asInstanceOf[TunnelInsideIpVersion]
  val ipv6 = "ipv6".asInstanceOf[TunnelInsideIpVersion]

  @inline def values: js.Array[TunnelInsideIpVersion] = js.Array(ipv4, ipv6)
}

@js.native
sealed trait UnlimitedSupportedInstanceFamily extends js.Any
object UnlimitedSupportedInstanceFamily {
  val t2 = "t2".asInstanceOf[UnlimitedSupportedInstanceFamily]
  val t3 = "t3".asInstanceOf[UnlimitedSupportedInstanceFamily]
  val t3a = "t3a".asInstanceOf[UnlimitedSupportedInstanceFamily]
  val t4g = "t4g".asInstanceOf[UnlimitedSupportedInstanceFamily]

  @inline def values: js.Array[UnlimitedSupportedInstanceFamily] = js.Array(t2, t3, t3a, t4g)
}

@js.native
sealed trait UnsuccessfulInstanceCreditSpecificationErrorCode extends js.Any
object UnsuccessfulInstanceCreditSpecificationErrorCode {
  val `InvalidInstanceID.Malformed` = "InvalidInstanceID.Malformed".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]
  val `InvalidInstanceID.NotFound` = "InvalidInstanceID.NotFound".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]
  val IncorrectInstanceState = "IncorrectInstanceState".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]
  val `InstanceCreditSpecification.NotSupported` = "InstanceCreditSpecification.NotSupported".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]

  @inline def values: js.Array[UnsuccessfulInstanceCreditSpecificationErrorCode] = js.Array(`InvalidInstanceID.Malformed`, `InvalidInstanceID.NotFound`, IncorrectInstanceState, `InstanceCreditSpecification.NotSupported`)
}

@js.native
sealed trait UsageClassType extends js.Any
object UsageClassType {
  val spot = "spot".asInstanceOf[UsageClassType]
  val `on-demand` = "on-demand".asInstanceOf[UsageClassType]

  @inline def values: js.Array[UsageClassType] = js.Array(spot, `on-demand`)
}

@js.native
sealed trait UserTrustProviderType extends js.Any
object UserTrustProviderType {
  val `iam-identity-center` = "iam-identity-center".asInstanceOf[UserTrustProviderType]
  val oidc = "oidc".asInstanceOf[UserTrustProviderType]

  @inline def values: js.Array[UserTrustProviderType] = js.Array(`iam-identity-center`, oidc)
}

@js.native
sealed trait VerifiedAccessEndpointAttachmentType extends js.Any
object VerifiedAccessEndpointAttachmentType {
  val vpc = "vpc".asInstanceOf[VerifiedAccessEndpointAttachmentType]

  @inline def values: js.Array[VerifiedAccessEndpointAttachmentType] = js.Array(vpc)
}

@js.native
sealed trait VerifiedAccessEndpointProtocol extends js.Any
object VerifiedAccessEndpointProtocol {
  val http = "http".asInstanceOf[VerifiedAccessEndpointProtocol]
  val https = "https".asInstanceOf[VerifiedAccessEndpointProtocol]

  @inline def values: js.Array[VerifiedAccessEndpointProtocol] = js.Array(http, https)
}

@js.native
sealed trait VerifiedAccessEndpointStatusCode extends js.Any
object VerifiedAccessEndpointStatusCode {
  val pending = "pending".asInstanceOf[VerifiedAccessEndpointStatusCode]
  val active = "active".asInstanceOf[VerifiedAccessEndpointStatusCode]
  val updating = "updating".asInstanceOf[VerifiedAccessEndpointStatusCode]
  val deleting = "deleting".asInstanceOf[VerifiedAccessEndpointStatusCode]
  val deleted = "deleted".asInstanceOf[VerifiedAccessEndpointStatusCode]

  @inline def values: js.Array[VerifiedAccessEndpointStatusCode] = js.Array(pending, active, updating, deleting, deleted)
}

@js.native
sealed trait VerifiedAccessEndpointType extends js.Any
object VerifiedAccessEndpointType {
  val `load-balancer` = "load-balancer".asInstanceOf[VerifiedAccessEndpointType]
  val `network-interface` = "network-interface".asInstanceOf[VerifiedAccessEndpointType]

  @inline def values: js.Array[VerifiedAccessEndpointType] = js.Array(`load-balancer`, `network-interface`)
}

@js.native
sealed trait VerifiedAccessLogDeliveryStatusCode extends js.Any
object VerifiedAccessLogDeliveryStatusCode {
  val success = "success".asInstanceOf[VerifiedAccessLogDeliveryStatusCode]
  val failed = "failed".asInstanceOf[VerifiedAccessLogDeliveryStatusCode]

  @inline def values: js.Array[VerifiedAccessLogDeliveryStatusCode] = js.Array(success, failed)
}

@js.native
sealed trait VirtualizationType extends js.Any
object VirtualizationType {
  val hvm = "hvm".asInstanceOf[VirtualizationType]
  val paravirtual = "paravirtual".asInstanceOf[VirtualizationType]

  @inline def values: js.Array[VirtualizationType] = js.Array(hvm, paravirtual)
}

@js.native
sealed trait VolumeAttachmentState extends js.Any
object VolumeAttachmentState {
  val attaching = "attaching".asInstanceOf[VolumeAttachmentState]
  val attached = "attached".asInstanceOf[VolumeAttachmentState]
  val detaching = "detaching".asInstanceOf[VolumeAttachmentState]
  val detached = "detached".asInstanceOf[VolumeAttachmentState]
  val busy = "busy".asInstanceOf[VolumeAttachmentState]

  @inline def values: js.Array[VolumeAttachmentState] = js.Array(attaching, attached, detaching, detached, busy)
}

@js.native
sealed trait VolumeAttributeName extends js.Any
object VolumeAttributeName {
  val autoEnableIO = "autoEnableIO".asInstanceOf[VolumeAttributeName]
  val productCodes = "productCodes".asInstanceOf[VolumeAttributeName]

  @inline def values: js.Array[VolumeAttributeName] = js.Array(autoEnableIO, productCodes)
}

@js.native
sealed trait VolumeModificationState extends js.Any
object VolumeModificationState {
  val modifying = "modifying".asInstanceOf[VolumeModificationState]
  val optimizing = "optimizing".asInstanceOf[VolumeModificationState]
  val completed = "completed".asInstanceOf[VolumeModificationState]
  val failed = "failed".asInstanceOf[VolumeModificationState]

  @inline def values: js.Array[VolumeModificationState] = js.Array(modifying, optimizing, completed, failed)
}

@js.native
sealed trait VolumeState extends js.Any
object VolumeState {
  val creating = "creating".asInstanceOf[VolumeState]
  val available = "available".asInstanceOf[VolumeState]
  val `in-use` = "in-use".asInstanceOf[VolumeState]
  val deleting = "deleting".asInstanceOf[VolumeState]
  val deleted = "deleted".asInstanceOf[VolumeState]
  val error = "error".asInstanceOf[VolumeState]

  @inline def values: js.Array[VolumeState] = js.Array(creating, available, `in-use`, deleting, deleted, error)
}

@js.native
sealed trait VolumeStatusInfoStatus extends js.Any
object VolumeStatusInfoStatus {
  val ok = "ok".asInstanceOf[VolumeStatusInfoStatus]
  val impaired = "impaired".asInstanceOf[VolumeStatusInfoStatus]
  val `insufficient-data` = "insufficient-data".asInstanceOf[VolumeStatusInfoStatus]

  @inline def values: js.Array[VolumeStatusInfoStatus] = js.Array(ok, impaired, `insufficient-data`)
}

@js.native
sealed trait VolumeStatusName extends js.Any
object VolumeStatusName {
  val `io-enabled` = "io-enabled".asInstanceOf[VolumeStatusName]
  val `io-performance` = "io-performance".asInstanceOf[VolumeStatusName]

  @inline def values: js.Array[VolumeStatusName] = js.Array(`io-enabled`, `io-performance`)
}

@js.native
sealed trait VolumeType extends js.Any
object VolumeType {
  val standard = "standard".asInstanceOf[VolumeType]
  val io1 = "io1".asInstanceOf[VolumeType]
  val io2 = "io2".asInstanceOf[VolumeType]
  val gp2 = "gp2".asInstanceOf[VolumeType]
  val sc1 = "sc1".asInstanceOf[VolumeType]
  val st1 = "st1".asInstanceOf[VolumeType]
  val gp3 = "gp3".asInstanceOf[VolumeType]

  @inline def values: js.Array[VolumeType] = js.Array(standard, io1, io2, gp2, sc1, st1, gp3)
}

@js.native
sealed trait VpcAttributeName extends js.Any
object VpcAttributeName {
  val enableDnsSupport = "enableDnsSupport".asInstanceOf[VpcAttributeName]
  val enableDnsHostnames = "enableDnsHostnames".asInstanceOf[VpcAttributeName]
  val enableNetworkAddressUsageMetrics = "enableNetworkAddressUsageMetrics".asInstanceOf[VpcAttributeName]

  @inline def values: js.Array[VpcAttributeName] = js.Array(enableDnsSupport, enableDnsHostnames, enableNetworkAddressUsageMetrics)
}

@js.native
sealed trait VpcCidrBlockStateCode extends js.Any
object VpcCidrBlockStateCode {
  val associating = "associating".asInstanceOf[VpcCidrBlockStateCode]
  val associated = "associated".asInstanceOf[VpcCidrBlockStateCode]
  val disassociating = "disassociating".asInstanceOf[VpcCidrBlockStateCode]
  val disassociated = "disassociated".asInstanceOf[VpcCidrBlockStateCode]
  val failing = "failing".asInstanceOf[VpcCidrBlockStateCode]
  val failed = "failed".asInstanceOf[VpcCidrBlockStateCode]

  @inline def values: js.Array[VpcCidrBlockStateCode] = js.Array(associating, associated, disassociating, disassociated, failing, failed)
}

@js.native
sealed trait VpcEndpointType extends js.Any
object VpcEndpointType {
  val Interface = "Interface".asInstanceOf[VpcEndpointType]
  val Gateway = "Gateway".asInstanceOf[VpcEndpointType]
  val GatewayLoadBalancer = "GatewayLoadBalancer".asInstanceOf[VpcEndpointType]

  @inline def values: js.Array[VpcEndpointType] = js.Array(Interface, Gateway, GatewayLoadBalancer)
}

@js.native
sealed trait VpcPeeringConnectionStateReasonCode extends js.Any
object VpcPeeringConnectionStateReasonCode {
  val `initiating-request` = "initiating-request".asInstanceOf[VpcPeeringConnectionStateReasonCode]
  val `pending-acceptance` = "pending-acceptance".asInstanceOf[VpcPeeringConnectionStateReasonCode]
  val active = "active".asInstanceOf[VpcPeeringConnectionStateReasonCode]
  val deleted = "deleted".asInstanceOf[VpcPeeringConnectionStateReasonCode]
  val rejected = "rejected".asInstanceOf[VpcPeeringConnectionStateReasonCode]
  val failed = "failed".asInstanceOf[VpcPeeringConnectionStateReasonCode]
  val expired = "expired".asInstanceOf[VpcPeeringConnectionStateReasonCode]
  val provisioning = "provisioning".asInstanceOf[VpcPeeringConnectionStateReasonCode]
  val deleting = "deleting".asInstanceOf[VpcPeeringConnectionStateReasonCode]

  @inline def values: js.Array[VpcPeeringConnectionStateReasonCode] = js.Array(`initiating-request`, `pending-acceptance`, active, deleted, rejected, failed, expired, provisioning, deleting)
}

@js.native
sealed trait VpcState extends js.Any
object VpcState {
  val pending = "pending".asInstanceOf[VpcState]
  val available = "available".asInstanceOf[VpcState]

  @inline def values: js.Array[VpcState] = js.Array(pending, available)
}

@js.native
sealed trait VpcTenancy extends js.Any
object VpcTenancy {
  val default = "default".asInstanceOf[VpcTenancy]

  @inline def values: js.Array[VpcTenancy] = js.Array(default)
}

@js.native
sealed trait VpnEcmpSupportValue extends js.Any
object VpnEcmpSupportValue {
  val enable = "enable".asInstanceOf[VpnEcmpSupportValue]
  val disable = "disable".asInstanceOf[VpnEcmpSupportValue]

  @inline def values: js.Array[VpnEcmpSupportValue] = js.Array(enable, disable)
}

@js.native
sealed trait VpnProtocol extends js.Any
object VpnProtocol {
  val openvpn = "openvpn".asInstanceOf[VpnProtocol]

  @inline def values: js.Array[VpnProtocol] = js.Array(openvpn)
}

@js.native
sealed trait VpnState extends js.Any
object VpnState {
  val pending = "pending".asInstanceOf[VpnState]
  val available = "available".asInstanceOf[VpnState]
  val deleting = "deleting".asInstanceOf[VpnState]
  val deleted = "deleted".asInstanceOf[VpnState]

  @inline def values: js.Array[VpnState] = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait VpnStaticRouteSource extends js.Any
object VpnStaticRouteSource {
  val Static = "Static".asInstanceOf[VpnStaticRouteSource]

  @inline def values: js.Array[VpnStaticRouteSource] = js.Array(Static)
}

@js.native
sealed trait WeekDay extends js.Any
object WeekDay {
  val sunday = "sunday".asInstanceOf[WeekDay]
  val monday = "monday".asInstanceOf[WeekDay]
  val tuesday = "tuesday".asInstanceOf[WeekDay]
  val wednesday = "wednesday".asInstanceOf[WeekDay]
  val thursday = "thursday".asInstanceOf[WeekDay]
  val friday = "friday".asInstanceOf[WeekDay]
  val saturday = "saturday".asInstanceOf[WeekDay]

  @inline def values: js.Array[WeekDay] = js.Array(sunday, monday, tuesday, wednesday, thursday, friday, saturday)
}

@js.native
sealed trait scope extends js.Any
object scope {
  val `Availability Zone` = "Availability Zone".asInstanceOf[scope]
  val Region = "Region".asInstanceOf[scope]

  @inline def values: js.Array[scope] = js.Array(`Availability Zone`, Region)
}
