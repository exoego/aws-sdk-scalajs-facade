package facade.amazonaws.services.sagemaker

import scalajs.js

@js.native
sealed trait ActionStatus extends js.Any
object ActionStatus {
  val Unknown = "Unknown".asInstanceOf[ActionStatus]
  val InProgress = "InProgress".asInstanceOf[ActionStatus]
  val Completed = "Completed".asInstanceOf[ActionStatus]
  val Failed = "Failed".asInstanceOf[ActionStatus]
  val Stopping = "Stopping".asInstanceOf[ActionStatus]
  val Stopped = "Stopped".asInstanceOf[ActionStatus]

  @inline def values: js.Array[ActionStatus] = js.Array(Unknown, InProgress, Completed, Failed, Stopping, Stopped)
}

@js.native
sealed trait AlgorithmSortBy extends js.Any
object AlgorithmSortBy {
  val Name = "Name".asInstanceOf[AlgorithmSortBy]
  val CreationTime = "CreationTime".asInstanceOf[AlgorithmSortBy]

  @inline def values: js.Array[AlgorithmSortBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait AlgorithmStatus extends js.Any
object AlgorithmStatus {
  val Pending = "Pending".asInstanceOf[AlgorithmStatus]
  val InProgress = "InProgress".asInstanceOf[AlgorithmStatus]
  val Completed = "Completed".asInstanceOf[AlgorithmStatus]
  val Failed = "Failed".asInstanceOf[AlgorithmStatus]
  val Deleting = "Deleting".asInstanceOf[AlgorithmStatus]

  @inline def values: js.Array[AlgorithmStatus] = js.Array(Pending, InProgress, Completed, Failed, Deleting)
}

@js.native
sealed trait AppImageConfigSortKey extends js.Any
object AppImageConfigSortKey {
  val CreationTime = "CreationTime".asInstanceOf[AppImageConfigSortKey]
  val LastModifiedTime = "LastModifiedTime".asInstanceOf[AppImageConfigSortKey]
  val Name = "Name".asInstanceOf[AppImageConfigSortKey]

  @inline def values: js.Array[AppImageConfigSortKey] = js.Array(CreationTime, LastModifiedTime, Name)
}

@js.native
sealed trait AppInstanceType extends js.Any
object AppInstanceType {
  val system = "system".asInstanceOf[AppInstanceType]
  val `ml.t3.micro` = "ml.t3.micro".asInstanceOf[AppInstanceType]
  val `ml.t3.small` = "ml.t3.small".asInstanceOf[AppInstanceType]
  val `ml.t3.medium` = "ml.t3.medium".asInstanceOf[AppInstanceType]
  val `ml.t3.large` = "ml.t3.large".asInstanceOf[AppInstanceType]
  val `ml.t3.xlarge` = "ml.t3.xlarge".asInstanceOf[AppInstanceType]
  val `ml.t3.2xlarge` = "ml.t3.2xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5.large` = "ml.m5.large".asInstanceOf[AppInstanceType]
  val `ml.m5.xlarge` = "ml.m5.xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5.2xlarge` = "ml.m5.2xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5.4xlarge` = "ml.m5.4xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5.8xlarge` = "ml.m5.8xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5.12xlarge` = "ml.m5.12xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5.16xlarge` = "ml.m5.16xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5.24xlarge` = "ml.m5.24xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5d.large` = "ml.m5d.large".asInstanceOf[AppInstanceType]
  val `ml.m5d.xlarge` = "ml.m5d.xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5d.2xlarge` = "ml.m5d.2xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5d.4xlarge` = "ml.m5d.4xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5d.8xlarge` = "ml.m5d.8xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5d.12xlarge` = "ml.m5d.12xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5d.16xlarge` = "ml.m5d.16xlarge".asInstanceOf[AppInstanceType]
  val `ml.m5d.24xlarge` = "ml.m5d.24xlarge".asInstanceOf[AppInstanceType]
  val `ml.c5.large` = "ml.c5.large".asInstanceOf[AppInstanceType]
  val `ml.c5.xlarge` = "ml.c5.xlarge".asInstanceOf[AppInstanceType]
  val `ml.c5.2xlarge` = "ml.c5.2xlarge".asInstanceOf[AppInstanceType]
  val `ml.c5.4xlarge` = "ml.c5.4xlarge".asInstanceOf[AppInstanceType]
  val `ml.c5.9xlarge` = "ml.c5.9xlarge".asInstanceOf[AppInstanceType]
  val `ml.c5.12xlarge` = "ml.c5.12xlarge".asInstanceOf[AppInstanceType]
  val `ml.c5.18xlarge` = "ml.c5.18xlarge".asInstanceOf[AppInstanceType]
  val `ml.c5.24xlarge` = "ml.c5.24xlarge".asInstanceOf[AppInstanceType]
  val `ml.p3.2xlarge` = "ml.p3.2xlarge".asInstanceOf[AppInstanceType]
  val `ml.p3.8xlarge` = "ml.p3.8xlarge".asInstanceOf[AppInstanceType]
  val `ml.p3.16xlarge` = "ml.p3.16xlarge".asInstanceOf[AppInstanceType]
  val `ml.p3dn.24xlarge` = "ml.p3dn.24xlarge".asInstanceOf[AppInstanceType]
  val `ml.g4dn.xlarge` = "ml.g4dn.xlarge".asInstanceOf[AppInstanceType]
  val `ml.g4dn.2xlarge` = "ml.g4dn.2xlarge".asInstanceOf[AppInstanceType]
  val `ml.g4dn.4xlarge` = "ml.g4dn.4xlarge".asInstanceOf[AppInstanceType]
  val `ml.g4dn.8xlarge` = "ml.g4dn.8xlarge".asInstanceOf[AppInstanceType]
  val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[AppInstanceType]
  val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[AppInstanceType]
  val `ml.r5.large` = "ml.r5.large".asInstanceOf[AppInstanceType]
  val `ml.r5.xlarge` = "ml.r5.xlarge".asInstanceOf[AppInstanceType]
  val `ml.r5.2xlarge` = "ml.r5.2xlarge".asInstanceOf[AppInstanceType]
  val `ml.r5.4xlarge` = "ml.r5.4xlarge".asInstanceOf[AppInstanceType]
  val `ml.r5.8xlarge` = "ml.r5.8xlarge".asInstanceOf[AppInstanceType]
  val `ml.r5.12xlarge` = "ml.r5.12xlarge".asInstanceOf[AppInstanceType]
  val `ml.r5.16xlarge` = "ml.r5.16xlarge".asInstanceOf[AppInstanceType]
  val `ml.r5.24xlarge` = "ml.r5.24xlarge".asInstanceOf[AppInstanceType]
  val `ml.g5.xlarge` = "ml.g5.xlarge".asInstanceOf[AppInstanceType]
  val `ml.g5.2xlarge` = "ml.g5.2xlarge".asInstanceOf[AppInstanceType]
  val `ml.g5.4xlarge` = "ml.g5.4xlarge".asInstanceOf[AppInstanceType]
  val `ml.g5.8xlarge` = "ml.g5.8xlarge".asInstanceOf[AppInstanceType]
  val `ml.g5.16xlarge` = "ml.g5.16xlarge".asInstanceOf[AppInstanceType]
  val `ml.g5.12xlarge` = "ml.g5.12xlarge".asInstanceOf[AppInstanceType]
  val `ml.g5.24xlarge` = "ml.g5.24xlarge".asInstanceOf[AppInstanceType]
  val `ml.g5.48xlarge` = "ml.g5.48xlarge".asInstanceOf[AppInstanceType]

  @inline def values: js.Array[AppInstanceType] = js.Array(
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
    `ml.r5.24xlarge`,
    `ml.g5.xlarge`,
    `ml.g5.2xlarge`,
    `ml.g5.4xlarge`,
    `ml.g5.8xlarge`,
    `ml.g5.16xlarge`,
    `ml.g5.12xlarge`,
    `ml.g5.24xlarge`,
    `ml.g5.48xlarge`
  )
}

@js.native
sealed trait AppNetworkAccessType extends js.Any
object AppNetworkAccessType {
  val PublicInternetOnly = "PublicInternetOnly".asInstanceOf[AppNetworkAccessType]
  val VpcOnly = "VpcOnly".asInstanceOf[AppNetworkAccessType]

  @inline def values: js.Array[AppNetworkAccessType] = js.Array(PublicInternetOnly, VpcOnly)
}

@js.native
sealed trait AppSecurityGroupManagement extends js.Any
object AppSecurityGroupManagement {
  val Service = "Service".asInstanceOf[AppSecurityGroupManagement]
  val Customer = "Customer".asInstanceOf[AppSecurityGroupManagement]

  @inline def values: js.Array[AppSecurityGroupManagement] = js.Array(Service, Customer)
}

@js.native
sealed trait AppSortKey extends js.Any
object AppSortKey {
  val CreationTime = "CreationTime".asInstanceOf[AppSortKey]

  @inline def values: js.Array[AppSortKey] = js.Array(CreationTime)
}

@js.native
sealed trait AppStatus extends js.Any
object AppStatus {
  val Deleted = "Deleted".asInstanceOf[AppStatus]
  val Deleting = "Deleting".asInstanceOf[AppStatus]
  val Failed = "Failed".asInstanceOf[AppStatus]
  val InService = "InService".asInstanceOf[AppStatus]
  val Pending = "Pending".asInstanceOf[AppStatus]

  @inline def values: js.Array[AppStatus] = js.Array(Deleted, Deleting, Failed, InService, Pending)
}

@js.native
sealed trait AppType extends js.Any
object AppType {
  val JupyterServer = "JupyterServer".asInstanceOf[AppType]
  val KernelGateway = "KernelGateway".asInstanceOf[AppType]
  val TensorBoard = "TensorBoard".asInstanceOf[AppType]
  val RStudioServerPro = "RStudioServerPro".asInstanceOf[AppType]
  val RSessionGateway = "RSessionGateway".asInstanceOf[AppType]

  @inline def values: js.Array[AppType] = js.Array(JupyterServer, KernelGateway, TensorBoard, RStudioServerPro, RSessionGateway)
}

@js.native
sealed trait ArtifactSourceIdType extends js.Any
object ArtifactSourceIdType {
  val MD5Hash = "MD5Hash".asInstanceOf[ArtifactSourceIdType]
  val S3ETag = "S3ETag".asInstanceOf[ArtifactSourceIdType]
  val S3Version = "S3Version".asInstanceOf[ArtifactSourceIdType]
  val Custom = "Custom".asInstanceOf[ArtifactSourceIdType]

  @inline def values: js.Array[ArtifactSourceIdType] = js.Array(MD5Hash, S3ETag, S3Version, Custom)
}

@js.native
sealed trait AssemblyType extends js.Any
object AssemblyType {
  val None = "None".asInstanceOf[AssemblyType]
  val Line = "Line".asInstanceOf[AssemblyType]

  @inline def values: js.Array[AssemblyType] = js.Array(None, Line)
}

@js.native
sealed trait AssociationEdgeType extends js.Any
object AssociationEdgeType {
  val ContributedTo = "ContributedTo".asInstanceOf[AssociationEdgeType]
  val AssociatedWith = "AssociatedWith".asInstanceOf[AssociationEdgeType]
  val DerivedFrom = "DerivedFrom".asInstanceOf[AssociationEdgeType]
  val Produced = "Produced".asInstanceOf[AssociationEdgeType]

  @inline def values: js.Array[AssociationEdgeType] = js.Array(ContributedTo, AssociatedWith, DerivedFrom, Produced)
}

/** The compression used for Athena query results.
  */
@js.native
sealed trait AthenaResultCompressionType extends js.Any
object AthenaResultCompressionType {
  val GZIP = "GZIP".asInstanceOf[AthenaResultCompressionType]
  val SNAPPY = "SNAPPY".asInstanceOf[AthenaResultCompressionType]
  val ZLIB = "ZLIB".asInstanceOf[AthenaResultCompressionType]

  @inline def values: js.Array[AthenaResultCompressionType] = js.Array(GZIP, SNAPPY, ZLIB)
}

/** The data storage format for Athena query results.
  */
@js.native
sealed trait AthenaResultFormat extends js.Any
object AthenaResultFormat {
  val PARQUET = "PARQUET".asInstanceOf[AthenaResultFormat]
  val ORC = "ORC".asInstanceOf[AthenaResultFormat]
  val AVRO = "AVRO".asInstanceOf[AthenaResultFormat]
  val JSON = "JSON".asInstanceOf[AthenaResultFormat]
  val TEXTFILE = "TEXTFILE".asInstanceOf[AthenaResultFormat]

  @inline def values: js.Array[AthenaResultFormat] = js.Array(PARQUET, ORC, AVRO, JSON, TEXTFILE)
}

@js.native
sealed trait AuthMode extends js.Any
object AuthMode {
  val SSO = "SSO".asInstanceOf[AuthMode]
  val IAM = "IAM".asInstanceOf[AuthMode]

  @inline def values: js.Array[AuthMode] = js.Array(SSO, IAM)
}

@js.native
sealed trait AutoMLChannelType extends js.Any
object AutoMLChannelType {
  val training = "training".asInstanceOf[AutoMLChannelType]
  val validation = "validation".asInstanceOf[AutoMLChannelType]

  @inline def values: js.Array[AutoMLChannelType] = js.Array(training, validation)
}

@js.native
sealed trait AutoMLJobObjectiveType extends js.Any
object AutoMLJobObjectiveType {
  val Maximize = "Maximize".asInstanceOf[AutoMLJobObjectiveType]
  val Minimize = "Minimize".asInstanceOf[AutoMLJobObjectiveType]

  @inline def values: js.Array[AutoMLJobObjectiveType] = js.Array(Maximize, Minimize)
}

@js.native
sealed trait AutoMLJobSecondaryStatus extends js.Any
object AutoMLJobSecondaryStatus {
  val Starting = "Starting".asInstanceOf[AutoMLJobSecondaryStatus]
  val AnalyzingData = "AnalyzingData".asInstanceOf[AutoMLJobSecondaryStatus]
  val FeatureEngineering = "FeatureEngineering".asInstanceOf[AutoMLJobSecondaryStatus]
  val ModelTuning = "ModelTuning".asInstanceOf[AutoMLJobSecondaryStatus]
  val MaxCandidatesReached = "MaxCandidatesReached".asInstanceOf[AutoMLJobSecondaryStatus]
  val Failed = "Failed".asInstanceOf[AutoMLJobSecondaryStatus]
  val Stopped = "Stopped".asInstanceOf[AutoMLJobSecondaryStatus]
  val MaxAutoMLJobRuntimeReached = "MaxAutoMLJobRuntimeReached".asInstanceOf[AutoMLJobSecondaryStatus]
  val Stopping = "Stopping".asInstanceOf[AutoMLJobSecondaryStatus]
  val CandidateDefinitionsGenerated = "CandidateDefinitionsGenerated".asInstanceOf[AutoMLJobSecondaryStatus]
  val GeneratingExplainabilityReport = "GeneratingExplainabilityReport".asInstanceOf[AutoMLJobSecondaryStatus]
  val Completed = "Completed".asInstanceOf[AutoMLJobSecondaryStatus]
  val ExplainabilityError = "ExplainabilityError".asInstanceOf[AutoMLJobSecondaryStatus]
  val DeployingModel = "DeployingModel".asInstanceOf[AutoMLJobSecondaryStatus]
  val ModelDeploymentError = "ModelDeploymentError".asInstanceOf[AutoMLJobSecondaryStatus]
  val GeneratingModelInsightsReport = "GeneratingModelInsightsReport".asInstanceOf[AutoMLJobSecondaryStatus]
  val ModelInsightsError = "ModelInsightsError".asInstanceOf[AutoMLJobSecondaryStatus]

  @inline def values: js.Array[AutoMLJobSecondaryStatus] = js.Array(
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
    ModelDeploymentError,
    GeneratingModelInsightsReport,
    ModelInsightsError
  )
}

@js.native
sealed trait AutoMLJobStatus extends js.Any
object AutoMLJobStatus {
  val Completed = "Completed".asInstanceOf[AutoMLJobStatus]
  val InProgress = "InProgress".asInstanceOf[AutoMLJobStatus]
  val Failed = "Failed".asInstanceOf[AutoMLJobStatus]
  val Stopped = "Stopped".asInstanceOf[AutoMLJobStatus]
  val Stopping = "Stopping".asInstanceOf[AutoMLJobStatus]

  @inline def values: js.Array[AutoMLJobStatus] = js.Array(Completed, InProgress, Failed, Stopped, Stopping)
}

@js.native
sealed trait AutoMLMetricEnum extends js.Any
object AutoMLMetricEnum {
  val Accuracy = "Accuracy".asInstanceOf[AutoMLMetricEnum]
  val MSE = "MSE".asInstanceOf[AutoMLMetricEnum]
  val F1 = "F1".asInstanceOf[AutoMLMetricEnum]
  val F1macro = "F1macro".asInstanceOf[AutoMLMetricEnum]
  val AUC = "AUC".asInstanceOf[AutoMLMetricEnum]

  @inline def values: js.Array[AutoMLMetricEnum] = js.Array(Accuracy, MSE, F1, F1macro, AUC)
}

@js.native
sealed trait AutoMLMetricExtendedEnum extends js.Any
object AutoMLMetricExtendedEnum {
  val Accuracy = "Accuracy".asInstanceOf[AutoMLMetricExtendedEnum]
  val MSE = "MSE".asInstanceOf[AutoMLMetricExtendedEnum]
  val F1 = "F1".asInstanceOf[AutoMLMetricExtendedEnum]
  val F1macro = "F1macro".asInstanceOf[AutoMLMetricExtendedEnum]
  val AUC = "AUC".asInstanceOf[AutoMLMetricExtendedEnum]
  val RMSE = "RMSE".asInstanceOf[AutoMLMetricExtendedEnum]
  val MAE = "MAE".asInstanceOf[AutoMLMetricExtendedEnum]
  val R2 = "R2".asInstanceOf[AutoMLMetricExtendedEnum]
  val BalancedAccuracy = "BalancedAccuracy".asInstanceOf[AutoMLMetricExtendedEnum]
  val Precision = "Precision".asInstanceOf[AutoMLMetricExtendedEnum]
  val PrecisionMacro = "PrecisionMacro".asInstanceOf[AutoMLMetricExtendedEnum]
  val Recall = "Recall".asInstanceOf[AutoMLMetricExtendedEnum]
  val RecallMacro = "RecallMacro".asInstanceOf[AutoMLMetricExtendedEnum]
  val LogLoss = "LogLoss".asInstanceOf[AutoMLMetricExtendedEnum]
  val InferenceLatency = "InferenceLatency".asInstanceOf[AutoMLMetricExtendedEnum]

  @inline def values: js.Array[AutoMLMetricExtendedEnum] = js.Array(Accuracy, MSE, F1, F1macro, AUC, RMSE, MAE, R2, BalancedAccuracy, Precision, PrecisionMacro, Recall, RecallMacro, LogLoss, InferenceLatency)
}

@js.native
sealed trait AutoMLMode extends js.Any
object AutoMLMode {
  val AUTO = "AUTO".asInstanceOf[AutoMLMode]
  val ENSEMBLING = "ENSEMBLING".asInstanceOf[AutoMLMode]
  val HYPERPARAMETER_TUNING = "HYPERPARAMETER_TUNING".asInstanceOf[AutoMLMode]

  @inline def values: js.Array[AutoMLMode] = js.Array(AUTO, ENSEMBLING, HYPERPARAMETER_TUNING)
}

@js.native
sealed trait AutoMLS3DataType extends js.Any
object AutoMLS3DataType {
  val ManifestFile = "ManifestFile".asInstanceOf[AutoMLS3DataType]
  val S3Prefix = "S3Prefix".asInstanceOf[AutoMLS3DataType]

  @inline def values: js.Array[AutoMLS3DataType] = js.Array(ManifestFile, S3Prefix)
}

@js.native
sealed trait AutoMLSortBy extends js.Any
object AutoMLSortBy {
  val Name = "Name".asInstanceOf[AutoMLSortBy]
  val CreationTime = "CreationTime".asInstanceOf[AutoMLSortBy]
  val Status = "Status".asInstanceOf[AutoMLSortBy]

  @inline def values: js.Array[AutoMLSortBy] = js.Array(Name, CreationTime, Status)
}

@js.native
sealed trait AutoMLSortOrder extends js.Any
object AutoMLSortOrder {
  val Ascending = "Ascending".asInstanceOf[AutoMLSortOrder]
  val Descending = "Descending".asInstanceOf[AutoMLSortOrder]

  @inline def values: js.Array[AutoMLSortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait AwsManagedHumanLoopRequestSource extends js.Any
object AwsManagedHumanLoopRequestSource {
  val `AWS/Rekognition/DetectModerationLabels/Image/V3` = "AWS/Rekognition/DetectModerationLabels/Image/V3".asInstanceOf[AwsManagedHumanLoopRequestSource]
  val `AWS/Textract/AnalyzeDocument/Forms/V1` = "AWS/Textract/AnalyzeDocument/Forms/V1".asInstanceOf[AwsManagedHumanLoopRequestSource]

  @inline def values: js.Array[AwsManagedHumanLoopRequestSource] = js.Array(`AWS/Rekognition/DetectModerationLabels/Image/V3`, `AWS/Textract/AnalyzeDocument/Forms/V1`)
}

@js.native
sealed trait BatchStrategy extends js.Any
object BatchStrategy {
  val MultiRecord = "MultiRecord".asInstanceOf[BatchStrategy]
  val SingleRecord = "SingleRecord".asInstanceOf[BatchStrategy]

  @inline def values: js.Array[BatchStrategy] = js.Array(MultiRecord, SingleRecord)
}

@js.native
sealed trait BooleanOperator extends js.Any
object BooleanOperator {
  val And = "And".asInstanceOf[BooleanOperator]
  val Or = "Or".asInstanceOf[BooleanOperator]

  @inline def values: js.Array[BooleanOperator] = js.Array(And, Or)
}

@js.native
sealed trait CandidateSortBy extends js.Any
object CandidateSortBy {
  val CreationTime = "CreationTime".asInstanceOf[CandidateSortBy]
  val Status = "Status".asInstanceOf[CandidateSortBy]
  val FinalObjectiveMetricValue = "FinalObjectiveMetricValue".asInstanceOf[CandidateSortBy]

  @inline def values: js.Array[CandidateSortBy] = js.Array(CreationTime, Status, FinalObjectiveMetricValue)
}

@js.native
sealed trait CandidateStatus extends js.Any
object CandidateStatus {
  val Completed = "Completed".asInstanceOf[CandidateStatus]
  val InProgress = "InProgress".asInstanceOf[CandidateStatus]
  val Failed = "Failed".asInstanceOf[CandidateStatus]
  val Stopped = "Stopped".asInstanceOf[CandidateStatus]
  val Stopping = "Stopping".asInstanceOf[CandidateStatus]

  @inline def values: js.Array[CandidateStatus] = js.Array(Completed, InProgress, Failed, Stopped, Stopping)
}

@js.native
sealed trait CandidateStepType extends js.Any
object CandidateStepType {
  val `AWS::SageMaker::TrainingJob` = "AWS::SageMaker::TrainingJob".asInstanceOf[CandidateStepType]
  val `AWS::SageMaker::TransformJob` = "AWS::SageMaker::TransformJob".asInstanceOf[CandidateStepType]
  val `AWS::SageMaker::ProcessingJob` = "AWS::SageMaker::ProcessingJob".asInstanceOf[CandidateStepType]

  @inline def values: js.Array[CandidateStepType] = js.Array(`AWS::SageMaker::TrainingJob`, `AWS::SageMaker::TransformJob`, `AWS::SageMaker::ProcessingJob`)
}

@js.native
sealed trait CapacitySizeType extends js.Any
object CapacitySizeType {
  val INSTANCE_COUNT = "INSTANCE_COUNT".asInstanceOf[CapacitySizeType]
  val CAPACITY_PERCENT = "CAPACITY_PERCENT".asInstanceOf[CapacitySizeType]

  @inline def values: js.Array[CapacitySizeType] = js.Array(INSTANCE_COUNT, CAPACITY_PERCENT)
}

@js.native
sealed trait CaptureMode extends js.Any
object CaptureMode {
  val Input = "Input".asInstanceOf[CaptureMode]
  val Output = "Output".asInstanceOf[CaptureMode]

  @inline def values: js.Array[CaptureMode] = js.Array(Input, Output)
}

@js.native
sealed trait CaptureStatus extends js.Any
object CaptureStatus {
  val Started = "Started".asInstanceOf[CaptureStatus]
  val Stopped = "Stopped".asInstanceOf[CaptureStatus]

  @inline def values: js.Array[CaptureStatus] = js.Array(Started, Stopped)
}

@js.native
sealed trait ClarifyFeatureType extends js.Any
object ClarifyFeatureType {
  val numerical = "numerical".asInstanceOf[ClarifyFeatureType]
  val categorical = "categorical".asInstanceOf[ClarifyFeatureType]
  val text = "text".asInstanceOf[ClarifyFeatureType]

  @inline def values: js.Array[ClarifyFeatureType] = js.Array(numerical, categorical, text)
}

@js.native
sealed trait ClarifyTextGranularity extends js.Any
object ClarifyTextGranularity {
  val token = "token".asInstanceOf[ClarifyTextGranularity]
  val sentence = "sentence".asInstanceOf[ClarifyTextGranularity]
  val paragraph = "paragraph".asInstanceOf[ClarifyTextGranularity]

  @inline def values: js.Array[ClarifyTextGranularity] = js.Array(token, sentence, paragraph)
}

@js.native
sealed trait ClarifyTextLanguage extends js.Any
object ClarifyTextLanguage {
  val af = "af".asInstanceOf[ClarifyTextLanguage]
  val sq = "sq".asInstanceOf[ClarifyTextLanguage]
  val ar = "ar".asInstanceOf[ClarifyTextLanguage]
  val hy = "hy".asInstanceOf[ClarifyTextLanguage]
  val eu = "eu".asInstanceOf[ClarifyTextLanguage]
  val bn = "bn".asInstanceOf[ClarifyTextLanguage]
  val bg = "bg".asInstanceOf[ClarifyTextLanguage]
  val ca = "ca".asInstanceOf[ClarifyTextLanguage]
  val zh = "zh".asInstanceOf[ClarifyTextLanguage]
  val hr = "hr".asInstanceOf[ClarifyTextLanguage]
  val cs = "cs".asInstanceOf[ClarifyTextLanguage]
  val da = "da".asInstanceOf[ClarifyTextLanguage]
  val nl = "nl".asInstanceOf[ClarifyTextLanguage]
  val en = "en".asInstanceOf[ClarifyTextLanguage]
  val et = "et".asInstanceOf[ClarifyTextLanguage]
  val fi = "fi".asInstanceOf[ClarifyTextLanguage]
  val fr = "fr".asInstanceOf[ClarifyTextLanguage]
  val de = "de".asInstanceOf[ClarifyTextLanguage]
  val el = "el".asInstanceOf[ClarifyTextLanguage]
  val gu = "gu".asInstanceOf[ClarifyTextLanguage]
  val he = "he".asInstanceOf[ClarifyTextLanguage]
  val hi = "hi".asInstanceOf[ClarifyTextLanguage]
  val hu = "hu".asInstanceOf[ClarifyTextLanguage]
  val is = "is".asInstanceOf[ClarifyTextLanguage]
  val id = "id".asInstanceOf[ClarifyTextLanguage]
  val ga = "ga".asInstanceOf[ClarifyTextLanguage]
  val it = "it".asInstanceOf[ClarifyTextLanguage]
  val kn = "kn".asInstanceOf[ClarifyTextLanguage]
  val ky = "ky".asInstanceOf[ClarifyTextLanguage]
  val lv = "lv".asInstanceOf[ClarifyTextLanguage]
  val lt = "lt".asInstanceOf[ClarifyTextLanguage]
  val lb = "lb".asInstanceOf[ClarifyTextLanguage]
  val mk = "mk".asInstanceOf[ClarifyTextLanguage]
  val ml = "ml".asInstanceOf[ClarifyTextLanguage]
  val mr = "mr".asInstanceOf[ClarifyTextLanguage]
  val ne = "ne".asInstanceOf[ClarifyTextLanguage]
  val nb = "nb".asInstanceOf[ClarifyTextLanguage]
  val fa = "fa".asInstanceOf[ClarifyTextLanguage]
  val pl = "pl".asInstanceOf[ClarifyTextLanguage]
  val pt = "pt".asInstanceOf[ClarifyTextLanguage]
  val ro = "ro".asInstanceOf[ClarifyTextLanguage]
  val ru = "ru".asInstanceOf[ClarifyTextLanguage]
  val sa = "sa".asInstanceOf[ClarifyTextLanguage]
  val sr = "sr".asInstanceOf[ClarifyTextLanguage]
  val tn = "tn".asInstanceOf[ClarifyTextLanguage]
  val si = "si".asInstanceOf[ClarifyTextLanguage]
  val sk = "sk".asInstanceOf[ClarifyTextLanguage]
  val sl = "sl".asInstanceOf[ClarifyTextLanguage]
  val es = "es".asInstanceOf[ClarifyTextLanguage]
  val sv = "sv".asInstanceOf[ClarifyTextLanguage]
  val tl = "tl".asInstanceOf[ClarifyTextLanguage]
  val ta = "ta".asInstanceOf[ClarifyTextLanguage]
  val tt = "tt".asInstanceOf[ClarifyTextLanguage]
  val te = "te".asInstanceOf[ClarifyTextLanguage]
  val tr = "tr".asInstanceOf[ClarifyTextLanguage]
  val uk = "uk".asInstanceOf[ClarifyTextLanguage]
  val ur = "ur".asInstanceOf[ClarifyTextLanguage]
  val yo = "yo".asInstanceOf[ClarifyTextLanguage]
  val lij = "lij".asInstanceOf[ClarifyTextLanguage]
  val xx = "xx".asInstanceOf[ClarifyTextLanguage]

  @inline def values: js.Array[ClarifyTextLanguage] = js.Array(
    af,
    sq,
    ar,
    hy,
    eu,
    bn,
    bg,
    ca,
    zh,
    hr,
    cs,
    da,
    nl,
    en,
    et,
    fi,
    fr,
    de,
    el,
    gu,
    he,
    hi,
    hu,
    is,
    id,
    ga,
    it,
    kn,
    ky,
    lv,
    lt,
    lb,
    mk,
    ml,
    mr,
    ne,
    nb,
    fa,
    pl,
    pt,
    ro,
    ru,
    sa,
    sr,
    tn,
    si,
    sk,
    sl,
    es,
    sv,
    tl,
    ta,
    tt,
    te,
    tr,
    uk,
    ur,
    yo,
    lij,
    xx
  )
}

@js.native
sealed trait CodeRepositorySortBy extends js.Any
object CodeRepositorySortBy {
  val Name = "Name".asInstanceOf[CodeRepositorySortBy]
  val CreationTime = "CreationTime".asInstanceOf[CodeRepositorySortBy]
  val LastModifiedTime = "LastModifiedTime".asInstanceOf[CodeRepositorySortBy]

  @inline def values: js.Array[CodeRepositorySortBy] = js.Array(Name, CreationTime, LastModifiedTime)
}

@js.native
sealed trait CodeRepositorySortOrder extends js.Any
object CodeRepositorySortOrder {
  val Ascending = "Ascending".asInstanceOf[CodeRepositorySortOrder]
  val Descending = "Descending".asInstanceOf[CodeRepositorySortOrder]

  @inline def values: js.Array[CodeRepositorySortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait CompilationJobStatus extends js.Any
object CompilationJobStatus {
  val INPROGRESS = "INPROGRESS".asInstanceOf[CompilationJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[CompilationJobStatus]
  val FAILED = "FAILED".asInstanceOf[CompilationJobStatus]
  val STARTING = "STARTING".asInstanceOf[CompilationJobStatus]
  val STOPPING = "STOPPING".asInstanceOf[CompilationJobStatus]
  val STOPPED = "STOPPED".asInstanceOf[CompilationJobStatus]

  @inline def values: js.Array[CompilationJobStatus] = js.Array(INPROGRESS, COMPLETED, FAILED, STARTING, STOPPING, STOPPED)
}

@js.native
sealed trait CompressionType extends js.Any
object CompressionType {
  val None = "None".asInstanceOf[CompressionType]
  val Gzip = "Gzip".asInstanceOf[CompressionType]

  @inline def values: js.Array[CompressionType] = js.Array(None, Gzip)
}

@js.native
sealed trait ConditionOutcome extends js.Any
object ConditionOutcome {
  val True = "True".asInstanceOf[ConditionOutcome]
  val False = "False".asInstanceOf[ConditionOutcome]

  @inline def values: js.Array[ConditionOutcome] = js.Array(True, False)
}

@js.native
sealed trait ContainerMode extends js.Any
object ContainerMode {
  val SingleModel = "SingleModel".asInstanceOf[ContainerMode]
  val MultiModel = "MultiModel".asInstanceOf[ContainerMode]

  @inline def values: js.Array[ContainerMode] = js.Array(SingleModel, MultiModel)
}

@js.native
sealed trait ContentClassifier extends js.Any
object ContentClassifier {
  val FreeOfPersonallyIdentifiableInformation = "FreeOfPersonallyIdentifiableInformation".asInstanceOf[ContentClassifier]
  val FreeOfAdultContent = "FreeOfAdultContent".asInstanceOf[ContentClassifier]

  @inline def values: js.Array[ContentClassifier] = js.Array(FreeOfPersonallyIdentifiableInformation, FreeOfAdultContent)
}

@js.native
sealed trait DataDistributionType extends js.Any
object DataDistributionType {
  val FullyReplicated = "FullyReplicated".asInstanceOf[DataDistributionType]
  val ShardedByS3Key = "ShardedByS3Key".asInstanceOf[DataDistributionType]

  @inline def values: js.Array[DataDistributionType] = js.Array(FullyReplicated, ShardedByS3Key)
}

@js.native
sealed trait DetailedAlgorithmStatus extends js.Any
object DetailedAlgorithmStatus {
  val NotStarted = "NotStarted".asInstanceOf[DetailedAlgorithmStatus]
  val InProgress = "InProgress".asInstanceOf[DetailedAlgorithmStatus]
  val Completed = "Completed".asInstanceOf[DetailedAlgorithmStatus]
  val Failed = "Failed".asInstanceOf[DetailedAlgorithmStatus]

  @inline def values: js.Array[DetailedAlgorithmStatus] = js.Array(NotStarted, InProgress, Completed, Failed)
}

@js.native
sealed trait DetailedModelPackageStatus extends js.Any
object DetailedModelPackageStatus {
  val NotStarted = "NotStarted".asInstanceOf[DetailedModelPackageStatus]
  val InProgress = "InProgress".asInstanceOf[DetailedModelPackageStatus]
  val Completed = "Completed".asInstanceOf[DetailedModelPackageStatus]
  val Failed = "Failed".asInstanceOf[DetailedModelPackageStatus]

  @inline def values: js.Array[DetailedModelPackageStatus] = js.Array(NotStarted, InProgress, Completed, Failed)
}

@js.native
sealed trait DeviceDeploymentStatus extends js.Any
object DeviceDeploymentStatus {
  val READYTODEPLOY = "READYTODEPLOY".asInstanceOf[DeviceDeploymentStatus]
  val INPROGRESS = "INPROGRESS".asInstanceOf[DeviceDeploymentStatus]
  val DEPLOYED = "DEPLOYED".asInstanceOf[DeviceDeploymentStatus]
  val FAILED = "FAILED".asInstanceOf[DeviceDeploymentStatus]
  val STOPPING = "STOPPING".asInstanceOf[DeviceDeploymentStatus]
  val STOPPED = "STOPPED".asInstanceOf[DeviceDeploymentStatus]

  @inline def values: js.Array[DeviceDeploymentStatus] = js.Array(READYTODEPLOY, INPROGRESS, DEPLOYED, FAILED, STOPPING, STOPPED)
}

@js.native
sealed trait DeviceSubsetType extends js.Any
object DeviceSubsetType {
  val PERCENTAGE = "PERCENTAGE".asInstanceOf[DeviceSubsetType]
  val SELECTION = "SELECTION".asInstanceOf[DeviceSubsetType]
  val NAMECONTAINS = "NAMECONTAINS".asInstanceOf[DeviceSubsetType]

  @inline def values: js.Array[DeviceSubsetType] = js.Array(PERCENTAGE, SELECTION, NAMECONTAINS)
}

@js.native
sealed trait DirectInternetAccess extends js.Any
object DirectInternetAccess {
  val Enabled = "Enabled".asInstanceOf[DirectInternetAccess]
  val Disabled = "Disabled".asInstanceOf[DirectInternetAccess]

  @inline def values: js.Array[DirectInternetAccess] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait Direction extends js.Any
object Direction {
  val Both = "Both".asInstanceOf[Direction]
  val Ascendants = "Ascendants".asInstanceOf[Direction]
  val Descendants = "Descendants".asInstanceOf[Direction]

  @inline def values: js.Array[Direction] = js.Array(Both, Ascendants, Descendants)
}

@js.native
sealed trait DomainStatus extends js.Any
object DomainStatus {
  val Deleting = "Deleting".asInstanceOf[DomainStatus]
  val Failed = "Failed".asInstanceOf[DomainStatus]
  val InService = "InService".asInstanceOf[DomainStatus]
  val Pending = "Pending".asInstanceOf[DomainStatus]
  val Updating = "Updating".asInstanceOf[DomainStatus]
  val Update_Failed = "Update_Failed".asInstanceOf[DomainStatus]
  val Delete_Failed = "Delete_Failed".asInstanceOf[DomainStatus]

  @inline def values: js.Array[DomainStatus] = js.Array(Deleting, Failed, InService, Pending, Updating, Update_Failed, Delete_Failed)
}

@js.native
sealed trait EdgePackagingJobStatus extends js.Any
object EdgePackagingJobStatus {
  val STARTING = "STARTING".asInstanceOf[EdgePackagingJobStatus]
  val INPROGRESS = "INPROGRESS".asInstanceOf[EdgePackagingJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[EdgePackagingJobStatus]
  val FAILED = "FAILED".asInstanceOf[EdgePackagingJobStatus]
  val STOPPING = "STOPPING".asInstanceOf[EdgePackagingJobStatus]
  val STOPPED = "STOPPED".asInstanceOf[EdgePackagingJobStatus]

  @inline def values: js.Array[EdgePackagingJobStatus] = js.Array(STARTING, INPROGRESS, COMPLETED, FAILED, STOPPING, STOPPED)
}

@js.native
sealed trait EdgePresetDeploymentStatus extends js.Any
object EdgePresetDeploymentStatus {
  val COMPLETED = "COMPLETED".asInstanceOf[EdgePresetDeploymentStatus]
  val FAILED = "FAILED".asInstanceOf[EdgePresetDeploymentStatus]

  @inline def values: js.Array[EdgePresetDeploymentStatus] = js.Array(COMPLETED, FAILED)
}

@js.native
sealed trait EdgePresetDeploymentType extends js.Any
object EdgePresetDeploymentType {
  val GreengrassV2Component = "GreengrassV2Component".asInstanceOf[EdgePresetDeploymentType]

  @inline def values: js.Array[EdgePresetDeploymentType] = js.Array(GreengrassV2Component)
}

@js.native
sealed trait EndpointConfigSortKey extends js.Any
object EndpointConfigSortKey {
  val Name = "Name".asInstanceOf[EndpointConfigSortKey]
  val CreationTime = "CreationTime".asInstanceOf[EndpointConfigSortKey]

  @inline def values: js.Array[EndpointConfigSortKey] = js.Array(Name, CreationTime)
}

@js.native
sealed trait EndpointSortKey extends js.Any
object EndpointSortKey {
  val Name = "Name".asInstanceOf[EndpointSortKey]
  val CreationTime = "CreationTime".asInstanceOf[EndpointSortKey]
  val Status = "Status".asInstanceOf[EndpointSortKey]

  @inline def values: js.Array[EndpointSortKey] = js.Array(Name, CreationTime, Status)
}

@js.native
sealed trait EndpointStatus extends js.Any
object EndpointStatus {
  val OutOfService = "OutOfService".asInstanceOf[EndpointStatus]
  val Creating = "Creating".asInstanceOf[EndpointStatus]
  val Updating = "Updating".asInstanceOf[EndpointStatus]
  val SystemUpdating = "SystemUpdating".asInstanceOf[EndpointStatus]
  val RollingBack = "RollingBack".asInstanceOf[EndpointStatus]
  val InService = "InService".asInstanceOf[EndpointStatus]
  val Deleting = "Deleting".asInstanceOf[EndpointStatus]
  val Failed = "Failed".asInstanceOf[EndpointStatus]

  @inline def values: js.Array[EndpointStatus] = js.Array(OutOfService, Creating, Updating, SystemUpdating, RollingBack, InService, Deleting, Failed)
}

@js.native
sealed trait ExecutionRoleIdentityConfig extends js.Any
object ExecutionRoleIdentityConfig {
  val USER_PROFILE_NAME = "USER_PROFILE_NAME".asInstanceOf[ExecutionRoleIdentityConfig]
  val DISABLED = "DISABLED".asInstanceOf[ExecutionRoleIdentityConfig]

  @inline def values: js.Array[ExecutionRoleIdentityConfig] = js.Array(USER_PROFILE_NAME, DISABLED)
}

@js.native
sealed trait ExecutionStatus extends js.Any
object ExecutionStatus {
  val Pending = "Pending".asInstanceOf[ExecutionStatus]
  val Completed = "Completed".asInstanceOf[ExecutionStatus]
  val CompletedWithViolations = "CompletedWithViolations".asInstanceOf[ExecutionStatus]
  val InProgress = "InProgress".asInstanceOf[ExecutionStatus]
  val Failed = "Failed".asInstanceOf[ExecutionStatus]
  val Stopping = "Stopping".asInstanceOf[ExecutionStatus]
  val Stopped = "Stopped".asInstanceOf[ExecutionStatus]

  @inline def values: js.Array[ExecutionStatus] = js.Array(Pending, Completed, CompletedWithViolations, InProgress, Failed, Stopping, Stopped)
}

@js.native
sealed trait FailureHandlingPolicy extends js.Any
object FailureHandlingPolicy {
  val ROLLBACK_ON_FAILURE = "ROLLBACK_ON_FAILURE".asInstanceOf[FailureHandlingPolicy]
  val DO_NOTHING = "DO_NOTHING".asInstanceOf[FailureHandlingPolicy]

  @inline def values: js.Array[FailureHandlingPolicy] = js.Array(ROLLBACK_ON_FAILURE, DO_NOTHING)
}

@js.native
sealed trait FeatureGroupSortBy extends js.Any
object FeatureGroupSortBy {
  val Name = "Name".asInstanceOf[FeatureGroupSortBy]
  val FeatureGroupStatus = "FeatureGroupStatus".asInstanceOf[FeatureGroupSortBy]
  val OfflineStoreStatus = "OfflineStoreStatus".asInstanceOf[FeatureGroupSortBy]
  val CreationTime = "CreationTime".asInstanceOf[FeatureGroupSortBy]

  @inline def values: js.Array[FeatureGroupSortBy] = js.Array(Name, FeatureGroupStatus, OfflineStoreStatus, CreationTime)
}

@js.native
sealed trait FeatureGroupSortOrder extends js.Any
object FeatureGroupSortOrder {
  val Ascending = "Ascending".asInstanceOf[FeatureGroupSortOrder]
  val Descending = "Descending".asInstanceOf[FeatureGroupSortOrder]

  @inline def values: js.Array[FeatureGroupSortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait FeatureGroupStatus extends js.Any
object FeatureGroupStatus {
  val Creating = "Creating".asInstanceOf[FeatureGroupStatus]
  val Created = "Created".asInstanceOf[FeatureGroupStatus]
  val CreateFailed = "CreateFailed".asInstanceOf[FeatureGroupStatus]
  val Deleting = "Deleting".asInstanceOf[FeatureGroupStatus]
  val DeleteFailed = "DeleteFailed".asInstanceOf[FeatureGroupStatus]

  @inline def values: js.Array[FeatureGroupStatus] = js.Array(Creating, Created, CreateFailed, Deleting, DeleteFailed)
}

@js.native
sealed trait FeatureStatus extends js.Any
object FeatureStatus {
  val ENABLED = "ENABLED".asInstanceOf[FeatureStatus]
  val DISABLED = "DISABLED".asInstanceOf[FeatureStatus]

  @inline def values: js.Array[FeatureStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait FeatureType extends js.Any
object FeatureType {
  val Integral = "Integral".asInstanceOf[FeatureType]
  val Fractional = "Fractional".asInstanceOf[FeatureType]
  val String = "String".asInstanceOf[FeatureType]

  @inline def values: js.Array[FeatureType] = js.Array(Integral, Fractional, String)
}

@js.native
sealed trait FileSystemAccessMode extends js.Any
object FileSystemAccessMode {
  val rw = "rw".asInstanceOf[FileSystemAccessMode]
  val ro = "ro".asInstanceOf[FileSystemAccessMode]

  @inline def values: js.Array[FileSystemAccessMode] = js.Array(rw, ro)
}

@js.native
sealed trait FileSystemType extends js.Any
object FileSystemType {
  val EFS = "EFS".asInstanceOf[FileSystemType]
  val FSxLustre = "FSxLustre".asInstanceOf[FileSystemType]

  @inline def values: js.Array[FileSystemType] = js.Array(EFS, FSxLustre)
}

@js.native
sealed trait FlowDefinitionStatus extends js.Any
object FlowDefinitionStatus {
  val Initializing = "Initializing".asInstanceOf[FlowDefinitionStatus]
  val Active = "Active".asInstanceOf[FlowDefinitionStatus]
  val Failed = "Failed".asInstanceOf[FlowDefinitionStatus]
  val Deleting = "Deleting".asInstanceOf[FlowDefinitionStatus]

  @inline def values: js.Array[FlowDefinitionStatus] = js.Array(Initializing, Active, Failed, Deleting)
}

@js.native
sealed trait Framework extends js.Any
object Framework {
  val TENSORFLOW = "TENSORFLOW".asInstanceOf[Framework]
  val KERAS = "KERAS".asInstanceOf[Framework]
  val MXNET = "MXNET".asInstanceOf[Framework]
  val ONNX = "ONNX".asInstanceOf[Framework]
  val PYTORCH = "PYTORCH".asInstanceOf[Framework]
  val XGBOOST = "XGBOOST".asInstanceOf[Framework]
  val TFLITE = "TFLITE".asInstanceOf[Framework]
  val DARKNET = "DARKNET".asInstanceOf[Framework]
  val SKLEARN = "SKLEARN".asInstanceOf[Framework]

  @inline def values: js.Array[Framework] = js.Array(TENSORFLOW, KERAS, MXNET, ONNX, PYTORCH, XGBOOST, TFLITE, DARKNET, SKLEARN)
}

@js.native
sealed trait HubContentSortBy extends js.Any
object HubContentSortBy {
  val HubContentName = "HubContentName".asInstanceOf[HubContentSortBy]
  val CreationTime = "CreationTime".asInstanceOf[HubContentSortBy]
  val HubContentStatus = "HubContentStatus".asInstanceOf[HubContentSortBy]

  @inline def values: js.Array[HubContentSortBy] = js.Array(HubContentName, CreationTime, HubContentStatus)
}

@js.native
sealed trait HubContentStatus extends js.Any
object HubContentStatus {
  val Available = "Available".asInstanceOf[HubContentStatus]
  val Importing = "Importing".asInstanceOf[HubContentStatus]
  val Deleting = "Deleting".asInstanceOf[HubContentStatus]
  val ImportFailed = "ImportFailed".asInstanceOf[HubContentStatus]
  val DeleteFailed = "DeleteFailed".asInstanceOf[HubContentStatus]

  @inline def values: js.Array[HubContentStatus] = js.Array(Available, Importing, Deleting, ImportFailed, DeleteFailed)
}

@js.native
sealed trait HubContentType extends js.Any
object HubContentType {
  val Model = "Model".asInstanceOf[HubContentType]
  val Notebook = "Notebook".asInstanceOf[HubContentType]

  @inline def values: js.Array[HubContentType] = js.Array(Model, Notebook)
}

@js.native
sealed trait HubSortBy extends js.Any
object HubSortBy {
  val HubName = "HubName".asInstanceOf[HubSortBy]
  val CreationTime = "CreationTime".asInstanceOf[HubSortBy]
  val HubStatus = "HubStatus".asInstanceOf[HubSortBy]
  val AccountIdOwner = "AccountIdOwner".asInstanceOf[HubSortBy]

  @inline def values: js.Array[HubSortBy] = js.Array(HubName, CreationTime, HubStatus, AccountIdOwner)
}

@js.native
sealed trait HubStatus extends js.Any
object HubStatus {
  val InService = "InService".asInstanceOf[HubStatus]
  val Creating = "Creating".asInstanceOf[HubStatus]
  val Updating = "Updating".asInstanceOf[HubStatus]
  val Deleting = "Deleting".asInstanceOf[HubStatus]
  val CreateFailed = "CreateFailed".asInstanceOf[HubStatus]
  val UpdateFailed = "UpdateFailed".asInstanceOf[HubStatus]
  val DeleteFailed = "DeleteFailed".asInstanceOf[HubStatus]

  @inline def values: js.Array[HubStatus] = js.Array(InService, Creating, Updating, Deleting, CreateFailed, UpdateFailed, DeleteFailed)
}

@js.native
sealed trait HumanTaskUiStatus extends js.Any
object HumanTaskUiStatus {
  val Active = "Active".asInstanceOf[HumanTaskUiStatus]
  val Deleting = "Deleting".asInstanceOf[HumanTaskUiStatus]

  @inline def values: js.Array[HumanTaskUiStatus] = js.Array(Active, Deleting)
}

@js.native
sealed trait HyperParameterScalingType extends js.Any
object HyperParameterScalingType {
  val Auto = "Auto".asInstanceOf[HyperParameterScalingType]
  val Linear = "Linear".asInstanceOf[HyperParameterScalingType]
  val Logarithmic = "Logarithmic".asInstanceOf[HyperParameterScalingType]
  val ReverseLogarithmic = "ReverseLogarithmic".asInstanceOf[HyperParameterScalingType]

  @inline def values: js.Array[HyperParameterScalingType] = js.Array(Auto, Linear, Logarithmic, ReverseLogarithmic)
}

@js.native
sealed trait HyperParameterTuningAllocationStrategy extends js.Any
object HyperParameterTuningAllocationStrategy {
  val Prioritized = "Prioritized".asInstanceOf[HyperParameterTuningAllocationStrategy]

  @inline def values: js.Array[HyperParameterTuningAllocationStrategy] = js.Array(Prioritized)
}

@js.native
sealed trait HyperParameterTuningJobObjectiveType extends js.Any
object HyperParameterTuningJobObjectiveType {
  val Maximize = "Maximize".asInstanceOf[HyperParameterTuningJobObjectiveType]
  val Minimize = "Minimize".asInstanceOf[HyperParameterTuningJobObjectiveType]

  @inline def values: js.Array[HyperParameterTuningJobObjectiveType] = js.Array(Maximize, Minimize)
}

@js.native
sealed trait HyperParameterTuningJobSortByOptions extends js.Any
object HyperParameterTuningJobSortByOptions {
  val Name = "Name".asInstanceOf[HyperParameterTuningJobSortByOptions]
  val Status = "Status".asInstanceOf[HyperParameterTuningJobSortByOptions]
  val CreationTime = "CreationTime".asInstanceOf[HyperParameterTuningJobSortByOptions]

  @inline def values: js.Array[HyperParameterTuningJobSortByOptions] = js.Array(Name, Status, CreationTime)
}

@js.native
sealed trait HyperParameterTuningJobStatus extends js.Any
object HyperParameterTuningJobStatus {
  val Completed = "Completed".asInstanceOf[HyperParameterTuningJobStatus]
  val InProgress = "InProgress".asInstanceOf[HyperParameterTuningJobStatus]
  val Failed = "Failed".asInstanceOf[HyperParameterTuningJobStatus]
  val Stopped = "Stopped".asInstanceOf[HyperParameterTuningJobStatus]
  val Stopping = "Stopping".asInstanceOf[HyperParameterTuningJobStatus]

  @inline def values: js.Array[HyperParameterTuningJobStatus] = js.Array(Completed, InProgress, Failed, Stopped, Stopping)
}

/** The strategy hyperparameter tuning uses to find the best combination of hyperparameters for your model. Currently, the only supported value is <code>Bayesian</code>.
  */
@js.native
sealed trait HyperParameterTuningJobStrategyType extends js.Any
object HyperParameterTuningJobStrategyType {
  val Bayesian = "Bayesian".asInstanceOf[HyperParameterTuningJobStrategyType]
  val Random = "Random".asInstanceOf[HyperParameterTuningJobStrategyType]
  val Hyperband = "Hyperband".asInstanceOf[HyperParameterTuningJobStrategyType]
  val Grid = "Grid".asInstanceOf[HyperParameterTuningJobStrategyType]

  @inline def values: js.Array[HyperParameterTuningJobStrategyType] = js.Array(Bayesian, Random, Hyperband, Grid)
}

@js.native
sealed trait HyperParameterTuningJobWarmStartType extends js.Any
object HyperParameterTuningJobWarmStartType {
  val IdenticalDataAndAlgorithm = "IdenticalDataAndAlgorithm".asInstanceOf[HyperParameterTuningJobWarmStartType]
  val TransferLearning = "TransferLearning".asInstanceOf[HyperParameterTuningJobWarmStartType]

  @inline def values: js.Array[HyperParameterTuningJobWarmStartType] = js.Array(IdenticalDataAndAlgorithm, TransferLearning)
}

@js.native
sealed trait ImageSortBy extends js.Any
object ImageSortBy {
  val CREATION_TIME = "CREATION_TIME".asInstanceOf[ImageSortBy]
  val LAST_MODIFIED_TIME = "LAST_MODIFIED_TIME".asInstanceOf[ImageSortBy]
  val IMAGE_NAME = "IMAGE_NAME".asInstanceOf[ImageSortBy]

  @inline def values: js.Array[ImageSortBy] = js.Array(CREATION_TIME, LAST_MODIFIED_TIME, IMAGE_NAME)
}

@js.native
sealed trait ImageSortOrder extends js.Any
object ImageSortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[ImageSortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[ImageSortOrder]

  @inline def values: js.Array[ImageSortOrder] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait ImageStatus extends js.Any
object ImageStatus {
  val CREATING = "CREATING".asInstanceOf[ImageStatus]
  val CREATED = "CREATED".asInstanceOf[ImageStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ImageStatus]
  val UPDATING = "UPDATING".asInstanceOf[ImageStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ImageStatus]
  val DELETING = "DELETING".asInstanceOf[ImageStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ImageStatus]

  @inline def values: js.Array[ImageStatus] = js.Array(CREATING, CREATED, CREATE_FAILED, UPDATING, UPDATE_FAILED, DELETING, DELETE_FAILED)
}

@js.native
sealed trait ImageVersionSortBy extends js.Any
object ImageVersionSortBy {
  val CREATION_TIME = "CREATION_TIME".asInstanceOf[ImageVersionSortBy]
  val LAST_MODIFIED_TIME = "LAST_MODIFIED_TIME".asInstanceOf[ImageVersionSortBy]
  val VERSION = "VERSION".asInstanceOf[ImageVersionSortBy]

  @inline def values: js.Array[ImageVersionSortBy] = js.Array(CREATION_TIME, LAST_MODIFIED_TIME, VERSION)
}

@js.native
sealed trait ImageVersionSortOrder extends js.Any
object ImageVersionSortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[ImageVersionSortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[ImageVersionSortOrder]

  @inline def values: js.Array[ImageVersionSortOrder] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait ImageVersionStatus extends js.Any
object ImageVersionStatus {
  val CREATING = "CREATING".asInstanceOf[ImageVersionStatus]
  val CREATED = "CREATED".asInstanceOf[ImageVersionStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[ImageVersionStatus]
  val DELETING = "DELETING".asInstanceOf[ImageVersionStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[ImageVersionStatus]

  @inline def values: js.Array[ImageVersionStatus] = js.Array(CREATING, CREATED, CREATE_FAILED, DELETING, DELETE_FAILED)
}

@js.native
sealed trait InferenceExecutionMode extends js.Any
object InferenceExecutionMode {
  val Serial = "Serial".asInstanceOf[InferenceExecutionMode]
  val Direct = "Direct".asInstanceOf[InferenceExecutionMode]

  @inline def values: js.Array[InferenceExecutionMode] = js.Array(Serial, Direct)
}

@js.native
sealed trait InferenceExperimentStatus extends js.Any
object InferenceExperimentStatus {
  val Creating = "Creating".asInstanceOf[InferenceExperimentStatus]
  val Created = "Created".asInstanceOf[InferenceExperimentStatus]
  val Updating = "Updating".asInstanceOf[InferenceExperimentStatus]
  val Running = "Running".asInstanceOf[InferenceExperimentStatus]
  val Starting = "Starting".asInstanceOf[InferenceExperimentStatus]
  val Stopping = "Stopping".asInstanceOf[InferenceExperimentStatus]
  val Completed = "Completed".asInstanceOf[InferenceExperimentStatus]
  val Cancelled = "Cancelled".asInstanceOf[InferenceExperimentStatus]

  @inline def values: js.Array[InferenceExperimentStatus] = js.Array(Creating, Created, Updating, Running, Starting, Stopping, Completed, Cancelled)
}

@js.native
sealed trait InferenceExperimentStopDesiredState extends js.Any
object InferenceExperimentStopDesiredState {
  val Completed = "Completed".asInstanceOf[InferenceExperimentStopDesiredState]
  val Cancelled = "Cancelled".asInstanceOf[InferenceExperimentStopDesiredState]

  @inline def values: js.Array[InferenceExperimentStopDesiredState] = js.Array(Completed, Cancelled)
}

@js.native
sealed trait InferenceExperimentType extends js.Any
object InferenceExperimentType {
  val ShadowMode = "ShadowMode".asInstanceOf[InferenceExperimentType]

  @inline def values: js.Array[InferenceExperimentType] = js.Array(ShadowMode)
}

@js.native
sealed trait InputMode extends js.Any
object InputMode {
  val Pipe = "Pipe".asInstanceOf[InputMode]
  val File = "File".asInstanceOf[InputMode]

  @inline def values: js.Array[InputMode] = js.Array(Pipe, File)
}

@js.native
sealed trait InstanceType extends js.Any
object InstanceType {
  val `ml.t2.medium` = "ml.t2.medium".asInstanceOf[InstanceType]
  val `ml.t2.large` = "ml.t2.large".asInstanceOf[InstanceType]
  val `ml.t2.xlarge` = "ml.t2.xlarge".asInstanceOf[InstanceType]
  val `ml.t2.2xlarge` = "ml.t2.2xlarge".asInstanceOf[InstanceType]
  val `ml.t3.medium` = "ml.t3.medium".asInstanceOf[InstanceType]
  val `ml.t3.large` = "ml.t3.large".asInstanceOf[InstanceType]
  val `ml.t3.xlarge` = "ml.t3.xlarge".asInstanceOf[InstanceType]
  val `ml.t3.2xlarge` = "ml.t3.2xlarge".asInstanceOf[InstanceType]
  val `ml.m4.xlarge` = "ml.m4.xlarge".asInstanceOf[InstanceType]
  val `ml.m4.2xlarge` = "ml.m4.2xlarge".asInstanceOf[InstanceType]
  val `ml.m4.4xlarge` = "ml.m4.4xlarge".asInstanceOf[InstanceType]
  val `ml.m4.10xlarge` = "ml.m4.10xlarge".asInstanceOf[InstanceType]
  val `ml.m4.16xlarge` = "ml.m4.16xlarge".asInstanceOf[InstanceType]
  val `ml.m5.xlarge` = "ml.m5.xlarge".asInstanceOf[InstanceType]
  val `ml.m5.2xlarge` = "ml.m5.2xlarge".asInstanceOf[InstanceType]
  val `ml.m5.4xlarge` = "ml.m5.4xlarge".asInstanceOf[InstanceType]
  val `ml.m5.12xlarge` = "ml.m5.12xlarge".asInstanceOf[InstanceType]
  val `ml.m5.24xlarge` = "ml.m5.24xlarge".asInstanceOf[InstanceType]
  val `ml.m5d.large` = "ml.m5d.large".asInstanceOf[InstanceType]
  val `ml.m5d.xlarge` = "ml.m5d.xlarge".asInstanceOf[InstanceType]
  val `ml.m5d.2xlarge` = "ml.m5d.2xlarge".asInstanceOf[InstanceType]
  val `ml.m5d.4xlarge` = "ml.m5d.4xlarge".asInstanceOf[InstanceType]
  val `ml.m5d.8xlarge` = "ml.m5d.8xlarge".asInstanceOf[InstanceType]
  val `ml.m5d.12xlarge` = "ml.m5d.12xlarge".asInstanceOf[InstanceType]
  val `ml.m5d.16xlarge` = "ml.m5d.16xlarge".asInstanceOf[InstanceType]
  val `ml.m5d.24xlarge` = "ml.m5d.24xlarge".asInstanceOf[InstanceType]
  val `ml.c4.xlarge` = "ml.c4.xlarge".asInstanceOf[InstanceType]
  val `ml.c4.2xlarge` = "ml.c4.2xlarge".asInstanceOf[InstanceType]
  val `ml.c4.4xlarge` = "ml.c4.4xlarge".asInstanceOf[InstanceType]
  val `ml.c4.8xlarge` = "ml.c4.8xlarge".asInstanceOf[InstanceType]
  val `ml.c5.xlarge` = "ml.c5.xlarge".asInstanceOf[InstanceType]
  val `ml.c5.2xlarge` = "ml.c5.2xlarge".asInstanceOf[InstanceType]
  val `ml.c5.4xlarge` = "ml.c5.4xlarge".asInstanceOf[InstanceType]
  val `ml.c5.9xlarge` = "ml.c5.9xlarge".asInstanceOf[InstanceType]
  val `ml.c5.18xlarge` = "ml.c5.18xlarge".asInstanceOf[InstanceType]
  val `ml.c5d.xlarge` = "ml.c5d.xlarge".asInstanceOf[InstanceType]
  val `ml.c5d.2xlarge` = "ml.c5d.2xlarge".asInstanceOf[InstanceType]
  val `ml.c5d.4xlarge` = "ml.c5d.4xlarge".asInstanceOf[InstanceType]
  val `ml.c5d.9xlarge` = "ml.c5d.9xlarge".asInstanceOf[InstanceType]
  val `ml.c5d.18xlarge` = "ml.c5d.18xlarge".asInstanceOf[InstanceType]
  val `ml.p2.xlarge` = "ml.p2.xlarge".asInstanceOf[InstanceType]
  val `ml.p2.8xlarge` = "ml.p2.8xlarge".asInstanceOf[InstanceType]
  val `ml.p2.16xlarge` = "ml.p2.16xlarge".asInstanceOf[InstanceType]
  val `ml.p3.2xlarge` = "ml.p3.2xlarge".asInstanceOf[InstanceType]
  val `ml.p3.8xlarge` = "ml.p3.8xlarge".asInstanceOf[InstanceType]
  val `ml.p3.16xlarge` = "ml.p3.16xlarge".asInstanceOf[InstanceType]
  val `ml.p3dn.24xlarge` = "ml.p3dn.24xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.xlarge` = "ml.g4dn.xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.2xlarge` = "ml.g4dn.2xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.4xlarge` = "ml.g4dn.4xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.8xlarge` = "ml.g4dn.8xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[InstanceType]
  val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[InstanceType]
  val `ml.r5.large` = "ml.r5.large".asInstanceOf[InstanceType]
  val `ml.r5.xlarge` = "ml.r5.xlarge".asInstanceOf[InstanceType]
  val `ml.r5.2xlarge` = "ml.r5.2xlarge".asInstanceOf[InstanceType]
  val `ml.r5.4xlarge` = "ml.r5.4xlarge".asInstanceOf[InstanceType]
  val `ml.r5.8xlarge` = "ml.r5.8xlarge".asInstanceOf[InstanceType]
  val `ml.r5.12xlarge` = "ml.r5.12xlarge".asInstanceOf[InstanceType]
  val `ml.r5.16xlarge` = "ml.r5.16xlarge".asInstanceOf[InstanceType]
  val `ml.r5.24xlarge` = "ml.r5.24xlarge".asInstanceOf[InstanceType]
  val `ml.g5.xlarge` = "ml.g5.xlarge".asInstanceOf[InstanceType]
  val `ml.g5.2xlarge` = "ml.g5.2xlarge".asInstanceOf[InstanceType]
  val `ml.g5.4xlarge` = "ml.g5.4xlarge".asInstanceOf[InstanceType]
  val `ml.g5.8xlarge` = "ml.g5.8xlarge".asInstanceOf[InstanceType]
  val `ml.g5.16xlarge` = "ml.g5.16xlarge".asInstanceOf[InstanceType]
  val `ml.g5.12xlarge` = "ml.g5.12xlarge".asInstanceOf[InstanceType]
  val `ml.g5.24xlarge` = "ml.g5.24xlarge".asInstanceOf[InstanceType]
  val `ml.g5.48xlarge` = "ml.g5.48xlarge".asInstanceOf[InstanceType]

  @inline def values: js.Array[InstanceType] = js.Array(
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
    `ml.r5.24xlarge`,
    `ml.g5.xlarge`,
    `ml.g5.2xlarge`,
    `ml.g5.4xlarge`,
    `ml.g5.8xlarge`,
    `ml.g5.16xlarge`,
    `ml.g5.12xlarge`,
    `ml.g5.24xlarge`,
    `ml.g5.48xlarge`
  )
}

@js.native
sealed trait JoinSource extends js.Any
object JoinSource {
  val Input = "Input".asInstanceOf[JoinSource]
  val None = "None".asInstanceOf[JoinSource]

  @inline def values: js.Array[JoinSource] = js.Array(Input, None)
}

@js.native
sealed trait LabelingJobStatus extends js.Any
object LabelingJobStatus {
  val Initializing = "Initializing".asInstanceOf[LabelingJobStatus]
  val InProgress = "InProgress".asInstanceOf[LabelingJobStatus]
  val Completed = "Completed".asInstanceOf[LabelingJobStatus]
  val Failed = "Failed".asInstanceOf[LabelingJobStatus]
  val Stopping = "Stopping".asInstanceOf[LabelingJobStatus]
  val Stopped = "Stopped".asInstanceOf[LabelingJobStatus]

  @inline def values: js.Array[LabelingJobStatus] = js.Array(Initializing, InProgress, Completed, Failed, Stopping, Stopped)
}

@js.native
sealed trait LastUpdateStatusValue extends js.Any
object LastUpdateStatusValue {
  val Successful = "Successful".asInstanceOf[LastUpdateStatusValue]
  val Failed = "Failed".asInstanceOf[LastUpdateStatusValue]
  val InProgress = "InProgress".asInstanceOf[LastUpdateStatusValue]

  @inline def values: js.Array[LastUpdateStatusValue] = js.Array(Successful, Failed, InProgress)
}

@js.native
sealed trait LineageType extends js.Any
object LineageType {
  val TrialComponent = "TrialComponent".asInstanceOf[LineageType]
  val Artifact = "Artifact".asInstanceOf[LineageType]
  val Context = "Context".asInstanceOf[LineageType]
  val Action = "Action".asInstanceOf[LineageType]

  @inline def values: js.Array[LineageType] = js.Array(TrialComponent, Artifact, Context, Action)
}

@js.native
sealed trait ListCompilationJobsSortBy extends js.Any
object ListCompilationJobsSortBy {
  val Name = "Name".asInstanceOf[ListCompilationJobsSortBy]
  val CreationTime = "CreationTime".asInstanceOf[ListCompilationJobsSortBy]
  val Status = "Status".asInstanceOf[ListCompilationJobsSortBy]

  @inline def values: js.Array[ListCompilationJobsSortBy] = js.Array(Name, CreationTime, Status)
}

@js.native
sealed trait ListDeviceFleetsSortBy extends js.Any
object ListDeviceFleetsSortBy {
  val NAME = "NAME".asInstanceOf[ListDeviceFleetsSortBy]
  val CREATION_TIME = "CREATION_TIME".asInstanceOf[ListDeviceFleetsSortBy]
  val LAST_MODIFIED_TIME = "LAST_MODIFIED_TIME".asInstanceOf[ListDeviceFleetsSortBy]

  @inline def values: js.Array[ListDeviceFleetsSortBy] = js.Array(NAME, CREATION_TIME, LAST_MODIFIED_TIME)
}

@js.native
sealed trait ListEdgeDeploymentPlansSortBy extends js.Any
object ListEdgeDeploymentPlansSortBy {
  val NAME = "NAME".asInstanceOf[ListEdgeDeploymentPlansSortBy]
  val DEVICE_FLEET_NAME = "DEVICE_FLEET_NAME".asInstanceOf[ListEdgeDeploymentPlansSortBy]
  val CREATION_TIME = "CREATION_TIME".asInstanceOf[ListEdgeDeploymentPlansSortBy]
  val LAST_MODIFIED_TIME = "LAST_MODIFIED_TIME".asInstanceOf[ListEdgeDeploymentPlansSortBy]

  @inline def values: js.Array[ListEdgeDeploymentPlansSortBy] = js.Array(NAME, DEVICE_FLEET_NAME, CREATION_TIME, LAST_MODIFIED_TIME)
}

@js.native
sealed trait ListEdgePackagingJobsSortBy extends js.Any
object ListEdgePackagingJobsSortBy {
  val NAME = "NAME".asInstanceOf[ListEdgePackagingJobsSortBy]
  val MODEL_NAME = "MODEL_NAME".asInstanceOf[ListEdgePackagingJobsSortBy]
  val CREATION_TIME = "CREATION_TIME".asInstanceOf[ListEdgePackagingJobsSortBy]
  val LAST_MODIFIED_TIME = "LAST_MODIFIED_TIME".asInstanceOf[ListEdgePackagingJobsSortBy]
  val STATUS = "STATUS".asInstanceOf[ListEdgePackagingJobsSortBy]

  @inline def values: js.Array[ListEdgePackagingJobsSortBy] = js.Array(NAME, MODEL_NAME, CREATION_TIME, LAST_MODIFIED_TIME, STATUS)
}

@js.native
sealed trait ListInferenceRecommendationsJobsSortBy extends js.Any
object ListInferenceRecommendationsJobsSortBy {
  val Name = "Name".asInstanceOf[ListInferenceRecommendationsJobsSortBy]
  val CreationTime = "CreationTime".asInstanceOf[ListInferenceRecommendationsJobsSortBy]
  val Status = "Status".asInstanceOf[ListInferenceRecommendationsJobsSortBy]

  @inline def values: js.Array[ListInferenceRecommendationsJobsSortBy] = js.Array(Name, CreationTime, Status)
}

@js.native
sealed trait ListLabelingJobsForWorkteamSortByOptions extends js.Any
object ListLabelingJobsForWorkteamSortByOptions {
  val CreationTime = "CreationTime".asInstanceOf[ListLabelingJobsForWorkteamSortByOptions]

  @inline def values: js.Array[ListLabelingJobsForWorkteamSortByOptions] = js.Array(CreationTime)
}

@js.native
sealed trait ListWorkforcesSortByOptions extends js.Any
object ListWorkforcesSortByOptions {
  val Name = "Name".asInstanceOf[ListWorkforcesSortByOptions]
  val CreateDate = "CreateDate".asInstanceOf[ListWorkforcesSortByOptions]

  @inline def values: js.Array[ListWorkforcesSortByOptions] = js.Array(Name, CreateDate)
}

@js.native
sealed trait ListWorkteamsSortByOptions extends js.Any
object ListWorkteamsSortByOptions {
  val Name = "Name".asInstanceOf[ListWorkteamsSortByOptions]
  val CreateDate = "CreateDate".asInstanceOf[ListWorkteamsSortByOptions]

  @inline def values: js.Array[ListWorkteamsSortByOptions] = js.Array(Name, CreateDate)
}

@js.native
sealed trait MetricSetSource extends js.Any
object MetricSetSource {
  val Train = "Train".asInstanceOf[MetricSetSource]
  val Validation = "Validation".asInstanceOf[MetricSetSource]
  val Test = "Test".asInstanceOf[MetricSetSource]

  @inline def values: js.Array[MetricSetSource] = js.Array(Train, Validation, Test)
}

@js.native
sealed trait ModelApprovalStatus extends js.Any
object ModelApprovalStatus {
  val Approved = "Approved".asInstanceOf[ModelApprovalStatus]
  val Rejected = "Rejected".asInstanceOf[ModelApprovalStatus]
  val PendingManualApproval = "PendingManualApproval".asInstanceOf[ModelApprovalStatus]

  @inline def values: js.Array[ModelApprovalStatus] = js.Array(Approved, Rejected, PendingManualApproval)
}

@js.native
sealed trait ModelCacheSetting extends js.Any
object ModelCacheSetting {
  val Enabled = "Enabled".asInstanceOf[ModelCacheSetting]
  val Disabled = "Disabled".asInstanceOf[ModelCacheSetting]

  @inline def values: js.Array[ModelCacheSetting] = js.Array(Enabled, Disabled)
}

/** Attribute by which to sort returned export jobs.
  */
@js.native
sealed trait ModelCardExportJobSortBy extends js.Any
object ModelCardExportJobSortBy {
  val Name = "Name".asInstanceOf[ModelCardExportJobSortBy]
  val CreationTime = "CreationTime".asInstanceOf[ModelCardExportJobSortBy]
  val Status = "Status".asInstanceOf[ModelCardExportJobSortBy]

  @inline def values: js.Array[ModelCardExportJobSortBy] = js.Array(Name, CreationTime, Status)
}

@js.native
sealed trait ModelCardExportJobSortOrder extends js.Any
object ModelCardExportJobSortOrder {
  val Ascending = "Ascending".asInstanceOf[ModelCardExportJobSortOrder]
  val Descending = "Descending".asInstanceOf[ModelCardExportJobSortOrder]

  @inline def values: js.Array[ModelCardExportJobSortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait ModelCardExportJobStatus extends js.Any
object ModelCardExportJobStatus {
  val InProgress = "InProgress".asInstanceOf[ModelCardExportJobStatus]
  val Completed = "Completed".asInstanceOf[ModelCardExportJobStatus]
  val Failed = "Failed".asInstanceOf[ModelCardExportJobStatus]

  @inline def values: js.Array[ModelCardExportJobStatus] = js.Array(InProgress, Completed, Failed)
}

@js.native
sealed trait ModelCardProcessingStatus extends js.Any
object ModelCardProcessingStatus {
  val DeleteInProgress = "DeleteInProgress".asInstanceOf[ModelCardProcessingStatus]
  val DeletePending = "DeletePending".asInstanceOf[ModelCardProcessingStatus]
  val ContentDeleted = "ContentDeleted".asInstanceOf[ModelCardProcessingStatus]
  val ExportJobsDeleted = "ExportJobsDeleted".asInstanceOf[ModelCardProcessingStatus]
  val DeleteCompleted = "DeleteCompleted".asInstanceOf[ModelCardProcessingStatus]
  val DeleteFailed = "DeleteFailed".asInstanceOf[ModelCardProcessingStatus]

  @inline def values: js.Array[ModelCardProcessingStatus] = js.Array(DeleteInProgress, DeletePending, ContentDeleted, ExportJobsDeleted, DeleteCompleted, DeleteFailed)
}

@js.native
sealed trait ModelCardSortBy extends js.Any
object ModelCardSortBy {
  val Name = "Name".asInstanceOf[ModelCardSortBy]
  val CreationTime = "CreationTime".asInstanceOf[ModelCardSortBy]

  @inline def values: js.Array[ModelCardSortBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait ModelCardSortOrder extends js.Any
object ModelCardSortOrder {
  val Ascending = "Ascending".asInstanceOf[ModelCardSortOrder]
  val Descending = "Descending".asInstanceOf[ModelCardSortOrder]

  @inline def values: js.Array[ModelCardSortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait ModelCardStatus extends js.Any
object ModelCardStatus {
  val Draft = "Draft".asInstanceOf[ModelCardStatus]
  val PendingReview = "PendingReview".asInstanceOf[ModelCardStatus]
  val Approved = "Approved".asInstanceOf[ModelCardStatus]
  val Archived = "Archived".asInstanceOf[ModelCardStatus]

  @inline def values: js.Array[ModelCardStatus] = js.Array(Draft, PendingReview, Approved, Archived)
}

@js.native
sealed trait ModelCardVersionSortBy extends js.Any
object ModelCardVersionSortBy {
  val Version = "Version".asInstanceOf[ModelCardVersionSortBy]

  @inline def values: js.Array[ModelCardVersionSortBy] = js.Array(Version)
}

@js.native
sealed trait ModelInfrastructureType extends js.Any
object ModelInfrastructureType {
  val RealTimeInference = "RealTimeInference".asInstanceOf[ModelInfrastructureType]

  @inline def values: js.Array[ModelInfrastructureType] = js.Array(RealTimeInference)
}

@js.native
sealed trait ModelMetadataFilterType extends js.Any
object ModelMetadataFilterType {
  val Domain = "Domain".asInstanceOf[ModelMetadataFilterType]
  val Framework = "Framework".asInstanceOf[ModelMetadataFilterType]
  val Task = "Task".asInstanceOf[ModelMetadataFilterType]
  val FrameworkVersion = "FrameworkVersion".asInstanceOf[ModelMetadataFilterType]

  @inline def values: js.Array[ModelMetadataFilterType] = js.Array(Domain, Framework, Task, FrameworkVersion)
}

@js.native
sealed trait ModelPackageGroupSortBy extends js.Any
object ModelPackageGroupSortBy {
  val Name = "Name".asInstanceOf[ModelPackageGroupSortBy]
  val CreationTime = "CreationTime".asInstanceOf[ModelPackageGroupSortBy]

  @inline def values: js.Array[ModelPackageGroupSortBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait ModelPackageGroupStatus extends js.Any
object ModelPackageGroupStatus {
  val Pending = "Pending".asInstanceOf[ModelPackageGroupStatus]
  val InProgress = "InProgress".asInstanceOf[ModelPackageGroupStatus]
  val Completed = "Completed".asInstanceOf[ModelPackageGroupStatus]
  val Failed = "Failed".asInstanceOf[ModelPackageGroupStatus]
  val Deleting = "Deleting".asInstanceOf[ModelPackageGroupStatus]
  val DeleteFailed = "DeleteFailed".asInstanceOf[ModelPackageGroupStatus]

  @inline def values: js.Array[ModelPackageGroupStatus] = js.Array(Pending, InProgress, Completed, Failed, Deleting, DeleteFailed)
}

@js.native
sealed trait ModelPackageSortBy extends js.Any
object ModelPackageSortBy {
  val Name = "Name".asInstanceOf[ModelPackageSortBy]
  val CreationTime = "CreationTime".asInstanceOf[ModelPackageSortBy]

  @inline def values: js.Array[ModelPackageSortBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait ModelPackageStatus extends js.Any
object ModelPackageStatus {
  val Pending = "Pending".asInstanceOf[ModelPackageStatus]
  val InProgress = "InProgress".asInstanceOf[ModelPackageStatus]
  val Completed = "Completed".asInstanceOf[ModelPackageStatus]
  val Failed = "Failed".asInstanceOf[ModelPackageStatus]
  val Deleting = "Deleting".asInstanceOf[ModelPackageStatus]

  @inline def values: js.Array[ModelPackageStatus] = js.Array(Pending, InProgress, Completed, Failed, Deleting)
}

@js.native
sealed trait ModelPackageType extends js.Any
object ModelPackageType {
  val Versioned = "Versioned".asInstanceOf[ModelPackageType]
  val Unversioned = "Unversioned".asInstanceOf[ModelPackageType]
  val Both = "Both".asInstanceOf[ModelPackageType]

  @inline def values: js.Array[ModelPackageType] = js.Array(Versioned, Unversioned, Both)
}

@js.native
sealed trait ModelSortKey extends js.Any
object ModelSortKey {
  val Name = "Name".asInstanceOf[ModelSortKey]
  val CreationTime = "CreationTime".asInstanceOf[ModelSortKey]

  @inline def values: js.Array[ModelSortKey] = js.Array(Name, CreationTime)
}

@js.native
sealed trait ModelVariantAction extends js.Any
object ModelVariantAction {
  val Retain = "Retain".asInstanceOf[ModelVariantAction]
  val Remove = "Remove".asInstanceOf[ModelVariantAction]
  val Promote = "Promote".asInstanceOf[ModelVariantAction]

  @inline def values: js.Array[ModelVariantAction] = js.Array(Retain, Remove, Promote)
}

@js.native
sealed trait ModelVariantStatus extends js.Any
object ModelVariantStatus {
  val Creating = "Creating".asInstanceOf[ModelVariantStatus]
  val Updating = "Updating".asInstanceOf[ModelVariantStatus]
  val InService = "InService".asInstanceOf[ModelVariantStatus]
  val Deleting = "Deleting".asInstanceOf[ModelVariantStatus]
  val Deleted = "Deleted".asInstanceOf[ModelVariantStatus]

  @inline def values: js.Array[ModelVariantStatus] = js.Array(Creating, Updating, InService, Deleting, Deleted)
}

@js.native
sealed trait MonitoringAlertHistorySortKey extends js.Any
object MonitoringAlertHistorySortKey {
  val CreationTime = "CreationTime".asInstanceOf[MonitoringAlertHistorySortKey]
  val Status = "Status".asInstanceOf[MonitoringAlertHistorySortKey]

  @inline def values: js.Array[MonitoringAlertHistorySortKey] = js.Array(CreationTime, Status)
}

@js.native
sealed trait MonitoringAlertStatus extends js.Any
object MonitoringAlertStatus {
  val InAlert = "InAlert".asInstanceOf[MonitoringAlertStatus]
  val OK = "OK".asInstanceOf[MonitoringAlertStatus]

  @inline def values: js.Array[MonitoringAlertStatus] = js.Array(InAlert, OK)
}

@js.native
sealed trait MonitoringExecutionSortKey extends js.Any
object MonitoringExecutionSortKey {
  val CreationTime = "CreationTime".asInstanceOf[MonitoringExecutionSortKey]
  val ScheduledTime = "ScheduledTime".asInstanceOf[MonitoringExecutionSortKey]
  val Status = "Status".asInstanceOf[MonitoringExecutionSortKey]

  @inline def values: js.Array[MonitoringExecutionSortKey] = js.Array(CreationTime, ScheduledTime, Status)
}

@js.native
sealed trait MonitoringJobDefinitionSortKey extends js.Any
object MonitoringJobDefinitionSortKey {
  val Name = "Name".asInstanceOf[MonitoringJobDefinitionSortKey]
  val CreationTime = "CreationTime".asInstanceOf[MonitoringJobDefinitionSortKey]

  @inline def values: js.Array[MonitoringJobDefinitionSortKey] = js.Array(Name, CreationTime)
}

@js.native
sealed trait MonitoringProblemType extends js.Any
object MonitoringProblemType {
  val BinaryClassification = "BinaryClassification".asInstanceOf[MonitoringProblemType]
  val MulticlassClassification = "MulticlassClassification".asInstanceOf[MonitoringProblemType]
  val Regression = "Regression".asInstanceOf[MonitoringProblemType]

  @inline def values: js.Array[MonitoringProblemType] = js.Array(BinaryClassification, MulticlassClassification, Regression)
}

@js.native
sealed trait MonitoringScheduleSortKey extends js.Any
object MonitoringScheduleSortKey {
  val Name = "Name".asInstanceOf[MonitoringScheduleSortKey]
  val CreationTime = "CreationTime".asInstanceOf[MonitoringScheduleSortKey]
  val Status = "Status".asInstanceOf[MonitoringScheduleSortKey]

  @inline def values: js.Array[MonitoringScheduleSortKey] = js.Array(Name, CreationTime, Status)
}

@js.native
sealed trait MonitoringType extends js.Any
object MonitoringType {
  val DataQuality = "DataQuality".asInstanceOf[MonitoringType]
  val ModelQuality = "ModelQuality".asInstanceOf[MonitoringType]
  val ModelBias = "ModelBias".asInstanceOf[MonitoringType]
  val ModelExplainability = "ModelExplainability".asInstanceOf[MonitoringType]

  @inline def values: js.Array[MonitoringType] = js.Array(DataQuality, ModelQuality, ModelBias, ModelExplainability)
}

@js.native
sealed trait NotebookInstanceAcceleratorType extends js.Any
object NotebookInstanceAcceleratorType {
  val `ml.eia1.medium` = "ml.eia1.medium".asInstanceOf[NotebookInstanceAcceleratorType]
  val `ml.eia1.large` = "ml.eia1.large".asInstanceOf[NotebookInstanceAcceleratorType]
  val `ml.eia1.xlarge` = "ml.eia1.xlarge".asInstanceOf[NotebookInstanceAcceleratorType]
  val `ml.eia2.medium` = "ml.eia2.medium".asInstanceOf[NotebookInstanceAcceleratorType]
  val `ml.eia2.large` = "ml.eia2.large".asInstanceOf[NotebookInstanceAcceleratorType]
  val `ml.eia2.xlarge` = "ml.eia2.xlarge".asInstanceOf[NotebookInstanceAcceleratorType]

  @inline def values: js.Array[NotebookInstanceAcceleratorType] = js.Array(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`)
}

@js.native
sealed trait NotebookInstanceLifecycleConfigSortKey extends js.Any
object NotebookInstanceLifecycleConfigSortKey {
  val Name = "Name".asInstanceOf[NotebookInstanceLifecycleConfigSortKey]
  val CreationTime = "CreationTime".asInstanceOf[NotebookInstanceLifecycleConfigSortKey]
  val LastModifiedTime = "LastModifiedTime".asInstanceOf[NotebookInstanceLifecycleConfigSortKey]

  @inline def values: js.Array[NotebookInstanceLifecycleConfigSortKey] = js.Array(Name, CreationTime, LastModifiedTime)
}

@js.native
sealed trait NotebookInstanceLifecycleConfigSortOrder extends js.Any
object NotebookInstanceLifecycleConfigSortOrder {
  val Ascending = "Ascending".asInstanceOf[NotebookInstanceLifecycleConfigSortOrder]
  val Descending = "Descending".asInstanceOf[NotebookInstanceLifecycleConfigSortOrder]

  @inline def values: js.Array[NotebookInstanceLifecycleConfigSortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait NotebookInstanceSortKey extends js.Any
object NotebookInstanceSortKey {
  val Name = "Name".asInstanceOf[NotebookInstanceSortKey]
  val CreationTime = "CreationTime".asInstanceOf[NotebookInstanceSortKey]
  val Status = "Status".asInstanceOf[NotebookInstanceSortKey]

  @inline def values: js.Array[NotebookInstanceSortKey] = js.Array(Name, CreationTime, Status)
}

@js.native
sealed trait NotebookInstanceSortOrder extends js.Any
object NotebookInstanceSortOrder {
  val Ascending = "Ascending".asInstanceOf[NotebookInstanceSortOrder]
  val Descending = "Descending".asInstanceOf[NotebookInstanceSortOrder]

  @inline def values: js.Array[NotebookInstanceSortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait NotebookInstanceStatus extends js.Any
object NotebookInstanceStatus {
  val Pending = "Pending".asInstanceOf[NotebookInstanceStatus]
  val InService = "InService".asInstanceOf[NotebookInstanceStatus]
  val Stopping = "Stopping".asInstanceOf[NotebookInstanceStatus]
  val Stopped = "Stopped".asInstanceOf[NotebookInstanceStatus]
  val Failed = "Failed".asInstanceOf[NotebookInstanceStatus]
  val Deleting = "Deleting".asInstanceOf[NotebookInstanceStatus]
  val Updating = "Updating".asInstanceOf[NotebookInstanceStatus]

  @inline def values: js.Array[NotebookInstanceStatus] = js.Array(Pending, InService, Stopping, Stopped, Failed, Deleting, Updating)
}

@js.native
sealed trait NotebookOutputOption extends js.Any
object NotebookOutputOption {
  val Allowed = "Allowed".asInstanceOf[NotebookOutputOption]
  val Disabled = "Disabled".asInstanceOf[NotebookOutputOption]

  @inline def values: js.Array[NotebookOutputOption] = js.Array(Allowed, Disabled)
}

@js.native
sealed trait ObjectiveStatus extends js.Any
object ObjectiveStatus {
  val Succeeded = "Succeeded".asInstanceOf[ObjectiveStatus]
  val Pending = "Pending".asInstanceOf[ObjectiveStatus]
  val Failed = "Failed".asInstanceOf[ObjectiveStatus]

  @inline def values: js.Array[ObjectiveStatus] = js.Array(Succeeded, Pending, Failed)
}

@js.native
sealed trait OfflineStoreStatusValue extends js.Any
object OfflineStoreStatusValue {
  val Active = "Active".asInstanceOf[OfflineStoreStatusValue]
  val Blocked = "Blocked".asInstanceOf[OfflineStoreStatusValue]
  val Disabled = "Disabled".asInstanceOf[OfflineStoreStatusValue]

  @inline def values: js.Array[OfflineStoreStatusValue] = js.Array(Active, Blocked, Disabled)
}

@js.native
sealed trait Operator extends js.Any
object Operator {
  val Equals = "Equals".asInstanceOf[Operator]
  val NotEquals = "NotEquals".asInstanceOf[Operator]
  val GreaterThan = "GreaterThan".asInstanceOf[Operator]
  val GreaterThanOrEqualTo = "GreaterThanOrEqualTo".asInstanceOf[Operator]
  val LessThan = "LessThan".asInstanceOf[Operator]
  val LessThanOrEqualTo = "LessThanOrEqualTo".asInstanceOf[Operator]
  val Contains = "Contains".asInstanceOf[Operator]
  val Exists = "Exists".asInstanceOf[Operator]
  val NotExists = "NotExists".asInstanceOf[Operator]
  val In = "In".asInstanceOf[Operator]

  @inline def values: js.Array[Operator] = js.Array(Equals, NotEquals, GreaterThan, GreaterThanOrEqualTo, LessThan, LessThanOrEqualTo, Contains, Exists, NotExists, In)
}

@js.native
sealed trait OrderKey extends js.Any
object OrderKey {
  val Ascending = "Ascending".asInstanceOf[OrderKey]
  val Descending = "Descending".asInstanceOf[OrderKey]

  @inline def values: js.Array[OrderKey] = js.Array(Ascending, Descending)
}

@js.native
sealed trait ParameterType extends js.Any
object ParameterType {
  val Integer = "Integer".asInstanceOf[ParameterType]
  val Continuous = "Continuous".asInstanceOf[ParameterType]
  val Categorical = "Categorical".asInstanceOf[ParameterType]
  val FreeText = "FreeText".asInstanceOf[ParameterType]

  @inline def values: js.Array[ParameterType] = js.Array(Integer, Continuous, Categorical, FreeText)
}

@js.native
sealed trait PipelineExecutionStatus extends js.Any
object PipelineExecutionStatus {
  val Executing = "Executing".asInstanceOf[PipelineExecutionStatus]
  val Stopping = "Stopping".asInstanceOf[PipelineExecutionStatus]
  val Stopped = "Stopped".asInstanceOf[PipelineExecutionStatus]
  val Failed = "Failed".asInstanceOf[PipelineExecutionStatus]
  val Succeeded = "Succeeded".asInstanceOf[PipelineExecutionStatus]

  @inline def values: js.Array[PipelineExecutionStatus] = js.Array(Executing, Stopping, Stopped, Failed, Succeeded)
}

@js.native
sealed trait PipelineStatus extends js.Any
object PipelineStatus {
  val Active = "Active".asInstanceOf[PipelineStatus]

  @inline def values: js.Array[PipelineStatus] = js.Array(Active)
}

@js.native
sealed trait ProblemType extends js.Any
object ProblemType {
  val BinaryClassification = "BinaryClassification".asInstanceOf[ProblemType]
  val MulticlassClassification = "MulticlassClassification".asInstanceOf[ProblemType]
  val Regression = "Regression".asInstanceOf[ProblemType]

  @inline def values: js.Array[ProblemType] = js.Array(BinaryClassification, MulticlassClassification, Regression)
}

@js.native
sealed trait ProcessingInstanceType extends js.Any
object ProcessingInstanceType {
  val `ml.t3.medium` = "ml.t3.medium".asInstanceOf[ProcessingInstanceType]
  val `ml.t3.large` = "ml.t3.large".asInstanceOf[ProcessingInstanceType]
  val `ml.t3.xlarge` = "ml.t3.xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.t3.2xlarge` = "ml.t3.2xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m4.xlarge` = "ml.m4.xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m4.2xlarge` = "ml.m4.2xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m4.4xlarge` = "ml.m4.4xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m4.10xlarge` = "ml.m4.10xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m4.16xlarge` = "ml.m4.16xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.c4.xlarge` = "ml.c4.xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.c4.2xlarge` = "ml.c4.2xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.c4.4xlarge` = "ml.c4.4xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.c4.8xlarge` = "ml.c4.8xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.p2.xlarge` = "ml.p2.xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.p2.8xlarge` = "ml.p2.8xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.p2.16xlarge` = "ml.p2.16xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.p3.2xlarge` = "ml.p3.2xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.p3.8xlarge` = "ml.p3.8xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.p3.16xlarge` = "ml.p3.16xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.c5.xlarge` = "ml.c5.xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.c5.2xlarge` = "ml.c5.2xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.c5.4xlarge` = "ml.c5.4xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.c5.9xlarge` = "ml.c5.9xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.c5.18xlarge` = "ml.c5.18xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m5.large` = "ml.m5.large".asInstanceOf[ProcessingInstanceType]
  val `ml.m5.xlarge` = "ml.m5.xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m5.2xlarge` = "ml.m5.2xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m5.4xlarge` = "ml.m5.4xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m5.12xlarge` = "ml.m5.12xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.m5.24xlarge` = "ml.m5.24xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.r5.large` = "ml.r5.large".asInstanceOf[ProcessingInstanceType]
  val `ml.r5.xlarge` = "ml.r5.xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.r5.2xlarge` = "ml.r5.2xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.r5.4xlarge` = "ml.r5.4xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.r5.8xlarge` = "ml.r5.8xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.r5.12xlarge` = "ml.r5.12xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.r5.16xlarge` = "ml.r5.16xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.r5.24xlarge` = "ml.r5.24xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.g4dn.xlarge` = "ml.g4dn.xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.g4dn.2xlarge` = "ml.g4dn.2xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.g4dn.4xlarge` = "ml.g4dn.4xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.g4dn.8xlarge` = "ml.g4dn.8xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[ProcessingInstanceType]
  val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[ProcessingInstanceType]

  @inline def values: js.Array[ProcessingInstanceType] = js.Array(
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

@js.native
sealed trait ProcessingJobStatus extends js.Any
object ProcessingJobStatus {
  val InProgress = "InProgress".asInstanceOf[ProcessingJobStatus]
  val Completed = "Completed".asInstanceOf[ProcessingJobStatus]
  val Failed = "Failed".asInstanceOf[ProcessingJobStatus]
  val Stopping = "Stopping".asInstanceOf[ProcessingJobStatus]
  val Stopped = "Stopped".asInstanceOf[ProcessingJobStatus]

  @inline def values: js.Array[ProcessingJobStatus] = js.Array(InProgress, Completed, Failed, Stopping, Stopped)
}

@js.native
sealed trait ProcessingS3CompressionType extends js.Any
object ProcessingS3CompressionType {
  val None = "None".asInstanceOf[ProcessingS3CompressionType]
  val Gzip = "Gzip".asInstanceOf[ProcessingS3CompressionType]

  @inline def values: js.Array[ProcessingS3CompressionType] = js.Array(None, Gzip)
}

@js.native
sealed trait ProcessingS3DataDistributionType extends js.Any
object ProcessingS3DataDistributionType {
  val FullyReplicated = "FullyReplicated".asInstanceOf[ProcessingS3DataDistributionType]
  val ShardedByS3Key = "ShardedByS3Key".asInstanceOf[ProcessingS3DataDistributionType]

  @inline def values: js.Array[ProcessingS3DataDistributionType] = js.Array(FullyReplicated, ShardedByS3Key)
}

@js.native
sealed trait ProcessingS3DataType extends js.Any
object ProcessingS3DataType {
  val ManifestFile = "ManifestFile".asInstanceOf[ProcessingS3DataType]
  val S3Prefix = "S3Prefix".asInstanceOf[ProcessingS3DataType]

  @inline def values: js.Array[ProcessingS3DataType] = js.Array(ManifestFile, S3Prefix)
}

@js.native
sealed trait ProcessingS3InputMode extends js.Any
object ProcessingS3InputMode {
  val Pipe = "Pipe".asInstanceOf[ProcessingS3InputMode]
  val File = "File".asInstanceOf[ProcessingS3InputMode]

  @inline def values: js.Array[ProcessingS3InputMode] = js.Array(Pipe, File)
}

@js.native
sealed trait ProcessingS3UploadMode extends js.Any
object ProcessingS3UploadMode {
  val Continuous = "Continuous".asInstanceOf[ProcessingS3UploadMode]
  val EndOfJob = "EndOfJob".asInstanceOf[ProcessingS3UploadMode]

  @inline def values: js.Array[ProcessingS3UploadMode] = js.Array(Continuous, EndOfJob)
}

@js.native
sealed trait ProductionVariantAcceleratorType extends js.Any
object ProductionVariantAcceleratorType {
  val `ml.eia1.medium` = "ml.eia1.medium".asInstanceOf[ProductionVariantAcceleratorType]
  val `ml.eia1.large` = "ml.eia1.large".asInstanceOf[ProductionVariantAcceleratorType]
  val `ml.eia1.xlarge` = "ml.eia1.xlarge".asInstanceOf[ProductionVariantAcceleratorType]
  val `ml.eia2.medium` = "ml.eia2.medium".asInstanceOf[ProductionVariantAcceleratorType]
  val `ml.eia2.large` = "ml.eia2.large".asInstanceOf[ProductionVariantAcceleratorType]
  val `ml.eia2.xlarge` = "ml.eia2.xlarge".asInstanceOf[ProductionVariantAcceleratorType]

  @inline def values: js.Array[ProductionVariantAcceleratorType] = js.Array(`ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`)
}

@js.native
sealed trait ProductionVariantInstanceType extends js.Any
object ProductionVariantInstanceType {
  val `ml.t2.medium` = "ml.t2.medium".asInstanceOf[ProductionVariantInstanceType]
  val `ml.t2.large` = "ml.t2.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.t2.xlarge` = "ml.t2.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.t2.2xlarge` = "ml.t2.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m4.xlarge` = "ml.m4.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m4.2xlarge` = "ml.m4.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m4.4xlarge` = "ml.m4.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m4.10xlarge` = "ml.m4.10xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m4.16xlarge` = "ml.m4.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5.large` = "ml.m5.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5.xlarge` = "ml.m5.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5.2xlarge` = "ml.m5.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5.4xlarge` = "ml.m5.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5.12xlarge` = "ml.m5.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5.24xlarge` = "ml.m5.24xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5d.large` = "ml.m5d.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5d.xlarge` = "ml.m5d.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5d.2xlarge` = "ml.m5d.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5d.4xlarge` = "ml.m5d.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5d.12xlarge` = "ml.m5d.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m5d.24xlarge` = "ml.m5d.24xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c4.large` = "ml.c4.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c4.xlarge` = "ml.c4.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c4.2xlarge` = "ml.c4.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c4.4xlarge` = "ml.c4.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c4.8xlarge` = "ml.c4.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.p2.xlarge` = "ml.p2.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.p2.8xlarge` = "ml.p2.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.p2.16xlarge` = "ml.p2.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.p3.2xlarge` = "ml.p3.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.p3.8xlarge` = "ml.p3.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.p3.16xlarge` = "ml.p3.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5.large` = "ml.c5.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5.xlarge` = "ml.c5.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5.2xlarge` = "ml.c5.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5.4xlarge` = "ml.c5.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5.9xlarge` = "ml.c5.9xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5.18xlarge` = "ml.c5.18xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5d.large` = "ml.c5d.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5d.xlarge` = "ml.c5d.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5d.2xlarge` = "ml.c5d.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5d.4xlarge` = "ml.c5d.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5d.9xlarge` = "ml.c5d.9xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c5d.18xlarge` = "ml.c5d.18xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g4dn.xlarge` = "ml.g4dn.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g4dn.2xlarge` = "ml.g4dn.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g4dn.4xlarge` = "ml.g4dn.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g4dn.8xlarge` = "ml.g4dn.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5.large` = "ml.r5.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5.xlarge` = "ml.r5.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5.2xlarge` = "ml.r5.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5.4xlarge` = "ml.r5.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5.12xlarge` = "ml.r5.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5.24xlarge` = "ml.r5.24xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5d.large` = "ml.r5d.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5d.xlarge` = "ml.r5d.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5d.2xlarge` = "ml.r5d.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5d.4xlarge` = "ml.r5d.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5d.12xlarge` = "ml.r5d.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r5d.24xlarge` = "ml.r5d.24xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.inf1.xlarge` = "ml.inf1.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.inf1.2xlarge` = "ml.inf1.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.inf1.6xlarge` = "ml.inf1.6xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.inf1.24xlarge` = "ml.inf1.24xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6i.large` = "ml.c6i.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6i.xlarge` = "ml.c6i.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6i.2xlarge` = "ml.c6i.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6i.4xlarge` = "ml.c6i.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6i.8xlarge` = "ml.c6i.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6i.12xlarge` = "ml.c6i.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6i.16xlarge` = "ml.c6i.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6i.24xlarge` = "ml.c6i.24xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6i.32xlarge` = "ml.c6i.32xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g5.xlarge` = "ml.g5.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g5.2xlarge` = "ml.g5.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g5.4xlarge` = "ml.g5.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g5.8xlarge` = "ml.g5.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g5.12xlarge` = "ml.g5.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g5.16xlarge` = "ml.g5.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g5.24xlarge` = "ml.g5.24xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.g5.48xlarge` = "ml.g5.48xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.p4d.24xlarge` = "ml.p4d.24xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c7g.large` = "ml.c7g.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c7g.xlarge` = "ml.c7g.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c7g.2xlarge` = "ml.c7g.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c7g.4xlarge` = "ml.c7g.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c7g.8xlarge` = "ml.c7g.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c7g.12xlarge` = "ml.c7g.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c7g.16xlarge` = "ml.c7g.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6g.large` = "ml.m6g.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6g.xlarge` = "ml.m6g.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6g.2xlarge` = "ml.m6g.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6g.4xlarge` = "ml.m6g.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6g.8xlarge` = "ml.m6g.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6g.12xlarge` = "ml.m6g.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6g.16xlarge` = "ml.m6g.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6gd.large` = "ml.m6gd.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6gd.xlarge` = "ml.m6gd.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6gd.2xlarge` = "ml.m6gd.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6gd.4xlarge` = "ml.m6gd.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6gd.8xlarge` = "ml.m6gd.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6gd.12xlarge` = "ml.m6gd.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.m6gd.16xlarge` = "ml.m6gd.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6g.large` = "ml.c6g.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6g.xlarge` = "ml.c6g.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6g.2xlarge` = "ml.c6g.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6g.4xlarge` = "ml.c6g.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6g.8xlarge` = "ml.c6g.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6g.12xlarge` = "ml.c6g.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6g.16xlarge` = "ml.c6g.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gd.large` = "ml.c6gd.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gd.xlarge` = "ml.c6gd.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gd.2xlarge` = "ml.c6gd.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gd.4xlarge` = "ml.c6gd.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gd.8xlarge` = "ml.c6gd.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gd.12xlarge` = "ml.c6gd.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gd.16xlarge` = "ml.c6gd.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gn.large` = "ml.c6gn.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gn.xlarge` = "ml.c6gn.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gn.2xlarge` = "ml.c6gn.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gn.4xlarge` = "ml.c6gn.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gn.8xlarge` = "ml.c6gn.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gn.12xlarge` = "ml.c6gn.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.c6gn.16xlarge` = "ml.c6gn.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6g.large` = "ml.r6g.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6g.xlarge` = "ml.r6g.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6g.2xlarge` = "ml.r6g.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6g.4xlarge` = "ml.r6g.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6g.8xlarge` = "ml.r6g.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6g.12xlarge` = "ml.r6g.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6g.16xlarge` = "ml.r6g.16xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6gd.large` = "ml.r6gd.large".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6gd.xlarge` = "ml.r6gd.xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6gd.2xlarge` = "ml.r6gd.2xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6gd.4xlarge` = "ml.r6gd.4xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6gd.8xlarge` = "ml.r6gd.8xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6gd.12xlarge` = "ml.r6gd.12xlarge".asInstanceOf[ProductionVariantInstanceType]
  val `ml.r6gd.16xlarge` = "ml.r6gd.16xlarge".asInstanceOf[ProductionVariantInstanceType]

  @inline def values: js.Array[ProductionVariantInstanceType] = js.Array(
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
    `ml.inf1.24xlarge`,
    `ml.c6i.large`,
    `ml.c6i.xlarge`,
    `ml.c6i.2xlarge`,
    `ml.c6i.4xlarge`,
    `ml.c6i.8xlarge`,
    `ml.c6i.12xlarge`,
    `ml.c6i.16xlarge`,
    `ml.c6i.24xlarge`,
    `ml.c6i.32xlarge`,
    `ml.g5.xlarge`,
    `ml.g5.2xlarge`,
    `ml.g5.4xlarge`,
    `ml.g5.8xlarge`,
    `ml.g5.12xlarge`,
    `ml.g5.16xlarge`,
    `ml.g5.24xlarge`,
    `ml.g5.48xlarge`,
    `ml.p4d.24xlarge`,
    `ml.c7g.large`,
    `ml.c7g.xlarge`,
    `ml.c7g.2xlarge`,
    `ml.c7g.4xlarge`,
    `ml.c7g.8xlarge`,
    `ml.c7g.12xlarge`,
    `ml.c7g.16xlarge`,
    `ml.m6g.large`,
    `ml.m6g.xlarge`,
    `ml.m6g.2xlarge`,
    `ml.m6g.4xlarge`,
    `ml.m6g.8xlarge`,
    `ml.m6g.12xlarge`,
    `ml.m6g.16xlarge`,
    `ml.m6gd.large`,
    `ml.m6gd.xlarge`,
    `ml.m6gd.2xlarge`,
    `ml.m6gd.4xlarge`,
    `ml.m6gd.8xlarge`,
    `ml.m6gd.12xlarge`,
    `ml.m6gd.16xlarge`,
    `ml.c6g.large`,
    `ml.c6g.xlarge`,
    `ml.c6g.2xlarge`,
    `ml.c6g.4xlarge`,
    `ml.c6g.8xlarge`,
    `ml.c6g.12xlarge`,
    `ml.c6g.16xlarge`,
    `ml.c6gd.large`,
    `ml.c6gd.xlarge`,
    `ml.c6gd.2xlarge`,
    `ml.c6gd.4xlarge`,
    `ml.c6gd.8xlarge`,
    `ml.c6gd.12xlarge`,
    `ml.c6gd.16xlarge`,
    `ml.c6gn.large`,
    `ml.c6gn.xlarge`,
    `ml.c6gn.2xlarge`,
    `ml.c6gn.4xlarge`,
    `ml.c6gn.8xlarge`,
    `ml.c6gn.12xlarge`,
    `ml.c6gn.16xlarge`,
    `ml.r6g.large`,
    `ml.r6g.xlarge`,
    `ml.r6g.2xlarge`,
    `ml.r6g.4xlarge`,
    `ml.r6g.8xlarge`,
    `ml.r6g.12xlarge`,
    `ml.r6g.16xlarge`,
    `ml.r6gd.large`,
    `ml.r6gd.xlarge`,
    `ml.r6gd.2xlarge`,
    `ml.r6gd.4xlarge`,
    `ml.r6gd.8xlarge`,
    `ml.r6gd.12xlarge`,
    `ml.r6gd.16xlarge`
  )
}

@js.native
sealed trait ProfilingStatus extends js.Any
object ProfilingStatus {
  val Enabled = "Enabled".asInstanceOf[ProfilingStatus]
  val Disabled = "Disabled".asInstanceOf[ProfilingStatus]

  @inline def values: js.Array[ProfilingStatus] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ProjectSortBy extends js.Any
object ProjectSortBy {
  val Name = "Name".asInstanceOf[ProjectSortBy]
  val CreationTime = "CreationTime".asInstanceOf[ProjectSortBy]

  @inline def values: js.Array[ProjectSortBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait ProjectSortOrder extends js.Any
object ProjectSortOrder {
  val Ascending = "Ascending".asInstanceOf[ProjectSortOrder]
  val Descending = "Descending".asInstanceOf[ProjectSortOrder]

  @inline def values: js.Array[ProjectSortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait ProjectStatus extends js.Any
object ProjectStatus {
  val Pending = "Pending".asInstanceOf[ProjectStatus]
  val CreateInProgress = "CreateInProgress".asInstanceOf[ProjectStatus]
  val CreateCompleted = "CreateCompleted".asInstanceOf[ProjectStatus]
  val CreateFailed = "CreateFailed".asInstanceOf[ProjectStatus]
  val DeleteInProgress = "DeleteInProgress".asInstanceOf[ProjectStatus]
  val DeleteFailed = "DeleteFailed".asInstanceOf[ProjectStatus]
  val DeleteCompleted = "DeleteCompleted".asInstanceOf[ProjectStatus]
  val UpdateInProgress = "UpdateInProgress".asInstanceOf[ProjectStatus]
  val UpdateCompleted = "UpdateCompleted".asInstanceOf[ProjectStatus]
  val UpdateFailed = "UpdateFailed".asInstanceOf[ProjectStatus]

  @inline def values: js.Array[ProjectStatus] = js.Array(Pending, CreateInProgress, CreateCompleted, CreateFailed, DeleteInProgress, DeleteFailed, DeleteCompleted, UpdateInProgress, UpdateCompleted, UpdateFailed)
}

@js.native
sealed trait RStudioServerProAccessStatus extends js.Any
object RStudioServerProAccessStatus {
  val ENABLED = "ENABLED".asInstanceOf[RStudioServerProAccessStatus]
  val DISABLED = "DISABLED".asInstanceOf[RStudioServerProAccessStatus]

  @inline def values: js.Array[RStudioServerProAccessStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait RStudioServerProUserGroup extends js.Any
object RStudioServerProUserGroup {
  val R_STUDIO_ADMIN = "R_STUDIO_ADMIN".asInstanceOf[RStudioServerProUserGroup]
  val R_STUDIO_USER = "R_STUDIO_USER".asInstanceOf[RStudioServerProUserGroup]

  @inline def values: js.Array[RStudioServerProUserGroup] = js.Array(R_STUDIO_ADMIN, R_STUDIO_USER)
}

@js.native
sealed trait RecommendationJobStatus extends js.Any
object RecommendationJobStatus {
  val PENDING = "PENDING".asInstanceOf[RecommendationJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[RecommendationJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[RecommendationJobStatus]
  val FAILED = "FAILED".asInstanceOf[RecommendationJobStatus]
  val STOPPING = "STOPPING".asInstanceOf[RecommendationJobStatus]
  val STOPPED = "STOPPED".asInstanceOf[RecommendationJobStatus]

  @inline def values: js.Array[RecommendationJobStatus] = js.Array(PENDING, IN_PROGRESS, COMPLETED, FAILED, STOPPING, STOPPED)
}

@js.native
sealed trait RecommendationJobType extends js.Any
object RecommendationJobType {
  val Default = "Default".asInstanceOf[RecommendationJobType]
  val Advanced = "Advanced".asInstanceOf[RecommendationJobType]

  @inline def values: js.Array[RecommendationJobType] = js.Array(Default, Advanced)
}

@js.native
sealed trait RecommendationStepType extends js.Any
object RecommendationStepType {
  val BENCHMARK = "BENCHMARK".asInstanceOf[RecommendationStepType]

  @inline def values: js.Array[RecommendationStepType] = js.Array(BENCHMARK)
}

@js.native
sealed trait RecordWrapper extends js.Any
object RecordWrapper {
  val None = "None".asInstanceOf[RecordWrapper]
  val RecordIO = "RecordIO".asInstanceOf[RecordWrapper]

  @inline def values: js.Array[RecordWrapper] = js.Array(None, RecordIO)
}

/** The compression used for Redshift query results.
  */
@js.native
sealed trait RedshiftResultCompressionType extends js.Any
object RedshiftResultCompressionType {
  val None = "None".asInstanceOf[RedshiftResultCompressionType]
  val GZIP = "GZIP".asInstanceOf[RedshiftResultCompressionType]
  val BZIP2 = "BZIP2".asInstanceOf[RedshiftResultCompressionType]
  val ZSTD = "ZSTD".asInstanceOf[RedshiftResultCompressionType]
  val SNAPPY = "SNAPPY".asInstanceOf[RedshiftResultCompressionType]

  @inline def values: js.Array[RedshiftResultCompressionType] = js.Array(None, GZIP, BZIP2, ZSTD, SNAPPY)
}

/** The data storage format for Redshift query results.
  */
@js.native
sealed trait RedshiftResultFormat extends js.Any
object RedshiftResultFormat {
  val PARQUET = "PARQUET".asInstanceOf[RedshiftResultFormat]
  val CSV = "CSV".asInstanceOf[RedshiftResultFormat]

  @inline def values: js.Array[RedshiftResultFormat] = js.Array(PARQUET, CSV)
}

@js.native
sealed trait RepositoryAccessMode extends js.Any
object RepositoryAccessMode {
  val Platform = "Platform".asInstanceOf[RepositoryAccessMode]
  val Vpc = "Vpc".asInstanceOf[RepositoryAccessMode]

  @inline def values: js.Array[RepositoryAccessMode] = js.Array(Platform, Vpc)
}

@js.native
sealed trait ResourceType extends js.Any
object ResourceType {
  val TrainingJob = "TrainingJob".asInstanceOf[ResourceType]
  val Experiment = "Experiment".asInstanceOf[ResourceType]
  val ExperimentTrial = "ExperimentTrial".asInstanceOf[ResourceType]
  val ExperimentTrialComponent = "ExperimentTrialComponent".asInstanceOf[ResourceType]
  val Endpoint = "Endpoint".asInstanceOf[ResourceType]
  val ModelPackage = "ModelPackage".asInstanceOf[ResourceType]
  val ModelPackageGroup = "ModelPackageGroup".asInstanceOf[ResourceType]
  val Pipeline = "Pipeline".asInstanceOf[ResourceType]
  val PipelineExecution = "PipelineExecution".asInstanceOf[ResourceType]
  val FeatureGroup = "FeatureGroup".asInstanceOf[ResourceType]
  val Project = "Project".asInstanceOf[ResourceType]
  val FeatureMetadata = "FeatureMetadata".asInstanceOf[ResourceType]
  val HyperParameterTuningJob = "HyperParameterTuningJob".asInstanceOf[ResourceType]
  val ModelCard = "ModelCard".asInstanceOf[ResourceType]
  val Model = "Model".asInstanceOf[ResourceType]

  @inline def values: js.Array[ResourceType] = js.Array(
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
    Project,
    FeatureMetadata,
    HyperParameterTuningJob,
    ModelCard,
    Model
  )
}

@js.native
sealed trait RetentionType extends js.Any
object RetentionType {
  val Retain = "Retain".asInstanceOf[RetentionType]
  val Delete = "Delete".asInstanceOf[RetentionType]

  @inline def values: js.Array[RetentionType] = js.Array(Retain, Delete)
}

@js.native
sealed trait RootAccess extends js.Any
object RootAccess {
  val Enabled = "Enabled".asInstanceOf[RootAccess]
  val Disabled = "Disabled".asInstanceOf[RootAccess]

  @inline def values: js.Array[RootAccess] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait RuleEvaluationStatus extends js.Any
object RuleEvaluationStatus {
  val InProgress = "InProgress".asInstanceOf[RuleEvaluationStatus]
  val NoIssuesFound = "NoIssuesFound".asInstanceOf[RuleEvaluationStatus]
  val IssuesFound = "IssuesFound".asInstanceOf[RuleEvaluationStatus]
  val Error = "Error".asInstanceOf[RuleEvaluationStatus]
  val Stopping = "Stopping".asInstanceOf[RuleEvaluationStatus]
  val Stopped = "Stopped".asInstanceOf[RuleEvaluationStatus]

  @inline def values: js.Array[RuleEvaluationStatus] = js.Array(InProgress, NoIssuesFound, IssuesFound, Error, Stopping, Stopped)
}

@js.native
sealed trait S3DataDistribution extends js.Any
object S3DataDistribution {
  val FullyReplicated = "FullyReplicated".asInstanceOf[S3DataDistribution]
  val ShardedByS3Key = "ShardedByS3Key".asInstanceOf[S3DataDistribution]

  @inline def values: js.Array[S3DataDistribution] = js.Array(FullyReplicated, ShardedByS3Key)
}

@js.native
sealed trait S3DataType extends js.Any
object S3DataType {
  val ManifestFile = "ManifestFile".asInstanceOf[S3DataType]
  val S3Prefix = "S3Prefix".asInstanceOf[S3DataType]
  val AugmentedManifestFile = "AugmentedManifestFile".asInstanceOf[S3DataType]

  @inline def values: js.Array[S3DataType] = js.Array(ManifestFile, S3Prefix, AugmentedManifestFile)
}

@js.native
sealed trait SagemakerServicecatalogStatus extends js.Any
object SagemakerServicecatalogStatus {
  val Enabled = "Enabled".asInstanceOf[SagemakerServicecatalogStatus]
  val Disabled = "Disabled".asInstanceOf[SagemakerServicecatalogStatus]

  @inline def values: js.Array[SagemakerServicecatalogStatus] = js.Array(Enabled, Disabled)
}

@js.native
sealed trait ScheduleStatus extends js.Any
object ScheduleStatus {
  val Pending = "Pending".asInstanceOf[ScheduleStatus]
  val Failed = "Failed".asInstanceOf[ScheduleStatus]
  val Scheduled = "Scheduled".asInstanceOf[ScheduleStatus]
  val Stopped = "Stopped".asInstanceOf[ScheduleStatus]

  @inline def values: js.Array[ScheduleStatus] = js.Array(Pending, Failed, Scheduled, Stopped)
}

@js.native
sealed trait SearchSortOrder extends js.Any
object SearchSortOrder {
  val Ascending = "Ascending".asInstanceOf[SearchSortOrder]
  val Descending = "Descending".asInstanceOf[SearchSortOrder]

  @inline def values: js.Array[SearchSortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait SecondaryStatus extends js.Any
object SecondaryStatus {
  val Starting = "Starting".asInstanceOf[SecondaryStatus]
  val LaunchingMLInstances = "LaunchingMLInstances".asInstanceOf[SecondaryStatus]
  val PreparingTrainingStack = "PreparingTrainingStack".asInstanceOf[SecondaryStatus]
  val Downloading = "Downloading".asInstanceOf[SecondaryStatus]
  val DownloadingTrainingImage = "DownloadingTrainingImage".asInstanceOf[SecondaryStatus]
  val Training = "Training".asInstanceOf[SecondaryStatus]
  val Uploading = "Uploading".asInstanceOf[SecondaryStatus]
  val Stopping = "Stopping".asInstanceOf[SecondaryStatus]
  val Stopped = "Stopped".asInstanceOf[SecondaryStatus]
  val MaxRuntimeExceeded = "MaxRuntimeExceeded".asInstanceOf[SecondaryStatus]
  val Completed = "Completed".asInstanceOf[SecondaryStatus]
  val Failed = "Failed".asInstanceOf[SecondaryStatus]
  val Interrupted = "Interrupted".asInstanceOf[SecondaryStatus]
  val MaxWaitTimeExceeded = "MaxWaitTimeExceeded".asInstanceOf[SecondaryStatus]
  val Updating = "Updating".asInstanceOf[SecondaryStatus]
  val Restarting = "Restarting".asInstanceOf[SecondaryStatus]

  @inline def values: js.Array[SecondaryStatus] = js.Array(
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

@js.native
sealed trait SortActionsBy extends js.Any
object SortActionsBy {
  val Name = "Name".asInstanceOf[SortActionsBy]
  val CreationTime = "CreationTime".asInstanceOf[SortActionsBy]

  @inline def values: js.Array[SortActionsBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait SortArtifactsBy extends js.Any
object SortArtifactsBy {
  val CreationTime = "CreationTime".asInstanceOf[SortArtifactsBy]

  @inline def values: js.Array[SortArtifactsBy] = js.Array(CreationTime)
}

@js.native
sealed trait SortAssociationsBy extends js.Any
object SortAssociationsBy {
  val SourceArn = "SourceArn".asInstanceOf[SortAssociationsBy]
  val DestinationArn = "DestinationArn".asInstanceOf[SortAssociationsBy]
  val SourceType = "SourceType".asInstanceOf[SortAssociationsBy]
  val DestinationType = "DestinationType".asInstanceOf[SortAssociationsBy]
  val CreationTime = "CreationTime".asInstanceOf[SortAssociationsBy]

  @inline def values: js.Array[SortAssociationsBy] = js.Array(SourceArn, DestinationArn, SourceType, DestinationType, CreationTime)
}

@js.native
sealed trait SortBy extends js.Any
object SortBy {
  val Name = "Name".asInstanceOf[SortBy]
  val CreationTime = "CreationTime".asInstanceOf[SortBy]
  val Status = "Status".asInstanceOf[SortBy]

  @inline def values: js.Array[SortBy] = js.Array(Name, CreationTime, Status)
}

@js.native
sealed trait SortContextsBy extends js.Any
object SortContextsBy {
  val Name = "Name".asInstanceOf[SortContextsBy]
  val CreationTime = "CreationTime".asInstanceOf[SortContextsBy]

  @inline def values: js.Array[SortContextsBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait SortExperimentsBy extends js.Any
object SortExperimentsBy {
  val Name = "Name".asInstanceOf[SortExperimentsBy]
  val CreationTime = "CreationTime".asInstanceOf[SortExperimentsBy]

  @inline def values: js.Array[SortExperimentsBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait SortInferenceExperimentsBy extends js.Any
object SortInferenceExperimentsBy {
  val Name = "Name".asInstanceOf[SortInferenceExperimentsBy]
  val CreationTime = "CreationTime".asInstanceOf[SortInferenceExperimentsBy]
  val Status = "Status".asInstanceOf[SortInferenceExperimentsBy]

  @inline def values: js.Array[SortInferenceExperimentsBy] = js.Array(Name, CreationTime, Status)
}

@js.native
sealed trait SortLineageGroupsBy extends js.Any
object SortLineageGroupsBy {
  val Name = "Name".asInstanceOf[SortLineageGroupsBy]
  val CreationTime = "CreationTime".asInstanceOf[SortLineageGroupsBy]

  @inline def values: js.Array[SortLineageGroupsBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val Ascending = "Ascending".asInstanceOf[SortOrder]
  val Descending = "Descending".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(Ascending, Descending)
}

@js.native
sealed trait SortPipelineExecutionsBy extends js.Any
object SortPipelineExecutionsBy {
  val CreationTime = "CreationTime".asInstanceOf[SortPipelineExecutionsBy]
  val PipelineExecutionArn = "PipelineExecutionArn".asInstanceOf[SortPipelineExecutionsBy]

  @inline def values: js.Array[SortPipelineExecutionsBy] = js.Array(CreationTime, PipelineExecutionArn)
}

@js.native
sealed trait SortPipelinesBy extends js.Any
object SortPipelinesBy {
  val Name = "Name".asInstanceOf[SortPipelinesBy]
  val CreationTime = "CreationTime".asInstanceOf[SortPipelinesBy]

  @inline def values: js.Array[SortPipelinesBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait SortTrialComponentsBy extends js.Any
object SortTrialComponentsBy {
  val Name = "Name".asInstanceOf[SortTrialComponentsBy]
  val CreationTime = "CreationTime".asInstanceOf[SortTrialComponentsBy]

  @inline def values: js.Array[SortTrialComponentsBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait SortTrialsBy extends js.Any
object SortTrialsBy {
  val Name = "Name".asInstanceOf[SortTrialsBy]
  val CreationTime = "CreationTime".asInstanceOf[SortTrialsBy]

  @inline def values: js.Array[SortTrialsBy] = js.Array(Name, CreationTime)
}

@js.native
sealed trait SpaceSortKey extends js.Any
object SpaceSortKey {
  val CreationTime = "CreationTime".asInstanceOf[SpaceSortKey]
  val LastModifiedTime = "LastModifiedTime".asInstanceOf[SpaceSortKey]

  @inline def values: js.Array[SpaceSortKey] = js.Array(CreationTime, LastModifiedTime)
}

@js.native
sealed trait SpaceStatus extends js.Any
object SpaceStatus {
  val Deleting = "Deleting".asInstanceOf[SpaceStatus]
  val Failed = "Failed".asInstanceOf[SpaceStatus]
  val InService = "InService".asInstanceOf[SpaceStatus]
  val Pending = "Pending".asInstanceOf[SpaceStatus]
  val Updating = "Updating".asInstanceOf[SpaceStatus]
  val Update_Failed = "Update_Failed".asInstanceOf[SpaceStatus]
  val Delete_Failed = "Delete_Failed".asInstanceOf[SpaceStatus]

  @inline def values: js.Array[SpaceStatus] = js.Array(Deleting, Failed, InService, Pending, Updating, Update_Failed, Delete_Failed)
}

@js.native
sealed trait SplitType extends js.Any
object SplitType {
  val None = "None".asInstanceOf[SplitType]
  val Line = "Line".asInstanceOf[SplitType]
  val RecordIO = "RecordIO".asInstanceOf[SplitType]
  val TFRecord = "TFRecord".asInstanceOf[SplitType]

  @inline def values: js.Array[SplitType] = js.Array(None, Line, RecordIO, TFRecord)
}

@js.native
sealed trait StageStatus extends js.Any
object StageStatus {
  val CREATING = "CREATING".asInstanceOf[StageStatus]
  val READYTODEPLOY = "READYTODEPLOY".asInstanceOf[StageStatus]
  val STARTING = "STARTING".asInstanceOf[StageStatus]
  val INPROGRESS = "INPROGRESS".asInstanceOf[StageStatus]
  val DEPLOYED = "DEPLOYED".asInstanceOf[StageStatus]
  val FAILED = "FAILED".asInstanceOf[StageStatus]
  val STOPPING = "STOPPING".asInstanceOf[StageStatus]
  val STOPPED = "STOPPED".asInstanceOf[StageStatus]

  @inline def values: js.Array[StageStatus] = js.Array(CREATING, READYTODEPLOY, STARTING, INPROGRESS, DEPLOYED, FAILED, STOPPING, STOPPED)
}

@js.native
sealed trait StepStatus extends js.Any
object StepStatus {
  val Starting = "Starting".asInstanceOf[StepStatus]
  val Executing = "Executing".asInstanceOf[StepStatus]
  val Stopping = "Stopping".asInstanceOf[StepStatus]
  val Stopped = "Stopped".asInstanceOf[StepStatus]
  val Failed = "Failed".asInstanceOf[StepStatus]
  val Succeeded = "Succeeded".asInstanceOf[StepStatus]

  @inline def values: js.Array[StepStatus] = js.Array(Starting, Executing, Stopping, Stopped, Failed, Succeeded)
}

@js.native
sealed trait StudioLifecycleConfigAppType extends js.Any
object StudioLifecycleConfigAppType {
  val JupyterServer = "JupyterServer".asInstanceOf[StudioLifecycleConfigAppType]
  val KernelGateway = "KernelGateway".asInstanceOf[StudioLifecycleConfigAppType]

  @inline def values: js.Array[StudioLifecycleConfigAppType] = js.Array(JupyterServer, KernelGateway)
}

@js.native
sealed trait StudioLifecycleConfigSortKey extends js.Any
object StudioLifecycleConfigSortKey {
  val CreationTime = "CreationTime".asInstanceOf[StudioLifecycleConfigSortKey]
  val LastModifiedTime = "LastModifiedTime".asInstanceOf[StudioLifecycleConfigSortKey]
  val Name = "Name".asInstanceOf[StudioLifecycleConfigSortKey]

  @inline def values: js.Array[StudioLifecycleConfigSortKey] = js.Array(CreationTime, LastModifiedTime, Name)
}

@js.native
sealed trait TableFormat extends js.Any
object TableFormat {
  val Glue = "Glue".asInstanceOf[TableFormat]
  val Iceberg = "Iceberg".asInstanceOf[TableFormat]

  @inline def values: js.Array[TableFormat] = js.Array(Glue, Iceberg)
}

@js.native
sealed trait TargetDevice extends js.Any
object TargetDevice {
  val lambda = "lambda".asInstanceOf[TargetDevice]
  val ml_m4 = "ml_m4".asInstanceOf[TargetDevice]
  val ml_m5 = "ml_m5".asInstanceOf[TargetDevice]
  val ml_c4 = "ml_c4".asInstanceOf[TargetDevice]
  val ml_c5 = "ml_c5".asInstanceOf[TargetDevice]
  val ml_p2 = "ml_p2".asInstanceOf[TargetDevice]
  val ml_p3 = "ml_p3".asInstanceOf[TargetDevice]
  val ml_g4dn = "ml_g4dn".asInstanceOf[TargetDevice]
  val ml_inf1 = "ml_inf1".asInstanceOf[TargetDevice]
  val ml_eia2 = "ml_eia2".asInstanceOf[TargetDevice]
  val jetson_tx1 = "jetson_tx1".asInstanceOf[TargetDevice]
  val jetson_tx2 = "jetson_tx2".asInstanceOf[TargetDevice]
  val jetson_nano = "jetson_nano".asInstanceOf[TargetDevice]
  val jetson_xavier = "jetson_xavier".asInstanceOf[TargetDevice]
  val rasp3b = "rasp3b".asInstanceOf[TargetDevice]
  val imx8qm = "imx8qm".asInstanceOf[TargetDevice]
  val deeplens = "deeplens".asInstanceOf[TargetDevice]
  val rk3399 = "rk3399".asInstanceOf[TargetDevice]
  val rk3288 = "rk3288".asInstanceOf[TargetDevice]
  val aisage = "aisage".asInstanceOf[TargetDevice]
  val sbe_c = "sbe_c".asInstanceOf[TargetDevice]
  val qcs605 = "qcs605".asInstanceOf[TargetDevice]
  val qcs603 = "qcs603".asInstanceOf[TargetDevice]
  val sitara_am57x = "sitara_am57x".asInstanceOf[TargetDevice]
  val amba_cv2 = "amba_cv2".asInstanceOf[TargetDevice]
  val amba_cv22 = "amba_cv22".asInstanceOf[TargetDevice]
  val amba_cv25 = "amba_cv25".asInstanceOf[TargetDevice]
  val x86_win32 = "x86_win32".asInstanceOf[TargetDevice]
  val x86_win64 = "x86_win64".asInstanceOf[TargetDevice]
  val coreml = "coreml".asInstanceOf[TargetDevice]
  val jacinto_tda4vm = "jacinto_tda4vm".asInstanceOf[TargetDevice]
  val imx8mplus = "imx8mplus".asInstanceOf[TargetDevice]

  @inline def values: js.Array[TargetDevice] = js.Array(
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

@js.native
sealed trait TargetPlatformAccelerator extends js.Any
object TargetPlatformAccelerator {
  val INTEL_GRAPHICS = "INTEL_GRAPHICS".asInstanceOf[TargetPlatformAccelerator]
  val MALI = "MALI".asInstanceOf[TargetPlatformAccelerator]
  val NVIDIA = "NVIDIA".asInstanceOf[TargetPlatformAccelerator]
  val NNA = "NNA".asInstanceOf[TargetPlatformAccelerator]

  @inline def values: js.Array[TargetPlatformAccelerator] = js.Array(INTEL_GRAPHICS, MALI, NVIDIA, NNA)
}

@js.native
sealed trait TargetPlatformArch extends js.Any
object TargetPlatformArch {
  val X86_64 = "X86_64".asInstanceOf[TargetPlatformArch]
  val X86 = "X86".asInstanceOf[TargetPlatformArch]
  val ARM64 = "ARM64".asInstanceOf[TargetPlatformArch]
  val ARM_EABI = "ARM_EABI".asInstanceOf[TargetPlatformArch]
  val ARM_EABIHF = "ARM_EABIHF".asInstanceOf[TargetPlatformArch]

  @inline def values: js.Array[TargetPlatformArch] = js.Array(X86_64, X86, ARM64, ARM_EABI, ARM_EABIHF)
}

@js.native
sealed trait TargetPlatformOs extends js.Any
object TargetPlatformOs {
  val ANDROID = "ANDROID".asInstanceOf[TargetPlatformOs]
  val LINUX = "LINUX".asInstanceOf[TargetPlatformOs]

  @inline def values: js.Array[TargetPlatformOs] = js.Array(ANDROID, LINUX)
}

@js.native
sealed trait TrafficRoutingConfigType extends js.Any
object TrafficRoutingConfigType {
  val ALL_AT_ONCE = "ALL_AT_ONCE".asInstanceOf[TrafficRoutingConfigType]
  val CANARY = "CANARY".asInstanceOf[TrafficRoutingConfigType]
  val LINEAR = "LINEAR".asInstanceOf[TrafficRoutingConfigType]

  @inline def values: js.Array[TrafficRoutingConfigType] = js.Array(ALL_AT_ONCE, CANARY, LINEAR)
}

@js.native
sealed trait TrafficType extends js.Any
object TrafficType {
  val PHASES = "PHASES".asInstanceOf[TrafficType]

  @inline def values: js.Array[TrafficType] = js.Array(PHASES)
}

/** The training input mode that the algorithm supports. For more information about input modes, see [[https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html|Algorithms]].
  * \```Pipe mode``` If an algorithm supports <code>Pipe</code> mode, Amazon SageMaker streams data directly from Amazon S3 to the container.
  * \```File mode``` If an algorithm supports <code>File</code> mode, SageMaker downloads the training data from S3 to the provisioned ML storage volume, and mounts the directory to the Docker volume for the training container. You must provision the ML storage volume with sufficient capacity to accommodate the data downloaded from S3. In addition to the training data, the ML storage volume also stores the output model. The algorithm container uses the ML storage volume to also store intermediate information, if any. For distributed algorithms, training data is distributed uniformly. Your training duration is predictable if the input data objects sizes are approximately the same. SageMaker does not split the files any further for model training. If the object sizes are skewed, training won't be optimal as the data distribution is also skewed when one host in a training cluster is overloaded, thus becoming a bottleneck in training.
  * \```FastFile mode``` If an algorithm supports <code>FastFile</code> mode, SageMaker streams data directly from S3 to the container with no code changes, and provides file system access to the data. Users can author their training script to interact with these files as if they were stored on disk. <code>FastFile</code> mode works best when the data is read sequentially. Augmented manifest files aren't supported. The startup time is lower when there are fewer files in the S3 bucket provided.
  */
@js.native
sealed trait TrainingInputMode extends js.Any
object TrainingInputMode {
  val Pipe = "Pipe".asInstanceOf[TrainingInputMode]
  val File = "File".asInstanceOf[TrainingInputMode]
  val FastFile = "FastFile".asInstanceOf[TrainingInputMode]

  @inline def values: js.Array[TrainingInputMode] = js.Array(Pipe, File, FastFile)
}

@js.native
sealed trait TrainingInstanceType extends js.Any
object TrainingInstanceType {
  val `ml.m4.xlarge` = "ml.m4.xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.m4.2xlarge` = "ml.m4.2xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.m4.4xlarge` = "ml.m4.4xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.m4.10xlarge` = "ml.m4.10xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.m4.16xlarge` = "ml.m4.16xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g4dn.xlarge` = "ml.g4dn.xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g4dn.2xlarge` = "ml.g4dn.2xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g4dn.4xlarge` = "ml.g4dn.4xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g4dn.8xlarge` = "ml.g4dn.8xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.m5.large` = "ml.m5.large".asInstanceOf[TrainingInstanceType]
  val `ml.m5.xlarge` = "ml.m5.xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.m5.2xlarge` = "ml.m5.2xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.m5.4xlarge` = "ml.m5.4xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.m5.12xlarge` = "ml.m5.12xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.m5.24xlarge` = "ml.m5.24xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c4.xlarge` = "ml.c4.xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c4.2xlarge` = "ml.c4.2xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c4.4xlarge` = "ml.c4.4xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c4.8xlarge` = "ml.c4.8xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.p2.xlarge` = "ml.p2.xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.p2.8xlarge` = "ml.p2.8xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.p2.16xlarge` = "ml.p2.16xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.p3.2xlarge` = "ml.p3.2xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.p3.8xlarge` = "ml.p3.8xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.p3.16xlarge` = "ml.p3.16xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.p3dn.24xlarge` = "ml.p3dn.24xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.p4d.24xlarge` = "ml.p4d.24xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5.xlarge` = "ml.c5.xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5.2xlarge` = "ml.c5.2xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5.4xlarge` = "ml.c5.4xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5.9xlarge` = "ml.c5.9xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5.18xlarge` = "ml.c5.18xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5n.xlarge` = "ml.c5n.xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5n.2xlarge` = "ml.c5n.2xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5n.4xlarge` = "ml.c5n.4xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5n.9xlarge` = "ml.c5n.9xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.c5n.18xlarge` = "ml.c5n.18xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g5.xlarge` = "ml.g5.xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g5.2xlarge` = "ml.g5.2xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g5.4xlarge` = "ml.g5.4xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g5.8xlarge` = "ml.g5.8xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g5.16xlarge` = "ml.g5.16xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g5.12xlarge` = "ml.g5.12xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g5.24xlarge` = "ml.g5.24xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.g5.48xlarge` = "ml.g5.48xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.trn1.2xlarge` = "ml.trn1.2xlarge".asInstanceOf[TrainingInstanceType]
  val `ml.trn1.32xlarge` = "ml.trn1.32xlarge".asInstanceOf[TrainingInstanceType]

  @inline def values: js.Array[TrainingInstanceType] = js.Array(
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
    `ml.c5n.18xlarge`,
    `ml.g5.xlarge`,
    `ml.g5.2xlarge`,
    `ml.g5.4xlarge`,
    `ml.g5.8xlarge`,
    `ml.g5.16xlarge`,
    `ml.g5.12xlarge`,
    `ml.g5.24xlarge`,
    `ml.g5.48xlarge`,
    `ml.trn1.2xlarge`,
    `ml.trn1.32xlarge`
  )
}

@js.native
sealed trait TrainingJobEarlyStoppingType extends js.Any
object TrainingJobEarlyStoppingType {
  val Off = "Off".asInstanceOf[TrainingJobEarlyStoppingType]
  val Auto = "Auto".asInstanceOf[TrainingJobEarlyStoppingType]

  @inline def values: js.Array[TrainingJobEarlyStoppingType] = js.Array(Off, Auto)
}

@js.native
sealed trait TrainingJobSortByOptions extends js.Any
object TrainingJobSortByOptions {
  val Name = "Name".asInstanceOf[TrainingJobSortByOptions]
  val CreationTime = "CreationTime".asInstanceOf[TrainingJobSortByOptions]
  val Status = "Status".asInstanceOf[TrainingJobSortByOptions]
  val FinalObjectiveMetricValue = "FinalObjectiveMetricValue".asInstanceOf[TrainingJobSortByOptions]

  @inline def values: js.Array[TrainingJobSortByOptions] = js.Array(Name, CreationTime, Status, FinalObjectiveMetricValue)
}

@js.native
sealed trait TrainingJobStatus extends js.Any
object TrainingJobStatus {
  val InProgress = "InProgress".asInstanceOf[TrainingJobStatus]
  val Completed = "Completed".asInstanceOf[TrainingJobStatus]
  val Failed = "Failed".asInstanceOf[TrainingJobStatus]
  val Stopping = "Stopping".asInstanceOf[TrainingJobStatus]
  val Stopped = "Stopped".asInstanceOf[TrainingJobStatus]

  @inline def values: js.Array[TrainingJobStatus] = js.Array(InProgress, Completed, Failed, Stopping, Stopped)
}

@js.native
sealed trait TransformInstanceType extends js.Any
object TransformInstanceType {
  val `ml.m4.xlarge` = "ml.m4.xlarge".asInstanceOf[TransformInstanceType]
  val `ml.m4.2xlarge` = "ml.m4.2xlarge".asInstanceOf[TransformInstanceType]
  val `ml.m4.4xlarge` = "ml.m4.4xlarge".asInstanceOf[TransformInstanceType]
  val `ml.m4.10xlarge` = "ml.m4.10xlarge".asInstanceOf[TransformInstanceType]
  val `ml.m4.16xlarge` = "ml.m4.16xlarge".asInstanceOf[TransformInstanceType]
  val `ml.c4.xlarge` = "ml.c4.xlarge".asInstanceOf[TransformInstanceType]
  val `ml.c4.2xlarge` = "ml.c4.2xlarge".asInstanceOf[TransformInstanceType]
  val `ml.c4.4xlarge` = "ml.c4.4xlarge".asInstanceOf[TransformInstanceType]
  val `ml.c4.8xlarge` = "ml.c4.8xlarge".asInstanceOf[TransformInstanceType]
  val `ml.p2.xlarge` = "ml.p2.xlarge".asInstanceOf[TransformInstanceType]
  val `ml.p2.8xlarge` = "ml.p2.8xlarge".asInstanceOf[TransformInstanceType]
  val `ml.p2.16xlarge` = "ml.p2.16xlarge".asInstanceOf[TransformInstanceType]
  val `ml.p3.2xlarge` = "ml.p3.2xlarge".asInstanceOf[TransformInstanceType]
  val `ml.p3.8xlarge` = "ml.p3.8xlarge".asInstanceOf[TransformInstanceType]
  val `ml.p3.16xlarge` = "ml.p3.16xlarge".asInstanceOf[TransformInstanceType]
  val `ml.c5.xlarge` = "ml.c5.xlarge".asInstanceOf[TransformInstanceType]
  val `ml.c5.2xlarge` = "ml.c5.2xlarge".asInstanceOf[TransformInstanceType]
  val `ml.c5.4xlarge` = "ml.c5.4xlarge".asInstanceOf[TransformInstanceType]
  val `ml.c5.9xlarge` = "ml.c5.9xlarge".asInstanceOf[TransformInstanceType]
  val `ml.c5.18xlarge` = "ml.c5.18xlarge".asInstanceOf[TransformInstanceType]
  val `ml.m5.large` = "ml.m5.large".asInstanceOf[TransformInstanceType]
  val `ml.m5.xlarge` = "ml.m5.xlarge".asInstanceOf[TransformInstanceType]
  val `ml.m5.2xlarge` = "ml.m5.2xlarge".asInstanceOf[TransformInstanceType]
  val `ml.m5.4xlarge` = "ml.m5.4xlarge".asInstanceOf[TransformInstanceType]
  val `ml.m5.12xlarge` = "ml.m5.12xlarge".asInstanceOf[TransformInstanceType]
  val `ml.m5.24xlarge` = "ml.m5.24xlarge".asInstanceOf[TransformInstanceType]
  val `ml.g4dn.xlarge` = "ml.g4dn.xlarge".asInstanceOf[TransformInstanceType]
  val `ml.g4dn.2xlarge` = "ml.g4dn.2xlarge".asInstanceOf[TransformInstanceType]
  val `ml.g4dn.4xlarge` = "ml.g4dn.4xlarge".asInstanceOf[TransformInstanceType]
  val `ml.g4dn.8xlarge` = "ml.g4dn.8xlarge".asInstanceOf[TransformInstanceType]
  val `ml.g4dn.12xlarge` = "ml.g4dn.12xlarge".asInstanceOf[TransformInstanceType]
  val `ml.g4dn.16xlarge` = "ml.g4dn.16xlarge".asInstanceOf[TransformInstanceType]

  @inline def values: js.Array[TransformInstanceType] = js.Array(
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

@js.native
sealed trait TransformJobStatus extends js.Any
object TransformJobStatus {
  val InProgress = "InProgress".asInstanceOf[TransformJobStatus]
  val Completed = "Completed".asInstanceOf[TransformJobStatus]
  val Failed = "Failed".asInstanceOf[TransformJobStatus]
  val Stopping = "Stopping".asInstanceOf[TransformJobStatus]
  val Stopped = "Stopped".asInstanceOf[TransformJobStatus]

  @inline def values: js.Array[TransformJobStatus] = js.Array(InProgress, Completed, Failed, Stopping, Stopped)
}

@js.native
sealed trait TrialComponentPrimaryStatus extends js.Any
object TrialComponentPrimaryStatus {
  val InProgress = "InProgress".asInstanceOf[TrialComponentPrimaryStatus]
  val Completed = "Completed".asInstanceOf[TrialComponentPrimaryStatus]
  val Failed = "Failed".asInstanceOf[TrialComponentPrimaryStatus]
  val Stopping = "Stopping".asInstanceOf[TrialComponentPrimaryStatus]
  val Stopped = "Stopped".asInstanceOf[TrialComponentPrimaryStatus]

  @inline def values: js.Array[TrialComponentPrimaryStatus] = js.Array(InProgress, Completed, Failed, Stopping, Stopped)
}

@js.native
sealed trait UserProfileSortKey extends js.Any
object UserProfileSortKey {
  val CreationTime = "CreationTime".asInstanceOf[UserProfileSortKey]
  val LastModifiedTime = "LastModifiedTime".asInstanceOf[UserProfileSortKey]

  @inline def values: js.Array[UserProfileSortKey] = js.Array(CreationTime, LastModifiedTime)
}

@js.native
sealed trait UserProfileStatus extends js.Any
object UserProfileStatus {
  val Deleting = "Deleting".asInstanceOf[UserProfileStatus]
  val Failed = "Failed".asInstanceOf[UserProfileStatus]
  val InService = "InService".asInstanceOf[UserProfileStatus]
  val Pending = "Pending".asInstanceOf[UserProfileStatus]
  val Updating = "Updating".asInstanceOf[UserProfileStatus]
  val Update_Failed = "Update_Failed".asInstanceOf[UserProfileStatus]
  val Delete_Failed = "Delete_Failed".asInstanceOf[UserProfileStatus]

  @inline def values: js.Array[UserProfileStatus] = js.Array(Deleting, Failed, InService, Pending, Updating, Update_Failed, Delete_Failed)
}

@js.native
sealed trait VariantPropertyType extends js.Any
object VariantPropertyType {
  val DesiredInstanceCount = "DesiredInstanceCount".asInstanceOf[VariantPropertyType]
  val DesiredWeight = "DesiredWeight".asInstanceOf[VariantPropertyType]
  val DataCaptureConfig = "DataCaptureConfig".asInstanceOf[VariantPropertyType]

  @inline def values: js.Array[VariantPropertyType] = js.Array(DesiredInstanceCount, DesiredWeight, DataCaptureConfig)
}

@js.native
sealed trait VariantStatus extends js.Any
object VariantStatus {
  val Creating = "Creating".asInstanceOf[VariantStatus]
  val Updating = "Updating".asInstanceOf[VariantStatus]
  val Deleting = "Deleting".asInstanceOf[VariantStatus]
  val ActivatingTraffic = "ActivatingTraffic".asInstanceOf[VariantStatus]
  val Baking = "Baking".asInstanceOf[VariantStatus]

  @inline def values: js.Array[VariantStatus] = js.Array(Creating, Updating, Deleting, ActivatingTraffic, Baking)
}

@js.native
sealed trait WarmPoolResourceStatus extends js.Any
object WarmPoolResourceStatus {
  val Available = "Available".asInstanceOf[WarmPoolResourceStatus]
  val Terminated = "Terminated".asInstanceOf[WarmPoolResourceStatus]
  val Reused = "Reused".asInstanceOf[WarmPoolResourceStatus]
  val InUse = "InUse".asInstanceOf[WarmPoolResourceStatus]

  @inline def values: js.Array[WarmPoolResourceStatus] = js.Array(Available, Terminated, Reused, InUse)
}

@js.native
sealed trait WorkforceStatus extends js.Any
object WorkforceStatus {
  val Initializing = "Initializing".asInstanceOf[WorkforceStatus]
  val Updating = "Updating".asInstanceOf[WorkforceStatus]
  val Deleting = "Deleting".asInstanceOf[WorkforceStatus]
  val Failed = "Failed".asInstanceOf[WorkforceStatus]
  val Active = "Active".asInstanceOf[WorkforceStatus]

  @inline def values: js.Array[WorkforceStatus] = js.Array(Initializing, Updating, Deleting, Failed, Active)
}
