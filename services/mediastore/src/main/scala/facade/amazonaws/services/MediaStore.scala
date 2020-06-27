package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  type CorsPolicy                    = js.Array[CorsRule]
  type Endpoint                      = String
  type ExposeHeaders                 = js.Array[Header]
  type Header                        = String
  type LifecyclePolicy               = String
  type MaxAgeSeconds                 = Int
  type Origin                        = String
  type PaginationToken               = String
  type TagKey                        = String
  type TagKeyList                    = js.Array[TagKey]
  type TagList                       = js.Array[Tag]
  type TagValue                      = String
  type TimeStamp                     = js.Date

  implicit final class MediaStoreOps(private val service: MediaStore) extends AnyVal {

    @inline def createContainerFuture(params: CreateContainerInput): Future[CreateContainerOutput] =
      service.createContainer(params).promise().toFuture
    @inline def deleteContainerFuture(params: DeleteContainerInput): Future[DeleteContainerOutput] =
      service.deleteContainer(params).promise().toFuture
    @inline def deleteContainerPolicyFuture(params: DeleteContainerPolicyInput): Future[DeleteContainerPolicyOutput] =
      service.deleteContainerPolicy(params).promise().toFuture
    @inline def deleteCorsPolicyFuture(params: DeleteCorsPolicyInput): Future[DeleteCorsPolicyOutput] =
      service.deleteCorsPolicy(params).promise().toFuture
    @inline def deleteLifecyclePolicyFuture(params: DeleteLifecyclePolicyInput): Future[DeleteLifecyclePolicyOutput] =
      service.deleteLifecyclePolicy(params).promise().toFuture
    @inline def describeContainerFuture(params: DescribeContainerInput): Future[DescribeContainerOutput] =
      service.describeContainer(params).promise().toFuture
    @inline def getContainerPolicyFuture(params: GetContainerPolicyInput): Future[GetContainerPolicyOutput] =
      service.getContainerPolicy(params).promise().toFuture
    @inline def getCorsPolicyFuture(params: GetCorsPolicyInput): Future[GetCorsPolicyOutput] =
      service.getCorsPolicy(params).promise().toFuture
    @inline def getLifecyclePolicyFuture(params: GetLifecyclePolicyInput): Future[GetLifecyclePolicyOutput] =
      service.getLifecyclePolicy(params).promise().toFuture
    @inline def listContainersFuture(params: ListContainersInput): Future[ListContainersOutput] =
      service.listContainers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putContainerPolicyFuture(params: PutContainerPolicyInput): Future[PutContainerPolicyOutput] =
      service.putContainerPolicy(params).promise().toFuture
    @inline def putCorsPolicyFuture(params: PutCorsPolicyInput): Future[PutCorsPolicyOutput] =
      service.putCorsPolicy(params).promise().toFuture
    @inline def putLifecyclePolicyFuture(params: PutLifecyclePolicyInput): Future[PutLifecyclePolicyOutput] =
      service.putLifecyclePolicy(params).promise().toFuture
    @inline def startAccessLoggingFuture(params: StartAccessLoggingInput): Future[StartAccessLoggingOutput] =
      service.startAccessLogging(params).promise().toFuture
    @inline def stopAccessLoggingFuture(params: StopAccessLoggingInput): Future[StopAccessLoggingOutput] =
      service.stopAccessLogging(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise().toFuture
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
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]       = js.native
    def putContainerPolicy(params: PutContainerPolicyInput): Request[PutContainerPolicyOutput]          = js.native
    def putCorsPolicy(params: PutCorsPolicyInput): Request[PutCorsPolicyOutput]                         = js.native
    def putLifecyclePolicy(params: PutLifecyclePolicyInput): Request[PutLifecyclePolicyOutput]          = js.native
    def startAccessLogging(params: StartAccessLoggingInput): Request[StartAccessLoggingOutput]          = js.native
    def stopAccessLogging(params: StopAccessLoggingInput): Request[StopAccessLoggingOutput]             = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                               = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                         = js.native
  }

  /**
    * This section describes operations that you can perform on an AWS Elemental MediaStore container.
    */
  @js.native
  @Factory
  trait Container extends js.Object {
    var ARN: js.UndefOr[ContainerARN]
    var AccessLoggingEnabled: js.UndefOr[ContainerAccessLoggingEnabled]
    var CreationTime: js.UndefOr[TimeStamp]
    var Endpoint: js.UndefOr[Endpoint]
    var Name: js.UndefOr[ContainerName]
    var Status: js.UndefOr[ContainerStatus]
  }

  @js.native
  sealed trait ContainerStatus extends js.Any
  object ContainerStatus extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[ContainerStatus]
    val CREATING = "CREATING".asInstanceOf[ContainerStatus]
    val DELETING = "DELETING".asInstanceOf[ContainerStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, CREATING, DELETING))
  }

  /**
    * A rule for a CORS policy. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
    */
  @js.native
  @Factory
  trait CorsRule extends js.Object {
    var AllowedHeaders: AllowedHeaders
    var AllowedOrigins: AllowedOrigins
    var AllowedMethods: js.UndefOr[AllowedMethods]
    var ExposeHeaders: js.UndefOr[ExposeHeaders]
    var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds]
  }

  @js.native
  @Factory
  trait CreateContainerInput extends js.Object {
    var ContainerName: ContainerName
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateContainerOutput extends js.Object {
    var Container: Container
  }

  @js.native
  @Factory
  trait DeleteContainerInput extends js.Object {
    var ContainerName: ContainerName
  }

  @js.native
  @Factory
  trait DeleteContainerOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteContainerPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  @js.native
  @Factory
  trait DeleteContainerPolicyOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteCorsPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  @js.native
  @Factory
  trait DeleteCorsPolicyOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteLifecyclePolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  @js.native
  @Factory
  trait DeleteLifecyclePolicyOutput extends js.Object {}

  @js.native
  @Factory
  trait DescribeContainerInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  @js.native
  @Factory
  trait DescribeContainerOutput extends js.Object {
    var Container: js.UndefOr[Container]
  }

  @js.native
  @Factory
  trait GetContainerPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  @js.native
  @Factory
  trait GetContainerPolicyOutput extends js.Object {
    var Policy: ContainerPolicy
  }

  @js.native
  @Factory
  trait GetCorsPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  @js.native
  @Factory
  trait GetCorsPolicyOutput extends js.Object {
    var CorsPolicy: CorsPolicy
  }

  @js.native
  @Factory
  trait GetLifecyclePolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  @js.native
  @Factory
  trait GetLifecyclePolicyOutput extends js.Object {
    var LifecyclePolicy: LifecyclePolicy
  }

  @js.native
  @Factory
  trait ListContainersInput extends js.Object {
    var MaxResults: js.UndefOr[ContainerListLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListContainersOutput extends js.Object {
    var Containers: ContainerList
    var NextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var Resource: ContainerARN
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait MethodName extends js.Any
  object MethodName extends js.Object {
    val PUT    = "PUT".asInstanceOf[MethodName]
    val GET    = "GET".asInstanceOf[MethodName]
    val DELETE = "DELETE".asInstanceOf[MethodName]
    val HEAD   = "HEAD".asInstanceOf[MethodName]

    val values = js.Object.freeze(js.Array(PUT, GET, DELETE, HEAD))
  }

  @js.native
  @Factory
  trait PutContainerPolicyInput extends js.Object {
    var ContainerName: ContainerName
    var Policy: ContainerPolicy
  }

  @js.native
  @Factory
  trait PutContainerPolicyOutput extends js.Object {}

  @js.native
  @Factory
  trait PutCorsPolicyInput extends js.Object {
    var ContainerName: ContainerName
    var CorsPolicy: CorsPolicy
  }

  @js.native
  @Factory
  trait PutCorsPolicyOutput extends js.Object {}

  @js.native
  @Factory
  trait PutLifecyclePolicyInput extends js.Object {
    var ContainerName: ContainerName
    var LifecyclePolicy: LifecyclePolicy
  }

  @js.native
  @Factory
  trait PutLifecyclePolicyOutput extends js.Object {}

  @js.native
  @Factory
  trait StartAccessLoggingInput extends js.Object {
    var ContainerName: ContainerName
  }

  @js.native
  @Factory
  trait StartAccessLoggingOutput extends js.Object {}

  @js.native
  @Factory
  trait StopAccessLoggingInput extends js.Object {
    var ContainerName: ContainerName
  }

  @js.native
  @Factory
  trait StopAccessLoggingOutput extends js.Object {}

  /**
    * A collection of tags associated with a container. Each tag consists of a key:value pair, which can be anything you define. Typically, the tag key represents a category (such as "environment") and the tag value represents a specific value within that category (such as "test," "development," or "production"). You can add up to 50 tags to each container. For more information about tagging, including naming and usage conventions, see [[https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html|Tagging Resources in MediaStore]].
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var Resource: ContainerARN
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var Resource: ContainerARN
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceOutput extends js.Object {}
}
