package facade.amazonaws.services.dataexchange

import scalajs.js

@js.native
sealed trait AssetType extends js.Any
object AssetType {
  val S3_SNAPSHOT = "S3_SNAPSHOT".asInstanceOf[AssetType]
  val REDSHIFT_DATA_SHARE = "REDSHIFT_DATA_SHARE".asInstanceOf[AssetType]
  val API_GATEWAY_API = "API_GATEWAY_API".asInstanceOf[AssetType]
  val S3_DATA_ACCESS = "S3_DATA_ACCESS".asInstanceOf[AssetType]
  val LAKE_FORMATION_DATA_PERMISSION = "LAKE_FORMATION_DATA_PERMISSION".asInstanceOf[AssetType]

  @inline def values: js.Array[AssetType] = js.Array(S3_SNAPSHOT, REDSHIFT_DATA_SHARE, API_GATEWAY_API, S3_DATA_ACCESS, LAKE_FORMATION_DATA_PERMISSION)
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

@js.native
sealed trait DatabaseLFTagPolicyPermission extends js.Any
object DatabaseLFTagPolicyPermission {
  val DESCRIBE = "DESCRIBE".asInstanceOf[DatabaseLFTagPolicyPermission]

  @inline def values: js.Array[DatabaseLFTagPolicyPermission] = js.Array(DESCRIBE)
}

@js.native
sealed trait JobErrorLimitName extends js.Any
object JobErrorLimitName {
  val `Assets per revision` = "Assets per revision".asInstanceOf[JobErrorLimitName]
  val `Asset size in GB` = "Asset size in GB".asInstanceOf[JobErrorLimitName]
  val `Amazon Redshift datashare assets per revision` = "Amazon Redshift datashare assets per revision".asInstanceOf[JobErrorLimitName]
  val `AWS Lake Formation data permission assets per revision` = "AWS Lake Formation data permission assets per revision".asInstanceOf[JobErrorLimitName]
  val `Amazon S3 data access assets per revision` = "Amazon S3 data access assets per revision".asInstanceOf[JobErrorLimitName]

  @inline def values: js.Array[JobErrorLimitName] = js.Array(
    `Assets per revision`,
    `Asset size in GB`,
    `Amazon Redshift datashare assets per revision`,
    `AWS Lake Formation data permission assets per revision`,
    `Amazon S3 data access assets per revision`
  )
}

@js.native
sealed trait JobErrorResourceTypes extends js.Any
object JobErrorResourceTypes {
  val REVISION = "REVISION".asInstanceOf[JobErrorResourceTypes]
  val ASSET = "ASSET".asInstanceOf[JobErrorResourceTypes]
  val DATA_SET = "DATA_SET".asInstanceOf[JobErrorResourceTypes]

  @inline def values: js.Array[JobErrorResourceTypes] = js.Array(REVISION, ASSET, DATA_SET)
}

@js.native
sealed trait LFPermission extends js.Any
object LFPermission {
  val DESCRIBE = "DESCRIBE".asInstanceOf[LFPermission]
  val SELECT = "SELECT".asInstanceOf[LFPermission]

  @inline def values: js.Array[LFPermission] = js.Array(DESCRIBE, SELECT)
}

@js.native
sealed trait LFResourceType extends js.Any
object LFResourceType {
  val TABLE = "TABLE".asInstanceOf[LFResourceType]
  val DATABASE = "DATABASE".asInstanceOf[LFResourceType]

  @inline def values: js.Array[LFResourceType] = js.Array(TABLE, DATABASE)
}

@js.native
sealed trait LakeFormationDataPermissionType extends js.Any
object LakeFormationDataPermissionType {
  val LFTagPolicy = "LFTagPolicy".asInstanceOf[LakeFormationDataPermissionType]

  @inline def values: js.Array[LakeFormationDataPermissionType] = js.Array(LFTagPolicy)
}

@js.native
sealed trait Origin extends js.Any
object Origin {
  val OWNED = "OWNED".asInstanceOf[Origin]
  val ENTITLED = "ENTITLED".asInstanceOf[Origin]

  @inline def values: js.Array[Origin] = js.Array(OWNED, ENTITLED)
}

@js.native
sealed trait ProtocolType extends js.Any
object ProtocolType {
  val REST = "REST".asInstanceOf[ProtocolType]

  @inline def values: js.Array[ProtocolType] = js.Array(REST)
}

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
sealed trait TableTagPolicyLFPermission extends js.Any
object TableTagPolicyLFPermission {
  val DESCRIBE = "DESCRIBE".asInstanceOf[TableTagPolicyLFPermission]
  val SELECT = "SELECT".asInstanceOf[TableTagPolicyLFPermission]

  @inline def values: js.Array[TableTagPolicyLFPermission] = js.Array(DESCRIBE, SELECT)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val IMPORT_ASSETS_FROM_S3 = "IMPORT_ASSETS_FROM_S3".asInstanceOf[Type]
  val IMPORT_ASSET_FROM_SIGNED_URL = "IMPORT_ASSET_FROM_SIGNED_URL".asInstanceOf[Type]
  val EXPORT_ASSETS_TO_S3 = "EXPORT_ASSETS_TO_S3".asInstanceOf[Type]
  val EXPORT_ASSET_TO_SIGNED_URL = "EXPORT_ASSET_TO_SIGNED_URL".asInstanceOf[Type]
  val EXPORT_REVISIONS_TO_S3 = "EXPORT_REVISIONS_TO_S3".asInstanceOf[Type]
  val IMPORT_ASSETS_FROM_REDSHIFT_DATA_SHARES = "IMPORT_ASSETS_FROM_REDSHIFT_DATA_SHARES".asInstanceOf[Type]
  val IMPORT_ASSET_FROM_API_GATEWAY_API = "IMPORT_ASSET_FROM_API_GATEWAY_API".asInstanceOf[Type]
  val CREATE_S3_DATA_ACCESS_FROM_S3_BUCKET = "CREATE_S3_DATA_ACCESS_FROM_S3_BUCKET".asInstanceOf[Type]
  val IMPORT_ASSETS_FROM_LAKE_FORMATION_TAG_POLICY = "IMPORT_ASSETS_FROM_LAKE_FORMATION_TAG_POLICY".asInstanceOf[Type]

  @inline def values: js.Array[Type] = js.Array(
    IMPORT_ASSETS_FROM_S3,
    IMPORT_ASSET_FROM_SIGNED_URL,
    EXPORT_ASSETS_TO_S3,
    EXPORT_ASSET_TO_SIGNED_URL,
    EXPORT_REVISIONS_TO_S3,
    IMPORT_ASSETS_FROM_REDSHIFT_DATA_SHARES,
    IMPORT_ASSET_FROM_API_GATEWAY_API,
    CREATE_S3_DATA_ACCESS_FROM_S3_BUCKET,
    IMPORT_ASSETS_FROM_LAKE_FORMATION_TAG_POLICY
  )
}
