package facade.amazonaws.services.migrationhubstrategy

import scalajs.js

@js.native
sealed trait AntipatternReportStatus extends js.Any
object AntipatternReportStatus {
  val FAILED = "FAILED".asInstanceOf[AntipatternReportStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AntipatternReportStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[AntipatternReportStatus]

  @inline def values: js.Array[AntipatternReportStatus] = js.Array(FAILED, IN_PROGRESS, SUCCESS)
}

@js.native
sealed trait AppType extends js.Any
object AppType {
  val DotNetFramework = "DotNetFramework".asInstanceOf[AppType]
  val Java = "Java".asInstanceOf[AppType]
  val SQLServer = "SQLServer".asInstanceOf[AppType]
  val IIS = "IIS".asInstanceOf[AppType]
  val Oracle = "Oracle".asInstanceOf[AppType]
  val Other = "Other".asInstanceOf[AppType]

  @inline def values: js.Array[AppType] = js.Array(DotNetFramework, Java, SQLServer, IIS, Oracle, Other)
}

@js.native
sealed trait ApplicationComponentCriteria extends js.Any
object ApplicationComponentCriteria {
  val NOT_DEFINED = "NOT_DEFINED".asInstanceOf[ApplicationComponentCriteria]
  val APP_NAME = "APP_NAME".asInstanceOf[ApplicationComponentCriteria]
  val SERVER_ID = "SERVER_ID".asInstanceOf[ApplicationComponentCriteria]
  val APP_TYPE = "APP_TYPE".asInstanceOf[ApplicationComponentCriteria]
  val STRATEGY = "STRATEGY".asInstanceOf[ApplicationComponentCriteria]
  val DESTINATION = "DESTINATION".asInstanceOf[ApplicationComponentCriteria]

  @inline def values: js.Array[ApplicationComponentCriteria] = js.Array(NOT_DEFINED, APP_NAME, SERVER_ID, APP_TYPE, STRATEGY, DESTINATION)
}

@js.native
sealed trait AssessmentStatus extends js.Any
object AssessmentStatus {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[AssessmentStatus]
  val COMPLETE = "COMPLETE".asInstanceOf[AssessmentStatus]
  val FAILED = "FAILED".asInstanceOf[AssessmentStatus]
  val STOPPED = "STOPPED".asInstanceOf[AssessmentStatus]

  @inline def values: js.Array[AssessmentStatus] = js.Array(IN_PROGRESS, COMPLETE, FAILED, STOPPED)
}

@js.native
sealed trait AwsManagedTargetDestination extends js.Any
object AwsManagedTargetDestination {
  val `None specified` = "None specified".asInstanceOf[AwsManagedTargetDestination]
  val `AWS Elastic BeanStalk` = "AWS Elastic BeanStalk".asInstanceOf[AwsManagedTargetDestination]
  val `AWS Fargate` = "AWS Fargate".asInstanceOf[AwsManagedTargetDestination]

  @inline def values: js.Array[AwsManagedTargetDestination] = js.Array(`None specified`, `AWS Elastic BeanStalk`, `AWS Fargate`)
}

@js.native
sealed trait CollectorHealth extends js.Any
object CollectorHealth {
  val COLLECTOR_HEALTHY = "COLLECTOR_HEALTHY".asInstanceOf[CollectorHealth]
  val COLLECTOR_UNHEALTHY = "COLLECTOR_UNHEALTHY".asInstanceOf[CollectorHealth]

  @inline def values: js.Array[CollectorHealth] = js.Array(COLLECTOR_HEALTHY, COLLECTOR_UNHEALTHY)
}

@js.native
sealed trait DataSourceType extends js.Any
object DataSourceType {
  val ApplicationDiscoveryService = "ApplicationDiscoveryService".asInstanceOf[DataSourceType]
  val MPA = "MPA".asInstanceOf[DataSourceType]

  @inline def values: js.Array[DataSourceType] = js.Array(ApplicationDiscoveryService, MPA)
}

@js.native
sealed trait DatabaseManagementPreference extends js.Any
object DatabaseManagementPreference {
  val `AWS-managed` = "AWS-managed".asInstanceOf[DatabaseManagementPreference]
  val `Self-manage` = "Self-manage".asInstanceOf[DatabaseManagementPreference]
  val `No preference` = "No preference".asInstanceOf[DatabaseManagementPreference]

  @inline def values: js.Array[DatabaseManagementPreference] = js.Array(`AWS-managed`, `Self-manage`, `No preference`)
}

@js.native
sealed trait GroupName extends js.Any
object GroupName {
  val ExternalId = "ExternalId".asInstanceOf[GroupName]

  @inline def values: js.Array[GroupName] = js.Array(ExternalId)
}

@js.native
sealed trait HeterogeneousTargetDatabaseEngine extends js.Any
object HeterogeneousTargetDatabaseEngine {
  val `None specified` = "None specified".asInstanceOf[HeterogeneousTargetDatabaseEngine]
  val `Amazon Aurora` = "Amazon Aurora".asInstanceOf[HeterogeneousTargetDatabaseEngine]
  val `AWS PostgreSQL` = "AWS PostgreSQL".asInstanceOf[HeterogeneousTargetDatabaseEngine]
  val MySQL = "MySQL".asInstanceOf[HeterogeneousTargetDatabaseEngine]
  val `Microsoft SQL Server` = "Microsoft SQL Server".asInstanceOf[HeterogeneousTargetDatabaseEngine]
  val `Oracle Database` = "Oracle Database".asInstanceOf[HeterogeneousTargetDatabaseEngine]
  val MariaDB = "MariaDB".asInstanceOf[HeterogeneousTargetDatabaseEngine]
  val SAP = "SAP".asInstanceOf[HeterogeneousTargetDatabaseEngine]
  val `Db2 LUW` = "Db2 LUW".asInstanceOf[HeterogeneousTargetDatabaseEngine]
  val MongoDB = "MongoDB".asInstanceOf[HeterogeneousTargetDatabaseEngine]

  @inline def values: js.Array[HeterogeneousTargetDatabaseEngine] = js.Array(`None specified`, `Amazon Aurora`, `AWS PostgreSQL`, MySQL, `Microsoft SQL Server`, `Oracle Database`, MariaDB, SAP, `Db2 LUW`, MongoDB)
}

@js.native
sealed trait HomogeneousTargetDatabaseEngine extends js.Any
object HomogeneousTargetDatabaseEngine {
  val `None specified` = "None specified".asInstanceOf[HomogeneousTargetDatabaseEngine]

  @inline def values: js.Array[HomogeneousTargetDatabaseEngine] = js.Array(`None specified`)
}

@js.native
sealed trait ImportFileTaskStatus extends js.Any
object ImportFileTaskStatus {
  val ImportInProgress = "ImportInProgress".asInstanceOf[ImportFileTaskStatus]
  val ImportFailed = "ImportFailed".asInstanceOf[ImportFileTaskStatus]
  val ImportPartialSuccess = "ImportPartialSuccess".asInstanceOf[ImportFileTaskStatus]
  val ImportSuccess = "ImportSuccess".asInstanceOf[ImportFileTaskStatus]
  val DeleteInProgress = "DeleteInProgress".asInstanceOf[ImportFileTaskStatus]
  val DeleteFailed = "DeleteFailed".asInstanceOf[ImportFileTaskStatus]
  val DeletePartialSuccess = "DeletePartialSuccess".asInstanceOf[ImportFileTaskStatus]
  val DeleteSuccess = "DeleteSuccess".asInstanceOf[ImportFileTaskStatus]

  @inline def values: js.Array[ImportFileTaskStatus] = js.Array(ImportInProgress, ImportFailed, ImportPartialSuccess, ImportSuccess, DeleteInProgress, DeleteFailed, DeletePartialSuccess, DeleteSuccess)
}

@js.native
sealed trait InclusionStatus extends js.Any
object InclusionStatus {
  val excludeFromAssessment = "excludeFromAssessment".asInstanceOf[InclusionStatus]
  val includeInAssessment = "includeInAssessment".asInstanceOf[InclusionStatus]

  @inline def values: js.Array[InclusionStatus] = js.Array(excludeFromAssessment, includeInAssessment)
}

@js.native
sealed trait NoPreferenceTargetDestination extends js.Any
object NoPreferenceTargetDestination {
  val `None specified` = "None specified".asInstanceOf[NoPreferenceTargetDestination]
  val `AWS Elastic BeanStalk` = "AWS Elastic BeanStalk".asInstanceOf[NoPreferenceTargetDestination]
  val `AWS Fargate` = "AWS Fargate".asInstanceOf[NoPreferenceTargetDestination]
  val `Amazon Elastic Cloud Compute (EC2)` = "Amazon Elastic Cloud Compute (EC2)".asInstanceOf[NoPreferenceTargetDestination]
  val `Amazon Elastic Container Service (ECS)` = "Amazon Elastic Container Service (ECS)".asInstanceOf[NoPreferenceTargetDestination]
  val `Amazon Elastic Kubernetes Service (EKS)` = "Amazon Elastic Kubernetes Service (EKS)".asInstanceOf[NoPreferenceTargetDestination]

  @inline def values: js.Array[NoPreferenceTargetDestination] = js.Array(
    `None specified`,
    `AWS Elastic BeanStalk`,
    `AWS Fargate`,
    `Amazon Elastic Cloud Compute (EC2)`,
    `Amazon Elastic Container Service (ECS)`,
    `Amazon Elastic Kubernetes Service (EKS)`
  )
}

@js.native
sealed trait OSType extends js.Any
object OSType {
  val LINUX = "LINUX".asInstanceOf[OSType]
  val WINDOWS = "WINDOWS".asInstanceOf[OSType]

  @inline def values: js.Array[OSType] = js.Array(LINUX, WINDOWS)
}

@js.native
sealed trait OutputFormat extends js.Any
object OutputFormat {
  val Excel = "Excel".asInstanceOf[OutputFormat]
  val Json = "Json".asInstanceOf[OutputFormat]

  @inline def values: js.Array[OutputFormat] = js.Array(Excel, Json)
}

@js.native
sealed trait RecommendationReportStatus extends js.Any
object RecommendationReportStatus {
  val FAILED = "FAILED".asInstanceOf[RecommendationReportStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[RecommendationReportStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[RecommendationReportStatus]

  @inline def values: js.Array[RecommendationReportStatus] = js.Array(FAILED, IN_PROGRESS, SUCCESS)
}

@js.native
sealed trait ResourceSubType extends js.Any
object ResourceSubType {
  val Database = "Database".asInstanceOf[ResourceSubType]
  val Process = "Process".asInstanceOf[ResourceSubType]
  val DatabaseProcess = "DatabaseProcess".asInstanceOf[ResourceSubType]

  @inline def values: js.Array[ResourceSubType] = js.Array(Database, Process, DatabaseProcess)
}

@js.native
sealed trait RunTimeAssessmentStatus extends js.Any
object RunTimeAssessmentStatus {
  val dataCollectionTaskToBeScheduled = "dataCollectionTaskToBeScheduled".asInstanceOf[RunTimeAssessmentStatus]
  val dataCollectionTaskScheduled = "dataCollectionTaskScheduled".asInstanceOf[RunTimeAssessmentStatus]
  val dataCollectionTaskStarted = "dataCollectionTaskStarted".asInstanceOf[RunTimeAssessmentStatus]
  val dataCollectionTaskStopped = "dataCollectionTaskStopped".asInstanceOf[RunTimeAssessmentStatus]
  val dataCollectionTaskSuccess = "dataCollectionTaskSuccess".asInstanceOf[RunTimeAssessmentStatus]
  val dataCollectionTaskFailed = "dataCollectionTaskFailed".asInstanceOf[RunTimeAssessmentStatus]
  val dataCollectionTaskPartialSuccess = "dataCollectionTaskPartialSuccess".asInstanceOf[RunTimeAssessmentStatus]

  @inline def values: js.Array[RunTimeAssessmentStatus] = js.Array(
    dataCollectionTaskToBeScheduled,
    dataCollectionTaskScheduled,
    dataCollectionTaskStarted,
    dataCollectionTaskStopped,
    dataCollectionTaskSuccess,
    dataCollectionTaskFailed,
    dataCollectionTaskPartialSuccess
  )
}

@js.native
sealed trait SelfManageTargetDestination extends js.Any
object SelfManageTargetDestination {
  val `None specified` = "None specified".asInstanceOf[SelfManageTargetDestination]
  val `Amazon Elastic Cloud Compute (EC2)` = "Amazon Elastic Cloud Compute (EC2)".asInstanceOf[SelfManageTargetDestination]
  val `Amazon Elastic Container Service (ECS)` = "Amazon Elastic Container Service (ECS)".asInstanceOf[SelfManageTargetDestination]
  val `Amazon Elastic Kubernetes Service (EKS)` = "Amazon Elastic Kubernetes Service (EKS)".asInstanceOf[SelfManageTargetDestination]

  @inline def values: js.Array[SelfManageTargetDestination] = js.Array(`None specified`, `Amazon Elastic Cloud Compute (EC2)`, `Amazon Elastic Container Service (ECS)`, `Amazon Elastic Kubernetes Service (EKS)`)
}

@js.native
sealed trait ServerCriteria extends js.Any
object ServerCriteria {
  val NOT_DEFINED = "NOT_DEFINED".asInstanceOf[ServerCriteria]
  val OS_NAME = "OS_NAME".asInstanceOf[ServerCriteria]
  val STRATEGY = "STRATEGY".asInstanceOf[ServerCriteria]
  val DESTINATION = "DESTINATION".asInstanceOf[ServerCriteria]
  val SERVER_ID = "SERVER_ID".asInstanceOf[ServerCriteria]

  @inline def values: js.Array[ServerCriteria] = js.Array(NOT_DEFINED, OS_NAME, STRATEGY, DESTINATION, SERVER_ID)
}

@js.native
sealed trait ServerOsType extends js.Any
object ServerOsType {
  val WindowsServer = "WindowsServer".asInstanceOf[ServerOsType]
  val AmazonLinux = "AmazonLinux".asInstanceOf[ServerOsType]
  val EndOfSupportWindowsServer = "EndOfSupportWindowsServer".asInstanceOf[ServerOsType]
  val Redhat = "Redhat".asInstanceOf[ServerOsType]
  val Other = "Other".asInstanceOf[ServerOsType]

  @inline def values: js.Array[ServerOsType] = js.Array(WindowsServer, AmazonLinux, EndOfSupportWindowsServer, Redhat, Other)
}

@js.native
sealed trait Severity extends js.Any
object Severity {
  val HIGH = "HIGH".asInstanceOf[Severity]
  val MEDIUM = "MEDIUM".asInstanceOf[Severity]
  val LOW = "LOW".asInstanceOf[Severity]

  @inline def values: js.Array[Severity] = js.Array(HIGH, MEDIUM, LOW)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASC = "ASC".asInstanceOf[SortOrder]
  val DESC = "DESC".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASC, DESC)
}

@js.native
sealed trait SrcCodeOrDbAnalysisStatus extends js.Any
object SrcCodeOrDbAnalysisStatus {
  val ANALYSIS_TO_BE_SCHEDULED = "ANALYSIS_TO_BE_SCHEDULED".asInstanceOf[SrcCodeOrDbAnalysisStatus]
  val ANALYSIS_STARTED = "ANALYSIS_STARTED".asInstanceOf[SrcCodeOrDbAnalysisStatus]
  val ANALYSIS_SUCCESS = "ANALYSIS_SUCCESS".asInstanceOf[SrcCodeOrDbAnalysisStatus]
  val ANALYSIS_FAILED = "ANALYSIS_FAILED".asInstanceOf[SrcCodeOrDbAnalysisStatus]

  @inline def values: js.Array[SrcCodeOrDbAnalysisStatus] = js.Array(ANALYSIS_TO_BE_SCHEDULED, ANALYSIS_STARTED, ANALYSIS_SUCCESS, ANALYSIS_FAILED)
}

@js.native
sealed trait Strategy extends js.Any
object Strategy {
  val Rehost = "Rehost".asInstanceOf[Strategy]
  val Retirement = "Retirement".asInstanceOf[Strategy]
  val Refactor = "Refactor".asInstanceOf[Strategy]
  val Replatform = "Replatform".asInstanceOf[Strategy]
  val Retain = "Retain".asInstanceOf[Strategy]
  val Relocate = "Relocate".asInstanceOf[Strategy]
  val Repurchase = "Repurchase".asInstanceOf[Strategy]

  @inline def values: js.Array[Strategy] = js.Array(Rehost, Retirement, Refactor, Replatform, Retain, Relocate, Repurchase)
}

@js.native
sealed trait StrategyRecommendation extends js.Any
object StrategyRecommendation {
  val recommended = "recommended".asInstanceOf[StrategyRecommendation]
  val viableOption = "viableOption".asInstanceOf[StrategyRecommendation]
  val notRecommended = "notRecommended".asInstanceOf[StrategyRecommendation]

  @inline def values: js.Array[StrategyRecommendation] = js.Array(recommended, viableOption, notRecommended)
}

@js.native
sealed trait TargetDatabaseEngine extends js.Any
object TargetDatabaseEngine {
  val `None specified` = "None specified".asInstanceOf[TargetDatabaseEngine]
  val `Amazon Aurora` = "Amazon Aurora".asInstanceOf[TargetDatabaseEngine]
  val `AWS PostgreSQL` = "AWS PostgreSQL".asInstanceOf[TargetDatabaseEngine]
  val MySQL = "MySQL".asInstanceOf[TargetDatabaseEngine]
  val `Microsoft SQL Server` = "Microsoft SQL Server".asInstanceOf[TargetDatabaseEngine]
  val `Oracle Database` = "Oracle Database".asInstanceOf[TargetDatabaseEngine]
  val MariaDB = "MariaDB".asInstanceOf[TargetDatabaseEngine]
  val SAP = "SAP".asInstanceOf[TargetDatabaseEngine]
  val `Db2 LUW` = "Db2 LUW".asInstanceOf[TargetDatabaseEngine]
  val MongoDB = "MongoDB".asInstanceOf[TargetDatabaseEngine]

  @inline def values: js.Array[TargetDatabaseEngine] = js.Array(`None specified`, `Amazon Aurora`, `AWS PostgreSQL`, MySQL, `Microsoft SQL Server`, `Oracle Database`, MariaDB, SAP, `Db2 LUW`, MongoDB)
}

@js.native
sealed trait TargetDestination extends js.Any
object TargetDestination {
  val `None specified` = "None specified".asInstanceOf[TargetDestination]
  val `AWS Elastic BeanStalk` = "AWS Elastic BeanStalk".asInstanceOf[TargetDestination]
  val `AWS Fargate` = "AWS Fargate".asInstanceOf[TargetDestination]
  val `Amazon Elastic Cloud Compute (EC2)` = "Amazon Elastic Cloud Compute (EC2)".asInstanceOf[TargetDestination]
  val `Amazon Elastic Container Service (ECS)` = "Amazon Elastic Container Service (ECS)".asInstanceOf[TargetDestination]
  val `Amazon Elastic Kubernetes Service (EKS)` = "Amazon Elastic Kubernetes Service (EKS)".asInstanceOf[TargetDestination]
  val `Aurora MySQL` = "Aurora MySQL".asInstanceOf[TargetDestination]
  val `Aurora PostgreSQL` = "Aurora PostgreSQL".asInstanceOf[TargetDestination]
  val `Amazon Relational Database Service on MySQL` = "Amazon Relational Database Service on MySQL".asInstanceOf[TargetDestination]
  val `Amazon Relational Database Service on PostgreSQL` = "Amazon Relational Database Service on PostgreSQL".asInstanceOf[TargetDestination]
  val `Amazon DocumentDB` = "Amazon DocumentDB".asInstanceOf[TargetDestination]
  val `Amazon DynamoDB` = "Amazon DynamoDB".asInstanceOf[TargetDestination]
  val `Amazon Relational Database Service` = "Amazon Relational Database Service".asInstanceOf[TargetDestination]

  @inline def values: js.Array[TargetDestination] = js.Array(
    `None specified`,
    `AWS Elastic BeanStalk`,
    `AWS Fargate`,
    `Amazon Elastic Cloud Compute (EC2)`,
    `Amazon Elastic Container Service (ECS)`,
    `Amazon Elastic Kubernetes Service (EKS)`,
    `Aurora MySQL`,
    `Aurora PostgreSQL`,
    `Amazon Relational Database Service on MySQL`,
    `Amazon Relational Database Service on PostgreSQL`,
    `Amazon DocumentDB`,
    `Amazon DynamoDB`,
    `Amazon Relational Database Service`
  )
}

@js.native
sealed trait TransformationToolName extends js.Any
object TransformationToolName {
  val App2Container = "App2Container".asInstanceOf[TransformationToolName]
  val `Porting Assistant For .NET` = "Porting Assistant For .NET".asInstanceOf[TransformationToolName]
  val `End of Support Migration` = "End of Support Migration".asInstanceOf[TransformationToolName]
  val `Windows Web Application Migration Assistant` = "Windows Web Application Migration Assistant".asInstanceOf[TransformationToolName]
  val `Application Migration Service` = "Application Migration Service".asInstanceOf[TransformationToolName]
  val `Strategy Recommendation Support` = "Strategy Recommendation Support".asInstanceOf[TransformationToolName]
  val `In Place Operating System Upgrade` = "In Place Operating System Upgrade".asInstanceOf[TransformationToolName]
  val `Schema Conversion Tool` = "Schema Conversion Tool".asInstanceOf[TransformationToolName]
  val `Database Migration Service` = "Database Migration Service".asInstanceOf[TransformationToolName]
  val `Native SQL Server Backup/Restore` = "Native SQL Server Backup/Restore".asInstanceOf[TransformationToolName]

  @inline def values: js.Array[TransformationToolName] = js.Array(
    App2Container,
    `Porting Assistant For .NET`,
    `End of Support Migration`,
    `Windows Web Application Migration Assistant`,
    `Application Migration Service`,
    `Strategy Recommendation Support`,
    `In Place Operating System Upgrade`,
    `Schema Conversion Tool`,
    `Database Migration Service`,
    `Native SQL Server Backup/Restore`
  )
}

@js.native
sealed trait VersionControl extends js.Any
object VersionControl {
  val GITHUB = "GITHUB".asInstanceOf[VersionControl]
  val GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[VersionControl]

  @inline def values: js.Array[VersionControl] = js.Array(GITHUB, GITHUB_ENTERPRISE)
}
