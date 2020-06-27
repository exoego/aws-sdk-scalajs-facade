package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object resourcegroupstaggingapi {
  type AmazonResourceType             = String
  type ComplianceStatus               = Boolean
  type ErrorMessage                   = String
  type ExcludeCompliantResources      = Boolean
  type FailedResourcesMap             = js.Dictionary[FailureInfo]
  type GroupBy                        = js.Array[GroupByAttribute]
  type IncludeComplianceDetails       = Boolean
  type LastUpdated                    = String
  type MaxResultsGetComplianceSummary = Int
  type NonCompliantResources          = Double
  type PaginationToken                = String
  type Region                         = String
  type RegionFilterList               = js.Array[Region]
  type ResourceARN                    = String
  type ResourceARNList                = js.Array[ResourceARN]
  type ResourceTagMappingList         = js.Array[ResourceTagMapping]
  type ResourceTypeFilterList         = js.Array[AmazonResourceType]
  type ResourcesPerPage               = Int
  type S3Bucket                       = String
  type S3Location                     = String
  type Status                         = String
  type StatusCode                     = Int
  type SummaryList                    = js.Array[Summary]
  type TagFilterList                  = js.Array[TagFilter]
  type TagKey                         = String
  type TagKeyFilterList               = js.Array[TagKey]
  type TagKeyList                     = js.Array[TagKey]
  type TagKeyListForUntag             = js.Array[TagKey]
  type TagList                        = js.Array[Tag]
  type TagMap                         = js.Dictionary[TagValue]
  type TagValue                       = String
  type TagValueList                   = js.Array[TagValue]
  type TagValuesOutputList            = js.Array[TagValue]
  type TagsPerPage                    = Int
  type TargetId                       = String
  type TargetIdFilterList             = js.Array[TargetId]

  implicit final class ResourceGroupsTaggingAPIOps(private val service: ResourceGroupsTaggingAPI) extends AnyVal {

    @inline def describeReportCreationFuture(
        params: DescribeReportCreationInput
    ): Future[DescribeReportCreationOutput] = service.describeReportCreation(params).promise().toFuture
    @inline def getComplianceSummaryFuture(params: GetComplianceSummaryInput): Future[GetComplianceSummaryOutput] =
      service.getComplianceSummary(params).promise().toFuture
    @inline def getResourcesFuture(params: GetResourcesInput): Future[GetResourcesOutput] =
      service.getResources(params).promise().toFuture
    @inline def getTagKeysFuture(params: GetTagKeysInput): Future[GetTagKeysOutput] =
      service.getTagKeys(params).promise().toFuture
    @inline def getTagValuesFuture(params: GetTagValuesInput): Future[GetTagValuesOutput] =
      service.getTagValues(params).promise().toFuture
    @inline def startReportCreationFuture(params: StartReportCreationInput): Future[StartReportCreationOutput] =
      service.startReportCreation(params).promise().toFuture
    @inline def tagResourcesFuture(params: TagResourcesInput): Future[TagResourcesOutput] =
      service.tagResources(params).promise().toFuture
    @inline def untagResourcesFuture(params: UntagResourcesInput): Future[UntagResourcesOutput] =
      service.untagResources(params).promise().toFuture
  }
}

package resourcegroupstaggingapi {
  @js.native
  @JSImport("aws-sdk", "ResourceGroupsTaggingAPI")
  class ResourceGroupsTaggingAPI() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeReportCreation(params: DescribeReportCreationInput): Request[DescribeReportCreationOutput] = js.native
    def getComplianceSummary(params: GetComplianceSummaryInput): Request[GetComplianceSummaryOutput]       = js.native
    def getResources(params: GetResourcesInput): Request[GetResourcesOutput]                               = js.native
    def getTagKeys(params: GetTagKeysInput): Request[GetTagKeysOutput]                                     = js.native
    def getTagValues(params: GetTagValuesInput): Request[GetTagValuesOutput]                               = js.native
    def startReportCreation(params: StartReportCreationInput): Request[StartReportCreationOutput]          = js.native
    def tagResources(params: TagResourcesInput): Request[TagResourcesOutput]                               = js.native
    def untagResources(params: UntagResourcesInput): Request[UntagResourcesOutput]                         = js.native
  }

  /**
    * Information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
    */
  @js.native
  @Factory
  trait ComplianceDetails extends js.Object {
    var ComplianceStatus: js.UndefOr[ComplianceStatus]
    var KeysWithNoncompliantValues: js.UndefOr[TagKeyList]
    var NoncompliantKeys: js.UndefOr[TagKeyList]
  }

  @js.native
  @Factory
  trait DescribeReportCreationInput extends js.Object {}

  @js.native
  @Factory
  trait DescribeReportCreationOutput extends js.Object {
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var S3Location: js.UndefOr[S3Location]
    var Status: js.UndefOr[Status]
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode extends js.Object {
    val InternalServiceException  = "InternalServiceException".asInstanceOf[ErrorCode]
    val InvalidParameterException = "InvalidParameterException".asInstanceOf[ErrorCode]

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
  @Factory
  trait FailureInfo extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[ErrorMessage]
    var StatusCode: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait GetComplianceSummaryInput extends js.Object {
    var GroupBy: js.UndefOr[GroupBy]
    var MaxResults: js.UndefOr[MaxResultsGetComplianceSummary]
    var PaginationToken: js.UndefOr[PaginationToken]
    var RegionFilters: js.UndefOr[RegionFilterList]
    var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList]
    var TagKeyFilters: js.UndefOr[TagKeyFilterList]
    var TargetIdFilters: js.UndefOr[TargetIdFilterList]
  }

  @js.native
  @Factory
  trait GetComplianceSummaryOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var SummaryList: js.UndefOr[SummaryList]
  }

  @js.native
  @Factory
  trait GetResourcesInput extends js.Object {
    var ExcludeCompliantResources: js.UndefOr[ExcludeCompliantResources]
    var IncludeComplianceDetails: js.UndefOr[IncludeComplianceDetails]
    var PaginationToken: js.UndefOr[PaginationToken]
    var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList]
    var ResourcesPerPage: js.UndefOr[ResourcesPerPage]
    var TagFilters: js.UndefOr[TagFilterList]
    var TagsPerPage: js.UndefOr[TagsPerPage]
  }

  @js.native
  @Factory
  trait GetResourcesOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var ResourceTagMappingList: js.UndefOr[ResourceTagMappingList]
  }

  @js.native
  @Factory
  trait GetTagKeysInput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait GetTagKeysOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var TagKeys: js.UndefOr[TagKeyList]
  }

  @js.native
  @Factory
  trait GetTagValuesInput extends js.Object {
    var Key: TagKey
    var PaginationToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait GetTagValuesOutput extends js.Object {
    var PaginationToken: js.UndefOr[PaginationToken]
    var TagValues: js.UndefOr[TagValuesOutputList]
  }

  @js.native
  sealed trait GroupByAttribute extends js.Any
  object GroupByAttribute extends js.Object {
    val TARGET_ID     = "TARGET_ID".asInstanceOf[GroupByAttribute]
    val REGION        = "REGION".asInstanceOf[GroupByAttribute]
    val RESOURCE_TYPE = "RESOURCE_TYPE".asInstanceOf[GroupByAttribute]

    val values = js.Object.freeze(js.Array(TARGET_ID, REGION, RESOURCE_TYPE))
  }

  /**
    * A list of resource ARNs and the tags (keys and values) that are associated with each.
    */
  @js.native
  @Factory
  trait ResourceTagMapping extends js.Object {
    var ComplianceDetails: js.UndefOr[ComplianceDetails]
    var ResourceARN: js.UndefOr[ResourceARN]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait StartReportCreationInput extends js.Object {
    var S3Bucket: S3Bucket
  }

  @js.native
  @Factory
  trait StartReportCreationOutput extends js.Object {}

  /**
    * A count of noncompliant resources.
    */
  @js.native
  @Factory
  trait Summary extends js.Object {
    var LastUpdated: js.UndefOr[LastUpdated]
    var NonCompliantResources: js.UndefOr[NonCompliantResources]
    var Region: js.UndefOr[Region]
    var ResourceType: js.UndefOr[AmazonResourceType]
    var TargetId: js.UndefOr[TargetId]
    var TargetIdType: js.UndefOr[TargetIdType]
  }

  /**
    * The metadata that you apply to AWS resources to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. For more information, see [[http://docs.aws.amazon.com/general/latest/gr/aws_tagging.html|Tagging AWS Resources]] in the <i>AWS General Reference</i>.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  /**
    * A list of tags (keys and values) that are used to specify the associated resources.
    */
  @js.native
  @Factory
  trait TagFilter extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Values: js.UndefOr[TagValueList]
  }

  @js.native
  @Factory
  trait TagResourcesInput extends js.Object {
    var ResourceARNList: ResourceARNList
    var Tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourcesOutput extends js.Object {
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap]
  }

  @js.native
  sealed trait TargetIdType extends js.Any
  object TargetIdType extends js.Object {
    val ACCOUNT = "ACCOUNT".asInstanceOf[TargetIdType]
    val OU      = "OU".asInstanceOf[TargetIdType]
    val ROOT    = "ROOT".asInstanceOf[TargetIdType]

    val values = js.Object.freeze(js.Array(ACCOUNT, OU, ROOT))
  }

  @js.native
  @Factory
  trait UntagResourcesInput extends js.Object {
    var ResourceARNList: ResourceARNList
    var TagKeys: TagKeyListForUntag
  }

  @js.native
  @Factory
  trait UntagResourcesOutput extends js.Object {
    var FailedResourcesMap: js.UndefOr[FailedResourcesMap]
  }
}
