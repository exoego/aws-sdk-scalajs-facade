package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object resourcegroupstaggingapi {
  type AmazonResourceType = String
  type ComplianceStatus = Boolean
  type ErrorMessage = String
  type ExcludeCompliantResources = Boolean
  type FailedResourcesMap = js.Dictionary[FailureInfo]
  type GroupBy = js.Array[GroupByAttribute]
  type IncludeComplianceDetails = Boolean
  type LastUpdated = String
  type MaxResultsGetComplianceSummary = Int
  type NonCompliantResources = Double
  type PaginationToken = String
  type Region = String
  type RegionFilterList = js.Array[Region]
  type ResourceARN = String
  type ResourceARNList = js.Array[ResourceARN]
  type ResourceTagMappingList = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList = js.Array[AmazonResourceType]
  type ResourcesPerPage = Int
  type S3Bucket = String
  type S3Location = String
  type Status = String
  type StatusCode = Int
  type SummaryList = js.Array[Summary]
  type TagFilterList = js.Array[TagFilter]
  type TagKey = String
  type TagKeyFilterList = js.Array[TagKey]
  type TagKeyList = js.Array[TagKey]
  type TagKeyListForUntag = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TagValueList = js.Array[TagValue]
  type TagValuesOutputList = js.Array[TagValue]
  type TagsPerPage = Int
  type TargetId = String
  type TargetIdFilterList = js.Array[TargetId]

  implicit final class ResourceGroupsTaggingAPIOps(private val service: ResourceGroupsTaggingAPI) extends AnyVal {

    @inline def describeReportCreationFuture(params: DescribeReportCreationInput): Future[DescribeReportCreationOutput] = service.describeReportCreation(params).promise().toFuture
    @inline def getComplianceSummaryFuture(params: GetComplianceSummaryInput): Future[GetComplianceSummaryOutput] = service.getComplianceSummary(params).promise().toFuture
    @inline def getResourcesFuture(params: GetResourcesInput): Future[GetResourcesOutput] = service.getResources(params).promise().toFuture
    @inline def getTagKeysFuture(params: GetTagKeysInput): Future[GetTagKeysOutput] = service.getTagKeys(params).promise().toFuture
    @inline def getTagValuesFuture(params: GetTagValuesInput): Future[GetTagValuesOutput] = service.getTagValues(params).promise().toFuture
    @inline def startReportCreationFuture(params: StartReportCreationInput): Future[StartReportCreationOutput] = service.startReportCreation(params).promise().toFuture
    @inline def tagResourcesFuture(params: TagResourcesInput): Future[TagResourcesOutput] = service.tagResources(params).promise().toFuture
    @inline def untagResourcesFuture(params: UntagResourcesInput): Future[UntagResourcesOutput] = service.untagResources(params).promise().toFuture
  }
}

package resourcegroupstaggingapi {
  @js.native
  @JSImport("aws-sdk", "ResourceGroupsTaggingAPI", "AWS.ResourceGroupsTaggingAPI")
  class ResourceGroupsTaggingAPI() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeReportCreation(params: DescribeReportCreationInput): Request[DescribeReportCreationOutput] = js.native
    def getComplianceSummary(params: GetComplianceSummaryInput): Request[GetComplianceSummaryOutput] = js.native
    def getResources(params: GetResourcesInput): Request[GetResourcesOutput] = js.native
    def getTagKeys(params: GetTagKeysInput): Request[GetTagKeysOutput] = js.native
    def getTagValues(params: GetTagValuesInput): Request[GetTagValuesOutput] = js.native
    def startReportCreation(params: StartReportCreationInput): Request[StartReportCreationOutput] = js.native
    def tagResources(params: TagResourcesInput): Request[TagResourcesOutput] = js.native
    def untagResources(params: UntagResourcesInput): Request[UntagResourcesOutput] = js.native
  }

  /**
    * Information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
    */
  @js.native
  trait ComplianceDetails extends js.Object {
    var ComplianceStatus: js.UndefOr[ComplianceStatus]
    var KeysWithNoncompliantValues: js.UndefOr[TagKeyList]
    var NoncompliantKeys: js.UndefOr[TagKeyList]
  }

  object ComplianceDetails {
    @inline
    def apply(
        ComplianceStatus: js.UndefOr[ComplianceStatus] = js.undefined,
        KeysWithNoncompliantValues: js.UndefOr[TagKeyList] = js.undefined,
        NoncompliantKeys: js.UndefOr[TagKeyList] = js.undefined
    ): ComplianceDetails = {
      val __obj = js.Dynamic.literal()
      ComplianceStatus.foreach(__v => __obj.updateDynamic("ComplianceStatus")(__v.asInstanceOf[js.Any]))
      KeysWithNoncompliantValues.foreach(__v => __obj.updateDynamic("KeysWithNoncompliantValues")(__v.asInstanceOf[js.Any]))
      NoncompliantKeys.foreach(__v => __obj.updateDynamic("NoncompliantKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComplianceDetails]
    }
  }

  @js.native
  trait DescribeReportCreationInput extends js.Object {}

  object DescribeReportCreationInput {
    @inline
    def apply(
    ): DescribeReportCreationInput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DescribeReportCreationInput]
    }
  }

  @js.native
  trait DescribeReportCreationOutput extends js.Object {
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var S3Location: js.UndefOr[S3Location]
    var Status: js.UndefOr[Status]
  }

  object DescribeReportCreationOutput {
    @inline
    def apply(
        ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        S3Location: js.UndefOr[S3Location] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): DescribeReportCreationOutput = {
      val __obj = js.Dynamic.literal()
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      S3Location.foreach(__v => __obj.updateDynamic("S3Location")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReportCreationOutput]
    }
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode {
    val InternalServiceException = "InternalServiceException".asInstanceOf[ErrorCode]
    val InvalidParameterException = "InvalidParameterException".asInstanceOf[ErrorCode]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(InternalServiceException, InvalidParameterException))
  }

  /**
    * Information about the errors that are returned for each failed resource. This information can include <code>InternalServiceException</code> and <code>InvalidParameterException</code> errors. It can also include any valid error code returned by the AWS service that hosts the resource that the ARN key represents.
    *  The following are common error codes that you might receive from other AWS services:
    * * ```InternalServiceException``` – This can mean that the Resource Groups Tagging API didn't receive a response from another AWS service. It can also mean the the resource type in the request is not supported by the Resource Groups Tagging API. In these cases, it's safe to retry the request and then call [[http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_GetResources.html|GetResources]] to verify the changes.
    *  * ```AccessDeniedException``` – This can mean that you need permission to calling tagging operations in the AWS service that contains the resource. For example, to use the Resource Groups Tagging API to tag a CloudWatch alarm resource, you need permission to call <a href="http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/API_TagResources.html"> <code>TagResources</code> </a> <i>and</i> <a href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_TagResource.html"> <code>TagResource</code> </a> in the CloudWatch API.
    * For more information on errors that are generated from other AWS services, see the documentation for that service.
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
  trait GetComplianceSummaryInput extends js.Object {
    var GroupBy: js.UndefOr[GroupBy]
    var MaxResults: js.UndefOr[MaxResultsGetComplianceSummary]
    var PaginationToken: js.UndefOr[PaginationToken]
    var RegionFilters: js.UndefOr[RegionFilterList]
    var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList]
    var TagKeyFilters: js.UndefOr[TagKeyFilterList]
    var TargetIdFilters: js.UndefOr[TargetIdFilterList]
  }

  object GetComplianceSummaryInput {
    @inline
    def apply(
        GroupBy: js.UndefOr[GroupBy] = js.undefined,
        MaxResults: js.UndefOr[MaxResultsGetComplianceSummary] = js.undefined,
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        RegionFilters: js.UndefOr[RegionFilterList] = js.undefined,
        ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined,
        TagKeyFilters: js.UndefOr[TagKeyFilterList] = js.undefined,
        TargetIdFilters: js.UndefOr[TargetIdFilterList] = js.undefined
    ): GetComplianceSummaryInput = {
      val __obj = js.Dynamic.literal()
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      RegionFilters.foreach(__v => __obj.updateDynamic("RegionFilters")(__v.asInstanceOf[js.Any]))
      ResourceTypeFilters.foreach(__v => __obj.updateDynamic("ResourceTypeFilters")(__v.asInstanceOf[js.Any]))
      TagKeyFilters.foreach(__v => __obj.updateDynamic("TagKeyFilters")(__v.asInstanceOf[js.Any]))
      TargetIdFilters.foreach(__v => __obj.updateDynamic("TargetIdFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComplianceSummaryInput]
    }
  }

  @js.native
  trait GetComplianceSummaryOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var SummaryList: js.UndefOr[SummaryList]
  }

  object GetComplianceSummaryOutput {
    @inline
    def apply(
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        SummaryList: js.UndefOr[SummaryList] = js.undefined
    ): GetComplianceSummaryOutput = {
      val __obj = js.Dynamic.literal()
      PaginationToken.foreach(__v => __obj.updateDynamic("PaginationToken")(__v.asInstanceOf[js.Any]))
      SummaryList.foreach(__v => __obj.updateDynamic("SummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComplianceSummaryOutput]
    }
  }

  @js.native
  trait GetResourcesInput extends js.Object {
    var ExcludeCompliantResources: js.UndefOr[ExcludeCompliantResources]
    var IncludeComplianceDetails: js.UndefOr[IncludeComplianceDetails]
    var PaginationToken: js.UndefOr[PaginationToken]
    var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList]
    var ResourcesPerPage: js.UndefOr[ResourcesPerPage]
    var TagFilters: js.UndefOr[TagFilterList]
    var TagsPerPage: js.UndefOr[TagsPerPage]
  }

  object GetResourcesInput {
    @inline
    def apply(
        ExcludeCompliantResources: js.UndefOr[ExcludeCompliantResources] = js.undefined,
        IncludeComplianceDetails: js.UndefOr[IncludeComplianceDetails] = js.undefined,
        PaginationToken: js.UndefOr[PaginationToken] = js.undefined,
        ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined,
        ResourcesPerPage: js.UndefOr[ResourcesPerPage] = js.undefined,
        TagFilters: js.UndefOr[TagFilterList] = js.undefined,
        TagsPerPage: js.UndefOr[TagsPerPage] = js.undefined
    ): GetResourcesInput = {
      val __obj = js.Dynamic.literal()
      ExcludeCompliantResources.foreach(__v => __obj.updateDynamic("ExcludeCompliantResources")(__v.asInstanceOf[js.Any]))
      IncludeComplianceDetails.foreach(__v => __obj.updateDynamic("IncludeComplianceDetails")(__v.asInstanceOf[js.Any]))
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

  @js.native
  sealed trait GroupByAttribute extends js.Any
  object GroupByAttribute {
    val TARGET_ID = "TARGET_ID".asInstanceOf[GroupByAttribute]
    val REGION = "REGION".asInstanceOf[GroupByAttribute]
    val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[GroupByAttribute]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(TARGET_ID, REGION, RESOURCE_TYPE))
  }

  /**
    * A list of resource ARNs and the tags (keys and values) that are associated with each.
    */
  @js.native
  trait ResourceTagMapping extends js.Object {
    var ComplianceDetails: js.UndefOr[ComplianceDetails]
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[TagList]
  }

  object ResourceTagMapping {
    @inline
    def apply(
        ComplianceDetails: js.UndefOr[ComplianceDetails] = js.undefined,
        ResourceARN: js.UndefOr[ResourceARN] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ResourceTagMapping = {
      val __obj = js.Dynamic.literal()
      ComplianceDetails.foreach(__v => __obj.updateDynamic("ComplianceDetails")(__v.asInstanceOf[js.Any]))
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTagMapping]
    }
  }

  @js.native
  trait StartReportCreationInput extends js.Object {
    var S3Bucket: S3Bucket
  }

  object StartReportCreationInput {
    @inline
    def apply(
        S3Bucket: S3Bucket
    ): StartReportCreationInput = {
      val __obj = js.Dynamic.literal(
        "S3Bucket" -> S3Bucket.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartReportCreationInput]
    }
  }

  @js.native
  trait StartReportCreationOutput extends js.Object {}

  object StartReportCreationOutput {
    @inline
    def apply(
    ): StartReportCreationOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartReportCreationOutput]
    }
  }

  /**
    * A count of noncompliant resources.
    */
  @js.native
  trait Summary extends js.Object {
    var LastUpdated: js.UndefOr[LastUpdated]
    var NonCompliantResources: js.UndefOr[NonCompliantResources]
    var Region: js.UndefOr[Region]
    var ResourceType: js.UndefOr[AmazonResourceType]
    var TargetId: js.UndefOr[TargetId]
    var TargetIdType: js.UndefOr[TargetIdType]
  }

  object Summary {
    @inline
    def apply(
        LastUpdated: js.UndefOr[LastUpdated] = js.undefined,
        NonCompliantResources: js.UndefOr[NonCompliantResources] = js.undefined,
        Region: js.UndefOr[Region] = js.undefined,
        ResourceType: js.UndefOr[AmazonResourceType] = js.undefined,
        TargetId: js.UndefOr[TargetId] = js.undefined,
        TargetIdType: js.UndefOr[TargetIdType] = js.undefined
    ): Summary = {
      val __obj = js.Dynamic.literal()
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      NonCompliantResources.foreach(__v => __obj.updateDynamic("NonCompliantResources")(__v.asInstanceOf[js.Any]))
      Region.foreach(__v => __obj.updateDynamic("Region")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      TargetId.foreach(__v => __obj.updateDynamic("TargetId")(__v.asInstanceOf[js.Any]))
      TargetIdType.foreach(__v => __obj.updateDynamic("TargetIdType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Summary]
    }
  }

  /**
    * The metadata that you apply to AWS resources to help you categorize and organize them. Each tag consists of a key and a value, both of which you define. For more information, see [[http://docs.aws.amazon.com/general/latest/gr/aws_tagging.html|Tagging AWS Resources]] in the <i>AWS General Reference</i>.
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
        "Key" -> Key.asInstanceOf[js.Any],
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
        "Tags" -> Tags.asInstanceOf[js.Any]
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
  sealed trait TargetIdType extends js.Any
  object TargetIdType {
    val ACCOUNT = "ACCOUNT".asInstanceOf[TargetIdType]
    val OU = "OU".asInstanceOf[TargetIdType]
    val ROOT = "ROOT".asInstanceOf[TargetIdType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ACCOUNT, OU, ROOT))
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
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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
