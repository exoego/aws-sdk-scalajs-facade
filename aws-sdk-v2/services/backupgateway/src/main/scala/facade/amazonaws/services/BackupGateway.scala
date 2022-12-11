package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object backupgateway {
  type ActivationKey = String
  type DayOfMonth = Int
  type DayOfWeek = Int
  type GatewayArn = String
  type Gateways = js.Array[Gateway]
  type Host = String
  type HourOfDay = Int
  type HypervisorId = String
  type Hypervisors = js.Array[Hypervisor]
  type KmsKeyArn = String
  type MaxResults = Int
  type MinuteOfHour = Int
  type Name = String
  type NextToken = String
  type Password = String
  type Path = String
  type ResourceArn = String
  type ServerArn = String
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Array[Tag]
  type Time = js.Date
  type Username = String
  type VirtualMachines = js.Array[VirtualMachine]
  type VpcEndpoint = String

  final class BackupGatewayOps(private val service: BackupGateway) extends AnyVal {

    @inline def associateGatewayToServerFuture(params: AssociateGatewayToServerInput): Future[AssociateGatewayToServerOutput] = service.associateGatewayToServer(params).promise().toFuture
    @inline def createGatewayFuture(params: CreateGatewayInput): Future[CreateGatewayOutput] = service.createGateway(params).promise().toFuture
    @inline def deleteGatewayFuture(params: DeleteGatewayInput): Future[DeleteGatewayOutput] = service.deleteGateway(params).promise().toFuture
    @inline def deleteHypervisorFuture(params: DeleteHypervisorInput): Future[DeleteHypervisorOutput] = service.deleteHypervisor(params).promise().toFuture
    @inline def disassociateGatewayFromServerFuture(params: DisassociateGatewayFromServerInput): Future[DisassociateGatewayFromServerOutput] = service.disassociateGatewayFromServer(params).promise().toFuture
    @inline def getGatewayFuture(params: GetGatewayInput): Future[GetGatewayOutput] = service.getGateway(params).promise().toFuture
    @inline def getVirtualMachineFuture(params: GetVirtualMachineInput): Future[GetVirtualMachineOutput] = service.getVirtualMachine(params).promise().toFuture
    @inline def importHypervisorConfigurationFuture(params: ImportHypervisorConfigurationInput): Future[ImportHypervisorConfigurationOutput] = service.importHypervisorConfiguration(params).promise().toFuture
    @inline def listGatewaysFuture(params: ListGatewaysInput): Future[ListGatewaysOutput] = service.listGateways(params).promise().toFuture
    @inline def listHypervisorsFuture(params: ListHypervisorsInput): Future[ListHypervisorsOutput] = service.listHypervisors(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def listVirtualMachinesFuture(params: ListVirtualMachinesInput): Future[ListVirtualMachinesOutput] = service.listVirtualMachines(params).promise().toFuture
    @inline def putMaintenanceStartTimeFuture(params: PutMaintenanceStartTimeInput): Future[PutMaintenanceStartTimeOutput] = service.putMaintenanceStartTime(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def testHypervisorConfigurationFuture(params: TestHypervisorConfigurationInput): Future[TestHypervisorConfigurationOutput] = service.testHypervisorConfiguration(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateGatewayInformationFuture(params: UpdateGatewayInformationInput): Future[UpdateGatewayInformationOutput] = service.updateGatewayInformation(params).promise().toFuture
    @inline def updateGatewaySoftwareNowFuture(params: UpdateGatewaySoftwareNowInput): Future[UpdateGatewaySoftwareNowOutput] = service.updateGatewaySoftwareNow(params).promise().toFuture
    @inline def updateHypervisorFuture(params: UpdateHypervisorInput): Future[UpdateHypervisorOutput] = service.updateHypervisor(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/backupgateway", JSImport.Namespace, "AWS.BackupGateway")
  class BackupGateway() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateGatewayToServer(params: AssociateGatewayToServerInput): Request[AssociateGatewayToServerOutput] = js.native
    def createGateway(params: CreateGatewayInput): Request[CreateGatewayOutput] = js.native
    def deleteGateway(params: DeleteGatewayInput): Request[DeleteGatewayOutput] = js.native
    def deleteHypervisor(params: DeleteHypervisorInput): Request[DeleteHypervisorOutput] = js.native
    def disassociateGatewayFromServer(params: DisassociateGatewayFromServerInput): Request[DisassociateGatewayFromServerOutput] = js.native
    def getGateway(params: GetGatewayInput): Request[GetGatewayOutput] = js.native
    def getVirtualMachine(params: GetVirtualMachineInput): Request[GetVirtualMachineOutput] = js.native
    def importHypervisorConfiguration(params: ImportHypervisorConfigurationInput): Request[ImportHypervisorConfigurationOutput] = js.native
    def listGateways(params: ListGatewaysInput): Request[ListGatewaysOutput] = js.native
    def listHypervisors(params: ListHypervisorsInput): Request[ListHypervisorsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listVirtualMachines(params: ListVirtualMachinesInput): Request[ListVirtualMachinesOutput] = js.native
    def putMaintenanceStartTime(params: PutMaintenanceStartTimeInput): Request[PutMaintenanceStartTimeOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def testHypervisorConfiguration(params: TestHypervisorConfigurationInput): Request[TestHypervisorConfigurationOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateGatewayInformation(params: UpdateGatewayInformationInput): Request[UpdateGatewayInformationOutput] = js.native
    def updateGatewaySoftwareNow(params: UpdateGatewaySoftwareNowInput): Request[UpdateGatewaySoftwareNowOutput] = js.native
    def updateHypervisor(params: UpdateHypervisorInput): Request[UpdateHypervisorOutput] = js.native
  }
  object BackupGateway {
    @inline implicit def toOps(service: BackupGateway): BackupGatewayOps = {
      new BackupGatewayOps(service)
    }
  }

  @js.native
  trait AssociateGatewayToServerInput extends js.Object {
    var GatewayArn: GatewayArn
    var ServerArn: ServerArn
  }

  object AssociateGatewayToServerInput {
    @inline
    def apply(
        GatewayArn: GatewayArn,
        ServerArn: ServerArn
    ): AssociateGatewayToServerInput = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any],
        "ServerArn" -> ServerArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateGatewayToServerInput]
    }
  }

  @js.native
  trait AssociateGatewayToServerOutput extends js.Object {
    var GatewayArn: js.UndefOr[GatewayArn]
  }

  object AssociateGatewayToServerOutput {
    @inline
    def apply(
        GatewayArn: js.UndefOr[GatewayArn] = js.undefined
    ): AssociateGatewayToServerOutput = {
      val __obj = js.Dynamic.literal()
      GatewayArn.foreach(__v => __obj.updateDynamic("GatewayArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateGatewayToServerOutput]
    }
  }

  @js.native
  trait CreateGatewayInput extends js.Object {
    var ActivationKey: ActivationKey
    var GatewayDisplayName: Name
    var GatewayType: GatewayType
    var Tags: js.UndefOr[Tags]
  }

  object CreateGatewayInput {
    @inline
    def apply(
        ActivationKey: ActivationKey,
        GatewayDisplayName: Name,
        GatewayType: GatewayType,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateGatewayInput = {
      val __obj = js.Dynamic.literal(
        "ActivationKey" -> ActivationKey.asInstanceOf[js.Any],
        "GatewayDisplayName" -> GatewayDisplayName.asInstanceOf[js.Any],
        "GatewayType" -> GatewayType.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGatewayInput]
    }
  }

  @js.native
  trait CreateGatewayOutput extends js.Object {
    var GatewayArn: js.UndefOr[GatewayArn]
  }

  object CreateGatewayOutput {
    @inline
    def apply(
        GatewayArn: js.UndefOr[GatewayArn] = js.undefined
    ): CreateGatewayOutput = {
      val __obj = js.Dynamic.literal()
      GatewayArn.foreach(__v => __obj.updateDynamic("GatewayArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGatewayOutput]
    }
  }

  @js.native
  trait DeleteGatewayInput extends js.Object {
    var GatewayArn: GatewayArn
  }

  object DeleteGatewayInput {
    @inline
    def apply(
        GatewayArn: GatewayArn
    ): DeleteGatewayInput = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGatewayInput]
    }
  }

  @js.native
  trait DeleteGatewayOutput extends js.Object {
    var GatewayArn: js.UndefOr[GatewayArn]
  }

  object DeleteGatewayOutput {
    @inline
    def apply(
        GatewayArn: js.UndefOr[GatewayArn] = js.undefined
    ): DeleteGatewayOutput = {
      val __obj = js.Dynamic.literal()
      GatewayArn.foreach(__v => __obj.updateDynamic("GatewayArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGatewayOutput]
    }
  }

  @js.native
  trait DeleteHypervisorInput extends js.Object {
    var HypervisorArn: ServerArn
  }

  object DeleteHypervisorInput {
    @inline
    def apply(
        HypervisorArn: ServerArn
    ): DeleteHypervisorInput = {
      val __obj = js.Dynamic.literal(
        "HypervisorArn" -> HypervisorArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteHypervisorInput]
    }
  }

  @js.native
  trait DeleteHypervisorOutput extends js.Object {
    var HypervisorArn: js.UndefOr[ServerArn]
  }

  object DeleteHypervisorOutput {
    @inline
    def apply(
        HypervisorArn: js.UndefOr[ServerArn] = js.undefined
    ): DeleteHypervisorOutput = {
      val __obj = js.Dynamic.literal()
      HypervisorArn.foreach(__v => __obj.updateDynamic("HypervisorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteHypervisorOutput]
    }
  }

  @js.native
  trait DisassociateGatewayFromServerInput extends js.Object {
    var GatewayArn: GatewayArn
  }

  object DisassociateGatewayFromServerInput {
    @inline
    def apply(
        GatewayArn: GatewayArn
    ): DisassociateGatewayFromServerInput = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateGatewayFromServerInput]
    }
  }

  @js.native
  trait DisassociateGatewayFromServerOutput extends js.Object {
    var GatewayArn: js.UndefOr[GatewayArn]
  }

  object DisassociateGatewayFromServerOutput {
    @inline
    def apply(
        GatewayArn: js.UndefOr[GatewayArn] = js.undefined
    ): DisassociateGatewayFromServerOutput = {
      val __obj = js.Dynamic.literal()
      GatewayArn.foreach(__v => __obj.updateDynamic("GatewayArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateGatewayFromServerOutput]
    }
  }

  /** A gateway is an Backup Gateway appliance that runs on the customer's network to provide seamless connectivity to backup storage in the Amazon Web Services Cloud.
    */
  @js.native
  trait Gateway extends js.Object {
    var GatewayArn: js.UndefOr[GatewayArn]
    var GatewayDisplayName: js.UndefOr[Name]
    var GatewayType: js.UndefOr[GatewayType]
    var HypervisorId: js.UndefOr[HypervisorId]
    var LastSeenTime: js.UndefOr[Time]
  }

  object Gateway {
    @inline
    def apply(
        GatewayArn: js.UndefOr[GatewayArn] = js.undefined,
        GatewayDisplayName: js.UndefOr[Name] = js.undefined,
        GatewayType: js.UndefOr[GatewayType] = js.undefined,
        HypervisorId: js.UndefOr[HypervisorId] = js.undefined,
        LastSeenTime: js.UndefOr[Time] = js.undefined
    ): Gateway = {
      val __obj = js.Dynamic.literal()
      GatewayArn.foreach(__v => __obj.updateDynamic("GatewayArn")(__v.asInstanceOf[js.Any]))
      GatewayDisplayName.foreach(__v => __obj.updateDynamic("GatewayDisplayName")(__v.asInstanceOf[js.Any]))
      GatewayType.foreach(__v => __obj.updateDynamic("GatewayType")(__v.asInstanceOf[js.Any]))
      HypervisorId.foreach(__v => __obj.updateDynamic("HypervisorId")(__v.asInstanceOf[js.Any]))
      LastSeenTime.foreach(__v => __obj.updateDynamic("LastSeenTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Gateway]
    }
  }

  /** The details of gateway.
    */
  @js.native
  trait GatewayDetails extends js.Object {
    var GatewayArn: js.UndefOr[GatewayArn]
    var GatewayDisplayName: js.UndefOr[Name]
    var GatewayType: js.UndefOr[GatewayType]
    var HypervisorId: js.UndefOr[HypervisorId]
    var LastSeenTime: js.UndefOr[Time]
    var MaintenanceStartTime: js.UndefOr[MaintenanceStartTime]
    var NextUpdateAvailabilityTime: js.UndefOr[Time]
    var VpcEndpoint: js.UndefOr[VpcEndpoint]
  }

  object GatewayDetails {
    @inline
    def apply(
        GatewayArn: js.UndefOr[GatewayArn] = js.undefined,
        GatewayDisplayName: js.UndefOr[Name] = js.undefined,
        GatewayType: js.UndefOr[GatewayType] = js.undefined,
        HypervisorId: js.UndefOr[HypervisorId] = js.undefined,
        LastSeenTime: js.UndefOr[Time] = js.undefined,
        MaintenanceStartTime: js.UndefOr[MaintenanceStartTime] = js.undefined,
        NextUpdateAvailabilityTime: js.UndefOr[Time] = js.undefined,
        VpcEndpoint: js.UndefOr[VpcEndpoint] = js.undefined
    ): GatewayDetails = {
      val __obj = js.Dynamic.literal()
      GatewayArn.foreach(__v => __obj.updateDynamic("GatewayArn")(__v.asInstanceOf[js.Any]))
      GatewayDisplayName.foreach(__v => __obj.updateDynamic("GatewayDisplayName")(__v.asInstanceOf[js.Any]))
      GatewayType.foreach(__v => __obj.updateDynamic("GatewayType")(__v.asInstanceOf[js.Any]))
      HypervisorId.foreach(__v => __obj.updateDynamic("HypervisorId")(__v.asInstanceOf[js.Any]))
      LastSeenTime.foreach(__v => __obj.updateDynamic("LastSeenTime")(__v.asInstanceOf[js.Any]))
      MaintenanceStartTime.foreach(__v => __obj.updateDynamic("MaintenanceStartTime")(__v.asInstanceOf[js.Any]))
      NextUpdateAvailabilityTime.foreach(__v => __obj.updateDynamic("NextUpdateAvailabilityTime")(__v.asInstanceOf[js.Any]))
      VpcEndpoint.foreach(__v => __obj.updateDynamic("VpcEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewayDetails]
    }
  }

  @js.native
  trait GetGatewayInput extends js.Object {
    var GatewayArn: GatewayArn
  }

  object GetGatewayInput {
    @inline
    def apply(
        GatewayArn: GatewayArn
    ): GetGatewayInput = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGatewayInput]
    }
  }

  @js.native
  trait GetGatewayOutput extends js.Object {
    var Gateway: js.UndefOr[GatewayDetails]
  }

  object GetGatewayOutput {
    @inline
    def apply(
        Gateway: js.UndefOr[GatewayDetails] = js.undefined
    ): GetGatewayOutput = {
      val __obj = js.Dynamic.literal()
      Gateway.foreach(__v => __obj.updateDynamic("Gateway")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGatewayOutput]
    }
  }

  @js.native
  trait GetVirtualMachineInput extends js.Object {
    var ResourceArn: ResourceArn
  }

  object GetVirtualMachineInput {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): GetVirtualMachineInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVirtualMachineInput]
    }
  }

  @js.native
  trait GetVirtualMachineOutput extends js.Object {
    var VirtualMachine: js.UndefOr[VirtualMachineDetails]
  }

  object GetVirtualMachineOutput {
    @inline
    def apply(
        VirtualMachine: js.UndefOr[VirtualMachineDetails] = js.undefined
    ): GetVirtualMachineOutput = {
      val __obj = js.Dynamic.literal()
      VirtualMachine.foreach(__v => __obj.updateDynamic("VirtualMachine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVirtualMachineOutput]
    }
  }

  /** Represents the hypervisor's permissions to which the gateway will connect. A hypervisor is hardware, software, or firmware that creates and manages virtual machines, and allocates resources to them.
    */
  @js.native
  trait Hypervisor extends js.Object {
    var Host: js.UndefOr[Host]
    var HypervisorArn: js.UndefOr[ServerArn]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var Name: js.UndefOr[Name]
    var State: js.UndefOr[HypervisorState]
  }

  object Hypervisor {
    @inline
    def apply(
        Host: js.UndefOr[Host] = js.undefined,
        HypervisorArn: js.UndefOr[ServerArn] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        State: js.UndefOr[HypervisorState] = js.undefined
    ): Hypervisor = {
      val __obj = js.Dynamic.literal()
      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      HypervisorArn.foreach(__v => __obj.updateDynamic("HypervisorArn")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Hypervisor]
    }
  }

  @js.native
  trait ImportHypervisorConfigurationInput extends js.Object {
    var Host: Host
    var Name: Name
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
    var Password: js.UndefOr[Password]
    var Tags: js.UndefOr[Tags]
    var Username: js.UndefOr[Username]
  }

  object ImportHypervisorConfigurationInput {
    @inline
    def apply(
        Host: Host,
        Name: Name,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined,
        Password: js.UndefOr[Password] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Username: js.UndefOr[Username] = js.undefined
    ): ImportHypervisorConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "Host" -> Host.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportHypervisorConfigurationInput]
    }
  }

  @js.native
  trait ImportHypervisorConfigurationOutput extends js.Object {
    var HypervisorArn: js.UndefOr[ServerArn]
  }

  object ImportHypervisorConfigurationOutput {
    @inline
    def apply(
        HypervisorArn: js.UndefOr[ServerArn] = js.undefined
    ): ImportHypervisorConfigurationOutput = {
      val __obj = js.Dynamic.literal()
      HypervisorArn.foreach(__v => __obj.updateDynamic("HypervisorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportHypervisorConfigurationOutput]
    }
  }

  @js.native
  trait ListGatewaysInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGatewaysInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewaysInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewaysInput]
    }
  }

  @js.native
  trait ListGatewaysOutput extends js.Object {
    var Gateways: js.UndefOr[Gateways]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGatewaysOutput {
    @inline
    def apply(
        Gateways: js.UndefOr[Gateways] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewaysOutput = {
      val __obj = js.Dynamic.literal()
      Gateways.foreach(__v => __obj.updateDynamic("Gateways")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewaysOutput]
    }
  }

  @js.native
  trait ListHypervisorsInput extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHypervisorsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHypervisorsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHypervisorsInput]
    }
  }

  @js.native
  trait ListHypervisorsOutput extends js.Object {
    var Hypervisors: js.UndefOr[Hypervisors]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHypervisorsOutput {
    @inline
    def apply(
        Hypervisors: js.UndefOr[Hypervisors] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHypervisorsOutput = {
      val __obj = js.Dynamic.literal()
      Hypervisors.foreach(__v => __obj.updateDynamic("Hypervisors")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHypervisorsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var Tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait ListVirtualMachinesInput extends js.Object {
    var HypervisorArn: js.UndefOr[ServerArn]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListVirtualMachinesInput {
    @inline
    def apply(
        HypervisorArn: js.UndefOr[ServerArn] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListVirtualMachinesInput = {
      val __obj = js.Dynamic.literal()
      HypervisorArn.foreach(__v => __obj.updateDynamic("HypervisorArn")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualMachinesInput]
    }
  }

  @js.native
  trait ListVirtualMachinesOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var VirtualMachines: js.UndefOr[VirtualMachines]
  }

  object ListVirtualMachinesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        VirtualMachines: js.UndefOr[VirtualMachines] = js.undefined
    ): ListVirtualMachinesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VirtualMachines.foreach(__v => __obj.updateDynamic("VirtualMachines")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualMachinesOutput]
    }
  }

  /** This is your gateway's weekly maintenance start time including the day and time of the week. Note that values are in terms of the gateway's time zone. Can be weekly or monthly.
    */
  @js.native
  trait MaintenanceStartTime extends js.Object {
    var HourOfDay: HourOfDay
    var MinuteOfHour: MinuteOfHour
    var DayOfMonth: js.UndefOr[DayOfMonth]
    var DayOfWeek: js.UndefOr[DayOfWeek]
  }

  object MaintenanceStartTime {
    @inline
    def apply(
        HourOfDay: HourOfDay,
        MinuteOfHour: MinuteOfHour,
        DayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    ): MaintenanceStartTime = {
      val __obj = js.Dynamic.literal(
        "HourOfDay" -> HourOfDay.asInstanceOf[js.Any],
        "MinuteOfHour" -> MinuteOfHour.asInstanceOf[js.Any]
      )

      DayOfMonth.foreach(__v => __obj.updateDynamic("DayOfMonth")(__v.asInstanceOf[js.Any]))
      DayOfWeek.foreach(__v => __obj.updateDynamic("DayOfWeek")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaintenanceStartTime]
    }
  }

  @js.native
  trait PutMaintenanceStartTimeInput extends js.Object {
    var GatewayArn: GatewayArn
    var HourOfDay: HourOfDay
    var MinuteOfHour: MinuteOfHour
    var DayOfMonth: js.UndefOr[DayOfMonth]
    var DayOfWeek: js.UndefOr[DayOfWeek]
  }

  object PutMaintenanceStartTimeInput {
    @inline
    def apply(
        GatewayArn: GatewayArn,
        HourOfDay: HourOfDay,
        MinuteOfHour: MinuteOfHour,
        DayOfMonth: js.UndefOr[DayOfMonth] = js.undefined,
        DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    ): PutMaintenanceStartTimeInput = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any],
        "HourOfDay" -> HourOfDay.asInstanceOf[js.Any],
        "MinuteOfHour" -> MinuteOfHour.asInstanceOf[js.Any]
      )

      DayOfMonth.foreach(__v => __obj.updateDynamic("DayOfMonth")(__v.asInstanceOf[js.Any]))
      DayOfWeek.foreach(__v => __obj.updateDynamic("DayOfWeek")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutMaintenanceStartTimeInput]
    }
  }

  @js.native
  trait PutMaintenanceStartTimeOutput extends js.Object {
    var GatewayArn: js.UndefOr[GatewayArn]
  }

  object PutMaintenanceStartTimeOutput {
    @inline
    def apply(
        GatewayArn: js.UndefOr[GatewayArn] = js.undefined
    ): PutMaintenanceStartTimeOutput = {
      val __obj = js.Dynamic.literal()
      GatewayArn.foreach(__v => __obj.updateDynamic("GatewayArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutMaintenanceStartTimeOutput]
    }
  }

  /** A key-value pair you can use to manage, filter, and search for your resources. Allowed characters include UTF-8 letters, numbers, spaces, and the following characters: + - = . _ : /.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceARN: ResourceArn
    var Tags: Tags
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceARN: ResourceArn,
        Tags: Tags
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceArn]
  }

  object TagResourceOutput {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceArn] = js.undefined
    ): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait TestHypervisorConfigurationInput extends js.Object {
    var GatewayArn: GatewayArn
    var Host: Host
    var Password: js.UndefOr[Password]
    var Username: js.UndefOr[Username]
  }

  object TestHypervisorConfigurationInput {
    @inline
    def apply(
        GatewayArn: GatewayArn,
        Host: Host,
        Password: js.UndefOr[Password] = js.undefined,
        Username: js.UndefOr[Username] = js.undefined
    ): TestHypervisorConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any]
      )

      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestHypervisorConfigurationInput]
    }
  }

  @js.native
  trait TestHypervisorConfigurationOutput extends js.Object

  object TestHypervisorConfigurationOutput {
    @inline
    def apply(): TestHypervisorConfigurationOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestHypervisorConfigurationOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceARN: ResourceArn
    var TagKeys: TagKeys
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceARN: ResourceArn,
        TagKeys: TagKeys
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object {
    var ResourceARN: js.UndefOr[ResourceArn]
  }

  object UntagResourceOutput {
    @inline
    def apply(
        ResourceARN: js.UndefOr[ResourceArn] = js.undefined
    ): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      ResourceARN.foreach(__v => __obj.updateDynamic("ResourceARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateGatewayInformationInput extends js.Object {
    var GatewayArn: GatewayArn
    var GatewayDisplayName: js.UndefOr[Name]
  }

  object UpdateGatewayInformationInput {
    @inline
    def apply(
        GatewayArn: GatewayArn,
        GatewayDisplayName: js.UndefOr[Name] = js.undefined
    ): UpdateGatewayInformationInput = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any]
      )

      GatewayDisplayName.foreach(__v => __obj.updateDynamic("GatewayDisplayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayInformationInput]
    }
  }

  @js.native
  trait UpdateGatewayInformationOutput extends js.Object {
    var GatewayArn: js.UndefOr[GatewayArn]
  }

  object UpdateGatewayInformationOutput {
    @inline
    def apply(
        GatewayArn: js.UndefOr[GatewayArn] = js.undefined
    ): UpdateGatewayInformationOutput = {
      val __obj = js.Dynamic.literal()
      GatewayArn.foreach(__v => __obj.updateDynamic("GatewayArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayInformationOutput]
    }
  }

  @js.native
  trait UpdateGatewaySoftwareNowInput extends js.Object {
    var GatewayArn: GatewayArn
  }

  object UpdateGatewaySoftwareNowInput {
    @inline
    def apply(
        GatewayArn: GatewayArn
    ): UpdateGatewaySoftwareNowInput = {
      val __obj = js.Dynamic.literal(
        "GatewayArn" -> GatewayArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGatewaySoftwareNowInput]
    }
  }

  @js.native
  trait UpdateGatewaySoftwareNowOutput extends js.Object {
    var GatewayArn: js.UndefOr[GatewayArn]
  }

  object UpdateGatewaySoftwareNowOutput {
    @inline
    def apply(
        GatewayArn: js.UndefOr[GatewayArn] = js.undefined
    ): UpdateGatewaySoftwareNowOutput = {
      val __obj = js.Dynamic.literal()
      GatewayArn.foreach(__v => __obj.updateDynamic("GatewayArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewaySoftwareNowOutput]
    }
  }

  @js.native
  trait UpdateHypervisorInput extends js.Object {
    var HypervisorArn: ServerArn
    var Host: js.UndefOr[Host]
    var Name: js.UndefOr[Name]
    var Password: js.UndefOr[Password]
    var Username: js.UndefOr[Username]
  }

  object UpdateHypervisorInput {
    @inline
    def apply(
        HypervisorArn: ServerArn,
        Host: js.UndefOr[Host] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Password: js.UndefOr[Password] = js.undefined,
        Username: js.UndefOr[Username] = js.undefined
    ): UpdateHypervisorInput = {
      val __obj = js.Dynamic.literal(
        "HypervisorArn" -> HypervisorArn.asInstanceOf[js.Any]
      )

      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateHypervisorInput]
    }
  }

  @js.native
  trait UpdateHypervisorOutput extends js.Object {
    var HypervisorArn: js.UndefOr[ServerArn]
  }

  object UpdateHypervisorOutput {
    @inline
    def apply(
        HypervisorArn: js.UndefOr[ServerArn] = js.undefined
    ): UpdateHypervisorOutput = {
      val __obj = js.Dynamic.literal()
      HypervisorArn.foreach(__v => __obj.updateDynamic("HypervisorArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateHypervisorOutput]
    }
  }

  /** A virtual machine that is on a hypervisor.
    */
  @js.native
  trait VirtualMachine extends js.Object {
    var HostName: js.UndefOr[Name]
    var HypervisorId: js.UndefOr[String]
    var LastBackupDate: js.UndefOr[Time]
    var Name: js.UndefOr[Name]
    var Path: js.UndefOr[Path]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object VirtualMachine {
    @inline
    def apply(
        HostName: js.UndefOr[Name] = js.undefined,
        HypervisorId: js.UndefOr[String] = js.undefined,
        LastBackupDate: js.UndefOr[Time] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): VirtualMachine = {
      val __obj = js.Dynamic.literal()
      HostName.foreach(__v => __obj.updateDynamic("HostName")(__v.asInstanceOf[js.Any]))
      HypervisorId.foreach(__v => __obj.updateDynamic("HypervisorId")(__v.asInstanceOf[js.Any]))
      LastBackupDate.foreach(__v => __obj.updateDynamic("LastBackupDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualMachine]
    }
  }

  /** Your <code>VirtualMachine</code> objects, ordered by their Amazon Resource Names (ARNs).
    */
  @js.native
  trait VirtualMachineDetails extends js.Object {
    var HostName: js.UndefOr[Name]
    var HypervisorId: js.UndefOr[String]
    var LastBackupDate: js.UndefOr[Time]
    var Name: js.UndefOr[Name]
    var Path: js.UndefOr[Path]
    var ResourceArn: js.UndefOr[ResourceArn]
  }

  object VirtualMachineDetails {
    @inline
    def apply(
        HostName: js.UndefOr[Name] = js.undefined,
        HypervisorId: js.UndefOr[String] = js.undefined,
        LastBackupDate: js.UndefOr[Time] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Path: js.UndefOr[Path] = js.undefined,
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined
    ): VirtualMachineDetails = {
      val __obj = js.Dynamic.literal()
      HostName.foreach(__v => __obj.updateDynamic("HostName")(__v.asInstanceOf[js.Any]))
      HypervisorId.foreach(__v => __obj.updateDynamic("HypervisorId")(__v.asInstanceOf[js.Any]))
      LastBackupDate.foreach(__v => __obj.updateDynamic("LastBackupDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualMachineDetails]
    }
  }
}
