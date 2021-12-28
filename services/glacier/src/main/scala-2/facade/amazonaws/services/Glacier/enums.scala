package facade.amazonaws.services.glacier

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ActionCode extends js.Any
object ActionCode {
  val ArchiveRetrieval = "ArchiveRetrieval".asInstanceOf[ActionCode]
  val InventoryRetrieval = "InventoryRetrieval".asInstanceOf[ActionCode]
  val Select = "Select".asInstanceOf[ActionCode]

  @inline def values = js.Array(ArchiveRetrieval, InventoryRetrieval, Select)
}

@js.native
sealed trait CannedACL extends js.Any
object CannedACL {
  val `private` = "private".asInstanceOf[CannedACL]
  val `public-read` = "public-read".asInstanceOf[CannedACL]
  val `public-read-write` = "public-read-write".asInstanceOf[CannedACL]
  val `aws-exec-read` = "aws-exec-read".asInstanceOf[CannedACL]
  val `authenticated-read` = "authenticated-read".asInstanceOf[CannedACL]
  val `bucket-owner-read` = "bucket-owner-read".asInstanceOf[CannedACL]
  val `bucket-owner-full-control` = "bucket-owner-full-control".asInstanceOf[CannedACL]

  @inline def values = js.Array(`private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`)
}

@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val `aws:kms` = "aws:kms".asInstanceOf[EncryptionType]
  val AES256 = "AES256".asInstanceOf[EncryptionType]

  @inline def values = js.Array(`aws:kms`, AES256)
}

@js.native
sealed trait ExpressionType extends js.Any
object ExpressionType {
  val SQL = "SQL".asInstanceOf[ExpressionType]

  @inline def values = js.Array(SQL)
}

@js.native
sealed trait FileHeaderInfo extends js.Any
object FileHeaderInfo {
  val USE = "USE".asInstanceOf[FileHeaderInfo]
  val IGNORE = "IGNORE".asInstanceOf[FileHeaderInfo]
  val NONE = "NONE".asInstanceOf[FileHeaderInfo]

  @inline def values = js.Array(USE, IGNORE, NONE)
}

@js.native
sealed trait Permission extends js.Any
object Permission {
  val FULL_CONTROL = "FULL_CONTROL".asInstanceOf[Permission]
  val WRITE = "WRITE".asInstanceOf[Permission]
  val WRITE_ACP = "WRITE_ACP".asInstanceOf[Permission]
  val READ = "READ".asInstanceOf[Permission]
  val READ_ACP = "READ_ACP".asInstanceOf[Permission]

  @inline def values = js.Array(FULL_CONTROL, WRITE, WRITE_ACP, READ, READ_ACP)
}

@js.native
sealed trait QuoteFields extends js.Any
object QuoteFields {
  val ALWAYS = "ALWAYS".asInstanceOf[QuoteFields]
  val ASNEEDED = "ASNEEDED".asInstanceOf[QuoteFields]

  @inline def values = js.Array(ALWAYS, ASNEEDED)
}

@js.native
sealed trait StatusCode extends js.Any
object StatusCode {
  val InProgress = "InProgress".asInstanceOf[StatusCode]
  val Succeeded = "Succeeded".asInstanceOf[StatusCode]
  val Failed = "Failed".asInstanceOf[StatusCode]

  @inline def values = js.Array(InProgress, Succeeded, Failed)
}

@js.native
sealed trait StorageClass extends js.Any
object StorageClass {
  val STANDARD = "STANDARD".asInstanceOf[StorageClass]
  val REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY".asInstanceOf[StorageClass]
  val STANDARD_IA = "STANDARD_IA".asInstanceOf[StorageClass]

  @inline def values = js.Array(STANDARD, REDUCED_REDUNDANCY, STANDARD_IA)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val AmazonCustomerByEmail = "AmazonCustomerByEmail".asInstanceOf[Type]
  val CanonicalUser = "CanonicalUser".asInstanceOf[Type]
  val Group = "Group".asInstanceOf[Type]

  @inline def values = js.Array(AmazonCustomerByEmail, CanonicalUser, Group)
}
