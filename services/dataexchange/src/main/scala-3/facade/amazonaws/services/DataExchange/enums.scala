package facade.amazonaws.services.dataexchange

import scalajs._

/** The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
  */
type AssetType = "S3_SNAPSHOT"
object AssetType {
  inline val S3_SNAPSHOT: "S3_SNAPSHOT" = "S3_SNAPSHOT"

  inline def values: js.Array[AssetType] = js.Array(S3_SNAPSHOT)
}

type Code = "ACCESS_DENIED_EXCEPTION" | "INTERNAL_SERVER_EXCEPTION" | "MALWARE_DETECTED" | "RESOURCE_NOT_FOUND_EXCEPTION" | "SERVICE_QUOTA_EXCEEDED_EXCEPTION" | "VALIDATION_EXCEPTION" | "MALWARE_SCAN_ENCRYPTED_FILE"
object Code {
  inline val ACCESS_DENIED_EXCEPTION: "ACCESS_DENIED_EXCEPTION" = "ACCESS_DENIED_EXCEPTION"
  inline val INTERNAL_SERVER_EXCEPTION: "INTERNAL_SERVER_EXCEPTION" = "INTERNAL_SERVER_EXCEPTION"
  inline val MALWARE_DETECTED: "MALWARE_DETECTED" = "MALWARE_DETECTED"
  inline val RESOURCE_NOT_FOUND_EXCEPTION: "RESOURCE_NOT_FOUND_EXCEPTION" = "RESOURCE_NOT_FOUND_EXCEPTION"
  inline val SERVICE_QUOTA_EXCEEDED_EXCEPTION: "SERVICE_QUOTA_EXCEEDED_EXCEPTION" = "SERVICE_QUOTA_EXCEEDED_EXCEPTION"
  inline val VALIDATION_EXCEPTION: "VALIDATION_EXCEPTION" = "VALIDATION_EXCEPTION"
  inline val MALWARE_SCAN_ENCRYPTED_FILE: "MALWARE_SCAN_ENCRYPTED_FILE" = "MALWARE_SCAN_ENCRYPTED_FILE"

  inline def values: js.Array[Code] = js.Array(
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
  inline val `Assets per revision`: "Assets per revision" = "Assets per revision"
  inline val `Asset size in GB`: "Asset size in GB" = "Asset size in GB"

  inline def values: js.Array[JobErrorLimitName] = js.Array(`Assets per revision`, `Asset size in GB`)
}

/** The types of resource which the job error can apply to.
  */
type JobErrorResourceTypes = "REVISION" | "ASSET"
object JobErrorResourceTypes {
  inline val REVISION: "REVISION" = "REVISION"
  inline val ASSET: "ASSET" = "ASSET"

  inline def values: js.Array[JobErrorResourceTypes] = js.Array(REVISION, ASSET)
}

/** A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers). When an owned data set is published in a product, AWS Data Exchange creates a copy of the data set. Subscribers can access that copy of the data set as an entitled data set.
  */
type Origin = "OWNED" | "ENTITLED"
object Origin {
  inline val OWNED: "OWNED" = "OWNED"
  inline val ENTITLED: "ENTITLED" = "ENTITLED"

  inline def values: js.Array[Origin] = js.Array(OWNED, ENTITLED)
}

/** The types of encryption supported in export jobs to Amazon S3.
  */
type ServerSideEncryptionTypes = "aws:kms" | "AES256"
object ServerSideEncryptionTypes {
  inline val `aws:kms`: "aws:kms" = "aws:kms"
  inline val AES256: "AES256" = "AES256"

  inline def values: js.Array[ServerSideEncryptionTypes] = js.Array(`aws:kms`, AES256)
}

type State = "WAITING" | "IN_PROGRESS" | "ERROR" | "COMPLETED" | "CANCELLED" | "TIMED_OUT"
object State {
  inline val WAITING: "WAITING" = "WAITING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val ERROR: "ERROR" = "ERROR"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val TIMED_OUT: "TIMED_OUT" = "TIMED_OUT"

  inline def values: js.Array[State] = js.Array(WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED, TIMED_OUT)
}

type Type = "IMPORT_ASSETS_FROM_S3" | "IMPORT_ASSET_FROM_SIGNED_URL" | "EXPORT_ASSETS_TO_S3" | "EXPORT_ASSET_TO_SIGNED_URL" | "EXPORT_REVISIONS_TO_S3"
object Type {
  inline val IMPORT_ASSETS_FROM_S3: "IMPORT_ASSETS_FROM_S3" = "IMPORT_ASSETS_FROM_S3"
  inline val IMPORT_ASSET_FROM_SIGNED_URL: "IMPORT_ASSET_FROM_SIGNED_URL" = "IMPORT_ASSET_FROM_SIGNED_URL"
  inline val EXPORT_ASSETS_TO_S3: "EXPORT_ASSETS_TO_S3" = "EXPORT_ASSETS_TO_S3"
  inline val EXPORT_ASSET_TO_SIGNED_URL: "EXPORT_ASSET_TO_SIGNED_URL" = "EXPORT_ASSET_TO_SIGNED_URL"
  inline val EXPORT_REVISIONS_TO_S3: "EXPORT_REVISIONS_TO_S3" = "EXPORT_REVISIONS_TO_S3"

  inline def values: js.Array[Type] = js.Array(IMPORT_ASSETS_FROM_S3, IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3, EXPORT_ASSET_TO_SIGNED_URL, EXPORT_REVISIONS_TO_S3)
}
