package facade.amazonaws.services.codeartifact

import scalajs._

type DomainStatus = "Active" | "Deleted"
object DomainStatus {
  inline val Active: "Active" = "Active"
  inline val Deleted: "Deleted" = "Deleted"

  inline def values: js.Array[DomainStatus] = js.Array(Active, Deleted)
}

type ExternalConnectionStatus = "Available"
object ExternalConnectionStatus {
  inline val Available: "Available" = "Available"

  inline def values: js.Array[ExternalConnectionStatus] = js.Array(Available)
}

type HashAlgorithm = "MD5" | "SHA-1" | "SHA-256" | "SHA-512"
object HashAlgorithm {
  inline val MD5: "MD5" = "MD5"
  inline val `SHA-1`: "SHA-1" = "SHA-1"
  inline val `SHA-256`: "SHA-256" = "SHA-256"
  inline val `SHA-512`: "SHA-512" = "SHA-512"

  inline def values: js.Array[HashAlgorithm] = js.Array(MD5, `SHA-1`, `SHA-256`, `SHA-512`)
}

type PackageFormat = "npm" | "pypi" | "maven" | "nuget"
object PackageFormat {
  inline val npm: "npm" = "npm"
  inline val pypi: "pypi" = "pypi"
  inline val maven: "maven" = "maven"
  inline val nuget: "nuget" = "nuget"

  inline def values: js.Array[PackageFormat] = js.Array(npm, pypi, maven, nuget)
}

type PackageVersionErrorCode = "ALREADY_EXISTS" | "MISMATCHED_REVISION" | "MISMATCHED_STATUS" | "NOT_ALLOWED" | "NOT_FOUND" | "SKIPPED"
object PackageVersionErrorCode {
  inline val ALREADY_EXISTS: "ALREADY_EXISTS" = "ALREADY_EXISTS"
  inline val MISMATCHED_REVISION: "MISMATCHED_REVISION" = "MISMATCHED_REVISION"
  inline val MISMATCHED_STATUS: "MISMATCHED_STATUS" = "MISMATCHED_STATUS"
  inline val NOT_ALLOWED: "NOT_ALLOWED" = "NOT_ALLOWED"
  inline val NOT_FOUND: "NOT_FOUND" = "NOT_FOUND"
  inline val SKIPPED: "SKIPPED" = "SKIPPED"

  inline def values: js.Array[PackageVersionErrorCode] = js.Array(ALREADY_EXISTS, MISMATCHED_REVISION, MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED)
}

type PackageVersionSortType = "PUBLISHED_TIME"
object PackageVersionSortType {
  inline val PUBLISHED_TIME: "PUBLISHED_TIME" = "PUBLISHED_TIME"

  inline def values: js.Array[PackageVersionSortType] = js.Array(PUBLISHED_TIME)
}

type PackageVersionStatus = "Published" | "Unfinished" | "Unlisted" | "Archived" | "Disposed" | "Deleted"
object PackageVersionStatus {
  inline val Published: "Published" = "Published"
  inline val Unfinished: "Unfinished" = "Unfinished"
  inline val Unlisted: "Unlisted" = "Unlisted"
  inline val Archived: "Archived" = "Archived"
  inline val Disposed: "Disposed" = "Disposed"
  inline val Deleted: "Deleted" = "Deleted"

  inline def values: js.Array[PackageVersionStatus] = js.Array(Published, Unfinished, Unlisted, Archived, Disposed, Deleted)
}
