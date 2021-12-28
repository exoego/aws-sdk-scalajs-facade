package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object sagemakerfeaturestoreruntime {
  type FeatureGroupName = String
  type FeatureName = String
  type FeatureNames = js.Array[FeatureName]
  type Record = js.Array[FeatureValue]
  type ValueAsString = String

  final class SageMakerFeatureStoreRuntimeOps(private val service: SageMakerFeatureStoreRuntime) extends AnyVal {

    @inline def deleteRecordFuture(params: DeleteRecordRequest): Future[js.Object] = service.deleteRecord(params).promise().toFuture
    @inline def getRecordFuture(params: GetRecordRequest): Future[GetRecordResponse] = service.getRecord(params).promise().toFuture
    @inline def putRecordFuture(params: PutRecordRequest): Future[js.Object] = service.putRecord(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/sagemakerfeaturestoreruntime", JSImport.Namespace, "AWS.SageMakerFeatureStoreRuntime")
  class SageMakerFeatureStoreRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteRecord(params: DeleteRecordRequest): Request[js.Object] = js.native
    def getRecord(params: GetRecordRequest): Request[GetRecordResponse] = js.native
    def putRecord(params: PutRecordRequest): Request[js.Object] = js.native
  }
  object SageMakerFeatureStoreRuntime {
    @inline implicit def toOps(service: SageMakerFeatureStoreRuntime): SageMakerFeatureStoreRuntimeOps = {
      new SageMakerFeatureStoreRuntimeOps(service)
    }
  }

  @js.native
  trait DeleteRecordRequest extends js.Object {
    var EventTime: ValueAsString
    var FeatureGroupName: FeatureGroupName
    var RecordIdentifierValueAsString: ValueAsString
  }

  object DeleteRecordRequest {
    @inline
    def apply(
        EventTime: ValueAsString,
        FeatureGroupName: FeatureGroupName,
        RecordIdentifierValueAsString: ValueAsString
    ): DeleteRecordRequest = {
      val __obj = js.Dynamic.literal(
        "EventTime" -> EventTime.asInstanceOf[js.Any],
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "RecordIdentifierValueAsString" -> RecordIdentifierValueAsString.asInstanceOf[js.Any]
      )
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
  }

  object PutRecordRequest {
    @inline
    def apply(
        FeatureGroupName: FeatureGroupName,
        Record: Record
    ): PutRecordRequest = {
      val __obj = js.Dynamic.literal(
        "FeatureGroupName" -> FeatureGroupName.asInstanceOf[js.Any],
        "Record" -> Record.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutRecordRequest]
    }
  }
}
