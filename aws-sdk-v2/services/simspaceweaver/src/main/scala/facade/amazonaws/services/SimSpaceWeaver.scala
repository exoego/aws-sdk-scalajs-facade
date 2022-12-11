package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object simspaceweaver {
  type AppPortMappings = js.Array[SimulationAppPortMapping]
  type BucketName = String
  type ClientToken = String
  type Description = String
  type DomainList = js.Array[Domain]
  type LaunchCommandList = js.Array[NonEmptyString]
  type LogDestinations = js.Array[LogDestination]
  type LogGroupArn = String
  type NonEmptyString = String
  type ObjectKey = String
  type OptionalString = String
  type PortNumber = Int
  type PositiveInteger = Int
  type RoleArn = String
  type SimSpaceWeaverArn = String
  type SimSpaceWeaverResourceName = String
  type SimulationAppList = js.Array[SimulationAppMetadata]
  type SimulationClockList = js.Array[SimulationClock]
  type SimulationList = js.Array[SimulationMetadata]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TimeToLiveString = String
  type Timestamp = js.Date
  type UUID = String

  final class SimSpaceWeaverOps(private val service: SimSpaceWeaver) extends AnyVal {

    @inline def deleteAppFuture(params: DeleteAppInput): Future[DeleteAppOutput] = service.deleteApp(params).promise().toFuture
    @inline def deleteSimulationFuture(params: DeleteSimulationInput): Future[DeleteSimulationOutput] = service.deleteSimulation(params).promise().toFuture
    @inline def describeAppFuture(params: DescribeAppInput): Future[DescribeAppOutput] = service.describeApp(params).promise().toFuture
    @inline def describeSimulationFuture(params: DescribeSimulationInput): Future[DescribeSimulationOutput] = service.describeSimulation(params).promise().toFuture
    @inline def listAppsFuture(params: ListAppsInput): Future[ListAppsOutput] = service.listApps(params).promise().toFuture
    @inline def listSimulationsFuture(params: ListSimulationsInput): Future[ListSimulationsOutput] = service.listSimulations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def startAppFuture(params: StartAppInput): Future[StartAppOutput] = service.startApp(params).promise().toFuture
    @inline def startClockFuture(params: StartClockInput): Future[StartClockOutput] = service.startClock(params).promise().toFuture
    @inline def startSimulationFuture(params: StartSimulationInput): Future[StartSimulationOutput] = service.startSimulation(params).promise().toFuture
    @inline def stopAppFuture(params: StopAppInput): Future[StopAppOutput] = service.stopApp(params).promise().toFuture
    @inline def stopClockFuture(params: StopClockInput): Future[StopClockOutput] = service.stopClock(params).promise().toFuture
    @inline def stopSimulationFuture(params: StopSimulationInput): Future[StopSimulationOutput] = service.stopSimulation(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/simspaceweaver", JSImport.Namespace, "AWS.SimSpaceWeaver")
  class SimSpaceWeaver() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteApp(params: DeleteAppInput): Request[DeleteAppOutput] = js.native
    def deleteSimulation(params: DeleteSimulationInput): Request[DeleteSimulationOutput] = js.native
    def describeApp(params: DescribeAppInput): Request[DescribeAppOutput] = js.native
    def describeSimulation(params: DescribeSimulationInput): Request[DescribeSimulationOutput] = js.native
    def listApps(params: ListAppsInput): Request[ListAppsOutput] = js.native
    def listSimulations(params: ListSimulationsInput): Request[ListSimulationsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def startApp(params: StartAppInput): Request[StartAppOutput] = js.native
    def startClock(params: StartClockInput): Request[StartClockOutput] = js.native
    def startSimulation(params: StartSimulationInput): Request[StartSimulationOutput] = js.native
    def stopApp(params: StopAppInput): Request[StopAppOutput] = js.native
    def stopClock(params: StopClockInput): Request[StopClockOutput] = js.native
    def stopSimulation(params: StopSimulationInput): Request[StopSimulationOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
  }
  object SimSpaceWeaver {
    @inline implicit def toOps(service: SimSpaceWeaver): SimSpaceWeaverOps = {
      new SimSpaceWeaverOps(service)
    }
  }

  /** The Amazon CloudWatch Logs log group for the simulation. For more information about log groups, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html|Working with log groups and log streams]] in the <i>Amazon CloudWatch Logs User Guide</i>.
    */
  @js.native
  trait CloudWatchLogsLogGroup extends js.Object {
    var LogGroupArn: js.UndefOr[LogGroupArn]
  }

  object CloudWatchLogsLogGroup {
    @inline
    def apply(
        LogGroupArn: js.UndefOr[LogGroupArn] = js.undefined
    ): CloudWatchLogsLogGroup = {
      val __obj = js.Dynamic.literal()
      LogGroupArn.foreach(__v => __obj.updateDynamic("LogGroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsLogGroup]
    }
  }

  @js.native
  trait DeleteAppInput extends js.Object {
    var App: SimSpaceWeaverResourceName
    var Domain: SimSpaceWeaverResourceName
    var Simulation: SimSpaceWeaverResourceName
  }

  object DeleteAppInput {
    @inline
    def apply(
        App: SimSpaceWeaverResourceName,
        Domain: SimSpaceWeaverResourceName,
        Simulation: SimSpaceWeaverResourceName
    ): DeleteAppInput = {
      val __obj = js.Dynamic.literal(
        "App" -> App.asInstanceOf[js.Any],
        "Domain" -> Domain.asInstanceOf[js.Any],
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAppInput]
    }
  }

  @js.native
  trait DeleteAppOutput extends js.Object

  object DeleteAppOutput {
    @inline
    def apply(): DeleteAppOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAppOutput]
    }
  }

  @js.native
  trait DeleteSimulationInput extends js.Object {
    var Simulation: SimSpaceWeaverResourceName
  }

  object DeleteSimulationInput {
    @inline
    def apply(
        Simulation: SimSpaceWeaverResourceName
    ): DeleteSimulationInput = {
      val __obj = js.Dynamic.literal(
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSimulationInput]
    }
  }

  @js.native
  trait DeleteSimulationOutput extends js.Object

  object DeleteSimulationOutput {
    @inline
    def apply(): DeleteSimulationOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSimulationOutput]
    }
  }

  @js.native
  trait DescribeAppInput extends js.Object {
    var App: SimSpaceWeaverResourceName
    var Domain: SimSpaceWeaverResourceName
    var Simulation: SimSpaceWeaverResourceName
  }

  object DescribeAppInput {
    @inline
    def apply(
        App: SimSpaceWeaverResourceName,
        Domain: SimSpaceWeaverResourceName,
        Simulation: SimSpaceWeaverResourceName
    ): DescribeAppInput = {
      val __obj = js.Dynamic.literal(
        "App" -> App.asInstanceOf[js.Any],
        "Domain" -> Domain.asInstanceOf[js.Any],
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAppInput]
    }
  }

  @js.native
  trait DescribeAppOutput extends js.Object {
    var Description: js.UndefOr[Description]
    var Domain: js.UndefOr[SimSpaceWeaverResourceName]
    var EndpointInfo: js.UndefOr[SimulationAppEndpointInfo]
    var LaunchOverrides: js.UndefOr[LaunchOverrides]
    var Name: js.UndefOr[SimSpaceWeaverResourceName]
    var Simulation: js.UndefOr[SimSpaceWeaverResourceName]
    var Status: js.UndefOr[SimulationAppStatus]
    var TargetStatus: js.UndefOr[SimulationAppTargetStatus]
  }

  object DescribeAppOutput {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Domain: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        EndpointInfo: js.UndefOr[SimulationAppEndpointInfo] = js.undefined,
        LaunchOverrides: js.UndefOr[LaunchOverrides] = js.undefined,
        Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        Simulation: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        Status: js.UndefOr[SimulationAppStatus] = js.undefined,
        TargetStatus: js.UndefOr[SimulationAppTargetStatus] = js.undefined
    ): DescribeAppOutput = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      EndpointInfo.foreach(__v => __obj.updateDynamic("EndpointInfo")(__v.asInstanceOf[js.Any]))
      LaunchOverrides.foreach(__v => __obj.updateDynamic("LaunchOverrides")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Simulation.foreach(__v => __obj.updateDynamic("Simulation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetStatus.foreach(__v => __obj.updateDynamic("TargetStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAppOutput]
    }
  }

  @js.native
  trait DescribeSimulationInput extends js.Object {
    var Simulation: SimSpaceWeaverResourceName
  }

  object DescribeSimulationInput {
    @inline
    def apply(
        Simulation: SimSpaceWeaverResourceName
    ): DescribeSimulationInput = {
      val __obj = js.Dynamic.literal(
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSimulationInput]
    }
  }

  @js.native
  trait DescribeSimulationOutput extends js.Object {
    var Arn: js.UndefOr[SimSpaceWeaverArn]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[Description]
    var ExecutionId: js.UndefOr[UUID]
    var LiveSimulationState: js.UndefOr[LiveSimulationState]
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
    var MaximumDuration: js.UndefOr[TimeToLiveString]
    var Name: js.UndefOr[SimSpaceWeaverResourceName]
    var RoleArn: js.UndefOr[RoleArn]
    var SchemaError: js.UndefOr[OptionalString]
    var SchemaS3Location: js.UndefOr[S3Location]
    var Status: js.UndefOr[SimulationStatus]
    var TargetStatus: js.UndefOr[SimulationTargetStatus]
  }

  object DescribeSimulationOutput {
    @inline
    def apply(
        Arn: js.UndefOr[SimSpaceWeaverArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ExecutionId: js.UndefOr[UUID] = js.undefined,
        LiveSimulationState: js.UndefOr[LiveSimulationState] = js.undefined,
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined,
        MaximumDuration: js.UndefOr[TimeToLiveString] = js.undefined,
        Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        SchemaError: js.UndefOr[OptionalString] = js.undefined,
        SchemaS3Location: js.UndefOr[S3Location] = js.undefined,
        Status: js.UndefOr[SimulationStatus] = js.undefined,
        TargetStatus: js.UndefOr[SimulationTargetStatus] = js.undefined
    ): DescribeSimulationOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      LiveSimulationState.foreach(__v => __obj.updateDynamic("LiveSimulationState")(__v.asInstanceOf[js.Any]))
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      MaximumDuration.foreach(__v => __obj.updateDynamic("MaximumDuration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      SchemaError.foreach(__v => __obj.updateDynamic("SchemaError")(__v.asInstanceOf[js.Any]))
      SchemaS3Location.foreach(__v => __obj.updateDynamic("SchemaS3Location")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetStatus.foreach(__v => __obj.updateDynamic("TargetStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSimulationOutput]
    }
  }

  /** A collection of app instances that run the same executable app code and have the same launch options and commands. For more information about domains, see [[https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html|Key concepts]] in the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
    */
  @js.native
  trait Domain extends js.Object {
    var Lifecycle: js.UndefOr[LifecycleManagementStrategy]
    var Name: js.UndefOr[SimSpaceWeaverResourceName]
  }

  object Domain {
    @inline
    def apply(
        Lifecycle: js.UndefOr[LifecycleManagementStrategy] = js.undefined,
        Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
    ): Domain = {
      val __obj = js.Dynamic.literal()
      Lifecycle.foreach(__v => __obj.updateDynamic("Lifecycle")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Domain]
    }
  }

  /** Options that apply when the app starts. These optiAons override default behavior.
    */
  @js.native
  trait LaunchOverrides extends js.Object {
    var LaunchCommands: js.UndefOr[LaunchCommandList]
  }

  object LaunchOverrides {
    @inline
    def apply(
        LaunchCommands: js.UndefOr[LaunchCommandList] = js.undefined
    ): LaunchOverrides = {
      val __obj = js.Dynamic.literal()
      LaunchCommands.foreach(__v => __obj.updateDynamic("LaunchCommands")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchOverrides]
    }
  }

  @js.native
  trait ListAppsInput extends js.Object {
    var Simulation: SimSpaceWeaverResourceName
    var Domain: js.UndefOr[SimSpaceWeaverResourceName]
    var MaxResults: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[OptionalString]
  }

  object ListAppsInput {
    @inline
    def apply(
        Simulation: SimSpaceWeaverResourceName,
        Domain: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        MaxResults: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[OptionalString] = js.undefined
    ): ListAppsInput = {
      val __obj = js.Dynamic.literal(
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )

      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsInput]
    }
  }

  @js.native
  trait ListAppsOutput extends js.Object {
    var Apps: js.UndefOr[SimulationAppList]
    var NextToken: js.UndefOr[OptionalString]
  }

  object ListAppsOutput {
    @inline
    def apply(
        Apps: js.UndefOr[SimulationAppList] = js.undefined,
        NextToken: js.UndefOr[OptionalString] = js.undefined
    ): ListAppsOutput = {
      val __obj = js.Dynamic.literal()
      Apps.foreach(__v => __obj.updateDynamic("Apps")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsOutput]
    }
  }

  @js.native
  trait ListSimulationsInput extends js.Object {
    var MaxResults: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[OptionalString]
  }

  object ListSimulationsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[OptionalString] = js.undefined
    ): ListSimulationsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSimulationsInput]
    }
  }

  @js.native
  trait ListSimulationsOutput extends js.Object {
    var NextToken: js.UndefOr[OptionalString]
    var Simulations: js.UndefOr[SimulationList]
  }

  object ListSimulationsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[OptionalString] = js.undefined,
        Simulations: js.UndefOr[SimulationList] = js.undefined
    ): ListSimulationsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Simulations.foreach(__v => __obj.updateDynamic("Simulations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSimulationsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: SimSpaceWeaverArn
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceArn: SimSpaceWeaverArn
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  /** A collection of additional state information, such as domain and clock configuration.
    */
  @js.native
  trait LiveSimulationState extends js.Object {
    var Clocks: js.UndefOr[SimulationClockList]
    var Domains: js.UndefOr[DomainList]
  }

  object LiveSimulationState {
    @inline
    def apply(
        Clocks: js.UndefOr[SimulationClockList] = js.undefined,
        Domains: js.UndefOr[DomainList] = js.undefined
    ): LiveSimulationState = {
      val __obj = js.Dynamic.literal()
      Clocks.foreach(__v => __obj.updateDynamic("Clocks")(__v.asInstanceOf[js.Any]))
      Domains.foreach(__v => __obj.updateDynamic("Domains")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LiveSimulationState]
    }
  }

  /** The location where SimSpace Weaver sends simulation log data.
    */
  @js.native
  trait LogDestination extends js.Object {
    var CloudWatchLogsLogGroup: js.UndefOr[CloudWatchLogsLogGroup]
  }

  object LogDestination {
    @inline
    def apply(
        CloudWatchLogsLogGroup: js.UndefOr[CloudWatchLogsLogGroup] = js.undefined
    ): LogDestination = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroup.foreach(__v => __obj.updateDynamic("CloudWatchLogsLogGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogDestination]
    }
  }

  /** The logging configuration for a simulation.
    */
  @js.native
  trait LoggingConfiguration extends js.Object {
    var Destinations: js.UndefOr[LogDestinations]
  }

  object LoggingConfiguration {
    @inline
    def apply(
        Destinations: js.UndefOr[LogDestinations] = js.undefined
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  /** A location in Amazon Simple Storage Service (Amazon S3) where SimSpace Weaver stores simulation data, such as your app zip files and schema file. For more information about Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple Storage Service User Guide</i> </a>.
    */
  @js.native
  trait S3Location extends js.Object {
    var BucketName: js.UndefOr[BucketName]
    var ObjectKey: js.UndefOr[ObjectKey]
  }

  object S3Location {
    @inline
    def apply(
        BucketName: js.UndefOr[BucketName] = js.undefined,
        ObjectKey: js.UndefOr[ObjectKey] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      BucketName.foreach(__v => __obj.updateDynamic("BucketName")(__v.asInstanceOf[js.Any]))
      ObjectKey.foreach(__v => __obj.updateDynamic("ObjectKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /** Information about the network endpoint that you can use to connect to your custom or service app.
    */
  @js.native
  trait SimulationAppEndpointInfo extends js.Object {
    var Address: js.UndefOr[NonEmptyString]
    var IngressPortMappings: js.UndefOr[AppPortMappings]
  }

  object SimulationAppEndpointInfo {
    @inline
    def apply(
        Address: js.UndefOr[NonEmptyString] = js.undefined,
        IngressPortMappings: js.UndefOr[AppPortMappings] = js.undefined
    ): SimulationAppEndpointInfo = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      IngressPortMappings.foreach(__v => __obj.updateDynamic("IngressPortMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationAppEndpointInfo]
    }
  }

  /** A collection of metadata about an app.
    */
  @js.native
  trait SimulationAppMetadata extends js.Object {
    var Domain: js.UndefOr[SimSpaceWeaverResourceName]
    var Name: js.UndefOr[SimSpaceWeaverResourceName]
    var Simulation: js.UndefOr[SimSpaceWeaverResourceName]
    var Status: js.UndefOr[SimulationAppStatus]
    var TargetStatus: js.UndefOr[SimulationAppTargetStatus]
  }

  object SimulationAppMetadata {
    @inline
    def apply(
        Domain: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        Simulation: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        Status: js.UndefOr[SimulationAppStatus] = js.undefined,
        TargetStatus: js.UndefOr[SimulationAppTargetStatus] = js.undefined
    ): SimulationAppMetadata = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Simulation.foreach(__v => __obj.updateDynamic("Simulation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetStatus.foreach(__v => __obj.updateDynamic("TargetStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationAppMetadata]
    }
  }

  /** A collection of TCP/UDP ports for a custom or service app.
    */
  @js.native
  trait SimulationAppPortMapping extends js.Object {
    var Actual: js.UndefOr[PortNumber]
    var Declared: js.UndefOr[PortNumber]
  }

  object SimulationAppPortMapping {
    @inline
    def apply(
        Actual: js.UndefOr[PortNumber] = js.undefined,
        Declared: js.UndefOr[PortNumber] = js.undefined
    ): SimulationAppPortMapping = {
      val __obj = js.Dynamic.literal()
      Actual.foreach(__v => __obj.updateDynamic("Actual")(__v.asInstanceOf[js.Any]))
      Declared.foreach(__v => __obj.updateDynamic("Declared")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationAppPortMapping]
    }
  }

  /** Status information about the simulation clock.
    */
  @js.native
  trait SimulationClock extends js.Object {
    var Status: js.UndefOr[ClockStatus]
    var TargetStatus: js.UndefOr[ClockTargetStatus]
  }

  object SimulationClock {
    @inline
    def apply(
        Status: js.UndefOr[ClockStatus] = js.undefined,
        TargetStatus: js.UndefOr[ClockTargetStatus] = js.undefined
    ): SimulationClock = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetStatus.foreach(__v => __obj.updateDynamic("TargetStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationClock]
    }
  }

  /** A collection of data about the simulation.
    */
  @js.native
  trait SimulationMetadata extends js.Object {
    var Arn: js.UndefOr[SimSpaceWeaverArn]
    var CreationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[SimSpaceWeaverResourceName]
    var Status: js.UndefOr[SimulationStatus]
    var TargetStatus: js.UndefOr[SimulationTargetStatus]
  }

  object SimulationMetadata {
    @inline
    def apply(
        Arn: js.UndefOr[SimSpaceWeaverArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        Status: js.UndefOr[SimulationStatus] = js.undefined,
        TargetStatus: js.UndefOr[SimulationTargetStatus] = js.undefined
    ): SimulationMetadata = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetStatus.foreach(__v => __obj.updateDynamic("TargetStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimulationMetadata]
    }
  }

  @js.native
  trait StartAppInput extends js.Object {
    var Domain: SimSpaceWeaverResourceName
    var Name: SimSpaceWeaverResourceName
    var Simulation: SimSpaceWeaverResourceName
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[Description]
    var LaunchOverrides: js.UndefOr[LaunchOverrides]
  }

  object StartAppInput {
    @inline
    def apply(
        Domain: SimSpaceWeaverResourceName,
        Name: SimSpaceWeaverResourceName,
        Simulation: SimSpaceWeaverResourceName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LaunchOverrides: js.UndefOr[LaunchOverrides] = js.undefined
    ): StartAppInput = {
      val __obj = js.Dynamic.literal(
        "Domain" -> Domain.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LaunchOverrides.foreach(__v => __obj.updateDynamic("LaunchOverrides")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAppInput]
    }
  }

  @js.native
  trait StartAppOutput extends js.Object {
    var Domain: js.UndefOr[SimSpaceWeaverResourceName]
    var Name: js.UndefOr[SimSpaceWeaverResourceName]
    var Simulation: js.UndefOr[SimSpaceWeaverResourceName]
  }

  object StartAppOutput {
    @inline
    def apply(
        Domain: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        Name: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined,
        Simulation: js.UndefOr[SimSpaceWeaverResourceName] = js.undefined
    ): StartAppOutput = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Simulation.foreach(__v => __obj.updateDynamic("Simulation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAppOutput]
    }
  }

  @js.native
  trait StartClockInput extends js.Object {
    var Simulation: SimSpaceWeaverResourceName
  }

  object StartClockInput {
    @inline
    def apply(
        Simulation: SimSpaceWeaverResourceName
    ): StartClockInput = {
      val __obj = js.Dynamic.literal(
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartClockInput]
    }
  }

  @js.native
  trait StartClockOutput extends js.Object

  object StartClockOutput {
    @inline
    def apply(): StartClockOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartClockOutput]
    }
  }

  @js.native
  trait StartSimulationInput extends js.Object {
    var Name: SimSpaceWeaverResourceName
    var RoleArn: RoleArn
    var SchemaS3Location: S3Location
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[Description]
    var MaximumDuration: js.UndefOr[TimeToLiveString]
    var Tags: js.UndefOr[TagMap]
  }

  object StartSimulationInput {
    @inline
    def apply(
        Name: SimSpaceWeaverResourceName,
        RoleArn: RoleArn,
        SchemaS3Location: S3Location,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        MaximumDuration: js.UndefOr[TimeToLiveString] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): StartSimulationInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SchemaS3Location" -> SchemaS3Location.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MaximumDuration.foreach(__v => __obj.updateDynamic("MaximumDuration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSimulationInput]
    }
  }

  @js.native
  trait StartSimulationOutput extends js.Object {
    var Arn: js.UndefOr[SimSpaceWeaverArn]
    var CreationTime: js.UndefOr[Timestamp]
    var ExecutionId: js.UndefOr[UUID]
  }

  object StartSimulationOutput {
    @inline
    def apply(
        Arn: js.UndefOr[SimSpaceWeaverArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExecutionId: js.UndefOr[UUID] = js.undefined
    ): StartSimulationOutput = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ExecutionId.foreach(__v => __obj.updateDynamic("ExecutionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSimulationOutput]
    }
  }

  @js.native
  trait StopAppInput extends js.Object {
    var App: SimSpaceWeaverResourceName
    var Domain: SimSpaceWeaverResourceName
    var Simulation: SimSpaceWeaverResourceName
  }

  object StopAppInput {
    @inline
    def apply(
        App: SimSpaceWeaverResourceName,
        Domain: SimSpaceWeaverResourceName,
        Simulation: SimSpaceWeaverResourceName
    ): StopAppInput = {
      val __obj = js.Dynamic.literal(
        "App" -> App.asInstanceOf[js.Any],
        "Domain" -> Domain.asInstanceOf[js.Any],
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopAppInput]
    }
  }

  @js.native
  trait StopAppOutput extends js.Object

  object StopAppOutput {
    @inline
    def apply(): StopAppOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopAppOutput]
    }
  }

  @js.native
  trait StopClockInput extends js.Object {
    var Simulation: SimSpaceWeaverResourceName
  }

  object StopClockInput {
    @inline
    def apply(
        Simulation: SimSpaceWeaverResourceName
    ): StopClockInput = {
      val __obj = js.Dynamic.literal(
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopClockInput]
    }
  }

  @js.native
  trait StopClockOutput extends js.Object

  object StopClockOutput {
    @inline
    def apply(): StopClockOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopClockOutput]
    }
  }

  @js.native
  trait StopSimulationInput extends js.Object {
    var Simulation: SimSpaceWeaverResourceName
  }

  object StopSimulationInput {
    @inline
    def apply(
        Simulation: SimSpaceWeaverResourceName
    ): StopSimulationInput = {
      val __obj = js.Dynamic.literal(
        "Simulation" -> Simulation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopSimulationInput]
    }
  }

  @js.native
  trait StopSimulationOutput extends js.Object

  object StopSimulationOutput {
    @inline
    def apply(): StopSimulationOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopSimulationOutput]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: SimSpaceWeaverArn
    var Tags: TagMap
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceArn: SimSpaceWeaverArn,
        Tags: TagMap
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: SimSpaceWeaverArn
    var TagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceArn: SimSpaceWeaverArn,
        TagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }
}
