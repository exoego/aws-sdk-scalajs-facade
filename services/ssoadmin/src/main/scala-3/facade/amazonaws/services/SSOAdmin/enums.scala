package facade.amazonaws.services.ssoadmin

import scalajs._

type InstanceAccessControlAttributeConfigurationStatus = "ENABLED" | "CREATION_IN_PROGRESS" | "CREATION_FAILED"
object InstanceAccessControlAttributeConfigurationStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val CREATION_IN_PROGRESS: "CREATION_IN_PROGRESS" = "CREATION_IN_PROGRESS"
  val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"

  @inline def values = js.Array[InstanceAccessControlAttributeConfigurationStatus](ENABLED, CREATION_IN_PROGRESS, CREATION_FAILED)
}

type PrincipalType = "USER" | "GROUP"
object PrincipalType {
  val USER: "USER" = "USER"
  val GROUP: "GROUP" = "GROUP"

  @inline def values = js.Array[PrincipalType](USER, GROUP)
}

type ProvisionTargetType = "AWS_ACCOUNT" | "ALL_PROVISIONED_ACCOUNTS"
object ProvisionTargetType {
  val AWS_ACCOUNT: "AWS_ACCOUNT" = "AWS_ACCOUNT"
  val ALL_PROVISIONED_ACCOUNTS: "ALL_PROVISIONED_ACCOUNTS" = "ALL_PROVISIONED_ACCOUNTS"

  @inline def values = js.Array[ProvisionTargetType](AWS_ACCOUNT, ALL_PROVISIONED_ACCOUNTS)
}

type ProvisioningStatus = "LATEST_PERMISSION_SET_PROVISIONED" | "LATEST_PERMISSION_SET_NOT_PROVISIONED"
object ProvisioningStatus {
  val LATEST_PERMISSION_SET_PROVISIONED: "LATEST_PERMISSION_SET_PROVISIONED" = "LATEST_PERMISSION_SET_PROVISIONED"
  val LATEST_PERMISSION_SET_NOT_PROVISIONED: "LATEST_PERMISSION_SET_NOT_PROVISIONED" = "LATEST_PERMISSION_SET_NOT_PROVISIONED"

  @inline def values = js.Array[ProvisioningStatus](LATEST_PERMISSION_SET_PROVISIONED, LATEST_PERMISSION_SET_NOT_PROVISIONED)
}

type StatusValues = "IN_PROGRESS" | "FAILED" | "SUCCEEDED"
object StatusValues {
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val FAILED: "FAILED" = "FAILED"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"

  @inline def values = js.Array[StatusValues](IN_PROGRESS, FAILED, SUCCEEDED)
}

type TargetType = "AWS_ACCOUNT"
object TargetType {
  val AWS_ACCOUNT: "AWS_ACCOUNT" = "AWS_ACCOUNT"

  @inline def values = js.Array[TargetType](AWS_ACCOUNT)
}
