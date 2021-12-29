package facade.amazonaws.services.codebuild

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ArtifactNamespace extends js.Any
object ArtifactNamespace {
  val NONE = "NONE".asInstanceOf[ArtifactNamespace]
  val BUILD_ID = "BUILD_ID".asInstanceOf[ArtifactNamespace]

  @inline def values = js.Array(NONE, BUILD_ID)
}

@js.native
sealed trait ArtifactPackaging extends js.Any
object ArtifactPackaging {
  val NONE = "NONE".asInstanceOf[ArtifactPackaging]
  val ZIP = "ZIP".asInstanceOf[ArtifactPackaging]

  @inline def values = js.Array(NONE, ZIP)
}

@js.native
sealed trait ArtifactsType extends js.Any
object ArtifactsType {
  val CODEPIPELINE = "CODEPIPELINE".asInstanceOf[ArtifactsType]
  val S3 = "S3".asInstanceOf[ArtifactsType]
  val NO_ARTIFACTS = "NO_ARTIFACTS".asInstanceOf[ArtifactsType]

  @inline def values = js.Array(CODEPIPELINE, S3, NO_ARTIFACTS)
}

@js.native
sealed trait AuthType extends js.Any
object AuthType {
  val OAUTH = "OAUTH".asInstanceOf[AuthType]
  val BASIC_AUTH = "BASIC_AUTH".asInstanceOf[AuthType]
  val PERSONAL_ACCESS_TOKEN = "PERSONAL_ACCESS_TOKEN".asInstanceOf[AuthType]

  @inline def values = js.Array(OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN)
}

/** Specifies the access for objects that are uploaded to an Amazon S3 bucket that is owned by another account.
  * By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects.
  * <dl> <dt>NONE</dt> <dd> The bucket owner does not have access to the objects. This is the default.
  * </dd> <dt>READ_ONLY</dt> <dd> The bucket owner has read only access to the objects. The uploading account retains ownership of the objects.
  * </dd> <dt>FULL</dt> <dd> The bucket owner has full access to the objects. Object ownership is determined by the following criteria:
  * * If the bucket is configured with the ```Bucket owner preferred``` setting, the bucket owner owns the objects. The uploading account will have object access as specified by the bucket's policy.
  * * Otherwise, the uploading account retains ownership of the objects.
  * For more information about Amazon S3 object ownership, see [[https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html|Controlling ownership of uploaded objects using S3 Object Ownership]] in the <i>Amazon Simple Storage Service User Guide</i>.
  * </dd> </dl>
  */
@js.native
sealed trait BucketOwnerAccess extends js.Any
object BucketOwnerAccess {
  val NONE = "NONE".asInstanceOf[BucketOwnerAccess]
  val READ_ONLY = "READ_ONLY".asInstanceOf[BucketOwnerAccess]
  val FULL = "FULL".asInstanceOf[BucketOwnerAccess]

  @inline def values = js.Array(NONE, READ_ONLY, FULL)
}

@js.native
sealed trait BuildBatchPhaseType extends js.Any
object BuildBatchPhaseType {
  val SUBMITTED = "SUBMITTED".asInstanceOf[BuildBatchPhaseType]
  val DOWNLOAD_BATCHSPEC = "DOWNLOAD_BATCHSPEC".asInstanceOf[BuildBatchPhaseType]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[BuildBatchPhaseType]
  val COMBINE_ARTIFACTS = "COMBINE_ARTIFACTS".asInstanceOf[BuildBatchPhaseType]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[BuildBatchPhaseType]
  val FAILED = "FAILED".asInstanceOf[BuildBatchPhaseType]
  val STOPPED = "STOPPED".asInstanceOf[BuildBatchPhaseType]

  @inline def values = js.Array(SUBMITTED, DOWNLOAD_BATCHSPEC, IN_PROGRESS, COMBINE_ARTIFACTS, SUCCEEDED, FAILED, STOPPED)
}

@js.native
sealed trait BuildPhaseType extends js.Any
object BuildPhaseType {
  val SUBMITTED = "SUBMITTED".asInstanceOf[BuildPhaseType]
  val QUEUED = "QUEUED".asInstanceOf[BuildPhaseType]
  val PROVISIONING = "PROVISIONING".asInstanceOf[BuildPhaseType]
  val DOWNLOAD_SOURCE = "DOWNLOAD_SOURCE".asInstanceOf[BuildPhaseType]
  val INSTALL = "INSTALL".asInstanceOf[BuildPhaseType]
  val PRE_BUILD = "PRE_BUILD".asInstanceOf[BuildPhaseType]
  val BUILD = "BUILD".asInstanceOf[BuildPhaseType]
  val POST_BUILD = "POST_BUILD".asInstanceOf[BuildPhaseType]
  val UPLOAD_ARTIFACTS = "UPLOAD_ARTIFACTS".asInstanceOf[BuildPhaseType]
  val FINALIZING = "FINALIZING".asInstanceOf[BuildPhaseType]
  val COMPLETED = "COMPLETED".asInstanceOf[BuildPhaseType]

  @inline def values = js.Array(SUBMITTED, QUEUED, PROVISIONING, DOWNLOAD_SOURCE, INSTALL, PRE_BUILD, BUILD, POST_BUILD, UPLOAD_ARTIFACTS, FINALIZING, COMPLETED)
}

@js.native
sealed trait CacheMode extends js.Any
object CacheMode {
  val LOCAL_DOCKER_LAYER_CACHE = "LOCAL_DOCKER_LAYER_CACHE".asInstanceOf[CacheMode]
  val LOCAL_SOURCE_CACHE = "LOCAL_SOURCE_CACHE".asInstanceOf[CacheMode]
  val LOCAL_CUSTOM_CACHE = "LOCAL_CUSTOM_CACHE".asInstanceOf[CacheMode]

  @inline def values = js.Array(LOCAL_DOCKER_LAYER_CACHE, LOCAL_SOURCE_CACHE, LOCAL_CUSTOM_CACHE)
}

@js.native
sealed trait CacheType extends js.Any
object CacheType {
  val NO_CACHE = "NO_CACHE".asInstanceOf[CacheType]
  val S3 = "S3".asInstanceOf[CacheType]
  val LOCAL = "LOCAL".asInstanceOf[CacheType]

  @inline def values = js.Array(NO_CACHE, S3, LOCAL)
}

@js.native
sealed trait ComputeType extends js.Any
object ComputeType {
  val BUILD_GENERAL1_SMALL = "BUILD_GENERAL1_SMALL".asInstanceOf[ComputeType]
  val BUILD_GENERAL1_MEDIUM = "BUILD_GENERAL1_MEDIUM".asInstanceOf[ComputeType]
  val BUILD_GENERAL1_LARGE = "BUILD_GENERAL1_LARGE".asInstanceOf[ComputeType]
  val BUILD_GENERAL1_2XLARGE = "BUILD_GENERAL1_2XLARGE".asInstanceOf[ComputeType]

  @inline def values = js.Array(BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM, BUILD_GENERAL1_LARGE, BUILD_GENERAL1_2XLARGE)
}

@js.native
sealed trait CredentialProviderType extends js.Any
object CredentialProviderType {
  val SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[CredentialProviderType]

  @inline def values = js.Array(SECRETS_MANAGER)
}

@js.native
sealed trait EnvironmentType extends js.Any
object EnvironmentType {
  val WINDOWS_CONTAINER = "WINDOWS_CONTAINER".asInstanceOf[EnvironmentType]
  val LINUX_CONTAINER = "LINUX_CONTAINER".asInstanceOf[EnvironmentType]
  val LINUX_GPU_CONTAINER = "LINUX_GPU_CONTAINER".asInstanceOf[EnvironmentType]
  val ARM_CONTAINER = "ARM_CONTAINER".asInstanceOf[EnvironmentType]
  val WINDOWS_SERVER_2019_CONTAINER = "WINDOWS_SERVER_2019_CONTAINER".asInstanceOf[EnvironmentType]

  @inline def values = js.Array(WINDOWS_CONTAINER, LINUX_CONTAINER, LINUX_GPU_CONTAINER, ARM_CONTAINER, WINDOWS_SERVER_2019_CONTAINER)
}

@js.native
sealed trait EnvironmentVariableType extends js.Any
object EnvironmentVariableType {
  val PLAINTEXT = "PLAINTEXT".asInstanceOf[EnvironmentVariableType]
  val PARAMETER_STORE = "PARAMETER_STORE".asInstanceOf[EnvironmentVariableType]
  val SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[EnvironmentVariableType]

  @inline def values = js.Array(PLAINTEXT, PARAMETER_STORE, SECRETS_MANAGER)
}

@js.native
sealed trait FileSystemType extends js.Any
object FileSystemType {
  val EFS = "EFS".asInstanceOf[FileSystemType]

  @inline def values = js.Array(EFS)
}

@js.native
sealed trait ImagePullCredentialsType extends js.Any
object ImagePullCredentialsType {
  val CODEBUILD = "CODEBUILD".asInstanceOf[ImagePullCredentialsType]
  val SERVICE_ROLE = "SERVICE_ROLE".asInstanceOf[ImagePullCredentialsType]

  @inline def values = js.Array(CODEBUILD, SERVICE_ROLE)
}

@js.native
sealed trait LanguageType extends js.Any
object LanguageType {
  val JAVA = "JAVA".asInstanceOf[LanguageType]
  val PYTHON = "PYTHON".asInstanceOf[LanguageType]
  val NODE_JS = "NODE_JS".asInstanceOf[LanguageType]
  val RUBY = "RUBY".asInstanceOf[LanguageType]
  val GOLANG = "GOLANG".asInstanceOf[LanguageType]
  val DOCKER = "DOCKER".asInstanceOf[LanguageType]
  val ANDROID = "ANDROID".asInstanceOf[LanguageType]
  val DOTNET = "DOTNET".asInstanceOf[LanguageType]
  val BASE = "BASE".asInstanceOf[LanguageType]
  val PHP = "PHP".asInstanceOf[LanguageType]

  @inline def values = js.Array(JAVA, PYTHON, NODE_JS, RUBY, GOLANG, DOCKER, ANDROID, DOTNET, BASE, PHP)
}

@js.native
sealed trait LogsConfigStatusType extends js.Any
object LogsConfigStatusType {
  val ENABLED = "ENABLED".asInstanceOf[LogsConfigStatusType]
  val DISABLED = "DISABLED".asInstanceOf[LogsConfigStatusType]

  @inline def values = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait PlatformType extends js.Any
object PlatformType {
  val DEBIAN = "DEBIAN".asInstanceOf[PlatformType]
  val AMAZON_LINUX = "AMAZON_LINUX".asInstanceOf[PlatformType]
  val UBUNTU = "UBUNTU".asInstanceOf[PlatformType]
  val WINDOWS_SERVER = "WINDOWS_SERVER".asInstanceOf[PlatformType]

  @inline def values = js.Array(DEBIAN, AMAZON_LINUX, UBUNTU, WINDOWS_SERVER)
}

@js.native
sealed trait ProjectSortByType extends js.Any
object ProjectSortByType {
  val NAME = "NAME".asInstanceOf[ProjectSortByType]
  val CREATED_TIME = "CREATED_TIME".asInstanceOf[ProjectSortByType]
  val LAST_MODIFIED_TIME = "LAST_MODIFIED_TIME".asInstanceOf[ProjectSortByType]

  @inline def values = js.Array(NAME, CREATED_TIME, LAST_MODIFIED_TIME)
}

@js.native
sealed trait ReportCodeCoverageSortByType extends js.Any
object ReportCodeCoverageSortByType {
  val LINE_COVERAGE_PERCENTAGE = "LINE_COVERAGE_PERCENTAGE".asInstanceOf[ReportCodeCoverageSortByType]
  val FILE_PATH = "FILE_PATH".asInstanceOf[ReportCodeCoverageSortByType]

  @inline def values = js.Array(LINE_COVERAGE_PERCENTAGE, FILE_PATH)
}

@js.native
sealed trait ReportExportConfigType extends js.Any
object ReportExportConfigType {
  val S3 = "S3".asInstanceOf[ReportExportConfigType]
  val NO_EXPORT = "NO_EXPORT".asInstanceOf[ReportExportConfigType]

  @inline def values = js.Array(S3, NO_EXPORT)
}

@js.native
sealed trait ReportGroupSortByType extends js.Any
object ReportGroupSortByType {
  val NAME = "NAME".asInstanceOf[ReportGroupSortByType]
  val CREATED_TIME = "CREATED_TIME".asInstanceOf[ReportGroupSortByType]
  val LAST_MODIFIED_TIME = "LAST_MODIFIED_TIME".asInstanceOf[ReportGroupSortByType]

  @inline def values = js.Array(NAME, CREATED_TIME, LAST_MODIFIED_TIME)
}

@js.native
sealed trait ReportGroupStatusType extends js.Any
object ReportGroupStatusType {
  val ACTIVE = "ACTIVE".asInstanceOf[ReportGroupStatusType]
  val DELETING = "DELETING".asInstanceOf[ReportGroupStatusType]

  @inline def values = js.Array(ACTIVE, DELETING)
}

@js.native
sealed trait ReportGroupTrendFieldType extends js.Any
object ReportGroupTrendFieldType {
  val PASS_RATE = "PASS_RATE".asInstanceOf[ReportGroupTrendFieldType]
  val DURATION = "DURATION".asInstanceOf[ReportGroupTrendFieldType]
  val TOTAL = "TOTAL".asInstanceOf[ReportGroupTrendFieldType]
  val LINE_COVERAGE = "LINE_COVERAGE".asInstanceOf[ReportGroupTrendFieldType]
  val LINES_COVERED = "LINES_COVERED".asInstanceOf[ReportGroupTrendFieldType]
  val LINES_MISSED = "LINES_MISSED".asInstanceOf[ReportGroupTrendFieldType]
  val BRANCH_COVERAGE = "BRANCH_COVERAGE".asInstanceOf[ReportGroupTrendFieldType]
  val BRANCHES_COVERED = "BRANCHES_COVERED".asInstanceOf[ReportGroupTrendFieldType]
  val BRANCHES_MISSED = "BRANCHES_MISSED".asInstanceOf[ReportGroupTrendFieldType]

  @inline def values = js.Array(PASS_RATE, DURATION, TOTAL, LINE_COVERAGE, LINES_COVERED, LINES_MISSED, BRANCH_COVERAGE, BRANCHES_COVERED, BRANCHES_MISSED)
}

@js.native
sealed trait ReportPackagingType extends js.Any
object ReportPackagingType {
  val ZIP = "ZIP".asInstanceOf[ReportPackagingType]
  val NONE = "NONE".asInstanceOf[ReportPackagingType]

  @inline def values = js.Array(ZIP, NONE)
}

@js.native
sealed trait ReportStatusType extends js.Any
object ReportStatusType {
  val GENERATING = "GENERATING".asInstanceOf[ReportStatusType]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ReportStatusType]
  val FAILED = "FAILED".asInstanceOf[ReportStatusType]
  val INCOMPLETE = "INCOMPLETE".asInstanceOf[ReportStatusType]
  val DELETING = "DELETING".asInstanceOf[ReportStatusType]

  @inline def values = js.Array(GENERATING, SUCCEEDED, FAILED, INCOMPLETE, DELETING)
}

@js.native
sealed trait ReportType extends js.Any
object ReportType {
  val TEST = "TEST".asInstanceOf[ReportType]
  val CODE_COVERAGE = "CODE_COVERAGE".asInstanceOf[ReportType]

  @inline def values = js.Array(TEST, CODE_COVERAGE)
}

@js.native
sealed trait RetryBuildBatchType extends js.Any
object RetryBuildBatchType {
  val RETRY_ALL_BUILDS = "RETRY_ALL_BUILDS".asInstanceOf[RetryBuildBatchType]
  val RETRY_FAILED_BUILDS = "RETRY_FAILED_BUILDS".asInstanceOf[RetryBuildBatchType]

  @inline def values = js.Array(RETRY_ALL_BUILDS, RETRY_FAILED_BUILDS)
}

@js.native
sealed trait ServerType extends js.Any
object ServerType {
  val GITHUB = "GITHUB".asInstanceOf[ServerType]
  val BITBUCKET = "BITBUCKET".asInstanceOf[ServerType]
  val GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[ServerType]

  @inline def values = js.Array(GITHUB, BITBUCKET, GITHUB_ENTERPRISE)
}

@js.native
sealed trait SharedResourceSortByType extends js.Any
object SharedResourceSortByType {
  val ARN = "ARN".asInstanceOf[SharedResourceSortByType]
  val MODIFIED_TIME = "MODIFIED_TIME".asInstanceOf[SharedResourceSortByType]

  @inline def values = js.Array(ARN, MODIFIED_TIME)
}

@js.native
sealed trait SortOrderType extends js.Any
object SortOrderType {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrderType]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrderType]

  @inline def values = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait SourceAuthType extends js.Any
object SourceAuthType {
  val OAUTH = "OAUTH".asInstanceOf[SourceAuthType]

  @inline def values = js.Array(OAUTH)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val CODECOMMIT = "CODECOMMIT".asInstanceOf[SourceType]
  val CODEPIPELINE = "CODEPIPELINE".asInstanceOf[SourceType]
  val GITHUB = "GITHUB".asInstanceOf[SourceType]
  val S3 = "S3".asInstanceOf[SourceType]
  val BITBUCKET = "BITBUCKET".asInstanceOf[SourceType]
  val GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[SourceType]
  val NO_SOURCE = "NO_SOURCE".asInstanceOf[SourceType]

  @inline def values = js.Array(CODECOMMIT, CODEPIPELINE, GITHUB, S3, BITBUCKET, GITHUB_ENTERPRISE, NO_SOURCE)
}

@js.native
sealed trait StatusType extends js.Any
object StatusType {
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[StatusType]
  val FAILED = "FAILED".asInstanceOf[StatusType]
  val FAULT = "FAULT".asInstanceOf[StatusType]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[StatusType]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[StatusType]
  val STOPPED = "STOPPED".asInstanceOf[StatusType]

  @inline def values = js.Array(SUCCEEDED, FAILED, FAULT, TIMED_OUT, IN_PROGRESS, STOPPED)
}

@js.native
sealed trait WebhookBuildType extends js.Any
object WebhookBuildType {
  val BUILD = "BUILD".asInstanceOf[WebhookBuildType]
  val BUILD_BATCH = "BUILD_BATCH".asInstanceOf[WebhookBuildType]

  @inline def values = js.Array(BUILD, BUILD_BATCH)
}

@js.native
sealed trait WebhookFilterType extends js.Any
object WebhookFilterType {
  val EVENT = "EVENT".asInstanceOf[WebhookFilterType]
  val BASE_REF = "BASE_REF".asInstanceOf[WebhookFilterType]
  val HEAD_REF = "HEAD_REF".asInstanceOf[WebhookFilterType]
  val ACTOR_ACCOUNT_ID = "ACTOR_ACCOUNT_ID".asInstanceOf[WebhookFilterType]
  val FILE_PATH = "FILE_PATH".asInstanceOf[WebhookFilterType]
  val COMMIT_MESSAGE = "COMMIT_MESSAGE".asInstanceOf[WebhookFilterType]

  @inline def values = js.Array(EVENT, BASE_REF, HEAD_REF, ACTOR_ACCOUNT_ID, FILE_PATH, COMMIT_MESSAGE)
}

