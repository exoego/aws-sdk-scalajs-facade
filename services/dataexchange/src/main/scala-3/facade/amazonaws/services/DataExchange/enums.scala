package facade.amazonaws.services.dataexchange

import scalajs._

/** The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
  */
type AssetType = "S3_SNAPSHOT"
object AssetType {
  val S3_SNAPSHOT: "S3_SNAPSHOT" = "S3_SNAPSHOT"

  @inline def values = js.Array[AssetType](S3_SNAPSHOT)
}

type Code = "ACCESS_DENIED_EXCEPTION" | "INTERNAL_SERVER_EXCEPTION" | "MALWARE_DETECTED" | "RESOURCE_NOT_FOUND_EXCEPTION" | "SERVICE_QUOTA_EXCEEDED_EXCEPTION" | "VALIDATION_EXCEPTION" | "MALWARE_SCAN_ENCRYPTED_FILE"
object Code {
  val ACCESS_DENIED_EXCEPTION: "ACCESS_DENIED_EXCEPTION" = "ACCESS_DENIED_EXCEPTION"
  val INTERNAL_SERVER_EXCEPTION: "INTERNAL_SERVER_EXCEPTION" = "INTERNAL_SERVER_EXCEPTION"
  val MALWARE_DETECTED: "MALWARE_DETECTED" = "MALWARE_DETECTED"
  val RESOURCE_NOT_FOUND_EXCEPTION: "RESOURCE_NOT_FOUND_EXCEPTION" = "RESOURCE_NOT_FOUND_EXCEPTION"
  val SERVICE_QUOTA_EXCEEDED_EXCEPTION: "SERVICE_QUOTA_EXCEEDED_EXCEPTION" = "SERVICE_QUOTA_EXCEEDED_EXCEPTION"
  val VALIDATION_EXCEPTION: "VALIDATION_EXCEPTION" = "VALIDATION_EXCEPTION"
  val MALWARE_SCAN_ENCRYPTED_FILE: "MALWARE_SCAN_ENCRYPTED_FILE" = "MALWARE_SCAN_ENCRYPTED_FILE"

  @inline def values = js.Array[Code](
    ACCESS_DENIED_EXCEPTION,
    INTERNAL_SERVER_EXCEPTION,
    MALWARE_DETECTED,
    RESOURCE_NOT_FOUND_EXCEPTION,
    SERVICE_QUOTA_EXCEEDED_EXCEPTION,
    VALIDATION_EXCEPTION,
    MALWARE_SCAN_ENCRYPTED_FILE
  )
}

/** The name of the limit that was reached.
  */
type JobErrorLimitName = "Assets per revision" | "Asset size in GB"
object JobErrorLimitName {
  val `Assets per revision`: "Assets per revision" = "Assets per revision"
  val `Asset size in GB`: "Asset size in GB" = "Asset size in GB"

  @inline def values = js.Array[JobErrorLimitName](`Assets per revision`, `Asset size in GB`)
}

/** The types of resource which the job error can apply to.
  */
type JobErrorResourceTypes = "REVISION" | "ASSET"
object JobErrorResourceTypes {
  val REVISION: "REVISION" = "REVISION"
  val ASSET: "ASSET" = "ASSET"

  @inline def values = js.Array[JobErrorResourceTypes](REVISION, ASSET)
}

/** A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers). When an owned data set is published in a product, AWS Data Exchange creates a copy of the data set. Subscribers can access that copy of the data set as an entitled data set.
  */
type Origin = "OWNED" | "ENTITLED"
object Origin {
  val OWNED: "OWNED" = "OWNED"
  val ENTITLED: "ENTITLED" = "ENTITLED"

  @inline def values = js.Array[Origin](OWNED, ENTITLED)
}

/** The types of encryption supported in export jobs to Amazon S3.
  */
type ServerSideEncryptionTypes = "aws:kms" | "AES256"
object ServerSideEncryptionTypes {
  val `aws:kms`: "aws:kms" = "aws:kms"
  val AES256: "AES256" = "AES256"

  @inline def values = js.Array[ServerSideEncryptionTypes](`aws:kms`, AES256)
}

type State = "WAITING" | "IN_PROGRESS" | "ERROR" | "COMPLETED" | "CANCELLED" | "TIMED_OUT"
object State {
  val WAITING: "WAITING" = "WAITING"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val ERROR: "ERROR" = "ERROR"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  @inline def values = js.Array[State](WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED, TIMED_OUT)
}

type Type = "IMPORT_ASSETS_FROM_S3" | "IMPORT_ASSET_FROM_SIGNED_URL" | "EXPORT_ASSETS_TO_S3" | "EXPORT_ASSET_TO_SIGNED_URL" | "EXPORT_REVISIONS_TO_S3"
object Type {
  val IMPORT_ASSETS_FROM_S3: "IMPORT_ASSETS_FROM_S3" = "IMPORT_ASSETS_FROM_S3"
  val IMPORT_ASSET_FROM_SIGNED_URL: "IMPORT_ASSET_FROM_SIGNED_URL" = "IMPORT_ASSET_FROM_SIGNED_URL"
  val EXPORT_ASSETS_TO_S3: "EXPORT_ASSETS_TO_S3" = "EXPORT_ASSETS_TO_S3"
  val EXPORT_ASSET_TO_SIGNED_URL: "EXPORT_ASSET_TO_SIGNED_URL" = "EXPORT_ASSET_TO_SIGNED_URL"
  val EXPORT_REVISIONS_TO_S3: "EXPORT_REVISIONS_TO_S3" = "EXPORT_REVISIONS_TO_S3"

  @inline def values = js.Array[Type](IMPORT_ASSETS_FROM_S3, IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3, EXPORT_ASSET_TO_SIGNED_URL, EXPORT_REVISIONS_TO_S3)
}
