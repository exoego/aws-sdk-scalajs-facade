package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  @Factory
  trait ApplicationDependencySummary extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: __string
  }

  /**
    * Policy statement applied to the application.
    */
  @js.native
  @Factory
  trait ApplicationPolicyStatement extends js.Object {
    var Actions: __listOf__string
    var Principals: __listOf__string
    var StatementId: js.UndefOr[__string]
  }

  /**
    * Summary of details about the application.
    */
  @js.native
  @Factory
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
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateApplicationVersionRequest extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: __string
    var SourceCodeArchiveUrl: js.UndefOr[__string]
    var SourceCodeUrl: js.UndefOr[__string]
    var TemplateBody: js.UndefOr[__string]
    var TemplateUrl: js.UndefOr[__string]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateCloudFormationChangeSetResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var ChangeSetId: js.UndefOr[__string]
    var SemanticVersion: js.UndefOr[__string]
    var StackId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateCloudFormationTemplateRequest extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateCloudFormationTemplateResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__string]
    var ExpirationTime: js.UndefOr[__string]
    var SemanticVersion: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
    var TemplateId: js.UndefOr[__string]
    var TemplateUrl: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetApplicationPolicyRequest extends js.Object {
    var ApplicationId: __string
  }

  @js.native
  @Factory
  trait GetApplicationPolicyResponse extends js.Object {
    var Statements: js.UndefOr[__listOfApplicationPolicyStatement]
  }

  @js.native
  @Factory
  trait GetApplicationRequest extends js.Object {
    var ApplicationId: __string
    var SemanticVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetCloudFormationTemplateRequest extends js.Object {
    var ApplicationId: __string
    var TemplateId: __string
  }

  @js.native
  @Factory
  trait GetCloudFormationTemplateResponse extends js.Object {
    var ApplicationId: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__string]
    var ExpirationTime: js.UndefOr[__string]
    var SemanticVersion: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
    var TemplateId: js.UndefOr[__string]
    var TemplateUrl: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListApplicationDependenciesRequest extends js.Object {
    var ApplicationId: __string
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[__string]
    var SemanticVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListApplicationDependenciesResponse extends js.Object {
    var Dependencies: js.UndefOr[__listOfApplicationDependencySummary]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListApplicationVersionsRequest extends js.Object {
    var ApplicationId: __string
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListApplicationVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionSummary]
  }

  @js.native
  @Factory
  trait ListApplicationsRequest extends js.Object {
    var MaxItems: js.UndefOr[MaxItems]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListApplicationsResponse extends js.Object {
    var Applications: js.UndefOr[__listOfApplicationSummary]
    var NextToken: js.UndefOr[__string]
  }

  /**
    * Parameters supported by the application.
    */
  @js.native
  @Factory
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

  /**
    * Parameter value of the application.
    */
  @js.native
  @Factory
  trait ParameterValue extends js.Object {
    var Name: __string
    var Value: __string
  }

  @js.native
  @Factory
  trait PutApplicationPolicyRequest extends js.Object {
    var ApplicationId: __string
    var Statements: __listOfApplicationPolicyStatement
  }

  @js.native
  @Factory
  trait PutApplicationPolicyResponse extends js.Object {
    var Statements: js.UndefOr[__listOfApplicationPolicyStatement]
  }

  /**
    * <p>This property corresponds to the <i>AWS CloudFormation [[https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackConfiguration|RollbackConfiguration]]
    *  </i> Data Type.</p>
    */
  @js.native
  @Factory
  trait RollbackConfiguration extends js.Object {
    var MonitoringTimeInMinutes: js.UndefOr[__integer]
    var RollbackTriggers: js.UndefOr[__listOfRollbackTrigger]
  }

  /**
    * <p>This property corresponds to the <i>AWS CloudFormation [[https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RollbackTrigger|RollbackTrigger]]
    *  </i> Data Type.</p>
    */
  @js.native
  @Factory
  trait RollbackTrigger extends js.Object {
    var Arn: __string
    var Type: __string
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
  @Factory
  trait Tag extends js.Object {
    var Key: __string
    var Value: __string
  }

  @js.native
  @Factory
  trait UpdateApplicationRequest extends js.Object {
    var ApplicationId: __string
    var Author: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var HomePageUrl: js.UndefOr[__string]
    var Labels: js.UndefOr[__listOf__string]
    var ReadmeBody: js.UndefOr[__string]
    var ReadmeUrl: js.UndefOr[__string]
  }

  @js.native
  @Factory
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

  /**
    * Application version details.
    */
  @js.native
  @Factory
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

  /**
    * An application version summary.
    */
  @js.native
  @Factory
  trait VersionSummary extends js.Object {
    var ApplicationId: __string
    var CreationTime: __string
    var SemanticVersion: __string
    var SourceCodeUrl: js.UndefOr[__string]
  }
}
