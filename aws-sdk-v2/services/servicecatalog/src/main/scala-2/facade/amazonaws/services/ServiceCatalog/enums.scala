package facade.amazonaws.services.servicecatalog

import scalajs.js

@js.native
sealed trait AccessLevelFilterKey extends js.Any
object AccessLevelFilterKey {
  val Account = "Account".asInstanceOf[AccessLevelFilterKey]
  val Role = "Role".asInstanceOf[AccessLevelFilterKey]
  val User = "User".asInstanceOf[AccessLevelFilterKey]

  @inline def values: js.Array[AccessLevelFilterKey] = js.Array(Account, Role, User)
}

@js.native
sealed trait AccessStatus extends js.Any
object AccessStatus {
  val ENABLED = "ENABLED".asInstanceOf[AccessStatus]
  val UNDER_CHANGE = "UNDER_CHANGE".asInstanceOf[AccessStatus]
  val DISABLED = "DISABLED".asInstanceOf[AccessStatus]

  @inline def values: js.Array[AccessStatus] = js.Array(ENABLED, UNDER_CHANGE, DISABLED)
}

@js.native
sealed trait ChangeAction extends js.Any
object ChangeAction {
  val ADD = "ADD".asInstanceOf[ChangeAction]
  val MODIFY = "MODIFY".asInstanceOf[ChangeAction]
  val REMOVE = "REMOVE".asInstanceOf[ChangeAction]

  @inline def values: js.Array[ChangeAction] = js.Array(ADD, MODIFY, REMOVE)
}

@js.native
sealed trait CopyOption extends js.Any
object CopyOption {
  val CopyTags = "CopyTags".asInstanceOf[CopyOption]

  @inline def values: js.Array[CopyOption] = js.Array(CopyTags)
}

@js.native
sealed trait CopyProductStatus extends js.Any
object CopyProductStatus {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[CopyProductStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[CopyProductStatus]
  val FAILED = "FAILED".asInstanceOf[CopyProductStatus]

  @inline def values: js.Array[CopyProductStatus] = js.Array(SUCCEEDED, IN_PROGRESS, FAILED)
}

@js.native
sealed trait DescribePortfolioShareType extends js.Any
object DescribePortfolioShareType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[DescribePortfolioShareType]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[DescribePortfolioShareType]
  val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[DescribePortfolioShareType]
  val ORGANIZATION_MEMBER_ACCOUNT = "ORGANIZATION_MEMBER_ACCOUNT".asInstanceOf[DescribePortfolioShareType]

  @inline def values: js.Array[DescribePortfolioShareType] = js.Array(ACCOUNT, ORGANIZATION, ORGANIZATIONAL_UNIT, ORGANIZATION_MEMBER_ACCOUNT)
}

@js.native
sealed trait EvaluationType extends js.Any
object EvaluationType {
  val STATIC = "STATIC".asInstanceOf[EvaluationType]
  val DYNAMIC = "DYNAMIC".asInstanceOf[EvaluationType]

  @inline def values: js.Array[EvaluationType] = js.Array(STATIC, DYNAMIC)
}

@js.native
sealed trait LastSyncStatus extends js.Any
object LastSyncStatus {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[LastSyncStatus]
  val FAILED = "FAILED".asInstanceOf[LastSyncStatus]

  @inline def values: js.Array[LastSyncStatus] = js.Array(SUCCEEDED, FAILED)
}

@js.native
sealed trait OrganizationNodeType extends js.Any
object OrganizationNodeType {
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[OrganizationNodeType]
  val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[OrganizationNodeType]
  val ACCOUNT = "ACCOUNT".asInstanceOf[OrganizationNodeType]

  @inline def values: js.Array[OrganizationNodeType] = js.Array(ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT)
}

@js.native
sealed trait PortfolioShareType extends js.Any
object PortfolioShareType {
  val IMPORTED = "IMPORTED".asInstanceOf[PortfolioShareType]
  val AWS_SERVICECATALOG = "AWS_SERVICECATALOG".asInstanceOf[PortfolioShareType]
  val AWS_ORGANIZATIONS = "AWS_ORGANIZATIONS".asInstanceOf[PortfolioShareType]

  @inline def values: js.Array[PortfolioShareType] = js.Array(IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS)
}

@js.native
sealed trait PrincipalType extends js.Any
object PrincipalType {
  val IAM = "IAM".asInstanceOf[PrincipalType]
  val IAM_PATTERN = "IAM_PATTERN".asInstanceOf[PrincipalType]

  @inline def values: js.Array[PrincipalType] = js.Array(IAM, IAM_PATTERN)
}

@js.native
sealed trait ProductSource extends js.Any
object ProductSource {
  val ACCOUNT = "ACCOUNT".asInstanceOf[ProductSource]

  @inline def values: js.Array[ProductSource] = js.Array(ACCOUNT)
}

@js.native
sealed trait ProductType extends js.Any
object ProductType {
  val CLOUD_FORMATION_TEMPLATE = "CLOUD_FORMATION_TEMPLATE".asInstanceOf[ProductType]
  val MARKETPLACE = "MARKETPLACE".asInstanceOf[ProductType]

  @inline def values: js.Array[ProductType] = js.Array(CLOUD_FORMATION_TEMPLATE, MARKETPLACE)
}

@js.native
sealed trait ProductViewFilterBy extends js.Any
object ProductViewFilterBy {
  val FullTextSearch = "FullTextSearch".asInstanceOf[ProductViewFilterBy]
  val Owner = "Owner".asInstanceOf[ProductViewFilterBy]
  val ProductType = "ProductType".asInstanceOf[ProductViewFilterBy]
  val SourceProductId = "SourceProductId".asInstanceOf[ProductViewFilterBy]

  @inline def values: js.Array[ProductViewFilterBy] = js.Array(FullTextSearch, Owner, ProductType, SourceProductId)
}

@js.native
sealed trait ProductViewSortBy extends js.Any
object ProductViewSortBy {
  val Title = "Title".asInstanceOf[ProductViewSortBy]
  val VersionCount = "VersionCount".asInstanceOf[ProductViewSortBy]
  val CreationDate = "CreationDate".asInstanceOf[ProductViewSortBy]

  @inline def values: js.Array[ProductViewSortBy] = js.Array(Title, VersionCount, CreationDate)
}

@js.native
sealed trait PropertyKey extends js.Any
object PropertyKey {
  val OWNER = "OWNER".asInstanceOf[PropertyKey]
  val LAUNCH_ROLE = "LAUNCH_ROLE".asInstanceOf[PropertyKey]

  @inline def values: js.Array[PropertyKey] = js.Array(OWNER, LAUNCH_ROLE)
}

@js.native
sealed trait ProvisionedProductPlanStatus extends js.Any
object ProvisionedProductPlanStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[ProvisionedProductPlanStatus]
  val CREATE_SUCCESS = "CREATE_SUCCESS".asInstanceOf[ProvisionedProductPlanStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ProvisionedProductPlanStatus]
  val EXECUTE_IN_PROGRESS = "EXECUTE_IN_PROGRESS".asInstanceOf[ProvisionedProductPlanStatus]
  val EXECUTE_SUCCESS = "EXECUTE_SUCCESS".asInstanceOf[ProvisionedProductPlanStatus]
  val EXECUTE_FAILED = "EXECUTE_FAILED".asInstanceOf[ProvisionedProductPlanStatus]

  @inline def values: js.Array[ProvisionedProductPlanStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED, EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED)
}

@js.native
sealed trait ProvisionedProductPlanType extends js.Any
object ProvisionedProductPlanType {
  val CLOUDFORMATION = "CLOUDFORMATION".asInstanceOf[ProvisionedProductPlanType]

  @inline def values: js.Array[ProvisionedProductPlanType] = js.Array(CLOUDFORMATION)
}

@js.native
sealed trait ProvisionedProductStatus extends js.Any
object ProvisionedProductStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[ProvisionedProductStatus]
  val UNDER_CHANGE = "UNDER_CHANGE".asInstanceOf[ProvisionedProductStatus]
  val TAINTED = "TAINTED".asInstanceOf[ProvisionedProductStatus]
  val ERROR = "ERROR".asInstanceOf[ProvisionedProductStatus]
  val PLAN_IN_PROGRESS = "PLAN_IN_PROGRESS".asInstanceOf[ProvisionedProductStatus]

  @inline def values: js.Array[ProvisionedProductStatus] = js.Array(AVAILABLE, UNDER_CHANGE, TAINTED, ERROR, PLAN_IN_PROGRESS)
}

@js.native
sealed trait ProvisionedProductViewFilterBy extends js.Any
object ProvisionedProductViewFilterBy {
  val SearchQuery = "SearchQuery".asInstanceOf[ProvisionedProductViewFilterBy]

  @inline def values: js.Array[ProvisionedProductViewFilterBy] = js.Array(SearchQuery)
}

@js.native
sealed trait ProvisioningArtifactGuidance extends js.Any
object ProvisioningArtifactGuidance {
  val DEFAULT = "DEFAULT".asInstanceOf[ProvisioningArtifactGuidance]
  val DEPRECATED = "DEPRECATED".asInstanceOf[ProvisioningArtifactGuidance]

  @inline def values: js.Array[ProvisioningArtifactGuidance] = js.Array(DEFAULT, DEPRECATED)
}

@js.native
sealed trait ProvisioningArtifactPropertyName extends js.Any
object ProvisioningArtifactPropertyName {
  val Id = "Id".asInstanceOf[ProvisioningArtifactPropertyName]

  @inline def values: js.Array[ProvisioningArtifactPropertyName] = js.Array(Id)
}

@js.native
sealed trait ProvisioningArtifactType extends js.Any
object ProvisioningArtifactType {
  val CLOUD_FORMATION_TEMPLATE = "CLOUD_FORMATION_TEMPLATE".asInstanceOf[ProvisioningArtifactType]
  val MARKETPLACE_AMI = "MARKETPLACE_AMI".asInstanceOf[ProvisioningArtifactType]
  val MARKETPLACE_CAR = "MARKETPLACE_CAR".asInstanceOf[ProvisioningArtifactType]

  @inline def values: js.Array[ProvisioningArtifactType] = js.Array(CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI, MARKETPLACE_CAR)
}

@js.native
sealed trait RecordStatus extends js.Any
object RecordStatus {
  val CREATED = "CREATED".asInstanceOf[RecordStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[RecordStatus]
  val IN_PROGRESS_IN_ERROR = "IN_PROGRESS_IN_ERROR".asInstanceOf[RecordStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[RecordStatus]
  val FAILED = "FAILED".asInstanceOf[RecordStatus]

  @inline def values: js.Array[RecordStatus] = js.Array(CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR, SUCCEEDED, FAILED)
}

@js.native
sealed trait Replacement extends js.Any
object Replacement {
  val TRUE = "TRUE".asInstanceOf[Replacement]
  val FALSE = "FALSE".asInstanceOf[Replacement]
  val CONDITIONAL = "CONDITIONAL".asInstanceOf[Replacement]

  @inline def values: js.Array[Replacement] = js.Array(TRUE, FALSE, CONDITIONAL)
}

@js.native
sealed trait RequiresRecreation extends js.Any
object RequiresRecreation {
  val NEVER = "NEVER".asInstanceOf[RequiresRecreation]
  val CONDITIONALLY = "CONDITIONALLY".asInstanceOf[RequiresRecreation]
  val ALWAYS = "ALWAYS".asInstanceOf[RequiresRecreation]

  @inline def values: js.Array[RequiresRecreation] = js.Array(NEVER, CONDITIONALLY, ALWAYS)
}

@js.native
sealed trait ResourceAttribute extends js.Any
object ResourceAttribute {
  val PROPERTIES = "PROPERTIES".asInstanceOf[ResourceAttribute]
  val METADATA = "METADATA".asInstanceOf[ResourceAttribute]
  val CREATIONPOLICY = "CREATIONPOLICY".asInstanceOf[ResourceAttribute]
  val UPDATEPOLICY = "UPDATEPOLICY".asInstanceOf[ResourceAttribute]
  val DELETIONPOLICY = "DELETIONPOLICY".asInstanceOf[ResourceAttribute]
  val TAGS = "TAGS".asInstanceOf[ResourceAttribute]

  @inline def values: js.Array[ResourceAttribute] = js.Array(PROPERTIES, METADATA, CREATIONPOLICY, UPDATEPOLICY, DELETIONPOLICY, TAGS)
}

@js.native
sealed trait ServiceActionAssociationErrorCode extends js.Any
object ServiceActionAssociationErrorCode {
  val DUPLICATE_RESOURCE = "DUPLICATE_RESOURCE".asInstanceOf[ServiceActionAssociationErrorCode]
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[ServiceActionAssociationErrorCode]
  val LIMIT_EXCEEDED = "LIMIT_EXCEEDED".asInstanceOf[ServiceActionAssociationErrorCode]
  val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND".asInstanceOf[ServiceActionAssociationErrorCode]
  val THROTTLING = "THROTTLING".asInstanceOf[ServiceActionAssociationErrorCode]

  @inline def values: js.Array[ServiceActionAssociationErrorCode] = js.Array(DUPLICATE_RESOURCE, INTERNAL_FAILURE, LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING)
}

@js.native
sealed trait ServiceActionDefinitionKey extends js.Any
object ServiceActionDefinitionKey {
  val Name = "Name".asInstanceOf[ServiceActionDefinitionKey]
  val Version = "Version".asInstanceOf[ServiceActionDefinitionKey]
  val AssumeRole = "AssumeRole".asInstanceOf[ServiceActionDefinitionKey]
  val Parameters = "Parameters".asInstanceOf[ServiceActionDefinitionKey]

  @inline def values: js.Array[ServiceActionDefinitionKey] = js.Array(Name, Version, AssumeRole, Parameters)
}

@js.native
sealed trait ServiceActionDefinitionType extends js.Any
object ServiceActionDefinitionType {
  val SSM_AUTOMATION = "SSM_AUTOMATION".asInstanceOf[ServiceActionDefinitionType]

  @inline def values: js.Array[ServiceActionDefinitionType] = js.Array(SSM_AUTOMATION)
}

@js.native
sealed trait ShareStatus extends js.Any
object ShareStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[ShareStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ShareStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ShareStatus]
  val COMPLETED_WITH_ERRORS = "COMPLETED_WITH_ERRORS".asInstanceOf[ShareStatus]
  val ERROR = "ERROR".asInstanceOf[ShareStatus]

  @inline def values: js.Array[ShareStatus] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, ERROR)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val CODESTAR = "CODESTAR".asInstanceOf[SourceType]

  @inline def values: js.Array[SourceType] = js.Array(CODESTAR)
}

@js.native
sealed trait StackInstanceStatus extends js.Any
object StackInstanceStatus {
  val CURRENT = "CURRENT".asInstanceOf[StackInstanceStatus]
  val OUTDATED = "OUTDATED".asInstanceOf[StackInstanceStatus]
  val INOPERABLE = "INOPERABLE".asInstanceOf[StackInstanceStatus]

  @inline def values: js.Array[StackInstanceStatus] = js.Array(CURRENT, OUTDATED, INOPERABLE)
}

@js.native
sealed trait StackSetOperationType extends js.Any
object StackSetOperationType {
  val CREATE = "CREATE".asInstanceOf[StackSetOperationType]
  val UPDATE = "UPDATE".asInstanceOf[StackSetOperationType]
  val DELETE = "DELETE".asInstanceOf[StackSetOperationType]

  @inline def values: js.Array[StackSetOperationType] = js.Array(CREATE, UPDATE, DELETE)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val AVAILABLE = "AVAILABLE".asInstanceOf[Status]
  val CREATING = "CREATING".asInstanceOf[Status]
  val FAILED = "FAILED".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(AVAILABLE, CREATING, FAILED)
}
