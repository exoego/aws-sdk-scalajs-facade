package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
      service.associateRepository(params).promise.toFuture
    @inline def describeRepositoryAssociationFuture(
        params: DescribeRepositoryAssociationRequest
    ): Future[DescribeRepositoryAssociationResponse] = service.describeRepositoryAssociation(params).promise.toFuture
    @inline def disassociateRepositoryFuture(
        params: DisassociateRepositoryRequest
    ): Future[DisassociateRepositoryResponse] = service.disassociateRepository(params).promise.toFuture
    @inline def listRepositoryAssociationsFuture(
        params: ListRepositoryAssociationsRequest
    ): Future[ListRepositoryAssociationsResponse] = service.listRepositoryAssociations(params).promise.toFuture
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
  trait AssociateRepositoryRequest extends js.Object {
    var Repository: Repository
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
  }

  object AssociateRepositoryRequest {
    @inline
    def apply(
        Repository: Repository,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): AssociateRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "Repository" -> Repository.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateRepositoryRequest]
    }
  }

  @js.native
  trait AssociateRepositoryResponse extends js.Object {
    var RepositoryAssociation: js.UndefOr[RepositoryAssociation]
  }

  object AssociateRepositoryResponse {
    @inline
    def apply(
        RepositoryAssociation: js.UndefOr[RepositoryAssociation] = js.undefined
    ): AssociateRepositoryResponse = {
      val __obj = js.Dynamic.literal()
      RepositoryAssociation.foreach(__v => __obj.updateDynamic("RepositoryAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateRepositoryResponse]
    }
  }

  /**
    * Information about an AWS CodeCommit repository.
    */
  @js.native
  trait CodeCommitRepository extends js.Object {
    var Name: Name
  }

  object CodeCommitRepository {
    @inline
    def apply(
        Name: Name
    ): CodeCommitRepository = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CodeCommitRepository]
    }
  }

  @js.native
  trait DescribeRepositoryAssociationRequest extends js.Object {
    var AssociationArn: Arn
  }

  object DescribeRepositoryAssociationRequest {
    @inline
    def apply(
        AssociationArn: Arn
    ): DescribeRepositoryAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationArn" -> AssociationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRepositoryAssociationRequest]
    }
  }

  @js.native
  trait DescribeRepositoryAssociationResponse extends js.Object {
    var RepositoryAssociation: js.UndefOr[RepositoryAssociation]
  }

  object DescribeRepositoryAssociationResponse {
    @inline
    def apply(
        RepositoryAssociation: js.UndefOr[RepositoryAssociation] = js.undefined
    ): DescribeRepositoryAssociationResponse = {
      val __obj = js.Dynamic.literal()
      RepositoryAssociation.foreach(__v => __obj.updateDynamic("RepositoryAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRepositoryAssociationResponse]
    }
  }

  @js.native
  trait DisassociateRepositoryRequest extends js.Object {
    var AssociationArn: Arn
  }

  object DisassociateRepositoryRequest {
    @inline
    def apply(
        AssociationArn: Arn
    ): DisassociateRepositoryRequest = {
      val __obj = js.Dynamic.literal(
        "AssociationArn" -> AssociationArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DisassociateRepositoryRequest]
    }
  }

  @js.native
  trait DisassociateRepositoryResponse extends js.Object {
    var RepositoryAssociation: js.UndefOr[RepositoryAssociation]
  }

  object DisassociateRepositoryResponse {
    @inline
    def apply(
        RepositoryAssociation: js.UndefOr[RepositoryAssociation] = js.undefined
    ): DisassociateRepositoryResponse = {
      val __obj = js.Dynamic.literal()
      RepositoryAssociation.foreach(__v => __obj.updateDynamic("RepositoryAssociation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateRepositoryResponse]
    }
  }

  @js.native
  trait ListRepositoryAssociationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var Names: js.UndefOr[Names]
    var NextToken: js.UndefOr[NextToken]
    var Owners: js.UndefOr[Owners]
    var ProviderTypes: js.UndefOr[ProviderTypes]
    var States: js.UndefOr[RepositoryAssociationStates]
  }

  object ListRepositoryAssociationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        Names: js.UndefOr[Names] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Owners: js.UndefOr[Owners] = js.undefined,
        ProviderTypes: js.UndefOr[ProviderTypes] = js.undefined,
        States: js.UndefOr[RepositoryAssociationStates] = js.undefined
    ): ListRepositoryAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Owners.foreach(__v => __obj.updateDynamic("Owners")(__v.asInstanceOf[js.Any]))
      ProviderTypes.foreach(__v => __obj.updateDynamic("ProviderTypes")(__v.asInstanceOf[js.Any]))
      States.foreach(__v => __obj.updateDynamic("States")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoryAssociationsRequest]
    }
  }

  @js.native
  trait ListRepositoryAssociationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var RepositoryAssociationSummaries: js.UndefOr[RepositoryAssociationSummaries]
  }

  object ListRepositoryAssociationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RepositoryAssociationSummaries: js.UndefOr[RepositoryAssociationSummaries] = js.undefined
    ): ListRepositoryAssociationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RepositoryAssociationSummaries.foreach(__v =>
        __obj.updateDynamic("RepositoryAssociationSummaries")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[ListRepositoryAssociationsResponse]
    }
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
  trait Repository extends js.Object {
    var CodeCommit: js.UndefOr[CodeCommitRepository]
  }

  object Repository {
    @inline
    def apply(
        CodeCommit: js.UndefOr[CodeCommitRepository] = js.undefined
    ): Repository = {
      val __obj = js.Dynamic.literal()
      CodeCommit.foreach(__v => __obj.updateDynamic("CodeCommit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Repository]
    }
  }

  /**
    * Information about a repository association.
    */
  @js.native
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

  object RepositoryAssociation {
    @inline
    def apply(
        AssociationArn: js.UndefOr[Arn] = js.undefined,
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        CreatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        State: js.UndefOr[RepositoryAssociationState] = js.undefined,
        StateReason: js.UndefOr[StateReason] = js.undefined
    ): RepositoryAssociation = {
      val __obj = js.Dynamic.literal()
      AssociationArn.foreach(__v => __obj.updateDynamic("AssociationArn")(__v.asInstanceOf[js.Any]))
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      CreatedTimeStamp.foreach(__v => __obj.updateDynamic("CreatedTimeStamp")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimeStamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimeStamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryAssociation]
    }
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
  trait RepositoryAssociationSummary extends js.Object {
    var AssociationArn: js.UndefOr[Arn]
    var AssociationId: js.UndefOr[AssociationId]
    var LastUpdatedTimeStamp: js.UndefOr[TimeStamp]
    var Name: js.UndefOr[Name]
    var Owner: js.UndefOr[Owner]
    var ProviderType: js.UndefOr[ProviderType]
    var State: js.UndefOr[RepositoryAssociationState]
  }

  object RepositoryAssociationSummary {
    @inline
    def apply(
        AssociationArn: js.UndefOr[Arn] = js.undefined,
        AssociationId: js.UndefOr[AssociationId] = js.undefined,
        LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Owner: js.UndefOr[Owner] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        State: js.UndefOr[RepositoryAssociationState] = js.undefined
    ): RepositoryAssociationSummary = {
      val __obj = js.Dynamic.literal()
      AssociationArn.foreach(__v => __obj.updateDynamic("AssociationArn")(__v.asInstanceOf[js.Any]))
      AssociationId.foreach(__v => __obj.updateDynamic("AssociationId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimeStamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimeStamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Owner.foreach(__v => __obj.updateDynamic("Owner")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositoryAssociationSummary]
    }
  }
}
