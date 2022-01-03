package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object servicecatalog {
  type AcceptLanguage = String
  type AccessLevelFilterValue = String
  type AccountId = String
  type AccountIds = js.Array[AccountId]
  type AddTags = js.Array[Tag]
  type AllowedValues = js.Array[String]
  type ApproximateCount = Int
  type AttributeValue = String
  type BudgetName = String
  type Budgets = js.Array[BudgetDetail]
  type CausingEntity = String
  type CloudWatchDashboardName = String
  type CloudWatchDashboards = js.Array[CloudWatchDashboard]
  type ConstraintDescription = String
  type ConstraintDetails = js.Array[ConstraintDetail]
  type ConstraintParameters = String
  type ConstraintSummaries = js.Array[ConstraintSummary]
  type ConstraintType = String
  type CopyOptions = js.Array[CopyOption]
  type CreatedTime = js.Date
  type CreationTime = js.Date
  type DefaultValue = String
  type Description = String
  type DisableTemplateValidation = Boolean
  type Error = String
  type ErrorCode = String
  type ErrorDescription = String
  type ExecutionParameterKey = String
  type ExecutionParameterMap = js.Dictionary[ExecutionParameterValueList]
  type ExecutionParameterType = String
  type ExecutionParameterValue = String
  type ExecutionParameterValueList = js.Array[ExecutionParameterValue]
  type ExecutionParameters = js.Array[ExecutionParameter]
  type FailedServiceActionAssociations = js.Array[FailedServiceActionAssociation]
  type HasDefaultPath = Boolean
  type Id = String
  type IdempotencyToken = String
  type IgnoreErrors = Boolean
  type InstructionType = String
  type InstructionValue = String
  type LastRequestId = String
  type LaunchPathSummaries = js.Array[LaunchPathSummary]
  type LaunchPaths = js.Array[LaunchPath]
  type LogicalResourceId = String
  type Message = String
  type Namespaces = js.Array[AccountId]
  type NoEcho = Boolean
  type NotificationArn = String
  type NotificationArns = js.Array[NotificationArn]
  type NullableBoolean = Boolean
  type OrganizationNodeValue = String
  type OrganizationNodes = js.Array[OrganizationNode]
  type OutputDescription = String
  type OutputKey = String
  type OutputKeys = js.Array[OutputKey]
  type OutputValue = String
  type Owner = String
  type PageSize = Int
  type PageSizeMax100 = Int
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
  type PortfolioShareDetails = js.Array[PortfolioShareDetail]
  type PrincipalARN = String
  type Principals = js.Array[Principal]
  type ProductArn = String
  type ProductViewAggregationType = String
  type ProductViewAggregationValues = js.Array[ProductViewAggregationValue]
  type ProductViewAggregations = js.Dictionary[ProductViewAggregationValues]
  type ProductViewDetails = js.Array[ProductViewDetail]
  type ProductViewDistributor = String
  type ProductViewFilterValue = String
  type ProductViewFilterValues = js.Array[ProductViewFilterValue]
  type ProductViewFilters = js.Dictionary[ProductViewFilterValues]
  type ProductViewName = String
  type ProductViewOwner = String
  type ProductViewShortDescription = String
  type ProductViewSummaries = js.Array[ProductViewSummary]
  type PropertyName = String
  type PropertyValue = String
  type ProviderName = String
  type ProvisionedProductAttributes = js.Array[ProvisionedProductAttribute]
  type ProvisionedProductDetails = js.Array[ProvisionedProductDetail]
  type ProvisionedProductFilters = js.Dictionary[ProvisionedProductViewFilterValues]
  type ProvisionedProductId = String
  type ProvisionedProductName = String
  type ProvisionedProductNameOrArn = String
  type ProvisionedProductPlanName = String
  type ProvisionedProductPlans = js.Array[ProvisionedProductPlanSummary]
  type ProvisionedProductProperties = js.Dictionary[PropertyValue]
  type ProvisionedProductStatusMessage = String
  type ProvisionedProductType = String
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
  type ProvisioningArtifactOutputKey = String
  type ProvisioningArtifactOutputs = js.Array[ProvisioningArtifactOutput]
  type ProvisioningArtifactParameters = js.Array[ProvisioningArtifactParameter]
  type ProvisioningArtifactPropertyValue = String
  type ProvisioningArtifactSummaries = js.Array[ProvisioningArtifactSummary]
  type ProvisioningArtifactViews = js.Array[ProvisioningArtifactView]
  type ProvisioningArtifacts = js.Array[ProvisioningArtifact]
  type ProvisioningParameters = js.Array[ProvisioningParameter]
  type RecordDetails = js.Array[RecordDetail]
  type RecordErrors = js.Array[RecordError]
  type RecordOutputs = js.Array[RecordOutput]
  type RecordTagKey = String
  type RecordTagValue = String
  type RecordTags = js.Array[RecordTag]
  type RecordType = String
  type Region = String
  type ResourceARN = String
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
  type RetainPhysicalResources = Boolean
  type RoleArn = String
  type Scope = js.Array[ResourceAttribute]
  type SearchFilterKey = String
  type SearchFilterValue = String
  type SearchProvisionedProductsPageSize = Int
  type ServiceActionAssociationErrorMessage = String
  type ServiceActionAssociations = js.Array[ServiceActionAssociation]
  type ServiceActionDefinitionMap = js.Dictionary[ServiceActionDefinitionValue]
  type ServiceActionDefinitionValue = String
  type ServiceActionDescription = String
  type ServiceActionName = String
  type ServiceActionSummaries = js.Array[ServiceActionSummary]
  type ShareErrors = js.Array[ShareError]
  type SortField = String
  type SourceProvisioningArtifactProperties = js.Array[SourceProvisioningArtifactPropertiesMap]
  type SourceProvisioningArtifactPropertiesMap = js.Dictionary[ProvisioningArtifactPropertyValue]
  type StackInstances = js.Array[StackInstance]
  type StackSetAccounts = js.Array[AccountId]
  type StackSetFailureToleranceCount = Int
  type StackSetFailureTolerancePercentage = Int
  type StackSetMaxConcurrencyCount = Int
  type StackSetMaxConcurrencyPercentage = Int
  type StackSetRegions = js.Array[Region]
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

  final class ServiceCatalogOps(private val service: ServiceCatalog) extends AnyVal {

    @inline def acceptPortfolioShareFuture(params: AcceptPortfolioShareInput): Future[AcceptPortfolioShareOutput] = service.acceptPortfolioShare(params).promise().toFuture
    @inline def associateBudgetWithResourceFuture(params: AssociateBudgetWithResourceInput): Future[AssociateBudgetWithResourceOutput] = service.associateBudgetWithResource(params).promise().toFuture
    @inline def associatePrincipalWithPortfolioFuture(params: AssociatePrincipalWithPortfolioInput): Future[AssociatePrincipalWithPortfolioOutput] = service.associatePrincipalWithPortfolio(params).promise().toFuture
    @inline def associateProductWithPortfolioFuture(params: AssociateProductWithPortfolioInput): Future[AssociateProductWithPortfolioOutput] = service.associateProductWithPortfolio(params).promise().toFuture
    @inline def associateServiceActionWithProvisioningArtifactFuture(params: AssociateServiceActionWithProvisioningArtifactInput): Future[AssociateServiceActionWithProvisioningArtifactOutput] = service.associateServiceActionWithProvisioningArtifact(params).promise().toFuture
    @inline def associateTagOptionWithResourceFuture(params: AssociateTagOptionWithResourceInput): Future[AssociateTagOptionWithResourceOutput] = service.associateTagOptionWithResource(params).promise().toFuture
    @inline def batchAssociateServiceActionWithProvisioningArtifactFuture(params: BatchAssociateServiceActionWithProvisioningArtifactInput): Future[BatchAssociateServiceActionWithProvisioningArtifactOutput] = service.batchAssociateServiceActionWithProvisioningArtifact(params).promise().toFuture
    @inline def batchDisassociateServiceActionFromProvisioningArtifactFuture(params: BatchDisassociateServiceActionFromProvisioningArtifactInput): Future[BatchDisassociateServiceActionFromProvisioningArtifactOutput] = service.batchDisassociateServiceActionFromProvisioningArtifact(params).promise().toFuture
    @inline def copyProductFuture(params: CopyProductInput): Future[CopyProductOutput] = service.copyProduct(params).promise().toFuture
    @inline def createConstraintFuture(params: CreateConstraintInput): Future[CreateConstraintOutput] = service.createConstraint(params).promise().toFuture
    @inline def createPortfolioFuture(params: CreatePortfolioInput): Future[CreatePortfolioOutput] = service.createPortfolio(params).promise().toFuture
    @inline def createPortfolioShareFuture(params: CreatePortfolioShareInput): Future[CreatePortfolioShareOutput] = service.createPortfolioShare(params).promise().toFuture
    @inline def createProductFuture(params: CreateProductInput): Future[CreateProductOutput] = service.createProduct(params).promise().toFuture
    @inline def createProvisionedProductPlanFuture(params: CreateProvisionedProductPlanInput): Future[CreateProvisionedProductPlanOutput] = service.createProvisionedProductPlan(params).promise().toFuture
    @inline def createProvisioningArtifactFuture(params: CreateProvisioningArtifactInput): Future[CreateProvisioningArtifactOutput] = service.createProvisioningArtifact(params).promise().toFuture
    @inline def createServiceActionFuture(params: CreateServiceActionInput): Future[CreateServiceActionOutput] = service.createServiceAction(params).promise().toFuture
    @inline def createTagOptionFuture(params: CreateTagOptionInput): Future[CreateTagOptionOutput] = service.createTagOption(params).promise().toFuture
    @inline def deleteConstraintFuture(params: DeleteConstraintInput): Future[DeleteConstraintOutput] = service.deleteConstraint(params).promise().toFuture
    @inline def deletePortfolioFuture(params: DeletePortfolioInput): Future[DeletePortfolioOutput] = service.deletePortfolio(params).promise().toFuture
    @inline def deletePortfolioShareFuture(params: DeletePortfolioShareInput): Future[DeletePortfolioShareOutput] = service.deletePortfolioShare(params).promise().toFuture
    @inline def deleteProductFuture(params: DeleteProductInput): Future[DeleteProductOutput] = service.deleteProduct(params).promise().toFuture
    @inline def deleteProvisionedProductPlanFuture(params: DeleteProvisionedProductPlanInput): Future[DeleteProvisionedProductPlanOutput] = service.deleteProvisionedProductPlan(params).promise().toFuture
    @inline def deleteProvisioningArtifactFuture(params: DeleteProvisioningArtifactInput): Future[DeleteProvisioningArtifactOutput] = service.deleteProvisioningArtifact(params).promise().toFuture
    @inline def deleteServiceActionFuture(params: DeleteServiceActionInput): Future[DeleteServiceActionOutput] = service.deleteServiceAction(params).promise().toFuture
    @inline def deleteTagOptionFuture(params: DeleteTagOptionInput): Future[DeleteTagOptionOutput] = service.deleteTagOption(params).promise().toFuture
    @inline def describeConstraintFuture(params: DescribeConstraintInput): Future[DescribeConstraintOutput] = service.describeConstraint(params).promise().toFuture
    @inline def describeCopyProductStatusFuture(params: DescribeCopyProductStatusInput): Future[DescribeCopyProductStatusOutput] = service.describeCopyProductStatus(params).promise().toFuture
    @inline def describePortfolioFuture(params: DescribePortfolioInput): Future[DescribePortfolioOutput] = service.describePortfolio(params).promise().toFuture
    @inline def describePortfolioShareStatusFuture(params: DescribePortfolioShareStatusInput): Future[DescribePortfolioShareStatusOutput] = service.describePortfolioShareStatus(params).promise().toFuture
    @inline def describePortfolioSharesFuture(params: DescribePortfolioSharesInput): Future[DescribePortfolioSharesOutput] = service.describePortfolioShares(params).promise().toFuture
    @inline def describeProductAsAdminFuture(params: DescribeProductAsAdminInput): Future[DescribeProductAsAdminOutput] = service.describeProductAsAdmin(params).promise().toFuture
    @inline def describeProductFuture(params: DescribeProductInput): Future[DescribeProductOutput] = service.describeProduct(params).promise().toFuture
    @inline def describeProductViewFuture(params: DescribeProductViewInput): Future[DescribeProductViewOutput] = service.describeProductView(params).promise().toFuture
    @inline def describeProvisionedProductFuture(params: DescribeProvisionedProductInput): Future[DescribeProvisionedProductOutput] = service.describeProvisionedProduct(params).promise().toFuture
    @inline def describeProvisionedProductPlanFuture(params: DescribeProvisionedProductPlanInput): Future[DescribeProvisionedProductPlanOutput] = service.describeProvisionedProductPlan(params).promise().toFuture
    @inline def describeProvisioningArtifactFuture(params: DescribeProvisioningArtifactInput): Future[DescribeProvisioningArtifactOutput] = service.describeProvisioningArtifact(params).promise().toFuture
    @inline def describeProvisioningParametersFuture(params: DescribeProvisioningParametersInput): Future[DescribeProvisioningParametersOutput] = service.describeProvisioningParameters(params).promise().toFuture
    @inline def describeRecordFuture(params: DescribeRecordInput): Future[DescribeRecordOutput] = service.describeRecord(params).promise().toFuture
    @inline def describeServiceActionExecutionParametersFuture(params: DescribeServiceActionExecutionParametersInput): Future[DescribeServiceActionExecutionParametersOutput] = service.describeServiceActionExecutionParameters(params).promise().toFuture
    @inline def describeServiceActionFuture(params: DescribeServiceActionInput): Future[DescribeServiceActionOutput] = service.describeServiceAction(params).promise().toFuture
    @inline def describeTagOptionFuture(params: DescribeTagOptionInput): Future[DescribeTagOptionOutput] = service.describeTagOption(params).promise().toFuture
    @inline def disableAWSOrganizationsAccessFuture(params: DisableAWSOrganizationsAccessInput): Future[DisableAWSOrganizationsAccessOutput] = service.disableAWSOrganizationsAccess(params).promise().toFuture
    @inline def disassociateBudgetFromResourceFuture(params: DisassociateBudgetFromResourceInput): Future[DisassociateBudgetFromResourceOutput] = service.disassociateBudgetFromResource(params).promise().toFuture
    @inline def disassociatePrincipalFromPortfolioFuture(params: DisassociatePrincipalFromPortfolioInput): Future[DisassociatePrincipalFromPortfolioOutput] = service.disassociatePrincipalFromPortfolio(params).promise().toFuture
    @inline def disassociateProductFromPortfolioFuture(params: DisassociateProductFromPortfolioInput): Future[DisassociateProductFromPortfolioOutput] = service.disassociateProductFromPortfolio(params).promise().toFuture
    @inline def disassociateServiceActionFromProvisioningArtifactFuture(params: DisassociateServiceActionFromProvisioningArtifactInput): Future[DisassociateServiceActionFromProvisioningArtifactOutput] = service.disassociateServiceActionFromProvisioningArtifact(params).promise().toFuture
    @inline def disassociateTagOptionFromResourceFuture(params: DisassociateTagOptionFromResourceInput): Future[DisassociateTagOptionFromResourceOutput] = service.disassociateTagOptionFromResource(params).promise().toFuture
    @inline def enableAWSOrganizationsAccessFuture(params: EnableAWSOrganizationsAccessInput): Future[EnableAWSOrganizationsAccessOutput] = service.enableAWSOrganizationsAccess(params).promise().toFuture
    @inline def executeProvisionedProductPlanFuture(params: ExecuteProvisionedProductPlanInput): Future[ExecuteProvisionedProductPlanOutput] = service.executeProvisionedProductPlan(params).promise().toFuture
    @inline def executeProvisionedProductServiceActionFuture(params: ExecuteProvisionedProductServiceActionInput): Future[ExecuteProvisionedProductServiceActionOutput] = service.executeProvisionedProductServiceAction(params).promise().toFuture
    @inline def getAWSOrganizationsAccessStatusFuture(params: GetAWSOrganizationsAccessStatusInput): Future[GetAWSOrganizationsAccessStatusOutput] = service.getAWSOrganizationsAccessStatus(params).promise().toFuture
    @inline def getProvisionedProductOutputsFuture(params: GetProvisionedProductOutputsInput): Future[GetProvisionedProductOutputsOutput] = service.getProvisionedProductOutputs(params).promise().toFuture
    @inline def importAsProvisionedProductFuture(params: ImportAsProvisionedProductInput): Future[ImportAsProvisionedProductOutput] = service.importAsProvisionedProduct(params).promise().toFuture
    @inline def listAcceptedPortfolioSharesFuture(params: ListAcceptedPortfolioSharesInput): Future[ListAcceptedPortfolioSharesOutput] = service.listAcceptedPortfolioShares(params).promise().toFuture
    @inline def listBudgetsForResourceFuture(params: ListBudgetsForResourceInput): Future[ListBudgetsForResourceOutput] = service.listBudgetsForResource(params).promise().toFuture
    @inline def listConstraintsForPortfolioFuture(params: ListConstraintsForPortfolioInput): Future[ListConstraintsForPortfolioOutput] = service.listConstraintsForPortfolio(params).promise().toFuture
    @inline def listLaunchPathsFuture(params: ListLaunchPathsInput): Future[ListLaunchPathsOutput] = service.listLaunchPaths(params).promise().toFuture
    @inline def listOrganizationPortfolioAccessFuture(params: ListOrganizationPortfolioAccessInput): Future[ListOrganizationPortfolioAccessOutput] = service.listOrganizationPortfolioAccess(params).promise().toFuture
    @inline def listPortfolioAccessFuture(params: ListPortfolioAccessInput): Future[ListPortfolioAccessOutput] = service.listPortfolioAccess(params).promise().toFuture
    @inline def listPortfoliosForProductFuture(params: ListPortfoliosForProductInput): Future[ListPortfoliosForProductOutput] = service.listPortfoliosForProduct(params).promise().toFuture
    @inline def listPortfoliosFuture(params: ListPortfoliosInput): Future[ListPortfoliosOutput] = service.listPortfolios(params).promise().toFuture
    @inline def listPrincipalsForPortfolioFuture(params: ListPrincipalsForPortfolioInput): Future[ListPrincipalsForPortfolioOutput] = service.listPrincipalsForPortfolio(params).promise().toFuture
    @inline def listProvisionedProductPlansFuture(params: ListProvisionedProductPlansInput): Future[ListProvisionedProductPlansOutput] = service.listProvisionedProductPlans(params).promise().toFuture
    @inline def listProvisioningArtifactsForServiceActionFuture(params: ListProvisioningArtifactsForServiceActionInput): Future[ListProvisioningArtifactsForServiceActionOutput] = service.listProvisioningArtifactsForServiceAction(params).promise().toFuture
    @inline def listProvisioningArtifactsFuture(params: ListProvisioningArtifactsInput): Future[ListProvisioningArtifactsOutput] = service.listProvisioningArtifacts(params).promise().toFuture
    @inline def listRecordHistoryFuture(params: ListRecordHistoryInput): Future[ListRecordHistoryOutput] = service.listRecordHistory(params).promise().toFuture
    @inline def listResourcesForTagOptionFuture(params: ListResourcesForTagOptionInput): Future[ListResourcesForTagOptionOutput] = service.listResourcesForTagOption(params).promise().toFuture
    @inline def listServiceActionsForProvisioningArtifactFuture(params: ListServiceActionsForProvisioningArtifactInput): Future[ListServiceActionsForProvisioningArtifactOutput] = service.listServiceActionsForProvisioningArtifact(params).promise().toFuture
    @inline def listServiceActionsFuture(params: ListServiceActionsInput): Future[ListServiceActionsOutput] = service.listServiceActions(params).promise().toFuture
    @inline def listStackInstancesForProvisionedProductFuture(params: ListStackInstancesForProvisionedProductInput): Future[ListStackInstancesForProvisionedProductOutput] = service.listStackInstancesForProvisionedProduct(params).promise().toFuture
    @inline def listTagOptionsFuture(params: ListTagOptionsInput): Future[ListTagOptionsOutput] = service.listTagOptions(params).promise().toFuture
    @inline def provisionProductFuture(params: ProvisionProductInput): Future[ProvisionProductOutput] = service.provisionProduct(params).promise().toFuture
    @inline def rejectPortfolioShareFuture(params: RejectPortfolioShareInput): Future[RejectPortfolioShareOutput] = service.rejectPortfolioShare(params).promise().toFuture
    @inline def scanProvisionedProductsFuture(params: ScanProvisionedProductsInput): Future[ScanProvisionedProductsOutput] = service.scanProvisionedProducts(params).promise().toFuture
    @inline def searchProductsAsAdminFuture(params: SearchProductsAsAdminInput): Future[SearchProductsAsAdminOutput] = service.searchProductsAsAdmin(params).promise().toFuture
    @inline def searchProductsFuture(params: SearchProductsInput): Future[SearchProductsOutput] = service.searchProducts(params).promise().toFuture
    @inline def searchProvisionedProductsFuture(params: SearchProvisionedProductsInput): Future[SearchProvisionedProductsOutput] = service.searchProvisionedProducts(params).promise().toFuture
    @inline def terminateProvisionedProductFuture(params: TerminateProvisionedProductInput): Future[TerminateProvisionedProductOutput] = service.terminateProvisionedProduct(params).promise().toFuture
    @inline def updateConstraintFuture(params: UpdateConstraintInput): Future[UpdateConstraintOutput] = service.updateConstraint(params).promise().toFuture
    @inline def updatePortfolioFuture(params: UpdatePortfolioInput): Future[UpdatePortfolioOutput] = service.updatePortfolio(params).promise().toFuture
    @inline def updatePortfolioShareFuture(params: UpdatePortfolioShareInput): Future[UpdatePortfolioShareOutput] = service.updatePortfolioShare(params).promise().toFuture
    @inline def updateProductFuture(params: UpdateProductInput): Future[UpdateProductOutput] = service.updateProduct(params).promise().toFuture
    @inline def updateProvisionedProductFuture(params: UpdateProvisionedProductInput): Future[UpdateProvisionedProductOutput] = service.updateProvisionedProduct(params).promise().toFuture
    @inline def updateProvisionedProductPropertiesFuture(params: UpdateProvisionedProductPropertiesInput): Future[UpdateProvisionedProductPropertiesOutput] = service.updateProvisionedProductProperties(params).promise().toFuture
    @inline def updateProvisioningArtifactFuture(params: UpdateProvisioningArtifactInput): Future[UpdateProvisioningArtifactOutput] = service.updateProvisioningArtifact(params).promise().toFuture
    @inline def updateServiceActionFuture(params: UpdateServiceActionInput): Future[UpdateServiceActionOutput] = service.updateServiceAction(params).promise().toFuture
    @inline def updateTagOptionFuture(params: UpdateTagOptionInput): Future[UpdateTagOptionOutput] = service.updateTagOption(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/servicecatalog", JSImport.Namespace, "AWS.ServiceCatalog")
  class ServiceCatalog() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptPortfolioShare(params: AcceptPortfolioShareInput): Request[AcceptPortfolioShareOutput] = js.native
    def associateBudgetWithResource(params: AssociateBudgetWithResourceInput): Request[AssociateBudgetWithResourceOutput] = js.native
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
    def describePortfolioShares(params: DescribePortfolioSharesInput): Request[DescribePortfolioSharesOutput] = js.native
    def describeProduct(params: DescribeProductInput): Request[DescribeProductOutput] = js.native
    def describeProductAsAdmin(params: DescribeProductAsAdminInput): Request[DescribeProductAsAdminOutput] = js.native
    def describeProductView(params: DescribeProductViewInput): Request[DescribeProductViewOutput] = js.native
    def describeProvisionedProduct(params: DescribeProvisionedProductInput): Request[DescribeProvisionedProductOutput] = js.native
    def describeProvisionedProductPlan(params: DescribeProvisionedProductPlanInput): Request[DescribeProvisionedProductPlanOutput] = js.native
    def describeProvisioningArtifact(params: DescribeProvisioningArtifactInput): Request[DescribeProvisioningArtifactOutput] = js.native
    def describeProvisioningParameters(params: DescribeProvisioningParametersInput): Request[DescribeProvisioningParametersOutput] = js.native
    def describeRecord(params: DescribeRecordInput): Request[DescribeRecordOutput] = js.native
    def describeServiceAction(params: DescribeServiceActionInput): Request[DescribeServiceActionOutput] = js.native
    def describeServiceActionExecutionParameters(params: DescribeServiceActionExecutionParametersInput): Request[DescribeServiceActionExecutionParametersOutput] = js.native
    def describeTagOption(params: DescribeTagOptionInput): Request[DescribeTagOptionOutput] = js.native
    def disableAWSOrganizationsAccess(params: DisableAWSOrganizationsAccessInput): Request[DisableAWSOrganizationsAccessOutput] = js.native
    def disassociateBudgetFromResource(params: DisassociateBudgetFromResourceInput): Request[DisassociateBudgetFromResourceOutput] = js.native
    def disassociatePrincipalFromPortfolio(params: DisassociatePrincipalFromPortfolioInput): Request[DisassociatePrincipalFromPortfolioOutput] = js.native
    def disassociateProductFromPortfolio(params: DisassociateProductFromPortfolioInput): Request[DisassociateProductFromPortfolioOutput] = js.native
    def disassociateServiceActionFromProvisioningArtifact(params: DisassociateServiceActionFromProvisioningArtifactInput): Request[DisassociateServiceActionFromProvisioningArtifactOutput] = js.native
    def disassociateTagOptionFromResource(params: DisassociateTagOptionFromResourceInput): Request[DisassociateTagOptionFromResourceOutput] = js.native
    def enableAWSOrganizationsAccess(params: EnableAWSOrganizationsAccessInput): Request[EnableAWSOrganizationsAccessOutput] = js.native
    def executeProvisionedProductPlan(params: ExecuteProvisionedProductPlanInput): Request[ExecuteProvisionedProductPlanOutput] = js.native
    def executeProvisionedProductServiceAction(params: ExecuteProvisionedProductServiceActionInput): Request[ExecuteProvisionedProductServiceActionOutput] = js.native
    def getAWSOrganizationsAccessStatus(params: GetAWSOrganizationsAccessStatusInput): Request[GetAWSOrganizationsAccessStatusOutput] = js.native
    def getProvisionedProductOutputs(params: GetProvisionedProductOutputsInput): Request[GetProvisionedProductOutputsOutput] = js.native
    def importAsProvisionedProduct(params: ImportAsProvisionedProductInput): Request[ImportAsProvisionedProductOutput] = js.native
    def listAcceptedPortfolioShares(params: ListAcceptedPortfolioSharesInput): Request[ListAcceptedPortfolioSharesOutput] = js.native
    def listBudgetsForResource(params: ListBudgetsForResourceInput): Request[ListBudgetsForResourceOutput] = js.native
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
    def listStackInstancesForProvisionedProduct(params: ListStackInstancesForProvisionedProductInput): Request[ListStackInstancesForProvisionedProductOutput] = js.native
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
    def updatePortfolioShare(params: UpdatePortfolioShareInput): Request[UpdatePortfolioShareOutput] = js.native
    def updateProduct(params: UpdateProductInput): Request[UpdateProductOutput] = js.native
    def updateProvisionedProduct(params: UpdateProvisionedProductInput): Request[UpdateProvisionedProductOutput] = js.native
    def updateProvisionedProductProperties(params: UpdateProvisionedProductPropertiesInput): Request[UpdateProvisionedProductPropertiesOutput] = js.native
    def updateProvisioningArtifact(params: UpdateProvisioningArtifactInput): Request[UpdateProvisioningArtifactOutput] = js.native
    def updateServiceAction(params: UpdateServiceActionInput): Request[UpdateServiceActionOutput] = js.native
    def updateTagOption(params: UpdateTagOptionInput): Request[UpdateTagOptionOutput] = js.native
  }
  object ServiceCatalog {
    @inline implicit def toOps(service: ServiceCatalog): ServiceCatalogOps = {
      new ServiceCatalogOps(service)
    }
  }

  @js.native
  trait AcceptPortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  object AcceptPortfolioShareInput {
    @inline
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
    ): AcceptPortfolioShareInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PortfolioShareType.foreach(__v => __obj.updateDynamic("PortfolioShareType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceptPortfolioShareInput]
    }
  }

  @js.native
  trait AcceptPortfolioShareOutput extends js.Object

  object AcceptPortfolioShareOutput {
    @inline
    def apply(): AcceptPortfolioShareOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptPortfolioShareOutput]
    }
  }

  /** The access level to use to filter results.
    */
  @js.native
  trait AccessLevelFilter extends js.Object {
    var Key: js.UndefOr[AccessLevelFilterKey]
    var Value: js.UndefOr[AccessLevelFilterValue]
  }

  object AccessLevelFilter {
    @inline
    def apply(
        Key: js.UndefOr[AccessLevelFilterKey] = js.undefined,
        Value: js.UndefOr[AccessLevelFilterValue] = js.undefined
    ): AccessLevelFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessLevelFilter]
    }
  }

  @js.native
  trait AssociateBudgetWithResourceInput extends js.Object {
    var BudgetName: BudgetName
    var ResourceId: Id
  }

  object AssociateBudgetWithResourceInput {
    @inline
    def apply(
        BudgetName: BudgetName,
        ResourceId: Id
    ): AssociateBudgetWithResourceInput = {
      val __obj = js.Dynamic.literal(
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateBudgetWithResourceInput]
    }
  }

  @js.native
  trait AssociateBudgetWithResourceOutput extends js.Object

  object AssociateBudgetWithResourceOutput {
    @inline
    def apply(): AssociateBudgetWithResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateBudgetWithResourceOutput]
    }
  }

  @js.native
  trait AssociatePrincipalWithPortfolioInput extends js.Object {
    var PortfolioId: Id
    var PrincipalARN: PrincipalARN
    var PrincipalType: PrincipalType
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object AssociatePrincipalWithPortfolioInput {
    @inline
    def apply(
        PortfolioId: Id,
        PrincipalARN: PrincipalARN,
        PrincipalType: PrincipalType,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): AssociatePrincipalWithPortfolioInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "PrincipalARN" -> PrincipalARN.asInstanceOf[js.Any],
        "PrincipalType" -> PrincipalType.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePrincipalWithPortfolioInput]
    }
  }

  @js.native
  trait AssociatePrincipalWithPortfolioOutput extends js.Object

  object AssociatePrincipalWithPortfolioOutput {
    @inline
    def apply(): AssociatePrincipalWithPortfolioOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociatePrincipalWithPortfolioOutput]
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
    @inline
    def apply(
        PortfolioId: Id,
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        SourcePortfolioId: js.UndefOr[Id] = js.undefined
    ): AssociateProductWithPortfolioInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      SourcePortfolioId.foreach(__v => __obj.updateDynamic("SourcePortfolioId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateProductWithPortfolioInput]
    }
  }

  @js.native
  trait AssociateProductWithPortfolioOutput extends js.Object

  object AssociateProductWithPortfolioOutput {
    @inline
    def apply(): AssociateProductWithPortfolioOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateProductWithPortfolioOutput]
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
    @inline
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        ServiceActionId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): AssociateServiceActionWithProvisioningArtifactInput = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateServiceActionWithProvisioningArtifactInput]
    }
  }

  @js.native
  trait AssociateServiceActionWithProvisioningArtifactOutput extends js.Object

  object AssociateServiceActionWithProvisioningArtifactOutput {
    @inline
    def apply(): AssociateServiceActionWithProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateServiceActionWithProvisioningArtifactOutput]
    }
  }

  @js.native
  trait AssociateTagOptionWithResourceInput extends js.Object {
    var ResourceId: ResourceId
    var TagOptionId: TagOptionId
  }

  object AssociateTagOptionWithResourceInput {
    @inline
    def apply(
        ResourceId: ResourceId,
        TagOptionId: TagOptionId
    ): AssociateTagOptionWithResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagOptionId" -> TagOptionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateTagOptionWithResourceInput]
    }
  }

  @js.native
  trait AssociateTagOptionWithResourceOutput extends js.Object

  object AssociateTagOptionWithResourceOutput {
    @inline
    def apply(): AssociateTagOptionWithResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateTagOptionWithResourceOutput]
    }
  }

  @js.native
  trait BatchAssociateServiceActionWithProvisioningArtifactInput extends js.Object {
    var ServiceActionAssociations: ServiceActionAssociations
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object BatchAssociateServiceActionWithProvisioningArtifactInput {
    @inline
    def apply(
        ServiceActionAssociations: ServiceActionAssociations,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): BatchAssociateServiceActionWithProvisioningArtifactInput = {
      val __obj = js.Dynamic.literal(
        "ServiceActionAssociations" -> ServiceActionAssociations.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactInput]
    }
  }

  @js.native
  trait BatchAssociateServiceActionWithProvisioningArtifactOutput extends js.Object {
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations]
  }

  object BatchAssociateServiceActionWithProvisioningArtifactOutput {
    @inline
    def apply(
        FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations] = js.undefined
    ): BatchAssociateServiceActionWithProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      FailedServiceActionAssociations.foreach(__v => __obj.updateDynamic("FailedServiceActionAssociations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactOutput]
    }
  }

  @js.native
  trait BatchDisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
    var ServiceActionAssociations: ServiceActionAssociations
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object BatchDisassociateServiceActionFromProvisioningArtifactInput {
    @inline
    def apply(
        ServiceActionAssociations: ServiceActionAssociations,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): BatchDisassociateServiceActionFromProvisioningArtifactInput = {
      val __obj = js.Dynamic.literal(
        "ServiceActionAssociations" -> ServiceActionAssociations.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactInput]
    }
  }

  @js.native
  trait BatchDisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations]
  }

  object BatchDisassociateServiceActionFromProvisioningArtifactOutput {
    @inline
    def apply(
        FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations] = js.undefined
    ): BatchDisassociateServiceActionFromProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      FailedServiceActionAssociations.foreach(__v => __obj.updateDynamic("FailedServiceActionAssociations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactOutput]
    }
  }

  /** Information about a budget.
    */
  @js.native
  trait BudgetDetail extends js.Object {
    var BudgetName: js.UndefOr[BudgetName]
  }

  object BudgetDetail {
    @inline
    def apply(
        BudgetName: js.UndefOr[BudgetName] = js.undefined
    ): BudgetDetail = {
      val __obj = js.Dynamic.literal()
      BudgetName.foreach(__v => __obj.updateDynamic("BudgetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BudgetDetail]
    }
  }

  /** Information about a CloudWatch dashboard.
    */
  @js.native
  trait CloudWatchDashboard extends js.Object {
    var Name: js.UndefOr[CloudWatchDashboardName]
  }

  object CloudWatchDashboard {
    @inline
    def apply(
        Name: js.UndefOr[CloudWatchDashboardName] = js.undefined
    ): CloudWatchDashboard = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchDashboard]
    }
  }

  /** Information about a constraint.
    */
  @js.native
  trait ConstraintDetail extends js.Object {
    var ConstraintId: js.UndefOr[Id]
    var Description: js.UndefOr[ConstraintDescription]
    var Owner: js.UndefOr[AccountId]
    var PortfolioId: js.UndefOr[Id]
    var ProductId: js.UndefOr[Id]
    var Type: js.UndefOr[ConstraintType]
  }

  object ConstraintDetail {
    @inline
    def apply(
        ConstraintId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[ConstraintDescription] = js.undefined,
        Owner: js.UndefOr[AccountId] = js.undefined,
        PortfolioId: js.UndefOr[Id] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        Type: js.UndefOr[ConstraintType] = js.undefined
    ): ConstraintDetail = {
      val __obj = js.Dynamic.literal()
      ConstraintId.foreach(__v => __obj.updateDynamic("ConstraintId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      PortfolioId.foreach(__v => __obj.updateDynamic("PortfolioId")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConstraintDetail]
    }
  }

  /** Summary information about a constraint.
    */
  @js.native
  trait ConstraintSummary extends js.Object {
    var Description: js.UndefOr[ConstraintDescription]
    var Type: js.UndefOr[ConstraintType]
  }

  object ConstraintSummary {
    @inline
    def apply(
        Description: js.UndefOr[ConstraintDescription] = js.undefined,
        Type: js.UndefOr[ConstraintType] = js.undefined
    ): ConstraintSummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConstraintSummary]
    }
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
    @inline
    def apply(
        IdempotencyToken: IdempotencyToken,
        SourceProductArn: ProductArn,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        CopyOptions: js.UndefOr[CopyOptions] = js.undefined,
        SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties] = js.undefined,
        TargetProductId: js.UndefOr[Id] = js.undefined,
        TargetProductName: js.UndefOr[ProductViewName] = js.undefined
    ): CopyProductInput = {
      val __obj = js.Dynamic.literal(
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "SourceProductArn" -> SourceProductArn.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      CopyOptions.foreach(__v => __obj.updateDynamic("CopyOptions")(__v.asInstanceOf[js.Any]))
      SourceProvisioningArtifactIdentifiers.foreach(__v => __obj.updateDynamic("SourceProvisioningArtifactIdentifiers")(__v.asInstanceOf[js.Any]))
      TargetProductId.foreach(__v => __obj.updateDynamic("TargetProductId")(__v.asInstanceOf[js.Any]))
      TargetProductName.foreach(__v => __obj.updateDynamic("TargetProductName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyProductInput]
    }
  }

  @js.native
  trait CopyProductOutput extends js.Object {
    var CopyProductToken: js.UndefOr[Id]
  }

  object CopyProductOutput {
    @inline
    def apply(
        CopyProductToken: js.UndefOr[Id] = js.undefined
    ): CopyProductOutput = {
      val __obj = js.Dynamic.literal()
      CopyProductToken.foreach(__v => __obj.updateDynamic("CopyProductToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CopyProductOutput]
    }
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
    @inline
    def apply(
        IdempotencyToken: IdempotencyToken,
        Parameters: ConstraintParameters,
        PortfolioId: Id,
        ProductId: Id,
        Type: ConstraintType,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Description: js.UndefOr[ConstraintDescription] = js.undefined
    ): CreateConstraintInput = {
      val __obj = js.Dynamic.literal(
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Parameters" -> Parameters.asInstanceOf[js.Any],
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConstraintInput]
    }
  }

  @js.native
  trait CreateConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  object CreateConstraintOutput {
    @inline
    def apply(
        ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined,
        ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): CreateConstraintOutput = {
      val __obj = js.Dynamic.literal()
      ConstraintDetail.foreach(__v => __obj.updateDynamic("ConstraintDetail")(__v.asInstanceOf[js.Any]))
      ConstraintParameters.foreach(__v => __obj.updateDynamic("ConstraintParameters")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConstraintOutput]
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
    @inline
    def apply(
        DisplayName: PortfolioDisplayName,
        IdempotencyToken: IdempotencyToken,
        ProviderName: ProviderName,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Description: js.UndefOr[PortfolioDescription] = js.undefined,
        Tags: js.UndefOr[AddTags] = js.undefined
    ): CreatePortfolioInput = {
      val __obj = js.Dynamic.literal(
        "DisplayName" -> DisplayName.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "ProviderName" -> ProviderName.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortfolioInput]
    }
  }

  @js.native
  trait CreatePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var Tags: js.UndefOr[Tags]
  }

  object CreatePortfolioOutput {
    @inline
    def apply(
        PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreatePortfolioOutput = {
      val __obj = js.Dynamic.literal()
      PortfolioDetail.foreach(__v => __obj.updateDynamic("PortfolioDetail")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortfolioOutput]
    }
  }

  @js.native
  trait CreatePortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccountId: js.UndefOr[AccountId]
    var OrganizationNode: js.UndefOr[OrganizationNode]
    var ShareTagOptions: js.UndefOr[Boolean]
  }

  object CreatePortfolioShareInput {
    @inline
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined,
        ShareTagOptions: js.UndefOr[Boolean] = js.undefined
    ): CreatePortfolioShareInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      OrganizationNode.foreach(__v => __obj.updateDynamic("OrganizationNode")(__v.asInstanceOf[js.Any]))
      ShareTagOptions.foreach(__v => __obj.updateDynamic("ShareTagOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortfolioShareInput]
    }
  }

  @js.native
  trait CreatePortfolioShareOutput extends js.Object {
    var PortfolioShareToken: js.UndefOr[Id]
  }

  object CreatePortfolioShareOutput {
    @inline
    def apply(
        PortfolioShareToken: js.UndefOr[Id] = js.undefined
    ): CreatePortfolioShareOutput = {
      val __obj = js.Dynamic.literal()
      PortfolioShareToken.foreach(__v => __obj.updateDynamic("PortfolioShareToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortfolioShareOutput]
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
    @inline
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
        Tags: js.UndefOr[AddTags] = js.undefined
    ): CreateProductInput = {
      val __obj = js.Dynamic.literal(
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Owner" -> Owner.asInstanceOf[js.Any],
        "ProductType" -> ProductType.asInstanceOf[js.Any],
        "ProvisioningArtifactParameters" -> ProvisioningArtifactParameters.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Distributor.foreach(__v => __obj.updateDynamic("Distributor")(__v.asInstanceOf[js.Any]))
      SupportDescription.foreach(__v => __obj.updateDynamic("SupportDescription")(__v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.updateDynamic("SupportEmail")(__v.asInstanceOf[js.Any]))
      SupportUrl.foreach(__v => __obj.updateDynamic("SupportUrl")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProductInput]
    }
  }

  @js.native
  trait CreateProductOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Tags: js.UndefOr[Tags]
  }

  object CreateProductOutput {
    @inline
    def apply(
        ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined,
        ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateProductOutput = {
      val __obj = js.Dynamic.literal()
      ProductViewDetail.foreach(__v => __obj.updateDynamic("ProductViewDetail")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetail.foreach(__v => __obj.updateDynamic("ProvisioningArtifactDetail")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProductOutput]
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
    @inline
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
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateProvisionedProductPlanInput = {
      val __obj = js.Dynamic.literal(
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "PlanName" -> PlanName.asInstanceOf[js.Any],
        "PlanType" -> PlanType.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisionedProductName" -> ProvisionedProductName.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      NotificationArns.foreach(__v => __obj.updateDynamic("NotificationArns")(__v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.updateDynamic("PathId")(__v.asInstanceOf[js.Any]))
      ProvisioningParameters.foreach(__v => __obj.updateDynamic("ProvisioningParameters")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisionedProductPlanInput]
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
    @inline
    def apply(
        PlanId: js.UndefOr[Id] = js.undefined,
        PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined,
        ProvisionProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    ): CreateProvisionedProductPlanOutput = {
      val __obj = js.Dynamic.literal()
      PlanId.foreach(__v => __obj.updateDynamic("PlanId")(__v.asInstanceOf[js.Any]))
      PlanName.foreach(__v => __obj.updateDynamic("PlanName")(__v.asInstanceOf[js.Any]))
      ProvisionProductId.foreach(__v => __obj.updateDynamic("ProvisionProductId")(__v.asInstanceOf[js.Any]))
      ProvisionedProductName.foreach(__v => __obj.updateDynamic("ProvisionedProductName")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisionedProductPlanOutput]
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
    @inline
    def apply(
        IdempotencyToken: IdempotencyToken,
        Parameters: ProvisioningArtifactProperties,
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): CreateProvisioningArtifactInput = {
      val __obj = js.Dynamic.literal(
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Parameters" -> Parameters.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisioningArtifactInput]
    }
  }

  @js.native
  trait CreateProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  object CreateProvisioningArtifactOutput {
    @inline
    def apply(
        Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined,
        ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): CreateProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      Info.foreach(__v => __obj.updateDynamic("Info")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetail.foreach(__v => __obj.updateDynamic("ProvisioningArtifactDetail")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProvisioningArtifactOutput]
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
    @inline
    def apply(
        Definition: ServiceActionDefinitionMap,
        DefinitionType: ServiceActionDefinitionType,
        IdempotencyToken: IdempotencyToken,
        Name: ServiceActionName,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Description: js.UndefOr[ServiceActionDescription] = js.undefined
    ): CreateServiceActionInput = {
      val __obj = js.Dynamic.literal(
        "Definition" -> Definition.asInstanceOf[js.Any],
        "DefinitionType" -> DefinitionType.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceActionInput]
    }
  }

  @js.native
  trait CreateServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  object CreateServiceActionOutput {
    @inline
    def apply(
        ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
    ): CreateServiceActionOutput = {
      val __obj = js.Dynamic.literal()
      ServiceActionDetail.foreach(__v => __obj.updateDynamic("ServiceActionDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceActionOutput]
    }
  }

  @js.native
  trait CreateTagOptionInput extends js.Object {
    var Key: TagOptionKey
    var Value: TagOptionValue
  }

  object CreateTagOptionInput {
    @inline
    def apply(
        Key: TagOptionKey,
        Value: TagOptionValue
    ): CreateTagOptionInput = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTagOptionInput]
    }
  }

  @js.native
  trait CreateTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  object CreateTagOptionOutput {
    @inline
    def apply(
        TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined
    ): CreateTagOptionOutput = {
      val __obj = js.Dynamic.literal()
      TagOptionDetail.foreach(__v => __obj.updateDynamic("TagOptionDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTagOptionOutput]
    }
  }

  @js.native
  trait DeleteConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteConstraintInput {
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeleteConstraintInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConstraintInput]
    }
  }

  @js.native
  trait DeleteConstraintOutput extends js.Object

  object DeleteConstraintOutput {
    @inline
    def apply(): DeleteConstraintOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteConstraintOutput]
    }
  }

  @js.native
  trait DeletePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeletePortfolioInput {
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeletePortfolioInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePortfolioInput]
    }
  }

  @js.native
  trait DeletePortfolioOutput extends js.Object

  object DeletePortfolioOutput {
    @inline
    def apply(): DeletePortfolioOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePortfolioOutput]
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
    @inline
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined
    ): DeletePortfolioShareInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      OrganizationNode.foreach(__v => __obj.updateDynamic("OrganizationNode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePortfolioShareInput]
    }
  }

  @js.native
  trait DeletePortfolioShareOutput extends js.Object {
    var PortfolioShareToken: js.UndefOr[Id]
  }

  object DeletePortfolioShareOutput {
    @inline
    def apply(
        PortfolioShareToken: js.UndefOr[Id] = js.undefined
    ): DeletePortfolioShareOutput = {
      val __obj = js.Dynamic.literal()
      PortfolioShareToken.foreach(__v => __obj.updateDynamic("PortfolioShareToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePortfolioShareOutput]
    }
  }

  @js.native
  trait DeleteProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteProductInput {
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeleteProductInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProductInput]
    }
  }

  @js.native
  trait DeleteProductOutput extends js.Object

  object DeleteProductOutput {
    @inline
    def apply(): DeleteProductOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProductOutput]
    }
  }

  @js.native
  trait DeleteProvisionedProductPlanInput extends js.Object {
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var IgnoreErrors: js.UndefOr[IgnoreErrors]
  }

  object DeleteProvisionedProductPlanInput {
    @inline
    def apply(
        PlanId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined
    ): DeleteProvisionedProductPlanInput = {
      val __obj = js.Dynamic.literal(
        "PlanId" -> PlanId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      IgnoreErrors.foreach(__v => __obj.updateDynamic("IgnoreErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProvisionedProductPlanInput]
    }
  }

  @js.native
  trait DeleteProvisionedProductPlanOutput extends js.Object

  object DeleteProvisionedProductPlanOutput {
    @inline
    def apply(): DeleteProvisionedProductPlanOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait DeleteProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteProvisioningArtifactInput {
    @inline
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeleteProvisioningArtifactInput = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProvisioningArtifactInput]
    }
  }

  @js.native
  trait DeleteProvisioningArtifactOutput extends js.Object

  object DeleteProvisioningArtifactOutput {
    @inline
    def apply(): DeleteProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProvisioningArtifactOutput]
    }
  }

  @js.native
  trait DeleteServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DeleteServiceActionInput {
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DeleteServiceActionInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteServiceActionInput]
    }
  }

  @js.native
  trait DeleteServiceActionOutput extends js.Object

  object DeleteServiceActionOutput {
    @inline
    def apply(): DeleteServiceActionOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteServiceActionOutput]
    }
  }

  @js.native
  trait DeleteTagOptionInput extends js.Object {
    var Id: TagOptionId
  }

  object DeleteTagOptionInput {
    @inline
    def apply(
        Id: TagOptionId
    ): DeleteTagOptionInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTagOptionInput]
    }
  }

  @js.native
  trait DeleteTagOptionOutput extends js.Object

  object DeleteTagOptionOutput {
    @inline
    def apply(): DeleteTagOptionOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteTagOptionOutput]
    }
  }

  @js.native
  trait DescribeConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeConstraintInput {
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeConstraintInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConstraintInput]
    }
  }

  @js.native
  trait DescribeConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  object DescribeConstraintOutput {
    @inline
    def apply(
        ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined,
        ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeConstraintOutput = {
      val __obj = js.Dynamic.literal()
      ConstraintDetail.foreach(__v => __obj.updateDynamic("ConstraintDetail")(__v.asInstanceOf[js.Any]))
      ConstraintParameters.foreach(__v => __obj.updateDynamic("ConstraintParameters")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConstraintOutput]
    }
  }

  @js.native
  trait DescribeCopyProductStatusInput extends js.Object {
    var CopyProductToken: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeCopyProductStatusInput {
    @inline
    def apply(
        CopyProductToken: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeCopyProductStatusInput = {
      val __obj = js.Dynamic.literal(
        "CopyProductToken" -> CopyProductToken.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCopyProductStatusInput]
    }
  }

  @js.native
  trait DescribeCopyProductStatusOutput extends js.Object {
    var CopyProductStatus: js.UndefOr[CopyProductStatus]
    var StatusDetail: js.UndefOr[StatusDetail]
    var TargetProductId: js.UndefOr[Id]
  }

  object DescribeCopyProductStatusOutput {
    @inline
    def apply(
        CopyProductStatus: js.UndefOr[CopyProductStatus] = js.undefined,
        StatusDetail: js.UndefOr[StatusDetail] = js.undefined,
        TargetProductId: js.UndefOr[Id] = js.undefined
    ): DescribeCopyProductStatusOutput = {
      val __obj = js.Dynamic.literal()
      CopyProductStatus.foreach(__v => __obj.updateDynamic("CopyProductStatus")(__v.asInstanceOf[js.Any]))
      StatusDetail.foreach(__v => __obj.updateDynamic("StatusDetail")(__v.asInstanceOf[js.Any]))
      TargetProductId.foreach(__v => __obj.updateDynamic("TargetProductId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCopyProductStatusOutput]
    }
  }

  @js.native
  trait DescribePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribePortfolioInput {
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribePortfolioInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePortfolioInput]
    }
  }

  @js.native
  trait DescribePortfolioOutput extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var TagOptions: js.UndefOr[TagOptionDetails]
    var Tags: js.UndefOr[Tags]
  }

  object DescribePortfolioOutput {
    @inline
    def apply(
        Budgets: js.UndefOr[Budgets] = js.undefined,
        PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined,
        TagOptions: js.UndefOr[TagOptionDetails] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribePortfolioOutput = {
      val __obj = js.Dynamic.literal()
      Budgets.foreach(__v => __obj.updateDynamic("Budgets")(__v.asInstanceOf[js.Any]))
      PortfolioDetail.foreach(__v => __obj.updateDynamic("PortfolioDetail")(__v.asInstanceOf[js.Any]))
      TagOptions.foreach(__v => __obj.updateDynamic("TagOptions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePortfolioOutput]
    }
  }

  @js.native
  trait DescribePortfolioShareStatusInput extends js.Object {
    var PortfolioShareToken: Id
  }

  object DescribePortfolioShareStatusInput {
    @inline
    def apply(
        PortfolioShareToken: Id
    ): DescribePortfolioShareStatusInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioShareToken" -> PortfolioShareToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePortfolioShareStatusInput]
    }
  }

  @js.native
  trait DescribePortfolioShareStatusOutput extends js.Object {
    var OrganizationNodeValue: js.UndefOr[OrganizationNodeValue]
    var PortfolioId: js.UndefOr[Id]
    var PortfolioShareToken: js.UndefOr[Id]
    var ShareDetails: js.UndefOr[ShareDetails]
    var Status: js.UndefOr[ShareStatus]
  }

  object DescribePortfolioShareStatusOutput {
    @inline
    def apply(
        OrganizationNodeValue: js.UndefOr[OrganizationNodeValue] = js.undefined,
        PortfolioId: js.UndefOr[Id] = js.undefined,
        PortfolioShareToken: js.UndefOr[Id] = js.undefined,
        ShareDetails: js.UndefOr[ShareDetails] = js.undefined,
        Status: js.UndefOr[ShareStatus] = js.undefined
    ): DescribePortfolioShareStatusOutput = {
      val __obj = js.Dynamic.literal()
      OrganizationNodeValue.foreach(__v => __obj.updateDynamic("OrganizationNodeValue")(__v.asInstanceOf[js.Any]))
      PortfolioId.foreach(__v => __obj.updateDynamic("PortfolioId")(__v.asInstanceOf[js.Any]))
      PortfolioShareToken.foreach(__v => __obj.updateDynamic("PortfolioShareToken")(__v.asInstanceOf[js.Any]))
      ShareDetails.foreach(__v => __obj.updateDynamic("ShareDetails")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePortfolioShareStatusOutput]
    }
  }

  @js.native
  trait DescribePortfolioSharesInput extends js.Object {
    var PortfolioId: Id
    var Type: DescribePortfolioShareType
    var PageSize: js.UndefOr[PageSizeMax100]
    var PageToken: js.UndefOr[PageToken]
  }

  object DescribePortfolioSharesInput {
    @inline
    def apply(
        PortfolioId: Id,
        Type: DescribePortfolioShareType,
        PageSize: js.UndefOr[PageSizeMax100] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): DescribePortfolioSharesInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePortfolioSharesInput]
    }
  }

  @js.native
  trait DescribePortfolioSharesOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioShareDetails: js.UndefOr[PortfolioShareDetails]
  }

  object DescribePortfolioSharesOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioShareDetails: js.UndefOr[PortfolioShareDetails] = js.undefined
    ): DescribePortfolioSharesOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      PortfolioShareDetails.foreach(__v => __obj.updateDynamic("PortfolioShareDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePortfolioSharesOutput]
    }
  }

  @js.native
  trait DescribeProductAsAdminInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProductViewName]
    var SourcePortfolioId: js.UndefOr[Id]
  }

  object DescribeProductAsAdminInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProductViewName] = js.undefined,
        SourcePortfolioId: js.UndefOr[Id] = js.undefined
    ): DescribeProductAsAdminInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SourcePortfolioId.foreach(__v => __obj.updateDynamic("SourcePortfolioId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductAsAdminInput]
    }
  }

  @js.native
  trait DescribeProductAsAdminOutput extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var ProvisioningArtifactSummaries: js.UndefOr[ProvisioningArtifactSummaries]
    var TagOptions: js.UndefOr[TagOptionDetails]
    var Tags: js.UndefOr[Tags]
  }

  object DescribeProductAsAdminOutput {
    @inline
    def apply(
        Budgets: js.UndefOr[Budgets] = js.undefined,
        ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined,
        ProvisioningArtifactSummaries: js.UndefOr[ProvisioningArtifactSummaries] = js.undefined,
        TagOptions: js.UndefOr[TagOptionDetails] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DescribeProductAsAdminOutput = {
      val __obj = js.Dynamic.literal()
      Budgets.foreach(__v => __obj.updateDynamic("Budgets")(__v.asInstanceOf[js.Any]))
      ProductViewDetail.foreach(__v => __obj.updateDynamic("ProductViewDetail")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactSummaries.foreach(__v => __obj.updateDynamic("ProvisioningArtifactSummaries")(__v.asInstanceOf[js.Any]))
      TagOptions.foreach(__v => __obj.updateDynamic("TagOptions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductAsAdminOutput]
    }
  }

  @js.native
  trait DescribeProductInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProductViewName]
  }

  object DescribeProductInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProductViewName] = js.undefined
    ): DescribeProductInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductInput]
    }
  }

  @js.native
  trait DescribeProductOutput extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var LaunchPaths: js.UndefOr[LaunchPaths]
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts]
  }

  object DescribeProductOutput {
    @inline
    def apply(
        Budgets: js.UndefOr[Budgets] = js.undefined,
        LaunchPaths: js.UndefOr[LaunchPaths] = js.undefined,
        ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
        ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts] = js.undefined
    ): DescribeProductOutput = {
      val __obj = js.Dynamic.literal()
      Budgets.foreach(__v => __obj.updateDynamic("Budgets")(__v.asInstanceOf[js.Any]))
      LaunchPaths.foreach(__v => __obj.updateDynamic("LaunchPaths")(__v.asInstanceOf[js.Any]))
      ProductViewSummary.foreach(__v => __obj.updateDynamic("ProductViewSummary")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifacts.foreach(__v => __obj.updateDynamic("ProvisioningArtifacts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductOutput]
    }
  }

  @js.native
  trait DescribeProductViewInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeProductViewInput {
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeProductViewInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductViewInput]
    }
  }

  @js.native
  trait DescribeProductViewOutput extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts]
  }

  object DescribeProductViewOutput {
    @inline
    def apply(
        ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
        ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts] = js.undefined
    ): DescribeProductViewOutput = {
      val __obj = js.Dynamic.literal()
      ProductViewSummary.foreach(__v => __obj.updateDynamic("ProductViewSummary")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifacts.foreach(__v => __obj.updateDynamic("ProvisioningArtifacts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProductViewOutput]
    }
  }

  /** DescribeProvisionedProductAPI input structure. AcceptLanguage - [Optional] The language code for localization. Id - [Optional] The provisioned product identifier. Name - [Optional] Another provisioned product identifier. Customers must provide either Id or Name.
    */
  @js.native
  trait DescribeProvisionedProductInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisionedProductName]
  }

  object DescribeProvisionedProductInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProvisionedProductName] = js.undefined
    ): DescribeProvisionedProductInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisionedProductInput]
    }
  }

  @js.native
  trait DescribeProvisionedProductOutput extends js.Object {
    var CloudWatchDashboards: js.UndefOr[CloudWatchDashboards]
    var ProvisionedProductDetail: js.UndefOr[ProvisionedProductDetail]
  }

  object DescribeProvisionedProductOutput {
    @inline
    def apply(
        CloudWatchDashboards: js.UndefOr[CloudWatchDashboards] = js.undefined,
        ProvisionedProductDetail: js.UndefOr[ProvisionedProductDetail] = js.undefined
    ): DescribeProvisionedProductOutput = {
      val __obj = js.Dynamic.literal()
      CloudWatchDashboards.foreach(__v => __obj.updateDynamic("CloudWatchDashboards")(__v.asInstanceOf[js.Any]))
      ProvisionedProductDetail.foreach(__v => __obj.updateDynamic("ProvisionedProductDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisionedProductOutput]
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
    @inline
    def apply(
        PlanId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): DescribeProvisionedProductPlanInput = {
      val __obj = js.Dynamic.literal(
        "PlanId" -> PlanId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisionedProductPlanInput]
    }
  }

  @js.native
  trait DescribeProvisionedProductPlanOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProductPlanDetails: js.UndefOr[ProvisionedProductPlanDetails]
    var ResourceChanges: js.UndefOr[ResourceChanges]
  }

  object DescribeProvisionedProductPlanOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionedProductPlanDetails: js.UndefOr[ProvisionedProductPlanDetails] = js.undefined,
        ResourceChanges: js.UndefOr[ResourceChanges] = js.undefined
    ): DescribeProvisionedProductPlanOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ProvisionedProductPlanDetails.foreach(__v => __obj.updateDynamic("ProvisionedProductPlanDetails")(__v.asInstanceOf[js.Any]))
      ResourceChanges.foreach(__v => __obj.updateDynamic("ResourceChanges")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait DescribeProvisioningArtifactInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var ProductId: js.UndefOr[Id]
    var ProductName: js.UndefOr[ProductViewName]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName]
    var Verbose: js.UndefOr[Verbose]
  }

  object DescribeProvisioningArtifactInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProductName: js.UndefOr[ProductViewName] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        Verbose: js.UndefOr[Verbose] = js.undefined
    ): DescribeProvisioningArtifactInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactName.foreach(__v => __obj.updateDynamic("ProvisioningArtifactName")(__v.asInstanceOf[js.Any]))
      Verbose.foreach(__v => __obj.updateDynamic("Verbose")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningArtifactInput]
    }
  }

  @js.native
  trait DescribeProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  object DescribeProvisioningArtifactOutput {
    @inline
    def apply(
        Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined,
        ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      Info.foreach(__v => __obj.updateDynamic("Info")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetail.foreach(__v => __obj.updateDynamic("ProvisioningArtifactDetail")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningArtifactOutput]
    }
  }

  @js.native
  trait DescribeProvisioningParametersInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PathId: js.UndefOr[Id]
    var PathName: js.UndefOr[PortfolioDisplayName]
    var ProductId: js.UndefOr[Id]
    var ProductName: js.UndefOr[ProductViewName]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName]
  }

  object DescribeProvisioningParametersInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PathId: js.UndefOr[Id] = js.undefined,
        PathName: js.UndefOr[PortfolioDisplayName] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProductName: js.UndefOr[ProductViewName] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName] = js.undefined
    ): DescribeProvisioningParametersInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.updateDynamic("PathId")(__v.asInstanceOf[js.Any]))
      PathName.foreach(__v => __obj.updateDynamic("PathName")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactName.foreach(__v => __obj.updateDynamic("ProvisioningArtifactName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningParametersInput]
    }
  }

  @js.native
  trait DescribeProvisioningParametersOutput extends js.Object {
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries]
    var ProvisioningArtifactOutputs: js.UndefOr[ProvisioningArtifactOutputs]
    var ProvisioningArtifactParameters: js.UndefOr[ProvisioningArtifactParameters]
    var ProvisioningArtifactPreferences: js.UndefOr[ProvisioningArtifactPreferences]
    var TagOptions: js.UndefOr[TagOptionSummaries]
    var UsageInstructions: js.UndefOr[UsageInstructions]
  }

  object DescribeProvisioningParametersOutput {
    @inline
    def apply(
        ConstraintSummaries: js.UndefOr[ConstraintSummaries] = js.undefined,
        ProvisioningArtifactOutputs: js.UndefOr[ProvisioningArtifactOutputs] = js.undefined,
        ProvisioningArtifactParameters: js.UndefOr[ProvisioningArtifactParameters] = js.undefined,
        ProvisioningArtifactPreferences: js.UndefOr[ProvisioningArtifactPreferences] = js.undefined,
        TagOptions: js.UndefOr[TagOptionSummaries] = js.undefined,
        UsageInstructions: js.UndefOr[UsageInstructions] = js.undefined
    ): DescribeProvisioningParametersOutput = {
      val __obj = js.Dynamic.literal()
      ConstraintSummaries.foreach(__v => __obj.updateDynamic("ConstraintSummaries")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactOutputs.foreach(__v => __obj.updateDynamic("ProvisioningArtifactOutputs")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactParameters.foreach(__v => __obj.updateDynamic("ProvisioningArtifactParameters")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactPreferences.foreach(__v => __obj.updateDynamic("ProvisioningArtifactPreferences")(__v.asInstanceOf[js.Any]))
      TagOptions.foreach(__v => __obj.updateDynamic("TagOptions")(__v.asInstanceOf[js.Any]))
      UsageInstructions.foreach(__v => __obj.updateDynamic("UsageInstructions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProvisioningParametersOutput]
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
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): DescribeRecordInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecordInput]
    }
  }

  @js.native
  trait DescribeRecordOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var RecordDetail: js.UndefOr[RecordDetail]
    var RecordOutputs: js.UndefOr[RecordOutputs]
  }

  object DescribeRecordOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined,
        RecordOutputs: js.UndefOr[RecordOutputs] = js.undefined
    ): DescribeRecordOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      RecordDetail.foreach(__v => __obj.updateDynamic("RecordDetail")(__v.asInstanceOf[js.Any]))
      RecordOutputs.foreach(__v => __obj.updateDynamic("RecordOutputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecordOutput]
    }
  }

  @js.native
  trait DescribeServiceActionExecutionParametersInput extends js.Object {
    var ProvisionedProductId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeServiceActionExecutionParametersInput {
    @inline
    def apply(
        ProvisionedProductId: Id,
        ServiceActionId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeServiceActionExecutionParametersInput = {
      val __obj = js.Dynamic.literal(
        "ProvisionedProductId" -> ProvisionedProductId.asInstanceOf[js.Any],
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceActionExecutionParametersInput]
    }
  }

  @js.native
  trait DescribeServiceActionExecutionParametersOutput extends js.Object {
    var ServiceActionParameters: js.UndefOr[ExecutionParameters]
  }

  object DescribeServiceActionExecutionParametersOutput {
    @inline
    def apply(
        ServiceActionParameters: js.UndefOr[ExecutionParameters] = js.undefined
    ): DescribeServiceActionExecutionParametersOutput = {
      val __obj = js.Dynamic.literal()
      ServiceActionParameters.foreach(__v => __obj.updateDynamic("ServiceActionParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceActionExecutionParametersOutput]
    }
  }

  @js.native
  trait DescribeServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DescribeServiceActionInput {
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DescribeServiceActionInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceActionInput]
    }
  }

  @js.native
  trait DescribeServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  object DescribeServiceActionOutput {
    @inline
    def apply(
        ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
    ): DescribeServiceActionOutput = {
      val __obj = js.Dynamic.literal()
      ServiceActionDetail.foreach(__v => __obj.updateDynamic("ServiceActionDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServiceActionOutput]
    }
  }

  @js.native
  trait DescribeTagOptionInput extends js.Object {
    var Id: TagOptionId
  }

  object DescribeTagOptionInput {
    @inline
    def apply(
        Id: TagOptionId
    ): DescribeTagOptionInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTagOptionInput]
    }
  }

  @js.native
  trait DescribeTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  object DescribeTagOptionOutput {
    @inline
    def apply(
        TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined
    ): DescribeTagOptionOutput = {
      val __obj = js.Dynamic.literal()
      TagOptionDetail.foreach(__v => __obj.updateDynamic("TagOptionDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTagOptionOutput]
    }
  }

  @js.native
  trait DisableAWSOrganizationsAccessInput extends js.Object

  object DisableAWSOrganizationsAccessInput {
    @inline
    def apply(): DisableAWSOrganizationsAccessInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableAWSOrganizationsAccessInput]
    }
  }

  @js.native
  trait DisableAWSOrganizationsAccessOutput extends js.Object

  object DisableAWSOrganizationsAccessOutput {
    @inline
    def apply(): DisableAWSOrganizationsAccessOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableAWSOrganizationsAccessOutput]
    }
  }

  @js.native
  trait DisassociateBudgetFromResourceInput extends js.Object {
    var BudgetName: BudgetName
    var ResourceId: Id
  }

  object DisassociateBudgetFromResourceInput {
    @inline
    def apply(
        BudgetName: BudgetName,
        ResourceId: Id
    ): DisassociateBudgetFromResourceInput = {
      val __obj = js.Dynamic.literal(
        "BudgetName" -> BudgetName.asInstanceOf[js.Any],
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateBudgetFromResourceInput]
    }
  }

  @js.native
  trait DisassociateBudgetFromResourceOutput extends js.Object

  object DisassociateBudgetFromResourceOutput {
    @inline
    def apply(): DisassociateBudgetFromResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateBudgetFromResourceOutput]
    }
  }

  @js.native
  trait DisassociatePrincipalFromPortfolioInput extends js.Object {
    var PortfolioId: Id
    var PrincipalARN: PrincipalARN
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DisassociatePrincipalFromPortfolioInput {
    @inline
    def apply(
        PortfolioId: Id,
        PrincipalARN: PrincipalARN,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DisassociatePrincipalFromPortfolioInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "PrincipalARN" -> PrincipalARN.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePrincipalFromPortfolioInput]
    }
  }

  @js.native
  trait DisassociatePrincipalFromPortfolioOutput extends js.Object

  object DisassociatePrincipalFromPortfolioOutput {
    @inline
    def apply(): DisassociatePrincipalFromPortfolioOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociatePrincipalFromPortfolioOutput]
    }
  }

  @js.native
  trait DisassociateProductFromPortfolioInput extends js.Object {
    var PortfolioId: Id
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object DisassociateProductFromPortfolioInput {
    @inline
    def apply(
        PortfolioId: Id,
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DisassociateProductFromPortfolioInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateProductFromPortfolioInput]
    }
  }

  @js.native
  trait DisassociateProductFromPortfolioOutput extends js.Object

  object DisassociateProductFromPortfolioOutput {
    @inline
    def apply(): DisassociateProductFromPortfolioOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateProductFromPortfolioOutput]
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
    @inline
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        ServiceActionId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): DisassociateServiceActionFromProvisioningArtifactInput = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateServiceActionFromProvisioningArtifactInput]
    }
  }

  @js.native
  trait DisassociateServiceActionFromProvisioningArtifactOutput extends js.Object

  object DisassociateServiceActionFromProvisioningArtifactOutput {
    @inline
    def apply(): DisassociateServiceActionFromProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateServiceActionFromProvisioningArtifactOutput]
    }
  }

  @js.native
  trait DisassociateTagOptionFromResourceInput extends js.Object {
    var ResourceId: ResourceId
    var TagOptionId: TagOptionId
  }

  object DisassociateTagOptionFromResourceInput {
    @inline
    def apply(
        ResourceId: ResourceId,
        TagOptionId: TagOptionId
    ): DisassociateTagOptionFromResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagOptionId" -> TagOptionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateTagOptionFromResourceInput]
    }
  }

  @js.native
  trait DisassociateTagOptionFromResourceOutput extends js.Object

  object DisassociateTagOptionFromResourceOutput {
    @inline
    def apply(): DisassociateTagOptionFromResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateTagOptionFromResourceOutput]
    }
  }

  @js.native
  trait EnableAWSOrganizationsAccessInput extends js.Object

  object EnableAWSOrganizationsAccessInput {
    @inline
    def apply(): EnableAWSOrganizationsAccessInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableAWSOrganizationsAccessInput]
    }
  }

  @js.native
  trait EnableAWSOrganizationsAccessOutput extends js.Object

  object EnableAWSOrganizationsAccessOutput {
    @inline
    def apply(): EnableAWSOrganizationsAccessOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnableAWSOrganizationsAccessOutput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductPlanInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ExecuteProvisionedProductPlanInput {
    @inline
    def apply(
        IdempotencyToken: IdempotencyToken,
        PlanId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): ExecuteProvisionedProductPlanInput = {
      val __obj = js.Dynamic.literal(
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "PlanId" -> PlanId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteProvisionedProductPlanInput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductPlanOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ExecuteProvisionedProductPlanOutput {
    @inline
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): ExecuteProvisionedProductPlanOutput = {
      val __obj = js.Dynamic.literal()
      RecordDetail.foreach(__v => __obj.updateDynamic("RecordDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteProvisionedProductPlanOutput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductServiceActionInput extends js.Object {
    var ExecuteToken: IdempotencyToken
    var ProvisionedProductId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Parameters: js.UndefOr[ExecutionParameterMap]
  }

  object ExecuteProvisionedProductServiceActionInput {
    @inline
    def apply(
        ExecuteToken: IdempotencyToken,
        ProvisionedProductId: Id,
        ServiceActionId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Parameters: js.UndefOr[ExecutionParameterMap] = js.undefined
    ): ExecuteProvisionedProductServiceActionInput = {
      val __obj = js.Dynamic.literal(
        "ExecuteToken" -> ExecuteToken.asInstanceOf[js.Any],
        "ProvisionedProductId" -> ProvisionedProductId.asInstanceOf[js.Any],
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteProvisionedProductServiceActionInput]
    }
  }

  @js.native
  trait ExecuteProvisionedProductServiceActionOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ExecuteProvisionedProductServiceActionOutput {
    @inline
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): ExecuteProvisionedProductServiceActionOutput = {
      val __obj = js.Dynamic.literal()
      RecordDetail.foreach(__v => __obj.updateDynamic("RecordDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteProvisionedProductServiceActionOutput]
    }
  }

  /** Details of an execution parameter value that is passed to a self-service action when executed on a provisioned product.
    */
  @js.native
  trait ExecutionParameter extends js.Object {
    var DefaultValues: js.UndefOr[ExecutionParameterValueList]
    var Name: js.UndefOr[ExecutionParameterKey]
    var Type: js.UndefOr[ExecutionParameterType]
  }

  object ExecutionParameter {
    @inline
    def apply(
        DefaultValues: js.UndefOr[ExecutionParameterValueList] = js.undefined,
        Name: js.UndefOr[ExecutionParameterKey] = js.undefined,
        Type: js.UndefOr[ExecutionParameterType] = js.undefined
    ): ExecutionParameter = {
      val __obj = js.Dynamic.literal()
      DefaultValues.foreach(__v => __obj.updateDynamic("DefaultValues")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionParameter]
    }
  }

  /** An object containing information about the error, along with identifying information about the self-service action and its associations.
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
    @inline
    def apply(
        ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        ServiceActionId: js.UndefOr[Id] = js.undefined
    ): FailedServiceActionAssociation = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      ServiceActionId.foreach(__v => __obj.updateDynamic("ServiceActionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedServiceActionAssociation]
    }
  }

  @js.native
  trait GetAWSOrganizationsAccessStatusInput extends js.Object

  object GetAWSOrganizationsAccessStatusInput {
    @inline
    def apply(): GetAWSOrganizationsAccessStatusInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAWSOrganizationsAccessStatusInput]
    }
  }

  @js.native
  trait GetAWSOrganizationsAccessStatusOutput extends js.Object {
    var AccessStatus: js.UndefOr[AccessStatus]
  }

  object GetAWSOrganizationsAccessStatusOutput {
    @inline
    def apply(
        AccessStatus: js.UndefOr[AccessStatus] = js.undefined
    ): GetAWSOrganizationsAccessStatusOutput = {
      val __obj = js.Dynamic.literal()
      AccessStatus.foreach(__v => __obj.updateDynamic("AccessStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAWSOrganizationsAccessStatusOutput]
    }
  }

  @js.native
  trait GetProvisionedProductOutputsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var OutputKeys: js.UndefOr[OutputKeys]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductName]
  }

  object GetProvisionedProductOutputsInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        OutputKeys: js.UndefOr[OutputKeys] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionedProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductName: js.UndefOr[ProvisionedProductName] = js.undefined
    ): GetProvisionedProductOutputsInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      OutputKeys.foreach(__v => __obj.updateDynamic("OutputKeys")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      ProvisionedProductId.foreach(__v => __obj.updateDynamic("ProvisionedProductId")(__v.asInstanceOf[js.Any]))
      ProvisionedProductName.foreach(__v => __obj.updateDynamic("ProvisionedProductName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProvisionedProductOutputsInput]
    }
  }

  @js.native
  trait GetProvisionedProductOutputsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var Outputs: js.UndefOr[RecordOutputs]
  }

  object GetProvisionedProductOutputsOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        Outputs: js.UndefOr[RecordOutputs] = js.undefined
    ): GetProvisionedProductOutputsOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProvisionedProductOutputsOutput]
    }
  }

  @js.native
  trait ImportAsProvisionedProductInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var PhysicalId: PhysicalId
    var ProductId: Id
    var ProvisionedProductName: ProvisionedProductName
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ImportAsProvisionedProductInput {
    @inline
    def apply(
        IdempotencyToken: IdempotencyToken,
        PhysicalId: PhysicalId,
        ProductId: Id,
        ProvisionedProductName: ProvisionedProductName,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): ImportAsProvisionedProductInput = {
      val __obj = js.Dynamic.literal(
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "PhysicalId" -> PhysicalId.asInstanceOf[js.Any],
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisionedProductName" -> ProvisionedProductName.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportAsProvisionedProductInput]
    }
  }

  @js.native
  trait ImportAsProvisionedProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ImportAsProvisionedProductOutput {
    @inline
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): ImportAsProvisionedProductOutput = {
      val __obj = js.Dynamic.literal()
      RecordDetail.foreach(__v => __obj.updateDynamic("RecordDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportAsProvisionedProductOutput]
    }
  }

  /** A launch path object.
    */
  @js.native
  trait LaunchPath extends js.Object {
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[PortfolioName]
  }

  object LaunchPath {
    @inline
    def apply(
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[PortfolioName] = js.undefined
    ): LaunchPath = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchPath]
    }
  }

  /** Summary information about a product path for a user.
    */
  @js.native
  trait LaunchPathSummary extends js.Object {
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[PortfolioName]
    var Tags: js.UndefOr[Tags]
  }

  object LaunchPathSummary {
    @inline
    def apply(
        ConstraintSummaries: js.UndefOr[ConstraintSummaries] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[PortfolioName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): LaunchPathSummary = {
      val __obj = js.Dynamic.literal()
      ConstraintSummaries.foreach(__v => __obj.updateDynamic("ConstraintSummaries")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchPathSummary]
    }
  }

  @js.native
  trait ListAcceptedPortfolioSharesInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSizeMax100]
    var PageToken: js.UndefOr[PageToken]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  object ListAcceptedPortfolioSharesInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSizeMax100] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
    ): ListAcceptedPortfolioSharesInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      PortfolioShareType.foreach(__v => __obj.updateDynamic("PortfolioShareType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAcceptedPortfolioSharesInput]
    }
  }

  @js.native
  trait ListAcceptedPortfolioSharesOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  object ListAcceptedPortfolioSharesOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined
    ): ListAcceptedPortfolioSharesOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      PortfolioDetails.foreach(__v => __obj.updateDynamic("PortfolioDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAcceptedPortfolioSharesOutput]
    }
  }

  @js.native
  trait ListBudgetsForResourceInput extends js.Object {
    var ResourceId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListBudgetsForResourceInput {
    @inline
    def apply(
        ResourceId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListBudgetsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBudgetsForResourceInput]
    }
  }

  @js.native
  trait ListBudgetsForResourceOutput extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListBudgetsForResourceOutput {
    @inline
    def apply(
        Budgets: js.UndefOr[Budgets] = js.undefined,
        NextPageToken: js.UndefOr[PageToken] = js.undefined
    ): ListBudgetsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Budgets.foreach(__v => __obj.updateDynamic("Budgets")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBudgetsForResourceOutput]
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
    @inline
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined
    ): ListConstraintsForPortfolioInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConstraintsForPortfolioInput]
    }
  }

  @js.native
  trait ListConstraintsForPortfolioOutput extends js.Object {
    var ConstraintDetails: js.UndefOr[ConstraintDetails]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListConstraintsForPortfolioOutput {
    @inline
    def apply(
        ConstraintDetails: js.UndefOr[ConstraintDetails] = js.undefined,
        NextPageToken: js.UndefOr[PageToken] = js.undefined
    ): ListConstraintsForPortfolioOutput = {
      val __obj = js.Dynamic.literal()
      ConstraintDetails.foreach(__v => __obj.updateDynamic("ConstraintDetails")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConstraintsForPortfolioOutput]
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
    @inline
    def apply(
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListLaunchPathsInput = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchPathsInput]
    }
  }

  @js.native
  trait ListLaunchPathsOutput extends js.Object {
    var LaunchPathSummaries: js.UndefOr[LaunchPathSummaries]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListLaunchPathsOutput {
    @inline
    def apply(
        LaunchPathSummaries: js.UndefOr[LaunchPathSummaries] = js.undefined,
        NextPageToken: js.UndefOr[PageToken] = js.undefined
    ): ListLaunchPathsOutput = {
      val __obj = js.Dynamic.literal()
      LaunchPathSummaries.foreach(__v => __obj.updateDynamic("LaunchPathSummaries")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLaunchPathsOutput]
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
    @inline
    def apply(
        OrganizationNodeType: OrganizationNodeType,
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListOrganizationPortfolioAccessInput = {
      val __obj = js.Dynamic.literal(
        "OrganizationNodeType" -> OrganizationNodeType.asInstanceOf[js.Any],
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationPortfolioAccessInput]
    }
  }

  @js.native
  trait ListOrganizationPortfolioAccessOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var OrganizationNodes: js.UndefOr[OrganizationNodes]
  }

  object ListOrganizationPortfolioAccessOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        OrganizationNodes: js.UndefOr[OrganizationNodes] = js.undefined
    ): ListOrganizationPortfolioAccessOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      OrganizationNodes.foreach(__v => __obj.updateDynamic("OrganizationNodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOrganizationPortfolioAccessOutput]
    }
  }

  @js.native
  trait ListPortfolioAccessInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var OrganizationParentId: js.UndefOr[Id]
    var PageSize: js.UndefOr[PageSizeMax100]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListPortfolioAccessInput {
    @inline
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        OrganizationParentId: js.UndefOr[Id] = js.undefined,
        PageSize: js.UndefOr[PageSizeMax100] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListPortfolioAccessInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      OrganizationParentId.foreach(__v => __obj.updateDynamic("OrganizationParentId")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfolioAccessInput]
    }
  }

  @js.native
  trait ListPortfolioAccessOutput extends js.Object {
    var AccountIds: js.UndefOr[AccountIds]
    var NextPageToken: js.UndefOr[PageToken]
  }

  object ListPortfolioAccessOutput {
    @inline
    def apply(
        AccountIds: js.UndefOr[AccountIds] = js.undefined,
        NextPageToken: js.UndefOr[PageToken] = js.undefined
    ): ListPortfolioAccessOutput = {
      val __obj = js.Dynamic.literal()
      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfolioAccessOutput]
    }
  }

  @js.native
  trait ListPortfoliosForProductInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSizeMax100]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListPortfoliosForProductInput {
    @inline
    def apply(
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSizeMax100] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListPortfoliosForProductInput = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfoliosForProductInput]
    }
  }

  @js.native
  trait ListPortfoliosForProductOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  object ListPortfoliosForProductOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined
    ): ListPortfoliosForProductOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      PortfolioDetails.foreach(__v => __obj.updateDynamic("PortfolioDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfoliosForProductOutput]
    }
  }

  @js.native
  trait ListPortfoliosInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSizeMax100]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListPortfoliosInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSizeMax100] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListPortfoliosInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfoliosInput]
    }
  }

  @js.native
  trait ListPortfoliosOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  object ListPortfoliosOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioDetails: js.UndefOr[PortfolioDetails] = js.undefined
    ): ListPortfoliosOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      PortfolioDetails.foreach(__v => __obj.updateDynamic("PortfolioDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortfoliosOutput]
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
    @inline
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListPrincipalsForPortfolioInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalsForPortfolioInput]
    }
  }

  @js.native
  trait ListPrincipalsForPortfolioOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var Principals: js.UndefOr[Principals]
  }

  object ListPrincipalsForPortfolioOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        Principals: js.UndefOr[Principals] = js.undefined
    ): ListPrincipalsForPortfolioOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      Principals.foreach(__v => __obj.updateDynamic("Principals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrincipalsForPortfolioOutput]
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
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionProductId: js.UndefOr[Id] = js.undefined
    ): ListProvisionedProductPlansInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      AccessLevelFilter.foreach(__v => __obj.updateDynamic("AccessLevelFilter")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      ProvisionProductId.foreach(__v => __obj.updateDynamic("ProvisionProductId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisionedProductPlansInput]
    }
  }

  @js.native
  trait ListProvisionedProductPlansOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProductPlans: js.UndefOr[ProvisionedProductPlans]
  }

  object ListProvisionedProductPlansOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionedProductPlans: js.UndefOr[ProvisionedProductPlans] = js.undefined
    ): ListProvisionedProductPlansOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ProvisionedProductPlans.foreach(__v => __obj.updateDynamic("ProvisionedProductPlans")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisionedProductPlansOutput]
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
    @inline
    def apply(
        ServiceActionId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListProvisioningArtifactsForServiceActionInput = {
      val __obj = js.Dynamic.literal(
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningArtifactsForServiceActionInput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsForServiceActionOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisioningArtifactViews: js.UndefOr[ProvisioningArtifactViews]
  }

  object ListProvisioningArtifactsForServiceActionOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisioningArtifactViews: js.UndefOr[ProvisioningArtifactViews] = js.undefined
    ): ListProvisioningArtifactsForServiceActionOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactViews.foreach(__v => __obj.updateDynamic("ProvisioningArtifactViews")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningArtifactsForServiceActionOutput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object ListProvisioningArtifactsInput {
    @inline
    def apply(
        ProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): ListProvisioningArtifactsInput = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningArtifactsInput]
    }
  }

  @js.native
  trait ListProvisioningArtifactsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisioningArtifactDetails: js.UndefOr[ProvisioningArtifactDetails]
  }

  object ListProvisioningArtifactsOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisioningArtifactDetails: js.UndefOr[ProvisioningArtifactDetails] = js.undefined
    ): ListProvisioningArtifactsOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetails.foreach(__v => __obj.updateDynamic("ProvisioningArtifactDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProvisioningArtifactsOutput]
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
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        SearchFilter: js.UndefOr[ListRecordHistorySearchFilter] = js.undefined
    ): ListRecordHistoryInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      AccessLevelFilter.foreach(__v => __obj.updateDynamic("AccessLevelFilter")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      SearchFilter.foreach(__v => __obj.updateDynamic("SearchFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordHistoryInput]
    }
  }

  @js.native
  trait ListRecordHistoryOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var RecordDetails: js.UndefOr[RecordDetails]
  }

  object ListRecordHistoryOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        RecordDetails: js.UndefOr[RecordDetails] = js.undefined
    ): ListRecordHistoryOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      RecordDetails.foreach(__v => __obj.updateDynamic("RecordDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordHistoryOutput]
    }
  }

  /** The search filter to use when listing history records.
    */
  @js.native
  trait ListRecordHistorySearchFilter extends js.Object {
    var Key: js.UndefOr[SearchFilterKey]
    var Value: js.UndefOr[SearchFilterValue]
  }

  object ListRecordHistorySearchFilter {
    @inline
    def apply(
        Key: js.UndefOr[SearchFilterKey] = js.undefined,
        Value: js.UndefOr[SearchFilterValue] = js.undefined
    ): ListRecordHistorySearchFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecordHistorySearchFilter]
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
    @inline
    def apply(
        TagOptionId: TagOptionId,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ListResourcesForTagOptionInput = {
      val __obj = js.Dynamic.literal(
        "TagOptionId" -> TagOptionId.asInstanceOf[js.Any]
      )

      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesForTagOptionInput]
    }
  }

  @js.native
  trait ListResourcesForTagOptionOutput extends js.Object {
    var PageToken: js.UndefOr[PageToken]
    var ResourceDetails: js.UndefOr[ResourceDetails]
  }

  object ListResourcesForTagOptionOutput {
    @inline
    def apply(
        PageToken: js.UndefOr[PageToken] = js.undefined,
        ResourceDetails: js.UndefOr[ResourceDetails] = js.undefined
    ): ListResourcesForTagOptionOutput = {
      val __obj = js.Dynamic.literal()
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      ResourceDetails.foreach(__v => __obj.updateDynamic("ResourceDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesForTagOptionOutput]
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
    @inline
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListServiceActionsForProvisioningArtifactInput = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceActionsForProvisioningArtifactInput]
    }
  }

  @js.native
  trait ListServiceActionsForProvisioningArtifactOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries]
  }

  object ListServiceActionsForProvisioningArtifactOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ServiceActionSummaries: js.UndefOr[ServiceActionSummaries] = js.undefined
    ): ListServiceActionsForProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ServiceActionSummaries.foreach(__v => __obj.updateDynamic("ServiceActionSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceActionsForProvisioningArtifactOutput]
    }
  }

  @js.native
  trait ListServiceActionsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListServiceActionsInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListServiceActionsInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceActionsInput]
    }
  }

  @js.native
  trait ListServiceActionsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries]
  }

  object ListServiceActionsOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ServiceActionSummaries: js.UndefOr[ServiceActionSummaries] = js.undefined
    ): ListServiceActionsOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ServiceActionSummaries.foreach(__v => __obj.updateDynamic("ServiceActionSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceActionsOutput]
    }
  }

  @js.native
  trait ListStackInstancesForProvisionedProductInput extends js.Object {
    var ProvisionedProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListStackInstancesForProvisionedProductInput {
    @inline
    def apply(
        ProvisionedProductId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListStackInstancesForProvisionedProductInput = {
      val __obj = js.Dynamic.literal(
        "ProvisionedProductId" -> ProvisionedProductId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackInstancesForProvisionedProductInput]
    }
  }

  @js.native
  trait ListStackInstancesForProvisionedProductOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var StackInstances: js.UndefOr[StackInstances]
  }

  object ListStackInstancesForProvisionedProductOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        StackInstances: js.UndefOr[StackInstances] = js.undefined
    ): ListStackInstancesForProvisionedProductOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      StackInstances.foreach(__v => __obj.updateDynamic("StackInstances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStackInstancesForProvisionedProductOutput]
    }
  }

  /** Filters to use when listing TagOptions.
    */
  @js.native
  trait ListTagOptionsFilters extends js.Object {
    var Active: js.UndefOr[TagOptionActive]
    var Key: js.UndefOr[TagOptionKey]
    var Value: js.UndefOr[TagOptionValue]
  }

  object ListTagOptionsFilters {
    @inline
    def apply(
        Active: js.UndefOr[TagOptionActive] = js.undefined,
        Key: js.UndefOr[TagOptionKey] = js.undefined,
        Value: js.UndefOr[TagOptionValue] = js.undefined
    ): ListTagOptionsFilters = {
      val __obj = js.Dynamic.literal()
      Active.foreach(__v => __obj.updateDynamic("Active")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagOptionsFilters]
    }
  }

  @js.native
  trait ListTagOptionsInput extends js.Object {
    var Filters: js.UndefOr[ListTagOptionsFilters]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  object ListTagOptionsInput {
    @inline
    def apply(
        Filters: js.UndefOr[ListTagOptionsFilters] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ListTagOptionsInput = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagOptionsInput]
    }
  }

  @js.native
  trait ListTagOptionsOutput extends js.Object {
    var PageToken: js.UndefOr[PageToken]
    var TagOptionDetails: js.UndefOr[TagOptionDetails]
  }

  object ListTagOptionsOutput {
    @inline
    def apply(
        PageToken: js.UndefOr[PageToken] = js.undefined,
        TagOptionDetails: js.UndefOr[TagOptionDetails] = js.undefined
    ): ListTagOptionsOutput = {
      val __obj = js.Dynamic.literal()
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      TagOptionDetails.foreach(__v => __obj.updateDynamic("TagOptionDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagOptionsOutput]
    }
  }

  /** Information about the organization node.
    */
  @js.native
  trait OrganizationNode extends js.Object {
    var Type: js.UndefOr[OrganizationNodeType]
    var Value: js.UndefOr[OrganizationNodeValue]
  }

  object OrganizationNode {
    @inline
    def apply(
        Type: js.UndefOr[OrganizationNodeType] = js.undefined,
        Value: js.UndefOr[OrganizationNodeValue] = js.undefined
    ): OrganizationNode = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrganizationNode]
    }
  }

  /** The constraints that the administrator has put on the parameter.
    */
  @js.native
  trait ParameterConstraints extends js.Object {
    var AllowedPattern: js.UndefOr[String]
    var AllowedValues: js.UndefOr[AllowedValues]
    var ConstraintDescription: js.UndefOr[String]
    var MaxLength: js.UndefOr[String]
    var MaxValue: js.UndefOr[String]
    var MinLength: js.UndefOr[String]
    var MinValue: js.UndefOr[String]
  }

  object ParameterConstraints {
    @inline
    def apply(
        AllowedPattern: js.UndefOr[String] = js.undefined,
        AllowedValues: js.UndefOr[AllowedValues] = js.undefined,
        ConstraintDescription: js.UndefOr[String] = js.undefined,
        MaxLength: js.UndefOr[String] = js.undefined,
        MaxValue: js.UndefOr[String] = js.undefined,
        MinLength: js.UndefOr[String] = js.undefined,
        MinValue: js.UndefOr[String] = js.undefined
    ): ParameterConstraints = {
      val __obj = js.Dynamic.literal()
      AllowedPattern.foreach(__v => __obj.updateDynamic("AllowedPattern")(__v.asInstanceOf[js.Any]))
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      ConstraintDescription.foreach(__v => __obj.updateDynamic("ConstraintDescription")(__v.asInstanceOf[js.Any]))
      MaxLength.foreach(__v => __obj.updateDynamic("MaxLength")(__v.asInstanceOf[js.Any]))
      MaxValue.foreach(__v => __obj.updateDynamic("MaxValue")(__v.asInstanceOf[js.Any]))
      MinLength.foreach(__v => __obj.updateDynamic("MinLength")(__v.asInstanceOf[js.Any]))
      MinValue.foreach(__v => __obj.updateDynamic("MinValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterConstraints]
    }
  }

  /** Information about a portfolio.
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
    @inline
    def apply(
        ARN: js.UndefOr[ResourceARN] = js.undefined,
        CreatedTime: js.UndefOr[CreationTime] = js.undefined,
        Description: js.UndefOr[PortfolioDescription] = js.undefined,
        DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        ProviderName: js.UndefOr[ProviderName] = js.undefined
    ): PortfolioDetail = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ProviderName.foreach(__v => __obj.updateDynamic("ProviderName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortfolioDetail]
    }
  }

  /** Information about the portfolio share.
    */
  @js.native
  trait PortfolioShareDetail extends js.Object {
    var Accepted: js.UndefOr[Boolean]
    var PrincipalId: js.UndefOr[Id]
    var ShareTagOptions: js.UndefOr[Boolean]
    var Type: js.UndefOr[DescribePortfolioShareType]
  }

  object PortfolioShareDetail {
    @inline
    def apply(
        Accepted: js.UndefOr[Boolean] = js.undefined,
        PrincipalId: js.UndefOr[Id] = js.undefined,
        ShareTagOptions: js.UndefOr[Boolean] = js.undefined,
        Type: js.UndefOr[DescribePortfolioShareType] = js.undefined
    ): PortfolioShareDetail = {
      val __obj = js.Dynamic.literal()
      Accepted.foreach(__v => __obj.updateDynamic("Accepted")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      ShareTagOptions.foreach(__v => __obj.updateDynamic("ShareTagOptions")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortfolioShareDetail]
    }
  }

  /** Information about a principal.
    */
  @js.native
  trait Principal extends js.Object {
    var PrincipalARN: js.UndefOr[PrincipalARN]
    var PrincipalType: js.UndefOr[PrincipalType]
  }

  object Principal {
    @inline
    def apply(
        PrincipalARN: js.UndefOr[PrincipalARN] = js.undefined,
        PrincipalType: js.UndefOr[PrincipalType] = js.undefined
    ): Principal = {
      val __obj = js.Dynamic.literal()
      PrincipalARN.foreach(__v => __obj.updateDynamic("PrincipalARN")(__v.asInstanceOf[js.Any]))
      PrincipalType.foreach(__v => __obj.updateDynamic("PrincipalType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Principal]
    }
  }

  /** A single product view aggregation value/count pair, containing metadata about each product to which the calling user has access.
    */
  @js.native
  trait ProductViewAggregationValue extends js.Object {
    var ApproximateCount: js.UndefOr[ApproximateCount]
    var Value: js.UndefOr[AttributeValue]
  }

  object ProductViewAggregationValue {
    @inline
    def apply(
        ApproximateCount: js.UndefOr[ApproximateCount] = js.undefined,
        Value: js.UndefOr[AttributeValue] = js.undefined
    ): ProductViewAggregationValue = {
      val __obj = js.Dynamic.literal()
      ApproximateCount.foreach(__v => __obj.updateDynamic("ApproximateCount")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductViewAggregationValue]
    }
  }

  /** Information about a product view.
    */
  @js.native
  trait ProductViewDetail extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var ProductARN: js.UndefOr[ResourceARN]
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var Status: js.UndefOr[Status]
  }

  object ProductViewDetail {
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        ProductARN: js.UndefOr[ResourceARN] = js.undefined,
        ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): ProductViewDetail = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      ProductARN.foreach(__v => __obj.updateDynamic("ProductARN")(__v.asInstanceOf[js.Any]))
      ProductViewSummary.foreach(__v => __obj.updateDynamic("ProductViewSummary")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductViewDetail]
    }
  }

  /** Summary information about a product view.
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
    @inline
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
        Type: js.UndefOr[ProductType] = js.undefined
    ): ProductViewSummary = {
      val __obj = js.Dynamic.literal()
      Distributor.foreach(__v => __obj.updateDynamic("Distributor")(__v.asInstanceOf[js.Any]))
      HasDefaultPath.foreach(__v => __obj.updateDynamic("HasDefaultPath")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ShortDescription.foreach(__v => __obj.updateDynamic("ShortDescription")(__v.asInstanceOf[js.Any]))
      SupportDescription.foreach(__v => __obj.updateDynamic("SupportDescription")(__v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.updateDynamic("SupportEmail")(__v.asInstanceOf[js.Any]))
      SupportUrl.foreach(__v => __obj.updateDynamic("SupportUrl")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductViewSummary]
    }
  }

  @js.native
  trait ProvisionProductInput extends js.Object {
    var ProvisionToken: IdempotencyToken
    var ProvisionedProductName: ProvisionedProductName
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var NotificationArns: js.UndefOr[NotificationArns]
    var PathId: js.UndefOr[Id]
    var PathName: js.UndefOr[PortfolioDisplayName]
    var ProductId: js.UndefOr[Id]
    var ProductName: js.UndefOr[ProductViewName]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName]
    var ProvisioningParameters: js.UndefOr[ProvisioningParameters]
    var ProvisioningPreferences: js.UndefOr[ProvisioningPreferences]
    var Tags: js.UndefOr[Tags]
  }

  object ProvisionProductInput {
    @inline
    def apply(
        ProvisionToken: IdempotencyToken,
        ProvisionedProductName: ProvisionedProductName,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        NotificationArns: js.UndefOr[NotificationArns] = js.undefined,
        PathId: js.UndefOr[Id] = js.undefined,
        PathName: js.UndefOr[PortfolioDisplayName] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProductName: js.UndefOr[ProductViewName] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        ProvisioningParameters: js.UndefOr[ProvisioningParameters] = js.undefined,
        ProvisioningPreferences: js.UndefOr[ProvisioningPreferences] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ProvisionProductInput = {
      val __obj = js.Dynamic.literal(
        "ProvisionToken" -> ProvisionToken.asInstanceOf[js.Any],
        "ProvisionedProductName" -> ProvisionedProductName.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      NotificationArns.foreach(__v => __obj.updateDynamic("NotificationArns")(__v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.updateDynamic("PathId")(__v.asInstanceOf[js.Any]))
      PathName.foreach(__v => __obj.updateDynamic("PathName")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactName.foreach(__v => __obj.updateDynamic("ProvisioningArtifactName")(__v.asInstanceOf[js.Any]))
      ProvisioningParameters.foreach(__v => __obj.updateDynamic("ProvisioningParameters")(__v.asInstanceOf[js.Any]))
      ProvisioningPreferences.foreach(__v => __obj.updateDynamic("ProvisioningPreferences")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionProductInput]
    }
  }

  @js.native
  trait ProvisionProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object ProvisionProductOutput {
    @inline
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): ProvisionProductOutput = {
      val __obj = js.Dynamic.literal()
      RecordDetail.foreach(__v => __obj.updateDynamic("RecordDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionProductOutput]
    }
  }

  /** Information about a provisioned product.
    */
  @js.native
  trait ProvisionedProductAttribute extends js.Object {
    var Arn: js.UndefOr[ProvisionedProductNameOrArn]
    var CreatedTime: js.UndefOr[CreatedTime]
    var Id: js.UndefOr[Id]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var LastProvisioningRecordId: js.UndefOr[Id]
    var LastRecordId: js.UndefOr[Id]
    var LastSuccessfulProvisioningRecordId: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisionedProductNameOrArn]
    var PhysicalId: js.UndefOr[PhysicalId]
    var ProductId: js.UndefOr[Id]
    var ProductName: js.UndefOr[ProductViewName]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName]
    var Status: js.UndefOr[ProvisionedProductStatus]
    var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage]
    var Tags: js.UndefOr[Tags]
    var Type: js.UndefOr[ProvisionedProductType]
    var UserArn: js.UndefOr[UserArn]
    var UserArnSession: js.UndefOr[UserArnSession]
  }

  object ProvisionedProductAttribute {
    @inline
    def apply(
        Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        LastProvisioningRecordId: js.UndefOr[Id] = js.undefined,
        LastRecordId: js.UndefOr[Id] = js.undefined,
        LastSuccessfulProvisioningRecordId: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        PhysicalId: js.UndefOr[PhysicalId] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProductName: js.UndefOr[ProductViewName] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        Status: js.UndefOr[ProvisionedProductStatus] = js.undefined,
        StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Type: js.UndefOr[ProvisionedProductType] = js.undefined,
        UserArn: js.UndefOr[UserArn] = js.undefined,
        UserArnSession: js.UndefOr[UserArnSession] = js.undefined
    ): ProvisionedProductAttribute = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IdempotencyToken.foreach(__v => __obj.updateDynamic("IdempotencyToken")(__v.asInstanceOf[js.Any]))
      LastProvisioningRecordId.foreach(__v => __obj.updateDynamic("LastProvisioningRecordId")(__v.asInstanceOf[js.Any]))
      LastRecordId.foreach(__v => __obj.updateDynamic("LastRecordId")(__v.asInstanceOf[js.Any]))
      LastSuccessfulProvisioningRecordId.foreach(__v => __obj.updateDynamic("LastSuccessfulProvisioningRecordId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PhysicalId.foreach(__v => __obj.updateDynamic("PhysicalId")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactName.foreach(__v => __obj.updateDynamic("ProvisioningArtifactName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      UserArnSession.foreach(__v => __obj.updateDynamic("UserArnSession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedProductAttribute]
    }
  }

  /** Information about a provisioned product.
    */
  @js.native
  trait ProvisionedProductDetail extends js.Object {
    var Arn: js.UndefOr[ProvisionedProductNameOrArn]
    var CreatedTime: js.UndefOr[CreatedTime]
    var Id: js.UndefOr[ProvisionedProductId]
    var IdempotencyToken: js.UndefOr[IdempotencyToken]
    var LastProvisioningRecordId: js.UndefOr[Id]
    var LastRecordId: js.UndefOr[LastRequestId]
    var LastSuccessfulProvisioningRecordId: js.UndefOr[Id]
    var LaunchRoleArn: js.UndefOr[RoleArn]
    var Name: js.UndefOr[ProvisionedProductNameOrArn]
    var ProductId: js.UndefOr[Id]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var Status: js.UndefOr[ProvisionedProductStatus]
    var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage]
    var Type: js.UndefOr[ProvisionedProductType]
  }

  object ProvisionedProductDetail {
    @inline
    def apply(
        Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        Id: js.UndefOr[ProvisionedProductId] = js.undefined,
        IdempotencyToken: js.UndefOr[IdempotencyToken] = js.undefined,
        LastProvisioningRecordId: js.UndefOr[Id] = js.undefined,
        LastRecordId: js.UndefOr[LastRequestId] = js.undefined,
        LastSuccessfulProvisioningRecordId: js.UndefOr[Id] = js.undefined,
        LaunchRoleArn: js.UndefOr[RoleArn] = js.undefined,
        Name: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        Status: js.UndefOr[ProvisionedProductStatus] = js.undefined,
        StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.undefined,
        Type: js.UndefOr[ProvisionedProductType] = js.undefined
    ): ProvisionedProductDetail = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      IdempotencyToken.foreach(__v => __obj.updateDynamic("IdempotencyToken")(__v.asInstanceOf[js.Any]))
      LastProvisioningRecordId.foreach(__v => __obj.updateDynamic("LastProvisioningRecordId")(__v.asInstanceOf[js.Any]))
      LastRecordId.foreach(__v => __obj.updateDynamic("LastRecordId")(__v.asInstanceOf[js.Any]))
      LastSuccessfulProvisioningRecordId.foreach(__v => __obj.updateDynamic("LastSuccessfulProvisioningRecordId")(__v.asInstanceOf[js.Any]))
      LaunchRoleArn.foreach(__v => __obj.updateDynamic("LaunchRoleArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedProductDetail]
    }
  }

  /** Information about a plan.
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
    @inline
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
        UpdatedTime: js.UndefOr[UpdatedTime] = js.undefined
    ): ProvisionedProductPlanDetails = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      NotificationArns.foreach(__v => __obj.updateDynamic("NotificationArns")(__v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.updateDynamic("PathId")(__v.asInstanceOf[js.Any]))
      PlanId.foreach(__v => __obj.updateDynamic("PlanId")(__v.asInstanceOf[js.Any]))
      PlanName.foreach(__v => __obj.updateDynamic("PlanName")(__v.asInstanceOf[js.Any]))
      PlanType.foreach(__v => __obj.updateDynamic("PlanType")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ProvisionProductId.foreach(__v => __obj.updateDynamic("ProvisionProductId")(__v.asInstanceOf[js.Any]))
      ProvisionProductName.foreach(__v => __obj.updateDynamic("ProvisionProductName")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      ProvisioningParameters.foreach(__v => __obj.updateDynamic("ProvisioningParameters")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.updateDynamic("UpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedProductPlanDetails]
    }
  }

  /** Summary information about a plan.
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
    @inline
    def apply(
        PlanId: js.UndefOr[Id] = js.undefined,
        PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined,
        PlanType: js.UndefOr[ProvisionedProductPlanType] = js.undefined,
        ProvisionProductId: js.UndefOr[Id] = js.undefined,
        ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
    ): ProvisionedProductPlanSummary = {
      val __obj = js.Dynamic.literal()
      PlanId.foreach(__v => __obj.updateDynamic("PlanId")(__v.asInstanceOf[js.Any]))
      PlanName.foreach(__v => __obj.updateDynamic("PlanName")(__v.asInstanceOf[js.Any]))
      PlanType.foreach(__v => __obj.updateDynamic("PlanType")(__v.asInstanceOf[js.Any]))
      ProvisionProductId.foreach(__v => __obj.updateDynamic("ProvisionProductId")(__v.asInstanceOf[js.Any]))
      ProvisionProductName.foreach(__v => __obj.updateDynamic("ProvisionProductName")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedProductPlanSummary]
    }
  }

  /** Information about a provisioning artifact. A provisioning artifact is also known as a product version.
    */
  @js.native
  trait ProvisioningArtifact extends js.Object {
    var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Guidance: js.UndefOr[ProvisioningArtifactGuidance]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
  }

  object ProvisioningArtifact {
    @inline
    def apply(
        CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined,
        Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
        Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
    ): ProvisioningArtifact = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Guidance.foreach(__v => __obj.updateDynamic("Guidance")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifact]
    }
  }

  /** Information about a provisioning artifact (also known as a version) for a product.
    */
  @js.native
  trait ProvisioningArtifactDetail extends js.Object {
    var Active: js.UndefOr[ProvisioningArtifactActive]
    var CreatedTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[ProvisioningArtifactName]
    var Guidance: js.UndefOr[ProvisioningArtifactGuidance]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var Type: js.UndefOr[ProvisioningArtifactType]
  }

  object ProvisioningArtifactDetail {
    @inline
    def apply(
        Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined,
        CreatedTime: js.UndefOr[CreationTime] = js.undefined,
        Description: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
    ): ProvisioningArtifactDetail = {
      val __obj = js.Dynamic.literal()
      Active.foreach(__v => __obj.updateDynamic("Active")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Guidance.foreach(__v => __obj.updateDynamic("Guidance")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactDetail]
    }
  }

  /** Provisioning artifact output.
    */
  @js.native
  trait ProvisioningArtifactOutput extends js.Object {
    var Description: js.UndefOr[OutputDescription]
    var Key: js.UndefOr[ProvisioningArtifactOutputKey]
  }

  object ProvisioningArtifactOutput {
    @inline
    def apply(
        Description: js.UndefOr[OutputDescription] = js.undefined,
        Key: js.UndefOr[ProvisioningArtifactOutputKey] = js.undefined
    ): ProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactOutput]
    }
  }

  /** Information about a parameter used to provision a product.
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
    @inline
    def apply(
        DefaultValue: js.UndefOr[DefaultValue] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        IsNoEcho: js.UndefOr[NoEcho] = js.undefined,
        ParameterConstraints: js.UndefOr[ParameterConstraints] = js.undefined,
        ParameterKey: js.UndefOr[ParameterKey] = js.undefined,
        ParameterType: js.UndefOr[ParameterType] = js.undefined
    ): ProvisioningArtifactParameter = {
      val __obj = js.Dynamic.literal()
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IsNoEcho.foreach(__v => __obj.updateDynamic("IsNoEcho")(__v.asInstanceOf[js.Any]))
      ParameterConstraints.foreach(__v => __obj.updateDynamic("ParameterConstraints")(__v.asInstanceOf[js.Any]))
      ParameterKey.foreach(__v => __obj.updateDynamic("ParameterKey")(__v.asInstanceOf[js.Any]))
      ParameterType.foreach(__v => __obj.updateDynamic("ParameterType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactParameter]
    }
  }

  /** The user-defined preferences that will be applied during product provisioning, unless overridden by <code>ProvisioningPreferences</code> or <code>UpdateProvisioningPreferences</code>. For more information on maximum concurrent accounts and failure tolerance, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options|Stack set operation options]] in the <i>AWS CloudFormation User Guide</i>.
    */
  @js.native
  trait ProvisioningArtifactPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  object ProvisioningArtifactPreferences {
    @inline
    def apply(
        StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined,
        StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined
    ): ProvisioningArtifactPreferences = {
      val __obj = js.Dynamic.literal()
      StackSetAccounts.foreach(__v => __obj.updateDynamic("StackSetAccounts")(__v.asInstanceOf[js.Any]))
      StackSetRegions.foreach(__v => __obj.updateDynamic("StackSetRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactPreferences]
    }
  }

  /** Information about a provisioning artifact (also known as a version) for a product.
    */
  @js.native
  trait ProvisioningArtifactProperties extends js.Object {
    var Info: ProvisioningArtifactInfo
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var DisableTemplateValidation: js.UndefOr[DisableTemplateValidation]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var Type: js.UndefOr[ProvisioningArtifactType]
  }

  object ProvisioningArtifactProperties {
    @inline
    def apply(
        Info: ProvisioningArtifactInfo,
        Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
        DisableTemplateValidation: js.UndefOr[DisableTemplateValidation] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
    ): ProvisioningArtifactProperties = {
      val __obj = js.Dynamic.literal(
        "Info" -> Info.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableTemplateValidation.foreach(__v => __obj.updateDynamic("DisableTemplateValidation")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactProperties]
    }
  }

  /** Summary information about a provisioning artifact (also known as a version) for a product.
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
    @inline
    def apply(
        CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined,
        Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
    ): ProvisioningArtifactSummary = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactMetadata.foreach(__v => __obj.updateDynamic("ProvisioningArtifactMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactSummary]
    }
  }

  /** An object that contains summary information about a product view and a provisioning artifact.
    */
  @js.native
  trait ProvisioningArtifactView extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifact: js.UndefOr[ProvisioningArtifact]
  }

  object ProvisioningArtifactView {
    @inline
    def apply(
        ProductViewSummary: js.UndefOr[ProductViewSummary] = js.undefined,
        ProvisioningArtifact: js.UndefOr[ProvisioningArtifact] = js.undefined
    ): ProvisioningArtifactView = {
      val __obj = js.Dynamic.literal()
      ProductViewSummary.foreach(__v => __obj.updateDynamic("ProductViewSummary")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifact.foreach(__v => __obj.updateDynamic("ProvisioningArtifact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningArtifactView]
    }
  }

  /** Information about a parameter used to provision a product.
    */
  @js.native
  trait ProvisioningParameter extends js.Object {
    var Key: js.UndefOr[ParameterKey]
    var Value: js.UndefOr[ParameterValue]
  }

  object ProvisioningParameter {
    @inline
    def apply(
        Key: js.UndefOr[ParameterKey] = js.undefined,
        Value: js.UndefOr[ParameterValue] = js.undefined
    ): ProvisioningParameter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningParameter]
    }
  }

  /** The user-defined preferences that will be applied when updating a provisioned product. Not all preferences are applicable to all provisioned product type One or more AWS accounts that will have access to the provisioned product. Applicable only to a <code>CFN_STACKSET</code> provisioned product type. The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint. To get the list of accounts in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code> operation. If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
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
    @inline
    def apply(
        StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined,
        StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount] = js.undefined,
        StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage] = js.undefined,
        StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount] = js.undefined,
        StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage] = js.undefined,
        StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined
    ): ProvisioningPreferences = {
      val __obj = js.Dynamic.literal()
      StackSetAccounts.foreach(__v => __obj.updateDynamic("StackSetAccounts")(__v.asInstanceOf[js.Any]))
      StackSetFailureToleranceCount.foreach(__v => __obj.updateDynamic("StackSetFailureToleranceCount")(__v.asInstanceOf[js.Any]))
      StackSetFailureTolerancePercentage.foreach(__v => __obj.updateDynamic("StackSetFailureTolerancePercentage")(__v.asInstanceOf[js.Any]))
      StackSetMaxConcurrencyCount.foreach(__v => __obj.updateDynamic("StackSetMaxConcurrencyCount")(__v.asInstanceOf[js.Any]))
      StackSetMaxConcurrencyPercentage.foreach(__v => __obj.updateDynamic("StackSetMaxConcurrencyPercentage")(__v.asInstanceOf[js.Any]))
      StackSetRegions.foreach(__v => __obj.updateDynamic("StackSetRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisioningPreferences]
    }
  }

  /** Information about a request operation.
    */
  @js.native
  trait RecordDetail extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var LaunchRoleArn: js.UndefOr[RoleArn]
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
    @inline
    def apply(
        CreatedTime: js.UndefOr[CreatedTime] = js.undefined,
        LaunchRoleArn: js.UndefOr[RoleArn] = js.undefined,
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
        UpdatedTime: js.UndefOr[UpdatedTime] = js.undefined
    ): RecordDetail = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      LaunchRoleArn.foreach(__v => __obj.updateDynamic("LaunchRoleArn")(__v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.updateDynamic("PathId")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ProvisionedProductId.foreach(__v => __obj.updateDynamic("ProvisionedProductId")(__v.asInstanceOf[js.Any]))
      ProvisionedProductName.foreach(__v => __obj.updateDynamic("ProvisionedProductName")(__v.asInstanceOf[js.Any]))
      ProvisionedProductType.foreach(__v => __obj.updateDynamic("ProvisionedProductType")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      RecordErrors.foreach(__v => __obj.updateDynamic("RecordErrors")(__v.asInstanceOf[js.Any]))
      RecordId.foreach(__v => __obj.updateDynamic("RecordId")(__v.asInstanceOf[js.Any]))
      RecordTags.foreach(__v => __obj.updateDynamic("RecordTags")(__v.asInstanceOf[js.Any]))
      RecordType.foreach(__v => __obj.updateDynamic("RecordType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTime.foreach(__v => __obj.updateDynamic("UpdatedTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordDetail]
    }
  }

  /** The error code and description resulting from an operation.
    */
  @js.native
  trait RecordError extends js.Object {
    var Code: js.UndefOr[ErrorCode]
    var Description: js.UndefOr[ErrorDescription]
  }

  object RecordError {
    @inline
    def apply(
        Code: js.UndefOr[ErrorCode] = js.undefined,
        Description: js.UndefOr[ErrorDescription] = js.undefined
    ): RecordError = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordError]
    }
  }

  /** The output for the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
    */
  @js.native
  trait RecordOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var OutputKey: js.UndefOr[OutputKey]
    var OutputValue: js.UndefOr[OutputValue]
  }

  object RecordOutput {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        OutputKey: js.UndefOr[OutputKey] = js.undefined,
        OutputValue: js.UndefOr[OutputValue] = js.undefined
    ): RecordOutput = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      OutputKey.foreach(__v => __obj.updateDynamic("OutputKey")(__v.asInstanceOf[js.Any]))
      OutputValue.foreach(__v => __obj.updateDynamic("OutputValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordOutput]
    }
  }

  /** Information about a tag, which is a key-value pair.
    */
  @js.native
  trait RecordTag extends js.Object {
    var Key: js.UndefOr[RecordTagKey]
    var Value: js.UndefOr[RecordTagValue]
  }

  object RecordTag {
    @inline
    def apply(
        Key: js.UndefOr[RecordTagKey] = js.undefined,
        Value: js.UndefOr[RecordTagValue] = js.undefined
    ): RecordTag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecordTag]
    }
  }

  @js.native
  trait RejectPortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  object RejectPortfolioShareInput {
    @inline
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PortfolioShareType: js.UndefOr[PortfolioShareType] = js.undefined
    ): RejectPortfolioShareInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PortfolioShareType.foreach(__v => __obj.updateDynamic("PortfolioShareType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RejectPortfolioShareInput]
    }
  }

  @js.native
  trait RejectPortfolioShareOutput extends js.Object

  object RejectPortfolioShareOutput {
    @inline
    def apply(): RejectPortfolioShareOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RejectPortfolioShareOutput]
    }
  }

  /** Information about a resource change that will occur when a plan is executed.
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
    @inline
    def apply(
        Action: js.UndefOr[ChangeAction] = js.undefined,
        Details: js.UndefOr[ResourceChangeDetails] = js.undefined,
        LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined,
        PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined,
        Replacement: js.UndefOr[Replacement] = js.undefined,
        ResourceType: js.UndefOr[PlanResourceType] = js.undefined,
        Scope: js.UndefOr[Scope] = js.undefined
    ): ResourceChange = {
      val __obj = js.Dynamic.literal()
      Action.foreach(__v => __obj.updateDynamic("Action")(__v.asInstanceOf[js.Any]))
      Details.foreach(__v => __obj.updateDynamic("Details")(__v.asInstanceOf[js.Any]))
      LogicalResourceId.foreach(__v => __obj.updateDynamic("LogicalResourceId")(__v.asInstanceOf[js.Any]))
      PhysicalResourceId.foreach(__v => __obj.updateDynamic("PhysicalResourceId")(__v.asInstanceOf[js.Any]))
      Replacement.foreach(__v => __obj.updateDynamic("Replacement")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceChange]
    }
  }

  /** Information about a change to a resource attribute.
    */
  @js.native
  trait ResourceChangeDetail extends js.Object {
    var CausingEntity: js.UndefOr[CausingEntity]
    var Evaluation: js.UndefOr[EvaluationType]
    var Target: js.UndefOr[ResourceTargetDefinition]
  }

  object ResourceChangeDetail {
    @inline
    def apply(
        CausingEntity: js.UndefOr[CausingEntity] = js.undefined,
        Evaluation: js.UndefOr[EvaluationType] = js.undefined,
        Target: js.UndefOr[ResourceTargetDefinition] = js.undefined
    ): ResourceChangeDetail = {
      val __obj = js.Dynamic.literal()
      CausingEntity.foreach(__v => __obj.updateDynamic("CausingEntity")(__v.asInstanceOf[js.Any]))
      Evaluation.foreach(__v => __obj.updateDynamic("Evaluation")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceChangeDetail]
    }
  }

  /** Information about a resource.
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
    @inline
    def apply(
        ARN: js.UndefOr[ResourceDetailARN] = js.undefined,
        CreatedTime: js.UndefOr[ResourceDetailCreatedTime] = js.undefined,
        Description: js.UndefOr[ResourceDetailDescription] = js.undefined,
        Id: js.UndefOr[ResourceDetailId] = js.undefined,
        Name: js.UndefOr[ResourceDetailName] = js.undefined
    ): ResourceDetail = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDetail]
    }
  }

  /** Information about a change to a resource attribute.
    */
  @js.native
  trait ResourceTargetDefinition extends js.Object {
    var Attribute: js.UndefOr[ResourceAttribute]
    var Name: js.UndefOr[PropertyName]
    var RequiresRecreation: js.UndefOr[RequiresRecreation]
  }

  object ResourceTargetDefinition {
    @inline
    def apply(
        Attribute: js.UndefOr[ResourceAttribute] = js.undefined,
        Name: js.UndefOr[PropertyName] = js.undefined,
        RequiresRecreation: js.UndefOr[RequiresRecreation] = js.undefined
    ): ResourceTargetDefinition = {
      val __obj = js.Dynamic.literal()
      Attribute.foreach(__v => __obj.updateDynamic("Attribute")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequiresRecreation.foreach(__v => __obj.updateDynamic("RequiresRecreation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTargetDefinition]
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
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined
    ): ScanProvisionedProductsInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      AccessLevelFilter.foreach(__v => __obj.updateDynamic("AccessLevelFilter")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanProvisionedProductsInput]
    }
  }

  @js.native
  trait ScanProvisionedProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProducts: js.UndefOr[ProvisionedProductDetails]
  }

  object ScanProvisionedProductsOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionedProducts: js.UndefOr[ProvisionedProductDetails] = js.undefined
    ): ScanProvisionedProductsOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ProvisionedProducts.foreach(__v => __obj.updateDynamic("ProvisionedProducts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScanProvisionedProductsOutput]
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
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Filters: js.UndefOr[ProductViewFilters] = js.undefined,
        PageSize: js.UndefOr[PageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        PortfolioId: js.UndefOr[Id] = js.undefined,
        ProductSource: js.UndefOr[ProductSource] = js.undefined,
        SortBy: js.UndefOr[ProductViewSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): SearchProductsAsAdminInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      PortfolioId.foreach(__v => __obj.updateDynamic("PortfolioId")(__v.asInstanceOf[js.Any]))
      ProductSource.foreach(__v => __obj.updateDynamic("ProductSource")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProductsAsAdminInput]
    }
  }

  @js.native
  trait SearchProductsAsAdminOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProductViewDetails: js.UndefOr[ProductViewDetails]
  }

  object SearchProductsAsAdminOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProductViewDetails: js.UndefOr[ProductViewDetails] = js.undefined
    ): SearchProductsAsAdminOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ProductViewDetails.foreach(__v => __obj.updateDynamic("ProductViewDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProductsAsAdminOutput]
    }
  }

  @js.native
  trait SearchProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Filters: js.UndefOr[ProductViewFilters]
    var PageSize: js.UndefOr[PageSizeMax100]
    var PageToken: js.UndefOr[PageToken]
    var SortBy: js.UndefOr[ProductViewSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object SearchProductsInput {
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Filters: js.UndefOr[ProductViewFilters] = js.undefined,
        PageSize: js.UndefOr[PageSizeMax100] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        SortBy: js.UndefOr[ProductViewSortBy] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): SearchProductsInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProductsInput]
    }
  }

  @js.native
  trait SearchProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProductViewAggregations: js.UndefOr[ProductViewAggregations]
    var ProductViewSummaries: js.UndefOr[ProductViewSummaries]
  }

  object SearchProductsOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProductViewAggregations: js.UndefOr[ProductViewAggregations] = js.undefined,
        ProductViewSummaries: js.UndefOr[ProductViewSummaries] = js.undefined
    ): SearchProductsOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ProductViewAggregations.foreach(__v => __obj.updateDynamic("ProductViewAggregations")(__v.asInstanceOf[js.Any]))
      ProductViewSummaries.foreach(__v => __obj.updateDynamic("ProductViewSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProductsOutput]
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
    @inline
    def apply(
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined,
        Filters: js.UndefOr[ProvisionedProductFilters] = js.undefined,
        PageSize: js.UndefOr[SearchProvisionedProductsPageSize] = js.undefined,
        PageToken: js.UndefOr[PageToken] = js.undefined,
        SortBy: js.UndefOr[SortField] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): SearchProvisionedProductsInput = {
      val __obj = js.Dynamic.literal()
      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      AccessLevelFilter.foreach(__v => __obj.updateDynamic("AccessLevelFilter")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.updateDynamic("PageSize")(__v.asInstanceOf[js.Any]))
      PageToken.foreach(__v => __obj.updateDynamic("PageToken")(__v.asInstanceOf[js.Any]))
      SortBy.foreach(__v => __obj.updateDynamic("SortBy")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProvisionedProductsInput]
    }
  }

  @js.native
  trait SearchProvisionedProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes]
    var TotalResultsCount: js.UndefOr[TotalResultsCount]
  }

  object SearchProvisionedProductsOutput {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.undefined,
        TotalResultsCount: js.UndefOr[TotalResultsCount] = js.undefined
    ): SearchProvisionedProductsOutput = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      ProvisionedProducts.foreach(__v => __obj.updateDynamic("ProvisionedProducts")(__v.asInstanceOf[js.Any]))
      TotalResultsCount.foreach(__v => __obj.updateDynamic("TotalResultsCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchProvisionedProductsOutput]
    }
  }

  /** A self-service action association consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
    */
  @js.native
  trait ServiceActionAssociation extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
  }

  object ServiceActionAssociation {
    @inline
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        ServiceActionId: Id
    ): ServiceActionAssociation = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any],
        "ServiceActionId" -> ServiceActionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ServiceActionAssociation]
    }
  }

  /** An object containing detailed information about the self-service action.
    */
  @js.native
  trait ServiceActionDetail extends js.Object {
    var Definition: js.UndefOr[ServiceActionDefinitionMap]
    var ServiceActionSummary: js.UndefOr[ServiceActionSummary]
  }

  object ServiceActionDetail {
    @inline
    def apply(
        Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined,
        ServiceActionSummary: js.UndefOr[ServiceActionSummary] = js.undefined
    ): ServiceActionDetail = {
      val __obj = js.Dynamic.literal()
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      ServiceActionSummary.foreach(__v => __obj.updateDynamic("ServiceActionSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceActionDetail]
    }
  }

  /** Detailed information about the self-service action.
    */
  @js.native
  trait ServiceActionSummary extends js.Object {
    var DefinitionType: js.UndefOr[ServiceActionDefinitionType]
    var Description: js.UndefOr[ServiceActionDescription]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ServiceActionName]
  }

  object ServiceActionSummary {
    @inline
    def apply(
        DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.undefined,
        Description: js.UndefOr[ServiceActionDescription] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[ServiceActionName] = js.undefined
    ): ServiceActionSummary = {
      val __obj = js.Dynamic.literal()
      DefinitionType.foreach(__v => __obj.updateDynamic("DefinitionType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceActionSummary]
    }
  }

  /** Information about the portfolio share operation.
    */
  @js.native
  trait ShareDetails extends js.Object {
    var ShareErrors: js.UndefOr[ShareErrors]
    var SuccessfulShares: js.UndefOr[SuccessfulShares]
  }

  object ShareDetails {
    @inline
    def apply(
        ShareErrors: js.UndefOr[ShareErrors] = js.undefined,
        SuccessfulShares: js.UndefOr[SuccessfulShares] = js.undefined
    ): ShareDetails = {
      val __obj = js.Dynamic.literal()
      ShareErrors.foreach(__v => __obj.updateDynamic("ShareErrors")(__v.asInstanceOf[js.Any]))
      SuccessfulShares.foreach(__v => __obj.updateDynamic("SuccessfulShares")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareDetails]
    }
  }

  /** Errors that occurred during the portfolio share operation.
    */
  @js.native
  trait ShareError extends js.Object {
    var Accounts: js.UndefOr[Namespaces]
    var Error: js.UndefOr[Error]
    var Message: js.UndefOr[Message]
  }

  object ShareError {
    @inline
    def apply(
        Accounts: js.UndefOr[Namespaces] = js.undefined,
        Error: js.UndefOr[Error] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined
    ): ShareError = {
      val __obj = js.Dynamic.literal()
      Accounts.foreach(__v => __obj.updateDynamic("Accounts")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShareError]
    }
  }

  /** An AWS CloudFormation stack, in a specific account and region, that's part of a stack set operation. A stack instance is a reference to an attempted or actual stack in a given account within a given region. A stack instance can exist without a stack—for example, if the stack couldn't be created for some reason. A stack instance is associated with only one stack set. Each stack instance contains the ID of its associated stack set, as well as the ID of the actual stack and the stack status.
    */
  @js.native
  trait StackInstance extends js.Object {
    var Account: js.UndefOr[AccountId]
    var Region: js.UndefOr[Region]
    var StackInstanceStatus: js.UndefOr[StackInstanceStatus]
  }

  object StackInstance {
    @inline
    def apply(
        Account: js.UndefOr[AccountId] = js.undefined,
        Region: js.UndefOr[Region] = js.undefined,
        StackInstanceStatus: js.UndefOr[StackInstanceStatus] = js.undefined
    ): StackInstance = {
      val __obj = js.Dynamic.literal()
      Account.foreach(__v => __obj.updateDynamic("Account")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      StackInstanceStatus.foreach(__v => __obj.updateDynamic("StackInstanceStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StackInstance]
    }
  }

  /** Information about a tag. A tag is a key-value pair. Tags are propagated to the resources created when provisioning a product.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  /** Information about a TagOption.
    */
  @js.native
  trait TagOptionDetail extends js.Object {
    var Active: js.UndefOr[TagOptionActive]
    var Id: js.UndefOr[TagOptionId]
    var Key: js.UndefOr[TagOptionKey]
    var Owner: js.UndefOr[Owner]
    var Value: js.UndefOr[TagOptionValue]
  }

  object TagOptionDetail {
    @inline
    def apply(
        Active: js.UndefOr[TagOptionActive] = js.undefined,
        Id: js.UndefOr[TagOptionId] = js.undefined,
        Key: js.UndefOr[TagOptionKey] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        Value: js.UndefOr[TagOptionValue] = js.undefined
    ): TagOptionDetail = {
      val __obj = js.Dynamic.literal()
      Active.foreach(__v => __obj.updateDynamic("Active")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagOptionDetail]
    }
  }

  /** Summary information about a TagOption.
    */
  @js.native
  trait TagOptionSummary extends js.Object {
    var Key: js.UndefOr[TagOptionKey]
    var Values: js.UndefOr[TagOptionValues]
  }

  object TagOptionSummary {
    @inline
    def apply(
        Key: js.UndefOr[TagOptionKey] = js.undefined,
        Values: js.UndefOr[TagOptionValues] = js.undefined
    ): TagOptionSummary = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagOptionSummary]
    }
  }

  @js.native
  trait TerminateProvisionedProductInput extends js.Object {
    var TerminateToken: IdempotencyToken
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var IgnoreErrors: js.UndefOr[IgnoreErrors]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn]
    var RetainPhysicalResources: js.UndefOr[RetainPhysicalResources]
  }

  object TerminateProvisionedProductInput {
    @inline
    def apply(
        TerminateToken: IdempotencyToken,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        IgnoreErrors: js.UndefOr[IgnoreErrors] = js.undefined,
        ProvisionedProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        RetainPhysicalResources: js.UndefOr[RetainPhysicalResources] = js.undefined
    ): TerminateProvisionedProductInput = {
      val __obj = js.Dynamic.literal(
        "TerminateToken" -> TerminateToken.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      IgnoreErrors.foreach(__v => __obj.updateDynamic("IgnoreErrors")(__v.asInstanceOf[js.Any]))
      ProvisionedProductId.foreach(__v => __obj.updateDynamic("ProvisionedProductId")(__v.asInstanceOf[js.Any]))
      ProvisionedProductName.foreach(__v => __obj.updateDynamic("ProvisionedProductName")(__v.asInstanceOf[js.Any]))
      RetainPhysicalResources.foreach(__v => __obj.updateDynamic("RetainPhysicalResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateProvisionedProductInput]
    }
  }

  @js.native
  trait TerminateProvisionedProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object TerminateProvisionedProductOutput {
    @inline
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): TerminateProvisionedProductOutput = {
      val __obj = js.Dynamic.literal()
      RecordDetail.foreach(__v => __obj.updateDynamic("RecordDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateProvisionedProductOutput]
    }
  }

  @js.native
  trait UpdateConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ConstraintDescription]
    var Parameters: js.UndefOr[ConstraintParameters]
  }

  object UpdateConstraintInput {
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Description: js.UndefOr[ConstraintDescription] = js.undefined,
        Parameters: js.UndefOr[ConstraintParameters] = js.undefined
    ): UpdateConstraintInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConstraintInput]
    }
  }

  @js.native
  trait UpdateConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  object UpdateConstraintOutput {
    @inline
    def apply(
        ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined,
        ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): UpdateConstraintOutput = {
      val __obj = js.Dynamic.literal()
      ConstraintDetail.foreach(__v => __obj.updateDynamic("ConstraintDetail")(__v.asInstanceOf[js.Any]))
      ConstraintParameters.foreach(__v => __obj.updateDynamic("ConstraintParameters")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConstraintOutput]
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
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AddTags: js.UndefOr[AddTags] = js.undefined,
        Description: js.UndefOr[PortfolioDescription] = js.undefined,
        DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined,
        ProviderName: js.UndefOr[ProviderName] = js.undefined,
        RemoveTags: js.UndefOr[TagKeys] = js.undefined
    ): UpdatePortfolioInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      AddTags.foreach(__v => __obj.updateDynamic("AddTags")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisplayName.foreach(__v => __obj.updateDynamic("DisplayName")(__v.asInstanceOf[js.Any]))
      ProviderName.foreach(__v => __obj.updateDynamic("ProviderName")(__v.asInstanceOf[js.Any]))
      RemoveTags.foreach(__v => __obj.updateDynamic("RemoveTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePortfolioInput]
    }
  }

  @js.native
  trait UpdatePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var Tags: js.UndefOr[Tags]
  }

  object UpdatePortfolioOutput {
    @inline
    def apply(
        PortfolioDetail: js.UndefOr[PortfolioDetail] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdatePortfolioOutput = {
      val __obj = js.Dynamic.literal()
      PortfolioDetail.foreach(__v => __obj.updateDynamic("PortfolioDetail")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePortfolioOutput]
    }
  }

  @js.native
  trait UpdatePortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccountId: js.UndefOr[AccountId]
    var OrganizationNode: js.UndefOr[OrganizationNode]
    var ShareTagOptions: js.UndefOr[NullableBoolean]
  }

  object UpdatePortfolioShareInput {
    @inline
    def apply(
        PortfolioId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        OrganizationNode: js.UndefOr[OrganizationNode] = js.undefined,
        ShareTagOptions: js.UndefOr[NullableBoolean] = js.undefined
    ): UpdatePortfolioShareInput = {
      val __obj = js.Dynamic.literal(
        "PortfolioId" -> PortfolioId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      OrganizationNode.foreach(__v => __obj.updateDynamic("OrganizationNode")(__v.asInstanceOf[js.Any]))
      ShareTagOptions.foreach(__v => __obj.updateDynamic("ShareTagOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePortfolioShareInput]
    }
  }

  @js.native
  trait UpdatePortfolioShareOutput extends js.Object {
    var PortfolioShareToken: js.UndefOr[Id]
    var Status: js.UndefOr[ShareStatus]
  }

  object UpdatePortfolioShareOutput {
    @inline
    def apply(
        PortfolioShareToken: js.UndefOr[Id] = js.undefined,
        Status: js.UndefOr[ShareStatus] = js.undefined
    ): UpdatePortfolioShareOutput = {
      val __obj = js.Dynamic.literal()
      PortfolioShareToken.foreach(__v => __obj.updateDynamic("PortfolioShareToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePortfolioShareOutput]
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
    @inline
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
        SupportUrl: js.UndefOr[SupportUrl] = js.undefined
    ): UpdateProductInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      AddTags.foreach(__v => __obj.updateDynamic("AddTags")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Distributor.foreach(__v => __obj.updateDynamic("Distributor")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      RemoveTags.foreach(__v => __obj.updateDynamic("RemoveTags")(__v.asInstanceOf[js.Any]))
      SupportDescription.foreach(__v => __obj.updateDynamic("SupportDescription")(__v.asInstanceOf[js.Any]))
      SupportEmail.foreach(__v => __obj.updateDynamic("SupportEmail")(__v.asInstanceOf[js.Any]))
      SupportUrl.foreach(__v => __obj.updateDynamic("SupportUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProductInput]
    }
  }

  @js.native
  trait UpdateProductOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateProductOutput {
    @inline
    def apply(
        ProductViewDetail: js.UndefOr[ProductViewDetail] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateProductOutput = {
      val __obj = js.Dynamic.literal()
      ProductViewDetail.foreach(__v => __obj.updateDynamic("ProductViewDetail")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProductOutput]
    }
  }

  @js.native
  trait UpdateProvisionedProductInput extends js.Object {
    var UpdateToken: IdempotencyToken
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PathId: js.UndefOr[Id]
    var PathName: js.UndefOr[PortfolioDisplayName]
    var ProductId: js.UndefOr[Id]
    var ProductName: js.UndefOr[ProductViewName]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName]
    var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters]
    var ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateProvisionedProductInput {
    @inline
    def apply(
        UpdateToken: IdempotencyToken,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        PathId: js.UndefOr[Id] = js.undefined,
        PathName: js.UndefOr[PortfolioDisplayName] = js.undefined,
        ProductId: js.UndefOr[Id] = js.undefined,
        ProductName: js.UndefOr[ProductViewName] = js.undefined,
        ProvisionedProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined,
        ProvisioningArtifactId: js.UndefOr[Id] = js.undefined,
        ProvisioningArtifactName: js.UndefOr[ProvisioningArtifactName] = js.undefined,
        ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined,
        ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateProvisionedProductInput = {
      val __obj = js.Dynamic.literal(
        "UpdateToken" -> UpdateToken.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      PathId.foreach(__v => __obj.updateDynamic("PathId")(__v.asInstanceOf[js.Any]))
      PathName.foreach(__v => __obj.updateDynamic("PathName")(__v.asInstanceOf[js.Any]))
      ProductId.foreach(__v => __obj.updateDynamic("ProductId")(__v.asInstanceOf[js.Any]))
      ProductName.foreach(__v => __obj.updateDynamic("ProductName")(__v.asInstanceOf[js.Any]))
      ProvisionedProductId.foreach(__v => __obj.updateDynamic("ProvisionedProductId")(__v.asInstanceOf[js.Any]))
      ProvisionedProductName.foreach(__v => __obj.updateDynamic("ProvisionedProductName")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactId.foreach(__v => __obj.updateDynamic("ProvisioningArtifactId")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactName.foreach(__v => __obj.updateDynamic("ProvisioningArtifactName")(__v.asInstanceOf[js.Any]))
      ProvisioningParameters.foreach(__v => __obj.updateDynamic("ProvisioningParameters")(__v.asInstanceOf[js.Any]))
      ProvisioningPreferences.foreach(__v => __obj.updateDynamic("ProvisioningPreferences")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisionedProductInput]
    }
  }

  @js.native
  trait UpdateProvisionedProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  object UpdateProvisionedProductOutput {
    @inline
    def apply(
        RecordDetail: js.UndefOr[RecordDetail] = js.undefined
    ): UpdateProvisionedProductOutput = {
      val __obj = js.Dynamic.literal()
      RecordDetail.foreach(__v => __obj.updateDynamic("RecordDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisionedProductOutput]
    }
  }

  @js.native
  trait UpdateProvisionedProductPropertiesInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var ProvisionedProductId: Id
    var ProvisionedProductProperties: ProvisionedProductProperties
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  object UpdateProvisionedProductPropertiesInput {
    @inline
    def apply(
        IdempotencyToken: IdempotencyToken,
        ProvisionedProductId: Id,
        ProvisionedProductProperties: ProvisionedProductProperties,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
    ): UpdateProvisionedProductPropertiesInput = {
      val __obj = js.Dynamic.literal(
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "ProvisionedProductId" -> ProvisionedProductId.asInstanceOf[js.Any],
        "ProvisionedProductProperties" -> ProvisionedProductProperties.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisionedProductPropertiesInput]
    }
  }

  @js.native
  trait UpdateProvisionedProductPropertiesOutput extends js.Object {
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductProperties: js.UndefOr[ProvisionedProductProperties]
    var RecordId: js.UndefOr[Id]
    var Status: js.UndefOr[RecordStatus]
  }

  object UpdateProvisionedProductPropertiesOutput {
    @inline
    def apply(
        ProvisionedProductId: js.UndefOr[Id] = js.undefined,
        ProvisionedProductProperties: js.UndefOr[ProvisionedProductProperties] = js.undefined,
        RecordId: js.UndefOr[Id] = js.undefined,
        Status: js.UndefOr[RecordStatus] = js.undefined
    ): UpdateProvisionedProductPropertiesOutput = {
      val __obj = js.Dynamic.literal()
      ProvisionedProductId.foreach(__v => __obj.updateDynamic("ProvisionedProductId")(__v.asInstanceOf[js.Any]))
      ProvisionedProductProperties.foreach(__v => __obj.updateDynamic("ProvisionedProductProperties")(__v.asInstanceOf[js.Any]))
      RecordId.foreach(__v => __obj.updateDynamic("RecordId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisionedProductPropertiesOutput]
    }
  }

  @js.native
  trait UpdateProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Active: js.UndefOr[ProvisioningArtifactActive]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Guidance: js.UndefOr[ProvisioningArtifactGuidance]
    var Name: js.UndefOr[ProvisioningArtifactName]
  }

  object UpdateProvisioningArtifactInput {
    @inline
    def apply(
        ProductId: Id,
        ProvisioningArtifactId: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined,
        Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined,
        Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.undefined,
        Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
    ): UpdateProvisioningArtifactInput = {
      val __obj = js.Dynamic.literal(
        "ProductId" -> ProductId.asInstanceOf[js.Any],
        "ProvisioningArtifactId" -> ProvisioningArtifactId.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Active.foreach(__v => __obj.updateDynamic("Active")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Guidance.foreach(__v => __obj.updateDynamic("Guidance")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisioningArtifactInput]
    }
  }

  @js.native
  trait UpdateProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  object UpdateProvisioningArtifactOutput {
    @inline
    def apply(
        Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined,
        ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): UpdateProvisioningArtifactOutput = {
      val __obj = js.Dynamic.literal()
      Info.foreach(__v => __obj.updateDynamic("Info")(__v.asInstanceOf[js.Any]))
      ProvisioningArtifactDetail.foreach(__v => __obj.updateDynamic("ProvisioningArtifactDetail")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisioningArtifactOutput]
    }
  }

  /** The parameter key-value pair used to update a provisioned product.
    */
  @js.native
  trait UpdateProvisioningParameter extends js.Object {
    var Key: js.UndefOr[ParameterKey]
    var UsePreviousValue: js.UndefOr[UsePreviousValue]
    var Value: js.UndefOr[ParameterValue]
  }

  object UpdateProvisioningParameter {
    @inline
    def apply(
        Key: js.UndefOr[ParameterKey] = js.undefined,
        UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined,
        Value: js.UndefOr[ParameterValue] = js.undefined
    ): UpdateProvisioningParameter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      UsePreviousValue.foreach(__v => __obj.updateDynamic("UsePreviousValue")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisioningParameter]
    }
  }

  /** The user-defined preferences that will be applied when updating a provisioned product. Not all preferences are applicable to all provisioned product types.
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
    @inline
    def apply(
        StackSetAccounts: js.UndefOr[StackSetAccounts] = js.undefined,
        StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount] = js.undefined,
        StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage] = js.undefined,
        StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount] = js.undefined,
        StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage] = js.undefined,
        StackSetOperationType: js.UndefOr[StackSetOperationType] = js.undefined,
        StackSetRegions: js.UndefOr[StackSetRegions] = js.undefined
    ): UpdateProvisioningPreferences = {
      val __obj = js.Dynamic.literal()
      StackSetAccounts.foreach(__v => __obj.updateDynamic("StackSetAccounts")(__v.asInstanceOf[js.Any]))
      StackSetFailureToleranceCount.foreach(__v => __obj.updateDynamic("StackSetFailureToleranceCount")(__v.asInstanceOf[js.Any]))
      StackSetFailureTolerancePercentage.foreach(__v => __obj.updateDynamic("StackSetFailureTolerancePercentage")(__v.asInstanceOf[js.Any]))
      StackSetMaxConcurrencyCount.foreach(__v => __obj.updateDynamic("StackSetMaxConcurrencyCount")(__v.asInstanceOf[js.Any]))
      StackSetMaxConcurrencyPercentage.foreach(__v => __obj.updateDynamic("StackSetMaxConcurrencyPercentage")(__v.asInstanceOf[js.Any]))
      StackSetOperationType.foreach(__v => __obj.updateDynamic("StackSetOperationType")(__v.asInstanceOf[js.Any]))
      StackSetRegions.foreach(__v => __obj.updateDynamic("StackSetRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProvisioningPreferences]
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
    @inline
    def apply(
        Id: Id,
        AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined,
        Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined,
        Description: js.UndefOr[ServiceActionDescription] = js.undefined,
        Name: js.UndefOr[ServiceActionName] = js.undefined
    ): UpdateServiceActionInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      AcceptLanguage.foreach(__v => __obj.updateDynamic("AcceptLanguage")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceActionInput]
    }
  }

  @js.native
  trait UpdateServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  object UpdateServiceActionOutput {
    @inline
    def apply(
        ServiceActionDetail: js.UndefOr[ServiceActionDetail] = js.undefined
    ): UpdateServiceActionOutput = {
      val __obj = js.Dynamic.literal()
      ServiceActionDetail.foreach(__v => __obj.updateDynamic("ServiceActionDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceActionOutput]
    }
  }

  @js.native
  trait UpdateTagOptionInput extends js.Object {
    var Id: TagOptionId
    var Active: js.UndefOr[TagOptionActive]
    var Value: js.UndefOr[TagOptionValue]
  }

  object UpdateTagOptionInput {
    @inline
    def apply(
        Id: TagOptionId,
        Active: js.UndefOr[TagOptionActive] = js.undefined,
        Value: js.UndefOr[TagOptionValue] = js.undefined
    ): UpdateTagOptionInput = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Active.foreach(__v => __obj.updateDynamic("Active")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTagOptionInput]
    }
  }

  @js.native
  trait UpdateTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  object UpdateTagOptionOutput {
    @inline
    def apply(
        TagOptionDetail: js.UndefOr[TagOptionDetail] = js.undefined
    ): UpdateTagOptionOutput = {
      val __obj = js.Dynamic.literal()
      TagOptionDetail.foreach(__v => __obj.updateDynamic("TagOptionDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTagOptionOutput]
    }
  }

  /** Additional information provided by the administrator.
    */
  @js.native
  trait UsageInstruction extends js.Object {
    var Type: js.UndefOr[InstructionType]
    var Value: js.UndefOr[InstructionValue]
  }

  object UsageInstruction {
    @inline
    def apply(
        Type: js.UndefOr[InstructionType] = js.undefined,
        Value: js.UndefOr[InstructionValue] = js.undefined
    ): UsageInstruction = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageInstruction]
    }
  }
}
