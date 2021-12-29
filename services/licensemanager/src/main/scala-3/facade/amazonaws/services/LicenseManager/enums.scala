package facade.amazonaws.services.licensemanager

import scalajs._

type AllowedOperation = "CreateGrant" | "CheckoutLicense" | "CheckoutBorrowLicense" | "CheckInLicense" | "ExtendConsumptionLicense" | "ListPurchasedLicenses" | "CreateToken"
object AllowedOperation {
  val CreateGrant: "CreateGrant" = "CreateGrant"
  val CheckoutLicense: "CheckoutLicense" = "CheckoutLicense"
  val CheckoutBorrowLicense: "CheckoutBorrowLicense" = "CheckoutBorrowLicense"
  val CheckInLicense: "CheckInLicense" = "CheckInLicense"
  val ExtendConsumptionLicense: "ExtendConsumptionLicense" = "ExtendConsumptionLicense"
  val ListPurchasedLicenses: "ListPurchasedLicenses" = "ListPurchasedLicenses"
  val CreateToken: "CreateToken" = "CreateToken"

  @inline def values = js.Array[AllowedOperation](CreateGrant, CheckoutLicense, CheckoutBorrowLicense, CheckInLicense, ExtendConsumptionLicense, ListPurchasedLicenses, CreateToken)
}

type CheckoutType = "PROVISIONAL"
object CheckoutType {
  val PROVISIONAL: "PROVISIONAL" = "PROVISIONAL"

  @inline def values = js.Array[CheckoutType](PROVISIONAL)
}

type DigitalSignatureMethod = "JWT_PS384"
object DigitalSignatureMethod {
  val JWT_PS384: "JWT_PS384" = "JWT_PS384"

  @inline def values = js.Array[DigitalSignatureMethod](JWT_PS384)
}

type EntitlementDataUnit = "Count" | "None" | "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second"
object EntitlementDataUnit {
  val Count: "Count" = "Count"
  val None: "None" = "None"
  val Seconds: "Seconds" = "Seconds"
  val Microseconds: "Microseconds" = "Microseconds"
  val Milliseconds: "Milliseconds" = "Milliseconds"
  val Bytes: "Bytes" = "Bytes"
  val Kilobytes: "Kilobytes" = "Kilobytes"
  val Megabytes: "Megabytes" = "Megabytes"
  val Gigabytes: "Gigabytes" = "Gigabytes"
  val Terabytes: "Terabytes" = "Terabytes"
  val Bits: "Bits" = "Bits"
  val Kilobits: "Kilobits" = "Kilobits"
  val Megabits: "Megabits" = "Megabits"
  val Gigabits: "Gigabits" = "Gigabits"
  val Terabits: "Terabits" = "Terabits"
  val Percent: "Percent" = "Percent"
  val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  val `Bits/Second`: "Bits/Second" = "Bits/Second"
  val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  val `Count/Second`: "Count/Second" = "Count/Second"

  @inline def values = js.Array[EntitlementDataUnit](
    Count,
    None,
    Seconds,
    Microseconds,
    Milliseconds,
    Bytes,
    Kilobytes,
    Megabytes,
    Gigabytes,
    Terabytes,
    Bits,
    Kilobits,
    Megabits,
    Gigabits,
    Terabits,
    Percent,
    `Bytes/Second`,
    `Kilobytes/Second`,
    `Megabytes/Second`,
    `Gigabytes/Second`,
    `Terabytes/Second`,
    `Bits/Second`,
    `Kilobits/Second`,
    `Megabits/Second`,
    `Gigabits/Second`,
    `Terabits/Second`,
    `Count/Second`
  )
}

type EntitlementUnit = "Count" | "None" | "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second"
object EntitlementUnit {
  val Count: "Count" = "Count"
  val None: "None" = "None"
  val Seconds: "Seconds" = "Seconds"
  val Microseconds: "Microseconds" = "Microseconds"
  val Milliseconds: "Milliseconds" = "Milliseconds"
  val Bytes: "Bytes" = "Bytes"
  val Kilobytes: "Kilobytes" = "Kilobytes"
  val Megabytes: "Megabytes" = "Megabytes"
  val Gigabytes: "Gigabytes" = "Gigabytes"
  val Terabytes: "Terabytes" = "Terabytes"
  val Bits: "Bits" = "Bits"
  val Kilobits: "Kilobits" = "Kilobits"
  val Megabits: "Megabits" = "Megabits"
  val Gigabits: "Gigabits" = "Gigabits"
  val Terabits: "Terabits" = "Terabits"
  val Percent: "Percent" = "Percent"
  val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  val `Bits/Second`: "Bits/Second" = "Bits/Second"
  val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  val `Count/Second`: "Count/Second" = "Count/Second"

  @inline def values = js.Array[EntitlementUnit](
    Count,
    None,
    Seconds,
    Microseconds,
    Milliseconds,
    Bytes,
    Kilobytes,
    Megabytes,
    Gigabytes,
    Terabytes,
    Bits,
    Kilobits,
    Megabits,
    Gigabits,
    Terabits,
    Percent,
    `Bytes/Second`,
    `Kilobytes/Second`,
    `Megabytes/Second`,
    `Gigabytes/Second`,
    `Terabytes/Second`,
    `Bits/Second`,
    `Kilobits/Second`,
    `Megabits/Second`,
    `Gigabits/Second`,
    `Terabits/Second`,
    `Count/Second`
  )
}

type GrantStatus = "PENDING_WORKFLOW" | "PENDING_ACCEPT" | "REJECTED" | "ACTIVE" | "FAILED_WORKFLOW" | "DELETED" | "PENDING_DELETE" | "DISABLED"
object GrantStatus {
  val PENDING_WORKFLOW: "PENDING_WORKFLOW" = "PENDING_WORKFLOW"
  val PENDING_ACCEPT: "PENDING_ACCEPT" = "PENDING_ACCEPT"
  val REJECTED: "REJECTED" = "REJECTED"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val FAILED_WORKFLOW: "FAILED_WORKFLOW" = "FAILED_WORKFLOW"
  val DELETED: "DELETED" = "DELETED"
  val PENDING_DELETE: "PENDING_DELETE" = "PENDING_DELETE"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[GrantStatus](PENDING_WORKFLOW, PENDING_ACCEPT, REJECTED, ACTIVE, FAILED_WORKFLOW, DELETED, PENDING_DELETE, DISABLED)
}

type InventoryFilterCondition = "EQUALS" | "NOT_EQUALS" | "BEGINS_WITH" | "CONTAINS"
object InventoryFilterCondition {
  val EQUALS: "EQUALS" = "EQUALS"
  val NOT_EQUALS: "NOT_EQUALS" = "NOT_EQUALS"
  val BEGINS_WITH: "BEGINS_WITH" = "BEGINS_WITH"
  val CONTAINS: "CONTAINS" = "CONTAINS"

  @inline def values = js.Array[InventoryFilterCondition](EQUALS, NOT_EQUALS, BEGINS_WITH, CONTAINS)
}

type LicenseConfigurationStatus = "AVAILABLE" | "DISABLED"
object LicenseConfigurationStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[LicenseConfigurationStatus](AVAILABLE, DISABLED)
}

type LicenseCountingType = "vCPU" | "Instance" | "Core" | "Socket"
object LicenseCountingType {
  val vCPU: "vCPU" = "vCPU"
  val Instance: "Instance" = "Instance"
  val Core: "Core" = "Core"
  val Socket: "Socket" = "Socket"

  @inline def values = js.Array[LicenseCountingType](vCPU, Instance, Core, Socket)
}

type LicenseDeletionStatus = "PENDING_DELETE" | "DELETED"
object LicenseDeletionStatus {
  val PENDING_DELETE: "PENDING_DELETE" = "PENDING_DELETE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[LicenseDeletionStatus](PENDING_DELETE, DELETED)
}

type LicenseStatus = "AVAILABLE" | "PENDING_AVAILABLE" | "DEACTIVATED" | "SUSPENDED" | "EXPIRED" | "PENDING_DELETE" | "DELETED"
object LicenseStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val PENDING_AVAILABLE: "PENDING_AVAILABLE" = "PENDING_AVAILABLE"
  val DEACTIVATED: "DEACTIVATED" = "DEACTIVATED"
  val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  val EXPIRED: "EXPIRED" = "EXPIRED"
  val PENDING_DELETE: "PENDING_DELETE" = "PENDING_DELETE"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[LicenseStatus](AVAILABLE, PENDING_AVAILABLE, DEACTIVATED, SUSPENDED, EXPIRED, PENDING_DELETE, DELETED)
}

type ReceivedStatus = "PENDING_WORKFLOW" | "PENDING_ACCEPT" | "REJECTED" | "ACTIVE" | "FAILED_WORKFLOW" | "DELETED" | "DISABLED"
object ReceivedStatus {
  val PENDING_WORKFLOW: "PENDING_WORKFLOW" = "PENDING_WORKFLOW"
  val PENDING_ACCEPT: "PENDING_ACCEPT" = "PENDING_ACCEPT"
  val REJECTED: "REJECTED" = "REJECTED"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val FAILED_WORKFLOW: "FAILED_WORKFLOW" = "FAILED_WORKFLOW"
  val DELETED: "DELETED" = "DELETED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[ReceivedStatus](PENDING_WORKFLOW, PENDING_ACCEPT, REJECTED, ACTIVE, FAILED_WORKFLOW, DELETED, DISABLED)
}

type RenewType = "None" | "Weekly" | "Monthly"
object RenewType {
  val None: "None" = "None"
  val Weekly: "Weekly" = "Weekly"
  val Monthly: "Monthly" = "Monthly"

  @inline def values = js.Array[RenewType](None, Weekly, Monthly)
}

type ResourceType = "EC2_INSTANCE" | "EC2_HOST" | "EC2_AMI" | "RDS" | "SYSTEMS_MANAGER_MANAGED_INSTANCE"
object ResourceType {
  val EC2_INSTANCE: "EC2_INSTANCE" = "EC2_INSTANCE"
  val EC2_HOST: "EC2_HOST" = "EC2_HOST"
  val EC2_AMI: "EC2_AMI" = "EC2_AMI"
  val RDS: "RDS" = "RDS"
  val SYSTEMS_MANAGER_MANAGED_INSTANCE: "SYSTEMS_MANAGER_MANAGED_INSTANCE" = "SYSTEMS_MANAGER_MANAGED_INSTANCE"

  @inline def values = js.Array[ResourceType](EC2_INSTANCE, EC2_HOST, EC2_AMI, RDS, SYSTEMS_MANAGER_MANAGED_INSTANCE)
}

type TokenType = "REFRESH_TOKEN"
object TokenType {
  val REFRESH_TOKEN: "REFRESH_TOKEN" = "REFRESH_TOKEN"

  @inline def values = js.Array[TokenType](REFRESH_TOKEN)
}
