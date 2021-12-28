package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object macie {
  type AWSAccountId = String
  type BucketName = String
  type ErrorCode = String
  type ExceptionMessage = String
  type FailedS3Resources = js.Array[FailedS3Resource]
  type MaxResults = Int
  type MemberAccounts = js.Array[MemberAccount]
  type NextToken = String
  type Prefix = String
  type S3Resources = js.Array[S3Resource]
  type S3ResourcesClassification = js.Array[S3ResourceClassification]
  type S3ResourcesClassificationUpdate = js.Array[S3ResourceClassificationUpdate]

  final class MacieOps(private val service: Macie) extends AnyVal {

    @inline def associateMemberAccountFuture(params: AssociateMemberAccountRequest): Future[js.Object] = service.associateMemberAccount(params).promise().toFuture
    @inline def associateS3ResourcesFuture(params: AssociateS3ResourcesRequest): Future[AssociateS3ResourcesResult] = service.associateS3Resources(params).promise().toFuture
    @inline def disassociateMemberAccountFuture(params: DisassociateMemberAccountRequest): Future[js.Object] = service.disassociateMemberAccount(params).promise().toFuture
    @inline def disassociateS3ResourcesFuture(params: DisassociateS3ResourcesRequest): Future[DisassociateS3ResourcesResult] = service.disassociateS3Resources(params).promise().toFuture
    @inline def listMemberAccountsFuture(params: ListMemberAccountsRequest): Future[ListMemberAccountsResult] = service.listMemberAccounts(params).promise().toFuture
    @inline def listS3ResourcesFuture(params: ListS3ResourcesRequest): Future[ListS3ResourcesResult] = service.listS3Resources(params).promise().toFuture
    @inline def updateS3ResourcesFuture(params: UpdateS3ResourcesRequest): Future[UpdateS3ResourcesResult] = service.updateS3Resources(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/macie", JSImport.Namespace, "AWS.Macie")
  class Macie() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateMemberAccount(params: AssociateMemberAccountRequest): Request[js.Object] = js.native
    def associateS3Resources(params: AssociateS3ResourcesRequest): Request[AssociateS3ResourcesResult] = js.native
    def disassociateMemberAccount(params: DisassociateMemberAccountRequest): Request[js.Object] = js.native
    def disassociateS3Resources(params: DisassociateS3ResourcesRequest): Request[DisassociateS3ResourcesResult] = js.native
    def listMemberAccounts(params: ListMemberAccountsRequest): Request[ListMemberAccountsResult] = js.native
    def listS3Resources(params: ListS3ResourcesRequest): Request[ListS3ResourcesResult] = js.native
    def updateS3Resources(params: UpdateS3ResourcesRequest): Request[UpdateS3ResourcesResult] = js.native
  }
  object Macie {
    @inline implicit def toOps(service: Macie): MacieOps = {
      new MacieOps(service)
    }
  }

  @js.native
  trait AssociateMemberAccountRequest extends js.Object {
    var memberAccountId: AWSAccountId
  }

  object AssociateMemberAccountRequest {
    @inline
    def apply(
        memberAccountId: AWSAccountId
    ): AssociateMemberAccountRequest = {
      val __obj = js.Dynamic.literal(
        "memberAccountId" -> memberAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateMemberAccountRequest]
    }
  }

  @js.native
  trait AssociateS3ResourcesRequest extends js.Object {
    var s3Resources: S3ResourcesClassification
    var memberAccountId: js.UndefOr[AWSAccountId]
  }

  object AssociateS3ResourcesRequest {
    @inline
    def apply(
        s3Resources: S3ResourcesClassification,
        memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
    ): AssociateS3ResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "s3Resources" -> s3Resources.asInstanceOf[js.Any]
      )

      memberAccountId.foreach(__v => __obj.updateDynamic("memberAccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateS3ResourcesRequest]
    }
  }

  @js.native
  trait AssociateS3ResourcesResult extends js.Object {
    var failedS3Resources: js.UndefOr[FailedS3Resources]
  }

  object AssociateS3ResourcesResult {
    @inline
    def apply(
        failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
    ): AssociateS3ResourcesResult = {
      val __obj = js.Dynamic.literal()
      failedS3Resources.foreach(__v => __obj.updateDynamic("failedS3Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateS3ResourcesResult]
    }
  }

  /** The classification type that Amazon Macie Classic applies to the associated S3 resources.
    */
  @js.native
  trait ClassificationType extends js.Object {
    var continuous: S3ContinuousClassificationType
    var oneTime: S3OneTimeClassificationType
  }

  object ClassificationType {
    @inline
    def apply(
        continuous: S3ContinuousClassificationType,
        oneTime: S3OneTimeClassificationType
    ): ClassificationType = {
      val __obj = js.Dynamic.literal(
        "continuous" -> continuous.asInstanceOf[js.Any],
        "oneTime" -> oneTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClassificationType]
    }
  }

  /** The classification type that Amazon Macie Classic applies to the associated S3 resources. At least one of the classification types (oneTime or continuous) must be specified.
    */
  @js.native
  trait ClassificationTypeUpdate extends js.Object {
    var continuous: js.UndefOr[S3ContinuousClassificationType]
    var oneTime: js.UndefOr[S3OneTimeClassificationType]
  }

  object ClassificationTypeUpdate {
    @inline
    def apply(
        continuous: js.UndefOr[S3ContinuousClassificationType] = js.undefined,
        oneTime: js.UndefOr[S3OneTimeClassificationType] = js.undefined
    ): ClassificationTypeUpdate = {
      val __obj = js.Dynamic.literal()
      continuous.foreach(__v => __obj.updateDynamic("continuous")(__v.asInstanceOf[js.Any]))
      oneTime.foreach(__v => __obj.updateDynamic("oneTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClassificationTypeUpdate]
    }
  }

  @js.native
  trait DisassociateMemberAccountRequest extends js.Object {
    var memberAccountId: AWSAccountId
  }

  object DisassociateMemberAccountRequest {
    @inline
    def apply(
        memberAccountId: AWSAccountId
    ): DisassociateMemberAccountRequest = {
      val __obj = js.Dynamic.literal(
        "memberAccountId" -> memberAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMemberAccountRequest]
    }
  }

  @js.native
  trait DisassociateS3ResourcesRequest extends js.Object {
    var associatedS3Resources: S3Resources
    var memberAccountId: js.UndefOr[AWSAccountId]
  }

  object DisassociateS3ResourcesRequest {
    @inline
    def apply(
        associatedS3Resources: S3Resources,
        memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
    ): DisassociateS3ResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "associatedS3Resources" -> associatedS3Resources.asInstanceOf[js.Any]
      )

      memberAccountId.foreach(__v => __obj.updateDynamic("memberAccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateS3ResourcesRequest]
    }
  }

  @js.native
  trait DisassociateS3ResourcesResult extends js.Object {
    var failedS3Resources: js.UndefOr[FailedS3Resources]
  }

  object DisassociateS3ResourcesResult {
    @inline
    def apply(
        failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
    ): DisassociateS3ResourcesResult = {
      val __obj = js.Dynamic.literal()
      failedS3Resources.foreach(__v => __obj.updateDynamic("failedS3Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateS3ResourcesResult]
    }
  }

  /** Includes details about the failed S3 resources.
    */
  @js.native
  trait FailedS3Resource extends js.Object {
    var errorCode: js.UndefOr[ErrorCode]
    var errorMessage: js.UndefOr[ExceptionMessage]
    var failedItem: js.UndefOr[S3Resource]
  }

  object FailedS3Resource {
    @inline
    def apply(
        errorCode: js.UndefOr[ErrorCode] = js.undefined,
        errorMessage: js.UndefOr[ExceptionMessage] = js.undefined,
        failedItem: js.UndefOr[S3Resource] = js.undefined
    ): FailedS3Resource = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      failedItem.foreach(__v => __obj.updateDynamic("failedItem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailedS3Resource]
    }
  }

  @js.native
  trait ListMemberAccountsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMemberAccountsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMemberAccountsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMemberAccountsRequest]
    }
  }

  @js.native
  trait ListMemberAccountsResult extends js.Object {
    var memberAccounts: js.UndefOr[MemberAccounts]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListMemberAccountsResult {
    @inline
    def apply(
        memberAccounts: js.UndefOr[MemberAccounts] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMemberAccountsResult = {
      val __obj = js.Dynamic.literal()
      memberAccounts.foreach(__v => __obj.updateDynamic("memberAccounts")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMemberAccountsResult]
    }
  }

  @js.native
  trait ListS3ResourcesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var memberAccountId: js.UndefOr[AWSAccountId]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListS3ResourcesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        memberAccountId: js.UndefOr[AWSAccountId] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListS3ResourcesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      memberAccountId.foreach(__v => __obj.updateDynamic("memberAccountId")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListS3ResourcesRequest]
    }
  }

  @js.native
  trait ListS3ResourcesResult extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var s3Resources: js.UndefOr[S3ResourcesClassification]
  }

  object ListS3ResourcesResult {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        s3Resources: js.UndefOr[S3ResourcesClassification] = js.undefined
    ): ListS3ResourcesResult = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      s3Resources.foreach(__v => __obj.updateDynamic("s3Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListS3ResourcesResult]
    }
  }

  /** Contains information about the Amazon Macie Classic member account.
    */
  @js.native
  trait MemberAccount extends js.Object {
    var accountId: js.UndefOr[AWSAccountId]
  }

  object MemberAccount {
    @inline
    def apply(
        accountId: js.UndefOr[AWSAccountId] = js.undefined
    ): MemberAccount = {
      val __obj = js.Dynamic.literal()
      accountId.foreach(__v => __obj.updateDynamic("accountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberAccount]
    }
  }

  /** Contains information about the S3 resource. This data type is used as a request parameter in the DisassociateS3Resources action and can be used as a response parameter in the AssociateS3Resources and UpdateS3Resources actions.
    */
  @js.native
  trait S3Resource extends js.Object {
    var bucketName: BucketName
    var prefix: js.UndefOr[Prefix]
  }

  object S3Resource {
    @inline
    def apply(
        bucketName: BucketName,
        prefix: js.UndefOr[Prefix] = js.undefined
    ): S3Resource = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any]
      )

      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Resource]
    }
  }

  /** The S3 resources that you want to associate with Amazon Macie Classic for monitoring and data classification. This data type is used as a request parameter in the AssociateS3Resources action and a response parameter in the ListS3Resources action.
    */
  @js.native
  trait S3ResourceClassification extends js.Object {
    var bucketName: BucketName
    var classificationType: ClassificationType
    var prefix: js.UndefOr[Prefix]
  }

  object S3ResourceClassification {
    @inline
    def apply(
        bucketName: BucketName,
        classificationType: ClassificationType,
        prefix: js.UndefOr[Prefix] = js.undefined
    ): S3ResourceClassification = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "classificationType" -> classificationType.asInstanceOf[js.Any]
      )

      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ResourceClassification]
    }
  }

  /** The S3 resources whose classification types you want to update. This data type is used as a request parameter in the UpdateS3Resources action.
    */
  @js.native
  trait S3ResourceClassificationUpdate extends js.Object {
    var bucketName: BucketName
    var classificationTypeUpdate: ClassificationTypeUpdate
    var prefix: js.UndefOr[Prefix]
  }

  object S3ResourceClassificationUpdate {
    @inline
    def apply(
        bucketName: BucketName,
        classificationTypeUpdate: ClassificationTypeUpdate,
        prefix: js.UndefOr[Prefix] = js.undefined
    ): S3ResourceClassificationUpdate = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any],
        "classificationTypeUpdate" -> classificationTypeUpdate.asInstanceOf[js.Any]
      )

      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3ResourceClassificationUpdate]
    }
  }

  @js.native
  trait UpdateS3ResourcesRequest extends js.Object {
    var s3ResourcesUpdate: S3ResourcesClassificationUpdate
    var memberAccountId: js.UndefOr[AWSAccountId]
  }

  object UpdateS3ResourcesRequest {
    @inline
    def apply(
        s3ResourcesUpdate: S3ResourcesClassificationUpdate,
        memberAccountId: js.UndefOr[AWSAccountId] = js.undefined
    ): UpdateS3ResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "s3ResourcesUpdate" -> s3ResourcesUpdate.asInstanceOf[js.Any]
      )

      memberAccountId.foreach(__v => __obj.updateDynamic("memberAccountId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateS3ResourcesRequest]
    }
  }

  @js.native
  trait UpdateS3ResourcesResult extends js.Object {
    var failedS3Resources: js.UndefOr[FailedS3Resources]
  }

  object UpdateS3ResourcesResult {
    @inline
    def apply(
        failedS3Resources: js.UndefOr[FailedS3Resources] = js.undefined
    ): UpdateS3ResourcesResult = {
      val __obj = js.Dynamic.literal()
      failedS3Resources.foreach(__v => __obj.updateDynamic("failedS3Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateS3ResourcesResult]
    }
  }
}
