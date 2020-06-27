package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object es {
  type ARN                                       = String
  type AdditionalLimitList                       = js.Array[AdditionalLimit]
  type AdvancedOptions                           = js.Dictionary[String]
  type CloudWatchLogsLogGroupArn                 = String
  type CompatibleElasticsearchVersionsList       = js.Array[CompatibleVersionsMap]
  type DeploymentCloseDateTimeStamp              = js.Date
  type DomainId                                  = String
  type DomainInfoList                            = js.Array[DomainInfo]
  type DomainName                                = String
  type DomainNameList                            = js.Array[DomainName]
  type ElasticsearchDomainStatusList             = js.Array[ElasticsearchDomainStatus]
  type ElasticsearchInstanceTypeList             = js.Array[ESPartitionInstanceType]
  type ElasticsearchVersionList                  = js.Array[ElasticsearchVersionString]
  type ElasticsearchVersionString                = String
  type EndpointsMap                              = js.Dictionary[ServiceUrl]
  type GUID                                      = String
  type IdentityPoolId                            = String
  type InstanceCount                             = Int
  type InstanceRole                              = String
  type IntegerClass                              = Int
  type Issue                                     = String
  type Issues                                    = js.Array[Issue]
  type KmsKeyId                                  = String
  type LimitName                                 = String
  type LimitValue                                = String
  type LimitValueList                            = js.Array[LimitValue]
  type LimitsByRole                              = js.Dictionary[Limits]
  type LogPublishingOptions                      = js.Dictionary[LogPublishingOption]
  type MaxResults                                = Int
  type MaximumInstanceCount                      = Int
  type MinimumInstanceCount                      = Int
  type NextToken                                 = String
  type Password                                  = String
  type PolicyDocument                            = String
  type RecurringChargeList                       = js.Array[RecurringCharge]
  type ReservationToken                          = String
  type ReservedElasticsearchInstanceList         = js.Array[ReservedElasticsearchInstance]
  type ReservedElasticsearchInstanceOfferingList = js.Array[ReservedElasticsearchInstanceOffering]
  type RoleArn                                   = String
  type ServiceUrl                                = String
  type StartTimestamp                            = js.Date
  type StorageSubTypeName                        = String
  type StorageTypeLimitList                      = js.Array[StorageTypeLimit]
  type StorageTypeList                           = js.Array[StorageType]
  type StorageTypeName                           = String
  type StringList                                = js.Array[String]
  type TagKey                                    = String
  type TagList                                   = js.Array[Tag]
  type TagValue                                  = String
  type UIntValue                                 = Int
  type UpdateTimestamp                           = js.Date
  type UpgradeHistoryList                        = js.Array[UpgradeHistory]
  type UpgradeName                               = String
  type UpgradeStepsList                          = js.Array[UpgradeStepItem]
  type UserPoolId                                = String
  type Username                                  = String

  implicit final class ESOps(private val service: ES) extends AnyVal {

    @inline def addTagsFuture(params: AddTagsRequest): Future[js.Object] = service.addTags(params).promise().toFuture
    @inline def cancelElasticsearchServiceSoftwareUpdateFuture(
        params: CancelElasticsearchServiceSoftwareUpdateRequest
    ): Future[CancelElasticsearchServiceSoftwareUpdateResponse] =
      service.cancelElasticsearchServiceSoftwareUpdate(params).promise().toFuture
    @inline def createElasticsearchDomainFuture(
        params: CreateElasticsearchDomainRequest
    ): Future[CreateElasticsearchDomainResponse] = service.createElasticsearchDomain(params).promise().toFuture
    @inline def deleteElasticsearchDomainFuture(
        params: DeleteElasticsearchDomainRequest
    ): Future[DeleteElasticsearchDomainResponse] = service.deleteElasticsearchDomain(params).promise().toFuture
    @inline def deleteElasticsearchServiceRoleFuture(): Future[js.Object] =
      service.deleteElasticsearchServiceRole().promise().toFuture
    @inline def describeElasticsearchDomainConfigFuture(
        params: DescribeElasticsearchDomainConfigRequest
    ): Future[DescribeElasticsearchDomainConfigResponse] =
      service.describeElasticsearchDomainConfig(params).promise().toFuture
    @inline def describeElasticsearchDomainFuture(
        params: DescribeElasticsearchDomainRequest
    ): Future[DescribeElasticsearchDomainResponse] = service.describeElasticsearchDomain(params).promise().toFuture
    @inline def describeElasticsearchDomainsFuture(
        params: DescribeElasticsearchDomainsRequest
    ): Future[DescribeElasticsearchDomainsResponse] = service.describeElasticsearchDomains(params).promise().toFuture
    @inline def describeElasticsearchInstanceTypeLimitsFuture(
        params: DescribeElasticsearchInstanceTypeLimitsRequest
    ): Future[DescribeElasticsearchInstanceTypeLimitsResponse] =
      service.describeElasticsearchInstanceTypeLimits(params).promise().toFuture
    @inline def describeReservedElasticsearchInstanceOfferingsFuture(
        params: DescribeReservedElasticsearchInstanceOfferingsRequest
    ): Future[DescribeReservedElasticsearchInstanceOfferingsResponse] =
      service.describeReservedElasticsearchInstanceOfferings(params).promise().toFuture
    @inline def describeReservedElasticsearchInstancesFuture(
        params: DescribeReservedElasticsearchInstancesRequest
    ): Future[DescribeReservedElasticsearchInstancesResponse] =
      service.describeReservedElasticsearchInstances(params).promise().toFuture
    @inline def getCompatibleElasticsearchVersionsFuture(
        params: GetCompatibleElasticsearchVersionsRequest
    ): Future[GetCompatibleElasticsearchVersionsResponse] =
      service.getCompatibleElasticsearchVersions(params).promise().toFuture
    @inline def getUpgradeHistoryFuture(params: GetUpgradeHistoryRequest): Future[GetUpgradeHistoryResponse] =
      service.getUpgradeHistory(params).promise().toFuture
    @inline def getUpgradeStatusFuture(params: GetUpgradeStatusRequest): Future[GetUpgradeStatusResponse] =
      service.getUpgradeStatus(params).promise().toFuture
    @inline def listDomainNamesFuture(): Future[ListDomainNamesResponse] = service.listDomainNames().promise().toFuture
    @inline def listElasticsearchInstanceTypesFuture(
        params: ListElasticsearchInstanceTypesRequest
    ): Future[ListElasticsearchInstanceTypesResponse] =
      service.listElasticsearchInstanceTypes(params).promise().toFuture
    @inline def listElasticsearchVersionsFuture(
        params: ListElasticsearchVersionsRequest
    ): Future[ListElasticsearchVersionsResponse] = service.listElasticsearchVersions(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise().toFuture
    @inline def purchaseReservedElasticsearchInstanceOfferingFuture(
        params: PurchaseReservedElasticsearchInstanceOfferingRequest
    ): Future[PurchaseReservedElasticsearchInstanceOfferingResponse] =
      service.purchaseReservedElasticsearchInstanceOffering(params).promise().toFuture
    @inline def removeTagsFuture(params: RemoveTagsRequest): Future[js.Object] =
      service.removeTags(params).promise().toFuture
    @inline def startElasticsearchServiceSoftwareUpdateFuture(
        params: StartElasticsearchServiceSoftwareUpdateRequest
    ): Future[StartElasticsearchServiceSoftwareUpdateResponse] =
      service.startElasticsearchServiceSoftwareUpdate(params).promise().toFuture
    @inline def updateElasticsearchDomainConfigFuture(
        params: UpdateElasticsearchDomainConfigRequest
    ): Future[UpdateElasticsearchDomainConfigResponse] =
      service.updateElasticsearchDomainConfig(params).promise().toFuture
    @inline def upgradeElasticsearchDomainFuture(
        params: UpgradeElasticsearchDomainRequest
    ): Future[UpgradeElasticsearchDomainResponse] = service.upgradeElasticsearchDomain(params).promise().toFuture
  }
}

package es {
  @js.native
  @JSImport("aws-sdk", "ES")
  class ES() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTags(params: AddTagsRequest): Request[js.Object] = js.native
    def cancelElasticsearchServiceSoftwareUpdate(
        params: CancelElasticsearchServiceSoftwareUpdateRequest
    ): Request[CancelElasticsearchServiceSoftwareUpdateResponse] = js.native
    def createElasticsearchDomain(
        params: CreateElasticsearchDomainRequest
    ): Request[CreateElasticsearchDomainResponse] = js.native
    def deleteElasticsearchDomain(
        params: DeleteElasticsearchDomainRequest
    ): Request[DeleteElasticsearchDomainResponse]            = js.native
    def deleteElasticsearchServiceRole(): Request[js.Object] = js.native
    def describeElasticsearchDomain(
        params: DescribeElasticsearchDomainRequest
    ): Request[DescribeElasticsearchDomainResponse] = js.native
    def describeElasticsearchDomainConfig(
        params: DescribeElasticsearchDomainConfigRequest
    ): Request[DescribeElasticsearchDomainConfigResponse] = js.native
    def describeElasticsearchDomains(
        params: DescribeElasticsearchDomainsRequest
    ): Request[DescribeElasticsearchDomainsResponse] = js.native
    def describeElasticsearchInstanceTypeLimits(
        params: DescribeElasticsearchInstanceTypeLimitsRequest
    ): Request[DescribeElasticsearchInstanceTypeLimitsResponse] = js.native
    def describeReservedElasticsearchInstanceOfferings(
        params: DescribeReservedElasticsearchInstanceOfferingsRequest
    ): Request[DescribeReservedElasticsearchInstanceOfferingsResponse] = js.native
    def describeReservedElasticsearchInstances(
        params: DescribeReservedElasticsearchInstancesRequest
    ): Request[DescribeReservedElasticsearchInstancesResponse] = js.native
    def getCompatibleElasticsearchVersions(
        params: GetCompatibleElasticsearchVersionsRequest
    ): Request[GetCompatibleElasticsearchVersionsResponse]                                      = js.native
    def getUpgradeHistory(params: GetUpgradeHistoryRequest): Request[GetUpgradeHistoryResponse] = js.native
    def getUpgradeStatus(params: GetUpgradeStatusRequest): Request[GetUpgradeStatusResponse]    = js.native
    def listDomainNames(): Request[ListDomainNamesResponse]                                     = js.native
    def listElasticsearchInstanceTypes(
        params: ListElasticsearchInstanceTypesRequest
    ): Request[ListElasticsearchInstanceTypesResponse] = js.native
    def listElasticsearchVersions(
        params: ListElasticsearchVersionsRequest
    ): Request[ListElasticsearchVersionsResponse]                    = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def purchaseReservedElasticsearchInstanceOffering(
        params: PurchaseReservedElasticsearchInstanceOfferingRequest
    ): Request[PurchaseReservedElasticsearchInstanceOfferingResponse] = js.native
    def removeTags(params: RemoveTagsRequest): Request[js.Object]     = js.native
    def startElasticsearchServiceSoftwareUpdate(
        params: StartElasticsearchServiceSoftwareUpdateRequest
    ): Request[StartElasticsearchServiceSoftwareUpdateResponse] = js.native
    def updateElasticsearchDomainConfig(
        params: UpdateElasticsearchDomainConfigRequest
    ): Request[UpdateElasticsearchDomainConfigResponse] = js.native
    def upgradeElasticsearchDomain(
        params: UpgradeElasticsearchDomainRequest
    ): Request[UpgradeElasticsearchDomainResponse] = js.native
  }

  /**
    * The configured access rules for the domain's document and search endpoints, and the current status of those rules.
    */
  @js.native
  @Factory
  trait AccessPoliciesStatus extends js.Object {
    var Options: PolicyDocument
    var Status: OptionStatus
  }

  /**
    * Container for the parameters to the <code><a>AddTags</a></code> operation. Specify the tags that you want to attach to the Elasticsearch domain.
    */
  @js.native
  @Factory
  trait AddTagsRequest extends js.Object {
    var ARN: ARN
    var TagList: TagList
  }

  /**
    * List of limits that are specific to a given InstanceType and for each of it's <code> <a>InstanceRole</a> </code> .
    */
  @js.native
  @Factory
  trait AdditionalLimit extends js.Object {
    var LimitName: js.UndefOr[LimitName]
    var LimitValues: js.UndefOr[LimitValueList]
  }

  /**
    * Status of the advanced options for the specified Elasticsearch domain. Currently, the following advanced options are available:
    * * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access to individual sub-resources. By default, the value is <code>true</code>. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options" target="_blank">Configuration Advanced Options</a> for more information.
    *  * Option to specify the percentage of heap space that is allocated to field data. By default, this setting is unbounded.
    * For more information, see [[http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options|Configuring Advanced Options]].
    */
  @js.native
  @Factory
  trait AdvancedOptionsStatus extends js.Object {
    var Options: AdvancedOptions
    var Status: OptionStatus
  }

  /**
    * Specifies the advanced security configuration: whether advanced security is enabled, whether the internal database option is enabled.
    */
  @js.native
  @Factory
  trait AdvancedSecurityOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var InternalUserDatabaseEnabled: js.UndefOr[Boolean]
  }

  /**
    * Specifies the advanced security configuration: whether advanced security is enabled, whether the internal database option is enabled, master username and password (if internal database is enabled), and master user ARN (if IAM is enabled).
    */
  @js.native
  @Factory
  trait AdvancedSecurityOptionsInput extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var InternalUserDatabaseEnabled: js.UndefOr[Boolean]
    var MasterUserOptions: js.UndefOr[MasterUserOptions]
  }

  /**
    * Specifies the status of advanced security options for the specified Elasticsearch domain.
    */
  @js.native
  @Factory
  trait AdvancedSecurityOptionsStatus extends js.Object {
    var Options: AdvancedSecurityOptions
    var Status: OptionStatus
  }

  /**
    * Container for the parameters to the <code><a>CancelElasticsearchServiceSoftwareUpdate</a></code> operation. Specifies the name of the Elasticsearch domain that you wish to cancel a service software update on.
    */
  @js.native
  @Factory
  trait CancelElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of a <code>CancelElasticsearchServiceSoftwareUpdate</code> operation. Contains the status of the update.
    */
  @js.native
  @Factory
  trait CancelElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html" target="_blank">Amazon Cognito Authentication for Kibana</a>.
    */
  @js.native
  @Factory
  trait CognitoOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var RoleArn: js.UndefOr[RoleArn]
    var UserPoolId: js.UndefOr[UserPoolId]
  }

  /**
    * Status of the Cognito options for the specified Elasticsearch domain.
    */
  @js.native
  @Factory
  trait CognitoOptionsStatus extends js.Object {
    var Options: CognitoOptions
    var Status: OptionStatus
  }

  /**
    * A map from an <code> <a>ElasticsearchVersion</a> </code> to a list of compatible <code> <a>ElasticsearchVersion</a> </code> s to which the domain can be upgraded.
    */
  @js.native
  @Factory
  trait CompatibleVersionsMap extends js.Object {
    var SourceVersion: js.UndefOr[ElasticsearchVersionString]
    var TargetVersions: js.UndefOr[ElasticsearchVersionList]
  }

  @js.native
  @Factory
  trait CreateElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var VPCOptions: js.UndefOr[VPCOptions]
  }

  /**
    * The result of a <code>CreateElasticsearchDomain</code> operation. Contains the status of the newly created Elasticsearch domain.
    */
  @js.native
  @Factory
  trait CreateElasticsearchDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus]
  }

  /**
    * Container for the parameters to the <code><a>DeleteElasticsearchDomain</a></code> operation. Specifies the name of the Elasticsearch domain that you want to delete.
    */
  @js.native
  @Factory
  trait DeleteElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of a <code>DeleteElasticsearchDomain</code> request. Contains the status of the pending deletion, or no status if the domain and all of its resources have been deleted.
    */
  @js.native
  @Factory
  trait DeleteElasticsearchDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus]
  }

  @js.native
  sealed trait DeploymentStatus extends js.Any
  object DeploymentStatus extends js.Object {
    val PENDING_UPDATE = "PENDING_UPDATE".asInstanceOf[DeploymentStatus]
    val IN_PROGRESS    = "IN_PROGRESS".asInstanceOf[DeploymentStatus]
    val COMPLETED      = "COMPLETED".asInstanceOf[DeploymentStatus]
    val NOT_ELIGIBLE   = "NOT_ELIGIBLE".asInstanceOf[DeploymentStatus]
    val ELIGIBLE       = "ELIGIBLE".asInstanceOf[DeploymentStatus]

    val values = js.Object.freeze(js.Array(PENDING_UPDATE, IN_PROGRESS, COMPLETED, NOT_ELIGIBLE, ELIGIBLE))
  }

  /**
    * Container for the parameters to the <code>DescribeElasticsearchDomainConfig</code> operation. Specifies the domain name for which you want configuration information.
    */
  @js.native
  @Factory
  trait DescribeElasticsearchDomainConfigRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of a <code>DescribeElasticsearchDomainConfig</code> request. Contains the configuration information of the requested domain.
    */
  @js.native
  @Factory
  trait DescribeElasticsearchDomainConfigResponse extends js.Object {
    var DomainConfig: ElasticsearchDomainConfig
  }

  /**
    * Container for the parameters to the <code><a>DescribeElasticsearchDomain</a></code> operation.
    */
  @js.native
  @Factory
  trait DescribeElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of a <code>DescribeElasticsearchDomain</code> request. Contains the status of the domain specified in the request.
    */
  @js.native
  @Factory
  trait DescribeElasticsearchDomainResponse extends js.Object {
    var DomainStatus: ElasticsearchDomainStatus
  }

  /**
    * Container for the parameters to the <code><a>DescribeElasticsearchDomains</a></code> operation. By default, the API returns the status of all Elasticsearch domains.
    */
  @js.native
  @Factory
  trait DescribeElasticsearchDomainsRequest extends js.Object {
    var DomainNames: DomainNameList
  }

  /**
    * The result of a <code>DescribeElasticsearchDomains</code> request. Contains the status of the specified domains or all domains owned by the account.
    */
  @js.native
  @Factory
  trait DescribeElasticsearchDomainsResponse extends js.Object {
    var DomainStatusList: ElasticsearchDomainStatusList
  }

  /**
    * Container for the parameters to <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
    */
  @js.native
  @Factory
  trait DescribeElasticsearchInstanceTypeLimitsRequest extends js.Object {
    var ElasticsearchVersion: ElasticsearchVersionString
    var InstanceType: ESPartitionInstanceType
    var DomainName: js.UndefOr[DomainName]
  }

  /**
    * Container for the parameters received from <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
    */
  @js.native
  @Factory
  trait DescribeElasticsearchInstanceTypeLimitsResponse extends js.Object {
    var LimitsByRole: js.UndefOr[LimitsByRole]
  }

  /**
    * Container for parameters to <code>DescribeReservedElasticsearchInstanceOfferings</code>
    */
  @js.native
  @Factory
  trait DescribeReservedElasticsearchInstanceOfferingsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID]
  }

  /**
    * Container for results from <code>DescribeReservedElasticsearchInstanceOfferings</code>
    */
  @js.native
  @Factory
  trait DescribeReservedElasticsearchInstanceOfferingsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList]
  }

  /**
    * Container for parameters to <code>DescribeReservedElasticsearchInstances</code>
    */
  @js.native
  @Factory
  trait DescribeReservedElasticsearchInstancesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
  }

  /**
    * Container for results from <code>DescribeReservedElasticsearchInstances</code>
    */
  @js.native
  @Factory
  trait DescribeReservedElasticsearchInstancesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList]
  }

  /**
    * Options to configure endpoint for the Elasticsearch domain.
    */
  @js.native
  @Factory
  trait DomainEndpointOptions extends js.Object {
    var EnforceHTTPS: js.UndefOr[Boolean]
    var TLSSecurityPolicy: js.UndefOr[TLSSecurityPolicy]
  }

  /**
    * The configured endpoint options for the domain and their current status.
    */
  @js.native
  @Factory
  trait DomainEndpointOptionsStatus extends js.Object {
    var Options: DomainEndpointOptions
    var Status: OptionStatus
  }

  @js.native
  @Factory
  trait DomainInfo extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  /**
    * Options to enable, disable, and specify the properties of EBS storage volumes. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank"> Configuring EBS-based Storage</a>.
    */
  @js.native
  @Factory
  trait EBSOptions extends js.Object {
    var EBSEnabled: js.UndefOr[Boolean]
    var Iops: js.UndefOr[IntegerClass]
    var VolumeSize: js.UndefOr[IntegerClass]
    var VolumeType: js.UndefOr[VolumeType]
  }

  /**
    * Status of the EBS options for the specified Elasticsearch domain.
    */
  @js.native
  @Factory
  trait EBSOptionsStatus extends js.Object {
    var Options: EBSOptions
    var Status: OptionStatus
  }

  @js.native
  sealed trait ESPartitionInstanceType extends js.Any
  object ESPartitionInstanceType extends js.Object {
    val `m3.medium.elasticsearch`         = "m3.medium.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m3.large.elasticsearch`          = "m3.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m3.xlarge.elasticsearch`         = "m3.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m3.2xlarge.elasticsearch`        = "m3.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.large.elasticsearch`          = "m4.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.xlarge.elasticsearch`         = "m4.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.2xlarge.elasticsearch`        = "m4.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.4xlarge.elasticsearch`        = "m4.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m4.10xlarge.elasticsearch`       = "m4.10xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.large.elasticsearch`          = "m5.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.xlarge.elasticsearch`         = "m5.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.2xlarge.elasticsearch`        = "m5.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.4xlarge.elasticsearch`        = "m5.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `m5.12xlarge.elasticsearch`       = "m5.12xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.large.elasticsearch`          = "r5.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.xlarge.elasticsearch`         = "r5.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.2xlarge.elasticsearch`        = "r5.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.4xlarge.elasticsearch`        = "r5.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r5.12xlarge.elasticsearch`       = "r5.12xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.large.elasticsearch`          = "c5.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.xlarge.elasticsearch`         = "c5.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.2xlarge.elasticsearch`        = "c5.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.4xlarge.elasticsearch`        = "c5.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.9xlarge.elasticsearch`        = "c5.9xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c5.18xlarge.elasticsearch`       = "c5.18xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `ultrawarm1.medium.elasticsearch` = "ultrawarm1.medium.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `ultrawarm1.large.elasticsearch`  = "ultrawarm1.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `t2.micro.elasticsearch`          = "t2.micro.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `t2.small.elasticsearch`          = "t2.small.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `t2.medium.elasticsearch`         = "t2.medium.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.large.elasticsearch`          = "r3.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.xlarge.elasticsearch`         = "r3.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.2xlarge.elasticsearch`        = "r3.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.4xlarge.elasticsearch`        = "r3.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r3.8xlarge.elasticsearch`        = "r3.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i2.xlarge.elasticsearch`         = "i2.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i2.2xlarge.elasticsearch`        = "i2.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `d2.xlarge.elasticsearch`         = "d2.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `d2.2xlarge.elasticsearch`        = "d2.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `d2.4xlarge.elasticsearch`        = "d2.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `d2.8xlarge.elasticsearch`        = "d2.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.large.elasticsearch`          = "c4.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.xlarge.elasticsearch`         = "c4.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.2xlarge.elasticsearch`        = "c4.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.4xlarge.elasticsearch`        = "c4.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `c4.8xlarge.elasticsearch`        = "c4.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.large.elasticsearch`          = "r4.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.xlarge.elasticsearch`         = "r4.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.2xlarge.elasticsearch`        = "r4.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.4xlarge.elasticsearch`        = "r4.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.8xlarge.elasticsearch`        = "r4.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `r4.16xlarge.elasticsearch`       = "r4.16xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.large.elasticsearch`          = "i3.large.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.xlarge.elasticsearch`         = "i3.xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.2xlarge.elasticsearch`        = "i3.2xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.4xlarge.elasticsearch`        = "i3.4xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.8xlarge.elasticsearch`        = "i3.8xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]
    val `i3.16xlarge.elasticsearch`       = "i3.16xlarge.elasticsearch".asInstanceOf[ESPartitionInstanceType]

    val values = js.Object.freeze(
      js.Array(
        `m3.medium.elasticsearch`,
        `m3.large.elasticsearch`,
        `m3.xlarge.elasticsearch`,
        `m3.2xlarge.elasticsearch`,
        `m4.large.elasticsearch`,
        `m4.xlarge.elasticsearch`,
        `m4.2xlarge.elasticsearch`,
        `m4.4xlarge.elasticsearch`,
        `m4.10xlarge.elasticsearch`,
        `m5.large.elasticsearch`,
        `m5.xlarge.elasticsearch`,
        `m5.2xlarge.elasticsearch`,
        `m5.4xlarge.elasticsearch`,
        `m5.12xlarge.elasticsearch`,
        `r5.large.elasticsearch`,
        `r5.xlarge.elasticsearch`,
        `r5.2xlarge.elasticsearch`,
        `r5.4xlarge.elasticsearch`,
        `r5.12xlarge.elasticsearch`,
        `c5.large.elasticsearch`,
        `c5.xlarge.elasticsearch`,
        `c5.2xlarge.elasticsearch`,
        `c5.4xlarge.elasticsearch`,
        `c5.9xlarge.elasticsearch`,
        `c5.18xlarge.elasticsearch`,
        `ultrawarm1.medium.elasticsearch`,
        `ultrawarm1.large.elasticsearch`,
        `t2.micro.elasticsearch`,
        `t2.small.elasticsearch`,
        `t2.medium.elasticsearch`,
        `r3.large.elasticsearch`,
        `r3.xlarge.elasticsearch`,
        `r3.2xlarge.elasticsearch`,
        `r3.4xlarge.elasticsearch`,
        `r3.8xlarge.elasticsearch`,
        `i2.xlarge.elasticsearch`,
        `i2.2xlarge.elasticsearch`,
        `d2.xlarge.elasticsearch`,
        `d2.2xlarge.elasticsearch`,
        `d2.4xlarge.elasticsearch`,
        `d2.8xlarge.elasticsearch`,
        `c4.large.elasticsearch`,
        `c4.xlarge.elasticsearch`,
        `c4.2xlarge.elasticsearch`,
        `c4.4xlarge.elasticsearch`,
        `c4.8xlarge.elasticsearch`,
        `r4.large.elasticsearch`,
        `r4.xlarge.elasticsearch`,
        `r4.2xlarge.elasticsearch`,
        `r4.4xlarge.elasticsearch`,
        `r4.8xlarge.elasticsearch`,
        `r4.16xlarge.elasticsearch`,
        `i3.large.elasticsearch`,
        `i3.xlarge.elasticsearch`,
        `i3.2xlarge.elasticsearch`,
        `i3.4xlarge.elasticsearch`,
        `i3.8xlarge.elasticsearch`,
        `i3.16xlarge.elasticsearch`
      )
    )
  }

  @js.native
  sealed trait ESWarmPartitionInstanceType extends js.Any
  object ESWarmPartitionInstanceType extends js.Object {
    val `ultrawarm1.medium.elasticsearch` = "ultrawarm1.medium.elasticsearch".asInstanceOf[ESWarmPartitionInstanceType]
    val `ultrawarm1.large.elasticsearch`  = "ultrawarm1.large.elasticsearch".asInstanceOf[ESWarmPartitionInstanceType]

    val values = js.Object.freeze(js.Array(`ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch`))
  }

  /**
    * Specifies the configuration for the domain cluster, such as the type and number of instances.
    */
  @js.native
  @Factory
  trait ElasticsearchClusterConfig extends js.Object {
    var DedicatedMasterCount: js.UndefOr[IntegerClass]
    var DedicatedMasterEnabled: js.UndefOr[Boolean]
    var DedicatedMasterType: js.UndefOr[ESPartitionInstanceType]
    var InstanceCount: js.UndefOr[IntegerClass]
    var InstanceType: js.UndefOr[ESPartitionInstanceType]
    var WarmCount: js.UndefOr[IntegerClass]
    var WarmEnabled: js.UndefOr[Boolean]
    var WarmType: js.UndefOr[ESWarmPartitionInstanceType]
    var ZoneAwarenessConfig: js.UndefOr[ZoneAwarenessConfig]
    var ZoneAwarenessEnabled: js.UndefOr[Boolean]
  }

  /**
    * Specifies the configuration status for the specified Elasticsearch domain.
    */
  @js.native
  @Factory
  trait ElasticsearchClusterConfigStatus extends js.Object {
    var Options: ElasticsearchClusterConfig
    var Status: OptionStatus
  }

  /**
    * The configuration of an Elasticsearch domain.
    */
  @js.native
  @Factory
  trait ElasticsearchDomainConfig extends js.Object {
    var AccessPolicies: js.UndefOr[AccessPoliciesStatus]
    var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus]
    var CognitoOptions: js.UndefOr[CognitoOptionsStatus]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus]
    var EBSOptions: js.UndefOr[EBSOptionsStatus]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus]
    var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus]
    var VPCOptions: js.UndefOr[VPCDerivedInfoStatus]
  }

  /**
    * The current status of an Elasticsearch domain.
    */
  @js.native
  @Factory
  trait ElasticsearchDomainStatus extends js.Object {
    var ARN: ARN
    var DomainId: DomainId
    var DomainName: DomainName
    var ElasticsearchClusterConfig: ElasticsearchClusterConfig
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptions]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var Created: js.UndefOr[Boolean]
    var Deleted: js.UndefOr[Boolean]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var Endpoint: js.UndefOr[ServiceUrl]
    var Endpoints: js.UndefOr[EndpointsMap]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var Processing: js.UndefOr[Boolean]
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var UpgradeProcessing: js.UndefOr[Boolean]
    var VPCOptions: js.UndefOr[VPCDerivedInfo]
  }

  /**
    * Status of the Elasticsearch version options for the specified Elasticsearch domain.
    */
  @js.native
  @Factory
  trait ElasticsearchVersionStatus extends js.Object {
    var Options: ElasticsearchVersionString
    var Status: OptionStatus
  }

  /**
    * Specifies the Encryption At Rest Options.
    */
  @js.native
  @Factory
  trait EncryptionAtRestOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Status of the Encryption At Rest options for the specified Elasticsearch domain.
    */
  @js.native
  @Factory
  trait EncryptionAtRestOptionsStatus extends js.Object {
    var Options: EncryptionAtRestOptions
    var Status: OptionStatus
  }

  /**
    * Container for request parameters to <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
    */
  @js.native
  @Factory
  trait GetCompatibleElasticsearchVersionsRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  /**
    * Container for response returned by <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
    */
  @js.native
  @Factory
  trait GetCompatibleElasticsearchVersionsResponse extends js.Object {
    var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList]
  }

  /**
    * Container for request parameters to <code> <a>GetUpgradeHistory</a> </code> operation.
    */
  @js.native
  @Factory
  trait GetUpgradeHistoryRequest extends js.Object {
    var DomainName: DomainName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Container for response returned by <code> <a>GetUpgradeHistory</a> </code> operation.
    */
  @js.native
  @Factory
  trait GetUpgradeHistoryResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var UpgradeHistories: js.UndefOr[UpgradeHistoryList]
  }

  /**
    * Container for request parameters to <code> <a>GetUpgradeStatus</a> </code> operation.
    */
  @js.native
  @Factory
  trait GetUpgradeStatusRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * Container for response returned by <code> <a>GetUpgradeStatus</a> </code> operation.
    */
  @js.native
  @Factory
  trait GetUpgradeStatusResponse extends js.Object {
    var StepStatus: js.UndefOr[UpgradeStatus]
    var UpgradeName: js.UndefOr[UpgradeName]
    var UpgradeStep: js.UndefOr[UpgradeStep]
  }

  /**
    * InstanceCountLimits represents the limits on number of instances that be created in Amazon Elasticsearch for given InstanceType.
    */
  @js.native
  @Factory
  trait InstanceCountLimits extends js.Object {
    var MaximumInstanceCount: js.UndefOr[MaximumInstanceCount]
    var MinimumInstanceCount: js.UndefOr[MinimumInstanceCount]
  }

  /**
    * InstanceLimits represents the list of instance related attributes that are available for given InstanceType.
    */
  @js.native
  @Factory
  trait InstanceLimits extends js.Object {
    var InstanceCountLimits: js.UndefOr[InstanceCountLimits]
  }

  /**
    * Limits for given InstanceType and for each of it's role. <br/> Limits contains following <code> <a>StorageTypes,</a> </code> <code> <a>InstanceLimits</a> </code> and <code> <a>AdditionalLimits</a> </code>
    */
  @js.native
  @Factory
  trait Limits extends js.Object {
    var AdditionalLimits: js.UndefOr[AdditionalLimitList]
    var InstanceLimits: js.UndefOr[InstanceLimits]
    var StorageTypes: js.UndefOr[StorageTypeList]
  }

  /**
    * The result of a <code>ListDomainNames</code> operation. Contains the names of all Elasticsearch domains owned by this account.
    */
  @js.native
  @Factory
  trait ListDomainNamesResponse extends js.Object {
    var DomainNames: js.UndefOr[DomainInfoList]
  }

  /**
    * Container for the parameters to the <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
    */
  @js.native
  @Factory
  trait ListElasticsearchInstanceTypesRequest extends js.Object {
    var ElasticsearchVersion: ElasticsearchVersionString
    var DomainName: js.UndefOr[DomainName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Container for the parameters returned by <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
    */
  @js.native
  @Factory
  trait ListElasticsearchInstanceTypesResponse extends js.Object {
    var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Container for the parameters to the <code> <a>ListElasticsearchVersions</a> </code> operation. <p> Use <code> <a>MaxResults</a> </code> to control the maximum number of results to retrieve in a single call.
    *  Use <code> <a>NextToken</a> </code> in response to retrieve more results. If the received response does not contain a NextToken, then there are no more results to retrieve.
    *  </p>
    */
  @js.native
  @Factory
  trait ListElasticsearchVersionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Container for the parameters for response received from <code> <a>ListElasticsearchVersions</a> </code> operation.
    */
  @js.native
  @Factory
  trait ListElasticsearchVersionsResponse extends js.Object {
    var ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Container for the parameters to the <code><a>ListTags</a></code> operation. Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to view are attached.
    */
  @js.native
  @Factory
  trait ListTagsRequest extends js.Object {
    var ARN: ARN
  }

  /**
    * The result of a <code>ListTags</code> operation. Contains tags for all requested Elasticsearch domains.
    */
  @js.native
  @Factory
  trait ListTagsResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  /**
    * <p>Log Publishing option that is set for given domain. <br/>Attributes and their details:* CloudWatchLogsLogGroupArn: ARN of the Cloudwatch log group to which log needs to be published.
    *  * Enabled: Whether the log publishing for given log type is enabled or not
    * </p>
    */
  @js.native
  @Factory
  trait LogPublishingOption extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn]
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * The configured log publishing options for the domain and their current status.
    */
  @js.native
  @Factory
  trait LogPublishingOptionsStatus extends js.Object {
    var Options: js.UndefOr[LogPublishingOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  /**
    * <p>Type of Log File, it can be one of the following:* INDEX_SLOW_LOGS: Index slow logs contain insert requests that took more time than configured index query log threshold to execute.
    *  * SEARCH_SLOW_LOGS: Search slow logs contain search queries that took more time than configured search query log threshold to execute.
    *  * ES_APPLICATION_LOGS: Elasticsearch application logs contain information about errors and warnings raised during the operation of the service and can be useful for troubleshooting.
    * </p>
    */
  @js.native
  sealed trait LogType extends js.Any
  object LogType extends js.Object {
    val INDEX_SLOW_LOGS     = "INDEX_SLOW_LOGS".asInstanceOf[LogType]
    val SEARCH_SLOW_LOGS    = "SEARCH_SLOW_LOGS".asInstanceOf[LogType]
    val ES_APPLICATION_LOGS = "ES_APPLICATION_LOGS".asInstanceOf[LogType]

    val values = js.Object.freeze(js.Array(INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS))
  }

  /**
    * Credentials for the master user: username and password, ARN, or both.
    */
  @js.native
  @Factory
  trait MasterUserOptions extends js.Object {
    var MasterUserARN: js.UndefOr[ARN]
    var MasterUserName: js.UndefOr[Username]
    var MasterUserPassword: js.UndefOr[Password]
  }

  /**
    * Specifies the node-to-node encryption options.
    */
  @js.native
  @Factory
  trait NodeToNodeEncryptionOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * Status of the node-to-node encryption options for the specified Elasticsearch domain.
    */
  @js.native
  @Factory
  trait NodeToNodeEncryptionOptionsStatus extends js.Object {
    var Options: NodeToNodeEncryptionOptions
    var Status: OptionStatus
  }

  /**
    * The state of a requested change. One of the following:
    * * Processing: The request change is still in-process.
    *  * Active: The request change is processed and deployed to the Elasticsearch domain.
    */
  @js.native
  sealed trait OptionState extends js.Any
  object OptionState extends js.Object {
    val RequiresIndexDocuments = "RequiresIndexDocuments".asInstanceOf[OptionState]
    val Processing             = "Processing".asInstanceOf[OptionState]
    val Active                 = "Active".asInstanceOf[OptionState]

    val values = js.Object.freeze(js.Array(RequiresIndexDocuments, Processing, Active))
  }

  /**
    * Provides the current status of the entity.
    */
  @js.native
  @Factory
  trait OptionStatus extends js.Object {
    var CreationDate: UpdateTimestamp
    var State: OptionState
    var UpdateDate: UpdateTimestamp
    var PendingDeletion: js.UndefOr[Boolean]
    var UpdateVersion: js.UndefOr[UIntValue]
  }

  /**
    * Container for parameters to <code>PurchaseReservedElasticsearchInstanceOffering</code>
    */
  @js.native
  @Factory
  trait PurchaseReservedElasticsearchInstanceOfferingRequest extends js.Object {
    var ReservationName: ReservationToken
    var ReservedElasticsearchInstanceOfferingId: GUID
    var InstanceCount: js.UndefOr[InstanceCount]
  }

  /**
    * Represents the output of a <code>PurchaseReservedElasticsearchInstanceOffering</code> operation.
    */
  @js.native
  @Factory
  trait PurchaseReservedElasticsearchInstanceOfferingResponse extends js.Object {
    var ReservationName: js.UndefOr[ReservationToken]
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
  }

  /**
    * Contains the specific price and frequency of a recurring charges for a reserved Elasticsearch instance, or for a reserved Elasticsearch instance offering.
    */
  @js.native
  @Factory
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  /**
    * Container for the parameters to the <code><a>RemoveTags</a></code> operation. Specify the <code>ARN</code> for the Elasticsearch domain from which you want to remove the specified <code>TagKey</code>.
    */
  @js.native
  @Factory
  trait RemoveTagsRequest extends js.Object {
    var ARN: ARN
    var TagKeys: StringList
  }

  /**
    * Details of a reserved Elasticsearch instance.
    */
  @js.native
  @Factory
  trait ReservedElasticsearchInstance extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var ElasticsearchInstanceCount: js.UndefOr[Int]
    var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType]
    var FixedPrice: js.UndefOr[Double]
    var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservationName: js.UndefOr[ReservationToken]
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[String]
    var StartTime: js.UndefOr[UpdateTimestamp]
    var State: js.UndefOr[String]
    var UsagePrice: js.UndefOr[Double]
  }

  /**
    * Details of a reserved Elasticsearch instance offering.
    */
  @js.native
  @Factory
  trait ReservedElasticsearchInstanceOffering extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType]
    var FixedPrice: js.UndefOr[Double]
    var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID]
    var UsagePrice: js.UndefOr[Double]
  }

  @js.native
  sealed trait ReservedElasticsearchInstancePaymentOption extends js.Any
  object ReservedElasticsearchInstancePaymentOption extends js.Object {
    val ALL_UPFRONT     = "ALL_UPFRONT".asInstanceOf[ReservedElasticsearchInstancePaymentOption]
    val PARTIAL_UPFRONT = "PARTIAL_UPFRONT".asInstanceOf[ReservedElasticsearchInstancePaymentOption]
    val NO_UPFRONT      = "NO_UPFRONT".asInstanceOf[ReservedElasticsearchInstancePaymentOption]

    val values = js.Object.freeze(js.Array(ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT))
  }

  /**
    * The current options of an Elasticsearch domain service software options.
    */
  @js.native
  @Factory
  trait ServiceSoftwareOptions extends js.Object {
    var AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp]
    var Cancellable: js.UndefOr[Boolean]
    var CurrentVersion: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var NewVersion: js.UndefOr[String]
    var UpdateAvailable: js.UndefOr[Boolean]
    var UpdateStatus: js.UndefOr[DeploymentStatus]
  }

  /**
    * Specifies the time, in UTC format, when the service takes a daily automated snapshot of the specified Elasticsearch domain. Default value is <code>0</code> hours.
    */
  @js.native
  @Factory
  trait SnapshotOptions extends js.Object {
    var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass]
  }

  /**
    * Status of a daily automated snapshot.
    */
  @js.native
  @Factory
  trait SnapshotOptionsStatus extends js.Object {
    var Options: SnapshotOptions
    var Status: OptionStatus
  }

  /**
    * Container for the parameters to the <code><a>StartElasticsearchServiceSoftwareUpdate</a></code> operation. Specifies the name of the Elasticsearch domain that you wish to schedule a service software update on.
    */
  @js.native
  @Factory
  trait StartElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: DomainName
  }

  /**
    * The result of a <code>StartElasticsearchServiceSoftwareUpdate</code> operation. Contains the status of the update.
    */
  @js.native
  @Factory
  trait StartElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  /**
    * StorageTypes represents the list of storage related types and their attributes that are available for given InstanceType.
    */
  @js.native
  @Factory
  trait StorageType extends js.Object {
    var StorageSubTypeName: js.UndefOr[StorageSubTypeName]
    var StorageTypeLimits: js.UndefOr[StorageTypeLimitList]
    var StorageTypeName: js.UndefOr[StorageTypeName]
  }

  /**
    * Limits that are applicable for given storage type.
    */
  @js.native
  @Factory
  trait StorageTypeLimit extends js.Object {
    var LimitName: js.UndefOr[LimitName]
    var LimitValues: js.UndefOr[LimitValueList]
  }

  @js.native
  sealed trait TLSSecurityPolicy extends js.Any
  object TLSSecurityPolicy extends js.Object {
    val `Policy-Min-TLS-1-0-2019-07` = "Policy-Min-TLS-1-0-2019-07".asInstanceOf[TLSSecurityPolicy]
    val `Policy-Min-TLS-1-2-2019-07` = "Policy-Min-TLS-1-2-2019-07".asInstanceOf[TLSSecurityPolicy]

    val values = js.Object.freeze(js.Array(`Policy-Min-TLS-1-0-2019-07`, `Policy-Min-TLS-1-2-2019-07`))
  }

  /**
    * Specifies a key value pair for a resource tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  /**
    * Container for the parameters to the <code><a>UpdateElasticsearchDomain</a></code> operation. Specifies the type and number of instances in the domain cluster.
    */
  @js.native
  @Factory
  trait UpdateElasticsearchDomainConfigRequest extends js.Object {
    var DomainName: DomainName
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var DomainEndpointOptions: js.UndefOr[DomainEndpointOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var VPCOptions: js.UndefOr[VPCOptions]
  }

  /**
    * The result of an <code>UpdateElasticsearchDomain</code> request. Contains the status of the Elasticsearch domain being updated.
    */
  @js.native
  @Factory
  trait UpdateElasticsearchDomainConfigResponse extends js.Object {
    var DomainConfig: ElasticsearchDomainConfig
  }

  /**
    * Container for request parameters to <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
    */
  @js.native
  @Factory
  trait UpgradeElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
    var TargetVersion: ElasticsearchVersionString
    var PerformCheckOnly: js.UndefOr[Boolean]
  }

  /**
    * Container for response returned by <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
    */
  @js.native
  @Factory
  trait UpgradeElasticsearchDomainResponse extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var PerformCheckOnly: js.UndefOr[Boolean]
    var TargetVersion: js.UndefOr[ElasticsearchVersionString]
  }

  /**
    * History of the last 10 Upgrades and Upgrade Eligibility Checks.
    */
  @js.native
  @Factory
  trait UpgradeHistory extends js.Object {
    var StartTimestamp: js.UndefOr[StartTimestamp]
    var StepsList: js.UndefOr[UpgradeStepsList]
    var UpgradeName: js.UndefOr[UpgradeName]
    var UpgradeStatus: js.UndefOr[UpgradeStatus]
  }

  @js.native
  sealed trait UpgradeStatus extends js.Any
  object UpgradeStatus extends js.Object {
    val IN_PROGRESS           = "IN_PROGRESS".asInstanceOf[UpgradeStatus]
    val SUCCEEDED             = "SUCCEEDED".asInstanceOf[UpgradeStatus]
    val SUCCEEDED_WITH_ISSUES = "SUCCEEDED_WITH_ISSUES".asInstanceOf[UpgradeStatus]
    val FAILED                = "FAILED".asInstanceOf[UpgradeStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES, FAILED))
  }

  @js.native
  sealed trait UpgradeStep extends js.Any
  object UpgradeStep extends js.Object {
    val PRE_UPGRADE_CHECK = "PRE_UPGRADE_CHECK".asInstanceOf[UpgradeStep]
    val SNAPSHOT          = "SNAPSHOT".asInstanceOf[UpgradeStep]
    val UPGRADE           = "UPGRADE".asInstanceOf[UpgradeStep]

    val values = js.Object.freeze(js.Array(PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE))
  }

  /**
    * Represents a single step of the Upgrade or Upgrade Eligibility Check workflow.
    */
  @js.native
  @Factory
  trait UpgradeStepItem extends js.Object {
    var Issues: js.UndefOr[Issues]
    var ProgressPercent: js.UndefOr[Double]
    var UpgradeStep: js.UndefOr[UpgradeStep]
    var UpgradeStepStatus: js.UndefOr[UpgradeStatus]
  }

  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank"> VPC Endpoints for Amazon Elasticsearch Service Domains</a>.
    */
  @js.native
  @Factory
  trait VPCDerivedInfo extends js.Object {
    var AvailabilityZones: js.UndefOr[StringList]
    var SecurityGroupIds: js.UndefOr[StringList]
    var SubnetIds: js.UndefOr[StringList]
    var VPCId: js.UndefOr[String]
  }

  /**
    * Status of the VPC options for the specified Elasticsearch domain.
    */
  @js.native
  @Factory
  trait VPCDerivedInfoStatus extends js.Object {
    var Options: VPCDerivedInfo
    var Status: OptionStatus
  }

  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank"> VPC Endpoints for Amazon Elasticsearch Service Domains</a>.
    */
  @js.native
  @Factory
  trait VPCOptions extends js.Object {
    var SecurityGroupIds: js.UndefOr[StringList]
    var SubnetIds: js.UndefOr[StringList]
  }

  /**
    * The type of EBS volume, standard, gp2, or io1. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank">Configuring EBS-based Storage</a>for more information.
    */
  @js.native
  sealed trait VolumeType extends js.Any
  object VolumeType extends js.Object {
    val standard = "standard".asInstanceOf[VolumeType]
    val gp2      = "gp2".asInstanceOf[VolumeType]
    val io1      = "io1".asInstanceOf[VolumeType]

    val values = js.Object.freeze(js.Array(standard, gp2, io1))
  }

  /**
    * Specifies the zone awareness configuration for the domain cluster, such as the number of availability zones.
    */
  @js.native
  @Factory
  trait ZoneAwarenessConfig extends js.Object {
    var AvailabilityZoneCount: js.UndefOr[IntegerClass]
  }
}
