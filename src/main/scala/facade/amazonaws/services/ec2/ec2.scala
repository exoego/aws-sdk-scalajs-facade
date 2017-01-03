package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object ec2 {
  type AccountAttributeList = js.Array[AccountAttribute]
  type AccountAttributeName = String
  type AccountAttributeNameStringList = js.Array[AccountAttributeName]
  type AccountAttributeValueList = js.Array[AccountAttributeValue]
  type ActiveInstanceSet = js.Array[ActiveInstance]
  type ActivityStatus = String
  type AddressList = js.Array[Address]
  type Affinity = String
  type AllocationIdList = js.Array[String]
  type AllocationState = String
  type AllocationStrategy = String
  type ArchitectureValues = String
  type AttachmentStatus = String
  type AutoPlacement = String
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type AvailabilityZoneMessageList = js.Array[AvailabilityZoneMessage]
  type AvailabilityZoneState = String
  type AvailableInstanceCapacityList = js.Array[InstanceCapacity]
  type BatchState = String
  type Blob = js.Array[Byte]
  type BlockDeviceMappingList = js.Array[BlockDeviceMapping]
  type BlockDeviceMappingRequestList = js.Array[BlockDeviceMapping]
  type BundleIdStringList = js.Array[String]
  type BundleTaskList = js.Array[BundleTask]
  type BundleTaskState = String
  type CancelBatchErrorCode = String
  type CancelSpotFleetRequestsErrorSet = js.Array[CancelSpotFleetRequestsErrorItem]
  type CancelSpotFleetRequestsSuccessSet = js.Array[CancelSpotFleetRequestsSuccessItem]
  type CancelSpotInstanceRequestState = String
  type CancelledSpotInstanceRequestList = js.Array[CancelledSpotInstanceRequest]
  type ClassicLinkDnsSupportList = js.Array[ClassicLinkDnsSupport]
  type ClassicLinkInstanceList = js.Array[ClassicLinkInstance]
  type ContainerFormat = String
  type ConversionIdStringList = js.Array[String]
  type ConversionTaskState = String
  type CreateVolumePermissionList = js.Array[CreateVolumePermission]
  type CurrencyCodeValues = String
  type CustomerGatewayIdStringList = js.Array[String]
  type CustomerGatewayList = js.Array[CustomerGateway]
  type DatafeedSubscriptionState = String
  type DateTime = js.Date
  type DescribeConversionTaskList = js.Array[ConversionTask]
  type DeviceType = String
  type DhcpConfigurationList = js.Array[DhcpConfiguration]
  type DhcpConfigurationValueList = js.Array[AttributeValue]
  type DhcpOptionsIdStringList = js.Array[String]
  type DhcpOptionsList = js.Array[DhcpOptions]
  type DiskImageFormat = String
  type DiskImageList = js.Array[DiskImage]
  type DomainType = String
  type EgressOnlyInternetGatewayId = String
  type EgressOnlyInternetGatewayIdList = js.Array[EgressOnlyInternetGatewayId]
  type EgressOnlyInternetGatewayList = js.Array[EgressOnlyInternetGateway]
  type EventCode = String
  type EventType = String
  type ExcessCapacityTerminationPolicy = String
  type ExecutableByStringList = js.Array[String]
  type ExportEnvironment = String
  type ExportTaskIdStringList = js.Array[String]
  type ExportTaskList = js.Array[ExportTask]
  type ExportTaskState = String
  type FilterList = js.Array[Filter]
  type FleetType = String
  type FlowLogSet = js.Array[FlowLog]
  type FlowLogsResourceType = String
  type GatewayType = String
  type GroupIdStringList = js.Array[String]
  type GroupIdentifierList = js.Array[GroupIdentifier]
  type GroupIds = js.Array[String]
  type GroupNameStringList = js.Array[String]
  type HistoryRecords = js.Array[HistoryRecord]
  type HostInstanceList = js.Array[HostInstance]
  type HostList = js.Array[Host]
  type HostOfferingSet = js.Array[HostOffering]
  type HostReservationIdSet = js.Array[String]
  type HostReservationSet = js.Array[HostReservation]
  type HostTenancy = String
  type HypervisorType = String
  type IdFormatList = js.Array[IdFormat]
  type ImageAttributeName = String
  type ImageDiskContainerList = js.Array[ImageDiskContainer]
  type ImageIdStringList = js.Array[String]
  type ImageList = js.Array[Image]
  type ImageState = String
  type ImageTypeValues = String
  type ImportImageTaskList = js.Array[ImportImageTask]
  type ImportInstanceVolumeDetailSet = js.Array[ImportInstanceVolumeDetailItem]
  type ImportSnapshotTaskList = js.Array[ImportSnapshotTask]
  type ImportTaskIdList = js.Array[String]
  type InstanceAttributeName = String
  type InstanceBlockDeviceMappingList = js.Array[InstanceBlockDeviceMapping]
  type InstanceBlockDeviceMappingSpecificationList = js.Array[InstanceBlockDeviceMappingSpecification]
  type InstanceCountList = js.Array[InstanceCount]
  type InstanceIdSet = js.Array[String]
  type InstanceIdStringList = js.Array[String]
  type InstanceIpv6AddressList = js.Array[InstanceIpv6Address]
  type InstanceLifecycleType = String
  type InstanceList = js.Array[Instance]
  type InstanceMonitoringList = js.Array[InstanceMonitoring]
  type InstanceNetworkInterfaceList = js.Array[InstanceNetworkInterface]
  type InstanceNetworkInterfaceSpecificationList = js.Array[InstanceNetworkInterfaceSpecification]
  type InstancePrivateIpAddressList = js.Array[InstancePrivateIpAddress]
  type InstanceStateChangeList = js.Array[InstanceStateChange]
  type InstanceStateName = String
  type InstanceStatusDetailsList = js.Array[InstanceStatusDetails]
  type InstanceStatusEventList = js.Array[InstanceStatusEvent]
  type InstanceStatusList = js.Array[InstanceStatus]
  type InstanceType = String
  type InstanceTypeList = js.Array[InstanceType]
  type InternetGatewayAttachmentList = js.Array[InternetGatewayAttachment]
  type InternetGatewayList = js.Array[InternetGateway]
  type IpPermissionList = js.Array[IpPermission]
  type IpRangeList = js.Array[IpRange]
  type IpRanges = js.Array[String]
  type Ipv6Address = String
  type Ipv6AddressList = js.Array[String]
  type Ipv6CidrBlockSet = js.Array[Ipv6CidrBlock]
  type Ipv6RangeList = js.Array[Ipv6Range]
  type KeyNameStringList = js.Array[String]
  type KeyPairList = js.Array[KeyPairInfo]
  type LaunchPermissionList = js.Array[LaunchPermission]
  type LaunchSpecsList = js.Array[SpotFleetLaunchSpecification]
  type ListingState = String
  type ListingStatus = String
  type MaxResults = Integer
  type MonitoringState = String
  type MoveStatus = String
  type MovingAddressStatusSet = js.Array[MovingAddressStatus]
  type NatGatewayAddressList = js.Array[NatGatewayAddress]
  type NatGatewayList = js.Array[NatGateway]
  type NatGatewayState = String
  type NetworkAclAssociationList = js.Array[NetworkAclAssociation]
  type NetworkAclEntryList = js.Array[NetworkAclEntry]
  type NetworkAclList = js.Array[NetworkAcl]
  type NetworkInterfaceAttribute = String
  type NetworkInterfaceIdList = js.Array[String]
  type NetworkInterfaceIpv6AddressesList = js.Array[NetworkInterfaceIpv6Address]
  type NetworkInterfaceList = js.Array[NetworkInterface]
  type NetworkInterfacePrivateIpAddressList = js.Array[NetworkInterfacePrivateIpAddress]
  type NetworkInterfaceStatus = String
  type NetworkInterfaceType = String
  type NewDhcpConfigurationList = js.Array[NewDhcpConfiguration]
  type NextToken = String
  type OccurrenceDayRequestSet = js.Array[Integer]
  type OccurrenceDaySet = js.Array[Integer]
  type OfferingClassType = String
  type OfferingTypeValues = String
  type OperationType = String
  type OwnerStringList = js.Array[String]
  type PaymentOption = String
  type PermissionGroup = String
  type PlacementGroupList = js.Array[PlacementGroup]
  type PlacementGroupState = String
  type PlacementGroupStringList = js.Array[String]
  type PlacementStrategy = String
  type PlatformValues = String
  type PrefixListIdList = js.Array[PrefixListId]
  type PrefixListIdSet = js.Array[String]
  type PrefixListSet = js.Array[PrefixList]
  type PriceScheduleList = js.Array[PriceSchedule]
  type PriceScheduleSpecificationList = js.Array[PriceScheduleSpecification]
  type PricingDetailsList = js.Array[PricingDetail]
  type PrivateIpAddressConfigSet = js.Array[ScheduledInstancesPrivateIpAddressConfig]
  type PrivateIpAddressSpecificationList = js.Array[PrivateIpAddressSpecification]
  type PrivateIpAddressStringList = js.Array[String]
  type ProductCodeList = js.Array[ProductCode]
  type ProductCodeStringList = js.Array[String]
  type ProductCodeValues = String
  type ProductDescriptionList = js.Array[String]
  type PropagatingVgwList = js.Array[PropagatingVgw]
  type PublicIpStringList = js.Array[String]
  type PurchaseRequestSet = js.Array[PurchaseRequest]
  type PurchaseSet = js.Array[Purchase]
  type PurchasedScheduledInstanceSet = js.Array[ScheduledInstance]
  type RIProductDescription = String
  type ReasonCodesList = js.Array[ReportInstanceReasonCodes]
  type RecurringChargeFrequency = String
  type RecurringChargesList = js.Array[RecurringCharge]
  type RegionList = js.Array[Region]
  type RegionNameStringList = js.Array[String]
  type ReportInstanceReasonCodes = String
  type ReportStatusType = String
  type RequestHostIdList = js.Array[String]
  type RequestHostIdSet = js.Array[String]
  type ReservationList = js.Array[Reservation]
  type ReservationState = String
  type ReservedInstanceIdSet = js.Array[String]
  type ReservedInstanceReservationValueSet = js.Array[ReservedInstanceReservationValue]
  type ReservedInstanceState = String
  type ReservedInstancesConfigurationList = js.Array[ReservedInstancesConfiguration]
  type ReservedInstancesIdStringList = js.Array[String]
  type ReservedInstancesList = js.Array[ReservedInstances]
  type ReservedInstancesListingList = js.Array[ReservedInstancesListing]
  type ReservedInstancesModificationIdStringList = js.Array[String]
  type ReservedInstancesModificationList = js.Array[ReservedInstancesModification]
  type ReservedInstancesModificationResultList = js.Array[ReservedInstancesModificationResult]
  type ReservedInstancesOfferingIdStringList = js.Array[String]
  type ReservedInstancesOfferingList = js.Array[ReservedInstancesOffering]
  type ReservedIntancesIds = js.Array[ReservedInstancesId]
  type ResetImageAttributeName = String
  type ResourceIdList = js.Array[String]
  type ResourceType = String
  type ResponseHostIdList = js.Array[String]
  type ResponseHostIdSet = js.Array[String]
  type RestorableByStringList = js.Array[String]
  type RouteList = js.Array[Route]
  type RouteOrigin = String
  type RouteState = String
  type RouteTableAssociationList = js.Array[RouteTableAssociation]
  type RouteTableList = js.Array[RouteTable]
  type RuleAction = String
  type ScheduledInstanceAvailabilitySet = js.Array[ScheduledInstanceAvailability]
  type ScheduledInstanceIdRequestSet = js.Array[String]
  type ScheduledInstanceSet = js.Array[ScheduledInstance]
  type ScheduledInstancesBlockDeviceMappingSet = js.Array[ScheduledInstancesBlockDeviceMapping]
  type ScheduledInstancesIpv6AddressList = js.Array[ScheduledInstancesIpv6Address]
  type ScheduledInstancesNetworkInterfaceSet = js.Array[ScheduledInstancesNetworkInterface]
  type ScheduledInstancesSecurityGroupIdSet = js.Array[String]
  type SecurityGroupIdStringList = js.Array[String]
  type SecurityGroupList = js.Array[SecurityGroup]
  type SecurityGroupReferences = js.Array[SecurityGroupReference]
  type SecurityGroupStringList = js.Array[String]
  type ShutdownBehavior = String
  type SnapshotAttributeName = String
  type SnapshotDetailList = js.Array[SnapshotDetail]
  type SnapshotIdStringList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SnapshotState = String
  type SpotFleetRequestConfigSet = js.Array[SpotFleetRequestConfig]
  type SpotInstanceRequestIdList = js.Array[String]
  type SpotInstanceRequestList = js.Array[SpotInstanceRequest]
  type SpotInstanceState = String
  type SpotInstanceType = String
  type SpotPriceHistoryList = js.Array[SpotPrice]
  type StaleIpPermissionSet = js.Array[StaleIpPermission]
  type StaleSecurityGroupSet = js.Array[StaleSecurityGroup]
  type State = String
  type Status = String
  type StatusName = String
  type StatusType = String
  type SubnetCidrBlockStateCode = String
  type SubnetIdStringList = js.Array[String]
  type SubnetIpv6CidrBlockAssociationSet = js.Array[SubnetIpv6CidrBlockAssociation]
  type SubnetList = js.Array[Subnet]
  type SubnetState = String
  type SummaryStatus = String
  type TagDescriptionList = js.Array[TagDescription]
  type TagList = js.Array[Tag]
  type TargetConfigurationRequestSet = js.Array[TargetConfigurationRequest]
  type TargetReservationValueSet = js.Array[TargetReservationValue]
  type TelemetryStatus = String
  type Tenancy = String
  type TrafficType = String
  type UnsuccessfulItemList = js.Array[UnsuccessfulItem]
  type UnsuccessfulItemSet = js.Array[UnsuccessfulItem]
  type UserGroupStringList = js.Array[String]
  type UserIdGroupPairList = js.Array[UserIdGroupPair]
  type UserIdGroupPairSet = js.Array[UserIdGroupPair]
  type UserIdStringList = js.Array[String]
  type ValueStringList = js.Array[String]
  type VgwTelemetryList = js.Array[VgwTelemetry]
  type VirtualizationType = String
  type VolumeAttachmentList = js.Array[VolumeAttachment]
  type VolumeAttachmentState = String
  type VolumeAttributeName = String
  type VolumeIdStringList = js.Array[String]
  type VolumeList = js.Array[Volume]
  type VolumeState = String
  type VolumeStatusActionsList = js.Array[VolumeStatusAction]
  type VolumeStatusDetailsList = js.Array[VolumeStatusDetails]
  type VolumeStatusEventsList = js.Array[VolumeStatusEvent]
  type VolumeStatusInfoStatus = String
  type VolumeStatusList = js.Array[VolumeStatusItem]
  type VolumeStatusName = String
  type VolumeType = String
  type VpcAttachmentList = js.Array[VpcAttachment]
  type VpcAttributeName = String
  type VpcCidrBlockStateCode = String
  type VpcClassicLinkIdList = js.Array[String]
  type VpcClassicLinkList = js.Array[VpcClassicLink]
  type VpcEndpointSet = js.Array[VpcEndpoint]
  type VpcIdStringList = js.Array[String]
  type VpcIpv6CidrBlockAssociationSet = js.Array[VpcIpv6CidrBlockAssociation]
  type VpcList = js.Array[Vpc]
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  type VpcPeeringConnectionStateReasonCode = String
  type VpcState = String
  type VpnConnectionIdStringList = js.Array[String]
  type VpnConnectionList = js.Array[VpnConnection]
  type VpnGatewayIdStringList = js.Array[String]
  type VpnGatewayList = js.Array[VpnGateway]
  type VpnState = String
  type VpnStaticRouteList = js.Array[VpnStaticRoute]
  type VpnStaticRouteSource = String
  type ZoneNameStringList = js.Array[String]
  type scope = String
}

package ec2 {
  @js.native
  trait Ec2 extends js.Object {
    def acceptReservedInstancesExchangeQuote(params: AcceptReservedInstancesExchangeQuoteRequest, callback: Callback[AcceptReservedInstancesExchangeQuoteResult]): Unit = js.native
    def acceptReservedInstancesExchangeQuote(params: AcceptReservedInstancesExchangeQuoteRequest): Request[AcceptReservedInstancesExchangeQuoteResult] = js.native
    def acceptVpcPeeringConnection(params: AcceptVpcPeeringConnectionRequest, callback: Callback[AcceptVpcPeeringConnectionResult]): Unit = js.native
    def acceptVpcPeeringConnection(params: AcceptVpcPeeringConnectionRequest): Request[AcceptVpcPeeringConnectionResult] = js.native
    def allocateAddress(params: AllocateAddressRequest, callback: Callback[AllocateAddressResult]): Unit = js.native
    def allocateAddress(params: AllocateAddressRequest): Request[AllocateAddressResult] = js.native
    def allocateHosts(params: AllocateHostsRequest, callback: Callback[AllocateHostsResult]): Unit = js.native
    def allocateHosts(params: AllocateHostsRequest): Request[AllocateHostsResult] = js.native
    def assignIpv6Addresses(params: AssignIpv6AddressesRequest, callback: Callback[AssignIpv6AddressesResult]): Unit = js.native
    def assignIpv6Addresses(params: AssignIpv6AddressesRequest): Request[AssignIpv6AddressesResult] = js.native
    def assignPrivateIpAddresses(params: AssignPrivateIpAddressesRequest, callback: Callback[js.Object]): Unit = js.native
    def assignPrivateIpAddresses(params: AssignPrivateIpAddressesRequest): Request[js.Object] = js.native
    def associateAddress(params: AssociateAddressRequest, callback: Callback[AssociateAddressResult]): Unit = js.native
    def associateAddress(params: AssociateAddressRequest): Request[AssociateAddressResult] = js.native
    def associateDhcpOptions(params: AssociateDhcpOptionsRequest, callback: Callback[js.Object]): Unit = js.native
    def associateDhcpOptions(params: AssociateDhcpOptionsRequest): Request[js.Object] = js.native
    def associateRouteTable(params: AssociateRouteTableRequest, callback: Callback[AssociateRouteTableResult]): Unit = js.native
    def associateRouteTable(params: AssociateRouteTableRequest): Request[AssociateRouteTableResult] = js.native
    def associateSubnetCidrBlock(params: AssociateSubnetCidrBlockRequest, callback: Callback[AssociateSubnetCidrBlockResult]): Unit = js.native
    def associateSubnetCidrBlock(params: AssociateSubnetCidrBlockRequest): Request[AssociateSubnetCidrBlockResult] = js.native
    def associateVpcCidrBlock(params: AssociateVpcCidrBlockRequest, callback: Callback[AssociateVpcCidrBlockResult]): Unit = js.native
    def associateVpcCidrBlock(params: AssociateVpcCidrBlockRequest): Request[AssociateVpcCidrBlockResult] = js.native
    def attachClassicLinkVpc(params: AttachClassicLinkVpcRequest, callback: Callback[AttachClassicLinkVpcResult]): Unit = js.native
    def attachClassicLinkVpc(params: AttachClassicLinkVpcRequest): Request[AttachClassicLinkVpcResult] = js.native
    def attachInternetGateway(params: AttachInternetGatewayRequest, callback: Callback[js.Object]): Unit = js.native
    def attachInternetGateway(params: AttachInternetGatewayRequest): Request[js.Object] = js.native
    def attachNetworkInterface(params: AttachNetworkInterfaceRequest, callback: Callback[AttachNetworkInterfaceResult]): Unit = js.native
    def attachNetworkInterface(params: AttachNetworkInterfaceRequest): Request[AttachNetworkInterfaceResult] = js.native
    def attachVolume(params: AttachVolumeRequest, callback: Callback[VolumeAttachment]): Unit = js.native
    def attachVolume(params: AttachVolumeRequest): Request[VolumeAttachment] = js.native
    def attachVpnGateway(params: AttachVpnGatewayRequest, callback: Callback[AttachVpnGatewayResult]): Unit = js.native
    def attachVpnGateway(params: AttachVpnGatewayRequest): Request[AttachVpnGatewayResult] = js.native
    def authorizeSecurityGroupEgress(params: AuthorizeSecurityGroupEgressRequest, callback: Callback[js.Object]): Unit = js.native
    def authorizeSecurityGroupEgress(params: AuthorizeSecurityGroupEgressRequest): Request[js.Object] = js.native
    def authorizeSecurityGroupIngress(params: AuthorizeSecurityGroupIngressRequest, callback: Callback[js.Object]): Unit = js.native
    def authorizeSecurityGroupIngress(params: AuthorizeSecurityGroupIngressRequest): Request[js.Object] = js.native
    def bundleInstance(params: BundleInstanceRequest, callback: Callback[BundleInstanceResult]): Unit = js.native
    def bundleInstance(params: BundleInstanceRequest): Request[BundleInstanceResult] = js.native
    def cancelBundleTask(params: CancelBundleTaskRequest, callback: Callback[CancelBundleTaskResult]): Unit = js.native
    def cancelBundleTask(params: CancelBundleTaskRequest): Request[CancelBundleTaskResult] = js.native
    def cancelConversionTask(params: CancelConversionRequest, callback: Callback[js.Object]): Unit = js.native
    def cancelConversionTask(params: CancelConversionRequest): Request[js.Object] = js.native
    def cancelExportTask(params: CancelExportTaskRequest, callback: Callback[js.Object]): Unit = js.native
    def cancelExportTask(params: CancelExportTaskRequest): Request[js.Object] = js.native
    def cancelImportTask(params: CancelImportTaskRequest, callback: Callback[CancelImportTaskResult]): Unit = js.native
    def cancelImportTask(params: CancelImportTaskRequest): Request[CancelImportTaskResult] = js.native
    def cancelReservedInstancesListing(params: CancelReservedInstancesListingRequest, callback: Callback[CancelReservedInstancesListingResult]): Unit = js.native
    def cancelReservedInstancesListing(params: CancelReservedInstancesListingRequest): Request[CancelReservedInstancesListingResult] = js.native
    def cancelSpotFleetRequests(params: CancelSpotFleetRequestsRequest, callback: Callback[CancelSpotFleetRequestsResponse]): Unit = js.native
    def cancelSpotFleetRequests(params: CancelSpotFleetRequestsRequest): Request[CancelSpotFleetRequestsResponse] = js.native
    def cancelSpotInstanceRequests(params: CancelSpotInstanceRequestsRequest, callback: Callback[CancelSpotInstanceRequestsResult]): Unit = js.native
    def cancelSpotInstanceRequests(params: CancelSpotInstanceRequestsRequest): Request[CancelSpotInstanceRequestsResult] = js.native
    def confirmProductInstance(params: ConfirmProductInstanceRequest, callback: Callback[ConfirmProductInstanceResult]): Unit = js.native
    def confirmProductInstance(params: ConfirmProductInstanceRequest): Request[ConfirmProductInstanceResult] = js.native
    def copyImage(params: CopyImageRequest, callback: Callback[CopyImageResult]): Unit = js.native
    def copyImage(params: CopyImageRequest): Request[CopyImageResult] = js.native
    def copySnapshot(params: CopySnapshotRequest, callback: Callback[CopySnapshotResult]): Unit = js.native
    def copySnapshot(params: CopySnapshotRequest): Request[CopySnapshotResult] = js.native
    def createCustomerGateway(params: CreateCustomerGatewayRequest, callback: Callback[CreateCustomerGatewayResult]): Unit = js.native
    def createCustomerGateway(params: CreateCustomerGatewayRequest): Request[CreateCustomerGatewayResult] = js.native
    def createDhcpOptions(params: CreateDhcpOptionsRequest, callback: Callback[CreateDhcpOptionsResult]): Unit = js.native
    def createDhcpOptions(params: CreateDhcpOptionsRequest): Request[CreateDhcpOptionsResult] = js.native
    def createEgressOnlyInternetGateway(params: CreateEgressOnlyInternetGatewayRequest, callback: Callback[CreateEgressOnlyInternetGatewayResult]): Unit = js.native
    def createEgressOnlyInternetGateway(params: CreateEgressOnlyInternetGatewayRequest): Request[CreateEgressOnlyInternetGatewayResult] = js.native
    def createFlowLogs(params: CreateFlowLogsRequest, callback: Callback[CreateFlowLogsResult]): Unit = js.native
    def createFlowLogs(params: CreateFlowLogsRequest): Request[CreateFlowLogsResult] = js.native
    def createImage(params: CreateImageRequest, callback: Callback[CreateImageResult]): Unit = js.native
    def createImage(params: CreateImageRequest): Request[CreateImageResult] = js.native
    def createInstanceExportTask(params: CreateInstanceExportTaskRequest, callback: Callback[CreateInstanceExportTaskResult]): Unit = js.native
    def createInstanceExportTask(params: CreateInstanceExportTaskRequest): Request[CreateInstanceExportTaskResult] = js.native
    def createInternetGateway(params: CreateInternetGatewayRequest, callback: Callback[CreateInternetGatewayResult]): Unit = js.native
    def createInternetGateway(params: CreateInternetGatewayRequest): Request[CreateInternetGatewayResult] = js.native
    def createKeyPair(params: CreateKeyPairRequest, callback: Callback[KeyPair]): Unit = js.native
    def createKeyPair(params: CreateKeyPairRequest): Request[KeyPair] = js.native
    def createNatGateway(params: CreateNatGatewayRequest, callback: Callback[CreateNatGatewayResult]): Unit = js.native
    def createNatGateway(params: CreateNatGatewayRequest): Request[CreateNatGatewayResult] = js.native
    def createNetworkAcl(params: CreateNetworkAclRequest, callback: Callback[CreateNetworkAclResult]): Unit = js.native
    def createNetworkAcl(params: CreateNetworkAclRequest): Request[CreateNetworkAclResult] = js.native
    def createNetworkAclEntry(params: CreateNetworkAclEntryRequest, callback: Callback[js.Object]): Unit = js.native
    def createNetworkAclEntry(params: CreateNetworkAclEntryRequest): Request[js.Object] = js.native
    def createNetworkInterface(params: CreateNetworkInterfaceRequest, callback: Callback[CreateNetworkInterfaceResult]): Unit = js.native
    def createNetworkInterface(params: CreateNetworkInterfaceRequest): Request[CreateNetworkInterfaceResult] = js.native
    def createPlacementGroup(params: CreatePlacementGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def createPlacementGroup(params: CreatePlacementGroupRequest): Request[js.Object] = js.native
    def createReservedInstancesListing(params: CreateReservedInstancesListingRequest, callback: Callback[CreateReservedInstancesListingResult]): Unit = js.native
    def createReservedInstancesListing(params: CreateReservedInstancesListingRequest): Request[CreateReservedInstancesListingResult] = js.native
    def createRoute(params: CreateRouteRequest, callback: Callback[CreateRouteResult]): Unit = js.native
    def createRoute(params: CreateRouteRequest): Request[CreateRouteResult] = js.native
    def createRouteTable(params: CreateRouteTableRequest, callback: Callback[CreateRouteTableResult]): Unit = js.native
    def createRouteTable(params: CreateRouteTableRequest): Request[CreateRouteTableResult] = js.native
    def createSecurityGroup(params: CreateSecurityGroupRequest, callback: Callback[CreateSecurityGroupResult]): Unit = js.native
    def createSecurityGroup(params: CreateSecurityGroupRequest): Request[CreateSecurityGroupResult] = js.native
    def createSnapshot(params: CreateSnapshotRequest, callback: Callback[Snapshot]): Unit = js.native
    def createSnapshot(params: CreateSnapshotRequest): Request[Snapshot] = js.native
    def createSpotDatafeedSubscription(params: CreateSpotDatafeedSubscriptionRequest, callback: Callback[CreateSpotDatafeedSubscriptionResult]): Unit = js.native
    def createSpotDatafeedSubscription(params: CreateSpotDatafeedSubscriptionRequest): Request[CreateSpotDatafeedSubscriptionResult] = js.native
    def createSubnet(params: CreateSubnetRequest, callback: Callback[CreateSubnetResult]): Unit = js.native
    def createSubnet(params: CreateSubnetRequest): Request[CreateSubnetResult] = js.native
    def createTags(params: CreateTagsRequest, callback: Callback[js.Object]): Unit = js.native
    def createTags(params: CreateTagsRequest): Request[js.Object] = js.native
    def createVolume(params: CreateVolumeRequest, callback: Callback[Volume]): Unit = js.native
    def createVolume(params: CreateVolumeRequest): Request[Volume] = js.native
    def createVpc(params: CreateVpcRequest, callback: Callback[CreateVpcResult]): Unit = js.native
    def createVpc(params: CreateVpcRequest): Request[CreateVpcResult] = js.native
    def createVpcEndpoint(params: CreateVpcEndpointRequest, callback: Callback[CreateVpcEndpointResult]): Unit = js.native
    def createVpcEndpoint(params: CreateVpcEndpointRequest): Request[CreateVpcEndpointResult] = js.native
    def createVpcPeeringConnection(params: CreateVpcPeeringConnectionRequest, callback: Callback[CreateVpcPeeringConnectionResult]): Unit = js.native
    def createVpcPeeringConnection(params: CreateVpcPeeringConnectionRequest): Request[CreateVpcPeeringConnectionResult] = js.native
    def createVpnConnection(params: CreateVpnConnectionRequest, callback: Callback[CreateVpnConnectionResult]): Unit = js.native
    def createVpnConnection(params: CreateVpnConnectionRequest): Request[CreateVpnConnectionResult] = js.native
    def createVpnConnectionRoute(params: CreateVpnConnectionRouteRequest, callback: Callback[js.Object]): Unit = js.native
    def createVpnConnectionRoute(params: CreateVpnConnectionRouteRequest): Request[js.Object] = js.native
    def createVpnGateway(params: CreateVpnGatewayRequest, callback: Callback[CreateVpnGatewayResult]): Unit = js.native
    def createVpnGateway(params: CreateVpnGatewayRequest): Request[CreateVpnGatewayResult] = js.native
    def deleteCustomerGateway(params: DeleteCustomerGatewayRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteCustomerGateway(params: DeleteCustomerGatewayRequest): Request[js.Object] = js.native
    def deleteDhcpOptions(params: DeleteDhcpOptionsRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteDhcpOptions(params: DeleteDhcpOptionsRequest): Request[js.Object] = js.native
    def deleteEgressOnlyInternetGateway(params: DeleteEgressOnlyInternetGatewayRequest, callback: Callback[DeleteEgressOnlyInternetGatewayResult]): Unit = js.native
    def deleteEgressOnlyInternetGateway(params: DeleteEgressOnlyInternetGatewayRequest): Request[DeleteEgressOnlyInternetGatewayResult] = js.native
    def deleteFlowLogs(params: DeleteFlowLogsRequest, callback: Callback[DeleteFlowLogsResult]): Unit = js.native
    def deleteFlowLogs(params: DeleteFlowLogsRequest): Request[DeleteFlowLogsResult] = js.native
    def deleteInternetGateway(params: DeleteInternetGatewayRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteInternetGateway(params: DeleteInternetGatewayRequest): Request[js.Object] = js.native
    def deleteKeyPair(params: DeleteKeyPairRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteKeyPair(params: DeleteKeyPairRequest): Request[js.Object] = js.native
    def deleteNatGateway(params: DeleteNatGatewayRequest, callback: Callback[DeleteNatGatewayResult]): Unit = js.native
    def deleteNatGateway(params: DeleteNatGatewayRequest): Request[DeleteNatGatewayResult] = js.native
    def deleteNetworkAcl(params: DeleteNetworkAclRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteNetworkAcl(params: DeleteNetworkAclRequest): Request[js.Object] = js.native
    def deleteNetworkAclEntry(params: DeleteNetworkAclEntryRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteNetworkAclEntry(params: DeleteNetworkAclEntryRequest): Request[js.Object] = js.native
    def deleteNetworkInterface(params: DeleteNetworkInterfaceRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteNetworkInterface(params: DeleteNetworkInterfaceRequest): Request[js.Object] = js.native
    def deletePlacementGroup(params: DeletePlacementGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def deletePlacementGroup(params: DeletePlacementGroupRequest): Request[js.Object] = js.native
    def deleteRoute(params: DeleteRouteRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteRoute(params: DeleteRouteRequest): Request[js.Object] = js.native
    def deleteRouteTable(params: DeleteRouteTableRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteRouteTable(params: DeleteRouteTableRequest): Request[js.Object] = js.native
    def deleteSecurityGroup(params: DeleteSecurityGroupRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteSecurityGroup(params: DeleteSecurityGroupRequest): Request[js.Object] = js.native
    def deleteSnapshot(params: DeleteSnapshotRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteSnapshot(params: DeleteSnapshotRequest): Request[js.Object] = js.native
    def deleteSpotDatafeedSubscription(params: DeleteSpotDatafeedSubscriptionRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteSpotDatafeedSubscription(params: DeleteSpotDatafeedSubscriptionRequest): Request[js.Object] = js.native
    def deleteSubnet(params: DeleteSubnetRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteSubnet(params: DeleteSubnetRequest): Request[js.Object] = js.native
    def deleteTags(params: DeleteTagsRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object] = js.native
    def deleteVolume(params: DeleteVolumeRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteVolume(params: DeleteVolumeRequest): Request[js.Object] = js.native
    def deleteVpc(params: DeleteVpcRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteVpc(params: DeleteVpcRequest): Request[js.Object] = js.native
    def deleteVpcEndpoints(params: DeleteVpcEndpointsRequest, callback: Callback[DeleteVpcEndpointsResult]): Unit = js.native
    def deleteVpcEndpoints(params: DeleteVpcEndpointsRequest): Request[DeleteVpcEndpointsResult] = js.native
    def deleteVpcPeeringConnection(params: DeleteVpcPeeringConnectionRequest, callback: Callback[DeleteVpcPeeringConnectionResult]): Unit = js.native
    def deleteVpcPeeringConnection(params: DeleteVpcPeeringConnectionRequest): Request[DeleteVpcPeeringConnectionResult] = js.native
    def deleteVpnConnection(params: DeleteVpnConnectionRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteVpnConnection(params: DeleteVpnConnectionRequest): Request[js.Object] = js.native
    def deleteVpnConnectionRoute(params: DeleteVpnConnectionRouteRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteVpnConnectionRoute(params: DeleteVpnConnectionRouteRequest): Request[js.Object] = js.native
    def deleteVpnGateway(params: DeleteVpnGatewayRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteVpnGateway(params: DeleteVpnGatewayRequest): Request[js.Object] = js.native
    def deregisterImage(params: DeregisterImageRequest, callback: Callback[js.Object]): Unit = js.native
    def deregisterImage(params: DeregisterImageRequest): Request[js.Object] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesRequest, callback: Callback[DescribeAccountAttributesResult]): Unit = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesRequest): Request[DescribeAccountAttributesResult] = js.native
    def describeAddresses(params: DescribeAddressesRequest, callback: Callback[DescribeAddressesResult]): Unit = js.native
    def describeAddresses(params: DescribeAddressesRequest): Request[DescribeAddressesResult] = js.native
    def describeAvailabilityZones(params: DescribeAvailabilityZonesRequest, callback: Callback[DescribeAvailabilityZonesResult]): Unit = js.native
    def describeAvailabilityZones(params: DescribeAvailabilityZonesRequest): Request[DescribeAvailabilityZonesResult] = js.native
    def describeBundleTasks(params: DescribeBundleTasksRequest, callback: Callback[DescribeBundleTasksResult]): Unit = js.native
    def describeBundleTasks(params: DescribeBundleTasksRequest): Request[DescribeBundleTasksResult] = js.native
    def describeClassicLinkInstances(params: DescribeClassicLinkInstancesRequest, callback: Callback[DescribeClassicLinkInstancesResult]): Unit = js.native
    def describeClassicLinkInstances(params: DescribeClassicLinkInstancesRequest): Request[DescribeClassicLinkInstancesResult] = js.native
    def describeConversionTasks(params: DescribeConversionTasksRequest, callback: Callback[DescribeConversionTasksResult]): Unit = js.native
    def describeConversionTasks(params: DescribeConversionTasksRequest): Request[DescribeConversionTasksResult] = js.native
    def describeCustomerGateways(params: DescribeCustomerGatewaysRequest, callback: Callback[DescribeCustomerGatewaysResult]): Unit = js.native
    def describeCustomerGateways(params: DescribeCustomerGatewaysRequest): Request[DescribeCustomerGatewaysResult] = js.native
    def describeDhcpOptions(params: DescribeDhcpOptionsRequest, callback: Callback[DescribeDhcpOptionsResult]): Unit = js.native
    def describeDhcpOptions(params: DescribeDhcpOptionsRequest): Request[DescribeDhcpOptionsResult] = js.native
    def describeEgressOnlyInternetGateways(params: DescribeEgressOnlyInternetGatewaysRequest, callback: Callback[DescribeEgressOnlyInternetGatewaysResult]): Unit = js.native
    def describeEgressOnlyInternetGateways(params: DescribeEgressOnlyInternetGatewaysRequest): Request[DescribeEgressOnlyInternetGatewaysResult] = js.native
    def describeExportTasks(params: DescribeExportTasksRequest, callback: Callback[DescribeExportTasksResult]): Unit = js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResult] = js.native
    def describeFlowLogs(params: DescribeFlowLogsRequest, callback: Callback[DescribeFlowLogsResult]): Unit = js.native
    def describeFlowLogs(params: DescribeFlowLogsRequest): Request[DescribeFlowLogsResult] = js.native
    def describeHostReservationOfferings(params: DescribeHostReservationOfferingsRequest, callback: Callback[DescribeHostReservationOfferingsResult]): Unit = js.native
    def describeHostReservationOfferings(params: DescribeHostReservationOfferingsRequest): Request[DescribeHostReservationOfferingsResult] = js.native
    def describeHostReservations(params: DescribeHostReservationsRequest, callback: Callback[DescribeHostReservationsResult]): Unit = js.native
    def describeHostReservations(params: DescribeHostReservationsRequest): Request[DescribeHostReservationsResult] = js.native
    def describeHosts(params: DescribeHostsRequest, callback: Callback[DescribeHostsResult]): Unit = js.native
    def describeHosts(params: DescribeHostsRequest): Request[DescribeHostsResult] = js.native
    def describeIdFormat(params: DescribeIdFormatRequest, callback: Callback[DescribeIdFormatResult]): Unit = js.native
    def describeIdFormat(params: DescribeIdFormatRequest): Request[DescribeIdFormatResult] = js.native
    def describeIdentityIdFormat(params: DescribeIdentityIdFormatRequest, callback: Callback[DescribeIdentityIdFormatResult]): Unit = js.native
    def describeIdentityIdFormat(params: DescribeIdentityIdFormatRequest): Request[DescribeIdentityIdFormatResult] = js.native
    def describeImageAttribute(params: DescribeImageAttributeRequest, callback: Callback[ImageAttribute]): Unit = js.native
    def describeImageAttribute(params: DescribeImageAttributeRequest): Request[ImageAttribute] = js.native
    def describeImages(params: DescribeImagesRequest, callback: Callback[DescribeImagesResult]): Unit = js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResult] = js.native
    def describeImportImageTasks(params: DescribeImportImageTasksRequest, callback: Callback[DescribeImportImageTasksResult]): Unit = js.native
    def describeImportImageTasks(params: DescribeImportImageTasksRequest): Request[DescribeImportImageTasksResult] = js.native
    def describeImportSnapshotTasks(params: DescribeImportSnapshotTasksRequest, callback: Callback[DescribeImportSnapshotTasksResult]): Unit = js.native
    def describeImportSnapshotTasks(params: DescribeImportSnapshotTasksRequest): Request[DescribeImportSnapshotTasksResult] = js.native
    def describeInstanceAttribute(params: DescribeInstanceAttributeRequest, callback: Callback[InstanceAttribute]): Unit = js.native
    def describeInstanceAttribute(params: DescribeInstanceAttributeRequest): Request[InstanceAttribute] = js.native
    def describeInstanceStatus(params: DescribeInstanceStatusRequest, callback: Callback[DescribeInstanceStatusResult]): Unit = js.native
    def describeInstanceStatus(params: DescribeInstanceStatusRequest): Request[DescribeInstanceStatusResult] = js.native
    def describeInstances(params: DescribeInstancesRequest, callback: Callback[DescribeInstancesResult]): Unit = js.native
    def describeInstances(params: DescribeInstancesRequest): Request[DescribeInstancesResult] = js.native
    def describeInternetGateways(params: DescribeInternetGatewaysRequest, callback: Callback[DescribeInternetGatewaysResult]): Unit = js.native
    def describeInternetGateways(params: DescribeInternetGatewaysRequest): Request[DescribeInternetGatewaysResult] = js.native
    def describeKeyPairs(params: DescribeKeyPairsRequest, callback: Callback[DescribeKeyPairsResult]): Unit = js.native
    def describeKeyPairs(params: DescribeKeyPairsRequest): Request[DescribeKeyPairsResult] = js.native
    def describeMovingAddresses(params: DescribeMovingAddressesRequest, callback: Callback[DescribeMovingAddressesResult]): Unit = js.native
    def describeMovingAddresses(params: DescribeMovingAddressesRequest): Request[DescribeMovingAddressesResult] = js.native
    def describeNatGateways(params: DescribeNatGatewaysRequest, callback: Callback[DescribeNatGatewaysResult]): Unit = js.native
    def describeNatGateways(params: DescribeNatGatewaysRequest): Request[DescribeNatGatewaysResult] = js.native
    def describeNetworkAcls(params: DescribeNetworkAclsRequest, callback: Callback[DescribeNetworkAclsResult]): Unit = js.native
    def describeNetworkAcls(params: DescribeNetworkAclsRequest): Request[DescribeNetworkAclsResult] = js.native
    def describeNetworkInterfaceAttribute(params: DescribeNetworkInterfaceAttributeRequest, callback: Callback[DescribeNetworkInterfaceAttributeResult]): Unit = js.native
    def describeNetworkInterfaceAttribute(params: DescribeNetworkInterfaceAttributeRequest): Request[DescribeNetworkInterfaceAttributeResult] = js.native
    def describeNetworkInterfaces(params: DescribeNetworkInterfacesRequest, callback: Callback[DescribeNetworkInterfacesResult]): Unit = js.native
    def describeNetworkInterfaces(params: DescribeNetworkInterfacesRequest): Request[DescribeNetworkInterfacesResult] = js.native
    def describePlacementGroups(params: DescribePlacementGroupsRequest, callback: Callback[DescribePlacementGroupsResult]): Unit = js.native
    def describePlacementGroups(params: DescribePlacementGroupsRequest): Request[DescribePlacementGroupsResult] = js.native
    def describePrefixLists(params: DescribePrefixListsRequest, callback: Callback[DescribePrefixListsResult]): Unit = js.native
    def describePrefixLists(params: DescribePrefixListsRequest): Request[DescribePrefixListsResult] = js.native
    def describeRegions(params: DescribeRegionsRequest, callback: Callback[DescribeRegionsResult]): Unit = js.native
    def describeRegions(params: DescribeRegionsRequest): Request[DescribeRegionsResult] = js.native
    def describeReservedInstances(params: DescribeReservedInstancesRequest, callback: Callback[DescribeReservedInstancesResult]): Unit = js.native
    def describeReservedInstances(params: DescribeReservedInstancesRequest): Request[DescribeReservedInstancesResult] = js.native
    def describeReservedInstancesListings(params: DescribeReservedInstancesListingsRequest, callback: Callback[DescribeReservedInstancesListingsResult]): Unit = js.native
    def describeReservedInstancesListings(params: DescribeReservedInstancesListingsRequest): Request[DescribeReservedInstancesListingsResult] = js.native
    def describeReservedInstancesModifications(params: DescribeReservedInstancesModificationsRequest, callback: Callback[DescribeReservedInstancesModificationsResult]): Unit = js.native
    def describeReservedInstancesModifications(params: DescribeReservedInstancesModificationsRequest): Request[DescribeReservedInstancesModificationsResult] = js.native
    def describeReservedInstancesOfferings(params: DescribeReservedInstancesOfferingsRequest, callback: Callback[DescribeReservedInstancesOfferingsResult]): Unit = js.native
    def describeReservedInstancesOfferings(params: DescribeReservedInstancesOfferingsRequest): Request[DescribeReservedInstancesOfferingsResult] = js.native
    def describeRouteTables(params: DescribeRouteTablesRequest, callback: Callback[DescribeRouteTablesResult]): Unit = js.native
    def describeRouteTables(params: DescribeRouteTablesRequest): Request[DescribeRouteTablesResult] = js.native
    def describeScheduledInstanceAvailability(params: DescribeScheduledInstanceAvailabilityRequest, callback: Callback[DescribeScheduledInstanceAvailabilityResult]): Unit = js.native
    def describeScheduledInstanceAvailability(params: DescribeScheduledInstanceAvailabilityRequest): Request[DescribeScheduledInstanceAvailabilityResult] = js.native
    def describeScheduledInstances(params: DescribeScheduledInstancesRequest, callback: Callback[DescribeScheduledInstancesResult]): Unit = js.native
    def describeScheduledInstances(params: DescribeScheduledInstancesRequest): Request[DescribeScheduledInstancesResult] = js.native
    def describeSecurityGroupReferences(params: DescribeSecurityGroupReferencesRequest, callback: Callback[DescribeSecurityGroupReferencesResult]): Unit = js.native
    def describeSecurityGroupReferences(params: DescribeSecurityGroupReferencesRequest): Request[DescribeSecurityGroupReferencesResult] = js.native
    def describeSecurityGroups(params: DescribeSecurityGroupsRequest, callback: Callback[DescribeSecurityGroupsResult]): Unit = js.native
    def describeSecurityGroups(params: DescribeSecurityGroupsRequest): Request[DescribeSecurityGroupsResult] = js.native
    def describeSnapshotAttribute(params: DescribeSnapshotAttributeRequest, callback: Callback[DescribeSnapshotAttributeResult]): Unit = js.native
    def describeSnapshotAttribute(params: DescribeSnapshotAttributeRequest): Request[DescribeSnapshotAttributeResult] = js.native
    def describeSnapshots(params: DescribeSnapshotsRequest, callback: Callback[DescribeSnapshotsResult]): Unit = js.native
    def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResult] = js.native
    def describeSpotDatafeedSubscription(params: DescribeSpotDatafeedSubscriptionRequest, callback: Callback[DescribeSpotDatafeedSubscriptionResult]): Unit = js.native
    def describeSpotDatafeedSubscription(params: DescribeSpotDatafeedSubscriptionRequest): Request[DescribeSpotDatafeedSubscriptionResult] = js.native
    def describeSpotFleetInstances(params: DescribeSpotFleetInstancesRequest, callback: Callback[DescribeSpotFleetInstancesResponse]): Unit = js.native
    def describeSpotFleetInstances(params: DescribeSpotFleetInstancesRequest): Request[DescribeSpotFleetInstancesResponse] = js.native
    def describeSpotFleetRequestHistory(params: DescribeSpotFleetRequestHistoryRequest, callback: Callback[DescribeSpotFleetRequestHistoryResponse]): Unit = js.native
    def describeSpotFleetRequestHistory(params: DescribeSpotFleetRequestHistoryRequest): Request[DescribeSpotFleetRequestHistoryResponse] = js.native
    def describeSpotFleetRequests(params: DescribeSpotFleetRequestsRequest, callback: Callback[DescribeSpotFleetRequestsResponse]): Unit = js.native
    def describeSpotFleetRequests(params: DescribeSpotFleetRequestsRequest): Request[DescribeSpotFleetRequestsResponse] = js.native
    def describeSpotInstanceRequests(params: DescribeSpotInstanceRequestsRequest, callback: Callback[DescribeSpotInstanceRequestsResult]): Unit = js.native
    def describeSpotInstanceRequests(params: DescribeSpotInstanceRequestsRequest): Request[DescribeSpotInstanceRequestsResult] = js.native
    def describeSpotPriceHistory(params: DescribeSpotPriceHistoryRequest, callback: Callback[DescribeSpotPriceHistoryResult]): Unit = js.native
    def describeSpotPriceHistory(params: DescribeSpotPriceHistoryRequest): Request[DescribeSpotPriceHistoryResult] = js.native
    def describeStaleSecurityGroups(params: DescribeStaleSecurityGroupsRequest, callback: Callback[DescribeStaleSecurityGroupsResult]): Unit = js.native
    def describeStaleSecurityGroups(params: DescribeStaleSecurityGroupsRequest): Request[DescribeStaleSecurityGroupsResult] = js.native
    def describeSubnets(params: DescribeSubnetsRequest, callback: Callback[DescribeSubnetsResult]): Unit = js.native
    def describeSubnets(params: DescribeSubnetsRequest): Request[DescribeSubnetsResult] = js.native
    def describeTags(params: DescribeTagsRequest, callback: Callback[DescribeTagsResult]): Unit = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult] = js.native
    def describeVolumeAttribute(params: DescribeVolumeAttributeRequest, callback: Callback[DescribeVolumeAttributeResult]): Unit = js.native
    def describeVolumeAttribute(params: DescribeVolumeAttributeRequest): Request[DescribeVolumeAttributeResult] = js.native
    def describeVolumeStatus(params: DescribeVolumeStatusRequest, callback: Callback[DescribeVolumeStatusResult]): Unit = js.native
    def describeVolumeStatus(params: DescribeVolumeStatusRequest): Request[DescribeVolumeStatusResult] = js.native
    def describeVolumes(params: DescribeVolumesRequest, callback: Callback[DescribeVolumesResult]): Unit = js.native
    def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResult] = js.native
    def describeVpcAttribute(params: DescribeVpcAttributeRequest, callback: Callback[DescribeVpcAttributeResult]): Unit = js.native
    def describeVpcAttribute(params: DescribeVpcAttributeRequest): Request[DescribeVpcAttributeResult] = js.native
    def describeVpcClassicLink(params: DescribeVpcClassicLinkRequest, callback: Callback[DescribeVpcClassicLinkResult]): Unit = js.native
    def describeVpcClassicLink(params: DescribeVpcClassicLinkRequest): Request[DescribeVpcClassicLinkResult] = js.native
    def describeVpcClassicLinkDnsSupport(params: DescribeVpcClassicLinkDnsSupportRequest, callback: Callback[DescribeVpcClassicLinkDnsSupportResult]): Unit = js.native
    def describeVpcClassicLinkDnsSupport(params: DescribeVpcClassicLinkDnsSupportRequest): Request[DescribeVpcClassicLinkDnsSupportResult] = js.native
    def describeVpcEndpointServices(params: DescribeVpcEndpointServicesRequest, callback: Callback[DescribeVpcEndpointServicesResult]): Unit = js.native
    def describeVpcEndpointServices(params: DescribeVpcEndpointServicesRequest): Request[DescribeVpcEndpointServicesResult] = js.native
    def describeVpcEndpoints(params: DescribeVpcEndpointsRequest, callback: Callback[DescribeVpcEndpointsResult]): Unit = js.native
    def describeVpcEndpoints(params: DescribeVpcEndpointsRequest): Request[DescribeVpcEndpointsResult] = js.native
    def describeVpcPeeringConnections(params: DescribeVpcPeeringConnectionsRequest, callback: Callback[DescribeVpcPeeringConnectionsResult]): Unit = js.native
    def describeVpcPeeringConnections(params: DescribeVpcPeeringConnectionsRequest): Request[DescribeVpcPeeringConnectionsResult] = js.native
    def describeVpcs(params: DescribeVpcsRequest, callback: Callback[DescribeVpcsResult]): Unit = js.native
    def describeVpcs(params: DescribeVpcsRequest): Request[DescribeVpcsResult] = js.native
    def describeVpnConnections(params: DescribeVpnConnectionsRequest, callback: Callback[DescribeVpnConnectionsResult]): Unit = js.native
    def describeVpnConnections(params: DescribeVpnConnectionsRequest): Request[DescribeVpnConnectionsResult] = js.native
    def describeVpnGateways(params: DescribeVpnGatewaysRequest, callback: Callback[DescribeVpnGatewaysResult]): Unit = js.native
    def describeVpnGateways(params: DescribeVpnGatewaysRequest): Request[DescribeVpnGatewaysResult] = js.native
    def detachClassicLinkVpc(params: DetachClassicLinkVpcRequest, callback: Callback[DetachClassicLinkVpcResult]): Unit = js.native
    def detachClassicLinkVpc(params: DetachClassicLinkVpcRequest): Request[DetachClassicLinkVpcResult] = js.native
    def detachInternetGateway(params: DetachInternetGatewayRequest, callback: Callback[js.Object]): Unit = js.native
    def detachInternetGateway(params: DetachInternetGatewayRequest): Request[js.Object] = js.native
    def detachNetworkInterface(params: DetachNetworkInterfaceRequest, callback: Callback[js.Object]): Unit = js.native
    def detachNetworkInterface(params: DetachNetworkInterfaceRequest): Request[js.Object] = js.native
    def detachVolume(params: DetachVolumeRequest, callback: Callback[VolumeAttachment]): Unit = js.native
    def detachVolume(params: DetachVolumeRequest): Request[VolumeAttachment] = js.native
    def detachVpnGateway(params: DetachVpnGatewayRequest, callback: Callback[js.Object]): Unit = js.native
    def detachVpnGateway(params: DetachVpnGatewayRequest): Request[js.Object] = js.native
    def disableVgwRoutePropagation(params: DisableVgwRoutePropagationRequest, callback: Callback[js.Object]): Unit = js.native
    def disableVgwRoutePropagation(params: DisableVgwRoutePropagationRequest): Request[js.Object] = js.native
    def disableVpcClassicLink(params: DisableVpcClassicLinkRequest, callback: Callback[DisableVpcClassicLinkResult]): Unit = js.native
    def disableVpcClassicLink(params: DisableVpcClassicLinkRequest): Request[DisableVpcClassicLinkResult] = js.native
    def disableVpcClassicLinkDnsSupport(params: DisableVpcClassicLinkDnsSupportRequest, callback: Callback[DisableVpcClassicLinkDnsSupportResult]): Unit = js.native
    def disableVpcClassicLinkDnsSupport(params: DisableVpcClassicLinkDnsSupportRequest): Request[DisableVpcClassicLinkDnsSupportResult] = js.native
    def disassociateAddress(params: DisassociateAddressRequest, callback: Callback[js.Object]): Unit = js.native
    def disassociateAddress(params: DisassociateAddressRequest): Request[js.Object] = js.native
    def disassociateRouteTable(params: DisassociateRouteTableRequest, callback: Callback[js.Object]): Unit = js.native
    def disassociateRouteTable(params: DisassociateRouteTableRequest): Request[js.Object] = js.native
    def disassociateSubnetCidrBlock(params: DisassociateSubnetCidrBlockRequest, callback: Callback[DisassociateSubnetCidrBlockResult]): Unit = js.native
    def disassociateSubnetCidrBlock(params: DisassociateSubnetCidrBlockRequest): Request[DisassociateSubnetCidrBlockResult] = js.native
    def disassociateVpcCidrBlock(params: DisassociateVpcCidrBlockRequest, callback: Callback[DisassociateVpcCidrBlockResult]): Unit = js.native
    def disassociateVpcCidrBlock(params: DisassociateVpcCidrBlockRequest): Request[DisassociateVpcCidrBlockResult] = js.native
    def enableVgwRoutePropagation(params: EnableVgwRoutePropagationRequest, callback: Callback[js.Object]): Unit = js.native
    def enableVgwRoutePropagation(params: EnableVgwRoutePropagationRequest): Request[js.Object] = js.native
    def enableVolumeIO(params: EnableVolumeIORequest, callback: Callback[js.Object]): Unit = js.native
    def enableVolumeIO(params: EnableVolumeIORequest): Request[js.Object] = js.native
    def enableVpcClassicLink(params: EnableVpcClassicLinkRequest, callback: Callback[EnableVpcClassicLinkResult]): Unit = js.native
    def enableVpcClassicLink(params: EnableVpcClassicLinkRequest): Request[EnableVpcClassicLinkResult] = js.native
    def enableVpcClassicLinkDnsSupport(params: EnableVpcClassicLinkDnsSupportRequest, callback: Callback[EnableVpcClassicLinkDnsSupportResult]): Unit = js.native
    def enableVpcClassicLinkDnsSupport(params: EnableVpcClassicLinkDnsSupportRequest): Request[EnableVpcClassicLinkDnsSupportResult] = js.native
    def getConsoleOutput(params: GetConsoleOutputRequest, callback: Callback[GetConsoleOutputResult]): Unit = js.native
    def getConsoleOutput(params: GetConsoleOutputRequest): Request[GetConsoleOutputResult] = js.native
    def getConsoleScreenshot(params: GetConsoleScreenshotRequest, callback: Callback[GetConsoleScreenshotResult]): Unit = js.native
    def getConsoleScreenshot(params: GetConsoleScreenshotRequest): Request[GetConsoleScreenshotResult] = js.native
    def getHostReservationPurchasePreview(params: GetHostReservationPurchasePreviewRequest, callback: Callback[GetHostReservationPurchasePreviewResult]): Unit = js.native
    def getHostReservationPurchasePreview(params: GetHostReservationPurchasePreviewRequest): Request[GetHostReservationPurchasePreviewResult] = js.native
    def getPasswordData(params: GetPasswordDataRequest, callback: Callback[GetPasswordDataResult]): Unit = js.native
    def getPasswordData(params: GetPasswordDataRequest): Request[GetPasswordDataResult] = js.native
    def getReservedInstancesExchangeQuote(params: GetReservedInstancesExchangeQuoteRequest, callback: Callback[GetReservedInstancesExchangeQuoteResult]): Unit = js.native
    def getReservedInstancesExchangeQuote(params: GetReservedInstancesExchangeQuoteRequest): Request[GetReservedInstancesExchangeQuoteResult] = js.native
    def importImage(params: ImportImageRequest, callback: Callback[ImportImageResult]): Unit = js.native
    def importImage(params: ImportImageRequest): Request[ImportImageResult] = js.native
    def importInstance(params: ImportInstanceRequest, callback: Callback[ImportInstanceResult]): Unit = js.native
    def importInstance(params: ImportInstanceRequest): Request[ImportInstanceResult] = js.native
    def importKeyPair(params: ImportKeyPairRequest, callback: Callback[ImportKeyPairResult]): Unit = js.native
    def importKeyPair(params: ImportKeyPairRequest): Request[ImportKeyPairResult] = js.native
    def importSnapshot(params: ImportSnapshotRequest, callback: Callback[ImportSnapshotResult]): Unit = js.native
    def importSnapshot(params: ImportSnapshotRequest): Request[ImportSnapshotResult] = js.native
    def importVolume(params: ImportVolumeRequest, callback: Callback[ImportVolumeResult]): Unit = js.native
    def importVolume(params: ImportVolumeRequest): Request[ImportVolumeResult] = js.native
    def modifyHosts(params: ModifyHostsRequest, callback: Callback[ModifyHostsResult]): Unit = js.native
    def modifyHosts(params: ModifyHostsRequest): Request[ModifyHostsResult] = js.native
    def modifyIdFormat(params: ModifyIdFormatRequest, callback: Callback[js.Object]): Unit = js.native
    def modifyIdFormat(params: ModifyIdFormatRequest): Request[js.Object] = js.native
    def modifyIdentityIdFormat(params: ModifyIdentityIdFormatRequest, callback: Callback[js.Object]): Unit = js.native
    def modifyIdentityIdFormat(params: ModifyIdentityIdFormatRequest): Request[js.Object] = js.native
    def modifyImageAttribute(params: ModifyImageAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def modifyImageAttribute(params: ModifyImageAttributeRequest): Request[js.Object] = js.native
    def modifyInstanceAttribute(params: ModifyInstanceAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def modifyInstanceAttribute(params: ModifyInstanceAttributeRequest): Request[js.Object] = js.native
    def modifyInstancePlacement(params: ModifyInstancePlacementRequest, callback: Callback[ModifyInstancePlacementResult]): Unit = js.native
    def modifyInstancePlacement(params: ModifyInstancePlacementRequest): Request[ModifyInstancePlacementResult] = js.native
    def modifyNetworkInterfaceAttribute(params: ModifyNetworkInterfaceAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def modifyNetworkInterfaceAttribute(params: ModifyNetworkInterfaceAttributeRequest): Request[js.Object] = js.native
    def modifyReservedInstances(params: ModifyReservedInstancesRequest, callback: Callback[ModifyReservedInstancesResult]): Unit = js.native
    def modifyReservedInstances(params: ModifyReservedInstancesRequest): Request[ModifyReservedInstancesResult] = js.native
    def modifySnapshotAttribute(params: ModifySnapshotAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def modifySnapshotAttribute(params: ModifySnapshotAttributeRequest): Request[js.Object] = js.native
    def modifySpotFleetRequest(params: ModifySpotFleetRequestRequest, callback: Callback[ModifySpotFleetRequestResponse]): Unit = js.native
    def modifySpotFleetRequest(params: ModifySpotFleetRequestRequest): Request[ModifySpotFleetRequestResponse] = js.native
    def modifySubnetAttribute(params: ModifySubnetAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def modifySubnetAttribute(params: ModifySubnetAttributeRequest): Request[js.Object] = js.native
    def modifyVolumeAttribute(params: ModifyVolumeAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def modifyVolumeAttribute(params: ModifyVolumeAttributeRequest): Request[js.Object] = js.native
    def modifyVpcAttribute(params: ModifyVpcAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def modifyVpcAttribute(params: ModifyVpcAttributeRequest): Request[js.Object] = js.native
    def modifyVpcEndpoint(params: ModifyVpcEndpointRequest, callback: Callback[ModifyVpcEndpointResult]): Unit = js.native
    def modifyVpcEndpoint(params: ModifyVpcEndpointRequest): Request[ModifyVpcEndpointResult] = js.native
    def modifyVpcPeeringConnectionOptions(params: ModifyVpcPeeringConnectionOptionsRequest, callback: Callback[ModifyVpcPeeringConnectionOptionsResult]): Unit = js.native
    def modifyVpcPeeringConnectionOptions(params: ModifyVpcPeeringConnectionOptionsRequest): Request[ModifyVpcPeeringConnectionOptionsResult] = js.native
    def monitorInstances(params: MonitorInstancesRequest, callback: Callback[MonitorInstancesResult]): Unit = js.native
    def monitorInstances(params: MonitorInstancesRequest): Request[MonitorInstancesResult] = js.native
    def moveAddressToVpc(params: MoveAddressToVpcRequest, callback: Callback[MoveAddressToVpcResult]): Unit = js.native
    def moveAddressToVpc(params: MoveAddressToVpcRequest): Request[MoveAddressToVpcResult] = js.native
    def purchaseHostReservation(params: PurchaseHostReservationRequest, callback: Callback[PurchaseHostReservationResult]): Unit = js.native
    def purchaseHostReservation(params: PurchaseHostReservationRequest): Request[PurchaseHostReservationResult] = js.native
    def purchaseReservedInstancesOffering(params: PurchaseReservedInstancesOfferingRequest, callback: Callback[PurchaseReservedInstancesOfferingResult]): Unit = js.native
    def purchaseReservedInstancesOffering(params: PurchaseReservedInstancesOfferingRequest): Request[PurchaseReservedInstancesOfferingResult] = js.native
    def purchaseScheduledInstances(params: PurchaseScheduledInstancesRequest, callback: Callback[PurchaseScheduledInstancesResult]): Unit = js.native
    def purchaseScheduledInstances(params: PurchaseScheduledInstancesRequest): Request[PurchaseScheduledInstancesResult] = js.native
    def rebootInstances(params: RebootInstancesRequest, callback: Callback[js.Object]): Unit = js.native
    def rebootInstances(params: RebootInstancesRequest): Request[js.Object] = js.native
    def registerImage(params: RegisterImageRequest, callback: Callback[RegisterImageResult]): Unit = js.native
    def registerImage(params: RegisterImageRequest): Request[RegisterImageResult] = js.native
    def rejectVpcPeeringConnection(params: RejectVpcPeeringConnectionRequest, callback: Callback[RejectVpcPeeringConnectionResult]): Unit = js.native
    def rejectVpcPeeringConnection(params: RejectVpcPeeringConnectionRequest): Request[RejectVpcPeeringConnectionResult] = js.native
    def releaseAddress(params: ReleaseAddressRequest, callback: Callback[js.Object]): Unit = js.native
    def releaseAddress(params: ReleaseAddressRequest): Request[js.Object] = js.native
    def releaseHosts(params: ReleaseHostsRequest, callback: Callback[ReleaseHostsResult]): Unit = js.native
    def releaseHosts(params: ReleaseHostsRequest): Request[ReleaseHostsResult] = js.native
    def replaceNetworkAclAssociation(params: ReplaceNetworkAclAssociationRequest, callback: Callback[ReplaceNetworkAclAssociationResult]): Unit = js.native
    def replaceNetworkAclAssociation(params: ReplaceNetworkAclAssociationRequest): Request[ReplaceNetworkAclAssociationResult] = js.native
    def replaceNetworkAclEntry(params: ReplaceNetworkAclEntryRequest, callback: Callback[js.Object]): Unit = js.native
    def replaceNetworkAclEntry(params: ReplaceNetworkAclEntryRequest): Request[js.Object] = js.native
    def replaceRoute(params: ReplaceRouteRequest, callback: Callback[js.Object]): Unit = js.native
    def replaceRoute(params: ReplaceRouteRequest): Request[js.Object] = js.native
    def replaceRouteTableAssociation(params: ReplaceRouteTableAssociationRequest, callback: Callback[ReplaceRouteTableAssociationResult]): Unit = js.native
    def replaceRouteTableAssociation(params: ReplaceRouteTableAssociationRequest): Request[ReplaceRouteTableAssociationResult] = js.native
    def reportInstanceStatus(params: ReportInstanceStatusRequest, callback: Callback[js.Object]): Unit = js.native
    def reportInstanceStatus(params: ReportInstanceStatusRequest): Request[js.Object] = js.native
    def requestSpotFleet(params: RequestSpotFleetRequest, callback: Callback[RequestSpotFleetResponse]): Unit = js.native
    def requestSpotFleet(params: RequestSpotFleetRequest): Request[RequestSpotFleetResponse] = js.native
    def requestSpotInstances(params: RequestSpotInstancesRequest, callback: Callback[RequestSpotInstancesResult]): Unit = js.native
    def requestSpotInstances(params: RequestSpotInstancesRequest): Request[RequestSpotInstancesResult] = js.native
    def resetImageAttribute(params: ResetImageAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def resetImageAttribute(params: ResetImageAttributeRequest): Request[js.Object] = js.native
    def resetInstanceAttribute(params: ResetInstanceAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def resetInstanceAttribute(params: ResetInstanceAttributeRequest): Request[js.Object] = js.native
    def resetNetworkInterfaceAttribute(params: ResetNetworkInterfaceAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def resetNetworkInterfaceAttribute(params: ResetNetworkInterfaceAttributeRequest): Request[js.Object] = js.native
    def resetSnapshotAttribute(params: ResetSnapshotAttributeRequest, callback: Callback[js.Object]): Unit = js.native
    def resetSnapshotAttribute(params: ResetSnapshotAttributeRequest): Request[js.Object] = js.native
    def restoreAddressToClassic(params: RestoreAddressToClassicRequest, callback: Callback[RestoreAddressToClassicResult]): Unit = js.native
    def restoreAddressToClassic(params: RestoreAddressToClassicRequest): Request[RestoreAddressToClassicResult] = js.native
    def revokeSecurityGroupEgress(params: RevokeSecurityGroupEgressRequest, callback: Callback[js.Object]): Unit = js.native
    def revokeSecurityGroupEgress(params: RevokeSecurityGroupEgressRequest): Request[js.Object] = js.native
    def revokeSecurityGroupIngress(params: RevokeSecurityGroupIngressRequest, callback: Callback[js.Object]): Unit = js.native
    def revokeSecurityGroupIngress(params: RevokeSecurityGroupIngressRequest): Request[js.Object] = js.native
    def runInstances(params: RunInstancesRequest, callback: Callback[Reservation]): Unit = js.native
    def runInstances(params: RunInstancesRequest): Request[Reservation] = js.native
    def runScheduledInstances(params: RunScheduledInstancesRequest, callback: Callback[RunScheduledInstancesResult]): Unit = js.native
    def runScheduledInstances(params: RunScheduledInstancesRequest): Request[RunScheduledInstancesResult] = js.native
    def startInstances(params: StartInstancesRequest, callback: Callback[StartInstancesResult]): Unit = js.native
    def startInstances(params: StartInstancesRequest): Request[StartInstancesResult] = js.native
    def stopInstances(params: StopInstancesRequest, callback: Callback[StopInstancesResult]): Unit = js.native
    def stopInstances(params: StopInstancesRequest): Request[StopInstancesResult] = js.native
    def terminateInstances(params: TerminateInstancesRequest, callback: Callback[TerminateInstancesResult]): Unit = js.native
    def terminateInstances(params: TerminateInstancesRequest): Request[TerminateInstancesResult] = js.native
    def unassignIpv6Addresses(params: UnassignIpv6AddressesRequest, callback: Callback[UnassignIpv6AddressesResult]): Unit = js.native
    def unassignIpv6Addresses(params: UnassignIpv6AddressesRequest): Request[UnassignIpv6AddressesResult] = js.native
    def unassignPrivateIpAddresses(params: UnassignPrivateIpAddressesRequest, callback: Callback[js.Object]): Unit = js.native
    def unassignPrivateIpAddresses(params: UnassignPrivateIpAddressesRequest): Request[js.Object] = js.native
    def unmonitorInstances(params: UnmonitorInstancesRequest, callback: Callback[UnmonitorInstancesResult]): Unit = js.native
    def unmonitorInstances(params: UnmonitorInstancesRequest): Request[UnmonitorInstancesResult] = js.native
  }

  /**
   * <p>Contains the parameters for accepting the quote.</p>
   */
  @js.native
  trait AcceptReservedInstancesExchangeQuoteRequest extends js.Object {
    var DryRun: Boolean
    var ReservedInstanceIds: ReservedInstanceIdSet
    var TargetConfigurations: TargetConfigurationRequestSet
  }

  object AcceptReservedInstancesExchangeQuoteRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ReservedInstanceIds: js.UndefOr[ReservedInstanceIdSet] = js.undefined,
      TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet] = js.undefined
    ): AcceptReservedInstancesExchangeQuoteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ReservedInstanceIds" -> ReservedInstanceIds.map { x => x: js.Any }),
        ("TargetConfigurations" -> TargetConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptReservedInstancesExchangeQuoteRequest]
    }
  }

  /**
   * <p>The result of the exchange and whether it was <code>successful</code>.</p>
   */
  @js.native
  trait AcceptReservedInstancesExchangeQuoteResult extends js.Object {
    var ExchangeId: String
  }

  object AcceptReservedInstancesExchangeQuoteResult {
    def apply(
      ExchangeId: js.UndefOr[String] = js.undefined
    ): AcceptReservedInstancesExchangeQuoteResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExchangeId" -> ExchangeId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptReservedInstancesExchangeQuoteResult]
    }
  }

  /**
   * <p>Contains the parameters for AcceptVpcPeeringConnection.</p>
   */
  @js.native
  trait AcceptVpcPeeringConnectionRequest extends js.Object {
    var DryRun: Boolean
    var VpcPeeringConnectionId: String
  }

  object AcceptVpcPeeringConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
    ): AcceptVpcPeeringConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptVpcPeeringConnectionRequest]
    }
  }

  /**
   * <p>Contains the output of AcceptVpcPeeringConnection.</p>
   */
  @js.native
  trait AcceptVpcPeeringConnectionResult extends js.Object {
    var VpcPeeringConnection: VpcPeeringConnection
  }

  object AcceptVpcPeeringConnectionResult {
    def apply(
      VpcPeeringConnection: js.UndefOr[VpcPeeringConnection] = js.undefined
    ): AcceptVpcPeeringConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcPeeringConnection" -> VpcPeeringConnection.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptVpcPeeringConnectionResult]
    }
  }

  /**
   * <p>Describes an account attribute.</p>
   */
  @js.native
  trait AccountAttribute extends js.Object {
    var AttributeName: String
    var AttributeValues: AccountAttributeValueList
  }

  object AccountAttribute {
    def apply(
      AttributeName: js.UndefOr[String] = js.undefined,
      AttributeValues: js.UndefOr[AccountAttributeValueList] = js.undefined
    ): AccountAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributeName" -> AttributeName.map { x => x: js.Any }),
        ("AttributeValues" -> AttributeValues.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttribute]
    }
  }


  object AccountAttributeNameEnum {
    val `supported-platforms` = "supported-platforms"
    val `default-vpc` = "default-vpc"

    val values = IndexedSeq(`supported-platforms`, `default-vpc`)
  }

  /**
   * <p>Describes a value of an account attribute.</p>
   */
  @js.native
  trait AccountAttributeValue extends js.Object {
    var AttributeValue: String
  }

  object AccountAttributeValue {
    def apply(
      AttributeValue: js.UndefOr[String] = js.undefined
    ): AccountAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributeValue" -> AttributeValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttributeValue]
    }
  }

  /**
   * <p>Describes a running instance in a Spot fleet.</p>
   */
  @js.native
  trait ActiveInstance extends js.Object {
    var InstanceType: String
    var InstanceId: String
    var SpotInstanceRequestId: String
  }

  object ActiveInstance {
    def apply(
      InstanceType: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      SpotInstanceRequestId: js.UndefOr[String] = js.undefined
    ): ActiveInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("SpotInstanceRequestId" -> SpotInstanceRequestId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ActiveInstance]
    }
  }


  object ActivityStatusEnum {
    val error = "error"
    val `pending_fulfillment` = "pending_fulfillment"
    val `pending_termination` = "pending_termination"
    val fulfilled = "fulfilled"

    val values = IndexedSeq(error, `pending_fulfillment`, `pending_termination`, fulfilled)
  }

  /**
   * <p>Describes an Elastic IP address.</p>
   */
  @js.native
  trait Address extends js.Object {
    var PrivateIpAddress: String
    var PublicIp: String
    var AllocationId: String
    var NetworkInterfaceOwnerId: String
    var InstanceId: String
    var NetworkInterfaceId: String
    var Domain: DomainType
    var AssociationId: String
  }

  object Address {
    def apply(
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceOwnerId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[DomainType] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined
    ): Address = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("AllocationId" -> AllocationId.map { x => x: js.Any }),
        ("NetworkInterfaceOwnerId" -> NetworkInterfaceOwnerId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("Domain" -> Domain.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Address]
    }
  }


  object AffinityEnum {
    val default = "default"
    val host = "host"

    val values = IndexedSeq(default, host)
  }

  /**
   * <p>Contains the parameters for AllocateAddress.</p>
   */
  @js.native
  trait AllocateAddressRequest extends js.Object {
    var DryRun: Boolean
    var Domain: DomainType
  }

  object AllocateAddressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Domain: js.UndefOr[DomainType] = js.undefined
    ): AllocateAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Domain" -> Domain.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateAddressRequest]
    }
  }

  /**
   * <p>Contains the output of AllocateAddress.</p>
   */
  @js.native
  trait AllocateAddressResult extends js.Object {
    var PublicIp: String
    var Domain: DomainType
    var AllocationId: String
  }

  object AllocateAddressResult {
    def apply(
      PublicIp: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[DomainType] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined
    ): AllocateAddressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("Domain" -> Domain.map { x => x: js.Any }),
        ("AllocationId" -> AllocationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateAddressResult]
    }
  }

  /**
   * <p>Contains the parameters for AllocateHosts.</p>
   */
  @js.native
  trait AllocateHostsRequest extends js.Object {
    var Quantity: Integer
    var ClientToken: String
    var AvailabilityZone: String
    var InstanceType: String
    var AutoPlacement: AutoPlacement
  }

  object AllocateHostsRequest {
    def apply(
      Quantity: js.UndefOr[Integer] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined
    ): AllocateHostsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Quantity" -> Quantity.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("AutoPlacement" -> AutoPlacement.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateHostsRequest]
    }
  }

  /**
   * <p>Contains the output of AllocateHosts.</p>
   */
  @js.native
  trait AllocateHostsResult extends js.Object {
    var HostIds: ResponseHostIdList
  }

  object AllocateHostsResult {
    def apply(
      HostIds: js.UndefOr[ResponseHostIdList] = js.undefined
    ): AllocateHostsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostIds" -> HostIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AllocateHostsResult]
    }
  }


  object AllocationStateEnum {
    val available = "available"
    val `under-assessment` = "under-assessment"
    val `permanent-failure` = "permanent-failure"
    val released = "released"
    val `released-permanent-failure` = "released-permanent-failure"

    val values = IndexedSeq(available, `under-assessment`, `permanent-failure`, released, `released-permanent-failure`)
  }


  object AllocationStrategyEnum {
    val lowestPrice = "lowestPrice"
    val diversified = "diversified"

    val values = IndexedSeq(lowestPrice, diversified)
  }


  object ArchitectureValuesEnum {
    val i386 = "i386"
    val `x86_64` = "x86_64"

    val values = IndexedSeq(i386, `x86_64`)
  }

  @js.native
  trait AssignIpv6AddressesRequest extends js.Object {
    var NetworkInterfaceId: String
    var Ipv6Addresses: Ipv6AddressList
    var Ipv6AddressCount: Integer
  }

  object AssignIpv6AddressesRequest {
    def apply(
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      Ipv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Integer] = js.undefined
    ): AssignIpv6AddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("Ipv6Addresses" -> Ipv6Addresses.map { x => x: js.Any }),
        ("Ipv6AddressCount" -> Ipv6AddressCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignIpv6AddressesRequest]
    }
  }

  @js.native
  trait AssignIpv6AddressesResult extends js.Object {
    var NetworkInterfaceId: String
    var AssignedIpv6Addresses: Ipv6AddressList
  }

  object AssignIpv6AddressesResult {
    def apply(
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
    ): AssignIpv6AddressesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("AssignedIpv6Addresses" -> AssignedIpv6Addresses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignIpv6AddressesResult]
    }
  }

  /**
   * <p>Contains the parameters for AssignPrivateIpAddresses.</p>
   */
  @js.native
  trait AssignPrivateIpAddressesRequest extends js.Object {
    var NetworkInterfaceId: String
    var PrivateIpAddresses: PrivateIpAddressStringList
    var SecondaryPrivateIpAddressCount: Integer
    var AllowReassignment: Boolean
  }

  object AssignPrivateIpAddressesRequest {
    def apply(
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined,
      AllowReassignment: js.UndefOr[Boolean] = js.undefined
    ): AssignPrivateIpAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("PrivateIpAddresses" -> PrivateIpAddresses.map { x => x: js.Any }),
        ("SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x: js.Any }),
        ("AllowReassignment" -> AllowReassignment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssignPrivateIpAddressesRequest]
    }
  }

  /**
   * <p>Contains the parameters for AssociateAddress.</p>
   */
  @js.native
  trait AssociateAddressRequest extends js.Object {
    var DryRun: Boolean
    var PrivateIpAddress: String
    var PublicIp: String
    var AllocationId: String
    var InstanceId: String
    var AllowReassociation: Boolean
    var NetworkInterfaceId: String
  }

  object AssociateAddressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      AllowReassociation: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined
    ): AssociateAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("AllocationId" -> AllocationId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("AllowReassociation" -> AllowReassociation.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateAddressRequest]
    }
  }

  /**
   * <p>Contains the output of AssociateAddress.</p>
   */
  @js.native
  trait AssociateAddressResult extends js.Object {
    var AssociationId: String
  }

  object AssociateAddressResult {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined
    ): AssociateAddressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateAddressResult]
    }
  }

  /**
   * <p>Contains the parameters for AssociateDhcpOptions.</p>
   */
  @js.native
  trait AssociateDhcpOptionsRequest extends js.Object {
    var DryRun: Boolean
    var DhcpOptionsId: String
    var VpcId: String
  }

  object AssociateDhcpOptionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DhcpOptionsId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): AssociateDhcpOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("DhcpOptionsId" -> DhcpOptionsId.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateDhcpOptionsRequest]
    }
  }

  /**
   * <p>Contains the parameters for AssociateRouteTable.</p>
   */
  @js.native
  trait AssociateRouteTableRequest extends js.Object {
    var DryRun: Boolean
    var SubnetId: String
    var RouteTableId: String
  }

  object AssociateRouteTableRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined
    ): AssociateRouteTableRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any }),
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateRouteTableRequest]
    }
  }

  /**
   * <p>Contains the output of AssociateRouteTable.</p>
   */
  @js.native
  trait AssociateRouteTableResult extends js.Object {
    var AssociationId: String
  }

  object AssociateRouteTableResult {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined
    ): AssociateRouteTableResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateRouteTableResult]
    }
  }

  @js.native
  trait AssociateSubnetCidrBlockRequest extends js.Object {
    var SubnetId: String
    var Ipv6CidrBlock: String
  }

  object AssociateSubnetCidrBlockRequest {
    def apply(
      SubnetId: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined
    ): AssociateSubnetCidrBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetId" -> SubnetId.map { x => x: js.Any }),
        ("Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSubnetCidrBlockRequest]
    }
  }

  @js.native
  trait AssociateSubnetCidrBlockResult extends js.Object {
    var SubnetId: String
    var Ipv6CidrBlockAssociation: SubnetIpv6CidrBlockAssociation
  }

  object AssociateSubnetCidrBlockResult {
    def apply(
      SubnetId: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation] = js.undefined
    ): AssociateSubnetCidrBlockResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetId" -> SubnetId.map { x => x: js.Any }),
        ("Ipv6CidrBlockAssociation" -> Ipv6CidrBlockAssociation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateSubnetCidrBlockResult]
    }
  }

  @js.native
  trait AssociateVpcCidrBlockRequest extends js.Object {
    var VpcId: String
    var AmazonProvidedIpv6CidrBlock: Boolean
  }

  object AssociateVpcCidrBlockRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.undefined
    ): AssociateVpcCidrBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("AmazonProvidedIpv6CidrBlock" -> AmazonProvidedIpv6CidrBlock.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVpcCidrBlockRequest]
    }
  }

  @js.native
  trait AssociateVpcCidrBlockResult extends js.Object {
    var VpcId: String
    var Ipv6CidrBlockAssociation: VpcIpv6CidrBlockAssociation
  }

  object AssociateVpcCidrBlockResult {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.undefined
    ): AssociateVpcCidrBlockResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("Ipv6CidrBlockAssociation" -> Ipv6CidrBlockAssociation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateVpcCidrBlockResult]
    }
  }

  /**
   * <p>Contains the parameters for AttachClassicLinkVpc.</p>
   */
  @js.native
  trait AttachClassicLinkVpcRequest extends js.Object {
    var DryRun: Boolean
    var InstanceId: String
    var VpcId: String
    var Groups: GroupIdStringList
  }

  object AttachClassicLinkVpcRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      Groups: js.UndefOr[GroupIdStringList] = js.undefined
    ): AttachClassicLinkVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachClassicLinkVpcRequest]
    }
  }

  /**
   * <p>Contains the output of AttachClassicLinkVpc.</p>
   */
  @js.native
  trait AttachClassicLinkVpcResult extends js.Object {
    var Return: Boolean
  }

  object AttachClassicLinkVpcResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): AttachClassicLinkVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachClassicLinkVpcResult]
    }
  }

  /**
   * <p>Contains the parameters for AttachInternetGateway.</p>
   */
  @js.native
  trait AttachInternetGatewayRequest extends js.Object {
    var DryRun: Boolean
    var InternetGatewayId: String
    var VpcId: String
  }

  object AttachInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InternetGatewayId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): AttachInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InternetGatewayId" -> InternetGatewayId.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachInternetGatewayRequest]
    }
  }

  /**
   * <p>Contains the parameters for AttachNetworkInterface.</p>
   */
  @js.native
  trait AttachNetworkInterfaceRequest extends js.Object {
    var DryRun: Boolean
    var NetworkInterfaceId: String
    var InstanceId: String
    var DeviceIndex: Integer
  }

  object AttachNetworkInterfaceRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      DeviceIndex: js.UndefOr[Integer] = js.undefined
    ): AttachNetworkInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("DeviceIndex" -> DeviceIndex.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachNetworkInterfaceRequest]
    }
  }

  /**
   * <p>Contains the output of AttachNetworkInterface.</p>
   */
  @js.native
  trait AttachNetworkInterfaceResult extends js.Object {
    var AttachmentId: String
  }

  object AttachNetworkInterfaceResult {
    def apply(
      AttachmentId: js.UndefOr[String] = js.undefined
    ): AttachNetworkInterfaceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttachmentId" -> AttachmentId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachNetworkInterfaceResult]
    }
  }

  /**
   * <p>Contains the parameters for AttachVolume.</p>
   */
  @js.native
  trait AttachVolumeRequest extends js.Object {
    var DryRun: Boolean
    var VolumeId: String
    var InstanceId: String
    var Device: String
  }

  object AttachVolumeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Device: js.UndefOr[String] = js.undefined
    ): AttachVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Device" -> Device.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachVolumeRequest]
    }
  }

  /**
   * <p>Contains the parameters for AttachVpnGateway.</p>
   */
  @js.native
  trait AttachVpnGatewayRequest extends js.Object {
    var DryRun: Boolean
    var VpnGatewayId: String
    var VpcId: String
  }

  object AttachVpnGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): AttachVpnGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpnGatewayId" -> VpnGatewayId.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachVpnGatewayRequest]
    }
  }

  /**
   * <p>Contains the output of AttachVpnGateway.</p>
   */
  @js.native
  trait AttachVpnGatewayResult extends js.Object {
    var VpcAttachment: VpcAttachment
  }

  object AttachVpnGatewayResult {
    def apply(
      VpcAttachment: js.UndefOr[VpcAttachment] = js.undefined
    ): AttachVpnGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcAttachment" -> VpcAttachment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttachVpnGatewayResult]
    }
  }


  object AttachmentStatusEnum {
    val attaching = "attaching"
    val attached = "attached"
    val detaching = "detaching"
    val detached = "detached"

    val values = IndexedSeq(attaching, attached, detaching, detached)
  }

  /**
   * <p>Describes a value for a resource attribute that is a Boolean value.</p>
   */
  @js.native
  trait AttributeBooleanValue extends js.Object {
    var Value: Boolean
  }

  object AttributeBooleanValue {
    def apply(
      Value: js.UndefOr[Boolean] = js.undefined
    ): AttributeBooleanValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeBooleanValue]
    }
  }

  /**
   * <p>Describes a value for a resource attribute that is a String.</p>
   */
  @js.native
  trait AttributeValue extends js.Object {
    var Value: String
  }

  object AttributeValue {
    def apply(
      Value: js.UndefOr[String] = js.undefined
    ): AttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValue]
    }
  }

  /**
   * <p>Contains the parameters for AuthorizeSecurityGroupEgress.</p>
   */
  @js.native
  trait AuthorizeSecurityGroupEgressRequest extends js.Object {
    var DryRun: Boolean
    var CidrIp: String
    var IpPermissions: IpPermissionList
    var SourceSecurityGroupName: String
    var GroupId: String
    var ToPort: Integer
    var FromPort: Integer
    var IpProtocol: String
    var SourceSecurityGroupOwnerId: String
  }

  object AuthorizeSecurityGroupEgressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CidrIp: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      SourceSecurityGroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      ToPort: js.UndefOr[Integer] = js.undefined,
      FromPort: js.UndefOr[Integer] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined,
      SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): AuthorizeSecurityGroupEgressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("CidrIp" -> CidrIp.map { x => x: js.Any }),
        ("IpPermissions" -> IpPermissions.map { x => x: js.Any }),
        ("SourceSecurityGroupName" -> SourceSecurityGroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("ToPort" -> ToPort.map { x => x: js.Any }),
        ("FromPort" -> FromPort.map { x => x: js.Any }),
        ("IpProtocol" -> IpProtocol.map { x => x: js.Any }),
        ("SourceSecurityGroupOwnerId" -> SourceSecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSecurityGroupEgressRequest]
    }
  }

  /**
   * <p>Contains the parameters for AuthorizeSecurityGroupIngress.</p>
   */
  @js.native
  trait AuthorizeSecurityGroupIngressRequest extends js.Object {
    var DryRun: Boolean
    var CidrIp: String
    var IpPermissions: IpPermissionList
    var SourceSecurityGroupName: String
    var GroupName: String
    var GroupId: String
    var ToPort: Integer
    var FromPort: Integer
    var IpProtocol: String
    var SourceSecurityGroupOwnerId: String
  }

  object AuthorizeSecurityGroupIngressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CidrIp: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      SourceSecurityGroupName: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      ToPort: js.UndefOr[Integer] = js.undefined,
      FromPort: js.UndefOr[Integer] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined,
      SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): AuthorizeSecurityGroupIngressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("CidrIp" -> CidrIp.map { x => x: js.Any }),
        ("IpPermissions" -> IpPermissions.map { x => x: js.Any }),
        ("SourceSecurityGroupName" -> SourceSecurityGroupName.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("ToPort" -> ToPort.map { x => x: js.Any }),
        ("FromPort" -> FromPort.map { x => x: js.Any }),
        ("IpProtocol" -> IpProtocol.map { x => x: js.Any }),
        ("SourceSecurityGroupOwnerId" -> SourceSecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeSecurityGroupIngressRequest]
    }
  }


  object AutoPlacementEnum {
    val on = "on"
    val off = "off"

    val values = IndexedSeq(on, off)
  }

  /**
   * <p>Describes an Availability Zone.</p>
   */
  @js.native
  trait AvailabilityZone extends js.Object {
    var ZoneName: String
    var State: AvailabilityZoneState
    var RegionName: String
    var Messages: AvailabilityZoneMessageList
  }

  object AvailabilityZone {
    def apply(
      ZoneName: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[AvailabilityZoneState] = js.undefined,
      RegionName: js.UndefOr[String] = js.undefined,
      Messages: js.UndefOr[AvailabilityZoneMessageList] = js.undefined
    ): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ZoneName" -> ZoneName.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("RegionName" -> RegionName.map { x => x: js.Any }),
        ("Messages" -> Messages.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  /**
   * <p>Describes a message about an Availability Zone.</p>
   */
  @js.native
  trait AvailabilityZoneMessage extends js.Object {
    var Message: String
  }

  object AvailabilityZoneMessage {
    def apply(
      Message: js.UndefOr[String] = js.undefined
    ): AvailabilityZoneMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZoneMessage]
    }
  }


  object AvailabilityZoneStateEnum {
    val available = "available"
    val information = "information"
    val impaired = "impaired"
    val unavailable = "unavailable"

    val values = IndexedSeq(available, information, impaired, unavailable)
  }

  /**
   * <p>The capacity information for instances launched onto the Dedicated Host.</p>
   */
  @js.native
  trait AvailableCapacity extends js.Object {
    var AvailableInstanceCapacity: AvailableInstanceCapacityList
    var AvailableVCpus: Integer
  }

  object AvailableCapacity {
    def apply(
      AvailableInstanceCapacity: js.UndefOr[AvailableInstanceCapacityList] = js.undefined,
      AvailableVCpus: js.UndefOr[Integer] = js.undefined
    ): AvailableCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailableInstanceCapacity" -> AvailableInstanceCapacity.map { x => x: js.Any }),
        ("AvailableVCpus" -> AvailableVCpus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailableCapacity]
    }
  }


  object BatchStateEnum {
    val submitted = "submitted"
    val active = "active"
    val cancelled = "cancelled"
    val failed = "failed"
    val `cancelled_running` = "cancelled_running"
    val `cancelled_terminating` = "cancelled_terminating"
    val modifying = "modifying"

    val values = IndexedSeq(submitted, active, cancelled, failed, `cancelled_running`, `cancelled_terminating`, modifying)
  }

  @js.native
  trait BlobAttributeValue extends js.Object {
    var Value: Blob
  }

  object BlobAttributeValue {
    def apply(
      Value: js.UndefOr[Blob] = js.undefined
    ): BlobAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlobAttributeValue]
    }
  }

  /**
   * <p>Describes a block device mapping.</p>
   */
  @js.native
  trait BlockDeviceMapping extends js.Object {
    var VirtualName: String
    var DeviceName: String
    var Ebs: EbsBlockDevice
    var NoDevice: String
  }

  object BlockDeviceMapping {
    def apply(
      VirtualName: js.UndefOr[String] = js.undefined,
      DeviceName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[EbsBlockDevice] = js.undefined,
      NoDevice: js.UndefOr[String] = js.undefined
    ): BlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VirtualName" -> VirtualName.map { x => x: js.Any }),
        ("DeviceName" -> DeviceName.map { x => x: js.Any }),
        ("Ebs" -> Ebs.map { x => x: js.Any }),
        ("NoDevice" -> NoDevice.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BlockDeviceMapping]
    }
  }

  /**
   * <p>Contains the parameters for BundleInstance.</p>
   */
  @js.native
  trait BundleInstanceRequest extends js.Object {
    var DryRun: Boolean
    var InstanceId: String
    var Storage: Storage
  }

  object BundleInstanceRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Storage: js.UndefOr[Storage] = js.undefined
    ): BundleInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Storage" -> Storage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BundleInstanceRequest]
    }
  }

  /**
   * <p>Contains the output of BundleInstance.</p>
   */
  @js.native
  trait BundleInstanceResult extends js.Object {
    var BundleTask: BundleTask
  }

  object BundleInstanceResult {
    def apply(
      BundleTask: js.UndefOr[BundleTask] = js.undefined
    ): BundleInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BundleTask" -> BundleTask.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BundleInstanceResult]
    }
  }

  /**
   * <p>Describes a bundle task.</p>
   */
  @js.native
  trait BundleTask extends js.Object {
    var Storage: Storage
    var BundleId: String
    var BundleTaskError: BundleTaskError
    var StartTime: DateTime
    var InstanceId: String
    var State: BundleTaskState
    var Progress: String
    var UpdateTime: DateTime
  }

  object BundleTask {
    def apply(
      Storage: js.UndefOr[Storage] = js.undefined,
      BundleId: js.UndefOr[String] = js.undefined,
      BundleTaskError: js.UndefOr[BundleTaskError] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[BundleTaskState] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      UpdateTime: js.UndefOr[DateTime] = js.undefined
    ): BundleTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Storage" -> Storage.map { x => x: js.Any }),
        ("BundleId" -> BundleId.map { x => x: js.Any }),
        ("BundleTaskError" -> BundleTaskError.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("Progress" -> Progress.map { x => x: js.Any }),
        ("UpdateTime" -> UpdateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BundleTask]
    }
  }

  /**
   * <p>Describes an error for <a>BundleInstance</a>.</p>
   */
  @js.native
  trait BundleTaskError extends js.Object {
    var Code: String
    var Message: String
  }

  object BundleTaskError {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): BundleTaskError = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BundleTaskError]
    }
  }


  object BundleTaskStateEnum {
    val pending = "pending"
    val `waiting-for-shutdown` = "waiting-for-shutdown"
    val bundling = "bundling"
    val storing = "storing"
    val cancelling = "cancelling"
    val complete = "complete"
    val failed = "failed"

    val values = IndexedSeq(pending, `waiting-for-shutdown`, bundling, storing, cancelling, complete, failed)
  }


  object CancelBatchErrorCodeEnum {
    val fleetRequestIdDoesNotExist = "fleetRequestIdDoesNotExist"
    val fleetRequestIdMalformed = "fleetRequestIdMalformed"
    val fleetRequestNotInCancellableState = "fleetRequestNotInCancellableState"
    val unexpectedError = "unexpectedError"

    val values = IndexedSeq(fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError)
  }

  /**
   * <p>Contains the parameters for CancelBundleTask.</p>
   */
  @js.native
  trait CancelBundleTaskRequest extends js.Object {
    var DryRun: Boolean
    var BundleId: String
  }

  object CancelBundleTaskRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      BundleId: js.UndefOr[String] = js.undefined
    ): CancelBundleTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("BundleId" -> BundleId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelBundleTaskRequest]
    }
  }

  /**
   * <p>Contains the output of CancelBundleTask.</p>
   */
  @js.native
  trait CancelBundleTaskResult extends js.Object {
    var BundleTask: BundleTask
  }

  object CancelBundleTaskResult {
    def apply(
      BundleTask: js.UndefOr[BundleTask] = js.undefined
    ): CancelBundleTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BundleTask" -> BundleTask.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelBundleTaskResult]
    }
  }

  /**
   * <p>Contains the parameters for CancelConversionTask.</p>
   */
  @js.native
  trait CancelConversionRequest extends js.Object {
    var DryRun: Boolean
    var ConversionTaskId: String
    var ReasonMessage: String
  }

  object CancelConversionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ConversionTaskId: js.UndefOr[String] = js.undefined,
      ReasonMessage: js.UndefOr[String] = js.undefined
    ): CancelConversionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ConversionTaskId" -> ConversionTaskId.map { x => x: js.Any }),
        ("ReasonMessage" -> ReasonMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelConversionRequest]
    }
  }

  /**
   * <p>Contains the parameters for CancelExportTask.</p>
   */
  @js.native
  trait CancelExportTaskRequest extends js.Object {
    var ExportTaskId: String
  }

  object CancelExportTaskRequest {
    def apply(
      ExportTaskId: js.UndefOr[String] = js.undefined
    ): CancelExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExportTaskId" -> ExportTaskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelExportTaskRequest]
    }
  }

  /**
   * <p>Contains the parameters for CancelImportTask.</p>
   */
  @js.native
  trait CancelImportTaskRequest extends js.Object {
    var DryRun: Boolean
    var ImportTaskId: String
    var CancelReason: String
  }

  object CancelImportTaskRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ImportTaskId: js.UndefOr[String] = js.undefined,
      CancelReason: js.UndefOr[String] = js.undefined
    ): CancelImportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ImportTaskId" -> ImportTaskId.map { x => x: js.Any }),
        ("CancelReason" -> CancelReason.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelImportTaskRequest]
    }
  }

  /**
   * <p>Contains the output for CancelImportTask.</p>
   */
  @js.native
  trait CancelImportTaskResult extends js.Object {
    var ImportTaskId: String
    var State: String
    var PreviousState: String
  }

  object CancelImportTaskResult {
    def apply(
      ImportTaskId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      PreviousState: js.UndefOr[String] = js.undefined
    ): CancelImportTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ImportTaskId" -> ImportTaskId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("PreviousState" -> PreviousState.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelImportTaskResult]
    }
  }

  /**
   * <p>Contains the parameters for CancelReservedInstancesListing.</p>
   */
  @js.native
  trait CancelReservedInstancesListingRequest extends js.Object {
    var ReservedInstancesListingId: String
  }

  object CancelReservedInstancesListingRequest {
    def apply(
      ReservedInstancesListingId: js.UndefOr[String] = js.undefined
    ): CancelReservedInstancesListingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesListingId" -> ReservedInstancesListingId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelReservedInstancesListingRequest]
    }
  }

  /**
   * <p>Contains the output of CancelReservedInstancesListing.</p>
   */
  @js.native
  trait CancelReservedInstancesListingResult extends js.Object {
    var ReservedInstancesListings: ReservedInstancesListingList
  }

  object CancelReservedInstancesListingResult {
    def apply(
      ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.undefined
    ): CancelReservedInstancesListingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesListings" -> ReservedInstancesListings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelReservedInstancesListingResult]
    }
  }

  /**
   * <p>Describes a Spot fleet error.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsError extends js.Object {
    var Code: CancelBatchErrorCode
    var Message: String
  }

  object CancelSpotFleetRequestsError {
    def apply(
      Code: js.UndefOr[CancelBatchErrorCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): CancelSpotFleetRequestsError = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsError]
    }
  }

  /**
   * <p>Describes a Spot fleet request that was not successfully canceled.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsErrorItem extends js.Object {
    var SpotFleetRequestId: String
    var Error: CancelSpotFleetRequestsError
  }

  object CancelSpotFleetRequestsErrorItem {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      Error: js.UndefOr[CancelSpotFleetRequestsError] = js.undefined
    ): CancelSpotFleetRequestsErrorItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotFleetRequestId" -> SpotFleetRequestId.map { x => x: js.Any }),
        ("Error" -> Error.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsErrorItem]
    }
  }

  /**
   * <p>Contains the parameters for CancelSpotFleetRequests.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsRequest extends js.Object {
    var DryRun: Boolean
    var SpotFleetRequestIds: ValueStringList
    var TerminateInstances: Boolean
  }

  object CancelSpotFleetRequestsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotFleetRequestIds: js.UndefOr[ValueStringList] = js.undefined,
      TerminateInstances: js.UndefOr[Boolean] = js.undefined
    ): CancelSpotFleetRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SpotFleetRequestIds" -> SpotFleetRequestIds.map { x => x: js.Any }),
        ("TerminateInstances" -> TerminateInstances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsRequest]
    }
  }

  /**
   * <p>Contains the output of CancelSpotFleetRequests.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsResponse extends js.Object {
    var UnsuccessfulFleetRequests: CancelSpotFleetRequestsErrorSet
    var SuccessfulFleetRequests: CancelSpotFleetRequestsSuccessSet
  }

  object CancelSpotFleetRequestsResponse {
    def apply(
      UnsuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsErrorSet] = js.undefined,
      SuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsSuccessSet] = js.undefined
    ): CancelSpotFleetRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UnsuccessfulFleetRequests" -> UnsuccessfulFleetRequests.map { x => x: js.Any }),
        ("SuccessfulFleetRequests" -> SuccessfulFleetRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsResponse]
    }
  }

  /**
   * <p>Describes a Spot fleet request that was successfully canceled.</p>
   */
  @js.native
  trait CancelSpotFleetRequestsSuccessItem extends js.Object {
    var SpotFleetRequestId: String
    var CurrentSpotFleetRequestState: BatchState
    var PreviousSpotFleetRequestState: BatchState
  }

  object CancelSpotFleetRequestsSuccessItem {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      CurrentSpotFleetRequestState: js.UndefOr[BatchState] = js.undefined,
      PreviousSpotFleetRequestState: js.UndefOr[BatchState] = js.undefined
    ): CancelSpotFleetRequestsSuccessItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotFleetRequestId" -> SpotFleetRequestId.map { x => x: js.Any }),
        ("CurrentSpotFleetRequestState" -> CurrentSpotFleetRequestState.map { x => x: js.Any }),
        ("PreviousSpotFleetRequestState" -> PreviousSpotFleetRequestState.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotFleetRequestsSuccessItem]
    }
  }


  object CancelSpotInstanceRequestStateEnum {
    val active = "active"
    val open = "open"
    val closed = "closed"
    val cancelled = "cancelled"
    val completed = "completed"

    val values = IndexedSeq(active, open, closed, cancelled, completed)
  }

  /**
   * <p>Contains the parameters for CancelSpotInstanceRequests.</p>
   */
  @js.native
  trait CancelSpotInstanceRequestsRequest extends js.Object {
    var DryRun: Boolean
    var SpotInstanceRequestIds: SpotInstanceRequestIdList
  }

  object CancelSpotInstanceRequestsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotInstanceRequestIds: js.UndefOr[SpotInstanceRequestIdList] = js.undefined
    ): CancelSpotInstanceRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SpotInstanceRequestIds" -> SpotInstanceRequestIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotInstanceRequestsRequest]
    }
  }

  /**
   * <p>Contains the output of CancelSpotInstanceRequests.</p>
   */
  @js.native
  trait CancelSpotInstanceRequestsResult extends js.Object {
    var CancelledSpotInstanceRequests: CancelledSpotInstanceRequestList
  }

  object CancelSpotInstanceRequestsResult {
    def apply(
      CancelledSpotInstanceRequests: js.UndefOr[CancelledSpotInstanceRequestList] = js.undefined
    ): CancelSpotInstanceRequestsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CancelledSpotInstanceRequests" -> CancelledSpotInstanceRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelSpotInstanceRequestsResult]
    }
  }

  /**
   * <p>Describes a request to cancel a Spot instance.</p>
   */
  @js.native
  trait CancelledSpotInstanceRequest extends js.Object {
    var SpotInstanceRequestId: String
    var State: CancelSpotInstanceRequestState
  }

  object CancelledSpotInstanceRequest {
    def apply(
      SpotInstanceRequestId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[CancelSpotInstanceRequestState] = js.undefined
    ): CancelledSpotInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotInstanceRequestId" -> SpotInstanceRequestId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CancelledSpotInstanceRequest]
    }
  }

  /**
   * <p>Describes the ClassicLink DNS support status of a VPC.</p>
   */
  @js.native
  trait ClassicLinkDnsSupport extends js.Object {
    var VpcId: String
    var ClassicLinkDnsSupported: Boolean
  }

  object ClassicLinkDnsSupport {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      ClassicLinkDnsSupported: js.UndefOr[Boolean] = js.undefined
    ): ClassicLinkDnsSupport = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("ClassicLinkDnsSupported" -> ClassicLinkDnsSupported.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClassicLinkDnsSupport]
    }
  }

  /**
   * <p>Describes a linked EC2-Classic instance.</p>
   */
  @js.native
  trait ClassicLinkInstance extends js.Object {
    var InstanceId: String
    var VpcId: String
    var Groups: GroupIdentifierList
    var Tags: TagList
  }

  object ClassicLinkInstance {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): ClassicLinkInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClassicLinkInstance]
    }
  }

  /**
   * <p>Describes the client-specific data.</p>
   */
  @js.native
  trait ClientData extends js.Object {
    var UploadStart: DateTime
    var UploadEnd: DateTime
    var UploadSize: Double
    var Comment: String
  }

  object ClientData {
    def apply(
      UploadStart: js.UndefOr[DateTime] = js.undefined,
      UploadEnd: js.UndefOr[DateTime] = js.undefined,
      UploadSize: js.UndefOr[Double] = js.undefined,
      Comment: js.UndefOr[String] = js.undefined
    ): ClientData = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UploadStart" -> UploadStart.map { x => x: js.Any }),
        ("UploadEnd" -> UploadEnd.map { x => x: js.Any }),
        ("UploadSize" -> UploadSize.map { x => x: js.Any }),
        ("Comment" -> Comment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClientData]
    }
  }

  /**
   * <p>Contains the parameters for ConfirmProductInstance.</p>
   */
  @js.native
  trait ConfirmProductInstanceRequest extends js.Object {
    var DryRun: Boolean
    var ProductCode: String
    var InstanceId: String
  }

  object ConfirmProductInstanceRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ProductCode: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined
    ): ConfirmProductInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ProductCode" -> ProductCode.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmProductInstanceRequest]
    }
  }

  /**
   * <p>Contains the output of ConfirmProductInstance.</p>
   */
  @js.native
  trait ConfirmProductInstanceResult extends js.Object {
    var OwnerId: String
    var Return: Boolean
  }

  object ConfirmProductInstanceResult {
    def apply(
      OwnerId: js.UndefOr[String] = js.undefined,
      Return: js.UndefOr[Boolean] = js.undefined
    ): ConfirmProductInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmProductInstanceResult]
    }
  }


  object ContainerFormatEnum {
    val ova = "ova"

    val values = IndexedSeq(ova)
  }

  /**
   * <p>Describes a conversion task.</p>
   */
  @js.native
  trait ConversionTask extends js.Object {
    var StatusMessage: String
    var ImportVolume: ImportVolumeTaskDetails
    var ExpirationTime: String
    var Tags: TagList
    var ConversionTaskId: String
    var State: ConversionTaskState
    var ImportInstance: ImportInstanceTaskDetails
  }

  object ConversionTask {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      ImportVolume: js.UndefOr[ImportVolumeTaskDetails] = js.undefined,
      ExpirationTime: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ConversionTaskId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[ConversionTaskState] = js.undefined,
      ImportInstance: js.UndefOr[ImportInstanceTaskDetails] = js.undefined
    ): ConversionTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("ImportVolume" -> ImportVolume.map { x => x: js.Any }),
        ("ExpirationTime" -> ExpirationTime.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ConversionTaskId" -> ConversionTaskId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ImportInstance" -> ImportInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConversionTask]
    }
  }


  object ConversionTaskStateEnum {
    val active = "active"
    val cancelling = "cancelling"
    val cancelled = "cancelled"
    val completed = "completed"

    val values = IndexedSeq(active, cancelling, cancelled, completed)
  }

  /**
   * <p>Contains the parameters for CopyImage.</p>
   */
  @js.native
  trait CopyImageRequest extends js.Object {
    var SourceRegion: String
    var DryRun: Boolean
    var SourceImageId: String
    var Name: String
    var ClientToken: String
    var Description: String
    var KmsKeyId: String
    var Encrypted: Boolean
  }

  object CopyImageRequest {
    def apply(
      SourceRegion: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SourceImageId: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined
    ): CopyImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceRegion" -> SourceRegion.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SourceImageId" -> SourceImageId.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyImageRequest]
    }
  }

  /**
   * <p>Contains the output of CopyImage.</p>
   */
  @js.native
  trait CopyImageResult extends js.Object {
    var ImageId: String
  }

  object CopyImageResult {
    def apply(
      ImageId: js.UndefOr[String] = js.undefined
    ): CopyImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ImageId" -> ImageId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyImageResult]
    }
  }

  /**
   * <p>Contains the parameters for CopySnapshot.</p>
   */
  @js.native
  trait CopySnapshotRequest extends js.Object {
    var SourceRegion: String
    var DryRun: Boolean
    var DestinationRegion: String
    var Description: String
    var KmsKeyId: String
    var PresignedUrl: String
    var Encrypted: Boolean
    var SourceSnapshotId: String
  }

  object CopySnapshotRequest {
    def apply(
      SourceRegion: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DestinationRegion: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      PresignedUrl: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      SourceSnapshotId: js.UndefOr[String] = js.undefined
    ): CopySnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceRegion" -> SourceRegion.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("DestinationRegion" -> DestinationRegion.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("PresignedUrl" -> PresignedUrl.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("SourceSnapshotId" -> SourceSnapshotId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotRequest]
    }
  }

  /**
   * <p>Contains the output of CopySnapshot.</p>
   */
  @js.native
  trait CopySnapshotResult extends js.Object {
    var SnapshotId: String
  }

  object CopySnapshotResult {
    def apply(
      SnapshotId: js.UndefOr[String] = js.undefined
    ): CopySnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopySnapshotResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateCustomerGateway.</p>
   */
  @js.native
  trait CreateCustomerGatewayRequest extends js.Object {
    var DryRun: Boolean
    var Type: GatewayType
    var PublicIp: String
    var BgpAsn: Integer
  }

  object CreateCustomerGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Type: js.UndefOr[GatewayType] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      BgpAsn: js.UndefOr[Integer] = js.undefined
    ): CreateCustomerGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("BgpAsn" -> BgpAsn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCustomerGatewayRequest]
    }
  }

  /**
   * <p>Contains the output of CreateCustomerGateway.</p>
   */
  @js.native
  trait CreateCustomerGatewayResult extends js.Object {
    var CustomerGateway: CustomerGateway
  }

  object CreateCustomerGatewayResult {
    def apply(
      CustomerGateway: js.UndefOr[CustomerGateway] = js.undefined
    ): CreateCustomerGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CustomerGateway" -> CustomerGateway.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCustomerGatewayResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateDhcpOptions.</p>
   */
  @js.native
  trait CreateDhcpOptionsRequest extends js.Object {
    var DryRun: Boolean
    var DhcpConfigurations: NewDhcpConfigurationList
  }

  object CreateDhcpOptionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DhcpConfigurations: js.UndefOr[NewDhcpConfigurationList] = js.undefined
    ): CreateDhcpOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("DhcpConfigurations" -> DhcpConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDhcpOptionsRequest]
    }
  }

  /**
   * <p>Contains the output of CreateDhcpOptions.</p>
   */
  @js.native
  trait CreateDhcpOptionsResult extends js.Object {
    var DhcpOptions: DhcpOptions
  }

  object CreateDhcpOptionsResult {
    def apply(
      DhcpOptions: js.UndefOr[DhcpOptions] = js.undefined
    ): CreateDhcpOptionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DhcpOptions" -> DhcpOptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDhcpOptionsResult]
    }
  }

  @js.native
  trait CreateEgressOnlyInternetGatewayRequest extends js.Object {
    var DryRun: Boolean
    var VpcId: String
    var ClientToken: String
  }

  object CreateEgressOnlyInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined
    ): CreateEgressOnlyInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEgressOnlyInternetGatewayRequest]
    }
  }

  @js.native
  trait CreateEgressOnlyInternetGatewayResult extends js.Object {
    var EgressOnlyInternetGateway: EgressOnlyInternetGateway
    var ClientToken: String
  }

  object CreateEgressOnlyInternetGatewayResult {
    def apply(
      EgressOnlyInternetGateway: js.UndefOr[EgressOnlyInternetGateway] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined
    ): CreateEgressOnlyInternetGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EgressOnlyInternetGateway" -> EgressOnlyInternetGateway.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEgressOnlyInternetGatewayResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateFlowLogs.</p>
   */
  @js.native
  trait CreateFlowLogsRequest extends js.Object {
    var ClientToken: String
    var LogGroupName: String
    var ResourceIds: ValueStringList
    var ResourceType: FlowLogsResourceType
    var DeliverLogsPermissionArn: String
    var TrafficType: TrafficType
  }

  object CreateFlowLogsRequest {
    def apply(
      ClientToken: js.UndefOr[String] = js.undefined,
      LogGroupName: js.UndefOr[String] = js.undefined,
      ResourceIds: js.UndefOr[ValueStringList] = js.undefined,
      ResourceType: js.UndefOr[FlowLogsResourceType] = js.undefined,
      DeliverLogsPermissionArn: js.UndefOr[String] = js.undefined,
      TrafficType: js.UndefOr[TrafficType] = js.undefined
    ): CreateFlowLogsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("LogGroupName" -> LogGroupName.map { x => x: js.Any }),
        ("ResourceIds" -> ResourceIds.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("DeliverLogsPermissionArn" -> DeliverLogsPermissionArn.map { x => x: js.Any }),
        ("TrafficType" -> TrafficType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFlowLogsRequest]
    }
  }

  /**
   * <p>Contains the output of CreateFlowLogs.</p>
   */
  @js.native
  trait CreateFlowLogsResult extends js.Object {
    var FlowLogIds: ValueStringList
    var ClientToken: String
    var Unsuccessful: UnsuccessfulItemSet
  }

  object CreateFlowLogsResult {
    def apply(
      FlowLogIds: js.UndefOr[ValueStringList] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
    ): CreateFlowLogsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FlowLogIds" -> FlowLogIds.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("Unsuccessful" -> Unsuccessful.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFlowLogsResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateImage.</p>
   */
  @js.native
  trait CreateImageRequest extends js.Object {
    var BlockDeviceMappings: BlockDeviceMappingRequestList
    var DryRun: Boolean
    var Name: String
    var Description: String
    var InstanceId: String
    var NoReboot: Boolean
  }

  object CreateImageRequest {
    def apply(
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NoReboot: js.UndefOr[Boolean] = js.undefined
    ): CreateImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("NoReboot" -> NoReboot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageRequest]
    }
  }

  /**
   * <p>Contains the output of CreateImage.</p>
   */
  @js.native
  trait CreateImageResult extends js.Object {
    var ImageId: String
  }

  object CreateImageResult {
    def apply(
      ImageId: js.UndefOr[String] = js.undefined
    ): CreateImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ImageId" -> ImageId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateImageResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateInstanceExportTask.</p>
   */
  @js.native
  trait CreateInstanceExportTaskRequest extends js.Object {
    var Description: String
    var InstanceId: String
    var TargetEnvironment: ExportEnvironment
    var ExportToS3Task: ExportToS3TaskSpecification
  }

  object CreateInstanceExportTaskRequest {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      TargetEnvironment: js.UndefOr[ExportEnvironment] = js.undefined,
      ExportToS3Task: js.UndefOr[ExportToS3TaskSpecification] = js.undefined
    ): CreateInstanceExportTaskRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("TargetEnvironment" -> TargetEnvironment.map { x => x: js.Any }),
        ("ExportToS3Task" -> ExportToS3Task.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceExportTaskRequest]
    }
  }

  /**
   * <p>Contains the output for CreateInstanceExportTask.</p>
   */
  @js.native
  trait CreateInstanceExportTaskResult extends js.Object {
    var ExportTask: ExportTask
  }

  object CreateInstanceExportTaskResult {
    def apply(
      ExportTask: js.UndefOr[ExportTask] = js.undefined
    ): CreateInstanceExportTaskResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExportTask" -> ExportTask.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceExportTaskResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateInternetGateway.</p>
   */
  @js.native
  trait CreateInternetGatewayRequest extends js.Object {
    var DryRun: Boolean
  }

  object CreateInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined
    ): CreateInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInternetGatewayRequest]
    }
  }

  /**
   * <p>Contains the output of CreateInternetGateway.</p>
   */
  @js.native
  trait CreateInternetGatewayResult extends js.Object {
    var InternetGateway: InternetGateway
  }

  object CreateInternetGatewayResult {
    def apply(
      InternetGateway: js.UndefOr[InternetGateway] = js.undefined
    ): CreateInternetGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InternetGateway" -> InternetGateway.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInternetGatewayResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateKeyPair.</p>
   */
  @js.native
  trait CreateKeyPairRequest extends js.Object {
    var DryRun: Boolean
    var KeyName: String
  }

  object CreateKeyPairRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined
    ): CreateKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateKeyPairRequest]
    }
  }

  /**
   * <p>Contains the parameters for CreateNatGateway.</p>
   */
  @js.native
  trait CreateNatGatewayRequest extends js.Object {
    var SubnetId: String
    var AllocationId: String
    var ClientToken: String
  }

  object CreateNatGatewayRequest {
    def apply(
      SubnetId: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined
    ): CreateNatGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetId" -> SubnetId.map { x => x: js.Any }),
        ("AllocationId" -> AllocationId.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNatGatewayRequest]
    }
  }

  /**
   * <p>Contains the output of CreateNatGateway.</p>
   */
  @js.native
  trait CreateNatGatewayResult extends js.Object {
    var NatGateway: NatGateway
    var ClientToken: String
  }

  object CreateNatGatewayResult {
    def apply(
      NatGateway: js.UndefOr[NatGateway] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined
    ): CreateNatGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NatGateway" -> NatGateway.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNatGatewayResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateNetworkAclEntry.</p>
   */
  @js.native
  trait CreateNetworkAclEntryRequest extends js.Object {
    var Egress: Boolean
    var DryRun: Boolean
    var Ipv6CidrBlock: String
    var PortRange: PortRange
    var IcmpTypeCode: IcmpTypeCode
    var CidrBlock: String
    var NetworkAclId: String
    var RuleNumber: Integer
    var RuleAction: RuleAction
    var Protocol: String
  }

  object CreateNetworkAclEntryRequest {
    def apply(
      Egress: js.UndefOr[Boolean] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      PortRange: js.UndefOr[PortRange] = js.undefined,
      IcmpTypeCode: js.UndefOr[IcmpTypeCode] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      RuleNumber: js.UndefOr[Integer] = js.undefined,
      RuleAction: js.UndefOr[RuleAction] = js.undefined,
      Protocol: js.UndefOr[String] = js.undefined
    ): CreateNetworkAclEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Egress" -> Egress.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x: js.Any }),
        ("PortRange" -> PortRange.map { x => x: js.Any }),
        ("IcmpTypeCode" -> IcmpTypeCode.map { x => x: js.Any }),
        ("CidrBlock" -> CidrBlock.map { x => x: js.Any }),
        ("NetworkAclId" -> NetworkAclId.map { x => x: js.Any }),
        ("RuleNumber" -> RuleNumber.map { x => x: js.Any }),
        ("RuleAction" -> RuleAction.map { x => x: js.Any }),
        ("Protocol" -> Protocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkAclEntryRequest]
    }
  }

  /**
   * <p>Contains the parameters for CreateNetworkAcl.</p>
   */
  @js.native
  trait CreateNetworkAclRequest extends js.Object {
    var DryRun: Boolean
    var VpcId: String
  }

  object CreateNetworkAclRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): CreateNetworkAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkAclRequest]
    }
  }

  /**
   * <p>Contains the output of CreateNetworkAcl.</p>
   */
  @js.native
  trait CreateNetworkAclResult extends js.Object {
    var NetworkAcl: NetworkAcl
  }

  object CreateNetworkAclResult {
    def apply(
      NetworkAcl: js.UndefOr[NetworkAcl] = js.undefined
    ): CreateNetworkAclResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkAcl" -> NetworkAcl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkAclResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateNetworkInterface.</p>
   */
  @js.native
  trait CreateNetworkInterfaceRequest extends js.Object {
    var Ipv6Addresses: InstanceIpv6AddressList
    var DryRun: Boolean
    var PrivateIpAddress: String
    var Description: String
    var PrivateIpAddresses: PrivateIpAddressSpecificationList
    var Ipv6AddressCount: Integer
    var Groups: SecurityGroupIdStringList
    var SecondaryPrivateIpAddressCount: Integer
    var SubnetId: String
  }

  object CreateNetworkInterfaceRequest {
    def apply(
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Integer] = js.undefined,
      Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): CreateNetworkInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6Addresses" -> Ipv6Addresses.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("PrivateIpAddresses" -> PrivateIpAddresses.map { x => x: js.Any }),
        ("Ipv6AddressCount" -> Ipv6AddressCount.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkInterfaceRequest]
    }
  }

  /**
   * <p>Contains the output of CreateNetworkInterface.</p>
   */
  @js.native
  trait CreateNetworkInterfaceResult extends js.Object {
    var NetworkInterface: NetworkInterface
  }

  object CreateNetworkInterfaceResult {
    def apply(
      NetworkInterface: js.UndefOr[NetworkInterface] = js.undefined
    ): CreateNetworkInterfaceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterface" -> NetworkInterface.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkInterfaceResult]
    }
  }

  /**
   * <p>Contains the parameters for CreatePlacementGroup.</p>
   */
  @js.native
  trait CreatePlacementGroupRequest extends js.Object {
    var DryRun: Boolean
    var GroupName: String
    var Strategy: PlacementStrategy
  }

  object CreatePlacementGroupRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      Strategy: js.UndefOr[PlacementStrategy] = js.undefined
    ): CreatePlacementGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("Strategy" -> Strategy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlacementGroupRequest]
    }
  }

  /**
   * <p>Contains the parameters for CreateReservedInstancesListing.</p>
   */
  @js.native
  trait CreateReservedInstancesListingRequest extends js.Object {
    var ReservedInstancesId: String
    var InstanceCount: Integer
    var PriceSchedules: PriceScheduleSpecificationList
    var ClientToken: String
  }

  object CreateReservedInstancesListingRequest {
    def apply(
      ReservedInstancesId: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      PriceSchedules: js.UndefOr[PriceScheduleSpecificationList] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined
    ): CreateReservedInstancesListingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesId" -> ReservedInstancesId.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("PriceSchedules" -> PriceSchedules.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReservedInstancesListingRequest]
    }
  }

  /**
   * <p>Contains the output of CreateReservedInstancesListing.</p>
   */
  @js.native
  trait CreateReservedInstancesListingResult extends js.Object {
    var ReservedInstancesListings: ReservedInstancesListingList
  }

  object CreateReservedInstancesListingResult {
    def apply(
      ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.undefined
    ): CreateReservedInstancesListingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesListings" -> ReservedInstancesListings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateReservedInstancesListingResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateRoute.</p>
   */
  @js.native
  trait CreateRouteRequest extends js.Object {
    var DryRun: Boolean
    var DestinationCidrBlock: String
    var VpcPeeringConnectionId: String
    var NatGatewayId: String
    var EgressOnlyInternetGatewayId: String
    var RouteTableId: String
    var InstanceId: String
    var NetworkInterfaceId: String
    var DestinationIpv6CidrBlock: String
    var GatewayId: String
  }

  object CreateRouteRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      NatGatewayId: js.UndefOr[String] = js.undefined,
      EgressOnlyInternetGatewayId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined,
      GatewayId: js.UndefOr[String] = js.undefined
    ): CreateRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("DestinationCidrBlock" -> DestinationCidrBlock.map { x => x: js.Any }),
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any }),
        ("NatGatewayId" -> NatGatewayId.map { x => x: js.Any }),
        ("EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x: js.Any }),
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("DestinationIpv6CidrBlock" -> DestinationIpv6CidrBlock.map { x => x: js.Any }),
        ("GatewayId" -> GatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteRequest]
    }
  }

  /**
   * <p>Contains the output of CreateRoute.</p>
   */
  @js.native
  trait CreateRouteResult extends js.Object {
    var Return: Boolean
  }

  object CreateRouteResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): CreateRouteResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateRouteTable.</p>
   */
  @js.native
  trait CreateRouteTableRequest extends js.Object {
    var DryRun: Boolean
    var VpcId: String
  }

  object CreateRouteTableRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): CreateRouteTableRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteTableRequest]
    }
  }

  /**
   * <p>Contains the output of CreateRouteTable.</p>
   */
  @js.native
  trait CreateRouteTableResult extends js.Object {
    var RouteTable: RouteTable
  }

  object CreateRouteTableResult {
    def apply(
      RouteTable: js.UndefOr[RouteTable] = js.undefined
    ): CreateRouteTableResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RouteTable" -> RouteTable.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteTableResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateSecurityGroup.</p>
   */
  @js.native
  trait CreateSecurityGroupRequest extends js.Object {
    var DryRun: Boolean
    var GroupName: String
    var Description: String
    var VpcId: String
  }

  object CreateSecurityGroupRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): CreateSecurityGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityGroupRequest]
    }
  }

  /**
   * <p>Contains the output of CreateSecurityGroup.</p>
   */
  @js.native
  trait CreateSecurityGroupResult extends js.Object {
    var GroupId: String
  }

  object CreateSecurityGroupResult {
    def apply(
      GroupId: js.UndefOr[String] = js.undefined
    ): CreateSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupId" -> GroupId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSecurityGroupResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateSnapshot.</p>
   */
  @js.native
  trait CreateSnapshotRequest extends js.Object {
    var DryRun: Boolean
    var VolumeId: String
    var Description: String
  }

  object CreateSnapshotRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined
    ): CreateSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSnapshotRequest]
    }
  }

  /**
   * <p>Contains the parameters for CreateSpotDatafeedSubscription.</p>
   */
  @js.native
  trait CreateSpotDatafeedSubscriptionRequest extends js.Object {
    var DryRun: Boolean
    var Bucket: String
    var Prefix: String
  }

  object CreateSpotDatafeedSubscriptionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Bucket: js.UndefOr[String] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined
    ): CreateSpotDatafeedSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSpotDatafeedSubscriptionRequest]
    }
  }

  /**
   * <p>Contains the output of CreateSpotDatafeedSubscription.</p>
   */
  @js.native
  trait CreateSpotDatafeedSubscriptionResult extends js.Object {
    var SpotDatafeedSubscription: SpotDatafeedSubscription
  }

  object CreateSpotDatafeedSubscriptionResult {
    def apply(
      SpotDatafeedSubscription: js.UndefOr[SpotDatafeedSubscription] = js.undefined
    ): CreateSpotDatafeedSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotDatafeedSubscription" -> SpotDatafeedSubscription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSpotDatafeedSubscriptionResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateSubnet.</p>
   */
  @js.native
  trait CreateSubnetRequest extends js.Object {
    var DryRun: Boolean
    var Ipv6CidrBlock: String
    var CidrBlock: String
    var AvailabilityZone: String
    var VpcId: String
  }

  object CreateSubnetRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): CreateSubnetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x: js.Any }),
        ("CidrBlock" -> CidrBlock.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubnetRequest]
    }
  }

  /**
   * <p>Contains the output of CreateSubnet.</p>
   */
  @js.native
  trait CreateSubnetResult extends js.Object {
    var Subnet: Subnet
  }

  object CreateSubnetResult {
    def apply(
      Subnet: js.UndefOr[Subnet] = js.undefined
    ): CreateSubnetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Subnet" -> Subnet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubnetResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateTags.</p>
   */
  @js.native
  trait CreateTagsRequest extends js.Object {
    var DryRun: Boolean
    var Resources: ResourceIdList
    var Tags: TagList
  }

  object CreateTagsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Resources: js.UndefOr[ResourceIdList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Resources" -> Resources.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
    }
  }

  /**
   * <p>Describes the user or group to be added or removed from the permissions for a volume.</p>
   */
  @js.native
  trait CreateVolumePermission extends js.Object {
    var UserId: String
    var Group: PermissionGroup
  }

  object CreateVolumePermission {
    def apply(
      UserId: js.UndefOr[String] = js.undefined,
      Group: js.UndefOr[PermissionGroup] = js.undefined
    ): CreateVolumePermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserId" -> UserId.map { x => x: js.Any }),
        ("Group" -> Group.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVolumePermission]
    }
  }

  /**
   * <p>Describes modifications to the permissions for a volume.</p>
   */
  @js.native
  trait CreateVolumePermissionModifications extends js.Object {
    var Add: CreateVolumePermissionList
    var Remove: CreateVolumePermissionList
  }

  object CreateVolumePermissionModifications {
    def apply(
      Add: js.UndefOr[CreateVolumePermissionList] = js.undefined,
      Remove: js.UndefOr[CreateVolumePermissionList] = js.undefined
    ): CreateVolumePermissionModifications = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Add" -> Add.map { x => x: js.Any }),
        ("Remove" -> Remove.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVolumePermissionModifications]
    }
  }

  /**
   * <p>Contains the parameters for CreateVolume.</p>
   */
  @js.native
  trait CreateVolumeRequest extends js.Object {
    var DryRun: Boolean
    var VolumeType: VolumeType
    var Size: Integer
    var SnapshotId: String
    var KmsKeyId: String
    var AvailabilityZone: String
    var Encrypted: Boolean
    var Iops: Integer
  }

  object CreateVolumeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      Size: js.UndefOr[Integer] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      Iops: js.UndefOr[Integer] = js.undefined
    ): CreateVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("Size" -> Size.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVolumeRequest]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpcEndpoint.</p>
   */
  @js.native
  trait CreateVpcEndpointRequest extends js.Object {
    var DryRun: Boolean
    var ServiceName: String
    var ClientToken: String
    var PolicyDocument: String
    var RouteTableIds: ValueStringList
    var VpcId: String
  }

  object CreateVpcEndpointRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ServiceName: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      PolicyDocument: js.UndefOr[String] = js.undefined,
      RouteTableIds: js.UndefOr[ValueStringList] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): CreateVpcEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ServiceName" -> ServiceName.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any }),
        ("RouteTableIds" -> RouteTableIds.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcEndpointRequest]
    }
  }

  /**
   * <p>Contains the output of CreateVpcEndpoint.</p>
   */
  @js.native
  trait CreateVpcEndpointResult extends js.Object {
    var VpcEndpoint: VpcEndpoint
    var ClientToken: String
  }

  object CreateVpcEndpointResult {
    def apply(
      VpcEndpoint: js.UndefOr[VpcEndpoint] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined
    ): CreateVpcEndpointResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcEndpoint" -> VpcEndpoint.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcEndpointResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpcPeeringConnection.</p>
   */
  @js.native
  trait CreateVpcPeeringConnectionRequest extends js.Object {
    var DryRun: Boolean
    var VpcId: String
    var PeerVpcId: String
    var PeerOwnerId: String
  }

  object CreateVpcPeeringConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      PeerVpcId: js.UndefOr[String] = js.undefined,
      PeerOwnerId: js.UndefOr[String] = js.undefined
    ): CreateVpcPeeringConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("PeerVpcId" -> PeerVpcId.map { x => x: js.Any }),
        ("PeerOwnerId" -> PeerOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringConnectionRequest]
    }
  }

  /**
   * <p>Contains the output of CreateVpcPeeringConnection.</p>
   */
  @js.native
  trait CreateVpcPeeringConnectionResult extends js.Object {
    var VpcPeeringConnection: VpcPeeringConnection
  }

  object CreateVpcPeeringConnectionResult {
    def apply(
      VpcPeeringConnection: js.UndefOr[VpcPeeringConnection] = js.undefined
    ): CreateVpcPeeringConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcPeeringConnection" -> VpcPeeringConnection.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringConnectionResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpc.</p>
   */
  @js.native
  trait CreateVpcRequest extends js.Object {
    var DryRun: Boolean
    var CidrBlock: String
    var InstanceTenancy: Tenancy
    var AmazonProvidedIpv6CidrBlock: Boolean
  }

  object CreateVpcRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined,
      AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean] = js.undefined
    ): CreateVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("CidrBlock" -> CidrBlock.map { x => x: js.Any }),
        ("InstanceTenancy" -> InstanceTenancy.map { x => x: js.Any }),
        ("AmazonProvidedIpv6CidrBlock" -> AmazonProvidedIpv6CidrBlock.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcRequest]
    }
  }

  /**
   * <p>Contains the output of CreateVpc.</p>
   */
  @js.native
  trait CreateVpcResult extends js.Object {
    var Vpc: Vpc
  }

  object CreateVpcResult {
    def apply(
      Vpc: js.UndefOr[Vpc] = js.undefined
    ): CreateVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Vpc" -> Vpc.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpnConnection.</p>
   */
  @js.native
  trait CreateVpnConnectionRequest extends js.Object {
    var DryRun: Boolean
    var CustomerGatewayId: String
    var Options: VpnConnectionOptionsSpecification
    var VpnGatewayId: String
    var Type: String
  }

  object CreateVpnConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CustomerGatewayId: js.UndefOr[String] = js.undefined,
      Options: js.UndefOr[VpnConnectionOptionsSpecification] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined
    ): CreateVpnConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("CustomerGatewayId" -> CustomerGatewayId.map { x => x: js.Any }),
        ("Options" -> Options.map { x => x: js.Any }),
        ("VpnGatewayId" -> VpnGatewayId.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnConnectionRequest]
    }
  }

  /**
   * <p>Contains the output of CreateVpnConnection.</p>
   */
  @js.native
  trait CreateVpnConnectionResult extends js.Object {
    var VpnConnection: VpnConnection
  }

  object CreateVpnConnectionResult {
    def apply(
      VpnConnection: js.UndefOr[VpnConnection] = js.undefined
    ): CreateVpnConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpnConnection" -> VpnConnection.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnConnectionResult]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpnConnectionRoute.</p>
   */
  @js.native
  trait CreateVpnConnectionRouteRequest extends js.Object {
    var VpnConnectionId: String
    var DestinationCidrBlock: String
  }

  object CreateVpnConnectionRouteRequest {
    def apply(
      VpnConnectionId: js.UndefOr[String] = js.undefined,
      DestinationCidrBlock: js.UndefOr[String] = js.undefined
    ): CreateVpnConnectionRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpnConnectionId" -> VpnConnectionId.map { x => x: js.Any }),
        ("DestinationCidrBlock" -> DestinationCidrBlock.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnConnectionRouteRequest]
    }
  }

  /**
   * <p>Contains the parameters for CreateVpnGateway.</p>
   */
  @js.native
  trait CreateVpnGatewayRequest extends js.Object {
    var DryRun: Boolean
    var Type: GatewayType
    var AvailabilityZone: String
  }

  object CreateVpnGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Type: js.UndefOr[GatewayType] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined
    ): CreateVpnGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnGatewayRequest]
    }
  }

  /**
   * <p>Contains the output of CreateVpnGateway.</p>
   */
  @js.native
  trait CreateVpnGatewayResult extends js.Object {
    var VpnGateway: VpnGateway
  }

  object CreateVpnGatewayResult {
    def apply(
      VpnGateway: js.UndefOr[VpnGateway] = js.undefined
    ): CreateVpnGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpnGateway" -> VpnGateway.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpnGatewayResult]
    }
  }


  object CurrencyCodeValuesEnum {
    val USD = "USD"

    val values = IndexedSeq(USD)
  }

  /**
   * <p>Describes a customer gateway.</p>
   */
  @js.native
  trait CustomerGateway extends js.Object {
    var BgpAsn: String
    var CustomerGatewayId: String
    var IpAddress: String
    var Tags: TagList
    var State: String
    var Type: String
  }

  object CustomerGateway {
    def apply(
      BgpAsn: js.UndefOr[String] = js.undefined,
      CustomerGatewayId: js.UndefOr[String] = js.undefined,
      IpAddress: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined
    ): CustomerGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BgpAsn" -> BgpAsn.map { x => x: js.Any }),
        ("CustomerGatewayId" -> CustomerGatewayId.map { x => x: js.Any }),
        ("IpAddress" -> IpAddress.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomerGateway]
    }
  }


  object DatafeedSubscriptionStateEnum {
    val Active = "Active"
    val Inactive = "Inactive"

    val values = IndexedSeq(Active, Inactive)
  }

  /**
   * <p>Contains the parameters for DeleteCustomerGateway.</p>
   */
  @js.native
  trait DeleteCustomerGatewayRequest extends js.Object {
    var DryRun: Boolean
    var CustomerGatewayId: String
  }

  object DeleteCustomerGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CustomerGatewayId: js.UndefOr[String] = js.undefined
    ): DeleteCustomerGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("CustomerGatewayId" -> CustomerGatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCustomerGatewayRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteDhcpOptions.</p>
   */
  @js.native
  trait DeleteDhcpOptionsRequest extends js.Object {
    var DryRun: Boolean
    var DhcpOptionsId: String
  }

  object DeleteDhcpOptionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DhcpOptionsId: js.UndefOr[String] = js.undefined
    ): DeleteDhcpOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("DhcpOptionsId" -> DhcpOptionsId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDhcpOptionsRequest]
    }
  }

  @js.native
  trait DeleteEgressOnlyInternetGatewayRequest extends js.Object {
    var DryRun: Boolean
    var EgressOnlyInternetGatewayId: EgressOnlyInternetGatewayId
  }

  object DeleteEgressOnlyInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId] = js.undefined
    ): DeleteEgressOnlyInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEgressOnlyInternetGatewayRequest]
    }
  }

  @js.native
  trait DeleteEgressOnlyInternetGatewayResult extends js.Object {
    var ReturnCode: Boolean
  }

  object DeleteEgressOnlyInternetGatewayResult {
    def apply(
      ReturnCode: js.UndefOr[Boolean] = js.undefined
    ): DeleteEgressOnlyInternetGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReturnCode" -> ReturnCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEgressOnlyInternetGatewayResult]
    }
  }

  /**
   * <p>Contains the parameters for DeleteFlowLogs.</p>
   */
  @js.native
  trait DeleteFlowLogsRequest extends js.Object {
    var FlowLogIds: ValueStringList
  }

  object DeleteFlowLogsRequest {
    def apply(
      FlowLogIds: js.UndefOr[ValueStringList] = js.undefined
    ): DeleteFlowLogsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FlowLogIds" -> FlowLogIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFlowLogsRequest]
    }
  }

  /**
   * <p>Contains the output of DeleteFlowLogs.</p>
   */
  @js.native
  trait DeleteFlowLogsResult extends js.Object {
    var Unsuccessful: UnsuccessfulItemSet
  }

  object DeleteFlowLogsResult {
    def apply(
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
    ): DeleteFlowLogsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Unsuccessful" -> Unsuccessful.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFlowLogsResult]
    }
  }

  /**
   * <p>Contains the parameters for DeleteInternetGateway.</p>
   */
  @js.native
  trait DeleteInternetGatewayRequest extends js.Object {
    var DryRun: Boolean
    var InternetGatewayId: String
  }

  object DeleteInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InternetGatewayId: js.UndefOr[String] = js.undefined
    ): DeleteInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InternetGatewayId" -> InternetGatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInternetGatewayRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteKeyPair.</p>
   */
  @js.native
  trait DeleteKeyPairRequest extends js.Object {
    var DryRun: Boolean
    var KeyName: String
  }

  object DeleteKeyPairRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined
    ): DeleteKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteKeyPairRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteNatGateway.</p>
   */
  @js.native
  trait DeleteNatGatewayRequest extends js.Object {
    var NatGatewayId: String
  }

  object DeleteNatGatewayRequest {
    def apply(
      NatGatewayId: js.UndefOr[String] = js.undefined
    ): DeleteNatGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NatGatewayId" -> NatGatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNatGatewayRequest]
    }
  }

  /**
   * <p>Contains the output of DeleteNatGateway.</p>
   */
  @js.native
  trait DeleteNatGatewayResult extends js.Object {
    var NatGatewayId: String
  }

  object DeleteNatGatewayResult {
    def apply(
      NatGatewayId: js.UndefOr[String] = js.undefined
    ): DeleteNatGatewayResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NatGatewayId" -> NatGatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNatGatewayResult]
    }
  }

  /**
   * <p>Contains the parameters for DeleteNetworkAclEntry.</p>
   */
  @js.native
  trait DeleteNetworkAclEntryRequest extends js.Object {
    var DryRun: Boolean
    var NetworkAclId: String
    var RuleNumber: Integer
    var Egress: Boolean
  }

  object DeleteNetworkAclEntryRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      RuleNumber: js.UndefOr[Integer] = js.undefined,
      Egress: js.UndefOr[Boolean] = js.undefined
    ): DeleteNetworkAclEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("NetworkAclId" -> NetworkAclId.map { x => x: js.Any }),
        ("RuleNumber" -> RuleNumber.map { x => x: js.Any }),
        ("Egress" -> Egress.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkAclEntryRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteNetworkAcl.</p>
   */
  @js.native
  trait DeleteNetworkAclRequest extends js.Object {
    var DryRun: Boolean
    var NetworkAclId: String
  }

  object DeleteNetworkAclRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined
    ): DeleteNetworkAclRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("NetworkAclId" -> NetworkAclId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkAclRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteNetworkInterface.</p>
   */
  @js.native
  trait DeleteNetworkInterfaceRequest extends js.Object {
    var DryRun: Boolean
    var NetworkInterfaceId: String
  }

  object DeleteNetworkInterfaceRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined
    ): DeleteNetworkInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkInterfaceRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeletePlacementGroup.</p>
   */
  @js.native
  trait DeletePlacementGroupRequest extends js.Object {
    var DryRun: Boolean
    var GroupName: String
  }

  object DeletePlacementGroupRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined
    ): DeletePlacementGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlacementGroupRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteRoute.</p>
   */
  @js.native
  trait DeleteRouteRequest extends js.Object {
    var DryRun: Boolean
    var RouteTableId: String
    var DestinationCidrBlock: String
    var DestinationIpv6CidrBlock: String
  }

  object DeleteRouteRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined
    ): DeleteRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any }),
        ("DestinationCidrBlock" -> DestinationCidrBlock.map { x => x: js.Any }),
        ("DestinationIpv6CidrBlock" -> DestinationIpv6CidrBlock.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRouteRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteRouteTable.</p>
   */
  @js.native
  trait DeleteRouteTableRequest extends js.Object {
    var DryRun: Boolean
    var RouteTableId: String
  }

  object DeleteRouteTableRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined
    ): DeleteRouteTableRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRouteTableRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteSecurityGroup.</p>
   */
  @js.native
  trait DeleteSecurityGroupRequest extends js.Object {
    var DryRun: Boolean
    var GroupName: String
    var GroupId: String
  }

  object DeleteSecurityGroupRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined
    ): DeleteSecurityGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSecurityGroupRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteSnapshot.</p>
   */
  @js.native
  trait DeleteSnapshotRequest extends js.Object {
    var DryRun: Boolean
    var SnapshotId: String
  }

  object DeleteSnapshotRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined
    ): DeleteSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSnapshotRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteSpotDatafeedSubscription.</p>
   */
  @js.native
  trait DeleteSpotDatafeedSubscriptionRequest extends js.Object {
    var DryRun: Boolean
  }

  object DeleteSpotDatafeedSubscriptionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined
    ): DeleteSpotDatafeedSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSpotDatafeedSubscriptionRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteSubnet.</p>
   */
  @js.native
  trait DeleteSubnetRequest extends js.Object {
    var DryRun: Boolean
    var SubnetId: String
  }

  object DeleteSubnetRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): DeleteSubnetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubnetRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteTags.</p>
   */
  @js.native
  trait DeleteTagsRequest extends js.Object {
    var DryRun: Boolean
    var Resources: ResourceIdList
    var Tags: TagList
  }

  object DeleteTagsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Resources: js.UndefOr[ResourceIdList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Resources" -> Resources.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVolume.</p>
   */
  @js.native
  trait DeleteVolumeRequest extends js.Object {
    var DryRun: Boolean
    var VolumeId: String
  }

  object DeleteVolumeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined
    ): DeleteVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVolumeRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpcEndpoints.</p>
   */
  @js.native
  trait DeleteVpcEndpointsRequest extends js.Object {
    var DryRun: Boolean
    var VpcEndpointIds: ValueStringList
  }

  object DeleteVpcEndpointsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcEndpointIds: js.UndefOr[ValueStringList] = js.undefined
    ): DeleteVpcEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcEndpointIds" -> VpcEndpointIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcEndpointsRequest]
    }
  }

  /**
   * <p>Contains the output of DeleteVpcEndpoints.</p>
   */
  @js.native
  trait DeleteVpcEndpointsResult extends js.Object {
    var Unsuccessful: UnsuccessfulItemSet
  }

  object DeleteVpcEndpointsResult {
    def apply(
      Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
    ): DeleteVpcEndpointsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Unsuccessful" -> Unsuccessful.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcEndpointsResult]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpcPeeringConnection.</p>
   */
  @js.native
  trait DeleteVpcPeeringConnectionRequest extends js.Object {
    var DryRun: Boolean
    var VpcPeeringConnectionId: String
  }

  object DeleteVpcPeeringConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
    ): DeleteVpcPeeringConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringConnectionRequest]
    }
  }

  /**
   * <p>Contains the output of DeleteVpcPeeringConnection.</p>
   */
  @js.native
  trait DeleteVpcPeeringConnectionResult extends js.Object {
    var Return: Boolean
  }

  object DeleteVpcPeeringConnectionResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): DeleteVpcPeeringConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringConnectionResult]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpc.</p>
   */
  @js.native
  trait DeleteVpcRequest extends js.Object {
    var DryRun: Boolean
    var VpcId: String
  }

  object DeleteVpcRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): DeleteVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpnConnection.</p>
   */
  @js.native
  trait DeleteVpnConnectionRequest extends js.Object {
    var DryRun: Boolean
    var VpnConnectionId: String
  }

  object DeleteVpnConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpnConnectionId: js.UndefOr[String] = js.undefined
    ): DeleteVpnConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpnConnectionId" -> VpnConnectionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpnConnectionRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpnConnectionRoute.</p>
   */
  @js.native
  trait DeleteVpnConnectionRouteRequest extends js.Object {
    var VpnConnectionId: String
    var DestinationCidrBlock: String
  }

  object DeleteVpnConnectionRouteRequest {
    def apply(
      VpnConnectionId: js.UndefOr[String] = js.undefined,
      DestinationCidrBlock: js.UndefOr[String] = js.undefined
    ): DeleteVpnConnectionRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpnConnectionId" -> VpnConnectionId.map { x => x: js.Any }),
        ("DestinationCidrBlock" -> DestinationCidrBlock.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpnConnectionRouteRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeleteVpnGateway.</p>
   */
  @js.native
  trait DeleteVpnGatewayRequest extends js.Object {
    var DryRun: Boolean
    var VpnGatewayId: String
  }

  object DeleteVpnGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined
    ): DeleteVpnGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpnGatewayId" -> VpnGatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpnGatewayRequest]
    }
  }

  /**
   * <p>Contains the parameters for DeregisterImage.</p>
   */
  @js.native
  trait DeregisterImageRequest extends js.Object {
    var DryRun: Boolean
    var ImageId: String
  }

  object DeregisterImageRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined
    ): DeregisterImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterImageRequest]
    }
  }

  /**
   * <p>Contains the parameters for DescribeAccountAttributes.</p>
   */
  @js.native
  trait DescribeAccountAttributesRequest extends js.Object {
    var DryRun: Boolean
    var AttributeNames: AccountAttributeNameStringList
  }

  object DescribeAccountAttributesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AttributeNames: js.UndefOr[AccountAttributeNameStringList] = js.undefined
    ): DescribeAccountAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("AttributeNames" -> AttributeNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeAccountAttributes.</p>
   */
  @js.native
  trait DescribeAccountAttributesResult extends js.Object {
    var AccountAttributes: AccountAttributeList
  }

  object DescribeAccountAttributesResult {
    def apply(
      AccountAttributes: js.UndefOr[AccountAttributeList] = js.undefined
    ): DescribeAccountAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountAttributes" -> AccountAttributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeAddresses.</p>
   */
  @js.native
  trait DescribeAddressesRequest extends js.Object {
    var DryRun: Boolean
    var PublicIps: PublicIpStringList
    var Filters: FilterList
    var AllocationIds: AllocationIdList
  }

  object DescribeAddressesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PublicIps: js.UndefOr[PublicIpStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      AllocationIds: js.UndefOr[AllocationIdList] = js.undefined
    ): DescribeAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("PublicIps" -> PublicIps.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("AllocationIds" -> AllocationIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAddressesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeAddresses.</p>
   */
  @js.native
  trait DescribeAddressesResult extends js.Object {
    var Addresses: AddressList
  }

  object DescribeAddressesResult {
    def apply(
      Addresses: js.UndefOr[AddressList] = js.undefined
    ): DescribeAddressesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Addresses" -> Addresses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAddressesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeAvailabilityZones.</p>
   */
  @js.native
  trait DescribeAvailabilityZonesRequest extends js.Object {
    var DryRun: Boolean
    var ZoneNames: ZoneNameStringList
    var Filters: FilterList
  }

  object DescribeAvailabilityZonesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ZoneNames: js.UndefOr[ZoneNameStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeAvailabilityZonesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ZoneNames" -> ZoneNames.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailabilityZonesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeAvailabiltyZones.</p>
   */
  @js.native
  trait DescribeAvailabilityZonesResult extends js.Object {
    var AvailabilityZones: AvailabilityZoneList
  }

  object DescribeAvailabilityZonesResult {
    def apply(
      AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    ): DescribeAvailabilityZonesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAvailabilityZonesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeBundleTasks.</p>
   */
  @js.native
  trait DescribeBundleTasksRequest extends js.Object {
    var DryRun: Boolean
    var BundleIds: BundleIdStringList
    var Filters: FilterList
  }

  object DescribeBundleTasksRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      BundleIds: js.UndefOr[BundleIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeBundleTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("BundleIds" -> BundleIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBundleTasksRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeBundleTasks.</p>
   */
  @js.native
  trait DescribeBundleTasksResult extends js.Object {
    var BundleTasks: BundleTaskList
  }

  object DescribeBundleTasksResult {
    def apply(
      BundleTasks: js.UndefOr[BundleTaskList] = js.undefined
    ): DescribeBundleTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BundleTasks" -> BundleTasks.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBundleTasksResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeClassicLinkInstances.</p>
   */
  @js.native
  trait DescribeClassicLinkInstancesRequest extends js.Object {
    var DryRun: Boolean
    var MaxResults: Integer
    var InstanceIds: InstanceIdStringList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeClassicLinkInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeClassicLinkInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClassicLinkInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeClassicLinkInstances.</p>
   */
  @js.native
  trait DescribeClassicLinkInstancesResult extends js.Object {
    var Instances: ClassicLinkInstanceList
    var NextToken: String
  }

  object DescribeClassicLinkInstancesResult {
    def apply(
      Instances: js.UndefOr[ClassicLinkInstanceList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeClassicLinkInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeClassicLinkInstancesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeConversionTasks.</p>
   */
  @js.native
  trait DescribeConversionTasksRequest extends js.Object {
    var DryRun: Boolean
    var ConversionTaskIds: ConversionIdStringList
  }

  object DescribeConversionTasksRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ConversionTaskIds: js.UndefOr[ConversionIdStringList] = js.undefined
    ): DescribeConversionTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ConversionTaskIds" -> ConversionTaskIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConversionTasksRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeConversionTasks.</p>
   */
  @js.native
  trait DescribeConversionTasksResult extends js.Object {
    var ConversionTasks: DescribeConversionTaskList
  }

  object DescribeConversionTasksResult {
    def apply(
      ConversionTasks: js.UndefOr[DescribeConversionTaskList] = js.undefined
    ): DescribeConversionTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConversionTasks" -> ConversionTasks.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConversionTasksResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeCustomerGateways.</p>
   */
  @js.native
  trait DescribeCustomerGatewaysRequest extends js.Object {
    var DryRun: Boolean
    var CustomerGatewayIds: CustomerGatewayIdStringList
    var Filters: FilterList
  }

  object DescribeCustomerGatewaysRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CustomerGatewayIds: js.UndefOr[CustomerGatewayIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeCustomerGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("CustomerGatewayIds" -> CustomerGatewayIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCustomerGatewaysRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeCustomerGateways.</p>
   */
  @js.native
  trait DescribeCustomerGatewaysResult extends js.Object {
    var CustomerGateways: CustomerGatewayList
  }

  object DescribeCustomerGatewaysResult {
    def apply(
      CustomerGateways: js.UndefOr[CustomerGatewayList] = js.undefined
    ): DescribeCustomerGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CustomerGateways" -> CustomerGateways.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCustomerGatewaysResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeDhcpOptions.</p>
   */
  @js.native
  trait DescribeDhcpOptionsRequest extends js.Object {
    var DryRun: Boolean
    var DhcpOptionsIds: DhcpOptionsIdStringList
    var Filters: FilterList
  }

  object DescribeDhcpOptionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DhcpOptionsIds: js.UndefOr[DhcpOptionsIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeDhcpOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("DhcpOptionsIds" -> DhcpOptionsIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDhcpOptionsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeDhcpOptions.</p>
   */
  @js.native
  trait DescribeDhcpOptionsResult extends js.Object {
    var DhcpOptions: DhcpOptionsList
  }

  object DescribeDhcpOptionsResult {
    def apply(
      DhcpOptions: js.UndefOr[DhcpOptionsList] = js.undefined
    ): DescribeDhcpOptionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DhcpOptions" -> DhcpOptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDhcpOptionsResult]
    }
  }

  @js.native
  trait DescribeEgressOnlyInternetGatewaysRequest extends js.Object {
    var DryRun: Boolean
    var EgressOnlyInternetGatewayIds: EgressOnlyInternetGatewayIdList
    var MaxResults: Integer
    var NextToken: String
  }

  object DescribeEgressOnlyInternetGatewaysRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      EgressOnlyInternetGatewayIds: js.UndefOr[EgressOnlyInternetGatewayIdList] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeEgressOnlyInternetGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("EgressOnlyInternetGatewayIds" -> EgressOnlyInternetGatewayIds.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEgressOnlyInternetGatewaysRequest]
    }
  }

  @js.native
  trait DescribeEgressOnlyInternetGatewaysResult extends js.Object {
    var EgressOnlyInternetGateways: EgressOnlyInternetGatewayList
    var NextToken: String
  }

  object DescribeEgressOnlyInternetGatewaysResult {
    def apply(
      EgressOnlyInternetGateways: js.UndefOr[EgressOnlyInternetGatewayList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeEgressOnlyInternetGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EgressOnlyInternetGateways" -> EgressOnlyInternetGateways.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEgressOnlyInternetGatewaysResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeExportTasks.</p>
   */
  @js.native
  trait DescribeExportTasksRequest extends js.Object {
    var ExportTaskIds: ExportTaskIdStringList
  }

  object DescribeExportTasksRequest {
    def apply(
      ExportTaskIds: js.UndefOr[ExportTaskIdStringList] = js.undefined
    ): DescribeExportTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExportTaskIds" -> ExportTaskIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeExportTasks.</p>
   */
  @js.native
  trait DescribeExportTasksResult extends js.Object {
    var ExportTasks: ExportTaskList
  }

  object DescribeExportTasksResult {
    def apply(
      ExportTasks: js.UndefOr[ExportTaskList] = js.undefined
    ): DescribeExportTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExportTasks" -> ExportTasks.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeExportTasksResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeFlowLogs.</p>
   */
  @js.native
  trait DescribeFlowLogsRequest extends js.Object {
    var FlowLogIds: ValueStringList
    var Filter: FilterList
    var NextToken: String
    var MaxResults: Integer
  }

  object DescribeFlowLogsRequest {
    def apply(
      FlowLogIds: js.UndefOr[ValueStringList] = js.undefined,
      Filter: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined
    ): DescribeFlowLogsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FlowLogIds" -> FlowLogIds.map { x => x: js.Any }),
        ("Filter" -> Filter.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFlowLogsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeFlowLogs.</p>
   */
  @js.native
  trait DescribeFlowLogsResult extends js.Object {
    var FlowLogs: FlowLogSet
    var NextToken: String
  }

  object DescribeFlowLogsResult {
    def apply(
      FlowLogs: js.UndefOr[FlowLogSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeFlowLogsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FlowLogs" -> FlowLogs.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFlowLogsResult]
    }
  }

  @js.native
  trait DescribeHostReservationOfferingsRequest extends js.Object {
    var MaxDuration: Integer
    var MaxResults: Integer
    var OfferingId: String
    var MinDuration: Integer
    var Filter: FilterList
    var NextToken: String
  }

  object DescribeHostReservationOfferingsRequest {
    def apply(
      MaxDuration: js.UndefOr[Integer] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined,
      MinDuration: js.UndefOr[Integer] = js.undefined,
      Filter: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeHostReservationOfferingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxDuration" -> MaxDuration.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("OfferingId" -> OfferingId.map { x => x: js.Any }),
        ("MinDuration" -> MinDuration.map { x => x: js.Any }),
        ("Filter" -> Filter.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostReservationOfferingsRequest]
    }
  }

  @js.native
  trait DescribeHostReservationOfferingsResult extends js.Object {
    var OfferingSet: HostOfferingSet
    var NextToken: String
  }

  object DescribeHostReservationOfferingsResult {
    def apply(
      OfferingSet: js.UndefOr[HostOfferingSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeHostReservationOfferingsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OfferingSet" -> OfferingSet.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostReservationOfferingsResult]
    }
  }

  @js.native
  trait DescribeHostReservationsRequest extends js.Object {
    var HostReservationIdSet: HostReservationIdSet
    var Filter: FilterList
    var MaxResults: Integer
    var NextToken: String
  }

  object DescribeHostReservationsRequest {
    def apply(
      HostReservationIdSet: js.UndefOr[HostReservationIdSet] = js.undefined,
      Filter: js.UndefOr[FilterList] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeHostReservationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostReservationIdSet" -> HostReservationIdSet.map { x => x: js.Any }),
        ("Filter" -> Filter.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostReservationsRequest]
    }
  }

  @js.native
  trait DescribeHostReservationsResult extends js.Object {
    var HostReservationSet: HostReservationSet
    var NextToken: String
  }

  object DescribeHostReservationsResult {
    def apply(
      HostReservationSet: js.UndefOr[HostReservationSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeHostReservationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostReservationSet" -> HostReservationSet.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostReservationsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeHosts.</p>
   */
  @js.native
  trait DescribeHostsRequest extends js.Object {
    var HostIds: RequestHostIdList
    var NextToken: String
    var MaxResults: Integer
    var Filter: FilterList
  }

  object DescribeHostsRequest {
    def apply(
      HostIds: js.UndefOr[RequestHostIdList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      Filter: js.UndefOr[FilterList] = js.undefined
    ): DescribeHostsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostIds" -> HostIds.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("Filter" -> Filter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeHosts.</p>
   */
  @js.native
  trait DescribeHostsResult extends js.Object {
    var Hosts: HostList
    var NextToken: String
  }

  object DescribeHostsResult {
    def apply(
      Hosts: js.UndefOr[HostList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeHostsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Hosts" -> Hosts.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeHostsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeIdFormat.</p>
   */
  @js.native
  trait DescribeIdFormatRequest extends js.Object {
    var Resource: String
  }

  object DescribeIdFormatRequest {
    def apply(
      Resource: js.UndefOr[String] = js.undefined
    ): DescribeIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Resource" -> Resource.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdFormatRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeIdFormat.</p>
   */
  @js.native
  trait DescribeIdFormatResult extends js.Object {
    var Statuses: IdFormatList
  }

  object DescribeIdFormatResult {
    def apply(
      Statuses: js.UndefOr[IdFormatList] = js.undefined
    ): DescribeIdFormatResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Statuses" -> Statuses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdFormatResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeIdentityIdFormat.</p>
   */
  @js.native
  trait DescribeIdentityIdFormatRequest extends js.Object {
    var Resource: String
    var PrincipalArn: String
  }

  object DescribeIdentityIdFormatRequest {
    def apply(
      Resource: js.UndefOr[String] = js.undefined,
      PrincipalArn: js.UndefOr[String] = js.undefined
    ): DescribeIdentityIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Resource" -> Resource.map { x => x: js.Any }),
        ("PrincipalArn" -> PrincipalArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityIdFormatRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeIdentityIdFormat.</p>
   */
  @js.native
  trait DescribeIdentityIdFormatResult extends js.Object {
    var Statuses: IdFormatList
  }

  object DescribeIdentityIdFormatResult {
    def apply(
      Statuses: js.UndefOr[IdFormatList] = js.undefined
    ): DescribeIdentityIdFormatResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Statuses" -> Statuses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityIdFormatResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeImageAttribute.</p>
   */
  @js.native
  trait DescribeImageAttributeRequest extends js.Object {
    var DryRun: Boolean
    var ImageId: String
    var Attribute: ImageAttributeName
  }

  object DescribeImageAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[ImageAttributeName] = js.undefined
    ): DescribeImageAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImageAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for DescribeImages.</p>
   */
  @js.native
  trait DescribeImagesRequest extends js.Object {
    var DryRun: Boolean
    var Owners: OwnerStringList
    var ImageIds: ImageIdStringList
    var Filters: FilterList
    var ExecutableUsers: ExecutableByStringList
  }

  object DescribeImagesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Owners: js.UndefOr[OwnerStringList] = js.undefined,
      ImageIds: js.UndefOr[ImageIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ExecutableUsers: js.UndefOr[ExecutableByStringList] = js.undefined
    ): DescribeImagesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Owners" -> Owners.map { x => x: js.Any }),
        ("ImageIds" -> ImageIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("ExecutableUsers" -> ExecutableUsers.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeImages.</p>
   */
  @js.native
  trait DescribeImagesResult extends js.Object {
    var Images: ImageList
  }

  object DescribeImagesResult {
    def apply(
      Images: js.UndefOr[ImageList] = js.undefined
    ): DescribeImagesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Images" -> Images.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImagesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeImportImageTasks.</p>
   */
  @js.native
  trait DescribeImportImageTasksRequest extends js.Object {
    var DryRun: Boolean
    var MaxResults: Integer
    var ImportTaskIds: ImportTaskIdList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeImportImageTasksRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      ImportTaskIds: js.UndefOr[ImportTaskIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeImportImageTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("ImportTaskIds" -> ImportTaskIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportImageTasksRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeImportImageTasks.</p>
   */
  @js.native
  trait DescribeImportImageTasksResult extends js.Object {
    var ImportImageTasks: ImportImageTaskList
    var NextToken: String
  }

  object DescribeImportImageTasksResult {
    def apply(
      ImportImageTasks: js.UndefOr[ImportImageTaskList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeImportImageTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ImportImageTasks" -> ImportImageTasks.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportImageTasksResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeImportSnapshotTasks.</p>
   */
  @js.native
  trait DescribeImportSnapshotTasksRequest extends js.Object {
    var DryRun: Boolean
    var MaxResults: Integer
    var ImportTaskIds: ImportTaskIdList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeImportSnapshotTasksRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      ImportTaskIds: js.UndefOr[ImportTaskIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeImportSnapshotTasksRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("ImportTaskIds" -> ImportTaskIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportSnapshotTasksRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeImportSnapshotTasks.</p>
   */
  @js.native
  trait DescribeImportSnapshotTasksResult extends js.Object {
    var ImportSnapshotTasks: ImportSnapshotTaskList
    var NextToken: String
  }

  object DescribeImportSnapshotTasksResult {
    def apply(
      ImportSnapshotTasks: js.UndefOr[ImportSnapshotTaskList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeImportSnapshotTasksResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ImportSnapshotTasks" -> ImportSnapshotTasks.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeImportSnapshotTasksResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeInstanceAttribute.</p>
   */
  @js.native
  trait DescribeInstanceAttributeRequest extends js.Object {
    var DryRun: Boolean
    var InstanceId: String
    var Attribute: InstanceAttributeName
  }

  object DescribeInstanceAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[InstanceAttributeName] = js.undefined
    ): DescribeInstanceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for DescribeInstanceStatus.</p>
   */
  @js.native
  trait DescribeInstanceStatusRequest extends js.Object {
    var DryRun: Boolean
    var MaxResults: Integer
    var IncludeAllInstances: Boolean
    var InstanceIds: InstanceIdStringList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeInstanceStatusRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      IncludeAllInstances: js.UndefOr[Boolean] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeInstanceStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("IncludeAllInstances" -> IncludeAllInstances.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceStatusRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeInstanceStatus.</p>
   */
  @js.native
  trait DescribeInstanceStatusResult extends js.Object {
    var InstanceStatuses: InstanceStatusList
    var NextToken: String
  }

  object DescribeInstanceStatusResult {
    def apply(
      InstanceStatuses: js.UndefOr[InstanceStatusList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeInstanceStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceStatuses" -> InstanceStatuses.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstanceStatusResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeInstances.</p>
   */
  @js.native
  trait DescribeInstancesRequest extends js.Object {
    var DryRun: Boolean
    var MaxResults: Integer
    var InstanceIds: InstanceIdStringList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeInstances.</p>
   */
  @js.native
  trait DescribeInstancesResult extends js.Object {
    var Reservations: ReservationList
    var NextToken: String
  }

  object DescribeInstancesResult {
    def apply(
      Reservations: js.UndefOr[ReservationList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Reservations" -> Reservations.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeInternetGateways.</p>
   */
  @js.native
  trait DescribeInternetGatewaysRequest extends js.Object {
    var DryRun: Boolean
    var InternetGatewayIds: ValueStringList
    var Filters: FilterList
  }

  object DescribeInternetGatewaysRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InternetGatewayIds: js.UndefOr[ValueStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeInternetGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InternetGatewayIds" -> InternetGatewayIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInternetGatewaysRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeInternetGateways.</p>
   */
  @js.native
  trait DescribeInternetGatewaysResult extends js.Object {
    var InternetGateways: InternetGatewayList
  }

  object DescribeInternetGatewaysResult {
    def apply(
      InternetGateways: js.UndefOr[InternetGatewayList] = js.undefined
    ): DescribeInternetGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InternetGateways" -> InternetGateways.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInternetGatewaysResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeKeyPairs.</p>
   */
  @js.native
  trait DescribeKeyPairsRequest extends js.Object {
    var DryRun: Boolean
    var KeyNames: KeyNameStringList
    var Filters: FilterList
  }

  object DescribeKeyPairsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      KeyNames: js.UndefOr[KeyNameStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeKeyPairsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("KeyNames" -> KeyNames.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyPairsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeKeyPairs.</p>
   */
  @js.native
  trait DescribeKeyPairsResult extends js.Object {
    var KeyPairs: KeyPairList
  }

  object DescribeKeyPairsResult {
    def apply(
      KeyPairs: js.UndefOr[KeyPairList] = js.undefined
    ): DescribeKeyPairsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyPairs" -> KeyPairs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeKeyPairsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeMovingAddresses.</p>
   */
  @js.native
  trait DescribeMovingAddressesRequest extends js.Object {
    var DryRun: Boolean
    var PublicIps: ValueStringList
    var MaxResults: Integer
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeMovingAddressesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PublicIps: js.UndefOr[ValueStringList] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeMovingAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("PublicIps" -> PublicIps.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMovingAddressesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeMovingAddresses.</p>
   */
  @js.native
  trait DescribeMovingAddressesResult extends js.Object {
    var MovingAddressStatuses: MovingAddressStatusSet
    var NextToken: String
  }

  object DescribeMovingAddressesResult {
    def apply(
      MovingAddressStatuses: js.UndefOr[MovingAddressStatusSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeMovingAddressesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MovingAddressStatuses" -> MovingAddressStatuses.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMovingAddressesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeNatGateways.</p>
   */
  @js.native
  trait DescribeNatGatewaysRequest extends js.Object {
    var NatGatewayIds: ValueStringList
    var Filter: FilterList
    var MaxResults: Integer
    var NextToken: String
  }

  object DescribeNatGatewaysRequest {
    def apply(
      NatGatewayIds: js.UndefOr[ValueStringList] = js.undefined,
      Filter: js.UndefOr[FilterList] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeNatGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NatGatewayIds" -> NatGatewayIds.map { x => x: js.Any }),
        ("Filter" -> Filter.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNatGatewaysRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeNatGateways.</p>
   */
  @js.native
  trait DescribeNatGatewaysResult extends js.Object {
    var NatGateways: NatGatewayList
    var NextToken: String
  }

  object DescribeNatGatewaysResult {
    def apply(
      NatGateways: js.UndefOr[NatGatewayList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeNatGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NatGateways" -> NatGateways.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNatGatewaysResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeNetworkAcls.</p>
   */
  @js.native
  trait DescribeNetworkAclsRequest extends js.Object {
    var DryRun: Boolean
    var NetworkAclIds: ValueStringList
    var Filters: FilterList
  }

  object DescribeNetworkAclsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkAclIds: js.UndefOr[ValueStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeNetworkAclsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("NetworkAclIds" -> NetworkAclIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkAclsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeNetworkAcls.</p>
   */
  @js.native
  trait DescribeNetworkAclsResult extends js.Object {
    var NetworkAcls: NetworkAclList
  }

  object DescribeNetworkAclsResult {
    def apply(
      NetworkAcls: js.UndefOr[NetworkAclList] = js.undefined
    ): DescribeNetworkAclsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkAcls" -> NetworkAcls.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkAclsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeNetworkInterfaceAttribute.</p>
   */
  @js.native
  trait DescribeNetworkInterfaceAttributeRequest extends js.Object {
    var DryRun: Boolean
    var NetworkInterfaceId: String
    var Attribute: NetworkInterfaceAttribute
  }

  object DescribeNetworkInterfaceAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[NetworkInterfaceAttribute] = js.undefined
    ): DescribeNetworkInterfaceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfaceAttributeRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeNetworkInterfaceAttribute.</p>
   */
  @js.native
  trait DescribeNetworkInterfaceAttributeResult extends js.Object {
    var Description: AttributeValue
    var Groups: GroupIdentifierList
    var Attachment: NetworkInterfaceAttachment
    var NetworkInterfaceId: String
    var SourceDestCheck: AttributeBooleanValue
  }

  object DescribeNetworkInterfaceAttributeResult {
    def apply(
      Description: js.UndefOr[AttributeValue] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
    ): DescribeNetworkInterfaceAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("Attachment" -> Attachment.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("SourceDestCheck" -> SourceDestCheck.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfaceAttributeResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeNetworkInterfaces.</p>
   */
  @js.native
  trait DescribeNetworkInterfacesRequest extends js.Object {
    var DryRun: Boolean
    var NetworkInterfaceIds: NetworkInterfaceIdList
    var Filters: FilterList
  }

  object DescribeNetworkInterfacesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeNetworkInterfacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("NetworkInterfaceIds" -> NetworkInterfaceIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfacesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeNetworkInterfaces.</p>
   */
  @js.native
  trait DescribeNetworkInterfacesResult extends js.Object {
    var NetworkInterfaces: NetworkInterfaceList
  }

  object DescribeNetworkInterfacesResult {
    def apply(
      NetworkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined
    ): DescribeNetworkInterfacesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaces" -> NetworkInterfaces.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeNetworkInterfacesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribePlacementGroups.</p>
   */
  @js.native
  trait DescribePlacementGroupsRequest extends js.Object {
    var DryRun: Boolean
    var GroupNames: PlacementGroupStringList
    var Filters: FilterList
  }

  object DescribePlacementGroupsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupNames: js.UndefOr[PlacementGroupStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribePlacementGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("GroupNames" -> GroupNames.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlacementGroupsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribePlacementGroups.</p>
   */
  @js.native
  trait DescribePlacementGroupsResult extends js.Object {
    var PlacementGroups: PlacementGroupList
  }

  object DescribePlacementGroupsResult {
    def apply(
      PlacementGroups: js.UndefOr[PlacementGroupList] = js.undefined
    ): DescribePlacementGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PlacementGroups" -> PlacementGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlacementGroupsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribePrefixLists.</p>
   */
  @js.native
  trait DescribePrefixListsRequest extends js.Object {
    var DryRun: Boolean
    var PrefixListIds: ValueStringList
    var MaxResults: Integer
    var Filters: FilterList
    var NextToken: String
  }

  object DescribePrefixListsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PrefixListIds: js.UndefOr[ValueStringList] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribePrefixListsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("PrefixListIds" -> PrefixListIds.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePrefixListsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribePrefixLists.</p>
   */
  @js.native
  trait DescribePrefixListsResult extends js.Object {
    var PrefixLists: PrefixListSet
    var NextToken: String
  }

  object DescribePrefixListsResult {
    def apply(
      PrefixLists: js.UndefOr[PrefixListSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribePrefixListsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrefixLists" -> PrefixLists.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePrefixListsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeRegions.</p>
   */
  @js.native
  trait DescribeRegionsRequest extends js.Object {
    var DryRun: Boolean
    var RegionNames: RegionNameStringList
    var Filters: FilterList
  }

  object DescribeRegionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      RegionNames: js.UndefOr[RegionNameStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeRegionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("RegionNames" -> RegionNames.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRegionsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeRegions.</p>
   */
  @js.native
  trait DescribeRegionsResult extends js.Object {
    var Regions: RegionList
  }

  object DescribeRegionsResult {
    def apply(
      Regions: js.UndefOr[RegionList] = js.undefined
    ): DescribeRegionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Regions" -> Regions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRegionsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeReservedInstancesListings.</p>
   */
  @js.native
  trait DescribeReservedInstancesListingsRequest extends js.Object {
    var ReservedInstancesId: String
    var ReservedInstancesListingId: String
    var Filters: FilterList
  }

  object DescribeReservedInstancesListingsRequest {
    def apply(
      ReservedInstancesId: js.UndefOr[String] = js.undefined,
      ReservedInstancesListingId: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeReservedInstancesListingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesId" -> ReservedInstancesId.map { x => x: js.Any }),
        ("ReservedInstancesListingId" -> ReservedInstancesListingId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesListingsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeReservedInstancesListings.</p>
   */
  @js.native
  trait DescribeReservedInstancesListingsResult extends js.Object {
    var ReservedInstancesListings: ReservedInstancesListingList
  }

  object DescribeReservedInstancesListingsResult {
    def apply(
      ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.undefined
    ): DescribeReservedInstancesListingsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesListings" -> ReservedInstancesListings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesListingsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeReservedInstancesModifications.</p>
   */
  @js.native
  trait DescribeReservedInstancesModificationsRequest extends js.Object {
    var ReservedInstancesModificationIds: ReservedInstancesModificationIdStringList
    var NextToken: String
    var Filters: FilterList
  }

  object DescribeReservedInstancesModificationsRequest {
    def apply(
      ReservedInstancesModificationIds: js.UndefOr[ReservedInstancesModificationIdStringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeReservedInstancesModificationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesModificationIds" -> ReservedInstancesModificationIds.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesModificationsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeReservedInstancesModifications.</p>
   */
  @js.native
  trait DescribeReservedInstancesModificationsResult extends js.Object {
    var ReservedInstancesModifications: ReservedInstancesModificationList
    var NextToken: String
  }

  object DescribeReservedInstancesModificationsResult {
    def apply(
      ReservedInstancesModifications: js.UndefOr[ReservedInstancesModificationList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeReservedInstancesModificationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesModifications" -> ReservedInstancesModifications.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesModificationsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeReservedInstancesOfferings.</p>
   */
  @js.native
  trait DescribeReservedInstancesOfferingsRequest extends js.Object {
    var DryRun: Boolean
    var MaxDuration: Long
    var OfferingClass: OfferingClassType
    var MaxInstanceCount: Integer
    var ReservedInstancesOfferingIds: ReservedInstancesOfferingIdStringList
    var MaxResults: Integer
    var IncludeMarketplace: Boolean
    var AvailabilityZone: String
    var OfferingType: OfferingTypeValues
    var InstanceType: InstanceType
    var MinDuration: Long
    var Filters: FilterList
    var ProductDescription: RIProductDescription
    var NextToken: String
    var InstanceTenancy: Tenancy
  }

  object DescribeReservedInstancesOfferingsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxDuration: js.UndefOr[Long] = js.undefined,
      OfferingClass: js.UndefOr[OfferingClassType] = js.undefined,
      MaxInstanceCount: js.UndefOr[Integer] = js.undefined,
      ReservedInstancesOfferingIds: js.UndefOr[ReservedInstancesOfferingIdStringList] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      IncludeMarketplace: js.UndefOr[Boolean] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      MinDuration: js.UndefOr[Long] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined
    ): DescribeReservedInstancesOfferingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxDuration" -> MaxDuration.map { x => x: js.Any }),
        ("OfferingClass" -> OfferingClass.map { x => x: js.Any }),
        ("MaxInstanceCount" -> MaxInstanceCount.map { x => x: js.Any }),
        ("ReservedInstancesOfferingIds" -> ReservedInstancesOfferingIds.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("IncludeMarketplace" -> IncludeMarketplace.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("MinDuration" -> MinDuration.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("InstanceTenancy" -> InstanceTenancy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesOfferingsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeReservedInstancesOfferings.</p>
   */
  @js.native
  trait DescribeReservedInstancesOfferingsResult extends js.Object {
    var ReservedInstancesOfferings: ReservedInstancesOfferingList
    var NextToken: String
  }

  object DescribeReservedInstancesOfferingsResult {
    def apply(
      ReservedInstancesOfferings: js.UndefOr[ReservedInstancesOfferingList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeReservedInstancesOfferingsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesOfferings" -> ReservedInstancesOfferings.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesOfferingsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeReservedInstances.</p>
   */
  @js.native
  trait DescribeReservedInstancesRequest extends js.Object {
    var DryRun: Boolean
    var OfferingClass: OfferingClassType
    var OfferingType: OfferingTypeValues
    var Filters: FilterList
    var ReservedInstancesIds: ReservedInstancesIdStringList
  }

  object DescribeReservedInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      OfferingClass: js.UndefOr[OfferingClassType] = js.undefined,
      OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ReservedInstancesIds: js.UndefOr[ReservedInstancesIdStringList] = js.undefined
    ): DescribeReservedInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("OfferingClass" -> OfferingClass.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("ReservedInstancesIds" -> ReservedInstancesIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesRequest]
    }
  }

  /**
   * <p>Contains the output for DescribeReservedInstances.</p>
   */
  @js.native
  trait DescribeReservedInstancesResult extends js.Object {
    var ReservedInstances: ReservedInstancesList
  }

  object DescribeReservedInstancesResult {
    def apply(
      ReservedInstances: js.UndefOr[ReservedInstancesList] = js.undefined
    ): DescribeReservedInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstances" -> ReservedInstances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedInstancesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeRouteTables.</p>
   */
  @js.native
  trait DescribeRouteTablesRequest extends js.Object {
    var DryRun: Boolean
    var RouteTableIds: ValueStringList
    var Filters: FilterList
  }

  object DescribeRouteTablesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      RouteTableIds: js.UndefOr[ValueStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeRouteTablesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("RouteTableIds" -> RouteTableIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRouteTablesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeRouteTables.</p>
   */
  @js.native
  trait DescribeRouteTablesResult extends js.Object {
    var RouteTables: RouteTableList
  }

  object DescribeRouteTablesResult {
    def apply(
      RouteTables: js.UndefOr[RouteTableList] = js.undefined
    ): DescribeRouteTablesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RouteTables" -> RouteTables.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRouteTablesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeScheduledInstanceAvailability.</p>
   */
  @js.native
  trait DescribeScheduledInstanceAvailabilityRequest extends js.Object {
    var DryRun: Boolean
    var MaxSlotDurationInHours: Integer
    var MaxResults: Integer
    var MinSlotDurationInHours: Integer
    var FirstSlotStartTimeRange: SlotDateTimeRangeRequest
    var Filters: FilterList
    var NextToken: String
    var Recurrence: ScheduledInstanceRecurrenceRequest
  }

  object DescribeScheduledInstanceAvailabilityRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxSlotDurationInHours: js.UndefOr[Integer] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      MinSlotDurationInHours: js.UndefOr[Integer] = js.undefined,
      FirstSlotStartTimeRange: js.UndefOr[SlotDateTimeRangeRequest] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Recurrence: js.UndefOr[ScheduledInstanceRecurrenceRequest] = js.undefined
    ): DescribeScheduledInstanceAvailabilityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxSlotDurationInHours" -> MaxSlotDurationInHours.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("MinSlotDurationInHours" -> MinSlotDurationInHours.map { x => x: js.Any }),
        ("FirstSlotStartTimeRange" -> FirstSlotStartTimeRange.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("Recurrence" -> Recurrence.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledInstanceAvailabilityRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeScheduledInstanceAvailability.</p>
   */
  @js.native
  trait DescribeScheduledInstanceAvailabilityResult extends js.Object {
    var NextToken: String
    var ScheduledInstanceAvailabilitySet: ScheduledInstanceAvailabilitySet
  }

  object DescribeScheduledInstanceAvailabilityResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      ScheduledInstanceAvailabilitySet: js.UndefOr[ScheduledInstanceAvailabilitySet] = js.undefined
    ): DescribeScheduledInstanceAvailabilityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("ScheduledInstanceAvailabilitySet" -> ScheduledInstanceAvailabilitySet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledInstanceAvailabilityResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeScheduledInstances.</p>
   */
  @js.native
  trait DescribeScheduledInstancesRequest extends js.Object {
    var DryRun: Boolean
    var ScheduledInstanceIds: ScheduledInstanceIdRequestSet
    var MaxResults: Integer
    var SlotStartTimeRange: SlotStartTimeRangeRequest
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeScheduledInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ScheduledInstanceIds: js.UndefOr[ScheduledInstanceIdRequestSet] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      SlotStartTimeRange: js.UndefOr[SlotStartTimeRangeRequest] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeScheduledInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ScheduledInstanceIds" -> ScheduledInstanceIds.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("SlotStartTimeRange" -> SlotStartTimeRange.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeScheduledInstances.</p>
   */
  @js.native
  trait DescribeScheduledInstancesResult extends js.Object {
    var NextToken: String
    var ScheduledInstanceSet: ScheduledInstanceSet
  }

  object DescribeScheduledInstancesResult {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined,
      ScheduledInstanceSet: js.UndefOr[ScheduledInstanceSet] = js.undefined
    ): DescribeScheduledInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("ScheduledInstanceSet" -> ScheduledInstanceSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScheduledInstancesResult]
    }
  }

  @js.native
  trait DescribeSecurityGroupReferencesRequest extends js.Object {
    var DryRun: Boolean
    var GroupId: GroupIds
  }

  object DescribeSecurityGroupReferencesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupId: js.UndefOr[GroupIds] = js.undefined
    ): DescribeSecurityGroupReferencesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityGroupReferencesRequest]
    }
  }

  @js.native
  trait DescribeSecurityGroupReferencesResult extends js.Object {
    var SecurityGroupReferenceSet: SecurityGroupReferences
  }

  object DescribeSecurityGroupReferencesResult {
    def apply(
      SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences] = js.undefined
    ): DescribeSecurityGroupReferencesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SecurityGroupReferenceSet" -> SecurityGroupReferenceSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityGroupReferencesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSecurityGroups.</p>
   */
  @js.native
  trait DescribeSecurityGroupsRequest extends js.Object {
    var DryRun: Boolean
    var GroupNames: GroupNameStringList
    var GroupIds: GroupIdStringList
    var Filters: FilterList
  }

  object DescribeSecurityGroupsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      GroupNames: js.UndefOr[GroupNameStringList] = js.undefined,
      GroupIds: js.UndefOr[GroupIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeSecurityGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("GroupNames" -> GroupNames.map { x => x: js.Any }),
        ("GroupIds" -> GroupIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityGroupsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSecurityGroups.</p>
   */
  @js.native
  trait DescribeSecurityGroupsResult extends js.Object {
    var SecurityGroups: SecurityGroupList
  }

  object DescribeSecurityGroupsResult {
    def apply(
      SecurityGroups: js.UndefOr[SecurityGroupList] = js.undefined
    ): DescribeSecurityGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSecurityGroupsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSnapshotAttribute.</p>
   */
  @js.native
  trait DescribeSnapshotAttributeRequest extends js.Object {
    var DryRun: Boolean
    var SnapshotId: String
    var Attribute: SnapshotAttributeName
  }

  object DescribeSnapshotAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[SnapshotAttributeName] = js.undefined
    ): DescribeSnapshotAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotAttributeRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSnapshotAttribute.</p>
   */
  @js.native
  trait DescribeSnapshotAttributeResult extends js.Object {
    var SnapshotId: String
    var CreateVolumePermissions: CreateVolumePermissionList
    var ProductCodes: ProductCodeList
  }

  object DescribeSnapshotAttributeResult {
    def apply(
      SnapshotId: js.UndefOr[String] = js.undefined,
      CreateVolumePermissions: js.UndefOr[CreateVolumePermissionList] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
    ): DescribeSnapshotAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("CreateVolumePermissions" -> CreateVolumePermissions.map { x => x: js.Any }),
        ("ProductCodes" -> ProductCodes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotAttributeResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSnapshots.</p>
   */
  @js.native
  trait DescribeSnapshotsRequest extends js.Object {
    var DryRun: Boolean
    var OwnerIds: OwnerStringList
    var MaxResults: Integer
    var RestorableByUserIds: RestorableByStringList
    var SnapshotIds: SnapshotIdStringList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeSnapshotsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      OwnerIds: js.UndefOr[OwnerStringList] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      RestorableByUserIds: js.UndefOr[RestorableByStringList] = js.undefined,
      SnapshotIds: js.UndefOr[SnapshotIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeSnapshotsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("OwnerIds" -> OwnerIds.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("RestorableByUserIds" -> RestorableByUserIds.map { x => x: js.Any }),
        ("SnapshotIds" -> SnapshotIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSnapshots.</p>
   */
  @js.native
  trait DescribeSnapshotsResult extends js.Object {
    var Snapshots: SnapshotList
    var NextToken: String
  }

  object DescribeSnapshotsResult {
    def apply(
      Snapshots: js.UndefOr[SnapshotList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeSnapshotsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Snapshots" -> Snapshots.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSnapshotsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotDatafeedSubscription.</p>
   */
  @js.native
  trait DescribeSpotDatafeedSubscriptionRequest extends js.Object {
    var DryRun: Boolean
  }

  object DescribeSpotDatafeedSubscriptionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined
    ): DescribeSpotDatafeedSubscriptionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotDatafeedSubscriptionRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotDatafeedSubscription.</p>
   */
  @js.native
  trait DescribeSpotDatafeedSubscriptionResult extends js.Object {
    var SpotDatafeedSubscription: SpotDatafeedSubscription
  }

  object DescribeSpotDatafeedSubscriptionResult {
    def apply(
      SpotDatafeedSubscription: js.UndefOr[SpotDatafeedSubscription] = js.undefined
    ): DescribeSpotDatafeedSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotDatafeedSubscription" -> SpotDatafeedSubscription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotDatafeedSubscriptionResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotFleetInstances.</p>
   */
  @js.native
  trait DescribeSpotFleetInstancesRequest extends js.Object {
    var DryRun: Boolean
    var SpotFleetRequestId: String
    var NextToken: String
    var MaxResults: Integer
  }

  object DescribeSpotFleetInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined
    ): DescribeSpotFleetInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SpotFleetRequestId" -> SpotFleetRequestId.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotFleetInstances.</p>
   */
  @js.native
  trait DescribeSpotFleetInstancesResponse extends js.Object {
    var SpotFleetRequestId: String
    var ActiveInstances: ActiveInstanceSet
    var NextToken: String
  }

  object DescribeSpotFleetInstancesResponse {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      ActiveInstances: js.UndefOr[ActiveInstanceSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeSpotFleetInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotFleetRequestId" -> SpotFleetRequestId.map { x => x: js.Any }),
        ("ActiveInstances" -> ActiveInstances.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetInstancesResponse]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotFleetRequestHistory.</p>
   */
  @js.native
  trait DescribeSpotFleetRequestHistoryRequest extends js.Object {
    var SpotFleetRequestId: String
    var DryRun: Boolean
    var MaxResults: Integer
    var EventType: EventType
    var StartTime: DateTime
    var NextToken: String
  }

  object DescribeSpotFleetRequestHistoryRequest {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      EventType: js.UndefOr[EventType] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeSpotFleetRequestHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotFleetRequestId" -> SpotFleetRequestId.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("EventType" -> EventType.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetRequestHistoryRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotFleetRequestHistory.</p>
   */
  @js.native
  trait DescribeSpotFleetRequestHistoryResponse extends js.Object {
    var LastEvaluatedTime: DateTime
    var SpotFleetRequestId: String
    var HistoryRecords: HistoryRecords
    var StartTime: DateTime
    var NextToken: String
  }

  object DescribeSpotFleetRequestHistoryResponse {
    def apply(
      LastEvaluatedTime: js.UndefOr[DateTime] = js.undefined,
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      HistoryRecords: js.UndefOr[HistoryRecords] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeSpotFleetRequestHistoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LastEvaluatedTime" -> LastEvaluatedTime.map { x => x: js.Any }),
        ("SpotFleetRequestId" -> SpotFleetRequestId.map { x => x: js.Any }),
        ("HistoryRecords" -> HistoryRecords.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetRequestHistoryResponse]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotFleetRequests.</p>
   */
  @js.native
  trait DescribeSpotFleetRequestsRequest extends js.Object {
    var DryRun: Boolean
    var SpotFleetRequestIds: ValueStringList
    var NextToken: String
    var MaxResults: Integer
  }

  object DescribeSpotFleetRequestsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotFleetRequestIds: js.UndefOr[ValueStringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined
    ): DescribeSpotFleetRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SpotFleetRequestIds" -> SpotFleetRequestIds.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetRequestsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotFleetRequests.</p>
   */
  @js.native
  trait DescribeSpotFleetRequestsResponse extends js.Object {
    var SpotFleetRequestConfigs: SpotFleetRequestConfigSet
    var NextToken: String
  }

  object DescribeSpotFleetRequestsResponse {
    def apply(
      SpotFleetRequestConfigs: js.UndefOr[SpotFleetRequestConfigSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeSpotFleetRequestsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotFleetRequestConfigs" -> SpotFleetRequestConfigs.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotFleetRequestsResponse]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotInstanceRequests.</p>
   */
  @js.native
  trait DescribeSpotInstanceRequestsRequest extends js.Object {
    var DryRun: Boolean
    var SpotInstanceRequestIds: SpotInstanceRequestIdList
    var Filters: FilterList
  }

  object DescribeSpotInstanceRequestsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotInstanceRequestIds: js.UndefOr[SpotInstanceRequestIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeSpotInstanceRequestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SpotInstanceRequestIds" -> SpotInstanceRequestIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotInstanceRequestsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotInstanceRequests.</p>
   */
  @js.native
  trait DescribeSpotInstanceRequestsResult extends js.Object {
    var SpotInstanceRequests: SpotInstanceRequestList
  }

  object DescribeSpotInstanceRequestsResult {
    def apply(
      SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.undefined
    ): DescribeSpotInstanceRequestsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotInstanceRequests" -> SpotInstanceRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotInstanceRequestsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSpotPriceHistory.</p>
   */
  @js.native
  trait DescribeSpotPriceHistoryRequest extends js.Object {
    var DryRun: Boolean
    var InstanceTypes: InstanceTypeList
    var MaxResults: Integer
    var StartTime: DateTime
    var EndTime: DateTime
    var AvailabilityZone: String
    var ProductDescriptions: ProductDescriptionList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeSpotPriceHistoryRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceTypes: js.UndefOr[InstanceTypeList] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      ProductDescriptions: js.UndefOr[ProductDescriptionList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeSpotPriceHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceTypes" -> InstanceTypes.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("ProductDescriptions" -> ProductDescriptions.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotPriceHistoryRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSpotPriceHistory.</p>
   */
  @js.native
  trait DescribeSpotPriceHistoryResult extends js.Object {
    var SpotPriceHistory: SpotPriceHistoryList
    var NextToken: String
  }

  object DescribeSpotPriceHistoryResult {
    def apply(
      SpotPriceHistory: js.UndefOr[SpotPriceHistoryList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeSpotPriceHistoryResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotPriceHistory" -> SpotPriceHistory.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSpotPriceHistoryResult]
    }
  }

  @js.native
  trait DescribeStaleSecurityGroupsRequest extends js.Object {
    var DryRun: Boolean
    var VpcId: String
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object DescribeStaleSecurityGroupsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeStaleSecurityGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStaleSecurityGroupsRequest]
    }
  }

  @js.native
  trait DescribeStaleSecurityGroupsResult extends js.Object {
    var StaleSecurityGroupSet: StaleSecurityGroupSet
    var NextToken: String
  }

  object DescribeStaleSecurityGroupsResult {
    def apply(
      StaleSecurityGroupSet: js.UndefOr[StaleSecurityGroupSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeStaleSecurityGroupsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StaleSecurityGroupSet" -> StaleSecurityGroupSet.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeStaleSecurityGroupsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeSubnets.</p>
   */
  @js.native
  trait DescribeSubnetsRequest extends js.Object {
    var DryRun: Boolean
    var SubnetIds: SubnetIdStringList
    var Filters: FilterList
  }

  object DescribeSubnetsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeSubnetsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubnetsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeSubnets.</p>
   */
  @js.native
  trait DescribeSubnetsResult extends js.Object {
    var Subnets: SubnetList
  }

  object DescribeSubnetsResult {
    def apply(
      Subnets: js.UndefOr[SubnetList] = js.undefined
    ): DescribeSubnetsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Subnets" -> Subnets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeSubnetsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeTags.</p>
   */
  @js.native
  trait DescribeTagsRequest extends js.Object {
    var DryRun: Boolean
    var Filters: FilterList
    var MaxResults: Integer
    var NextToken: String
  }

  object DescribeTagsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeTags.</p>
   */
  @js.native
  trait DescribeTagsResult extends js.Object {
    var Tags: TagDescriptionList
    var NextToken: String
  }

  object DescribeTagsResult {
    def apply(
      Tags: js.UndefOr[TagDescriptionList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeTagsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTagsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVolumeAttribute.</p>
   */
  @js.native
  trait DescribeVolumeAttributeRequest extends js.Object {
    var DryRun: Boolean
    var VolumeId: String
    var Attribute: VolumeAttributeName
  }

  object DescribeVolumeAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[VolumeAttributeName] = js.undefined
    ): DescribeVolumeAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumeAttributeRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVolumeAttribute.</p>
   */
  @js.native
  trait DescribeVolumeAttributeResult extends js.Object {
    var VolumeId: String
    var AutoEnableIO: AttributeBooleanValue
    var ProductCodes: ProductCodeList
  }

  object DescribeVolumeAttributeResult {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined,
      AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
    ): DescribeVolumeAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("AutoEnableIO" -> AutoEnableIO.map { x => x: js.Any }),
        ("ProductCodes" -> ProductCodes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumeAttributeResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVolumeStatus.</p>
   */
  @js.native
  trait DescribeVolumeStatusRequest extends js.Object {
    var DryRun: Boolean
    var MaxResults: Integer
    var VolumeIds: VolumeIdStringList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeVolumeStatusRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      VolumeIds: js.UndefOr[VolumeIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeVolumeStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("VolumeIds" -> VolumeIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumeStatusRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVolumeStatus.</p>
   */
  @js.native
  trait DescribeVolumeStatusResult extends js.Object {
    var VolumeStatuses: VolumeStatusList
    var NextToken: String
  }

  object DescribeVolumeStatusResult {
    def apply(
      VolumeStatuses: js.UndefOr[VolumeStatusList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeVolumeStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeStatuses" -> VolumeStatuses.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumeStatusResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVolumes.</p>
   */
  @js.native
  trait DescribeVolumesRequest extends js.Object {
    var DryRun: Boolean
    var MaxResults: Integer
    var VolumeIds: VolumeIdStringList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeVolumesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      VolumeIds: js.UndefOr[VolumeIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeVolumesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("VolumeIds" -> VolumeIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVolumes.</p>
   */
  @js.native
  trait DescribeVolumesResult extends js.Object {
    var Volumes: VolumeList
    var NextToken: String
  }

  object DescribeVolumesResult {
    def apply(
      Volumes: js.UndefOr[VolumeList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeVolumesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Volumes" -> Volumes.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVolumesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpcAttribute.</p>
   */
  @js.native
  trait DescribeVpcAttributeRequest extends js.Object {
    var DryRun: Boolean
    var VpcId: String
    var Attribute: VpcAttributeName
  }

  object DescribeVpcAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[VpcAttributeName] = js.undefined
    ): DescribeVpcAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcAttributeRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpcAttribute.</p>
   */
  @js.native
  trait DescribeVpcAttributeResult extends js.Object {
    var VpcId: String
    var EnableDnsSupport: AttributeBooleanValue
    var EnableDnsHostnames: AttributeBooleanValue
  }

  object DescribeVpcAttributeResult {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.undefined,
      EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.undefined
    ): DescribeVpcAttributeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("EnableDnsSupport" -> EnableDnsSupport.map { x => x: js.Any }),
        ("EnableDnsHostnames" -> EnableDnsHostnames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcAttributeResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpcClassicLinkDnsSupport.</p>
   */
  @js.native
  trait DescribeVpcClassicLinkDnsSupportRequest extends js.Object {
    var VpcIds: VpcClassicLinkIdList
    var MaxResults: MaxResults
    var NextToken: NextToken
  }

  object DescribeVpcClassicLinkDnsSupportRequest {
    def apply(
      VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeVpcClassicLinkDnsSupportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcIds" -> VpcIds.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcClassicLinkDnsSupportRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpcClassicLinkDnsSupport.</p>
   */
  @js.native
  trait DescribeVpcClassicLinkDnsSupportResult extends js.Object {
    var Vpcs: ClassicLinkDnsSupportList
    var NextToken: NextToken
  }

  object DescribeVpcClassicLinkDnsSupportResult {
    def apply(
      Vpcs: js.UndefOr[ClassicLinkDnsSupportList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeVpcClassicLinkDnsSupportResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Vpcs" -> Vpcs.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcClassicLinkDnsSupportResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpcClassicLink.</p>
   */
  @js.native
  trait DescribeVpcClassicLinkRequest extends js.Object {
    var DryRun: Boolean
    var VpcIds: VpcClassicLinkIdList
    var Filters: FilterList
  }

  object DescribeVpcClassicLinkRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeVpcClassicLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcIds" -> VpcIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcClassicLinkRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpcClassicLink.</p>
   */
  @js.native
  trait DescribeVpcClassicLinkResult extends js.Object {
    var Vpcs: VpcClassicLinkList
  }

  object DescribeVpcClassicLinkResult {
    def apply(
      Vpcs: js.UndefOr[VpcClassicLinkList] = js.undefined
    ): DescribeVpcClassicLinkResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Vpcs" -> Vpcs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcClassicLinkResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpcEndpointServices.</p>
   */
  @js.native
  trait DescribeVpcEndpointServicesRequest extends js.Object {
    var DryRun: Boolean
    var MaxResults: Integer
    var NextToken: String
  }

  object DescribeVpcEndpointServicesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeVpcEndpointServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointServicesRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpcEndpointServices.</p>
   */
  @js.native
  trait DescribeVpcEndpointServicesResult extends js.Object {
    var ServiceNames: ValueStringList
    var NextToken: String
  }

  object DescribeVpcEndpointServicesResult {
    def apply(
      ServiceNames: js.UndefOr[ValueStringList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeVpcEndpointServicesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServiceNames" -> ServiceNames.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointServicesResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpcEndpoints.</p>
   */
  @js.native
  trait DescribeVpcEndpointsRequest extends js.Object {
    var DryRun: Boolean
    var MaxResults: Integer
    var VpcEndpointIds: ValueStringList
    var Filters: FilterList
    var NextToken: String
  }

  object DescribeVpcEndpointsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      MaxResults: js.UndefOr[Integer] = js.undefined,
      VpcEndpointIds: js.UndefOr[ValueStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeVpcEndpointsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("VpcEndpointIds" -> VpcEndpointIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpcEndpoints.</p>
   */
  @js.native
  trait DescribeVpcEndpointsResult extends js.Object {
    var VpcEndpoints: VpcEndpointSet
    var NextToken: String
  }

  object DescribeVpcEndpointsResult {
    def apply(
      VpcEndpoints: js.UndefOr[VpcEndpointSet] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): DescribeVpcEndpointsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcEndpoints" -> VpcEndpoints.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcEndpointsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpcPeeringConnections.</p>
   */
  @js.native
  trait DescribeVpcPeeringConnectionsRequest extends js.Object {
    var DryRun: Boolean
    var VpcPeeringConnectionIds: ValueStringList
    var Filters: FilterList
  }

  object DescribeVpcPeeringConnectionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcPeeringConnectionIds: js.UndefOr[ValueStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeVpcPeeringConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcPeeringConnectionIds" -> VpcPeeringConnectionIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringConnectionsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpcPeeringConnections.</p>
   */
  @js.native
  trait DescribeVpcPeeringConnectionsResult extends js.Object {
    var VpcPeeringConnections: VpcPeeringConnectionList
  }

  object DescribeVpcPeeringConnectionsResult {
    def apply(
      VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined
    ): DescribeVpcPeeringConnectionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcPeeringConnections" -> VpcPeeringConnections.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringConnectionsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpcs.</p>
   */
  @js.native
  trait DescribeVpcsRequest extends js.Object {
    var DryRun: Boolean
    var VpcIds: VpcIdStringList
    var Filters: FilterList
  }

  object DescribeVpcsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcIds: js.UndefOr[VpcIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeVpcsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcIds" -> VpcIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpcs.</p>
   */
  @js.native
  trait DescribeVpcsResult extends js.Object {
    var Vpcs: VpcList
  }

  object DescribeVpcsResult {
    def apply(
      Vpcs: js.UndefOr[VpcList] = js.undefined
    ): DescribeVpcsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Vpcs" -> Vpcs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpnConnections.</p>
   */
  @js.native
  trait DescribeVpnConnectionsRequest extends js.Object {
    var DryRun: Boolean
    var VpnConnectionIds: VpnConnectionIdStringList
    var Filters: FilterList
  }

  object DescribeVpnConnectionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpnConnectionIds: js.UndefOr[VpnConnectionIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeVpnConnectionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpnConnectionIds" -> VpnConnectionIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpnConnectionsRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpnConnections.</p>
   */
  @js.native
  trait DescribeVpnConnectionsResult extends js.Object {
    var VpnConnections: VpnConnectionList
  }

  object DescribeVpnConnectionsResult {
    def apply(
      VpnConnections: js.UndefOr[VpnConnectionList] = js.undefined
    ): DescribeVpnConnectionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpnConnections" -> VpnConnections.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpnConnectionsResult]
    }
  }

  /**
   * <p>Contains the parameters for DescribeVpnGateways.</p>
   */
  @js.native
  trait DescribeVpnGatewaysRequest extends js.Object {
    var DryRun: Boolean
    var VpnGatewayIds: VpnGatewayIdStringList
    var Filters: FilterList
  }

  object DescribeVpnGatewaysRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpnGatewayIds: js.UndefOr[VpnGatewayIdStringList] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeVpnGatewaysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpnGatewayIds" -> VpnGatewayIds.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpnGatewaysRequest]
    }
  }

  /**
   * <p>Contains the output of DescribeVpnGateways.</p>
   */
  @js.native
  trait DescribeVpnGatewaysResult extends js.Object {
    var VpnGateways: VpnGatewayList
  }

  object DescribeVpnGatewaysResult {
    def apply(
      VpnGateways: js.UndefOr[VpnGatewayList] = js.undefined
    ): DescribeVpnGatewaysResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpnGateways" -> VpnGateways.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpnGatewaysResult]
    }
  }

  /**
   * <p>Contains the parameters for DetachClassicLinkVpc.</p>
   */
  @js.native
  trait DetachClassicLinkVpcRequest extends js.Object {
    var DryRun: Boolean
    var InstanceId: String
    var VpcId: String
  }

  object DetachClassicLinkVpcRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): DetachClassicLinkVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachClassicLinkVpcRequest]
    }
  }

  /**
   * <p>Contains the output of DetachClassicLinkVpc.</p>
   */
  @js.native
  trait DetachClassicLinkVpcResult extends js.Object {
    var Return: Boolean
  }

  object DetachClassicLinkVpcResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): DetachClassicLinkVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachClassicLinkVpcResult]
    }
  }

  /**
   * <p>Contains the parameters for DetachInternetGateway.</p>
   */
  @js.native
  trait DetachInternetGatewayRequest extends js.Object {
    var DryRun: Boolean
    var InternetGatewayId: String
    var VpcId: String
  }

  object DetachInternetGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InternetGatewayId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): DetachInternetGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InternetGatewayId" -> InternetGatewayId.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachInternetGatewayRequest]
    }
  }

  /**
   * <p>Contains the parameters for DetachNetworkInterface.</p>
   */
  @js.native
  trait DetachNetworkInterfaceRequest extends js.Object {
    var DryRun: Boolean
    var AttachmentId: String
    var Force: Boolean
  }

  object DetachNetworkInterfaceRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AttachmentId: js.UndefOr[String] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined
    ): DetachNetworkInterfaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("AttachmentId" -> AttachmentId.map { x => x: js.Any }),
        ("Force" -> Force.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachNetworkInterfaceRequest]
    }
  }

  /**
   * <p>Contains the parameters for DetachVolume.</p>
   */
  @js.native
  trait DetachVolumeRequest extends js.Object {
    var DryRun: Boolean
    var Force: Boolean
    var Device: String
    var VolumeId: String
    var InstanceId: String
  }

  object DetachVolumeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined,
      Device: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined
    ): DetachVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Force" -> Force.map { x => x: js.Any }),
        ("Device" -> Device.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachVolumeRequest]
    }
  }

  /**
   * <p>Contains the parameters for DetachVpnGateway.</p>
   */
  @js.native
  trait DetachVpnGatewayRequest extends js.Object {
    var DryRun: Boolean
    var VpnGatewayId: String
    var VpcId: String
  }

  object DetachVpnGatewayRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): DetachVpnGatewayRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpnGatewayId" -> VpnGatewayId.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DetachVpnGatewayRequest]
    }
  }


  object DeviceTypeEnum {
    val ebs = "ebs"
    val `instance-store` = "instance-store"

    val values = IndexedSeq(ebs, `instance-store`)
  }

  /**
   * <p>Describes a DHCP configuration option.</p>
   */
  @js.native
  trait DhcpConfiguration extends js.Object {
    var Key: String
    var Values: DhcpConfigurationValueList
  }

  object DhcpConfiguration {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[DhcpConfigurationValueList] = js.undefined
    ): DhcpConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DhcpConfiguration]
    }
  }

  /**
   * <p>Describes a set of DHCP options.</p>
   */
  @js.native
  trait DhcpOptions extends js.Object {
    var DhcpOptionsId: String
    var DhcpConfigurations: DhcpConfigurationList
    var Tags: TagList
  }

  object DhcpOptions {
    def apply(
      DhcpOptionsId: js.UndefOr[String] = js.undefined,
      DhcpConfigurations: js.UndefOr[DhcpConfigurationList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): DhcpOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DhcpOptionsId" -> DhcpOptionsId.map { x => x: js.Any }),
        ("DhcpConfigurations" -> DhcpConfigurations.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DhcpOptions]
    }
  }

  /**
   * <p>Contains the parameters for DisableVgwRoutePropagation.</p>
   */
  @js.native
  trait DisableVgwRoutePropagationRequest extends js.Object {
    var RouteTableId: String
    var GatewayId: String
  }

  object DisableVgwRoutePropagationRequest {
    def apply(
      RouteTableId: js.UndefOr[String] = js.undefined,
      GatewayId: js.UndefOr[String] = js.undefined
    ): DisableVgwRoutePropagationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any }),
        ("GatewayId" -> GatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVgwRoutePropagationRequest]
    }
  }

  /**
   * <p>Contains the parameters for DisableVpcClassicLinkDnsSupport.</p>
   */
  @js.native
  trait DisableVpcClassicLinkDnsSupportRequest extends js.Object {
    var VpcId: String
  }

  object DisableVpcClassicLinkDnsSupportRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined
    ): DisableVpcClassicLinkDnsSupportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVpcClassicLinkDnsSupportRequest]
    }
  }

  /**
   * <p>Contains the output of DisableVpcClassicLinkDnsSupport.</p>
   */
  @js.native
  trait DisableVpcClassicLinkDnsSupportResult extends js.Object {
    var Return: Boolean
  }

  object DisableVpcClassicLinkDnsSupportResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): DisableVpcClassicLinkDnsSupportResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVpcClassicLinkDnsSupportResult]
    }
  }

  /**
   * <p>Contains the parameters for DisableVpcClassicLink.</p>
   */
  @js.native
  trait DisableVpcClassicLinkRequest extends js.Object {
    var DryRun: Boolean
    var VpcId: String
  }

  object DisableVpcClassicLinkRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): DisableVpcClassicLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVpcClassicLinkRequest]
    }
  }

  /**
   * <p>Contains the output of DisableVpcClassicLink.</p>
   */
  @js.native
  trait DisableVpcClassicLinkResult extends js.Object {
    var Return: Boolean
  }

  object DisableVpcClassicLinkResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): DisableVpcClassicLinkResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisableVpcClassicLinkResult]
    }
  }

  /**
   * <p>Contains the parameters for DisassociateAddress.</p>
   */
  @js.native
  trait DisassociateAddressRequest extends js.Object {
    var DryRun: Boolean
    var PublicIp: String
    var AssociationId: String
  }

  object DisassociateAddressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined
    ): DisassociateAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateAddressRequest]
    }
  }

  /**
   * <p>Contains the parameters for DisassociateRouteTable.</p>
   */
  @js.native
  trait DisassociateRouteTableRequest extends js.Object {
    var DryRun: Boolean
    var AssociationId: String
  }

  object DisassociateRouteTableRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined
    ): DisassociateRouteTableRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateRouteTableRequest]
    }
  }

  @js.native
  trait DisassociateSubnetCidrBlockRequest extends js.Object {
    var AssociationId: String
  }

  object DisassociateSubnetCidrBlockRequest {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined
    ): DisassociateSubnetCidrBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSubnetCidrBlockRequest]
    }
  }

  @js.native
  trait DisassociateSubnetCidrBlockResult extends js.Object {
    var SubnetId: String
    var Ipv6CidrBlockAssociation: SubnetIpv6CidrBlockAssociation
  }

  object DisassociateSubnetCidrBlockResult {
    def apply(
      SubnetId: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation] = js.undefined
    ): DisassociateSubnetCidrBlockResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetId" -> SubnetId.map { x => x: js.Any }),
        ("Ipv6CidrBlockAssociation" -> Ipv6CidrBlockAssociation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateSubnetCidrBlockResult]
    }
  }

  @js.native
  trait DisassociateVpcCidrBlockRequest extends js.Object {
    var AssociationId: String
  }

  object DisassociateVpcCidrBlockRequest {
    def apply(
      AssociationId: js.UndefOr[String] = js.undefined
    ): DisassociateVpcCidrBlockRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVpcCidrBlockRequest]
    }
  }

  @js.native
  trait DisassociateVpcCidrBlockResult extends js.Object {
    var VpcId: String
    var Ipv6CidrBlockAssociation: VpcIpv6CidrBlockAssociation
  }

  object DisassociateVpcCidrBlockResult {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.undefined
    ): DisassociateVpcCidrBlockResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("Ipv6CidrBlockAssociation" -> Ipv6CidrBlockAssociation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateVpcCidrBlockResult]
    }
  }

  /**
   * <p>Describes a disk image.</p>
   */
  @js.native
  trait DiskImage extends js.Object {
    var Image: DiskImageDetail
    var Description: String
    var Volume: VolumeDetail
  }

  object DiskImage {
    def apply(
      Image: js.UndefOr[DiskImageDetail] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Volume: js.UndefOr[VolumeDetail] = js.undefined
    ): DiskImage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Image" -> Image.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Volume" -> Volume.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskImage]
    }
  }

  /**
   * <p>Describes a disk image.</p>
   */
  @js.native
  trait DiskImageDescription extends js.Object {
    var Format: DiskImageFormat
    var Size: Long
    var ImportManifestUrl: String
    var Checksum: String
  }

  object DiskImageDescription {
    def apply(
      Format: js.UndefOr[DiskImageFormat] = js.undefined,
      Size: js.UndefOr[Long] = js.undefined,
      ImportManifestUrl: js.UndefOr[String] = js.undefined,
      Checksum: js.UndefOr[String] = js.undefined
    ): DiskImageDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Format" -> Format.map { x => x: js.Any }),
        ("Size" -> Size.map { x => x: js.Any }),
        ("ImportManifestUrl" -> ImportManifestUrl.map { x => x: js.Any }),
        ("Checksum" -> Checksum.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskImageDescription]
    }
  }

  /**
   * <p>Describes a disk image.</p>
   */
  @js.native
  trait DiskImageDetail extends js.Object {
    var Format: DiskImageFormat
    var Bytes: Long
    var ImportManifestUrl: String
  }

  object DiskImageDetail {
    def apply(
      Format: js.UndefOr[DiskImageFormat] = js.undefined,
      Bytes: js.UndefOr[Long] = js.undefined,
      ImportManifestUrl: js.UndefOr[String] = js.undefined
    ): DiskImageDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Format" -> Format.map { x => x: js.Any }),
        ("Bytes" -> Bytes.map { x => x: js.Any }),
        ("ImportManifestUrl" -> ImportManifestUrl.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskImageDetail]
    }
  }


  object DiskImageFormatEnum {
    val VMDK = "VMDK"
    val RAW = "RAW"
    val VHD = "VHD"

    val values = IndexedSeq(VMDK, RAW, VHD)
  }

  /**
   * <p>Describes a disk image volume.</p>
   */
  @js.native
  trait DiskImageVolumeDescription extends js.Object {
    var Size: Long
    var Id: String
  }

  object DiskImageVolumeDescription {
    def apply(
      Size: js.UndefOr[Long] = js.undefined,
      Id: js.UndefOr[String] = js.undefined
    ): DiskImageVolumeDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Size" -> Size.map { x => x: js.Any }),
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DiskImageVolumeDescription]
    }
  }


  object DomainTypeEnum {
    val vpc = "vpc"
    val standard = "standard"

    val values = IndexedSeq(vpc, standard)
  }

  /**
   * <p>Describes a block device for an EBS volume.</p>
   */
  @js.native
  trait EbsBlockDevice extends js.Object {
    var VolumeType: VolumeType
    var SnapshotId: String
    var Encrypted: Boolean
    var VolumeSize: Integer
    var Iops: Integer
    var DeleteOnTermination: Boolean
  }

  object EbsBlockDevice {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      VolumeSize: js.UndefOr[Integer] = js.undefined,
      Iops: js.UndefOr[Integer] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
    ): EbsBlockDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("VolumeSize" -> VolumeSize.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsBlockDevice]
    }
  }

  /**
   * <p>Describes a parameter used to set up an EBS volume in a block device mapping.</p>
   */
  @js.native
  trait EbsInstanceBlockDevice extends js.Object {
    var VolumeId: String
    var Status: AttachmentStatus
    var AttachTime: DateTime
    var DeleteOnTermination: Boolean
  }

  object EbsInstanceBlockDevice {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[AttachmentStatus] = js.undefined,
      AttachTime: js.UndefOr[DateTime] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
    ): EbsInstanceBlockDevice = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("AttachTime" -> AttachTime.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsInstanceBlockDevice]
    }
  }

  /**
   * <p>Describes information used to set up an EBS volume specified in a block device mapping.</p>
   */
  @js.native
  trait EbsInstanceBlockDeviceSpecification extends js.Object {
    var VolumeId: String
    var DeleteOnTermination: Boolean
  }

  object EbsInstanceBlockDeviceSpecification {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
    ): EbsInstanceBlockDeviceSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EbsInstanceBlockDeviceSpecification]
    }
  }

  /**
   * <p>Describes an egress-only Internet gateway.</p>
   */
  @js.native
  trait EgressOnlyInternetGateway extends js.Object {
    var EgressOnlyInternetGatewayId: EgressOnlyInternetGatewayId
    var Attachments: InternetGatewayAttachmentList
  }

  object EgressOnlyInternetGateway {
    def apply(
      EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId] = js.undefined,
      Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.undefined
    ): EgressOnlyInternetGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x: js.Any }),
        ("Attachments" -> Attachments.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EgressOnlyInternetGateway]
    }
  }

  /**
   * <p>Contains the parameters for EnableVgwRoutePropagation.</p>
   */
  @js.native
  trait EnableVgwRoutePropagationRequest extends js.Object {
    var RouteTableId: String
    var GatewayId: String
  }

  object EnableVgwRoutePropagationRequest {
    def apply(
      RouteTableId: js.UndefOr[String] = js.undefined,
      GatewayId: js.UndefOr[String] = js.undefined
    ): EnableVgwRoutePropagationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any }),
        ("GatewayId" -> GatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVgwRoutePropagationRequest]
    }
  }

  /**
   * <p>Contains the parameters for EnableVolumeIO.</p>
   */
  @js.native
  trait EnableVolumeIORequest extends js.Object {
    var DryRun: Boolean
    var VolumeId: String
  }

  object EnableVolumeIORequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined
    ): EnableVolumeIORequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVolumeIORequest]
    }
  }

  /**
   * <p>Contains the parameters for EnableVpcClassicLinkDnsSupport.</p>
   */
  @js.native
  trait EnableVpcClassicLinkDnsSupportRequest extends js.Object {
    var VpcId: String
  }

  object EnableVpcClassicLinkDnsSupportRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined
    ): EnableVpcClassicLinkDnsSupportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVpcClassicLinkDnsSupportRequest]
    }
  }

  /**
   * <p>Contains the output of EnableVpcClassicLinkDnsSupport.</p>
   */
  @js.native
  trait EnableVpcClassicLinkDnsSupportResult extends js.Object {
    var Return: Boolean
  }

  object EnableVpcClassicLinkDnsSupportResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): EnableVpcClassicLinkDnsSupportResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVpcClassicLinkDnsSupportResult]
    }
  }

  /**
   * <p>Contains the parameters for EnableVpcClassicLink.</p>
   */
  @js.native
  trait EnableVpcClassicLinkRequest extends js.Object {
    var DryRun: Boolean
    var VpcId: String
  }

  object EnableVpcClassicLinkRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): EnableVpcClassicLinkRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVpcClassicLinkRequest]
    }
  }

  /**
   * <p>Contains the output of EnableVpcClassicLink.</p>
   */
  @js.native
  trait EnableVpcClassicLinkResult extends js.Object {
    var Return: Boolean
  }

  object EnableVpcClassicLinkResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): EnableVpcClassicLinkResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnableVpcClassicLinkResult]
    }
  }


  object EventCodeEnum {
    val `instance-reboot` = "instance-reboot"
    val `system-reboot` = "system-reboot"
    val `system-maintenance` = "system-maintenance"
    val `instance-retirement` = "instance-retirement"
    val `instance-stop` = "instance-stop"

    val values = IndexedSeq(`instance-reboot`, `system-reboot`, `system-maintenance`, `instance-retirement`, `instance-stop`)
  }

  /**
   * <p>Describes a Spot fleet event.</p>
   */
  @js.native
  trait EventInformation extends js.Object {
    var InstanceId: String
    var EventSubType: String
    var EventDescription: String
  }

  object EventInformation {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      EventSubType: js.UndefOr[String] = js.undefined,
      EventDescription: js.UndefOr[String] = js.undefined
    ): EventInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("EventSubType" -> EventSubType.map { x => x: js.Any }),
        ("EventDescription" -> EventDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventInformation]
    }
  }


  object EventTypeEnum {
    val instanceChange = "instanceChange"
    val fleetRequestChange = "fleetRequestChange"
    val error = "error"

    val values = IndexedSeq(instanceChange, fleetRequestChange, error)
  }


  object ExcessCapacityTerminationPolicyEnum {
    val noTermination = "noTermination"
    val default = "default"

    val values = IndexedSeq(noTermination, default)
  }


  object ExportEnvironmentEnum {
    val citrix = "citrix"
    val vmware = "vmware"
    val microsoft = "microsoft"

    val values = IndexedSeq(citrix, vmware, microsoft)
  }

  /**
   * <p>Describes an instance export task.</p>
   */
  @js.native
  trait ExportTask extends js.Object {
    var StatusMessage: String
    var ExportToS3Task: ExportToS3Task
    var Description: String
    var InstanceExportDetails: InstanceExportDetails
    var State: ExportTaskState
    var ExportTaskId: String
  }

  object ExportTask {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      ExportToS3Task: js.UndefOr[ExportToS3Task] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      InstanceExportDetails: js.UndefOr[InstanceExportDetails] = js.undefined,
      State: js.UndefOr[ExportTaskState] = js.undefined,
      ExportTaskId: js.UndefOr[String] = js.undefined
    ): ExportTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("ExportToS3Task" -> ExportToS3Task.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("InstanceExportDetails" -> InstanceExportDetails.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ExportTaskId" -> ExportTaskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportTask]
    }
  }


  object ExportTaskStateEnum {
    val active = "active"
    val cancelling = "cancelling"
    val cancelled = "cancelled"
    val completed = "completed"

    val values = IndexedSeq(active, cancelling, cancelled, completed)
  }

  /**
   * <p>Describes the format and location for an instance export task.</p>
   */
  @js.native
  trait ExportToS3Task extends js.Object {
    var DiskImageFormat: DiskImageFormat
    var ContainerFormat: ContainerFormat
    var S3Bucket: String
    var S3Key: String
  }

  object ExportToS3Task {
    def apply(
      DiskImageFormat: js.UndefOr[DiskImageFormat] = js.undefined,
      ContainerFormat: js.UndefOr[ContainerFormat] = js.undefined,
      S3Bucket: js.UndefOr[String] = js.undefined,
      S3Key: js.UndefOr[String] = js.undefined
    ): ExportToS3Task = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DiskImageFormat" -> DiskImageFormat.map { x => x: js.Any }),
        ("ContainerFormat" -> ContainerFormat.map { x => x: js.Any }),
        ("S3Bucket" -> S3Bucket.map { x => x: js.Any }),
        ("S3Key" -> S3Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportToS3Task]
    }
  }

  /**
   * <p>Describes an instance export task.</p>
   */
  @js.native
  trait ExportToS3TaskSpecification extends js.Object {
    var DiskImageFormat: DiskImageFormat
    var ContainerFormat: ContainerFormat
    var S3Bucket: String
    var S3Prefix: String
  }

  object ExportToS3TaskSpecification {
    def apply(
      DiskImageFormat: js.UndefOr[DiskImageFormat] = js.undefined,
      ContainerFormat: js.UndefOr[ContainerFormat] = js.undefined,
      S3Bucket: js.UndefOr[String] = js.undefined,
      S3Prefix: js.UndefOr[String] = js.undefined
    ): ExportToS3TaskSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DiskImageFormat" -> DiskImageFormat.map { x => x: js.Any }),
        ("ContainerFormat" -> ContainerFormat.map { x => x: js.Any }),
        ("S3Bucket" -> S3Bucket.map { x => x: js.Any }),
        ("S3Prefix" -> S3Prefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExportToS3TaskSpecification]
    }
  }

  /**
   * <p>A filter name and value pair that is used to return a more specific list of results. Filters can be used to match a set of resources by various criteria, such as tags, attributes, or IDs.</p>
   */
  @js.native
  trait Filter extends js.Object {
    var Name: String
    var Values: ValueStringList
  }

  object Filter {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[ValueStringList] = js.undefined
    ): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }


  object FleetTypeEnum {
    val request = "request"
    val maintain = "maintain"

    val values = IndexedSeq(request, maintain)
  }

  /**
   * <p>Describes a flow log.</p>
   */
  @js.native
  trait FlowLog extends js.Object {
    var FlowLogId: String
    var ResourceId: String
    var LogGroupName: String
    var DeliverLogsPermissionArn: String
    var DeliverLogsErrorMessage: String
    var TrafficType: TrafficType
    var FlowLogStatus: String
    var CreationTime: DateTime
    var DeliverLogsStatus: String
  }

  object FlowLog {
    def apply(
      FlowLogId: js.UndefOr[String] = js.undefined,
      ResourceId: js.UndefOr[String] = js.undefined,
      LogGroupName: js.UndefOr[String] = js.undefined,
      DeliverLogsPermissionArn: js.UndefOr[String] = js.undefined,
      DeliverLogsErrorMessage: js.UndefOr[String] = js.undefined,
      TrafficType: js.UndefOr[TrafficType] = js.undefined,
      FlowLogStatus: js.UndefOr[String] = js.undefined,
      CreationTime: js.UndefOr[DateTime] = js.undefined,
      DeliverLogsStatus: js.UndefOr[String] = js.undefined
    ): FlowLog = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FlowLogId" -> FlowLogId.map { x => x: js.Any }),
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("LogGroupName" -> LogGroupName.map { x => x: js.Any }),
        ("DeliverLogsPermissionArn" -> DeliverLogsPermissionArn.map { x => x: js.Any }),
        ("DeliverLogsErrorMessage" -> DeliverLogsErrorMessage.map { x => x: js.Any }),
        ("TrafficType" -> TrafficType.map { x => x: js.Any }),
        ("FlowLogStatus" -> FlowLogStatus.map { x => x: js.Any }),
        ("CreationTime" -> CreationTime.map { x => x: js.Any }),
        ("DeliverLogsStatus" -> DeliverLogsStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FlowLog]
    }
  }


  object FlowLogsResourceTypeEnum {
    val VPC = "VPC"
    val Subnet = "Subnet"
    val NetworkInterface = "NetworkInterface"

    val values = IndexedSeq(VPC, Subnet, NetworkInterface)
  }


  object GatewayTypeEnum {
    val `ipsec.1` = "ipsec.1"

    val values = IndexedSeq(`ipsec.1`)
  }

  /**
   * <p>Contains the parameters for GetConsoleOutput.</p>
   */
  @js.native
  trait GetConsoleOutputRequest extends js.Object {
    var DryRun: Boolean
    var InstanceId: String
  }

  object GetConsoleOutputRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined
    ): GetConsoleOutputRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConsoleOutputRequest]
    }
  }

  /**
   * <p>Contains the output of GetConsoleOutput.</p>
   */
  @js.native
  trait GetConsoleOutputResult extends js.Object {
    var InstanceId: String
    var Timestamp: DateTime
    var Output: String
  }

  object GetConsoleOutputResult {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      Timestamp: js.UndefOr[DateTime] = js.undefined,
      Output: js.UndefOr[String] = js.undefined
    ): GetConsoleOutputResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("Output" -> Output.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConsoleOutputResult]
    }
  }

  /**
   * <p>Contains the parameters for the request.</p>
   */
  @js.native
  trait GetConsoleScreenshotRequest extends js.Object {
    var DryRun: Boolean
    var InstanceId: String
    var WakeUp: Boolean
  }

  object GetConsoleScreenshotRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      WakeUp: js.UndefOr[Boolean] = js.undefined
    ): GetConsoleScreenshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("WakeUp" -> WakeUp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConsoleScreenshotRequest]
    }
  }

  /**
   * <p>Contains the output of the request.</p>
   */
  @js.native
  trait GetConsoleScreenshotResult extends js.Object {
    var InstanceId: String
    var ImageData: String
  }

  object GetConsoleScreenshotResult {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      ImageData: js.UndefOr[String] = js.undefined
    ): GetConsoleScreenshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("ImageData" -> ImageData.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConsoleScreenshotResult]
    }
  }

  @js.native
  trait GetHostReservationPurchasePreviewRequest extends js.Object {
    var OfferingId: String
    var HostIdSet: RequestHostIdSet
  }

  object GetHostReservationPurchasePreviewRequest {
    def apply(
      OfferingId: js.UndefOr[String] = js.undefined,
      HostIdSet: js.UndefOr[RequestHostIdSet] = js.undefined
    ): GetHostReservationPurchasePreviewRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OfferingId" -> OfferingId.map { x => x: js.Any }),
        ("HostIdSet" -> HostIdSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostReservationPurchasePreviewRequest]
    }
  }

  @js.native
  trait GetHostReservationPurchasePreviewResult extends js.Object {
    var Purchase: PurchaseSet
    var TotalUpfrontPrice: String
    var TotalHourlyPrice: String
    var CurrencyCode: CurrencyCodeValues
  }

  object GetHostReservationPurchasePreviewResult {
    def apply(
      Purchase: js.UndefOr[PurchaseSet] = js.undefined,
      TotalUpfrontPrice: js.UndefOr[String] = js.undefined,
      TotalHourlyPrice: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
    ): GetHostReservationPurchasePreviewResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Purchase" -> Purchase.map { x => x: js.Any }),
        ("TotalUpfrontPrice" -> TotalUpfrontPrice.map { x => x: js.Any }),
        ("TotalHourlyPrice" -> TotalHourlyPrice.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHostReservationPurchasePreviewResult]
    }
  }

  /**
   * <p>Contains the parameters for GetPasswordData.</p>
   */
  @js.native
  trait GetPasswordDataRequest extends js.Object {
    var DryRun: Boolean
    var InstanceId: String
  }

  object GetPasswordDataRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined
    ): GetPasswordDataRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPasswordDataRequest]
    }
  }

  /**
   * <p>Contains the output of GetPasswordData.</p>
   */
  @js.native
  trait GetPasswordDataResult extends js.Object {
    var InstanceId: String
    var Timestamp: DateTime
    var PasswordData: String
  }

  object GetPasswordDataResult {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      Timestamp: js.UndefOr[DateTime] = js.undefined,
      PasswordData: js.UndefOr[String] = js.undefined
    ): GetPasswordDataResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("PasswordData" -> PasswordData.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPasswordDataResult]
    }
  }

  /**
   * <p>Contains the parameters for GetReservedInstanceExchangeQuote.</p>
   */
  @js.native
  trait GetReservedInstancesExchangeQuoteRequest extends js.Object {
    var DryRun: Boolean
    var ReservedInstanceIds: ReservedInstanceIdSet
    var TargetConfigurations: TargetConfigurationRequestSet
  }

  object GetReservedInstancesExchangeQuoteRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ReservedInstanceIds: js.UndefOr[ReservedInstanceIdSet] = js.undefined,
      TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet] = js.undefined
    ): GetReservedInstancesExchangeQuoteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ReservedInstanceIds" -> ReservedInstanceIds.map { x => x: js.Any }),
        ("TargetConfigurations" -> TargetConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservedInstancesExchangeQuoteRequest]
    }
  }

  /**
   * <p>Contains the output of GetReservedInstancesExchangeQuote.</p>
   */
  @js.native
  trait GetReservedInstancesExchangeQuoteResult extends js.Object {
    var CurrencyCode: String
    var TargetConfigurationValueRollup: ReservationValue
    var ReservedInstanceValueRollup: ReservationValue
    var ValidationFailureReason: String
    var ReservedInstanceValueSet: ReservedInstanceReservationValueSet
    var OutputReservedInstancesWillExpireAt: DateTime
    var TargetConfigurationValueSet: TargetReservationValueSet
    var PaymentDue: String
    var IsValidExchange: Boolean
  }

  object GetReservedInstancesExchangeQuoteResult {
    def apply(
      CurrencyCode: js.UndefOr[String] = js.undefined,
      TargetConfigurationValueRollup: js.UndefOr[ReservationValue] = js.undefined,
      ReservedInstanceValueRollup: js.UndefOr[ReservationValue] = js.undefined,
      ValidationFailureReason: js.UndefOr[String] = js.undefined,
      ReservedInstanceValueSet: js.UndefOr[ReservedInstanceReservationValueSet] = js.undefined,
      OutputReservedInstancesWillExpireAt: js.UndefOr[DateTime] = js.undefined,
      TargetConfigurationValueSet: js.UndefOr[TargetReservationValueSet] = js.undefined,
      PaymentDue: js.UndefOr[String] = js.undefined,
      IsValidExchange: js.UndefOr[Boolean] = js.undefined
    ): GetReservedInstancesExchangeQuoteResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("TargetConfigurationValueRollup" -> TargetConfigurationValueRollup.map { x => x: js.Any }),
        ("ReservedInstanceValueRollup" -> ReservedInstanceValueRollup.map { x => x: js.Any }),
        ("ValidationFailureReason" -> ValidationFailureReason.map { x => x: js.Any }),
        ("ReservedInstanceValueSet" -> ReservedInstanceValueSet.map { x => x: js.Any }),
        ("OutputReservedInstancesWillExpireAt" -> OutputReservedInstancesWillExpireAt.map { x => x: js.Any }),
        ("TargetConfigurationValueSet" -> TargetConfigurationValueSet.map { x => x: js.Any }),
        ("PaymentDue" -> PaymentDue.map { x => x: js.Any }),
        ("IsValidExchange" -> IsValidExchange.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetReservedInstancesExchangeQuoteResult]
    }
  }

  /**
   * <p>Describes a security group.</p>
   */
  @js.native
  trait GroupIdentifier extends js.Object {
    var GroupName: String
    var GroupId: String
  }

  object GroupIdentifier {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined
    ): GroupIdentifier = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupIdentifier]
    }
  }

  /**
   * <p>Describes an event in the history of the Spot fleet request.</p>
   */
  @js.native
  trait HistoryRecord extends js.Object {
    var Timestamp: DateTime
    var EventType: EventType
    var EventInformation: EventInformation
  }

  object HistoryRecord {
    def apply(
      Timestamp: js.UndefOr[DateTime] = js.undefined,
      EventType: js.UndefOr[EventType] = js.undefined,
      EventInformation: js.UndefOr[EventInformation] = js.undefined
    ): HistoryRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("EventType" -> EventType.map { x => x: js.Any }),
        ("EventInformation" -> EventInformation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HistoryRecord]
    }
  }

  /**
   * <p>Describes the properties of the Dedicated Host.</p>
   */
  @js.native
  trait Host extends js.Object {
    var HostReservationId: String
    var AvailableCapacity: AvailableCapacity
    var ClientToken: String
    var HostProperties: HostProperties
    var AvailabilityZone: String
    var HostId: String
    var Instances: HostInstanceList
    var State: AllocationState
    var AutoPlacement: AutoPlacement
  }

  object Host {
    def apply(
      HostReservationId: js.UndefOr[String] = js.undefined,
      AvailableCapacity: js.UndefOr[AvailableCapacity] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      HostProperties: js.UndefOr[HostProperties] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      HostId: js.UndefOr[String] = js.undefined,
      Instances: js.UndefOr[HostInstanceList] = js.undefined,
      State: js.UndefOr[AllocationState] = js.undefined,
      AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined
    ): Host = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostReservationId" -> HostReservationId.map { x => x: js.Any }),
        ("AvailableCapacity" -> AvailableCapacity.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("HostProperties" -> HostProperties.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("HostId" -> HostId.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("AutoPlacement" -> AutoPlacement.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Host]
    }
  }

  /**
   * <p>Describes an instance running on a Dedicated Host.</p>
   */
  @js.native
  trait HostInstance extends js.Object {
    var InstanceId: String
    var InstanceType: String
  }

  object HostInstance {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined
    ): HostInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostInstance]
    }
  }

  /**
   * <p>Details about the Dedicated Host Reservation offering.</p>
   */
  @js.native
  trait HostOffering extends js.Object {
    var PaymentOption: PaymentOption
    var CurrencyCode: CurrencyCodeValues
    var Duration: Integer
    var InstanceFamily: String
    var UpfrontPrice: String
    var HourlyPrice: String
    var OfferingId: String
  }

  object HostOffering {
    def apply(
      PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Integer] = js.undefined,
      InstanceFamily: js.UndefOr[String] = js.undefined,
      UpfrontPrice: js.UndefOr[String] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined
    ): HostOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PaymentOption" -> PaymentOption.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("InstanceFamily" -> InstanceFamily.map { x => x: js.Any }),
        ("UpfrontPrice" -> UpfrontPrice.map { x => x: js.Any }),
        ("HourlyPrice" -> HourlyPrice.map { x => x: js.Any }),
        ("OfferingId" -> OfferingId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostOffering]
    }
  }

  /**
   * <p>Describes properties of a Dedicated Host.</p>
   */
  @js.native
  trait HostProperties extends js.Object {
    var Sockets: Integer
    var Cores: Integer
    var TotalVCpus: Integer
    var InstanceType: String
  }

  object HostProperties {
    def apply(
      Sockets: js.UndefOr[Integer] = js.undefined,
      Cores: js.UndefOr[Integer] = js.undefined,
      TotalVCpus: js.UndefOr[Integer] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined
    ): HostProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Sockets" -> Sockets.map { x => x: js.Any }),
        ("Cores" -> Cores.map { x => x: js.Any }),
        ("TotalVCpus" -> TotalVCpus.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostProperties]
    }
  }

  /**
   * <p>Details about the Dedicated Host Reservation and associated Dedicated Hosts.</p>
   */
  @js.native
  trait HostReservation extends js.Object {
    var PaymentOption: PaymentOption
    var HostReservationId: String
    var CurrencyCode: CurrencyCodeValues
    var Duration: Integer
    var InstanceFamily: String
    var Start: DateTime
    var UpfrontPrice: String
    var HostIdSet: ResponseHostIdSet
    var Count: Integer
    var HourlyPrice: String
    var End: DateTime
    var OfferingId: String
    var State: ReservationState
  }

  object HostReservation {
    def apply(
      PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
      HostReservationId: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Integer] = js.undefined,
      InstanceFamily: js.UndefOr[String] = js.undefined,
      Start: js.UndefOr[DateTime] = js.undefined,
      UpfrontPrice: js.UndefOr[String] = js.undefined,
      HostIdSet: js.UndefOr[ResponseHostIdSet] = js.undefined,
      Count: js.UndefOr[Integer] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined,
      End: js.UndefOr[DateTime] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[ReservationState] = js.undefined
    ): HostReservation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PaymentOption" -> PaymentOption.map { x => x: js.Any }),
        ("HostReservationId" -> HostReservationId.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("InstanceFamily" -> InstanceFamily.map { x => x: js.Any }),
        ("Start" -> Start.map { x => x: js.Any }),
        ("UpfrontPrice" -> UpfrontPrice.map { x => x: js.Any }),
        ("HostIdSet" -> HostIdSet.map { x => x: js.Any }),
        ("Count" -> Count.map { x => x: js.Any }),
        ("HourlyPrice" -> HourlyPrice.map { x => x: js.Any }),
        ("End" -> End.map { x => x: js.Any }),
        ("OfferingId" -> OfferingId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HostReservation]
    }
  }


  object HostTenancyEnum {
    val dedicated = "dedicated"
    val host = "host"

    val values = IndexedSeq(dedicated, host)
  }


  object HypervisorTypeEnum {
    val ovm = "ovm"
    val xen = "xen"

    val values = IndexedSeq(ovm, xen)
  }

  /**
   * <p>Describes an IAM instance profile.</p>
   */
  @js.native
  trait IamInstanceProfile extends js.Object {
    var Arn: String
    var Id: String
  }

  object IamInstanceProfile {
    def apply(
      Arn: js.UndefOr[String] = js.undefined,
      Id: js.UndefOr[String] = js.undefined
    ): IamInstanceProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IamInstanceProfile]
    }
  }

  /**
   * <p>Describes an IAM instance profile.</p>
   */
  @js.native
  trait IamInstanceProfileSpecification extends js.Object {
    var Arn: String
    var Name: String
  }

  object IamInstanceProfileSpecification {
    def apply(
      Arn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined
    ): IamInstanceProfileSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IamInstanceProfileSpecification]
    }
  }

  /**
   * <p>Describes the ICMP type and code.</p>
   */
  @js.native
  trait IcmpTypeCode extends js.Object {
    var Type: Integer
    var Code: Integer
  }

  object IcmpTypeCode {
    def apply(
      Type: js.UndefOr[Integer] = js.undefined,
      Code: js.UndefOr[Integer] = js.undefined
    ): IcmpTypeCode = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Type" -> Type.map { x => x: js.Any }),
        ("Code" -> Code.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IcmpTypeCode]
    }
  }

  /**
   * <p>Describes the ID format for a resource.</p>
   */
  @js.native
  trait IdFormat extends js.Object {
    var Resource: String
    var UseLongIds: Boolean
    var Deadline: DateTime
  }

  object IdFormat {
    def apply(
      Resource: js.UndefOr[String] = js.undefined,
      UseLongIds: js.UndefOr[Boolean] = js.undefined,
      Deadline: js.UndefOr[DateTime] = js.undefined
    ): IdFormat = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Resource" -> Resource.map { x => x: js.Any }),
        ("UseLongIds" -> UseLongIds.map { x => x: js.Any }),
        ("Deadline" -> Deadline.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdFormat]
    }
  }

  /**
   * <p>Describes an image.</p>
   */
  @js.native
  trait Image extends js.Object {
    var CreationDate: String
    var Architecture: ArchitectureValues
    var RamdiskId: String
    var BlockDeviceMappings: BlockDeviceMappingList
    var ImageId: String
    var Name: String
    var RootDeviceName: String
    var Platform: PlatformValues
    var Public: Boolean
    var Description: String
    var KernelId: String
    var ImageType: ImageTypeValues
    var EnaSupport: Boolean
    var RootDeviceType: DeviceType
    var OwnerId: String
    var ProductCodes: ProductCodeList
    var Hypervisor: HypervisorType
    var Tags: TagList
    var ImageOwnerAlias: String
    var VirtualizationType: VirtualizationType
    var StateReason: StateReason
    var State: ImageState
    var ImageLocation: String
    var SriovNetSupport: String
  }

  object Image {
    def apply(
      CreationDate: js.UndefOr[String] = js.undefined,
      Architecture: js.UndefOr[ArchitectureValues] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      RootDeviceName: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      Public: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      ImageType: js.UndefOr[ImageTypeValues] = js.undefined,
      EnaSupport: js.UndefOr[Boolean] = js.undefined,
      RootDeviceType: js.UndefOr[DeviceType] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      Hypervisor: js.UndefOr[HypervisorType] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ImageOwnerAlias: js.UndefOr[String] = js.undefined,
      VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined,
      StateReason: js.UndefOr[StateReason] = js.undefined,
      State: js.UndefOr[ImageState] = js.undefined,
      ImageLocation: js.UndefOr[String] = js.undefined,
      SriovNetSupport: js.UndefOr[String] = js.undefined
    ): Image = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("RootDeviceName" -> RootDeviceName.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("Public" -> Public.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("ImageType" -> ImageType.map { x => x: js.Any }),
        ("EnaSupport" -> EnaSupport.map { x => x: js.Any }),
        ("RootDeviceType" -> RootDeviceType.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("ProductCodes" -> ProductCodes.map { x => x: js.Any }),
        ("Hypervisor" -> Hypervisor.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ImageOwnerAlias" -> ImageOwnerAlias.map { x => x: js.Any }),
        ("VirtualizationType" -> VirtualizationType.map { x => x: js.Any }),
        ("StateReason" -> StateReason.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ImageLocation" -> ImageLocation.map { x => x: js.Any }),
        ("SriovNetSupport" -> SriovNetSupport.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Image]
    }
  }

  /**
   * <p>Describes an image attribute.</p>
   */
  @js.native
  trait ImageAttribute extends js.Object {
    var RamdiskId: AttributeValue
    var BlockDeviceMappings: BlockDeviceMappingList
    var ImageId: String
    var Description: AttributeValue
    var KernelId: AttributeValue
    var ProductCodes: ProductCodeList
    var LaunchPermissions: LaunchPermissionList
    var SriovNetSupport: AttributeValue
  }

  object ImageAttribute {
    def apply(
      RamdiskId: js.UndefOr[AttributeValue] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[AttributeValue] = js.undefined,
      KernelId: js.UndefOr[AttributeValue] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      LaunchPermissions: js.UndefOr[LaunchPermissionList] = js.undefined,
      SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined
    ): ImageAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("ProductCodes" -> ProductCodes.map { x => x: js.Any }),
        ("LaunchPermissions" -> LaunchPermissions.map { x => x: js.Any }),
        ("SriovNetSupport" -> SriovNetSupport.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageAttribute]
    }
  }


  object ImageAttributeNameEnum {
    val description = "description"
    val kernel = "kernel"
    val ramdisk = "ramdisk"
    val launchPermission = "launchPermission"
    val productCodes = "productCodes"
    val blockDeviceMapping = "blockDeviceMapping"
    val sriovNetSupport = "sriovNetSupport"

    val values = IndexedSeq(description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping, sriovNetSupport)
  }

  /**
   * <p>Describes the disk container object for an import image task.</p>
   */
  @js.native
  trait ImageDiskContainer extends js.Object {
    var Format: String
    var SnapshotId: String
    var Description: String
    var Url: String
    var UserBucket: UserBucket
    var DeviceName: String
  }

  object ImageDiskContainer {
    def apply(
      Format: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Url: js.UndefOr[String] = js.undefined,
      UserBucket: js.UndefOr[UserBucket] = js.undefined,
      DeviceName: js.UndefOr[String] = js.undefined
    ): ImageDiskContainer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Format" -> Format.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Url" -> Url.map { x => x: js.Any }),
        ("UserBucket" -> UserBucket.map { x => x: js.Any }),
        ("DeviceName" -> DeviceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImageDiskContainer]
    }
  }


  object ImageStateEnum {
    val pending = "pending"
    val available = "available"
    val invalid = "invalid"
    val deregistered = "deregistered"
    val transient = "transient"
    val failed = "failed"
    val error = "error"

    val values = IndexedSeq(pending, available, invalid, deregistered, transient, failed, error)
  }


  object ImageTypeValuesEnum {
    val machine = "machine"
    val kernel = "kernel"
    val ramdisk = "ramdisk"

    val values = IndexedSeq(machine, kernel, ramdisk)
  }

  /**
   * <p>Contains the parameters for ImportImage.</p>
   */
  @js.native
  trait ImportImageRequest extends js.Object {
    var Architecture: String
    var DryRun: Boolean
    var LicenseType: String
    var DiskContainers: ImageDiskContainerList
    var Platform: String
    var ClientToken: String
    var Description: String
    var ClientData: ClientData
    var Hypervisor: String
    var RoleName: String
  }

  object ImportImageRequest {
    def apply(
      Architecture: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      LicenseType: js.UndefOr[String] = js.undefined,
      DiskContainers: js.UndefOr[ImageDiskContainerList] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ClientData: js.UndefOr[ClientData] = js.undefined,
      Hypervisor: js.UndefOr[String] = js.undefined,
      RoleName: js.UndefOr[String] = js.undefined
    ): ImportImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("LicenseType" -> LicenseType.map { x => x: js.Any }),
        ("DiskContainers" -> DiskContainers.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ClientData" -> ClientData.map { x => x: js.Any }),
        ("Hypervisor" -> Hypervisor.map { x => x: js.Any }),
        ("RoleName" -> RoleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportImageRequest]
    }
  }

  /**
   * <p>Contains the output for ImportImage.</p>
   */
  @js.native
  trait ImportImageResult extends js.Object {
    var Architecture: String
    var StatusMessage: String
    var ImageId: String
    var LicenseType: String
    var Platform: String
    var Description: String
    var SnapshotDetails: SnapshotDetailList
    var Hypervisor: String
    var Progress: String
    var Status: String
    var ImportTaskId: String
  }

  object ImportImageResult {
    def apply(
      Architecture: js.UndefOr[String] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      LicenseType: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.undefined,
      Hypervisor: js.UndefOr[String] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      ImportTaskId: js.UndefOr[String] = js.undefined
    ): ImportImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("LicenseType" -> LicenseType.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("SnapshotDetails" -> SnapshotDetails.map { x => x: js.Any }),
        ("Hypervisor" -> Hypervisor.map { x => x: js.Any }),
        ("Progress" -> Progress.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("ImportTaskId" -> ImportTaskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportImageResult]
    }
  }

  /**
   * <p>Describes an import image task.</p>
   */
  @js.native
  trait ImportImageTask extends js.Object {
    var Architecture: String
    var StatusMessage: String
    var ImageId: String
    var LicenseType: String
    var Platform: String
    var Description: String
    var SnapshotDetails: SnapshotDetailList
    var Hypervisor: String
    var Progress: String
    var Status: String
    var ImportTaskId: String
  }

  object ImportImageTask {
    def apply(
      Architecture: js.UndefOr[String] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      LicenseType: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      SnapshotDetails: js.UndefOr[SnapshotDetailList] = js.undefined,
      Hypervisor: js.UndefOr[String] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      ImportTaskId: js.UndefOr[String] = js.undefined
    ): ImportImageTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("LicenseType" -> LicenseType.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("SnapshotDetails" -> SnapshotDetails.map { x => x: js.Any }),
        ("Hypervisor" -> Hypervisor.map { x => x: js.Any }),
        ("Progress" -> Progress.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("ImportTaskId" -> ImportTaskId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportImageTask]
    }
  }

  /**
   * <p>Describes the launch specification for VM import.</p>
   */
  @js.native
  trait ImportInstanceLaunchSpecification extends js.Object {
    var Architecture: ArchitectureValues
    var InstanceInitiatedShutdownBehavior: ShutdownBehavior
    var PrivateIpAddress: String
    var Placement: Placement
    var UserData: UserData
    var GroupNames: SecurityGroupStringList
    var InstanceType: InstanceType
    var AdditionalInfo: String
    var GroupIds: SecurityGroupIdStringList
    var Monitoring: Boolean
    var SubnetId: String
  }

  object ImportInstanceLaunchSpecification {
    def apply(
      Architecture: js.UndefOr[ArchitectureValues] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Placement: js.UndefOr[Placement] = js.undefined,
      UserData: js.UndefOr[UserData] = js.undefined,
      GroupNames: js.UndefOr[SecurityGroupStringList] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      AdditionalInfo: js.UndefOr[String] = js.undefined,
      GroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      Monitoring: js.UndefOr[Boolean] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): ImportInstanceLaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("Placement" -> Placement.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("GroupNames" -> GroupNames.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("AdditionalInfo" -> AdditionalInfo.map { x => x: js.Any }),
        ("GroupIds" -> GroupIds.map { x => x: js.Any }),
        ("Monitoring" -> Monitoring.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceLaunchSpecification]
    }
  }

  /**
   * <p>Contains the parameters for ImportInstance.</p>
   */
  @js.native
  trait ImportInstanceRequest extends js.Object {
    var DryRun: Boolean
    var Platform: PlatformValues
    var Description: String
    var DiskImages: DiskImageList
    var LaunchSpecification: ImportInstanceLaunchSpecification
  }

  object ImportInstanceRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DiskImages: js.UndefOr[DiskImageList] = js.undefined,
      LaunchSpecification: js.UndefOr[ImportInstanceLaunchSpecification] = js.undefined
    ): ImportInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("DiskImages" -> DiskImages.map { x => x: js.Any }),
        ("LaunchSpecification" -> LaunchSpecification.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceRequest]
    }
  }

  /**
   * <p>Contains the output for ImportInstance.</p>
   */
  @js.native
  trait ImportInstanceResult extends js.Object {
    var ConversionTask: ConversionTask
  }

  object ImportInstanceResult {
    def apply(
      ConversionTask: js.UndefOr[ConversionTask] = js.undefined
    ): ImportInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConversionTask" -> ConversionTask.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceResult]
    }
  }

  /**
   * <p>Describes an import instance task.</p>
   */
  @js.native
  trait ImportInstanceTaskDetails extends js.Object {
    var Volumes: ImportInstanceVolumeDetailSet
    var InstanceId: String
    var Platform: PlatformValues
    var Description: String
  }

  object ImportInstanceTaskDetails {
    def apply(
      Volumes: js.UndefOr[ImportInstanceVolumeDetailSet] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      Description: js.UndefOr[String] = js.undefined
    ): ImportInstanceTaskDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Volumes" -> Volumes.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceTaskDetails]
    }
  }

  /**
   * <p>Describes an import volume task.</p>
   */
  @js.native
  trait ImportInstanceVolumeDetailItem extends js.Object {
    var StatusMessage: String
    var BytesConverted: Long
    var Volume: DiskImageVolumeDescription
    var Description: String
    var AvailabilityZone: String
    var Image: DiskImageDescription
    var Status: String
  }

  object ImportInstanceVolumeDetailItem {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      BytesConverted: js.UndefOr[Long] = js.undefined,
      Volume: js.UndefOr[DiskImageVolumeDescription] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Image: js.UndefOr[DiskImageDescription] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): ImportInstanceVolumeDetailItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("BytesConverted" -> BytesConverted.map { x => x: js.Any }),
        ("Volume" -> Volume.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Image" -> Image.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportInstanceVolumeDetailItem]
    }
  }

  /**
   * <p>Contains the parameters for ImportKeyPair.</p>
   */
  @js.native
  trait ImportKeyPairRequest extends js.Object {
    var DryRun: Boolean
    var KeyName: String
    var PublicKeyMaterial: Blob
  }

  object ImportKeyPairRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      PublicKeyMaterial: js.UndefOr[Blob] = js.undefined
    ): ImportKeyPairRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("PublicKeyMaterial" -> PublicKeyMaterial.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyPairRequest]
    }
  }

  /**
   * <p>Contains the output of ImportKeyPair.</p>
   */
  @js.native
  trait ImportKeyPairResult extends js.Object {
    var KeyName: String
    var KeyFingerprint: String
  }

  object ImportKeyPairResult {
    def apply(
      KeyName: js.UndefOr[String] = js.undefined,
      KeyFingerprint: js.UndefOr[String] = js.undefined
    ): ImportKeyPairResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("KeyFingerprint" -> KeyFingerprint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportKeyPairResult]
    }
  }

  /**
   * <p>Contains the parameters for ImportSnapshot.</p>
   */
  @js.native
  trait ImportSnapshotRequest extends js.Object {
    var DryRun: Boolean
    var DiskContainer: SnapshotDiskContainer
    var ClientToken: String
    var Description: String
    var ClientData: ClientData
    var RoleName: String
  }

  object ImportSnapshotRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DiskContainer: js.UndefOr[SnapshotDiskContainer] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      ClientData: js.UndefOr[ClientData] = js.undefined,
      RoleName: js.UndefOr[String] = js.undefined
    ): ImportSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("DiskContainer" -> DiskContainer.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ClientData" -> ClientData.map { x => x: js.Any }),
        ("RoleName" -> RoleName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportSnapshotRequest]
    }
  }

  /**
   * <p>Contains the output for ImportSnapshot.</p>
   */
  @js.native
  trait ImportSnapshotResult extends js.Object {
    var ImportTaskId: String
    var SnapshotTaskDetail: SnapshotTaskDetail
    var Description: String
  }

  object ImportSnapshotResult {
    def apply(
      ImportTaskId: js.UndefOr[String] = js.undefined,
      SnapshotTaskDetail: js.UndefOr[SnapshotTaskDetail] = js.undefined,
      Description: js.UndefOr[String] = js.undefined
    ): ImportSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ImportTaskId" -> ImportTaskId.map { x => x: js.Any }),
        ("SnapshotTaskDetail" -> SnapshotTaskDetail.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportSnapshotResult]
    }
  }

  /**
   * <p>Describes an import snapshot task.</p>
   */
  @js.native
  trait ImportSnapshotTask extends js.Object {
    var ImportTaskId: String
    var SnapshotTaskDetail: SnapshotTaskDetail
    var Description: String
  }

  object ImportSnapshotTask {
    def apply(
      ImportTaskId: js.UndefOr[String] = js.undefined,
      SnapshotTaskDetail: js.UndefOr[SnapshotTaskDetail] = js.undefined,
      Description: js.UndefOr[String] = js.undefined
    ): ImportSnapshotTask = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ImportTaskId" -> ImportTaskId.map { x => x: js.Any }),
        ("SnapshotTaskDetail" -> SnapshotTaskDetail.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportSnapshotTask]
    }
  }

  /**
   * <p>Contains the parameters for ImportVolume.</p>
   */
  @js.native
  trait ImportVolumeRequest extends js.Object {
    var DryRun: Boolean
    var Volume: VolumeDetail
    var Description: String
    var AvailabilityZone: String
    var Image: DiskImageDetail
  }

  object ImportVolumeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Volume: js.UndefOr[VolumeDetail] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Image: js.UndefOr[DiskImageDetail] = js.undefined
    ): ImportVolumeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Volume" -> Volume.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Image" -> Image.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportVolumeRequest]
    }
  }

  /**
   * <p>Contains the output for ImportVolume.</p>
   */
  @js.native
  trait ImportVolumeResult extends js.Object {
    var ConversionTask: ConversionTask
  }

  object ImportVolumeResult {
    def apply(
      ConversionTask: js.UndefOr[ConversionTask] = js.undefined
    ): ImportVolumeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConversionTask" -> ConversionTask.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportVolumeResult]
    }
  }

  /**
   * <p>Describes an import volume task.</p>
   */
  @js.native
  trait ImportVolumeTaskDetails extends js.Object {
    var BytesConverted: Long
    var Volume: DiskImageVolumeDescription
    var Description: String
    var AvailabilityZone: String
    var Image: DiskImageDescription
  }

  object ImportVolumeTaskDetails {
    def apply(
      BytesConverted: js.UndefOr[Long] = js.undefined,
      Volume: js.UndefOr[DiskImageVolumeDescription] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Image: js.UndefOr[DiskImageDescription] = js.undefined
    ): ImportVolumeTaskDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BytesConverted" -> BytesConverted.map { x => x: js.Any }),
        ("Volume" -> Volume.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Image" -> Image.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ImportVolumeTaskDetails]
    }
  }

  /**
   * <p>Describes an instance.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var Architecture: ArchitectureValues
    var NetworkInterfaces: InstanceNetworkInterfaceList
    var RamdiskId: String
    var BlockDeviceMappings: InstanceBlockDeviceMappingList
    var ImageId: String
    var PrivateIpAddress: String
    var RootDeviceName: String
    var SpotInstanceRequestId: String
    var AmiLaunchIndex: Integer
    var LaunchTime: DateTime
    var EbsOptimized: Boolean
    var Platform: PlatformValues
    var Placement: Placement
    var PrivateDnsName: String
    var ClientToken: String
    var SecurityGroups: GroupIdentifierList
    var KernelId: String
    var EnaSupport: Boolean
    var RootDeviceType: DeviceType
    var PublicIpAddress: String
    var ProductCodes: ProductCodeList
    var KeyName: String
    var Hypervisor: HypervisorType
    var InstanceType: InstanceType
    var InstanceId: String
    var PublicDnsName: String
    var Tags: TagList
    var Monitoring: Monitoring
    var VirtualizationType: VirtualizationType
    var InstanceLifecycle: InstanceLifecycleType
    var StateReason: StateReason
    var SourceDestCheck: Boolean
    var StateTransitionReason: String
    var State: InstanceState
    var IamInstanceProfile: IamInstanceProfile
    var SriovNetSupport: String
    var VpcId: String
    var SubnetId: String
  }

  object Instance {
    def apply(
      Architecture: js.UndefOr[ArchitectureValues] = js.undefined,
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      RootDeviceName: js.UndefOr[String] = js.undefined,
      SpotInstanceRequestId: js.UndefOr[String] = js.undefined,
      AmiLaunchIndex: js.UndefOr[Integer] = js.undefined,
      LaunchTime: js.UndefOr[DateTime] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Platform: js.UndefOr[PlatformValues] = js.undefined,
      Placement: js.UndefOr[Placement] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[GroupIdentifierList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      EnaSupport: js.UndefOr[Boolean] = js.undefined,
      RootDeviceType: js.UndefOr[DeviceType] = js.undefined,
      PublicIpAddress: js.UndefOr[String] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      Hypervisor: js.UndefOr[HypervisorType] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      PublicDnsName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Monitoring: js.UndefOr[Monitoring] = js.undefined,
      VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined,
      InstanceLifecycle: js.UndefOr[InstanceLifecycleType] = js.undefined,
      StateReason: js.UndefOr[StateReason] = js.undefined,
      SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
      StateTransitionReason: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[InstanceState] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfile] = js.undefined,
      SriovNetSupport: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("NetworkInterfaces" -> NetworkInterfaces.map { x => x: js.Any }),
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("RootDeviceName" -> RootDeviceName.map { x => x: js.Any }),
        ("SpotInstanceRequestId" -> SpotInstanceRequestId.map { x => x: js.Any }),
        ("AmiLaunchIndex" -> AmiLaunchIndex.map { x => x: js.Any }),
        ("LaunchTime" -> LaunchTime.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("Placement" -> Placement.map { x => x: js.Any }),
        ("PrivateDnsName" -> PrivateDnsName.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("EnaSupport" -> EnaSupport.map { x => x: js.Any }),
        ("RootDeviceType" -> RootDeviceType.map { x => x: js.Any }),
        ("PublicIpAddress" -> PublicIpAddress.map { x => x: js.Any }),
        ("ProductCodes" -> ProductCodes.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("Hypervisor" -> Hypervisor.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("PublicDnsName" -> PublicDnsName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("Monitoring" -> Monitoring.map { x => x: js.Any }),
        ("VirtualizationType" -> VirtualizationType.map { x => x: js.Any }),
        ("InstanceLifecycle" -> InstanceLifecycle.map { x => x: js.Any }),
        ("StateReason" -> StateReason.map { x => x: js.Any }),
        ("SourceDestCheck" -> SourceDestCheck.map { x => x: js.Any }),
        ("StateTransitionReason" -> StateTransitionReason.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("IamInstanceProfile" -> IamInstanceProfile.map { x => x: js.Any }),
        ("SriovNetSupport" -> SriovNetSupport.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>Describes an instance attribute.</p>
   */
  @js.native
  trait InstanceAttribute extends js.Object {
    var RamdiskId: AttributeValue
    var BlockDeviceMappings: InstanceBlockDeviceMappingList
    var InstanceInitiatedShutdownBehavior: AttributeValue
    var RootDeviceName: AttributeValue
    var EbsOptimized: AttributeBooleanValue
    var DisableApiTermination: AttributeBooleanValue
    var UserData: AttributeValue
    var KernelId: AttributeValue
    var Groups: GroupIdentifierList
    var EnaSupport: AttributeBooleanValue
    var ProductCodes: ProductCodeList
    var InstanceType: AttributeValue
    var InstanceId: String
    var SourceDestCheck: AttributeBooleanValue
    var SriovNetSupport: AttributeValue
  }

  object InstanceAttribute {
    def apply(
      RamdiskId: js.UndefOr[AttributeValue] = js.undefined,
      BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.undefined,
      RootDeviceName: js.UndefOr[AttributeValue] = js.undefined,
      EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.undefined,
      DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.undefined,
      UserData: js.UndefOr[AttributeValue] = js.undefined,
      KernelId: js.UndefOr[AttributeValue] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      EnaSupport: js.UndefOr[AttributeBooleanValue] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeList] = js.undefined,
      InstanceType: js.UndefOr[AttributeValue] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined,
      SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined
    ): InstanceAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x: js.Any }),
        ("RootDeviceName" -> RootDeviceName.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("DisableApiTermination" -> DisableApiTermination.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("EnaSupport" -> EnaSupport.map { x => x: js.Any }),
        ("ProductCodes" -> ProductCodes.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("SourceDestCheck" -> SourceDestCheck.map { x => x: js.Any }),
        ("SriovNetSupport" -> SriovNetSupport.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAttribute]
    }
  }


  object InstanceAttributeNameEnum {
    val instanceType = "instanceType"
    val kernel = "kernel"
    val ramdisk = "ramdisk"
    val userData = "userData"
    val disableApiTermination = "disableApiTermination"
    val instanceInitiatedShutdownBehavior = "instanceInitiatedShutdownBehavior"
    val rootDeviceName = "rootDeviceName"
    val blockDeviceMapping = "blockDeviceMapping"
    val productCodes = "productCodes"
    val sourceDestCheck = "sourceDestCheck"
    val groupSet = "groupSet"
    val ebsOptimized = "ebsOptimized"
    val sriovNetSupport = "sriovNetSupport"
    val enaSupport = "enaSupport"

    val values = IndexedSeq(instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized, sriovNetSupport, enaSupport)
  }

  /**
   * <p>Describes a block device mapping.</p>
   */
  @js.native
  trait InstanceBlockDeviceMapping extends js.Object {
    var DeviceName: String
    var Ebs: EbsInstanceBlockDevice
  }

  object InstanceBlockDeviceMapping {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[EbsInstanceBlockDevice] = js.undefined
    ): InstanceBlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeviceName" -> DeviceName.map { x => x: js.Any }),
        ("Ebs" -> Ebs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceBlockDeviceMapping]
    }
  }

  /**
   * <p>Describes a block device mapping entry.</p>
   */
  @js.native
  trait InstanceBlockDeviceMappingSpecification extends js.Object {
    var DeviceName: String
    var Ebs: EbsInstanceBlockDeviceSpecification
    var VirtualName: String
    var NoDevice: String
  }

  object InstanceBlockDeviceMappingSpecification {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.undefined,
      VirtualName: js.UndefOr[String] = js.undefined,
      NoDevice: js.UndefOr[String] = js.undefined
    ): InstanceBlockDeviceMappingSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeviceName" -> DeviceName.map { x => x: js.Any }),
        ("Ebs" -> Ebs.map { x => x: js.Any }),
        ("VirtualName" -> VirtualName.map { x => x: js.Any }),
        ("NoDevice" -> NoDevice.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceBlockDeviceMappingSpecification]
    }
  }

  /**
   * <p>Information about the instance type that the Dedicated Host supports.</p>
   */
  @js.native
  trait InstanceCapacity extends js.Object {
    var InstanceType: String
    var AvailableCapacity: Integer
    var TotalCapacity: Integer
  }

  object InstanceCapacity {
    def apply(
      InstanceType: js.UndefOr[String] = js.undefined,
      AvailableCapacity: js.UndefOr[Integer] = js.undefined,
      TotalCapacity: js.UndefOr[Integer] = js.undefined
    ): InstanceCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("AvailableCapacity" -> AvailableCapacity.map { x => x: js.Any }),
        ("TotalCapacity" -> TotalCapacity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceCapacity]
    }
  }

  /**
   * <p>Describes a Reserved Instance listing state.</p>
   */
  @js.native
  trait InstanceCount extends js.Object {
    var State: ListingState
    var InstanceCount: Integer
  }

  object InstanceCount {
    def apply(
      State: js.UndefOr[ListingState] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined
    ): InstanceCount = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceCount]
    }
  }

  /**
   * <p>Describes an instance to export.</p>
   */
  @js.native
  trait InstanceExportDetails extends js.Object {
    var InstanceId: String
    var TargetEnvironment: ExportEnvironment
  }

  object InstanceExportDetails {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      TargetEnvironment: js.UndefOr[ExportEnvironment] = js.undefined
    ): InstanceExportDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("TargetEnvironment" -> TargetEnvironment.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceExportDetails]
    }
  }

  /**
   * <p>Describes an IPv6 address.</p>
   */
  @js.native
  trait InstanceIpv6Address extends js.Object {
    var Ipv6Address: String
  }

  object InstanceIpv6Address {
    def apply(
      Ipv6Address: js.UndefOr[String] = js.undefined
    ): InstanceIpv6Address = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6Address" -> Ipv6Address.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceIpv6Address]
    }
  }


  object InstanceLifecycleTypeEnum {
    val spot = "spot"
    val scheduled = "scheduled"

    val values = IndexedSeq(spot, scheduled)
  }

  /**
   * <p>Describes the monitoring of an instance.</p>
   */
  @js.native
  trait InstanceMonitoring extends js.Object {
    var InstanceId: String
    var Monitoring: Monitoring
  }

  object InstanceMonitoring {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      Monitoring: js.UndefOr[Monitoring] = js.undefined
    ): InstanceMonitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Monitoring" -> Monitoring.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceMonitoring]
    }
  }

  /**
   * <p>Describes a network interface.</p>
   */
  @js.native
  trait InstanceNetworkInterface extends js.Object {
    var Ipv6Addresses: InstanceIpv6AddressList
    var PrivateIpAddress: String
    var PrivateDnsName: String
    var Description: String
    var PrivateIpAddresses: InstancePrivateIpAddressList
    var Groups: GroupIdentifierList
    var OwnerId: String
    var Association: InstanceNetworkInterfaceAssociation
    var Attachment: InstanceNetworkInterfaceAttachment
    var NetworkInterfaceId: String
    var SourceDestCheck: Boolean
    var MacAddress: String
    var Status: NetworkInterfaceStatus
    var VpcId: String
    var SubnetId: String
  }

  object InstanceNetworkInterface {
    def apply(
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[InstancePrivateIpAddressList] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.undefined,
      Attachment: js.UndefOr[InstanceNetworkInterfaceAttachment] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
      MacAddress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[NetworkInterfaceStatus] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): InstanceNetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6Addresses" -> Ipv6Addresses.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("PrivateDnsName" -> PrivateDnsName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("PrivateIpAddresses" -> PrivateIpAddresses.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("Association" -> Association.map { x => x: js.Any }),
        ("Attachment" -> Attachment.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("SourceDestCheck" -> SourceDestCheck.map { x => x: js.Any }),
        ("MacAddress" -> MacAddress.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworkInterface]
    }
  }

  /**
   * <p>Describes association information for an Elastic IP address (IPv4).</p>
   */
  @js.native
  trait InstanceNetworkInterfaceAssociation extends js.Object {
    var PublicIp: String
    var PublicDnsName: String
    var IpOwnerId: String
  }

  object InstanceNetworkInterfaceAssociation {
    def apply(
      PublicIp: js.UndefOr[String] = js.undefined,
      PublicDnsName: js.UndefOr[String] = js.undefined,
      IpOwnerId: js.UndefOr[String] = js.undefined
    ): InstanceNetworkInterfaceAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("PublicDnsName" -> PublicDnsName.map { x => x: js.Any }),
        ("IpOwnerId" -> IpOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworkInterfaceAssociation]
    }
  }

  /**
   * <p>Describes a network interface attachment.</p>
   */
  @js.native
  trait InstanceNetworkInterfaceAttachment extends js.Object {
    var AttachmentId: String
    var DeviceIndex: Integer
    var DeleteOnTermination: Boolean
    var AttachTime: DateTime
    var Status: AttachmentStatus
  }

  object InstanceNetworkInterfaceAttachment {
    def apply(
      AttachmentId: js.UndefOr[String] = js.undefined,
      DeviceIndex: js.UndefOr[Integer] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AttachTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[AttachmentStatus] = js.undefined
    ): InstanceNetworkInterfaceAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttachmentId" -> AttachmentId.map { x => x: js.Any }),
        ("DeviceIndex" -> DeviceIndex.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any }),
        ("AttachTime" -> AttachTime.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworkInterfaceAttachment]
    }
  }

  /**
   * <p>Describes a network interface.</p>
   */
  @js.native
  trait InstanceNetworkInterfaceSpecification extends js.Object {
    var Ipv6Addresses: InstanceIpv6AddressList
    var PrivateIpAddress: String
    var Description: String
    var PrivateIpAddresses: PrivateIpAddressSpecificationList
    var Ipv6AddressCount: Integer
    var Groups: SecurityGroupIdStringList
    var DeviceIndex: Integer
    var DeleteOnTermination: Boolean
    var AssociatePublicIpAddress: Boolean
    var NetworkInterfaceId: String
    var SecondaryPrivateIpAddressCount: Integer
    var SubnetId: String
  }

  object InstanceNetworkInterfaceSpecification {
    def apply(
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Integer] = js.undefined,
      Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      DeviceIndex: js.UndefOr[Integer] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): InstanceNetworkInterfaceSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6Addresses" -> Ipv6Addresses.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("PrivateIpAddresses" -> PrivateIpAddresses.map { x => x: js.Any }),
        ("Ipv6AddressCount" -> Ipv6AddressCount.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("DeviceIndex" -> DeviceIndex.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any }),
        ("AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceNetworkInterfaceSpecification]
    }
  }

  /**
   * <p>Describes a private IPv4 address.</p>
   */
  @js.native
  trait InstancePrivateIpAddress extends js.Object {
    var PrivateIpAddress: String
    var PrivateDnsName: String
    var Primary: Boolean
    var Association: InstanceNetworkInterfaceAssociation
  }

  object InstancePrivateIpAddress {
    def apply(
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      Primary: js.UndefOr[Boolean] = js.undefined,
      Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.undefined
    ): InstancePrivateIpAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("PrivateDnsName" -> PrivateDnsName.map { x => x: js.Any }),
        ("Primary" -> Primary.map { x => x: js.Any }),
        ("Association" -> Association.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstancePrivateIpAddress]
    }
  }

  /**
   * <p>Describes the current state of an instance.</p>
   */
  @js.native
  trait InstanceState extends js.Object {
    var Code: Integer
    var Name: InstanceStateName
  }

  object InstanceState {
    def apply(
      Code: js.UndefOr[Integer] = js.undefined,
      Name: js.UndefOr[InstanceStateName] = js.undefined
    ): InstanceState = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceState]
    }
  }

  /**
   * <p>Describes an instance state change.</p>
   */
  @js.native
  trait InstanceStateChange extends js.Object {
    var InstanceId: String
    var CurrentState: InstanceState
    var PreviousState: InstanceState
  }

  object InstanceStateChange {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      CurrentState: js.UndefOr[InstanceState] = js.undefined,
      PreviousState: js.UndefOr[InstanceState] = js.undefined
    ): InstanceStateChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("CurrentState" -> CurrentState.map { x => x: js.Any }),
        ("PreviousState" -> PreviousState.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStateChange]
    }
  }


  object InstanceStateNameEnum {
    val pending = "pending"
    val running = "running"
    val `shutting-down` = "shutting-down"
    val terminated = "terminated"
    val stopping = "stopping"
    val stopped = "stopped"

    val values = IndexedSeq(pending, running, `shutting-down`, terminated, stopping, stopped)
  }

  /**
   * <p>Describes the status of an instance.</p>
   */
  @js.native
  trait InstanceStatus extends js.Object {
    var InstanceStatus: InstanceStatusSummary
    var InstanceState: InstanceState
    var AvailabilityZone: String
    var SystemStatus: InstanceStatusSummary
    var Events: InstanceStatusEventList
    var InstanceId: String
  }

  object InstanceStatus {
    def apply(
      InstanceStatus: js.UndefOr[InstanceStatusSummary] = js.undefined,
      InstanceState: js.UndefOr[InstanceState] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      SystemStatus: js.UndefOr[InstanceStatusSummary] = js.undefined,
      Events: js.UndefOr[InstanceStatusEventList] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined
    ): InstanceStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceStatus" -> InstanceStatus.map { x => x: js.Any }),
        ("InstanceState" -> InstanceState.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("SystemStatus" -> SystemStatus.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatus]
    }
  }

  /**
   * <p>Describes the instance status.</p>
   */
  @js.native
  trait InstanceStatusDetails extends js.Object {
    var Name: StatusName
    var Status: StatusType
    var ImpairedSince: DateTime
  }

  object InstanceStatusDetails {
    def apply(
      Name: js.UndefOr[StatusName] = js.undefined,
      Status: js.UndefOr[StatusType] = js.undefined,
      ImpairedSince: js.UndefOr[DateTime] = js.undefined
    ): InstanceStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("ImpairedSince" -> ImpairedSince.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatusDetails]
    }
  }

  /**
   * <p>Describes a scheduled event for an instance.</p>
   */
  @js.native
  trait InstanceStatusEvent extends js.Object {
    var Code: EventCode
    var Description: String
    var NotBefore: DateTime
    var NotAfter: DateTime
  }

  object InstanceStatusEvent {
    def apply(
      Code: js.UndefOr[EventCode] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      NotBefore: js.UndefOr[DateTime] = js.undefined,
      NotAfter: js.UndefOr[DateTime] = js.undefined
    ): InstanceStatusEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("NotBefore" -> NotBefore.map { x => x: js.Any }),
        ("NotAfter" -> NotAfter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatusEvent]
    }
  }

  /**
   * <p>Describes the status of an instance.</p>
   */
  @js.native
  trait InstanceStatusSummary extends js.Object {
    var Status: SummaryStatus
    var Details: InstanceStatusDetailsList
  }

  object InstanceStatusSummary {
    def apply(
      Status: js.UndefOr[SummaryStatus] = js.undefined,
      Details: js.UndefOr[InstanceStatusDetailsList] = js.undefined
    ): InstanceStatusSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("Details" -> Details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceStatusSummary]
    }
  }


  object InstanceTypeEnum {
    val `t1.micro` = "t1.micro"
    val `t2.nano` = "t2.nano"
    val `t2.micro` = "t2.micro"
    val `t2.small` = "t2.small"
    val `t2.medium` = "t2.medium"
    val `t2.large` = "t2.large"
    val `t2.xlarge` = "t2.xlarge"
    val `t2.2xlarge` = "t2.2xlarge"
    val `m1.small` = "m1.small"
    val `m1.medium` = "m1.medium"
    val `m1.large` = "m1.large"
    val `m1.xlarge` = "m1.xlarge"
    val `m3.medium` = "m3.medium"
    val `m3.large` = "m3.large"
    val `m3.xlarge` = "m3.xlarge"
    val `m3.2xlarge` = "m3.2xlarge"
    val `m4.large` = "m4.large"
    val `m4.xlarge` = "m4.xlarge"
    val `m4.2xlarge` = "m4.2xlarge"
    val `m4.4xlarge` = "m4.4xlarge"
    val `m4.10xlarge` = "m4.10xlarge"
    val `m4.16xlarge` = "m4.16xlarge"
    val `m2.xlarge` = "m2.xlarge"
    val `m2.2xlarge` = "m2.2xlarge"
    val `m2.4xlarge` = "m2.4xlarge"
    val `cr1.8xlarge` = "cr1.8xlarge"
    val `r3.large` = "r3.large"
    val `r3.xlarge` = "r3.xlarge"
    val `r3.2xlarge` = "r3.2xlarge"
    val `r3.4xlarge` = "r3.4xlarge"
    val `r3.8xlarge` = "r3.8xlarge"
    val `r4.large` = "r4.large"
    val `r4.xlarge` = "r4.xlarge"
    val `r4.2xlarge` = "r4.2xlarge"
    val `r4.4xlarge` = "r4.4xlarge"
    val `r4.8xlarge` = "r4.8xlarge"
    val `r4.16xlarge` = "r4.16xlarge"
    val `x1.16xlarge` = "x1.16xlarge"
    val `x1.32xlarge` = "x1.32xlarge"
    val `i2.xlarge` = "i2.xlarge"
    val `i2.2xlarge` = "i2.2xlarge"
    val `i2.4xlarge` = "i2.4xlarge"
    val `i2.8xlarge` = "i2.8xlarge"
    val `hi1.4xlarge` = "hi1.4xlarge"
    val `hs1.8xlarge` = "hs1.8xlarge"
    val `c1.medium` = "c1.medium"
    val `c1.xlarge` = "c1.xlarge"
    val `c3.large` = "c3.large"
    val `c3.xlarge` = "c3.xlarge"
    val `c3.2xlarge` = "c3.2xlarge"
    val `c3.4xlarge` = "c3.4xlarge"
    val `c3.8xlarge` = "c3.8xlarge"
    val `c4.large` = "c4.large"
    val `c4.xlarge` = "c4.xlarge"
    val `c4.2xlarge` = "c4.2xlarge"
    val `c4.4xlarge` = "c4.4xlarge"
    val `c4.8xlarge` = "c4.8xlarge"
    val `cc1.4xlarge` = "cc1.4xlarge"
    val `cc2.8xlarge` = "cc2.8xlarge"
    val `g2.2xlarge` = "g2.2xlarge"
    val `g2.8xlarge` = "g2.8xlarge"
    val `cg1.4xlarge` = "cg1.4xlarge"
    val `p2.xlarge` = "p2.xlarge"
    val `p2.8xlarge` = "p2.8xlarge"
    val `p2.16xlarge` = "p2.16xlarge"
    val `d2.xlarge` = "d2.xlarge"
    val `d2.2xlarge` = "d2.2xlarge"
    val `d2.4xlarge` = "d2.4xlarge"
    val `d2.8xlarge` = "d2.8xlarge"
    val `f1.2xlarge` = "f1.2xlarge"
    val `f1.16xlarge` = "f1.16xlarge"

    val values = IndexedSeq(`t1.micro`, `t2.nano`, `t2.micro`, `t2.small`, `t2.medium`, `t2.large`, `t2.xlarge`, `t2.2xlarge`, `m1.small`, `m1.medium`, `m1.large`, `m1.xlarge`, `m3.medium`, `m3.large`, `m3.xlarge`, `m3.2xlarge`, `m4.large`, `m4.xlarge`, `m4.2xlarge`, `m4.4xlarge`, `m4.10xlarge`, `m4.16xlarge`, `m2.xlarge`, `m2.2xlarge`, `m2.4xlarge`, `cr1.8xlarge`, `r3.large`, `r3.xlarge`, `r3.2xlarge`, `r3.4xlarge`, `r3.8xlarge`, `r4.large`, `r4.xlarge`, `r4.2xlarge`, `r4.4xlarge`, `r4.8xlarge`, `r4.16xlarge`, `x1.16xlarge`, `x1.32xlarge`, `i2.xlarge`, `i2.2xlarge`, `i2.4xlarge`, `i2.8xlarge`, `hi1.4xlarge`, `hs1.8xlarge`, `c1.medium`, `c1.xlarge`, `c3.large`, `c3.xlarge`, `c3.2xlarge`, `c3.4xlarge`, `c3.8xlarge`, `c4.large`, `c4.xlarge`, `c4.2xlarge`, `c4.4xlarge`, `c4.8xlarge`, `cc1.4xlarge`, `cc2.8xlarge`, `g2.2xlarge`, `g2.8xlarge`, `cg1.4xlarge`, `p2.xlarge`, `p2.8xlarge`, `p2.16xlarge`, `d2.xlarge`, `d2.2xlarge`, `d2.4xlarge`, `d2.8xlarge`, `f1.2xlarge`, `f1.16xlarge`)
  }

  /**
   * <p>Describes an Internet gateway.</p>
   */
  @js.native
  trait InternetGateway extends js.Object {
    var InternetGatewayId: String
    var Attachments: InternetGatewayAttachmentList
    var Tags: TagList
  }

  object InternetGateway {
    def apply(
      InternetGatewayId: js.UndefOr[String] = js.undefined,
      Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): InternetGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InternetGatewayId" -> InternetGatewayId.map { x => x: js.Any }),
        ("Attachments" -> Attachments.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InternetGateway]
    }
  }

  /**
   * <p>Describes the attachment of a VPC to an Internet gateway or an egress-only Internet gateway.</p>
   */
  @js.native
  trait InternetGatewayAttachment extends js.Object {
    var VpcId: String
    var State: AttachmentStatus
  }

  object InternetGatewayAttachment {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[AttachmentStatus] = js.undefined
    ): InternetGatewayAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InternetGatewayAttachment]
    }
  }

  /**
   * <p>Describes a security group rule.</p>
   */
  @js.native
  trait IpPermission extends js.Object {
    var PrefixListIds: PrefixListIdList
    var UserIdGroupPairs: UserIdGroupPairList
    var Ipv6Ranges: Ipv6RangeList
    var IpRanges: IpRangeList
    var ToPort: Integer
    var FromPort: Integer
    var IpProtocol: String
  }

  object IpPermission {
    def apply(
      PrefixListIds: js.UndefOr[PrefixListIdList] = js.undefined,
      UserIdGroupPairs: js.UndefOr[UserIdGroupPairList] = js.undefined,
      Ipv6Ranges: js.UndefOr[Ipv6RangeList] = js.undefined,
      IpRanges: js.UndefOr[IpRangeList] = js.undefined,
      ToPort: js.UndefOr[Integer] = js.undefined,
      FromPort: js.UndefOr[Integer] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined
    ): IpPermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrefixListIds" -> PrefixListIds.map { x => x: js.Any }),
        ("UserIdGroupPairs" -> UserIdGroupPairs.map { x => x: js.Any }),
        ("Ipv6Ranges" -> Ipv6Ranges.map { x => x: js.Any }),
        ("IpRanges" -> IpRanges.map { x => x: js.Any }),
        ("ToPort" -> ToPort.map { x => x: js.Any }),
        ("FromPort" -> FromPort.map { x => x: js.Any }),
        ("IpProtocol" -> IpProtocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpPermission]
    }
  }

  /**
   * <p>Describes an IPv4 range.</p>
   */
  @js.native
  trait IpRange extends js.Object {
    var CidrIp: String
  }

  object IpRange {
    def apply(
      CidrIp: js.UndefOr[String] = js.undefined
    ): IpRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CidrIp" -> CidrIp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpRange]
    }
  }

  /**
   * <p>Describes an IPv6 CIDR block.</p>
   */
  @js.native
  trait Ipv6CidrBlock extends js.Object {
    var Ipv6CidrBlock: String
  }

  object Ipv6CidrBlock {
    def apply(
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined
    ): Ipv6CidrBlock = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ipv6CidrBlock]
    }
  }

  /**
   * <p>[EC2-VPC only] Describes an IPv6 range.</p>
   */
  @js.native
  trait Ipv6Range extends js.Object {
    var CidrIpv6: String
  }

  object Ipv6Range {
    def apply(
      CidrIpv6: js.UndefOr[String] = js.undefined
    ): Ipv6Range = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CidrIpv6" -> CidrIpv6.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Ipv6Range]
    }
  }

  /**
   * <p>Describes a key pair.</p>
   */
  @js.native
  trait KeyPair extends js.Object {
    var KeyName: String
    var KeyFingerprint: String
    var KeyMaterial: String
  }

  object KeyPair {
    def apply(
      KeyName: js.UndefOr[String] = js.undefined,
      KeyFingerprint: js.UndefOr[String] = js.undefined,
      KeyMaterial: js.UndefOr[String] = js.undefined
    ): KeyPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("KeyFingerprint" -> KeyFingerprint.map { x => x: js.Any }),
        ("KeyMaterial" -> KeyMaterial.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPair]
    }
  }

  /**
   * <p>Describes a key pair.</p>
   */
  @js.native
  trait KeyPairInfo extends js.Object {
    var KeyName: String
    var KeyFingerprint: String
  }

  object KeyPairInfo {
    def apply(
      KeyName: js.UndefOr[String] = js.undefined,
      KeyFingerprint: js.UndefOr[String] = js.undefined
    ): KeyPairInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("KeyFingerprint" -> KeyFingerprint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KeyPairInfo]
    }
  }

  /**
   * <p>Describes a launch permission.</p>
   */
  @js.native
  trait LaunchPermission extends js.Object {
    var UserId: String
    var Group: PermissionGroup
  }

  object LaunchPermission {
    def apply(
      UserId: js.UndefOr[String] = js.undefined,
      Group: js.UndefOr[PermissionGroup] = js.undefined
    ): LaunchPermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserId" -> UserId.map { x => x: js.Any }),
        ("Group" -> Group.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchPermission]
    }
  }

  /**
   * <p>Describes a launch permission modification.</p>
   */
  @js.native
  trait LaunchPermissionModifications extends js.Object {
    var Add: LaunchPermissionList
    var Remove: LaunchPermissionList
  }

  object LaunchPermissionModifications {
    def apply(
      Add: js.UndefOr[LaunchPermissionList] = js.undefined,
      Remove: js.UndefOr[LaunchPermissionList] = js.undefined
    ): LaunchPermissionModifications = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Add" -> Add.map { x => x: js.Any }),
        ("Remove" -> Remove.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchPermissionModifications]
    }
  }

  /**
   * <p>Describes the launch specification for an instance.</p>
   */
  @js.native
  trait LaunchSpecification extends js.Object {
    var NetworkInterfaces: InstanceNetworkInterfaceSpecificationList
    var RamdiskId: String
    var BlockDeviceMappings: BlockDeviceMappingList
    var ImageId: String
    var EbsOptimized: Boolean
    var Placement: SpotPlacement
    var UserData: String
    var AddressingType: String
    var SecurityGroups: GroupIdentifierList
    var KernelId: String
    var KeyName: String
    var InstanceType: InstanceType
    var Monitoring: RunInstancesMonitoringEnabled
    var IamInstanceProfile: IamInstanceProfileSpecification
    var SubnetId: String
  }

  object LaunchSpecification {
    def apply(
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[SpotPlacement] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      AddressingType: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[GroupIdentifierList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): LaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaces" -> NetworkInterfaces.map { x => x: js.Any }),
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("Placement" -> Placement.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("AddressingType" -> AddressingType.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("Monitoring" -> Monitoring.map { x => x: js.Any }),
        ("IamInstanceProfile" -> IamInstanceProfile.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchSpecification]
    }
  }


  object ListingStateEnum {
    val available = "available"
    val sold = "sold"
    val cancelled = "cancelled"
    val pending = "pending"

    val values = IndexedSeq(available, sold, cancelled, pending)
  }


  object ListingStatusEnum {
    val active = "active"
    val pending = "pending"
    val cancelled = "cancelled"
    val closed = "closed"

    val values = IndexedSeq(active, pending, cancelled, closed)
  }

  /**
   * <p>Contains the parameters for ModifyHosts.</p>
   */
  @js.native
  trait ModifyHostsRequest extends js.Object {
    var HostIds: RequestHostIdList
    var AutoPlacement: AutoPlacement
  }

  object ModifyHostsRequest {
    def apply(
      HostIds: js.UndefOr[RequestHostIdList] = js.undefined,
      AutoPlacement: js.UndefOr[AutoPlacement] = js.undefined
    ): ModifyHostsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostIds" -> HostIds.map { x => x: js.Any }),
        ("AutoPlacement" -> AutoPlacement.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHostsRequest]
    }
  }

  /**
   * <p>Contains the output of ModifyHosts.</p>
   */
  @js.native
  trait ModifyHostsResult extends js.Object {
    var Successful: ResponseHostIdList
    var Unsuccessful: UnsuccessfulItemList
  }

  object ModifyHostsResult {
    def apply(
      Successful: js.UndefOr[ResponseHostIdList] = js.undefined,
      Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.undefined
    ): ModifyHostsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Successful" -> Successful.map { x => x: js.Any }),
        ("Unsuccessful" -> Unsuccessful.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyHostsResult]
    }
  }

  /**
   * <p>Contains the parameters of ModifyIdFormat.</p>
   */
  @js.native
  trait ModifyIdFormatRequest extends js.Object {
    var Resource: String
    var UseLongIds: Boolean
  }

  object ModifyIdFormatRequest {
    def apply(
      Resource: js.UndefOr[String] = js.undefined,
      UseLongIds: js.UndefOr[Boolean] = js.undefined
    ): ModifyIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Resource" -> Resource.map { x => x: js.Any }),
        ("UseLongIds" -> UseLongIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyIdFormatRequest]
    }
  }

  /**
   * <p>Contains the parameters of ModifyIdentityIdFormat.</p>
   */
  @js.native
  trait ModifyIdentityIdFormatRequest extends js.Object {
    var Resource: String
    var UseLongIds: Boolean
    var PrincipalArn: String
  }

  object ModifyIdentityIdFormatRequest {
    def apply(
      Resource: js.UndefOr[String] = js.undefined,
      UseLongIds: js.UndefOr[Boolean] = js.undefined,
      PrincipalArn: js.UndefOr[String] = js.undefined
    ): ModifyIdentityIdFormatRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Resource" -> Resource.map { x => x: js.Any }),
        ("UseLongIds" -> UseLongIds.map { x => x: js.Any }),
        ("PrincipalArn" -> PrincipalArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyIdentityIdFormatRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyImageAttribute.</p>
   */
  @js.native
  trait ModifyImageAttributeRequest extends js.Object {
    var DryRun: Boolean
    var ImageId: String
    var UserGroups: UserGroupStringList
    var Description: AttributeValue
    var UserIds: UserIdStringList
    var Value: String
    var LaunchPermission: LaunchPermissionModifications
    var OperationType: OperationType
    var ProductCodes: ProductCodeStringList
    var Attribute: String
  }

  object ModifyImageAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      UserGroups: js.UndefOr[UserGroupStringList] = js.undefined,
      Description: js.UndefOr[AttributeValue] = js.undefined,
      UserIds: js.UndefOr[UserIdStringList] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      LaunchPermission: js.UndefOr[LaunchPermissionModifications] = js.undefined,
      OperationType: js.UndefOr[OperationType] = js.undefined,
      ProductCodes: js.UndefOr[ProductCodeStringList] = js.undefined,
      Attribute: js.UndefOr[String] = js.undefined
    ): ModifyImageAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("UserGroups" -> UserGroups.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("UserIds" -> UserIds.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("LaunchPermission" -> LaunchPermission.map { x => x: js.Any }),
        ("OperationType" -> OperationType.map { x => x: js.Any }),
        ("ProductCodes" -> ProductCodes.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyImageAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyInstanceAttribute.</p>
   */
  @js.native
  trait ModifyInstanceAttributeRequest extends js.Object {
    var BlockDeviceMappings: InstanceBlockDeviceMappingSpecificationList
    var DryRun: Boolean
    var InstanceInitiatedShutdownBehavior: AttributeValue
    var EbsOptimized: AttributeBooleanValue
    var DisableApiTermination: AttributeBooleanValue
    var UserData: BlobAttributeValue
    var Groups: GroupIdStringList
    var Value: String
    var EnaSupport: AttributeBooleanValue
    var Ramdisk: AttributeValue
    var InstanceType: AttributeValue
    var InstanceId: String
    var Kernel: AttributeValue
    var SourceDestCheck: AttributeBooleanValue
    var SriovNetSupport: AttributeValue
    var Attribute: InstanceAttributeName
  }

  object ModifyInstanceAttributeRequest {
    def apply(
      BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingSpecificationList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.undefined,
      EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.undefined,
      DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.undefined,
      UserData: js.UndefOr[BlobAttributeValue] = js.undefined,
      Groups: js.UndefOr[GroupIdStringList] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      EnaSupport: js.UndefOr[AttributeBooleanValue] = js.undefined,
      Ramdisk: js.UndefOr[AttributeValue] = js.undefined,
      InstanceType: js.UndefOr[AttributeValue] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Kernel: js.UndefOr[AttributeValue] = js.undefined,
      SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined,
      SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined,
      Attribute: js.UndefOr[InstanceAttributeName] = js.undefined
    ): ModifyInstanceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("DisableApiTermination" -> DisableApiTermination.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("EnaSupport" -> EnaSupport.map { x => x: js.Any }),
        ("Ramdisk" -> Ramdisk.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Kernel" -> Kernel.map { x => x: js.Any }),
        ("SourceDestCheck" -> SourceDestCheck.map { x => x: js.Any }),
        ("SriovNetSupport" -> SriovNetSupport.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstanceAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyInstancePlacement.</p>
   */
  @js.native
  trait ModifyInstancePlacementRequest extends js.Object {
    var InstanceId: String
    var Tenancy: HostTenancy
    var Affinity: Affinity
    var HostId: String
  }

  object ModifyInstancePlacementRequest {
    def apply(
      InstanceId: js.UndefOr[String] = js.undefined,
      Tenancy: js.UndefOr[HostTenancy] = js.undefined,
      Affinity: js.UndefOr[Affinity] = js.undefined,
      HostId: js.UndefOr[String] = js.undefined
    ): ModifyInstancePlacementRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Tenancy" -> Tenancy.map { x => x: js.Any }),
        ("Affinity" -> Affinity.map { x => x: js.Any }),
        ("HostId" -> HostId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstancePlacementRequest]
    }
  }

  /**
   * <p>Contains the output of ModifyInstancePlacement.</p>
   */
  @js.native
  trait ModifyInstancePlacementResult extends js.Object {
    var Return: Boolean
  }

  object ModifyInstancePlacementResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): ModifyInstancePlacementResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyInstancePlacementResult]
    }
  }

  /**
   * <p>Contains the parameters for ModifyNetworkInterfaceAttribute.</p>
   */
  @js.native
  trait ModifyNetworkInterfaceAttributeRequest extends js.Object {
    var DryRun: Boolean
    var Description: AttributeValue
    var Groups: SecurityGroupIdStringList
    var Attachment: NetworkInterfaceAttachmentChanges
    var NetworkInterfaceId: String
    var SourceDestCheck: AttributeBooleanValue
  }

  object ModifyNetworkInterfaceAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[AttributeValue] = js.undefined,
      Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      Attachment: js.UndefOr[NetworkInterfaceAttachmentChanges] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
    ): ModifyNetworkInterfaceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("Attachment" -> Attachment.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("SourceDestCheck" -> SourceDestCheck.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyNetworkInterfaceAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyReservedInstances.</p>
   */
  @js.native
  trait ModifyReservedInstancesRequest extends js.Object {
    var ClientToken: String
    var ReservedInstancesIds: ReservedInstancesIdStringList
    var TargetConfigurations: ReservedInstancesConfigurationList
  }

  object ModifyReservedInstancesRequest {
    def apply(
      ClientToken: js.UndefOr[String] = js.undefined,
      ReservedInstancesIds: js.UndefOr[ReservedInstancesIdStringList] = js.undefined,
      TargetConfigurations: js.UndefOr[ReservedInstancesConfigurationList] = js.undefined
    ): ModifyReservedInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("ReservedInstancesIds" -> ReservedInstancesIds.map { x => x: js.Any }),
        ("TargetConfigurations" -> TargetConfigurations.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReservedInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of ModifyReservedInstances.</p>
   */
  @js.native
  trait ModifyReservedInstancesResult extends js.Object {
    var ReservedInstancesModificationId: String
  }

  object ModifyReservedInstancesResult {
    def apply(
      ReservedInstancesModificationId: js.UndefOr[String] = js.undefined
    ): ModifyReservedInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesModificationId" -> ReservedInstancesModificationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyReservedInstancesResult]
    }
  }

  /**
   * <p>Contains the parameters for ModifySnapshotAttribute.</p>
   */
  @js.native
  trait ModifySnapshotAttributeRequest extends js.Object {
    var DryRun: Boolean
    var SnapshotId: String
    var UserIds: UserIdStringList
    var GroupNames: GroupNameStringList
    var OperationType: OperationType
    var CreateVolumePermission: CreateVolumePermissionModifications
    var Attribute: SnapshotAttributeName
  }

  object ModifySnapshotAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      UserIds: js.UndefOr[UserIdStringList] = js.undefined,
      GroupNames: js.UndefOr[GroupNameStringList] = js.undefined,
      OperationType: js.UndefOr[OperationType] = js.undefined,
      CreateVolumePermission: js.UndefOr[CreateVolumePermissionModifications] = js.undefined,
      Attribute: js.UndefOr[SnapshotAttributeName] = js.undefined
    ): ModifySnapshotAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("UserIds" -> UserIds.map { x => x: js.Any }),
        ("GroupNames" -> GroupNames.map { x => x: js.Any }),
        ("OperationType" -> OperationType.map { x => x: js.Any }),
        ("CreateVolumePermission" -> CreateVolumePermission.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySnapshotAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifySpotFleetRequest.</p>
   */
  @js.native
  trait ModifySpotFleetRequestRequest extends js.Object {
    var SpotFleetRequestId: String
    var TargetCapacity: Integer
    var ExcessCapacityTerminationPolicy: ExcessCapacityTerminationPolicy
  }

  object ModifySpotFleetRequestRequest {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      TargetCapacity: js.UndefOr[Integer] = js.undefined,
      ExcessCapacityTerminationPolicy: js.UndefOr[ExcessCapacityTerminationPolicy] = js.undefined
    ): ModifySpotFleetRequestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotFleetRequestId" -> SpotFleetRequestId.map { x => x: js.Any }),
        ("TargetCapacity" -> TargetCapacity.map { x => x: js.Any }),
        ("ExcessCapacityTerminationPolicy" -> ExcessCapacityTerminationPolicy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySpotFleetRequestRequest]
    }
  }

  /**
   * <p>Contains the output of ModifySpotFleetRequest.</p>
   */
  @js.native
  trait ModifySpotFleetRequestResponse extends js.Object {
    var Return: Boolean
  }

  object ModifySpotFleetRequestResponse {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): ModifySpotFleetRequestResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySpotFleetRequestResponse]
    }
  }

  /**
   * <p>Contains the parameters for ModifySubnetAttribute.</p>
   */
  @js.native
  trait ModifySubnetAttributeRequest extends js.Object {
    var SubnetId: String
    var MapPublicIpOnLaunch: AttributeBooleanValue
    var AssignIpv6AddressOnCreation: AttributeBooleanValue
  }

  object ModifySubnetAttributeRequest {
    def apply(
      SubnetId: js.UndefOr[String] = js.undefined,
      MapPublicIpOnLaunch: js.UndefOr[AttributeBooleanValue] = js.undefined,
      AssignIpv6AddressOnCreation: js.UndefOr[AttributeBooleanValue] = js.undefined
    ): ModifySubnetAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetId" -> SubnetId.map { x => x: js.Any }),
        ("MapPublicIpOnLaunch" -> MapPublicIpOnLaunch.map { x => x: js.Any }),
        ("AssignIpv6AddressOnCreation" -> AssignIpv6AddressOnCreation.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifySubnetAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyVolumeAttribute.</p>
   */
  @js.native
  trait ModifyVolumeAttributeRequest extends js.Object {
    var DryRun: Boolean
    var VolumeId: String
    var AutoEnableIO: AttributeBooleanValue
  }

  object ModifyVolumeAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      AutoEnableIO: js.UndefOr[AttributeBooleanValue] = js.undefined
    ): ModifyVolumeAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("AutoEnableIO" -> AutoEnableIO.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVolumeAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyVpcAttribute.</p>
   */
  @js.native
  trait ModifyVpcAttributeRequest extends js.Object {
    var VpcId: String
    var EnableDnsSupport: AttributeBooleanValue
    var EnableDnsHostnames: AttributeBooleanValue
  }

  object ModifyVpcAttributeRequest {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.undefined,
      EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.undefined
    ): ModifyVpcAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("EnableDnsSupport" -> EnableDnsSupport.map { x => x: js.Any }),
        ("EnableDnsHostnames" -> EnableDnsHostnames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ModifyVpcEndpoint.</p>
   */
  @js.native
  trait ModifyVpcEndpointRequest extends js.Object {
    var DryRun: Boolean
    var VpcEndpointId: String
    var PolicyDocument: String
    var ResetPolicy: Boolean
    var RemoveRouteTableIds: ValueStringList
    var AddRouteTableIds: ValueStringList
  }

  object ModifyVpcEndpointRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcEndpointId: js.UndefOr[String] = js.undefined,
      PolicyDocument: js.UndefOr[String] = js.undefined,
      ResetPolicy: js.UndefOr[Boolean] = js.undefined,
      RemoveRouteTableIds: js.UndefOr[ValueStringList] = js.undefined,
      AddRouteTableIds: js.UndefOr[ValueStringList] = js.undefined
    ): ModifyVpcEndpointRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcEndpointId" -> VpcEndpointId.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any }),
        ("ResetPolicy" -> ResetPolicy.map { x => x: js.Any }),
        ("RemoveRouteTableIds" -> RemoveRouteTableIds.map { x => x: js.Any }),
        ("AddRouteTableIds" -> AddRouteTableIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointRequest]
    }
  }

  /**
   * <p>Contains the output of ModifyVpcEndpoint.</p>
   */
  @js.native
  trait ModifyVpcEndpointResult extends js.Object {
    var Return: Boolean
  }

  object ModifyVpcEndpointResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): ModifyVpcEndpointResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcEndpointResult]
    }
  }

  @js.native
  trait ModifyVpcPeeringConnectionOptionsRequest extends js.Object {
    var DryRun: Boolean
    var VpcPeeringConnectionId: String
    var RequesterPeeringConnectionOptions: PeeringConnectionOptionsRequest
    var AccepterPeeringConnectionOptions: PeeringConnectionOptionsRequest
  }

  object ModifyVpcPeeringConnectionOptionsRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined,
      AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest] = js.undefined
    ): ModifyVpcPeeringConnectionOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any }),
        ("RequesterPeeringConnectionOptions" -> RequesterPeeringConnectionOptions.map { x => x: js.Any }),
        ("AccepterPeeringConnectionOptions" -> AccepterPeeringConnectionOptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcPeeringConnectionOptionsRequest]
    }
  }

  @js.native
  trait ModifyVpcPeeringConnectionOptionsResult extends js.Object {
    var RequesterPeeringConnectionOptions: PeeringConnectionOptions
    var AccepterPeeringConnectionOptions: PeeringConnectionOptions
  }

  object ModifyVpcPeeringConnectionOptionsResult {
    def apply(
      RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.undefined,
      AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions] = js.undefined
    ): ModifyVpcPeeringConnectionOptionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RequesterPeeringConnectionOptions" -> RequesterPeeringConnectionOptions.map { x => x: js.Any }),
        ("AccepterPeeringConnectionOptions" -> AccepterPeeringConnectionOptions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyVpcPeeringConnectionOptionsResult]
    }
  }

  /**
   * <p>Contains the parameters for MonitorInstances.</p>
   */
  @js.native
  trait MonitorInstancesRequest extends js.Object {
    var DryRun: Boolean
    var InstanceIds: InstanceIdStringList
  }

  object MonitorInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined
    ): MonitorInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitorInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of MonitorInstances.</p>
   */
  @js.native
  trait MonitorInstancesResult extends js.Object {
    var InstanceMonitorings: InstanceMonitoringList
  }

  object MonitorInstancesResult {
    def apply(
      InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.undefined
    ): MonitorInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceMonitorings" -> InstanceMonitorings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonitorInstancesResult]
    }
  }

  /**
   * <p>Describes the monitoring of an instance.</p>
   */
  @js.native
  trait Monitoring extends js.Object {
    var State: MonitoringState
  }

  object Monitoring {
    def apply(
      State: js.UndefOr[MonitoringState] = js.undefined
    ): Monitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Monitoring]
    }
  }


  object MonitoringStateEnum {
    val disabled = "disabled"
    val disabling = "disabling"
    val enabled = "enabled"
    val pending = "pending"

    val values = IndexedSeq(disabled, disabling, enabled, pending)
  }

  /**
   * <p>Contains the parameters for MoveAddressToVpc.</p>
   */
  @js.native
  trait MoveAddressToVpcRequest extends js.Object {
    var DryRun: Boolean
    var PublicIp: String
  }

  object MoveAddressToVpcRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined
    ): MoveAddressToVpcRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MoveAddressToVpcRequest]
    }
  }

  /**
   * <p>Contains the output of MoveAddressToVpc.</p>
   */
  @js.native
  trait MoveAddressToVpcResult extends js.Object {
    var AllocationId: String
    var Status: Status
  }

  object MoveAddressToVpcResult {
    def apply(
      AllocationId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[Status] = js.undefined
    ): MoveAddressToVpcResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AllocationId" -> AllocationId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MoveAddressToVpcResult]
    }
  }


  object MoveStatusEnum {
    val movingToVpc = "movingToVpc"
    val restoringToClassic = "restoringToClassic"

    val values = IndexedSeq(movingToVpc, restoringToClassic)
  }

  /**
   * <p>Describes the status of a moving Elastic IP address.</p>
   */
  @js.native
  trait MovingAddressStatus extends js.Object {
    var PublicIp: String
    var MoveStatus: MoveStatus
  }

  object MovingAddressStatus {
    def apply(
      PublicIp: js.UndefOr[String] = js.undefined,
      MoveStatus: js.UndefOr[MoveStatus] = js.undefined
    ): MovingAddressStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("MoveStatus" -> MoveStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MovingAddressStatus]
    }
  }

  /**
   * <p>Describes a NAT gateway.</p>
   */
  @js.native
  trait NatGateway extends js.Object {
    var FailureMessage: String
    var FailureCode: String
    var DeleteTime: DateTime
    var NatGatewayId: String
    var NatGatewayAddresses: NatGatewayAddressList
    var ProvisionedBandwidth: ProvisionedBandwidth
    var CreateTime: DateTime
    var State: NatGatewayState
    var VpcId: String
    var SubnetId: String
  }

  object NatGateway {
    def apply(
      FailureMessage: js.UndefOr[String] = js.undefined,
      FailureCode: js.UndefOr[String] = js.undefined,
      DeleteTime: js.UndefOr[DateTime] = js.undefined,
      NatGatewayId: js.UndefOr[String] = js.undefined,
      NatGatewayAddresses: js.UndefOr[NatGatewayAddressList] = js.undefined,
      ProvisionedBandwidth: js.UndefOr[ProvisionedBandwidth] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[NatGatewayState] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): NatGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FailureMessage" -> FailureMessage.map { x => x: js.Any }),
        ("FailureCode" -> FailureCode.map { x => x: js.Any }),
        ("DeleteTime" -> DeleteTime.map { x => x: js.Any }),
        ("NatGatewayId" -> NatGatewayId.map { x => x: js.Any }),
        ("NatGatewayAddresses" -> NatGatewayAddresses.map { x => x: js.Any }),
        ("ProvisionedBandwidth" -> ProvisionedBandwidth.map { x => x: js.Any }),
        ("CreateTime" -> CreateTime.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NatGateway]
    }
  }

  /**
   * <p>Describes the IP addresses and network interface associated with a NAT gateway.</p>
   */
  @js.native
  trait NatGatewayAddress extends js.Object {
    var PublicIp: String
    var AllocationId: String
    var PrivateIp: String
    var NetworkInterfaceId: String
  }

  object NatGatewayAddress {
    def apply(
      PublicIp: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined,
      PrivateIp: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined
    ): NatGatewayAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("AllocationId" -> AllocationId.map { x => x: js.Any }),
        ("PrivateIp" -> PrivateIp.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NatGatewayAddress]
    }
  }


  object NatGatewayStateEnum {
    val pending = "pending"
    val failed = "failed"
    val available = "available"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(pending, failed, available, deleting, deleted)
  }

  /**
   * <p>Describes a network ACL.</p>
   */
  @js.native
  trait NetworkAcl extends js.Object {
    var Associations: NetworkAclAssociationList
    var Entries: NetworkAclEntryList
    var NetworkAclId: String
    var Tags: TagList
    var IsDefault: Boolean
    var VpcId: String
  }

  object NetworkAcl {
    def apply(
      Associations: js.UndefOr[NetworkAclAssociationList] = js.undefined,
      Entries: js.UndefOr[NetworkAclEntryList] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      IsDefault: js.UndefOr[Boolean] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): NetworkAcl = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Associations" -> Associations.map { x => x: js.Any }),
        ("Entries" -> Entries.map { x => x: js.Any }),
        ("NetworkAclId" -> NetworkAclId.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("IsDefault" -> IsDefault.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkAcl]
    }
  }

  /**
   * <p>Describes an association between a network ACL and a subnet.</p>
   */
  @js.native
  trait NetworkAclAssociation extends js.Object {
    var NetworkAclAssociationId: String
    var NetworkAclId: String
    var SubnetId: String
  }

  object NetworkAclAssociation {
    def apply(
      NetworkAclAssociationId: js.UndefOr[String] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): NetworkAclAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkAclAssociationId" -> NetworkAclAssociationId.map { x => x: js.Any }),
        ("NetworkAclId" -> NetworkAclId.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkAclAssociation]
    }
  }

  /**
   * <p>Describes an entry in a network ACL.</p>
   */
  @js.native
  trait NetworkAclEntry extends js.Object {
    var Egress: Boolean
    var Ipv6CidrBlock: String
    var PortRange: PortRange
    var IcmpTypeCode: IcmpTypeCode
    var CidrBlock: String
    var RuleNumber: Integer
    var RuleAction: RuleAction
    var Protocol: String
  }

  object NetworkAclEntry {
    def apply(
      Egress: js.UndefOr[Boolean] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      PortRange: js.UndefOr[PortRange] = js.undefined,
      IcmpTypeCode: js.UndefOr[IcmpTypeCode] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      RuleNumber: js.UndefOr[Integer] = js.undefined,
      RuleAction: js.UndefOr[RuleAction] = js.undefined,
      Protocol: js.UndefOr[String] = js.undefined
    ): NetworkAclEntry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Egress" -> Egress.map { x => x: js.Any }),
        ("Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x: js.Any }),
        ("PortRange" -> PortRange.map { x => x: js.Any }),
        ("IcmpTypeCode" -> IcmpTypeCode.map { x => x: js.Any }),
        ("CidrBlock" -> CidrBlock.map { x => x: js.Any }),
        ("RuleNumber" -> RuleNumber.map { x => x: js.Any }),
        ("RuleAction" -> RuleAction.map { x => x: js.Any }),
        ("Protocol" -> Protocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkAclEntry]
    }
  }

  /**
   * <p>Describes a network interface.</p>
   */
  @js.native
  trait NetworkInterface extends js.Object {
    var Ipv6Addresses: NetworkInterfaceIpv6AddressesList
    var InterfaceType: NetworkInterfaceType
    var PrivateIpAddress: String
    var RequesterId: String
    var PrivateDnsName: String
    var TagSet: TagList
    var Description: String
    var PrivateIpAddresses: NetworkInterfacePrivateIpAddressList
    var Groups: GroupIdentifierList
    var RequesterManaged: Boolean
    var AvailabilityZone: String
    var OwnerId: String
    var Association: NetworkInterfaceAssociation
    var Attachment: NetworkInterfaceAttachment
    var NetworkInterfaceId: String
    var SourceDestCheck: Boolean
    var MacAddress: String
    var Status: NetworkInterfaceStatus
    var VpcId: String
    var SubnetId: String
  }

  object NetworkInterface {
    def apply(
      Ipv6Addresses: js.UndefOr[NetworkInterfaceIpv6AddressesList] = js.undefined,
      InterfaceType: js.UndefOr[NetworkInterfaceType] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      RequesterId: js.UndefOr[String] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      TagSet: js.UndefOr[TagList] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[NetworkInterfacePrivateIpAddressList] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      RequesterManaged: js.UndefOr[Boolean] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Association: js.UndefOr[NetworkInterfaceAssociation] = js.undefined,
      Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
      MacAddress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[NetworkInterfaceStatus] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): NetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6Addresses" -> Ipv6Addresses.map { x => x: js.Any }),
        ("InterfaceType" -> InterfaceType.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("RequesterId" -> RequesterId.map { x => x: js.Any }),
        ("PrivateDnsName" -> PrivateDnsName.map { x => x: js.Any }),
        ("TagSet" -> TagSet.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("PrivateIpAddresses" -> PrivateIpAddresses.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("RequesterManaged" -> RequesterManaged.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("Association" -> Association.map { x => x: js.Any }),
        ("Attachment" -> Attachment.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("SourceDestCheck" -> SourceDestCheck.map { x => x: js.Any }),
        ("MacAddress" -> MacAddress.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterface]
    }
  }

  /**
   * <p>Describes association information for an Elastic IP address (IPv4 only).</p>
   */
  @js.native
  trait NetworkInterfaceAssociation extends js.Object {
    var PublicIp: String
    var AllocationId: String
    var IpOwnerId: String
    var PublicDnsName: String
    var AssociationId: String
  }

  object NetworkInterfaceAssociation {
    def apply(
      PublicIp: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined,
      IpOwnerId: js.UndefOr[String] = js.undefined,
      PublicDnsName: js.UndefOr[String] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined
    ): NetworkInterfaceAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("AllocationId" -> AllocationId.map { x => x: js.Any }),
        ("IpOwnerId" -> IpOwnerId.map { x => x: js.Any }),
        ("PublicDnsName" -> PublicDnsName.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfaceAssociation]
    }
  }

  /**
   * <p>Describes a network interface attachment.</p>
   */
  @js.native
  trait NetworkInterfaceAttachment extends js.Object {
    var InstanceOwnerId: String
    var AttachmentId: String
    var InstanceId: String
    var DeviceIndex: Integer
    var DeleteOnTermination: Boolean
    var AttachTime: DateTime
    var Status: AttachmentStatus
  }

  object NetworkInterfaceAttachment {
    def apply(
      InstanceOwnerId: js.UndefOr[String] = js.undefined,
      AttachmentId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      DeviceIndex: js.UndefOr[Integer] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AttachTime: js.UndefOr[DateTime] = js.undefined,
      Status: js.UndefOr[AttachmentStatus] = js.undefined
    ): NetworkInterfaceAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceOwnerId" -> InstanceOwnerId.map { x => x: js.Any }),
        ("AttachmentId" -> AttachmentId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("DeviceIndex" -> DeviceIndex.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any }),
        ("AttachTime" -> AttachTime.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfaceAttachment]
    }
  }

  /**
   * <p>Describes an attachment change.</p>
   */
  @js.native
  trait NetworkInterfaceAttachmentChanges extends js.Object {
    var AttachmentId: String
    var DeleteOnTermination: Boolean
  }

  object NetworkInterfaceAttachmentChanges {
    def apply(
      AttachmentId: js.UndefOr[String] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
    ): NetworkInterfaceAttachmentChanges = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttachmentId" -> AttachmentId.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfaceAttachmentChanges]
    }
  }


  object NetworkInterfaceAttributeEnum {
    val description = "description"
    val groupSet = "groupSet"
    val sourceDestCheck = "sourceDestCheck"
    val attachment = "attachment"

    val values = IndexedSeq(description, groupSet, sourceDestCheck, attachment)
  }

  /**
   * <p>Describes an IPv6 address associated with a network interface.</p>
   */
  @js.native
  trait NetworkInterfaceIpv6Address extends js.Object {
    var Ipv6Address: String
  }

  object NetworkInterfaceIpv6Address {
    def apply(
      Ipv6Address: js.UndefOr[String] = js.undefined
    ): NetworkInterfaceIpv6Address = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6Address" -> Ipv6Address.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfaceIpv6Address]
    }
  }

  /**
   * <p>Describes the private IPv4 address of a network interface.</p>
   */
  @js.native
  trait NetworkInterfacePrivateIpAddress extends js.Object {
    var PrivateIpAddress: String
    var PrivateDnsName: String
    var Primary: Boolean
    var Association: NetworkInterfaceAssociation
  }

  object NetworkInterfacePrivateIpAddress {
    def apply(
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      PrivateDnsName: js.UndefOr[String] = js.undefined,
      Primary: js.UndefOr[Boolean] = js.undefined,
      Association: js.UndefOr[NetworkInterfaceAssociation] = js.undefined
    ): NetworkInterfacePrivateIpAddress = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("PrivateDnsName" -> PrivateDnsName.map { x => x: js.Any }),
        ("Primary" -> Primary.map { x => x: js.Any }),
        ("Association" -> Association.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkInterfacePrivateIpAddress]
    }
  }


  object NetworkInterfaceStatusEnum {
    val available = "available"
    val attaching = "attaching"
    val `in-use` = "in-use"
    val detaching = "detaching"

    val values = IndexedSeq(available, attaching, `in-use`, detaching)
  }


  object NetworkInterfaceTypeEnum {
    val interface = "interface"
    val natGateway = "natGateway"

    val values = IndexedSeq(interface, natGateway)
  }

  @js.native
  trait NewDhcpConfiguration extends js.Object {
    var Key: String
    var Values: ValueStringList
  }

  object NewDhcpConfiguration {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[ValueStringList] = js.undefined
    ): NewDhcpConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NewDhcpConfiguration]
    }
  }


  object OfferingClassTypeEnum {
    val standard = "standard"
    val convertible = "convertible"

    val values = IndexedSeq(standard, convertible)
  }


  object OfferingTypeValuesEnum {
    val `Heavy Utilization` = "Heavy Utilization"
    val `Medium Utilization` = "Medium Utilization"
    val `Light Utilization` = "Light Utilization"
    val `No Upfront` = "No Upfront"
    val `Partial Upfront` = "Partial Upfront"
    val `All Upfront` = "All Upfront"

    val values = IndexedSeq(`Heavy Utilization`, `Medium Utilization`, `Light Utilization`, `No Upfront`, `Partial Upfront`, `All Upfront`)
  }


  object OperationTypeEnum {
    val add = "add"
    val remove = "remove"

    val values = IndexedSeq(add, remove)
  }


  object PaymentOptionEnum {
    val AllUpfront = "AllUpfront"
    val PartialUpfront = "PartialUpfront"
    val NoUpfront = "NoUpfront"

    val values = IndexedSeq(AllUpfront, PartialUpfront, NoUpfront)
  }

  /**
   * <p>Describes the VPC peering connection options.</p>
   */
  @js.native
  trait PeeringConnectionOptions extends js.Object {
    var AllowEgressFromLocalClassicLinkToRemoteVpc: Boolean
    var AllowEgressFromLocalVpcToRemoteClassicLink: Boolean
    var AllowDnsResolutionFromRemoteVpc: Boolean
  }

  object PeeringConnectionOptions {
    def apply(
      AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
      AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined,
      AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined
    ): PeeringConnectionOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AllowEgressFromLocalClassicLinkToRemoteVpc" -> AllowEgressFromLocalClassicLinkToRemoteVpc.map { x => x: js.Any }),
        ("AllowEgressFromLocalVpcToRemoteClassicLink" -> AllowEgressFromLocalVpcToRemoteClassicLink.map { x => x: js.Any }),
        ("AllowDnsResolutionFromRemoteVpc" -> AllowDnsResolutionFromRemoteVpc.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PeeringConnectionOptions]
    }
  }

  /**
   * <p>The VPC peering connection options.</p>
   */
  @js.native
  trait PeeringConnectionOptionsRequest extends js.Object {
    var AllowEgressFromLocalClassicLinkToRemoteVpc: Boolean
    var AllowEgressFromLocalVpcToRemoteClassicLink: Boolean
    var AllowDnsResolutionFromRemoteVpc: Boolean
  }

  object PeeringConnectionOptionsRequest {
    def apply(
      AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
      AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined,
      AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined
    ): PeeringConnectionOptionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AllowEgressFromLocalClassicLinkToRemoteVpc" -> AllowEgressFromLocalClassicLinkToRemoteVpc.map { x => x: js.Any }),
        ("AllowEgressFromLocalVpcToRemoteClassicLink" -> AllowEgressFromLocalVpcToRemoteClassicLink.map { x => x: js.Any }),
        ("AllowDnsResolutionFromRemoteVpc" -> AllowDnsResolutionFromRemoteVpc.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PeeringConnectionOptionsRequest]
    }
  }


  object PermissionGroupEnum {
    val all = "all"

    val values = IndexedSeq(all)
  }

  /**
   * <p>Describes the placement of an instance.</p>
   */
  @js.native
  trait Placement extends js.Object {
    var GroupName: String
    var Tenancy: Tenancy
    var Affinity: String
    var AvailabilityZone: String
    var HostId: String
  }

  object Placement {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      Tenancy: js.UndefOr[Tenancy] = js.undefined,
      Affinity: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      HostId: js.UndefOr[String] = js.undefined
    ): Placement = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("Tenancy" -> Tenancy.map { x => x: js.Any }),
        ("Affinity" -> Affinity.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("HostId" -> HostId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Placement]
    }
  }

  /**
   * <p>Describes a placement group.</p>
   */
  @js.native
  trait PlacementGroup extends js.Object {
    var GroupName: String
    var Strategy: PlacementStrategy
    var State: PlacementGroupState
  }

  object PlacementGroup {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      Strategy: js.UndefOr[PlacementStrategy] = js.undefined,
      State: js.UndefOr[PlacementGroupState] = js.undefined
    ): PlacementGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("Strategy" -> Strategy.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacementGroup]
    }
  }


  object PlacementGroupStateEnum {
    val pending = "pending"
    val available = "available"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(pending, available, deleting, deleted)
  }


  object PlacementStrategyEnum {
    val cluster = "cluster"

    val values = IndexedSeq(cluster)
  }


  object PlatformValuesEnum {
    val Windows = "Windows"

    val values = IndexedSeq(Windows)
  }

  /**
   * <p>Describes a range of ports.</p>
   */
  @js.native
  trait PortRange extends js.Object {
    var From: Integer
    var To: Integer
  }

  object PortRange {
    def apply(
      From: js.UndefOr[Integer] = js.undefined,
      To: js.UndefOr[Integer] = js.undefined
    ): PortRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("From" -> From.map { x => x: js.Any }),
        ("To" -> To.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortRange]
    }
  }

  /**
   * <p>Describes prefixes for AWS services.</p>
   */
  @js.native
  trait PrefixList extends js.Object {
    var PrefixListId: String
    var PrefixListName: String
    var Cidrs: ValueStringList
  }

  object PrefixList {
    def apply(
      PrefixListId: js.UndefOr[String] = js.undefined,
      PrefixListName: js.UndefOr[String] = js.undefined,
      Cidrs: js.UndefOr[ValueStringList] = js.undefined
    ): PrefixList = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrefixListId" -> PrefixListId.map { x => x: js.Any }),
        ("PrefixListName" -> PrefixListName.map { x => x: js.Any }),
        ("Cidrs" -> Cidrs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrefixList]
    }
  }

  /**
   * <p>The ID of the prefix.</p>
   */
  @js.native
  trait PrefixListId extends js.Object {
    var PrefixListId: String
  }

  object PrefixListId {
    def apply(
      PrefixListId: js.UndefOr[String] = js.undefined
    ): PrefixListId = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrefixListId" -> PrefixListId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrefixListId]
    }
  }

  /**
   * <p>Describes the price for a Reserved Instance.</p>
   */
  @js.native
  trait PriceSchedule extends js.Object {
    var Term: Long
    var Price: Double
    var CurrencyCode: CurrencyCodeValues
    var Active: Boolean
  }

  object PriceSchedule {
    def apply(
      Term: js.UndefOr[Long] = js.undefined,
      Price: js.UndefOr[Double] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Active: js.UndefOr[Boolean] = js.undefined
    ): PriceSchedule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Term" -> Term.map { x => x: js.Any }),
        ("Price" -> Price.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Active" -> Active.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PriceSchedule]
    }
  }

  /**
   * <p>Describes the price for a Reserved Instance.</p>
   */
  @js.native
  trait PriceScheduleSpecification extends js.Object {
    var Term: Long
    var Price: Double
    var CurrencyCode: CurrencyCodeValues
  }

  object PriceScheduleSpecification {
    def apply(
      Term: js.UndefOr[Long] = js.undefined,
      Price: js.UndefOr[Double] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
    ): PriceScheduleSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Term" -> Term.map { x => x: js.Any }),
        ("Price" -> Price.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PriceScheduleSpecification]
    }
  }

  /**
   * <p>Describes a Reserved Instance offering.</p>
   */
  @js.native
  trait PricingDetail extends js.Object {
    var Price: Double
    var Count: Integer
  }

  object PricingDetail {
    def apply(
      Price: js.UndefOr[Double] = js.undefined,
      Count: js.UndefOr[Integer] = js.undefined
    ): PricingDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Price" -> Price.map { x => x: js.Any }),
        ("Count" -> Count.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PricingDetail]
    }
  }

  /**
   * <p>Describes a secondary private IPv4 address for a network interface.</p>
   */
  @js.native
  trait PrivateIpAddressSpecification extends js.Object {
    var PrivateIpAddress: String
    var Primary: Boolean
  }

  object PrivateIpAddressSpecification {
    def apply(
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Primary: js.UndefOr[Boolean] = js.undefined
    ): PrivateIpAddressSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("Primary" -> Primary.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PrivateIpAddressSpecification]
    }
  }

  /**
   * <p>Describes a product code.</p>
   */
  @js.native
  trait ProductCode extends js.Object {
    var ProductCodeId: String
    var ProductCodeType: ProductCodeValues
  }

  object ProductCode {
    def apply(
      ProductCodeId: js.UndefOr[String] = js.undefined,
      ProductCodeType: js.UndefOr[ProductCodeValues] = js.undefined
    ): ProductCode = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ProductCodeId" -> ProductCodeId.map { x => x: js.Any }),
        ("ProductCodeType" -> ProductCodeType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductCode]
    }
  }


  object ProductCodeValuesEnum {
    val devpay = "devpay"
    val marketplace = "marketplace"

    val values = IndexedSeq(devpay, marketplace)
  }

  /**
   * <p>Describes a virtual private gateway propagating route.</p>
   */
  @js.native
  trait PropagatingVgw extends js.Object {
    var GatewayId: String
  }

  object PropagatingVgw {
    def apply(
      GatewayId: js.UndefOr[String] = js.undefined
    ): PropagatingVgw = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GatewayId" -> GatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PropagatingVgw]
    }
  }

  /**
   * <p>Reserved. If you need to sustain traffic greater than the <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented limits</a>, contact us through the <a href="https://console.aws.amazon.com/support/home?">Support Center</a>.</p>
   */
  @js.native
  trait ProvisionedBandwidth extends js.Object {
    var RequestTime: DateTime
    var Provisioned: String
    var ProvisionTime: DateTime
    var Requested: String
    var Status: String
  }

  object ProvisionedBandwidth {
    def apply(
      RequestTime: js.UndefOr[DateTime] = js.undefined,
      Provisioned: js.UndefOr[String] = js.undefined,
      ProvisionTime: js.UndefOr[DateTime] = js.undefined,
      Requested: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): ProvisionedBandwidth = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RequestTime" -> RequestTime.map { x => x: js.Any }),
        ("Provisioned" -> Provisioned.map { x => x: js.Any }),
        ("ProvisionTime" -> ProvisionTime.map { x => x: js.Any }),
        ("Requested" -> Requested.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProvisionedBandwidth]
    }
  }

  /**
   * <p>Describes the result of the purchase.</p>
   */
  @js.native
  trait Purchase extends js.Object {
    var PaymentOption: PaymentOption
    var HostReservationId: String
    var CurrencyCode: CurrencyCodeValues
    var Duration: Integer
    var InstanceFamily: String
    var UpfrontPrice: String
    var HostIdSet: ResponseHostIdSet
    var HourlyPrice: String
  }

  object Purchase {
    def apply(
      PaymentOption: js.UndefOr[PaymentOption] = js.undefined,
      HostReservationId: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Integer] = js.undefined,
      InstanceFamily: js.UndefOr[String] = js.undefined,
      UpfrontPrice: js.UndefOr[String] = js.undefined,
      HostIdSet: js.UndefOr[ResponseHostIdSet] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined
    ): Purchase = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PaymentOption" -> PaymentOption.map { x => x: js.Any }),
        ("HostReservationId" -> HostReservationId.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("InstanceFamily" -> InstanceFamily.map { x => x: js.Any }),
        ("UpfrontPrice" -> UpfrontPrice.map { x => x: js.Any }),
        ("HostIdSet" -> HostIdSet.map { x => x: js.Any }),
        ("HourlyPrice" -> HourlyPrice.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Purchase]
    }
  }

  @js.native
  trait PurchaseHostReservationRequest extends js.Object {
    var CurrencyCode: CurrencyCodeValues
    var ClientToken: String
    var HostIdSet: RequestHostIdSet
    var OfferingId: String
    var LimitPrice: String
  }

  object PurchaseHostReservationRequest {
    def apply(
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      HostIdSet: js.UndefOr[RequestHostIdSet] = js.undefined,
      OfferingId: js.UndefOr[String] = js.undefined,
      LimitPrice: js.UndefOr[String] = js.undefined
    ): PurchaseHostReservationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("HostIdSet" -> HostIdSet.map { x => x: js.Any }),
        ("OfferingId" -> OfferingId.map { x => x: js.Any }),
        ("LimitPrice" -> LimitPrice.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseHostReservationRequest]
    }
  }

  @js.native
  trait PurchaseHostReservationResult extends js.Object {
    var Purchase: PurchaseSet
    var CurrencyCode: CurrencyCodeValues
    var TotalUpfrontPrice: String
    var ClientToken: String
    var TotalHourlyPrice: String
  }

  object PurchaseHostReservationResult {
    def apply(
      Purchase: js.UndefOr[PurchaseSet] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      TotalUpfrontPrice: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      TotalHourlyPrice: js.UndefOr[String] = js.undefined
    ): PurchaseHostReservationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Purchase" -> Purchase.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("TotalUpfrontPrice" -> TotalUpfrontPrice.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("TotalHourlyPrice" -> TotalHourlyPrice.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseHostReservationResult]
    }
  }

  /**
   * <p>Describes a request to purchase Scheduled Instances.</p>
   */
  @js.native
  trait PurchaseRequest extends js.Object {
    var PurchaseToken: String
    var InstanceCount: Integer
  }

  object PurchaseRequest {
    def apply(
      PurchaseToken: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined
    ): PurchaseRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PurchaseToken" -> PurchaseToken.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseRequest]
    }
  }

  /**
   * <p>Contains the parameters for PurchaseReservedInstancesOffering.</p>
   */
  @js.native
  trait PurchaseReservedInstancesOfferingRequest extends js.Object {
    var DryRun: Boolean
    var ReservedInstancesOfferingId: String
    var InstanceCount: Integer
    var LimitPrice: ReservedInstanceLimitPrice
  }

  object PurchaseReservedInstancesOfferingRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ReservedInstancesOfferingId: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      LimitPrice: js.UndefOr[ReservedInstanceLimitPrice] = js.undefined
    ): PurchaseReservedInstancesOfferingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ReservedInstancesOfferingId" -> ReservedInstancesOfferingId.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("LimitPrice" -> LimitPrice.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedInstancesOfferingRequest]
    }
  }

  /**
   * <p>Contains the output of PurchaseReservedInstancesOffering.</p>
   */
  @js.native
  trait PurchaseReservedInstancesOfferingResult extends js.Object {
    var ReservedInstancesId: String
  }

  object PurchaseReservedInstancesOfferingResult {
    def apply(
      ReservedInstancesId: js.UndefOr[String] = js.undefined
    ): PurchaseReservedInstancesOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesId" -> ReservedInstancesId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedInstancesOfferingResult]
    }
  }

  /**
   * <p>Contains the parameters for PurchaseScheduledInstances.</p>
   */
  @js.native
  trait PurchaseScheduledInstancesRequest extends js.Object {
    var DryRun: Boolean
    var ClientToken: String
    var PurchaseRequests: PurchaseRequestSet
  }

  object PurchaseScheduledInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      PurchaseRequests: js.UndefOr[PurchaseRequestSet] = js.undefined
    ): PurchaseScheduledInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("PurchaseRequests" -> PurchaseRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseScheduledInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of PurchaseScheduledInstances.</p>
   */
  @js.native
  trait PurchaseScheduledInstancesResult extends js.Object {
    var ScheduledInstanceSet: PurchasedScheduledInstanceSet
  }

  object PurchaseScheduledInstancesResult {
    def apply(
      ScheduledInstanceSet: js.UndefOr[PurchasedScheduledInstanceSet] = js.undefined
    ): PurchaseScheduledInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ScheduledInstanceSet" -> ScheduledInstanceSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseScheduledInstancesResult]
    }
  }


  object RIProductDescriptionEnum {
    val `Linux/UNIX` = "Linux/UNIX"
    val `Linux/UNIX (Amazon VPC)` = "Linux/UNIX (Amazon VPC)"
    val Windows = "Windows"
    val `Windows (Amazon VPC)` = "Windows (Amazon VPC)"

    val values = IndexedSeq(`Linux/UNIX`, `Linux/UNIX (Amazon VPC)`, Windows, `Windows (Amazon VPC)`)
  }

  /**
   * <p>Contains the parameters for RebootInstances.</p>
   */
  @js.native
  trait RebootInstancesRequest extends js.Object {
    var DryRun: Boolean
    var InstanceIds: InstanceIdStringList
  }

  object RebootInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined
    ): RebootInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootInstancesRequest]
    }
  }

  /**
   * <p>Describes a recurring charge.</p>
   */
  @js.native
  trait RecurringCharge extends js.Object {
    var Frequency: RecurringChargeFrequency
    var Amount: Double
  }

  object RecurringCharge {
    def apply(
      Frequency: js.UndefOr[RecurringChargeFrequency] = js.undefined,
      Amount: js.UndefOr[Double] = js.undefined
    ): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Frequency" -> Frequency.map { x => x: js.Any }),
        ("Amount" -> Amount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
    }
  }


  object RecurringChargeFrequencyEnum {
    val Hourly = "Hourly"

    val values = IndexedSeq(Hourly)
  }

  /**
   * <p>Describes a region.</p>
   */
  @js.native
  trait Region extends js.Object {
    var RegionName: String
    var Endpoint: String
  }

  object Region {
    def apply(
      RegionName: js.UndefOr[String] = js.undefined,
      Endpoint: js.UndefOr[String] = js.undefined
    ): Region = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RegionName" -> RegionName.map { x => x: js.Any }),
        ("Endpoint" -> Endpoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Region]
    }
  }

  /**
   * <p>Contains the parameters for RegisterImage.</p>
   */
  @js.native
  trait RegisterImageRequest extends js.Object {
    var Architecture: ArchitectureValues
    var RamdiskId: String
    var BlockDeviceMappings: BlockDeviceMappingRequestList
    var DryRun: Boolean
    var Name: String
    var RootDeviceName: String
    var Description: String
    var KernelId: String
    var EnaSupport: Boolean
    var VirtualizationType: String
    var ImageLocation: String
    var SriovNetSupport: String
  }

  object RegisterImageRequest {
    def apply(
      Architecture: js.UndefOr[ArchitectureValues] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      RootDeviceName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      EnaSupport: js.UndefOr[Boolean] = js.undefined,
      VirtualizationType: js.UndefOr[String] = js.undefined,
      ImageLocation: js.UndefOr[String] = js.undefined,
      SriovNetSupport: js.UndefOr[String] = js.undefined
    ): RegisterImageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Architecture" -> Architecture.map { x => x: js.Any }),
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("RootDeviceName" -> RootDeviceName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("EnaSupport" -> EnaSupport.map { x => x: js.Any }),
        ("VirtualizationType" -> VirtualizationType.map { x => x: js.Any }),
        ("ImageLocation" -> ImageLocation.map { x => x: js.Any }),
        ("SriovNetSupport" -> SriovNetSupport.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterImageRequest]
    }
  }

  /**
   * <p>Contains the output of RegisterImage.</p>
   */
  @js.native
  trait RegisterImageResult extends js.Object {
    var ImageId: String
  }

  object RegisterImageResult {
    def apply(
      ImageId: js.UndefOr[String] = js.undefined
    ): RegisterImageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ImageId" -> ImageId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterImageResult]
    }
  }

  /**
   * <p>Contains the parameters for RejectVpcPeeringConnection.</p>
   */
  @js.native
  trait RejectVpcPeeringConnectionRequest extends js.Object {
    var DryRun: Boolean
    var VpcPeeringConnectionId: String
  }

  object RejectVpcPeeringConnectionRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
    ): RejectVpcPeeringConnectionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectVpcPeeringConnectionRequest]
    }
  }

  /**
   * <p>Contains the output of RejectVpcPeeringConnection.</p>
   */
  @js.native
  trait RejectVpcPeeringConnectionResult extends js.Object {
    var Return: Boolean
  }

  object RejectVpcPeeringConnectionResult {
    def apply(
      Return: js.UndefOr[Boolean] = js.undefined
    ): RejectVpcPeeringConnectionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Return" -> Return.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RejectVpcPeeringConnectionResult]
    }
  }

  /**
   * <p>Contains the parameters for ReleaseAddress.</p>
   */
  @js.native
  trait ReleaseAddressRequest extends js.Object {
    var DryRun: Boolean
    var PublicIp: String
    var AllocationId: String
  }

  object ReleaseAddressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined,
      AllocationId: js.UndefOr[String] = js.undefined
    ): ReleaseAddressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any }),
        ("AllocationId" -> AllocationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseAddressRequest]
    }
  }

  /**
   * <p>Contains the parameters for ReleaseHosts.</p>
   */
  @js.native
  trait ReleaseHostsRequest extends js.Object {
    var HostIds: RequestHostIdList
  }

  object ReleaseHostsRequest {
    def apply(
      HostIds: js.UndefOr[RequestHostIdList] = js.undefined
    ): ReleaseHostsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("HostIds" -> HostIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseHostsRequest]
    }
  }

  /**
   * <p>Contains the output of ReleaseHosts.</p>
   */
  @js.native
  trait ReleaseHostsResult extends js.Object {
    var Successful: ResponseHostIdList
    var Unsuccessful: UnsuccessfulItemList
  }

  object ReleaseHostsResult {
    def apply(
      Successful: js.UndefOr[ResponseHostIdList] = js.undefined,
      Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.undefined
    ): ReleaseHostsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Successful" -> Successful.map { x => x: js.Any }),
        ("Unsuccessful" -> Unsuccessful.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReleaseHostsResult]
    }
  }

  /**
   * <p>Contains the parameters for ReplaceNetworkAclAssociation.</p>
   */
  @js.native
  trait ReplaceNetworkAclAssociationRequest extends js.Object {
    var DryRun: Boolean
    var AssociationId: String
    var NetworkAclId: String
  }

  object ReplaceNetworkAclAssociationRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined
    ): ReplaceNetworkAclAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any }),
        ("NetworkAclId" -> NetworkAclId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceNetworkAclAssociationRequest]
    }
  }

  /**
   * <p>Contains the output of ReplaceNetworkAclAssociation.</p>
   */
  @js.native
  trait ReplaceNetworkAclAssociationResult extends js.Object {
    var NewAssociationId: String
  }

  object ReplaceNetworkAclAssociationResult {
    def apply(
      NewAssociationId: js.UndefOr[String] = js.undefined
    ): ReplaceNetworkAclAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NewAssociationId" -> NewAssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceNetworkAclAssociationResult]
    }
  }

  /**
   * <p>Contains the parameters for ReplaceNetworkAclEntry.</p>
   */
  @js.native
  trait ReplaceNetworkAclEntryRequest extends js.Object {
    var Egress: Boolean
    var DryRun: Boolean
    var Ipv6CidrBlock: String
    var PortRange: PortRange
    var IcmpTypeCode: IcmpTypeCode
    var CidrBlock: String
    var NetworkAclId: String
    var RuleNumber: Integer
    var RuleAction: RuleAction
    var Protocol: String
  }

  object ReplaceNetworkAclEntryRequest {
    def apply(
      Egress: js.UndefOr[Boolean] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      PortRange: js.UndefOr[PortRange] = js.undefined,
      IcmpTypeCode: js.UndefOr[IcmpTypeCode] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      NetworkAclId: js.UndefOr[String] = js.undefined,
      RuleNumber: js.UndefOr[Integer] = js.undefined,
      RuleAction: js.UndefOr[RuleAction] = js.undefined,
      Protocol: js.UndefOr[String] = js.undefined
    ): ReplaceNetworkAclEntryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Egress" -> Egress.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x: js.Any }),
        ("PortRange" -> PortRange.map { x => x: js.Any }),
        ("IcmpTypeCode" -> IcmpTypeCode.map { x => x: js.Any }),
        ("CidrBlock" -> CidrBlock.map { x => x: js.Any }),
        ("NetworkAclId" -> NetworkAclId.map { x => x: js.Any }),
        ("RuleNumber" -> RuleNumber.map { x => x: js.Any }),
        ("RuleAction" -> RuleAction.map { x => x: js.Any }),
        ("Protocol" -> Protocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceNetworkAclEntryRequest]
    }
  }

  /**
   * <p>Contains the parameters for ReplaceRoute.</p>
   */
  @js.native
  trait ReplaceRouteRequest extends js.Object {
    var DryRun: Boolean
    var DestinationCidrBlock: String
    var VpcPeeringConnectionId: String
    var NatGatewayId: String
    var EgressOnlyInternetGatewayId: String
    var RouteTableId: String
    var InstanceId: String
    var NetworkInterfaceId: String
    var DestinationIpv6CidrBlock: String
    var GatewayId: String
  }

  object ReplaceRouteRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      NatGatewayId: js.UndefOr[String] = js.undefined,
      EgressOnlyInternetGatewayId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined,
      GatewayId: js.UndefOr[String] = js.undefined
    ): ReplaceRouteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("DestinationCidrBlock" -> DestinationCidrBlock.map { x => x: js.Any }),
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any }),
        ("NatGatewayId" -> NatGatewayId.map { x => x: js.Any }),
        ("EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x: js.Any }),
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("DestinationIpv6CidrBlock" -> DestinationIpv6CidrBlock.map { x => x: js.Any }),
        ("GatewayId" -> GatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceRouteRequest]
    }
  }

  /**
   * <p>Contains the parameters for ReplaceRouteTableAssociation.</p>
   */
  @js.native
  trait ReplaceRouteTableAssociationRequest extends js.Object {
    var DryRun: Boolean
    var AssociationId: String
    var RouteTableId: String
  }

  object ReplaceRouteTableAssociationRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined
    ): ReplaceRouteTableAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any }),
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceRouteTableAssociationRequest]
    }
  }

  /**
   * <p>Contains the output of ReplaceRouteTableAssociation.</p>
   */
  @js.native
  trait ReplaceRouteTableAssociationResult extends js.Object {
    var NewAssociationId: String
  }

  object ReplaceRouteTableAssociationResult {
    def apply(
      NewAssociationId: js.UndefOr[String] = js.undefined
    ): ReplaceRouteTableAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NewAssociationId" -> NewAssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReplaceRouteTableAssociationResult]
    }
  }


  object ReportInstanceReasonCodesEnum {
    val `instance-stuck-in-state` = "instance-stuck-in-state"
    val unresponsive = "unresponsive"
    val `not-accepting-credentials` = "not-accepting-credentials"
    val `password-not-available` = "password-not-available"
    val `performance-network` = "performance-network"
    val `performance-instance-store` = "performance-instance-store"
    val `performance-ebs-volume` = "performance-ebs-volume"
    val `performance-other` = "performance-other"
    val other = "other"

    val values = IndexedSeq(`instance-stuck-in-state`, unresponsive, `not-accepting-credentials`, `password-not-available`, `performance-network`, `performance-instance-store`, `performance-ebs-volume`, `performance-other`, other)
  }

  /**
   * <p>Contains the parameters for ReportInstanceStatus.</p>
   */
  @js.native
  trait ReportInstanceStatusRequest extends js.Object {
    var DryRun: Boolean
    var Description: String
    var StartTime: DateTime
    var EndTime: DateTime
    var Instances: InstanceIdStringList
    var Status: ReportStatusType
    var ReasonCodes: ReasonCodesList
  }

  object ReportInstanceStatusRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      EndTime: js.UndefOr[DateTime] = js.undefined,
      Instances: js.UndefOr[InstanceIdStringList] = js.undefined,
      Status: js.UndefOr[ReportStatusType] = js.undefined,
      ReasonCodes: js.UndefOr[ReasonCodesList] = js.undefined
    ): ReportInstanceStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("ReasonCodes" -> ReasonCodes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReportInstanceStatusRequest]
    }
  }


  object ReportStatusTypeEnum {
    val ok = "ok"
    val impaired = "impaired"

    val values = IndexedSeq(ok, impaired)
  }

  /**
   * <p>Contains the parameters for RequestSpotFleet.</p>
   */
  @js.native
  trait RequestSpotFleetRequest extends js.Object {
    var DryRun: Boolean
    var SpotFleetRequestConfig: SpotFleetRequestConfigData
  }

  object RequestSpotFleetRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData] = js.undefined
    ): RequestSpotFleetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SpotFleetRequestConfig" -> SpotFleetRequestConfig.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotFleetRequest]
    }
  }

  /**
   * <p>Contains the output of RequestSpotFleet.</p>
   */
  @js.native
  trait RequestSpotFleetResponse extends js.Object {
    var SpotFleetRequestId: String
  }

  object RequestSpotFleetResponse {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined
    ): RequestSpotFleetResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotFleetRequestId" -> SpotFleetRequestId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotFleetResponse]
    }
  }

  /**
   * <p>Contains the parameters for RequestSpotInstances.</p>
   */
  @js.native
  trait RequestSpotInstancesRequest extends js.Object {
    var LaunchGroup: String
    var DryRun: Boolean
    var AvailabilityZoneGroup: String
    var ClientToken: String
    var InstanceCount: Integer
    var ValidUntil: DateTime
    var ValidFrom: DateTime
    var SpotPrice: String
    var BlockDurationMinutes: Integer
    var LaunchSpecification: RequestSpotLaunchSpecification
    var Type: SpotInstanceType
  }

  object RequestSpotInstancesRequest {
    def apply(
      LaunchGroup: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      AvailabilityZoneGroup: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      ValidFrom: js.UndefOr[DateTime] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      BlockDurationMinutes: js.UndefOr[Integer] = js.undefined,
      LaunchSpecification: js.UndefOr[RequestSpotLaunchSpecification] = js.undefined,
      Type: js.UndefOr[SpotInstanceType] = js.undefined
    ): RequestSpotInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LaunchGroup" -> LaunchGroup.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("AvailabilityZoneGroup" -> AvailabilityZoneGroup.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("ValidUntil" -> ValidUntil.map { x => x: js.Any }),
        ("ValidFrom" -> ValidFrom.map { x => x: js.Any }),
        ("SpotPrice" -> SpotPrice.map { x => x: js.Any }),
        ("BlockDurationMinutes" -> BlockDurationMinutes.map { x => x: js.Any }),
        ("LaunchSpecification" -> LaunchSpecification.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of RequestSpotInstances.</p>
   */
  @js.native
  trait RequestSpotInstancesResult extends js.Object {
    var SpotInstanceRequests: SpotInstanceRequestList
  }

  object RequestSpotInstancesResult {
    def apply(
      SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.undefined
    ): RequestSpotInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotInstanceRequests" -> SpotInstanceRequests.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotInstancesResult]
    }
  }

  /**
   * <p>Describes the launch specification for an instance.</p>
   */
  @js.native
  trait RequestSpotLaunchSpecification extends js.Object {
    var NetworkInterfaces: InstanceNetworkInterfaceSpecificationList
    var RamdiskId: String
    var BlockDeviceMappings: BlockDeviceMappingList
    var ImageId: String
    var EbsOptimized: Boolean
    var Placement: SpotPlacement
    var UserData: String
    var AddressingType: String
    var SecurityGroups: ValueStringList
    var KernelId: String
    var SecurityGroupIds: ValueStringList
    var KeyName: String
    var InstanceType: InstanceType
    var Monitoring: RunInstancesMonitoringEnabled
    var IamInstanceProfile: IamInstanceProfileSpecification
    var SubnetId: String
  }

  object RequestSpotLaunchSpecification {
    def apply(
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[SpotPlacement] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      AddressingType: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[ValueStringList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      SecurityGroupIds: js.UndefOr[ValueStringList] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): RequestSpotLaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaces" -> NetworkInterfaces.map { x => x: js.Any }),
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("Placement" -> Placement.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("AddressingType" -> AddressingType.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("Monitoring" -> Monitoring.map { x => x: js.Any }),
        ("IamInstanceProfile" -> IamInstanceProfile.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestSpotLaunchSpecification]
    }
  }

  /**
   * <p>Describes a reservation.</p>
   */
  @js.native
  trait Reservation extends js.Object {
    var RequesterId: String
    var Groups: GroupIdentifierList
    var OwnerId: String
    var Instances: InstanceList
    var ReservationId: String
  }

  object Reservation {
    def apply(
      RequesterId: js.UndefOr[String] = js.undefined,
      Groups: js.UndefOr[GroupIdentifierList] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Instances: js.UndefOr[InstanceList] = js.undefined,
      ReservationId: js.UndefOr[String] = js.undefined
    ): Reservation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RequesterId" -> RequesterId.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("ReservationId" -> ReservationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Reservation]
    }
  }


  object ReservationStateEnum {
    val `payment-pending` = "payment-pending"
    val `payment-failed` = "payment-failed"
    val active = "active"
    val retired = "retired"

    val values = IndexedSeq(`payment-pending`, `payment-failed`, active, retired)
  }

  /**
   * <p>The cost associated with the Reserved Instance.</p>
   */
  @js.native
  trait ReservationValue extends js.Object {
    var RemainingTotalValue: String
    var RemainingUpfrontValue: String
    var HourlyPrice: String
  }

  object ReservationValue {
    def apply(
      RemainingTotalValue: js.UndefOr[String] = js.undefined,
      RemainingUpfrontValue: js.UndefOr[String] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined
    ): ReservationValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RemainingTotalValue" -> RemainingTotalValue.map { x => x: js.Any }),
        ("RemainingUpfrontValue" -> RemainingUpfrontValue.map { x => x: js.Any }),
        ("HourlyPrice" -> HourlyPrice.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservationValue]
    }
  }

  /**
   * <p>Describes the limit price of a Reserved Instance offering.</p>
   */
  @js.native
  trait ReservedInstanceLimitPrice extends js.Object {
    var Amount: Double
    var CurrencyCode: CurrencyCodeValues
  }

  object ReservedInstanceLimitPrice {
    def apply(
      Amount: js.UndefOr[Double] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
    ): ReservedInstanceLimitPrice = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Amount" -> Amount.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstanceLimitPrice]
    }
  }

  /**
   * <p>The total value of the Convertible Reserved Instance.</p>
   */
  @js.native
  trait ReservedInstanceReservationValue extends js.Object {
    var ReservedInstanceId: String
    var ReservationValue: ReservationValue
  }

  object ReservedInstanceReservationValue {
    def apply(
      ReservedInstanceId: js.UndefOr[String] = js.undefined,
      ReservationValue: js.UndefOr[ReservationValue] = js.undefined
    ): ReservedInstanceReservationValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstanceId" -> ReservedInstanceId.map { x => x: js.Any }),
        ("ReservationValue" -> ReservationValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstanceReservationValue]
    }
  }


  object ReservedInstanceStateEnum {
    val `payment-pending` = "payment-pending"
    val active = "active"
    val `payment-failed` = "payment-failed"
    val retired = "retired"

    val values = IndexedSeq(`payment-pending`, active, `payment-failed`, retired)
  }

  /**
   * <p>Describes a Reserved Instance.</p>
   */
  @js.native
  trait ReservedInstances extends js.Object {
    var Scope: scope
    var CurrencyCode: CurrencyCodeValues
    var Duration: Long
    var FixedPrice: Float
    var OfferingClass: OfferingClassType
    var RecurringCharges: RecurringChargesList
    var InstanceCount: Integer
    var Start: DateTime
    var AvailabilityZone: String
    var OfferingType: OfferingTypeValues
    var UsagePrice: Float
    var InstanceType: InstanceType
    var End: DateTime
    var Tags: TagList
    var State: ReservedInstanceState
    var ProductDescription: RIProductDescription
    var ReservedInstancesId: String
    var InstanceTenancy: Tenancy
  }

  object ReservedInstances {
    def apply(
      Scope: js.UndefOr[scope] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Long] = js.undefined,
      FixedPrice: js.UndefOr[Float] = js.undefined,
      OfferingClass: js.UndefOr[OfferingClassType] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargesList] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      Start: js.UndefOr[DateTime] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined,
      UsagePrice: js.UndefOr[Float] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      End: js.UndefOr[DateTime] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      State: js.UndefOr[ReservedInstanceState] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined,
      ReservedInstancesId: js.UndefOr[String] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined
    ): ReservedInstances = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Scope" -> Scope.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("FixedPrice" -> FixedPrice.map { x => x: js.Any }),
        ("OfferingClass" -> OfferingClass.map { x => x: js.Any }),
        ("RecurringCharges" -> RecurringCharges.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("Start" -> Start.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("UsagePrice" -> UsagePrice.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("End" -> End.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("ReservedInstancesId" -> ReservedInstancesId.map { x => x: js.Any }),
        ("InstanceTenancy" -> InstanceTenancy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstances]
    }
  }

  /**
   * <p>Describes the configuration settings for the modified Reserved Instances.</p>
   */
  @js.native
  trait ReservedInstancesConfiguration extends js.Object {
    var Scope: scope
    var Platform: String
    var InstanceCount: Integer
    var AvailabilityZone: String
    var InstanceType: InstanceType
  }

  object ReservedInstancesConfiguration {
    def apply(
      Scope: js.UndefOr[scope] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined
    ): ReservedInstancesConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Scope" -> Scope.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesConfiguration]
    }
  }

  /**
   * <p>Describes the ID of a Reserved Instance.</p>
   */
  @js.native
  trait ReservedInstancesId extends js.Object {
    var ReservedInstancesId: String
  }

  object ReservedInstancesId {
    def apply(
      ReservedInstancesId: js.UndefOr[String] = js.undefined
    ): ReservedInstancesId = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesId" -> ReservedInstancesId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesId]
    }
  }

  /**
   * <p>Describes a Reserved Instance listing.</p>
   */
  @js.native
  trait ReservedInstancesListing extends js.Object {
    var StatusMessage: String
    var ClientToken: String
    var PriceSchedules: PriceScheduleList
    var UpdateDate: DateTime
    var InstanceCounts: InstanceCountList
    var CreateDate: DateTime
    var Tags: TagList
    var ReservedInstancesListingId: String
    var ReservedInstancesId: String
    var Status: ListingStatus
  }

  object ReservedInstancesListing {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      PriceSchedules: js.UndefOr[PriceScheduleList] = js.undefined,
      UpdateDate: js.UndefOr[DateTime] = js.undefined,
      InstanceCounts: js.UndefOr[InstanceCountList] = js.undefined,
      CreateDate: js.UndefOr[DateTime] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ReservedInstancesListingId: js.UndefOr[String] = js.undefined,
      ReservedInstancesId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[ListingStatus] = js.undefined
    ): ReservedInstancesListing = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("PriceSchedules" -> PriceSchedules.map { x => x: js.Any }),
        ("UpdateDate" -> UpdateDate.map { x => x: js.Any }),
        ("InstanceCounts" -> InstanceCounts.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ReservedInstancesListingId" -> ReservedInstancesListingId.map { x => x: js.Any }),
        ("ReservedInstancesId" -> ReservedInstancesId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesListing]
    }
  }

  /**
   * <p>Describes a Reserved Instance modification.</p>
   */
  @js.native
  trait ReservedInstancesModification extends js.Object {
    var StatusMessage: String
    var ClientToken: String
    var UpdateDate: DateTime
    var CreateDate: DateTime
    var EffectiveDate: DateTime
    var ModificationResults: ReservedInstancesModificationResultList
    var ReservedInstancesModificationId: String
    var ReservedInstancesIds: ReservedIntancesIds
    var Status: String
  }

  object ReservedInstancesModification {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      UpdateDate: js.UndefOr[DateTime] = js.undefined,
      CreateDate: js.UndefOr[DateTime] = js.undefined,
      EffectiveDate: js.UndefOr[DateTime] = js.undefined,
      ModificationResults: js.UndefOr[ReservedInstancesModificationResultList] = js.undefined,
      ReservedInstancesModificationId: js.UndefOr[String] = js.undefined,
      ReservedInstancesIds: js.UndefOr[ReservedIntancesIds] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): ReservedInstancesModification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("UpdateDate" -> UpdateDate.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("EffectiveDate" -> EffectiveDate.map { x => x: js.Any }),
        ("ModificationResults" -> ModificationResults.map { x => x: js.Any }),
        ("ReservedInstancesModificationId" -> ReservedInstancesModificationId.map { x => x: js.Any }),
        ("ReservedInstancesIds" -> ReservedInstancesIds.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesModification]
    }
  }

  /**
   * <p>Describes the modification request/s.</p>
   */
  @js.native
  trait ReservedInstancesModificationResult extends js.Object {
    var ReservedInstancesId: String
    var TargetConfiguration: ReservedInstancesConfiguration
  }

  object ReservedInstancesModificationResult {
    def apply(
      ReservedInstancesId: js.UndefOr[String] = js.undefined,
      TargetConfiguration: js.UndefOr[ReservedInstancesConfiguration] = js.undefined
    ): ReservedInstancesModificationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedInstancesId" -> ReservedInstancesId.map { x => x: js.Any }),
        ("TargetConfiguration" -> TargetConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesModificationResult]
    }
  }

  /**
   * <p>Describes a Reserved Instance offering.</p>
   */
  @js.native
  trait ReservedInstancesOffering extends js.Object {
    var Scope: scope
    var CurrencyCode: CurrencyCodeValues
    var Duration: Long
    var FixedPrice: Float
    var OfferingClass: OfferingClassType
    var RecurringCharges: RecurringChargesList
    var AvailabilityZone: String
    var OfferingType: OfferingTypeValues
    var PricingDetails: PricingDetailsList
    var UsagePrice: Float
    var InstanceType: InstanceType
    var ReservedInstancesOfferingId: String
    var ProductDescription: RIProductDescription
    var Marketplace: Boolean
    var InstanceTenancy: Tenancy
  }

  object ReservedInstancesOffering {
    def apply(
      Scope: js.UndefOr[scope] = js.undefined,
      CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined,
      Duration: js.UndefOr[Long] = js.undefined,
      FixedPrice: js.UndefOr[Float] = js.undefined,
      OfferingClass: js.UndefOr[OfferingClassType] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargesList] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      OfferingType: js.UndefOr[OfferingTypeValues] = js.undefined,
      PricingDetails: js.UndefOr[PricingDetailsList] = js.undefined,
      UsagePrice: js.UndefOr[Float] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      ReservedInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined,
      Marketplace: js.UndefOr[Boolean] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined
    ): ReservedInstancesOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Scope" -> Scope.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("FixedPrice" -> FixedPrice.map { x => x: js.Any }),
        ("OfferingClass" -> OfferingClass.map { x => x: js.Any }),
        ("RecurringCharges" -> RecurringCharges.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("PricingDetails" -> PricingDetails.map { x => x: js.Any }),
        ("UsagePrice" -> UsagePrice.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("ReservedInstancesOfferingId" -> ReservedInstancesOfferingId.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("Marketplace" -> Marketplace.map { x => x: js.Any }),
        ("InstanceTenancy" -> InstanceTenancy.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedInstancesOffering]
    }
  }


  object ResetImageAttributeNameEnum {
    val launchPermission = "launchPermission"

    val values = IndexedSeq(launchPermission)
  }

  /**
   * <p>Contains the parameters for ResetImageAttribute.</p>
   */
  @js.native
  trait ResetImageAttributeRequest extends js.Object {
    var DryRun: Boolean
    var ImageId: String
    var Attribute: ResetImageAttributeName
  }

  object ResetImageAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[ResetImageAttributeName] = js.undefined
    ): ResetImageAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetImageAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ResetInstanceAttribute.</p>
   */
  @js.native
  trait ResetInstanceAttributeRequest extends js.Object {
    var DryRun: Boolean
    var InstanceId: String
    var Attribute: InstanceAttributeName
  }

  object ResetInstanceAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[InstanceAttributeName] = js.undefined
    ): ResetInstanceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetInstanceAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ResetNetworkInterfaceAttribute.</p>
   */
  @js.native
  trait ResetNetworkInterfaceAttributeRequest extends js.Object {
    var DryRun: Boolean
    var NetworkInterfaceId: String
    var SourceDestCheck: String
  }

  object ResetNetworkInterfaceAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SourceDestCheck: js.UndefOr[String] = js.undefined
    ): ResetNetworkInterfaceAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("SourceDestCheck" -> SourceDestCheck.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetNetworkInterfaceAttributeRequest]
    }
  }

  /**
   * <p>Contains the parameters for ResetSnapshotAttribute.</p>
   */
  @js.native
  trait ResetSnapshotAttributeRequest extends js.Object {
    var DryRun: Boolean
    var SnapshotId: String
    var Attribute: SnapshotAttributeName
  }

  object ResetSnapshotAttributeRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Attribute: js.UndefOr[SnapshotAttributeName] = js.undefined
    ): ResetSnapshotAttributeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("Attribute" -> Attribute.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetSnapshotAttributeRequest]
    }
  }


  object ResourceTypeEnum {
    val `customer-gateway` = "customer-gateway"
    val `dhcp-options` = "dhcp-options"
    val image = "image"
    val instance = "instance"
    val `internet-gateway` = "internet-gateway"
    val `network-acl` = "network-acl"
    val `network-interface` = "network-interface"
    val `reserved-instances` = "reserved-instances"
    val `route-table` = "route-table"
    val snapshot = "snapshot"
    val `spot-instances-request` = "spot-instances-request"
    val subnet = "subnet"
    val `security-group` = "security-group"
    val volume = "volume"
    val vpc = "vpc"
    val `vpn-connection` = "vpn-connection"
    val `vpn-gateway` = "vpn-gateway"

    val values = IndexedSeq(`customer-gateway`, `dhcp-options`, image, instance, `internet-gateway`, `network-acl`, `network-interface`, `reserved-instances`, `route-table`, snapshot, `spot-instances-request`, subnet, `security-group`, volume, vpc, `vpn-connection`, `vpn-gateway`)
  }

  /**
   * <p>Contains the parameters for RestoreAddressToClassic.</p>
   */
  @js.native
  trait RestoreAddressToClassicRequest extends js.Object {
    var DryRun: Boolean
    var PublicIp: String
  }

  object RestoreAddressToClassicRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined
    ): RestoreAddressToClassicRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreAddressToClassicRequest]
    }
  }

  /**
   * <p>Contains the output of RestoreAddressToClassic.</p>
   */
  @js.native
  trait RestoreAddressToClassicResult extends js.Object {
    var Status: Status
    var PublicIp: String
  }

  object RestoreAddressToClassicResult {
    def apply(
      Status: js.UndefOr[Status] = js.undefined,
      PublicIp: js.UndefOr[String] = js.undefined
    ): RestoreAddressToClassicResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("PublicIp" -> PublicIp.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreAddressToClassicResult]
    }
  }

  /**
   * <p>Contains the parameters for RevokeSecurityGroupEgress.</p>
   */
  @js.native
  trait RevokeSecurityGroupEgressRequest extends js.Object {
    var DryRun: Boolean
    var CidrIp: String
    var IpPermissions: IpPermissionList
    var SourceSecurityGroupName: String
    var GroupId: String
    var ToPort: Integer
    var FromPort: Integer
    var IpProtocol: String
    var SourceSecurityGroupOwnerId: String
  }

  object RevokeSecurityGroupEgressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CidrIp: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      SourceSecurityGroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      ToPort: js.UndefOr[Integer] = js.undefined,
      FromPort: js.UndefOr[Integer] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined,
      SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): RevokeSecurityGroupEgressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("CidrIp" -> CidrIp.map { x => x: js.Any }),
        ("IpPermissions" -> IpPermissions.map { x => x: js.Any }),
        ("SourceSecurityGroupName" -> SourceSecurityGroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("ToPort" -> ToPort.map { x => x: js.Any }),
        ("FromPort" -> FromPort.map { x => x: js.Any }),
        ("IpProtocol" -> IpProtocol.map { x => x: js.Any }),
        ("SourceSecurityGroupOwnerId" -> SourceSecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSecurityGroupEgressRequest]
    }
  }

  /**
   * <p>Contains the parameters for RevokeSecurityGroupIngress.</p>
   */
  @js.native
  trait RevokeSecurityGroupIngressRequest extends js.Object {
    var DryRun: Boolean
    var CidrIp: String
    var IpPermissions: IpPermissionList
    var SourceSecurityGroupName: String
    var GroupName: String
    var GroupId: String
    var ToPort: Integer
    var FromPort: Integer
    var IpProtocol: String
    var SourceSecurityGroupOwnerId: String
  }

  object RevokeSecurityGroupIngressRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      CidrIp: js.UndefOr[String] = js.undefined,
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      SourceSecurityGroupName: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      ToPort: js.UndefOr[Integer] = js.undefined,
      FromPort: js.UndefOr[Integer] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined,
      SourceSecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): RevokeSecurityGroupIngressRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("CidrIp" -> CidrIp.map { x => x: js.Any }),
        ("IpPermissions" -> IpPermissions.map { x => x: js.Any }),
        ("SourceSecurityGroupName" -> SourceSecurityGroupName.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("ToPort" -> ToPort.map { x => x: js.Any }),
        ("FromPort" -> FromPort.map { x => x: js.Any }),
        ("IpProtocol" -> IpProtocol.map { x => x: js.Any }),
        ("SourceSecurityGroupOwnerId" -> SourceSecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeSecurityGroupIngressRequest]
    }
  }

  /**
   * <p>Describes a route in a route table.</p>
   */
  @js.native
  trait Route extends js.Object {
    var InstanceOwnerId: String
    var DestinationCidrBlock: String
    var VpcPeeringConnectionId: String
    var DestinationPrefixListId: String
    var NatGatewayId: String
    var Origin: RouteOrigin
    var EgressOnlyInternetGatewayId: String
    var InstanceId: String
    var NetworkInterfaceId: String
    var DestinationIpv6CidrBlock: String
    var State: RouteState
    var GatewayId: String
  }

  object Route {
    def apply(
      InstanceOwnerId: js.UndefOr[String] = js.undefined,
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      DestinationPrefixListId: js.UndefOr[String] = js.undefined,
      NatGatewayId: js.UndefOr[String] = js.undefined,
      Origin: js.UndefOr[RouteOrigin] = js.undefined,
      EgressOnlyInternetGatewayId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      DestinationIpv6CidrBlock: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[RouteState] = js.undefined,
      GatewayId: js.UndefOr[String] = js.undefined
    ): Route = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceOwnerId" -> InstanceOwnerId.map { x => x: js.Any }),
        ("DestinationCidrBlock" -> DestinationCidrBlock.map { x => x: js.Any }),
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any }),
        ("DestinationPrefixListId" -> DestinationPrefixListId.map { x => x: js.Any }),
        ("NatGatewayId" -> NatGatewayId.map { x => x: js.Any }),
        ("Origin" -> Origin.map { x => x: js.Any }),
        ("EgressOnlyInternetGatewayId" -> EgressOnlyInternetGatewayId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("DestinationIpv6CidrBlock" -> DestinationIpv6CidrBlock.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("GatewayId" -> GatewayId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Route]
    }
  }


  object RouteOriginEnum {
    val CreateRouteTable = "CreateRouteTable"
    val CreateRoute = "CreateRoute"
    val EnableVgwRoutePropagation = "EnableVgwRoutePropagation"

    val values = IndexedSeq(CreateRouteTable, CreateRoute, EnableVgwRoutePropagation)
  }


  object RouteStateEnum {
    val active = "active"
    val blackhole = "blackhole"

    val values = IndexedSeq(active, blackhole)
  }

  /**
   * <p>Describes a route table.</p>
   */
  @js.native
  trait RouteTable extends js.Object {
    var Associations: RouteTableAssociationList
    var RouteTableId: String
    var Routes: RouteList
    var Tags: TagList
    var PropagatingVgws: PropagatingVgwList
    var VpcId: String
  }

  object RouteTable {
    def apply(
      Associations: js.UndefOr[RouteTableAssociationList] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      Routes: js.UndefOr[RouteList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PropagatingVgws: js.UndefOr[PropagatingVgwList] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): RouteTable = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Associations" -> Associations.map { x => x: js.Any }),
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any }),
        ("Routes" -> Routes.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("PropagatingVgws" -> PropagatingVgws.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteTable]
    }
  }

  /**
   * <p>Describes an association between a route table and a subnet.</p>
   */
  @js.native
  trait RouteTableAssociation extends js.Object {
    var RouteTableAssociationId: String
    var RouteTableId: String
    var SubnetId: String
    var Main: Boolean
  }

  object RouteTableAssociation {
    def apply(
      RouteTableAssociationId: js.UndefOr[String] = js.undefined,
      RouteTableId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined,
      Main: js.UndefOr[Boolean] = js.undefined
    ): RouteTableAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RouteTableAssociationId" -> RouteTableAssociationId.map { x => x: js.Any }),
        ("RouteTableId" -> RouteTableId.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any }),
        ("Main" -> Main.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteTableAssociation]
    }
  }


  object RuleActionEnum {
    val allow = "allow"
    val deny = "deny"

    val values = IndexedSeq(allow, deny)
  }

  /**
   * <p>Describes the monitoring of an instance.</p>
   */
  @js.native
  trait RunInstancesMonitoringEnabled extends js.Object {
    var Enabled: Boolean
  }

  object RunInstancesMonitoringEnabled {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined
    ): RunInstancesMonitoringEnabled = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunInstancesMonitoringEnabled]
    }
  }

  /**
   * <p>Contains the parameters for RunInstances.</p>
   */
  @js.native
  trait RunInstancesRequest extends js.Object {
    var NetworkInterfaces: InstanceNetworkInterfaceSpecificationList
    var Ipv6Addresses: InstanceIpv6AddressList
    var RamdiskId: String
    var BlockDeviceMappings: BlockDeviceMappingRequestList
    var DryRun: Boolean
    var ImageId: String
    var InstanceInitiatedShutdownBehavior: ShutdownBehavior
    var PrivateIpAddress: String
    var EbsOptimized: Boolean
    var Placement: Placement
    var ClientToken: String
    var DisableApiTermination: Boolean
    var UserData: String
    var SecurityGroups: SecurityGroupStringList
    var Ipv6AddressCount: Integer
    var MinCount: Integer
    var KernelId: String
    var SecurityGroupIds: SecurityGroupIdStringList
    var MaxCount: Integer
    var KeyName: String
    var InstanceType: InstanceType
    var AdditionalInfo: String
    var Monitoring: RunInstancesMonitoringEnabled
    var IamInstanceProfile: IamInstanceProfileSpecification
    var SubnetId: String
  }

  object RunInstancesRequest {
    def apply(
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined,
      Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[Placement] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      DisableApiTermination: js.UndefOr[Boolean] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[SecurityGroupStringList] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Integer] = js.undefined,
      MinCount: js.UndefOr[Integer] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined,
      MaxCount: js.UndefOr[Integer] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      AdditionalInfo: js.UndefOr[String] = js.undefined,
      Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): RunInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaces" -> NetworkInterfaces.map { x => x: js.Any }),
        ("Ipv6Addresses" -> Ipv6Addresses.map { x => x: js.Any }),
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("InstanceInitiatedShutdownBehavior" -> InstanceInitiatedShutdownBehavior.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("Placement" -> Placement.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("DisableApiTermination" -> DisableApiTermination.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("Ipv6AddressCount" -> Ipv6AddressCount.map { x => x: js.Any }),
        ("MinCount" -> MinCount.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("MaxCount" -> MaxCount.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("AdditionalInfo" -> AdditionalInfo.map { x => x: js.Any }),
        ("Monitoring" -> Monitoring.map { x => x: js.Any }),
        ("IamInstanceProfile" -> IamInstanceProfile.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunInstancesRequest]
    }
  }

  /**
   * <p>Contains the parameters for RunScheduledInstances.</p>
   */
  @js.native
  trait RunScheduledInstancesRequest extends js.Object {
    var DryRun: Boolean
    var ClientToken: String
    var InstanceCount: Integer
    var ScheduledInstanceId: String
    var LaunchSpecification: ScheduledInstancesLaunchSpecification
  }

  object RunScheduledInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      ScheduledInstanceId: js.UndefOr[String] = js.undefined,
      LaunchSpecification: js.UndefOr[ScheduledInstancesLaunchSpecification] = js.undefined
    ): RunScheduledInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("ScheduledInstanceId" -> ScheduledInstanceId.map { x => x: js.Any }),
        ("LaunchSpecification" -> LaunchSpecification.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunScheduledInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of RunScheduledInstances.</p>
   */
  @js.native
  trait RunScheduledInstancesResult extends js.Object {
    var InstanceIdSet: InstanceIdSet
  }

  object RunScheduledInstancesResult {
    def apply(
      InstanceIdSet: js.UndefOr[InstanceIdSet] = js.undefined
    ): RunScheduledInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIdSet" -> InstanceIdSet.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RunScheduledInstancesResult]
    }
  }

  /**
   * <p>Describes the storage parameters for S3 and S3 buckets for an instance store-backed AMI.</p>
   */
  @js.native
  trait S3Storage extends js.Object {
    var Bucket: String
    var UploadPolicySignature: String
    var AWSAccessKeyId: String
    var UploadPolicy: Blob
    var Prefix: String
  }

  object S3Storage {
    def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      UploadPolicySignature: js.UndefOr[String] = js.undefined,
      AWSAccessKeyId: js.UndefOr[String] = js.undefined,
      UploadPolicy: js.UndefOr[Blob] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined
    ): S3Storage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("UploadPolicySignature" -> UploadPolicySignature.map { x => x: js.Any }),
        ("AWSAccessKeyId" -> AWSAccessKeyId.map { x => x: js.Any }),
        ("UploadPolicy" -> UploadPolicy.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Storage]
    }
  }

  /**
   * <p>Describes a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstance extends js.Object {
    var TermEndDate: DateTime
    var SlotDurationInHours: Integer
    var Platform: String
    var NextSlotStartTime: DateTime
    var TotalScheduledInstanceHours: Integer
    var InstanceCount: Integer
    var TermStartDate: DateTime
    var AvailabilityZone: String
    var NetworkPlatform: String
    var CreateDate: DateTime
    var HourlyPrice: String
    var InstanceType: String
    var ScheduledInstanceId: String
    var PreviousSlotEndTime: DateTime
    var Recurrence: ScheduledInstanceRecurrence
  }

  object ScheduledInstance {
    def apply(
      TermEndDate: js.UndefOr[DateTime] = js.undefined,
      SlotDurationInHours: js.UndefOr[Integer] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      NextSlotStartTime: js.UndefOr[DateTime] = js.undefined,
      TotalScheduledInstanceHours: js.UndefOr[Integer] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined,
      TermStartDate: js.UndefOr[DateTime] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      NetworkPlatform: js.UndefOr[String] = js.undefined,
      CreateDate: js.UndefOr[DateTime] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      ScheduledInstanceId: js.UndefOr[String] = js.undefined,
      PreviousSlotEndTime: js.UndefOr[DateTime] = js.undefined,
      Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.undefined
    ): ScheduledInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TermEndDate" -> TermEndDate.map { x => x: js.Any }),
        ("SlotDurationInHours" -> SlotDurationInHours.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("NextSlotStartTime" -> NextSlotStartTime.map { x => x: js.Any }),
        ("TotalScheduledInstanceHours" -> TotalScheduledInstanceHours.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any }),
        ("TermStartDate" -> TermStartDate.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("NetworkPlatform" -> NetworkPlatform.map { x => x: js.Any }),
        ("CreateDate" -> CreateDate.map { x => x: js.Any }),
        ("HourlyPrice" -> HourlyPrice.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("ScheduledInstanceId" -> ScheduledInstanceId.map { x => x: js.Any }),
        ("PreviousSlotEndTime" -> PreviousSlotEndTime.map { x => x: js.Any }),
        ("Recurrence" -> Recurrence.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstance]
    }
  }

  /**
   * <p>Describes a schedule that is available for your Scheduled Instances.</p>
   */
  @js.native
  trait ScheduledInstanceAvailability extends js.Object {
    var PurchaseToken: String
    var SlotDurationInHours: Integer
    var Platform: String
    var MaxTermDurationInDays: Integer
    var FirstSlotStartTime: DateTime
    var TotalScheduledInstanceHours: Integer
    var AvailabilityZone: String
    var NetworkPlatform: String
    var HourlyPrice: String
    var AvailableInstanceCount: Integer
    var InstanceType: String
    var MinTermDurationInDays: Integer
    var Recurrence: ScheduledInstanceRecurrence
  }

  object ScheduledInstanceAvailability {
    def apply(
      PurchaseToken: js.UndefOr[String] = js.undefined,
      SlotDurationInHours: js.UndefOr[Integer] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      MaxTermDurationInDays: js.UndefOr[Integer] = js.undefined,
      FirstSlotStartTime: js.UndefOr[DateTime] = js.undefined,
      TotalScheduledInstanceHours: js.UndefOr[Integer] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      NetworkPlatform: js.UndefOr[String] = js.undefined,
      HourlyPrice: js.UndefOr[String] = js.undefined,
      AvailableInstanceCount: js.UndefOr[Integer] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      MinTermDurationInDays: js.UndefOr[Integer] = js.undefined,
      Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.undefined
    ): ScheduledInstanceAvailability = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PurchaseToken" -> PurchaseToken.map { x => x: js.Any }),
        ("SlotDurationInHours" -> SlotDurationInHours.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("MaxTermDurationInDays" -> MaxTermDurationInDays.map { x => x: js.Any }),
        ("FirstSlotStartTime" -> FirstSlotStartTime.map { x => x: js.Any }),
        ("TotalScheduledInstanceHours" -> TotalScheduledInstanceHours.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("NetworkPlatform" -> NetworkPlatform.map { x => x: js.Any }),
        ("HourlyPrice" -> HourlyPrice.map { x => x: js.Any }),
        ("AvailableInstanceCount" -> AvailableInstanceCount.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("MinTermDurationInDays" -> MinTermDurationInDays.map { x => x: js.Any }),
        ("Recurrence" -> Recurrence.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstanceAvailability]
    }
  }

  /**
   * <p>Describes the recurring schedule for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstanceRecurrence extends js.Object {
    var OccurrenceDaySet: OccurrenceDaySet
    var Interval: Integer
    var OccurrenceRelativeToEnd: Boolean
    var OccurrenceUnit: String
    var Frequency: String
  }

  object ScheduledInstanceRecurrence {
    def apply(
      OccurrenceDaySet: js.UndefOr[OccurrenceDaySet] = js.undefined,
      Interval: js.UndefOr[Integer] = js.undefined,
      OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.undefined,
      OccurrenceUnit: js.UndefOr[String] = js.undefined,
      Frequency: js.UndefOr[String] = js.undefined
    ): ScheduledInstanceRecurrence = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OccurrenceDaySet" -> OccurrenceDaySet.map { x => x: js.Any }),
        ("Interval" -> Interval.map { x => x: js.Any }),
        ("OccurrenceRelativeToEnd" -> OccurrenceRelativeToEnd.map { x => x: js.Any }),
        ("OccurrenceUnit" -> OccurrenceUnit.map { x => x: js.Any }),
        ("Frequency" -> Frequency.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstanceRecurrence]
    }
  }

  /**
   * <p>Describes the recurring schedule for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstanceRecurrenceRequest extends js.Object {
    var Interval: Integer
    var OccurrenceRelativeToEnd: Boolean
    var OccurrenceDays: OccurrenceDayRequestSet
    var OccurrenceUnit: String
    var Frequency: String
  }

  object ScheduledInstanceRecurrenceRequest {
    def apply(
      Interval: js.UndefOr[Integer] = js.undefined,
      OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.undefined,
      OccurrenceDays: js.UndefOr[OccurrenceDayRequestSet] = js.undefined,
      OccurrenceUnit: js.UndefOr[String] = js.undefined,
      Frequency: js.UndefOr[String] = js.undefined
    ): ScheduledInstanceRecurrenceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Interval" -> Interval.map { x => x: js.Any }),
        ("OccurrenceRelativeToEnd" -> OccurrenceRelativeToEnd.map { x => x: js.Any }),
        ("OccurrenceDays" -> OccurrenceDays.map { x => x: js.Any }),
        ("OccurrenceUnit" -> OccurrenceUnit.map { x => x: js.Any }),
        ("Frequency" -> Frequency.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstanceRecurrenceRequest]
    }
  }

  /**
   * <p>Describes a block device mapping for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesBlockDeviceMapping extends js.Object {
    var DeviceName: String
    var NoDevice: String
    var VirtualName: String
    var Ebs: ScheduledInstancesEbs
  }

  object ScheduledInstancesBlockDeviceMapping {
    def apply(
      DeviceName: js.UndefOr[String] = js.undefined,
      NoDevice: js.UndefOr[String] = js.undefined,
      VirtualName: js.UndefOr[String] = js.undefined,
      Ebs: js.UndefOr[ScheduledInstancesEbs] = js.undefined
    ): ScheduledInstancesBlockDeviceMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeviceName" -> DeviceName.map { x => x: js.Any }),
        ("NoDevice" -> NoDevice.map { x => x: js.Any }),
        ("VirtualName" -> VirtualName.map { x => x: js.Any }),
        ("Ebs" -> Ebs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesBlockDeviceMapping]
    }
  }

  /**
   * <p>Describes an EBS volume for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesEbs extends js.Object {
    var VolumeType: String
    var SnapshotId: String
    var Encrypted: Boolean
    var VolumeSize: Integer
    var Iops: Integer
    var DeleteOnTermination: Boolean
  }

  object ScheduledInstancesEbs {
    def apply(
      VolumeType: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      VolumeSize: js.UndefOr[Integer] = js.undefined,
      Iops: js.UndefOr[Integer] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
    ): ScheduledInstancesEbs = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("VolumeSize" -> VolumeSize.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesEbs]
    }
  }

  /**
   * <p>Describes an IAM instance profile for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesIamInstanceProfile extends js.Object {
    var Arn: String
    var Name: String
  }

  object ScheduledInstancesIamInstanceProfile {
    def apply(
      Arn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined
    ): ScheduledInstancesIamInstanceProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Arn" -> Arn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesIamInstanceProfile]
    }
  }

  /**
   * <p>Describes an IPv6 address.</p>
   */
  @js.native
  trait ScheduledInstancesIpv6Address extends js.Object {
    var Ipv6Address: Ipv6Address
  }

  object ScheduledInstancesIpv6Address {
    def apply(
      Ipv6Address: js.UndefOr[Ipv6Address] = js.undefined
    ): ScheduledInstancesIpv6Address = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6Address" -> Ipv6Address.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesIpv6Address]
    }
  }

  /**
   * <p>Describes the launch specification for a Scheduled Instance.</p> <p>If you are launching the Scheduled Instance in EC2-VPC, you must specify the ID of the subnet. You can specify the subnet using either <code>SubnetId</code> or <code>NetworkInterface</code>.</p>
   */
  @js.native
  trait ScheduledInstancesLaunchSpecification extends js.Object {
    var NetworkInterfaces: ScheduledInstancesNetworkInterfaceSet
    var RamdiskId: String
    var BlockDeviceMappings: ScheduledInstancesBlockDeviceMappingSet
    var ImageId: String
    var EbsOptimized: Boolean
    var Placement: ScheduledInstancesPlacement
    var UserData: String
    var KernelId: String
    var SecurityGroupIds: ScheduledInstancesSecurityGroupIdSet
    var KeyName: String
    var InstanceType: String
    var Monitoring: ScheduledInstancesMonitoring
    var IamInstanceProfile: ScheduledInstancesIamInstanceProfile
    var SubnetId: String
  }

  object ScheduledInstancesLaunchSpecification {
    def apply(
      NetworkInterfaces: js.UndefOr[ScheduledInstancesNetworkInterfaceSet] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[ScheduledInstancesBlockDeviceMappingSet] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[ScheduledInstancesPlacement] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      SecurityGroupIds: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[String] = js.undefined,
      Monitoring: js.UndefOr[ScheduledInstancesMonitoring] = js.undefined,
      IamInstanceProfile: js.UndefOr[ScheduledInstancesIamInstanceProfile] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): ScheduledInstancesLaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaces" -> NetworkInterfaces.map { x => x: js.Any }),
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("Placement" -> Placement.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("SecurityGroupIds" -> SecurityGroupIds.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("Monitoring" -> Monitoring.map { x => x: js.Any }),
        ("IamInstanceProfile" -> IamInstanceProfile.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesLaunchSpecification]
    }
  }

  /**
   * <p>Describes whether monitoring is enabled for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesMonitoring extends js.Object {
    var Enabled: Boolean
  }

  object ScheduledInstancesMonitoring {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined
    ): ScheduledInstancesMonitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesMonitoring]
    }
  }

  /**
   * <p>Describes a network interface for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesNetworkInterface extends js.Object {
    var Ipv6Addresses: ScheduledInstancesIpv6AddressList
    var PrivateIpAddressConfigs: PrivateIpAddressConfigSet
    var PrivateIpAddress: String
    var Description: String
    var Ipv6AddressCount: Integer
    var Groups: ScheduledInstancesSecurityGroupIdSet
    var DeviceIndex: Integer
    var DeleteOnTermination: Boolean
    var AssociatePublicIpAddress: Boolean
    var NetworkInterfaceId: String
    var SecondaryPrivateIpAddressCount: Integer
    var SubnetId: String
  }

  object ScheduledInstancesNetworkInterface {
    def apply(
      Ipv6Addresses: js.UndefOr[ScheduledInstancesIpv6AddressList] = js.undefined,
      PrivateIpAddressConfigs: js.UndefOr[PrivateIpAddressConfigSet] = js.undefined,
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Ipv6AddressCount: js.UndefOr[Integer] = js.undefined,
      Groups: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.undefined,
      DeviceIndex: js.UndefOr[Integer] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): ScheduledInstancesNetworkInterface = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6Addresses" -> Ipv6Addresses.map { x => x: js.Any }),
        ("PrivateIpAddressConfigs" -> PrivateIpAddressConfigs.map { x => x: js.Any }),
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Ipv6AddressCount" -> Ipv6AddressCount.map { x => x: js.Any }),
        ("Groups" -> Groups.map { x => x: js.Any }),
        ("DeviceIndex" -> DeviceIndex.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any }),
        ("AssociatePublicIpAddress" -> AssociatePublicIpAddress.map { x => x: js.Any }),
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("SecondaryPrivateIpAddressCount" -> SecondaryPrivateIpAddressCount.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesNetworkInterface]
    }
  }

  /**
   * <p>Describes the placement for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesPlacement extends js.Object {
    var AvailabilityZone: String
    var GroupName: String
  }

  object ScheduledInstancesPlacement {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined
    ): ScheduledInstancesPlacement = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesPlacement]
    }
  }

  /**
   * <p>Describes a private IPv4 address for a Scheduled Instance.</p>
   */
  @js.native
  trait ScheduledInstancesPrivateIpAddressConfig extends js.Object {
    var PrivateIpAddress: String
    var Primary: Boolean
  }

  object ScheduledInstancesPrivateIpAddressConfig {
    def apply(
      PrivateIpAddress: js.UndefOr[String] = js.undefined,
      Primary: js.UndefOr[Boolean] = js.undefined
    ): ScheduledInstancesPrivateIpAddressConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrivateIpAddress" -> PrivateIpAddress.map { x => x: js.Any }),
        ("Primary" -> Primary.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduledInstancesPrivateIpAddressConfig]
    }
  }

  /**
   * <p>Describes a security group</p>
   */
  @js.native
  trait SecurityGroup extends js.Object {
    var IpPermissions: IpPermissionList
    var GroupName: String
    var Description: String
    var GroupId: String
    var IpPermissionsEgress: IpPermissionList
    var OwnerId: String
    var Tags: TagList
    var VpcId: String
  }

  object SecurityGroup {
    def apply(
      IpPermissions: js.UndefOr[IpPermissionList] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      IpPermissionsEgress: js.UndefOr[IpPermissionList] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IpPermissions" -> IpPermissions.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("IpPermissionsEgress" -> IpPermissionsEgress.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroup]
    }
  }

  /**
   * <p>Describes a VPC with a security group that references your security group.</p>
   */
  @js.native
  trait SecurityGroupReference extends js.Object {
    var GroupId: String
    var ReferencingVpcId: String
    var VpcPeeringConnectionId: String
  }

  object SecurityGroupReference {
    def apply(
      GroupId: js.UndefOr[String] = js.undefined,
      ReferencingVpcId: js.UndefOr[String] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
    ): SecurityGroupReference = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("ReferencingVpcId" -> ReferencingVpcId.map { x => x: js.Any }),
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecurityGroupReference]
    }
  }


  object ShutdownBehaviorEnum {
    val stop = "stop"
    val terminate = "terminate"

    val values = IndexedSeq(stop, terminate)
  }

  /**
   * <p>Describes the time period for a Scheduled Instance to start its first schedule. The time period must span less than one day.</p>
   */
  @js.native
  trait SlotDateTimeRangeRequest extends js.Object {
    var EarliestTime: DateTime
    var LatestTime: DateTime
  }

  object SlotDateTimeRangeRequest {
    def apply(
      EarliestTime: js.UndefOr[DateTime] = js.undefined,
      LatestTime: js.UndefOr[DateTime] = js.undefined
    ): SlotDateTimeRangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EarliestTime" -> EarliestTime.map { x => x: js.Any }),
        ("LatestTime" -> LatestTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SlotDateTimeRangeRequest]
    }
  }

  /**
   * <p>Describes the time period for a Scheduled Instance to start its first schedule.</p>
   */
  @js.native
  trait SlotStartTimeRangeRequest extends js.Object {
    var EarliestTime: DateTime
    var LatestTime: DateTime
  }

  object SlotStartTimeRangeRequest {
    def apply(
      EarliestTime: js.UndefOr[DateTime] = js.undefined,
      LatestTime: js.UndefOr[DateTime] = js.undefined
    ): SlotStartTimeRangeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EarliestTime" -> EarliestTime.map { x => x: js.Any }),
        ("LatestTime" -> LatestTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SlotStartTimeRangeRequest]
    }
  }

  /**
   * <p>Describes a snapshot.</p>
   */
  @js.native
  trait Snapshot extends js.Object {
    var OwnerAlias: String
    var DataEncryptionKeyId: String
    var SnapshotId: String
    var VolumeId: String
    var Description: String
    var KmsKeyId: String
    var StartTime: DateTime
    var Encrypted: Boolean
    var OwnerId: String
    var VolumeSize: Integer
    var Tags: TagList
    var StateMessage: String
    var State: SnapshotState
    var Progress: String
  }

  object Snapshot {
    def apply(
      OwnerAlias: js.UndefOr[String] = js.undefined,
      DataEncryptionKeyId: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[DateTime] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      VolumeSize: js.UndefOr[Integer] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      StateMessage: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[SnapshotState] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined
    ): Snapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OwnerAlias" -> OwnerAlias.map { x => x: js.Any }),
        ("DataEncryptionKeyId" -> DataEncryptionKeyId.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("VolumeSize" -> VolumeSize.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("StateMessage" -> StateMessage.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("Progress" -> Progress.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Snapshot]
    }
  }


  object SnapshotAttributeNameEnum {
    val productCodes = "productCodes"
    val createVolumePermission = "createVolumePermission"

    val values = IndexedSeq(productCodes, createVolumePermission)
  }

  /**
   * <p>Describes the snapshot created from the imported disk.</p>
   */
  @js.native
  trait SnapshotDetail extends js.Object {
    var StatusMessage: String
    var Format: String
    var SnapshotId: String
    var Description: String
    var DiskImageSize: Double
    var Url: String
    var UserBucket: UserBucketDetails
    var DeviceName: String
    var Progress: String
    var Status: String
  }

  object SnapshotDetail {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      Format: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DiskImageSize: js.UndefOr[Double] = js.undefined,
      Url: js.UndefOr[String] = js.undefined,
      UserBucket: js.UndefOr[UserBucketDetails] = js.undefined,
      DeviceName: js.UndefOr[String] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): SnapshotDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("Format" -> Format.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("DiskImageSize" -> DiskImageSize.map { x => x: js.Any }),
        ("Url" -> Url.map { x => x: js.Any }),
        ("UserBucket" -> UserBucket.map { x => x: js.Any }),
        ("DeviceName" -> DeviceName.map { x => x: js.Any }),
        ("Progress" -> Progress.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotDetail]
    }
  }

  /**
   * <p>The disk container object for the import snapshot request.</p>
   */
  @js.native
  trait SnapshotDiskContainer extends js.Object {
    var Description: String
    var Format: String
    var Url: String
    var UserBucket: UserBucket
  }

  object SnapshotDiskContainer {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      Format: js.UndefOr[String] = js.undefined,
      Url: js.UndefOr[String] = js.undefined,
      UserBucket: js.UndefOr[UserBucket] = js.undefined
    ): SnapshotDiskContainer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("Format" -> Format.map { x => x: js.Any }),
        ("Url" -> Url.map { x => x: js.Any }),
        ("UserBucket" -> UserBucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotDiskContainer]
    }
  }


  object SnapshotStateEnum {
    val pending = "pending"
    val completed = "completed"
    val error = "error"

    val values = IndexedSeq(pending, completed, error)
  }

  /**
   * <p>Details about the import snapshot task.</p>
   */
  @js.native
  trait SnapshotTaskDetail extends js.Object {
    var StatusMessage: String
    var Format: String
    var SnapshotId: String
    var Description: String
    var DiskImageSize: Double
    var Url: String
    var UserBucket: UserBucketDetails
    var Progress: String
    var Status: String
  }

  object SnapshotTaskDetail {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      Format: js.UndefOr[String] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      DiskImageSize: js.UndefOr[Double] = js.undefined,
      Url: js.UndefOr[String] = js.undefined,
      UserBucket: js.UndefOr[UserBucketDetails] = js.undefined,
      Progress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): SnapshotTaskDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("Format" -> Format.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("DiskImageSize" -> DiskImageSize.map { x => x: js.Any }),
        ("Url" -> Url.map { x => x: js.Any }),
        ("UserBucket" -> UserBucket.map { x => x: js.Any }),
        ("Progress" -> Progress.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnapshotTaskDetail]
    }
  }

  /**
   * <p>Describes the data feed for a Spot instance.</p>
   */
  @js.native
  trait SpotDatafeedSubscription extends js.Object {
    var Bucket: String
    var Fault: SpotInstanceStateFault
    var OwnerId: String
    var Prefix: String
    var State: DatafeedSubscriptionState
  }

  object SpotDatafeedSubscription {
    def apply(
      Bucket: js.UndefOr[String] = js.undefined,
      Fault: js.UndefOr[SpotInstanceStateFault] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Prefix: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[DatafeedSubscriptionState] = js.undefined
    ): SpotDatafeedSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Bucket" -> Bucket.map { x => x: js.Any }),
        ("Fault" -> Fault.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("Prefix" -> Prefix.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotDatafeedSubscription]
    }
  }

  /**
   * <p>Describes the launch specification for one or more Spot instances.</p>
   */
  @js.native
  trait SpotFleetLaunchSpecification extends js.Object {
    var NetworkInterfaces: InstanceNetworkInterfaceSpecificationList
    var RamdiskId: String
    var BlockDeviceMappings: BlockDeviceMappingList
    var ImageId: String
    var WeightedCapacity: Double
    var EbsOptimized: Boolean
    var Placement: SpotPlacement
    var UserData: String
    var AddressingType: String
    var SecurityGroups: GroupIdentifierList
    var KernelId: String
    var KeyName: String
    var InstanceType: InstanceType
    var Monitoring: SpotFleetMonitoring
    var SpotPrice: String
    var IamInstanceProfile: IamInstanceProfileSpecification
    var SubnetId: String
  }

  object SpotFleetLaunchSpecification {
    def apply(
      NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.undefined,
      RamdiskId: js.UndefOr[String] = js.undefined,
      BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.undefined,
      ImageId: js.UndefOr[String] = js.undefined,
      WeightedCapacity: js.UndefOr[Double] = js.undefined,
      EbsOptimized: js.UndefOr[Boolean] = js.undefined,
      Placement: js.UndefOr[SpotPlacement] = js.undefined,
      UserData: js.UndefOr[String] = js.undefined,
      AddressingType: js.UndefOr[String] = js.undefined,
      SecurityGroups: js.UndefOr[GroupIdentifierList] = js.undefined,
      KernelId: js.UndefOr[String] = js.undefined,
      KeyName: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Monitoring: js.UndefOr[SpotFleetMonitoring] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): SpotFleetLaunchSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaces" -> NetworkInterfaces.map { x => x: js.Any }),
        ("RamdiskId" -> RamdiskId.map { x => x: js.Any }),
        ("BlockDeviceMappings" -> BlockDeviceMappings.map { x => x: js.Any }),
        ("ImageId" -> ImageId.map { x => x: js.Any }),
        ("WeightedCapacity" -> WeightedCapacity.map { x => x: js.Any }),
        ("EbsOptimized" -> EbsOptimized.map { x => x: js.Any }),
        ("Placement" -> Placement.map { x => x: js.Any }),
        ("UserData" -> UserData.map { x => x: js.Any }),
        ("AddressingType" -> AddressingType.map { x => x: js.Any }),
        ("SecurityGroups" -> SecurityGroups.map { x => x: js.Any }),
        ("KernelId" -> KernelId.map { x => x: js.Any }),
        ("KeyName" -> KeyName.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("Monitoring" -> Monitoring.map { x => x: js.Any }),
        ("SpotPrice" -> SpotPrice.map { x => x: js.Any }),
        ("IamInstanceProfile" -> IamInstanceProfile.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotFleetLaunchSpecification]
    }
  }

  /**
   * <p>Describes whether monitoring is enabled.</p>
   */
  @js.native
  trait SpotFleetMonitoring extends js.Object {
    var Enabled: Boolean
  }

  object SpotFleetMonitoring {
    def apply(
      Enabled: js.UndefOr[Boolean] = js.undefined
    ): SpotFleetMonitoring = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotFleetMonitoring]
    }
  }

  /**
   * <p>Describes a Spot fleet request.</p>
   */
  @js.native
  trait SpotFleetRequestConfig extends js.Object {
    var SpotFleetRequestId: String
    var SpotFleetRequestConfig: SpotFleetRequestConfigData
    var SpotFleetRequestState: BatchState
    var ActivityStatus: ActivityStatus
    var CreateTime: DateTime
  }

  object SpotFleetRequestConfig {
    def apply(
      SpotFleetRequestId: js.UndefOr[String] = js.undefined,
      SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData] = js.undefined,
      SpotFleetRequestState: js.UndefOr[BatchState] = js.undefined,
      ActivityStatus: js.UndefOr[ActivityStatus] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined
    ): SpotFleetRequestConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SpotFleetRequestId" -> SpotFleetRequestId.map { x => x: js.Any }),
        ("SpotFleetRequestConfig" -> SpotFleetRequestConfig.map { x => x: js.Any }),
        ("SpotFleetRequestState" -> SpotFleetRequestState.map { x => x: js.Any }),
        ("ActivityStatus" -> ActivityStatus.map { x => x: js.Any }),
        ("CreateTime" -> CreateTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotFleetRequestConfig]
    }
  }

  /**
   * <p>Describes the configuration of a Spot fleet request.</p>
   */
  @js.native
  trait SpotFleetRequestConfigData extends js.Object {
    var ExcessCapacityTerminationPolicy: ExcessCapacityTerminationPolicy
    var IamFleetRole: String
    var ClientToken: String
    var LaunchSpecifications: LaunchSpecsList
    var ValidUntil: DateTime
    var TerminateInstancesWithExpiration: Boolean
    var AllocationStrategy: AllocationStrategy
    var ValidFrom: DateTime
    var SpotPrice: String
    var FulfilledCapacity: Double
    var TargetCapacity: Integer
    var Type: FleetType
  }

  object SpotFleetRequestConfigData {
    def apply(
      ExcessCapacityTerminationPolicy: js.UndefOr[ExcessCapacityTerminationPolicy] = js.undefined,
      IamFleetRole: js.UndefOr[String] = js.undefined,
      ClientToken: js.UndefOr[String] = js.undefined,
      LaunchSpecifications: js.UndefOr[LaunchSpecsList] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      TerminateInstancesWithExpiration: js.UndefOr[Boolean] = js.undefined,
      AllocationStrategy: js.UndefOr[AllocationStrategy] = js.undefined,
      ValidFrom: js.UndefOr[DateTime] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      FulfilledCapacity: js.UndefOr[Double] = js.undefined,
      TargetCapacity: js.UndefOr[Integer] = js.undefined,
      Type: js.UndefOr[FleetType] = js.undefined
    ): SpotFleetRequestConfigData = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExcessCapacityTerminationPolicy" -> ExcessCapacityTerminationPolicy.map { x => x: js.Any }),
        ("IamFleetRole" -> IamFleetRole.map { x => x: js.Any }),
        ("ClientToken" -> ClientToken.map { x => x: js.Any }),
        ("LaunchSpecifications" -> LaunchSpecifications.map { x => x: js.Any }),
        ("ValidUntil" -> ValidUntil.map { x => x: js.Any }),
        ("TerminateInstancesWithExpiration" -> TerminateInstancesWithExpiration.map { x => x: js.Any }),
        ("AllocationStrategy" -> AllocationStrategy.map { x => x: js.Any }),
        ("ValidFrom" -> ValidFrom.map { x => x: js.Any }),
        ("SpotPrice" -> SpotPrice.map { x => x: js.Any }),
        ("FulfilledCapacity" -> FulfilledCapacity.map { x => x: js.Any }),
        ("TargetCapacity" -> TargetCapacity.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotFleetRequestConfigData]
    }
  }

  /**
   * <p>Describes a Spot instance request.</p>
   */
  @js.native
  trait SpotInstanceRequest extends js.Object {
    var LaunchGroup: String
    var Fault: SpotInstanceStateFault
    var AvailabilityZoneGroup: String
    var SpotInstanceRequestId: String
    var LaunchedAvailabilityZone: String
    var ActualBlockHourlyPrice: String
    var ValidUntil: DateTime
    var InstanceId: String
    var Tags: TagList
    var ValidFrom: DateTime
    var SpotPrice: String
    var CreateTime: DateTime
    var State: SpotInstanceState
    var ProductDescription: RIProductDescription
    var BlockDurationMinutes: Integer
    var LaunchSpecification: LaunchSpecification
    var Status: SpotInstanceStatus
    var Type: SpotInstanceType
  }

  object SpotInstanceRequest {
    def apply(
      LaunchGroup: js.UndefOr[String] = js.undefined,
      Fault: js.UndefOr[SpotInstanceStateFault] = js.undefined,
      AvailabilityZoneGroup: js.UndefOr[String] = js.undefined,
      SpotInstanceRequestId: js.UndefOr[String] = js.undefined,
      LaunchedAvailabilityZone: js.UndefOr[String] = js.undefined,
      ActualBlockHourlyPrice: js.UndefOr[String] = js.undefined,
      ValidUntil: js.UndefOr[DateTime] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      ValidFrom: js.UndefOr[DateTime] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[SpotInstanceState] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined,
      BlockDurationMinutes: js.UndefOr[Integer] = js.undefined,
      LaunchSpecification: js.UndefOr[LaunchSpecification] = js.undefined,
      Status: js.UndefOr[SpotInstanceStatus] = js.undefined,
      Type: js.UndefOr[SpotInstanceType] = js.undefined
    ): SpotInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LaunchGroup" -> LaunchGroup.map { x => x: js.Any }),
        ("Fault" -> Fault.map { x => x: js.Any }),
        ("AvailabilityZoneGroup" -> AvailabilityZoneGroup.map { x => x: js.Any }),
        ("SpotInstanceRequestId" -> SpotInstanceRequestId.map { x => x: js.Any }),
        ("LaunchedAvailabilityZone" -> LaunchedAvailabilityZone.map { x => x: js.Any }),
        ("ActualBlockHourlyPrice" -> ActualBlockHourlyPrice.map { x => x: js.Any }),
        ("ValidUntil" -> ValidUntil.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ValidFrom" -> ValidFrom.map { x => x: js.Any }),
        ("SpotPrice" -> SpotPrice.map { x => x: js.Any }),
        ("CreateTime" -> CreateTime.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("BlockDurationMinutes" -> BlockDurationMinutes.map { x => x: js.Any }),
        ("LaunchSpecification" -> LaunchSpecification.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotInstanceRequest]
    }
  }


  object SpotInstanceStateEnum {
    val open = "open"
    val active = "active"
    val closed = "closed"
    val cancelled = "cancelled"
    val failed = "failed"

    val values = IndexedSeq(open, active, closed, cancelled, failed)
  }

  /**
   * <p>Describes a Spot instance state change.</p>
   */
  @js.native
  trait SpotInstanceStateFault extends js.Object {
    var Code: String
    var Message: String
  }

  object SpotInstanceStateFault {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): SpotInstanceStateFault = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotInstanceStateFault]
    }
  }

  /**
   * <p>Describes the status of a Spot instance request.</p>
   */
  @js.native
  trait SpotInstanceStatus extends js.Object {
    var Code: String
    var UpdateTime: DateTime
    var Message: String
  }

  object SpotInstanceStatus {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      UpdateTime: js.UndefOr[DateTime] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): SpotInstanceStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("UpdateTime" -> UpdateTime.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotInstanceStatus]
    }
  }


  object SpotInstanceTypeEnum {
    val `one-time` = "one-time"
    val persistent = "persistent"

    val values = IndexedSeq(`one-time`, persistent)
  }

  /**
   * <p>Describes Spot instance placement.</p>
   */
  @js.native
  trait SpotPlacement extends js.Object {
    var AvailabilityZone: String
    var GroupName: String
  }

  object SpotPlacement {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined
    ): SpotPlacement = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotPlacement]
    }
  }

  /**
   * <p>Describes the maximum hourly price (bid) for any Spot instance launched to fulfill the request.</p>
   */
  @js.native
  trait SpotPrice extends js.Object {
    var AvailabilityZone: String
    var InstanceType: InstanceType
    var Timestamp: DateTime
    var SpotPrice: String
    var ProductDescription: RIProductDescription
  }

  object SpotPrice {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      InstanceType: js.UndefOr[InstanceType] = js.undefined,
      Timestamp: js.UndefOr[DateTime] = js.undefined,
      SpotPrice: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[RIProductDescription] = js.undefined
    ): SpotPrice = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("InstanceType" -> InstanceType.map { x => x: js.Any }),
        ("Timestamp" -> Timestamp.map { x => x: js.Any }),
        ("SpotPrice" -> SpotPrice.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SpotPrice]
    }
  }

  /**
   * <p>Describes a stale rule in a security group.</p>
   */
  @js.native
  trait StaleIpPermission extends js.Object {
    var PrefixListIds: PrefixListIdSet
    var UserIdGroupPairs: UserIdGroupPairSet
    var IpRanges: IpRanges
    var ToPort: Integer
    var FromPort: Integer
    var IpProtocol: String
  }

  object StaleIpPermission {
    def apply(
      PrefixListIds: js.UndefOr[PrefixListIdSet] = js.undefined,
      UserIdGroupPairs: js.UndefOr[UserIdGroupPairSet] = js.undefined,
      IpRanges: js.UndefOr[IpRanges] = js.undefined,
      ToPort: js.UndefOr[Integer] = js.undefined,
      FromPort: js.UndefOr[Integer] = js.undefined,
      IpProtocol: js.UndefOr[String] = js.undefined
    ): StaleIpPermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PrefixListIds" -> PrefixListIds.map { x => x: js.Any }),
        ("UserIdGroupPairs" -> UserIdGroupPairs.map { x => x: js.Any }),
        ("IpRanges" -> IpRanges.map { x => x: js.Any }),
        ("ToPort" -> ToPort.map { x => x: js.Any }),
        ("FromPort" -> FromPort.map { x => x: js.Any }),
        ("IpProtocol" -> IpProtocol.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StaleIpPermission]
    }
  }

  /**
   * <p>Describes a stale security group (a security group that contains stale rules).</p>
   */
  @js.native
  trait StaleSecurityGroup extends js.Object {
    var GroupName: String
    var Description: String
    var GroupId: String
    var StaleIpPermissionsEgress: StaleIpPermissionSet
    var StaleIpPermissions: StaleIpPermissionSet
    var VpcId: String
  }

  object StaleSecurityGroup {
    def apply(
      GroupName: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      StaleIpPermissionsEgress: js.UndefOr[StaleIpPermissionSet] = js.undefined,
      StaleIpPermissions: js.UndefOr[StaleIpPermissionSet] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): StaleSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("StaleIpPermissionsEgress" -> StaleIpPermissionsEgress.map { x => x: js.Any }),
        ("StaleIpPermissions" -> StaleIpPermissions.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StaleSecurityGroup]
    }
  }

  /**
   * <p>Contains the parameters for StartInstances.</p>
   */
  @js.native
  trait StartInstancesRequest extends js.Object {
    var InstanceIds: InstanceIdStringList
    var AdditionalInfo: String
    var DryRun: Boolean
  }

  object StartInstancesRequest {
    def apply(
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      AdditionalInfo: js.UndefOr[String] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined
    ): StartInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("AdditionalInfo" -> AdditionalInfo.map { x => x: js.Any }),
        ("DryRun" -> DryRun.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of StartInstances.</p>
   */
  @js.native
  trait StartInstancesResult extends js.Object {
    var StartingInstances: InstanceStateChangeList
  }

  object StartInstancesResult {
    def apply(
      StartingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
    ): StartInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StartingInstances" -> StartingInstances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartInstancesResult]
    }
  }


  object StateEnum {
    val Pending = "Pending"
    val Available = "Available"
    val Deleting = "Deleting"
    val Deleted = "Deleted"

    val values = IndexedSeq(Pending, Available, Deleting, Deleted)
  }

  /**
   * <p>Describes a state change.</p>
   */
  @js.native
  trait StateReason extends js.Object {
    var Code: String
    var Message: String
  }

  object StateReason {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): StateReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StateReason]
    }
  }


  object StatusEnum {
    val MoveInProgress = "MoveInProgress"
    val InVpc = "InVpc"
    val InClassic = "InClassic"

    val values = IndexedSeq(MoveInProgress, InVpc, InClassic)
  }


  object StatusNameEnum {
    val reachability = "reachability"

    val values = IndexedSeq(reachability)
  }


  object StatusTypeEnum {
    val passed = "passed"
    val failed = "failed"
    val `insufficient-data` = "insufficient-data"
    val initializing = "initializing"

    val values = IndexedSeq(passed, failed, `insufficient-data`, initializing)
  }

  /**
   * <p>Contains the parameters for StopInstances.</p>
   */
  @js.native
  trait StopInstancesRequest extends js.Object {
    var DryRun: Boolean
    var InstanceIds: InstanceIdStringList
    var Force: Boolean
  }

  object StopInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined,
      Force: js.UndefOr[Boolean] = js.undefined
    ): StopInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any }),
        ("Force" -> Force.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of StopInstances.</p>
   */
  @js.native
  trait StopInstancesResult extends js.Object {
    var StoppingInstances: InstanceStateChangeList
  }

  object StopInstancesResult {
    def apply(
      StoppingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
    ): StopInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StoppingInstances" -> StoppingInstances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopInstancesResult]
    }
  }

  /**
   * <p>Describes the storage location for an instance store-backed AMI.</p>
   */
  @js.native
  trait Storage extends js.Object {
    var S3: S3Storage
  }

  object Storage {
    def apply(
      S3: js.UndefOr[S3Storage] = js.undefined
    ): Storage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("S3" -> S3.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Storage]
    }
  }

  /**
   * <p>Describes a subnet.</p>
   */
  @js.native
  trait Subnet extends js.Object {
    var CidrBlock: String
    var AvailabilityZone: String
    var Ipv6CidrBlockAssociationSet: SubnetIpv6CidrBlockAssociationSet
    var Tags: TagList
    var AssignIpv6AddressOnCreation: Boolean
    var DefaultForAz: Boolean
    var AvailableIpAddressCount: Integer
    var MapPublicIpOnLaunch: Boolean
    var State: SubnetState
    var VpcId: String
    var SubnetId: String
  }

  object Subnet {
    def apply(
      CidrBlock: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockAssociationSet: js.UndefOr[SubnetIpv6CidrBlockAssociationSet] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.undefined,
      DefaultForAz: js.UndefOr[Boolean] = js.undefined,
      AvailableIpAddressCount: js.UndefOr[Integer] = js.undefined,
      MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.undefined,
      State: js.UndefOr[SubnetState] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined,
      SubnetId: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CidrBlock" -> CidrBlock.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Ipv6CidrBlockAssociationSet" -> Ipv6CidrBlockAssociationSet.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("AssignIpv6AddressOnCreation" -> AssignIpv6AddressOnCreation.map { x => x: js.Any }),
        ("DefaultForAz" -> DefaultForAz.map { x => x: js.Any }),
        ("AvailableIpAddressCount" -> AvailableIpAddressCount.map { x => x: js.Any }),
        ("MapPublicIpOnLaunch" -> MapPublicIpOnLaunch.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("SubnetId" -> SubnetId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * <p>Describes the state of a CIDR block.</p>
   */
  @js.native
  trait SubnetCidrBlockState extends js.Object {
    var State: SubnetCidrBlockStateCode
    var StatusMessage: String
  }

  object SubnetCidrBlockState {
    def apply(
      State: js.UndefOr[SubnetCidrBlockStateCode] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined
    ): SubnetCidrBlockState = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any }),
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubnetCidrBlockState]
    }
  }


  object SubnetCidrBlockStateCodeEnum {
    val associating = "associating"
    val associated = "associated"
    val disassociating = "disassociating"
    val disassociated = "disassociated"
    val failing = "failing"
    val failed = "failed"

    val values = IndexedSeq(associating, associated, disassociating, disassociated, failing, failed)
  }

  /**
   * <p>Describes an IPv6 CIDR block associated with a subnet.</p>
   */
  @js.native
  trait SubnetIpv6CidrBlockAssociation extends js.Object {
    var Ipv6CidrBlock: String
    var Ipv6CidrBlockState: SubnetCidrBlockState
    var AssociationId: String
  }

  object SubnetIpv6CidrBlockAssociation {
    def apply(
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockState: js.UndefOr[SubnetCidrBlockState] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined
    ): SubnetIpv6CidrBlockAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x: js.Any }),
        ("Ipv6CidrBlockState" -> Ipv6CidrBlockState.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubnetIpv6CidrBlockAssociation]
    }
  }


  object SubnetStateEnum {
    val pending = "pending"
    val available = "available"

    val values = IndexedSeq(pending, available)
  }


  object SummaryStatusEnum {
    val ok = "ok"
    val impaired = "impaired"
    val `insufficient-data` = "insufficient-data"
    val `not-applicable` = "not-applicable"
    val initializing = "initializing"

    val values = IndexedSeq(ok, impaired, `insufficient-data`, `not-applicable`, initializing)
  }

  /**
   * <p>Describes a tag.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: String
    var Value: String
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>Describes a tag.</p>
   */
  @js.native
  trait TagDescription extends js.Object {
    var ResourceId: String
    var ResourceType: ResourceType
    var Key: String
    var Value: String
  }

  object TagDescription {
    def apply(
      ResourceId: js.UndefOr[String] = js.undefined,
      ResourceType: js.UndefOr[ResourceType] = js.undefined,
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
    ): TagDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagDescription]
    }
  }

  /**
   * <p>Information about the Convertible Reserved Instance offering.</p>
   */
  @js.native
  trait TargetConfiguration extends js.Object {
    var OfferingId: String
    var InstanceCount: Integer
  }

  object TargetConfiguration {
    def apply(
      OfferingId: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined
    ): TargetConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OfferingId" -> OfferingId.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetConfiguration]
    }
  }

  /**
   * <p>Details about the target configuration.</p>
   */
  @js.native
  trait TargetConfigurationRequest extends js.Object {
    var OfferingId: String
    var InstanceCount: Integer
  }

  object TargetConfigurationRequest {
    def apply(
      OfferingId: js.UndefOr[String] = js.undefined,
      InstanceCount: js.UndefOr[Integer] = js.undefined
    ): TargetConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OfferingId" -> OfferingId.map { x => x: js.Any }),
        ("InstanceCount" -> InstanceCount.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetConfigurationRequest]
    }
  }

  /**
   * <p>The total value of the new Convertible Reserved Instances.</p>
   */
  @js.native
  trait TargetReservationValue extends js.Object {
    var TargetConfiguration: TargetConfiguration
    var ReservationValue: ReservationValue
  }

  object TargetReservationValue {
    def apply(
      TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined,
      ReservationValue: js.UndefOr[ReservationValue] = js.undefined
    ): TargetReservationValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetConfiguration" -> TargetConfiguration.map { x => x: js.Any }),
        ("ReservationValue" -> ReservationValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetReservationValue]
    }
  }


  object TelemetryStatusEnum {
    val UP = "UP"
    val DOWN = "DOWN"

    val values = IndexedSeq(UP, DOWN)
  }


  object TenancyEnum {
    val default = "default"
    val dedicated = "dedicated"
    val host = "host"

    val values = IndexedSeq(default, dedicated, host)
  }

  /**
   * <p>Contains the parameters for TerminateInstances.</p>
   */
  @js.native
  trait TerminateInstancesRequest extends js.Object {
    var DryRun: Boolean
    var InstanceIds: InstanceIdStringList
  }

  object TerminateInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined
    ): TerminateInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of TerminateInstances.</p>
   */
  @js.native
  trait TerminateInstancesResult extends js.Object {
    var TerminatingInstances: InstanceStateChangeList
  }

  object TerminateInstancesResult {
    def apply(
      TerminatingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
    ): TerminateInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TerminatingInstances" -> TerminatingInstances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateInstancesResult]
    }
  }


  object TrafficTypeEnum {
    val ACCEPT = "ACCEPT"
    val REJECT = "REJECT"
    val ALL = "ALL"

    val values = IndexedSeq(ACCEPT, REJECT, ALL)
  }

  @js.native
  trait UnassignIpv6AddressesRequest extends js.Object {
    var NetworkInterfaceId: String
    var Ipv6Addresses: Ipv6AddressList
  }

  object UnassignIpv6AddressesRequest {
    def apply(
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      Ipv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
    ): UnassignIpv6AddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("Ipv6Addresses" -> Ipv6Addresses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignIpv6AddressesRequest]
    }
  }

  @js.native
  trait UnassignIpv6AddressesResult extends js.Object {
    var NetworkInterfaceId: String
    var UnassignedIpv6Addresses: Ipv6AddressList
  }

  object UnassignIpv6AddressesResult {
    def apply(
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      UnassignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
    ): UnassignIpv6AddressesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("UnassignedIpv6Addresses" -> UnassignedIpv6Addresses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignIpv6AddressesResult]
    }
  }

  /**
   * <p>Contains the parameters for UnassignPrivateIpAddresses.</p>
   */
  @js.native
  trait UnassignPrivateIpAddressesRequest extends js.Object {
    var NetworkInterfaceId: String
    var PrivateIpAddresses: PrivateIpAddressStringList
  }

  object UnassignPrivateIpAddressesRequest {
    def apply(
      NetworkInterfaceId: js.UndefOr[String] = js.undefined,
      PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList] = js.undefined
    ): UnassignPrivateIpAddressesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NetworkInterfaceId" -> NetworkInterfaceId.map { x => x: js.Any }),
        ("PrivateIpAddresses" -> PrivateIpAddresses.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnassignPrivateIpAddressesRequest]
    }
  }

  /**
   * <p>Contains the parameters for UnmonitorInstances.</p>
   */
  @js.native
  trait UnmonitorInstancesRequest extends js.Object {
    var DryRun: Boolean
    var InstanceIds: InstanceIdStringList
  }

  object UnmonitorInstancesRequest {
    def apply(
      DryRun: js.UndefOr[Boolean] = js.undefined,
      InstanceIds: js.UndefOr[InstanceIdStringList] = js.undefined
    ): UnmonitorInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DryRun" -> DryRun.map { x => x: js.Any }),
        ("InstanceIds" -> InstanceIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnmonitorInstancesRequest]
    }
  }

  /**
   * <p>Contains the output of UnmonitorInstances.</p>
   */
  @js.native
  trait UnmonitorInstancesResult extends js.Object {
    var InstanceMonitorings: InstanceMonitoringList
  }

  object UnmonitorInstancesResult {
    def apply(
      InstanceMonitorings: js.UndefOr[InstanceMonitoringList] = js.undefined
    ): UnmonitorInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InstanceMonitorings" -> InstanceMonitorings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnmonitorInstancesResult]
    }
  }

  /**
   * <p>Information about items that were not successfully processed in a batch call.</p>
   */
  @js.native
  trait UnsuccessfulItem extends js.Object {
    var ResourceId: String
    var Error: UnsuccessfulItemError
  }

  object UnsuccessfulItem {
    def apply(
      ResourceId: js.UndefOr[String] = js.undefined,
      Error: js.UndefOr[UnsuccessfulItemError] = js.undefined
    ): UnsuccessfulItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("Error" -> Error.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsuccessfulItem]
    }
  }

  /**
   * <p>Information about the error that occurred. For more information about errors, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html">Error Codes</a>.</p>
   */
  @js.native
  trait UnsuccessfulItemError extends js.Object {
    var Code: String
    var Message: String
  }

  object UnsuccessfulItemError {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): UnsuccessfulItemError = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsuccessfulItemError]
    }
  }

  /**
   * <p>Describes the S3 bucket for the disk image.</p>
   */
  @js.native
  trait UserBucket extends js.Object {
    var S3Bucket: String
    var S3Key: String
  }

  object UserBucket {
    def apply(
      S3Bucket: js.UndefOr[String] = js.undefined,
      S3Key: js.UndefOr[String] = js.undefined
    ): UserBucket = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("S3Bucket" -> S3Bucket.map { x => x: js.Any }),
        ("S3Key" -> S3Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserBucket]
    }
  }

  /**
   * <p>Describes the S3 bucket for the disk image.</p>
   */
  @js.native
  trait UserBucketDetails extends js.Object {
    var S3Bucket: String
    var S3Key: String
  }

  object UserBucketDetails {
    def apply(
      S3Bucket: js.UndefOr[String] = js.undefined,
      S3Key: js.UndefOr[String] = js.undefined
    ): UserBucketDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("S3Bucket" -> S3Bucket.map { x => x: js.Any }),
        ("S3Key" -> S3Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserBucketDetails]
    }
  }

  /**
   * <p>Describes the user data for an instance.</p>
   */
  @js.native
  trait UserData extends js.Object {
    var Data: String
  }

  object UserData {
    def apply(
      Data: js.UndefOr[String] = js.undefined
    ): UserData = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Data" -> Data.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserData]
    }
  }

  /**
   * <p>Describes a security group and AWS account ID pair.</p>
   */
  @js.native
  trait UserIdGroupPair extends js.Object {
    var VpcPeeringConnectionId: String
    var GroupName: String
    var GroupId: String
    var PeeringStatus: String
    var UserId: String
    var VpcId: String
  }

  object UserIdGroupPair {
    def apply(
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      GroupName: js.UndefOr[String] = js.undefined,
      GroupId: js.UndefOr[String] = js.undefined,
      PeeringStatus: js.UndefOr[String] = js.undefined,
      UserId: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): UserIdGroupPair = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any }),
        ("GroupName" -> GroupName.map { x => x: js.Any }),
        ("GroupId" -> GroupId.map { x => x: js.Any }),
        ("PeeringStatus" -> PeeringStatus.map { x => x: js.Any }),
        ("UserId" -> UserId.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserIdGroupPair]
    }
  }

  /**
   * <p>Describes telemetry for a VPN tunnel.</p>
   */
  @js.native
  trait VgwTelemetry extends js.Object {
    var StatusMessage: String
    var AcceptedRouteCount: Integer
    var LastStatusChange: DateTime
    var OutsideIpAddress: String
    var Status: TelemetryStatus
  }

  object VgwTelemetry {
    def apply(
      StatusMessage: js.UndefOr[String] = js.undefined,
      AcceptedRouteCount: js.UndefOr[Integer] = js.undefined,
      LastStatusChange: js.UndefOr[DateTime] = js.undefined,
      OutsideIpAddress: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[TelemetryStatus] = js.undefined
    ): VgwTelemetry = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any }),
        ("AcceptedRouteCount" -> AcceptedRouteCount.map { x => x: js.Any }),
        ("LastStatusChange" -> LastStatusChange.map { x => x: js.Any }),
        ("OutsideIpAddress" -> OutsideIpAddress.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VgwTelemetry]
    }
  }


  object VirtualizationTypeEnum {
    val hvm = "hvm"
    val paravirtual = "paravirtual"

    val values = IndexedSeq(hvm, paravirtual)
  }

  /**
   * <p>Describes a volume.</p>
   */
  @js.native
  trait Volume extends js.Object {
    var VolumeType: VolumeType
    var Attachments: VolumeAttachmentList
    var Size: Integer
    var SnapshotId: String
    var VolumeId: String
    var KmsKeyId: String
    var AvailabilityZone: String
    var Encrypted: Boolean
    var Iops: Integer
    var Tags: TagList
    var CreateTime: DateTime
    var State: VolumeState
  }

  object Volume {
    def apply(
      VolumeType: js.UndefOr[VolumeType] = js.undefined,
      Attachments: js.UndefOr[VolumeAttachmentList] = js.undefined,
      Size: js.UndefOr[Integer] = js.undefined,
      SnapshotId: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      Iops: js.UndefOr[Integer] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      CreateTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[VolumeState] = js.undefined
    ): Volume = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeType" -> VolumeType.map { x => x: js.Any }),
        ("Attachments" -> Attachments.map { x => x: js.Any }),
        ("Size" -> Size.map { x => x: js.Any }),
        ("SnapshotId" -> SnapshotId.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("CreateTime" -> CreateTime.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Volume]
    }
  }

  /**
   * <p>Describes volume attachment details.</p>
   */
  @js.native
  trait VolumeAttachment extends js.Object {
    var Device: String
    var VolumeId: String
    var InstanceId: String
    var DeleteOnTermination: Boolean
    var AttachTime: DateTime
    var State: VolumeAttachmentState
  }

  object VolumeAttachment {
    def apply(
      Device: js.UndefOr[String] = js.undefined,
      VolumeId: js.UndefOr[String] = js.undefined,
      InstanceId: js.UndefOr[String] = js.undefined,
      DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
      AttachTime: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[VolumeAttachmentState] = js.undefined
    ): VolumeAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Device" -> Device.map { x => x: js.Any }),
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("InstanceId" -> InstanceId.map { x => x: js.Any }),
        ("DeleteOnTermination" -> DeleteOnTermination.map { x => x: js.Any }),
        ("AttachTime" -> AttachTime.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeAttachment]
    }
  }


  object VolumeAttachmentStateEnum {
    val attaching = "attaching"
    val attached = "attached"
    val detaching = "detaching"
    val detached = "detached"

    val values = IndexedSeq(attaching, attached, detaching, detached)
  }


  object VolumeAttributeNameEnum {
    val autoEnableIO = "autoEnableIO"
    val productCodes = "productCodes"

    val values = IndexedSeq(autoEnableIO, productCodes)
  }

  /**
   * <p>Describes an EBS volume.</p>
   */
  @js.native
  trait VolumeDetail extends js.Object {
    var Size: Long
  }

  object VolumeDetail {
    def apply(
      Size: js.UndefOr[Long] = js.undefined
    ): VolumeDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Size" -> Size.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeDetail]
    }
  }


  object VolumeStateEnum {
    val creating = "creating"
    val available = "available"
    val `in-use` = "in-use"
    val deleting = "deleting"
    val deleted = "deleted"
    val error = "error"

    val values = IndexedSeq(creating, available, `in-use`, deleting, deleted, error)
  }

  /**
   * <p>Describes a volume status operation code.</p>
   */
  @js.native
  trait VolumeStatusAction extends js.Object {
    var Code: String
    var Description: String
    var EventType: String
    var EventId: String
  }

  object VolumeStatusAction {
    def apply(
      Code: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EventType: js.UndefOr[String] = js.undefined,
      EventId: js.UndefOr[String] = js.undefined
    ): VolumeStatusAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EventType" -> EventType.map { x => x: js.Any }),
        ("EventId" -> EventId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusAction]
    }
  }

  /**
   * <p>Describes a volume status.</p>
   */
  @js.native
  trait VolumeStatusDetails extends js.Object {
    var Name: VolumeStatusName
    var Status: String
  }

  object VolumeStatusDetails {
    def apply(
      Name: js.UndefOr[VolumeStatusName] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): VolumeStatusDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusDetails]
    }
  }

  /**
   * <p>Describes a volume status event.</p>
   */
  @js.native
  trait VolumeStatusEvent extends js.Object {
    var NotBefore: DateTime
    var Description: String
    var EventType: String
    var EventId: String
    var NotAfter: DateTime
  }

  object VolumeStatusEvent {
    def apply(
      NotBefore: js.UndefOr[DateTime] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EventType: js.UndefOr[String] = js.undefined,
      EventId: js.UndefOr[String] = js.undefined,
      NotAfter: js.UndefOr[DateTime] = js.undefined
    ): VolumeStatusEvent = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NotBefore" -> NotBefore.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EventType" -> EventType.map { x => x: js.Any }),
        ("EventId" -> EventId.map { x => x: js.Any }),
        ("NotAfter" -> NotAfter.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusEvent]
    }
  }

  /**
   * <p>Describes the status of a volume.</p>
   */
  @js.native
  trait VolumeStatusInfo extends js.Object {
    var Status: VolumeStatusInfoStatus
    var Details: VolumeStatusDetailsList
  }

  object VolumeStatusInfo {
    def apply(
      Status: js.UndefOr[VolumeStatusInfoStatus] = js.undefined,
      Details: js.UndefOr[VolumeStatusDetailsList] = js.undefined
    ): VolumeStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("Details" -> Details.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusInfo]
    }
  }


  object VolumeStatusInfoStatusEnum {
    val ok = "ok"
    val impaired = "impaired"
    val `insufficient-data` = "insufficient-data"

    val values = IndexedSeq(ok, impaired, `insufficient-data`)
  }

  /**
   * <p>Describes the volume status.</p>
   */
  @js.native
  trait VolumeStatusItem extends js.Object {
    var VolumeId: String
    var AvailabilityZone: String
    var VolumeStatus: VolumeStatusInfo
    var Events: VolumeStatusEventsList
    var Actions: VolumeStatusActionsList
  }

  object VolumeStatusItem {
    def apply(
      VolumeId: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      VolumeStatus: js.UndefOr[VolumeStatusInfo] = js.undefined,
      Events: js.UndefOr[VolumeStatusEventsList] = js.undefined,
      Actions: js.UndefOr[VolumeStatusActionsList] = js.undefined
    ): VolumeStatusItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VolumeId" -> VolumeId.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("VolumeStatus" -> VolumeStatus.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any }),
        ("Actions" -> Actions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VolumeStatusItem]
    }
  }


  object VolumeStatusNameEnum {
    val `io-enabled` = "io-enabled"
    val `io-performance` = "io-performance"

    val values = IndexedSeq(`io-enabled`, `io-performance`)
  }


  object VolumeTypeEnum {
    val standard = "standard"
    val io1 = "io1"
    val gp2 = "gp2"
    val sc1 = "sc1"
    val st1 = "st1"

    val values = IndexedSeq(standard, io1, gp2, sc1, st1)
  }

  /**
   * <p>Describes a VPC.</p>
   */
  @js.native
  trait Vpc extends js.Object {
    var DhcpOptionsId: String
    var CidrBlock: String
    var Ipv6CidrBlockAssociationSet: VpcIpv6CidrBlockAssociationSet
    var Tags: TagList
    var State: VpcState
    var IsDefault: Boolean
    var InstanceTenancy: Tenancy
    var VpcId: String
  }

  object Vpc {
    def apply(
      DhcpOptionsId: js.UndefOr[String] = js.undefined,
      CidrBlock: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockAssociationSet: js.UndefOr[VpcIpv6CidrBlockAssociationSet] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      State: js.UndefOr[VpcState] = js.undefined,
      IsDefault: js.UndefOr[Boolean] = js.undefined,
      InstanceTenancy: js.UndefOr[Tenancy] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): Vpc = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DhcpOptionsId" -> DhcpOptionsId.map { x => x: js.Any }),
        ("CidrBlock" -> CidrBlock.map { x => x: js.Any }),
        ("Ipv6CidrBlockAssociationSet" -> Ipv6CidrBlockAssociationSet.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("IsDefault" -> IsDefault.map { x => x: js.Any }),
        ("InstanceTenancy" -> InstanceTenancy.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Vpc]
    }
  }

  /**
   * <p>Describes an attachment between a virtual private gateway and a VPC.</p>
   */
  @js.native
  trait VpcAttachment extends js.Object {
    var VpcId: String
    var State: AttachmentStatus
  }

  object VpcAttachment {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[AttachmentStatus] = js.undefined
    ): VpcAttachment = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcAttachment]
    }
  }


  object VpcAttributeNameEnum {
    val enableDnsSupport = "enableDnsSupport"
    val enableDnsHostnames = "enableDnsHostnames"

    val values = IndexedSeq(enableDnsSupport, enableDnsHostnames)
  }

  /**
   * <p>Describes the state of a CIDR block.</p>
   */
  @js.native
  trait VpcCidrBlockState extends js.Object {
    var State: VpcCidrBlockStateCode
    var StatusMessage: String
  }

  object VpcCidrBlockState {
    def apply(
      State: js.UndefOr[VpcCidrBlockStateCode] = js.undefined,
      StatusMessage: js.UndefOr[String] = js.undefined
    ): VpcCidrBlockState = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("State" -> State.map { x => x: js.Any }),
        ("StatusMessage" -> StatusMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcCidrBlockState]
    }
  }


  object VpcCidrBlockStateCodeEnum {
    val associating = "associating"
    val associated = "associated"
    val disassociating = "disassociating"
    val disassociated = "disassociated"
    val failing = "failing"
    val failed = "failed"

    val values = IndexedSeq(associating, associated, disassociating, disassociated, failing, failed)
  }

  /**
   * <p>Describes whether a VPC is enabled for ClassicLink.</p>
   */
  @js.native
  trait VpcClassicLink extends js.Object {
    var VpcId: String
    var ClassicLinkEnabled: Boolean
    var Tags: TagList
  }

  object VpcClassicLink {
    def apply(
      VpcId: js.UndefOr[String] = js.undefined,
      ClassicLinkEnabled: js.UndefOr[Boolean] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): VpcClassicLink = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcId" -> VpcId.map { x => x: js.Any }),
        ("ClassicLinkEnabled" -> ClassicLinkEnabled.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcClassicLink]
    }
  }

  /**
   * <p>Describes a VPC endpoint.</p>
   */
  @js.native
  trait VpcEndpoint extends js.Object {
    var ServiceName: String
    var VpcEndpointId: String
    var PolicyDocument: String
    var RouteTableIds: ValueStringList
    var CreationTimestamp: DateTime
    var State: State
    var VpcId: String
  }

  object VpcEndpoint {
    def apply(
      ServiceName: js.UndefOr[String] = js.undefined,
      VpcEndpointId: js.UndefOr[String] = js.undefined,
      PolicyDocument: js.UndefOr[String] = js.undefined,
      RouteTableIds: js.UndefOr[ValueStringList] = js.undefined,
      CreationTimestamp: js.UndefOr[DateTime] = js.undefined,
      State: js.UndefOr[State] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): VpcEndpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ServiceName" -> ServiceName.map { x => x: js.Any }),
        ("VpcEndpointId" -> VpcEndpointId.map { x => x: js.Any }),
        ("PolicyDocument" -> PolicyDocument.map { x => x: js.Any }),
        ("RouteTableIds" -> RouteTableIds.map { x => x: js.Any }),
        ("CreationTimestamp" -> CreationTimestamp.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcEndpoint]
    }
  }

  /**
   * <p>Describes an IPv6 CIDR block associated with a VPC.</p>
   */
  @js.native
  trait VpcIpv6CidrBlockAssociation extends js.Object {
    var Ipv6CidrBlock: String
    var Ipv6CidrBlockState: VpcCidrBlockState
    var AssociationId: String
  }

  object VpcIpv6CidrBlockAssociation {
    def apply(
      Ipv6CidrBlock: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.undefined,
      AssociationId: js.UndefOr[String] = js.undefined
    ): VpcIpv6CidrBlockAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Ipv6CidrBlock" -> Ipv6CidrBlock.map { x => x: js.Any }),
        ("Ipv6CidrBlockState" -> Ipv6CidrBlockState.map { x => x: js.Any }),
        ("AssociationId" -> AssociationId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcIpv6CidrBlockAssociation]
    }
  }

  /**
   * <p>Describes a VPC peering connection.</p>
   */
  @js.native
  trait VpcPeeringConnection extends js.Object {
    var AccepterVpcInfo: VpcPeeringConnectionVpcInfo
    var VpcPeeringConnectionId: String
    var RequesterVpcInfo: VpcPeeringConnectionVpcInfo
    var ExpirationTime: DateTime
    var Tags: TagList
    var Status: VpcPeeringConnectionStateReason
  }

  object VpcPeeringConnection {
    def apply(
      AccepterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.undefined,
      VpcPeeringConnectionId: js.UndefOr[String] = js.undefined,
      RequesterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.undefined,
      ExpirationTime: js.UndefOr[DateTime] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Status: js.UndefOr[VpcPeeringConnectionStateReason] = js.undefined
    ): VpcPeeringConnection = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccepterVpcInfo" -> AccepterVpcInfo.map { x => x: js.Any }),
        ("VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x => x: js.Any }),
        ("RequesterVpcInfo" -> RequesterVpcInfo.map { x => x: js.Any }),
        ("ExpirationTime" -> ExpirationTime.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnection]
    }
  }

  /**
   * <p>Describes the VPC peering connection options.</p>
   */
  @js.native
  trait VpcPeeringConnectionOptionsDescription extends js.Object {
    var AllowEgressFromLocalClassicLinkToRemoteVpc: Boolean
    var AllowEgressFromLocalVpcToRemoteClassicLink: Boolean
    var AllowDnsResolutionFromRemoteVpc: Boolean
  }

  object VpcPeeringConnectionOptionsDescription {
    def apply(
      AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.undefined,
      AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.undefined,
      AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.undefined
    ): VpcPeeringConnectionOptionsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AllowEgressFromLocalClassicLinkToRemoteVpc" -> AllowEgressFromLocalClassicLinkToRemoteVpc.map { x => x: js.Any }),
        ("AllowEgressFromLocalVpcToRemoteClassicLink" -> AllowEgressFromLocalVpcToRemoteClassicLink.map { x => x: js.Any }),
        ("AllowDnsResolutionFromRemoteVpc" -> AllowDnsResolutionFromRemoteVpc.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnectionOptionsDescription]
    }
  }

  /**
   * <p>Describes the status of a VPC peering connection.</p>
   */
  @js.native
  trait VpcPeeringConnectionStateReason extends js.Object {
    var Code: VpcPeeringConnectionStateReasonCode
    var Message: String
  }

  object VpcPeeringConnectionStateReason {
    def apply(
      Code: js.UndefOr[VpcPeeringConnectionStateReasonCode] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): VpcPeeringConnectionStateReason = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Code" -> Code.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnectionStateReason]
    }
  }


  object VpcPeeringConnectionStateReasonCodeEnum {
    val `initiating-request` = "initiating-request"
    val `pending-acceptance` = "pending-acceptance"
    val active = "active"
    val deleted = "deleted"
    val rejected = "rejected"
    val failed = "failed"
    val expired = "expired"
    val provisioning = "provisioning"
    val deleting = "deleting"

    val values = IndexedSeq(`initiating-request`, `pending-acceptance`, active, deleted, rejected, failed, expired, provisioning, deleting)
  }

  /**
   * <p>Describes a VPC in a VPC peering connection.</p>
   */
  @js.native
  trait VpcPeeringConnectionVpcInfo extends js.Object {
    var CidrBlock: String
    var PeeringOptions: VpcPeeringConnectionOptionsDescription
    var OwnerId: String
    var Ipv6CidrBlockSet: Ipv6CidrBlockSet
    var VpcId: String
  }

  object VpcPeeringConnectionVpcInfo {
    def apply(
      CidrBlock: js.UndefOr[String] = js.undefined,
      PeeringOptions: js.UndefOr[VpcPeeringConnectionOptionsDescription] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      Ipv6CidrBlockSet: js.UndefOr[Ipv6CidrBlockSet] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): VpcPeeringConnectionVpcInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CidrBlock" -> CidrBlock.map { x => x: js.Any }),
        ("PeeringOptions" -> PeeringOptions.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("Ipv6CidrBlockSet" -> Ipv6CidrBlockSet.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnectionVpcInfo]
    }
  }


  object VpcStateEnum {
    val pending = "pending"
    val available = "available"

    val values = IndexedSeq(pending, available)
  }

  /**
   * <p>Describes a VPN connection.</p>
   */
  @js.native
  trait VpnConnection extends js.Object {
    var CustomerGatewayId: String
    var VpnConnectionId: String
    var VgwTelemetry: VgwTelemetryList
    var Routes: VpnStaticRouteList
    var Tags: TagList
    var Options: VpnConnectionOptions
    var VpnGatewayId: String
    var State: VpnState
    var CustomerGatewayConfiguration: String
    var Type: GatewayType
  }

  object VpnConnection {
    def apply(
      CustomerGatewayId: js.UndefOr[String] = js.undefined,
      VpnConnectionId: js.UndefOr[String] = js.undefined,
      VgwTelemetry: js.UndefOr[VgwTelemetryList] = js.undefined,
      Routes: js.UndefOr[VpnStaticRouteList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      Options: js.UndefOr[VpnConnectionOptions] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[VpnState] = js.undefined,
      CustomerGatewayConfiguration: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[GatewayType] = js.undefined
    ): VpnConnection = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CustomerGatewayId" -> CustomerGatewayId.map { x => x: js.Any }),
        ("VpnConnectionId" -> VpnConnectionId.map { x => x: js.Any }),
        ("VgwTelemetry" -> VgwTelemetry.map { x => x: js.Any }),
        ("Routes" -> Routes.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("Options" -> Options.map { x => x: js.Any }),
        ("VpnGatewayId" -> VpnGatewayId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("CustomerGatewayConfiguration" -> CustomerGatewayConfiguration.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnConnection]
    }
  }

  /**
   * <p>Describes VPN connection options.</p>
   */
  @js.native
  trait VpnConnectionOptions extends js.Object {
    var StaticRoutesOnly: Boolean
  }

  object VpnConnectionOptions {
    def apply(
      StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined
    ): VpnConnectionOptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StaticRoutesOnly" -> StaticRoutesOnly.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnConnectionOptions]
    }
  }

  /**
   * <p>Describes VPN connection options.</p>
   */
  @js.native
  trait VpnConnectionOptionsSpecification extends js.Object {
    var StaticRoutesOnly: Boolean
  }

  object VpnConnectionOptionsSpecification {
    def apply(
      StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined
    ): VpnConnectionOptionsSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StaticRoutesOnly" -> StaticRoutesOnly.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnConnectionOptionsSpecification]
    }
  }

  /**
   * <p>Describes a virtual private gateway.</p>
   */
  @js.native
  trait VpnGateway extends js.Object {
    var AvailabilityZone: String
    var Tags: TagList
    var VpnGatewayId: String
    var State: VpnState
    var VpcAttachments: VpcAttachmentList
    var Type: GatewayType
  }

  object VpnGateway {
    def apply(
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      VpnGatewayId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[VpnState] = js.undefined,
      VpcAttachments: js.UndefOr[VpcAttachmentList] = js.undefined,
      Type: js.UndefOr[GatewayType] = js.undefined
    ): VpnGateway = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("VpnGatewayId" -> VpnGatewayId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("VpcAttachments" -> VpcAttachments.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnGateway]
    }
  }


  object VpnStateEnum {
    val pending = "pending"
    val available = "available"
    val deleting = "deleting"
    val deleted = "deleted"

    val values = IndexedSeq(pending, available, deleting, deleted)
  }

  /**
   * <p>Describes a static route for a VPN connection.</p>
   */
  @js.native
  trait VpnStaticRoute extends js.Object {
    var DestinationCidrBlock: String
    var Source: VpnStaticRouteSource
    var State: VpnState
  }

  object VpnStaticRoute {
    def apply(
      DestinationCidrBlock: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[VpnStaticRouteSource] = js.undefined,
      State: js.UndefOr[VpnState] = js.undefined
    ): VpnStaticRoute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DestinationCidrBlock" -> DestinationCidrBlock.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpnStaticRoute]
    }
  }


  object VpnStaticRouteSourceEnum {
    val Static = "Static"

    val values = IndexedSeq(Static)
  }


  object scopeEnum {
    val `Availability Zone` = "Availability Zone"
    val Region = "Region"

    val values = IndexedSeq(`Availability Zone`, Region)
  }
}
