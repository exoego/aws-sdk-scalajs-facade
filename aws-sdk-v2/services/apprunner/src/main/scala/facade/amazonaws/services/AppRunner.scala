package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object apprunner {
  type ASConfigMaxConcurrency = Int
  type ASConfigMaxSize = Int
  type ASConfigMinSize = Int
  type AppRunnerResourceArn = String
  type AutoScalingConfigurationName = String
  type AutoScalingConfigurationSummaryList = js.Array[AutoScalingConfigurationSummary]
  type BuildCommand = String
  type CertificateValidationRecordList = js.Array[CertificateValidationRecord]
  type ConnectionName = String
  type ConnectionSummaryList = js.Array[ConnectionSummary]
  type Cpu = String
  type CustomDomainList = js.Array[CustomDomain]
  type DescribeCustomDomainsMaxResults = Int
  type DomainName = String
  type HealthCheckHealthyThreshold = Int
  type HealthCheckInterval = Int
  type HealthCheckPath = String
  type HealthCheckTimeout = Int
  type HealthCheckUnhealthyThreshold = Int
  type ImageIdentifier = String
  type KmsKeyArn = String
  type ListOperationsMaxResults = Int
  type MaxResults = Int
  type Memory = String
  type NextToken = String
  type NullableBoolean = Boolean
  type OperationSummaryList = js.Array[OperationSummary]
  type RoleArn = String
  type RuntimeEnvironmentVariables = js.Dictionary[RuntimeEnvironmentVariablesValue]
  type RuntimeEnvironmentVariablesKey = String
  type RuntimeEnvironmentVariablesValue = String
  type ServiceId = String
  type ServiceMaxResults = Int
  type ServiceName = String
  type ServiceSummaryList = js.Array[ServiceSummary]
  type StartCommand = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type UUID = String

  final class AppRunnerOps(private val service: AppRunner) extends AnyVal {

    @inline def associateCustomDomainFuture(params: AssociateCustomDomainRequest): Future[AssociateCustomDomainResponse] = service.associateCustomDomain(params).promise().toFuture
    @inline def createAutoScalingConfigurationFuture(params: CreateAutoScalingConfigurationRequest): Future[CreateAutoScalingConfigurationResponse] = service.createAutoScalingConfiguration(params).promise().toFuture
    @inline def createConnectionFuture(params: CreateConnectionRequest): Future[CreateConnectionResponse] = service.createConnection(params).promise().toFuture
    @inline def createServiceFuture(params: CreateServiceRequest): Future[CreateServiceResponse] = service.createService(params).promise().toFuture
    @inline def deleteAutoScalingConfigurationFuture(params: DeleteAutoScalingConfigurationRequest): Future[DeleteAutoScalingConfigurationResponse] = service.deleteAutoScalingConfiguration(params).promise().toFuture
    @inline def deleteConnectionFuture(params: DeleteConnectionRequest): Future[DeleteConnectionResponse] = service.deleteConnection(params).promise().toFuture
    @inline def deleteServiceFuture(params: DeleteServiceRequest): Future[DeleteServiceResponse] = service.deleteService(params).promise().toFuture
    @inline def describeAutoScalingConfigurationFuture(params: DescribeAutoScalingConfigurationRequest): Future[DescribeAutoScalingConfigurationResponse] = service.describeAutoScalingConfiguration(params).promise().toFuture
    @inline def describeCustomDomainsFuture(params: DescribeCustomDomainsRequest): Future[DescribeCustomDomainsResponse] = service.describeCustomDomains(params).promise().toFuture
    @inline def describeServiceFuture(params: DescribeServiceRequest): Future[DescribeServiceResponse] = service.describeService(params).promise().toFuture
    @inline def disassociateCustomDomainFuture(params: DisassociateCustomDomainRequest): Future[DisassociateCustomDomainResponse] = service.disassociateCustomDomain(params).promise().toFuture
    @inline def listAutoScalingConfigurationsFuture(params: ListAutoScalingConfigurationsRequest): Future[ListAutoScalingConfigurationsResponse] = service.listAutoScalingConfigurations(params).promise().toFuture
    @inline def listConnectionsFuture(params: ListConnectionsRequest): Future[ListConnectionsResponse] = service.listConnections(params).promise().toFuture
    @inline def listOperationsFuture(params: ListOperationsRequest): Future[ListOperationsResponse] = service.listOperations(params).promise().toFuture
    @inline def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] = service.listServices(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def pauseServiceFuture(params: PauseServiceRequest): Future[PauseServiceResponse] = service.pauseService(params).promise().toFuture
    @inline def resumeServiceFuture(params: ResumeServiceRequest): Future[ResumeServiceResponse] = service.resumeService(params).promise().toFuture
    @inline def startDeploymentFuture(params: StartDeploymentRequest): Future[StartDeploymentResponse] = service.startDeployment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateServiceFuture(params: UpdateServiceRequest): Future[UpdateServiceResponse] = service.updateService(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/apprunner", JSImport.Namespace, "AWS.AppRunner")
  class AppRunner() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateCustomDomain(params: AssociateCustomDomainRequest): Request[AssociateCustomDomainResponse] = js.native
    def createAutoScalingConfiguration(params: CreateAutoScalingConfigurationRequest): Request[CreateAutoScalingConfigurationResponse] = js.native
    def createConnection(params: CreateConnectionRequest): Request[CreateConnectionResponse] = js.native
    def createService(params: CreateServiceRequest): Request[CreateServiceResponse] = js.native
    def deleteAutoScalingConfiguration(params: DeleteAutoScalingConfigurationRequest): Request[DeleteAutoScalingConfigurationResponse] = js.native
    def deleteConnection(params: DeleteConnectionRequest): Request[DeleteConnectionResponse] = js.native
    def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse] = js.native
    def describeAutoScalingConfiguration(params: DescribeAutoScalingConfigurationRequest): Request[DescribeAutoScalingConfigurationResponse] = js.native
    def describeCustomDomains(params: DescribeCustomDomainsRequest): Request[DescribeCustomDomainsResponse] = js.native
    def describeService(params: DescribeServiceRequest): Request[DescribeServiceResponse] = js.native
    def disassociateCustomDomain(params: DisassociateCustomDomainRequest): Request[DisassociateCustomDomainResponse] = js.native
    def listAutoScalingConfigurations(params: ListAutoScalingConfigurationsRequest): Request[ListAutoScalingConfigurationsResponse] = js.native
    def listConnections(params: ListConnectionsRequest): Request[ListConnectionsResponse] = js.native
    def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse] = js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def pauseService(params: PauseServiceRequest): Request[PauseServiceResponse] = js.native
    def resumeService(params: ResumeServiceRequest): Request[ResumeServiceResponse] = js.native
    def startDeployment(params: StartDeploymentRequest): Request[StartDeploymentResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse] = js.native
  }
  object AppRunner {
    @inline implicit def toOps(service: AppRunner): AppRunnerOps = {
      new AppRunnerOps(service)
    }
  }

  @js.native
  trait AssociateCustomDomainRequest extends js.Object {
    var DomainName: DomainName
    var ServiceArn: AppRunnerResourceArn
    var EnableWWWSubdomain: js.UndefOr[NullableBoolean]
  }

  object AssociateCustomDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        ServiceArn: AppRunnerResourceArn,
        EnableWWWSubdomain: js.UndefOr[NullableBoolean] = js.undefined
    ): AssociateCustomDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )

      EnableWWWSubdomain.foreach(__v => __obj.updateDynamic("EnableWWWSubdomain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateCustomDomainRequest]
    }
  }

  @js.native
  trait AssociateCustomDomainResponse extends js.Object {
    var CustomDomain: CustomDomain
    var DNSTarget: String
    var ServiceArn: AppRunnerResourceArn
  }

  object AssociateCustomDomainResponse {
    @inline
    def apply(
        CustomDomain: CustomDomain,
        DNSTarget: String,
        ServiceArn: AppRunnerResourceArn
    ): AssociateCustomDomainResponse = {
      val __obj = js.Dynamic.literal(
        "CustomDomain" -> CustomDomain.asInstanceOf[js.Any],
        "DNSTarget" -> DNSTarget.asInstanceOf[js.Any],
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateCustomDomainResponse]
    }
  }

  /** Describes resources needed to authenticate access to some source repositories. The specific resource depends on the repository provider.
    */
  @js.native
  trait AuthenticationConfiguration extends js.Object {
    var AccessRoleArn: js.UndefOr[RoleArn]
    var ConnectionArn: js.UndefOr[AppRunnerResourceArn]
  }

  object AuthenticationConfiguration {
    @inline
    def apply(
        AccessRoleArn: js.UndefOr[RoleArn] = js.undefined,
        ConnectionArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
    ): AuthenticationConfiguration = {
      val __obj = js.Dynamic.literal()
      AccessRoleArn.foreach(__v => __obj.updateDynamic("AccessRoleArn")(__v.asInstanceOf[js.Any]))
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthenticationConfiguration]
    }
  }

  /** Describes an App Runner automatic scaling configuration resource. Multiple revisions of a configuration have the same <code>AutoScalingConfigurationName</code> and different <code>AutoScalingConfigurationRevision</code> values. A higher <code>MinSize</code> increases the spread of your App Runner service over more Availability Zones in the Amazon Web Services Region. The tradeoff is a higher minimal cost. A lower <code>MaxSize</code> controls your cost. The tradeoff is lower responsiveness during peak demand.
    */
  @js.native
  trait AutoScalingConfiguration extends js.Object {
    var AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn]
    var AutoScalingConfigurationName: js.UndefOr[AutoScalingConfigurationName]
    var AutoScalingConfigurationRevision: js.UndefOr[Int]
    var CreatedAt: js.UndefOr[Timestamp]
    var DeletedAt: js.UndefOr[Timestamp]
    var Latest: js.UndefOr[Boolean]
    var MaxConcurrency: js.UndefOr[Int]
    var MaxSize: js.UndefOr[Int]
    var MinSize: js.UndefOr[Int]
    var Status: js.UndefOr[AutoScalingConfigurationStatus]
  }

  object AutoScalingConfiguration {
    @inline
    def apply(
        AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined,
        AutoScalingConfigurationName: js.UndefOr[AutoScalingConfigurationName] = js.undefined,
        AutoScalingConfigurationRevision: js.UndefOr[Int] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        DeletedAt: js.UndefOr[Timestamp] = js.undefined,
        Latest: js.UndefOr[Boolean] = js.undefined,
        MaxConcurrency: js.UndefOr[Int] = js.undefined,
        MaxSize: js.UndefOr[Int] = js.undefined,
        MinSize: js.UndefOr[Int] = js.undefined,
        Status: js.UndefOr[AutoScalingConfigurationStatus] = js.undefined
    ): AutoScalingConfiguration = {
      val __obj = js.Dynamic.literal()
      AutoScalingConfigurationArn.foreach(__v => __obj.updateDynamic("AutoScalingConfigurationArn")(__v.asInstanceOf[js.Any]))
      AutoScalingConfigurationName.foreach(__v => __obj.updateDynamic("AutoScalingConfigurationName")(__v.asInstanceOf[js.Any]))
      AutoScalingConfigurationRevision.foreach(__v => __obj.updateDynamic("AutoScalingConfigurationRevision")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DeletedAt.foreach(__v => __obj.updateDynamic("DeletedAt")(__v.asInstanceOf[js.Any]))
      Latest.foreach(__v => __obj.updateDynamic("Latest")(__v.asInstanceOf[js.Any]))
      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.updateDynamic("MaxSize")(__v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.updateDynamic("MinSize")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingConfiguration]
    }
  }

  /** Provides summary information about an App Runner automatic scaling configuration resource. This type contains limited information about an auto scaling configuration. It includes only identification information, without configuration details. It's returned by the <a>ListAutoScalingConfigurations</a> action. Complete configuration information is returned by the <a>CreateAutoScalingConfiguration</a>, <a>DescribeAutoScalingConfiguration</a>, and <a>DeleteAutoScalingConfiguration</a> actions using the <a>AutoScalingConfiguration</a> type.
    */
  @js.native
  trait AutoScalingConfigurationSummary extends js.Object {
    var AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn]
    var AutoScalingConfigurationName: js.UndefOr[AutoScalingConfigurationName]
    var AutoScalingConfigurationRevision: js.UndefOr[Int]
  }

  object AutoScalingConfigurationSummary {
    @inline
    def apply(
        AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined,
        AutoScalingConfigurationName: js.UndefOr[AutoScalingConfigurationName] = js.undefined,
        AutoScalingConfigurationRevision: js.UndefOr[Int] = js.undefined
    ): AutoScalingConfigurationSummary = {
      val __obj = js.Dynamic.literal()
      AutoScalingConfigurationArn.foreach(__v => __obj.updateDynamic("AutoScalingConfigurationArn")(__v.asInstanceOf[js.Any]))
      AutoScalingConfigurationName.foreach(__v => __obj.updateDynamic("AutoScalingConfigurationName")(__v.asInstanceOf[js.Any]))
      AutoScalingConfigurationRevision.foreach(__v => __obj.updateDynamic("AutoScalingConfigurationRevision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingConfigurationSummary]
    }
  }

  /** Describes a certificate CNAME record to add to your DNS. For more information, see [[https://docs.aws.amazon.com/apprunner/latest/api/API_AssociateCustomDomain.html|AssociateCustomDomain]].
    */
  @js.native
  trait CertificateValidationRecord extends js.Object {
    var Name: js.UndefOr[String]
    var Status: js.UndefOr[CertificateValidationRecordStatus]
    var Type: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object CertificateValidationRecord {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[CertificateValidationRecordStatus] = js.undefined,
        Type: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): CertificateValidationRecord = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CertificateValidationRecord]
    }
  }

  /** Describes the configuration that App Runner uses to build and run an App Runner service from a source code repository.
    */
  @js.native
  trait CodeConfiguration extends js.Object {
    var ConfigurationSource: ConfigurationSource
    var CodeConfigurationValues: js.UndefOr[CodeConfigurationValues]
  }

  object CodeConfiguration {
    @inline
    def apply(
        ConfigurationSource: ConfigurationSource,
        CodeConfigurationValues: js.UndefOr[CodeConfigurationValues] = js.undefined
    ): CodeConfiguration = {
      val __obj = js.Dynamic.literal(
        "ConfigurationSource" -> ConfigurationSource.asInstanceOf[js.Any]
      )

      CodeConfigurationValues.foreach(__v => __obj.updateDynamic("CodeConfigurationValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeConfiguration]
    }
  }

  /** Describes the basic configuration needed for building and running an App Runner service. This type doesn't support the full set of possible configuration options. Fur full configuration capabilities, use a <code>apprunner.yaml</code> file in the source code repository.
    */
  @js.native
  trait CodeConfigurationValues extends js.Object {
    var Runtime: Runtime
    var BuildCommand: js.UndefOr[BuildCommand]
    var Port: js.UndefOr[String]
    var RuntimeEnvironmentVariables: js.UndefOr[RuntimeEnvironmentVariables]
    var StartCommand: js.UndefOr[StartCommand]
  }

  object CodeConfigurationValues {
    @inline
    def apply(
        Runtime: Runtime,
        BuildCommand: js.UndefOr[BuildCommand] = js.undefined,
        Port: js.UndefOr[String] = js.undefined,
        RuntimeEnvironmentVariables: js.UndefOr[RuntimeEnvironmentVariables] = js.undefined,
        StartCommand: js.UndefOr[StartCommand] = js.undefined
    ): CodeConfigurationValues = {
      val __obj = js.Dynamic.literal(
        "Runtime" -> Runtime.asInstanceOf[js.Any]
      )

      BuildCommand.foreach(__v => __obj.updateDynamic("BuildCommand")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      RuntimeEnvironmentVariables.foreach(__v => __obj.updateDynamic("RuntimeEnvironmentVariables")(__v.asInstanceOf[js.Any]))
      StartCommand.foreach(__v => __obj.updateDynamic("StartCommand")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeConfigurationValues]
    }
  }

  /** Describes a source code repository.
    */
  @js.native
  trait CodeRepository extends js.Object {
    var RepositoryUrl: String
    var SourceCodeVersion: SourceCodeVersion
    var CodeConfiguration: js.UndefOr[CodeConfiguration]
  }

  object CodeRepository {
    @inline
    def apply(
        RepositoryUrl: String,
        SourceCodeVersion: SourceCodeVersion,
        CodeConfiguration: js.UndefOr[CodeConfiguration] = js.undefined
    ): CodeRepository = {
      val __obj = js.Dynamic.literal(
        "RepositoryUrl" -> RepositoryUrl.asInstanceOf[js.Any],
        "SourceCodeVersion" -> SourceCodeVersion.asInstanceOf[js.Any]
      )

      CodeConfiguration.foreach(__v => __obj.updateDynamic("CodeConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CodeRepository]
    }
  }

  /** Describes an App Runner connection resource.
    */
  @js.native
  trait Connection extends js.Object {
    var ConnectionArn: js.UndefOr[AppRunnerResourceArn]
    var ConnectionName: js.UndefOr[ConnectionName]
    var CreatedAt: js.UndefOr[Timestamp]
    var ProviderType: js.UndefOr[ProviderType]
    var Status: js.UndefOr[ConnectionStatus]
  }

  object Connection {
    @inline
    def apply(
        ConnectionArn: js.UndefOr[AppRunnerResourceArn] = js.undefined,
        ConnectionName: js.UndefOr[ConnectionName] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        Status: js.UndefOr[ConnectionStatus] = js.undefined
    ): Connection = {
      val __obj = js.Dynamic.literal()
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionName.foreach(__v => __obj.updateDynamic("ConnectionName")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
  }

  /** Provides summary information about an App Runner connection resource.
    */
  @js.native
  trait ConnectionSummary extends js.Object {
    var ConnectionArn: js.UndefOr[AppRunnerResourceArn]
    var ConnectionName: js.UndefOr[ConnectionName]
    var CreatedAt: js.UndefOr[Timestamp]
    var ProviderType: js.UndefOr[ProviderType]
    var Status: js.UndefOr[ConnectionStatus]
  }

  object ConnectionSummary {
    @inline
    def apply(
        ConnectionArn: js.UndefOr[AppRunnerResourceArn] = js.undefined,
        ConnectionName: js.UndefOr[ConnectionName] = js.undefined,
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        ProviderType: js.UndefOr[ProviderType] = js.undefined,
        Status: js.UndefOr[ConnectionStatus] = js.undefined
    ): ConnectionSummary = {
      val __obj = js.Dynamic.literal()
      ConnectionArn.foreach(__v => __obj.updateDynamic("ConnectionArn")(__v.asInstanceOf[js.Any]))
      ConnectionName.foreach(__v => __obj.updateDynamic("ConnectionName")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      ProviderType.foreach(__v => __obj.updateDynamic("ProviderType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionSummary]
    }
  }

  @js.native
  trait CreateAutoScalingConfigurationRequest extends js.Object {
    var AutoScalingConfigurationName: AutoScalingConfigurationName
    var MaxConcurrency: js.UndefOr[ASConfigMaxConcurrency]
    var MaxSize: js.UndefOr[ASConfigMaxSize]
    var MinSize: js.UndefOr[ASConfigMinSize]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAutoScalingConfigurationRequest {
    @inline
    def apply(
        AutoScalingConfigurationName: AutoScalingConfigurationName,
        MaxConcurrency: js.UndefOr[ASConfigMaxConcurrency] = js.undefined,
        MaxSize: js.UndefOr[ASConfigMaxSize] = js.undefined,
        MinSize: js.UndefOr[ASConfigMinSize] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAutoScalingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AutoScalingConfigurationName" -> AutoScalingConfigurationName.asInstanceOf[js.Any]
      )

      MaxConcurrency.foreach(__v => __obj.updateDynamic("MaxConcurrency")(__v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.updateDynamic("MaxSize")(__v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.updateDynamic("MinSize")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAutoScalingConfigurationRequest]
    }
  }

  @js.native
  trait CreateAutoScalingConfigurationResponse extends js.Object {
    var AutoScalingConfiguration: AutoScalingConfiguration
  }

  object CreateAutoScalingConfigurationResponse {
    @inline
    def apply(
        AutoScalingConfiguration: AutoScalingConfiguration
    ): CreateAutoScalingConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "AutoScalingConfiguration" -> AutoScalingConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAutoScalingConfigurationResponse]
    }
  }

  @js.native
  trait CreateConnectionRequest extends js.Object {
    var ConnectionName: ConnectionName
    var ProviderType: ProviderType
    var Tags: js.UndefOr[TagList]
  }

  object CreateConnectionRequest {
    @inline
    def apply(
        ConnectionName: ConnectionName,
        ProviderType: ProviderType,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionName" -> ConnectionName.asInstanceOf[js.Any],
        "ProviderType" -> ProviderType.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectionRequest]
    }
  }

  @js.native
  trait CreateConnectionResponse extends js.Object {
    var Connection: Connection
  }

  object CreateConnectionResponse {
    @inline
    def apply(
        Connection: Connection
    ): CreateConnectionResponse = {
      val __obj = js.Dynamic.literal(
        "Connection" -> Connection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateConnectionResponse]
    }
  }

  @js.native
  trait CreateServiceRequest extends js.Object {
    var ServiceName: ServiceName
    var SourceConfiguration: SourceConfiguration
    var AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var HealthCheckConfiguration: js.UndefOr[HealthCheckConfiguration]
    var InstanceConfiguration: js.UndefOr[InstanceConfiguration]
    var Tags: js.UndefOr[TagList]
  }

  object CreateServiceRequest {
    @inline
    def apply(
        ServiceName: ServiceName,
        SourceConfiguration: SourceConfiguration,
        AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        HealthCheckConfiguration: js.UndefOr[HealthCheckConfiguration] = js.undefined,
        InstanceConfiguration: js.UndefOr[InstanceConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateServiceRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceName" -> ServiceName.asInstanceOf[js.Any],
        "SourceConfiguration" -> SourceConfiguration.asInstanceOf[js.Any]
      )

      AutoScalingConfigurationArn.foreach(__v => __obj.updateDynamic("AutoScalingConfigurationArn")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      HealthCheckConfiguration.foreach(__v => __obj.updateDynamic("HealthCheckConfiguration")(__v.asInstanceOf[js.Any]))
      InstanceConfiguration.foreach(__v => __obj.updateDynamic("InstanceConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceRequest]
    }
  }

  @js.native
  trait CreateServiceResponse extends js.Object {
    var OperationId: UUID
    var Service: Service
  }

  object CreateServiceResponse {
    @inline
    def apply(
        OperationId: UUID,
        Service: Service
    ): CreateServiceResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any],
        "Service" -> Service.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateServiceResponse]
    }
  }

  /** Describes a custom domain that's associated with an App Runner service.
    */
  @js.native
  trait CustomDomain extends js.Object {
    var DomainName: DomainName
    var EnableWWWSubdomain: NullableBoolean
    var Status: CustomDomainAssociationStatus
    var CertificateValidationRecords: js.UndefOr[CertificateValidationRecordList]
  }

  object CustomDomain {
    @inline
    def apply(
        DomainName: DomainName,
        EnableWWWSubdomain: NullableBoolean,
        Status: CustomDomainAssociationStatus,
        CertificateValidationRecords: js.UndefOr[CertificateValidationRecordList] = js.undefined
    ): CustomDomain = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "EnableWWWSubdomain" -> EnableWWWSubdomain.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      CertificateValidationRecords.foreach(__v => __obj.updateDynamic("CertificateValidationRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomDomain]
    }
  }

  @js.native
  trait DeleteAutoScalingConfigurationRequest extends js.Object {
    var AutoScalingConfigurationArn: AppRunnerResourceArn
  }

  object DeleteAutoScalingConfigurationRequest {
    @inline
    def apply(
        AutoScalingConfigurationArn: AppRunnerResourceArn
    ): DeleteAutoScalingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AutoScalingConfigurationArn" -> AutoScalingConfigurationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAutoScalingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteAutoScalingConfigurationResponse extends js.Object {
    var AutoScalingConfiguration: AutoScalingConfiguration
  }

  object DeleteAutoScalingConfigurationResponse {
    @inline
    def apply(
        AutoScalingConfiguration: AutoScalingConfiguration
    ): DeleteAutoScalingConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "AutoScalingConfiguration" -> AutoScalingConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAutoScalingConfigurationResponse]
    }
  }

  @js.native
  trait DeleteConnectionRequest extends js.Object {
    var ConnectionArn: AppRunnerResourceArn
  }

  object DeleteConnectionRequest {
    @inline
    def apply(
        ConnectionArn: AppRunnerResourceArn
    ): DeleteConnectionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectionArn" -> ConnectionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectionRequest]
    }
  }

  @js.native
  trait DeleteConnectionResponse extends js.Object {
    var Connection: js.UndefOr[Connection]
  }

  object DeleteConnectionResponse {
    @inline
    def apply(
        Connection: js.UndefOr[Connection] = js.undefined
    ): DeleteConnectionResponse = {
      val __obj = js.Dynamic.literal()
      Connection.foreach(__v => __obj.updateDynamic("Connection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteConnectionResponse]
    }
  }

  @js.native
  trait DeleteServiceRequest extends js.Object {
    var ServiceArn: AppRunnerResourceArn
  }

  object DeleteServiceRequest {
    @inline
    def apply(
        ServiceArn: AppRunnerResourceArn
    ): DeleteServiceRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteServiceRequest]
    }
  }

  @js.native
  trait DeleteServiceResponse extends js.Object {
    var OperationId: UUID
    var Service: Service
  }

  object DeleteServiceResponse {
    @inline
    def apply(
        OperationId: UUID,
        Service: Service
    ): DeleteServiceResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any],
        "Service" -> Service.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteServiceResponse]
    }
  }

  @js.native
  trait DescribeAutoScalingConfigurationRequest extends js.Object {
    var AutoScalingConfigurationArn: AppRunnerResourceArn
  }

  object DescribeAutoScalingConfigurationRequest {
    @inline
    def apply(
        AutoScalingConfigurationArn: AppRunnerResourceArn
    ): DescribeAutoScalingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "AutoScalingConfigurationArn" -> AutoScalingConfigurationArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAutoScalingConfigurationRequest]
    }
  }

  @js.native
  trait DescribeAutoScalingConfigurationResponse extends js.Object {
    var AutoScalingConfiguration: AutoScalingConfiguration
  }

  object DescribeAutoScalingConfigurationResponse {
    @inline
    def apply(
        AutoScalingConfiguration: AutoScalingConfiguration
    ): DescribeAutoScalingConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "AutoScalingConfiguration" -> AutoScalingConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAutoScalingConfigurationResponse]
    }
  }

  @js.native
  trait DescribeCustomDomainsRequest extends js.Object {
    var ServiceArn: AppRunnerResourceArn
    var MaxResults: js.UndefOr[DescribeCustomDomainsMaxResults]
    var NextToken: js.UndefOr[String]
  }

  object DescribeCustomDomainsRequest {
    @inline
    def apply(
        ServiceArn: AppRunnerResourceArn,
        MaxResults: js.UndefOr[DescribeCustomDomainsMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeCustomDomainsRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCustomDomainsRequest]
    }
  }

  @js.native
  trait DescribeCustomDomainsResponse extends js.Object {
    var CustomDomains: CustomDomainList
    var DNSTarget: String
    var ServiceArn: AppRunnerResourceArn
    var NextToken: js.UndefOr[String]
  }

  object DescribeCustomDomainsResponse {
    @inline
    def apply(
        CustomDomains: CustomDomainList,
        DNSTarget: String,
        ServiceArn: AppRunnerResourceArn,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeCustomDomainsResponse = {
      val __obj = js.Dynamic.literal(
        "CustomDomains" -> CustomDomains.asInstanceOf[js.Any],
        "DNSTarget" -> DNSTarget.asInstanceOf[js.Any],
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCustomDomainsResponse]
    }
  }

  @js.native
  trait DescribeServiceRequest extends js.Object {
    var ServiceArn: AppRunnerResourceArn
  }

  object DescribeServiceRequest {
    @inline
    def apply(
        ServiceArn: AppRunnerResourceArn
    ): DescribeServiceRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeServiceRequest]
    }
  }

  @js.native
  trait DescribeServiceResponse extends js.Object {
    var Service: Service
  }

  object DescribeServiceResponse {
    @inline
    def apply(
        Service: Service
    ): DescribeServiceResponse = {
      val __obj = js.Dynamic.literal(
        "Service" -> Service.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeServiceResponse]
    }
  }

  @js.native
  trait DisassociateCustomDomainRequest extends js.Object {
    var DomainName: DomainName
    var ServiceArn: AppRunnerResourceArn
  }

  object DisassociateCustomDomainRequest {
    @inline
    def apply(
        DomainName: DomainName,
        ServiceArn: AppRunnerResourceArn
    ): DisassociateCustomDomainRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateCustomDomainRequest]
    }
  }

  @js.native
  trait DisassociateCustomDomainResponse extends js.Object {
    var CustomDomain: CustomDomain
    var DNSTarget: String
    var ServiceArn: AppRunnerResourceArn
  }

  object DisassociateCustomDomainResponse {
    @inline
    def apply(
        CustomDomain: CustomDomain,
        DNSTarget: String,
        ServiceArn: AppRunnerResourceArn
    ): DisassociateCustomDomainResponse = {
      val __obj = js.Dynamic.literal(
        "CustomDomain" -> CustomDomain.asInstanceOf[js.Any],
        "DNSTarget" -> DNSTarget.asInstanceOf[js.Any],
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateCustomDomainResponse]
    }
  }

  /** Describes a custom encryption key that App Runner uses to encrypt copies of the source repository and service logs.
    */
  @js.native
  trait EncryptionConfiguration extends js.Object {
    var KmsKey: KmsKeyArn
  }

  object EncryptionConfiguration {
    @inline
    def apply(
        KmsKey: KmsKeyArn
    ): EncryptionConfiguration = {
      val __obj = js.Dynamic.literal(
        "KmsKey" -> KmsKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EncryptionConfiguration]
    }
  }

  /** Describes the settings for the health check that App Runner performs to monitor the health of a service.
    */
  @js.native
  trait HealthCheckConfiguration extends js.Object {
    var HealthyThreshold: js.UndefOr[HealthCheckHealthyThreshold]
    var Interval: js.UndefOr[HealthCheckInterval]
    var Path: js.UndefOr[HealthCheckPath]
    var Protocol: js.UndefOr[HealthCheckProtocol]
    var Timeout: js.UndefOr[HealthCheckTimeout]
    var UnhealthyThreshold: js.UndefOr[HealthCheckUnhealthyThreshold]
  }

  object HealthCheckConfiguration {
    @inline
    def apply(
        HealthyThreshold: js.UndefOr[HealthCheckHealthyThreshold] = js.undefined,
        Interval: js.UndefOr[HealthCheckInterval] = js.undefined,
        Path: js.UndefOr[HealthCheckPath] = js.undefined,
        Protocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        Timeout: js.UndefOr[HealthCheckTimeout] = js.undefined,
        UnhealthyThreshold: js.UndefOr[HealthCheckUnhealthyThreshold] = js.undefined
    ): HealthCheckConfiguration = {
      val __obj = js.Dynamic.literal()
      HealthyThreshold.foreach(__v => __obj.updateDynamic("HealthyThreshold")(__v.asInstanceOf[js.Any]))
      Interval.foreach(__v => __obj.updateDynamic("Interval")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      UnhealthyThreshold.foreach(__v => __obj.updateDynamic("UnhealthyThreshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckConfiguration]
    }
  }

  /** Describes the configuration that App Runner uses to run an App Runner service using an image pulled from a source image repository.
    */
  @js.native
  trait ImageConfiguration extends js.Object {
    var Port: js.UndefOr[String]
    var RuntimeEnvironmentVariables: js.UndefOr[RuntimeEnvironmentVariables]
    var StartCommand: js.UndefOr[String]
  }

  object ImageConfiguration {
    @inline
    def apply(
        Port: js.UndefOr[String] = js.undefined,
        RuntimeEnvironmentVariables: js.UndefOr[RuntimeEnvironmentVariables] = js.undefined,
        StartCommand: js.UndefOr[String] = js.undefined
    ): ImageConfiguration = {
      val __obj = js.Dynamic.literal()
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      RuntimeEnvironmentVariables.foreach(__v => __obj.updateDynamic("RuntimeEnvironmentVariables")(__v.asInstanceOf[js.Any]))
      StartCommand.foreach(__v => __obj.updateDynamic("StartCommand")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageConfiguration]
    }
  }

  /** Describes a source image repository.
    */
  @js.native
  trait ImageRepository extends js.Object {
    var ImageIdentifier: ImageIdentifier
    var ImageRepositoryType: ImageRepositoryType
    var ImageConfiguration: js.UndefOr[ImageConfiguration]
  }

  object ImageRepository {
    @inline
    def apply(
        ImageIdentifier: ImageIdentifier,
        ImageRepositoryType: ImageRepositoryType,
        ImageConfiguration: js.UndefOr[ImageConfiguration] = js.undefined
    ): ImageRepository = {
      val __obj = js.Dynamic.literal(
        "ImageIdentifier" -> ImageIdentifier.asInstanceOf[js.Any],
        "ImageRepositoryType" -> ImageRepositoryType.asInstanceOf[js.Any]
      )

      ImageConfiguration.foreach(__v => __obj.updateDynamic("ImageConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImageRepository]
    }
  }

  /** Describes the runtime configuration of an App Runner service instance (scaling unit).
    */
  @js.native
  trait InstanceConfiguration extends js.Object {
    var Cpu: js.UndefOr[Cpu]
    var InstanceRoleArn: js.UndefOr[RoleArn]
    var Memory: js.UndefOr[Memory]
  }

  object InstanceConfiguration {
    @inline
    def apply(
        Cpu: js.UndefOr[Cpu] = js.undefined,
        InstanceRoleArn: js.UndefOr[RoleArn] = js.undefined,
        Memory: js.UndefOr[Memory] = js.undefined
    ): InstanceConfiguration = {
      val __obj = js.Dynamic.literal()
      Cpu.foreach(__v => __obj.updateDynamic("Cpu")(__v.asInstanceOf[js.Any]))
      InstanceRoleArn.foreach(__v => __obj.updateDynamic("InstanceRoleArn")(__v.asInstanceOf[js.Any]))
      Memory.foreach(__v => __obj.updateDynamic("Memory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceConfiguration]
    }
  }

  @js.native
  trait ListAutoScalingConfigurationsRequest extends js.Object {
    var AutoScalingConfigurationName: js.UndefOr[AutoScalingConfigurationName]
    var LatestOnly: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAutoScalingConfigurationsRequest {
    @inline
    def apply(
        AutoScalingConfigurationName: js.UndefOr[AutoScalingConfigurationName] = js.undefined,
        LatestOnly: js.UndefOr[Boolean] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAutoScalingConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      AutoScalingConfigurationName.foreach(__v => __obj.updateDynamic("AutoScalingConfigurationName")(__v.asInstanceOf[js.Any]))
      LatestOnly.foreach(__v => __obj.updateDynamic("LatestOnly")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAutoScalingConfigurationsRequest]
    }
  }

  @js.native
  trait ListAutoScalingConfigurationsResponse extends js.Object {
    var AutoScalingConfigurationSummaryList: AutoScalingConfigurationSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListAutoScalingConfigurationsResponse {
    @inline
    def apply(
        AutoScalingConfigurationSummaryList: AutoScalingConfigurationSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAutoScalingConfigurationsResponse = {
      val __obj = js.Dynamic.literal(
        "AutoScalingConfigurationSummaryList" -> AutoScalingConfigurationSummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAutoScalingConfigurationsResponse]
    }
  }

  @js.native
  trait ListConnectionsRequest extends js.Object {
    var ConnectionName: js.UndefOr[ConnectionName]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectionsRequest {
    @inline
    def apply(
        ConnectionName: js.UndefOr[ConnectionName] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectionsRequest = {
      val __obj = js.Dynamic.literal()
      ConnectionName.foreach(__v => __obj.updateDynamic("ConnectionName")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectionsRequest]
    }
  }

  @js.native
  trait ListConnectionsResponse extends js.Object {
    var ConnectionSummaryList: ConnectionSummaryList
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConnectionsResponse {
    @inline
    def apply(
        ConnectionSummaryList: ConnectionSummaryList,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConnectionsResponse = {
      val __obj = js.Dynamic.literal(
        "ConnectionSummaryList" -> ConnectionSummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectionsResponse]
    }
  }

  @js.native
  trait ListOperationsRequest extends js.Object {
    var ServiceArn: AppRunnerResourceArn
    var MaxResults: js.UndefOr[ListOperationsMaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListOperationsRequest {
    @inline
    def apply(
        ServiceArn: AppRunnerResourceArn,
        MaxResults: js.UndefOr[ListOperationsMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListOperationsRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOperationsRequest]
    }
  }

  @js.native
  trait ListOperationsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var OperationSummaryList: js.UndefOr[OperationSummaryList]
  }

  object ListOperationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        OperationSummaryList: js.UndefOr[OperationSummaryList] = js.undefined
    ): ListOperationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      OperationSummaryList.foreach(__v => __obj.updateDynamic("OperationSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOperationsResponse]
    }
  }

  @js.native
  trait ListServicesRequest extends js.Object {
    var MaxResults: js.UndefOr[ServiceMaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListServicesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ServiceMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListServicesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var ServiceSummaryList: ServiceSummaryList
    var NextToken: js.UndefOr[String]
  }

  object ListServicesResponse {
    @inline
    def apply(
        ServiceSummaryList: ServiceSummaryList,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListServicesResponse = {
      val __obj = js.Dynamic.literal(
        "ServiceSummaryList" -> ServiceSummaryList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AppRunnerResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: AppRunnerResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Provides summary information for an operation that occurred on an App Runner service.
    */
  @js.native
  trait OperationSummary extends js.Object {
    var EndedAt: js.UndefOr[Timestamp]
    var Id: js.UndefOr[UUID]
    var StartedAt: js.UndefOr[Timestamp]
    var Status: js.UndefOr[OperationStatus]
    var TargetArn: js.UndefOr[AppRunnerResourceArn]
    var Type: js.UndefOr[OperationType]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object OperationSummary {
    @inline
    def apply(
        EndedAt: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[UUID] = js.undefined,
        StartedAt: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[OperationStatus] = js.undefined,
        TargetArn: js.UndefOr[AppRunnerResourceArn] = js.undefined,
        Type: js.UndefOr[OperationType] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): OperationSummary = {
      val __obj = js.Dynamic.literal()
      EndedAt.foreach(__v => __obj.updateDynamic("EndedAt")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetArn.foreach(__v => __obj.updateDynamic("TargetArn")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OperationSummary]
    }
  }

  @js.native
  trait PauseServiceRequest extends js.Object {
    var ServiceArn: AppRunnerResourceArn
  }

  object PauseServiceRequest {
    @inline
    def apply(
        ServiceArn: AppRunnerResourceArn
    ): PauseServiceRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PauseServiceRequest]
    }
  }

  @js.native
  trait PauseServiceResponse extends js.Object {
    var Service: Service
    var OperationId: js.UndefOr[UUID]
  }

  object PauseServiceResponse {
    @inline
    def apply(
        Service: Service,
        OperationId: js.UndefOr[UUID] = js.undefined
    ): PauseServiceResponse = {
      val __obj = js.Dynamic.literal(
        "Service" -> Service.asInstanceOf[js.Any]
      )

      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PauseServiceResponse]
    }
  }

  @js.native
  trait ResumeServiceRequest extends js.Object {
    var ServiceArn: AppRunnerResourceArn
  }

  object ResumeServiceRequest {
    @inline
    def apply(
        ServiceArn: AppRunnerResourceArn
    ): ResumeServiceRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResumeServiceRequest]
    }
  }

  @js.native
  trait ResumeServiceResponse extends js.Object {
    var Service: Service
    var OperationId: js.UndefOr[UUID]
  }

  object ResumeServiceResponse {
    @inline
    def apply(
        Service: Service,
        OperationId: js.UndefOr[UUID] = js.undefined
    ): ResumeServiceResponse = {
      val __obj = js.Dynamic.literal(
        "Service" -> Service.asInstanceOf[js.Any]
      )

      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResumeServiceResponse]
    }
  }

  /** Describes an App Runner service. It can describe a service in any state, including deleted services. This type contains the full information about a service, including configuration details. It's returned by the [[https://docs.aws.amazon.com/apprunner/latest/api/API_CreateService.html|CreateService]], [[https://docs.aws.amazon.com/apprunner/latest/api/API_DescribeService.html|DescribeService]], and [[https://docs.aws.amazon.com/apprunner/latest/api/API_DeleteService.html|DeleteService]] actions. A subset of this information is returned by the [[https://docs.aws.amazon.com/apprunner/latest/api/API_ListServices.html|ListServices]] action using the [[https://docs.aws.amazon.com/apprunner/latest/api/API_ServiceSummary.html|ServiceSummary]] type.
    */
  @js.native
  trait Service extends js.Object {
    var AutoScalingConfigurationSummary: AutoScalingConfigurationSummary
    var CreatedAt: Timestamp
    var InstanceConfiguration: InstanceConfiguration
    var ServiceArn: AppRunnerResourceArn
    var ServiceId: ServiceId
    var ServiceName: ServiceName
    var ServiceUrl: String
    var SourceConfiguration: SourceConfiguration
    var Status: ServiceStatus
    var UpdatedAt: Timestamp
    var DeletedAt: js.UndefOr[Timestamp]
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration]
    var HealthCheckConfiguration: js.UndefOr[HealthCheckConfiguration]
  }

  object Service {
    @inline
    def apply(
        AutoScalingConfigurationSummary: AutoScalingConfigurationSummary,
        CreatedAt: Timestamp,
        InstanceConfiguration: InstanceConfiguration,
        ServiceArn: AppRunnerResourceArn,
        ServiceId: ServiceId,
        ServiceName: ServiceName,
        ServiceUrl: String,
        SourceConfiguration: SourceConfiguration,
        Status: ServiceStatus,
        UpdatedAt: Timestamp,
        DeletedAt: js.UndefOr[Timestamp] = js.undefined,
        EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined,
        HealthCheckConfiguration: js.UndefOr[HealthCheckConfiguration] = js.undefined
    ): Service = {
      val __obj = js.Dynamic.literal(
        "AutoScalingConfigurationSummary" -> AutoScalingConfigurationSummary.asInstanceOf[js.Any],
        "CreatedAt" -> CreatedAt.asInstanceOf[js.Any],
        "InstanceConfiguration" -> InstanceConfiguration.asInstanceOf[js.Any],
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any],
        "ServiceId" -> ServiceId.asInstanceOf[js.Any],
        "ServiceName" -> ServiceName.asInstanceOf[js.Any],
        "ServiceUrl" -> ServiceUrl.asInstanceOf[js.Any],
        "SourceConfiguration" -> SourceConfiguration.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any],
        "UpdatedAt" -> UpdatedAt.asInstanceOf[js.Any]
      )

      DeletedAt.foreach(__v => __obj.updateDynamic("DeletedAt")(__v.asInstanceOf[js.Any]))
      EncryptionConfiguration.foreach(__v => __obj.updateDynamic("EncryptionConfiguration")(__v.asInstanceOf[js.Any]))
      HealthCheckConfiguration.foreach(__v => __obj.updateDynamic("HealthCheckConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /** Provides summary information for an App Runner service. This type contains limited information about a service. It doesn't include configuration details. It's returned by the [[https://docs.aws.amazon.com/apprunner/latest/api/API_ListServices.html|ListServices]] action. Complete service information is returned by the [[https://docs.aws.amazon.com/apprunner/latest/api/API_CreateService.html|CreateService]], [[https://docs.aws.amazon.com/apprunner/latest/api/API_DescribeService.html|DescribeService]], and [[https://docs.aws.amazon.com/apprunner/latest/api/API_DeleteService.html|DeleteService]] actions using the [[https://docs.aws.amazon.com/apprunner/latest/api/API_Service.html|Service]] type.
    */
  @js.native
  trait ServiceSummary extends js.Object {
    var CreatedAt: js.UndefOr[Timestamp]
    var ServiceArn: js.UndefOr[AppRunnerResourceArn]
    var ServiceId: js.UndefOr[ServiceId]
    var ServiceName: js.UndefOr[ServiceName]
    var ServiceUrl: js.UndefOr[String]
    var Status: js.UndefOr[ServiceStatus]
    var UpdatedAt: js.UndefOr[Timestamp]
  }

  object ServiceSummary {
    @inline
    def apply(
        CreatedAt: js.UndefOr[Timestamp] = js.undefined,
        ServiceArn: js.UndefOr[AppRunnerResourceArn] = js.undefined,
        ServiceId: js.UndefOr[ServiceId] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined,
        ServiceUrl: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ServiceStatus] = js.undefined,
        UpdatedAt: js.UndefOr[Timestamp] = js.undefined
    ): ServiceSummary = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      ServiceArn.foreach(__v => __obj.updateDynamic("ServiceArn")(__v.asInstanceOf[js.Any]))
      ServiceId.foreach(__v => __obj.updateDynamic("ServiceId")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      ServiceUrl.foreach(__v => __obj.updateDynamic("ServiceUrl")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSummary]
    }
  }

  /** Identifies a version of code that App Runner refers to within a source code repository.
    */
  @js.native
  trait SourceCodeVersion extends js.Object {
    var Type: SourceCodeVersionType
    var Value: String
  }

  object SourceCodeVersion {
    @inline
    def apply(
        Type: SourceCodeVersionType,
        Value: String
    ): SourceCodeVersion = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SourceCodeVersion]
    }
  }

  /** Describes the source deployed to an App Runner service. It can be a code or an image repository.
    */
  @js.native
  trait SourceConfiguration extends js.Object {
    var AuthenticationConfiguration: js.UndefOr[AuthenticationConfiguration]
    var AutoDeploymentsEnabled: js.UndefOr[NullableBoolean]
    var CodeRepository: js.UndefOr[CodeRepository]
    var ImageRepository: js.UndefOr[ImageRepository]
  }

  object SourceConfiguration {
    @inline
    def apply(
        AuthenticationConfiguration: js.UndefOr[AuthenticationConfiguration] = js.undefined,
        AutoDeploymentsEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        CodeRepository: js.UndefOr[CodeRepository] = js.undefined,
        ImageRepository: js.UndefOr[ImageRepository] = js.undefined
    ): SourceConfiguration = {
      val __obj = js.Dynamic.literal()
      AuthenticationConfiguration.foreach(__v => __obj.updateDynamic("AuthenticationConfiguration")(__v.asInstanceOf[js.Any]))
      AutoDeploymentsEnabled.foreach(__v => __obj.updateDynamic("AutoDeploymentsEnabled")(__v.asInstanceOf[js.Any]))
      CodeRepository.foreach(__v => __obj.updateDynamic("CodeRepository")(__v.asInstanceOf[js.Any]))
      ImageRepository.foreach(__v => __obj.updateDynamic("ImageRepository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceConfiguration]
    }
  }

  @js.native
  trait StartDeploymentRequest extends js.Object {
    var ServiceArn: AppRunnerResourceArn
  }

  object StartDeploymentRequest {
    @inline
    def apply(
        ServiceArn: AppRunnerResourceArn
    ): StartDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartDeploymentRequest]
    }
  }

  @js.native
  trait StartDeploymentResponse extends js.Object {
    var OperationId: UUID
  }

  object StartDeploymentResponse {
    @inline
    def apply(
        OperationId: UUID
    ): StartDeploymentResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartDeploymentResponse]
    }
  }

  /** Describes a tag that is applied to an App Runner resource. A tag is a metadata item consisting of a key-value pair.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AppRunnerResourceArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AppRunnerResourceArn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
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
    var ResourceArn: AppRunnerResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: AppRunnerResourceArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
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
  trait UpdateServiceRequest extends js.Object {
    var ServiceArn: AppRunnerResourceArn
    var AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn]
    var HealthCheckConfiguration: js.UndefOr[HealthCheckConfiguration]
    var InstanceConfiguration: js.UndefOr[InstanceConfiguration]
    var SourceConfiguration: js.UndefOr[SourceConfiguration]
  }

  object UpdateServiceRequest {
    @inline
    def apply(
        ServiceArn: AppRunnerResourceArn,
        AutoScalingConfigurationArn: js.UndefOr[AppRunnerResourceArn] = js.undefined,
        HealthCheckConfiguration: js.UndefOr[HealthCheckConfiguration] = js.undefined,
        InstanceConfiguration: js.UndefOr[InstanceConfiguration] = js.undefined,
        SourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined
    ): UpdateServiceRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceArn" -> ServiceArn.asInstanceOf[js.Any]
      )

      AutoScalingConfigurationArn.foreach(__v => __obj.updateDynamic("AutoScalingConfigurationArn")(__v.asInstanceOf[js.Any]))
      HealthCheckConfiguration.foreach(__v => __obj.updateDynamic("HealthCheckConfiguration")(__v.asInstanceOf[js.Any]))
      InstanceConfiguration.foreach(__v => __obj.updateDynamic("InstanceConfiguration")(__v.asInstanceOf[js.Any]))
      SourceConfiguration.foreach(__v => __obj.updateDynamic("SourceConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceRequest]
    }
  }

  @js.native
  trait UpdateServiceResponse extends js.Object {
    var OperationId: UUID
    var Service: Service
  }

  object UpdateServiceResponse {
    @inline
    def apply(
        OperationId: UUID,
        Service: Service
    ): UpdateServiceResponse = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any],
        "Service" -> Service.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServiceResponse]
    }
  }
}
