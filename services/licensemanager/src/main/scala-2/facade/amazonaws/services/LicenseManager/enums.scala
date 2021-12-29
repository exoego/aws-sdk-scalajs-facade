package facade.amazonaws.services.licensemanager

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AllowedOperation extends js.Any
object AllowedOperation {
  val CreateGrant = "CreateGrant".asInstanceOf[AllowedOperation]
  val CheckoutLicense = "CheckoutLicense".asInstanceOf[AllowedOperation]
  val CheckoutBorrowLicense = "CheckoutBorrowLicense".asInstanceOf[AllowedOperation]
  val CheckInLicense = "CheckInLicense".asInstanceOf[AllowedOperation]
  val ExtendConsumptionLicense = "ExtendConsumptionLicense".asInstanceOf[AllowedOperation]
  val ListPurchasedLicenses = "ListPurchasedLicenses".asInstanceOf[AllowedOperation]
  val CreateToken = "CreateToken".asInstanceOf[AllowedOperation]

  @inline def values = js.Array(CreateGrant, CheckoutLicense, CheckoutBorrowLicense, CheckInLicense, ExtendConsumptionLicense, ListPurchasedLicenses, CreateToken)
}

@js.native
sealed trait CheckoutType extends js.Any
object CheckoutType {
  val PROVISIONAL = "PROVISIONAL".asInstanceOf[CheckoutType]

  @inline def values = js.Array(PROVISIONAL)
}

@js.native
sealed trait DigitalSignatureMethod extends js.Any
object DigitalSignatureMethod {
  val JWT_PS384 = "JWT_PS384".asInstanceOf[DigitalSignatureMethod]

  @inline def values = js.Array(JWT_PS384)
}

@js.native
sealed trait EntitlementDataUnit extends js.Any
object EntitlementDataUnit {
  val Count = "Count".asInstanceOf[EntitlementDataUnit]
  val None = "None".asInstanceOf[EntitlementDataUnit]
  val Seconds = "Seconds".asInstanceOf[EntitlementDataUnit]
  val Microseconds = "Microseconds".asInstanceOf[EntitlementDataUnit]
  val Milliseconds = "Milliseconds".asInstanceOf[EntitlementDataUnit]
  val Bytes = "Bytes".asInstanceOf[EntitlementDataUnit]
  val Kilobytes = "Kilobytes".asInstanceOf[EntitlementDataUnit]
  val Megabytes = "Megabytes".asInstanceOf[EntitlementDataUnit]
  val Gigabytes = "Gigabytes".asInstanceOf[EntitlementDataUnit]
  val Terabytes = "Terabytes".asInstanceOf[EntitlementDataUnit]
  val Bits = "Bits".asInstanceOf[EntitlementDataUnit]
  val Kilobits = "Kilobits".asInstanceOf[EntitlementDataUnit]
  val Megabits = "Megabits".asInstanceOf[EntitlementDataUnit]
  val Gigabits = "Gigabits".asInstanceOf[EntitlementDataUnit]
  val Terabits = "Terabits".asInstanceOf[EntitlementDataUnit]
  val Percent = "Percent".asInstanceOf[EntitlementDataUnit]
  val `Bytes/Second` = "Bytes/Second".asInstanceOf[EntitlementDataUnit]
  val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[EntitlementDataUnit]
  val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[EntitlementDataUnit]
  val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[EntitlementDataUnit]
  val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[EntitlementDataUnit]
  val `Bits/Second` = "Bits/Second".asInstanceOf[EntitlementDataUnit]
  val `Kilobits/Second` = "Kilobits/Second".asInstanceOf[EntitlementDataUnit]
  val `Megabits/Second` = "Megabits/Second".asInstanceOf[EntitlementDataUnit]
  val `Gigabits/Second` = "Gigabits/Second".asInstanceOf[EntitlementDataUnit]
  val `Terabits/Second` = "Terabits/Second".asInstanceOf[EntitlementDataUnit]
  val `Count/Second` = "Count/Second".asInstanceOf[EntitlementDataUnit]

  @inline def values = js.Array(Count, None, Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, `Bytes/Second`, `Kilobytes/Second`, `Megabytes/Second`, `Gigabytes/Second`, `Terabytes/Second`, `Bits/Second`, `Kilobits/Second`, `Megabits/Second`, `Gigabits/Second`, `Terabits/Second`, `Count/Second`)
}

@js.native
sealed trait EntitlementUnit extends js.Any
object EntitlementUnit {
  val Count = "Count".asInstanceOf[EntitlementUnit]
  val None = "None".asInstanceOf[EntitlementUnit]
  val Seconds = "Seconds".asInstanceOf[EntitlementUnit]
  val Microseconds = "Microseconds".asInstanceOf[EntitlementUnit]
  val Milliseconds = "Milliseconds".asInstanceOf[EntitlementUnit]
  val Bytes = "Bytes".asInstanceOf[EntitlementUnit]
  val Kilobytes = "Kilobytes".asInstanceOf[EntitlementUnit]
  val Megabytes = "Megabytes".asInstanceOf[EntitlementUnit]
  val Gigabytes = "Gigabytes".asInstanceOf[EntitlementUnit]
  val Terabytes = "Terabytes".asInstanceOf[EntitlementUnit]
  val Bits = "Bits".asInstanceOf[EntitlementUnit]
  val Kilobits = "Kilobits".asInstanceOf[EntitlementUnit]
  val Megabits = "Megabits".asInstanceOf[EntitlementUnit]
  val Gigabits = "Gigabits".asInstanceOf[EntitlementUnit]
  val Terabits = "Terabits".asInstanceOf[EntitlementUnit]
  val Percent = "Percent".asInstanceOf[EntitlementUnit]
  val `Bytes/Second` = "Bytes/Second".asInstanceOf[EntitlementUnit]
  val `Kilobytes/Second` = "Kilobytes/Second".asInstanceOf[EntitlementUnit]
  val `Megabytes/Second` = "Megabytes/Second".asInstanceOf[EntitlementUnit]
  val `Gigabytes/Second` = "Gigabytes/Second".asInstanceOf[EntitlementUnit]
  val `Terabytes/Second` = "Terabytes/Second".asInstanceOf[EntitlementUnit]
  val `Bits/Second` = "Bits/Second".asInstanceOf[EntitlementUnit]
  val `Kilobits/Second` = "Kilobits/Second".asInstanceOf[EntitlementUnit]
  val `Megabits/Second` = "Megabits/Second".asInstanceOf[EntitlementUnit]
  val `Gigabits/Second` = "Gigabits/Second".asInstanceOf[EntitlementUnit]
  val `Terabits/Second` = "Terabits/Second".asInstanceOf[EntitlementUnit]
  val `Count/Second` = "Count/Second".asInstanceOf[EntitlementUnit]

  @inline def values = js.Array(Count, None, Seconds, Microseconds, Milliseconds, Bytes, Kilobytes, Megabytes, Gigabytes, Terabytes, Bits, Kilobits, Megabits, Gigabits, Terabits, Percent, `Bytes/Second`, `Kilobytes/Second`, `Megabytes/Second`, `Gigabytes/Second`, `Terabytes/Second`, `Bits/Second`, `Kilobits/Second`, `Megabits/Second`, `Gigabits/Second`, `Terabits/Second`, `Count/Second`)
}

@js.native
sealed trait GrantStatus extends js.Any
object GrantStatus {
  val PENDING_WORKFLOW = "PENDING_WORKFLOW".asInstanceOf[GrantStatus]
  val PENDING_ACCEPT = "PENDING_ACCEPT".asInstanceOf[GrantStatus]
  val REJECTED = "REJECTED".asInstanceOf[GrantStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[GrantStatus]
  val FAILED_WORKFLOW = "FAILED_WORKFLOW".asInstanceOf[GrantStatus]
  val DELETED = "DELETED".asInstanceOf[GrantStatus]
  val PENDING_DELETE = "PENDING_DELETE".asInstanceOf[GrantStatus]
  val DISABLED = "DISABLED".asInstanceOf[GrantStatus]

  @inline def values = js.Array(PENDING_WORKFLOW, PENDING_ACCEPT, REJECTED, ACTIVE, FAILED_WORKFLOW, DELETED, PENDING_DELETE, DISABLED)
}

@js.native
sealed trait InventoryFilterCondition extends js.Any
object InventoryFilterCondition {
  val EQUALS = "EQUALS".asInstanceOf[InventoryFilterCondition]
  val NOT_EQUALS = "NOT_EQUALS".asInstanceOf[InventoryFilterCondition]
  val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[InventoryFilterCondition]
  val CONTAINS = "CONTAINS".asInstanceOf[InventoryFilterCondition]

  @inline def values = js.Array(EQUALS, NOT_EQUALS, BEGINS_WITH, CONTAINS)
}

@js.native
sealed trait LicenseConfigurationStatus extends js.Any
object LicenseConfigurationStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[LicenseConfigurationStatus]
  val DISABLED = "DISABLED".asInstanceOf[LicenseConfigurationStatus]

  @inline def values = js.Array(AVAILABLE, DISABLED)
}

@js.native
sealed trait LicenseCountingType extends js.Any
object LicenseCountingType {
  val vCPU = "vCPU".asInstanceOf[LicenseCountingType]
  val Instance = "Instance".asInstanceOf[LicenseCountingType]
  val Core = "Core".asInstanceOf[LicenseCountingType]
  val Socket = "Socket".asInstanceOf[LicenseCountingType]

  @inline def values = js.Array(vCPU, Instance, Core, Socket)
}

@js.native
sealed trait LicenseDeletionStatus extends js.Any
object LicenseDeletionStatus {
  val PENDING_DELETE = "PENDING_DELETE".asInstanceOf[LicenseDeletionStatus]
  val DELETED = "DELETED".asInstanceOf[LicenseDeletionStatus]

  @inline def values = js.Array(PENDING_DELETE, DELETED)
}

@js.native
sealed trait LicenseStatus extends js.Any
object LicenseStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[LicenseStatus]
  val PENDING_AVAILABLE = "PENDING_AVAILABLE".asInstanceOf[LicenseStatus]
  val DEACTIVATED = "DEACTIVATED".asInstanceOf[LicenseStatus]
  val SUSPENDED = "SUSPENDED".asInstanceOf[LicenseStatus]
  val EXPIRED = "EXPIRED".asInstanceOf[LicenseStatus]
  val PENDING_DELETE = "PENDING_DELETE".asInstanceOf[LicenseStatus]
  val DELETED = "DELETED".asInstanceOf[LicenseStatus]

  @inline def values = js.Array(AVAILABLE, PENDING_AVAILABLE, DEACTIVATED, SUSPENDED, EXPIRED, PENDING_DELETE, DELETED)
}

@js.native
sealed trait ReceivedStatus extends js.Any
object ReceivedStatus {
  val PENDING_WORKFLOW = "PENDING_WORKFLOW".asInstanceOf[ReceivedStatus]
  val PENDING_ACCEPT = "PENDING_ACCEPT".asInstanceOf[ReceivedStatus]
  val REJECTED = "REJECTED".asInstanceOf[ReceivedStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ReceivedStatus]
  val FAILED_WORKFLOW = "FAILED_WORKFLOW".asInstanceOf[ReceivedStatus]
  val DELETED = "DELETED".asInstanceOf[ReceivedStatus]
  val DISABLED = "DISABLED".asInstanceOf[ReceivedStatus]

  @inline def values = js.Array(PENDING_WORKFLOW, PENDING_ACCEPT, REJECTED, ACTIVE, FAILED_WORKFLOW, DELETED, DISABLED)
}

@js.native
sealed trait RenewType extends js.Any
object RenewType {
  val None = "None".asInstanceOf[RenewType]
  val Weekly = "Weekly".asInstanceOf[RenewType]
  val Monthly = "Monthly".asInstanceOf[RenewType]

  @inline def values = js.Array(None, Weekly, Monthly)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val EC2_INSTANCE = "EC2_INSTANCE".asInstanceOf[ResourceType]
  val EC2_HOST = "EC2_HOST".asInstanceOf[ResourceType]
  val EC2_AMI = "EC2_AMI".asInstanceOf[ResourceType]
  val RDS = "RDS".asInstanceOf[ResourceType]
  val SYSTEMS_MANAGER_MANAGED_INSTANCE = "SYSTEMS_MANAGER_MANAGED_INSTANCE".asInstanceOf[ResourceType]

  @inline def values = js.Array(EC2_INSTANCE, EC2_HOST, EC2_AMI, RDS, SYSTEMS_MANAGER_MANAGED_INSTANCE)
}

@js.native
sealed trait TokenType extends js.Any
object TokenType {
  val REFRESH_TOKEN = "REFRESH_TOKEN".asInstanceOf[TokenType]

  @inline def values = js.Array(REFRESH_TOKEN)
}

