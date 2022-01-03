package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object finspace {
  type AttributeMap = js.Dictionary[url]
  type DataBundleArn = String
  type DataBundleArns = js.Array[DataBundleArn]
  type Description = String
  type EmailId = String
  type EnvironmentArn = String
  type EnvironmentList = js.Array[Environment]
  type EnvironmentName = String
  type FederationAttributeKey = String
  type FederationProviderName = String
  type IdType = String
  type KmsKeyId = String
  type NameString = String
  type PaginationToken = String
  type ResultLimit = Int
  type SamlMetadataDocument = String
  type SmsDomainUrl = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type url = String
  type urn = String

  final class FinSpaceOps(private val service: FinSpace) extends AnyVal {

    @inline def createEnvironmentFuture(params: CreateEnvironmentRequest): Future[CreateEnvironmentResponse] = service.createEnvironment(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentRequest): Future[DeleteEnvironmentResponse] = service.deleteEnvironment(params).promise().toFuture
    @inline def getEnvironmentFuture(params: GetEnvironmentRequest): Future[GetEnvironmentResponse] = service.getEnvironment(params).promise().toFuture
    @inline def listEnvironmentsFuture(params: ListEnvironmentsRequest): Future[ListEnvironmentsResponse] = service.listEnvironments(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateEnvironmentFuture(params: UpdateEnvironmentRequest): Future[UpdateEnvironmentResponse] = service.updateEnvironment(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/finspace", JSImport.Namespace, "AWS.Finspace")
  class FinSpace() extends js.Object {
    def this(config: AWSConfig) = this()

    def createEnvironment(params: CreateEnvironmentRequest): Request[CreateEnvironmentResponse] = js.native
    def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResponse] = js.native
    def getEnvironment(params: GetEnvironmentRequest): Request[GetEnvironmentResponse] = js.native
    def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateEnvironment(params: UpdateEnvironmentRequest): Request[UpdateEnvironmentResponse] = js.native
  }
  object FinSpace {
    @inline implicit def toOps(service: FinSpace): FinSpaceOps = {
      new FinSpaceOps(service)
    }
  }

  @js.native
  trait CreateEnvironmentRequest extends js.Object {
    var name: EnvironmentName
    var dataBundles: js.UndefOr[DataBundleArns]
    var description: js.UndefOr[Description]
    var federationMode: js.UndefOr[FederationMode]
    var federationParameters: js.UndefOr[FederationParameters]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var superuserParameters: js.UndefOr[SuperuserParameters]
    var tags: js.UndefOr[TagMap]
  }

  object CreateEnvironmentRequest {
    @inline
    def apply(
        name: EnvironmentName,
        dataBundles: js.UndefOr[DataBundleArns] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        federationMode: js.UndefOr[FederationMode] = js.undefined,
        federationParameters: js.UndefOr[FederationParameters] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        superuserParameters: js.UndefOr[SuperuserParameters] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      dataBundles.foreach(__v => __obj.updateDynamic("dataBundles")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      federationMode.foreach(__v => __obj.updateDynamic("federationMode")(__v.asInstanceOf[js.Any]))
      federationParameters.foreach(__v => __obj.updateDynamic("federationParameters")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      superuserParameters.foreach(__v => __obj.updateDynamic("superuserParameters")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentRequest]
    }
  }

  @js.native
  trait CreateEnvironmentResponse extends js.Object {
    var environmentArn: js.UndefOr[EnvironmentArn]
    var environmentId: js.UndefOr[IdType]
    var environmentUrl: js.UndefOr[url]
  }

  object CreateEnvironmentResponse {
    @inline
    def apply(
        environmentArn: js.UndefOr[EnvironmentArn] = js.undefined,
        environmentId: js.UndefOr[IdType] = js.undefined,
        environmentUrl: js.UndefOr[url] = js.undefined
    ): CreateEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      environmentArn.foreach(__v => __obj.updateDynamic("environmentArn")(__v.asInstanceOf[js.Any]))
      environmentId.foreach(__v => __obj.updateDynamic("environmentId")(__v.asInstanceOf[js.Any]))
      environmentUrl.foreach(__v => __obj.updateDynamic("environmentUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentResponse]
    }
  }

  @js.native
  trait DeleteEnvironmentRequest extends js.Object {
    var environmentId: IdType
  }

  object DeleteEnvironmentRequest {
    @inline
    def apply(
        environmentId: IdType
    ): DeleteEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteEnvironmentResponse extends js.Object

  object DeleteEnvironmentResponse {
    @inline
    def apply(): DeleteEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteEnvironmentResponse]
    }
  }

  /** Represents an FinSpace environment.
    */
  @js.native
  trait Environment extends js.Object {
    var awsAccountId: js.UndefOr[IdType]
    var dedicatedServiceAccountId: js.UndefOr[IdType]
    var description: js.UndefOr[Description]
    var environmentArn: js.UndefOr[EnvironmentArn]
    var environmentId: js.UndefOr[IdType]
    var environmentUrl: js.UndefOr[url]
    var federationMode: js.UndefOr[FederationMode]
    var federationParameters: js.UndefOr[FederationParameters]
    var kmsKeyId: js.UndefOr[KmsKeyId]
    var name: js.UndefOr[EnvironmentName]
    var sageMakerStudioDomainUrl: js.UndefOr[SmsDomainUrl]
    var status: js.UndefOr[EnvironmentStatus]
  }

  object Environment {
    @inline
    def apply(
        awsAccountId: js.UndefOr[IdType] = js.undefined,
        dedicatedServiceAccountId: js.UndefOr[IdType] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        environmentArn: js.UndefOr[EnvironmentArn] = js.undefined,
        environmentId: js.UndefOr[IdType] = js.undefined,
        environmentUrl: js.UndefOr[url] = js.undefined,
        federationMode: js.UndefOr[FederationMode] = js.undefined,
        federationParameters: js.UndefOr[FederationParameters] = js.undefined,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        name: js.UndefOr[EnvironmentName] = js.undefined,
        sageMakerStudioDomainUrl: js.UndefOr[SmsDomainUrl] = js.undefined,
        status: js.UndefOr[EnvironmentStatus] = js.undefined
    ): Environment = {
      val __obj = js.Dynamic.literal()
      awsAccountId.foreach(__v => __obj.updateDynamic("awsAccountId")(__v.asInstanceOf[js.Any]))
      dedicatedServiceAccountId.foreach(__v => __obj.updateDynamic("dedicatedServiceAccountId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      environmentArn.foreach(__v => __obj.updateDynamic("environmentArn")(__v.asInstanceOf[js.Any]))
      environmentId.foreach(__v => __obj.updateDynamic("environmentId")(__v.asInstanceOf[js.Any]))
      environmentUrl.foreach(__v => __obj.updateDynamic("environmentUrl")(__v.asInstanceOf[js.Any]))
      federationMode.foreach(__v => __obj.updateDynamic("federationMode")(__v.asInstanceOf[js.Any]))
      federationParameters.foreach(__v => __obj.updateDynamic("federationParameters")(__v.asInstanceOf[js.Any]))
      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      sageMakerStudioDomainUrl.foreach(__v => __obj.updateDynamic("sageMakerStudioDomainUrl")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Environment]
    }
  }

  /** Configuration information when authentication mode is FEDERATED.
    */
  @js.native
  trait FederationParameters extends js.Object {
    var applicationCallBackURL: js.UndefOr[url]
    var attributeMap: js.UndefOr[AttributeMap]
    var federationProviderName: js.UndefOr[FederationProviderName]
    var federationURN: js.UndefOr[urn]
    var samlMetadataDocument: js.UndefOr[SamlMetadataDocument]
    var samlMetadataURL: js.UndefOr[url]
  }

  object FederationParameters {
    @inline
    def apply(
        applicationCallBackURL: js.UndefOr[url] = js.undefined,
        attributeMap: js.UndefOr[AttributeMap] = js.undefined,
        federationProviderName: js.UndefOr[FederationProviderName] = js.undefined,
        federationURN: js.UndefOr[urn] = js.undefined,
        samlMetadataDocument: js.UndefOr[SamlMetadataDocument] = js.undefined,
        samlMetadataURL: js.UndefOr[url] = js.undefined
    ): FederationParameters = {
      val __obj = js.Dynamic.literal()
      applicationCallBackURL.foreach(__v => __obj.updateDynamic("applicationCallBackURL")(__v.asInstanceOf[js.Any]))
      attributeMap.foreach(__v => __obj.updateDynamic("attributeMap")(__v.asInstanceOf[js.Any]))
      federationProviderName.foreach(__v => __obj.updateDynamic("federationProviderName")(__v.asInstanceOf[js.Any]))
      federationURN.foreach(__v => __obj.updateDynamic("federationURN")(__v.asInstanceOf[js.Any]))
      samlMetadataDocument.foreach(__v => __obj.updateDynamic("samlMetadataDocument")(__v.asInstanceOf[js.Any]))
      samlMetadataURL.foreach(__v => __obj.updateDynamic("samlMetadataURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FederationParameters]
    }
  }

  @js.native
  trait GetEnvironmentRequest extends js.Object {
    var environmentId: IdType
  }

  object GetEnvironmentRequest {
    @inline
    def apply(
        environmentId: IdType
    ): GetEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentRequest]
    }
  }

  @js.native
  trait GetEnvironmentResponse extends js.Object {
    var environment: js.UndefOr[Environment]
  }

  object GetEnvironmentResponse {
    @inline
    def apply(
        environment: js.UndefOr[Environment] = js.undefined
    ): GetEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEnvironmentResponse]
    }
  }

  @js.native
  trait ListEnvironmentsRequest extends js.Object {
    var maxResults: js.UndefOr[ResultLimit]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListEnvironmentsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ResultLimit] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListEnvironmentsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsRequest]
    }
  }

  @js.native
  trait ListEnvironmentsResponse extends js.Object {
    var environments: js.UndefOr[EnvironmentList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListEnvironmentsResponse {
    @inline
    def apply(
        environments: js.UndefOr[EnvironmentList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListEnvironmentsResponse = {
      val __obj = js.Dynamic.literal()
      environments.foreach(__v => __obj.updateDynamic("environments")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: EnvironmentArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: EnvironmentArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Configuration information for the superuser.
    */
  @js.native
  trait SuperuserParameters extends js.Object {
    var emailAddress: EmailId
    var firstName: NameString
    var lastName: NameString
  }

  object SuperuserParameters {
    @inline
    def apply(
        emailAddress: EmailId,
        firstName: NameString,
        lastName: NameString
    ): SuperuserParameters = {
      val __obj = js.Dynamic.literal(
        "emailAddress" -> emailAddress.asInstanceOf[js.Any],
        "firstName" -> firstName.asInstanceOf[js.Any],
        "lastName" -> lastName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SuperuserParameters]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: EnvironmentArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: EnvironmentArn,
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
    var resourceArn: EnvironmentArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: EnvironmentArn,
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateEnvironmentRequest extends js.Object {
    var environmentId: IdType
    var description: js.UndefOr[Description]
    var federationMode: js.UndefOr[FederationMode]
    var federationParameters: js.UndefOr[FederationParameters]
    var name: js.UndefOr[EnvironmentName]
  }

  object UpdateEnvironmentRequest {
    @inline
    def apply(
        environmentId: IdType,
        description: js.UndefOr[Description] = js.undefined,
        federationMode: js.UndefOr[FederationMode] = js.undefined,
        federationParameters: js.UndefOr[FederationParameters] = js.undefined,
        name: js.UndefOr[EnvironmentName] = js.undefined
    ): UpdateEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "environmentId" -> environmentId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      federationMode.foreach(__v => __obj.updateDynamic("federationMode")(__v.asInstanceOf[js.Any]))
      federationParameters.foreach(__v => __obj.updateDynamic("federationParameters")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentRequest]
    }
  }

  @js.native
  trait UpdateEnvironmentResponse extends js.Object {
    var environment: js.UndefOr[Environment]
  }

  object UpdateEnvironmentResponse {
    @inline
    def apply(
        environment: js.UndefOr[Environment] = js.undefined
    ): UpdateEnvironmentResponse = {
      val __obj = js.Dynamic.literal()
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentResponse]
    }
  }
}
