package facade.amazonaws.services.codebuild

import scalajs._

type ArtifactNamespace = "NONE" | "BUILD_ID"
object ArtifactNamespace {
  inline val NONE: "NONE" = "NONE"
  inline val BUILD_ID: "BUILD_ID" = "BUILD_ID"

  inline def values: js.Array[ArtifactNamespace] = js.Array(NONE, BUILD_ID)
}

type ArtifactPackaging = "NONE" | "ZIP"
object ArtifactPackaging {
  inline val NONE: "NONE" = "NONE"
  inline val ZIP: "ZIP" = "ZIP"

  inline def values: js.Array[ArtifactPackaging] = js.Array(NONE, ZIP)
}

type ArtifactsType = "CODEPIPELINE" | "S3" | "NO_ARTIFACTS"
object ArtifactsType {
  inline val CODEPIPELINE: "CODEPIPELINE" = "CODEPIPELINE"
  inline val S3: "S3" = "S3"
  inline val NO_ARTIFACTS: "NO_ARTIFACTS" = "NO_ARTIFACTS"

  inline def values: js.Array[ArtifactsType] = js.Array(CODEPIPELINE, S3, NO_ARTIFACTS)
}

type AuthType = "OAUTH" | "BASIC_AUTH" | "PERSONAL_ACCESS_TOKEN"
object AuthType {
  inline val OAUTH: "OAUTH" = "OAUTH"
  inline val BASIC_AUTH: "BASIC_AUTH" = "BASIC_AUTH"
  inline val PERSONAL_ACCESS_TOKEN: "PERSONAL_ACCESS_TOKEN" = "PERSONAL_ACCESS_TOKEN"

  inline def values: js.Array[AuthType] = js.Array(OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN)
}

/** Specifies the access for objects that are uploaded to an Amazon S3 bucket that is owned by another account. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. <dl> <dt>NONE</dt> <dd> The bucket owner does not have access to the objects. This is the default. </dd> <dt>READ_ONLY</dt> <dd> The bucket owner has read only access to the objects. The uploading account retains ownership of the objects. </dd> <dt>FULL</dt> <dd> The bucket owner has full access to the objects. Object ownership is determined by the following criteria: * If the bucket is configured with the ```Bucket owner preferred``` setting, the bucket owner owns the objects. The uploading account will have object access as specified by the bucket's policy. * Otherwise, the uploading account retains ownership of the objects. For more information about Amazon S3 object ownership, see
  * [[https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html|Controlling ownership of uploaded objects using S3 Object Ownership]] in the <i>Amazon Simple Storage Service User Guide</i>. </dd> </dl>
  */
type BucketOwnerAccess = "NONE" | "READ_ONLY" | "FULL"
object BucketOwnerAccess {
  inline val NONE: "NONE" = "NONE"
  inline val READ_ONLY: "READ_ONLY" = "READ_ONLY"
  inline val FULL: "FULL" = "FULL"

  inline def values: js.Array[BucketOwnerAccess] = js.Array(NONE, READ_ONLY, FULL)
}

type BuildBatchPhaseType = "SUBMITTED" | "DOWNLOAD_BATCHSPEC" | "IN_PROGRESS" | "COMBINE_ARTIFACTS" | "SUCCEEDED" | "FAILED" | "STOPPED"
object BuildBatchPhaseType {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val DOWNLOAD_BATCHSPEC: "DOWNLOAD_BATCHSPEC" = "DOWNLOAD_BATCHSPEC"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMBINE_ARTIFACTS: "COMBINE_ARTIFACTS" = "COMBINE_ARTIFACTS"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[BuildBatchPhaseType] = js.Array(SUBMITTED, DOWNLOAD_BATCHSPEC, IN_PROGRESS, COMBINE_ARTIFACTS, SUCCEEDED, FAILED, STOPPED)
}

type BuildPhaseType = "SUBMITTED" | "QUEUED" | "PROVISIONING" | "DOWNLOAD_SOURCE" | "INSTALL" | "PRE_BUILD" | "BUILD" | "POST_BUILD" | "UPLOAD_ARTIFACTS" | "FINALIZING" | "COMPLETED"
object BuildPhaseType {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val QUEUED: "QUEUED" = "QUEUED"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val DOWNLOAD_SOURCE: "DOWNLOAD_SOURCE" = "DOWNLOAD_SOURCE"
  inline val INSTALL: "INSTALL" = "INSTALL"
  inline val PRE_BUILD: "PRE_BUILD" = "PRE_BUILD"
  inline val BUILD: "BUILD" = "BUILD"
  inline val POST_BUILD: "POST_BUILD" = "POST_BUILD"
  inline val UPLOAD_ARTIFACTS: "UPLOAD_ARTIFACTS" = "UPLOAD_ARTIFACTS"
  inline val FINALIZING: "FINALIZING" = "FINALIZING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"

  inline def values: js.Array[BuildPhaseType] = js.Array(SUBMITTED, QUEUED, PROVISIONING, DOWNLOAD_SOURCE, INSTALL, PRE_BUILD, BUILD, POST_BUILD, UPLOAD_ARTIFACTS, FINALIZING, COMPLETED)
}

type CacheMode = "LOCAL_DOCKER_LAYER_CACHE" | "LOCAL_SOURCE_CACHE" | "LOCAL_CUSTOM_CACHE"
object CacheMode {
  inline val LOCAL_DOCKER_LAYER_CACHE: "LOCAL_DOCKER_LAYER_CACHE" = "LOCAL_DOCKER_LAYER_CACHE"
  inline val LOCAL_SOURCE_CACHE: "LOCAL_SOURCE_CACHE" = "LOCAL_SOURCE_CACHE"
  inline val LOCAL_CUSTOM_CACHE: "LOCAL_CUSTOM_CACHE" = "LOCAL_CUSTOM_CACHE"

  inline def values: js.Array[CacheMode] = js.Array(LOCAL_DOCKER_LAYER_CACHE, LOCAL_SOURCE_CACHE, LOCAL_CUSTOM_CACHE)
}

type CacheType = "NO_CACHE" | "S3" | "LOCAL"
object CacheType {
  inline val NO_CACHE: "NO_CACHE" = "NO_CACHE"
  inline val S3: "S3" = "S3"
  inline val LOCAL: "LOCAL" = "LOCAL"

  inline def values: js.Array[CacheType] = js.Array(NO_CACHE, S3, LOCAL)
}

type ComputeType = "BUILD_GENERAL1_SMALL" | "BUILD_GENERAL1_MEDIUM" | "BUILD_GENERAL1_LARGE" | "BUILD_GENERAL1_2XLARGE"
object ComputeType {
  inline val BUILD_GENERAL1_SMALL: "BUILD_GENERAL1_SMALL" = "BUILD_GENERAL1_SMALL"
  inline val BUILD_GENERAL1_MEDIUM: "BUILD_GENERAL1_MEDIUM" = "BUILD_GENERAL1_MEDIUM"
  inline val BUILD_GENERAL1_LARGE: "BUILD_GENERAL1_LARGE" = "BUILD_GENERAL1_LARGE"
  inline val BUILD_GENERAL1_2XLARGE: "BUILD_GENERAL1_2XLARGE" = "BUILD_GENERAL1_2XLARGE"

  inline def values: js.Array[ComputeType] = js.Array(BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM, BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE)
}

type CredentialProviderType = "SECRETS_MANAGER"
object CredentialProviderType {
  inline val SECRETS_MANAGER: "SECRETS_MANAGER" = "SECRETS_MANAGER"

  inline def values: js.Array[CredentialProviderType] = js.Array(SECRETS_MANAGER)
}

type EnvironmentType = "WINDOWS_CONTAINER" | "LINUX_CONTAINER" | "LINUX_GPU_CONTAINER" | "ARM_CONTAINER" | "WINDOWS_SERVER_2019_CONTAINER"
object EnvironmentType {
  inline val WINDOWS_CONTAINER: "WINDOWS_CONTAINER" = "WINDOWS_CONTAINER"
  inline val LINUX_CONTAINER: "LINUX_CONTAINER" = "LINUX_CONTAINER"
  inline val LINUX_GPU_CONTAINER: "LINUX_GPU_CONTAINER" = "LINUX_GPU_CONTAINER"
  inline val ARM_CONTAINER: "ARM_CONTAINER" = "ARM_CONTAINER"
  inline val WINDOWS_SERVER_2019_CONTAINER: "WINDOWS_SERVER_2019_CONTAINER" = "WINDOWS_SERVER_2019_CONTAINER"

  inline def values: js.Array[EnvironmentType] = js.Array(WINDOWS_CONTAINER, LINUX_CONTAINER, LINUX_GPU_CONTAINER, ARM_CONTAINER, WINDOWS_SERVER_2019_CONTAINER)
}

type EnvironmentVariableType = "PLAINTEXT" | "PARAMETER_STORE" | "SECRETS_MANAGER"
object EnvironmentVariableType {
  inline val PLAINTEXT: "PLAINTEXT" = "PLAINTEXT"
  inline val PARAMETER_STORE: "PARAMETER_STORE" = "PARAMETER_STORE"
  inline val SECRETS_MANAGER: "SECRETS_MANAGER" = "SECRETS_MANAGER"

  inline def values: js.Array[EnvironmentVariableType] = js.Array(PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER)
}

type FileSystemType = "EFS"
object FileSystemType {
  inline val EFS: "EFS" = "EFS"

  inline def values: js.Array[FileSystemType] = js.Array(EFS)
}

type ImagePullCredentialsType = "CODEBUILD" | "SERVICE_ROLE"
object ImagePullCredentialsType {
  inline val CODEBUILD: "CODEBUILD" = "CODEBUILD"
  inline val SERVICE_ROLE: "SERVICE_ROLE" = "SERVICE_ROLE"

  inline def values: js.Array[ImagePullCredentialsType] = js.Array(CODEBUILD, SERVICE_ROLE)
}

type LanguageType = "JAVA" | "PYTHON" | "NODE_JS" | "RUBY" | "GOLANG" | "DOCKER" | "ANDROID" | "DOTNET" | "BASE" | "PHP"
object LanguageType {
  inline val JAVA: "JAVA" = "JAVA"
  inline val PYTHON: "PYTHON" = "PYTHON"
  inline val NODE_JS: "NODE_JS" = "NODE_JS"
  inline val RUBY: "RUBY" = "RUBY"
  inline val GOLANG: "GOLANG" = "GOLANG"
  inline val DOCKER: "DOCKER" = "DOCKER"
  inline val ANDROID: "ANDROID" = "ANDROID"
  inline val DOTNET: "DOTNET" = "DOTNET"
  inline val BASE: "BASE" = "BASE"
  inline val PHP: "PHP" = "PHP"

  inline def values: js.Array[LanguageType] = js.Array(JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER, ANDROID, DOTNET, BASE, PHP)
}

type LogsConfigStatusType = "ENABLED" | "DISABLED"
object LogsConfigStatusType {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"

  inline def values: js.Array[LogsConfigStatusType] = js.Array(ENABLED, DISABLED)
}

type PlatformType = "DEBIAN" | "AMAZON_LINUX" | "UBUNTU" | "WINDOWS_SERVER"
object PlatformType {
  inline val DEBIAN: "DEBIAN" = "DEBIAN"
  inline val AMAZON_LINUX: "AMAZON_LINUX" = "AMAZON_LINUX"
  inline val UBUNTU: "UBUNTU" = "UBUNTU"
  inline val WINDOWS_SERVER: "WINDOWS_SERVER" = "WINDOWS_SERVER"

  inline def values: js.Array[PlatformType] = js.Array(DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER)
}

type ProjectSortByType = "NAME" | "CREATED_TIME" | "LAST_MODIFIED_TIME"
object ProjectSortByType {
  inline val NAME: "NAME" = "NAME"
  inline val CREATED_TIME: "CREATED_TIME" = "CREATED_TIME"
  inline val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"

  inline def values: js.Array[ProjectSortByType] = js.Array(NAME, CREATED_TIME, LAST_MODIFIED_TIME)
}

type ReportCodeCoverageSortByType = "LINE_COVERAGE_PERCENTAGE" | "FILE_PATH"
object ReportCodeCoverageSortByType {
  inline val LINE_COVERAGE_PERCENTAGE: "LINE_COVERAGE_PERCENTAGE" = "LINE_COVERAGE_PERCENTAGE"
  inline val FILE_PATH: "FILE_PATH" = "FILE_PATH"

  inline def values: js.Array[ReportCodeCoverageSortByType] = js.Array(LINE_COVERAGE_PERCENTAGE, FILE_PATH)
}

type ReportExportConfigType = "S3" | "NO_EXPORT"
object ReportExportConfigType {
  inline val S3: "S3" = "S3"
  inline val NO_EXPORT: "NO_EXPORT" = "NO_EXPORT"

  inline def values: js.Array[ReportExportConfigType] = js.Array(S3, NO_EXPORT)
}

type ReportGroupSortByType = "NAME" | "CREATED_TIME" | "LAST_MODIFIED_TIME"
object ReportGroupSortByType {
  inline val NAME: "NAME" = "NAME"
  inline val CREATED_TIME: "CREATED_TIME" = "CREATED_TIME"
  inline val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"

  inline def values: js.Array[ReportGroupSortByType] = js.Array(NAME, CREATED_TIME, LAST_MODIFIED_TIME)
}

type ReportGroupStatusType = "ACTIVE" | "DELETING"
object ReportGroupStatusType {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ReportGroupStatusType] = js.Array(ACTIVE, DELETING)
}

type ReportGroupTrendFieldType = "PASS_RATE" | "DURATION" | "TOTAL" | "LINE_COVERAGE" | "LINES_COVERED" | "LINES_MISSED" | "BRANCH_COVERAGE" | "BRANCHES_COVERED" | "BRANCHES_MISSED"
object ReportGroupTrendFieldType {
  inline val PASS_RATE: "PASS_RATE" = "PASS_RATE"
  inline val DURATION: "DURATION" = "DURATION"
  inline val TOTAL: "TOTAL" = "TOTAL"
  inline val LINE_COVERAGE: "LINE_COVERAGE" = "LINE_COVERAGE"
  inline val LINES_COVERED: "LINES_COVERED" = "LINES_COVERED"
  inline val LINES_MISSED: "LINES_MISSED" = "LINES_MISSED"
  inline val BRANCH_COVERAGE: "BRANCH_COVERAGE" = "BRANCH_COVERAGE"
  inline val BRANCHES_COVERED: "BRANCHES_COVERED" = "BRANCHES_COVERED"
  inline val BRANCHES_MISSED: "BRANCHES_MISSED" = "BRANCHES_MISSED"

  inline def values: js.Array[ReportGroupTrendFieldType] = js.Array(PASS_RATE, DURATION, TOTAL, LINE_COVERAGE, LINES_COVERED, LINES_MISSED, BRANCH_COVERAGE, BRANCHES_COVERED, BRANCHES_MISSED)
}

type ReportPackagingType = "ZIP" | "NONE"
object ReportPackagingType {
  inline val ZIP: "ZIP" = "ZIP"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ReportPackagingType] = js.Array(ZIP, NONE)
}

type ReportStatusType = "GENERATING" | "SUCCEEDED" | "FAILED" | "INCOMPLETE" | "DELETING"
object ReportStatusType {
  inline val GENERATING: "GENERATING" = "GENERATING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val INCOMPLETE: "INCOMPLETE" = "INCOMPLETE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ReportStatusType] = js.Array(GENERATING, SUCCEEDED, FAILED, INCOMPLETE, DELETING)
}

type ReportType = "TEST" | "CODE_COVERAGE"
object ReportType {
  inline val TEST: "TEST" = "TEST"
  inline val CODE_COVERAGE: "CODE_COVERAGE" = "CODE_COVERAGE"

  inline def values: js.Array[ReportType] = js.Array(TEST, CODE_COVERAGE)
}

type RetryBuildBatchType = "RETRY_ALL_BUILDS" | "RETRY_FAILED_BUILDS"
object RetryBuildBatchType {
  inline val RETRY_ALL_BUILDS: "RETRY_ALL_BUILDS" = "RETRY_ALL_BUILDS"
  inline val RETRY_FAILED_BUILDS: "RETRY_FAILED_BUILDS" = "RETRY_FAILED_BUILDS"

  inline def values: js.Array[RetryBuildBatchType] = js.Array(RETRY_ALL_BUILDS, RETRY_FAILED_BUILDS)
}

type ServerType = "GITHUB" | "BITBUCKET" | "GITHUB_ENTERPRISE"
object ServerType {
  inline val GITHUB: "GITHUB" = "GITHUB"
  inline val BITBUCKET: "BITBUCKET" = "BITBUCKET"
  inline val GITHUB_ENTERPRISE: "GITHUB_ENTERPRISE" = "GITHUB_ENTERPRISE"

  inline def values: js.Array[ServerType] = js.Array(GITHUB, BITBUCKET, GITHUB_ENTERPRISE)
}

type SharedResourceSortByType = "ARN" | "MODIFIED_TIME"
object SharedResourceSortByType {
  inline val ARN: "ARN" = "ARN"
  inline val MODIFIED_TIME: "MODIFIED_TIME" = "MODIFIED_TIME"

  inline def values: js.Array[SharedResourceSortByType] = js.Array(ARN, MODIFIED_TIME)
}

type SortOrderType = "ASCENDING" | "DESCENDING"
object SortOrderType {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrderType] = js.Array(ASCENDING, DESCENDING)
}

type SourceAuthType = "OAUTH"
object SourceAuthType {
  inline val OAUTH: "OAUTH" = "OAUTH"

  inline def values: js.Array[SourceAuthType] = js.Array(OAUTH)
}

type SourceType = "CODECOMMIT" | "CODEPIPELINE" | "GITHUB" | "S3" | "BITBUCKET" | "GITHUB_ENTERPRISE" | "NO_SOURCE"
object SourceType {
  inline val CODECOMMIT: "CODECOMMIT" = "CODECOMMIT"
  inline val CODEPIPELINE: "CODEPIPELINE" = "CODEPIPELINE"
  inline val GITHUB: "GITHUB" = "GITHUB"
  inline val S3: "S3" = "S3"
  inline val BITBUCKET: "BITBUCKET" = "BITBUCKET"
  inline val GITHUB_ENTERPRISE: "GITHUB_ENTERPRISE" = "GITHUB_ENTERPRISE"
  inline val NO_SOURCE: "NO_SOURCE" = "NO_SOURCE"

  inline def values: js.Array[SourceType] = js.Array(CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET, GITHUB_ENTERPRISE, NO_SOURCE)
}

type StatusType = "SUCCEEDED" | "FAILED" | "FAULT" | "TIMED_OUT" | "IN_PROGRESS" | "STOPPED"
object StatusType {
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val FAULT: "FAULT" = "FAULT"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val STOPPED: "STOPPED" = "STOPPED"

  inline def values: js.Array[StatusType] = js.Array(SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS, STOPPED)
}

type WebhookBuildType = "BUILD" | "BUILD_BATCH"
object WebhookBuildType {
  inline val BUILD: "BUILD" = "BUILD"
  inline val BUILD_BATCH: "BUILD_BATCH" = "BUILD_BATCH"

  inline def values: js.Array[WebhookBuildType] = js.Array(BUILD, BUILD_BATCH)
}

type WebhookFilterType = "EVENT" | "BASE_REF" | "HEAD_REF" | "ACTOR_ACCOUNT_ID" | "FILE_PATH" | "COMMIT_MESSAGE"
object WebhookFilterType {
  inline val EVENT: "EVENT" = "EVENT"
  inline val BASE_REF: "BASE_REF" = "BASE_REF"
  inline val HEAD_REF: "HEAD_REF" = "HEAD_REF"
  inline val ACTOR_ACCOUNT_ID: "ACTOR_ACCOUNT_ID" = "ACTOR_ACCOUNT_ID"
  inline val FILE_PATH: "FILE_PATH" = "FILE_PATH"
  inline val COMMIT_MESSAGE: "COMMIT_MESSAGE" = "COMMIT_MESSAGE"

  inline def values: js.Array[WebhookFilterType] = js.Array(EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID, FILE_PATH, COMMIT_MESSAGE)
}
