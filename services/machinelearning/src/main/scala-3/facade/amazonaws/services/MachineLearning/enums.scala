package facade.amazonaws.services.machinelearning

import scalajs._

/** The function used to train an <code>MLModel</code>. Training choices supported by Amazon ML include the following: * <code>SGD</code> - Stochastic Gradient Descent. * <code>RandomForest</code> - Random forest of decision trees.
  */
type Algorithm = "sgd"
object Algorithm {
  val sgd: "sgd" = "sgd"

  @inline def values = js.Array[Algorithm](sgd)
}

/** A list of the variables to use in searching or filtering <code>BatchPrediction</code>. * <code>CreatedAt</code> - Sets the search criteria to <code>BatchPrediction</code> creation date. * <code>Status</code> - Sets the search criteria to <code>BatchPrediction</code> status. * <code>Name</code> - Sets the search criteria to the contents of <code>BatchPrediction</code> <code>Name</code>. * <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>BatchPrediction</code> creation. * <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> used in the <code>BatchPrediction</code>. * <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in the <code>BatchPrediction</code>. * <code>DataURI</code> - Sets the search criteria to the data file(s) used in the <code>BatchPrediction</code>. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
  */
type BatchPredictionFilterVariable = "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "IAMUser" | "MLModelId" | "DataSourceId" | "DataURI"
object BatchPredictionFilterVariable {
  val CreatedAt: "CreatedAt" = "CreatedAt"
  val LastUpdatedAt: "LastUpdatedAt" = "LastUpdatedAt"
  val Status: "Status" = "Status"
  val Name: "Name" = "Name"
  val IAMUser: "IAMUser" = "IAMUser"
  val MLModelId: "MLModelId" = "MLModelId"
  val DataSourceId: "DataSourceId" = "DataSourceId"
  val DataURI: "DataURI" = "DataURI"

  @inline def values = js.Array[BatchPredictionFilterVariable](CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI)
}

/** A list of the variables to use in searching or filtering <code>DataSource</code>. * <code>CreatedAt</code> - Sets the search criteria to <code>DataSource</code> creation date. * <code>Status</code> - Sets the search criteria to <code>DataSource</code> status. * <code>Name</code> - Sets the search criteria to the contents of <code>DataSource</code> <code>Name</code>. * <code>DataUri</code> - Sets the search criteria to the URI of data files used to create the <code>DataSource</code>. The URI can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory. * <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>DataSource</code> creation.
  * ```Note:``` The variable names should match the variable names in the <code>DataSource</code>.
  */
type DataSourceFilterVariable = "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "DataLocationS3" | "IAMUser"
object DataSourceFilterVariable {
  val CreatedAt: "CreatedAt" = "CreatedAt"
  val LastUpdatedAt: "LastUpdatedAt" = "LastUpdatedAt"
  val Status: "Status" = "Status"
  val Name: "Name" = "Name"
  val DataLocationS3: "DataLocationS3" = "DataLocationS3"
  val IAMUser: "IAMUser" = "IAMUser"

  @inline def values = js.Array[DataSourceFilterVariable](CreatedAt, LastUpdatedAt, Status, Name, DataLocationS3, IAMUser)
}

/** Contains the key values of <code>DetailsMap</code>: * <code>PredictiveModelType</code> - Indicates the type of the <code>MLModel</code>. * <code>Algorithm</code> - Indicates the algorithm that was used for the <code>MLModel</code>.
  */
type DetailsAttributes = "PredictiveModelType" | "Algorithm"
object DetailsAttributes {
  val PredictiveModelType: "PredictiveModelType" = "PredictiveModelType"
  val Algorithm: "Algorithm" = "Algorithm"

  @inline def values = js.Array[DetailsAttributes](PredictiveModelType, Algorithm)
}

/** Object status with the following possible values: * <code>PENDING</code> * <code>INPROGRESS</code> * <code>FAILED</code> * <code>COMPLETED</code> * <code>DELETED</code>
  */
type EntityStatus = "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED"
object EntityStatus {
  val PENDING: "PENDING" = "PENDING"
  val INPROGRESS: "INPROGRESS" = "INPROGRESS"
  val FAILED: "FAILED" = "FAILED"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[EntityStatus](PENDING, INPROGRESS, FAILED, COMPLETED, DELETED)
}

/** A list of the variables to use in searching or filtering <code>Evaluation</code>. * <code>CreatedAt</code> - Sets the search criteria to <code>Evaluation</code> creation date. * <code>Status</code> - Sets the search criteria to <code>Evaluation</code> status. * <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> ``` ``` <code>Name</code>. * <code>IAMUser</code> - Sets the search criteria to the user account that invoked an evaluation. * <code>MLModelId</code> - Sets the search criteria to the <code>Predictor</code> that was evaluated. * <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in evaluation. * <code>DataUri</code> - Sets the search criteria to the data file(s) used in evaluation. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
  */
type EvaluationFilterVariable = "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "IAMUser" | "MLModelId" | "DataSourceId" | "DataURI"
object EvaluationFilterVariable {
  val CreatedAt: "CreatedAt" = "CreatedAt"
  val LastUpdatedAt: "LastUpdatedAt" = "LastUpdatedAt"
  val Status: "Status" = "Status"
  val Name: "Name" = "Name"
  val IAMUser: "IAMUser" = "IAMUser"
  val MLModelId: "MLModelId" = "MLModelId"
  val DataSourceId: "DataSourceId" = "DataSourceId"
  val DataURI: "DataURI" = "DataURI"

  @inline def values = js.Array[EvaluationFilterVariable](CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI)
}

type MLModelFilterVariable = "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "IAMUser" | "TrainingDataSourceId" | "RealtimeEndpointStatus" | "MLModelType" | "Algorithm" | "TrainingDataURI"
object MLModelFilterVariable {
  val CreatedAt: "CreatedAt" = "CreatedAt"
  val LastUpdatedAt: "LastUpdatedAt" = "LastUpdatedAt"
  val Status: "Status" = "Status"
  val Name: "Name" = "Name"
  val IAMUser: "IAMUser" = "IAMUser"
  val TrainingDataSourceId: "TrainingDataSourceId" = "TrainingDataSourceId"
  val RealtimeEndpointStatus: "RealtimeEndpointStatus" = "RealtimeEndpointStatus"
  val MLModelType: "MLModelType" = "MLModelType"
  val Algorithm: "Algorithm" = "Algorithm"
  val TrainingDataURI: "TrainingDataURI" = "TrainingDataURI"

  @inline def values = js.Array[MLModelFilterVariable](CreatedAt, LastUpdatedAt, Status, Name, IAMUser, TrainingDataSourceId, RealtimeEndpointStatus, MLModelType, Algorithm, TrainingDataURI)
}

type MLModelType = "REGRESSION" | "BINARY" | "MULTICLASS"
object MLModelType {
  val REGRESSION: "REGRESSION" = "REGRESSION"
  val BINARY: "BINARY" = "BINARY"
  val MULTICLASS: "MULTICLASS" = "MULTICLASS"

  @inline def values = js.Array[MLModelType](REGRESSION, BINARY, MULTICLASS)
}

type RealtimeEndpointStatus = "NONE" | "READY" | "UPDATING" | "FAILED"
object RealtimeEndpointStatus {
  val NONE: "NONE" = "NONE"
  val READY: "READY" = "READY"
  val UPDATING: "UPDATING" = "UPDATING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[RealtimeEndpointStatus](NONE, READY, UPDATING, FAILED)
}

/** The sort order specified in a listing condition. Possible values include the following: * <code>asc</code> - Present the information in ascending order (from A-Z). * <code>dsc</code> - Present the information in descending order (from Z-A).
  */
type SortOrder = "asc" | "dsc"
object SortOrder {
  val asc: "asc" = "asc"
  val dsc: "dsc" = "dsc"

  @inline def values = js.Array[SortOrder](asc, dsc)
}

type TaggableResourceType = "BatchPrediction" | "DataSource" | "Evaluation" | "MLModel"
object TaggableResourceType {
  val BatchPrediction: "BatchPrediction" = "BatchPrediction"
  val DataSource: "DataSource" = "DataSource"
  val Evaluation: "Evaluation" = "Evaluation"
  val MLModel: "MLModel" = "MLModel"

  @inline def values = js.Array[TaggableResourceType](BatchPrediction, DataSource, Evaluation, MLModel)
}
