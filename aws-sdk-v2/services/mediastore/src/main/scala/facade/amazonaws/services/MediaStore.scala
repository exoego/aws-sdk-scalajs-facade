package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object mediastore {
  type AllowedHeaders = js.Array[Header]
  type AllowedMethods = js.Array[MethodName]
  type AllowedOrigins = js.Array[Origin]
  type ContainerARN = String
  type ContainerAccessLoggingEnabled = Boolean
  type ContainerList = js.Array[Container]
  type ContainerListLimit = Int
  type ContainerName = String
  type ContainerPolicy = String
  type CorsPolicy = js.Array[CorsRule]
  type Endpoint = String
  type ExposeHeaders = js.Array[Header]
  type Header = String
  type LifecyclePolicy = String
  type MaxAgeSeconds = Int
  type MetricPolicyRules = js.Array[MetricPolicyRule]
  type ObjectGroup = String
  type ObjectGroupName = String
  type Origin = String
  type PaginationToken = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TimeStamp = js.Date

  final class MediaStoreOps(private val service: MediaStore) extends AnyVal {

    @inline def createContainerFuture(params: CreateContainerInput): Future[CreateContainerOutput] = service.createContainer(params).promise().toFuture
    @inline def deleteContainerFuture(params: DeleteContainerInput): Future[DeleteContainerOutput] = service.deleteContainer(params).promise().toFuture
    @inline def deleteContainerPolicyFuture(params: DeleteContainerPolicyInput): Future[DeleteContainerPolicyOutput] = service.deleteContainerPolicy(params).promise().toFuture
    @inline def deleteCorsPolicyFuture(params: DeleteCorsPolicyInput): Future[DeleteCorsPolicyOutput] = service.deleteCorsPolicy(params).promise().toFuture
    @inline def deleteLifecyclePolicyFuture(params: DeleteLifecyclePolicyInput): Future[DeleteLifecyclePolicyOutput] = service.deleteLifecyclePolicy(params).promise().toFuture
    @inline def deleteMetricPolicyFuture(params: DeleteMetricPolicyInput): Future[DeleteMetricPolicyOutput] = service.deleteMetricPolicy(params).promise().toFuture
    @inline def describeContainerFuture(params: DescribeContainerInput): Future[DescribeContainerOutput] = service.describeContainer(params).promise().toFuture
    @inline def getContainerPolicyFuture(params: GetContainerPolicyInput): Future[GetContainerPolicyOutput] = service.getContainerPolicy(params).promise().toFuture
    @inline def getCorsPolicyFuture(params: GetCorsPolicyInput): Future[GetCorsPolicyOutput] = service.getCorsPolicy(params).promise().toFuture
    @inline def getLifecyclePolicyFuture(params: GetLifecyclePolicyInput): Future[GetLifecyclePolicyOutput] = service.getLifecyclePolicy(params).promise().toFuture
    @inline def getMetricPolicyFuture(params: GetMetricPolicyInput): Future[GetMetricPolicyOutput] = service.getMetricPolicy(params).promise().toFuture
    @inline def listContainersFuture(params: ListContainersInput): Future[ListContainersOutput] = service.listContainers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def putContainerPolicyFuture(params: PutContainerPolicyInput): Future[PutContainerPolicyOutput] = service.putContainerPolicy(params).promise().toFuture
    @inline def putCorsPolicyFuture(params: PutCorsPolicyInput): Future[PutCorsPolicyOutput] = service.putCorsPolicy(params).promise().toFuture
    @inline def putLifecyclePolicyFuture(params: PutLifecyclePolicyInput): Future[PutLifecyclePolicyOutput] = service.putLifecyclePolicy(params).promise().toFuture
    @inline def putMetricPolicyFuture(params: PutMetricPolicyInput): Future[PutMetricPolicyOutput] = service.putMetricPolicy(params).promise().toFuture
    @inline def startAccessLoggingFuture(params: StartAccessLoggingInput): Future[StartAccessLoggingOutput] = service.startAccessLogging(params).promise().toFuture
    @inline def stopAccessLoggingFuture(params: StopAccessLoggingInput): Future[StopAccessLoggingOutput] = service.stopAccessLogging(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/mediastore", JSImport.Namespace, "AWS.MediaStore")
  class MediaStore() extends js.Object {
    def this(config: AWSConfig) = this()

    def createContainer(params: CreateContainerInput): Request[CreateContainerOutput] = js.native
    def deleteContainer(params: DeleteContainerInput): Request[DeleteContainerOutput] = js.native
    def deleteContainerPolicy(params: DeleteContainerPolicyInput): Request[DeleteContainerPolicyOutput] = js.native
    def deleteCorsPolicy(params: DeleteCorsPolicyInput): Request[DeleteCorsPolicyOutput] = js.native
    def deleteLifecyclePolicy(params: DeleteLifecyclePolicyInput): Request[DeleteLifecyclePolicyOutput] = js.native
    def deleteMetricPolicy(params: DeleteMetricPolicyInput): Request[DeleteMetricPolicyOutput] = js.native
    def describeContainer(params: DescribeContainerInput): Request[DescribeContainerOutput] = js.native
    def getContainerPolicy(params: GetContainerPolicyInput): Request[GetContainerPolicyOutput] = js.native
    def getCorsPolicy(params: GetCorsPolicyInput): Request[GetCorsPolicyOutput] = js.native
    def getLifecyclePolicy(params: GetLifecyclePolicyInput): Request[GetLifecyclePolicyOutput] = js.native
    def getMetricPolicy(params: GetMetricPolicyInput): Request[GetMetricPolicyOutput] = js.native
    def listContainers(params: ListContainersInput): Request[ListContainersOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def putContainerPolicy(params: PutContainerPolicyInput): Request[PutContainerPolicyOutput] = js.native
    def putCorsPolicy(params: PutCorsPolicyInput): Request[PutCorsPolicyOutput] = js.native
    def putLifecyclePolicy(params: PutLifecyclePolicyInput): Request[PutLifecyclePolicyOutput] = js.native
    def putMetricPolicy(params: PutMetricPolicyInput): Request[PutMetricPolicyOutput] = js.native
    def startAccessLogging(params: StartAccessLoggingInput): Request[StartAccessLoggingOutput] = js.native
    def stopAccessLogging(params: StopAccessLoggingInput): Request[StopAccessLoggingOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
  }
  object MediaStore {
    @inline implicit def toOps(service: MediaStore): MediaStoreOps = {
      new MediaStoreOps(service)
    }
  }

  /** This section describes operations that you can perform on an AWS Elemental MediaStore container.
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
    @inline
    def apply(
        ARN: js.UndefOr[ContainerARN] = js.undefined,
        AccessLoggingEnabled: js.UndefOr[ContainerAccessLoggingEnabled] = js.undefined,
        CreationTime: js.UndefOr[TimeStamp] = js.undefined,
        Endpoint: js.UndefOr[Endpoint] = js.undefined,
        Name: js.UndefOr[ContainerName] = js.undefined,
        Status: js.UndefOr[ContainerStatus] = js.undefined
    ): Container = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      AccessLoggingEnabled.foreach(__v => __obj.updateDynamic("AccessLoggingEnabled")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.updateDynamic("Endpoint")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Container]
    }
  }

  /** A rule for a CORS policy. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses the first applicable rule listed.
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
    @inline
    def apply(
        AllowedHeaders: AllowedHeaders,
        AllowedOrigins: AllowedOrigins,
        AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined,
        ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined,
        MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined
    ): CorsRule = {
      val __obj = js.Dynamic.literal(
        "AllowedHeaders" -> AllowedHeaders.asInstanceOf[js.Any],
        "AllowedOrigins" -> AllowedOrigins.asInstanceOf[js.Any]
      )

      AllowedMethods.foreach(__v => __obj.updateDynamic("AllowedMethods")(__v.asInstanceOf[js.Any]))
      ExposeHeaders.foreach(__v => __obj.updateDynamic("ExposeHeaders")(__v.asInstanceOf[js.Any]))
      MaxAgeSeconds.foreach(__v => __obj.updateDynamic("MaxAgeSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CorsRule]
    }
  }

  @js.native
  trait CreateContainerInput extends js.Object {
    var ContainerName: ContainerName
    var Tags: js.UndefOr[TagList]
  }

  object CreateContainerInput {
    @inline
    def apply(
        ContainerName: ContainerName,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateContainerInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateContainerInput]
    }
  }

  @js.native
  trait CreateContainerOutput extends js.Object {
    var Container: Container
  }

  object CreateContainerOutput {
    @inline
    def apply(
        Container: Container
    ): CreateContainerOutput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ContainerName: ContainerName
    ): DeleteContainerInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContainerInput]
    }
  }

  @js.native
  trait DeleteContainerOutput extends js.Object

  object DeleteContainerOutput {
    @inline
    def apply(): DeleteContainerOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteContainerOutput]
    }
  }

  @js.native
  trait DeleteContainerPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object DeleteContainerPolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName
    ): DeleteContainerPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteContainerPolicyInput]
    }
  }

  @js.native
  trait DeleteContainerPolicyOutput extends js.Object

  object DeleteContainerPolicyOutput {
    @inline
    def apply(): DeleteContainerPolicyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteContainerPolicyOutput]
    }
  }

  @js.native
  trait DeleteCorsPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object DeleteCorsPolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName
    ): DeleteCorsPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCorsPolicyInput]
    }
  }

  @js.native
  trait DeleteCorsPolicyOutput extends js.Object

  object DeleteCorsPolicyOutput {
    @inline
    def apply(): DeleteCorsPolicyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCorsPolicyOutput]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object DeleteLifecyclePolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName
    ): DeleteLifecyclePolicyInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLifecyclePolicyInput]
    }
  }

  @js.native
  trait DeleteLifecyclePolicyOutput extends js.Object

  object DeleteLifecyclePolicyOutput {
    @inline
    def apply(): DeleteLifecyclePolicyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLifecyclePolicyOutput]
    }
  }

  @js.native
  trait DeleteMetricPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object DeleteMetricPolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName
    ): DeleteMetricPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMetricPolicyInput]
    }
  }

  @js.native
  trait DeleteMetricPolicyOutput extends js.Object

  object DeleteMetricPolicyOutput {
    @inline
    def apply(): DeleteMetricPolicyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMetricPolicyOutput]
    }
  }

  @js.native
  trait DescribeContainerInput extends js.Object {
    var ContainerName: js.UndefOr[ContainerName]
  }

  object DescribeContainerInput {
    @inline
    def apply(
        ContainerName: js.UndefOr[ContainerName] = js.undefined
    ): DescribeContainerInput = {
      val __obj = js.Dynamic.literal()
      ContainerName.foreach(__v => __obj.updateDynamic("ContainerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContainerInput]
    }
  }

  @js.native
  trait DescribeContainerOutput extends js.Object {
    var Container: js.UndefOr[Container]
  }

  object DescribeContainerOutput {
    @inline
    def apply(
        Container: js.UndefOr[Container] = js.undefined
    ): DescribeContainerOutput = {
      val __obj = js.Dynamic.literal()
      Container.foreach(__v => __obj.updateDynamic("Container")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContainerOutput]
    }
  }

  @js.native
  trait GetContainerPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object GetContainerPolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName
    ): GetContainerPolicyInput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Policy: ContainerPolicy
    ): GetContainerPolicyOutput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ContainerName: ContainerName
    ): GetCorsPolicyInput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        CorsPolicy: CorsPolicy
    ): GetCorsPolicyOutput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ContainerName: ContainerName
    ): GetLifecyclePolicyInput = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        LifecyclePolicy: LifecyclePolicy
    ): GetLifecyclePolicyOutput = {
      val __obj = js.Dynamic.literal(
        "LifecyclePolicy" -> LifecyclePolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLifecyclePolicyOutput]
    }
  }

  @js.native
  trait GetMetricPolicyInput extends js.Object {
    var ContainerName: ContainerName
  }

  object GetMetricPolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName
    ): GetMetricPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMetricPolicyInput]
    }
  }

  @js.native
  trait GetMetricPolicyOutput extends js.Object {
    var MetricPolicy: MetricPolicy
  }

  object GetMetricPolicyOutput {
    @inline
    def apply(
        MetricPolicy: MetricPolicy
    ): GetMetricPolicyOutput = {
      val __obj = js.Dynamic.literal(
        "MetricPolicy" -> MetricPolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMetricPolicyOutput]
    }
  }

  @js.native
  trait ListContainersInput extends js.Object {
    var MaxResults: js.UndefOr[ContainerListLimit]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListContainersInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ContainerListLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListContainersInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContainersInput]
    }
  }

  @js.native
  trait ListContainersOutput extends js.Object {
    var Containers: ContainerList
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListContainersOutput {
    @inline
    def apply(
        Containers: ContainerList,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListContainersOutput = {
      val __obj = js.Dynamic.literal(
        "Containers" -> Containers.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContainersOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var Resource: ContainerARN
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        Resource: ContainerARN
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /** The metric policy that is associated with the container. A metric policy allows AWS Elemental MediaStore to send metrics to Amazon CloudWatch. In the policy, you must indicate whether you want MediaStore to send container-level metrics. You can also include rules to define groups of objects that you want MediaStore to send object-level metrics for. To view examples of how to construct a metric policy for your use case, see [[https://docs.aws.amazon.com/mediastore/latest/ug/policies-metric-examples.html|Example Metric Policies]].
    */
  @js.native
  trait MetricPolicy extends js.Object {
    var ContainerLevelMetrics: ContainerLevelMetrics
    var MetricPolicyRules: js.UndefOr[MetricPolicyRules]
  }

  object MetricPolicy {
    @inline
    def apply(
        ContainerLevelMetrics: ContainerLevelMetrics,
        MetricPolicyRules: js.UndefOr[MetricPolicyRules] = js.undefined
    ): MetricPolicy = {
      val __obj = js.Dynamic.literal(
        "ContainerLevelMetrics" -> ContainerLevelMetrics.asInstanceOf[js.Any]
      )

      MetricPolicyRules.foreach(__v => __obj.updateDynamic("MetricPolicyRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricPolicy]
    }
  }

  /** A setting that enables metrics at the object level. Each rule contains an object group and an object group name. If the policy includes the MetricPolicyRules parameter, you must include at least one rule. Each metric policy can include up to five rules by default. You can also [[https://console.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas|request a quota increase]] to allow up to 300 rules per policy.
    */
  @js.native
  trait MetricPolicyRule extends js.Object {
    var ObjectGroup: ObjectGroup
    var ObjectGroupName: ObjectGroupName
  }

  object MetricPolicyRule {
    @inline
    def apply(
        ObjectGroup: ObjectGroup,
        ObjectGroupName: ObjectGroupName
    ): MetricPolicyRule = {
      val __obj = js.Dynamic.literal(
        "ObjectGroup" -> ObjectGroup.asInstanceOf[js.Any],
        "ObjectGroupName" -> ObjectGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MetricPolicyRule]
    }
  }

  @js.native
  trait PutContainerPolicyInput extends js.Object {
    var ContainerName: ContainerName
    var Policy: ContainerPolicy
  }

  object PutContainerPolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName,
        Policy: ContainerPolicy
    ): PutContainerPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any],
        "Policy" -> Policy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutContainerPolicyInput]
    }
  }

  @js.native
  trait PutContainerPolicyOutput extends js.Object

  object PutContainerPolicyOutput {
    @inline
    def apply(): PutContainerPolicyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutContainerPolicyOutput]
    }
  }

  @js.native
  trait PutCorsPolicyInput extends js.Object {
    var ContainerName: ContainerName
    var CorsPolicy: CorsPolicy
  }

  object PutCorsPolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName,
        CorsPolicy: CorsPolicy
    ): PutCorsPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any],
        "CorsPolicy" -> CorsPolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutCorsPolicyInput]
    }
  }

  @js.native
  trait PutCorsPolicyOutput extends js.Object

  object PutCorsPolicyOutput {
    @inline
    def apply(): PutCorsPolicyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutCorsPolicyOutput]
    }
  }

  @js.native
  trait PutLifecyclePolicyInput extends js.Object {
    var ContainerName: ContainerName
    var LifecyclePolicy: LifecyclePolicy
  }

  object PutLifecyclePolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName,
        LifecyclePolicy: LifecyclePolicy
    ): PutLifecyclePolicyInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any],
        "LifecyclePolicy" -> LifecyclePolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutLifecyclePolicyInput]
    }
  }

  @js.native
  trait PutLifecyclePolicyOutput extends js.Object

  object PutLifecyclePolicyOutput {
    @inline
    def apply(): PutLifecyclePolicyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutLifecyclePolicyOutput]
    }
  }

  @js.native
  trait PutMetricPolicyInput extends js.Object {
    var ContainerName: ContainerName
    var MetricPolicy: MetricPolicy
  }

  object PutMetricPolicyInput {
    @inline
    def apply(
        ContainerName: ContainerName,
        MetricPolicy: MetricPolicy
    ): PutMetricPolicyInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any],
        "MetricPolicy" -> MetricPolicy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutMetricPolicyInput]
    }
  }

  @js.native
  trait PutMetricPolicyOutput extends js.Object

  object PutMetricPolicyOutput {
    @inline
    def apply(): PutMetricPolicyOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutMetricPolicyOutput]
    }
  }

  @js.native
  trait StartAccessLoggingInput extends js.Object {
    var ContainerName: ContainerName
  }

  object StartAccessLoggingInput {
    @inline
    def apply(
        ContainerName: ContainerName
    ): StartAccessLoggingInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartAccessLoggingInput]
    }
  }

  @js.native
  trait StartAccessLoggingOutput extends js.Object

  object StartAccessLoggingOutput {
    @inline
    def apply(): StartAccessLoggingOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartAccessLoggingOutput]
    }
  }

  @js.native
  trait StopAccessLoggingInput extends js.Object {
    var ContainerName: ContainerName
  }

  object StopAccessLoggingInput {
    @inline
    def apply(
        ContainerName: ContainerName
    ): StopAccessLoggingInput = {
      val __obj = js.Dynamic.literal(
        "ContainerName" -> ContainerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopAccessLoggingInput]
    }
  }

  @js.native
  trait StopAccessLoggingOutput extends js.Object

  object StopAccessLoggingOutput {
    @inline
    def apply(): StopAccessLoggingOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopAccessLoggingOutput]
    }
  }

  /** A collection of tags associated with a container. Each tag consists of a key:value pair, which can be anything you define. Typically, the tag key represents a category (such as "environment") and the tag value represents a specific value within that category (such as "test," "development," or "production"). You can add up to 50 tags to each container. For more information about tagging, including naming and usage conventions, see [[https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html|Tagging Resources in MediaStore]].
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var Resource: ContainerARN
    var Tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        Resource: ContainerARN,
        Tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var Resource: ContainerARN
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        Resource: ContainerARN,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "Resource" -> Resource.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }
}
