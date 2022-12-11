package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object sagemakerfeaturestoreruntime {
  type BatchGetRecordErrors = js.Array[BatchGetRecordError]
  type BatchGetRecordIdentifiers = js.Array[BatchGetRecordIdentifier]
  type BatchGetRecordResultDetails = js.Array[BatchGetRecordResultDetail]
  type FeatureGroupName = String
  type FeatureName = String
  type FeatureNames = js.Array[FeatureName]
  type Message = String
  type Record = js.Array[FeatureValue]
  type RecordIdentifiers = js.Array[ValueAsString]
  type TargetStores = js.Array[TargetStore]
  type UnprocessedIdentifiers = js.Array[BatchGetRecordIdentifier]
  type ValueAsString = String

  final class SageMakerFeatureStoreRuntimeOps(private val service: SageMakerFeatureStoreRuntime) extends AnyVal {

    @inline def batchGetRecordFuture(params: BatchGetRecordRequest): Future[BatchGetRecordResponse] = service.batchGetRecord(params).promise().toFuture
    @inline def deleteRecordFuture(params: DeleteRecordRequest): Future[js.Object] = service.deleteRecord(params).promise().toFuture
    @inline def getRecordFuture(params: GetRecordRequest): Future[GetRecordResponse] = service.getRecord(params).promise().toFuture
    @inline def putRecordFuture(params: PutRecordRequest): Future[js.Object] = service.putRecord(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/sagemakerfeaturestoreruntime", JSImport.Namespace, "AWS.SageMakerFeatureStoreRuntime")
  class SageMakerFeatureStoreRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetRecord(params: BatchGetRecordRequest): Request[BatchGetRecordResponse] = js.native
    def deleteRecord(params: DeleteRecordRequest): Request[js.Object] = js.native
    def getRecord(params: GetRecordRequest): Request[GetRecordResponse] = js.native
    def putRecord(params: PutRecordRequest): Request[js.Object] = js.native
  }
  object SageMakerFeatureStoreRuntime {
    @inline implicit def toOps(service: SageMakerFeatureStoreRuntime): SageMakerFeatureStoreRuntimeOps = {
      new SageMakerFeatureStoreRuntimeOps(service)
    }
  }

  /** The error that has occurred when attempting to retrieve a batch of Records.
    */
  @js.native
  trait BatchGetRecordError extends js.Object {
    var ErrorCode: ValueAsString
    var ErrorMessage: Message
    var FeatureGroupName: ValueAsString
    var RecordIdentifierValueAsString: ValueAsString
  }

  object BatchGetRecordError {
    @inline
    def apply(
        ErrorCode: ValueAsString,
        ErrorMessage: Message,
        FeatureGroupName: ValueAsString,
        RecordIdentifierValueAsString: ValueAsString
    ): BatchGetRecordError = {
      val __obj = js.Dynamic.literal(
        "ErrorCode" -> ErrorCode.asInstanceOf[js.Any],
        "ErrorMessage" -> ErrorMessage.asInstanceOf[js.Any],
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "RecordIdentifierValueAsString" -> RecordIdentifierValueAsString.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetRecordError]
    }
  }

  /** The identifier that identifies the batch of Records you are retrieving in a batch.
    */
  @js.native
  trait BatchGetRecordIdentifier extends js.Object {
    var FeatureGroupName: FeatureGroupName
    var RecordIdentifiersValueAsString: RecordIdentifiers
    var FeatureNames: js.UndefOr[FeatureNames]
  }

  object BatchGetRecordIdentifier {
    @inline
    def apply(
        FeatureGroupName: FeatureGroupName,
        RecordIdentifiersValueAsString: RecordIdentifiers,
        FeatureNames: js.UndefOr[FeatureNames] = js.undefined
    ): BatchGetRecordIdentifier = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "RecordIdentifiersValueAsString" -> RecordIdentifiersValueAsString.asInstanceOf[js.Any]
      )

      FeatureNames.foreach(__v => __obj.updateDynamic("FeatureNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetRecordIdentifier]
    }
  }

  @js.native
  trait BatchGetRecordRequest extends js.Object {
    var Identifiers: BatchGetRecordIdentifiers
  }

  object BatchGetRecordRequest {
    @inline
    def apply(
        Identifiers: BatchGetRecordIdentifiers
    ): BatchGetRecordRequest = {
      val __obj = js.Dynamic.literal(
        "Identifiers" -> Identifiers.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetRecordRequest]
    }
  }

  @js.native
  trait BatchGetRecordResponse extends js.Object {
    var Errors: BatchGetRecordErrors
    var Records: BatchGetRecordResultDetails
    var UnprocessedIdentifiers: UnprocessedIdentifiers
  }

  object BatchGetRecordResponse {
    @inline
    def apply(
        Errors: BatchGetRecordErrors,
        Records: BatchGetRecordResultDetails,
        UnprocessedIdentifiers: UnprocessedIdentifiers
    ): BatchGetRecordResponse = {
      val __obj = js.Dynamic.literal(
        "Errors" -> Errors.asInstanceOf[js.Any],
        "Records" -> Records.asInstanceOf[js.Any],
        "UnprocessedIdentifiers" -> UnprocessedIdentifiers.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetRecordResponse]
    }
  }

  /** The output of Records that have been retrieved in a batch.
    */
  @js.native
  trait BatchGetRecordResultDetail extends js.Object {
    var FeatureGroupName: ValueAsString
    var Record: Record
    var RecordIdentifierValueAsString: ValueAsString
  }

  object BatchGetRecordResultDetail {
    @inline
    def apply(
        FeatureGroupName: ValueAsString,
        Record: Record,
        RecordIdentifierValueAsString: ValueAsString
    ): BatchGetRecordResultDetail = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "Record" -> Record.asInstanceOf[js.Any],
        "RecordIdentifierValueAsString" -> RecordIdentifierValueAsString.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetRecordResultDetail]
    }
  }

  @js.native
  trait DeleteRecordRequest extends js.Object {
    var EventTime: ValueAsString
    var FeatureGroupName: FeatureGroupName
    var RecordIdentifierValueAsString: ValueAsString
    var TargetStores: js.UndefOr[TargetStores]
  }

  object DeleteRecordRequest {
    @inline
    def apply(
        EventTime: ValueAsString,
        FeatureGroupName: FeatureGroupName,
        RecordIdentifierValueAsString: ValueAsString,
        TargetStores: js.UndefOr[TargetStores] = js.undefined
    ): DeleteRecordRequest = {
      val __obj = js.Dynamic.literal(
        "EventTime" -> EventTime.asInstanceOf[js.Any],
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "RecordIdentifierValueAsString" -> RecordIdentifierValueAsString.asInstanceOf[js.Any]
      )

      TargetStores.foreach(__v => __obj.updateDynamic("TargetStores")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRecordRequest]
    }
  }

  /** The value associated with a feature.
    */
  @js.native
  trait FeatureValue extends js.Object {
    var FeatureName: FeatureName
    var ValueAsString: ValueAsString
  }

  object FeatureValue {
    @inline
    def apply(
        FeatureName: FeatureName,
        ValueAsString: ValueAsString
    ): FeatureValue = {
      val __obj = js.Dynamic.literal(
        "FeatureName" -> FeatureName.asInstanceOf[js.Any],
        "ValueAsString" -> ValueAsString.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FeatureValue]
    }
  }

  @js.native
  trait GetRecordRequest extends js.Object {
    var FeatureGroupName: FeatureGroupName
    var RecordIdentifierValueAsString: ValueAsString
    var FeatureNames: js.UndefOr[FeatureNames]
  }

  object GetRecordRequest {
    @inline
    def apply(
        FeatureGroupName: FeatureGroupName,
        RecordIdentifierValueAsString: ValueAsString,
        FeatureNames: js.UndefOr[FeatureNames] = js.undefined
    ): GetRecordRequest = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "RecordIdentifierValueAsString" -> RecordIdentifierValueAsString.asInstanceOf[js.Any]
      )

      FeatureNames.foreach(__v => __obj.updateDynamic("FeatureNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecordRequest]
    }
  }

  @js.native
  trait GetRecordResponse extends js.Object {
    var Record: js.UndefOr[Record]
  }

  object GetRecordResponse {
    @inline
    def apply(
        Record: js.UndefOr[Record] = js.undefined
    ): GetRecordResponse = {
      val __obj = js.Dynamic.literal()
      Record.foreach(__v => __obj.updateDynamic("Record")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecordResponse]
    }
  }

  @js.native
  trait PutRecordRequest extends js.Object {
    var FeatureGroupName: FeatureGroupName
    var Record: Record
    var TargetStores: js.UndefOr[TargetStores]
  }

  object PutRecordRequest {
    @inline
    def apply(
        FeatureGroupName: FeatureGroupName,
        Record: Record,
        TargetStores: js.UndefOr[TargetStores] = js.undefined
    ): PutRecordRequest = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "Record" -> Record.asInstanceOf[js.Any]
      )

      TargetStores.foreach(__v => __obj.updateDynamic("TargetStores")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRecordRequest]
    }
  }
}
