package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object codegurureviewer {
  type Arn                            = String
  type AssociationId                  = String
  type ClientRequestToken             = String
  type MaxResults                     = Int
  type Name                           = String
  type Names                          = js.Array[Name]
  type NextToken                      = String
  type Owner                          = String
  type Owners                         = js.Array[Owner]
  type ProviderTypes                  = js.Array[ProviderType]
  type RepositoryAssociationStates    = js.Array[RepositoryAssociationState]
  type RepositoryAssociationSummaries = js.Array[RepositoryAssociationSummary]
  type StateReason                    = String
  type TimeStamp                      = js.Date

  implicit final class CodeGuruReviewerOps(private val service: CodeGuruReviewer) extends AnyVal {

    @inline def associateRepositoryFuture(params: AssociateRepositoryRequest): Future[AssociateRepositoryResponse] =
      service.associateRepository(params).promise().toFuture
    @inline def describeRepositoryAssociationFuture(
        params: DescribeRepositoryAssociationRequest
    ): Future[DescribeRepositoryAssociationResponse] = service.describeRepositoryAssociation(params).promise().toFuture
    @inline def disassociateRepositoryFuture(
        params: DisassociateRepositoryRequest
    ): Future[DisassociateRepositoryResponse] = service.disassociateRepository(params).promise().toFuture
    @inline def listRepositoryAssociationsFuture(
        params: ListRepositoryAssociationsRequest
    ): Future[ListRepositoryAssociationsResponse] = service.listRepositoryAssociations(params).promise().toFuture
  }
}

package codegurureviewer {
  @js.native
  @JSImport("aws-sdk", "CodeGuruReviewer")
  class CodeGuruReviewer() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateRepository(params: AssociateRepositoryRequest): Request[AssociateRepositoryResponse] = js.native
    def describeRepositoryAssociation(
        params: DescribeRepositoryAssociationRequest
    ): Request[DescribeRepositoryAssociationResponse] = js.native
    def disassociateRepository(params: DisassociateRepositoryRequest): Request[DisassociateRepositoryResponse] =
      js.native
    def listRepositoryAssociations(
        params: ListRepositoryAssociationsRequest
    ): Request[ListRepositoryAssociationsResponse] = js.native
  }

  @js.native
  @Factory
  trait AssociateRepositoryRequest extends js.Object {
    var Repository: Repository
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  @js.native
  @Factory
  trait AssociateRepositoryResponse extends js.Object {
    var RepositoryAssociation: js.UndefOr[RepositoryAssociation]
  }

  /**
    * Information about an AWS CodeCommit repository.
    */
  @js.native
  @Factory
  trait CodeCommitRepository extends js.Object {
    var Name: Name
  }

  @js.native
  @Factory
  trait DescribeRepositoryAssociationRequest extends js.Object {
    var AssociationArn: Arn
  }

  @js.native
  @Factory
  trait DescribeRepositoryAssociationResponse extends js.Object {
    var RepositoryAssociation: js.UndefOr[RepositoryAssociation]
  }

  @js.native
  @Factory
  trait DisassociateRepositoryRequest extends js.Object {
    var AssociationArn: Arn
  }

  @js.native
  @Factory
  trait DisassociateRepositoryResponse extends js.Object {
    var RepositoryAssociation: js.UndefOr[RepositoryAssociation]
  }

  @js.native
  @Factory
  trait ListRepositoryAssociationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var Names: js.UndefOr[Names]
    var NextToken: js.UndefOr[NextToken]
    var Owners: js.UndefOr[Owners]
    var ProviderTypes: js.UndefOr[ProviderTypes]
    var States: js.UndefOr[RepositoryAssociationStates]
  }

  @js.native
  @Factory
  trait ListRepositoryAssociationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RepositoryAssociationSummaries: js.UndefOr[RepositoryAssociationSummaries]
  }

  @js.native
  sealed trait ProviderType extends js.Any
  object ProviderType extends js.Object {
    val CodeCommit = "CodeCommit".asInstanceOf[ProviderType]
    val GitHub     = "GitHub".asInstanceOf[ProviderType]

    val values = js.Object.freeze(js.Array(CodeCommit, GitHub))
  }

  /**
    * Information about a repository.
    */
  @js.native
  @Factory
  trait Repository extends js.Object {
    var CodeCommit: js.UndefOr[CodeCommitRepository]
  }

  /**
    * Information about a repository association.
    */
  @js.native
  @Factory
  trait RepositoryAssociation extends js.Object {
    var AssociationArn: js.UndefOr[Arn]
    var AssociationId: js.UndefOr[AssociationId]
    var CreatedTimeStamp: js.UndefOr[TimeStamp]
    var LastUpdatedTimeStamp: js.UndefOr[TimeStamp]
    var Name: js.UndefOr[Name]
    var Owner: js.UndefOr[Owner]
    var ProviderType: js.UndefOr[ProviderType]
    var State: js.UndefOr[RepositoryAssociationState]
    var StateReason: js.UndefOr[StateReason]
  }

  @js.native
  sealed trait RepositoryAssociationState extends js.Any
  object RepositoryAssociationState extends js.Object {
    val Associated     = "Associated".asInstanceOf[RepositoryAssociationState]
    val Associating    = "Associating".asInstanceOf[RepositoryAssociationState]
    val Failed         = "Failed".asInstanceOf[RepositoryAssociationState]
    val Disassociating = "Disassociating".asInstanceOf[RepositoryAssociationState]

    val values = js.Object.freeze(js.Array(Associated, Associating, Failed, Disassociating))
  }

  /**
    * Information about a repository association.
    */
  @js.native
  @Factory
  trait RepositoryAssociationSummary extends js.Object {
    var AssociationArn: js.UndefOr[Arn]
    var AssociationId: js.UndefOr[AssociationId]
    var LastUpdatedTimeStamp: js.UndefOr[TimeStamp]
    var Name: js.UndefOr[Name]
    var Owner: js.UndefOr[Owner]
    var ProviderType: js.UndefOr[ProviderType]
    var State: js.UndefOr[RepositoryAssociationState]
  }
}
