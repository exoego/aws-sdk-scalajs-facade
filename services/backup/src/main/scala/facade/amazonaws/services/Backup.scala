package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object backup {
  type ARN                            = String
  type BackupJobState                 = String
  type BackupJobsList                 = js.Array[BackupJob]
  type BackupPlanName                 = String
  type BackupPlanTemplatesList        = js.Array[BackupPlanTemplatesListMember]
  type BackupPlanVersionsList         = js.Array[BackupPlansListMember]
  type BackupPlansList                = js.Array[BackupPlansListMember]
  type BackupRuleName                 = String
  type BackupRules                    = js.Array[BackupRule]
  type BackupRulesInput               = js.Array[BackupRuleInput]
  type BackupSelectionName            = String
  type BackupSelectionsList           = js.Array[BackupSelectionsListMember]
  type BackupVaultEvent               = String
  type BackupVaultEvents              = js.Array[BackupVaultEvent]
  type BackupVaultList                = js.Array[BackupVaultListMember]
  type BackupVaultName                = String
  type ConditionKey                   = String
  type ConditionType                  = String
  type ConditionValue                 = String
  type CronExpression                 = String
  type IAMPolicy                      = String
  type IAMRoleArn                     = String
  type ListOfTags                     = js.Array[Condition]
  type MaxResults                     = Int
  type Metadata                       = js.Dictionary[MetadataValue]
  type MetadataKey                    = String
  type MetadataValue                  = String
  type ProtectedResourcesList         = js.Array[ProtectedResource]
  type RecoveryPointByBackupVaultList = js.Array[RecoveryPointByBackupVault]
  type RecoveryPointByResourceList    = js.Array[RecoveryPointByResource]
  type RecoveryPointStatus            = String
  type ResourceArns                   = js.Array[ARN]
  type ResourceType                   = String
  type ResourceTypes                  = js.Array[ResourceType]
  type RestoreJobId                   = String
  type RestoreJobStatus               = String
  type RestoreJobsList                = js.Array[RestoreJobsListMember]
  type StorageClass                   = String
  type TagKey                         = String
  type TagKeyList                     = js.Array[String]
  type TagValue                       = String
  type Tags                           = js.Dictionary[TagValue]
  type WindowMinutes                  = Double
  type timestamp                      = js.Date

  implicit final class BackupOps(val service: Backup) extends AnyVal {

    def createBackupPlanFuture(params: CreateBackupPlanInput): Future[CreateBackupPlanOutput] =
      service.createBackupPlan(params).promise.toFuture
    def createBackupSelectionFuture(params: CreateBackupSelectionInput): Future[CreateBackupSelectionOutput] =
      service.createBackupSelection(params).promise.toFuture
    def createBackupVaultFuture(params: CreateBackupVaultInput): Future[CreateBackupVaultOutput] =
      service.createBackupVault(params).promise.toFuture
    def deleteBackupPlanFuture(params: DeleteBackupPlanInput): Future[DeleteBackupPlanOutput] =
      service.deleteBackupPlan(params).promise.toFuture
    def deleteBackupSelectionFuture(params: DeleteBackupSelectionInput): Future[js.Object] =
      service.deleteBackupSelection(params).promise.toFuture
    def deleteBackupVaultAccessPolicyFuture(params: DeleteBackupVaultAccessPolicyInput): Future[js.Object] =
      service.deleteBackupVaultAccessPolicy(params).promise.toFuture
    def deleteBackupVaultFuture(params: DeleteBackupVaultInput): Future[js.Object] =
      service.deleteBackupVault(params).promise.toFuture
    def deleteBackupVaultNotificationsFuture(params: DeleteBackupVaultNotificationsInput): Future[js.Object] =
      service.deleteBackupVaultNotifications(params).promise.toFuture
    def deleteRecoveryPointFuture(params: DeleteRecoveryPointInput): Future[js.Object] =
      service.deleteRecoveryPoint(params).promise.toFuture
    def describeBackupJobFuture(params: DescribeBackupJobInput): Future[DescribeBackupJobOutput] =
      service.describeBackupJob(params).promise.toFuture
    def describeBackupVaultFuture(params: DescribeBackupVaultInput): Future[DescribeBackupVaultOutput] =
      service.describeBackupVault(params).promise.toFuture
    def describeProtectedResourceFuture(
        params: DescribeProtectedResourceInput
    ): Future[DescribeProtectedResourceOutput] = service.describeProtectedResource(params).promise.toFuture
    def describeRecoveryPointFuture(params: DescribeRecoveryPointInput): Future[DescribeRecoveryPointOutput] =
      service.describeRecoveryPoint(params).promise.toFuture
    def describeRestoreJobFuture(params: DescribeRestoreJobInput): Future[DescribeRestoreJobOutput] =
      service.describeRestoreJob(params).promise.toFuture
    def exportBackupPlanTemplateFuture(params: ExportBackupPlanTemplateInput): Future[ExportBackupPlanTemplateOutput] =
      service.exportBackupPlanTemplate(params).promise.toFuture
    def getBackupPlanFromJSONFuture(params: GetBackupPlanFromJSONInput): Future[GetBackupPlanFromJSONOutput] =
      service.getBackupPlanFromJSON(params).promise.toFuture
    def getBackupPlanFromTemplateFuture(
        params: GetBackupPlanFromTemplateInput
    ): Future[GetBackupPlanFromTemplateOutput] = service.getBackupPlanFromTemplate(params).promise.toFuture
    def getBackupPlanFuture(params: GetBackupPlanInput): Future[GetBackupPlanOutput] =
      service.getBackupPlan(params).promise.toFuture
    def getBackupSelectionFuture(params: GetBackupSelectionInput): Future[GetBackupSelectionOutput] =
      service.getBackupSelection(params).promise.toFuture
    def getBackupVaultAccessPolicyFuture(
        params: GetBackupVaultAccessPolicyInput
    ): Future[GetBackupVaultAccessPolicyOutput] = service.getBackupVaultAccessPolicy(params).promise.toFuture
    def getBackupVaultNotificationsFuture(
        params: GetBackupVaultNotificationsInput
    ): Future[GetBackupVaultNotificationsOutput] = service.getBackupVaultNotifications(params).promise.toFuture
    def getRecoveryPointRestoreMetadataFuture(
        params: GetRecoveryPointRestoreMetadataInput
    ): Future[GetRecoveryPointRestoreMetadataOutput] = service.getRecoveryPointRestoreMetadata(params).promise.toFuture
    def getSupportedResourceTypesFuture(): Future[GetSupportedResourceTypesOutput] =
      service.getSupportedResourceTypes().promise.toFuture
    def listBackupJobsFuture(params: ListBackupJobsInput): Future[ListBackupJobsOutput] =
      service.listBackupJobs(params).promise.toFuture
    def listBackupPlanTemplatesFuture(params: ListBackupPlanTemplatesInput): Future[ListBackupPlanTemplatesOutput] =
      service.listBackupPlanTemplates(params).promise.toFuture
    def listBackupPlanVersionsFuture(params: ListBackupPlanVersionsInput): Future[ListBackupPlanVersionsOutput] =
      service.listBackupPlanVersions(params).promise.toFuture
    def listBackupPlansFuture(params: ListBackupPlansInput): Future[ListBackupPlansOutput] =
      service.listBackupPlans(params).promise.toFuture
    def listBackupSelectionsFuture(params: ListBackupSelectionsInput): Future[ListBackupSelectionsOutput] =
      service.listBackupSelections(params).promise.toFuture
    def listBackupVaultsFuture(params: ListBackupVaultsInput): Future[ListBackupVaultsOutput] =
      service.listBackupVaults(params).promise.toFuture
    def listProtectedResourcesFuture(params: ListProtectedResourcesInput): Future[ListProtectedResourcesOutput] =
      service.listProtectedResources(params).promise.toFuture
    def listRecoveryPointsByBackupVaultFuture(
        params: ListRecoveryPointsByBackupVaultInput
    ): Future[ListRecoveryPointsByBackupVaultOutput] = service.listRecoveryPointsByBackupVault(params).promise.toFuture
    def listRecoveryPointsByResourceFuture(
        params: ListRecoveryPointsByResourceInput
    ): Future[ListRecoveryPointsByResourceOutput] = service.listRecoveryPointsByResource(params).promise.toFuture
    def listRestoreJobsFuture(params: ListRestoreJobsInput): Future[ListRestoreJobsOutput] =
      service.listRestoreJobs(params).promise.toFuture
    def listTagsFuture(params: ListTagsInput): Future[ListTagsOutput] = service.listTags(params).promise.toFuture
    def putBackupVaultAccessPolicyFuture(params: PutBackupVaultAccessPolicyInput): Future[js.Object] =
      service.putBackupVaultAccessPolicy(params).promise.toFuture
    def putBackupVaultNotificationsFuture(params: PutBackupVaultNotificationsInput): Future[js.Object] =
      service.putBackupVaultNotifications(params).promise.toFuture
    def startBackupJobFuture(params: StartBackupJobInput): Future[StartBackupJobOutput] =
      service.startBackupJob(params).promise.toFuture
    def startRestoreJobFuture(params: StartRestoreJobInput): Future[StartRestoreJobOutput] =
      service.startRestoreJob(params).promise.toFuture
    def stopBackupJobFuture(params: StopBackupJobInput): Future[js.Object] =
      service.stopBackupJob(params).promise.toFuture
    def tagResourceFuture(params: TagResourceInput): Future[js.Object] = service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceInput): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateBackupPlanFuture(params: UpdateBackupPlanInput): Future[UpdateBackupPlanOutput] =
      service.updateBackupPlan(params).promise.toFuture
    def updateRecoveryPointLifecycleFuture(
        params: UpdateRecoveryPointLifecycleInput
    ): Future[UpdateRecoveryPointLifecycleOutput] = service.updateRecoveryPointLifecycle(params).promise.toFuture
  }
}

package backup {
  @js.native
  @JSImport("aws-sdk", "Backup")
  class Backup() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBackupPlan(params: CreateBackupPlanInput): Request[CreateBackupPlanOutput]                = js.native
    def createBackupSelection(params: CreateBackupSelectionInput): Request[CreateBackupSelectionOutput] = js.native
    def createBackupVault(params: CreateBackupVaultInput): Request[CreateBackupVaultOutput]             = js.native
    def deleteBackupPlan(params: DeleteBackupPlanInput): Request[DeleteBackupPlanOutput]                = js.native
    def deleteBackupSelection(params: DeleteBackupSelectionInput): Request[js.Object]                   = js.native
    def deleteBackupVault(params: DeleteBackupVaultInput): Request[js.Object]                           = js.native
    def deleteBackupVaultAccessPolicy(params: DeleteBackupVaultAccessPolicyInput): Request[js.Object]   = js.native
    def deleteBackupVaultNotifications(params: DeleteBackupVaultNotificationsInput): Request[js.Object] = js.native
    def deleteRecoveryPoint(params: DeleteRecoveryPointInput): Request[js.Object]                       = js.native
    def describeBackupJob(params: DescribeBackupJobInput): Request[DescribeBackupJobOutput]             = js.native
    def describeBackupVault(params: DescribeBackupVaultInput): Request[DescribeBackupVaultOutput]       = js.native
    def describeProtectedResource(params: DescribeProtectedResourceInput): Request[DescribeProtectedResourceOutput] =
      js.native
    def describeRecoveryPoint(params: DescribeRecoveryPointInput): Request[DescribeRecoveryPointOutput] = js.native
    def describeRestoreJob(params: DescribeRestoreJobInput): Request[DescribeRestoreJobOutput]          = js.native
    def exportBackupPlanTemplate(params: ExportBackupPlanTemplateInput): Request[ExportBackupPlanTemplateOutput] =
      js.native
    def getBackupPlan(params: GetBackupPlanInput): Request[GetBackupPlanOutput]                         = js.native
    def getBackupPlanFromJSON(params: GetBackupPlanFromJSONInput): Request[GetBackupPlanFromJSONOutput] = js.native
    def getBackupPlanFromTemplate(params: GetBackupPlanFromTemplateInput): Request[GetBackupPlanFromTemplateOutput] =
      js.native
    def getBackupSelection(params: GetBackupSelectionInput): Request[GetBackupSelectionOutput] = js.native
    def getBackupVaultAccessPolicy(params: GetBackupVaultAccessPolicyInput): Request[GetBackupVaultAccessPolicyOutput] =
      js.native
    def getBackupVaultNotifications(
        params: GetBackupVaultNotificationsInput
    ): Request[GetBackupVaultNotificationsOutput] = js.native
    def getRecoveryPointRestoreMetadata(
        params: GetRecoveryPointRestoreMetadataInput
    ): Request[GetRecoveryPointRestoreMetadataOutput]                              = js.native
    def getSupportedResourceTypes(): Request[GetSupportedResourceTypesOutput]      = js.native
    def listBackupJobs(params: ListBackupJobsInput): Request[ListBackupJobsOutput] = js.native
    def listBackupPlanTemplates(params: ListBackupPlanTemplatesInput): Request[ListBackupPlanTemplatesOutput] =
      js.native
    def listBackupPlanVersions(params: ListBackupPlanVersionsInput): Request[ListBackupPlanVersionsOutput] = js.native
    def listBackupPlans(params: ListBackupPlansInput): Request[ListBackupPlansOutput]                      = js.native
    def listBackupSelections(params: ListBackupSelectionsInput): Request[ListBackupSelectionsOutput]       = js.native
    def listBackupVaults(params: ListBackupVaultsInput): Request[ListBackupVaultsOutput]                   = js.native
    def listProtectedResources(params: ListProtectedResourcesInput): Request[ListProtectedResourcesOutput] = js.native
    def listRecoveryPointsByBackupVault(
        params: ListRecoveryPointsByBackupVaultInput
    ): Request[ListRecoveryPointsByBackupVaultOutput] = js.native
    def listRecoveryPointsByResource(
        params: ListRecoveryPointsByResourceInput
    ): Request[ListRecoveryPointsByResourceOutput]                                                = js.native
    def listRestoreJobs(params: ListRestoreJobsInput): Request[ListRestoreJobsOutput]             = js.native
    def listTags(params: ListTagsInput): Request[ListTagsOutput]                                  = js.native
    def putBackupVaultAccessPolicy(params: PutBackupVaultAccessPolicyInput): Request[js.Object]   = js.native
    def putBackupVaultNotifications(params: PutBackupVaultNotificationsInput): Request[js.Object] = js.native
    def startBackupJob(params: StartBackupJobInput): Request[StartBackupJobOutput]                = js.native
    def startRestoreJob(params: StartRestoreJobInput): Request[StartRestoreJobOutput]             = js.native
    def stopBackupJob(params: StopBackupJobInput): Request[js.Object]                             = js.native
    def tagResource(params: TagResourceInput): Request[js.Object]                                 = js.native
    def untagResource(params: UntagResourceInput): Request[js.Object]                             = js.native
    def updateBackupPlan(params: UpdateBackupPlanInput): Request[UpdateBackupPlanOutput]          = js.native
    def updateRecoveryPointLifecycle(
        params: UpdateRecoveryPointLifecycleInput
    ): Request[UpdateRecoveryPointLifecycleOutput] = js.native
  }

  /**
    * Contains detailed information about a backup job.
    */
  @js.native
  trait BackupJob extends js.Object {
    var BackupJobId: js.UndefOr[String]
    var BackupSizeInBytes: js.UndefOr[Double]
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var BytesTransferred: js.UndefOr[Double]
    var CompletionDate: js.UndefOr[timestamp]
    var CreatedBy: js.UndefOr[RecoveryPointCreator]
    var CreationDate: js.UndefOr[timestamp]
    var ExpectedCompletionDate: js.UndefOr[timestamp]
    var IamRoleArn: js.UndefOr[IAMRoleArn]
    var PercentDone: js.UndefOr[String]
    var RecoveryPointArn: js.UndefOr[ARN]
    var ResourceArn: js.UndefOr[ARN]
    var ResourceType: js.UndefOr[ResourceType]
    var StartBy: js.UndefOr[timestamp]
    var State: js.UndefOr[BackupJobState]
    var StatusMessage: js.UndefOr[String]
  }

  object BackupJob {
    def apply(
        BackupJobId: js.UndefOr[String] = js.undefined,
        BackupSizeInBytes: js.UndefOr[Double] = js.undefined,
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        BytesTransferred: js.UndefOr[Double] = js.undefined,
        CompletionDate: js.UndefOr[timestamp] = js.undefined,
        CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        ExpectedCompletionDate: js.UndefOr[timestamp] = js.undefined,
        IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        PercentDone: js.UndefOr[String] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined,
        ResourceArn: js.UndefOr[ARN] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        StartBy: js.UndefOr[timestamp] = js.undefined,
        State: js.UndefOr[BackupJobState] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined
    ): BackupJob = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupJobId.foreach(__v => __obj.update("BackupJobId", __v.asInstanceOf[js.Any]))
      BackupSizeInBytes.foreach(__v => __obj.update("BackupSizeInBytes", __v.asInstanceOf[js.Any]))
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      BytesTransferred.foreach(__v => __obj.update("BytesTransferred", __v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.update("CompletionDate", __v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      ExpectedCompletionDate.foreach(__v => __obj.update("ExpectedCompletionDate", __v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.update("IamRoleArn", __v.asInstanceOf[js.Any]))
      PercentDone.foreach(__v => __obj.update("PercentDone", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      StartBy.foreach(__v => __obj.update("StartBy", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupJob]
    }
  }

  object BackupJobStateEnum {
    val CREATED   = "CREATED"
    val PENDING   = "PENDING"
    val RUNNING   = "RUNNING"
    val ABORTING  = "ABORTING"
    val ABORTED   = "ABORTED"
    val COMPLETED = "COMPLETED"
    val FAILED    = "FAILED"
    val EXPIRED   = "EXPIRED"

    val values = IndexedSeq(CREATED, PENDING, RUNNING, ABORTING, ABORTED, COMPLETED, FAILED, EXPIRED)
  }

  /**
    * Contains an optional backup plan display name and an array of <code>BackupRule</code> objects, each of which specifies a backup rule. Each rule in a backup plan is a separate scheduled task and can back up a different selection of AWS resources.
    */
  @js.native
  trait BackupPlan extends js.Object {
    var BackupPlanName: BackupPlanName
    var Rules: BackupRules
  }

  object BackupPlan {
    def apply(
        BackupPlanName: BackupPlanName,
        Rules: BackupRules
    ): BackupPlan = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanName" -> BackupPlanName.asInstanceOf[js.Any],
        "Rules"          -> Rules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BackupPlan]
    }
  }

  /**
    * Contains an optional backup plan display name and an array of <code>BackupRule</code> objects, each of which specifies a backup rule. Each rule in a backup plan is a separate scheduled task and can back up a different selection of AWS resources.
    */
  @js.native
  trait BackupPlanInput extends js.Object {
    var BackupPlanName: BackupPlanName
    var Rules: BackupRulesInput
  }

  object BackupPlanInput {
    def apply(
        BackupPlanName: BackupPlanName,
        Rules: BackupRulesInput
    ): BackupPlanInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanName" -> BackupPlanName.asInstanceOf[js.Any],
        "Rules"          -> Rules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[BackupPlanInput]
    }
  }

  /**
    * An object specifying metadata associated with a backup plan template.
    */
  @js.native
  trait BackupPlanTemplatesListMember extends js.Object {
    var BackupPlanTemplateId: js.UndefOr[String]
    var BackupPlanTemplateName: js.UndefOr[String]
  }

  object BackupPlanTemplatesListMember {
    def apply(
        BackupPlanTemplateId: js.UndefOr[String] = js.undefined,
        BackupPlanTemplateName: js.UndefOr[String] = js.undefined
    ): BackupPlanTemplatesListMember = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanTemplateId.foreach(__v => __obj.update("BackupPlanTemplateId", __v.asInstanceOf[js.Any]))
      BackupPlanTemplateName.foreach(__v => __obj.update("BackupPlanTemplateName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupPlanTemplatesListMember]
    }
  }

  /**
    * Contains metadata about a backup plan.
    */
  @js.native
  trait BackupPlansListMember extends js.Object {
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var BackupPlanName: js.UndefOr[BackupPlanName]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var DeletionDate: js.UndefOr[timestamp]
    var LastExecutionDate: js.UndefOr[timestamp]
    var VersionId: js.UndefOr[String]
  }

  object BackupPlansListMember {
    def apply(
        BackupPlanArn: js.UndefOr[ARN] = js.undefined,
        BackupPlanId: js.UndefOr[String] = js.undefined,
        BackupPlanName: js.UndefOr[BackupPlanName] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[String] = js.undefined,
        DeletionDate: js.UndefOr[timestamp] = js.undefined,
        LastExecutionDate: js.UndefOr[timestamp] = js.undefined,
        VersionId: js.UndefOr[String] = js.undefined
    ): BackupPlansListMember = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanArn.foreach(__v => __obj.update("BackupPlanArn", __v.asInstanceOf[js.Any]))
      BackupPlanId.foreach(__v => __obj.update("BackupPlanId", __v.asInstanceOf[js.Any]))
      BackupPlanName.foreach(__v => __obj.update("BackupPlanName", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      DeletionDate.foreach(__v => __obj.update("DeletionDate", __v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.update("LastExecutionDate", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupPlansListMember]
    }
  }

  /**
    * Specifies a scheduled task used to back up a selection of resources.
    */
  @js.native
  trait BackupRule extends js.Object {
    var RuleName: BackupRuleName
    var TargetBackupVaultName: BackupVaultName
    var CompletionWindowMinutes: js.UndefOr[WindowMinutes]
    var Lifecycle: js.UndefOr[Lifecycle]
    var RecoveryPointTags: js.UndefOr[Tags]
    var RuleId: js.UndefOr[String]
    var ScheduleExpression: js.UndefOr[CronExpression]
    var StartWindowMinutes: js.UndefOr[WindowMinutes]
  }

  object BackupRule {
    def apply(
        RuleName: BackupRuleName,
        TargetBackupVaultName: BackupVaultName,
        CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined,
        Lifecycle: js.UndefOr[Lifecycle] = js.undefined,
        RecoveryPointTags: js.UndefOr[Tags] = js.undefined,
        RuleId: js.UndefOr[String] = js.undefined,
        ScheduleExpression: js.UndefOr[CronExpression] = js.undefined,
        StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
    ): BackupRule = {
      val __obj = js.Dictionary[js.Any](
        "RuleName"              -> RuleName.asInstanceOf[js.Any],
        "TargetBackupVaultName" -> TargetBackupVaultName.asInstanceOf[js.Any]
      )

      CompletionWindowMinutes.foreach(__v => __obj.update("CompletionWindowMinutes", __v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.update("Lifecycle", __v.asInstanceOf[js.Any]))
      RecoveryPointTags.foreach(__v => __obj.update("RecoveryPointTags", __v.asInstanceOf[js.Any]))
      RuleId.foreach(__v => __obj.update("RuleId", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      StartWindowMinutes.foreach(__v => __obj.update("StartWindowMinutes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupRule]
    }
  }

  /**
    * Specifies a scheduled task used to back up a selection of resources.
    */
  @js.native
  trait BackupRuleInput extends js.Object {
    var RuleName: BackupRuleName
    var TargetBackupVaultName: BackupVaultName
    var CompletionWindowMinutes: js.UndefOr[WindowMinutes]
    var Lifecycle: js.UndefOr[Lifecycle]
    var RecoveryPointTags: js.UndefOr[Tags]
    var ScheduleExpression: js.UndefOr[CronExpression]
    var StartWindowMinutes: js.UndefOr[WindowMinutes]
  }

  object BackupRuleInput {
    def apply(
        RuleName: BackupRuleName,
        TargetBackupVaultName: BackupVaultName,
        CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined,
        Lifecycle: js.UndefOr[Lifecycle] = js.undefined,
        RecoveryPointTags: js.UndefOr[Tags] = js.undefined,
        ScheduleExpression: js.UndefOr[CronExpression] = js.undefined,
        StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
    ): BackupRuleInput = {
      val __obj = js.Dictionary[js.Any](
        "RuleName"              -> RuleName.asInstanceOf[js.Any],
        "TargetBackupVaultName" -> TargetBackupVaultName.asInstanceOf[js.Any]
      )

      CompletionWindowMinutes.foreach(__v => __obj.update("CompletionWindowMinutes", __v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.update("Lifecycle", __v.asInstanceOf[js.Any]))
      RecoveryPointTags.foreach(__v => __obj.update("RecoveryPointTags", __v.asInstanceOf[js.Any]))
      ScheduleExpression.foreach(__v => __obj.update("ScheduleExpression", __v.asInstanceOf[js.Any]))
      StartWindowMinutes.foreach(__v => __obj.update("StartWindowMinutes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupRuleInput]
    }
  }

  /**
    * Used to specify a set of resources to a backup plan.
    */
  @js.native
  trait BackupSelection extends js.Object {
    var IamRoleArn: IAMRoleArn
    var SelectionName: BackupSelectionName
    var ListOfTags: js.UndefOr[ListOfTags]
    var Resources: js.UndefOr[ResourceArns]
  }

  object BackupSelection {
    def apply(
        IamRoleArn: IAMRoleArn,
        SelectionName: BackupSelectionName,
        ListOfTags: js.UndefOr[ListOfTags] = js.undefined,
        Resources: js.UndefOr[ResourceArns] = js.undefined
    ): BackupSelection = {
      val __obj = js.Dictionary[js.Any](
        "IamRoleArn"    -> IamRoleArn.asInstanceOf[js.Any],
        "SelectionName" -> SelectionName.asInstanceOf[js.Any]
      )

      ListOfTags.foreach(__v => __obj.update("ListOfTags", __v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.update("Resources", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupSelection]
    }
  }

  /**
    * Contains metadata about a <code>BackupSelection</code> object.
    */
  @js.native
  trait BackupSelectionsListMember extends js.Object {
    var BackupPlanId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var IamRoleArn: js.UndefOr[IAMRoleArn]
    var SelectionId: js.UndefOr[String]
    var SelectionName: js.UndefOr[BackupSelectionName]
  }

  object BackupSelectionsListMember {
    def apply(
        BackupPlanId: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[String] = js.undefined,
        IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        SelectionId: js.UndefOr[String] = js.undefined,
        SelectionName: js.UndefOr[BackupSelectionName] = js.undefined
    ): BackupSelectionsListMember = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanId.foreach(__v => __obj.update("BackupPlanId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.update("IamRoleArn", __v.asInstanceOf[js.Any]))
      SelectionId.foreach(__v => __obj.update("SelectionId", __v.asInstanceOf[js.Any]))
      SelectionName.foreach(__v => __obj.update("SelectionName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupSelectionsListMember]
    }
  }

  object BackupVaultEventEnum {
    val BACKUP_JOB_STARTED      = "BACKUP_JOB_STARTED"
    val BACKUP_JOB_COMPLETED    = "BACKUP_JOB_COMPLETED"
    val RESTORE_JOB_STARTED     = "RESTORE_JOB_STARTED"
    val RESTORE_JOB_COMPLETED   = "RESTORE_JOB_COMPLETED"
    val RECOVERY_POINT_MODIFIED = "RECOVERY_POINT_MODIFIED"
    val BACKUP_PLAN_CREATED     = "BACKUP_PLAN_CREATED"
    val BACKUP_PLAN_MODIFIED    = "BACKUP_PLAN_MODIFIED"

    val values = IndexedSeq(
      BACKUP_JOB_STARTED,
      BACKUP_JOB_COMPLETED,
      RESTORE_JOB_STARTED,
      RESTORE_JOB_COMPLETED,
      RECOVERY_POINT_MODIFIED,
      BACKUP_PLAN_CREATED,
      BACKUP_PLAN_MODIFIED
    )
  }

  /**
    * Contains metadata about a backup vault.
    */
  @js.native
  trait BackupVaultListMember extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var EncryptionKeyArn: js.UndefOr[ARN]
    var NumberOfRecoveryPoints: js.UndefOr[Double]
  }

  object BackupVaultListMember {
    def apply(
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[String] = js.undefined,
        EncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        NumberOfRecoveryPoints: js.UndefOr[Double] = js.undefined
    ): BackupVaultListMember = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.update("EncryptionKeyArn", __v.asInstanceOf[js.Any]))
      NumberOfRecoveryPoints.foreach(__v => __obj.update("NumberOfRecoveryPoints", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackupVaultListMember]
    }
  }

  /**
    * Contains <code>DeleteAt</code> and <code>MoveToColdStorageAt</code> timestamps, which are used to specify a lifecycle for a recovery point.
    *  The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.
    *  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
    */
  @js.native
  trait CalculatedLifecycle extends js.Object {
    var DeleteAt: js.UndefOr[timestamp]
    var MoveToColdStorageAt: js.UndefOr[timestamp]
  }

  object CalculatedLifecycle {
    def apply(
        DeleteAt: js.UndefOr[timestamp] = js.undefined,
        MoveToColdStorageAt: js.UndefOr[timestamp] = js.undefined
    ): CalculatedLifecycle = {
      val __obj = js.Dictionary.empty[js.Any]
      DeleteAt.foreach(__v => __obj.update("DeleteAt", __v.asInstanceOf[js.Any]))
      MoveToColdStorageAt.foreach(__v => __obj.update("MoveToColdStorageAt", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CalculatedLifecycle]
    }
  }

  /**
    * Contains an array of triplets made up of a condition type (such as <code>StringEquals</code>), a key, and a value. Conditions are used to filter resources in a selection that is assigned to a backup plan.
    */
  @js.native
  trait Condition extends js.Object {
    var ConditionKey: ConditionKey
    var ConditionType: ConditionType
    var ConditionValue: ConditionValue
  }

  object Condition {
    def apply(
        ConditionKey: ConditionKey,
        ConditionType: ConditionType,
        ConditionValue: ConditionValue
    ): Condition = {
      val __obj = js.Dictionary[js.Any](
        "ConditionKey"   -> ConditionKey.asInstanceOf[js.Any],
        "ConditionType"  -> ConditionType.asInstanceOf[js.Any],
        "ConditionValue" -> ConditionValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Condition]
    }
  }

  object ConditionTypeEnum {
    val STRINGEQUALS = "STRINGEQUALS"

    val values = IndexedSeq(STRINGEQUALS)
  }

  @js.native
  trait CreateBackupPlanInput extends js.Object {
    var BackupPlan: BackupPlanInput
    var BackupPlanTags: js.UndefOr[Tags]
    var CreatorRequestId: js.UndefOr[String]
  }

  object CreateBackupPlanInput {
    def apply(
        BackupPlan: BackupPlanInput,
        BackupPlanTags: js.UndefOr[Tags] = js.undefined,
        CreatorRequestId: js.UndefOr[String] = js.undefined
    ): CreateBackupPlanInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlan" -> BackupPlan.asInstanceOf[js.Any]
      )

      BackupPlanTags.foreach(__v => __obj.update("BackupPlanTags", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupPlanInput]
    }
  }

  @js.native
  trait CreateBackupPlanOutput extends js.Object {
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var VersionId: js.UndefOr[String]
  }

  object CreateBackupPlanOutput {
    def apply(
        BackupPlanArn: js.UndefOr[ARN] = js.undefined,
        BackupPlanId: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        VersionId: js.UndefOr[String] = js.undefined
    ): CreateBackupPlanOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanArn.foreach(__v => __obj.update("BackupPlanArn", __v.asInstanceOf[js.Any]))
      BackupPlanId.foreach(__v => __obj.update("BackupPlanId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupPlanOutput]
    }
  }

  @js.native
  trait CreateBackupSelectionInput extends js.Object {
    var BackupPlanId: String
    var BackupSelection: BackupSelection
    var CreatorRequestId: js.UndefOr[String]
  }

  object CreateBackupSelectionInput {
    def apply(
        BackupPlanId: String,
        BackupSelection: BackupSelection,
        CreatorRequestId: js.UndefOr[String] = js.undefined
    ): CreateBackupSelectionInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanId"    -> BackupPlanId.asInstanceOf[js.Any],
        "BackupSelection" -> BackupSelection.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupSelectionInput]
    }
  }

  @js.native
  trait CreateBackupSelectionOutput extends js.Object {
    var BackupPlanId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var SelectionId: js.UndefOr[String]
  }

  object CreateBackupSelectionOutput {
    def apply(
        BackupPlanId: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        SelectionId: js.UndefOr[String] = js.undefined
    ): CreateBackupSelectionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanId.foreach(__v => __obj.update("BackupPlanId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      SelectionId.foreach(__v => __obj.update("SelectionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupSelectionOutput]
    }
  }

  @js.native
  trait CreateBackupVaultInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var BackupVaultTags: js.UndefOr[Tags]
    var CreatorRequestId: js.UndefOr[String]
    var EncryptionKeyArn: js.UndefOr[ARN]
  }

  object CreateBackupVaultInput {
    def apply(
        BackupVaultName: BackupVaultName,
        BackupVaultTags: js.UndefOr[Tags] = js.undefined,
        CreatorRequestId: js.UndefOr[String] = js.undefined,
        EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
    ): CreateBackupVaultInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any]
      )

      BackupVaultTags.foreach(__v => __obj.update("BackupVaultTags", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.update("EncryptionKeyArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupVaultInput]
    }
  }

  @js.native
  trait CreateBackupVaultOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var CreationDate: js.UndefOr[timestamp]
  }

  object CreateBackupVaultOutput {
    def apply(
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined
    ): CreateBackupVaultOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackupVaultOutput]
    }
  }

  @js.native
  trait DeleteBackupPlanInput extends js.Object {
    var BackupPlanId: String
  }

  object DeleteBackupPlanInput {
    def apply(
        BackupPlanId: String
    ): DeleteBackupPlanInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanId" -> BackupPlanId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBackupPlanInput]
    }
  }

  @js.native
  trait DeleteBackupPlanOutput extends js.Object {
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var DeletionDate: js.UndefOr[timestamp]
    var VersionId: js.UndefOr[String]
  }

  object DeleteBackupPlanOutput {
    def apply(
        BackupPlanArn: js.UndefOr[ARN] = js.undefined,
        BackupPlanId: js.UndefOr[String] = js.undefined,
        DeletionDate: js.UndefOr[timestamp] = js.undefined,
        VersionId: js.UndefOr[String] = js.undefined
    ): DeleteBackupPlanOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanArn.foreach(__v => __obj.update("BackupPlanArn", __v.asInstanceOf[js.Any]))
      BackupPlanId.foreach(__v => __obj.update("BackupPlanId", __v.asInstanceOf[js.Any]))
      DeletionDate.foreach(__v => __obj.update("DeletionDate", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBackupPlanOutput]
    }
  }

  @js.native
  trait DeleteBackupSelectionInput extends js.Object {
    var BackupPlanId: String
    var SelectionId: String
  }

  object DeleteBackupSelectionInput {
    def apply(
        BackupPlanId: String,
        SelectionId: String
    ): DeleteBackupSelectionInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanId" -> BackupPlanId.asInstanceOf[js.Any],
        "SelectionId"  -> SelectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBackupSelectionInput]
    }
  }

  @js.native
  trait DeleteBackupVaultAccessPolicyInput extends js.Object {
    var BackupVaultName: BackupVaultName
  }

  object DeleteBackupVaultAccessPolicyInput {
    def apply(
        BackupVaultName: BackupVaultName
    ): DeleteBackupVaultAccessPolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBackupVaultAccessPolicyInput]
    }
  }

  @js.native
  trait DeleteBackupVaultInput extends js.Object {
    var BackupVaultName: String
  }

  object DeleteBackupVaultInput {
    def apply(
        BackupVaultName: String
    ): DeleteBackupVaultInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBackupVaultInput]
    }
  }

  @js.native
  trait DeleteBackupVaultNotificationsInput extends js.Object {
    var BackupVaultName: BackupVaultName
  }

  object DeleteBackupVaultNotificationsInput {
    def apply(
        BackupVaultName: BackupVaultName
    ): DeleteBackupVaultNotificationsInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBackupVaultNotificationsInput]
    }
  }

  @js.native
  trait DeleteRecoveryPointInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var RecoveryPointArn: ARN
  }

  object DeleteRecoveryPointInput {
    def apply(
        BackupVaultName: BackupVaultName,
        RecoveryPointArn: ARN
    ): DeleteRecoveryPointInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName"  -> BackupVaultName.asInstanceOf[js.Any],
        "RecoveryPointArn" -> RecoveryPointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRecoveryPointInput]
    }
  }

  @js.native
  trait DescribeBackupJobInput extends js.Object {
    var BackupJobId: String
  }

  object DescribeBackupJobInput {
    def apply(
        BackupJobId: String
    ): DescribeBackupJobInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupJobId" -> BackupJobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeBackupJobInput]
    }
  }

  @js.native
  trait DescribeBackupJobOutput extends js.Object {
    var BackupJobId: js.UndefOr[String]
    var BackupSizeInBytes: js.UndefOr[Double]
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var BytesTransferred: js.UndefOr[Double]
    var CompletionDate: js.UndefOr[timestamp]
    var CreatedBy: js.UndefOr[RecoveryPointCreator]
    var CreationDate: js.UndefOr[timestamp]
    var ExpectedCompletionDate: js.UndefOr[timestamp]
    var IamRoleArn: js.UndefOr[IAMRoleArn]
    var PercentDone: js.UndefOr[String]
    var RecoveryPointArn: js.UndefOr[ARN]
    var ResourceArn: js.UndefOr[ARN]
    var ResourceType: js.UndefOr[ResourceType]
    var StartBy: js.UndefOr[timestamp]
    var State: js.UndefOr[BackupJobState]
    var StatusMessage: js.UndefOr[String]
  }

  object DescribeBackupJobOutput {
    def apply(
        BackupJobId: js.UndefOr[String] = js.undefined,
        BackupSizeInBytes: js.UndefOr[Double] = js.undefined,
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        BytesTransferred: js.UndefOr[Double] = js.undefined,
        CompletionDate: js.UndefOr[timestamp] = js.undefined,
        CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        ExpectedCompletionDate: js.UndefOr[timestamp] = js.undefined,
        IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        PercentDone: js.UndefOr[String] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined,
        ResourceArn: js.UndefOr[ARN] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        StartBy: js.UndefOr[timestamp] = js.undefined,
        State: js.UndefOr[BackupJobState] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined
    ): DescribeBackupJobOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupJobId.foreach(__v => __obj.update("BackupJobId", __v.asInstanceOf[js.Any]))
      BackupSizeInBytes.foreach(__v => __obj.update("BackupSizeInBytes", __v.asInstanceOf[js.Any]))
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      BytesTransferred.foreach(__v => __obj.update("BytesTransferred", __v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.update("CompletionDate", __v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      ExpectedCompletionDate.foreach(__v => __obj.update("ExpectedCompletionDate", __v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.update("IamRoleArn", __v.asInstanceOf[js.Any]))
      PercentDone.foreach(__v => __obj.update("PercentDone", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      StartBy.foreach(__v => __obj.update("StartBy", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBackupJobOutput]
    }
  }

  @js.native
  trait DescribeBackupVaultInput extends js.Object {
    var BackupVaultName: String
  }

  object DescribeBackupVaultInput {
    def apply(
        BackupVaultName: String
    ): DescribeBackupVaultInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeBackupVaultInput]
    }
  }

  @js.native
  trait DescribeBackupVaultOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var EncryptionKeyArn: js.UndefOr[ARN]
    var NumberOfRecoveryPoints: js.UndefOr[Double]
  }

  object DescribeBackupVaultOutput {
    def apply(
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        BackupVaultName: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[String] = js.undefined,
        EncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        NumberOfRecoveryPoints: js.UndefOr[Double] = js.undefined
    ): DescribeBackupVaultOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.update("EncryptionKeyArn", __v.asInstanceOf[js.Any]))
      NumberOfRecoveryPoints.foreach(__v => __obj.update("NumberOfRecoveryPoints", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBackupVaultOutput]
    }
  }

  @js.native
  trait DescribeProtectedResourceInput extends js.Object {
    var ResourceArn: ARN
  }

  object DescribeProtectedResourceInput {
    def apply(
        ResourceArn: ARN
    ): DescribeProtectedResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeProtectedResourceInput]
    }
  }

  @js.native
  trait DescribeProtectedResourceOutput extends js.Object {
    var LastBackupTime: js.UndefOr[timestamp]
    var ResourceArn: js.UndefOr[ARN]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object DescribeProtectedResourceOutput {
    def apply(
        LastBackupTime: js.UndefOr[timestamp] = js.undefined,
        ResourceArn: js.UndefOr[ARN] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): DescribeProtectedResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      LastBackupTime.foreach(__v => __obj.update("LastBackupTime", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProtectedResourceOutput]
    }
  }

  @js.native
  trait DescribeRecoveryPointInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var RecoveryPointArn: ARN
  }

  object DescribeRecoveryPointInput {
    def apply(
        BackupVaultName: BackupVaultName,
        RecoveryPointArn: ARN
    ): DescribeRecoveryPointInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName"  -> BackupVaultName.asInstanceOf[js.Any],
        "RecoveryPointArn" -> RecoveryPointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRecoveryPointInput]
    }
  }

  @js.native
  trait DescribeRecoveryPointOutput extends js.Object {
    var BackupSizeInBytes: js.UndefOr[Double]
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var CalculatedLifecycle: js.UndefOr[CalculatedLifecycle]
    var CompletionDate: js.UndefOr[timestamp]
    var CreatedBy: js.UndefOr[RecoveryPointCreator]
    var CreationDate: js.UndefOr[timestamp]
    var EncryptionKeyArn: js.UndefOr[ARN]
    var IamRoleArn: js.UndefOr[IAMRoleArn]
    var IsEncrypted: js.UndefOr[Boolean]
    var LastRestoreTime: js.UndefOr[timestamp]
    var Lifecycle: js.UndefOr[Lifecycle]
    var RecoveryPointArn: js.UndefOr[ARN]
    var ResourceArn: js.UndefOr[ARN]
    var ResourceType: js.UndefOr[ResourceType]
    var Status: js.UndefOr[RecoveryPointStatus]
    var StorageClass: js.UndefOr[StorageClass]
  }

  object DescribeRecoveryPointOutput {
    def apply(
        BackupSizeInBytes: js.UndefOr[Double] = js.undefined,
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        CalculatedLifecycle: js.UndefOr[CalculatedLifecycle] = js.undefined,
        CompletionDate: js.UndefOr[timestamp] = js.undefined,
        CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        EncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        IsEncrypted: js.UndefOr[Boolean] = js.undefined,
        LastRestoreTime: js.UndefOr[timestamp] = js.undefined,
        Lifecycle: js.UndefOr[Lifecycle] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined,
        ResourceArn: js.UndefOr[ARN] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        Status: js.UndefOr[RecoveryPointStatus] = js.undefined,
        StorageClass: js.UndefOr[StorageClass] = js.undefined
    ): DescribeRecoveryPointOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupSizeInBytes.foreach(__v => __obj.update("BackupSizeInBytes", __v.asInstanceOf[js.Any]))
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      CalculatedLifecycle.foreach(__v => __obj.update("CalculatedLifecycle", __v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.update("CompletionDate", __v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.update("EncryptionKeyArn", __v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.update("IamRoleArn", __v.asInstanceOf[js.Any]))
      IsEncrypted.foreach(__v => __obj.update("IsEncrypted", __v.asInstanceOf[js.Any]))
      LastRestoreTime.foreach(__v => __obj.update("LastRestoreTime", __v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.update("Lifecycle", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StorageClass.foreach(__v => __obj.update("StorageClass", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRecoveryPointOutput]
    }
  }

  @js.native
  trait DescribeRestoreJobInput extends js.Object {
    var RestoreJobId: RestoreJobId
  }

  object DescribeRestoreJobInput {
    def apply(
        RestoreJobId: RestoreJobId
    ): DescribeRestoreJobInput = {
      val __obj = js.Dictionary[js.Any](
        "RestoreJobId" -> RestoreJobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRestoreJobInput]
    }
  }

  @js.native
  trait DescribeRestoreJobOutput extends js.Object {
    var BackupSizeInBytes: js.UndefOr[Double]
    var CompletionDate: js.UndefOr[timestamp]
    var CreatedResourceArn: js.UndefOr[ARN]
    var CreationDate: js.UndefOr[timestamp]
    var ExpectedCompletionTimeMinutes: js.UndefOr[Double]
    var IamRoleArn: js.UndefOr[IAMRoleArn]
    var PercentDone: js.UndefOr[String]
    var RecoveryPointArn: js.UndefOr[ARN]
    var RestoreJobId: js.UndefOr[String]
    var Status: js.UndefOr[RestoreJobStatus]
    var StatusMessage: js.UndefOr[String]
  }

  object DescribeRestoreJobOutput {
    def apply(
        BackupSizeInBytes: js.UndefOr[Double] = js.undefined,
        CompletionDate: js.UndefOr[timestamp] = js.undefined,
        CreatedResourceArn: js.UndefOr[ARN] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        ExpectedCompletionTimeMinutes: js.UndefOr[Double] = js.undefined,
        IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        PercentDone: js.UndefOr[String] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined,
        RestoreJobId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[RestoreJobStatus] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined
    ): DescribeRestoreJobOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupSizeInBytes.foreach(__v => __obj.update("BackupSizeInBytes", __v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.update("CompletionDate", __v.asInstanceOf[js.Any]))
      CreatedResourceArn.foreach(__v => __obj.update("CreatedResourceArn", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      ExpectedCompletionTimeMinutes.foreach(
        __v => __obj.update("ExpectedCompletionTimeMinutes", __v.asInstanceOf[js.Any])
      )
      IamRoleArn.foreach(__v => __obj.update("IamRoleArn", __v.asInstanceOf[js.Any]))
      PercentDone.foreach(__v => __obj.update("PercentDone", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      RestoreJobId.foreach(__v => __obj.update("RestoreJobId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRestoreJobOutput]
    }
  }

  @js.native
  trait ExportBackupPlanTemplateInput extends js.Object {
    var BackupPlanId: String
  }

  object ExportBackupPlanTemplateInput {
    def apply(
        BackupPlanId: String
    ): ExportBackupPlanTemplateInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanId" -> BackupPlanId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ExportBackupPlanTemplateInput]
    }
  }

  @js.native
  trait ExportBackupPlanTemplateOutput extends js.Object {
    var BackupPlanTemplateJson: js.UndefOr[String]
  }

  object ExportBackupPlanTemplateOutput {
    def apply(
        BackupPlanTemplateJson: js.UndefOr[String] = js.undefined
    ): ExportBackupPlanTemplateOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanTemplateJson.foreach(__v => __obj.update("BackupPlanTemplateJson", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportBackupPlanTemplateOutput]
    }
  }

  @js.native
  trait GetBackupPlanFromJSONInput extends js.Object {
    var BackupPlanTemplateJson: String
  }

  object GetBackupPlanFromJSONInput {
    def apply(
        BackupPlanTemplateJson: String
    ): GetBackupPlanFromJSONInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanTemplateJson" -> BackupPlanTemplateJson.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBackupPlanFromJSONInput]
    }
  }

  @js.native
  trait GetBackupPlanFromJSONOutput extends js.Object {
    var BackupPlan: js.UndefOr[BackupPlan]
  }

  object GetBackupPlanFromJSONOutput {
    def apply(
        BackupPlan: js.UndefOr[BackupPlan] = js.undefined
    ): GetBackupPlanFromJSONOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlan.foreach(__v => __obj.update("BackupPlan", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackupPlanFromJSONOutput]
    }
  }

  @js.native
  trait GetBackupPlanFromTemplateInput extends js.Object {
    var BackupPlanTemplateId: String
  }

  object GetBackupPlanFromTemplateInput {
    def apply(
        BackupPlanTemplateId: String
    ): GetBackupPlanFromTemplateInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanTemplateId" -> BackupPlanTemplateId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBackupPlanFromTemplateInput]
    }
  }

  @js.native
  trait GetBackupPlanFromTemplateOutput extends js.Object {
    var BackupPlanDocument: js.UndefOr[BackupPlan]
  }

  object GetBackupPlanFromTemplateOutput {
    def apply(
        BackupPlanDocument: js.UndefOr[BackupPlan] = js.undefined
    ): GetBackupPlanFromTemplateOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanDocument.foreach(__v => __obj.update("BackupPlanDocument", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackupPlanFromTemplateOutput]
    }
  }

  @js.native
  trait GetBackupPlanInput extends js.Object {
    var BackupPlanId: String
    var VersionId: js.UndefOr[String]
  }

  object GetBackupPlanInput {
    def apply(
        BackupPlanId: String,
        VersionId: js.UndefOr[String] = js.undefined
    ): GetBackupPlanInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanId" -> BackupPlanId.asInstanceOf[js.Any]
      )

      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackupPlanInput]
    }
  }

  @js.native
  trait GetBackupPlanOutput extends js.Object {
    var BackupPlan: js.UndefOr[BackupPlan]
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var DeletionDate: js.UndefOr[timestamp]
    var LastExecutionDate: js.UndefOr[timestamp]
    var VersionId: js.UndefOr[String]
  }

  object GetBackupPlanOutput {
    def apply(
        BackupPlan: js.UndefOr[BackupPlan] = js.undefined,
        BackupPlanArn: js.UndefOr[ARN] = js.undefined,
        BackupPlanId: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[String] = js.undefined,
        DeletionDate: js.UndefOr[timestamp] = js.undefined,
        LastExecutionDate: js.UndefOr[timestamp] = js.undefined,
        VersionId: js.UndefOr[String] = js.undefined
    ): GetBackupPlanOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlan.foreach(__v => __obj.update("BackupPlan", __v.asInstanceOf[js.Any]))
      BackupPlanArn.foreach(__v => __obj.update("BackupPlanArn", __v.asInstanceOf[js.Any]))
      BackupPlanId.foreach(__v => __obj.update("BackupPlanId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      DeletionDate.foreach(__v => __obj.update("DeletionDate", __v.asInstanceOf[js.Any]))
      LastExecutionDate.foreach(__v => __obj.update("LastExecutionDate", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackupPlanOutput]
    }
  }

  @js.native
  trait GetBackupSelectionInput extends js.Object {
    var BackupPlanId: String
    var SelectionId: String
  }

  object GetBackupSelectionInput {
    def apply(
        BackupPlanId: String,
        SelectionId: String
    ): GetBackupSelectionInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanId" -> BackupPlanId.asInstanceOf[js.Any],
        "SelectionId"  -> SelectionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBackupSelectionInput]
    }
  }

  @js.native
  trait GetBackupSelectionOutput extends js.Object {
    var BackupPlanId: js.UndefOr[String]
    var BackupSelection: js.UndefOr[BackupSelection]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var SelectionId: js.UndefOr[String]
  }

  object GetBackupSelectionOutput {
    def apply(
        BackupPlanId: js.UndefOr[String] = js.undefined,
        BackupSelection: js.UndefOr[BackupSelection] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[String] = js.undefined,
        SelectionId: js.UndefOr[String] = js.undefined
    ): GetBackupSelectionOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanId.foreach(__v => __obj.update("BackupPlanId", __v.asInstanceOf[js.Any]))
      BackupSelection.foreach(__v => __obj.update("BackupSelection", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.update("CreatorRequestId", __v.asInstanceOf[js.Any]))
      SelectionId.foreach(__v => __obj.update("SelectionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackupSelectionOutput]
    }
  }

  @js.native
  trait GetBackupVaultAccessPolicyInput extends js.Object {
    var BackupVaultName: BackupVaultName
  }

  object GetBackupVaultAccessPolicyInput {
    def apply(
        BackupVaultName: BackupVaultName
    ): GetBackupVaultAccessPolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBackupVaultAccessPolicyInput]
    }
  }

  @js.native
  trait GetBackupVaultAccessPolicyOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var Policy: js.UndefOr[IAMPolicy]
  }

  object GetBackupVaultAccessPolicyOutput {
    def apply(
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        Policy: js.UndefOr[IAMPolicy] = js.undefined
    ): GetBackupVaultAccessPolicyOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackupVaultAccessPolicyOutput]
    }
  }

  @js.native
  trait GetBackupVaultNotificationsInput extends js.Object {
    var BackupVaultName: BackupVaultName
  }

  object GetBackupVaultNotificationsInput {
    def apply(
        BackupVaultName: BackupVaultName
    ): GetBackupVaultNotificationsInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBackupVaultNotificationsInput]
    }
  }

  @js.native
  trait GetBackupVaultNotificationsOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultEvents: js.UndefOr[BackupVaultEvents]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var SNSTopicArn: js.UndefOr[ARN]
  }

  object GetBackupVaultNotificationsOutput {
    def apply(
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        BackupVaultEvents: js.UndefOr[BackupVaultEvents] = js.undefined,
        BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        SNSTopicArn: js.UndefOr[ARN] = js.undefined
    ): GetBackupVaultNotificationsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      BackupVaultEvents.foreach(__v => __obj.update("BackupVaultEvents", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      SNSTopicArn.foreach(__v => __obj.update("SNSTopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackupVaultNotificationsOutput]
    }
  }

  @js.native
  trait GetRecoveryPointRestoreMetadataInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var RecoveryPointArn: ARN
  }

  object GetRecoveryPointRestoreMetadataInput {
    def apply(
        BackupVaultName: BackupVaultName,
        RecoveryPointArn: ARN
    ): GetRecoveryPointRestoreMetadataInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName"  -> BackupVaultName.asInstanceOf[js.Any],
        "RecoveryPointArn" -> RecoveryPointArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRecoveryPointRestoreMetadataInput]
    }
  }

  @js.native
  trait GetRecoveryPointRestoreMetadataOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var RecoveryPointArn: js.UndefOr[ARN]
    var RestoreMetadata: js.UndefOr[Metadata]
  }

  object GetRecoveryPointRestoreMetadataOutput {
    def apply(
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined,
        RestoreMetadata: js.UndefOr[Metadata] = js.undefined
    ): GetRecoveryPointRestoreMetadataOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      RestoreMetadata.foreach(__v => __obj.update("RestoreMetadata", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecoveryPointRestoreMetadataOutput]
    }
  }

  @js.native
  trait GetSupportedResourceTypesOutput extends js.Object {
    var ResourceTypes: js.UndefOr[ResourceTypes]
  }

  object GetSupportedResourceTypesOutput {
    def apply(
        ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    ): GetSupportedResourceTypesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      ResourceTypes.foreach(__v => __obj.update("ResourceTypes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSupportedResourceTypesOutput]
    }
  }

  /**
    * Contains an array of <code>Transition</code> objects specifying how long in days before a recovery point transitions to cold storage or is deleted.
    */
  @js.native
  trait Lifecycle extends js.Object {
    var DeleteAfterDays: js.UndefOr[Double]
    var MoveToColdStorageAfterDays: js.UndefOr[Double]
  }

  object Lifecycle {
    def apply(
        DeleteAfterDays: js.UndefOr[Double] = js.undefined,
        MoveToColdStorageAfterDays: js.UndefOr[Double] = js.undefined
    ): Lifecycle = {
      val __obj = js.Dictionary.empty[js.Any]
      DeleteAfterDays.foreach(__v => __obj.update("DeleteAfterDays", __v.asInstanceOf[js.Any]))
      MoveToColdStorageAfterDays.foreach(__v => __obj.update("MoveToColdStorageAfterDays", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Lifecycle]
    }
  }

  @js.native
  trait ListBackupJobsInput extends js.Object {
    var ByBackupVaultName: js.UndefOr[BackupVaultName]
    var ByCreatedAfter: js.UndefOr[timestamp]
    var ByCreatedBefore: js.UndefOr[timestamp]
    var ByResourceArn: js.UndefOr[ARN]
    var ByResourceType: js.UndefOr[ResourceType]
    var ByState: js.UndefOr[BackupJobState]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupJobsInput {
    def apply(
        ByBackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        ByCreatedAfter: js.UndefOr[timestamp] = js.undefined,
        ByCreatedBefore: js.UndefOr[timestamp] = js.undefined,
        ByResourceArn: js.UndefOr[ARN] = js.undefined,
        ByResourceType: js.UndefOr[ResourceType] = js.undefined,
        ByState: js.UndefOr[BackupJobState] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupJobsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      ByBackupVaultName.foreach(__v => __obj.update("ByBackupVaultName", __v.asInstanceOf[js.Any]))
      ByCreatedAfter.foreach(__v => __obj.update("ByCreatedAfter", __v.asInstanceOf[js.Any]))
      ByCreatedBefore.foreach(__v => __obj.update("ByCreatedBefore", __v.asInstanceOf[js.Any]))
      ByResourceArn.foreach(__v => __obj.update("ByResourceArn", __v.asInstanceOf[js.Any]))
      ByResourceType.foreach(__v => __obj.update("ByResourceType", __v.asInstanceOf[js.Any]))
      ByState.foreach(__v => __obj.update("ByState", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupJobsInput]
    }
  }

  @js.native
  trait ListBackupJobsOutput extends js.Object {
    var BackupJobs: js.UndefOr[BackupJobsList]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupJobsOutput {
    def apply(
        BackupJobs: js.UndefOr[BackupJobsList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupJobsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupJobs.foreach(__v => __obj.update("BackupJobs", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupJobsOutput]
    }
  }

  @js.native
  trait ListBackupPlanTemplatesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupPlanTemplatesInput {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupPlanTemplatesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupPlanTemplatesInput]
    }
  }

  @js.native
  trait ListBackupPlanTemplatesOutput extends js.Object {
    var BackupPlanTemplatesList: js.UndefOr[BackupPlanTemplatesList]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupPlanTemplatesOutput {
    def apply(
        BackupPlanTemplatesList: js.UndefOr[BackupPlanTemplatesList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupPlanTemplatesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanTemplatesList.foreach(__v => __obj.update("BackupPlanTemplatesList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupPlanTemplatesOutput]
    }
  }

  @js.native
  trait ListBackupPlanVersionsInput extends js.Object {
    var BackupPlanId: String
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupPlanVersionsInput {
    def apply(
        BackupPlanId: String,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupPlanVersionsInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanId" -> BackupPlanId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupPlanVersionsInput]
    }
  }

  @js.native
  trait ListBackupPlanVersionsOutput extends js.Object {
    var BackupPlanVersionsList: js.UndefOr[BackupPlanVersionsList]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupPlanVersionsOutput {
    def apply(
        BackupPlanVersionsList: js.UndefOr[BackupPlanVersionsList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupPlanVersionsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanVersionsList.foreach(__v => __obj.update("BackupPlanVersionsList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupPlanVersionsOutput]
    }
  }

  @js.native
  trait ListBackupPlansInput extends js.Object {
    var IncludeDeleted: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupPlansInput {
    def apply(
        IncludeDeleted: js.UndefOr[Boolean] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupPlansInput = {
      val __obj = js.Dictionary.empty[js.Any]
      IncludeDeleted.foreach(__v => __obj.update("IncludeDeleted", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupPlansInput]
    }
  }

  @js.native
  trait ListBackupPlansOutput extends js.Object {
    var BackupPlansList: js.UndefOr[BackupPlansList]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupPlansOutput {
    def apply(
        BackupPlansList: js.UndefOr[BackupPlansList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupPlansOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlansList.foreach(__v => __obj.update("BackupPlansList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupPlansOutput]
    }
  }

  @js.native
  trait ListBackupSelectionsInput extends js.Object {
    var BackupPlanId: String
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupSelectionsInput {
    def apply(
        BackupPlanId: String,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupSelectionsInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlanId" -> BackupPlanId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupSelectionsInput]
    }
  }

  @js.native
  trait ListBackupSelectionsOutput extends js.Object {
    var BackupSelectionsList: js.UndefOr[BackupSelectionsList]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupSelectionsOutput {
    def apply(
        BackupSelectionsList: js.UndefOr[BackupSelectionsList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupSelectionsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupSelectionsList.foreach(__v => __obj.update("BackupSelectionsList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupSelectionsOutput]
    }
  }

  @js.native
  trait ListBackupVaultsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupVaultsInput {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupVaultsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupVaultsInput]
    }
  }

  @js.native
  trait ListBackupVaultsOutput extends js.Object {
    var BackupVaultList: js.UndefOr[BackupVaultList]
    var NextToken: js.UndefOr[String]
  }

  object ListBackupVaultsOutput {
    def apply(
        BackupVaultList: js.UndefOr[BackupVaultList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListBackupVaultsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupVaultList.foreach(__v => __obj.update("BackupVaultList", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackupVaultsOutput]
    }
  }

  @js.native
  trait ListProtectedResourcesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListProtectedResourcesInput {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListProtectedResourcesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtectedResourcesInput]
    }
  }

  @js.native
  trait ListProtectedResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var Results: js.UndefOr[ProtectedResourcesList]
  }

  object ListProtectedResourcesOutput {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Results: js.UndefOr[ProtectedResourcesList] = js.undefined
    ): ListProtectedResourcesOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Results.foreach(__v => __obj.update("Results", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProtectedResourcesOutput]
    }
  }

  @js.native
  trait ListRecoveryPointsByBackupVaultInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var ByBackupPlanId: js.UndefOr[String]
    var ByCreatedAfter: js.UndefOr[timestamp]
    var ByCreatedBefore: js.UndefOr[timestamp]
    var ByResourceArn: js.UndefOr[ARN]
    var ByResourceType: js.UndefOr[ResourceType]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListRecoveryPointsByBackupVaultInput {
    def apply(
        BackupVaultName: BackupVaultName,
        ByBackupPlanId: js.UndefOr[String] = js.undefined,
        ByCreatedAfter: js.UndefOr[timestamp] = js.undefined,
        ByCreatedBefore: js.UndefOr[timestamp] = js.undefined,
        ByResourceArn: js.UndefOr[ARN] = js.undefined,
        ByResourceType: js.UndefOr[ResourceType] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListRecoveryPointsByBackupVaultInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any]
      )

      ByBackupPlanId.foreach(__v => __obj.update("ByBackupPlanId", __v.asInstanceOf[js.Any]))
      ByCreatedAfter.foreach(__v => __obj.update("ByCreatedAfter", __v.asInstanceOf[js.Any]))
      ByCreatedBefore.foreach(__v => __obj.update("ByCreatedBefore", __v.asInstanceOf[js.Any]))
      ByResourceArn.foreach(__v => __obj.update("ByResourceArn", __v.asInstanceOf[js.Any]))
      ByResourceType.foreach(__v => __obj.update("ByResourceType", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecoveryPointsByBackupVaultInput]
    }
  }

  @js.native
  trait ListRecoveryPointsByBackupVaultOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var RecoveryPoints: js.UndefOr[RecoveryPointByBackupVaultList]
  }

  object ListRecoveryPointsByBackupVaultOutput {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RecoveryPoints: js.UndefOr[RecoveryPointByBackupVaultList] = js.undefined
    ): ListRecoveryPointsByBackupVaultOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RecoveryPoints.foreach(__v => __obj.update("RecoveryPoints", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecoveryPointsByBackupVaultOutput]
    }
  }

  @js.native
  trait ListRecoveryPointsByResourceInput extends js.Object {
    var ResourceArn: ARN
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListRecoveryPointsByResourceInput {
    def apply(
        ResourceArn: ARN,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListRecoveryPointsByResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecoveryPointsByResourceInput]
    }
  }

  @js.native
  trait ListRecoveryPointsByResourceOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var RecoveryPoints: js.UndefOr[RecoveryPointByResourceList]
  }

  object ListRecoveryPointsByResourceOutput {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RecoveryPoints: js.UndefOr[RecoveryPointByResourceList] = js.undefined
    ): ListRecoveryPointsByResourceOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RecoveryPoints.foreach(__v => __obj.update("RecoveryPoints", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRecoveryPointsByResourceOutput]
    }
  }

  @js.native
  trait ListRestoreJobsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListRestoreJobsInput {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListRestoreJobsInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRestoreJobsInput]
    }
  }

  @js.native
  trait ListRestoreJobsOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var RestoreJobs: js.UndefOr[RestoreJobsList]
  }

  object ListRestoreJobsOutput {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RestoreJobs: js.UndefOr[RestoreJobsList] = js.undefined
    ): ListRestoreJobsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      RestoreJobs.foreach(__v => __obj.update("RestoreJobs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRestoreJobsOutput]
    }
  }

  @js.native
  trait ListTagsInput extends js.Object {
    var ResourceArn: ARN
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListTagsInput {
    def apply(
        ResourceArn: ARN,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTagsInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsInput]
    }
  }

  @js.native
  trait ListTagsOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsOutput {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsOutput]
    }
  }

  /**
    * A structure that contains information about a backed-up resource.
    */
  @js.native
  trait ProtectedResource extends js.Object {
    var LastBackupTime: js.UndefOr[timestamp]
    var ResourceArn: js.UndefOr[ARN]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object ProtectedResource {
    def apply(
        LastBackupTime: js.UndefOr[timestamp] = js.undefined,
        ResourceArn: js.UndefOr[ARN] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): ProtectedResource = {
      val __obj = js.Dictionary.empty[js.Any]
      LastBackupTime.foreach(__v => __obj.update("LastBackupTime", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProtectedResource]
    }
  }

  @js.native
  trait PutBackupVaultAccessPolicyInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var Policy: js.UndefOr[IAMPolicy]
  }

  object PutBackupVaultAccessPolicyInput {
    def apply(
        BackupVaultName: BackupVaultName,
        Policy: js.UndefOr[IAMPolicy] = js.undefined
    ): PutBackupVaultAccessPolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any]
      )

      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutBackupVaultAccessPolicyInput]
    }
  }

  @js.native
  trait PutBackupVaultNotificationsInput extends js.Object {
    var BackupVaultEvents: BackupVaultEvents
    var BackupVaultName: BackupVaultName
    var SNSTopicArn: ARN
  }

  object PutBackupVaultNotificationsInput {
    def apply(
        BackupVaultEvents: BackupVaultEvents,
        BackupVaultName: BackupVaultName,
        SNSTopicArn: ARN
    ): PutBackupVaultNotificationsInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultEvents" -> BackupVaultEvents.asInstanceOf[js.Any],
        "BackupVaultName"   -> BackupVaultName.asInstanceOf[js.Any],
        "SNSTopicArn"       -> SNSTopicArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutBackupVaultNotificationsInput]
    }
  }

  /**
    * Contains detailed information about the recovery points stored in a backup vault.
    */
  @js.native
  trait RecoveryPointByBackupVault extends js.Object {
    var BackupSizeInBytes: js.UndefOr[Double]
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var CalculatedLifecycle: js.UndefOr[CalculatedLifecycle]
    var CompletionDate: js.UndefOr[timestamp]
    var CreatedBy: js.UndefOr[RecoveryPointCreator]
    var CreationDate: js.UndefOr[timestamp]
    var EncryptionKeyArn: js.UndefOr[ARN]
    var IamRoleArn: js.UndefOr[IAMRoleArn]
    var IsEncrypted: js.UndefOr[Boolean]
    var LastRestoreTime: js.UndefOr[timestamp]
    var Lifecycle: js.UndefOr[Lifecycle]
    var RecoveryPointArn: js.UndefOr[ARN]
    var ResourceArn: js.UndefOr[ARN]
    var ResourceType: js.UndefOr[ResourceType]
    var Status: js.UndefOr[RecoveryPointStatus]
  }

  object RecoveryPointByBackupVault {
    def apply(
        BackupSizeInBytes: js.UndefOr[Double] = js.undefined,
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        CalculatedLifecycle: js.UndefOr[CalculatedLifecycle] = js.undefined,
        CompletionDate: js.UndefOr[timestamp] = js.undefined,
        CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        EncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        IsEncrypted: js.UndefOr[Boolean] = js.undefined,
        LastRestoreTime: js.UndefOr[timestamp] = js.undefined,
        Lifecycle: js.UndefOr[Lifecycle] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined,
        ResourceArn: js.UndefOr[ARN] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined,
        Status: js.UndefOr[RecoveryPointStatus] = js.undefined
    ): RecoveryPointByBackupVault = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupSizeInBytes.foreach(__v => __obj.update("BackupSizeInBytes", __v.asInstanceOf[js.Any]))
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      CalculatedLifecycle.foreach(__v => __obj.update("CalculatedLifecycle", __v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.update("CompletionDate", __v.asInstanceOf[js.Any]))
      CreatedBy.foreach(__v => __obj.update("CreatedBy", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.update("EncryptionKeyArn", __v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.update("IamRoleArn", __v.asInstanceOf[js.Any]))
      IsEncrypted.foreach(__v => __obj.update("IsEncrypted", __v.asInstanceOf[js.Any]))
      LastRestoreTime.foreach(__v => __obj.update("LastRestoreTime", __v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.update("Lifecycle", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.update("ResourceArn", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryPointByBackupVault]
    }
  }

  /**
    * Contains detailed information about a saved recovery point.
    */
  @js.native
  trait RecoveryPointByResource extends js.Object {
    var BackupSizeBytes: js.UndefOr[Double]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var CreationDate: js.UndefOr[timestamp]
    var EncryptionKeyArn: js.UndefOr[ARN]
    var RecoveryPointArn: js.UndefOr[ARN]
    var Status: js.UndefOr[RecoveryPointStatus]
  }

  object RecoveryPointByResource {
    def apply(
        BackupSizeBytes: js.UndefOr[Double] = js.undefined,
        BackupVaultName: js.UndefOr[BackupVaultName] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        EncryptionKeyArn: js.UndefOr[ARN] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined,
        Status: js.UndefOr[RecoveryPointStatus] = js.undefined
    ): RecoveryPointByResource = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupSizeBytes.foreach(__v => __obj.update("BackupSizeBytes", __v.asInstanceOf[js.Any]))
      BackupVaultName.foreach(__v => __obj.update("BackupVaultName", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      EncryptionKeyArn.foreach(__v => __obj.update("EncryptionKeyArn", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryPointByResource]
    }
  }

  /**
    * Contains information about the backup plan and rule that AWS Backup used to initiate the recovery point backup.
    */
  @js.native
  trait RecoveryPointCreator extends js.Object {
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var BackupPlanVersion: js.UndefOr[String]
    var BackupRuleId: js.UndefOr[String]
  }

  object RecoveryPointCreator {
    def apply(
        BackupPlanArn: js.UndefOr[ARN] = js.undefined,
        BackupPlanId: js.UndefOr[String] = js.undefined,
        BackupPlanVersion: js.UndefOr[String] = js.undefined,
        BackupRuleId: js.UndefOr[String] = js.undefined
    ): RecoveryPointCreator = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanArn.foreach(__v => __obj.update("BackupPlanArn", __v.asInstanceOf[js.Any]))
      BackupPlanId.foreach(__v => __obj.update("BackupPlanId", __v.asInstanceOf[js.Any]))
      BackupPlanVersion.foreach(__v => __obj.update("BackupPlanVersion", __v.asInstanceOf[js.Any]))
      BackupRuleId.foreach(__v => __obj.update("BackupRuleId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecoveryPointCreator]
    }
  }

  object RecoveryPointStatusEnum {
    val COMPLETED = "COMPLETED"
    val PARTIAL   = "PARTIAL"
    val DELETING  = "DELETING"
    val EXPIRED   = "EXPIRED"

    val values = IndexedSeq(COMPLETED, PARTIAL, DELETING, EXPIRED)
  }

  object RestoreJobStatusEnum {
    val PENDING   = "PENDING"
    val RUNNING   = "RUNNING"
    val COMPLETED = "COMPLETED"
    val ABORTED   = "ABORTED"
    val FAILED    = "FAILED"

    val values = IndexedSeq(PENDING, RUNNING, COMPLETED, ABORTED, FAILED)
  }

  /**
    * Contains metadata about a restore job.
    */
  @js.native
  trait RestoreJobsListMember extends js.Object {
    var BackupSizeInBytes: js.UndefOr[Double]
    var CompletionDate: js.UndefOr[timestamp]
    var CreatedResourceArn: js.UndefOr[ARN]
    var CreationDate: js.UndefOr[timestamp]
    var ExpectedCompletionTimeMinutes: js.UndefOr[Double]
    var IamRoleArn: js.UndefOr[IAMRoleArn]
    var PercentDone: js.UndefOr[String]
    var RecoveryPointArn: js.UndefOr[ARN]
    var RestoreJobId: js.UndefOr[String]
    var Status: js.UndefOr[RestoreJobStatus]
    var StatusMessage: js.UndefOr[String]
  }

  object RestoreJobsListMember {
    def apply(
        BackupSizeInBytes: js.UndefOr[Double] = js.undefined,
        CompletionDate: js.UndefOr[timestamp] = js.undefined,
        CreatedResourceArn: js.UndefOr[ARN] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        ExpectedCompletionTimeMinutes: js.UndefOr[Double] = js.undefined,
        IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined,
        PercentDone: js.UndefOr[String] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined,
        RestoreJobId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[RestoreJobStatus] = js.undefined,
        StatusMessage: js.UndefOr[String] = js.undefined
    ): RestoreJobsListMember = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupSizeInBytes.foreach(__v => __obj.update("BackupSizeInBytes", __v.asInstanceOf[js.Any]))
      CompletionDate.foreach(__v => __obj.update("CompletionDate", __v.asInstanceOf[js.Any]))
      CreatedResourceArn.foreach(__v => __obj.update("CreatedResourceArn", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      ExpectedCompletionTimeMinutes.foreach(
        __v => __obj.update("ExpectedCompletionTimeMinutes", __v.asInstanceOf[js.Any])
      )
      IamRoleArn.foreach(__v => __obj.update("IamRoleArn", __v.asInstanceOf[js.Any]))
      PercentDone.foreach(__v => __obj.update("PercentDone", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      RestoreJobId.foreach(__v => __obj.update("RestoreJobId", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.update("StatusMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreJobsListMember]
    }
  }

  @js.native
  trait StartBackupJobInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var IamRoleArn: IAMRoleArn
    var ResourceArn: ARN
    var CompleteWindowMinutes: js.UndefOr[WindowMinutes]
    var IdempotencyToken: js.UndefOr[String]
    var Lifecycle: js.UndefOr[Lifecycle]
    var RecoveryPointTags: js.UndefOr[Tags]
    var StartWindowMinutes: js.UndefOr[WindowMinutes]
  }

  object StartBackupJobInput {
    def apply(
        BackupVaultName: BackupVaultName,
        IamRoleArn: IAMRoleArn,
        ResourceArn: ARN,
        CompleteWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined,
        IdempotencyToken: js.UndefOr[String] = js.undefined,
        Lifecycle: js.UndefOr[Lifecycle] = js.undefined,
        RecoveryPointTags: js.UndefOr[Tags] = js.undefined,
        StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
    ): StartBackupJobInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName" -> BackupVaultName.asInstanceOf[js.Any],
        "IamRoleArn"      -> IamRoleArn.asInstanceOf[js.Any],
        "ResourceArn"     -> ResourceArn.asInstanceOf[js.Any]
      )

      CompleteWindowMinutes.foreach(__v => __obj.update("CompleteWindowMinutes", __v.asInstanceOf[js.Any]))
      IdempotencyToken.foreach(__v => __obj.update("IdempotencyToken", __v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.update("Lifecycle", __v.asInstanceOf[js.Any]))
      RecoveryPointTags.foreach(__v => __obj.update("RecoveryPointTags", __v.asInstanceOf[js.Any]))
      StartWindowMinutes.foreach(__v => __obj.update("StartWindowMinutes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBackupJobInput]
    }
  }

  @js.native
  trait StartBackupJobOutput extends js.Object {
    var BackupJobId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var RecoveryPointArn: js.UndefOr[ARN]
  }

  object StartBackupJobOutput {
    def apply(
        BackupJobId: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    ): StartBackupJobOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupJobId.foreach(__v => __obj.update("BackupJobId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBackupJobOutput]
    }
  }

  @js.native
  trait StartRestoreJobInput extends js.Object {
    var IamRoleArn: IAMRoleArn
    var Metadata: Metadata
    var RecoveryPointArn: ARN
    var IdempotencyToken: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  object StartRestoreJobInput {
    def apply(
        IamRoleArn: IAMRoleArn,
        Metadata: Metadata,
        RecoveryPointArn: ARN,
        IdempotencyToken: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[ResourceType] = js.undefined
    ): StartRestoreJobInput = {
      val __obj = js.Dictionary[js.Any](
        "IamRoleArn"       -> IamRoleArn.asInstanceOf[js.Any],
        "Metadata"         -> Metadata.asInstanceOf[js.Any],
        "RecoveryPointArn" -> RecoveryPointArn.asInstanceOf[js.Any]
      )

      IdempotencyToken.foreach(__v => __obj.update("IdempotencyToken", __v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.update("ResourceType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRestoreJobInput]
    }
  }

  @js.native
  trait StartRestoreJobOutput extends js.Object {
    var RestoreJobId: js.UndefOr[RestoreJobId]
  }

  object StartRestoreJobOutput {
    def apply(
        RestoreJobId: js.UndefOr[RestoreJobId] = js.undefined
    ): StartRestoreJobOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      RestoreJobId.foreach(__v => __obj.update("RestoreJobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRestoreJobOutput]
    }
  }

  @js.native
  trait StopBackupJobInput extends js.Object {
    var BackupJobId: String
  }

  object StopBackupJobInput {
    def apply(
        BackupJobId: String
    ): StopBackupJobInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupJobId" -> BackupJobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopBackupJobInput]
    }
  }

  object StorageClassEnum {
    val WARM    = "WARM"
    val COLD    = "COLD"
    val DELETED = "DELETED"

    val values = IndexedSeq(WARM, COLD, DELETED)
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: ARN
    var Tags: Tags
  }

  object TagResourceInput {
    def apply(
        ResourceArn: ARN,
        Tags: Tags
    ): TagResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: ARN
    var TagKeyList: TagKeyList
  }

  object UntagResourceInput {
    def apply(
        ResourceArn: ARN,
        TagKeyList: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeyList"  -> TagKeyList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UpdateBackupPlanInput extends js.Object {
    var BackupPlan: BackupPlanInput
    var BackupPlanId: String
  }

  object UpdateBackupPlanInput {
    def apply(
        BackupPlan: BackupPlanInput,
        BackupPlanId: String
    ): UpdateBackupPlanInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupPlan"   -> BackupPlan.asInstanceOf[js.Any],
        "BackupPlanId" -> BackupPlanId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateBackupPlanInput]
    }
  }

  @js.native
  trait UpdateBackupPlanOutput extends js.Object {
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var VersionId: js.UndefOr[String]
  }

  object UpdateBackupPlanOutput {
    def apply(
        BackupPlanArn: js.UndefOr[ARN] = js.undefined,
        BackupPlanId: js.UndefOr[String] = js.undefined,
        CreationDate: js.UndefOr[timestamp] = js.undefined,
        VersionId: js.UndefOr[String] = js.undefined
    ): UpdateBackupPlanOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupPlanArn.foreach(__v => __obj.update("BackupPlanArn", __v.asInstanceOf[js.Any]))
      BackupPlanId.foreach(__v => __obj.update("BackupPlanId", __v.asInstanceOf[js.Any]))
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      VersionId.foreach(__v => __obj.update("VersionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackupPlanOutput]
    }
  }

  @js.native
  trait UpdateRecoveryPointLifecycleInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var RecoveryPointArn: ARN
    var Lifecycle: js.UndefOr[Lifecycle]
  }

  object UpdateRecoveryPointLifecycleInput {
    def apply(
        BackupVaultName: BackupVaultName,
        RecoveryPointArn: ARN,
        Lifecycle: js.UndefOr[Lifecycle] = js.undefined
    ): UpdateRecoveryPointLifecycleInput = {
      val __obj = js.Dictionary[js.Any](
        "BackupVaultName"  -> BackupVaultName.asInstanceOf[js.Any],
        "RecoveryPointArn" -> RecoveryPointArn.asInstanceOf[js.Any]
      )

      Lifecycle.foreach(__v => __obj.update("Lifecycle", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRecoveryPointLifecycleInput]
    }
  }

  @js.native
  trait UpdateRecoveryPointLifecycleOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var CalculatedLifecycle: js.UndefOr[CalculatedLifecycle]
    var Lifecycle: js.UndefOr[Lifecycle]
    var RecoveryPointArn: js.UndefOr[ARN]
  }

  object UpdateRecoveryPointLifecycleOutput {
    def apply(
        BackupVaultArn: js.UndefOr[ARN] = js.undefined,
        CalculatedLifecycle: js.UndefOr[CalculatedLifecycle] = js.undefined,
        Lifecycle: js.UndefOr[Lifecycle] = js.undefined,
        RecoveryPointArn: js.UndefOr[ARN] = js.undefined
    ): UpdateRecoveryPointLifecycleOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      BackupVaultArn.foreach(__v => __obj.update("BackupVaultArn", __v.asInstanceOf[js.Any]))
      CalculatedLifecycle.foreach(__v => __obj.update("CalculatedLifecycle", __v.asInstanceOf[js.Any]))
      Lifecycle.foreach(__v => __obj.update("Lifecycle", __v.asInstanceOf[js.Any]))
      RecoveryPointArn.foreach(__v => __obj.update("RecoveryPointArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRecoveryPointLifecycleOutput]
    }
  }
}
