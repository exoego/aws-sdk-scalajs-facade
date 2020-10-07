package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object qldbsession {
  type CommitDigest = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type IonBinary = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type IonText = String
  type LedgerName = String
  type PageToken = String
  type SessionToken = String
  type Statement = String
  type StatementParameters = js.Array[ValueHolder]
  type TransactionId = String
  type ValueHolders = js.Array[ValueHolder]

  implicit final class QLDBSessionOps(private val service: QLDBSession) extends AnyVal {

    @inline def sendCommandFuture(params: SendCommandRequest): Future[SendCommandResult] = service.sendCommand(params).promise().toFuture

  }
}

package qldbsession {
  @js.native
  @JSImport("aws-sdk/clients/qldbsession", JSImport.Namespace, "AWS.QLDBSession")
  class QLDBSession() extends js.Object {
    def this(config: AWSConfig) = this()

    def sendCommand(params: SendCommandRequest): Request[SendCommandResult] = js.native
  }

  /** Contains the details of the transaction to abort.
    */
  @js.native
  trait AbortTransactionRequest extends js.Object {}

  object AbortTransactionRequest {
    @inline
    def apply(
    ): AbortTransactionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortTransactionRequest]
    }
  }

  /** Contains the details of the aborted transaction.
    */
  @js.native
  trait AbortTransactionResult extends js.Object {}

  object AbortTransactionResult {
    @inline
    def apply(
    ): AbortTransactionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortTransactionResult]
    }
  }

  /** Contains the details of the transaction to commit.
    */
  @js.native
  trait CommitTransactionRequest extends js.Object {
    var CommitDigest: CommitDigest
    var TransactionId: TransactionId
  }

  object CommitTransactionRequest {
    @inline
    def apply(
        CommitDigest: CommitDigest,
        TransactionId: TransactionId
    ): CommitTransactionRequest = {
      val __obj = js.Dynamic.literal(
        "CommitDigest" -> CommitDigest.asInstanceOf[js.Any],
        "TransactionId" -> TransactionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CommitTransactionRequest]
    }
  }

  /** Contains the details of the committed transaction.
    */
  @js.native
  trait CommitTransactionResult extends js.Object {
    var CommitDigest: js.UndefOr[CommitDigest]
    var TransactionId: js.UndefOr[TransactionId]
  }

  object CommitTransactionResult {
    @inline
    def apply(
        CommitDigest: js.UndefOr[CommitDigest] = js.undefined,
        TransactionId: js.UndefOr[TransactionId] = js.undefined
    ): CommitTransactionResult = {
      val __obj = js.Dynamic.literal()
      CommitDigest.foreach(__v => __obj.updateDynamic("CommitDigest")(__v.asInstanceOf[js.Any]))
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CommitTransactionResult]
    }
  }

  /** Specifies a request to end the session.
    */
  @js.native
  trait EndSessionRequest extends js.Object {}

  object EndSessionRequest {
    @inline
    def apply(
    ): EndSessionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndSessionRequest]
    }
  }

  /** Contains the details of the ended session.
    */
  @js.native
  trait EndSessionResult extends js.Object {}

  object EndSessionResult {
    @inline
    def apply(
    ): EndSessionResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndSessionResult]
    }
  }

  /** Specifies a request to execute a statement.
    */
  @js.native
  trait ExecuteStatementRequest extends js.Object {
    var Statement: Statement
    var TransactionId: TransactionId
    var Parameters: js.UndefOr[StatementParameters]
  }

  object ExecuteStatementRequest {
    @inline
    def apply(
        Statement: Statement,
        TransactionId: TransactionId,
        Parameters: js.UndefOr[StatementParameters] = js.undefined
    ): ExecuteStatementRequest = {
      val __obj = js.Dynamic.literal(
        "Statement" -> Statement.asInstanceOf[js.Any],
        "TransactionId" -> TransactionId.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteStatementRequest]
    }
  }

  /** Contains the details of the executed statement.
    */
  @js.native
  trait ExecuteStatementResult extends js.Object {
    var FirstPage: js.UndefOr[Page]
  }

  object ExecuteStatementResult {
    @inline
    def apply(
        FirstPage: js.UndefOr[Page] = js.undefined
    ): ExecuteStatementResult = {
      val __obj = js.Dynamic.literal()
      FirstPage.foreach(__v => __obj.updateDynamic("FirstPage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteStatementResult]
    }
  }

  /** Specifies the details of the page to be fetched.
    */
  @js.native
  trait FetchPageRequest extends js.Object {
    var NextPageToken: PageToken
    var TransactionId: TransactionId
  }

  object FetchPageRequest {
    @inline
    def apply(
        NextPageToken: PageToken,
        TransactionId: TransactionId
    ): FetchPageRequest = {
      val __obj = js.Dynamic.literal(
        "NextPageToken" -> NextPageToken.asInstanceOf[js.Any],
        "TransactionId" -> TransactionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FetchPageRequest]
    }
  }

  /** Contains the page that was fetched.
    */
  @js.native
  trait FetchPageResult extends js.Object {
    var Page: js.UndefOr[Page]
  }

  object FetchPageResult {
    @inline
    def apply(
        Page: js.UndefOr[Page] = js.undefined
    ): FetchPageResult = {
      val __obj = js.Dynamic.literal()
      Page.foreach(__v => __obj.updateDynamic("Page")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FetchPageResult]
    }
  }

  /** Contains details of the fetched page.
    */
  @js.native
  trait Page extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var Values: js.UndefOr[ValueHolders]
  }

  object Page {
    @inline
    def apply(
        NextPageToken: js.UndefOr[PageToken] = js.undefined,
        Values: js.UndefOr[ValueHolders] = js.undefined
    ): Page = {
      val __obj = js.Dynamic.literal()
      NextPageToken.foreach(__v => __obj.updateDynamic("NextPageToken")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Page]
    }
  }

  @js.native
  trait SendCommandRequest extends js.Object {
    var AbortTransaction: js.UndefOr[AbortTransactionRequest]
    var CommitTransaction: js.UndefOr[CommitTransactionRequest]
    var EndSession: js.UndefOr[EndSessionRequest]
    var ExecuteStatement: js.UndefOr[ExecuteStatementRequest]
    var FetchPage: js.UndefOr[FetchPageRequest]
    var SessionToken: js.UndefOr[SessionToken]
    var StartSession: js.UndefOr[StartSessionRequest]
    var StartTransaction: js.UndefOr[StartTransactionRequest]
  }

  object SendCommandRequest {
    @inline
    def apply(
        AbortTransaction: js.UndefOr[AbortTransactionRequest] = js.undefined,
        CommitTransaction: js.UndefOr[CommitTransactionRequest] = js.undefined,
        EndSession: js.UndefOr[EndSessionRequest] = js.undefined,
        ExecuteStatement: js.UndefOr[ExecuteStatementRequest] = js.undefined,
        FetchPage: js.UndefOr[FetchPageRequest] = js.undefined,
        SessionToken: js.UndefOr[SessionToken] = js.undefined,
        StartSession: js.UndefOr[StartSessionRequest] = js.undefined,
        StartTransaction: js.UndefOr[StartTransactionRequest] = js.undefined
    ): SendCommandRequest = {
      val __obj = js.Dynamic.literal()
      AbortTransaction.foreach(__v => __obj.updateDynamic("AbortTransaction")(__v.asInstanceOf[js.Any]))
      CommitTransaction.foreach(__v => __obj.updateDynamic("CommitTransaction")(__v.asInstanceOf[js.Any]))
      EndSession.foreach(__v => __obj.updateDynamic("EndSession")(__v.asInstanceOf[js.Any]))
      ExecuteStatement.foreach(__v => __obj.updateDynamic("ExecuteStatement")(__v.asInstanceOf[js.Any]))
      FetchPage.foreach(__v => __obj.updateDynamic("FetchPage")(__v.asInstanceOf[js.Any]))
      SessionToken.foreach(__v => __obj.updateDynamic("SessionToken")(__v.asInstanceOf[js.Any]))
      StartSession.foreach(__v => __obj.updateDynamic("StartSession")(__v.asInstanceOf[js.Any]))
      StartTransaction.foreach(__v => __obj.updateDynamic("StartTransaction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCommandRequest]
    }
  }

  @js.native
  trait SendCommandResult extends js.Object {
    var AbortTransaction: js.UndefOr[AbortTransactionResult]
    var CommitTransaction: js.UndefOr[CommitTransactionResult]
    var EndSession: js.UndefOr[EndSessionResult]
    var ExecuteStatement: js.UndefOr[ExecuteStatementResult]
    var FetchPage: js.UndefOr[FetchPageResult]
    var StartSession: js.UndefOr[StartSessionResult]
    var StartTransaction: js.UndefOr[StartTransactionResult]
  }

  object SendCommandResult {
    @inline
    def apply(
        AbortTransaction: js.UndefOr[AbortTransactionResult] = js.undefined,
        CommitTransaction: js.UndefOr[CommitTransactionResult] = js.undefined,
        EndSession: js.UndefOr[EndSessionResult] = js.undefined,
        ExecuteStatement: js.UndefOr[ExecuteStatementResult] = js.undefined,
        FetchPage: js.UndefOr[FetchPageResult] = js.undefined,
        StartSession: js.UndefOr[StartSessionResult] = js.undefined,
        StartTransaction: js.UndefOr[StartTransactionResult] = js.undefined
    ): SendCommandResult = {
      val __obj = js.Dynamic.literal()
      AbortTransaction.foreach(__v => __obj.updateDynamic("AbortTransaction")(__v.asInstanceOf[js.Any]))
      CommitTransaction.foreach(__v => __obj.updateDynamic("CommitTransaction")(__v.asInstanceOf[js.Any]))
      EndSession.foreach(__v => __obj.updateDynamic("EndSession")(__v.asInstanceOf[js.Any]))
      ExecuteStatement.foreach(__v => __obj.updateDynamic("ExecuteStatement")(__v.asInstanceOf[js.Any]))
      FetchPage.foreach(__v => __obj.updateDynamic("FetchPage")(__v.asInstanceOf[js.Any]))
      StartSession.foreach(__v => __obj.updateDynamic("StartSession")(__v.asInstanceOf[js.Any]))
      StartTransaction.foreach(__v => __obj.updateDynamic("StartTransaction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendCommandResult]
    }
  }

  /** Specifies a request to start a new session.
    */
  @js.native
  trait StartSessionRequest extends js.Object {
    var LedgerName: LedgerName
  }

  object StartSessionRequest {
    @inline
    def apply(
        LedgerName: LedgerName
    ): StartSessionRequest = {
      val __obj = js.Dynamic.literal(
        "LedgerName" -> LedgerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartSessionRequest]
    }
  }

  /** Contains the details of the started session.
    */
  @js.native
  trait StartSessionResult extends js.Object {
    var SessionToken: js.UndefOr[SessionToken]
  }

  object StartSessionResult {
    @inline
    def apply(
        SessionToken: js.UndefOr[SessionToken] = js.undefined
    ): StartSessionResult = {
      val __obj = js.Dynamic.literal()
      SessionToken.foreach(__v => __obj.updateDynamic("SessionToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSessionResult]
    }
  }

  /** Specifies a request to start a transaction.
    */
  @js.native
  trait StartTransactionRequest extends js.Object {}

  object StartTransactionRequest {
    @inline
    def apply(
    ): StartTransactionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartTransactionRequest]
    }
  }

  /** Contains the details of the started transaction.
    */
  @js.native
  trait StartTransactionResult extends js.Object {
    var TransactionId: js.UndefOr[TransactionId]
  }

  object StartTransactionResult {
    @inline
    def apply(
        TransactionId: js.UndefOr[TransactionId] = js.undefined
    ): StartTransactionResult = {
      val __obj = js.Dynamic.literal()
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartTransactionResult]
    }
  }

  /** A structure that can contain an Amazon Ion value in multiple encoding formats.
    */
  @js.native
  trait ValueHolder extends js.Object {
    var IonBinary: js.UndefOr[IonBinary]
    var IonText: js.UndefOr[IonText]
  }

  object ValueHolder {
    @inline
    def apply(
        IonBinary: js.UndefOr[IonBinary] = js.undefined,
        IonText: js.UndefOr[IonText] = js.undefined
    ): ValueHolder = {
      val __obj = js.Dynamic.literal()
      IonBinary.foreach(__v => __obj.updateDynamic("IonBinary")(__v.asInstanceOf[js.Any]))
      IonText.foreach(__v => __obj.updateDynamic("IonText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValueHolder]
    }
  }
}
