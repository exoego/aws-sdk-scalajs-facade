package facade.amazonaws.services.machinelearning

import scalajs.js

/** The function used to train an <code>MLModel</code>. Training choices supported by Amazon ML include the following: * <code>SGD</code> - Stochastic Gradient Descent. * <code>RandomForest</code> - Random forest of decision trees.
  */
@js.native
sealed trait Algorithm extends js.Any
object Algorithm {
  val sgd = "sgd".asInstanceOf[Algorithm]

  @inline def values: js.Array[Algorithm] = js.Array(sgd)
}

/** A list of the variables to use in searching or filtering <code>BatchPrediction</code>. * <code>CreatedAt</code> - Sets the search criteria to <code>BatchPrediction</code> creation date. * <code>Status</code> - Sets the search criteria to <code>BatchPrediction</code> status. * <code>Name</code> - Sets the search criteria to the contents of <code>BatchPrediction</code> <code>Name</code>. * <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>BatchPrediction</code> creation. * <code>MLModelId</code> - Sets the search criteria to the <code>MLModel</code> used in the <code>BatchPrediction</code>. * <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in the <code>BatchPrediction</code>. * <code>DataURI</code> - Sets the search criteria to the data file(s) used in the <code>BatchPrediction</code>. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
  */
@js.native
sealed trait BatchPredictionFilterVariable extends js.Any
object BatchPredictionFilterVariable {
  val CreatedAt = "CreatedAt".asInstanceOf[BatchPredictionFilterVariable]
  val LastUpdatedAt = "LastUpdatedAt".asInstanceOf[BatchPredictionFilterVariable]
  val Status = "Status".asInstanceOf[BatchPredictionFilterVariable]
  val Name = "Name".asInstanceOf[BatchPredictionFilterVariable]
  val IAMUser = "IAMUser".asInstanceOf[BatchPredictionFilterVariable]
  val MLModelId = "MLModelId".asInstanceOf[BatchPredictionFilterVariable]
  val DataSourceId = "DataSourceId".asInstanceOf[BatchPredictionFilterVariable]
  val DataURI = "DataURI".asInstanceOf[BatchPredictionFilterVariable]

  @inline def values: js.Array[BatchPredictionFilterVariable] = js.Array(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI)
}

/** A list of the variables to use in searching or filtering <code>DataSource</code>. * <code>CreatedAt</code> - Sets the search criteria to <code>DataSource</code> creation date. * <code>Status</code> - Sets the search criteria to <code>DataSource</code> status. * <code>Name</code> - Sets the search criteria to the contents of <code>DataSource</code> <code>Name</code>. * <code>DataUri</code> - Sets the search criteria to the URI of data files used to create the <code>DataSource</code>. The URI can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory. * <code>IAMUser</code> - Sets the search criteria to the user account that invoked the <code>DataSource</code> creation.
  * ```Note:``` The variable names should match the variable names in the <code>DataSource</code>.
  */
@js.native
sealed trait DataSourceFilterVariable extends js.Any
object DataSourceFilterVariable {
  val CreatedAt = "CreatedAt".asInstanceOf[DataSourceFilterVariable]
  val LastUpdatedAt = "LastUpdatedAt".asInstanceOf[DataSourceFilterVariable]
  val Status = "Status".asInstanceOf[DataSourceFilterVariable]
  val Name = "Name".asInstanceOf[DataSourceFilterVariable]
  val DataLocationS3 = "DataLocationS3".asInstanceOf[DataSourceFilterVariable]
  val IAMUser = "IAMUser".asInstanceOf[DataSourceFilterVariable]

  @inline def values: js.Array[DataSourceFilterVariable] = js.Array(CreatedAt, LastUpdatedAt, Status, Name, DataLocationS3, IAMUser)
}

/** Contains the key values of <code>DetailsMap</code>: * <code>PredictiveModelType</code> - Indicates the type of the <code>MLModel</code>. * <code>Algorithm</code> - Indicates the algorithm that was used for the <code>MLModel</code>.
  */
@js.native
sealed trait DetailsAttributes extends js.Any
object DetailsAttributes {
  val PredictiveModelType = "PredictiveModelType".asInstanceOf[DetailsAttributes]
  val Algorithm = "Algorithm".asInstanceOf[DetailsAttributes]

  @inline def values: js.Array[DetailsAttributes] = js.Array(PredictiveModelType, Algorithm)
}

/** Object status with the following possible values: * <code>PENDING</code> * <code>INPROGRESS</code> * <code>FAILED</code> * <code>COMPLETED</code> * <code>DELETED</code>
  */
@js.native
sealed trait EntityStatus extends js.Any
object EntityStatus {
  val PENDING = "PENDING".asInstanceOf[EntityStatus]
  val INPROGRESS = "INPROGRESS".asInstanceOf[EntityStatus]
  val FAILED = "FAILED".asInstanceOf[EntityStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[EntityStatus]
  val DELETED = "DELETED".asInstanceOf[EntityStatus]

  @inline def values: js.Array[EntityStatus] = js.Array(PENDING, INPROGRESS, FAILED, COMPLETED, DELETED)
}

/** A list of the variables to use in searching or filtering <code>Evaluation</code>. * <code>CreatedAt</code> - Sets the search criteria to <code>Evaluation</code> creation date. * <code>Status</code> - Sets the search criteria to <code>Evaluation</code> status. * <code>Name</code> - Sets the search criteria to the contents of <code>Evaluation</code> ``` ``` <code>Name</code>. * <code>IAMUser</code> - Sets the search criteria to the user account that invoked an evaluation. * <code>MLModelId</code> - Sets the search criteria to the <code>Predictor</code> that was evaluated. * <code>DataSourceId</code> - Sets the search criteria to the <code>DataSource</code> used in evaluation. * <code>DataUri</code> - Sets the search criteria to the data file(s) used in evaluation. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.
  */
@js.native
sealed trait EvaluationFilterVariable extends js.Any
object EvaluationFilterVariable {
  val CreatedAt = "CreatedAt".asInstanceOf[EvaluationFilterVariable]
  val LastUpdatedAt = "LastUpdatedAt".asInstanceOf[EvaluationFilterVariable]
  val Status = "Status".asInstanceOf[EvaluationFilterVariable]
  val Name = "Name".asInstanceOf[EvaluationFilterVariable]
  val IAMUser = "IAMUser".asInstanceOf[EvaluationFilterVariable]
  val MLModelId = "MLModelId".asInstanceOf[EvaluationFilterVariable]
  val DataSourceId = "DataSourceId".asInstanceOf[EvaluationFilterVariable]
  val DataURI = "DataURI".asInstanceOf[EvaluationFilterVariable]

  @inline def values: js.Array[EvaluationFilterVariable] = js.Array(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, MLModelId, DataSourceId, DataURI)
}

@js.native
sealed trait MLModelFilterVariable extends js.Any
object MLModelFilterVariable {
  val CreatedAt = "CreatedAt".asInstanceOf[MLModelFilterVariable]
  val LastUpdatedAt = "LastUpdatedAt".asInstanceOf[MLModelFilterVariable]
  val Status = "Status".asInstanceOf[MLModelFilterVariable]
  val Name = "Name".asInstanceOf[MLModelFilterVariable]
  val IAMUser = "IAMUser".asInstanceOf[MLModelFilterVariable]
  val TrainingDataSourceId = "TrainingDataSourceId".asInstanceOf[MLModelFilterVariable]
  val RealtimeEndpointStatus = "RealtimeEndpointStatus".asInstanceOf[MLModelFilterVariable]
  val MLModelType = "MLModelType".asInstanceOf[MLModelFilterVariable]
  val Algorithm = "Algorithm".asInstanceOf[MLModelFilterVariable]
  val TrainingDataURI = "TrainingDataURI".asInstanceOf[MLModelFilterVariable]

  @inline def values: js.Array[MLModelFilterVariable] = js.Array(CreatedAt, LastUpdatedAt, Status, Name, IAMUser, TrainingDataSourceId, RealtimeEndpointStatus, MLModelType, Algorithm, TrainingDataURI)
}

@js.native
sealed trait MLModelType extends js.Any
object MLModelType {
  val REGRESSION = "REGRESSION".asInstanceOf[MLModelType]
  val BINARY = "BINARY".asInstanceOf[MLModelType]
  val MULTICLASS = "MULTICLASS".asInstanceOf[MLModelType]

  @inline def values: js.Array[MLModelType] = js.Array(REGRESSION, BINARY, MULTICLASS)
}

@js.native
sealed trait RealtimeEndpointStatus extends js.Any
object RealtimeEndpointStatus {
  val NONE = "NONE".asInstanceOf[RealtimeEndpointStatus]
  val READY = "READY".asInstanceOf[RealtimeEndpointStatus]
  val UPDATING = "UPDATING".asInstanceOf[RealtimeEndpointStatus]
  val FAILED = "FAILED".asInstanceOf[RealtimeEndpointStatus]

  @inline def values: js.Array[RealtimeEndpointStatus] = js.Array(NONE, READY, UPDATING, FAILED)
}

/** The sort order specified in a listing condition. Possible values include the following: * <code>asc</code> - Present the information in ascending order (from A-Z). * <code>dsc</code> - Present the information in descending order (from Z-A).
  */
@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val asc = "asc".asInstanceOf[SortOrder]
  val dsc = "dsc".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(asc, dsc)
}

@js.native
sealed trait TaggableResourceType extends js.Any
object TaggableResourceType {
  val BatchPrediction = "BatchPrediction".asInstanceOf[TaggableResourceType]
  val DataSource = "DataSource".asInstanceOf[TaggableResourceType]
  val Evaluation = "Evaluation".asInstanceOf[TaggableResourceType]
  val MLModel = "MLModel".asInstanceOf[TaggableResourceType]

  @inline def values: js.Array[TaggableResourceType] = js.Array(BatchPrediction, DataSource, Evaluation, MLModel)
}
