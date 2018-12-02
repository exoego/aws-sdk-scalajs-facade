package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object resourcegroupstaggingapi {
  type AmazonResourceType = String
  type ErrorCode = String
  type ErrorMessage = String
  type ExceptionMessage = String
  type FailedResourcesMap = js.Dictionary[FailureInfo]
  type PaginationToken = String
  type ResourceARN = String
  type ResourceARNList = js.Array[ResourceARN]
  type ResourceTagMappingList = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[AmazonResourceType]
  type ResourcesPerPage = Int
  type StatusCode = Int
  type TagFilterList = js.Array[TagFilter]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagKeyListForUntag = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TagValueList = js.Array[TagValue]
  type TagValuesOutputList = js.Array[TagValue]
  type TagsPerPage = Int
}

package resourcegroupstaggingapi {
  @js.native
  @JSImport("aws-sdk", "ResourceGroupsTaggingAPI")
  class ResourceGroupsTaggingAPI(config: AWSConfig) extends js.Object {
    def getResources(params: GetResourcesInput): Request[GetResourcesOutput] = js.native
    def getTagKeys(params: GetTagKeysInput): Request[GetTagKeysOutput] = js.native
    def getTagValues(params: GetTagValuesInput): Request[GetTagValuesOutput] = js.native
    def tagResources(params: TagResourcesInput): Request[TagResourcesOutput] = js.native
    def untagResources(params: UntagResourcesInput): Request[UntagResourcesOutput] = js.native
  }

  object ErrorCodeEnum {
    val InternalServiceException = "InternalServiceException"
    val InvalidParameterException = "InvalidParameterException"

    val values = IndexedSeq(InternalServiceException, InvalidParameterException)
  }

  /**
   * <p>Details of the common errors that all actions return.</p>
   */
  @js.native
  trait FailureInfo extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var StatusCode: js.UndefOr[StatusCode]
  }

  object FailureInfo {
    def apply(
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
      StatusCode: js.UndefOr[StatusCode] = js.undefined): FailureInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "StatusCode" -> StatusCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FailureInfo]
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
    def apply(
      PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
      ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined,
      ResourcesPerPage: js.UndefOr[ResourcesPerPage] = js.undefined,
      TagFilters: js.UndefOr[TagFilterList] = js.undefined,
      TagsPerPage: js.UndefOr[TagsPerPage] = js.undefined): GetResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceTypeFilters" -> ResourceTypeFilters.map { x => x.asInstanceOf[js.Any] },
        "ResourcesPerPage" -> ResourcesPerPage.map { x => x.asInstanceOf[js.Any] },
        "TagFilters" -> TagFilters.map { x => x.asInstanceOf[js.Any] },
        "TagsPerPage" -> TagsPerPage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcesInput]
    }
  }

  @js.native
  trait GetResourcesOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var ResourceTagMappingList: js.UndefOr[ResourceTagMappingList]
  }

  object GetResourcesOutput {
    def apply(
      PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
      ResourceTagMappingList: js.UndefOr[ResourceTagMappingList] = js.undefined): GetResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] },
        "ResourceTagMappingList" -> ResourceTagMappingList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourcesOutput]
    }
  }

  @js.native
  trait GetTagKeysInput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
  }

  object GetTagKeysInput {
    def apply(
      PaginationToken: js.UndefOr[PaginationToken] = js.undefined): GetTagKeysInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagKeysInput]
    }
  }

  @js.native
  trait GetTagKeysOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  object GetTagKeysOutput {
    def apply(
      PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
      TagKeys: js.UndefOr[TagKeyList] = js.undefined): GetTagKeysOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagKeysOutput]
    }
  }

  @js.native
  trait GetTagValuesInput extends js.Object {
    var Key: TagKey
    var PaginationToken: js.UndefOr[PaginationToken]
  }

  object GetTagValuesInput {
    def apply(
      Key: TagKey,
      PaginationToken: js.UndefOr[PaginationToken] = js.undefined): GetTagValuesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagValuesInput]
    }
  }

  @js.native
  trait GetTagValuesOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var TagValues: js.UndefOr[TagValuesOutputList]
  }

  object GetTagValuesOutput {
    def apply(
      PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
      TagValues: js.UndefOr[TagValuesOutputList] = js.undefined): GetTagValuesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaginationToken" -> PaginationToken.map { x => x.asInstanceOf[js.Any] },
        "TagValues" -> TagValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTagValuesOutput]
    }
  }

  /**
   * <p>The request processing failed because of an unknown error, exception, or failure. You can retry the request.</p>
   */
  @js.native
  trait InternalServiceExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>A parameter is missing or a malformed string or invalid or out-of-range value was supplied for the request parameter.</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>A <code>PaginationToken</code> is valid for a maximum of 15 minutes. Your request was denied because the specified <code>PaginationToken</code> has expired.</p>
   */
  @js.native
  trait PaginationTokenExpiredExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  /**
   * <p>A list of resource ARNs and the tags (keys and values) that are associated with each.</p>
   */
  @js.native
  trait ResourceTagMapping extends js.Object {
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[TagList]
  }

  object ResourceTagMapping {
    def apply(
      ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined): ResourceTagMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARN" -> ResourceARN.map { x => x.asInstanceOf[js.Any] },
        "Tags" -> Tags.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTagMapping]
    }
  }

  /**
   * <p>The metadata that you apply to AWS resources to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html#tag-basics">Tag Basics</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: TagKey,
      Value: TagValue): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>A list of tags (keys and values) that are used to specify the associated resources.</p>
   */
  @js.native
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Values: js.UndefOr[TagValueList]
  }

  object TagFilter {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Values: js.UndefOr[TagValueList] = js.undefined): TagFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagFilter]
    }
  }

  @js.native
  trait TagResourcesInput extends js.Object {
    var ResourceARNList: ResourceARNList
    var Tags: TagMap
  }

  object TagResourcesInput {
    def apply(
      ResourceARNList: ResourceARNList,
      Tags: TagMap): TagResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNList" -> ResourceARNList.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourcesInput]
    }
  }

  @js.native
  trait TagResourcesOutput extends js.Object {
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap]
  }

  object TagResourcesOutput {
    def apply(
      FailedResourcesMap: js.UndefOr[FailedResourcesMap] = js.undefined): TagResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedResourcesMap" -> FailedResourcesMap.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagResourcesOutput]
    }
  }

  /**
   * <p>The request was denied to limit the frequency of submitted requests.</p>
   */
  @js.native
  trait ThrottledExceptionException extends js.Object {
    val Message: ExceptionMessage
  }

  @js.native
  trait UntagResourcesInput extends js.Object {
    var ResourceARNList: ResourceARNList
    var TagKeys: TagKeyListForUntag
  }

  object UntagResourcesInput {
    def apply(
      ResourceARNList: ResourceARNList,
      TagKeys: TagKeyListForUntag): UntagResourcesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceARNList" -> ResourceARNList.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourcesInput]
    }
  }

  @js.native
  trait UntagResourcesOutput extends js.Object {
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap]
  }

  object UntagResourcesOutput {
    def apply(
      FailedResourcesMap: js.UndefOr[FailedResourcesMap] = js.undefined): UntagResourcesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailedResourcesMap" -> FailedResourcesMap.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UntagResourcesOutput]
    }
  }
}
