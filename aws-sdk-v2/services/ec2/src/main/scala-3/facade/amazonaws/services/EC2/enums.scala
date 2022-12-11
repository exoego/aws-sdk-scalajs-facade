package facade.amazonaws.services.ec2

import scalajs.js

type AcceleratorManufacturer = "nvidia" | "amd" | "amazon-web-services" | "xilinx"
object AcceleratorManufacturer {
  inline val nvidia: "nvidia" = "nvidia"
  inline val amd: "amd" = "amd"
  inline val `amazon-web-services`: "amazon-web-services" = "amazon-web-services"
  inline val xilinx: "xilinx" = "xilinx"

  inline def values: js.Array[AcceleratorManufacturer] = js.Array(nvidia, amd, `amazon-web-services`, xilinx)
}

type AcceleratorName = "a100" | "v100" | "k80" | "t4" | "m60" | "radeon-pro-v520" | "vu9p" | "inferentia" | "k520"
object AcceleratorName {
  inline val a100: "a100" = "a100"
  inline val v100: "v100" = "v100"
  inline val k80: "k80" = "k80"
  inline val t4: "t4" = "t4"
  inline val m60: "m60" = "m60"
  inline val `radeon-pro-v520`: "radeon-pro-v520" = "radeon-pro-v520"
  inline val vu9p: "vu9p" = "vu9p"
  inline val inferentia: "inferentia" = "inferentia"
  inline val k520: "k520" = "k520"

  inline def values: js.Array[AcceleratorName] = js.Array(a100, v100, k80, t4, m60, `radeon-pro-v520`, vu9p, inferentia, k520)
}

type AcceleratorType = "gpu" | "fpga" | "inference"
object AcceleratorType {
  inline val gpu: "gpu" = "gpu"
  inline val fpga: "fpga" = "fpga"
  inline val inference: "inference" = "inference"

  inline def values: js.Array[AcceleratorType] = js.Array(gpu, fpga, inference)
}

type AccountAttributeName = "supported-platforms" | "default-vpc"
object AccountAttributeName {
  inline val `supported-platforms`: "supported-platforms" = "supported-platforms"
  inline val `default-vpc`: "default-vpc" = "default-vpc"

  inline def values: js.Array[AccountAttributeName] = js.Array(`supported-platforms`, `default-vpc`)
}

type ActivityStatus = "error" | "pending_fulfillment" | "pending_termination" | "fulfilled"
object ActivityStatus {
  inline val error: "error" = "error"
  inline val pending_fulfillment: "pending_fulfillment" = "pending_fulfillment"
  inline val pending_termination: "pending_termination" = "pending_termination"
  inline val fulfilled: "fulfilled" = "fulfilled"

  inline def values: js.Array[ActivityStatus] = js.Array(error, pending_fulfillment, pending_termination, fulfilled)
}

type AddressAttributeName = "domain-name"
object AddressAttributeName {
  inline val `domain-name`: "domain-name" = "domain-name"

  inline def values: js.Array[AddressAttributeName] = js.Array(`domain-name`)
}

type AddressFamily = "ipv4" | "ipv6"
object AddressFamily {
  inline val ipv4: "ipv4" = "ipv4"
  inline val ipv6: "ipv6" = "ipv6"

  inline def values: js.Array[AddressFamily] = js.Array(ipv4, ipv6)
}

type AddressTransferStatus = "pending" | "disabled" | "accepted"
object AddressTransferStatus {
  inline val pending: "pending" = "pending"
  inline val disabled: "disabled" = "disabled"
  inline val accepted: "accepted" = "accepted"

  inline def values: js.Array[AddressTransferStatus] = js.Array(pending, disabled, accepted)
}

type Affinity = "default" | "host"
object Affinity {
  inline val default: "default" = "default"
  inline val host: "host" = "host"

  inline def values: js.Array[Affinity] = js.Array(default, host)
}

type AllocationState = "available" | "under-assessment" | "permanent-failure" | "released" | "released-permanent-failure" | "pending"
object AllocationState {
  inline val available: "available" = "available"
  inline val `under-assessment`: "under-assessment" = "under-assessment"
  inline val `permanent-failure`: "permanent-failure" = "permanent-failure"
  inline val released: "released" = "released"
  inline val `released-permanent-failure`: "released-permanent-failure" = "released-permanent-failure"
  inline val pending: "pending" = "pending"

  inline def values: js.Array[AllocationState] = js.Array(available, `under-assessment`, `permanent-failure`, released, `released-permanent-failure`, pending)
}

type AllocationStrategy = "lowestPrice" | "diversified" | "capacityOptimized" | "capacityOptimizedPrioritized" | "priceCapacityOptimized"
object AllocationStrategy {
  inline val lowestPrice: "lowestPrice" = "lowestPrice"
  inline val diversified: "diversified" = "diversified"
  inline val capacityOptimized: "capacityOptimized" = "capacityOptimized"
  inline val capacityOptimizedPrioritized: "capacityOptimizedPrioritized" = "capacityOptimizedPrioritized"
  inline val priceCapacityOptimized: "priceCapacityOptimized" = "priceCapacityOptimized"

  inline def values: js.Array[AllocationStrategy] = js.Array(lowestPrice, diversified, capacityOptimized, capacityOptimizedPrioritized, priceCapacityOptimized)
}

type AllocationType = "used"
object AllocationType {
  inline val used: "used" = "used"

  inline def values: js.Array[AllocationType] = js.Array(used)
}

type AllowsMultipleInstanceTypes = "on" | "off"
object AllowsMultipleInstanceTypes {
  inline val on: "on" = "on"
  inline val off: "off" = "off"

  inline def values: js.Array[AllowsMultipleInstanceTypes] = js.Array(on, off)
}

type AnalysisStatus = "running" | "succeeded" | "failed"
object AnalysisStatus {
  inline val running: "running" = "running"
  inline val succeeded: "succeeded" = "succeeded"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[AnalysisStatus] = js.Array(running, succeeded, failed)
}

type ApplianceModeSupportValue = "enable" | "disable"
object ApplianceModeSupportValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[ApplianceModeSupportValue] = js.Array(enable, disable)
}

type ArchitectureType = "i386" | "x86_64" | "arm64" | "x86_64_mac" | "arm64_mac"
object ArchitectureType {
  inline val i386: "i386" = "i386"
  inline val x86_64: "x86_64" = "x86_64"
  inline val arm64: "arm64" = "arm64"
  inline val x86_64_mac: "x86_64_mac" = "x86_64_mac"
  inline val arm64_mac: "arm64_mac" = "arm64_mac"

  inline def values: js.Array[ArchitectureType] = js.Array(i386, x86_64, arm64, x86_64_mac, arm64_mac)
}

type ArchitectureValues = "i386" | "x86_64" | "arm64" | "x86_64_mac" | "arm64_mac"
object ArchitectureValues {
  inline val i386: "i386" = "i386"
  inline val x86_64: "x86_64" = "x86_64"
  inline val arm64: "arm64" = "arm64"
  inline val x86_64_mac: "x86_64_mac" = "x86_64_mac"
  inline val arm64_mac: "arm64_mac" = "arm64_mac"

  inline def values: js.Array[ArchitectureValues] = js.Array(i386, x86_64, arm64, x86_64_mac, arm64_mac)
}

type AssociatedNetworkType = "vpc"
object AssociatedNetworkType {
  inline val vpc: "vpc" = "vpc"

  inline def values: js.Array[AssociatedNetworkType] = js.Array(vpc)
}

type AssociationStatusCode = "associating" | "associated" | "association-failed" | "disassociating" | "disassociated"
object AssociationStatusCode {
  inline val associating: "associating" = "associating"
  inline val associated: "associated" = "associated"
  inline val `association-failed`: "association-failed" = "association-failed"
  inline val disassociating: "disassociating" = "disassociating"
  inline val disassociated: "disassociated" = "disassociated"

  inline def values: js.Array[AssociationStatusCode] = js.Array(associating, associated, `association-failed`, disassociating, disassociated)
}

type AttachmentStatus = "attaching" | "attached" | "detaching" | "detached"
object AttachmentStatus {
  inline val attaching: "attaching" = "attaching"
  inline val attached: "attached" = "attached"
  inline val detaching: "detaching" = "detaching"
  inline val detached: "detached" = "detached"

  inline def values: js.Array[AttachmentStatus] = js.Array(attaching, attached, detaching, detached)
}

type AutoAcceptSharedAssociationsValue = "enable" | "disable"
object AutoAcceptSharedAssociationsValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[AutoAcceptSharedAssociationsValue] = js.Array(enable, disable)
}

type AutoAcceptSharedAttachmentsValue = "enable" | "disable"
object AutoAcceptSharedAttachmentsValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[AutoAcceptSharedAttachmentsValue] = js.Array(enable, disable)
}

type AutoPlacement = "on" | "off"
object AutoPlacement {
  inline val on: "on" = "on"
  inline val off: "off" = "off"

  inline def values: js.Array[AutoPlacement] = js.Array(on, off)
}

type AvailabilityZoneOptInStatus = "opt-in-not-required" | "opted-in" | "not-opted-in"
object AvailabilityZoneOptInStatus {
  inline val `opt-in-not-required`: "opt-in-not-required" = "opt-in-not-required"
  inline val `opted-in`: "opted-in" = "opted-in"
  inline val `not-opted-in`: "not-opted-in" = "not-opted-in"

  inline def values: js.Array[AvailabilityZoneOptInStatus] = js.Array(`opt-in-not-required`, `opted-in`, `not-opted-in`)
}

type AvailabilityZoneState = "available" | "information" | "impaired" | "unavailable"
object AvailabilityZoneState {
  inline val available: "available" = "available"
  inline val information: "information" = "information"
  inline val impaired: "impaired" = "impaired"
  inline val unavailable: "unavailable" = "unavailable"

  inline def values: js.Array[AvailabilityZoneState] = js.Array(available, information, impaired, unavailable)
}

type BareMetal = "included" | "required" | "excluded"
object BareMetal {
  inline val included: "included" = "included"
  inline val required: "required" = "required"
  inline val excluded: "excluded" = "excluded"

  inline def values: js.Array[BareMetal] = js.Array(included, required, excluded)
}

type BatchState = "submitted" | "active" | "cancelled" | "failed" | "cancelled_running" | "cancelled_terminating" | "modifying"
object BatchState {
  inline val submitted: "submitted" = "submitted"
  inline val active: "active" = "active"
  inline val cancelled: "cancelled" = "cancelled"
  inline val failed: "failed" = "failed"
  inline val cancelled_running: "cancelled_running" = "cancelled_running"
  inline val cancelled_terminating: "cancelled_terminating" = "cancelled_terminating"
  inline val modifying: "modifying" = "modifying"

  inline def values: js.Array[BatchState] = js.Array(submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying)
}

type BgpStatus = "up" | "down"
object BgpStatus {
  inline val up: "up" = "up"
  inline val down: "down" = "down"

  inline def values: js.Array[BgpStatus] = js.Array(up, down)
}

type BootModeType = "legacy-bios" | "uefi"
object BootModeType {
  inline val `legacy-bios`: "legacy-bios" = "legacy-bios"
  inline val uefi: "uefi" = "uefi"

  inline def values: js.Array[BootModeType] = js.Array(`legacy-bios`, uefi)
}

type BootModeValues = "legacy-bios" | "uefi"
object BootModeValues {
  inline val `legacy-bios`: "legacy-bios" = "legacy-bios"
  inline val uefi: "uefi" = "uefi"

  inline def values: js.Array[BootModeValues] = js.Array(`legacy-bios`, uefi)
}

type BundleTaskState = "pending" | "waiting-for-shutdown" | "bundling" | "storing" | "cancelling" | "complete" | "failed"
object BundleTaskState {
  inline val pending: "pending" = "pending"
  inline val `waiting-for-shutdown`: "waiting-for-shutdown" = "waiting-for-shutdown"
  inline val bundling: "bundling" = "bundling"
  inline val storing: "storing" = "storing"
  inline val cancelling: "cancelling" = "cancelling"
  inline val complete: "complete" = "complete"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[BundleTaskState] = js.Array(pending, `waiting-for-shutdown`, bundling, storing, cancelling, complete, failed)
}

type BurstablePerformance = "included" | "required" | "excluded"
object BurstablePerformance {
  inline val included: "included" = "included"
  inline val required: "required" = "required"
  inline val excluded: "excluded" = "excluded"

  inline def values: js.Array[BurstablePerformance] = js.Array(included, required, excluded)
}

type ByoipCidrState = "advertised" | "deprovisioned" | "failed-deprovision" | "failed-provision" | "pending-deprovision" | "pending-provision" | "provisioned" | "provisioned-not-publicly-advertisable"
object ByoipCidrState {
  inline val advertised: "advertised" = "advertised"
  inline val deprovisioned: "deprovisioned" = "deprovisioned"
  inline val `failed-deprovision`: "failed-deprovision" = "failed-deprovision"
  inline val `failed-provision`: "failed-provision" = "failed-provision"
  inline val `pending-deprovision`: "pending-deprovision" = "pending-deprovision"
  inline val `pending-provision`: "pending-provision" = "pending-provision"
  inline val provisioned: "provisioned" = "provisioned"
  inline val `provisioned-not-publicly-advertisable`: "provisioned-not-publicly-advertisable" = "provisioned-not-publicly-advertisable"

  inline def values: js.Array[ByoipCidrState] = js.Array(
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
  inline val fleetRequestIdDoesNotExist: "fleetRequestIdDoesNotExist" = "fleetRequestIdDoesNotExist"
  inline val fleetRequestIdMalformed: "fleetRequestIdMalformed" = "fleetRequestIdMalformed"
  inline val fleetRequestNotInCancellableState: "fleetRequestNotInCancellableState" = "fleetRequestNotInCancellableState"
  inline val unexpectedError: "unexpectedError" = "unexpectedError"

  inline def values: js.Array[CancelBatchErrorCode] = js.Array(fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError)
}

type CancelSpotInstanceRequestState = "active" | "open" | "closed" | "cancelled" | "completed"
object CancelSpotInstanceRequestState {
  inline val active: "active" = "active"
  inline val open: "open" = "open"
  inline val closed: "closed" = "closed"
  inline val cancelled: "cancelled" = "cancelled"
  inline val completed: "completed" = "completed"

  inline def values: js.Array[CancelSpotInstanceRequestState] = js.Array(active, open, closed, cancelled, completed)
}

type CapacityReservationFleetState = "submitted" | "modifying" | "active" | "partially_fulfilled" | "expiring" | "expired" | "cancelling" | "cancelled" | "failed"
object CapacityReservationFleetState {
  inline val submitted: "submitted" = "submitted"
  inline val modifying: "modifying" = "modifying"
  inline val active: "active" = "active"
  inline val partially_fulfilled: "partially_fulfilled" = "partially_fulfilled"
  inline val expiring: "expiring" = "expiring"
  inline val expired: "expired" = "expired"
  inline val cancelling: "cancelling" = "cancelling"
  inline val cancelled: "cancelled" = "cancelled"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[CapacityReservationFleetState] = js.Array(submitted, modifying, active, partially_fulfilled, expiring, expired, cancelling, cancelled, failed)
}

type CapacityReservationInstancePlatform = "Linux/UNIX" | "Red Hat Enterprise Linux" | "SUSE Linux" | "Windows" | "Windows with SQL Server" | "Windows with SQL Server Enterprise" | "Windows with SQL Server Standard" | "Windows with SQL Server Web" | "Linux with SQL Server Standard" | "Linux with SQL Server Web" | "Linux with SQL Server Enterprise" | "RHEL with SQL Server Standard" | "RHEL with SQL Server Enterprise" | "RHEL with SQL Server Web" | "RHEL with HA" | "RHEL with HA and SQL Server Standard" | "RHEL with HA and SQL Server Enterprise"
object CapacityReservationInstancePlatform {
  inline val `Linux/UNIX`: "Linux/UNIX" = "Linux/UNIX"
  inline val `Red Hat Enterprise Linux`: "Red Hat Enterprise Linux" = "Red Hat Enterprise Linux"
  inline val `SUSE Linux`: "SUSE Linux" = "SUSE Linux"
  inline val Windows: "Windows" = "Windows"
  inline val `Windows with SQL Server`: "Windows with SQL Server" = "Windows with SQL Server"
  inline val `Windows with SQL Server Enterprise`: "Windows with SQL Server Enterprise" = "Windows with SQL Server Enterprise"
  inline val `Windows with SQL Server Standard`: "Windows with SQL Server Standard" = "Windows with SQL Server Standard"
  inline val `Windows with SQL Server Web`: "Windows with SQL Server Web" = "Windows with SQL Server Web"
  inline val `Linux with SQL Server Standard`: "Linux with SQL Server Standard" = "Linux with SQL Server Standard"
  inline val `Linux with SQL Server Web`: "Linux with SQL Server Web" = "Linux with SQL Server Web"
  inline val `Linux with SQL Server Enterprise`: "Linux with SQL Server Enterprise" = "Linux with SQL Server Enterprise"
  inline val `RHEL with SQL Server Standard`: "RHEL with SQL Server Standard" = "RHEL with SQL Server Standard"
  inline val `RHEL with SQL Server Enterprise`: "RHEL with SQL Server Enterprise" = "RHEL with SQL Server Enterprise"
  inline val `RHEL with SQL Server Web`: "RHEL with SQL Server Web" = "RHEL with SQL Server Web"
  inline val `RHEL with HA`: "RHEL with HA" = "RHEL with HA"
  inline val `RHEL with HA and SQL Server Standard`: "RHEL with HA and SQL Server Standard" = "RHEL with HA and SQL Server Standard"
  inline val `RHEL with HA and SQL Server Enterprise`: "RHEL with HA and SQL Server Enterprise" = "RHEL with HA and SQL Server Enterprise"

  inline def values: js.Array[CapacityReservationInstancePlatform] = js.Array(
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

type CapacityReservationPreference = "open" | "none"
object CapacityReservationPreference {
  inline val open: "open" = "open"
  inline val none: "none" = "none"

  inline def values: js.Array[CapacityReservationPreference] = js.Array(open, none)
}

type CapacityReservationState = "active" | "expired" | "cancelled" | "pending" | "failed"
object CapacityReservationState {
  inline val active: "active" = "active"
  inline val expired: "expired" = "expired"
  inline val cancelled: "cancelled" = "cancelled"
  inline val pending: "pending" = "pending"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[CapacityReservationState] = js.Array(active, expired, cancelled, pending, failed)
}

type CapacityReservationTenancy = "default" | "dedicated"
object CapacityReservationTenancy {
  inline val default: "default" = "default"
  inline val dedicated: "dedicated" = "dedicated"

  inline def values: js.Array[CapacityReservationTenancy] = js.Array(default, dedicated)
}

type CarrierGatewayState = "pending" | "available" | "deleting" | "deleted"
object CarrierGatewayState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[CarrierGatewayState] = js.Array(pending, available, deleting, deleted)
}

type ClientCertificateRevocationListStatusCode = "pending" | "active"
object ClientCertificateRevocationListStatusCode {
  inline val pending: "pending" = "pending"
  inline val active: "active" = "active"

  inline def values: js.Array[ClientCertificateRevocationListStatusCode] = js.Array(pending, active)
}

type ClientVpnAuthenticationType = "certificate-authentication" | "directory-service-authentication" | "federated-authentication"
object ClientVpnAuthenticationType {
  inline val `certificate-authentication`: "certificate-authentication" = "certificate-authentication"
  inline val `directory-service-authentication`: "directory-service-authentication" = "directory-service-authentication"
  inline val `federated-authentication`: "federated-authentication" = "federated-authentication"

  inline def values: js.Array[ClientVpnAuthenticationType] = js.Array(`certificate-authentication`, `directory-service-authentication`, `federated-authentication`)
}

type ClientVpnAuthorizationRuleStatusCode = "authorizing" | "active" | "failed" | "revoking"
object ClientVpnAuthorizationRuleStatusCode {
  inline val authorizing: "authorizing" = "authorizing"
  inline val active: "active" = "active"
  inline val failed: "failed" = "failed"
  inline val revoking: "revoking" = "revoking"

  inline def values: js.Array[ClientVpnAuthorizationRuleStatusCode] = js.Array(authorizing, active, failed, revoking)
}

type ClientVpnConnectionStatusCode = "active" | "failed-to-terminate" | "terminating" | "terminated"
object ClientVpnConnectionStatusCode {
  inline val active: "active" = "active"
  inline val `failed-to-terminate`: "failed-to-terminate" = "failed-to-terminate"
  inline val terminating: "terminating" = "terminating"
  inline val terminated: "terminated" = "terminated"

  inline def values: js.Array[ClientVpnConnectionStatusCode] = js.Array(active, `failed-to-terminate`, terminating, terminated)
}

type ClientVpnEndpointAttributeStatusCode = "applying" | "applied"
object ClientVpnEndpointAttributeStatusCode {
  inline val applying: "applying" = "applying"
  inline val applied: "applied" = "applied"

  inline def values: js.Array[ClientVpnEndpointAttributeStatusCode] = js.Array(applying, applied)
}

type ClientVpnEndpointStatusCode = "pending-associate" | "available" | "deleting" | "deleted"
object ClientVpnEndpointStatusCode {
  inline val `pending-associate`: "pending-associate" = "pending-associate"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[ClientVpnEndpointStatusCode] = js.Array(`pending-associate`, available, deleting, deleted)
}

type ClientVpnRouteStatusCode = "creating" | "active" | "failed" | "deleting"
object ClientVpnRouteStatusCode {
  inline val creating: "creating" = "creating"
  inline val active: "active" = "active"
  inline val failed: "failed" = "failed"
  inline val deleting: "deleting" = "deleting"

  inline def values: js.Array[ClientVpnRouteStatusCode] = js.Array(creating, active, failed, deleting)
}

type ConnectionNotificationState = "Enabled" | "Disabled"
object ConnectionNotificationState {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ConnectionNotificationState] = js.Array(Enabled, Disabled)
}

type ConnectionNotificationType = "Topic"
object ConnectionNotificationType {
  inline val Topic: "Topic" = "Topic"

  inline def values: js.Array[ConnectionNotificationType] = js.Array(Topic)
}

type ConnectivityType = "private" | "public"
object ConnectivityType {
  inline val `private`: "private" = "private"
  inline val `public`: "public" = "public"

  inline def values: js.Array[ConnectivityType] = js.Array(`private`, `public`)
}

type ContainerFormat = "ova"
object ContainerFormat {
  inline val ova: "ova" = "ova"

  inline def values: js.Array[ContainerFormat] = js.Array(ova)
}

type ConversionTaskState = "active" | "cancelling" | "cancelled" | "completed"
object ConversionTaskState {
  inline val active: "active" = "active"
  inline val cancelling: "cancelling" = "cancelling"
  inline val cancelled: "cancelled" = "cancelled"
  inline val completed: "completed" = "completed"

  inline def values: js.Array[ConversionTaskState] = js.Array(active, cancelling, cancelled, completed)
}

type CopyTagsFromSource = "volume"
object CopyTagsFromSource {
  inline val volume: "volume" = "volume"

  inline def values: js.Array[CopyTagsFromSource] = js.Array(volume)
}

type CpuManufacturer = "intel" | "amd" | "amazon-web-services"
object CpuManufacturer {
  inline val intel: "intel" = "intel"
  inline val amd: "amd" = "amd"
  inline val `amazon-web-services`: "amazon-web-services" = "amazon-web-services"

  inline def values: js.Array[CpuManufacturer] = js.Array(intel, amd, `amazon-web-services`)
}

type CurrencyCodeValues = "USD"
object CurrencyCodeValues {
  inline val USD: "USD" = "USD"

  inline def values: js.Array[CurrencyCodeValues] = js.Array(USD)
}

type DatafeedSubscriptionState = "Active" | "Inactive"
object DatafeedSubscriptionState {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[DatafeedSubscriptionState] = js.Array(Active, Inactive)
}

type DefaultRouteTableAssociationValue = "enable" | "disable"
object DefaultRouteTableAssociationValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[DefaultRouteTableAssociationValue] = js.Array(enable, disable)
}

type DefaultRouteTablePropagationValue = "enable" | "disable"
object DefaultRouteTablePropagationValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[DefaultRouteTablePropagationValue] = js.Array(enable, disable)
}

type DefaultTargetCapacityType = "spot" | "on-demand"
object DefaultTargetCapacityType {
  inline val spot: "spot" = "spot"
  inline val `on-demand`: "on-demand" = "on-demand"

  inline def values: js.Array[DefaultTargetCapacityType] = js.Array(spot, `on-demand`)
}

type DeleteFleetErrorCode = "fleetIdDoesNotExist" | "fleetIdMalformed" | "fleetNotInDeletableState" | "unexpectedError"
object DeleteFleetErrorCode {
  inline val fleetIdDoesNotExist: "fleetIdDoesNotExist" = "fleetIdDoesNotExist"
  inline val fleetIdMalformed: "fleetIdMalformed" = "fleetIdMalformed"
  inline val fleetNotInDeletableState: "fleetNotInDeletableState" = "fleetNotInDeletableState"
  inline val unexpectedError: "unexpectedError" = "unexpectedError"

  inline def values: js.Array[DeleteFleetErrorCode] = js.Array(fleetIdDoesNotExist, fleetIdMalformed, fleetNotInDeletableState, unexpectedError)
}

type DeleteQueuedReservedInstancesErrorCode = "reserved-instances-id-invalid" | "reserved-instances-not-in-queued-state" | "unexpected-error"
object DeleteQueuedReservedInstancesErrorCode {
  inline val `reserved-instances-id-invalid`: "reserved-instances-id-invalid" = "reserved-instances-id-invalid"
  inline val `reserved-instances-not-in-queued-state`: "reserved-instances-not-in-queued-state" = "reserved-instances-not-in-queued-state"
  inline val `unexpected-error`: "unexpected-error" = "unexpected-error"

  inline def values: js.Array[DeleteQueuedReservedInstancesErrorCode] = js.Array(`reserved-instances-id-invalid`, `reserved-instances-not-in-queued-state`, `unexpected-error`)
}

type DestinationFileFormat = "plain-text" | "parquet"
object DestinationFileFormat {
  inline val `plain-text`: "plain-text" = "plain-text"
  inline val parquet: "parquet" = "parquet"

  inline def values: js.Array[DestinationFileFormat] = js.Array(`plain-text`, parquet)
}

type DeviceTrustProviderType = "jamf" | "crowdstrike"
object DeviceTrustProviderType {
  inline val jamf: "jamf" = "jamf"
  inline val crowdstrike: "crowdstrike" = "crowdstrike"

  inline def values: js.Array[DeviceTrustProviderType] = js.Array(jamf, crowdstrike)
}

type DeviceType = "ebs" | "instance-store"
object DeviceType {
  inline val ebs: "ebs" = "ebs"
  inline val `instance-store`: "instance-store" = "instance-store"

  inline def values: js.Array[DeviceType] = js.Array(ebs, `instance-store`)
}

type DiskImageFormat = "VMDK" | "RAW" | "VHD"
object DiskImageFormat {
  inline val VMDK: "VMDK" = "VMDK"
  inline val RAW: "RAW" = "RAW"
  inline val VHD: "VHD" = "VHD"

  inline def values: js.Array[DiskImageFormat] = js.Array(VMDK, RAW, VHD)
}

type DiskType = "hdd" | "ssd"
object DiskType {
  inline val hdd: "hdd" = "hdd"
  inline val ssd: "ssd" = "ssd"

  inline def values: js.Array[DiskType] = js.Array(hdd, ssd)
}

type DnsNameState = "pendingVerification" | "verified" | "failed"
object DnsNameState {
  inline val pendingVerification: "pendingVerification" = "pendingVerification"
  inline val verified: "verified" = "verified"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[DnsNameState] = js.Array(pendingVerification, verified, failed)
}

type DnsRecordIpType = "ipv4" | "dualstack" | "ipv6" | "service-defined"
object DnsRecordIpType {
  inline val ipv4: "ipv4" = "ipv4"
  inline val dualstack: "dualstack" = "dualstack"
  inline val ipv6: "ipv6" = "ipv6"
  inline val `service-defined`: "service-defined" = "service-defined"

  inline def values: js.Array[DnsRecordIpType] = js.Array(ipv4, dualstack, ipv6, `service-defined`)
}

type DnsSupportValue = "enable" | "disable"
object DnsSupportValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[DnsSupportValue] = js.Array(enable, disable)
}

type DomainType = "vpc" | "standard"
object DomainType {
  inline val vpc: "vpc" = "vpc"
  inline val standard: "standard" = "standard"

  inline def values: js.Array[DomainType] = js.Array(vpc, standard)
}

type DynamicRoutingValue = "enable" | "disable"
object DynamicRoutingValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[DynamicRoutingValue] = js.Array(enable, disable)
}

type EbsEncryptionSupport = "unsupported" | "supported"
object EbsEncryptionSupport {
  inline val unsupported: "unsupported" = "unsupported"
  inline val supported: "supported" = "supported"

  inline def values: js.Array[EbsEncryptionSupport] = js.Array(unsupported, supported)
}

type EbsNvmeSupport = "unsupported" | "supported" | "required"
object EbsNvmeSupport {
  inline val unsupported: "unsupported" = "unsupported"
  inline val supported: "supported" = "supported"
  inline val required: "required" = "required"

  inline def values: js.Array[EbsNvmeSupport] = js.Array(unsupported, supported, required)
}

type EbsOptimizedSupport = "unsupported" | "supported" | "default"
object EbsOptimizedSupport {
  inline val unsupported: "unsupported" = "unsupported"
  inline val supported: "supported" = "supported"
  inline val default: "default" = "default"

  inline def values: js.Array[EbsOptimizedSupport] = js.Array(unsupported, supported, default)
}

type ElasticGpuState = "ATTACHED"
object ElasticGpuState {
  inline val ATTACHED: "ATTACHED" = "ATTACHED"

  inline def values: js.Array[ElasticGpuState] = js.Array(ATTACHED)
}

type ElasticGpuStatus = "OK" | "IMPAIRED"
object ElasticGpuStatus {
  inline val OK: "OK" = "OK"
  inline val IMPAIRED: "IMPAIRED" = "IMPAIRED"

  inline def values: js.Array[ElasticGpuStatus] = js.Array(OK, IMPAIRED)
}

type EnaSupport = "unsupported" | "supported" | "required"
object EnaSupport {
  inline val unsupported: "unsupported" = "unsupported"
  inline val supported: "supported" = "supported"
  inline val required: "required" = "required"

  inline def values: js.Array[EnaSupport] = js.Array(unsupported, supported, required)
}

type EndDateType = "unlimited" | "limited"
object EndDateType {
  inline val unlimited: "unlimited" = "unlimited"
  inline val limited: "limited" = "limited"

  inline def values: js.Array[EndDateType] = js.Array(unlimited, limited)
}

type EphemeralNvmeSupport = "unsupported" | "supported" | "required"
object EphemeralNvmeSupport {
  inline val unsupported: "unsupported" = "unsupported"
  inline val supported: "supported" = "supported"
  inline val required: "required" = "required"

  inline def values: js.Array[EphemeralNvmeSupport] = js.Array(unsupported, supported, required)
}

type EventCode = "instance-reboot" | "system-reboot" | "system-maintenance" | "instance-retirement" | "instance-stop"
object EventCode {
  inline val `instance-reboot`: "instance-reboot" = "instance-reboot"
  inline val `system-reboot`: "system-reboot" = "system-reboot"
  inline val `system-maintenance`: "system-maintenance" = "system-maintenance"
  inline val `instance-retirement`: "instance-retirement" = "instance-retirement"
  inline val `instance-stop`: "instance-stop" = "instance-stop"

  inline def values: js.Array[EventCode] = js.Array(`instance-reboot`, `system-reboot`, `system-maintenance`, `instance-retirement`, `instance-stop`)
}

type EventType = "instanceChange" | "fleetRequestChange" | "error" | "information"
object EventType {
  inline val instanceChange: "instanceChange" = "instanceChange"
  inline val fleetRequestChange: "fleetRequestChange" = "fleetRequestChange"
  inline val error: "error" = "error"
  inline val information: "information" = "information"

  inline def values: js.Array[EventType] = js.Array(instanceChange, fleetRequestChange, error, information)
}

type ExcessCapacityTerminationPolicy = "noTermination" | "default"
object ExcessCapacityTerminationPolicy {
  inline val noTermination: "noTermination" = "noTermination"
  inline val default: "default" = "default"

  inline def values: js.Array[ExcessCapacityTerminationPolicy] = js.Array(noTermination, default)
}

type ExportEnvironment = "citrix" | "vmware" | "microsoft"
object ExportEnvironment {
  inline val citrix: "citrix" = "citrix"
  inline val vmware: "vmware" = "vmware"
  inline val microsoft: "microsoft" = "microsoft"

  inline def values: js.Array[ExportEnvironment] = js.Array(citrix, vmware, microsoft)
}

type ExportTaskState = "active" | "cancelling" | "cancelled" | "completed"
object ExportTaskState {
  inline val active: "active" = "active"
  inline val cancelling: "cancelling" = "cancelling"
  inline val cancelled: "cancelled" = "cancelled"
  inline val completed: "completed" = "completed"

  inline def values: js.Array[ExportTaskState] = js.Array(active, cancelling, cancelled, completed)
}

type FastLaunchResourceType = "snapshot"
object FastLaunchResourceType {
  inline val snapshot: "snapshot" = "snapshot"

  inline def values: js.Array[FastLaunchResourceType] = js.Array(snapshot)
}

type FastLaunchStateCode = "enabling" | "enabling-failed" | "enabled" | "enabled-failed" | "disabling" | "disabling-failed"
object FastLaunchStateCode {
  inline val enabling: "enabling" = "enabling"
  inline val `enabling-failed`: "enabling-failed" = "enabling-failed"
  inline val enabled: "enabled" = "enabled"
  inline val `enabled-failed`: "enabled-failed" = "enabled-failed"
  inline val disabling: "disabling" = "disabling"
  inline val `disabling-failed`: "disabling-failed" = "disabling-failed"

  inline def values: js.Array[FastLaunchStateCode] = js.Array(enabling, `enabling-failed`, enabled, `enabled-failed`, disabling, `disabling-failed`)
}

type FastSnapshotRestoreStateCode = "enabling" | "optimizing" | "enabled" | "disabling" | "disabled"
object FastSnapshotRestoreStateCode {
  inline val enabling: "enabling" = "enabling"
  inline val optimizing: "optimizing" = "optimizing"
  inline val enabled: "enabled" = "enabled"
  inline val disabling: "disabling" = "disabling"
  inline val disabled: "disabled" = "disabled"

  inline def values: js.Array[FastSnapshotRestoreStateCode] = js.Array(enabling, optimizing, enabled, disabling, disabled)
}

type FindingsFound = "true" | "false" | "unknown"
object FindingsFound {
  inline val `true`: "true" = "true"
  inline val `false`: "false" = "false"
  inline val unknown: "unknown" = "unknown"

  inline def values: js.Array[FindingsFound] = js.Array(`true`, `false`, unknown)
}

type FleetActivityStatus = "error" | "pending_fulfillment" | "pending_termination" | "fulfilled"
object FleetActivityStatus {
  inline val error: "error" = "error"
  inline val pending_fulfillment: "pending_fulfillment" = "pending_fulfillment"
  inline val pending_termination: "pending_termination" = "pending_termination"
  inline val fulfilled: "fulfilled" = "fulfilled"

  inline def values: js.Array[FleetActivityStatus] = js.Array(error, pending_fulfillment, pending_termination, fulfilled)
}

type FleetCapacityReservationTenancy = "default"
object FleetCapacityReservationTenancy {
  inline val default: "default" = "default"

  inline def values: js.Array[FleetCapacityReservationTenancy] = js.Array(default)
}

type FleetCapacityReservationUsageStrategy = "use-capacity-reservations-first"
object FleetCapacityReservationUsageStrategy {
  inline val `use-capacity-reservations-first`: "use-capacity-reservations-first" = "use-capacity-reservations-first"

  inline def values: js.Array[FleetCapacityReservationUsageStrategy] = js.Array(`use-capacity-reservations-first`)
}

type FleetEventType = "instance-change" | "fleet-change" | "service-error"
object FleetEventType {
  inline val `instance-change`: "instance-change" = "instance-change"
  inline val `fleet-change`: "fleet-change" = "fleet-change"
  inline val `service-error`: "service-error" = "service-error"

  inline def values: js.Array[FleetEventType] = js.Array(`instance-change`, `fleet-change`, `service-error`)
}

type FleetExcessCapacityTerminationPolicy = "no-termination" | "termination"
object FleetExcessCapacityTerminationPolicy {
  inline val `no-termination`: "no-termination" = "no-termination"
  inline val termination: "termination" = "termination"

  inline def values: js.Array[FleetExcessCapacityTerminationPolicy] = js.Array(`no-termination`, termination)
}

type FleetInstanceMatchCriteria = "open"
object FleetInstanceMatchCriteria {
  inline val open: "open" = "open"

  inline def values: js.Array[FleetInstanceMatchCriteria] = js.Array(open)
}

type FleetOnDemandAllocationStrategy = "lowest-price" | "prioritized"
object FleetOnDemandAllocationStrategy {
  inline val `lowest-price`: "lowest-price" = "lowest-price"
  inline val prioritized: "prioritized" = "prioritized"

  inline def values: js.Array[FleetOnDemandAllocationStrategy] = js.Array(`lowest-price`, prioritized)
}

type FleetReplacementStrategy = "launch" | "launch-before-terminate"
object FleetReplacementStrategy {
  inline val launch: "launch" = "launch"
  inline val `launch-before-terminate`: "launch-before-terminate" = "launch-before-terminate"

  inline def values: js.Array[FleetReplacementStrategy] = js.Array(launch, `launch-before-terminate`)
}

type FleetStateCode = "submitted" | "active" | "deleted" | "failed" | "deleted_running" | "deleted_terminating" | "modifying"
object FleetStateCode {
  inline val submitted: "submitted" = "submitted"
  inline val active: "active" = "active"
  inline val deleted: "deleted" = "deleted"
  inline val failed: "failed" = "failed"
  inline val deleted_running: "deleted_running" = "deleted_running"
  inline val deleted_terminating: "deleted_terminating" = "deleted_terminating"
  inline val modifying: "modifying" = "modifying"

  inline def values: js.Array[FleetStateCode] = js.Array(submitted, active, deleted, failed, deleted_running, deleted_terminating, modifying)
}

type FleetType = "request" | "maintain" | "instant"
object FleetType {
  inline val request: "request" = "request"
  inline val maintain: "maintain" = "maintain"
  inline val instant: "instant" = "instant"

  inline def values: js.Array[FleetType] = js.Array(request, maintain, instant)
}

type FlowLogsResourceType = "VPC" | "Subnet" | "NetworkInterface" | "TransitGateway" | "TransitGatewayAttachment"
object FlowLogsResourceType {
  inline val VPC: "VPC" = "VPC"
  inline val Subnet: "Subnet" = "Subnet"
  inline val NetworkInterface: "NetworkInterface" = "NetworkInterface"
  inline val TransitGateway: "TransitGateway" = "TransitGateway"
  inline val TransitGatewayAttachment: "TransitGatewayAttachment" = "TransitGatewayAttachment"

  inline def values: js.Array[FlowLogsResourceType] = js.Array(VPC, Subnet, NetworkInterface, TransitGateway, TransitGatewayAttachment)
}

type FpgaImageAttributeName = "description" | "name" | "loadPermission" | "productCodes"
object FpgaImageAttributeName {
  inline val description: "description" = "description"
  inline val name: "name" = "name"
  inline val loadPermission: "loadPermission" = "loadPermission"
  inline val productCodes: "productCodes" = "productCodes"

  inline def values: js.Array[FpgaImageAttributeName] = js.Array(description, name, loadPermission, productCodes)
}

type FpgaImageStateCode = "pending" | "failed" | "available" | "unavailable"
object FpgaImageStateCode {
  inline val pending: "pending" = "pending"
  inline val failed: "failed" = "failed"
  inline val available: "available" = "available"
  inline val unavailable: "unavailable" = "unavailable"

  inline def values: js.Array[FpgaImageStateCode] = js.Array(pending, failed, available, unavailable)
}

type GatewayAssociationState = "associated" | "not-associated" | "associating" | "disassociating"
object GatewayAssociationState {
  inline val associated: "associated" = "associated"
  inline val `not-associated`: "not-associated" = "not-associated"
  inline val associating: "associating" = "associating"
  inline val disassociating: "disassociating" = "disassociating"

  inline def values: js.Array[GatewayAssociationState] = js.Array(associated, `not-associated`, associating, disassociating)
}

type GatewayType = "ipsec.1"
object GatewayType {
  inline val `ipsec.1`: "ipsec.1" = "ipsec.1"

  inline def values: js.Array[GatewayType] = js.Array(`ipsec.1`)
}

type HostRecovery = "on" | "off"
object HostRecovery {
  inline val on: "on" = "on"
  inline val off: "off" = "off"

  inline def values: js.Array[HostRecovery] = js.Array(on, off)
}

type HostTenancy = "dedicated" | "host"
object HostTenancy {
  inline val dedicated: "dedicated" = "dedicated"
  inline val host: "host" = "host"

  inline def values: js.Array[HostTenancy] = js.Array(dedicated, host)
}

type HostnameType = "ip-name" | "resource-name"
object HostnameType {
  inline val `ip-name`: "ip-name" = "ip-name"
  inline val `resource-name`: "resource-name" = "resource-name"

  inline def values: js.Array[HostnameType] = js.Array(`ip-name`, `resource-name`)
}

type HttpTokensState = "optional" | "required"
object HttpTokensState {
  inline val optional: "optional" = "optional"
  inline val required: "required" = "required"

  inline def values: js.Array[HttpTokensState] = js.Array(optional, required)
}

type HypervisorType = "ovm" | "xen"
object HypervisorType {
  inline val ovm: "ovm" = "ovm"
  inline val xen: "xen" = "xen"

  inline def values: js.Array[HypervisorType] = js.Array(ovm, xen)
}

type IamInstanceProfileAssociationState = "associating" | "associated" | "disassociating" | "disassociated"
object IamInstanceProfileAssociationState {
  inline val associating: "associating" = "associating"
  inline val associated: "associated" = "associated"
  inline val disassociating: "disassociating" = "disassociating"
  inline val disassociated: "disassociated" = "disassociated"

  inline def values: js.Array[IamInstanceProfileAssociationState] = js.Array(associating, associated, disassociating, disassociated)
}

type Igmpv2SupportValue = "enable" | "disable"
object Igmpv2SupportValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[Igmpv2SupportValue] = js.Array(enable, disable)
}

type ImageAttributeName = "description" | "kernel" | "ramdisk" | "launchPermission" | "productCodes" | "blockDeviceMapping" | "sriovNetSupport" | "bootMode" | "tpmSupport" | "uefiData" | "lastLaunchedTime" | "imdsSupport"
object ImageAttributeName {
  inline val description: "description" = "description"
  inline val kernel: "kernel" = "kernel"
  inline val ramdisk: "ramdisk" = "ramdisk"
  inline val launchPermission: "launchPermission" = "launchPermission"
  inline val productCodes: "productCodes" = "productCodes"
  inline val blockDeviceMapping: "blockDeviceMapping" = "blockDeviceMapping"
  inline val sriovNetSupport: "sriovNetSupport" = "sriovNetSupport"
  inline val bootMode: "bootMode" = "bootMode"
  inline val tpmSupport: "tpmSupport" = "tpmSupport"
  inline val uefiData: "uefiData" = "uefiData"
  inline val lastLaunchedTime: "lastLaunchedTime" = "lastLaunchedTime"
  inline val imdsSupport: "imdsSupport" = "imdsSupport"

  inline def values: js.Array[ImageAttributeName] = js.Array(description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping, sriovNetSupport, bootMode, tpmSupport, uefiData, lastLaunchedTime, imdsSupport)
}

type ImageState = "pending" | "available" | "invalid" | "deregistered" | "transient" | "failed" | "error"
object ImageState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val invalid: "invalid" = "invalid"
  inline val deregistered: "deregistered" = "deregistered"
  inline val transient: "transient" = "transient"
  inline val failed: "failed" = "failed"
  inline val error: "error" = "error"

  inline def values: js.Array[ImageState] = js.Array(pending, available, invalid, deregistered, transient, failed, error)
}

type ImageTypeValues = "machine" | "kernel" | "ramdisk"
object ImageTypeValues {
  inline val machine: "machine" = "machine"
  inline val kernel: "kernel" = "kernel"
  inline val ramdisk: "ramdisk" = "ramdisk"

  inline def values: js.Array[ImageTypeValues] = js.Array(machine, kernel, ramdisk)
}

type ImdsSupportValues = "v2.0"
object ImdsSupportValues {
  inline val `v2.0`: "v2.0" = "v2.0"

  inline def values: js.Array[ImdsSupportValues] = js.Array(`v2.0`)
}

type InstanceAttributeName = "instanceType" | "kernel" | "ramdisk" | "userData" | "disableApiTermination" | "instanceInitiatedShutdownBehavior" | "rootDeviceName" | "blockDeviceMapping" | "productCodes" | "sourceDestCheck" | "groupSet" | "ebsOptimized" | "sriovNetSupport" | "enaSupport" | "enclaveOptions" | "disableApiStop"
object InstanceAttributeName {
  inline val instanceType: "instanceType" = "instanceType"
  inline val kernel: "kernel" = "kernel"
  inline val ramdisk: "ramdisk" = "ramdisk"
  inline val userData: "userData" = "userData"
  inline val disableApiTermination: "disableApiTermination" = "disableApiTermination"
  inline val instanceInitiatedShutdownBehavior: "instanceInitiatedShutdownBehavior" = "instanceInitiatedShutdownBehavior"
  inline val rootDeviceName: "rootDeviceName" = "rootDeviceName"
  inline val blockDeviceMapping: "blockDeviceMapping" = "blockDeviceMapping"
  inline val productCodes: "productCodes" = "productCodes"
  inline val sourceDestCheck: "sourceDestCheck" = "sourceDestCheck"
  inline val groupSet: "groupSet" = "groupSet"
  inline val ebsOptimized: "ebsOptimized" = "ebsOptimized"
  inline val sriovNetSupport: "sriovNetSupport" = "sriovNetSupport"
  inline val enaSupport: "enaSupport" = "enaSupport"
  inline val enclaveOptions: "enclaveOptions" = "enclaveOptions"
  inline val disableApiStop: "disableApiStop" = "disableApiStop"

  inline def values: js.Array[InstanceAttributeName] = js.Array(
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

type InstanceAutoRecoveryState = "disabled" | "default"
object InstanceAutoRecoveryState {
  inline val disabled: "disabled" = "disabled"
  inline val default: "default" = "default"

  inline def values: js.Array[InstanceAutoRecoveryState] = js.Array(disabled, default)
}

type InstanceEventWindowState = "creating" | "deleting" | "active" | "deleted"
object InstanceEventWindowState {
  inline val creating: "creating" = "creating"
  inline val deleting: "deleting" = "deleting"
  inline val active: "active" = "active"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[InstanceEventWindowState] = js.Array(creating, deleting, active, deleted)
}

type InstanceGeneration = "current" | "previous"
object InstanceGeneration {
  inline val current: "current" = "current"
  inline val previous: "previous" = "previous"

  inline def values: js.Array[InstanceGeneration] = js.Array(current, previous)
}

type InstanceHealthStatus = "healthy" | "unhealthy"
object InstanceHealthStatus {
  inline val healthy: "healthy" = "healthy"
  inline val unhealthy: "unhealthy" = "unhealthy"

  inline def values: js.Array[InstanceHealthStatus] = js.Array(healthy, unhealthy)
}

type InstanceInterruptionBehavior = "hibernate" | "stop" | "terminate"
object InstanceInterruptionBehavior {
  inline val hibernate: "hibernate" = "hibernate"
  inline val stop: "stop" = "stop"
  inline val terminate: "terminate" = "terminate"

  inline def values: js.Array[InstanceInterruptionBehavior] = js.Array(hibernate, stop, terminate)
}

type InstanceLifecycle = "spot" | "on-demand"
object InstanceLifecycle {
  inline val spot: "spot" = "spot"
  inline val `on-demand`: "on-demand" = "on-demand"

  inline def values: js.Array[InstanceLifecycle] = js.Array(spot, `on-demand`)
}

type InstanceLifecycleType = "spot" | "scheduled"
object InstanceLifecycleType {
  inline val spot: "spot" = "spot"
  inline val scheduled: "scheduled" = "scheduled"

  inline def values: js.Array[InstanceLifecycleType] = js.Array(spot, scheduled)
}

type InstanceMatchCriteria = "open" | "targeted"
object InstanceMatchCriteria {
  inline val open: "open" = "open"
  inline val targeted: "targeted" = "targeted"

  inline def values: js.Array[InstanceMatchCriteria] = js.Array(open, targeted)
}

type InstanceMetadataEndpointState = "disabled" | "enabled"
object InstanceMetadataEndpointState {
  inline val disabled: "disabled" = "disabled"
  inline val enabled: "enabled" = "enabled"

  inline def values: js.Array[InstanceMetadataEndpointState] = js.Array(disabled, enabled)
}

type InstanceMetadataOptionsState = "pending" | "applied"
object InstanceMetadataOptionsState {
  inline val pending: "pending" = "pending"
  inline val applied: "applied" = "applied"

  inline def values: js.Array[InstanceMetadataOptionsState] = js.Array(pending, applied)
}

type InstanceMetadataProtocolState = "disabled" | "enabled"
object InstanceMetadataProtocolState {
  inline val disabled: "disabled" = "disabled"
  inline val enabled: "enabled" = "enabled"

  inline def values: js.Array[InstanceMetadataProtocolState] = js.Array(disabled, enabled)
}

type InstanceMetadataTagsState = "disabled" | "enabled"
object InstanceMetadataTagsState {
  inline val disabled: "disabled" = "disabled"
  inline val enabled: "enabled" = "enabled"

  inline def values: js.Array[InstanceMetadataTagsState] = js.Array(disabled, enabled)
}

type InstanceStateName = "pending" | "running" | "shutting-down" | "terminated" | "stopping" | "stopped"
object InstanceStateName {
  inline val pending: "pending" = "pending"
  inline val running: "running" = "running"
  inline val `shutting-down`: "shutting-down" = "shutting-down"
  inline val terminated: "terminated" = "terminated"
  inline val stopping: "stopping" = "stopping"
  inline val stopped: "stopped" = "stopped"

  inline def values: js.Array[InstanceStateName] = js.Array(pending, running, `shutting-down`, terminated, stopping, stopped)
}

type InstanceStorageEncryptionSupport = "unsupported" | "required"
object InstanceStorageEncryptionSupport {
  inline val unsupported: "unsupported" = "unsupported"
  inline val required: "required" = "required"

  inline def values: js.Array[InstanceStorageEncryptionSupport] = js.Array(unsupported, required)
}

type InstanceType =
  "a1.medium" | "a1.large" | "a1.xlarge" | "a1.2xlarge" | "a1.4xlarge" | "a1.metal" | "c1.medium" | "c1.xlarge" | "c3.large" | "c3.xlarge" | "c3.2xlarge" | "c3.4xlarge" | "c3.8xlarge" | "c4.large" | "c4.xlarge" | "c4.2xlarge" | "c4.4xlarge" | "c4.8xlarge" | "c5.large" | "c5.xlarge" | "c5.2xlarge" | "c5.4xlarge" | "c5.9xlarge" | "c5.12xlarge" | "c5.18xlarge" | "c5.24xlarge" | "c5.metal" | "c5a.large" | "c5a.xlarge" | "c5a.2xlarge" | "c5a.4xlarge" | "c5a.8xlarge" | "c5a.12xlarge" | "c5a.16xlarge" | "c5a.24xlarge" | "c5ad.large" | "c5ad.xlarge" | "c5ad.2xlarge" | "c5ad.4xlarge" | "c5ad.8xlarge" | "c5ad.12xlarge" | "c5ad.16xlarge" | "c5ad.24xlarge" | "c5d.large" | "c5d.xlarge" | "c5d.2xlarge" | "c5d.4xlarge" | "c5d.9xlarge" | "c5d.12xlarge" | "c5d.18xlarge" | "c5d.24xlarge" | "c5d.metal" | "c5n.large" | "c5n.xlarge" | "c5n.2xlarge" | "c5n.4xlarge" | "c5n.9xlarge" | "c5n.18xlarge" | "c5n.metal" | "c6g.medium" | "c6g.large" | "c6g.xlarge" | "c6g.2xlarge" | "c6g.4xlarge" | "c6g.8xlarge" | "c6g.12xlarge" | "c6g.16xlarge" | "c6g.metal" | "c6gd.medium" | "c6gd.large" | "c6gd.xlarge" | "c6gd.2xlarge" | "c6gd.4xlarge" | "c6gd.8xlarge" | "c6gd.12xlarge" | "c6gd.16xlarge" | "c6gd.metal" | "c6gn.medium" | "c6gn.large" | "c6gn.xlarge" | "c6gn.2xlarge" | "c6gn.4xlarge" | "c6gn.8xlarge" | "c6gn.12xlarge" | "c6gn.16xlarge" | "c6i.large" | "c6i.xlarge" | "c6i.2xlarge" | "c6i.4xlarge" | "c6i.8xlarge" | "c6i.12xlarge" | "c6i.16xlarge" | "c6i.24xlarge" | "c6i.32xlarge" | "c6i.metal" | "cc1.4xlarge" | "cc2.8xlarge" | "cg1.4xlarge" | "cr1.8xlarge" | "d2.xlarge" | "d2.2xlarge" | "d2.4xlarge" | "d2.8xlarge" | "d3.xlarge" | "d3.2xlarge" | "d3.4xlarge" | "d3.8xlarge" | "d3en.xlarge" | "d3en.2xlarge" | "d3en.4xlarge" | "d3en.6xlarge" | "d3en.8xlarge" | "d3en.12xlarge" | "dl1.24xlarge" | "f1.2xlarge" | "f1.4xlarge" | "f1.16xlarge" | "g2.2xlarge" | "g2.8xlarge" | "g3.4xlarge" | "g3.8xlarge" | "g3.16xlarge" | "g3s.xlarge" | "g4ad.xlarge" | "g4ad.2xlarge" | "g4ad.4xlarge" | "g4ad.8xlarge" | "g4ad.16xlarge" | "g4dn.xlarge" | "g4dn.2xlarge" | "g4dn.4xlarge" | "g4dn.8xlarge" | "g4dn.12xlarge" | "g4dn.16xlarge" | "g4dn.metal" | "g5.xlarge" | "g5.2xlarge" | "g5.4xlarge" | "g5.8xlarge" | "g5.12xlarge" | "g5.16xlarge" | "g5.24xlarge" | "g5.48xlarge" | "g5g.xlarge" | "g5g.2xlarge" | "g5g.4xlarge" | "g5g.8xlarge" | "g5g.16xlarge" | "g5g.metal" | "hi1.4xlarge" | "hpc6a.48xlarge" | "hs1.8xlarge" | "h1.2xlarge" | "h1.4xlarge" | "h1.8xlarge" | "h1.16xlarge" | "i2.xlarge" | "i2.2xlarge" | "i2.4xlarge" | "i2.8xlarge" | "i3.large" | "i3.xlarge" | "i3.2xlarge" | "i3.4xlarge" | "i3.8xlarge" | "i3.16xlarge" | "i3.metal" | "i3en.large" | "i3en.xlarge" | "i3en.2xlarge" | "i3en.3xlarge" | "i3en.6xlarge" | "i3en.12xlarge" | "i3en.24xlarge" | "i3en.metal" | "im4gn.large" | "im4gn.xlarge" | "im4gn.2xlarge" | "im4gn.4xlarge" | "im4gn.8xlarge" | "im4gn.16xlarge" | "inf1.xlarge" | "inf1.2xlarge" | "inf1.6xlarge" | "inf1.24xlarge" | "is4gen.medium" | "is4gen.large" | "is4gen.xlarge" | "is4gen.2xlarge" | "is4gen.4xlarge" | "is4gen.8xlarge" | "m1.small" | "m1.medium" | "m1.large" | "m1.xlarge" | "m2.xlarge" | "m2.2xlarge" | "m2.4xlarge" | "m3.medium" | "m3.large" | "m3.xlarge" | "m3.2xlarge" | "m4.large" | "m4.xlarge" | "m4.2xlarge" | "m4.4xlarge" | "m4.10xlarge" | "m4.16xlarge" | "m5.large" | "m5.xlarge" | "m5.2xlarge" | "m5.4xlarge" | "m5.8xlarge" | "m5.12xlarge" | "m5.16xlarge" | "m5.24xlarge" | "m5.metal" | "m5a.large" | "m5a.xlarge" | "m5a.2xlarge" | "m5a.4xlarge" | "m5a.8xlarge" | "m5a.12xlarge" | "m5a.16xlarge" | "m5a.24xlarge" | "m5ad.large" | "m5ad.xlarge" | "m5ad.2xlarge" | "m5ad.4xlarge" | "m5ad.8xlarge" | "m5ad.12xlarge" | "m5ad.16xlarge" | "m5ad.24xlarge" | "m5d.large" | "m5d.xlarge" | "m5d.2xlarge" | "m5d.4xlarge" | "m5d.8xlarge" | "m5d.12xlarge" | "m5d.16xlarge" | "m5d.24xlarge" | "m5d.metal" | "m5dn.large" | "m5dn.xlarge" | "m5dn.2xlarge" | "m5dn.4xlarge" | "m5dn.8xlarge" | "m5dn.12xlarge" | "m5dn.16xlarge" | "m5dn.24xlarge" | "m5dn.metal" | "m5n.large" | "m5n.xlarge" | "m5n.2xlarge" | "m5n.4xlarge" | "m5n.8xlarge" | "m5n.12xlarge" | "m5n.16xlarge" | "m5n.24xlarge" | "m5n.metal" | "m5zn.large" | "m5zn.xlarge" | "m5zn.2xlarge" | "m5zn.3xlarge" | "m5zn.6xlarge" | "m5zn.12xlarge" | "m5zn.metal" | "m6a.large" | "m6a.xlarge" | "m6a.2xlarge" | "m6a.4xlarge" | "m6a.8xlarge" | "m6a.12xlarge" | "m6a.16xlarge" | "m6a.24xlarge" | "m6a.32xlarge" | "m6a.48xlarge" | "m6g.metal" | "m6g.medium" | "m6g.large" | "m6g.xlarge" | "m6g.2xlarge" | "m6g.4xlarge" | "m6g.8xlarge" | "m6g.12xlarge" | "m6g.16xlarge" | "m6gd.metal" | "m6gd.medium" | "m6gd.large" | "m6gd.xlarge" | "m6gd.2xlarge" | "m6gd.4xlarge" | "m6gd.8xlarge" | "m6gd.12xlarge" | "m6gd.16xlarge" | "m6i.large" | "m6i.xlarge" | "m6i.2xlarge" | "m6i.4xlarge" | "m6i.8xlarge" | "m6i.12xlarge" | "m6i.16xlarge" | "m6i.24xlarge" | "m6i.32xlarge" | "m6i.metal" | "mac1.metal" | "p2.xlarge" | "p2.8xlarge" | "p2.16xlarge" | "p3.2xlarge" | "p3.8xlarge" | "p3.16xlarge" | "p3dn.24xlarge" | "p4d.24xlarge" | "r3.large" | "r3.xlarge" | "r3.2xlarge" | "r3.4xlarge" | "r3.8xlarge" | "r4.large" | "r4.xlarge" | "r4.2xlarge" | "r4.4xlarge" | "r4.8xlarge" | "r4.16xlarge" | "r5.large" | "r5.xlarge" | "r5.2xlarge" | "r5.4xlarge" | "r5.8xlarge" | "r5.12xlarge" | "r5.16xlarge" | "r5.24xlarge" | "r5.metal" | "r5a.large" | "r5a.xlarge" | "r5a.2xlarge" | "r5a.4xlarge" | "r5a.8xlarge" | "r5a.12xlarge" | "r5a.16xlarge" | "r5a.24xlarge" | "r5ad.large" | "r5ad.xlarge" | "r5ad.2xlarge" | "r5ad.4xlarge" | "r5ad.8xlarge" | "r5ad.12xlarge" | "r5ad.16xlarge" | "r5ad.24xlarge" | "r5b.large" | "r5b.xlarge" | "r5b.2xlarge" | "r5b.4xlarge" | "r5b.8xlarge" | "r5b.12xlarge" | "r5b.16xlarge" | "r5b.24xlarge" | "r5b.metal" | "r5d.large" | "r5d.xlarge" | "r5d.2xlarge" | "r5d.4xlarge" | "r5d.8xlarge" | "r5d.12xlarge" | "r5d.16xlarge" | "r5d.24xlarge" | "r5d.metal" | "r5dn.large" | "r5dn.xlarge" | "r5dn.2xlarge" | "r5dn.4xlarge" | "r5dn.8xlarge" | "r5dn.12xlarge" | "r5dn.16xlarge" | "r5dn.24xlarge" | "r5dn.metal" | "r5n.large" | "r5n.xlarge" | "r5n.2xlarge" | "r5n.4xlarge" | "r5n.8xlarge" | "r5n.12xlarge" | "r5n.16xlarge" | "r5n.24xlarge" | "r5n.metal" | "r6g.medium" | "r6g.large" | "r6g.xlarge" | "r6g.2xlarge" | "r6g.4xlarge" | "r6g.8xlarge" | "r6g.12xlarge" | "r6g.16xlarge" | "r6g.metal" | "r6gd.medium" | "r6gd.large" | "r6gd.xlarge" | "r6gd.2xlarge" | "r6gd.4xlarge" | "r6gd.8xlarge" | "r6gd.12xlarge" | "r6gd.16xlarge" | "r6gd.metal" | "r6i.large" | "r6i.xlarge" | "r6i.2xlarge" | "r6i.4xlarge" | "r6i.8xlarge" | "r6i.12xlarge" | "r6i.16xlarge" | "r6i.24xlarge" | "r6i.32xlarge" | "r6i.metal" | "t1.micro" | "t2.nano" | "t2.micro" | "t2.small" | "t2.medium" | "t2.large" | "t2.xlarge" | "t2.2xlarge" | "t3.nano" | "t3.micro" | "t3.small" | "t3.medium" | "t3.large" | "t3.xlarge" | "t3.2xlarge" | "t3a.nano" | "t3a.micro" | "t3a.small" | "t3a.medium" | "t3a.large" | "t3a.xlarge" | "t3a.2xlarge" | "t4g.nano" | "t4g.micro" | "t4g.small" | "t4g.medium" | "t4g.large" | "t4g.xlarge" | "t4g.2xlarge" | "u-6tb1.56xlarge" | "u-6tb1.112xlarge" | "u-9tb1.112xlarge" | "u-12tb1.112xlarge" | "u-6tb1.metal" | "u-9tb1.metal" | "u-12tb1.metal" | "u-18tb1.metal" | "u-24tb1.metal" | "vt1.3xlarge" | "vt1.6xlarge" | "vt1.24xlarge" | "x1.16xlarge" | "x1.32xlarge" | "x1e.xlarge" | "x1e.2xlarge" | "x1e.4xlarge" | "x1e.8xlarge" | "x1e.16xlarge" | "x1e.32xlarge" | "x2iezn.2xlarge" | "x2iezn.4xlarge" | "x2iezn.6xlarge" | "x2iezn.8xlarge" | "x2iezn.12xlarge" | "x2iezn.metal" | "x2gd.medium" | "x2gd.large" | "x2gd.xlarge" | "x2gd.2xlarge" | "x2gd.4xlarge" | "x2gd.8xlarge" | "x2gd.12xlarge" | "x2gd.16xlarge" | "x2gd.metal" | "z1d.large" | "z1d.xlarge" | "z1d.2xlarge" | "z1d.3xlarge" | "z1d.6xlarge" | "z1d.12xlarge" | "z1d.metal" | "x2idn.16xlarge" | "x2idn.24xlarge" | "x2idn.32xlarge" | "x2iedn.xlarge" | "x2iedn.2xlarge" | "x2iedn.4xlarge" | "x2iedn.8xlarge" | "x2iedn.16xlarge" | "x2iedn.24xlarge" | "x2iedn.32xlarge" | "c6a.large" | "c6a.xlarge" | "c6a.2xlarge" | "c6a.4xlarge" | "c6a.8xlarge" | "c6a.12xlarge" | "c6a.16xlarge" | "c6a.24xlarge" | "c6a.32xlarge" | "c6a.48xlarge" | "c6a.metal" | "m6a.metal" | "i4i.large" | "i4i.xlarge" | "i4i.2xlarge" | "i4i.4xlarge" | "i4i.8xlarge" | "i4i.16xlarge" | "i4i.32xlarge" | "i4i.metal" | "x2idn.metal" | "x2iedn.metal" | "c7g.medium" | "c7g.large" | "c7g.xlarge" | "c7g.2xlarge" | "c7g.4xlarge" | "c7g.8xlarge" | "c7g.12xlarge" | "c7g.16xlarge" | "mac2.metal" | "c6id.large" | "c6id.xlarge" | "c6id.2xlarge" | "c6id.4xlarge" | "c6id.8xlarge" | "c6id.12xlarge" | "c6id.16xlarge" | "c6id.24xlarge" | "c6id.32xlarge" | "c6id.metal" | "m6id.large" | "m6id.xlarge" | "m6id.2xlarge" | "m6id.4xlarge" | "m6id.8xlarge" | "m6id.12xlarge" | "m6id.16xlarge" | "m6id.24xlarge" | "m6id.32xlarge" | "m6id.metal" | "r6id.large" | "r6id.xlarge" | "r6id.2xlarge" | "r6id.4xlarge" | "r6id.8xlarge" | "r6id.12xlarge" | "r6id.16xlarge" | "r6id.24xlarge" | "r6id.32xlarge" | "r6id.metal" | "r6a.large" | "r6a.xlarge" | "r6a.2xlarge" | "r6a.4xlarge" | "r6a.8xlarge" | "r6a.12xlarge" | "r6a.16xlarge" | "r6a.24xlarge" | "r6a.32xlarge" | "r6a.48xlarge" | "r6a.metal" | "p4de.24xlarge" | "u-3tb1.56xlarge" | "u-18tb1.112xlarge" | "u-24tb1.112xlarge" | "trn1.2xlarge" | "trn1.32xlarge" | "hpc6id.32xlarge"
object InstanceType {
  inline val `a1.medium`: "a1.medium" = "a1.medium"
  inline val `a1.large`: "a1.large" = "a1.large"
  inline val `a1.xlarge`: "a1.xlarge" = "a1.xlarge"
  inline val `a1.2xlarge`: "a1.2xlarge" = "a1.2xlarge"
  inline val `a1.4xlarge`: "a1.4xlarge" = "a1.4xlarge"
  inline val `a1.metal`: "a1.metal" = "a1.metal"
  inline val `c1.medium`: "c1.medium" = "c1.medium"
  inline val `c1.xlarge`: "c1.xlarge" = "c1.xlarge"
  inline val `c3.large`: "c3.large" = "c3.large"
  inline val `c3.xlarge`: "c3.xlarge" = "c3.xlarge"
  inline val `c3.2xlarge`: "c3.2xlarge" = "c3.2xlarge"
  inline val `c3.4xlarge`: "c3.4xlarge" = "c3.4xlarge"
  inline val `c3.8xlarge`: "c3.8xlarge" = "c3.8xlarge"
  inline val `c4.large`: "c4.large" = "c4.large"
  inline val `c4.xlarge`: "c4.xlarge" = "c4.xlarge"
  inline val `c4.2xlarge`: "c4.2xlarge" = "c4.2xlarge"
  inline val `c4.4xlarge`: "c4.4xlarge" = "c4.4xlarge"
  inline val `c4.8xlarge`: "c4.8xlarge" = "c4.8xlarge"
  inline val `c5.large`: "c5.large" = "c5.large"
  inline val `c5.xlarge`: "c5.xlarge" = "c5.xlarge"
  inline val `c5.2xlarge`: "c5.2xlarge" = "c5.2xlarge"
  inline val `c5.4xlarge`: "c5.4xlarge" = "c5.4xlarge"
  inline val `c5.9xlarge`: "c5.9xlarge" = "c5.9xlarge"
  inline val `c5.12xlarge`: "c5.12xlarge" = "c5.12xlarge"
  inline val `c5.18xlarge`: "c5.18xlarge" = "c5.18xlarge"
  inline val `c5.24xlarge`: "c5.24xlarge" = "c5.24xlarge"
  inline val `c5.metal`: "c5.metal" = "c5.metal"
  inline val `c5a.large`: "c5a.large" = "c5a.large"
  inline val `c5a.xlarge`: "c5a.xlarge" = "c5a.xlarge"
  inline val `c5a.2xlarge`: "c5a.2xlarge" = "c5a.2xlarge"
  inline val `c5a.4xlarge`: "c5a.4xlarge" = "c5a.4xlarge"
  inline val `c5a.8xlarge`: "c5a.8xlarge" = "c5a.8xlarge"
  inline val `c5a.12xlarge`: "c5a.12xlarge" = "c5a.12xlarge"
  inline val `c5a.16xlarge`: "c5a.16xlarge" = "c5a.16xlarge"
  inline val `c5a.24xlarge`: "c5a.24xlarge" = "c5a.24xlarge"
  inline val `c5ad.large`: "c5ad.large" = "c5ad.large"
  inline val `c5ad.xlarge`: "c5ad.xlarge" = "c5ad.xlarge"
  inline val `c5ad.2xlarge`: "c5ad.2xlarge" = "c5ad.2xlarge"
  inline val `c5ad.4xlarge`: "c5ad.4xlarge" = "c5ad.4xlarge"
  inline val `c5ad.8xlarge`: "c5ad.8xlarge" = "c5ad.8xlarge"
  inline val `c5ad.12xlarge`: "c5ad.12xlarge" = "c5ad.12xlarge"
  inline val `c5ad.16xlarge`: "c5ad.16xlarge" = "c5ad.16xlarge"
  inline val `c5ad.24xlarge`: "c5ad.24xlarge" = "c5ad.24xlarge"
  inline val `c5d.large`: "c5d.large" = "c5d.large"
  inline val `c5d.xlarge`: "c5d.xlarge" = "c5d.xlarge"
  inline val `c5d.2xlarge`: "c5d.2xlarge" = "c5d.2xlarge"
  inline val `c5d.4xlarge`: "c5d.4xlarge" = "c5d.4xlarge"
  inline val `c5d.9xlarge`: "c5d.9xlarge" = "c5d.9xlarge"
  inline val `c5d.12xlarge`: "c5d.12xlarge" = "c5d.12xlarge"
  inline val `c5d.18xlarge`: "c5d.18xlarge" = "c5d.18xlarge"
  inline val `c5d.24xlarge`: "c5d.24xlarge" = "c5d.24xlarge"
  inline val `c5d.metal`: "c5d.metal" = "c5d.metal"
  inline val `c5n.large`: "c5n.large" = "c5n.large"
  inline val `c5n.xlarge`: "c5n.xlarge" = "c5n.xlarge"
  inline val `c5n.2xlarge`: "c5n.2xlarge" = "c5n.2xlarge"
  inline val `c5n.4xlarge`: "c5n.4xlarge" = "c5n.4xlarge"
  inline val `c5n.9xlarge`: "c5n.9xlarge" = "c5n.9xlarge"
  inline val `c5n.18xlarge`: "c5n.18xlarge" = "c5n.18xlarge"
  inline val `c5n.metal`: "c5n.metal" = "c5n.metal"
  inline val `c6g.medium`: "c6g.medium" = "c6g.medium"
  inline val `c6g.large`: "c6g.large" = "c6g.large"
  inline val `c6g.xlarge`: "c6g.xlarge" = "c6g.xlarge"
  inline val `c6g.2xlarge`: "c6g.2xlarge" = "c6g.2xlarge"
  inline val `c6g.4xlarge`: "c6g.4xlarge" = "c6g.4xlarge"
  inline val `c6g.8xlarge`: "c6g.8xlarge" = "c6g.8xlarge"
  inline val `c6g.12xlarge`: "c6g.12xlarge" = "c6g.12xlarge"
  inline val `c6g.16xlarge`: "c6g.16xlarge" = "c6g.16xlarge"
  inline val `c6g.metal`: "c6g.metal" = "c6g.metal"
  inline val `c6gd.medium`: "c6gd.medium" = "c6gd.medium"
  inline val `c6gd.large`: "c6gd.large" = "c6gd.large"
  inline val `c6gd.xlarge`: "c6gd.xlarge" = "c6gd.xlarge"
  inline val `c6gd.2xlarge`: "c6gd.2xlarge" = "c6gd.2xlarge"
  inline val `c6gd.4xlarge`: "c6gd.4xlarge" = "c6gd.4xlarge"
  inline val `c6gd.8xlarge`: "c6gd.8xlarge" = "c6gd.8xlarge"
  inline val `c6gd.12xlarge`: "c6gd.12xlarge" = "c6gd.12xlarge"
  inline val `c6gd.16xlarge`: "c6gd.16xlarge" = "c6gd.16xlarge"
  inline val `c6gd.metal`: "c6gd.metal" = "c6gd.metal"
  inline val `c6gn.medium`: "c6gn.medium" = "c6gn.medium"
  inline val `c6gn.large`: "c6gn.large" = "c6gn.large"
  inline val `c6gn.xlarge`: "c6gn.xlarge" = "c6gn.xlarge"
  inline val `c6gn.2xlarge`: "c6gn.2xlarge" = "c6gn.2xlarge"
  inline val `c6gn.4xlarge`: "c6gn.4xlarge" = "c6gn.4xlarge"
  inline val `c6gn.8xlarge`: "c6gn.8xlarge" = "c6gn.8xlarge"
  inline val `c6gn.12xlarge`: "c6gn.12xlarge" = "c6gn.12xlarge"
  inline val `c6gn.16xlarge`: "c6gn.16xlarge" = "c6gn.16xlarge"
  inline val `c6i.large`: "c6i.large" = "c6i.large"
  inline val `c6i.xlarge`: "c6i.xlarge" = "c6i.xlarge"
  inline val `c6i.2xlarge`: "c6i.2xlarge" = "c6i.2xlarge"
  inline val `c6i.4xlarge`: "c6i.4xlarge" = "c6i.4xlarge"
  inline val `c6i.8xlarge`: "c6i.8xlarge" = "c6i.8xlarge"
  inline val `c6i.12xlarge`: "c6i.12xlarge" = "c6i.12xlarge"
  inline val `c6i.16xlarge`: "c6i.16xlarge" = "c6i.16xlarge"
  inline val `c6i.24xlarge`: "c6i.24xlarge" = "c6i.24xlarge"
  inline val `c6i.32xlarge`: "c6i.32xlarge" = "c6i.32xlarge"
  inline val `c6i.metal`: "c6i.metal" = "c6i.metal"
  inline val `cc1.4xlarge`: "cc1.4xlarge" = "cc1.4xlarge"
  inline val `cc2.8xlarge`: "cc2.8xlarge" = "cc2.8xlarge"
  inline val `cg1.4xlarge`: "cg1.4xlarge" = "cg1.4xlarge"
  inline val `cr1.8xlarge`: "cr1.8xlarge" = "cr1.8xlarge"
  inline val `d2.xlarge`: "d2.xlarge" = "d2.xlarge"
  inline val `d2.2xlarge`: "d2.2xlarge" = "d2.2xlarge"
  inline val `d2.4xlarge`: "d2.4xlarge" = "d2.4xlarge"
  inline val `d2.8xlarge`: "d2.8xlarge" = "d2.8xlarge"
  inline val `d3.xlarge`: "d3.xlarge" = "d3.xlarge"
  inline val `d3.2xlarge`: "d3.2xlarge" = "d3.2xlarge"
  inline val `d3.4xlarge`: "d3.4xlarge" = "d3.4xlarge"
  inline val `d3.8xlarge`: "d3.8xlarge" = "d3.8xlarge"
  inline val `d3en.xlarge`: "d3en.xlarge" = "d3en.xlarge"
  inline val `d3en.2xlarge`: "d3en.2xlarge" = "d3en.2xlarge"
  inline val `d3en.4xlarge`: "d3en.4xlarge" = "d3en.4xlarge"
  inline val `d3en.6xlarge`: "d3en.6xlarge" = "d3en.6xlarge"
  inline val `d3en.8xlarge`: "d3en.8xlarge" = "d3en.8xlarge"
  inline val `d3en.12xlarge`: "d3en.12xlarge" = "d3en.12xlarge"
  inline val `dl1.24xlarge`: "dl1.24xlarge" = "dl1.24xlarge"
  inline val `f1.2xlarge`: "f1.2xlarge" = "f1.2xlarge"
  inline val `f1.4xlarge`: "f1.4xlarge" = "f1.4xlarge"
  inline val `f1.16xlarge`: "f1.16xlarge" = "f1.16xlarge"
  inline val `g2.2xlarge`: "g2.2xlarge" = "g2.2xlarge"
  inline val `g2.8xlarge`: "g2.8xlarge" = "g2.8xlarge"
  inline val `g3.4xlarge`: "g3.4xlarge" = "g3.4xlarge"
  inline val `g3.8xlarge`: "g3.8xlarge" = "g3.8xlarge"
  inline val `g3.16xlarge`: "g3.16xlarge" = "g3.16xlarge"
  inline val `g3s.xlarge`: "g3s.xlarge" = "g3s.xlarge"
  inline val `g4ad.xlarge`: "g4ad.xlarge" = "g4ad.xlarge"
  inline val `g4ad.2xlarge`: "g4ad.2xlarge" = "g4ad.2xlarge"
  inline val `g4ad.4xlarge`: "g4ad.4xlarge" = "g4ad.4xlarge"
  inline val `g4ad.8xlarge`: "g4ad.8xlarge" = "g4ad.8xlarge"
  inline val `g4ad.16xlarge`: "g4ad.16xlarge" = "g4ad.16xlarge"
  inline val `g4dn.xlarge`: "g4dn.xlarge" = "g4dn.xlarge"
  inline val `g4dn.2xlarge`: "g4dn.2xlarge" = "g4dn.2xlarge"
  inline val `g4dn.4xlarge`: "g4dn.4xlarge" = "g4dn.4xlarge"
  inline val `g4dn.8xlarge`: "g4dn.8xlarge" = "g4dn.8xlarge"
  inline val `g4dn.12xlarge`: "g4dn.12xlarge" = "g4dn.12xlarge"
  inline val `g4dn.16xlarge`: "g4dn.16xlarge" = "g4dn.16xlarge"
  inline val `g4dn.metal`: "g4dn.metal" = "g4dn.metal"
  inline val `g5.xlarge`: "g5.xlarge" = "g5.xlarge"
  inline val `g5.2xlarge`: "g5.2xlarge" = "g5.2xlarge"
  inline val `g5.4xlarge`: "g5.4xlarge" = "g5.4xlarge"
  inline val `g5.8xlarge`: "g5.8xlarge" = "g5.8xlarge"
  inline val `g5.12xlarge`: "g5.12xlarge" = "g5.12xlarge"
  inline val `g5.16xlarge`: "g5.16xlarge" = "g5.16xlarge"
  inline val `g5.24xlarge`: "g5.24xlarge" = "g5.24xlarge"
  inline val `g5.48xlarge`: "g5.48xlarge" = "g5.48xlarge"
  inline val `g5g.xlarge`: "g5g.xlarge" = "g5g.xlarge"
  inline val `g5g.2xlarge`: "g5g.2xlarge" = "g5g.2xlarge"
  inline val `g5g.4xlarge`: "g5g.4xlarge" = "g5g.4xlarge"
  inline val `g5g.8xlarge`: "g5g.8xlarge" = "g5g.8xlarge"
  inline val `g5g.16xlarge`: "g5g.16xlarge" = "g5g.16xlarge"
  inline val `g5g.metal`: "g5g.metal" = "g5g.metal"
  inline val `hi1.4xlarge`: "hi1.4xlarge" = "hi1.4xlarge"
  inline val `hpc6a.48xlarge`: "hpc6a.48xlarge" = "hpc6a.48xlarge"
  inline val `hs1.8xlarge`: "hs1.8xlarge" = "hs1.8xlarge"
  inline val `h1.2xlarge`: "h1.2xlarge" = "h1.2xlarge"
  inline val `h1.4xlarge`: "h1.4xlarge" = "h1.4xlarge"
  inline val `h1.8xlarge`: "h1.8xlarge" = "h1.8xlarge"
  inline val `h1.16xlarge`: "h1.16xlarge" = "h1.16xlarge"
  inline val `i2.xlarge`: "i2.xlarge" = "i2.xlarge"
  inline val `i2.2xlarge`: "i2.2xlarge" = "i2.2xlarge"
  inline val `i2.4xlarge`: "i2.4xlarge" = "i2.4xlarge"
  inline val `i2.8xlarge`: "i2.8xlarge" = "i2.8xlarge"
  inline val `i3.large`: "i3.large" = "i3.large"
  inline val `i3.xlarge`: "i3.xlarge" = "i3.xlarge"
  inline val `i3.2xlarge`: "i3.2xlarge" = "i3.2xlarge"
  inline val `i3.4xlarge`: "i3.4xlarge" = "i3.4xlarge"
  inline val `i3.8xlarge`: "i3.8xlarge" = "i3.8xlarge"
  inline val `i3.16xlarge`: "i3.16xlarge" = "i3.16xlarge"
  inline val `i3.metal`: "i3.metal" = "i3.metal"
  inline val `i3en.large`: "i3en.large" = "i3en.large"
  inline val `i3en.xlarge`: "i3en.xlarge" = "i3en.xlarge"
  inline val `i3en.2xlarge`: "i3en.2xlarge" = "i3en.2xlarge"
  inline val `i3en.3xlarge`: "i3en.3xlarge" = "i3en.3xlarge"
  inline val `i3en.6xlarge`: "i3en.6xlarge" = "i3en.6xlarge"
  inline val `i3en.12xlarge`: "i3en.12xlarge" = "i3en.12xlarge"
  inline val `i3en.24xlarge`: "i3en.24xlarge" = "i3en.24xlarge"
  inline val `i3en.metal`: "i3en.metal" = "i3en.metal"
  inline val `im4gn.large`: "im4gn.large" = "im4gn.large"
  inline val `im4gn.xlarge`: "im4gn.xlarge" = "im4gn.xlarge"
  inline val `im4gn.2xlarge`: "im4gn.2xlarge" = "im4gn.2xlarge"
  inline val `im4gn.4xlarge`: "im4gn.4xlarge" = "im4gn.4xlarge"
  inline val `im4gn.8xlarge`: "im4gn.8xlarge" = "im4gn.8xlarge"
  inline val `im4gn.16xlarge`: "im4gn.16xlarge" = "im4gn.16xlarge"
  inline val `inf1.xlarge`: "inf1.xlarge" = "inf1.xlarge"
  inline val `inf1.2xlarge`: "inf1.2xlarge" = "inf1.2xlarge"
  inline val `inf1.6xlarge`: "inf1.6xlarge" = "inf1.6xlarge"
  inline val `inf1.24xlarge`: "inf1.24xlarge" = "inf1.24xlarge"
  inline val `is4gen.medium`: "is4gen.medium" = "is4gen.medium"
  inline val `is4gen.large`: "is4gen.large" = "is4gen.large"
  inline val `is4gen.xlarge`: "is4gen.xlarge" = "is4gen.xlarge"
  inline val `is4gen.2xlarge`: "is4gen.2xlarge" = "is4gen.2xlarge"
  inline val `is4gen.4xlarge`: "is4gen.4xlarge" = "is4gen.4xlarge"
  inline val `is4gen.8xlarge`: "is4gen.8xlarge" = "is4gen.8xlarge"
  inline val `m1.small`: "m1.small" = "m1.small"
  inline val `m1.medium`: "m1.medium" = "m1.medium"
  inline val `m1.large`: "m1.large" = "m1.large"
  inline val `m1.xlarge`: "m1.xlarge" = "m1.xlarge"
  inline val `m2.xlarge`: "m2.xlarge" = "m2.xlarge"
  inline val `m2.2xlarge`: "m2.2xlarge" = "m2.2xlarge"
  inline val `m2.4xlarge`: "m2.4xlarge" = "m2.4xlarge"
  inline val `m3.medium`: "m3.medium" = "m3.medium"
  inline val `m3.large`: "m3.large" = "m3.large"
  inline val `m3.xlarge`: "m3.xlarge" = "m3.xlarge"
  inline val `m3.2xlarge`: "m3.2xlarge" = "m3.2xlarge"
  inline val `m4.large`: "m4.large" = "m4.large"
  inline val `m4.xlarge`: "m4.xlarge" = "m4.xlarge"
  inline val `m4.2xlarge`: "m4.2xlarge" = "m4.2xlarge"
  inline val `m4.4xlarge`: "m4.4xlarge" = "m4.4xlarge"
  inline val `m4.10xlarge`: "m4.10xlarge" = "m4.10xlarge"
  inline val `m4.16xlarge`: "m4.16xlarge" = "m4.16xlarge"
  inline val `m5.large`: "m5.large" = "m5.large"
  inline val `m5.xlarge`: "m5.xlarge" = "m5.xlarge"
  inline val `m5.2xlarge`: "m5.2xlarge" = "m5.2xlarge"
  inline val `m5.4xlarge`: "m5.4xlarge" = "m5.4xlarge"
  inline val `m5.8xlarge`: "m5.8xlarge" = "m5.8xlarge"
  inline val `m5.12xlarge`: "m5.12xlarge" = "m5.12xlarge"
  inline val `m5.16xlarge`: "m5.16xlarge" = "m5.16xlarge"
  inline val `m5.24xlarge`: "m5.24xlarge" = "m5.24xlarge"
  inline val `m5.metal`: "m5.metal" = "m5.metal"
  inline val `m5a.large`: "m5a.large" = "m5a.large"
  inline val `m5a.xlarge`: "m5a.xlarge" = "m5a.xlarge"
  inline val `m5a.2xlarge`: "m5a.2xlarge" = "m5a.2xlarge"
  inline val `m5a.4xlarge`: "m5a.4xlarge" = "m5a.4xlarge"
  inline val `m5a.8xlarge`: "m5a.8xlarge" = "m5a.8xlarge"
  inline val `m5a.12xlarge`: "m5a.12xlarge" = "m5a.12xlarge"
  inline val `m5a.16xlarge`: "m5a.16xlarge" = "m5a.16xlarge"
  inline val `m5a.24xlarge`: "m5a.24xlarge" = "m5a.24xlarge"
  inline val `m5ad.large`: "m5ad.large" = "m5ad.large"
  inline val `m5ad.xlarge`: "m5ad.xlarge" = "m5ad.xlarge"
  inline val `m5ad.2xlarge`: "m5ad.2xlarge" = "m5ad.2xlarge"
  inline val `m5ad.4xlarge`: "m5ad.4xlarge" = "m5ad.4xlarge"
  inline val `m5ad.8xlarge`: "m5ad.8xlarge" = "m5ad.8xlarge"
  inline val `m5ad.12xlarge`: "m5ad.12xlarge" = "m5ad.12xlarge"
  inline val `m5ad.16xlarge`: "m5ad.16xlarge" = "m5ad.16xlarge"
  inline val `m5ad.24xlarge`: "m5ad.24xlarge" = "m5ad.24xlarge"
  inline val `m5d.large`: "m5d.large" = "m5d.large"
  inline val `m5d.xlarge`: "m5d.xlarge" = "m5d.xlarge"
  inline val `m5d.2xlarge`: "m5d.2xlarge" = "m5d.2xlarge"
  inline val `m5d.4xlarge`: "m5d.4xlarge" = "m5d.4xlarge"
  inline val `m5d.8xlarge`: "m5d.8xlarge" = "m5d.8xlarge"
  inline val `m5d.12xlarge`: "m5d.12xlarge" = "m5d.12xlarge"
  inline val `m5d.16xlarge`: "m5d.16xlarge" = "m5d.16xlarge"
  inline val `m5d.24xlarge`: "m5d.24xlarge" = "m5d.24xlarge"
  inline val `m5d.metal`: "m5d.metal" = "m5d.metal"
  inline val `m5dn.large`: "m5dn.large" = "m5dn.large"
  inline val `m5dn.xlarge`: "m5dn.xlarge" = "m5dn.xlarge"
  inline val `m5dn.2xlarge`: "m5dn.2xlarge" = "m5dn.2xlarge"
  inline val `m5dn.4xlarge`: "m5dn.4xlarge" = "m5dn.4xlarge"
  inline val `m5dn.8xlarge`: "m5dn.8xlarge" = "m5dn.8xlarge"
  inline val `m5dn.12xlarge`: "m5dn.12xlarge" = "m5dn.12xlarge"
  inline val `m5dn.16xlarge`: "m5dn.16xlarge" = "m5dn.16xlarge"
  inline val `m5dn.24xlarge`: "m5dn.24xlarge" = "m5dn.24xlarge"
  inline val `m5dn.metal`: "m5dn.metal" = "m5dn.metal"
  inline val `m5n.large`: "m5n.large" = "m5n.large"
  inline val `m5n.xlarge`: "m5n.xlarge" = "m5n.xlarge"
  inline val `m5n.2xlarge`: "m5n.2xlarge" = "m5n.2xlarge"
  inline val `m5n.4xlarge`: "m5n.4xlarge" = "m5n.4xlarge"
  inline val `m5n.8xlarge`: "m5n.8xlarge" = "m5n.8xlarge"
  inline val `m5n.12xlarge`: "m5n.12xlarge" = "m5n.12xlarge"
  inline val `m5n.16xlarge`: "m5n.16xlarge" = "m5n.16xlarge"
  inline val `m5n.24xlarge`: "m5n.24xlarge" = "m5n.24xlarge"
  inline val `m5n.metal`: "m5n.metal" = "m5n.metal"
  inline val `m5zn.large`: "m5zn.large" = "m5zn.large"
  inline val `m5zn.xlarge`: "m5zn.xlarge" = "m5zn.xlarge"
  inline val `m5zn.2xlarge`: "m5zn.2xlarge" = "m5zn.2xlarge"
  inline val `m5zn.3xlarge`: "m5zn.3xlarge" = "m5zn.3xlarge"
  inline val `m5zn.6xlarge`: "m5zn.6xlarge" = "m5zn.6xlarge"
  inline val `m5zn.12xlarge`: "m5zn.12xlarge" = "m5zn.12xlarge"
  inline val `m5zn.metal`: "m5zn.metal" = "m5zn.metal"
  inline val `m6a.large`: "m6a.large" = "m6a.large"
  inline val `m6a.xlarge`: "m6a.xlarge" = "m6a.xlarge"
  inline val `m6a.2xlarge`: "m6a.2xlarge" = "m6a.2xlarge"
  inline val `m6a.4xlarge`: "m6a.4xlarge" = "m6a.4xlarge"
  inline val `m6a.8xlarge`: "m6a.8xlarge" = "m6a.8xlarge"
  inline val `m6a.12xlarge`: "m6a.12xlarge" = "m6a.12xlarge"
  inline val `m6a.16xlarge`: "m6a.16xlarge" = "m6a.16xlarge"
  inline val `m6a.24xlarge`: "m6a.24xlarge" = "m6a.24xlarge"
  inline val `m6a.32xlarge`: "m6a.32xlarge" = "m6a.32xlarge"
  inline val `m6a.48xlarge`: "m6a.48xlarge" = "m6a.48xlarge"
  inline val `m6g.metal`: "m6g.metal" = "m6g.metal"
  inline val `m6g.medium`: "m6g.medium" = "m6g.medium"
  inline val `m6g.large`: "m6g.large" = "m6g.large"
  inline val `m6g.xlarge`: "m6g.xlarge" = "m6g.xlarge"
  inline val `m6g.2xlarge`: "m6g.2xlarge" = "m6g.2xlarge"
  inline val `m6g.4xlarge`: "m6g.4xlarge" = "m6g.4xlarge"
  inline val `m6g.8xlarge`: "m6g.8xlarge" = "m6g.8xlarge"
  inline val `m6g.12xlarge`: "m6g.12xlarge" = "m6g.12xlarge"
  inline val `m6g.16xlarge`: "m6g.16xlarge" = "m6g.16xlarge"
  inline val `m6gd.metal`: "m6gd.metal" = "m6gd.metal"
  inline val `m6gd.medium`: "m6gd.medium" = "m6gd.medium"
  inline val `m6gd.large`: "m6gd.large" = "m6gd.large"
  inline val `m6gd.xlarge`: "m6gd.xlarge" = "m6gd.xlarge"
  inline val `m6gd.2xlarge`: "m6gd.2xlarge" = "m6gd.2xlarge"
  inline val `m6gd.4xlarge`: "m6gd.4xlarge" = "m6gd.4xlarge"
  inline val `m6gd.8xlarge`: "m6gd.8xlarge" = "m6gd.8xlarge"
  inline val `m6gd.12xlarge`: "m6gd.12xlarge" = "m6gd.12xlarge"
  inline val `m6gd.16xlarge`: "m6gd.16xlarge" = "m6gd.16xlarge"
  inline val `m6i.large`: "m6i.large" = "m6i.large"
  inline val `m6i.xlarge`: "m6i.xlarge" = "m6i.xlarge"
  inline val `m6i.2xlarge`: "m6i.2xlarge" = "m6i.2xlarge"
  inline val `m6i.4xlarge`: "m6i.4xlarge" = "m6i.4xlarge"
  inline val `m6i.8xlarge`: "m6i.8xlarge" = "m6i.8xlarge"
  inline val `m6i.12xlarge`: "m6i.12xlarge" = "m6i.12xlarge"
  inline val `m6i.16xlarge`: "m6i.16xlarge" = "m6i.16xlarge"
  inline val `m6i.24xlarge`: "m6i.24xlarge" = "m6i.24xlarge"
  inline val `m6i.32xlarge`: "m6i.32xlarge" = "m6i.32xlarge"
  inline val `m6i.metal`: "m6i.metal" = "m6i.metal"
  inline val `mac1.metal`: "mac1.metal" = "mac1.metal"
  inline val `p2.xlarge`: "p2.xlarge" = "p2.xlarge"
  inline val `p2.8xlarge`: "p2.8xlarge" = "p2.8xlarge"
  inline val `p2.16xlarge`: "p2.16xlarge" = "p2.16xlarge"
  inline val `p3.2xlarge`: "p3.2xlarge" = "p3.2xlarge"
  inline val `p3.8xlarge`: "p3.8xlarge" = "p3.8xlarge"
  inline val `p3.16xlarge`: "p3.16xlarge" = "p3.16xlarge"
  inline val `p3dn.24xlarge`: "p3dn.24xlarge" = "p3dn.24xlarge"
  inline val `p4d.24xlarge`: "p4d.24xlarge" = "p4d.24xlarge"
  inline val `r3.large`: "r3.large" = "r3.large"
  inline val `r3.xlarge`: "r3.xlarge" = "r3.xlarge"
  inline val `r3.2xlarge`: "r3.2xlarge" = "r3.2xlarge"
  inline val `r3.4xlarge`: "r3.4xlarge" = "r3.4xlarge"
  inline val `r3.8xlarge`: "r3.8xlarge" = "r3.8xlarge"
  inline val `r4.large`: "r4.large" = "r4.large"
  inline val `r4.xlarge`: "r4.xlarge" = "r4.xlarge"
  inline val `r4.2xlarge`: "r4.2xlarge" = "r4.2xlarge"
  inline val `r4.4xlarge`: "r4.4xlarge" = "r4.4xlarge"
  inline val `r4.8xlarge`: "r4.8xlarge" = "r4.8xlarge"
  inline val `r4.16xlarge`: "r4.16xlarge" = "r4.16xlarge"
  inline val `r5.large`: "r5.large" = "r5.large"
  inline val `r5.xlarge`: "r5.xlarge" = "r5.xlarge"
  inline val `r5.2xlarge`: "r5.2xlarge" = "r5.2xlarge"
  inline val `r5.4xlarge`: "r5.4xlarge" = "r5.4xlarge"
  inline val `r5.8xlarge`: "r5.8xlarge" = "r5.8xlarge"
  inline val `r5.12xlarge`: "r5.12xlarge" = "r5.12xlarge"
  inline val `r5.16xlarge`: "r5.16xlarge" = "r5.16xlarge"
  inline val `r5.24xlarge`: "r5.24xlarge" = "r5.24xlarge"
  inline val `r5.metal`: "r5.metal" = "r5.metal"
  inline val `r5a.large`: "r5a.large" = "r5a.large"
  inline val `r5a.xlarge`: "r5a.xlarge" = "r5a.xlarge"
  inline val `r5a.2xlarge`: "r5a.2xlarge" = "r5a.2xlarge"
  inline val `r5a.4xlarge`: "r5a.4xlarge" = "r5a.4xlarge"
  inline val `r5a.8xlarge`: "r5a.8xlarge" = "r5a.8xlarge"
  inline val `r5a.12xlarge`: "r5a.12xlarge" = "r5a.12xlarge"
  inline val `r5a.16xlarge`: "r5a.16xlarge" = "r5a.16xlarge"
  inline val `r5a.24xlarge`: "r5a.24xlarge" = "r5a.24xlarge"
  inline val `r5ad.large`: "r5ad.large" = "r5ad.large"
  inline val `r5ad.xlarge`: "r5ad.xlarge" = "r5ad.xlarge"
  inline val `r5ad.2xlarge`: "r5ad.2xlarge" = "r5ad.2xlarge"
  inline val `r5ad.4xlarge`: "r5ad.4xlarge" = "r5ad.4xlarge"
  inline val `r5ad.8xlarge`: "r5ad.8xlarge" = "r5ad.8xlarge"
  inline val `r5ad.12xlarge`: "r5ad.12xlarge" = "r5ad.12xlarge"
  inline val `r5ad.16xlarge`: "r5ad.16xlarge" = "r5ad.16xlarge"
  inline val `r5ad.24xlarge`: "r5ad.24xlarge" = "r5ad.24xlarge"
  inline val `r5b.large`: "r5b.large" = "r5b.large"
  inline val `r5b.xlarge`: "r5b.xlarge" = "r5b.xlarge"
  inline val `r5b.2xlarge`: "r5b.2xlarge" = "r5b.2xlarge"
  inline val `r5b.4xlarge`: "r5b.4xlarge" = "r5b.4xlarge"
  inline val `r5b.8xlarge`: "r5b.8xlarge" = "r5b.8xlarge"
  inline val `r5b.12xlarge`: "r5b.12xlarge" = "r5b.12xlarge"
  inline val `r5b.16xlarge`: "r5b.16xlarge" = "r5b.16xlarge"
  inline val `r5b.24xlarge`: "r5b.24xlarge" = "r5b.24xlarge"
  inline val `r5b.metal`: "r5b.metal" = "r5b.metal"
  inline val `r5d.large`: "r5d.large" = "r5d.large"
  inline val `r5d.xlarge`: "r5d.xlarge" = "r5d.xlarge"
  inline val `r5d.2xlarge`: "r5d.2xlarge" = "r5d.2xlarge"
  inline val `r5d.4xlarge`: "r5d.4xlarge" = "r5d.4xlarge"
  inline val `r5d.8xlarge`: "r5d.8xlarge" = "r5d.8xlarge"
  inline val `r5d.12xlarge`: "r5d.12xlarge" = "r5d.12xlarge"
  inline val `r5d.16xlarge`: "r5d.16xlarge" = "r5d.16xlarge"
  inline val `r5d.24xlarge`: "r5d.24xlarge" = "r5d.24xlarge"
  inline val `r5d.metal`: "r5d.metal" = "r5d.metal"
  inline val `r5dn.large`: "r5dn.large" = "r5dn.large"
  inline val `r5dn.xlarge`: "r5dn.xlarge" = "r5dn.xlarge"
  inline val `r5dn.2xlarge`: "r5dn.2xlarge" = "r5dn.2xlarge"
  inline val `r5dn.4xlarge`: "r5dn.4xlarge" = "r5dn.4xlarge"
  inline val `r5dn.8xlarge`: "r5dn.8xlarge" = "r5dn.8xlarge"
  inline val `r5dn.12xlarge`: "r5dn.12xlarge" = "r5dn.12xlarge"
  inline val `r5dn.16xlarge`: "r5dn.16xlarge" = "r5dn.16xlarge"
  inline val `r5dn.24xlarge`: "r5dn.24xlarge" = "r5dn.24xlarge"
  inline val `r5dn.metal`: "r5dn.metal" = "r5dn.metal"
  inline val `r5n.large`: "r5n.large" = "r5n.large"
  inline val `r5n.xlarge`: "r5n.xlarge" = "r5n.xlarge"
  inline val `r5n.2xlarge`: "r5n.2xlarge" = "r5n.2xlarge"
  inline val `r5n.4xlarge`: "r5n.4xlarge" = "r5n.4xlarge"
  inline val `r5n.8xlarge`: "r5n.8xlarge" = "r5n.8xlarge"
  inline val `r5n.12xlarge`: "r5n.12xlarge" = "r5n.12xlarge"
  inline val `r5n.16xlarge`: "r5n.16xlarge" = "r5n.16xlarge"
  inline val `r5n.24xlarge`: "r5n.24xlarge" = "r5n.24xlarge"
  inline val `r5n.metal`: "r5n.metal" = "r5n.metal"
  inline val `r6g.medium`: "r6g.medium" = "r6g.medium"
  inline val `r6g.large`: "r6g.large" = "r6g.large"
  inline val `r6g.xlarge`: "r6g.xlarge" = "r6g.xlarge"
  inline val `r6g.2xlarge`: "r6g.2xlarge" = "r6g.2xlarge"
  inline val `r6g.4xlarge`: "r6g.4xlarge" = "r6g.4xlarge"
  inline val `r6g.8xlarge`: "r6g.8xlarge" = "r6g.8xlarge"
  inline val `r6g.12xlarge`: "r6g.12xlarge" = "r6g.12xlarge"
  inline val `r6g.16xlarge`: "r6g.16xlarge" = "r6g.16xlarge"
  inline val `r6g.metal`: "r6g.metal" = "r6g.metal"
  inline val `r6gd.medium`: "r6gd.medium" = "r6gd.medium"
  inline val `r6gd.large`: "r6gd.large" = "r6gd.large"
  inline val `r6gd.xlarge`: "r6gd.xlarge" = "r6gd.xlarge"
  inline val `r6gd.2xlarge`: "r6gd.2xlarge" = "r6gd.2xlarge"
  inline val `r6gd.4xlarge`: "r6gd.4xlarge" = "r6gd.4xlarge"
  inline val `r6gd.8xlarge`: "r6gd.8xlarge" = "r6gd.8xlarge"
  inline val `r6gd.12xlarge`: "r6gd.12xlarge" = "r6gd.12xlarge"
  inline val `r6gd.16xlarge`: "r6gd.16xlarge" = "r6gd.16xlarge"
  inline val `r6gd.metal`: "r6gd.metal" = "r6gd.metal"
  inline val `r6i.large`: "r6i.large" = "r6i.large"
  inline val `r6i.xlarge`: "r6i.xlarge" = "r6i.xlarge"
  inline val `r6i.2xlarge`: "r6i.2xlarge" = "r6i.2xlarge"
  inline val `r6i.4xlarge`: "r6i.4xlarge" = "r6i.4xlarge"
  inline val `r6i.8xlarge`: "r6i.8xlarge" = "r6i.8xlarge"
  inline val `r6i.12xlarge`: "r6i.12xlarge" = "r6i.12xlarge"
  inline val `r6i.16xlarge`: "r6i.16xlarge" = "r6i.16xlarge"
  inline val `r6i.24xlarge`: "r6i.24xlarge" = "r6i.24xlarge"
  inline val `r6i.32xlarge`: "r6i.32xlarge" = "r6i.32xlarge"
  inline val `r6i.metal`: "r6i.metal" = "r6i.metal"
  inline val `t1.micro`: "t1.micro" = "t1.micro"
  inline val `t2.nano`: "t2.nano" = "t2.nano"
  inline val `t2.micro`: "t2.micro" = "t2.micro"
  inline val `t2.small`: "t2.small" = "t2.small"
  inline val `t2.medium`: "t2.medium" = "t2.medium"
  inline val `t2.large`: "t2.large" = "t2.large"
  inline val `t2.xlarge`: "t2.xlarge" = "t2.xlarge"
  inline val `t2.2xlarge`: "t2.2xlarge" = "t2.2xlarge"
  inline val `t3.nano`: "t3.nano" = "t3.nano"
  inline val `t3.micro`: "t3.micro" = "t3.micro"
  inline val `t3.small`: "t3.small" = "t3.small"
  inline val `t3.medium`: "t3.medium" = "t3.medium"
  inline val `t3.large`: "t3.large" = "t3.large"
  inline val `t3.xlarge`: "t3.xlarge" = "t3.xlarge"
  inline val `t3.2xlarge`: "t3.2xlarge" = "t3.2xlarge"
  inline val `t3a.nano`: "t3a.nano" = "t3a.nano"
  inline val `t3a.micro`: "t3a.micro" = "t3a.micro"
  inline val `t3a.small`: "t3a.small" = "t3a.small"
  inline val `t3a.medium`: "t3a.medium" = "t3a.medium"
  inline val `t3a.large`: "t3a.large" = "t3a.large"
  inline val `t3a.xlarge`: "t3a.xlarge" = "t3a.xlarge"
  inline val `t3a.2xlarge`: "t3a.2xlarge" = "t3a.2xlarge"
  inline val `t4g.nano`: "t4g.nano" = "t4g.nano"
  inline val `t4g.micro`: "t4g.micro" = "t4g.micro"
  inline val `t4g.small`: "t4g.small" = "t4g.small"
  inline val `t4g.medium`: "t4g.medium" = "t4g.medium"
  inline val `t4g.large`: "t4g.large" = "t4g.large"
  inline val `t4g.xlarge`: "t4g.xlarge" = "t4g.xlarge"
  inline val `t4g.2xlarge`: "t4g.2xlarge" = "t4g.2xlarge"
  inline val `u-6tb1.56xlarge`: "u-6tb1.56xlarge" = "u-6tb1.56xlarge"
  inline val `u-6tb1.112xlarge`: "u-6tb1.112xlarge" = "u-6tb1.112xlarge"
  inline val `u-9tb1.112xlarge`: "u-9tb1.112xlarge" = "u-9tb1.112xlarge"
  inline val `u-12tb1.112xlarge`: "u-12tb1.112xlarge" = "u-12tb1.112xlarge"
  inline val `u-6tb1.metal`: "u-6tb1.metal" = "u-6tb1.metal"
  inline val `u-9tb1.metal`: "u-9tb1.metal" = "u-9tb1.metal"
  inline val `u-12tb1.metal`: "u-12tb1.metal" = "u-12tb1.metal"
  inline val `u-18tb1.metal`: "u-18tb1.metal" = "u-18tb1.metal"
  inline val `u-24tb1.metal`: "u-24tb1.metal" = "u-24tb1.metal"
  inline val `vt1.3xlarge`: "vt1.3xlarge" = "vt1.3xlarge"
  inline val `vt1.6xlarge`: "vt1.6xlarge" = "vt1.6xlarge"
  inline val `vt1.24xlarge`: "vt1.24xlarge" = "vt1.24xlarge"
  inline val `x1.16xlarge`: "x1.16xlarge" = "x1.16xlarge"
  inline val `x1.32xlarge`: "x1.32xlarge" = "x1.32xlarge"
  inline val `x1e.xlarge`: "x1e.xlarge" = "x1e.xlarge"
  inline val `x1e.2xlarge`: "x1e.2xlarge" = "x1e.2xlarge"
  inline val `x1e.4xlarge`: "x1e.4xlarge" = "x1e.4xlarge"
  inline val `x1e.8xlarge`: "x1e.8xlarge" = "x1e.8xlarge"
  inline val `x1e.16xlarge`: "x1e.16xlarge" = "x1e.16xlarge"
  inline val `x1e.32xlarge`: "x1e.32xlarge" = "x1e.32xlarge"
  inline val `x2iezn.2xlarge`: "x2iezn.2xlarge" = "x2iezn.2xlarge"
  inline val `x2iezn.4xlarge`: "x2iezn.4xlarge" = "x2iezn.4xlarge"
  inline val `x2iezn.6xlarge`: "x2iezn.6xlarge" = "x2iezn.6xlarge"
  inline val `x2iezn.8xlarge`: "x2iezn.8xlarge" = "x2iezn.8xlarge"
  inline val `x2iezn.12xlarge`: "x2iezn.12xlarge" = "x2iezn.12xlarge"
  inline val `x2iezn.metal`: "x2iezn.metal" = "x2iezn.metal"
  inline val `x2gd.medium`: "x2gd.medium" = "x2gd.medium"
  inline val `x2gd.large`: "x2gd.large" = "x2gd.large"
  inline val `x2gd.xlarge`: "x2gd.xlarge" = "x2gd.xlarge"
  inline val `x2gd.2xlarge`: "x2gd.2xlarge" = "x2gd.2xlarge"
  inline val `x2gd.4xlarge`: "x2gd.4xlarge" = "x2gd.4xlarge"
  inline val `x2gd.8xlarge`: "x2gd.8xlarge" = "x2gd.8xlarge"
  inline val `x2gd.12xlarge`: "x2gd.12xlarge" = "x2gd.12xlarge"
  inline val `x2gd.16xlarge`: "x2gd.16xlarge" = "x2gd.16xlarge"
  inline val `x2gd.metal`: "x2gd.metal" = "x2gd.metal"
  inline val `z1d.large`: "z1d.large" = "z1d.large"
  inline val `z1d.xlarge`: "z1d.xlarge" = "z1d.xlarge"
  inline val `z1d.2xlarge`: "z1d.2xlarge" = "z1d.2xlarge"
  inline val `z1d.3xlarge`: "z1d.3xlarge" = "z1d.3xlarge"
  inline val `z1d.6xlarge`: "z1d.6xlarge" = "z1d.6xlarge"
  inline val `z1d.12xlarge`: "z1d.12xlarge" = "z1d.12xlarge"
  inline val `z1d.metal`: "z1d.metal" = "z1d.metal"
  inline val `x2idn.16xlarge`: "x2idn.16xlarge" = "x2idn.16xlarge"
  inline val `x2idn.24xlarge`: "x2idn.24xlarge" = "x2idn.24xlarge"
  inline val `x2idn.32xlarge`: "x2idn.32xlarge" = "x2idn.32xlarge"
  inline val `x2iedn.xlarge`: "x2iedn.xlarge" = "x2iedn.xlarge"
  inline val `x2iedn.2xlarge`: "x2iedn.2xlarge" = "x2iedn.2xlarge"
  inline val `x2iedn.4xlarge`: "x2iedn.4xlarge" = "x2iedn.4xlarge"
  inline val `x2iedn.8xlarge`: "x2iedn.8xlarge" = "x2iedn.8xlarge"
  inline val `x2iedn.16xlarge`: "x2iedn.16xlarge" = "x2iedn.16xlarge"
  inline val `x2iedn.24xlarge`: "x2iedn.24xlarge" = "x2iedn.24xlarge"
  inline val `x2iedn.32xlarge`: "x2iedn.32xlarge" = "x2iedn.32xlarge"
  inline val `c6a.large`: "c6a.large" = "c6a.large"
  inline val `c6a.xlarge`: "c6a.xlarge" = "c6a.xlarge"
  inline val `c6a.2xlarge`: "c6a.2xlarge" = "c6a.2xlarge"
  inline val `c6a.4xlarge`: "c6a.4xlarge" = "c6a.4xlarge"
  inline val `c6a.8xlarge`: "c6a.8xlarge" = "c6a.8xlarge"
  inline val `c6a.12xlarge`: "c6a.12xlarge" = "c6a.12xlarge"
  inline val `c6a.16xlarge`: "c6a.16xlarge" = "c6a.16xlarge"
  inline val `c6a.24xlarge`: "c6a.24xlarge" = "c6a.24xlarge"
  inline val `c6a.32xlarge`: "c6a.32xlarge" = "c6a.32xlarge"
  inline val `c6a.48xlarge`: "c6a.48xlarge" = "c6a.48xlarge"
  inline val `c6a.metal`: "c6a.metal" = "c6a.metal"
  inline val `m6a.metal`: "m6a.metal" = "m6a.metal"
  inline val `i4i.large`: "i4i.large" = "i4i.large"
  inline val `i4i.xlarge`: "i4i.xlarge" = "i4i.xlarge"
  inline val `i4i.2xlarge`: "i4i.2xlarge" = "i4i.2xlarge"
  inline val `i4i.4xlarge`: "i4i.4xlarge" = "i4i.4xlarge"
  inline val `i4i.8xlarge`: "i4i.8xlarge" = "i4i.8xlarge"
  inline val `i4i.16xlarge`: "i4i.16xlarge" = "i4i.16xlarge"
  inline val `i4i.32xlarge`: "i4i.32xlarge" = "i4i.32xlarge"
  inline val `i4i.metal`: "i4i.metal" = "i4i.metal"
  inline val `x2idn.metal`: "x2idn.metal" = "x2idn.metal"
  inline val `x2iedn.metal`: "x2iedn.metal" = "x2iedn.metal"
  inline val `c7g.medium`: "c7g.medium" = "c7g.medium"
  inline val `c7g.large`: "c7g.large" = "c7g.large"
  inline val `c7g.xlarge`: "c7g.xlarge" = "c7g.xlarge"
  inline val `c7g.2xlarge`: "c7g.2xlarge" = "c7g.2xlarge"
  inline val `c7g.4xlarge`: "c7g.4xlarge" = "c7g.4xlarge"
  inline val `c7g.8xlarge`: "c7g.8xlarge" = "c7g.8xlarge"
  inline val `c7g.12xlarge`: "c7g.12xlarge" = "c7g.12xlarge"
  inline val `c7g.16xlarge`: "c7g.16xlarge" = "c7g.16xlarge"
  inline val `mac2.metal`: "mac2.metal" = "mac2.metal"
  inline val `c6id.large`: "c6id.large" = "c6id.large"
  inline val `c6id.xlarge`: "c6id.xlarge" = "c6id.xlarge"
  inline val `c6id.2xlarge`: "c6id.2xlarge" = "c6id.2xlarge"
  inline val `c6id.4xlarge`: "c6id.4xlarge" = "c6id.4xlarge"
  inline val `c6id.8xlarge`: "c6id.8xlarge" = "c6id.8xlarge"
  inline val `c6id.12xlarge`: "c6id.12xlarge" = "c6id.12xlarge"
  inline val `c6id.16xlarge`: "c6id.16xlarge" = "c6id.16xlarge"
  inline val `c6id.24xlarge`: "c6id.24xlarge" = "c6id.24xlarge"
  inline val `c6id.32xlarge`: "c6id.32xlarge" = "c6id.32xlarge"
  inline val `c6id.metal`: "c6id.metal" = "c6id.metal"
  inline val `m6id.large`: "m6id.large" = "m6id.large"
  inline val `m6id.xlarge`: "m6id.xlarge" = "m6id.xlarge"
  inline val `m6id.2xlarge`: "m6id.2xlarge" = "m6id.2xlarge"
  inline val `m6id.4xlarge`: "m6id.4xlarge" = "m6id.4xlarge"
  inline val `m6id.8xlarge`: "m6id.8xlarge" = "m6id.8xlarge"
  inline val `m6id.12xlarge`: "m6id.12xlarge" = "m6id.12xlarge"
  inline val `m6id.16xlarge`: "m6id.16xlarge" = "m6id.16xlarge"
  inline val `m6id.24xlarge`: "m6id.24xlarge" = "m6id.24xlarge"
  inline val `m6id.32xlarge`: "m6id.32xlarge" = "m6id.32xlarge"
  inline val `m6id.metal`: "m6id.metal" = "m6id.metal"
  inline val `r6id.large`: "r6id.large" = "r6id.large"
  inline val `r6id.xlarge`: "r6id.xlarge" = "r6id.xlarge"
  inline val `r6id.2xlarge`: "r6id.2xlarge" = "r6id.2xlarge"
  inline val `r6id.4xlarge`: "r6id.4xlarge" = "r6id.4xlarge"
  inline val `r6id.8xlarge`: "r6id.8xlarge" = "r6id.8xlarge"
  inline val `r6id.12xlarge`: "r6id.12xlarge" = "r6id.12xlarge"
  inline val `r6id.16xlarge`: "r6id.16xlarge" = "r6id.16xlarge"
  inline val `r6id.24xlarge`: "r6id.24xlarge" = "r6id.24xlarge"
  inline val `r6id.32xlarge`: "r6id.32xlarge" = "r6id.32xlarge"
  inline val `r6id.metal`: "r6id.metal" = "r6id.metal"
  inline val `r6a.large`: "r6a.large" = "r6a.large"
  inline val `r6a.xlarge`: "r6a.xlarge" = "r6a.xlarge"
  inline val `r6a.2xlarge`: "r6a.2xlarge" = "r6a.2xlarge"
  inline val `r6a.4xlarge`: "r6a.4xlarge" = "r6a.4xlarge"
  inline val `r6a.8xlarge`: "r6a.8xlarge" = "r6a.8xlarge"
  inline val `r6a.12xlarge`: "r6a.12xlarge" = "r6a.12xlarge"
  inline val `r6a.16xlarge`: "r6a.16xlarge" = "r6a.16xlarge"
  inline val `r6a.24xlarge`: "r6a.24xlarge" = "r6a.24xlarge"
  inline val `r6a.32xlarge`: "r6a.32xlarge" = "r6a.32xlarge"
  inline val `r6a.48xlarge`: "r6a.48xlarge" = "r6a.48xlarge"
  inline val `r6a.metal`: "r6a.metal" = "r6a.metal"
  inline val `p4de.24xlarge`: "p4de.24xlarge" = "p4de.24xlarge"
  inline val `u-3tb1.56xlarge`: "u-3tb1.56xlarge" = "u-3tb1.56xlarge"
  inline val `u-18tb1.112xlarge`: "u-18tb1.112xlarge" = "u-18tb1.112xlarge"
  inline val `u-24tb1.112xlarge`: "u-24tb1.112xlarge" = "u-24tb1.112xlarge"
  inline val `trn1.2xlarge`: "trn1.2xlarge" = "trn1.2xlarge"
  inline val `trn1.32xlarge`: "trn1.32xlarge" = "trn1.32xlarge"
  inline val `hpc6id.32xlarge`: "hpc6id.32xlarge" = "hpc6id.32xlarge"

  inline def values: js.Array[InstanceType] = js.Array(
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

type InstanceTypeHypervisor = "nitro" | "xen"
object InstanceTypeHypervisor {
  inline val nitro: "nitro" = "nitro"
  inline val xen: "xen" = "xen"

  inline def values: js.Array[InstanceTypeHypervisor] = js.Array(nitro, xen)
}

type InterfacePermissionType = "INSTANCE-ATTACH" | "EIP-ASSOCIATE"
object InterfacePermissionType {
  inline val `INSTANCE-ATTACH`: "INSTANCE-ATTACH" = "INSTANCE-ATTACH"
  inline val `EIP-ASSOCIATE`: "EIP-ASSOCIATE" = "EIP-ASSOCIATE"

  inline def values: js.Array[InterfacePermissionType] = js.Array(`INSTANCE-ATTACH`, `EIP-ASSOCIATE`)
}

type InterfaceProtocolType = "VLAN" | "GRE"
object InterfaceProtocolType {
  inline val VLAN: "VLAN" = "VLAN"
  inline val GRE: "GRE" = "GRE"

  inline def values: js.Array[InterfaceProtocolType] = js.Array(VLAN, GRE)
}

type IpAddressType = "ipv4" | "dualstack" | "ipv6"
object IpAddressType {
  inline val ipv4: "ipv4" = "ipv4"
  inline val dualstack: "dualstack" = "dualstack"
  inline val ipv6: "ipv6" = "ipv6"

  inline def values: js.Array[IpAddressType] = js.Array(ipv4, dualstack, ipv6)
}

type IpamAddressHistoryResourceType = "eip" | "vpc" | "subnet" | "network-interface" | "instance"
object IpamAddressHistoryResourceType {
  inline val eip: "eip" = "eip"
  inline val vpc: "vpc" = "vpc"
  inline val subnet: "subnet" = "subnet"
  inline val `network-interface`: "network-interface" = "network-interface"
  inline val instance: "instance" = "instance"

  inline def values: js.Array[IpamAddressHistoryResourceType] = js.Array(eip, vpc, subnet, `network-interface`, instance)
}

type IpamComplianceStatus = "compliant" | "noncompliant" | "unmanaged" | "ignored"
object IpamComplianceStatus {
  inline val compliant: "compliant" = "compliant"
  inline val noncompliant: "noncompliant" = "noncompliant"
  inline val unmanaged: "unmanaged" = "unmanaged"
  inline val ignored: "ignored" = "ignored"

  inline def values: js.Array[IpamComplianceStatus] = js.Array(compliant, noncompliant, unmanaged, ignored)
}

type IpamManagementState = "managed" | "unmanaged" | "ignored"
object IpamManagementState {
  inline val managed: "managed" = "managed"
  inline val unmanaged: "unmanaged" = "unmanaged"
  inline val ignored: "ignored" = "ignored"

  inline def values: js.Array[IpamManagementState] = js.Array(managed, unmanaged, ignored)
}

type IpamOverlapStatus = "overlapping" | "nonoverlapping" | "ignored"
object IpamOverlapStatus {
  inline val overlapping: "overlapping" = "overlapping"
  inline val nonoverlapping: "nonoverlapping" = "nonoverlapping"
  inline val ignored: "ignored" = "ignored"

  inline def values: js.Array[IpamOverlapStatus] = js.Array(overlapping, nonoverlapping, ignored)
}

type IpamPoolAllocationResourceType = "ipam-pool" | "vpc" | "ec2-public-ipv4-pool" | "custom"
object IpamPoolAllocationResourceType {
  inline val `ipam-pool`: "ipam-pool" = "ipam-pool"
  inline val vpc: "vpc" = "vpc"
  inline val `ec2-public-ipv4-pool`: "ec2-public-ipv4-pool" = "ec2-public-ipv4-pool"
  inline val custom: "custom" = "custom"

  inline def values: js.Array[IpamPoolAllocationResourceType] = js.Array(`ipam-pool`, vpc, `ec2-public-ipv4-pool`, custom)
}

type IpamPoolAwsService = "ec2"
object IpamPoolAwsService {
  inline val ec2: "ec2" = "ec2"

  inline def values: js.Array[IpamPoolAwsService] = js.Array(ec2)
}

type IpamPoolCidrFailureCode = "cidr-not-available"
object IpamPoolCidrFailureCode {
  inline val `cidr-not-available`: "cidr-not-available" = "cidr-not-available"

  inline def values: js.Array[IpamPoolCidrFailureCode] = js.Array(`cidr-not-available`)
}

type IpamPoolCidrState = "pending-provision" | "provisioned" | "failed-provision" | "pending-deprovision" | "deprovisioned" | "failed-deprovision" | "pending-import" | "failed-import"
object IpamPoolCidrState {
  inline val `pending-provision`: "pending-provision" = "pending-provision"
  inline val provisioned: "provisioned" = "provisioned"
  inline val `failed-provision`: "failed-provision" = "failed-provision"
  inline val `pending-deprovision`: "pending-deprovision" = "pending-deprovision"
  inline val deprovisioned: "deprovisioned" = "deprovisioned"
  inline val `failed-deprovision`: "failed-deprovision" = "failed-deprovision"
  inline val `pending-import`: "pending-import" = "pending-import"
  inline val `failed-import`: "failed-import" = "failed-import"

  inline def values: js.Array[IpamPoolCidrState] = js.Array(`pending-provision`, provisioned, `failed-provision`, `pending-deprovision`, deprovisioned, `failed-deprovision`, `pending-import`, `failed-import`)
}

type IpamPoolState = "create-in-progress" | "create-complete" | "create-failed" | "modify-in-progress" | "modify-complete" | "modify-failed" | "delete-in-progress" | "delete-complete" | "delete-failed" | "isolate-in-progress" | "isolate-complete" | "restore-in-progress"
object IpamPoolState {
  inline val `create-in-progress`: "create-in-progress" = "create-in-progress"
  inline val `create-complete`: "create-complete" = "create-complete"
  inline val `create-failed`: "create-failed" = "create-failed"
  inline val `modify-in-progress`: "modify-in-progress" = "modify-in-progress"
  inline val `modify-complete`: "modify-complete" = "modify-complete"
  inline val `modify-failed`: "modify-failed" = "modify-failed"
  inline val `delete-in-progress`: "delete-in-progress" = "delete-in-progress"
  inline val `delete-complete`: "delete-complete" = "delete-complete"
  inline val `delete-failed`: "delete-failed" = "delete-failed"
  inline val `isolate-in-progress`: "isolate-in-progress" = "isolate-in-progress"
  inline val `isolate-complete`: "isolate-complete" = "isolate-complete"
  inline val `restore-in-progress`: "restore-in-progress" = "restore-in-progress"

  inline def values: js.Array[IpamPoolState] = js.Array(
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

type IpamResourceType = "vpc" | "subnet" | "eip" | "public-ipv4-pool" | "ipv6-pool"
object IpamResourceType {
  inline val vpc: "vpc" = "vpc"
  inline val subnet: "subnet" = "subnet"
  inline val eip: "eip" = "eip"
  inline val `public-ipv4-pool`: "public-ipv4-pool" = "public-ipv4-pool"
  inline val `ipv6-pool`: "ipv6-pool" = "ipv6-pool"

  inline def values: js.Array[IpamResourceType] = js.Array(vpc, subnet, eip, `public-ipv4-pool`, `ipv6-pool`)
}

type IpamScopeState = "create-in-progress" | "create-complete" | "create-failed" | "modify-in-progress" | "modify-complete" | "modify-failed" | "delete-in-progress" | "delete-complete" | "delete-failed" | "isolate-in-progress" | "isolate-complete" | "restore-in-progress"
object IpamScopeState {
  inline val `create-in-progress`: "create-in-progress" = "create-in-progress"
  inline val `create-complete`: "create-complete" = "create-complete"
  inline val `create-failed`: "create-failed" = "create-failed"
  inline val `modify-in-progress`: "modify-in-progress" = "modify-in-progress"
  inline val `modify-complete`: "modify-complete" = "modify-complete"
  inline val `modify-failed`: "modify-failed" = "modify-failed"
  inline val `delete-in-progress`: "delete-in-progress" = "delete-in-progress"
  inline val `delete-complete`: "delete-complete" = "delete-complete"
  inline val `delete-failed`: "delete-failed" = "delete-failed"
  inline val `isolate-in-progress`: "isolate-in-progress" = "isolate-in-progress"
  inline val `isolate-complete`: "isolate-complete" = "isolate-complete"
  inline val `restore-in-progress`: "restore-in-progress" = "restore-in-progress"

  inline def values: js.Array[IpamScopeState] = js.Array(
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

type IpamScopeType = "public" | "private"
object IpamScopeType {
  inline val `public`: "public" = "public"
  inline val `private`: "private" = "private"

  inline def values: js.Array[IpamScopeType] = js.Array(`public`, `private`)
}

type IpamState = "create-in-progress" | "create-complete" | "create-failed" | "modify-in-progress" | "modify-complete" | "modify-failed" | "delete-in-progress" | "delete-complete" | "delete-failed" | "isolate-in-progress" | "isolate-complete" | "restore-in-progress"
object IpamState {
  inline val `create-in-progress`: "create-in-progress" = "create-in-progress"
  inline val `create-complete`: "create-complete" = "create-complete"
  inline val `create-failed`: "create-failed" = "create-failed"
  inline val `modify-in-progress`: "modify-in-progress" = "modify-in-progress"
  inline val `modify-complete`: "modify-complete" = "modify-complete"
  inline val `modify-failed`: "modify-failed" = "modify-failed"
  inline val `delete-in-progress`: "delete-in-progress" = "delete-in-progress"
  inline val `delete-complete`: "delete-complete" = "delete-complete"
  inline val `delete-failed`: "delete-failed" = "delete-failed"
  inline val `isolate-in-progress`: "isolate-in-progress" = "isolate-in-progress"
  inline val `isolate-complete`: "isolate-complete" = "isolate-complete"
  inline val `restore-in-progress`: "restore-in-progress" = "restore-in-progress"

  inline def values: js.Array[IpamState] = js.Array(
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

type Ipv6SupportValue = "enable" | "disable"
object Ipv6SupportValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[Ipv6SupportValue] = js.Array(enable, disable)
}

type KeyFormat = "pem" | "ppk"
object KeyFormat {
  inline val pem: "pem" = "pem"
  inline val ppk: "ppk" = "ppk"

  inline def values: js.Array[KeyFormat] = js.Array(pem, ppk)
}

type KeyType = "rsa" | "ed25519"
object KeyType {
  inline val rsa: "rsa" = "rsa"
  inline val ed25519: "ed25519" = "ed25519"

  inline def values: js.Array[KeyType] = js.Array(rsa, ed25519)
}

type LaunchTemplateAutoRecoveryState = "default" | "disabled"
object LaunchTemplateAutoRecoveryState {
  inline val default: "default" = "default"
  inline val disabled: "disabled" = "disabled"

  inline def values: js.Array[LaunchTemplateAutoRecoveryState] = js.Array(default, disabled)
}

type LaunchTemplateErrorCode = "launchTemplateIdDoesNotExist" | "launchTemplateIdMalformed" | "launchTemplateNameDoesNotExist" | "launchTemplateNameMalformed" | "launchTemplateVersionDoesNotExist" | "unexpectedError"
object LaunchTemplateErrorCode {
  inline val launchTemplateIdDoesNotExist: "launchTemplateIdDoesNotExist" = "launchTemplateIdDoesNotExist"
  inline val launchTemplateIdMalformed: "launchTemplateIdMalformed" = "launchTemplateIdMalformed"
  inline val launchTemplateNameDoesNotExist: "launchTemplateNameDoesNotExist" = "launchTemplateNameDoesNotExist"
  inline val launchTemplateNameMalformed: "launchTemplateNameMalformed" = "launchTemplateNameMalformed"
  inline val launchTemplateVersionDoesNotExist: "launchTemplateVersionDoesNotExist" = "launchTemplateVersionDoesNotExist"
  inline val unexpectedError: "unexpectedError" = "unexpectedError"

  inline def values: js.Array[LaunchTemplateErrorCode] = js.Array(
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
  inline val optional: "optional" = "optional"
  inline val required: "required" = "required"

  inline def values: js.Array[LaunchTemplateHttpTokensState] = js.Array(optional, required)
}

type LaunchTemplateInstanceMetadataEndpointState = "disabled" | "enabled"
object LaunchTemplateInstanceMetadataEndpointState {
  inline val disabled: "disabled" = "disabled"
  inline val enabled: "enabled" = "enabled"

  inline def values: js.Array[LaunchTemplateInstanceMetadataEndpointState] = js.Array(disabled, enabled)
}

type LaunchTemplateInstanceMetadataOptionsState = "pending" | "applied"
object LaunchTemplateInstanceMetadataOptionsState {
  inline val pending: "pending" = "pending"
  inline val applied: "applied" = "applied"

  inline def values: js.Array[LaunchTemplateInstanceMetadataOptionsState] = js.Array(pending, applied)
}

type LaunchTemplateInstanceMetadataProtocolIpv6 = "disabled" | "enabled"
object LaunchTemplateInstanceMetadataProtocolIpv6 {
  inline val disabled: "disabled" = "disabled"
  inline val enabled: "enabled" = "enabled"

  inline def values: js.Array[LaunchTemplateInstanceMetadataProtocolIpv6] = js.Array(disabled, enabled)
}

type LaunchTemplateInstanceMetadataTagsState = "disabled" | "enabled"
object LaunchTemplateInstanceMetadataTagsState {
  inline val disabled: "disabled" = "disabled"
  inline val enabled: "enabled" = "enabled"

  inline def values: js.Array[LaunchTemplateInstanceMetadataTagsState] = js.Array(disabled, enabled)
}

type ListingState = "available" | "sold" | "cancelled" | "pending"
object ListingState {
  inline val available: "available" = "available"
  inline val sold: "sold" = "sold"
  inline val cancelled: "cancelled" = "cancelled"
  inline val pending: "pending" = "pending"

  inline def values: js.Array[ListingState] = js.Array(available, sold, cancelled, pending)
}

type ListingStatus = "active" | "pending" | "cancelled" | "closed"
object ListingStatus {
  inline val active: "active" = "active"
  inline val pending: "pending" = "pending"
  inline val cancelled: "cancelled" = "cancelled"
  inline val closed: "closed" = "closed"

  inline def values: js.Array[ListingStatus] = js.Array(active, pending, cancelled, closed)
}

type LocalGatewayRouteState = "pending" | "active" | "blackhole" | "deleting" | "deleted"
object LocalGatewayRouteState {
  inline val pending: "pending" = "pending"
  inline val active: "active" = "active"
  inline val blackhole: "blackhole" = "blackhole"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[LocalGatewayRouteState] = js.Array(pending, active, blackhole, deleting, deleted)
}

type LocalGatewayRouteTableMode = "direct-vpc-routing" | "coip"
object LocalGatewayRouteTableMode {
  inline val `direct-vpc-routing`: "direct-vpc-routing" = "direct-vpc-routing"
  inline val coip: "coip" = "coip"

  inline def values: js.Array[LocalGatewayRouteTableMode] = js.Array(`direct-vpc-routing`, coip)
}

type LocalGatewayRouteType = "static" | "propagated"
object LocalGatewayRouteType {
  inline val static: "static" = "static"
  inline val propagated: "propagated" = "propagated"

  inline def values: js.Array[LocalGatewayRouteType] = js.Array(static, propagated)
}

type LocalStorage = "included" | "required" | "excluded"
object LocalStorage {
  inline val included: "included" = "included"
  inline val required: "required" = "required"
  inline val excluded: "excluded" = "excluded"

  inline def values: js.Array[LocalStorage] = js.Array(included, required, excluded)
}

type LocalStorageType = "hdd" | "ssd"
object LocalStorageType {
  inline val hdd: "hdd" = "hdd"
  inline val ssd: "ssd" = "ssd"

  inline def values: js.Array[LocalStorageType] = js.Array(hdd, ssd)
}

type LocationType = "region" | "availability-zone" | "availability-zone-id"
object LocationType {
  inline val region: "region" = "region"
  inline val `availability-zone`: "availability-zone" = "availability-zone"
  inline val `availability-zone-id`: "availability-zone-id" = "availability-zone-id"

  inline def values: js.Array[LocationType] = js.Array(region, `availability-zone`, `availability-zone-id`)
}

type LogDestinationType = "cloud-watch-logs" | "s3" | "kinesis-data-firehose"
object LogDestinationType {
  inline val `cloud-watch-logs`: "cloud-watch-logs" = "cloud-watch-logs"
  inline val s3: "s3" = "s3"
  inline val `kinesis-data-firehose`: "kinesis-data-firehose" = "kinesis-data-firehose"

  inline def values: js.Array[LogDestinationType] = js.Array(`cloud-watch-logs`, s3, `kinesis-data-firehose`)
}

type MarketType = "spot"
object MarketType {
  inline val spot: "spot" = "spot"

  inline def values: js.Array[MarketType] = js.Array(spot)
}

type MembershipType = "static" | "igmp"
object MembershipType {
  inline val static: "static" = "static"
  inline val igmp: "igmp" = "igmp"

  inline def values: js.Array[MembershipType] = js.Array(static, igmp)
}

type MetricType = "aggregate-latency"
object MetricType {
  inline val `aggregate-latency`: "aggregate-latency" = "aggregate-latency"

  inline def values: js.Array[MetricType] = js.Array(`aggregate-latency`)
}

type ModifyAvailabilityZoneOptInStatus = "opted-in" | "not-opted-in"
object ModifyAvailabilityZoneOptInStatus {
  inline val `opted-in`: "opted-in" = "opted-in"
  inline val `not-opted-in`: "not-opted-in" = "not-opted-in"

  inline def values: js.Array[ModifyAvailabilityZoneOptInStatus] = js.Array(`opted-in`, `not-opted-in`)
}

type MonitoringState = "disabled" | "disabling" | "enabled" | "pending"
object MonitoringState {
  inline val disabled: "disabled" = "disabled"
  inline val disabling: "disabling" = "disabling"
  inline val enabled: "enabled" = "enabled"
  inline val pending: "pending" = "pending"

  inline def values: js.Array[MonitoringState] = js.Array(disabled, disabling, enabled, pending)
}

type MoveStatus = "movingToVpc" | "restoringToClassic"
object MoveStatus {
  inline val movingToVpc: "movingToVpc" = "movingToVpc"
  inline val restoringToClassic: "restoringToClassic" = "restoringToClassic"

  inline def values: js.Array[MoveStatus] = js.Array(movingToVpc, restoringToClassic)
}

type MulticastSupportValue = "enable" | "disable"
object MulticastSupportValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[MulticastSupportValue] = js.Array(enable, disable)
}

type NatGatewayState = "pending" | "failed" | "available" | "deleting" | "deleted"
object NatGatewayState {
  inline val pending: "pending" = "pending"
  inline val failed: "failed" = "failed"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[NatGatewayState] = js.Array(pending, failed, available, deleting, deleted)
}

type NetworkInterfaceAttribute = "description" | "groupSet" | "sourceDestCheck" | "attachment"
object NetworkInterfaceAttribute {
  inline val description: "description" = "description"
  inline val groupSet: "groupSet" = "groupSet"
  inline val sourceDestCheck: "sourceDestCheck" = "sourceDestCheck"
  inline val attachment: "attachment" = "attachment"

  inline def values: js.Array[NetworkInterfaceAttribute] = js.Array(description, groupSet, sourceDestCheck, attachment)
}

type NetworkInterfaceCreationType = "efa" | "branch" | "trunk"
object NetworkInterfaceCreationType {
  inline val efa: "efa" = "efa"
  inline val branch: "branch" = "branch"
  inline val trunk: "trunk" = "trunk"

  inline def values: js.Array[NetworkInterfaceCreationType] = js.Array(efa, branch, trunk)
}

type NetworkInterfacePermissionStateCode = "pending" | "granted" | "revoking" | "revoked"
object NetworkInterfacePermissionStateCode {
  inline val pending: "pending" = "pending"
  inline val granted: "granted" = "granted"
  inline val revoking: "revoking" = "revoking"
  inline val revoked: "revoked" = "revoked"

  inline def values: js.Array[NetworkInterfacePermissionStateCode] = js.Array(pending, granted, revoking, revoked)
}

type NetworkInterfaceStatus = "available" | "associated" | "attaching" | "in-use" | "detaching"
object NetworkInterfaceStatus {
  inline val available: "available" = "available"
  inline val associated: "associated" = "associated"
  inline val attaching: "attaching" = "attaching"
  inline val `in-use`: "in-use" = "in-use"
  inline val detaching: "detaching" = "detaching"

  inline def values: js.Array[NetworkInterfaceStatus] = js.Array(available, associated, attaching, `in-use`, detaching)
}

type NetworkInterfaceType = "interface" | "natGateway" | "efa" | "trunk" | "load_balancer" | "network_load_balancer" | "vpc_endpoint" | "branch" | "transit_gateway" | "lambda" | "quicksight" | "global_accelerator_managed" | "api_gateway_managed" | "gateway_load_balancer" | "gateway_load_balancer_endpoint" | "iot_rules_managed" | "aws_codestar_connections_managed"
object NetworkInterfaceType {
  inline val interface: "interface" = "interface"
  inline val natGateway: "natGateway" = "natGateway"
  inline val efa: "efa" = "efa"
  inline val trunk: "trunk" = "trunk"
  inline val load_balancer: "load_balancer" = "load_balancer"
  inline val network_load_balancer: "network_load_balancer" = "network_load_balancer"
  inline val vpc_endpoint: "vpc_endpoint" = "vpc_endpoint"
  inline val branch: "branch" = "branch"
  inline val transit_gateway: "transit_gateway" = "transit_gateway"
  inline val lambda: "lambda" = "lambda"
  inline val quicksight: "quicksight" = "quicksight"
  inline val global_accelerator_managed: "global_accelerator_managed" = "global_accelerator_managed"
  inline val api_gateway_managed: "api_gateway_managed" = "api_gateway_managed"
  inline val gateway_load_balancer: "gateway_load_balancer" = "gateway_load_balancer"
  inline val gateway_load_balancer_endpoint: "gateway_load_balancer_endpoint" = "gateway_load_balancer_endpoint"
  inline val iot_rules_managed: "iot_rules_managed" = "iot_rules_managed"
  inline val aws_codestar_connections_managed: "aws_codestar_connections_managed" = "aws_codestar_connections_managed"

  inline def values: js.Array[NetworkInterfaceType] = js.Array(
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

type OfferingClassType = "standard" | "convertible"
object OfferingClassType {
  inline val standard: "standard" = "standard"
  inline val convertible: "convertible" = "convertible"

  inline def values: js.Array[OfferingClassType] = js.Array(standard, convertible)
}

type OfferingTypeValues = "Heavy Utilization" | "Medium Utilization" | "Light Utilization" | "No Upfront" | "Partial Upfront" | "All Upfront"
object OfferingTypeValues {
  inline val `Heavy Utilization`: "Heavy Utilization" = "Heavy Utilization"
  inline val `Medium Utilization`: "Medium Utilization" = "Medium Utilization"
  inline val `Light Utilization`: "Light Utilization" = "Light Utilization"
  inline val `No Upfront`: "No Upfront" = "No Upfront"
  inline val `Partial Upfront`: "Partial Upfront" = "Partial Upfront"
  inline val `All Upfront`: "All Upfront" = "All Upfront"

  inline def values: js.Array[OfferingTypeValues] = js.Array(`Heavy Utilization`, `Medium Utilization`, `Light Utilization`, `No Upfront`, `Partial Upfront`, `All Upfront`)
}

type OnDemandAllocationStrategy = "lowestPrice" | "prioritized"
object OnDemandAllocationStrategy {
  inline val lowestPrice: "lowestPrice" = "lowestPrice"
  inline val prioritized: "prioritized" = "prioritized"

  inline def values: js.Array[OnDemandAllocationStrategy] = js.Array(lowestPrice, prioritized)
}

type OperationType = "add" | "remove"
object OperationType {
  inline val add: "add" = "add"
  inline val remove: "remove" = "remove"

  inline def values: js.Array[OperationType] = js.Array(add, remove)
}

type PartitionLoadFrequency = "none" | "daily" | "weekly" | "monthly"
object PartitionLoadFrequency {
  inline val none: "none" = "none"
  inline val daily: "daily" = "daily"
  inline val weekly: "weekly" = "weekly"
  inline val monthly: "monthly" = "monthly"

  inline def values: js.Array[PartitionLoadFrequency] = js.Array(none, daily, weekly, monthly)
}

type PayerResponsibility = "ServiceOwner"
object PayerResponsibility {
  inline val ServiceOwner: "ServiceOwner" = "ServiceOwner"

  inline def values: js.Array[PayerResponsibility] = js.Array(ServiceOwner)
}

type PaymentOption = "AllUpfront" | "PartialUpfront" | "NoUpfront"
object PaymentOption {
  inline val AllUpfront: "AllUpfront" = "AllUpfront"
  inline val PartialUpfront: "PartialUpfront" = "PartialUpfront"
  inline val NoUpfront: "NoUpfront" = "NoUpfront"

  inline def values: js.Array[PaymentOption] = js.Array(AllUpfront, PartialUpfront, NoUpfront)
}

type PeriodType = "five-minutes" | "fifteen-minutes" | "one-hour" | "three-hours" | "one-day" | "one-week"
object PeriodType {
  inline val `five-minutes`: "five-minutes" = "five-minutes"
  inline val `fifteen-minutes`: "fifteen-minutes" = "fifteen-minutes"
  inline val `one-hour`: "one-hour" = "one-hour"
  inline val `three-hours`: "three-hours" = "three-hours"
  inline val `one-day`: "one-day" = "one-day"
  inline val `one-week`: "one-week" = "one-week"

  inline def values: js.Array[PeriodType] = js.Array(`five-minutes`, `fifteen-minutes`, `one-hour`, `three-hours`, `one-day`, `one-week`)
}

type PermissionGroup = "all"
object PermissionGroup {
  inline val all: "all" = "all"

  inline def values: js.Array[PermissionGroup] = js.Array(all)
}

type PlacementGroupState = "pending" | "available" | "deleting" | "deleted"
object PlacementGroupState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[PlacementGroupState] = js.Array(pending, available, deleting, deleted)
}

type PlacementGroupStrategy = "cluster" | "partition" | "spread"
object PlacementGroupStrategy {
  inline val cluster: "cluster" = "cluster"
  inline val partition: "partition" = "partition"
  inline val spread: "spread" = "spread"

  inline def values: js.Array[PlacementGroupStrategy] = js.Array(cluster, partition, spread)
}

type PlacementStrategy = "cluster" | "spread" | "partition"
object PlacementStrategy {
  inline val cluster: "cluster" = "cluster"
  inline val spread: "spread" = "spread"
  inline val partition: "partition" = "partition"

  inline def values: js.Array[PlacementStrategy] = js.Array(cluster, spread, partition)
}

type PlatformValues = "Windows"
object PlatformValues {
  inline val Windows: "Windows" = "Windows"

  inline def values: js.Array[PlatformValues] = js.Array(Windows)
}

type PrefixListState = "create-in-progress" | "create-complete" | "create-failed" | "modify-in-progress" | "modify-complete" | "modify-failed" | "restore-in-progress" | "restore-complete" | "restore-failed" | "delete-in-progress" | "delete-complete" | "delete-failed"
object PrefixListState {
  inline val `create-in-progress`: "create-in-progress" = "create-in-progress"
  inline val `create-complete`: "create-complete" = "create-complete"
  inline val `create-failed`: "create-failed" = "create-failed"
  inline val `modify-in-progress`: "modify-in-progress" = "modify-in-progress"
  inline val `modify-complete`: "modify-complete" = "modify-complete"
  inline val `modify-failed`: "modify-failed" = "modify-failed"
  inline val `restore-in-progress`: "restore-in-progress" = "restore-in-progress"
  inline val `restore-complete`: "restore-complete" = "restore-complete"
  inline val `restore-failed`: "restore-failed" = "restore-failed"
  inline val `delete-in-progress`: "delete-in-progress" = "delete-in-progress"
  inline val `delete-complete`: "delete-complete" = "delete-complete"
  inline val `delete-failed`: "delete-failed" = "delete-failed"

  inline def values: js.Array[PrefixListState] = js.Array(
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
  inline val All: "All" = "All"
  inline val Service: "Service" = "Service"
  inline val OrganizationUnit: "OrganizationUnit" = "OrganizationUnit"
  inline val Account: "Account" = "Account"
  inline val User: "User" = "User"
  inline val Role: "Role" = "Role"

  inline def values: js.Array[PrincipalType] = js.Array(All, Service, OrganizationUnit, Account, User, Role)
}

type ProductCodeValues = "devpay" | "marketplace"
object ProductCodeValues {
  inline val devpay: "devpay" = "devpay"
  inline val marketplace: "marketplace" = "marketplace"

  inline def values: js.Array[ProductCodeValues] = js.Array(devpay, marketplace)
}

type Protocol = "tcp" | "udp"
object Protocol {
  inline val tcp: "tcp" = "tcp"
  inline val udp: "udp" = "udp"

  inline def values: js.Array[Protocol] = js.Array(tcp, udp)
}

type ProtocolValue = "gre"
object ProtocolValue {
  inline val gre: "gre" = "gre"

  inline def values: js.Array[ProtocolValue] = js.Array(gre)
}

type RIProductDescription = "Linux/UNIX" | "Linux/UNIX (Amazon VPC)" | "Windows" | "Windows (Amazon VPC)"
object RIProductDescription {
  inline val `Linux/UNIX`: "Linux/UNIX" = "Linux/UNIX"
  inline val `Linux/UNIX (Amazon VPC)` : "Linux/UNIX (Amazon VPC)" = "Linux/UNIX (Amazon VPC)"
  inline val Windows: "Windows" = "Windows"
  inline val `Windows (Amazon VPC)` : "Windows (Amazon VPC)" = "Windows (Amazon VPC)"

  inline def values: js.Array[RIProductDescription] = js.Array(`Linux/UNIX`, `Linux/UNIX (Amazon VPC)`, Windows, `Windows (Amazon VPC)`)
}

type RecurringChargeFrequency = "Hourly"
object RecurringChargeFrequency {
  inline val Hourly: "Hourly" = "Hourly"

  inline def values: js.Array[RecurringChargeFrequency] = js.Array(Hourly)
}

type ReplaceRootVolumeTaskState = "pending" | "in-progress" | "failing" | "succeeded" | "failed" | "failed-detached"
object ReplaceRootVolumeTaskState {
  inline val pending: "pending" = "pending"
  inline val `in-progress`: "in-progress" = "in-progress"
  inline val failing: "failing" = "failing"
  inline val succeeded: "succeeded" = "succeeded"
  inline val failed: "failed" = "failed"
  inline val `failed-detached`: "failed-detached" = "failed-detached"

  inline def values: js.Array[ReplaceRootVolumeTaskState] = js.Array(pending, `in-progress`, failing, succeeded, failed, `failed-detached`)
}

type ReplacementStrategy = "launch" | "launch-before-terminate"
object ReplacementStrategy {
  inline val launch: "launch" = "launch"
  inline val `launch-before-terminate`: "launch-before-terminate" = "launch-before-terminate"

  inline def values: js.Array[ReplacementStrategy] = js.Array(launch, `launch-before-terminate`)
}

type ReportInstanceReasonCodes = "instance-stuck-in-state" | "unresponsive" | "not-accepting-credentials" | "password-not-available" | "performance-network" | "performance-instance-store" | "performance-ebs-volume" | "performance-other" | "other"
object ReportInstanceReasonCodes {
  inline val `instance-stuck-in-state`: "instance-stuck-in-state" = "instance-stuck-in-state"
  inline val unresponsive: "unresponsive" = "unresponsive"
  inline val `not-accepting-credentials`: "not-accepting-credentials" = "not-accepting-credentials"
  inline val `password-not-available`: "password-not-available" = "password-not-available"
  inline val `performance-network`: "performance-network" = "performance-network"
  inline val `performance-instance-store`: "performance-instance-store" = "performance-instance-store"
  inline val `performance-ebs-volume`: "performance-ebs-volume" = "performance-ebs-volume"
  inline val `performance-other`: "performance-other" = "performance-other"
  inline val other: "other" = "other"

  inline def values: js.Array[ReportInstanceReasonCodes] = js.Array(
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
  inline val ok: "ok" = "ok"
  inline val impaired: "impaired" = "impaired"

  inline def values: js.Array[ReportStatusType] = js.Array(ok, impaired)
}

type ReservationState = "payment-pending" | "payment-failed" | "active" | "retired"
object ReservationState {
  inline val `payment-pending`: "payment-pending" = "payment-pending"
  inline val `payment-failed`: "payment-failed" = "payment-failed"
  inline val active: "active" = "active"
  inline val retired: "retired" = "retired"

  inline def values: js.Array[ReservationState] = js.Array(`payment-pending`, `payment-failed`, active, retired)
}

type ReservedInstanceState = "payment-pending" | "active" | "payment-failed" | "retired" | "queued" | "queued-deleted"
object ReservedInstanceState {
  inline val `payment-pending`: "payment-pending" = "payment-pending"
  inline val active: "active" = "active"
  inline val `payment-failed`: "payment-failed" = "payment-failed"
  inline val retired: "retired" = "retired"
  inline val queued: "queued" = "queued"
  inline val `queued-deleted`: "queued-deleted" = "queued-deleted"

  inline def values: js.Array[ReservedInstanceState] = js.Array(`payment-pending`, active, `payment-failed`, retired, queued, `queued-deleted`)
}

type ResetFpgaImageAttributeName = "loadPermission"
object ResetFpgaImageAttributeName {
  inline val loadPermission: "loadPermission" = "loadPermission"

  inline def values: js.Array[ResetFpgaImageAttributeName] = js.Array(loadPermission)
}

type ResetImageAttributeName = "launchPermission"
object ResetImageAttributeName {
  inline val launchPermission: "launchPermission" = "launchPermission"

  inline def values: js.Array[ResetImageAttributeName] = js.Array(launchPermission)
}

type ResourceType =
  "capacity-reservation" | "client-vpn-endpoint" | "customer-gateway" | "carrier-gateway" | "coip-pool" | "dedicated-host" | "dhcp-options" | "egress-only-internet-gateway" | "elastic-ip" | "elastic-gpu" | "export-image-task" | "export-instance-task" | "fleet" | "fpga-image" | "host-reservation" | "image" | "import-image-task" | "import-snapshot-task" | "instance" | "instance-event-window" | "internet-gateway" | "ipam" | "ipam-pool" | "ipam-scope" | "ipv4pool-ec2" | "ipv6pool-ec2" | "key-pair" | "launch-template" | "local-gateway" | "local-gateway-route-table" | "local-gateway-virtual-interface" | "local-gateway-virtual-interface-group" | "local-gateway-route-table-vpc-association" | "local-gateway-route-table-virtual-interface-group-association" | "natgateway" | "network-acl" | "network-interface" | "network-insights-analysis" | "network-insights-path" | "network-insights-access-scope" | "network-insights-access-scope-analysis" | "placement-group" | "prefix-list" | "replace-root-volume-task" | "reserved-instances" | "route-table" | "security-group" | "security-group-rule" | "snapshot" | "spot-fleet-request" | "spot-instances-request" | "subnet" | "subnet-cidr-reservation" | "traffic-mirror-filter" | "traffic-mirror-session" | "traffic-mirror-target" | "transit-gateway" | "transit-gateway-attachment" | "transit-gateway-connect-peer" | "transit-gateway-multicast-domain" | "transit-gateway-policy-table" | "transit-gateway-route-table" | "transit-gateway-route-table-announcement" | "volume" | "vpc" | "vpc-endpoint" | "vpc-endpoint-connection" | "vpc-endpoint-service" | "vpc-endpoint-service-permission" | "vpc-peering-connection" | "vpn-connection" | "vpn-gateway" | "vpc-flow-log" | "capacity-reservation-fleet" | "traffic-mirror-filter-rule" | "vpc-endpoint-connection-device-type" | "verified-access-instance" | "verified-access-group" | "verified-access-endpoint" | "verified-access-policy" | "verified-access-trust-provider" | "vpn-connection-device-type"
object ResourceType {
  inline val `capacity-reservation`: "capacity-reservation" = "capacity-reservation"
  inline val `client-vpn-endpoint`: "client-vpn-endpoint" = "client-vpn-endpoint"
  inline val `customer-gateway`: "customer-gateway" = "customer-gateway"
  inline val `carrier-gateway`: "carrier-gateway" = "carrier-gateway"
  inline val `coip-pool`: "coip-pool" = "coip-pool"
  inline val `dedicated-host`: "dedicated-host" = "dedicated-host"
  inline val `dhcp-options`: "dhcp-options" = "dhcp-options"
  inline val `egress-only-internet-gateway`: "egress-only-internet-gateway" = "egress-only-internet-gateway"
  inline val `elastic-ip`: "elastic-ip" = "elastic-ip"
  inline val `elastic-gpu`: "elastic-gpu" = "elastic-gpu"
  inline val `export-image-task`: "export-image-task" = "export-image-task"
  inline val `export-instance-task`: "export-instance-task" = "export-instance-task"
  inline val fleet: "fleet" = "fleet"
  inline val `fpga-image`: "fpga-image" = "fpga-image"
  inline val `host-reservation`: "host-reservation" = "host-reservation"
  inline val image: "image" = "image"
  inline val `import-image-task`: "import-image-task" = "import-image-task"
  inline val `import-snapshot-task`: "import-snapshot-task" = "import-snapshot-task"
  inline val instance: "instance" = "instance"
  inline val `instance-event-window`: "instance-event-window" = "instance-event-window"
  inline val `internet-gateway`: "internet-gateway" = "internet-gateway"
  inline val ipam: "ipam" = "ipam"
  inline val `ipam-pool`: "ipam-pool" = "ipam-pool"
  inline val `ipam-scope`: "ipam-scope" = "ipam-scope"
  inline val `ipv4pool-ec2`: "ipv4pool-ec2" = "ipv4pool-ec2"
  inline val `ipv6pool-ec2`: "ipv6pool-ec2" = "ipv6pool-ec2"
  inline val `key-pair`: "key-pair" = "key-pair"
  inline val `launch-template`: "launch-template" = "launch-template"
  inline val `local-gateway`: "local-gateway" = "local-gateway"
  inline val `local-gateway-route-table`: "local-gateway-route-table" = "local-gateway-route-table"
  inline val `local-gateway-virtual-interface`: "local-gateway-virtual-interface" = "local-gateway-virtual-interface"
  inline val `local-gateway-virtual-interface-group`: "local-gateway-virtual-interface-group" = "local-gateway-virtual-interface-group"
  inline val `local-gateway-route-table-vpc-association`: "local-gateway-route-table-vpc-association" = "local-gateway-route-table-vpc-association"
  inline val `local-gateway-route-table-virtual-interface-group-association`: "local-gateway-route-table-virtual-interface-group-association" = "local-gateway-route-table-virtual-interface-group-association"
  inline val natgateway: "natgateway" = "natgateway"
  inline val `network-acl`: "network-acl" = "network-acl"
  inline val `network-interface`: "network-interface" = "network-interface"
  inline val `network-insights-analysis`: "network-insights-analysis" = "network-insights-analysis"
  inline val `network-insights-path`: "network-insights-path" = "network-insights-path"
  inline val `network-insights-access-scope`: "network-insights-access-scope" = "network-insights-access-scope"
  inline val `network-insights-access-scope-analysis`: "network-insights-access-scope-analysis" = "network-insights-access-scope-analysis"
  inline val `placement-group`: "placement-group" = "placement-group"
  inline val `prefix-list`: "prefix-list" = "prefix-list"
  inline val `replace-root-volume-task`: "replace-root-volume-task" = "replace-root-volume-task"
  inline val `reserved-instances`: "reserved-instances" = "reserved-instances"
  inline val `route-table`: "route-table" = "route-table"
  inline val `security-group`: "security-group" = "security-group"
  inline val `security-group-rule`: "security-group-rule" = "security-group-rule"
  inline val snapshot: "snapshot" = "snapshot"
  inline val `spot-fleet-request`: "spot-fleet-request" = "spot-fleet-request"
  inline val `spot-instances-request`: "spot-instances-request" = "spot-instances-request"
  inline val subnet: "subnet" = "subnet"
  inline val `subnet-cidr-reservation`: "subnet-cidr-reservation" = "subnet-cidr-reservation"
  inline val `traffic-mirror-filter`: "traffic-mirror-filter" = "traffic-mirror-filter"
  inline val `traffic-mirror-session`: "traffic-mirror-session" = "traffic-mirror-session"
  inline val `traffic-mirror-target`: "traffic-mirror-target" = "traffic-mirror-target"
  inline val `transit-gateway`: "transit-gateway" = "transit-gateway"
  inline val `transit-gateway-attachment`: "transit-gateway-attachment" = "transit-gateway-attachment"
  inline val `transit-gateway-connect-peer`: "transit-gateway-connect-peer" = "transit-gateway-connect-peer"
  inline val `transit-gateway-multicast-domain`: "transit-gateway-multicast-domain" = "transit-gateway-multicast-domain"
  inline val `transit-gateway-policy-table`: "transit-gateway-policy-table" = "transit-gateway-policy-table"
  inline val `transit-gateway-route-table`: "transit-gateway-route-table" = "transit-gateway-route-table"
  inline val `transit-gateway-route-table-announcement`: "transit-gateway-route-table-announcement" = "transit-gateway-route-table-announcement"
  inline val volume: "volume" = "volume"
  inline val vpc: "vpc" = "vpc"
  inline val `vpc-endpoint`: "vpc-endpoint" = "vpc-endpoint"
  inline val `vpc-endpoint-connection`: "vpc-endpoint-connection" = "vpc-endpoint-connection"
  inline val `vpc-endpoint-service`: "vpc-endpoint-service" = "vpc-endpoint-service"
  inline val `vpc-endpoint-service-permission`: "vpc-endpoint-service-permission" = "vpc-endpoint-service-permission"
  inline val `vpc-peering-connection`: "vpc-peering-connection" = "vpc-peering-connection"
  inline val `vpn-connection`: "vpn-connection" = "vpn-connection"
  inline val `vpn-gateway`: "vpn-gateway" = "vpn-gateway"
  inline val `vpc-flow-log`: "vpc-flow-log" = "vpc-flow-log"
  inline val `capacity-reservation-fleet`: "capacity-reservation-fleet" = "capacity-reservation-fleet"
  inline val `traffic-mirror-filter-rule`: "traffic-mirror-filter-rule" = "traffic-mirror-filter-rule"
  inline val `vpc-endpoint-connection-device-type`: "vpc-endpoint-connection-device-type" = "vpc-endpoint-connection-device-type"
  inline val `verified-access-instance`: "verified-access-instance" = "verified-access-instance"
  inline val `verified-access-group`: "verified-access-group" = "verified-access-group"
  inline val `verified-access-endpoint`: "verified-access-endpoint" = "verified-access-endpoint"
  inline val `verified-access-policy`: "verified-access-policy" = "verified-access-policy"
  inline val `verified-access-trust-provider`: "verified-access-trust-provider" = "verified-access-trust-provider"
  inline val `vpn-connection-device-type`: "vpn-connection-device-type" = "vpn-connection-device-type"

  inline def values: js.Array[ResourceType] = js.Array(
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

type RootDeviceType = "ebs" | "instance-store"
object RootDeviceType {
  inline val ebs: "ebs" = "ebs"
  inline val `instance-store`: "instance-store" = "instance-store"

  inline def values: js.Array[RootDeviceType] = js.Array(ebs, `instance-store`)
}

type RouteOrigin = "CreateRouteTable" | "CreateRoute" | "EnableVgwRoutePropagation"
object RouteOrigin {
  inline val CreateRouteTable: "CreateRouteTable" = "CreateRouteTable"
  inline val CreateRoute: "CreateRoute" = "CreateRoute"
  inline val EnableVgwRoutePropagation: "EnableVgwRoutePropagation" = "EnableVgwRoutePropagation"

  inline def values: js.Array[RouteOrigin] = js.Array(CreateRouteTable, CreateRoute, EnableVgwRoutePropagation)
}

type RouteState = "active" | "blackhole"
object RouteState {
  inline val active: "active" = "active"
  inline val blackhole: "blackhole" = "blackhole"

  inline def values: js.Array[RouteState] = js.Array(active, blackhole)
}

type RouteTableAssociationStateCode = "associating" | "associated" | "disassociating" | "disassociated" | "failed"
object RouteTableAssociationStateCode {
  inline val associating: "associating" = "associating"
  inline val associated: "associated" = "associated"
  inline val disassociating: "disassociating" = "disassociating"
  inline val disassociated: "disassociated" = "disassociated"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[RouteTableAssociationStateCode] = js.Array(associating, associated, disassociating, disassociated, failed)
}

type RuleAction = "allow" | "deny"
object RuleAction {
  inline val allow: "allow" = "allow"
  inline val deny: "deny" = "deny"

  inline def values: js.Array[RuleAction] = js.Array(allow, deny)
}

type SelfServicePortal = "enabled" | "disabled"
object SelfServicePortal {
  inline val enabled: "enabled" = "enabled"
  inline val disabled: "disabled" = "disabled"

  inline def values: js.Array[SelfServicePortal] = js.Array(enabled, disabled)
}

type ServiceConnectivityType = "ipv4" | "ipv6"
object ServiceConnectivityType {
  inline val ipv4: "ipv4" = "ipv4"
  inline val ipv6: "ipv6" = "ipv6"

  inline def values: js.Array[ServiceConnectivityType] = js.Array(ipv4, ipv6)
}

type ServiceState = "Pending" | "Available" | "Deleting" | "Deleted" | "Failed"
object ServiceState {
  inline val Pending: "Pending" = "Pending"
  inline val Available: "Available" = "Available"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Deleted: "Deleted" = "Deleted"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[ServiceState] = js.Array(Pending, Available, Deleting, Deleted, Failed)
}

type ServiceType = "Interface" | "Gateway" | "GatewayLoadBalancer"
object ServiceType {
  inline val Interface: "Interface" = "Interface"
  inline val Gateway: "Gateway" = "Gateway"
  inline val GatewayLoadBalancer: "GatewayLoadBalancer" = "GatewayLoadBalancer"

  inline def values: js.Array[ServiceType] = js.Array(Interface, Gateway, GatewayLoadBalancer)
}

type ShutdownBehavior = "stop" | "terminate"
object ShutdownBehavior {
  inline val stop: "stop" = "stop"
  inline val terminate: "terminate" = "terminate"

  inline def values: js.Array[ShutdownBehavior] = js.Array(stop, terminate)
}

type SnapshotAttributeName = "productCodes" | "createVolumePermission"
object SnapshotAttributeName {
  inline val productCodes: "productCodes" = "productCodes"
  inline val createVolumePermission: "createVolumePermission" = "createVolumePermission"

  inline def values: js.Array[SnapshotAttributeName] = js.Array(productCodes, createVolumePermission)
}

type SnapshotState = "pending" | "completed" | "error" | "recoverable" | "recovering"
object SnapshotState {
  inline val pending: "pending" = "pending"
  inline val completed: "completed" = "completed"
  inline val error: "error" = "error"
  inline val recoverable: "recoverable" = "recoverable"
  inline val recovering: "recovering" = "recovering"

  inline def values: js.Array[SnapshotState] = js.Array(pending, completed, error, recoverable, recovering)
}

type SpotAllocationStrategy = "lowest-price" | "diversified" | "capacity-optimized" | "capacity-optimized-prioritized" | "price-capacity-optimized"
object SpotAllocationStrategy {
  inline val `lowest-price`: "lowest-price" = "lowest-price"
  inline val diversified: "diversified" = "diversified"
  inline val `capacity-optimized`: "capacity-optimized" = "capacity-optimized"
  inline val `capacity-optimized-prioritized`: "capacity-optimized-prioritized" = "capacity-optimized-prioritized"
  inline val `price-capacity-optimized`: "price-capacity-optimized" = "price-capacity-optimized"

  inline def values: js.Array[SpotAllocationStrategy] = js.Array(`lowest-price`, diversified, `capacity-optimized`, `capacity-optimized-prioritized`, `price-capacity-optimized`)
}

type SpotInstanceInterruptionBehavior = "hibernate" | "stop" | "terminate"
object SpotInstanceInterruptionBehavior {
  inline val hibernate: "hibernate" = "hibernate"
  inline val stop: "stop" = "stop"
  inline val terminate: "terminate" = "terminate"

  inline def values: js.Array[SpotInstanceInterruptionBehavior] = js.Array(hibernate, stop, terminate)
}

type SpotInstanceState = "open" | "active" | "closed" | "cancelled" | "failed"
object SpotInstanceState {
  inline val open: "open" = "open"
  inline val active: "active" = "active"
  inline val closed: "closed" = "closed"
  inline val cancelled: "cancelled" = "cancelled"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[SpotInstanceState] = js.Array(open, active, closed, cancelled, failed)
}

type SpotInstanceType = "one-time" | "persistent"
object SpotInstanceType {
  inline val `one-time`: "one-time" = "one-time"
  inline val persistent: "persistent" = "persistent"

  inline def values: js.Array[SpotInstanceType] = js.Array(`one-time`, persistent)
}

type SpreadLevel = "host" | "rack"
object SpreadLevel {
  inline val host: "host" = "host"
  inline val rack: "rack" = "rack"

  inline def values: js.Array[SpreadLevel] = js.Array(host, rack)
}

type State = "PendingAcceptance" | "Pending" | "Available" | "Deleting" | "Deleted" | "Rejected" | "Failed" | "Expired"
object State {
  inline val PendingAcceptance: "PendingAcceptance" = "PendingAcceptance"
  inline val Pending: "Pending" = "Pending"
  inline val Available: "Available" = "Available"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Deleted: "Deleted" = "Deleted"
  inline val Rejected: "Rejected" = "Rejected"
  inline val Failed: "Failed" = "Failed"
  inline val Expired: "Expired" = "Expired"

  inline def values: js.Array[State] = js.Array(PendingAcceptance, Pending, Available, Deleting, Deleted, Rejected, Failed, Expired)
}

type StaticSourcesSupportValue = "enable" | "disable"
object StaticSourcesSupportValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[StaticSourcesSupportValue] = js.Array(enable, disable)
}

type StatisticType = "p50"
object StatisticType {
  inline val p50: "p50" = "p50"

  inline def values: js.Array[StatisticType] = js.Array(p50)
}

type Status = "MoveInProgress" | "InVpc" | "InClassic"
object Status {
  inline val MoveInProgress: "MoveInProgress" = "MoveInProgress"
  inline val InVpc: "InVpc" = "InVpc"
  inline val InClassic: "InClassic" = "InClassic"

  inline def values: js.Array[Status] = js.Array(MoveInProgress, InVpc, InClassic)
}

type StatusName = "reachability"
object StatusName {
  inline val reachability: "reachability" = "reachability"

  inline def values: js.Array[StatusName] = js.Array(reachability)
}

type StatusType = "passed" | "failed" | "insufficient-data" | "initializing"
object StatusType {
  inline val passed: "passed" = "passed"
  inline val failed: "failed" = "failed"
  inline val `insufficient-data`: "insufficient-data" = "insufficient-data"
  inline val initializing: "initializing" = "initializing"

  inline def values: js.Array[StatusType] = js.Array(passed, failed, `insufficient-data`, initializing)
}

type StorageTier = "archive" | "standard"
object StorageTier {
  inline val archive: "archive" = "archive"
  inline val standard: "standard" = "standard"

  inline def values: js.Array[StorageTier] = js.Array(archive, standard)
}

type SubnetCidrBlockStateCode = "associating" | "associated" | "disassociating" | "disassociated" | "failing" | "failed"
object SubnetCidrBlockStateCode {
  inline val associating: "associating" = "associating"
  inline val associated: "associated" = "associated"
  inline val disassociating: "disassociating" = "disassociating"
  inline val disassociated: "disassociated" = "disassociated"
  inline val failing: "failing" = "failing"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[SubnetCidrBlockStateCode] = js.Array(associating, associated, disassociating, disassociated, failing, failed)
}

type SubnetCidrReservationType = "prefix" | "explicit"
object SubnetCidrReservationType {
  inline val prefix: "prefix" = "prefix"
  inline val explicit: "explicit" = "explicit"

  inline def values: js.Array[SubnetCidrReservationType] = js.Array(prefix, explicit)
}

type SubnetState = "pending" | "available"
object SubnetState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"

  inline def values: js.Array[SubnetState] = js.Array(pending, available)
}

type SummaryStatus = "ok" | "impaired" | "insufficient-data" | "not-applicable" | "initializing"
object SummaryStatus {
  inline val ok: "ok" = "ok"
  inline val impaired: "impaired" = "impaired"
  inline val `insufficient-data`: "insufficient-data" = "insufficient-data"
  inline val `not-applicable`: "not-applicable" = "not-applicable"
  inline val initializing: "initializing" = "initializing"

  inline def values: js.Array[SummaryStatus] = js.Array(ok, impaired, `insufficient-data`, `not-applicable`, initializing)
}

type TargetCapacityUnitType = "vcpu" | "memory-mib" | "units"
object TargetCapacityUnitType {
  inline val vcpu: "vcpu" = "vcpu"
  inline val `memory-mib`: "memory-mib" = "memory-mib"
  inline val units: "units" = "units"

  inline def values: js.Array[TargetCapacityUnitType] = js.Array(vcpu, `memory-mib`, units)
}

type TargetStorageTier = "archive"
object TargetStorageTier {
  inline val archive: "archive" = "archive"

  inline def values: js.Array[TargetStorageTier] = js.Array(archive)
}

type TelemetryStatus = "UP" | "DOWN"
object TelemetryStatus {
  inline val UP: "UP" = "UP"
  inline val DOWN: "DOWN" = "DOWN"

  inline def values: js.Array[TelemetryStatus] = js.Array(UP, DOWN)
}

type Tenancy = "default" | "dedicated" | "host"
object Tenancy {
  inline val default: "default" = "default"
  inline val dedicated: "dedicated" = "dedicated"
  inline val host: "host" = "host"

  inline def values: js.Array[Tenancy] = js.Array(default, dedicated, host)
}

type TieringOperationStatus = "archival-in-progress" | "archival-completed" | "archival-failed" | "temporary-restore-in-progress" | "temporary-restore-completed" | "temporary-restore-failed" | "permanent-restore-in-progress" | "permanent-restore-completed" | "permanent-restore-failed"
object TieringOperationStatus {
  inline val `archival-in-progress`: "archival-in-progress" = "archival-in-progress"
  inline val `archival-completed`: "archival-completed" = "archival-completed"
  inline val `archival-failed`: "archival-failed" = "archival-failed"
  inline val `temporary-restore-in-progress`: "temporary-restore-in-progress" = "temporary-restore-in-progress"
  inline val `temporary-restore-completed`: "temporary-restore-completed" = "temporary-restore-completed"
  inline val `temporary-restore-failed`: "temporary-restore-failed" = "temporary-restore-failed"
  inline val `permanent-restore-in-progress`: "permanent-restore-in-progress" = "permanent-restore-in-progress"
  inline val `permanent-restore-completed`: "permanent-restore-completed" = "permanent-restore-completed"
  inline val `permanent-restore-failed`: "permanent-restore-failed" = "permanent-restore-failed"

  inline def values: js.Array[TieringOperationStatus] = js.Array(
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

type TpmSupportValues = "v2.0"
object TpmSupportValues {
  inline val `v2.0`: "v2.0" = "v2.0"

  inline def values: js.Array[TpmSupportValues] = js.Array(`v2.0`)
}

type TrafficDirection = "ingress" | "egress"
object TrafficDirection {
  inline val ingress: "ingress" = "ingress"
  inline val egress: "egress" = "egress"

  inline def values: js.Array[TrafficDirection] = js.Array(ingress, egress)
}

type TrafficMirrorFilterRuleField = "destination-port-range" | "source-port-range" | "protocol" | "description"
object TrafficMirrorFilterRuleField {
  inline val `destination-port-range`: "destination-port-range" = "destination-port-range"
  inline val `source-port-range`: "source-port-range" = "source-port-range"
  inline val protocol: "protocol" = "protocol"
  inline val description: "description" = "description"

  inline def values: js.Array[TrafficMirrorFilterRuleField] = js.Array(`destination-port-range`, `source-port-range`, protocol, description)
}

type TrafficMirrorNetworkService = "amazon-dns"
object TrafficMirrorNetworkService {
  inline val `amazon-dns`: "amazon-dns" = "amazon-dns"

  inline def values: js.Array[TrafficMirrorNetworkService] = js.Array(`amazon-dns`)
}

type TrafficMirrorRuleAction = "accept" | "reject"
object TrafficMirrorRuleAction {
  inline val accept: "accept" = "accept"
  inline val reject: "reject" = "reject"

  inline def values: js.Array[TrafficMirrorRuleAction] = js.Array(accept, reject)
}

type TrafficMirrorSessionField = "packet-length" | "description" | "virtual-network-id"
object TrafficMirrorSessionField {
  inline val `packet-length`: "packet-length" = "packet-length"
  inline val description: "description" = "description"
  inline val `virtual-network-id`: "virtual-network-id" = "virtual-network-id"

  inline def values: js.Array[TrafficMirrorSessionField] = js.Array(`packet-length`, description, `virtual-network-id`)
}

type TrafficMirrorTargetType = "network-interface" | "network-load-balancer" | "gateway-load-balancer-endpoint"
object TrafficMirrorTargetType {
  inline val `network-interface`: "network-interface" = "network-interface"
  inline val `network-load-balancer`: "network-load-balancer" = "network-load-balancer"
  inline val `gateway-load-balancer-endpoint`: "gateway-load-balancer-endpoint" = "gateway-load-balancer-endpoint"

  inline def values: js.Array[TrafficMirrorTargetType] = js.Array(`network-interface`, `network-load-balancer`, `gateway-load-balancer-endpoint`)
}

type TrafficType = "ACCEPT" | "REJECT" | "ALL"
object TrafficType {
  inline val ACCEPT: "ACCEPT" = "ACCEPT"
  inline val REJECT: "REJECT" = "REJECT"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[TrafficType] = js.Array(ACCEPT, REJECT, ALL)
}

type TransitGatewayAssociationState = "associating" | "associated" | "disassociating" | "disassociated"
object TransitGatewayAssociationState {
  inline val associating: "associating" = "associating"
  inline val associated: "associated" = "associated"
  inline val disassociating: "disassociating" = "disassociating"
  inline val disassociated: "disassociated" = "disassociated"

  inline def values: js.Array[TransitGatewayAssociationState] = js.Array(associating, associated, disassociating, disassociated)
}

type TransitGatewayAttachmentResourceType = "vpc" | "vpn" | "direct-connect-gateway" | "connect" | "peering" | "tgw-peering"
object TransitGatewayAttachmentResourceType {
  inline val vpc: "vpc" = "vpc"
  inline val vpn: "vpn" = "vpn"
  inline val `direct-connect-gateway`: "direct-connect-gateway" = "direct-connect-gateway"
  inline val connect: "connect" = "connect"
  inline val peering: "peering" = "peering"
  inline val `tgw-peering`: "tgw-peering" = "tgw-peering"

  inline def values: js.Array[TransitGatewayAttachmentResourceType] = js.Array(vpc, vpn, `direct-connect-gateway`, connect, peering, `tgw-peering`)
}

type TransitGatewayAttachmentState = "initiating" | "initiatingRequest" | "pendingAcceptance" | "rollingBack" | "pending" | "available" | "modifying" | "deleting" | "deleted" | "failed" | "rejected" | "rejecting" | "failing"
object TransitGatewayAttachmentState {
  inline val initiating: "initiating" = "initiating"
  inline val initiatingRequest: "initiatingRequest" = "initiatingRequest"
  inline val pendingAcceptance: "pendingAcceptance" = "pendingAcceptance"
  inline val rollingBack: "rollingBack" = "rollingBack"
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val modifying: "modifying" = "modifying"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"
  inline val failed: "failed" = "failed"
  inline val rejected: "rejected" = "rejected"
  inline val rejecting: "rejecting" = "rejecting"
  inline val failing: "failing" = "failing"

  inline def values: js.Array[TransitGatewayAttachmentState] = js.Array(initiating, initiatingRequest, pendingAcceptance, rollingBack, pending, available, modifying, deleting, deleted, failed, rejected, rejecting, failing)
}

type TransitGatewayConnectPeerState = "pending" | "available" | "deleting" | "deleted"
object TransitGatewayConnectPeerState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[TransitGatewayConnectPeerState] = js.Array(pending, available, deleting, deleted)
}

type TransitGatewayMulitcastDomainAssociationState = "pendingAcceptance" | "associating" | "associated" | "disassociating" | "disassociated" | "rejected" | "failed"
object TransitGatewayMulitcastDomainAssociationState {
  inline val pendingAcceptance: "pendingAcceptance" = "pendingAcceptance"
  inline val associating: "associating" = "associating"
  inline val associated: "associated" = "associated"
  inline val disassociating: "disassociating" = "disassociating"
  inline val disassociated: "disassociated" = "disassociated"
  inline val rejected: "rejected" = "rejected"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[TransitGatewayMulitcastDomainAssociationState] = js.Array(pendingAcceptance, associating, associated, disassociating, disassociated, rejected, failed)
}

type TransitGatewayMulticastDomainState = "pending" | "available" | "deleting" | "deleted"
object TransitGatewayMulticastDomainState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[TransitGatewayMulticastDomainState] = js.Array(pending, available, deleting, deleted)
}

type TransitGatewayPolicyTableState = "pending" | "available" | "deleting" | "deleted"
object TransitGatewayPolicyTableState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[TransitGatewayPolicyTableState] = js.Array(pending, available, deleting, deleted)
}

type TransitGatewayPrefixListReferenceState = "pending" | "available" | "modifying" | "deleting"
object TransitGatewayPrefixListReferenceState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val modifying: "modifying" = "modifying"
  inline val deleting: "deleting" = "deleting"

  inline def values: js.Array[TransitGatewayPrefixListReferenceState] = js.Array(pending, available, modifying, deleting)
}

type TransitGatewayPropagationState = "enabling" | "enabled" | "disabling" | "disabled"
object TransitGatewayPropagationState {
  inline val enabling: "enabling" = "enabling"
  inline val enabled: "enabled" = "enabled"
  inline val disabling: "disabling" = "disabling"
  inline val disabled: "disabled" = "disabled"

  inline def values: js.Array[TransitGatewayPropagationState] = js.Array(enabling, enabled, disabling, disabled)
}

type TransitGatewayRouteState = "pending" | "active" | "blackhole" | "deleting" | "deleted"
object TransitGatewayRouteState {
  inline val pending: "pending" = "pending"
  inline val active: "active" = "active"
  inline val blackhole: "blackhole" = "blackhole"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[TransitGatewayRouteState] = js.Array(pending, active, blackhole, deleting, deleted)
}

type TransitGatewayRouteTableAnnouncementDirection = "outgoing" | "incoming"
object TransitGatewayRouteTableAnnouncementDirection {
  inline val outgoing: "outgoing" = "outgoing"
  inline val incoming: "incoming" = "incoming"

  inline def values: js.Array[TransitGatewayRouteTableAnnouncementDirection] = js.Array(outgoing, incoming)
}

type TransitGatewayRouteTableAnnouncementState = "available" | "pending" | "failing" | "failed" | "deleting" | "deleted"
object TransitGatewayRouteTableAnnouncementState {
  inline val available: "available" = "available"
  inline val pending: "pending" = "pending"
  inline val failing: "failing" = "failing"
  inline val failed: "failed" = "failed"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[TransitGatewayRouteTableAnnouncementState] = js.Array(available, pending, failing, failed, deleting, deleted)
}

type TransitGatewayRouteTableState = "pending" | "available" | "deleting" | "deleted"
object TransitGatewayRouteTableState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[TransitGatewayRouteTableState] = js.Array(pending, available, deleting, deleted)
}

type TransitGatewayRouteType = "static" | "propagated"
object TransitGatewayRouteType {
  inline val static: "static" = "static"
  inline val propagated: "propagated" = "propagated"

  inline def values: js.Array[TransitGatewayRouteType] = js.Array(static, propagated)
}

type TransitGatewayState = "pending" | "available" | "modifying" | "deleting" | "deleted"
object TransitGatewayState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val modifying: "modifying" = "modifying"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[TransitGatewayState] = js.Array(pending, available, modifying, deleting, deleted)
}

type TransportProtocol = "tcp" | "udp"
object TransportProtocol {
  inline val tcp: "tcp" = "tcp"
  inline val udp: "udp" = "udp"

  inline def values: js.Array[TransportProtocol] = js.Array(tcp, udp)
}

type TrustProviderType = "user" | "device"
object TrustProviderType {
  inline val user: "user" = "user"
  inline val device: "device" = "device"

  inline def values: js.Array[TrustProviderType] = js.Array(user, device)
}

type TunnelInsideIpVersion = "ipv4" | "ipv6"
object TunnelInsideIpVersion {
  inline val ipv4: "ipv4" = "ipv4"
  inline val ipv6: "ipv6" = "ipv6"

  inline def values: js.Array[TunnelInsideIpVersion] = js.Array(ipv4, ipv6)
}

type UnlimitedSupportedInstanceFamily = "t2" | "t3" | "t3a" | "t4g"
object UnlimitedSupportedInstanceFamily {
  inline val t2: "t2" = "t2"
  inline val t3: "t3" = "t3"
  inline val t3a: "t3a" = "t3a"
  inline val t4g: "t4g" = "t4g"

  inline def values: js.Array[UnlimitedSupportedInstanceFamily] = js.Array(t2, t3, t3a, t4g)
}

type UnsuccessfulInstanceCreditSpecificationErrorCode = "InvalidInstanceID.Malformed" | "InvalidInstanceID.NotFound" | "IncorrectInstanceState" | "InstanceCreditSpecification.NotSupported"
object UnsuccessfulInstanceCreditSpecificationErrorCode {
  inline val `InvalidInstanceID.Malformed`: "InvalidInstanceID.Malformed" = "InvalidInstanceID.Malformed"
  inline val `InvalidInstanceID.NotFound`: "InvalidInstanceID.NotFound" = "InvalidInstanceID.NotFound"
  inline val IncorrectInstanceState: "IncorrectInstanceState" = "IncorrectInstanceState"
  inline val `InstanceCreditSpecification.NotSupported`: "InstanceCreditSpecification.NotSupported" = "InstanceCreditSpecification.NotSupported"

  inline def values: js.Array[UnsuccessfulInstanceCreditSpecificationErrorCode] = js.Array(`InvalidInstanceID.Malformed`, `InvalidInstanceID.NotFound`, IncorrectInstanceState, `InstanceCreditSpecification.NotSupported`)
}

type UsageClassType = "spot" | "on-demand"
object UsageClassType {
  inline val spot: "spot" = "spot"
  inline val `on-demand`: "on-demand" = "on-demand"

  inline def values: js.Array[UsageClassType] = js.Array(spot, `on-demand`)
}

type UserTrustProviderType = "iam-identity-center" | "oidc"
object UserTrustProviderType {
  inline val `iam-identity-center`: "iam-identity-center" = "iam-identity-center"
  inline val oidc: "oidc" = "oidc"

  inline def values: js.Array[UserTrustProviderType] = js.Array(`iam-identity-center`, oidc)
}

type VerifiedAccessEndpointAttachmentType = "vpc"
object VerifiedAccessEndpointAttachmentType {
  inline val vpc: "vpc" = "vpc"

  inline def values: js.Array[VerifiedAccessEndpointAttachmentType] = js.Array(vpc)
}

type VerifiedAccessEndpointProtocol = "http" | "https"
object VerifiedAccessEndpointProtocol {
  inline val http: "http" = "http"
  inline val https: "https" = "https"

  inline def values: js.Array[VerifiedAccessEndpointProtocol] = js.Array(http, https)
}

type VerifiedAccessEndpointStatusCode = "pending" | "active" | "updating" | "deleting" | "deleted"
object VerifiedAccessEndpointStatusCode {
  inline val pending: "pending" = "pending"
  inline val active: "active" = "active"
  inline val updating: "updating" = "updating"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[VerifiedAccessEndpointStatusCode] = js.Array(pending, active, updating, deleting, deleted)
}

type VerifiedAccessEndpointType = "load-balancer" | "network-interface"
object VerifiedAccessEndpointType {
  inline val `load-balancer`: "load-balancer" = "load-balancer"
  inline val `network-interface`: "network-interface" = "network-interface"

  inline def values: js.Array[VerifiedAccessEndpointType] = js.Array(`load-balancer`, `network-interface`)
}

type VerifiedAccessLogDeliveryStatusCode = "success" | "failed"
object VerifiedAccessLogDeliveryStatusCode {
  inline val success: "success" = "success"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[VerifiedAccessLogDeliveryStatusCode] = js.Array(success, failed)
}

type VirtualizationType = "hvm" | "paravirtual"
object VirtualizationType {
  inline val hvm: "hvm" = "hvm"
  inline val paravirtual: "paravirtual" = "paravirtual"

  inline def values: js.Array[VirtualizationType] = js.Array(hvm, paravirtual)
}

type VolumeAttachmentState = "attaching" | "attached" | "detaching" | "detached" | "busy"
object VolumeAttachmentState {
  inline val attaching: "attaching" = "attaching"
  inline val attached: "attached" = "attached"
  inline val detaching: "detaching" = "detaching"
  inline val detached: "detached" = "detached"
  inline val busy: "busy" = "busy"

  inline def values: js.Array[VolumeAttachmentState] = js.Array(attaching, attached, detaching, detached, busy)
}

type VolumeAttributeName = "autoEnableIO" | "productCodes"
object VolumeAttributeName {
  inline val autoEnableIO: "autoEnableIO" = "autoEnableIO"
  inline val productCodes: "productCodes" = "productCodes"

  inline def values: js.Array[VolumeAttributeName] = js.Array(autoEnableIO, productCodes)
}

type VolumeModificationState = "modifying" | "optimizing" | "completed" | "failed"
object VolumeModificationState {
  inline val modifying: "modifying" = "modifying"
  inline val optimizing: "optimizing" = "optimizing"
  inline val completed: "completed" = "completed"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[VolumeModificationState] = js.Array(modifying, optimizing, completed, failed)
}

type VolumeState = "creating" | "available" | "in-use" | "deleting" | "deleted" | "error"
object VolumeState {
  inline val creating: "creating" = "creating"
  inline val available: "available" = "available"
  inline val `in-use`: "in-use" = "in-use"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"
  inline val error: "error" = "error"

  inline def values: js.Array[VolumeState] = js.Array(creating, available, `in-use`, deleting, deleted, error)
}

type VolumeStatusInfoStatus = "ok" | "impaired" | "insufficient-data"
object VolumeStatusInfoStatus {
  inline val ok: "ok" = "ok"
  inline val impaired: "impaired" = "impaired"
  inline val `insufficient-data`: "insufficient-data" = "insufficient-data"

  inline def values: js.Array[VolumeStatusInfoStatus] = js.Array(ok, impaired, `insufficient-data`)
}

type VolumeStatusName = "io-enabled" | "io-performance"
object VolumeStatusName {
  inline val `io-enabled`: "io-enabled" = "io-enabled"
  inline val `io-performance`: "io-performance" = "io-performance"

  inline def values: js.Array[VolumeStatusName] = js.Array(`io-enabled`, `io-performance`)
}

type VolumeType = "standard" | "io1" | "io2" | "gp2" | "sc1" | "st1" | "gp3"
object VolumeType {
  inline val standard: "standard" = "standard"
  inline val io1: "io1" = "io1"
  inline val io2: "io2" = "io2"
  inline val gp2: "gp2" = "gp2"
  inline val sc1: "sc1" = "sc1"
  inline val st1: "st1" = "st1"
  inline val gp3: "gp3" = "gp3"

  inline def values: js.Array[VolumeType] = js.Array(standard, io1, io2, gp2, sc1, st1, gp3)
}

type VpcAttributeName = "enableDnsSupport" | "enableDnsHostnames" | "enableNetworkAddressUsageMetrics"
object VpcAttributeName {
  inline val enableDnsSupport: "enableDnsSupport" = "enableDnsSupport"
  inline val enableDnsHostnames: "enableDnsHostnames" = "enableDnsHostnames"
  inline val enableNetworkAddressUsageMetrics: "enableNetworkAddressUsageMetrics" = "enableNetworkAddressUsageMetrics"

  inline def values: js.Array[VpcAttributeName] = js.Array(enableDnsSupport, enableDnsHostnames, enableNetworkAddressUsageMetrics)
}

type VpcCidrBlockStateCode = "associating" | "associated" | "disassociating" | "disassociated" | "failing" | "failed"
object VpcCidrBlockStateCode {
  inline val associating: "associating" = "associating"
  inline val associated: "associated" = "associated"
  inline val disassociating: "disassociating" = "disassociating"
  inline val disassociated: "disassociated" = "disassociated"
  inline val failing: "failing" = "failing"
  inline val failed: "failed" = "failed"

  inline def values: js.Array[VpcCidrBlockStateCode] = js.Array(associating, associated, disassociating, disassociated, failing, failed)
}

type VpcEndpointType = "Interface" | "Gateway" | "GatewayLoadBalancer"
object VpcEndpointType {
  inline val Interface: "Interface" = "Interface"
  inline val Gateway: "Gateway" = "Gateway"
  inline val GatewayLoadBalancer: "GatewayLoadBalancer" = "GatewayLoadBalancer"

  inline def values: js.Array[VpcEndpointType] = js.Array(Interface, Gateway, GatewayLoadBalancer)
}

type VpcPeeringConnectionStateReasonCode = "initiating-request" | "pending-acceptance" | "active" | "deleted" | "rejected" | "failed" | "expired" | "provisioning" | "deleting"
object VpcPeeringConnectionStateReasonCode {
  inline val `initiating-request`: "initiating-request" = "initiating-request"
  inline val `pending-acceptance`: "pending-acceptance" = "pending-acceptance"
  inline val active: "active" = "active"
  inline val deleted: "deleted" = "deleted"
  inline val rejected: "rejected" = "rejected"
  inline val failed: "failed" = "failed"
  inline val expired: "expired" = "expired"
  inline val provisioning: "provisioning" = "provisioning"
  inline val deleting: "deleting" = "deleting"

  inline def values: js.Array[VpcPeeringConnectionStateReasonCode] = js.Array(`initiating-request`, `pending-acceptance`, active, deleted, rejected, failed, expired, provisioning, deleting)
}

type VpcState = "pending" | "available"
object VpcState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"

  inline def values: js.Array[VpcState] = js.Array(pending, available)
}

type VpcTenancy = "default"
object VpcTenancy {
  inline val default: "default" = "default"

  inline def values: js.Array[VpcTenancy] = js.Array(default)
}

type VpnEcmpSupportValue = "enable" | "disable"
object VpnEcmpSupportValue {
  inline val enable: "enable" = "enable"
  inline val disable: "disable" = "disable"

  inline def values: js.Array[VpnEcmpSupportValue] = js.Array(enable, disable)
}

type VpnProtocol = "openvpn"
object VpnProtocol {
  inline val openvpn: "openvpn" = "openvpn"

  inline def values: js.Array[VpnProtocol] = js.Array(openvpn)
}

type VpnState = "pending" | "available" | "deleting" | "deleted"
object VpnState {
  inline val pending: "pending" = "pending"
  inline val available: "available" = "available"
  inline val deleting: "deleting" = "deleting"
  inline val deleted: "deleted" = "deleted"

  inline def values: js.Array[VpnState] = js.Array(pending, available, deleting, deleted)
}

type VpnStaticRouteSource = "Static"
object VpnStaticRouteSource {
  inline val Static: "Static" = "Static"

  inline def values: js.Array[VpnStaticRouteSource] = js.Array(Static)
}

type WeekDay = "sunday" | "monday" | "tuesday" | "wednesday" | "thursday" | "friday" | "saturday"
object WeekDay {
  inline val sunday: "sunday" = "sunday"
  inline val monday: "monday" = "monday"
  inline val tuesday: "tuesday" = "tuesday"
  inline val wednesday: "wednesday" = "wednesday"
  inline val thursday: "thursday" = "thursday"
  inline val friday: "friday" = "friday"
  inline val saturday: "saturday" = "saturday"

  inline def values: js.Array[WeekDay] = js.Array(sunday, monday, tuesday, wednesday, thursday, friday, saturday)
}

type scope = "Availability Zone" | "Region"
object scope {
  inline val `Availability Zone`: "Availability Zone" = "Availability Zone"
  inline val Region: "Region" = "Region"

  inline def values: js.Array[scope] = js.Array(`Availability Zone`, Region)
}
