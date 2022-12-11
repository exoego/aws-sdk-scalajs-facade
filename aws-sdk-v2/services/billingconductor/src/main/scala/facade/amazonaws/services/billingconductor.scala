package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object billingconductor {
  type AWSCost = String
  type AccountAssociationsList = js.Array[AccountAssociationsListElement]
  type AccountEmail = String
  type AccountId = String
  type AccountIdList = js.Array[AccountId]
  type AccountName = String
  type Arn = String
  type AssociateResourcesResponseList = js.Array[AssociateResourceResponseElement]
  type Association = String
  type BillingEntity = String
  type BillingGroupArn = String
  type BillingGroupArnList = js.Array[BillingGroupArn]
  type BillingGroupCostReportList = js.Array[BillingGroupCostReportElement]
  type BillingGroupDescription = String
  type BillingGroupFullArn = String
  type BillingGroupList = js.Array[BillingGroupListElement]
  type BillingGroupName = String
  type BillingGroupStatusReason = String
  type BillingPeriod = String
  type ClientToken = String
  type Currency = String
  type CustomLineItemArn = String
  type CustomLineItemArns = js.Array[CustomLineItemArn]
  type CustomLineItemAssociationElement = String
  type CustomLineItemAssociationsList = js.Array[CustomLineItemAssociationElement]
  type CustomLineItemBatchAssociationsList = js.Array[CustomLineItemAssociationElement]
  type CustomLineItemBatchDisassociationsList = js.Array[CustomLineItemAssociationElement]
  type CustomLineItemChargeValue = Double
  type CustomLineItemDescription = String
  type CustomLineItemList = js.Array[CustomLineItemListElement]
  type CustomLineItemName = String
  type CustomLineItemNameList = js.Array[CustomLineItemName]
  type CustomLineItemPercentageChargeValue = Double
  type CustomLineItemProductCode = String
  type CustomLineItemVersionList = js.Array[CustomLineItemVersionListElement]
  type DisassociateResourcesResponseList = js.Array[DisassociateResourceResponseElement]
  type Instant = Double
  type ListResourcesAssociatedToCustomLineItemResponseList = js.Array[ListResourcesAssociatedToCustomLineItemResponseElement]
  type Margin = String
  type MarginPercentage = String
  type MaxBillingGroupResults = Int
  type MaxCustomLineItemResults = Int
  type MaxPricingPlanResults = Int
  type MaxPricingRuleResults = Int
  type ModifierPercentage = Double
  type NumberOfAccounts = Double
  type NumberOfAssociatedPricingRules = Double
  type NumberOfAssociations = Double
  type NumberOfPricingPlansAssociatedWith = Double
  type PricingPlanArn = String
  type PricingPlanArns = js.Array[PricingPlanArn]
  type PricingPlanDescription = String
  type PricingPlanFullArn = String
  type PricingPlanList = js.Array[PricingPlanListElement]
  type PricingPlanName = String
  type PricingRuleArn = String
  type PricingRuleArns = js.Array[PricingRuleArn]
  type PricingRuleArnsInput = js.Array[PricingRuleArn]
  type PricingRuleArnsNonEmptyInput = js.Array[PricingRuleArn]
  type PricingRuleDescription = String
  type PricingRuleList = js.Array[PricingRuleListElement]
  type PricingRuleName = String
  type ProformaCost = String
  type Service = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TieringActivated = Boolean
  type Token = String

  final class BillingConductorOps(private val service: BillingConductor) extends AnyVal {

    @inline def associateAccountsFuture(params: AssociateAccountsInput): Future[AssociateAccountsOutput] = service.associateAccounts(params).promise().toFuture
    @inline def associatePricingRulesFuture(params: AssociatePricingRulesInput): Future[AssociatePricingRulesOutput] = service.associatePricingRules(params).promise().toFuture
    @inline def batchAssociateResourcesToCustomLineItemFuture(params: BatchAssociateResourcesToCustomLineItemInput): Future[BatchAssociateResourcesToCustomLineItemOutput] = service.batchAssociateResourcesToCustomLineItem(params).promise().toFuture
    @inline def batchDisassociateResourcesFromCustomLineItemFuture(params: BatchDisassociateResourcesFromCustomLineItemInput): Future[BatchDisassociateResourcesFromCustomLineItemOutput] = service.batchDisassociateResourcesFromCustomLineItem(params).promise().toFuture
    @inline def createBillingGroupFuture(params: CreateBillingGroupInput): Future[CreateBillingGroupOutput] = service.createBillingGroup(params).promise().toFuture
    @inline def createCustomLineItemFuture(params: CreateCustomLineItemInput): Future[CreateCustomLineItemOutput] = service.createCustomLineItem(params).promise().toFuture
    @inline def createPricingPlanFuture(params: CreatePricingPlanInput): Future[CreatePricingPlanOutput] = service.createPricingPlan(params).promise().toFuture
    @inline def createPricingRuleFuture(params: CreatePricingRuleInput): Future[CreatePricingRuleOutput] = service.createPricingRule(params).promise().toFuture
    @inline def deleteBillingGroupFuture(params: DeleteBillingGroupInput): Future[DeleteBillingGroupOutput] = service.deleteBillingGroup(params).promise().toFuture
    @inline def deleteCustomLineItemFuture(params: DeleteCustomLineItemInput): Future[DeleteCustomLineItemOutput] = service.deleteCustomLineItem(params).promise().toFuture
    @inline def deletePricingPlanFuture(params: DeletePricingPlanInput): Future[DeletePricingPlanOutput] = service.deletePricingPlan(params).promise().toFuture
    @inline def deletePricingRuleFuture(params: DeletePricingRuleInput): Future[DeletePricingRuleOutput] = service.deletePricingRule(params).promise().toFuture
    @inline def disassociateAccountsFuture(params: DisassociateAccountsInput): Future[DisassociateAccountsOutput] = service.disassociateAccounts(params).promise().toFuture
    @inline def disassociatePricingRulesFuture(params: DisassociatePricingRulesInput): Future[DisassociatePricingRulesOutput] = service.disassociatePricingRules(params).promise().toFuture
    @inline def listAccountAssociationsFuture(params: ListAccountAssociationsInput): Future[ListAccountAssociationsOutput] = service.listAccountAssociations(params).promise().toFuture
    @inline def listBillingGroupCostReportsFuture(params: ListBillingGroupCostReportsInput): Future[ListBillingGroupCostReportsOutput] = service.listBillingGroupCostReports(params).promise().toFuture
    @inline def listBillingGroupsFuture(params: ListBillingGroupsInput): Future[ListBillingGroupsOutput] = service.listBillingGroups(params).promise().toFuture
    @inline def listCustomLineItemVersionsFuture(params: ListCustomLineItemVersionsInput): Future[ListCustomLineItemVersionsOutput] = service.listCustomLineItemVersions(params).promise().toFuture
    @inline def listCustomLineItemsFuture(params: ListCustomLineItemsInput): Future[ListCustomLineItemsOutput] = service.listCustomLineItems(params).promise().toFuture
    @inline def listPricingPlansAssociatedWithPricingRuleFuture(params: ListPricingPlansAssociatedWithPricingRuleInput): Future[ListPricingPlansAssociatedWithPricingRuleOutput] = service.listPricingPlansAssociatedWithPricingRule(params).promise().toFuture
    @inline def listPricingPlansFuture(params: ListPricingPlansInput): Future[ListPricingPlansOutput] = service.listPricingPlans(params).promise().toFuture
    @inline def listPricingRulesAssociatedToPricingPlanFuture(params: ListPricingRulesAssociatedToPricingPlanInput): Future[ListPricingRulesAssociatedToPricingPlanOutput] = service.listPricingRulesAssociatedToPricingPlan(params).promise().toFuture
    @inline def listPricingRulesFuture(params: ListPricingRulesInput): Future[ListPricingRulesOutput] = service.listPricingRules(params).promise().toFuture
    @inline def listResourcesAssociatedToCustomLineItemFuture(params: ListResourcesAssociatedToCustomLineItemInput): Future[ListResourcesAssociatedToCustomLineItemOutput] = service.listResourcesAssociatedToCustomLineItem(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateBillingGroupFuture(params: UpdateBillingGroupInput): Future[UpdateBillingGroupOutput] = service.updateBillingGroup(params).promise().toFuture
    @inline def updateCustomLineItemFuture(params: UpdateCustomLineItemInput): Future[UpdateCustomLineItemOutput] = service.updateCustomLineItem(params).promise().toFuture
    @inline def updatePricingPlanFuture(params: UpdatePricingPlanInput): Future[UpdatePricingPlanOutput] = service.updatePricingPlan(params).promise().toFuture
    @inline def updatePricingRuleFuture(params: UpdatePricingRuleInput): Future[UpdatePricingRuleOutput] = service.updatePricingRule(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/billingconductor", JSImport.Namespace, "AWS.Billingconductor")
  class BillingConductor() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateAccounts(params: AssociateAccountsInput): Request[AssociateAccountsOutput] = js.native
    def associatePricingRules(params: AssociatePricingRulesInput): Request[AssociatePricingRulesOutput] = js.native
    def batchAssociateResourcesToCustomLineItem(params: BatchAssociateResourcesToCustomLineItemInput): Request[BatchAssociateResourcesToCustomLineItemOutput] = js.native
    def batchDisassociateResourcesFromCustomLineItem(params: BatchDisassociateResourcesFromCustomLineItemInput): Request[BatchDisassociateResourcesFromCustomLineItemOutput] = js.native
    def createBillingGroup(params: CreateBillingGroupInput): Request[CreateBillingGroupOutput] = js.native
    def createCustomLineItem(params: CreateCustomLineItemInput): Request[CreateCustomLineItemOutput] = js.native
    def createPricingPlan(params: CreatePricingPlanInput): Request[CreatePricingPlanOutput] = js.native
    def createPricingRule(params: CreatePricingRuleInput): Request[CreatePricingRuleOutput] = js.native
    def deleteBillingGroup(params: DeleteBillingGroupInput): Request[DeleteBillingGroupOutput] = js.native
    def deleteCustomLineItem(params: DeleteCustomLineItemInput): Request[DeleteCustomLineItemOutput] = js.native
    def deletePricingPlan(params: DeletePricingPlanInput): Request[DeletePricingPlanOutput] = js.native
    def deletePricingRule(params: DeletePricingRuleInput): Request[DeletePricingRuleOutput] = js.native
    def disassociateAccounts(params: DisassociateAccountsInput): Request[DisassociateAccountsOutput] = js.native
    def disassociatePricingRules(params: DisassociatePricingRulesInput): Request[DisassociatePricingRulesOutput] = js.native
    def listAccountAssociations(params: ListAccountAssociationsInput): Request[ListAccountAssociationsOutput] = js.native
    def listBillingGroupCostReports(params: ListBillingGroupCostReportsInput): Request[ListBillingGroupCostReportsOutput] = js.native
    def listBillingGroups(params: ListBillingGroupsInput): Request[ListBillingGroupsOutput] = js.native
    def listCustomLineItemVersions(params: ListCustomLineItemVersionsInput): Request[ListCustomLineItemVersionsOutput] = js.native
    def listCustomLineItems(params: ListCustomLineItemsInput): Request[ListCustomLineItemsOutput] = js.native
    def listPricingPlans(params: ListPricingPlansInput): Request[ListPricingPlansOutput] = js.native
    def listPricingPlansAssociatedWithPricingRule(params: ListPricingPlansAssociatedWithPricingRuleInput): Request[ListPricingPlansAssociatedWithPricingRuleOutput] = js.native
    def listPricingRules(params: ListPricingRulesInput): Request[ListPricingRulesOutput] = js.native
    def listPricingRulesAssociatedToPricingPlan(params: ListPricingRulesAssociatedToPricingPlanInput): Request[ListPricingRulesAssociatedToPricingPlanOutput] = js.native
    def listResourcesAssociatedToCustomLineItem(params: ListResourcesAssociatedToCustomLineItemInput): Request[ListResourcesAssociatedToCustomLineItemOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateBillingGroup(params: UpdateBillingGroupInput): Request[UpdateBillingGroupOutput] = js.native
    def updateCustomLineItem(params: UpdateCustomLineItemInput): Request[UpdateCustomLineItemOutput] = js.native
    def updatePricingPlan(params: UpdatePricingPlanInput): Request[UpdatePricingPlanOutput] = js.native
    def updatePricingRule(params: UpdatePricingRuleInput): Request[UpdatePricingRuleOutput] = js.native
  }
  object BillingConductor {
    @inline implicit def toOps(service: BillingConductor): BillingConductorOps = {
      new BillingConductorOps(service)
    }
  }

  /** A representation of a linked account.
    */
  @js.native
  trait AccountAssociationsListElement extends js.Object {
    var AccountEmail: js.UndefOr[AccountEmail]
    var AccountId: js.UndefOr[AccountId]
    var AccountName: js.UndefOr[AccountName]
    var BillingGroupArn: js.UndefOr[BillingGroupArn]
  }

  object AccountAssociationsListElement {
    @inline
    def apply(
        AccountEmail: js.UndefOr[AccountEmail] = js.undefined,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        AccountName: js.UndefOr[AccountName] = js.undefined,
        BillingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
    ): AccountAssociationsListElement = {
      val __obj = js.Dynamic.literal()
      AccountEmail.foreach(__v => __obj.updateDynamic("AccountEmail")(__v.asInstanceOf[js.Any]))
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      AccountName.foreach(__v => __obj.updateDynamic("AccountName")(__v.asInstanceOf[js.Any]))
      BillingGroupArn.foreach(__v => __obj.updateDynamic("BillingGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAssociationsListElement]
    }
  }

  /** The set of accounts that will be under the billing group. The set of accounts resemble the linked accounts in a consolidated family.
    */
  @js.native
  trait AccountGrouping extends js.Object {
    var LinkedAccountIds: AccountIdList
  }

  object AccountGrouping {
    @inline
    def apply(
        LinkedAccountIds: AccountIdList
    ): AccountGrouping = {
      val __obj = js.Dynamic.literal(
        "LinkedAccountIds" -> LinkedAccountIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccountGrouping]
    }
  }

  @js.native
  trait AssociateAccountsInput extends js.Object {
    var AccountIds: AccountIdList
    var Arn: BillingGroupArn
  }

  object AssociateAccountsInput {
    @inline
    def apply(
        AccountIds: AccountIdList,
        Arn: BillingGroupArn
    ): AssociateAccountsInput = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateAccountsInput]
    }
  }

  @js.native
  trait AssociateAccountsOutput extends js.Object {
    var Arn: js.UndefOr[BillingGroupArn]
  }

  object AssociateAccountsOutput {
    @inline
    def apply(
        Arn: js.UndefOr[BillingGroupArn] = js.undefined
    ): AssociateAccountsOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateAccountsOutput]
    }
  }

  @js.native
  trait AssociatePricingRulesInput extends js.Object {
    var Arn: PricingPlanArn
    var PricingRuleArns: PricingRuleArnsNonEmptyInput
  }

  object AssociatePricingRulesInput {
    @inline
    def apply(
        Arn: PricingPlanArn,
        PricingRuleArns: PricingRuleArnsNonEmptyInput
    ): AssociatePricingRulesInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "PricingRuleArns" -> PricingRuleArns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociatePricingRulesInput]
    }
  }

  @js.native
  trait AssociatePricingRulesOutput extends js.Object {
    var Arn: js.UndefOr[PricingPlanArn]
  }

  object AssociatePricingRulesOutput {
    @inline
    def apply(
        Arn: js.UndefOr[PricingPlanArn] = js.undefined
    ): AssociatePricingRulesOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePricingRulesOutput]
    }
  }

  /** A representation of a resource association error.
    */
  @js.native
  trait AssociateResourceError extends js.Object {
    var Message: js.UndefOr[String]
    var Reason: js.UndefOr[AssociateResourceErrorReason]
  }

  object AssociateResourceError {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Reason: js.UndefOr[AssociateResourceErrorReason] = js.undefined
    ): AssociateResourceError = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResourceError]
    }
  }

  /** A resource association result for a percentage custom line item.
    */
  @js.native
  trait AssociateResourceResponseElement extends js.Object {
    var Arn: js.UndefOr[CustomLineItemAssociationElement]
    var Error: js.UndefOr[AssociateResourceError]
  }

  object AssociateResourceResponseElement {
    @inline
    def apply(
        Arn: js.UndefOr[CustomLineItemAssociationElement] = js.undefined,
        Error: js.UndefOr[AssociateResourceError] = js.undefined
    ): AssociateResourceResponseElement = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateResourceResponseElement]
    }
  }

  @js.native
  trait BatchAssociateResourcesToCustomLineItemInput extends js.Object {
    var ResourceArns: CustomLineItemBatchAssociationsList
    var TargetArn: CustomLineItemArn
    var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange]
  }

  object BatchAssociateResourcesToCustomLineItemInput {
    @inline
    def apply(
        ResourceArns: CustomLineItemBatchAssociationsList,
        TargetArn: CustomLineItemArn,
        BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined
    ): BatchAssociateResourcesToCustomLineItemInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any],
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      BillingPeriodRange.foreach(__v => __obj.updateDynamic("BillingPeriodRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateResourcesToCustomLineItemInput]
    }
  }

  @js.native
  trait BatchAssociateResourcesToCustomLineItemOutput extends js.Object {
    var FailedAssociatedResources: js.UndefOr[AssociateResourcesResponseList]
    var SuccessfullyAssociatedResources: js.UndefOr[AssociateResourcesResponseList]
  }

  object BatchAssociateResourcesToCustomLineItemOutput {
    @inline
    def apply(
        FailedAssociatedResources: js.UndefOr[AssociateResourcesResponseList] = js.undefined,
        SuccessfullyAssociatedResources: js.UndefOr[AssociateResourcesResponseList] = js.undefined
    ): BatchAssociateResourcesToCustomLineItemOutput = {
      val __obj = js.Dynamic.literal()
      FailedAssociatedResources.foreach(__v => __obj.updateDynamic("FailedAssociatedResources")(__v.asInstanceOf[js.Any]))
      SuccessfullyAssociatedResources.foreach(__v => __obj.updateDynamic("SuccessfullyAssociatedResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateResourcesToCustomLineItemOutput]
    }
  }

  @js.native
  trait BatchDisassociateResourcesFromCustomLineItemInput extends js.Object {
    var ResourceArns: CustomLineItemBatchDisassociationsList
    var TargetArn: CustomLineItemArn
    var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange]
  }

  object BatchDisassociateResourcesFromCustomLineItemInput {
    @inline
    def apply(
        ResourceArns: CustomLineItemBatchDisassociationsList,
        TargetArn: CustomLineItemArn,
        BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined
    ): BatchDisassociateResourcesFromCustomLineItemInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArns" -> ResourceArns.asInstanceOf[js.Any],
        "TargetArn" -> TargetArn.asInstanceOf[js.Any]
      )

      BillingPeriodRange.foreach(__v => __obj.updateDynamic("BillingPeriodRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateResourcesFromCustomLineItemInput]
    }
  }

  @js.native
  trait BatchDisassociateResourcesFromCustomLineItemOutput extends js.Object {
    var FailedDisassociatedResources: js.UndefOr[DisassociateResourcesResponseList]
    var SuccessfullyDisassociatedResources: js.UndefOr[DisassociateResourcesResponseList]
  }

  object BatchDisassociateResourcesFromCustomLineItemOutput {
    @inline
    def apply(
        FailedDisassociatedResources: js.UndefOr[DisassociateResourcesResponseList] = js.undefined,
        SuccessfullyDisassociatedResources: js.UndefOr[DisassociateResourcesResponseList] = js.undefined
    ): BatchDisassociateResourcesFromCustomLineItemOutput = {
      val __obj = js.Dynamic.literal()
      FailedDisassociatedResources.foreach(__v => __obj.updateDynamic("FailedDisassociatedResources")(__v.asInstanceOf[js.Any]))
      SuccessfullyDisassociatedResources.foreach(__v => __obj.updateDynamic("SuccessfullyDisassociatedResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateResourcesFromCustomLineItemOutput]
    }
  }

  /** A summary report of actual Amazon Web Services charges and calculated Amazon Web Services charges, based on the associated pricing plan of a billing group.
    */
  @js.native
  trait BillingGroupCostReportElement extends js.Object {
    var AWSCost: js.UndefOr[AWSCost]
    var Arn: js.UndefOr[BillingGroupArn]
    var Currency: js.UndefOr[Currency]
    var Margin: js.UndefOr[Margin]
    var MarginPercentage: js.UndefOr[MarginPercentage]
    var ProformaCost: js.UndefOr[ProformaCost]
  }

  object BillingGroupCostReportElement {
    @inline
    def apply(
        AWSCost: js.UndefOr[AWSCost] = js.undefined,
        Arn: js.UndefOr[BillingGroupArn] = js.undefined,
        Currency: js.UndefOr[Currency] = js.undefined,
        Margin: js.UndefOr[Margin] = js.undefined,
        MarginPercentage: js.UndefOr[MarginPercentage] = js.undefined,
        ProformaCost: js.UndefOr[ProformaCost] = js.undefined
    ): BillingGroupCostReportElement = {
      val __obj = js.Dynamic.literal()
      AWSCost.foreach(__v => __obj.updateDynamic("AWSCost")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Currency.foreach(__v => __obj.updateDynamic("Currency")(__v.asInstanceOf[js.Any]))
      Margin.foreach(__v => __obj.updateDynamic("Margin")(__v.asInstanceOf[js.Any]))
      MarginPercentage.foreach(__v => __obj.updateDynamic("MarginPercentage")(__v.asInstanceOf[js.Any]))
      ProformaCost.foreach(__v => __obj.updateDynamic("ProformaCost")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BillingGroupCostReportElement]
    }
  }

  /** A representation of a billing group.
    */
  @js.native
  trait BillingGroupListElement extends js.Object {
    var Arn: js.UndefOr[BillingGroupArn]
    var ComputationPreference: js.UndefOr[ComputationPreference]
    var CreationTime: js.UndefOr[Instant]
    var Description: js.UndefOr[BillingGroupDescription]
    var LastModifiedTime: js.UndefOr[Instant]
    var Name: js.UndefOr[BillingGroupName]
    var PrimaryAccountId: js.UndefOr[AccountId]
    var Size: js.UndefOr[NumberOfAccounts]
    var Status: js.UndefOr[BillingGroupStatus]
    var StatusReason: js.UndefOr[BillingGroupStatusReason]
  }

  object BillingGroupListElement {
    @inline
    def apply(
        Arn: js.UndefOr[BillingGroupArn] = js.undefined,
        ComputationPreference: js.UndefOr[ComputationPreference] = js.undefined,
        CreationTime: js.UndefOr[Instant] = js.undefined,
        Description: js.UndefOr[BillingGroupDescription] = js.undefined,
        LastModifiedTime: js.UndefOr[Instant] = js.undefined,
        Name: js.UndefOr[BillingGroupName] = js.undefined,
        PrimaryAccountId: js.UndefOr[AccountId] = js.undefined,
        Size: js.UndefOr[NumberOfAccounts] = js.undefined,
        Status: js.UndefOr[BillingGroupStatus] = js.undefined,
        StatusReason: js.UndefOr[BillingGroupStatusReason] = js.undefined
    ): BillingGroupListElement = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ComputationPreference.foreach(__v => __obj.updateDynamic("ComputationPreference")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PrimaryAccountId.foreach(__v => __obj.updateDynamic("PrimaryAccountId")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BillingGroupListElement]
    }
  }

  /** The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
    */
  @js.native
  trait ComputationPreference extends js.Object {
    var PricingPlanArn: PricingPlanFullArn
  }

  object ComputationPreference {
    @inline
    def apply(
        PricingPlanArn: PricingPlanFullArn
    ): ComputationPreference = {
      val __obj = js.Dynamic.literal(
        "PricingPlanArn" -> PricingPlanArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ComputationPreference]
    }
  }

  @js.native
  trait CreateBillingGroupInput extends js.Object {
    var AccountGrouping: AccountGrouping
    var ComputationPreference: ComputationPreference
    var Name: BillingGroupName
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[BillingGroupDescription]
    var PrimaryAccountId: js.UndefOr[AccountId]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateBillingGroupInput {
    @inline
    def apply(
        AccountGrouping: AccountGrouping,
        ComputationPreference: ComputationPreference,
        Name: BillingGroupName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[BillingGroupDescription] = js.undefined,
        PrimaryAccountId: js.UndefOr[AccountId] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateBillingGroupInput = {
      val __obj = js.Dynamic.literal(
        "AccountGrouping" -> AccountGrouping.asInstanceOf[js.Any],
        "ComputationPreference" -> ComputationPreference.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PrimaryAccountId.foreach(__v => __obj.updateDynamic("PrimaryAccountId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBillingGroupInput]
    }
  }

  @js.native
  trait CreateBillingGroupOutput extends js.Object {
    var Arn: js.UndefOr[BillingGroupArn]
  }

  object CreateBillingGroupOutput {
    @inline
    def apply(
        Arn: js.UndefOr[BillingGroupArn] = js.undefined
    ): CreateBillingGroupOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBillingGroupOutput]
    }
  }

  @js.native
  trait CreateCustomLineItemInput extends js.Object {
    var BillingGroupArn: BillingGroupArn
    var ChargeDetails: CustomLineItemChargeDetails
    var Description: CustomLineItemDescription
    var Name: CustomLineItemName
    var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange]
    var ClientToken: js.UndefOr[ClientToken]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateCustomLineItemInput {
    @inline
    def apply(
        BillingGroupArn: BillingGroupArn,
        ChargeDetails: CustomLineItemChargeDetails,
        Description: CustomLineItemDescription,
        Name: CustomLineItemName,
        BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateCustomLineItemInput = {
      val __obj = js.Dynamic.literal(
        "BillingGroupArn" -> BillingGroupArn.asInstanceOf[js.Any],
        "ChargeDetails" -> ChargeDetails.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      BillingPeriodRange.foreach(__v => __obj.updateDynamic("BillingPeriodRange")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomLineItemInput]
    }
  }

  @js.native
  trait CreateCustomLineItemOutput extends js.Object {
    var Arn: js.UndefOr[CustomLineItemArn]
  }

  object CreateCustomLineItemOutput {
    @inline
    def apply(
        Arn: js.UndefOr[CustomLineItemArn] = js.undefined
    ): CreateCustomLineItemOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCustomLineItemOutput]
    }
  }

  /** The possible Amazon Web Services Free Tier configurations.
    */
  @js.native
  trait CreateFreeTierConfig extends js.Object {
    var Activated: TieringActivated
  }

  object CreateFreeTierConfig {
    @inline
    def apply(
        Activated: TieringActivated
    ): CreateFreeTierConfig = {
      val __obj = js.Dynamic.literal(
        "Activated" -> Activated.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateFreeTierConfig]
    }
  }

  @js.native
  trait CreatePricingPlanInput extends js.Object {
    var Name: PricingPlanName
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[PricingPlanDescription]
    var PricingRuleArns: js.UndefOr[PricingRuleArnsInput]
    var Tags: js.UndefOr[TagMap]
  }

  object CreatePricingPlanInput {
    @inline
    def apply(
        Name: PricingPlanName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[PricingPlanDescription] = js.undefined,
        PricingRuleArns: js.UndefOr[PricingRuleArnsInput] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreatePricingPlanInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      PricingRuleArns.foreach(__v => __obj.updateDynamic("PricingRuleArns")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePricingPlanInput]
    }
  }

  @js.native
  trait CreatePricingPlanOutput extends js.Object {
    var Arn: js.UndefOr[PricingPlanArn]
  }

  object CreatePricingPlanOutput {
    @inline
    def apply(
        Arn: js.UndefOr[PricingPlanArn] = js.undefined
    ): CreatePricingPlanOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePricingPlanOutput]
    }
  }

  @js.native
  trait CreatePricingRuleInput extends js.Object {
    var Name: PricingRuleName
    var Scope: PricingRuleScope
    var Type: PricingRuleType
    var BillingEntity: js.UndefOr[BillingEntity]
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[PricingRuleDescription]
    var ModifierPercentage: js.UndefOr[ModifierPercentage]
    var Service: js.UndefOr[Service]
    var Tags: js.UndefOr[TagMap]
    var Tiering: js.UndefOr[CreateTieringInput]
  }

  object CreatePricingRuleInput {
    @inline
    def apply(
        Name: PricingRuleName,
        Scope: PricingRuleScope,
        Type: PricingRuleType,
        BillingEntity: js.UndefOr[BillingEntity] = js.undefined,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[PricingRuleDescription] = js.undefined,
        ModifierPercentage: js.UndefOr[ModifierPercentage] = js.undefined,
        Service: js.UndefOr[Service] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Tiering: js.UndefOr[CreateTieringInput] = js.undefined
    ): CreatePricingRuleInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Scope" -> Scope.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      BillingEntity.foreach(__v => __obj.updateDynamic("BillingEntity")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ModifierPercentage.foreach(__v => __obj.updateDynamic("ModifierPercentage")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Tiering.foreach(__v => __obj.updateDynamic("Tiering")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePricingRuleInput]
    }
  }

  @js.native
  trait CreatePricingRuleOutput extends js.Object {
    var Arn: js.UndefOr[PricingRuleArn]
  }

  object CreatePricingRuleOutput {
    @inline
    def apply(
        Arn: js.UndefOr[PricingRuleArn] = js.undefined
    ): CreatePricingRuleOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePricingRuleOutput]
    }
  }

  /** The set of tiering configurations for the pricing rule.
    */
  @js.native
  trait CreateTieringInput extends js.Object {
    var FreeTier: CreateFreeTierConfig
  }

  object CreateTieringInput {
    @inline
    def apply(
        FreeTier: CreateFreeTierConfig
    ): CreateTieringInput = {
      val __obj = js.Dynamic.literal(
        "FreeTier" -> FreeTier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTieringInput]
    }
  }

  /** The billing period range in which the custom line item request will be applied.
    */
  @js.native
  trait CustomLineItemBillingPeriodRange extends js.Object {
    var InclusiveStartBillingPeriod: BillingPeriod
    var ExclusiveEndBillingPeriod: js.UndefOr[BillingPeriod]
  }

  object CustomLineItemBillingPeriodRange {
    @inline
    def apply(
        InclusiveStartBillingPeriod: BillingPeriod,
        ExclusiveEndBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined
    ): CustomLineItemBillingPeriodRange = {
      val __obj = js.Dynamic.literal(
        "InclusiveStartBillingPeriod" -> InclusiveStartBillingPeriod.asInstanceOf[js.Any]
      )

      ExclusiveEndBillingPeriod.foreach(__v => __obj.updateDynamic("ExclusiveEndBillingPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomLineItemBillingPeriodRange]
    }
  }

  /** The charge details of a custom line item. It should contain only one of <code>Flat</code> or <code>Percentage</code>.
    */
  @js.native
  trait CustomLineItemChargeDetails extends js.Object {
    var Type: CustomLineItemType
    var Flat: js.UndefOr[CustomLineItemFlatChargeDetails]
    var Percentage: js.UndefOr[CustomLineItemPercentageChargeDetails]
  }

  object CustomLineItemChargeDetails {
    @inline
    def apply(
        Type: CustomLineItemType,
        Flat: js.UndefOr[CustomLineItemFlatChargeDetails] = js.undefined,
        Percentage: js.UndefOr[CustomLineItemPercentageChargeDetails] = js.undefined
    ): CustomLineItemChargeDetails = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Flat.foreach(__v => __obj.updateDynamic("Flat")(__v.asInstanceOf[js.Any]))
      Percentage.foreach(__v => __obj.updateDynamic("Percentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomLineItemChargeDetails]
    }
  }

  /** A representation of the charge details that are associated with a flat custom line item.
    */
  @js.native
  trait CustomLineItemFlatChargeDetails extends js.Object {
    var ChargeValue: CustomLineItemChargeValue
  }

  object CustomLineItemFlatChargeDetails {
    @inline
    def apply(
        ChargeValue: CustomLineItemChargeValue
    ): CustomLineItemFlatChargeDetails = {
      val __obj = js.Dynamic.literal(
        "ChargeValue" -> ChargeValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomLineItemFlatChargeDetails]
    }
  }

  /** A representation of a custom line item.
    */
  @js.native
  trait CustomLineItemListElement extends js.Object {
    var Arn: js.UndefOr[CustomLineItemArn]
    var AssociationSize: js.UndefOr[NumberOfAssociations]
    var BillingGroupArn: js.UndefOr[BillingGroupArn]
    var ChargeDetails: js.UndefOr[ListCustomLineItemChargeDetails]
    var CreationTime: js.UndefOr[Instant]
    var CurrencyCode: js.UndefOr[CurrencyCode]
    var Description: js.UndefOr[CustomLineItemDescription]
    var LastModifiedTime: js.UndefOr[Instant]
    var Name: js.UndefOr[CustomLineItemName]
    var ProductCode: js.UndefOr[CustomLineItemProductCode]
  }

  object CustomLineItemListElement {
    @inline
    def apply(
        Arn: js.UndefOr[CustomLineItemArn] = js.undefined,
        AssociationSize: js.UndefOr[NumberOfAssociations] = js.undefined,
        BillingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        ChargeDetails: js.UndefOr[ListCustomLineItemChargeDetails] = js.undefined,
        CreationTime: js.UndefOr[Instant] = js.undefined,
        CurrencyCode: js.UndefOr[CurrencyCode] = js.undefined,
        Description: js.UndefOr[CustomLineItemDescription] = js.undefined,
        LastModifiedTime: js.UndefOr[Instant] = js.undefined,
        Name: js.UndefOr[CustomLineItemName] = js.undefined,
        ProductCode: js.UndefOr[CustomLineItemProductCode] = js.undefined
    ): CustomLineItemListElement = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssociationSize.foreach(__v => __obj.updateDynamic("AssociationSize")(__v.asInstanceOf[js.Any]))
      BillingGroupArn.foreach(__v => __obj.updateDynamic("BillingGroupArn")(__v.asInstanceOf[js.Any]))
      ChargeDetails.foreach(__v => __obj.updateDynamic("ChargeDetails")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProductCode.foreach(__v => __obj.updateDynamic("ProductCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomLineItemListElement]
    }
  }

  /** A representation of the charge details that are associated with a percentage custom line item.
    */
  @js.native
  trait CustomLineItemPercentageChargeDetails extends js.Object {
    var PercentageValue: CustomLineItemPercentageChargeValue
    var AssociatedValues: js.UndefOr[CustomLineItemAssociationsList]
  }

  object CustomLineItemPercentageChargeDetails {
    @inline
    def apply(
        PercentageValue: CustomLineItemPercentageChargeValue,
        AssociatedValues: js.UndefOr[CustomLineItemAssociationsList] = js.undefined
    ): CustomLineItemPercentageChargeDetails = {
      val __obj = js.Dynamic.literal(
        "PercentageValue" -> PercentageValue.asInstanceOf[js.Any]
      )

      AssociatedValues.foreach(__v => __obj.updateDynamic("AssociatedValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomLineItemPercentageChargeDetails]
    }
  }

  /** A representation of a custom line item version.
    */
  @js.native
  trait CustomLineItemVersionListElement extends js.Object {
    var AssociationSize: js.UndefOr[NumberOfAssociations]
    var BillingGroupArn: js.UndefOr[BillingGroupArn]
    var ChargeDetails: js.UndefOr[ListCustomLineItemChargeDetails]
    var CreationTime: js.UndefOr[Instant]
    var CurrencyCode: js.UndefOr[CurrencyCode]
    var Description: js.UndefOr[CustomLineItemDescription]
    var EndBillingPeriod: js.UndefOr[BillingPeriod]
    var LastModifiedTime: js.UndefOr[Instant]
    var Name: js.UndefOr[CustomLineItemName]
    var ProductCode: js.UndefOr[CustomLineItemProductCode]
    var StartBillingPeriod: js.UndefOr[BillingPeriod]
  }

  object CustomLineItemVersionListElement {
    @inline
    def apply(
        AssociationSize: js.UndefOr[NumberOfAssociations] = js.undefined,
        BillingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined,
        ChargeDetails: js.UndefOr[ListCustomLineItemChargeDetails] = js.undefined,
        CreationTime: js.UndefOr[Instant] = js.undefined,
        CurrencyCode: js.UndefOr[CurrencyCode] = js.undefined,
        Description: js.UndefOr[CustomLineItemDescription] = js.undefined,
        EndBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        LastModifiedTime: js.UndefOr[Instant] = js.undefined,
        Name: js.UndefOr[CustomLineItemName] = js.undefined,
        ProductCode: js.UndefOr[CustomLineItemProductCode] = js.undefined,
        StartBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined
    ): CustomLineItemVersionListElement = {
      val __obj = js.Dynamic.literal()
      AssociationSize.foreach(__v => __obj.updateDynamic("AssociationSize")(__v.asInstanceOf[js.Any]))
      BillingGroupArn.foreach(__v => __obj.updateDynamic("BillingGroupArn")(__v.asInstanceOf[js.Any]))
      ChargeDetails.foreach(__v => __obj.updateDynamic("ChargeDetails")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CurrencyCode.foreach(__v => __obj.updateDynamic("CurrencyCode")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndBillingPeriod.foreach(__v => __obj.updateDynamic("EndBillingPeriod")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProductCode.foreach(__v => __obj.updateDynamic("ProductCode")(__v.asInstanceOf[js.Any]))
      StartBillingPeriod.foreach(__v => __obj.updateDynamic("StartBillingPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomLineItemVersionListElement]
    }
  }

  @js.native
  trait DeleteBillingGroupInput extends js.Object {
    var Arn: BillingGroupArn
  }

  object DeleteBillingGroupInput {
    @inline
    def apply(
        Arn: BillingGroupArn
    ): DeleteBillingGroupInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBillingGroupInput]
    }
  }

  @js.native
  trait DeleteBillingGroupOutput extends js.Object {
    var Arn: js.UndefOr[BillingGroupArn]
  }

  object DeleteBillingGroupOutput {
    @inline
    def apply(
        Arn: js.UndefOr[BillingGroupArn] = js.undefined
    ): DeleteBillingGroupOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBillingGroupOutput]
    }
  }

  @js.native
  trait DeleteCustomLineItemInput extends js.Object {
    var Arn: CustomLineItemArn
    var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange]
  }

  object DeleteCustomLineItemInput {
    @inline
    def apply(
        Arn: CustomLineItemArn,
        BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined
    ): DeleteCustomLineItemInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      BillingPeriodRange.foreach(__v => __obj.updateDynamic("BillingPeriodRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCustomLineItemInput]
    }
  }

  @js.native
  trait DeleteCustomLineItemOutput extends js.Object {
    var Arn: js.UndefOr[CustomLineItemArn]
  }

  object DeleteCustomLineItemOutput {
    @inline
    def apply(
        Arn: js.UndefOr[CustomLineItemArn] = js.undefined
    ): DeleteCustomLineItemOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCustomLineItemOutput]
    }
  }

  @js.native
  trait DeletePricingPlanInput extends js.Object {
    var Arn: PricingPlanArn
  }

  object DeletePricingPlanInput {
    @inline
    def apply(
        Arn: PricingPlanArn
    ): DeletePricingPlanInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePricingPlanInput]
    }
  }

  @js.native
  trait DeletePricingPlanOutput extends js.Object {
    var Arn: js.UndefOr[PricingPlanArn]
  }

  object DeletePricingPlanOutput {
    @inline
    def apply(
        Arn: js.UndefOr[PricingPlanArn] = js.undefined
    ): DeletePricingPlanOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePricingPlanOutput]
    }
  }

  @js.native
  trait DeletePricingRuleInput extends js.Object {
    var Arn: PricingRuleArn
  }

  object DeletePricingRuleInput {
    @inline
    def apply(
        Arn: PricingRuleArn
    ): DeletePricingRuleInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePricingRuleInput]
    }
  }

  @js.native
  trait DeletePricingRuleOutput extends js.Object {
    var Arn: js.UndefOr[PricingRuleArn]
  }

  object DeletePricingRuleOutput {
    @inline
    def apply(
        Arn: js.UndefOr[PricingRuleArn] = js.undefined
    ): DeletePricingRuleOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePricingRuleOutput]
    }
  }

  @js.native
  trait DisassociateAccountsInput extends js.Object {
    var AccountIds: AccountIdList
    var Arn: BillingGroupArn
  }

  object DisassociateAccountsInput {
    @inline
    def apply(
        AccountIds: AccountIdList,
        Arn: BillingGroupArn
    ): DisassociateAccountsInput = {
      val __obj = js.Dynamic.literal(
        "AccountIds" -> AccountIds.asInstanceOf[js.Any],
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateAccountsInput]
    }
  }

  @js.native
  trait DisassociateAccountsOutput extends js.Object {
    var Arn: js.UndefOr[BillingGroupArn]
  }

  object DisassociateAccountsOutput {
    @inline
    def apply(
        Arn: js.UndefOr[BillingGroupArn] = js.undefined
    ): DisassociateAccountsOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateAccountsOutput]
    }
  }

  @js.native
  trait DisassociatePricingRulesInput extends js.Object {
    var Arn: PricingPlanArn
    var PricingRuleArns: PricingRuleArnsNonEmptyInput
  }

  object DisassociatePricingRulesInput {
    @inline
    def apply(
        Arn: PricingPlanArn,
        PricingRuleArns: PricingRuleArnsNonEmptyInput
    ): DisassociatePricingRulesInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "PricingRuleArns" -> PricingRuleArns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociatePricingRulesInput]
    }
  }

  @js.native
  trait DisassociatePricingRulesOutput extends js.Object {
    var Arn: js.UndefOr[PricingPlanArn]
  }

  object DisassociatePricingRulesOutput {
    @inline
    def apply(
        Arn: js.UndefOr[PricingPlanArn] = js.undefined
    ): DisassociatePricingRulesOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePricingRulesOutput]
    }
  }

  /** A resource disassociation result for a percentage custom line item.
    */
  @js.native
  trait DisassociateResourceResponseElement extends js.Object {
    var Arn: js.UndefOr[CustomLineItemAssociationElement]
    var Error: js.UndefOr[AssociateResourceError]
  }

  object DisassociateResourceResponseElement {
    @inline
    def apply(
        Arn: js.UndefOr[CustomLineItemAssociationElement] = js.undefined,
        Error: js.UndefOr[AssociateResourceError] = js.undefined
    ): DisassociateResourceResponseElement = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateResourceResponseElement]
    }
  }

  /** The possible Amazon Web Services Free Tier configurations.
    */
  @js.native
  trait FreeTierConfig extends js.Object {
    var Activated: TieringActivated
  }

  object FreeTierConfig {
    @inline
    def apply(
        Activated: TieringActivated
    ): FreeTierConfig = {
      val __obj = js.Dynamic.literal(
        "Activated" -> Activated.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FreeTierConfig]
    }
  }

  /** The filter on the account ID of the linked account, or any of the following: <code>MONITORED</code>: linked accounts that are associated to billing groups. <code>UNMONITORED</code>: linked accounts that are not associated to billing groups. <code>Billing Group Arn</code>: linked accounts that are associated to the provided Billing Group Arn.
    */
  @js.native
  trait ListAccountAssociationsFilter extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var Association: js.UndefOr[Association]
  }

  object ListAccountAssociationsFilter {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Association: js.UndefOr[Association] = js.undefined
    ): ListAccountAssociationsFilter = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Association.foreach(__v => __obj.updateDynamic("Association")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAssociationsFilter]
    }
  }

  @js.native
  trait ListAccountAssociationsInput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var Filters: js.UndefOr[ListAccountAssociationsFilter]
    var NextToken: js.UndefOr[Token]
  }

  object ListAccountAssociationsInput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        Filters: js.UndefOr[ListAccountAssociationsFilter] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAccountAssociationsInput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAssociationsInput]
    }
  }

  @js.native
  trait ListAccountAssociationsOutput extends js.Object {
    var LinkedAccounts: js.UndefOr[AccountAssociationsList]
    var NextToken: js.UndefOr[Token]
  }

  object ListAccountAssociationsOutput {
    @inline
    def apply(
        LinkedAccounts: js.UndefOr[AccountAssociationsList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAccountAssociationsOutput = {
      val __obj = js.Dynamic.literal()
      LinkedAccounts.foreach(__v => __obj.updateDynamic("LinkedAccounts")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAssociationsOutput]
    }
  }

  /** The filter used to retrieve specific <code>BillingGroupCostReportElements</code>.
    */
  @js.native
  trait ListBillingGroupCostReportsFilter extends js.Object {
    var BillingGroupArns: js.UndefOr[BillingGroupArnList]
  }

  object ListBillingGroupCostReportsFilter {
    @inline
    def apply(
        BillingGroupArns: js.UndefOr[BillingGroupArnList] = js.undefined
    ): ListBillingGroupCostReportsFilter = {
      val __obj = js.Dynamic.literal()
      BillingGroupArns.foreach(__v => __obj.updateDynamic("BillingGroupArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBillingGroupCostReportsFilter]
    }
  }

  @js.native
  trait ListBillingGroupCostReportsInput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var Filters: js.UndefOr[ListBillingGroupCostReportsFilter]
    var MaxResults: js.UndefOr[MaxBillingGroupResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListBillingGroupCostReportsInput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        Filters: js.UndefOr[ListBillingGroupCostReportsFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxBillingGroupResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListBillingGroupCostReportsInput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBillingGroupCostReportsInput]
    }
  }

  @js.native
  trait ListBillingGroupCostReportsOutput extends js.Object {
    var BillingGroupCostReports: js.UndefOr[BillingGroupCostReportList]
    var NextToken: js.UndefOr[Token]
  }

  object ListBillingGroupCostReportsOutput {
    @inline
    def apply(
        BillingGroupCostReports: js.UndefOr[BillingGroupCostReportList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListBillingGroupCostReportsOutput = {
      val __obj = js.Dynamic.literal()
      BillingGroupCostReports.foreach(__v => __obj.updateDynamic("BillingGroupCostReports")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBillingGroupCostReportsOutput]
    }
  }

  /** The filter that specifies the billing groups and pricing plans to retrieve billing group information.
    */
  @js.native
  trait ListBillingGroupsFilter extends js.Object {
    var Arns: js.UndefOr[BillingGroupArnList]
    var PricingPlan: js.UndefOr[PricingPlanFullArn]
  }

  object ListBillingGroupsFilter {
    @inline
    def apply(
        Arns: js.UndefOr[BillingGroupArnList] = js.undefined,
        PricingPlan: js.UndefOr[PricingPlanFullArn] = js.undefined
    ): ListBillingGroupsFilter = {
      val __obj = js.Dynamic.literal()
      Arns.foreach(__v => __obj.updateDynamic("Arns")(__v.asInstanceOf[js.Any]))
      PricingPlan.foreach(__v => __obj.updateDynamic("PricingPlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBillingGroupsFilter]
    }
  }

  @js.native
  trait ListBillingGroupsInput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var Filters: js.UndefOr[ListBillingGroupsFilter]
    var MaxResults: js.UndefOr[MaxBillingGroupResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListBillingGroupsInput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        Filters: js.UndefOr[ListBillingGroupsFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxBillingGroupResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListBillingGroupsInput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBillingGroupsInput]
    }
  }

  @js.native
  trait ListBillingGroupsOutput extends js.Object {
    var BillingGroups: js.UndefOr[BillingGroupList]
    var NextToken: js.UndefOr[Token]
  }

  object ListBillingGroupsOutput {
    @inline
    def apply(
        BillingGroups: js.UndefOr[BillingGroupList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListBillingGroupsOutput = {
      val __obj = js.Dynamic.literal()
      BillingGroups.foreach(__v => __obj.updateDynamic("BillingGroups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBillingGroupsOutput]
    }
  }

  /** A representation of the charge details of a custom line item.
    */
  @js.native
  trait ListCustomLineItemChargeDetails extends js.Object {
    var Type: CustomLineItemType
    var Flat: js.UndefOr[ListCustomLineItemFlatChargeDetails]
    var Percentage: js.UndefOr[ListCustomLineItemPercentageChargeDetails]
  }

  object ListCustomLineItemChargeDetails {
    @inline
    def apply(
        Type: CustomLineItemType,
        Flat: js.UndefOr[ListCustomLineItemFlatChargeDetails] = js.undefined,
        Percentage: js.UndefOr[ListCustomLineItemPercentageChargeDetails] = js.undefined
    ): ListCustomLineItemChargeDetails = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Flat.foreach(__v => __obj.updateDynamic("Flat")(__v.asInstanceOf[js.Any]))
      Percentage.foreach(__v => __obj.updateDynamic("Percentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomLineItemChargeDetails]
    }
  }

  /** A representation of the charge details that are associated with a flat custom line item.
    */
  @js.native
  trait ListCustomLineItemFlatChargeDetails extends js.Object {
    var ChargeValue: CustomLineItemChargeValue
  }

  object ListCustomLineItemFlatChargeDetails {
    @inline
    def apply(
        ChargeValue: CustomLineItemChargeValue
    ): ListCustomLineItemFlatChargeDetails = {
      val __obj = js.Dynamic.literal(
        "ChargeValue" -> ChargeValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListCustomLineItemFlatChargeDetails]
    }
  }

  /** A representation of the charge details that are associated with a percentage custom line item.
    */
  @js.native
  trait ListCustomLineItemPercentageChargeDetails extends js.Object {
    var PercentageValue: CustomLineItemPercentageChargeValue
  }

  object ListCustomLineItemPercentageChargeDetails {
    @inline
    def apply(
        PercentageValue: CustomLineItemPercentageChargeValue
    ): ListCustomLineItemPercentageChargeDetails = {
      val __obj = js.Dynamic.literal(
        "PercentageValue" -> PercentageValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListCustomLineItemPercentageChargeDetails]
    }
  }

  /** A billing period filter that specifies the custom line item versions to retrieve.
    */
  @js.native
  trait ListCustomLineItemVersionsBillingPeriodRangeFilter extends js.Object {
    var EndBillingPeriod: js.UndefOr[BillingPeriod]
    var StartBillingPeriod: js.UndefOr[BillingPeriod]
  }

  object ListCustomLineItemVersionsBillingPeriodRangeFilter {
    @inline
    def apply(
        EndBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        StartBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined
    ): ListCustomLineItemVersionsBillingPeriodRangeFilter = {
      val __obj = js.Dynamic.literal()
      EndBillingPeriod.foreach(__v => __obj.updateDynamic("EndBillingPeriod")(__v.asInstanceOf[js.Any]))
      StartBillingPeriod.foreach(__v => __obj.updateDynamic("StartBillingPeriod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomLineItemVersionsBillingPeriodRangeFilter]
    }
  }

  /** A filter that specifies the billing period range where the custom line item versions reside.
    */
  @js.native
  trait ListCustomLineItemVersionsFilter extends js.Object {
    var BillingPeriodRange: js.UndefOr[ListCustomLineItemVersionsBillingPeriodRangeFilter]
  }

  object ListCustomLineItemVersionsFilter {
    @inline
    def apply(
        BillingPeriodRange: js.UndefOr[ListCustomLineItemVersionsBillingPeriodRangeFilter] = js.undefined
    ): ListCustomLineItemVersionsFilter = {
      val __obj = js.Dynamic.literal()
      BillingPeriodRange.foreach(__v => __obj.updateDynamic("BillingPeriodRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomLineItemVersionsFilter]
    }
  }

  @js.native
  trait ListCustomLineItemVersionsInput extends js.Object {
    var Arn: CustomLineItemArn
    var Filters: js.UndefOr[ListCustomLineItemVersionsFilter]
    var MaxResults: js.UndefOr[MaxCustomLineItemResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListCustomLineItemVersionsInput {
    @inline
    def apply(
        Arn: CustomLineItemArn,
        Filters: js.UndefOr[ListCustomLineItemVersionsFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxCustomLineItemResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListCustomLineItemVersionsInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomLineItemVersionsInput]
    }
  }

  @js.native
  trait ListCustomLineItemVersionsOutput extends js.Object {
    var CustomLineItemVersions: js.UndefOr[CustomLineItemVersionList]
    var NextToken: js.UndefOr[Token]
  }

  object ListCustomLineItemVersionsOutput {
    @inline
    def apply(
        CustomLineItemVersions: js.UndefOr[CustomLineItemVersionList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListCustomLineItemVersionsOutput = {
      val __obj = js.Dynamic.literal()
      CustomLineItemVersions.foreach(__v => __obj.updateDynamic("CustomLineItemVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomLineItemVersionsOutput]
    }
  }

  /** A filter that specifies the custom line items and billing groups to retrieve FFLI information.
    */
  @js.native
  trait ListCustomLineItemsFilter extends js.Object {
    var Arns: js.UndefOr[CustomLineItemArns]
    var BillingGroups: js.UndefOr[BillingGroupArnList]
    var Names: js.UndefOr[CustomLineItemNameList]
  }

  object ListCustomLineItemsFilter {
    @inline
    def apply(
        Arns: js.UndefOr[CustomLineItemArns] = js.undefined,
        BillingGroups: js.UndefOr[BillingGroupArnList] = js.undefined,
        Names: js.UndefOr[CustomLineItemNameList] = js.undefined
    ): ListCustomLineItemsFilter = {
      val __obj = js.Dynamic.literal()
      Arns.foreach(__v => __obj.updateDynamic("Arns")(__v.asInstanceOf[js.Any]))
      BillingGroups.foreach(__v => __obj.updateDynamic("BillingGroups")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomLineItemsFilter]
    }
  }

  @js.native
  trait ListCustomLineItemsInput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var Filters: js.UndefOr[ListCustomLineItemsFilter]
    var MaxResults: js.UndefOr[MaxCustomLineItemResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListCustomLineItemsInput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        Filters: js.UndefOr[ListCustomLineItemsFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxCustomLineItemResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListCustomLineItemsInput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomLineItemsInput]
    }
  }

  @js.native
  trait ListCustomLineItemsOutput extends js.Object {
    var CustomLineItems: js.UndefOr[CustomLineItemList]
    var NextToken: js.UndefOr[Token]
  }

  object ListCustomLineItemsOutput {
    @inline
    def apply(
        CustomLineItems: js.UndefOr[CustomLineItemList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListCustomLineItemsOutput = {
      val __obj = js.Dynamic.literal()
      CustomLineItems.foreach(__v => __obj.updateDynamic("CustomLineItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCustomLineItemsOutput]
    }
  }

  @js.native
  trait ListPricingPlansAssociatedWithPricingRuleInput extends js.Object {
    var PricingRuleArn: PricingRuleArn
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var MaxResults: js.UndefOr[MaxPricingRuleResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListPricingPlansAssociatedWithPricingRuleInput {
    @inline
    def apply(
        PricingRuleArn: PricingRuleArn,
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        MaxResults: js.UndefOr[MaxPricingRuleResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPricingPlansAssociatedWithPricingRuleInput = {
      val __obj = js.Dynamic.literal(
        "PricingRuleArn" -> PricingRuleArn.asInstanceOf[js.Any]
      )

      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingPlansAssociatedWithPricingRuleInput]
    }
  }

  @js.native
  trait ListPricingPlansAssociatedWithPricingRuleOutput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var NextToken: js.UndefOr[Token]
    var PricingPlanArns: js.UndefOr[PricingPlanArns]
    var PricingRuleArn: js.UndefOr[PricingRuleArn]
  }

  object ListPricingPlansAssociatedWithPricingRuleOutput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        PricingPlanArns: js.UndefOr[PricingPlanArns] = js.undefined,
        PricingRuleArn: js.UndefOr[PricingRuleArn] = js.undefined
    ): ListPricingPlansAssociatedWithPricingRuleOutput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PricingPlanArns.foreach(__v => __obj.updateDynamic("PricingPlanArns")(__v.asInstanceOf[js.Any]))
      PricingRuleArn.foreach(__v => __obj.updateDynamic("PricingRuleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingPlansAssociatedWithPricingRuleOutput]
    }
  }

  /** The filter that specifies the Amazon Resource Names (ARNs) of pricing plans, to retrieve pricing plan information.
    */
  @js.native
  trait ListPricingPlansFilter extends js.Object {
    var Arns: js.UndefOr[PricingPlanArns]
  }

  object ListPricingPlansFilter {
    @inline
    def apply(
        Arns: js.UndefOr[PricingPlanArns] = js.undefined
    ): ListPricingPlansFilter = {
      val __obj = js.Dynamic.literal()
      Arns.foreach(__v => __obj.updateDynamic("Arns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingPlansFilter]
    }
  }

  @js.native
  trait ListPricingPlansInput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var Filters: js.UndefOr[ListPricingPlansFilter]
    var MaxResults: js.UndefOr[MaxPricingPlanResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListPricingPlansInput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        Filters: js.UndefOr[ListPricingPlansFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxPricingPlanResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPricingPlansInput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingPlansInput]
    }
  }

  @js.native
  trait ListPricingPlansOutput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var NextToken: js.UndefOr[Token]
    var PricingPlans: js.UndefOr[PricingPlanList]
  }

  object ListPricingPlansOutput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        PricingPlans: js.UndefOr[PricingPlanList] = js.undefined
    ): ListPricingPlansOutput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PricingPlans.foreach(__v => __obj.updateDynamic("PricingPlans")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingPlansOutput]
    }
  }

  @js.native
  trait ListPricingRulesAssociatedToPricingPlanInput extends js.Object {
    var PricingPlanArn: PricingPlanArn
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var MaxResults: js.UndefOr[MaxPricingPlanResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListPricingRulesAssociatedToPricingPlanInput {
    @inline
    def apply(
        PricingPlanArn: PricingPlanArn,
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        MaxResults: js.UndefOr[MaxPricingPlanResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPricingRulesAssociatedToPricingPlanInput = {
      val __obj = js.Dynamic.literal(
        "PricingPlanArn" -> PricingPlanArn.asInstanceOf[js.Any]
      )

      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingRulesAssociatedToPricingPlanInput]
    }
  }

  @js.native
  trait ListPricingRulesAssociatedToPricingPlanOutput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var NextToken: js.UndefOr[Token]
    var PricingPlanArn: js.UndefOr[PricingPlanArn]
    var PricingRuleArns: js.UndefOr[PricingRuleArns]
  }

  object ListPricingRulesAssociatedToPricingPlanOutput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        PricingPlanArn: js.UndefOr[PricingPlanArn] = js.undefined,
        PricingRuleArns: js.UndefOr[PricingRuleArns] = js.undefined
    ): ListPricingRulesAssociatedToPricingPlanOutput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PricingPlanArn.foreach(__v => __obj.updateDynamic("PricingPlanArn")(__v.asInstanceOf[js.Any]))
      PricingRuleArns.foreach(__v => __obj.updateDynamic("PricingRuleArns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingRulesAssociatedToPricingPlanOutput]
    }
  }

  /** The filter that specifies criteria that the pricing rules returned by the <code>ListPricingRules</code> API will adhere to.
    */
  @js.native
  trait ListPricingRulesFilter extends js.Object {
    var Arns: js.UndefOr[PricingRuleArns]
  }

  object ListPricingRulesFilter {
    @inline
    def apply(
        Arns: js.UndefOr[PricingRuleArns] = js.undefined
    ): ListPricingRulesFilter = {
      val __obj = js.Dynamic.literal()
      Arns.foreach(__v => __obj.updateDynamic("Arns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingRulesFilter]
    }
  }

  @js.native
  trait ListPricingRulesInput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var Filters: js.UndefOr[ListPricingRulesFilter]
    var MaxResults: js.UndefOr[MaxPricingRuleResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListPricingRulesInput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        Filters: js.UndefOr[ListPricingRulesFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxPricingRuleResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPricingRulesInput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingRulesInput]
    }
  }

  @js.native
  trait ListPricingRulesOutput extends js.Object {
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var NextToken: js.UndefOr[Token]
    var PricingRules: js.UndefOr[PricingRuleList]
  }

  object ListPricingRulesOutput {
    @inline
    def apply(
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        PricingRules: js.UndefOr[PricingRuleList] = js.undefined
    ): ListPricingRulesOutput = {
      val __obj = js.Dynamic.literal()
      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PricingRules.foreach(__v => __obj.updateDynamic("PricingRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPricingRulesOutput]
    }
  }

  /** A filter that specifies the type of resource associations that should be retrieved for a custom line item.
    */
  @js.native
  trait ListResourcesAssociatedToCustomLineItemFilter extends js.Object {
    var Relationship: js.UndefOr[CustomLineItemRelationship]
  }

  object ListResourcesAssociatedToCustomLineItemFilter {
    @inline
    def apply(
        Relationship: js.UndefOr[CustomLineItemRelationship] = js.undefined
    ): ListResourcesAssociatedToCustomLineItemFilter = {
      val __obj = js.Dynamic.literal()
      Relationship.foreach(__v => __obj.updateDynamic("Relationship")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesAssociatedToCustomLineItemFilter]
    }
  }

  @js.native
  trait ListResourcesAssociatedToCustomLineItemInput extends js.Object {
    var Arn: CustomLineItemArn
    var BillingPeriod: js.UndefOr[BillingPeriod]
    var Filters: js.UndefOr[ListResourcesAssociatedToCustomLineItemFilter]
    var MaxResults: js.UndefOr[MaxCustomLineItemResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListResourcesAssociatedToCustomLineItemInput {
    @inline
    def apply(
        Arn: CustomLineItemArn,
        BillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        Filters: js.UndefOr[ListResourcesAssociatedToCustomLineItemFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxCustomLineItemResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListResourcesAssociatedToCustomLineItemInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      BillingPeriod.foreach(__v => __obj.updateDynamic("BillingPeriod")(__v.asInstanceOf[js.Any]))
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesAssociatedToCustomLineItemInput]
    }
  }

  @js.native
  trait ListResourcesAssociatedToCustomLineItemOutput extends js.Object {
    var Arn: js.UndefOr[CustomLineItemArn]
    var AssociatedResources: js.UndefOr[ListResourcesAssociatedToCustomLineItemResponseList]
    var NextToken: js.UndefOr[Token]
  }

  object ListResourcesAssociatedToCustomLineItemOutput {
    @inline
    def apply(
        Arn: js.UndefOr[CustomLineItemArn] = js.undefined,
        AssociatedResources: js.UndefOr[ListResourcesAssociatedToCustomLineItemResponseList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListResourcesAssociatedToCustomLineItemOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssociatedResources.foreach(__v => __obj.updateDynamic("AssociatedResources")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesAssociatedToCustomLineItemOutput]
    }
  }

  /** A representation of a resource association for a custom line item.
    */
  @js.native
  trait ListResourcesAssociatedToCustomLineItemResponseElement extends js.Object {
    var Arn: js.UndefOr[CustomLineItemAssociationElement]
    var EndBillingPeriod: js.UndefOr[BillingPeriod]
    var Relationship: js.UndefOr[CustomLineItemRelationship]
  }

  object ListResourcesAssociatedToCustomLineItemResponseElement {
    @inline
    def apply(
        Arn: js.UndefOr[CustomLineItemAssociationElement] = js.undefined,
        EndBillingPeriod: js.UndefOr[BillingPeriod] = js.undefined,
        Relationship: js.UndefOr[CustomLineItemRelationship] = js.undefined
    ): ListResourcesAssociatedToCustomLineItemResponseElement = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      EndBillingPeriod.foreach(__v => __obj.updateDynamic("EndBillingPeriod")(__v.asInstanceOf[js.Any]))
      Relationship.foreach(__v => __obj.updateDynamic("Relationship")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourcesAssociatedToCustomLineItemResponseElement]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A representation of a pricing plan.
    */
  @js.native
  trait PricingPlanListElement extends js.Object {
    var Arn: js.UndefOr[PricingPlanArn]
    var CreationTime: js.UndefOr[Instant]
    var Description: js.UndefOr[PricingPlanDescription]
    var LastModifiedTime: js.UndefOr[Instant]
    var Name: js.UndefOr[PricingPlanName]
    var Size: js.UndefOr[NumberOfAssociatedPricingRules]
  }

  object PricingPlanListElement {
    @inline
    def apply(
        Arn: js.UndefOr[PricingPlanArn] = js.undefined,
        CreationTime: js.UndefOr[Instant] = js.undefined,
        Description: js.UndefOr[PricingPlanDescription] = js.undefined,
        LastModifiedTime: js.UndefOr[Instant] = js.undefined,
        Name: js.UndefOr[PricingPlanName] = js.undefined,
        Size: js.UndefOr[NumberOfAssociatedPricingRules] = js.undefined
    ): PricingPlanListElement = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PricingPlanListElement]
    }
  }

  /** A representation of a pricing rule.
    */
  @js.native
  trait PricingRuleListElement extends js.Object {
    var Arn: js.UndefOr[PricingRuleArn]
    var AssociatedPricingPlanCount: js.UndefOr[NumberOfPricingPlansAssociatedWith]
    var BillingEntity: js.UndefOr[BillingEntity]
    var CreationTime: js.UndefOr[Instant]
    var Description: js.UndefOr[PricingRuleDescription]
    var LastModifiedTime: js.UndefOr[Instant]
    var ModifierPercentage: js.UndefOr[ModifierPercentage]
    var Name: js.UndefOr[PricingRuleName]
    var Scope: js.UndefOr[PricingRuleScope]
    var Service: js.UndefOr[Service]
    var Tiering: js.UndefOr[Tiering]
    var Type: js.UndefOr[PricingRuleType]
  }

  object PricingRuleListElement {
    @inline
    def apply(
        Arn: js.UndefOr[PricingRuleArn] = js.undefined,
        AssociatedPricingPlanCount: js.UndefOr[NumberOfPricingPlansAssociatedWith] = js.undefined,
        BillingEntity: js.UndefOr[BillingEntity] = js.undefined,
        CreationTime: js.UndefOr[Instant] = js.undefined,
        Description: js.UndefOr[PricingRuleDescription] = js.undefined,
        LastModifiedTime: js.UndefOr[Instant] = js.undefined,
        ModifierPercentage: js.UndefOr[ModifierPercentage] = js.undefined,
        Name: js.UndefOr[PricingRuleName] = js.undefined,
        Scope: js.UndefOr[PricingRuleScope] = js.undefined,
        Service: js.UndefOr[Service] = js.undefined,
        Tiering: js.UndefOr[Tiering] = js.undefined,
        Type: js.UndefOr[PricingRuleType] = js.undefined
    ): PricingRuleListElement = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssociatedPricingPlanCount.foreach(__v => __obj.updateDynamic("AssociatedPricingPlanCount")(__v.asInstanceOf[js.Any]))
      BillingEntity.foreach(__v => __obj.updateDynamic("BillingEntity")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ModifierPercentage.foreach(__v => __obj.updateDynamic("ModifierPercentage")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      Tiering.foreach(__v => __obj.updateDynamic("Tiering")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PricingRuleListElement]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** The set of tiering configurations for the pricing rule.
    */
  @js.native
  trait Tiering extends js.Object {
    var FreeTier: FreeTierConfig
  }

  object Tiering {
    @inline
    def apply(
        FreeTier: FreeTierConfig
    ): Tiering = {
      val __obj = js.Dynamic.literal(
        "FreeTier" -> FreeTier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tiering]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateBillingGroupInput extends js.Object {
    var Arn: BillingGroupArn
    var ComputationPreference: js.UndefOr[ComputationPreference]
    var Description: js.UndefOr[BillingGroupDescription]
    var Name: js.UndefOr[BillingGroupName]
    var Status: js.UndefOr[BillingGroupStatus]
  }

  object UpdateBillingGroupInput {
    @inline
    def apply(
        Arn: BillingGroupArn,
        ComputationPreference: js.UndefOr[ComputationPreference] = js.undefined,
        Description: js.UndefOr[BillingGroupDescription] = js.undefined,
        Name: js.UndefOr[BillingGroupName] = js.undefined,
        Status: js.UndefOr[BillingGroupStatus] = js.undefined
    ): UpdateBillingGroupInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      ComputationPreference.foreach(__v => __obj.updateDynamic("ComputationPreference")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBillingGroupInput]
    }
  }

  @js.native
  trait UpdateBillingGroupOutput extends js.Object {
    var Arn: js.UndefOr[BillingGroupArn]
    var Description: js.UndefOr[BillingGroupDescription]
    var LastModifiedTime: js.UndefOr[Instant]
    var Name: js.UndefOr[BillingGroupName]
    var PricingPlanArn: js.UndefOr[PricingPlanArn]
    var PrimaryAccountId: js.UndefOr[AccountId]
    var Size: js.UndefOr[NumberOfAccounts]
    var Status: js.UndefOr[BillingGroupStatus]
    var StatusReason: js.UndefOr[BillingGroupStatusReason]
  }

  object UpdateBillingGroupOutput {
    @inline
    def apply(
        Arn: js.UndefOr[BillingGroupArn] = js.undefined,
        Description: js.UndefOr[BillingGroupDescription] = js.undefined,
        LastModifiedTime: js.UndefOr[Instant] = js.undefined,
        Name: js.UndefOr[BillingGroupName] = js.undefined,
        PricingPlanArn: js.UndefOr[PricingPlanArn] = js.undefined,
        PrimaryAccountId: js.UndefOr[AccountId] = js.undefined,
        Size: js.UndefOr[NumberOfAccounts] = js.undefined,
        Status: js.UndefOr[BillingGroupStatus] = js.undefined,
        StatusReason: js.UndefOr[BillingGroupStatusReason] = js.undefined
    ): UpdateBillingGroupOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PricingPlanArn.foreach(__v => __obj.updateDynamic("PricingPlanArn")(__v.asInstanceOf[js.Any]))
      PrimaryAccountId.foreach(__v => __obj.updateDynamic("PrimaryAccountId")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBillingGroupOutput]
    }
  }

  /** A representation of the new charge details of a custom line item. This should contain only one of <code>Flat</code> or <code>Percentage</code>.
    */
  @js.native
  trait UpdateCustomLineItemChargeDetails extends js.Object {
    var Flat: js.UndefOr[UpdateCustomLineItemFlatChargeDetails]
    var Percentage: js.UndefOr[UpdateCustomLineItemPercentageChargeDetails]
  }

  object UpdateCustomLineItemChargeDetails {
    @inline
    def apply(
        Flat: js.UndefOr[UpdateCustomLineItemFlatChargeDetails] = js.undefined,
        Percentage: js.UndefOr[UpdateCustomLineItemPercentageChargeDetails] = js.undefined
    ): UpdateCustomLineItemChargeDetails = {
      val __obj = js.Dynamic.literal()
      Flat.foreach(__v => __obj.updateDynamic("Flat")(__v.asInstanceOf[js.Any]))
      Percentage.foreach(__v => __obj.updateDynamic("Percentage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCustomLineItemChargeDetails]
    }
  }

  /** A representation of the new charge details that are associated with a flat custom line item.
    */
  @js.native
  trait UpdateCustomLineItemFlatChargeDetails extends js.Object {
    var ChargeValue: CustomLineItemChargeValue
  }

  object UpdateCustomLineItemFlatChargeDetails {
    @inline
    def apply(
        ChargeValue: CustomLineItemChargeValue
    ): UpdateCustomLineItemFlatChargeDetails = {
      val __obj = js.Dynamic.literal(
        "ChargeValue" -> ChargeValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCustomLineItemFlatChargeDetails]
    }
  }

  @js.native
  trait UpdateCustomLineItemInput extends js.Object {
    var Arn: CustomLineItemArn
    var BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange]
    var ChargeDetails: js.UndefOr[UpdateCustomLineItemChargeDetails]
    var Description: js.UndefOr[CustomLineItemDescription]
    var Name: js.UndefOr[CustomLineItemName]
  }

  object UpdateCustomLineItemInput {
    @inline
    def apply(
        Arn: CustomLineItemArn,
        BillingPeriodRange: js.UndefOr[CustomLineItemBillingPeriodRange] = js.undefined,
        ChargeDetails: js.UndefOr[UpdateCustomLineItemChargeDetails] = js.undefined,
        Description: js.UndefOr[CustomLineItemDescription] = js.undefined,
        Name: js.UndefOr[CustomLineItemName] = js.undefined
    ): UpdateCustomLineItemInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      BillingPeriodRange.foreach(__v => __obj.updateDynamic("BillingPeriodRange")(__v.asInstanceOf[js.Any]))
      ChargeDetails.foreach(__v => __obj.updateDynamic("ChargeDetails")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCustomLineItemInput]
    }
  }

  @js.native
  trait UpdateCustomLineItemOutput extends js.Object {
    var Arn: js.UndefOr[CustomLineItemArn]
    var AssociationSize: js.UndefOr[NumberOfAssociations]
    var BillingGroupArn: js.UndefOr[BillingGroupFullArn]
    var ChargeDetails: js.UndefOr[ListCustomLineItemChargeDetails]
    var Description: js.UndefOr[CustomLineItemDescription]
    var LastModifiedTime: js.UndefOr[Instant]
    var Name: js.UndefOr[CustomLineItemName]
  }

  object UpdateCustomLineItemOutput {
    @inline
    def apply(
        Arn: js.UndefOr[CustomLineItemArn] = js.undefined,
        AssociationSize: js.UndefOr[NumberOfAssociations] = js.undefined,
        BillingGroupArn: js.UndefOr[BillingGroupFullArn] = js.undefined,
        ChargeDetails: js.UndefOr[ListCustomLineItemChargeDetails] = js.undefined,
        Description: js.UndefOr[CustomLineItemDescription] = js.undefined,
        LastModifiedTime: js.UndefOr[Instant] = js.undefined,
        Name: js.UndefOr[CustomLineItemName] = js.undefined
    ): UpdateCustomLineItemOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssociationSize.foreach(__v => __obj.updateDynamic("AssociationSize")(__v.asInstanceOf[js.Any]))
      BillingGroupArn.foreach(__v => __obj.updateDynamic("BillingGroupArn")(__v.asInstanceOf[js.Any]))
      ChargeDetails.foreach(__v => __obj.updateDynamic("ChargeDetails")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCustomLineItemOutput]
    }
  }

  /** A representation of the new charge details that are associated with a percentage custom line item.
    */
  @js.native
  trait UpdateCustomLineItemPercentageChargeDetails extends js.Object {
    var PercentageValue: CustomLineItemPercentageChargeValue
  }

  object UpdateCustomLineItemPercentageChargeDetails {
    @inline
    def apply(
        PercentageValue: CustomLineItemPercentageChargeValue
    ): UpdateCustomLineItemPercentageChargeDetails = {
      val __obj = js.Dynamic.literal(
        "PercentageValue" -> PercentageValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateCustomLineItemPercentageChargeDetails]
    }
  }

  /** The possible Amazon Web Services Free Tier configurations.
    */
  @js.native
  trait UpdateFreeTierConfig extends js.Object {
    var Activated: TieringActivated
  }

  object UpdateFreeTierConfig {
    @inline
    def apply(
        Activated: TieringActivated
    ): UpdateFreeTierConfig = {
      val __obj = js.Dynamic.literal(
        "Activated" -> Activated.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateFreeTierConfig]
    }
  }

  @js.native
  trait UpdatePricingPlanInput extends js.Object {
    var Arn: PricingPlanArn
    var Description: js.UndefOr[PricingPlanDescription]
    var Name: js.UndefOr[PricingPlanName]
  }

  object UpdatePricingPlanInput {
    @inline
    def apply(
        Arn: PricingPlanArn,
        Description: js.UndefOr[PricingPlanDescription] = js.undefined,
        Name: js.UndefOr[PricingPlanName] = js.undefined
    ): UpdatePricingPlanInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePricingPlanInput]
    }
  }

  @js.native
  trait UpdatePricingPlanOutput extends js.Object {
    var Arn: js.UndefOr[PricingPlanArn]
    var Description: js.UndefOr[PricingPlanDescription]
    var LastModifiedTime: js.UndefOr[Instant]
    var Name: js.UndefOr[PricingPlanName]
    var Size: js.UndefOr[NumberOfAssociatedPricingRules]
  }

  object UpdatePricingPlanOutput {
    @inline
    def apply(
        Arn: js.UndefOr[PricingPlanArn] = js.undefined,
        Description: js.UndefOr[PricingPlanDescription] = js.undefined,
        LastModifiedTime: js.UndefOr[Instant] = js.undefined,
        Name: js.UndefOr[PricingPlanName] = js.undefined,
        Size: js.UndefOr[NumberOfAssociatedPricingRules] = js.undefined
    ): UpdatePricingPlanOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePricingPlanOutput]
    }
  }

  @js.native
  trait UpdatePricingRuleInput extends js.Object {
    var Arn: PricingRuleArn
    var Description: js.UndefOr[PricingRuleDescription]
    var ModifierPercentage: js.UndefOr[ModifierPercentage]
    var Name: js.UndefOr[PricingRuleName]
    var Tiering: js.UndefOr[UpdateTieringInput]
    var Type: js.UndefOr[PricingRuleType]
  }

  object UpdatePricingRuleInput {
    @inline
    def apply(
        Arn: PricingRuleArn,
        Description: js.UndefOr[PricingRuleDescription] = js.undefined,
        ModifierPercentage: js.UndefOr[ModifierPercentage] = js.undefined,
        Name: js.UndefOr[PricingRuleName] = js.undefined,
        Tiering: js.UndefOr[UpdateTieringInput] = js.undefined,
        Type: js.UndefOr[PricingRuleType] = js.undefined
    ): UpdatePricingRuleInput = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ModifierPercentage.foreach(__v => __obj.updateDynamic("ModifierPercentage")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tiering.foreach(__v => __obj.updateDynamic("Tiering")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePricingRuleInput]
    }
  }

  @js.native
  trait UpdatePricingRuleOutput extends js.Object {
    var Arn: js.UndefOr[PricingRuleArn]
    var AssociatedPricingPlanCount: js.UndefOr[NumberOfPricingPlansAssociatedWith]
    var BillingEntity: js.UndefOr[BillingEntity]
    var Description: js.UndefOr[PricingRuleDescription]
    var LastModifiedTime: js.UndefOr[Instant]
    var ModifierPercentage: js.UndefOr[ModifierPercentage]
    var Name: js.UndefOr[PricingRuleName]
    var Scope: js.UndefOr[PricingRuleScope]
    var Service: js.UndefOr[Service]
    var Tiering: js.UndefOr[UpdateTieringInput]
    var Type: js.UndefOr[PricingRuleType]
  }

  object UpdatePricingRuleOutput {
    @inline
    def apply(
        Arn: js.UndefOr[PricingRuleArn] = js.undefined,
        AssociatedPricingPlanCount: js.UndefOr[NumberOfPricingPlansAssociatedWith] = js.undefined,
        BillingEntity: js.UndefOr[BillingEntity] = js.undefined,
        Description: js.UndefOr[PricingRuleDescription] = js.undefined,
        LastModifiedTime: js.UndefOr[Instant] = js.undefined,
        ModifierPercentage: js.UndefOr[ModifierPercentage] = js.undefined,
        Name: js.UndefOr[PricingRuleName] = js.undefined,
        Scope: js.UndefOr[PricingRuleScope] = js.undefined,
        Service: js.UndefOr[Service] = js.undefined,
        Tiering: js.UndefOr[UpdateTieringInput] = js.undefined,
        Type: js.UndefOr[PricingRuleType] = js.undefined
    ): UpdatePricingRuleOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AssociatedPricingPlanCount.foreach(__v => __obj.updateDynamic("AssociatedPricingPlanCount")(__v.asInstanceOf[js.Any]))
      BillingEntity.foreach(__v => __obj.updateDynamic("BillingEntity")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      ModifierPercentage.foreach(__v => __obj.updateDynamic("ModifierPercentage")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      Tiering.foreach(__v => __obj.updateDynamic("Tiering")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePricingRuleOutput]
    }
  }

  /** The set of tiering configurations for the pricing rule.
    */
  @js.native
  trait UpdateTieringInput extends js.Object {
    var FreeTier: UpdateFreeTierConfig
  }

  object UpdateTieringInput {
    @inline
    def apply(
        FreeTier: UpdateFreeTierConfig
    ): UpdateTieringInput = {
      val __obj = js.Dynamic.literal(
        "FreeTier" -> FreeTier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTieringInput]
    }
  }
}
