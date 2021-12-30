package facade.amazonaws.services.imagebuilder

import scalajs.js

type ComponentFormat = "SHELL"
object ComponentFormat {
  inline val SHELL: "SHELL" = "SHELL"

  inline def values: js.Array[ComponentFormat] = js.Array(SHELL)
}

type ComponentType = "BUILD" | "TEST"
object ComponentType {
  inline val BUILD: "BUILD" = "BUILD"
  inline val TEST: "TEST" = "TEST"

  inline def values: js.Array[ComponentType] = js.Array(BUILD, TEST)
}

type ContainerRepositoryService = "ECR"
object ContainerRepositoryService {
  inline val ECR: "ECR" = "ECR"

  inline def values: js.Array[ContainerRepositoryService] = js.Array(ECR)
}

type ContainerType = "DOCKER"
object ContainerType {
  inline val DOCKER: "DOCKER" = "DOCKER"

  inline def values: js.Array[ContainerType] = js.Array(DOCKER)
}

type EbsVolumeType = "standard" | "io1" | "io2" | "gp2" | "gp3" | "sc1" | "st1"
object EbsVolumeType {
  inline val standard: "standard" = "standard"
  inline val io1: "io1" = "io1"
  inline val io2: "io2" = "io2"
  inline val gp2: "gp2" = "gp2"
  inline val gp3: "gp3" = "gp3"
  inline val sc1: "sc1" = "sc1"
  inline val st1: "st1" = "st1"

  inline def values: js.Array[EbsVolumeType] = js.Array(standard, io1, io2, gp2, gp3, sc1, st1)
}

type ImageStatus = "PENDING" | "CREATING" | "BUILDING" | "TESTING" | "DISTRIBUTING" | "INTEGRATING" | "AVAILABLE" | "CANCELLED" | "FAILED" | "DEPRECATED" | "DELETED"
object ImageStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val CREATING: "CREATING" = "CREATING"
  inline val BUILDING: "BUILDING" = "BUILDING"
  inline val TESTING: "TESTING" = "TESTING"
  inline val DISTRIBUTING: "DISTRIBUTING" = "DISTRIBUTING"
  inline val INTEGRATING: "INTEGRATING" = "INTEGRATING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DEPRECATED: "DEPRECATED" = "DEPRECATED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[ImageStatus] = js.Array(PENDING, CREATING, BUILDING, TESTING, DISTRIBUTING, INTEGRATING, AVAILABLE, CANCELLED, FAILED, DEPRECATED, DELETED)
}

type ImageType = "AMI" | "DOCKER"
object ImageType {
  inline val AMI: "AMI" = "AMI"
  inline val DOCKER: "DOCKER" = "DOCKER"

  inline def values: js.Array[ImageType] = js.Array(AMI, DOCKER)
}

type Ownership = "Self" | "Shared" | "Amazon"
object Ownership {
  inline val Self: "Self" = "Self"
  inline val Shared: "Shared" = "Shared"
  inline val Amazon: "Amazon" = "Amazon"

  inline def values: js.Array[Ownership] = js.Array(Self, Shared, Amazon)
}

type PipelineExecutionStartCondition = "EXPRESSION_MATCH_ONLY" | "EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE"
object PipelineExecutionStartCondition {
  inline val EXPRESSION_MATCH_ONLY: "EXPRESSION_MATCH_ONLY" = "EXPRESSION_MATCH_ONLY"
  inline val EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE: "EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE" = "EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE"

  inline def values: js.Array[PipelineExecutionStartCondition] = js.Array(EXPRESSION_MATCH_ONLY, EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE)
}

type PipelineStatus = "DISABLED" | "ENABLED"
object PipelineStatus {
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val ENABLED: "ENABLED" = "ENABLED"

  inline def values: js.Array[PipelineStatus] = js.Array(DISABLED, ENABLED)
}

type Platform = "Windows" | "Linux"
object Platform {
  inline val Windows: "Windows" = "Windows"
  inline val Linux: "Linux" = "Linux"

  inline def values: js.Array[Platform] = js.Array(Windows, Linux)
}
