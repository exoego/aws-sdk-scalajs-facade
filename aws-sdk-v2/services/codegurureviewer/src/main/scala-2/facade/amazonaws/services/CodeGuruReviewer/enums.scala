package facade.amazonaws.services.codegurureviewer

import scalajs.js

@js.native
sealed trait AnalysisType extends js.Any
object AnalysisType {
  val Security = "Security".asInstanceOf[AnalysisType]
  val CodeQuality = "CodeQuality".asInstanceOf[AnalysisType]

  @inline def values: js.Array[AnalysisType] = js.Array(Security, CodeQuality)
}

@js.native
sealed trait EncryptionOption extends js.Any
object EncryptionOption {
  val AWS_OWNED_CMK = "AWS_OWNED_CMK".asInstanceOf[EncryptionOption]
  val CUSTOMER_MANAGED_CMK = "CUSTOMER_MANAGED_CMK".asInstanceOf[EncryptionOption]

  @inline def values: js.Array[EncryptionOption] = js.Array(AWS_OWNED_CMK, CUSTOMER_MANAGED_CMK)
}

@js.native
sealed trait JobState extends js.Any
object JobState {
  val Completed = "Completed".asInstanceOf[JobState]
  val Pending = "Pending".asInstanceOf[JobState]
  val Failed = "Failed".asInstanceOf[JobState]
  val Deleting = "Deleting".asInstanceOf[JobState]

  @inline def values: js.Array[JobState] = js.Array(Completed, Pending, Failed, Deleting)
}

@js.native
sealed trait ProviderType extends js.Any
object ProviderType {
  val CodeCommit = "CodeCommit".asInstanceOf[ProviderType]
  val GitHub = "GitHub".asInstanceOf[ProviderType]
  val Bitbucket = "Bitbucket".asInstanceOf[ProviderType]
  val GitHubEnterpriseServer = "GitHubEnterpriseServer".asInstanceOf[ProviderType]
  val S3Bucket = "S3Bucket".asInstanceOf[ProviderType]

  @inline def values: js.Array[ProviderType] = js.Array(CodeCommit, GitHub, Bitbucket, GitHubEnterpriseServer, S3Bucket)
}

@js.native
sealed trait Reaction extends js.Any
object Reaction {
  val ThumbsUp = "ThumbsUp".asInstanceOf[Reaction]
  val ThumbsDown = "ThumbsDown".asInstanceOf[Reaction]

  @inline def values: js.Array[Reaction] = js.Array(ThumbsUp, ThumbsDown)
}

@js.native
sealed trait RecommendationCategory extends js.Any
object RecommendationCategory {
  val AWSBestPractices = "AWSBestPractices".asInstanceOf[RecommendationCategory]
  val AWSCloudFormationIssues = "AWSCloudFormationIssues".asInstanceOf[RecommendationCategory]
  val DuplicateCode = "DuplicateCode".asInstanceOf[RecommendationCategory]
  val CodeMaintenanceIssues = "CodeMaintenanceIssues".asInstanceOf[RecommendationCategory]
  val ConcurrencyIssues = "ConcurrencyIssues".asInstanceOf[RecommendationCategory]
  val InputValidations = "InputValidations".asInstanceOf[RecommendationCategory]
  val PythonBestPractices = "PythonBestPractices".asInstanceOf[RecommendationCategory]
  val JavaBestPractices = "JavaBestPractices".asInstanceOf[RecommendationCategory]
  val ResourceLeaks = "ResourceLeaks".asInstanceOf[RecommendationCategory]
  val SecurityIssues = "SecurityIssues".asInstanceOf[RecommendationCategory]
  val CodeInconsistencies = "CodeInconsistencies".asInstanceOf[RecommendationCategory]

  @inline def values: js.Array[RecommendationCategory] = js.Array(
    AWSBestPractices,
    AWSCloudFormationIssues,
    DuplicateCode,
    CodeMaintenanceIssues,
    ConcurrencyIssues,
    InputValidations,
    PythonBestPractices,
    JavaBestPractices,
    ResourceLeaks,
    SecurityIssues,
    CodeInconsistencies
  )
}

@js.native
sealed trait RepositoryAssociationState extends js.Any
object RepositoryAssociationState {
  val Associated = "Associated".asInstanceOf[RepositoryAssociationState]
  val Associating = "Associating".asInstanceOf[RepositoryAssociationState]
  val Failed = "Failed".asInstanceOf[RepositoryAssociationState]
  val Disassociating = "Disassociating".asInstanceOf[RepositoryAssociationState]
  val Disassociated = "Disassociated".asInstanceOf[RepositoryAssociationState]

  @inline def values: js.Array[RepositoryAssociationState] = js.Array(Associated, Associating, Failed, Disassociating, Disassociated)
}

@js.native
sealed trait Severity extends js.Any
object Severity {
  val Info = "Info".asInstanceOf[Severity]
  val Low = "Low".asInstanceOf[Severity]
  val Medium = "Medium".asInstanceOf[Severity]
  val High = "High".asInstanceOf[Severity]
  val Critical = "Critical".asInstanceOf[Severity]

  @inline def values: js.Array[Severity] = js.Array(Info, Low, Medium, High, Critical)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val PullRequest = "PullRequest".asInstanceOf[Type]
  val RepositoryAnalysis = "RepositoryAnalysis".asInstanceOf[Type]

  @inline def values: js.Array[Type] = js.Array(PullRequest, RepositoryAnalysis)
}

@js.native
sealed trait VendorName extends js.Any
object VendorName {
  val GitHub = "GitHub".asInstanceOf[VendorName]
  val GitLab = "GitLab".asInstanceOf[VendorName]
  val NativeS3 = "NativeS3".asInstanceOf[VendorName]

  @inline def values: js.Array[VendorName] = js.Array(GitHub, GitLab, NativeS3)
}
