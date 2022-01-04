package facade.amazonaws.services.grafana

import scalajs.js

type AccountAccessType = "CURRENT_ACCOUNT" | "ORGANIZATION"
object AccountAccessType {
  inline val CURRENT_ACCOUNT: "CURRENT_ACCOUNT" = "CURRENT_ACCOUNT"
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"

  inline def values: js.Array[AccountAccessType] = js.Array(CURRENT_ACCOUNT, ORGANIZATION)
}

type AuthenticationProviderTypes = "AWS_SSO" | "SAML"
object AuthenticationProviderTypes {
  inline val AWS_SSO: "AWS_SSO" = "AWS_SSO"
  inline val SAML: "SAML" = "SAML"

  inline def values: js.Array[AuthenticationProviderTypes] = js.Array(AWS_SSO, SAML)
}

type DataSourceType = "AMAZON_OPENSEARCH_SERVICE" | "CLOUDWATCH" | "PROMETHEUS" | "XRAY" | "TIMESTREAM" | "SITEWISE"
object DataSourceType {
  inline val AMAZON_OPENSEARCH_SERVICE: "AMAZON_OPENSEARCH_SERVICE" = "AMAZON_OPENSEARCH_SERVICE"
  inline val CLOUDWATCH: "CLOUDWATCH" = "CLOUDWATCH"
  inline val PROMETHEUS: "PROMETHEUS" = "PROMETHEUS"
  inline val XRAY: "XRAY" = "XRAY"
  inline val TIMESTREAM: "TIMESTREAM" = "TIMESTREAM"
  inline val SITEWISE: "SITEWISE" = "SITEWISE"

  inline def values: js.Array[DataSourceType] = js.Array(AMAZON_OPENSEARCH_SERVICE, CLOUDWATCH, PROMETHEUS, XRAY, TIMESTREAM, SITEWISE)
}

type LicenseType = "ENTERPRISE" | "ENTERPRISE_FREE_TRIAL"
object LicenseType {
  inline val ENTERPRISE: "ENTERPRISE" = "ENTERPRISE"
  inline val ENTERPRISE_FREE_TRIAL: "ENTERPRISE_FREE_TRIAL" = "ENTERPRISE_FREE_TRIAL"

  inline def values: js.Array[LicenseType] = js.Array(ENTERPRISE, ENTERPRISE_FREE_TRIAL)
}

type NotificationDestinationType = "SNS"
object NotificationDestinationType {
  inline val SNS: "SNS" = "SNS"

  inline def values: js.Array[NotificationDestinationType] = js.Array(SNS)
}

type PermissionType = "CUSTOMER_MANAGED" | "SERVICE_MANAGED"
object PermissionType {
  inline val CUSTOMER_MANAGED: "CUSTOMER_MANAGED" = "CUSTOMER_MANAGED"
  inline val SERVICE_MANAGED: "SERVICE_MANAGED" = "SERVICE_MANAGED"

  inline def values: js.Array[PermissionType] = js.Array(CUSTOMER_MANAGED, SERVICE_MANAGED)
}

type Role = "ADMIN" | "EDITOR"
object Role {
  inline val ADMIN: "ADMIN" = "ADMIN"
  inline val EDITOR: "EDITOR" = "EDITOR"

  inline def values: js.Array[Role] = js.Array(ADMIN, EDITOR)
}

type SamlConfigurationStatus = "CONFIGURED" | "NOT_CONFIGURED"
object SamlConfigurationStatus {
  inline val CONFIGURED: "CONFIGURED" = "CONFIGURED"
  inline val NOT_CONFIGURED: "NOT_CONFIGURED" = "NOT_CONFIGURED"

  inline def values: js.Array[SamlConfigurationStatus] = js.Array(CONFIGURED, NOT_CONFIGURED)
}

type UpdateAction = "ADD" | "REVOKE"
object UpdateAction {
  inline val ADD: "ADD" = "ADD"
  inline val REVOKE: "REVOKE" = "REVOKE"

  inline def values: js.Array[UpdateAction] = js.Array(ADD, REVOKE)
}

type UserType = "SSO_USER" | "SSO_GROUP"
object UserType {
  inline val SSO_USER: "SSO_USER" = "SSO_USER"
  inline val SSO_GROUP: "SSO_GROUP" = "SSO_GROUP"

  inline def values: js.Array[UserType] = js.Array(SSO_USER, SSO_GROUP)
}

type WorkspaceStatus = "ACTIVE" | "CREATING" | "DELETING" | "FAILED" | "UPDATING" | "UPGRADING" | "DELETION_FAILED" | "CREATION_FAILED" | "UPDATE_FAILED" | "UPGRADE_FAILED" | "LICENSE_REMOVAL_FAILED"
object WorkspaceStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val UPGRADING: "UPGRADING" = "UPGRADING"
  inline val DELETION_FAILED: "DELETION_FAILED" = "DELETION_FAILED"
  inline val CREATION_FAILED: "CREATION_FAILED" = "CREATION_FAILED"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  inline val UPGRADE_FAILED: "UPGRADE_FAILED" = "UPGRADE_FAILED"
  inline val LICENSE_REMOVAL_FAILED: "LICENSE_REMOVAL_FAILED" = "LICENSE_REMOVAL_FAILED"

  inline def values: js.Array[WorkspaceStatus] = js.Array(ACTIVE, CREATING, DELETING, FAILED, UPDATING, UPGRADING, DELETION_FAILED, CREATION_FAILED, UPDATE_FAILED, UPGRADE_FAILED, LICENSE_REMOVAL_FAILED)
}
