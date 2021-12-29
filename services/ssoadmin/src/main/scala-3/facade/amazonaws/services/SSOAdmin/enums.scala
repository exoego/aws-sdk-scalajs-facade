package facade.amazonaws.services.ssoadmin

import scalajs._

type InstanceAccessControlAttributeConfigurationStatus = "ENABLED" | "CREATION_IN_PROGRESS" | "CREATION_FAILED"
object InstanceAccessControlAttributeConfigurationStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val CREATION_IN_PROGRESS: "CREATION_IN_PROGRESS" = "CREATION_IN_PROGRESS"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"

  inline def values: js.Array[InstanceAccessControlAttributeConfigurationStatus] = js.Array(ENABLED, CREATION_IN_PROGRESS, CREATION_FAILED)
}

type PrincipalType = "USER" | "GROUP"
object PrincipalType {
  inline val USER: "USER" = "USER"
  inline val GROUP: "GROUP" = "GROUP"

  inline def values: js.Array[PrincipalType] = js.Array(USER, GROUP)
}

type ProvisionTargetType = "AWS_ACCOUNT" | "ALL_PROVISIONED_ACCOUNTS"
object ProvisionTargetType {
  inline val AWS_ACCOUNT: "AWS_ACCOUNT" = "AWS_ACCOUNT"
  inline val ALL_PROVISIONED_ACCOUNTS: "ALL_PROVISIONED_ACCOUNTS" = "ALL_PROVISIONED_ACCOUNTS"

  inline def values: js.Array[ProvisionTargetType] = js.Array(AWS_ACCOUNT, ALL_PROVISIONED_ACCOUNTS)
}

type ProvisioningStatus = "LATEST_PERMISSION_SET_PROVISIONED" | "LATEST_PERMISSION_SET_NOT_PROVISIONED"
object ProvisioningStatus {
  inline val LATEST_PERMISSION_SET_PROVISIONED: "LATEST_PERMISSION_SET_PROVISIONED" = "LATEST_PERMISSION_SET_PROVISIONED"
  inline val LATEST_PERMISSION_SET_NOT_PROVISIONED: "LATEST_PERMISSION_SET_NOT_PROVISIONED" = "LATEST_PERMISSION_SET_NOT_PROVISIONED"

  inline def values: js.Array[ProvisioningStatus] = js.Array(LATEST_PERMISSION_SET_PROVISIONED, LATEST_PERMISSION_SET_NOT_PROVISIONED)
}

type StatusValues = "IN_PROGRESS" | "FAILED" | "SUCCEEDED"
object StatusValues {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"

  inline def values: js.Array[StatusValues] = js.Array(IN_PROGRESS, FAILED, SUCCEEDED)
}

type TargetType = "AWS_ACCOUNT"
object TargetType {
  inline val AWS_ACCOUNT: "AWS_ACCOUNT" = "AWS_ACCOUNT"

  inline def values: js.Array[TargetType] = js.Array(AWS_ACCOUNT)
}
