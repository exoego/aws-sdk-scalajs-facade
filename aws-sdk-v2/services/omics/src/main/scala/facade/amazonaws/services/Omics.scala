package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object omics {
  type ActivateReadSetJobList = js.Array[ActivateReadSetJobItem]
  type ActivateReadSetSourceList = js.Array[ActivateReadSetSourceItem]
  type ActivationJobId = String
  type AnnotationImportItemDetails = js.Array[AnnotationImportItemDetail]
  type AnnotationImportItemSources = js.Array[AnnotationImportItemSource]
  type AnnotationImportJobItems = js.Array[AnnotationImportJobItem]
  type AnnotationStoreItems = js.Array[AnnotationStoreItem]
  type Arn = String
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ClientToken = String
  type CommentChar = String
  type CompletionTime = js.Date
  type CreateAnnotationStoreRequestNameString = String
  type CreateRunGroupRequestMaxCpusInteger = Int
  type CreateRunGroupRequestMaxDurationInteger = Int
  type CreateRunGroupRequestMaxRunsInteger = Int
  type CreateVariantStoreRequestNameString = String
  type CreateWorkflowRequestStorageCapacityInteger = Int
  type CreationTime = js.Date
  type Encoding = String
  type EscapeChar = String
  type EscapeQuotes = Boolean
  type ExportJobId = String
  type ExportReadSetDetailList = js.Array[ExportReadSetDetail]
  type ExportReadSetJobDetailList = js.Array[ExportReadSetJobDetail]
  type FileInformationContentLengthLong = Double
  type FileInformationPartSizeLong = Double
  type FileInformationTotalPartsInteger = Int
  type FormatToHeader = js.Dictionary[FormatToHeaderValueString]
  type FormatToHeaderValueString = String
  type GeneratedFrom = String
  type GetReadSetRequestPartNumberInteger = Int
  type GetReferenceRequestPartNumberInteger = Int
  type GetRunGroupResponseMaxCpusInteger = Int
  type GetRunGroupResponseMaxDurationInteger = Int
  type GetRunGroupResponseMaxRunsInteger = Int
  type GetRunResponsePriorityInteger = Int
  type GetRunResponseStorageCapacityInteger = Int
  type GetRunTaskResponseCpusInteger = Int
  type GetRunTaskResponseMemoryInteger = Int
  type GetWorkflowResponseStorageCapacityInteger = Int
  type Header = Boolean
  type ImportJobId = String
  type ImportReadSetJobList = js.Array[ImportReadSetJobItem]
  type ImportReadSetSourceList = js.Array[ImportReadSetSourceItem]
  type ImportReferenceJobList = js.Array[ImportReferenceJobItem]
  type ImportReferenceSourceList = js.Array[ImportReferenceSourceItem]
  type JobStatusMessage = String
  type JobStatusMsg = String
  type LineSep = String
  type ListAnnotationImportJobsRequestIdsList = js.Array[ResourceIdentifier]
  type ListAnnotationImportJobsRequestMaxResultsInteger = Int
  type ListAnnotationImportJobsRequestNextTokenString = String
  type ListAnnotationStoresRequestIdsList = js.Array[ResourceIdentifier]
  type ListAnnotationStoresRequestMaxResultsInteger = Int
  type ListAnnotationStoresRequestNextTokenString = String
  type ListReadSetActivationJobsRequestMaxResultsInteger = Int
  type ListReadSetExportJobsRequestMaxResultsInteger = Int
  type ListReadSetImportJobsRequestMaxResultsInteger = Int
  type ListReadSetsRequestMaxResultsInteger = Int
  type ListReferenceImportJobsRequestMaxResultsInteger = Int
  type ListReferenceStoresRequestMaxResultsInteger = Int
  type ListReferencesRequestMaxResultsInteger = Int
  type ListRunGroupsRequestMaxResultsInteger = Int
  type ListRunTasksRequestMaxResultsInteger = Int
  type ListRunsRequestMaxResultsInteger = Int
  type ListSequenceStoresRequestMaxResultsInteger = Int
  type ListVariantImportJobsRequestIdsList = js.Array[ResourceIdentifier]
  type ListVariantImportJobsRequestMaxResultsInteger = Int
  type ListVariantImportJobsRequestNextTokenString = String
  type ListVariantStoresRequestIdsList = js.Array[ResourceIdentifier]
  type ListVariantStoresRequestMaxResultsInteger = Int
  type ListVariantStoresRequestNextTokenString = String
  type ListWorkflowsRequestMaxResultsInteger = Int
  type Md5 = String
  type NextToken = String
  type PrimitiveBoolean = Boolean
  type Quote = String
  type QuoteAll = Boolean
  type Range = String
  type ReadSetArn = String
  type ReadSetBatchErrorList = js.Array[ReadSetBatchError]
  type ReadSetDescription = String
  type ReadSetId = String
  type ReadSetIdList = js.Array[ReadSetId]
  type ReadSetList = js.Array[ReadSetListItem]
  type ReadSetName = String
  type ReadSetStreamingBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ReferenceArn = String
  type ReferenceDescription = String
  type ReferenceId = String
  type ReferenceList = js.Array[ReferenceListItem]
  type ReferenceName = String
  type ReferenceStoreArn = String
  type ReferenceStoreDescription = String
  type ReferenceStoreDetailList = js.Array[ReferenceStoreDetail]
  type ReferenceStoreId = String
  type ReferenceStoreName = String
  type ReferenceStreamingBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ResourceId = String
  type ResourceIdentifier = String
  type RoleArn = String
  type RunArn = String
  type RunExportList = js.Array[RunExport]
  type RunGroupArn = String
  type RunGroupId = String
  type RunGroupList = js.Array[RunGroupListItem]
  type RunGroupListItemMaxCpusInteger = Int
  type RunGroupListItemMaxDurationInteger = Int
  type RunGroupListItemMaxRunsInteger = Int
  type RunGroupListToken = String
  type RunGroupName = String
  type RunGroupRequestId = String
  type RunGroupTimestamp = js.Date
  type RunId = String
  type RunLeftNormalization = Boolean
  type RunList = js.Array[RunListItem]
  type RunListItemPriorityInteger = Int
  type RunListItemStorageCapacityInteger = Int
  type RunListToken = String
  type RunName = String
  type RunOutputUri = String
  type RunRequestId = String
  type RunResourceDigest = String
  type RunResourceDigestKey = String
  type RunResourceDigests = js.Dictionary[RunResourceDigest]
  type RunRoleArn = String
  type RunStartedBy = String
  type RunStatusMessage = String
  type RunTimestamp = js.Date
  type S3Destination = String
  type S3Uri = String
  type SampleId = String
  type SchemaItem = js.Dictionary[SchemaValueType]
  type Separator = String
  type SequenceStoreArn = String
  type SequenceStoreDescription = String
  type SequenceStoreDetailList = js.Array[SequenceStoreDetail]
  type SequenceStoreId = String
  type SequenceStoreName = String
  type SseConfigKeyArnString = String
  type StartReadSetActivationJobRequestSourcesList = js.Array[StartReadSetActivationJobSourceItem]
  type StartReadSetExportJobRequestSourcesList = js.Array[ExportReadSet]
  type StartReadSetImportJobRequestSourcesList = js.Array[StartReadSetImportJobSourceItem]
  type StartReferenceImportJobRequestSourcesList = js.Array[StartReferenceImportJobSourceItem]
  type StartRunRequestPriorityInteger = Int
  type StartRunRequestStorageCapacityInteger = Int
  type StatusMessage = String
  type StoreDescription = String
  type StoreName = String
  type SubjectId = String
  type SyntheticTimestamp_date_time = js.Date
  type TagArn = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagResourceRequestTagsMap = js.Dictionary[TagValue]
  type TagValue = String
  type TaskId = String
  type TaskList = js.Array[TaskListItem]
  type TaskListItemCpusInteger = Int
  type TaskListItemMemoryInteger = Int
  type TaskListToken = String
  type TaskLogStream = String
  type TaskName = String
  type TaskStatusMessage = String
  type TaskTimestamp = js.Date
  type TsvStoreOptionsSchemaList = js.Array[SchemaItem]
  type UpdateRunGroupRequestMaxCpusInteger = Int
  type UpdateRunGroupRequestMaxDurationInteger = Int
  type UpdateRunGroupRequestMaxRunsInteger = Int
  type UpdateTime = js.Date
  type VariantImportItemDetails = js.Array[VariantImportItemDetail]
  type VariantImportItemSources = js.Array[VariantImportItemSource]
  type VariantImportJobItems = js.Array[VariantImportJobItem]
  type VariantStoreItems = js.Array[VariantStoreItem]
  type WorkflowArn = String
  type WorkflowDefinition = String
  type WorkflowDescription = String
  type WorkflowDigest = String
  type WorkflowExportList = js.Array[WorkflowExport]
  type WorkflowId = String
  type WorkflowList = js.Array[WorkflowListItem]
  type WorkflowListToken = String
  type WorkflowMain = String
  type WorkflowName = String
  type WorkflowParameterDescription = String
  type WorkflowParameterName = String
  type WorkflowParameterTemplate = js.Dictionary[WorkflowParameter]
  type WorkflowRequestId = String
  type WorkflowStatusMessage = String
  type WorkflowTimestamp = js.Date

  final class OmicsOps(private val service: Omics) extends AnyVal {

    @inline def batchDeleteReadSetFuture(params: BatchDeleteReadSetRequest): Future[BatchDeleteReadSetResponse] = service.batchDeleteReadSet(params).promise().toFuture
    @inline def cancelAnnotationImportJobFuture(params: CancelAnnotationImportRequest): Future[CancelAnnotationImportResponse] = service.cancelAnnotationImportJob(params).promise().toFuture
    @inline def cancelRunFuture(params: CancelRunRequest): Future[js.Object] = service.cancelRun(params).promise().toFuture
    @inline def cancelVariantImportJobFuture(params: CancelVariantImportRequest): Future[CancelVariantImportResponse] = service.cancelVariantImportJob(params).promise().toFuture
    @inline def createAnnotationStoreFuture(params: CreateAnnotationStoreRequest): Future[CreateAnnotationStoreResponse] = service.createAnnotationStore(params).promise().toFuture
    @inline def createReferenceStoreFuture(params: CreateReferenceStoreRequest): Future[CreateReferenceStoreResponse] = service.createReferenceStore(params).promise().toFuture
    @inline def createRunGroupFuture(params: CreateRunGroupRequest): Future[CreateRunGroupResponse] = service.createRunGroup(params).promise().toFuture
    @inline def createSequenceStoreFuture(params: CreateSequenceStoreRequest): Future[CreateSequenceStoreResponse] = service.createSequenceStore(params).promise().toFuture
    @inline def createVariantStoreFuture(params: CreateVariantStoreRequest): Future[CreateVariantStoreResponse] = service.createVariantStore(params).promise().toFuture
    @inline def createWorkflowFuture(params: CreateWorkflowRequest): Future[CreateWorkflowResponse] = service.createWorkflow(params).promise().toFuture
    @inline def deleteAnnotationStoreFuture(params: DeleteAnnotationStoreRequest): Future[DeleteAnnotationStoreResponse] = service.deleteAnnotationStore(params).promise().toFuture
    @inline def deleteReferenceFuture(params: DeleteReferenceRequest): Future[DeleteReferenceResponse] = service.deleteReference(params).promise().toFuture
    @inline def deleteReferenceStoreFuture(params: DeleteReferenceStoreRequest): Future[DeleteReferenceStoreResponse] = service.deleteReferenceStore(params).promise().toFuture
    @inline def deleteRunFuture(params: DeleteRunRequest): Future[js.Object] = service.deleteRun(params).promise().toFuture
    @inline def deleteRunGroupFuture(params: DeleteRunGroupRequest): Future[js.Object] = service.deleteRunGroup(params).promise().toFuture
    @inline def deleteSequenceStoreFuture(params: DeleteSequenceStoreRequest): Future[DeleteSequenceStoreResponse] = service.deleteSequenceStore(params).promise().toFuture
    @inline def deleteVariantStoreFuture(params: DeleteVariantStoreRequest): Future[DeleteVariantStoreResponse] = service.deleteVariantStore(params).promise().toFuture
    @inline def deleteWorkflowFuture(params: DeleteWorkflowRequest): Future[js.Object] = service.deleteWorkflow(params).promise().toFuture
    @inline def getAnnotationImportJobFuture(params: GetAnnotationImportRequest): Future[GetAnnotationImportResponse] = service.getAnnotationImportJob(params).promise().toFuture
    @inline def getAnnotationStoreFuture(params: GetAnnotationStoreRequest): Future[GetAnnotationStoreResponse] = service.getAnnotationStore(params).promise().toFuture
    @inline def getReadSetActivationJobFuture(params: GetReadSetActivationJobRequest): Future[GetReadSetActivationJobResponse] = service.getReadSetActivationJob(params).promise().toFuture
    @inline def getReadSetExportJobFuture(params: GetReadSetExportJobRequest): Future[GetReadSetExportJobResponse] = service.getReadSetExportJob(params).promise().toFuture
    @inline def getReadSetFuture(params: GetReadSetRequest): Future[GetReadSetResponse] = service.getReadSet(params).promise().toFuture
    @inline def getReadSetImportJobFuture(params: GetReadSetImportJobRequest): Future[GetReadSetImportJobResponse] = service.getReadSetImportJob(params).promise().toFuture
    @inline def getReadSetMetadataFuture(params: GetReadSetMetadataRequest): Future[GetReadSetMetadataResponse] = service.getReadSetMetadata(params).promise().toFuture
    @inline def getReferenceFuture(params: GetReferenceRequest): Future[GetReferenceResponse] = service.getReference(params).promise().toFuture
    @inline def getReferenceImportJobFuture(params: GetReferenceImportJobRequest): Future[GetReferenceImportJobResponse] = service.getReferenceImportJob(params).promise().toFuture
    @inline def getReferenceMetadataFuture(params: GetReferenceMetadataRequest): Future[GetReferenceMetadataResponse] = service.getReferenceMetadata(params).promise().toFuture
    @inline def getReferenceStoreFuture(params: GetReferenceStoreRequest): Future[GetReferenceStoreResponse] = service.getReferenceStore(params).promise().toFuture
    @inline def getRunFuture(params: GetRunRequest): Future[GetRunResponse] = service.getRun(params).promise().toFuture
    @inline def getRunGroupFuture(params: GetRunGroupRequest): Future[GetRunGroupResponse] = service.getRunGroup(params).promise().toFuture
    @inline def getRunTaskFuture(params: GetRunTaskRequest): Future[GetRunTaskResponse] = service.getRunTask(params).promise().toFuture
    @inline def getSequenceStoreFuture(params: GetSequenceStoreRequest): Future[GetSequenceStoreResponse] = service.getSequenceStore(params).promise().toFuture
    @inline def getVariantImportJobFuture(params: GetVariantImportRequest): Future[GetVariantImportResponse] = service.getVariantImportJob(params).promise().toFuture
    @inline def getVariantStoreFuture(params: GetVariantStoreRequest): Future[GetVariantStoreResponse] = service.getVariantStore(params).promise().toFuture
    @inline def getWorkflowFuture(params: GetWorkflowRequest): Future[GetWorkflowResponse] = service.getWorkflow(params).promise().toFuture
    @inline def listAnnotationImportJobsFuture(params: ListAnnotationImportJobsRequest): Future[ListAnnotationImportJobsResponse] = service.listAnnotationImportJobs(params).promise().toFuture
    @inline def listAnnotationStoresFuture(params: ListAnnotationStoresRequest): Future[ListAnnotationStoresResponse] = service.listAnnotationStores(params).promise().toFuture
    @inline def listReadSetActivationJobsFuture(params: ListReadSetActivationJobsRequest): Future[ListReadSetActivationJobsResponse] = service.listReadSetActivationJobs(params).promise().toFuture
    @inline def listReadSetExportJobsFuture(params: ListReadSetExportJobsRequest): Future[ListReadSetExportJobsResponse] = service.listReadSetExportJobs(params).promise().toFuture
    @inline def listReadSetImportJobsFuture(params: ListReadSetImportJobsRequest): Future[ListReadSetImportJobsResponse] = service.listReadSetImportJobs(params).promise().toFuture
    @inline def listReadSetsFuture(params: ListReadSetsRequest): Future[ListReadSetsResponse] = service.listReadSets(params).promise().toFuture
    @inline def listReferenceImportJobsFuture(params: ListReferenceImportJobsRequest): Future[ListReferenceImportJobsResponse] = service.listReferenceImportJobs(params).promise().toFuture
    @inline def listReferenceStoresFuture(params: ListReferenceStoresRequest): Future[ListReferenceStoresResponse] = service.listReferenceStores(params).promise().toFuture
    @inline def listReferencesFuture(params: ListReferencesRequest): Future[ListReferencesResponse] = service.listReferences(params).promise().toFuture
    @inline def listRunGroupsFuture(params: ListRunGroupsRequest): Future[ListRunGroupsResponse] = service.listRunGroups(params).promise().toFuture
    @inline def listRunTasksFuture(params: ListRunTasksRequest): Future[ListRunTasksResponse] = service.listRunTasks(params).promise().toFuture
    @inline def listRunsFuture(params: ListRunsRequest): Future[ListRunsResponse] = service.listRuns(params).promise().toFuture
    @inline def listSequenceStoresFuture(params: ListSequenceStoresRequest): Future[ListSequenceStoresResponse] = service.listSequenceStores(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listVariantImportJobsFuture(params: ListVariantImportJobsRequest): Future[ListVariantImportJobsResponse] = service.listVariantImportJobs(params).promise().toFuture
    @inline def listVariantStoresFuture(params: ListVariantStoresRequest): Future[ListVariantStoresResponse] = service.listVariantStores(params).promise().toFuture
    @inline def listWorkflowsFuture(params: ListWorkflowsRequest): Future[ListWorkflowsResponse] = service.listWorkflows(params).promise().toFuture
    @inline def startAnnotationImportJobFuture(params: StartAnnotationImportRequest): Future[StartAnnotationImportResponse] = service.startAnnotationImportJob(params).promise().toFuture
    @inline def startReadSetActivationJobFuture(params: StartReadSetActivationJobRequest): Future[StartReadSetActivationJobResponse] = service.startReadSetActivationJob(params).promise().toFuture
    @inline def startReadSetExportJobFuture(params: StartReadSetExportJobRequest): Future[StartReadSetExportJobResponse] = service.startReadSetExportJob(params).promise().toFuture
    @inline def startReadSetImportJobFuture(params: StartReadSetImportJobRequest): Future[StartReadSetImportJobResponse] = service.startReadSetImportJob(params).promise().toFuture
    @inline def startReferenceImportJobFuture(params: StartReferenceImportJobRequest): Future[StartReferenceImportJobResponse] = service.startReferenceImportJob(params).promise().toFuture
    @inline def startRunFuture(params: StartRunRequest): Future[StartRunResponse] = service.startRun(params).promise().toFuture
    @inline def startVariantImportJobFuture(params: StartVariantImportRequest): Future[StartVariantImportResponse] = service.startVariantImportJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAnnotationStoreFuture(params: UpdateAnnotationStoreRequest): Future[UpdateAnnotationStoreResponse] = service.updateAnnotationStore(params).promise().toFuture
    @inline def updateRunGroupFuture(params: UpdateRunGroupRequest): Future[js.Object] = service.updateRunGroup(params).promise().toFuture
    @inline def updateVariantStoreFuture(params: UpdateVariantStoreRequest): Future[UpdateVariantStoreResponse] = service.updateVariantStore(params).promise().toFuture
    @inline def updateWorkflowFuture(params: UpdateWorkflowRequest): Future[js.Object] = service.updateWorkflow(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/omics", JSImport.Namespace, "AWS.Omics")
  class Omics() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchDeleteReadSet(params: BatchDeleteReadSetRequest): Request[BatchDeleteReadSetResponse] = js.native
    def cancelAnnotationImportJob(params: CancelAnnotationImportRequest): Request[CancelAnnotationImportResponse] = js.native
    def cancelRun(params: CancelRunRequest): Request[js.Object] = js.native
    def cancelVariantImportJob(params: CancelVariantImportRequest): Request[CancelVariantImportResponse] = js.native
    def createAnnotationStore(params: CreateAnnotationStoreRequest): Request[CreateAnnotationStoreResponse] = js.native
    def createReferenceStore(params: CreateReferenceStoreRequest): Request[CreateReferenceStoreResponse] = js.native
    def createRunGroup(params: CreateRunGroupRequest): Request[CreateRunGroupResponse] = js.native
    def createSequenceStore(params: CreateSequenceStoreRequest): Request[CreateSequenceStoreResponse] = js.native
    def createVariantStore(params: CreateVariantStoreRequest): Request[CreateVariantStoreResponse] = js.native
    def createWorkflow(params: CreateWorkflowRequest): Request[CreateWorkflowResponse] = js.native
    def deleteAnnotationStore(params: DeleteAnnotationStoreRequest): Request[DeleteAnnotationStoreResponse] = js.native
    def deleteReference(params: DeleteReferenceRequest): Request[DeleteReferenceResponse] = js.native
    def deleteReferenceStore(params: DeleteReferenceStoreRequest): Request[DeleteReferenceStoreResponse] = js.native
    def deleteRun(params: DeleteRunRequest): Request[js.Object] = js.native
    def deleteRunGroup(params: DeleteRunGroupRequest): Request[js.Object] = js.native
    def deleteSequenceStore(params: DeleteSequenceStoreRequest): Request[DeleteSequenceStoreResponse] = js.native
    def deleteVariantStore(params: DeleteVariantStoreRequest): Request[DeleteVariantStoreResponse] = js.native
    def deleteWorkflow(params: DeleteWorkflowRequest): Request[js.Object] = js.native
    def getAnnotationImportJob(params: GetAnnotationImportRequest): Request[GetAnnotationImportResponse] = js.native
    def getAnnotationStore(params: GetAnnotationStoreRequest): Request[GetAnnotationStoreResponse] = js.native
    def getReadSet(params: GetReadSetRequest): Request[GetReadSetResponse] = js.native
    def getReadSetActivationJob(params: GetReadSetActivationJobRequest): Request[GetReadSetActivationJobResponse] = js.native
    def getReadSetExportJob(params: GetReadSetExportJobRequest): Request[GetReadSetExportJobResponse] = js.native
    def getReadSetImportJob(params: GetReadSetImportJobRequest): Request[GetReadSetImportJobResponse] = js.native
    def getReadSetMetadata(params: GetReadSetMetadataRequest): Request[GetReadSetMetadataResponse] = js.native
    def getReference(params: GetReferenceRequest): Request[GetReferenceResponse] = js.native
    def getReferenceImportJob(params: GetReferenceImportJobRequest): Request[GetReferenceImportJobResponse] = js.native
    def getReferenceMetadata(params: GetReferenceMetadataRequest): Request[GetReferenceMetadataResponse] = js.native
    def getReferenceStore(params: GetReferenceStoreRequest): Request[GetReferenceStoreResponse] = js.native
    def getRun(params: GetRunRequest): Request[GetRunResponse] = js.native
    def getRunGroup(params: GetRunGroupRequest): Request[GetRunGroupResponse] = js.native
    def getRunTask(params: GetRunTaskRequest): Request[GetRunTaskResponse] = js.native
    def getSequenceStore(params: GetSequenceStoreRequest): Request[GetSequenceStoreResponse] = js.native
    def getVariantImportJob(params: GetVariantImportRequest): Request[GetVariantImportResponse] = js.native
    def getVariantStore(params: GetVariantStoreRequest): Request[GetVariantStoreResponse] = js.native
    def getWorkflow(params: GetWorkflowRequest): Request[GetWorkflowResponse] = js.native
    def listAnnotationImportJobs(params: ListAnnotationImportJobsRequest): Request[ListAnnotationImportJobsResponse] = js.native
    def listAnnotationStores(params: ListAnnotationStoresRequest): Request[ListAnnotationStoresResponse] = js.native
    def listReadSetActivationJobs(params: ListReadSetActivationJobsRequest): Request[ListReadSetActivationJobsResponse] = js.native
    def listReadSetExportJobs(params: ListReadSetExportJobsRequest): Request[ListReadSetExportJobsResponse] = js.native
    def listReadSetImportJobs(params: ListReadSetImportJobsRequest): Request[ListReadSetImportJobsResponse] = js.native
    def listReadSets(params: ListReadSetsRequest): Request[ListReadSetsResponse] = js.native
    def listReferenceImportJobs(params: ListReferenceImportJobsRequest): Request[ListReferenceImportJobsResponse] = js.native
    def listReferenceStores(params: ListReferenceStoresRequest): Request[ListReferenceStoresResponse] = js.native
    def listReferences(params: ListReferencesRequest): Request[ListReferencesResponse] = js.native
    def listRunGroups(params: ListRunGroupsRequest): Request[ListRunGroupsResponse] = js.native
    def listRunTasks(params: ListRunTasksRequest): Request[ListRunTasksResponse] = js.native
    def listRuns(params: ListRunsRequest): Request[ListRunsResponse] = js.native
    def listSequenceStores(params: ListSequenceStoresRequest): Request[ListSequenceStoresResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listVariantImportJobs(params: ListVariantImportJobsRequest): Request[ListVariantImportJobsResponse] = js.native
    def listVariantStores(params: ListVariantStoresRequest): Request[ListVariantStoresResponse] = js.native
    def listWorkflows(params: ListWorkflowsRequest): Request[ListWorkflowsResponse] = js.native
    def startAnnotationImportJob(params: StartAnnotationImportRequest): Request[StartAnnotationImportResponse] = js.native
    def startReadSetActivationJob(params: StartReadSetActivationJobRequest): Request[StartReadSetActivationJobResponse] = js.native
    def startReadSetExportJob(params: StartReadSetExportJobRequest): Request[StartReadSetExportJobResponse] = js.native
    def startReadSetImportJob(params: StartReadSetImportJobRequest): Request[StartReadSetImportJobResponse] = js.native
    def startReferenceImportJob(params: StartReferenceImportJobRequest): Request[StartReferenceImportJobResponse] = js.native
    def startRun(params: StartRunRequest): Request[StartRunResponse] = js.native
    def startVariantImportJob(params: StartVariantImportRequest): Request[StartVariantImportResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAnnotationStore(params: UpdateAnnotationStoreRequest): Request[UpdateAnnotationStoreResponse] = js.native
    def updateRunGroup(params: UpdateRunGroupRequest): Request[js.Object] = js.native
    def updateVariantStore(params: UpdateVariantStoreRequest): Request[UpdateVariantStoreResponse] = js.native
    def updateWorkflow(params: UpdateWorkflowRequest): Request[js.Object] = js.native
  }
  object Omics {
    @inline implicit def toOps(service: Omics): OmicsOps = {
      new OmicsOps(service)
    }
  }

  /** A read set activation job filter.
    */
  @js.native
  trait ActivateReadSetFilter extends js.Object {
    var createdAfter: js.UndefOr[SyntheticTimestamp_date_time]
    var createdBefore: js.UndefOr[SyntheticTimestamp_date_time]
    var status: js.UndefOr[ReadSetActivationJobStatus]
  }

  object ActivateReadSetFilter {
    @inline
    def apply(
        createdAfter: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        createdBefore: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        status: js.UndefOr[ReadSetActivationJobStatus] = js.undefined
    ): ActivateReadSetFilter = {
      val __obj = js.Dynamic.literal()
      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateReadSetFilter]
    }
  }

  /** A read set activation job.
    */
  @js.native
  trait ActivateReadSetJobItem extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var id: ActivationJobId
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetActivationJobStatus
    var completionTime: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object ActivateReadSetJobItem {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        id: ActivationJobId,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetActivationJobStatus,
        completionTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): ActivateReadSetJobItem = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateReadSetJobItem]
    }
  }

  /** A source for a read set activation job.
    */
  @js.native
  trait ActivateReadSetSourceItem extends js.Object {
    var readSetId: ReadSetId
    var status: ReadSetActivationJobItemStatus
    var statusMessage: js.UndefOr[JobStatusMessage]
  }

  object ActivateReadSetSourceItem {
    @inline
    def apply(
        readSetId: ReadSetId,
        status: ReadSetActivationJobItemStatus,
        statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
    ): ActivateReadSetSourceItem = {
      val __obj = js.Dynamic.literal(
        "readSetId" -> readSetId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActivateReadSetSourceItem]
    }
  }

  /** Details about an imported annotation item.
    */
  @js.native
  trait AnnotationImportItemDetail extends js.Object {
    var jobStatus: JobStatus
    var source: S3Uri
  }

  object AnnotationImportItemDetail {
    @inline
    def apply(
        jobStatus: JobStatus,
        source: S3Uri
    ): AnnotationImportItemDetail = {
      val __obj = js.Dynamic.literal(
        "jobStatus" -> jobStatus.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnnotationImportItemDetail]
    }
  }

  /** A source for an annotation import job.
    */
  @js.native
  trait AnnotationImportItemSource extends js.Object {
    var source: S3Uri
  }

  object AnnotationImportItemSource {
    @inline
    def apply(
        source: S3Uri
    ): AnnotationImportItemSource = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnnotationImportItemSource]
    }
  }

  /** An annotation import job.
    */
  @js.native
  trait AnnotationImportJobItem extends js.Object {
    var creationTime: CreationTime
    var destinationName: String
    var id: String
    var roleArn: Arn
    var status: JobStatus
    var updateTime: UpdateTime
    var completionTime: js.UndefOr[CompletionTime]
    var runLeftNormalization: js.UndefOr[RunLeftNormalization]
  }

  object AnnotationImportJobItem {
    @inline
    def apply(
        creationTime: CreationTime,
        destinationName: String,
        id: String,
        roleArn: Arn,
        status: JobStatus,
        updateTime: UpdateTime,
        completionTime: js.UndefOr[CompletionTime] = js.undefined,
        runLeftNormalization: js.UndefOr[RunLeftNormalization] = js.undefined
    ): AnnotationImportJobItem = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "destinationName" -> destinationName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      runLeftNormalization.foreach(__v => __obj.updateDynamic("runLeftNormalization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnnotationImportJobItem]
    }
  }

  /** An annotation store.
    */
  @js.native
  trait AnnotationStoreItem extends js.Object {
    var creationTime: CreationTime
    var description: StoreDescription
    var id: ResourceId
    var name: String
    var reference: ReferenceItem
    var sseConfig: SseConfig
    var status: StoreStatus
    var statusMessage: StatusMessage
    var storeArn: Arn
    var storeFormat: StoreFormat
    var storeSizeBytes: Double
    var updateTime: UpdateTime
  }

  object AnnotationStoreItem {
    @inline
    def apply(
        creationTime: CreationTime,
        description: StoreDescription,
        id: ResourceId,
        name: String,
        reference: ReferenceItem,
        sseConfig: SseConfig,
        status: StoreStatus,
        statusMessage: StatusMessage,
        storeArn: Arn,
        storeFormat: StoreFormat,
        storeSizeBytes: Double,
        updateTime: UpdateTime
    ): AnnotationStoreItem = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "reference" -> reference.asInstanceOf[js.Any],
        "sseConfig" -> sseConfig.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "statusMessage" -> statusMessage.asInstanceOf[js.Any],
        "storeArn" -> storeArn.asInstanceOf[js.Any],
        "storeFormat" -> storeFormat.asInstanceOf[js.Any],
        "storeSizeBytes" -> storeSizeBytes.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnnotationStoreItem]
    }
  }

  @js.native
  trait BatchDeleteReadSetRequest extends js.Object {
    var ids: ReadSetIdList
    var sequenceStoreId: SequenceStoreId
  }

  object BatchDeleteReadSetRequest {
    @inline
    def apply(
        ids: ReadSetIdList,
        sequenceStoreId: SequenceStoreId
    ): BatchDeleteReadSetRequest = {
      val __obj = js.Dynamic.literal(
        "ids" -> ids.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeleteReadSetRequest]
    }
  }

  @js.native
  trait BatchDeleteReadSetResponse extends js.Object {
    var errors: js.UndefOr[ReadSetBatchErrorList]
  }

  object BatchDeleteReadSetResponse {
    @inline
    def apply(
        errors: js.UndefOr[ReadSetBatchErrorList] = js.undefined
    ): BatchDeleteReadSetResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeleteReadSetResponse]
    }
  }

  @js.native
  trait CancelAnnotationImportRequest extends js.Object {
    var jobId: ResourceId
  }

  object CancelAnnotationImportRequest {
    @inline
    def apply(
        jobId: ResourceId
    ): CancelAnnotationImportRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelAnnotationImportRequest]
    }
  }

  @js.native
  trait CancelAnnotationImportResponse extends js.Object

  object CancelAnnotationImportResponse {
    @inline
    def apply(): CancelAnnotationImportResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelAnnotationImportResponse]
    }
  }

  @js.native
  trait CancelRunRequest extends js.Object {
    var id: RunId
  }

  object CancelRunRequest {
    @inline
    def apply(
        id: RunId
    ): CancelRunRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelRunRequest]
    }
  }

  @js.native
  trait CancelVariantImportRequest extends js.Object {
    var jobId: ResourceId
  }

  object CancelVariantImportRequest {
    @inline
    def apply(
        jobId: ResourceId
    ): CancelVariantImportRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelVariantImportRequest]
    }
  }

  @js.native
  trait CancelVariantImportResponse extends js.Object

  object CancelVariantImportResponse {
    @inline
    def apply(): CancelVariantImportResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelVariantImportResponse]
    }
  }

  @js.native
  trait CreateAnnotationStoreRequest extends js.Object {
    var storeFormat: StoreFormat
    var description: js.UndefOr[StoreDescription]
    var name: js.UndefOr[CreateAnnotationStoreRequestNameString]
    var reference: js.UndefOr[ReferenceItem]
    var sseConfig: js.UndefOr[SseConfig]
    var storeOptions: js.UndefOr[StoreOptions]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAnnotationStoreRequest {
    @inline
    def apply(
        storeFormat: StoreFormat,
        description: js.UndefOr[StoreDescription] = js.undefined,
        name: js.UndefOr[CreateAnnotationStoreRequestNameString] = js.undefined,
        reference: js.UndefOr[ReferenceItem] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined,
        storeOptions: js.UndefOr[StoreOptions] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAnnotationStoreRequest = {
      val __obj = js.Dynamic.literal(
        "storeFormat" -> storeFormat.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      reference.foreach(__v => __obj.updateDynamic("reference")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      storeOptions.foreach(__v => __obj.updateDynamic("storeOptions")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAnnotationStoreRequest]
    }
  }

  @js.native
  trait CreateAnnotationStoreResponse extends js.Object {
    var creationTime: CreationTime
    var id: ResourceId
    var name: String
    var status: StoreStatus
    var reference: js.UndefOr[ReferenceItem]
    var storeFormat: js.UndefOr[StoreFormat]
    var storeOptions: js.UndefOr[StoreOptions]
  }

  object CreateAnnotationStoreResponse {
    @inline
    def apply(
        creationTime: CreationTime,
        id: ResourceId,
        name: String,
        status: StoreStatus,
        reference: js.UndefOr[ReferenceItem] = js.undefined,
        storeFormat: js.UndefOr[StoreFormat] = js.undefined,
        storeOptions: js.UndefOr[StoreOptions] = js.undefined
    ): CreateAnnotationStoreResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      reference.foreach(__v => __obj.updateDynamic("reference")(__v.asInstanceOf[js.Any]))
      storeFormat.foreach(__v => __obj.updateDynamic("storeFormat")(__v.asInstanceOf[js.Any]))
      storeOptions.foreach(__v => __obj.updateDynamic("storeOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAnnotationStoreResponse]
    }
  }

  @js.native
  trait CreateReferenceStoreRequest extends js.Object {
    var name: ReferenceStoreName
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[ReferenceStoreDescription]
    var sseConfig: js.UndefOr[SseConfig]
    var tags: js.UndefOr[TagMap]
  }

  object CreateReferenceStoreRequest {
    @inline
    def apply(
        name: ReferenceStoreName,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[ReferenceStoreDescription] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateReferenceStoreRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReferenceStoreRequest]
    }
  }

  @js.native
  trait CreateReferenceStoreResponse extends js.Object {
    var arn: ReferenceStoreArn
    var creationTime: SyntheticTimestamp_date_time
    var id: ReferenceStoreId
    var description: js.UndefOr[ReferenceStoreDescription]
    var name: js.UndefOr[ReferenceStoreName]
    var sseConfig: js.UndefOr[SseConfig]
  }

  object CreateReferenceStoreResponse {
    @inline
    def apply(
        arn: ReferenceStoreArn,
        creationTime: SyntheticTimestamp_date_time,
        id: ReferenceStoreId,
        description: js.UndefOr[ReferenceStoreDescription] = js.undefined,
        name: js.UndefOr[ReferenceStoreName] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined
    ): CreateReferenceStoreResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateReferenceStoreResponse]
    }
  }

  @js.native
  trait CreateRunGroupRequest extends js.Object {
    var requestId: RunGroupRequestId
    var maxCpus: js.UndefOr[CreateRunGroupRequestMaxCpusInteger]
    var maxDuration: js.UndefOr[CreateRunGroupRequestMaxDurationInteger]
    var maxRuns: js.UndefOr[CreateRunGroupRequestMaxRunsInteger]
    var name: js.UndefOr[RunGroupName]
    var tags: js.UndefOr[TagMap]
  }

  object CreateRunGroupRequest {
    @inline
    def apply(
        requestId: RunGroupRequestId,
        maxCpus: js.UndefOr[CreateRunGroupRequestMaxCpusInteger] = js.undefined,
        maxDuration: js.UndefOr[CreateRunGroupRequestMaxDurationInteger] = js.undefined,
        maxRuns: js.UndefOr[CreateRunGroupRequestMaxRunsInteger] = js.undefined,
        name: js.UndefOr[RunGroupName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRunGroupRequest = {
      val __obj = js.Dynamic.literal(
        "requestId" -> requestId.asInstanceOf[js.Any]
      )

      maxCpus.foreach(__v => __obj.updateDynamic("maxCpus")(__v.asInstanceOf[js.Any]))
      maxDuration.foreach(__v => __obj.updateDynamic("maxDuration")(__v.asInstanceOf[js.Any]))
      maxRuns.foreach(__v => __obj.updateDynamic("maxRuns")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRunGroupRequest]
    }
  }

  @js.native
  trait CreateRunGroupResponse extends js.Object {
    var arn: js.UndefOr[RunGroupArn]
    var id: js.UndefOr[RunGroupId]
    var tags: js.UndefOr[TagMap]
  }

  object CreateRunGroupResponse {
    @inline
    def apply(
        arn: js.UndefOr[RunGroupArn] = js.undefined,
        id: js.UndefOr[RunGroupId] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateRunGroupResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRunGroupResponse]
    }
  }

  @js.native
  trait CreateSequenceStoreRequest extends js.Object {
    var name: SequenceStoreName
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[SequenceStoreDescription]
    var sseConfig: js.UndefOr[SseConfig]
    var tags: js.UndefOr[TagMap]
  }

  object CreateSequenceStoreRequest {
    @inline
    def apply(
        name: SequenceStoreName,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[SequenceStoreDescription] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateSequenceStoreRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSequenceStoreRequest]
    }
  }

  @js.native
  trait CreateSequenceStoreResponse extends js.Object {
    var arn: SequenceStoreArn
    var creationTime: SyntheticTimestamp_date_time
    var id: SequenceStoreId
    var description: js.UndefOr[SequenceStoreDescription]
    var name: js.UndefOr[SequenceStoreName]
    var sseConfig: js.UndefOr[SseConfig]
  }

  object CreateSequenceStoreResponse {
    @inline
    def apply(
        arn: SequenceStoreArn,
        creationTime: SyntheticTimestamp_date_time,
        id: SequenceStoreId,
        description: js.UndefOr[SequenceStoreDescription] = js.undefined,
        name: js.UndefOr[SequenceStoreName] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined
    ): CreateSequenceStoreResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSequenceStoreResponse]
    }
  }

  @js.native
  trait CreateVariantStoreRequest extends js.Object {
    var reference: ReferenceItem
    var description: js.UndefOr[StoreDescription]
    var name: js.UndefOr[CreateVariantStoreRequestNameString]
    var sseConfig: js.UndefOr[SseConfig]
    var tags: js.UndefOr[TagMap]
  }

  object CreateVariantStoreRequest {
    @inline
    def apply(
        reference: ReferenceItem,
        description: js.UndefOr[StoreDescription] = js.undefined,
        name: js.UndefOr[CreateVariantStoreRequestNameString] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateVariantStoreRequest = {
      val __obj = js.Dynamic.literal(
        "reference" -> reference.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVariantStoreRequest]
    }
  }

  @js.native
  trait CreateVariantStoreResponse extends js.Object {
    var creationTime: CreationTime
    var id: ResourceId
    var name: String
    var status: StoreStatus
    var reference: js.UndefOr[ReferenceItem]
  }

  object CreateVariantStoreResponse {
    @inline
    def apply(
        creationTime: CreationTime,
        id: ResourceId,
        name: String,
        status: StoreStatus,
        reference: js.UndefOr[ReferenceItem] = js.undefined
    ): CreateVariantStoreResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      reference.foreach(__v => __obj.updateDynamic("reference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVariantStoreResponse]
    }
  }

  @js.native
  trait CreateWorkflowRequest extends js.Object {
    var requestId: WorkflowRequestId
    var definitionUri: js.UndefOr[WorkflowDefinition]
    var definitionZip: js.UndefOr[Blob]
    var description: js.UndefOr[WorkflowDescription]
    var engine: js.UndefOr[WorkflowEngine]
    var main: js.UndefOr[WorkflowMain]
    var name: js.UndefOr[WorkflowName]
    var parameterTemplate: js.UndefOr[WorkflowParameterTemplate]
    var storageCapacity: js.UndefOr[CreateWorkflowRequestStorageCapacityInteger]
    var tags: js.UndefOr[TagMap]
  }

  object CreateWorkflowRequest {
    @inline
    def apply(
        requestId: WorkflowRequestId,
        definitionUri: js.UndefOr[WorkflowDefinition] = js.undefined,
        definitionZip: js.UndefOr[Blob] = js.undefined,
        description: js.UndefOr[WorkflowDescription] = js.undefined,
        engine: js.UndefOr[WorkflowEngine] = js.undefined,
        main: js.UndefOr[WorkflowMain] = js.undefined,
        name: js.UndefOr[WorkflowName] = js.undefined,
        parameterTemplate: js.UndefOr[WorkflowParameterTemplate] = js.undefined,
        storageCapacity: js.UndefOr[CreateWorkflowRequestStorageCapacityInteger] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "requestId" -> requestId.asInstanceOf[js.Any]
      )

      definitionUri.foreach(__v => __obj.updateDynamic("definitionUri")(__v.asInstanceOf[js.Any]))
      definitionZip.foreach(__v => __obj.updateDynamic("definitionZip")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      engine.foreach(__v => __obj.updateDynamic("engine")(__v.asInstanceOf[js.Any]))
      main.foreach(__v => __obj.updateDynamic("main")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      parameterTemplate.foreach(__v => __obj.updateDynamic("parameterTemplate")(__v.asInstanceOf[js.Any]))
      storageCapacity.foreach(__v => __obj.updateDynamic("storageCapacity")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkflowRequest]
    }
  }

  @js.native
  trait CreateWorkflowResponse extends js.Object {
    var arn: js.UndefOr[WorkflowArn]
    var id: js.UndefOr[WorkflowId]
    var status: js.UndefOr[WorkflowStatus]
    var tags: js.UndefOr[TagMap]
  }

  object CreateWorkflowResponse {
    @inline
    def apply(
        arn: js.UndefOr[WorkflowArn] = js.undefined,
        id: js.UndefOr[WorkflowId] = js.undefined,
        status: js.UndefOr[WorkflowStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkflowResponse]
    }
  }

  @js.native
  trait DeleteAnnotationStoreRequest extends js.Object {
    var name: String
    var force: js.UndefOr[PrimitiveBoolean]
  }

  object DeleteAnnotationStoreRequest {
    @inline
    def apply(
        name: String,
        force: js.UndefOr[PrimitiveBoolean] = js.undefined
    ): DeleteAnnotationStoreRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAnnotationStoreRequest]
    }
  }

  @js.native
  trait DeleteAnnotationStoreResponse extends js.Object {
    var status: StoreStatus
  }

  object DeleteAnnotationStoreResponse {
    @inline
    def apply(
        status: StoreStatus
    ): DeleteAnnotationStoreResponse = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAnnotationStoreResponse]
    }
  }

  @js.native
  trait DeleteReferenceRequest extends js.Object {
    var id: ReferenceId
    var referenceStoreId: ReferenceStoreId
  }

  object DeleteReferenceRequest {
    @inline
    def apply(
        id: ReferenceId,
        referenceStoreId: ReferenceStoreId
    ): DeleteReferenceRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReferenceRequest]
    }
  }

  @js.native
  trait DeleteReferenceResponse extends js.Object

  object DeleteReferenceResponse {
    @inline
    def apply(): DeleteReferenceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteReferenceResponse]
    }
  }

  @js.native
  trait DeleteReferenceStoreRequest extends js.Object {
    var id: ReferenceStoreId
  }

  object DeleteReferenceStoreRequest {
    @inline
    def apply(
        id: ReferenceStoreId
    ): DeleteReferenceStoreRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteReferenceStoreRequest]
    }
  }

  @js.native
  trait DeleteReferenceStoreResponse extends js.Object

  object DeleteReferenceStoreResponse {
    @inline
    def apply(): DeleteReferenceStoreResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteReferenceStoreResponse]
    }
  }

  @js.native
  trait DeleteRunGroupRequest extends js.Object {
    var id: RunGroupId
  }

  object DeleteRunGroupRequest {
    @inline
    def apply(
        id: RunGroupId
    ): DeleteRunGroupRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRunGroupRequest]
    }
  }

  @js.native
  trait DeleteRunRequest extends js.Object {
    var id: RunId
  }

  object DeleteRunRequest {
    @inline
    def apply(
        id: RunId
    ): DeleteRunRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRunRequest]
    }
  }

  @js.native
  trait DeleteSequenceStoreRequest extends js.Object {
    var id: SequenceStoreId
  }

  object DeleteSequenceStoreRequest {
    @inline
    def apply(
        id: SequenceStoreId
    ): DeleteSequenceStoreRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSequenceStoreRequest]
    }
  }

  @js.native
  trait DeleteSequenceStoreResponse extends js.Object

  object DeleteSequenceStoreResponse {
    @inline
    def apply(): DeleteSequenceStoreResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSequenceStoreResponse]
    }
  }

  @js.native
  trait DeleteVariantStoreRequest extends js.Object {
    var name: String
    var force: js.UndefOr[PrimitiveBoolean]
  }

  object DeleteVariantStoreRequest {
    @inline
    def apply(
        name: String,
        force: js.UndefOr[PrimitiveBoolean] = js.undefined
    ): DeleteVariantStoreRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      force.foreach(__v => __obj.updateDynamic("force")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVariantStoreRequest]
    }
  }

  @js.native
  trait DeleteVariantStoreResponse extends js.Object {
    var status: StoreStatus
  }

  object DeleteVariantStoreResponse {
    @inline
    def apply(
        status: StoreStatus
    ): DeleteVariantStoreResponse = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVariantStoreResponse]
    }
  }

  @js.native
  trait DeleteWorkflowRequest extends js.Object {
    var id: WorkflowId
  }

  object DeleteWorkflowRequest {
    @inline
    def apply(
        id: WorkflowId
    ): DeleteWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkflowRequest]
    }
  }

  /** A read set.
    */
  @js.native
  trait ExportReadSet extends js.Object {
    var readSetId: ReadSetId
  }

  object ExportReadSet {
    @inline
    def apply(
        readSetId: ReadSetId
    ): ExportReadSet = {
      val __obj = js.Dynamic.literal(
        "readSetId" -> readSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportReadSet]
    }
  }

  /** Details about a read set.
    */
  @js.native
  trait ExportReadSetDetail extends js.Object {
    var id: ReadSetId
    var status: ReadSetExportJobItemStatus
    var statusMessage: js.UndefOr[JobStatusMessage]
  }

  object ExportReadSetDetail {
    @inline
    def apply(
        id: ReadSetId,
        status: ReadSetExportJobItemStatus,
        statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
    ): ExportReadSetDetail = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportReadSetDetail]
    }
  }

  /** An read set export job filter.
    */
  @js.native
  trait ExportReadSetFilter extends js.Object {
    var createdAfter: js.UndefOr[SyntheticTimestamp_date_time]
    var createdBefore: js.UndefOr[SyntheticTimestamp_date_time]
    var status: js.UndefOr[ReadSetExportJobStatus]
  }

  object ExportReadSetFilter {
    @inline
    def apply(
        createdAfter: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        createdBefore: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        status: js.UndefOr[ReadSetExportJobStatus] = js.undefined
    ): ExportReadSetFilter = {
      val __obj = js.Dynamic.literal()
      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportReadSetFilter]
    }
  }

  /** Details about a read set export job.
    */
  @js.native
  trait ExportReadSetJobDetail extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var destination: S3Destination
    var id: ExportJobId
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetExportJobStatus
    var completionTime: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object ExportReadSetJobDetail {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        destination: S3Destination,
        id: ExportJobId,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetExportJobStatus,
        completionTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): ExportReadSetJobDetail = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "destination" -> destination.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportReadSetJobDetail]
    }
  }

  /** Details about a file.
    */
  @js.native
  trait FileInformation extends js.Object {
    var contentLength: js.UndefOr[FileInformationContentLengthLong]
    var partSize: js.UndefOr[FileInformationPartSizeLong]
    var totalParts: js.UndefOr[FileInformationTotalPartsInteger]
  }

  object FileInformation {
    @inline
    def apply(
        contentLength: js.UndefOr[FileInformationContentLengthLong] = js.undefined,
        partSize: js.UndefOr[FileInformationPartSizeLong] = js.undefined,
        totalParts: js.UndefOr[FileInformationTotalPartsInteger] = js.undefined
    ): FileInformation = {
      val __obj = js.Dynamic.literal()
      contentLength.foreach(__v => __obj.updateDynamic("contentLength")(__v.asInstanceOf[js.Any]))
      partSize.foreach(__v => __obj.updateDynamic("partSize")(__v.asInstanceOf[js.Any]))
      totalParts.foreach(__v => __obj.updateDynamic("totalParts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FileInformation]
    }
  }

  /** Formatting options for a file.
    */
  @js.native
  trait FormatOptions extends js.Object {
    var tsvOptions: js.UndefOr[TsvOptions]
    var vcfOptions: js.UndefOr[VcfOptions]
  }

  object FormatOptions {
    @inline
    def apply(
        tsvOptions: js.UndefOr[TsvOptions] = js.undefined,
        vcfOptions: js.UndefOr[VcfOptions] = js.undefined
    ): FormatOptions = {
      val __obj = js.Dynamic.literal()
      tsvOptions.foreach(__v => __obj.updateDynamic("tsvOptions")(__v.asInstanceOf[js.Any]))
      vcfOptions.foreach(__v => __obj.updateDynamic("vcfOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FormatOptions]
    }
  }

  @js.native
  trait GetAnnotationImportRequest extends js.Object {
    var jobId: ResourceId
  }

  object GetAnnotationImportRequest {
    @inline
    def apply(
        jobId: ResourceId
    ): GetAnnotationImportRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAnnotationImportRequest]
    }
  }

  @js.native
  trait GetAnnotationImportResponse extends js.Object {
    var completionTime: CompletionTime
    var creationTime: CreationTime
    var destinationName: StoreName
    var formatOptions: FormatOptions
    var id: ResourceId
    var items: AnnotationImportItemDetails
    var roleArn: Arn
    var runLeftNormalization: RunLeftNormalization
    var status: JobStatus
    var statusMessage: JobStatusMsg
    var updateTime: UpdateTime
  }

  object GetAnnotationImportResponse {
    @inline
    def apply(
        completionTime: CompletionTime,
        creationTime: CreationTime,
        destinationName: StoreName,
        formatOptions: FormatOptions,
        id: ResourceId,
        items: AnnotationImportItemDetails,
        roleArn: Arn,
        runLeftNormalization: RunLeftNormalization,
        status: JobStatus,
        statusMessage: JobStatusMsg,
        updateTime: UpdateTime
    ): GetAnnotationImportResponse = {
      val __obj = js.Dynamic.literal(
        "completionTime" -> completionTime.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "destinationName" -> destinationName.asInstanceOf[js.Any],
        "formatOptions" -> formatOptions.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "items" -> items.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "runLeftNormalization" -> runLeftNormalization.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "statusMessage" -> statusMessage.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAnnotationImportResponse]
    }
  }

  @js.native
  trait GetAnnotationStoreRequest extends js.Object {
    var name: String
  }

  object GetAnnotationStoreRequest {
    @inline
    def apply(
        name: String
    ): GetAnnotationStoreRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAnnotationStoreRequest]
    }
  }

  @js.native
  trait GetAnnotationStoreResponse extends js.Object {
    var creationTime: CreationTime
    var description: StoreDescription
    var id: ResourceId
    var name: String
    var reference: ReferenceItem
    var sseConfig: SseConfig
    var status: StoreStatus
    var statusMessage: StatusMessage
    var storeArn: Arn
    var storeSizeBytes: Double
    var tags: TagMap
    var updateTime: UpdateTime
    var storeFormat: js.UndefOr[StoreFormat]
    var storeOptions: js.UndefOr[StoreOptions]
  }

  object GetAnnotationStoreResponse {
    @inline
    def apply(
        creationTime: CreationTime,
        description: StoreDescription,
        id: ResourceId,
        name: String,
        reference: ReferenceItem,
        sseConfig: SseConfig,
        status: StoreStatus,
        statusMessage: StatusMessage,
        storeArn: Arn,
        storeSizeBytes: Double,
        tags: TagMap,
        updateTime: UpdateTime,
        storeFormat: js.UndefOr[StoreFormat] = js.undefined,
        storeOptions: js.UndefOr[StoreOptions] = js.undefined
    ): GetAnnotationStoreResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "reference" -> reference.asInstanceOf[js.Any],
        "sseConfig" -> sseConfig.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "statusMessage" -> statusMessage.asInstanceOf[js.Any],
        "storeArn" -> storeArn.asInstanceOf[js.Any],
        "storeSizeBytes" -> storeSizeBytes.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      storeFormat.foreach(__v => __obj.updateDynamic("storeFormat")(__v.asInstanceOf[js.Any]))
      storeOptions.foreach(__v => __obj.updateDynamic("storeOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAnnotationStoreResponse]
    }
  }

  @js.native
  trait GetReadSetActivationJobRequest extends js.Object {
    var id: ActivationJobId
    var sequenceStoreId: SequenceStoreId
  }

  object GetReadSetActivationJobRequest {
    @inline
    def apply(
        id: ActivationJobId,
        sequenceStoreId: SequenceStoreId
    ): GetReadSetActivationJobRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReadSetActivationJobRequest]
    }
  }

  @js.native
  trait GetReadSetActivationJobResponse extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var id: ActivationJobId
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetActivationJobStatus
    var completionTime: js.UndefOr[SyntheticTimestamp_date_time]
    var sources: js.UndefOr[ActivateReadSetSourceList]
    var statusMessage: js.UndefOr[JobStatusMessage]
  }

  object GetReadSetActivationJobResponse {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        id: ActivationJobId,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetActivationJobStatus,
        completionTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        sources: js.UndefOr[ActivateReadSetSourceList] = js.undefined,
        statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
    ): GetReadSetActivationJobResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      sources.foreach(__v => __obj.updateDynamic("sources")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadSetActivationJobResponse]
    }
  }

  @js.native
  trait GetReadSetExportJobRequest extends js.Object {
    var id: ExportJobId
    var sequenceStoreId: SequenceStoreId
  }

  object GetReadSetExportJobRequest {
    @inline
    def apply(
        id: ExportJobId,
        sequenceStoreId: SequenceStoreId
    ): GetReadSetExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReadSetExportJobRequest]
    }
  }

  @js.native
  trait GetReadSetExportJobResponse extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var destination: S3Destination
    var id: ExportJobId
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetExportJobStatus
    var completionTime: js.UndefOr[SyntheticTimestamp_date_time]
    var readSets: js.UndefOr[ExportReadSetDetailList]
    var statusMessage: js.UndefOr[JobStatusMessage]
  }

  object GetReadSetExportJobResponse {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        destination: S3Destination,
        id: ExportJobId,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetExportJobStatus,
        completionTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        readSets: js.UndefOr[ExportReadSetDetailList] = js.undefined,
        statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
    ): GetReadSetExportJobResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "destination" -> destination.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      readSets.foreach(__v => __obj.updateDynamic("readSets")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadSetExportJobResponse]
    }
  }

  @js.native
  trait GetReadSetImportJobRequest extends js.Object {
    var id: ImportJobId
    var sequenceStoreId: SequenceStoreId
  }

  object GetReadSetImportJobRequest {
    @inline
    def apply(
        id: ImportJobId,
        sequenceStoreId: SequenceStoreId
    ): GetReadSetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReadSetImportJobRequest]
    }
  }

  @js.native
  trait GetReadSetImportJobResponse extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var id: ImportJobId
    var roleArn: RoleArn
    var sequenceStoreId: SequenceStoreId
    var sources: ImportReadSetSourceList
    var status: ReadSetImportJobStatus
    var completionTime: js.UndefOr[SyntheticTimestamp_date_time]
    var statusMessage: js.UndefOr[JobStatusMessage]
  }

  object GetReadSetImportJobResponse {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        id: ImportJobId,
        roleArn: RoleArn,
        sequenceStoreId: SequenceStoreId,
        sources: ImportReadSetSourceList,
        status: ReadSetImportJobStatus,
        completionTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
    ): GetReadSetImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadSetImportJobResponse]
    }
  }

  @js.native
  trait GetReadSetMetadataRequest extends js.Object {
    var id: ReadSetId
    var sequenceStoreId: SequenceStoreId
  }

  object GetReadSetMetadataRequest {
    @inline
    def apply(
        id: ReadSetId,
        sequenceStoreId: SequenceStoreId
    ): GetReadSetMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReadSetMetadataRequest]
    }
  }

  @js.native
  trait GetReadSetMetadataResponse extends js.Object {
    var arn: ReadSetArn
    var creationTime: SyntheticTimestamp_date_time
    var fileType: FileType
    var id: ReadSetId
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetStatus
    var description: js.UndefOr[ReadSetDescription]
    var files: js.UndefOr[ReadSetFiles]
    var name: js.UndefOr[ReadSetName]
    var referenceArn: js.UndefOr[ReferenceArn]
    var sampleId: js.UndefOr[SampleId]
    var sequenceInformation: js.UndefOr[SequenceInformation]
    var subjectId: js.UndefOr[SubjectId]
  }

  object GetReadSetMetadataResponse {
    @inline
    def apply(
        arn: ReadSetArn,
        creationTime: SyntheticTimestamp_date_time,
        fileType: FileType,
        id: ReadSetId,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetStatus,
        description: js.UndefOr[ReadSetDescription] = js.undefined,
        files: js.UndefOr[ReadSetFiles] = js.undefined,
        name: js.UndefOr[ReadSetName] = js.undefined,
        referenceArn: js.UndefOr[ReferenceArn] = js.undefined,
        sampleId: js.UndefOr[SampleId] = js.undefined,
        sequenceInformation: js.UndefOr[SequenceInformation] = js.undefined,
        subjectId: js.UndefOr[SubjectId] = js.undefined
    ): GetReadSetMetadataResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "fileType" -> fileType.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      files.foreach(__v => __obj.updateDynamic("files")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      referenceArn.foreach(__v => __obj.updateDynamic("referenceArn")(__v.asInstanceOf[js.Any]))
      sampleId.foreach(__v => __obj.updateDynamic("sampleId")(__v.asInstanceOf[js.Any]))
      sequenceInformation.foreach(__v => __obj.updateDynamic("sequenceInformation")(__v.asInstanceOf[js.Any]))
      subjectId.foreach(__v => __obj.updateDynamic("subjectId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadSetMetadataResponse]
    }
  }

  @js.native
  trait GetReadSetRequest extends js.Object {
    var id: ReadSetId
    var partNumber: GetReadSetRequestPartNumberInteger
    var sequenceStoreId: SequenceStoreId
    var file: js.UndefOr[ReadSetFile]
  }

  object GetReadSetRequest {
    @inline
    def apply(
        id: ReadSetId,
        partNumber: GetReadSetRequestPartNumberInteger,
        sequenceStoreId: SequenceStoreId,
        file: js.UndefOr[ReadSetFile] = js.undefined
    ): GetReadSetRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "partNumber" -> partNumber.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )

      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadSetRequest]
    }
  }

  @js.native
  trait GetReadSetResponse extends js.Object {
    var payload: js.UndefOr[ReadSetStreamingBlob]
  }

  object GetReadSetResponse {
    @inline
    def apply(
        payload: js.UndefOr[ReadSetStreamingBlob] = js.undefined
    ): GetReadSetResponse = {
      val __obj = js.Dynamic.literal()
      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReadSetResponse]
    }
  }

  @js.native
  trait GetReferenceImportJobRequest extends js.Object {
    var id: ImportJobId
    var referenceStoreId: ReferenceStoreId
  }

  object GetReferenceImportJobRequest {
    @inline
    def apply(
        id: ImportJobId,
        referenceStoreId: ReferenceStoreId
    ): GetReferenceImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReferenceImportJobRequest]
    }
  }

  @js.native
  trait GetReferenceImportJobResponse extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var id: ImportJobId
    var referenceStoreId: ReferenceStoreId
    var roleArn: RoleArn
    var sources: ImportReferenceSourceList
    var status: ReferenceImportJobStatus
    var completionTime: js.UndefOr[SyntheticTimestamp_date_time]
    var statusMessage: js.UndefOr[JobStatusMessage]
  }

  object GetReferenceImportJobResponse {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        id: ImportJobId,
        referenceStoreId: ReferenceStoreId,
        roleArn: RoleArn,
        sources: ImportReferenceSourceList,
        status: ReferenceImportJobStatus,
        completionTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        statusMessage: js.UndefOr[JobStatusMessage] = js.undefined
    ): GetReferenceImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReferenceImportJobResponse]
    }
  }

  @js.native
  trait GetReferenceMetadataRequest extends js.Object {
    var id: ReferenceId
    var referenceStoreId: ReferenceStoreId
  }

  object GetReferenceMetadataRequest {
    @inline
    def apply(
        id: ReferenceId,
        referenceStoreId: ReferenceStoreId
    ): GetReferenceMetadataRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReferenceMetadataRequest]
    }
  }

  @js.native
  trait GetReferenceMetadataResponse extends js.Object {
    var arn: ReferenceArn
    var creationTime: SyntheticTimestamp_date_time
    var id: ReferenceId
    var md5: Md5
    var referenceStoreId: ReferenceStoreId
    var updateTime: SyntheticTimestamp_date_time
    var description: js.UndefOr[ReferenceDescription]
    var files: js.UndefOr[ReferenceFiles]
    var name: js.UndefOr[ReferenceName]
    var status: js.UndefOr[ReferenceStatus]
  }

  object GetReferenceMetadataResponse {
    @inline
    def apply(
        arn: ReferenceArn,
        creationTime: SyntheticTimestamp_date_time,
        id: ReferenceId,
        md5: Md5,
        referenceStoreId: ReferenceStoreId,
        updateTime: SyntheticTimestamp_date_time,
        description: js.UndefOr[ReferenceDescription] = js.undefined,
        files: js.UndefOr[ReferenceFiles] = js.undefined,
        name: js.UndefOr[ReferenceName] = js.undefined,
        status: js.UndefOr[ReferenceStatus] = js.undefined
    ): GetReferenceMetadataResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "md5" -> md5.asInstanceOf[js.Any],
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      files.foreach(__v => __obj.updateDynamic("files")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReferenceMetadataResponse]
    }
  }

  @js.native
  trait GetReferenceRequest extends js.Object {
    var id: ReferenceId
    var partNumber: GetReferenceRequestPartNumberInteger
    var referenceStoreId: ReferenceStoreId
    var file: js.UndefOr[ReferenceFile]
    var range: js.UndefOr[Range]
  }

  object GetReferenceRequest {
    @inline
    def apply(
        id: ReferenceId,
        partNumber: GetReferenceRequestPartNumberInteger,
        referenceStoreId: ReferenceStoreId,
        file: js.UndefOr[ReferenceFile] = js.undefined,
        range: js.UndefOr[Range] = js.undefined
    ): GetReferenceRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "partNumber" -> partNumber.asInstanceOf[js.Any],
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any]
      )

      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      range.foreach(__v => __obj.updateDynamic("range")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReferenceRequest]
    }
  }

  @js.native
  trait GetReferenceResponse extends js.Object {
    var payload: js.UndefOr[ReferenceStreamingBlob]
  }

  object GetReferenceResponse {
    @inline
    def apply(
        payload: js.UndefOr[ReferenceStreamingBlob] = js.undefined
    ): GetReferenceResponse = {
      val __obj = js.Dynamic.literal()
      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReferenceResponse]
    }
  }

  @js.native
  trait GetReferenceStoreRequest extends js.Object {
    var id: ReferenceStoreId
  }

  object GetReferenceStoreRequest {
    @inline
    def apply(
        id: ReferenceStoreId
    ): GetReferenceStoreRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetReferenceStoreRequest]
    }
  }

  @js.native
  trait GetReferenceStoreResponse extends js.Object {
    var arn: ReferenceStoreArn
    var creationTime: SyntheticTimestamp_date_time
    var id: ReferenceStoreId
    var description: js.UndefOr[ReferenceStoreDescription]
    var name: js.UndefOr[ReferenceStoreName]
    var sseConfig: js.UndefOr[SseConfig]
  }

  object GetReferenceStoreResponse {
    @inline
    def apply(
        arn: ReferenceStoreArn,
        creationTime: SyntheticTimestamp_date_time,
        id: ReferenceStoreId,
        description: js.UndefOr[ReferenceStoreDescription] = js.undefined,
        name: js.UndefOr[ReferenceStoreName] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined
    ): GetReferenceStoreResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetReferenceStoreResponse]
    }
  }

  @js.native
  trait GetRunGroupRequest extends js.Object {
    var id: RunGroupId
  }

  object GetRunGroupRequest {
    @inline
    def apply(
        id: RunGroupId
    ): GetRunGroupRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRunGroupRequest]
    }
  }

  @js.native
  trait GetRunGroupResponse extends js.Object {
    var arn: js.UndefOr[RunGroupArn]
    var creationTime: js.UndefOr[RunGroupTimestamp]
    var id: js.UndefOr[RunGroupId]
    var maxCpus: js.UndefOr[GetRunGroupResponseMaxCpusInteger]
    var maxDuration: js.UndefOr[GetRunGroupResponseMaxDurationInteger]
    var maxRuns: js.UndefOr[GetRunGroupResponseMaxRunsInteger]
    var name: js.UndefOr[RunGroupName]
    var tags: js.UndefOr[TagMap]
  }

  object GetRunGroupResponse {
    @inline
    def apply(
        arn: js.UndefOr[RunGroupArn] = js.undefined,
        creationTime: js.UndefOr[RunGroupTimestamp] = js.undefined,
        id: js.UndefOr[RunGroupId] = js.undefined,
        maxCpus: js.UndefOr[GetRunGroupResponseMaxCpusInteger] = js.undefined,
        maxDuration: js.UndefOr[GetRunGroupResponseMaxDurationInteger] = js.undefined,
        maxRuns: js.UndefOr[GetRunGroupResponseMaxRunsInteger] = js.undefined,
        name: js.UndefOr[RunGroupName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): GetRunGroupResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      maxCpus.foreach(__v => __obj.updateDynamic("maxCpus")(__v.asInstanceOf[js.Any]))
      maxDuration.foreach(__v => __obj.updateDynamic("maxDuration")(__v.asInstanceOf[js.Any]))
      maxRuns.foreach(__v => __obj.updateDynamic("maxRuns")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRunGroupResponse]
    }
  }

  @js.native
  trait GetRunRequest extends js.Object {
    var id: RunId
    var `export`: js.UndefOr[RunExportList]
  }

  object GetRunRequest {
    @inline
    def apply(
        id: RunId,
        `export`: js.UndefOr[RunExportList] = js.undefined
    ): GetRunRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      `export`.foreach(__v => __obj.updateDynamic("export")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRunRequest]
    }
  }

  @js.native
  trait GetRunResponse extends js.Object {
    var arn: js.UndefOr[RunArn]
    var creationTime: js.UndefOr[RunTimestamp]
    var definition: js.UndefOr[WorkflowDefinition]
    var digest: js.UndefOr[WorkflowDigest]
    var id: js.UndefOr[RunId]
    var logLevel: js.UndefOr[RunLogLevel]
    var name: js.UndefOr[RunName]
    var outputUri: js.UndefOr[RunOutputUri]
    var parameters: js.UndefOr[RunParameters]
    var priority: js.UndefOr[GetRunResponsePriorityInteger]
    var resourceDigests: js.UndefOr[RunResourceDigests]
    var roleArn: js.UndefOr[RunRoleArn]
    var runGroupId: js.UndefOr[RunGroupId]
    var runId: js.UndefOr[RunId]
    var startTime: js.UndefOr[RunTimestamp]
    var startedBy: js.UndefOr[RunStartedBy]
    var status: js.UndefOr[RunStatus]
    var statusMessage: js.UndefOr[RunStatusMessage]
    var stopTime: js.UndefOr[RunTimestamp]
    var storageCapacity: js.UndefOr[GetRunResponseStorageCapacityInteger]
    var tags: js.UndefOr[TagMap]
    var workflowId: js.UndefOr[WorkflowId]
    var workflowType: js.UndefOr[WorkflowType]
  }

  object GetRunResponse {
    @inline
    def apply(
        arn: js.UndefOr[RunArn] = js.undefined,
        creationTime: js.UndefOr[RunTimestamp] = js.undefined,
        definition: js.UndefOr[WorkflowDefinition] = js.undefined,
        digest: js.UndefOr[WorkflowDigest] = js.undefined,
        id: js.UndefOr[RunId] = js.undefined,
        logLevel: js.UndefOr[RunLogLevel] = js.undefined,
        name: js.UndefOr[RunName] = js.undefined,
        outputUri: js.UndefOr[RunOutputUri] = js.undefined,
        parameters: js.UndefOr[RunParameters] = js.undefined,
        priority: js.UndefOr[GetRunResponsePriorityInteger] = js.undefined,
        resourceDigests: js.UndefOr[RunResourceDigests] = js.undefined,
        roleArn: js.UndefOr[RunRoleArn] = js.undefined,
        runGroupId: js.UndefOr[RunGroupId] = js.undefined,
        runId: js.UndefOr[RunId] = js.undefined,
        startTime: js.UndefOr[RunTimestamp] = js.undefined,
        startedBy: js.UndefOr[RunStartedBy] = js.undefined,
        status: js.UndefOr[RunStatus] = js.undefined,
        statusMessage: js.UndefOr[RunStatusMessage] = js.undefined,
        stopTime: js.UndefOr[RunTimestamp] = js.undefined,
        storageCapacity: js.UndefOr[GetRunResponseStorageCapacityInteger] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        workflowId: js.UndefOr[WorkflowId] = js.undefined,
        workflowType: js.UndefOr[WorkflowType] = js.undefined
    ): GetRunResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      digest.foreach(__v => __obj.updateDynamic("digest")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      logLevel.foreach(__v => __obj.updateDynamic("logLevel")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      outputUri.foreach(__v => __obj.updateDynamic("outputUri")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      resourceDigests.foreach(__v => __obj.updateDynamic("resourceDigests")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      runGroupId.foreach(__v => __obj.updateDynamic("runGroupId")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      startedBy.foreach(__v => __obj.updateDynamic("startedBy")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      stopTime.foreach(__v => __obj.updateDynamic("stopTime")(__v.asInstanceOf[js.Any]))
      storageCapacity.foreach(__v => __obj.updateDynamic("storageCapacity")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      workflowType.foreach(__v => __obj.updateDynamic("workflowType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRunResponse]
    }
  }

  @js.native
  trait GetRunTaskRequest extends js.Object {
    var id: RunId
    var taskId: TaskId
  }

  object GetRunTaskRequest {
    @inline
    def apply(
        id: RunId,
        taskId: TaskId
    ): GetRunTaskRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "taskId" -> taskId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRunTaskRequest]
    }
  }

  @js.native
  trait GetRunTaskResponse extends js.Object {
    var cpus: js.UndefOr[GetRunTaskResponseCpusInteger]
    var creationTime: js.UndefOr[TaskTimestamp]
    var logStream: js.UndefOr[TaskLogStream]
    var memory: js.UndefOr[GetRunTaskResponseMemoryInteger]
    var name: js.UndefOr[TaskName]
    var startTime: js.UndefOr[TaskTimestamp]
    var status: js.UndefOr[TaskStatus]
    var statusMessage: js.UndefOr[TaskStatusMessage]
    var stopTime: js.UndefOr[TaskTimestamp]
    var taskId: js.UndefOr[TaskId]
  }

  object GetRunTaskResponse {
    @inline
    def apply(
        cpus: js.UndefOr[GetRunTaskResponseCpusInteger] = js.undefined,
        creationTime: js.UndefOr[TaskTimestamp] = js.undefined,
        logStream: js.UndefOr[TaskLogStream] = js.undefined,
        memory: js.UndefOr[GetRunTaskResponseMemoryInteger] = js.undefined,
        name: js.UndefOr[TaskName] = js.undefined,
        startTime: js.UndefOr[TaskTimestamp] = js.undefined,
        status: js.UndefOr[TaskStatus] = js.undefined,
        statusMessage: js.UndefOr[TaskStatusMessage] = js.undefined,
        stopTime: js.UndefOr[TaskTimestamp] = js.undefined,
        taskId: js.UndefOr[TaskId] = js.undefined
    ): GetRunTaskResponse = {
      val __obj = js.Dynamic.literal()
      cpus.foreach(__v => __obj.updateDynamic("cpus")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      logStream.foreach(__v => __obj.updateDynamic("logStream")(__v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.updateDynamic("memory")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      stopTime.foreach(__v => __obj.updateDynamic("stopTime")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRunTaskResponse]
    }
  }

  @js.native
  trait GetSequenceStoreRequest extends js.Object {
    var id: SequenceStoreId
  }

  object GetSequenceStoreRequest {
    @inline
    def apply(
        id: SequenceStoreId
    ): GetSequenceStoreRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSequenceStoreRequest]
    }
  }

  @js.native
  trait GetSequenceStoreResponse extends js.Object {
    var arn: SequenceStoreArn
    var creationTime: SyntheticTimestamp_date_time
    var id: SequenceStoreId
    var description: js.UndefOr[SequenceStoreDescription]
    var name: js.UndefOr[SequenceStoreName]
    var sseConfig: js.UndefOr[SseConfig]
  }

  object GetSequenceStoreResponse {
    @inline
    def apply(
        arn: SequenceStoreArn,
        creationTime: SyntheticTimestamp_date_time,
        id: SequenceStoreId,
        description: js.UndefOr[SequenceStoreDescription] = js.undefined,
        name: js.UndefOr[SequenceStoreName] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined
    ): GetSequenceStoreResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSequenceStoreResponse]
    }
  }

  @js.native
  trait GetVariantImportRequest extends js.Object {
    var jobId: ResourceId
  }

  object GetVariantImportRequest {
    @inline
    def apply(
        jobId: ResourceId
    ): GetVariantImportRequest = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVariantImportRequest]
    }
  }

  @js.native
  trait GetVariantImportResponse extends js.Object {
    var creationTime: CreationTime
    var destinationName: StoreName
    var id: ResourceId
    var items: VariantImportItemDetails
    var roleArn: Arn
    var runLeftNormalization: RunLeftNormalization
    var status: JobStatus
    var statusMessage: JobStatusMsg
    var updateTime: UpdateTime
    var completionTime: js.UndefOr[CompletionTime]
  }

  object GetVariantImportResponse {
    @inline
    def apply(
        creationTime: CreationTime,
        destinationName: StoreName,
        id: ResourceId,
        items: VariantImportItemDetails,
        roleArn: Arn,
        runLeftNormalization: RunLeftNormalization,
        status: JobStatus,
        statusMessage: JobStatusMsg,
        updateTime: UpdateTime,
        completionTime: js.UndefOr[CompletionTime] = js.undefined
    ): GetVariantImportResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "destinationName" -> destinationName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "items" -> items.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "runLeftNormalization" -> runLeftNormalization.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "statusMessage" -> statusMessage.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVariantImportResponse]
    }
  }

  @js.native
  trait GetVariantStoreRequest extends js.Object {
    var name: String
  }

  object GetVariantStoreRequest {
    @inline
    def apply(
        name: String
    ): GetVariantStoreRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVariantStoreRequest]
    }
  }

  @js.native
  trait GetVariantStoreResponse extends js.Object {
    var creationTime: CreationTime
    var description: StoreDescription
    var id: ResourceId
    var name: String
    var reference: ReferenceItem
    var sseConfig: SseConfig
    var status: StoreStatus
    var statusMessage: StatusMessage
    var storeArn: Arn
    var storeSizeBytes: Double
    var tags: TagMap
    var updateTime: UpdateTime
  }

  object GetVariantStoreResponse {
    @inline
    def apply(
        creationTime: CreationTime,
        description: StoreDescription,
        id: ResourceId,
        name: String,
        reference: ReferenceItem,
        sseConfig: SseConfig,
        status: StoreStatus,
        statusMessage: StatusMessage,
        storeArn: Arn,
        storeSizeBytes: Double,
        tags: TagMap,
        updateTime: UpdateTime
    ): GetVariantStoreResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "reference" -> reference.asInstanceOf[js.Any],
        "sseConfig" -> sseConfig.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "statusMessage" -> statusMessage.asInstanceOf[js.Any],
        "storeArn" -> storeArn.asInstanceOf[js.Any],
        "storeSizeBytes" -> storeSizeBytes.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVariantStoreResponse]
    }
  }

  @js.native
  trait GetWorkflowRequest extends js.Object {
    var id: WorkflowId
    var `export`: js.UndefOr[WorkflowExportList]
    var `type`: js.UndefOr[WorkflowType]
  }

  object GetWorkflowRequest {
    @inline
    def apply(
        id: WorkflowId,
        `export`: js.UndefOr[WorkflowExportList] = js.undefined,
        `type`: js.UndefOr[WorkflowType] = js.undefined
    ): GetWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      `export`.foreach(__v => __obj.updateDynamic("export")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowRequest]
    }
  }

  @js.native
  trait GetWorkflowResponse extends js.Object {
    var arn: js.UndefOr[WorkflowArn]
    var creationTime: js.UndefOr[WorkflowTimestamp]
    var definition: js.UndefOr[WorkflowDefinition]
    var description: js.UndefOr[WorkflowDescription]
    var digest: js.UndefOr[WorkflowDigest]
    var engine: js.UndefOr[WorkflowEngine]
    var id: js.UndefOr[WorkflowId]
    var main: js.UndefOr[WorkflowMain]
    var name: js.UndefOr[WorkflowName]
    var parameterTemplate: js.UndefOr[WorkflowParameterTemplate]
    var status: js.UndefOr[WorkflowStatus]
    var statusMessage: js.UndefOr[WorkflowStatusMessage]
    var storageCapacity: js.UndefOr[GetWorkflowResponseStorageCapacityInteger]
    var tags: js.UndefOr[TagMap]
    var `type`: js.UndefOr[WorkflowType]
  }

  object GetWorkflowResponse {
    @inline
    def apply(
        arn: js.UndefOr[WorkflowArn] = js.undefined,
        creationTime: js.UndefOr[WorkflowTimestamp] = js.undefined,
        definition: js.UndefOr[WorkflowDefinition] = js.undefined,
        description: js.UndefOr[WorkflowDescription] = js.undefined,
        digest: js.UndefOr[WorkflowDigest] = js.undefined,
        engine: js.UndefOr[WorkflowEngine] = js.undefined,
        id: js.UndefOr[WorkflowId] = js.undefined,
        main: js.UndefOr[WorkflowMain] = js.undefined,
        name: js.UndefOr[WorkflowName] = js.undefined,
        parameterTemplate: js.UndefOr[WorkflowParameterTemplate] = js.undefined,
        status: js.UndefOr[WorkflowStatus] = js.undefined,
        statusMessage: js.UndefOr[WorkflowStatusMessage] = js.undefined,
        storageCapacity: js.UndefOr[GetWorkflowResponseStorageCapacityInteger] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        `type`: js.UndefOr[WorkflowType] = js.undefined
    ): GetWorkflowResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      digest.foreach(__v => __obj.updateDynamic("digest")(__v.asInstanceOf[js.Any]))
      engine.foreach(__v => __obj.updateDynamic("engine")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      main.foreach(__v => __obj.updateDynamic("main")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      parameterTemplate.foreach(__v => __obj.updateDynamic("parameterTemplate")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      storageCapacity.foreach(__v => __obj.updateDynamic("storageCapacity")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkflowResponse]
    }
  }

  /** A filter for import read set jobs.
    */
  @js.native
  trait ImportReadSetFilter extends js.Object {
    var createdAfter: js.UndefOr[SyntheticTimestamp_date_time]
    var createdBefore: js.UndefOr[SyntheticTimestamp_date_time]
    var status: js.UndefOr[ReadSetImportJobStatus]
  }

  object ImportReadSetFilter {
    @inline
    def apply(
        createdAfter: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        createdBefore: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        status: js.UndefOr[ReadSetImportJobStatus] = js.undefined
    ): ImportReadSetFilter = {
      val __obj = js.Dynamic.literal()
      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportReadSetFilter]
    }
  }

  /** An import read set job.
    */
  @js.native
  trait ImportReadSetJobItem extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var id: ImportJobId
    var roleArn: RoleArn
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetImportJobStatus
    var completionTime: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object ImportReadSetJobItem {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        id: ImportJobId,
        roleArn: RoleArn,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetImportJobStatus,
        completionTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): ImportReadSetJobItem = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportReadSetJobItem]
    }
  }

  /** A source for an import read set job.
    */
  @js.native
  trait ImportReadSetSourceItem extends js.Object {
    var sampleId: SampleId
    var sourceFileType: FileType
    var sourceFiles: SourceFiles
    var status: ReadSetImportJobItemStatus
    var subjectId: SubjectId
    var description: js.UndefOr[ReadSetDescription]
    var generatedFrom: js.UndefOr[GeneratedFrom]
    var name: js.UndefOr[ReadSetName]
    var referenceArn: js.UndefOr[ReferenceArn]
    var statusMessage: js.UndefOr[JobStatusMessage]
    var tags: js.UndefOr[TagMap]
  }

  object ImportReadSetSourceItem {
    @inline
    def apply(
        sampleId: SampleId,
        sourceFileType: FileType,
        sourceFiles: SourceFiles,
        status: ReadSetImportJobItemStatus,
        subjectId: SubjectId,
        description: js.UndefOr[ReadSetDescription] = js.undefined,
        generatedFrom: js.UndefOr[GeneratedFrom] = js.undefined,
        name: js.UndefOr[ReadSetName] = js.undefined,
        referenceArn: js.UndefOr[ReferenceArn] = js.undefined,
        statusMessage: js.UndefOr[JobStatusMessage] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ImportReadSetSourceItem = {
      val __obj = js.Dynamic.literal(
        "sampleId" -> sampleId.asInstanceOf[js.Any],
        "sourceFileType" -> sourceFileType.asInstanceOf[js.Any],
        "sourceFiles" -> sourceFiles.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "subjectId" -> subjectId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      generatedFrom.foreach(__v => __obj.updateDynamic("generatedFrom")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      referenceArn.foreach(__v => __obj.updateDynamic("referenceArn")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportReadSetSourceItem]
    }
  }

  /** A filter for import references.
    */
  @js.native
  trait ImportReferenceFilter extends js.Object {
    var createdAfter: js.UndefOr[SyntheticTimestamp_date_time]
    var createdBefore: js.UndefOr[SyntheticTimestamp_date_time]
    var status: js.UndefOr[ReferenceImportJobStatus]
  }

  object ImportReferenceFilter {
    @inline
    def apply(
        createdAfter: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        createdBefore: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        status: js.UndefOr[ReferenceImportJobStatus] = js.undefined
    ): ImportReferenceFilter = {
      val __obj = js.Dynamic.literal()
      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportReferenceFilter]
    }
  }

  /** An import reference job.
    */
  @js.native
  trait ImportReferenceJobItem extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var id: ImportJobId
    var referenceStoreId: ReferenceStoreId
    var roleArn: RoleArn
    var status: ReferenceImportJobStatus
    var completionTime: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object ImportReferenceJobItem {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        id: ImportJobId,
        referenceStoreId: ReferenceStoreId,
        roleArn: RoleArn,
        status: ReferenceImportJobStatus,
        completionTime: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): ImportReferenceJobItem = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportReferenceJobItem]
    }
  }

  /** An genome reference source.
    */
  @js.native
  trait ImportReferenceSourceItem extends js.Object {
    var status: ReferenceImportJobItemStatus
    var description: js.UndefOr[ReferenceDescription]
    var name: js.UndefOr[ReferenceName]
    var sourceFile: js.UndefOr[S3Uri]
    var statusMessage: js.UndefOr[JobStatusMessage]
    var tags: js.UndefOr[TagMap]
  }

  object ImportReferenceSourceItem {
    @inline
    def apply(
        status: ReferenceImportJobItemStatus,
        description: js.UndefOr[ReferenceDescription] = js.undefined,
        name: js.UndefOr[ReferenceName] = js.undefined,
        sourceFile: js.UndefOr[S3Uri] = js.undefined,
        statusMessage: js.UndefOr[JobStatusMessage] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ImportReferenceSourceItem = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sourceFile.foreach(__v => __obj.updateDynamic("sourceFile")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportReferenceSourceItem]
    }
  }

  /** A filter for annotation import jobs.
    */
  @js.native
  trait ListAnnotationImportJobsFilter extends js.Object {
    var status: js.UndefOr[JobStatus]
    var storeName: js.UndefOr[String]
  }

  object ListAnnotationImportJobsFilter {
    @inline
    def apply(
        status: js.UndefOr[JobStatus] = js.undefined,
        storeName: js.UndefOr[String] = js.undefined
    ): ListAnnotationImportJobsFilter = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      storeName.foreach(__v => __obj.updateDynamic("storeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnnotationImportJobsFilter]
    }
  }

  @js.native
  trait ListAnnotationImportJobsRequest extends js.Object {
    var filter: js.UndefOr[ListAnnotationImportJobsFilter]
    var ids: js.UndefOr[ListAnnotationImportJobsRequestIdsList]
    var maxResults: js.UndefOr[ListAnnotationImportJobsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListAnnotationImportJobsRequestNextTokenString]
  }

  object ListAnnotationImportJobsRequest {
    @inline
    def apply(
        filter: js.UndefOr[ListAnnotationImportJobsFilter] = js.undefined,
        ids: js.UndefOr[ListAnnotationImportJobsRequestIdsList] = js.undefined,
        maxResults: js.UndefOr[ListAnnotationImportJobsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListAnnotationImportJobsRequestNextTokenString] = js.undefined
    ): ListAnnotationImportJobsRequest = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnnotationImportJobsRequest]
    }
  }

  @js.native
  trait ListAnnotationImportJobsResponse extends js.Object {
    var annotationImportJobs: js.UndefOr[AnnotationImportJobItems]
    var nextToken: js.UndefOr[String]
  }

  object ListAnnotationImportJobsResponse {
    @inline
    def apply(
        annotationImportJobs: js.UndefOr[AnnotationImportJobItems] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListAnnotationImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      annotationImportJobs.foreach(__v => __obj.updateDynamic("annotationImportJobs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnnotationImportJobsResponse]
    }
  }

  /** A filter for annotation stores.
    */
  @js.native
  trait ListAnnotationStoresFilter extends js.Object {
    var status: js.UndefOr[StoreStatus]
  }

  object ListAnnotationStoresFilter {
    @inline
    def apply(
        status: js.UndefOr[StoreStatus] = js.undefined
    ): ListAnnotationStoresFilter = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnnotationStoresFilter]
    }
  }

  @js.native
  trait ListAnnotationStoresRequest extends js.Object {
    var filter: js.UndefOr[ListAnnotationStoresFilter]
    var ids: js.UndefOr[ListAnnotationStoresRequestIdsList]
    var maxResults: js.UndefOr[ListAnnotationStoresRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListAnnotationStoresRequestNextTokenString]
  }

  object ListAnnotationStoresRequest {
    @inline
    def apply(
        filter: js.UndefOr[ListAnnotationStoresFilter] = js.undefined,
        ids: js.UndefOr[ListAnnotationStoresRequestIdsList] = js.undefined,
        maxResults: js.UndefOr[ListAnnotationStoresRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListAnnotationStoresRequestNextTokenString] = js.undefined
    ): ListAnnotationStoresRequest = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnnotationStoresRequest]
    }
  }

  @js.native
  trait ListAnnotationStoresResponse extends js.Object {
    var annotationStores: js.UndefOr[AnnotationStoreItems]
    var nextToken: js.UndefOr[String]
  }

  object ListAnnotationStoresResponse {
    @inline
    def apply(
        annotationStores: js.UndefOr[AnnotationStoreItems] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListAnnotationStoresResponse = {
      val __obj = js.Dynamic.literal()
      annotationStores.foreach(__v => __obj.updateDynamic("annotationStores")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnnotationStoresResponse]
    }
  }

  @js.native
  trait ListReadSetActivationJobsRequest extends js.Object {
    var sequenceStoreId: SequenceStoreId
    var filter: js.UndefOr[ActivateReadSetFilter]
    var maxResults: js.UndefOr[ListReadSetActivationJobsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReadSetActivationJobsRequest {
    @inline
    def apply(
        sequenceStoreId: SequenceStoreId,
        filter: js.UndefOr[ActivateReadSetFilter] = js.undefined,
        maxResults: js.UndefOr[ListReadSetActivationJobsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReadSetActivationJobsRequest = {
      val __obj = js.Dynamic.literal(
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadSetActivationJobsRequest]
    }
  }

  @js.native
  trait ListReadSetActivationJobsResponse extends js.Object {
    var activationJobs: js.UndefOr[ActivateReadSetJobList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReadSetActivationJobsResponse {
    @inline
    def apply(
        activationJobs: js.UndefOr[ActivateReadSetJobList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReadSetActivationJobsResponse = {
      val __obj = js.Dynamic.literal()
      activationJobs.foreach(__v => __obj.updateDynamic("activationJobs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadSetActivationJobsResponse]
    }
  }

  @js.native
  trait ListReadSetExportJobsRequest extends js.Object {
    var sequenceStoreId: SequenceStoreId
    var filter: js.UndefOr[ExportReadSetFilter]
    var maxResults: js.UndefOr[ListReadSetExportJobsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReadSetExportJobsRequest {
    @inline
    def apply(
        sequenceStoreId: SequenceStoreId,
        filter: js.UndefOr[ExportReadSetFilter] = js.undefined,
        maxResults: js.UndefOr[ListReadSetExportJobsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReadSetExportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadSetExportJobsRequest]
    }
  }

  @js.native
  trait ListReadSetExportJobsResponse extends js.Object {
    var exportJobs: js.UndefOr[ExportReadSetJobDetailList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReadSetExportJobsResponse {
    @inline
    def apply(
        exportJobs: js.UndefOr[ExportReadSetJobDetailList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReadSetExportJobsResponse = {
      val __obj = js.Dynamic.literal()
      exportJobs.foreach(__v => __obj.updateDynamic("exportJobs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadSetExportJobsResponse]
    }
  }

  @js.native
  trait ListReadSetImportJobsRequest extends js.Object {
    var sequenceStoreId: SequenceStoreId
    var filter: js.UndefOr[ImportReadSetFilter]
    var maxResults: js.UndefOr[ListReadSetImportJobsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReadSetImportJobsRequest {
    @inline
    def apply(
        sequenceStoreId: SequenceStoreId,
        filter: js.UndefOr[ImportReadSetFilter] = js.undefined,
        maxResults: js.UndefOr[ListReadSetImportJobsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReadSetImportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadSetImportJobsRequest]
    }
  }

  @js.native
  trait ListReadSetImportJobsResponse extends js.Object {
    var importJobs: js.UndefOr[ImportReadSetJobList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReadSetImportJobsResponse {
    @inline
    def apply(
        importJobs: js.UndefOr[ImportReadSetJobList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReadSetImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      importJobs.foreach(__v => __obj.updateDynamic("importJobs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadSetImportJobsResponse]
    }
  }

  @js.native
  trait ListReadSetsRequest extends js.Object {
    var sequenceStoreId: SequenceStoreId
    var filter: js.UndefOr[ReadSetFilter]
    var maxResults: js.UndefOr[ListReadSetsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReadSetsRequest {
    @inline
    def apply(
        sequenceStoreId: SequenceStoreId,
        filter: js.UndefOr[ReadSetFilter] = js.undefined,
        maxResults: js.UndefOr[ListReadSetsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReadSetsRequest = {
      val __obj = js.Dynamic.literal(
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadSetsRequest]
    }
  }

  @js.native
  trait ListReadSetsResponse extends js.Object {
    var readSets: ReadSetList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReadSetsResponse {
    @inline
    def apply(
        readSets: ReadSetList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReadSetsResponse = {
      val __obj = js.Dynamic.literal(
        "readSets" -> readSets.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReadSetsResponse]
    }
  }

  @js.native
  trait ListReferenceImportJobsRequest extends js.Object {
    var referenceStoreId: ReferenceStoreId
    var filter: js.UndefOr[ImportReferenceFilter]
    var maxResults: js.UndefOr[ListReferenceImportJobsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReferenceImportJobsRequest {
    @inline
    def apply(
        referenceStoreId: ReferenceStoreId,
        filter: js.UndefOr[ImportReferenceFilter] = js.undefined,
        maxResults: js.UndefOr[ListReferenceImportJobsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReferenceImportJobsRequest = {
      val __obj = js.Dynamic.literal(
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReferenceImportJobsRequest]
    }
  }

  @js.native
  trait ListReferenceImportJobsResponse extends js.Object {
    var importJobs: js.UndefOr[ImportReferenceJobList]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReferenceImportJobsResponse {
    @inline
    def apply(
        importJobs: js.UndefOr[ImportReferenceJobList] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReferenceImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      importJobs.foreach(__v => __obj.updateDynamic("importJobs")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReferenceImportJobsResponse]
    }
  }

  @js.native
  trait ListReferenceStoresRequest extends js.Object {
    var filter: js.UndefOr[ReferenceStoreFilter]
    var maxResults: js.UndefOr[ListReferenceStoresRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReferenceStoresRequest {
    @inline
    def apply(
        filter: js.UndefOr[ReferenceStoreFilter] = js.undefined,
        maxResults: js.UndefOr[ListReferenceStoresRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReferenceStoresRequest = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReferenceStoresRequest]
    }
  }

  @js.native
  trait ListReferenceStoresResponse extends js.Object {
    var referenceStores: ReferenceStoreDetailList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReferenceStoresResponse {
    @inline
    def apply(
        referenceStores: ReferenceStoreDetailList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReferenceStoresResponse = {
      val __obj = js.Dynamic.literal(
        "referenceStores" -> referenceStores.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReferenceStoresResponse]
    }
  }

  @js.native
  trait ListReferencesRequest extends js.Object {
    var referenceStoreId: ReferenceStoreId
    var filter: js.UndefOr[ReferenceFilter]
    var maxResults: js.UndefOr[ListReferencesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReferencesRequest {
    @inline
    def apply(
        referenceStoreId: ReferenceStoreId,
        filter: js.UndefOr[ReferenceFilter] = js.undefined,
        maxResults: js.UndefOr[ListReferencesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReferencesRequest = {
      val __obj = js.Dynamic.literal(
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReferencesRequest]
    }
  }

  @js.native
  trait ListReferencesResponse extends js.Object {
    var references: ReferenceList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListReferencesResponse {
    @inline
    def apply(
        references: ReferenceList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListReferencesResponse = {
      val __obj = js.Dynamic.literal(
        "references" -> references.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListReferencesResponse]
    }
  }

  @js.native
  trait ListRunGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[ListRunGroupsRequestMaxResultsInteger]
    var name: js.UndefOr[RunGroupName]
    var startingToken: js.UndefOr[RunGroupListToken]
  }

  object ListRunGroupsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListRunGroupsRequestMaxResultsInteger] = js.undefined,
        name: js.UndefOr[RunGroupName] = js.undefined,
        startingToken: js.UndefOr[RunGroupListToken] = js.undefined
    ): ListRunGroupsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      startingToken.foreach(__v => __obj.updateDynamic("startingToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRunGroupsRequest]
    }
  }

  @js.native
  trait ListRunGroupsResponse extends js.Object {
    var items: js.UndefOr[RunGroupList]
    var nextToken: js.UndefOr[RunGroupListToken]
  }

  object ListRunGroupsResponse {
    @inline
    def apply(
        items: js.UndefOr[RunGroupList] = js.undefined,
        nextToken: js.UndefOr[RunGroupListToken] = js.undefined
    ): ListRunGroupsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRunGroupsResponse]
    }
  }

  @js.native
  trait ListRunTasksRequest extends js.Object {
    var id: RunId
    var maxResults: js.UndefOr[ListRunTasksRequestMaxResultsInteger]
    var startingToken: js.UndefOr[TaskListToken]
    var status: js.UndefOr[TaskStatus]
  }

  object ListRunTasksRequest {
    @inline
    def apply(
        id: RunId,
        maxResults: js.UndefOr[ListRunTasksRequestMaxResultsInteger] = js.undefined,
        startingToken: js.UndefOr[TaskListToken] = js.undefined,
        status: js.UndefOr[TaskStatus] = js.undefined
    ): ListRunTasksRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      startingToken.foreach(__v => __obj.updateDynamic("startingToken")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRunTasksRequest]
    }
  }

  @js.native
  trait ListRunTasksResponse extends js.Object {
    var items: js.UndefOr[TaskList]
    var nextToken: js.UndefOr[TaskListToken]
  }

  object ListRunTasksResponse {
    @inline
    def apply(
        items: js.UndefOr[TaskList] = js.undefined,
        nextToken: js.UndefOr[TaskListToken] = js.undefined
    ): ListRunTasksResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRunTasksResponse]
    }
  }

  @js.native
  trait ListRunsRequest extends js.Object {
    var maxResults: js.UndefOr[ListRunsRequestMaxResultsInteger]
    var name: js.UndefOr[RunName]
    var runGroupId: js.UndefOr[RunGroupId]
    var startingToken: js.UndefOr[RunListToken]
  }

  object ListRunsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListRunsRequestMaxResultsInteger] = js.undefined,
        name: js.UndefOr[RunName] = js.undefined,
        runGroupId: js.UndefOr[RunGroupId] = js.undefined,
        startingToken: js.UndefOr[RunListToken] = js.undefined
    ): ListRunsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      runGroupId.foreach(__v => __obj.updateDynamic("runGroupId")(__v.asInstanceOf[js.Any]))
      startingToken.foreach(__v => __obj.updateDynamic("startingToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRunsRequest]
    }
  }

  @js.native
  trait ListRunsResponse extends js.Object {
    var items: js.UndefOr[RunList]
    var nextToken: js.UndefOr[RunListToken]
  }

  object ListRunsResponse {
    @inline
    def apply(
        items: js.UndefOr[RunList] = js.undefined,
        nextToken: js.UndefOr[RunListToken] = js.undefined
    ): ListRunsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRunsResponse]
    }
  }

  @js.native
  trait ListSequenceStoresRequest extends js.Object {
    var filter: js.UndefOr[SequenceStoreFilter]
    var maxResults: js.UndefOr[ListSequenceStoresRequestMaxResultsInteger]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSequenceStoresRequest {
    @inline
    def apply(
        filter: js.UndefOr[SequenceStoreFilter] = js.undefined,
        maxResults: js.UndefOr[ListSequenceStoresRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSequenceStoresRequest = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSequenceStoresRequest]
    }
  }

  @js.native
  trait ListSequenceStoresResponse extends js.Object {
    var sequenceStores: SequenceStoreDetailList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSequenceStoresResponse {
    @inline
    def apply(
        sequenceStores: SequenceStoreDetailList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSequenceStoresResponse = {
      val __obj = js.Dynamic.literal(
        "sequenceStores" -> sequenceStores.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSequenceStoresResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: TagArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: TagArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: TagMap
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: TagMap
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** A filter for variant import jobs.
    */
  @js.native
  trait ListVariantImportJobsFilter extends js.Object {
    var status: js.UndefOr[JobStatus]
    var storeName: js.UndefOr[String]
  }

  object ListVariantImportJobsFilter {
    @inline
    def apply(
        status: js.UndefOr[JobStatus] = js.undefined,
        storeName: js.UndefOr[String] = js.undefined
    ): ListVariantImportJobsFilter = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      storeName.foreach(__v => __obj.updateDynamic("storeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVariantImportJobsFilter]
    }
  }

  @js.native
  trait ListVariantImportJobsRequest extends js.Object {
    var filter: js.UndefOr[ListVariantImportJobsFilter]
    var ids: js.UndefOr[ListVariantImportJobsRequestIdsList]
    var maxResults: js.UndefOr[ListVariantImportJobsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListVariantImportJobsRequestNextTokenString]
  }

  object ListVariantImportJobsRequest {
    @inline
    def apply(
        filter: js.UndefOr[ListVariantImportJobsFilter] = js.undefined,
        ids: js.UndefOr[ListVariantImportJobsRequestIdsList] = js.undefined,
        maxResults: js.UndefOr[ListVariantImportJobsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListVariantImportJobsRequestNextTokenString] = js.undefined
    ): ListVariantImportJobsRequest = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVariantImportJobsRequest]
    }
  }

  @js.native
  trait ListVariantImportJobsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var variantImportJobs: js.UndefOr[VariantImportJobItems]
  }

  object ListVariantImportJobsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        variantImportJobs: js.UndefOr[VariantImportJobItems] = js.undefined
    ): ListVariantImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      variantImportJobs.foreach(__v => __obj.updateDynamic("variantImportJobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVariantImportJobsResponse]
    }
  }

  /** A filter for variant stores.
    */
  @js.native
  trait ListVariantStoresFilter extends js.Object {
    var status: js.UndefOr[StoreStatus]
  }

  object ListVariantStoresFilter {
    @inline
    def apply(
        status: js.UndefOr[StoreStatus] = js.undefined
    ): ListVariantStoresFilter = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVariantStoresFilter]
    }
  }

  @js.native
  trait ListVariantStoresRequest extends js.Object {
    var filter: js.UndefOr[ListVariantStoresFilter]
    var ids: js.UndefOr[ListVariantStoresRequestIdsList]
    var maxResults: js.UndefOr[ListVariantStoresRequestMaxResultsInteger]
    var nextToken: js.UndefOr[ListVariantStoresRequestNextTokenString]
  }

  object ListVariantStoresRequest {
    @inline
    def apply(
        filter: js.UndefOr[ListVariantStoresFilter] = js.undefined,
        ids: js.UndefOr[ListVariantStoresRequestIdsList] = js.undefined,
        maxResults: js.UndefOr[ListVariantStoresRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[ListVariantStoresRequestNextTokenString] = js.undefined
    ): ListVariantStoresRequest = {
      val __obj = js.Dynamic.literal()
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVariantStoresRequest]
    }
  }

  @js.native
  trait ListVariantStoresResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var variantStores: js.UndefOr[VariantStoreItems]
  }

  object ListVariantStoresResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        variantStores: js.UndefOr[VariantStoreItems] = js.undefined
    ): ListVariantStoresResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      variantStores.foreach(__v => __obj.updateDynamic("variantStores")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVariantStoresResponse]
    }
  }

  @js.native
  trait ListWorkflowsRequest extends js.Object {
    var maxResults: js.UndefOr[ListWorkflowsRequestMaxResultsInteger]
    var name: js.UndefOr[WorkflowName]
    var startingToken: js.UndefOr[WorkflowListToken]
    var `type`: js.UndefOr[WorkflowType]
  }

  object ListWorkflowsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListWorkflowsRequestMaxResultsInteger] = js.undefined,
        name: js.UndefOr[WorkflowName] = js.undefined,
        startingToken: js.UndefOr[WorkflowListToken] = js.undefined,
        `type`: js.UndefOr[WorkflowType] = js.undefined
    ): ListWorkflowsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      startingToken.foreach(__v => __obj.updateDynamic("startingToken")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowsRequest]
    }
  }

  @js.native
  trait ListWorkflowsResponse extends js.Object {
    var items: js.UndefOr[WorkflowList]
    var nextToken: js.UndefOr[WorkflowListToken]
  }

  object ListWorkflowsResponse {
    @inline
    def apply(
        items: js.UndefOr[WorkflowList] = js.undefined,
        nextToken: js.UndefOr[WorkflowListToken] = js.undefined
    ): ListWorkflowsResponse = {
      val __obj = js.Dynamic.literal()
      items.foreach(__v => __obj.updateDynamic("items")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkflowsResponse]
    }
  }

  /** Read options for an annotation import job.
    */
  @js.native
  trait ReadOptions extends js.Object {
    var comment: js.UndefOr[CommentChar]
    var encoding: js.UndefOr[Encoding]
    var escape: js.UndefOr[EscapeChar]
    var escapeQuotes: js.UndefOr[EscapeQuotes]
    var header: js.UndefOr[Header]
    var lineSep: js.UndefOr[LineSep]
    var quote: js.UndefOr[Quote]
    var quoteAll: js.UndefOr[QuoteAll]
    var sep: js.UndefOr[Separator]
  }

  object ReadOptions {
    @inline
    def apply(
        comment: js.UndefOr[CommentChar] = js.undefined,
        encoding: js.UndefOr[Encoding] = js.undefined,
        escape: js.UndefOr[EscapeChar] = js.undefined,
        escapeQuotes: js.UndefOr[EscapeQuotes] = js.undefined,
        header: js.UndefOr[Header] = js.undefined,
        lineSep: js.UndefOr[LineSep] = js.undefined,
        quote: js.UndefOr[Quote] = js.undefined,
        quoteAll: js.UndefOr[QuoteAll] = js.undefined,
        sep: js.UndefOr[Separator] = js.undefined
    ): ReadOptions = {
      val __obj = js.Dynamic.literal()
      comment.foreach(__v => __obj.updateDynamic("comment")(__v.asInstanceOf[js.Any]))
      encoding.foreach(__v => __obj.updateDynamic("encoding")(__v.asInstanceOf[js.Any]))
      escape.foreach(__v => __obj.updateDynamic("escape")(__v.asInstanceOf[js.Any]))
      escapeQuotes.foreach(__v => __obj.updateDynamic("escapeQuotes")(__v.asInstanceOf[js.Any]))
      header.foreach(__v => __obj.updateDynamic("header")(__v.asInstanceOf[js.Any]))
      lineSep.foreach(__v => __obj.updateDynamic("lineSep")(__v.asInstanceOf[js.Any]))
      quote.foreach(__v => __obj.updateDynamic("quote")(__v.asInstanceOf[js.Any]))
      quoteAll.foreach(__v => __obj.updateDynamic("quoteAll")(__v.asInstanceOf[js.Any]))
      sep.foreach(__v => __obj.updateDynamic("sep")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadOptions]
    }
  }

  /** An error from a batch read set operation.
    */
  @js.native
  trait ReadSetBatchError extends js.Object {
    var code: String
    var id: ReadSetId
    var message: String
  }

  object ReadSetBatchError {
    @inline
    def apply(
        code: String,
        id: ReadSetId,
        message: String
    ): ReadSetBatchError = {
      val __obj = js.Dynamic.literal(
        "code" -> code.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReadSetBatchError]
    }
  }

  /** Files in a read set.
    */
  @js.native
  trait ReadSetFiles extends js.Object {
    var index: js.UndefOr[FileInformation]
    var source1: js.UndefOr[FileInformation]
    var source2: js.UndefOr[FileInformation]
  }

  object ReadSetFiles {
    @inline
    def apply(
        index: js.UndefOr[FileInformation] = js.undefined,
        source1: js.UndefOr[FileInformation] = js.undefined,
        source2: js.UndefOr[FileInformation] = js.undefined
    ): ReadSetFiles = {
      val __obj = js.Dynamic.literal()
      index.foreach(__v => __obj.updateDynamic("index")(__v.asInstanceOf[js.Any]))
      source1.foreach(__v => __obj.updateDynamic("source1")(__v.asInstanceOf[js.Any]))
      source2.foreach(__v => __obj.updateDynamic("source2")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadSetFiles]
    }
  }

  /** A filter for read sets.
    */
  @js.native
  trait ReadSetFilter extends js.Object {
    var createdAfter: js.UndefOr[SyntheticTimestamp_date_time]
    var createdBefore: js.UndefOr[SyntheticTimestamp_date_time]
    var name: js.UndefOr[ReadSetName]
    var referenceArn: js.UndefOr[ReferenceArn]
    var status: js.UndefOr[ReadSetStatus]
  }

  object ReadSetFilter {
    @inline
    def apply(
        createdAfter: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        createdBefore: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        name: js.UndefOr[ReadSetName] = js.undefined,
        referenceArn: js.UndefOr[ReferenceArn] = js.undefined,
        status: js.UndefOr[ReadSetStatus] = js.undefined
    ): ReadSetFilter = {
      val __obj = js.Dynamic.literal()
      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      referenceArn.foreach(__v => __obj.updateDynamic("referenceArn")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadSetFilter]
    }
  }

  /** A read set.
    */
  @js.native
  trait ReadSetListItem extends js.Object {
    var arn: ReadSetArn
    var creationTime: SyntheticTimestamp_date_time
    var fileType: FileType
    var id: ReadSetId
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetStatus
    var description: js.UndefOr[ReadSetDescription]
    var name: js.UndefOr[ReadSetName]
    var referenceArn: js.UndefOr[ReferenceArn]
    var sampleId: js.UndefOr[SampleId]
    var sequenceInformation: js.UndefOr[SequenceInformation]
    var subjectId: js.UndefOr[SubjectId]
  }

  object ReadSetListItem {
    @inline
    def apply(
        arn: ReadSetArn,
        creationTime: SyntheticTimestamp_date_time,
        fileType: FileType,
        id: ReadSetId,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetStatus,
        description: js.UndefOr[ReadSetDescription] = js.undefined,
        name: js.UndefOr[ReadSetName] = js.undefined,
        referenceArn: js.UndefOr[ReferenceArn] = js.undefined,
        sampleId: js.UndefOr[SampleId] = js.undefined,
        sequenceInformation: js.UndefOr[SequenceInformation] = js.undefined,
        subjectId: js.UndefOr[SubjectId] = js.undefined
    ): ReadSetListItem = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "fileType" -> fileType.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      referenceArn.foreach(__v => __obj.updateDynamic("referenceArn")(__v.asInstanceOf[js.Any]))
      sampleId.foreach(__v => __obj.updateDynamic("sampleId")(__v.asInstanceOf[js.Any]))
      sequenceInformation.foreach(__v => __obj.updateDynamic("sequenceInformation")(__v.asInstanceOf[js.Any]))
      subjectId.foreach(__v => __obj.updateDynamic("subjectId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReadSetListItem]
    }
  }

  /** A set of genome reference files.
    */
  @js.native
  trait ReferenceFiles extends js.Object {
    var index: js.UndefOr[FileInformation]
    var source: js.UndefOr[FileInformation]
  }

  object ReferenceFiles {
    @inline
    def apply(
        index: js.UndefOr[FileInformation] = js.undefined,
        source: js.UndefOr[FileInformation] = js.undefined
    ): ReferenceFiles = {
      val __obj = js.Dynamic.literal()
      index.foreach(__v => __obj.updateDynamic("index")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceFiles]
    }
  }

  /** A filter for references.
    */
  @js.native
  trait ReferenceFilter extends js.Object {
    var createdAfter: js.UndefOr[SyntheticTimestamp_date_time]
    var createdBefore: js.UndefOr[SyntheticTimestamp_date_time]
    var md5: js.UndefOr[Md5]
    var name: js.UndefOr[ReferenceName]
  }

  object ReferenceFilter {
    @inline
    def apply(
        createdAfter: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        createdBefore: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        md5: js.UndefOr[Md5] = js.undefined,
        name: js.UndefOr[ReferenceName] = js.undefined
    ): ReferenceFilter = {
      val __obj = js.Dynamic.literal()
      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      md5.foreach(__v => __obj.updateDynamic("md5")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceFilter]
    }
  }

  /** A genome reference.
    */
  @js.native
  trait ReferenceItem extends js.Object {
    var referenceArn: js.UndefOr[ReferenceArn]
  }

  object ReferenceItem {
    @inline
    def apply(
        referenceArn: js.UndefOr[ReferenceArn] = js.undefined
    ): ReferenceItem = {
      val __obj = js.Dynamic.literal()
      referenceArn.foreach(__v => __obj.updateDynamic("referenceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceItem]
    }
  }

  /** A genome reference.
    */
  @js.native
  trait ReferenceListItem extends js.Object {
    var arn: ReferenceArn
    var creationTime: SyntheticTimestamp_date_time
    var id: ReferenceId
    var md5: Md5
    var referenceStoreId: ReferenceStoreId
    var updateTime: SyntheticTimestamp_date_time
    var description: js.UndefOr[ReferenceDescription]
    var name: js.UndefOr[ReferenceName]
    var status: js.UndefOr[ReferenceStatus]
  }

  object ReferenceListItem {
    @inline
    def apply(
        arn: ReferenceArn,
        creationTime: SyntheticTimestamp_date_time,
        id: ReferenceId,
        md5: Md5,
        referenceStoreId: ReferenceStoreId,
        updateTime: SyntheticTimestamp_date_time,
        description: js.UndefOr[ReferenceDescription] = js.undefined,
        name: js.UndefOr[ReferenceName] = js.undefined,
        status: js.UndefOr[ReferenceStatus] = js.undefined
    ): ReferenceListItem = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "md5" -> md5.asInstanceOf[js.Any],
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceListItem]
    }
  }

  /** Details about a reference store.
    */
  @js.native
  trait ReferenceStoreDetail extends js.Object {
    var arn: ReferenceStoreArn
    var creationTime: SyntheticTimestamp_date_time
    var id: ReferenceStoreId
    var description: js.UndefOr[ReferenceStoreDescription]
    var name: js.UndefOr[ReferenceStoreName]
    var sseConfig: js.UndefOr[SseConfig]
  }

  object ReferenceStoreDetail {
    @inline
    def apply(
        arn: ReferenceStoreArn,
        creationTime: SyntheticTimestamp_date_time,
        id: ReferenceStoreId,
        description: js.UndefOr[ReferenceStoreDescription] = js.undefined,
        name: js.UndefOr[ReferenceStoreName] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined
    ): ReferenceStoreDetail = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceStoreDetail]
    }
  }

  /** A filter for reference stores.
    */
  @js.native
  trait ReferenceStoreFilter extends js.Object {
    var createdAfter: js.UndefOr[SyntheticTimestamp_date_time]
    var createdBefore: js.UndefOr[SyntheticTimestamp_date_time]
    var name: js.UndefOr[ReferenceStoreName]
  }

  object ReferenceStoreFilter {
    @inline
    def apply(
        createdAfter: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        createdBefore: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        name: js.UndefOr[ReferenceStoreName] = js.undefined
    ): ReferenceStoreFilter = {
      val __obj = js.Dynamic.literal()
      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceStoreFilter]
    }
  }

  /** A run group.
    */
  @js.native
  trait RunGroupListItem extends js.Object {
    var arn: js.UndefOr[RunGroupArn]
    var creationTime: js.UndefOr[RunGroupTimestamp]
    var id: js.UndefOr[RunGroupId]
    var maxCpus: js.UndefOr[RunGroupListItemMaxCpusInteger]
    var maxDuration: js.UndefOr[RunGroupListItemMaxDurationInteger]
    var maxRuns: js.UndefOr[RunGroupListItemMaxRunsInteger]
    var name: js.UndefOr[RunGroupName]
  }

  object RunGroupListItem {
    @inline
    def apply(
        arn: js.UndefOr[RunGroupArn] = js.undefined,
        creationTime: js.UndefOr[RunGroupTimestamp] = js.undefined,
        id: js.UndefOr[RunGroupId] = js.undefined,
        maxCpus: js.UndefOr[RunGroupListItemMaxCpusInteger] = js.undefined,
        maxDuration: js.UndefOr[RunGroupListItemMaxDurationInteger] = js.undefined,
        maxRuns: js.UndefOr[RunGroupListItemMaxRunsInteger] = js.undefined,
        name: js.UndefOr[RunGroupName] = js.undefined
    ): RunGroupListItem = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      maxCpus.foreach(__v => __obj.updateDynamic("maxCpus")(__v.asInstanceOf[js.Any]))
      maxDuration.foreach(__v => __obj.updateDynamic("maxDuration")(__v.asInstanceOf[js.Any]))
      maxRuns.foreach(__v => __obj.updateDynamic("maxRuns")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RunGroupListItem]
    }
  }

  /** A workflow run.
    */
  @js.native
  trait RunListItem extends js.Object {
    var arn: js.UndefOr[RunArn]
    var creationTime: js.UndefOr[RunTimestamp]
    var id: js.UndefOr[RunId]
    var name: js.UndefOr[RunName]
    var priority: js.UndefOr[RunListItemPriorityInteger]
    var startTime: js.UndefOr[RunTimestamp]
    var status: js.UndefOr[RunStatus]
    var stopTime: js.UndefOr[RunTimestamp]
    var storageCapacity: js.UndefOr[RunListItemStorageCapacityInteger]
    var workflowId: js.UndefOr[WorkflowId]
  }

  object RunListItem {
    @inline
    def apply(
        arn: js.UndefOr[RunArn] = js.undefined,
        creationTime: js.UndefOr[RunTimestamp] = js.undefined,
        id: js.UndefOr[RunId] = js.undefined,
        name: js.UndefOr[RunName] = js.undefined,
        priority: js.UndefOr[RunListItemPriorityInteger] = js.undefined,
        startTime: js.UndefOr[RunTimestamp] = js.undefined,
        status: js.UndefOr[RunStatus] = js.undefined,
        stopTime: js.UndefOr[RunTimestamp] = js.undefined,
        storageCapacity: js.UndefOr[RunListItemStorageCapacityInteger] = js.undefined,
        workflowId: js.UndefOr[WorkflowId] = js.undefined
    ): RunListItem = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      stopTime.foreach(__v => __obj.updateDynamic("stopTime")(__v.asInstanceOf[js.Any]))
      storageCapacity.foreach(__v => __obj.updateDynamic("storageCapacity")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RunListItem]
    }
  }

  @js.native
  trait RunParameters extends js.Object

  object RunParameters {
    @inline
    def apply(): RunParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunParameters]
    }
  }

  /** Details about a sequence.
    */
  @js.native
  trait SequenceInformation extends js.Object {
    var alignment: js.UndefOr[String]
    var generatedFrom: js.UndefOr[GeneratedFrom]
    var totalBaseCount: js.UndefOr[Double]
    var totalReadCount: js.UndefOr[Double]
  }

  object SequenceInformation {
    @inline
    def apply(
        alignment: js.UndefOr[String] = js.undefined,
        generatedFrom: js.UndefOr[GeneratedFrom] = js.undefined,
        totalBaseCount: js.UndefOr[Double] = js.undefined,
        totalReadCount: js.UndefOr[Double] = js.undefined
    ): SequenceInformation = {
      val __obj = js.Dynamic.literal()
      alignment.foreach(__v => __obj.updateDynamic("alignment")(__v.asInstanceOf[js.Any]))
      generatedFrom.foreach(__v => __obj.updateDynamic("generatedFrom")(__v.asInstanceOf[js.Any]))
      totalBaseCount.foreach(__v => __obj.updateDynamic("totalBaseCount")(__v.asInstanceOf[js.Any]))
      totalReadCount.foreach(__v => __obj.updateDynamic("totalReadCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SequenceInformation]
    }
  }

  /** Details about a sequence store.
    */
  @js.native
  trait SequenceStoreDetail extends js.Object {
    var arn: SequenceStoreArn
    var creationTime: SyntheticTimestamp_date_time
    var id: SequenceStoreId
    var description: js.UndefOr[SequenceStoreDescription]
    var name: js.UndefOr[SequenceStoreName]
    var sseConfig: js.UndefOr[SseConfig]
  }

  object SequenceStoreDetail {
    @inline
    def apply(
        arn: SequenceStoreArn,
        creationTime: SyntheticTimestamp_date_time,
        id: SequenceStoreId,
        description: js.UndefOr[SequenceStoreDescription] = js.undefined,
        name: js.UndefOr[SequenceStoreName] = js.undefined,
        sseConfig: js.UndefOr[SseConfig] = js.undefined
    ): SequenceStoreDetail = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sseConfig.foreach(__v => __obj.updateDynamic("sseConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SequenceStoreDetail]
    }
  }

  /** A filter for a sequence store.
    */
  @js.native
  trait SequenceStoreFilter extends js.Object {
    var createdAfter: js.UndefOr[SyntheticTimestamp_date_time]
    var createdBefore: js.UndefOr[SyntheticTimestamp_date_time]
    var name: js.UndefOr[SequenceStoreName]
  }

  object SequenceStoreFilter {
    @inline
    def apply(
        createdAfter: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        createdBefore: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        name: js.UndefOr[SequenceStoreName] = js.undefined
    ): SequenceStoreFilter = {
      val __obj = js.Dynamic.literal()
      createdAfter.foreach(__v => __obj.updateDynamic("createdAfter")(__v.asInstanceOf[js.Any]))
      createdBefore.foreach(__v => __obj.updateDynamic("createdBefore")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SequenceStoreFilter]
    }
  }

  /** Source files for a sequence.
    */
  @js.native
  trait SourceFiles extends js.Object {
    var source1: S3Uri
    var source2: js.UndefOr[S3Uri]
  }

  object SourceFiles {
    @inline
    def apply(
        source1: S3Uri,
        source2: js.UndefOr[S3Uri] = js.undefined
    ): SourceFiles = {
      val __obj = js.Dynamic.literal(
        "source1" -> source1.asInstanceOf[js.Any]
      )

      source2.foreach(__v => __obj.updateDynamic("source2")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceFiles]
    }
  }

  /** Server-side encryption (SSE) settings for a store.
    */
  @js.native
  trait SseConfig extends js.Object {
    var `type`: EncryptionType
    var keyArn: js.UndefOr[SseConfigKeyArnString]
  }

  object SseConfig {
    @inline
    def apply(
        `type`: EncryptionType,
        keyArn: js.UndefOr[SseConfigKeyArnString] = js.undefined
    ): SseConfig = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      keyArn.foreach(__v => __obj.updateDynamic("keyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SseConfig]
    }
  }

  @js.native
  trait StartAnnotationImportRequest extends js.Object {
    var destinationName: StoreName
    var items: AnnotationImportItemSources
    var roleArn: Arn
    var formatOptions: js.UndefOr[FormatOptions]
    var runLeftNormalization: js.UndefOr[RunLeftNormalization]
  }

  object StartAnnotationImportRequest {
    @inline
    def apply(
        destinationName: StoreName,
        items: AnnotationImportItemSources,
        roleArn: Arn,
        formatOptions: js.UndefOr[FormatOptions] = js.undefined,
        runLeftNormalization: js.UndefOr[RunLeftNormalization] = js.undefined
    ): StartAnnotationImportRequest = {
      val __obj = js.Dynamic.literal(
        "destinationName" -> destinationName.asInstanceOf[js.Any],
        "items" -> items.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      formatOptions.foreach(__v => __obj.updateDynamic("formatOptions")(__v.asInstanceOf[js.Any]))
      runLeftNormalization.foreach(__v => __obj.updateDynamic("runLeftNormalization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAnnotationImportRequest]
    }
  }

  @js.native
  trait StartAnnotationImportResponse extends js.Object {
    var jobId: ResourceId
  }

  object StartAnnotationImportResponse {
    @inline
    def apply(
        jobId: ResourceId
    ): StartAnnotationImportResponse = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartAnnotationImportResponse]
    }
  }

  @js.native
  trait StartReadSetActivationJobRequest extends js.Object {
    var sequenceStoreId: SequenceStoreId
    var sources: StartReadSetActivationJobRequestSourcesList
    var clientToken: js.UndefOr[ClientToken]
  }

  object StartReadSetActivationJobRequest {
    @inline
    def apply(
        sequenceStoreId: SequenceStoreId,
        sources: StartReadSetActivationJobRequestSourcesList,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): StartReadSetActivationJobRequest = {
      val __obj = js.Dynamic.literal(
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReadSetActivationJobRequest]
    }
  }

  @js.native
  trait StartReadSetActivationJobResponse extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var id: ActivationJobId
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetActivationJobStatus
  }

  object StartReadSetActivationJobResponse {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        id: ActivationJobId,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetActivationJobStatus
    ): StartReadSetActivationJobResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartReadSetActivationJobResponse]
    }
  }

  /** A source for a read set activation job.
    */
  @js.native
  trait StartReadSetActivationJobSourceItem extends js.Object {
    var readSetId: ReadSetId
  }

  object StartReadSetActivationJobSourceItem {
    @inline
    def apply(
        readSetId: ReadSetId
    ): StartReadSetActivationJobSourceItem = {
      val __obj = js.Dynamic.literal(
        "readSetId" -> readSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartReadSetActivationJobSourceItem]
    }
  }

  @js.native
  trait StartReadSetExportJobRequest extends js.Object {
    var destination: S3Destination
    var roleArn: RoleArn
    var sequenceStoreId: SequenceStoreId
    var sources: StartReadSetExportJobRequestSourcesList
    var clientToken: js.UndefOr[ClientToken]
  }

  object StartReadSetExportJobRequest {
    @inline
    def apply(
        destination: S3Destination,
        roleArn: RoleArn,
        sequenceStoreId: SequenceStoreId,
        sources: StartReadSetExportJobRequestSourcesList,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): StartReadSetExportJobRequest = {
      val __obj = js.Dynamic.literal(
        "destination" -> destination.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReadSetExportJobRequest]
    }
  }

  @js.native
  trait StartReadSetExportJobResponse extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var destination: S3Destination
    var id: ExportJobId
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetExportJobStatus
  }

  object StartReadSetExportJobResponse {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        destination: S3Destination,
        id: ExportJobId,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetExportJobStatus
    ): StartReadSetExportJobResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "destination" -> destination.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartReadSetExportJobResponse]
    }
  }

  @js.native
  trait StartReadSetImportJobRequest extends js.Object {
    var roleArn: RoleArn
    var sequenceStoreId: SequenceStoreId
    var sources: StartReadSetImportJobRequestSourcesList
    var clientToken: js.UndefOr[ClientToken]
  }

  object StartReadSetImportJobRequest {
    @inline
    def apply(
        roleArn: RoleArn,
        sequenceStoreId: SequenceStoreId,
        sources: StartReadSetImportJobRequestSourcesList,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): StartReadSetImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReadSetImportJobRequest]
    }
  }

  @js.native
  trait StartReadSetImportJobResponse extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var id: ImportJobId
    var roleArn: RoleArn
    var sequenceStoreId: SequenceStoreId
    var status: ReadSetImportJobStatus
  }

  object StartReadSetImportJobResponse {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        id: ImportJobId,
        roleArn: RoleArn,
        sequenceStoreId: SequenceStoreId,
        status: ReadSetImportJobStatus
    ): StartReadSetImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "sequenceStoreId" -> sequenceStoreId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartReadSetImportJobResponse]
    }
  }

  /** A source for a read set import job.
    */
  @js.native
  trait StartReadSetImportJobSourceItem extends js.Object {
    var referenceArn: ReferenceArn
    var sampleId: SampleId
    var sourceFileType: FileType
    var sourceFiles: SourceFiles
    var subjectId: SubjectId
    var description: js.UndefOr[ReadSetDescription]
    var generatedFrom: js.UndefOr[GeneratedFrom]
    var name: js.UndefOr[ReadSetName]
    var tags: js.UndefOr[TagMap]
  }

  object StartReadSetImportJobSourceItem {
    @inline
    def apply(
        referenceArn: ReferenceArn,
        sampleId: SampleId,
        sourceFileType: FileType,
        sourceFiles: SourceFiles,
        subjectId: SubjectId,
        description: js.UndefOr[ReadSetDescription] = js.undefined,
        generatedFrom: js.UndefOr[GeneratedFrom] = js.undefined,
        name: js.UndefOr[ReadSetName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartReadSetImportJobSourceItem = {
      val __obj = js.Dynamic.literal(
        "referenceArn" -> referenceArn.asInstanceOf[js.Any],
        "sampleId" -> sampleId.asInstanceOf[js.Any],
        "sourceFileType" -> sourceFileType.asInstanceOf[js.Any],
        "sourceFiles" -> sourceFiles.asInstanceOf[js.Any],
        "subjectId" -> subjectId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      generatedFrom.foreach(__v => __obj.updateDynamic("generatedFrom")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReadSetImportJobSourceItem]
    }
  }

  @js.native
  trait StartReferenceImportJobRequest extends js.Object {
    var referenceStoreId: ReferenceStoreId
    var roleArn: RoleArn
    var sources: StartReferenceImportJobRequestSourcesList
    var clientToken: js.UndefOr[ClientToken]
  }

  object StartReferenceImportJobRequest {
    @inline
    def apply(
        referenceStoreId: ReferenceStoreId,
        roleArn: RoleArn,
        sources: StartReferenceImportJobRequestSourcesList,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): StartReferenceImportJobRequest = {
      val __obj = js.Dynamic.literal(
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "sources" -> sources.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReferenceImportJobRequest]
    }
  }

  @js.native
  trait StartReferenceImportJobResponse extends js.Object {
    var creationTime: SyntheticTimestamp_date_time
    var id: ImportJobId
    var referenceStoreId: ReferenceStoreId
    var roleArn: RoleArn
    var status: ReferenceImportJobStatus
  }

  object StartReferenceImportJobResponse {
    @inline
    def apply(
        creationTime: SyntheticTimestamp_date_time,
        id: ImportJobId,
        referenceStoreId: ReferenceStoreId,
        roleArn: RoleArn,
        status: ReferenceImportJobStatus
    ): StartReferenceImportJobResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "referenceStoreId" -> referenceStoreId.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartReferenceImportJobResponse]
    }
  }

  /** A source for a reference import job.
    */
  @js.native
  trait StartReferenceImportJobSourceItem extends js.Object {
    var name: ReferenceName
    var sourceFile: S3Uri
    var description: js.UndefOr[ReferenceDescription]
    var tags: js.UndefOr[TagMap]
  }

  object StartReferenceImportJobSourceItem {
    @inline
    def apply(
        name: ReferenceName,
        sourceFile: S3Uri,
        description: js.UndefOr[ReferenceDescription] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartReferenceImportJobSourceItem = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "sourceFile" -> sourceFile.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartReferenceImportJobSourceItem]
    }
  }

  @js.native
  trait StartRunRequest extends js.Object {
    var requestId: RunRequestId
    var roleArn: RunRoleArn
    var logLevel: js.UndefOr[RunLogLevel]
    var name: js.UndefOr[RunName]
    var outputUri: js.UndefOr[RunOutputUri]
    var parameters: js.UndefOr[RunParameters]
    var priority: js.UndefOr[StartRunRequestPriorityInteger]
    var runGroupId: js.UndefOr[RunGroupId]
    var runId: js.UndefOr[RunId]
    var storageCapacity: js.UndefOr[StartRunRequestStorageCapacityInteger]
    var tags: js.UndefOr[TagMap]
    var workflowId: js.UndefOr[WorkflowId]
    var workflowType: js.UndefOr[WorkflowType]
  }

  object StartRunRequest {
    @inline
    def apply(
        requestId: RunRequestId,
        roleArn: RunRoleArn,
        logLevel: js.UndefOr[RunLogLevel] = js.undefined,
        name: js.UndefOr[RunName] = js.undefined,
        outputUri: js.UndefOr[RunOutputUri] = js.undefined,
        parameters: js.UndefOr[RunParameters] = js.undefined,
        priority: js.UndefOr[StartRunRequestPriorityInteger] = js.undefined,
        runGroupId: js.UndefOr[RunGroupId] = js.undefined,
        runId: js.UndefOr[RunId] = js.undefined,
        storageCapacity: js.UndefOr[StartRunRequestStorageCapacityInteger] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        workflowId: js.UndefOr[WorkflowId] = js.undefined,
        workflowType: js.UndefOr[WorkflowType] = js.undefined
    ): StartRunRequest = {
      val __obj = js.Dynamic.literal(
        "requestId" -> requestId.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      logLevel.foreach(__v => __obj.updateDynamic("logLevel")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      outputUri.foreach(__v => __obj.updateDynamic("outputUri")(__v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.updateDynamic("parameters")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      runGroupId.foreach(__v => __obj.updateDynamic("runGroupId")(__v.asInstanceOf[js.Any]))
      runId.foreach(__v => __obj.updateDynamic("runId")(__v.asInstanceOf[js.Any]))
      storageCapacity.foreach(__v => __obj.updateDynamic("storageCapacity")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      workflowId.foreach(__v => __obj.updateDynamic("workflowId")(__v.asInstanceOf[js.Any]))
      workflowType.foreach(__v => __obj.updateDynamic("workflowType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRunRequest]
    }
  }

  @js.native
  trait StartRunResponse extends js.Object {
    var arn: js.UndefOr[RunArn]
    var id: js.UndefOr[RunId]
    var status: js.UndefOr[RunStatus]
    var tags: js.UndefOr[TagMap]
  }

  object StartRunResponse {
    @inline
    def apply(
        arn: js.UndefOr[RunArn] = js.undefined,
        id: js.UndefOr[RunId] = js.undefined,
        status: js.UndefOr[RunStatus] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): StartRunResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRunResponse]
    }
  }

  @js.native
  trait StartVariantImportRequest extends js.Object {
    var destinationName: StoreName
    var items: VariantImportItemSources
    var roleArn: Arn
    var runLeftNormalization: js.UndefOr[RunLeftNormalization]
  }

  object StartVariantImportRequest {
    @inline
    def apply(
        destinationName: StoreName,
        items: VariantImportItemSources,
        roleArn: Arn,
        runLeftNormalization: js.UndefOr[RunLeftNormalization] = js.undefined
    ): StartVariantImportRequest = {
      val __obj = js.Dynamic.literal(
        "destinationName" -> destinationName.asInstanceOf[js.Any],
        "items" -> items.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      runLeftNormalization.foreach(__v => __obj.updateDynamic("runLeftNormalization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartVariantImportRequest]
    }
  }

  @js.native
  trait StartVariantImportResponse extends js.Object {
    var jobId: ResourceId
  }

  object StartVariantImportResponse {
    @inline
    def apply(
        jobId: ResourceId
    ): StartVariantImportResponse = {
      val __obj = js.Dynamic.literal(
        "jobId" -> jobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartVariantImportResponse]
    }
  }

  /** Settings for a store.
    */
  @js.native
  trait StoreOptions extends js.Object {
    var tsvStoreOptions: js.UndefOr[TsvStoreOptions]
  }

  object StoreOptions {
    @inline
    def apply(
        tsvStoreOptions: js.UndefOr[TsvStoreOptions] = js.undefined
    ): StoreOptions = {
      val __obj = js.Dynamic.literal()
      tsvStoreOptions.foreach(__v => __obj.updateDynamic("tsvStoreOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StoreOptions]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: TagArn
    var tags: TagResourceRequestTagsMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: TagArn,
        tags: TagResourceRequestTagsMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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

  /** A workflow run task.
    */
  @js.native
  trait TaskListItem extends js.Object {
    var cpus: js.UndefOr[TaskListItemCpusInteger]
    var creationTime: js.UndefOr[TaskTimestamp]
    var memory: js.UndefOr[TaskListItemMemoryInteger]
    var name: js.UndefOr[TaskName]
    var startTime: js.UndefOr[TaskTimestamp]
    var status: js.UndefOr[TaskStatus]
    var stopTime: js.UndefOr[TaskTimestamp]
    var taskId: js.UndefOr[TaskId]
  }

  object TaskListItem {
    @inline
    def apply(
        cpus: js.UndefOr[TaskListItemCpusInteger] = js.undefined,
        creationTime: js.UndefOr[TaskTimestamp] = js.undefined,
        memory: js.UndefOr[TaskListItemMemoryInteger] = js.undefined,
        name: js.UndefOr[TaskName] = js.undefined,
        startTime: js.UndefOr[TaskTimestamp] = js.undefined,
        status: js.UndefOr[TaskStatus] = js.undefined,
        stopTime: js.UndefOr[TaskTimestamp] = js.undefined,
        taskId: js.UndefOr[TaskId] = js.undefined
    ): TaskListItem = {
      val __obj = js.Dynamic.literal()
      cpus.foreach(__v => __obj.updateDynamic("cpus")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.updateDynamic("memory")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      stopTime.foreach(__v => __obj.updateDynamic("stopTime")(__v.asInstanceOf[js.Any]))
      taskId.foreach(__v => __obj.updateDynamic("taskId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TaskListItem]
    }
  }

  /** Formatting options for a TSV file.
    */
  @js.native
  trait TsvOptions extends js.Object {
    var readOptions: js.UndefOr[ReadOptions]
  }

  object TsvOptions {
    @inline
    def apply(
        readOptions: js.UndefOr[ReadOptions] = js.undefined
    ): TsvOptions = {
      val __obj = js.Dynamic.literal()
      readOptions.foreach(__v => __obj.updateDynamic("readOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TsvOptions]
    }
  }

  /** File settings for a TSV store.
    */
  @js.native
  trait TsvStoreOptions extends js.Object {
    var annotationType: js.UndefOr[AnnotationType]
    var formatToHeader: js.UndefOr[FormatToHeader]
    var schema: js.UndefOr[TsvStoreOptionsSchemaList]
  }

  object TsvStoreOptions {
    @inline
    def apply(
        annotationType: js.UndefOr[AnnotationType] = js.undefined,
        formatToHeader: js.UndefOr[FormatToHeader] = js.undefined,
        schema: js.UndefOr[TsvStoreOptionsSchemaList] = js.undefined
    ): TsvStoreOptions = {
      val __obj = js.Dynamic.literal()
      annotationType.foreach(__v => __obj.updateDynamic("annotationType")(__v.asInstanceOf[js.Any]))
      formatToHeader.foreach(__v => __obj.updateDynamic("formatToHeader")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TsvStoreOptions]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: TagArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: TagArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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
  trait UpdateAnnotationStoreRequest extends js.Object {
    var name: String
    var description: js.UndefOr[StoreDescription]
  }

  object UpdateAnnotationStoreRequest {
    @inline
    def apply(
        name: String,
        description: js.UndefOr[StoreDescription] = js.undefined
    ): UpdateAnnotationStoreRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnnotationStoreRequest]
    }
  }

  @js.native
  trait UpdateAnnotationStoreResponse extends js.Object {
    var creationTime: CreationTime
    var description: StoreDescription
    var id: ResourceId
    var name: String
    var reference: ReferenceItem
    var status: StoreStatus
    var updateTime: UpdateTime
    var storeFormat: js.UndefOr[StoreFormat]
    var storeOptions: js.UndefOr[StoreOptions]
  }

  object UpdateAnnotationStoreResponse {
    @inline
    def apply(
        creationTime: CreationTime,
        description: StoreDescription,
        id: ResourceId,
        name: String,
        reference: ReferenceItem,
        status: StoreStatus,
        updateTime: UpdateTime,
        storeFormat: js.UndefOr[StoreFormat] = js.undefined,
        storeOptions: js.UndefOr[StoreOptions] = js.undefined
    ): UpdateAnnotationStoreResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "reference" -> reference.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      storeFormat.foreach(__v => __obj.updateDynamic("storeFormat")(__v.asInstanceOf[js.Any]))
      storeOptions.foreach(__v => __obj.updateDynamic("storeOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnnotationStoreResponse]
    }
  }

  @js.native
  trait UpdateRunGroupRequest extends js.Object {
    var id: RunGroupId
    var maxCpus: js.UndefOr[UpdateRunGroupRequestMaxCpusInteger]
    var maxDuration: js.UndefOr[UpdateRunGroupRequestMaxDurationInteger]
    var maxRuns: js.UndefOr[UpdateRunGroupRequestMaxRunsInteger]
    var name: js.UndefOr[RunGroupName]
  }

  object UpdateRunGroupRequest {
    @inline
    def apply(
        id: RunGroupId,
        maxCpus: js.UndefOr[UpdateRunGroupRequestMaxCpusInteger] = js.undefined,
        maxDuration: js.UndefOr[UpdateRunGroupRequestMaxDurationInteger] = js.undefined,
        maxRuns: js.UndefOr[UpdateRunGroupRequestMaxRunsInteger] = js.undefined,
        name: js.UndefOr[RunGroupName] = js.undefined
    ): UpdateRunGroupRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      maxCpus.foreach(__v => __obj.updateDynamic("maxCpus")(__v.asInstanceOf[js.Any]))
      maxDuration.foreach(__v => __obj.updateDynamic("maxDuration")(__v.asInstanceOf[js.Any]))
      maxRuns.foreach(__v => __obj.updateDynamic("maxRuns")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRunGroupRequest]
    }
  }

  @js.native
  trait UpdateVariantStoreRequest extends js.Object {
    var name: String
    var description: js.UndefOr[StoreDescription]
  }

  object UpdateVariantStoreRequest {
    @inline
    def apply(
        name: String,
        description: js.UndefOr[StoreDescription] = js.undefined
    ): UpdateVariantStoreRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVariantStoreRequest]
    }
  }

  @js.native
  trait UpdateVariantStoreResponse extends js.Object {
    var creationTime: CreationTime
    var description: StoreDescription
    var id: ResourceId
    var name: String
    var reference: ReferenceItem
    var status: StoreStatus
    var updateTime: UpdateTime
  }

  object UpdateVariantStoreResponse {
    @inline
    def apply(
        creationTime: CreationTime,
        description: StoreDescription,
        id: ResourceId,
        name: String,
        reference: ReferenceItem,
        status: StoreStatus,
        updateTime: UpdateTime
    ): UpdateVariantStoreResponse = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "reference" -> reference.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVariantStoreResponse]
    }
  }

  @js.native
  trait UpdateWorkflowRequest extends js.Object {
    var id: WorkflowId
    var description: js.UndefOr[WorkflowDescription]
    var name: js.UndefOr[WorkflowName]
  }

  object UpdateWorkflowRequest {
    @inline
    def apply(
        id: WorkflowId,
        description: js.UndefOr[WorkflowDescription] = js.undefined,
        name: js.UndefOr[WorkflowName] = js.undefined
    ): UpdateWorkflowRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkflowRequest]
    }
  }

  /** Details about an imported variant item.
    */
  @js.native
  trait VariantImportItemDetail extends js.Object {
    var jobStatus: JobStatus
    var source: S3Uri
  }

  object VariantImportItemDetail {
    @inline
    def apply(
        jobStatus: JobStatus,
        source: S3Uri
    ): VariantImportItemDetail = {
      val __obj = js.Dynamic.literal(
        "jobStatus" -> jobStatus.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VariantImportItemDetail]
    }
  }

  /** A imported variant item's source.
    */
  @js.native
  trait VariantImportItemSource extends js.Object {
    var source: S3Uri
  }

  object VariantImportItemSource {
    @inline
    def apply(
        source: S3Uri
    ): VariantImportItemSource = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VariantImportItemSource]
    }
  }

  /** A variant import job.
    */
  @js.native
  trait VariantImportJobItem extends js.Object {
    var creationTime: CreationTime
    var destinationName: String
    var id: String
    var roleArn: Arn
    var status: JobStatus
    var updateTime: UpdateTime
    var completionTime: js.UndefOr[CompletionTime]
    var runLeftNormalization: js.UndefOr[RunLeftNormalization]
  }

  object VariantImportJobItem {
    @inline
    def apply(
        creationTime: CreationTime,
        destinationName: String,
        id: String,
        roleArn: Arn,
        status: JobStatus,
        updateTime: UpdateTime,
        completionTime: js.UndefOr[CompletionTime] = js.undefined,
        runLeftNormalization: js.UndefOr[RunLeftNormalization] = js.undefined
    ): VariantImportJobItem = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "destinationName" -> destinationName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )

      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      runLeftNormalization.foreach(__v => __obj.updateDynamic("runLeftNormalization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VariantImportJobItem]
    }
  }

  /** A variant store.
    */
  @js.native
  trait VariantStoreItem extends js.Object {
    var creationTime: CreationTime
    var description: StoreDescription
    var id: ResourceId
    var name: String
    var reference: ReferenceItem
    var sseConfig: SseConfig
    var status: StoreStatus
    var statusMessage: StatusMessage
    var storeArn: Arn
    var storeSizeBytes: Double
    var updateTime: UpdateTime
  }

  object VariantStoreItem {
    @inline
    def apply(
        creationTime: CreationTime,
        description: StoreDescription,
        id: ResourceId,
        name: String,
        reference: ReferenceItem,
        sseConfig: SseConfig,
        status: StoreStatus,
        statusMessage: StatusMessage,
        storeArn: Arn,
        storeSizeBytes: Double,
        updateTime: UpdateTime
    ): VariantStoreItem = {
      val __obj = js.Dynamic.literal(
        "creationTime" -> creationTime.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "reference" -> reference.asInstanceOf[js.Any],
        "sseConfig" -> sseConfig.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "statusMessage" -> statusMessage.asInstanceOf[js.Any],
        "storeArn" -> storeArn.asInstanceOf[js.Any],
        "storeSizeBytes" -> storeSizeBytes.asInstanceOf[js.Any],
        "updateTime" -> updateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VariantStoreItem]
    }
  }

  /** Formatting options for a VCF file.
    */
  @js.native
  trait VcfOptions extends js.Object {
    var ignoreFilterField: js.UndefOr[Boolean]
    var ignoreQualField: js.UndefOr[Boolean]
  }

  object VcfOptions {
    @inline
    def apply(
        ignoreFilterField: js.UndefOr[Boolean] = js.undefined,
        ignoreQualField: js.UndefOr[Boolean] = js.undefined
    ): VcfOptions = {
      val __obj = js.Dynamic.literal()
      ignoreFilterField.foreach(__v => __obj.updateDynamic("ignoreFilterField")(__v.asInstanceOf[js.Any]))
      ignoreQualField.foreach(__v => __obj.updateDynamic("ignoreQualField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VcfOptions]
    }
  }

  /** A workflow.
    */
  @js.native
  trait WorkflowListItem extends js.Object {
    var arn: js.UndefOr[WorkflowArn]
    var creationTime: js.UndefOr[WorkflowTimestamp]
    var digest: js.UndefOr[WorkflowDigest]
    var id: js.UndefOr[WorkflowId]
    var name: js.UndefOr[WorkflowName]
    var status: js.UndefOr[WorkflowStatus]
    var `type`: js.UndefOr[WorkflowType]
  }

  object WorkflowListItem {
    @inline
    def apply(
        arn: js.UndefOr[WorkflowArn] = js.undefined,
        creationTime: js.UndefOr[WorkflowTimestamp] = js.undefined,
        digest: js.UndefOr[WorkflowDigest] = js.undefined,
        id: js.UndefOr[WorkflowId] = js.undefined,
        name: js.UndefOr[WorkflowName] = js.undefined,
        status: js.UndefOr[WorkflowStatus] = js.undefined,
        `type`: js.UndefOr[WorkflowType] = js.undefined
    ): WorkflowListItem = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      digest.foreach(__v => __obj.updateDynamic("digest")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowListItem]
    }
  }

  /** A workflow parameter.
    */
  @js.native
  trait WorkflowParameter extends js.Object {
    var description: js.UndefOr[WorkflowParameterDescription]
    var optional: js.UndefOr[Boolean]
  }

  object WorkflowParameter {
    @inline
    def apply(
        description: js.UndefOr[WorkflowParameterDescription] = js.undefined,
        optional: js.UndefOr[Boolean] = js.undefined
    ): WorkflowParameter = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      optional.foreach(__v => __obj.updateDynamic("optional")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkflowParameter]
    }
  }
}
