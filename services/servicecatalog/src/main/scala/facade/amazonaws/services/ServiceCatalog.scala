package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object servicecatalog {
  type AcceptLanguage                          = String
  type AccessLevelFilterValue                  = String
  type AccountId                               = String
  type AccountIds                              = js.Array[AccountId]
  type AddTags                                 = js.Array[Tag]
  type AllowedValue                            = String
  type AllowedValues                           = js.Array[AllowedValue]
  type ApproximateCount                        = Int
  type AttributeValue                          = String
  type BudgetName                              = String
  type Budgets                                 = js.Array[BudgetDetail]
  type CausingEntity                           = String
  type CloudWatchDashboardName                 = String
  type CloudWatchDashboards                    = js.Array[CloudWatchDashboard]
  type ConstraintDescription                   = String
  type ConstraintDetails                       = js.Array[ConstraintDetail]
  type ConstraintParameters                    = String
  type ConstraintSummaries                     = js.Array[ConstraintSummary]
  type ConstraintType                          = String
  type CopyOptions                             = js.Array[CopyOption]
  type CreatedTime                             = js.Date
  type CreationTime                            = js.Date
  type DefaultValue                            = String
  type Description                             = String
  type DisableTemplateValidation               = Boolean
  type Error                                   = String
  type ErrorCode                               = String
  type ErrorDescription                        = String
  type ExecutionParameterKey                   = String
  type ExecutionParameterMap                   = js.Dictionary[ExecutionParameterValueList]
  type ExecutionParameterType                  = String
  type ExecutionParameterValue                 = String
  type ExecutionParameterValueList             = js.Array[ExecutionParameterValue]
  type ExecutionParameters                     = js.Array[ExecutionParameter]
  type FailedServiceActionAssociations         = js.Array[FailedServiceActionAssociation]
  type HasDefaultPath                          = Boolean
  type Id                                      = String
  type IdempotencyToken                        = String
  type IgnoreErrors                            = Boolean
  type InstructionType                         = String
  type InstructionValue                        = String
  type LastRequestId                           = String
  type LaunchPathSummaries                     = js.Array[LaunchPathSummary]
  type LogicalResourceId                       = String
  type Message                                 = String
  type Namespaces                              = js.Array[AccountId]
  type NoEcho                                  = Boolean
  type NotificationArn                         = String
  type NotificationArns                        = js.Array[NotificationArn]
  type OrganizationNodeValue                   = String
  type OrganizationNodes                       = js.Array[OrganizationNode]
  type OutputKey                               = String
  type OutputValue                             = String
  type PageSize                                = Int
  type PageToken                               = String
  type ParameterKey                            = String
  type ParameterType                           = String
  type ParameterValue                          = String
  type PhysicalId                              = String
  type PhysicalResourceId                      = String
  type PlanResourceType                        = String
  type PortfolioDescription                    = String
  type PortfolioDetails                        = js.Array[PortfolioDetail]
  type PortfolioDisplayName                    = String
  type PortfolioName                           = String
  type PrincipalARN                            = String
  type Principals                              = js.Array[Principal]
  type ProductArn                              = String
  type ProductViewAggregationType              = String
  type ProductViewAggregationValues            = js.Array[ProductViewAggregationValue]
  type ProductViewAggregations                 = js.Dictionary[ProductViewAggregationValues]
  type ProductViewDetails                      = js.Array[ProductViewDetail]
  type ProductViewDistributor                  = String
  type ProductViewFilterValue                  = String
  type ProductViewFilterValues                 = js.Array[ProductViewFilterValue]
  type ProductViewFilters                      = js.Dictionary[ProductViewFilterValues]
  type ProductViewName                         = String
  type ProductViewOwner                        = String
  type ProductViewShortDescription             = String
  type ProductViewSummaries                    = js.Array[ProductViewSummary]
  type PropertyName                            = String
  type PropertyValue                           = String
  type ProviderName                            = String
  type ProvisionedProductAttributes            = js.Array[ProvisionedProductAttribute]
  type ProvisionedProductDetails               = js.Array[ProvisionedProductDetail]
  type ProvisionedProductFilters               = js.Dictionary[ProvisionedProductViewFilterValues]
  type ProvisionedProductId                    = String
  type ProvisionedProductName                  = String
  type ProvisionedProductNameOrArn             = String
  type ProvisionedProductPlanName              = String
  type ProvisionedProductPlans                 = js.Array[ProvisionedProductPlanSummary]
  type ProvisionedProductProperties            = js.Dictionary[PropertyValue]
  type ProvisionedProductStatusMessage         = String
  type ProvisionedProductType                  = String
  type ProvisionedProductViewFilterValue       = String
  type ProvisionedProductViewFilterValues      = js.Array[ProvisionedProductViewFilterValue]
  type ProvisioningArtifactActive              = Boolean
  type ProvisioningArtifactCreatedTime         = js.Date
  type ProvisioningArtifactDescription         = String
  type ProvisioningArtifactDetails             = js.Array[ProvisioningArtifactDetail]
  type ProvisioningArtifactInfo                = js.Dictionary[ProvisioningArtifactInfoValue]
  type ProvisioningArtifactInfoKey             = String
  type ProvisioningArtifactInfoValue           = String
  type ProvisioningArtifactName                = String
  type ProvisioningArtifactParameters          = js.Array[ProvisioningArtifactParameter]
  type ProvisioningArtifactPropertyValue       = String
  type ProvisioningArtifactSummaries           = js.Array[ProvisioningArtifactSummary]
  type ProvisioningArtifactViews               = js.Array[ProvisioningArtifactView]
  type ProvisioningArtifacts                   = js.Array[ProvisioningArtifact]
  type ProvisioningParameters                  = js.Array[ProvisioningParameter]
  type RecordDetails                           = js.Array[RecordDetail]
  type RecordErrors                            = js.Array[RecordError]
  type RecordOutputs                           = js.Array[RecordOutput]
  type RecordTagKey                            = String
  type RecordTagValue                          = String
  type RecordTags                              = js.Array[RecordTag]
  type RecordType                              = String
  type Region                                  = String
  type ResourceARN                             = String
  type ResourceChangeDetails                   = js.Array[ResourceChangeDetail]
  type ResourceChanges                         = js.Array[ResourceChange]
  type ResourceDetailARN                       = String
  type ResourceDetailCreatedTime               = js.Date
  type ResourceDetailDescription               = String
  type ResourceDetailId                        = String
  type ResourceDetailName                      = String
  type ResourceDetails                         = js.Array[ResourceDetail]
  type ResourceId                              = String
  type ResourceType                            = String
  type Scope                                   = js.Array[ResourceAttribute]
  type SearchFilterKey                         = String
  type SearchFilterValue                       = String
  type SearchProvisionedProductsPageSize       = Int
  type ServiceActionAssociationErrorMessage    = String
  type ServiceActionAssociations               = js.Array[ServiceActionAssociation]
  type ServiceActionDefinitionMap              = js.Dictionary[ServiceActionDefinitionValue]
  type ServiceActionDefinitionValue            = String
  type ServiceActionDescription                = String
  type ServiceActionName                       = String
  type ServiceActionSummaries                  = js.Array[ServiceActionSummary]
  type ShareErrors                             = js.Array[ShareError]
  type SortField                               = String
  type SourceProvisioningArtifactProperties    = js.Array[SourceProvisioningArtifactPropertiesMap]
  type SourceProvisioningArtifactPropertiesMap = js.Dictionary[ProvisioningArtifactPropertyValue]
  type StackInstances                          = js.Array[StackInstance]
  type StackSetAccounts                        = js.Array[AccountId]
  type StackSetFailureToleranceCount           = Int
  type StackSetFailureTolerancePercentage      = Int
  type StackSetMaxConcurrencyCount             = Int
  type StackSetMaxConcurrencyPercentage        = Int
  type StackSetRegions                         = js.Array[Region]
  type StatusDetail                            = String
  type StatusMessage                           = String
  type SuccessfulShares                        = js.Array[AccountId]
  type SupportDescription                      = String
  type SupportEmail                            = String
  type SupportUrl                              = String
  type TagKey                                  = String
  type TagKeys                                 = js.Array[TagKey]
  type TagOptionActive                         = Boolean
  type TagOptionDetails                        = js.Array[TagOptionDetail]
  type TagOptionId                             = String
  type TagOptionKey                            = String
  type TagOptionSummaries                      = js.Array[TagOptionSummary]
  type TagOptionValue                          = String
  type TagOptionValues                         = js.Array[TagOptionValue]
  type TagValue                                = String
  type Tags                                    = js.Array[Tag]
  type TotalResultsCount                       = Int
  type UpdateProvisioningParameters            = js.Array[UpdateProvisioningParameter]
  type UpdatedTime                             = js.Date
  type UsageInstructions                       = js.Array[UsageInstruction]
  type UsePreviousValue                        = Boolean
  type UserArn                                 = String
  type UserArnSession                          = String
  type Verbose                                 = Boolean

  implicit final class ServiceCatalogOps(private val service: ServiceCatalog) extends AnyVal {

    @inline def acceptPortfolioShareFuture(params: AcceptPortfolioShareInput): Future[AcceptPortfolioShareOutput] =
      service.acceptPortfolioShare(params).promise().toFuture
    @inline def associateBudgetWithResourceFuture(
        params: AssociateBudgetWithResourceInput
    ): Future[AssociateBudgetWithResourceOutput] = service.associateBudgetWithResource(params).promise().toFuture
    @inline def associatePrincipalWithPortfolioFuture(
        params: AssociatePrincipalWithPortfolioInput
    ): Future[AssociatePrincipalWithPortfolioOutput] =
      service.associatePrincipalWithPortfolio(params).promise().toFuture
    @inline def associateProductWithPortfolioFuture(
        params: AssociateProductWithPortfolioInput
    ): Future[AssociateProductWithPortfolioOutput] = service.associateProductWithPortfolio(params).promise().toFuture
    @inline def associateServiceActionWithProvisioningArtifactFuture(
        params: AssociateServiceActionWithProvisioningArtifactInput
    ): Future[AssociateServiceActionWithProvisioningArtifactOutput] =
      service.associateServiceActionWithProvisioningArtifact(params).promise().toFuture
    @inline def associateTagOptionWithResourceFuture(
        params: AssociateTagOptionWithResourceInput
    ): Future[AssociateTagOptionWithResourceOutput] = service.associateTagOptionWithResource(params).promise().toFuture
    @inline def batchAssociateServiceActionWithProvisioningArtifactFuture(
        params: BatchAssociateServiceActionWithProvisioningArtifactInput
    ): Future[BatchAssociateServiceActionWithProvisioningArtifactOutput] =
      service.batchAssociateServiceActionWithProvisioningArtifact(params).promise().toFuture
    @inline def batchDisassociateServiceActionFromProvisioningArtifactFuture(
        params: BatchDisassociateServiceActionFromProvisioningArtifactInput
    ): Future[BatchDisassociateServiceActionFromProvisioningArtifactOutput] =
      service.batchDisassociateServiceActionFromProvisioningArtifact(params).promise().toFuture
    @inline def copyProductFuture(params: CopyProductInput): Future[CopyProductOutput] =
      service.copyProduct(params).promise().toFuture
    @inline def createConstraintFuture(params: CreateConstraintInput): Future[CreateConstraintOutput] =
      service.createConstraint(params).promise().toFuture
    @inline def createPortfolioFuture(params: CreatePortfolioInput): Future[CreatePortfolioOutput] =
      service.createPortfolio(params).promise().toFuture
    @inline def createPortfolioShareFuture(params: CreatePortfolioShareInput): Future[CreatePortfolioShareOutput] =
      service.createPortfolioShare(params).promise().toFuture
    @inline def createProductFuture(params: CreateProductInput): Future[CreateProductOutput] =
      service.createProduct(params).promise().toFuture
    @inline def createProvisionedProductPlanFuture(
        params: CreateProvisionedProductPlanInput
    ): Future[CreateProvisionedProductPlanOutput] = service.createProvisionedProductPlan(params).promise().toFuture
    @inline def createProvisioningArtifactFuture(
        params: CreateProvisioningArtifactInput
    ): Future[CreateProvisioningArtifactOutput] = service.createProvisioningArtifact(params).promise().toFuture
    @inline def createServiceActionFuture(params: CreateServiceActionInput): Future[CreateServiceActionOutput] =
      service.createServiceAction(params).promise().toFuture
    @inline def createTagOptionFuture(params: CreateTagOptionInput): Future[CreateTagOptionOutput] =
      service.createTagOption(params).promise().toFuture
    @inline def deleteConstraintFuture(params: DeleteConstraintInput): Future[DeleteConstraintOutput] =
      service.deleteConstraint(params).promise().toFuture
    @inline def deletePortfolioFuture(params: DeletePortfolioInput): Future[DeletePortfolioOutput] =
      service.deletePortfolio(params).promise().toFuture
    @inline def deletePortfolioShareFuture(params: DeletePortfolioShareInput): Future[DeletePortfolioShareOutput] =
      service.deletePortfolioShare(params).promise().toFuture
    @inline def deleteProductFuture(params: DeleteProductInput): Future[DeleteProductOutput] =
      service.deleteProduct(params).promise().toFuture
    @inline def deleteProvisionedProductPlanFuture(
        params: DeleteProvisionedProductPlanInput
    ): Future[DeleteProvisionedProductPlanOutput] = service.deleteProvisionedProductPlan(params).promise().toFuture
    @inline def deleteProvisioningArtifactFuture(
        params: DeleteProvisioningArtifactInput
    ): Future[DeleteProvisioningArtifactOutput] = service.deleteProvisioningArtifact(params).promise().toFuture
    @inline def deleteServiceActionFuture(params: DeleteServiceActionInput): Future[DeleteServiceActionOutput] =
      service.deleteServiceAction(params).promise().toFuture
    @inline def deleteTagOptionFuture(params: DeleteTagOptionInput): Future[DeleteTagOptionOutput] =
      service.deleteTagOption(params).promise().toFuture
    @inline def describeConstraintFuture(params: DescribeConstraintInput): Future[DescribeConstraintOutput] =
      service.describeConstraint(params).promise().toFuture
    @inline def describeCopyProductStatusFuture(
        params: DescribeCopyProductStatusInput
    ): Future[DescribeCopyProductStatusOutput] = service.describeCopyProductStatus(params).promise().toFuture
    @inline def describePortfolioFuture(params: DescribePortfolioInput): Future[DescribePortfolioOutput] =
      service.describePortfolio(params).promise().toFuture
    @inline def describePortfolioShareStatusFuture(
        params: DescribePortfolioShareStatusInput
    ): Future[DescribePortfolioShareStatusOutput] = service.describePortfolioShareStatus(params).promise().toFuture
    @inline def describeProductAsAdminFuture(
        params: DescribeProductAsAdminInput
    ): Future[DescribeProductAsAdminOutput] = service.describeProductAsAdmin(params).promise().toFuture
    @inline def describeProductFuture(params: DescribeProductInput): Future[DescribeProductOutput] =
      service.describeProduct(params).promise().toFuture
    @inline def describeProductViewFuture(params: DescribeProductViewInput): Future[DescribeProductViewOutput] =
      service.describeProductView(params).promise().toFuture
    @inline def describeProvisionedProductFuture(
        params: DescribeProvisionedProductInput
    ): Future[DescribeProvisionedProductOutput] = service.describeProvisionedProduct(params).promise().toFuture
    @inline def describeProvisionedProductPlanFuture(
        params: DescribeProvisionedProductPlanInput
    ): Future[DescribeProvisionedProductPlanOutput] = service.describeProvisionedProductPlan(params).promise().toFuture
    @inline def describeProvisioningArtifactFuture(
        params: DescribeProvisioningArtifactInput
    ): Future[DescribeProvisioningArtifactOutput] = service.describeProvisioningArtifact(params).promise().toFuture
    @inline def describeProvisioningParametersFuture(
        params: DescribeProvisioningParametersInput
    ): Future[DescribeProvisioningParametersOutput] = service.describeProvisioningParameters(params).promise().toFuture
    @inline def describeRecordFuture(params: DescribeRecordInput): Future[DescribeRecordOutput] =
      service.describeRecord(params).promise().toFuture
    @inline def describeServiceActionExecutionParametersFuture(
        params: DescribeServiceActionExecutionParametersInput
    ): Future[DescribeServiceActionExecutionParametersOutput] =
      service.describeServiceActionExecutionParameters(params).promise().toFuture
    @inline def describeServiceActionFuture(params: DescribeServiceActionInput): Future[DescribeServiceActionOutput] =
      service.describeServiceAction(params).promise().toFuture
    @inline def describeTagOptionFuture(params: DescribeTagOptionInput): Future[DescribeTagOptionOutput] =
      service.describeTagOption(params).promise().toFuture
    @inline def disableAWSOrganizationsAccessFuture(
        params: DisableAWSOrganizationsAccessInput
    ): Future[DisableAWSOrganizationsAccessOutput] = service.disableAWSOrganizationsAccess(params).promise().toFuture
    @inline def disassociateBudgetFromResourceFuture(
        params: DisassociateBudgetFromResourceInput
    ): Future[DisassociateBudgetFromResourceOutput] = service.disassociateBudgetFromResource(params).promise().toFuture
    @inline def disassociatePrincipalFromPortfolioFuture(
        params: DisassociatePrincipalFromPortfolioInput
    ): Future[DisassociatePrincipalFromPortfolioOutput] =
      service.disassociatePrincipalFromPortfolio(params).promise().toFuture
    @inline def disassociateProductFromPortfolioFuture(
        params: DisassociateProductFromPortfolioInput
    ): Future[DisassociateProductFromPortfolioOutput] =
      service.disassociateProductFromPortfolio(params).promise().toFuture
    @inline def disassociateServiceActionFromProvisioningArtifactFuture(
        params: DisassociateServiceActionFromProvisioningArtifactInput
    ): Future[DisassociateServiceActionFromProvisioningArtifactOutput] =
      service.disassociateServiceActionFromProvisioningArtifact(params).promise().toFuture
    @inline def disassociateTagOptionFromResourceFuture(
        params: DisassociateTagOptionFromResourceInput
    ): Future[DisassociateTagOptionFromResourceOutput] =
      service.disassociateTagOptionFromResource(params).promise().toFuture
    @inline def enableAWSOrganizationsAccessFuture(
        params: EnableAWSOrganizationsAccessInput
    ): Future[EnableAWSOrganizationsAccessOutput] = service.enableAWSOrganizationsAccess(params).promise().toFuture
    @inline def executeProvisionedProductPlanFuture(
        params: ExecuteProvisionedProductPlanInput
    ): Future[ExecuteProvisionedProductPlanOutput] = service.executeProvisionedProductPlan(params).promise().toFuture
    @inline def executeProvisionedProductServiceActionFuture(
        params: ExecuteProvisionedProductServiceActionInput
    ): Future[ExecuteProvisionedProductServiceActionOutput] =
      service.executeProvisionedProductServiceAction(params).promise().toFuture
    @inline def getAWSOrganizationsAccessStatusFuture(
        params: GetAWSOrganizationsAccessStatusInput
    ): Future[GetAWSOrganizationsAccessStatusOutput] =
      service.getAWSOrganizationsAccessStatus(params).promise().toFuture
    @inline def listAcceptedPortfolioSharesFuture(
        params: ListAcceptedPortfolioSharesInput
    ): Future[ListAcceptedPortfolioSharesOutput] = service.listAcceptedPortfolioShares(params).promise().toFuture
    @inline def listBudgetsForResourceFuture(
        params: ListBudgetsForResourceInput
    ): Future[ListBudgetsForResourceOutput] = service.listBudgetsForResource(params).promise().toFuture
    @inline def listConstraintsForPortfolioFuture(
        params: ListConstraintsForPortfolioInput
    ): Future[ListConstraintsForPortfolioOutput] = service.listConstraintsForPortfolio(params).promise().toFuture
    @inline def listLaunchPathsFuture(params: ListLaunchPathsInput): Future[ListLaunchPathsOutput] =
      service.listLaunchPaths(params).promise().toFuture
    @inline def listOrganizationPortfolioAccessFuture(
        params: ListOrganizationPortfolioAccessInput
    ): Future[ListOrganizationPortfolioAccessOutput] =
      service.listOrganizationPortfolioAccess(params).promise().toFuture
    @inline def listPortfolioAccessFuture(params: ListPortfolioAccessInput): Future[ListPortfolioAccessOutput] =
      service.listPortfolioAccess(params).promise().toFuture
    @inline def listPortfoliosForProductFuture(
        params: ListPortfoliosForProductInput
    ): Future[ListPortfoliosForProductOutput] = service.listPortfoliosForProduct(params).promise().toFuture
    @inline def listPortfoliosFuture(params: ListPortfoliosInput): Future[ListPortfoliosOutput] =
      service.listPortfolios(params).promise().toFuture
    @inline def listPrincipalsForPortfolioFuture(
        params: ListPrincipalsForPortfolioInput
    ): Future[ListPrincipalsForPortfolioOutput] = service.listPrincipalsForPortfolio(params).promise().toFuture
    @inline def listProvisionedProductPlansFuture(
        params: ListProvisionedProductPlansInput
    ): Future[ListProvisionedProductPlansOutput] = service.listProvisionedProductPlans(params).promise().toFuture
    @inline def listProvisioningArtifactsForServiceActionFuture(
        params: ListProvisioningArtifactsForServiceActionInput
    ): Future[ListProvisioningArtifactsForServiceActionOutput] =
      service.listProvisioningArtifactsForServiceAction(params).promise().toFuture
    @inline def listProvisioningArtifactsFuture(
        params: ListProvisioningArtifactsInput
    ): Future[ListProvisioningArtifactsOutput] = service.listProvisioningArtifacts(params).promise().toFuture
    @inline def listRecordHistoryFuture(params: ListRecordHistoryInput): Future[ListRecordHistoryOutput] =
      service.listRecordHistory(params).promise().toFuture
    @inline def listResourcesForTagOptionFuture(
        params: ListResourcesForTagOptionInput
    ): Future[ListResourcesForTagOptionOutput] = service.listResourcesForTagOption(params).promise().toFuture
    @inline def listServiceActionsForProvisioningArtifactFuture(
        params: ListServiceActionsForProvisioningArtifactInput
    ): Future[ListServiceActionsForProvisioningArtifactOutput] =
      service.listServiceActionsForProvisioningArtifact(params).promise().toFuture
    @inline def listServiceActionsFuture(params: ListServiceActionsInput): Future[ListServiceActionsOutput] =
      service.listServiceActions(params).promise().toFuture
    @inline def listStackInstancesForProvisionedProductFuture(
        params: ListStackInstancesForProvisionedProductInput
    ): Future[ListStackInstancesForProvisionedProductOutput] =
      service.listStackInstancesForProvisionedProduct(params).promise().toFuture
    @inline def listTagOptionsFuture(params: ListTagOptionsInput): Future[ListTagOptionsOutput] =
      service.listTagOptions(params).promise().toFuture
    @inline def provisionProductFuture(params: ProvisionProductInput): Future[ProvisionProductOutput] =
      service.provisionProduct(params).promise().toFuture
    @inline def rejectPortfolioShareFuture(params: RejectPortfolioShareInput): Future[RejectPortfolioShareOutput] =
      service.rejectPortfolioShare(params).promise().toFuture
    @inline def scanProvisionedProductsFuture(
        params: ScanProvisionedProductsInput
    ): Future[ScanProvisionedProductsOutput] = service.scanProvisionedProducts(params).promise().toFuture
    @inline def searchProductsAsAdminFuture(params: SearchProductsAsAdminInput): Future[SearchProductsAsAdminOutput] =
      service.searchProductsAsAdmin(params).promise().toFuture
    @inline def searchProductsFuture(params: SearchProductsInput): Future[SearchProductsOutput] =
      service.searchProducts(params).promise().toFuture
    @inline def searchProvisionedProductsFuture(
        params: SearchProvisionedProductsInput
    ): Future[SearchProvisionedProductsOutput] = service.searchProvisionedProducts(params).promise().toFuture
    @inline def terminateProvisionedProductFuture(
        params: TerminateProvisionedProductInput
    ): Future[TerminateProvisionedProductOutput] = service.terminateProvisionedProduct(params).promise().toFuture
    @inline def updateConstraintFuture(params: UpdateConstraintInput): Future[UpdateConstraintOutput] =
      service.updateConstraint(params).promise().toFuture
    @inline def updatePortfolioFuture(params: UpdatePortfolioInput): Future[UpdatePortfolioOutput] =
      service.updatePortfolio(params).promise().toFuture
    @inline def updateProductFuture(params: UpdateProductInput): Future[UpdateProductOutput] =
      service.updateProduct(params).promise().toFuture
    @inline def updateProvisionedProductFuture(
        params: UpdateProvisionedProductInput
    ): Future[UpdateProvisionedProductOutput] = service.updateProvisionedProduct(params).promise().toFuture
    @inline def updateProvisionedProductPropertiesFuture(
        params: UpdateProvisionedProductPropertiesInput
    ): Future[UpdateProvisionedProductPropertiesOutput] =
      service.updateProvisionedProductProperties(params).promise().toFuture
    @inline def updateProvisioningArtifactFuture(
        params: UpdateProvisioningArtifactInput
    ): Future[UpdateProvisioningArtifactOutput] = service.updateProvisioningArtifact(params).promise().toFuture
    @inline def updateServiceActionFuture(params: UpdateServiceActionInput): Future[UpdateServiceActionOutput] =
      service.updateServiceAction(params).promise().toFuture
    @inline def updateTagOptionFuture(params: UpdateTagOptionInput): Future[UpdateTagOptionOutput] =
      service.updateTagOption(params).promise().toFuture
  }
}

package servicecatalog {
  @js.native
  @JSImport("aws-sdk", "ServiceCatalog")
  class ServiceCatalog() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptPortfolioShare(params: AcceptPortfolioShareInput): Request[AcceptPortfolioShareOutput] = js.native
    def associateBudgetWithResource(
        params: AssociateBudgetWithResourceInput
    ): Request[AssociateBudgetWithResourceOutput] = js.native
    def associatePrincipalWithPortfolio(
        params: AssociatePrincipalWithPortfolioInput
    ): Request[AssociatePrincipalWithPortfolioOutput] = js.native
    def associateProductWithPortfolio(
        params: AssociateProductWithPortfolioInput
    ): Request[AssociateProductWithPortfolioOutput] = js.native
    def associateServiceActionWithProvisioningArtifact(
        params: AssociateServiceActionWithProvisioningArtifactInput
    ): Request[AssociateServiceActionWithProvisioningArtifactOutput] = js.native
    def associateTagOptionWithResource(
        params: AssociateTagOptionWithResourceInput
    ): Request[AssociateTagOptionWithResourceOutput] = js.native
    def batchAssociateServiceActionWithProvisioningArtifact(
        params: BatchAssociateServiceActionWithProvisioningArtifactInput
    ): Request[BatchAssociateServiceActionWithProvisioningArtifactOutput] = js.native
    def batchDisassociateServiceActionFromProvisioningArtifact(
        params: BatchDisassociateServiceActionFromProvisioningArtifactInput
    ): Request[BatchDisassociateServiceActionFromProvisioningArtifactOutput]                         = js.native
    def copyProduct(params: CopyProductInput): Request[CopyProductOutput]                            = js.native
    def createConstraint(params: CreateConstraintInput): Request[CreateConstraintOutput]             = js.native
    def createPortfolio(params: CreatePortfolioInput): Request[CreatePortfolioOutput]                = js.native
    def createPortfolioShare(params: CreatePortfolioShareInput): Request[CreatePortfolioShareOutput] = js.native
    def createProduct(params: CreateProductInput): Request[CreateProductOutput]                      = js.native
    def createProvisionedProductPlan(
        params: CreateProvisionedProductPlanInput
    ): Request[CreateProvisionedProductPlanOutput] = js.native
    def createProvisioningArtifact(params: CreateProvisioningArtifactInput): Request[CreateProvisioningArtifactOutput] =
      js.native
    def createServiceAction(params: CreateServiceActionInput): Request[CreateServiceActionOutput]    = js.native
    def createTagOption(params: CreateTagOptionInput): Request[CreateTagOptionOutput]                = js.native
    def deleteConstraint(params: DeleteConstraintInput): Request[DeleteConstraintOutput]             = js.native
    def deletePortfolio(params: DeletePortfolioInput): Request[DeletePortfolioOutput]                = js.native
    def deletePortfolioShare(params: DeletePortfolioShareInput): Request[DeletePortfolioShareOutput] = js.native
    def deleteProduct(params: DeleteProductInput): Request[DeleteProductOutput]                      = js.native
    def deleteProvisionedProductPlan(
        params: DeleteProvisionedProductPlanInput
    ): Request[DeleteProvisionedProductPlanOutput] = js.native
    def deleteProvisioningArtifact(params: DeleteProvisioningArtifactInput): Request[DeleteProvisioningArtifactOutput] =
      js.native
    def deleteServiceAction(params: DeleteServiceActionInput): Request[DeleteServiceActionOutput] = js.native
    def deleteTagOption(params: DeleteTagOptionInput): Request[DeleteTagOptionOutput]             = js.native
    def describeConstraint(params: DescribeConstraintInput): Request[DescribeConstraintOutput]    = js.native
    def describeCopyProductStatus(params: DescribeCopyProductStatusInput): Request[DescribeCopyProductStatusOutput] =
      js.native
    def describePortfolio(params: DescribePortfolioInput): Request[DescribePortfolioOutput] = js.native
    def describePortfolioShareStatus(
        params: DescribePortfolioShareStatusInput
    ): Request[DescribePortfolioShareStatusOutput]                                                         = js.native
    def describeProduct(params: DescribeProductInput): Request[DescribeProductOutput]                      = js.native
    def describeProductAsAdmin(params: DescribeProductAsAdminInput): Request[DescribeProductAsAdminOutput] = js.native
    def describeProductView(params: DescribeProductViewInput): Request[DescribeProductViewOutput]          = js.native
    def describeProvisionedProduct(params: DescribeProvisionedProductInput): Request[DescribeProvisionedProductOutput] =
      js.native
    def describeProvisionedProductPlan(
        params: DescribeProvisionedProductPlanInput
    ): Request[DescribeProvisionedProductPlanOutput] = js.native
    def describeProvisioningArtifact(
        params: DescribeProvisioningArtifactInput
    ): Request[DescribeProvisioningArtifactOutput] = js.native
    def describeProvisioningParameters(
        params: DescribeProvisioningParametersInput
    ): Request[DescribeProvisioningParametersOutput]                                                    = js.native
    def describeRecord(params: DescribeRecordInput): Request[DescribeRecordOutput]                      = js.native
    def describeServiceAction(params: DescribeServiceActionInput): Request[DescribeServiceActionOutput] = js.native
    def describeServiceActionExecutionParameters(
        params: DescribeServiceActionExecutionParametersInput
    ): Request[DescribeServiceActionExecutionParametersOutput]                              = js.native
    def describeTagOption(params: DescribeTagOptionInput): Request[DescribeTagOptionOutput] = js.native
    def disableAWSOrganizationsAccess(
        params: DisableAWSOrganizationsAccessInput
    ): Request[DisableAWSOrganizationsAccessOutput] = js.native
    def disassociateBudgetFromResource(
        params: DisassociateBudgetFromResourceInput
    ): Request[DisassociateBudgetFromResourceOutput] = js.native
    def disassociatePrincipalFromPortfolio(
        params: DisassociatePrincipalFromPortfolioInput
    ): Request[DisassociatePrincipalFromPortfolioOutput] = js.native
    def disassociateProductFromPortfolio(
        params: DisassociateProductFromPortfolioInput
    ): Request[DisassociateProductFromPortfolioOutput] = js.native
    def disassociateServiceActionFromProvisioningArtifact(
        params: DisassociateServiceActionFromProvisioningArtifactInput
    ): Request[DisassociateServiceActionFromProvisioningArtifactOutput] = js.native
    def disassociateTagOptionFromResource(
        params: DisassociateTagOptionFromResourceInput
    ): Request[DisassociateTagOptionFromResourceOutput] = js.native
    def enableAWSOrganizationsAccess(
        params: EnableAWSOrganizationsAccessInput
    ): Request[EnableAWSOrganizationsAccessOutput] = js.native
    def executeProvisionedProductPlan(
        params: ExecuteProvisionedProductPlanInput
    ): Request[ExecuteProvisionedProductPlanOutput] = js.native
    def executeProvisionedProductServiceAction(
        params: ExecuteProvisionedProductServiceActionInput
    ): Request[ExecuteProvisionedProductServiceActionOutput] = js.native
    def getAWSOrganizationsAccessStatus(
        params: GetAWSOrganizationsAccessStatusInput
    ): Request[GetAWSOrganizationsAccessStatusOutput] = js.native
    def listAcceptedPortfolioShares(
        params: ListAcceptedPortfolioSharesInput
    ): Request[ListAcceptedPortfolioSharesOutput]                                                          = js.native
    def listBudgetsForResource(params: ListBudgetsForResourceInput): Request[ListBudgetsForResourceOutput] = js.native
    def listConstraintsForPortfolio(
        params: ListConstraintsForPortfolioInput
    ): Request[ListConstraintsForPortfolioOutput]                                     = js.native
    def listLaunchPaths(params: ListLaunchPathsInput): Request[ListLaunchPathsOutput] = js.native
    def listOrganizationPortfolioAccess(
        params: ListOrganizationPortfolioAccessInput
    ): Request[ListOrganizationPortfolioAccessOutput]                                             = js.native
    def listPortfolioAccess(params: ListPortfolioAccessInput): Request[ListPortfolioAccessOutput] = js.native
    def listPortfolios(params: ListPortfoliosInput): Request[ListPortfoliosOutput]                = js.native
    def listPortfoliosForProduct(params: ListPortfoliosForProductInput): Request[ListPortfoliosForProductOutput] =
      js.native
    def listPrincipalsForPortfolio(params: ListPrincipalsForPortfolioInput): Request[ListPrincipalsForPortfolioOutput] =
      js.native
    def listProvisionedProductPlans(
        params: ListProvisionedProductPlansInput
    ): Request[ListProvisionedProductPlansOutput] = js.native
    def listProvisioningArtifacts(params: ListProvisioningArtifactsInput): Request[ListProvisioningArtifactsOutput] =
      js.native
    def listProvisioningArtifactsForServiceAction(
        params: ListProvisioningArtifactsForServiceActionInput
    ): Request[ListProvisioningArtifactsForServiceActionOutput]                             = js.native
    def listRecordHistory(params: ListRecordHistoryInput): Request[ListRecordHistoryOutput] = js.native
    def listResourcesForTagOption(params: ListResourcesForTagOptionInput): Request[ListResourcesForTagOptionOutput] =
      js.native
    def listServiceActions(params: ListServiceActionsInput): Request[ListServiceActionsOutput] = js.native
    def listServiceActionsForProvisioningArtifact(
        params: ListServiceActionsForProvisioningArtifactInput
    ): Request[ListServiceActionsForProvisioningArtifactOutput] = js.native
    def listStackInstancesForProvisionedProduct(
        params: ListStackInstancesForProvisionedProductInput
    ): Request[ListStackInstancesForProvisionedProductOutput]                                        = js.native
    def listTagOptions(params: ListTagOptionsInput): Request[ListTagOptionsOutput]                   = js.native
    def provisionProduct(params: ProvisionProductInput): Request[ProvisionProductOutput]             = js.native
    def rejectPortfolioShare(params: RejectPortfolioShareInput): Request[RejectPortfolioShareOutput] = js.native
    def scanProvisionedProducts(params: ScanProvisionedProductsInput): Request[ScanProvisionedProductsOutput] =
      js.native
    def searchProducts(params: SearchProductsInput): Request[SearchProductsOutput]                      = js.native
    def searchProductsAsAdmin(params: SearchProductsAsAdminInput): Request[SearchProductsAsAdminOutput] = js.native
    def searchProvisionedProducts(params: SearchProvisionedProductsInput): Request[SearchProvisionedProductsOutput] =
      js.native
    def terminateProvisionedProduct(
        params: TerminateProvisionedProductInput
    ): Request[TerminateProvisionedProductOutput]                                        = js.native
    def updateConstraint(params: UpdateConstraintInput): Request[UpdateConstraintOutput] = js.native
    def updatePortfolio(params: UpdatePortfolioInput): Request[UpdatePortfolioOutput]    = js.native
    def updateProduct(params: UpdateProductInput): Request[UpdateProductOutput]          = js.native
    def updateProvisionedProduct(params: UpdateProvisionedProductInput): Request[UpdateProvisionedProductOutput] =
      js.native
    def updateProvisionedProductProperties(
        params: UpdateProvisionedProductPropertiesInput
    ): Request[UpdateProvisionedProductPropertiesOutput] = js.native
    def updateProvisioningArtifact(params: UpdateProvisioningArtifactInput): Request[UpdateProvisioningArtifactOutput] =
      js.native
    def updateServiceAction(params: UpdateServiceActionInput): Request[UpdateServiceActionOutput] = js.native
    def updateTagOption(params: UpdateTagOptionInput): Request[UpdateTagOptionOutput]             = js.native
  }

  @js.native
  @Factory
  trait AcceptPortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  @js.native
  @Factory
  trait AcceptPortfolioShareOutput extends js.Object {}

  /**
    * The access level to use to filter results.
    */
  @js.native
  @Factory
  trait AccessLevelFilter extends js.Object {
    var Key: js.UndefOr[AccessLevelFilterKey]
    var Value: js.UndefOr[AccessLevelFilterValue]
  }

  @js.native
  sealed trait AccessLevelFilterKey extends js.Any
  object AccessLevelFilterKey extends js.Object {
    val Account = "Account".asInstanceOf[AccessLevelFilterKey]
    val Role    = "Role".asInstanceOf[AccessLevelFilterKey]
    val User    = "User".asInstanceOf[AccessLevelFilterKey]

    val values = js.Object.freeze(js.Array(Account, Role, User))
  }

  @js.native
  sealed trait AccessStatus extends js.Any
  object AccessStatus extends js.Object {
    val ENABLED      = "ENABLED".asInstanceOf[AccessStatus]
    val UNDER_CHANGE = "UNDER_CHANGE".asInstanceOf[AccessStatus]
    val DISABLED     = "DISABLED".asInstanceOf[AccessStatus]

    val values = js.Object.freeze(js.Array(ENABLED, UNDER_CHANGE, DISABLED))
  }

  @js.native
  @Factory
  trait AssociateBudgetWithResourceInput extends js.Object {
    var BudgetName: BudgetName
    var ResourceId: Id
  }

  @js.native
  @Factory
  trait AssociateBudgetWithResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait AssociatePrincipalWithPortfolioInput extends js.Object {
    var PortfolioId: Id
    var PrincipalARN: PrincipalARN
    var PrincipalType: PrincipalType
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait AssociatePrincipalWithPortfolioOutput extends js.Object {}

  @js.native
  @Factory
  trait AssociateProductWithPortfolioInput extends js.Object {
    var PortfolioId: Id
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var SourcePortfolioId: js.UndefOr[Id]
  }

  @js.native
  @Factory
  trait AssociateProductWithPortfolioOutput extends js.Object {}

  @js.native
  @Factory
  trait AssociateServiceActionWithProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait AssociateServiceActionWithProvisioningArtifactOutput extends js.Object {}

  @js.native
  @Factory
  trait AssociateTagOptionWithResourceInput extends js.Object {
    var ResourceId: ResourceId
    var TagOptionId: TagOptionId
  }

  @js.native
  @Factory
  trait AssociateTagOptionWithResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait BatchAssociateServiceActionWithProvisioningArtifactInput extends js.Object {
    var ServiceActionAssociations: ServiceActionAssociations
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait BatchAssociateServiceActionWithProvisioningArtifactOutput extends js.Object {
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations]
  }

  @js.native
  @Factory
  trait BatchDisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
    var ServiceActionAssociations: ServiceActionAssociations
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait BatchDisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {
    var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations]
  }

  /**
    * Information about a budget.
    */
  @js.native
  @Factory
  trait BudgetDetail extends js.Object {
    var BudgetName: js.UndefOr[BudgetName]
  }

  @js.native
  sealed trait ChangeAction extends js.Any
  object ChangeAction extends js.Object {
    val ADD    = "ADD".asInstanceOf[ChangeAction]
    val MODIFY = "MODIFY".asInstanceOf[ChangeAction]
    val REMOVE = "REMOVE".asInstanceOf[ChangeAction]

    val values = js.Object.freeze(js.Array(ADD, MODIFY, REMOVE))
  }

  /**
    * Information about a CloudWatch dashboard.
    */
  @js.native
  @Factory
  trait CloudWatchDashboard extends js.Object {
    var Name: js.UndefOr[CloudWatchDashboardName]
  }

  /**
    * Information about a constraint.
    */
  @js.native
  @Factory
  trait ConstraintDetail extends js.Object {
    var ConstraintId: js.UndefOr[Id]
    var Description: js.UndefOr[ConstraintDescription]
    var Owner: js.UndefOr[AccountId]
    var Type: js.UndefOr[ConstraintType]
  }

  /**
    * Summary information about a constraint.
    */
  @js.native
  @Factory
  trait ConstraintSummary extends js.Object {
    var Description: js.UndefOr[ConstraintDescription]
    var Type: js.UndefOr[ConstraintType]
  }

  @js.native
  sealed trait CopyOption extends js.Any
  object CopyOption extends js.Object {
    val CopyTags = "CopyTags".asInstanceOf[CopyOption]

    val values = js.Object.freeze(js.Array(CopyTags))
  }

  @js.native
  @Factory
  trait CopyProductInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var SourceProductArn: ProductArn
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var CopyOptions: js.UndefOr[CopyOptions]
    var SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties]
    var TargetProductId: js.UndefOr[Id]
    var TargetProductName: js.UndefOr[ProductViewName]
  }

  @js.native
  @Factory
  trait CopyProductOutput extends js.Object {
    var CopyProductToken: js.UndefOr[Id]
  }

  @js.native
  sealed trait CopyProductStatus extends js.Any
  object CopyProductStatus extends js.Object {
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[CopyProductStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[CopyProductStatus]
    val FAILED      = "FAILED".asInstanceOf[CopyProductStatus]

    val values = js.Object.freeze(js.Array(SUCCEEDED, IN_PROGRESS, FAILED))
  }

  @js.native
  @Factory
  trait CreateConstraintInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Parameters: ConstraintParameters
    var PortfolioId: Id
    var ProductId: Id
    var Type: ConstraintType
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ConstraintDescription]
  }

  @js.native
  @Factory
  trait CreateConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait CreatePortfolioInput extends js.Object {
    var DisplayName: PortfolioDisplayName
    var IdempotencyToken: IdempotencyToken
    var ProviderName: ProviderName
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[PortfolioDescription]
    var Tags: js.UndefOr[AddTags]
  }

  @js.native
  @Factory
  trait CreatePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreatePortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccountId: js.UndefOr[AccountId]
    var OrganizationNode: js.UndefOr[OrganizationNode]
  }

  @js.native
  @Factory
  trait CreatePortfolioShareOutput extends js.Object {
    var PortfolioShareToken: js.UndefOr[Id]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateProductOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateProvisionedProductPlanOutput extends js.Object {
    var PlanId: js.UndefOr[Id]
    var PlanName: js.UndefOr[ProvisionedProductPlanName]
    var ProvisionProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductName]
    var ProvisioningArtifactId: js.UndefOr[Id]
  }

  @js.native
  @Factory
  trait CreateProvisioningArtifactInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Parameters: ProvisioningArtifactProperties
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait CreateProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait CreateServiceActionInput extends js.Object {
    var Definition: ServiceActionDefinitionMap
    var DefinitionType: ServiceActionDefinitionType
    var IdempotencyToken: IdempotencyToken
    var Name: ServiceActionName
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ServiceActionDescription]
  }

  @js.native
  @Factory
  trait CreateServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  @js.native
  @Factory
  trait CreateTagOptionInput extends js.Object {
    var Key: TagOptionKey
    var Value: TagOptionValue
  }

  @js.native
  @Factory
  trait CreateTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  @js.native
  @Factory
  trait DeleteConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DeleteConstraintOutput extends js.Object {}

  @js.native
  @Factory
  trait DeletePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DeletePortfolioOutput extends js.Object {}

  @js.native
  @Factory
  trait DeletePortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccountId: js.UndefOr[AccountId]
    var OrganizationNode: js.UndefOr[OrganizationNode]
  }

  @js.native
  @Factory
  trait DeletePortfolioShareOutput extends js.Object {
    var PortfolioShareToken: js.UndefOr[Id]
  }

  @js.native
  @Factory
  trait DeleteProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DeleteProductOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteProvisionedProductPlanInput extends js.Object {
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var IgnoreErrors: js.UndefOr[IgnoreErrors]
  }

  @js.native
  @Factory
  trait DeleteProvisionedProductPlanOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DeleteProvisioningArtifactOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DeleteServiceActionOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteTagOptionInput extends js.Object {
    var Id: TagOptionId
  }

  @js.native
  @Factory
  trait DeleteTagOptionOutput extends js.Object {}

  @js.native
  @Factory
  trait DescribeConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DescribeConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait DescribeCopyProductStatusInput extends js.Object {
    var CopyProductToken: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DescribeCopyProductStatusOutput extends js.Object {
    var CopyProductStatus: js.UndefOr[CopyProductStatus]
    var StatusDetail: js.UndefOr[StatusDetail]
    var TargetProductId: js.UndefOr[Id]
  }

  @js.native
  @Factory
  trait DescribePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DescribePortfolioOutput extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var TagOptions: js.UndefOr[TagOptionDetails]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait DescribePortfolioShareStatusInput extends js.Object {
    var PortfolioShareToken: Id
  }

  @js.native
  @Factory
  trait DescribePortfolioShareStatusOutput extends js.Object {
    var OrganizationNodeValue: js.UndefOr[OrganizationNodeValue]
    var PortfolioId: js.UndefOr[Id]
    var PortfolioShareToken: js.UndefOr[Id]
    var ShareDetails: js.UndefOr[ShareDetails]
    var Status: js.UndefOr[ShareStatus]
  }

  @js.native
  @Factory
  trait DescribeProductAsAdminInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DescribeProductAsAdminOutput extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var ProvisioningArtifactSummaries: js.UndefOr[ProvisioningArtifactSummaries]
    var TagOptions: js.UndefOr[TagOptionDetails]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait DescribeProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DescribeProductOutput extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts]
  }

  @js.native
  @Factory
  trait DescribeProductViewInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DescribeProductViewOutput extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifacts: js.UndefOr[ProvisioningArtifacts]
  }

  @js.native
  @Factory
  trait DescribeProvisionedProductInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DescribeProvisionedProductOutput extends js.Object {
    var CloudWatchDashboards: js.UndefOr[CloudWatchDashboards]
    var ProvisionedProductDetail: js.UndefOr[ProvisionedProductDetail]
  }

  @js.native
  @Factory
  trait DescribeProvisionedProductPlanInput extends js.Object {
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait DescribeProvisionedProductPlanOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProductPlanDetails: js.UndefOr[ProvisionedProductPlanDetails]
    var ResourceChanges: js.UndefOr[ResourceChanges]
  }

  @js.native
  @Factory
  trait DescribeProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Verbose: js.UndefOr[Verbose]
  }

  @js.native
  @Factory
  trait DescribeProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait DescribeProvisioningParametersInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PathId: js.UndefOr[Id]
  }

  @js.native
  @Factory
  trait DescribeProvisioningParametersOutput extends js.Object {
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries]
    var ProvisioningArtifactParameters: js.UndefOr[ProvisioningArtifactParameters]
    var ProvisioningArtifactPreferences: js.UndefOr[ProvisioningArtifactPreferences]
    var TagOptions: js.UndefOr[TagOptionSummaries]
    var UsageInstructions: js.UndefOr[UsageInstructions]
  }

  @js.native
  @Factory
  trait DescribeRecordInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait DescribeRecordOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var RecordDetail: js.UndefOr[RecordDetail]
    var RecordOutputs: js.UndefOr[RecordOutputs]
  }

  @js.native
  @Factory
  trait DescribeServiceActionExecutionParametersInput extends js.Object {
    var ProvisionedProductId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DescribeServiceActionExecutionParametersOutput extends js.Object {
    var ServiceActionParameters: js.UndefOr[ExecutionParameters]
  }

  @js.native
  @Factory
  trait DescribeServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DescribeServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  @js.native
  @Factory
  trait DescribeTagOptionInput extends js.Object {
    var Id: TagOptionId
  }

  @js.native
  @Factory
  trait DescribeTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  @js.native
  @Factory
  trait DisableAWSOrganizationsAccessInput extends js.Object {}

  @js.native
  @Factory
  trait DisableAWSOrganizationsAccessOutput extends js.Object {}

  @js.native
  @Factory
  trait DisassociateBudgetFromResourceInput extends js.Object {
    var BudgetName: BudgetName
    var ResourceId: Id
  }

  @js.native
  @Factory
  trait DisassociateBudgetFromResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait DisassociatePrincipalFromPortfolioInput extends js.Object {
    var PortfolioId: Id
    var PrincipalARN: PrincipalARN
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DisassociatePrincipalFromPortfolioOutput extends js.Object {}

  @js.native
  @Factory
  trait DisassociateProductFromPortfolioInput extends js.Object {
    var PortfolioId: Id
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DisassociateProductFromPortfolioOutput extends js.Object {}

  @js.native
  @Factory
  trait DisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait DisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {}

  @js.native
  @Factory
  trait DisassociateTagOptionFromResourceInput extends js.Object {
    var ResourceId: ResourceId
    var TagOptionId: TagOptionId
  }

  @js.native
  @Factory
  trait DisassociateTagOptionFromResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait EnableAWSOrganizationsAccessInput extends js.Object {}

  @js.native
  @Factory
  trait EnableAWSOrganizationsAccessOutput extends js.Object {}

  @js.native
  sealed trait EvaluationType extends js.Any
  object EvaluationType extends js.Object {
    val STATIC  = "STATIC".asInstanceOf[EvaluationType]
    val DYNAMIC = "DYNAMIC".asInstanceOf[EvaluationType]

    val values = js.Object.freeze(js.Array(STATIC, DYNAMIC))
  }

  @js.native
  @Factory
  trait ExecuteProvisionedProductPlanInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var PlanId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait ExecuteProvisionedProductPlanOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  @js.native
  @Factory
  trait ExecuteProvisionedProductServiceActionInput extends js.Object {
    var ExecuteToken: IdempotencyToken
    var ProvisionedProductId: Id
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Parameters: js.UndefOr[ExecutionParameterMap]
  }

  @js.native
  @Factory
  trait ExecuteProvisionedProductServiceActionOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  /**
    * Details of an execution parameter value that is passed to a self-service action when executed on a provisioned product.
    */
  @js.native
  @Factory
  trait ExecutionParameter extends js.Object {
    var DefaultValues: js.UndefOr[ExecutionParameterValueList]
    var Name: js.UndefOr[ExecutionParameterKey]
    var Type: js.UndefOr[ExecutionParameterType]
  }

  /**
    * An object containing information about the error, along with identifying information about the self-service action and its associations.
    */
  @js.native
  @Factory
  trait FailedServiceActionAssociation extends js.Object {
    var ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode]
    var ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage]
    var ProductId: js.UndefOr[Id]
    var ProvisioningArtifactId: js.UndefOr[Id]
    var ServiceActionId: js.UndefOr[Id]
  }

  @js.native
  @Factory
  trait GetAWSOrganizationsAccessStatusInput extends js.Object {}

  @js.native
  @Factory
  trait GetAWSOrganizationsAccessStatusOutput extends js.Object {
    var AccessStatus: js.UndefOr[AccessStatus]
  }

  /**
    * Summary information about a product path for a user.
    */
  @js.native
  @Factory
  trait LaunchPathSummary extends js.Object {
    var ConstraintSummaries: js.UndefOr[ConstraintSummaries]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[PortfolioName]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait ListAcceptedPortfolioSharesInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  @js.native
  @Factory
  trait ListAcceptedPortfolioSharesOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  @js.native
  @Factory
  trait ListBudgetsForResourceInput extends js.Object {
    var ResourceId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListBudgetsForResourceOutput extends js.Object {
    var Budgets: js.UndefOr[Budgets]
    var NextPageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListConstraintsForPortfolioInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ProductId: js.UndefOr[Id]
  }

  @js.native
  @Factory
  trait ListConstraintsForPortfolioOutput extends js.Object {
    var ConstraintDetails: js.UndefOr[ConstraintDetails]
    var NextPageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListLaunchPathsInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListLaunchPathsOutput extends js.Object {
    var LaunchPathSummaries: js.UndefOr[LaunchPathSummaries]
    var NextPageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListOrganizationPortfolioAccessInput extends js.Object {
    var OrganizationNodeType: OrganizationNodeType
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListOrganizationPortfolioAccessOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var OrganizationNodes: js.UndefOr[OrganizationNodes]
  }

  @js.native
  @Factory
  trait ListPortfolioAccessInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var OrganizationParentId: js.UndefOr[Id]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListPortfolioAccessOutput extends js.Object {
    var AccountIds: js.UndefOr[AccountIds]
    var NextPageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListPortfoliosForProductInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListPortfoliosForProductOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  @js.native
  @Factory
  trait ListPortfoliosInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListPortfoliosOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var PortfolioDetails: js.UndefOr[PortfolioDetails]
  }

  @js.native
  @Factory
  trait ListPrincipalsForPortfolioInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListPrincipalsForPortfolioOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var Principals: js.UndefOr[Principals]
  }

  @js.native
  @Factory
  trait ListProvisionedProductPlansInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ProvisionProductId: js.UndefOr[Id]
  }

  @js.native
  @Factory
  trait ListProvisionedProductPlansOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProductPlans: js.UndefOr[ProvisionedProductPlans]
  }

  @js.native
  @Factory
  trait ListProvisioningArtifactsForServiceActionInput extends js.Object {
    var ServiceActionId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListProvisioningArtifactsForServiceActionOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisioningArtifactViews: js.UndefOr[ProvisioningArtifactViews]
  }

  @js.native
  @Factory
  trait ListProvisioningArtifactsInput extends js.Object {
    var ProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait ListProvisioningArtifactsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisioningArtifactDetails: js.UndefOr[ProvisioningArtifactDetails]
  }

  @js.native
  @Factory
  trait ListRecordHistoryInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var SearchFilter: js.UndefOr[ListRecordHistorySearchFilter]
  }

  @js.native
  @Factory
  trait ListRecordHistoryOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var RecordDetails: js.UndefOr[RecordDetails]
  }

  /**
    * The search filter to use when listing history records.
    */
  @js.native
  @Factory
  trait ListRecordHistorySearchFilter extends js.Object {
    var Key: js.UndefOr[SearchFilterKey]
    var Value: js.UndefOr[SearchFilterValue]
  }

  @js.native
  @Factory
  trait ListResourcesForTagOptionInput extends js.Object {
    var TagOptionId: TagOptionId
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  @Factory
  trait ListResourcesForTagOptionOutput extends js.Object {
    var PageToken: js.UndefOr[PageToken]
    var ResourceDetails: js.UndefOr[ResourceDetails]
  }

  @js.native
  @Factory
  trait ListServiceActionsForProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListServiceActionsForProvisioningArtifactOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries]
  }

  @js.native
  @Factory
  trait ListServiceActionsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListServiceActionsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ServiceActionSummaries: js.UndefOr[ServiceActionSummaries]
  }

  @js.native
  @Factory
  trait ListStackInstancesForProvisionedProductInput extends js.Object {
    var ProvisionedProductId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListStackInstancesForProvisionedProductOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var StackInstances: js.UndefOr[StackInstances]
  }

  /**
    * Filters to use when listing TagOptions.
    */
  @js.native
  @Factory
  trait ListTagOptionsFilters extends js.Object {
    var Active: js.UndefOr[TagOptionActive]
    var Key: js.UndefOr[TagOptionKey]
    var Value: js.UndefOr[TagOptionValue]
  }

  @js.native
  @Factory
  trait ListTagOptionsInput extends js.Object {
    var Filters: js.UndefOr[ListTagOptionsFilters]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ListTagOptionsOutput extends js.Object {
    var PageToken: js.UndefOr[PageToken]
    var TagOptionDetails: js.UndefOr[TagOptionDetails]
  }

  /**
    * Information about the organization node.
    */
  @js.native
  @Factory
  trait OrganizationNode extends js.Object {
    var Type: js.UndefOr[OrganizationNodeType]
    var Value: js.UndefOr[OrganizationNodeValue]
  }

  @js.native
  sealed trait OrganizationNodeType extends js.Any
  object OrganizationNodeType extends js.Object {
    val ORGANIZATION        = "ORGANIZATION".asInstanceOf[OrganizationNodeType]
    val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[OrganizationNodeType]
    val ACCOUNT             = "ACCOUNT".asInstanceOf[OrganizationNodeType]

    val values = js.Object.freeze(js.Array(ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT))
  }

  /**
    * The constraints that the administrator has put on the parameter.
    */
  @js.native
  @Factory
  trait ParameterConstraints extends js.Object {
    var AllowedValues: js.UndefOr[AllowedValues]
  }

  /**
    * Information about a portfolio.
    */
  @js.native
  @Factory
  trait PortfolioDetail extends js.Object {
    var ARN: js.UndefOr[ResourceARN]
    var CreatedTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[PortfolioDescription]
    var DisplayName: js.UndefOr[PortfolioDisplayName]
    var Id: js.UndefOr[Id]
    var ProviderName: js.UndefOr[ProviderName]
  }

  @js.native
  sealed trait PortfolioShareType extends js.Any
  object PortfolioShareType extends js.Object {
    val IMPORTED           = "IMPORTED".asInstanceOf[PortfolioShareType]
    val AWS_SERVICECATALOG = "AWS_SERVICECATALOG".asInstanceOf[PortfolioShareType]
    val AWS_ORGANIZATIONS  = "AWS_ORGANIZATIONS".asInstanceOf[PortfolioShareType]

    val values = js.Object.freeze(js.Array(IMPORTED, AWS_SERVICECATALOG, AWS_ORGANIZATIONS))
  }

  /**
    * Information about a principal.
    */
  @js.native
  @Factory
  trait Principal extends js.Object {
    var PrincipalARN: js.UndefOr[PrincipalARN]
    var PrincipalType: js.UndefOr[PrincipalType]
  }

  @js.native
  sealed trait PrincipalType extends js.Any
  object PrincipalType extends js.Object {
    val IAM = "IAM".asInstanceOf[PrincipalType]

    val values = js.Object.freeze(js.Array(IAM))
  }

  @js.native
  sealed trait ProductSource extends js.Any
  object ProductSource extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[ProductSource]

    val values = js.Object.freeze(js.Array(ACCOUNT))
  }

  @js.native
  sealed trait ProductType extends js.Any
  object ProductType extends js.Object {
    val CLOUD_FORMATION_TEMPLATE = "CLOUD_FORMATION_TEMPLATE".asInstanceOf[ProductType]
    val MARKETPLACE              = "MARKETPLACE".asInstanceOf[ProductType]

    val values = js.Object.freeze(js.Array(CLOUD_FORMATION_TEMPLATE, MARKETPLACE))
  }

  /**
    * A single product view aggregation value/count pair, containing metadata about each product to which the calling user has access.
    */
  @js.native
  @Factory
  trait ProductViewAggregationValue extends js.Object {
    var ApproximateCount: js.UndefOr[ApproximateCount]
    var Value: js.UndefOr[AttributeValue]
  }

  /**
    * Information about a product view.
    */
  @js.native
  @Factory
  trait ProductViewDetail extends js.Object {
    var CreatedTime: js.UndefOr[CreatedTime]
    var ProductARN: js.UndefOr[ResourceARN]
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var Status: js.UndefOr[Status]
  }

  @js.native
  sealed trait ProductViewFilterBy extends js.Any
  object ProductViewFilterBy extends js.Object {
    val FullTextSearch  = "FullTextSearch".asInstanceOf[ProductViewFilterBy]
    val Owner           = "Owner".asInstanceOf[ProductViewFilterBy]
    val ProductType     = "ProductType".asInstanceOf[ProductViewFilterBy]
    val SourceProductId = "SourceProductId".asInstanceOf[ProductViewFilterBy]

    val values = js.Object.freeze(js.Array(FullTextSearch, Owner, ProductType, SourceProductId))
  }

  @js.native
  sealed trait ProductViewSortBy extends js.Any
  object ProductViewSortBy extends js.Object {
    val Title        = "Title".asInstanceOf[ProductViewSortBy]
    val VersionCount = "VersionCount".asInstanceOf[ProductViewSortBy]
    val CreationDate = "CreationDate".asInstanceOf[ProductViewSortBy]

    val values = js.Object.freeze(js.Array(Title, VersionCount, CreationDate))
  }

  /**
    * Summary information about a product view.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait PropertyKey extends js.Any
  object PropertyKey extends js.Object {
    val OWNER = "OWNER".asInstanceOf[PropertyKey]

    val values = js.Object.freeze(js.Array(OWNER))
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ProvisionProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  /**
    * Information about a provisioned product.
    */
  @js.native
  @Factory
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

  /**
    * Information about a provisioned product.
    */
  @js.native
  @Factory
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

  /**
    * Information about a plan.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait ProvisionedProductPlanStatus extends js.Any
  object ProvisionedProductPlanStatus extends js.Object {
    val CREATE_IN_PROGRESS  = "CREATE_IN_PROGRESS".asInstanceOf[ProvisionedProductPlanStatus]
    val CREATE_SUCCESS      = "CREATE_SUCCESS".asInstanceOf[ProvisionedProductPlanStatus]
    val CREATE_FAILED       = "CREATE_FAILED".asInstanceOf[ProvisionedProductPlanStatus]
    val EXECUTE_IN_PROGRESS = "EXECUTE_IN_PROGRESS".asInstanceOf[ProvisionedProductPlanStatus]
    val EXECUTE_SUCCESS     = "EXECUTE_SUCCESS".asInstanceOf[ProvisionedProductPlanStatus]
    val EXECUTE_FAILED      = "EXECUTE_FAILED".asInstanceOf[ProvisionedProductPlanStatus]

    val values = js.Object.freeze(
      js.Array(CREATE_IN_PROGRESS, CREATE_SUCCESS, CREATE_FAILED, EXECUTE_IN_PROGRESS, EXECUTE_SUCCESS, EXECUTE_FAILED)
    )
  }

  /**
    * Summary information about a plan.
    */
  @js.native
  @Factory
  trait ProvisionedProductPlanSummary extends js.Object {
    var PlanId: js.UndefOr[Id]
    var PlanName: js.UndefOr[ProvisionedProductPlanName]
    var PlanType: js.UndefOr[ProvisionedProductPlanType]
    var ProvisionProductId: js.UndefOr[Id]
    var ProvisionProductName: js.UndefOr[ProvisionedProductName]
    var ProvisioningArtifactId: js.UndefOr[Id]
  }

  @js.native
  sealed trait ProvisionedProductPlanType extends js.Any
  object ProvisionedProductPlanType extends js.Object {
    val CLOUDFORMATION = "CLOUDFORMATION".asInstanceOf[ProvisionedProductPlanType]

    val values = js.Object.freeze(js.Array(CLOUDFORMATION))
  }

  @js.native
  sealed trait ProvisionedProductStatus extends js.Any
  object ProvisionedProductStatus extends js.Object {
    val AVAILABLE        = "AVAILABLE".asInstanceOf[ProvisionedProductStatus]
    val UNDER_CHANGE     = "UNDER_CHANGE".asInstanceOf[ProvisionedProductStatus]
    val TAINTED          = "TAINTED".asInstanceOf[ProvisionedProductStatus]
    val ERROR            = "ERROR".asInstanceOf[ProvisionedProductStatus]
    val PLAN_IN_PROGRESS = "PLAN_IN_PROGRESS".asInstanceOf[ProvisionedProductStatus]

    val values = js.Object.freeze(js.Array(AVAILABLE, UNDER_CHANGE, TAINTED, ERROR, PLAN_IN_PROGRESS))
  }

  @js.native
  sealed trait ProvisionedProductViewFilterBy extends js.Any
  object ProvisionedProductViewFilterBy extends js.Object {
    val SearchQuery = "SearchQuery".asInstanceOf[ProvisionedProductViewFilterBy]

    val values = js.Object.freeze(js.Array(SearchQuery))
  }

  /**
    * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
    */
  @js.native
  @Factory
  trait ProvisioningArtifact extends js.Object {
    var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Guidance: js.UndefOr[ProvisioningArtifactGuidance]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
  }

  /**
    * Information about a provisioning artifact (also known as a version) for a product.
    */
  @js.native
  @Factory
  trait ProvisioningArtifactDetail extends js.Object {
    var Active: js.UndefOr[ProvisioningArtifactActive]
    var CreatedTime: js.UndefOr[CreationTime]
    var Description: js.UndefOr[ProvisioningArtifactName]
    var Guidance: js.UndefOr[ProvisioningArtifactGuidance]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var Type: js.UndefOr[ProvisioningArtifactType]
  }

  @js.native
  sealed trait ProvisioningArtifactGuidance extends js.Any
  object ProvisioningArtifactGuidance extends js.Object {
    val DEFAULT    = "DEFAULT".asInstanceOf[ProvisioningArtifactGuidance]
    val DEPRECATED = "DEPRECATED".asInstanceOf[ProvisioningArtifactGuidance]

    val values = js.Object.freeze(js.Array(DEFAULT, DEPRECATED))
  }

  /**
    * Information about a parameter used to provision a product.
    */
  @js.native
  @Factory
  trait ProvisioningArtifactParameter extends js.Object {
    var DefaultValue: js.UndefOr[DefaultValue]
    var Description: js.UndefOr[Description]
    var IsNoEcho: js.UndefOr[NoEcho]
    var ParameterConstraints: js.UndefOr[ParameterConstraints]
    var ParameterKey: js.UndefOr[ParameterKey]
    var ParameterType: js.UndefOr[ParameterType]
  }

  /**
    * The user-defined preferences that will be applied during product provisioning, unless overridden by <code>ProvisioningPreferences</code> or <code>UpdateProvisioningPreferences</code>.
    *  For more information on maximum concurrent accounts and failure tolerance, see [[https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options|Stack set operation options]] in the <i>AWS CloudFormation User Guide</i>.
    */
  @js.native
  @Factory
  trait ProvisioningArtifactPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  /**
    * Information about a provisioning artifact (also known as a version) for a product.
    */
  @js.native
  @Factory
  trait ProvisioningArtifactProperties extends js.Object {
    var Info: ProvisioningArtifactInfo
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var DisableTemplateValidation: js.UndefOr[DisableTemplateValidation]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var Type: js.UndefOr[ProvisioningArtifactType]
  }

  @js.native
  sealed trait ProvisioningArtifactPropertyName extends js.Any
  object ProvisioningArtifactPropertyName extends js.Object {
    val Id = "Id".asInstanceOf[ProvisioningArtifactPropertyName]

    val values = js.Object.freeze(js.Array(Id))
  }

  /**
    * Summary information about a provisioning artifact (also known as a version) for a product.
    */
  @js.native
  @Factory
  trait ProvisioningArtifactSummary extends js.Object {
    var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ProvisioningArtifactName]
    var ProvisioningArtifactMetadata: js.UndefOr[ProvisioningArtifactInfo]
  }

  @js.native
  sealed trait ProvisioningArtifactType extends js.Any
  object ProvisioningArtifactType extends js.Object {
    val CLOUD_FORMATION_TEMPLATE = "CLOUD_FORMATION_TEMPLATE".asInstanceOf[ProvisioningArtifactType]
    val MARKETPLACE_AMI          = "MARKETPLACE_AMI".asInstanceOf[ProvisioningArtifactType]
    val MARKETPLACE_CAR          = "MARKETPLACE_CAR".asInstanceOf[ProvisioningArtifactType]

    val values = js.Object.freeze(js.Array(CLOUD_FORMATION_TEMPLATE, MARKETPLACE_AMI, MARKETPLACE_CAR))
  }

  /**
    * An object that contains summary information about a product view and a provisioning artifact.
    */
  @js.native
  @Factory
  trait ProvisioningArtifactView extends js.Object {
    var ProductViewSummary: js.UndefOr[ProductViewSummary]
    var ProvisioningArtifact: js.UndefOr[ProvisioningArtifact]
  }

  /**
    * Information about a parameter used to provision a product.
    */
  @js.native
  @Factory
  trait ProvisioningParameter extends js.Object {
    var Key: js.UndefOr[ParameterKey]
    var Value: js.UndefOr[ParameterValue]
  }

  /**
    * The user-defined preferences that will be applied when updating a provisioned product. Not all preferences are applicable to all provisioned product types.
    */
  @js.native
  @Factory
  trait ProvisioningPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount]
    var StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage]
    var StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount]
    var StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  /**
    * Information about a request operation.
    */
  @js.native
  @Factory
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

  /**
    * The error code and description resulting from an operation.
    */
  @js.native
  @Factory
  trait RecordError extends js.Object {
    var Code: js.UndefOr[ErrorCode]
    var Description: js.UndefOr[ErrorDescription]
  }

  /**
    * The output for the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
    */
  @js.native
  @Factory
  trait RecordOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var OutputKey: js.UndefOr[OutputKey]
    var OutputValue: js.UndefOr[OutputValue]
  }

  @js.native
  sealed trait RecordStatus extends js.Any
  object RecordStatus extends js.Object {
    val CREATED              = "CREATED".asInstanceOf[RecordStatus]
    val IN_PROGRESS          = "IN_PROGRESS".asInstanceOf[RecordStatus]
    val IN_PROGRESS_IN_ERROR = "IN_PROGRESS_IN_ERROR".asInstanceOf[RecordStatus]
    val SUCCEEDED            = "SUCCEEDED".asInstanceOf[RecordStatus]
    val FAILED               = "FAILED".asInstanceOf[RecordStatus]

    val values = js.Object.freeze(js.Array(CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR, SUCCEEDED, FAILED))
  }

  /**
    * Information about a tag, which is a key-value pair.
    */
  @js.native
  @Factory
  trait RecordTag extends js.Object {
    var Key: js.UndefOr[RecordTagKey]
    var Value: js.UndefOr[RecordTagValue]
  }

  @js.native
  @Factory
  trait RejectPortfolioShareInput extends js.Object {
    var PortfolioId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var PortfolioShareType: js.UndefOr[PortfolioShareType]
  }

  @js.native
  @Factory
  trait RejectPortfolioShareOutput extends js.Object {}

  @js.native
  sealed trait Replacement extends js.Any
  object Replacement extends js.Object {
    val TRUE        = "TRUE".asInstanceOf[Replacement]
    val FALSE       = "FALSE".asInstanceOf[Replacement]
    val CONDITIONAL = "CONDITIONAL".asInstanceOf[Replacement]

    val values = js.Object.freeze(js.Array(TRUE, FALSE, CONDITIONAL))
  }

  @js.native
  sealed trait RequiresRecreation extends js.Any
  object RequiresRecreation extends js.Object {
    val NEVER         = "NEVER".asInstanceOf[RequiresRecreation]
    val CONDITIONALLY = "CONDITIONALLY".asInstanceOf[RequiresRecreation]
    val ALWAYS        = "ALWAYS".asInstanceOf[RequiresRecreation]

    val values = js.Object.freeze(js.Array(NEVER, CONDITIONALLY, ALWAYS))
  }

  @js.native
  sealed trait ResourceAttribute extends js.Any
  object ResourceAttribute extends js.Object {
    val PROPERTIES     = "PROPERTIES".asInstanceOf[ResourceAttribute]
    val METADATA       = "METADATA".asInstanceOf[ResourceAttribute]
    val CREATIONPOLICY = "CREATIONPOLICY".asInstanceOf[ResourceAttribute]
    val UPDATEPOLICY   = "UPDATEPOLICY".asInstanceOf[ResourceAttribute]
    val DELETIONPOLICY = "DELETIONPOLICY".asInstanceOf[ResourceAttribute]
    val TAGS           = "TAGS".asInstanceOf[ResourceAttribute]

    val values = js.Object.freeze(js.Array(PROPERTIES, METADATA, CREATIONPOLICY, UPDATEPOLICY, DELETIONPOLICY, TAGS))
  }

  /**
    * Information about a resource change that will occur when a plan is executed.
    */
  @js.native
  @Factory
  trait ResourceChange extends js.Object {
    var Action: js.UndefOr[ChangeAction]
    var Details: js.UndefOr[ResourceChangeDetails]
    var LogicalResourceId: js.UndefOr[LogicalResourceId]
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId]
    var Replacement: js.UndefOr[Replacement]
    var ResourceType: js.UndefOr[PlanResourceType]
    var Scope: js.UndefOr[Scope]
  }

  /**
    * Information about a change to a resource attribute.
    */
  @js.native
  @Factory
  trait ResourceChangeDetail extends js.Object {
    var CausingEntity: js.UndefOr[CausingEntity]
    var Evaluation: js.UndefOr[EvaluationType]
    var Target: js.UndefOr[ResourceTargetDefinition]
  }

  /**
    * Information about a resource.
    */
  @js.native
  @Factory
  trait ResourceDetail extends js.Object {
    var ARN: js.UndefOr[ResourceDetailARN]
    var CreatedTime: js.UndefOr[ResourceDetailCreatedTime]
    var Description: js.UndefOr[ResourceDetailDescription]
    var Id: js.UndefOr[ResourceDetailId]
    var Name: js.UndefOr[ResourceDetailName]
  }

  /**
    * Information about a change to a resource attribute.
    */
  @js.native
  @Factory
  trait ResourceTargetDefinition extends js.Object {
    var Attribute: js.UndefOr[ResourceAttribute]
    var Name: js.UndefOr[PropertyName]
    var RequiresRecreation: js.UndefOr[RequiresRecreation]
  }

  @js.native
  @Factory
  trait ScanProvisionedProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
  }

  @js.native
  @Factory
  trait ScanProvisionedProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProducts: js.UndefOr[ProvisionedProductDetails]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait SearchProductsAsAdminOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProductViewDetails: js.UndefOr[ProductViewDetails]
  }

  @js.native
  @Factory
  trait SearchProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Filters: js.UndefOr[ProductViewFilters]
    var PageSize: js.UndefOr[PageSize]
    var PageToken: js.UndefOr[PageToken]
    var SortBy: js.UndefOr[ProductViewSortBy]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait SearchProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProductViewAggregations: js.UndefOr[ProductViewAggregations]
    var ProductViewSummaries: js.UndefOr[ProductViewSummaries]
  }

  @js.native
  @Factory
  trait SearchProvisionedProductsInput extends js.Object {
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AccessLevelFilter: js.UndefOr[AccessLevelFilter]
    var Filters: js.UndefOr[ProvisionedProductFilters]
    var PageSize: js.UndefOr[SearchProvisionedProductsPageSize]
    var PageToken: js.UndefOr[PageToken]
    var SortBy: js.UndefOr[SortField]
    var SortOrder: js.UndefOr[SortOrder]
  }

  @js.native
  @Factory
  trait SearchProvisionedProductsOutput extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes]
    var TotalResultsCount: js.UndefOr[TotalResultsCount]
  }

  /**
    * A self-service action association consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
    */
  @js.native
  @Factory
  trait ServiceActionAssociation extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var ServiceActionId: Id
  }

  @js.native
  sealed trait ServiceActionAssociationErrorCode extends js.Any
  object ServiceActionAssociationErrorCode extends js.Object {
    val DUPLICATE_RESOURCE = "DUPLICATE_RESOURCE".asInstanceOf[ServiceActionAssociationErrorCode]
    val INTERNAL_FAILURE   = "INTERNAL_FAILURE".asInstanceOf[ServiceActionAssociationErrorCode]
    val LIMIT_EXCEEDED     = "LIMIT_EXCEEDED".asInstanceOf[ServiceActionAssociationErrorCode]
    val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND".asInstanceOf[ServiceActionAssociationErrorCode]
    val THROTTLING         = "THROTTLING".asInstanceOf[ServiceActionAssociationErrorCode]

    val values =
      js.Object.freeze(js.Array(DUPLICATE_RESOURCE, INTERNAL_FAILURE, LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING))
  }

  @js.native
  sealed trait ServiceActionDefinitionKey extends js.Any
  object ServiceActionDefinitionKey extends js.Object {
    val Name       = "Name".asInstanceOf[ServiceActionDefinitionKey]
    val Version    = "Version".asInstanceOf[ServiceActionDefinitionKey]
    val AssumeRole = "AssumeRole".asInstanceOf[ServiceActionDefinitionKey]
    val Parameters = "Parameters".asInstanceOf[ServiceActionDefinitionKey]

    val values = js.Object.freeze(js.Array(Name, Version, AssumeRole, Parameters))
  }

  @js.native
  sealed trait ServiceActionDefinitionType extends js.Any
  object ServiceActionDefinitionType extends js.Object {
    val SSM_AUTOMATION = "SSM_AUTOMATION".asInstanceOf[ServiceActionDefinitionType]

    val values = js.Object.freeze(js.Array(SSM_AUTOMATION))
  }

  /**
    * An object containing detailed information about the self-service action.
    */
  @js.native
  @Factory
  trait ServiceActionDetail extends js.Object {
    var Definition: js.UndefOr[ServiceActionDefinitionMap]
    var ServiceActionSummary: js.UndefOr[ServiceActionSummary]
  }

  /**
    * Detailed information about the self-service action.
    */
  @js.native
  @Factory
  trait ServiceActionSummary extends js.Object {
    var DefinitionType: js.UndefOr[ServiceActionDefinitionType]
    var Description: js.UndefOr[ServiceActionDescription]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[ServiceActionName]
  }

  /**
    * Information about the portfolio share operation.
    */
  @js.native
  @Factory
  trait ShareDetails extends js.Object {
    var ShareErrors: js.UndefOr[ShareErrors]
    var SuccessfulShares: js.UndefOr[SuccessfulShares]
  }

  /**
    * Errors that occurred during the portfolio share operation.
    */
  @js.native
  @Factory
  trait ShareError extends js.Object {
    var Accounts: js.UndefOr[Namespaces]
    var Error: js.UndefOr[Error]
    var Message: js.UndefOr[Message]
  }

  @js.native
  sealed trait ShareStatus extends js.Any
  object ShareStatus extends js.Object {
    val NOT_STARTED           = "NOT_STARTED".asInstanceOf[ShareStatus]
    val IN_PROGRESS           = "IN_PROGRESS".asInstanceOf[ShareStatus]
    val COMPLETED             = "COMPLETED".asInstanceOf[ShareStatus]
    val COMPLETED_WITH_ERRORS = "COMPLETED_WITH_ERRORS".asInstanceOf[ShareStatus]
    val ERROR                 = "ERROR".asInstanceOf[ShareStatus]

    val values = js.Object.freeze(js.Array(NOT_STARTED, IN_PROGRESS, COMPLETED, COMPLETED_WITH_ERRORS, ERROR))
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder extends js.Object {
    val ASCENDING  = "ASCENDING".asInstanceOf[SortOrder]
    val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

    val values = js.Object.freeze(js.Array(ASCENDING, DESCENDING))
  }

  /**
    * An AWS CloudFormation stack, in a specific account and region, that's part of a stack set operation. A stack instance is a reference to an attempted or actual stack in a given account within a given region. A stack instance can exist without a stack—for example, if the stack couldn't be created for some reason. A stack instance is associated with only one stack set. Each stack instance contains the ID of its associated stack set, as well as the ID of the actual stack and the stack status.
    */
  @js.native
  @Factory
  trait StackInstance extends js.Object {
    var Account: js.UndefOr[AccountId]
    var Region: js.UndefOr[Region]
    var StackInstanceStatus: js.UndefOr[StackInstanceStatus]
  }

  @js.native
  sealed trait StackInstanceStatus extends js.Any
  object StackInstanceStatus extends js.Object {
    val CURRENT    = "CURRENT".asInstanceOf[StackInstanceStatus]
    val OUTDATED   = "OUTDATED".asInstanceOf[StackInstanceStatus]
    val INOPERABLE = "INOPERABLE".asInstanceOf[StackInstanceStatus]

    val values = js.Object.freeze(js.Array(CURRENT, OUTDATED, INOPERABLE))
  }

  @js.native
  sealed trait StackSetOperationType extends js.Any
  object StackSetOperationType extends js.Object {
    val CREATE = "CREATE".asInstanceOf[StackSetOperationType]
    val UPDATE = "UPDATE".asInstanceOf[StackSetOperationType]
    val DELETE = "DELETE".asInstanceOf[StackSetOperationType]

    val values = js.Object.freeze(js.Array(CREATE, UPDATE, DELETE))
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[Status]
    val CREATING  = "CREATING".asInstanceOf[Status]
    val FAILED    = "FAILED".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(AVAILABLE, CREATING, FAILED))
  }

  /**
    * Information about a tag. A tag is a key-value pair. Tags are propagated to the resources created when provisioning a product.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  /**
    * Information about a TagOption.
    */
  @js.native
  @Factory
  trait TagOptionDetail extends js.Object {
    var Active: js.UndefOr[TagOptionActive]
    var Id: js.UndefOr[TagOptionId]
    var Key: js.UndefOr[TagOptionKey]
    var Value: js.UndefOr[TagOptionValue]
  }

  /**
    * Summary information about a TagOption.
    */
  @js.native
  @Factory
  trait TagOptionSummary extends js.Object {
    var Key: js.UndefOr[TagOptionKey]
    var Values: js.UndefOr[TagOptionValues]
  }

  @js.native
  @Factory
  trait TerminateProvisionedProductInput extends js.Object {
    var TerminateToken: IdempotencyToken
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var IgnoreErrors: js.UndefOr[IgnoreErrors]
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn]
  }

  @js.native
  @Factory
  trait TerminateProvisionedProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  @js.native
  @Factory
  trait UpdateConstraintInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Description: js.UndefOr[ConstraintDescription]
    var Parameters: js.UndefOr[ConstraintParameters]
  }

  @js.native
  @Factory
  trait UpdateConstraintOutput extends js.Object {
    var ConstraintDetail: js.UndefOr[ConstraintDetail]
    var ConstraintParameters: js.UndefOr[ConstraintParameters]
    var Status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait UpdatePortfolioInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var AddTags: js.UndefOr[AddTags]
    var Description: js.UndefOr[PortfolioDescription]
    var DisplayName: js.UndefOr[PortfolioDisplayName]
    var ProviderName: js.UndefOr[ProviderName]
    var RemoveTags: js.UndefOr[TagKeys]
  }

  @js.native
  @Factory
  trait UpdatePortfolioOutput extends js.Object {
    var PortfolioDetail: js.UndefOr[PortfolioDetail]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateProductOutput extends js.Object {
    var ProductViewDetail: js.UndefOr[ProductViewDetail]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
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
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait UpdateProvisionedProductOutput extends js.Object {
    var RecordDetail: js.UndefOr[RecordDetail]
  }

  @js.native
  @Factory
  trait UpdateProvisionedProductPropertiesInput extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var ProvisionedProductId: Id
    var ProvisionedProductProperties: ProvisionedProductProperties
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
  }

  @js.native
  @Factory
  trait UpdateProvisionedProductPropertiesOutput extends js.Object {
    var ProvisionedProductId: js.UndefOr[Id]
    var ProvisionedProductProperties: js.UndefOr[ProvisionedProductProperties]
    var RecordId: js.UndefOr[Id]
    var Status: js.UndefOr[RecordStatus]
  }

  @js.native
  @Factory
  trait UpdateProvisioningArtifactInput extends js.Object {
    var ProductId: Id
    var ProvisioningArtifactId: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Active: js.UndefOr[ProvisioningArtifactActive]
    var Description: js.UndefOr[ProvisioningArtifactDescription]
    var Guidance: js.UndefOr[ProvisioningArtifactGuidance]
    var Name: js.UndefOr[ProvisioningArtifactName]
  }

  @js.native
  @Factory
  trait UpdateProvisioningArtifactOutput extends js.Object {
    var Info: js.UndefOr[ProvisioningArtifactInfo]
    var ProvisioningArtifactDetail: js.UndefOr[ProvisioningArtifactDetail]
    var Status: js.UndefOr[Status]
  }

  /**
    * The parameter key-value pair used to update a provisioned product.
    */
  @js.native
  @Factory
  trait UpdateProvisioningParameter extends js.Object {
    var Key: js.UndefOr[ParameterKey]
    var UsePreviousValue: js.UndefOr[UsePreviousValue]
    var Value: js.UndefOr[ParameterValue]
  }

  /**
    * The user-defined preferences that will be applied when updating a provisioned product. Not all preferences are applicable to all provisioned product types.
    */
  @js.native
  @Factory
  trait UpdateProvisioningPreferences extends js.Object {
    var StackSetAccounts: js.UndefOr[StackSetAccounts]
    var StackSetFailureToleranceCount: js.UndefOr[StackSetFailureToleranceCount]
    var StackSetFailureTolerancePercentage: js.UndefOr[StackSetFailureTolerancePercentage]
    var StackSetMaxConcurrencyCount: js.UndefOr[StackSetMaxConcurrencyCount]
    var StackSetMaxConcurrencyPercentage: js.UndefOr[StackSetMaxConcurrencyPercentage]
    var StackSetOperationType: js.UndefOr[StackSetOperationType]
    var StackSetRegions: js.UndefOr[StackSetRegions]
  }

  @js.native
  @Factory
  trait UpdateServiceActionInput extends js.Object {
    var Id: Id
    var AcceptLanguage: js.UndefOr[AcceptLanguage]
    var Definition: js.UndefOr[ServiceActionDefinitionMap]
    var Description: js.UndefOr[ServiceActionDescription]
    var Name: js.UndefOr[ServiceActionName]
  }

  @js.native
  @Factory
  trait UpdateServiceActionOutput extends js.Object {
    var ServiceActionDetail: js.UndefOr[ServiceActionDetail]
  }

  @js.native
  @Factory
  trait UpdateTagOptionInput extends js.Object {
    var Id: TagOptionId
    var Active: js.UndefOr[TagOptionActive]
    var Value: js.UndefOr[TagOptionValue]
  }

  @js.native
  @Factory
  trait UpdateTagOptionOutput extends js.Object {
    var TagOptionDetail: js.UndefOr[TagOptionDetail]
  }

  /**
    * Additional information provided by the administrator.
    */
  @js.native
  @Factory
  trait UsageInstruction extends js.Object {
    var Type: js.UndefOr[InstructionType]
    var Value: js.UndefOr[InstructionValue]
  }
}
