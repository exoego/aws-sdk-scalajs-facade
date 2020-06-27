package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object macie {
  type AWSAccountId                    = String
  type BucketName                      = String
  type ErrorCode                       = String
  type ExceptionMessage                = String
  type FailedS3Resources               = js.Array[FailedS3Resource]
  type FieldName                       = String
  type MaxResults                      = Int
  type MemberAccounts                  = js.Array[MemberAccount]
  type NextToken                       = String
  type Prefix                          = String
  type ResourceType                    = String
  type S3Resources                     = js.Array[S3Resource]
  type S3ResourcesClassification       = js.Array[S3ResourceClassification]
  type S3ResourcesClassificationUpdate = js.Array[S3ResourceClassificationUpdate]

  implicit final class MacieOps(private val service: Macie) extends AnyVal {

    @inline def associateMemberAccountFuture(params: AssociateMemberAccountRequest): Future[js.Object] =
      service.associateMemberAccount(params).promise().toFuture
    @inline def associateS3ResourcesFuture(params: AssociateS3ResourcesRequest): Future[AssociateS3ResourcesResult] =
      service.associateS3Resources(params).promise().toFuture
    @inline def disassociateMemberAccountFuture(params: DisassociateMemberAccountRequest): Future[js.Object] =
      service.disassociateMemberAccount(params).promise().toFuture
    @inline def disassociateS3ResourcesFuture(
        params: DisassociateS3ResourcesRequest
    ): Future[DisassociateS3ResourcesResult] = service.disassociateS3Resources(params).promise().toFuture
    @inline def listMemberAccountsFuture(params: ListMemberAccountsRequest): Future[ListMemberAccountsResult] =
      service.listMemberAccounts(params).promise().toFuture
    @inline def listS3ResourcesFuture(params: ListS3ResourcesRequest): Future[ListS3ResourcesResult] =
      service.listS3Resources(params).promise().toFuture
    @inline def updateS3ResourcesFuture(params: UpdateS3ResourcesRequest): Future[UpdateS3ResourcesResult] =
      service.updateS3Resources(params).promise().toFuture
  }
}

package macie {
  @js.native
  @JSImport("aws-sdk", "Macie")
  class Macie() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateMemberAccount(params: AssociateMemberAccountRequest): Request[js.Object]              = js.native
    def associateS3Resources(params: AssociateS3ResourcesRequest): Request[AssociateS3ResourcesResult] = js.native
    def disassociateMemberAccount(params: DisassociateMemberAccountRequest): Request[js.Object]        = js.native
    def disassociateS3Resources(params: DisassociateS3ResourcesRequest): Request[DisassociateS3ResourcesResult] =
      js.native
    def listMemberAccounts(params: ListMemberAccountsRequest): Request[ListMemberAccountsResult] = js.native
    def listS3Resources(params: ListS3ResourcesRequest): Request[ListS3ResourcesResult]          = js.native
    def updateS3Resources(params: UpdateS3ResourcesRequest): Request[UpdateS3ResourcesResult]    = js.native
  }

  /**
    * You do not have required permissions to access the requested resource.
    */
  @js.native
  trait AccessDeniedExceptionException extends js.Object {
    val message: ExceptionMessage
    val resourceType: ResourceType
  }

  @js.native
  @Factory
  trait AssociateMemberAccountRequest extends js.Object {
    var memberAccountId: AWSAccountId
  }

  @js.native
  @Factory
  trait AssociateS3ResourcesRequest extends js.Object {
    var s3Resources: S3ResourcesClassification
    var memberAccountId: js.UndefOr[AWSAccountId]
  }

  @js.native
  @Factory
  trait AssociateS3ResourcesResult extends js.Object {
    var failedS3Resources: js.UndefOr[FailedS3Resources]
  }

  /**
    * The classification type that Amazon Macie applies to the associated S3 resources.
    */
  @js.native
  @Factory
  trait ClassificationType extends js.Object {
    var continuous: S3ContinuousClassificationType
    var oneTime: S3OneTimeClassificationType
  }

  /**
    * The classification type that Amazon Macie applies to the associated S3 resources. At least one of the classification types (oneTime or continuous) must be specified.
    */
  @js.native
  @Factory
  trait ClassificationTypeUpdate extends js.Object {
    var continuous: js.UndefOr[S3ContinuousClassificationType]
    var oneTime: js.UndefOr[S3OneTimeClassificationType]
  }

  @js.native
  @Factory
  trait DisassociateMemberAccountRequest extends js.Object {
    var memberAccountId: AWSAccountId
  }

  @js.native
  @Factory
  trait DisassociateS3ResourcesRequest extends js.Object {
    var associatedS3Resources: S3Resources
    var memberAccountId: js.UndefOr[AWSAccountId]
  }

  @js.native
  @Factory
  trait DisassociateS3ResourcesResult extends js.Object {
    var failedS3Resources: js.UndefOr[FailedS3Resources]
  }

  /**
    * Includes details about the failed S3 resources.
    */
  @js.native
  @Factory
  trait FailedS3Resource extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ExceptionMessage]
    var failedItem: js.UndefOr[S3Resource]
  }

  /**
    * Internal server error.
    */
  @js.native
  trait InternalExceptionException extends js.Object {
    val errorCode: ErrorCode
    val message: ExceptionMessage
  }

  /**
    * The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
    */
  @js.native
  trait InvalidInputExceptionException extends js.Object {
    val errorCode: ErrorCode
    val message: ExceptionMessage
    val fieldName: FieldName
  }

  /**
    * The request was rejected because it attempted to create resources beyond the current AWS account limits. The error code describes the limit exceeded.
    */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val errorCode: ErrorCode
    val message: ExceptionMessage
    val resourceType: ResourceType
  }

  @js.native
  @Factory
  trait ListMemberAccountsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListMemberAccountsResult extends js.Object {
    var memberAccounts: js.UndefOr[MemberAccounts]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListS3ResourcesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var memberAccountId: js.UndefOr[AWSAccountId]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListS3ResourcesResult extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var s3Resources: js.UndefOr[S3ResourcesClassification]
  }

  /**
    * Contains information about the Amazon Macie member account.
    */
  @js.native
  @Factory
  trait MemberAccount extends js.Object {
    var accountId: js.UndefOr[AWSAccountId]
  }

  @js.native
  sealed trait S3ContinuousClassificationType extends js.Any
  object S3ContinuousClassificationType extends js.Object {
    val FULL = "FULL".asInstanceOf[S3ContinuousClassificationType]

    val values = js.Object.freeze(js.Array(FULL))
  }

  @js.native
  sealed trait S3OneTimeClassificationType extends js.Any
  object S3OneTimeClassificationType extends js.Object {
    val FULL = "FULL".asInstanceOf[S3OneTimeClassificationType]
    val NONE = "NONE".asInstanceOf[S3OneTimeClassificationType]

    val values = js.Object.freeze(js.Array(FULL, NONE))
  }

  /**
    * Contains information about the S3 resource. This data type is used as a request parameter in the DisassociateS3Resources action and can be used as a response parameter in the AssociateS3Resources and UpdateS3Resources actions.
    */
  @js.native
  @Factory
  trait S3Resource extends js.Object {
    var bucketName: BucketName
    var prefix: js.UndefOr[Prefix]
  }

  /**
    * The S3 resources that you want to associate with Amazon Macie for monitoring and data classification. This data type is used as a request parameter in the AssociateS3Resources action and a response parameter in the ListS3Resources action.
    */
  @js.native
  @Factory
  trait S3ResourceClassification extends js.Object {
    var bucketName: BucketName
    var classificationType: ClassificationType
    var prefix: js.UndefOr[Prefix]
  }

  /**
    * The S3 resources whose classification types you want to update. This data type is used as a request parameter in the UpdateS3Resources action.
    */
  @js.native
  @Factory
  trait S3ResourceClassificationUpdate extends js.Object {
    var bucketName: BucketName
    var classificationTypeUpdate: ClassificationTypeUpdate
    var prefix: js.UndefOr[Prefix]
  }

  @js.native
  @Factory
  trait UpdateS3ResourcesRequest extends js.Object {
    var s3ResourcesUpdate: S3ResourcesClassificationUpdate
    var memberAccountId: js.UndefOr[AWSAccountId]
  }

  @js.native
  @Factory
  trait UpdateS3ResourcesResult extends js.Object {
    var failedS3Resources: js.UndefOr[FailedS3Resources]
  }
}
