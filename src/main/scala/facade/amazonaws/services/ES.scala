package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object es {
  type ARN = String
  type AdditionalLimitList = js.Array[AdditionalLimit]
  type AdvancedOptions = js.Dictionary[String]
  type CloudWatchLogsLogGroupArn = String
  type CompatibleElasticsearchVersionsList = js.Array[CompatibleVersionsMap]
  type DeploymentCloseDateTimeStamp = js.Date
  type DeploymentStatus = String
  type DomainId = String
  type DomainInfoList = js.Array[DomainInfo]
  type DomainName = String
  type DomainNameList = js.Array[DomainName]
  type ESPartitionInstanceType = String
  type ElasticsearchDomainStatusList = js.Array[ElasticsearchDomainStatus]
  type ElasticsearchInstanceTypeList = js.Array[ESPartitionInstanceType]
  type ElasticsearchVersionList = js.Array[ElasticsearchVersionString]
  type ElasticsearchVersionString = String
  type EndpointsMap = js.Dictionary[ServiceUrl]
  type GUID = String
  type IdentityPoolId = String
  type InstanceCount = Int
  type InstanceRole = String
  type IntegerClass = Int
  type Issue = String
  type Issues = js.Array[Issue]
  type KmsKeyId = String
  type LimitName = String
  type LimitValue = String
  type LimitValueList = js.Array[LimitValue]
  type LimitsByRole = js.Dictionary[Limits]
  type LogPublishingOptions = js.Dictionary[LogPublishingOption]
  type LogType = String
  type MaxResults = Int
  type MaximumInstanceCount = Int
  type MinimumInstanceCount = Int
  type NextToken = String
  type OptionState = String
  type PolicyDocument = String
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservationToken = String
  type ReservedElasticsearchInstanceList = js.Array[ReservedElasticsearchInstance]
  type ReservedElasticsearchInstanceOfferingList = js.Array[ReservedElasticsearchInstanceOffering]
  type ReservedElasticsearchInstancePaymentOption = String
  type RoleArn = String
  type ServiceUrl = String
  type StartTimestamp = js.Date
  type StorageSubTypeName = String
  type StorageTypeLimitList = js.Array[StorageTypeLimit]
  type StorageTypeList = js.Array[StorageType]
  type StorageTypeName = String
  type StringList = js.Array[String]
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type UIntValue = Int
  type UpdateTimestamp = js.Date
  type UpgradeHistoryList = js.Array[UpgradeHistory]
  type UpgradeName = String
  type UpgradeStatus = String
  type UpgradeStep = String
  type UpgradeStepsList = js.Array[UpgradeStepItem]
  type UserPoolId = String
  type VolumeType = String
}

package es {
  @js.native
  @JSImport("aws-sdk", "ES")
  class ES(config: AWSConfig) extends js.Object {
    def addTags(params: AddTagsRequest): Request[js.Object] = js.native
    def cancelElasticsearchServiceSoftwareUpdate(params: CancelElasticsearchServiceSoftwareUpdateRequest): Request[CancelElasticsearchServiceSoftwareUpdateResponse] = js.native
    def createElasticsearchDomain(params: CreateElasticsearchDomainRequest): Request[CreateElasticsearchDomainResponse] = js.native
    def deleteElasticsearchDomain(params: DeleteElasticsearchDomainRequest): Request[DeleteElasticsearchDomainResponse] = js.native
    def deleteElasticsearchServiceRole(): Request[js.Object] = js.native
    def describeElasticsearchDomain(params: DescribeElasticsearchDomainRequest): Request[DescribeElasticsearchDomainResponse] = js.native
    def describeElasticsearchDomainConfig(params: DescribeElasticsearchDomainConfigRequest): Request[DescribeElasticsearchDomainConfigResponse] = js.native
    def describeElasticsearchDomains(params: DescribeElasticsearchDomainsRequest): Request[DescribeElasticsearchDomainsResponse] = js.native
    def describeElasticsearchInstanceTypeLimits(params: DescribeElasticsearchInstanceTypeLimitsRequest): Request[DescribeElasticsearchInstanceTypeLimitsResponse] = js.native
    def describeReservedElasticsearchInstanceOfferings(params: DescribeReservedElasticsearchInstanceOfferingsRequest): Request[DescribeReservedElasticsearchInstanceOfferingsResponse] = js.native
    def describeReservedElasticsearchInstances(params: DescribeReservedElasticsearchInstancesRequest): Request[DescribeReservedElasticsearchInstancesResponse] = js.native
    def getCompatibleElasticsearchVersions(params: GetCompatibleElasticsearchVersionsRequest): Request[GetCompatibleElasticsearchVersionsResponse] = js.native
    def getUpgradeHistory(params: GetUpgradeHistoryRequest): Request[GetUpgradeHistoryResponse] = js.native
    def getUpgradeStatus(params: GetUpgradeStatusRequest): Request[GetUpgradeStatusResponse] = js.native
    def listDomainNames(): Request[ListDomainNamesResponse] = js.native
    def listElasticsearchInstanceTypes(params: ListElasticsearchInstanceTypesRequest): Request[ListElasticsearchInstanceTypesResponse] = js.native
    def listElasticsearchVersions(params: ListElasticsearchVersionsRequest): Request[ListElasticsearchVersionsResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def purchaseReservedElasticsearchInstanceOffering(params: PurchaseReservedElasticsearchInstanceOfferingRequest): Request[PurchaseReservedElasticsearchInstanceOfferingResponse] = js.native
    def removeTags(params: RemoveTagsRequest): Request[js.Object] = js.native
    def startElasticsearchServiceSoftwareUpdate(params: StartElasticsearchServiceSoftwareUpdateRequest): Request[StartElasticsearchServiceSoftwareUpdateResponse] = js.native
    def updateElasticsearchDomainConfig(params: UpdateElasticsearchDomainConfigRequest): Request[UpdateElasticsearchDomainConfigResponse] = js.native
    def upgradeElasticsearchDomain(params: UpgradeElasticsearchDomainRequest): Request[UpgradeElasticsearchDomainResponse] = js.native
  }

  /**
   * <p>The configured access rules for the domain's document and search endpoints, and the current status of those rules.</p>
   */
  @js.native
  trait AccessPoliciesStatus extends js.Object {
    var Options: js.UndefOr[PolicyDocument]
    var Status: js.UndefOr[OptionStatus]
  }

  object AccessPoliciesStatus {
    def apply(
      Options: js.UndefOr[PolicyDocument] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): AccessPoliciesStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccessPoliciesStatus]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>AddTags</a></code> operation. Specify the tags that you want to attach to the Elasticsearch domain.</p>
   */
  @js.native
  trait AddTagsRequest extends js.Object {
    var ARN: js.UndefOr[ARN]
    var TagList: js.UndefOr[TagList]
  }

  object AddTagsRequest {
    def apply(
      ARN: js.UndefOr[ARN] = js.undefined,
      TagList: js.UndefOr[TagList] = js.undefined): AddTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsRequest]
    }
  }

  /**
   * <p> List of limits that are specific to a given InstanceType and for each of it's <code> <a>InstanceRole</a> </code> . </p>
   */
  @js.native
  trait AdditionalLimit extends js.Object {
    var LimitName: js.UndefOr[LimitName]
    var LimitValues: js.UndefOr[LimitValueList]
  }

  object AdditionalLimit {
    def apply(
      LimitName: js.UndefOr[LimitName] = js.undefined,
      LimitValues: js.UndefOr[LimitValueList] = js.undefined): AdditionalLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LimitName" -> LimitName.map { x => x.asInstanceOf[js.Any] },
        "LimitValues" -> LimitValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdditionalLimit]
    }
  }

  /**
   * <p> Status of the advanced options for the specified Elasticsearch domain. Currently, the following advanced options are available:</p> <ul> <li>Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access to individual sub-resources. By default, the value is <code>true</code>. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options" target="_blank">Configuration Advanced Options</a> for more information.</li> <li>Option to specify the percentage of heap space that is allocated to field data. By default, this setting is unbounded.</li> </ul> <p>For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options">Configuring Advanced Options</a>.</p>
   */
  @js.native
  trait AdvancedOptionsStatus extends js.Object {
    var Options: js.UndefOr[AdvancedOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  object AdvancedOptionsStatus {
    def apply(
      Options: js.UndefOr[AdvancedOptions] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): AdvancedOptionsStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AdvancedOptionsStatus]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>CancelElasticsearchServiceSoftwareUpdate</a></code> operation. Specifies the name of the Elasticsearch domain that you wish to cancel a service software update on.</p>
   */
  @js.native
  trait CancelElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object CancelElasticsearchServiceSoftwareUpdateRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined): CancelElasticsearchServiceSoftwareUpdateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelElasticsearchServiceSoftwareUpdateRequest]
    }
  }

  /**
   * <p>The result of a <code>CancelElasticsearchServiceSoftwareUpdate</code> operation. Contains the status of the update.</p>
   */
  @js.native
  trait CancelElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  object CancelElasticsearchServiceSoftwareUpdateResponse {
    def apply(
      ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined): CancelElasticsearchServiceSoftwareUpdateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceSoftwareOptions" -> ServiceSoftwareOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelElasticsearchServiceSoftwareUpdateResponse]
    }
  }

  /**
   * <p>Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html" target="_blank">Amazon Cognito Authentication for Kibana</a>.</p>
   */
  @js.native
  trait CognitoOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var UserPoolId: js.UndefOr[UserPoolId]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object CognitoOptions {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined,
      UserPoolId: js.UndefOr[UserPoolId] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      RoleArn: js.UndefOr[RoleArn] = js.undefined): CognitoOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "UserPoolId" -> UserPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "RoleArn" -> RoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CognitoOptions]
    }
  }

  /**
   * <p>Status of the Cognito options for the specified Elasticsearch domain.</p>
   */
  @js.native
  trait CognitoOptionsStatus extends js.Object {
    var Options: js.UndefOr[CognitoOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  object CognitoOptionsStatus {
    def apply(
      Options: js.UndefOr[CognitoOptions] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): CognitoOptionsStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CognitoOptionsStatus]
    }
  }

  /**
   * <p> A map from an <code> <a>ElasticsearchVersion</a> </code> to a list of compatible <code> <a>ElasticsearchVersion</a> </code> s to which the domain can be upgraded. </p>
   */
  @js.native
  trait CompatibleVersionsMap extends js.Object {
    var SourceVersion: js.UndefOr[ElasticsearchVersionString]
    var TargetVersions: js.UndefOr[ElasticsearchVersionList]
  }

  object CompatibleVersionsMap {
    def apply(
      SourceVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
      TargetVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined): CompatibleVersionsMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceVersion" -> SourceVersion.map { x => x.asInstanceOf[js.Any] },
        "TargetVersions" -> TargetVersions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CompatibleVersionsMap]
    }
  }

  @js.native
  trait CreateElasticsearchDomainRequest extends js.Object {
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var VPCOptions: js.UndefOr[VPCOptions]
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var DomainName: js.UndefOr[DomainName]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString]
    var CognitoOptions: js.UndefOr[CognitoOptions]
  }

  object CreateElasticsearchDomainRequest {
    def apply(
      EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
      VPCOptions: js.UndefOr[VPCOptions] = js.undefined,
      AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
      ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined,
      AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
      NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
      EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
      SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
      ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
      CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined): CreateElasticsearchDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionAtRestOptions" -> EncryptionAtRestOptions.map { x => x.asInstanceOf[js.Any] },
        "VPCOptions" -> VPCOptions.map { x => x.asInstanceOf[js.Any] },
        "AccessPolicies" -> AccessPolicies.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchClusterConfig" -> ElasticsearchClusterConfig.map { x => x.asInstanceOf[js.Any] },
        "AdvancedOptions" -> AdvancedOptions.map { x => x.asInstanceOf[js.Any] },
        "NodeToNodeEncryptionOptions" -> NodeToNodeEncryptionOptions.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "LogPublishingOptions" -> LogPublishingOptions.map { x => x.asInstanceOf[js.Any] },
        "EBSOptions" -> EBSOptions.map { x => x.asInstanceOf[js.Any] },
        "SnapshotOptions" -> SnapshotOptions.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchVersion" -> ElasticsearchVersion.map { x => x.asInstanceOf[js.Any] },
        "CognitoOptions" -> CognitoOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateElasticsearchDomainRequest]
    }
  }

  /**
   * <p>The result of a <code>CreateElasticsearchDomain</code> operation. Contains the status of the newly created Elasticsearch domain.</p>
   */
  @js.native
  trait CreateElasticsearchDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus]
  }

  object CreateElasticsearchDomainResponse {
    def apply(
      DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined): CreateElasticsearchDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainStatus" -> DomainStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateElasticsearchDomainResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DeleteElasticsearchDomain</a></code> operation. Specifies the name of the Elasticsearch domain that you want to delete.</p>
   */
  @js.native
  trait DeleteElasticsearchDomainRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object DeleteElasticsearchDomainRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined): DeleteElasticsearchDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteElasticsearchDomainRequest]
    }
  }

  /**
   * <p>The result of a <code>DeleteElasticsearchDomain</code> request. Contains the status of the pending deletion, or no status if the domain and all of its resources have been deleted.</p>
   */
  @js.native
  trait DeleteElasticsearchDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus]
  }

  object DeleteElasticsearchDomainResponse {
    def apply(
      DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined): DeleteElasticsearchDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainStatus" -> DomainStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteElasticsearchDomainResponse]
    }
  }

  object DeploymentStatusEnum {
    val PENDING_UPDATE = "PENDING_UPDATE"
    val IN_PROGRESS = "IN_PROGRESS"
    val COMPLETED = "COMPLETED"
    val NOT_ELIGIBLE = "NOT_ELIGIBLE"
    val ELIGIBLE = "ELIGIBLE"

    val values = IndexedSeq(PENDING_UPDATE, IN_PROGRESS, COMPLETED, NOT_ELIGIBLE, ELIGIBLE)
  }

  /**
   * <p> Container for the parameters to the <code>DescribeElasticsearchDomainConfig</code> operation. Specifies the domain name for which you want configuration information.</p>
   */
  @js.native
  trait DescribeElasticsearchDomainConfigRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object DescribeElasticsearchDomainConfigRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined): DescribeElasticsearchDomainConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticsearchDomainConfigRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeElasticsearchDomainConfig</code> request. Contains the configuration information of the requested domain.</p>
   */
  @js.native
  trait DescribeElasticsearchDomainConfigResponse extends js.Object {
    var DomainConfig: js.UndefOr[ElasticsearchDomainConfig]
  }

  object DescribeElasticsearchDomainConfigResponse {
    def apply(
      DomainConfig: js.UndefOr[ElasticsearchDomainConfig] = js.undefined): DescribeElasticsearchDomainConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainConfig" -> DomainConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticsearchDomainConfigResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeElasticsearchDomain</a></code> operation.</p>
   */
  @js.native
  trait DescribeElasticsearchDomainRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object DescribeElasticsearchDomainRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined): DescribeElasticsearchDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticsearchDomainRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeElasticsearchDomain</code> request. Contains the status of the domain specified in the request.</p>
   */
  @js.native
  trait DescribeElasticsearchDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus]
  }

  object DescribeElasticsearchDomainResponse {
    def apply(
      DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined): DescribeElasticsearchDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainStatus" -> DomainStatus.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticsearchDomainResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>DescribeElasticsearchDomains</a></code> operation. By default, the API returns the status of all Elasticsearch domains.</p>
   */
  @js.native
  trait DescribeElasticsearchDomainsRequest extends js.Object {
    var DomainNames: js.UndefOr[DomainNameList]
  }

  object DescribeElasticsearchDomainsRequest {
    def apply(
      DomainNames: js.UndefOr[DomainNameList] = js.undefined): DescribeElasticsearchDomainsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainNames" -> DomainNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticsearchDomainsRequest]
    }
  }

  /**
   * <p>The result of a <code>DescribeElasticsearchDomains</code> request. Contains the status of the specified domains or all domains owned by the account.</p>
   */
  @js.native
  trait DescribeElasticsearchDomainsResponse extends js.Object {
    var DomainStatusList: js.UndefOr[ElasticsearchDomainStatusList]
  }

  object DescribeElasticsearchDomainsResponse {
    def apply(
      DomainStatusList: js.UndefOr[ElasticsearchDomainStatusList] = js.undefined): DescribeElasticsearchDomainsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainStatusList" -> DomainStatusList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticsearchDomainsResponse]
    }
  }

  /**
   * <p> Container for the parameters to <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation. </p>
   */
  @js.native
  trait DescribeElasticsearchInstanceTypeLimitsRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var InstanceType: js.UndefOr[ESPartitionInstanceType]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString]
  }

  object DescribeElasticsearchInstanceTypeLimitsRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      InstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
      ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined): DescribeElasticsearchInstanceTypeLimitsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchVersion" -> ElasticsearchVersion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticsearchInstanceTypeLimitsRequest]
    }
  }

  /**
   * <p> Container for the parameters received from <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation. </p>
   */
  @js.native
  trait DescribeElasticsearchInstanceTypeLimitsResponse extends js.Object {
    var LimitsByRole: js.UndefOr[LimitsByRole]
  }

  object DescribeElasticsearchInstanceTypeLimitsResponse {
    def apply(
      LimitsByRole: js.UndefOr[LimitsByRole] = js.undefined): DescribeElasticsearchInstanceTypeLimitsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LimitsByRole" -> LimitsByRole.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeElasticsearchInstanceTypeLimitsResponse]
    }
  }

  /**
   * <p>Container for parameters to <code>DescribeReservedElasticsearchInstanceOfferings</code></p>
   */
  @js.native
  trait DescribeReservedElasticsearchInstanceOfferingsRequest extends js.Object {
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeReservedElasticsearchInstanceOfferingsRequest {
    def apply(
      ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeReservedElasticsearchInstanceOfferingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedElasticsearchInstanceOfferingId" -> ReservedElasticsearchInstanceOfferingId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsRequest]
    }
  }

  /**
   * <p>Container for results from <code>DescribeReservedElasticsearchInstanceOfferings</code></p>
   */
  @js.native
  trait DescribeReservedElasticsearchInstanceOfferingsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList]
  }

  object DescribeReservedElasticsearchInstanceOfferingsResponse {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.undefined): DescribeReservedElasticsearchInstanceOfferingsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ReservedElasticsearchInstanceOfferings" -> ReservedElasticsearchInstanceOfferings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsResponse]
    }
  }

  /**
   * <p>Container for parameters to <code>DescribeReservedElasticsearchInstances</code></p>
   */
  @js.native
  trait DescribeReservedElasticsearchInstancesRequest extends js.Object {
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeReservedElasticsearchInstancesRequest {
    def apply(
      ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): DescribeReservedElasticsearchInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedElasticsearchInstanceId" -> ReservedElasticsearchInstanceId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedElasticsearchInstancesRequest]
    }
  }

  /**
   * <p>Container for results from <code>DescribeReservedElasticsearchInstances</code></p>
   */
  @js.native
  trait DescribeReservedElasticsearchInstancesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList]
  }

  object DescribeReservedElasticsearchInstancesResponse {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.undefined): DescribeReservedElasticsearchInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ReservedElasticsearchInstances" -> ReservedElasticsearchInstances.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedElasticsearchInstancesResponse]
    }
  }

  @js.native
  trait DomainInfo extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object DomainInfo {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined): DomainInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainInfo]
    }
  }

  /**
   * <p>Options to enable, disable, and specify the properties of EBS storage volumes. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank"> Configuring EBS-based Storage</a>.</p>
   */
  @js.native
  trait EBSOptions extends js.Object {
    var EBSEnabled: js.UndefOr[Boolean]
    var VolumeType: js.UndefOr[VolumeType]
    var VolumeSize: js.UndefOr[IntegerClass]
    var Iops: js.UndefOr[IntegerClass]
  }

  object EBSOptions {
    def apply(
      EBSEnabled: js.UndefOr[Boolean] = js.undefined,
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      VolumeSize: js.UndefOr[IntegerClass] = js.undefined,
      Iops: js.UndefOr[IntegerClass] = js.undefined): EBSOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EBSEnabled" -> EBSEnabled.map { x => x.asInstanceOf[js.Any] },
        "VolumeType" -> VolumeType.map { x => x.asInstanceOf[js.Any] },
        "VolumeSize" -> VolumeSize.map { x => x.asInstanceOf[js.Any] },
        "Iops" -> Iops.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EBSOptions]
    }
  }

  /**
   * <p> Status of the EBS options for the specified Elasticsearch domain.</p>
   */
  @js.native
  trait EBSOptionsStatus extends js.Object {
    var Options: js.UndefOr[EBSOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  object EBSOptionsStatus {
    def apply(
      Options: js.UndefOr[EBSOptions] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): EBSOptionsStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EBSOptionsStatus]
    }
  }

  object ESPartitionInstanceTypeEnum {
    val `m3.medium.elasticsearch` = "m3.medium.elasticsearch"
    val `m3.large.elasticsearch` = "m3.large.elasticsearch"
    val `m3.xlarge.elasticsearch` = "m3.xlarge.elasticsearch"
    val `m3.2xlarge.elasticsearch` = "m3.2xlarge.elasticsearch"
    val `m4.large.elasticsearch` = "m4.large.elasticsearch"
    val `m4.xlarge.elasticsearch` = "m4.xlarge.elasticsearch"
    val `m4.2xlarge.elasticsearch` = "m4.2xlarge.elasticsearch"
    val `m4.4xlarge.elasticsearch` = "m4.4xlarge.elasticsearch"
    val `m4.10xlarge.elasticsearch` = "m4.10xlarge.elasticsearch"
    val `t2.micro.elasticsearch` = "t2.micro.elasticsearch"
    val `t2.small.elasticsearch` = "t2.small.elasticsearch"
    val `t2.medium.elasticsearch` = "t2.medium.elasticsearch"
    val `r3.large.elasticsearch` = "r3.large.elasticsearch"
    val `r3.xlarge.elasticsearch` = "r3.xlarge.elasticsearch"
    val `r3.2xlarge.elasticsearch` = "r3.2xlarge.elasticsearch"
    val `r3.4xlarge.elasticsearch` = "r3.4xlarge.elasticsearch"
    val `r3.8xlarge.elasticsearch` = "r3.8xlarge.elasticsearch"
    val `i2.xlarge.elasticsearch` = "i2.xlarge.elasticsearch"
    val `i2.2xlarge.elasticsearch` = "i2.2xlarge.elasticsearch"
    val `d2.xlarge.elasticsearch` = "d2.xlarge.elasticsearch"
    val `d2.2xlarge.elasticsearch` = "d2.2xlarge.elasticsearch"
    val `d2.4xlarge.elasticsearch` = "d2.4xlarge.elasticsearch"
    val `d2.8xlarge.elasticsearch` = "d2.8xlarge.elasticsearch"
    val `c4.large.elasticsearch` = "c4.large.elasticsearch"
    val `c4.xlarge.elasticsearch` = "c4.xlarge.elasticsearch"
    val `c4.2xlarge.elasticsearch` = "c4.2xlarge.elasticsearch"
    val `c4.4xlarge.elasticsearch` = "c4.4xlarge.elasticsearch"
    val `c4.8xlarge.elasticsearch` = "c4.8xlarge.elasticsearch"
    val `r4.large.elasticsearch` = "r4.large.elasticsearch"
    val `r4.xlarge.elasticsearch` = "r4.xlarge.elasticsearch"
    val `r4.2xlarge.elasticsearch` = "r4.2xlarge.elasticsearch"
    val `r4.4xlarge.elasticsearch` = "r4.4xlarge.elasticsearch"
    val `r4.8xlarge.elasticsearch` = "r4.8xlarge.elasticsearch"
    val `r4.16xlarge.elasticsearch` = "r4.16xlarge.elasticsearch"
    val `i3.large.elasticsearch` = "i3.large.elasticsearch"
    val `i3.xlarge.elasticsearch` = "i3.xlarge.elasticsearch"
    val `i3.2xlarge.elasticsearch` = "i3.2xlarge.elasticsearch"
    val `i3.4xlarge.elasticsearch` = "i3.4xlarge.elasticsearch"
    val `i3.8xlarge.elasticsearch` = "i3.8xlarge.elasticsearch"
    val `i3.16xlarge.elasticsearch` = "i3.16xlarge.elasticsearch"

    val values = IndexedSeq(`m3.medium.elasticsearch`, `m3.large.elasticsearch`, `m3.xlarge.elasticsearch`, `m3.2xlarge.elasticsearch`, `m4.large.elasticsearch`, `m4.xlarge.elasticsearch`, `m4.2xlarge.elasticsearch`, `m4.4xlarge.elasticsearch`, `m4.10xlarge.elasticsearch`, `t2.micro.elasticsearch`, `t2.small.elasticsearch`, `t2.medium.elasticsearch`, `r3.large.elasticsearch`, `r3.xlarge.elasticsearch`, `r3.2xlarge.elasticsearch`, `r3.4xlarge.elasticsearch`, `r3.8xlarge.elasticsearch`, `i2.xlarge.elasticsearch`, `i2.2xlarge.elasticsearch`, `d2.xlarge.elasticsearch`, `d2.2xlarge.elasticsearch`, `d2.4xlarge.elasticsearch`, `d2.8xlarge.elasticsearch`, `c4.large.elasticsearch`, `c4.xlarge.elasticsearch`, `c4.2xlarge.elasticsearch`, `c4.4xlarge.elasticsearch`, `c4.8xlarge.elasticsearch`, `r4.large.elasticsearch`, `r4.xlarge.elasticsearch`, `r4.2xlarge.elasticsearch`, `r4.4xlarge.elasticsearch`, `r4.8xlarge.elasticsearch`, `r4.16xlarge.elasticsearch`, `i3.large.elasticsearch`, `i3.xlarge.elasticsearch`, `i3.2xlarge.elasticsearch`, `i3.4xlarge.elasticsearch`, `i3.8xlarge.elasticsearch`, `i3.16xlarge.elasticsearch`)
  }

  /**
   * <p>Specifies the configuration for the domain cluster, such as the type and number of instances.</p>
   */
  @js.native
  trait ElasticsearchClusterConfig extends js.Object {
    var DedicatedMasterType: js.UndefOr[ESPartitionInstanceType]
    var DedicatedMasterEnabled: js.UndefOr[Boolean]
    var DedicatedMasterCount: js.UndefOr[IntegerClass]
    var InstanceCount: js.UndefOr[IntegerClass]
    var InstanceType: js.UndefOr[ESPartitionInstanceType]
    var ZoneAwarenessEnabled: js.UndefOr[Boolean]
  }

  object ElasticsearchClusterConfig {
    def apply(
      DedicatedMasterType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
      DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
      DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined,
      InstanceCount: js.UndefOr[IntegerClass] = js.undefined,
      InstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
      ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined): ElasticsearchClusterConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DedicatedMasterType" -> DedicatedMasterType.map { x => x.asInstanceOf[js.Any] },
        "DedicatedMasterEnabled" -> DedicatedMasterEnabled.map { x => x.asInstanceOf[js.Any] },
        "DedicatedMasterCount" -> DedicatedMasterCount.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "InstanceType" -> InstanceType.map { x => x.asInstanceOf[js.Any] },
        "ZoneAwarenessEnabled" -> ZoneAwarenessEnabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchClusterConfig]
    }
  }

  /**
   * <p> Specifies the configuration status for the specified Elasticsearch domain.</p>
   */
  @js.native
  trait ElasticsearchClusterConfigStatus extends js.Object {
    var Options: js.UndefOr[ElasticsearchClusterConfig]
    var Status: js.UndefOr[OptionStatus]
  }

  object ElasticsearchClusterConfigStatus {
    def apply(
      Options: js.UndefOr[ElasticsearchClusterConfig] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): ElasticsearchClusterConfigStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchClusterConfigStatus]
    }
  }

  /**
   * <p>The configuration of an Elasticsearch domain.</p>
   */
  @js.native
  trait ElasticsearchDomainConfig extends js.Object {
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus]
    var VPCOptions: js.UndefOr[VPCDerivedInfoStatus]
    var AccessPolicies: js.UndefOr[AccessPoliciesStatus]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus]
    var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus]
    var EBSOptions: js.UndefOr[EBSOptionsStatus]
    var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus]
    var CognitoOptions: js.UndefOr[CognitoOptionsStatus]
  }

  object ElasticsearchDomainConfig {
    def apply(
      EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.undefined,
      VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.undefined,
      AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined,
      ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus] = js.undefined,
      AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.undefined,
      NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.undefined,
      LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.undefined,
      EBSOptions: js.UndefOr[EBSOptionsStatus] = js.undefined,
      SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.undefined,
      ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus] = js.undefined,
      CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.undefined): ElasticsearchDomainConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionAtRestOptions" -> EncryptionAtRestOptions.map { x => x.asInstanceOf[js.Any] },
        "VPCOptions" -> VPCOptions.map { x => x.asInstanceOf[js.Any] },
        "AccessPolicies" -> AccessPolicies.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchClusterConfig" -> ElasticsearchClusterConfig.map { x => x.asInstanceOf[js.Any] },
        "AdvancedOptions" -> AdvancedOptions.map { x => x.asInstanceOf[js.Any] },
        "NodeToNodeEncryptionOptions" -> NodeToNodeEncryptionOptions.map { x => x.asInstanceOf[js.Any] },
        "LogPublishingOptions" -> LogPublishingOptions.map { x => x.asInstanceOf[js.Any] },
        "EBSOptions" -> EBSOptions.map { x => x.asInstanceOf[js.Any] },
        "SnapshotOptions" -> SnapshotOptions.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchVersion" -> ElasticsearchVersion.map { x => x.asInstanceOf[js.Any] },
        "CognitoOptions" -> CognitoOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchDomainConfig]
    }
  }

  /**
   * <p>The current status of an Elasticsearch domain.</p>
   */
  @js.native
  trait ElasticsearchDomainStatus extends js.Object {
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var VPCOptions: js.UndefOr[VPCDerivedInfo]
    var ARN: js.UndefOr[ARN]
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var Created: js.UndefOr[Boolean]
    var Deleted: js.UndefOr[Boolean]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig]
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var Endpoint: js.UndefOr[ServiceUrl]
    var Processing: js.UndefOr[Boolean]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var DomainId: js.UndefOr[DomainId]
    var DomainName: js.UndefOr[DomainName]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var UpgradeProcessing: js.UndefOr[Boolean]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var Endpoints: js.UndefOr[EndpointsMap]
  }

  object ElasticsearchDomainStatus {
    def apply(
      EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
      VPCOptions: js.UndefOr[VPCDerivedInfo] = js.undefined,
      ARN: js.UndefOr[ARN] = js.undefined,
      AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
      Created: js.UndefOr[Boolean] = js.undefined,
      Deleted: js.UndefOr[Boolean] = js.undefined,
      ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined,
      ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined,
      AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
      Endpoint: js.UndefOr[ServiceUrl] = js.undefined,
      Processing: js.UndefOr[Boolean] = js.undefined,
      NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
      DomainId: js.UndefOr[DomainId] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
      EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
      UpgradeProcessing: js.UndefOr[Boolean] = js.undefined,
      SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
      ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
      CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
      Endpoints: js.UndefOr[EndpointsMap] = js.undefined): ElasticsearchDomainStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncryptionAtRestOptions" -> EncryptionAtRestOptions.map { x => x.asInstanceOf[js.Any] },
        "VPCOptions" -> VPCOptions.map { x => x.asInstanceOf[js.Any] },
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "AccessPolicies" -> AccessPolicies.map { x => x.asInstanceOf[js.Any] },
        "Created" -> Created.map { x => x.asInstanceOf[js.Any] },
        "Deleted" -> Deleted.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchClusterConfig" -> ElasticsearchClusterConfig.map { x => x.asInstanceOf[js.Any] },
        "ServiceSoftwareOptions" -> ServiceSoftwareOptions.map { x => x.asInstanceOf[js.Any] },
        "AdvancedOptions" -> AdvancedOptions.map { x => x.asInstanceOf[js.Any] },
        "Endpoint" -> Endpoint.map { x => x.asInstanceOf[js.Any] },
        "Processing" -> Processing.map { x => x.asInstanceOf[js.Any] },
        "NodeToNodeEncryptionOptions" -> NodeToNodeEncryptionOptions.map { x => x.asInstanceOf[js.Any] },
        "DomainId" -> DomainId.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "LogPublishingOptions" -> LogPublishingOptions.map { x => x.asInstanceOf[js.Any] },
        "EBSOptions" -> EBSOptions.map { x => x.asInstanceOf[js.Any] },
        "UpgradeProcessing" -> UpgradeProcessing.map { x => x.asInstanceOf[js.Any] },
        "SnapshotOptions" -> SnapshotOptions.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchVersion" -> ElasticsearchVersion.map { x => x.asInstanceOf[js.Any] },
        "CognitoOptions" -> CognitoOptions.map { x => x.asInstanceOf[js.Any] },
        "Endpoints" -> Endpoints.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchDomainStatus]
    }
  }

  /**
   * <p> Status of the Elasticsearch version options for the specified Elasticsearch domain.</p>
   */
  @js.native
  trait ElasticsearchVersionStatus extends js.Object {
    var Options: js.UndefOr[ElasticsearchVersionString]
    var Status: js.UndefOr[OptionStatus]
  }

  object ElasticsearchVersionStatus {
    def apply(
      Options: js.UndefOr[ElasticsearchVersionString] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): ElasticsearchVersionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchVersionStatus]
    }
  }

  /**
   * <p>Specifies the Encryption At Rest Options.</p>
   */
  @js.native
  trait EncryptionAtRestOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object EncryptionAtRestOptions {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined,
      KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined): EncryptionAtRestOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionAtRestOptions]
    }
  }

  /**
   * <p> Status of the Encryption At Rest options for the specified Elasticsearch domain.</p>
   */
  @js.native
  trait EncryptionAtRestOptionsStatus extends js.Object {
    var Options: js.UndefOr[EncryptionAtRestOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  object EncryptionAtRestOptionsStatus {
    def apply(
      Options: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): EncryptionAtRestOptionsStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EncryptionAtRestOptionsStatus]
    }
  }

  /**
   * <p> Container for request parameters to <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation. </p>
   */
  @js.native
  trait GetCompatibleElasticsearchVersionsRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object GetCompatibleElasticsearchVersionsRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined): GetCompatibleElasticsearchVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCompatibleElasticsearchVersionsRequest]
    }
  }

  /**
   * <p> Container for response returned by <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation. </p>
   */
  @js.native
  trait GetCompatibleElasticsearchVersionsResponse extends js.Object {
    var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList]
  }

  object GetCompatibleElasticsearchVersionsResponse {
    def apply(
      CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.undefined): GetCompatibleElasticsearchVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CompatibleElasticsearchVersions" -> CompatibleElasticsearchVersions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCompatibleElasticsearchVersionsResponse]
    }
  }

  /**
   * <p> Container for request parameters to <code> <a>GetUpgradeHistory</a> </code> operation. </p>
   */
  @js.native
  trait GetUpgradeHistoryRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetUpgradeHistoryRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetUpgradeHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUpgradeHistoryRequest]
    }
  }

  /**
   * <p> Container for response returned by <code> <a>GetUpgradeHistory</a> </code> operation. </p>
   */
  @js.native
  trait GetUpgradeHistoryResponse extends js.Object {
    var UpgradeHistories: js.UndefOr[UpgradeHistoryList]
    var NextToken: js.UndefOr[String]
  }

  object GetUpgradeHistoryResponse {
    def apply(
      UpgradeHistories: js.UndefOr[UpgradeHistoryList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetUpgradeHistoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpgradeHistories" -> UpgradeHistories.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUpgradeHistoryResponse]
    }
  }

  /**
   * <p> Container for request parameters to <code> <a>GetUpgradeStatus</a> </code> operation. </p>
   */
  @js.native
  trait GetUpgradeStatusRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object GetUpgradeStatusRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined): GetUpgradeStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUpgradeStatusRequest]
    }
  }

  /**
   * <p> Container for response returned by <code> <a>GetUpgradeStatus</a> </code> operation. </p>
   */
  @js.native
  trait GetUpgradeStatusResponse extends js.Object {
    var UpgradeStep: js.UndefOr[UpgradeStep]
    var StepStatus: js.UndefOr[UpgradeStatus]
    var UpgradeName: js.UndefOr[UpgradeName]
  }

  object GetUpgradeStatusResponse {
    def apply(
      UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined,
      StepStatus: js.UndefOr[UpgradeStatus] = js.undefined,
      UpgradeName: js.UndefOr[UpgradeName] = js.undefined): GetUpgradeStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpgradeStep" -> UpgradeStep.map { x => x.asInstanceOf[js.Any] },
        "StepStatus" -> StepStatus.map { x => x.asInstanceOf[js.Any] },
        "UpgradeName" -> UpgradeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUpgradeStatusResponse]
    }
  }

  /**
   * <p> InstanceCountLimits represents the limits on number of instances that be created in Amazon Elasticsearch for given InstanceType. </p>
   */
  @js.native
  trait InstanceCountLimits extends js.Object {
    var MinimumInstanceCount: js.UndefOr[MinimumInstanceCount]
    var MaximumInstanceCount: js.UndefOr[MaximumInstanceCount]
  }

  object InstanceCountLimits {
    def apply(
      MinimumInstanceCount: js.UndefOr[MinimumInstanceCount] = js.undefined,
      MaximumInstanceCount: js.UndefOr[MaximumInstanceCount] = js.undefined): InstanceCountLimits = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MinimumInstanceCount" -> MinimumInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "MaximumInstanceCount" -> MaximumInstanceCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceCountLimits]
    }
  }

  /**
   * <p>InstanceLimits represents the list of instance related attributes that are available for given InstanceType. </p>
   */
  @js.native
  trait InstanceLimits extends js.Object {
    var InstanceCountLimits: js.UndefOr[InstanceCountLimits]
  }

  object InstanceLimits {
    def apply(
      InstanceCountLimits: js.UndefOr[InstanceCountLimits] = js.undefined): InstanceLimits = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceCountLimits" -> InstanceCountLimits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceLimits]
    }
  }

  /**
   * <p> Limits for given InstanceType and for each of it's role. <br/> Limits contains following <code> <a>StorageTypes,</a> </code> <code> <a>InstanceLimits</a> </code> and <code> <a>AdditionalLimits</a> </code> </p>
   */
  @js.native
  trait Limits extends js.Object {
    var StorageTypes: js.UndefOr[StorageTypeList]
    var InstanceLimits: js.UndefOr[InstanceLimits]
    var AdditionalLimits: js.UndefOr[AdditionalLimitList]
  }

  object Limits {
    def apply(
      StorageTypes: js.UndefOr[StorageTypeList] = js.undefined,
      InstanceLimits: js.UndefOr[InstanceLimits] = js.undefined,
      AdditionalLimits: js.UndefOr[AdditionalLimitList] = js.undefined): Limits = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StorageTypes" -> StorageTypes.map { x => x.asInstanceOf[js.Any] },
        "InstanceLimits" -> InstanceLimits.map { x => x.asInstanceOf[js.Any] },
        "AdditionalLimits" -> AdditionalLimits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Limits]
    }
  }

  /**
   * <p>The result of a <code>ListDomainNames</code> operation. Contains the names of all Elasticsearch domains owned by this account.</p>
   */
  @js.native
  trait ListDomainNamesResponse extends js.Object {
    var DomainNames: js.UndefOr[DomainInfoList]
  }

  object ListDomainNamesResponse {
    def apply(
      DomainNames: js.UndefOr[DomainInfoList] = js.undefined): ListDomainNamesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainNames" -> DomainNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainNamesResponse]
    }
  }

  /**
   * <p> Container for the parameters to the <code> <a>ListElasticsearchInstanceTypes</a> </code> operation. </p>
   */
  @js.native
  trait ListElasticsearchInstanceTypesRequest extends js.Object {
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString]
    var DomainName: js.UndefOr[DomainName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchInstanceTypesRequest {
    def apply(
      ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListElasticsearchInstanceTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticsearchVersion" -> ElasticsearchVersion.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListElasticsearchInstanceTypesRequest]
    }
  }

  /**
   * <p> Container for the parameters returned by <code> <a>ListElasticsearchInstanceTypes</a> </code> operation. </p>
   */
  @js.native
  trait ListElasticsearchInstanceTypesResponse extends js.Object {
    var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchInstanceTypesResponse {
    def apply(
      ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListElasticsearchInstanceTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticsearchInstanceTypes" -> ElasticsearchInstanceTypes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListElasticsearchInstanceTypesResponse]
    }
  }

  /**
   * <p> Container for the parameters to the <code> <a>ListElasticsearchVersions</a> </code> operation. <p> Use <code> <a>MaxResults</a> </code> to control the maximum number of results to retrieve in a single call. </p> <p> Use <code> <a>NextToken</a> </code> in response to retrieve more results. If the received response does not contain a NextToken, then there are no more results to retrieve. </p> </p>
   */
  @js.native
  trait ListElasticsearchVersionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchVersionsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListElasticsearchVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListElasticsearchVersionsRequest]
    }
  }

  /**
   * <p> Container for the parameters for response received from <code> <a>ListElasticsearchVersions</a> </code> operation. </p>
   */
  @js.native
  trait ListElasticsearchVersionsResponse extends js.Object {
    var ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchVersionsResponse {
    def apply(
      ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListElasticsearchVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ElasticsearchVersions" -> ElasticsearchVersions.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListElasticsearchVersionsResponse]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>ListTags</a></code> operation. Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to view are attached.</p>
   */
  @js.native
  trait ListTagsRequest extends js.Object {
    var ARN: js.UndefOr[ARN]
  }

  object ListTagsRequest {
    def apply(
      ARN: js.UndefOr[ARN] = js.undefined): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
    }
  }

  /**
   * <p>The result of a <code>ListTags</code> operation. Contains tags for all requested Elasticsearch domains.</p>
   */
  @js.native
  trait ListTagsResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TagList" -> TagList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
    }
  }

  /**
   * <p>Log Publishing option that is set for given domain. <br/>Attributes and their details: <ul> <li>CloudWatchLogsLogGroupArn: ARN of the Cloudwatch log group to which log needs to be published.</li> <li>Enabled: Whether the log publishing for given log type is enabled or not</li> </ul> </p>
   */
  @js.native
  trait LogPublishingOption extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn]
    var Enabled: js.UndefOr[Boolean]
  }

  object LogPublishingOption {
    def apply(
      CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn] = js.undefined,
      Enabled: js.UndefOr[Boolean] = js.undefined): LogPublishingOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogPublishingOption]
    }
  }

  /**
   * <p>The configured log publishing options for the domain and their current status.</p>
   */
  @js.native
  trait LogPublishingOptionsStatus extends js.Object {
    var Options: js.UndefOr[LogPublishingOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  object LogPublishingOptionsStatus {
    def apply(
      Options: js.UndefOr[LogPublishingOptions] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): LogPublishingOptionsStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogPublishingOptionsStatus]
    }
  }

  /**
   * <p>Type of Log File, it can be one of the following: <ul> <li>INDEX_SLOW_LOGS: Index slow logs contain insert requests that took more time than configured index query log threshold to execute.</li> <li>SEARCH_SLOW_LOGS: Search slow logs contain search queries that took more time than configured search query log threshold to execute.</li> <li>ES_APPLICATION_LOGS: Elasticsearch application logs contain information about errors and warnings raised during the operation of the service and can be useful for troubleshooting.</li> </ul> </p>
   */
  object LogTypeEnum {
    val INDEX_SLOW_LOGS = "INDEX_SLOW_LOGS"
    val SEARCH_SLOW_LOGS = "SEARCH_SLOW_LOGS"
    val ES_APPLICATION_LOGS = "ES_APPLICATION_LOGS"

    val values = IndexedSeq(INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS)
  }

  /**
   * <p>Specifies the node-to-node encryption options.</p>
   */
  @js.native
  trait NodeToNodeEncryptionOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object NodeToNodeEncryptionOptions {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined): NodeToNodeEncryptionOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeToNodeEncryptionOptions]
    }
  }

  /**
   * <p>Status of the node-to-node encryption options for the specified Elasticsearch domain.</p>
   */
  @js.native
  trait NodeToNodeEncryptionOptionsStatus extends js.Object {
    var Options: js.UndefOr[NodeToNodeEncryptionOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  object NodeToNodeEncryptionOptionsStatus {
    def apply(
      Options: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): NodeToNodeEncryptionOptionsStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NodeToNodeEncryptionOptionsStatus]
    }
  }

  /**
   * <p>The state of a requested change. One of the following:</p> <ul> <li>Processing: The request change is still in-process.</li> <li>Active: The request change is processed and deployed to the Elasticsearch domain.</li> </ul>
   */
  object OptionStateEnum {
    val RequiresIndexDocuments = "RequiresIndexDocuments"
    val Processing = "Processing"
    val Active = "Active"

    val values = IndexedSeq(RequiresIndexDocuments, Processing, Active)
  }

  /**
   * <p>Provides the current status of the entity.</p>
   */
  @js.native
  trait OptionStatus extends js.Object {
    var CreationDate: js.UndefOr[UpdateTimestamp]
    var UpdateDate: js.UndefOr[UpdateTimestamp]
    var UpdateVersion: js.UndefOr[UIntValue]
    var State: js.UndefOr[OptionState]
    var PendingDeletion: js.UndefOr[Boolean]
  }

  object OptionStatus {
    def apply(
      CreationDate: js.UndefOr[UpdateTimestamp] = js.undefined,
      UpdateDate: js.UndefOr[UpdateTimestamp] = js.undefined,
      UpdateVersion: js.UndefOr[UIntValue] = js.undefined,
      State: js.UndefOr[OptionState] = js.undefined,
      PendingDeletion: js.UndefOr[Boolean] = js.undefined): OptionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "UpdateDate" -> UpdateDate.map { x => x.asInstanceOf[js.Any] },
        "UpdateVersion" -> UpdateVersion.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] },
        "PendingDeletion" -> PendingDeletion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionStatus]
    }
  }

  /**
   * <p>Container for parameters to <code>PurchaseReservedElasticsearchInstanceOffering</code></p>
   */
  @js.native
  trait PurchaseReservedElasticsearchInstanceOfferingRequest extends js.Object {
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID]
    var ReservationName: js.UndefOr[ReservationToken]
    var InstanceCount: js.UndefOr[InstanceCount]
  }

  object PurchaseReservedElasticsearchInstanceOfferingRequest {
    def apply(
      ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined,
      ReservationName: js.UndefOr[ReservationToken] = js.undefined,
      InstanceCount: js.UndefOr[InstanceCount] = js.undefined): PurchaseReservedElasticsearchInstanceOfferingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedElasticsearchInstanceOfferingId" -> ReservedElasticsearchInstanceOfferingId.map { x => x.asInstanceOf[js.Any] },
        "ReservationName" -> ReservationName.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingRequest]
    }
  }

  /**
   * <p>Represents the output of a <code>PurchaseReservedElasticsearchInstanceOffering</code> operation.</p>
   */
  @js.native
  trait PurchaseReservedElasticsearchInstanceOfferingResponse extends js.Object {
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
    var ReservationName: js.UndefOr[ReservationToken]
  }

  object PurchaseReservedElasticsearchInstanceOfferingResponse {
    def apply(
      ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined,
      ReservationName: js.UndefOr[ReservationToken] = js.undefined): PurchaseReservedElasticsearchInstanceOfferingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReservedElasticsearchInstanceId" -> ReservedElasticsearchInstanceId.map { x => x.asInstanceOf[js.Any] },
        "ReservationName" -> ReservationName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingResponse]
    }
  }

  /**
   * <p>Contains the specific price and frequency of a recurring charges for a reserved Elasticsearch instance, or for a reserved Elasticsearch instance offering.</p>
   */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  object RecurringCharge {
    def apply(
      RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
      RecurringChargeFrequency: js.UndefOr[String] = js.undefined): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RecurringChargeAmount" -> RecurringChargeAmount.map { x => x.asInstanceOf[js.Any] },
        "RecurringChargeFrequency" -> RecurringChargeFrequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>RemoveTags</a></code> operation. Specify the <code>ARN</code> for the Elasticsearch domain from which you want to remove the specified <code>TagKey</code>.</p>
   */
  @js.native
  trait RemoveTagsRequest extends js.Object {
    var ARN: js.UndefOr[ARN]
    var TagKeys: js.UndefOr[StringList]
  }

  object RemoveTagsRequest {
    def apply(
      ARN: js.UndefOr[ARN] = js.undefined,
      TagKeys: js.UndefOr[StringList] = js.undefined): RemoveTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ARN" -> ARN.map { x => x.asInstanceOf[js.Any] },
        "TagKeys" -> TagKeys.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsRequest]
    }
  }

  /**
   * <p>Details of a reserved Elasticsearch instance.</p>
   */
  @js.native
  trait ReservedElasticsearchInstance extends js.Object {
    var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption]
    var ElasticsearchInstanceCount: js.UndefOr[Int]
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
    var StartTime: js.UndefOr[UpdateTimestamp]
    var UsagePrice: js.UndefOr[Double]
    var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType]
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[String]
    var ReservationName: js.UndefOr[ReservationToken]
    var State: js.UndefOr[String]
  }

  object ReservedElasticsearchInstance {
    def apply(
      PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined,
      ElasticsearchInstanceCount: js.UndefOr[Int] = js.undefined,
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Int] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined,
      StartTime: js.UndefOr[UpdateTimestamp] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
      ReservedElasticsearchInstanceOfferingId: js.UndefOr[String] = js.undefined,
      ReservationName: js.UndefOr[ReservationToken] = js.undefined,
      State: js.UndefOr[String] = js.undefined): ReservedElasticsearchInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaymentOption" -> PaymentOption.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchInstanceCount" -> ElasticsearchInstanceCount.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "ReservedElasticsearchInstanceId" -> ReservedElasticsearchInstanceId.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchInstanceType" -> ElasticsearchInstanceType.map { x => x.asInstanceOf[js.Any] },
        "ReservedElasticsearchInstanceOfferingId" -> ReservedElasticsearchInstanceOfferingId.map { x => x.asInstanceOf[js.Any] },
        "ReservationName" -> ReservationName.map { x => x.asInstanceOf[js.Any] },
        "State" -> State.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedElasticsearchInstance]
    }
  }

  /**
   * <p>Details of a reserved Elasticsearch instance offering.</p>
   */
  @js.native
  trait ReservedElasticsearchInstanceOffering extends js.Object {
    var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption]
    var CurrencyCode: js.UndefOr[String]
    var Duration: js.UndefOr[Int]
    var FixedPrice: js.UndefOr[Double]
    var RecurringCharges: js.UndefOr[RecurringChargeList]
    var UsagePrice: js.UndefOr[Double]
    var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType]
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID]
  }

  object ReservedElasticsearchInstanceOffering {
    def apply(
      PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined,
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Int] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
      ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined): ReservedElasticsearchInstanceOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PaymentOption" -> PaymentOption.map { x => x.asInstanceOf[js.Any] },
        "CurrencyCode" -> CurrencyCode.map { x => x.asInstanceOf[js.Any] },
        "Duration" -> Duration.map { x => x.asInstanceOf[js.Any] },
        "FixedPrice" -> FixedPrice.map { x => x.asInstanceOf[js.Any] },
        "RecurringCharges" -> RecurringCharges.map { x => x.asInstanceOf[js.Any] },
        "UsagePrice" -> UsagePrice.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchInstanceType" -> ElasticsearchInstanceType.map { x => x.asInstanceOf[js.Any] },
        "ReservedElasticsearchInstanceOfferingId" -> ReservedElasticsearchInstanceOfferingId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedElasticsearchInstanceOffering]
    }
  }

  object ReservedElasticsearchInstancePaymentOptionEnum {
    val ALL_UPFRONT = "ALL_UPFRONT"
    val PARTIAL_UPFRONT = "PARTIAL_UPFRONT"
    val NO_UPFRONT = "NO_UPFRONT"

    val values = IndexedSeq(ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT)
  }

  /**
   * <p>The current options of an Elasticsearch domain service software options.</p>
   */
  @js.native
  trait ServiceSoftwareOptions extends js.Object {
    var NewVersion: js.UndefOr[String]
    var UpdateAvailable: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var UpdateStatus: js.UndefOr[DeploymentStatus]
    var Cancellable: js.UndefOr[Boolean]
    var CurrentVersion: js.UndefOr[String]
    var AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp]
  }

  object ServiceSoftwareOptions {
    def apply(
      NewVersion: js.UndefOr[String] = js.undefined,
      UpdateAvailable: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      UpdateStatus: js.UndefOr[DeploymentStatus] = js.undefined,
      Cancellable: js.UndefOr[Boolean] = js.undefined,
      CurrentVersion: js.UndefOr[String] = js.undefined,
      AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp] = js.undefined): ServiceSoftwareOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NewVersion" -> NewVersion.map { x => x.asInstanceOf[js.Any] },
        "UpdateAvailable" -> UpdateAvailable.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "UpdateStatus" -> UpdateStatus.map { x => x.asInstanceOf[js.Any] },
        "Cancellable" -> Cancellable.map { x => x.asInstanceOf[js.Any] },
        "CurrentVersion" -> CurrentVersion.map { x => x.asInstanceOf[js.Any] },
        "AutomatedUpdateDate" -> AutomatedUpdateDate.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceSoftwareOptions]
    }
  }

  /**
   * <p>Specifies the time, in UTC format, when the service takes a daily automated snapshot of the specified Elasticsearch domain. Default value is <code>0</code> hours.</p>
   */
  @js.native
  trait SnapshotOptions extends js.Object {
    var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass]
  }

  object SnapshotOptions {
    def apply(
      AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.undefined): SnapshotOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutomatedSnapshotStartHour" -> AutomatedSnapshotStartHour.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotOptions]
    }
  }

  /**
   * <p>Status of a daily automated snapshot.</p>
   */
  @js.native
  trait SnapshotOptionsStatus extends js.Object {
    var Options: js.UndefOr[SnapshotOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  object SnapshotOptionsStatus {
    def apply(
      Options: js.UndefOr[SnapshotOptions] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): SnapshotOptionsStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotOptionsStatus]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>StartElasticsearchServiceSoftwareUpdate</a></code> operation. Specifies the name of the Elasticsearch domain that you wish to schedule a service software update on.</p>
   */
  @js.native
  trait StartElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object StartElasticsearchServiceSoftwareUpdateRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined): StartElasticsearchServiceSoftwareUpdateRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartElasticsearchServiceSoftwareUpdateRequest]
    }
  }

  /**
   * <p>The result of a <code>StartElasticsearchServiceSoftwareUpdate</code> operation. Contains the status of the update.</p>
   */
  @js.native
  trait StartElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  object StartElasticsearchServiceSoftwareUpdateResponse {
    def apply(
      ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined): StartElasticsearchServiceSoftwareUpdateResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceSoftwareOptions" -> ServiceSoftwareOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartElasticsearchServiceSoftwareUpdateResponse]
    }
  }

  /**
   * <p>StorageTypes represents the list of storage related types and their attributes that are available for given InstanceType. </p>
   */
  @js.native
  trait StorageType extends js.Object {
    var StorageTypeName: js.UndefOr[StorageTypeName]
    var StorageSubTypeName: js.UndefOr[StorageSubTypeName]
    var StorageTypeLimits: js.UndefOr[StorageTypeLimitList]
  }

  object StorageType {
    def apply(
      StorageTypeName: js.UndefOr[StorageTypeName] = js.undefined,
      StorageSubTypeName: js.UndefOr[StorageSubTypeName] = js.undefined,
      StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.undefined): StorageType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StorageTypeName" -> StorageTypeName.map { x => x.asInstanceOf[js.Any] },
        "StorageSubTypeName" -> StorageSubTypeName.map { x => x.asInstanceOf[js.Any] },
        "StorageTypeLimits" -> StorageTypeLimits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageType]
    }
  }

  /**
   * <p>Limits that are applicable for given storage type. </p>
   */
  @js.native
  trait StorageTypeLimit extends js.Object {
    var LimitName: js.UndefOr[LimitName]
    var LimitValues: js.UndefOr[LimitValueList]
  }

  object StorageTypeLimit {
    def apply(
      LimitName: js.UndefOr[LimitName] = js.undefined,
      LimitValues: js.UndefOr[LimitValueList] = js.undefined): StorageTypeLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LimitName" -> LimitName.map { x => x.asInstanceOf[js.Any] },
        "LimitValues" -> LimitValues.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StorageTypeLimit]
    }
  }

  /**
   * <p>Specifies a key value pair for a resource tag.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Container for the parameters to the <code><a>UpdateElasticsearchDomain</a></code> operation. Specifies the type and number of instances in the domain cluster.</p>
   */
  @js.native
  trait UpdateElasticsearchDomainConfigRequest extends js.Object {
    var VPCOptions: js.UndefOr[VPCOptions]
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var DomainName: js.UndefOr[DomainName]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var CognitoOptions: js.UndefOr[CognitoOptions]
  }

  object UpdateElasticsearchDomainConfigRequest {
    def apply(
      VPCOptions: js.UndefOr[VPCOptions] = js.undefined,
      AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
      ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined,
      AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
      DomainName: js.UndefOr[DomainName] = js.undefined,
      LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
      EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
      SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
      CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined): UpdateElasticsearchDomainConfigRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VPCOptions" -> VPCOptions.map { x => x.asInstanceOf[js.Any] },
        "AccessPolicies" -> AccessPolicies.map { x => x.asInstanceOf[js.Any] },
        "ElasticsearchClusterConfig" -> ElasticsearchClusterConfig.map { x => x.asInstanceOf[js.Any] },
        "AdvancedOptions" -> AdvancedOptions.map { x => x.asInstanceOf[js.Any] },
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "LogPublishingOptions" -> LogPublishingOptions.map { x => x.asInstanceOf[js.Any] },
        "EBSOptions" -> EBSOptions.map { x => x.asInstanceOf[js.Any] },
        "SnapshotOptions" -> SnapshotOptions.map { x => x.asInstanceOf[js.Any] },
        "CognitoOptions" -> CognitoOptions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateElasticsearchDomainConfigRequest]
    }
  }

  /**
   * <p>The result of an <code>UpdateElasticsearchDomain</code> request. Contains the status of the Elasticsearch domain being updated.</p>
   */
  @js.native
  trait UpdateElasticsearchDomainConfigResponse extends js.Object {
    var DomainConfig: js.UndefOr[ElasticsearchDomainConfig]
  }

  object UpdateElasticsearchDomainConfigResponse {
    def apply(
      DomainConfig: js.UndefOr[ElasticsearchDomainConfig] = js.undefined): UpdateElasticsearchDomainConfigResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainConfig" -> DomainConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateElasticsearchDomainConfigResponse]
    }
  }

  /**
   * <p> Container for request parameters to <code> <a>UpgradeElasticsearchDomain</a> </code> operation. </p>
   */
  @js.native
  trait UpgradeElasticsearchDomainRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var TargetVersion: js.UndefOr[ElasticsearchVersionString]
    var PerformCheckOnly: js.UndefOr[Boolean]
  }

  object UpgradeElasticsearchDomainRequest {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
      PerformCheckOnly: js.UndefOr[Boolean] = js.undefined): UpgradeElasticsearchDomainRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "TargetVersion" -> TargetVersion.map { x => x.asInstanceOf[js.Any] },
        "PerformCheckOnly" -> PerformCheckOnly.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeElasticsearchDomainRequest]
    }
  }

  /**
   * <p> Container for response returned by <code> <a>UpgradeElasticsearchDomain</a> </code> operation. </p>
   */
  @js.native
  trait UpgradeElasticsearchDomainResponse extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var TargetVersion: js.UndefOr[ElasticsearchVersionString]
    var PerformCheckOnly: js.UndefOr[Boolean]
  }

  object UpgradeElasticsearchDomainResponse {
    def apply(
      DomainName: js.UndefOr[DomainName] = js.undefined,
      TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
      PerformCheckOnly: js.UndefOr[Boolean] = js.undefined): UpgradeElasticsearchDomainResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DomainName" -> DomainName.map { x => x.asInstanceOf[js.Any] },
        "TargetVersion" -> TargetVersion.map { x => x.asInstanceOf[js.Any] },
        "PerformCheckOnly" -> PerformCheckOnly.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeElasticsearchDomainResponse]
    }
  }

  /**
   * <p>History of the last 10 Upgrades and Upgrade Eligibility Checks.</p>
   */
  @js.native
  trait UpgradeHistory extends js.Object {
    var UpgradeName: js.UndefOr[UpgradeName]
    var StartTimestamp: js.UndefOr[StartTimestamp]
    var UpgradeStatus: js.UndefOr[UpgradeStatus]
    var StepsList: js.UndefOr[UpgradeStepsList]
  }

  object UpgradeHistory {
    def apply(
      UpgradeName: js.UndefOr[UpgradeName] = js.undefined,
      StartTimestamp: js.UndefOr[StartTimestamp] = js.undefined,
      UpgradeStatus: js.UndefOr[UpgradeStatus] = js.undefined,
      StepsList: js.UndefOr[UpgradeStepsList] = js.undefined): UpgradeHistory = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpgradeName" -> UpgradeName.map { x => x.asInstanceOf[js.Any] },
        "StartTimestamp" -> StartTimestamp.map { x => x.asInstanceOf[js.Any] },
        "UpgradeStatus" -> UpgradeStatus.map { x => x.asInstanceOf[js.Any] },
        "StepsList" -> StepsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeHistory]
    }
  }

  object UpgradeStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED = "SUCCEEDED"
    val SUCCEEDED_WITH_ISSUES = "SUCCEEDED_WITH_ISSUES"
    val FAILED = "FAILED"

    val values = IndexedSeq(IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES, FAILED)
  }

  object UpgradeStepEnum {
    val PRE_UPGRADE_CHECK = "PRE_UPGRADE_CHECK"
    val SNAPSHOT = "SNAPSHOT"
    val UPGRADE = "UPGRADE"

    val values = IndexedSeq(PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE)
  }

  /**
   * <p>Represents a single step of the Upgrade or Upgrade Eligibility Check workflow.</p>
   */
  @js.native
  trait UpgradeStepItem extends js.Object {
    var UpgradeStep: js.UndefOr[UpgradeStep]
    var UpgradeStepStatus: js.UndefOr[UpgradeStatus]
    var Issues: js.UndefOr[Issues]
    var ProgressPercent: js.UndefOr[Double]
  }

  object UpgradeStepItem {
    def apply(
      UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined,
      UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.undefined,
      Issues: js.UndefOr[Issues] = js.undefined,
      ProgressPercent: js.UndefOr[Double] = js.undefined): UpgradeStepItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UpgradeStep" -> UpgradeStep.map { x => x.asInstanceOf[js.Any] },
        "UpgradeStepStatus" -> UpgradeStepStatus.map { x => x.asInstanceOf[js.Any] },
        "Issues" -> Issues.map { x => x.asInstanceOf[js.Any] },
        "ProgressPercent" -> ProgressPercent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpgradeStepItem]
    }
  }

  /**
   * <p>Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank"> VPC Endpoints for Amazon Elasticsearch Service Domains</a>.</p>
   */
  @js.native
  trait VPCDerivedInfo extends js.Object {
    var VPCId: js.UndefOr[String]
    var SubnetIds: js.UndefOr[StringList]
    var AvailabilityZones: js.UndefOr[StringList]
    var SecurityGroupIds: js.UndefOr[StringList]
  }

  object VPCDerivedInfo {
    def apply(
      VPCId: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[StringList] = js.undefined,
      AvailabilityZones: js.UndefOr[StringList] = js.undefined,
      SecurityGroupIds: js.UndefOr[StringList] = js.undefined): VPCDerivedInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VPCId" -> VPCId.map { x => x.asInstanceOf[js.Any] },
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "AvailabilityZones" -> AvailabilityZones.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VPCDerivedInfo]
    }
  }

  /**
   * <p> Status of the VPC options for the specified Elasticsearch domain.</p>
   */
  @js.native
  trait VPCDerivedInfoStatus extends js.Object {
    var Options: js.UndefOr[VPCDerivedInfo]
    var Status: js.UndefOr[OptionStatus]
  }

  object VPCDerivedInfoStatus {
    def apply(
      Options: js.UndefOr[VPCDerivedInfo] = js.undefined,
      Status: js.UndefOr[OptionStatus] = js.undefined): VPCDerivedInfoStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VPCDerivedInfoStatus]
    }
  }

  /**
   * <p>Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank"> VPC Endpoints for Amazon Elasticsearch Service Domains</a>.</p>
   */
  @js.native
  trait VPCOptions extends js.Object {
    var SubnetIds: js.UndefOr[StringList]
    var SecurityGroupIds: js.UndefOr[StringList]
  }

  object VPCOptions {
    def apply(
      SubnetIds: js.UndefOr[StringList] = js.undefined,
      SecurityGroupIds: js.UndefOr[StringList] = js.undefined): VPCOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubnetIds" -> SubnetIds.map { x => x.asInstanceOf[js.Any] },
        "SecurityGroupIds" -> SecurityGroupIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VPCOptions]
    }
  }

  /**
   * <p> The type of EBS volume, standard, gp2, or io1. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank">Configuring EBS-based Storage</a>for more information.</p>
   */
  object VolumeTypeEnum {
    val standard = "standard"
    val gp2 = "gp2"
    val io1 = "io1"

    val values = IndexedSeq(standard, gp2, io1)
  }
}
