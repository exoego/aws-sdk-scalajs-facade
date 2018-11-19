package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object mediastore {
  type AllowedHeaders = js.Array[Header]
  type AllowedMethods = js.Array[MethodName]
  type AllowedOrigins = js.Array[Origin]
  type ContainerARN = String
  type ContainerList = js.Array[Container]
  type ContainerListLimit = Int
  type ContainerName = String
  type ContainerPolicy = String
  type ContainerStatus = String
  type CorsPolicy = js.Array[CorsRule]
  type Endpoint = String
  type ErrorMessage = String
  type ExposeHeaders = js.Array[Header]
  type Header = String
  type MaxAgeSeconds = Int
  type MethodName = String
  type Origin = String
  type PaginationToken = String
  type TimeStamp = js.Date
}

package mediastore {
  @js.native
  @JSImport("aws-sdk", "MediaStore")
  class MediaStore(config: AWSConfig) extends js.Object {
    def createContainer(params: CreateContainerInput): Request[CreateContainerOutput] = js.native
    def deleteContainer(params: DeleteContainerInput): Request[DeleteContainerOutput] = js.native
    def deleteContainerPolicy(params: DeleteContainerPolicyInput): Request[DeleteContainerPolicyOutput] = js.native
    def deleteCorsPolicy(params: DeleteCorsPolicyInput): Request[DeleteCorsPolicyOutput] = js.native
    def describeContainer(params: DescribeContainerInput): Request[DescribeContainerOutput] = js.native
    def getContainerPolicy(params: GetContainerPolicyInput): Request[GetContainerPolicyOutput] = js.native
    def getCorsPolicy(params: GetCorsPolicyInput): Request[GetCorsPolicyOutput] = js.native
    def listContainers(params: ListContainersInput): Request[ListContainersOutput] = js.native
    def putContainerPolicy(params: PutContainerPolicyInput): Request[PutContainerPolicyOutput] = js.native
    def putCorsPolicy(params: PutCorsPolicyInput): Request[PutCorsPolicyOutput] = js.native
  }

  /**
   * <p>This section describes operations that you can perform on an AWS Elemental MediaStore container.</p>
   */
  @js.native
  trait Container extends js.Object {
    var ARN: js.UndefOr[ContainerARN]
    var Name: js.UndefOr[ContainerName]
    var Endpoint: js.UndefOr[Endpoint]
    var Status: js.UndefOr[ContainerStatus]
    var CreationTime: js.UndefOr[TimeStamp]
  }

  object Container {
    def apply(
      ARN: js.UndefOr[ContainerARN] = js.undefined,
      Name: js.UndefOr[ContainerName] = js.undefined,
      Endpoint: js.UndefOr[Endpoint] = js.undefined,
      Status: js.UndefOr[ContainerStatus] = js.undefined,
      CreationTime: js.UndefOr[TimeStamp] = js.undefined): Container = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "CreationTime" -> CreationTime.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Container]
    }
  }

  /**
   * <p>Resource already exists or is being updated.</p>
   */
  @js.native
  trait ContainerInUseExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>Could not perform an operation on a container that does not exist.</p>
   */
  @js.native
  trait ContainerNotFoundExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  object ContainerStatusEnum {
    val ACTIVE = "ACTIVE"
    val CREATING = "CREATING"
    val DELETING = "DELETING"

    val values = IndexedSeq(ACTIVE, CREATING, DELETING)
  }

  /**
   * <p>Could not perform an operation on a policy that does not exist.</p>
   */
  @js.native
  trait CorsPolicyNotFoundExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>A rule for a CORS policy. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed.</p>
   */
  @js.native
  trait CorsRule extends js.Object {
    var ExposeHeaders: js.UndefOr[ExposeHeaders]
    var AllowedHeaders: js.UndefOr[AllowedHeaders]
    var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds]
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var AllowedOrigins: js.UndefOr[AllowedOrigins]
  }

  object CorsRule {
    def apply(
      ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined,
      AllowedHeaders: js.UndefOr[AllowedHeaders] = js.undefined,
      MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined,
      AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
      AllowedOrigins: js.UndefOr[AllowedOrigins] = js.undefined): CorsRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ExposeHeaders" -> ExposeHeaders.map { x => x.asInstanceOf[js.Any] },
        "AllowedHeaders" -> AllowedHeaders.map { x => x.asInstanceOf[js.Any] },
        "MaxAgeSeconds" -> MaxAgeSeconds.map { x => x.asInstanceOf[js.Any] },
        "AllowedMethods" -> AllowedMethods.map { x => x.asInstanceOf[js.Any] },
        "AllowedOrigins" -> AllowedOrigins.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CorsRule]
    }
  }

  @js.native
  trait CreateContainerInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  object CreateContainerInput {
    def apply(
      ContainerName: js.UndefOr[ContainerName] = js.undefined): CreateContainerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerName" -> ContainerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateContainerInput]
    }
  }

  @js.native
  trait CreateContainerOutput extends js.Object {
    var Container: js.UndefOr[Container]
  }

  object CreateContainerOutput {
    def apply(
      Container: js.UndefOr[Container] = js.undefined): CreateContainerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Container" -> Container.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateContainerOutput]
    }
  }

  @js.native
  trait DeleteContainerInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  object DeleteContainerInput {
    def apply(
      ContainerName: js.UndefOr[ContainerName] = js.undefined): DeleteContainerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerName" -> ContainerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteContainerInput]
    }
  }

  @js.native
  trait DeleteContainerOutput extends js.Object {

  }

  object DeleteContainerOutput {
    def apply(): DeleteContainerOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteContainerOutput]
    }
  }

  @js.native
  trait DeleteContainerPolicyInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  object DeleteContainerPolicyInput {
    def apply(
      ContainerName: js.UndefOr[ContainerName] = js.undefined): DeleteContainerPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerName" -> ContainerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteContainerPolicyInput]
    }
  }

  @js.native
  trait DeleteContainerPolicyOutput extends js.Object {

  }

  object DeleteContainerPolicyOutput {
    def apply(): DeleteContainerPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteContainerPolicyOutput]
    }
  }

  @js.native
  trait DeleteCorsPolicyInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  object DeleteCorsPolicyInput {
    def apply(
      ContainerName: js.UndefOr[ContainerName] = js.undefined): DeleteCorsPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerName" -> ContainerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCorsPolicyInput]
    }
  }

  @js.native
  trait DeleteCorsPolicyOutput extends js.Object {

  }

  object DeleteCorsPolicyOutput {
    def apply(): DeleteCorsPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCorsPolicyOutput]
    }
  }

  @js.native
  trait DescribeContainerInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  object DescribeContainerInput {
    def apply(
      ContainerName: js.UndefOr[ContainerName] = js.undefined): DescribeContainerInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerName" -> ContainerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContainerInput]
    }
  }

  @js.native
  trait DescribeContainerOutput extends js.Object {
    var Container: js.UndefOr[Container]
  }

  object DescribeContainerOutput {
    def apply(
      Container: js.UndefOr[Container] = js.undefined): DescribeContainerOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Container" -> Container.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeContainerOutput]
    }
  }

  @js.native
  trait GetContainerPolicyInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  object GetContainerPolicyInput {
    def apply(
      ContainerName: js.UndefOr[ContainerName] = js.undefined): GetContainerPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerName" -> ContainerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContainerPolicyInput]
    }
  }

  @js.native
  trait GetContainerPolicyOutput extends js.Object {
    var Policy: js.UndefOr[ContainerPolicy]
  }

  object GetContainerPolicyOutput {
    def apply(
      Policy: js.UndefOr[ContainerPolicy] = js.undefined): GetContainerPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetContainerPolicyOutput]
    }
  }

  @js.native
  trait GetCorsPolicyInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  object GetCorsPolicyInput {
    def apply(
      ContainerName: js.UndefOr[ContainerName] = js.undefined): GetCorsPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerName" -> ContainerName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCorsPolicyInput]
    }
  }

  @js.native
  trait GetCorsPolicyOutput extends js.Object {
    var CorsPolicy: js.UndefOr[CorsPolicy]
  }

  object GetCorsPolicyOutput {
    def apply(
      CorsPolicy: js.UndefOr[CorsPolicy] = js.undefined): GetCorsPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CorsPolicy" -> CorsPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCorsPolicyOutput]
    }
  }

  /**
   * <p>The service is temporarily unavailable.</p>
   */
  @js.native
  trait InternalServerErrorException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>A service limit has been exceeded.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait ListContainersInput extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var MaxResults: js.UndefOr[ContainerListLimit]
  }

  object ListContainersInput {
    def apply(
      NextToken: js.UndefOr[PaginationToken] = js.undefined,
      MaxResults: js.UndefOr[ContainerListLimit] = js.undefined): ListContainersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListContainersInput]
    }
  }

  @js.native
  trait ListContainersOutput extends js.Object {
    var Containers: js.UndefOr[ContainerList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListContainersOutput {
    def apply(
      Containers: js.UndefOr[ContainerList] = js.undefined,
      NextToken: js.UndefOr[PaginationToken] = js.undefined): ListContainersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Containers" -> Containers.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListContainersOutput]
    }
  }

  object MethodNameEnum {
    val PUT = "PUT"
    val GET = "GET"
    val DELETE = "DELETE"
    val HEAD = "HEAD"

    val values = IndexedSeq(PUT, GET, DELETE, HEAD)
  }

  /**
   * <p>Could not perform an operation on a policy that does not exist.</p>
   */
  @js.native
  trait PolicyNotFoundExceptionException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait PutContainerPolicyInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
    var Policy: js.UndefOr[ContainerPolicy]
  }

  object PutContainerPolicyInput {
    def apply(
      ContainerName: js.UndefOr[ContainerName] = js.undefined,
      Policy: js.UndefOr[ContainerPolicy] = js.undefined): PutContainerPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerName" -> ContainerName.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutContainerPolicyInput]
    }
  }

  @js.native
  trait PutContainerPolicyOutput extends js.Object {

  }

  object PutContainerPolicyOutput {
    def apply(): PutContainerPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutContainerPolicyOutput]
    }
  }

  @js.native
  trait PutCorsPolicyInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
    var CorsPolicy: js.UndefOr[CorsPolicy]
  }

  object PutCorsPolicyInput {
    def apply(
      ContainerName: js.UndefOr[ContainerName] = js.undefined,
      CorsPolicy: js.UndefOr[CorsPolicy] = js.undefined): PutCorsPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerName" -> ContainerName.map { x => x.asInstanceOf[js.Any] },
        "CorsPolicy" -> CorsPolicy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutCorsPolicyInput]
    }
  }

  @js.native
  trait PutCorsPolicyOutput extends js.Object {

  }

  object PutCorsPolicyOutput {
    def apply(): PutCorsPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutCorsPolicyOutput]
    }
  }
}
