package facade.amazonaws.services.licensemanager

import scalajs.js

type AllowedOperation = "CreateGrant" | "CheckoutLicense" | "CheckoutBorrowLicense" | "CheckInLicense" | "ExtendConsumptionLicense" | "ListPurchasedLicenses" | "CreateToken"
object AllowedOperation {
  inline val CreateGrant: "CreateGrant" = "CreateGrant"
  inline val CheckoutLicense: "CheckoutLicense" = "CheckoutLicense"
  inline val CheckoutBorrowLicense: "CheckoutBorrowLicense" = "CheckoutBorrowLicense"
  inline val CheckInLicense: "CheckInLicense" = "CheckInLicense"
  inline val ExtendConsumptionLicense: "ExtendConsumptionLicense" = "ExtendConsumptionLicense"
  inline val ListPurchasedLicenses: "ListPurchasedLicenses" = "ListPurchasedLicenses"
  inline val CreateToken: "CreateToken" = "CreateToken"

  inline def values: js.Array[AllowedOperation] = js.Array(CreateGrant, CheckoutLicense, CheckoutBorrowLicense, CheckInLicense, ExtendConsumptionLicense, ListPurchasedLicenses, CreateToken)
}

type CheckoutType = "PROVISIONAL" | "PERPETUAL"
object CheckoutType {
  inline val PROVISIONAL: "PROVISIONAL" = "PROVISIONAL"
  inline val PERPETUAL: "PERPETUAL" = "PERPETUAL"

  inline def values: js.Array[CheckoutType] = js.Array(PROVISIONAL, PERPETUAL)
}

type DigitalSignatureMethod = "JWT_PS384"
object DigitalSignatureMethod {
  inline val JWT_PS384: "JWT_PS384" = "JWT_PS384"

  inline def values: js.Array[DigitalSignatureMethod] = js.Array(JWT_PS384)
}

type EntitlementDataUnit = "Count" | "None" | "Seconds" | "Microseconds" | "Milliseconds" | "Bytes" | "Kilobytes" | "Megabytes" | "Gigabytes" | "Terabytes" | "Bits" | "Kilobits" | "Megabits" | "Gigabits" | "Terabits" | "Percent" | "Bytes/Second" | "Kilobytes/Second" | "Megabytes/Second" | "Gigabytes/Second" | "Terabytes/Second" | "Bits/Second" | "Kilobits/Second" | "Megabits/Second" | "Gigabits/Second" | "Terabits/Second" | "Count/Second"
object EntitlementDataUnit {
  inline val Count: "Count" = "Count"
  inline val None: "None" = "None"
  inline val Seconds: "Seconds" = "Seconds"
  inline val Microseconds: "Microseconds" = "Microseconds"
  inline val Milliseconds: "Milliseconds" = "Milliseconds"
  inline val Bytes: "Bytes" = "Bytes"
  inline val Kilobytes: "Kilobytes" = "Kilobytes"
  inline val Megabytes: "Megabytes" = "Megabytes"
  inline val Gigabytes: "Gigabytes" = "Gigabytes"
  inline val Terabytes: "Terabytes" = "Terabytes"
  inline val Bits: "Bits" = "Bits"
  inline val Kilobits: "Kilobits" = "Kilobits"
  inline val Megabits: "Megabits" = "Megabits"
  inline val Gigabits: "Gigabits" = "Gigabits"
  inline val Terabits: "Terabits" = "Terabits"
  inline val Percent: "Percent" = "Percent"
  inline val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  inline val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  inline val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  inline val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  inline val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  inline val `Bits/Second`: "Bits/Second" = "Bits/Second"
  inline val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  inline val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  inline val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  inline val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  inline val `Count/Second`: "Count/Second" = "Count/Second"

  inline def values: js.Array[EntitlementDataUnit] = js.Array(
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
  inline val Count: "Count" = "Count"
  inline val None: "None" = "None"
  inline val Seconds: "Seconds" = "Seconds"
  inline val Microseconds: "Microseconds" = "Microseconds"
  inline val Milliseconds: "Milliseconds" = "Milliseconds"
  inline val Bytes: "Bytes" = "Bytes"
  inline val Kilobytes: "Kilobytes" = "Kilobytes"
  inline val Megabytes: "Megabytes" = "Megabytes"
  inline val Gigabytes: "Gigabytes" = "Gigabytes"
  inline val Terabytes: "Terabytes" = "Terabytes"
  inline val Bits: "Bits" = "Bits"
  inline val Kilobits: "Kilobits" = "Kilobits"
  inline val Megabits: "Megabits" = "Megabits"
  inline val Gigabits: "Gigabits" = "Gigabits"
  inline val Terabits: "Terabits" = "Terabits"
  inline val Percent: "Percent" = "Percent"
  inline val `Bytes/Second`: "Bytes/Second" = "Bytes/Second"
  inline val `Kilobytes/Second`: "Kilobytes/Second" = "Kilobytes/Second"
  inline val `Megabytes/Second`: "Megabytes/Second" = "Megabytes/Second"
  inline val `Gigabytes/Second`: "Gigabytes/Second" = "Gigabytes/Second"
  inline val `Terabytes/Second`: "Terabytes/Second" = "Terabytes/Second"
  inline val `Bits/Second`: "Bits/Second" = "Bits/Second"
  inline val `Kilobits/Second`: "Kilobits/Second" = "Kilobits/Second"
  inline val `Megabits/Second`: "Megabits/Second" = "Megabits/Second"
  inline val `Gigabits/Second`: "Gigabits/Second" = "Gigabits/Second"
  inline val `Terabits/Second`: "Terabits/Second" = "Terabits/Second"
  inline val `Count/Second`: "Count/Second" = "Count/Second"

  inline def values: js.Array[EntitlementUnit] = js.Array(
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

type GrantStatus = "PENDING_WORKFLOW" | "PENDING_ACCEPT" | "REJECTED" | "ACTIVE" | "FAILED_WORKFLOW" | "DELETED" | "PENDING_DELETE" | "DISABLED" | "WORKFLOW_COMPLETED"
object GrantStatus {
  inline val PENDING_WORKFLOW: "PENDING_WORKFLOW" = "PENDING_WORKFLOW"
  inline val PENDING_ACCEPT: "PENDING_ACCEPT" = "PENDING_ACCEPT"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val FAILED_WORKFLOW: "FAILED_WORKFLOW" = "FAILED_WORKFLOW"
  inline val DELETED: "DELETED" = "DELETED"
  inline val PENDING_DELETE: "PENDING_DELETE" = "PENDING_DELETE"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val WORKFLOW_COMPLETED: "WORKFLOW_COMPLETED" = "WORKFLOW_COMPLETED"

  inline def values: js.Array[GrantStatus] = js.Array(PENDING_WORKFLOW, PENDING_ACCEPT, REJECTED, ACTIVE, FAILED_WORKFLOW, DELETED, PENDING_DELETE, DISABLED, WORKFLOW_COMPLETED)
}

type InventoryFilterCondition = "EQUALS" | "NOT_EQUALS" | "BEGINS_WITH" | "CONTAINS"
object InventoryFilterCondition {
  inline val EQUALS: "EQUALS" = "EQUALS"
  inline val NOT_EQUALS: "NOT_EQUALS" = "NOT_EQUALS"
  inline val BEGINS_WITH: "BEGINS_WITH" = "BEGINS_WITH"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"

  inline def values: js.Array[InventoryFilterCondition] = js.Array(EQUALS, NOT_EQUALS, BEGINS_WITH, CONTAINS)
}

type LicenseConfigurationStatus = "AVAILABLE" | "DISABLED"
object LicenseConfigurationStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[LicenseConfigurationStatus] = js.Array(AVAILABLE, DISABLED)
}

type LicenseConversionTaskStatus = "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object LicenseConversionTaskStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[LicenseConversionTaskStatus] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

type LicenseCountingType = "vCPU" | "Instance" | "Core" | "Socket"
object LicenseCountingType {
  inline val vCPU: "vCPU" = "vCPU"
  inline val Instance: "Instance" = "Instance"
  inline val Core: "Core" = "Core"
  inline val Socket: "Socket" = "Socket"

  inline def values: js.Array[LicenseCountingType] = js.Array(vCPU, Instance, Core, Socket)
}

type LicenseDeletionStatus = "PENDING_DELETE" | "DELETED"
object LicenseDeletionStatus {
  inline val PENDING_DELETE: "PENDING_DELETE" = "PENDING_DELETE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[LicenseDeletionStatus] = js.Array(PENDING_DELETE, DELETED)
}

type LicenseStatus = "AVAILABLE" | "PENDING_AVAILABLE" | "DEACTIVATED" | "SUSPENDED" | "EXPIRED" | "PENDING_DELETE" | "DELETED"
object LicenseStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PENDING_AVAILABLE: "PENDING_AVAILABLE" = "PENDING_AVAILABLE"
  inline val DEACTIVATED: "DEACTIVATED" = "DEACTIVATED"
  inline val SUSPENDED: "SUSPENDED" = "SUSPENDED"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"
  inline val PENDING_DELETE: "PENDING_DELETE" = "PENDING_DELETE"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[LicenseStatus] = js.Array(AVAILABLE, PENDING_AVAILABLE, DEACTIVATED, SUSPENDED, EXPIRED, PENDING_DELETE, DELETED)
}

type ReceivedStatus = "PENDING_WORKFLOW" | "PENDING_ACCEPT" | "REJECTED" | "ACTIVE" | "FAILED_WORKFLOW" | "DELETED" | "DISABLED" | "WORKFLOW_COMPLETED"
object ReceivedStatus {
  inline val PENDING_WORKFLOW: "PENDING_WORKFLOW" = "PENDING_WORKFLOW"
  inline val PENDING_ACCEPT: "PENDING_ACCEPT" = "PENDING_ACCEPT"
  inline val REJECTED: "REJECTED" = "REJECTED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val FAILED_WORKFLOW: "FAILED_WORKFLOW" = "FAILED_WORKFLOW"
  inline val DELETED: "DELETED" = "DELETED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val WORKFLOW_COMPLETED: "WORKFLOW_COMPLETED" = "WORKFLOW_COMPLETED"

  inline def values: js.Array[ReceivedStatus] = js.Array(PENDING_WORKFLOW, PENDING_ACCEPT, REJECTED, ACTIVE, FAILED_WORKFLOW, DELETED, DISABLED, WORKFLOW_COMPLETED)
}

type RenewType = "None" | "Weekly" | "Monthly"
object RenewType {
  inline val None: "None" = "None"
  inline val Weekly: "Weekly" = "Weekly"
  inline val Monthly: "Monthly" = "Monthly"

  inline def values: js.Array[RenewType] = js.Array(None, Weekly, Monthly)
}

type ReportFrequencyType = "DAY" | "WEEK" | "MONTH"
object ReportFrequencyType {
  inline val DAY: "DAY" = "DAY"
  inline val WEEK: "WEEK" = "WEEK"
  inline val MONTH: "MONTH" = "MONTH"

  inline def values: js.Array[ReportFrequencyType] = js.Array(DAY, WEEK, MONTH)
}

type ReportType = "LicenseConfigurationSummaryReport" | "LicenseConfigurationUsageReport"
object ReportType {
  inline val LicenseConfigurationSummaryReport: "LicenseConfigurationSummaryReport" = "LicenseConfigurationSummaryReport"
  inline val LicenseConfigurationUsageReport: "LicenseConfigurationUsageReport" = "LicenseConfigurationUsageReport"

  inline def values: js.Array[ReportType] = js.Array(LicenseConfigurationSummaryReport, LicenseConfigurationUsageReport)
}

type ResourceType = "EC2_INSTANCE" | "EC2_HOST" | "EC2_AMI" | "RDS" | "SYSTEMS_MANAGER_MANAGED_INSTANCE"
object ResourceType {
  inline val EC2_INSTANCE: "EC2_INSTANCE" = "EC2_INSTANCE"
  inline val EC2_HOST: "EC2_HOST" = "EC2_HOST"
  inline val EC2_AMI: "EC2_AMI" = "EC2_AMI"
  inline val RDS: "RDS" = "RDS"
  inline val SYSTEMS_MANAGER_MANAGED_INSTANCE: "SYSTEMS_MANAGER_MANAGED_INSTANCE" = "SYSTEMS_MANAGER_MANAGED_INSTANCE"

  inline def values: js.Array[ResourceType] = js.Array(EC2_INSTANCE, EC2_HOST, EC2_AMI, RDS, SYSTEMS_MANAGER_MANAGED_INSTANCE)
}

type TokenType = "REFRESH_TOKEN"
object TokenType {
  inline val REFRESH_TOKEN: "REFRESH_TOKEN" = "REFRESH_TOKEN"

  inline def values: js.Array[TokenType] = js.Array(REFRESH_TOKEN)
}
