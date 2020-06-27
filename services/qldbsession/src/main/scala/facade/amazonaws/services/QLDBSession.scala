package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object qldbsession {
  type CommitDigest        = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type IonBinary           = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type IonText             = String
  type LedgerName          = String
  type PageToken           = String
  type SessionToken        = String
  type Statement           = String
  type StatementParameters = js.Array[ValueHolder]
  type TransactionId       = String
  type ValueHolders        = js.Array[ValueHolder]

  implicit final class QLDBSessionOps(private val service: QLDBSession) extends AnyVal {

    @inline def sendCommandFuture(params: SendCommandRequest): Future[SendCommandResult] =
      service.sendCommand(params).promise().toFuture
  }
}

package qldbsession {
  @js.native
  @JSImport("aws-sdk", "QLDBSession")
  class QLDBSession() extends js.Object {
    def this(config: AWSConfig) = this()

    def sendCommand(params: SendCommandRequest): Request[SendCommandResult] = js.native
  }

  /**
    * Contains the details of the transaction to abort.
    */
  @js.native
  @Factory
  trait AbortTransactionRequest extends js.Object {}

  /**
    * Contains the details of the aborted transaction.
    */
  @js.native
  @Factory
  trait AbortTransactionResult extends js.Object {}

  /**
    * Contains the details of the transaction to commit.
    */
  @js.native
  @Factory
  trait CommitTransactionRequest extends js.Object {
    var CommitDigest: CommitDigest
    var TransactionId: TransactionId
  }

  /**
    * Contains the details of the committed transaction.
    */
  @js.native
  @Factory
  trait CommitTransactionResult extends js.Object {
    var CommitDigest: js.UndefOr[CommitDigest]
    var TransactionId: js.UndefOr[TransactionId]
  }

  /**
    * Specifies a request to end the session.
    */
  @js.native
  @Factory
  trait EndSessionRequest extends js.Object {}

  /**
    * Contains the details of the ended session.
    */
  @js.native
  @Factory
  trait EndSessionResult extends js.Object {}

  /**
    * Specifies a request to execute a statement.
    */
  @js.native
  @Factory
  trait ExecuteStatementRequest extends js.Object {
    var Statement: Statement
    var TransactionId: TransactionId
    var Parameters: js.UndefOr[StatementParameters]
  }

  /**
    * Contains the details of the executed statement.
    */
  @js.native
  @Factory
  trait ExecuteStatementResult extends js.Object {
    var FirstPage: js.UndefOr[Page]
  }

  /**
    * Specifies the details of the page to be fetched.
    */
  @js.native
  @Factory
  trait FetchPageRequest extends js.Object {
    var NextPageToken: PageToken
    var TransactionId: TransactionId
  }

  /**
    * Contains the page that was fetched.
    */
  @js.native
  @Factory
  trait FetchPageResult extends js.Object {
    var Page: js.UndefOr[Page]
  }

  /**
    * Contains details of the fetched page.
    */
  @js.native
  @Factory
  trait Page extends js.Object {
    var NextPageToken: js.UndefOr[PageToken]
    var Values: js.UndefOr[ValueHolders]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait SendCommandResult extends js.Object {
    var AbortTransaction: js.UndefOr[AbortTransactionResult]
    var CommitTransaction: js.UndefOr[CommitTransactionResult]
    var EndSession: js.UndefOr[EndSessionResult]
    var ExecuteStatement: js.UndefOr[ExecuteStatementResult]
    var FetchPage: js.UndefOr[FetchPageResult]
    var StartSession: js.UndefOr[StartSessionResult]
    var StartTransaction: js.UndefOr[StartTransactionResult]
  }

  /**
    * Specifies a request to start a a new session.
    */
  @js.native
  @Factory
  trait StartSessionRequest extends js.Object {
    var LedgerName: LedgerName
  }

  /**
    * Contains the details of the started session.
    */
  @js.native
  @Factory
  trait StartSessionResult extends js.Object {
    var SessionToken: js.UndefOr[SessionToken]
  }

  /**
    * Specifies a request to start a transaction.
    */
  @js.native
  @Factory
  trait StartTransactionRequest extends js.Object {}

  /**
    * Contains the details of the started transaction.
    */
  @js.native
  @Factory
  trait StartTransactionResult extends js.Object {
    var TransactionId: js.UndefOr[TransactionId]
  }

  /**
    * A structure that can contains values in multiple encoding formats.
    */
  @js.native
  @Factory
  trait ValueHolder extends js.Object {
    var IonBinary: js.UndefOr[IonBinary]
    var IonText: js.UndefOr[IonText]
  }
}
