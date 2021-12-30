package facade.amazonaws.services.machinelearning

import scalajs.js

/** The function used to train an <code>MLModel</code>. Training choices supported by Amazon ML include the following: * <code>SGD</code> - Stochastic Gradient Descent. * <code>RandomForest</code> - Random forest of decision trees.
  */
type Algorithm = "sgd"
object Algorithm {
  inline val sgd: "sgd" = "sgd"

  inline def values: js.Array[Algorithm] = js.Array(sgd)
}

/** A list of the variables to use in searching or filtering <code>BatchPrediction</code>. * <code>CreatedAt</code> - Sets the search criteria to <code>BatchPrediction</code> creation date. * <code>Status</code> - Sets the search criteria to <code>BatchPrediction</code> status. * <code>Name</code> - Sets the search criteria to the contents of <code>BatchPrediction</code> <code>Name</code>. * <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>BatchPrediction</code> creation. * <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> used in the <code>BatchPrediction</code>. * <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in the <code>BatchPrediction</code>. * <code>DataURI</code> - Sets the search criteria to the data file(s) used in the <code>BatchPrediction</code>. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
  */
type BatchPredictionFilterVariable = "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "IAMUser" | "MLModelId" | "DataSourceId" | "DataURI"
object BatchPredictionFilterVariable {
  inline val CreatedAt: "CreatedAt" = "CreatedAt"
  inline val LastUpdatedAt: "LastUpdatedAt" = "LastUpdatedAt"
  inline val Status: "Status" = "Status"
  inline val Name: "Name" = "Name"
  inline val IAMUser: "IAMUser" = "IAMUser"
  inline val MLModelId: "MLModelId" = "MLModelId"
  inline val DataSourceId: "DataSourceId" = "DataSourceId"
  inline val DataURI: "DataURI" = "DataURI"

  inline def values: js.Array[BatchPredictionFilterVariable] = js.Array(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI)
}

/** A list of the variables to use in searching or filtering <code>DataSource</code>. * <code>CreatedAt</code> - Sets the search criteria to <code>DataSource</code> creation date. * <code>Status</code> - Sets the search criteria to <code>DataSource</code> status. * <code>Name</code> - Sets the search criteria to the contents of <code>DataSource</code> <code>Name</code>. * <code>DataUri</code> - Sets the search criteria to the URI of data files used to create the <code>DataSource</code>. The URI can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory. * <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>DataSource</code> creation.
  * ```Note:``` The variable names should match the variable names in the <code>DataSource</code>.
  */
type DataSourceFilterVariable = "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "DataLocationS3" | "IAMUser"
object DataSourceFilterVariable {
  inline val CreatedAt: "CreatedAt" = "CreatedAt"
  inline val LastUpdatedAt: "LastUpdatedAt" = "LastUpdatedAt"
  inline val Status: "Status" = "Status"
  inline val Name: "Name" = "Name"
  inline val DataLocationS3: "DataLocationS3" = "DataLocationS3"
  inline val IAMUser: "IAMUser" = "IAMUser"

  inline def values: js.Array[DataSourceFilterVariable] = js.Array(CreatedAt, LastUpdatedAt, Status, Name, DataLocationS3, IAMUser)
}

/** Contains the key values of <code>DetailsMap</code>: * <code>PredictiveModelType</code> - Indicates the type of the <code>MLModel</code>. * <code>Algorithm</code> - Indicates the algorithm that was used for the <code>MLModel</code>.
  */
type DetailsAttributes = "PredictiveModelType" | "Algorithm"
object DetailsAttributes {
  inline val PredictiveModelType: "PredictiveModelType" = "PredictiveModelType"
  inline val Algorithm: "Algorithm" = "Algorithm"

  inline def values: js.Array[DetailsAttributes] = js.Array(PredictiveModelType, Algorithm)
}

/** Object status with the following possible values: * <code>PENDING</code> * <code>INPROGRESS</code> * <code>FAILED</code> * <code>COMPLETED</code> * <code>DELETED</code>
  */
type EntityStatus = "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED"
object EntityStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val INPROGRESS: "INPROGRESS" = "INPROGRESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[EntityStatus] = js.Array(PENDING, INPROGRESS, FAILED, COMPLETED, DELETED)
}

/** A list of the variables to use in searching or filtering <code>Evaluation</code>. * <code>CreatedAt</code> - Sets the search criteria to <code>Evaluation</code> creation date. * <code>Status</code> - Sets the search criteria to <code>Evaluation</code> status. * <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> ``` ``` <code>Name</code>. * <code>IAMUser</code> - Sets the search criteria to the user account that invoked an evaluation. * <code>MLModelId</code> - Sets the search criteria to the <code>Predictor</code> that was evaluated. * <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in evaluation. * <code>DataUri</code> - Sets the search criteria to the data file(s) used in evaluation. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
  */
type EvaluationFilterVariable = "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "IAMUser" | "MLModelId" | "DataSourceId" | "DataURI"
object EvaluationFilterVariable {
  inline val CreatedAt: "CreatedAt" = "CreatedAt"
  inline val LastUpdatedAt: "LastUpdatedAt" = "LastUpdatedAt"
  inline val Status: "Status" = "Status"
  inline val Name: "Name" = "Name"
  inline val IAMUser: "IAMUser" = "IAMUser"
  inline val MLModelId: "MLModelId" = "MLModelId"
  inline val DataSourceId: "DataSourceId" = "DataSourceId"
  inline val DataURI: "DataURI" = "DataURI"

  inline def values: js.Array[EvaluationFilterVariable] = js.Array(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI)
}

type MLModelFilterVariable = "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "IAMUser" | "TrainingDataSourceId" | "RealtimeEndpointStatus" | "MLModelType" | "Algorithm" | "TrainingDataURI"
object MLModelFilterVariable {
  inline val CreatedAt: "CreatedAt" = "CreatedAt"
  inline val LastUpdatedAt: "LastUpdatedAt" = "LastUpdatedAt"
  inline val Status: "Status" = "Status"
  inline val Name: "Name" = "Name"
  inline val IAMUser: "IAMUser" = "IAMUser"
  inline val TrainingDataSourceId: "TrainingDataSourceId" = "TrainingDataSourceId"
  inline val RealtimeEndpointStatus: "RealtimeEndpointStatus" = "RealtimeEndpointStatus"
  inline val MLModelType: "MLModelType" = "MLModelType"
  inline val Algorithm: "Algorithm" = "Algorithm"
  inline val TrainingDataURI: "TrainingDataURI" = "TrainingDataURI"

  inline def values: js.Array[MLModelFilterVariable] = js.Array(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, TrainingDataSourceId, RealtimeEndpointStatus, MLModelType, Algorithm, TrainingDataURI)
}

type MLModelType = "REGRESSION" | "BINARY" | "MULTICLASS"
object MLModelType {
  inline val REGRESSION: "REGRESSION" = "REGRESSION"
  inline val BINARY: "BINARY" = "BINARY"
  inline val MULTICLASS: "MULTICLASS" = "MULTICLASS"

  inline def values: js.Array[MLModelType] = js.Array(REGRESSION, BINARY, MULTICLASS)
}

type RealtimeEndpointStatus = "NONE" | "READY" | "UPDATING" | "FAILED"
object RealtimeEndpointStatus {
  inline val NONE: "NONE" = "NONE"
  inline val READY: "READY" = "READY"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[RealtimeEndpointStatus] = js.Array(NONE, READY, UPDATING, FAILED)
}

/** The sort order specified in a listing condition. Possible values include the following: * <code>asc</code> - Present the information in ascending order (from A-Z). * <code>dsc</code> - Present the information in descending order (from Z-A).
  */
type SortOrder = "asc" | "dsc"
object SortOrder {
  inline val asc: "asc" = "asc"
  inline val dsc: "dsc" = "dsc"

  inline def values: js.Array[SortOrder] = js.Array(asc, dsc)
}

type TaggableResourceType = "BatchPrediction" | "DataSource" | "Evaluation" | "MLModel"
object TaggableResourceType {
  inline val BatchPrediction: "BatchPrediction" = "BatchPrediction"
  inline val DataSource: "DataSource" = "DataSource"
  inline val Evaluation: "Evaluation" = "Evaluation"
  inline val MLModel: "MLModel" = "MLModel"

  inline def values: js.Array[TaggableResourceType] = js.Array(BatchPrediction, DataSource, Evaluation, MLModel)
}
