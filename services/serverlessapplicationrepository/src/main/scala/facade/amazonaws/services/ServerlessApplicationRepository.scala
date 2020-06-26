package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object serverlessapplicationrepository {
  type MaxItems                             = Int
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

    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[CreateApplicationResponse] =
      service.createApplication(params).promise().toFuture
    @inline def createApplicationVersionFuture(
        params: CreateApplicationVersionRequest
    ): Future[CreateApplicationVersionResponse] = service.createApplicationVersion(params).promise().toFuture
    @inline def createCloudFormationChangeSetFuture(
        params: CreateCloudFormationChangeSetRequest
    ): Future[CreateCloudFormationChangeSetResponse] = service.createCloudFormationChangeSet(params).promise().toFuture
    @inline def createCloudFormationTemplateFuture(
        params: CreateCloudFormationTemplateRequest
    ): Future[CreateCloudFormationTemplateResponse] = service.createCloudFormationTemplate(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[js.Object] =
      service.deleteApplication(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationRequest): Future[GetApplicationResponse] =
      service.getApplication(params).promise().toFuture
    @inline def getApplicationPolicyFuture(params: GetApplicationPolicyRequest): Future[GetApplicationPolicyResponse] =
      service.getApplicationPolicy(params).promise().toFuture
    @inline def getCloudFormationTemplateFuture(
        params: GetCloudFormationTemplateRequest
    ): Future[GetCloudFormationTemplateResponse] = service.getCloudFormationTemplate(params).promise().toFuture
    @inline def listApplicationDependenciesFuture(
        params: ListApplicationDependenciesRequest
    ): Future[ListApplicationDependenciesResponse] = service.listApplicationDependencies(params).promise().toFuture
    @inline def listApplicationVersionsFuture(
        params: ListApplicationVersionsRequest
    ): Future[ListApplicationVersionsResponse] = service.listApplicationVersions(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[ListApplicationsResponse] =
      service.listApplications(params).promise().toFuture
    @inline def putApplicationPolicyFuture(params: PutApplicationPolicyRequest): Future[PutApplicationPolicyResponse] =
      service.putApplicationPolicy(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[UpdateApplicationResponse] =
      service.updateApplication(params).promise().toFuture
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
    @inline
    def apply(
        ApplicationId: __string,
        SemanticVersion: __string
    ): ApplicationDependencySummary = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Actions: __listOf__string,
        Principals: __listOf__string,
        StatementId: js.UndefOr[__string] = js.undefined
    ): ApplicationPolicyStatement = {
      val __obj = js.Dynamic.literal(
        "Actions"    -> Actions.asInstanceOf[js.Any],
        "Principals" -> Principals.asInstanceOf[js.Any]
      )

      StatementId.foreach(__v => __obj.updateDynamic("StatementId")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "Author"        -> Author.asInstanceOf[js.Any],
        "Description"   -> Description.asInstanceOf[js.Any],
        "Name"          -> Name.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.updateDynamic("HomePageUrl")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.updateDynamic("SpdxLicenseId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationSummary]
    }
  }

  /**
    * Values that must be specified in order to deploy some applications.
    */
  @js.native
  sealed trait Capability extends js.Any
  object Capability extends js.Object {
    val CAPABILITY_IAM             = "CAPABILITY_IAM".asInstanceOf[Capability]
    val CAPABILITY_NAMED_IAM       = "CAPABILITY_NAMED_IAM".asInstanceOf[Capability]
    val CAPABILITY_AUTO_EXPAND     = "CAPABILITY_AUTO_EXPAND".asInstanceOf[Capability]
    val CAPABILITY_RESOURCE_POLICY = "CAPABILITY_RESOURCE_POLICY".asInstanceOf[Capability]

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
    @inline
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
      val __obj = js.Dynamic.literal(
        "Author"      -> Author.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "Name"        -> Name.asInstanceOf[js.Any]
      )

      HomePageUrl.foreach(__v => __obj.updateDynamic("HomePageUrl")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      LicenseBody.foreach(__v => __obj.updateDynamic("LicenseBody")(__v.asInstanceOf[js.Any]))
      LicenseUrl.foreach(__v => __obj.updateDynamic("LicenseUrl")(__v.asInstanceOf[js.Any]))
      ReadmeBody.foreach(__v => __obj.updateDynamic("ReadmeBody")(__v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.updateDynamic("ReadmeUrl")(__v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.updateDynamic("SemanticVersion")(__v.asInstanceOf[js.Any]))
      SourceCodeArchiveUrl.foreach(__v => __obj.updateDynamic("SourceCodeArchiveUrl")(__v.asInstanceOf[js.Any]))
      SourceCodeUrl.foreach(__v => __obj.updateDynamic("SourceCodeUrl")(__v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.updateDynamic("SpdxLicenseId")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.updateDynamic("TemplateUrl")(__v.asInstanceOf[js.Any]))
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
    var IsVerifiedAuthor: js.UndefOr[__boolean]
    var Labels: js.UndefOr[__listOf__string]
    var LicenseUrl: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var ReadmeUrl: js.UndefOr[__string]
    var SpdxLicenseId: js.UndefOr[__string]
    var VerifiedAuthorUrl: js.UndefOr[__string]
    var Version: js.UndefOr[Version]
  }

  object CreateApplicationResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        Author: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        IsVerifiedAuthor: js.UndefOr[__boolean] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        LicenseUrl: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        ReadmeUrl: js.UndefOr[__string] = js.undefined,
        SpdxLicenseId: js.UndefOr[__string] = js.undefined,
        VerifiedAuthorUrl: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined
    ): CreateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Author.foreach(__v => __obj.updateDynamic("Author")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.updateDynamic("HomePageUrl")(__v.asInstanceOf[js.Any]))
      IsVerifiedAuthor.foreach(__v => __obj.updateDynamic("IsVerifiedAuthor")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      LicenseUrl.foreach(__v => __obj.updateDynamic("LicenseUrl")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.updateDynamic("ReadmeUrl")(__v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.updateDynamic("SpdxLicenseId")(__v.asInstanceOf[js.Any]))
      VerifiedAuthorUrl.foreach(__v => __obj.updateDynamic("VerifiedAuthorUrl")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApplicationId: __string,
        SemanticVersion: __string,
        SourceCodeArchiveUrl: js.UndefOr[__string] = js.undefined,
        SourceCodeUrl: js.UndefOr[__string] = js.undefined,
        TemplateBody: js.UndefOr[__string] = js.undefined,
        TemplateUrl: js.UndefOr[__string] = js.undefined
    ): CreateApplicationVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId"   -> ApplicationId.asInstanceOf[js.Any],
        "SemanticVersion" -> SemanticVersion.asInstanceOf[js.Any]
      )

      SourceCodeArchiveUrl.foreach(__v => __obj.updateDynamic("SourceCodeArchiveUrl")(__v.asInstanceOf[js.Any]))
      SourceCodeUrl.foreach(__v => __obj.updateDynamic("SourceCodeUrl")(__v.asInstanceOf[js.Any]))
      TemplateBody.foreach(__v => __obj.updateDynamic("TemplateBody")(__v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.updateDynamic("TemplateUrl")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ParameterDefinitions.foreach(__v => __obj.updateDynamic("ParameterDefinitions")(__v.asInstanceOf[js.Any]))
      RequiredCapabilities.foreach(__v => __obj.updateDynamic("RequiredCapabilities")(__v.asInstanceOf[js.Any]))
      ResourcesSupported.foreach(__v => __obj.updateDynamic("ResourcesSupported")(__v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.updateDynamic("SemanticVersion")(__v.asInstanceOf[js.Any]))
      SourceCodeArchiveUrl.foreach(__v => __obj.updateDynamic("SourceCodeArchiveUrl")(__v.asInstanceOf[js.Any]))
      SourceCodeUrl.foreach(__v => __obj.updateDynamic("SourceCodeUrl")(__v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.updateDynamic("TemplateUrl")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "StackName"     -> StackName.asInstanceOf[js.Any]
      )

      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      ChangeSetName.foreach(__v => __obj.updateDynamic("ChangeSetName")(__v.asInstanceOf[js.Any]))
      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      NotificationArns.foreach(__v => __obj.updateDynamic("NotificationArns")(__v.asInstanceOf[js.Any]))
      ParameterOverrides.foreach(__v => __obj.updateDynamic("ParameterOverrides")(__v.asInstanceOf[js.Any]))
      ResourceTypes.foreach(__v => __obj.updateDynamic("ResourceTypes")(__v.asInstanceOf[js.Any]))
      RollbackConfiguration.foreach(__v => __obj.updateDynamic("RollbackConfiguration")(__v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.updateDynamic("SemanticVersion")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        ChangeSetId: js.UndefOr[__string] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined,
        StackId: js.UndefOr[__string] = js.undefined
    ): CreateCloudFormationChangeSetResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ChangeSetId.foreach(__v => __obj.updateDynamic("ChangeSetId")(__v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.updateDynamic("SemanticVersion")(__v.asInstanceOf[js.Any]))
      StackId.foreach(__v => __obj.updateDynamic("StackId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCloudFormationChangeSetResponse]
    }
  }

  @js.native
  trait CreateCloudFormationTemplateRequest extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: js.UndefOr[__string]
  }

  object CreateCloudFormationTemplateRequest {
    @inline
    def apply(
        ApplicationId: __string,
        SemanticVersion: js.UndefOr[__string] = js.undefined
    ): CreateCloudFormationTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      SemanticVersion.foreach(__v => __obj.updateDynamic("SemanticVersion")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        ExpirationTime: js.UndefOr[__string] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TemplateId: js.UndefOr[__string] = js.undefined,
        TemplateUrl: js.UndefOr[__string] = js.undefined
    ): CreateCloudFormationTemplateResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.updateDynamic("SemanticVersion")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.updateDynamic("TemplateUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCloudFormationTemplateResponse]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationId: __string
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        ApplicationId: __string
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string
    ): GetApplicationPolicyRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Statements: js.UndefOr[__listOfApplicationPolicyStatement] = js.undefined
    ): GetApplicationPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Statements.foreach(__v => __obj.updateDynamic("Statements")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationPolicyResponse]
    }
  }

  @js.native
  trait GetApplicationRequest extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: js.UndefOr[__string]
  }

  object GetApplicationRequest {
    @inline
    def apply(
        ApplicationId: __string,
        SemanticVersion: js.UndefOr[__string] = js.undefined
    ): GetApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      SemanticVersion.foreach(__v => __obj.updateDynamic("SemanticVersion")(__v.asInstanceOf[js.Any]))
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
    var IsVerifiedAuthor: js.UndefOr[__boolean]
    var Labels: js.UndefOr[__listOf__string]
    var LicenseUrl: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var ReadmeUrl: js.UndefOr[__string]
    var SpdxLicenseId: js.UndefOr[__string]
    var VerifiedAuthorUrl: js.UndefOr[__string]
    var Version: js.UndefOr[Version]
  }

  object GetApplicationResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        Author: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        IsVerifiedAuthor: js.UndefOr[__boolean] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        LicenseUrl: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        ReadmeUrl: js.UndefOr[__string] = js.undefined,
        SpdxLicenseId: js.UndefOr[__string] = js.undefined,
        VerifiedAuthorUrl: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined
    ): GetApplicationResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Author.foreach(__v => __obj.updateDynamic("Author")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.updateDynamic("HomePageUrl")(__v.asInstanceOf[js.Any]))
      IsVerifiedAuthor.foreach(__v => __obj.updateDynamic("IsVerifiedAuthor")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      LicenseUrl.foreach(__v => __obj.updateDynamic("LicenseUrl")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.updateDynamic("ReadmeUrl")(__v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.updateDynamic("SpdxLicenseId")(__v.asInstanceOf[js.Any]))
      VerifiedAuthorUrl.foreach(__v => __obj.updateDynamic("VerifiedAuthorUrl")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationResponse]
    }
  }

  @js.native
  trait GetCloudFormationTemplateRequest extends js.Object {
    var ApplicationId: __string
    var TemplateId: __string
  }

  object GetCloudFormationTemplateRequest {
    @inline
    def apply(
        ApplicationId: __string,
        TemplateId: __string
    ): GetCloudFormationTemplateRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        ExpirationTime: js.UndefOr[__string] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        TemplateId: js.UndefOr[__string] = js.undefined,
        TemplateUrl: js.UndefOr[__string] = js.undefined
    ): GetCloudFormationTemplateResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.updateDynamic("SemanticVersion")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      TemplateUrl.foreach(__v => __obj.updateDynamic("TemplateUrl")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApplicationId: __string,
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        SemanticVersion: js.UndefOr[__string] = js.undefined
    ): ListApplicationDependenciesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SemanticVersion.foreach(__v => __obj.updateDynamic("SemanticVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationDependenciesRequest]
    }
  }

  @js.native
  trait ListApplicationDependenciesResponse extends js.Object {
    var Dependencies: js.UndefOr[__listOfApplicationDependencySummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListApplicationDependenciesResponse {
    @inline
    def apply(
        Dependencies: js.UndefOr[__listOfApplicationDependencySummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListApplicationDependenciesResponse = {
      val __obj = js.Dynamic.literal()
      Dependencies.foreach(__v => __obj.updateDynamic("Dependencies")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApplicationId: __string,
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListApplicationVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationVersionsRequest]
    }
  }

  @js.native
  trait ListApplicationVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionSummary]
  }

  object ListApplicationVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionSummary] = js.undefined
    ): ListApplicationVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationVersionsResponse]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[__string]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        MaxItems: js.UndefOr[MaxItems] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListApplicationsResponse extends js.Object {
    var Applications: js.UndefOr[__listOfApplicationSummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListApplicationsResponse {
    @inline
    def apply(
        Applications: js.UndefOr[__listOfApplicationSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "Name"                  -> Name.asInstanceOf[js.Any],
        "ReferencedByResources" -> ReferencedByResources.asInstanceOf[js.Any]
      )

      AllowedPattern.foreach(__v => __obj.updateDynamic("AllowedPattern")(__v.asInstanceOf[js.Any]))
      AllowedValues.foreach(__v => __obj.updateDynamic("AllowedValues")(__v.asInstanceOf[js.Any]))
      ConstraintDescription.foreach(__v => __obj.updateDynamic("ConstraintDescription")(__v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MaxLength.foreach(__v => __obj.updateDynamic("MaxLength")(__v.asInstanceOf[js.Any]))
      MaxValue.foreach(__v => __obj.updateDynamic("MaxValue")(__v.asInstanceOf[js.Any]))
      MinLength.foreach(__v => __obj.updateDynamic("MinLength")(__v.asInstanceOf[js.Any]))
      MinValue.foreach(__v => __obj.updateDynamic("MinValue")(__v.asInstanceOf[js.Any]))
      NoEcho.foreach(__v => __obj.updateDynamic("NoEcho")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Name: __string,
        Value: __string
    ): ParameterValue = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        Statements: __listOfApplicationPolicyStatement
    ): PutApplicationPolicyRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        Statements: js.UndefOr[__listOfApplicationPolicyStatement] = js.undefined
    ): PutApplicationPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Statements.foreach(__v => __obj.updateDynamic("Statements")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        MonitoringTimeInMinutes: js.UndefOr[__integer] = js.undefined,
        RollbackTriggers: js.UndefOr[__listOfRollbackTrigger] = js.undefined
    ): RollbackConfiguration = {
      val __obj = js.Dynamic.literal()
      MonitoringTimeInMinutes.foreach(__v => __obj.updateDynamic("MonitoringTimeInMinutes")(__v.asInstanceOf[js.Any]))
      RollbackTriggers.foreach(__v => __obj.updateDynamic("RollbackTriggers")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        Arn: __string,
        Type: __string
    ): RollbackTrigger = {
      val __obj = js.Dynamic.literal(
        "Arn"  -> Arn.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RollbackTrigger]
    }
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val PREPARING = "PREPARING".asInstanceOf[Status]
    val ACTIVE    = "ACTIVE".asInstanceOf[Status]
    val EXPIRED   = "EXPIRED".asInstanceOf[Status]

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
    @inline
    def apply(
        Key: __string,
        Value: __string
    ): Tag = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApplicationId: __string,
        Author: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        ReadmeBody: js.UndefOr[__string] = js.undefined,
        ReadmeUrl: js.UndefOr[__string] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      Author.foreach(__v => __obj.updateDynamic("Author")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.updateDynamic("HomePageUrl")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      ReadmeBody.foreach(__v => __obj.updateDynamic("ReadmeBody")(__v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.updateDynamic("ReadmeUrl")(__v.asInstanceOf[js.Any]))
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
    var IsVerifiedAuthor: js.UndefOr[__boolean]
    var Labels: js.UndefOr[__listOf__string]
    var LicenseUrl: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var ReadmeUrl: js.UndefOr[__string]
    var SpdxLicenseId: js.UndefOr[__string]
    var VerifiedAuthorUrl: js.UndefOr[__string]
    var Version: js.UndefOr[Version]
  }

  object UpdateApplicationResponse {
    @inline
    def apply(
        ApplicationId: js.UndefOr[__string] = js.undefined,
        Author: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        HomePageUrl: js.UndefOr[__string] = js.undefined,
        IsVerifiedAuthor: js.UndefOr[__boolean] = js.undefined,
        Labels: js.UndefOr[__listOf__string] = js.undefined,
        LicenseUrl: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        ReadmeUrl: js.UndefOr[__string] = js.undefined,
        SpdxLicenseId: js.UndefOr[__string] = js.undefined,
        VerifiedAuthorUrl: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined
    ): UpdateApplicationResponse = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Author.foreach(__v => __obj.updateDynamic("Author")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      HomePageUrl.foreach(__v => __obj.updateDynamic("HomePageUrl")(__v.asInstanceOf[js.Any]))
      IsVerifiedAuthor.foreach(__v => __obj.updateDynamic("IsVerifiedAuthor")(__v.asInstanceOf[js.Any]))
      Labels.foreach(__v => __obj.updateDynamic("Labels")(__v.asInstanceOf[js.Any]))
      LicenseUrl.foreach(__v => __obj.updateDynamic("LicenseUrl")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ReadmeUrl.foreach(__v => __obj.updateDynamic("ReadmeUrl")(__v.asInstanceOf[js.Any]))
      SpdxLicenseId.foreach(__v => __obj.updateDynamic("SpdxLicenseId")(__v.asInstanceOf[js.Any]))
      VerifiedAuthorUrl.foreach(__v => __obj.updateDynamic("VerifiedAuthorUrl")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "ApplicationId"        -> ApplicationId.asInstanceOf[js.Any],
        "CreationTime"         -> CreationTime.asInstanceOf[js.Any],
        "ParameterDefinitions" -> ParameterDefinitions.asInstanceOf[js.Any],
        "RequiredCapabilities" -> RequiredCapabilities.asInstanceOf[js.Any],
        "ResourcesSupported"   -> ResourcesSupported.asInstanceOf[js.Any],
        "SemanticVersion"      -> SemanticVersion.asInstanceOf[js.Any],
        "TemplateUrl"          -> TemplateUrl.asInstanceOf[js.Any]
      )

      SourceCodeArchiveUrl.foreach(__v => __obj.updateDynamic("SourceCodeArchiveUrl")(__v.asInstanceOf[js.Any]))
      SourceCodeUrl.foreach(__v => __obj.updateDynamic("SourceCodeUrl")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApplicationId: __string,
        CreationTime: __string,
        SemanticVersion: __string,
        SourceCodeUrl: js.UndefOr[__string] = js.undefined
    ): VersionSummary = {
      val __obj = js.Dynamic.literal(
        "ApplicationId"   -> ApplicationId.asInstanceOf[js.Any],
        "CreationTime"    -> CreationTime.asInstanceOf[js.Any],
        "SemanticVersion" -> SemanticVersion.asInstanceOf[js.Any]
      )

      SourceCodeUrl.foreach(__v => __obj.updateDynamic("SourceCodeUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VersionSummary]
    }
  }
}
