package facade.amazonaws.services.imagebuilder

import scalajs.js

@js.native
sealed trait ComponentFormat extends js.Any
object ComponentFormat {
  val SHELL = "SHELL".asInstanceOf[ComponentFormat]

  @inline def values: js.Array[ComponentFormat] = js.Array(SHELL)
}

@js.native
sealed trait ComponentType extends js.Any
object ComponentType {
  val BUILD = "BUILD".asInstanceOf[ComponentType]
  val TEST = "TEST".asInstanceOf[ComponentType]

  @inline def values: js.Array[ComponentType] = js.Array(BUILD, TEST)
}

@js.native
sealed trait ContainerRepositoryService extends js.Any
object ContainerRepositoryService {
  val ECR = "ECR".asInstanceOf[ContainerRepositoryService]

  @inline def values: js.Array[ContainerRepositoryService] = js.Array(ECR)
}

@js.native
sealed trait ContainerType extends js.Any
object ContainerType {
  val DOCKER = "DOCKER".asInstanceOf[ContainerType]

  @inline def values: js.Array[ContainerType] = js.Array(DOCKER)
}

@js.native
sealed trait EbsVolumeType extends js.Any
object EbsVolumeType {
  val standard = "standard".asInstanceOf[EbsVolumeType]
  val io1 = "io1".asInstanceOf[EbsVolumeType]
  val io2 = "io2".asInstanceOf[EbsVolumeType]
  val gp2 = "gp2".asInstanceOf[EbsVolumeType]
  val gp3 = "gp3".asInstanceOf[EbsVolumeType]
  val sc1 = "sc1".asInstanceOf[EbsVolumeType]
  val st1 = "st1".asInstanceOf[EbsVolumeType]

  @inline def values: js.Array[EbsVolumeType] = js.Array(standard, io1, io2, gp2, gp3, sc1, st1)
}

@js.native
sealed trait ImageStatus extends js.Any
object ImageStatus {
  val PENDING = "PENDING".asInstanceOf[ImageStatus]
  val CREATING = "CREATING".asInstanceOf[ImageStatus]
  val BUILDING = "BUILDING".asInstanceOf[ImageStatus]
  val TESTING = "TESTING".asInstanceOf[ImageStatus]
  val DISTRIBUTING = "DISTRIBUTING".asInstanceOf[ImageStatus]
  val INTEGRATING = "INTEGRATING".asInstanceOf[ImageStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[ImageStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ImageStatus]
  val FAILED = "FAILED".asInstanceOf[ImageStatus]
  val DEPRECATED = "DEPRECATED".asInstanceOf[ImageStatus]
  val DELETED = "DELETED".asInstanceOf[ImageStatus]

  @inline def values: js.Array[ImageStatus] = js.Array(PENDING, CREATING, BUILDING, TESTING, DISTRIBUTING, INTEGRATING, AVAILABLE, CANCELLED, FAILED, DEPRECATED, DELETED)
}

@js.native
sealed trait ImageType extends js.Any
object ImageType {
  val AMI = "AMI".asInstanceOf[ImageType]
  val DOCKER = "DOCKER".asInstanceOf[ImageType]

  @inline def values: js.Array[ImageType] = js.Array(AMI, DOCKER)
}

@js.native
sealed trait Ownership extends js.Any
object Ownership {
  val Self = "Self".asInstanceOf[Ownership]
  val Shared = "Shared".asInstanceOf[Ownership]
  val Amazon = "Amazon".asInstanceOf[Ownership]

  @inline def values: js.Array[Ownership] = js.Array(Self, Shared, Amazon)
}

@js.native
sealed trait PipelineExecutionStartCondition extends js.Any
object PipelineExecutionStartCondition {
  val EXPRESSION_MATCH_ONLY = "EXPRESSION_MATCH_ONLY".asInstanceOf[PipelineExecutionStartCondition]
  val EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE = "EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE".asInstanceOf[PipelineExecutionStartCondition]

  @inline def values: js.Array[PipelineExecutionStartCondition] = js.Array(EXPRESSION_MATCH_ONLY, EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE)
}

@js.native
sealed trait PipelineStatus extends js.Any
object PipelineStatus {
  val DISABLED = "DISABLED".asInstanceOf[PipelineStatus]
  val ENABLED = "ENABLED".asInstanceOf[PipelineStatus]

  @inline def values: js.Array[PipelineStatus] = js.Array(DISABLED, ENABLED)
}

@js.native
sealed trait Platform extends js.Any
object Platform {
  val Windows = "Windows".asInstanceOf[Platform]
  val Linux = "Linux".asInstanceOf[Platform]

  @inline def values: js.Array[Platform] = js.Array(Windows, Linux)
}
