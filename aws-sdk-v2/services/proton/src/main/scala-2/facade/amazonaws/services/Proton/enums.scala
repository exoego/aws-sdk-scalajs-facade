package facade.amazonaws.services.proton

import scalajs.js

@js.native
sealed trait ComponentDeploymentUpdateType extends js.Any
object ComponentDeploymentUpdateType {
  val NONE = "NONE".asInstanceOf[ComponentDeploymentUpdateType]
  val CURRENT_VERSION = "CURRENT_VERSION".asInstanceOf[ComponentDeploymentUpdateType]

  @inline def values: js.Array[ComponentDeploymentUpdateType] = js.Array(NONE, CURRENT_VERSION)
}

@js.native
sealed trait DeploymentStatus extends js.Any
object DeploymentStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[DeploymentStatus]
  val FAILED = "FAILED".asInstanceOf[DeploymentStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[DeploymentStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[DeploymentStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[DeploymentStatus]
  val DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[DeploymentStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[DeploymentStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[DeploymentStatus]

  @inline def values: js.Array[DeploymentStatus] = js.Array(IN_PROGRESS, FAILED, SUCCEEDED, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, CANCELLING, CANCELLED)
}

@js.native
sealed trait DeploymentUpdateType extends js.Any
object DeploymentUpdateType {
  val NONE = "NONE".asInstanceOf[DeploymentUpdateType]
  val CURRENT_VERSION = "CURRENT_VERSION".asInstanceOf[DeploymentUpdateType]
  val MINOR_VERSION = "MINOR_VERSION".asInstanceOf[DeploymentUpdateType]
  val MAJOR_VERSION = "MAJOR_VERSION".asInstanceOf[DeploymentUpdateType]

  @inline def values: js.Array[DeploymentUpdateType] = js.Array(NONE, CURRENT_VERSION, MINOR_VERSION, MAJOR_VERSION)
}

@js.native
sealed trait EnvironmentAccountConnectionRequesterAccountType extends js.Any
object EnvironmentAccountConnectionRequesterAccountType {
  val MANAGEMENT_ACCOUNT = "MANAGEMENT_ACCOUNT".asInstanceOf[EnvironmentAccountConnectionRequesterAccountType]
  val ENVIRONMENT_ACCOUNT = "ENVIRONMENT_ACCOUNT".asInstanceOf[EnvironmentAccountConnectionRequesterAccountType]

  @inline def values: js.Array[EnvironmentAccountConnectionRequesterAccountType] = js.Array(MANAGEMENT_ACCOUNT, ENVIRONMENT_ACCOUNT)
}

@js.native
sealed trait EnvironmentAccountConnectionStatus extends js.Any
object EnvironmentAccountConnectionStatus {
  val PENDING = "PENDING".asInstanceOf[EnvironmentAccountConnectionStatus]
  val CONNECTED = "CONNECTED".asInstanceOf[EnvironmentAccountConnectionStatus]
  val REJECTED = "REJECTED".asInstanceOf[EnvironmentAccountConnectionStatus]

  @inline def values: js.Array[EnvironmentAccountConnectionStatus] = js.Array(PENDING, CONNECTED, REJECTED)
}

@js.native
sealed trait ListServiceInstancesFilterBy extends js.Any
object ListServiceInstancesFilterBy {
  val name = "name".asInstanceOf[ListServiceInstancesFilterBy]
  val deploymentStatus = "deploymentStatus".asInstanceOf[ListServiceInstancesFilterBy]
  val templateName = "templateName".asInstanceOf[ListServiceInstancesFilterBy]
  val serviceName = "serviceName".asInstanceOf[ListServiceInstancesFilterBy]
  val deployedTemplateVersionStatus = "deployedTemplateVersionStatus".asInstanceOf[ListServiceInstancesFilterBy]
  val environmentName = "environmentName".asInstanceOf[ListServiceInstancesFilterBy]
  val lastDeploymentAttemptedAtBefore = "lastDeploymentAttemptedAtBefore".asInstanceOf[ListServiceInstancesFilterBy]
  val lastDeploymentAttemptedAtAfter = "lastDeploymentAttemptedAtAfter".asInstanceOf[ListServiceInstancesFilterBy]
  val createdAtBefore = "createdAtBefore".asInstanceOf[ListServiceInstancesFilterBy]
  val createdAtAfter = "createdAtAfter".asInstanceOf[ListServiceInstancesFilterBy]

  @inline def values: js.Array[ListServiceInstancesFilterBy] = js.Array(
    name,
    deploymentStatus,
    templateName,
    serviceName,
    deployedTemplateVersionStatus,
    environmentName,
    lastDeploymentAttemptedAtBefore,
    lastDeploymentAttemptedAtAfter,
    createdAtBefore,
    createdAtAfter
  )
}

@js.native
sealed trait ListServiceInstancesSortBy extends js.Any
object ListServiceInstancesSortBy {
  val name = "name".asInstanceOf[ListServiceInstancesSortBy]
  val deploymentStatus = "deploymentStatus".asInstanceOf[ListServiceInstancesSortBy]
  val templateName = "templateName".asInstanceOf[ListServiceInstancesSortBy]
  val serviceName = "serviceName".asInstanceOf[ListServiceInstancesSortBy]
  val environmentName = "environmentName".asInstanceOf[ListServiceInstancesSortBy]
  val lastDeploymentAttemptedAt = "lastDeploymentAttemptedAt".asInstanceOf[ListServiceInstancesSortBy]
  val createdAt = "createdAt".asInstanceOf[ListServiceInstancesSortBy]

  @inline def values: js.Array[ListServiceInstancesSortBy] = js.Array(name, deploymentStatus, templateName, serviceName, environmentName, lastDeploymentAttemptedAt, createdAt)
}

/** List of provisioning engines
  */
@js.native
sealed trait ProvisionedResourceEngine extends js.Any
object ProvisionedResourceEngine {
  val CLOUDFORMATION = "CLOUDFORMATION".asInstanceOf[ProvisionedResourceEngine]
  val TERRAFORM = "TERRAFORM".asInstanceOf[ProvisionedResourceEngine]

  @inline def values: js.Array[ProvisionedResourceEngine] = js.Array(CLOUDFORMATION, TERRAFORM)
}

@js.native
sealed trait Provisioning extends js.Any
object Provisioning {
  val CUSTOMER_MANAGED = "CUSTOMER_MANAGED".asInstanceOf[Provisioning]

  @inline def values: js.Array[Provisioning] = js.Array(CUSTOMER_MANAGED)
}

@js.native
sealed trait RepositoryProvider extends js.Any
object RepositoryProvider {
  val GITHUB = "GITHUB".asInstanceOf[RepositoryProvider]
  val GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[RepositoryProvider]
  val BITBUCKET = "BITBUCKET".asInstanceOf[RepositoryProvider]

  @inline def values: js.Array[RepositoryProvider] = js.Array(GITHUB, GITHUB_ENTERPRISE, BITBUCKET)
}

@js.native
sealed trait RepositorySyncStatus extends js.Any
object RepositorySyncStatus {
  val INITIATED = "INITIATED".asInstanceOf[RepositorySyncStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[RepositorySyncStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[RepositorySyncStatus]
  val FAILED = "FAILED".asInstanceOf[RepositorySyncStatus]
  val QUEUED = "QUEUED".asInstanceOf[RepositorySyncStatus]

  @inline def values: js.Array[RepositorySyncStatus] = js.Array(INITIATED, IN_PROGRESS, SUCCEEDED, FAILED, QUEUED)
}

/** The state that a PR-based deployment can be updated to.
  */
@js.native
sealed trait ResourceDeploymentStatus extends js.Any
object ResourceDeploymentStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ResourceDeploymentStatus]
  val FAILED = "FAILED".asInstanceOf[ResourceDeploymentStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ResourceDeploymentStatus]

  @inline def values: js.Array[ResourceDeploymentStatus] = js.Array(IN_PROGRESS, FAILED, SUCCEEDED)
}

@js.native
sealed trait ResourceSyncStatus extends js.Any
object ResourceSyncStatus {
  val INITIATED = "INITIATED".asInstanceOf[ResourceSyncStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ResourceSyncStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ResourceSyncStatus]
  val FAILED = "FAILED".asInstanceOf[ResourceSyncStatus]

  @inline def values: js.Array[ResourceSyncStatus] = js.Array(INITIATED, IN_PROGRESS, SUCCEEDED, FAILED)
}

@js.native
sealed trait ServiceStatus extends js.Any
object ServiceStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ServiceStatus]
  val CREATE_FAILED_CLEANUP_IN_PROGRESS = "CREATE_FAILED_CLEANUP_IN_PROGRESS".asInstanceOf[ServiceStatus]
  val CREATE_FAILED_CLEANUP_COMPLETE = "CREATE_FAILED_CLEANUP_COMPLETE".asInstanceOf[ServiceStatus]
  val CREATE_FAILED_CLEANUP_FAILED = "CREATE_FAILED_CLEANUP_FAILED".asInstanceOf[ServiceStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ServiceStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ServiceStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[ServiceStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ServiceStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[ServiceStatus]
  val UPDATE_FAILED_CLEANUP_IN_PROGRESS = "UPDATE_FAILED_CLEANUP_IN_PROGRESS".asInstanceOf[ServiceStatus]
  val UPDATE_FAILED_CLEANUP_COMPLETE = "UPDATE_FAILED_CLEANUP_COMPLETE".asInstanceOf[ServiceStatus]
  val UPDATE_FAILED_CLEANUP_FAILED = "UPDATE_FAILED_CLEANUP_FAILED".asInstanceOf[ServiceStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ServiceStatus]
  val UPDATE_COMPLETE_CLEANUP_FAILED = "UPDATE_COMPLETE_CLEANUP_FAILED".asInstanceOf[ServiceStatus]

  @inline def values: js.Array[ServiceStatus] = js.Array(
    CREATE_IN_PROGRESS,
    CREATE_FAILED_CLEANUP_IN_PROGRESS,
    CREATE_FAILED_CLEANUP_COMPLETE,
    CREATE_FAILED_CLEANUP_FAILED,
    CREATE_FAILED,
    ACTIVE,
    DELETE_IN_PROGRESS,
    DELETE_FAILED,
    UPDATE_IN_PROGRESS,
    UPDATE_FAILED_CLEANUP_IN_PROGRESS,
    UPDATE_FAILED_CLEANUP_COMPLETE,
    UPDATE_FAILED_CLEANUP_FAILED,
    UPDATE_FAILED,
    UPDATE_COMPLETE_CLEANUP_FAILED
  )
}

@js.native
sealed trait ServiceTemplateSupportedComponentSourceType extends js.Any
object ServiceTemplateSupportedComponentSourceType {
  val DIRECTLY_DEFINED = "DIRECTLY_DEFINED".asInstanceOf[ServiceTemplateSupportedComponentSourceType]

  @inline def values: js.Array[ServiceTemplateSupportedComponentSourceType] = js.Array(DIRECTLY_DEFINED)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait SyncType extends js.Any
object SyncType {
  val TEMPLATE_SYNC = "TEMPLATE_SYNC".asInstanceOf[SyncType]

  @inline def values: js.Array[SyncType] = js.Array(TEMPLATE_SYNC)
}

@js.native
sealed trait TemplateType extends js.Any
object TemplateType {
  val ENVIRONMENT = "ENVIRONMENT".asInstanceOf[TemplateType]
  val SERVICE = "SERVICE".asInstanceOf[TemplateType]

  @inline def values: js.Array[TemplateType] = js.Array(ENVIRONMENT, SERVICE)
}

@js.native
sealed trait TemplateVersionStatus extends js.Any
object TemplateVersionStatus {
  val REGISTRATION_IN_PROGRESS = "REGISTRATION_IN_PROGRESS".asInstanceOf[TemplateVersionStatus]
  val REGISTRATION_FAILED = "REGISTRATION_FAILED".asInstanceOf[TemplateVersionStatus]
  val DRAFT = "DRAFT".asInstanceOf[TemplateVersionStatus]
  val PUBLISHED = "PUBLISHED".asInstanceOf[TemplateVersionStatus]

  @inline def values: js.Array[TemplateVersionStatus] = js.Array(REGISTRATION_IN_PROGRESS, REGISTRATION_FAILED, DRAFT, PUBLISHED)
}
