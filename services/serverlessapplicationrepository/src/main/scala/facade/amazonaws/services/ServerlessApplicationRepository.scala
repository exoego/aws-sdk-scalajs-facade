package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object serverlessapplicationrepository {
  type Capability                           = String
  type MaxItems                             = Int
  type Status                               = String
  type __boolean                            = Boolean
  type __integer                            = Int
  type __listOfApplicationDependencySummary = js.Array[ApplicationDependencySummary]
  type __listOfApplicationPolicyStatement   = js.Array[ApplicationPolicyStatement]
  type __listOfApplicationSummary           = js.Array[ApplicationSummary]
  type __listOfCapability                   = js.Array[Capability]
  type __listOfParameterDefinition          = js.Array[ParameterDefinition]
  type __listOfParameterValue               = js.Array[ParameterValue]
  type __listOfRollbackTrigger              = js.Array[RollbackTrigger]
  type __listOfTag                          = js.Array[Tag]
  type __listOfVersionSummary               = js.Array[VersionSummary]
  type __listOf__string                     = js.Array[__string]
  type __string                             = String

  implicit final class ServerlessApplicationRepositoryOps(private val service: ServerlessApplicationRepository)
      extends AnyVal {

    def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] =
      service.createApplication(params).promise.toFuture
    def createApplicationVersionFuture(
        params: CreateApplicationVersionRequest
    ): Future[CreateApplicationVersionResponse] = service.createApplicationVersion(params).promise.toFuture
    def createCloudFormationChangeSetFuture(
        params: CreateCloudFormationChangeSetRequest
    ): Future[CreateCloudFormationChangeSetResponse] = service.createCloudFormationChangeSet(params).promise.toFuture
    def createCloudFormationTemplateFuture(
        params: CreateCloudFormationTemplateRequest
    ): Future[CreateCloudFormationTemplateResponse] = service.createCloudFormationTemplate(params).promise.toFuture
    def deleteApplicationFuture(params: DeleteApplicationRequest): Future[js.Object] =
      service.deleteApplication(params).promise.toFuture
    def getApplicationFuture(params: GetApplicationRequest): Future[GetApplicationResponse] =
      service.getApplication(params).promise.toFuture
    def getApplicationPolicyFuture(params: GetApplicationPolicyRequest): Future[GetApplicationPolicyResponse] =
      service.getApplicationPolicy(params).promise.toFuture
    def getCloudFormationTemplateFuture(
        params: GetCloudFormationTemplateRequest
    ): Future[GetCloudFormationTemplateResponse] = service.getCloudFormationTemplate(params).promise.toFuture
    def listApplicationDependenciesFuture(
        params: ListApplicationDependenciesRequest
    ): Future[ListApplicationDependenciesResponse] = service.listApplicationDependencies(params).promise.toFuture
    def listApplicationVersionsFuture(params: ListApplicationVersionsRequest): Future[ListApplicationVersionsResponse] =
      service.listApplicationVersions(params).promise.toFuture
    def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] =
      service.listApplications(params).promise.toFuture
    def putApplicationPolicyFuture(params: PutApplicationPolicyRequest): Future[PutApplicationPolicyResponse] =
      service.putApplicationPolicy(params).promise.toFuture
    def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] =
      service.updateApplication(params).promise.toFuture
  }
}

package serverlessapplicationrepository {
  @js.native
  @JSImport("aws-sdk", "ServerlessApplicationRepository")
  class ServerlessApplicationRepository() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse] = js.native
    def createApplicationVersion(params: CreateApplicationVersionRequest): Request[CreateApplicationVersionResponse] =
      js.native
    def createCloudFormationChangeSet(
        params: CreateCloudFormationChangeSetRequest
    ): Request[CreateCloudFormationChangeSetResponse] = js.native
    def createCloudFormationTemplate(
        params: CreateCloudFormationTemplateRequest
    ): Request[CreateCloudFormationTemplateResponse]                                                     = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[js.Object]                          = js.native
    def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse]                   = js.native
    def getApplicationPolicy(params: GetApplicationPolicyRequest): Request[GetApplicationPolicyResponse] = js.native
    def getCloudFormationTemplate(
        params: GetCloudFormationTemplateRequest
    ): Request[GetCloudFormationTemplateResponse] = js.native
    def listApplicationDependencies(
        params: ListApplicationDependenciesRequest
    ): Request[ListApplicationDependenciesResponse] = js.native
    def listApplicationVersions(params: ListApplicationVersionsRequest): Request[ListApplicationVersionsResponse] =
      js.native
    def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse]             = js.native
    def putApplicationPolicy(params: PutApplicationPolicyRequest): Request[PutApplicationPolicyResponse] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse]          = js.native
  }

  /**
    * A nested application summary.
    */
  @js.native
  trait ApplicationDependencySummary extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: __string
  }

  object ApplicationDependencySummary {
    def apply(
        ApplicationId: __string,
        SemanticVersion: __string
    ): ApplicationDependencySummary = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"   -> ApplicationId.asInstanceOf[js.Any],
        "SemanticVersion" -> SemanticVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ApplicationDependencySummary]
    }
  }

  /**
    * Policy statement applied to the application.
    */
  @js.native
  trait ApplicationPolicyStatement extends js.Object {
    var Actions: __listOf__string
    var Principals: __listOf__string
    var StatementId: js.UndefOr[__string]
  }

  object ApplicationPolicyStatement {
    def apply(
        Actions: __listOf__string,
        Principals: __listOf__string,
        StatementId: js.UndefOr[__string] = js.undefined
    ): ApplicationPolicyStatement = {
      val __obj = js.Dictionary[js.Any](
        "Actions"    -> Actions.asInstanceOf[js.Any],
        "Principals" -> Principals.asInstanceOf[js.Any]
      )

      StatementId.foreach(__v => __obj.update("StatementId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationPolicyStatement]
    }
  }

  /**
    * Summary of details about the application.
    */
  @js.native
  trait ApplicationSummary extends js.Object {
    var ApplicationId: __string
    var Author: __string
    var Description: __string
    var Name: __string
    var CreationTime: js.UndefOr[__string]
    var HomePageUrl: js.UndefOr[__string]
    var Labels: js.UndefOr[__listOf__string]
    var SpdxLicenseId: js.UndefOr[__string]
  }

  object ApplicationSummary {
    def apply(
        ApplicationId: __string,
        Author: __string,
        Description: __string,
        Name: __string,
        CreationTime: js.UndefOr[__string] = js.undefined,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        SpdxLicenseId: js.UndefOr[__string] = js.undefined
    ): ApplicationSummary = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "Author"        -> Author.asInstanceOf[js.Any],
        "Description"   -> Description.asInstanceOf[js.Any],
        "Name"          -> Name.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.update("HomePageUrl", __v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.update("Labels", __v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.update("SpdxLicenseId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSummary]
    }
  }

  /**
    * Values that must be specified in order to deploy some applications.
    */
  object CapabilityEnum {
    val CAPABILITY_IAM             = "CAPABILITY_IAM"
    val CAPABILITY_NAMED_IAM       = "CAPABILITY_NAMED_IAM"
    val CAPABILITY_AUTO_EXPAND     = "CAPABILITY_AUTO_EXPAND"
    val CAPABILITY_RESOURCE_POLICY = "CAPABILITY_RESOURCE_POLICY"

    val values = js.Object.freeze(
      js.Array(CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_AUTO_EXPAND, CAPABILITY_RESOURCE_POLICY)
    )
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var Author: __string
    var Description: __string
    var Name: __string
    var HomePageUrl: js.UndefOr[__string]
    var Labels: js.UndefOr[__listOf__string]
    var LicenseBody: js.UndefOr[__string]
    var LicenseUrl: js.UndefOr[__string]
    var ReadmeBody: js.UndefOr[__string]
    var ReadmeUrl: js.UndefOr[__string]
    var SemanticVersion: js.UndefOr[__string]
    var SourceCodeArchiveUrl: js.UndefOr[__string]
    var SourceCodeUrl: js.UndefOr[__string]
    var SpdxLicenseId: js.UndefOr[__string]
    var TemplateBody: js.UndefOr[__string]
    var TemplateUrl: js.UndefOr[__string]
  }

  object CreateApplicationRequest {
    def apply(
        Author: __string,
        Description: __string,
        Name: __string,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        LicenseBody: js.UndefOr[__string] = js.undefined,
        LicenseUrl: js.UndefOr[__string] = js.undefined,
        ReadmeBody: js.UndefOr[__string] = js.undefined,
        ReadmeUrl: js.UndefOr[__string] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined,
        SourceCodeArchiveUrl: js.UndefOr[__string] = js.undefined,
        SourceCodeUrl: js.UndefOr[__string] = js.undefined,
        SpdxLicenseId: js.UndefOr[__string] = js.undefined,
        TemplateBody: js.UndefOr[__string] = js.undefined,
        TemplateUrl: js.UndefOr[__string] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dictionary[js.Any](
        "Author"      -> Author.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any]
      )

      HomePageUrl.foreach(__v => __obj.update("HomePageUrl", __v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.update("Labels", __v.asInstanceOf[js.Any]))
      LicenseBody.foreach(__v => __obj.update("LicenseBody", __v.asInstanceOf[js.Any]))
      LicenseUrl.foreach(__v => __obj.update("LicenseUrl", __v.asInstanceOf[js.Any]))
      ReadmeBody.foreach(__v => __obj.update("ReadmeBody", __v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.update("ReadmeUrl", __v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.update("SemanticVersion", __v.asInstanceOf[js.Any]))
      SourceCodeArchiveUrl.foreach(__v => __obj.update("SourceCodeArchiveUrl", __v.asInstanceOf[js.Any]))
      SourceCodeUrl.foreach(__v => __obj.update("SourceCodeUrl", __v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.update("SpdxLicenseId", __v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.update("TemplateBody", __v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.update("TemplateUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateApplicationResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var Author: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HomePageUrl: js.UndefOr[__string]
    var Labels: js.UndefOr[__listOf__string]
    var LicenseUrl: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var ReadmeUrl: js.UndefOr[__string]
    var SpdxLicenseId: js.UndefOr[__string]
    var Version: js.UndefOr[Version]
  }

  object CreateApplicationResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        Author: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        LicenseUrl: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        ReadmeUrl: js.UndefOr[__string] = js.undefined,
        SpdxLicenseId: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined
    ): CreateApplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      Author.foreach(__v => __obj.update("Author", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.update("HomePageUrl", __v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.update("Labels", __v.asInstanceOf[js.Any]))
      LicenseUrl.foreach(__v => __obj.update("LicenseUrl", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.update("ReadmeUrl", __v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.update("SpdxLicenseId", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationResponse]
    }
  }

  @js.native
  trait CreateApplicationVersionRequest extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: __string
    var SourceCodeArchiveUrl: js.UndefOr[__string]
    var SourceCodeUrl: js.UndefOr[__string]
    var TemplateBody: js.UndefOr[__string]
    var TemplateUrl: js.UndefOr[__string]
  }

  object CreateApplicationVersionRequest {
    def apply(
        ApplicationId: __string,
        SemanticVersion: __string,
        SourceCodeArchiveUrl: js.UndefOr[__string] = js.undefined,
        SourceCodeUrl: js.UndefOr[__string] = js.undefined,
        TemplateBody: js.UndefOr[__string] = js.undefined,
        TemplateUrl: js.UndefOr[__string] = js.undefined
    ): CreateApplicationVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"   -> ApplicationId.asInstanceOf[js.Any],
        "SemanticVersion" -> SemanticVersion.asInstanceOf[js.Any]
      )

      SourceCodeArchiveUrl.foreach(__v => __obj.update("SourceCodeArchiveUrl", __v.asInstanceOf[js.Any]))
      SourceCodeUrl.foreach(__v => __obj.update("SourceCodeUrl", __v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.update("TemplateBody", __v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.update("TemplateUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationVersionRequest]
    }
  }

  @js.native
  trait CreateApplicationVersionResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__string]
    var ParameterDefinitions: js.UndefOr[__listOfParameterDefinition]
    var RequiredCapabilities: js.UndefOr[__listOfCapability]
    var ResourcesSupported: js.UndefOr[__boolean]
    var SemanticVersion: js.UndefOr[__string]
    var SourceCodeArchiveUrl: js.UndefOr[__string]
    var SourceCodeUrl: js.UndefOr[__string]
    var TemplateUrl: js.UndefOr[__string]
  }

  object CreateApplicationVersionResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        ParameterDefinitions: js.UndefOr[__listOfParameterDefinition] = js.undefined,
        RequiredCapabilities: js.UndefOr[__listOfCapability] = js.undefined,
        ResourcesSupported: js.UndefOr[__boolean] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined,
        SourceCodeArchiveUrl: js.UndefOr[__string] = js.undefined,
        SourceCodeUrl: js.UndefOr[__string] = js.undefined,
        TemplateUrl: js.UndefOr[__string] = js.undefined
    ): CreateApplicationVersionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      ParameterDefinitions.foreach(__v => __obj.update("ParameterDefinitions", __v.asInstanceOf[js.Any]))
      RequiredCapabilities.foreach(__v => __obj.update("RequiredCapabilities", __v.asInstanceOf[js.Any]))
      ResourcesSupported.foreach(__v => __obj.update("ResourcesSupported", __v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.update("SemanticVersion", __v.asInstanceOf[js.Any]))
      SourceCodeArchiveUrl.foreach(__v => __obj.update("SourceCodeArchiveUrl", __v.asInstanceOf[js.Any]))
      SourceCodeUrl.foreach(__v => __obj.update("SourceCodeUrl", __v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.update("TemplateUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationVersionResponse]
    }
  }

  @js.native
  trait CreateCloudFormationChangeSetRequest extends js.Object {
    var ApplicationId: __string
    var StackName: __string
    var Capabilities: js.UndefOr[__listOf__string]
    var ChangeSetName: js.UndefOr[__string]
    var ClientToken: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var NotificationArns: js.UndefOr[__listOf__string]
    var ParameterOverrides: js.UndefOr[__listOfParameterValue]
    var ResourceTypes: js.UndefOr[__listOf__string]
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration]
    var SemanticVersion: js.UndefOr[__string]
    var Tags: js.UndefOr[__listOfTag]
    var TemplateId: js.UndefOr[__string]
  }

  object CreateCloudFormationChangeSetRequest {
    def apply(
        ApplicationId: __string,
        StackName: __string,
        Capabilities: js.UndefOr[__listOf__string] = js.undefined,
        ChangeSetName: js.UndefOr[__string] = js.undefined,
        ClientToken: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        NotificationArns: js.UndefOr[__listOf__string] = js.undefined,
        ParameterOverrides: js.UndefOr[__listOfParameterValue] = js.undefined,
        ResourceTypes: js.UndefOr[__listOf__string] = js.undefined,
        RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__listOfTag] = js.undefined,
        TemplateId: js.UndefOr[__string] = js.undefined
    ): CreateCloudFormationChangeSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "StackName"     -> StackName.asInstanceOf[js.Any]
      )

      Capabilities.foreach(__v => __obj.update("Capabilities", __v.asInstanceOf[js.Any]))
      ChangeSetName.foreach(__v => __obj.update("ChangeSetName", __v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.update("ClientToken", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      NotificationArns.foreach(__v => __obj.update("NotificationArns", __v.asInstanceOf[js.Any]))
      ParameterOverrides.foreach(__v => __obj.update("ParameterOverrides", __v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.update("ResourceTypes", __v.asInstanceOf[js.Any]))
      RollbackConfiguration.foreach(__v => __obj.update("RollbackConfiguration", __v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.update("SemanticVersion", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.update("TemplateId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCloudFormationChangeSetRequest]
    }
  }

  @js.native
  trait CreateCloudFormationChangeSetResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var ChangeSetId: js.UndefOr[__string]
    var SemanticVersion: js.UndefOr[__string]
    var StackId: js.UndefOr[__string]
  }

  object CreateCloudFormationChangeSetResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        ChangeSetId: js.UndefOr[__string] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined,
        StackId: js.UndefOr[__string] = js.undefined
    ): CreateCloudFormationChangeSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      ChangeSetId.foreach(__v => __obj.update("ChangeSetId", __v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.update("SemanticVersion", __v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.update("StackId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCloudFormationChangeSetResponse]
    }
  }

  @js.native
  trait CreateCloudFormationTemplateRequest extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: js.UndefOr[__string]
  }

  object CreateCloudFormationTemplateRequest {
    def apply(
        ApplicationId: __string,
        SemanticVersion: js.UndefOr[__string] = js.undefined
    ): CreateCloudFormationTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      SemanticVersion.foreach(__v => __obj.update("SemanticVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCloudFormationTemplateRequest]
    }
  }

  @js.native
  trait CreateCloudFormationTemplateResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__string]
    var ExpirationTime: js.UndefOr[__string]
    var SemanticVersion: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
    var TemplateId: js.UndefOr[__string]
    var TemplateUrl: js.UndefOr[__string]
  }

  object CreateCloudFormationTemplateResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        ExpirationTime: js.UndefOr[__string] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TemplateId: js.UndefOr[__string] = js.undefined,
        TemplateUrl: js.UndefOr[__string] = js.undefined
    ): CreateCloudFormationTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.update("ExpirationTime", __v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.update("SemanticVersion", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.update("TemplateId", __v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.update("TemplateUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCloudFormationTemplateResponse]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteApplicationRequest {
    def apply(
        ApplicationId: __string
    ): DeleteApplicationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait GetApplicationPolicyRequest extends js.Object {
    var ApplicationId: __string
  }

  object GetApplicationPolicyRequest {
    def apply(
        ApplicationId: __string
    ): GetApplicationPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApplicationPolicyRequest]
    }
  }

  @js.native
  trait GetApplicationPolicyResponse extends js.Object {
    var Statements: js.UndefOr[__listOfApplicationPolicyStatement]
  }

  object GetApplicationPolicyResponse {
    def apply(
        Statements: js.UndefOr[__listOfApplicationPolicyStatement] = js.undefined
    ): GetApplicationPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Statements.foreach(__v => __obj.update("Statements", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationPolicyResponse]
    }
  }

  @js.native
  trait GetApplicationRequest extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: js.UndefOr[__string]
  }

  object GetApplicationRequest {
    def apply(
        ApplicationId: __string,
        SemanticVersion: js.UndefOr[__string] = js.undefined
    ): GetApplicationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      SemanticVersion.foreach(__v => __obj.update("SemanticVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationRequest]
    }
  }

  @js.native
  trait GetApplicationResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var Author: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HomePageUrl: js.UndefOr[__string]
    var Labels: js.UndefOr[__listOf__string]
    var LicenseUrl: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var ReadmeUrl: js.UndefOr[__string]
    var SpdxLicenseId: js.UndefOr[__string]
    var Version: js.UndefOr[Version]
  }

  object GetApplicationResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        Author: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        LicenseUrl: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        ReadmeUrl: js.UndefOr[__string] = js.undefined,
        SpdxLicenseId: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined
    ): GetApplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      Author.foreach(__v => __obj.update("Author", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.update("HomePageUrl", __v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.update("Labels", __v.asInstanceOf[js.Any]))
      LicenseUrl.foreach(__v => __obj.update("LicenseUrl", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.update("ReadmeUrl", __v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.update("SpdxLicenseId", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationResponse]
    }
  }

  @js.native
  trait GetCloudFormationTemplateRequest extends js.Object {
    var ApplicationId: __string
    var TemplateId: __string
  }

  object GetCloudFormationTemplateRequest {
    def apply(
        ApplicationId: __string,
        TemplateId: __string
    ): GetCloudFormationTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "TemplateId"    -> TemplateId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCloudFormationTemplateRequest]
    }
  }

  @js.native
  trait GetCloudFormationTemplateResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__string]
    var ExpirationTime: js.UndefOr[__string]
    var SemanticVersion: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
    var TemplateId: js.UndefOr[__string]
    var TemplateUrl: js.UndefOr[__string]
  }

  object GetCloudFormationTemplateResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        ExpirationTime: js.UndefOr[__string] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TemplateId: js.UndefOr[__string] = js.undefined,
        TemplateUrl: js.UndefOr[__string] = js.undefined
    ): GetCloudFormationTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.update("ExpirationTime", __v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.update("SemanticVersion", __v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.update("Status", __v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.update("TemplateId", __v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.update("TemplateUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCloudFormationTemplateResponse]
    }
  }

  @js.native
  trait ListApplicationDependenciesRequest extends js.Object {
    var ApplicationId: __string
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[__string]
    var SemanticVersion: js.UndefOr[__string]
  }

  object ListApplicationDependenciesRequest {
    def apply(
        ApplicationId: __string,
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined
    ): ListApplicationDependenciesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.update("SemanticVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationDependenciesRequest]
    }
  }

  @js.native
  trait ListApplicationDependenciesResponse extends js.Object {
    var Dependencies: js.UndefOr[__listOfApplicationDependencySummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListApplicationDependenciesResponse {
    def apply(
        Dependencies: js.UndefOr[__listOfApplicationDependencySummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListApplicationDependenciesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Dependencies.foreach(__v => __obj.update("Dependencies", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationDependenciesResponse]
    }
  }

  @js.native
  trait ListApplicationVersionsRequest extends js.Object {
    var ApplicationId: __string
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[__string]
  }

  object ListApplicationVersionsRequest {
    def apply(
        ApplicationId: __string,
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListApplicationVersionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationVersionsRequest]
    }
  }

  @js.native
  trait ListApplicationVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionSummary]
  }

  object ListApplicationVersionsResponse {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionSummary] = js.undefined
    ): ListApplicationVersionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.update("Versions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationVersionsResponse]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[__string]
  }

  object ListApplicationsRequest {
    def apply(
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxItems.foreach(__v => __obj.update("MaxItems", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var Applications: js.UndefOr[__listOfApplicationSummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListApplicationsResponse {
    def apply(
        Applications: js.UndefOr[__listOfApplicationSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListApplicationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Applications.foreach(__v => __obj.update("Applications", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsResponse]
    }
  }

  /**
    * Parameters supported by the application.
    */
  @js.native
  trait ParameterDefinition extends js.Object {
    var Name: __string
    var ReferencedByResources: __listOf__string
    var AllowedPattern: js.UndefOr[__string]
    var AllowedValues: js.UndefOr[__listOf__string]
    var ConstraintDescription: js.UndefOr[__string]
    var DefaultValue: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var MaxLength: js.UndefOr[__integer]
    var MaxValue: js.UndefOr[__integer]
    var MinLength: js.UndefOr[__integer]
    var MinValue: js.UndefOr[__integer]
    var NoEcho: js.UndefOr[__boolean]
    var Type: js.UndefOr[__string]
  }

  object ParameterDefinition {
    def apply(
        Name: __string,
        ReferencedByResources: __listOf__string,
        AllowedPattern: js.UndefOr[__string] = js.undefined,
        AllowedValues: js.UndefOr[__listOf__string] = js.undefined,
        ConstraintDescription: js.UndefOr[__string] = js.undefined,
        DefaultValue: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        MaxLength: js.UndefOr[__integer] = js.undefined,
        MaxValue: js.UndefOr[__integer] = js.undefined,
        MinLength: js.UndefOr[__integer] = js.undefined,
        MinValue: js.UndefOr[__integer] = js.undefined,
        NoEcho: js.UndefOr[__boolean] = js.undefined,
        Type: js.UndefOr[__string] = js.undefined
    ): ParameterDefinition = {
      val __obj = js.Dictionary[js.Any](
        "Name"                  -> Name.asInstanceOf[js.Any],
        "ReferencedByResources" -> ReferencedByResources.asInstanceOf[js.Any]
      )

      AllowedPattern.foreach(__v => __obj.update("AllowedPattern", __v.asInstanceOf[js.Any]))
      AllowedValues.foreach(__v => __obj.update("AllowedValues", __v.asInstanceOf[js.Any]))
      ConstraintDescription.foreach(__v => __obj.update("ConstraintDescription", __v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.update("DefaultValue", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      MaxLength.foreach(__v => __obj.update("MaxLength", __v.asInstanceOf[js.Any]))
      MaxValue.foreach(__v => __obj.update("MaxValue", __v.asInstanceOf[js.Any]))
      MinLength.foreach(__v => __obj.update("MinLength", __v.asInstanceOf[js.Any]))
      MinValue.foreach(__v => __obj.update("MinValue", __v.asInstanceOf[js.Any]))
      NoEcho.foreach(__v => __obj.update("NoEcho", __v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.update("Type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterDefinition]
    }
  }

  /**
    * Parameter value of the application.
    */
  @js.native
  trait ParameterValue extends js.Object {
    var Name: __string
    var Value: __string
  }

  object ParameterValue {
    def apply(
        Name: __string,
        Value: __string
    ): ParameterValue = {
      val __obj = js.Dictionary[js.Any](
        "Name"  -> Name.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ParameterValue]
    }
  }

  @js.native
  trait PutApplicationPolicyRequest extends js.Object {
    var ApplicationId: __string
    var Statements: __listOfApplicationPolicyStatement
  }

  object PutApplicationPolicyRequest {
    def apply(
        ApplicationId: __string,
        Statements: __listOfApplicationPolicyStatement
    ): PutApplicationPolicyRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "Statements"    -> Statements.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutApplicationPolicyRequest]
    }
  }

  @js.native
  trait PutApplicationPolicyResponse extends js.Object {
    var Statements: js.UndefOr[__listOfApplicationPolicyStatement]
  }

  object PutApplicationPolicyResponse {
    def apply(
        Statements: js.UndefOr[__listOfApplicationPolicyStatement] = js.undefined
    ): PutApplicationPolicyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Statements.foreach(__v => __obj.update("Statements", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutApplicationPolicyResponse]
    }
  }

  /**
    * <p>This property corresponds to the <i>AWS CloudFormation [[https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration|RollbackConfiguration]]
    *  </i> Data Type.</p>
    */
  @js.native
  trait RollbackConfiguration extends js.Object {
    var MonitoringTimeInMinutes: js.UndefOr[__integer]
    var RollbackTriggers: js.UndefOr[__listOfRollbackTrigger]
  }

  object RollbackConfiguration {
    def apply(
        MonitoringTimeInMinutes: js.UndefOr[__integer] = js.undefined,
        RollbackTriggers: js.UndefOr[__listOfRollbackTrigger] = js.undefined
    ): RollbackConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      MonitoringTimeInMinutes.foreach(__v => __obj.update("MonitoringTimeInMinutes", __v.asInstanceOf[js.Any]))
      RollbackTriggers.foreach(__v => __obj.update("RollbackTriggers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RollbackConfiguration]
    }
  }

  /**
    * <p>This property corresponds to the <i>AWS CloudFormation [[https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger|RollbackTrigger]]
    *  </i> Data Type.</p>
    */
  @js.native
  trait RollbackTrigger extends js.Object {
    var Arn: __string
    var Type: __string
  }

  object RollbackTrigger {
    def apply(
        Arn: __string,
        Type: __string
    ): RollbackTrigger = {
      val __obj = js.Dictionary[js.Any](
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RollbackTrigger]
    }
  }

  object StatusEnum {
    val PREPARING = "PREPARING"
    val ACTIVE    = "ACTIVE"
    val EXPIRED   = "EXPIRED"

    val values = js.Object.freeze(js.Array(PREPARING, ACTIVE, EXPIRED))
  }

  /**
    * <p>This property corresponds to the <i>AWS CloudFormation [[https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/Tag|Tag]]
    *  </i> Data Type.</p>
    */
  @js.native
  trait Tag extends js.Object {
    var Key: __string
    var Value: __string
  }

  object Tag {
    def apply(
        Key: __string,
        Value: __string
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var ApplicationId: __string
    var Author: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HomePageUrl: js.UndefOr[__string]
    var Labels: js.UndefOr[__listOf__string]
    var ReadmeBody: js.UndefOr[__string]
    var ReadmeUrl: js.UndefOr[__string]
  }

  object UpdateApplicationRequest {
    def apply(
        ApplicationId: __string,
        Author: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        ReadmeBody: js.UndefOr[__string] = js.undefined,
        ReadmeUrl: js.UndefOr[__string] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      Author.foreach(__v => __obj.update("Author", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.update("HomePageUrl", __v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.update("Labels", __v.asInstanceOf[js.Any]))
      ReadmeBody.foreach(__v => __obj.update("ReadmeBody", __v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.update("ReadmeUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateApplicationResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var Author: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HomePageUrl: js.UndefOr[__string]
    var Labels: js.UndefOr[__listOf__string]
    var LicenseUrl: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var ReadmeUrl: js.UndefOr[__string]
    var SpdxLicenseId: js.UndefOr[__string]
    var Version: js.UndefOr[Version]
  }

  object UpdateApplicationResponse {
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        Author: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        LicenseUrl: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        ReadmeUrl: js.UndefOr[__string] = js.undefined,
        SpdxLicenseId: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined
    ): UpdateApplicationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApplicationId.foreach(__v => __obj.update("ApplicationId", __v.asInstanceOf[js.Any]))
      Author.foreach(__v => __obj.update("Author", __v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.update("CreationTime", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.update("HomePageUrl", __v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.update("Labels", __v.asInstanceOf[js.Any]))
      LicenseUrl.foreach(__v => __obj.update("LicenseUrl", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.update("ReadmeUrl", __v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.update("SpdxLicenseId", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationResponse]
    }
  }

  /**
    * Application version details.
    */
  @js.native
  trait Version extends js.Object {
    var ApplicationId: __string
    var CreationTime: __string
    var ParameterDefinitions: __listOfParameterDefinition
    var RequiredCapabilities: __listOfCapability
    var ResourcesSupported: __boolean
    var SemanticVersion: __string
    var TemplateUrl: __string
    var SourceCodeArchiveUrl: js.UndefOr[__string]
    var SourceCodeUrl: js.UndefOr[__string]
  }

  object Version {
    def apply(
        ApplicationId: __string,
        CreationTime: __string,
        ParameterDefinitions: __listOfParameterDefinition,
        RequiredCapabilities: __listOfCapability,
        ResourcesSupported: __boolean,
        SemanticVersion: __string,
        TemplateUrl: __string,
        SourceCodeArchiveUrl: js.UndefOr[__string] = js.undefined,
        SourceCodeUrl: js.UndefOr[__string] = js.undefined
    ): Version = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"        -> ApplicationId.asInstanceOf[js.Any],
        "CreationTime"         -> CreationTime.asInstanceOf[js.Any],
        "ParameterDefinitions" -> ParameterDefinitions.asInstanceOf[js.Any],
        "RequiredCapabilities" -> RequiredCapabilities.asInstanceOf[js.Any],
        "ResourcesSupported"   -> ResourcesSupported.asInstanceOf[js.Any],
        "SemanticVersion"      -> SemanticVersion.asInstanceOf[js.Any],
        "TemplateUrl"          -> TemplateUrl.asInstanceOf[js.Any]
      )

      SourceCodeArchiveUrl.foreach(__v => __obj.update("SourceCodeArchiveUrl", __v.asInstanceOf[js.Any]))
      SourceCodeUrl.foreach(__v => __obj.update("SourceCodeUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Version]
    }
  }

  /**
    * An application version summary.
    */
  @js.native
  trait VersionSummary extends js.Object {
    var ApplicationId: __string
    var CreationTime: __string
    var SemanticVersion: __string
    var SourceCodeUrl: js.UndefOr[__string]
  }

  object VersionSummary {
    def apply(
        ApplicationId: __string,
        CreationTime: __string,
        SemanticVersion: __string,
        SourceCodeUrl: js.UndefOr[__string] = js.undefined
    ): VersionSummary = {
      val __obj = js.Dictionary[js.Any](
        "ApplicationId"   -> ApplicationId.asInstanceOf[js.Any],
        "CreationTime"    -> CreationTime.asInstanceOf[js.Any],
        "SemanticVersion" -> SemanticVersion.asInstanceOf[js.Any]
      )

      SourceCodeUrl.foreach(__v => __obj.update("SourceCodeUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VersionSummary]
    }
  }
}
