package facade.amazonaws.services.omics

import scalajs.js

type AnnotationType = "GENERIC" | "CHR_POS" | "CHR_POS_REF_ALT" | "CHR_START_END_ONE_BASE" | "CHR_START_END_REF_ALT_ONE_BASE" | "CHR_START_END_ZERO_BASE" | "CHR_START_END_REF_ALT_ZERO_BASE"
object AnnotationType {
  inline val GENERIC: "GENERIC" = "GENERIC"
  inline val CHR_POS: "CHR_POS" = "CHR_POS"
  inline val CHR_POS_REF_ALT: "CHR_POS_REF_ALT" = "CHR_POS_REF_ALT"
  inline val CHR_START_END_ONE_BASE: "CHR_START_END_ONE_BASE" = "CHR_START_END_ONE_BASE"
  inline val CHR_START_END_REF_ALT_ONE_BASE: "CHR_START_END_REF_ALT_ONE_BASE" = "CHR_START_END_REF_ALT_ONE_BASE"
  inline val CHR_START_END_ZERO_BASE: "CHR_START_END_ZERO_BASE" = "CHR_START_END_ZERO_BASE"
  inline val CHR_START_END_REF_ALT_ZERO_BASE: "CHR_START_END_REF_ALT_ZERO_BASE" = "CHR_START_END_REF_ALT_ZERO_BASE"

  inline def values: js.Array[AnnotationType] = js.Array(GENERIC, CHR_POS, CHR_POS_REF_ALT, CHR_START_END_ONE_BASE, CHR_START_END_REF_ALT_ONE_BASE, CHR_START_END_ZERO_BASE, CHR_START_END_REF_ALT_ZERO_BASE)
}

type EncryptionType = "KMS"
object EncryptionType {
  inline val KMS: "KMS" = "KMS"

  inline def values: js.Array[EncryptionType] = js.Array(KMS)
}

type FileType = "FASTQ" | "BAM" | "CRAM"
object FileType {
  inline val FASTQ: "FASTQ" = "FASTQ"
  inline val BAM: "BAM" = "BAM"
  inline val CRAM: "CRAM" = "CRAM"

  inline def values: js.Array[FileType] = js.Array(FASTQ, BAM, CRAM)
}

type FormatToHeaderKey = "CHR" | "START" | "END" | "REF" | "ALT" | "POS"
object FormatToHeaderKey {
  inline val CHR: "CHR" = "CHR"
  inline val START: "START" = "START"
  inline val END: "END" = "END"
  inline val REF: "REF" = "REF"
  inline val ALT: "ALT" = "ALT"
  inline val POS: "POS" = "POS"

  inline def values: js.Array[FormatToHeaderKey] = js.Array(CHR, START, END, REF, ALT, POS)
}

type JobStatus = "SUBMITTED" | "IN_PROGRESS" | "CANCELLED" | "COMPLETED" | "FAILED"
object JobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLED, COMPLETED, FAILED)
}

type ReadSetActivationJobItemStatus = "NOT_STARTED" | "IN_PROGRESS" | "FINISHED" | "FAILED"
object ReadSetActivationJobItemStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ReadSetActivationJobItemStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FINISHED, FAILED)
}

type ReadSetActivationJobStatus = "SUBMITTED" | "IN_PROGRESS" | "CANCELLING" | "CANCELLED" | "FAILED" | "COMPLETED" | "COMPLETED_WITH_FAILURES"
object ReadSetActivationJobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val COMPLETED_WITH_FAILURES: "COMPLETED_WITH_FAILURES" = "COMPLETED_WITH_FAILURES"

  inline def values: js.Array[ReadSetActivationJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLING, CANCELLED, FAILED, COMPLETED, COMPLETED_WITH_FAILURES)
}

type ReadSetExportJobItemStatus = "NOT_STARTED" | "IN_PROGRESS" | "FINISHED" | "FAILED"
object ReadSetExportJobItemStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ReadSetExportJobItemStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FINISHED, FAILED)
}

type ReadSetExportJobStatus = "SUBMITTED" | "IN_PROGRESS" | "CANCELLING" | "CANCELLED" | "FAILED" | "COMPLETED" | "COMPLETED_WITH_FAILURES"
object ReadSetExportJobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val COMPLETED_WITH_FAILURES: "COMPLETED_WITH_FAILURES" = "COMPLETED_WITH_FAILURES"

  inline def values: js.Array[ReadSetExportJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLING, CANCELLED, FAILED, COMPLETED, COMPLETED_WITH_FAILURES)
}

type ReadSetFile = "SOURCE1" | "SOURCE2" | "INDEX"
object ReadSetFile {
  inline val SOURCE1: "SOURCE1" = "SOURCE1"
  inline val SOURCE2: "SOURCE2" = "SOURCE2"
  inline val INDEX: "INDEX" = "INDEX"

  inline def values: js.Array[ReadSetFile] = js.Array(SOURCE1, SOURCE2, INDEX)
}

type ReadSetImportJobItemStatus = "NOT_STARTED" | "IN_PROGRESS" | "FINISHED" | "FAILED"
object ReadSetImportJobItemStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ReadSetImportJobItemStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FINISHED, FAILED)
}

type ReadSetImportJobStatus = "SUBMITTED" | "IN_PROGRESS" | "CANCELLING" | "CANCELLED" | "FAILED" | "COMPLETED" | "COMPLETED_WITH_FAILURES"
object ReadSetImportJobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val COMPLETED_WITH_FAILURES: "COMPLETED_WITH_FAILURES" = "COMPLETED_WITH_FAILURES"

  inline def values: js.Array[ReadSetImportJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLING, CANCELLED, FAILED, COMPLETED, COMPLETED_WITH_FAILURES)
}

type ReadSetStatus = "ARCHIVED" | "ACTIVATING" | "ACTIVE" | "DELETING" | "DELETED"
object ReadSetStatus {
  inline val ARCHIVED: "ARCHIVED" = "ARCHIVED"
  inline val ACTIVATING: "ACTIVATING" = "ACTIVATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[ReadSetStatus] = js.Array(ARCHIVED, ACTIVATING, ACTIVE, DELETING, DELETED)
}

type ReferenceFile = "SOURCE" | "INDEX"
object ReferenceFile {
  inline val SOURCE: "SOURCE" = "SOURCE"
  inline val INDEX: "INDEX" = "INDEX"

  inline def values: js.Array[ReferenceFile] = js.Array(SOURCE, INDEX)
}

type ReferenceImportJobItemStatus = "NOT_STARTED" | "IN_PROGRESS" | "FINISHED" | "FAILED"
object ReferenceImportJobItemStatus {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val FINISHED: "FINISHED" = "FINISHED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ReferenceImportJobItemStatus] = js.Array(NOT_STARTED, IN_PROGRESS, FINISHED, FAILED)
}

type ReferenceImportJobStatus = "SUBMITTED" | "IN_PROGRESS" | "CANCELLING" | "CANCELLED" | "FAILED" | "COMPLETED" | "COMPLETED_WITH_FAILURES"
object ReferenceImportJobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val COMPLETED_WITH_FAILURES: "COMPLETED_WITH_FAILURES" = "COMPLETED_WITH_FAILURES"

  inline def values: js.Array[ReferenceImportJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, CANCELLING, CANCELLED, FAILED, COMPLETED, COMPLETED_WITH_FAILURES)
}

type ReferenceStatus = "ACTIVE" | "DELETING" | "DELETED"
object ReferenceStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[ReferenceStatus] = js.Array(ACTIVE, DELETING, DELETED)
}

type RunExport = "DEFINITION"
object RunExport {
  inline val DEFINITION: "DEFINITION" = "DEFINITION"

  inline def values: js.Array[RunExport] = js.Array(DEFINITION)
}

type RunLogLevel = "OFF" | "FATAL" | "ERROR" | "ALL"
object RunLogLevel {
  inline val OFF: "OFF" = "OFF"
  inline val FATAL: "FATAL" = "FATAL"
  inline val ERROR: "ERROR" = "ERROR"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[RunLogLevel] = js.Array(OFF, FATAL, ERROR, ALL)
}

type RunStatus = "PENDING" | "STARTING" | "RUNNING" | "STOPPING" | "COMPLETED" | "DELETED" | "CANCELLED" | "FAILED"
object RunStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val DELETED: "DELETED" = "DELETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[RunStatus] = js.Array(PENDING, STARTING, RUNNING, STOPPING, COMPLETED, DELETED, CANCELLED, FAILED)
}

type SchemaValueType = "LONG" | "INT" | "STRING" | "FLOAT" | "DOUBLE" | "BOOLEAN"
object SchemaValueType {
  inline val LONG: "LONG" = "LONG"
  inline val INT: "INT" = "INT"
  inline val STRING: "STRING" = "STRING"
  inline val FLOAT: "FLOAT" = "FLOAT"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"

  inline def values: js.Array[SchemaValueType] = js.Array(LONG, INT, STRING, FLOAT, DOUBLE, BOOLEAN)
}

type StoreFormat = "GFF" | "TSV" | "VCF"
object StoreFormat {
  inline val GFF: "GFF" = "GFF"
  inline val TSV: "TSV" = "TSV"
  inline val VCF: "VCF" = "VCF"

  inline def values: js.Array[StoreFormat] = js.Array(GFF, TSV, VCF)
}

type StoreStatus = "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | "FAILED"
object StoreStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[StoreStatus] = js.Array(CREATING, UPDATING, DELETING, ACTIVE, FAILED)
}

type TaskStatus = "PENDING" | "STARTING" | "RUNNING" | "STOPPING" | "COMPLETED" | "CANCELLED" | "FAILED"
object TaskStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val STARTING: "STARTING" = "STARTING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val STOPPING: "STOPPING" = "STOPPING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[TaskStatus] = js.Array(PENDING, STARTING, RUNNING, STOPPING, COMPLETED, CANCELLED, FAILED)
}

type WorkflowEngine = "WDL" | "NEXTFLOW"
object WorkflowEngine {
  inline val WDL: "WDL" = "WDL"
  inline val NEXTFLOW: "NEXTFLOW" = "NEXTFLOW"

  inline def values: js.Array[WorkflowEngine] = js.Array(WDL, NEXTFLOW)
}

type WorkflowExport = "DEFINITION"
object WorkflowExport {
  inline val DEFINITION: "DEFINITION" = "DEFINITION"

  inline def values: js.Array[WorkflowExport] = js.Array(DEFINITION)
}

type WorkflowStatus = "CREATING" | "ACTIVE" | "UPDATING" | "DELETED" | "FAILED"
object WorkflowStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[WorkflowStatus] = js.Array(CREATING, ACTIVE, UPDATING, DELETED, FAILED)
}

type WorkflowType = "PRIVATE"
object WorkflowType {
  inline val PRIVATE: "PRIVATE" = "PRIVATE"

  inline def values: js.Array[WorkflowType] = js.Array(PRIVATE)
}
