package facade.amazonaws.services.codegurureviewer

import scalajs.js

type AnalysisType = "Security" | "CodeQuality"
object AnalysisType {
  inline val Security: "Security" = "Security"
  inline val CodeQuality: "CodeQuality" = "CodeQuality"

  inline def values: js.Array[AnalysisType] = js.Array(Security, CodeQuality)
}

type EncryptionOption = "AWS_OWNED_CMK" | "CUSTOMER_MANAGED_CMK"
object EncryptionOption {
  inline val AWS_OWNED_CMK: "AWS_OWNED_CMK" = "AWS_OWNED_CMK"
  inline val CUSTOMER_MANAGED_CMK: "CUSTOMER_MANAGED_CMK" = "CUSTOMER_MANAGED_CMK"

  inline def values: js.Array[EncryptionOption] = js.Array(AWS_OWNED_CMK, CUSTOMER_MANAGED_CMK)
}

type JobState = "Completed" | "Pending" | "Failed" | "Deleting"
object JobState {
  inline val Completed: "Completed" = "Completed"
  inline val Pending: "Pending" = "Pending"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[JobState] = js.Array(Completed, Pending, Failed, Deleting)
}

type ProviderType = "CodeCommit" | "GitHub" | "Bitbucket" | "GitHubEnterpriseServer" | "S3Bucket"
object ProviderType {
  inline val CodeCommit: "CodeCommit" = "CodeCommit"
  inline val GitHub: "GitHub" = "GitHub"
  inline val Bitbucket: "Bitbucket" = "Bitbucket"
  inline val GitHubEnterpriseServer: "GitHubEnterpriseServer" = "GitHubEnterpriseServer"
  inline val S3Bucket: "S3Bucket" = "S3Bucket"

  inline def values: js.Array[ProviderType] = js.Array(CodeCommit, GitHub, Bitbucket, GitHubEnterpriseServer, S3Bucket)
}

type Reaction = "ThumbsUp" | "ThumbsDown"
object Reaction {
  inline val ThumbsUp: "ThumbsUp" = "ThumbsUp"
  inline val ThumbsDown: "ThumbsDown" = "ThumbsDown"

  inline def values: js.Array[Reaction] = js.Array(ThumbsUp, ThumbsDown)
}

type RecommendationCategory = "AWSBestPractices" | "AWSCloudFormationIssues" | "DuplicateCode" | "CodeMaintenanceIssues" | "ConcurrencyIssues" | "InputValidations" | "PythonBestPractices" | "JavaBestPractices" | "ResourceLeaks" | "SecurityIssues" | "CodeInconsistencies"
object RecommendationCategory {
  inline val AWSBestPractices: "AWSBestPractices" = "AWSBestPractices"
  inline val AWSCloudFormationIssues: "AWSCloudFormationIssues" = "AWSCloudFormationIssues"
  inline val DuplicateCode: "DuplicateCode" = "DuplicateCode"
  inline val CodeMaintenanceIssues: "CodeMaintenanceIssues" = "CodeMaintenanceIssues"
  inline val ConcurrencyIssues: "ConcurrencyIssues" = "ConcurrencyIssues"
  inline val InputValidations: "InputValidations" = "InputValidations"
  inline val PythonBestPractices: "PythonBestPractices" = "PythonBestPractices"
  inline val JavaBestPractices: "JavaBestPractices" = "JavaBestPractices"
  inline val ResourceLeaks: "ResourceLeaks" = "ResourceLeaks"
  inline val SecurityIssues: "SecurityIssues" = "SecurityIssues"
  inline val CodeInconsistencies: "CodeInconsistencies" = "CodeInconsistencies"

  inline def values: js.Array[RecommendationCategory] = js.Array(
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

type RepositoryAssociationState = "Associated" | "Associating" | "Failed" | "Disassociating" | "Disassociated"
object RepositoryAssociationState {
  inline val Associated: "Associated" = "Associated"
  inline val Associating: "Associating" = "Associating"
  inline val Failed: "Failed" = "Failed"
  inline val Disassociating: "Disassociating" = "Disassociating"
  inline val Disassociated: "Disassociated" = "Disassociated"

  inline def values: js.Array[RepositoryAssociationState] = js.Array(Associated, Associating, Failed, Disassociating, Disassociated)
}

type Severity = "Info" | "Low" | "Medium" | "High" | "Critical"
object Severity {
  inline val Info: "Info" = "Info"
  inline val Low: "Low" = "Low"
  inline val Medium: "Medium" = "Medium"
  inline val High: "High" = "High"
  inline val Critical: "Critical" = "Critical"

  inline def values: js.Array[Severity] = js.Array(Info, Low, Medium, High, Critical)
}

type Type = "PullRequest" | "RepositoryAnalysis"
object Type {
  inline val PullRequest: "PullRequest" = "PullRequest"
  inline val RepositoryAnalysis: "RepositoryAnalysis" = "RepositoryAnalysis"

  inline def values: js.Array[Type] = js.Array(PullRequest, RepositoryAnalysis)
}

type VendorName = "GitHub" | "GitLab" | "NativeS3"
object VendorName {
  inline val GitHub: "GitHub" = "GitHub"
  inline val GitLab: "GitLab" = "GitLab"
  inline val NativeS3: "NativeS3" = "NativeS3"

  inline def values: js.Array[VendorName] = js.Array(GitHub, GitLab, NativeS3)
}
