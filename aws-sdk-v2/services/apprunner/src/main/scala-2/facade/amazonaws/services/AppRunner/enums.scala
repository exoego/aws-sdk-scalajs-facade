package facade.amazonaws.services.apprunner

import scalajs.js

@js.native
sealed trait AutoScalingConfigurationStatus extends js.Any
object AutoScalingConfigurationStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AutoScalingConfigurationStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[AutoScalingConfigurationStatus]

  @inline def values: js.Array[AutoScalingConfigurationStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait CertificateValidationRecordStatus extends js.Any
object CertificateValidationRecordStatus {
  val PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[CertificateValidationRecordStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[CertificateValidationRecordStatus]
  val FAILED = "FAILED".asInstanceOf[CertificateValidationRecordStatus]

  @inline def values: js.Array[CertificateValidationRecordStatus] = js.Array(PENDING_VALIDATION, SUCCESS, FAILED)
}

@js.native
sealed trait ConfigurationSource extends js.Any
object ConfigurationSource {
  val REPOSITORY = "REPOSITORY".asInstanceOf[ConfigurationSource]
  val API = "API".asInstanceOf[ConfigurationSource]

  @inline def values: js.Array[ConfigurationSource] = js.Array(REPOSITORY, API)
}

@js.native
sealed trait ConnectionStatus extends js.Any
object ConnectionStatus {
  val PENDING_HANDSHAKE = "PENDING_HANDSHAKE".asInstanceOf[ConnectionStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ConnectionStatus]
  val ERROR = "ERROR".asInstanceOf[ConnectionStatus]
  val DELETED = "DELETED".asInstanceOf[ConnectionStatus]

  @inline def values: js.Array[ConnectionStatus] = js.Array(PENDING_HANDSHAKE, AVAILABLE, ERROR, DELETED)
}

@js.native
sealed trait CustomDomainAssociationStatus extends js.Any
object CustomDomainAssociationStatus {
  val CREATING = "CREATING".asInstanceOf[CustomDomainAssociationStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[CustomDomainAssociationStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[CustomDomainAssociationStatus]
  val DELETING = "DELETING".asInstanceOf[CustomDomainAssociationStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[CustomDomainAssociationStatus]
  val PENDING_CERTIFICATE_DNS_VALIDATION = "PENDING_CERTIFICATE_DNS_VALIDATION".asInstanceOf[CustomDomainAssociationStatus]
  val BINDING_CERTIFICATE = "BINDING_CERTIFICATE".asInstanceOf[CustomDomainAssociationStatus]

  @inline def values: js.Array[CustomDomainAssociationStatus] = js.Array(CREATING, CREATE_FAILED, ACTIVE, DELETING, DELETE_FAILED, PENDING_CERTIFICATE_DNS_VALIDATION, BINDING_CERTIFICATE)
}

@js.native
sealed trait EgressType extends js.Any
object EgressType {
  val DEFAULT = "DEFAULT".asInstanceOf[EgressType]
  val VPC = "VPC".asInstanceOf[EgressType]

  @inline def values: js.Array[EgressType] = js.Array(DEFAULT, VPC)
}

@js.native
sealed trait HealthCheckProtocol extends js.Any
object HealthCheckProtocol {
  val TCP = "TCP".asInstanceOf[HealthCheckProtocol]
  val HTTP = "HTTP".asInstanceOf[HealthCheckProtocol]

  @inline def values: js.Array[HealthCheckProtocol] = js.Array(TCP, HTTP)
}

@js.native
sealed trait ImageRepositoryType extends js.Any
object ImageRepositoryType {
  val ECR = "ECR".asInstanceOf[ImageRepositoryType]
  val ECR_PUBLIC = "ECR_PUBLIC".asInstanceOf[ImageRepositoryType]

  @inline def values: js.Array[ImageRepositoryType] = js.Array(ECR, ECR_PUBLIC)
}

@js.native
sealed trait ObservabilityConfigurationStatus extends js.Any
object ObservabilityConfigurationStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ObservabilityConfigurationStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[ObservabilityConfigurationStatus]

  @inline def values: js.Array[ObservabilityConfigurationStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait OperationStatus extends js.Any
object OperationStatus {
  val PENDING = "PENDING".asInstanceOf[OperationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[OperationStatus]
  val FAILED = "FAILED".asInstanceOf[OperationStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[OperationStatus]
  val ROLLBACK_IN_PROGRESS = "ROLLBACK_IN_PROGRESS".asInstanceOf[OperationStatus]
  val ROLLBACK_FAILED = "ROLLBACK_FAILED".asInstanceOf[OperationStatus]
  val ROLLBACK_SUCCEEDED = "ROLLBACK_SUCCEEDED".asInstanceOf[OperationStatus]

  @inline def values: js.Array[OperationStatus] = js.Array(PENDING, IN_PROGRESS, FAILED, SUCCEEDED, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_SUCCEEDED)
}

@js.native
sealed trait OperationType extends js.Any
object OperationType {
  val START_DEPLOYMENT = "START_DEPLOYMENT".asInstanceOf[OperationType]
  val CREATE_SERVICE = "CREATE_SERVICE".asInstanceOf[OperationType]
  val PAUSE_SERVICE = "PAUSE_SERVICE".asInstanceOf[OperationType]
  val RESUME_SERVICE = "RESUME_SERVICE".asInstanceOf[OperationType]
  val DELETE_SERVICE = "DELETE_SERVICE".asInstanceOf[OperationType]

  @inline def values: js.Array[OperationType] = js.Array(START_DEPLOYMENT, CREATE_SERVICE, PAUSE_SERVICE, RESUME_SERVICE, DELETE_SERVICE)
}

@js.native
sealed trait ProviderType extends js.Any
object ProviderType {
  val GITHUB = "GITHUB".asInstanceOf[ProviderType]

  @inline def values: js.Array[ProviderType] = js.Array(GITHUB)
}

@js.native
sealed trait Runtime extends js.Any
object Runtime {
  val PYTHON_3 = "PYTHON_3".asInstanceOf[Runtime]
  val NODEJS_12 = "NODEJS_12".asInstanceOf[Runtime]
  val NODEJS_14 = "NODEJS_14".asInstanceOf[Runtime]
  val CORRETTO_8 = "CORRETTO_8".asInstanceOf[Runtime]
  val CORRETTO_11 = "CORRETTO_11".asInstanceOf[Runtime]
  val NODEJS_16 = "NODEJS_16".asInstanceOf[Runtime]
  val GO_1 = "GO_1".asInstanceOf[Runtime]
  val DOTNET_6 = "DOTNET_6".asInstanceOf[Runtime]
  val PHP_81 = "PHP_81".asInstanceOf[Runtime]
  val RUBY_31 = "RUBY_31".asInstanceOf[Runtime]

  @inline def values: js.Array[Runtime] = js.Array(PYTHON_3, NODEJS_12, NODEJS_14, CORRETTO_8, CORRETTO_11, NODEJS_16, GO_1, DOTNET_6, PHP_81, RUBY_31)
}

@js.native
sealed trait ServiceStatus extends js.Any
object ServiceStatus {
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ServiceStatus]
  val RUNNING = "RUNNING".asInstanceOf[ServiceStatus]
  val DELETED = "DELETED".asInstanceOf[ServiceStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ServiceStatus]
  val PAUSED = "PAUSED".asInstanceOf[ServiceStatus]
  val OPERATION_IN_PROGRESS = "OPERATION_IN_PROGRESS".asInstanceOf[ServiceStatus]

  @inline def values: js.Array[ServiceStatus] = js.Array(CREATE_FAILED, RUNNING, DELETED, DELETE_FAILED, PAUSED, OPERATION_IN_PROGRESS)
}

@js.native
sealed trait SourceCodeVersionType extends js.Any
object SourceCodeVersionType {
  val BRANCH = "BRANCH".asInstanceOf[SourceCodeVersionType]

  @inline def values: js.Array[SourceCodeVersionType] = js.Array(BRANCH)
}

@js.native
sealed trait TracingVendor extends js.Any
object TracingVendor {
  val AWSXRAY = "AWSXRAY".asInstanceOf[TracingVendor]

  @inline def values: js.Array[TracingVendor] = js.Array(AWSXRAY)
}

@js.native
sealed trait VpcConnectorStatus extends js.Any
object VpcConnectorStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[VpcConnectorStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[VpcConnectorStatus]

  @inline def values: js.Array[VpcConnectorStatus] = js.Array(ACTIVE, INACTIVE)
}

@js.native
sealed trait VpcIngressConnectionStatus extends js.Any
object VpcIngressConnectionStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[VpcIngressConnectionStatus]
  val PENDING_CREATION = "PENDING_CREATION".asInstanceOf[VpcIngressConnectionStatus]
  val PENDING_UPDATE = "PENDING_UPDATE".asInstanceOf[VpcIngressConnectionStatus]
  val PENDING_DELETION = "PENDING_DELETION".asInstanceOf[VpcIngressConnectionStatus]
  val FAILED_CREATION = "FAILED_CREATION".asInstanceOf[VpcIngressConnectionStatus]
  val FAILED_UPDATE = "FAILED_UPDATE".asInstanceOf[VpcIngressConnectionStatus]
  val FAILED_DELETION = "FAILED_DELETION".asInstanceOf[VpcIngressConnectionStatus]
  val DELETED = "DELETED".asInstanceOf[VpcIngressConnectionStatus]

  @inline def values: js.Array[VpcIngressConnectionStatus] = js.Array(AVAILABLE, PENDING_CREATION, PENDING_UPDATE, PENDING_DELETION, FAILED_CREATION, FAILED_UPDATE, FAILED_DELETION, DELETED)
}
