package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object opensearchserverless {
  type AccessPolicySummaries = js.Array[AccessPolicySummary]
  type Arn = String
  type ClientToken = String
  type CollectionDetails = js.Array[CollectionDetail]
  type CollectionErrorDetails = js.Array[CollectionErrorDetail]
  type CollectionId = String
  type CollectionIds = js.Array[CollectionId]
  type CollectionName = String
  type CollectionNames = js.Array[CollectionName]
  type CollectionSummaries = js.Array[CollectionSummary]
  type ConfigDescription = String
  type ConfigName = String
  type CreateCollectionRequestDescriptionString = String
  type IndexingCapacityValue = Int
  type ListAccessPoliciesRequestMaxResultsInteger = Int
  type ListAccessPoliciesRequestResourceList = js.Array[Resource]
  type ListCollectionsRequestMaxResultsInteger = Int
  type ListSecurityConfigsRequestMaxResultsInteger = Int
  type ListSecurityPoliciesRequestMaxResultsInteger = Int
  type ListSecurityPoliciesRequestResourceList = js.Array[Resource]
  type ListVpcEndpointsRequestMaxResultsInteger = Int
  type PolicyDescription = String
  type PolicyDocument = String
  type PolicyName = String
  type PolicyVersion = String
  type Resource = String
  type SamlConfigOptionsSessionTimeoutInteger = Int
  type SearchCapacityValue = Int
  type SecurityConfigId = String
  type SecurityConfigSummaries = js.Array[SecurityConfigSummary]
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SecurityPolicySummaries = js.Array[SecurityPolicySummary]
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type UpdateCollectionRequestDescriptionString = String
  type VpcEndpointDetails = js.Array[VpcEndpointDetail]
  type VpcEndpointErrorDetails = js.Array[VpcEndpointErrorDetail]
  type VpcEndpointId = String
  type VpcEndpointIds = js.Array[VpcEndpointId]
  type VpcEndpointName = String
  type VpcEndpointSummaries = js.Array[VpcEndpointSummary]
  type VpcId = String
  type samlGroupAttribute = String
  type samlMetadata = String
  type samlUserAttribute = String

  final class OpenSearchServerlessOps(private val service: OpenSearchServerless) extends AnyVal {

    @inline def batchGetCollectionFuture(params: BatchGetCollectionRequest): Future[BatchGetCollectionResponse] = service.batchGetCollection(params).promise().toFuture
    @inline def batchGetVpcEndpointFuture(params: BatchGetVpcEndpointRequest): Future[BatchGetVpcEndpointResponse] = service.batchGetVpcEndpoint(params).promise().toFuture
    @inline def createAccessPolicyFuture(params: CreateAccessPolicyRequest): Future[CreateAccessPolicyResponse] = service.createAccessPolicy(params).promise().toFuture
    @inline def createCollectionFuture(params: CreateCollectionRequest): Future[CreateCollectionResponse] = service.createCollection(params).promise().toFuture
    @inline def createSecurityConfigFuture(params: CreateSecurityConfigRequest): Future[CreateSecurityConfigResponse] = service.createSecurityConfig(params).promise().toFuture
    @inline def createSecurityPolicyFuture(params: CreateSecurityPolicyRequest): Future[CreateSecurityPolicyResponse] = service.createSecurityPolicy(params).promise().toFuture
    @inline def createVpcEndpointFuture(params: CreateVpcEndpointRequest): Future[CreateVpcEndpointResponse] = service.createVpcEndpoint(params).promise().toFuture
    @inline def deleteAccessPolicyFuture(params: DeleteAccessPolicyRequest): Future[DeleteAccessPolicyResponse] = service.deleteAccessPolicy(params).promise().toFuture
    @inline def deleteCollectionFuture(params: DeleteCollectionRequest): Future[DeleteCollectionResponse] = service.deleteCollection(params).promise().toFuture
    @inline def deleteSecurityConfigFuture(params: DeleteSecurityConfigRequest): Future[DeleteSecurityConfigResponse] = service.deleteSecurityConfig(params).promise().toFuture
    @inline def deleteSecurityPolicyFuture(params: DeleteSecurityPolicyRequest): Future[DeleteSecurityPolicyResponse] = service.deleteSecurityPolicy(params).promise().toFuture
    @inline def deleteVpcEndpointFuture(params: DeleteVpcEndpointRequest): Future[DeleteVpcEndpointResponse] = service.deleteVpcEndpoint(params).promise().toFuture
    @inline def getAccessPolicyFuture(params: GetAccessPolicyRequest): Future[GetAccessPolicyResponse] = service.getAccessPolicy(params).promise().toFuture
    @inline def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResponse] = service.getAccountSettings(params).promise().toFuture
    @inline def getPoliciesStatsFuture(params: GetPoliciesStatsRequest): Future[GetPoliciesStatsResponse] = service.getPoliciesStats(params).promise().toFuture
    @inline def getSecurityConfigFuture(params: GetSecurityConfigRequest): Future[GetSecurityConfigResponse] = service.getSecurityConfig(params).promise().toFuture
    @inline def getSecurityPolicyFuture(params: GetSecurityPolicyRequest): Future[GetSecurityPolicyResponse] = service.getSecurityPolicy(params).promise().toFuture
    @inline def listAccessPoliciesFuture(params: ListAccessPoliciesRequest): Future[ListAccessPoliciesResponse] = service.listAccessPolicies(params).promise().toFuture
    @inline def listCollectionsFuture(params: ListCollectionsRequest): Future[ListCollectionsResponse] = service.listCollections(params).promise().toFuture
    @inline def listSecurityConfigsFuture(params: ListSecurityConfigsRequest): Future[ListSecurityConfigsResponse] = service.listSecurityConfigs(params).promise().toFuture
    @inline def listSecurityPoliciesFuture(params: ListSecurityPoliciesRequest): Future[ListSecurityPoliciesResponse] = service.listSecurityPolicies(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listVpcEndpointsFuture(params: ListVpcEndpointsRequest): Future[ListVpcEndpointsResponse] = service.listVpcEndpoints(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAccessPolicyFuture(params: UpdateAccessPolicyRequest): Future[UpdateAccessPolicyResponse] = service.updateAccessPolicy(params).promise().toFuture
    @inline def updateAccountSettingsFuture(params: UpdateAccountSettingsRequest): Future[UpdateAccountSettingsResponse] = service.updateAccountSettings(params).promise().toFuture
    @inline def updateCollectionFuture(params: UpdateCollectionRequest): Future[UpdateCollectionResponse] = service.updateCollection(params).promise().toFuture
    @inline def updateSecurityConfigFuture(params: UpdateSecurityConfigRequest): Future[UpdateSecurityConfigResponse] = service.updateSecurityConfig(params).promise().toFuture
    @inline def updateSecurityPolicyFuture(params: UpdateSecurityPolicyRequest): Future[UpdateSecurityPolicyResponse] = service.updateSecurityPolicy(params).promise().toFuture
    @inline def updateVpcEndpointFuture(params: UpdateVpcEndpointRequest): Future[UpdateVpcEndpointResponse] = service.updateVpcEndpoint(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/opensearchserverless", JSImport.Namespace, "AWS.OpenSearchServerless")
  class OpenSearchServerless() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchGetCollection(params: BatchGetCollectionRequest): Request[BatchGetCollectionResponse] = js.native
    def batchGetVpcEndpoint(params: BatchGetVpcEndpointRequest): Request[BatchGetVpcEndpointResponse] = js.native
    def createAccessPolicy(params: CreateAccessPolicyRequest): Request[CreateAccessPolicyResponse] = js.native
    def createCollection(params: CreateCollectionRequest): Request[CreateCollectionResponse] = js.native
    def createSecurityConfig(params: CreateSecurityConfigRequest): Request[CreateSecurityConfigResponse] = js.native
    def createSecurityPolicy(params: CreateSecurityPolicyRequest): Request[CreateSecurityPolicyResponse] = js.native
    def createVpcEndpoint(params: CreateVpcEndpointRequest): Request[CreateVpcEndpointResponse] = js.native
    def deleteAccessPolicy(params: DeleteAccessPolicyRequest): Request[DeleteAccessPolicyResponse] = js.native
    def deleteCollection(params: DeleteCollectionRequest): Request[DeleteCollectionResponse] = js.native
    def deleteSecurityConfig(params: DeleteSecurityConfigRequest): Request[DeleteSecurityConfigResponse] = js.native
    def deleteSecurityPolicy(params: DeleteSecurityPolicyRequest): Request[DeleteSecurityPolicyResponse] = js.native
    def deleteVpcEndpoint(params: DeleteVpcEndpointRequest): Request[DeleteVpcEndpointResponse] = js.native
    def getAccessPolicy(params: GetAccessPolicyRequest): Request[GetAccessPolicyResponse] = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse] = js.native
    def getPoliciesStats(params: GetPoliciesStatsRequest): Request[GetPoliciesStatsResponse] = js.native
    def getSecurityConfig(params: GetSecurityConfigRequest): Request[GetSecurityConfigResponse] = js.native
    def getSecurityPolicy(params: GetSecurityPolicyRequest): Request[GetSecurityPolicyResponse] = js.native
    def listAccessPolicies(params: ListAccessPoliciesRequest): Request[ListAccessPoliciesResponse] = js.native
    def listCollections(params: ListCollectionsRequest): Request[ListCollectionsResponse] = js.native
    def listSecurityConfigs(params: ListSecurityConfigsRequest): Request[ListSecurityConfigsResponse] = js.native
    def listSecurityPolicies(params: ListSecurityPoliciesRequest): Request[ListSecurityPoliciesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listVpcEndpoints(params: ListVpcEndpointsRequest): Request[ListVpcEndpointsResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAccessPolicy(params: UpdateAccessPolicyRequest): Request[UpdateAccessPolicyResponse] = js.native
    def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse] = js.native
    def updateCollection(params: UpdateCollectionRequest): Request[UpdateCollectionResponse] = js.native
    def updateSecurityConfig(params: UpdateSecurityConfigRequest): Request[UpdateSecurityConfigResponse] = js.native
    def updateSecurityPolicy(params: UpdateSecurityPolicyRequest): Request[UpdateSecurityPolicyResponse] = js.native
    def updateVpcEndpoint(params: UpdateVpcEndpointRequest): Request[UpdateVpcEndpointResponse] = js.native
  }
  object OpenSearchServerless {
    @inline implicit def toOps(service: OpenSearchServerless): OpenSearchServerlessOps = {
      new OpenSearchServerlessOps(service)
    }
  }

  /** Details about an OpenSearch Serverless access policy.
    */
  @js.native
  trait AccessPolicyDetail extends js.Object {
    var createdDate: js.UndefOr[Double]
    var description: js.UndefOr[PolicyDescription]
    var lastModifiedDate: js.UndefOr[Double]
    var name: js.UndefOr[PolicyName]
    var policy: js.UndefOr[Document]
    var policyVersion: js.UndefOr[PolicyVersion]
    var `type`: js.UndefOr[AccessPolicyType]
  }

  object AccessPolicyDetail {
    @inline
    def apply(
        createdDate: js.UndefOr[Double] = js.undefined,
        description: js.UndefOr[PolicyDescription] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[PolicyName] = js.undefined,
        policy: js.UndefOr[Document] = js.undefined,
        policyVersion: js.UndefOr[PolicyVersion] = js.undefined,
        `type`: js.UndefOr[AccessPolicyType] = js.undefined
    ): AccessPolicyDetail = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      policyVersion.foreach(__v => __obj.updateDynamic("policyVersion")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessPolicyDetail]
    }
  }

  /** Statistics for an OpenSearch Serverless access policy.
    */
  @js.native
  trait AccessPolicyStats extends js.Object {
    var DataPolicyCount: js.UndefOr[Double]
  }

  object AccessPolicyStats {
    @inline
    def apply(
        DataPolicyCount: js.UndefOr[Double] = js.undefined
    ): AccessPolicyStats = {
      val __obj = js.Dynamic.literal()
      DataPolicyCount.foreach(__v => __obj.updateDynamic("DataPolicyCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessPolicyStats]
    }
  }

  /** A summary of the data access policy.
    */
  @js.native
  trait AccessPolicySummary extends js.Object {
    var createdDate: js.UndefOr[Double]
    var description: js.UndefOr[PolicyDescription]
    var lastModifiedDate: js.UndefOr[Double]
    var name: js.UndefOr[PolicyName]
    var policyVersion: js.UndefOr[PolicyVersion]
    var `type`: js.UndefOr[AccessPolicyType]
  }

  object AccessPolicySummary {
    @inline
    def apply(
        createdDate: js.UndefOr[Double] = js.undefined,
        description: js.UndefOr[PolicyDescription] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[PolicyName] = js.undefined,
        policyVersion: js.UndefOr[PolicyVersion] = js.undefined,
        `type`: js.UndefOr[AccessPolicyType] = js.undefined
    ): AccessPolicySummary = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      policyVersion.foreach(__v => __obj.updateDynamic("policyVersion")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessPolicySummary]
    }
  }

  /** OpenSearch Serverless-related information for the current account.
    */
  @js.native
  trait AccountSettingsDetail extends js.Object {
    var capacityLimits: js.UndefOr[CapacityLimits]
  }

  object AccountSettingsDetail {
    @inline
    def apply(
        capacityLimits: js.UndefOr[CapacityLimits] = js.undefined
    ): AccountSettingsDetail = {
      val __obj = js.Dynamic.literal()
      capacityLimits.foreach(__v => __obj.updateDynamic("capacityLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountSettingsDetail]
    }
  }

  @js.native
  trait BatchGetCollectionRequest extends js.Object {
    var ids: js.UndefOr[CollectionIds]
    var names: js.UndefOr[CollectionNames]
  }

  object BatchGetCollectionRequest {
    @inline
    def apply(
        ids: js.UndefOr[CollectionIds] = js.undefined,
        names: js.UndefOr[CollectionNames] = js.undefined
    ): BatchGetCollectionRequest = {
      val __obj = js.Dynamic.literal()
      ids.foreach(__v => __obj.updateDynamic("ids")(__v.asInstanceOf[js.Any]))
      names.foreach(__v => __obj.updateDynamic("names")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetCollectionRequest]
    }
  }

  @js.native
  trait BatchGetCollectionResponse extends js.Object {
    var collectionDetails: js.UndefOr[CollectionDetails]
    var collectionErrorDetails: js.UndefOr[CollectionErrorDetails]
  }

  object BatchGetCollectionResponse {
    @inline
    def apply(
        collectionDetails: js.UndefOr[CollectionDetails] = js.undefined,
        collectionErrorDetails: js.UndefOr[CollectionErrorDetails] = js.undefined
    ): BatchGetCollectionResponse = {
      val __obj = js.Dynamic.literal()
      collectionDetails.foreach(__v => __obj.updateDynamic("collectionDetails")(__v.asInstanceOf[js.Any]))
      collectionErrorDetails.foreach(__v => __obj.updateDynamic("collectionErrorDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetCollectionResponse]
    }
  }

  @js.native
  trait BatchGetVpcEndpointRequest extends js.Object {
    var ids: VpcEndpointIds
  }

  object BatchGetVpcEndpointRequest {
    @inline
    def apply(
        ids: VpcEndpointIds
    ): BatchGetVpcEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "ids" -> ids.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchGetVpcEndpointRequest]
    }
  }

  @js.native
  trait BatchGetVpcEndpointResponse extends js.Object {
    var vpcEndpointDetails: js.UndefOr[VpcEndpointDetails]
    var vpcEndpointErrorDetails: js.UndefOr[VpcEndpointErrorDetails]
  }

  object BatchGetVpcEndpointResponse {
    @inline
    def apply(
        vpcEndpointDetails: js.UndefOr[VpcEndpointDetails] = js.undefined,
        vpcEndpointErrorDetails: js.UndefOr[VpcEndpointErrorDetails] = js.undefined
    ): BatchGetVpcEndpointResponse = {
      val __obj = js.Dynamic.literal()
      vpcEndpointDetails.foreach(__v => __obj.updateDynamic("vpcEndpointDetails")(__v.asInstanceOf[js.Any]))
      vpcEndpointErrorDetails.foreach(__v => __obj.updateDynamic("vpcEndpointErrorDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchGetVpcEndpointResponse]
    }
  }

  /** The maximum capacity limits for all OpenSearch Serverless collections, in OpenSearch Compute Units (OCUs). These limits are used to scale your collections based on the current workload. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html#serverless-scaling|Autoscaling]].
    */
  @js.native
  trait CapacityLimits extends js.Object {
    var maxIndexingCapacityInOCU: js.UndefOr[IndexingCapacityValue]
    var maxSearchCapacityInOCU: js.UndefOr[SearchCapacityValue]
  }

  object CapacityLimits {
    @inline
    def apply(
        maxIndexingCapacityInOCU: js.UndefOr[IndexingCapacityValue] = js.undefined,
        maxSearchCapacityInOCU: js.UndefOr[SearchCapacityValue] = js.undefined
    ): CapacityLimits = {
      val __obj = js.Dynamic.literal()
      maxIndexingCapacityInOCU.foreach(__v => __obj.updateDynamic("maxIndexingCapacityInOCU")(__v.asInstanceOf[js.Any]))
      maxSearchCapacityInOCU.foreach(__v => __obj.updateDynamic("maxSearchCapacityInOCU")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CapacityLimits]
    }
  }

  /** Details about each OpenSearch Serverless collection, including the collection endpoint and the OpenSearch Dashboards endpoint.
    */
  @js.native
  trait CollectionDetail extends js.Object {
    var arn: js.UndefOr[String]
    var collectionEndpoint: js.UndefOr[String]
    var createdDate: js.UndefOr[Double]
    var dashboardEndpoint: js.UndefOr[String]
    var description: js.UndefOr[String]
    var id: js.UndefOr[CollectionId]
    var kmsKeyArn: js.UndefOr[String]
    var lastModifiedDate: js.UndefOr[Double]
    var name: js.UndefOr[CollectionName]
    var status: js.UndefOr[CollectionStatus]
    var `type`: js.UndefOr[CollectionType]
  }

  object CollectionDetail {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        collectionEndpoint: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Double] = js.undefined,
        dashboardEndpoint: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[CollectionId] = js.undefined,
        kmsKeyArn: js.UndefOr[String] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[CollectionName] = js.undefined,
        status: js.UndefOr[CollectionStatus] = js.undefined,
        `type`: js.UndefOr[CollectionType] = js.undefined
    ): CollectionDetail = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      collectionEndpoint.foreach(__v => __obj.updateDynamic("collectionEndpoint")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      dashboardEndpoint.foreach(__v => __obj.updateDynamic("dashboardEndpoint")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      kmsKeyArn.foreach(__v => __obj.updateDynamic("kmsKeyArn")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CollectionDetail]
    }
  }

  /** Error information for an OpenSearch Serverless request.
    */
  @js.native
  trait CollectionErrorDetail extends js.Object {
    var errorCode: js.UndefOr[String]
    var errorMessage: js.UndefOr[String]
    var id: js.UndefOr[CollectionId]
    var name: js.UndefOr[CollectionName]
  }

  object CollectionErrorDetail {
    @inline
    def apply(
        errorCode: js.UndefOr[String] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[CollectionId] = js.undefined,
        name: js.UndefOr[CollectionName] = js.undefined
    ): CollectionErrorDetail = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CollectionErrorDetail]
    }
  }

  /** List of filter keys that you can use for LIST, UPDATE, and DELETE requests to OpenSearch Serverless collections.
    */
  @js.native
  trait CollectionFilters extends js.Object {
    var name: js.UndefOr[CollectionName]
    var status: js.UndefOr[CollectionStatus]
  }

  object CollectionFilters {
    @inline
    def apply(
        name: js.UndefOr[CollectionName] = js.undefined,
        status: js.UndefOr[CollectionStatus] = js.undefined
    ): CollectionFilters = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CollectionFilters]
    }
  }

  /** Details about each OpenSearch Serverless collection.
    */
  @js.native
  trait CollectionSummary extends js.Object {
    var arn: js.UndefOr[String]
    var id: js.UndefOr[CollectionId]
    var name: js.UndefOr[CollectionName]
    var status: js.UndefOr[CollectionStatus]
  }

  object CollectionSummary {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[CollectionId] = js.undefined,
        name: js.UndefOr[CollectionName] = js.undefined,
        status: js.UndefOr[CollectionStatus] = js.undefined
    ): CollectionSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CollectionSummary]
    }
  }

  @js.native
  trait CreateAccessPolicyRequest extends js.Object {
    var name: PolicyName
    var policy: PolicyDocument
    var `type`: AccessPolicyType
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[PolicyDescription]
  }

  object CreateAccessPolicyRequest {
    @inline
    def apply(
        name: PolicyName,
        policy: PolicyDocument,
        `type`: AccessPolicyType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[PolicyDescription] = js.undefined
    ): CreateAccessPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "policy" -> policy.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessPolicyRequest]
    }
  }

  @js.native
  trait CreateAccessPolicyResponse extends js.Object {
    var accessPolicyDetail: js.UndefOr[AccessPolicyDetail]
  }

  object CreateAccessPolicyResponse {
    @inline
    def apply(
        accessPolicyDetail: js.UndefOr[AccessPolicyDetail] = js.undefined
    ): CreateAccessPolicyResponse = {
      val __obj = js.Dynamic.literal()
      accessPolicyDetail.foreach(__v => __obj.updateDynamic("accessPolicyDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessPolicyResponse]
    }
  }

  /** Details about the created OpenSearch Serverless collection.
    */
  @js.native
  trait CreateCollectionDetail extends js.Object {
    var arn: js.UndefOr[String]
    var createdDate: js.UndefOr[Double]
    var description: js.UndefOr[String]
    var id: js.UndefOr[CollectionId]
    var kmsKeyArn: js.UndefOr[String]
    var lastModifiedDate: js.UndefOr[Double]
    var name: js.UndefOr[CollectionName]
    var status: js.UndefOr[CollectionStatus]
    var `type`: js.UndefOr[CollectionType]
  }

  object CreateCollectionDetail {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Double] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[CollectionId] = js.undefined,
        kmsKeyArn: js.UndefOr[String] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[CollectionName] = js.undefined,
        status: js.UndefOr[CollectionStatus] = js.undefined,
        `type`: js.UndefOr[CollectionType] = js.undefined
    ): CreateCollectionDetail = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      kmsKeyArn.foreach(__v => __obj.updateDynamic("kmsKeyArn")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCollectionDetail]
    }
  }

  @js.native
  trait CreateCollectionRequest extends js.Object {
    var name: CollectionName
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[CreateCollectionRequestDescriptionString]
    var tags: js.UndefOr[Tags]
    var `type`: js.UndefOr[CollectionType]
  }

  object CreateCollectionRequest {
    @inline
    def apply(
        name: CollectionName,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[CreateCollectionRequestDescriptionString] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        `type`: js.UndefOr[CollectionType] = js.undefined
    ): CreateCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCollectionRequest]
    }
  }

  @js.native
  trait CreateCollectionResponse extends js.Object {
    var createCollectionDetail: js.UndefOr[CreateCollectionDetail]
  }

  object CreateCollectionResponse {
    @inline
    def apply(
        createCollectionDetail: js.UndefOr[CreateCollectionDetail] = js.undefined
    ): CreateCollectionResponse = {
      val __obj = js.Dynamic.literal()
      createCollectionDetail.foreach(__v => __obj.updateDynamic("createCollectionDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCollectionResponse]
    }
  }

  @js.native
  trait CreateSecurityConfigRequest extends js.Object {
    var name: ConfigName
    var `type`: SecurityConfigType
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[ConfigDescription]
    var samlOptions: js.UndefOr[SamlConfigOptions]
  }

  object CreateSecurityConfigRequest {
    @inline
    def apply(
        name: ConfigName,
        `type`: SecurityConfigType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[ConfigDescription] = js.undefined,
        samlOptions: js.UndefOr[SamlConfigOptions] = js.undefined
    ): CreateSecurityConfigRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      samlOptions.foreach(__v => __obj.updateDynamic("samlOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityConfigRequest]
    }
  }

  @js.native
  trait CreateSecurityConfigResponse extends js.Object {
    var securityConfigDetail: js.UndefOr[SecurityConfigDetail]
  }

  object CreateSecurityConfigResponse {
    @inline
    def apply(
        securityConfigDetail: js.UndefOr[SecurityConfigDetail] = js.undefined
    ): CreateSecurityConfigResponse = {
      val __obj = js.Dynamic.literal()
      securityConfigDetail.foreach(__v => __obj.updateDynamic("securityConfigDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityConfigResponse]
    }
  }

  @js.native
  trait CreateSecurityPolicyRequest extends js.Object {
    var name: PolicyName
    var policy: PolicyDocument
    var `type`: SecurityPolicyType
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[PolicyDescription]
  }

  object CreateSecurityPolicyRequest {
    @inline
    def apply(
        name: PolicyName,
        policy: PolicyDocument,
        `type`: SecurityPolicyType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[PolicyDescription] = js.undefined
    ): CreateSecurityPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "policy" -> policy.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityPolicyRequest]
    }
  }

  @js.native
  trait CreateSecurityPolicyResponse extends js.Object {
    var securityPolicyDetail: js.UndefOr[SecurityPolicyDetail]
  }

  object CreateSecurityPolicyResponse {
    @inline
    def apply(
        securityPolicyDetail: js.UndefOr[SecurityPolicyDetail] = js.undefined
    ): CreateSecurityPolicyResponse = {
      val __obj = js.Dynamic.literal()
      securityPolicyDetail.foreach(__v => __obj.updateDynamic("securityPolicyDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSecurityPolicyResponse]
    }
  }

  /** Creation details for an OpenSearch Serverless-managed interface endpoint. For more information, see [[https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html|Access Amazon OpenSearch Serverless using an interface endpoint]].
    */
  @js.native
  trait CreateVpcEndpointDetail extends js.Object {
    var id: js.UndefOr[VpcEndpointId]
    var name: js.UndefOr[VpcEndpointName]
    var status: js.UndefOr[VpcEndpointStatus]
  }

  object CreateVpcEndpointDetail {
    @inline
    def apply(
        id: js.UndefOr[VpcEndpointId] = js.undefined,
        name: js.UndefOr[VpcEndpointName] = js.undefined,
        status: js.UndefOr[VpcEndpointStatus] = js.undefined
    ): CreateVpcEndpointDetail = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcEndpointDetail]
    }
  }

  @js.native
  trait CreateVpcEndpointRequest extends js.Object {
    var name: VpcEndpointName
    var subnetIds: SubnetIds
    var vpcId: VpcId
    var clientToken: js.UndefOr[ClientToken]
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
  }

  object CreateVpcEndpointRequest {
    @inline
    def apply(
        name: VpcEndpointName,
        subnetIds: SubnetIds,
        vpcId: VpcId,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    ): CreateVpcEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "subnetIds" -> subnetIds.asInstanceOf[js.Any],
        "vpcId" -> vpcId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcEndpointRequest]
    }
  }

  @js.native
  trait CreateVpcEndpointResponse extends js.Object {
    var createVpcEndpointDetail: js.UndefOr[CreateVpcEndpointDetail]
  }

  object CreateVpcEndpointResponse {
    @inline
    def apply(
        createVpcEndpointDetail: js.UndefOr[CreateVpcEndpointDetail] = js.undefined
    ): CreateVpcEndpointResponse = {
      val __obj = js.Dynamic.literal()
      createVpcEndpointDetail.foreach(__v => __obj.updateDynamic("createVpcEndpointDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcEndpointResponse]
    }
  }

  @js.native
  trait DeleteAccessPolicyRequest extends js.Object {
    var name: PolicyName
    var `type`: AccessPolicyType
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteAccessPolicyRequest {
    @inline
    def apply(
        name: PolicyName,
        `type`: AccessPolicyType,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteAccessPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccessPolicyRequest]
    }
  }

  @js.native
  trait DeleteAccessPolicyResponse extends js.Object

  object DeleteAccessPolicyResponse {
    @inline
    def apply(): DeleteAccessPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAccessPolicyResponse]
    }
  }

  /** Details about a deleted OpenSearch Serverless collection.
    */
  @js.native
  trait DeleteCollectionDetail extends js.Object {
    var id: js.UndefOr[CollectionId]
    var name: js.UndefOr[CollectionName]
    var status: js.UndefOr[CollectionStatus]
  }

  object DeleteCollectionDetail {
    @inline
    def apply(
        id: js.UndefOr[CollectionId] = js.undefined,
        name: js.UndefOr[CollectionName] = js.undefined,
        status: js.UndefOr[CollectionStatus] = js.undefined
    ): DeleteCollectionDetail = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCollectionDetail]
    }
  }

  @js.native
  trait DeleteCollectionRequest extends js.Object {
    var id: CollectionId
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteCollectionRequest {
    @inline
    def apply(
        id: CollectionId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCollectionRequest]
    }
  }

  @js.native
  trait DeleteCollectionResponse extends js.Object {
    var deleteCollectionDetail: js.UndefOr[DeleteCollectionDetail]
  }

  object DeleteCollectionResponse {
    @inline
    def apply(
        deleteCollectionDetail: js.UndefOr[DeleteCollectionDetail] = js.undefined
    ): DeleteCollectionResponse = {
      val __obj = js.Dynamic.literal()
      deleteCollectionDetail.foreach(__v => __obj.updateDynamic("deleteCollectionDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCollectionResponse]
    }
  }

  @js.native
  trait DeleteSecurityConfigRequest extends js.Object {
    var id: SecurityConfigId
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteSecurityConfigRequest {
    @inline
    def apply(
        id: SecurityConfigId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteSecurityConfigRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSecurityConfigRequest]
    }
  }

  @js.native
  trait DeleteSecurityConfigResponse extends js.Object

  object DeleteSecurityConfigResponse {
    @inline
    def apply(): DeleteSecurityConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSecurityConfigResponse]
    }
  }

  @js.native
  trait DeleteSecurityPolicyRequest extends js.Object {
    var name: PolicyName
    var `type`: SecurityPolicyType
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteSecurityPolicyRequest {
    @inline
    def apply(
        name: PolicyName,
        `type`: SecurityPolicyType,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteSecurityPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSecurityPolicyRequest]
    }
  }

  @js.native
  trait DeleteSecurityPolicyResponse extends js.Object

  object DeleteSecurityPolicyResponse {
    @inline
    def apply(): DeleteSecurityPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSecurityPolicyResponse]
    }
  }

  /** Deletion details for an OpenSearch Serverless-managed interface endpoint.
    */
  @js.native
  trait DeleteVpcEndpointDetail extends js.Object {
    var id: js.UndefOr[VpcEndpointId]
    var name: js.UndefOr[VpcEndpointName]
    var status: js.UndefOr[VpcEndpointStatus]
  }

  object DeleteVpcEndpointDetail {
    @inline
    def apply(
        id: js.UndefOr[VpcEndpointId] = js.undefined,
        name: js.UndefOr[VpcEndpointName] = js.undefined,
        status: js.UndefOr[VpcEndpointStatus] = js.undefined
    ): DeleteVpcEndpointDetail = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVpcEndpointDetail]
    }
  }

  @js.native
  trait DeleteVpcEndpointRequest extends js.Object {
    var id: VpcEndpointId
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteVpcEndpointRequest {
    @inline
    def apply(
        id: VpcEndpointId,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteVpcEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVpcEndpointRequest]
    }
  }

  @js.native
  trait DeleteVpcEndpointResponse extends js.Object {
    var deleteVpcEndpointDetail: js.UndefOr[DeleteVpcEndpointDetail]
  }

  object DeleteVpcEndpointResponse {
    @inline
    def apply(
        deleteVpcEndpointDetail: js.UndefOr[DeleteVpcEndpointDetail] = js.undefined
    ): DeleteVpcEndpointResponse = {
      val __obj = js.Dynamic.literal()
      deleteVpcEndpointDetail.foreach(__v => __obj.updateDynamic("deleteVpcEndpointDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVpcEndpointResponse]
    }
  }

  @js.native
  trait Document extends js.Object

  object Document {
    @inline
    def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
  }

  @js.native
  trait GetAccessPolicyRequest extends js.Object {
    var name: PolicyName
    var `type`: AccessPolicyType
  }

  object GetAccessPolicyRequest {
    @inline
    def apply(
        name: PolicyName,
        `type`: AccessPolicyType
    ): GetAccessPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAccessPolicyRequest]
    }
  }

  @js.native
  trait GetAccessPolicyResponse extends js.Object {
    var accessPolicyDetail: js.UndefOr[AccessPolicyDetail]
  }

  object GetAccessPolicyResponse {
    @inline
    def apply(
        accessPolicyDetail: js.UndefOr[AccessPolicyDetail] = js.undefined
    ): GetAccessPolicyResponse = {
      val __obj = js.Dynamic.literal()
      accessPolicyDetail.foreach(__v => __obj.updateDynamic("accessPolicyDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessPolicyResponse]
    }
  }

  @js.native
  trait GetAccountSettingsRequest extends js.Object

  object GetAccountSettingsRequest {
    @inline
    def apply(): GetAccountSettingsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAccountSettingsRequest]
    }
  }

  @js.native
  trait GetAccountSettingsResponse extends js.Object {
    var accountSettingsDetail: js.UndefOr[AccountSettingsDetail]
  }

  object GetAccountSettingsResponse {
    @inline
    def apply(
        accountSettingsDetail: js.UndefOr[AccountSettingsDetail] = js.undefined
    ): GetAccountSettingsResponse = {
      val __obj = js.Dynamic.literal()
      accountSettingsDetail.foreach(__v => __obj.updateDynamic("accountSettingsDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountSettingsResponse]
    }
  }

  @js.native
  trait GetPoliciesStatsRequest extends js.Object

  object GetPoliciesStatsRequest {
    @inline
    def apply(): GetPoliciesStatsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPoliciesStatsRequest]
    }
  }

  @js.native
  trait GetPoliciesStatsResponse extends js.Object {
    var AccessPolicyStats: js.UndefOr[AccessPolicyStats]
    var SecurityConfigStats: js.UndefOr[SecurityConfigStats]
    var SecurityPolicyStats: js.UndefOr[SecurityPolicyStats]
    var TotalPolicyCount: js.UndefOr[Double]
  }

  object GetPoliciesStatsResponse {
    @inline
    def apply(
        AccessPolicyStats: js.UndefOr[AccessPolicyStats] = js.undefined,
        SecurityConfigStats: js.UndefOr[SecurityConfigStats] = js.undefined,
        SecurityPolicyStats: js.UndefOr[SecurityPolicyStats] = js.undefined,
        TotalPolicyCount: js.UndefOr[Double] = js.undefined
    ): GetPoliciesStatsResponse = {
      val __obj = js.Dynamic.literal()
      AccessPolicyStats.foreach(__v => __obj.updateDynamic("AccessPolicyStats")(__v.asInstanceOf[js.Any]))
      SecurityConfigStats.foreach(__v => __obj.updateDynamic("SecurityConfigStats")(__v.asInstanceOf[js.Any]))
      SecurityPolicyStats.foreach(__v => __obj.updateDynamic("SecurityPolicyStats")(__v.asInstanceOf[js.Any]))
      TotalPolicyCount.foreach(__v => __obj.updateDynamic("TotalPolicyCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPoliciesStatsResponse]
    }
  }

  @js.native
  trait GetSecurityConfigRequest extends js.Object {
    var id: SecurityConfigId
  }

  object GetSecurityConfigRequest {
    @inline
    def apply(
        id: SecurityConfigId
    ): GetSecurityConfigRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSecurityConfigRequest]
    }
  }

  @js.native
  trait GetSecurityConfigResponse extends js.Object {
    var securityConfigDetail: js.UndefOr[SecurityConfigDetail]
  }

  object GetSecurityConfigResponse {
    @inline
    def apply(
        securityConfigDetail: js.UndefOr[SecurityConfigDetail] = js.undefined
    ): GetSecurityConfigResponse = {
      val __obj = js.Dynamic.literal()
      securityConfigDetail.foreach(__v => __obj.updateDynamic("securityConfigDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSecurityConfigResponse]
    }
  }

  @js.native
  trait GetSecurityPolicyRequest extends js.Object {
    var name: PolicyName
    var `type`: SecurityPolicyType
  }

  object GetSecurityPolicyRequest {
    @inline
    def apply(
        name: PolicyName,
        `type`: SecurityPolicyType
    ): GetSecurityPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSecurityPolicyRequest]
    }
  }

  @js.native
  trait GetSecurityPolicyResponse extends js.Object {
    var securityPolicyDetail: js.UndefOr[SecurityPolicyDetail]
  }

  object GetSecurityPolicyResponse {
    @inline
    def apply(
        securityPolicyDetail: js.UndefOr[SecurityPolicyDetail] = js.undefined
    ): GetSecurityPolicyResponse = {
      val __obj = js.Dynamic.literal()
      securityPolicyDetail.foreach(__v => __obj.updateDynamic("securityPolicyDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSecurityPolicyResponse]
    }
  }

  @js.native
  trait ListAccessPoliciesRequest extends js.Object {
    var `type`: AccessPolicyType
    var maxResults: js.UndefOr[ListAccessPoliciesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
    var resource: js.UndefOr[ListAccessPoliciesRequestResourceList]
  }

  object ListAccessPoliciesRequest {
    @inline
    def apply(
        `type`: AccessPolicyType,
        maxResults: js.UndefOr[ListAccessPoliciesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        resource: js.UndefOr[ListAccessPoliciesRequestResourceList] = js.undefined
    ): ListAccessPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resource.foreach(__v => __obj.updateDynamic("resource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPoliciesRequest]
    }
  }

  @js.native
  trait ListAccessPoliciesResponse extends js.Object {
    var accessPolicySummaries: js.UndefOr[AccessPolicySummaries]
    var nextToken: js.UndefOr[String]
  }

  object ListAccessPoliciesResponse {
    @inline
    def apply(
        accessPolicySummaries: js.UndefOr[AccessPolicySummaries] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListAccessPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      accessPolicySummaries.foreach(__v => __obj.updateDynamic("accessPolicySummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPoliciesResponse]
    }
  }

  @js.native
  trait ListCollectionsRequest extends js.Object {
    var collectionFilters: js.UndefOr[CollectionFilters]
    var maxResults: js.UndefOr[ListCollectionsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object ListCollectionsRequest {
    @inline
    def apply(
        collectionFilters: js.UndefOr[CollectionFilters] = js.undefined,
        maxResults: js.UndefOr[ListCollectionsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListCollectionsRequest = {
      val __obj = js.Dynamic.literal()
      collectionFilters.foreach(__v => __obj.updateDynamic("collectionFilters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCollectionsRequest]
    }
  }

  @js.native
  trait ListCollectionsResponse extends js.Object {
    var collectionSummaries: js.UndefOr[CollectionSummaries]
    var nextToken: js.UndefOr[String]
  }

  object ListCollectionsResponse {
    @inline
    def apply(
        collectionSummaries: js.UndefOr[CollectionSummaries] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListCollectionsResponse = {
      val __obj = js.Dynamic.literal()
      collectionSummaries.foreach(__v => __obj.updateDynamic("collectionSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCollectionsResponse]
    }
  }

  @js.native
  trait ListSecurityConfigsRequest extends js.Object {
    var `type`: SecurityConfigType
    var maxResults: js.UndefOr[ListSecurityConfigsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object ListSecurityConfigsRequest {
    @inline
    def apply(
        `type`: SecurityConfigType,
        maxResults: js.UndefOr[ListSecurityConfigsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListSecurityConfigsRequest = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityConfigsRequest]
    }
  }

  @js.native
  trait ListSecurityConfigsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var securityConfigSummaries: js.UndefOr[SecurityConfigSummaries]
  }

  object ListSecurityConfigsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        securityConfigSummaries: js.UndefOr[SecurityConfigSummaries] = js.undefined
    ): ListSecurityConfigsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      securityConfigSummaries.foreach(__v => __obj.updateDynamic("securityConfigSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityConfigsResponse]
    }
  }

  @js.native
  trait ListSecurityPoliciesRequest extends js.Object {
    var `type`: SecurityPolicyType
    var maxResults: js.UndefOr[ListSecurityPoliciesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
    var resource: js.UndefOr[ListSecurityPoliciesRequestResourceList]
  }

  object ListSecurityPoliciesRequest {
    @inline
    def apply(
        `type`: SecurityPolicyType,
        maxResults: js.UndefOr[ListSecurityPoliciesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        resource: js.UndefOr[ListSecurityPoliciesRequestResourceList] = js.undefined
    ): ListSecurityPoliciesRequest = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resource.foreach(__v => __obj.updateDynamic("resource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityPoliciesRequest]
    }
  }

  @js.native
  trait ListSecurityPoliciesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var securityPolicySummaries: js.UndefOr[SecurityPolicySummaries]
  }

  object ListSecurityPoliciesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        securityPolicySummaries: js.UndefOr[SecurityPolicySummaries] = js.undefined
    ): ListSecurityPoliciesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      securityPolicySummaries.foreach(__v => __obj.updateDynamic("securityPolicySummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSecurityPoliciesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListVpcEndpointsRequest extends js.Object {
    var maxResults: js.UndefOr[ListVpcEndpointsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
    var vpcEndpointFilters: js.UndefOr[VpcEndpointFilters]
  }

  object ListVpcEndpointsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListVpcEndpointsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        vpcEndpointFilters: js.UndefOr[VpcEndpointFilters] = js.undefined
    ): ListVpcEndpointsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      vpcEndpointFilters.foreach(__v => __obj.updateDynamic("vpcEndpointFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVpcEndpointsRequest]
    }
  }

  @js.native
  trait ListVpcEndpointsResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var vpcEndpointSummaries: js.UndefOr[VpcEndpointSummaries]
  }

  object ListVpcEndpointsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        vpcEndpointSummaries: js.UndefOr[VpcEndpointSummaries] = js.undefined
    ): ListVpcEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      vpcEndpointSummaries.foreach(__v => __obj.updateDynamic("vpcEndpointSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVpcEndpointsResponse]
    }
  }

  /** Describes SAML options for an OpenSearch Serverless security configuration in the form of a key-value map.
    */
  @js.native
  trait SamlConfigOptions extends js.Object {
    var metadata: samlMetadata
    var groupAttribute: js.UndefOr[samlGroupAttribute]
    var sessionTimeout: js.UndefOr[SamlConfigOptionsSessionTimeoutInteger]
    var userAttribute: js.UndefOr[samlUserAttribute]
  }

  object SamlConfigOptions {
    @inline
    def apply(
        metadata: samlMetadata,
        groupAttribute: js.UndefOr[samlGroupAttribute] = js.undefined,
        sessionTimeout: js.UndefOr[SamlConfigOptionsSessionTimeoutInteger] = js.undefined,
        userAttribute: js.UndefOr[samlUserAttribute] = js.undefined
    ): SamlConfigOptions = {
      val __obj = js.Dynamic.literal(
        "metadata" -> metadata.asInstanceOf[js.Any]
      )

      groupAttribute.foreach(__v => __obj.updateDynamic("groupAttribute")(__v.asInstanceOf[js.Any]))
      sessionTimeout.foreach(__v => __obj.updateDynamic("sessionTimeout")(__v.asInstanceOf[js.Any]))
      userAttribute.foreach(__v => __obj.updateDynamic("userAttribute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamlConfigOptions]
    }
  }

  /** Details about a security configuration for OpenSearch Serverless.
    */
  @js.native
  trait SecurityConfigDetail extends js.Object {
    var configVersion: js.UndefOr[PolicyVersion]
    var createdDate: js.UndefOr[Double]
    var description: js.UndefOr[ConfigDescription]
    var id: js.UndefOr[SecurityConfigId]
    var lastModifiedDate: js.UndefOr[Double]
    var samlOptions: js.UndefOr[SamlConfigOptions]
    var `type`: js.UndefOr[SecurityConfigType]
  }

  object SecurityConfigDetail {
    @inline
    def apply(
        configVersion: js.UndefOr[PolicyVersion] = js.undefined,
        createdDate: js.UndefOr[Double] = js.undefined,
        description: js.UndefOr[ConfigDescription] = js.undefined,
        id: js.UndefOr[SecurityConfigId] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        samlOptions: js.UndefOr[SamlConfigOptions] = js.undefined,
        `type`: js.UndefOr[SecurityConfigType] = js.undefined
    ): SecurityConfigDetail = {
      val __obj = js.Dynamic.literal()
      configVersion.foreach(__v => __obj.updateDynamic("configVersion")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      samlOptions.foreach(__v => __obj.updateDynamic("samlOptions")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityConfigDetail]
    }
  }

  /** Statistics for an OpenSearch Serverless security configuration.
    */
  @js.native
  trait SecurityConfigStats extends js.Object {
    var SamlConfigCount: js.UndefOr[Double]
  }

  object SecurityConfigStats {
    @inline
    def apply(
        SamlConfigCount: js.UndefOr[Double] = js.undefined
    ): SecurityConfigStats = {
      val __obj = js.Dynamic.literal()
      SamlConfigCount.foreach(__v => __obj.updateDynamic("SamlConfigCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityConfigStats]
    }
  }

  /** A summary of a security configuration for OpenSearch Serverless.
    */
  @js.native
  trait SecurityConfigSummary extends js.Object {
    var configVersion: js.UndefOr[PolicyVersion]
    var createdDate: js.UndefOr[Double]
    var description: js.UndefOr[ConfigDescription]
    var id: js.UndefOr[SecurityConfigId]
    var lastModifiedDate: js.UndefOr[Double]
    var `type`: js.UndefOr[SecurityConfigType]
  }

  object SecurityConfigSummary {
    @inline
    def apply(
        configVersion: js.UndefOr[PolicyVersion] = js.undefined,
        createdDate: js.UndefOr[Double] = js.undefined,
        description: js.UndefOr[ConfigDescription] = js.undefined,
        id: js.UndefOr[SecurityConfigId] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        `type`: js.UndefOr[SecurityConfigType] = js.undefined
    ): SecurityConfigSummary = {
      val __obj = js.Dynamic.literal()
      configVersion.foreach(__v => __obj.updateDynamic("configVersion")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityConfigSummary]
    }
  }

  /** Details about an OpenSearch Serverless security policy.
    */
  @js.native
  trait SecurityPolicyDetail extends js.Object {
    var createdDate: js.UndefOr[Double]
    var description: js.UndefOr[PolicyDescription]
    var lastModifiedDate: js.UndefOr[Double]
    var name: js.UndefOr[PolicyName]
    var policy: js.UndefOr[Document]
    var policyVersion: js.UndefOr[PolicyVersion]
    var `type`: js.UndefOr[SecurityPolicyType]
  }

  object SecurityPolicyDetail {
    @inline
    def apply(
        createdDate: js.UndefOr[Double] = js.undefined,
        description: js.UndefOr[PolicyDescription] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[PolicyName] = js.undefined,
        policy: js.UndefOr[Document] = js.undefined,
        policyVersion: js.UndefOr[PolicyVersion] = js.undefined,
        `type`: js.UndefOr[SecurityPolicyType] = js.undefined
    ): SecurityPolicyDetail = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      policyVersion.foreach(__v => __obj.updateDynamic("policyVersion")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityPolicyDetail]
    }
  }

  /** Statistics for an OpenSearch Serverless security policy.
    */
  @js.native
  trait SecurityPolicyStats extends js.Object {
    var EncryptionPolicyCount: js.UndefOr[Double]
    var NetworkPolicyCount: js.UndefOr[Double]
  }

  object SecurityPolicyStats {
    @inline
    def apply(
        EncryptionPolicyCount: js.UndefOr[Double] = js.undefined,
        NetworkPolicyCount: js.UndefOr[Double] = js.undefined
    ): SecurityPolicyStats = {
      val __obj = js.Dynamic.literal()
      EncryptionPolicyCount.foreach(__v => __obj.updateDynamic("EncryptionPolicyCount")(__v.asInstanceOf[js.Any]))
      NetworkPolicyCount.foreach(__v => __obj.updateDynamic("NetworkPolicyCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityPolicyStats]
    }
  }

  /** A summary of a security policy for OpenSearch Serverless.
    */
  @js.native
  trait SecurityPolicySummary extends js.Object {
    var createdDate: js.UndefOr[Double]
    var description: js.UndefOr[PolicyDescription]
    var lastModifiedDate: js.UndefOr[Double]
    var name: js.UndefOr[PolicyName]
    var policyVersion: js.UndefOr[PolicyVersion]
    var `type`: js.UndefOr[SecurityPolicyType]
  }

  object SecurityPolicySummary {
    @inline
    def apply(
        createdDate: js.UndefOr[Double] = js.undefined,
        description: js.UndefOr[PolicyDescription] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[PolicyName] = js.undefined,
        policyVersion: js.UndefOr[PolicyVersion] = js.undefined,
        `type`: js.UndefOr[SecurityPolicyType] = js.undefined
    ): SecurityPolicySummary = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      policyVersion.foreach(__v => __obj.updateDynamic("policyVersion")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecurityPolicySummary]
    }
  }

  /** A map of key-value pairs associated to an OpenSearch Serverless resource.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAccessPolicyRequest extends js.Object {
    var name: PolicyName
    var policyVersion: PolicyVersion
    var `type`: AccessPolicyType
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[PolicyDescription]
    var policy: js.UndefOr[PolicyDocument]
  }

  object UpdateAccessPolicyRequest {
    @inline
    def apply(
        name: PolicyName,
        policyVersion: PolicyVersion,
        `type`: AccessPolicyType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[PolicyDescription] = js.undefined,
        policy: js.UndefOr[PolicyDocument] = js.undefined
    ): UpdateAccessPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "policyVersion" -> policyVersion.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccessPolicyRequest]
    }
  }

  @js.native
  trait UpdateAccessPolicyResponse extends js.Object {
    var accessPolicyDetail: js.UndefOr[AccessPolicyDetail]
  }

  object UpdateAccessPolicyResponse {
    @inline
    def apply(
        accessPolicyDetail: js.UndefOr[AccessPolicyDetail] = js.undefined
    ): UpdateAccessPolicyResponse = {
      val __obj = js.Dynamic.literal()
      accessPolicyDetail.foreach(__v => __obj.updateDynamic("accessPolicyDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccessPolicyResponse]
    }
  }

  @js.native
  trait UpdateAccountSettingsRequest extends js.Object {
    var capacityLimits: js.UndefOr[CapacityLimits]
  }

  object UpdateAccountSettingsRequest {
    @inline
    def apply(
        capacityLimits: js.UndefOr[CapacityLimits] = js.undefined
    ): UpdateAccountSettingsRequest = {
      val __obj = js.Dynamic.literal()
      capacityLimits.foreach(__v => __obj.updateDynamic("capacityLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountSettingsRequest]
    }
  }

  @js.native
  trait UpdateAccountSettingsResponse extends js.Object {
    var accountSettingsDetail: js.UndefOr[AccountSettingsDetail]
  }

  object UpdateAccountSettingsResponse {
    @inline
    def apply(
        accountSettingsDetail: js.UndefOr[AccountSettingsDetail] = js.undefined
    ): UpdateAccountSettingsResponse = {
      val __obj = js.Dynamic.literal()
      accountSettingsDetail.foreach(__v => __obj.updateDynamic("accountSettingsDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountSettingsResponse]
    }
  }

  /** Details about an updated OpenSearch Serverless collection.
    */
  @js.native
  trait UpdateCollectionDetail extends js.Object {
    var arn: js.UndefOr[String]
    var createdDate: js.UndefOr[Double]
    var description: js.UndefOr[String]
    var id: js.UndefOr[CollectionId]
    var lastModifiedDate: js.UndefOr[Double]
    var name: js.UndefOr[CollectionName]
    var status: js.UndefOr[CollectionStatus]
    var `type`: js.UndefOr[CollectionType]
  }

  object UpdateCollectionDetail {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Double] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[CollectionId] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[CollectionName] = js.undefined,
        status: js.UndefOr[CollectionStatus] = js.undefined,
        `type`: js.UndefOr[CollectionType] = js.undefined
    ): UpdateCollectionDetail = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCollectionDetail]
    }
  }

  @js.native
  trait UpdateCollectionRequest extends js.Object {
    var id: CollectionId
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[UpdateCollectionRequestDescriptionString]
  }

  object UpdateCollectionRequest {
    @inline
    def apply(
        id: CollectionId,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[UpdateCollectionRequestDescriptionString] = js.undefined
    ): UpdateCollectionRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCollectionRequest]
    }
  }

  @js.native
  trait UpdateCollectionResponse extends js.Object {
    var updateCollectionDetail: js.UndefOr[UpdateCollectionDetail]
  }

  object UpdateCollectionResponse {
    @inline
    def apply(
        updateCollectionDetail: js.UndefOr[UpdateCollectionDetail] = js.undefined
    ): UpdateCollectionResponse = {
      val __obj = js.Dynamic.literal()
      updateCollectionDetail.foreach(__v => __obj.updateDynamic("updateCollectionDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCollectionResponse]
    }
  }

  @js.native
  trait UpdateSecurityConfigRequest extends js.Object {
    var configVersion: PolicyVersion
    var id: SecurityConfigId
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[ConfigDescription]
    var samlOptions: js.UndefOr[SamlConfigOptions]
  }

  object UpdateSecurityConfigRequest {
    @inline
    def apply(
        configVersion: PolicyVersion,
        id: SecurityConfigId,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[ConfigDescription] = js.undefined,
        samlOptions: js.UndefOr[SamlConfigOptions] = js.undefined
    ): UpdateSecurityConfigRequest = {
      val __obj = js.Dynamic.literal(
        "configVersion" -> configVersion.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      samlOptions.foreach(__v => __obj.updateDynamic("samlOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityConfigRequest]
    }
  }

  @js.native
  trait UpdateSecurityConfigResponse extends js.Object {
    var securityConfigDetail: js.UndefOr[SecurityConfigDetail]
  }

  object UpdateSecurityConfigResponse {
    @inline
    def apply(
        securityConfigDetail: js.UndefOr[SecurityConfigDetail] = js.undefined
    ): UpdateSecurityConfigResponse = {
      val __obj = js.Dynamic.literal()
      securityConfigDetail.foreach(__v => __obj.updateDynamic("securityConfigDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityConfigResponse]
    }
  }

  @js.native
  trait UpdateSecurityPolicyRequest extends js.Object {
    var name: PolicyName
    var policyVersion: PolicyVersion
    var `type`: SecurityPolicyType
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[PolicyDescription]
    var policy: js.UndefOr[PolicyDocument]
  }

  object UpdateSecurityPolicyRequest {
    @inline
    def apply(
        name: PolicyName,
        policyVersion: PolicyVersion,
        `type`: SecurityPolicyType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[PolicyDescription] = js.undefined,
        policy: js.UndefOr[PolicyDocument] = js.undefined
    ): UpdateSecurityPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "policyVersion" -> policyVersion.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.updateDynamic("policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityPolicyRequest]
    }
  }

  @js.native
  trait UpdateSecurityPolicyResponse extends js.Object {
    var securityPolicyDetail: js.UndefOr[SecurityPolicyDetail]
  }

  object UpdateSecurityPolicyResponse {
    @inline
    def apply(
        securityPolicyDetail: js.UndefOr[SecurityPolicyDetail] = js.undefined
    ): UpdateSecurityPolicyResponse = {
      val __obj = js.Dynamic.literal()
      securityPolicyDetail.foreach(__v => __obj.updateDynamic("securityPolicyDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSecurityPolicyResponse]
    }
  }

  /** Update details for an OpenSearch Serverless-managed interface endpoint.
    */
  @js.native
  trait UpdateVpcEndpointDetail extends js.Object {
    var id: js.UndefOr[VpcEndpointId]
    var lastModifiedDate: js.UndefOr[Double]
    var name: js.UndefOr[VpcEndpointName]
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var status: js.UndefOr[VpcEndpointStatus]
    var subnetIds: js.UndefOr[SubnetIds]
  }

  object UpdateVpcEndpointDetail {
    @inline
    def apply(
        id: js.UndefOr[VpcEndpointId] = js.undefined,
        lastModifiedDate: js.UndefOr[Double] = js.undefined,
        name: js.UndefOr[VpcEndpointName] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        status: js.UndefOr[VpcEndpointStatus] = js.undefined,
        subnetIds: js.UndefOr[SubnetIds] = js.undefined
    ): UpdateVpcEndpointDetail = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastModifiedDate.foreach(__v => __obj.updateDynamic("lastModifiedDate")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVpcEndpointDetail]
    }
  }

  @js.native
  trait UpdateVpcEndpointRequest extends js.Object {
    var id: VpcEndpointId
    var addSecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var addSubnetIds: js.UndefOr[SubnetIds]
    var clientToken: js.UndefOr[ClientToken]
    var removeSecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var removeSubnetIds: js.UndefOr[SubnetIds]
  }

  object UpdateVpcEndpointRequest {
    @inline
    def apply(
        id: VpcEndpointId,
        addSecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        addSubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        removeSecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        removeSubnetIds: js.UndefOr[SubnetIds] = js.undefined
    ): UpdateVpcEndpointRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      addSecurityGroupIds.foreach(__v => __obj.updateDynamic("addSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      addSubnetIds.foreach(__v => __obj.updateDynamic("addSubnetIds")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      removeSecurityGroupIds.foreach(__v => __obj.updateDynamic("removeSecurityGroupIds")(__v.asInstanceOf[js.Any]))
      removeSubnetIds.foreach(__v => __obj.updateDynamic("removeSubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVpcEndpointRequest]
    }
  }

  @js.native
  trait UpdateVpcEndpointResponse extends js.Object {
    var UpdateVpcEndpointDetail: js.UndefOr[UpdateVpcEndpointDetail]
  }

  object UpdateVpcEndpointResponse {
    @inline
    def apply(
        UpdateVpcEndpointDetail: js.UndefOr[UpdateVpcEndpointDetail] = js.undefined
    ): UpdateVpcEndpointResponse = {
      val __obj = js.Dynamic.literal()
      UpdateVpcEndpointDetail.foreach(__v => __obj.updateDynamic("UpdateVpcEndpointDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVpcEndpointResponse]
    }
  }

  /** Details about an OpenSearch Serverless-managed interface endpoint.
    */
  @js.native
  trait VpcEndpointDetail extends js.Object {
    var createdDate: js.UndefOr[Double]
    var id: js.UndefOr[VpcEndpointId]
    var name: js.UndefOr[VpcEndpointName]
    var securityGroupIds: js.UndefOr[SecurityGroupIds]
    var status: js.UndefOr[VpcEndpointStatus]
    var subnetIds: js.UndefOr[SubnetIds]
    var vpcId: js.UndefOr[VpcId]
  }

  object VpcEndpointDetail {
    @inline
    def apply(
        createdDate: js.UndefOr[Double] = js.undefined,
        id: js.UndefOr[VpcEndpointId] = js.undefined,
        name: js.UndefOr[VpcEndpointName] = js.undefined,
        securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        status: js.UndefOr[VpcEndpointStatus] = js.undefined,
        subnetIds: js.UndefOr[SubnetIds] = js.undefined,
        vpcId: js.UndefOr[VpcId] = js.undefined
    ): VpcEndpointDetail = {
      val __obj = js.Dynamic.literal()
      createdDate.foreach(__v => __obj.updateDynamic("createdDate")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      securityGroupIds.foreach(__v => __obj.updateDynamic("securityGroupIds")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      subnetIds.foreach(__v => __obj.updateDynamic("subnetIds")(__v.asInstanceOf[js.Any]))
      vpcId.foreach(__v => __obj.updateDynamic("vpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcEndpointDetail]
    }
  }

  /** Error information for a failed <code>BatchGetVpcEndpoint</code> request.
    */
  @js.native
  trait VpcEndpointErrorDetail extends js.Object {
    var errorCode: js.UndefOr[String]
    var errorMessage: js.UndefOr[String]
    var id: js.UndefOr[VpcEndpointId]
  }

  object VpcEndpointErrorDetail {
    @inline
    def apply(
        errorCode: js.UndefOr[String] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[VpcEndpointId] = js.undefined
    ): VpcEndpointErrorDetail = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcEndpointErrorDetail]
    }
  }

  /** Filter the results of a <code>ListVpcEndpoints</code> request.
    */
  @js.native
  trait VpcEndpointFilters extends js.Object {
    var status: js.UndefOr[VpcEndpointStatus]
  }

  object VpcEndpointFilters {
    @inline
    def apply(
        status: js.UndefOr[VpcEndpointStatus] = js.undefined
    ): VpcEndpointFilters = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcEndpointFilters]
    }
  }

  /** The VPC endpoint object.
    */
  @js.native
  trait VpcEndpointSummary extends js.Object {
    var id: js.UndefOr[VpcEndpointId]
    var name: js.UndefOr[VpcEndpointName]
    var status: js.UndefOr[VpcEndpointStatus]
  }

  object VpcEndpointSummary {
    @inline
    def apply(
        id: js.UndefOr[VpcEndpointId] = js.undefined,
        name: js.UndefOr[VpcEndpointName] = js.undefined,
        status: js.UndefOr[VpcEndpointStatus] = js.undefined
    ): VpcEndpointSummary = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcEndpointSummary]
    }
  }
}
