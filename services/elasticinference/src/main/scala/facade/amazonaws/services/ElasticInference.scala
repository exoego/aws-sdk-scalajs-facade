package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object elasticinference {
  type AcceleratorHealthStatus = String
  type AcceleratorId = String
  type AcceleratorIdList = js.Array[AcceleratorId]
  type AcceleratorTypeList = js.Array[AcceleratorType]
  type AcceleratorTypeName = String
  type AcceleratorTypeNameList = js.Array[AcceleratorTypeName]
  type AcceleratorTypeOfferingList = js.Array[AcceleratorTypeOffering]
  type AvailabilityZone = String
  type ElasticInferenceAcceleratorSet = js.Array[ElasticInferenceAccelerator]
  type FilterList = js.Array[Filter]
  type FilterName = String
  type Key = String
  type Location = String
  type MaxResults = Int
  type NextToken = String
  type ResourceARN = String
  type ResourceArn = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type ThroughputInfoList = js.Array[KeyValuePair]
  type Value = Int
  type ValueStringList = js.Array[String]

  implicit final class ElasticInferenceOps(private val service: ElasticInference) extends AnyVal {

    @inline def describeAcceleratorOfferingsFuture(params: DescribeAcceleratorOfferingsRequest): Future[DescribeAcceleratorOfferingsResponse] = service.describeAcceleratorOfferings(params).promise().toFuture
    @inline def describeAcceleratorTypesFuture(params: DescribeAcceleratorTypesRequest): Future[DescribeAcceleratorTypesResponse] = service.describeAcceleratorTypes(params).promise().toFuture
    @inline def describeAcceleratorsFuture(params: DescribeAcceleratorsRequest): Future[DescribeAcceleratorsResponse] = service.describeAccelerators(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] = service.untagResource(params).promise().toFuture
  }
}

package elasticinference {
  @js.native
  @JSImport("aws-sdk", "ElasticInference", "AWS.ElasticInference")
  class ElasticInference() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeAcceleratorOfferings(params: DescribeAcceleratorOfferingsRequest): Request[DescribeAcceleratorOfferingsResponse] = js.native
    def describeAcceleratorTypes(params: DescribeAcceleratorTypesRequest): Request[DescribeAcceleratorTypesResponse] = js.native
    def describeAccelerators(params: DescribeAcceleratorsRequest): Request[DescribeAcceleratorsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult] = js.native
  }

  /**
    * The details of an Elastic Inference Accelerator type.
    */
  @js.native
  trait AcceleratorType extends js.Object {
    var acceleratorTypeName: js.UndefOr[AcceleratorTypeName]
    var memoryInfo: js.UndefOr[MemoryInfo]
    var throughputInfo: js.UndefOr[ThroughputInfoList]
  }

  object AcceleratorType {
    @inline
    def apply(
        acceleratorTypeName: js.UndefOr[AcceleratorTypeName] = js.undefined,
        memoryInfo: js.UndefOr[MemoryInfo] = js.undefined,
        throughputInfo: js.UndefOr[ThroughputInfoList] = js.undefined
    ): AcceleratorType = {
      val __obj = js.Dynamic.literal()
      acceleratorTypeName.foreach(__v => __obj.updateDynamic("acceleratorTypeName")(__v.asInstanceOf[js.Any]))
      memoryInfo.foreach(__v => __obj.updateDynamic("memoryInfo")(__v.asInstanceOf[js.Any]))
      throughputInfo.foreach(__v => __obj.updateDynamic("throughputInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceleratorType]
    }
  }

  /**
    * The offering for an Elastic Inference Accelerator type.
    */
  @js.native
  trait AcceleratorTypeOffering extends js.Object {
    var acceleratorType: js.UndefOr[AcceleratorTypeName]
    var location: js.UndefOr[Location]
    var locationType: js.UndefOr[LocationType]
  }

  object AcceleratorTypeOffering {
    @inline
    def apply(
        acceleratorType: js.UndefOr[AcceleratorTypeName] = js.undefined,
        location: js.UndefOr[Location] = js.undefined,
        locationType: js.UndefOr[LocationType] = js.undefined
    ): AcceleratorTypeOffering = {
      val __obj = js.Dynamic.literal()
      acceleratorType.foreach(__v => __obj.updateDynamic("acceleratorType")(__v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      locationType.foreach(__v => __obj.updateDynamic("locationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AcceleratorTypeOffering]
    }
  }

  @js.native
  trait DescribeAcceleratorOfferingsRequest extends js.Object {
    var locationType: LocationType
    var acceleratorTypes: js.UndefOr[AcceleratorTypeNameList]
  }

  object DescribeAcceleratorOfferingsRequest {
    @inline
    def apply(
        locationType: LocationType,
        acceleratorTypes: js.UndefOr[AcceleratorTypeNameList] = js.undefined
    ): DescribeAcceleratorOfferingsRequest = {
      val __obj = js.Dynamic.literal(
        "locationType" -> locationType.asInstanceOf[js.Any]
      )

      acceleratorTypes.foreach(__v => __obj.updateDynamic("acceleratorTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorOfferingsRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorOfferingsResponse extends js.Object {
    var acceleratorTypeOfferings: js.UndefOr[AcceleratorTypeOfferingList]
  }

  object DescribeAcceleratorOfferingsResponse {
    @inline
    def apply(
        acceleratorTypeOfferings: js.UndefOr[AcceleratorTypeOfferingList] = js.undefined
    ): DescribeAcceleratorOfferingsResponse = {
      val __obj = js.Dynamic.literal()
      acceleratorTypeOfferings.foreach(__v => __obj.updateDynamic("acceleratorTypeOfferings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorOfferingsResponse]
    }
  }

  @js.native
  trait DescribeAcceleratorTypesRequest extends js.Object {}

  object DescribeAcceleratorTypesRequest {
    @inline
    def apply(
    ): DescribeAcceleratorTypesRequest = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeAcceleratorTypesRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorTypesResponse extends js.Object {
    var acceleratorTypes: js.UndefOr[AcceleratorTypeList]
  }

  object DescribeAcceleratorTypesResponse {
    @inline
    def apply(
        acceleratorTypes: js.UndefOr[AcceleratorTypeList] = js.undefined
    ): DescribeAcceleratorTypesResponse = {
      val __obj = js.Dynamic.literal()
      acceleratorTypes.foreach(__v => __obj.updateDynamic("acceleratorTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorTypesResponse]
    }
  }

  @js.native
  trait DescribeAcceleratorsRequest extends js.Object {
    var acceleratorIds: js.UndefOr[AcceleratorIdList]
    var filters: js.UndefOr[FilterList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeAcceleratorsRequest {
    @inline
    def apply(
        acceleratorIds: js.UndefOr[AcceleratorIdList] = js.undefined,
        filters: js.UndefOr[FilterList] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAcceleratorsRequest = {
      val __obj = js.Dynamic.literal()
      acceleratorIds.foreach(__v => __obj.updateDynamic("acceleratorIds")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorsRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorsResponse extends js.Object {
    var acceleratorSet: js.UndefOr[ElasticInferenceAcceleratorSet]
    var nextToken: js.UndefOr[NextToken]
  }

  object DescribeAcceleratorsResponse {
    @inline
    def apply(
        acceleratorSet: js.UndefOr[ElasticInferenceAcceleratorSet] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeAcceleratorsResponse = {
      val __obj = js.Dynamic.literal()
      acceleratorSet.foreach(__v => __obj.updateDynamic("acceleratorSet")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAcceleratorsResponse]
    }
  }

  /**
    * The details of an Elastic Inference Accelerator.
    */
  @js.native
  trait ElasticInferenceAccelerator extends js.Object {
    var acceleratorHealth: js.UndefOr[ElasticInferenceAcceleratorHealth]
    var acceleratorId: js.UndefOr[AcceleratorId]
    var acceleratorType: js.UndefOr[AcceleratorTypeName]
    var attachedResource: js.UndefOr[ResourceArn]
    var availabilityZone: js.UndefOr[AvailabilityZone]
  }

  object ElasticInferenceAccelerator {
    @inline
    def apply(
        acceleratorHealth: js.UndefOr[ElasticInferenceAcceleratorHealth] = js.undefined,
        acceleratorId: js.UndefOr[AcceleratorId] = js.undefined,
        acceleratorType: js.UndefOr[AcceleratorTypeName] = js.undefined,
        attachedResource: js.UndefOr[ResourceArn] = js.undefined,
        availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    ): ElasticInferenceAccelerator = {
      val __obj = js.Dynamic.literal()
      acceleratorHealth.foreach(__v => __obj.updateDynamic("acceleratorHealth")(__v.asInstanceOf[js.Any]))
      acceleratorId.foreach(__v => __obj.updateDynamic("acceleratorId")(__v.asInstanceOf[js.Any]))
      acceleratorType.foreach(__v => __obj.updateDynamic("acceleratorType")(__v.asInstanceOf[js.Any]))
      attachedResource.foreach(__v => __obj.updateDynamic("attachedResource")(__v.asInstanceOf[js.Any]))
      availabilityZone.foreach(__v => __obj.updateDynamic("availabilityZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticInferenceAccelerator]
    }
  }

  /**
    * The health details of an Elastic Inference Accelerator.
    */
  @js.native
  trait ElasticInferenceAcceleratorHealth extends js.Object {
    var status: js.UndefOr[AcceleratorHealthStatus]
  }

  object ElasticInferenceAcceleratorHealth {
    @inline
    def apply(
        status: js.UndefOr[AcceleratorHealthStatus] = js.undefined
    ): ElasticInferenceAcceleratorHealth = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticInferenceAcceleratorHealth]
    }
  }

  /**
    * A filter expression for the Elastic Inference Accelerator list.
    */
  @js.native
  trait Filter extends js.Object {
    var name: js.UndefOr[FilterName]
    var values: js.UndefOr[ValueStringList]
  }

  object Filter {
    @inline
    def apply(
        name: js.UndefOr[FilterName] = js.undefined,
        values: js.UndefOr[ValueStringList] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /**
    * A throughput entry for an Elastic Inference Accelerator type.
    */
  @js.native
  trait KeyValuePair extends js.Object {
    var key: js.UndefOr[Key]
    var value: js.UndefOr[Value]
  }

  object KeyValuePair {
    @inline
    def apply(
        key: js.UndefOr[Key] = js.undefined,
        value: js.UndefOr[Value] = js.undefined
    ): KeyValuePair = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KeyValuePair]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceARN
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceARN
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  @js.native
  sealed trait LocationType extends js.Any
  object LocationType {
    val region = "region".asInstanceOf[LocationType]
    val `availability-zone` = "availability-zone".asInstanceOf[LocationType]
    val `availability-zone-id` = "availability-zone-id".asInstanceOf[LocationType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(region, `availability-zone`, `availability-zone-id`))
  }

  /**
    * The memory information of an Elastic Inference Accelerator type.
    */
  @js.native
  trait MemoryInfo extends js.Object {
    var sizeInMiB: js.UndefOr[Int]
  }

  object MemoryInfo {
    @inline
    def apply(
        sizeInMiB: js.UndefOr[Int] = js.undefined
    ): MemoryInfo = {
      val __obj = js.Dynamic.literal()
      sizeInMiB.foreach(__v => __obj.updateDynamic("sizeInMiB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemoryInfo]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceARN
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceARN,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResult extends js.Object {}

  object TagResourceResult {
    @inline
    def apply(
    ): TagResourceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceARN
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceARN,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResult extends js.Object {}

  object UntagResourceResult {
    @inline
    def apply(
    ): UntagResourceResult = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResult]
    }
  }
}
