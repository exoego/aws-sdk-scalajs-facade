package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object resourcegroupstaggingapi {
  type AmazonResourceType     = String
  type ErrorCode              = String
  type ErrorMessage           = String
  type FailedResourcesMap     = js.Dictionary[FailureInfo]
  type PaginationToken        = String
  type ResourceARN            = String
  type ResourceARNList        = js.Array[ResourceARN]
  type ResourceTagMappingList = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[AmazonResourceType]
  type ResourcesPerPage       = Int
  type StatusCode             = Int
  type TagFilterList          = js.Array[TagFilter]
  type TagKey                 = String
  type TagKeyList             = js.Array[TagKey]
  type TagKeyListForUntag     = js.Array[TagKey]
  type TagList                = js.Array[Tag]
  type TagMap                 = js.Dictionary[TagValue]
  type TagValue               = String
  type TagValueList           = js.Array[TagValue]
  type TagValuesOutputList    = js.Array[TagValue]
  type TagsPerPage            = Int

  implicit final class ResourceGroupsTaggingAPIOps(private val service: ResourceGroupsTaggingAPI) extends AnyVal {
    @inline def getResourcesFuture(params: GetResourcesInput): Future[GetResourcesOutput] =
      service.getResources(params).promise.toFuture
    @inline def getTagKeysFuture(params: GetTagKeysInput): Future[GetTagKeysOutput] =
      service.getTagKeys(params).promise.toFuture
    @inline def getTagValuesFuture(params: GetTagValuesInput): Future[GetTagValuesOutput] =
      service.getTagValues(params).promise.toFuture
    @inline def tagResourcesFuture(params: TagResourcesInput): Future[TagResourcesOutput] =
      service.tagResources(params).promise.toFuture
    @inline def untagResourcesFuture(params: UntagResourcesInput): Future[UntagResourcesOutput] =
      service.untagResources(params).promise.toFuture
  }
}

package resourcegroupstaggingapi {
  @js.native
  @JSImport("aws-sdk", "ResourceGroupsTaggingAPI")
  class ResourceGroupsTaggingAPI() extends js.Object {
    def this(config: AWSConfig) = this()

    def getResources(params: GetResourcesInput): Request[GetResourcesOutput]       = js.native
    def getTagKeys(params: GetTagKeysInput): Request[GetTagKeysOutput]             = js.native
    def getTagValues(params: GetTagValuesInput): Request[GetTagValuesOutput]       = js.native
    def tagResources(params: TagResourcesInput): Request[TagResourcesOutput]       = js.native
    def untagResources(params: UntagResourcesInput): Request[UntagResourcesOutput] = js.native
  }

  object ErrorCodeEnum {
    val InternalServiceException  = "InternalServiceException"
    val InvalidParameterException = "InvalidParameterException"

    val values = js.Object.freeze(js.Array(InternalServiceException, InvalidParameterException))
  }

  /**
    * Details of the common errors that all actions return.
    */
  @js.native
  trait FailureInfo extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var StatusCode: js.UndefOr[StatusCode]
  }

  object FailureInfo {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        StatusCode: js.UndefOr[StatusCode] = js.undefined
    ): FailureInfo = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      StatusCode.foreach(__v => __obj.updateDynamic("StatusCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FailureInfo]
    }
  }

  @js.native
  trait GetResourcesInput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList]
    var ResourcesPerPage: js.UndefOr[ResourcesPerPage]
    var TagFilters: js.UndefOr[TagFilterList]
    var TagsPerPage: js.UndefOr[TagsPerPage]
  }

  object GetResourcesInput {
    @inline
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined,
        ResourcesPerPage: js.UndefOr[ResourcesPerPage] = js.undefined,
        TagFilters: js.UndefOr[TagFilterList] = js.undefined,
        TagsPerPage: js.UndefOr[TagsPerPage] = js.undefined
    ): GetResourcesInput = {
      val __obj = js.Dynamic.literal()
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      ResourceTypeFilters.foreach(__v => __obj.updateDynamic("ResourceTypeFilters")(__v.asInstanceOf[js.Any]))
      ResourcesPerPage.foreach(__v => __obj.updateDynamic("ResourcesPerPage")(__v.asInstanceOf[js.Any]))
      TagFilters.foreach(__v => __obj.updateDynamic("TagFilters")(__v.asInstanceOf[js.Any]))
      TagsPerPage.foreach(__v => __obj.updateDynamic("TagsPerPage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcesInput]
    }
  }

  @js.native
  trait GetResourcesOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var ResourceTagMappingList: js.UndefOr[ResourceTagMappingList]
  }

  object GetResourcesOutput {
    @inline
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceTagMappingList: js.UndefOr[ResourceTagMappingList] = js.undefined
    ): GetResourcesOutput = {
      val __obj = js.Dynamic.literal()
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      ResourceTagMappingList.foreach(__v => __obj.updateDynamic("ResourceTagMappingList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcesOutput]
    }
  }

  @js.native
  trait GetTagKeysInput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
  }

  object GetTagKeysInput {
    @inline
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetTagKeysInput = {
      val __obj = js.Dynamic.literal()
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagKeysInput]
    }
  }

  @js.native
  trait GetTagKeysOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object GetTagKeysOutput {
    @inline
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        TagKeys: js.UndefOr[TagKeyList] = js.undefined
    ): GetTagKeysOutput = {
      val __obj = js.Dynamic.literal()
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      TagKeys.foreach(__v => __obj.updateDynamic("TagKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagKeysOutput]
    }
  }

  @js.native
  trait GetTagValuesInput extends js.Object {
    var Key: TagKey
    var PaginationToken: js.UndefOr[PaginationToken]
  }

  object GetTagValuesInput {
    @inline
    def apply(
        Key: TagKey,
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetTagValuesInput = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagValuesInput]
    }
  }

  @js.native
  trait GetTagValuesOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var TagValues: js.UndefOr[TagValuesOutputList]
  }

  object GetTagValuesOutput {
    @inline
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        TagValues: js.UndefOr[TagValuesOutputList] = js.undefined
    ): GetTagValuesOutput = {
      val __obj = js.Dynamic.literal()
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      TagValues.foreach(__v => __obj.updateDynamic("TagValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagValuesOutput]
    }
  }

  /**
    * A list of resource ARNs and the tags (keys and values) that are associated with each.
    */
  @js.native
  trait ResourceTagMapping extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[TagList]
  }

  object ResourceTagMapping {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ResourceTagMapping = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTagMapping]
    }
  }

  /**
    * The metadata that you apply to AWS resources to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. For more information, see [[http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-basics|Tag Basics]] in the <i>Amazon EC2 User Guide for Linux Instances</i>.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * A list of tags (keys and values) that are used to specify the associated resources.
    */
  @js.native
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Values: js.UndefOr[TagValueList]
  }

  object TagFilter {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Values: js.UndefOr[TagValueList] = js.undefined
    ): TagFilter = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait TagResourcesInput extends js.Object {
    var ResourceARNList: ResourceARNList
    var Tags: TagMap
  }

  object TagResourcesInput {
    @inline
    def apply(
        ResourceARNList: ResourceARNList,
        Tags: TagMap
    ): TagResourcesInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARNList" -> ResourceARNList.asInstanceOf[js.Any],
        "Tags"            -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourcesInput]
    }
  }

  @js.native
  trait TagResourcesOutput extends js.Object {
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap]
  }

  object TagResourcesOutput {
    @inline
    def apply(
        FailedResourcesMap: js.UndefOr[FailedResourcesMap] = js.undefined
    ): TagResourcesOutput = {
      val __obj = js.Dynamic.literal()
      FailedResourcesMap.foreach(__v => __obj.updateDynamic("FailedResourcesMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourcesOutput]
    }
  }

  @js.native
  trait UntagResourcesInput extends js.Object {
    var ResourceARNList: ResourceARNList
    var TagKeys: TagKeyListForUntag
  }

  object UntagResourcesInput {
    @inline
    def apply(
        ResourceARNList: ResourceARNList,
        TagKeys: TagKeyListForUntag
    ): UntagResourcesInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARNList" -> ResourceARNList.asInstanceOf[js.Any],
        "TagKeys"         -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourcesInput]
    }
  }

  @js.native
  trait UntagResourcesOutput extends js.Object {
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap]
  }

  object UntagResourcesOutput {
    @inline
    def apply(
        FailedResourcesMap: js.UndefOr[FailedResourcesMap] = js.undefined
    ): UntagResourcesOutput = {
      val __obj = js.Dynamic.literal()
      FailedResourcesMap.foreach(__v => __obj.updateDynamic("FailedResourcesMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourcesOutput]
    }
  }
}
