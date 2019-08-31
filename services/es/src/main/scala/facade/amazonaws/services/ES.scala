package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object es {
  type ARN                                        = String
  type AdditionalLimitList                        = js.Array[AdditionalLimit]
  type AdvancedOptions                            = js.Dictionary[String]
  type CloudWatchLogsLogGroupArn                  = String
  type CompatibleElasticsearchVersionsList        = js.Array[CompatibleVersionsMap]
  type DeploymentCloseDateTimeStamp               = js.Date
  type DeploymentStatus                           = String
  type DomainId                                   = String
  type DomainInfoList                             = js.Array[DomainInfo]
  type DomainName                                 = String
  type DomainNameList                             = js.Array[DomainName]
  type ESPartitionInstanceType                    = String
  type ElasticsearchDomainStatusList              = js.Array[ElasticsearchDomainStatus]
  type ElasticsearchInstanceTypeList              = js.Array[ESPartitionInstanceType]
  type ElasticsearchVersionList                   = js.Array[ElasticsearchVersionString]
  type ElasticsearchVersionString                 = String
  type EndpointsMap                               = js.Dictionary[ServiceUrl]
  type GUID                                       = String
  type IdentityPoolId                             = String
  type InstanceCount                              = Int
  type InstanceRole                               = String
  type IntegerClass                               = Int
  type Issue                                      = String
  type Issues                                     = js.Array[Issue]
  type KmsKeyId                                   = String
  type LimitName                                  = String
  type LimitValue                                 = String
  type LimitValueList                             = js.Array[LimitValue]
  type LimitsByRole                               = js.Dictionary[Limits]
  type LogPublishingOptions                       = js.Dictionary[LogPublishingOption]
  type LogType                                    = String
  type MaxResults                                 = Int
  type MaximumInstanceCount                       = Int
  type MinimumInstanceCount                       = Int
  type NextToken                                  = String
  type OptionState                                = String
  type PolicyDocument                             = String
  type RecurringChargeList                        = js.Array[RecurringCharge]
  type ReservationToken                           = String
  type ReservedElasticsearchInstanceList          = js.Array[ReservedElasticsearchInstance]
  type ReservedElasticsearchInstanceOfferingList  = js.Array[ReservedElasticsearchInstanceOffering]
  type ReservedElasticsearchInstancePaymentOption = String
  type RoleArn                                    = String
  type ServiceUrl                                 = String
  type StartTimestamp                             = js.Date
  type StorageSubTypeName                         = String
  type StorageTypeLimitList                       = js.Array[StorageTypeLimit]
  type StorageTypeList                            = js.Array[StorageType]
  type StorageTypeName                            = String
  type StringList                                 = js.Array[String]
  type TagKey                                     = String
  type TagList                                    = js.Array[Tag]
  type TagValue                                   = String
  type UIntValue                                  = Int
  type UpdateTimestamp                            = js.Date
  type UpgradeHistoryList                         = js.Array[UpgradeHistory]
  type UpgradeName                                = String
  type UpgradeStatus                              = String
  type UpgradeStep                                = String
  type UpgradeStepsList                           = js.Array[UpgradeStepItem]
  type UserPoolId                                 = String
  type VolumeType                                 = String

  implicit final class ESOps(private val service: ES) extends AnyVal {

    def addTagsFuture(params: AddTagsRequest): Future[js.Object] = service.addTags(params).promise.toFuture
    def cancelElasticsearchServiceSoftwareUpdateFuture(
        params: CancelElasticsearchServiceSoftwareUpdateRequest
    ): Future[CancelElasticsearchServiceSoftwareUpdateResponse] =
      service.cancelElasticsearchServiceSoftwareUpdate(params).promise.toFuture
    def createElasticsearchDomainFuture(
        params: CreateElasticsearchDomainRequest
    ): Future[CreateElasticsearchDomainResponse] = service.createElasticsearchDomain(params).promise.toFuture
    def deleteElasticsearchDomainFuture(
        params: DeleteElasticsearchDomainRequest
    ): Future[DeleteElasticsearchDomainResponse] = service.deleteElasticsearchDomain(params).promise.toFuture
    def deleteElasticsearchServiceRoleFuture(): Future[js.Object] =
      service.deleteElasticsearchServiceRole().promise.toFuture
    def describeElasticsearchDomainConfigFuture(
        params: DescribeElasticsearchDomainConfigRequest
    ): Future[DescribeElasticsearchDomainConfigResponse] =
      service.describeElasticsearchDomainConfig(params).promise.toFuture
    def describeElasticsearchDomainFuture(
        params: DescribeElasticsearchDomainRequest
    ): Future[DescribeElasticsearchDomainResponse] = service.describeElasticsearchDomain(params).promise.toFuture
    def describeElasticsearchDomainsFuture(
        params: DescribeElasticsearchDomainsRequest
    ): Future[DescribeElasticsearchDomainsResponse] = service.describeElasticsearchDomains(params).promise.toFuture
    def describeElasticsearchInstanceTypeLimitsFuture(
        params: DescribeElasticsearchInstanceTypeLimitsRequest
    ): Future[DescribeElasticsearchInstanceTypeLimitsResponse] =
      service.describeElasticsearchInstanceTypeLimits(params).promise.toFuture
    def describeReservedElasticsearchInstanceOfferingsFuture(
        params: DescribeReservedElasticsearchInstanceOfferingsRequest
    ): Future[DescribeReservedElasticsearchInstanceOfferingsResponse] =
      service.describeReservedElasticsearchInstanceOfferings(params).promise.toFuture
    def describeReservedElasticsearchInstancesFuture(
        params: DescribeReservedElasticsearchInstancesRequest
    ): Future[DescribeReservedElasticsearchInstancesResponse] =
      service.describeReservedElasticsearchInstances(params).promise.toFuture
    def getCompatibleElasticsearchVersionsFuture(
        params: GetCompatibleElasticsearchVersionsRequest
    ): Future[GetCompatibleElasticsearchVersionsResponse] =
      service.getCompatibleElasticsearchVersions(params).promise.toFuture
    def getUpgradeHistoryFuture(params: GetUpgradeHistoryRequest): Future[GetUpgradeHistoryResponse] =
      service.getUpgradeHistory(params).promise.toFuture
    def getUpgradeStatusFuture(params: GetUpgradeStatusRequest): Future[GetUpgradeStatusResponse] =
      service.getUpgradeStatus(params).promise.toFuture
    def listDomainNamesFuture(): Future[ListDomainNamesResponse] = service.listDomainNames().promise.toFuture
    def listElasticsearchInstanceTypesFuture(
        params: ListElasticsearchInstanceTypesRequest
    ): Future[ListElasticsearchInstanceTypesResponse] = service.listElasticsearchInstanceTypes(params).promise.toFuture
    def listElasticsearchVersionsFuture(
        params: ListElasticsearchVersionsRequest
    ): Future[ListElasticsearchVersionsResponse]                          = service.listElasticsearchVersions(params).promise.toFuture
    def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise.toFuture
    def purchaseReservedElasticsearchInstanceOfferingFuture(
        params: PurchaseReservedElasticsearchInstanceOfferingRequest
    ): Future[PurchaseReservedElasticsearchInstanceOfferingResponse] =
      service.purchaseReservedElasticsearchInstanceOffering(params).promise.toFuture
    def removeTagsFuture(params: RemoveTagsRequest): Future[js.Object] = service.removeTags(params).promise.toFuture
    def startElasticsearchServiceSoftwareUpdateFuture(
        params: StartElasticsearchServiceSoftwareUpdateRequest
    ): Future[StartElasticsearchServiceSoftwareUpdateResponse] =
      service.startElasticsearchServiceSoftwareUpdate(params).promise.toFuture
    def updateElasticsearchDomainConfigFuture(
        params: UpdateElasticsearchDomainConfigRequest
    ): Future[UpdateElasticsearchDomainConfigResponse] =
      service.updateElasticsearchDomainConfig(params).promise.toFuture
    def upgradeElasticsearchDomainFuture(
        params: UpgradeElasticsearchDomainRequest
    ): Future[UpgradeElasticsearchDomainResponse] = service.upgradeElasticsearchDomain(params).promise.toFuture
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
  trait AccessPoliciesStatus extends js.Object {
    var Options: PolicyDocument
    var Status: OptionStatus
  }

  object AccessPoliciesStatus {
    def apply(
        Options: PolicyDocument,
        Status: OptionStatus
    ): AccessPoliciesStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AccessPoliciesStatus]
    }
  }

  /**
    * Container for the parameters to the <code><a>AddTags</a></code> operation. Specify the tags that you want to attach to the Elasticsearch domain.
    */
  @js.native
  trait AddTagsRequest extends js.Object {
    var ARN: ARN
    var TagList: TagList
  }

  object AddTagsRequest {
    def apply(
        ARN: ARN,
        TagList: TagList
    ): AddTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ARN"     -> ARN.asInstanceOf[js.Any],
        "TagList" -> TagList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AddTagsRequest]
    }
  }

  /**
    * List of limits that are specific to a given InstanceType and for each of it's <code> <a>InstanceRole</a> </code> .
    */
  @js.native
  trait AdditionalLimit extends js.Object {
    var LimitName: js.UndefOr[LimitName]
    var LimitValues: js.UndefOr[LimitValueList]
  }

  object AdditionalLimit {
    def apply(
        LimitName: js.UndefOr[LimitName] = js.undefined,
        LimitValues: js.UndefOr[LimitValueList] = js.undefined
    ): AdditionalLimit = {
      val __obj = js.Dictionary.empty[js.Any]
      LimitName.foreach(__v => __obj.update("LimitName", __v.asInstanceOf[js.Any]))
      LimitValues.foreach(__v => __obj.update("LimitValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdditionalLimit]
    }
  }

  /**
    * Status of the advanced options for the specified Elasticsearch domain. Currently, the following advanced options are available:
    * * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access to individual sub-resources. By default, the value is <code>true</code>. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options" target="_blank">Configuration Advanced Options</a> for more information.
    *  * Option to specify the percentage of heap space that is allocated to field data. By default, this setting is unbounded.
    * For more information, see [[http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options|Configuring Advanced Options]].
    */
  @js.native
  trait AdvancedOptionsStatus extends js.Object {
    var Options: AdvancedOptions
    var Status: OptionStatus
  }

  object AdvancedOptionsStatus {
    def apply(
        Options: AdvancedOptions,
        Status: OptionStatus
    ): AdvancedOptionsStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AdvancedOptionsStatus]
    }
  }

  /**
    * Container for the parameters to the <code><a>CancelElasticsearchServiceSoftwareUpdate</a></code> operation. Specifies the name of the Elasticsearch domain that you wish to cancel a service software update on.
    */
  @js.native
  trait CancelElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: DomainName
  }

  object CancelElasticsearchServiceSoftwareUpdateRequest {
    def apply(
        DomainName: DomainName
    ): CancelElasticsearchServiceSoftwareUpdateRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateRequest]
    }
  }

  /**
    * The result of a <code>CancelElasticsearchServiceSoftwareUpdate</code> operation. Contains the status of the update.
    */
  @js.native
  trait CancelElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  object CancelElasticsearchServiceSoftwareUpdateResponse {
    def apply(
        ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
    ): CancelElasticsearchServiceSoftwareUpdateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceSoftwareOptions.foreach(__v => __obj.update("ServiceSoftwareOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateResponse]
    }
  }

  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html" target="_blank">Amazon Cognito Authentication for Kibana</a>.
    */
  @js.native
  trait CognitoOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var RoleArn: js.UndefOr[RoleArn]
    var UserPoolId: js.UndefOr[UserPoolId]
  }

  object CognitoOptions {
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        UserPoolId: js.UndefOr[UserPoolId] = js.undefined
    ): CognitoOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.update("RoleArn", __v.asInstanceOf[js.Any]))
      UserPoolId.foreach(__v => __obj.update("UserPoolId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CognitoOptions]
    }
  }

  /**
    * Status of the Cognito options for the specified Elasticsearch domain.
    */
  @js.native
  trait CognitoOptionsStatus extends js.Object {
    var Options: CognitoOptions
    var Status: OptionStatus
  }

  object CognitoOptionsStatus {
    def apply(
        Options: CognitoOptions,
        Status: OptionStatus
    ): CognitoOptionsStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CognitoOptionsStatus]
    }
  }

  /**
    * A map from an <code> <a>ElasticsearchVersion</a> </code> to a list of compatible <code> <a>ElasticsearchVersion</a> </code> s to which the domain can be upgraded.
    */
  @js.native
  trait CompatibleVersionsMap extends js.Object {
    var SourceVersion: js.UndefOr[ElasticsearchVersionString]
    var TargetVersions: js.UndefOr[ElasticsearchVersionList]
  }

  object CompatibleVersionsMap {
    def apply(
        SourceVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
        TargetVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined
    ): CompatibleVersionsMap = {
      val __obj = js.Dictionary.empty[js.Any]
      SourceVersion.foreach(__v => __obj.update("SourceVersion", __v.asInstanceOf[js.Any]))
      TargetVersions.foreach(__v => __obj.update("TargetVersions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CompatibleVersionsMap]
    }
  }

  @js.native
  trait CreateElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var VPCOptions: js.UndefOr[VPCOptions]
  }

  object CreateElasticsearchDomainRequest {
    def apply(
        DomainName: DomainName,
        AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
        ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined,
        ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
        VPCOptions: js.UndefOr[VPCOptions] = js.undefined
    ): CreateElasticsearchDomainRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AccessPolicies.foreach(__v => __obj.update("AccessPolicies", __v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.update("AdvancedOptions", __v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.update("CognitoOptions", __v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.update("EBSOptions", __v.asInstanceOf[js.Any]))
      ElasticsearchClusterConfig.foreach(__v => __obj.update("ElasticsearchClusterConfig", __v.asInstanceOf[js.Any]))
      ElasticsearchVersion.foreach(__v => __obj.update("ElasticsearchVersion", __v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.update("EncryptionAtRestOptions", __v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.update("LogPublishingOptions", __v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v => __obj.update("NodeToNodeEncryptionOptions", __v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.update("SnapshotOptions", __v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.update("VPCOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateElasticsearchDomainRequest]
    }
  }

  /**
    * The result of a <code>CreateElasticsearchDomain</code> operation. Contains the status of the newly created Elasticsearch domain.
    */
  @js.native
  trait CreateElasticsearchDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus]
  }

  object CreateElasticsearchDomainResponse {
    def apply(
        DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
    ): CreateElasticsearchDomainResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainStatus.foreach(__v => __obj.update("DomainStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateElasticsearchDomainResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DeleteElasticsearchDomain</a></code> operation. Specifies the name of the Elasticsearch domain that you want to delete.
    */
  @js.native
  trait DeleteElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DeleteElasticsearchDomainRequest {
    def apply(
        DomainName: DomainName
    ): DeleteElasticsearchDomainRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteElasticsearchDomainRequest]
    }
  }

  /**
    * The result of a <code>DeleteElasticsearchDomain</code> request. Contains the status of the pending deletion, or no status if the domain and all of its resources have been deleted.
    */
  @js.native
  trait DeleteElasticsearchDomainResponse extends js.Object {
    var DomainStatus: js.UndefOr[ElasticsearchDomainStatus]
  }

  object DeleteElasticsearchDomainResponse {
    def apply(
        DomainStatus: js.UndefOr[ElasticsearchDomainStatus] = js.undefined
    ): DeleteElasticsearchDomainResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainStatus.foreach(__v => __obj.update("DomainStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteElasticsearchDomainResponse]
    }
  }

  object DeploymentStatusEnum {
    val PENDING_UPDATE = "PENDING_UPDATE"
    val IN_PROGRESS    = "IN_PROGRESS"
    val COMPLETED      = "COMPLETED"
    val NOT_ELIGIBLE   = "NOT_ELIGIBLE"
    val ELIGIBLE       = "ELIGIBLE"

    val values = js.Object.freeze(js.Array(PENDING_UPDATE, IN_PROGRESS, COMPLETED, NOT_ELIGIBLE, ELIGIBLE))
  }

  /**
    * Container for the parameters to the <code>DescribeElasticsearchDomainConfig</code> operation. Specifies the domain name for which you want configuration information.
    */
  @js.native
  trait DescribeElasticsearchDomainConfigRequest extends js.Object {
    var DomainName: DomainName
  }

  object DescribeElasticsearchDomainConfigRequest {
    def apply(
        DomainName: DomainName
    ): DescribeElasticsearchDomainConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainConfigRequest]
    }
  }

  /**
    * The result of a <code>DescribeElasticsearchDomainConfig</code> request. Contains the configuration information of the requested domain.
    */
  @js.native
  trait DescribeElasticsearchDomainConfigResponse extends js.Object {
    var DomainConfig: ElasticsearchDomainConfig
  }

  object DescribeElasticsearchDomainConfigResponse {
    def apply(
        DomainConfig: ElasticsearchDomainConfig
    ): DescribeElasticsearchDomainConfigResponse = {
      val __obj = js.Dictionary[js.Any](
        "DomainConfig" -> DomainConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainConfigResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeElasticsearchDomain</a></code> operation.
    */
  @js.native
  trait DescribeElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
  }

  object DescribeElasticsearchDomainRequest {
    def apply(
        DomainName: DomainName
    ): DescribeElasticsearchDomainRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainRequest]
    }
  }

  /**
    * The result of a <code>DescribeElasticsearchDomain</code> request. Contains the status of the domain specified in the request.
    */
  @js.native
  trait DescribeElasticsearchDomainResponse extends js.Object {
    var DomainStatus: ElasticsearchDomainStatus
  }

  object DescribeElasticsearchDomainResponse {
    def apply(
        DomainStatus: ElasticsearchDomainStatus
    ): DescribeElasticsearchDomainResponse = {
      val __obj = js.Dictionary[js.Any](
        "DomainStatus" -> DomainStatus.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>DescribeElasticsearchDomains</a></code> operation. By default, the API returns the status of all Elasticsearch domains.
    */
  @js.native
  trait DescribeElasticsearchDomainsRequest extends js.Object {
    var DomainNames: DomainNameList
  }

  object DescribeElasticsearchDomainsRequest {
    def apply(
        DomainNames: DomainNameList
    ): DescribeElasticsearchDomainsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainNames" -> DomainNames.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainsRequest]
    }
  }

  /**
    * The result of a <code>DescribeElasticsearchDomains</code> request. Contains the status of the specified domains or all domains owned by the account.
    */
  @js.native
  trait DescribeElasticsearchDomainsResponse extends js.Object {
    var DomainStatusList: ElasticsearchDomainStatusList
  }

  object DescribeElasticsearchDomainsResponse {
    def apply(
        DomainStatusList: ElasticsearchDomainStatusList
    ): DescribeElasticsearchDomainsResponse = {
      val __obj = js.Dictionary[js.Any](
        "DomainStatusList" -> DomainStatusList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeElasticsearchDomainsResponse]
    }
  }

  /**
    * Container for the parameters to <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
    */
  @js.native
  trait DescribeElasticsearchInstanceTypeLimitsRequest extends js.Object {
    var ElasticsearchVersion: ElasticsearchVersionString
    var InstanceType: ESPartitionInstanceType
    var DomainName: js.UndefOr[DomainName]
  }

  object DescribeElasticsearchInstanceTypeLimitsRequest {
    def apply(
        ElasticsearchVersion: ElasticsearchVersionString,
        InstanceType: ESPartitionInstanceType,
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): DescribeElasticsearchInstanceTypeLimitsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ElasticsearchVersion" -> ElasticsearchVersion.asInstanceOf[js.Any],
        "InstanceType"         -> InstanceType.asInstanceOf[js.Any]
      )

      DomainName.foreach(__v => __obj.update("DomainName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsRequest]
    }
  }

  /**
    * Container for the parameters received from <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
    */
  @js.native
  trait DescribeElasticsearchInstanceTypeLimitsResponse extends js.Object {
    var LimitsByRole: js.UndefOr[LimitsByRole]
  }

  object DescribeElasticsearchInstanceTypeLimitsResponse {
    def apply(
        LimitsByRole: js.UndefOr[LimitsByRole] = js.undefined
    ): DescribeElasticsearchInstanceTypeLimitsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      LimitsByRole.foreach(__v => __obj.update("LimitsByRole", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsResponse]
    }
  }

  /**
    * Container for parameters to <code>DescribeReservedElasticsearchInstanceOfferings</code>
    */
  @js.native
  trait DescribeReservedElasticsearchInstanceOfferingsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID]
  }

  object DescribeReservedElasticsearchInstanceOfferingsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined
    ): DescribeReservedElasticsearchInstanceOfferingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceOfferingId.foreach(
        __v => __obj.update("ReservedElasticsearchInstanceOfferingId", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsRequest]
    }
  }

  /**
    * Container for results from <code>DescribeReservedElasticsearchInstanceOfferings</code>
    */
  @js.native
  trait DescribeReservedElasticsearchInstanceOfferingsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList]
  }

  object DescribeReservedElasticsearchInstanceOfferingsResponse {
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.undefined
    ): DescribeReservedElasticsearchInstanceOfferingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceOfferings.foreach(
        __v => __obj.update("ReservedElasticsearchInstanceOfferings", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsResponse]
    }
  }

  /**
    * Container for parameters to <code>DescribeReservedElasticsearchInstances</code>
    */
  @js.native
  trait DescribeReservedElasticsearchInstancesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
  }

  object DescribeReservedElasticsearchInstancesRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
    ): DescribeReservedElasticsearchInstancesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceId.foreach(
        __v => __obj.update("ReservedElasticsearchInstanceId", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedElasticsearchInstancesRequest]
    }
  }

  /**
    * Container for results from <code>DescribeReservedElasticsearchInstances</code>
    */
  @js.native
  trait DescribeReservedElasticsearchInstancesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList]
  }

  object DescribeReservedElasticsearchInstancesResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.undefined
    ): DescribeReservedElasticsearchInstancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstances.foreach(
        __v => __obj.update("ReservedElasticsearchInstances", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DescribeReservedElasticsearchInstancesResponse]
    }
  }

  @js.native
  trait DomainInfo extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object DomainInfo {
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): DomainInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainName.foreach(__v => __obj.update("DomainName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainInfo]
    }
  }

  /**
    * Options to enable, disable, and specify the properties of EBS storage volumes. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank"> Configuring EBS-based Storage</a>.
    */
  @js.native
  trait EBSOptions extends js.Object {
    var EBSEnabled: js.UndefOr[Boolean]
    var Iops: js.UndefOr[IntegerClass]
    var VolumeSize: js.UndefOr[IntegerClass]
    var VolumeType: js.UndefOr[VolumeType]
  }

  object EBSOptions {
    def apply(
        EBSEnabled: js.UndefOr[Boolean] = js.undefined,
        Iops: js.UndefOr[IntegerClass] = js.undefined,
        VolumeSize: js.UndefOr[IntegerClass] = js.undefined,
        VolumeType: js.UndefOr[VolumeType] = js.undefined
    ): EBSOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      EBSEnabled.foreach(__v => __obj.update("EBSEnabled", __v.asInstanceOf[js.Any]))
      Iops.foreach(__v => __obj.update("Iops", __v.asInstanceOf[js.Any]))
      VolumeSize.foreach(__v => __obj.update("VolumeSize", __v.asInstanceOf[js.Any]))
      VolumeType.foreach(__v => __obj.update("VolumeType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EBSOptions]
    }
  }

  /**
    * Status of the EBS options for the specified Elasticsearch domain.
    */
  @js.native
  trait EBSOptionsStatus extends js.Object {
    var Options: EBSOptions
    var Status: OptionStatus
  }

  object EBSOptionsStatus {
    def apply(
        Options: EBSOptions,
        Status: OptionStatus
    ): EBSOptionsStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EBSOptionsStatus]
    }
  }

  object ESPartitionInstanceTypeEnum {
    val `m3.medium.elasticsearch`   = "m3.medium.elasticsearch"
    val `m3.large.elasticsearch`    = "m3.large.elasticsearch"
    val `m3.xlarge.elasticsearch`   = "m3.xlarge.elasticsearch"
    val `m3.2xlarge.elasticsearch`  = "m3.2xlarge.elasticsearch"
    val `m4.large.elasticsearch`    = "m4.large.elasticsearch"
    val `m4.xlarge.elasticsearch`   = "m4.xlarge.elasticsearch"
    val `m4.2xlarge.elasticsearch`  = "m4.2xlarge.elasticsearch"
    val `m4.4xlarge.elasticsearch`  = "m4.4xlarge.elasticsearch"
    val `m4.10xlarge.elasticsearch` = "m4.10xlarge.elasticsearch"
    val `m5.large.elasticsearch`    = "m5.large.elasticsearch"
    val `m5.xlarge.elasticsearch`   = "m5.xlarge.elasticsearch"
    val `m5.2xlarge.elasticsearch`  = "m5.2xlarge.elasticsearch"
    val `m5.4xlarge.elasticsearch`  = "m5.4xlarge.elasticsearch"
    val `m5.12xlarge.elasticsearch` = "m5.12xlarge.elasticsearch"
    val `r5.large.elasticsearch`    = "r5.large.elasticsearch"
    val `r5.xlarge.elasticsearch`   = "r5.xlarge.elasticsearch"
    val `r5.2xlarge.elasticsearch`  = "r5.2xlarge.elasticsearch"
    val `r5.4xlarge.elasticsearch`  = "r5.4xlarge.elasticsearch"
    val `r5.12xlarge.elasticsearch` = "r5.12xlarge.elasticsearch"
    val `c5.large.elasticsearch`    = "c5.large.elasticsearch"
    val `c5.xlarge.elasticsearch`   = "c5.xlarge.elasticsearch"
    val `c5.2xlarge.elasticsearch`  = "c5.2xlarge.elasticsearch"
    val `c5.4xlarge.elasticsearch`  = "c5.4xlarge.elasticsearch"
    val `c5.9xlarge.elasticsearch`  = "c5.9xlarge.elasticsearch"
    val `c5.18xlarge.elasticsearch` = "c5.18xlarge.elasticsearch"
    val `t2.micro.elasticsearch`    = "t2.micro.elasticsearch"
    val `t2.small.elasticsearch`    = "t2.small.elasticsearch"
    val `t2.medium.elasticsearch`   = "t2.medium.elasticsearch"
    val `r3.large.elasticsearch`    = "r3.large.elasticsearch"
    val `r3.xlarge.elasticsearch`   = "r3.xlarge.elasticsearch"
    val `r3.2xlarge.elasticsearch`  = "r3.2xlarge.elasticsearch"
    val `r3.4xlarge.elasticsearch`  = "r3.4xlarge.elasticsearch"
    val `r3.8xlarge.elasticsearch`  = "r3.8xlarge.elasticsearch"
    val `i2.xlarge.elasticsearch`   = "i2.xlarge.elasticsearch"
    val `i2.2xlarge.elasticsearch`  = "i2.2xlarge.elasticsearch"
    val `d2.xlarge.elasticsearch`   = "d2.xlarge.elasticsearch"
    val `d2.2xlarge.elasticsearch`  = "d2.2xlarge.elasticsearch"
    val `d2.4xlarge.elasticsearch`  = "d2.4xlarge.elasticsearch"
    val `d2.8xlarge.elasticsearch`  = "d2.8xlarge.elasticsearch"
    val `c4.large.elasticsearch`    = "c4.large.elasticsearch"
    val `c4.xlarge.elasticsearch`   = "c4.xlarge.elasticsearch"
    val `c4.2xlarge.elasticsearch`  = "c4.2xlarge.elasticsearch"
    val `c4.4xlarge.elasticsearch`  = "c4.4xlarge.elasticsearch"
    val `c4.8xlarge.elasticsearch`  = "c4.8xlarge.elasticsearch"
    val `r4.large.elasticsearch`    = "r4.large.elasticsearch"
    val `r4.xlarge.elasticsearch`   = "r4.xlarge.elasticsearch"
    val `r4.2xlarge.elasticsearch`  = "r4.2xlarge.elasticsearch"
    val `r4.4xlarge.elasticsearch`  = "r4.4xlarge.elasticsearch"
    val `r4.8xlarge.elasticsearch`  = "r4.8xlarge.elasticsearch"
    val `r4.16xlarge.elasticsearch` = "r4.16xlarge.elasticsearch"
    val `i3.large.elasticsearch`    = "i3.large.elasticsearch"
    val `i3.xlarge.elasticsearch`   = "i3.xlarge.elasticsearch"
    val `i3.2xlarge.elasticsearch`  = "i3.2xlarge.elasticsearch"
    val `i3.4xlarge.elasticsearch`  = "i3.4xlarge.elasticsearch"
    val `i3.8xlarge.elasticsearch`  = "i3.8xlarge.elasticsearch"
    val `i3.16xlarge.elasticsearch` = "i3.16xlarge.elasticsearch"

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

  /**
    * Specifies the configuration for the domain cluster, such as the type and number of instances.
    */
  @js.native
  trait ElasticsearchClusterConfig extends js.Object {
    var DedicatedMasterCount: js.UndefOr[IntegerClass]
    var DedicatedMasterEnabled: js.UndefOr[Boolean]
    var DedicatedMasterType: js.UndefOr[ESPartitionInstanceType]
    var InstanceCount: js.UndefOr[IntegerClass]
    var InstanceType: js.UndefOr[ESPartitionInstanceType]
    var ZoneAwarenessConfig: js.UndefOr[ZoneAwarenessConfig]
    var ZoneAwarenessEnabled: js.UndefOr[Boolean]
  }

  object ElasticsearchClusterConfig {
    def apply(
        DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined,
        DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
        DedicatedMasterType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
        InstanceCount: js.UndefOr[IntegerClass] = js.undefined,
        InstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
        ZoneAwarenessConfig: js.UndefOr[ZoneAwarenessConfig] = js.undefined,
        ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
    ): ElasticsearchClusterConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      DedicatedMasterCount.foreach(__v => __obj.update("DedicatedMasterCount", __v.asInstanceOf[js.Any]))
      DedicatedMasterEnabled.foreach(__v => __obj.update("DedicatedMasterEnabled", __v.asInstanceOf[js.Any]))
      DedicatedMasterType.foreach(__v => __obj.update("DedicatedMasterType", __v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.update("InstanceCount", __v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.update("InstanceType", __v.asInstanceOf[js.Any]))
      ZoneAwarenessConfig.foreach(__v => __obj.update("ZoneAwarenessConfig", __v.asInstanceOf[js.Any]))
      ZoneAwarenessEnabled.foreach(__v => __obj.update("ZoneAwarenessEnabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchClusterConfig]
    }
  }

  /**
    * Specifies the configuration status for the specified Elasticsearch domain.
    */
  @js.native
  trait ElasticsearchClusterConfigStatus extends js.Object {
    var Options: ElasticsearchClusterConfig
    var Status: OptionStatus
  }

  object ElasticsearchClusterConfigStatus {
    def apply(
        Options: ElasticsearchClusterConfig,
        Status: OptionStatus
    ): ElasticsearchClusterConfigStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ElasticsearchClusterConfigStatus]
    }
  }

  /**
    * The configuration of an Elasticsearch domain.
    */
  @js.native
  trait ElasticsearchDomainConfig extends js.Object {
    var AccessPolicies: js.UndefOr[AccessPoliciesStatus]
    var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus]
    var CognitoOptions: js.UndefOr[CognitoOptionsStatus]
    var EBSOptions: js.UndefOr[EBSOptionsStatus]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus]
    var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus]
    var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus]
    var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus]
    var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus]
    var VPCOptions: js.UndefOr[VPCDerivedInfoStatus]
  }

  object ElasticsearchDomainConfig {
    def apply(
        AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptionsStatus] = js.undefined,
        ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus] = js.undefined,
        ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.undefined,
        VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.undefined
    ): ElasticsearchDomainConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessPolicies.foreach(__v => __obj.update("AccessPolicies", __v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.update("AdvancedOptions", __v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.update("CognitoOptions", __v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.update("EBSOptions", __v.asInstanceOf[js.Any]))
      ElasticsearchClusterConfig.foreach(__v => __obj.update("ElasticsearchClusterConfig", __v.asInstanceOf[js.Any]))
      ElasticsearchVersion.foreach(__v => __obj.update("ElasticsearchVersion", __v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.update("EncryptionAtRestOptions", __v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.update("LogPublishingOptions", __v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v => __obj.update("NodeToNodeEncryptionOptions", __v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.update("SnapshotOptions", __v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.update("VPCOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchDomainConfig]
    }
  }

  /**
    * The current status of an Elasticsearch domain.
    */
  @js.native
  trait ElasticsearchDomainStatus extends js.Object {
    var ARN: ARN
    var DomainId: DomainId
    var DomainName: DomainName
    var ElasticsearchClusterConfig: ElasticsearchClusterConfig
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var Created: js.UndefOr[Boolean]
    var Deleted: js.UndefOr[Boolean]
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

  object ElasticsearchDomainStatus {
    def apply(
        ARN: ARN,
        DomainId: DomainId,
        DomainName: DomainName,
        ElasticsearchClusterConfig: ElasticsearchClusterConfig,
        AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
        Created: js.UndefOr[Boolean] = js.undefined,
        Deleted: js.UndefOr[Boolean] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
        ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined,
        EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptions] = js.undefined,
        Endpoint: js.UndefOr[ServiceUrl] = js.undefined,
        Endpoints: js.UndefOr[EndpointsMap] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
        NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptions] = js.undefined,
        Processing: js.UndefOr[Boolean] = js.undefined,
        ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
        UpgradeProcessing: js.UndefOr[Boolean] = js.undefined,
        VPCOptions: js.UndefOr[VPCDerivedInfo] = js.undefined
    ): ElasticsearchDomainStatus = {
      val __obj = js.Dictionary[js.Any](
        "ARN"                        -> ARN.asInstanceOf[js.Any],
        "DomainId"                   -> DomainId.asInstanceOf[js.Any],
        "DomainName"                 -> DomainName.asInstanceOf[js.Any],
        "ElasticsearchClusterConfig" -> ElasticsearchClusterConfig.asInstanceOf[js.Any]
      )

      AccessPolicies.foreach(__v => __obj.update("AccessPolicies", __v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.update("AdvancedOptions", __v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.update("CognitoOptions", __v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.update("Created", __v.asInstanceOf[js.Any]))
      Deleted.foreach(__v => __obj.update("Deleted", __v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.update("EBSOptions", __v.asInstanceOf[js.Any]))
      ElasticsearchVersion.foreach(__v => __obj.update("ElasticsearchVersion", __v.asInstanceOf[js.Any]))
      EncryptionAtRestOptions.foreach(__v => __obj.update("EncryptionAtRestOptions", __v.asInstanceOf[js.Any]))
      Endpoint.foreach(__v => __obj.update("Endpoint", __v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.update("Endpoints", __v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.update("LogPublishingOptions", __v.asInstanceOf[js.Any]))
      NodeToNodeEncryptionOptions.foreach(__v => __obj.update("NodeToNodeEncryptionOptions", __v.asInstanceOf[js.Any]))
      Processing.foreach(__v => __obj.update("Processing", __v.asInstanceOf[js.Any]))
      ServiceSoftwareOptions.foreach(__v => __obj.update("ServiceSoftwareOptions", __v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.update("SnapshotOptions", __v.asInstanceOf[js.Any]))
      UpgradeProcessing.foreach(__v => __obj.update("UpgradeProcessing", __v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.update("VPCOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ElasticsearchDomainStatus]
    }
  }

  /**
    * Status of the Elasticsearch version options for the specified Elasticsearch domain.
    */
  @js.native
  trait ElasticsearchVersionStatus extends js.Object {
    var Options: ElasticsearchVersionString
    var Status: OptionStatus
  }

  object ElasticsearchVersionStatus {
    def apply(
        Options: ElasticsearchVersionString,
        Status: OptionStatus
    ): ElasticsearchVersionStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ElasticsearchVersionStatus]
    }
  }

  /**
    * Specifies the Encryption At Rest Options.
    */
  @js.native
  trait EncryptionAtRestOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  object EncryptionAtRestOptions {
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): EncryptionAtRestOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.update("KmsKeyId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionAtRestOptions]
    }
  }

  /**
    * Status of the Encryption At Rest options for the specified Elasticsearch domain.
    */
  @js.native
  trait EncryptionAtRestOptionsStatus extends js.Object {
    var Options: EncryptionAtRestOptions
    var Status: OptionStatus
  }

  object EncryptionAtRestOptionsStatus {
    def apply(
        Options: EncryptionAtRestOptions,
        Status: OptionStatus
    ): EncryptionAtRestOptionsStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EncryptionAtRestOptionsStatus]
    }
  }

  /**
    * Container for request parameters to <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
    */
  @js.native
  trait GetCompatibleElasticsearchVersionsRequest extends js.Object {
    var DomainName: js.UndefOr[DomainName]
  }

  object GetCompatibleElasticsearchVersionsRequest {
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined
    ): GetCompatibleElasticsearchVersionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainName.foreach(__v => __obj.update("DomainName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCompatibleElasticsearchVersionsRequest]
    }
  }

  /**
    * Container for response returned by <code> <a>GetCompatibleElasticsearchVersions</a> </code> operation.
    */
  @js.native
  trait GetCompatibleElasticsearchVersionsResponse extends js.Object {
    var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList]
  }

  object GetCompatibleElasticsearchVersionsResponse {
    def apply(
        CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.undefined
    ): GetCompatibleElasticsearchVersionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CompatibleElasticsearchVersions.foreach(
        __v => __obj.update("CompatibleElasticsearchVersions", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetCompatibleElasticsearchVersionsResponse]
    }
  }

  /**
    * Container for request parameters to <code> <a>GetUpgradeHistory</a> </code> operation.
    */
  @js.native
  trait GetUpgradeHistoryRequest extends js.Object {
    var DomainName: DomainName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetUpgradeHistoryRequest {
    def apply(
        DomainName: DomainName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetUpgradeHistoryRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUpgradeHistoryRequest]
    }
  }

  /**
    * Container for response returned by <code> <a>GetUpgradeHistory</a> </code> operation.
    */
  @js.native
  trait GetUpgradeHistoryResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var UpgradeHistories: js.UndefOr[UpgradeHistoryList]
  }

  object GetUpgradeHistoryResponse {
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        UpgradeHistories: js.UndefOr[UpgradeHistoryList] = js.undefined
    ): GetUpgradeHistoryResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      UpgradeHistories.foreach(__v => __obj.update("UpgradeHistories", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUpgradeHistoryResponse]
    }
  }

  /**
    * Container for request parameters to <code> <a>GetUpgradeStatus</a> </code> operation.
    */
  @js.native
  trait GetUpgradeStatusRequest extends js.Object {
    var DomainName: DomainName
  }

  object GetUpgradeStatusRequest {
    def apply(
        DomainName: DomainName
    ): GetUpgradeStatusRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUpgradeStatusRequest]
    }
  }

  /**
    * Container for response returned by <code> <a>GetUpgradeStatus</a> </code> operation.
    */
  @js.native
  trait GetUpgradeStatusResponse extends js.Object {
    var StepStatus: js.UndefOr[UpgradeStatus]
    var UpgradeName: js.UndefOr[UpgradeName]
    var UpgradeStep: js.UndefOr[UpgradeStep]
  }

  object GetUpgradeStatusResponse {
    def apply(
        StepStatus: js.UndefOr[UpgradeStatus] = js.undefined,
        UpgradeName: js.UndefOr[UpgradeName] = js.undefined,
        UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined
    ): GetUpgradeStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      StepStatus.foreach(__v => __obj.update("StepStatus", __v.asInstanceOf[js.Any]))
      UpgradeName.foreach(__v => __obj.update("UpgradeName", __v.asInstanceOf[js.Any]))
      UpgradeStep.foreach(__v => __obj.update("UpgradeStep", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUpgradeStatusResponse]
    }
  }

  /**
    * InstanceCountLimits represents the limits on number of instances that be created in Amazon Elasticsearch for given InstanceType.
    */
  @js.native
  trait InstanceCountLimits extends js.Object {
    var MaximumInstanceCount: js.UndefOr[MaximumInstanceCount]
    var MinimumInstanceCount: js.UndefOr[MinimumInstanceCount]
  }

  object InstanceCountLimits {
    def apply(
        MaximumInstanceCount: js.UndefOr[MaximumInstanceCount] = js.undefined,
        MinimumInstanceCount: js.UndefOr[MinimumInstanceCount] = js.undefined
    ): InstanceCountLimits = {
      val __obj = js.Dictionary.empty[js.Any]
      MaximumInstanceCount.foreach(__v => __obj.update("MaximumInstanceCount", __v.asInstanceOf[js.Any]))
      MinimumInstanceCount.foreach(__v => __obj.update("MinimumInstanceCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceCountLimits]
    }
  }

  /**
    * InstanceLimits represents the list of instance related attributes that are available for given InstanceType.
    */
  @js.native
  trait InstanceLimits extends js.Object {
    var InstanceCountLimits: js.UndefOr[InstanceCountLimits]
  }

  object InstanceLimits {
    def apply(
        InstanceCountLimits: js.UndefOr[InstanceCountLimits] = js.undefined
    ): InstanceLimits = {
      val __obj = js.Dictionary.empty[js.Any]
      InstanceCountLimits.foreach(__v => __obj.update("InstanceCountLimits", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceLimits]
    }
  }

  /**
    * Limits for given InstanceType and for each of it's role. <br/> Limits contains following <code> <a>StorageTypes,</a> </code> <code> <a>InstanceLimits</a> </code> and <code> <a>AdditionalLimits</a> </code>
    */
  @js.native
  trait Limits extends js.Object {
    var AdditionalLimits: js.UndefOr[AdditionalLimitList]
    var InstanceLimits: js.UndefOr[InstanceLimits]
    var StorageTypes: js.UndefOr[StorageTypeList]
  }

  object Limits {
    def apply(
        AdditionalLimits: js.UndefOr[AdditionalLimitList] = js.undefined,
        InstanceLimits: js.UndefOr[InstanceLimits] = js.undefined,
        StorageTypes: js.UndefOr[StorageTypeList] = js.undefined
    ): Limits = {
      val __obj = js.Dictionary.empty[js.Any]
      AdditionalLimits.foreach(__v => __obj.update("AdditionalLimits", __v.asInstanceOf[js.Any]))
      InstanceLimits.foreach(__v => __obj.update("InstanceLimits", __v.asInstanceOf[js.Any]))
      StorageTypes.foreach(__v => __obj.update("StorageTypes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Limits]
    }
  }

  /**
    * The result of a <code>ListDomainNames</code> operation. Contains the names of all Elasticsearch domains owned by this account.
    */
  @js.native
  trait ListDomainNamesResponse extends js.Object {
    var DomainNames: js.UndefOr[DomainInfoList]
  }

  object ListDomainNamesResponse {
    def apply(
        DomainNames: js.UndefOr[DomainInfoList] = js.undefined
    ): ListDomainNamesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainNames.foreach(__v => __obj.update("DomainNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainNamesResponse]
    }
  }

  /**
    * Container for the parameters to the <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
    */
  @js.native
  trait ListElasticsearchInstanceTypesRequest extends js.Object {
    var ElasticsearchVersion: ElasticsearchVersionString
    var DomainName: js.UndefOr[DomainName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchInstanceTypesRequest {
    def apply(
        ElasticsearchVersion: ElasticsearchVersionString,
        DomainName: js.UndefOr[DomainName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListElasticsearchInstanceTypesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ElasticsearchVersion" -> ElasticsearchVersion.asInstanceOf[js.Any]
      )

      DomainName.foreach(__v => __obj.update("DomainName", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListElasticsearchInstanceTypesRequest]
    }
  }

  /**
    * Container for the parameters returned by <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
    */
  @js.native
  trait ListElasticsearchInstanceTypesResponse extends js.Object {
    var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchInstanceTypesResponse {
    def apply(
        ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListElasticsearchInstanceTypesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ElasticsearchInstanceTypes.foreach(__v => __obj.update("ElasticsearchInstanceTypes", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListElasticsearchInstanceTypesResponse]
    }
  }

  /**
    * Container for the parameters to the <code> <a>ListElasticsearchVersions</a> </code> operation. <p> Use <code> <a>MaxResults</a> </code> to control the maximum number of results to retrieve in a single call.
    *  Use <code> <a>NextToken</a> </code> in response to retrieve more results. If the received response does not contain a NextToken, then there are no more results to retrieve.
    *  </p>
    */
  @js.native
  trait ListElasticsearchVersionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchVersionsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListElasticsearchVersionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListElasticsearchVersionsRequest]
    }
  }

  /**
    * Container for the parameters for response received from <code> <a>ListElasticsearchVersions</a> </code> operation.
    */
  @js.native
  trait ListElasticsearchVersionsResponse extends js.Object {
    var ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListElasticsearchVersionsResponse {
    def apply(
        ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListElasticsearchVersionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ElasticsearchVersions.foreach(__v => __obj.update("ElasticsearchVersions", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListElasticsearchVersionsResponse]
    }
  }

  /**
    * Container for the parameters to the <code><a>ListTags</a></code> operation. Specify the <code>ARN</code> for the Elasticsearch domain to which the tags are attached that you want to view are attached.
    */
  @js.native
  trait ListTagsRequest extends js.Object {
    var ARN: ARN
  }

  object ListTagsRequest {
    def apply(
        ARN: ARN
    ): ListTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ARN" -> ARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  /**
    * The result of a <code>ListTags</code> operation. Contains tags for all requested Elasticsearch domains.
    */
  @js.native
  trait ListTagsResponse extends js.Object {
    var TagList: js.UndefOr[TagList]
  }

  object ListTagsResponse {
    def apply(
        TagList: js.UndefOr[TagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      TagList.foreach(__v => __obj.update("TagList", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  /**
    * <p>Log Publishing option that is set for given domain. <br/>Attributes and their details:* CloudWatchLogsLogGroupArn: ARN of the Cloudwatch log group to which log needs to be published.
    *  * Enabled: Whether the log publishing for given log type is enabled or not
    * </p>
    */
  @js.native
  trait LogPublishingOption extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn]
    var Enabled: js.UndefOr[Boolean]
  }

  object LogPublishingOption {
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[CloudWatchLogsLogGroupArn] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): LogPublishingOption = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchLogsLogGroupArn.foreach(__v => __obj.update("CloudWatchLogsLogGroupArn", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogPublishingOption]
    }
  }

  /**
    * The configured log publishing options for the domain and their current status.
    */
  @js.native
  trait LogPublishingOptionsStatus extends js.Object {
    var Options: js.UndefOr[LogPublishingOptions]
    var Status: js.UndefOr[OptionStatus]
  }

  object LogPublishingOptionsStatus {
    def apply(
        Options: js.UndefOr[LogPublishingOptions] = js.undefined,
        Status: js.UndefOr[OptionStatus] = js.undefined
    ): LogPublishingOptionsStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      Options.foreach(__v => __obj.update("Options", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogPublishingOptionsStatus]
    }
  }

  /**
    * <p>Type of Log File, it can be one of the following:* INDEX_SLOW_LOGS: Index slow logs contain insert requests that took more time than configured index query log threshold to execute.
    *  * SEARCH_SLOW_LOGS: Search slow logs contain search queries that took more time than configured search query log threshold to execute.
    *  * ES_APPLICATION_LOGS: Elasticsearch application logs contain information about errors and warnings raised during the operation of the service and can be useful for troubleshooting.
    * </p>
    */
  object LogTypeEnum {
    val INDEX_SLOW_LOGS     = "INDEX_SLOW_LOGS"
    val SEARCH_SLOW_LOGS    = "SEARCH_SLOW_LOGS"
    val ES_APPLICATION_LOGS = "ES_APPLICATION_LOGS"

    val values = js.Object.freeze(js.Array(INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS))
  }

  /**
    * Specifies the node-to-node encryption options.
    */
  @js.native
  trait NodeToNodeEncryptionOptions extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  object NodeToNodeEncryptionOptions {
    def apply(
        Enabled: js.UndefOr[Boolean] = js.undefined
    ): NodeToNodeEncryptionOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NodeToNodeEncryptionOptions]
    }
  }

  /**
    * Status of the node-to-node encryption options for the specified Elasticsearch domain.
    */
  @js.native
  trait NodeToNodeEncryptionOptionsStatus extends js.Object {
    var Options: NodeToNodeEncryptionOptions
    var Status: OptionStatus
  }

  object NodeToNodeEncryptionOptionsStatus {
    def apply(
        Options: NodeToNodeEncryptionOptions,
        Status: OptionStatus
    ): NodeToNodeEncryptionOptionsStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[NodeToNodeEncryptionOptionsStatus]
    }
  }

  /**
    * The state of a requested change. One of the following:
    * * Processing: The request change is still in-process.
    *  * Active: The request change is processed and deployed to the Elasticsearch domain.
    */
  object OptionStateEnum {
    val RequiresIndexDocuments = "RequiresIndexDocuments"
    val Processing             = "Processing"
    val Active                 = "Active"

    val values = js.Object.freeze(js.Array(RequiresIndexDocuments, Processing, Active))
  }

  /**
    * Provides the current status of the entity.
    */
  @js.native
  trait OptionStatus extends js.Object {
    var CreationDate: UpdateTimestamp
    var State: OptionState
    var UpdateDate: UpdateTimestamp
    var PendingDeletion: js.UndefOr[Boolean]
    var UpdateVersion: js.UndefOr[UIntValue]
  }

  object OptionStatus {
    def apply(
        CreationDate: UpdateTimestamp,
        State: OptionState,
        UpdateDate: UpdateTimestamp,
        PendingDeletion: js.UndefOr[Boolean] = js.undefined,
        UpdateVersion: js.UndefOr[UIntValue] = js.undefined
    ): OptionStatus = {
      val __obj = js.Dictionary[js.Any](
        "CreationDate" -> CreationDate.asInstanceOf[js.Any],
        "State"        -> State.asInstanceOf[js.Any],
        "UpdateDate"   -> UpdateDate.asInstanceOf[js.Any]
      )

      PendingDeletion.foreach(__v => __obj.update("PendingDeletion", __v.asInstanceOf[js.Any]))
      UpdateVersion.foreach(__v => __obj.update("UpdateVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionStatus]
    }
  }

  /**
    * Container for parameters to <code>PurchaseReservedElasticsearchInstanceOffering</code>
    */
  @js.native
  trait PurchaseReservedElasticsearchInstanceOfferingRequest extends js.Object {
    var ReservationName: ReservationToken
    var ReservedElasticsearchInstanceOfferingId: GUID
    var InstanceCount: js.UndefOr[InstanceCount]
  }

  object PurchaseReservedElasticsearchInstanceOfferingRequest {
    def apply(
        ReservationName: ReservationToken,
        ReservedElasticsearchInstanceOfferingId: GUID,
        InstanceCount: js.UndefOr[InstanceCount] = js.undefined
    ): PurchaseReservedElasticsearchInstanceOfferingRequest = {
      val __obj = js.Dictionary[js.Any](
        "ReservationName"                         -> ReservationName.asInstanceOf[js.Any],
        "ReservedElasticsearchInstanceOfferingId" -> ReservedElasticsearchInstanceOfferingId.asInstanceOf[js.Any]
      )

      InstanceCount.foreach(__v => __obj.update("InstanceCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingRequest]
    }
  }

  /**
    * Represents the output of a <code>PurchaseReservedElasticsearchInstanceOffering</code> operation.
    */
  @js.native
  trait PurchaseReservedElasticsearchInstanceOfferingResponse extends js.Object {
    var ReservationName: js.UndefOr[ReservationToken]
    var ReservedElasticsearchInstanceId: js.UndefOr[GUID]
  }

  object PurchaseReservedElasticsearchInstanceOfferingResponse {
    def apply(
        ReservationName: js.UndefOr[ReservationToken] = js.undefined,
        ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined
    ): PurchaseReservedElasticsearchInstanceOfferingResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ReservationName.foreach(__v => __obj.update("ReservationName", __v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceId.foreach(
        __v => __obj.update("ReservedElasticsearchInstanceId", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[PurchaseReservedElasticsearchInstanceOfferingResponse]
    }
  }

  /**
    * Contains the specific price and frequency of a recurring charges for a reserved Elasticsearch instance, or for a reserved Elasticsearch instance offering.
    */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: js.UndefOr[Double]
    var RecurringChargeFrequency: js.UndefOr[String]
  }

  object RecurringCharge {
    def apply(
        RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
        RecurringChargeFrequency: js.UndefOr[String] = js.undefined
    ): RecurringCharge = {
      val __obj = js.Dictionary.empty[js.Any]
      RecurringChargeAmount.foreach(__v => __obj.update("RecurringChargeAmount", __v.asInstanceOf[js.Any]))
      RecurringChargeFrequency.foreach(__v => __obj.update("RecurringChargeFrequency", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecurringCharge]
    }
  }

  /**
    * Container for the parameters to the <code><a>RemoveTags</a></code> operation. Specify the <code>ARN</code> for the Elasticsearch domain from which you want to remove the specified <code>TagKey</code>.
    */
  @js.native
  trait RemoveTagsRequest extends js.Object {
    var ARN: ARN
    var TagKeys: StringList
  }

  object RemoveTagsRequest {
    def apply(
        ARN: ARN,
        TagKeys: StringList
    ): RemoveTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ARN"     -> ARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RemoveTagsRequest]
    }
  }

  /**
    * Details of a reserved Elasticsearch instance.
    */
  @js.native
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

  object ReservedElasticsearchInstance {
    def apply(
        CurrencyCode: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        ElasticsearchInstanceCount: js.UndefOr[Int] = js.undefined,
        ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservationName: js.UndefOr[ReservationToken] = js.undefined,
        ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.undefined,
        ReservedElasticsearchInstanceOfferingId: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[UpdateTimestamp] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedElasticsearchInstance = {
      val __obj = js.Dictionary.empty[js.Any]
      CurrencyCode.foreach(__v => __obj.update("CurrencyCode", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      ElasticsearchInstanceCount.foreach(__v => __obj.update("ElasticsearchInstanceCount", __v.asInstanceOf[js.Any]))
      ElasticsearchInstanceType.foreach(__v => __obj.update("ElasticsearchInstanceType", __v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.update("FixedPrice", __v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.update("PaymentOption", __v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.update("RecurringCharges", __v.asInstanceOf[js.Any]))
      ReservationName.foreach(__v => __obj.update("ReservationName", __v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceId.foreach(
        __v => __obj.update("ReservedElasticsearchInstanceId", __v.asInstanceOf[js.Any])
      )
      ReservedElasticsearchInstanceOfferingId.foreach(
        __v => __obj.update("ReservedElasticsearchInstanceOfferingId", __v.asInstanceOf[js.Any])
      )
      StartTime.foreach(__v => __obj.update("StartTime", __v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.update("State", __v.asInstanceOf[js.Any]))
      UsagePrice.foreach(__v => __obj.update("UsagePrice", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedElasticsearchInstance]
    }
  }

  /**
    * Details of a reserved Elasticsearch instance offering.
    */
  @js.native
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

  object ReservedElasticsearchInstanceOffering {
    def apply(
        CurrencyCode: js.UndefOr[String] = js.undefined,
        Duration: js.UndefOr[Int] = js.undefined,
        ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.undefined,
        FixedPrice: js.UndefOr[Double] = js.undefined,
        PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.undefined,
        RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
        ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.undefined,
        UsagePrice: js.UndefOr[Double] = js.undefined
    ): ReservedElasticsearchInstanceOffering = {
      val __obj = js.Dictionary.empty[js.Any]
      CurrencyCode.foreach(__v => __obj.update("CurrencyCode", __v.asInstanceOf[js.Any]))
      Duration.foreach(__v => __obj.update("Duration", __v.asInstanceOf[js.Any]))
      ElasticsearchInstanceType.foreach(__v => __obj.update("ElasticsearchInstanceType", __v.asInstanceOf[js.Any]))
      FixedPrice.foreach(__v => __obj.update("FixedPrice", __v.asInstanceOf[js.Any]))
      PaymentOption.foreach(__v => __obj.update("PaymentOption", __v.asInstanceOf[js.Any]))
      RecurringCharges.foreach(__v => __obj.update("RecurringCharges", __v.asInstanceOf[js.Any]))
      ReservedElasticsearchInstanceOfferingId.foreach(
        __v => __obj.update("ReservedElasticsearchInstanceOfferingId", __v.asInstanceOf[js.Any])
      )
      UsagePrice.foreach(__v => __obj.update("UsagePrice", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReservedElasticsearchInstanceOffering]
    }
  }

  object ReservedElasticsearchInstancePaymentOptionEnum {
    val ALL_UPFRONT     = "ALL_UPFRONT"
    val PARTIAL_UPFRONT = "PARTIAL_UPFRONT"
    val NO_UPFRONT      = "NO_UPFRONT"

    val values = js.Object.freeze(js.Array(ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT))
  }

  /**
    * The current options of an Elasticsearch domain service software options.
    */
  @js.native
  trait ServiceSoftwareOptions extends js.Object {
    var AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp]
    var Cancellable: js.UndefOr[Boolean]
    var CurrentVersion: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var NewVersion: js.UndefOr[String]
    var UpdateAvailable: js.UndefOr[Boolean]
    var UpdateStatus: js.UndefOr[DeploymentStatus]
  }

  object ServiceSoftwareOptions {
    def apply(
        AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp] = js.undefined,
        Cancellable: js.UndefOr[Boolean] = js.undefined,
        CurrentVersion: js.UndefOr[String] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        NewVersion: js.UndefOr[String] = js.undefined,
        UpdateAvailable: js.UndefOr[Boolean] = js.undefined,
        UpdateStatus: js.UndefOr[DeploymentStatus] = js.undefined
    ): ServiceSoftwareOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      AutomatedUpdateDate.foreach(__v => __obj.update("AutomatedUpdateDate", __v.asInstanceOf[js.Any]))
      Cancellable.foreach(__v => __obj.update("Cancellable", __v.asInstanceOf[js.Any]))
      CurrentVersion.foreach(__v => __obj.update("CurrentVersion", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      NewVersion.foreach(__v => __obj.update("NewVersion", __v.asInstanceOf[js.Any]))
      UpdateAvailable.foreach(__v => __obj.update("UpdateAvailable", __v.asInstanceOf[js.Any]))
      UpdateStatus.foreach(__v => __obj.update("UpdateStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSoftwareOptions]
    }
  }

  /**
    * Specifies the time, in UTC format, when the service takes a daily automated snapshot of the specified Elasticsearch domain. Default value is <code>0</code> hours.
    */
  @js.native
  trait SnapshotOptions extends js.Object {
    var AutomatedSnapshotStartHour: js.UndefOr[IntegerClass]
  }

  object SnapshotOptions {
    def apply(
        AutomatedSnapshotStartHour: js.UndefOr[IntegerClass] = js.undefined
    ): SnapshotOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      AutomatedSnapshotStartHour.foreach(__v => __obj.update("AutomatedSnapshotStartHour", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotOptions]
    }
  }

  /**
    * Status of a daily automated snapshot.
    */
  @js.native
  trait SnapshotOptionsStatus extends js.Object {
    var Options: SnapshotOptions
    var Status: OptionStatus
  }

  object SnapshotOptionsStatus {
    def apply(
        Options: SnapshotOptions,
        Status: OptionStatus
    ): SnapshotOptionsStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SnapshotOptionsStatus]
    }
  }

  /**
    * Container for the parameters to the <code><a>StartElasticsearchServiceSoftwareUpdate</a></code> operation. Specifies the name of the Elasticsearch domain that you wish to schedule a service software update on.
    */
  @js.native
  trait StartElasticsearchServiceSoftwareUpdateRequest extends js.Object {
    var DomainName: DomainName
  }

  object StartElasticsearchServiceSoftwareUpdateRequest {
    def apply(
        DomainName: DomainName
    ): StartElasticsearchServiceSoftwareUpdateRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateRequest]
    }
  }

  /**
    * The result of a <code>StartElasticsearchServiceSoftwareUpdate</code> operation. Contains the status of the update.
    */
  @js.native
  trait StartElasticsearchServiceSoftwareUpdateResponse extends js.Object {
    var ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions]
  }

  object StartElasticsearchServiceSoftwareUpdateResponse {
    def apply(
        ServiceSoftwareOptions: js.UndefOr[ServiceSoftwareOptions] = js.undefined
    ): StartElasticsearchServiceSoftwareUpdateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ServiceSoftwareOptions.foreach(__v => __obj.update("ServiceSoftwareOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateResponse]
    }
  }

  /**
    * StorageTypes represents the list of storage related types and their attributes that are available for given InstanceType.
    */
  @js.native
  trait StorageType extends js.Object {
    var StorageSubTypeName: js.UndefOr[StorageSubTypeName]
    var StorageTypeLimits: js.UndefOr[StorageTypeLimitList]
    var StorageTypeName: js.UndefOr[StorageTypeName]
  }

  object StorageType {
    def apply(
        StorageSubTypeName: js.UndefOr[StorageSubTypeName] = js.undefined,
        StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.undefined,
        StorageTypeName: js.UndefOr[StorageTypeName] = js.undefined
    ): StorageType = {
      val __obj = js.Dictionary.empty[js.Any]
      StorageSubTypeName.foreach(__v => __obj.update("StorageSubTypeName", __v.asInstanceOf[js.Any]))
      StorageTypeLimits.foreach(__v => __obj.update("StorageTypeLimits", __v.asInstanceOf[js.Any]))
      StorageTypeName.foreach(__v => __obj.update("StorageTypeName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageType]
    }
  }

  /**
    * Limits that are applicable for given storage type.
    */
  @js.native
  trait StorageTypeLimit extends js.Object {
    var LimitName: js.UndefOr[LimitName]
    var LimitValues: js.UndefOr[LimitValueList]
  }

  object StorageTypeLimit {
    def apply(
        LimitName: js.UndefOr[LimitName] = js.undefined,
        LimitValues: js.UndefOr[LimitValueList] = js.undefined
    ): StorageTypeLimit = {
      val __obj = js.Dictionary.empty[js.Any]
      LimitName.foreach(__v => __obj.update("LimitName", __v.asInstanceOf[js.Any]))
      LimitValues.foreach(__v => __obj.update("LimitValues", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StorageTypeLimit]
    }
  }

  /**
    * Specifies a key value pair for a resource tag.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * Container for the parameters to the <code><a>UpdateElasticsearchDomain</a></code> operation. Specifies the type and number of instances in the domain cluster.
    */
  @js.native
  trait UpdateElasticsearchDomainConfigRequest extends js.Object {
    var DomainName: DomainName
    var AccessPolicies: js.UndefOr[PolicyDocument]
    var AdvancedOptions: js.UndefOr[AdvancedOptions]
    var CognitoOptions: js.UndefOr[CognitoOptions]
    var EBSOptions: js.UndefOr[EBSOptions]
    var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig]
    var LogPublishingOptions: js.UndefOr[LogPublishingOptions]
    var SnapshotOptions: js.UndefOr[SnapshotOptions]
    var VPCOptions: js.UndefOr[VPCOptions]
  }

  object UpdateElasticsearchDomainConfigRequest {
    def apply(
        DomainName: DomainName,
        AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined,
        AdvancedOptions: js.UndefOr[AdvancedOptions] = js.undefined,
        CognitoOptions: js.UndefOr[CognitoOptions] = js.undefined,
        EBSOptions: js.UndefOr[EBSOptions] = js.undefined,
        ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfig] = js.undefined,
        LogPublishingOptions: js.UndefOr[LogPublishingOptions] = js.undefined,
        SnapshotOptions: js.UndefOr[SnapshotOptions] = js.undefined,
        VPCOptions: js.UndefOr[VPCOptions] = js.undefined
    ): UpdateElasticsearchDomainConfigRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      AccessPolicies.foreach(__v => __obj.update("AccessPolicies", __v.asInstanceOf[js.Any]))
      AdvancedOptions.foreach(__v => __obj.update("AdvancedOptions", __v.asInstanceOf[js.Any]))
      CognitoOptions.foreach(__v => __obj.update("CognitoOptions", __v.asInstanceOf[js.Any]))
      EBSOptions.foreach(__v => __obj.update("EBSOptions", __v.asInstanceOf[js.Any]))
      ElasticsearchClusterConfig.foreach(__v => __obj.update("ElasticsearchClusterConfig", __v.asInstanceOf[js.Any]))
      LogPublishingOptions.foreach(__v => __obj.update("LogPublishingOptions", __v.asInstanceOf[js.Any]))
      SnapshotOptions.foreach(__v => __obj.update("SnapshotOptions", __v.asInstanceOf[js.Any]))
      VPCOptions.foreach(__v => __obj.update("VPCOptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateElasticsearchDomainConfigRequest]
    }
  }

  /**
    * The result of an <code>UpdateElasticsearchDomain</code> request. Contains the status of the Elasticsearch domain being updated.
    */
  @js.native
  trait UpdateElasticsearchDomainConfigResponse extends js.Object {
    var DomainConfig: ElasticsearchDomainConfig
  }

  object UpdateElasticsearchDomainConfigResponse {
    def apply(
        DomainConfig: ElasticsearchDomainConfig
    ): UpdateElasticsearchDomainConfigResponse = {
      val __obj = js.Dictionary[js.Any](
        "DomainConfig" -> DomainConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateElasticsearchDomainConfigResponse]
    }
  }

  /**
    * Container for request parameters to <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
    */
  @js.native
  trait UpgradeElasticsearchDomainRequest extends js.Object {
    var DomainName: DomainName
    var TargetVersion: ElasticsearchVersionString
    var PerformCheckOnly: js.UndefOr[Boolean]
  }

  object UpgradeElasticsearchDomainRequest {
    def apply(
        DomainName: DomainName,
        TargetVersion: ElasticsearchVersionString,
        PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
    ): UpgradeElasticsearchDomainRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName"    -> DomainName.asInstanceOf[js.Any],
        "TargetVersion" -> TargetVersion.asInstanceOf[js.Any]
      )

      PerformCheckOnly.foreach(__v => __obj.update("PerformCheckOnly", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeElasticsearchDomainRequest]
    }
  }

  /**
    * Container for response returned by <code> <a>UpgradeElasticsearchDomain</a> </code> operation.
    */
  @js.native
  trait UpgradeElasticsearchDomainResponse extends js.Object {
    var DomainName: js.UndefOr[DomainName]
    var PerformCheckOnly: js.UndefOr[Boolean]
    var TargetVersion: js.UndefOr[ElasticsearchVersionString]
  }

  object UpgradeElasticsearchDomainResponse {
    def apply(
        DomainName: js.UndefOr[DomainName] = js.undefined,
        PerformCheckOnly: js.UndefOr[Boolean] = js.undefined,
        TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
    ): UpgradeElasticsearchDomainResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DomainName.foreach(__v => __obj.update("DomainName", __v.asInstanceOf[js.Any]))
      PerformCheckOnly.foreach(__v => __obj.update("PerformCheckOnly", __v.asInstanceOf[js.Any]))
      TargetVersion.foreach(__v => __obj.update("TargetVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeElasticsearchDomainResponse]
    }
  }

  /**
    * History of the last 10 Upgrades and Upgrade Eligibility Checks.
    */
  @js.native
  trait UpgradeHistory extends js.Object {
    var StartTimestamp: js.UndefOr[StartTimestamp]
    var StepsList: js.UndefOr[UpgradeStepsList]
    var UpgradeName: js.UndefOr[UpgradeName]
    var UpgradeStatus: js.UndefOr[UpgradeStatus]
  }

  object UpgradeHistory {
    def apply(
        StartTimestamp: js.UndefOr[StartTimestamp] = js.undefined,
        StepsList: js.UndefOr[UpgradeStepsList] = js.undefined,
        UpgradeName: js.UndefOr[UpgradeName] = js.undefined,
        UpgradeStatus: js.UndefOr[UpgradeStatus] = js.undefined
    ): UpgradeHistory = {
      val __obj = js.Dictionary.empty[js.Any]
      StartTimestamp.foreach(__v => __obj.update("StartTimestamp", __v.asInstanceOf[js.Any]))
      StepsList.foreach(__v => __obj.update("StepsList", __v.asInstanceOf[js.Any]))
      UpgradeName.foreach(__v => __obj.update("UpgradeName", __v.asInstanceOf[js.Any]))
      UpgradeStatus.foreach(__v => __obj.update("UpgradeStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeHistory]
    }
  }

  object UpgradeStatusEnum {
    val IN_PROGRESS           = "IN_PROGRESS"
    val SUCCEEDED             = "SUCCEEDED"
    val SUCCEEDED_WITH_ISSUES = "SUCCEEDED_WITH_ISSUES"
    val FAILED                = "FAILED"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, SUCCEEDED_WITH_ISSUES, FAILED))
  }

  object UpgradeStepEnum {
    val PRE_UPGRADE_CHECK = "PRE_UPGRADE_CHECK"
    val SNAPSHOT          = "SNAPSHOT"
    val UPGRADE           = "UPGRADE"

    val values = js.Object.freeze(js.Array(PRE_UPGRADE_CHECK, SNAPSHOT, UPGRADE))
  }

  /**
    * Represents a single step of the Upgrade or Upgrade Eligibility Check workflow.
    */
  @js.native
  trait UpgradeStepItem extends js.Object {
    var Issues: js.UndefOr[Issues]
    var ProgressPercent: js.UndefOr[Double]
    var UpgradeStep: js.UndefOr[UpgradeStep]
    var UpgradeStepStatus: js.UndefOr[UpgradeStatus]
  }

  object UpgradeStepItem {
    def apply(
        Issues: js.UndefOr[Issues] = js.undefined,
        ProgressPercent: js.UndefOr[Double] = js.undefined,
        UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined,
        UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.undefined
    ): UpgradeStepItem = {
      val __obj = js.Dictionary.empty[js.Any]
      Issues.foreach(__v => __obj.update("Issues", __v.asInstanceOf[js.Any]))
      ProgressPercent.foreach(__v => __obj.update("ProgressPercent", __v.asInstanceOf[js.Any]))
      UpgradeStep.foreach(__v => __obj.update("UpgradeStep", __v.asInstanceOf[js.Any]))
      UpgradeStepStatus.foreach(__v => __obj.update("UpgradeStepStatus", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpgradeStepItem]
    }
  }

  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank"> VPC Endpoints for Amazon Elasticsearch Service Domains</a>.
    */
  @js.native
  trait VPCDerivedInfo extends js.Object {
    var AvailabilityZones: js.UndefOr[StringList]
    var SecurityGroupIds: js.UndefOr[StringList]
    var SubnetIds: js.UndefOr[StringList]
    var VPCId: js.UndefOr[String]
  }

  object VPCDerivedInfo {
    def apply(
        AvailabilityZones: js.UndefOr[StringList] = js.undefined,
        SecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        SubnetIds: js.UndefOr[StringList] = js.undefined,
        VPCId: js.UndefOr[String] = js.undefined
    ): VPCDerivedInfo = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZones.foreach(__v => __obj.update("AvailabilityZones", __v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.update("SubnetIds", __v.asInstanceOf[js.Any]))
      VPCId.foreach(__v => __obj.update("VPCId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VPCDerivedInfo]
    }
  }

  /**
    * Status of the VPC options for the specified Elasticsearch domain.
    */
  @js.native
  trait VPCDerivedInfoStatus extends js.Object {
    var Options: VPCDerivedInfo
    var Status: OptionStatus
  }

  object VPCDerivedInfoStatus {
    def apply(
        Options: VPCDerivedInfo,
        Status: OptionStatus
    ): VPCDerivedInfoStatus = {
      val __obj = js.Dictionary[js.Any](
        "Options" -> Options.asInstanceOf[js.Any],
        "Status"  -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VPCDerivedInfoStatus]
    }
  }

  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank"> VPC Endpoints for Amazon Elasticsearch Service Domains</a>.
    */
  @js.native
  trait VPCOptions extends js.Object {
    var SecurityGroupIds: js.UndefOr[StringList]
    var SubnetIds: js.UndefOr[StringList]
  }

  object VPCOptions {
    def apply(
        SecurityGroupIds: js.UndefOr[StringList] = js.undefined,
        SubnetIds: js.UndefOr[StringList] = js.undefined
    ): VPCOptions = {
      val __obj = js.Dictionary.empty[js.Any]
      SecurityGroupIds.foreach(__v => __obj.update("SecurityGroupIds", __v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.update("SubnetIds", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VPCOptions]
    }
  }

  /**
    * The type of EBS volume, standard, gp2, or io1. See <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs" target="_blank">Configuring EBS-based Storage</a>for more information.
    */
  object VolumeTypeEnum {
    val standard = "standard"
    val gp2      = "gp2"
    val io1      = "io1"

    val values = js.Object.freeze(js.Array(standard, gp2, io1))
  }

  /**
    * Specifies the zone awareness configuration for the domain cluster, such as the number of availability zones.
    */
  @js.native
  trait ZoneAwarenessConfig extends js.Object {
    var AvailabilityZoneCount: js.UndefOr[IntegerClass]
  }

  object ZoneAwarenessConfig {
    def apply(
        AvailabilityZoneCount: js.UndefOr[IntegerClass] = js.undefined
    ): ZoneAwarenessConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      AvailabilityZoneCount.foreach(__v => __obj.update("AvailabilityZoneCount", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ZoneAwarenessConfig]
    }
  }
}
