package facade.amazonaws.services.sagemaker

import scalajs._

type ActionStatus = "Unknown" | "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object ActionStatus {
  val Unknown: "Unknown" = "Unknown"
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[ActionStatus](Unknown, InProgress, Completed, Failed, Stopping, Stopped)
}

type AlgorithmSortBy = "Name" | "CreationTime"
object AlgorithmSortBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[AlgorithmSortBy](Name, CreationTime)
}

type AlgorithmStatus = "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting"
object AlgorithmStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Deleting: "Deleting" = "Deleting"

  @inline def values = js.Array[AlgorithmStatus](Pending, InProgress, Completed, Failed, Deleting)
}

type AppImageConfigSortKey = "CreationTime" | "LastModifiedTime" | "Name"
object AppImageConfigSortKey {
  val CreationTime: "CreationTime" = "CreationTime"
  val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"
  val Name: "Name" = "Name"

  @inline def values = js.Array[AppImageConfigSortKey](CreationTime, LastModifiedTime, Name)
}

type AppInstanceType = "system" | "ml.t3.micro" | "ml.t3.small" | "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.8xlarge" | "ml.m5.12xlarge" | "ml.m5.16xlarge" | "ml.m5.24xlarge" | "ml.c5.large" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.12xlarge" | "ml.c5.18xlarge" | "ml.c5.24xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge"
object AppInstanceType {
  val system: "system" = "system"
  val `ml.t3.micro`: "ml.t3.micro" = "ml.t3.micro"
  val `ml.t3.small`: "ml.t3.small" = "ml.t3.small"
  val `ml.t3.medium`: "ml.t3.medium" = "ml.t3.medium"
  val `ml.t3.large`: "ml.t3.large" = "ml.t3.large"
  val `ml.t3.xlarge`: "ml.t3.xlarge" = "ml.t3.xlarge"
  val `ml.t3.2xlarge`: "ml.t3.2xlarge" = "ml.t3.2xlarge"
  val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  val `ml.m5.8xlarge`: "ml.m5.8xlarge" = "ml.m5.8xlarge"
  val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  val `ml.m5.16xlarge`: "ml.m5.16xlarge" = "ml.m5.16xlarge"
  val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  val `ml.c5.large`: "ml.c5.large" = "ml.c5.large"
  val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  val `ml.c5.12xlarge`: "ml.c5.12xlarge" = "ml.c5.12xlarge"
  val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  val `ml.c5.24xlarge`: "ml.c5.24xlarge" = "ml.c5.24xlarge"
  val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"

  @inline def values = js.Array[AppInstanceType](
    system,
    `ml.t3.micro`,
    `ml.t3.small`,
    `ml.t3.medium`,
    `ml.t3.large`,
    `ml.t3.xlarge`,
    `ml.t3.2xlarge`,
    `ml.m5.large`,
    `ml.m5.xlarge`,
    `ml.m5.2xlarge`,
    `ml.m5.4xlarge`,
    `ml.m5.8xlarge`,
    `ml.m5.12xlarge`,
    `ml.m5.16xlarge`,
    `ml.m5.24xlarge`,
    `ml.c5.large`,
    `ml.c5.xlarge`,
    `ml.c5.2xlarge`,
    `ml.c5.4xlarge`,
    `ml.c5.9xlarge`,
    `ml.c5.12xlarge`,
    `ml.c5.18xlarge`,
    `ml.c5.24xlarge`,
    `ml.p3.2xlarge`,
    `ml.p3.8xlarge`,
    `ml.p3.16xlarge`,
    `ml.g4dn.xlarge`,
    `ml.g4dn.2xlarge`,
    `ml.g4dn.4xlarge`,
    `ml.g4dn.8xlarge`,
    `ml.g4dn.12xlarge`,
    `ml.g4dn.16xlarge`
  )
}

type AppNetworkAccessType = "PublicInternetOnly" | "VpcOnly"
object AppNetworkAccessType {
  val PublicInternetOnly: "PublicInternetOnly" = "PublicInternetOnly"
  val VpcOnly: "VpcOnly" = "VpcOnly"

  @inline def values = js.Array[AppNetworkAccessType](PublicInternetOnly, VpcOnly)
}

type AppSortKey = "CreationTime"
object AppSortKey {
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[AppSortKey](CreationTime)
}

type AppStatus = "Deleted" | "Deleting" | "Failed" | "InService" | "Pending"
object AppStatus {
  val Deleted: "Deleted" = "Deleted"
  val Deleting: "Deleting" = "Deleting"
  val Failed: "Failed" = "Failed"
  val InService: "InService" = "InService"
  val Pending: "Pending" = "Pending"

  @inline def values = js.Array[AppStatus](Deleted, Deleting, Failed, InService, Pending)
}

type AppType = "JupyterServer" | "KernelGateway" | "TensorBoard"
object AppType {
  val JupyterServer: "JupyterServer" = "JupyterServer"
  val KernelGateway: "KernelGateway" = "KernelGateway"
  val TensorBoard: "TensorBoard" = "TensorBoard"

  @inline def values = js.Array[AppType](JupyterServer, KernelGateway, TensorBoard)
}

type ArtifactSourceIdType = "MD5Hash" | "S3ETag" | "S3Version" | "Custom"
object ArtifactSourceIdType {
  val MD5Hash: "MD5Hash" = "MD5Hash"
  val S3ETag: "S3ETag" = "S3ETag"
  val S3Version: "S3Version" = "S3Version"
  val Custom: "Custom" = "Custom"

  @inline def values = js.Array[ArtifactSourceIdType](MD5Hash, S3ETag, S3Version, Custom)
}

type AssemblyType = "None" | "Line"
object AssemblyType {
  val None: "None" = "None"
  val Line: "Line" = "Line"

  @inline def values = js.Array[AssemblyType](None, Line)
}

type AssociationEdgeType = "ContributedTo" | "AssociatedWith" | "DerivedFrom" | "Produced"
object AssociationEdgeType {
  val ContributedTo: "ContributedTo" = "ContributedTo"
  val AssociatedWith: "AssociatedWith" = "AssociatedWith"
  val DerivedFrom: "DerivedFrom" = "DerivedFrom"
  val Produced: "Produced" = "Produced"

  @inline def values = js.Array[AssociationEdgeType](ContributedTo, AssociatedWith, DerivedFrom, Produced)
}

/** The compression used for Athena query results.
  */
type AthenaResultCompressionType = "GZIP" | "SNAPPY" | "ZLIB"
object AthenaResultCompressionType {
  val GZIP: "GZIP" = "GZIP"
  val SNAPPY: "SNAPPY" = "SNAPPY"
  val ZLIB: "ZLIB" = "ZLIB"

  @inline def values = js.Array[AthenaResultCompressionType](GZIP, SNAPPY, ZLIB)
}

/** The data storage format for Athena query results.
  */
type AthenaResultFormat = "PARQUET" | "ORC" | "AVRO" | "JSON" | "TEXTFILE"
object AthenaResultFormat {
  val PARQUET: "PARQUET" = "PARQUET"
  val ORC: "ORC" = "ORC"
  val AVRO: "AVRO" = "AVRO"
  val JSON: "JSON" = "JSON"
  val TEXTFILE: "TEXTFILE" = "TEXTFILE"

  @inline def values = js.Array[AthenaResultFormat](PARQUET, ORC, AVRO, JSON, TEXTFILE)
}

type AuthMode = "SSO" | "IAM"
object AuthMode {
  val SSO: "SSO" = "SSO"
  val IAM: "IAM" = "IAM"

  @inline def values = js.Array[AuthMode](SSO, IAM)
}

type AutoMLJobObjectiveType = "Maximize" | "Minimize"
object AutoMLJobObjectiveType {
  val Maximize: "Maximize" = "Maximize"
  val Minimize: "Minimize" = "Minimize"

  @inline def values = js.Array[AutoMLJobObjectiveType](Maximize, Minimize)
}

type AutoMLJobSecondaryStatus = "Starting" | "AnalyzingData" | "FeatureEngineering" | "ModelTuning" | "MaxCandidatesReached" | "Failed" | "Stopped" | "MaxAutoMLJobRuntimeReached" | "Stopping" | "CandidateDefinitionsGenerated" | "GeneratingExplainabilityReport" | "Completed" | "ExplainabilityError"
object AutoMLJobSecondaryStatus {
  val Starting: "Starting" = "Starting"
  val AnalyzingData: "AnalyzingData" = "AnalyzingData"
  val FeatureEngineering: "FeatureEngineering" = "FeatureEngineering"
  val ModelTuning: "ModelTuning" = "ModelTuning"
  val MaxCandidatesReached: "MaxCandidatesReached" = "MaxCandidatesReached"
  val Failed: "Failed" = "Failed"
  val Stopped: "Stopped" = "Stopped"
  val MaxAutoMLJobRuntimeReached: "MaxAutoMLJobRuntimeReached" = "MaxAutoMLJobRuntimeReached"
  val Stopping: "Stopping" = "Stopping"
  val CandidateDefinitionsGenerated: "CandidateDefinitionsGenerated" = "CandidateDefinitionsGenerated"
  val GeneratingExplainabilityReport: "GeneratingExplainabilityReport" = "GeneratingExplainabilityReport"
  val Completed: "Completed" = "Completed"
  val ExplainabilityError: "ExplainabilityError" = "ExplainabilityError"

  @inline def values = js.Array[AutoMLJobSecondaryStatus](
    Starting,
    AnalyzingData,
    FeatureEngineering,
    ModelTuning,
    MaxCandidatesReached,
    Failed,
    Stopped,
    MaxAutoMLJobRuntimeReached,
    Stopping,
    CandidateDefinitionsGenerated,
    GeneratingExplainabilityReport,
    Completed,
    ExplainabilityError
  )
}

type AutoMLJobStatus = "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping"
object AutoMLJobStatus {
  val Completed: "Completed" = "Completed"
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Stopped: "Stopped" = "Stopped"
  val Stopping: "Stopping" = "Stopping"

  @inline def values = js.Array[AutoMLJobStatus](Completed, InProgress, Failed, Stopped, Stopping)
}

type AutoMLMetricEnum = "Accuracy" | "MSE" | "F1" | "F1macro" | "AUC"
object AutoMLMetricEnum {
  val Accuracy: "Accuracy" = "Accuracy"
  val MSE: "MSE" = "MSE"
  val F1: "F1" = "F1"
  val F1macro: "F1macro" = "F1macro"
  val AUC: "AUC" = "AUC"

  @inline def values = js.Array[AutoMLMetricEnum](Accuracy, MSE, F1, F1macro, AUC)
}

type AutoMLS3DataType = "ManifestFile" | "S3Prefix"
object AutoMLS3DataType {
  val ManifestFile: "ManifestFile" = "ManifestFile"
  val S3Prefix: "S3Prefix" = "S3Prefix"

  @inline def values = js.Array[AutoMLS3DataType](ManifestFile, S3Prefix)
}

type AutoMLSortBy = "Name" | "CreationTime" | "Status"
object AutoMLSortBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"
  val Status: "Status" = "Status"

  @inline def values = js.Array[AutoMLSortBy](Name, CreationTime, Status)
}

type AutoMLSortOrder = "Ascending" | "Descending"
object AutoMLSortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[AutoMLSortOrder](Ascending, Descending)
}

type AwsManagedHumanLoopRequestSource = "AWS/Rekognition/DetectModerationLabels/Image/V3" | "AWS/Textract/AnalyzeDocument/Forms/V1"
object AwsManagedHumanLoopRequestSource {
  val `AWS/Rekognition/DetectModerationLabels/Image/V3`: "AWS/Rekognition/DetectModerationLabels/Image/V3" = "AWS/Rekognition/DetectModerationLabels/Image/V3"
  val `AWS/Textract/AnalyzeDocument/Forms/V1`: "AWS/Textract/AnalyzeDocument/Forms/V1" = "AWS/Textract/AnalyzeDocument/Forms/V1"

  @inline def values = js.Array[AwsManagedHumanLoopRequestSource](`AWS/Rekognition/DetectModerationLabels/Image/V3`, `AWS/Textract/AnalyzeDocument/Forms/V1`)
}

type BatchStrategy = "MultiRecord" | "SingleRecord"
object BatchStrategy {
  val MultiRecord: "MultiRecord" = "MultiRecord"
  val SingleRecord: "SingleRecord" = "SingleRecord"

  @inline def values = js.Array[BatchStrategy](MultiRecord, SingleRecord)
}

type BooleanOperator = "And" | "Or"
object BooleanOperator {
  val And: "And" = "And"
  val Or: "Or" = "Or"

  @inline def values = js.Array[BooleanOperator](And, Or)
}

type CandidateSortBy = "CreationTime" | "Status" | "FinalObjectiveMetricValue"
object CandidateSortBy {
  val CreationTime: "CreationTime" = "CreationTime"
  val Status: "Status" = "Status"
  val FinalObjectiveMetricValue: "FinalObjectiveMetricValue" = "FinalObjectiveMetricValue"

  @inline def values = js.Array[CandidateSortBy](CreationTime, Status, FinalObjectiveMetricValue)
}

type CandidateStatus = "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping"
object CandidateStatus {
  val Completed: "Completed" = "Completed"
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Stopped: "Stopped" = "Stopped"
  val Stopping: "Stopping" = "Stopping"

  @inline def values = js.Array[CandidateStatus](Completed, InProgress, Failed, Stopped, Stopping)
}

type CandidateStepType = "AWS::SageMaker::TrainingJob" | "AWS::SageMaker::TransformJob" | "AWS::SageMaker::ProcessingJob"
object CandidateStepType {
  val `AWS::SageMaker::TrainingJob`: "AWS::SageMaker::TrainingJob" = "AWS::SageMaker::TrainingJob"
  val `AWS::SageMaker::TransformJob`: "AWS::SageMaker::TransformJob" = "AWS::SageMaker::TransformJob"
  val `AWS::SageMaker::ProcessingJob`: "AWS::SageMaker::ProcessingJob" = "AWS::SageMaker::ProcessingJob"

  @inline def values = js.Array[CandidateStepType](`AWS::SageMaker::TrainingJob`, `AWS::SageMaker::TransformJob`, `AWS::SageMaker::ProcessingJob`)
}

type CapacitySizeType = "INSTANCE_COUNT" | "CAPACITY_PERCENT"
object CapacitySizeType {
  val INSTANCE_COUNT: "INSTANCE_COUNT" = "INSTANCE_COUNT"
  val CAPACITY_PERCENT: "CAPACITY_PERCENT" = "CAPACITY_PERCENT"

  @inline def values = js.Array[CapacitySizeType](INSTANCE_COUNT, CAPACITY_PERCENT)
}

type CaptureMode = "Input" | "Output"
object CaptureMode {
  val Input: "Input" = "Input"
  val Output: "Output" = "Output"

  @inline def values = js.Array[CaptureMode](Input, Output)
}

type CaptureStatus = "Started" | "Stopped"
object CaptureStatus {
  val Started: "Started" = "Started"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[CaptureStatus](Started, Stopped)
}

type CodeRepositorySortBy = "Name" | "CreationTime" | "LastModifiedTime"
object CodeRepositorySortBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"
  val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"

  @inline def values = js.Array[CodeRepositorySortBy](Name, CreationTime, LastModifiedTime)
}

type CodeRepositorySortOrder = "Ascending" | "Descending"
object CodeRepositorySortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[CodeRepositorySortOrder](Ascending, Descending)
}

type CompilationJobStatus = "INPROGRESS" | "COMPLETED" | "FAILED" | "STARTING" | "STOPPING" | "STOPPED"
object CompilationJobStatus {
  val INPROGRESS: "INPROGRESS" = "INPROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val STARTING: "STARTING" = "STARTING"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[CompilationJobStatus](INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING, STOPPED)
}

type CompressionType = "None" | "Gzip"
object CompressionType {
  val None: "None" = "None"
  val Gzip: "Gzip" = "Gzip"

  @inline def values = js.Array[CompressionType](None, Gzip)
}

type ConditionOutcome = "True" | "False"
object ConditionOutcome {
  val True: "True" = "True"
  val False: "False" = "False"

  @inline def values = js.Array[ConditionOutcome](True, False)
}

type ContainerMode = "SingleModel" | "MultiModel"
object ContainerMode {
  val SingleModel: "SingleModel" = "SingleModel"
  val MultiModel: "MultiModel" = "MultiModel"

  @inline def values = js.Array[ContainerMode](SingleModel, MultiModel)
}

type ContentClassifier = "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent"
object ContentClassifier {
  val FreeOfPersonallyIdentifiableInformation: "FreeOfPersonallyIdentifiableInformation" = "FreeOfPersonallyIdentifiableInformation"
  val FreeOfAdultContent: "FreeOfAdultContent" = "FreeOfAdultContent"

  @inline def values = js.Array[ContentClassifier](FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

type DataDistributionType = "FullyReplicated" | "ShardedByS3Key"
object DataDistributionType {
  val FullyReplicated: "FullyReplicated" = "FullyReplicated"
  val ShardedByS3Key: "ShardedByS3Key" = "ShardedByS3Key"

  @inline def values = js.Array[DataDistributionType](FullyReplicated, ShardedByS3Key)
}

type DetailedAlgorithmStatus = "NotStarted" | "InProgress" | "Completed" | "Failed"
object DetailedAlgorithmStatus {
  val NotStarted: "NotStarted" = "NotStarted"
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[DetailedAlgorithmStatus](NotStarted, InProgress, Completed, Failed)
}

type DetailedModelPackageStatus = "NotStarted" | "InProgress" | "Completed" | "Failed"
object DetailedModelPackageStatus {
  val NotStarted: "NotStarted" = "NotStarted"
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[DetailedModelPackageStatus](NotStarted, InProgress, Completed, Failed)
}

type DirectInternetAccess = "Enabled" | "Disabled"
object DirectInternetAccess {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[DirectInternetAccess](Enabled, Disabled)
}

type DomainStatus = "Deleting" | "Failed" | "InService" | "Pending" | "Updating" | "Update_Failed" | "Delete_Failed"
object DomainStatus {
  val Deleting: "Deleting" = "Deleting"
  val Failed: "Failed" = "Failed"
  val InService: "InService" = "InService"
  val Pending: "Pending" = "Pending"
  val Updating: "Updating" = "Updating"
  val Update_Failed: "Update_Failed" = "Update_Failed"
  val Delete_Failed: "Delete_Failed" = "Delete_Failed"

  @inline def values = js.Array[DomainStatus](Deleting, Failed, InService, Pending, Updating, Update_Failed, Delete_Failed)
}

type EdgePackagingJobStatus = "STARTING" | "INPROGRESS" | "COMPLETED" | "FAILED" | "STOPPING" | "STOPPED"
object EdgePackagingJobStatus {
  val STARTING: "STARTING" = "STARTING"
  val INPROGRESS: "INPROGRESS" = "INPROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"
  val STOPPING: "STOPPING" = "STOPPING"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[EdgePackagingJobStatus](STARTING, INPROGRESS, COMPLETED, FAILED, STOPPING, STOPPED)
}

type EndpointConfigSortKey = "Name" | "CreationTime"
object EndpointConfigSortKey {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[EndpointConfigSortKey](Name, CreationTime)
}

type EndpointSortKey = "Name" | "CreationTime" | "Status"
object EndpointSortKey {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"
  val Status: "Status" = "Status"

  @inline def values = js.Array[EndpointSortKey](Name, CreationTime, Status)
}

type EndpointStatus = "OutOfService" | "Creating" | "Updating" | "SystemUpdating" | "RollingBack" | "InService" | "Deleting" | "Failed"
object EndpointStatus {
  val OutOfService: "OutOfService" = "OutOfService"
  val Creating: "Creating" = "Creating"
  val Updating: "Updating" = "Updating"
  val SystemUpdating: "SystemUpdating" = "SystemUpdating"
  val RollingBack: "RollingBack" = "RollingBack"
  val InService: "InService" = "InService"
  val Deleting: "Deleting" = "Deleting"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[EndpointStatus](OutOfService, Creating, Updating, SystemUpdating, RollingBack, InService, Deleting, Failed)
}

type ExecutionStatus = "Pending" | "Completed" | "CompletedWithViolations" | "InProgress" | "Failed" | "Stopping" | "Stopped"
object ExecutionStatus {
  val Pending: "Pending" = "Pending"
  val Completed: "Completed" = "Completed"
  val CompletedWithViolations: "CompletedWithViolations" = "CompletedWithViolations"
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[ExecutionStatus](Pending, Completed, CompletedWithViolations, InProgress, Failed, Stopping, Stopped)
}

type FeatureGroupSortBy = "Name" | "FeatureGroupStatus" | "OfflineStoreStatus" | "CreationTime"
object FeatureGroupSortBy {
  val Name: "Name" = "Name"
  val FeatureGroupStatus: "FeatureGroupStatus" = "FeatureGroupStatus"
  val OfflineStoreStatus: "OfflineStoreStatus" = "OfflineStoreStatus"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[FeatureGroupSortBy](Name, FeatureGroupStatus, OfflineStoreStatus, CreationTime)
}

type FeatureGroupSortOrder = "Ascending" | "Descending"
object FeatureGroupSortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[FeatureGroupSortOrder](Ascending, Descending)
}

type FeatureGroupStatus = "Creating" | "Created" | "CreateFailed" | "Deleting" | "DeleteFailed"
object FeatureGroupStatus {
  val Creating: "Creating" = "Creating"
  val Created: "Created" = "Created"
  val CreateFailed: "CreateFailed" = "CreateFailed"
  val Deleting: "Deleting" = "Deleting"
  val DeleteFailed: "DeleteFailed" = "DeleteFailed"

  @inline def values = js.Array[FeatureGroupStatus](Creating, Created, CreateFailed, Deleting, DeleteFailed)
}

type FeatureType = "Integral" | "Fractional" | "String"
object FeatureType {
  val Integral: "Integral" = "Integral"
  val Fractional: "Fractional" = "Fractional"
  val String: "String" = "String"

  @inline def values = js.Array[FeatureType](Integral, Fractional, String)
}

type FileSystemAccessMode = "rw" | "ro"
object FileSystemAccessMode {
  val rw: "rw" = "rw"
  val ro: "ro" = "ro"

  @inline def values = js.Array[FileSystemAccessMode](rw, ro)
}

type FileSystemType = "EFS" | "FSxLustre"
object FileSystemType {
  val EFS: "EFS" = "EFS"
  val FSxLustre: "FSxLustre" = "FSxLustre"

  @inline def values = js.Array[FileSystemType](EFS, FSxLustre)
}

type FlowDefinitionStatus = "Initializing" | "Active" | "Failed" | "Deleting"
object FlowDefinitionStatus {
  val Initializing: "Initializing" = "Initializing"
  val Active: "Active" = "Active"
  val Failed: "Failed" = "Failed"
  val Deleting: "Deleting" = "Deleting"

  @inline def values = js.Array[FlowDefinitionStatus](Initializing, Active, Failed, Deleting)
}

type Framework = "TENSORFLOW" | "KERAS" | "MXNET" | "ONNX" | "PYTORCH" | "XGBOOST" | "TFLITE" | "DARKNET" | "SKLEARN"
object Framework {
  val TENSORFLOW: "TENSORFLOW" = "TENSORFLOW"
  val KERAS: "KERAS" = "KERAS"
  val MXNET: "MXNET" = "MXNET"
  val ONNX: "ONNX" = "ONNX"
  val PYTORCH: "PYTORCH" = "PYTORCH"
  val XGBOOST: "XGBOOST" = "XGBOOST"
  val TFLITE: "TFLITE" = "TFLITE"
  val DARKNET: "DARKNET" = "DARKNET"
  val SKLEARN: "SKLEARN" = "SKLEARN"

  @inline def values = js.Array[Framework](TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST, TFLITE, DARKNET, SKLEARN)
}

type HumanTaskUiStatus = "Active" | "Deleting"
object HumanTaskUiStatus {
  val Active: "Active" = "Active"
  val Deleting: "Deleting" = "Deleting"

  @inline def values = js.Array[HumanTaskUiStatus](Active, Deleting)
}

type HyperParameterScalingType = "Auto" | "Linear" | "Logarithmic" | "ReverseLogarithmic"
object HyperParameterScalingType {
  val Auto: "Auto" = "Auto"
  val Linear: "Linear" = "Linear"
  val Logarithmic: "Logarithmic" = "Logarithmic"
  val ReverseLogarithmic: "ReverseLogarithmic" = "ReverseLogarithmic"

  @inline def values = js.Array[HyperParameterScalingType](Auto, Linear, Logarithmic, ReverseLogarithmic)
}

type HyperParameterTuningJobObjectiveType = "Maximize" | "Minimize"
object HyperParameterTuningJobObjectiveType {
  val Maximize: "Maximize" = "Maximize"
  val Minimize: "Minimize" = "Minimize"

  @inline def values = js.Array[HyperParameterTuningJobObjectiveType](Maximize, Minimize)
}

type HyperParameterTuningJobSortByOptions = "Name" | "Status" | "CreationTime"
object HyperParameterTuningJobSortByOptions {
  val Name: "Name" = "Name"
  val Status: "Status" = "Status"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[HyperParameterTuningJobSortByOptions](Name, Status, CreationTime)
}

type HyperParameterTuningJobStatus = "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping"
object HyperParameterTuningJobStatus {
  val Completed: "Completed" = "Completed"
  val InProgress: "InProgress" = "InProgress"
  val Failed: "Failed" = "Failed"
  val Stopped: "Stopped" = "Stopped"
  val Stopping: "Stopping" = "Stopping"

  @inline def values = js.Array[HyperParameterTuningJobStatus](Completed, InProgress, Failed, Stopped, Stopping)
}

/** The strategy hyperparameter tuning uses to find the best combination of hyperparameters for your model. Currently, the only supported value is <code>Bayesian</code>.
  */
type HyperParameterTuningJobStrategyType = "Bayesian" | "Random"
object HyperParameterTuningJobStrategyType {
  val Bayesian: "Bayesian" = "Bayesian"
  val Random: "Random" = "Random"

  @inline def values = js.Array[HyperParameterTuningJobStrategyType](Bayesian, Random)
}

type HyperParameterTuningJobWarmStartType = "IdenticalDataAndAlgorithm" | "TransferLearning"
object HyperParameterTuningJobWarmStartType {
  val IdenticalDataAndAlgorithm: "IdenticalDataAndAlgorithm" = "IdenticalDataAndAlgorithm"
  val TransferLearning: "TransferLearning" = "TransferLearning"

  @inline def values = js.Array[HyperParameterTuningJobWarmStartType](IdenticalDataAndAlgorithm, TransferLearning)
}

type ImageSortBy = "CREATION_TIME" | "LAST_MODIFIED_TIME" | "IMAGE_NAME"
object ImageSortBy {
  val CREATION_TIME: "CREATION_TIME" = "CREATION_TIME"
  val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"
  val IMAGE_NAME: "IMAGE_NAME" = "IMAGE_NAME"

  @inline def values = js.Array[ImageSortBy](CREATION_TIME, LAST_MODIFIED_TIME, IMAGE_NAME)
}

type ImageSortOrder = "ASCENDING" | "DESCENDING"
object ImageSortOrder {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[ImageSortOrder](ASCENDING, DESCENDING)
}

type ImageStatus = "CREATING" | "CREATED" | "CREATE_FAILED" | "UPDATING" | "UPDATE_FAILED" | "DELETING" | "DELETE_FAILED"
object ImageStatus {
  val CREATING: "CREATING" = "CREATING"
  val CREATED: "CREATED" = "CREATED"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val UPDATING: "UPDATING" = "UPDATING"
  val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  val DELETING: "DELETING" = "DELETING"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  @inline def values = js.Array[ImageStatus](CREATING, CREATED, CREATE_FAILED, UPDATING, UPDATE_FAILED, DELETING, DELETE_FAILED)
}

type ImageVersionSortBy = "CREATION_TIME" | "LAST_MODIFIED_TIME" | "VERSION"
object ImageVersionSortBy {
  val CREATION_TIME: "CREATION_TIME" = "CREATION_TIME"
  val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"
  val VERSION: "VERSION" = "VERSION"

  @inline def values = js.Array[ImageVersionSortBy](CREATION_TIME, LAST_MODIFIED_TIME, VERSION)
}

type ImageVersionSortOrder = "ASCENDING" | "DESCENDING"
object ImageVersionSortOrder {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[ImageVersionSortOrder](ASCENDING, DESCENDING)
}

type ImageVersionStatus = "CREATING" | "CREATED" | "CREATE_FAILED" | "DELETING" | "DELETE_FAILED"
object ImageVersionStatus {
  val CREATING: "CREATING" = "CREATING"
  val CREATED: "CREATED" = "CREATED"
  val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  val DELETING: "DELETING" = "DELETING"
  val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  @inline def values = js.Array[ImageVersionStatus](CREATING, CREATED, CREATE_FAILED, DELETING, DELETE_FAILED)
}

type InferenceExecutionMode = "Serial" | "Direct"
object InferenceExecutionMode {
  val Serial: "Serial" = "Serial"
  val Direct: "Direct" = "Direct"

  @inline def values = js.Array[InferenceExecutionMode](Serial, Direct)
}

type InputMode = "Pipe" | "File"
object InputMode {
  val Pipe: "Pipe" = "Pipe"
  val File: "File" = "File"

  @inline def values = js.Array[InputMode](Pipe, File)
}

type InstanceType = "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge"
object InstanceType {
  val `ml.t2.medium`: "ml.t2.medium" = "ml.t2.medium"
  val `ml.t2.large`: "ml.t2.large" = "ml.t2.large"
  val `ml.t2.xlarge`: "ml.t2.xlarge" = "ml.t2.xlarge"
  val `ml.t2.2xlarge`: "ml.t2.2xlarge" = "ml.t2.2xlarge"
  val `ml.t3.medium`: "ml.t3.medium" = "ml.t3.medium"
  val `ml.t3.large`: "ml.t3.large" = "ml.t3.large"
  val `ml.t3.xlarge`: "ml.t3.xlarge" = "ml.t3.xlarge"
  val `ml.t3.2xlarge`: "ml.t3.2xlarge" = "ml.t3.2xlarge"
  val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  val `ml.c5d.xlarge`: "ml.c5d.xlarge" = "ml.c5d.xlarge"
  val `ml.c5d.2xlarge`: "ml.c5d.2xlarge" = "ml.c5d.2xlarge"
  val `ml.c5d.4xlarge`: "ml.c5d.4xlarge" = "ml.c5d.4xlarge"
  val `ml.c5d.9xlarge`: "ml.c5d.9xlarge" = "ml.c5d.9xlarge"
  val `ml.c5d.18xlarge`: "ml.c5d.18xlarge" = "ml.c5d.18xlarge"
  val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"

  @inline def values = js.Array[InstanceType](
    `ml.t2.medium`,
    `ml.t2.large`,
    `ml.t2.xlarge`,
    `ml.t2.2xlarge`,
    `ml.t3.medium`,
    `ml.t3.large`,
    `ml.t3.xlarge`,
    `ml.t3.2xlarge`,
    `ml.m4.xlarge`,
    `ml.m4.2xlarge`,
    `ml.m4.4xlarge`,
    `ml.m4.10xlarge`,
    `ml.m4.16xlarge`,
    `ml.m5.xlarge`,
    `ml.m5.2xlarge`,
    `ml.m5.4xlarge`,
    `ml.m5.12xlarge`,
    `ml.m5.24xlarge`,
    `ml.c4.xlarge`,
    `ml.c4.2xlarge`,
    `ml.c4.4xlarge`,
    `ml.c4.8xlarge`,
    `ml.c5.xlarge`,
    `ml.c5.2xlarge`,
    `ml.c5.4xlarge`,
    `ml.c5.9xlarge`,
    `ml.c5.18xlarge`,
    `ml.c5d.xlarge`,
    `ml.c5d.2xlarge`,
    `ml.c5d.4xlarge`,
    `ml.c5d.9xlarge`,
    `ml.c5d.18xlarge`,
    `ml.p2.xlarge`,
    `ml.p2.8xlarge`,
    `ml.p2.16xlarge`,
    `ml.p3.2xlarge`,
    `ml.p3.8xlarge`,
    `ml.p3.16xlarge`
  )
}

type JoinSource = "Input" | "None"
object JoinSource {
  val Input: "Input" = "Input"
  val None: "None" = "None"

  @inline def values = js.Array[JoinSource](Input, None)
}

type LabelingJobStatus = "Initializing" | "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object LabelingJobStatus {
  val Initializing: "Initializing" = "Initializing"
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[LabelingJobStatus](Initializing, InProgress, Completed, Failed, Stopping, Stopped)
}

type ListCompilationJobsSortBy = "Name" | "CreationTime" | "Status"
object ListCompilationJobsSortBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"
  val Status: "Status" = "Status"

  @inline def values = js.Array[ListCompilationJobsSortBy](Name, CreationTime, Status)
}

type ListDeviceFleetsSortBy = "NAME" | "CREATION_TIME" | "LAST_MODIFIED_TIME"
object ListDeviceFleetsSortBy {
  val NAME: "NAME" = "NAME"
  val CREATION_TIME: "CREATION_TIME" = "CREATION_TIME"
  val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"

  @inline def values = js.Array[ListDeviceFleetsSortBy](NAME, CREATION_TIME, LAST_MODIFIED_TIME)
}

type ListEdgePackagingJobsSortBy = "NAME" | "MODEL_NAME" | "CREATION_TIME" | "LAST_MODIFIED_TIME" | "STATUS"
object ListEdgePackagingJobsSortBy {
  val NAME: "NAME" = "NAME"
  val MODEL_NAME: "MODEL_NAME" = "MODEL_NAME"
  val CREATION_TIME: "CREATION_TIME" = "CREATION_TIME"
  val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"
  val STATUS: "STATUS" = "STATUS"

  @inline def values = js.Array[ListEdgePackagingJobsSortBy](NAME, MODEL_NAME, CREATION_TIME, LAST_MODIFIED_TIME, STATUS)
}

type ListLabelingJobsForWorkteamSortByOptions = "CreationTime"
object ListLabelingJobsForWorkteamSortByOptions {
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[ListLabelingJobsForWorkteamSortByOptions](CreationTime)
}

type ListWorkforcesSortByOptions = "Name" | "CreateDate"
object ListWorkforcesSortByOptions {
  val Name: "Name" = "Name"
  val CreateDate: "CreateDate" = "CreateDate"

  @inline def values = js.Array[ListWorkforcesSortByOptions](Name, CreateDate)
}

type ListWorkteamsSortByOptions = "Name" | "CreateDate"
object ListWorkteamsSortByOptions {
  val Name: "Name" = "Name"
  val CreateDate: "CreateDate" = "CreateDate"

  @inline def values = js.Array[ListWorkteamsSortByOptions](Name, CreateDate)
}

type ModelApprovalStatus = "Approved" | "Rejected" | "PendingManualApproval"
object ModelApprovalStatus {
  val Approved: "Approved" = "Approved"
  val Rejected: "Rejected" = "Rejected"
  val PendingManualApproval: "PendingManualApproval" = "PendingManualApproval"

  @inline def values = js.Array[ModelApprovalStatus](Approved, Rejected, PendingManualApproval)
}

type ModelCacheSetting = "Enabled" | "Disabled"
object ModelCacheSetting {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[ModelCacheSetting](Enabled, Disabled)
}

type ModelPackageGroupSortBy = "Name" | "CreationTime"
object ModelPackageGroupSortBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[ModelPackageGroupSortBy](Name, CreationTime)
}

type ModelPackageGroupStatus = "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting" | "DeleteFailed"
object ModelPackageGroupStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Deleting: "Deleting" = "Deleting"
  val DeleteFailed: "DeleteFailed" = "DeleteFailed"

  @inline def values = js.Array[ModelPackageGroupStatus](Pending, InProgress, Completed, Failed, Deleting, DeleteFailed)
}

type ModelPackageSortBy = "Name" | "CreationTime"
object ModelPackageSortBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[ModelPackageSortBy](Name, CreationTime)
}

type ModelPackageStatus = "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting"
object ModelPackageStatus {
  val Pending: "Pending" = "Pending"
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Deleting: "Deleting" = "Deleting"

  @inline def values = js.Array[ModelPackageStatus](Pending, InProgress, Completed, Failed, Deleting)
}

type ModelPackageType = "Versioned" | "Unversioned" | "Both"
object ModelPackageType {
  val Versioned: "Versioned" = "Versioned"
  val Unversioned: "Unversioned" = "Unversioned"
  val Both: "Both" = "Both"

  @inline def values = js.Array[ModelPackageType](Versioned, Unversioned, Both)
}

type ModelSortKey = "Name" | "CreationTime"
object ModelSortKey {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[ModelSortKey](Name, CreationTime)
}

type MonitoringExecutionSortKey = "CreationTime" | "ScheduledTime" | "Status"
object MonitoringExecutionSortKey {
  val CreationTime: "CreationTime" = "CreationTime"
  val ScheduledTime: "ScheduledTime" = "ScheduledTime"
  val Status: "Status" = "Status"

  @inline def values = js.Array[MonitoringExecutionSortKey](CreationTime, ScheduledTime, Status)
}

type MonitoringJobDefinitionSortKey = "Name" | "CreationTime"
object MonitoringJobDefinitionSortKey {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[MonitoringJobDefinitionSortKey](Name, CreationTime)
}

type MonitoringProblemType = "BinaryClassification" | "MulticlassClassification" | "Regression"
object MonitoringProblemType {
  val BinaryClassification: "BinaryClassification" = "BinaryClassification"
  val MulticlassClassification: "MulticlassClassification" = "MulticlassClassification"
  val Regression: "Regression" = "Regression"

  @inline def values = js.Array[MonitoringProblemType](BinaryClassification, MulticlassClassification, Regression)
}

type MonitoringScheduleSortKey = "Name" | "CreationTime" | "Status"
object MonitoringScheduleSortKey {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"
  val Status: "Status" = "Status"

  @inline def values = js.Array[MonitoringScheduleSortKey](Name, CreationTime, Status)
}

type MonitoringType = "DataQuality" | "ModelQuality" | "ModelBias" | "ModelExplainability"
object MonitoringType {
  val DataQuality: "DataQuality" = "DataQuality"
  val ModelQuality: "ModelQuality" = "ModelQuality"
  val ModelBias: "ModelBias" = "ModelBias"
  val ModelExplainability: "ModelExplainability" = "ModelExplainability"

  @inline def values = js.Array[MonitoringType](DataQuality, ModelQuality, ModelBias, ModelExplainability)
}

type NotebookInstanceAcceleratorType = "ml.eia1.medium" | "ml.eia1.large" | "ml.eia1.xlarge" | "ml.eia2.medium" | "ml.eia2.large" | "ml.eia2.xlarge"
object NotebookInstanceAcceleratorType {
  val `ml.eia1.medium`: "ml.eia1.medium" = "ml.eia1.medium"
  val `ml.eia1.large`: "ml.eia1.large" = "ml.eia1.large"
  val `ml.eia1.xlarge`: "ml.eia1.xlarge" = "ml.eia1.xlarge"
  val `ml.eia2.medium`: "ml.eia2.medium" = "ml.eia2.medium"
  val `ml.eia2.large`: "ml.eia2.large" = "ml.eia2.large"
  val `ml.eia2.xlarge`: "ml.eia2.xlarge" = "ml.eia2.xlarge"

  @inline def values = js.Array[NotebookInstanceAcceleratorType](`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`)
}

type NotebookInstanceLifecycleConfigSortKey = "Name" | "CreationTime" | "LastModifiedTime"
object NotebookInstanceLifecycleConfigSortKey {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"
  val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"

  @inline def values = js.Array[NotebookInstanceLifecycleConfigSortKey](Name, CreationTime, LastModifiedTime)
}

type NotebookInstanceLifecycleConfigSortOrder = "Ascending" | "Descending"
object NotebookInstanceLifecycleConfigSortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[NotebookInstanceLifecycleConfigSortOrder](Ascending, Descending)
}

type NotebookInstanceSortKey = "Name" | "CreationTime" | "Status"
object NotebookInstanceSortKey {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"
  val Status: "Status" = "Status"

  @inline def values = js.Array[NotebookInstanceSortKey](Name, CreationTime, Status)
}

type NotebookInstanceSortOrder = "Ascending" | "Descending"
object NotebookInstanceSortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[NotebookInstanceSortOrder](Ascending, Descending)
}

type NotebookInstanceStatus = "Pending" | "InService" | "Stopping" | "Stopped" | "Failed" | "Deleting" | "Updating"
object NotebookInstanceStatus {
  val Pending: "Pending" = "Pending"
  val InService: "InService" = "InService"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"
  val Failed: "Failed" = "Failed"
  val Deleting: "Deleting" = "Deleting"
  val Updating: "Updating" = "Updating"

  @inline def values = js.Array[NotebookInstanceStatus](Pending, InService, Stopping, Stopped, Failed, Deleting, Updating)
}

type NotebookOutputOption = "Allowed" | "Disabled"
object NotebookOutputOption {
  val Allowed: "Allowed" = "Allowed"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[NotebookOutputOption](Allowed, Disabled)
}

type ObjectiveStatus = "Succeeded" | "Pending" | "Failed"
object ObjectiveStatus {
  val Succeeded: "Succeeded" = "Succeeded"
  val Pending: "Pending" = "Pending"
  val Failed: "Failed" = "Failed"

  @inline def values = js.Array[ObjectiveStatus](Succeeded, Pending, Failed)
}

type OfflineStoreStatusValue = "Active" | "Blocked" | "Disabled"
object OfflineStoreStatusValue {
  val Active: "Active" = "Active"
  val Blocked: "Blocked" = "Blocked"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[OfflineStoreStatusValue](Active, Blocked, Disabled)
}

type Operator = "Equals" | "NotEquals" | "GreaterThan" | "GreaterThanOrEqualTo" | "LessThan" | "LessThanOrEqualTo" | "Contains" | "Exists" | "NotExists" | "In"
object Operator {
  val Equals: "Equals" = "Equals"
  val NotEquals: "NotEquals" = "NotEquals"
  val GreaterThan: "GreaterThan" = "GreaterThan"
  val GreaterThanOrEqualTo: "GreaterThanOrEqualTo" = "GreaterThanOrEqualTo"
  val LessThan: "LessThan" = "LessThan"
  val LessThanOrEqualTo: "LessThanOrEqualTo" = "LessThanOrEqualTo"
  val Contains: "Contains" = "Contains"
  val Exists: "Exists" = "Exists"
  val NotExists: "NotExists" = "NotExists"
  val In: "In" = "In"

  @inline def values = js.Array[Operator](Equals, NotEquals, GreaterThan, GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains, Exists, NotExists, In)
}

type OrderKey = "Ascending" | "Descending"
object OrderKey {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[OrderKey](Ascending, Descending)
}

type ParameterType = "Integer" | "Continuous" | "Categorical" | "FreeText"
object ParameterType {
  val Integer: "Integer" = "Integer"
  val Continuous: "Continuous" = "Continuous"
  val Categorical: "Categorical" = "Categorical"
  val FreeText: "FreeText" = "FreeText"

  @inline def values = js.Array[ParameterType](Integer, Continuous, Categorical, FreeText)
}

type PipelineExecutionStatus = "Executing" | "Stopping" | "Stopped" | "Failed" | "Succeeded"
object PipelineExecutionStatus {
  val Executing: "Executing" = "Executing"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"
  val Failed: "Failed" = "Failed"
  val Succeeded: "Succeeded" = "Succeeded"

  @inline def values = js.Array[PipelineExecutionStatus](Executing, Stopping, Stopped, Failed, Succeeded)
}

type PipelineStatus = "Active"
object PipelineStatus {
  val Active: "Active" = "Active"

  @inline def values = js.Array[PipelineStatus](Active)
}

type ProblemType = "BinaryClassification" | "MulticlassClassification" | "Regression"
object ProblemType {
  val BinaryClassification: "BinaryClassification" = "BinaryClassification"
  val MulticlassClassification: "MulticlassClassification" = "MulticlassClassification"
  val Regression: "Regression" = "Regression"

  @inline def values = js.Array[ProblemType](BinaryClassification, MulticlassClassification, Regression)
}

type ProcessingInstanceType = "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.r5.large" | "ml.r5.xlarge" | "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.8xlarge" | "ml.r5.12xlarge" | "ml.r5.16xlarge" | "ml.r5.24xlarge"
object ProcessingInstanceType {
  val `ml.t3.medium`: "ml.t3.medium" = "ml.t3.medium"
  val `ml.t3.large`: "ml.t3.large" = "ml.t3.large"
  val `ml.t3.xlarge`: "ml.t3.xlarge" = "ml.t3.xlarge"
  val `ml.t3.2xlarge`: "ml.t3.2xlarge" = "ml.t3.2xlarge"
  val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  val `ml.r5.large`: "ml.r5.large" = "ml.r5.large"
  val `ml.r5.xlarge`: "ml.r5.xlarge" = "ml.r5.xlarge"
  val `ml.r5.2xlarge`: "ml.r5.2xlarge" = "ml.r5.2xlarge"
  val `ml.r5.4xlarge`: "ml.r5.4xlarge" = "ml.r5.4xlarge"
  val `ml.r5.8xlarge`: "ml.r5.8xlarge" = "ml.r5.8xlarge"
  val `ml.r5.12xlarge`: "ml.r5.12xlarge" = "ml.r5.12xlarge"
  val `ml.r5.16xlarge`: "ml.r5.16xlarge" = "ml.r5.16xlarge"
  val `ml.r5.24xlarge`: "ml.r5.24xlarge" = "ml.r5.24xlarge"

  @inline def values = js.Array[ProcessingInstanceType](
    `ml.t3.medium`,
    `ml.t3.large`,
    `ml.t3.xlarge`,
    `ml.t3.2xlarge`,
    `ml.m4.xlarge`,
    `ml.m4.2xlarge`,
    `ml.m4.4xlarge`,
    `ml.m4.10xlarge`,
    `ml.m4.16xlarge`,
    `ml.c4.xlarge`,
    `ml.c4.2xlarge`,
    `ml.c4.4xlarge`,
    `ml.c4.8xlarge`,
    `ml.p2.xlarge`,
    `ml.p2.8xlarge`,
    `ml.p2.16xlarge`,
    `ml.p3.2xlarge`,
    `ml.p3.8xlarge`,
    `ml.p3.16xlarge`,
    `ml.c5.xlarge`,
    `ml.c5.2xlarge`,
    `ml.c5.4xlarge`,
    `ml.c5.9xlarge`,
    `ml.c5.18xlarge`,
    `ml.m5.large`,
    `ml.m5.xlarge`,
    `ml.m5.2xlarge`,
    `ml.m5.4xlarge`,
    `ml.m5.12xlarge`,
    `ml.m5.24xlarge`,
    `ml.r5.large`,
    `ml.r5.xlarge`,
    `ml.r5.2xlarge`,
    `ml.r5.4xlarge`,
    `ml.r5.8xlarge`,
    `ml.r5.12xlarge`,
    `ml.r5.16xlarge`,
    `ml.r5.24xlarge`
  )
}

type ProcessingJobStatus = "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object ProcessingJobStatus {
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[ProcessingJobStatus](InProgress, Completed, Failed, Stopping, Stopped)
}

type ProcessingS3CompressionType = "None" | "Gzip"
object ProcessingS3CompressionType {
  val None: "None" = "None"
  val Gzip: "Gzip" = "Gzip"

  @inline def values = js.Array[ProcessingS3CompressionType](None, Gzip)
}

type ProcessingS3DataDistributionType = "FullyReplicated" | "ShardedByS3Key"
object ProcessingS3DataDistributionType {
  val FullyReplicated: "FullyReplicated" = "FullyReplicated"
  val ShardedByS3Key: "ShardedByS3Key" = "ShardedByS3Key"

  @inline def values = js.Array[ProcessingS3DataDistributionType](FullyReplicated, ShardedByS3Key)
}

type ProcessingS3DataType = "ManifestFile" | "S3Prefix"
object ProcessingS3DataType {
  val ManifestFile: "ManifestFile" = "ManifestFile"
  val S3Prefix: "S3Prefix" = "S3Prefix"

  @inline def values = js.Array[ProcessingS3DataType](ManifestFile, S3Prefix)
}

type ProcessingS3InputMode = "Pipe" | "File"
object ProcessingS3InputMode {
  val Pipe: "Pipe" = "Pipe"
  val File: "File" = "File"

  @inline def values = js.Array[ProcessingS3InputMode](Pipe, File)
}

type ProcessingS3UploadMode = "Continuous" | "EndOfJob"
object ProcessingS3UploadMode {
  val Continuous: "Continuous" = "Continuous"
  val EndOfJob: "EndOfJob" = "EndOfJob"

  @inline def values = js.Array[ProcessingS3UploadMode](Continuous, EndOfJob)
}

type ProductionVariantAcceleratorType = "ml.eia1.medium" | "ml.eia1.large" | "ml.eia1.xlarge" | "ml.eia2.medium" | "ml.eia2.large" | "ml.eia2.xlarge"
object ProductionVariantAcceleratorType {
  val `ml.eia1.medium`: "ml.eia1.medium" = "ml.eia1.medium"
  val `ml.eia1.large`: "ml.eia1.large" = "ml.eia1.large"
  val `ml.eia1.xlarge`: "ml.eia1.xlarge" = "ml.eia1.xlarge"
  val `ml.eia2.medium`: "ml.eia2.medium" = "ml.eia2.medium"
  val `ml.eia2.large`: "ml.eia2.large" = "ml.eia2.large"
  val `ml.eia2.xlarge`: "ml.eia2.xlarge" = "ml.eia2.xlarge"

  @inline def values = js.Array[ProductionVariantAcceleratorType](`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`)
}

type ProductionVariantInstanceType = "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.m5d.large" | "ml.m5d.xlarge" | "ml.m5d.2xlarge" | "ml.m5d.4xlarge" | "ml.m5d.12xlarge" | "ml.m5d.24xlarge" | "ml.c4.large" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.large" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.large" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.r5.large" | "ml.r5.xlarge" |
  "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.12xlarge" | "ml.r5.24xlarge" | "ml.r5d.large" | "ml.r5d.xlarge" | "ml.r5d.2xlarge" | "ml.r5d.4xlarge" | "ml.r5d.12xlarge" | "ml.r5d.24xlarge" | "ml.inf1.xlarge" | "ml.inf1.2xlarge" | "ml.inf1.6xlarge" | "ml.inf1.24xlarge"
object ProductionVariantInstanceType {
  val `ml.t2.medium`: "ml.t2.medium" = "ml.t2.medium"
  val `ml.t2.large`: "ml.t2.large" = "ml.t2.large"
  val `ml.t2.xlarge`: "ml.t2.xlarge" = "ml.t2.xlarge"
  val `ml.t2.2xlarge`: "ml.t2.2xlarge" = "ml.t2.2xlarge"
  val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  val `ml.m5d.large`: "ml.m5d.large" = "ml.m5d.large"
  val `ml.m5d.xlarge`: "ml.m5d.xlarge" = "ml.m5d.xlarge"
  val `ml.m5d.2xlarge`: "ml.m5d.2xlarge" = "ml.m5d.2xlarge"
  val `ml.m5d.4xlarge`: "ml.m5d.4xlarge" = "ml.m5d.4xlarge"
  val `ml.m5d.12xlarge`: "ml.m5d.12xlarge" = "ml.m5d.12xlarge"
  val `ml.m5d.24xlarge`: "ml.m5d.24xlarge" = "ml.m5d.24xlarge"
  val `ml.c4.large`: "ml.c4.large" = "ml.c4.large"
  val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  val `ml.c5.large`: "ml.c5.large" = "ml.c5.large"
  val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  val `ml.c5d.large`: "ml.c5d.large" = "ml.c5d.large"
  val `ml.c5d.xlarge`: "ml.c5d.xlarge" = "ml.c5d.xlarge"
  val `ml.c5d.2xlarge`: "ml.c5d.2xlarge" = "ml.c5d.2xlarge"
  val `ml.c5d.4xlarge`: "ml.c5d.4xlarge" = "ml.c5d.4xlarge"
  val `ml.c5d.9xlarge`: "ml.c5d.9xlarge" = "ml.c5d.9xlarge"
  val `ml.c5d.18xlarge`: "ml.c5d.18xlarge" = "ml.c5d.18xlarge"
  val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"
  val `ml.r5.large`: "ml.r5.large" = "ml.r5.large"
  val `ml.r5.xlarge`: "ml.r5.xlarge" = "ml.r5.xlarge"
  val `ml.r5.2xlarge`: "ml.r5.2xlarge" = "ml.r5.2xlarge"
  val `ml.r5.4xlarge`: "ml.r5.4xlarge" = "ml.r5.4xlarge"
  val `ml.r5.12xlarge`: "ml.r5.12xlarge" = "ml.r5.12xlarge"
  val `ml.r5.24xlarge`: "ml.r5.24xlarge" = "ml.r5.24xlarge"
  val `ml.r5d.large`: "ml.r5d.large" = "ml.r5d.large"
  val `ml.r5d.xlarge`: "ml.r5d.xlarge" = "ml.r5d.xlarge"
  val `ml.r5d.2xlarge`: "ml.r5d.2xlarge" = "ml.r5d.2xlarge"
  val `ml.r5d.4xlarge`: "ml.r5d.4xlarge" = "ml.r5d.4xlarge"
  val `ml.r5d.12xlarge`: "ml.r5d.12xlarge" = "ml.r5d.12xlarge"
  val `ml.r5d.24xlarge`: "ml.r5d.24xlarge" = "ml.r5d.24xlarge"
  val `ml.inf1.xlarge`: "ml.inf1.xlarge" = "ml.inf1.xlarge"
  val `ml.inf1.2xlarge`: "ml.inf1.2xlarge" = "ml.inf1.2xlarge"
  val `ml.inf1.6xlarge`: "ml.inf1.6xlarge" = "ml.inf1.6xlarge"
  val `ml.inf1.24xlarge`: "ml.inf1.24xlarge" = "ml.inf1.24xlarge"

  @inline def values = js.Array[ProductionVariantInstanceType](
    `ml.t2.medium`,
    `ml.t2.large`,
    `ml.t2.xlarge`,
    `ml.t2.2xlarge`,
    `ml.m4.xlarge`,
    `ml.m4.2xlarge`,
    `ml.m4.4xlarge`,
    `ml.m4.10xlarge`,
    `ml.m4.16xlarge`,
    `ml.m5.large`,
    `ml.m5.xlarge`,
    `ml.m5.2xlarge`,
    `ml.m5.4xlarge`,
    `ml.m5.12xlarge`,
    `ml.m5.24xlarge`,
    `ml.m5d.large`,
    `ml.m5d.xlarge`,
    `ml.m5d.2xlarge`,
    `ml.m5d.4xlarge`,
    `ml.m5d.12xlarge`,
    `ml.m5d.24xlarge`,
    `ml.c4.large`,
    `ml.c4.xlarge`,
    `ml.c4.2xlarge`,
    `ml.c4.4xlarge`,
    `ml.c4.8xlarge`,
    `ml.p2.xlarge`,
    `ml.p2.8xlarge`,
    `ml.p2.16xlarge`,
    `ml.p3.2xlarge`,
    `ml.p3.8xlarge`,
    `ml.p3.16xlarge`,
    `ml.c5.large`,
    `ml.c5.xlarge`,
    `ml.c5.2xlarge`,
    `ml.c5.4xlarge`,
    `ml.c5.9xlarge`,
    `ml.c5.18xlarge`,
    `ml.c5d.large`,
    `ml.c5d.xlarge`,
    `ml.c5d.2xlarge`,
    `ml.c5d.4xlarge`,
    `ml.c5d.9xlarge`,
    `ml.c5d.18xlarge`,
    `ml.g4dn.xlarge`,
    `ml.g4dn.2xlarge`,
    `ml.g4dn.4xlarge`,
    `ml.g4dn.8xlarge`,
    `ml.g4dn.12xlarge`,
    `ml.g4dn.16xlarge`,
    `ml.r5.large`,
    `ml.r5.xlarge`,
    `ml.r5.2xlarge`,
    `ml.r5.4xlarge`,
    `ml.r5.12xlarge`,
    `ml.r5.24xlarge`,
    `ml.r5d.large`,
    `ml.r5d.xlarge`,
    `ml.r5d.2xlarge`,
    `ml.r5d.4xlarge`,
    `ml.r5d.12xlarge`,
    `ml.r5d.24xlarge`,
    `ml.inf1.xlarge`,
    `ml.inf1.2xlarge`,
    `ml.inf1.6xlarge`,
    `ml.inf1.24xlarge`
  )
}

type ProfilingStatus = "Enabled" | "Disabled"
object ProfilingStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[ProfilingStatus](Enabled, Disabled)
}

type ProjectSortBy = "Name" | "CreationTime"
object ProjectSortBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[ProjectSortBy](Name, CreationTime)
}

type ProjectSortOrder = "Ascending" | "Descending"
object ProjectSortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[ProjectSortOrder](Ascending, Descending)
}

type ProjectStatus = "Pending" | "CreateInProgress" | "CreateCompleted" | "CreateFailed" | "DeleteInProgress" | "DeleteFailed" | "DeleteCompleted"
object ProjectStatus {
  val Pending: "Pending" = "Pending"
  val CreateInProgress: "CreateInProgress" = "CreateInProgress"
  val CreateCompleted: "CreateCompleted" = "CreateCompleted"
  val CreateFailed: "CreateFailed" = "CreateFailed"
  val DeleteInProgress: "DeleteInProgress" = "DeleteInProgress"
  val DeleteFailed: "DeleteFailed" = "DeleteFailed"
  val DeleteCompleted: "DeleteCompleted" = "DeleteCompleted"

  @inline def values = js.Array[ProjectStatus](Pending, CreateInProgress, CreateCompleted, CreateFailed, DeleteInProgress, DeleteFailed, DeleteCompleted)
}

type RecordWrapper = "None" | "RecordIO"
object RecordWrapper {
  val None: "None" = "None"
  val RecordIO: "RecordIO" = "RecordIO"

  @inline def values = js.Array[RecordWrapper](None, RecordIO)
}

/** The compression used for Redshift query results.
  */
type RedshiftResultCompressionType = "None" | "GZIP" | "BZIP2" | "ZSTD" | "SNAPPY"
object RedshiftResultCompressionType {
  val None: "None" = "None"
  val GZIP: "GZIP" = "GZIP"
  val BZIP2: "BZIP2" = "BZIP2"
  val ZSTD: "ZSTD" = "ZSTD"
  val SNAPPY: "SNAPPY" = "SNAPPY"

  @inline def values = js.Array[RedshiftResultCompressionType](None, GZIP, BZIP2, ZSTD, SNAPPY)
}

/** The data storage format for Redshift query results.
  */
type RedshiftResultFormat = "PARQUET" | "CSV"
object RedshiftResultFormat {
  val PARQUET: "PARQUET" = "PARQUET"
  val CSV: "CSV" = "CSV"

  @inline def values = js.Array[RedshiftResultFormat](PARQUET, CSV)
}

type RepositoryAccessMode = "Platform" | "Vpc"
object RepositoryAccessMode {
  val Platform: "Platform" = "Platform"
  val Vpc: "Vpc" = "Vpc"

  @inline def values = js.Array[RepositoryAccessMode](Platform, Vpc)
}

type ResourceType = "TrainingJob" | "Experiment" | "ExperimentTrial" | "ExperimentTrialComponent" | "Endpoint" | "ModelPackage" | "ModelPackageGroup" | "Pipeline" | "PipelineExecution" | "FeatureGroup"
object ResourceType {
  val TrainingJob: "TrainingJob" = "TrainingJob"
  val Experiment: "Experiment" = "Experiment"
  val ExperimentTrial: "ExperimentTrial" = "ExperimentTrial"
  val ExperimentTrialComponent: "ExperimentTrialComponent" = "ExperimentTrialComponent"
  val Endpoint: "Endpoint" = "Endpoint"
  val ModelPackage: "ModelPackage" = "ModelPackage"
  val ModelPackageGroup: "ModelPackageGroup" = "ModelPackageGroup"
  val Pipeline: "Pipeline" = "Pipeline"
  val PipelineExecution: "PipelineExecution" = "PipelineExecution"
  val FeatureGroup: "FeatureGroup" = "FeatureGroup"

  @inline def values = js.Array[ResourceType](TrainingJob, Experiment, ExperimentTrial, ExperimentTrialComponent, Endpoint, ModelPackage, ModelPackageGroup, Pipeline, PipelineExecution, FeatureGroup)
}

type RetentionType = "Retain" | "Delete"
object RetentionType {
  val Retain: "Retain" = "Retain"
  val Delete: "Delete" = "Delete"

  @inline def values = js.Array[RetentionType](Retain, Delete)
}

type RootAccess = "Enabled" | "Disabled"
object RootAccess {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[RootAccess](Enabled, Disabled)
}

type RuleEvaluationStatus = "InProgress" | "NoIssuesFound" | "IssuesFound" | "Error" | "Stopping" | "Stopped"
object RuleEvaluationStatus {
  val InProgress: "InProgress" = "InProgress"
  val NoIssuesFound: "NoIssuesFound" = "NoIssuesFound"
  val IssuesFound: "IssuesFound" = "IssuesFound"
  val Error: "Error" = "Error"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[RuleEvaluationStatus](InProgress, NoIssuesFound, IssuesFound, Error, Stopping, Stopped)
}

type S3DataDistribution = "FullyReplicated" | "ShardedByS3Key"
object S3DataDistribution {
  val FullyReplicated: "FullyReplicated" = "FullyReplicated"
  val ShardedByS3Key: "ShardedByS3Key" = "ShardedByS3Key"

  @inline def values = js.Array[S3DataDistribution](FullyReplicated, ShardedByS3Key)
}

type S3DataType = "ManifestFile" | "S3Prefix" | "AugmentedManifestFile"
object S3DataType {
  val ManifestFile: "ManifestFile" = "ManifestFile"
  val S3Prefix: "S3Prefix" = "S3Prefix"
  val AugmentedManifestFile: "AugmentedManifestFile" = "AugmentedManifestFile"

  @inline def values = js.Array[S3DataType](ManifestFile, S3Prefix, AugmentedManifestFile)
}

type SagemakerServicecatalogStatus = "Enabled" | "Disabled"
object SagemakerServicecatalogStatus {
  val Enabled: "Enabled" = "Enabled"
  val Disabled: "Disabled" = "Disabled"

  @inline def values = js.Array[SagemakerServicecatalogStatus](Enabled, Disabled)
}

type ScheduleStatus = "Pending" | "Failed" | "Scheduled" | "Stopped"
object ScheduleStatus {
  val Pending: "Pending" = "Pending"
  val Failed: "Failed" = "Failed"
  val Scheduled: "Scheduled" = "Scheduled"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[ScheduleStatus](Pending, Failed, Scheduled, Stopped)
}

type SearchSortOrder = "Ascending" | "Descending"
object SearchSortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[SearchSortOrder](Ascending, Descending)
}

type SecondaryStatus = "Starting" | "LaunchingMLInstances" | "PreparingTrainingStack" | "Downloading" | "DownloadingTrainingImage" | "Training" | "Uploading" | "Stopping" | "Stopped" | "MaxRuntimeExceeded" | "Completed" | "Failed" | "Interrupted" | "MaxWaitTimeExceeded" | "Updating"
object SecondaryStatus {
  val Starting: "Starting" = "Starting"
  val LaunchingMLInstances: "LaunchingMLInstances" = "LaunchingMLInstances"
  val PreparingTrainingStack: "PreparingTrainingStack" = "PreparingTrainingStack"
  val Downloading: "Downloading" = "Downloading"
  val DownloadingTrainingImage: "DownloadingTrainingImage" = "DownloadingTrainingImage"
  val Training: "Training" = "Training"
  val Uploading: "Uploading" = "Uploading"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"
  val MaxRuntimeExceeded: "MaxRuntimeExceeded" = "MaxRuntimeExceeded"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Interrupted: "Interrupted" = "Interrupted"
  val MaxWaitTimeExceeded: "MaxWaitTimeExceeded" = "MaxWaitTimeExceeded"
  val Updating: "Updating" = "Updating"

  @inline def values = js.Array[SecondaryStatus](
    Starting,
    LaunchingMLInstances,
    PreparingTrainingStack,
    Downloading,
    DownloadingTrainingImage,
    Training,
    Uploading,
    Stopping,
    Stopped,
    MaxRuntimeExceeded,
    Completed,
    Failed,
    Interrupted,
    MaxWaitTimeExceeded,
    Updating
  )
}

type SortActionsBy = "Name" | "CreationTime"
object SortActionsBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[SortActionsBy](Name, CreationTime)
}

type SortArtifactsBy = "CreationTime"
object SortArtifactsBy {
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[SortArtifactsBy](CreationTime)
}

type SortAssociationsBy = "SourceArn" | "DestinationArn" | "SourceType" | "DestinationType" | "CreationTime"
object SortAssociationsBy {
  val SourceArn: "SourceArn" = "SourceArn"
  val DestinationArn: "DestinationArn" = "DestinationArn"
  val SourceType: "SourceType" = "SourceType"
  val DestinationType: "DestinationType" = "DestinationType"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[SortAssociationsBy](SourceArn, DestinationArn, SourceType, DestinationType, CreationTime)
}

type SortBy = "Name" | "CreationTime" | "Status"
object SortBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"
  val Status: "Status" = "Status"

  @inline def values = js.Array[SortBy](Name, CreationTime, Status)
}

type SortContextsBy = "Name" | "CreationTime"
object SortContextsBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[SortContextsBy](Name, CreationTime)
}

type SortExperimentsBy = "Name" | "CreationTime"
object SortExperimentsBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[SortExperimentsBy](Name, CreationTime)
}

type SortOrder = "Ascending" | "Descending"
object SortOrder {
  val Ascending: "Ascending" = "Ascending"
  val Descending: "Descending" = "Descending"

  @inline def values = js.Array[SortOrder](Ascending, Descending)
}

type SortPipelineExecutionsBy = "CreationTime" | "PipelineExecutionArn"
object SortPipelineExecutionsBy {
  val CreationTime: "CreationTime" = "CreationTime"
  val PipelineExecutionArn: "PipelineExecutionArn" = "PipelineExecutionArn"

  @inline def values = js.Array[SortPipelineExecutionsBy](CreationTime, PipelineExecutionArn)
}

type SortPipelinesBy = "Name" | "CreationTime"
object SortPipelinesBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[SortPipelinesBy](Name, CreationTime)
}

type SortTrialComponentsBy = "Name" | "CreationTime"
object SortTrialComponentsBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[SortTrialComponentsBy](Name, CreationTime)
}

type SortTrialsBy = "Name" | "CreationTime"
object SortTrialsBy {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"

  @inline def values = js.Array[SortTrialsBy](Name, CreationTime)
}

type SplitType = "None" | "Line" | "RecordIO" | "TFRecord"
object SplitType {
  val None: "None" = "None"
  val Line: "Line" = "Line"
  val RecordIO: "RecordIO" = "RecordIO"
  val TFRecord: "TFRecord" = "TFRecord"

  @inline def values = js.Array[SplitType](None, Line, RecordIO, TFRecord)
}

type StepStatus = "Starting" | "Executing" | "Stopping" | "Stopped" | "Failed" | "Succeeded"
object StepStatus {
  val Starting: "Starting" = "Starting"
  val Executing: "Executing" = "Executing"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"
  val Failed: "Failed" = "Failed"
  val Succeeded: "Succeeded" = "Succeeded"

  @inline def values = js.Array[StepStatus](Starting, Executing, Stopping, Stopped, Failed, Succeeded)
}

type TargetDevice = "lambda" | "ml_m4" | "ml_m5" | "ml_c4" | "ml_c5" | "ml_p2" | "ml_p3" | "ml_g4dn" | "ml_inf1" | "ml_eia2" | "jetson_tx1" | "jetson_tx2" | "jetson_nano" | "jetson_xavier" | "rasp3b" | "imx8qm" | "deeplens" | "rk3399" | "rk3288" | "aisage" | "sbe_c" | "qcs605" | "qcs603" | "sitara_am57x" | "amba_cv22" | "x86_win32" | "x86_win64" | "coreml" | "jacinto_tda4vm"
object TargetDevice {
  val lambda: "lambda" = "lambda"
  val ml_m4: "ml_m4" = "ml_m4"
  val ml_m5: "ml_m5" = "ml_m5"
  val ml_c4: "ml_c4" = "ml_c4"
  val ml_c5: "ml_c5" = "ml_c5"
  val ml_p2: "ml_p2" = "ml_p2"
  val ml_p3: "ml_p3" = "ml_p3"
  val ml_g4dn: "ml_g4dn" = "ml_g4dn"
  val ml_inf1: "ml_inf1" = "ml_inf1"
  val ml_eia2: "ml_eia2" = "ml_eia2"
  val jetson_tx1: "jetson_tx1" = "jetson_tx1"
  val jetson_tx2: "jetson_tx2" = "jetson_tx2"
  val jetson_nano: "jetson_nano" = "jetson_nano"
  val jetson_xavier: "jetson_xavier" = "jetson_xavier"
  val rasp3b: "rasp3b" = "rasp3b"
  val imx8qm: "imx8qm" = "imx8qm"
  val deeplens: "deeplens" = "deeplens"
  val rk3399: "rk3399" = "rk3399"
  val rk3288: "rk3288" = "rk3288"
  val aisage: "aisage" = "aisage"
  val sbe_c: "sbe_c" = "sbe_c"
  val qcs605: "qcs605" = "qcs605"
  val qcs603: "qcs603" = "qcs603"
  val sitara_am57x: "sitara_am57x" = "sitara_am57x"
  val amba_cv22: "amba_cv22" = "amba_cv22"
  val x86_win32: "x86_win32" = "x86_win32"
  val x86_win64: "x86_win64" = "x86_win64"
  val coreml: "coreml" = "coreml"
  val jacinto_tda4vm: "jacinto_tda4vm" = "jacinto_tda4vm"

  @inline def values = js.Array[TargetDevice](
    lambda,
    ml_m4,
    ml_m5,
    ml_c4,
    ml_c5,
    ml_p2,
    ml_p3,
    ml_g4dn,
    ml_inf1,
    ml_eia2,
    jetson_tx1,
    jetson_tx2,
    jetson_nano,
    jetson_xavier,
    rasp3b,
    imx8qm,
    deeplens,
    rk3399,
    rk3288,
    aisage,
    sbe_c,
    qcs605,
    qcs603,
    sitara_am57x,
    amba_cv22,
    x86_win32,
    x86_win64,
    coreml,
    jacinto_tda4vm
  )
}

type TargetPlatformAccelerator = "INTEL_GRAPHICS" | "MALI" | "NVIDIA"
object TargetPlatformAccelerator {
  val INTEL_GRAPHICS: "INTEL_GRAPHICS" = "INTEL_GRAPHICS"
  val MALI: "MALI" = "MALI"
  val NVIDIA: "NVIDIA" = "NVIDIA"

  @inline def values = js.Array[TargetPlatformAccelerator](INTEL_GRAPHICS, MALI, NVIDIA)
}

type TargetPlatformArch = "X86_64" | "X86" | "ARM64" | "ARM_EABI" | "ARM_EABIHF"
object TargetPlatformArch {
  val X86_64: "X86_64" = "X86_64"
  val X86: "X86" = "X86"
  val ARM64: "ARM64" = "ARM64"
  val ARM_EABI: "ARM_EABI" = "ARM_EABI"
  val ARM_EABIHF: "ARM_EABIHF" = "ARM_EABIHF"

  @inline def values = js.Array[TargetPlatformArch](X86_64, X86, ARM64, ARM_EABI, ARM_EABIHF)
}

type TargetPlatformOs = "ANDROID" | "LINUX"
object TargetPlatformOs {
  val ANDROID: "ANDROID" = "ANDROID"
  val LINUX: "LINUX" = "LINUX"

  @inline def values = js.Array[TargetPlatformOs](ANDROID, LINUX)
}

type TrafficRoutingConfigType = "ALL_AT_ONCE" | "CANARY"
object TrafficRoutingConfigType {
  val ALL_AT_ONCE: "ALL_AT_ONCE" = "ALL_AT_ONCE"
  val CANARY: "CANARY" = "CANARY"

  @inline def values = js.Array[TrafficRoutingConfigType](ALL_AT_ONCE, CANARY)
}

type TrainingInputMode = "Pipe" | "File"
object TrainingInputMode {
  val Pipe: "Pipe" = "Pipe"
  val File: "File" = "File"

  @inline def values = js.Array[TrainingInputMode](Pipe, File)
}

type TrainingInstanceType = "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.p3dn.24xlarge" | "ml.p4d.24xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5n.xlarge" | "ml.c5n.2xlarge" | "ml.c5n.4xlarge" | "ml.c5n.9xlarge" | "ml.c5n.18xlarge"
object TrainingInstanceType {
  val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"
  val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  val `ml.p3dn.24xlarge`: "ml.p3dn.24xlarge" = "ml.p3dn.24xlarge"
  val `ml.p4d.24xlarge`: "ml.p4d.24xlarge" = "ml.p4d.24xlarge"
  val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  val `ml.c5n.xlarge`: "ml.c5n.xlarge" = "ml.c5n.xlarge"
  val `ml.c5n.2xlarge`: "ml.c5n.2xlarge" = "ml.c5n.2xlarge"
  val `ml.c5n.4xlarge`: "ml.c5n.4xlarge" = "ml.c5n.4xlarge"
  val `ml.c5n.9xlarge`: "ml.c5n.9xlarge" = "ml.c5n.9xlarge"
  val `ml.c5n.18xlarge`: "ml.c5n.18xlarge" = "ml.c5n.18xlarge"

  @inline def values = js.Array[TrainingInstanceType](
    `ml.m4.xlarge`,
    `ml.m4.2xlarge`,
    `ml.m4.4xlarge`,
    `ml.m4.10xlarge`,
    `ml.m4.16xlarge`,
    `ml.g4dn.xlarge`,
    `ml.g4dn.2xlarge`,
    `ml.g4dn.4xlarge`,
    `ml.g4dn.8xlarge`,
    `ml.g4dn.12xlarge`,
    `ml.g4dn.16xlarge`,
    `ml.m5.large`,
    `ml.m5.xlarge`,
    `ml.m5.2xlarge`,
    `ml.m5.4xlarge`,
    `ml.m5.12xlarge`,
    `ml.m5.24xlarge`,
    `ml.c4.xlarge`,
    `ml.c4.2xlarge`,
    `ml.c4.4xlarge`,
    `ml.c4.8xlarge`,
    `ml.p2.xlarge`,
    `ml.p2.8xlarge`,
    `ml.p2.16xlarge`,
    `ml.p3.2xlarge`,
    `ml.p3.8xlarge`,
    `ml.p3.16xlarge`,
    `ml.p3dn.24xlarge`,
    `ml.p4d.24xlarge`,
    `ml.c5.xlarge`,
    `ml.c5.2xlarge`,
    `ml.c5.4xlarge`,
    `ml.c5.9xlarge`,
    `ml.c5.18xlarge`,
    `ml.c5n.xlarge`,
    `ml.c5n.2xlarge`,
    `ml.c5n.4xlarge`,
    `ml.c5n.9xlarge`,
    `ml.c5n.18xlarge`
  )
}

type TrainingJobEarlyStoppingType = "Off" | "Auto"
object TrainingJobEarlyStoppingType {
  val Off: "Off" = "Off"
  val Auto: "Auto" = "Auto"

  @inline def values = js.Array[TrainingJobEarlyStoppingType](Off, Auto)
}

type TrainingJobSortByOptions = "Name" | "CreationTime" | "Status" | "FinalObjectiveMetricValue"
object TrainingJobSortByOptions {
  val Name: "Name" = "Name"
  val CreationTime: "CreationTime" = "CreationTime"
  val Status: "Status" = "Status"
  val FinalObjectiveMetricValue: "FinalObjectiveMetricValue" = "FinalObjectiveMetricValue"

  @inline def values = js.Array[TrainingJobSortByOptions](Name, CreationTime, Status, FinalObjectiveMetricValue)
}

type TrainingJobStatus = "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object TrainingJobStatus {
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[TrainingJobStatus](InProgress, Completed, Failed, Stopping, Stopped)
}

type TransformInstanceType = "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge"
object TransformInstanceType {
  val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"

  @inline def values = js.Array[TransformInstanceType](
    `ml.m4.xlarge`,
    `ml.m4.2xlarge`,
    `ml.m4.4xlarge`,
    `ml.m4.10xlarge`,
    `ml.m4.16xlarge`,
    `ml.c4.xlarge`,
    `ml.c4.2xlarge`,
    `ml.c4.4xlarge`,
    `ml.c4.8xlarge`,
    `ml.p2.xlarge`,
    `ml.p2.8xlarge`,
    `ml.p2.16xlarge`,
    `ml.p3.2xlarge`,
    `ml.p3.8xlarge`,
    `ml.p3.16xlarge`,
    `ml.c5.xlarge`,
    `ml.c5.2xlarge`,
    `ml.c5.4xlarge`,
    `ml.c5.9xlarge`,
    `ml.c5.18xlarge`,
    `ml.m5.large`,
    `ml.m5.xlarge`,
    `ml.m5.2xlarge`,
    `ml.m5.4xlarge`,
    `ml.m5.12xlarge`,
    `ml.m5.24xlarge`
  )
}

type TransformJobStatus = "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object TransformJobStatus {
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[TransformJobStatus](InProgress, Completed, Failed, Stopping, Stopped)
}

type TrialComponentPrimaryStatus = "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object TrialComponentPrimaryStatus {
  val InProgress: "InProgress" = "InProgress"
  val Completed: "Completed" = "Completed"
  val Failed: "Failed" = "Failed"
  val Stopping: "Stopping" = "Stopping"
  val Stopped: "Stopped" = "Stopped"

  @inline def values = js.Array[TrialComponentPrimaryStatus](InProgress, Completed, Failed, Stopping, Stopped)
}

type UserProfileSortKey = "CreationTime" | "LastModifiedTime"
object UserProfileSortKey {
  val CreationTime: "CreationTime" = "CreationTime"
  val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"

  @inline def values = js.Array[UserProfileSortKey](CreationTime, LastModifiedTime)
}

type UserProfileStatus = "Deleting" | "Failed" | "InService" | "Pending" | "Updating" | "Update_Failed" | "Delete_Failed"
object UserProfileStatus {
  val Deleting: "Deleting" = "Deleting"
  val Failed: "Failed" = "Failed"
  val InService: "InService" = "InService"
  val Pending: "Pending" = "Pending"
  val Updating: "Updating" = "Updating"
  val Update_Failed: "Update_Failed" = "Update_Failed"
  val Delete_Failed: "Delete_Failed" = "Delete_Failed"

  @inline def values = js.Array[UserProfileStatus](Deleting, Failed, InService, Pending, Updating, Update_Failed, Delete_Failed)
}

type VariantPropertyType = "DesiredInstanceCount" | "DesiredWeight" | "DataCaptureConfig"
object VariantPropertyType {
  val DesiredInstanceCount: "DesiredInstanceCount" = "DesiredInstanceCount"
  val DesiredWeight: "DesiredWeight" = "DesiredWeight"
  val DataCaptureConfig: "DataCaptureConfig" = "DataCaptureConfig"

  @inline def values = js.Array[VariantPropertyType](DesiredInstanceCount, DesiredWeight, DataCaptureConfig)
}
