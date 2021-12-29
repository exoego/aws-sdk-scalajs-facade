package facade.amazonaws.services.ec2

import scalajs._

type AccountAttributeName = "supported-platforms" | "default-vpc"
object AccountAttributeName {
  val `supported-platforms`: "supported-platforms" = "supported-platforms"
  val `default-vpc`: "default-vpc" = "default-vpc"

  @inline def values = js.Array[AccountAttributeName](`supported-platforms`, `default-vpc`)
}

type ActivityStatus = "error" | "pending_fulfillment" | "pending_termination" | "fulfilled"
object ActivityStatus {
  val error: "error" = "error"
  val pending_fulfillment: "pending_fulfillment" = "pending_fulfillment"
  val pending_termination: "pending_termination" = "pending_termination"
  val fulfilled: "fulfilled" = "fulfilled"

  @inline def values = js.Array[ActivityStatus](error, pending_fulfillment, pending_termination, fulfilled)
}

type AddressAttributeName = "domain-name"
object AddressAttributeName {
  val `domain-name`: "domain-name" = "domain-name"

  @inline def values = js.Array[AddressAttributeName](`domain-name`)
}

type Affinity = "default" | "host"
object Affinity {
  val default: "default" = "default"
  val host: "host" = "host"

  @inline def values = js.Array[Affinity](default, host)
}

type AllocationState = "available" | "under-assessment" | "permanent-failure" | "released" | "released-permanent-failure" | "pending"
object AllocationState {
  val available: "available" = "available"
  val `under-assessment`: "under-assessment" = "under-assessment"
  val `permanent-failure`: "permanent-failure" = "permanent-failure"
  val released: "released" = "released"
  val `released-permanent-failure`: "released-permanent-failure" = "released-permanent-failure"
  val pending: "pending" = "pending"

  @inline def values = js.Array[AllocationState](available, `under-assessment`, `permanent-failure`, released, `released-permanent-failure`, pending)
}

type AllocationStrategy = "lowestPrice" | "diversified" | "capacityOptimized" | "capacityOptimizedPrioritized"
object AllocationStrategy {
  val lowestPrice: "lowestPrice" = "lowestPrice"
  val diversified: "diversified" = "diversified"
  val capacityOptimized: "capacityOptimized" = "capacityOptimized"
  val capacityOptimizedPrioritized: "capacityOptimizedPrioritized" = "capacityOptimizedPrioritized"

  @inline def values = js.Array[AllocationStrategy](lowestPrice, diversified, capacityOptimized, capacityOptimizedPrioritized)
}

type AllowsMultipleInstanceTypes = "on" | "off"
object AllowsMultipleInstanceTypes {
  val on: "on" = "on"
  val off: "off" = "off"

  @inline def values = js.Array[AllowsMultipleInstanceTypes](on, off)
}

type AnalysisStatus = "running" | "succeeded" | "failed"
object AnalysisStatus {
  val running: "running" = "running"
  val succeeded: "succeeded" = "succeeded"
  val failed: "failed" = "failed"

  @inline def values = js.Array[AnalysisStatus](running, succeeded, failed)
}

type ApplianceModeSupportValue = "enable" | "disable"
object ApplianceModeSupportValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[ApplianceModeSupportValue](enable, disable)
}

type ArchitectureType = "i386" | "x86_64" | "arm64"
object ArchitectureType {
  val i386: "i386" = "i386"
  val x86_64: "x86_64" = "x86_64"
  val arm64: "arm64" = "arm64"

  @inline def values = js.Array[ArchitectureType](i386, x86_64, arm64)
}

type ArchitectureValues = "i386" | "x86_64" | "arm64"
object ArchitectureValues {
  val i386: "i386" = "i386"
  val x86_64: "x86_64" = "x86_64"
  val arm64: "arm64" = "arm64"

  @inline def values = js.Array[ArchitectureValues](i386, x86_64, arm64)
}

type AssociatedNetworkType = "vpc"
object AssociatedNetworkType {
  val vpc: "vpc" = "vpc"

  @inline def values = js.Array[AssociatedNetworkType](vpc)
}

type AssociationStatusCode = "associating" | "associated" | "association-failed" | "disassociating" | "disassociated"
object AssociationStatusCode {
  val associating: "associating" = "associating"
  val associated: "associated" = "associated"
  val `association-failed`: "association-failed" = "association-failed"
  val disassociating: "disassociating" = "disassociating"
  val disassociated: "disassociated" = "disassociated"

  @inline def values = js.Array[AssociationStatusCode](associating, associated, `association-failed`, disassociating, disassociated)
}

type AttachmentStatus = "attaching" | "attached" | "detaching" | "detached"
object AttachmentStatus {
  val attaching: "attaching" = "attaching"
  val attached: "attached" = "attached"
  val detaching: "detaching" = "detaching"
  val detached: "detached" = "detached"

  @inline def values = js.Array[AttachmentStatus](attaching, attached, detaching, detached)
}

type AutoAcceptSharedAssociationsValue = "enable" | "disable"
object AutoAcceptSharedAssociationsValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[AutoAcceptSharedAssociationsValue](enable, disable)
}

type AutoAcceptSharedAttachmentsValue = "enable" | "disable"
object AutoAcceptSharedAttachmentsValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[AutoAcceptSharedAttachmentsValue](enable, disable)
}

type AutoPlacement = "on" | "off"
object AutoPlacement {
  val on: "on" = "on"
  val off: "off" = "off"

  @inline def values = js.Array[AutoPlacement](on, off)
}

type AvailabilityZoneOptInStatus = "opt-in-not-required" | "opted-in" | "not-opted-in"
object AvailabilityZoneOptInStatus {
  val `opt-in-not-required`: "opt-in-not-required" = "opt-in-not-required"
  val `opted-in`: "opted-in" = "opted-in"
  val `not-opted-in`: "not-opted-in" = "not-opted-in"

  @inline def values = js.Array[AvailabilityZoneOptInStatus](`opt-in-not-required`, `opted-in`, `not-opted-in`)
}

type AvailabilityZoneState = "available" | "information" | "impaired" | "unavailable"
object AvailabilityZoneState {
  val available: "available" = "available"
  val information: "information" = "information"
  val impaired: "impaired" = "impaired"
  val unavailable: "unavailable" = "unavailable"

  @inline def values = js.Array[AvailabilityZoneState](available, information, impaired, unavailable)
}

type BatchState = "submitted" | "active" | "cancelled" | "failed" | "cancelled_running" | "cancelled_terminating" | "modifying"
object BatchState {
  val submitted: "submitted" = "submitted"
  val active: "active" = "active"
  val cancelled: "cancelled" = "cancelled"
  val failed: "failed" = "failed"
  val cancelled_running: "cancelled_running" = "cancelled_running"
  val cancelled_terminating: "cancelled_terminating" = "cancelled_terminating"
  val modifying: "modifying" = "modifying"

  @inline def values = js.Array[BatchState](submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying)
}

type BgpStatus = "up" | "down"
object BgpStatus {
  val up: "up" = "up"
  val down: "down" = "down"

  @inline def values = js.Array[BgpStatus](up, down)
}

type BootModeType = "legacy-bios" | "uefi"
object BootModeType {
  val `legacy-bios`: "legacy-bios" = "legacy-bios"
  val uefi: "uefi" = "uefi"

  @inline def values = js.Array[BootModeType](`legacy-bios`, uefi)
}

type BootModeValues = "legacy-bios" | "uefi"
object BootModeValues {
  val `legacy-bios`: "legacy-bios" = "legacy-bios"
  val uefi: "uefi" = "uefi"

  @inline def values = js.Array[BootModeValues](`legacy-bios`, uefi)
}

type BundleTaskState = "pending" | "waiting-for-shutdown" | "bundling" | "storing" | "cancelling" | "complete" | "failed"
object BundleTaskState {
  val pending: "pending" = "pending"
  val `waiting-for-shutdown`: "waiting-for-shutdown" = "waiting-for-shutdown"
  val bundling: "bundling" = "bundling"
  val storing: "storing" = "storing"
  val cancelling: "cancelling" = "cancelling"
  val complete: "complete" = "complete"
  val failed: "failed" = "failed"

  @inline def values = js.Array[BundleTaskState](pending, `waiting-for-shutdown`, bundling, storing, cancelling, complete, failed)
}

type ByoipCidrState = "advertised" | "deprovisioned" | "failed-deprovision" | "failed-provision" | "pending-deprovision" | "pending-provision" | "provisioned" | "provisioned-not-publicly-advertisable"
object ByoipCidrState {
  val advertised: "advertised" = "advertised"
  val deprovisioned: "deprovisioned" = "deprovisioned"
  val `failed-deprovision`: "failed-deprovision" = "failed-deprovision"
  val `failed-provision`: "failed-provision" = "failed-provision"
  val `pending-deprovision`: "pending-deprovision" = "pending-deprovision"
  val `pending-provision`: "pending-provision" = "pending-provision"
  val provisioned: "provisioned" = "provisioned"
  val `provisioned-not-publicly-advertisable`: "provisioned-not-publicly-advertisable" = "provisioned-not-publicly-advertisable"

  @inline def values = js.Array[ByoipCidrState](
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

type CancelBatchErrorCode = "fleetRequestIdDoesNotExist" | "fleetRequestIdMalformed" | "fleetRequestNotInCancellableState" | "unexpectedError"
object CancelBatchErrorCode {
  val fleetRequestIdDoesNotExist: "fleetRequestIdDoesNotExist" = "fleetRequestIdDoesNotExist"
  val fleetRequestIdMalformed: "fleetRequestIdMalformed" = "fleetRequestIdMalformed"
  val fleetRequestNotInCancellableState: "fleetRequestNotInCancellableState" = "fleetRequestNotInCancellableState"
  val unexpectedError: "unexpectedError" = "unexpectedError"

  @inline def values = js.Array[CancelBatchErrorCode](fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError)
}

type CancelSpotInstanceRequestState = "active" | "open" | "closed" | "cancelled" | "completed"
object CancelSpotInstanceRequestState {
  val active: "active" = "active"
  val open: "open" = "open"
  val closed: "closed" = "closed"
  val cancelled: "cancelled" = "cancelled"
  val completed: "completed" = "completed"

  @inline def values = js.Array[CancelSpotInstanceRequestState](active, open, closed, cancelled, completed)
}

type CapacityReservationInstancePlatform = "Linux/UNIX" | "Red Hat Enterprise Linux" | "SUSE Linux" | "Windows" | "Windows with SQL Server" | "Windows with SQL Server Enterprise" | "Windows with SQL Server Standard" | "Windows with SQL Server Web" | "Linux with SQL Server Standard" | "Linux with SQL Server Web" | "Linux with SQL Server Enterprise"
object CapacityReservationInstancePlatform {
  val `Linux/UNIX`: "Linux/UNIX" = "Linux/UNIX"
  val `Red Hat Enterprise Linux`: "Red Hat Enterprise Linux" = "Red Hat Enterprise Linux"
  val `SUSE Linux`: "SUSE Linux" = "SUSE Linux"
  val Windows: "Windows" = "Windows"
  val `Windows with SQL Server`: "Windows with SQL Server" = "Windows with SQL Server"
  val `Windows with SQL Server Enterprise`: "Windows with SQL Server Enterprise" = "Windows with SQL Server Enterprise"
  val `Windows with SQL Server Standard`: "Windows with SQL Server Standard" = "Windows with SQL Server Standard"
  val `Windows with SQL Server Web`: "Windows with SQL Server Web" = "Windows with SQL Server Web"
  val `Linux with SQL Server Standard`: "Linux with SQL Server Standard" = "Linux with SQL Server Standard"
  val `Linux with SQL Server Web`: "Linux with SQL Server Web" = "Linux with SQL Server Web"
  val `Linux with SQL Server Enterprise`: "Linux with SQL Server Enterprise" = "Linux with SQL Server Enterprise"

  @inline def values = js.Array[CapacityReservationInstancePlatform](
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
    `Linux with SQL Server Enterprise`
  )
}

type CapacityReservationPreference = "open" | "none"
object CapacityReservationPreference {
  val open: "open" = "open"
  val none: "none" = "none"

  @inline def values = js.Array[CapacityReservationPreference](open, none)
}

type CapacityReservationState = "active" | "expired" | "cancelled" | "pending" | "failed"
object CapacityReservationState {
  val active: "active" = "active"
  val expired: "expired" = "expired"
  val cancelled: "cancelled" = "cancelled"
  val pending: "pending" = "pending"
  val failed: "failed" = "failed"

  @inline def values = js.Array[CapacityReservationState](active, expired, cancelled, pending, failed)
}

type CapacityReservationTenancy = "default" | "dedicated"
object CapacityReservationTenancy {
  val default: "default" = "default"
  val dedicated: "dedicated" = "dedicated"

  @inline def values = js.Array[CapacityReservationTenancy](default, dedicated)
}

type CarrierGatewayState = "pending" | "available" | "deleting" | "deleted"
object CarrierGatewayState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[CarrierGatewayState](pending, available, deleting, deleted)
}

type ClientCertificateRevocationListStatusCode = "pending" | "active"
object ClientCertificateRevocationListStatusCode {
  val pending: "pending" = "pending"
  val active: "active" = "active"

  @inline def values = js.Array[ClientCertificateRevocationListStatusCode](pending, active)
}

type ClientVpnAuthenticationType = "certificate-authentication" | "directory-service-authentication" | "federated-authentication"
object ClientVpnAuthenticationType {
  val `certificate-authentication`: "certificate-authentication" = "certificate-authentication"
  val `directory-service-authentication`: "directory-service-authentication" = "directory-service-authentication"
  val `federated-authentication`: "federated-authentication" = "federated-authentication"

  @inline def values = js.Array[ClientVpnAuthenticationType](`certificate-authentication`, `directory-service-authentication`, `federated-authentication`)
}

type ClientVpnAuthorizationRuleStatusCode = "authorizing" | "active" | "failed" | "revoking"
object ClientVpnAuthorizationRuleStatusCode {
  val authorizing: "authorizing" = "authorizing"
  val active: "active" = "active"
  val failed: "failed" = "failed"
  val revoking: "revoking" = "revoking"

  @inline def values = js.Array[ClientVpnAuthorizationRuleStatusCode](authorizing, active, failed, revoking)
}

type ClientVpnConnectionStatusCode = "active" | "failed-to-terminate" | "terminating" | "terminated"
object ClientVpnConnectionStatusCode {
  val active: "active" = "active"
  val `failed-to-terminate`: "failed-to-terminate" = "failed-to-terminate"
  val terminating: "terminating" = "terminating"
  val terminated: "terminated" = "terminated"

  @inline def values = js.Array[ClientVpnConnectionStatusCode](active, `failed-to-terminate`, terminating, terminated)
}

type ClientVpnEndpointAttributeStatusCode = "applying" | "applied"
object ClientVpnEndpointAttributeStatusCode {
  val applying: "applying" = "applying"
  val applied: "applied" = "applied"

  @inline def values = js.Array[ClientVpnEndpointAttributeStatusCode](applying, applied)
}

type ClientVpnEndpointStatusCode = "pending-associate" | "available" | "deleting" | "deleted"
object ClientVpnEndpointStatusCode {
  val `pending-associate`: "pending-associate" = "pending-associate"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[ClientVpnEndpointStatusCode](`pending-associate`, available, deleting, deleted)
}

type ClientVpnRouteStatusCode = "creating" | "active" | "failed" | "deleting"
object ClientVpnRouteStatusCode {
  val creating: "creating" = "creating"
  val active: "active" = "active"
  val failed: "failed" = "failed"
  val deleting: "deleting" = "deleting"

  @inline def values = js.Array[ClientVpnRouteStatusCode](creating, active, failed, deleting)
}

type ConnectionNotificationState = "Enabled" | "Disabled"
object ConnectionNotificationState {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[ConnectionNotificationState](Enabled, Disabled)
}

type ConnectionNotificationType = "Topic"
object ConnectionNotificationType {
  val Topic: "Topic" = "Topic"

  @inline def values = js.Array[ConnectionNotificationType](Topic)
}

type ContainerFormat = "ova"
object ContainerFormat {
  val ova: "ova" = "ova"

  @inline def values = js.Array[ContainerFormat](ova)
}

type ConversionTaskState = "active" | "cancelling" | "cancelled" | "completed"
object ConversionTaskState {
  val active: "active" = "active"
  val cancelling: "cancelling" = "cancelling"
  val cancelled: "cancelled" = "cancelled"
  val completed: "completed" = "completed"

  @inline def values = js.Array[ConversionTaskState](active, cancelling, cancelled, completed)
}

type CopyTagsFromSource = "volume"
object CopyTagsFromSource {
  val volume: "volume" = "volume"

  @inline def values = js.Array[CopyTagsFromSource](volume)
}

type CurrencyCodeValues = "USD"
object CurrencyCodeValues {
  val USD: "USD" = "USD"

  @inline def values = js.Array[CurrencyCodeValues](USD)
}

type DatafeedSubscriptionState = "Active" | "Inactive"
object DatafeedSubscriptionState {
  val Active: "Active" = "Active"
  val Inactive: "Inactive" = "Inactive"

  @inline def values = js.Array[DatafeedSubscriptionState](Active, Inactive)
}

type DefaultRouteTableAssociationValue = "enable" | "disable"
object DefaultRouteTableAssociationValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[DefaultRouteTableAssociationValue](enable, disable)
}

type DefaultRouteTablePropagationValue = "enable" | "disable"
object DefaultRouteTablePropagationValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[DefaultRouteTablePropagationValue](enable, disable)
}

type DefaultTargetCapacityType = "spot" | "on-demand"
object DefaultTargetCapacityType {
  val spot: "spot" = "spot"
  val `on-demand`: "on-demand" = "on-demand"

  @inline def values = js.Array[DefaultTargetCapacityType](spot, `on-demand`)
}

type DeleteFleetErrorCode = "fleetIdDoesNotExist" | "fleetIdMalformed" | "fleetNotInDeletableState" | "unexpectedError"
object DeleteFleetErrorCode {
  val fleetIdDoesNotExist: "fleetIdDoesNotExist" = "fleetIdDoesNotExist"
  val fleetIdMalformed: "fleetIdMalformed" = "fleetIdMalformed"
  val fleetNotInDeletableState: "fleetNotInDeletableState" = "fleetNotInDeletableState"
  val unexpectedError: "unexpectedError" = "unexpectedError"

  @inline def values = js.Array[DeleteFleetErrorCode](fleetIdDoesNotExist, fleetIdMalformed, fleetNotInDeletableState, unexpectedError)
}

type DeleteQueuedReservedInstancesErrorCode = "reserved-instances-id-invalid" | "reserved-instances-not-in-queued-state" | "unexpected-error"
object DeleteQueuedReservedInstancesErrorCode {
  val `reserved-instances-id-invalid`: "reserved-instances-id-invalid" = "reserved-instances-id-invalid"
  val `reserved-instances-not-in-queued-state`: "reserved-instances-not-in-queued-state" = "reserved-instances-not-in-queued-state"
  val `unexpected-error`: "unexpected-error" = "unexpected-error"

  @inline def values = js.Array[DeleteQueuedReservedInstancesErrorCode](`reserved-instances-id-invalid`, `reserved-instances-not-in-queued-state`, `unexpected-error`)
}

type DeviceType = "ebs" | "instance-store"
object DeviceType {
  val ebs: "ebs" = "ebs"
  val `instance-store`: "instance-store" = "instance-store"

  @inline def values = js.Array[DeviceType](ebs, `instance-store`)
}

type DiskImageFormat = "VMDK" | "RAW" | "VHD"
object DiskImageFormat {
  val VMDK: "VMDK" = "VMDK"
  val RAW: "RAW" = "RAW"
  val VHD: "VHD" = "VHD"

  @inline def values = js.Array[DiskImageFormat](VMDK, RAW, VHD)
}

type DiskType = "hdd" | "ssd"
object DiskType {
  val hdd: "hdd" = "hdd"
  val ssd: "ssd" = "ssd"

  @inline def values = js.Array[DiskType](hdd, ssd)
}

type DnsNameState = "pendingVerification" | "verified" | "failed"
object DnsNameState {
  val pendingVerification: "pendingVerification" = "pendingVerification"
  val verified: "verified" = "verified"
  val failed: "failed" = "failed"

  @inline def values = js.Array[DnsNameState](pendingVerification, verified, failed)
}

type DnsSupportValue = "enable" | "disable"
object DnsSupportValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[DnsSupportValue](enable, disable)
}

type DomainType = "vpc" | "standard"
object DomainType {
  val vpc: "vpc" = "vpc"
  val standard: "standard" = "standard"

  @inline def values = js.Array[DomainType](vpc, standard)
}

type EbsEncryptionSupport = "unsupported" | "supported"
object EbsEncryptionSupport {
  val unsupported: "unsupported" = "unsupported"
  val supported: "supported" = "supported"

  @inline def values = js.Array[EbsEncryptionSupport](unsupported, supported)
}

type EbsNvmeSupport = "unsupported" | "supported" | "required"
object EbsNvmeSupport {
  val unsupported: "unsupported" = "unsupported"
  val supported: "supported" = "supported"
  val required: "required" = "required"

  @inline def values = js.Array[EbsNvmeSupport](unsupported, supported, required)
}

type EbsOptimizedSupport = "unsupported" | "supported" | "default"
object EbsOptimizedSupport {
  val unsupported: "unsupported" = "unsupported"
  val supported: "supported" = "supported"
  val default: "default" = "default"

  @inline def values = js.Array[EbsOptimizedSupport](unsupported, supported, default)
}

type ElasticGpuState = "ATTACHED"
object ElasticGpuState {
  val ATTACHED: "ATTACHED" = "ATTACHED"

  @inline def values = js.Array[ElasticGpuState](ATTACHED)
}

type ElasticGpuStatus = "OK" | "IMPAIRED"
object ElasticGpuStatus {
  val OK: "OK" = "OK"
  val IMPAIRED: "IMPAIRED" = "IMPAIRED"

  @inline def values = js.Array[ElasticGpuStatus](OK, IMPAIRED)
}

type EnaSupport = "unsupported" | "supported" | "required"
object EnaSupport {
  val unsupported: "unsupported" = "unsupported"
  val supported: "supported" = "supported"
  val required: "required" = "required"

  @inline def values = js.Array[EnaSupport](unsupported, supported, required)
}

type EndDateType = "unlimited" | "limited"
object EndDateType {
  val unlimited: "unlimited" = "unlimited"
  val limited: "limited" = "limited"

  @inline def values = js.Array[EndDateType](unlimited, limited)
}

type EphemeralNvmeSupport = "unsupported" | "supported" | "required"
object EphemeralNvmeSupport {
  val unsupported: "unsupported" = "unsupported"
  val supported: "supported" = "supported"
  val required: "required" = "required"

  @inline def values = js.Array[EphemeralNvmeSupport](unsupported, supported, required)
}

type EventCode = "instance-reboot" | "system-reboot" | "system-maintenance" | "instance-retirement" | "instance-stop"
object EventCode {
  val `instance-reboot`: "instance-reboot" = "instance-reboot"
  val `system-reboot`: "system-reboot" = "system-reboot"
  val `system-maintenance`: "system-maintenance" = "system-maintenance"
  val `instance-retirement`: "instance-retirement" = "instance-retirement"
  val `instance-stop`: "instance-stop" = "instance-stop"

  @inline def values = js.Array[EventCode](`instance-reboot`, `system-reboot`, `system-maintenance`, `instance-retirement`, `instance-stop`)
}

type EventType = "instanceChange" | "fleetRequestChange" | "error" | "information"
object EventType {
  val instanceChange: "instanceChange" = "instanceChange"
  val fleetRequestChange: "fleetRequestChange" = "fleetRequestChange"
  val error: "error" = "error"
  val information: "information" = "information"

  @inline def values = js.Array[EventType](instanceChange, fleetRequestChange, error, information)
}

type ExcessCapacityTerminationPolicy = "noTermination" | "default"
object ExcessCapacityTerminationPolicy {
  val noTermination: "noTermination" = "noTermination"
  val default: "default" = "default"

  @inline def values = js.Array[ExcessCapacityTerminationPolicy](noTermination, default)
}

type ExportEnvironment = "citrix" | "vmware" | "microsoft"
object ExportEnvironment {
  val citrix: "citrix" = "citrix"
  val vmware: "vmware" = "vmware"
  val microsoft: "microsoft" = "microsoft"

  @inline def values = js.Array[ExportEnvironment](citrix, vmware, microsoft)
}

type ExportTaskState = "active" | "cancelling" | "cancelled" | "completed"
object ExportTaskState {
  val active: "active" = "active"
  val cancelling: "cancelling" = "cancelling"
  val cancelled: "cancelled" = "cancelled"
  val completed: "completed" = "completed"

  @inline def values = js.Array[ExportTaskState](active, cancelling, cancelled, completed)
}

type FastSnapshotRestoreStateCode = "enabling" | "optimizing" | "enabled" | "disabling" | "disabled"
object FastSnapshotRestoreStateCode {
  val enabling: "enabling" = "enabling"
  val optimizing: "optimizing" = "optimizing"
  val enabled: "enabled" = "enabled"
  val disabling: "disabling" = "disabling"
  val disabled: "disabled" = "disabled"

  @inline def values = js.Array[FastSnapshotRestoreStateCode](enabling, optimizing, enabled, disabling, disabled)
}

type FleetActivityStatus = "error" | "pending_fulfillment" | "pending_termination" | "fulfilled"
object FleetActivityStatus {
  val error: "error" = "error"
  val pending_fulfillment: "pending_fulfillment" = "pending_fulfillment"
  val pending_termination: "pending_termination" = "pending_termination"
  val fulfilled: "fulfilled" = "fulfilled"

  @inline def values = js.Array[FleetActivityStatus](error, pending_fulfillment, pending_termination, fulfilled)
}

type FleetCapacityReservationUsageStrategy = "use-capacity-reservations-first"
object FleetCapacityReservationUsageStrategy {
  val `use-capacity-reservations-first`: "use-capacity-reservations-first" = "use-capacity-reservations-first"

  @inline def values = js.Array[FleetCapacityReservationUsageStrategy](`use-capacity-reservations-first`)
}

type FleetEventType = "instance-change" | "fleet-change" | "service-error"
object FleetEventType {
  val `instance-change`: "instance-change" = "instance-change"
  val `fleet-change`: "fleet-change" = "fleet-change"
  val `service-error`: "service-error" = "service-error"

  @inline def values = js.Array[FleetEventType](`instance-change`, `fleet-change`, `service-error`)
}

type FleetExcessCapacityTerminationPolicy = "no-termination" | "termination"
object FleetExcessCapacityTerminationPolicy {
  val `no-termination`: "no-termination" = "no-termination"
  val termination: "termination" = "termination"

  @inline def values = js.Array[FleetExcessCapacityTerminationPolicy](`no-termination`, termination)
}

type FleetOnDemandAllocationStrategy = "lowest-price" | "prioritized"
object FleetOnDemandAllocationStrategy {
  val `lowest-price`: "lowest-price" = "lowest-price"
  val prioritized: "prioritized" = "prioritized"

  @inline def values = js.Array[FleetOnDemandAllocationStrategy](`lowest-price`, prioritized)
}

type FleetReplacementStrategy = "launch"
object FleetReplacementStrategy {
  val launch: "launch" = "launch"

  @inline def values = js.Array[FleetReplacementStrategy](launch)
}

type FleetStateCode = "submitted" | "active" | "deleted" | "failed" | "deleted_running" | "deleted_terminating" | "modifying"
object FleetStateCode {
  val submitted: "submitted" = "submitted"
  val active: "active" = "active"
  val deleted: "deleted" = "deleted"
  val failed: "failed" = "failed"
  val deleted_running: "deleted_running" = "deleted_running"
  val deleted_terminating: "deleted_terminating" = "deleted_terminating"
  val modifying: "modifying" = "modifying"

  @inline def values = js.Array[FleetStateCode](submitted, active, deleted, failed, deleted_running, deleted_terminating, modifying)
}

type FleetType = "request" | "maintain" | "instant"
object FleetType {
  val request: "request" = "request"
  val maintain: "maintain" = "maintain"
  val instant: "instant" = "instant"

  @inline def values = js.Array[FleetType](request, maintain, instant)
}

type FlowLogsResourceType = "VPC" | "Subnet" | "NetworkInterface"
object FlowLogsResourceType {
  val VPC: "VPC" = "VPC"
  val Subnet: "Subnet" = "Subnet"
  val NetworkInterface: "NetworkInterface" = "NetworkInterface"

  @inline def values = js.Array[FlowLogsResourceType](VPC, Subnet, NetworkInterface)
}

type FpgaImageAttributeName = "description" | "name" | "loadPermission" | "productCodes"
object FpgaImageAttributeName {
  val description: "description" = "description"
  val name: "name" = "name"
  val loadPermission: "loadPermission" = "loadPermission"
  val productCodes: "productCodes" = "productCodes"

  @inline def values = js.Array[FpgaImageAttributeName](description, name, loadPermission, productCodes)
}

type FpgaImageStateCode = "pending" | "failed" | "available" | "unavailable"
object FpgaImageStateCode {
  val pending: "pending" = "pending"
  val failed: "failed" = "failed"
  val available: "available" = "available"
  val unavailable: "unavailable" = "unavailable"

  @inline def values = js.Array[FpgaImageStateCode](pending, failed, available, unavailable)
}

type GatewayType = "ipsec.1"
object GatewayType {
  val `ipsec.1`: "ipsec.1" = "ipsec.1"

  @inline def values = js.Array[GatewayType](`ipsec.1`)
}

type HostRecovery = "on" | "off"
object HostRecovery {
  val on: "on" = "on"
  val off: "off" = "off"

  @inline def values = js.Array[HostRecovery](on, off)
}

type HostTenancy = "dedicated" | "host"
object HostTenancy {
  val dedicated: "dedicated" = "dedicated"
  val host: "host" = "host"

  @inline def values = js.Array[HostTenancy](dedicated, host)
}

type HttpTokensState = "optional" | "required"
object HttpTokensState {
  val optional: "optional" = "optional"
  val required: "required" = "required"

  @inline def values = js.Array[HttpTokensState](optional, required)
}

type HypervisorType = "ovm" | "xen"
object HypervisorType {
  val ovm: "ovm" = "ovm"
  val xen: "xen" = "xen"

  @inline def values = js.Array[HypervisorType](ovm, xen)
}

type IamInstanceProfileAssociationState = "associating" | "associated" | "disassociating" | "disassociated"
object IamInstanceProfileAssociationState {
  val associating: "associating" = "associating"
  val associated: "associated" = "associated"
  val disassociating: "disassociating" = "disassociating"
  val disassociated: "disassociated" = "disassociated"

  @inline def values = js.Array[IamInstanceProfileAssociationState](associating, associated, disassociating, disassociated)
}

type Igmpv2SupportValue = "enable" | "disable"
object Igmpv2SupportValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[Igmpv2SupportValue](enable, disable)
}

type ImageAttributeName = "description" | "kernel" | "ramdisk" | "launchPermission" | "productCodes" | "blockDeviceMapping" | "sriovNetSupport" | "bootMode"
object ImageAttributeName {
  val description: "description" = "description"
  val kernel: "kernel" = "kernel"
  val ramdisk: "ramdisk" = "ramdisk"
  val launchPermission: "launchPermission" = "launchPermission"
  val productCodes: "productCodes" = "productCodes"
  val blockDeviceMapping: "blockDeviceMapping" = "blockDeviceMapping"
  val sriovNetSupport: "sriovNetSupport" = "sriovNetSupport"
  val bootMode: "bootMode" = "bootMode"

  @inline def values = js.Array[ImageAttributeName](description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping, sriovNetSupport, bootMode)
}

type ImageState = "pending" | "available" | "invalid" | "deregistered" | "transient" | "failed" | "error"
object ImageState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val invalid: "invalid" = "invalid"
  val deregistered: "deregistered" = "deregistered"
  val transient: "transient" = "transient"
  val failed: "failed" = "failed"
  val error: "error" = "error"

  @inline def values = js.Array[ImageState](pending, available, invalid, deregistered, transient, failed, error)
}

type ImageTypeValues = "machine" | "kernel" | "ramdisk"
object ImageTypeValues {
  val machine: "machine" = "machine"
  val kernel: "kernel" = "kernel"
  val ramdisk: "ramdisk" = "ramdisk"

  @inline def values = js.Array[ImageTypeValues](machine, kernel, ramdisk)
}

type InstanceAttributeName = "instanceType" | "kernel" | "ramdisk" | "userData" | "disableApiTermination" | "instanceInitiatedShutdownBehavior" | "rootDeviceName" | "blockDeviceMapping" | "productCodes" | "sourceDestCheck" | "groupSet" | "ebsOptimized" | "sriovNetSupport" | "enaSupport" | "enclaveOptions"
object InstanceAttributeName {
  val instanceType: "instanceType" = "instanceType"
  val kernel: "kernel" = "kernel"
  val ramdisk: "ramdisk" = "ramdisk"
  val userData: "userData" = "userData"
  val disableApiTermination: "disableApiTermination" = "disableApiTermination"
  val instanceInitiatedShutdownBehavior: "instanceInitiatedShutdownBehavior" = "instanceInitiatedShutdownBehavior"
  val rootDeviceName: "rootDeviceName" = "rootDeviceName"
  val blockDeviceMapping: "blockDeviceMapping" = "blockDeviceMapping"
  val productCodes: "productCodes" = "productCodes"
  val sourceDestCheck: "sourceDestCheck" = "sourceDestCheck"
  val groupSet: "groupSet" = "groupSet"
  val ebsOptimized: "ebsOptimized" = "ebsOptimized"
  val sriovNetSupport: "sriovNetSupport" = "sriovNetSupport"
  val enaSupport: "enaSupport" = "enaSupport"
  val enclaveOptions: "enclaveOptions" = "enclaveOptions"

  @inline def values = js.Array[InstanceAttributeName](
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
    enclaveOptions
  )
}

type InstanceHealthStatus = "healthy" | "unhealthy"
object InstanceHealthStatus {
  val healthy: "healthy" = "healthy"
  val unhealthy: "unhealthy" = "unhealthy"

  @inline def values = js.Array[InstanceHealthStatus](healthy, unhealthy)
}

type InstanceInterruptionBehavior = "hibernate" | "stop" | "terminate"
object InstanceInterruptionBehavior {
  val hibernate: "hibernate" = "hibernate"
  val stop: "stop" = "stop"
  val terminate: "terminate" = "terminate"

  @inline def values = js.Array[InstanceInterruptionBehavior](hibernate, stop, terminate)
}

type InstanceLifecycle = "spot" | "on-demand"
object InstanceLifecycle {
  val spot: "spot" = "spot"
  val `on-demand`: "on-demand" = "on-demand"

  @inline def values = js.Array[InstanceLifecycle](spot, `on-demand`)
}

type InstanceLifecycleType = "spot" | "scheduled"
object InstanceLifecycleType {
  val spot: "spot" = "spot"
  val scheduled: "scheduled" = "scheduled"

  @inline def values = js.Array[InstanceLifecycleType](spot, scheduled)
}

type InstanceMatchCriteria = "open" | "targeted"
object InstanceMatchCriteria {
  val open: "open" = "open"
  val targeted: "targeted" = "targeted"

  @inline def values = js.Array[InstanceMatchCriteria](open, targeted)
}

type InstanceMetadataEndpointState = "disabled" | "enabled"
object InstanceMetadataEndpointState {
  val disabled: "disabled" = "disabled"
  val enabled: "enabled" = "enabled"

  @inline def values = js.Array[InstanceMetadataEndpointState](disabled, enabled)
}

type InstanceMetadataOptionsState = "pending" | "applied"
object InstanceMetadataOptionsState {
  val pending: "pending" = "pending"
  val applied: "applied" = "applied"

  @inline def values = js.Array[InstanceMetadataOptionsState](pending, applied)
}

type InstanceStateName = "pending" | "running" | "shutting-down" | "terminated" | "stopping" | "stopped"
object InstanceStateName {
  val pending: "pending" = "pending"
  val running: "running" = "running"
  val `shutting-down`: "shutting-down" = "shutting-down"
  val terminated: "terminated" = "terminated"
  val stopping: "stopping" = "stopping"
  val stopped: "stopped" = "stopped"

  @inline def values = js.Array[InstanceStateName](pending, running, `shutting-down`, terminated, stopping, stopped)
}

type InstanceType = "t1.micro" | "t2.nano" | "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "t2.xlarge" | "t2.2xlarge" | "t3.nano" | "t3.micro" | "t3.small" | "t3.medium" | "t3.large" | "t3.xlarge" | "t3.2xlarge" | "t3a.nano" | "t3a.micro" | "t3a.small" | "t3a.medium" | "t3a.large" | "t3a.xlarge" | "t3a.2xlarge" | "t4g.nano" | "t4g.micro" | "t4g.small" | "t4g.medium" | "t4g.large" | "t4g.xlarge" | "t4g.2xlarge" | "m1.small" | "m1.medium" | "m1.large" | "m1.xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m4.16xlarge" | "m2.xlarge" | "m2.2xlarge" | "m2.4xlarge" | "cr1.8xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "r5.metal" | "r5a.large" |
  "r5a.xlarge" | "r5a.2xlarge" | "r5a.4xlarge" | "r5a.8xlarge" | "r5a.12xlarge" | "r5a.16xlarge" | "r5a.24xlarge" | "r5b.large" | "r5b.xlarge" | "r5b.2xlarge" | "r5b.4xlarge" | "r5b.8xlarge" | "r5b.12xlarge" | "r5b.16xlarge" | "r5b.24xlarge" | "r5b.metal" | "r5d.large" | "r5d.xlarge" | "r5d.2xlarge" | "r5d.4xlarge" | "r5d.8xlarge" | "r5d.12xlarge" | "r5d.16xlarge" | "r5d.24xlarge" | "r5d.metal" | "r5ad.large" | "r5ad.xlarge" | "r5ad.2xlarge" | "r5ad.4xlarge" | "r5ad.8xlarge" | "r5ad.12xlarge" | "r5ad.16xlarge" | "r5ad.24xlarge" | "r6g.metal" | "r6g.medium" | "r6g.large" | "r6g.xlarge" | "r6g.2xlarge" | "r6g.4xlarge" | "r6g.8xlarge" | "r6g.12xlarge" | "r6g.16xlarge" | "r6gd.metal" | "r6gd.medium" | "r6gd.large" | "r6gd.xlarge" | "r6gd.2xlarge" | "r6gd.4xlarge" | "r6gd.8xlarge" | "r6gd.12xlarge" | "r6gd.16xlarge" | "x1.16xlarge" | "x1.32xlarge" | "x1e.xlarge" | "x1e.2xlarge" | "x1e.4xlarge" | "x1e.8xlarge" | "x1e.16xlarge" | "x1e.32xlarge" | "i2.xlarge" | "i2.2xlarge" | "i2.4xlarge" |
  "i2.8xlarge" | "i3.large" | "i3.xlarge" | "i3.2xlarge" | "i3.4xlarge" | "i3.8xlarge" | "i3.16xlarge" | "i3.metal" | "i3en.large" | "i3en.xlarge" | "i3en.2xlarge" | "i3en.3xlarge" | "i3en.6xlarge" | "i3en.12xlarge" | "i3en.24xlarge" | "i3en.metal" | "hi1.4xlarge" | "hs1.8xlarge" | "c1.medium" | "c1.xlarge" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "c5.metal" | "c5a.large" | "c5a.xlarge" | "c5a.2xlarge" | "c5a.4xlarge" | "c5a.8xlarge" | "c5a.12xlarge" | "c5a.16xlarge" | "c5a.24xlarge" | "c5ad.large" | "c5ad.xlarge" | "c5ad.2xlarge" | "c5ad.4xlarge" | "c5ad.8xlarge" | "c5ad.12xlarge" | "c5ad.16xlarge" | "c5ad.24xlarge" | "c5d.large" | "c5d.xlarge" | "c5d.2xlarge" | "c5d.4xlarge" | "c5d.9xlarge" | "c5d.12xlarge" | "c5d.18xlarge" | "c5d.24xlarge" | "c5d.metal" |
  "c5n.large" | "c5n.xlarge" | "c5n.2xlarge" | "c5n.4xlarge" | "c5n.9xlarge" | "c5n.18xlarge" | "c5n.metal" | "c6g.metal" | "c6g.medium" | "c6g.large" | "c6g.xlarge" | "c6g.2xlarge" | "c6g.4xlarge" | "c6g.8xlarge" | "c6g.12xlarge" | "c6g.16xlarge" | "c6gd.metal" | "c6gd.medium" | "c6gd.large" | "c6gd.xlarge" | "c6gd.2xlarge" | "c6gd.4xlarge" | "c6gd.8xlarge" | "c6gd.12xlarge" | "c6gd.16xlarge" | "c6gn.medium" | "c6gn.large" | "c6gn.xlarge" | "c6gn.2xlarge" | "c6gn.4xlarge" | "c6gn.8xlarge" | "c6gn.12xlarge" | "c6gn.16xlarge" | "cc1.4xlarge" | "cc2.8xlarge" | "g2.2xlarge" | "g2.8xlarge" | "g3.4xlarge" | "g3.8xlarge" | "g3.16xlarge" | "g3s.xlarge" | "g4ad.4xlarge" | "g4ad.8xlarge" | "g4ad.16xlarge" | "g4dn.xlarge" | "g4dn.2xlarge" | "g4dn.4xlarge" | "g4dn.8xlarge" | "g4dn.12xlarge" | "g4dn.16xlarge" | "g4dn.metal" | "cg1.4xlarge" | "p2.xlarge" | "p2.8xlarge" | "p2.16xlarge" | "p3.2xlarge" | "p3.8xlarge" | "p3.16xlarge" | "p3dn.24xlarge" | "p4d.24xlarge" | "d2.xlarge" | "d2.2xlarge" |
  "d2.4xlarge" | "d2.8xlarge" | "d3.xlarge" | "d3.2xlarge" | "d3.4xlarge" | "d3.8xlarge" | "d3en.xlarge" | "d3en.2xlarge" | "d3en.4xlarge" | "d3en.6xlarge" | "d3en.8xlarge" | "d3en.12xlarge" | "f1.2xlarge" | "f1.4xlarge" | "f1.16xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | "m5.metal" | "m5a.large" | "m5a.xlarge" | "m5a.2xlarge" | "m5a.4xlarge" | "m5a.8xlarge" | "m5a.12xlarge" | "m5a.16xlarge" | "m5a.24xlarge" | "m5d.large" | "m5d.xlarge" | "m5d.2xlarge" | "m5d.4xlarge" | "m5d.8xlarge" | "m5d.12xlarge" | "m5d.16xlarge" | "m5d.24xlarge" | "m5d.metal" | "m5ad.large" | "m5ad.xlarge" | "m5ad.2xlarge" | "m5ad.4xlarge" | "m5ad.8xlarge" | "m5ad.12xlarge" | "m5ad.16xlarge" | "m5ad.24xlarge" | "m5zn.large" | "m5zn.xlarge" | "m5zn.2xlarge" | "m5zn.3xlarge" | "m5zn.6xlarge" | "m5zn.12xlarge" | "m5zn.metal" | "h1.2xlarge" | "h1.4xlarge" | "h1.8xlarge" | "h1.16xlarge" | "z1d.large" | "z1d.xlarge" | "z1d.2xlarge" |
  "z1d.3xlarge" | "z1d.6xlarge" | "z1d.12xlarge" | "z1d.metal" | "u-6tb1.metal" | "u-9tb1.metal" | "u-12tb1.metal" | "u-18tb1.metal" | "u-24tb1.metal" | "a1.medium" | "a1.large" | "a1.xlarge" | "a1.2xlarge" | "a1.4xlarge" | "a1.metal" | "m5dn.large" | "m5dn.xlarge" | "m5dn.2xlarge" | "m5dn.4xlarge" | "m5dn.8xlarge" | "m5dn.12xlarge" | "m5dn.16xlarge" | "m5dn.24xlarge" | "m5n.large" | "m5n.xlarge" | "m5n.2xlarge" | "m5n.4xlarge" | "m5n.8xlarge" | "m5n.12xlarge" | "m5n.16xlarge" | "m5n.24xlarge" | "r5dn.large" | "r5dn.xlarge" | "r5dn.2xlarge" | "r5dn.4xlarge" | "r5dn.8xlarge" | "r5dn.12xlarge" | "r5dn.16xlarge" | "r5dn.24xlarge" | "r5n.large" | "r5n.xlarge" | "r5n.2xlarge" | "r5n.4xlarge" | "r5n.8xlarge" | "r5n.12xlarge" | "r5n.16xlarge" | "r5n.24xlarge" | "inf1.xlarge" | "inf1.2xlarge" | "inf1.6xlarge" | "inf1.24xlarge" | "m6g.metal" | "m6g.medium" | "m6g.large" | "m6g.xlarge" | "m6g.2xlarge" | "m6g.4xlarge" | "m6g.8xlarge" | "m6g.12xlarge" | "m6g.16xlarge" | "m6gd.metal" |
  "m6gd.medium" | "m6gd.large" | "m6gd.xlarge" | "m6gd.2xlarge" | "m6gd.4xlarge" | "m6gd.8xlarge" | "m6gd.12xlarge" | "m6gd.16xlarge" | "mac1.metal" | "x2gd.medium" | "x2gd.large" | "x2gd.xlarge" | "x2gd.2xlarge" | "x2gd.4xlarge" | "x2gd.8xlarge" | "x2gd.12xlarge" | "x2gd.16xlarge" | "x2gd.metal"
object InstanceType {
  val `t1.micro`: "t1.micro" = "t1.micro"
  val `t2.nano`: "t2.nano" = "t2.nano"
  val `t2.micro`: "t2.micro" = "t2.micro"
  val `t2.small`: "t2.small" = "t2.small"
  val `t2.medium`: "t2.medium" = "t2.medium"
  val `t2.large`: "t2.large" = "t2.large"
  val `t2.xlarge`: "t2.xlarge" = "t2.xlarge"
  val `t2.2xlarge`: "t2.2xlarge" = "t2.2xlarge"
  val `t3.nano`: "t3.nano" = "t3.nano"
  val `t3.micro`: "t3.micro" = "t3.micro"
  val `t3.small`: "t3.small" = "t3.small"
  val `t3.medium`: "t3.medium" = "t3.medium"
  val `t3.large`: "t3.large" = "t3.large"
  val `t3.xlarge`: "t3.xlarge" = "t3.xlarge"
  val `t3.2xlarge`: "t3.2xlarge" = "t3.2xlarge"
  val `t3a.nano`: "t3a.nano" = "t3a.nano"
  val `t3a.micro`: "t3a.micro" = "t3a.micro"
  val `t3a.small`: "t3a.small" = "t3a.small"
  val `t3a.medium`: "t3a.medium" = "t3a.medium"
  val `t3a.large`: "t3a.large" = "t3a.large"
  val `t3a.xlarge`: "t3a.xlarge" = "t3a.xlarge"
  val `t3a.2xlarge`: "t3a.2xlarge" = "t3a.2xlarge"
  val `t4g.nano`: "t4g.nano" = "t4g.nano"
  val `t4g.micro`: "t4g.micro" = "t4g.micro"
  val `t4g.small`: "t4g.small" = "t4g.small"
  val `t4g.medium`: "t4g.medium" = "t4g.medium"
  val `t4g.large`: "t4g.large" = "t4g.large"
  val `t4g.xlarge`: "t4g.xlarge" = "t4g.xlarge"
  val `t4g.2xlarge`: "t4g.2xlarge" = "t4g.2xlarge"
  val `m1.small`: "m1.small" = "m1.small"
  val `m1.medium`: "m1.medium" = "m1.medium"
  val `m1.large`: "m1.large" = "m1.large"
  val `m1.xlarge`: "m1.xlarge" = "m1.xlarge"
  val `m3.medium`: "m3.medium" = "m3.medium"
  val `m3.large`: "m3.large" = "m3.large"
  val `m3.xlarge`: "m3.xlarge" = "m3.xlarge"
  val `m3.2xlarge`: "m3.2xlarge" = "m3.2xlarge"
  val `m4.large`: "m4.large" = "m4.large"
  val `m4.xlarge`: "m4.xlarge" = "m4.xlarge"
  val `m4.2xlarge`: "m4.2xlarge" = "m4.2xlarge"
  val `m4.4xlarge`: "m4.4xlarge" = "m4.4xlarge"
  val `m4.10xlarge`: "m4.10xlarge" = "m4.10xlarge"
  val `m4.16xlarge`: "m4.16xlarge" = "m4.16xlarge"
  val `m2.xlarge`: "m2.xlarge" = "m2.xlarge"
  val `m2.2xlarge`: "m2.2xlarge" = "m2.2xlarge"
  val `m2.4xlarge`: "m2.4xlarge" = "m2.4xlarge"
  val `cr1.8xlarge`: "cr1.8xlarge" = "cr1.8xlarge"
  val `r3.large`: "r3.large" = "r3.large"
  val `r3.xlarge`: "r3.xlarge" = "r3.xlarge"
  val `r3.2xlarge`: "r3.2xlarge" = "r3.2xlarge"
  val `r3.4xlarge`: "r3.4xlarge" = "r3.4xlarge"
  val `r3.8xlarge`: "r3.8xlarge" = "r3.8xlarge"
  val `r4.large`: "r4.large" = "r4.large"
  val `r4.xlarge`: "r4.xlarge" = "r4.xlarge"
  val `r4.2xlarge`: "r4.2xlarge" = "r4.2xlarge"
  val `r4.4xlarge`: "r4.4xlarge" = "r4.4xlarge"
  val `r4.8xlarge`: "r4.8xlarge" = "r4.8xlarge"
  val `r4.16xlarge`: "r4.16xlarge" = "r4.16xlarge"
  val `r5.large`: "r5.large" = "r5.large"
  val `r5.xlarge`: "r5.xlarge" = "r5.xlarge"
  val `r5.2xlarge`: "r5.2xlarge" = "r5.2xlarge"
  val `r5.4xlarge`: "r5.4xlarge" = "r5.4xlarge"
  val `r5.8xlarge`: "r5.8xlarge" = "r5.8xlarge"
  val `r5.12xlarge`: "r5.12xlarge" = "r5.12xlarge"
  val `r5.16xlarge`: "r5.16xlarge" = "r5.16xlarge"
  val `r5.24xlarge`: "r5.24xlarge" = "r5.24xlarge"
  val `r5.metal`: "r5.metal" = "r5.metal"
  val `r5a.large`: "r5a.large" = "r5a.large"
  val `r5a.xlarge`: "r5a.xlarge" = "r5a.xlarge"
  val `r5a.2xlarge`: "r5a.2xlarge" = "r5a.2xlarge"
  val `r5a.4xlarge`: "r5a.4xlarge" = "r5a.4xlarge"
  val `r5a.8xlarge`: "r5a.8xlarge" = "r5a.8xlarge"
  val `r5a.12xlarge`: "r5a.12xlarge" = "r5a.12xlarge"
  val `r5a.16xlarge`: "r5a.16xlarge" = "r5a.16xlarge"
  val `r5a.24xlarge`: "r5a.24xlarge" = "r5a.24xlarge"
  val `r5b.large`: "r5b.large" = "r5b.large"
  val `r5b.xlarge`: "r5b.xlarge" = "r5b.xlarge"
  val `r5b.2xlarge`: "r5b.2xlarge" = "r5b.2xlarge"
  val `r5b.4xlarge`: "r5b.4xlarge" = "r5b.4xlarge"
  val `r5b.8xlarge`: "r5b.8xlarge" = "r5b.8xlarge"
  val `r5b.12xlarge`: "r5b.12xlarge" = "r5b.12xlarge"
  val `r5b.16xlarge`: "r5b.16xlarge" = "r5b.16xlarge"
  val `r5b.24xlarge`: "r5b.24xlarge" = "r5b.24xlarge"
  val `r5b.metal`: "r5b.metal" = "r5b.metal"
  val `r5d.large`: "r5d.large" = "r5d.large"
  val `r5d.xlarge`: "r5d.xlarge" = "r5d.xlarge"
  val `r5d.2xlarge`: "r5d.2xlarge" = "r5d.2xlarge"
  val `r5d.4xlarge`: "r5d.4xlarge" = "r5d.4xlarge"
  val `r5d.8xlarge`: "r5d.8xlarge" = "r5d.8xlarge"
  val `r5d.12xlarge`: "r5d.12xlarge" = "r5d.12xlarge"
  val `r5d.16xlarge`: "r5d.16xlarge" = "r5d.16xlarge"
  val `r5d.24xlarge`: "r5d.24xlarge" = "r5d.24xlarge"
  val `r5d.metal`: "r5d.metal" = "r5d.metal"
  val `r5ad.large`: "r5ad.large" = "r5ad.large"
  val `r5ad.xlarge`: "r5ad.xlarge" = "r5ad.xlarge"
  val `r5ad.2xlarge`: "r5ad.2xlarge" = "r5ad.2xlarge"
  val `r5ad.4xlarge`: "r5ad.4xlarge" = "r5ad.4xlarge"
  val `r5ad.8xlarge`: "r5ad.8xlarge" = "r5ad.8xlarge"
  val `r5ad.12xlarge`: "r5ad.12xlarge" = "r5ad.12xlarge"
  val `r5ad.16xlarge`: "r5ad.16xlarge" = "r5ad.16xlarge"
  val `r5ad.24xlarge`: "r5ad.24xlarge" = "r5ad.24xlarge"
  val `r6g.metal`: "r6g.metal" = "r6g.metal"
  val `r6g.medium`: "r6g.medium" = "r6g.medium"
  val `r6g.large`: "r6g.large" = "r6g.large"
  val `r6g.xlarge`: "r6g.xlarge" = "r6g.xlarge"
  val `r6g.2xlarge`: "r6g.2xlarge" = "r6g.2xlarge"
  val `r6g.4xlarge`: "r6g.4xlarge" = "r6g.4xlarge"
  val `r6g.8xlarge`: "r6g.8xlarge" = "r6g.8xlarge"
  val `r6g.12xlarge`: "r6g.12xlarge" = "r6g.12xlarge"
  val `r6g.16xlarge`: "r6g.16xlarge" = "r6g.16xlarge"
  val `r6gd.metal`: "r6gd.metal" = "r6gd.metal"
  val `r6gd.medium`: "r6gd.medium" = "r6gd.medium"
  val `r6gd.large`: "r6gd.large" = "r6gd.large"
  val `r6gd.xlarge`: "r6gd.xlarge" = "r6gd.xlarge"
  val `r6gd.2xlarge`: "r6gd.2xlarge" = "r6gd.2xlarge"
  val `r6gd.4xlarge`: "r6gd.4xlarge" = "r6gd.4xlarge"
  val `r6gd.8xlarge`: "r6gd.8xlarge" = "r6gd.8xlarge"
  val `r6gd.12xlarge`: "r6gd.12xlarge" = "r6gd.12xlarge"
  val `r6gd.16xlarge`: "r6gd.16xlarge" = "r6gd.16xlarge"
  val `x1.16xlarge`: "x1.16xlarge" = "x1.16xlarge"
  val `x1.32xlarge`: "x1.32xlarge" = "x1.32xlarge"
  val `x1e.xlarge`: "x1e.xlarge" = "x1e.xlarge"
  val `x1e.2xlarge`: "x1e.2xlarge" = "x1e.2xlarge"
  val `x1e.4xlarge`: "x1e.4xlarge" = "x1e.4xlarge"
  val `x1e.8xlarge`: "x1e.8xlarge" = "x1e.8xlarge"
  val `x1e.16xlarge`: "x1e.16xlarge" = "x1e.16xlarge"
  val `x1e.32xlarge`: "x1e.32xlarge" = "x1e.32xlarge"
  val `i2.xlarge`: "i2.xlarge" = "i2.xlarge"
  val `i2.2xlarge`: "i2.2xlarge" = "i2.2xlarge"
  val `i2.4xlarge`: "i2.4xlarge" = "i2.4xlarge"
  val `i2.8xlarge`: "i2.8xlarge" = "i2.8xlarge"
  val `i3.large`: "i3.large" = "i3.large"
  val `i3.xlarge`: "i3.xlarge" = "i3.xlarge"
  val `i3.2xlarge`: "i3.2xlarge" = "i3.2xlarge"
  val `i3.4xlarge`: "i3.4xlarge" = "i3.4xlarge"
  val `i3.8xlarge`: "i3.8xlarge" = "i3.8xlarge"
  val `i3.16xlarge`: "i3.16xlarge" = "i3.16xlarge"
  val `i3.metal`: "i3.metal" = "i3.metal"
  val `i3en.large`: "i3en.large" = "i3en.large"
  val `i3en.xlarge`: "i3en.xlarge" = "i3en.xlarge"
  val `i3en.2xlarge`: "i3en.2xlarge" = "i3en.2xlarge"
  val `i3en.3xlarge`: "i3en.3xlarge" = "i3en.3xlarge"
  val `i3en.6xlarge`: "i3en.6xlarge" = "i3en.6xlarge"
  val `i3en.12xlarge`: "i3en.12xlarge" = "i3en.12xlarge"
  val `i3en.24xlarge`: "i3en.24xlarge" = "i3en.24xlarge"
  val `i3en.metal`: "i3en.metal" = "i3en.metal"
  val `hi1.4xlarge`: "hi1.4xlarge" = "hi1.4xlarge"
  val `hs1.8xlarge`: "hs1.8xlarge" = "hs1.8xlarge"
  val `c1.medium`: "c1.medium" = "c1.medium"
  val `c1.xlarge`: "c1.xlarge" = "c1.xlarge"
  val `c3.large`: "c3.large" = "c3.large"
  val `c3.xlarge`: "c3.xlarge" = "c3.xlarge"
  val `c3.2xlarge`: "c3.2xlarge" = "c3.2xlarge"
  val `c3.4xlarge`: "c3.4xlarge" = "c3.4xlarge"
  val `c3.8xlarge`: "c3.8xlarge" = "c3.8xlarge"
  val `c4.large`: "c4.large" = "c4.large"
  val `c4.xlarge`: "c4.xlarge" = "c4.xlarge"
  val `c4.2xlarge`: "c4.2xlarge" = "c4.2xlarge"
  val `c4.4xlarge`: "c4.4xlarge" = "c4.4xlarge"
  val `c4.8xlarge`: "c4.8xlarge" = "c4.8xlarge"
  val `c5.large`: "c5.large" = "c5.large"
  val `c5.xlarge`: "c5.xlarge" = "c5.xlarge"
  val `c5.2xlarge`: "c5.2xlarge" = "c5.2xlarge"
  val `c5.4xlarge`: "c5.4xlarge" = "c5.4xlarge"
  val `c5.9xlarge`: "c5.9xlarge" = "c5.9xlarge"
  val `c5.12xlarge`: "c5.12xlarge" = "c5.12xlarge"
  val `c5.18xlarge`: "c5.18xlarge" = "c5.18xlarge"
  val `c5.24xlarge`: "c5.24xlarge" = "c5.24xlarge"
  val `c5.metal`: "c5.metal" = "c5.metal"
  val `c5a.large`: "c5a.large" = "c5a.large"
  val `c5a.xlarge`: "c5a.xlarge" = "c5a.xlarge"
  val `c5a.2xlarge`: "c5a.2xlarge" = "c5a.2xlarge"
  val `c5a.4xlarge`: "c5a.4xlarge" = "c5a.4xlarge"
  val `c5a.8xlarge`: "c5a.8xlarge" = "c5a.8xlarge"
  val `c5a.12xlarge`: "c5a.12xlarge" = "c5a.12xlarge"
  val `c5a.16xlarge`: "c5a.16xlarge" = "c5a.16xlarge"
  val `c5a.24xlarge`: "c5a.24xlarge" = "c5a.24xlarge"
  val `c5ad.large`: "c5ad.large" = "c5ad.large"
  val `c5ad.xlarge`: "c5ad.xlarge" = "c5ad.xlarge"
  val `c5ad.2xlarge`: "c5ad.2xlarge" = "c5ad.2xlarge"
  val `c5ad.4xlarge`: "c5ad.4xlarge" = "c5ad.4xlarge"
  val `c5ad.8xlarge`: "c5ad.8xlarge" = "c5ad.8xlarge"
  val `c5ad.12xlarge`: "c5ad.12xlarge" = "c5ad.12xlarge"
  val `c5ad.16xlarge`: "c5ad.16xlarge" = "c5ad.16xlarge"
  val `c5ad.24xlarge`: "c5ad.24xlarge" = "c5ad.24xlarge"
  val `c5d.large`: "c5d.large" = "c5d.large"
  val `c5d.xlarge`: "c5d.xlarge" = "c5d.xlarge"
  val `c5d.2xlarge`: "c5d.2xlarge" = "c5d.2xlarge"
  val `c5d.4xlarge`: "c5d.4xlarge" = "c5d.4xlarge"
  val `c5d.9xlarge`: "c5d.9xlarge" = "c5d.9xlarge"
  val `c5d.12xlarge`: "c5d.12xlarge" = "c5d.12xlarge"
  val `c5d.18xlarge`: "c5d.18xlarge" = "c5d.18xlarge"
  val `c5d.24xlarge`: "c5d.24xlarge" = "c5d.24xlarge"
  val `c5d.metal`: "c5d.metal" = "c5d.metal"
  val `c5n.large`: "c5n.large" = "c5n.large"
  val `c5n.xlarge`: "c5n.xlarge" = "c5n.xlarge"
  val `c5n.2xlarge`: "c5n.2xlarge" = "c5n.2xlarge"
  val `c5n.4xlarge`: "c5n.4xlarge" = "c5n.4xlarge"
  val `c5n.9xlarge`: "c5n.9xlarge" = "c5n.9xlarge"
  val `c5n.18xlarge`: "c5n.18xlarge" = "c5n.18xlarge"
  val `c5n.metal`: "c5n.metal" = "c5n.metal"
  val `c6g.metal`: "c6g.metal" = "c6g.metal"
  val `c6g.medium`: "c6g.medium" = "c6g.medium"
  val `c6g.large`: "c6g.large" = "c6g.large"
  val `c6g.xlarge`: "c6g.xlarge" = "c6g.xlarge"
  val `c6g.2xlarge`: "c6g.2xlarge" = "c6g.2xlarge"
  val `c6g.4xlarge`: "c6g.4xlarge" = "c6g.4xlarge"
  val `c6g.8xlarge`: "c6g.8xlarge" = "c6g.8xlarge"
  val `c6g.12xlarge`: "c6g.12xlarge" = "c6g.12xlarge"
  val `c6g.16xlarge`: "c6g.16xlarge" = "c6g.16xlarge"
  val `c6gd.metal`: "c6gd.metal" = "c6gd.metal"
  val `c6gd.medium`: "c6gd.medium" = "c6gd.medium"
  val `c6gd.large`: "c6gd.large" = "c6gd.large"
  val `c6gd.xlarge`: "c6gd.xlarge" = "c6gd.xlarge"
  val `c6gd.2xlarge`: "c6gd.2xlarge" = "c6gd.2xlarge"
  val `c6gd.4xlarge`: "c6gd.4xlarge" = "c6gd.4xlarge"
  val `c6gd.8xlarge`: "c6gd.8xlarge" = "c6gd.8xlarge"
  val `c6gd.12xlarge`: "c6gd.12xlarge" = "c6gd.12xlarge"
  val `c6gd.16xlarge`: "c6gd.16xlarge" = "c6gd.16xlarge"
  val `c6gn.medium`: "c6gn.medium" = "c6gn.medium"
  val `c6gn.large`: "c6gn.large" = "c6gn.large"
  val `c6gn.xlarge`: "c6gn.xlarge" = "c6gn.xlarge"
  val `c6gn.2xlarge`: "c6gn.2xlarge" = "c6gn.2xlarge"
  val `c6gn.4xlarge`: "c6gn.4xlarge" = "c6gn.4xlarge"
  val `c6gn.8xlarge`: "c6gn.8xlarge" = "c6gn.8xlarge"
  val `c6gn.12xlarge`: "c6gn.12xlarge" = "c6gn.12xlarge"
  val `c6gn.16xlarge`: "c6gn.16xlarge" = "c6gn.16xlarge"
  val `cc1.4xlarge`: "cc1.4xlarge" = "cc1.4xlarge"
  val `cc2.8xlarge`: "cc2.8xlarge" = "cc2.8xlarge"
  val `g2.2xlarge`: "g2.2xlarge" = "g2.2xlarge"
  val `g2.8xlarge`: "g2.8xlarge" = "g2.8xlarge"
  val `g3.4xlarge`: "g3.4xlarge" = "g3.4xlarge"
  val `g3.8xlarge`: "g3.8xlarge" = "g3.8xlarge"
  val `g3.16xlarge`: "g3.16xlarge" = "g3.16xlarge"
  val `g3s.xlarge`: "g3s.xlarge" = "g3s.xlarge"
  val `g4ad.4xlarge`: "g4ad.4xlarge" = "g4ad.4xlarge"
  val `g4ad.8xlarge`: "g4ad.8xlarge" = "g4ad.8xlarge"
  val `g4ad.16xlarge`: "g4ad.16xlarge" = "g4ad.16xlarge"
  val `g4dn.xlarge`: "g4dn.xlarge" = "g4dn.xlarge"
  val `g4dn.2xlarge`: "g4dn.2xlarge" = "g4dn.2xlarge"
  val `g4dn.4xlarge`: "g4dn.4xlarge" = "g4dn.4xlarge"
  val `g4dn.8xlarge`: "g4dn.8xlarge" = "g4dn.8xlarge"
  val `g4dn.12xlarge`: "g4dn.12xlarge" = "g4dn.12xlarge"
  val `g4dn.16xlarge`: "g4dn.16xlarge" = "g4dn.16xlarge"
  val `g4dn.metal`: "g4dn.metal" = "g4dn.metal"
  val `cg1.4xlarge`: "cg1.4xlarge" = "cg1.4xlarge"
  val `p2.xlarge`: "p2.xlarge" = "p2.xlarge"
  val `p2.8xlarge`: "p2.8xlarge" = "p2.8xlarge"
  val `p2.16xlarge`: "p2.16xlarge" = "p2.16xlarge"
  val `p3.2xlarge`: "p3.2xlarge" = "p3.2xlarge"
  val `p3.8xlarge`: "p3.8xlarge" = "p3.8xlarge"
  val `p3.16xlarge`: "p3.16xlarge" = "p3.16xlarge"
  val `p3dn.24xlarge`: "p3dn.24xlarge" = "p3dn.24xlarge"
  val `p4d.24xlarge`: "p4d.24xlarge" = "p4d.24xlarge"
  val `d2.xlarge`: "d2.xlarge" = "d2.xlarge"
  val `d2.2xlarge`: "d2.2xlarge" = "d2.2xlarge"
  val `d2.4xlarge`: "d2.4xlarge" = "d2.4xlarge"
  val `d2.8xlarge`: "d2.8xlarge" = "d2.8xlarge"
  val `d3.xlarge`: "d3.xlarge" = "d3.xlarge"
  val `d3.2xlarge`: "d3.2xlarge" = "d3.2xlarge"
  val `d3.4xlarge`: "d3.4xlarge" = "d3.4xlarge"
  val `d3.8xlarge`: "d3.8xlarge" = "d3.8xlarge"
  val `d3en.xlarge`: "d3en.xlarge" = "d3en.xlarge"
  val `d3en.2xlarge`: "d3en.2xlarge" = "d3en.2xlarge"
  val `d3en.4xlarge`: "d3en.4xlarge" = "d3en.4xlarge"
  val `d3en.6xlarge`: "d3en.6xlarge" = "d3en.6xlarge"
  val `d3en.8xlarge`: "d3en.8xlarge" = "d3en.8xlarge"
  val `d3en.12xlarge`: "d3en.12xlarge" = "d3en.12xlarge"
  val `f1.2xlarge`: "f1.2xlarge" = "f1.2xlarge"
  val `f1.4xlarge`: "f1.4xlarge" = "f1.4xlarge"
  val `f1.16xlarge`: "f1.16xlarge" = "f1.16xlarge"
  val `m5.large`: "m5.large" = "m5.large"
  val `m5.xlarge`: "m5.xlarge" = "m5.xlarge"
  val `m5.2xlarge`: "m5.2xlarge" = "m5.2xlarge"
  val `m5.4xlarge`: "m5.4xlarge" = "m5.4xlarge"
  val `m5.8xlarge`: "m5.8xlarge" = "m5.8xlarge"
  val `m5.12xlarge`: "m5.12xlarge" = "m5.12xlarge"
  val `m5.16xlarge`: "m5.16xlarge" = "m5.16xlarge"
  val `m5.24xlarge`: "m5.24xlarge" = "m5.24xlarge"
  val `m5.metal`: "m5.metal" = "m5.metal"
  val `m5a.large`: "m5a.large" = "m5a.large"
  val `m5a.xlarge`: "m5a.xlarge" = "m5a.xlarge"
  val `m5a.2xlarge`: "m5a.2xlarge" = "m5a.2xlarge"
  val `m5a.4xlarge`: "m5a.4xlarge" = "m5a.4xlarge"
  val `m5a.8xlarge`: "m5a.8xlarge" = "m5a.8xlarge"
  val `m5a.12xlarge`: "m5a.12xlarge" = "m5a.12xlarge"
  val `m5a.16xlarge`: "m5a.16xlarge" = "m5a.16xlarge"
  val `m5a.24xlarge`: "m5a.24xlarge" = "m5a.24xlarge"
  val `m5d.large`: "m5d.large" = "m5d.large"
  val `m5d.xlarge`: "m5d.xlarge" = "m5d.xlarge"
  val `m5d.2xlarge`: "m5d.2xlarge" = "m5d.2xlarge"
  val `m5d.4xlarge`: "m5d.4xlarge" = "m5d.4xlarge"
  val `m5d.8xlarge`: "m5d.8xlarge" = "m5d.8xlarge"
  val `m5d.12xlarge`: "m5d.12xlarge" = "m5d.12xlarge"
  val `m5d.16xlarge`: "m5d.16xlarge" = "m5d.16xlarge"
  val `m5d.24xlarge`: "m5d.24xlarge" = "m5d.24xlarge"
  val `m5d.metal`: "m5d.metal" = "m5d.metal"
  val `m5ad.large`: "m5ad.large" = "m5ad.large"
  val `m5ad.xlarge`: "m5ad.xlarge" = "m5ad.xlarge"
  val `m5ad.2xlarge`: "m5ad.2xlarge" = "m5ad.2xlarge"
  val `m5ad.4xlarge`: "m5ad.4xlarge" = "m5ad.4xlarge"
  val `m5ad.8xlarge`: "m5ad.8xlarge" = "m5ad.8xlarge"
  val `m5ad.12xlarge`: "m5ad.12xlarge" = "m5ad.12xlarge"
  val `m5ad.16xlarge`: "m5ad.16xlarge" = "m5ad.16xlarge"
  val `m5ad.24xlarge`: "m5ad.24xlarge" = "m5ad.24xlarge"
  val `m5zn.large`: "m5zn.large" = "m5zn.large"
  val `m5zn.xlarge`: "m5zn.xlarge" = "m5zn.xlarge"
  val `m5zn.2xlarge`: "m5zn.2xlarge" = "m5zn.2xlarge"
  val `m5zn.3xlarge`: "m5zn.3xlarge" = "m5zn.3xlarge"
  val `m5zn.6xlarge`: "m5zn.6xlarge" = "m5zn.6xlarge"
  val `m5zn.12xlarge`: "m5zn.12xlarge" = "m5zn.12xlarge"
  val `m5zn.metal`: "m5zn.metal" = "m5zn.metal"
  val `h1.2xlarge`: "h1.2xlarge" = "h1.2xlarge"
  val `h1.4xlarge`: "h1.4xlarge" = "h1.4xlarge"
  val `h1.8xlarge`: "h1.8xlarge" = "h1.8xlarge"
  val `h1.16xlarge`: "h1.16xlarge" = "h1.16xlarge"
  val `z1d.large`: "z1d.large" = "z1d.large"
  val `z1d.xlarge`: "z1d.xlarge" = "z1d.xlarge"
  val `z1d.2xlarge`: "z1d.2xlarge" = "z1d.2xlarge"
  val `z1d.3xlarge`: "z1d.3xlarge" = "z1d.3xlarge"
  val `z1d.6xlarge`: "z1d.6xlarge" = "z1d.6xlarge"
  val `z1d.12xlarge`: "z1d.12xlarge" = "z1d.12xlarge"
  val `z1d.metal`: "z1d.metal" = "z1d.metal"
  val `u-6tb1.metal`: "u-6tb1.metal" = "u-6tb1.metal"
  val `u-9tb1.metal`: "u-9tb1.metal" = "u-9tb1.metal"
  val `u-12tb1.metal`: "u-12tb1.metal" = "u-12tb1.metal"
  val `u-18tb1.metal`: "u-18tb1.metal" = "u-18tb1.metal"
  val `u-24tb1.metal`: "u-24tb1.metal" = "u-24tb1.metal"
  val `a1.medium`: "a1.medium" = "a1.medium"
  val `a1.large`: "a1.large" = "a1.large"
  val `a1.xlarge`: "a1.xlarge" = "a1.xlarge"
  val `a1.2xlarge`: "a1.2xlarge" = "a1.2xlarge"
  val `a1.4xlarge`: "a1.4xlarge" = "a1.4xlarge"
  val `a1.metal`: "a1.metal" = "a1.metal"
  val `m5dn.large`: "m5dn.large" = "m5dn.large"
  val `m5dn.xlarge`: "m5dn.xlarge" = "m5dn.xlarge"
  val `m5dn.2xlarge`: "m5dn.2xlarge" = "m5dn.2xlarge"
  val `m5dn.4xlarge`: "m5dn.4xlarge" = "m5dn.4xlarge"
  val `m5dn.8xlarge`: "m5dn.8xlarge" = "m5dn.8xlarge"
  val `m5dn.12xlarge`: "m5dn.12xlarge" = "m5dn.12xlarge"
  val `m5dn.16xlarge`: "m5dn.16xlarge" = "m5dn.16xlarge"
  val `m5dn.24xlarge`: "m5dn.24xlarge" = "m5dn.24xlarge"
  val `m5n.large`: "m5n.large" = "m5n.large"
  val `m5n.xlarge`: "m5n.xlarge" = "m5n.xlarge"
  val `m5n.2xlarge`: "m5n.2xlarge" = "m5n.2xlarge"
  val `m5n.4xlarge`: "m5n.4xlarge" = "m5n.4xlarge"
  val `m5n.8xlarge`: "m5n.8xlarge" = "m5n.8xlarge"
  val `m5n.12xlarge`: "m5n.12xlarge" = "m5n.12xlarge"
  val `m5n.16xlarge`: "m5n.16xlarge" = "m5n.16xlarge"
  val `m5n.24xlarge`: "m5n.24xlarge" = "m5n.24xlarge"
  val `r5dn.large`: "r5dn.large" = "r5dn.large"
  val `r5dn.xlarge`: "r5dn.xlarge" = "r5dn.xlarge"
  val `r5dn.2xlarge`: "r5dn.2xlarge" = "r5dn.2xlarge"
  val `r5dn.4xlarge`: "r5dn.4xlarge" = "r5dn.4xlarge"
  val `r5dn.8xlarge`: "r5dn.8xlarge" = "r5dn.8xlarge"
  val `r5dn.12xlarge`: "r5dn.12xlarge" = "r5dn.12xlarge"
  val `r5dn.16xlarge`: "r5dn.16xlarge" = "r5dn.16xlarge"
  val `r5dn.24xlarge`: "r5dn.24xlarge" = "r5dn.24xlarge"
  val `r5n.large`: "r5n.large" = "r5n.large"
  val `r5n.xlarge`: "r5n.xlarge" = "r5n.xlarge"
  val `r5n.2xlarge`: "r5n.2xlarge" = "r5n.2xlarge"
  val `r5n.4xlarge`: "r5n.4xlarge" = "r5n.4xlarge"
  val `r5n.8xlarge`: "r5n.8xlarge" = "r5n.8xlarge"
  val `r5n.12xlarge`: "r5n.12xlarge" = "r5n.12xlarge"
  val `r5n.16xlarge`: "r5n.16xlarge" = "r5n.16xlarge"
  val `r5n.24xlarge`: "r5n.24xlarge" = "r5n.24xlarge"
  val `inf1.xlarge`: "inf1.xlarge" = "inf1.xlarge"
  val `inf1.2xlarge`: "inf1.2xlarge" = "inf1.2xlarge"
  val `inf1.6xlarge`: "inf1.6xlarge" = "inf1.6xlarge"
  val `inf1.24xlarge`: "inf1.24xlarge" = "inf1.24xlarge"
  val `m6g.metal`: "m6g.metal" = "m6g.metal"
  val `m6g.medium`: "m6g.medium" = "m6g.medium"
  val `m6g.large`: "m6g.large" = "m6g.large"
  val `m6g.xlarge`: "m6g.xlarge" = "m6g.xlarge"
  val `m6g.2xlarge`: "m6g.2xlarge" = "m6g.2xlarge"
  val `m6g.4xlarge`: "m6g.4xlarge" = "m6g.4xlarge"
  val `m6g.8xlarge`: "m6g.8xlarge" = "m6g.8xlarge"
  val `m6g.12xlarge`: "m6g.12xlarge" = "m6g.12xlarge"
  val `m6g.16xlarge`: "m6g.16xlarge" = "m6g.16xlarge"
  val `m6gd.metal`: "m6gd.metal" = "m6gd.metal"
  val `m6gd.medium`: "m6gd.medium" = "m6gd.medium"
  val `m6gd.large`: "m6gd.large" = "m6gd.large"
  val `m6gd.xlarge`: "m6gd.xlarge" = "m6gd.xlarge"
  val `m6gd.2xlarge`: "m6gd.2xlarge" = "m6gd.2xlarge"
  val `m6gd.4xlarge`: "m6gd.4xlarge" = "m6gd.4xlarge"
  val `m6gd.8xlarge`: "m6gd.8xlarge" = "m6gd.8xlarge"
  val `m6gd.12xlarge`: "m6gd.12xlarge" = "m6gd.12xlarge"
  val `m6gd.16xlarge`: "m6gd.16xlarge" = "m6gd.16xlarge"
  val `mac1.metal`: "mac1.metal" = "mac1.metal"
  val `x2gd.medium`: "x2gd.medium" = "x2gd.medium"
  val `x2gd.large`: "x2gd.large" = "x2gd.large"
  val `x2gd.xlarge`: "x2gd.xlarge" = "x2gd.xlarge"
  val `x2gd.2xlarge`: "x2gd.2xlarge" = "x2gd.2xlarge"
  val `x2gd.4xlarge`: "x2gd.4xlarge" = "x2gd.4xlarge"
  val `x2gd.8xlarge`: "x2gd.8xlarge" = "x2gd.8xlarge"
  val `x2gd.12xlarge`: "x2gd.12xlarge" = "x2gd.12xlarge"
  val `x2gd.16xlarge`: "x2gd.16xlarge" = "x2gd.16xlarge"
  val `x2gd.metal`: "x2gd.metal" = "x2gd.metal"

  @inline def values = js.Array[InstanceType](
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
    `m1.small`,
    `m1.medium`,
    `m1.large`,
    `m1.xlarge`,
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
    `m2.xlarge`,
    `m2.2xlarge`,
    `m2.4xlarge`,
    `cr1.8xlarge`,
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
    `r5ad.large`,
    `r5ad.xlarge`,
    `r5ad.2xlarge`,
    `r5ad.4xlarge`,
    `r5ad.8xlarge`,
    `r5ad.12xlarge`,
    `r5ad.16xlarge`,
    `r5ad.24xlarge`,
    `r6g.metal`,
    `r6g.medium`,
    `r6g.large`,
    `r6g.xlarge`,
    `r6g.2xlarge`,
    `r6g.4xlarge`,
    `r6g.8xlarge`,
    `r6g.12xlarge`,
    `r6g.16xlarge`,
    `r6gd.metal`,
    `r6gd.medium`,
    `r6gd.large`,
    `r6gd.xlarge`,
    `r6gd.2xlarge`,
    `r6gd.4xlarge`,
    `r6gd.8xlarge`,
    `r6gd.12xlarge`,
    `r6gd.16xlarge`,
    `x1.16xlarge`,
    `x1.32xlarge`,
    `x1e.xlarge`,
    `x1e.2xlarge`,
    `x1e.4xlarge`,
    `x1e.8xlarge`,
    `x1e.16xlarge`,
    `x1e.32xlarge`,
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
    `hi1.4xlarge`,
    `hs1.8xlarge`,
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
    `c6g.metal`,
    `c6g.medium`,
    `c6g.large`,
    `c6g.xlarge`,
    `c6g.2xlarge`,
    `c6g.4xlarge`,
    `c6g.8xlarge`,
    `c6g.12xlarge`,
    `c6g.16xlarge`,
    `c6gd.metal`,
    `c6gd.medium`,
    `c6gd.large`,
    `c6gd.xlarge`,
    `c6gd.2xlarge`,
    `c6gd.4xlarge`,
    `c6gd.8xlarge`,
    `c6gd.12xlarge`,
    `c6gd.16xlarge`,
    `c6gn.medium`,
    `c6gn.large`,
    `c6gn.xlarge`,
    `c6gn.2xlarge`,
    `c6gn.4xlarge`,
    `c6gn.8xlarge`,
    `c6gn.12xlarge`,
    `c6gn.16xlarge`,
    `cc1.4xlarge`,
    `cc2.8xlarge`,
    `g2.2xlarge`,
    `g2.8xlarge`,
    `g3.4xlarge`,
    `g3.8xlarge`,
    `g3.16xlarge`,
    `g3s.xlarge`,
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
    `cg1.4xlarge`,
    `p2.xlarge`,
    `p2.8xlarge`,
    `p2.16xlarge`,
    `p3.2xlarge`,
    `p3.8xlarge`,
    `p3.16xlarge`,
    `p3dn.24xlarge`,
    `p4d.24xlarge`,
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
    `f1.2xlarge`,
    `f1.4xlarge`,
    `f1.16xlarge`,
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
    `m5d.large`,
    `m5d.xlarge`,
    `m5d.2xlarge`,
    `m5d.4xlarge`,
    `m5d.8xlarge`,
    `m5d.12xlarge`,
    `m5d.16xlarge`,
    `m5d.24xlarge`,
    `m5d.metal`,
    `m5ad.large`,
    `m5ad.xlarge`,
    `m5ad.2xlarge`,
    `m5ad.4xlarge`,
    `m5ad.8xlarge`,
    `m5ad.12xlarge`,
    `m5ad.16xlarge`,
    `m5ad.24xlarge`,
    `m5zn.large`,
    `m5zn.xlarge`,
    `m5zn.2xlarge`,
    `m5zn.3xlarge`,
    `m5zn.6xlarge`,
    `m5zn.12xlarge`,
    `m5zn.metal`,
    `h1.2xlarge`,
    `h1.4xlarge`,
    `h1.8xlarge`,
    `h1.16xlarge`,
    `z1d.large`,
    `z1d.xlarge`,
    `z1d.2xlarge`,
    `z1d.3xlarge`,
    `z1d.6xlarge`,
    `z1d.12xlarge`,
    `z1d.metal`,
    `u-6tb1.metal`,
    `u-9tb1.metal`,
    `u-12tb1.metal`,
    `u-18tb1.metal`,
    `u-24tb1.metal`,
    `a1.medium`,
    `a1.large`,
    `a1.xlarge`,
    `a1.2xlarge`,
    `a1.4xlarge`,
    `a1.metal`,
    `m5dn.large`,
    `m5dn.xlarge`,
    `m5dn.2xlarge`,
    `m5dn.4xlarge`,
    `m5dn.8xlarge`,
    `m5dn.12xlarge`,
    `m5dn.16xlarge`,
    `m5dn.24xlarge`,
    `m5n.large`,
    `m5n.xlarge`,
    `m5n.2xlarge`,
    `m5n.4xlarge`,
    `m5n.8xlarge`,
    `m5n.12xlarge`,
    `m5n.16xlarge`,
    `m5n.24xlarge`,
    `r5dn.large`,
    `r5dn.xlarge`,
    `r5dn.2xlarge`,
    `r5dn.4xlarge`,
    `r5dn.8xlarge`,
    `r5dn.12xlarge`,
    `r5dn.16xlarge`,
    `r5dn.24xlarge`,
    `r5n.large`,
    `r5n.xlarge`,
    `r5n.2xlarge`,
    `r5n.4xlarge`,
    `r5n.8xlarge`,
    `r5n.12xlarge`,
    `r5n.16xlarge`,
    `r5n.24xlarge`,
    `inf1.xlarge`,
    `inf1.2xlarge`,
    `inf1.6xlarge`,
    `inf1.24xlarge`,
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
    `mac1.metal`,
    `x2gd.medium`,
    `x2gd.large`,
    `x2gd.xlarge`,
    `x2gd.2xlarge`,
    `x2gd.4xlarge`,
    `x2gd.8xlarge`,
    `x2gd.12xlarge`,
    `x2gd.16xlarge`,
    `x2gd.metal`
  )
}

type InstanceTypeHypervisor = "nitro" | "xen"
object InstanceTypeHypervisor {
  val nitro: "nitro" = "nitro"
  val xen: "xen" = "xen"

  @inline def values = js.Array[InstanceTypeHypervisor](nitro, xen)
}

type InterfacePermissionType = "INSTANCE-ATTACH" | "EIP-ASSOCIATE"
object InterfacePermissionType {
  val `INSTANCE-ATTACH`: "INSTANCE-ATTACH" = "INSTANCE-ATTACH"
  val `EIP-ASSOCIATE`: "EIP-ASSOCIATE" = "EIP-ASSOCIATE"

  @inline def values = js.Array[InterfacePermissionType](`INSTANCE-ATTACH`, `EIP-ASSOCIATE`)
}

type Ipv6SupportValue = "enable" | "disable"
object Ipv6SupportValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[Ipv6SupportValue](enable, disable)
}

type LaunchTemplateErrorCode = "launchTemplateIdDoesNotExist" | "launchTemplateIdMalformed" | "launchTemplateNameDoesNotExist" | "launchTemplateNameMalformed" | "launchTemplateVersionDoesNotExist" | "unexpectedError"
object LaunchTemplateErrorCode {
  val launchTemplateIdDoesNotExist: "launchTemplateIdDoesNotExist" = "launchTemplateIdDoesNotExist"
  val launchTemplateIdMalformed: "launchTemplateIdMalformed" = "launchTemplateIdMalformed"
  val launchTemplateNameDoesNotExist: "launchTemplateNameDoesNotExist" = "launchTemplateNameDoesNotExist"
  val launchTemplateNameMalformed: "launchTemplateNameMalformed" = "launchTemplateNameMalformed"
  val launchTemplateVersionDoesNotExist: "launchTemplateVersionDoesNotExist" = "launchTemplateVersionDoesNotExist"
  val unexpectedError: "unexpectedError" = "unexpectedError"

  @inline def values = js.Array[LaunchTemplateErrorCode](
    launchTemplateIdDoesNotExist,
    launchTemplateIdMalformed,
    launchTemplateNameDoesNotExist,
    launchTemplateNameMalformed,
    launchTemplateVersionDoesNotExist,
    unexpectedError
  )
}

type LaunchTemplateHttpTokensState = "optional" | "required"
object LaunchTemplateHttpTokensState {
  val optional: "optional" = "optional"
  val required: "required" = "required"

  @inline def values = js.Array[LaunchTemplateHttpTokensState](optional, required)
}

type LaunchTemplateInstanceMetadataEndpointState = "disabled" | "enabled"
object LaunchTemplateInstanceMetadataEndpointState {
  val disabled: "disabled" = "disabled"
  val enabled: "enabled" = "enabled"

  @inline def values = js.Array[LaunchTemplateInstanceMetadataEndpointState](disabled, enabled)
}

type LaunchTemplateInstanceMetadataOptionsState = "pending" | "applied"
object LaunchTemplateInstanceMetadataOptionsState {
  val pending: "pending" = "pending"
  val applied: "applied" = "applied"

  @inline def values = js.Array[LaunchTemplateInstanceMetadataOptionsState](pending, applied)
}

type ListingState = "available" | "sold" | "cancelled" | "pending"
object ListingState {
  val available: "available" = "available"
  val sold: "sold" = "sold"
  val cancelled: "cancelled" = "cancelled"
  val pending: "pending" = "pending"

  @inline def values = js.Array[ListingState](available, sold, cancelled, pending)
}

type ListingStatus = "active" | "pending" | "cancelled" | "closed"
object ListingStatus {
  val active: "active" = "active"
  val pending: "pending" = "pending"
  val cancelled: "cancelled" = "cancelled"
  val closed: "closed" = "closed"

  @inline def values = js.Array[ListingStatus](active, pending, cancelled, closed)
}

type LocalGatewayRouteState = "pending" | "active" | "blackhole" | "deleting" | "deleted"
object LocalGatewayRouteState {
  val pending: "pending" = "pending"
  val active: "active" = "active"
  val blackhole: "blackhole" = "blackhole"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[LocalGatewayRouteState](pending, active, blackhole, deleting, deleted)
}

type LocalGatewayRouteType = "static" | "propagated"
object LocalGatewayRouteType {
  val static: "static" = "static"
  val propagated: "propagated" = "propagated"

  @inline def values = js.Array[LocalGatewayRouteType](static, propagated)
}

type LocationType = "region" | "availability-zone" | "availability-zone-id"
object LocationType {
  val region: "region" = "region"
  val `availability-zone`: "availability-zone" = "availability-zone"
  val `availability-zone-id`: "availability-zone-id" = "availability-zone-id"

  @inline def values = js.Array[LocationType](region, `availability-zone`, `availability-zone-id`)
}

type LogDestinationType = "cloud-watch-logs" | "s3"
object LogDestinationType {
  val `cloud-watch-logs`: "cloud-watch-logs" = "cloud-watch-logs"
  val s3: "s3" = "s3"

  @inline def values = js.Array[LogDestinationType](`cloud-watch-logs`, s3)
}

type MarketType = "spot"
object MarketType {
  val spot: "spot" = "spot"

  @inline def values = js.Array[MarketType](spot)
}

type MembershipType = "static" | "igmp"
object MembershipType {
  val static: "static" = "static"
  val igmp: "igmp" = "igmp"

  @inline def values = js.Array[MembershipType](static, igmp)
}

type ModifyAvailabilityZoneOptInStatus = "opted-in" | "not-opted-in"
object ModifyAvailabilityZoneOptInStatus {
  val `opted-in`: "opted-in" = "opted-in"
  val `not-opted-in`: "not-opted-in" = "not-opted-in"

  @inline def values = js.Array[ModifyAvailabilityZoneOptInStatus](`opted-in`, `not-opted-in`)
}

type MonitoringState = "disabled" | "disabling" | "enabled" | "pending"
object MonitoringState {
  val disabled: "disabled" = "disabled"
  val disabling: "disabling" = "disabling"
  val enabled: "enabled" = "enabled"
  val pending: "pending" = "pending"

  @inline def values = js.Array[MonitoringState](disabled, disabling, enabled, pending)
}

type MoveStatus = "movingToVpc" | "restoringToClassic"
object MoveStatus {
  val movingToVpc: "movingToVpc" = "movingToVpc"
  val restoringToClassic: "restoringToClassic" = "restoringToClassic"

  @inline def values = js.Array[MoveStatus](movingToVpc, restoringToClassic)
}

type MulticastSupportValue = "enable" | "disable"
object MulticastSupportValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[MulticastSupportValue](enable, disable)
}

type NatGatewayState = "pending" | "failed" | "available" | "deleting" | "deleted"
object NatGatewayState {
  val pending: "pending" = "pending"
  val failed: "failed" = "failed"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[NatGatewayState](pending, failed, available, deleting, deleted)
}

type NetworkInterfaceAttribute = "description" | "groupSet" | "sourceDestCheck" | "attachment"
object NetworkInterfaceAttribute {
  val description: "description" = "description"
  val groupSet: "groupSet" = "groupSet"
  val sourceDestCheck: "sourceDestCheck" = "sourceDestCheck"
  val attachment: "attachment" = "attachment"

  @inline def values = js.Array[NetworkInterfaceAttribute](description, groupSet, sourceDestCheck, attachment)
}

type NetworkInterfaceCreationType = "efa"
object NetworkInterfaceCreationType {
  val efa: "efa" = "efa"

  @inline def values = js.Array[NetworkInterfaceCreationType](efa)
}

type NetworkInterfacePermissionStateCode = "pending" | "granted" | "revoking" | "revoked"
object NetworkInterfacePermissionStateCode {
  val pending: "pending" = "pending"
  val granted: "granted" = "granted"
  val revoking: "revoking" = "revoking"
  val revoked: "revoked" = "revoked"

  @inline def values = js.Array[NetworkInterfacePermissionStateCode](pending, granted, revoking, revoked)
}

type NetworkInterfaceStatus = "available" | "associated" | "attaching" | "in-use" | "detaching"
object NetworkInterfaceStatus {
  val available: "available" = "available"
  val associated: "associated" = "associated"
  val attaching: "attaching" = "attaching"
  val `in-use`: "in-use" = "in-use"
  val detaching: "detaching" = "detaching"

  @inline def values = js.Array[NetworkInterfaceStatus](available, associated, attaching, `in-use`, detaching)
}

type NetworkInterfaceType = "interface" | "natGateway" | "efa"
object NetworkInterfaceType {
  val interface: "interface" = "interface"
  val natGateway: "natGateway" = "natGateway"
  val efa: "efa" = "efa"

  @inline def values = js.Array[NetworkInterfaceType](interface, natGateway, efa)
}

type OfferingClassType = "standard" | "convertible"
object OfferingClassType {
  val standard: "standard" = "standard"
  val convertible: "convertible" = "convertible"

  @inline def values = js.Array[OfferingClassType](standard, convertible)
}

type OfferingTypeValues = "Heavy Utilization" | "Medium Utilization" | "Light Utilization" | "No Upfront" | "Partial Upfront" | "All Upfront"
object OfferingTypeValues {
  val `Heavy Utilization`: "Heavy Utilization" = "Heavy Utilization"
  val `Medium Utilization`: "Medium Utilization" = "Medium Utilization"
  val `Light Utilization`: "Light Utilization" = "Light Utilization"
  val `No Upfront`: "No Upfront" = "No Upfront"
  val `Partial Upfront`: "Partial Upfront" = "Partial Upfront"
  val `All Upfront`: "All Upfront" = "All Upfront"

  @inline def values = js.Array[OfferingTypeValues](`Heavy Utilization`, `Medium Utilization`, `Light Utilization`, `No Upfront`, `Partial Upfront`, `All Upfront`)
}

type OnDemandAllocationStrategy = "lowestPrice" | "prioritized"
object OnDemandAllocationStrategy {
  val lowestPrice: "lowestPrice" = "lowestPrice"
  val prioritized: "prioritized" = "prioritized"

  @inline def values = js.Array[OnDemandAllocationStrategy](lowestPrice, prioritized)
}

type OperationType = "add" | "remove"
object OperationType {
  val add: "add" = "add"
  val remove: "remove" = "remove"

  @inline def values = js.Array[OperationType](add, remove)
}

type PartitionLoadFrequency = "none" | "daily" | "weekly" | "monthly"
object PartitionLoadFrequency {
  val none: "none" = "none"
  val daily: "daily" = "daily"
  val weekly: "weekly" = "weekly"
  val monthly: "monthly" = "monthly"

  @inline def values = js.Array[PartitionLoadFrequency](none, daily, weekly, monthly)
}

type PaymentOption = "AllUpfront" | "PartialUpfront" | "NoUpfront"
object PaymentOption {
  val AllUpfront: "AllUpfront" = "AllUpfront"
  val PartialUpfront: "PartialUpfront" = "PartialUpfront"
  val NoUpfront: "NoUpfront" = "NoUpfront"

  @inline def values = js.Array[PaymentOption](AllUpfront, PartialUpfront, NoUpfront)
}

type PermissionGroup = "all"
object PermissionGroup {
  val all: "all" = "all"

  @inline def values = js.Array[PermissionGroup](all)
}

type PlacementGroupState = "pending" | "available" | "deleting" | "deleted"
object PlacementGroupState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[PlacementGroupState](pending, available, deleting, deleted)
}

type PlacementGroupStrategy = "cluster" | "partition" | "spread"
object PlacementGroupStrategy {
  val cluster: "cluster" = "cluster"
  val partition: "partition" = "partition"
  val spread: "spread" = "spread"

  @inline def values = js.Array[PlacementGroupStrategy](cluster, partition, spread)
}

type PlacementStrategy = "cluster" | "spread" | "partition"
object PlacementStrategy {
  val cluster: "cluster" = "cluster"
  val spread: "spread" = "spread"
  val partition: "partition" = "partition"

  @inline def values = js.Array[PlacementStrategy](cluster, spread, partition)
}

type PlatformValues = "Windows"
object PlatformValues {
  val Windows: "Windows" = "Windows"

  @inline def values = js.Array[PlatformValues](Windows)
}

type PrefixListState = "create-in-progress" | "create-complete" | "create-failed" | "modify-in-progress" | "modify-complete" | "modify-failed" | "restore-in-progress" | "restore-complete" | "restore-failed" | "delete-in-progress" | "delete-complete" | "delete-failed"
object PrefixListState {
  val `create-in-progress`: "create-in-progress" = "create-in-progress"
  val `create-complete`: "create-complete" = "create-complete"
  val `create-failed`: "create-failed" = "create-failed"
  val `modify-in-progress`: "modify-in-progress" = "modify-in-progress"
  val `modify-complete`: "modify-complete" = "modify-complete"
  val `modify-failed`: "modify-failed" = "modify-failed"
  val `restore-in-progress`: "restore-in-progress" = "restore-in-progress"
  val `restore-complete`: "restore-complete" = "restore-complete"
  val `restore-failed`: "restore-failed" = "restore-failed"
  val `delete-in-progress`: "delete-in-progress" = "delete-in-progress"
  val `delete-complete`: "delete-complete" = "delete-complete"
  val `delete-failed`: "delete-failed" = "delete-failed"

  @inline def values = js.Array[PrefixListState](
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

type PrincipalType = "All" | "Service" | "OrganizationUnit" | "Account" | "User" | "Role"
object PrincipalType {
  val All: "All" = "All"
  val Service: "Service" = "Service"
  val OrganizationUnit: "OrganizationUnit" = "OrganizationUnit"
  val Account: "Account" = "Account"
  val User: "User" = "User"
  val Role: "Role" = "Role"

  @inline def values = js.Array[PrincipalType](All, Service, OrganizationUnit, Account, User, Role)
}

type ProductCodeValues = "devpay" | "marketplace"
object ProductCodeValues {
  val devpay: "devpay" = "devpay"
  val marketplace: "marketplace" = "marketplace"

  @inline def values = js.Array[ProductCodeValues](devpay, marketplace)
}

type Protocol = "tcp" | "udp"
object Protocol {
  val tcp: "tcp" = "tcp"
  val udp: "udp" = "udp"

  @inline def values = js.Array[Protocol](tcp, udp)
}

type ProtocolValue = "gre"
object ProtocolValue {
  val gre: "gre" = "gre"

  @inline def values = js.Array[ProtocolValue](gre)
}

type RIProductDescription = "Linux/UNIX" | "Linux/UNIX (Amazon VPC)" | "Windows" | "Windows (Amazon VPC)"
object RIProductDescription {
  val `Linux/UNIX`: "Linux/UNIX" = "Linux/UNIX"
  val `Linux/UNIX (Amazon VPC)` : "Linux/UNIX (Amazon VPC)" = "Linux/UNIX (Amazon VPC)"
  val Windows: "Windows" = "Windows"
  val `Windows (Amazon VPC)` : "Windows (Amazon VPC)" = "Windows (Amazon VPC)"

  @inline def values = js.Array[RIProductDescription](`Linux/UNIX`, `Linux/UNIX (Amazon VPC)`, Windows, `Windows (Amazon VPC)`)
}

type RecurringChargeFrequency = "Hourly"
object RecurringChargeFrequency {
  val Hourly: "Hourly" = "Hourly"

  @inline def values = js.Array[RecurringChargeFrequency](Hourly)
}

type ReplaceRootVolumeTaskState = "pending" | "in-progress" | "failing" | "succeeded" | "failed" | "failed-detached"
object ReplaceRootVolumeTaskState {
  val pending: "pending" = "pending"
  val `in-progress`: "in-progress" = "in-progress"
  val failing: "failing" = "failing"
  val succeeded: "succeeded" = "succeeded"
  val failed: "failed" = "failed"
  val `failed-detached`: "failed-detached" = "failed-detached"

  @inline def values = js.Array[ReplaceRootVolumeTaskState](pending, `in-progress`, failing, succeeded, failed, `failed-detached`)
}

type ReplacementStrategy = "launch"
object ReplacementStrategy {
  val launch: "launch" = "launch"

  @inline def values = js.Array[ReplacementStrategy](launch)
}

type ReportInstanceReasonCodes = "instance-stuck-in-state" | "unresponsive" | "not-accepting-credentials" | "password-not-available" | "performance-network" | "performance-instance-store" | "performance-ebs-volume" | "performance-other" | "other"
object ReportInstanceReasonCodes {
  val `instance-stuck-in-state`: "instance-stuck-in-state" = "instance-stuck-in-state"
  val unresponsive: "unresponsive" = "unresponsive"
  val `not-accepting-credentials`: "not-accepting-credentials" = "not-accepting-credentials"
  val `password-not-available`: "password-not-available" = "password-not-available"
  val `performance-network`: "performance-network" = "performance-network"
  val `performance-instance-store`: "performance-instance-store" = "performance-instance-store"
  val `performance-ebs-volume`: "performance-ebs-volume" = "performance-ebs-volume"
  val `performance-other`: "performance-other" = "performance-other"
  val other: "other" = "other"

  @inline def values = js.Array[ReportInstanceReasonCodes](
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

type ReportStatusType = "ok" | "impaired"
object ReportStatusType {
  val ok: "ok" = "ok"
  val impaired: "impaired" = "impaired"

  @inline def values = js.Array[ReportStatusType](ok, impaired)
}

type ReservationState = "payment-pending" | "payment-failed" | "active" | "retired"
object ReservationState {
  val `payment-pending`: "payment-pending" = "payment-pending"
  val `payment-failed`: "payment-failed" = "payment-failed"
  val active: "active" = "active"
  val retired: "retired" = "retired"

  @inline def values = js.Array[ReservationState](`payment-pending`, `payment-failed`, active, retired)
}

type ReservedInstanceState = "payment-pending" | "active" | "payment-failed" | "retired" | "queued" | "queued-deleted"
object ReservedInstanceState {
  val `payment-pending`: "payment-pending" = "payment-pending"
  val active: "active" = "active"
  val `payment-failed`: "payment-failed" = "payment-failed"
  val retired: "retired" = "retired"
  val queued: "queued" = "queued"
  val `queued-deleted`: "queued-deleted" = "queued-deleted"

  @inline def values = js.Array[ReservedInstanceState](`payment-pending`, active, `payment-failed`, retired, queued, `queued-deleted`)
}

type ResetFpgaImageAttributeName = "loadPermission"
object ResetFpgaImageAttributeName {
  val loadPermission: "loadPermission" = "loadPermission"

  @inline def values = js.Array[ResetFpgaImageAttributeName](loadPermission)
}

type ResetImageAttributeName = "launchPermission"
object ResetImageAttributeName {
  val launchPermission: "launchPermission" = "launchPermission"

  @inline def values = js.Array[ResetImageAttributeName](launchPermission)
}

type ResourceType =
  "client-vpn-endpoint" | "customer-gateway" | "dedicated-host" | "dhcp-options" | "egress-only-internet-gateway" | "elastic-ip" | "elastic-gpu" | "export-image-task" | "export-instance-task" | "fleet" | "fpga-image" | "host-reservation" | "image" | "import-image-task" | "import-snapshot-task" | "instance" | "internet-gateway" | "key-pair" | "launch-template" | "local-gateway-route-table-vpc-association" | "natgateway" | "network-acl" | "network-interface" | "network-insights-analysis" | "network-insights-path" | "placement-group" | "reserved-instances" | "route-table" | "security-group" | "snapshot" | "spot-fleet-request" | "spot-instances-request" | "subnet" | "traffic-mirror-filter" | "traffic-mirror-session" | "traffic-mirror-target" | "transit-gateway" | "transit-gateway-attachment" | "transit-gateway-connect-peer" | "transit-gateway-multicast-domain" | "transit-gateway-route-table" | "volume" | "vpc" | "vpc-peering-connection" | "vpn-connection" | "vpn-gateway" | "vpc-flow-log"
object ResourceType {
  val `client-vpn-endpoint`: "client-vpn-endpoint" = "client-vpn-endpoint"
  val `customer-gateway`: "customer-gateway" = "customer-gateway"
  val `dedicated-host`: "dedicated-host" = "dedicated-host"
  val `dhcp-options`: "dhcp-options" = "dhcp-options"
  val `egress-only-internet-gateway`: "egress-only-internet-gateway" = "egress-only-internet-gateway"
  val `elastic-ip`: "elastic-ip" = "elastic-ip"
  val `elastic-gpu`: "elastic-gpu" = "elastic-gpu"
  val `export-image-task`: "export-image-task" = "export-image-task"
  val `export-instance-task`: "export-instance-task" = "export-instance-task"
  val fleet: "fleet" = "fleet"
  val `fpga-image`: "fpga-image" = "fpga-image"
  val `host-reservation`: "host-reservation" = "host-reservation"
  val image: "image" = "image"
  val `import-image-task`: "import-image-task" = "import-image-task"
  val `import-snapshot-task`: "import-snapshot-task" = "import-snapshot-task"
  val instance: "instance" = "instance"
  val `internet-gateway`: "internet-gateway" = "internet-gateway"
  val `key-pair`: "key-pair" = "key-pair"
  val `launch-template`: "launch-template" = "launch-template"
  val `local-gateway-route-table-vpc-association`: "local-gateway-route-table-vpc-association" = "local-gateway-route-table-vpc-association"
  val natgateway: "natgateway" = "natgateway"
  val `network-acl`: "network-acl" = "network-acl"
  val `network-interface`: "network-interface" = "network-interface"
  val `network-insights-analysis`: "network-insights-analysis" = "network-insights-analysis"
  val `network-insights-path`: "network-insights-path" = "network-insights-path"
  val `placement-group`: "placement-group" = "placement-group"
  val `reserved-instances`: "reserved-instances" = "reserved-instances"
  val `route-table`: "route-table" = "route-table"
  val `security-group`: "security-group" = "security-group"
  val snapshot: "snapshot" = "snapshot"
  val `spot-fleet-request`: "spot-fleet-request" = "spot-fleet-request"
  val `spot-instances-request`: "spot-instances-request" = "spot-instances-request"
  val subnet: "subnet" = "subnet"
  val `traffic-mirror-filter`: "traffic-mirror-filter" = "traffic-mirror-filter"
  val `traffic-mirror-session`: "traffic-mirror-session" = "traffic-mirror-session"
  val `traffic-mirror-target`: "traffic-mirror-target" = "traffic-mirror-target"
  val `transit-gateway`: "transit-gateway" = "transit-gateway"
  val `transit-gateway-attachment`: "transit-gateway-attachment" = "transit-gateway-attachment"
  val `transit-gateway-connect-peer`: "transit-gateway-connect-peer" = "transit-gateway-connect-peer"
  val `transit-gateway-multicast-domain`: "transit-gateway-multicast-domain" = "transit-gateway-multicast-domain"
  val `transit-gateway-route-table`: "transit-gateway-route-table" = "transit-gateway-route-table"
  val volume: "volume" = "volume"
  val vpc: "vpc" = "vpc"
  val `vpc-peering-connection`: "vpc-peering-connection" = "vpc-peering-connection"
  val `vpn-connection`: "vpn-connection" = "vpn-connection"
  val `vpn-gateway`: "vpn-gateway" = "vpn-gateway"
  val `vpc-flow-log`: "vpc-flow-log" = "vpc-flow-log"

  @inline def values = js.Array[ResourceType](
    `client-vpn-endpoint`,
    `customer-gateway`,
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
    `internet-gateway`,
    `key-pair`,
    `launch-template`,
    `local-gateway-route-table-vpc-association`,
    natgateway,
    `network-acl`,
    `network-interface`,
    `network-insights-analysis`,
    `network-insights-path`,
    `placement-group`,
    `reserved-instances`,
    `route-table`,
    `security-group`,
    snapshot,
    `spot-fleet-request`,
    `spot-instances-request`,
    subnet,
    `traffic-mirror-filter`,
    `traffic-mirror-session`,
    `traffic-mirror-target`,
    `transit-gateway`,
    `transit-gateway-attachment`,
    `transit-gateway-connect-peer`,
    `transit-gateway-multicast-domain`,
    `transit-gateway-route-table`,
    volume,
    vpc,
    `vpc-peering-connection`,
    `vpn-connection`,
    `vpn-gateway`,
    `vpc-flow-log`
  )
}

type RootDeviceType = "ebs" | "instance-store"
object RootDeviceType {
  val ebs: "ebs" = "ebs"
  val `instance-store`: "instance-store" = "instance-store"

  @inline def values = js.Array[RootDeviceType](ebs, `instance-store`)
}

type RouteOrigin = "CreateRouteTable" | "CreateRoute" | "EnableVgwRoutePropagation"
object RouteOrigin {
  val CreateRouteTable: "CreateRouteTable" = "CreateRouteTable"
  val CreateRoute: "CreateRoute" = "CreateRoute"
  val EnableVgwRoutePropagation: "EnableVgwRoutePropagation" = "EnableVgwRoutePropagation"

  @inline def values = js.Array[RouteOrigin](CreateRouteTable, CreateRoute, EnableVgwRoutePropagation)
}

type RouteState = "active" | "blackhole"
object RouteState {
  val active: "active" = "active"
  val blackhole: "blackhole" = "blackhole"

  @inline def values = js.Array[RouteState](active, blackhole)
}

type RouteTableAssociationStateCode = "associating" | "associated" | "disassociating" | "disassociated" | "failed"
object RouteTableAssociationStateCode {
  val associating: "associating" = "associating"
  val associated: "associated" = "associated"
  val disassociating: "disassociating" = "disassociating"
  val disassociated: "disassociated" = "disassociated"
  val failed: "failed" = "failed"

  @inline def values = js.Array[RouteTableAssociationStateCode](associating, associated, disassociating, disassociated, failed)
}

type RuleAction = "allow" | "deny"
object RuleAction {
  val allow: "allow" = "allow"
  val deny: "deny" = "deny"

  @inline def values = js.Array[RuleAction](allow, deny)
}

type SelfServicePortal = "enabled" | "disabled"
object SelfServicePortal {
  val enabled: "enabled" = "enabled"
  val disabled: "disabled" = "disabled"

  @inline def values = js.Array[SelfServicePortal](enabled, disabled)
}

type ServiceState = "Pending" | "Available" | "Deleting" | "Deleted" | "Failed"
object ServiceState {
  val Pending: "Pending" = "Pending"
  val Available: "Available" = "Available"
  val Deleting: "Deleting" = "Deleting"
  val Deleted: "Deleted" = "Deleted"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[ServiceState](Pending, Available, Deleting, Deleted, Failed)
}

type ServiceType = "Interface" | "Gateway" | "GatewayLoadBalancer"
object ServiceType {
  val Interface: "Interface" = "Interface"
  val Gateway: "Gateway" = "Gateway"
  val GatewayLoadBalancer: "GatewayLoadBalancer" = "GatewayLoadBalancer"

  @inline def values = js.Array[ServiceType](Interface, Gateway, GatewayLoadBalancer)
}

type ShutdownBehavior = "stop" | "terminate"
object ShutdownBehavior {
  val stop: "stop" = "stop"
  val terminate: "terminate" = "terminate"

  @inline def values = js.Array[ShutdownBehavior](stop, terminate)
}

type SnapshotAttributeName = "productCodes" | "createVolumePermission"
object SnapshotAttributeName {
  val productCodes: "productCodes" = "productCodes"
  val createVolumePermission: "createVolumePermission" = "createVolumePermission"

  @inline def values = js.Array[SnapshotAttributeName](productCodes, createVolumePermission)
}

type SnapshotState = "pending" | "completed" | "error"
object SnapshotState {
  val pending: "pending" = "pending"
  val completed: "completed" = "completed"
  val error: "error" = "error"

  @inline def values = js.Array[SnapshotState](pending, completed, error)
}

type SpotAllocationStrategy = "lowest-price" | "diversified" | "capacity-optimized" | "capacity-optimized-prioritized"
object SpotAllocationStrategy {
  val `lowest-price`: "lowest-price" = "lowest-price"
  val diversified: "diversified" = "diversified"
  val `capacity-optimized`: "capacity-optimized" = "capacity-optimized"
  val `capacity-optimized-prioritized`: "capacity-optimized-prioritized" = "capacity-optimized-prioritized"

  @inline def values = js.Array[SpotAllocationStrategy](`lowest-price`, diversified, `capacity-optimized`, `capacity-optimized-prioritized`)
}

type SpotInstanceInterruptionBehavior = "hibernate" | "stop" | "terminate"
object SpotInstanceInterruptionBehavior {
  val hibernate: "hibernate" = "hibernate"
  val stop: "stop" = "stop"
  val terminate: "terminate" = "terminate"

  @inline def values = js.Array[SpotInstanceInterruptionBehavior](hibernate, stop, terminate)
}

type SpotInstanceState = "open" | "active" | "closed" | "cancelled" | "failed"
object SpotInstanceState {
  val open: "open" = "open"
  val active: "active" = "active"
  val closed: "closed" = "closed"
  val cancelled: "cancelled" = "cancelled"
  val failed: "failed" = "failed"

  @inline def values = js.Array[SpotInstanceState](open, active, closed, cancelled, failed)
}

type SpotInstanceType = "one-time" | "persistent"
object SpotInstanceType {
  val `one-time`: "one-time" = "one-time"
  val persistent: "persistent" = "persistent"

  @inline def values = js.Array[SpotInstanceType](`one-time`, persistent)
}

type State = "PendingAcceptance" | "Pending" | "Available" | "Deleting" | "Deleted" | "Rejected" | "Failed" | "Expired"
object State {
  val PendingAcceptance: "PendingAcceptance" = "PendingAcceptance"
  val Pending: "Pending" = "Pending"
  val Available: "Available" = "Available"
  val Deleting: "Deleting" = "Deleting"
  val Deleted: "Deleted" = "Deleted"
  val Rejected: "Rejected" = "Rejected"
  val Failed: "Failed" = "Failed"
  val Expired: "Expired" = "Expired"

  @inline def values = js.Array[State](PendingAcceptance, Pending, Available, Deleting, Deleted, Rejected, Failed, Expired)
}

type StaticSourcesSupportValue = "enable" | "disable"
object StaticSourcesSupportValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[StaticSourcesSupportValue](enable, disable)
}

type Status = "MoveInProgress" | "InVpc" | "InClassic"
object Status {
  val MoveInProgress: "MoveInProgress" = "MoveInProgress"
  val InVpc: "InVpc" = "InVpc"
  val InClassic: "InClassic" = "InClassic"

  @inline def values = js.Array[Status](MoveInProgress, InVpc, InClassic)
}

type StatusName = "reachability"
object StatusName {
  val reachability: "reachability" = "reachability"

  @inline def values = js.Array[StatusName](reachability)
}

type StatusType = "passed" | "failed" | "insufficient-data" | "initializing"
object StatusType {
  val passed: "passed" = "passed"
  val failed: "failed" = "failed"
  val `insufficient-data`: "insufficient-data" = "insufficient-data"
  val initializing: "initializing" = "initializing"

  @inline def values = js.Array[StatusType](passed, failed, `insufficient-data`, initializing)
}

type SubnetCidrBlockStateCode = "associating" | "associated" | "disassociating" | "disassociated" | "failing" | "failed"
object SubnetCidrBlockStateCode {
  val associating: "associating" = "associating"
  val associated: "associated" = "associated"
  val disassociating: "disassociating" = "disassociating"
  val disassociated: "disassociated" = "disassociated"
  val failing: "failing" = "failing"
  val failed: "failed" = "failed"

  @inline def values = js.Array[SubnetCidrBlockStateCode](associating, associated, disassociating, disassociated, failing, failed)
}

type SubnetState = "pending" | "available"
object SubnetState {
  val pending: "pending" = "pending"
  val available: "available" = "available"

  @inline def values = js.Array[SubnetState](pending, available)
}

type SummaryStatus = "ok" | "impaired" | "insufficient-data" | "not-applicable" | "initializing"
object SummaryStatus {
  val ok: "ok" = "ok"
  val impaired: "impaired" = "impaired"
  val `insufficient-data`: "insufficient-data" = "insufficient-data"
  val `not-applicable`: "not-applicable" = "not-applicable"
  val initializing: "initializing" = "initializing"

  @inline def values = js.Array[SummaryStatus](ok, impaired, `insufficient-data`, `not-applicable`, initializing)
}

type TelemetryStatus = "UP" | "DOWN"
object TelemetryStatus {
  val UP: "UP" = "UP"
  val DOWN: "DOWN" = "DOWN"

  @inline def values = js.Array[TelemetryStatus](UP, DOWN)
}

type Tenancy = "default" | "dedicated" | "host"
object Tenancy {
  val default: "default" = "default"
  val dedicated: "dedicated" = "dedicated"
  val host: "host" = "host"

  @inline def values = js.Array[Tenancy](default, dedicated, host)
}

type TrafficDirection = "ingress" | "egress"
object TrafficDirection {
  val ingress: "ingress" = "ingress"
  val egress: "egress" = "egress"

  @inline def values = js.Array[TrafficDirection](ingress, egress)
}

type TrafficMirrorFilterRuleField = "destination-port-range" | "source-port-range" | "protocol" | "description"
object TrafficMirrorFilterRuleField {
  val `destination-port-range`: "destination-port-range" = "destination-port-range"
  val `source-port-range`: "source-port-range" = "source-port-range"
  val protocol: "protocol" = "protocol"
  val description: "description" = "description"

  @inline def values = js.Array[TrafficMirrorFilterRuleField](`destination-port-range`, `source-port-range`, protocol, description)
}

type TrafficMirrorNetworkService = "amazon-dns"
object TrafficMirrorNetworkService {
  val `amazon-dns`: "amazon-dns" = "amazon-dns"

  @inline def values = js.Array[TrafficMirrorNetworkService](`amazon-dns`)
}

type TrafficMirrorRuleAction = "accept" | "reject"
object TrafficMirrorRuleAction {
  val accept: "accept" = "accept"
  val reject: "reject" = "reject"

  @inline def values = js.Array[TrafficMirrorRuleAction](accept, reject)
}

type TrafficMirrorSessionField = "packet-length" | "description" | "virtual-network-id"
object TrafficMirrorSessionField {
  val `packet-length`: "packet-length" = "packet-length"
  val description: "description" = "description"
  val `virtual-network-id`: "virtual-network-id" = "virtual-network-id"

  @inline def values = js.Array[TrafficMirrorSessionField](`packet-length`, description, `virtual-network-id`)
}

type TrafficMirrorTargetType = "network-interface" | "network-load-balancer"
object TrafficMirrorTargetType {
  val `network-interface`: "network-interface" = "network-interface"
  val `network-load-balancer`: "network-load-balancer" = "network-load-balancer"

  @inline def values = js.Array[TrafficMirrorTargetType](`network-interface`, `network-load-balancer`)
}

type TrafficType = "ACCEPT" | "REJECT" | "ALL"
object TrafficType {
  val ACCEPT: "ACCEPT" = "ACCEPT"
  val REJECT: "REJECT" = "REJECT"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[TrafficType](ACCEPT, REJECT, ALL)
}

type TransitGatewayAssociationState = "associating" | "associated" | "disassociating" | "disassociated"
object TransitGatewayAssociationState {
  val associating: "associating" = "associating"
  val associated: "associated" = "associated"
  val disassociating: "disassociating" = "disassociating"
  val disassociated: "disassociated" = "disassociated"

  @inline def values = js.Array[TransitGatewayAssociationState](associating, associated, disassociating, disassociated)
}

type TransitGatewayAttachmentResourceType = "vpc" | "vpn" | "direct-connect-gateway" | "connect" | "peering" | "tgw-peering"
object TransitGatewayAttachmentResourceType {
  val vpc: "vpc" = "vpc"
  val vpn: "vpn" = "vpn"
  val `direct-connect-gateway`: "direct-connect-gateway" = "direct-connect-gateway"
  val connect: "connect" = "connect"
  val peering: "peering" = "peering"
  val `tgw-peering`: "tgw-peering" = "tgw-peering"

  @inline def values = js.Array[TransitGatewayAttachmentResourceType](vpc, vpn, `direct-connect-gateway`, connect, peering, `tgw-peering`)
}

type TransitGatewayAttachmentState = "initiating" | "initiatingRequest" | "pendingAcceptance" | "rollingBack" | "pending" | "available" | "modifying" | "deleting" | "deleted" | "failed" | "rejected" | "rejecting" | "failing"
object TransitGatewayAttachmentState {
  val initiating: "initiating" = "initiating"
  val initiatingRequest: "initiatingRequest" = "initiatingRequest"
  val pendingAcceptance: "pendingAcceptance" = "pendingAcceptance"
  val rollingBack: "rollingBack" = "rollingBack"
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val modifying: "modifying" = "modifying"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"
  val failed: "failed" = "failed"
  val rejected: "rejected" = "rejected"
  val rejecting: "rejecting" = "rejecting"
  val failing: "failing" = "failing"

  @inline def values = js.Array[TransitGatewayAttachmentState](initiating, initiatingRequest, pendingAcceptance, rollingBack, pending, available, modifying, deleting, deleted, failed, rejected, rejecting, failing)
}

type TransitGatewayConnectPeerState = "pending" | "available" | "deleting" | "deleted"
object TransitGatewayConnectPeerState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[TransitGatewayConnectPeerState](pending, available, deleting, deleted)
}

type TransitGatewayMulitcastDomainAssociationState = "pendingAcceptance" | "associating" | "associated" | "disassociating" | "disassociated" | "rejected" | "failed"
object TransitGatewayMulitcastDomainAssociationState {
  val pendingAcceptance: "pendingAcceptance" = "pendingAcceptance"
  val associating: "associating" = "associating"
  val associated: "associated" = "associated"
  val disassociating: "disassociating" = "disassociating"
  val disassociated: "disassociated" = "disassociated"
  val rejected: "rejected" = "rejected"
  val failed: "failed" = "failed"

  @inline def values = js.Array[TransitGatewayMulitcastDomainAssociationState](pendingAcceptance, associating, associated, disassociating, disassociated, rejected, failed)
}

type TransitGatewayMulticastDomainState = "pending" | "available" | "deleting" | "deleted"
object TransitGatewayMulticastDomainState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[TransitGatewayMulticastDomainState](pending, available, deleting, deleted)
}

type TransitGatewayPrefixListReferenceState = "pending" | "available" | "modifying" | "deleting"
object TransitGatewayPrefixListReferenceState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val modifying: "modifying" = "modifying"
  val deleting: "deleting" = "deleting"

  @inline def values = js.Array[TransitGatewayPrefixListReferenceState](pending, available, modifying, deleting)
}

type TransitGatewayPropagationState = "enabling" | "enabled" | "disabling" | "disabled"
object TransitGatewayPropagationState {
  val enabling: "enabling" = "enabling"
  val enabled: "enabled" = "enabled"
  val disabling: "disabling" = "disabling"
  val disabled: "disabled" = "disabled"

  @inline def values = js.Array[TransitGatewayPropagationState](enabling, enabled, disabling, disabled)
}

type TransitGatewayRouteState = "pending" | "active" | "blackhole" | "deleting" | "deleted"
object TransitGatewayRouteState {
  val pending: "pending" = "pending"
  val active: "active" = "active"
  val blackhole: "blackhole" = "blackhole"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[TransitGatewayRouteState](pending, active, blackhole, deleting, deleted)
}

type TransitGatewayRouteTableState = "pending" | "available" | "deleting" | "deleted"
object TransitGatewayRouteTableState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[TransitGatewayRouteTableState](pending, available, deleting, deleted)
}

type TransitGatewayRouteType = "static" | "propagated"
object TransitGatewayRouteType {
  val static: "static" = "static"
  val propagated: "propagated" = "propagated"

  @inline def values = js.Array[TransitGatewayRouteType](static, propagated)
}

type TransitGatewayState = "pending" | "available" | "modifying" | "deleting" | "deleted"
object TransitGatewayState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val modifying: "modifying" = "modifying"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[TransitGatewayState](pending, available, modifying, deleting, deleted)
}

type TransportProtocol = "tcp" | "udp"
object TransportProtocol {
  val tcp: "tcp" = "tcp"
  val udp: "udp" = "udp"

  @inline def values = js.Array[TransportProtocol](tcp, udp)
}

type TunnelInsideIpVersion = "ipv4" | "ipv6"
object TunnelInsideIpVersion {
  val ipv4: "ipv4" = "ipv4"
  val ipv6: "ipv6" = "ipv6"

  @inline def values = js.Array[TunnelInsideIpVersion](ipv4, ipv6)
}

type UnlimitedSupportedInstanceFamily = "t2" | "t3" | "t3a" | "t4g"
object UnlimitedSupportedInstanceFamily {
  val t2: "t2" = "t2"
  val t3: "t3" = "t3"
  val t3a: "t3a" = "t3a"
  val t4g: "t4g" = "t4g"

  @inline def values = js.Array[UnlimitedSupportedInstanceFamily](t2, t3, t3a, t4g)
}

type UnsuccessfulInstanceCreditSpecificationErrorCode = "InvalidInstanceID.Malformed" | "InvalidInstanceID.NotFound" | "IncorrectInstanceState" | "InstanceCreditSpecification.NotSupported"
object UnsuccessfulInstanceCreditSpecificationErrorCode {
  val `InvalidInstanceID.Malformed`: "InvalidInstanceID.Malformed" = "InvalidInstanceID.Malformed"
  val `InvalidInstanceID.NotFound`: "InvalidInstanceID.NotFound" = "InvalidInstanceID.NotFound"
  val IncorrectInstanceState: "IncorrectInstanceState" = "IncorrectInstanceState"
  val `InstanceCreditSpecification.NotSupported`: "InstanceCreditSpecification.NotSupported" = "InstanceCreditSpecification.NotSupported"

  @inline def values = js.Array[UnsuccessfulInstanceCreditSpecificationErrorCode](`InvalidInstanceID.Malformed`, `InvalidInstanceID.NotFound`, IncorrectInstanceState, `InstanceCreditSpecification.NotSupported`)
}

type UsageClassType = "spot" | "on-demand"
object UsageClassType {
  val spot: "spot" = "spot"
  val `on-demand`: "on-demand" = "on-demand"

  @inline def values = js.Array[UsageClassType](spot, `on-demand`)
}

type VirtualizationType = "hvm" | "paravirtual"
object VirtualizationType {
  val hvm: "hvm" = "hvm"
  val paravirtual: "paravirtual" = "paravirtual"

  @inline def values = js.Array[VirtualizationType](hvm, paravirtual)
}

type VolumeAttachmentState = "attaching" | "attached" | "detaching" | "detached" | "busy"
object VolumeAttachmentState {
  val attaching: "attaching" = "attaching"
  val attached: "attached" = "attached"
  val detaching: "detaching" = "detaching"
  val detached: "detached" = "detached"
  val busy: "busy" = "busy"

  @inline def values = js.Array[VolumeAttachmentState](attaching, attached, detaching, detached, busy)
}

type VolumeAttributeName = "autoEnableIO" | "productCodes"
object VolumeAttributeName {
  val autoEnableIO: "autoEnableIO" = "autoEnableIO"
  val productCodes: "productCodes" = "productCodes"

  @inline def values = js.Array[VolumeAttributeName](autoEnableIO, productCodes)
}

type VolumeModificationState = "modifying" | "optimizing" | "completed" | "failed"
object VolumeModificationState {
  val modifying: "modifying" = "modifying"
  val optimizing: "optimizing" = "optimizing"
  val completed: "completed" = "completed"
  val failed: "failed" = "failed"

  @inline def values = js.Array[VolumeModificationState](modifying, optimizing, completed, failed)
}

type VolumeState = "creating" | "available" | "in-use" | "deleting" | "deleted" | "error"
object VolumeState {
  val creating: "creating" = "creating"
  val available: "available" = "available"
  val `in-use`: "in-use" = "in-use"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"
  val error: "error" = "error"

  @inline def values = js.Array[VolumeState](creating, available, `in-use`, deleting, deleted, error)
}

type VolumeStatusInfoStatus = "ok" | "impaired" | "insufficient-data"
object VolumeStatusInfoStatus {
  val ok: "ok" = "ok"
  val impaired: "impaired" = "impaired"
  val `insufficient-data`: "insufficient-data" = "insufficient-data"

  @inline def values = js.Array[VolumeStatusInfoStatus](ok, impaired, `insufficient-data`)
}

type VolumeStatusName = "io-enabled" | "io-performance"
object VolumeStatusName {
  val `io-enabled`: "io-enabled" = "io-enabled"
  val `io-performance`: "io-performance" = "io-performance"

  @inline def values = js.Array[VolumeStatusName](`io-enabled`, `io-performance`)
}

type VolumeType = "standard" | "io1" | "io2" | "gp2" | "sc1" | "st1" | "gp3"
object VolumeType {
  val standard: "standard" = "standard"
  val io1: "io1" = "io1"
  val io2: "io2" = "io2"
  val gp2: "gp2" = "gp2"
  val sc1: "sc1" = "sc1"
  val st1: "st1" = "st1"
  val gp3: "gp3" = "gp3"

  @inline def values = js.Array[VolumeType](standard, io1, io2, gp2, sc1, st1, gp3)
}

type VpcAttributeName = "enableDnsSupport" | "enableDnsHostnames"
object VpcAttributeName {
  val enableDnsSupport: "enableDnsSupport" = "enableDnsSupport"
  val enableDnsHostnames: "enableDnsHostnames" = "enableDnsHostnames"

  @inline def values = js.Array[VpcAttributeName](enableDnsSupport, enableDnsHostnames)
}

type VpcCidrBlockStateCode = "associating" | "associated" | "disassociating" | "disassociated" | "failing" | "failed"
object VpcCidrBlockStateCode {
  val associating: "associating" = "associating"
  val associated: "associated" = "associated"
  val disassociating: "disassociating" = "disassociating"
  val disassociated: "disassociated" = "disassociated"
  val failing: "failing" = "failing"
  val failed: "failed" = "failed"

  @inline def values = js.Array[VpcCidrBlockStateCode](associating, associated, disassociating, disassociated, failing, failed)
}

type VpcEndpointType = "Interface" | "Gateway" | "GatewayLoadBalancer"
object VpcEndpointType {
  val Interface: "Interface" = "Interface"
  val Gateway: "Gateway" = "Gateway"
  val GatewayLoadBalancer: "GatewayLoadBalancer" = "GatewayLoadBalancer"

  @inline def values = js.Array[VpcEndpointType](Interface, Gateway, GatewayLoadBalancer)
}

type VpcPeeringConnectionStateReasonCode = "initiating-request" | "pending-acceptance" | "active" | "deleted" | "rejected" | "failed" | "expired" | "provisioning" | "deleting"
object VpcPeeringConnectionStateReasonCode {
  val `initiating-request`: "initiating-request" = "initiating-request"
  val `pending-acceptance`: "pending-acceptance" = "pending-acceptance"
  val active: "active" = "active"
  val deleted: "deleted" = "deleted"
  val rejected: "rejected" = "rejected"
  val failed: "failed" = "failed"
  val expired: "expired" = "expired"
  val provisioning: "provisioning" = "provisioning"
  val deleting: "deleting" = "deleting"

  @inline def values = js.Array[VpcPeeringConnectionStateReasonCode](`initiating-request`, `pending-acceptance`, active, deleted, rejected, failed, expired, provisioning, deleting)
}

type VpcState = "pending" | "available"
object VpcState {
  val pending: "pending" = "pending"
  val available: "available" = "available"

  @inline def values = js.Array[VpcState](pending, available)
}

type VpcTenancy = "default"
object VpcTenancy {
  val default: "default" = "default"

  @inline def values = js.Array[VpcTenancy](default)
}

type VpnEcmpSupportValue = "enable" | "disable"
object VpnEcmpSupportValue {
  val enable: "enable" = "enable"
  val disable: "disable" = "disable"

  @inline def values = js.Array[VpnEcmpSupportValue](enable, disable)
}

type VpnProtocol = "openvpn"
object VpnProtocol {
  val openvpn: "openvpn" = "openvpn"

  @inline def values = js.Array[VpnProtocol](openvpn)
}

type VpnState = "pending" | "available" | "deleting" | "deleted"
object VpnState {
  val pending: "pending" = "pending"
  val available: "available" = "available"
  val deleting: "deleting" = "deleting"
  val deleted: "deleted" = "deleted"

  @inline def values = js.Array[VpnState](pending, available, deleting, deleted)
}

type VpnStaticRouteSource = "Static"
object VpnStaticRouteSource {
  val Static: "Static" = "Static"

  @inline def values = js.Array[VpnStaticRouteSource](Static)
}

type scope = "Availability Zone" | "Region"
object scope {
  val `Availability Zone`: "Availability Zone" = "Availability Zone"
  val Region: "Region" = "Region"

  @inline def values = js.Array[scope](`Availability Zone`, Region)
}
