package facade.amazonaws.services.dataexchange

import scalajs.js

/** The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
  */
@js.native
sealed trait AssetType extends js.Any
object AssetType {
  val S3_SNAPSHOT = "S3_SNAPSHOT".asInstanceOf[AssetType]

  @inline def values: js.Array[AssetType] = js.Array(S3_SNAPSHOT)
}

@js.native
sealed trait Code extends js.Any
object Code {
  val ACCESS_DENIED_EXCEPTION = "ACCESS_DENIED_EXCEPTION".asInstanceOf[Code]
  val INTERNAL_SERVER_EXCEPTION = "INTERNAL_SERVER_EXCEPTION".asInstanceOf[Code]
  val MALWARE_DETECTED = "MALWARE_DETECTED".asInstanceOf[Code]
  val RESOURCE_NOT_FOUND_EXCEPTION = "RESOURCE_NOT_FOUND_EXCEPTION".asInstanceOf[Code]
  val SERVICE_QUOTA_EXCEEDED_EXCEPTION = "SERVICE_QUOTA_EXCEEDED_EXCEPTION".asInstanceOf[Code]
  val VALIDATION_EXCEPTION = "VALIDATION_EXCEPTION".asInstanceOf[Code]
  val MALWARE_SCAN_ENCRYPTED_FILE = "MALWARE_SCAN_ENCRYPTED_FILE".asInstanceOf[Code]

  @inline def values: js.Array[Code] = js.Array(
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
@js.native
sealed trait JobErrorLimitName extends js.Any
object JobErrorLimitName {
  val `Assets per revision` = "Assets per revision".asInstanceOf[JobErrorLimitName]
  val `Asset size in GB` = "Asset size in GB".asInstanceOf[JobErrorLimitName]

  @inline def values: js.Array[JobErrorLimitName] = js.Array(`Assets per revision`, `Asset size in GB`)
}

/** The types of resource which the job error can apply to.
  */
@js.native
sealed trait JobErrorResourceTypes extends js.Any
object JobErrorResourceTypes {
  val REVISION = "REVISION".asInstanceOf[JobErrorResourceTypes]
  val ASSET = "ASSET".asInstanceOf[JobErrorResourceTypes]

  @inline def values: js.Array[JobErrorResourceTypes] = js.Array(REVISION, ASSET)
}

/** A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers). When an owned data set is published in a product, AWS Data Exchange creates a copy of the data set. Subscribers can access that copy of the data set as an entitled data set.
  */
@js.native
sealed trait Origin extends js.Any
object Origin {
  val OWNED = "OWNED".asInstanceOf[Origin]
  val ENTITLED = "ENTITLED".asInstanceOf[Origin]

  @inline def values: js.Array[Origin] = js.Array(OWNED, ENTITLED)
}

/** The types of encryption supported in export jobs to Amazon S3.
  */
@js.native
sealed trait ServerSideEncryptionTypes extends js.Any
object ServerSideEncryptionTypes {
  val `aws:kms` = "aws:kms".asInstanceOf[ServerSideEncryptionTypes]
  val AES256 = "AES256".asInstanceOf[ServerSideEncryptionTypes]

  @inline def values: js.Array[ServerSideEncryptionTypes] = js.Array(`aws:kms`, AES256)
}

@js.native
sealed trait State extends js.Any
object State {
  val WAITING = "WAITING".asInstanceOf[State]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[State]
  val ERROR = "ERROR".asInstanceOf[State]
  val COMPLETED = "COMPLETED".asInstanceOf[State]
  val CANCELLED = "CANCELLED".asInstanceOf[State]
  val TIMED_OUT = "TIMED_OUT".asInstanceOf[State]

  @inline def values: js.Array[State] = js.Array(WAITING, IN_PROGRESS, ERROR, COMPLETED, CANCELLED, TIMED_OUT)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val IMPORT_ASSETS_FROM_S3 = "IMPORT_ASSETS_FROM_S3".asInstanceOf[Type]
  val IMPORT_ASSET_FROM_SIGNED_URL = "IMPORT_ASSET_FROM_SIGNED_URL".asInstanceOf[Type]
  val EXPORT_ASSETS_TO_S3 = "EXPORT_ASSETS_TO_S3".asInstanceOf[Type]
  val EXPORT_ASSET_TO_SIGNED_URL = "EXPORT_ASSET_TO_SIGNED_URL".asInstanceOf[Type]
  val EXPORT_REVISIONS_TO_S3 = "EXPORT_REVISIONS_TO_S3".asInstanceOf[Type]

  @inline def values: js.Array[Type] = js.Array(IMPORT_ASSETS_FROM_S3, IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3, EXPORT_ASSET_TO_SIGNED_URL, EXPORT_REVISIONS_TO_S3)
}
