package facade.amazonaws.services.ec2

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AccountAttributeName extends js.Any
object AccountAttributeName {
  val `supported-platforms` = "supported-platforms".asInstanceOf[AccountAttributeName]
  val `default-vpc` = "default-vpc".asInstanceOf[AccountAttributeName]

  @inline def values = js.Array(`supported-platforms`, `default-vpc`)
}

@js.native
sealed trait ActivityStatus extends js.Any
object ActivityStatus {
  val error = "error".asInstanceOf[ActivityStatus]
  val pending_fulfillment = "pending_fulfillment".asInstanceOf[ActivityStatus]
  val pending_termination = "pending_termination".asInstanceOf[ActivityStatus]
  val fulfilled = "fulfilled".asInstanceOf[ActivityStatus]

  @inline def values = js.Array(error, pending_fulfillment, pending_termination, fulfilled)
}

@js.native
sealed trait AddressAttributeName extends js.Any
object AddressAttributeName {
  val `domain-name` = "domain-name".asInstanceOf[AddressAttributeName]

  @inline def values = js.Array(`domain-name`)
}

@js.native
sealed trait Affinity extends js.Any
object Affinity {
  val default = "default".asInstanceOf[Affinity]
  val host = "host".asInstanceOf[Affinity]

  @inline def values = js.Array(default, host)
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

  @inline def values = js.Array(available, `under-assessment`, `permanent-failure`, released, `released-permanent-failure`, pending)
}

@js.native
sealed trait AllocationStrategy extends js.Any
object AllocationStrategy {
  val lowestPrice = "lowestPrice".asInstanceOf[AllocationStrategy]
  val diversified = "diversified".asInstanceOf[AllocationStrategy]
  val capacityOptimized = "capacityOptimized".asInstanceOf[AllocationStrategy]
  val capacityOptimizedPrioritized = "capacityOptimizedPrioritized".asInstanceOf[AllocationStrategy]

  @inline def values = js.Array(lowestPrice, diversified, capacityOptimized, capacityOptimizedPrioritized)
}

@js.native
sealed trait AllowsMultipleInstanceTypes extends js.Any
object AllowsMultipleInstanceTypes {
  val on = "on".asInstanceOf[AllowsMultipleInstanceTypes]
  val off = "off".asInstanceOf[AllowsMultipleInstanceTypes]

  @inline def values = js.Array(on, off)
}

@js.native
sealed trait AnalysisStatus extends js.Any
object AnalysisStatus {
  val running = "running".asInstanceOf[AnalysisStatus]
  val succeeded = "succeeded".asInstanceOf[AnalysisStatus]
  val failed = "failed".asInstanceOf[AnalysisStatus]

  @inline def values = js.Array(running, succeeded, failed)
}

@js.native
sealed trait ApplianceModeSupportValue extends js.Any
object ApplianceModeSupportValue {
  val enable = "enable".asInstanceOf[ApplianceModeSupportValue]
  val disable = "disable".asInstanceOf[ApplianceModeSupportValue]

  @inline def values = js.Array(enable, disable)
}

@js.native
sealed trait ArchitectureType extends js.Any
object ArchitectureType {
  val i386 = "i386".asInstanceOf[ArchitectureType]
  val x86_64 = "x86_64".asInstanceOf[ArchitectureType]
  val arm64 = "arm64".asInstanceOf[ArchitectureType]

  @inline def values = js.Array(i386, x86_64, arm64)
}

@js.native
sealed trait ArchitectureValues extends js.Any
object ArchitectureValues {
  val i386 = "i386".asInstanceOf[ArchitectureValues]
  val x86_64 = "x86_64".asInstanceOf[ArchitectureValues]
  val arm64 = "arm64".asInstanceOf[ArchitectureValues]

  @inline def values = js.Array(i386, x86_64, arm64)
}

@js.native
sealed trait AssociatedNetworkType extends js.Any
object AssociatedNetworkType {
  val vpc = "vpc".asInstanceOf[AssociatedNetworkType]

  @inline def values = js.Array(vpc)
}

@js.native
sealed trait AssociationStatusCode extends js.Any
object AssociationStatusCode {
  val associating = "associating".asInstanceOf[AssociationStatusCode]
  val associated = "associated".asInstanceOf[AssociationStatusCode]
  val `association-failed` = "association-failed".asInstanceOf[AssociationStatusCode]
  val disassociating = "disassociating".asInstanceOf[AssociationStatusCode]
  val disassociated = "disassociated".asInstanceOf[AssociationStatusCode]

  @inline def values = js.Array(associating, associated, `association-failed`, disassociating, disassociated)
}

@js.native
sealed trait AttachmentStatus extends js.Any
object AttachmentStatus {
  val attaching = "attaching".asInstanceOf[AttachmentStatus]
  val attached = "attached".asInstanceOf[AttachmentStatus]
  val detaching = "detaching".asInstanceOf[AttachmentStatus]
  val detached = "detached".asInstanceOf[AttachmentStatus]

  @inline def values = js.Array(attaching, attached, detaching, detached)
}

@js.native
sealed trait AutoAcceptSharedAssociationsValue extends js.Any
object AutoAcceptSharedAssociationsValue {
  val enable = "enable".asInstanceOf[AutoAcceptSharedAssociationsValue]
  val disable = "disable".asInstanceOf[AutoAcceptSharedAssociationsValue]

  @inline def values = js.Array(enable, disable)
}

@js.native
sealed trait AutoAcceptSharedAttachmentsValue extends js.Any
object AutoAcceptSharedAttachmentsValue {
  val enable = "enable".asInstanceOf[AutoAcceptSharedAttachmentsValue]
  val disable = "disable".asInstanceOf[AutoAcceptSharedAttachmentsValue]

  @inline def values = js.Array(enable, disable)
}

@js.native
sealed trait AutoPlacement extends js.Any
object AutoPlacement {
  val on = "on".asInstanceOf[AutoPlacement]
  val off = "off".asInstanceOf[AutoPlacement]

  @inline def values = js.Array(on, off)
}

@js.native
sealed trait AvailabilityZoneOptInStatus extends js.Any
object AvailabilityZoneOptInStatus {
  val `opt-in-not-required` = "opt-in-not-required".asInstanceOf[AvailabilityZoneOptInStatus]
  val `opted-in` = "opted-in".asInstanceOf[AvailabilityZoneOptInStatus]
  val `not-opted-in` = "not-opted-in".asInstanceOf[AvailabilityZoneOptInStatus]

  @inline def values = js.Array(`opt-in-not-required`, `opted-in`, `not-opted-in`)
}

@js.native
sealed trait AvailabilityZoneState extends js.Any
object AvailabilityZoneState {
  val available = "available".asInstanceOf[AvailabilityZoneState]
  val information = "information".asInstanceOf[AvailabilityZoneState]
  val impaired = "impaired".asInstanceOf[AvailabilityZoneState]
  val unavailable = "unavailable".asInstanceOf[AvailabilityZoneState]

  @inline def values = js.Array(available, information, impaired, unavailable)
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

  @inline def values = js.Array(submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying)
}

@js.native
sealed trait BgpStatus extends js.Any
object BgpStatus {
  val up = "up".asInstanceOf[BgpStatus]
  val down = "down".asInstanceOf[BgpStatus]

  @inline def values = js.Array(up, down)
}

@js.native
sealed trait BootModeType extends js.Any
object BootModeType {
  val `legacy-bios` = "legacy-bios".asInstanceOf[BootModeType]
  val uefi = "uefi".asInstanceOf[BootModeType]

  @inline def values = js.Array(`legacy-bios`, uefi)
}

@js.native
sealed trait BootModeValues extends js.Any
object BootModeValues {
  val `legacy-bios` = "legacy-bios".asInstanceOf[BootModeValues]
  val uefi = "uefi".asInstanceOf[BootModeValues]

  @inline def values = js.Array(`legacy-bios`, uefi)
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

  @inline def values = js.Array(pending, `waiting-for-shutdown`, bundling, storing, cancelling, complete, failed)
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

  @inline def values = js.Array(advertised, deprovisioned, `failed-deprovision`, `failed-provision`, `pending-deprovision`, `pending-provision`, provisioned, `provisioned-not-publicly-advertisable`)
}

@js.native
sealed trait CancelBatchErrorCode extends js.Any
object CancelBatchErrorCode {
  val fleetRequestIdDoesNotExist = "fleetRequestIdDoesNotExist".asInstanceOf[CancelBatchErrorCode]
  val fleetRequestIdMalformed = "fleetRequestIdMalformed".asInstanceOf[CancelBatchErrorCode]
  val fleetRequestNotInCancellableState = "fleetRequestNotInCancellableState".asInstanceOf[CancelBatchErrorCode]
  val unexpectedError = "unexpectedError".asInstanceOf[CancelBatchErrorCode]

  @inline def values = js.Array(fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError)
}

@js.native
sealed trait CancelSpotInstanceRequestState extends js.Any
object CancelSpotInstanceRequestState {
  val active = "active".asInstanceOf[CancelSpotInstanceRequestState]
  val open = "open".asInstanceOf[CancelSpotInstanceRequestState]
  val closed = "closed".asInstanceOf[CancelSpotInstanceRequestState]
  val cancelled = "cancelled".asInstanceOf[CancelSpotInstanceRequestState]
  val completed = "completed".asInstanceOf[CancelSpotInstanceRequestState]

  @inline def values = js.Array(active, open, closed, cancelled, completed)
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

  @inline def values = js.Array(`Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, Windows, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard`, `Windows with SQL Server Web`, `Linux with SQL Server Standard`, `Linux with SQL Server Web`, `Linux with SQL Server Enterprise`)
}

@js.native
sealed trait CapacityReservationPreference extends js.Any
object CapacityReservationPreference {
  val open = "open".asInstanceOf[CapacityReservationPreference]
  val none = "none".asInstanceOf[CapacityReservationPreference]

  @inline def values = js.Array(open, none)
}

@js.native
sealed trait CapacityReservationState extends js.Any
object CapacityReservationState {
  val active = "active".asInstanceOf[CapacityReservationState]
  val expired = "expired".asInstanceOf[CapacityReservationState]
  val cancelled = "cancelled".asInstanceOf[CapacityReservationState]
  val pending = "pending".asInstanceOf[CapacityReservationState]
  val failed = "failed".asInstanceOf[CapacityReservationState]

  @inline def values = js.Array(active, expired, cancelled, pending, failed)
}

@js.native
sealed trait CapacityReservationTenancy extends js.Any
object CapacityReservationTenancy {
  val default = "default".asInstanceOf[CapacityReservationTenancy]
  val dedicated = "dedicated".asInstanceOf[CapacityReservationTenancy]

  @inline def values = js.Array(default, dedicated)
}

@js.native
sealed trait CarrierGatewayState extends js.Any
object CarrierGatewayState {
  val pending = "pending".asInstanceOf[CarrierGatewayState]
  val available = "available".asInstanceOf[CarrierGatewayState]
  val deleting = "deleting".asInstanceOf[CarrierGatewayState]
  val deleted = "deleted".asInstanceOf[CarrierGatewayState]

  @inline def values = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait ClientCertificateRevocationListStatusCode extends js.Any
object ClientCertificateRevocationListStatusCode {
  val pending = "pending".asInstanceOf[ClientCertificateRevocationListStatusCode]
  val active = "active".asInstanceOf[ClientCertificateRevocationListStatusCode]

  @inline def values = js.Array(pending, active)
}

@js.native
sealed trait ClientVpnAuthenticationType extends js.Any
object ClientVpnAuthenticationType {
  val `certificate-authentication` = "certificate-authentication".asInstanceOf[ClientVpnAuthenticationType]
  val `directory-service-authentication` = "directory-service-authentication".asInstanceOf[ClientVpnAuthenticationType]
  val `federated-authentication` = "federated-authentication".asInstanceOf[ClientVpnAuthenticationType]

  @inline def values = js.Array(`certificate-authentication`, `directory-service-authentication`, `federated-authentication`)
}

@js.native
sealed trait ClientVpnAuthorizationRuleStatusCode extends js.Any
object ClientVpnAuthorizationRuleStatusCode {
  val authorizing = "authorizing".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]
  val active = "active".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]
  val failed = "failed".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]
  val revoking = "revoking".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]

  @inline def values = js.Array(authorizing, active, failed, revoking)
}

@js.native
sealed trait ClientVpnConnectionStatusCode extends js.Any
object ClientVpnConnectionStatusCode {
  val active = "active".asInstanceOf[ClientVpnConnectionStatusCode]
  val `failed-to-terminate` = "failed-to-terminate".asInstanceOf[ClientVpnConnectionStatusCode]
  val terminating = "terminating".asInstanceOf[ClientVpnConnectionStatusCode]
  val terminated = "terminated".asInstanceOf[ClientVpnConnectionStatusCode]

  @inline def values = js.Array(active, `failed-to-terminate`, terminating, terminated)
}

@js.native
sealed trait ClientVpnEndpointAttributeStatusCode extends js.Any
object ClientVpnEndpointAttributeStatusCode {
  val applying = "applying".asInstanceOf[ClientVpnEndpointAttributeStatusCode]
  val applied = "applied".asInstanceOf[ClientVpnEndpointAttributeStatusCode]

  @inline def values = js.Array(applying, applied)
}

@js.native
sealed trait ClientVpnEndpointStatusCode extends js.Any
object ClientVpnEndpointStatusCode {
  val `pending-associate` = "pending-associate".asInstanceOf[ClientVpnEndpointStatusCode]
  val available = "available".asInstanceOf[ClientVpnEndpointStatusCode]
  val deleting = "deleting".asInstanceOf[ClientVpnEndpointStatusCode]
  val deleted = "deleted".asInstanceOf[ClientVpnEndpointStatusCode]

  @inline def values = js.Array(`pending-associate`, available, deleting, deleted)
}

@js.native
sealed trait ClientVpnRouteStatusCode extends js.Any
object ClientVpnRouteStatusCode {
  val creating = "creating".asInstanceOf[ClientVpnRouteStatusCode]
  val active = "active".asInstanceOf[ClientVpnRouteStatusCode]
  val failed = "failed".asInstanceOf[ClientVpnRouteStatusCode]
  val deleting = "deleting".asInstanceOf[ClientVpnRouteStatusCode]

  @inline def values = js.Array(creating, active, failed, deleting)
}

@js.native
sealed trait ConnectionNotificationState extends js.Any
object ConnectionNotificationState {
  val Enabled = "Enabled".asInstanceOf[ConnectionNotificationState]
  val Disabled = "Disabled".asInstanceOf[ConnectionNotificationState]

  @inline def values = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ConnectionNotificationType extends js.Any
object ConnectionNotificationType {
  val Topic = "Topic".asInstanceOf[ConnectionNotificationType]

  @inline def values = js.Array(Topic)
}

@js.native
sealed trait ContainerFormat extends js.Any
object ContainerFormat {
  val ova = "ova".asInstanceOf[ContainerFormat]

  @inline def values = js.Array(ova)
}

@js.native
sealed trait ConversionTaskState extends js.Any
object ConversionTaskState {
  val active = "active".asInstanceOf[ConversionTaskState]
  val cancelling = "cancelling".asInstanceOf[ConversionTaskState]
  val cancelled = "cancelled".asInstanceOf[ConversionTaskState]
  val completed = "completed".asInstanceOf[ConversionTaskState]

  @inline def values = js.Array(active, cancelling, cancelled, completed)
}

@js.native
sealed trait CopyTagsFromSource extends js.Any
object CopyTagsFromSource {
  val volume = "volume".asInstanceOf[CopyTagsFromSource]

  @inline def values = js.Array(volume)
}

@js.native
sealed trait CurrencyCodeValues extends js.Any
object CurrencyCodeValues {
  val USD = "USD".asInstanceOf[CurrencyCodeValues]

  @inline def values = js.Array(USD)
}

@js.native
sealed trait DatafeedSubscriptionState extends js.Any
object DatafeedSubscriptionState {
  val Active = "Active".asInstanceOf[DatafeedSubscriptionState]
  val Inactive = "Inactive".asInstanceOf[DatafeedSubscriptionState]

  @inline def values = js.Array(Active, Inactive)
}

@js.native
sealed trait DefaultRouteTableAssociationValue extends js.Any
object DefaultRouteTableAssociationValue {
  val enable = "enable".asInstanceOf[DefaultRouteTableAssociationValue]
  val disable = "disable".asInstanceOf[DefaultRouteTableAssociationValue]

  @inline def values = js.Array(enable, disable)
}

@js.native
sealed trait DefaultRouteTablePropagationValue extends js.Any
object DefaultRouteTablePropagationValue {
  val enable = "enable".asInstanceOf[DefaultRouteTablePropagationValue]
  val disable = "disable".asInstanceOf[DefaultRouteTablePropagationValue]

  @inline def values = js.Array(enable, disable)
}

@js.native
sealed trait DefaultTargetCapacityType extends js.Any
object DefaultTargetCapacityType {
  val spot = "spot".asInstanceOf[DefaultTargetCapacityType]
  val `on-demand` = "on-demand".asInstanceOf[DefaultTargetCapacityType]

  @inline def values = js.Array(spot, `on-demand`)
}

@js.native
sealed trait DeleteFleetErrorCode extends js.Any
object DeleteFleetErrorCode {
  val fleetIdDoesNotExist = "fleetIdDoesNotExist".asInstanceOf[DeleteFleetErrorCode]
  val fleetIdMalformed = "fleetIdMalformed".asInstanceOf[DeleteFleetErrorCode]
  val fleetNotInDeletableState = "fleetNotInDeletableState".asInstanceOf[DeleteFleetErrorCode]
  val unexpectedError = "unexpectedError".asInstanceOf[DeleteFleetErrorCode]

  @inline def values = js.Array(fleetIdDoesNotExist, fleetIdMalformed, fleetNotInDeletableState, unexpectedError)
}

@js.native
sealed trait DeleteQueuedReservedInstancesErrorCode extends js.Any
object DeleteQueuedReservedInstancesErrorCode {
  val `reserved-instances-id-invalid` = "reserved-instances-id-invalid".asInstanceOf[DeleteQueuedReservedInstancesErrorCode]
  val `reserved-instances-not-in-queued-state` = "reserved-instances-not-in-queued-state".asInstanceOf[DeleteQueuedReservedInstancesErrorCode]
  val `unexpected-error` = "unexpected-error".asInstanceOf[DeleteQueuedReservedInstancesErrorCode]

  @inline def values = js.Array(`reserved-instances-id-invalid`, `reserved-instances-not-in-queued-state`, `unexpected-error`)
}

@js.native
sealed trait DeviceType extends js.Any
object DeviceType {
  val ebs = "ebs".asInstanceOf[DeviceType]
  val `instance-store` = "instance-store".asInstanceOf[DeviceType]

  @inline def values = js.Array(ebs, `instance-store`)
}

@js.native
sealed trait DiskImageFormat extends js.Any
object DiskImageFormat {
  val VMDK = "VMDK".asInstanceOf[DiskImageFormat]
  val RAW = "RAW".asInstanceOf[DiskImageFormat]
  val VHD = "VHD".asInstanceOf[DiskImageFormat]

  @inline def values = js.Array(VMDK, RAW, VHD)
}

@js.native
sealed trait DiskType extends js.Any
object DiskType {
  val hdd = "hdd".asInstanceOf[DiskType]
  val ssd = "ssd".asInstanceOf[DiskType]

  @inline def values = js.Array(hdd, ssd)
}

@js.native
sealed trait DnsNameState extends js.Any
object DnsNameState {
  val pendingVerification = "pendingVerification".asInstanceOf[DnsNameState]
  val verified = "verified".asInstanceOf[DnsNameState]
  val failed = "failed".asInstanceOf[DnsNameState]

  @inline def values = js.Array(pendingVerification, verified, failed)
}

@js.native
sealed trait DnsSupportValue extends js.Any
object DnsSupportValue {
  val enable = "enable".asInstanceOf[DnsSupportValue]
  val disable = "disable".asInstanceOf[DnsSupportValue]

  @inline def values = js.Array(enable, disable)
}

@js.native
sealed trait DomainType extends js.Any
object DomainType {
  val vpc = "vpc".asInstanceOf[DomainType]
  val standard = "standard".asInstanceOf[DomainType]

  @inline def values = js.Array(vpc, standard)
}

@js.native
sealed trait EbsEncryptionSupport extends js.Any
object EbsEncryptionSupport {
  val unsupported = "unsupported".asInstanceOf[EbsEncryptionSupport]
  val supported = "supported".asInstanceOf[EbsEncryptionSupport]

  @inline def values = js.Array(unsupported, supported)
}

@js.native
sealed trait EbsNvmeSupport extends js.Any
object EbsNvmeSupport {
  val unsupported = "unsupported".asInstanceOf[EbsNvmeSupport]
  val supported = "supported".asInstanceOf[EbsNvmeSupport]
  val required = "required".asInstanceOf[EbsNvmeSupport]

  @inline def values = js.Array(unsupported, supported, required)
}

@js.native
sealed trait EbsOptimizedSupport extends js.Any
object EbsOptimizedSupport {
  val unsupported = "unsupported".asInstanceOf[EbsOptimizedSupport]
  val supported = "supported".asInstanceOf[EbsOptimizedSupport]
  val default = "default".asInstanceOf[EbsOptimizedSupport]

  @inline def values = js.Array(unsupported, supported, default)
}

@js.native
sealed trait ElasticGpuState extends js.Any
object ElasticGpuState {
  val ATTACHED = "ATTACHED".asInstanceOf[ElasticGpuState]

  @inline def values = js.Array(ATTACHED)
}

@js.native
sealed trait ElasticGpuStatus extends js.Any
object ElasticGpuStatus {
  val OK = "OK".asInstanceOf[ElasticGpuStatus]
  val IMPAIRED = "IMPAIRED".asInstanceOf[ElasticGpuStatus]

  @inline def values = js.Array(OK, IMPAIRED)
}

@js.native
sealed trait EnaSupport extends js.Any
object EnaSupport {
  val unsupported = "unsupported".asInstanceOf[EnaSupport]
  val supported = "supported".asInstanceOf[EnaSupport]
  val required = "required".asInstanceOf[EnaSupport]

  @inline def values = js.Array(unsupported, supported, required)
}

@js.native
sealed trait EndDateType extends js.Any
object EndDateType {
  val unlimited = "unlimited".asInstanceOf[EndDateType]
  val limited = "limited".asInstanceOf[EndDateType]

  @inline def values = js.Array(unlimited, limited)
}

@js.native
sealed trait EphemeralNvmeSupport extends js.Any
object EphemeralNvmeSupport {
  val unsupported = "unsupported".asInstanceOf[EphemeralNvmeSupport]
  val supported = "supported".asInstanceOf[EphemeralNvmeSupport]
  val required = "required".asInstanceOf[EphemeralNvmeSupport]

  @inline def values = js.Array(unsupported, supported, required)
}

@js.native
sealed trait EventCode extends js.Any
object EventCode {
  val `instance-reboot` = "instance-reboot".asInstanceOf[EventCode]
  val `system-reboot` = "system-reboot".asInstanceOf[EventCode]
  val `system-maintenance` = "system-maintenance".asInstanceOf[EventCode]
  val `instance-retirement` = "instance-retirement".asInstanceOf[EventCode]
  val `instance-stop` = "instance-stop".asInstanceOf[EventCode]

  @inline def values = js.Array(`instance-reboot`, `system-reboot`, `system-maintenance`, `instance-retirement`, `instance-stop`)
}

@js.native
sealed trait EventType extends js.Any
object EventType {
  val instanceChange = "instanceChange".asInstanceOf[EventType]
  val fleetRequestChange = "fleetRequestChange".asInstanceOf[EventType]
  val error = "error".asInstanceOf[EventType]
  val information = "information".asInstanceOf[EventType]

  @inline def values = js.Array(instanceChange, fleetRequestChange, error, information)
}

@js.native
sealed trait ExcessCapacityTerminationPolicy extends js.Any
object ExcessCapacityTerminationPolicy {
  val noTermination = "noTermination".asInstanceOf[ExcessCapacityTerminationPolicy]
  val default = "default".asInstanceOf[ExcessCapacityTerminationPolicy]

  @inline def values = js.Array(noTermination, default)
}

@js.native
sealed trait ExportEnvironment extends js.Any
object ExportEnvironment {
  val citrix = "citrix".asInstanceOf[ExportEnvironment]
  val vmware = "vmware".asInstanceOf[ExportEnvironment]
  val microsoft = "microsoft".asInstanceOf[ExportEnvironment]

  @inline def values = js.Array(citrix, vmware, microsoft)
}

@js.native
sealed trait ExportTaskState extends js.Any
object ExportTaskState {
  val active = "active".asInstanceOf[ExportTaskState]
  val cancelling = "cancelling".asInstanceOf[ExportTaskState]
  val cancelled = "cancelled".asInstanceOf[ExportTaskState]
  val completed = "completed".asInstanceOf[ExportTaskState]

  @inline def values = js.Array(active, cancelling, cancelled, completed)
}

@js.native
sealed trait FastSnapshotRestoreStateCode extends js.Any
object FastSnapshotRestoreStateCode {
  val enabling = "enabling".asInstanceOf[FastSnapshotRestoreStateCode]
  val optimizing = "optimizing".asInstanceOf[FastSnapshotRestoreStateCode]
  val enabled = "enabled".asInstanceOf[FastSnapshotRestoreStateCode]
  val disabling = "disabling".asInstanceOf[FastSnapshotRestoreStateCode]
  val disabled = "disabled".asInstanceOf[FastSnapshotRestoreStateCode]

  @inline def values = js.Array(enabling, optimizing, enabled, disabling, disabled)
}

@js.native
sealed trait FleetActivityStatus extends js.Any
object FleetActivityStatus {
  val error = "error".asInstanceOf[FleetActivityStatus]
  val pending_fulfillment = "pending_fulfillment".asInstanceOf[FleetActivityStatus]
  val pending_termination = "pending_termination".asInstanceOf[FleetActivityStatus]
  val fulfilled = "fulfilled".asInstanceOf[FleetActivityStatus]

  @inline def values = js.Array(error, pending_fulfillment, pending_termination, fulfilled)
}

@js.native
sealed trait FleetCapacityReservationUsageStrategy extends js.Any
object FleetCapacityReservationUsageStrategy {
  val `use-capacity-reservations-first` = "use-capacity-reservations-first".asInstanceOf[FleetCapacityReservationUsageStrategy]

  @inline def values = js.Array(`use-capacity-reservations-first`)
}

@js.native
sealed trait FleetEventType extends js.Any
object FleetEventType {
  val `instance-change` = "instance-change".asInstanceOf[FleetEventType]
  val `fleet-change` = "fleet-change".asInstanceOf[FleetEventType]
  val `service-error` = "service-error".asInstanceOf[FleetEventType]

  @inline def values = js.Array(`instance-change`, `fleet-change`, `service-error`)
}

@js.native
sealed trait FleetExcessCapacityTerminationPolicy extends js.Any
object FleetExcessCapacityTerminationPolicy {
  val `no-termination` = "no-termination".asInstanceOf[FleetExcessCapacityTerminationPolicy]
  val termination = "termination".asInstanceOf[FleetExcessCapacityTerminationPolicy]

  @inline def values = js.Array(`no-termination`, termination)
}

@js.native
sealed trait FleetOnDemandAllocationStrategy extends js.Any
object FleetOnDemandAllocationStrategy {
  val `lowest-price` = "lowest-price".asInstanceOf[FleetOnDemandAllocationStrategy]
  val prioritized = "prioritized".asInstanceOf[FleetOnDemandAllocationStrategy]

  @inline def values = js.Array(`lowest-price`, prioritized)
}

@js.native
sealed trait FleetReplacementStrategy extends js.Any
object FleetReplacementStrategy {
  val launch = "launch".asInstanceOf[FleetReplacementStrategy]

  @inline def values = js.Array(launch)
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

  @inline def values = js.Array(submitted, active, deleted, failed, deleted_running, deleted_terminating, modifying)
}

@js.native
sealed trait FleetType extends js.Any
object FleetType {
  val request = "request".asInstanceOf[FleetType]
  val maintain = "maintain".asInstanceOf[FleetType]
  val instant = "instant".asInstanceOf[FleetType]

  @inline def values = js.Array(request, maintain, instant)
}

@js.native
sealed trait FlowLogsResourceType extends js.Any
object FlowLogsResourceType {
  val VPC = "VPC".asInstanceOf[FlowLogsResourceType]
  val Subnet = "Subnet".asInstanceOf[FlowLogsResourceType]
  val NetworkInterface = "NetworkInterface".asInstanceOf[FlowLogsResourceType]

  @inline def values = js.Array(VPC, Subnet, NetworkInterface)
}

@js.native
sealed trait FpgaImageAttributeName extends js.Any
object FpgaImageAttributeName {
  val description = "description".asInstanceOf[FpgaImageAttributeName]
  val name = "name".asInstanceOf[FpgaImageAttributeName]
  val loadPermission = "loadPermission".asInstanceOf[FpgaImageAttributeName]
  val productCodes = "productCodes".asInstanceOf[FpgaImageAttributeName]

  @inline def values = js.Array(description, name, loadPermission, productCodes)
}

@js.native
sealed trait FpgaImageStateCode extends js.Any
object FpgaImageStateCode {
  val pending = "pending".asInstanceOf[FpgaImageStateCode]
  val failed = "failed".asInstanceOf[FpgaImageStateCode]
  val available = "available".asInstanceOf[FpgaImageStateCode]
  val unavailable = "unavailable".asInstanceOf[FpgaImageStateCode]

  @inline def values = js.Array(pending, failed, available, unavailable)
}

@js.native
sealed trait GatewayType extends js.Any
object GatewayType {
  val `ipsec.1` = "ipsec.1".asInstanceOf[GatewayType]

  @inline def values = js.Array(`ipsec.1`)
}

@js.native
sealed trait HostRecovery extends js.Any
object HostRecovery {
  val on = "on".asInstanceOf[HostRecovery]
  val off = "off".asInstanceOf[HostRecovery]

  @inline def values = js.Array(on, off)
}

@js.native
sealed trait HostTenancy extends js.Any
object HostTenancy {
  val dedicated = "dedicated".asInstanceOf[HostTenancy]
  val host = "host".asInstanceOf[HostTenancy]

  @inline def values = js.Array(dedicated, host)
}

@js.native
sealed trait HttpTokensState extends js.Any
object HttpTokensState {
  val optional = "optional".asInstanceOf[HttpTokensState]
  val required = "required".asInstanceOf[HttpTokensState]

  @inline def values = js.Array(optional, required)
}

@js.native
sealed trait HypervisorType extends js.Any
object HypervisorType {
  val ovm = "ovm".asInstanceOf[HypervisorType]
  val xen = "xen".asInstanceOf[HypervisorType]

  @inline def values = js.Array(ovm, xen)
}

@js.native
sealed trait IamInstanceProfileAssociationState extends js.Any
object IamInstanceProfileAssociationState {
  val associating = "associating".asInstanceOf[IamInstanceProfileAssociationState]
  val associated = "associated".asInstanceOf[IamInstanceProfileAssociationState]
  val disassociating = "disassociating".asInstanceOf[IamInstanceProfileAssociationState]
  val disassociated = "disassociated".asInstanceOf[IamInstanceProfileAssociationState]

  @inline def values = js.Array(associating, associated, disassociating, disassociated)
}

@js.native
sealed trait Igmpv2SupportValue extends js.Any
object Igmpv2SupportValue {
  val enable = "enable".asInstanceOf[Igmpv2SupportValue]
  val disable = "disable".asInstanceOf[Igmpv2SupportValue]

  @inline def values = js.Array(enable, disable)
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

  @inline def values = js.Array(description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping, sriovNetSupport, bootMode)
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

  @inline def values = js.Array(pending, available, invalid, deregistered, transient, failed, error)
}

@js.native
sealed trait ImageTypeValues extends js.Any
object ImageTypeValues {
  val machine = "machine".asInstanceOf[ImageTypeValues]
  val kernel = "kernel".asInstanceOf[ImageTypeValues]
  val ramdisk = "ramdisk".asInstanceOf[ImageTypeValues]

  @inline def values = js.Array(machine, kernel, ramdisk)
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

  @inline def values = js.Array(instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized, sriovNetSupport, enaSupport, enclaveOptions)
}

@js.native
sealed trait InstanceHealthStatus extends js.Any
object InstanceHealthStatus {
  val healthy = "healthy".asInstanceOf[InstanceHealthStatus]
  val unhealthy = "unhealthy".asInstanceOf[InstanceHealthStatus]

  @inline def values = js.Array(healthy, unhealthy)
}

@js.native
sealed trait InstanceInterruptionBehavior extends js.Any
object InstanceInterruptionBehavior {
  val hibernate = "hibernate".asInstanceOf[InstanceInterruptionBehavior]
  val stop = "stop".asInstanceOf[InstanceInterruptionBehavior]
  val terminate = "terminate".asInstanceOf[InstanceInterruptionBehavior]

  @inline def values = js.Array(hibernate, stop, terminate)
}

@js.native
sealed trait InstanceLifecycle extends js.Any
object InstanceLifecycle {
  val spot = "spot".asInstanceOf[InstanceLifecycle]
  val `on-demand` = "on-demand".asInstanceOf[InstanceLifecycle]

  @inline def values = js.Array(spot, `on-demand`)
}

@js.native
sealed trait InstanceLifecycleType extends js.Any
object InstanceLifecycleType {
  val spot = "spot".asInstanceOf[InstanceLifecycleType]
  val scheduled = "scheduled".asInstanceOf[InstanceLifecycleType]

  @inline def values = js.Array(spot, scheduled)
}

@js.native
sealed trait InstanceMatchCriteria extends js.Any
object InstanceMatchCriteria {
  val open = "open".asInstanceOf[InstanceMatchCriteria]
  val targeted = "targeted".asInstanceOf[InstanceMatchCriteria]

  @inline def values = js.Array(open, targeted)
}

@js.native
sealed trait InstanceMetadataEndpointState extends js.Any
object InstanceMetadataEndpointState {
  val disabled = "disabled".asInstanceOf[InstanceMetadataEndpointState]
  val enabled = "enabled".asInstanceOf[InstanceMetadataEndpointState]

  @inline def values = js.Array(disabled, enabled)
}

@js.native
sealed trait InstanceMetadataOptionsState extends js.Any
object InstanceMetadataOptionsState {
  val pending = "pending".asInstanceOf[InstanceMetadataOptionsState]
  val applied = "applied".asInstanceOf[InstanceMetadataOptionsState]

  @inline def values = js.Array(pending, applied)
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

  @inline def values = js.Array(pending, running, `shutting-down`, terminated, stopping, stopped)
}

@js.native
sealed trait InstanceType extends js.Any
object InstanceType {
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
  val `m1.small` = "m1.small".asInstanceOf[InstanceType]
  val `m1.medium` = "m1.medium".asInstanceOf[InstanceType]
  val `m1.large` = "m1.large".asInstanceOf[InstanceType]
  val `m1.xlarge` = "m1.xlarge".asInstanceOf[InstanceType]
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
  val `m2.xlarge` = "m2.xlarge".asInstanceOf[InstanceType]
  val `m2.2xlarge` = "m2.2xlarge".asInstanceOf[InstanceType]
  val `m2.4xlarge` = "m2.4xlarge".asInstanceOf[InstanceType]
  val `cr1.8xlarge` = "cr1.8xlarge".asInstanceOf[InstanceType]
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
  val `r5ad.large` = "r5ad.large".asInstanceOf[InstanceType]
  val `r5ad.xlarge` = "r5ad.xlarge".asInstanceOf[InstanceType]
  val `r5ad.2xlarge` = "r5ad.2xlarge".asInstanceOf[InstanceType]
  val `r5ad.4xlarge` = "r5ad.4xlarge".asInstanceOf[InstanceType]
  val `r5ad.8xlarge` = "r5ad.8xlarge".asInstanceOf[InstanceType]
  val `r5ad.12xlarge` = "r5ad.12xlarge".asInstanceOf[InstanceType]
  val `r5ad.16xlarge` = "r5ad.16xlarge".asInstanceOf[InstanceType]
  val `r5ad.24xlarge` = "r5ad.24xlarge".asInstanceOf[InstanceType]
  val `r6g.metal` = "r6g.metal".asInstanceOf[InstanceType]
  val `r6g.medium` = "r6g.medium".asInstanceOf[InstanceType]
  val `r6g.large` = "r6g.large".asInstanceOf[InstanceType]
  val `r6g.xlarge` = "r6g.xlarge".asInstanceOf[InstanceType]
  val `r6g.2xlarge` = "r6g.2xlarge".asInstanceOf[InstanceType]
  val `r6g.4xlarge` = "r6g.4xlarge".asInstanceOf[InstanceType]
  val `r6g.8xlarge` = "r6g.8xlarge".asInstanceOf[InstanceType]
  val `r6g.12xlarge` = "r6g.12xlarge".asInstanceOf[InstanceType]
  val `r6g.16xlarge` = "r6g.16xlarge".asInstanceOf[InstanceType]
  val `r6gd.metal` = "r6gd.metal".asInstanceOf[InstanceType]
  val `r6gd.medium` = "r6gd.medium".asInstanceOf[InstanceType]
  val `r6gd.large` = "r6gd.large".asInstanceOf[InstanceType]
  val `r6gd.xlarge` = "r6gd.xlarge".asInstanceOf[InstanceType]
  val `r6gd.2xlarge` = "r6gd.2xlarge".asInstanceOf[InstanceType]
  val `r6gd.4xlarge` = "r6gd.4xlarge".asInstanceOf[InstanceType]
  val `r6gd.8xlarge` = "r6gd.8xlarge".asInstanceOf[InstanceType]
  val `r6gd.12xlarge` = "r6gd.12xlarge".asInstanceOf[InstanceType]
  val `r6gd.16xlarge` = "r6gd.16xlarge".asInstanceOf[InstanceType]
  val `x1.16xlarge` = "x1.16xlarge".asInstanceOf[InstanceType]
  val `x1.32xlarge` = "x1.32xlarge".asInstanceOf[InstanceType]
  val `x1e.xlarge` = "x1e.xlarge".asInstanceOf[InstanceType]
  val `x1e.2xlarge` = "x1e.2xlarge".asInstanceOf[InstanceType]
  val `x1e.4xlarge` = "x1e.4xlarge".asInstanceOf[InstanceType]
  val `x1e.8xlarge` = "x1e.8xlarge".asInstanceOf[InstanceType]
  val `x1e.16xlarge` = "x1e.16xlarge".asInstanceOf[InstanceType]
  val `x1e.32xlarge` = "x1e.32xlarge".asInstanceOf[InstanceType]
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
  val `hi1.4xlarge` = "hi1.4xlarge".asInstanceOf[InstanceType]
  val `hs1.8xlarge` = "hs1.8xlarge".asInstanceOf[InstanceType]
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
  val `c6g.metal` = "c6g.metal".asInstanceOf[InstanceType]
  val `c6g.medium` = "c6g.medium".asInstanceOf[InstanceType]
  val `c6g.large` = "c6g.large".asInstanceOf[InstanceType]
  val `c6g.xlarge` = "c6g.xlarge".asInstanceOf[InstanceType]
  val `c6g.2xlarge` = "c6g.2xlarge".asInstanceOf[InstanceType]
  val `c6g.4xlarge` = "c6g.4xlarge".asInstanceOf[InstanceType]
  val `c6g.8xlarge` = "c6g.8xlarge".asInstanceOf[InstanceType]
  val `c6g.12xlarge` = "c6g.12xlarge".asInstanceOf[InstanceType]
  val `c6g.16xlarge` = "c6g.16xlarge".asInstanceOf[InstanceType]
  val `c6gd.metal` = "c6gd.metal".asInstanceOf[InstanceType]
  val `c6gd.medium` = "c6gd.medium".asInstanceOf[InstanceType]
  val `c6gd.large` = "c6gd.large".asInstanceOf[InstanceType]
  val `c6gd.xlarge` = "c6gd.xlarge".asInstanceOf[InstanceType]
  val `c6gd.2xlarge` = "c6gd.2xlarge".asInstanceOf[InstanceType]
  val `c6gd.4xlarge` = "c6gd.4xlarge".asInstanceOf[InstanceType]
  val `c6gd.8xlarge` = "c6gd.8xlarge".asInstanceOf[InstanceType]
  val `c6gd.12xlarge` = "c6gd.12xlarge".asInstanceOf[InstanceType]
  val `c6gd.16xlarge` = "c6gd.16xlarge".asInstanceOf[InstanceType]
  val `c6gn.medium` = "c6gn.medium".asInstanceOf[InstanceType]
  val `c6gn.large` = "c6gn.large".asInstanceOf[InstanceType]
  val `c6gn.xlarge` = "c6gn.xlarge".asInstanceOf[InstanceType]
  val `c6gn.2xlarge` = "c6gn.2xlarge".asInstanceOf[InstanceType]
  val `c6gn.4xlarge` = "c6gn.4xlarge".asInstanceOf[InstanceType]
  val `c6gn.8xlarge` = "c6gn.8xlarge".asInstanceOf[InstanceType]
  val `c6gn.12xlarge` = "c6gn.12xlarge".asInstanceOf[InstanceType]
  val `c6gn.16xlarge` = "c6gn.16xlarge".asInstanceOf[InstanceType]
  val `cc1.4xlarge` = "cc1.4xlarge".asInstanceOf[InstanceType]
  val `cc2.8xlarge` = "cc2.8xlarge".asInstanceOf[InstanceType]
  val `g2.2xlarge` = "g2.2xlarge".asInstanceOf[InstanceType]
  val `g2.8xlarge` = "g2.8xlarge".asInstanceOf[InstanceType]
  val `g3.4xlarge` = "g3.4xlarge".asInstanceOf[InstanceType]
  val `g3.8xlarge` = "g3.8xlarge".asInstanceOf[InstanceType]
  val `g3.16xlarge` = "g3.16xlarge".asInstanceOf[InstanceType]
  val `g3s.xlarge` = "g3s.xlarge".asInstanceOf[InstanceType]
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
  val `cg1.4xlarge` = "cg1.4xlarge".asInstanceOf[InstanceType]
  val `p2.xlarge` = "p2.xlarge".asInstanceOf[InstanceType]
  val `p2.8xlarge` = "p2.8xlarge".asInstanceOf[InstanceType]
  val `p2.16xlarge` = "p2.16xlarge".asInstanceOf[InstanceType]
  val `p3.2xlarge` = "p3.2xlarge".asInstanceOf[InstanceType]
  val `p3.8xlarge` = "p3.8xlarge".asInstanceOf[InstanceType]
  val `p3.16xlarge` = "p3.16xlarge".asInstanceOf[InstanceType]
  val `p3dn.24xlarge` = "p3dn.24xlarge".asInstanceOf[InstanceType]
  val `p4d.24xlarge` = "p4d.24xlarge".asInstanceOf[InstanceType]
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
  val `f1.2xlarge` = "f1.2xlarge".asInstanceOf[InstanceType]
  val `f1.4xlarge` = "f1.4xlarge".asInstanceOf[InstanceType]
  val `f1.16xlarge` = "f1.16xlarge".asInstanceOf[InstanceType]
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
  val `m5d.large` = "m5d.large".asInstanceOf[InstanceType]
  val `m5d.xlarge` = "m5d.xlarge".asInstanceOf[InstanceType]
  val `m5d.2xlarge` = "m5d.2xlarge".asInstanceOf[InstanceType]
  val `m5d.4xlarge` = "m5d.4xlarge".asInstanceOf[InstanceType]
  val `m5d.8xlarge` = "m5d.8xlarge".asInstanceOf[InstanceType]
  val `m5d.12xlarge` = "m5d.12xlarge".asInstanceOf[InstanceType]
  val `m5d.16xlarge` = "m5d.16xlarge".asInstanceOf[InstanceType]
  val `m5d.24xlarge` = "m5d.24xlarge".asInstanceOf[InstanceType]
  val `m5d.metal` = "m5d.metal".asInstanceOf[InstanceType]
  val `m5ad.large` = "m5ad.large".asInstanceOf[InstanceType]
  val `m5ad.xlarge` = "m5ad.xlarge".asInstanceOf[InstanceType]
  val `m5ad.2xlarge` = "m5ad.2xlarge".asInstanceOf[InstanceType]
  val `m5ad.4xlarge` = "m5ad.4xlarge".asInstanceOf[InstanceType]
  val `m5ad.8xlarge` = "m5ad.8xlarge".asInstanceOf[InstanceType]
  val `m5ad.12xlarge` = "m5ad.12xlarge".asInstanceOf[InstanceType]
  val `m5ad.16xlarge` = "m5ad.16xlarge".asInstanceOf[InstanceType]
  val `m5ad.24xlarge` = "m5ad.24xlarge".asInstanceOf[InstanceType]
  val `m5zn.large` = "m5zn.large".asInstanceOf[InstanceType]
  val `m5zn.xlarge` = "m5zn.xlarge".asInstanceOf[InstanceType]
  val `m5zn.2xlarge` = "m5zn.2xlarge".asInstanceOf[InstanceType]
  val `m5zn.3xlarge` = "m5zn.3xlarge".asInstanceOf[InstanceType]
  val `m5zn.6xlarge` = "m5zn.6xlarge".asInstanceOf[InstanceType]
  val `m5zn.12xlarge` = "m5zn.12xlarge".asInstanceOf[InstanceType]
  val `m5zn.metal` = "m5zn.metal".asInstanceOf[InstanceType]
  val `h1.2xlarge` = "h1.2xlarge".asInstanceOf[InstanceType]
  val `h1.4xlarge` = "h1.4xlarge".asInstanceOf[InstanceType]
  val `h1.8xlarge` = "h1.8xlarge".asInstanceOf[InstanceType]
  val `h1.16xlarge` = "h1.16xlarge".asInstanceOf[InstanceType]
  val `z1d.large` = "z1d.large".asInstanceOf[InstanceType]
  val `z1d.xlarge` = "z1d.xlarge".asInstanceOf[InstanceType]
  val `z1d.2xlarge` = "z1d.2xlarge".asInstanceOf[InstanceType]
  val `z1d.3xlarge` = "z1d.3xlarge".asInstanceOf[InstanceType]
  val `z1d.6xlarge` = "z1d.6xlarge".asInstanceOf[InstanceType]
  val `z1d.12xlarge` = "z1d.12xlarge".asInstanceOf[InstanceType]
  val `z1d.metal` = "z1d.metal".asInstanceOf[InstanceType]
  val `u-6tb1.metal` = "u-6tb1.metal".asInstanceOf[InstanceType]
  val `u-9tb1.metal` = "u-9tb1.metal".asInstanceOf[InstanceType]
  val `u-12tb1.metal` = "u-12tb1.metal".asInstanceOf[InstanceType]
  val `u-18tb1.metal` = "u-18tb1.metal".asInstanceOf[InstanceType]
  val `u-24tb1.metal` = "u-24tb1.metal".asInstanceOf[InstanceType]
  val `a1.medium` = "a1.medium".asInstanceOf[InstanceType]
  val `a1.large` = "a1.large".asInstanceOf[InstanceType]
  val `a1.xlarge` = "a1.xlarge".asInstanceOf[InstanceType]
  val `a1.2xlarge` = "a1.2xlarge".asInstanceOf[InstanceType]
  val `a1.4xlarge` = "a1.4xlarge".asInstanceOf[InstanceType]
  val `a1.metal` = "a1.metal".asInstanceOf[InstanceType]
  val `m5dn.large` = "m5dn.large".asInstanceOf[InstanceType]
  val `m5dn.xlarge` = "m5dn.xlarge".asInstanceOf[InstanceType]
  val `m5dn.2xlarge` = "m5dn.2xlarge".asInstanceOf[InstanceType]
  val `m5dn.4xlarge` = "m5dn.4xlarge".asInstanceOf[InstanceType]
  val `m5dn.8xlarge` = "m5dn.8xlarge".asInstanceOf[InstanceType]
  val `m5dn.12xlarge` = "m5dn.12xlarge".asInstanceOf[InstanceType]
  val `m5dn.16xlarge` = "m5dn.16xlarge".asInstanceOf[InstanceType]
  val `m5dn.24xlarge` = "m5dn.24xlarge".asInstanceOf[InstanceType]
  val `m5n.large` = "m5n.large".asInstanceOf[InstanceType]
  val `m5n.xlarge` = "m5n.xlarge".asInstanceOf[InstanceType]
  val `m5n.2xlarge` = "m5n.2xlarge".asInstanceOf[InstanceType]
  val `m5n.4xlarge` = "m5n.4xlarge".asInstanceOf[InstanceType]
  val `m5n.8xlarge` = "m5n.8xlarge".asInstanceOf[InstanceType]
  val `m5n.12xlarge` = "m5n.12xlarge".asInstanceOf[InstanceType]
  val `m5n.16xlarge` = "m5n.16xlarge".asInstanceOf[InstanceType]
  val `m5n.24xlarge` = "m5n.24xlarge".asInstanceOf[InstanceType]
  val `r5dn.large` = "r5dn.large".asInstanceOf[InstanceType]
  val `r5dn.xlarge` = "r5dn.xlarge".asInstanceOf[InstanceType]
  val `r5dn.2xlarge` = "r5dn.2xlarge".asInstanceOf[InstanceType]
  val `r5dn.4xlarge` = "r5dn.4xlarge".asInstanceOf[InstanceType]
  val `r5dn.8xlarge` = "r5dn.8xlarge".asInstanceOf[InstanceType]
  val `r5dn.12xlarge` = "r5dn.12xlarge".asInstanceOf[InstanceType]
  val `r5dn.16xlarge` = "r5dn.16xlarge".asInstanceOf[InstanceType]
  val `r5dn.24xlarge` = "r5dn.24xlarge".asInstanceOf[InstanceType]
  val `r5n.large` = "r5n.large".asInstanceOf[InstanceType]
  val `r5n.xlarge` = "r5n.xlarge".asInstanceOf[InstanceType]
  val `r5n.2xlarge` = "r5n.2xlarge".asInstanceOf[InstanceType]
  val `r5n.4xlarge` = "r5n.4xlarge".asInstanceOf[InstanceType]
  val `r5n.8xlarge` = "r5n.8xlarge".asInstanceOf[InstanceType]
  val `r5n.12xlarge` = "r5n.12xlarge".asInstanceOf[InstanceType]
  val `r5n.16xlarge` = "r5n.16xlarge".asInstanceOf[InstanceType]
  val `r5n.24xlarge` = "r5n.24xlarge".asInstanceOf[InstanceType]
  val `inf1.xlarge` = "inf1.xlarge".asInstanceOf[InstanceType]
  val `inf1.2xlarge` = "inf1.2xlarge".asInstanceOf[InstanceType]
  val `inf1.6xlarge` = "inf1.6xlarge".asInstanceOf[InstanceType]
  val `inf1.24xlarge` = "inf1.24xlarge".asInstanceOf[InstanceType]
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
  val `mac1.metal` = "mac1.metal".asInstanceOf[InstanceType]
  val `x2gd.medium` = "x2gd.medium".asInstanceOf[InstanceType]
  val `x2gd.large` = "x2gd.large".asInstanceOf[InstanceType]
  val `x2gd.xlarge` = "x2gd.xlarge".asInstanceOf[InstanceType]
  val `x2gd.2xlarge` = "x2gd.2xlarge".asInstanceOf[InstanceType]
  val `x2gd.4xlarge` = "x2gd.4xlarge".asInstanceOf[InstanceType]
  val `x2gd.8xlarge` = "x2gd.8xlarge".asInstanceOf[InstanceType]
  val `x2gd.12xlarge` = "x2gd.12xlarge".asInstanceOf[InstanceType]
  val `x2gd.16xlarge` = "x2gd.16xlarge".asInstanceOf[InstanceType]
  val `x2gd.metal` = "x2gd.metal".asInstanceOf[InstanceType]

  @inline def values = js.Array(`t1.micro`, `t2.nano`, `t2.micro`, `t2.small`, `t2.medium`, `t2.large`, `t2.xlarge`, `t2.2xlarge`, `t3.nano`, `t3.micro`, `t3.small`, `t3.medium`, `t3.large`, `t3.xlarge`, `t3.2xlarge`, `t3a.nano`, `t3a.micro`, `t3a.small`, `t3a.medium`, `t3a.large`, `t3a.xlarge`, `t3a.2xlarge`, `t4g.nano`, `t4g.micro`, `t4g.small`, `t4g.medium`, `t4g.large`, `t4g.xlarge`, `t4g.2xlarge`, `m1.small`, `m1.medium`, `m1.large`, `m1.xlarge`, `m3.medium`, `m3.large`, `m3.xlarge`, `m3.2xlarge`, `m4.large`, `m4.xlarge`, `m4.2xlarge`, `m4.4xlarge`, `m4.10xlarge`, `m4.16xlarge`, `m2.xlarge`, `m2.2xlarge`, `m2.4xlarge`, `cr1.8xlarge`, `r3.large`, `r3.xlarge`, `r3.2xlarge`, `r3.4xlarge`, `r3.8xlarge`, `r4.large`, `r4.xlarge`, `r4.2xlarge`, `r4.4xlarge`, `r4.8xlarge`, `r4.16xlarge`, `r5.large`, `r5.xlarge`, `r5.2xlarge`, `r5.4xlarge`, `r5.8xlarge`, `r5.12xlarge`, `r5.16xlarge`, `r5.24xlarge`, `r5.metal`, `r5a.large`, `r5a.xlarge`, `r5a.2xlarge`, `r5a.4xlarge`, `r5a.8xlarge`, `r5a.12xlarge`, `r5a.16xlarge`, `r5a.24xlarge`, `r5b.large`, `r5b.xlarge`, `r5b.2xlarge`, `r5b.4xlarge`, `r5b.8xlarge`, `r5b.12xlarge`, `r5b.16xlarge`, `r5b.24xlarge`, `r5b.metal`, `r5d.large`, `r5d.xlarge`, `r5d.2xlarge`, `r5d.4xlarge`, `r5d.8xlarge`, `r5d.12xlarge`, `r5d.16xlarge`, `r5d.24xlarge`, `r5d.metal`, `r5ad.large`, `r5ad.xlarge`, `r5ad.2xlarge`, `r5ad.4xlarge`, `r5ad.8xlarge`, `r5ad.12xlarge`, `r5ad.16xlarge`, `r5ad.24xlarge`, `r6g.metal`, `r6g.medium`, `r6g.large`, `r6g.xlarge`, `r6g.2xlarge`, `r6g.4xlarge`, `r6g.8xlarge`, `r6g.12xlarge`, `r6g.16xlarge`, `r6gd.metal`, `r6gd.medium`, `r6gd.large`, `r6gd.xlarge`, `r6gd.2xlarge`, `r6gd.4xlarge`, `r6gd.8xlarge`, `r6gd.12xlarge`, `r6gd.16xlarge`, `x1.16xlarge`, `x1.32xlarge`, `x1e.xlarge`, `x1e.2xlarge`, `x1e.4xlarge`, `x1e.8xlarge`, `x1e.16xlarge`, `x1e.32xlarge`, `i2.xlarge`, `i2.2xlarge`, `i2.4xlarge`, `i2.8xlarge`, `i3.large`, `i3.xlarge`, `i3.2xlarge`, `i3.4xlarge`, `i3.8xlarge`, `i3.16xlarge`, `i3.metal`, `i3en.large`, `i3en.xlarge`, `i3en.2xlarge`, `i3en.3xlarge`, `i3en.6xlarge`, `i3en.12xlarge`, `i3en.24xlarge`, `i3en.metal`, `hi1.4xlarge`, `hs1.8xlarge`, `c1.medium`, `c1.xlarge`, `c3.large`, `c3.xlarge`, `c3.2xlarge`, `c3.4xlarge`, `c3.8xlarge`, `c4.large`, `c4.xlarge`, `c4.2xlarge`, `c4.4xlarge`, `c4.8xlarge`, `c5.large`, `c5.xlarge`, `c5.2xlarge`, `c5.4xlarge`, `c5.9xlarge`, `c5.12xlarge`, `c5.18xlarge`, `c5.24xlarge`, `c5.metal`, `c5a.large`, `c5a.xlarge`, `c5a.2xlarge`, `c5a.4xlarge`, `c5a.8xlarge`, `c5a.12xlarge`, `c5a.16xlarge`, `c5a.24xlarge`, `c5ad.large`, `c5ad.xlarge`, `c5ad.2xlarge`, `c5ad.4xlarge`, `c5ad.8xlarge`, `c5ad.12xlarge`, `c5ad.16xlarge`, `c5ad.24xlarge`, `c5d.large`, `c5d.xlarge`, `c5d.2xlarge`, `c5d.4xlarge`, `c5d.9xlarge`, `c5d.12xlarge`, `c5d.18xlarge`, `c5d.24xlarge`, `c5d.metal`, `c5n.large`, `c5n.xlarge`, `c5n.2xlarge`, `c5n.4xlarge`, `c5n.9xlarge`, `c5n.18xlarge`, `c5n.metal`, `c6g.metal`, `c6g.medium`, `c6g.large`, `c6g.xlarge`, `c6g.2xlarge`, `c6g.4xlarge`, `c6g.8xlarge`, `c6g.12xlarge`, `c6g.16xlarge`, `c6gd.metal`, `c6gd.medium`, `c6gd.large`, `c6gd.xlarge`, `c6gd.2xlarge`, `c6gd.4xlarge`, `c6gd.8xlarge`, `c6gd.12xlarge`, `c6gd.16xlarge`, `c6gn.medium`, `c6gn.large`, `c6gn.xlarge`, `c6gn.2xlarge`, `c6gn.4xlarge`, `c6gn.8xlarge`, `c6gn.12xlarge`, `c6gn.16xlarge`, `cc1.4xlarge`, `cc2.8xlarge`, `g2.2xlarge`, `g2.8xlarge`, `g3.4xlarge`, `g3.8xlarge`, `g3.16xlarge`, `g3s.xlarge`, `g4ad.4xlarge`, `g4ad.8xlarge`, `g4ad.16xlarge`, `g4dn.xlarge`, `g4dn.2xlarge`, `g4dn.4xlarge`, `g4dn.8xlarge`, `g4dn.12xlarge`, `g4dn.16xlarge`, `g4dn.metal`, `cg1.4xlarge`, `p2.xlarge`, `p2.8xlarge`, `p2.16xlarge`, `p3.2xlarge`, `p3.8xlarge`, `p3.16xlarge`, `p3dn.24xlarge`, `p4d.24xlarge`, `d2.xlarge`, `d2.2xlarge`, `d2.4xlarge`, `d2.8xlarge`, `d3.xlarge`, `d3.2xlarge`, `d3.4xlarge`, `d3.8xlarge`, `d3en.xlarge`, `d3en.2xlarge`, `d3en.4xlarge`, `d3en.6xlarge`, `d3en.8xlarge`, `d3en.12xlarge`, `f1.2xlarge`, `f1.4xlarge`, `f1.16xlarge`, `m5.large`, `m5.xlarge`, `m5.2xlarge`, `m5.4xlarge`, `m5.8xlarge`, `m5.12xlarge`, `m5.16xlarge`, `m5.24xlarge`, `m5.metal`, `m5a.large`, `m5a.xlarge`, `m5a.2xlarge`, `m5a.4xlarge`, `m5a.8xlarge`, `m5a.12xlarge`, `m5a.16xlarge`, `m5a.24xlarge`, `m5d.large`, `m5d.xlarge`, `m5d.2xlarge`, `m5d.4xlarge`, `m5d.8xlarge`, `m5d.12xlarge`, `m5d.16xlarge`, `m5d.24xlarge`, `m5d.metal`, `m5ad.large`, `m5ad.xlarge`, `m5ad.2xlarge`, `m5ad.4xlarge`, `m5ad.8xlarge`, `m5ad.12xlarge`, `m5ad.16xlarge`, `m5ad.24xlarge`, `m5zn.large`, `m5zn.xlarge`, `m5zn.2xlarge`, `m5zn.3xlarge`, `m5zn.6xlarge`, `m5zn.12xlarge`, `m5zn.metal`, `h1.2xlarge`, `h1.4xlarge`, `h1.8xlarge`, `h1.16xlarge`, `z1d.large`, `z1d.xlarge`, `z1d.2xlarge`, `z1d.3xlarge`, `z1d.6xlarge`, `z1d.12xlarge`, `z1d.metal`, `u-6tb1.metal`, `u-9tb1.metal`, `u-12tb1.metal`, `u-18tb1.metal`, `u-24tb1.metal`, `a1.medium`, `a1.large`, `a1.xlarge`, `a1.2xlarge`, `a1.4xlarge`, `a1.metal`, `m5dn.large`, `m5dn.xlarge`, `m5dn.2xlarge`, `m5dn.4xlarge`, `m5dn.8xlarge`, `m5dn.12xlarge`, `m5dn.16xlarge`, `m5dn.24xlarge`, `m5n.large`, `m5n.xlarge`, `m5n.2xlarge`, `m5n.4xlarge`, `m5n.8xlarge`, `m5n.12xlarge`, `m5n.16xlarge`, `m5n.24xlarge`, `r5dn.large`, `r5dn.xlarge`, `r5dn.2xlarge`, `r5dn.4xlarge`, `r5dn.8xlarge`, `r5dn.12xlarge`, `r5dn.16xlarge`, `r5dn.24xlarge`, `r5n.large`, `r5n.xlarge`, `r5n.2xlarge`, `r5n.4xlarge`, `r5n.8xlarge`, `r5n.12xlarge`, `r5n.16xlarge`, `r5n.24xlarge`, `inf1.xlarge`, `inf1.2xlarge`, `inf1.6xlarge`, `inf1.24xlarge`, `m6g.metal`, `m6g.medium`, `m6g.large`, `m6g.xlarge`, `m6g.2xlarge`, `m6g.4xlarge`, `m6g.8xlarge`, `m6g.12xlarge`, `m6g.16xlarge`, `m6gd.metal`, `m6gd.medium`, `m6gd.large`, `m6gd.xlarge`, `m6gd.2xlarge`, `m6gd.4xlarge`, `m6gd.8xlarge`, `m6gd.12xlarge`, `m6gd.16xlarge`, `mac1.metal`, `x2gd.medium`, `x2gd.large`, `x2gd.xlarge`, `x2gd.2xlarge`, `x2gd.4xlarge`, `x2gd.8xlarge`, `x2gd.12xlarge`, `x2gd.16xlarge`, `x2gd.metal`)
}

@js.native
sealed trait InstanceTypeHypervisor extends js.Any
object InstanceTypeHypervisor {
  val nitro = "nitro".asInstanceOf[InstanceTypeHypervisor]
  val xen = "xen".asInstanceOf[InstanceTypeHypervisor]

  @inline def values = js.Array(nitro, xen)
}

@js.native
sealed trait InterfacePermissionType extends js.Any
object InterfacePermissionType {
  val `INSTANCE-ATTACH` = "INSTANCE-ATTACH".asInstanceOf[InterfacePermissionType]
  val `EIP-ASSOCIATE` = "EIP-ASSOCIATE".asInstanceOf[InterfacePermissionType]

  @inline def values = js.Array(`INSTANCE-ATTACH`, `EIP-ASSOCIATE`)
}

@js.native
sealed trait Ipv6SupportValue extends js.Any
object Ipv6SupportValue {
  val enable = "enable".asInstanceOf[Ipv6SupportValue]
  val disable = "disable".asInstanceOf[Ipv6SupportValue]

  @inline def values = js.Array(enable, disable)
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

  @inline def values = js.Array(launchTemplateIdDoesNotExist, launchTemplateIdMalformed, launchTemplateNameDoesNotExist, launchTemplateNameMalformed, launchTemplateVersionDoesNotExist, unexpectedError)
}

@js.native
sealed trait LaunchTemplateHttpTokensState extends js.Any
object LaunchTemplateHttpTokensState {
  val optional = "optional".asInstanceOf[LaunchTemplateHttpTokensState]
  val required = "required".asInstanceOf[LaunchTemplateHttpTokensState]

  @inline def values = js.Array(optional, required)
}

@js.native
sealed trait LaunchTemplateInstanceMetadataEndpointState extends js.Any
object LaunchTemplateInstanceMetadataEndpointState {
  val disabled = "disabled".asInstanceOf[LaunchTemplateInstanceMetadataEndpointState]
  val enabled = "enabled".asInstanceOf[LaunchTemplateInstanceMetadataEndpointState]

  @inline def values = js.Array(disabled, enabled)
}

@js.native
sealed trait LaunchTemplateInstanceMetadataOptionsState extends js.Any
object LaunchTemplateInstanceMetadataOptionsState {
  val pending = "pending".asInstanceOf[LaunchTemplateInstanceMetadataOptionsState]
  val applied = "applied".asInstanceOf[LaunchTemplateInstanceMetadataOptionsState]

  @inline def values = js.Array(pending, applied)
}

@js.native
sealed trait ListingState extends js.Any
object ListingState {
  val available = "available".asInstanceOf[ListingState]
  val sold = "sold".asInstanceOf[ListingState]
  val cancelled = "cancelled".asInstanceOf[ListingState]
  val pending = "pending".asInstanceOf[ListingState]

  @inline def values = js.Array(available, sold, cancelled, pending)
}

@js.native
sealed trait ListingStatus extends js.Any
object ListingStatus {
  val active = "active".asInstanceOf[ListingStatus]
  val pending = "pending".asInstanceOf[ListingStatus]
  val cancelled = "cancelled".asInstanceOf[ListingStatus]
  val closed = "closed".asInstanceOf[ListingStatus]

  @inline def values = js.Array(active, pending, cancelled, closed)
}

@js.native
sealed trait LocalGatewayRouteState extends js.Any
object LocalGatewayRouteState {
  val pending = "pending".asInstanceOf[LocalGatewayRouteState]
  val active = "active".asInstanceOf[LocalGatewayRouteState]
  val blackhole = "blackhole".asInstanceOf[LocalGatewayRouteState]
  val deleting = "deleting".asInstanceOf[LocalGatewayRouteState]
  val deleted = "deleted".asInstanceOf[LocalGatewayRouteState]

  @inline def values = js.Array(pending, active, blackhole, deleting, deleted)
}

@js.native
sealed trait LocalGatewayRouteType extends js.Any
object LocalGatewayRouteType {
  val static = "static".asInstanceOf[LocalGatewayRouteType]
  val propagated = "propagated".asInstanceOf[LocalGatewayRouteType]

  @inline def values = js.Array(static, propagated)
}

@js.native
sealed trait LocationType extends js.Any
object LocationType {
  val region = "region".asInstanceOf[LocationType]
  val `availability-zone` = "availability-zone".asInstanceOf[LocationType]
  val `availability-zone-id` = "availability-zone-id".asInstanceOf[LocationType]

  @inline def values = js.Array(region, `availability-zone`, `availability-zone-id`)
}

@js.native
sealed trait LogDestinationType extends js.Any
object LogDestinationType {
  val `cloud-watch-logs` = "cloud-watch-logs".asInstanceOf[LogDestinationType]
  val s3 = "s3".asInstanceOf[LogDestinationType]

  @inline def values = js.Array(`cloud-watch-logs`, s3)
}

@js.native
sealed trait MarketType extends js.Any
object MarketType {
  val spot = "spot".asInstanceOf[MarketType]

  @inline def values = js.Array(spot)
}

@js.native
sealed trait MembershipType extends js.Any
object MembershipType {
  val static = "static".asInstanceOf[MembershipType]
  val igmp = "igmp".asInstanceOf[MembershipType]

  @inline def values = js.Array(static, igmp)
}

@js.native
sealed trait ModifyAvailabilityZoneOptInStatus extends js.Any
object ModifyAvailabilityZoneOptInStatus {
  val `opted-in` = "opted-in".asInstanceOf[ModifyAvailabilityZoneOptInStatus]
  val `not-opted-in` = "not-opted-in".asInstanceOf[ModifyAvailabilityZoneOptInStatus]

  @inline def values = js.Array(`opted-in`, `not-opted-in`)
}

@js.native
sealed trait MonitoringState extends js.Any
object MonitoringState {
  val disabled = "disabled".asInstanceOf[MonitoringState]
  val disabling = "disabling".asInstanceOf[MonitoringState]
  val enabled = "enabled".asInstanceOf[MonitoringState]
  val pending = "pending".asInstanceOf[MonitoringState]

  @inline def values = js.Array(disabled, disabling, enabled, pending)
}

@js.native
sealed trait MoveStatus extends js.Any
object MoveStatus {
  val movingToVpc = "movingToVpc".asInstanceOf[MoveStatus]
  val restoringToClassic = "restoringToClassic".asInstanceOf[MoveStatus]

  @inline def values = js.Array(movingToVpc, restoringToClassic)
}

@js.native
sealed trait MulticastSupportValue extends js.Any
object MulticastSupportValue {
  val enable = "enable".asInstanceOf[MulticastSupportValue]
  val disable = "disable".asInstanceOf[MulticastSupportValue]

  @inline def values = js.Array(enable, disable)
}

@js.native
sealed trait NatGatewayState extends js.Any
object NatGatewayState {
  val pending = "pending".asInstanceOf[NatGatewayState]
  val failed = "failed".asInstanceOf[NatGatewayState]
  val available = "available".asInstanceOf[NatGatewayState]
  val deleting = "deleting".asInstanceOf[NatGatewayState]
  val deleted = "deleted".asInstanceOf[NatGatewayState]

  @inline def values = js.Array(pending, failed, available, deleting, deleted)
}

@js.native
sealed trait NetworkInterfaceAttribute extends js.Any
object NetworkInterfaceAttribute {
  val description = "description".asInstanceOf[NetworkInterfaceAttribute]
  val groupSet = "groupSet".asInstanceOf[NetworkInterfaceAttribute]
  val sourceDestCheck = "sourceDestCheck".asInstanceOf[NetworkInterfaceAttribute]
  val attachment = "attachment".asInstanceOf[NetworkInterfaceAttribute]

  @inline def values = js.Array(description, groupSet, sourceDestCheck, attachment)
}

@js.native
sealed trait NetworkInterfaceCreationType extends js.Any
object NetworkInterfaceCreationType {
  val efa = "efa".asInstanceOf[NetworkInterfaceCreationType]

  @inline def values = js.Array(efa)
}

@js.native
sealed trait NetworkInterfacePermissionStateCode extends js.Any
object NetworkInterfacePermissionStateCode {
  val pending = "pending".asInstanceOf[NetworkInterfacePermissionStateCode]
  val granted = "granted".asInstanceOf[NetworkInterfacePermissionStateCode]
  val revoking = "revoking".asInstanceOf[NetworkInterfacePermissionStateCode]
  val revoked = "revoked".asInstanceOf[NetworkInterfacePermissionStateCode]

  @inline def values = js.Array(pending, granted, revoking, revoked)
}

@js.native
sealed trait NetworkInterfaceStatus extends js.Any
object NetworkInterfaceStatus {
  val available = "available".asInstanceOf[NetworkInterfaceStatus]
  val associated = "associated".asInstanceOf[NetworkInterfaceStatus]
  val attaching = "attaching".asInstanceOf[NetworkInterfaceStatus]
  val `in-use` = "in-use".asInstanceOf[NetworkInterfaceStatus]
  val detaching = "detaching".asInstanceOf[NetworkInterfaceStatus]

  @inline def values = js.Array(available, associated, attaching, `in-use`, detaching)
}

@js.native
sealed trait NetworkInterfaceType extends js.Any
object NetworkInterfaceType {
  val interface = "interface".asInstanceOf[NetworkInterfaceType]
  val natGateway = "natGateway".asInstanceOf[NetworkInterfaceType]
  val efa = "efa".asInstanceOf[NetworkInterfaceType]

  @inline def values = js.Array(interface, natGateway, efa)
}

@js.native
sealed trait OfferingClassType extends js.Any
object OfferingClassType {
  val standard = "standard".asInstanceOf[OfferingClassType]
  val convertible = "convertible".asInstanceOf[OfferingClassType]

  @inline def values = js.Array(standard, convertible)
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

  @inline def values = js.Array(`Heavy Utilization`, `Medium Utilization`, `Light Utilization`, `No Upfront`, `Partial Upfront`, `All Upfront`)
}

@js.native
sealed trait OnDemandAllocationStrategy extends js.Any
object OnDemandAllocationStrategy {
  val lowestPrice = "lowestPrice".asInstanceOf[OnDemandAllocationStrategy]
  val prioritized = "prioritized".asInstanceOf[OnDemandAllocationStrategy]

  @inline def values = js.Array(lowestPrice, prioritized)
}

@js.native
sealed trait OperationType extends js.Any
object OperationType {
  val add = "add".asInstanceOf[OperationType]
  val remove = "remove".asInstanceOf[OperationType]

  @inline def values = js.Array(add, remove)
}

@js.native
sealed trait PartitionLoadFrequency extends js.Any
object PartitionLoadFrequency {
  val none = "none".asInstanceOf[PartitionLoadFrequency]
  val daily = "daily".asInstanceOf[PartitionLoadFrequency]
  val weekly = "weekly".asInstanceOf[PartitionLoadFrequency]
  val monthly = "monthly".asInstanceOf[PartitionLoadFrequency]

  @inline def values = js.Array(none, daily, weekly, monthly)
}

@js.native
sealed trait PaymentOption extends js.Any
object PaymentOption {
  val AllUpfront = "AllUpfront".asInstanceOf[PaymentOption]
  val PartialUpfront = "PartialUpfront".asInstanceOf[PaymentOption]
  val NoUpfront = "NoUpfront".asInstanceOf[PaymentOption]

  @inline def values = js.Array(AllUpfront, PartialUpfront, NoUpfront)
}

@js.native
sealed trait PermissionGroup extends js.Any
object PermissionGroup {
  val all = "all".asInstanceOf[PermissionGroup]

  @inline def values = js.Array(all)
}

@js.native
sealed trait PlacementGroupState extends js.Any
object PlacementGroupState {
  val pending = "pending".asInstanceOf[PlacementGroupState]
  val available = "available".asInstanceOf[PlacementGroupState]
  val deleting = "deleting".asInstanceOf[PlacementGroupState]
  val deleted = "deleted".asInstanceOf[PlacementGroupState]

  @inline def values = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait PlacementGroupStrategy extends js.Any
object PlacementGroupStrategy {
  val cluster = "cluster".asInstanceOf[PlacementGroupStrategy]
  val partition = "partition".asInstanceOf[PlacementGroupStrategy]
  val spread = "spread".asInstanceOf[PlacementGroupStrategy]

  @inline def values = js.Array(cluster, partition, spread)
}

@js.native
sealed trait PlacementStrategy extends js.Any
object PlacementStrategy {
  val cluster = "cluster".asInstanceOf[PlacementStrategy]
  val spread = "spread".asInstanceOf[PlacementStrategy]
  val partition = "partition".asInstanceOf[PlacementStrategy]

  @inline def values = js.Array(cluster, spread, partition)
}

@js.native
sealed trait PlatformValues extends js.Any
object PlatformValues {
  val Windows = "Windows".asInstanceOf[PlatformValues]

  @inline def values = js.Array(Windows)
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

  @inline def values = js.Array(`create-in-progress`, `create-complete`, `create-failed`, `modify-in-progress`, `modify-complete`, `modify-failed`, `restore-in-progress`, `restore-complete`, `restore-failed`, `delete-in-progress`, `delete-complete`, `delete-failed`)
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

  @inline def values = js.Array(All, Service, OrganizationUnit, Account, User, Role)
}

@js.native
sealed trait ProductCodeValues extends js.Any
object ProductCodeValues {
  val devpay = "devpay".asInstanceOf[ProductCodeValues]
  val marketplace = "marketplace".asInstanceOf[ProductCodeValues]

  @inline def values = js.Array(devpay, marketplace)
}

@js.native
sealed trait Protocol extends js.Any
object Protocol {
  val tcp = "tcp".asInstanceOf[Protocol]
  val udp = "udp".asInstanceOf[Protocol]

  @inline def values = js.Array(tcp, udp)
}

@js.native
sealed trait ProtocolValue extends js.Any
object ProtocolValue {
  val gre = "gre".asInstanceOf[ProtocolValue]

  @inline def values = js.Array(gre)
}

@js.native
sealed trait RIProductDescription extends js.Any
object RIProductDescription {
  val `Linux/UNIX` = "Linux/UNIX".asInstanceOf[RIProductDescription]
  val `Linux/UNIX (Amazon VPC)` = "Linux/UNIX (Amazon VPC)".asInstanceOf[RIProductDescription]
  val Windows = "Windows".asInstanceOf[RIProductDescription]
  val `Windows (Amazon VPC)` = "Windows (Amazon VPC)".asInstanceOf[RIProductDescription]

  @inline def values = js.Array(`Linux/UNIX`, `Linux/UNIX (Amazon VPC)`, Windows, `Windows (Amazon VPC)`)
}

@js.native
sealed trait RecurringChargeFrequency extends js.Any
object RecurringChargeFrequency {
  val Hourly = "Hourly".asInstanceOf[RecurringChargeFrequency]

  @inline def values = js.Array(Hourly)
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

  @inline def values = js.Array(pending, `in-progress`, failing, succeeded, failed, `failed-detached`)
}

@js.native
sealed trait ReplacementStrategy extends js.Any
object ReplacementStrategy {
  val launch = "launch".asInstanceOf[ReplacementStrategy]

  @inline def values = js.Array(launch)
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

  @inline def values = js.Array(`instance-stuck-in-state`, unresponsive, `not-accepting-credentials`, `password-not-available`, `performance-network`, `performance-instance-store`, `performance-ebs-volume`, `performance-other`, other)
}

@js.native
sealed trait ReportStatusType extends js.Any
object ReportStatusType {
  val ok = "ok".asInstanceOf[ReportStatusType]
  val impaired = "impaired".asInstanceOf[ReportStatusType]

  @inline def values = js.Array(ok, impaired)
}

@js.native
sealed trait ReservationState extends js.Any
object ReservationState {
  val `payment-pending` = "payment-pending".asInstanceOf[ReservationState]
  val `payment-failed` = "payment-failed".asInstanceOf[ReservationState]
  val active = "active".asInstanceOf[ReservationState]
  val retired = "retired".asInstanceOf[ReservationState]

  @inline def values = js.Array(`payment-pending`, `payment-failed`, active, retired)
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

  @inline def values = js.Array(`payment-pending`, active, `payment-failed`, retired, queued, `queued-deleted`)
}

@js.native
sealed trait ResetFpgaImageAttributeName extends js.Any
object ResetFpgaImageAttributeName {
  val loadPermission = "loadPermission".asInstanceOf[ResetFpgaImageAttributeName]

  @inline def values = js.Array(loadPermission)
}

@js.native
sealed trait ResetImageAttributeName extends js.Any
object ResetImageAttributeName {
  val launchPermission = "launchPermission".asInstanceOf[ResetImageAttributeName]

  @inline def values = js.Array(launchPermission)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val `client-vpn-endpoint` = "client-vpn-endpoint".asInstanceOf[ResourceType]
  val `customer-gateway` = "customer-gateway".asInstanceOf[ResourceType]
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
  val `internet-gateway` = "internet-gateway".asInstanceOf[ResourceType]
  val `key-pair` = "key-pair".asInstanceOf[ResourceType]
  val `launch-template` = "launch-template".asInstanceOf[ResourceType]
  val `local-gateway-route-table-vpc-association` = "local-gateway-route-table-vpc-association".asInstanceOf[ResourceType]
  val natgateway = "natgateway".asInstanceOf[ResourceType]
  val `network-acl` = "network-acl".asInstanceOf[ResourceType]
  val `network-interface` = "network-interface".asInstanceOf[ResourceType]
  val `network-insights-analysis` = "network-insights-analysis".asInstanceOf[ResourceType]
  val `network-insights-path` = "network-insights-path".asInstanceOf[ResourceType]
  val `placement-group` = "placement-group".asInstanceOf[ResourceType]
  val `reserved-instances` = "reserved-instances".asInstanceOf[ResourceType]
  val `route-table` = "route-table".asInstanceOf[ResourceType]
  val `security-group` = "security-group".asInstanceOf[ResourceType]
  val snapshot = "snapshot".asInstanceOf[ResourceType]
  val `spot-fleet-request` = "spot-fleet-request".asInstanceOf[ResourceType]
  val `spot-instances-request` = "spot-instances-request".asInstanceOf[ResourceType]
  val subnet = "subnet".asInstanceOf[ResourceType]
  val `traffic-mirror-filter` = "traffic-mirror-filter".asInstanceOf[ResourceType]
  val `traffic-mirror-session` = "traffic-mirror-session".asInstanceOf[ResourceType]
  val `traffic-mirror-target` = "traffic-mirror-target".asInstanceOf[ResourceType]
  val `transit-gateway` = "transit-gateway".asInstanceOf[ResourceType]
  val `transit-gateway-attachment` = "transit-gateway-attachment".asInstanceOf[ResourceType]
  val `transit-gateway-connect-peer` = "transit-gateway-connect-peer".asInstanceOf[ResourceType]
  val `transit-gateway-multicast-domain` = "transit-gateway-multicast-domain".asInstanceOf[ResourceType]
  val `transit-gateway-route-table` = "transit-gateway-route-table".asInstanceOf[ResourceType]
  val volume = "volume".asInstanceOf[ResourceType]
  val vpc = "vpc".asInstanceOf[ResourceType]
  val `vpc-peering-connection` = "vpc-peering-connection".asInstanceOf[ResourceType]
  val `vpn-connection` = "vpn-connection".asInstanceOf[ResourceType]
  val `vpn-gateway` = "vpn-gateway".asInstanceOf[ResourceType]
  val `vpc-flow-log` = "vpc-flow-log".asInstanceOf[ResourceType]

  @inline def values = js.Array(`client-vpn-endpoint`, `customer-gateway`, `dedicated-host`, `dhcp-options`, `egress-only-internet-gateway`, `elastic-ip`, `elastic-gpu`, `export-image-task`, `export-instance-task`, fleet, `fpga-image`, `host-reservation`, image, `import-image-task`, `import-snapshot-task`, instance, `internet-gateway`, `key-pair`, `launch-template`, `local-gateway-route-table-vpc-association`, natgateway, `network-acl`, `network-interface`, `network-insights-analysis`, `network-insights-path`, `placement-group`, `reserved-instances`, `route-table`, `security-group`, snapshot, `spot-fleet-request`, `spot-instances-request`, subnet, `traffic-mirror-filter`, `traffic-mirror-session`, `traffic-mirror-target`, `transit-gateway`, `transit-gateway-attachment`, `transit-gateway-connect-peer`, `transit-gateway-multicast-domain`, `transit-gateway-route-table`, volume, vpc, `vpc-peering-connection`, `vpn-connection`, `vpn-gateway`, `vpc-flow-log`)
}

@js.native
sealed trait RootDeviceType extends js.Any
object RootDeviceType {
  val ebs = "ebs".asInstanceOf[RootDeviceType]
  val `instance-store` = "instance-store".asInstanceOf[RootDeviceType]

  @inline def values = js.Array(ebs, `instance-store`)
}

@js.native
sealed trait RouteOrigin extends js.Any
object RouteOrigin {
  val CreateRouteTable = "CreateRouteTable".asInstanceOf[RouteOrigin]
  val CreateRoute = "CreateRoute".asInstanceOf[RouteOrigin]
  val EnableVgwRoutePropagation = "EnableVgwRoutePropagation".asInstanceOf[RouteOrigin]

  @inline def values = js.Array(CreateRouteTable, CreateRoute, EnableVgwRoutePropagation)
}

@js.native
sealed trait RouteState extends js.Any
object RouteState {
  val active = "active".asInstanceOf[RouteState]
  val blackhole = "blackhole".asInstanceOf[RouteState]

  @inline def values = js.Array(active, blackhole)
}

@js.native
sealed trait RouteTableAssociationStateCode extends js.Any
object RouteTableAssociationStateCode {
  val associating = "associating".asInstanceOf[RouteTableAssociationStateCode]
  val associated = "associated".asInstanceOf[RouteTableAssociationStateCode]
  val disassociating = "disassociating".asInstanceOf[RouteTableAssociationStateCode]
  val disassociated = "disassociated".asInstanceOf[RouteTableAssociationStateCode]
  val failed = "failed".asInstanceOf[RouteTableAssociationStateCode]

  @inline def values = js.Array(associating, associated, disassociating, disassociated, failed)
}

@js.native
sealed trait RuleAction extends js.Any
object RuleAction {
  val allow = "allow".asInstanceOf[RuleAction]
  val deny = "deny".asInstanceOf[RuleAction]

  @inline def values = js.Array(allow, deny)
}

@js.native
sealed trait SelfServicePortal extends js.Any
object SelfServicePortal {
  val enabled = "enabled".asInstanceOf[SelfServicePortal]
  val disabled = "disabled".asInstanceOf[SelfServicePortal]

  @inline def values = js.Array(enabled, disabled)
}

@js.native
sealed trait ServiceState extends js.Any
object ServiceState {
  val Pending = "Pending".asInstanceOf[ServiceState]
  val Available = "Available".asInstanceOf[ServiceState]
  val Deleting = "Deleting".asInstanceOf[ServiceState]
  val Deleted = "Deleted".asInstanceOf[ServiceState]
  val Failed = "Failed".asInstanceOf[ServiceState]

  @inline def values = js.Array(Pending, Available, Deleting, Deleted, Failed)
}

@js.native
sealed trait ServiceType extends js.Any
object ServiceType {
  val Interface = "Interface".asInstanceOf[ServiceType]
  val Gateway = "Gateway".asInstanceOf[ServiceType]
  val GatewayLoadBalancer = "GatewayLoadBalancer".asInstanceOf[ServiceType]

  @inline def values = js.Array(Interface, Gateway, GatewayLoadBalancer)
}

@js.native
sealed trait ShutdownBehavior extends js.Any
object ShutdownBehavior {
  val stop = "stop".asInstanceOf[ShutdownBehavior]
  val terminate = "terminate".asInstanceOf[ShutdownBehavior]

  @inline def values = js.Array(stop, terminate)
}

@js.native
sealed trait SnapshotAttributeName extends js.Any
object SnapshotAttributeName {
  val productCodes = "productCodes".asInstanceOf[SnapshotAttributeName]
  val createVolumePermission = "createVolumePermission".asInstanceOf[SnapshotAttributeName]

  @inline def values = js.Array(productCodes, createVolumePermission)
}

@js.native
sealed trait SnapshotState extends js.Any
object SnapshotState {
  val pending = "pending".asInstanceOf[SnapshotState]
  val completed = "completed".asInstanceOf[SnapshotState]
  val error = "error".asInstanceOf[SnapshotState]

  @inline def values = js.Array(pending, completed, error)
}

@js.native
sealed trait SpotAllocationStrategy extends js.Any
object SpotAllocationStrategy {
  val `lowest-price` = "lowest-price".asInstanceOf[SpotAllocationStrategy]
  val diversified = "diversified".asInstanceOf[SpotAllocationStrategy]
  val `capacity-optimized` = "capacity-optimized".asInstanceOf[SpotAllocationStrategy]
  val `capacity-optimized-prioritized` = "capacity-optimized-prioritized".asInstanceOf[SpotAllocationStrategy]

  @inline def values = js.Array(`lowest-price`, diversified, `capacity-optimized`, `capacity-optimized-prioritized`)
}

@js.native
sealed trait SpotInstanceInterruptionBehavior extends js.Any
object SpotInstanceInterruptionBehavior {
  val hibernate = "hibernate".asInstanceOf[SpotInstanceInterruptionBehavior]
  val stop = "stop".asInstanceOf[SpotInstanceInterruptionBehavior]
  val terminate = "terminate".asInstanceOf[SpotInstanceInterruptionBehavior]

  @inline def values = js.Array(hibernate, stop, terminate)
}

@js.native
sealed trait SpotInstanceState extends js.Any
object SpotInstanceState {
  val open = "open".asInstanceOf[SpotInstanceState]
  val active = "active".asInstanceOf[SpotInstanceState]
  val closed = "closed".asInstanceOf[SpotInstanceState]
  val cancelled = "cancelled".asInstanceOf[SpotInstanceState]
  val failed = "failed".asInstanceOf[SpotInstanceState]

  @inline def values = js.Array(open, active, closed, cancelled, failed)
}

@js.native
sealed trait SpotInstanceType extends js.Any
object SpotInstanceType {
  val `one-time` = "one-time".asInstanceOf[SpotInstanceType]
  val persistent = "persistent".asInstanceOf[SpotInstanceType]

  @inline def values = js.Array(`one-time`, persistent)
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

  @inline def values = js.Array(PendingAcceptance, Pending, Available, Deleting, Deleted, Rejected, Failed, Expired)
}

@js.native
sealed trait StaticSourcesSupportValue extends js.Any
object StaticSourcesSupportValue {
  val enable = "enable".asInstanceOf[StaticSourcesSupportValue]
  val disable = "disable".asInstanceOf[StaticSourcesSupportValue]

  @inline def values = js.Array(enable, disable)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val MoveInProgress = "MoveInProgress".asInstanceOf[Status]
  val InVpc = "InVpc".asInstanceOf[Status]
  val InClassic = "InClassic".asInstanceOf[Status]

  @inline def values = js.Array(MoveInProgress, InVpc, InClassic)
}

@js.native
sealed trait StatusName extends js.Any
object StatusName {
  val reachability = "reachability".asInstanceOf[StatusName]

  @inline def values = js.Array(reachability)
}

@js.native
sealed trait StatusType extends js.Any
object StatusType {
  val passed = "passed".asInstanceOf[StatusType]
  val failed = "failed".asInstanceOf[StatusType]
  val `insufficient-data` = "insufficient-data".asInstanceOf[StatusType]
  val initializing = "initializing".asInstanceOf[StatusType]

  @inline def values = js.Array(passed, failed, `insufficient-data`, initializing)
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

  @inline def values = js.Array(associating, associated, disassociating, disassociated, failing, failed)
}

@js.native
sealed trait SubnetState extends js.Any
object SubnetState {
  val pending = "pending".asInstanceOf[SubnetState]
  val available = "available".asInstanceOf[SubnetState]

  @inline def values = js.Array(pending, available)
}

@js.native
sealed trait SummaryStatus extends js.Any
object SummaryStatus {
  val ok = "ok".asInstanceOf[SummaryStatus]
  val impaired = "impaired".asInstanceOf[SummaryStatus]
  val `insufficient-data` = "insufficient-data".asInstanceOf[SummaryStatus]
  val `not-applicable` = "not-applicable".asInstanceOf[SummaryStatus]
  val initializing = "initializing".asInstanceOf[SummaryStatus]

  @inline def values = js.Array(ok, impaired, `insufficient-data`, `not-applicable`, initializing)
}

@js.native
sealed trait TelemetryStatus extends js.Any
object TelemetryStatus {
  val UP = "UP".asInstanceOf[TelemetryStatus]
  val DOWN = "DOWN".asInstanceOf[TelemetryStatus]

  @inline def values = js.Array(UP, DOWN)
}

@js.native
sealed trait Tenancy extends js.Any
object Tenancy {
  val default = "default".asInstanceOf[Tenancy]
  val dedicated = "dedicated".asInstanceOf[Tenancy]
  val host = "host".asInstanceOf[Tenancy]

  @inline def values = js.Array(default, dedicated, host)
}

@js.native
sealed trait TrafficDirection extends js.Any
object TrafficDirection {
  val ingress = "ingress".asInstanceOf[TrafficDirection]
  val egress = "egress".asInstanceOf[TrafficDirection]

  @inline def values = js.Array(ingress, egress)
}

@js.native
sealed trait TrafficMirrorFilterRuleField extends js.Any
object TrafficMirrorFilterRuleField {
  val `destination-port-range` = "destination-port-range".asInstanceOf[TrafficMirrorFilterRuleField]
  val `source-port-range` = "source-port-range".asInstanceOf[TrafficMirrorFilterRuleField]
  val protocol = "protocol".asInstanceOf[TrafficMirrorFilterRuleField]
  val description = "description".asInstanceOf[TrafficMirrorFilterRuleField]

  @inline def values = js.Array(`destination-port-range`, `source-port-range`, protocol, description)
}

@js.native
sealed trait TrafficMirrorNetworkService extends js.Any
object TrafficMirrorNetworkService {
  val `amazon-dns` = "amazon-dns".asInstanceOf[TrafficMirrorNetworkService]

  @inline def values = js.Array(`amazon-dns`)
}

@js.native
sealed trait TrafficMirrorRuleAction extends js.Any
object TrafficMirrorRuleAction {
  val accept = "accept".asInstanceOf[TrafficMirrorRuleAction]
  val reject = "reject".asInstanceOf[TrafficMirrorRuleAction]

  @inline def values = js.Array(accept, reject)
}

@js.native
sealed trait TrafficMirrorSessionField extends js.Any
object TrafficMirrorSessionField {
  val `packet-length` = "packet-length".asInstanceOf[TrafficMirrorSessionField]
  val description = "description".asInstanceOf[TrafficMirrorSessionField]
  val `virtual-network-id` = "virtual-network-id".asInstanceOf[TrafficMirrorSessionField]

  @inline def values = js.Array(`packet-length`, description, `virtual-network-id`)
}

@js.native
sealed trait TrafficMirrorTargetType extends js.Any
object TrafficMirrorTargetType {
  val `network-interface` = "network-interface".asInstanceOf[TrafficMirrorTargetType]
  val `network-load-balancer` = "network-load-balancer".asInstanceOf[TrafficMirrorTargetType]

  @inline def values = js.Array(`network-interface`, `network-load-balancer`)
}

@js.native
sealed trait TrafficType extends js.Any
object TrafficType {
  val ACCEPT = "ACCEPT".asInstanceOf[TrafficType]
  val REJECT = "REJECT".asInstanceOf[TrafficType]
  val ALL = "ALL".asInstanceOf[TrafficType]

  @inline def values = js.Array(ACCEPT, REJECT, ALL)
}

@js.native
sealed trait TransitGatewayAssociationState extends js.Any
object TransitGatewayAssociationState {
  val associating = "associating".asInstanceOf[TransitGatewayAssociationState]
  val associated = "associated".asInstanceOf[TransitGatewayAssociationState]
  val disassociating = "disassociating".asInstanceOf[TransitGatewayAssociationState]
  val disassociated = "disassociated".asInstanceOf[TransitGatewayAssociationState]

  @inline def values = js.Array(associating, associated, disassociating, disassociated)
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

  @inline def values = js.Array(vpc, vpn, `direct-connect-gateway`, connect, peering, `tgw-peering`)
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

  @inline def values = js.Array(initiating, initiatingRequest, pendingAcceptance, rollingBack, pending, available, modifying, deleting, deleted, failed, rejected, rejecting, failing)
}

@js.native
sealed trait TransitGatewayConnectPeerState extends js.Any
object TransitGatewayConnectPeerState {
  val pending = "pending".asInstanceOf[TransitGatewayConnectPeerState]
  val available = "available".asInstanceOf[TransitGatewayConnectPeerState]
  val deleting = "deleting".asInstanceOf[TransitGatewayConnectPeerState]
  val deleted = "deleted".asInstanceOf[TransitGatewayConnectPeerState]

  @inline def values = js.Array(pending, available, deleting, deleted)
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

  @inline def values = js.Array(pendingAcceptance, associating, associated, disassociating, disassociated, rejected, failed)
}

@js.native
sealed trait TransitGatewayMulticastDomainState extends js.Any
object TransitGatewayMulticastDomainState {
  val pending = "pending".asInstanceOf[TransitGatewayMulticastDomainState]
  val available = "available".asInstanceOf[TransitGatewayMulticastDomainState]
  val deleting = "deleting".asInstanceOf[TransitGatewayMulticastDomainState]
  val deleted = "deleted".asInstanceOf[TransitGatewayMulticastDomainState]

  @inline def values = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait TransitGatewayPrefixListReferenceState extends js.Any
object TransitGatewayPrefixListReferenceState {
  val pending = "pending".asInstanceOf[TransitGatewayPrefixListReferenceState]
  val available = "available".asInstanceOf[TransitGatewayPrefixListReferenceState]
  val modifying = "modifying".asInstanceOf[TransitGatewayPrefixListReferenceState]
  val deleting = "deleting".asInstanceOf[TransitGatewayPrefixListReferenceState]

  @inline def values = js.Array(pending, available, modifying, deleting)
}

@js.native
sealed trait TransitGatewayPropagationState extends js.Any
object TransitGatewayPropagationState {
  val enabling = "enabling".asInstanceOf[TransitGatewayPropagationState]
  val enabled = "enabled".asInstanceOf[TransitGatewayPropagationState]
  val disabling = "disabling".asInstanceOf[TransitGatewayPropagationState]
  val disabled = "disabled".asInstanceOf[TransitGatewayPropagationState]

  @inline def values = js.Array(enabling, enabled, disabling, disabled)
}

@js.native
sealed trait TransitGatewayRouteState extends js.Any
object TransitGatewayRouteState {
  val pending = "pending".asInstanceOf[TransitGatewayRouteState]
  val active = "active".asInstanceOf[TransitGatewayRouteState]
  val blackhole = "blackhole".asInstanceOf[TransitGatewayRouteState]
  val deleting = "deleting".asInstanceOf[TransitGatewayRouteState]
  val deleted = "deleted".asInstanceOf[TransitGatewayRouteState]

  @inline def values = js.Array(pending, active, blackhole, deleting, deleted)
}

@js.native
sealed trait TransitGatewayRouteTableState extends js.Any
object TransitGatewayRouteTableState {
  val pending = "pending".asInstanceOf[TransitGatewayRouteTableState]
  val available = "available".asInstanceOf[TransitGatewayRouteTableState]
  val deleting = "deleting".asInstanceOf[TransitGatewayRouteTableState]
  val deleted = "deleted".asInstanceOf[TransitGatewayRouteTableState]

  @inline def values = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait TransitGatewayRouteType extends js.Any
object TransitGatewayRouteType {
  val static = "static".asInstanceOf[TransitGatewayRouteType]
  val propagated = "propagated".asInstanceOf[TransitGatewayRouteType]

  @inline def values = js.Array(static, propagated)
}

@js.native
sealed trait TransitGatewayState extends js.Any
object TransitGatewayState {
  val pending = "pending".asInstanceOf[TransitGatewayState]
  val available = "available".asInstanceOf[TransitGatewayState]
  val modifying = "modifying".asInstanceOf[TransitGatewayState]
  val deleting = "deleting".asInstanceOf[TransitGatewayState]
  val deleted = "deleted".asInstanceOf[TransitGatewayState]

  @inline def values = js.Array(pending, available, modifying, deleting, deleted)
}

@js.native
sealed trait TransportProtocol extends js.Any
object TransportProtocol {
  val tcp = "tcp".asInstanceOf[TransportProtocol]
  val udp = "udp".asInstanceOf[TransportProtocol]

  @inline def values = js.Array(tcp, udp)
}

@js.native
sealed trait TunnelInsideIpVersion extends js.Any
object TunnelInsideIpVersion {
  val ipv4 = "ipv4".asInstanceOf[TunnelInsideIpVersion]
  val ipv6 = "ipv6".asInstanceOf[TunnelInsideIpVersion]

  @inline def values = js.Array(ipv4, ipv6)
}

@js.native
sealed trait UnlimitedSupportedInstanceFamily extends js.Any
object UnlimitedSupportedInstanceFamily {
  val t2 = "t2".asInstanceOf[UnlimitedSupportedInstanceFamily]
  val t3 = "t3".asInstanceOf[UnlimitedSupportedInstanceFamily]
  val t3a = "t3a".asInstanceOf[UnlimitedSupportedInstanceFamily]
  val t4g = "t4g".asInstanceOf[UnlimitedSupportedInstanceFamily]

  @inline def values = js.Array(t2, t3, t3a, t4g)
}

@js.native
sealed trait UnsuccessfulInstanceCreditSpecificationErrorCode extends js.Any
object UnsuccessfulInstanceCreditSpecificationErrorCode {
  val `InvalidInstanceID.Malformed` = "InvalidInstanceID.Malformed".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]
  val `InvalidInstanceID.NotFound` = "InvalidInstanceID.NotFound".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]
  val IncorrectInstanceState = "IncorrectInstanceState".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]
  val `InstanceCreditSpecification.NotSupported` = "InstanceCreditSpecification.NotSupported".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]

  @inline def values = js.Array(`InvalidInstanceID.Malformed`, `InvalidInstanceID.NotFound`, IncorrectInstanceState, `InstanceCreditSpecification.NotSupported`)
}

@js.native
sealed trait UsageClassType extends js.Any
object UsageClassType {
  val spot = "spot".asInstanceOf[UsageClassType]
  val `on-demand` = "on-demand".asInstanceOf[UsageClassType]

  @inline def values = js.Array(spot, `on-demand`)
}

@js.native
sealed trait VirtualizationType extends js.Any
object VirtualizationType {
  val hvm = "hvm".asInstanceOf[VirtualizationType]
  val paravirtual = "paravirtual".asInstanceOf[VirtualizationType]

  @inline def values = js.Array(hvm, paravirtual)
}

@js.native
sealed trait VolumeAttachmentState extends js.Any
object VolumeAttachmentState {
  val attaching = "attaching".asInstanceOf[VolumeAttachmentState]
  val attached = "attached".asInstanceOf[VolumeAttachmentState]
  val detaching = "detaching".asInstanceOf[VolumeAttachmentState]
  val detached = "detached".asInstanceOf[VolumeAttachmentState]
  val busy = "busy".asInstanceOf[VolumeAttachmentState]

  @inline def values = js.Array(attaching, attached, detaching, detached, busy)
}

@js.native
sealed trait VolumeAttributeName extends js.Any
object VolumeAttributeName {
  val autoEnableIO = "autoEnableIO".asInstanceOf[VolumeAttributeName]
  val productCodes = "productCodes".asInstanceOf[VolumeAttributeName]

  @inline def values = js.Array(autoEnableIO, productCodes)
}

@js.native
sealed trait VolumeModificationState extends js.Any
object VolumeModificationState {
  val modifying = "modifying".asInstanceOf[VolumeModificationState]
  val optimizing = "optimizing".asInstanceOf[VolumeModificationState]
  val completed = "completed".asInstanceOf[VolumeModificationState]
  val failed = "failed".asInstanceOf[VolumeModificationState]

  @inline def values = js.Array(modifying, optimizing, completed, failed)
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

  @inline def values = js.Array(creating, available, `in-use`, deleting, deleted, error)
}

@js.native
sealed trait VolumeStatusInfoStatus extends js.Any
object VolumeStatusInfoStatus {
  val ok = "ok".asInstanceOf[VolumeStatusInfoStatus]
  val impaired = "impaired".asInstanceOf[VolumeStatusInfoStatus]
  val `insufficient-data` = "insufficient-data".asInstanceOf[VolumeStatusInfoStatus]

  @inline def values = js.Array(ok, impaired, `insufficient-data`)
}

@js.native
sealed trait VolumeStatusName extends js.Any
object VolumeStatusName {
  val `io-enabled` = "io-enabled".asInstanceOf[VolumeStatusName]
  val `io-performance` = "io-performance".asInstanceOf[VolumeStatusName]

  @inline def values = js.Array(`io-enabled`, `io-performance`)
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

  @inline def values = js.Array(standard, io1, io2, gp2, sc1, st1, gp3)
}

@js.native
sealed trait VpcAttributeName extends js.Any
object VpcAttributeName {
  val enableDnsSupport = "enableDnsSupport".asInstanceOf[VpcAttributeName]
  val enableDnsHostnames = "enableDnsHostnames".asInstanceOf[VpcAttributeName]

  @inline def values = js.Array(enableDnsSupport, enableDnsHostnames)
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

  @inline def values = js.Array(associating, associated, disassociating, disassociated, failing, failed)
}

@js.native
sealed trait VpcEndpointType extends js.Any
object VpcEndpointType {
  val Interface = "Interface".asInstanceOf[VpcEndpointType]
  val Gateway = "Gateway".asInstanceOf[VpcEndpointType]
  val GatewayLoadBalancer = "GatewayLoadBalancer".asInstanceOf[VpcEndpointType]

  @inline def values = js.Array(Interface, Gateway, GatewayLoadBalancer)
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

  @inline def values = js.Array(`initiating-request`, `pending-acceptance`, active, deleted, rejected, failed, expired, provisioning, deleting)
}

@js.native
sealed trait VpcState extends js.Any
object VpcState {
  val pending = "pending".asInstanceOf[VpcState]
  val available = "available".asInstanceOf[VpcState]

  @inline def values = js.Array(pending, available)
}

@js.native
sealed trait VpcTenancy extends js.Any
object VpcTenancy {
  val default = "default".asInstanceOf[VpcTenancy]

  @inline def values = js.Array(default)
}

@js.native
sealed trait VpnEcmpSupportValue extends js.Any
object VpnEcmpSupportValue {
  val enable = "enable".asInstanceOf[VpnEcmpSupportValue]
  val disable = "disable".asInstanceOf[VpnEcmpSupportValue]

  @inline def values = js.Array(enable, disable)
}

@js.native
sealed trait VpnProtocol extends js.Any
object VpnProtocol {
  val openvpn = "openvpn".asInstanceOf[VpnProtocol]

  @inline def values = js.Array(openvpn)
}

@js.native
sealed trait VpnState extends js.Any
object VpnState {
  val pending = "pending".asInstanceOf[VpnState]
  val available = "available".asInstanceOf[VpnState]
  val deleting = "deleting".asInstanceOf[VpnState]
  val deleted = "deleted".asInstanceOf[VpnState]

  @inline def values = js.Array(pending, available, deleting, deleted)
}

@js.native
sealed trait VpnStaticRouteSource extends js.Any
object VpnStaticRouteSource {
  val Static = "Static".asInstanceOf[VpnStaticRouteSource]

  @inline def values = js.Array(Static)
}

@js.native
sealed trait scope extends js.Any
object scope {
  val `Availability Zone` = "Availability Zone".asInstanceOf[scope]
  val Region = "Region".asInstanceOf[scope]

  @inline def values = js.Array(`Availability Zone`, Region)
}

