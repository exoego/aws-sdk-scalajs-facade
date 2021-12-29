package facade.amazonaws.services.ssoadmin

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait InstanceAccessControlAttributeConfigurationStatus extends js.Any
object InstanceAccessControlAttributeConfigurationStatus {
  val ENABLED = "ENABLED".asInstanceOf[InstanceAccessControlAttributeConfigurationStatus]
  val CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS".asInstanceOf[InstanceAccessControlAttributeConfigurationStatus]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[InstanceAccessControlAttributeConfigurationStatus]

  @inline def values = js.Array(ENABLED, CREATION_IN_PROGRESS, CREATION_FAILED)
}

@js.native
sealed trait PrincipalType extends js.Any
object PrincipalType {
  val USER = "USER".asInstanceOf[PrincipalType]
  val GROUP = "GROUP".asInstanceOf[PrincipalType]

  @inline def values = js.Array(USER, GROUP)
}

@js.native
sealed trait ProvisionTargetType extends js.Any
object ProvisionTargetType {
  val AWS_ACCOUNT = "AWS_ACCOUNT".asInstanceOf[ProvisionTargetType]
  val ALL_PROVISIONED_ACCOUNTS = "ALL_PROVISIONED_ACCOUNTS".asInstanceOf[ProvisionTargetType]

  @inline def values = js.Array(AWS_ACCOUNT, ALL_PROVISIONED_ACCOUNTS)
}

@js.native
sealed trait ProvisioningStatus extends js.Any
object ProvisioningStatus {
  val LATEST_PERMISSION_SET_PROVISIONED = "LATEST_PERMISSION_SET_PROVISIONED".asInstanceOf[ProvisioningStatus]
  val LATEST_PERMISSION_SET_NOT_PROVISIONED = "LATEST_PERMISSION_SET_NOT_PROVISIONED".asInstanceOf[ProvisioningStatus]

  @inline def values = js.Array(LATEST_PERMISSION_SET_PROVISIONED, LATEST_PERMISSION_SET_NOT_PROVISIONED)
}

@js.native
sealed trait StatusValues extends js.Any
object StatusValues {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[StatusValues]
  val FAILED = "FAILED".asInstanceOf[StatusValues]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[StatusValues]

  @inline def values = js.Array(IN_PROGRESS, FAILED, SUCCEEDED)
}

@js.native
sealed trait TargetType extends js.Any
object TargetType {
  val AWS_ACCOUNT = "AWS_ACCOUNT".asInstanceOf[TargetType]

  @inline def values = js.Array(AWS_ACCOUNT)
}

