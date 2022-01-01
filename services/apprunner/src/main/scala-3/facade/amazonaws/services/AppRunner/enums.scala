package facade.amazonaws.services.apprunner

import scalajs.js

type AutoScalingConfigurationStatus = "ACTIVE" | "INACTIVE"
object AutoScalingConfigurationStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[AutoScalingConfigurationStatus] = js.Array(ACTIVE, INACTIVE)
}

type CertificateValidationRecordStatus = "PENDING_VALIDATION" | "SUCCESS" | "FAILED"
object CertificateValidationRecordStatus {
  inline val PENDING_VALIDATION: "PENDING_VALIDATION" = "PENDING_VALIDATION"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CertificateValidationRecordStatus] = js.Array(PENDING_VALIDATION, SUCCESS, FAILED)
}

type ConfigurationSource = "REPOSITORY" | "API"
object ConfigurationSource {
  inline val REPOSITORY: "REPOSITORY" = "REPOSITORY"
  inline val API: "API" = "API"

  inline def values: js.Array[ConfigurationSource] = js.Array(REPOSITORY, API)
}

type ConnectionStatus = "PENDING_HANDSHAKE" | "AVAILABLE" | "ERROR" | "DELETED"
object ConnectionStatus {
  inline val PENDING_HANDSHAKE: "PENDING_HANDSHAKE" = "PENDING_HANDSHAKE"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val ERROR: "ERROR" = "ERROR"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[ConnectionStatus] = js.Array(PENDING_HANDSHAKE, AVAILABLE, ERROR, DELETED)
}

type CustomDomainAssociationStatus = "CREATING" | "CREATE_FAILED" | "ACTIVE" | "DELETING" | "DELETE_FAILED" | "PENDING_CERTIFICATE_DNS_VALIDATION" | "BINDING_CERTIFICATE"
object CustomDomainAssociationStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val PENDING_CERTIFICATE_DNS_VALIDATION: "PENDING_CERTIFICATE_DNS_VALIDATION" = "PENDING_CERTIFICATE_DNS_VALIDATION"
  inline val BINDING_CERTIFICATE: "BINDING_CERTIFICATE" = "BINDING_CERTIFICATE"

  inline def values: js.Array[CustomDomainAssociationStatus] = js.Array(CREATING, CREATE_FAILED, ACTIVE, DELETING, DELETE_FAILED, PENDING_CERTIFICATE_DNS_VALIDATION, BINDING_CERTIFICATE)
}

type HealthCheckProtocol = "TCP" | "HTTP"
object HealthCheckProtocol {
  inline val TCP: "TCP" = "TCP"
  inline val HTTP: "HTTP" = "HTTP"

  inline def values: js.Array[HealthCheckProtocol] = js.Array(TCP, HTTP)
}

type ImageRepositoryType = "ECR" | "ECR_PUBLIC"
object ImageRepositoryType {
  inline val ECR: "ECR" = "ECR"
  inline val ECR_PUBLIC: "ECR_PUBLIC" = "ECR_PUBLIC"

  inline def values: js.Array[ImageRepositoryType] = js.Array(ECR, ECR_PUBLIC)
}

type OperationStatus = "PENDING" | "IN_PROGRESS" | "FAILED" | "SUCCEEDED" | "ROLLBACK_IN_PROGRESS" | "ROLLBACK_FAILED" | "ROLLBACK_SUCCEEDED"
object OperationStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val ROLLBACK_IN_PROGRESS: "ROLLBACK_IN_PROGRESS" = "ROLLBACK_IN_PROGRESS"
  inline val ROLLBACK_FAILED: "ROLLBACK_FAILED" = "ROLLBACK_FAILED"
  inline val ROLLBACK_SUCCEEDED: "ROLLBACK_SUCCEEDED" = "ROLLBACK_SUCCEEDED"

  inline def values: js.Array[OperationStatus] = js.Array(PENDING, IN_PROGRESS, FAILED, SUCCEEDED, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_SUCCEEDED)
}

type OperationType = "START_DEPLOYMENT" | "CREATE_SERVICE" | "PAUSE_SERVICE" | "RESUME_SERVICE" | "DELETE_SERVICE"
object OperationType {
  inline val START_DEPLOYMENT: "START_DEPLOYMENT" = "START_DEPLOYMENT"
  inline val CREATE_SERVICE: "CREATE_SERVICE" = "CREATE_SERVICE"
  inline val PAUSE_SERVICE: "PAUSE_SERVICE" = "PAUSE_SERVICE"
  inline val RESUME_SERVICE: "RESUME_SERVICE" = "RESUME_SERVICE"
  inline val DELETE_SERVICE: "DELETE_SERVICE" = "DELETE_SERVICE"

  inline def values: js.Array[OperationType] = js.Array(START_DEPLOYMENT, CREATE_SERVICE, PAUSE_SERVICE, RESUME_SERVICE, DELETE_SERVICE)
}

type ProviderType = "GITHUB"
object ProviderType {
  inline val GITHUB: "GITHUB" = "GITHUB"

  inline def values: js.Array[ProviderType] = js.Array(GITHUB)
}

type Runtime = "PYTHON_3" | "NODEJS_12"
object Runtime {
  inline val PYTHON_3: "PYTHON_3" = "PYTHON_3"
  inline val NODEJS_12: "NODEJS_12" = "NODEJS_12"

  inline def values: js.Array[Runtime] = js.Array(PYTHON_3, NODEJS_12)
}

type ServiceStatus = "CREATE_FAILED" | "RUNNING" | "DELETED" | "DELETE_FAILED" | "PAUSED" | "OPERATION_IN_PROGRESS"
object ServiceStatus {
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"
  inline val PAUSED: "PAUSED" = "PAUSED"
  inline val OPERATION_IN_PROGRESS: "OPERATION_IN_PROGRESS" = "OPERATION_IN_PROGRESS"

  inline def values: js.Array[ServiceStatus] = js.Array(CREATE_FAILED, RUNNING, DELETED, DELETE_FAILED, PAUSED, OPERATION_IN_PROGRESS)
}

type SourceCodeVersionType = "BRANCH"
object SourceCodeVersionType {
  inline val BRANCH: "BRANCH" = "BRANCH"

  inline def values: js.Array[SourceCodeVersionType] = js.Array(BRANCH)
}
