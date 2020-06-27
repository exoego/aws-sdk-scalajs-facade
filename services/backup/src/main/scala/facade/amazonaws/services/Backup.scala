package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object backup {
  type ARN                            = String
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
  type BackupVaultEvents              = js.Array[BackupVaultEvent]
  type BackupVaultList                = js.Array[BackupVaultListMember]
  type BackupVaultName                = String
  type ConditionKey                   = String
  type ConditionValue                 = String
  type CopyActions                    = js.Array[CopyAction]
  type CopyJobsList                   = js.Array[CopyJob]
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
  type ResourceArns                   = js.Array[ARN]
  type ResourceType                   = String
  type ResourceTypes                  = js.Array[ResourceType]
  type RestoreJobId                   = String
  type RestoreJobsList                = js.Array[RestoreJobsListMember]
  type TagKey                         = String
  type TagKeyList                     = js.Array[String]
  type TagValue                       = String
  type Tags                           = js.Dictionary[TagValue]
  type WindowMinutes                  = Double
  type timestamp                      = js.Date

  implicit final class BackupOps(private val service: Backup) extends AnyVal {

    @inline def createBackupPlanFuture(params: CreateBackupPlanInput): Future[CreateBackupPlanOutput] =
      service.createBackupPlan(params).promise().toFuture
    @inline def createBackupSelectionFuture(params: CreateBackupSelectionInput): Future[CreateBackupSelectionOutput] =
      service.createBackupSelection(params).promise().toFuture
    @inline def createBackupVaultFuture(params: CreateBackupVaultInput): Future[CreateBackupVaultOutput] =
      service.createBackupVault(params).promise().toFuture
    @inline def deleteBackupPlanFuture(params: DeleteBackupPlanInput): Future[DeleteBackupPlanOutput] =
      service.deleteBackupPlan(params).promise().toFuture
    @inline def deleteBackupSelectionFuture(params: DeleteBackupSelectionInput): Future[js.Object] =
      service.deleteBackupSelection(params).promise().toFuture
    @inline def deleteBackupVaultAccessPolicyFuture(params: DeleteBackupVaultAccessPolicyInput): Future[js.Object] =
      service.deleteBackupVaultAccessPolicy(params).promise().toFuture
    @inline def deleteBackupVaultFuture(params: DeleteBackupVaultInput): Future[js.Object] =
      service.deleteBackupVault(params).promise().toFuture
    @inline def deleteBackupVaultNotificationsFuture(params: DeleteBackupVaultNotificationsInput): Future[js.Object] =
      service.deleteBackupVaultNotifications(params).promise().toFuture
    @inline def deleteRecoveryPointFuture(params: DeleteRecoveryPointInput): Future[js.Object] =
      service.deleteRecoveryPoint(params).promise().toFuture
    @inline def describeBackupJobFuture(params: DescribeBackupJobInput): Future[DescribeBackupJobOutput] =
      service.describeBackupJob(params).promise().toFuture
    @inline def describeBackupVaultFuture(params: DescribeBackupVaultInput): Future[DescribeBackupVaultOutput] =
      service.describeBackupVault(params).promise().toFuture
    @inline def describeCopyJobFuture(params: DescribeCopyJobInput): Future[DescribeCopyJobOutput] =
      service.describeCopyJob(params).promise().toFuture
    @inline def describeProtectedResourceFuture(
        params: DescribeProtectedResourceInput
    ): Future[DescribeProtectedResourceOutput] = service.describeProtectedResource(params).promise().toFuture
    @inline def describeRecoveryPointFuture(params: DescribeRecoveryPointInput): Future[DescribeRecoveryPointOutput] =
      service.describeRecoveryPoint(params).promise().toFuture
    @inline def describeRestoreJobFuture(params: DescribeRestoreJobInput): Future[DescribeRestoreJobOutput] =
      service.describeRestoreJob(params).promise().toFuture
    @inline def exportBackupPlanTemplateFuture(
        params: ExportBackupPlanTemplateInput
    ): Future[ExportBackupPlanTemplateOutput] = service.exportBackupPlanTemplate(params).promise().toFuture
    @inline def getBackupPlanFromJSONFuture(params: GetBackupPlanFromJSONInput): Future[GetBackupPlanFromJSONOutput] =
      service.getBackupPlanFromJSON(params).promise().toFuture
    @inline def getBackupPlanFromTemplateFuture(
        params: GetBackupPlanFromTemplateInput
    ): Future[GetBackupPlanFromTemplateOutput] = service.getBackupPlanFromTemplate(params).promise().toFuture
    @inline def getBackupPlanFuture(params: GetBackupPlanInput): Future[GetBackupPlanOutput] =
      service.getBackupPlan(params).promise().toFuture
    @inline def getBackupSelectionFuture(params: GetBackupSelectionInput): Future[GetBackupSelectionOutput] =
      service.getBackupSelection(params).promise().toFuture
    @inline def getBackupVaultAccessPolicyFuture(
        params: GetBackupVaultAccessPolicyInput
    ): Future[GetBackupVaultAccessPolicyOutput] = service.getBackupVaultAccessPolicy(params).promise().toFuture
    @inline def getBackupVaultNotificationsFuture(
        params: GetBackupVaultNotificationsInput
    ): Future[GetBackupVaultNotificationsOutput] = service.getBackupVaultNotifications(params).promise().toFuture
    @inline def getRecoveryPointRestoreMetadataFuture(
        params: GetRecoveryPointRestoreMetadataInput
    ): Future[GetRecoveryPointRestoreMetadataOutput] =
      service.getRecoveryPointRestoreMetadata(params).promise().toFuture
    @inline def getSupportedResourceTypesFuture(): Future[GetSupportedResourceTypesOutput] =
      service.getSupportedResourceTypes().promise().toFuture
    @inline def listBackupJobsFuture(params: ListBackupJobsInput): Future[ListBackupJobsOutput] =
      service.listBackupJobs(params).promise().toFuture
    @inline def listBackupPlanTemplatesFuture(
        params: ListBackupPlanTemplatesInput
    ): Future[ListBackupPlanTemplatesOutput] = service.listBackupPlanTemplates(params).promise().toFuture
    @inline def listBackupPlanVersionsFuture(
        params: ListBackupPlanVersionsInput
    ): Future[ListBackupPlanVersionsOutput] = service.listBackupPlanVersions(params).promise().toFuture
    @inline def listBackupPlansFuture(params: ListBackupPlansInput): Future[ListBackupPlansOutput] =
      service.listBackupPlans(params).promise().toFuture
    @inline def listBackupSelectionsFuture(params: ListBackupSelectionsInput): Future[ListBackupSelectionsOutput] =
      service.listBackupSelections(params).promise().toFuture
    @inline def listBackupVaultsFuture(params: ListBackupVaultsInput): Future[ListBackupVaultsOutput] =
      service.listBackupVaults(params).promise().toFuture
    @inline def listCopyJobsFuture(params: ListCopyJobsInput): Future[ListCopyJobsOutput] =
      service.listCopyJobs(params).promise().toFuture
    @inline def listProtectedResourcesFuture(
        params: ListProtectedResourcesInput
    ): Future[ListProtectedResourcesOutput] = service.listProtectedResources(params).promise().toFuture
    @inline def listRecoveryPointsByBackupVaultFuture(
        params: ListRecoveryPointsByBackupVaultInput
    ): Future[ListRecoveryPointsByBackupVaultOutput] =
      service.listRecoveryPointsByBackupVault(params).promise().toFuture
    @inline def listRecoveryPointsByResourceFuture(
        params: ListRecoveryPointsByResourceInput
    ): Future[ListRecoveryPointsByResourceOutput] = service.listRecoveryPointsByResource(params).promise().toFuture
    @inline def listRestoreJobsFuture(params: ListRestoreJobsInput): Future[ListRestoreJobsOutput] =
      service.listRestoreJobs(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsInput): Future[ListTagsOutput] =
      service.listTags(params).promise().toFuture
    @inline def putBackupVaultAccessPolicyFuture(params: PutBackupVaultAccessPolicyInput): Future[js.Object] =
      service.putBackupVaultAccessPolicy(params).promise().toFuture
    @inline def putBackupVaultNotificationsFuture(params: PutBackupVaultNotificationsInput): Future[js.Object] =
      service.putBackupVaultNotifications(params).promise().toFuture
    @inline def startBackupJobFuture(params: StartBackupJobInput): Future[StartBackupJobOutput] =
      service.startBackupJob(params).promise().toFuture
    @inline def startCopyJobFuture(params: StartCopyJobInput): Future[StartCopyJobOutput] =
      service.startCopyJob(params).promise().toFuture
    @inline def startRestoreJobFuture(params: StartRestoreJobInput): Future[StartRestoreJobOutput] =
      service.startRestoreJob(params).promise().toFuture
    @inline def stopBackupJobFuture(params: StopBackupJobInput): Future[js.Object] =
      service.stopBackupJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateBackupPlanFuture(params: UpdateBackupPlanInput): Future[UpdateBackupPlanOutput] =
      service.updateBackupPlan(params).promise().toFuture
    @inline def updateRecoveryPointLifecycleFuture(
        params: UpdateRecoveryPointLifecycleInput
    ): Future[UpdateRecoveryPointLifecycleOutput] = service.updateRecoveryPointLifecycle(params).promise().toFuture
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
    def describeCopyJob(params: DescribeCopyJobInput): Request[DescribeCopyJobOutput]                   = js.native
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
    def listCopyJobs(params: ListCopyJobsInput): Request[ListCopyJobsOutput]                               = js.native
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
    def startCopyJob(params: StartCopyJobInput): Request[StartCopyJobOutput]                      = js.native
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
  @Factory
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

  @js.native
  sealed trait BackupJobState extends js.Any
  object BackupJobState extends js.Object {
    val CREATED   = "CREATED".asInstanceOf[BackupJobState]
    val PENDING   = "PENDING".asInstanceOf[BackupJobState]
    val RUNNING   = "RUNNING".asInstanceOf[BackupJobState]
    val ABORTING  = "ABORTING".asInstanceOf[BackupJobState]
    val ABORTED   = "ABORTED".asInstanceOf[BackupJobState]
    val COMPLETED = "COMPLETED".asInstanceOf[BackupJobState]
    val FAILED    = "FAILED".asInstanceOf[BackupJobState]
    val EXPIRED   = "EXPIRED".asInstanceOf[BackupJobState]

    val values = js.Object.freeze(js.Array(CREATED, PENDING, RUNNING, ABORTING, ABORTED, COMPLETED, FAILED, EXPIRED))
  }

  /**
    * Contains an optional backup plan display name and an array of <code>BackupRule</code> objects, each of which specifies a backup rule. Each rule in a backup plan is a separate scheduled task and can back up a different selection of AWS resources.
    */
  @js.native
  @Factory
  trait BackupPlan extends js.Object {
    var BackupPlanName: BackupPlanName
    var Rules: BackupRules
  }

  /**
    * Contains an optional backup plan display name and an array of <code>BackupRule</code> objects, each of which specifies a backup rule. Each rule in a backup plan is a separate scheduled task and can back up a different selection of AWS resources.
    */
  @js.native
  @Factory
  trait BackupPlanInput extends js.Object {
    var BackupPlanName: BackupPlanName
    var Rules: BackupRulesInput
  }

  /**
    * An object specifying metadata associated with a backup plan template.
    */
  @js.native
  @Factory
  trait BackupPlanTemplatesListMember extends js.Object {
    var BackupPlanTemplateId: js.UndefOr[String]
    var BackupPlanTemplateName: js.UndefOr[String]
  }

  /**
    * Contains metadata about a backup plan.
    */
  @js.native
  @Factory
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

  /**
    * Specifies a scheduled task used to back up a selection of resources.
    */
  @js.native
  @Factory
  trait BackupRule extends js.Object {
    var RuleName: BackupRuleName
    var TargetBackupVaultName: BackupVaultName
    var CompletionWindowMinutes: js.UndefOr[WindowMinutes]
    var CopyActions: js.UndefOr[CopyActions]
    var Lifecycle: js.UndefOr[Lifecycle]
    var RecoveryPointTags: js.UndefOr[Tags]
    var RuleId: js.UndefOr[String]
    var ScheduleExpression: js.UndefOr[CronExpression]
    var StartWindowMinutes: js.UndefOr[WindowMinutes]
  }

  /**
    * Specifies a scheduled task used to back up a selection of resources.
    */
  @js.native
  @Factory
  trait BackupRuleInput extends js.Object {
    var RuleName: BackupRuleName
    var TargetBackupVaultName: BackupVaultName
    var CompletionWindowMinutes: js.UndefOr[WindowMinutes]
    var CopyActions: js.UndefOr[CopyActions]
    var Lifecycle: js.UndefOr[Lifecycle]
    var RecoveryPointTags: js.UndefOr[Tags]
    var ScheduleExpression: js.UndefOr[CronExpression]
    var StartWindowMinutes: js.UndefOr[WindowMinutes]
  }

  /**
    * Used to specify a set of resources to a backup plan.
    */
  @js.native
  @Factory
  trait BackupSelection extends js.Object {
    var IamRoleArn: IAMRoleArn
    var SelectionName: BackupSelectionName
    var ListOfTags: js.UndefOr[ListOfTags]
    var Resources: js.UndefOr[ResourceArns]
  }

  /**
    * Contains metadata about a <code>BackupSelection</code> object.
    */
  @js.native
  @Factory
  trait BackupSelectionsListMember extends js.Object {
    var BackupPlanId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var IamRoleArn: js.UndefOr[IAMRoleArn]
    var SelectionId: js.UndefOr[String]
    var SelectionName: js.UndefOr[BackupSelectionName]
  }

  @js.native
  sealed trait BackupVaultEvent extends js.Any
  object BackupVaultEvent extends js.Object {
    val BACKUP_JOB_STARTED      = "BACKUP_JOB_STARTED".asInstanceOf[BackupVaultEvent]
    val BACKUP_JOB_COMPLETED    = "BACKUP_JOB_COMPLETED".asInstanceOf[BackupVaultEvent]
    val BACKUP_JOB_SUCCESSFUL   = "BACKUP_JOB_SUCCESSFUL".asInstanceOf[BackupVaultEvent]
    val BACKUP_JOB_FAILED       = "BACKUP_JOB_FAILED".asInstanceOf[BackupVaultEvent]
    val BACKUP_JOB_EXPIRED      = "BACKUP_JOB_EXPIRED".asInstanceOf[BackupVaultEvent]
    val RESTORE_JOB_STARTED     = "RESTORE_JOB_STARTED".asInstanceOf[BackupVaultEvent]
    val RESTORE_JOB_COMPLETED   = "RESTORE_JOB_COMPLETED".asInstanceOf[BackupVaultEvent]
    val RESTORE_JOB_SUCCESSFUL  = "RESTORE_JOB_SUCCESSFUL".asInstanceOf[BackupVaultEvent]
    val RESTORE_JOB_FAILED      = "RESTORE_JOB_FAILED".asInstanceOf[BackupVaultEvent]
    val COPY_JOB_STARTED        = "COPY_JOB_STARTED".asInstanceOf[BackupVaultEvent]
    val COPY_JOB_SUCCESSFUL     = "COPY_JOB_SUCCESSFUL".asInstanceOf[BackupVaultEvent]
    val COPY_JOB_FAILED         = "COPY_JOB_FAILED".asInstanceOf[BackupVaultEvent]
    val RECOVERY_POINT_MODIFIED = "RECOVERY_POINT_MODIFIED".asInstanceOf[BackupVaultEvent]
    val BACKUP_PLAN_CREATED     = "BACKUP_PLAN_CREATED".asInstanceOf[BackupVaultEvent]
    val BACKUP_PLAN_MODIFIED    = "BACKUP_PLAN_MODIFIED".asInstanceOf[BackupVaultEvent]

    val values = js.Object.freeze(
      js.Array(
        BACKUP_JOB_STARTED,
        BACKUP_JOB_COMPLETED,
        BACKUP_JOB_SUCCESSFUL,
        BACKUP_JOB_FAILED,
        BACKUP_JOB_EXPIRED,
        RESTORE_JOB_STARTED,
        RESTORE_JOB_COMPLETED,
        RESTORE_JOB_SUCCESSFUL,
        RESTORE_JOB_FAILED,
        COPY_JOB_STARTED,
        COPY_JOB_SUCCESSFUL,
        COPY_JOB_FAILED,
        RECOVERY_POINT_MODIFIED,
        BACKUP_PLAN_CREATED,
        BACKUP_PLAN_MODIFIED
      )
    )
  }

  /**
    * Contains metadata about a backup vault.
    */
  @js.native
  @Factory
  trait BackupVaultListMember extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var EncryptionKeyArn: js.UndefOr[ARN]
    var NumberOfRecoveryPoints: js.UndefOr[Double]
  }

  /**
    * Contains <code>DeleteAt</code> and <code>MoveToColdStorageAt</code> timestamps, which are used to specify a lifecycle for a recovery point.
    *  The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.
    *  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
    */
  @js.native
  @Factory
  trait CalculatedLifecycle extends js.Object {
    var DeleteAt: js.UndefOr[timestamp]
    var MoveToColdStorageAt: js.UndefOr[timestamp]
  }

  /**
    * Contains an array of triplets made up of a condition type (such as <code>STRINGEQUALS</code>), a key, and a value. Conditions are used to filter resources in a selection that is assigned to a backup plan.
    */
  @js.native
  @Factory
  trait Condition extends js.Object {
    var ConditionKey: ConditionKey
    var ConditionType: ConditionType
    var ConditionValue: ConditionValue
  }

  @js.native
  sealed trait ConditionType extends js.Any
  object ConditionType extends js.Object {
    val STRINGEQUALS = "STRINGEQUALS".asInstanceOf[ConditionType]

    val values = js.Object.freeze(js.Array(STRINGEQUALS))
  }

  /**
    * The details of the copy operation.
    */
  @js.native
  @Factory
  trait CopyAction extends js.Object {
    var DestinationBackupVaultArn: ARN
    var Lifecycle: js.UndefOr[Lifecycle]
  }

  /**
    * Contains detailed information about a copy job.
    */
  @js.native
  @Factory
  trait CopyJob extends js.Object {
    var BackupSizeInBytes: js.UndefOr[Double]
    var CompletionDate: js.UndefOr[timestamp]
    var CopyJobId: js.UndefOr[String]
    var CreatedBy: js.UndefOr[RecoveryPointCreator]
    var CreationDate: js.UndefOr[timestamp]
    var DestinationBackupVaultArn: js.UndefOr[ARN]
    var DestinationRecoveryPointArn: js.UndefOr[ARN]
    var IamRoleArn: js.UndefOr[IAMRoleArn]
    var ResourceArn: js.UndefOr[ARN]
    var ResourceType: js.UndefOr[ResourceType]
    var SourceBackupVaultArn: js.UndefOr[ARN]
    var SourceRecoveryPointArn: js.UndefOr[ARN]
    var State: js.UndefOr[CopyJobState]
    var StatusMessage: js.UndefOr[String]
  }

  @js.native
  sealed trait CopyJobState extends js.Any
  object CopyJobState extends js.Object {
    val CREATED   = "CREATED".asInstanceOf[CopyJobState]
    val RUNNING   = "RUNNING".asInstanceOf[CopyJobState]
    val COMPLETED = "COMPLETED".asInstanceOf[CopyJobState]
    val FAILED    = "FAILED".asInstanceOf[CopyJobState]

    val values = js.Object.freeze(js.Array(CREATED, RUNNING, COMPLETED, FAILED))
  }

  @js.native
  @Factory
  trait CreateBackupPlanInput extends js.Object {
    var BackupPlan: BackupPlanInput
    var BackupPlanTags: js.UndefOr[Tags]
    var CreatorRequestId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateBackupPlanOutput extends js.Object {
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var VersionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateBackupSelectionInput extends js.Object {
    var BackupPlanId: String
    var BackupSelection: BackupSelection
    var CreatorRequestId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateBackupSelectionOutput extends js.Object {
    var BackupPlanId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var SelectionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateBackupVaultInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var BackupVaultTags: js.UndefOr[Tags]
    var CreatorRequestId: js.UndefOr[String]
    var EncryptionKeyArn: js.UndefOr[ARN]
  }

  @js.native
  @Factory
  trait CreateBackupVaultOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var CreationDate: js.UndefOr[timestamp]
  }

  @js.native
  @Factory
  trait DeleteBackupPlanInput extends js.Object {
    var BackupPlanId: String
  }

  @js.native
  @Factory
  trait DeleteBackupPlanOutput extends js.Object {
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var DeletionDate: js.UndefOr[timestamp]
    var VersionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteBackupSelectionInput extends js.Object {
    var BackupPlanId: String
    var SelectionId: String
  }

  @js.native
  @Factory
  trait DeleteBackupVaultAccessPolicyInput extends js.Object {
    var BackupVaultName: BackupVaultName
  }

  @js.native
  @Factory
  trait DeleteBackupVaultInput extends js.Object {
    var BackupVaultName: String
  }

  @js.native
  @Factory
  trait DeleteBackupVaultNotificationsInput extends js.Object {
    var BackupVaultName: BackupVaultName
  }

  @js.native
  @Factory
  trait DeleteRecoveryPointInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var RecoveryPointArn: ARN
  }

  @js.native
  @Factory
  trait DescribeBackupJobInput extends js.Object {
    var BackupJobId: String
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeBackupVaultInput extends js.Object {
    var BackupVaultName: String
  }

  @js.native
  @Factory
  trait DescribeBackupVaultOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var EncryptionKeyArn: js.UndefOr[ARN]
    var NumberOfRecoveryPoints: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait DescribeCopyJobInput extends js.Object {
    var CopyJobId: String
  }

  @js.native
  @Factory
  trait DescribeCopyJobOutput extends js.Object {
    var CopyJob: js.UndefOr[CopyJob]
  }

  @js.native
  @Factory
  trait DescribeProtectedResourceInput extends js.Object {
    var ResourceArn: ARN
  }

  @js.native
  @Factory
  trait DescribeProtectedResourceOutput extends js.Object {
    var LastBackupTime: js.UndefOr[timestamp]
    var ResourceArn: js.UndefOr[ARN]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  @Factory
  trait DescribeRecoveryPointInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var RecoveryPointArn: ARN
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DescribeRestoreJobInput extends js.Object {
    var RestoreJobId: RestoreJobId
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ExportBackupPlanTemplateInput extends js.Object {
    var BackupPlanId: String
  }

  @js.native
  @Factory
  trait ExportBackupPlanTemplateOutput extends js.Object {
    var BackupPlanTemplateJson: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetBackupPlanFromJSONInput extends js.Object {
    var BackupPlanTemplateJson: String
  }

  @js.native
  @Factory
  trait GetBackupPlanFromJSONOutput extends js.Object {
    var BackupPlan: js.UndefOr[BackupPlan]
  }

  @js.native
  @Factory
  trait GetBackupPlanFromTemplateInput extends js.Object {
    var BackupPlanTemplateId: String
  }

  @js.native
  @Factory
  trait GetBackupPlanFromTemplateOutput extends js.Object {
    var BackupPlanDocument: js.UndefOr[BackupPlan]
  }

  @js.native
  @Factory
  trait GetBackupPlanInput extends js.Object {
    var BackupPlanId: String
    var VersionId: js.UndefOr[String]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetBackupSelectionInput extends js.Object {
    var BackupPlanId: String
    var SelectionId: String
  }

  @js.native
  @Factory
  trait GetBackupSelectionOutput extends js.Object {
    var BackupPlanId: js.UndefOr[String]
    var BackupSelection: js.UndefOr[BackupSelection]
    var CreationDate: js.UndefOr[timestamp]
    var CreatorRequestId: js.UndefOr[String]
    var SelectionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetBackupVaultAccessPolicyInput extends js.Object {
    var BackupVaultName: BackupVaultName
  }

  @js.native
  @Factory
  trait GetBackupVaultAccessPolicyOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var Policy: js.UndefOr[IAMPolicy]
  }

  @js.native
  @Factory
  trait GetBackupVaultNotificationsInput extends js.Object {
    var BackupVaultName: BackupVaultName
  }

  @js.native
  @Factory
  trait GetBackupVaultNotificationsOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var BackupVaultEvents: js.UndefOr[BackupVaultEvents]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var SNSTopicArn: js.UndefOr[ARN]
  }

  @js.native
  @Factory
  trait GetRecoveryPointRestoreMetadataInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var RecoveryPointArn: ARN
  }

  @js.native
  @Factory
  trait GetRecoveryPointRestoreMetadataOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var RecoveryPointArn: js.UndefOr[ARN]
    var RestoreMetadata: js.UndefOr[Metadata]
  }

  @js.native
  @Factory
  trait GetSupportedResourceTypesOutput extends js.Object {
    var ResourceTypes: js.UndefOr[ResourceTypes]
  }

  /**
    * Contains an array of <code>Transition</code> objects specifying how long in days before a recovery point transitions to cold storage or is deleted.
    *  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, on the console, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
    */
  @js.native
  @Factory
  trait Lifecycle extends js.Object {
    var DeleteAfterDays: js.UndefOr[Double]
    var MoveToColdStorageAfterDays: js.UndefOr[Double]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListBackupJobsOutput extends js.Object {
    var BackupJobs: js.UndefOr[BackupJobsList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupPlanTemplatesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupPlanTemplatesOutput extends js.Object {
    var BackupPlanTemplatesList: js.UndefOr[BackupPlanTemplatesList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupPlanVersionsInput extends js.Object {
    var BackupPlanId: String
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupPlanVersionsOutput extends js.Object {
    var BackupPlanVersionsList: js.UndefOr[BackupPlanVersionsList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupPlansInput extends js.Object {
    var IncludeDeleted: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupPlansOutput extends js.Object {
    var BackupPlansList: js.UndefOr[BackupPlansList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupSelectionsInput extends js.Object {
    var BackupPlanId: String
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupSelectionsOutput extends js.Object {
    var BackupSelectionsList: js.UndefOr[BackupSelectionsList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupVaultsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListBackupVaultsOutput extends js.Object {
    var BackupVaultList: js.UndefOr[BackupVaultList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListCopyJobsInput extends js.Object {
    var ByCreatedAfter: js.UndefOr[timestamp]
    var ByCreatedBefore: js.UndefOr[timestamp]
    var ByDestinationVaultArn: js.UndefOr[String]
    var ByResourceArn: js.UndefOr[ARN]
    var ByResourceType: js.UndefOr[ResourceType]
    var ByState: js.UndefOr[CopyJobState]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListCopyJobsOutput extends js.Object {
    var CopyJobs: js.UndefOr[CopyJobsList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListProtectedResourcesInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListProtectedResourcesOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var Results: js.UndefOr[ProtectedResourcesList]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait ListRecoveryPointsByBackupVaultOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var RecoveryPoints: js.UndefOr[RecoveryPointByBackupVaultList]
  }

  @js.native
  @Factory
  trait ListRecoveryPointsByResourceInput extends js.Object {
    var ResourceArn: ARN
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListRecoveryPointsByResourceOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var RecoveryPoints: js.UndefOr[RecoveryPointByResourceList]
  }

  @js.native
  @Factory
  trait ListRestoreJobsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListRestoreJobsOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var RestoreJobs: js.UndefOr[RestoreJobsList]
  }

  @js.native
  @Factory
  trait ListTagsInput extends js.Object {
    var ResourceArn: ARN
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTagsOutput extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * A structure that contains information about a backed-up resource.
    */
  @js.native
  @Factory
  trait ProtectedResource extends js.Object {
    var LastBackupTime: js.UndefOr[timestamp]
    var ResourceArn: js.UndefOr[ARN]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  @Factory
  trait PutBackupVaultAccessPolicyInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var Policy: js.UndefOr[IAMPolicy]
  }

  @js.native
  @Factory
  trait PutBackupVaultNotificationsInput extends js.Object {
    var BackupVaultEvents: BackupVaultEvents
    var BackupVaultName: BackupVaultName
    var SNSTopicArn: ARN
  }

  /**
    * Contains detailed information about the recovery points stored in a backup vault.
    */
  @js.native
  @Factory
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

  /**
    * Contains detailed information about a saved recovery point.
    */
  @js.native
  @Factory
  trait RecoveryPointByResource extends js.Object {
    var BackupSizeBytes: js.UndefOr[Double]
    var BackupVaultName: js.UndefOr[BackupVaultName]
    var CreationDate: js.UndefOr[timestamp]
    var EncryptionKeyArn: js.UndefOr[ARN]
    var RecoveryPointArn: js.UndefOr[ARN]
    var Status: js.UndefOr[RecoveryPointStatus]
  }

  /**
    * Contains information about the backup plan and rule that AWS Backup used to initiate the recovery point backup.
    */
  @js.native
  @Factory
  trait RecoveryPointCreator extends js.Object {
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var BackupPlanVersion: js.UndefOr[String]
    var BackupRuleId: js.UndefOr[String]
  }

  @js.native
  sealed trait RecoveryPointStatus extends js.Any
  object RecoveryPointStatus extends js.Object {
    val COMPLETED = "COMPLETED".asInstanceOf[RecoveryPointStatus]
    val PARTIAL   = "PARTIAL".asInstanceOf[RecoveryPointStatus]
    val DELETING  = "DELETING".asInstanceOf[RecoveryPointStatus]
    val EXPIRED   = "EXPIRED".asInstanceOf[RecoveryPointStatus]

    val values = js.Object.freeze(js.Array(COMPLETED, PARTIAL, DELETING, EXPIRED))
  }

  @js.native
  sealed trait RestoreJobStatus extends js.Any
  object RestoreJobStatus extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[RestoreJobStatus]
    val RUNNING   = "RUNNING".asInstanceOf[RestoreJobStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[RestoreJobStatus]
    val ABORTED   = "ABORTED".asInstanceOf[RestoreJobStatus]
    val FAILED    = "FAILED".asInstanceOf[RestoreJobStatus]

    val values = js.Object.freeze(js.Array(PENDING, RUNNING, COMPLETED, ABORTED, FAILED))
  }

  /**
    * Contains metadata about a restore job.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait StartBackupJobOutput extends js.Object {
    var BackupJobId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var RecoveryPointArn: js.UndefOr[ARN]
  }

  @js.native
  @Factory
  trait StartCopyJobInput extends js.Object {
    var DestinationBackupVaultArn: ARN
    var IamRoleArn: IAMRoleArn
    var RecoveryPointArn: ARN
    var SourceBackupVaultName: BackupVaultName
    var IdempotencyToken: js.UndefOr[String]
    var Lifecycle: js.UndefOr[Lifecycle]
  }

  @js.native
  @Factory
  trait StartCopyJobOutput extends js.Object {
    var CopyJobId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
  }

  @js.native
  @Factory
  trait StartRestoreJobInput extends js.Object {
    var IamRoleArn: IAMRoleArn
    var Metadata: Metadata
    var RecoveryPointArn: ARN
    var IdempotencyToken: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
  }

  @js.native
  @Factory
  trait StartRestoreJobOutput extends js.Object {
    var RestoreJobId: js.UndefOr[RestoreJobId]
  }

  @js.native
  @Factory
  trait StopBackupJobInput extends js.Object {
    var BackupJobId: String
  }

  @js.native
  sealed trait StorageClass extends js.Any
  object StorageClass extends js.Object {
    val WARM    = "WARM".asInstanceOf[StorageClass]
    val COLD    = "COLD".asInstanceOf[StorageClass]
    val DELETED = "DELETED".asInstanceOf[StorageClass]

    val values = js.Object.freeze(js.Array(WARM, COLD, DELETED))
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var ResourceArn: ARN
    var Tags: Tags
  }

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var ResourceArn: ARN
    var TagKeyList: TagKeyList
  }

  @js.native
  @Factory
  trait UpdateBackupPlanInput extends js.Object {
    var BackupPlan: BackupPlanInput
    var BackupPlanId: String
  }

  @js.native
  @Factory
  trait UpdateBackupPlanOutput extends js.Object {
    var BackupPlanArn: js.UndefOr[ARN]
    var BackupPlanId: js.UndefOr[String]
    var CreationDate: js.UndefOr[timestamp]
    var VersionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateRecoveryPointLifecycleInput extends js.Object {
    var BackupVaultName: BackupVaultName
    var RecoveryPointArn: ARN
    var Lifecycle: js.UndefOr[Lifecycle]
  }

  @js.native
  @Factory
  trait UpdateRecoveryPointLifecycleOutput extends js.Object {
    var BackupVaultArn: js.UndefOr[ARN]
    var CalculatedLifecycle: js.UndefOr[CalculatedLifecycle]
    var Lifecycle: js.UndefOr[Lifecycle]
    var RecoveryPointArn: js.UndefOr[ARN]
  }
}
