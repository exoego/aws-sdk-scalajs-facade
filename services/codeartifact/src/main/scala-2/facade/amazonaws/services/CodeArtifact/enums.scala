package facade.amazonaws.services.codeartifact

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait DomainStatus extends js.Any
object DomainStatus {
  val Active = "Active".asInstanceOf[DomainStatus]
  val Deleted = "Deleted".asInstanceOf[DomainStatus]

  @inline def values = js.Array(Active, Deleted)
}

@js.native
sealed trait ExternalConnectionStatus extends js.Any
object ExternalConnectionStatus {
  val Available = "Available".asInstanceOf[ExternalConnectionStatus]

  @inline def values = js.Array(Available)
}

@js.native
sealed trait HashAlgorithm extends js.Any
object HashAlgorithm {
  val MD5 = "MD5".asInstanceOf[HashAlgorithm]
  val `SHA-1` = "SHA-1".asInstanceOf[HashAlgorithm]
  val `SHA-256` = "SHA-256".asInstanceOf[HashAlgorithm]
  val `SHA-512` = "SHA-512".asInstanceOf[HashAlgorithm]

  @inline def values = js.Array(MD5, `SHA-1`, `SHA-256`, `SHA-512`)
}

@js.native
sealed trait PackageFormat extends js.Any
object PackageFormat {
  val npm = "npm".asInstanceOf[PackageFormat]
  val pypi = "pypi".asInstanceOf[PackageFormat]
  val maven = "maven".asInstanceOf[PackageFormat]
  val nuget = "nuget".asInstanceOf[PackageFormat]

  @inline def values = js.Array(npm, pypi, maven, nuget)
}

@js.native
sealed trait PackageVersionErrorCode extends js.Any
object PackageVersionErrorCode {
  val ALREADY_EXISTS = "ALREADY_EXISTS".asInstanceOf[PackageVersionErrorCode]
  val MISMATCHED_REVISION = "MISMATCHED_REVISION".asInstanceOf[PackageVersionErrorCode]
  val MISMATCHED_STATUS = "MISMATCHED_STATUS".asInstanceOf[PackageVersionErrorCode]
  val NOT_ALLOWED = "NOT_ALLOWED".asInstanceOf[PackageVersionErrorCode]
  val NOT_FOUND = "NOT_FOUND".asInstanceOf[PackageVersionErrorCode]
  val SKIPPED = "SKIPPED".asInstanceOf[PackageVersionErrorCode]

  @inline def values = js.Array(ALREADY_EXISTS, MISMATCHED_REVISION, MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED)
}

@js.native
sealed trait PackageVersionSortType extends js.Any
object PackageVersionSortType {
  val PUBLISHED_TIME = "PUBLISHED_TIME".asInstanceOf[PackageVersionSortType]

  @inline def values = js.Array(PUBLISHED_TIME)
}

@js.native
sealed trait PackageVersionStatus extends js.Any
object PackageVersionStatus {
  val Published = "Published".asInstanceOf[PackageVersionStatus]
  val Unfinished = "Unfinished".asInstanceOf[PackageVersionStatus]
  val Unlisted = "Unlisted".asInstanceOf[PackageVersionStatus]
  val Archived = "Archived".asInstanceOf[PackageVersionStatus]
  val Disposed = "Disposed".asInstanceOf[PackageVersionStatus]
  val Deleted = "Deleted".asInstanceOf[PackageVersionStatus]

  @inline def values = js.Array(Published, Unfinished, Unlisted, Archived, Disposed, Deleted)
}

