package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object servicecatalog {
  type AcceptLanguage = String
  type AccessLevelFilterKey = String
  type AccessLevelFilterValue = String
  type AccessStatus = String
  type AccountId = String
  type AccountIds = js.Array[AccountId]
  type AddTags = js.Array[Tag]
  type AllowedValue = String
  type AllowedValues = js.Array[AllowedValue]
  type ApproximateCount = Int
  type AttributeValue = String
  type CausingEntity = String
  type ChangeAction = String
  type CloudWatchDashboardName = String
  type CloudWatchDashboards = js.Array[CloudWatchDashboard]
  type ConstraintDescription = String
  type ConstraintDetails = js.Array[ConstraintDetail]
  type ConstraintParameters = String
  type ConstraintSummaries = js.Array[ConstraintSummary]
  type ConstraintType = String
  type CopyOption = String
  type CopyOptions = js.Array[CopyOption]
  type CopyProductStatus = String
  type CreatedTime = js.Date
  type CreationTime = js.Date
  type DefaultValue = String
  type Description = String
  type Error = String
  type ErrorCode = String
  type ErrorDescription = String
  type EvaluationType = String
  type FailedServiceActionAssociations = js.Array[FailedServiceActionAssociation]
  type HasDefaultPath = Boolean
  type Id = String
  type IdempotencyToken = String
  type IgnoreErrors = Boolean
  type InstructionType = String
  type InstructionValue = String
  type LastRequestId = String
  type LaunchPathSummaries = js.Array[LaunchPathSummary]
  type LogicalResourceId = String
  type Message = String
  type Namespaces = js.Array[AccountId]
  type NoEcho = Boolean
  type NotificationArn = String
  type NotificationArns = js.Array[NotificationArn]
  type OrganizationNodeType = String
  type OrganizationNodeValue = String
  type OrganizationNodes = js.Array[OrganizationNode]
  type OutputKey = String
  type OutputValue = String
  type PageSize = Int
  type PageToken = String
  type ParameterKey = String
  type ParameterType = String
  type ParameterValue = String
  type PhysicalId = String
  type PhysicalResourceId = String
  type PlanResourceType = String
  type PortfolioDescription = String
  type PortfolioDetails = js.Array[PortfolioDetail]
  type PortfolioDisplayName = String
  type PortfolioName = String
  type PortfolioShareToken = String
  type PortfolioShareType = String
  type PrincipalARN = String
  type PrincipalType = String
  type Principals = js.Array[Principal]
  type ProductArn = String
  type ProductSource = String
  type ProductType = String
  type ProductViewAggregationType = String
  type ProductViewAggregationValues = js.Array[ProductViewAggregationValue]
  type ProductViewAggregations = js.Dictionary[ProductViewAggregationValues]
  type ProductViewDetails = js.Array[ProductViewDetail]
  type ProductViewDistributor = String
  type ProductViewFilterBy = String
  type ProductViewFilterValue = String
  type ProductViewFilterValues = js.Array[ProductViewFilterValue]
  type ProductViewFilters = js.Dictionary[ProductViewFilterValues]
  type ProductViewName = String
  type ProductViewOwner = String
  type ProductViewShortDescription = String
  type ProductViewSortBy = String
  type ProductViewSummaries = js.Array[ProductViewSummary]
  type PropertyName = String
  type ProviderName = String
  type ProvisionedProductAttributes = js.Array[ProvisionedProductAttribute]
  type ProvisionedProductDetails = js.Array[ProvisionedProductDetail]
  type ProvisionedProductFilters = js.Dictionary[ProvisionedProductViewFilterValues]
  type ProvisionedProductId = String
  type ProvisionedProductName = String
  type ProvisionedProductNameOrArn = String
  type ProvisionedProductPlanName = String
  type ProvisionedProductPlanStatus = String
  type ProvisionedProductPlanType = String
  type ProvisionedProductPlans = js.Array[ProvisionedProductPlanSummary]
  type ProvisionedProductStatus = String
  type ProvisionedProductStatusMessage = String
  type ProvisionedProductType = String
  type ProvisionedProductViewFilterBy = String
  type ProvisionedProductViewFilterValue = String
  type ProvisionedProductViewFilterValues = js.Array[ProvisionedProductViewFilterValue]
  type ProvisioningArtifactActive = Boolean
  type ProvisioningArtifactCreatedTime = js.Date
  type ProvisioningArtifactDescription = String
  type ProvisioningArtifactDetails = js.Array[ProvisioningArtifactDetail]
  type ProvisioningArtifactInfo = js.Dictionary[ProvisioningArtifactInfoValue]
  type ProvisioningArtifactInfoKey = String
  type ProvisioningArtifactInfoValue = String
  type ProvisioningArtifactName = String
  type ProvisioningArtifactParameters = js.Array[ProvisioningArtifactParameter]
  type ProvisioningArtifactPropertyName = String
  type ProvisioningArtifactPropertyValue = String
  type ProvisioningArtifactSummaries = js.Array[ProvisioningArtifactSummary]
  type ProvisioningArtifactType = String
  type ProvisioningArtifactViews = js.Array[ProvisioningArtifactView]
  type ProvisioningArtifacts = js.Array[ProvisioningArtifact]
  type ProvisioningParameters = js.Array[ProvisioningParameter]
  type RecordDetails = js.Array[RecordDetail]
  type RecordErrors = js.Array[RecordError]
  type RecordOutputs = js.Array[RecordOutput]
  type RecordStatus = String
  type RecordTagKey = String
  type RecordTagValue = String
  type RecordTags = js.Array[RecordTag]
  type RecordType = String
  type Region = String
  type Replacement = String
  type RequiresRecreation = String
  type ResourceARN = String
  type ResourceAttribute = String
  type ResourceChangeDetails = js.Array[ResourceChangeDetail]
  type ResourceChanges = js.Array[ResourceChange]
  type ResourceDetailARN = String
  type ResourceDetailCreatedTime = js.Date
  type ResourceDetailDescription = String
  type ResourceDetailId = String
  type ResourceDetailName = String
  type ResourceDetails = js.Array[ResourceDetail]
  type ResourceId = String
  type ResourceType = String
  type Scope = js.Array[ResourceAttribute]
  type SearchFilterKey = String
  type SearchFilterValue = String
  type SearchProvisionedProductsPageSize = Int
  type ServiceActionAssociationErrorCode = String
  type ServiceActionAssociationErrorMessage = String
  type ServiceActionAssociations = js.Array[ServiceActionAssociation]
  type ServiceActionDefinitionKey = String
  type ServiceActionDefinitionMap = js.Dictionary[ServiceActionDefinitionValue]
  type ServiceActionDefinitionType = String
  type ServiceActionDefinitionValue = String
  type ServiceActionDescription = String
  type ServiceActionName = String
  type ServiceActionSummaries = js.Array[ServiceActionSummary]
  type ShareErrors = js.Array[ShareError]
  type ShareStatus = String
  type SortField = String
  type SortOrder = String
  type SourceProvisioningArtifactProperties = js.Array[SourceProvisioningArtifactPropertiesMap]
  type SourceProvisioningArtifactPropertiesMap = js.Dictionary[ProvisioningArtifactPropertyValue]
  type StackSetAccounts = js.Array[AccountId]
  type StackSetFailureToleranceCount = Int
  type StackSetFailureTolerancePercentage = Int
  type StackSetMaxConcurrencyCount = Int
  type StackSetMaxConcurrencyPercentage = Int
  type StackSetOperationType = String
  type StackSetRegions = js.Array[Region]
  type Status = String
  type StatusDetail = String
  type StatusMessage = String
  type SuccessfulShares = js.Array[AccountId]
  type SupportDescription = String
  type SupportEmail = String
  type SupportUrl = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagOptionActive = Boolean
  type TagOptionDetails = js.Array[TagOptionDetail]
  type TagOptionId = String
  type TagOptionKey = String
  type TagOptionSummaries = js.Array[TagOptionSummary]
  type TagOptionValue = String
  type TagOptionValues = js.Array[TagOptionValue]
  type TagValue = String
  type Tags = js.Array[Tag]
  type TotalResultsCount = Int
  type UpdateProvisioningParameters = js.Array[UpdateProvisioningParameter]
  type UpdatedTime = js.Date
  type UsageInstructions = js.Array[UsageInstruction]
  type UsePreviousValue = Boolean
  type UserArn = String
  type UserArnSession = String
  type Verbose = Boolean
}

package servicecatalog {
  @js.native
  @JSImport("aws-sdk", "ServiceCatalog")
  class ServiceCatalog(config: AWSConfig) extends js.Object {
    def acceptPortfolioShare(params: AcceptPortfolioShareInput): Request[AcceptPortfolioShareOutput] = js.native
    def associatePrincipalWithPortfolio(params: AssociatePrincipalWithPortfolioInput): Request[AssociatePrincipalWithPortfolioOutput] = js.native
    def associateProductWithPortfolio(params: AssociateProductWithPortfolioInput): Request[AssociateProductWithPortfolioOutput] = js.native
    def associateServiceActionWithProvisioningArtifact(params: AssociateServiceActionWithProvisioningArtifactInput): Request[AssociateServiceActionWithProvisioningArtifactOutput] = js.native
    def associateTagOptionWithResource(params: AssociateTagOptionWithResourceInput): Request[AssociateTagOptionWithResourceOutput] = js.native
    def batchAssociateServiceActionWithProvisioningArtifact(params: BatchAssociateServiceActionWithProvisioningArtifactInput): Request[BatchAssociateServiceActionWithProvisioningArtifactOutput] = js.native
    def batchDisassociateServiceActionFromProvisioningArtifact(params: BatchDisassociateServiceActionFromProvisioningArtifactInput): Request[BatchDisassociateServiceActionFromProvisioningArtifactOutput] = js.native
    def copyProduct(params: CopyProductInput): Request[CopyProductOutput] = js.native
    def createConstraint(params: CreateConstraintInput): Request[CreateConstraintOutput] = js.native
    def createPortfolio(params: CreatePortfolioInput): Request[CreatePortfolioOutput] = js.native
    def createPortfolioShare(params: CreatePortfolioShareInput): Request[CreatePortfolioShareOutput] = js.native
    def createProduct(params: CreateProductInput): Request[CreateProductOutput] = js.native
    def createProvisionedProductPlan(params: CreateProvisionedProductPlanInput): Request[CreateProvisionedProductPlanOutput] = js.native
    def createProvisioningArtifact(params: CreateProvisioningArtifactInput): Request[CreateProvisioningArtifactOutput] = js.native
    def createServiceAction(params: CreateServiceActionInput): Request[CreateServiceActionOutput] = js.native
    def createTagOption(params: CreateTagOptionInput): Request[CreateTagOptionOutput] = js.native
    def deleteConstraint(params: DeleteConstraintInput): Request[DeleteConstraintOutput] = js.native
    def deletePortfolio(params: DeletePortfolioInput): Request[DeletePortfolioOutput] = js.native
    def deletePortfolioShare(params: DeletePortfolioShareInput): Request[DeletePortfolioShareOutput] = js.native
    def deleteProduct(params: DeleteProductInput): Request[DeleteProductOutput] = js.native
    def deleteProvisionedProductPlan(params: DeleteProvisionedProductPlanInput): Request[DeleteProvisionedProductPlanOutput] = js.native
    def deleteProvisioningArtifact(params: DeleteProvisioningArtifactInput): Request[DeleteProvisioningArtifactOutput] = js.native
    def deleteServiceAction(params: DeleteServiceActionInput): Request[DeleteServiceActionOutput] = js.native
    def deleteTagOption(params: DeleteTagOptionInput): Request[DeleteTagOptionOutput] = js.native
    def describeConstraint(params: DescribeConstraintInput): Request[DescribeConstraintOutput] = js.native
    def describeCopyProductStatus(params: DescribeCopyProductStatusInput): Request[DescribeCopyProductStatusOutput] = js.native
    def describePortfolio(params: DescribePortfolioInput): Request[DescribePortfolioOutput] = js.native
    def describePortfolioShareStatus(params: DescribePortfolioShareStatusInput): Request[DescribePortfolioShareStatusOutput] = js.native
    def describeProduct(params: DescribeProductInput): Request[DescribeProductOutput] = js.native
    def describeProductAsAdmin(params: DescribeProductAsAdminInput): Request[DescribeProductAsAdminOutput] = js.native
    def describeProductView(params: DescribeProductViewInput): Request[DescribeProductViewOutput] = js.native
    def describeProvisionedProduct(params: DescribeProvisionedProductInput): Request[DescribeProvisionedProductOutput] = js.native
    def describeProvisionedProductPlan(params: DescribeProvisionedProductPlanInput): Request[DescribeProvisionedProductPlanOutput] = js.native
    def describeProvisioningArtifact(params: DescribeProvisioningArtifactInput): Request[DescribeProvisioningArtifactOutput] = js.native
    def describeProvisioningParameters(params: DescribeProvisioningParametersInput): Request[DescribeProvisioningParametersOutput] = js.native
    def describeRecord(params: DescribeRecordInput): Request[DescribeRecordOutput] = js.native
    def describeServiceAction(params: DescribeServiceActionInput): Request[DescribeServiceActionOutput] = js.native
    def describeTagOption(params: DescribeTagOptionInput): Request[DescribeTagOptionOutput] = js.native
    def disableAWSOrganizationsAccess(params: DisableAWSOrganizationsAccessInput): Request[DisableAWSOrganizationsAccessOutput] = js.native
    def disassociatePrincipalFromPortfolio(params: DisassociatePrincipalFromPortfolioInput): Request[DisassociatePrincipalFromPortfolioOutput] = js.native
    def disassociateProductFromPortfolio(params: DisassociateProductFromPortfolioInput): Request[DisassociateProductFromPortfolioOutput] = js.native
    def disassociateServiceActionFromProvisioningArtifact(params: DisassociateServiceActionFromProvisioningArtifactInput): Request[DisassociateServiceActionFromProvisioningArtifactOutput] = js.native
    def disassociateTagOptionFromResource(params: DisassociateTagOptionFromResourceInput): Request[DisassociateTagOptionFromResourceOutput] = js.native
    def enableAWSOrganizationsAccess(params: EnableAWSOrganizationsAccessInput): Request[EnableAWSOrganizationsAccessOutput] = js.native
    def executeProvisionedProductPlan(params: ExecuteProvisionedProductPlanInput): Request[ExecuteProvisionedProductPlanOutput] = js.native
    def executeProvisionedProductServiceAction(params: ExecuteProvisionedProductServiceActionInput): Request[ExecuteProvisionedProductServiceActionOutput] = js.native
    def getAWSOrganizationsAccessStatus(params: GetAWSOrganizationsAccessStatusInput): Request[GetAWSOrganizationsAccessStatusOutput] = js.native
    def listAcceptedPortfolioShares(params: ListAcceptedPortfolioSharesInput): Request[ListAcceptedPortfolioSharesOutput] = js.native
    def listConstraintsForPortfolio(params: ListConstraintsForPortfolioInput): Request[ListConstraintsForPortfolioOutput] = js.native
    def listLaunchPaths(params: ListLaunchPathsInput): Request[ListLaunchPathsOutput] = js.native
    def listOrganizationPortfolioAccess(params: ListOrganizationPortfolioAccessInput): Request[ListOrganizationPortfolioAccessOutput] = js.native
    def listPortfolioAccess(params: ListPortfolioAccessInput): Request[ListPortfolioAccessOutput] = js.native
    def listPortfolios(params: ListPortfoliosInput): Request[ListPortfoliosOutput] = js.native
    def listPortfoliosForProduct(params: ListPortfoliosForProductInput): Request[ListPortfoliosForProductOutput] = js.native
    def listPrincipalsForPortfolio(params: ListPrincipalsForPortfolioInput): Request[ListPrincipalsForPortfolioOutput] = js.native
    def listProvisionedProductPlans(params: ListProvisionedProductPlansInput): Request[ListProvisionedProductPlansOutput] = js.native
    def listProvisioningArtifacts(params: ListProvisioningArtifactsInput): Request[ListProvisioningArtifactsOutput] = js.native
    def listProvisioningArtifactsForServiceAction(params: ListProvisioningArtifactsForServiceActionInput): Request[ListProvisioningArtifactsForServiceActionOutput] = js.native
    def listRecordHistory(params: ListRecordHistoryInput): Request[ListRecordHistoryOutput] = js.native
    def listResourcesForTagOption(params: ListResourcesForTagOptionInput): Request[ListResourcesForTagOptionOutput] = js.native
    def listServiceActions(params: ListServiceActionsInput): Request[ListServiceActionsOutput] = js.native
    def listServiceActionsForProvisioningArtifact(params: ListServiceActionsForProvisioningArtifactInput): Request[ListServiceActionsForProvisioningArtifactOutput] = js.native
    def listTagOptions(params: ListTagOptionsInput): Request[ListTagOptionsOutput] = js.native
    def provisionProduct(params: ProvisionProductInput): Request[ProvisionProductOutput] = js.native
    def rejectPortfolioShare(params: RejectPortfolioShareInput): Request[RejectPortfolioShareOutput] = js.native
    def scanProvisionedProducts(params: ScanProvisionedProductsInput): Request[ScanProvisionedProductsOutput] = js.native
    def searchProducts(params: SearchProductsInput): Request[SearchProductsOutput] = js.native
    def searchProductsAsAdmin(params: SearchProductsAsAdminInput): Request[SearchProductsAsAdminOutput] = js.native
    def searchProvisionedProducts(params: SearchProvisionedProductsInput): Request[SearchProvisionedProductsOutput] = js.native
    def terminateProvisionedProduct(params: TerminateProvisionedProductInput): Request[TerminateProvisionedProductOutput] = js.native
    def updateConstraint(params: UpdateConstraintInput): Request[UpdateConstraintOutput] = js.native
    def updatePortfolio(params: UpdatePortfolioInput): Request[UpdatePortfolioOutput] = js.native
    def updateProduct(params: UpdateProductInput): Request[UpdateProductOutput] = js.native
    def updateProvisionedProduct(params: UpdateProvisionedProductInput): Request[UpdateProvisionedProductOutput] = js.native
    def updateProvisioningArtifact(params: UpdateProvisioningArtifactInput): Request[UpdateProvisioningArtifactOutput] = js.native
    def updateServiceAction(params: UpdateServiceActionInput): Request[UpdateServiceActionOutput] = js.native
    def updateTagOption(params: UpdateTagOptionInput): Request[UpdateTagOptionOutput] = js.native
  }

  @js.native
  trait AcceptPortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  object AcceptPortfolioShareInput {
    def apply(
      PortfolioId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined): AcceptPortfolioShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PortfolioShareType" -> PortfolioShareType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptPortfolioShareInput]
    }
  }

  @js.native
  trait AcceptPortfolioShareOutput extends js.Object {

  }

  object AcceptPortfolioShareOutput {
    def apply(): AcceptPortfolioShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptPortfolioShareOutput]
    }
  }

  /**
   * <p>The access level to use to filter results.</p>
   */
  @js.native
  trait AccessLevelFilter extends js.Object {
    var Key: js.UndefOr[AccessLevelFilterKey]
    var Value: js.UndefOr[AccessLevelFilterValue]
  }

  object AccessLevelFilter {
    def apply(
      Key: js.UndefOr[AccessLevelFilterKey] = js.undefined,
      Value: js.UndefOr[AccessLevelFilterValue] = js.undefined): AccessLevelFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessLevelFilter]
    }
  }

  object AccessLevelFilterKeyEnum {
    val Account = "Account"
    val Role = "Role"
    val User = "User"

    val values = IndexedSeq(Account, Role, User)
  }

  object AccessStatusEnum {
    val ENABLED = "ENABLED"
    val UNDER_CHANGE = "UNDER_CHANGE"
    val DISABLED = "DISABLED"

    val values = IndexedSeq(ENABLED, UNDER_CHANGE, DISABLED)
  }

  @js.native
  trait AssociatePrincipalWithPortfolioInput extends js.Object {
    var PortfolioId: Id
    var PrincipalARN: PrincipalARN
    var PrincipalType: PrincipalType
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object AssociatePrincipalWithPortfolioInput {
    def apply(
      PortfolioId: Id,
      PrincipalARN: PrincipalARN,
      PrincipalType: PrincipalType,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): AssociatePrincipalWithPortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "PrincipalARN" -> PrincipalARN.asInstanceOf[js.Any],
        "PrincipalType" -> PrincipalType.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociatePrincipalWithPortfolioInput]
    }
  }

  @js.native
  trait AssociatePrincipalWithPortfolioOutput extends js.Object {

  }

  object AssociatePrincipalWithPortfolioOutput {
    def apply(): AssociatePrincipalWithPortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociatePrincipalWithPortfolioOutput]
    }
  }

  @js.native
  trait AssociateProductWithPortfolioInput extends js.Object {
    var PortfolioId: Id
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var SourcePortfolioId: js.UndefOr[Id]
  }

  object AssociateProductWithPortfolioInput {
    def apply(
      PortfolioId: Id,
      ProductId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      SourcePortfolioId: js.UndefOr[Id] = js.undefined): AssociateProductWithPortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "SourcePortfolioId" -> SourcePortfolioId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateProductWithPortfolioInput]
    }
  }

  @js.native
  trait AssociateProductWithPortfolioOutput extends js.Object {

  }

  object AssociateProductWithPortfolioOutput {
    def apply(): AssociateProductWithPortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateProductWithPortfolioOutput]
    }
  }

  @js.native
  trait AssociateServiceActionWithProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object AssociateServiceActionWithProvisioningArtifactInput {
    def apply(
      ProductId: Id,
      ProvisioningArtifactId: Id,
      ServiceActionId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): AssociateServiceActionWithProvisioningArtifactInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateServiceActionWithProvisioningArtifactInput]
    }
  }

  @js.native
  trait AssociateServiceActionWithProvisioningArtifactOutput extends js.Object {

  }

  object AssociateServiceActionWithProvisioningArtifactOutput {
    def apply(): AssociateServiceActionWithProvisioningArtifactOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateServiceActionWithProvisioningArtifactOutput]
    }
  }

  @js.native
  trait AssociateTagOptionWithResourceInput extends js.Object {
    var ResourceId: ResourceId
    var TagOptionId: TagOptionId
  }

  object AssociateTagOptionWithResourceInput {
    def apply(
      ResourceId: ResourceId,
      TagOptionId: TagOptionId): AssociateTagOptionWithResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagOptionId" -> TagOptionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateTagOptionWithResourceInput]
    }
  }

  @js.native
  trait AssociateTagOptionWithResourceOutput extends js.Object {

  }

  object AssociateTagOptionWithResourceOutput {
    def apply(): AssociateTagOptionWithResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateTagOptionWithResourceOutput]
    }
  }

  @js.native
  trait BatchAssociateServiceActionWithProvisioningArtifactInput extends js.Object {
    var ServiceActionAssociations: ServiceActionAssociations
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object BatchAssociateServiceActionWithProvisioningArtifactInput {
    def apply(
      ServiceActionAssociations: ServiceActionAssociations,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): BatchAssociateServiceActionWithProvisioningArtifactInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceActionAssociations" -> ServiceActionAssociations.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactInput]
    }
  }

  @js.native
  trait BatchAssociateServiceActionWithProvisioningArtifactOutput extends js.Object {
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations]
  }

  object BatchAssociateServiceActionWithProvisioningArtifactOutput {
    def apply(
      FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations] = js.undefined): BatchAssociateServiceActionWithProvisioningArtifactOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedServiceActionAssociations" -> FailedServiceActionAssociations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactOutput]
    }
  }

  @js.native
  trait BatchDisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
    var ServiceActionAssociations: ServiceActionAssociations
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object BatchDisassociateServiceActionFromProvisioningArtifactInput {
    def apply(
      ServiceActionAssociations: ServiceActionAssociations,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): BatchDisassociateServiceActionFromProvisioningArtifactInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceActionAssociations" -> ServiceActionAssociations.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactInput]
    }
  }

  @js.native
  trait BatchDisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations]
  }

  object BatchDisassociateServiceActionFromProvisioningArtifactOutput {
    def apply(
      FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations] = js.undefined): BatchDisassociateServiceActionFromProvisioningArtifactOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedServiceActionAssociations" -> FailedServiceActionAssociations.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactOutput]
    }
  }

  object ChangeActionEnum {
    val ADD = "ADD"
    val MODIFY = "MODIFY"
    val REMOVE = "REMOVE"

    val values = IndexedSeq(ADD, MODIFY, REMOVE)
  }

  /**
   * <p>Information about a CloudWatch dashboard.</p>
   */
  @js.native
  trait CloudWatchDashboard extends js.Object {
    var Name: js.UndefOr[CloudWatchDashboardName]
  }

  object CloudWatchDashboard {
    def apply(
      Name: js.UndefOr[CloudWatchDashboardName] = js.undefined): CloudWatchDashboard = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchDashboard]
    }
  }

  /**
   * <p>Information about a constraint.</p>
   */
  @js.native
  trait ConstraintDetail extends js.Object {
    var ConstraintId: js.UndefOr[Id]
    var Description: js.UndefOr[ConstraintDescription]
    var Owner: js.UndefOr[AccountId]
    var Type: js.UndefOr[ConstraintType]
  }

  object ConstraintDetail {
    def apply(
      ConstraintId: js.UndefOr[Id] = js.undefined,
      Description: js.UndefOr[ConstraintDescription] = js.undefined,
      Owner: js.UndefOr[AccountId] = js.undefined,
      Type: js.UndefOr[ConstraintType] = js.undefined): ConstraintDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConstraintId" -> ConstraintId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConstraintDetail]
    }
  }

  /**
   * <p>Summary information about a constraint.</p>
   */
  @js.native
  trait ConstraintSummary extends js.Object {
    var Description: js.UndefOr[ConstraintDescription]
    var Type: js.UndefOr[ConstraintType]
  }

  object ConstraintSummary {
    def apply(
      Description: js.UndefOr[ConstraintDescription] = js.undefined,
      Type: js.UndefOr[ConstraintType] = js.undefined): ConstraintSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConstraintSummary]
    }
  }

  object CopyOptionEnum {
    val CopyTags = "CopyTags"

    val values = IndexedSeq(CopyTags)
  }

  @js.native
  trait CopyProductInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var SourceProductArn: ProductArn
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var CopyOptions: js.UndefOr[CopyOptions]
    var SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties]
    var TargetProductId: js.UndefOr[Id]
    var TargetProductName: js.UndefOr[ProductViewName]
  }

  object CopyProductInput {
    def apply(
      IdempotencyToken: IdempotencyToken,
      SourceProductArn: ProductArn,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      CopyOptions: js.UndefOr[CopyOptions] = js.undefined,
      SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties] = js.undefined,
      TargetProductId: js.UndefOr[Id] = js.undefined,
      TargetProductName: js.UndefOr[ProductViewName] = js.undefined): CopyProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "SourceProductArn" -> SourceProductArn.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "CopyOptions" -> CopyOptions.map { x => x.asInstanceOf[js.Any] },
        "SourceProvisioningArtifactIdentifiers" -> SourceProvisioningArtifactIdentifiers.map { x => x.asInstanceOf[js.Any] },
        "TargetProductId" -> TargetProductId.map { x => x.asInstanceOf[js.Any] },
        "TargetProductName" -> TargetProductName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyProductInput]
    }
  }

  @js.native
  trait CopyProductOutput extends js.Object {
    var CopyProductToken: js.UndefOr[Id]
  }

  object CopyProductOutput {
    def apply(
      CopyProductToken: js.UndefOr[Id] = js.undefined): CopyProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CopyProductToken" -> CopyProductToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyProductOutput]
    }
  }

  object CopyProductStatusEnum {
    val SUCCEEDED = "SUCCEEDED"
    val IN_PROGRESS = "IN_PROGRESS"
    val FAILED = "FAILED"

    val values = IndexedSeq(SUCCEEDED, IN_PROGRESS, FAILED)
  }

  @js.native
  trait CreateConstraintInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Parameters: ConstraintParameters
    var PortfolioId: Id
    var ProductId: Id
    var Type: ConstraintType
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ConstraintDescription]
  }

  object CreateConstraintInput {
    def apply(
      IdempotencyToken: IdempotencyToken,
      Parameters: ConstraintParameters,
      PortfolioId: Id,
      ProductId: Id,
      Type: ConstraintType,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Description: js.UndefOr[ConstraintDescription] = js.undefined): CreateConstraintInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Parameters" -> Parameters.asInstanceOf[js.Any],
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConstraintInput]
    }
  }

  @js.native
  trait CreateConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  object CreateConstraintOutput {
    def apply(
      ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined,
      ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): CreateConstraintOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConstraintDetail" -> ConstraintDetail.map { x => x.asInstanceOf[js.Any] },
        "ConstraintParameters" -> ConstraintParameters.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConstraintOutput]
    }
  }

  @js.native
  trait CreatePortfolioInput extends js.Object {
    var DisplayName: PortfolioDisplayName
    var IdempotencyToken: IdempotencyToken
    var ProviderName: ProviderName
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[PortfolioDescription]
    var Tags: js.UndefOr[AddTags]
  }

  object CreatePortfolioInput {
    def apply(
      DisplayName: PortfolioDisplayName,
      IdempotencyToken: IdempotencyToken,
      ProviderName: ProviderName,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Description: js.UndefOr[PortfolioDescription] = js.undefined,
      Tags: js.UndefOr[AddTags] = js.undefined): CreatePortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DisplayName" -> DisplayName.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "ProviderName" -> ProviderName.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePortfolioInput]
    }
  }

  @js.native
  trait CreatePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var Tags: js.UndefOr[Tags]
  }

  object CreatePortfolioOutput {
    def apply(
      PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): CreatePortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioDetail" -> PortfolioDetail.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePortfolioOutput]
    }
  }

  @js.native
  trait CreatePortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccountId: js.UndefOr[AccountId]
    var OrganizationNode: js.UndefOr[OrganizationNode]
  }

  object CreatePortfolioShareInput {
    def apply(
      PortfolioId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined): CreatePortfolioShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "OrganizationNode" -> OrganizationNode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePortfolioShareInput]
    }
  }

  @js.native
  trait CreatePortfolioShareOutput extends js.Object {
    var PortfolioShareToken: js.UndefOr[PortfolioShareToken]
  }

  object CreatePortfolioShareOutput {
    def apply(
      PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined): CreatePortfolioShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioShareToken" -> PortfolioShareToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePortfolioShareOutput]
    }
  }

  @js.native
  trait CreateProductInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Name: ProductViewName
    var Owner: ProductViewOwner
    var ProductType: ProductType
    var ProvisioningArtifactParameters: ProvisioningArtifactProperties
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ProductViewShortDescription]
    var Distributor: js.UndefOr[ProductViewOwner]
    var SupportDescription: js.UndefOr[SupportDescription]
    var SupportEmail: js.UndefOr[SupportEmail]
    var SupportUrl: js.UndefOr[SupportUrl]
    var Tags: js.UndefOr[AddTags]
  }

  object CreateProductInput {
    def apply(
      IdempotencyToken: IdempotencyToken,
      Name: ProductViewName,
      Owner: ProductViewOwner,
      ProductType: ProductType,
      ProvisioningArtifactParameters: ProvisioningArtifactProperties,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Description: js.UndefOr[ProductViewShortDescription] = js.undefined,
      Distributor: js.UndefOr[ProductViewOwner] = js.undefined,
      SupportDescription: js.UndefOr[SupportDescription] = js.undefined,
      SupportEmail: js.UndefOr[SupportEmail] = js.undefined,
      SupportUrl: js.UndefOr[SupportUrl] = js.undefined,
      Tags: js.UndefOr[AddTags] = js.undefined): CreateProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Owner" -> Owner.asInstanceOf[js.Any],
        "ProductType" -> ProductType.asInstanceOf[js.Any],
        "ProvisioningArtifactParameters" -> ProvisioningArtifactParameters.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Distributor" -> Distributor.map { x => x.asInstanceOf[js.Any] },
        "SupportDescription" -> SupportDescription.map { x => x.asInstanceOf[js.Any] },
        "SupportEmail" -> SupportEmail.map { x => x.asInstanceOf[js.Any] },
        "SupportUrl" -> SupportUrl.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProductInput]
    }
  }

  @js.native
  trait CreateProductOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Tags: js.UndefOr[Tags]
  }

  object CreateProductOutput {
    def apply(
      ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined,
      ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): CreateProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductViewDetail" -> ProductViewDetail.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactDetail" -> ProvisioningArtifactDetail.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProductOutput]
    }
  }

  @js.native
  trait CreateProvisionedProductPlanInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var PlanName: ProvisionedProductPlanName
    var PlanType: ProvisionedProductPlanType
    var ProductId: Id
    var ProvisionedProductName: ProvisionedProductName
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var NotificationArns: js.UndefOr[NotificationArns]
    var PathId: js.UndefOr[Id]
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters]
    var Tags: js.UndefOr[Tags]
  }

  object CreateProvisionedProductPlanInput {
    def apply(
      IdempotencyToken: IdempotencyToken,
      PlanName: ProvisionedProductPlanName,
      PlanType: ProvisionedProductPlanType,
      ProductId: Id,
      ProvisionedProductName: ProvisionedProductName,
      ProvisioningArtifactId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      NotificationArns: js.UndefOr[NotificationArns] = js.undefined,
      PathId: js.UndefOr[Id] = js.undefined,
      ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): CreateProvisionedProductPlanInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "PlanName" -> PlanName.asInstanceOf[js.Any],
        "PlanType" -> PlanType.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisionedProductName" -> ProvisionedProductName.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "NotificationArns" -> NotificationArns.map { x => x.asInstanceOf[js.Any] },
        "PathId" -> PathId.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningParameters" -> ProvisioningParameters.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProvisionedProductPlanInput]
    }
  }

  @js.native
  trait CreateProvisionedProductPlanOutput extends js.Object {
    var PlanId: js.UndefOr[Id]
    var PlanName: js.UndefOr[ProvisionedProductPlanName]
    var ProvisionProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductName]
    var ProvisioningArtifactId: js.UndefOr[Id]
  }

  object CreateProvisionedProductPlanOutput {
    def apply(
      PlanId: js.UndefOr[Id] = js.undefined,
      PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined,
      ProvisionProductId: js.UndefOr[Id] = js.undefined,
      ProvisionedProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
      ProvisioningArtifactId: js.UndefOr[Id] = js.undefined): CreateProvisionedProductPlanOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlanId" -> PlanId.map { x => x.asInstanceOf[js.Any] },
        "PlanName" -> PlanName.map { x => x.asInstanceOf[js.Any] },
        "ProvisionProductId" -> ProvisionProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductName" -> ProvisionedProductName.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactId" -> ProvisioningArtifactId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait CreateProvisioningArtifactInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Parameters: ProvisioningArtifactProperties
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object CreateProvisioningArtifactInput {
    def apply(
      IdempotencyToken: IdempotencyToken,
      Parameters: ProvisioningArtifactProperties,
      ProductId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): CreateProvisioningArtifactInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Parameters" -> Parameters.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProvisioningArtifactInput]
    }
  }

  @js.native
  trait CreateProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  object CreateProvisioningArtifactOutput {
    def apply(
      Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined,
      ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): CreateProvisioningArtifactOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Info" -> Info.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactDetail" -> ProvisioningArtifactDetail.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProvisioningArtifactOutput]
    }
  }

  @js.native
  trait CreateServiceActionInput extends js.Object {
    var Definition: ServiceActionDefinitionMap
    var DefinitionType: ServiceActionDefinitionType
    var IdempotencyToken: IdempotencyToken
    var Name: ServiceActionName
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ServiceActionDescription]
  }

  object CreateServiceActionInput {
    def apply(
      Definition: ServiceActionDefinitionMap,
      DefinitionType: ServiceActionDefinitionType,
      IdempotencyToken: IdempotencyToken,
      Name: ServiceActionName,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Description: js.UndefOr[ServiceActionDescription] = js.undefined): CreateServiceActionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Definition" -> Definition.asInstanceOf[js.Any],
        "DefinitionType" -> DefinitionType.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceActionInput]
    }
  }

  @js.native
  trait CreateServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  object CreateServiceActionOutput {
    def apply(
      ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined): CreateServiceActionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceActionDetail" -> ServiceActionDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceActionOutput]
    }
  }

  @js.native
  trait CreateTagOptionInput extends js.Object {
    var Key: TagOptionKey
    var Value: TagOptionValue
  }

  object CreateTagOptionInput {
    def apply(
      Key: TagOptionKey,
      Value: TagOptionValue): CreateTagOptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagOptionInput]
    }
  }

  @js.native
  trait CreateTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  object CreateTagOptionOutput {
    def apply(
      TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined): CreateTagOptionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagOptionDetail" -> TagOptionDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagOptionOutput]
    }
  }

  @js.native
  trait DeleteConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteConstraintInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DeleteConstraintInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConstraintInput]
    }
  }

  @js.native
  trait DeleteConstraintOutput extends js.Object {

  }

  object DeleteConstraintOutput {
    def apply(): DeleteConstraintOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConstraintOutput]
    }
  }

  @js.native
  trait DeletePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeletePortfolioInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DeletePortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePortfolioInput]
    }
  }

  @js.native
  trait DeletePortfolioOutput extends js.Object {

  }

  object DeletePortfolioOutput {
    def apply(): DeletePortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePortfolioOutput]
    }
  }

  @js.native
  trait DeletePortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccountId: js.UndefOr[AccountId]
    var OrganizationNode: js.UndefOr[OrganizationNode]
  }

  object DeletePortfolioShareInput {
    def apply(
      PortfolioId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      AccountId: js.UndefOr[AccountId] = js.undefined,
      OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined): DeletePortfolioShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "OrganizationNode" -> OrganizationNode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePortfolioShareInput]
    }
  }

  @js.native
  trait DeletePortfolioShareOutput extends js.Object {
    var PortfolioShareToken: js.UndefOr[PortfolioShareToken]
  }

  object DeletePortfolioShareOutput {
    def apply(
      PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined): DeletePortfolioShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioShareToken" -> PortfolioShareToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePortfolioShareOutput]
    }
  }

  @js.native
  trait DeleteProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteProductInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DeleteProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProductInput]
    }
  }

  @js.native
  trait DeleteProductOutput extends js.Object {

  }

  object DeleteProductOutput {
    def apply(): DeleteProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProductOutput]
    }
  }

  @js.native
  trait DeleteProvisionedProductPlanInput extends js.Object {
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var IgnoreErrors: js.UndefOr[IgnoreErrors]
  }

  object DeleteProvisionedProductPlanInput {
    def apply(
      PlanId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined): DeleteProvisionedProductPlanInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlanId" -> PlanId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "IgnoreErrors" -> IgnoreErrors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProvisionedProductPlanInput]
    }
  }

  @js.native
  trait DeleteProvisionedProductPlanOutput extends js.Object {

  }

  object DeleteProvisionedProductPlanOutput {
    def apply(): DeleteProvisionedProductPlanOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait DeleteProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteProvisioningArtifactInput {
    def apply(
      ProductId: Id,
      ProvisioningArtifactId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DeleteProvisioningArtifactInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProvisioningArtifactInput]
    }
  }

  @js.native
  trait DeleteProvisioningArtifactOutput extends js.Object {

  }

  object DeleteProvisioningArtifactOutput {
    def apply(): DeleteProvisioningArtifactOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProvisioningArtifactOutput]
    }
  }

  @js.native
  trait DeleteServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteServiceActionInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DeleteServiceActionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceActionInput]
    }
  }

  @js.native
  trait DeleteServiceActionOutput extends js.Object {

  }

  object DeleteServiceActionOutput {
    def apply(): DeleteServiceActionOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceActionOutput]
    }
  }

  @js.native
  trait DeleteTagOptionInput extends js.Object {
    var Id: TagOptionId
  }

  object DeleteTagOptionInput {
    def apply(
      Id: TagOptionId): DeleteTagOptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagOptionInput]
    }
  }

  @js.native
  trait DeleteTagOptionOutput extends js.Object {

  }

  object DeleteTagOptionOutput {
    def apply(): DeleteTagOptionOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagOptionOutput]
    }
  }

  @js.native
  trait DescribeConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeConstraintInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DescribeConstraintInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConstraintInput]
    }
  }

  @js.native
  trait DescribeConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  object DescribeConstraintOutput {
    def apply(
      ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined,
      ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): DescribeConstraintOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConstraintDetail" -> ConstraintDetail.map { x => x.asInstanceOf[js.Any] },
        "ConstraintParameters" -> ConstraintParameters.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConstraintOutput]
    }
  }

  @js.native
  trait DescribeCopyProductStatusInput extends js.Object {
    var CopyProductToken: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeCopyProductStatusInput {
    def apply(
      CopyProductToken: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DescribeCopyProductStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CopyProductToken" -> CopyProductToken.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCopyProductStatusInput]
    }
  }

  @js.native
  trait DescribeCopyProductStatusOutput extends js.Object {
    var CopyProductStatus: js.UndefOr[CopyProductStatus]
    var StatusDetail: js.UndefOr[StatusDetail]
    var TargetProductId: js.UndefOr[Id]
  }

  object DescribeCopyProductStatusOutput {
    def apply(
      CopyProductStatus: js.UndefOr[CopyProductStatus] = js.undefined,
      StatusDetail: js.UndefOr[StatusDetail] = js.undefined,
      TargetProductId: js.UndefOr[Id] = js.undefined): DescribeCopyProductStatusOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CopyProductStatus" -> CopyProductStatus.map { x => x.asInstanceOf[js.Any] },
        "StatusDetail" -> StatusDetail.map { x => x.asInstanceOf[js.Any] },
        "TargetProductId" -> TargetProductId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCopyProductStatusOutput]
    }
  }

  @js.native
  trait DescribePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribePortfolioInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DescribePortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePortfolioInput]
    }
  }

  @js.native
  trait DescribePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var TagOptions: js.UndefOr[TagOptionDetails]
    var Tags: js.UndefOr[Tags]
  }

  object DescribePortfolioOutput {
    def apply(
      PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined,
      TagOptions: js.UndefOr[TagOptionDetails] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): DescribePortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioDetail" -> PortfolioDetail.map { x => x.asInstanceOf[js.Any] },
        "TagOptions" -> TagOptions.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePortfolioOutput]
    }
  }

  @js.native
  trait DescribePortfolioShareStatusInput extends js.Object {
    var PortfolioShareToken: PortfolioShareToken
  }

  object DescribePortfolioShareStatusInput {
    def apply(
      PortfolioShareToken: PortfolioShareToken): DescribePortfolioShareStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioShareToken" -> PortfolioShareToken.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePortfolioShareStatusInput]
    }
  }

  @js.native
  trait DescribePortfolioShareStatusOutput extends js.Object {
    var OrganizationNodeValue: js.UndefOr[OrganizationNodeValue]
    var PortfolioId: js.UndefOr[Id]
    var PortfolioShareToken: js.UndefOr[PortfolioShareToken]
    var ShareDetails: js.UndefOr[ShareDetails]
    var Status: js.UndefOr[ShareStatus]
  }

  object DescribePortfolioShareStatusOutput {
    def apply(
      OrganizationNodeValue: js.UndefOr[OrganizationNodeValue] = js.undefined,
      PortfolioId: js.UndefOr[Id] = js.undefined,
      PortfolioShareToken: js.UndefOr[PortfolioShareToken] = js.undefined,
      ShareDetails: js.UndefOr[ShareDetails] = js.undefined,
      Status: js.UndefOr[ShareStatus] = js.undefined): DescribePortfolioShareStatusOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationNodeValue" -> OrganizationNodeValue.map { x => x.asInstanceOf[js.Any] },
        "PortfolioId" -> PortfolioId.map { x => x.asInstanceOf[js.Any] },
        "PortfolioShareToken" -> PortfolioShareToken.map { x => x.asInstanceOf[js.Any] },
        "ShareDetails" -> ShareDetails.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePortfolioShareStatusOutput]
    }
  }

  @js.native
  trait DescribeProductAsAdminInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeProductAsAdminInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DescribeProductAsAdminInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProductAsAdminInput]
    }
  }

  @js.native
  trait DescribeProductAsAdminOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var ProvisioningArtifactSummaries: js.UndefOr[ProvisioningArtifactSummaries]
    var TagOptions: js.UndefOr[TagOptionDetails]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeProductAsAdminOutput {
    def apply(
      ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined,
      ProvisioningArtifactSummaries: js.UndefOr[ProvisioningArtifactSummaries] = js.undefined,
      TagOptions: js.UndefOr[TagOptionDetails] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): DescribeProductAsAdminOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductViewDetail" -> ProductViewDetail.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactSummaries" -> ProvisioningArtifactSummaries.map { x => x.asInstanceOf[js.Any] },
        "TagOptions" -> TagOptions.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProductAsAdminOutput]
    }
  }

  @js.native
  trait DescribeProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeProductInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DescribeProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProductInput]
    }
  }

  @js.native
  trait DescribeProductOutput extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts]
  }

  object DescribeProductOutput {
    def apply(
      ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
      ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts] = js.undefined): DescribeProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductViewSummary" -> ProductViewSummary.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifacts" -> ProvisioningArtifacts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProductOutput]
    }
  }

  @js.native
  trait DescribeProductViewInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeProductViewInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DescribeProductViewInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProductViewInput]
    }
  }

  @js.native
  trait DescribeProductViewOutput extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts]
  }

  object DescribeProductViewOutput {
    def apply(
      ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
      ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts] = js.undefined): DescribeProductViewOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductViewSummary" -> ProductViewSummary.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifacts" -> ProvisioningArtifacts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProductViewOutput]
    }
  }

  @js.native
  trait DescribeProvisionedProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeProvisionedProductInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DescribeProvisionedProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProvisionedProductInput]
    }
  }

  @js.native
  trait DescribeProvisionedProductOutput extends js.Object {
    var CloudWatchDashboards: js.UndefOr[CloudWatchDashboards]
    var ProvisionedProductDetail: js.UndefOr[ProvisionedProductDetail]
  }

  object DescribeProvisionedProductOutput {
    def apply(
      CloudWatchDashboards: js.UndefOr[CloudWatchDashboards] = js.undefined,
      ProvisionedProductDetail: js.UndefOr[ProvisionedProductDetail] = js.undefined): DescribeProvisionedProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchDashboards" -> CloudWatchDashboards.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductDetail" -> ProvisionedProductDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProvisionedProductOutput]
    }
  }

  @js.native
  trait DescribeProvisionedProductPlanInput extends js.Object {
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object DescribeProvisionedProductPlanInput {
    def apply(
      PlanId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): DescribeProvisionedProductPlanInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlanId" -> PlanId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProvisionedProductPlanInput]
    }
  }

  @js.native
  trait DescribeProvisionedProductPlanOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProductPlanDetails: js.UndefOr[ProvisionedProductPlanDetails]
    var ResourceChanges: js.UndefOr[ResourceChanges]
  }

  object DescribeProvisionedProductPlanOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ProvisionedProductPlanDetails: js.UndefOr[ProvisionedProductPlanDetails] = js.undefined,
      ResourceChanges: js.UndefOr[ResourceChanges] = js.undefined): DescribeProvisionedProductPlanOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductPlanDetails" -> ProvisionedProductPlanDetails.map { x => x.asInstanceOf[js.Any] },
        "ResourceChanges" -> ResourceChanges.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait DescribeProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Verbose: js.UndefOr[Verbose]
  }

  object DescribeProvisioningArtifactInput {
    def apply(
      ProductId: Id,
      ProvisioningArtifactId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Verbose: js.UndefOr[Verbose] = js.undefined): DescribeProvisioningArtifactInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Verbose" -> Verbose.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProvisioningArtifactInput]
    }
  }

  @js.native
  trait DescribeProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  object DescribeProvisioningArtifactOutput {
    def apply(
      Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined,
      ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): DescribeProvisioningArtifactOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Info" -> Info.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactDetail" -> ProvisioningArtifactDetail.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProvisioningArtifactOutput]
    }
  }

  @js.native
  trait DescribeProvisioningParametersInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PathId: js.UndefOr[Id]
  }

  object DescribeProvisioningParametersInput {
    def apply(
      ProductId: Id,
      ProvisioningArtifactId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PathId: js.UndefOr[Id] = js.undefined): DescribeProvisioningParametersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PathId" -> PathId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProvisioningParametersInput]
    }
  }

  @js.native
  trait DescribeProvisioningParametersOutput extends js.Object {
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries]
    var ProvisioningArtifactParameters: js.UndefOr[ProvisioningArtifactParameters]
    var ProvisioningArtifactPreferences: js.UndefOr[ProvisioningArtifactPreferences]
    var TagOptions: js.UndefOr[TagOptionSummaries]
    var UsageInstructions: js.UndefOr[UsageInstructions]
  }

  object DescribeProvisioningParametersOutput {
    def apply(
      ConstraintSummaries: js.UndefOr[ConstraintSummaries] = js.undefined,
      ProvisioningArtifactParameters: js.UndefOr[ProvisioningArtifactParameters] = js.undefined,
      ProvisioningArtifactPreferences: js.UndefOr[ProvisioningArtifactPreferences] = js.undefined,
      TagOptions: js.UndefOr[TagOptionSummaries] = js.undefined,
      UsageInstructions: js.UndefOr[UsageInstructions] = js.undefined): DescribeProvisioningParametersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConstraintSummaries" -> ConstraintSummaries.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactParameters" -> ProvisioningArtifactParameters.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactPreferences" -> ProvisioningArtifactPreferences.map { x => x.asInstanceOf[js.Any] },
        "TagOptions" -> TagOptions.map { x => x.asInstanceOf[js.Any] },
        "UsageInstructions" -> UsageInstructions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeProvisioningParametersOutput]
    }
  }

  @js.native
  trait DescribeRecordInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object DescribeRecordInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): DescribeRecordInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRecordInput]
    }
  }

  @js.native
  trait DescribeRecordOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var RecordDetail: js.UndefOr[RecordDetail]
    var RecordOutputs: js.UndefOr[RecordOutputs]
  }

  object DescribeRecordOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      RecordDetail: js.UndefOr[RecordDetail] = js.undefined,
      RecordOutputs: js.UndefOr[RecordOutputs] = js.undefined): DescribeRecordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "RecordDetail" -> RecordDetail.map { x => x.asInstanceOf[js.Any] },
        "RecordOutputs" -> RecordOutputs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRecordOutput]
    }
  }

  @js.native
  trait DescribeServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeServiceActionInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DescribeServiceActionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServiceActionInput]
    }
  }

  @js.native
  trait DescribeServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  object DescribeServiceActionOutput {
    def apply(
      ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined): DescribeServiceActionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceActionDetail" -> ServiceActionDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServiceActionOutput]
    }
  }

  @js.native
  trait DescribeTagOptionInput extends js.Object {
    var Id: TagOptionId
  }

  object DescribeTagOptionInput {
    def apply(
      Id: TagOptionId): DescribeTagOptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagOptionInput]
    }
  }

  @js.native
  trait DescribeTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  object DescribeTagOptionOutput {
    def apply(
      TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined): DescribeTagOptionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagOptionDetail" -> TagOptionDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagOptionOutput]
    }
  }

  @js.native
  trait DisableAWSOrganizationsAccessInput extends js.Object {

  }

  object DisableAWSOrganizationsAccessInput {
    def apply(): DisableAWSOrganizationsAccessInput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableAWSOrganizationsAccessInput]
    }
  }

  @js.native
  trait DisableAWSOrganizationsAccessOutput extends js.Object {

  }

  object DisableAWSOrganizationsAccessOutput {
    def apply(): DisableAWSOrganizationsAccessOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableAWSOrganizationsAccessOutput]
    }
  }

  @js.native
  trait DisassociatePrincipalFromPortfolioInput extends js.Object {
    var PortfolioId: Id
    var PrincipalARN: PrincipalARN
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DisassociatePrincipalFromPortfolioInput {
    def apply(
      PortfolioId: Id,
      PrincipalARN: PrincipalARN,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DisassociatePrincipalFromPortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "PrincipalARN" -> PrincipalARN.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociatePrincipalFromPortfolioInput]
    }
  }

  @js.native
  trait DisassociatePrincipalFromPortfolioOutput extends js.Object {

  }

  object DisassociatePrincipalFromPortfolioOutput {
    def apply(): DisassociatePrincipalFromPortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociatePrincipalFromPortfolioOutput]
    }
  }

  @js.native
  trait DisassociateProductFromPortfolioInput extends js.Object {
    var PortfolioId: Id
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DisassociateProductFromPortfolioInput {
    def apply(
      PortfolioId: Id,
      ProductId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DisassociateProductFromPortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateProductFromPortfolioInput]
    }
  }

  @js.native
  trait DisassociateProductFromPortfolioOutput extends js.Object {

  }

  object DisassociateProductFromPortfolioOutput {
    def apply(): DisassociateProductFromPortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateProductFromPortfolioOutput]
    }
  }

  @js.native
  trait DisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DisassociateServiceActionFromProvisioningArtifactInput {
    def apply(
      ProductId: Id,
      ProvisioningArtifactId: Id,
      ServiceActionId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): DisassociateServiceActionFromProvisioningArtifactInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateServiceActionFromProvisioningArtifactInput]
    }
  }

  @js.native
  trait DisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {

  }

  object DisassociateServiceActionFromProvisioningArtifactOutput {
    def apply(): DisassociateServiceActionFromProvisioningArtifactOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateServiceActionFromProvisioningArtifactOutput]
    }
  }

  @js.native
  trait DisassociateTagOptionFromResourceInput extends js.Object {
    var ResourceId: ResourceId
    var TagOptionId: TagOptionId
  }

  object DisassociateTagOptionFromResourceInput {
    def apply(
      ResourceId: ResourceId,
      TagOptionId: TagOptionId): DisassociateTagOptionFromResourceInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagOptionId" -> TagOptionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateTagOptionFromResourceInput]
    }
  }

  @js.native
  trait DisassociateTagOptionFromResourceOutput extends js.Object {

  }

  object DisassociateTagOptionFromResourceOutput {
    def apply(): DisassociateTagOptionFromResourceOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateTagOptionFromResourceOutput]
    }
  }

  @js.native
  trait EnableAWSOrganizationsAccessInput extends js.Object {

  }

  object EnableAWSOrganizationsAccessInput {
    def apply(): EnableAWSOrganizationsAccessInput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAWSOrganizationsAccessInput]
    }
  }

  @js.native
  trait EnableAWSOrganizationsAccessOutput extends js.Object {

  }

  object EnableAWSOrganizationsAccessOutput {
    def apply(): EnableAWSOrganizationsAccessOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableAWSOrganizationsAccessOutput]
    }
  }

  object EvaluationTypeEnum {
    val STATIC = "STATIC"
    val DYNAMIC = "DYNAMIC"

    val values = IndexedSeq(STATIC, DYNAMIC)
  }

  @js.native
  trait ExecuteProvisionedProductPlanInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ExecuteProvisionedProductPlanInput {
    def apply(
      IdempotencyToken: IdempotencyToken,
      PlanId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): ExecuteProvisionedProductPlanInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "PlanId" -> PlanId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecuteProvisionedProductPlanInput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductPlanOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ExecuteProvisionedProductPlanOutput {
    def apply(
      RecordDetail: js.UndefOr[RecordDetail] = js.undefined): ExecuteProvisionedProductPlanOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordDetail" -> RecordDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecuteProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductServiceActionInput extends js.Object {
    var ExecuteToken: IdempotencyToken
    var ProvisionedProductId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ExecuteProvisionedProductServiceActionInput {
    def apply(
      ExecuteToken: IdempotencyToken,
      ProvisionedProductId: Id,
      ServiceActionId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): ExecuteProvisionedProductServiceActionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExecuteToken" -> ExecuteToken.asInstanceOf[js.Any],
        "ProvisionedProductId" -> ProvisionedProductId.asInstanceOf[js.Any],
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecuteProvisionedProductServiceActionInput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductServiceActionOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ExecuteProvisionedProductServiceActionOutput {
    def apply(
      RecordDetail: js.UndefOr[RecordDetail] = js.undefined): ExecuteProvisionedProductServiceActionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordDetail" -> RecordDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecuteProvisionedProductServiceActionOutput]
    }
  }

  /**
   * <p>An object containing information about the error, along with identifying information about the self-service action and its associations.</p>
   */
  @js.native
  trait FailedServiceActionAssociation extends js.Object {
    var ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode]
    var ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage]
    var ProductId: js.UndefOr[Id]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ServiceActionId: js.UndefOr[Id]
  }

  object FailedServiceActionAssociation {
    def apply(
      ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage] = js.undefined,
      ProductId: js.UndefOr[Id] = js.undefined,
      ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
      ServiceActionId: js.UndefOr[Id] = js.undefined): FailedServiceActionAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactId" -> ProvisioningArtifactId.map { x => x.asInstanceOf[js.Any] },
        "ServiceActionId" -> ServiceActionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailedServiceActionAssociation]
    }
  }

  @js.native
  trait GetAWSOrganizationsAccessStatusInput extends js.Object {

  }

  object GetAWSOrganizationsAccessStatusInput {
    def apply(): GetAWSOrganizationsAccessStatusInput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAWSOrganizationsAccessStatusInput]
    }
  }

  @js.native
  trait GetAWSOrganizationsAccessStatusOutput extends js.Object {
    var AccessStatus: js.UndefOr[AccessStatus]
  }

  object GetAWSOrganizationsAccessStatusOutput {
    def apply(
      AccessStatus: js.UndefOr[AccessStatus] = js.undefined): GetAWSOrganizationsAccessStatusOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessStatus" -> AccessStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAWSOrganizationsAccessStatusOutput]
    }
  }

  /**
   * <p>Summary information about a product path for a user.</p>
   */
  @js.native
  trait LaunchPathSummary extends js.Object {
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[PortfolioName]
    var Tags: js.UndefOr[Tags]
  }

  object LaunchPathSummary {
    def apply(
      ConstraintSummaries: js.UndefOr[ConstraintSummaries] = js.undefined,
      Id: js.UndefOr[Id] = js.undefined,
      Name: js.UndefOr[PortfolioName] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): LaunchPathSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConstraintSummaries" -> ConstraintSummaries.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchPathSummary]
    }
  }

  @js.native
  trait ListAcceptedPortfolioSharesInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  object ListAcceptedPortfolioSharesInput {
    def apply(
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined,
      PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined): ListAcceptedPortfolioSharesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "PortfolioShareType" -> PortfolioShareType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAcceptedPortfolioSharesInput]
    }
  }

  @js.native
  trait ListAcceptedPortfolioSharesOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  object ListAcceptedPortfolioSharesOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined): ListAcceptedPortfolioSharesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "PortfolioDetails" -> PortfolioDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAcceptedPortfolioSharesOutput]
    }
  }

  @js.native
  trait ListConstraintsForPortfolioInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ProductId: js.UndefOr[Id]
  }

  object ListConstraintsForPortfolioInput {
    def apply(
      PortfolioId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined,
      ProductId: js.UndefOr[Id] = js.undefined): ListConstraintsForPortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConstraintsForPortfolioInput]
    }
  }

  @js.native
  trait ListConstraintsForPortfolioOutput extends js.Object {
    var ConstraintDetails: js.UndefOr[ConstraintDetails]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListConstraintsForPortfolioOutput {
    def apply(
      ConstraintDetails: js.UndefOr[ConstraintDetails] = js.undefined,
      NextPageToken: js.UndefOr[PageToken] = js.undefined): ListConstraintsForPortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConstraintDetails" -> ConstraintDetails.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConstraintsForPortfolioOutput]
    }
  }

  @js.native
  trait ListLaunchPathsInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListLaunchPathsInput {
    def apply(
      ProductId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ListLaunchPathsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLaunchPathsInput]
    }
  }

  @js.native
  trait ListLaunchPathsOutput extends js.Object {
    var LaunchPathSummaries: js.UndefOr[LaunchPathSummaries]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListLaunchPathsOutput {
    def apply(
      LaunchPathSummaries: js.UndefOr[LaunchPathSummaries] = js.undefined,
      NextPageToken: js.UndefOr[PageToken] = js.undefined): ListLaunchPathsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LaunchPathSummaries" -> LaunchPathSummaries.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLaunchPathsOutput]
    }
  }

  @js.native
  trait ListOrganizationPortfolioAccessInput extends js.Object {
    var OrganizationNodeType: OrganizationNodeType
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListOrganizationPortfolioAccessInput {
    def apply(
      OrganizationNodeType: OrganizationNodeType,
      PortfolioId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ListOrganizationPortfolioAccessInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OrganizationNodeType" -> OrganizationNodeType.asInstanceOf[js.Any],
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationPortfolioAccessInput]
    }
  }

  @js.native
  trait ListOrganizationPortfolioAccessOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var OrganizationNodes: js.UndefOr[OrganizationNodes]
  }

  object ListOrganizationPortfolioAccessOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      OrganizationNodes: js.UndefOr[OrganizationNodes] = js.undefined): ListOrganizationPortfolioAccessOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "OrganizationNodes" -> OrganizationNodes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOrganizationPortfolioAccessOutput]
    }
  }

  @js.native
  trait ListPortfolioAccessInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ListPortfolioAccessInput {
    def apply(
      PortfolioId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): ListPortfolioAccessInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPortfolioAccessInput]
    }
  }

  @js.native
  trait ListPortfolioAccessOutput extends js.Object {
    var AccountIds: js.UndefOr[AccountIds]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListPortfolioAccessOutput {
    def apply(
      AccountIds: js.UndefOr[AccountIds] = js.undefined,
      NextPageToken: js.UndefOr[PageToken] = js.undefined): ListPortfolioAccessOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountIds" -> AccountIds.map { x => x.asInstanceOf[js.Any] },
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPortfolioAccessOutput]
    }
  }

  @js.native
  trait ListPortfoliosForProductInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListPortfoliosForProductInput {
    def apply(
      ProductId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ListPortfoliosForProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPortfoliosForProductInput]
    }
  }

  @js.native
  trait ListPortfoliosForProductOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  object ListPortfoliosForProductOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined): ListPortfoliosForProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "PortfolioDetails" -> PortfolioDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPortfoliosForProductOutput]
    }
  }

  @js.native
  trait ListPortfoliosInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListPortfoliosInput {
    def apply(
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ListPortfoliosInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPortfoliosInput]
    }
  }

  @js.native
  trait ListPortfoliosOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  object ListPortfoliosOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined): ListPortfoliosOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "PortfolioDetails" -> PortfolioDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPortfoliosOutput]
    }
  }

  @js.native
  trait ListPrincipalsForPortfolioInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListPrincipalsForPortfolioInput {
    def apply(
      PortfolioId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ListPrincipalsForPortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalsForPortfolioInput]
    }
  }

  @js.native
  trait ListPrincipalsForPortfolioOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var Principals: js.UndefOr[Principals]
  }

  object ListPrincipalsForPortfolioOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      Principals: js.UndefOr[Principals] = js.undefined): ListPrincipalsForPortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "Principals" -> Principals.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPrincipalsForPortfolioOutput]
    }
  }

  @js.native
  trait ListProvisionedProductPlansInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ProvisionProductId: js.UndefOr[Id]
  }

  object ListProvisionedProductPlansInput {
    def apply(
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined,
      ProvisionProductId: js.UndefOr[Id] = js.undefined): ListProvisionedProductPlansInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "AccessLevelFilter" -> AccessLevelFilter.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "ProvisionProductId" -> ProvisionProductId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisionedProductPlansInput]
    }
  }

  @js.native
  trait ListProvisionedProductPlansOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProductPlans: js.UndefOr[ProvisionedProductPlans]
  }

  object ListProvisionedProductPlansOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ProvisionedProductPlans: js.UndefOr[ProvisionedProductPlans] = js.undefined): ListProvisionedProductPlansOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductPlans" -> ProvisionedProductPlans.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisionedProductPlansOutput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsForServiceActionInput extends js.Object {
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListProvisioningArtifactsForServiceActionInput {
    def apply(
      ServiceActionId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ListProvisioningArtifactsForServiceActionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisioningArtifactsForServiceActionInput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsForServiceActionOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisioningArtifactViews: js.UndefOr[ProvisioningArtifactViews]
  }

  object ListProvisioningArtifactsForServiceActionOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ProvisioningArtifactViews: js.UndefOr[ProvisioningArtifactViews] = js.undefined): ListProvisioningArtifactsForServiceActionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactViews" -> ProvisioningArtifactViews.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisioningArtifactsForServiceActionOutput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ListProvisioningArtifactsInput {
    def apply(
      ProductId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined): ListProvisioningArtifactsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisioningArtifactsInput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisioningArtifactDetails: js.UndefOr[ProvisioningArtifactDetails]
  }

  object ListProvisioningArtifactsOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ProvisioningArtifactDetails: js.UndefOr[ProvisioningArtifactDetails] = js.undefined): ListProvisioningArtifactsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactDetails" -> ProvisioningArtifactDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProvisioningArtifactsOutput]
    }
  }

  @js.native
  trait ListRecordHistoryInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var SearchFilter: js.UndefOr[ListRecordHistorySearchFilter]
  }

  object ListRecordHistoryInput {
    def apply(
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined,
      SearchFilter: js.UndefOr[ListRecordHistorySearchFilter] = js.undefined): ListRecordHistoryInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "AccessLevelFilter" -> AccessLevelFilter.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "SearchFilter" -> SearchFilter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRecordHistoryInput]
    }
  }

  @js.native
  trait ListRecordHistoryOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var RecordDetails: js.UndefOr[RecordDetails]
  }

  object ListRecordHistoryOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      RecordDetails: js.UndefOr[RecordDetails] = js.undefined): ListRecordHistoryOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "RecordDetails" -> RecordDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRecordHistoryOutput]
    }
  }

  /**
   * <p>The search filter to use when listing history records.</p>
   */
  @js.native
  trait ListRecordHistorySearchFilter extends js.Object {
    var Key: js.UndefOr[SearchFilterKey]
    var Value: js.UndefOr[SearchFilterValue]
  }

  object ListRecordHistorySearchFilter {
    def apply(
      Key: js.UndefOr[SearchFilterKey] = js.undefined,
      Value: js.UndefOr[SearchFilterValue] = js.undefined): ListRecordHistorySearchFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRecordHistorySearchFilter]
    }
  }

  @js.native
  trait ListResourcesForTagOptionInput extends js.Object {
    var TagOptionId: TagOptionId
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ListResourcesForTagOptionInput {
    def apply(
      TagOptionId: TagOptionId,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined): ListResourcesForTagOptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagOptionId" -> TagOptionId.asInstanceOf[js.Any],
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesForTagOptionInput]
    }
  }

  @js.native
  trait ListResourcesForTagOptionOutput extends js.Object {
    var PageToken: js.UndefOr[PageToken]
    var ResourceDetails: js.UndefOr[ResourceDetails]
  }

  object ListResourcesForTagOptionOutput {
    def apply(
      PageToken: js.UndefOr[PageToken] = js.undefined,
      ResourceDetails: js.UndefOr[ResourceDetails] = js.undefined): ListResourcesForTagOptionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceDetails" -> ResourceDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourcesForTagOptionOutput]
    }
  }

  @js.native
  trait ListServiceActionsForProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListServiceActionsForProvisioningArtifactInput {
    def apply(
      ProductId: Id,
      ProvisioningArtifactId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ListServiceActionsForProvisioningArtifactInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServiceActionsForProvisioningArtifactInput]
    }
  }

  @js.native
  trait ListServiceActionsForProvisioningArtifactOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries]
  }

  object ListServiceActionsForProvisioningArtifactOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ServiceActionSummaries: js.UndefOr[ServiceActionSummaries] = js.undefined): ListServiceActionsForProvisioningArtifactOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ServiceActionSummaries" -> ServiceActionSummaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServiceActionsForProvisioningArtifactOutput]
    }
  }

  @js.native
  trait ListServiceActionsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListServiceActionsInput {
    def apply(
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ListServiceActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServiceActionsInput]
    }
  }

  @js.native
  trait ListServiceActionsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries]
  }

  object ListServiceActionsOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ServiceActionSummaries: js.UndefOr[ServiceActionSummaries] = js.undefined): ListServiceActionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ServiceActionSummaries" -> ServiceActionSummaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServiceActionsOutput]
    }
  }

  /**
   * <p>Filters to use when listing TagOptions.</p>
   */
  @js.native
  trait ListTagOptionsFilters extends js.Object {
    var Active: js.UndefOr[TagOptionActive]
    var Key: js.UndefOr[TagOptionKey]
    var Value: js.UndefOr[TagOptionValue]
  }

  object ListTagOptionsFilters {
    def apply(
      Active: js.UndefOr[TagOptionActive] = js.undefined,
      Key: js.UndefOr[TagOptionKey] = js.undefined,
      Value: js.UndefOr[TagOptionValue] = js.undefined): ListTagOptionsFilters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Active" -> Active.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagOptionsFilters]
    }
  }

  @js.native
  trait ListTagOptionsInput extends js.Object {
    var Filters: js.UndefOr[ListTagOptionsFilters]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListTagOptionsInput {
    def apply(
      Filters: js.UndefOr[ListTagOptionsFilters] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ListTagOptionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagOptionsInput]
    }
  }

  @js.native
  trait ListTagOptionsOutput extends js.Object {
    var PageToken: js.UndefOr[PageToken]
    var TagOptionDetails: js.UndefOr[TagOptionDetails]
  }

  object ListTagOptionsOutput {
    def apply(
      PageToken: js.UndefOr[PageToken] = js.undefined,
      TagOptionDetails: js.UndefOr[TagOptionDetails] = js.undefined): ListTagOptionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "TagOptionDetails" -> TagOptionDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagOptionsOutput]
    }
  }

  /**
   * <p/>
   */
  @js.native
  trait OrganizationNode extends js.Object {
    var Type: js.UndefOr[OrganizationNodeType]
    var Value: js.UndefOr[OrganizationNodeValue]
  }

  object OrganizationNode {
    def apply(
      Type: js.UndefOr[OrganizationNodeType] = js.undefined,
      Value: js.UndefOr[OrganizationNodeValue] = js.undefined): OrganizationNode = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrganizationNode]
    }
  }

  object OrganizationNodeTypeEnum {
    val ORGANIZATION = "ORGANIZATION"
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT"
    val ACCOUNT = "ACCOUNT"

    val values = IndexedSeq(ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT)
  }

  /**
   * <p>The constraints that the administrator has put on the parameter.</p>
   */
  @js.native
  trait ParameterConstraints extends js.Object {
    var AllowedValues: js.UndefOr[AllowedValues]
  }

  object ParameterConstraints {
    def apply(
      AllowedValues: js.UndefOr[AllowedValues] = js.undefined): ParameterConstraints = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowedValues" -> AllowedValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ParameterConstraints]
    }
  }

  /**
   * <p>Information about a portfolio.</p>
   */
  @js.native
  trait PortfolioDetail extends js.Object {
    var ARN: js.UndefOr[ResourceARN]
    var CreatedTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[PortfolioDescription]
    var DisplayName: js.UndefOr[PortfolioDisplayName]
    var Id: js.UndefOr[Id]
    var ProviderName: js.UndefOr[ProviderName]
  }

  object PortfolioDetail {
    def apply(
      ARN: js.UndefOr[ResourceARN] = js.undefined,
      CreatedTime: js.UndefOr[CreationTime] = js.undefined,
      Description: js.UndefOr[PortfolioDescription] = js.undefined,
      DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined,
      Id: js.UndefOr[Id] = js.undefined,
      ProviderName: js.UndefOr[ProviderName] = js.undefined): PortfolioDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortfolioDetail]
    }
  }

  object PortfolioShareTypeEnum {
    val IMPORTED = "IMPORTED"
    val AWS_SERVICECATALOG = "AWS_SERVICECATALOG"
    val AWS_ORGANIZATIONS = "AWS_ORGANIZATIONS"

    val values = IndexedSeq(IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS)
  }

  /**
   * <p>Information about a principal.</p>
   */
  @js.native
  trait Principal extends js.Object {
    var PrincipalARN: js.UndefOr[PrincipalARN]
    var PrincipalType: js.UndefOr[PrincipalType]
  }

  object Principal {
    def apply(
      PrincipalARN: js.UndefOr[PrincipalARN] = js.undefined,
      PrincipalType: js.UndefOr[PrincipalType] = js.undefined): Principal = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrincipalARN" -> PrincipalARN.map { x => x.asInstanceOf[js.Any] },
        "PrincipalType" -> PrincipalType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Principal]
    }
  }

  object PrincipalTypeEnum {
    val IAM = "IAM"

    val values = IndexedSeq(IAM)
  }

  object ProductSourceEnum {
    val ACCOUNT = "ACCOUNT"

    val values = IndexedSeq(ACCOUNT)
  }

  object ProductTypeEnum {
    val CLOUD_FORMATION_TEMPLATE = "CLOUD_FORMATION_TEMPLATE"
    val MARKETPLACE = "MARKETPLACE"

    val values = IndexedSeq(CLOUD_FORMATION_TEMPLATE, MARKETPLACE)
  }

  /**
   * <p>A single product view aggregation value/count pair, containing metadata about each product to which the calling user has access.</p>
   */
  @js.native
  trait ProductViewAggregationValue extends js.Object {
    var ApproximateCount: js.UndefOr[ApproximateCount]
    var Value: js.UndefOr[AttributeValue]
  }

  object ProductViewAggregationValue {
    def apply(
      ApproximateCount: js.UndefOr[ApproximateCount] = js.undefined,
      Value: js.UndefOr[AttributeValue] = js.undefined): ProductViewAggregationValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApproximateCount" -> ApproximateCount.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductViewAggregationValue]
    }
  }

  /**
   * <p>Information about a product view.</p>
   */
  @js.native
  trait ProductViewDetail extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var ProductARN: js.UndefOr[ResourceARN]
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var Status: js.UndefOr[Status]
  }

  object ProductViewDetail {
    def apply(
      CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
      ProductARN: js.UndefOr[ResourceARN] = js.undefined,
      ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): ProductViewDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "ProductARN" -> ProductARN.map { x => x.asInstanceOf[js.Any] },
        "ProductViewSummary" -> ProductViewSummary.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductViewDetail]
    }
  }

  object ProductViewFilterByEnum {
    val FullTextSearch = "FullTextSearch"
    val Owner = "Owner"
    val ProductType = "ProductType"
    val SourceProductId = "SourceProductId"

    val values = IndexedSeq(FullTextSearch, Owner, ProductType, SourceProductId)
  }

  object ProductViewSortByEnum {
    val Title = "Title"
    val VersionCount = "VersionCount"
    val CreationDate = "CreationDate"

    val values = IndexedSeq(Title, VersionCount, CreationDate)
  }

  /**
   * <p>Summary information about a product view.</p>
   */
  @js.native
  trait ProductViewSummary extends js.Object {
    var Distributor: js.UndefOr[ProductViewDistributor]
    var HasDefaultPath: js.UndefOr[HasDefaultPath]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProductViewName]
    var Owner: js.UndefOr[ProductViewOwner]
    var ProductId: js.UndefOr[Id]
    var ShortDescription: js.UndefOr[ProductViewShortDescription]
    var SupportDescription: js.UndefOr[SupportDescription]
    var SupportEmail: js.UndefOr[SupportEmail]
    var SupportUrl: js.UndefOr[SupportUrl]
    var Type: js.UndefOr[ProductType]
  }

  object ProductViewSummary {
    def apply(
      Distributor: js.UndefOr[ProductViewDistributor] = js.undefined,
      HasDefaultPath: js.UndefOr[HasDefaultPath] = js.undefined,
      Id: js.UndefOr[Id] = js.undefined,
      Name: js.UndefOr[ProductViewName] = js.undefined,
      Owner: js.UndefOr[ProductViewOwner] = js.undefined,
      ProductId: js.UndefOr[Id] = js.undefined,
      ShortDescription: js.UndefOr[ProductViewShortDescription] = js.undefined,
      SupportDescription: js.UndefOr[SupportDescription] = js.undefined,
      SupportEmail: js.UndefOr[SupportEmail] = js.undefined,
      SupportUrl: js.UndefOr[SupportUrl] = js.undefined,
      Type: js.UndefOr[ProductType] = js.undefined): ProductViewSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Distributor" -> Distributor.map { x => x.asInstanceOf[js.Any] },
        "HasDefaultPath" -> HasDefaultPath.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "ShortDescription" -> ShortDescription.map { x => x.asInstanceOf[js.Any] },
        "SupportDescription" -> SupportDescription.map { x => x.asInstanceOf[js.Any] },
        "SupportEmail" -> SupportEmail.map { x => x.asInstanceOf[js.Any] },
        "SupportUrl" -> SupportUrl.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductViewSummary]
    }
  }

  @js.native
  trait ProvisionProductInput extends js.Object {
    var ProductId: Id
    var ProvisionToken: IdempotencyToken
    var ProvisionedProductName: ProvisionedProductName
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var NotificationArns: js.UndefOr[NotificationArns]
    var PathId: js.UndefOr[Id]
    var ProvisioningParameters: js.UndefOr[ProvisioningParameters]
    var ProvisioningPreferences: js.UndefOr[ProvisioningPreferences]
    var Tags: js.UndefOr[Tags]
  }

  object ProvisionProductInput {
    def apply(
      ProductId: Id,
      ProvisionToken: IdempotencyToken,
      ProvisionedProductName: ProvisionedProductName,
      ProvisioningArtifactId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      NotificationArns: js.UndefOr[NotificationArns] = js.undefined,
      PathId: js.UndefOr[Id] = js.undefined,
      ProvisioningParameters: js.UndefOr[ProvisioningParameters] = js.undefined,
      ProvisioningPreferences: js.UndefOr[ProvisioningPreferences] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): ProvisionProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisionToken" -> ProvisionToken.asInstanceOf[js.Any],
        "ProvisionedProductName" -> ProvisionedProductName.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "NotificationArns" -> NotificationArns.map { x => x.asInstanceOf[js.Any] },
        "PathId" -> PathId.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningParameters" -> ProvisioningParameters.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningPreferences" -> ProvisioningPreferences.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionProductInput]
    }
  }

  @js.native
  trait ProvisionProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ProvisionProductOutput {
    def apply(
      RecordDetail: js.UndefOr[RecordDetail] = js.undefined): ProvisionProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordDetail" -> RecordDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionProductOutput]
    }
  }

  /**
   * <p>Information about a provisioned product.</p>
   */
  @js.native
  trait ProvisionedProductAttribute extends js.Object {
    var Arn: js.UndefOr[ProvisionedProductNameOrArn]
    var CreatedTime: js.UndefOr[CreatedTime]
    var Id: js.UndefOr[Id]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var LastRecordId: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisionedProductNameOrArn]
    var PhysicalId: js.UndefOr[PhysicalId]
    var ProductId: js.UndefOr[Id]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var Status: js.UndefOr[ProvisionedProductStatus]
    var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[ProvisionedProductType]
    var UserArn: js.UndefOr[UserArn]
    var UserArnSession: js.UndefOr[UserArnSession]
  }

  object ProvisionedProductAttribute {
    def apply(
      Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
      CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
      Id: js.UndefOr[Id] = js.undefined,
      IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
      LastRecordId: js.UndefOr[Id] = js.undefined,
      Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
      PhysicalId: js.UndefOr[PhysicalId] = js.undefined,
      ProductId: js.UndefOr[Id] = js.undefined,
      ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
      Status: js.UndefOr[ProvisionedProductStatus] = js.undefined,
      StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      Type: js.UndefOr[ProvisionedProductType] = js.undefined,
      UserArn: js.UndefOr[UserArn] = js.undefined,
      UserArnSession: js.UndefOr[UserArnSession] = js.undefined): ProvisionedProductAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "IdempotencyToken" -> IdempotencyToken.map { x => x.asInstanceOf[js.Any] },
        "LastRecordId" -> LastRecordId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "PhysicalId" -> PhysicalId.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactId" -> ProvisioningArtifactId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "UserArn" -> UserArn.map { x => x.asInstanceOf[js.Any] },
        "UserArnSession" -> UserArnSession.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedProductAttribute]
    }
  }

  /**
   * <p>Information about a provisioned product.</p>
   */
  @js.native
  trait ProvisionedProductDetail extends js.Object {
    var Arn: js.UndefOr[ProvisionedProductNameOrArn]
    var CreatedTime: js.UndefOr[CreatedTime]
    var Id: js.UndefOr[ProvisionedProductId]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var LastRecordId: js.UndefOr[LastRequestId]
    var Name: js.UndefOr[ProvisionedProductNameOrArn]
    var ProductId: js.UndefOr[Id]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var Status: js.UndefOr[ProvisionedProductStatus]
    var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage]
    var Type: js.UndefOr[ProvisionedProductType]
  }

  object ProvisionedProductDetail {
    def apply(
      Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
      CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
      Id: js.UndefOr[ProvisionedProductId] = js.undefined,
      IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
      LastRecordId: js.UndefOr[LastRequestId] = js.undefined,
      Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
      ProductId: js.UndefOr[Id] = js.undefined,
      ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
      Status: js.UndefOr[ProvisionedProductStatus] = js.undefined,
      StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined,
      Type: js.UndefOr[ProvisionedProductType] = js.undefined): ProvisionedProductDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "IdempotencyToken" -> IdempotencyToken.map { x => x.asInstanceOf[js.Any] },
        "LastRecordId" -> LastRecordId.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactId" -> ProvisioningArtifactId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedProductDetail]
    }
  }

  /**
   * <p>Information about a plan.</p>
   */
  @js.native
  trait ProvisionedProductPlanDetails extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var NotificationArns: js.UndefOr[NotificationArns]
    var PathId: js.UndefOr[Id]
    var PlanId: js.UndefOr[Id]
    var PlanName: js.UndefOr[ProvisionedProductPlanName]
    var PlanType: js.UndefOr[ProvisionedProductPlanType]
    var ProductId: js.UndefOr[Id]
    var ProvisionProductId: js.UndefOr[Id]
    var ProvisionProductName: js.UndefOr[ProvisionedProductName]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters]
    var Status: js.UndefOr[ProvisionedProductPlanStatus]
    var StatusMessage: js.UndefOr[StatusMessage]
    var Tags: js.UndefOr[Tags]
    var UpdatedTime: js.UndefOr[UpdatedTime]
  }

  object ProvisionedProductPlanDetails {
    def apply(
      CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
      NotificationArns: js.UndefOr[NotificationArns] = js.undefined,
      PathId: js.UndefOr[Id] = js.undefined,
      PlanId: js.UndefOr[Id] = js.undefined,
      PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined,
      PlanType: js.UndefOr[ProvisionedProductPlanType] = js.undefined,
      ProductId: js.UndefOr[Id] = js.undefined,
      ProvisionProductId: js.UndefOr[Id] = js.undefined,
      ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
      ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
      ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined,
      Status: js.UndefOr[ProvisionedProductPlanStatus] = js.undefined,
      StatusMessage: js.UndefOr[StatusMessage] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      UpdatedTime: js.UndefOr[UpdatedTime] = js.undefined): ProvisionedProductPlanDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "NotificationArns" -> NotificationArns.map { x => x.asInstanceOf[js.Any] },
        "PathId" -> PathId.map { x => x.asInstanceOf[js.Any] },
        "PlanId" -> PlanId.map { x => x.asInstanceOf[js.Any] },
        "PlanName" -> PlanName.map { x => x.asInstanceOf[js.Any] },
        "PlanType" -> PlanType.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionProductId" -> ProvisionProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionProductName" -> ProvisionProductName.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactId" -> ProvisioningArtifactId.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningParameters" -> ProvisioningParameters.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "StatusMessage" -> StatusMessage.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] },
        "UpdatedTime" -> UpdatedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedProductPlanDetails]
    }
  }

  object ProvisionedProductPlanStatusEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val CREATE_SUCCESS = "CREATE_SUCCESS"
    val CREATE_FAILED = "CREATE_FAILED"
    val EXECUTE_IN_PROGRESS = "EXECUTE_IN_PROGRESS"
    val EXECUTE_SUCCESS = "EXECUTE_SUCCESS"
    val EXECUTE_FAILED = "EXECUTE_FAILED"

    val values = IndexedSeq(CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED, EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED)
  }

  /**
   * <p>Summary information about a plan.</p>
   */
  @js.native
  trait ProvisionedProductPlanSummary extends js.Object {
    var PlanId: js.UndefOr[Id]
    var PlanName: js.UndefOr[ProvisionedProductPlanName]
    var PlanType: js.UndefOr[ProvisionedProductPlanType]
    var ProvisionProductId: js.UndefOr[Id]
    var ProvisionProductName: js.UndefOr[ProvisionedProductName]
    var ProvisioningArtifactId: js.UndefOr[Id]
  }

  object ProvisionedProductPlanSummary {
    def apply(
      PlanId: js.UndefOr[Id] = js.undefined,
      PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined,
      PlanType: js.UndefOr[ProvisionedProductPlanType] = js.undefined,
      ProvisionProductId: js.UndefOr[Id] = js.undefined,
      ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
      ProvisioningArtifactId: js.UndefOr[Id] = js.undefined): ProvisionedProductPlanSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlanId" -> PlanId.map { x => x.asInstanceOf[js.Any] },
        "PlanName" -> PlanName.map { x => x.asInstanceOf[js.Any] },
        "PlanType" -> PlanType.map { x => x.asInstanceOf[js.Any] },
        "ProvisionProductId" -> ProvisionProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionProductName" -> ProvisionProductName.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactId" -> ProvisioningArtifactId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedProductPlanSummary]
    }
  }

  object ProvisionedProductPlanTypeEnum {
    val CLOUDFORMATION = "CLOUDFORMATION"

    val values = IndexedSeq(CLOUDFORMATION)
  }

  object ProvisionedProductStatusEnum {
    val AVAILABLE = "AVAILABLE"
    val UNDER_CHANGE = "UNDER_CHANGE"
    val TAINTED = "TAINTED"
    val ERROR = "ERROR"
    val PLAN_IN_PROGRESS = "PLAN_IN_PROGRESS"

    val values = IndexedSeq(AVAILABLE, UNDER_CHANGE, TAINTED, ERROR, PLAN_IN_PROGRESS)
  }

  object ProvisionedProductViewFilterByEnum {
    val SearchQuery = "SearchQuery"

    val values = IndexedSeq(SearchQuery)
  }

  /**
   * <p>Information about a provisioning artifact. A provisioning artifact is also known as a product version.</p>
   */
  @js.native
  trait ProvisioningArtifact extends js.Object {
    var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
  }

  object ProvisioningArtifact {
    def apply(
      CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined,
      Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
      Id: js.UndefOr[Id] = js.undefined,
      Name: js.UndefOr[ProvisioningArtifactName] = js.undefined): ProvisioningArtifact = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisioningArtifact]
    }
  }

  /**
   * <p>Information about a provisioning artifact (also known as a version) for a product.</p>
   */
  @js.native
  trait ProvisioningArtifactDetail extends js.Object {
    var Active: js.UndefOr[ProvisioningArtifactActive]
    var CreatedTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[ProvisioningArtifactName]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var Type: js.UndefOr[ProvisioningArtifactType]
  }

  object ProvisioningArtifactDetail {
    def apply(
      Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined,
      CreatedTime: js.UndefOr[CreationTime] = js.undefined,
      Description: js.UndefOr[ProvisioningArtifactName] = js.undefined,
      Id: js.UndefOr[Id] = js.undefined,
      Name: js.UndefOr[ProvisioningArtifactName] = js.undefined,
      Type: js.UndefOr[ProvisioningArtifactType] = js.undefined): ProvisioningArtifactDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Active" -> Active.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisioningArtifactDetail]
    }
  }

  /**
   * <p>Information about a parameter used to provision a product.</p>
   */
  @js.native
  trait ProvisioningArtifactParameter extends js.Object {
    var DefaultValue: js.UndefOr[DefaultValue]
    var Description: js.UndefOr[Description]
    var IsNoEcho: js.UndefOr[NoEcho]
    var ParameterConstraints: js.UndefOr[ParameterConstraints]
    var ParameterKey: js.UndefOr[ParameterKey]
    var ParameterType: js.UndefOr[ParameterType]
  }

  object ProvisioningArtifactParameter {
    def apply(
      DefaultValue: js.UndefOr[DefaultValue] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      IsNoEcho: js.UndefOr[NoEcho] = js.undefined,
      ParameterConstraints: js.UndefOr[ParameterConstraints] = js.undefined,
      ParameterKey: js.UndefOr[ParameterKey] = js.undefined,
      ParameterType: js.UndefOr[ParameterType] = js.undefined): ProvisioningArtifactParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefaultValue" -> DefaultValue.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "IsNoEcho" -> IsNoEcho.map { x => x.asInstanceOf[js.Any] },
        "ParameterConstraints" -> ParameterConstraints.map { x => x.asInstanceOf[js.Any] },
        "ParameterKey" -> ParameterKey.map { x => x.asInstanceOf[js.Any] },
        "ParameterType" -> ParameterType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisioningArtifactParameter]
    }
  }

  /**
   * <p>The user-defined preferences that will be applied during product provisioning, unless overridden by <code>ProvisioningPreferences</code> or <code>UpdateProvisioningPreferences</code>.</p> <p>For more information on maximum concurrent accounts and failure tolerance, see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options">Stack set operation options</a> in the <i>AWS CloudFormation User Guide</i>.</p>
   */
  @js.native
  trait ProvisioningArtifactPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  object ProvisioningArtifactPreferences {
    def apply(
      StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined,
      StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined): ProvisioningArtifactPreferences = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetAccounts" -> StackSetAccounts.map { x => x.asInstanceOf[js.Any] },
        "StackSetRegions" -> StackSetRegions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisioningArtifactPreferences]
    }
  }

  /**
   * <p>Information about a provisioning artifact (also known as a version) for a product.</p>
   */
  @js.native
  trait ProvisioningArtifactProperties extends js.Object {
    var Info: ProvisioningArtifactInfo
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var Type: js.UndefOr[ProvisioningArtifactType]
  }

  object ProvisioningArtifactProperties {
    def apply(
      Info: ProvisioningArtifactInfo,
      Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
      Name: js.UndefOr[ProvisioningArtifactName] = js.undefined,
      Type: js.UndefOr[ProvisioningArtifactType] = js.undefined): ProvisioningArtifactProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Info" -> Info.asInstanceOf[js.Any],
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisioningArtifactProperties]
    }
  }

  object ProvisioningArtifactPropertyNameEnum {
    val Id = "Id"

    val values = IndexedSeq(Id)
  }

  /**
   * <p>Summary information about a provisioning artifact (also known as a version) for a product.</p>
   */
  @js.native
  trait ProvisioningArtifactSummary extends js.Object {
    var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo]
  }

  object ProvisioningArtifactSummary {
    def apply(
      CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined,
      Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
      Id: js.UndefOr[Id] = js.undefined,
      Name: js.UndefOr[ProvisioningArtifactName] = js.undefined,
      ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo] = js.undefined): ProvisioningArtifactSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactMetadata" -> ProvisioningArtifactMetadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisioningArtifactSummary]
    }
  }

  object ProvisioningArtifactTypeEnum {
    val CLOUD_FORMATION_TEMPLATE = "CLOUD_FORMATION_TEMPLATE"
    val MARKETPLACE_AMI = "MARKETPLACE_AMI"
    val MARKETPLACE_CAR = "MARKETPLACE_CAR"

    val values = IndexedSeq(CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI, MARKETPLACE_CAR)
  }

  /**
   * <p>An object that contains summary information about a product view and a provisioning artifact.</p>
   */
  @js.native
  trait ProvisioningArtifactView extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifact: js.UndefOr[ProvisioningArtifact]
  }

  object ProvisioningArtifactView {
    def apply(
      ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
      ProvisioningArtifact: js.UndefOr[ProvisioningArtifact] = js.undefined): ProvisioningArtifactView = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductViewSummary" -> ProductViewSummary.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifact" -> ProvisioningArtifact.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisioningArtifactView]
    }
  }

  /**
   * <p>Information about a parameter used to provision a product.</p>
   */
  @js.native
  trait ProvisioningParameter extends js.Object {
    var Key: js.UndefOr[ParameterKey]
    var Value: js.UndefOr[ParameterValue]
  }

  object ProvisioningParameter {
    def apply(
      Key: js.UndefOr[ParameterKey] = js.undefined,
      Value: js.UndefOr[ParameterValue] = js.undefined): ProvisioningParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisioningParameter]
    }
  }

  /**
   * <p>The user-defined preferences that will be applied when updating a provisioned product. Not all preferences are applicable to all provisioned product types.</p>
   */
  @js.native
  trait ProvisioningPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount]
    var StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage]
    var StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount]
    var StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  object ProvisioningPreferences {
    def apply(
      StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined,
      StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount] = js.undefined,
      StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage] = js.undefined,
      StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount] = js.undefined,
      StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage] = js.undefined,
      StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined): ProvisioningPreferences = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetAccounts" -> StackSetAccounts.map { x => x.asInstanceOf[js.Any] },
        "StackSetFailureToleranceCount" -> StackSetFailureToleranceCount.map { x => x.asInstanceOf[js.Any] },
        "StackSetFailureTolerancePercentage" -> StackSetFailureTolerancePercentage.map { x => x.asInstanceOf[js.Any] },
        "StackSetMaxConcurrencyCount" -> StackSetMaxConcurrencyCount.map { x => x.asInstanceOf[js.Any] },
        "StackSetMaxConcurrencyPercentage" -> StackSetMaxConcurrencyPercentage.map { x => x.asInstanceOf[js.Any] },
        "StackSetRegions" -> StackSetRegions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisioningPreferences]
    }
  }

  /**
   * <p>Information about a request operation.</p>
   */
  @js.native
  trait RecordDetail extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var PathId: js.UndefOr[Id]
    var ProductId: js.UndefOr[Id]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductName]
    var ProvisionedProductType: js.UndefOr[ProvisionedProductType]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var RecordErrors: js.UndefOr[RecordErrors]
    var RecordId: js.UndefOr[Id]
    var RecordTags: js.UndefOr[RecordTags]
    var RecordType: js.UndefOr[RecordType]
    var Status: js.UndefOr[RecordStatus]
    var UpdatedTime: js.UndefOr[UpdatedTime]
  }

  object RecordDetail {
    def apply(
      CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
      PathId: js.UndefOr[Id] = js.undefined,
      ProductId: js.UndefOr[Id] = js.undefined,
      ProvisionedProductId: js.UndefOr[Id] = js.undefined,
      ProvisionedProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
      ProvisionedProductType: js.UndefOr[ProvisionedProductType] = js.undefined,
      ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
      RecordErrors: js.UndefOr[RecordErrors] = js.undefined,
      RecordId: js.UndefOr[Id] = js.undefined,
      RecordTags: js.UndefOr[RecordTags] = js.undefined,
      RecordType: js.UndefOr[RecordType] = js.undefined,
      Status: js.UndefOr[RecordStatus] = js.undefined,
      UpdatedTime: js.UndefOr[UpdatedTime] = js.undefined): RecordDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "PathId" -> PathId.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductId" -> ProvisionedProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductName" -> ProvisionedProductName.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductType" -> ProvisionedProductType.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactId" -> ProvisioningArtifactId.map { x => x.asInstanceOf[js.Any] },
        "RecordErrors" -> RecordErrors.map { x => x.asInstanceOf[js.Any] },
        "RecordId" -> RecordId.map { x => x.asInstanceOf[js.Any] },
        "RecordTags" -> RecordTags.map { x => x.asInstanceOf[js.Any] },
        "RecordType" -> RecordType.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "UpdatedTime" -> UpdatedTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordDetail]
    }
  }

  /**
   * <p>The error code and description resulting from an operation.</p>
   */
  @js.native
  trait RecordError extends js.Object {
    var Code: js.UndefOr[ErrorCode]
    var Description: js.UndefOr[ErrorDescription]
  }

  object RecordError {
    def apply(
      Code: js.UndefOr[ErrorCode] = js.undefined,
      Description: js.UndefOr[ErrorDescription] = js.undefined): RecordError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordError]
    }
  }

  /**
   * <p>The output for the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.</p>
   */
  @js.native
  trait RecordOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var OutputKey: js.UndefOr[OutputKey]
    var OutputValue: js.UndefOr[OutputValue]
  }

  object RecordOutput {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      OutputKey: js.UndefOr[OutputKey] = js.undefined,
      OutputValue: js.UndefOr[OutputValue] = js.undefined): RecordOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "OutputKey" -> OutputKey.map { x => x.asInstanceOf[js.Any] },
        "OutputValue" -> OutputValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordOutput]
    }
  }

  object RecordStatusEnum {
    val CREATED = "CREATED"
    val IN_PROGRESS = "IN_PROGRESS"
    val IN_PROGRESS_IN_ERROR = "IN_PROGRESS_IN_ERROR"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"

    val values = IndexedSeq(CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR, SUCCEEDED, FAILED)
  }

  /**
   * <p>Information about a tag, which is a key-value pair.</p>
   */
  @js.native
  trait RecordTag extends js.Object {
    var Key: js.UndefOr[RecordTagKey]
    var Value: js.UndefOr[RecordTagValue]
  }

  object RecordTag {
    def apply(
      Key: js.UndefOr[RecordTagKey] = js.undefined,
      Value: js.UndefOr[RecordTagValue] = js.undefined): RecordTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecordTag]
    }
  }

  @js.native
  trait RejectPortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  object RejectPortfolioShareInput {
    def apply(
      PortfolioId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined): RejectPortfolioShareInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PortfolioShareType" -> PortfolioShareType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectPortfolioShareInput]
    }
  }

  @js.native
  trait RejectPortfolioShareOutput extends js.Object {

  }

  object RejectPortfolioShareOutput {
    def apply(): RejectPortfolioShareOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectPortfolioShareOutput]
    }
  }

  object ReplacementEnum {
    val TRUE = "TRUE"
    val FALSE = "FALSE"
    val CONDITIONAL = "CONDITIONAL"

    val values = IndexedSeq(TRUE, FALSE, CONDITIONAL)
  }

  object RequiresRecreationEnum {
    val NEVER = "NEVER"
    val CONDITIONALLY = "CONDITIONALLY"
    val ALWAYS = "ALWAYS"

    val values = IndexedSeq(NEVER, CONDITIONALLY, ALWAYS)
  }

  object ResourceAttributeEnum {
    val PROPERTIES = "PROPERTIES"
    val METADATA = "METADATA"
    val CREATIONPOLICY = "CREATIONPOLICY"
    val UPDATEPOLICY = "UPDATEPOLICY"
    val DELETIONPOLICY = "DELETIONPOLICY"
    val TAGS = "TAGS"

    val values = IndexedSeq(PROPERTIES, METADATA, CREATIONPOLICY, UPDATEPOLICY, DELETIONPOLICY, TAGS)
  }

  /**
   * <p>Information about a resource change that will occur when a plan is executed.</p>
   */
  @js.native
  trait ResourceChange extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var Details: js.UndefOr[ResourceChangeDetails]
    var LogicalResourceId: js.UndefOr[LogicalResourceId]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var Replacement: js.UndefOr[Replacement]
    var ResourceType: js.UndefOr[PlanResourceType]
    var Scope: js.UndefOr[Scope]
  }

  object ResourceChange {
    def apply(
      Action: js.UndefOr[ChangeAction] = js.undefined,
      Details: js.UndefOr[ResourceChangeDetails] = js.undefined,
      LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
      PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
      Replacement: js.UndefOr[Replacement] = js.undefined,
      ResourceType: js.UndefOr[PlanResourceType] = js.undefined,
      Scope: js.UndefOr[Scope] = js.undefined): ResourceChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Action" -> Action.map { x => x.asInstanceOf[js.Any] },
        "Details" -> Details.map { x => x.asInstanceOf[js.Any] },
        "LogicalResourceId" -> LogicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "PhysicalResourceId" -> PhysicalResourceId.map { x => x.asInstanceOf[js.Any] },
        "Replacement" -> Replacement.map { x => x.asInstanceOf[js.Any] },
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "Scope" -> Scope.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceChange]
    }
  }

  /**
   * <p>Information about a change to a resource attribute.</p>
   */
  @js.native
  trait ResourceChangeDetail extends js.Object {
    var CausingEntity: js.UndefOr[CausingEntity]
    var Evaluation: js.UndefOr[EvaluationType]
    var Target: js.UndefOr[ResourceTargetDefinition]
  }

  object ResourceChangeDetail {
    def apply(
      CausingEntity: js.UndefOr[CausingEntity] = js.undefined,
      Evaluation: js.UndefOr[EvaluationType] = js.undefined,
      Target: js.UndefOr[ResourceTargetDefinition] = js.undefined): ResourceChangeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CausingEntity" -> CausingEntity.map { x => x.asInstanceOf[js.Any] },
        "Evaluation" -> Evaluation.map { x => x.asInstanceOf[js.Any] },
        "Target" -> Target.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceChangeDetail]
    }
  }

  /**
   * <p>Information about a resource.</p>
   */
  @js.native
  trait ResourceDetail extends js.Object {
    var ARN: js.UndefOr[ResourceDetailARN]
    var CreatedTime: js.UndefOr[ResourceDetailCreatedTime]
    var Description: js.UndefOr[ResourceDetailDescription]
    var Id: js.UndefOr[ResourceDetailId]
    var Name: js.UndefOr[ResourceDetailName]
  }

  object ResourceDetail {
    def apply(
      ARN: js.UndefOr[ResourceDetailARN] = js.undefined,
      CreatedTime: js.UndefOr[ResourceDetailCreatedTime] = js.undefined,
      Description: js.UndefOr[ResourceDetailDescription] = js.undefined,
      Id: js.UndefOr[ResourceDetailId] = js.undefined,
      Name: js.UndefOr[ResourceDetailName] = js.undefined): ResourceDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "CreatedTime" -> CreatedTime.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceDetail]
    }
  }

  /**
   * <p>Information about a change to a resource attribute.</p>
   */
  @js.native
  trait ResourceTargetDefinition extends js.Object {
    var Attribute: js.UndefOr[ResourceAttribute]
    var Name: js.UndefOr[PropertyName]
    var RequiresRecreation: js.UndefOr[RequiresRecreation]
  }

  object ResourceTargetDefinition {
    def apply(
      Attribute: js.UndefOr[ResourceAttribute] = js.undefined,
      Name: js.UndefOr[PropertyName] = js.undefined,
      RequiresRecreation: js.UndefOr[RequiresRecreation] = js.undefined): ResourceTargetDefinition = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attribute" -> Attribute.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "RequiresRecreation" -> RequiresRecreation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTargetDefinition]
    }
  }

  @js.native
  trait ScanProvisionedProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ScanProvisionedProductsInput {
    def apply(
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined): ScanProvisionedProductsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "AccessLevelFilter" -> AccessLevelFilter.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScanProvisionedProductsInput]
    }
  }

  @js.native
  trait ScanProvisionedProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProducts: js.UndefOr[ProvisionedProductDetails]
  }

  object ScanProvisionedProductsOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ProvisionedProducts: js.UndefOr[ProvisionedProductDetails] = js.undefined): ScanProvisionedProductsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProducts" -> ProvisionedProducts.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScanProvisionedProductsOutput]
    }
  }

  @js.native
  trait SearchProductsAsAdminInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Filters: js.UndefOr[ProductViewFilters]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var PortfolioId: js.UndefOr[Id]
    var ProductSource: js.UndefOr[ProductSource]
    var SortBy: js.UndefOr[ProductViewSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SearchProductsAsAdminInput {
    def apply(
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Filters: js.UndefOr[ProductViewFilters] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined,
      PortfolioId: js.UndefOr[Id] = js.undefined,
      ProductSource: js.UndefOr[ProductSource] = js.undefined,
      SortBy: js.UndefOr[ProductViewSortBy] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined): SearchProductsAsAdminInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "PortfolioId" -> PortfolioId.map { x => x.asInstanceOf[js.Any] },
        "ProductSource" -> ProductSource.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchProductsAsAdminInput]
    }
  }

  @js.native
  trait SearchProductsAsAdminOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProductViewDetails: js.UndefOr[ProductViewDetails]
  }

  object SearchProductsAsAdminOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ProductViewDetails: js.UndefOr[ProductViewDetails] = js.undefined): SearchProductsAsAdminOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ProductViewDetails" -> ProductViewDetails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchProductsAsAdminOutput]
    }
  }

  @js.native
  trait SearchProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Filters: js.UndefOr[ProductViewFilters]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var SortBy: js.UndefOr[ProductViewSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SearchProductsInput {
    def apply(
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Filters: js.UndefOr[ProductViewFilters] = js.undefined,
      PageSize: js.UndefOr[PageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined,
      SortBy: js.UndefOr[ProductViewSortBy] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined): SearchProductsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchProductsInput]
    }
  }

  @js.native
  trait SearchProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProductViewAggregations: js.UndefOr[ProductViewAggregations]
    var ProductViewSummaries: js.UndefOr[ProductViewSummaries]
  }

  object SearchProductsOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ProductViewAggregations: js.UndefOr[ProductViewAggregations] = js.undefined,
      ProductViewSummaries: js.UndefOr[ProductViewSummaries] = js.undefined): SearchProductsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ProductViewAggregations" -> ProductViewAggregations.map { x => x.asInstanceOf[js.Any] },
        "ProductViewSummaries" -> ProductViewSummaries.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchProductsOutput]
    }
  }

  @js.native
  trait SearchProvisionedProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var Filters: js.UndefOr[ProvisionedProductFilters]
    var PageSize: js.UndefOr[SearchProvisionedProductsPageSize]
    var PageToken: js.UndefOr[PageToken]
    var SortBy: js.UndefOr[SortField]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SearchProvisionedProductsInput {
    def apply(
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
      Filters: js.UndefOr[ProvisionedProductFilters] = js.undefined,
      PageSize: js.UndefOr[SearchProvisionedProductsPageSize] = js.undefined,
      PageToken: js.UndefOr[PageToken] = js.undefined,
      SortBy: js.UndefOr[SortField] = js.undefined,
      SortOrder: js.UndefOr[SortOrder] = js.undefined): SearchProvisionedProductsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "AccessLevelFilter" -> AccessLevelFilter.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "PageSize" -> PageSize.map { x => x.asInstanceOf[js.Any] },
        "PageToken" -> PageToken.map { x => x.asInstanceOf[js.Any] },
        "SortBy" -> SortBy.map { x => x.asInstanceOf[js.Any] },
        "SortOrder" -> SortOrder.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchProvisionedProductsInput]
    }
  }

  @js.native
  trait SearchProvisionedProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes]
    var TotalResultsCount: js.UndefOr[TotalResultsCount]
  }

  object SearchProvisionedProductsOutput {
    def apply(
      NextPageToken: js.UndefOr[PageToken] = js.undefined,
      ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.undefined,
      TotalResultsCount: js.UndefOr[TotalResultsCount] = js.undefined): SearchProvisionedProductsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextPageToken" -> NextPageToken.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProducts" -> ProvisionedProducts.map { x => x.asInstanceOf[js.Any] },
        "TotalResultsCount" -> TotalResultsCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchProvisionedProductsOutput]
    }
  }

  /**
   * <p>A self-service action association consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.</p>
   */
  @js.native
  trait ServiceActionAssociation extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
  }

  object ServiceActionAssociation {
    def apply(
      ProductId: Id,
      ProvisioningArtifactId: Id,
      ServiceActionId: Id): ServiceActionAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceActionAssociation]
    }
  }

  object ServiceActionAssociationErrorCodeEnum {
    val DUPLICATE_RESOURCE = "DUPLICATE_RESOURCE"
    val INTERNAL_FAILURE = "INTERNAL_FAILURE"
    val LIMIT_EXCEEDED = "LIMIT_EXCEEDED"
    val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND"
    val THROTTLING = "THROTTLING"

    val values = IndexedSeq(DUPLICATE_RESOURCE, INTERNAL_FAILURE, LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING)
  }

  object ServiceActionDefinitionKeyEnum {
    val Name = "Name"
    val Version = "Version"
    val AssumeRole = "AssumeRole"
    val Parameters = "Parameters"

    val values = IndexedSeq(Name, Version, AssumeRole, Parameters)
  }

  object ServiceActionDefinitionTypeEnum {
    val SSM_AUTOMATION = "SSM_AUTOMATION"

    val values = IndexedSeq(SSM_AUTOMATION)
  }

  /**
   * <p>An object containing detailed information about the self-service action.</p>
   */
  @js.native
  trait ServiceActionDetail extends js.Object {
    var Definition: js.UndefOr[ServiceActionDefinitionMap]
    var ServiceActionSummary: js.UndefOr[ServiceActionSummary]
  }

  object ServiceActionDetail {
    def apply(
      Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined,
      ServiceActionSummary: js.UndefOr[ServiceActionSummary] = js.undefined): ServiceActionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Definition" -> Definition.map { x => x.asInstanceOf[js.Any] },
        "ServiceActionSummary" -> ServiceActionSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceActionDetail]
    }
  }

  /**
   * <p>Detailed information about the self-service action.</p>
   */
  @js.native
  trait ServiceActionSummary extends js.Object {
    var DefinitionType: js.UndefOr[ServiceActionDefinitionType]
    var Description: js.UndefOr[ServiceActionDescription]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ServiceActionName]
  }

  object ServiceActionSummary {
    def apply(
      DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.undefined,
      Description: js.UndefOr[ServiceActionDescription] = js.undefined,
      Id: js.UndefOr[Id] = js.undefined,
      Name: js.UndefOr[ServiceActionName] = js.undefined): ServiceActionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DefinitionType" -> DefinitionType.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceActionSummary]
    }
  }

  /**
   * <p>Information about the portfolio share operation.</p>
   */
  @js.native
  trait ShareDetails extends js.Object {
    var ShareErrors: js.UndefOr[ShareErrors]
    var SuccessfulShares: js.UndefOr[SuccessfulShares]
  }

  object ShareDetails {
    def apply(
      ShareErrors: js.UndefOr[ShareErrors] = js.undefined,
      SuccessfulShares: js.UndefOr[SuccessfulShares] = js.undefined): ShareDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ShareErrors" -> ShareErrors.map { x => x.asInstanceOf[js.Any] },
        "SuccessfulShares" -> SuccessfulShares.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShareDetails]
    }
  }

  /**
   * <p>Errors that occurred during the portfolio share operation.</p>
   */
  @js.native
  trait ShareError extends js.Object {
    var Accounts: js.UndefOr[Namespaces]
    var Error: js.UndefOr[Error]
    var Message: js.UndefOr[Message]
  }

  object ShareError {
    def apply(
      Accounts: js.UndefOr[Namespaces] = js.undefined,
      Error: js.UndefOr[Error] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined): ShareError = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accounts" -> Accounts.map { x => x.asInstanceOf[js.Any] },
        "Error" -> Error.map { x => x.asInstanceOf[js.Any] },
        "Message" -> Message.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ShareError]
    }
  }

  object ShareStatusEnum {
    val NOT_STARTED = "NOT_STARTED"
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED = "COMPLETED"
    val COMPLETED_WITH_ERRORS = "COMPLETED_WITH_ERRORS"
    val ERROR = "ERROR"

    val values = IndexedSeq(NOT_STARTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, ERROR)
  }

  object SortOrderEnum {
    val ASCENDING = "ASCENDING"
    val DESCENDING = "DESCENDING"

    val values = IndexedSeq(ASCENDING, DESCENDING)
  }

  object StackSetOperationTypeEnum {
    val CREATE = "CREATE"
    val UPDATE = "UPDATE"
    val DELETE = "DELETE"

    val values = IndexedSeq(CREATE, UPDATE, DELETE)
  }

  object StatusEnum {
    val AVAILABLE = "AVAILABLE"
    val CREATING = "CREATING"
    val FAILED = "FAILED"

    val values = IndexedSeq(AVAILABLE, CREATING, FAILED)
  }

  /**
   * <p>Information about a tag. A tag is a key-value pair. Tags are propagated to the resources created when provisioning a product.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: TagValue): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Information about a TagOption.</p>
   */
  @js.native
  trait TagOptionDetail extends js.Object {
    var Active: js.UndefOr[TagOptionActive]
    var Id: js.UndefOr[TagOptionId]
    var Key: js.UndefOr[TagOptionKey]
    var Value: js.UndefOr[TagOptionValue]
  }

  object TagOptionDetail {
    def apply(
      Active: js.UndefOr[TagOptionActive] = js.undefined,
      Id: js.UndefOr[TagOptionId] = js.undefined,
      Key: js.UndefOr[TagOptionKey] = js.undefined,
      Value: js.UndefOr[TagOptionValue] = js.undefined): TagOptionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Active" -> Active.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagOptionDetail]
    }
  }

  /**
   * <p>Summary information about a TagOption.</p>
   */
  @js.native
  trait TagOptionSummary extends js.Object {
    var Key: js.UndefOr[TagOptionKey]
    var Values: js.UndefOr[TagOptionValues]
  }

  object TagOptionSummary {
    def apply(
      Key: js.UndefOr[TagOptionKey] = js.undefined,
      Values: js.UndefOr[TagOptionValues] = js.undefined): TagOptionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagOptionSummary]
    }
  }

  @js.native
  trait TerminateProvisionedProductInput extends js.Object {
    var TerminateToken: IdempotencyToken
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var IgnoreErrors: js.UndefOr[IgnoreErrors]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn]
  }

  object TerminateProvisionedProductInput {
    def apply(
      TerminateToken: IdempotencyToken,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined,
      ProvisionedProductId: js.UndefOr[Id] = js.undefined,
      ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined): TerminateProvisionedProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TerminateToken" -> TerminateToken.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "IgnoreErrors" -> IgnoreErrors.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductId" -> ProvisionedProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductName" -> ProvisionedProductName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateProvisionedProductInput]
    }
  }

  @js.native
  trait TerminateProvisionedProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object TerminateProvisionedProductOutput {
    def apply(
      RecordDetail: js.UndefOr[RecordDetail] = js.undefined): TerminateProvisionedProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordDetail" -> RecordDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateProvisionedProductOutput]
    }
  }

  @js.native
  trait UpdateConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ConstraintDescription]
  }

  object UpdateConstraintInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Description: js.UndefOr[ConstraintDescription] = js.undefined): UpdateConstraintInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConstraintInput]
    }
  }

  @js.native
  trait UpdateConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  object UpdateConstraintOutput {
    def apply(
      ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined,
      ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): UpdateConstraintOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConstraintDetail" -> ConstraintDetail.map { x => x.asInstanceOf[js.Any] },
        "ConstraintParameters" -> ConstraintParameters.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConstraintOutput]
    }
  }

  @js.native
  trait UpdatePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AddTags: js.UndefOr[AddTags]
    var Description: js.UndefOr[PortfolioDescription]
    var DisplayName: js.UndefOr[PortfolioDisplayName]
    var ProviderName: js.UndefOr[ProviderName]
    var RemoveTags: js.UndefOr[TagKeys]
  }

  object UpdatePortfolioInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      AddTags: js.UndefOr[AddTags] = js.undefined,
      Description: js.UndefOr[PortfolioDescription] = js.undefined,
      DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined,
      ProviderName: js.UndefOr[ProviderName] = js.undefined,
      RemoveTags: js.UndefOr[TagKeys] = js.undefined): UpdatePortfolioInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "AddTags" -> AddTags.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DisplayName" -> DisplayName.map { x => x.asInstanceOf[js.Any] },
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] },
        "RemoveTags" -> RemoveTags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePortfolioInput]
    }
  }

  @js.native
  trait UpdatePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var Tags: js.UndefOr[Tags]
  }

  object UpdatePortfolioOutput {
    def apply(
      PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): UpdatePortfolioOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PortfolioDetail" -> PortfolioDetail.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdatePortfolioOutput]
    }
  }

  @js.native
  trait UpdateProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AddTags: js.UndefOr[AddTags]
    var Description: js.UndefOr[ProductViewShortDescription]
    var Distributor: js.UndefOr[ProductViewOwner]
    var Name: js.UndefOr[ProductViewName]
    var Owner: js.UndefOr[ProductViewOwner]
    var RemoveTags: js.UndefOr[TagKeys]
    var SupportDescription: js.UndefOr[SupportDescription]
    var SupportEmail: js.UndefOr[SupportEmail]
    var SupportUrl: js.UndefOr[SupportUrl]
  }

  object UpdateProductInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      AddTags: js.UndefOr[AddTags] = js.undefined,
      Description: js.UndefOr[ProductViewShortDescription] = js.undefined,
      Distributor: js.UndefOr[ProductViewOwner] = js.undefined,
      Name: js.UndefOr[ProductViewName] = js.undefined,
      Owner: js.UndefOr[ProductViewOwner] = js.undefined,
      RemoveTags: js.UndefOr[TagKeys] = js.undefined,
      SupportDescription: js.UndefOr[SupportDescription] = js.undefined,
      SupportEmail: js.UndefOr[SupportEmail] = js.undefined,
      SupportUrl: js.UndefOr[SupportUrl] = js.undefined): UpdateProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "AddTags" -> AddTags.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Distributor" -> Distributor.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Owner" -> Owner.map { x => x.asInstanceOf[js.Any] },
        "RemoveTags" -> RemoveTags.map { x => x.asInstanceOf[js.Any] },
        "SupportDescription" -> SupportDescription.map { x => x.asInstanceOf[js.Any] },
        "SupportEmail" -> SupportEmail.map { x => x.asInstanceOf[js.Any] },
        "SupportUrl" -> SupportUrl.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProductInput]
    }
  }

  @js.native
  trait UpdateProductOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateProductOutput {
    def apply(
      ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined): UpdateProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductViewDetail" -> ProductViewDetail.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProductOutput]
    }
  }

  @js.native
  trait UpdateProvisionedProductInput extends js.Object {
    var UpdateToken: IdempotencyToken
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PathId: js.UndefOr[Id]
    var ProductId: js.UndefOr[Id]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters]
    var ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences]
  }

  object UpdateProvisionedProductInput {
    def apply(
      UpdateToken: IdempotencyToken,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      PathId: js.UndefOr[Id] = js.undefined,
      ProductId: js.UndefOr[Id] = js.undefined,
      ProvisionedProductId: js.UndefOr[Id] = js.undefined,
      ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
      ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
      ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined,
      ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences] = js.undefined): UpdateProvisionedProductInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "PathId" -> PathId.map { x => x.asInstanceOf[js.Any] },
        "ProductId" -> ProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductId" -> ProvisionedProductId.map { x => x.asInstanceOf[js.Any] },
        "ProvisionedProductName" -> ProvisionedProductName.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactId" -> ProvisioningArtifactId.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningParameters" -> ProvisioningParameters.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningPreferences" -> ProvisioningPreferences.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProvisionedProductInput]
    }
  }

  @js.native
  trait UpdateProvisionedProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object UpdateProvisionedProductOutput {
    def apply(
      RecordDetail: js.UndefOr[RecordDetail] = js.undefined): UpdateProvisionedProductOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecordDetail" -> RecordDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProvisionedProductOutput]
    }
  }

  @js.native
  trait UpdateProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Active: js.UndefOr[ProvisioningArtifactActive]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Name: js.UndefOr[ProvisioningArtifactName]
  }

  object UpdateProvisioningArtifactInput {
    def apply(
      ProductId: Id,
      ProvisioningArtifactId: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined,
      Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
      Name: js.UndefOr[ProvisioningArtifactName] = js.undefined): UpdateProvisioningArtifactInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Active" -> Active.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProvisioningArtifactInput]
    }
  }

  @js.native
  trait UpdateProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  object UpdateProvisioningArtifactOutput {
    def apply(
      Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined,
      ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined): UpdateProvisioningArtifactOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Info" -> Info.map { x => x.asInstanceOf[js.Any] },
        "ProvisioningArtifactDetail" -> ProvisioningArtifactDetail.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProvisioningArtifactOutput]
    }
  }

  /**
   * <p>The parameter key-value pair used to update a provisioned product.</p>
   */
  @js.native
  trait UpdateProvisioningParameter extends js.Object {
    var Key: js.UndefOr[ParameterKey]
    var UsePreviousValue: js.UndefOr[UsePreviousValue]
    var Value: js.UndefOr[ParameterValue]
  }

  object UpdateProvisioningParameter {
    def apply(
      Key: js.UndefOr[ParameterKey] = js.undefined,
      UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined,
      Value: js.UndefOr[ParameterValue] = js.undefined): UpdateProvisioningParameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "UsePreviousValue" -> UsePreviousValue.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProvisioningParameter]
    }
  }

  /**
   * <p>The user-defined preferences that will be applied when updating a provisioned product. Not all preferences are applicable to all provisioned product types.</p>
   */
  @js.native
  trait UpdateProvisioningPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount]
    var StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage]
    var StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount]
    var StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage]
    var StackSetOperationType: js.UndefOr[StackSetOperationType]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  object UpdateProvisioningPreferences {
    def apply(
      StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined,
      StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount] = js.undefined,
      StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage] = js.undefined,
      StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount] = js.undefined,
      StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage] = js.undefined,
      StackSetOperationType: js.UndefOr[StackSetOperationType] = js.undefined,
      StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined): UpdateProvisioningPreferences = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StackSetAccounts" -> StackSetAccounts.map { x => x.asInstanceOf[js.Any] },
        "StackSetFailureToleranceCount" -> StackSetFailureToleranceCount.map { x => x.asInstanceOf[js.Any] },
        "StackSetFailureTolerancePercentage" -> StackSetFailureTolerancePercentage.map { x => x.asInstanceOf[js.Any] },
        "StackSetMaxConcurrencyCount" -> StackSetMaxConcurrencyCount.map { x => x.asInstanceOf[js.Any] },
        "StackSetMaxConcurrencyPercentage" -> StackSetMaxConcurrencyPercentage.map { x => x.asInstanceOf[js.Any] },
        "StackSetOperationType" -> StackSetOperationType.map { x => x.asInstanceOf[js.Any] },
        "StackSetRegions" -> StackSetRegions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProvisioningPreferences]
    }
  }

  @js.native
  trait UpdateServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Definition: js.UndefOr[ServiceActionDefinitionMap]
    var Description: js.UndefOr[ServiceActionDescription]
    var Name: js.UndefOr[ServiceActionName]
  }

  object UpdateServiceActionInput {
    def apply(
      Id: Id,
      AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
      Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined,
      Description: js.UndefOr[ServiceActionDescription] = js.undefined,
      Name: js.UndefOr[ServiceActionName] = js.undefined): UpdateServiceActionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "AcceptLanguage" -> AcceptLanguage.map { x => x.asInstanceOf[js.Any] },
        "Definition" -> Definition.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceActionInput]
    }
  }

  @js.native
  trait UpdateServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  object UpdateServiceActionOutput {
    def apply(
      ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined): UpdateServiceActionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceActionDetail" -> ServiceActionDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceActionOutput]
    }
  }

  @js.native
  trait UpdateTagOptionInput extends js.Object {
    var Id: TagOptionId
    var Active: js.UndefOr[TagOptionActive]
    var Value: js.UndefOr[TagOptionValue]
  }

  object UpdateTagOptionInput {
    def apply(
      Id: TagOptionId,
      Active: js.UndefOr[TagOptionActive] = js.undefined,
      Value: js.UndefOr[TagOptionValue] = js.undefined): UpdateTagOptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.asInstanceOf[js.Any],
        "Active" -> Active.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTagOptionInput]
    }
  }

  @js.native
  trait UpdateTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  object UpdateTagOptionOutput {
    def apply(
      TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined): UpdateTagOptionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagOptionDetail" -> TagOptionDetail.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTagOptionOutput]
    }
  }

  /**
   * <p>Additional information provided by the administrator.</p>
   */
  @js.native
  trait UsageInstruction extends js.Object {
    var Type: js.UndefOr[InstructionType]
    var Value: js.UndefOr[InstructionValue]
  }

  object UsageInstruction {
    def apply(
      Type: js.UndefOr[InstructionType] = js.undefined,
      Value: js.UndefOr[InstructionValue] = js.undefined): UsageInstruction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UsageInstruction]
    }
  }
}
