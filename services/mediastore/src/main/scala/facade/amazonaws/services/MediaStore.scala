package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object mediastore {
  type AllowedHeaders                = js.Array[Header]
  type AllowedMethods                = js.Array[MethodName]
  type AllowedOrigins                = js.Array[Origin]
  type ContainerARN                  = String
  type ContainerAccessLoggingEnabled = Boolean
  type ContainerList                 = js.Array[Container]
  type ContainerListLimit            = Int
  type ContainerName                 = String
  type ContainerPolicy               = String
  type ContainerStatus               = String
  type CorsPolicy                    = js.Array[CorsRule]
  type Endpoint                      = String
  type ExposeHeaders                 = js.Array[Header]
  type Header                        = String
  type LifecyclePolicy               = String
  type MaxAgeSeconds                 = Int
  type MethodName                    = String
  type Origin                        = String
  type PaginationToken               = String
  type TimeStamp                     = js.Date

  implicit final class MediaStoreOps(val service: MediaStore) extends AnyVal {

    def createContainerFuture(params: CreateContainerInput): Future[CreateContainerOutput] =
      service.createContainer(params).promise.toFuture
    def deleteContainerFuture(params: DeleteContainerInput): Future[DeleteContainerOutput] =
      service.deleteContainer(params).promise.toFuture
    def deleteContainerPolicyFuture(params: DeleteContainerPolicyInput): Future[DeleteContainerPolicyOutput] =
      service.deleteContainerPolicy(params).promise.toFuture
    def deleteCorsPolicyFuture(params: DeleteCorsPolicyInput): Future[DeleteCorsPolicyOutput] =
      service.deleteCorsPolicy(params).promise.toFuture
    def deleteLifecyclePolicyFuture(params: DeleteLifecyclePolicyInput): Future[DeleteLifecyclePolicyOutput] =
      service.deleteLifecyclePolicy(params).promise.toFuture
    def describeContainerFuture(params: DescribeContainerInput): Future[DescribeContainerOutput] =
      service.describeContainer(params).promise.toFuture
    def getContainerPolicyFuture(params: GetContainerPolicyInput): Future[GetContainerPolicyOutput] =
      service.getContainerPolicy(params).promise.toFuture
    def getCorsPolicyFuture(params: GetCorsPolicyInput): Future[GetCorsPolicyOutput] =
      service.getCorsPolicy(params).promise.toFuture
    def getLifecyclePolicyFuture(params: GetLifecyclePolicyInput): Future[GetLifecyclePolicyOutput] =
      service.getLifecyclePolicy(params).promise.toFuture
    def listContainersFuture(params: ListContainersInput): Future[ListContainersOutput] =
      service.listContainers(params).promise.toFuture
    def putContainerPolicyFuture(params: PutContainerPolicyInput): Future[PutContainerPolicyOutput] =
      service.putContainerPolicy(params).promise.toFuture
    def putCorsPolicyFuture(params: PutCorsPolicyInput): Future[PutCorsPolicyOutput] =
      service.putCorsPolicy(params).promise.toFuture
    def putLifecyclePolicyFuture(params: PutLifecyclePolicyInput): Future[PutLifecyclePolicyOutput] =
      service.putLifecyclePolicy(params).promise.toFuture
    def startAccessLoggingFuture(params: StartAccessLoggingInput): Future[StartAccessLoggingOutput] =
      service.startAccessLogging(params).promise.toFuture
    def stopAccessLoggingFuture(params: StopAccessLoggingInput): Future[StopAccessLoggingOutput] =
      service.stopAccessLogging(params).promise.toFuture
  }
}

package mediastore {
  @js.native
  @JSImport("aws-sdk", "MediaStore")
  class MediaStore() extends js.Object {
    def this(config: AWSConfig) = this()

    def createContainer(params: CreateContainerInput): Request[CreateContainerOutput]                   = js.native
    def deleteContainer(params: DeleteContainerInput): Request[DeleteContainerOutput]                   = js.native
    def deleteContainerPolicy(params: DeleteContainerPolicyInput): Request[DeleteContainerPolicyOutput] = js.native
    def deleteCorsPolicy(params: DeleteCorsPolicyInput): Request[DeleteCorsPolicyOutput]                = js.native
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyInput): Request[DeleteLifecyclePolicyOutput] = js.native
    def describeContainer(params: DescribeContainerInput): Request[DescribeContainerOutput]             = js.native
    def getContainerPolicy(params: GetContainerPolicyInput): Request[GetContainerPolicyOutput]          = js.native
    def getCorsPolicy(params: GetCorsPolicyInput): Request[GetCorsPolicyOutput]                         = js.native
    def getLifecyclePolicy(params: GetLifecyclePolicyInput): Request[GetLifecyclePolicyOutput]          = js.native
    def listContainers(params: ListContainersInput): Request[ListContainersOutput]                      = js.native
    def putContainerPolicy(params: PutContainerPolicyInput): Request[PutContainerPolicyOutput]          = js.native
    def putCorsPolicy(params: PutCorsPolicyInput): Request[PutCorsPolicyOutput]                         = js.native
    def putLifecyclePolicy(params: PutLifecyclePolicyInput): Request[PutLifecyclePolicyOutput]          = js.native
    def startAccessLogging(params: StartAccessLoggingInput): Request[StartAccessLoggingOutput]          = js.native
    def stopAccessLogging(params: StopAccessLoggingInput): Request[StopAccessLoggingOutput]             = js.native
  }

  /**
    * This section describes operations that you can perform on an AWS Elemental MediaStore container.
    */
  @js.native
  trait Container extends js.Object {
    var ARN: js.UndefOr[ContainerARN]
    var AccessLoggingEnabled: js.UndefOr[ContainerAccessLoggingEnabled]
    var CreationTime: js.UndefOr[TimeStamp]
    var Endpoint: js.UndefOr[Endpoint]
    var Name: js.UndefOr[ContainerName]
    var Status: js.UndefOr[ContainerStatus]
  }

  object Container {
    def apply(
        ARN: js.UndefOr[ContainerARN] = js.undefined,
        AccessLoggingEnabled: js.UndefOr[ContainerAccessLoggingEnabled] = js.undefined,
        CreationTime: js.UndefOr[TimeStamp] = js.undefined,
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        Name: js.UndefOr[ContainerName] = js.undefined,
        Status: js.UndefOr[ContainerStatus] = js.undefined
    ): Container = {
      val __obj = js.Dictionary.empty[js.Any]
      ARN.foreach(__v => __obj.update("ARN", __v.asInstanceOf[js.Any]))
      AccessLoggingEnabled.foreach(__v => __obj.update("AccessLoggingEnabled", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Container]
    }
  }

  object ContainerStatusEnum {
    val ACTIVE   = "ACTIVE"
    val CREATING = "CREATING"
    val DELETING = "DELETING"

    val values = IndexedSeq(ACTIVE, CREATING, DELETING)
  }

  /**
    * A rule for a CORS policy. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
    */
  @js.native
  trait CorsRule extends js.Object {
    var AllowedHeaders: AllowedHeaders
    var AllowedOrigins: AllowedOrigins
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var ExposeHeaders: js.UndefOr[ExposeHeaders]
    var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds]
  }

  object CorsRule {
    def apply(
        AllowedHeaders: AllowedHeaders,
        AllowedOrigins: AllowedOrigins,
        AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
        ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined,
        MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined
    ): CorsRule = {
      val __obj = js.Dictionary[js.Any](
        "AllowedHeaders" -> AllowedHeaders.asInstanceOf[js.Any],
        "AllowedOrigins" -> AllowedOrigins.asInstanceOf[js.Any]
      )

      AllowedMethods.foreach(__v => __obj.update("AllowedMethods", __v.asInstanceOf[js.Any]))
      ExposeHeaders.foreach(__v => __obj.update("ExposeHeaders", __v.asInstanceOf[js.Any]))
      MaxAgeSeconds.foreach(__v => __obj.update("MaxAgeSeconds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CorsRule]
    }
  }

  @js.native
  trait CreateContainerInput extends js.Object {
    var ContainerName: ContainerName
  }

  object CreateContainerInput {
    def apply(
        ContainerName: ContainerName
    ): CreateContainerInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateContainerInput]
    }
  }

  @js.native
  trait CreateContainerOutput extends js.Object {
    var Container: Container
  }

  object CreateContainerOutput {
    def apply(
        Container: Container
    ): CreateContainerOutput = {
      val __obj = js.Dictionary[js.Any](
        "Container" -> Container.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateContainerOutput]
    }
  }

  @js.native
  trait DeleteContainerInput extends js.Object {
    var ContainerName: ContainerName
  }

  object DeleteContainerInput {
    def apply(
        ContainerName: ContainerName
    ): DeleteContainerInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteContainerInput]
    }
  }

  @js.native
  trait DeleteContainerOutput extends js.Object {}

  object DeleteContainerOutput {
    def apply(
        ): DeleteContainerOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteContainerOutput]
    }
  }

  @js.native
  trait DeleteContainerPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object DeleteContainerPolicyInput {
    def apply(
        ContainerName: ContainerName
    ): DeleteContainerPolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteContainerPolicyInput]
    }
  }

  @js.native
  trait DeleteContainerPolicyOutput extends js.Object {}

  object DeleteContainerPolicyOutput {
    def apply(
        ): DeleteContainerPolicyOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteContainerPolicyOutput]
    }
  }

  @js.native
  trait DeleteCorsPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object DeleteCorsPolicyInput {
    def apply(
        ContainerName: ContainerName
    ): DeleteCorsPolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCorsPolicyInput]
    }
  }

  @js.native
  trait DeleteCorsPolicyOutput extends js.Object {}

  object DeleteCorsPolicyOutput {
    def apply(
        ): DeleteCorsPolicyOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteCorsPolicyOutput]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object DeleteLifecyclePolicyInput {
    def apply(
        ContainerName: ContainerName
    ): DeleteLifecyclePolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteLifecyclePolicyInput]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyOutput extends js.Object {}

  object DeleteLifecyclePolicyOutput {
    def apply(
        ): DeleteLifecyclePolicyOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteLifecyclePolicyOutput]
    }
  }

  @js.native
  trait DescribeContainerInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  object DescribeContainerInput {
    def apply(
        ContainerName: js.UndefOr[ContainerName] = js.undefined
    ): DescribeContainerInput = {
      val __obj = js.Dictionary.empty[js.Any]
      ContainerName.foreach(__v => __obj.update("ContainerName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContainerInput]
    }
  }

  @js.native
  trait DescribeContainerOutput extends js.Object {
    var Container: js.UndefOr[Container]
  }

  object DescribeContainerOutput {
    def apply(
        Container: js.UndefOr[Container] = js.undefined
    ): DescribeContainerOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      Container.foreach(__v => __obj.update("Container", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContainerOutput]
    }
  }

  @js.native
  trait GetContainerPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object GetContainerPolicyInput {
    def apply(
        ContainerName: ContainerName
    ): GetContainerPolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetContainerPolicyInput]
    }
  }

  @js.native
  trait GetContainerPolicyOutput extends js.Object {
    var Policy: ContainerPolicy
  }

  object GetContainerPolicyOutput {
    def apply(
        Policy: ContainerPolicy
    ): GetContainerPolicyOutput = {
      val __obj = js.Dictionary[js.Any](
        "Policy" -> Policy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetContainerPolicyOutput]
    }
  }

  @js.native
  trait GetCorsPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object GetCorsPolicyInput {
    def apply(
        ContainerName: ContainerName
    ): GetCorsPolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCorsPolicyInput]
    }
  }

  @js.native
  trait GetCorsPolicyOutput extends js.Object {
    var CorsPolicy: CorsPolicy
  }

  object GetCorsPolicyOutput {
    def apply(
        CorsPolicy: CorsPolicy
    ): GetCorsPolicyOutput = {
      val __obj = js.Dictionary[js.Any](
        "CorsPolicy" -> CorsPolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCorsPolicyOutput]
    }
  }

  @js.native
  trait GetLifecyclePolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object GetLifecyclePolicyInput {
    def apply(
        ContainerName: ContainerName
    ): GetLifecyclePolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetLifecyclePolicyInput]
    }
  }

  @js.native
  trait GetLifecyclePolicyOutput extends js.Object {
    var LifecyclePolicy: LifecyclePolicy
  }

  object GetLifecyclePolicyOutput {
    def apply(
        LifecyclePolicy: LifecyclePolicy
    ): GetLifecyclePolicyOutput = {
      val __obj = js.Dictionary[js.Any](
        "LifecyclePolicy" -> LifecyclePolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetLifecyclePolicyOutput]
    }
  }

  @js.native
  trait ListContainersInput extends js.Object {
    var MaxResults: js.UndefOr[ContainerListLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListContainersInput {
    def apply(
        MaxResults: js.UndefOr[ContainerListLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListContainersInput = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContainersInput]
    }
  }

  @js.native
  trait ListContainersOutput extends js.Object {
    var Containers: ContainerList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListContainersOutput {
    def apply(
        Containers: ContainerList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListContainersOutput = {
      val __obj = js.Dictionary[js.Any](
        "Containers" -> Containers.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContainersOutput]
    }
  }

  object MethodNameEnum {
    val PUT    = "PUT"
    val GET    = "GET"
    val DELETE = "DELETE"
    val HEAD   = "HEAD"

    val values = IndexedSeq(PUT, GET, DELETE, HEAD)
  }

  @js.native
  trait PutContainerPolicyInput extends js.Object {
    var ContainerName: ContainerName
    var Policy: ContainerPolicy
  }

  object PutContainerPolicyInput {
    def apply(
        ContainerName: ContainerName,
        Policy: ContainerPolicy
    ): PutContainerPolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any],
        "Policy"        -> Policy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutContainerPolicyInput]
    }
  }

  @js.native
  trait PutContainerPolicyOutput extends js.Object {}

  object PutContainerPolicyOutput {
    def apply(
        ): PutContainerPolicyOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutContainerPolicyOutput]
    }
  }

  @js.native
  trait PutCorsPolicyInput extends js.Object {
    var ContainerName: ContainerName
    var CorsPolicy: CorsPolicy
  }

  object PutCorsPolicyInput {
    def apply(
        ContainerName: ContainerName,
        CorsPolicy: CorsPolicy
    ): PutCorsPolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any],
        "CorsPolicy"    -> CorsPolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutCorsPolicyInput]
    }
  }

  @js.native
  trait PutCorsPolicyOutput extends js.Object {}

  object PutCorsPolicyOutput {
    def apply(
        ): PutCorsPolicyOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutCorsPolicyOutput]
    }
  }

  @js.native
  trait PutLifecyclePolicyInput extends js.Object {
    var ContainerName: ContainerName
    var LifecyclePolicy: LifecyclePolicy
  }

  object PutLifecyclePolicyInput {
    def apply(
        ContainerName: ContainerName,
        LifecyclePolicy: LifecyclePolicy
    ): PutLifecyclePolicyInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName"   -> ContainerName.asInstanceOf[js.Any],
        "LifecyclePolicy" -> LifecyclePolicy.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutLifecyclePolicyInput]
    }
  }

  @js.native
  trait PutLifecyclePolicyOutput extends js.Object {}

  object PutLifecyclePolicyOutput {
    def apply(
        ): PutLifecyclePolicyOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[PutLifecyclePolicyOutput]
    }
  }

  @js.native
  trait StartAccessLoggingInput extends js.Object {
    var ContainerName: ContainerName
  }

  object StartAccessLoggingInput {
    def apply(
        ContainerName: ContainerName
    ): StartAccessLoggingInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartAccessLoggingInput]
    }
  }

  @js.native
  trait StartAccessLoggingOutput extends js.Object {}

  object StartAccessLoggingOutput {
    def apply(
        ): StartAccessLoggingOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StartAccessLoggingOutput]
    }
  }

  @js.native
  trait StopAccessLoggingInput extends js.Object {
    var ContainerName: ContainerName
  }

  object StopAccessLoggingInput {
    def apply(
        ContainerName: ContainerName
    ): StopAccessLoggingInput = {
      val __obj = js.Dictionary[js.Any](
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopAccessLoggingInput]
    }
  }

  @js.native
  trait StopAccessLoggingOutput extends js.Object {}

  object StopAccessLoggingOutput {
    def apply(
        ): StopAccessLoggingOutput = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[StopAccessLoggingOutput]
    }
  }
}
