package facade.amazonaws.services.sagemaker

import scalajs.js

type ActionStatus = "Unknown" | "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object ActionStatus {
  inline val Unknown: "Unknown" = "Unknown"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[ActionStatus] = js.Array(Unknown, InProgress, Completed, Failed, Stopping, Stopped)
}

type AlgorithmSortBy = "Name" | "CreationTime"
object AlgorithmSortBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[AlgorithmSortBy] = js.Array(Name, CreationTime)
}

type AlgorithmStatus = "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting"
object AlgorithmStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[AlgorithmStatus] = js.Array(Pending, InProgress, Completed, Failed, Deleting)
}

type AppImageConfigSortKey = "CreationTime" | "LastModifiedTime" | "Name"
object AppImageConfigSortKey {
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"
  inline val Name: "Name" = "Name"

  inline def values: js.Array[AppImageConfigSortKey] = js.Array(CreationTime, LastModifiedTime, Name)
}

type AppInstanceType = "system" | "ml.t3.micro" | "ml.t3.small" | "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.8xlarge" | "ml.m5.12xlarge" | "ml.m5.16xlarge" | "ml.m5.24xlarge" | "ml.m5d.large" | "ml.m5d.xlarge" | "ml.m5d.2xlarge" | "ml.m5d.4xlarge" | "ml.m5d.8xlarge" | "ml.m5d.12xlarge" | "ml.m5d.16xlarge" | "ml.m5d.24xlarge" | "ml.c5.large" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.12xlarge" | "ml.c5.18xlarge" | "ml.c5.24xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.p3dn.24xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.r5.large" | "ml.r5.xlarge" | "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.8xlarge" | "ml.r5.12xlarge" | "ml.r5.16xlarge" | "ml.r5.24xlarge"
object AppInstanceType {
  inline val system: "system" = "system"
  inline val `ml.t3.micro`: "ml.t3.micro" = "ml.t3.micro"
  inline val `ml.t3.small`: "ml.t3.small" = "ml.t3.small"
  inline val `ml.t3.medium`: "ml.t3.medium" = "ml.t3.medium"
  inline val `ml.t3.large`: "ml.t3.large" = "ml.t3.large"
  inline val `ml.t3.xlarge`: "ml.t3.xlarge" = "ml.t3.xlarge"
  inline val `ml.t3.2xlarge`: "ml.t3.2xlarge" = "ml.t3.2xlarge"
  inline val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  inline val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  inline val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  inline val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  inline val `ml.m5.8xlarge`: "ml.m5.8xlarge" = "ml.m5.8xlarge"
  inline val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  inline val `ml.m5.16xlarge`: "ml.m5.16xlarge" = "ml.m5.16xlarge"
  inline val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  inline val `ml.m5d.large`: "ml.m5d.large" = "ml.m5d.large"
  inline val `ml.m5d.xlarge`: "ml.m5d.xlarge" = "ml.m5d.xlarge"
  inline val `ml.m5d.2xlarge`: "ml.m5d.2xlarge" = "ml.m5d.2xlarge"
  inline val `ml.m5d.4xlarge`: "ml.m5d.4xlarge" = "ml.m5d.4xlarge"
  inline val `ml.m5d.8xlarge`: "ml.m5d.8xlarge" = "ml.m5d.8xlarge"
  inline val `ml.m5d.12xlarge`: "ml.m5d.12xlarge" = "ml.m5d.12xlarge"
  inline val `ml.m5d.16xlarge`: "ml.m5d.16xlarge" = "ml.m5d.16xlarge"
  inline val `ml.m5d.24xlarge`: "ml.m5d.24xlarge" = "ml.m5d.24xlarge"
  inline val `ml.c5.large`: "ml.c5.large" = "ml.c5.large"
  inline val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  inline val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  inline val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  inline val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  inline val `ml.c5.12xlarge`: "ml.c5.12xlarge" = "ml.c5.12xlarge"
  inline val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  inline val `ml.c5.24xlarge`: "ml.c5.24xlarge" = "ml.c5.24xlarge"
  inline val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  inline val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  inline val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  inline val `ml.p3dn.24xlarge`: "ml.p3dn.24xlarge" = "ml.p3dn.24xlarge"
  inline val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  inline val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  inline val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  inline val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  inline val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  inline val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"
  inline val `ml.r5.large`: "ml.r5.large" = "ml.r5.large"
  inline val `ml.r5.xlarge`: "ml.r5.xlarge" = "ml.r5.xlarge"
  inline val `ml.r5.2xlarge`: "ml.r5.2xlarge" = "ml.r5.2xlarge"
  inline val `ml.r5.4xlarge`: "ml.r5.4xlarge" = "ml.r5.4xlarge"
  inline val `ml.r5.8xlarge`: "ml.r5.8xlarge" = "ml.r5.8xlarge"
  inline val `ml.r5.12xlarge`: "ml.r5.12xlarge" = "ml.r5.12xlarge"
  inline val `ml.r5.16xlarge`: "ml.r5.16xlarge" = "ml.r5.16xlarge"
  inline val `ml.r5.24xlarge`: "ml.r5.24xlarge" = "ml.r5.24xlarge"

  inline def values: js.Array[AppInstanceType] = js.Array(
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
    `ml.m5d.large`,
    `ml.m5d.xlarge`,
    `ml.m5d.2xlarge`,
    `ml.m5d.4xlarge`,
    `ml.m5d.8xlarge`,
    `ml.m5d.12xlarge`,
    `ml.m5d.16xlarge`,
    `ml.m5d.24xlarge`,
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
    `ml.p3dn.24xlarge`,
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
    `ml.r5.8xlarge`,
    `ml.r5.12xlarge`,
    `ml.r5.16xlarge`,
    `ml.r5.24xlarge`
  )
}

type AppNetworkAccessType = "PublicInternetOnly" | "VpcOnly"
object AppNetworkAccessType {
  inline val PublicInternetOnly: "PublicInternetOnly" = "PublicInternetOnly"
  inline val VpcOnly: "VpcOnly" = "VpcOnly"

  inline def values: js.Array[AppNetworkAccessType] = js.Array(PublicInternetOnly, VpcOnly)
}

type AppSecurityGroupManagement = "Service" | "Customer"
object AppSecurityGroupManagement {
  inline val Service: "Service" = "Service"
  inline val Customer: "Customer" = "Customer"

  inline def values: js.Array[AppSecurityGroupManagement] = js.Array(Service, Customer)
}

type AppSortKey = "CreationTime"
object AppSortKey {
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[AppSortKey] = js.Array(CreationTime)
}

type AppStatus = "Deleted" | "Deleting" | "Failed" | "InService" | "Pending"
object AppStatus {
  inline val Deleted: "Deleted" = "Deleted"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Failed: "Failed" = "Failed"
  inline val InService: "InService" = "InService"
  inline val Pending: "Pending" = "Pending"

  inline def values: js.Array[AppStatus] = js.Array(Deleted, Deleting, Failed, InService, Pending)
}

type AppType = "JupyterServer" | "KernelGateway" | "TensorBoard" | "RStudioServerPro" | "RSessionGateway"
object AppType {
  inline val JupyterServer: "JupyterServer" = "JupyterServer"
  inline val KernelGateway: "KernelGateway" = "KernelGateway"
  inline val TensorBoard: "TensorBoard" = "TensorBoard"
  inline val RStudioServerPro: "RStudioServerPro" = "RStudioServerPro"
  inline val RSessionGateway: "RSessionGateway" = "RSessionGateway"

  inline def values: js.Array[AppType] = js.Array(JupyterServer, KernelGateway, TensorBoard, RStudioServerPro, RSessionGateway)
}

type ArtifactSourceIdType = "MD5Hash" | "S3ETag" | "S3Version" | "Custom"
object ArtifactSourceIdType {
  inline val MD5Hash: "MD5Hash" = "MD5Hash"
  inline val S3ETag: "S3ETag" = "S3ETag"
  inline val S3Version: "S3Version" = "S3Version"
  inline val Custom: "Custom" = "Custom"

  inline def values: js.Array[ArtifactSourceIdType] = js.Array(MD5Hash, S3ETag, S3Version, Custom)
}

type AssemblyType = "None" | "Line"
object AssemblyType {
  inline val None: "None" = "None"
  inline val Line: "Line" = "Line"

  inline def values: js.Array[AssemblyType] = js.Array(None, Line)
}

type AssociationEdgeType = "ContributedTo" | "AssociatedWith" | "DerivedFrom" | "Produced"
object AssociationEdgeType {
  inline val ContributedTo: "ContributedTo" = "ContributedTo"
  inline val AssociatedWith: "AssociatedWith" = "AssociatedWith"
  inline val DerivedFrom: "DerivedFrom" = "DerivedFrom"
  inline val Produced: "Produced" = "Produced"

  inline def values: js.Array[AssociationEdgeType] = js.Array(ContributedTo, AssociatedWith, DerivedFrom, Produced)
}

/** The compression used for Athena query results.
  */
type AthenaResultCompressionType = "GZIP" | "SNAPPY" | "ZLIB"
object AthenaResultCompressionType {
  inline val GZIP: "GZIP" = "GZIP"
  inline val SNAPPY: "SNAPPY" = "SNAPPY"
  inline val ZLIB: "ZLIB" = "ZLIB"

  inline def values: js.Array[AthenaResultCompressionType] = js.Array(GZIP, SNAPPY, ZLIB)
}

/** The data storage format for Athena query results.
  */
type AthenaResultFormat = "PARQUET" | "ORC" | "AVRO" | "JSON" | "TEXTFILE"
object AthenaResultFormat {
  inline val PARQUET: "PARQUET" = "PARQUET"
  inline val ORC: "ORC" = "ORC"
  inline val AVRO: "AVRO" = "AVRO"
  inline val JSON: "JSON" = "JSON"
  inline val TEXTFILE: "TEXTFILE" = "TEXTFILE"

  inline def values: js.Array[AthenaResultFormat] = js.Array(PARQUET, ORC, AVRO, JSON, TEXTFILE)
}

type AuthMode = "SSO" | "IAM"
object AuthMode {
  inline val SSO: "SSO" = "SSO"
  inline val IAM: "IAM" = "IAM"

  inline def values: js.Array[AuthMode] = js.Array(SSO, IAM)
}

type AutoMLJobObjectiveType = "Maximize" | "Minimize"
object AutoMLJobObjectiveType {
  inline val Maximize: "Maximize" = "Maximize"
  inline val Minimize: "Minimize" = "Minimize"

  inline def values: js.Array[AutoMLJobObjectiveType] = js.Array(Maximize, Minimize)
}

type AutoMLJobSecondaryStatus = "Starting" | "AnalyzingData" | "FeatureEngineering" | "ModelTuning" | "MaxCandidatesReached" | "Failed" | "Stopped" | "MaxAutoMLJobRuntimeReached" | "Stopping" | "CandidateDefinitionsGenerated" | "GeneratingExplainabilityReport" | "Completed" | "ExplainabilityError" | "DeployingModel" | "ModelDeploymentError"
object AutoMLJobSecondaryStatus {
  inline val Starting: "Starting" = "Starting"
  inline val AnalyzingData: "AnalyzingData" = "AnalyzingData"
  inline val FeatureEngineering: "FeatureEngineering" = "FeatureEngineering"
  inline val ModelTuning: "ModelTuning" = "ModelTuning"
  inline val MaxCandidatesReached: "MaxCandidatesReached" = "MaxCandidatesReached"
  inline val Failed: "Failed" = "Failed"
  inline val Stopped: "Stopped" = "Stopped"
  inline val MaxAutoMLJobRuntimeReached: "MaxAutoMLJobRuntimeReached" = "MaxAutoMLJobRuntimeReached"
  inline val Stopping: "Stopping" = "Stopping"
  inline val CandidateDefinitionsGenerated: "CandidateDefinitionsGenerated" = "CandidateDefinitionsGenerated"
  inline val GeneratingExplainabilityReport: "GeneratingExplainabilityReport" = "GeneratingExplainabilityReport"
  inline val Completed: "Completed" = "Completed"
  inline val ExplainabilityError: "ExplainabilityError" = "ExplainabilityError"
  inline val DeployingModel: "DeployingModel" = "DeployingModel"
  inline val ModelDeploymentError: "ModelDeploymentError" = "ModelDeploymentError"

  inline def values: js.Array[AutoMLJobSecondaryStatus] = js.Array(
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
    ExplainabilityError,
    DeployingModel,
    ModelDeploymentError
  )
}

type AutoMLJobStatus = "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping"
object AutoMLJobStatus {
  inline val Completed: "Completed" = "Completed"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Stopping: "Stopping" = "Stopping"

  inline def values: js.Array[AutoMLJobStatus] = js.Array(Completed, InProgress, Failed, Stopped, Stopping)
}

type AutoMLMetricEnum = "Accuracy" | "MSE" | "F1" | "F1macro" | "AUC"
object AutoMLMetricEnum {
  inline val Accuracy: "Accuracy" = "Accuracy"
  inline val MSE: "MSE" = "MSE"
  inline val F1: "F1" = "F1"
  inline val F1macro: "F1macro" = "F1macro"
  inline val AUC: "AUC" = "AUC"

  inline def values: js.Array[AutoMLMetricEnum] = js.Array(Accuracy, MSE, F1, F1macro, AUC)
}

type AutoMLS3DataType = "ManifestFile" | "S3Prefix"
object AutoMLS3DataType {
  inline val ManifestFile: "ManifestFile" = "ManifestFile"
  inline val S3Prefix: "S3Prefix" = "S3Prefix"

  inline def values: js.Array[AutoMLS3DataType] = js.Array(ManifestFile, S3Prefix)
}

type AutoMLSortBy = "Name" | "CreationTime" | "Status"
object AutoMLSortBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val Status: "Status" = "Status"

  inline def values: js.Array[AutoMLSortBy] = js.Array(Name, CreationTime, Status)
}

type AutoMLSortOrder = "Ascending" | "Descending"
object AutoMLSortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[AutoMLSortOrder] = js.Array(Ascending, Descending)
}

type AwsManagedHumanLoopRequestSource = "AWS/Rekognition/DetectModerationLabels/Image/V3" | "AWS/Textract/AnalyzeDocument/Forms/V1"
object AwsManagedHumanLoopRequestSource {
  inline val `AWS/Rekognition/DetectModerationLabels/Image/V3`: "AWS/Rekognition/DetectModerationLabels/Image/V3" = "AWS/Rekognition/DetectModerationLabels/Image/V3"
  inline val `AWS/Textract/AnalyzeDocument/Forms/V1`: "AWS/Textract/AnalyzeDocument/Forms/V1" = "AWS/Textract/AnalyzeDocument/Forms/V1"

  inline def values: js.Array[AwsManagedHumanLoopRequestSource] = js.Array(`AWS/Rekognition/DetectModerationLabels/Image/V3`, `AWS/Textract/AnalyzeDocument/Forms/V1`)
}

type BatchStrategy = "MultiRecord" | "SingleRecord"
object BatchStrategy {
  inline val MultiRecord: "MultiRecord" = "MultiRecord"
  inline val SingleRecord: "SingleRecord" = "SingleRecord"

  inline def values: js.Array[BatchStrategy] = js.Array(MultiRecord, SingleRecord)
}

type BooleanOperator = "And" | "Or"
object BooleanOperator {
  inline val And: "And" = "And"
  inline val Or: "Or" = "Or"

  inline def values: js.Array[BooleanOperator] = js.Array(And, Or)
}

type CandidateSortBy = "CreationTime" | "Status" | "FinalObjectiveMetricValue"
object CandidateSortBy {
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val Status: "Status" = "Status"
  inline val FinalObjectiveMetricValue: "FinalObjectiveMetricValue" = "FinalObjectiveMetricValue"

  inline def values: js.Array[CandidateSortBy] = js.Array(CreationTime, Status, FinalObjectiveMetricValue)
}

type CandidateStatus = "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping"
object CandidateStatus {
  inline val Completed: "Completed" = "Completed"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Stopping: "Stopping" = "Stopping"

  inline def values: js.Array[CandidateStatus] = js.Array(Completed, InProgress, Failed, Stopped, Stopping)
}

type CandidateStepType = "AWS::SageMaker::TrainingJob" | "AWS::SageMaker::TransformJob" | "AWS::SageMaker::ProcessingJob"
object CandidateStepType {
  inline val `AWS::SageMaker::TrainingJob`: "AWS::SageMaker::TrainingJob" = "AWS::SageMaker::TrainingJob"
  inline val `AWS::SageMaker::TransformJob`: "AWS::SageMaker::TransformJob" = "AWS::SageMaker::TransformJob"
  inline val `AWS::SageMaker::ProcessingJob`: "AWS::SageMaker::ProcessingJob" = "AWS::SageMaker::ProcessingJob"

  inline def values: js.Array[CandidateStepType] = js.Array(`AWS::SageMaker::TrainingJob`, `AWS::SageMaker::TransformJob`, `AWS::SageMaker::ProcessingJob`)
}

type CapacitySizeType = "INSTANCE_COUNT" | "CAPACITY_PERCENT"
object CapacitySizeType {
  inline val INSTANCE_COUNT: "INSTANCE_COUNT" = "INSTANCE_COUNT"
  inline val CAPACITY_PERCENT: "CAPACITY_PERCENT" = "CAPACITY_PERCENT"

  inline def values: js.Array[CapacitySizeType] = js.Array(INSTANCE_COUNT, CAPACITY_PERCENT)
}

type CaptureMode = "Input" | "Output"
object CaptureMode {
  inline val Input: "Input" = "Input"
  inline val Output: "Output" = "Output"

  inline def values: js.Array[CaptureMode] = js.Array(Input, Output)
}

type CaptureStatus = "Started" | "Stopped"
object CaptureStatus {
  inline val Started: "Started" = "Started"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[CaptureStatus] = js.Array(Started, Stopped)
}

type CodeRepositorySortBy = "Name" | "CreationTime" | "LastModifiedTime"
object CodeRepositorySortBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"

  inline def values: js.Array[CodeRepositorySortBy] = js.Array(Name, CreationTime, LastModifiedTime)
}

type CodeRepositorySortOrder = "Ascending" | "Descending"
object CodeRepositorySortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[CodeRepositorySortOrder] = js.Array(Ascending, Descending)
}

type CompilationJobStatus = "INPROGRESS" | "COMPLETED" | "FAILED" | "STARTING" | "STOPPING" | "STOPPED"
object CompilationJobStatus {
  inline val INPROGRESS: "INPROGRESS" = "INPROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STARTING: "STARTING" = "STARTING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[CompilationJobStatus] = js.Array(INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING, STOPPED)
}

type CompressionType = "None" | "Gzip"
object CompressionType {
  inline val None: "None" = "None"
  inline val Gzip: "Gzip" = "Gzip"

  inline def values: js.Array[CompressionType] = js.Array(None, Gzip)
}

type ConditionOutcome = "True" | "False"
object ConditionOutcome {
  inline val True: "True" = "True"
  inline val False: "False" = "False"

  inline def values: js.Array[ConditionOutcome] = js.Array(True, False)
}

type ContainerMode = "SingleModel" | "MultiModel"
object ContainerMode {
  inline val SingleModel: "SingleModel" = "SingleModel"
  inline val MultiModel: "MultiModel" = "MultiModel"

  inline def values: js.Array[ContainerMode] = js.Array(SingleModel, MultiModel)
}

type ContentClassifier = "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent"
object ContentClassifier {
  inline val FreeOfPersonallyIdentifiableInformation: "FreeOfPersonallyIdentifiableInformation" = "FreeOfPersonallyIdentifiableInformation"
  inline val FreeOfAdultContent: "FreeOfAdultContent" = "FreeOfAdultContent"

  inline def values: js.Array[ContentClassifier] = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

type DataDistributionType = "FullyReplicated" | "ShardedByS3Key"
object DataDistributionType {
  inline val FullyReplicated: "FullyReplicated" = "FullyReplicated"
  inline val ShardedByS3Key: "ShardedByS3Key" = "ShardedByS3Key"

  inline def values: js.Array[DataDistributionType] = js.Array(FullyReplicated, ShardedByS3Key)
}

type DetailedAlgorithmStatus = "NotStarted" | "InProgress" | "Completed" | "Failed"
object DetailedAlgorithmStatus {
  inline val NotStarted: "NotStarted" = "NotStarted"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[DetailedAlgorithmStatus] = js.Array(NotStarted, InProgress, Completed, Failed)
}

type DetailedModelPackageStatus = "NotStarted" | "InProgress" | "Completed" | "Failed"
object DetailedModelPackageStatus {
  inline val NotStarted: "NotStarted" = "NotStarted"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[DetailedModelPackageStatus] = js.Array(NotStarted, InProgress, Completed, Failed)
}

type DirectInternetAccess = "Enabled" | "Disabled"
object DirectInternetAccess {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[DirectInternetAccess] = js.Array(Enabled, Disabled)
}

type Direction = "Both" | "Ascendants" | "Descendants"
object Direction {
  inline val Both: "Both" = "Both"
  inline val Ascendants: "Ascendants" = "Ascendants"
  inline val Descendants: "Descendants" = "Descendants"

  inline def values: js.Array[Direction] = js.Array(Both, Ascendants, Descendants)
}

type DomainStatus = "Deleting" | "Failed" | "InService" | "Pending" | "Updating" | "Update_Failed" | "Delete_Failed"
object DomainStatus {
  inline val Deleting: "Deleting" = "Deleting"
  inline val Failed: "Failed" = "Failed"
  inline val InService: "InService" = "InService"
  inline val Pending: "Pending" = "Pending"
  inline val Updating: "Updating" = "Updating"
  inline val Update_Failed: "Update_Failed" = "Update_Failed"
  inline val Delete_Failed: "Delete_Failed" = "Delete_Failed"

  inline def values: js.Array[DomainStatus] = js.Array(Deleting, Failed, InService, Pending, Updating, Update_Failed, Delete_Failed)
}

type EdgePackagingJobStatus = "STARTING" | "INPROGRESS" | "COMPLETED" | "FAILED" | "STOPPING" | "STOPPED"
object EdgePackagingJobStatus {
  inline val STARTING: "STARTING" = "STARTING"
  inline val INPROGRESS: "INPROGRESS" = "INPROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[EdgePackagingJobStatus] = js.Array(STARTING, INPROGRESS, COMPLETED, FAILED, STOPPING, STOPPED)
}

type EdgePresetDeploymentStatus = "COMPLETED" | "FAILED"
object EdgePresetDeploymentStatus {
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[EdgePresetDeploymentStatus] = js.Array(COMPLETED, FAILED)
}

type EdgePresetDeploymentType = "GreengrassV2Component"
object EdgePresetDeploymentType {
  inline val GreengrassV2Component: "GreengrassV2Component" = "GreengrassV2Component"

  inline def values: js.Array[EdgePresetDeploymentType] = js.Array(GreengrassV2Component)
}

type EndpointConfigSortKey = "Name" | "CreationTime"
object EndpointConfigSortKey {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[EndpointConfigSortKey] = js.Array(Name, CreationTime)
}

type EndpointSortKey = "Name" | "CreationTime" | "Status"
object EndpointSortKey {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val Status: "Status" = "Status"

  inline def values: js.Array[EndpointSortKey] = js.Array(Name, CreationTime, Status)
}

type EndpointStatus = "OutOfService" | "Creating" | "Updating" | "SystemUpdating" | "RollingBack" | "InService" | "Deleting" | "Failed"
object EndpointStatus {
  inline val OutOfService: "OutOfService" = "OutOfService"
  inline val Creating: "Creating" = "Creating"
  inline val Updating: "Updating" = "Updating"
  inline val SystemUpdating: "SystemUpdating" = "SystemUpdating"
  inline val RollingBack: "RollingBack" = "RollingBack"
  inline val InService: "InService" = "InService"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[EndpointStatus] = js.Array(OutOfService, Creating, Updating, SystemUpdating, RollingBack, InService, Deleting, Failed)
}

type ExecutionStatus = "Pending" | "Completed" | "CompletedWithViolations" | "InProgress" | "Failed" | "Stopping" | "Stopped"
object ExecutionStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Completed: "Completed" = "Completed"
  inline val CompletedWithViolations: "CompletedWithViolations" = "CompletedWithViolations"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[ExecutionStatus] = js.Array(Pending, Completed, CompletedWithViolations, InProgress, Failed, Stopping, Stopped)
}

type FeatureGroupSortBy = "Name" | "FeatureGroupStatus" | "OfflineStoreStatus" | "CreationTime"
object FeatureGroupSortBy {
  inline val Name: "Name" = "Name"
  inline val FeatureGroupStatus: "FeatureGroupStatus" = "FeatureGroupStatus"
  inline val OfflineStoreStatus: "OfflineStoreStatus" = "OfflineStoreStatus"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[FeatureGroupSortBy] = js.Array(Name, FeatureGroupStatus, OfflineStoreStatus, CreationTime)
}

type FeatureGroupSortOrder = "Ascending" | "Descending"
object FeatureGroupSortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[FeatureGroupSortOrder] = js.Array(Ascending, Descending)
}

type FeatureGroupStatus = "Creating" | "Created" | "CreateFailed" | "Deleting" | "DeleteFailed"
object FeatureGroupStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Created: "Created" = "Created"
  inline val CreateFailed: "CreateFailed" = "CreateFailed"
  inline val Deleting: "Deleting" = "Deleting"
  inline val DeleteFailed: "DeleteFailed" = "DeleteFailed"

  inline def values: js.Array[FeatureGroupStatus] = js.Array(Creating, Created, CreateFailed, Deleting, DeleteFailed)
}

type FeatureType = "Integral" | "Fractional" | "String"
object FeatureType {
  inline val Integral: "Integral" = "Integral"
  inline val Fractional: "Fractional" = "Fractional"
  inline val String: "String" = "String"

  inline def values: js.Array[FeatureType] = js.Array(Integral, Fractional, String)
}

type FileSystemAccessMode = "rw" | "ro"
object FileSystemAccessMode {
  inline val rw: "rw" = "rw"
  inline val ro: "ro" = "ro"

  inline def values: js.Array[FileSystemAccessMode] = js.Array(rw, ro)
}

type FileSystemType = "EFS" | "FSxLustre"
object FileSystemType {
  inline val EFS: "EFS" = "EFS"
  inline val FSxLustre: "FSxLustre" = "FSxLustre"

  inline def values: js.Array[FileSystemType] = js.Array(EFS, FSxLustre)
}

type FlowDefinitionStatus = "Initializing" | "Active" | "Failed" | "Deleting"
object FlowDefinitionStatus {
  inline val Initializing: "Initializing" = "Initializing"
  inline val Active: "Active" = "Active"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[FlowDefinitionStatus] = js.Array(Initializing, Active, Failed, Deleting)
}

type Framework = "TENSORFLOW" | "KERAS" | "MXNET" | "ONNX" | "PYTORCH" | "XGBOOST" | "TFLITE" | "DARKNET" | "SKLEARN"
object Framework {
  inline val TENSORFLOW: "TENSORFLOW" = "TENSORFLOW"
  inline val KERAS: "KERAS" = "KERAS"
  inline val MXNET: "MXNET" = "MXNET"
  inline val ONNX: "ONNX" = "ONNX"
  inline val PYTORCH: "PYTORCH" = "PYTORCH"
  inline val XGBOOST: "XGBOOST" = "XGBOOST"
  inline val TFLITE: "TFLITE" = "TFLITE"
  inline val DARKNET: "DARKNET" = "DARKNET"
  inline val SKLEARN: "SKLEARN" = "SKLEARN"

  inline def values: js.Array[Framework] = js.Array(TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST, TFLITE, DARKNET, SKLEARN)
}

type HumanTaskUiStatus = "Active" | "Deleting"
object HumanTaskUiStatus {
  inline val Active: "Active" = "Active"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[HumanTaskUiStatus] = js.Array(Active, Deleting)
}

type HyperParameterScalingType = "Auto" | "Linear" | "Logarithmic" | "ReverseLogarithmic"
object HyperParameterScalingType {
  inline val Auto: "Auto" = "Auto"
  inline val Linear: "Linear" = "Linear"
  inline val Logarithmic: "Logarithmic" = "Logarithmic"
  inline val ReverseLogarithmic: "ReverseLogarithmic" = "ReverseLogarithmic"

  inline def values: js.Array[HyperParameterScalingType] = js.Array(Auto, Linear, Logarithmic, ReverseLogarithmic)
}

type HyperParameterTuningJobObjectiveType = "Maximize" | "Minimize"
object HyperParameterTuningJobObjectiveType {
  inline val Maximize: "Maximize" = "Maximize"
  inline val Minimize: "Minimize" = "Minimize"

  inline def values: js.Array[HyperParameterTuningJobObjectiveType] = js.Array(Maximize, Minimize)
}

type HyperParameterTuningJobSortByOptions = "Name" | "Status" | "CreationTime"
object HyperParameterTuningJobSortByOptions {
  inline val Name: "Name" = "Name"
  inline val Status: "Status" = "Status"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[HyperParameterTuningJobSortByOptions] = js.Array(Name, Status, CreationTime)
}

type HyperParameterTuningJobStatus = "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping"
object HyperParameterTuningJobStatus {
  inline val Completed: "Completed" = "Completed"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Failed: "Failed" = "Failed"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Stopping: "Stopping" = "Stopping"

  inline def values: js.Array[HyperParameterTuningJobStatus] = js.Array(Completed, InProgress, Failed, Stopped, Stopping)
}

/** The strategy hyperparameter tuning uses to find the best combination of hyperparameters for your model. Currently, the only supported value is <code>Bayesian</code>.
  */
type HyperParameterTuningJobStrategyType = "Bayesian" | "Random"
object HyperParameterTuningJobStrategyType {
  inline val Bayesian: "Bayesian" = "Bayesian"
  inline val Random: "Random" = "Random"

  inline def values: js.Array[HyperParameterTuningJobStrategyType] = js.Array(Bayesian, Random)
}

type HyperParameterTuningJobWarmStartType = "IdenticalDataAndAlgorithm" | "TransferLearning"
object HyperParameterTuningJobWarmStartType {
  inline val IdenticalDataAndAlgorithm: "IdenticalDataAndAlgorithm" = "IdenticalDataAndAlgorithm"
  inline val TransferLearning: "TransferLearning" = "TransferLearning"

  inline def values: js.Array[HyperParameterTuningJobWarmStartType] = js.Array(IdenticalDataAndAlgorithm, TransferLearning)
}

type ImageSortBy = "CREATION_TIME" | "LAST_MODIFIED_TIME" | "IMAGE_NAME"
object ImageSortBy {
  inline val CREATION_TIME: "CREATION_TIME" = "CREATION_TIME"
  inline val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"
  inline val IMAGE_NAME: "IMAGE_NAME" = "IMAGE_NAME"

  inline def values: js.Array[ImageSortBy] = js.Array(CREATION_TIME, LAST_MODIFIED_TIME, IMAGE_NAME)
}

type ImageSortOrder = "ASCENDING" | "DESCENDING"
object ImageSortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[ImageSortOrder] = js.Array(ASCENDING, DESCENDING)
}

type ImageStatus = "CREATING" | "CREATED" | "CREATE_FAILED" | "UPDATING" | "UPDATE_FAILED" | "DELETING" | "DELETE_FAILED"
object ImageStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val UPDATE_FAILED: "UPDATE_FAILED" = "UPDATE_FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[ImageStatus] = js.Array(CREATING, CREATED, CREATE_FAILED, UPDATING, UPDATE_FAILED, DELETING, DELETE_FAILED)
}

type ImageVersionSortBy = "CREATION_TIME" | "LAST_MODIFIED_TIME" | "VERSION"
object ImageVersionSortBy {
  inline val CREATION_TIME: "CREATION_TIME" = "CREATION_TIME"
  inline val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"
  inline val VERSION: "VERSION" = "VERSION"

  inline def values: js.Array[ImageVersionSortBy] = js.Array(CREATION_TIME, LAST_MODIFIED_TIME, VERSION)
}

type ImageVersionSortOrder = "ASCENDING" | "DESCENDING"
object ImageVersionSortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[ImageVersionSortOrder] = js.Array(ASCENDING, DESCENDING)
}

type ImageVersionStatus = "CREATING" | "CREATED" | "CREATE_FAILED" | "DELETING" | "DELETE_FAILED"
object ImageVersionStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val CREATED: "CREATED" = "CREATED"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[ImageVersionStatus] = js.Array(CREATING, CREATED, CREATE_FAILED, DELETING, DELETE_FAILED)
}

type InferenceExecutionMode = "Serial" | "Direct"
object InferenceExecutionMode {
  inline val Serial: "Serial" = "Serial"
  inline val Direct: "Direct" = "Direct"

  inline def values: js.Array[InferenceExecutionMode] = js.Array(Serial, Direct)
}

type InputMode = "Pipe" | "File"
object InputMode {
  inline val Pipe: "Pipe" = "Pipe"
  inline val File: "File" = "File"

  inline def values: js.Array[InputMode] = js.Array(Pipe, File)
}

type InstanceType = "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.m5d.large" | "ml.m5d.xlarge" | "ml.m5d.2xlarge" | "ml.m5d.4xlarge" | "ml.m5d.8xlarge" | "ml.m5d.12xlarge" | "ml.m5d.16xlarge" | "ml.m5d.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.p3dn.24xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" |
  "ml.r5.large" | "ml.r5.xlarge" | "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.8xlarge" | "ml.r5.12xlarge" | "ml.r5.16xlarge" | "ml.r5.24xlarge"
object InstanceType {
  inline val `ml.t2.medium`: "ml.t2.medium" = "ml.t2.medium"
  inline val `ml.t2.large`: "ml.t2.large" = "ml.t2.large"
  inline val `ml.t2.xlarge`: "ml.t2.xlarge" = "ml.t2.xlarge"
  inline val `ml.t2.2xlarge`: "ml.t2.2xlarge" = "ml.t2.2xlarge"
  inline val `ml.t3.medium`: "ml.t3.medium" = "ml.t3.medium"
  inline val `ml.t3.large`: "ml.t3.large" = "ml.t3.large"
  inline val `ml.t3.xlarge`: "ml.t3.xlarge" = "ml.t3.xlarge"
  inline val `ml.t3.2xlarge`: "ml.t3.2xlarge" = "ml.t3.2xlarge"
  inline val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  inline val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  inline val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  inline val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  inline val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  inline val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  inline val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  inline val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  inline val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  inline val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  inline val `ml.m5d.large`: "ml.m5d.large" = "ml.m5d.large"
  inline val `ml.m5d.xlarge`: "ml.m5d.xlarge" = "ml.m5d.xlarge"
  inline val `ml.m5d.2xlarge`: "ml.m5d.2xlarge" = "ml.m5d.2xlarge"
  inline val `ml.m5d.4xlarge`: "ml.m5d.4xlarge" = "ml.m5d.4xlarge"
  inline val `ml.m5d.8xlarge`: "ml.m5d.8xlarge" = "ml.m5d.8xlarge"
  inline val `ml.m5d.12xlarge`: "ml.m5d.12xlarge" = "ml.m5d.12xlarge"
  inline val `ml.m5d.16xlarge`: "ml.m5d.16xlarge" = "ml.m5d.16xlarge"
  inline val `ml.m5d.24xlarge`: "ml.m5d.24xlarge" = "ml.m5d.24xlarge"
  inline val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  inline val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  inline val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  inline val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  inline val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  inline val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  inline val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  inline val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  inline val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  inline val `ml.c5d.xlarge`: "ml.c5d.xlarge" = "ml.c5d.xlarge"
  inline val `ml.c5d.2xlarge`: "ml.c5d.2xlarge" = "ml.c5d.2xlarge"
  inline val `ml.c5d.4xlarge`: "ml.c5d.4xlarge" = "ml.c5d.4xlarge"
  inline val `ml.c5d.9xlarge`: "ml.c5d.9xlarge" = "ml.c5d.9xlarge"
  inline val `ml.c5d.18xlarge`: "ml.c5d.18xlarge" = "ml.c5d.18xlarge"
  inline val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  inline val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  inline val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  inline val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  inline val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  inline val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  inline val `ml.p3dn.24xlarge`: "ml.p3dn.24xlarge" = "ml.p3dn.24xlarge"
  inline val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  inline val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  inline val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  inline val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  inline val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  inline val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"
  inline val `ml.r5.large`: "ml.r5.large" = "ml.r5.large"
  inline val `ml.r5.xlarge`: "ml.r5.xlarge" = "ml.r5.xlarge"
  inline val `ml.r5.2xlarge`: "ml.r5.2xlarge" = "ml.r5.2xlarge"
  inline val `ml.r5.4xlarge`: "ml.r5.4xlarge" = "ml.r5.4xlarge"
  inline val `ml.r5.8xlarge`: "ml.r5.8xlarge" = "ml.r5.8xlarge"
  inline val `ml.r5.12xlarge`: "ml.r5.12xlarge" = "ml.r5.12xlarge"
  inline val `ml.r5.16xlarge`: "ml.r5.16xlarge" = "ml.r5.16xlarge"
  inline val `ml.r5.24xlarge`: "ml.r5.24xlarge" = "ml.r5.24xlarge"

  inline def values: js.Array[InstanceType] = js.Array(
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
    `ml.m5d.large`,
    `ml.m5d.xlarge`,
    `ml.m5d.2xlarge`,
    `ml.m5d.4xlarge`,
    `ml.m5d.8xlarge`,
    `ml.m5d.12xlarge`,
    `ml.m5d.16xlarge`,
    `ml.m5d.24xlarge`,
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
    `ml.p3.16xlarge`,
    `ml.p3dn.24xlarge`,
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
    `ml.r5.8xlarge`,
    `ml.r5.12xlarge`,
    `ml.r5.16xlarge`,
    `ml.r5.24xlarge`
  )
}

type JoinSource = "Input" | "None"
object JoinSource {
  inline val Input: "Input" = "Input"
  inline val None: "None" = "None"

  inline def values: js.Array[JoinSource] = js.Array(Input, None)
}

type LabelingJobStatus = "Initializing" | "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object LabelingJobStatus {
  inline val Initializing: "Initializing" = "Initializing"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[LabelingJobStatus] = js.Array(Initializing, InProgress, Completed, Failed, Stopping, Stopped)
}

type LineageType = "TrialComponent" | "Artifact" | "Context" | "Action"
object LineageType {
  inline val TrialComponent: "TrialComponent" = "TrialComponent"
  inline val Artifact: "Artifact" = "Artifact"
  inline val Context: "Context" = "Context"
  inline val Action: "Action" = "Action"

  inline def values: js.Array[LineageType] = js.Array(TrialComponent, Artifact, Context, Action)
}

type ListCompilationJobsSortBy = "Name" | "CreationTime" | "Status"
object ListCompilationJobsSortBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val Status: "Status" = "Status"

  inline def values: js.Array[ListCompilationJobsSortBy] = js.Array(Name, CreationTime, Status)
}

type ListDeviceFleetsSortBy = "NAME" | "CREATION_TIME" | "LAST_MODIFIED_TIME"
object ListDeviceFleetsSortBy {
  inline val NAME: "NAME" = "NAME"
  inline val CREATION_TIME: "CREATION_TIME" = "CREATION_TIME"
  inline val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"

  inline def values: js.Array[ListDeviceFleetsSortBy] = js.Array(NAME, CREATION_TIME, LAST_MODIFIED_TIME)
}

type ListEdgePackagingJobsSortBy = "NAME" | "MODEL_NAME" | "CREATION_TIME" | "LAST_MODIFIED_TIME" | "STATUS"
object ListEdgePackagingJobsSortBy {
  inline val NAME: "NAME" = "NAME"
  inline val MODEL_NAME: "MODEL_NAME" = "MODEL_NAME"
  inline val CREATION_TIME: "CREATION_TIME" = "CREATION_TIME"
  inline val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"
  inline val STATUS: "STATUS" = "STATUS"

  inline def values: js.Array[ListEdgePackagingJobsSortBy] = js.Array(NAME, MODEL_NAME, CREATION_TIME, LAST_MODIFIED_TIME, STATUS)
}

type ListInferenceRecommendationsJobsSortBy = "Name" | "CreationTime" | "Status"
object ListInferenceRecommendationsJobsSortBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val Status: "Status" = "Status"

  inline def values: js.Array[ListInferenceRecommendationsJobsSortBy] = js.Array(Name, CreationTime, Status)
}

type ListLabelingJobsForWorkteamSortByOptions = "CreationTime"
object ListLabelingJobsForWorkteamSortByOptions {
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[ListLabelingJobsForWorkteamSortByOptions] = js.Array(CreationTime)
}

type ListWorkforcesSortByOptions = "Name" | "CreateDate"
object ListWorkforcesSortByOptions {
  inline val Name: "Name" = "Name"
  inline val CreateDate: "CreateDate" = "CreateDate"

  inline def values: js.Array[ListWorkforcesSortByOptions] = js.Array(Name, CreateDate)
}

type ListWorkteamsSortByOptions = "Name" | "CreateDate"
object ListWorkteamsSortByOptions {
  inline val Name: "Name" = "Name"
  inline val CreateDate: "CreateDate" = "CreateDate"

  inline def values: js.Array[ListWorkteamsSortByOptions] = js.Array(Name, CreateDate)
}

type MetricSetSource = "Train" | "Validation" | "Test"
object MetricSetSource {
  inline val Train: "Train" = "Train"
  inline val Validation: "Validation" = "Validation"
  inline val Test: "Test" = "Test"

  inline def values: js.Array[MetricSetSource] = js.Array(Train, Validation, Test)
}

type ModelApprovalStatus = "Approved" | "Rejected" | "PendingManualApproval"
object ModelApprovalStatus {
  inline val Approved: "Approved" = "Approved"
  inline val Rejected: "Rejected" = "Rejected"
  inline val PendingManualApproval: "PendingManualApproval" = "PendingManualApproval"

  inline def values: js.Array[ModelApprovalStatus] = js.Array(Approved, Rejected, PendingManualApproval)
}

type ModelCacheSetting = "Enabled" | "Disabled"
object ModelCacheSetting {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ModelCacheSetting] = js.Array(Enabled, Disabled)
}

type ModelMetadataFilterType = "Domain" | "Framework" | "Task" | "FrameworkVersion"
object ModelMetadataFilterType {
  inline val Domain: "Domain" = "Domain"
  inline val Framework: "Framework" = "Framework"
  inline val Task: "Task" = "Task"
  inline val FrameworkVersion: "FrameworkVersion" = "FrameworkVersion"

  inline def values: js.Array[ModelMetadataFilterType] = js.Array(Domain, Framework, Task, FrameworkVersion)
}

type ModelPackageGroupSortBy = "Name" | "CreationTime"
object ModelPackageGroupSortBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[ModelPackageGroupSortBy] = js.Array(Name, CreationTime)
}

type ModelPackageGroupStatus = "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting" | "DeleteFailed"
object ModelPackageGroupStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"
  inline val DeleteFailed: "DeleteFailed" = "DeleteFailed"

  inline def values: js.Array[ModelPackageGroupStatus] = js.Array(Pending, InProgress, Completed, Failed, Deleting, DeleteFailed)
}

type ModelPackageSortBy = "Name" | "CreationTime"
object ModelPackageSortBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[ModelPackageSortBy] = js.Array(Name, CreationTime)
}

type ModelPackageStatus = "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting"
object ModelPackageStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[ModelPackageStatus] = js.Array(Pending, InProgress, Completed, Failed, Deleting)
}

type ModelPackageType = "Versioned" | "Unversioned" | "Both"
object ModelPackageType {
  inline val Versioned: "Versioned" = "Versioned"
  inline val Unversioned: "Unversioned" = "Unversioned"
  inline val Both: "Both" = "Both"

  inline def values: js.Array[ModelPackageType] = js.Array(Versioned, Unversioned, Both)
}

type ModelSortKey = "Name" | "CreationTime"
object ModelSortKey {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[ModelSortKey] = js.Array(Name, CreationTime)
}

type MonitoringExecutionSortKey = "CreationTime" | "ScheduledTime" | "Status"
object MonitoringExecutionSortKey {
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val ScheduledTime: "ScheduledTime" = "ScheduledTime"
  inline val Status: "Status" = "Status"

  inline def values: js.Array[MonitoringExecutionSortKey] = js.Array(CreationTime, ScheduledTime, Status)
}

type MonitoringJobDefinitionSortKey = "Name" | "CreationTime"
object MonitoringJobDefinitionSortKey {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[MonitoringJobDefinitionSortKey] = js.Array(Name, CreationTime)
}

type MonitoringProblemType = "BinaryClassification" | "MulticlassClassification" | "Regression"
object MonitoringProblemType {
  inline val BinaryClassification: "BinaryClassification" = "BinaryClassification"
  inline val MulticlassClassification: "MulticlassClassification" = "MulticlassClassification"
  inline val Regression: "Regression" = "Regression"

  inline def values: js.Array[MonitoringProblemType] = js.Array(BinaryClassification, MulticlassClassification, Regression)
}

type MonitoringScheduleSortKey = "Name" | "CreationTime" | "Status"
object MonitoringScheduleSortKey {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val Status: "Status" = "Status"

  inline def values: js.Array[MonitoringScheduleSortKey] = js.Array(Name, CreationTime, Status)
}

type MonitoringType = "DataQuality" | "ModelQuality" | "ModelBias" | "ModelExplainability"
object MonitoringType {
  inline val DataQuality: "DataQuality" = "DataQuality"
  inline val ModelQuality: "ModelQuality" = "ModelQuality"
  inline val ModelBias: "ModelBias" = "ModelBias"
  inline val ModelExplainability: "ModelExplainability" = "ModelExplainability"

  inline def values: js.Array[MonitoringType] = js.Array(DataQuality, ModelQuality, ModelBias, ModelExplainability)
}

type NotebookInstanceAcceleratorType = "ml.eia1.medium" | "ml.eia1.large" | "ml.eia1.xlarge" | "ml.eia2.medium" | "ml.eia2.large" | "ml.eia2.xlarge"
object NotebookInstanceAcceleratorType {
  inline val `ml.eia1.medium`: "ml.eia1.medium" = "ml.eia1.medium"
  inline val `ml.eia1.large`: "ml.eia1.large" = "ml.eia1.large"
  inline val `ml.eia1.xlarge`: "ml.eia1.xlarge" = "ml.eia1.xlarge"
  inline val `ml.eia2.medium`: "ml.eia2.medium" = "ml.eia2.medium"
  inline val `ml.eia2.large`: "ml.eia2.large" = "ml.eia2.large"
  inline val `ml.eia2.xlarge`: "ml.eia2.xlarge" = "ml.eia2.xlarge"

  inline def values: js.Array[NotebookInstanceAcceleratorType] = js.Array(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`)
}

type NotebookInstanceLifecycleConfigSortKey = "Name" | "CreationTime" | "LastModifiedTime"
object NotebookInstanceLifecycleConfigSortKey {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"

  inline def values: js.Array[NotebookInstanceLifecycleConfigSortKey] = js.Array(Name, CreationTime, LastModifiedTime)
}

type NotebookInstanceLifecycleConfigSortOrder = "Ascending" | "Descending"
object NotebookInstanceLifecycleConfigSortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[NotebookInstanceLifecycleConfigSortOrder] = js.Array(Ascending, Descending)
}

type NotebookInstanceSortKey = "Name" | "CreationTime" | "Status"
object NotebookInstanceSortKey {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val Status: "Status" = "Status"

  inline def values: js.Array[NotebookInstanceSortKey] = js.Array(Name, CreationTime, Status)
}

type NotebookInstanceSortOrder = "Ascending" | "Descending"
object NotebookInstanceSortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[NotebookInstanceSortOrder] = js.Array(Ascending, Descending)
}

type NotebookInstanceStatus = "Pending" | "InService" | "Stopping" | "Stopped" | "Failed" | "Deleting" | "Updating"
object NotebookInstanceStatus {
  inline val Pending: "Pending" = "Pending"
  inline val InService: "InService" = "InService"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Updating: "Updating" = "Updating"

  inline def values: js.Array[NotebookInstanceStatus] = js.Array(Pending, InService, Stopping, Stopped, Failed, Deleting, Updating)
}

type NotebookOutputOption = "Allowed" | "Disabled"
object NotebookOutputOption {
  inline val Allowed: "Allowed" = "Allowed"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[NotebookOutputOption] = js.Array(Allowed, Disabled)
}

type ObjectiveStatus = "Succeeded" | "Pending" | "Failed"
object ObjectiveStatus {
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Pending: "Pending" = "Pending"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[ObjectiveStatus] = js.Array(Succeeded, Pending, Failed)
}

type OfflineStoreStatusValue = "Active" | "Blocked" | "Disabled"
object OfflineStoreStatusValue {
  inline val Active: "Active" = "Active"
  inline val Blocked: "Blocked" = "Blocked"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[OfflineStoreStatusValue] = js.Array(Active, Blocked, Disabled)
}

type Operator = "Equals" | "NotEquals" | "GreaterThan" | "GreaterThanOrEqualTo" | "LessThan" | "LessThanOrEqualTo" | "Contains" | "Exists" | "NotExists" | "In"
object Operator {
  inline val Equals: "Equals" = "Equals"
  inline val NotEquals: "NotEquals" = "NotEquals"
  inline val GreaterThan: "GreaterThan" = "GreaterThan"
  inline val GreaterThanOrEqualTo: "GreaterThanOrEqualTo" = "GreaterThanOrEqualTo"
  inline val LessThan: "LessThan" = "LessThan"
  inline val LessThanOrEqualTo: "LessThanOrEqualTo" = "LessThanOrEqualTo"
  inline val Contains: "Contains" = "Contains"
  inline val Exists: "Exists" = "Exists"
  inline val NotExists: "NotExists" = "NotExists"
  inline val In: "In" = "In"

  inline def values: js.Array[Operator] = js.Array(Equals, NotEquals, GreaterThan, GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains, Exists, NotExists, In)
}

type OrderKey = "Ascending" | "Descending"
object OrderKey {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[OrderKey] = js.Array(Ascending, Descending)
}

type ParameterType = "Integer" | "Continuous" | "Categorical" | "FreeText"
object ParameterType {
  inline val Integer: "Integer" = "Integer"
  inline val Continuous: "Continuous" = "Continuous"
  inline val Categorical: "Categorical" = "Categorical"
  inline val FreeText: "FreeText" = "FreeText"

  inline def values: js.Array[ParameterType] = js.Array(Integer, Continuous, Categorical, FreeText)
}

type PipelineExecutionStatus = "Executing" | "Stopping" | "Stopped" | "Failed" | "Succeeded"
object PipelineExecutionStatus {
  inline val Executing: "Executing" = "Executing"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Failed: "Failed" = "Failed"
  inline val Succeeded: "Succeeded" = "Succeeded"

  inline def values: js.Array[PipelineExecutionStatus] = js.Array(Executing, Stopping, Stopped, Failed, Succeeded)
}

type PipelineStatus = "Active"
object PipelineStatus {
  inline val Active: "Active" = "Active"

  inline def values: js.Array[PipelineStatus] = js.Array(Active)
}

type ProblemType = "BinaryClassification" | "MulticlassClassification" | "Regression"
object ProblemType {
  inline val BinaryClassification: "BinaryClassification" = "BinaryClassification"
  inline val MulticlassClassification: "MulticlassClassification" = "MulticlassClassification"
  inline val Regression: "Regression" = "Regression"

  inline def values: js.Array[ProblemType] = js.Array(BinaryClassification, MulticlassClassification, Regression)
}

type ProcessingInstanceType = "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.r5.large" | "ml.r5.xlarge" | "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.8xlarge" | "ml.r5.12xlarge" | "ml.r5.16xlarge" | "ml.r5.24xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge"
object ProcessingInstanceType {
  inline val `ml.t3.medium`: "ml.t3.medium" = "ml.t3.medium"
  inline val `ml.t3.large`: "ml.t3.large" = "ml.t3.large"
  inline val `ml.t3.xlarge`: "ml.t3.xlarge" = "ml.t3.xlarge"
  inline val `ml.t3.2xlarge`: "ml.t3.2xlarge" = "ml.t3.2xlarge"
  inline val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  inline val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  inline val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  inline val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  inline val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  inline val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  inline val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  inline val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  inline val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  inline val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  inline val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  inline val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  inline val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  inline val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  inline val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  inline val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  inline val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  inline val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  inline val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  inline val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  inline val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  inline val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  inline val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  inline val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  inline val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  inline val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  inline val `ml.r5.large`: "ml.r5.large" = "ml.r5.large"
  inline val `ml.r5.xlarge`: "ml.r5.xlarge" = "ml.r5.xlarge"
  inline val `ml.r5.2xlarge`: "ml.r5.2xlarge" = "ml.r5.2xlarge"
  inline val `ml.r5.4xlarge`: "ml.r5.4xlarge" = "ml.r5.4xlarge"
  inline val `ml.r5.8xlarge`: "ml.r5.8xlarge" = "ml.r5.8xlarge"
  inline val `ml.r5.12xlarge`: "ml.r5.12xlarge" = "ml.r5.12xlarge"
  inline val `ml.r5.16xlarge`: "ml.r5.16xlarge" = "ml.r5.16xlarge"
  inline val `ml.r5.24xlarge`: "ml.r5.24xlarge" = "ml.r5.24xlarge"
  inline val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  inline val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  inline val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  inline val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  inline val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  inline val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"

  inline def values: js.Array[ProcessingInstanceType] = js.Array(
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
    `ml.r5.24xlarge`,
    `ml.g4dn.xlarge`,
    `ml.g4dn.2xlarge`,
    `ml.g4dn.4xlarge`,
    `ml.g4dn.8xlarge`,
    `ml.g4dn.12xlarge`,
    `ml.g4dn.16xlarge`
  )
}

type ProcessingJobStatus = "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object ProcessingJobStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[ProcessingJobStatus] = js.Array(InProgress, Completed, Failed, Stopping, Stopped)
}

type ProcessingS3CompressionType = "None" | "Gzip"
object ProcessingS3CompressionType {
  inline val None: "None" = "None"
  inline val Gzip: "Gzip" = "Gzip"

  inline def values: js.Array[ProcessingS3CompressionType] = js.Array(None, Gzip)
}

type ProcessingS3DataDistributionType = "FullyReplicated" | "ShardedByS3Key"
object ProcessingS3DataDistributionType {
  inline val FullyReplicated: "FullyReplicated" = "FullyReplicated"
  inline val ShardedByS3Key: "ShardedByS3Key" = "ShardedByS3Key"

  inline def values: js.Array[ProcessingS3DataDistributionType] = js.Array(FullyReplicated, ShardedByS3Key)
}

type ProcessingS3DataType = "ManifestFile" | "S3Prefix"
object ProcessingS3DataType {
  inline val ManifestFile: "ManifestFile" = "ManifestFile"
  inline val S3Prefix: "S3Prefix" = "S3Prefix"

  inline def values: js.Array[ProcessingS3DataType] = js.Array(ManifestFile, S3Prefix)
}

type ProcessingS3InputMode = "Pipe" | "File"
object ProcessingS3InputMode {
  inline val Pipe: "Pipe" = "Pipe"
  inline val File: "File" = "File"

  inline def values: js.Array[ProcessingS3InputMode] = js.Array(Pipe, File)
}

type ProcessingS3UploadMode = "Continuous" | "EndOfJob"
object ProcessingS3UploadMode {
  inline val Continuous: "Continuous" = "Continuous"
  inline val EndOfJob: "EndOfJob" = "EndOfJob"

  inline def values: js.Array[ProcessingS3UploadMode] = js.Array(Continuous, EndOfJob)
}

type ProductionVariantAcceleratorType = "ml.eia1.medium" | "ml.eia1.large" | "ml.eia1.xlarge" | "ml.eia2.medium" | "ml.eia2.large" | "ml.eia2.xlarge"
object ProductionVariantAcceleratorType {
  inline val `ml.eia1.medium`: "ml.eia1.medium" = "ml.eia1.medium"
  inline val `ml.eia1.large`: "ml.eia1.large" = "ml.eia1.large"
  inline val `ml.eia1.xlarge`: "ml.eia1.xlarge" = "ml.eia1.xlarge"
  inline val `ml.eia2.medium`: "ml.eia2.medium" = "ml.eia2.medium"
  inline val `ml.eia2.large`: "ml.eia2.large" = "ml.eia2.large"
  inline val `ml.eia2.xlarge`: "ml.eia2.xlarge" = "ml.eia2.xlarge"

  inline def values: js.Array[ProductionVariantAcceleratorType] = js.Array(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`)
}

type ProductionVariantInstanceType = "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.m5d.large" | "ml.m5d.xlarge" | "ml.m5d.2xlarge" | "ml.m5d.4xlarge" | "ml.m5d.12xlarge" | "ml.m5d.24xlarge" | "ml.c4.large" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.large" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.large" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.r5.large" | "ml.r5.xlarge" |
  "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.12xlarge" | "ml.r5.24xlarge" | "ml.r5d.large" | "ml.r5d.xlarge" | "ml.r5d.2xlarge" | "ml.r5d.4xlarge" | "ml.r5d.12xlarge" | "ml.r5d.24xlarge" | "ml.inf1.xlarge" | "ml.inf1.2xlarge" | "ml.inf1.6xlarge" | "ml.inf1.24xlarge"
object ProductionVariantInstanceType {
  inline val `ml.t2.medium`: "ml.t2.medium" = "ml.t2.medium"
  inline val `ml.t2.large`: "ml.t2.large" = "ml.t2.large"
  inline val `ml.t2.xlarge`: "ml.t2.xlarge" = "ml.t2.xlarge"
  inline val `ml.t2.2xlarge`: "ml.t2.2xlarge" = "ml.t2.2xlarge"
  inline val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  inline val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  inline val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  inline val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  inline val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  inline val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  inline val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  inline val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  inline val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  inline val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  inline val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  inline val `ml.m5d.large`: "ml.m5d.large" = "ml.m5d.large"
  inline val `ml.m5d.xlarge`: "ml.m5d.xlarge" = "ml.m5d.xlarge"
  inline val `ml.m5d.2xlarge`: "ml.m5d.2xlarge" = "ml.m5d.2xlarge"
  inline val `ml.m5d.4xlarge`: "ml.m5d.4xlarge" = "ml.m5d.4xlarge"
  inline val `ml.m5d.12xlarge`: "ml.m5d.12xlarge" = "ml.m5d.12xlarge"
  inline val `ml.m5d.24xlarge`: "ml.m5d.24xlarge" = "ml.m5d.24xlarge"
  inline val `ml.c4.large`: "ml.c4.large" = "ml.c4.large"
  inline val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  inline val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  inline val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  inline val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  inline val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  inline val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  inline val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  inline val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  inline val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  inline val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  inline val `ml.c5.large`: "ml.c5.large" = "ml.c5.large"
  inline val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  inline val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  inline val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  inline val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  inline val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  inline val `ml.c5d.large`: "ml.c5d.large" = "ml.c5d.large"
  inline val `ml.c5d.xlarge`: "ml.c5d.xlarge" = "ml.c5d.xlarge"
  inline val `ml.c5d.2xlarge`: "ml.c5d.2xlarge" = "ml.c5d.2xlarge"
  inline val `ml.c5d.4xlarge`: "ml.c5d.4xlarge" = "ml.c5d.4xlarge"
  inline val `ml.c5d.9xlarge`: "ml.c5d.9xlarge" = "ml.c5d.9xlarge"
  inline val `ml.c5d.18xlarge`: "ml.c5d.18xlarge" = "ml.c5d.18xlarge"
  inline val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  inline val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  inline val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  inline val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  inline val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  inline val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"
  inline val `ml.r5.large`: "ml.r5.large" = "ml.r5.large"
  inline val `ml.r5.xlarge`: "ml.r5.xlarge" = "ml.r5.xlarge"
  inline val `ml.r5.2xlarge`: "ml.r5.2xlarge" = "ml.r5.2xlarge"
  inline val `ml.r5.4xlarge`: "ml.r5.4xlarge" = "ml.r5.4xlarge"
  inline val `ml.r5.12xlarge`: "ml.r5.12xlarge" = "ml.r5.12xlarge"
  inline val `ml.r5.24xlarge`: "ml.r5.24xlarge" = "ml.r5.24xlarge"
  inline val `ml.r5d.large`: "ml.r5d.large" = "ml.r5d.large"
  inline val `ml.r5d.xlarge`: "ml.r5d.xlarge" = "ml.r5d.xlarge"
  inline val `ml.r5d.2xlarge`: "ml.r5d.2xlarge" = "ml.r5d.2xlarge"
  inline val `ml.r5d.4xlarge`: "ml.r5d.4xlarge" = "ml.r5d.4xlarge"
  inline val `ml.r5d.12xlarge`: "ml.r5d.12xlarge" = "ml.r5d.12xlarge"
  inline val `ml.r5d.24xlarge`: "ml.r5d.24xlarge" = "ml.r5d.24xlarge"
  inline val `ml.inf1.xlarge`: "ml.inf1.xlarge" = "ml.inf1.xlarge"
  inline val `ml.inf1.2xlarge`: "ml.inf1.2xlarge" = "ml.inf1.2xlarge"
  inline val `ml.inf1.6xlarge`: "ml.inf1.6xlarge" = "ml.inf1.6xlarge"
  inline val `ml.inf1.24xlarge`: "ml.inf1.24xlarge" = "ml.inf1.24xlarge"

  inline def values: js.Array[ProductionVariantInstanceType] = js.Array(
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
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[ProfilingStatus] = js.Array(Enabled, Disabled)
}

type ProjectSortBy = "Name" | "CreationTime"
object ProjectSortBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[ProjectSortBy] = js.Array(Name, CreationTime)
}

type ProjectSortOrder = "Ascending" | "Descending"
object ProjectSortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[ProjectSortOrder] = js.Array(Ascending, Descending)
}

type ProjectStatus = "Pending" | "CreateInProgress" | "CreateCompleted" | "CreateFailed" | "DeleteInProgress" | "DeleteFailed" | "DeleteCompleted" | "UpdateInProgress" | "UpdateCompleted" | "UpdateFailed"
object ProjectStatus {
  inline val Pending: "Pending" = "Pending"
  inline val CreateInProgress: "CreateInProgress" = "CreateInProgress"
  inline val CreateCompleted: "CreateCompleted" = "CreateCompleted"
  inline val CreateFailed: "CreateFailed" = "CreateFailed"
  inline val DeleteInProgress: "DeleteInProgress" = "DeleteInProgress"
  inline val DeleteFailed: "DeleteFailed" = "DeleteFailed"
  inline val DeleteCompleted: "DeleteCompleted" = "DeleteCompleted"
  inline val UpdateInProgress: "UpdateInProgress" = "UpdateInProgress"
  inline val UpdateCompleted: "UpdateCompleted" = "UpdateCompleted"
  inline val UpdateFailed: "UpdateFailed" = "UpdateFailed"

  inline def values: js.Array[ProjectStatus] = js.Array(Pending, CreateInProgress, CreateCompleted, CreateFailed, DeleteInProgress, DeleteFailed, DeleteCompleted, UpdateInProgress, UpdateCompleted, UpdateFailed)
}

type RStudioServerProAccessStatus = "ENABLED" | "DISABLED"
object RStudioServerProAccessStatus {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[RStudioServerProAccessStatus] = js.Array(ENABLED, DISABLED)
}

type RStudioServerProUserGroup = "R_STUDIO_ADMIN" | "R_STUDIO_USER"
object RStudioServerProUserGroup {
  inline val R_STUDIO_ADMIN: "R_STUDIO_ADMIN" = "R_STUDIO_ADMIN"
  inline val R_STUDIO_USER: "R_STUDIO_USER" = "R_STUDIO_USER"

  inline def values: js.Array[RStudioServerProUserGroup] = js.Array(R_STUDIO_ADMIN, R_STUDIO_USER)
}

type RecommendationJobStatus = "PENDING" | "IN_PROGRESS" | "COMPLETED" | "FAILED" | "STOPPING" | "STOPPED"
object RecommendationJobStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[RecommendationJobStatus] = js.Array(PENDING, IN_PROGRESS, COMPLETED, FAILED, STOPPING, STOPPED)
}

type RecommendationJobType = "Default" | "Advanced"
object RecommendationJobType {
  inline val Default: "Default" = "Default"
  inline val Advanced: "Advanced" = "Advanced"

  inline def values: js.Array[RecommendationJobType] = js.Array(Default, Advanced)
}

type RecordWrapper = "None" | "RecordIO"
object RecordWrapper {
  inline val None: "None" = "None"
  inline val RecordIO: "RecordIO" = "RecordIO"

  inline def values: js.Array[RecordWrapper] = js.Array(None, RecordIO)
}

/** The compression used for Redshift query results.
  */
type RedshiftResultCompressionType = "None" | "GZIP" | "BZIP2" | "ZSTD" | "SNAPPY"
object RedshiftResultCompressionType {
  inline val None: "None" = "None"
  inline val GZIP: "GZIP" = "GZIP"
  inline val BZIP2: "BZIP2" = "BZIP2"
  inline val ZSTD: "ZSTD" = "ZSTD"
  inline val SNAPPY: "SNAPPY" = "SNAPPY"

  inline def values: js.Array[RedshiftResultCompressionType] = js.Array(None, GZIP, BZIP2, ZSTD, SNAPPY)
}

/** The data storage format for Redshift query results.
  */
type RedshiftResultFormat = "PARQUET" | "CSV"
object RedshiftResultFormat {
  inline val PARQUET: "PARQUET" = "PARQUET"
  inline val CSV: "CSV" = "CSV"

  inline def values: js.Array[RedshiftResultFormat] = js.Array(PARQUET, CSV)
}

type RepositoryAccessMode = "Platform" | "Vpc"
object RepositoryAccessMode {
  inline val Platform: "Platform" = "Platform"
  inline val Vpc: "Vpc" = "Vpc"

  inline def values: js.Array[RepositoryAccessMode] = js.Array(Platform, Vpc)
}

type ResourceType = "TrainingJob" | "Experiment" | "ExperimentTrial" | "ExperimentTrialComponent" | "Endpoint" | "ModelPackage" | "ModelPackageGroup" | "Pipeline" | "PipelineExecution" | "FeatureGroup" | "Project"
object ResourceType {
  inline val TrainingJob: "TrainingJob" = "TrainingJob"
  inline val Experiment: "Experiment" = "Experiment"
  inline val ExperimentTrial: "ExperimentTrial" = "ExperimentTrial"
  inline val ExperimentTrialComponent: "ExperimentTrialComponent" = "ExperimentTrialComponent"
  inline val Endpoint: "Endpoint" = "Endpoint"
  inline val ModelPackage: "ModelPackage" = "ModelPackage"
  inline val ModelPackageGroup: "ModelPackageGroup" = "ModelPackageGroup"
  inline val Pipeline: "Pipeline" = "Pipeline"
  inline val PipelineExecution: "PipelineExecution" = "PipelineExecution"
  inline val FeatureGroup: "FeatureGroup" = "FeatureGroup"
  inline val Project: "Project" = "Project"

  inline def values: js.Array[ResourceType] = js.Array(
    TrainingJob,
    Experiment,
    ExperimentTrial,
    ExperimentTrialComponent,
    Endpoint,
    ModelPackage,
    ModelPackageGroup,
    Pipeline,
    PipelineExecution,
    FeatureGroup,
    Project
  )
}

type RetentionType = "Retain" | "Delete"
object RetentionType {
  inline val Retain: "Retain" = "Retain"
  inline val Delete: "Delete" = "Delete"

  inline def values: js.Array[RetentionType] = js.Array(Retain, Delete)
}

type RootAccess = "Enabled" | "Disabled"
object RootAccess {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[RootAccess] = js.Array(Enabled, Disabled)
}

type RuleEvaluationStatus = "InProgress" | "NoIssuesFound" | "IssuesFound" | "Error" | "Stopping" | "Stopped"
object RuleEvaluationStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val NoIssuesFound: "NoIssuesFound" = "NoIssuesFound"
  inline val IssuesFound: "IssuesFound" = "IssuesFound"
  inline val Error: "Error" = "Error"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[RuleEvaluationStatus] = js.Array(InProgress, NoIssuesFound, IssuesFound, Error, Stopping, Stopped)
}

type S3DataDistribution = "FullyReplicated" | "ShardedByS3Key"
object S3DataDistribution {
  inline val FullyReplicated: "FullyReplicated" = "FullyReplicated"
  inline val ShardedByS3Key: "ShardedByS3Key" = "ShardedByS3Key"

  inline def values: js.Array[S3DataDistribution] = js.Array(FullyReplicated, ShardedByS3Key)
}

type S3DataType = "ManifestFile" | "S3Prefix" | "AugmentedManifestFile"
object S3DataType {
  inline val ManifestFile: "ManifestFile" = "ManifestFile"
  inline val S3Prefix: "S3Prefix" = "S3Prefix"
  inline val AugmentedManifestFile: "AugmentedManifestFile" = "AugmentedManifestFile"

  inline def values: js.Array[S3DataType] = js.Array(ManifestFile, S3Prefix, AugmentedManifestFile)
}

type SagemakerServicecatalogStatus = "Enabled" | "Disabled"
object SagemakerServicecatalogStatus {
  inline val Enabled: "Enabled" = "Enabled"
  inline val Disabled: "Disabled" = "Disabled"

  inline def values: js.Array[SagemakerServicecatalogStatus] = js.Array(Enabled, Disabled)
}

type ScheduleStatus = "Pending" | "Failed" | "Scheduled" | "Stopped"
object ScheduleStatus {
  inline val Pending: "Pending" = "Pending"
  inline val Failed: "Failed" = "Failed"
  inline val Scheduled: "Scheduled" = "Scheduled"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[ScheduleStatus] = js.Array(Pending, Failed, Scheduled, Stopped)
}

type SearchSortOrder = "Ascending" | "Descending"
object SearchSortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[SearchSortOrder] = js.Array(Ascending, Descending)
}

type SecondaryStatus = "Starting" | "LaunchingMLInstances" | "PreparingTrainingStack" | "Downloading" | "DownloadingTrainingImage" | "Training" | "Uploading" | "Stopping" | "Stopped" | "MaxRuntimeExceeded" | "Completed" | "Failed" | "Interrupted" | "MaxWaitTimeExceeded" | "Updating" | "Restarting"
object SecondaryStatus {
  inline val Starting: "Starting" = "Starting"
  inline val LaunchingMLInstances: "LaunchingMLInstances" = "LaunchingMLInstances"
  inline val PreparingTrainingStack: "PreparingTrainingStack" = "PreparingTrainingStack"
  inline val Downloading: "Downloading" = "Downloading"
  inline val DownloadingTrainingImage: "DownloadingTrainingImage" = "DownloadingTrainingImage"
  inline val Training: "Training" = "Training"
  inline val Uploading: "Uploading" = "Uploading"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"
  inline val MaxRuntimeExceeded: "MaxRuntimeExceeded" = "MaxRuntimeExceeded"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Interrupted: "Interrupted" = "Interrupted"
  inline val MaxWaitTimeExceeded: "MaxWaitTimeExceeded" = "MaxWaitTimeExceeded"
  inline val Updating: "Updating" = "Updating"
  inline val Restarting: "Restarting" = "Restarting"

  inline def values: js.Array[SecondaryStatus] = js.Array(
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
    Updating,
    Restarting
  )
}

type SortActionsBy = "Name" | "CreationTime"
object SortActionsBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[SortActionsBy] = js.Array(Name, CreationTime)
}

type SortArtifactsBy = "CreationTime"
object SortArtifactsBy {
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[SortArtifactsBy] = js.Array(CreationTime)
}

type SortAssociationsBy = "SourceArn" | "DestinationArn" | "SourceType" | "DestinationType" | "CreationTime"
object SortAssociationsBy {
  inline val SourceArn: "SourceArn" = "SourceArn"
  inline val DestinationArn: "DestinationArn" = "DestinationArn"
  inline val SourceType: "SourceType" = "SourceType"
  inline val DestinationType: "DestinationType" = "DestinationType"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[SortAssociationsBy] = js.Array(SourceArn, DestinationArn, SourceType, DestinationType, CreationTime)
}

type SortBy = "Name" | "CreationTime" | "Status"
object SortBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val Status: "Status" = "Status"

  inline def values: js.Array[SortBy] = js.Array(Name, CreationTime, Status)
}

type SortContextsBy = "Name" | "CreationTime"
object SortContextsBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[SortContextsBy] = js.Array(Name, CreationTime)
}

type SortExperimentsBy = "Name" | "CreationTime"
object SortExperimentsBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[SortExperimentsBy] = js.Array(Name, CreationTime)
}

type SortLineageGroupsBy = "Name" | "CreationTime"
object SortLineageGroupsBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[SortLineageGroupsBy] = js.Array(Name, CreationTime)
}

type SortOrder = "Ascending" | "Descending"
object SortOrder {
  inline val Ascending: "Ascending" = "Ascending"
  inline val Descending: "Descending" = "Descending"

  inline def values: js.Array[SortOrder] = js.Array(Ascending, Descending)
}

type SortPipelineExecutionsBy = "CreationTime" | "PipelineExecutionArn"
object SortPipelineExecutionsBy {
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val PipelineExecutionArn: "PipelineExecutionArn" = "PipelineExecutionArn"

  inline def values: js.Array[SortPipelineExecutionsBy] = js.Array(CreationTime, PipelineExecutionArn)
}

type SortPipelinesBy = "Name" | "CreationTime"
object SortPipelinesBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[SortPipelinesBy] = js.Array(Name, CreationTime)
}

type SortTrialComponentsBy = "Name" | "CreationTime"
object SortTrialComponentsBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[SortTrialComponentsBy] = js.Array(Name, CreationTime)
}

type SortTrialsBy = "Name" | "CreationTime"
object SortTrialsBy {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"

  inline def values: js.Array[SortTrialsBy] = js.Array(Name, CreationTime)
}

type SplitType = "None" | "Line" | "RecordIO" | "TFRecord"
object SplitType {
  inline val None: "None" = "None"
  inline val Line: "Line" = "Line"
  inline val RecordIO: "RecordIO" = "RecordIO"
  inline val TFRecord: "TFRecord" = "TFRecord"

  inline def values: js.Array[SplitType] = js.Array(None, Line, RecordIO, TFRecord)
}

type StepStatus = "Starting" | "Executing" | "Stopping" | "Stopped" | "Failed" | "Succeeded"
object StepStatus {
  inline val Starting: "Starting" = "Starting"
  inline val Executing: "Executing" = "Executing"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Failed: "Failed" = "Failed"
  inline val Succeeded: "Succeeded" = "Succeeded"

  inline def values: js.Array[StepStatus] = js.Array(Starting, Executing, Stopping, Stopped, Failed, Succeeded)
}

type StudioLifecycleConfigAppType = "JupyterServer" | "KernelGateway"
object StudioLifecycleConfigAppType {
  inline val JupyterServer: "JupyterServer" = "JupyterServer"
  inline val KernelGateway: "KernelGateway" = "KernelGateway"

  inline def values: js.Array[StudioLifecycleConfigAppType] = js.Array(JupyterServer, KernelGateway)
}

type StudioLifecycleConfigSortKey = "CreationTime" | "LastModifiedTime" | "Name"
object StudioLifecycleConfigSortKey {
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"
  inline val Name: "Name" = "Name"

  inline def values: js.Array[StudioLifecycleConfigSortKey] = js.Array(CreationTime, LastModifiedTime, Name)
}

type TargetDevice = "lambda" | "ml_m4" | "ml_m5" | "ml_c4" | "ml_c5" | "ml_p2" | "ml_p3" | "ml_g4dn" | "ml_inf1" | "ml_eia2" | "jetson_tx1" | "jetson_tx2" | "jetson_nano" | "jetson_xavier" | "rasp3b" | "imx8qm" | "deeplens" | "rk3399" | "rk3288" | "aisage" | "sbe_c" | "qcs605" | "qcs603" | "sitara_am57x" | "amba_cv2" | "amba_cv22" | "amba_cv25" | "x86_win32" | "x86_win64" | "coreml" | "jacinto_tda4vm" | "imx8mplus"
object TargetDevice {
  inline val lambda: "lambda" = "lambda"
  inline val ml_m4: "ml_m4" = "ml_m4"
  inline val ml_m5: "ml_m5" = "ml_m5"
  inline val ml_c4: "ml_c4" = "ml_c4"
  inline val ml_c5: "ml_c5" = "ml_c5"
  inline val ml_p2: "ml_p2" = "ml_p2"
  inline val ml_p3: "ml_p3" = "ml_p3"
  inline val ml_g4dn: "ml_g4dn" = "ml_g4dn"
  inline val ml_inf1: "ml_inf1" = "ml_inf1"
  inline val ml_eia2: "ml_eia2" = "ml_eia2"
  inline val jetson_tx1: "jetson_tx1" = "jetson_tx1"
  inline val jetson_tx2: "jetson_tx2" = "jetson_tx2"
  inline val jetson_nano: "jetson_nano" = "jetson_nano"
  inline val jetson_xavier: "jetson_xavier" = "jetson_xavier"
  inline val rasp3b: "rasp3b" = "rasp3b"
  inline val imx8qm: "imx8qm" = "imx8qm"
  inline val deeplens: "deeplens" = "deeplens"
  inline val rk3399: "rk3399" = "rk3399"
  inline val rk3288: "rk3288" = "rk3288"
  inline val aisage: "aisage" = "aisage"
  inline val sbe_c: "sbe_c" = "sbe_c"
  inline val qcs605: "qcs605" = "qcs605"
  inline val qcs603: "qcs603" = "qcs603"
  inline val sitara_am57x: "sitara_am57x" = "sitara_am57x"
  inline val amba_cv2: "amba_cv2" = "amba_cv2"
  inline val amba_cv22: "amba_cv22" = "amba_cv22"
  inline val amba_cv25: "amba_cv25" = "amba_cv25"
  inline val x86_win32: "x86_win32" = "x86_win32"
  inline val x86_win64: "x86_win64" = "x86_win64"
  inline val coreml: "coreml" = "coreml"
  inline val jacinto_tda4vm: "jacinto_tda4vm" = "jacinto_tda4vm"
  inline val imx8mplus: "imx8mplus" = "imx8mplus"

  inline def values: js.Array[TargetDevice] = js.Array(
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
    amba_cv2,
    amba_cv22,
    amba_cv25,
    x86_win32,
    x86_win64,
    coreml,
    jacinto_tda4vm,
    imx8mplus
  )
}

type TargetPlatformAccelerator = "INTEL_GRAPHICS" | "MALI" | "NVIDIA"
object TargetPlatformAccelerator {
  inline val INTEL_GRAPHICS: "INTEL_GRAPHICS" = "INTEL_GRAPHICS"
  inline val MALI: "MALI" = "MALI"
  inline val NVIDIA: "NVIDIA" = "NVIDIA"

  inline def values: js.Array[TargetPlatformAccelerator] = js.Array(INTEL_GRAPHICS, MALI, NVIDIA)
}

type TargetPlatformArch = "X86_64" | "X86" | "ARM64" | "ARM_EABI" | "ARM_EABIHF"
object TargetPlatformArch {
  inline val X86_64: "X86_64" = "X86_64"
  inline val X86: "X86" = "X86"
  inline val ARM64: "ARM64" = "ARM64"
  inline val ARM_EABI: "ARM_EABI" = "ARM_EABI"
  inline val ARM_EABIHF: "ARM_EABIHF" = "ARM_EABIHF"

  inline def values: js.Array[TargetPlatformArch] = js.Array(X86_64, X86, ARM64, ARM_EABI, ARM_EABIHF)
}

type TargetPlatformOs = "ANDROID" | "LINUX"
object TargetPlatformOs {
  inline val ANDROID: "ANDROID" = "ANDROID"
  inline val LINUX: "LINUX" = "LINUX"

  inline def values: js.Array[TargetPlatformOs] = js.Array(ANDROID, LINUX)
}

type TrafficRoutingConfigType = "ALL_AT_ONCE" | "CANARY" | "LINEAR"
object TrafficRoutingConfigType {
  inline val ALL_AT_ONCE: "ALL_AT_ONCE" = "ALL_AT_ONCE"
  inline val CANARY: "CANARY" = "CANARY"
  inline val LINEAR: "LINEAR" = "LINEAR"

  inline def values: js.Array[TrafficRoutingConfigType] = js.Array(ALL_AT_ONCE, CANARY, LINEAR)
}

type TrafficType = "PHASES"
object TrafficType {
  inline val PHASES: "PHASES" = "PHASES"

  inline def values: js.Array[TrafficType] = js.Array(PHASES)
}

/** The training input mode that the algorithm supports. For more information about input modes, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html|Algorithms]].
  * ```Pipe mode``` If an algorithm supports <code>Pipe</code> mode, Amazon SageMaker streams data directly from Amazon S3 to the container.
  * ```File mode``` If an algorithm supports <code>File</code> mode, SageMaker downloads the training data from S3 to the provisioned ML storage volume, and mounts the directory to the Docker volume for the training container. You must provision the ML storage volume with sufficient capacity to accommodate the data downloaded from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm container uses the ML storage volume to also store intermediate information, if any. For distributed algorithms, training data is distributed uniformly. Your training duration is predictable if the input data objects sizes are approximately the same. SageMaker does not split the files any further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is also skewed when one host in a training cluster is overloaded, thus becoming a bottleneck in training.
  * ```FastFile mode``` If an algorithm supports <code>FastFile</code> mode, SageMaker streams data directly from S3 to the container with no code changes, and provides file system access to the data. Users can author their training script to interact with these files as if they were stored on disk. <code>FastFile</code> mode works best when the data is read sequentially. Augmented manifest files aren't supported. The startup time is lower when there are fewer files in the S3 bucket provided.
  */
type TrainingInputMode = "Pipe" | "File" | "FastFile"
object TrainingInputMode {
  inline val Pipe: "Pipe" = "Pipe"
  inline val File: "File" = "File"
  inline val FastFile: "FastFile" = "FastFile"

  inline def values: js.Array[TrainingInputMode] = js.Array(Pipe, File, FastFile)
}

type TrainingInstanceType = "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.p3dn.24xlarge" | "ml.p4d.24xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5n.xlarge" | "ml.c5n.2xlarge" | "ml.c5n.4xlarge" | "ml.c5n.9xlarge" | "ml.c5n.18xlarge"
object TrainingInstanceType {
  inline val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  inline val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  inline val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  inline val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  inline val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  inline val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  inline val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  inline val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  inline val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  inline val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  inline val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"
  inline val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  inline val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  inline val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  inline val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  inline val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  inline val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  inline val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  inline val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  inline val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  inline val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  inline val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  inline val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  inline val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  inline val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  inline val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  inline val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  inline val `ml.p3dn.24xlarge`: "ml.p3dn.24xlarge" = "ml.p3dn.24xlarge"
  inline val `ml.p4d.24xlarge`: "ml.p4d.24xlarge" = "ml.p4d.24xlarge"
  inline val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  inline val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  inline val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  inline val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  inline val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  inline val `ml.c5n.xlarge`: "ml.c5n.xlarge" = "ml.c5n.xlarge"
  inline val `ml.c5n.2xlarge`: "ml.c5n.2xlarge" = "ml.c5n.2xlarge"
  inline val `ml.c5n.4xlarge`: "ml.c5n.4xlarge" = "ml.c5n.4xlarge"
  inline val `ml.c5n.9xlarge`: "ml.c5n.9xlarge" = "ml.c5n.9xlarge"
  inline val `ml.c5n.18xlarge`: "ml.c5n.18xlarge" = "ml.c5n.18xlarge"

  inline def values: js.Array[TrainingInstanceType] = js.Array(
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
  inline val Off: "Off" = "Off"
  inline val Auto: "Auto" = "Auto"

  inline def values: js.Array[TrainingJobEarlyStoppingType] = js.Array(Off, Auto)
}

type TrainingJobSortByOptions = "Name" | "CreationTime" | "Status" | "FinalObjectiveMetricValue"
object TrainingJobSortByOptions {
  inline val Name: "Name" = "Name"
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val Status: "Status" = "Status"
  inline val FinalObjectiveMetricValue: "FinalObjectiveMetricValue" = "FinalObjectiveMetricValue"

  inline def values: js.Array[TrainingJobSortByOptions] = js.Array(Name, CreationTime, Status, FinalObjectiveMetricValue)
}

type TrainingJobStatus = "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object TrainingJobStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[TrainingJobStatus] = js.Array(InProgress, Completed, Failed, Stopping, Stopped)
}

type TransformInstanceType = "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge"
object TransformInstanceType {
  inline val `ml.m4.xlarge`: "ml.m4.xlarge" = "ml.m4.xlarge"
  inline val `ml.m4.2xlarge`: "ml.m4.2xlarge" = "ml.m4.2xlarge"
  inline val `ml.m4.4xlarge`: "ml.m4.4xlarge" = "ml.m4.4xlarge"
  inline val `ml.m4.10xlarge`: "ml.m4.10xlarge" = "ml.m4.10xlarge"
  inline val `ml.m4.16xlarge`: "ml.m4.16xlarge" = "ml.m4.16xlarge"
  inline val `ml.c4.xlarge`: "ml.c4.xlarge" = "ml.c4.xlarge"
  inline val `ml.c4.2xlarge`: "ml.c4.2xlarge" = "ml.c4.2xlarge"
  inline val `ml.c4.4xlarge`: "ml.c4.4xlarge" = "ml.c4.4xlarge"
  inline val `ml.c4.8xlarge`: "ml.c4.8xlarge" = "ml.c4.8xlarge"
  inline val `ml.p2.xlarge`: "ml.p2.xlarge" = "ml.p2.xlarge"
  inline val `ml.p2.8xlarge`: "ml.p2.8xlarge" = "ml.p2.8xlarge"
  inline val `ml.p2.16xlarge`: "ml.p2.16xlarge" = "ml.p2.16xlarge"
  inline val `ml.p3.2xlarge`: "ml.p3.2xlarge" = "ml.p3.2xlarge"
  inline val `ml.p3.8xlarge`: "ml.p3.8xlarge" = "ml.p3.8xlarge"
  inline val `ml.p3.16xlarge`: "ml.p3.16xlarge" = "ml.p3.16xlarge"
  inline val `ml.c5.xlarge`: "ml.c5.xlarge" = "ml.c5.xlarge"
  inline val `ml.c5.2xlarge`: "ml.c5.2xlarge" = "ml.c5.2xlarge"
  inline val `ml.c5.4xlarge`: "ml.c5.4xlarge" = "ml.c5.4xlarge"
  inline val `ml.c5.9xlarge`: "ml.c5.9xlarge" = "ml.c5.9xlarge"
  inline val `ml.c5.18xlarge`: "ml.c5.18xlarge" = "ml.c5.18xlarge"
  inline val `ml.m5.large`: "ml.m5.large" = "ml.m5.large"
  inline val `ml.m5.xlarge`: "ml.m5.xlarge" = "ml.m5.xlarge"
  inline val `ml.m5.2xlarge`: "ml.m5.2xlarge" = "ml.m5.2xlarge"
  inline val `ml.m5.4xlarge`: "ml.m5.4xlarge" = "ml.m5.4xlarge"
  inline val `ml.m5.12xlarge`: "ml.m5.12xlarge" = "ml.m5.12xlarge"
  inline val `ml.m5.24xlarge`: "ml.m5.24xlarge" = "ml.m5.24xlarge"
  inline val `ml.g4dn.xlarge`: "ml.g4dn.xlarge" = "ml.g4dn.xlarge"
  inline val `ml.g4dn.2xlarge`: "ml.g4dn.2xlarge" = "ml.g4dn.2xlarge"
  inline val `ml.g4dn.4xlarge`: "ml.g4dn.4xlarge" = "ml.g4dn.4xlarge"
  inline val `ml.g4dn.8xlarge`: "ml.g4dn.8xlarge" = "ml.g4dn.8xlarge"
  inline val `ml.g4dn.12xlarge`: "ml.g4dn.12xlarge" = "ml.g4dn.12xlarge"
  inline val `ml.g4dn.16xlarge`: "ml.g4dn.16xlarge" = "ml.g4dn.16xlarge"

  inline def values: js.Array[TransformInstanceType] = js.Array(
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
    `ml.g4dn.xlarge`,
    `ml.g4dn.2xlarge`,
    `ml.g4dn.4xlarge`,
    `ml.g4dn.8xlarge`,
    `ml.g4dn.12xlarge`,
    `ml.g4dn.16xlarge`
  )
}

type TransformJobStatus = "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object TransformJobStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[TransformJobStatus] = js.Array(InProgress, Completed, Failed, Stopping, Stopped)
}

type TrialComponentPrimaryStatus = "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped"
object TrialComponentPrimaryStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Completed: "Completed" = "Completed"
  inline val Failed: "Failed" = "Failed"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"

  inline def values: js.Array[TrialComponentPrimaryStatus] = js.Array(InProgress, Completed, Failed, Stopping, Stopped)
}

type UserProfileSortKey = "CreationTime" | "LastModifiedTime"
object UserProfileSortKey {
  inline val CreationTime: "CreationTime" = "CreationTime"
  inline val LastModifiedTime: "LastModifiedTime" = "LastModifiedTime"

  inline def values: js.Array[UserProfileSortKey] = js.Array(CreationTime, LastModifiedTime)
}

type UserProfileStatus = "Deleting" | "Failed" | "InService" | "Pending" | "Updating" | "Update_Failed" | "Delete_Failed"
object UserProfileStatus {
  inline val Deleting: "Deleting" = "Deleting"
  inline val Failed: "Failed" = "Failed"
  inline val InService: "InService" = "InService"
  inline val Pending: "Pending" = "Pending"
  inline val Updating: "Updating" = "Updating"
  inline val Update_Failed: "Update_Failed" = "Update_Failed"
  inline val Delete_Failed: "Delete_Failed" = "Delete_Failed"

  inline def values: js.Array[UserProfileStatus] = js.Array(Deleting, Failed, InService, Pending, Updating, Update_Failed, Delete_Failed)
}

type VariantPropertyType = "DesiredInstanceCount" | "DesiredWeight" | "DataCaptureConfig"
object VariantPropertyType {
  inline val DesiredInstanceCount: "DesiredInstanceCount" = "DesiredInstanceCount"
  inline val DesiredWeight: "DesiredWeight" = "DesiredWeight"
  inline val DataCaptureConfig: "DataCaptureConfig" = "DataCaptureConfig"

  inline def values: js.Array[VariantPropertyType] = js.Array(DesiredInstanceCount, DesiredWeight, DataCaptureConfig)
}

type VariantStatus = "Creating" | "Updating" | "Deleting" | "ActivatingTraffic" | "Baking"
object VariantStatus {
  inline val Creating: "Creating" = "Creating"
  inline val Updating: "Updating" = "Updating"
  inline val Deleting: "Deleting" = "Deleting"
  inline val ActivatingTraffic: "ActivatingTraffic" = "ActivatingTraffic"
  inline val Baking: "Baking" = "Baking"

  inline def values: js.Array[VariantStatus] = js.Array(Creating, Updating, Deleting, ActivatingTraffic, Baking)
}
