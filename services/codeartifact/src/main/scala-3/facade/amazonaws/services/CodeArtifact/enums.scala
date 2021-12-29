package facade.amazonaws.services.codeartifact

import scalajs._

type DomainStatus = "Active" | "Deleted"
object DomainStatus {
  val Active: "Active" = "Active"
  val Deleted: "Deleted" = "Deleted"

  @inline def values = js.Array[DomainStatus](Active, Deleted)
}

type ExternalConnectionStatus = "Available"
object ExternalConnectionStatus {
  val Available: "Available" = "Available"

  @inline def values = js.Array[ExternalConnectionStatus](Available)
}

type HashAlgorithm = "MD5" | "SHA-1" | "SHA-256" | "SHA-512"
object HashAlgorithm {
  val MD5: "MD5" = "MD5"
  val `SHA-1`: "SHA-1" = "SHA-1"
  val `SHA-256`: "SHA-256" = "SHA-256"
  val `SHA-512`: "SHA-512" = "SHA-512"

  @inline def values = js.Array[HashAlgorithm](MD5, `SHA-1`, `SHA-256`, `SHA-512`)
}

type PackageFormat = "npm" | "pypi" | "maven" | "nuget"
object PackageFormat {
  val npm: "npm" = "npm"
  val pypi: "pypi" = "pypi"
  val maven: "maven" = "maven"
  val nuget: "nuget" = "nuget"

  @inline def values = js.Array[PackageFormat](npm, pypi, maven, nuget)
}

type PackageVersionErrorCode = "ALREADY_EXISTS" | "MISMATCHED_REVISION" | "MISMATCHED_STATUS" | "NOT_ALLOWED" | "NOT_FOUND" | "SKIPPED"
object PackageVersionErrorCode {
  val ALREADY_EXISTS: "ALREADY_EXISTS" = "ALREADY_EXISTS"
  val MISMATCHED_REVISION: "MISMATCHED_REVISION" = "MISMATCHED_REVISION"
  val MISMATCHED_STATUS: "MISMATCHED_STATUS" = "MISMATCHED_STATUS"
  val NOT_ALLOWED: "NOT_ALLOWED" = "NOT_ALLOWED"
  val NOT_FOUND: "NOT_FOUND" = "NOT_FOUND"
  val SKIPPED: "SKIPPED" = "SKIPPED"

  @inline def values = js.Array[PackageVersionErrorCode](ALREADY_EXISTS, MISMATCHED_REVISION, MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED)
}

type PackageVersionSortType = "PUBLISHED_TIME"
object PackageVersionSortType {
  val PUBLISHED_TIME: "PUBLISHED_TIME" = "PUBLISHED_TIME"

  @inline def values = js.Array[PackageVersionSortType](PUBLISHED_TIME)
}

type PackageVersionStatus = "Published" | "Unfinished" | "Unlisted" | "Archived" | "Disposed" | "Deleted"
object PackageVersionStatus {
  val Published: "Published" = "Published"
  val Unfinished: "Unfinished" = "Unfinished"
  val Unlisted: "Unlisted" = "Unlisted"
  val Archived: "Archived" = "Archived"
  val Disposed: "Disposed" = "Disposed"
  val Deleted: "Deleted" = "Deleted"

  @inline def values = js.Array[PackageVersionStatus](Published, Unfinished, Unlisted, Archived, Disposed, Deleted)
}
