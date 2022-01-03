package facade.amazonaws.services.proton

import scalajs.js

type DeploymentStatus = "IN_PROGRESS" | "FAILED" | "SUCCEEDED" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "CANCELLING" | "CANCELLED"
object DeploymentStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[DeploymentStatus] = js.Array(IN_PROGRESS, FAILED, SUCCEEDED, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, CANCELLING, CANCELLED)
}

type DeploymentUpdateType = "NONE" | "CURRENT_VERSION" | "MINOR_VERSION" | "MAJOR_VERSION"
object DeploymentUpdateType {
  inline val NONE: "NONE" = "NONE"
  inline val CURRENT_VERSION: "CURRENT_VERSION" = "CURRENT_VERSION"
  inline val MINOR_VERSION: "MINOR_VERSION" = "MINOR_VERSION"
  inline val MAJOR_VERSION: "MAJOR_VERSION" = "MAJOR_VERSION"

  inline def values: js.Array[DeploymentUpdateType] = js.Array(NONE, CURRENT_VERSION, MINOR_VERSION, MAJOR_VERSION)
}

type EnvironmentAccountConnectionRequesterAccountType = "MANAGEMENT_ACCOUNT" | "ENVIRONMENT_ACCOUNT"
object EnvironmentAccountConnectionRequesterAccountType {
  inline val MANAGEMENT_ACCOUNT: "MANAGEMENT_ACCOUNT" = "MANAGEMENT_ACCOUNT"
  inline val ENVIRONMENT_ACCOUNT: "ENVIRONMENT_ACCOUNT" = "ENVIRONMENT_ACCOUNT"

  inline def values: js.Array[EnvironmentAccountConnectionRequesterAccountType] = js.Array(MANAGEMENT_ACCOUNT, ENVIRONMENT_ACCOUNT)
}

type EnvironmentAccountConnectionStatus = "PENDING" | "CONNECTED" | "REJECTED"
object EnvironmentAccountConnectionStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val CONNECTED: "CONNECTED" = "CONNECTED"
  inline val REJECTED: "REJECTED" = "REJECTED"

  inline def values: js.Array[EnvironmentAccountConnectionStatus] = js.Array(PENDING, CONNECTED, REJECTED)
}

/** List of provisioning engines
  */
type ProvisionedResourceEngine = "CLOUDFORMATION" | "TERRAFORM"
object ProvisionedResourceEngine {
  inline val CLOUDFORMATION: "CLOUDFORMATION" = "CLOUDFORMATION"
  inline val TERRAFORM: "TERRAFORM" = "TERRAFORM"

  inline def values: js.Array[ProvisionedResourceEngine] = js.Array(CLOUDFORMATION, TERRAFORM)
}

type Provisioning = "CUSTOMER_MANAGED"
object Provisioning {
  inline val CUSTOMER_MANAGED: "CUSTOMER_MANAGED" = "CUSTOMER_MANAGED"

  inline def values: js.Array[Provisioning] = js.Array(CUSTOMER_MANAGED)
}

type RepositoryProvider = "GITHUB" | "GITHUB_ENTERPRISE" | "BITBUCKET"
object RepositoryProvider {
  inline val GITHUB: "GITHUB" = "GITHUB"
  inline val GITHUB_ENTERPRISE: "GITHUB_ENTERPRISE" = "GITHUB_ENTERPRISE"
  inline val BITBUCKET: "BITBUCKET" = "BITBUCKET"

  inline def values: js.Array[RepositoryProvider] = js.Array(GITHUB, GITHUB_ENTERPRISE, BITBUCKET)
}

type RepositorySyncStatus = "INITIATED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "QUEUED"
object RepositorySyncStatus {
  inline val INITIATED: "INITIATED" = "INITIATED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val QUEUED: "QUEUED" = "QUEUED"

  inline def values: js.Array[RepositorySyncStatus] = js.Array(INITIATED, IN_PROGRESS, SUCCEEDED, FAILED, QUEUED)
}

/** The state that a PR-based deployment can be updated to.
  */
type ResourceDeploymentStatus = "IN_PROGRESS" | "FAILED" | "SUCCEEDED"
object ResourceDeploymentStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"

  inline def values: js.Array[ResourceDeploymentStatus] = js.Array(IN_PROGRESS, FAILED, SUCCEEDED)
}

type ResourceSyncStatus = "INITIATED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED"
object ResourceSyncStatus {
  inline val INITIATED: "INITIATED" = "INITIATED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ResourceSyncStatus] = js.Array(INITIATED, IN_PROGRESS, SUCCEEDED, FAILED)
}

type ServiceStatus = "CREATE_IN_PROGRESS" | "CREATE_FAILED_CLEANUP_IN_PROGRESS" | "CREATE_FAILED_CLEANUP_COMPLETE" | "CREATE_FAILED_CLEANUP_FAILED" | "CREATE_FAILED" | "ACTIVE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED_CLEANUP_IN_PROGRESS" | "UPDATE_FAILED_CLEANUP_COMPLETE" | "UPDATE_FAILED_CLEANUP_FAILED" | "UPDATE_FAILED" | "UPDATE_COMPLETE_CLEANUP_FAILED"
object ServiceStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_FAILED_CLEANUP_IN_PROGRESS: "CREATE_FAILED_CLEANUP_IN_PROGRESS" = "CREATE_FAILED_CLEANUP_IN_PROGRESS"
  inline val CREATE_FAILED_CLEANUP_COMPLETE: "CREATE_FAILED_CLEANUP_COMPLETE" = "CREATE_FAILED_CLEANUP_COMPLETE"
  inline val CREATE_FAILED_CLEANUP_FAILED: "CREATE_FAILED_CLEANUP_FAILED" = "CREATE_FAILED_CLEANUP_FAILED"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_FAILED_CLEANUP_IN_PROGRESS: "UPDATE_FAILED_CLEANUP_IN_PROGRESS" = "UPDATE_FAILED_CLEANUP_IN_PROGRESS"
  inline val UPDATE_FAILED_CLEANUP_COMPLETE: "UPDATE_FAILED_CLEANUP_COMPLETE" = "UPDATE_FAILED_CLEANUP_COMPLETE"
  inline val UPDATE_FAILED_CLEANUP_FAILED: "UPDATE_FAILED_CLEANUP_FAILED" = "UPDATE_FAILED_CLEANUP_FAILED"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  inline val UPDATE_COMPLETE_CLEANUP_FAILED: "UPDATE_COMPLETE_CLEANUP_FAILED" = "UPDATE_COMPLETE_CLEANUP_FAILED"

  inline def values: js.Array[ServiceStatus] = js.Array(
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

type SyncType = "TEMPLATE_SYNC"
object SyncType {
  inline val TEMPLATE_SYNC: "TEMPLATE_SYNC" = "TEMPLATE_SYNC"

  inline def values: js.Array[SyncType] = js.Array(TEMPLATE_SYNC)
}

type TemplateType = "ENVIRONMENT" | "SERVICE"
object TemplateType {
  inline val ENVIRONMENT: "ENVIRONMENT" = "ENVIRONMENT"
  inline val SERVICE: "SERVICE" = "SERVICE"

  inline def values: js.Array[TemplateType] = js.Array(ENVIRONMENT, SERVICE)
}

type TemplateVersionStatus = "REGISTRATION_IN_PROGRESS" | "REGISTRATION_FAILED" | "DRAFT" | "PUBLISHED"
object TemplateVersionStatus {
  inline val REGISTRATION_IN_PROGRESS: "REGISTRATION_IN_PROGRESS" = "REGISTRATION_IN_PROGRESS"
  inline val REGISTRATION_FAILED: "REGISTRATION_FAILED" = "REGISTRATION_FAILED"
  inline val DRAFT: "DRAFT" = "DRAFT"
  inline val PUBLISHED: "PUBLISHED" = "PUBLISHED"

  inline def values: js.Array[TemplateVersionStatus] = js.Array(REGISTRATION_IN_PROGRESS, REGISTRATION_FAILED, DRAFT, PUBLISHED)
}
