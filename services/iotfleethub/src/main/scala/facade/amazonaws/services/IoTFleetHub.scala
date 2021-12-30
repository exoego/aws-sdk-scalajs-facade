package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iotfleethub {
  type ApplicationSummaries = js.Array[ApplicationSummary]
  type Arn = String
  type ClientRequestToken = String
  type Description = String
  type ErrorMessage = String
  type Id = String
  type Name = String
  type NextToken = String
  type ResourceArn = String
  type SsoClientId = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = Double
  type Url = String

  final class IoTFleetHubOps(private val service: IoTFleetHub) extends AnyVal {

    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] = service.createApplication(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[DeleteApplicationResponse] = service.deleteApplication(params).promise().toFuture
    @inline def describeApplicationFuture(params: DescribeApplicationRequest): Future[DescribeApplicationResponse] = service.describeApplication(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] = service.listApplications(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] = service.updateApplication(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iotfleethub", JSImport.Namespace, "AWS.IoTFleetHub")
  class IoTFleetHub() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse] = js.native
    def describeApplication(params: DescribeApplicationRequest): Request[DescribeApplicationResponse] = js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse] = js.native
  }
  object IoTFleetHub {
    @inline implicit def toOps(service: IoTFleetHub): IoTFleetHubOps = {
      new IoTFleetHubOps(service)
    }
  }

  /** A summary of information about a AWS IoT Device Management web application.
    *
    * '''Note:'''Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
    */
  @js.native
  trait ApplicationSummary extends js.Object {
    var applicationId: Id
    var applicationName: Name
    var applicationUrl: Url
    var applicationCreationDate: js.UndefOr[Timestamp]
    var applicationDescription: js.UndefOr[Description]
    var applicationLastUpdateDate: js.UndefOr[Timestamp]
    var applicationState: js.UndefOr[ApplicationState]
  }

  object ApplicationSummary {
    @inline
    def apply(
        applicationId: Id,
        applicationName: Name,
        applicationUrl: Url,
        applicationCreationDate: js.UndefOr[Timestamp] = js.undefined,
        applicationDescription: js.UndefOr[Description] = js.undefined,
        applicationLastUpdateDate: js.UndefOr[Timestamp] = js.undefined,
        applicationState: js.UndefOr[ApplicationState] = js.undefined
    ): ApplicationSummary = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "applicationUrl" -> applicationUrl.asInstanceOf[js.Any]
      )

      applicationCreationDate.foreach(__v => __obj.updateDynamic("applicationCreationDate")(__v.asInstanceOf[js.Any]))
      applicationDescription.foreach(__v => __obj.updateDynamic("applicationDescription")(__v.asInstanceOf[js.Any]))
      applicationLastUpdateDate.foreach(__v => __obj.updateDynamic("applicationLastUpdateDate")(__v.asInstanceOf[js.Any]))
      applicationState.foreach(__v => __obj.updateDynamic("applicationState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSummary]
    }
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var applicationName: Name
    var roleArn: Arn
    var applicationDescription: js.UndefOr[Description]
    var clientToken: js.UndefOr[ClientRequestToken]
    var tags: js.UndefOr[TagMap]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        applicationName: Name,
        roleArn: Arn,
        applicationDescription: js.UndefOr[Description] = js.undefined,
        clientToken: js.UndefOr[ClientRequestToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      applicationDescription.foreach(__v => __obj.updateDynamic("applicationDescription")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var applicationArn: Arn
    var applicationId: Id
  }

  object CreateApplicationResponse {
    @inline
    def apply(
        applicationArn: Arn,
        applicationId: Id
    ): CreateApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "applicationArn" -> applicationArn.asInstanceOf[js.Any],
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var applicationId: Id
    var clientToken: js.UndefOr[ClientRequestToken]
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        applicationId: Id,
        clientToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteApplicationResponse extends js.Object

  object DeleteApplicationResponse {
    @inline
    def apply(): DeleteApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteApplicationResponse]
    }
  }

  @js.native
  trait DescribeApplicationRequest extends js.Object {
    var applicationId: Id
  }

  object DescribeApplicationRequest {
    @inline
    def apply(
        applicationId: Id
    ): DescribeApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeApplicationRequest]
    }
  }

  @js.native
  trait DescribeApplicationResponse extends js.Object {
    var applicationArn: Arn
    var applicationCreationDate: Timestamp
    var applicationId: Id
    var applicationLastUpdateDate: Timestamp
    var applicationName: Name
    var applicationState: ApplicationState
    var applicationUrl: Url
    var roleArn: Arn
    var applicationDescription: js.UndefOr[Description]
    var errorMessage: js.UndefOr[ErrorMessage]
    var ssoClientId: js.UndefOr[SsoClientId]
    var tags: js.UndefOr[TagMap]
  }

  object DescribeApplicationResponse {
    @inline
    def apply(
        applicationArn: Arn,
        applicationCreationDate: Timestamp,
        applicationId: Id,
        applicationLastUpdateDate: Timestamp,
        applicationName: Name,
        applicationState: ApplicationState,
        applicationUrl: Url,
        roleArn: Arn,
        applicationDescription: js.UndefOr[Description] = js.undefined,
        errorMessage: js.UndefOr[ErrorMessage] = js.undefined,
        ssoClientId: js.UndefOr[SsoClientId] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): DescribeApplicationResponse = {
      val __obj = js.Dynamic.literal(
        "applicationArn" -> applicationArn.asInstanceOf[js.Any],
        "applicationCreationDate" -> applicationCreationDate.asInstanceOf[js.Any],
        "applicationId" -> applicationId.asInstanceOf[js.Any],
        "applicationLastUpdateDate" -> applicationLastUpdateDate.asInstanceOf[js.Any],
        "applicationName" -> applicationName.asInstanceOf[js.Any],
        "applicationState" -> applicationState.asInstanceOf[js.Any],
        "applicationUrl" -> applicationUrl.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      applicationDescription.foreach(__v => __obj.updateDynamic("applicationDescription")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      ssoClientId.foreach(__v => __obj.updateDynamic("ssoClientId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationResponse]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var applicationSummaries: js.UndefOr[ApplicationSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsResponse {
    @inline
    def apply(
        applicationSummaries: js.UndefOr[ApplicationSummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      applicationSummaries.foreach(__v => __obj.updateDynamic("applicationSummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn
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

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
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
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
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
  trait UpdateApplicationRequest extends js.Object {
    var applicationId: Id
    var applicationDescription: js.UndefOr[Description]
    var applicationName: js.UndefOr[Name]
    var clientToken: js.UndefOr[ClientRequestToken]
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        applicationId: Id,
        applicationDescription: js.UndefOr[Description] = js.undefined,
        applicationName: js.UndefOr[Name] = js.undefined,
        clientToken: js.UndefOr[ClientRequestToken] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "applicationId" -> applicationId.asInstanceOf[js.Any]
      )

      applicationDescription.foreach(__v => __obj.updateDynamic("applicationDescription")(__v.asInstanceOf[js.Any]))
      applicationName.foreach(__v => __obj.updateDynamic("applicationName")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object

  object UpdateApplicationResponse {
    @inline
    def apply(): UpdateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateApplicationResponse]
    }
  }
}
