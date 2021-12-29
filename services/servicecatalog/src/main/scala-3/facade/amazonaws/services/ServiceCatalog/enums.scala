package facade.amazonaws.services.servicecatalog

import scalajs._

type AccessLevelFilterKey = "Account" | "Role" | "User"
object AccessLevelFilterKey {
  inline val Account: "Account" = "Account"
  inline val Role: "Role" = "Role"
  inline val User: "User" = "User"

  inline def values: js.Array[AccessLevelFilterKey] = js.Array(Account, Role, User)
}

type AccessStatus = "ENABLED" | "UNDER_CHANGE" | "DISABLED"
object AccessStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val UNDER_CHANGE: "UNDER_CHANGE" = "UNDER_CHANGE"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[AccessStatus] = js.Array(ENABLED, UNDER_CHANGE, DISABLED)
}

type ChangeAction = "ADD" | "MODIFY" | "REMOVE"
object ChangeAction {
  inline val ADD: "ADD" = "ADD"
  inline val MODIFY: "MODIFY" = "MODIFY"
  inline val REMOVE: "REMOVE" = "REMOVE"

  inline def values: js.Array[ChangeAction] = js.Array(ADD, MODIFY, REMOVE)
}

type CopyOption = "CopyTags"
object CopyOption {
  inline val CopyTags: "CopyTags" = "CopyTags"

  inline def values: js.Array[CopyOption] = js.Array(CopyTags)
}

type CopyProductStatus = "SUCCEEDED" | "IN_PROGRESS" | "FAILED"
object CopyProductStatus {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CopyProductStatus] = js.Array(SUCCEEDED, IN_PROGRESS, FAILED)
}

type DescribePortfolioShareType = "ACCOUNT" | "ORGANIZATION" | "ORGANIZATIONAL_UNIT" | "ORGANIZATION_MEMBER_ACCOUNT"
object DescribePortfolioShareType {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"
  inline val ORGANIZATIONAL_UNIT: "ORGANIZATIONAL_UNIT" = "ORGANIZATIONAL_UNIT"
  inline val ORGANIZATION_MEMBER_ACCOUNT: "ORGANIZATION_MEMBER_ACCOUNT" = "ORGANIZATION_MEMBER_ACCOUNT"

  inline def values: js.Array[DescribePortfolioShareType] = js.Array(ACCOUNT, ORGANIZATION, ORGANIZATIONAL_UNIT, ORGANIZATION_MEMBER_ACCOUNT)
}

type EvaluationType = "STATIC" | "DYNAMIC"
object EvaluationType {
  inline val STATIC: "STATIC" = "STATIC"
  inline val DYNAMIC: "DYNAMIC" = "DYNAMIC"

  inline def values: js.Array[EvaluationType] = js.Array(STATIC, DYNAMIC)
}

type OrganizationNodeType = "ORGANIZATION" | "ORGANIZATIONAL_UNIT" | "ACCOUNT"
object OrganizationNodeType {
  inline val ORGANIZATION: "ORGANIZATION" = "ORGANIZATION"
  inline val ORGANIZATIONAL_UNIT: "ORGANIZATIONAL_UNIT" = "ORGANIZATIONAL_UNIT"
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"

  inline def values: js.Array[OrganizationNodeType] = js.Array(ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT)
}

type PortfolioShareType = "IMPORTED" | "AWS_SERVICECATALOG" | "AWS_ORGANIZATIONS"
object PortfolioShareType {
  inline val IMPORTED: "IMPORTED" = "IMPORTED"
  inline val AWS_SERVICECATALOG: "AWS_SERVICECATALOG" = "AWS_SERVICECATALOG"
  inline val AWS_ORGANIZATIONS: "AWS_ORGANIZATIONS" = "AWS_ORGANIZATIONS"

  inline def values: js.Array[PortfolioShareType] = js.Array(IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS)
}

type PrincipalType = "IAM"
object PrincipalType {
  inline val IAM: "IAM" = "IAM"

  inline def values: js.Array[PrincipalType] = js.Array(IAM)
}

type ProductSource = "ACCOUNT"
object ProductSource {
  inline val ACCOUNT: "ACCOUNT" = "ACCOUNT"

  inline def values: js.Array[ProductSource] = js.Array(ACCOUNT)
}

type ProductType = "CLOUD_FORMATION_TEMPLATE" | "MARKETPLACE"
object ProductType {
  inline val CLOUD_FORMATION_TEMPLATE: "CLOUD_FORMATION_TEMPLATE" = "CLOUD_FORMATION_TEMPLATE"
  inline val MARKETPLACE: "MARKETPLACE" = "MARKETPLACE"

  inline def values: js.Array[ProductType] = js.Array(CLOUD_FORMATION_TEMPLATE, MARKETPLACE)
}

type ProductViewFilterBy = "FullTextSearch" | "Owner" | "ProductType" | "SourceProductId"
object ProductViewFilterBy {
  inline val FullTextSearch: "FullTextSearch" = "FullTextSearch"
  inline val Owner: "Owner" = "Owner"
  inline val ProductType: "ProductType" = "ProductType"
  inline val SourceProductId: "SourceProductId" = "SourceProductId"

  inline def values: js.Array[ProductViewFilterBy] = js.Array(FullTextSearch, Owner, ProductType, SourceProductId)
}

type ProductViewSortBy = "Title" | "VersionCount" | "CreationDate"
object ProductViewSortBy {
  inline val Title: "Title" = "Title"
  inline val VersionCount: "VersionCount" = "VersionCount"
  inline val CreationDate: "CreationDate" = "CreationDate"

  inline def values: js.Array[ProductViewSortBy] = js.Array(Title, VersionCount, CreationDate)
}

type PropertyKey = "OWNER" | "LAUNCH_ROLE"
object PropertyKey {
  inline val OWNER: "OWNER" = "OWNER"
  inline val LAUNCH_ROLE: "LAUNCH_ROLE" = "LAUNCH_ROLE"

  inline def values: js.Array[PropertyKey] = js.Array(OWNER, LAUNCH_ROLE)
}

type ProvisionedProductPlanStatus = "CREATE_IN_PROGRESS" | "CREATE_SUCCESS" | "CREATE_FAILED" | "EXECUTE_IN_PROGRESS" | "EXECUTE_SUCCESS" | "EXECUTE_FAILED"
object ProvisionedProductPlanStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_SUCCESS: "CREATE_SUCCESS" = "CREATE_SUCCESS"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val EXECUTE_IN_PROGRESS: "EXECUTE_IN_PROGRESS" = "EXECUTE_IN_PROGRESS"
  inline val EXECUTE_SUCCESS: "EXECUTE_SUCCESS" = "EXECUTE_SUCCESS"
  inline val EXECUTE_FAILED: "EXECUTE_FAILED" = "EXECUTE_FAILED"

  inline def values: js.Array[ProvisionedProductPlanStatus] = js.Array(CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED, EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED)
}

type ProvisionedProductPlanType = "CLOUDFORMATION"
object ProvisionedProductPlanType {
  inline val CLOUDFORMATION: "CLOUDFORMATION" = "CLOUDFORMATION"

  inline def values: js.Array[ProvisionedProductPlanType] = js.Array(CLOUDFORMATION)
}

type ProvisionedProductStatus = "AVAILABLE" | "UNDER_CHANGE" | "TAINTED" | "ERROR" | "PLAN_IN_PROGRESS"
object ProvisionedProductStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UNDER_CHANGE: "UNDER_CHANGE" = "UNDER_CHANGE"
  inline val TAINTED: "TAINTED" = "TAINTED"
  inline val ERROR: "ERROR" = "ERROR"
  inline val PLAN_IN_PROGRESS: "PLAN_IN_PROGRESS" = "PLAN_IN_PROGRESS"

  inline def values: js.Array[ProvisionedProductStatus] = js.Array(AVAILABLE, UNDER_CHANGE, TAINTED, ERROR, PLAN_IN_PROGRESS)
}

type ProvisionedProductViewFilterBy = "SearchQuery"
object ProvisionedProductViewFilterBy {
  inline val SearchQuery: "SearchQuery" = "SearchQuery"

  inline def values: js.Array[ProvisionedProductViewFilterBy] = js.Array(SearchQuery)
}

type ProvisioningArtifactGuidance = "DEFAULT" | "DEPRECATED"
object ProvisioningArtifactGuidance {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val DEPRECATED: "DEPRECATED" = "DEPRECATED"

  inline def values: js.Array[ProvisioningArtifactGuidance] = js.Array(DEFAULT, DEPRECATED)
}

type ProvisioningArtifactPropertyName = "Id"
object ProvisioningArtifactPropertyName {
  inline val Id: "Id" = "Id"

  inline def values: js.Array[ProvisioningArtifactPropertyName] = js.Array(Id)
}

type ProvisioningArtifactType = "CLOUD_FORMATION_TEMPLATE" | "MARKETPLACE_AMI" | "MARKETPLACE_CAR"
object ProvisioningArtifactType {
  inline val CLOUD_FORMATION_TEMPLATE: "CLOUD_FORMATION_TEMPLATE" = "CLOUD_FORMATION_TEMPLATE"
  inline val MARKETPLACE_AMI: "MARKETPLACE_AMI" = "MARKETPLACE_AMI"
  inline val MARKETPLACE_CAR: "MARKETPLACE_CAR" = "MARKETPLACE_CAR"

  inline def values: js.Array[ProvisioningArtifactType] = js.Array(CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI, MARKETPLACE_CAR)
}

type RecordStatus = "CREATED" | "IN_PROGRESS" | "IN_PROGRESS_IN_ERROR" | "SUCCEEDED" | "FAILED"
object RecordStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val IN_PROGRESS_IN_ERROR: "IN_PROGRESS_IN_ERROR" = "IN_PROGRESS_IN_ERROR"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[RecordStatus] = js.Array(CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR, SUCCEEDED, FAILED)
}

type Replacement = "TRUE" | "FALSE" | "CONDITIONAL"
object Replacement {
  inline val TRUE: "TRUE" = "TRUE"
  inline val FALSE: "FALSE" = "FALSE"
  inline val CONDITIONAL: "CONDITIONAL" = "CONDITIONAL"

  inline def values: js.Array[Replacement] = js.Array(TRUE, FALSE, CONDITIONAL)
}

type RequiresRecreation = "NEVER" | "CONDITIONALLY" | "ALWAYS"
object RequiresRecreation {
  inline val NEVER: "NEVER" = "NEVER"
  inline val CONDITIONALLY: "CONDITIONALLY" = "CONDITIONALLY"
  inline val ALWAYS: "ALWAYS" = "ALWAYS"

  inline def values: js.Array[RequiresRecreation] = js.Array(NEVER, CONDITIONALLY, ALWAYS)
}

type ResourceAttribute = "PROPERTIES" | "METADATA" | "CREATIONPOLICY" | "UPDATEPOLICY" | "DELETIONPOLICY" | "TAGS"
object ResourceAttribute {
  inline val PROPERTIES: "PROPERTIES" = "PROPERTIES"
  inline val METADATA: "METADATA" = "METADATA"
  inline val CREATIONPOLICY: "CREATIONPOLICY" = "CREATIONPOLICY"
  inline val UPDATEPOLICY: "UPDATEPOLICY" = "UPDATEPOLICY"
  inline val DELETIONPOLICY: "DELETIONPOLICY" = "DELETIONPOLICY"
  inline val TAGS: "TAGS" = "TAGS"

  inline def values: js.Array[ResourceAttribute] = js.Array(PROPERTIES, METADATA, CREATIONPOLICY, UPDATEPOLICY, DELETIONPOLICY, TAGS)
}

type ServiceActionAssociationErrorCode = "DUPLICATE_RESOURCE" | "INTERNAL_FAILURE" | "LIMIT_EXCEEDED" | "RESOURCE_NOT_FOUND" | "THROTTLING"
object ServiceActionAssociationErrorCode {
  inline val DUPLICATE_RESOURCE: "DUPLICATE_RESOURCE" = "DUPLICATE_RESOURCE"
  inline val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"
  inline val LIMIT_EXCEEDED: "LIMIT_EXCEEDED" = "LIMIT_EXCEEDED"
  inline val RESOURCE_NOT_FOUND: "RESOURCE_NOT_FOUND" = "RESOURCE_NOT_FOUND"
  inline val THROTTLING: "THROTTLING" = "THROTTLING"

  inline def values: js.Array[ServiceActionAssociationErrorCode] = js.Array(DUPLICATE_RESOURCE, INTERNAL_FAILURE, LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING)
}

type ServiceActionDefinitionKey = "Name" | "Version" | "AssumeRole" | "Parameters"
object ServiceActionDefinitionKey {
  inline val Name: "Name" = "Name"
  inline val Version: "Version" = "Version"
  inline val AssumeRole: "AssumeRole" = "AssumeRole"
  inline val Parameters: "Parameters" = "Parameters"

  inline def values: js.Array[ServiceActionDefinitionKey] = js.Array(Name, Version, AssumeRole, Parameters)
}

type ServiceActionDefinitionType = "SSM_AUTOMATION"
object ServiceActionDefinitionType {
  inline val SSM_AUTOMATION: "SSM_AUTOMATION" = "SSM_AUTOMATION"

  inline def values: js.Array[ServiceActionDefinitionType] = js.Array(SSM_AUTOMATION)
}

type ShareStatus = "NOT_STARTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERRORS" | "ERROR"
object ShareStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val COMPLETED_WITH_ERRORS: "COMPLETED_WITH_ERRORS" = "COMPLETED_WITH_ERRORS"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[ShareStatus] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, ERROR)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

type StackInstanceStatus = "CURRENT" | "OUTDATED" | "INOPERABLE"
object StackInstanceStatus {
  inline val CURRENT: "CURRENT" = "CURRENT"
  inline val OUTDATED: "OUTDATED" = "OUTDATED"
  inline val INOPERABLE: "INOPERABLE" = "INOPERABLE"

  inline def values: js.Array[StackInstanceStatus] = js.Array(CURRENT, OUTDATED, INOPERABLE)
}

type StackSetOperationType = "CREATE" | "UPDATE" | "DELETE"
object StackSetOperationType {
  inline val CREATE: "CREATE" = "CREATE"
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[StackSetOperationType] = js.Array(CREATE, UPDATE, DELETE)
}

type Status = "AVAILABLE" | "CREATING" | "FAILED"
object Status {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[Status] = js.Array(AVAILABLE, CREATING, FAILED)
}
