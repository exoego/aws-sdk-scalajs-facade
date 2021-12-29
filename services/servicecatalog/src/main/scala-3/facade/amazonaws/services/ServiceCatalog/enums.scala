package facade.amazonaws.services.servicecatalog

import scalajs._

type AccessLevelFilterKey = "Account" | "Role" | "User"
object AccessLevelFilterKey {
  val Account: "Account" = "Account"
  val Role: "Role" = "Role"
  val User: "User" = "User"

  @inline def values = js.Array[AccessLevelFilterKey](Account, Role, User)
}

type AccessStatus = "ENABLED" | "UNDER_CHANGE" | "DISABLED"
object AccessStatus {
  val ENABLED: "ENABLED" = "ENABLED"
  val UNDER_CHANGE: "UNDER_CHANGE" = "UNDER_CHANGE"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[AccessStatus](ENABLED, UNDER_CHANGE, DISABLED)
}

type ChangeAction = "ADD" | "MODIFY" | "REMOVE"
object ChangeAction {
  val ADD: "ADD" = "ADD"
  val MODIFY: "MODIFY" = "MODIFY"
  val REMOVE: "REMOVE" = "REMOVE"

  @inline def values = js.Array[ChangeAction](ADD, MODIFY, REMOVE)
}

type CopyOption = "CopyTags"
object CopyOption {
  val CopyTags: "CopyTags" = "CopyTags"

  @inline def values = js.Array[CopyOption](CopyTags)
}

type CopyProductStatus = "SUCCEEDED" | "IN_PROGRESS" | "FAILED"
object CopyProductStatus {
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[CopyProductStatus](SUCCEEDED, IN_PROGRESS, FAILED)
}

type DescribePortfolioShareType = "ACCOUNT" | "ORGANIZATION" | "ORGANIZATIONAL_UNIT" | "ORGANIZATION_MEMBER_ACCOUNT"
object DescribePortfolioShareType {
  val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"
  val ORGANIZATIONAL_UNIT: "ORGANIZATIONAL_UNIT" = "ORGANIZATIONAL_UNIT"
  val ORGANIZATION_MEMBER_ACCOUNT: "ORGANIZATION_MEMBER_ACCOUNT" = "ORGANIZATION_MEMBER_ACCOUNT"

  @inline def values = js.Array[DescribePortfolioShareType](ACCOUNT, ORGANIZATION, ORGANIZATIONAL_UNIT, ORGANIZATION_MEMBER_ACCOUNT)
}

type EvaluationType = "STATIC" | "DYNAMIC"
object EvaluationType {
  val STATIC: "STATIC" = "STATIC"
  val DYNAMIC: "DYNAMIC" = "DYNAMIC"

  @inline def values = js.Array[EvaluationType](STATIC, DYNAMIC)
}

type OrganizationNodeType = "ORGANIZATION" | "ORGANIZATIONAL_UNIT" | "ACCOUNT"
object OrganizationNodeType {
  val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"
  val ORGANIZATIONAL_UNIT: "ORGANIZATIONAL_UNIT" = "ORGANIZATIONAL_UNIT"
  val ACCOUNT: "ACCOUNT" = "ACCOUNT"

  @inline def values = js.Array[OrganizationNodeType](ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT)
}

type PortfolioShareType = "IMPORTED" | "AWS_SERVICECATALOG" | "AWS_ORGANIZATIONS"
object PortfolioShareType {
  val IMPORTED: "IMPORTED" = "IMPORTED"
  val AWS_SERVICECATALOG: "AWS_SERVICECATALOG" = "AWS_SERVICECATALOG"
  val AWS_ORGANIZATIONS: "AWS_ORGANIZATIONS" = "AWS_ORGANIZATIONS"

  @inline def values = js.Array[PortfolioShareType](IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS)
}

type PrincipalType = "IAM"
object PrincipalType {
  val IAM: "IAM" = "IAM"

  @inline def values = js.Array[PrincipalType](IAM)
}

type ProductSource = "ACCOUNT"
object ProductSource {
  val ACCOUNT: "ACCOUNT" = "ACCOUNT"

  @inline def values = js.Array[ProductSource](ACCOUNT)
}

type ProductType = "CLOUD_FORMATION_TEMPLATE" | "MARKETPLACE"
object ProductType {
  val CLOUD_FORMATION_TEMPLATE: "CLOUD_FORMATION_TEMPLATE" = "CLOUD_FORMATION_TEMPLATE"
  val MARKETPLACE: "MARKETPLACE" = "MARKETPLACE"

  @inline def values = js.Array[ProductType](CLOUD_FORMATION_TEMPLATE, MARKETPLACE)
}

type ProductViewFilterBy = "FullTextSearch" | "Owner" | "ProductType" | "SourceProductId"
object ProductViewFilterBy {
  val FullTextSearch: "FullTextSearch" = "FullTextSearch"
  val Owner: "Owner" = "Owner"
  val ProductType: "ProductType" = "ProductType"
  val SourceProductId: "SourceProductId" = "SourceProductId"

  @inline def values = js.Array[ProductViewFilterBy](FullTextSearch, Owner, ProductType, SourceProductId)
}

type ProductViewSortBy = "Title" | "VersionCount" | "CreationDate"
object ProductViewSortBy {
  val Title: "Title" = "Title"
  val VersionCount: "VersionCount" = "VersionCount"
  val CreationDate: "CreationDate" = "CreationDate"

  @inline def values = js.Array[ProductViewSortBy](Title, VersionCount, CreationDate)
}

type PropertyKey = "OWNER" | "LAUNCH_ROLE"
object PropertyKey {
  val OWNER: "OWNER" = "OWNER"
  val LAUNCH_ROLE: "LAUNCH_ROLE" = "LAUNCH_ROLE"

  @inline def values = js.Array[PropertyKey](OWNER, LAUNCH_ROLE)
}

type ProvisionedProductPlanStatus = "CREATE_IN_PROGRESS" | "CREATE_SUCCESS" | "CREATE_FAILED" | "EXECUTE_IN_PROGRESS" | "EXECUTE_SUCCESS" | "EXECUTE_FAILED"
object ProvisionedProductPlanStatus {
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val CREATE_SUCCESS: "CREATE_SUCCESS" = "CREATE_SUCCESS"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val EXECUTE_IN_PROGRESS: "EXECUTE_IN_PROGRESS" = "EXECUTE_IN_PROGRESS"
  val EXECUTE_SUCCESS: "EXECUTE_SUCCESS" = "EXECUTE_SUCCESS"
  val EXECUTE_FAILED: "EXECUTE_FAILED" = "EXECUTE_FAILED"

  @inline def values = js.Array[ProvisionedProductPlanStatus](CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED, EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED)
}

type ProvisionedProductPlanType = "CLOUDFORMATION"
object ProvisionedProductPlanType {
  val CLOUDFORMATION: "CLOUDFORMATION" = "CLOUDFORMATION"

  @inline def values = js.Array[ProvisionedProductPlanType](CLOUDFORMATION)
}

type ProvisionedProductStatus = "AVAILABLE" | "UNDER_CHANGE" | "TAINTED" | "ERROR" | "PLAN_IN_PROGRESS"
object ProvisionedProductStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val UNDER_CHANGE: "UNDER_CHANGE" = "UNDER_CHANGE"
  val TAINTED: "TAINTED" = "TAINTED"
  val ERROR: "ERROR" = "ERROR"
  val PLAN_IN_PROGRESS: "PLAN_IN_PROGRESS" = "PLAN_IN_PROGRESS"

  @inline def values = js.Array[ProvisionedProductStatus](AVAILABLE, UNDER_CHANGE, TAINTED, ERROR, PLAN_IN_PROGRESS)
}

type ProvisionedProductViewFilterBy = "SearchQuery"
object ProvisionedProductViewFilterBy {
  val SearchQuery: "SearchQuery" = "SearchQuery"

  @inline def values = js.Array[ProvisionedProductViewFilterBy](SearchQuery)
}

type ProvisioningArtifactGuidance = "DEFAULT" | "DEPRECATED"
object ProvisioningArtifactGuidance {
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  @inline def values = js.Array[ProvisioningArtifactGuidance](DEFAULT, DEPRECATED)
}

type ProvisioningArtifactPropertyName = "Id"
object ProvisioningArtifactPropertyName {
  val Id: "Id" = "Id"

  @inline def values = js.Array[ProvisioningArtifactPropertyName](Id)
}

type ProvisioningArtifactType = "CLOUD_FORMATION_TEMPLATE" | "MARKETPLACE_AMI" | "MARKETPLACE_CAR"
object ProvisioningArtifactType {
  val CLOUD_FORMATION_TEMPLATE: "CLOUD_FORMATION_TEMPLATE" = "CLOUD_FORMATION_TEMPLATE"
  val MARKETPLACE_AMI: "MARKETPLACE_AMI" = "MARKETPLACE_AMI"
  val MARKETPLACE_CAR: "MARKETPLACE_CAR" = "MARKETPLACE_CAR"

  @inline def values = js.Array[ProvisioningArtifactType](CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI, MARKETPLACE_CAR)
}

type RecordStatus = "CREATED" | "IN_PROGRESS" | "IN_PROGRESS_IN_ERROR" | "SUCCEEDED" | "FAILED"
object RecordStatus {
  val CREATED: "CREATED" = "CREATED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val IN_PROGRESS_IN_ERROR: "IN_PROGRESS_IN_ERROR" = "IN_PROGRESS_IN_ERROR"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[RecordStatus](CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR, SUCCEEDED, FAILED)
}

type Replacement = "TRUE" | "FALSE" | "CONDITIONAL"
object Replacement {
  val TRUE: "TRUE" = "TRUE"
  val FALSE: "FALSE" = "FALSE"
  val CONDITIONAL: "CONDITIONAL" = "CONDITIONAL"

  @inline def values = js.Array[Replacement](TRUE, FALSE, CONDITIONAL)
}

type RequiresRecreation = "NEVER" | "CONDITIONALLY" | "ALWAYS"
object RequiresRecreation {
  val NEVER: "NEVER" = "NEVER"
  val CONDITIONALLY: "CONDITIONALLY" = "CONDITIONALLY"
  val ALWAYS: "ALWAYS" = "ALWAYS"

  @inline def values = js.Array[RequiresRecreation](NEVER, CONDITIONALLY, ALWAYS)
}

type ResourceAttribute = "PROPERTIES" | "METADATA" | "CREATIONPOLICY" | "UPDATEPOLICY" | "DELETIONPOLICY" | "TAGS"
object ResourceAttribute {
  val PROPERTIES: "PROPERTIES" = "PROPERTIES"
  val METADATA: "METADATA" = "METADATA"
  val CREATIONPOLICY: "CREATIONPOLICY" = "CREATIONPOLICY"
  val UPDATEPOLICY: "UPDATEPOLICY" = "UPDATEPOLICY"
  val DELETIONPOLICY: "DELETIONPOLICY" = "DELETIONPOLICY"
  val TAGS: "TAGS" = "TAGS"

  @inline def values = js.Array[ResourceAttribute](PROPERTIES, METADATA, CREATIONPOLICY, UPDATEPOLICY, DELETIONPOLICY, TAGS)
}

type ServiceActionAssociationErrorCode = "DUPLICATE_RESOURCE" | "INTERNAL_FAILURE" | "LIMIT_EXCEEDED" | "RESOURCE_NOT_FOUND" | "THROTTLING"
object ServiceActionAssociationErrorCode {
  val DUPLICATE_RESOURCE: "DUPLICATE_RESOURCE" = "DUPLICATE_RESOURCE"
  val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"
  val LIMIT_EXCEEDED: "LIMIT_EXCEEDED" = "LIMIT_EXCEEDED"
  val RESOURCE_NOT_FOUND: "RESOURCE_NOT_FOUND" = "RESOURCE_NOT_FOUND"
  val THROTTLING: "THROTTLING" = "THROTTLING"

  @inline def values = js.Array[ServiceActionAssociationErrorCode](DUPLICATE_RESOURCE, INTERNAL_FAILURE, LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING)
}

type ServiceActionDefinitionKey = "Name" | "Version" | "AssumeRole" | "Parameters"
object ServiceActionDefinitionKey {
  val Name: "Name" = "Name"
  val Version: "Version" = "Version"
  val AssumeRole: "AssumeRole" = "AssumeRole"
  val Parameters: "Parameters" = "Parameters"

  @inline def values = js.Array[ServiceActionDefinitionKey](Name, Version, AssumeRole, Parameters)
}

type ServiceActionDefinitionType = "SSM_AUTOMATION"
object ServiceActionDefinitionType {
  val SSM_AUTOMATION: "SSM_AUTOMATION" = "SSM_AUTOMATION"

  @inline def values = js.Array[ServiceActionDefinitionType](SSM_AUTOMATION)
}

type ShareStatus = "NOT_STARTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERRORS" | "ERROR"
object ShareStatus {
  val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val COMPLETED_WITH_ERRORS: "COMPLETED_WITH_ERRORS" = "COMPLETED_WITH_ERRORS"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[ShareStatus](NOT_STARTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, ERROR)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[SortOrder](ASCENDING, DESCENDING)
}

type StackInstanceStatus = "CURRENT" | "OUTDATED" | "INOPERABLE"
object StackInstanceStatus {
  val CURRENT: "CURRENT" = "CURRENT"
  val OUTDATED: "OUTDATED" = "OUTDATED"
  val INOPERABLE: "INOPERABLE" = "INOPERABLE"

  @inline def values = js.Array[StackInstanceStatus](CURRENT, OUTDATED, INOPERABLE)
}

type StackSetOperationType = "CREATE" | "UPDATE" | "DELETE"
object StackSetOperationType {
  val CREATE: "CREATE" = "CREATE"
  val UPDATE: "UPDATE" = "UPDATE"
  val DELETE: "DELETE" = "DELETE"

  @inline def values = js.Array[StackSetOperationType](CREATE, UPDATE, DELETE)
}

type Status = "AVAILABLE" | "CREATING" | "FAILED"
object Status {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val CREATING: "CREATING" = "CREATING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[Status](AVAILABLE, CREATING, FAILED)
}
