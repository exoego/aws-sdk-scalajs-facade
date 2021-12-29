package facade.amazonaws.services.imagebuilder

import scalajs._

type ComponentFormat = "SHELL"
object ComponentFormat {
  val SHELL: "SHELL" = "SHELL"

  @inline def values = js.Array[ComponentFormat](SHELL)
}

type ComponentType = "BUILD" | "TEST"
object ComponentType {
  val BUILD: "BUILD" = "BUILD"
  val TEST: "TEST" = "TEST"

  @inline def values = js.Array[ComponentType](BUILD, TEST)
}

type ContainerRepositoryService = "ECR"
object ContainerRepositoryService {
  val ECR: "ECR" = "ECR"

  @inline def values = js.Array[ContainerRepositoryService](ECR)
}

type ContainerType = "DOCKER"
object ContainerType {
  val DOCKER: "DOCKER" = "DOCKER"

  @inline def values = js.Array[ContainerType](DOCKER)
}

type EbsVolumeType = "standard" | "io1" | "io2" | "gp2" | "gp3" | "sc1" | "st1"
object EbsVolumeType {
  val standard: "standard" = "standard"
  val io1: "io1" = "io1"
  val io2: "io2" = "io2"
  val gp2: "gp2" = "gp2"
  val gp3: "gp3" = "gp3"
  val sc1: "sc1" = "sc1"
  val st1: "st1" = "st1"

  @inline def values = js.Array[EbsVolumeType](standard, io1, io2, gp2, gp3, sc1, st1)
}

type ImageStatus = "PENDING" | "CREATING" | "BUILDING" | "TESTING" | "DISTRIBUTING" | "INTEGRATING" | "AVAILABLE" | "CANCELLED" | "FAILED" | "DEPRECATED" | "DELETED"
object ImageStatus {
  val PENDING: "PENDING" = "PENDING"
  val CREATING: "CREATING" = "CREATING"
  val BUILDING: "BUILDING" = "BUILDING"
  val TESTING: "TESTING" = "TESTING"
  val DISTRIBUTING: "DISTRIBUTING" = "DISTRIBUTING"
  val INTEGRATING: "INTEGRATING" = "INTEGRATING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val FAILED: "FAILED" = "FAILED"
  val DEPRECATED: "DEPRECATED" = "DEPRECATED"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[ImageStatus](PENDING, CREATING, BUILDING, TESTING, DISTRIBUTING, INTEGRATING, AVAILABLE, CANCELLED, FAILED, DEPRECATED, DELETED)
}

type ImageType = "AMI" | "DOCKER"
object ImageType {
  val AMI: "AMI" = "AMI"
  val DOCKER: "DOCKER" = "DOCKER"

  @inline def values = js.Array[ImageType](AMI, DOCKER)
}

type Ownership = "Self" | "Shared" | "Amazon"
object Ownership {
  val Self: "Self" = "Self"
  val Shared: "Shared" = "Shared"
  val Amazon: "Amazon" = "Amazon"

  @inline def values = js.Array[Ownership](Self, Shared, Amazon)
}

type PipelineExecutionStartCondition = "EXPRESSION_MATCH_ONLY" | "EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE"
object PipelineExecutionStartCondition {
  val EXPRESSION_MATCH_ONLY: "EXPRESSION_MATCH_ONLY" = "EXPRESSION_MATCH_ONLY"
  val EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE: "EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE" = "EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE"

  @inline def values = js.Array[PipelineExecutionStartCondition](EXPRESSION_MATCH_ONLY, EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE)
}

type PipelineStatus = "DISABLED" | "ENABLED"
object PipelineStatus {
  val DISABLED: "DISABLED" = "DISABLED"
  val ENABLED: "ENABLED" = "ENABLED"

  @inline def values = js.Array[PipelineStatus](DISABLED, ENABLED)
}

type Platform = "Windows" | "Linux"
object Platform {
  val Windows: "Windows" = "Windows"
  val Linux: "Linux" = "Linux"

  @inline def values = js.Array[Platform](Windows, Linux)
}
