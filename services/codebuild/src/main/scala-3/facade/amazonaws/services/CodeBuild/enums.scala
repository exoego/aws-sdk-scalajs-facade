package facade.amazonaws.services.codebuild

import scalajs._

type ArtifactNamespace = "NONE" | "BUILD_ID"
object ArtifactNamespace {
  val NONE: "NONE" = "NONE"
  val BUILD_ID: "BUILD_ID" = "BUILD_ID"

  @inline def values = js.Array[ArtifactNamespace](NONE, BUILD_ID)
}

type ArtifactPackaging = "NONE" | "ZIP"
object ArtifactPackaging {
  val NONE: "NONE" = "NONE"
  val ZIP: "ZIP" = "ZIP"

  @inline def values = js.Array[ArtifactPackaging](NONE, ZIP)
}

type ArtifactsType = "CODEPIPELINE" | "S3" | "NO_ARTIFACTS"
object ArtifactsType {
  val CODEPIPELINE: "CODEPIPELINE" = "CODEPIPELINE"
  val S3: "S3" = "S3"
  val NO_ARTIFACTS: "NO_ARTIFACTS" = "NO_ARTIFACTS"

  @inline def values = js.Array[ArtifactsType](CODEPIPELINE, S3, NO_ARTIFACTS)
}

type AuthType = "OAUTH" | "BASIC_AUTH" | "PERSONAL_ACCESS_TOKEN"
object AuthType {
  val OAUTH: "OAUTH" = "OAUTH"
  val BASIC_AUTH: "BASIC_AUTH" = "BASIC_AUTH"
  val PERSONAL_ACCESS_TOKEN: "PERSONAL_ACCESS_TOKEN" = "PERSONAL_ACCESS_TOKEN"

  @inline def values = js.Array[AuthType](OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN)
}

/** Specifies the access for objects that are uploaded to an Amazon S3 bucket that is owned by another account. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. <dl> <dt>NONE</dt> <dd> The bucket owner does not have access to the objects. This is the default. </dd> <dt>READ_ONLY</dt> <dd> The bucket owner has read only access to the objects. The uploading account retains ownership of the objects. </dd> <dt>FULL</dt> <dd> The bucket owner has full access to the objects. Object ownership is determined by the following criteria: * If the bucket is configured with the ```Bucket owner preferred``` setting, the bucket owner owns the objects. The uploading account will have object access as specified by the bucket's policy. * Otherwise, the uploading account retains ownership of the objects. For more information about Amazon S3 object ownership, see
  * [[https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html|Controlling ownership of uploaded objects using S3 Object Ownership]] in the <i>Amazon Simple Storage Service User Guide</i>. </dd> </dl>
  */
type BucketOwnerAccess = "NONE" | "READ_ONLY" | "FULL"
object BucketOwnerAccess {
  val NONE: "NONE" = "NONE"
  val READ_ONLY: "READ_ONLY" = "READ_ONLY"
  val FULL: "FULL" = "FULL"

  @inline def values = js.Array[BucketOwnerAccess](NONE, READ_ONLY, FULL)
}

type BuildBatchPhaseType = "SUBMITTED" | "DOWNLOAD_BATCHSPEC" | "IN_PROGRESS" | "COMBINE_ARTIFACTS" | "SUCCEEDED" | "FAILED" | "STOPPED"
object BuildBatchPhaseType {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val DOWNLOAD_BATCHSPEC: "DOWNLOAD_BATCHSPEC" = "DOWNLOAD_BATCHSPEC"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMBINE_ARTIFACTS: "COMBINE_ARTIFACTS" = "COMBINE_ARTIFACTS"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[BuildBatchPhaseType](SUBMITTED, DOWNLOAD_BATCHSPEC, IN_PROGRESS, COMBINE_ARTIFACTS, SUCCEEDED, FAILED, STOPPED)
}

type BuildPhaseType = "SUBMITTED" | "QUEUED" | "PROVISIONING" | "DOWNLOAD_SOURCE" | "INSTALL" | "PRE_BUILD" | "BUILD" | "POST_BUILD" | "UPLOAD_ARTIFACTS" | "FINALIZING" | "COMPLETED"
object BuildPhaseType {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val QUEUED: "QUEUED" = "QUEUED"
  val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  val DOWNLOAD_SOURCE: "DOWNLOAD_SOURCE" = "DOWNLOAD_SOURCE"
  val INSTALL: "INSTALL" = "INSTALL"
  val PRE_BUILD: "PRE_BUILD" = "PRE_BUILD"
  val BUILD: "BUILD" = "BUILD"
  val POST_BUILD: "POST_BUILD" = "POST_BUILD"
  val UPLOAD_ARTIFACTS: "UPLOAD_ARTIFACTS" = "UPLOAD_ARTIFACTS"
  val FINALIZING: "FINALIZING" = "FINALIZING"
  val COMPLETED: "COMPLETED" = "COMPLETED"

  @inline def values = js.Array[BuildPhaseType](SUBMITTED, QUEUED, PROVISIONING, DOWNLOAD_SOURCE, INSTALL, PRE_BUILD, BUILD, POST_BUILD, UPLOAD_ARTIFACTS, FINALIZING, COMPLETED)
}

type CacheMode = "LOCAL_DOCKER_LAYER_CACHE" | "LOCAL_SOURCE_CACHE" | "LOCAL_CUSTOM_CACHE"
object CacheMode {
  val LOCAL_DOCKER_LAYER_CACHE: "LOCAL_DOCKER_LAYER_CACHE" = "LOCAL_DOCKER_LAYER_CACHE"
  val LOCAL_SOURCE_CACHE: "LOCAL_SOURCE_CACHE" = "LOCAL_SOURCE_CACHE"
  val LOCAL_CUSTOM_CACHE: "LOCAL_CUSTOM_CACHE" = "LOCAL_CUSTOM_CACHE"

  @inline def values = js.Array[CacheMode](LOCAL_DOCKER_LAYER_CACHE, LOCAL_SOURCE_CACHE, LOCAL_CUSTOM_CACHE)
}

type CacheType = "NO_CACHE" | "S3" | "LOCAL"
object CacheType {
  val NO_CACHE: "NO_CACHE" = "NO_CACHE"
  val S3: "S3" = "S3"
  val LOCAL: "LOCAL" = "LOCAL"

  @inline def values = js.Array[CacheType](NO_CACHE, S3, LOCAL)
}

type ComputeType = "BUILD_GENERAL1_SMALL" | "BUILD_GENERAL1_MEDIUM" | "BUILD_GENERAL1_LARGE" | "BUILD_GENERAL1_2XLARGE"
object ComputeType {
  val BUILD_GENERAL1_SMALL: "BUILD_GENERAL1_SMALL" = "BUILD_GENERAL1_SMALL"
  val BUILD_GENERAL1_MEDIUM: "BUILD_GENERAL1_MEDIUM" = "BUILD_GENERAL1_MEDIUM"
  val BUILD_GENERAL1_LARGE: "BUILD_GENERAL1_LARGE" = "BUILD_GENERAL1_LARGE"
  val BUILD_GENERAL1_2XLARGE: "BUILD_GENERAL1_2XLARGE" = "BUILD_GENERAL1_2XLARGE"

  @inline def values = js.Array[ComputeType](BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM, BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE)
}

type CredentialProviderType = "SECRETS_MANAGER"
object CredentialProviderType {
  val SECRETS_MANAGER: "SECRETS_MANAGER" = "SECRETS_MANAGER"

  @inline def values = js.Array[CredentialProviderType](SECRETS_MANAGER)
}

type EnvironmentType = "WINDOWS_CONTAINER" | "LINUX_CONTAINER" | "LINUX_GPU_CONTAINER" | "ARM_CONTAINER" | "WINDOWS_SERVER_2019_CONTAINER"
object EnvironmentType {
  val WINDOWS_CONTAINER: "WINDOWS_CONTAINER" = "WINDOWS_CONTAINER"
  val LINUX_CONTAINER: "LINUX_CONTAINER" = "LINUX_CONTAINER"
  val LINUX_GPU_CONTAINER: "LINUX_GPU_CONTAINER" = "LINUX_GPU_CONTAINER"
  val ARM_CONTAINER: "ARM_CONTAINER" = "ARM_CONTAINER"
  val WINDOWS_SERVER_2019_CONTAINER: "WINDOWS_SERVER_2019_CONTAINER" = "WINDOWS_SERVER_2019_CONTAINER"

  @inline def values = js.Array[EnvironmentType](WINDOWS_CONTAINER, LINUX_CONTAINER, LINUX_GPU_CONTAINER, ARM_CONTAINER, WINDOWS_SERVER_2019_CONTAINER)
}

type EnvironmentVariableType = "PLAINTEXT" | "PARAMETER_STORE" | "SECRETS_MANAGER"
object EnvironmentVariableType {
  val PLAINTEXT: "PLAINTEXT" = "PLAINTEXT"
  val PARAMETER_STORE: "PARAMETER_STORE" = "PARAMETER_STORE"
  val SECRETS_MANAGER: "SECRETS_MANAGER" = "SECRETS_MANAGER"

  @inline def values = js.Array[EnvironmentVariableType](PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER)
}

type FileSystemType = "EFS"
object FileSystemType {
  val EFS: "EFS" = "EFS"

  @inline def values = js.Array[FileSystemType](EFS)
}

type ImagePullCredentialsType = "CODEBUILD" | "SERVICE_ROLE"
object ImagePullCredentialsType {
  val CODEBUILD: "CODEBUILD" = "CODEBUILD"
  val SERVICE_ROLE: "SERVICE_ROLE" = "SERVICE_ROLE"

  @inline def values = js.Array[ImagePullCredentialsType](CODEBUILD, SERVICE_ROLE)
}

type LanguageType = "JAVA" | "PYTHON" | "NODE_JS" | "RUBY" | "GOLANG" | "DOCKER" | "ANDROID" | "DOTNET" | "BASE" | "PHP"
object LanguageType {
  val JAVA: "JAVA" = "JAVA"
  val PYTHON: "PYTHON" = "PYTHON"
  val NODE_JS: "NODE_JS" = "NODE_JS"
  val RUBY: "RUBY" = "RUBY"
  val GOLANG: "GOLANG" = "GOLANG"
  val DOCKER: "DOCKER" = "DOCKER"
  val ANDROID: "ANDROID" = "ANDROID"
  val DOTNET: "DOTNET" = "DOTNET"
  val BASE: "BASE" = "BASE"
  val PHP: "PHP" = "PHP"

  @inline def values = js.Array[LanguageType](JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER, ANDROID, DOTNET, BASE, PHP)
}

type LogsConfigStatusType = "ENABLED" | "DISABLED"
object LogsConfigStatusType {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"

  @inline def values = js.Array[LogsConfigStatusType](ENABLED, DISABLED)
}

type PlatformType = "DEBIAN" | "AMAZON_LINUX" | "UBUNTU" | "WINDOWS_SERVER"
object PlatformType {
  val DEBIAN: "DEBIAN" = "DEBIAN"
  val AMAZON_LINUX: "AMAZON_LINUX" = "AMAZON_LINUX"
  val UBUNTU: "UBUNTU" = "UBUNTU"
  val WINDOWS_SERVER: "WINDOWS_SERVER" = "WINDOWS_SERVER"

  @inline def values = js.Array[PlatformType](DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER)
}

type ProjectSortByType = "NAME" | "CREATED_TIME" | "LAST_MODIFIED_TIME"
object ProjectSortByType {
  val NAME: "NAME" = "NAME"
  val CREATED_TIME: "CREATED_TIME" = "CREATED_TIME"
  val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"

  @inline def values = js.Array[ProjectSortByType](NAME, CREATED_TIME, LAST_MODIFIED_TIME)
}

type ReportCodeCoverageSortByType = "LINE_COVERAGE_PERCENTAGE" | "FILE_PATH"
object ReportCodeCoverageSortByType {
  val LINE_COVERAGE_PERCENTAGE: "LINE_COVERAGE_PERCENTAGE" = "LINE_COVERAGE_PERCENTAGE"
  val FILE_PATH: "FILE_PATH" = "FILE_PATH"

  @inline def values = js.Array[ReportCodeCoverageSortByType](LINE_COVERAGE_PERCENTAGE, FILE_PATH)
}

type ReportExportConfigType = "S3" | "NO_EXPORT"
object ReportExportConfigType {
  val S3: "S3" = "S3"
  val NO_EXPORT: "NO_EXPORT" = "NO_EXPORT"

  @inline def values = js.Array[ReportExportConfigType](S3, NO_EXPORT)
}

type ReportGroupSortByType = "NAME" | "CREATED_TIME" | "LAST_MODIFIED_TIME"
object ReportGroupSortByType {
  val NAME: "NAME" = "NAME"
  val CREATED_TIME: "CREATED_TIME" = "CREATED_TIME"
  val LAST_MODIFIED_TIME: "LAST_MODIFIED_TIME" = "LAST_MODIFIED_TIME"

  @inline def values = js.Array[ReportGroupSortByType](NAME, CREATED_TIME, LAST_MODIFIED_TIME)
}

type ReportGroupStatusType = "ACTIVE" | "DELETING"
object ReportGroupStatusType {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[ReportGroupStatusType](ACTIVE, DELETING)
}

type ReportGroupTrendFieldType = "PASS_RATE" | "DURATION" | "TOTAL" | "LINE_COVERAGE" | "LINES_COVERED" | "LINES_MISSED" | "BRANCH_COVERAGE" | "BRANCHES_COVERED" | "BRANCHES_MISSED"
object ReportGroupTrendFieldType {
  val PASS_RATE: "PASS_RATE" = "PASS_RATE"
  val DURATION: "DURATION" = "DURATION"
  val TOTAL: "TOTAL" = "TOTAL"
  val LINE_COVERAGE: "LINE_COVERAGE" = "LINE_COVERAGE"
  val LINES_COVERED: "LINES_COVERED" = "LINES_COVERED"
  val LINES_MISSED: "LINES_MISSED" = "LINES_MISSED"
  val BRANCH_COVERAGE: "BRANCH_COVERAGE" = "BRANCH_COVERAGE"
  val BRANCHES_COVERED: "BRANCHES_COVERED" = "BRANCHES_COVERED"
  val BRANCHES_MISSED: "BRANCHES_MISSED" = "BRANCHES_MISSED"

  @inline def values = js.Array[ReportGroupTrendFieldType](PASS_RATE, DURATION, TOTAL, LINE_COVERAGE, LINES_COVERED, LINES_MISSED, BRANCH_COVERAGE, BRANCHES_COVERED, BRANCHES_MISSED)
}

type ReportPackagingType = "ZIP" | "NONE"
object ReportPackagingType {
  val ZIP: "ZIP" = "ZIP"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[ReportPackagingType](ZIP, NONE)
}

type ReportStatusType = "GENERATING" | "SUCCEEDED" | "FAILED" | "INCOMPLETE" | "DELETING"
object ReportStatusType {
  val GENERATING: "GENERATING" = "GENERATING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val INCOMPLETE: "INCOMPLETE" = "INCOMPLETE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[ReportStatusType](GENERATING, SUCCEEDED, FAILED, INCOMPLETE, DELETING)
}

type ReportType = "TEST" | "CODE_COVERAGE"
object ReportType {
  val TEST: "TEST" = "TEST"
  val CODE_COVERAGE: "CODE_COVERAGE" = "CODE_COVERAGE"

  @inline def values = js.Array[ReportType](TEST, CODE_COVERAGE)
}

type RetryBuildBatchType = "RETRY_ALL_BUILDS" | "RETRY_FAILED_BUILDS"
object RetryBuildBatchType {
  val RETRY_ALL_BUILDS: "RETRY_ALL_BUILDS" = "RETRY_ALL_BUILDS"
  val RETRY_FAILED_BUILDS: "RETRY_FAILED_BUILDS" = "RETRY_FAILED_BUILDS"

  @inline def values = js.Array[RetryBuildBatchType](RETRY_ALL_BUILDS, RETRY_FAILED_BUILDS)
}

type ServerType = "GITHUB" | "BITBUCKET" | "GITHUB_ENTERPRISE"
object ServerType {
  val GITHUB: "GITHUB" = "GITHUB"
  val BITBUCKET: "BITBUCKET" = "BITBUCKET"
  val GITHUB_ENTERPRISE: "GITHUB_ENTERPRISE" = "GITHUB_ENTERPRISE"

  @inline def values = js.Array[ServerType](GITHUB, BITBUCKET, GITHUB_ENTERPRISE)
}

type SharedResourceSortByType = "ARN" | "MODIFIED_TIME"
object SharedResourceSortByType {
  val ARN: "ARN" = "ARN"
  val MODIFIED_TIME: "MODIFIED_TIME" = "MODIFIED_TIME"

  @inline def values = js.Array[SharedResourceSortByType](ARN, MODIFIED_TIME)
}

type SortOrderType = "ASCENDING" | "DESCENDING"
object SortOrderType {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[SortOrderType](ASCENDING, DESCENDING)
}

type SourceAuthType = "OAUTH"
object SourceAuthType {
  val OAUTH: "OAUTH" = "OAUTH"

  @inline def values = js.Array[SourceAuthType](OAUTH)
}

type SourceType = "CODECOMMIT" | "CODEPIPELINE" | "GITHUB" | "S3" | "BITBUCKET" | "GITHUB_ENTERPRISE" | "NO_SOURCE"
object SourceType {
  val CODECOMMIT: "CODECOMMIT" = "CODECOMMIT"
  val CODEPIPELINE: "CODEPIPELINE" = "CODEPIPELINE"
  val GITHUB: "GITHUB" = "GITHUB"
  val S3: "S3" = "S3"
  val BITBUCKET: "BITBUCKET" = "BITBUCKET"
  val GITHUB_ENTERPRISE: "GITHUB_ENTERPRISE" = "GITHUB_ENTERPRISE"
  val NO_SOURCE: "NO_SOURCE" = "NO_SOURCE"

  @inline def values = js.Array[SourceType](CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET, GITHUB_ENTERPRISE, NO_SOURCE)
}

type StatusType = "SUCCEEDED" | "FAILED" | "FAULT" | "TIMED_OUT" | "IN_PROGRESS" | "STOPPED"
object StatusType {
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val FAILED: "FAILED" = "FAILED"
  val FAULT: "FAULT" = "FAULT"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val STOPPED: "STOPPED" = "STOPPED"

  @inline def values = js.Array[StatusType](SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS, STOPPED)
}

type WebhookBuildType = "BUILD" | "BUILD_BATCH"
object WebhookBuildType {
  val BUILD: "BUILD" = "BUILD"
  val BUILD_BATCH: "BUILD_BATCH" = "BUILD_BATCH"

  @inline def values = js.Array[WebhookBuildType](BUILD, BUILD_BATCH)
}

type WebhookFilterType = "EVENT" | "BASE_REF" | "HEAD_REF" | "ACTOR_ACCOUNT_ID" | "FILE_PATH" | "COMMIT_MESSAGE"
object WebhookFilterType {
  val EVENT: "EVENT" = "EVENT"
  val BASE_REF: "BASE_REF" = "BASE_REF"
  val HEAD_REF: "HEAD_REF" = "HEAD_REF"
  val ACTOR_ACCOUNT_ID: "ACTOR_ACCOUNT_ID" = "ACTOR_ACCOUNT_ID"
  val FILE_PATH: "FILE_PATH" = "FILE_PATH"
  val COMMIT_MESSAGE: "COMMIT_MESSAGE" = "COMMIT_MESSAGE"

  @inline def values = js.Array[WebhookFilterType](EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID, FILE_PATH, COMMIT_MESSAGE)
}
