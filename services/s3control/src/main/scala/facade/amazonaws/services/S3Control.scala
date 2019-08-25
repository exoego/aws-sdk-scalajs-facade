package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object s3control {
  type AccountId = String
  type Setting   = Boolean

  implicit final class S3ControlOps(val service: S3Control) extends AnyVal {

    def deletePublicAccessBlockFuture(params: DeletePublicAccessBlockRequest): Future[js.Object] =
      service.deletePublicAccessBlock(params).promise.toFuture
    def getPublicAccessBlockFuture(params: GetPublicAccessBlockRequest): Future[GetPublicAccessBlockOutput] =
      service.getPublicAccessBlock(params).promise.toFuture
    def putPublicAccessBlockFuture(params: PutPublicAccessBlockRequest): Future[js.Object] =
      service.putPublicAccessBlock(params).promise.toFuture
  }
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
    def apply(
        AccountId: AccountId
    ): DeletePublicAccessBlockRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeletePublicAccessBlockRequest]
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
      val __obj = js.Dictionary.empty[js.Any]
      PublicAccessBlockConfiguration.foreach(
        __v => __obj.update("PublicAccessBlockConfiguration", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetPublicAccessBlockOutput]
    }
  }

  @js.native
  trait GetPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
  }

  object GetPublicAccessBlockRequest {
    def apply(
        AccountId: AccountId
    ): GetPublicAccessBlockRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountId" -> AccountId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPublicAccessBlockRequest]
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
    def apply(
        BlockPublicAcls: js.UndefOr[Setting] = js.undefined,
        BlockPublicPolicy: js.UndefOr[Setting] = js.undefined,
        IgnorePublicAcls: js.UndefOr[Setting] = js.undefined,
        RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
    ): PublicAccessBlockConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      BlockPublicAcls.foreach(__v => __obj.update("BlockPublicAcls", __v.asInstanceOf[js.Any]))
      BlockPublicPolicy.foreach(__v => __obj.update("BlockPublicPolicy", __v.asInstanceOf[js.Any]))
      IgnorePublicAcls.foreach(__v => __obj.update("IgnorePublicAcls", __v.asInstanceOf[js.Any]))
      RestrictPublicBuckets.foreach(__v => __obj.update("RestrictPublicBuckets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicAccessBlockConfiguration]
    }
  }

  @js.native
  trait PutPublicAccessBlockRequest extends js.Object {
    var AccountId: AccountId
    var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
  }

  object PutPublicAccessBlockRequest {
    def apply(
        AccountId: AccountId,
        PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
    ): PutPublicAccessBlockRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccountId"                      -> AccountId.asInstanceOf[js.Any],
        "PublicAccessBlockConfiguration" -> PublicAccessBlockConfiguration.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutPublicAccessBlockRequest]
    }
  }
}
