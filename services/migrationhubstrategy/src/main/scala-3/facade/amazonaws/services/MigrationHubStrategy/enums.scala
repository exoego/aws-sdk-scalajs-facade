package facade.amazonaws.services.migrationhubstrategy

import scalajs.js

type AntipatternReportStatus = "FAILED" | "IN_PROGRESS" | "SUCCESS"
object AntipatternReportStatus {
  inline val FAILED: "FAILED" = "FAILED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"

  inline def values: js.Array[AntipatternReportStatus] = js.Array(FAILED, IN_PROGRESS, SUCCESS)
}

type AppType = "DotNetFramework" | "Java" | "SQLServer" | "IIS" | "Oracle" | "Other"
object AppType {
  inline val DotNetFramework: "DotNetFramework" = "DotNetFramework"
  inline val Java: "Java" = "Java"
  inline val SQLServer: "SQLServer" = "SQLServer"
  inline val IIS: "IIS" = "IIS"
  inline val Oracle: "Oracle" = "Oracle"
  inline val Other: "Other" = "Other"

  inline def values: js.Array[AppType] = js.Array(DotNetFramework, Java, SQLServer, IIS, Oracle, Other)
}

type ApplicationComponentCriteria = "NOT_DEFINED" | "APP_NAME" | "SERVER_ID" | "APP_TYPE" | "STRATEGY" | "DESTINATION"
object ApplicationComponentCriteria {
  inline val NOT_DEFINED: "NOT_DEFINED" = "NOT_DEFINED"
  inline val APP_NAME: "APP_NAME" = "APP_NAME"
  inline val SERVER_ID: "SERVER_ID" = "SERVER_ID"
  inline val APP_TYPE: "APP_TYPE" = "APP_TYPE"
  inline val STRATEGY: "STRATEGY" = "STRATEGY"
  inline val DESTINATION: "DESTINATION" = "DESTINATION"

  inline def values: js.Array[ApplicationComponentCriteria] = js.Array(NOT_DEFINED, APP_NAME, SERVER_ID, APP_TYPE, STRATEGY, DESTINATION)
}

type AssessmentStatus = "IN_PROGRESS" | "COMPLETE" | "FAILED" | "STOPPED"
object AssessmentStatus {
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[AssessmentStatus] = js.Array(IN_PROGRESS, COMPLETE, FAILED, STOPPED)
}

type AwsManagedTargetDestination = "None specified" | "AWS Elastic BeanStalk" | "AWS Fargate"
object AwsManagedTargetDestination {
  inline val `None specified`: "None specified" = "None specified"
  inline val `AWS Elastic BeanStalk`: "AWS Elastic BeanStalk" = "AWS Elastic BeanStalk"
  inline val `AWS Fargate`: "AWS Fargate" = "AWS Fargate"

  inline def values: js.Array[AwsManagedTargetDestination] = js.Array(`None specified`, `AWS Elastic BeanStalk`, `AWS Fargate`)
}

type CollectorHealth = "COLLECTOR_HEALTHY" | "COLLECTOR_UNHEALTHY"
object CollectorHealth {
  inline val COLLECTOR_HEALTHY: "COLLECTOR_HEALTHY" = "COLLECTOR_HEALTHY"
  inline val COLLECTOR_UNHEALTHY: "COLLECTOR_UNHEALTHY" = "COLLECTOR_UNHEALTHY"

  inline def values: js.Array[CollectorHealth] = js.Array(COLLECTOR_HEALTHY, COLLECTOR_UNHEALTHY)
}

type DataSourceType = "ApplicationDiscoveryService" | "MPA"
object DataSourceType {
  inline val ApplicationDiscoveryService: "ApplicationDiscoveryService" = "ApplicationDiscoveryService"
  inline val MPA: "MPA" = "MPA"

  inline def values: js.Array[DataSourceType] = js.Array(ApplicationDiscoveryService, MPA)
}

type DatabaseManagementPreference = "AWS-managed" | "Self-manage" | "No preference"
object DatabaseManagementPreference {
  inline val `AWS-managed`: "AWS-managed" = "AWS-managed"
  inline val `Self-manage`: "Self-manage" = "Self-manage"
  inline val `No preference`: "No preference" = "No preference"

  inline def values: js.Array[DatabaseManagementPreference] = js.Array(`AWS-managed`, `Self-manage`, `No preference`)
}

type GroupName = "ExternalId"
object GroupName {
  inline val ExternalId: "ExternalId" = "ExternalId"

  inline def values: js.Array[GroupName] = js.Array(ExternalId)
}

type HeterogeneousTargetDatabaseEngine = "None specified" | "Amazon Aurora" | "AWS PostgreSQL" | "MySQL" | "Microsoft SQL Server" | "Oracle Database" | "MariaDB" | "SAP" | "Db2 LUW" | "MongoDB"
object HeterogeneousTargetDatabaseEngine {
  inline val `None specified`: "None specified" = "None specified"
  inline val `Amazon Aurora`: "Amazon Aurora" = "Amazon Aurora"
  inline val `AWS PostgreSQL`: "AWS PostgreSQL" = "AWS PostgreSQL"
  inline val MySQL: "MySQL" = "MySQL"
  inline val `Microsoft SQL Server`: "Microsoft SQL Server" = "Microsoft SQL Server"
  inline val `Oracle Database`: "Oracle Database" = "Oracle Database"
  inline val MariaDB: "MariaDB" = "MariaDB"
  inline val SAP: "SAP" = "SAP"
  inline val `Db2 LUW`: "Db2 LUW" = "Db2 LUW"
  inline val MongoDB: "MongoDB" = "MongoDB"

  inline def values: js.Array[HeterogeneousTargetDatabaseEngine] = js.Array(`None specified`, `Amazon Aurora`, `AWS PostgreSQL`, MySQL, `Microsoft SQL Server`, `Oracle Database`, MariaDB, SAP, `Db2 LUW`, MongoDB)
}

type HomogeneousTargetDatabaseEngine = "None specified"
object HomogeneousTargetDatabaseEngine {
  inline val `None specified`: "None specified" = "None specified"

  inline def values: js.Array[HomogeneousTargetDatabaseEngine] = js.Array(`None specified`)
}

type ImportFileTaskStatus = "ImportInProgress" | "ImportFailed" | "ImportPartialSuccess" | "ImportSuccess" | "DeleteInProgress" | "DeleteFailed" | "DeletePartialSuccess" | "DeleteSuccess"
object ImportFileTaskStatus {
  inline val ImportInProgress: "ImportInProgress" = "ImportInProgress"
  inline val ImportFailed: "ImportFailed" = "ImportFailed"
  inline val ImportPartialSuccess: "ImportPartialSuccess" = "ImportPartialSuccess"
  inline val ImportSuccess: "ImportSuccess" = "ImportSuccess"
  inline val DeleteInProgress: "DeleteInProgress" = "DeleteInProgress"
  inline val DeleteFailed: "DeleteFailed" = "DeleteFailed"
  inline val DeletePartialSuccess: "DeletePartialSuccess" = "DeletePartialSuccess"
  inline val DeleteSuccess: "DeleteSuccess" = "DeleteSuccess"

  inline def values: js.Array[ImportFileTaskStatus] = js.Array(ImportInProgress, ImportFailed, ImportPartialSuccess, ImportSuccess, DeleteInProgress, DeleteFailed, DeletePartialSuccess, DeleteSuccess)
}

type InclusionStatus = "excludeFromAssessment" | "includeInAssessment"
object InclusionStatus {
  inline val excludeFromAssessment: "excludeFromAssessment" = "excludeFromAssessment"
  inline val includeInAssessment: "includeInAssessment" = "includeInAssessment"

  inline def values: js.Array[InclusionStatus] = js.Array(excludeFromAssessment, includeInAssessment)
}

type NoPreferenceTargetDestination = "None specified" | "AWS Elastic BeanStalk" | "AWS Fargate" | "Amazon Elastic Cloud Compute (EC2)" | "Amazon Elastic Container Service (ECS)" | "Amazon Elastic Kubernetes Service (EKS)"
object NoPreferenceTargetDestination {
  inline val `None specified`: "None specified" = "None specified"
  inline val `AWS Elastic BeanStalk`: "AWS Elastic BeanStalk" = "AWS Elastic BeanStalk"
  inline val `AWS Fargate`: "AWS Fargate" = "AWS Fargate"
  inline val `Amazon Elastic Cloud Compute (EC2)` : "Amazon Elastic Cloud Compute (EC2)" = "Amazon Elastic Cloud Compute (EC2)"
  inline val `Amazon Elastic Container Service (ECS)` : "Amazon Elastic Container Service (ECS)" = "Amazon Elastic Container Service (ECS)"
  inline val `Amazon Elastic Kubernetes Service (EKS)` : "Amazon Elastic Kubernetes Service (EKS)" = "Amazon Elastic Kubernetes Service (EKS)"

  inline def values: js.Array[NoPreferenceTargetDestination] = js.Array(
    `None specified`,
    `AWS Elastic BeanStalk`,
    `AWS Fargate`,
    `Amazon Elastic Cloud Compute (EC2)`,
    `Amazon Elastic Container Service (ECS)`,
    `Amazon Elastic Kubernetes Service (EKS)`
  )
}

type OSType = "LINUX" | "WINDOWS"
object OSType {
  inline val LINUX: "LINUX" = "LINUX"
  inline val WINDOWS: "WINDOWS" = "WINDOWS"

  inline def values: js.Array[OSType] = js.Array(LINUX, WINDOWS)
}

type OutputFormat = "Excel" | "Json"
object OutputFormat {
  inline val Excel: "Excel" = "Excel"
  inline val Json: "Json" = "Json"

  inline def values: js.Array[OutputFormat] = js.Array(Excel, Json)
}

type RecommendationReportStatus = "FAILED" | "IN_PROGRESS" | "SUCCESS"
object RecommendationReportStatus {
  inline val FAILED: "FAILED" = "FAILED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"

  inline def values: js.Array[RecommendationReportStatus] = js.Array(FAILED, IN_PROGRESS, SUCCESS)
}

type ResourceSubType = "Database" | "Process" | "DatabaseProcess"
object ResourceSubType {
  inline val Database: "Database" = "Database"
  inline val Process: "Process" = "Process"
  inline val DatabaseProcess: "DatabaseProcess" = "DatabaseProcess"

  inline def values: js.Array[ResourceSubType] = js.Array(Database, Process, DatabaseProcess)
}

type RunTimeAssessmentStatus = "dataCollectionTaskToBeScheduled" | "dataCollectionTaskScheduled" | "dataCollectionTaskStarted" | "dataCollectionTaskStopped" | "dataCollectionTaskSuccess" | "dataCollectionTaskFailed" | "dataCollectionTaskPartialSuccess"
object RunTimeAssessmentStatus {
  inline val dataCollectionTaskToBeScheduled: "dataCollectionTaskToBeScheduled" = "dataCollectionTaskToBeScheduled"
  inline val dataCollectionTaskScheduled: "dataCollectionTaskScheduled" = "dataCollectionTaskScheduled"
  inline val dataCollectionTaskStarted: "dataCollectionTaskStarted" = "dataCollectionTaskStarted"
  inline val dataCollectionTaskStopped: "dataCollectionTaskStopped" = "dataCollectionTaskStopped"
  inline val dataCollectionTaskSuccess: "dataCollectionTaskSuccess" = "dataCollectionTaskSuccess"
  inline val dataCollectionTaskFailed: "dataCollectionTaskFailed" = "dataCollectionTaskFailed"
  inline val dataCollectionTaskPartialSuccess: "dataCollectionTaskPartialSuccess" = "dataCollectionTaskPartialSuccess"

  inline def values: js.Array[RunTimeAssessmentStatus] = js.Array(
    dataCollectionTaskToBeScheduled,
    dataCollectionTaskScheduled,
    dataCollectionTaskStarted,
    dataCollectionTaskStopped,
    dataCollectionTaskSuccess,
    dataCollectionTaskFailed,
    dataCollectionTaskPartialSuccess
  )
}

type SelfManageTargetDestination = "None specified" | "Amazon Elastic Cloud Compute (EC2)" | "Amazon Elastic Container Service (ECS)" | "Amazon Elastic Kubernetes Service (EKS)"
object SelfManageTargetDestination {
  inline val `None specified`: "None specified" = "None specified"
  inline val `Amazon Elastic Cloud Compute (EC2)` : "Amazon Elastic Cloud Compute (EC2)" = "Amazon Elastic Cloud Compute (EC2)"
  inline val `Amazon Elastic Container Service (ECS)` : "Amazon Elastic Container Service (ECS)" = "Amazon Elastic Container Service (ECS)"
  inline val `Amazon Elastic Kubernetes Service (EKS)` : "Amazon Elastic Kubernetes Service (EKS)" = "Amazon Elastic Kubernetes Service (EKS)"

  inline def values: js.Array[SelfManageTargetDestination] = js.Array(`None specified`, `Amazon Elastic Cloud Compute (EC2)`, `Amazon Elastic Container Service (ECS)`, `Amazon Elastic Kubernetes Service (EKS)`)
}

type ServerCriteria = "NOT_DEFINED" | "OS_NAME" | "STRATEGY" | "DESTINATION" | "SERVER_ID"
object ServerCriteria {
  inline val NOT_DEFINED: "NOT_DEFINED" = "NOT_DEFINED"
  inline val OS_NAME: "OS_NAME" = "OS_NAME"
  inline val STRATEGY: "STRATEGY" = "STRATEGY"
  inline val DESTINATION: "DESTINATION" = "DESTINATION"
  inline val SERVER_ID: "SERVER_ID" = "SERVER_ID"

  inline def values: js.Array[ServerCriteria] = js.Array(NOT_DEFINED, OS_NAME, STRATEGY, DESTINATION, SERVER_ID)
}

type ServerOsType = "WindowsServer" | "AmazonLinux" | "EndOfSupportWindowsServer" | "Redhat" | "Other"
object ServerOsType {
  inline val WindowsServer: "WindowsServer" = "WindowsServer"
  inline val AmazonLinux: "AmazonLinux" = "AmazonLinux"
  inline val EndOfSupportWindowsServer: "EndOfSupportWindowsServer" = "EndOfSupportWindowsServer"
  inline val Redhat: "Redhat" = "Redhat"
  inline val Other: "Other" = "Other"

  inline def values: js.Array[ServerOsType] = js.Array(WindowsServer, AmazonLinux, EndOfSupportWindowsServer, Redhat, Other)
}

type Severity = "HIGH" | "MEDIUM" | "LOW"
object Severity {
  inline val HIGH: "HIGH" = "HIGH"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val LOW: "LOW" = "LOW"

  inline def values: js.Array[Severity] = js.Array(HIGH, MEDIUM, LOW)
}

type SortOrder = "ASC" | "DESC"
object SortOrder {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[SortOrder] = js.Array(ASC, DESC)
}

type SrcCodeOrDbAnalysisStatus = "ANALYSIS_TO_BE_SCHEDULED" | "ANALYSIS_STARTED" | "ANALYSIS_SUCCESS" | "ANALYSIS_FAILED"
object SrcCodeOrDbAnalysisStatus {
  inline val ANALYSIS_TO_BE_SCHEDULED: "ANALYSIS_TO_BE_SCHEDULED" = "ANALYSIS_TO_BE_SCHEDULED"
  inline val ANALYSIS_STARTED: "ANALYSIS_STARTED" = "ANALYSIS_STARTED"
  inline val ANALYSIS_SUCCESS: "ANALYSIS_SUCCESS" = "ANALYSIS_SUCCESS"
  inline val ANALYSIS_FAILED: "ANALYSIS_FAILED" = "ANALYSIS_FAILED"

  inline def values: js.Array[SrcCodeOrDbAnalysisStatus] = js.Array(ANALYSIS_TO_BE_SCHEDULED, ANALYSIS_STARTED, ANALYSIS_SUCCESS, ANALYSIS_FAILED)
}

type Strategy = "Rehost" | "Retirement" | "Refactor" | "Replatform" | "Retain" | "Relocate" | "Repurchase"
object Strategy {
  inline val Rehost: "Rehost" = "Rehost"
  inline val Retirement: "Retirement" = "Retirement"
  inline val Refactor: "Refactor" = "Refactor"
  inline val Replatform: "Replatform" = "Replatform"
  inline val Retain: "Retain" = "Retain"
  inline val Relocate: "Relocate" = "Relocate"
  inline val Repurchase: "Repurchase" = "Repurchase"

  inline def values: js.Array[Strategy] = js.Array(Rehost, Retirement, Refactor, Replatform, Retain, Relocate, Repurchase)
}

type StrategyRecommendation = "recommended" | "viableOption" | "notRecommended"
object StrategyRecommendation {
  inline val recommended: "recommended" = "recommended"
  inline val viableOption: "viableOption" = "viableOption"
  inline val notRecommended: "notRecommended" = "notRecommended"

  inline def values: js.Array[StrategyRecommendation] = js.Array(recommended, viableOption, notRecommended)
}

type TargetDatabaseEngine = "None specified" | "Amazon Aurora" | "AWS PostgreSQL" | "MySQL" | "Microsoft SQL Server" | "Oracle Database" | "MariaDB" | "SAP" | "Db2 LUW" | "MongoDB"
object TargetDatabaseEngine {
  inline val `None specified`: "None specified" = "None specified"
  inline val `Amazon Aurora`: "Amazon Aurora" = "Amazon Aurora"
  inline val `AWS PostgreSQL`: "AWS PostgreSQL" = "AWS PostgreSQL"
  inline val MySQL: "MySQL" = "MySQL"
  inline val `Microsoft SQL Server`: "Microsoft SQL Server" = "Microsoft SQL Server"
  inline val `Oracle Database`: "Oracle Database" = "Oracle Database"
  inline val MariaDB: "MariaDB" = "MariaDB"
  inline val SAP: "SAP" = "SAP"
  inline val `Db2 LUW`: "Db2 LUW" = "Db2 LUW"
  inline val MongoDB: "MongoDB" = "MongoDB"

  inline def values: js.Array[TargetDatabaseEngine] = js.Array(`None specified`, `Amazon Aurora`, `AWS PostgreSQL`, MySQL, `Microsoft SQL Server`, `Oracle Database`, MariaDB, SAP, `Db2 LUW`, MongoDB)
}

type TargetDestination = "None specified" | "AWS Elastic BeanStalk" | "AWS Fargate" | "Amazon Elastic Cloud Compute (EC2)" | "Amazon Elastic Container Service (ECS)" | "Amazon Elastic Kubernetes Service (EKS)" | "Aurora MySQL" | "Aurora PostgreSQL" | "Amazon Relational Database Service on MySQL" | "Amazon Relational Database Service on PostgreSQL" | "Amazon DocumentDB" | "Amazon DynamoDB" | "Amazon Relational Database Service"
object TargetDestination {
  inline val `None specified`: "None specified" = "None specified"
  inline val `AWS Elastic BeanStalk`: "AWS Elastic BeanStalk" = "AWS Elastic BeanStalk"
  inline val `AWS Fargate`: "AWS Fargate" = "AWS Fargate"
  inline val `Amazon Elastic Cloud Compute (EC2)` : "Amazon Elastic Cloud Compute (EC2)" = "Amazon Elastic Cloud Compute (EC2)"
  inline val `Amazon Elastic Container Service (ECS)` : "Amazon Elastic Container Service (ECS)" = "Amazon Elastic Container Service (ECS)"
  inline val `Amazon Elastic Kubernetes Service (EKS)` : "Amazon Elastic Kubernetes Service (EKS)" = "Amazon Elastic Kubernetes Service (EKS)"
  inline val `Aurora MySQL`: "Aurora MySQL" = "Aurora MySQL"
  inline val `Aurora PostgreSQL`: "Aurora PostgreSQL" = "Aurora PostgreSQL"
  inline val `Amazon Relational Database Service on MySQL`: "Amazon Relational Database Service on MySQL" = "Amazon Relational Database Service on MySQL"
  inline val `Amazon Relational Database Service on PostgreSQL`: "Amazon Relational Database Service on PostgreSQL" = "Amazon Relational Database Service on PostgreSQL"
  inline val `Amazon DocumentDB`: "Amazon DocumentDB" = "Amazon DocumentDB"
  inline val `Amazon DynamoDB`: "Amazon DynamoDB" = "Amazon DynamoDB"
  inline val `Amazon Relational Database Service`: "Amazon Relational Database Service" = "Amazon Relational Database Service"

  inline def values: js.Array[TargetDestination] = js.Array(
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

type TransformationToolName = "App2Container" | "Porting Assistant For .NET" | "End of Support Migration" | "Windows Web Application Migration Assistant" | "Application Migration Service" | "Strategy Recommendation Support" | "In Place Operating System Upgrade" | "Schema Conversion Tool" | "Database Migration Service" | "Native SQL Server Backup/Restore"
object TransformationToolName {
  inline val App2Container: "App2Container" = "App2Container"
  inline val `Porting Assistant For .NET`: "Porting Assistant For .NET" = "Porting Assistant For .NET"
  inline val `End of Support Migration`: "End of Support Migration" = "End of Support Migration"
  inline val `Windows Web Application Migration Assistant`: "Windows Web Application Migration Assistant" = "Windows Web Application Migration Assistant"
  inline val `Application Migration Service`: "Application Migration Service" = "Application Migration Service"
  inline val `Strategy Recommendation Support`: "Strategy Recommendation Support" = "Strategy Recommendation Support"
  inline val `In Place Operating System Upgrade`: "In Place Operating System Upgrade" = "In Place Operating System Upgrade"
  inline val `Schema Conversion Tool`: "Schema Conversion Tool" = "Schema Conversion Tool"
  inline val `Database Migration Service`: "Database Migration Service" = "Database Migration Service"
  inline val `Native SQL Server Backup/Restore`: "Native SQL Server Backup/Restore" = "Native SQL Server Backup/Restore"

  inline def values: js.Array[TransformationToolName] = js.Array(
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

type VersionControl = "GITHUB" | "GITHUB_ENTERPRISE"
object VersionControl {
  inline val GITHUB: "GITHUB" = "GITHUB"
  inline val GITHUB_ENTERPRISE: "GITHUB_ENTERPRISE" = "GITHUB_ENTERPRISE"

  inline def values: js.Array[VersionControl] = js.Array(GITHUB, GITHUB_ENTERPRISE)
}
