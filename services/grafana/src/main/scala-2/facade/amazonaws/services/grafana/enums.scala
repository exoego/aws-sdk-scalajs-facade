package facade.amazonaws.services.grafana

import scalajs.js

@js.native
sealed trait AccountAccessType extends js.Any
object AccountAccessType {
  val CURRENT_ACCOUNT = "CURRENT_ACCOUNT".asInstanceOf[AccountAccessType]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[AccountAccessType]

  @inline def values: js.Array[AccountAccessType] = js.Array(CURRENT_ACCOUNT, ORGANIZATION)
}

@js.native
sealed trait AuthenticationProviderTypes extends js.Any
object AuthenticationProviderTypes {
  val AWS_SSO = "AWS_SSO".asInstanceOf[AuthenticationProviderTypes]
  val SAML = "SAML".asInstanceOf[AuthenticationProviderTypes]

  @inline def values: js.Array[AuthenticationProviderTypes] = js.Array(AWS_SSO, SAML)
}

@js.native
sealed trait DataSourceType extends js.Any
object DataSourceType {
  val AMAZON_OPENSEARCH_SERVICE = "AMAZON_OPENSEARCH_SERVICE".asInstanceOf[DataSourceType]
  val CLOUDWATCH = "CLOUDWATCH".asInstanceOf[DataSourceType]
  val PROMETHEUS = "PROMETHEUS".asInstanceOf[DataSourceType]
  val XRAY = "XRAY".asInstanceOf[DataSourceType]
  val TIMESTREAM = "TIMESTREAM".asInstanceOf[DataSourceType]
  val SITEWISE = "SITEWISE".asInstanceOf[DataSourceType]

  @inline def values: js.Array[DataSourceType] = js.Array(AMAZON_OPENSEARCH_SERVICE, CLOUDWATCH, PROMETHEUS, XRAY, TIMESTREAM, SITEWISE)
}

@js.native
sealed trait LicenseType extends js.Any
object LicenseType {
  val ENTERPRISE = "ENTERPRISE".asInstanceOf[LicenseType]
  val ENTERPRISE_FREE_TRIAL = "ENTERPRISE_FREE_TRIAL".asInstanceOf[LicenseType]

  @inline def values: js.Array[LicenseType] = js.Array(ENTERPRISE, ENTERPRISE_FREE_TRIAL)
}

@js.native
sealed trait NotificationDestinationType extends js.Any
object NotificationDestinationType {
  val SNS = "SNS".asInstanceOf[NotificationDestinationType]

  @inline def values: js.Array[NotificationDestinationType] = js.Array(SNS)
}

@js.native
sealed trait PermissionType extends js.Any
object PermissionType {
  val CUSTOMER_MANAGED = "CUSTOMER_MANAGED".asInstanceOf[PermissionType]
  val SERVICE_MANAGED = "SERVICE_MANAGED".asInstanceOf[PermissionType]

  @inline def values: js.Array[PermissionType] = js.Array(CUSTOMER_MANAGED, SERVICE_MANAGED)
}

@js.native
sealed trait Role extends js.Any
object Role {
  val ADMIN = "ADMIN".asInstanceOf[Role]
  val EDITOR = "EDITOR".asInstanceOf[Role]

  @inline def values: js.Array[Role] = js.Array(ADMIN, EDITOR)
}

@js.native
sealed trait SamlConfigurationStatus extends js.Any
object SamlConfigurationStatus {
  val CONFIGURED = "CONFIGURED".asInstanceOf[SamlConfigurationStatus]
  val NOT_CONFIGURED = "NOT_CONFIGURED".asInstanceOf[SamlConfigurationStatus]

  @inline def values: js.Array[SamlConfigurationStatus] = js.Array(CONFIGURED, NOT_CONFIGURED)
}

@js.native
sealed trait UpdateAction extends js.Any
object UpdateAction {
  val ADD = "ADD".asInstanceOf[UpdateAction]
  val REVOKE = "REVOKE".asInstanceOf[UpdateAction]

  @inline def values: js.Array[UpdateAction] = js.Array(ADD, REVOKE)
}

@js.native
sealed trait UserType extends js.Any
object UserType {
  val SSO_USER = "SSO_USER".asInstanceOf[UserType]
  val SSO_GROUP = "SSO_GROUP".asInstanceOf[UserType]

  @inline def values: js.Array[UserType] = js.Array(SSO_USER, SSO_GROUP)
}

@js.native
sealed trait WorkspaceStatus extends js.Any
object WorkspaceStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[WorkspaceStatus]
  val CREATING = "CREATING".asInstanceOf[WorkspaceStatus]
  val DELETING = "DELETING".asInstanceOf[WorkspaceStatus]
  val FAILED = "FAILED".asInstanceOf[WorkspaceStatus]
  val UPDATING = "UPDATING".asInstanceOf[WorkspaceStatus]
  val UPGRADING = "UPGRADING".asInstanceOf[WorkspaceStatus]
  val DELETION_FAILED = "DELETION_FAILED".asInstanceOf[WorkspaceStatus]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[WorkspaceStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[WorkspaceStatus]
  val UPGRADE_FAILED = "UPGRADE_FAILED".asInstanceOf[WorkspaceStatus]
  val LICENSE_REMOVAL_FAILED = "LICENSE_REMOVAL_FAILED".asInstanceOf[WorkspaceStatus]

  @inline def values: js.Array[WorkspaceStatus] = js.Array(ACTIVE, CREATING, DELETING, FAILED, UPDATING, UPGRADING, DELETION_FAILED, CREATION_FAILED, UPDATE_FAILED, UPGRADE_FAILED, LICENSE_REMOVAL_FAILED)
}
