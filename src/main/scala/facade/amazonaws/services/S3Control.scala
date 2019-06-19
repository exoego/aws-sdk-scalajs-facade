package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object s3control {
  type AccountId = String
  type Setting   = Boolean
}

package s3control {
  @js.native
  @JSImport("aws-sdk", "S3Control")
  class S3Control() extends js.Object {
    def this(config: AWSConfig) = this()

    def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object]            = js.native
    def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput] = js.native
    def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object]                  = js.native
  }

  @js.native
  trait DeletePublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
  }

  object DeletePublicAccessBlockRequest {
    def apply(AccountId: AccountId): DeletePublicAccessBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountId" -> AccountId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePublicAccessBlockRequest]
    }
  }

  @js.native
  trait GetPublicAccessBlockOutput extends js.Object {
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration]
  }

  object GetPublicAccessBlockOutput {
    def apply(
        PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined
    ): GetPublicAccessBlockOutput = {
      val _fields =
        IndexedSeq[(String, js.Any)]("PublicAccessBlockConfiguration" -> PublicAccessBlockConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPublicAccessBlockOutput]
    }
  }

  @js.native
  trait GetPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
  }

  object GetPublicAccessBlockRequest {
    def apply(AccountId: AccountId): GetPublicAccessBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("AccountId" -> AccountId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPublicAccessBlockRequest]
    }
  }

  /**
    * The container element for all Public Access Block configuration options. You can enable the configuration options in any combination.
    *  Amazon S3 considers a bucket policy public unless at least one of the following conditions is true:
    *  <ol> * The policy limits access to a set of CIDRs using <code>aws:SourceIp</code>. For more information on CIDR, see [[http://www.rfc-editor.org/rfc/rfc4632.txt|http://www.rfc-editor.org/rfc/rfc4632.txt]]
    *  * The policy grants permissions, not including any "bad actions," to one of the following:
    * <li> A fixed AWS principal, user, role, or service principal
    *  * A fixed <code>aws:SourceArn</code>
    *  * A fixed <code>aws:SourceVpc</code>
    *  * A fixed <code>aws:SourceVpce</code>
    *  * A fixed <code>aws:SourceOwner</code>
    *  * A fixed <code>aws:SourceAccount</code>
    *  * A fixed value of <code>s3:x-amz-server-side-encryption-aws-kms-key-id</code>
    *  * A fixed value of <code>aws:userid</code> outside the pattern "<code>AROLEID:*</code>"
    * </li> </ol> "Bad actions" are those that could expose the data inside a bucket to reads or writes by the public. These actions are <code>s3:Get*</code>, <code>s3:List*</code>, <code>s3:AbortMultipartUpload</code>, <code>s3:Delete*</code>, <code>s3:Put*</code>, and <code>s3:RestoreObject</code>.
    *  The star notation for bad actions indicates that all matching operations are considered bad actions. For example, because <code>s3:Get*</code> is a bad action, <code>s3:GetObject</code>, <code>s3:GetObjectVersion</code>, and <code>s3:GetObjectAcl</code> are all bad actions.
    */
  @js.native
  trait PublicAccessBlockConfiguration extends js.Object {
    var BlockPublicAcls: js.UndefOr[Setting]
    var BlockPublicPolicy: js.UndefOr[Setting]
    var IgnorePublicAcls: js.UndefOr[Setting]
    var RestrictPublicBuckets: js.UndefOr[Setting]
  }

  object PublicAccessBlockConfiguration {
    def apply(BlockPublicAcls: js.UndefOr[Setting] = js.undefined,
              BlockPublicPolicy: js.UndefOr[Setting] = js.undefined,
              IgnorePublicAcls: js.UndefOr[Setting] = js.undefined,
              RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined): PublicAccessBlockConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BlockPublicAcls" -> BlockPublicAcls.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BlockPublicPolicy" -> BlockPublicPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IgnorePublicAcls" -> IgnorePublicAcls.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RestrictPublicBuckets" -> RestrictPublicBuckets.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicAccessBlockConfiguration]
    }
  }

  @js.native
  trait PutPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
    var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
  }

  object PutPublicAccessBlockRequest {
    def apply(AccountId: AccountId,
              PublicAccessBlockConfiguration: PublicAccessBlockConfiguration): PutPublicAccessBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccountId"                      -> AccountId.asInstanceOf[js.Any],
        "PublicAccessBlockConfiguration" -> PublicAccessBlockConfiguration.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutPublicAccessBlockRequest]
    }
  }
}
