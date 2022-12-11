package facade.amazonaws.services.omics

import scalajs.js

@js.native
sealed trait AnnotationType extends js.Any
object AnnotationType {
  val GENERIC = "GENERIC".asInstanceOf[AnnotationType]
  val CHR_POS = "CHR_POS".asInstanceOf[AnnotationType]
  val CHR_POS_REF_ALT = "CHR_POS_REF_ALT".asInstanceOf[AnnotationType]
  val CHR_START_END_ONE_BASE = "CHR_START_END_ONE_BASE".asInstanceOf[AnnotationType]
  val CHR_START_END_REF_ALT_ONE_BASE = "CHR_START_END_REF_ALT_ONE_BASE".asInstanceOf[AnnotationType]
  val CHR_START_END_ZERO_BASE = "CHR_START_END_ZERO_BASE".asInstanceOf[AnnotationType]
  val CHR_START_END_REF_ALT_ZERO_BASE = "CHR_START_END_REF_ALT_ZERO_BASE".asInstanceOf[AnnotationType]

  @inline def values: js.Array[AnnotationType] = js.Array(GENERIC, CHR_POS, CHR_POS_REF_ALT, CHR_START_END_ONE_BASE, CHR_START_END_REF_ALT_ONE_BASE, CHR_START_END_ZERO_BASE, CHR_START_END_REF_ALT_ZERO_BASE)
}

@js.native
sealed trait EncryptionType extends js.Any
object EncryptionType {
  val KMS = "KMS".asInstanceOf[EncryptionType]

  @inline def values: js.Array[EncryptionType] = js.Array(KMS)
}

@js.native
sealed trait FileType extends js.Any
object FileType {
  val FASTQ = "FASTQ".asInstanceOf[FileType]
  val BAM = "BAM".asInstanceOf[FileType]
  val CRAM = "CRAM".asInstanceOf[FileType]

  @inline def values: js.Array[FileType] = js.Array(FASTQ, BAM, CRAM)
}

@js.native
sealed trait FormatToHeaderKey extends js.Any
object FormatToHeaderKey {
  val CHR = "CHR".asInstanceOf[FormatToHeaderKey]
  val START = "START".asInstanceOf[FormatToHeaderKey]
  val END = "END".asInstanceOf[FormatToHeaderKey]
  val REF = "REF".asInstanceOf[FormatToHeaderKey]
  val ALT = "ALT".asInstanceOf[FormatToHeaderKey]
  val POS = "POS".asInstanceOf[FormatToHeaderKey]

  @inline def values: js.Array[FormatToHeaderKey] = js.Array(CHR, START, END, REF, ALT, POS)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLED, COMPLETED, FAILED)
}

@js.native
sealed trait ReadSetActivationJobItemStatus extends js.Any
object ReadSetActivationJobItemStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[ReadSetActivationJobItemStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReadSetActivationJobItemStatus]
  val FINISHED = "FINISHED".asInstanceOf[ReadSetActivationJobItemStatus]
  val FAILED = "FAILED".asInstanceOf[ReadSetActivationJobItemStatus]

  @inline def values: js.Array[ReadSetActivationJobItemStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FINISHED, FAILED)
}

@js.native
sealed trait ReadSetActivationJobStatus extends js.Any
object ReadSetActivationJobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[ReadSetActivationJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReadSetActivationJobStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[ReadSetActivationJobStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ReadSetActivationJobStatus]
  val FAILED = "FAILED".asInstanceOf[ReadSetActivationJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ReadSetActivationJobStatus]
  val COMPLETED_WITH_FAILURES = "COMPLETED_WITH_FAILURES".asInstanceOf[ReadSetActivationJobStatus]

  @inline def values: js.Array[ReadSetActivationJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLING, CANCELLED, FAILED, COMPLETED, COMPLETED_WITH_FAILURES)
}

@js.native
sealed trait ReadSetExportJobItemStatus extends js.Any
object ReadSetExportJobItemStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[ReadSetExportJobItemStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReadSetExportJobItemStatus]
  val FINISHED = "FINISHED".asInstanceOf[ReadSetExportJobItemStatus]
  val FAILED = "FAILED".asInstanceOf[ReadSetExportJobItemStatus]

  @inline def values: js.Array[ReadSetExportJobItemStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FINISHED, FAILED)
}

@js.native
sealed trait ReadSetExportJobStatus extends js.Any
object ReadSetExportJobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[ReadSetExportJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReadSetExportJobStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[ReadSetExportJobStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ReadSetExportJobStatus]
  val FAILED = "FAILED".asInstanceOf[ReadSetExportJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ReadSetExportJobStatus]
  val COMPLETED_WITH_FAILURES = "COMPLETED_WITH_FAILURES".asInstanceOf[ReadSetExportJobStatus]

  @inline def values: js.Array[ReadSetExportJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLING, CANCELLED, FAILED, COMPLETED, COMPLETED_WITH_FAILURES)
}

@js.native
sealed trait ReadSetFile extends js.Any
object ReadSetFile {
  val SOURCE1 = "SOURCE1".asInstanceOf[ReadSetFile]
  val SOURCE2 = "SOURCE2".asInstanceOf[ReadSetFile]
  val INDEX = "INDEX".asInstanceOf[ReadSetFile]

  @inline def values: js.Array[ReadSetFile] = js.Array(SOURCE1, SOURCE2, INDEX)
}

@js.native
sealed trait ReadSetImportJobItemStatus extends js.Any
object ReadSetImportJobItemStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[ReadSetImportJobItemStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReadSetImportJobItemStatus]
  val FINISHED = "FINISHED".asInstanceOf[ReadSetImportJobItemStatus]
  val FAILED = "FAILED".asInstanceOf[ReadSetImportJobItemStatus]

  @inline def values: js.Array[ReadSetImportJobItemStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FINISHED, FAILED)
}

@js.native
sealed trait ReadSetImportJobStatus extends js.Any
object ReadSetImportJobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[ReadSetImportJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReadSetImportJobStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[ReadSetImportJobStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ReadSetImportJobStatus]
  val FAILED = "FAILED".asInstanceOf[ReadSetImportJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ReadSetImportJobStatus]
  val COMPLETED_WITH_FAILURES = "COMPLETED_WITH_FAILURES".asInstanceOf[ReadSetImportJobStatus]

  @inline def values: js.Array[ReadSetImportJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLING, CANCELLED, FAILED, COMPLETED, COMPLETED_WITH_FAILURES)
}

@js.native
sealed trait ReadSetStatus extends js.Any
object ReadSetStatus {
  val ARCHIVED = "ARCHIVED".asInstanceOf[ReadSetStatus]
  val ACTIVATING = "ACTIVATING".asInstanceOf[ReadSetStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[ReadSetStatus]
  val DELETING = "DELETING".asInstanceOf[ReadSetStatus]
  val DELETED = "DELETED".asInstanceOf[ReadSetStatus]

  @inline def values: js.Array[ReadSetStatus] = js.Array(ARCHIVED, ACTIVATING, ACTIVE, DELETING, DELETED)
}

@js.native
sealed trait ReferenceFile extends js.Any
object ReferenceFile {
  val SOURCE = "SOURCE".asInstanceOf[ReferenceFile]
  val INDEX = "INDEX".asInstanceOf[ReferenceFile]

  @inline def values: js.Array[ReferenceFile] = js.Array(SOURCE, INDEX)
}

@js.native
sealed trait ReferenceImportJobItemStatus extends js.Any
object ReferenceImportJobItemStatus {
  val NOT_STARTED = "NOT_STARTED".asInstanceOf[ReferenceImportJobItemStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReferenceImportJobItemStatus]
  val FINISHED = "FINISHED".asInstanceOf[ReferenceImportJobItemStatus]
  val FAILED = "FAILED".asInstanceOf[ReferenceImportJobItemStatus]

  @inline def values: js.Array[ReferenceImportJobItemStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FINISHED, FAILED)
}

@js.native
sealed trait ReferenceImportJobStatus extends js.Any
object ReferenceImportJobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[ReferenceImportJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[ReferenceImportJobStatus]
  val CANCELLING = "CANCELLING".asInstanceOf[ReferenceImportJobStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ReferenceImportJobStatus]
  val FAILED = "FAILED".asInstanceOf[ReferenceImportJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[ReferenceImportJobStatus]
  val COMPLETED_WITH_FAILURES = "COMPLETED_WITH_FAILURES".asInstanceOf[ReferenceImportJobStatus]

  @inline def values: js.Array[ReferenceImportJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLING, CANCELLED, FAILED, COMPLETED, COMPLETED_WITH_FAILURES)
}

@js.native
sealed trait ReferenceStatus extends js.Any
object ReferenceStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ReferenceStatus]
  val DELETING = "DELETING".asInstanceOf[ReferenceStatus]
  val DELETED = "DELETED".asInstanceOf[ReferenceStatus]

  @inline def values: js.Array[ReferenceStatus] = js.Array(ACTIVE, DELETING, DELETED)
}

@js.native
sealed trait RunExport extends js.Any
object RunExport {
  val DEFINITION = "DEFINITION".asInstanceOf[RunExport]

  @inline def values: js.Array[RunExport] = js.Array(DEFINITION)
}

@js.native
sealed trait RunLogLevel extends js.Any
object RunLogLevel {
  val OFF = "OFF".asInstanceOf[RunLogLevel]
  val FATAL = "FATAL".asInstanceOf[RunLogLevel]
  val ERROR = "ERROR".asInstanceOf[RunLogLevel]
  val ALL = "ALL".asInstanceOf[RunLogLevel]

  @inline def values: js.Array[RunLogLevel] = js.Array(OFF, FATAL, ERROR, ALL)
}

@js.native
sealed trait RunStatus extends js.Any
object RunStatus {
  val PENDING = "PENDING".asInstanceOf[RunStatus]
  val STARTING = "STARTING".asInstanceOf[RunStatus]
  val RUNNING = "RUNNING".asInstanceOf[RunStatus]
  val STOPPING = "STOPPING".asInstanceOf[RunStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[RunStatus]
  val DELETED = "DELETED".asInstanceOf[RunStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[RunStatus]
  val FAILED = "FAILED".asInstanceOf[RunStatus]

  @inline def values: js.Array[RunStatus] = js.Array(PENDING, STARTING, RUNNING, STOPPING, COMPLETED, DELETED, CANCELLED, FAILED)
}

@js.native
sealed trait SchemaValueType extends js.Any
object SchemaValueType {
  val LONG = "LONG".asInstanceOf[SchemaValueType]
  val INT = "INT".asInstanceOf[SchemaValueType]
  val STRING = "STRING".asInstanceOf[SchemaValueType]
  val FLOAT = "FLOAT".asInstanceOf[SchemaValueType]
  val DOUBLE = "DOUBLE".asInstanceOf[SchemaValueType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[SchemaValueType]

  @inline def values: js.Array[SchemaValueType] = js.Array(LONG, INT, STRING, FLOAT, DOUBLE, BOOLEAN)
}

@js.native
sealed trait StoreFormat extends js.Any
object StoreFormat {
  val GFF = "GFF".asInstanceOf[StoreFormat]
  val TSV = "TSV".asInstanceOf[StoreFormat]
  val VCF = "VCF".asInstanceOf[StoreFormat]

  @inline def values: js.Array[StoreFormat] = js.Array(GFF, TSV, VCF)
}

@js.native
sealed trait StoreStatus extends js.Any
object StoreStatus {
  val CREATING = "CREATING".asInstanceOf[StoreStatus]
  val UPDATING = "UPDATING".asInstanceOf[StoreStatus]
  val DELETING = "DELETING".asInstanceOf[StoreStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[StoreStatus]
  val FAILED = "FAILED".asInstanceOf[StoreStatus]

  @inline def values: js.Array[StoreStatus] = js.Array(CREATING, UPDATING, DELETING, ACTIVE, FAILED)
}

@js.native
sealed trait TaskStatus extends js.Any
object TaskStatus {
  val PENDING = "PENDING".asInstanceOf[TaskStatus]
  val STARTING = "STARTING".asInstanceOf[TaskStatus]
  val RUNNING = "RUNNING".asInstanceOf[TaskStatus]
  val STOPPING = "STOPPING".asInstanceOf[TaskStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[TaskStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[TaskStatus]
  val FAILED = "FAILED".asInstanceOf[TaskStatus]

  @inline def values: js.Array[TaskStatus] = js.Array(PENDING, STARTING, RUNNING, STOPPING, COMPLETED, CANCELLED, FAILED)
}

@js.native
sealed trait WorkflowEngine extends js.Any
object WorkflowEngine {
  val WDL = "WDL".asInstanceOf[WorkflowEngine]
  val NEXTFLOW = "NEXTFLOW".asInstanceOf[WorkflowEngine]

  @inline def values: js.Array[WorkflowEngine] = js.Array(WDL, NEXTFLOW)
}

@js.native
sealed trait WorkflowExport extends js.Any
object WorkflowExport {
  val DEFINITION = "DEFINITION".asInstanceOf[WorkflowExport]

  @inline def values: js.Array[WorkflowExport] = js.Array(DEFINITION)
}

@js.native
sealed trait WorkflowStatus extends js.Any
object WorkflowStatus {
  val CREATING = "CREATING".asInstanceOf[WorkflowStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[WorkflowStatus]
  val UPDATING = "UPDATING".asInstanceOf[WorkflowStatus]
  val DELETED = "DELETED".asInstanceOf[WorkflowStatus]
  val FAILED = "FAILED".asInstanceOf[WorkflowStatus]

  @inline def values: js.Array[WorkflowStatus] = js.Array(CREATING, ACTIVE, UPDATING, DELETED, FAILED)
}

@js.native
sealed trait WorkflowType extends js.Any
object WorkflowType {
  val PRIVATE = "PRIVATE".asInstanceOf[WorkflowType]

  @inline def values: js.Array[WorkflowType] = js.Array(PRIVATE)
}
