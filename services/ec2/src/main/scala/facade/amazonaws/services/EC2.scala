package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object ec2 {
  type AccountAttributeList                             = js.Array[AccountAttribute]
  type AccountAttributeNameStringList                   = js.Array[AccountAttributeName]
  type AccountAttributeValueList                        = js.Array[AccountAttributeValue]
  type ActiveInstanceSet                                = js.Array[ActiveInstance]
  type AddressList                                      = js.Array[Address]
  type AllocationId                                     = String
  type AllocationIdList                                 = js.Array[String]
  type AllowedPrincipalSet                              = js.Array[AllowedPrincipal]
  type ArchitectureTypeList                             = js.Array[ArchitectureType]
  type AssignedPrivateIpAddressList                     = js.Array[AssignedPrivateIpAddress]
  type AssociatedTargetNetworkSet                       = js.Array[AssociatedTargetNetwork]
  type AssociationIdList                                = js.Array[IamInstanceProfileAssociationId]
  type AuthorizationRuleSet                             = js.Array[AuthorizationRule]
  type AutoRecoveryFlag                                 = Boolean
  type AvailabilityZoneList                             = js.Array[AvailabilityZone]
  type AvailabilityZoneMessageList                      = js.Array[AvailabilityZoneMessage]
  type AvailabilityZoneStringList                       = js.Array[String]
  type AvailableInstanceCapacityList                    = js.Array[InstanceCapacity]
  type BareMetalFlag                                    = Boolean
  type BillingProductList                               = js.Array[String]
  type Blob                                             = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BlockDeviceMappingList                           = js.Array[BlockDeviceMapping]
  type BlockDeviceMappingRequestList                    = js.Array[BlockDeviceMapping]
  type BundleId                                         = String
  type BundleIdStringList                               = js.Array[BundleId]
  type BundleTaskList                                   = js.Array[BundleTask]
  type BurstablePerformanceFlag                         = Boolean
  type ByoipCidrSet                                     = js.Array[ByoipCidr]
  type CancelSpotFleetRequestsErrorSet                  = js.Array[CancelSpotFleetRequestsErrorItem]
  type CancelSpotFleetRequestsSuccessSet                = js.Array[CancelSpotFleetRequestsSuccessItem]
  type CancelledSpotInstanceRequestList                 = js.Array[CancelledSpotInstanceRequest]
  type CapacityReservationId                            = String
  type CapacityReservationIdSet                         = js.Array[String]
  type CapacityReservationSet                           = js.Array[CapacityReservation]
  type CidrBlockSet                                     = js.Array[CidrBlock]
  type ClassicLinkDnsSupportList                        = js.Array[ClassicLinkDnsSupport]
  type ClassicLinkInstanceList                          = js.Array[ClassicLinkInstance]
  type ClassicLoadBalancers                             = js.Array[ClassicLoadBalancer]
  type ClientVpnAuthenticationList                      = js.Array[ClientVpnAuthentication]
  type ClientVpnAuthenticationRequestList               = js.Array[ClientVpnAuthenticationRequest]
  type ClientVpnConnectionSet                           = js.Array[ClientVpnConnection]
  type ClientVpnEndpointId                              = String
  type ClientVpnEndpointIdList                          = js.Array[ClientVpnEndpointId]
  type ClientVpnRouteSet                                = js.Array[ClientVpnRoute]
  type ClientVpnSecurityGroupIdSet                      = js.Array[String]
  type CoipAddressUsageSet                              = js.Array[CoipAddressUsage]
  type CoipPoolId                                       = String
  type CoipPoolIdSet                                    = js.Array[String]
  type CoipPoolMaxResults                               = Int
  type CoipPoolSet                                      = js.Array[CoipPool]
  type ConnectionNotificationId                         = String
  type ConnectionNotificationSet                        = js.Array[ConnectionNotification]
  type ConversionIdStringList                           = js.Array[ConversionTaskId]
  type ConversionTaskId                                 = String
  type CoreCount                                        = Int
  type CoreCountList                                    = js.Array[CoreCount]
  type CreateFleetErrorsSet                             = js.Array[CreateFleetError]
  type CreateFleetInstancesSet                          = js.Array[CreateFleetInstance]
  type CreateVolumePermissionList                       = js.Array[CreateVolumePermission]
  type CurrentGenerationFlag                            = Boolean
  type CustomerGatewayId                                = String
  type CustomerGatewayIdStringList                      = js.Array[CustomerGatewayId]
  type CustomerGatewayList                              = js.Array[CustomerGateway]
  type DITMaxResults                                    = Int
  type DITOMaxResults                                   = Int
  type DateTime                                         = js.Date
  type DedicatedHostFlag                                = Boolean
  type DedicatedHostId                                  = String
  type DefaultingDhcpOptionsId                          = String
  type DeleteFleetErrorSet                              = js.Array[DeleteFleetErrorItem]
  type DeleteFleetSuccessSet                            = js.Array[DeleteFleetSuccessItem]
  type DeleteLaunchTemplateVersionsResponseErrorSet     = js.Array[DeleteLaunchTemplateVersionsResponseErrorItem]
  type DeleteLaunchTemplateVersionsResponseSuccessSet   = js.Array[DeleteLaunchTemplateVersionsResponseSuccessItem]
  type DeleteQueuedReservedInstancesIdList              = js.Array[ReservationId]
  type DescribeByoipCidrsMaxResults                     = Int
  type DescribeCapacityReservationsMaxResults           = Int
  type DescribeClassicLinkInstancesMaxResults           = Int
  type DescribeClientVpnAuthorizationRulesMaxResults    = Int
  type DescribeClientVpnConnectionsMaxResults           = Int
  type DescribeClientVpnEndpointMaxResults              = Int
  type DescribeClientVpnRoutesMaxResults                = Int
  type DescribeClientVpnTargetNetworksMaxResults        = Int
  type DescribeConversionTaskList                       = js.Array[ConversionTask]
  type DescribeDhcpOptionsMaxResults                    = Int
  type DescribeEgressOnlyInternetGatewaysMaxResults     = Int
  type DescribeElasticGpusMaxResults                    = Int
  type DescribeExportImageTasksMaxResults               = Int
  type DescribeFastSnapshotRestoreSuccessSet            = js.Array[DescribeFastSnapshotRestoreSuccessItem]
  type DescribeFastSnapshotRestoresMaxResults           = Int
  type DescribeFleetsErrorSet                           = js.Array[DescribeFleetError]
  type DescribeFleetsInstancesSet                       = js.Array[DescribeFleetsInstances]
  type DescribeFpgaImagesMaxResults                     = Int
  type DescribeHostReservationsMaxResults               = Int
  type DescribeIamInstanceProfileAssociationsMaxResults = Int
  type DescribeInstanceCreditSpecificationsMaxResults   = Int
  type DescribeInternetGatewaysMaxResults               = Int
  type DescribeLaunchTemplatesMaxResults                = Int
  type DescribeMovingAddressesMaxResults                = Int
  type DescribeNatGatewaysMaxResults                    = Int
  type DescribeNetworkAclsMaxResults                    = Int
  type DescribeNetworkInterfacePermissionsMaxResults    = Int
  type DescribeNetworkInterfacesMaxResults              = Int
  type DescribePrincipalIdFormatMaxResults              = Int
  type DescribeRouteTablesMaxResults                    = Int
  type DescribeScheduledInstanceAvailabilityMaxResults  = Int
  type DescribeSecurityGroupsMaxResults                 = Int
  type DescribeSpotFleetInstancesMaxResults             = Int
  type DescribeSpotFleetRequestHistoryMaxResults        = Int
  type DescribeStaleSecurityGroupsMaxResults            = Int
  type DescribeStaleSecurityGroupsNextToken             = String
  type DescribeSubnetsMaxResults                        = Int
  type DescribeVpcClassicLinkDnsSupportMaxResults       = Int
  type DescribeVpcClassicLinkDnsSupportNextToken        = String
  type DescribeVpcPeeringConnectionsMaxResults          = Int
  type DescribeVpcsMaxResults                           = Int
  type DhcpConfigurationList                            = js.Array[DhcpConfiguration]
  type DhcpConfigurationValueList                       = js.Array[AttributeValue]
  type DhcpOptionsId                                    = String
  type DhcpOptionsIdStringList                          = js.Array[DhcpOptionsId]
  type DhcpOptionsList                                  = js.Array[DhcpOptions]
  type DisableFastSnapshotRestoreErrorSet               = js.Array[DisableFastSnapshotRestoreErrorItem]
  type DisableFastSnapshotRestoreStateErrorSet          = js.Array[DisableFastSnapshotRestoreStateErrorItem]
  type DisableFastSnapshotRestoreSuccessSet             = js.Array[DisableFastSnapshotRestoreSuccessItem]
  type DiskCount                                        = Int
  type DiskImageList                                    = js.Array[DiskImage]
  type DiskInfoList                                     = js.Array[DiskInfo]
  type DiskSize                                         = Double
  type DnsEntrySet                                      = js.Array[DnsEntry]
  type EgressOnlyInternetGatewayId                      = String
  type EgressOnlyInternetGatewayIdList                  = js.Array[EgressOnlyInternetGatewayId]
  type EgressOnlyInternetGatewayList                    = js.Array[EgressOnlyInternetGateway]
  type ElasticGpuAssociationList                        = js.Array[ElasticGpuAssociation]
  type ElasticGpuId                                     = String
  type ElasticGpuIdSet                                  = js.Array[ElasticGpuId]
  type ElasticGpuSet                                    = js.Array[ElasticGpus]
  type ElasticGpuSpecificationList                      = js.Array[ElasticGpuSpecification]
  type ElasticGpuSpecificationResponseList              = js.Array[ElasticGpuSpecificationResponse]
  type ElasticGpuSpecifications                         = js.Array[ElasticGpuSpecification]
  type ElasticInferenceAcceleratorAssociationList       = js.Array[ElasticInferenceAcceleratorAssociation]
  type ElasticInferenceAcceleratorCount                 = Int
  type ElasticInferenceAccelerators                     = js.Array[ElasticInferenceAccelerator]
  type ElasticIpAssociationId                           = String
  type EnableFastSnapshotRestoreErrorSet                = js.Array[EnableFastSnapshotRestoreErrorItem]
  type EnableFastSnapshotRestoreStateErrorSet           = js.Array[EnableFastSnapshotRestoreStateErrorItem]
  type EnableFastSnapshotRestoreSuccessSet              = js.Array[EnableFastSnapshotRestoreSuccessItem]
  type EndpointSet                                      = js.Array[ClientVpnEndpoint]
  type ExecutableByStringList                           = js.Array[String]
  type ExportImageTaskId                                = String
  type ExportImageTaskIdList                            = js.Array[ExportImageTaskId]
  type ExportImageTaskList                              = js.Array[ExportImageTask]
  type ExportTaskId                                     = String
  type ExportTaskIdStringList                           = js.Array[String]
  type ExportTaskList                                   = js.Array[ExportTask]
  type FailedQueuedPurchaseDeletionSet                  = js.Array[FailedQueuedPurchaseDeletion]
  type FilterList                                       = js.Array[Filter]
  type FleetIdSet                                       = js.Array[FleetIdentifier]
  type FleetIdentifier                                  = String
  type FleetLaunchTemplateConfigList                    = js.Array[FleetLaunchTemplateConfig]
  type FleetLaunchTemplateConfigListRequest             = js.Array[FleetLaunchTemplateConfigRequest]
  type FleetLaunchTemplateOverridesList                 = js.Array[FleetLaunchTemplateOverrides]
  type FleetLaunchTemplateOverridesListRequest          = js.Array[FleetLaunchTemplateOverridesRequest]
  type FleetSet                                         = js.Array[FleetData]
  type FlowLogIdList                                    = js.Array[VpcFlowLogId]
  type FlowLogResourceId                                = String
  type FlowLogResourceIds                               = js.Array[FlowLogResourceId]
  type FlowLogSet                                       = js.Array[FlowLog]
  type FpgaDeviceCount                                  = Int
  type FpgaDeviceInfoList                               = js.Array[FpgaDeviceInfo]
  type FpgaDeviceManufacturerName                       = String
  type FpgaDeviceMemorySize                             = Int
  type FpgaDeviceName                                   = String
  type FpgaImageId                                      = String
  type FpgaImageIdList                                  = js.Array[FpgaImageId]
  type FpgaImageList                                    = js.Array[FpgaImage]
  type FreeTierEligibleFlag                             = Boolean
  type GetCapacityReservationUsageRequestMaxResults     = Int
  type GpuDeviceCount                                   = Int
  type GpuDeviceInfoList                                = js.Array[GpuDeviceInfo]
  type GpuDeviceManufacturerName                        = String
  type GpuDeviceMemorySize                              = Int
  type GpuDeviceName                                    = String
  type GroupIdStringList                                = js.Array[String]
  type GroupIdentifierList                              = js.Array[GroupIdentifier]
  type GroupIdentifierSet                               = js.Array[SecurityGroupIdentifier]
  type GroupIds                                         = js.Array[SecurityGroupId]
  type GroupNameStringList                              = js.Array[SecurityGroupName]
  type HibernationFlag                                  = Boolean
  type HistoryRecordSet                                 = js.Array[HistoryRecordEntry]
  type HistoryRecords                                   = js.Array[HistoryRecord]
  type HostInstanceList                                 = js.Array[HostInstance]
  type HostList                                         = js.Array[Host]
  type HostOfferingSet                                  = js.Array[HostOffering]
  type HostReservationId                                = String
  type HostReservationIdSet                             = js.Array[HostReservationId]
  type HostReservationSet                               = js.Array[HostReservation]
  type IKEVersionsList                                  = js.Array[IKEVersionsListValue]
  type IKEVersionsRequestList                           = js.Array[IKEVersionsRequestListValue]
  type IamInstanceProfileAssociationId                  = String
  type IamInstanceProfileAssociationSet                 = js.Array[IamInstanceProfileAssociation]
  type IdFormatList                                     = js.Array[IdFormat]
  type ImageDiskContainerList                           = js.Array[ImageDiskContainer]
  type ImageId                                          = String
  type ImageIdStringList                                = js.Array[ImageId]
  type ImageList                                        = js.Array[Image]
  type ImportImageLicenseSpecificationListRequest       = js.Array[ImportImageLicenseConfigurationRequest]
  type ImportImageLicenseSpecificationListResponse      = js.Array[ImportImageLicenseConfigurationResponse]
  type ImportImageTaskId                                = String
  type ImportImageTaskList                              = js.Array[ImportImageTask]
  type ImportInstanceVolumeDetailSet                    = js.Array[ImportInstanceVolumeDetailItem]
  type ImportSnapshotTaskId                             = String
  type ImportSnapshotTaskIdList                         = js.Array[ImportSnapshotTaskId]
  type ImportSnapshotTaskList                           = js.Array[ImportSnapshotTask]
  type ImportTaskId                                     = String
  type ImportTaskIdList                                 = js.Array[ImportImageTaskId]
  type InferenceDeviceCount                             = Int
  type InferenceDeviceInfoList                          = js.Array[InferenceDeviceInfo]
  type InferenceDeviceManufacturerName                  = String
  type InferenceDeviceName                              = String
  type InstanceBlockDeviceMappingList                   = js.Array[InstanceBlockDeviceMapping]
  type InstanceBlockDeviceMappingSpecificationList      = js.Array[InstanceBlockDeviceMappingSpecification]
  type InstanceCountList                                = js.Array[InstanceCount]
  type InstanceCreditSpecificationList                  = js.Array[InstanceCreditSpecification]
  type InstanceCreditSpecificationListRequest           = js.Array[InstanceCreditSpecificationRequest]
  type InstanceEventId                                  = String
  type InstanceId                                       = String
  type InstanceIdSet                                    = js.Array[String]
  type InstanceIdStringList                             = js.Array[InstanceId]
  type InstanceIdsSet                                   = js.Array[InstanceId]
  type InstanceIpv6AddressList                          = js.Array[InstanceIpv6Address]
  type InstanceIpv6AddressListRequest                   = js.Array[InstanceIpv6AddressRequest]
  type InstanceList                                     = js.Array[Instance]
  type InstanceMonitoringList                           = js.Array[InstanceMonitoring]
  type InstanceNetworkInterfaceList                     = js.Array[InstanceNetworkInterface]
  type InstanceNetworkInterfaceSpecificationList        = js.Array[InstanceNetworkInterfaceSpecification]
  type InstancePrivateIpAddressList                     = js.Array[InstancePrivateIpAddress]
  type InstanceStateChangeList                          = js.Array[InstanceStateChange]
  type InstanceStatusDetailsList                        = js.Array[InstanceStatusDetails]
  type InstanceStatusEventList                          = js.Array[InstanceStatusEvent]
  type InstanceStatusList                               = js.Array[InstanceStatus]
  type InstanceStorageFlag                              = Boolean
  type InstanceTypeInfoList                             = js.Array[InstanceTypeInfo]
  type InstanceTypeList                                 = js.Array[InstanceType]
  type InstanceTypeOfferingsList                        = js.Array[InstanceTypeOffering]
  type InstanceUsageSet                                 = js.Array[InstanceUsage]
  type InternetGatewayAttachmentList                    = js.Array[InternetGatewayAttachment]
  type InternetGatewayId                                = String
  type InternetGatewayIdList                            = js.Array[InternetGatewayId]
  type InternetGatewayList                              = js.Array[InternetGateway]
  type IpPermissionList                                 = js.Array[IpPermission]
  type IpRangeList                                      = js.Array[IpRange]
  type IpRanges                                         = js.Array[String]
  type Ipv4PoolEc2Id                                    = String
  type Ipv6Address                                      = String
  type Ipv6AddressList                                  = js.Array[String]
  type Ipv6CidrAssociationSet                           = js.Array[Ipv6CidrAssociation]
  type Ipv6CidrBlockSet                                 = js.Array[Ipv6CidrBlock]
  type Ipv6Flag                                         = Boolean
  type Ipv6PoolEc2Id                                    = String
  type Ipv6PoolIdList                                   = js.Array[Ipv6PoolEc2Id]
  type Ipv6PoolMaxResults                               = Int
  type Ipv6PoolSet                                      = js.Array[Ipv6Pool]
  type Ipv6RangeList                                    = js.Array[Ipv6Range]
  type KernelId                                         = String
  type KeyNameStringList                                = js.Array[KeyPairName]
  type KeyPairId                                        = String
  type KeyPairIdStringList                              = js.Array[KeyPairId]
  type KeyPairList                                      = js.Array[KeyPairInfo]
  type KeyPairName                                      = String
  type KmsKeyId                                         = String
  type LaunchPermissionList                             = js.Array[LaunchPermission]
  type LaunchSpecsList                                  = js.Array[SpotFleetLaunchSpecification]
  type LaunchTemplateBlockDeviceMappingList             = js.Array[LaunchTemplateBlockDeviceMapping]
  type LaunchTemplateBlockDeviceMappingRequestList      = js.Array[LaunchTemplateBlockDeviceMappingRequest]
  type LaunchTemplateConfigList                         = js.Array[LaunchTemplateConfig]
  type LaunchTemplateElasticInferenceAcceleratorCount   = Int
  type LaunchTemplateElasticInferenceAcceleratorList    = js.Array[LaunchTemplateElasticInferenceAccelerator]
  type LaunchTemplateElasticInferenceAcceleratorResponseList =
    js.Array[LaunchTemplateElasticInferenceAcceleratorResponse]
  type LaunchTemplateId           = String
  type LaunchTemplateIdStringList = js.Array[LaunchTemplateId]
  type LaunchTemplateInstanceNetworkInterfaceSpecificationList =
    js.Array[LaunchTemplateInstanceNetworkInterfaceSpecification]
  type LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList =
    js.Array[LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]
  type LaunchTemplateLicenseList                                = js.Array[LaunchTemplateLicenseConfiguration]
  type LaunchTemplateLicenseSpecificationListRequest            = js.Array[LaunchTemplateLicenseConfigurationRequest]
  type LaunchTemplateName                                       = String
  type LaunchTemplateNameStringList                             = js.Array[LaunchTemplateName]
  type LaunchTemplateOverridesList                              = js.Array[LaunchTemplateOverrides]
  type LaunchTemplateSet                                        = js.Array[LaunchTemplate]
  type LaunchTemplateTagSpecificationList                       = js.Array[LaunchTemplateTagSpecification]
  type LaunchTemplateTagSpecificationRequestList                = js.Array[LaunchTemplateTagSpecificationRequest]
  type LaunchTemplateVersionSet                                 = js.Array[LaunchTemplateVersion]
  type LicenseList                                              = js.Array[LicenseConfiguration]
  type LicenseSpecificationListRequest                          = js.Array[LicenseConfigurationRequest]
  type LoadPermissionList                                       = js.Array[LoadPermission]
  type LoadPermissionListRequest                                = js.Array[LoadPermissionRequest]
  type LocalGatewayId                                           = String
  type LocalGatewayIdSet                                        = js.Array[LocalGatewayId]
  type LocalGatewayMaxResults                                   = Int
  type LocalGatewayRouteList                                    = js.Array[LocalGatewayRoute]
  type LocalGatewayRouteTableIdSet                              = js.Array[LocalGatewayRoutetableId]
  type LocalGatewayRouteTableSet                                = js.Array[LocalGatewayRouteTable]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationId = String
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationIdSet =
    js.Array[LocalGatewayRouteTableVirtualInterfaceGroupAssociationId]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet =
    js.Array[LocalGatewayRouteTableVirtualInterfaceGroupAssociation]
  type LocalGatewayRouteTableVpcAssociationId            = String
  type LocalGatewayRouteTableVpcAssociationIdSet         = js.Array[LocalGatewayRouteTableVpcAssociationId]
  type LocalGatewayRouteTableVpcAssociationSet           = js.Array[LocalGatewayRouteTableVpcAssociation]
  type LocalGatewayRoutetableId                          = String
  type LocalGatewaySet                                   = js.Array[LocalGateway]
  type LocalGatewayVirtualInterfaceGroupId               = String
  type LocalGatewayVirtualInterfaceGroupIdSet            = js.Array[LocalGatewayVirtualInterfaceGroupId]
  type LocalGatewayVirtualInterfaceGroupSet              = js.Array[LocalGatewayVirtualInterfaceGroup]
  type LocalGatewayVirtualInterfaceId                    = String
  type LocalGatewayVirtualInterfaceIdSet                 = js.Array[LocalGatewayVirtualInterfaceId]
  type LocalGatewayVirtualInterfaceSet                   = js.Array[LocalGatewayVirtualInterface]
  type Location                                          = String
  type MaxIpv4AddrPerInterface                           = Int
  type MaxIpv6AddrPerInterface                           = Int
  type MaxNetworkInterfaces                              = Int
  type MaxResults                                        = Int
  type MemorySize                                        = Double
  type MillisecondDateTime                               = js.Date
  type MovingAddressStatusSet                            = js.Array[MovingAddressStatus]
  type NatGatewayAddressList                             = js.Array[NatGatewayAddress]
  type NatGatewayId                                      = String
  type NatGatewayIdStringList                            = js.Array[NatGatewayId]
  type NatGatewayList                                    = js.Array[NatGateway]
  type NetworkAclAssociationId                           = String
  type NetworkAclAssociationList                         = js.Array[NetworkAclAssociation]
  type NetworkAclEntryList                               = js.Array[NetworkAclEntry]
  type NetworkAclId                                      = String
  type NetworkAclIdStringList                            = js.Array[NetworkAclId]
  type NetworkAclList                                    = js.Array[NetworkAcl]
  type NetworkInterfaceAttachmentId                      = String
  type NetworkInterfaceId                                = String
  type NetworkInterfaceIdList                            = js.Array[NetworkInterfaceId]
  type NetworkInterfaceIpv6AddressesList                 = js.Array[NetworkInterfaceIpv6Address]
  type NetworkInterfaceList                              = js.Array[NetworkInterface]
  type NetworkInterfacePermissionId                      = String
  type NetworkInterfacePermissionIdList                  = js.Array[NetworkInterfacePermissionId]
  type NetworkInterfacePermissionList                    = js.Array[NetworkInterfacePermission]
  type NetworkInterfacePrivateIpAddressList              = js.Array[NetworkInterfacePrivateIpAddress]
  type NetworkPerformance                                = String
  type NewDhcpConfigurationList                          = js.Array[NewDhcpConfiguration]
  type NextToken                                         = String
  type OccurrenceDayRequestSet                           = js.Array[Int]
  type OccurrenceDaySet                                  = js.Array[Int]
  type OfferingId                                        = String
  type OwnerStringList                                   = js.Array[String]
  type Phase1DHGroupNumbersList                          = js.Array[Phase1DHGroupNumbersListValue]
  type Phase1DHGroupNumbersRequestList                   = js.Array[Phase1DHGroupNumbersRequestListValue]
  type Phase1EncryptionAlgorithmsList                    = js.Array[Phase1EncryptionAlgorithmsListValue]
  type Phase1EncryptionAlgorithmsRequestList             = js.Array[Phase1EncryptionAlgorithmsRequestListValue]
  type Phase1IntegrityAlgorithmsList                     = js.Array[Phase1IntegrityAlgorithmsListValue]
  type Phase1IntegrityAlgorithmsRequestList              = js.Array[Phase1IntegrityAlgorithmsRequestListValue]
  type Phase2DHGroupNumbersList                          = js.Array[Phase2DHGroupNumbersListValue]
  type Phase2DHGroupNumbersRequestList                   = js.Array[Phase2DHGroupNumbersRequestListValue]
  type Phase2EncryptionAlgorithmsList                    = js.Array[Phase2EncryptionAlgorithmsListValue]
  type Phase2EncryptionAlgorithmsRequestList             = js.Array[Phase2EncryptionAlgorithmsRequestListValue]
  type Phase2IntegrityAlgorithmsList                     = js.Array[Phase2IntegrityAlgorithmsListValue]
  type Phase2IntegrityAlgorithmsRequestList              = js.Array[Phase2IntegrityAlgorithmsRequestListValue]
  type PlacementGroupId                                  = String
  type PlacementGroupIdStringList                        = js.Array[PlacementGroupId]
  type PlacementGroupList                                = js.Array[PlacementGroup]
  type PlacementGroupName                                = String
  type PlacementGroupStrategyList                        = js.Array[PlacementGroupStrategy]
  type PlacementGroupStringList                          = js.Array[PlacementGroupName]
  type PoolCidrBlocksSet                                 = js.Array[PoolCidrBlock]
  type PoolMaxResults                                    = Int
  type PrefixListIdList                                  = js.Array[PrefixListId]
  type PrefixListIdSet                                   = js.Array[String]
  type PrefixListResourceId                              = String
  type PrefixListResourceIdStringList                    = js.Array[PrefixListResourceId]
  type PrefixListSet                                     = js.Array[PrefixList]
  type PriceScheduleList                                 = js.Array[PriceSchedule]
  type PriceScheduleSpecificationList                    = js.Array[PriceScheduleSpecification]
  type PricingDetailsList                                = js.Array[PricingDetail]
  type PrincipalIdFormatList                             = js.Array[PrincipalIdFormat]
  type PrivateIpAddressConfigSet                         = js.Array[ScheduledInstancesPrivateIpAddressConfig]
  type PrivateIpAddressSpecificationList                 = js.Array[PrivateIpAddressSpecification]
  type PrivateIpAddressStringList                        = js.Array[String]
  type ProcessorSustainedClockSpeed                      = Double
  type ProductCodeList                                   = js.Array[ProductCode]
  type ProductCodeStringList                             = js.Array[String]
  type ProductDescriptionList                            = js.Array[String]
  type PropagatingVgwList                                = js.Array[PropagatingVgw]
  type PublicIpStringList                                = js.Array[String]
  type PublicIpv4PoolIdStringList                        = js.Array[Ipv4PoolEc2Id]
  type PublicIpv4PoolRangeSet                            = js.Array[PublicIpv4PoolRange]
  type PublicIpv4PoolSet                                 = js.Array[PublicIpv4Pool]
  type PurchaseRequestSet                                = js.Array[PurchaseRequest]
  type PurchaseSet                                       = js.Array[Purchase]
  type PurchasedScheduledInstanceSet                     = js.Array[ScheduledInstance]
  type RamdiskId                                         = String
  type ReasonCodesList                                   = js.Array[ReportInstanceReasonCodes]
  type RecurringChargesList                              = js.Array[RecurringCharge]
  type RegionList                                        = js.Array[Region]
  type RegionNameStringList                              = js.Array[String]
  type RequestHostIdList                                 = js.Array[DedicatedHostId]
  type RequestHostIdSet                                  = js.Array[DedicatedHostId]
  type RequestInstanceTypeList                           = js.Array[InstanceType]
  type RequestSpotLaunchSpecificationSecurityGroupIdList = js.Array[SecurityGroupId]
  type RequestSpotLaunchSpecificationSecurityGroupList   = js.Array[SecurityGroupName]
  type ReservationId                                     = String
  type ReservationList                                   = js.Array[Reservation]
  type ReservedInstanceIdSet                             = js.Array[ReservationId]
  type ReservedInstanceReservationValueSet               = js.Array[ReservedInstanceReservationValue]
  type ReservedInstancesConfigurationList                = js.Array[ReservedInstancesConfiguration]
  type ReservedInstancesIdStringList                     = js.Array[ReservationId]
  type ReservedInstancesList                             = js.Array[ReservedInstances]
  type ReservedInstancesListingId                        = String
  type ReservedInstancesListingList                      = js.Array[ReservedInstancesListing]
  type ReservedInstancesModificationId                   = String
  type ReservedInstancesModificationIdStringList         = js.Array[ReservedInstancesModificationId]
  type ReservedInstancesModificationList                 = js.Array[ReservedInstancesModification]
  type ReservedInstancesModificationResultList           = js.Array[ReservedInstancesModificationResult]
  type ReservedInstancesOfferingId                       = String
  type ReservedInstancesOfferingIdStringList             = js.Array[ReservedInstancesOfferingId]
  type ReservedInstancesOfferingList                     = js.Array[ReservedInstancesOffering]
  type ReservedIntancesIds                               = js.Array[ReservedInstancesId]
  type ResourceIdList                                    = js.Array[TaggableResourceId]
  type ResourceList                                      = js.Array[String]
  type ResponseHostIdList                                = js.Array[String]
  type ResponseHostIdSet                                 = js.Array[String]
  type RestorableByStringList                            = js.Array[String]
  type RootDeviceTypeList                                = js.Array[RootDeviceType]
  type RouteGatewayId                                    = String
  type RouteList                                         = js.Array[Route]
  type RouteTableAssociationId                           = String
  type RouteTableAssociationList                         = js.Array[RouteTableAssociation]
  type RouteTableId                                      = String
  type RouteTableIdStringList                            = js.Array[RouteTableId]
  type RouteTableList                                    = js.Array[RouteTable]
  type ScheduledInstanceAvailabilitySet                  = js.Array[ScheduledInstanceAvailability]
  type ScheduledInstanceId                               = String
  type ScheduledInstanceIdRequestSet                     = js.Array[ScheduledInstanceId]
  type ScheduledInstanceSet                              = js.Array[ScheduledInstance]
  type ScheduledInstancesBlockDeviceMappingSet           = js.Array[ScheduledInstancesBlockDeviceMapping]
  type ScheduledInstancesIpv6AddressList                 = js.Array[ScheduledInstancesIpv6Address]
  type ScheduledInstancesNetworkInterfaceSet             = js.Array[ScheduledInstancesNetworkInterface]
  type ScheduledInstancesSecurityGroupIdSet              = js.Array[SecurityGroupId]
  type SecurityGroupId                                   = String
  type SecurityGroupIdStringList                         = js.Array[SecurityGroupId]
  type SecurityGroupList                                 = js.Array[SecurityGroup]
  type SecurityGroupName                                 = String
  type SecurityGroupReferences                           = js.Array[SecurityGroupReference]
  type SecurityGroupStringList                           = js.Array[SecurityGroupName]
  type SensitiveUserData                                 = String
  type ServiceConfigurationSet                           = js.Array[ServiceConfiguration]
  type ServiceDetailSet                                  = js.Array[ServiceDetail]
  type ServiceTypeDetailSet                              = js.Array[ServiceTypeDetail]
  type SnapshotDetailList                                = js.Array[SnapshotDetail]
  type SnapshotId                                        = String
  type SnapshotIdStringList                              = js.Array[SnapshotId]
  type SnapshotList                                      = js.Array[Snapshot]
  type SnapshotSet                                       = js.Array[SnapshotInfo]
  type SpotFleetRequestConfigSet                         = js.Array[SpotFleetRequestConfig]
  type SpotFleetRequestId                                = String
  type SpotFleetRequestIdList                            = js.Array[SpotFleetRequestId]
  type SpotFleetTagSpecificationList                     = js.Array[SpotFleetTagSpecification]
  type SpotInstanceRequestId                             = String
  type SpotInstanceRequestIdList                         = js.Array[SpotInstanceRequestId]
  type SpotInstanceRequestList                           = js.Array[SpotInstanceRequest]
  type SpotPriceHistoryList                              = js.Array[SpotPrice]
  type StaleIpPermissionSet                              = js.Array[StaleIpPermission]
  type StaleSecurityGroupSet                             = js.Array[StaleSecurityGroup]
  type SubnetAssociationList                             = js.Array[SubnetAssociation]
  type SubnetCidrAssociationId                           = String
  type SubnetId                                          = String
  type SubnetIdStringList                                = js.Array[SubnetId]
  type SubnetIpv6CidrBlockAssociationSet                 = js.Array[SubnetIpv6CidrBlockAssociation]
  type SubnetList                                        = js.Array[Subnet]
  type SuccessfulInstanceCreditSpecificationSet          = js.Array[SuccessfulInstanceCreditSpecificationItem]
  type SuccessfulQueuedPurchaseDeletionSet               = js.Array[SuccessfulQueuedPurchaseDeletion]
  type TagDescriptionList                                = js.Array[TagDescription]
  type TagList                                           = js.Array[Tag]
  type TagSpecificationList                              = js.Array[TagSpecification]
  type TaggableResourceId                                = String
  type TargetConfigurationRequestSet                     = js.Array[TargetConfigurationRequest]
  type TargetGroups                                      = js.Array[TargetGroup]
  type TargetNetworkSet                                  = js.Array[TargetNetwork]
  type TargetReservationValueSet                         = js.Array[TargetReservationValue]
  type TerminateConnectionStatusSet                      = js.Array[TerminateConnectionStatus]
  type ThreadsPerCore                                    = Int
  type ThreadsPerCoreList                                = js.Array[ThreadsPerCore]
  type TrafficMirrorFilterId                             = String
  type TrafficMirrorFilterIdList                         = js.Array[TrafficMirrorFilterId]
  type TrafficMirrorFilterRuleFieldList                  = js.Array[TrafficMirrorFilterRuleField]
  type TrafficMirrorFilterRuleId                         = String
  type TrafficMirrorFilterRuleList                       = js.Array[TrafficMirrorFilterRule]
  type TrafficMirrorFilterSet                            = js.Array[TrafficMirrorFilter]
  type TrafficMirrorNetworkServiceList                   = js.Array[TrafficMirrorNetworkService]
  type TrafficMirrorSessionFieldList                     = js.Array[TrafficMirrorSessionField]
  type TrafficMirrorSessionId                            = String
  type TrafficMirrorSessionIdList                        = js.Array[TrafficMirrorSessionId]
  type TrafficMirrorSessionSet                           = js.Array[TrafficMirrorSession]
  type TrafficMirrorTargetId                             = String
  type TrafficMirrorTargetIdList                         = js.Array[TrafficMirrorTargetId]
  type TrafficMirrorTargetSet                            = js.Array[TrafficMirrorTarget]
  type TrafficMirroringMaxResults                        = Int
  type TransitGatewayAttachmentId                        = String
  type TransitGatewayAttachmentIdStringList              = js.Array[TransitGatewayAttachmentId]
  type TransitGatewayAttachmentList                      = js.Array[TransitGatewayAttachment]
  type TransitGatewayAttachmentPropagationList           = js.Array[TransitGatewayAttachmentPropagation]
  type TransitGatewayId                                  = String
  type TransitGatewayIdStringList                        = js.Array[TransitGatewayId]
  type TransitGatewayList                                = js.Array[TransitGateway]
  type TransitGatewayMaxResults                          = Int
  type TransitGatewayMulticastDomainAssociationList      = js.Array[TransitGatewayMulticastDomainAssociation]
  type TransitGatewayMulticastDomainId                   = String
  type TransitGatewayMulticastDomainIdStringList         = js.Array[String]
  type TransitGatewayMulticastDomainList                 = js.Array[TransitGatewayMulticastDomain]
  type TransitGatewayMulticastGroupList                  = js.Array[TransitGatewayMulticastGroup]
  type TransitGatewayNetworkInterfaceIdList              = js.Array[NetworkInterfaceId]
  type TransitGatewayPeeringAttachmentList               = js.Array[TransitGatewayPeeringAttachment]
  type TransitGatewayRouteAttachmentList                 = js.Array[TransitGatewayRouteAttachment]
  type TransitGatewayRouteList                           = js.Array[TransitGatewayRoute]
  type TransitGatewayRouteTableAssociationList           = js.Array[TransitGatewayRouteTableAssociation]
  type TransitGatewayRouteTableId                        = String
  type TransitGatewayRouteTableIdStringList              = js.Array[String]
  type TransitGatewayRouteTableList                      = js.Array[TransitGatewayRouteTable]
  type TransitGatewayRouteTablePropagationList           = js.Array[TransitGatewayRouteTablePropagation]
  type TransitGatewaySubnetIdList                        = js.Array[SubnetId]
  type TransitGatewayVpcAttachmentList                   = js.Array[TransitGatewayVpcAttachment]
  type TunnelOptionsList                                 = js.Array[TunnelOption]
  type UnsuccessfulInstanceCreditSpecificationSet        = js.Array[UnsuccessfulInstanceCreditSpecificationItem]
  type UnsuccessfulItemList                              = js.Array[UnsuccessfulItem]
  type UnsuccessfulItemSet                               = js.Array[UnsuccessfulItem]
  type UsageClassTypeList                                = js.Array[UsageClassType]
  type UserGroupStringList                               = js.Array[String]
  type UserIdGroupPairList                               = js.Array[UserIdGroupPair]
  type UserIdGroupPairSet                                = js.Array[UserIdGroupPair]
  type UserIdStringList                                  = js.Array[String]
  type VCpuCount                                         = Int
  type ValueStringList                                   = js.Array[String]
  type VersionDescription                                = String
  type VersionStringList                                 = js.Array[String]
  type VgwTelemetryList                                  = js.Array[VgwTelemetry]
  type VolumeAttachmentList                              = js.Array[VolumeAttachment]
  type VolumeId                                          = String
  type VolumeIdStringList                                = js.Array[VolumeId]
  type VolumeList                                        = js.Array[Volume]
  type VolumeModificationList                            = js.Array[VolumeModification]
  type VolumeStatusActionsList                           = js.Array[VolumeStatusAction]
  type VolumeStatusAttachmentStatusList                  = js.Array[VolumeStatusAttachmentStatus]
  type VolumeStatusDetailsList                           = js.Array[VolumeStatusDetails]
  type VolumeStatusEventsList                            = js.Array[VolumeStatusEvent]
  type VolumeStatusList                                  = js.Array[VolumeStatusItem]
  type VpcAttachmentList                                 = js.Array[VpcAttachment]
  type VpcCidrAssociationId                              = String
  type VpcCidrBlockAssociationSet                        = js.Array[VpcCidrBlockAssociation]
  type VpcClassicLinkIdList                              = js.Array[VpcId]
  type VpcClassicLinkList                                = js.Array[VpcClassicLink]
  type VpcEndpointConnectionSet                          = js.Array[VpcEndpointConnection]
  type VpcEndpointId                                     = String
  type VpcEndpointIdList                                 = js.Array[VpcEndpointId]
  type VpcEndpointRouteTableIdList                       = js.Array[RouteTableId]
  type VpcEndpointSecurityGroupIdList                    = js.Array[SecurityGroupId]
  type VpcEndpointServiceId                              = String
  type VpcEndpointServiceIdList                          = js.Array[VpcEndpointServiceId]
  type VpcEndpointSet                                    = js.Array[VpcEndpoint]
  type VpcEndpointSubnetIdList                           = js.Array[SubnetId]
  type VpcFlowLogId                                      = String
  type VpcId                                             = String
  type VpcIdStringList                                   = js.Array[VpcId]
  type VpcIpv6CidrBlockAssociationSet                    = js.Array[VpcIpv6CidrBlockAssociation]
  type VpcList                                           = js.Array[Vpc]
  type VpcPeeringConnectionId                            = String
  type VpcPeeringConnectionIdList                        = js.Array[VpcPeeringConnectionId]
  type VpcPeeringConnectionList                          = js.Array[VpcPeeringConnection]
  type VpnConnectionId                                   = String
  type VpnConnectionIdStringList                         = js.Array[VpnConnectionId]
  type VpnConnectionList                                 = js.Array[VpnConnection]
  type VpnGatewayId                                      = String
  type VpnGatewayIdStringList                            = js.Array[VpnGatewayId]
  type VpnGatewayList                                    = js.Array[VpnGateway]
  type VpnStaticRouteList                                = js.Array[VpnStaticRoute]
  type VpnTunnelOptionsSpecificationsList                = js.Array[VpnTunnelOptionsSpecification]
  type ZoneIdStringList                                  = js.Array[String]
  type ZoneNameStringList                                = js.Array[String]
  type totalFpgaMemory                                   = Int
  type totalGpuMemory                                    = Int

  implicit final class EC2Ops(private val service: EC2) extends AnyVal {

    @inline def acceptReservedInstancesExchangeQuoteFuture(
        params: AcceptReservedInstancesExchangeQuoteRequest
    ): Future[AcceptReservedInstancesExchangeQuoteResult] =
      service.acceptReservedInstancesExchangeQuote(params).promise().toFuture
    @inline def acceptTransitGatewayPeeringAttachmentFuture(
        params: AcceptTransitGatewayPeeringAttachmentRequest
    ): Future[AcceptTransitGatewayPeeringAttachmentResult] =
      service.acceptTransitGatewayPeeringAttachment(params).promise().toFuture
    @inline def acceptTransitGatewayVpcAttachmentFuture(
        params: AcceptTransitGatewayVpcAttachmentRequest
    ): Future[AcceptTransitGatewayVpcAttachmentResult] =
      service.acceptTransitGatewayVpcAttachment(params).promise().toFuture
    @inline def acceptVpcEndpointConnectionsFuture(
        params: AcceptVpcEndpointConnectionsRequest
    ): Future[AcceptVpcEndpointConnectionsResult] = service.acceptVpcEndpointConnections(params).promise().toFuture
    @inline def acceptVpcPeeringConnectionFuture(
        params: AcceptVpcPeeringConnectionRequest
    ): Future[AcceptVpcPeeringConnectionResult] = service.acceptVpcPeeringConnection(params).promise().toFuture
    @inline def advertiseByoipCidrFuture(params: AdvertiseByoipCidrRequest): Future[AdvertiseByoipCidrResult] =
      service.advertiseByoipCidr(params).promise().toFuture
    @inline def allocateAddressFuture(params: AllocateAddressRequest): Future[AllocateAddressResult] =
      service.allocateAddress(params).promise().toFuture
    @inline def allocateHostsFuture(params: AllocateHostsRequest): Future[AllocateHostsResult] =
      service.allocateHosts(params).promise().toFuture
    @inline def applySecurityGroupsToClientVpnTargetNetworkFuture(
        params: ApplySecurityGroupsToClientVpnTargetNetworkRequest
    ): Future[ApplySecurityGroupsToClientVpnTargetNetworkResult] =
      service.applySecurityGroupsToClientVpnTargetNetwork(params).promise().toFuture
    @inline def assignIpv6AddressesFuture(params: AssignIpv6AddressesRequest): Future[AssignIpv6AddressesResult] =
      service.assignIpv6Addresses(params).promise().toFuture
    @inline def assignPrivateIpAddressesFuture(
        params: AssignPrivateIpAddressesRequest
    ): Future[AssignPrivateIpAddressesResult] = service.assignPrivateIpAddresses(params).promise().toFuture
    @inline def associateAddressFuture(params: AssociateAddressRequest): Future[AssociateAddressResult] =
      service.associateAddress(params).promise().toFuture
    @inline def associateClientVpnTargetNetworkFuture(
        params: AssociateClientVpnTargetNetworkRequest
    ): Future[AssociateClientVpnTargetNetworkResult] =
      service.associateClientVpnTargetNetwork(params).promise().toFuture
    @inline def associateDhcpOptionsFuture(params: AssociateDhcpOptionsRequest): Future[js.Object] =
      service.associateDhcpOptions(params).promise().toFuture
    @inline def associateIamInstanceProfileFuture(
        params: AssociateIamInstanceProfileRequest
    ): Future[AssociateIamInstanceProfileResult] = service.associateIamInstanceProfile(params).promise().toFuture
    @inline def associateRouteTableFuture(params: AssociateRouteTableRequest): Future[AssociateRouteTableResult] =
      service.associateRouteTable(params).promise().toFuture
    @inline def associateSubnetCidrBlockFuture(
        params: AssociateSubnetCidrBlockRequest
    ): Future[AssociateSubnetCidrBlockResult] = service.associateSubnetCidrBlock(params).promise().toFuture
    @inline def associateTransitGatewayMulticastDomainFuture(
        params: AssociateTransitGatewayMulticastDomainRequest
    ): Future[AssociateTransitGatewayMulticastDomainResult] =
      service.associateTransitGatewayMulticastDomain(params).promise().toFuture
    @inline def associateTransitGatewayRouteTableFuture(
        params: AssociateTransitGatewayRouteTableRequest
    ): Future[AssociateTransitGatewayRouteTableResult] =
      service.associateTransitGatewayRouteTable(params).promise().toFuture
    @inline def associateVpcCidrBlockFuture(params: AssociateVpcCidrBlockRequest): Future[AssociateVpcCidrBlockResult] =
      service.associateVpcCidrBlock(params).promise().toFuture
    @inline def attachClassicLinkVpcFuture(params: AttachClassicLinkVpcRequest): Future[AttachClassicLinkVpcResult] =
      service.attachClassicLinkVpc(params).promise().toFuture
    @inline def attachInternetGatewayFuture(params: AttachInternetGatewayRequest): Future[js.Object] =
      service.attachInternetGateway(params).promise().toFuture
    @inline def attachNetworkInterfaceFuture(
        params: AttachNetworkInterfaceRequest
    ): Future[AttachNetworkInterfaceResult] = service.attachNetworkInterface(params).promise().toFuture
    @inline def attachVolumeFuture(params: AttachVolumeRequest): Future[VolumeAttachment] =
      service.attachVolume(params).promise().toFuture
    @inline def attachVpnGatewayFuture(params: AttachVpnGatewayRequest): Future[AttachVpnGatewayResult] =
      service.attachVpnGateway(params).promise().toFuture
    @inline def authorizeClientVpnIngressFuture(
        params: AuthorizeClientVpnIngressRequest
    ): Future[AuthorizeClientVpnIngressResult] = service.authorizeClientVpnIngress(params).promise().toFuture
    @inline def authorizeSecurityGroupEgressFuture(params: AuthorizeSecurityGroupEgressRequest): Future[js.Object] =
      service.authorizeSecurityGroupEgress(params).promise().toFuture
    @inline def authorizeSecurityGroupIngressFuture(params: AuthorizeSecurityGroupIngressRequest): Future[js.Object] =
      service.authorizeSecurityGroupIngress(params).promise().toFuture
    @inline def bundleInstanceFuture(params: BundleInstanceRequest): Future[BundleInstanceResult] =
      service.bundleInstance(params).promise().toFuture
    @inline def cancelBundleTaskFuture(params: CancelBundleTaskRequest): Future[CancelBundleTaskResult] =
      service.cancelBundleTask(params).promise().toFuture
    @inline def cancelCapacityReservationFuture(
        params: CancelCapacityReservationRequest
    ): Future[CancelCapacityReservationResult] = service.cancelCapacityReservation(params).promise().toFuture
    @inline def cancelConversionTaskFuture(params: CancelConversionRequest): Future[js.Object] =
      service.cancelConversionTask(params).promise().toFuture
    @inline def cancelExportTaskFuture(params: CancelExportTaskRequest): Future[js.Object] =
      service.cancelExportTask(params).promise().toFuture
    @inline def cancelImportTaskFuture(params: CancelImportTaskRequest): Future[CancelImportTaskResult] =
      service.cancelImportTask(params).promise().toFuture
    @inline def cancelReservedInstancesListingFuture(
        params: CancelReservedInstancesListingRequest
    ): Future[CancelReservedInstancesListingResult] = service.cancelReservedInstancesListing(params).promise().toFuture
    @inline def cancelSpotFleetRequestsFuture(
        params: CancelSpotFleetRequestsRequest
    ): Future[CancelSpotFleetRequestsResponse] = service.cancelSpotFleetRequests(params).promise().toFuture
    @inline def cancelSpotInstanceRequestsFuture(
        params: CancelSpotInstanceRequestsRequest
    ): Future[CancelSpotInstanceRequestsResult] = service.cancelSpotInstanceRequests(params).promise().toFuture
    @inline def confirmProductInstanceFuture(
        params: ConfirmProductInstanceRequest
    ): Future[ConfirmProductInstanceResult] = service.confirmProductInstance(params).promise().toFuture
    @inline def copyFpgaImageFuture(params: CopyFpgaImageRequest): Future[CopyFpgaImageResult] =
      service.copyFpgaImage(params).promise().toFuture
    @inline def copyImageFuture(params: CopyImageRequest): Future[CopyImageResult] =
      service.copyImage(params).promise().toFuture
    @inline def copySnapshotFuture(params: CopySnapshotRequest): Future[CopySnapshotResult] =
      service.copySnapshot(params).promise().toFuture
    @inline def createCapacityReservationFuture(
        params: CreateCapacityReservationRequest
    ): Future[CreateCapacityReservationResult] = service.createCapacityReservation(params).promise().toFuture
    @inline def createClientVpnEndpointFuture(
        params: CreateClientVpnEndpointRequest
    ): Future[CreateClientVpnEndpointResult] = service.createClientVpnEndpoint(params).promise().toFuture
    @inline def createClientVpnRouteFuture(params: CreateClientVpnRouteRequest): Future[CreateClientVpnRouteResult] =
      service.createClientVpnRoute(params).promise().toFuture
    @inline def createCustomerGatewayFuture(params: CreateCustomerGatewayRequest): Future[CreateCustomerGatewayResult] =
      service.createCustomerGateway(params).promise().toFuture
    @inline def createDefaultSubnetFuture(params: CreateDefaultSubnetRequest): Future[CreateDefaultSubnetResult] =
      service.createDefaultSubnet(params).promise().toFuture
    @inline def createDefaultVpcFuture(params: CreateDefaultVpcRequest): Future[CreateDefaultVpcResult] =
      service.createDefaultVpc(params).promise().toFuture
    @inline def createDhcpOptionsFuture(params: CreateDhcpOptionsRequest): Future[CreateDhcpOptionsResult] =
      service.createDhcpOptions(params).promise().toFuture
    @inline def createEgressOnlyInternetGatewayFuture(
        params: CreateEgressOnlyInternetGatewayRequest
    ): Future[CreateEgressOnlyInternetGatewayResult] =
      service.createEgressOnlyInternetGateway(params).promise().toFuture
    @inline def createFleetFuture(params: CreateFleetRequest): Future[CreateFleetResult] =
      service.createFleet(params).promise().toFuture
    @inline def createFlowLogsFuture(params: CreateFlowLogsRequest): Future[CreateFlowLogsResult] =
      service.createFlowLogs(params).promise().toFuture
    @inline def createFpgaImageFuture(params: CreateFpgaImageRequest): Future[CreateFpgaImageResult] =
      service.createFpgaImage(params).promise().toFuture
    @inline def createImageFuture(params: CreateImageRequest): Future[CreateImageResult] =
      service.createImage(params).promise().toFuture
    @inline def createInstanceExportTaskFuture(
        params: CreateInstanceExportTaskRequest
    ): Future[CreateInstanceExportTaskResult] = service.createInstanceExportTask(params).promise().toFuture
    @inline def createInternetGatewayFuture(params: CreateInternetGatewayRequest): Future[CreateInternetGatewayResult] =
      service.createInternetGateway(params).promise().toFuture
    @inline def createKeyPairFuture(params: CreateKeyPairRequest): Future[KeyPair] =
      service.createKeyPair(params).promise().toFuture
    @inline def createLaunchTemplateFuture(params: CreateLaunchTemplateRequest): Future[CreateLaunchTemplateResult] =
      service.createLaunchTemplate(params).promise().toFuture
    @inline def createLaunchTemplateVersionFuture(
        params: CreateLaunchTemplateVersionRequest
    ): Future[CreateLaunchTemplateVersionResult] = service.createLaunchTemplateVersion(params).promise().toFuture
    @inline def createLocalGatewayRouteFuture(
        params: CreateLocalGatewayRouteRequest
    ): Future[CreateLocalGatewayRouteResult] = service.createLocalGatewayRoute(params).promise().toFuture
    @inline def createLocalGatewayRouteTableVpcAssociationFuture(
        params: CreateLocalGatewayRouteTableVpcAssociationRequest
    ): Future[CreateLocalGatewayRouteTableVpcAssociationResult] =
      service.createLocalGatewayRouteTableVpcAssociation(params).promise().toFuture
    @inline def createNatGatewayFuture(params: CreateNatGatewayRequest): Future[CreateNatGatewayResult] =
      service.createNatGateway(params).promise().toFuture
    @inline def createNetworkAclEntryFuture(params: CreateNetworkAclEntryRequest): Future[js.Object] =
      service.createNetworkAclEntry(params).promise().toFuture
    @inline def createNetworkAclFuture(params: CreateNetworkAclRequest): Future[CreateNetworkAclResult] =
      service.createNetworkAcl(params).promise().toFuture
    @inline def createNetworkInterfaceFuture(
        params: CreateNetworkInterfaceRequest
    ): Future[CreateNetworkInterfaceResult] = service.createNetworkInterface(params).promise().toFuture
    @inline def createNetworkInterfacePermissionFuture(
        params: CreateNetworkInterfacePermissionRequest
    ): Future[CreateNetworkInterfacePermissionResult] =
      service.createNetworkInterfacePermission(params).promise().toFuture
    @inline def createPlacementGroupFuture(params: CreatePlacementGroupRequest): Future[js.Object] =
      service.createPlacementGroup(params).promise().toFuture
    @inline def createReservedInstancesListingFuture(
        params: CreateReservedInstancesListingRequest
    ): Future[CreateReservedInstancesListingResult] = service.createReservedInstancesListing(params).promise().toFuture
    @inline def createRouteFuture(params: CreateRouteRequest): Future[CreateRouteResult] =
      service.createRoute(params).promise().toFuture
    @inline def createRouteTableFuture(params: CreateRouteTableRequest): Future[CreateRouteTableResult] =
      service.createRouteTable(params).promise().toFuture
    @inline def createSecurityGroupFuture(params: CreateSecurityGroupRequest): Future[CreateSecurityGroupResult] =
      service.createSecurityGroup(params).promise().toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotRequest): Future[Snapshot] =
      service.createSnapshot(params).promise().toFuture
    @inline def createSnapshotsFuture(params: CreateSnapshotsRequest): Future[CreateSnapshotsResult] =
      service.createSnapshots(params).promise().toFuture
    @inline def createSpotDatafeedSubscriptionFuture(
        params: CreateSpotDatafeedSubscriptionRequest
    ): Future[CreateSpotDatafeedSubscriptionResult] = service.createSpotDatafeedSubscription(params).promise().toFuture
    @inline def createSubnetFuture(params: CreateSubnetRequest): Future[CreateSubnetResult] =
      service.createSubnet(params).promise().toFuture
    @inline def createTagsFuture(params: CreateTagsRequest): Future[js.Object] =
      service.createTags(params).promise().toFuture
    @inline def createTrafficMirrorFilterFuture(
        params: CreateTrafficMirrorFilterRequest
    ): Future[CreateTrafficMirrorFilterResult] = service.createTrafficMirrorFilter(params).promise().toFuture
    @inline def createTrafficMirrorFilterRuleFuture(
        params: CreateTrafficMirrorFilterRuleRequest
    ): Future[CreateTrafficMirrorFilterRuleResult] = service.createTrafficMirrorFilterRule(params).promise().toFuture
    @inline def createTrafficMirrorSessionFuture(
        params: CreateTrafficMirrorSessionRequest
    ): Future[CreateTrafficMirrorSessionResult] = service.createTrafficMirrorSession(params).promise().toFuture
    @inline def createTrafficMirrorTargetFuture(
        params: CreateTrafficMirrorTargetRequest
    ): Future[CreateTrafficMirrorTargetResult] = service.createTrafficMirrorTarget(params).promise().toFuture
    @inline def createTransitGatewayFuture(params: CreateTransitGatewayRequest): Future[CreateTransitGatewayResult] =
      service.createTransitGateway(params).promise().toFuture
    @inline def createTransitGatewayMulticastDomainFuture(
        params: CreateTransitGatewayMulticastDomainRequest
    ): Future[CreateTransitGatewayMulticastDomainResult] =
      service.createTransitGatewayMulticastDomain(params).promise().toFuture
    @inline def createTransitGatewayPeeringAttachmentFuture(
        params: CreateTransitGatewayPeeringAttachmentRequest
    ): Future[CreateTransitGatewayPeeringAttachmentResult] =
      service.createTransitGatewayPeeringAttachment(params).promise().toFuture
    @inline def createTransitGatewayRouteFuture(
        params: CreateTransitGatewayRouteRequest
    ): Future[CreateTransitGatewayRouteResult] = service.createTransitGatewayRoute(params).promise().toFuture
    @inline def createTransitGatewayRouteTableFuture(
        params: CreateTransitGatewayRouteTableRequest
    ): Future[CreateTransitGatewayRouteTableResult] = service.createTransitGatewayRouteTable(params).promise().toFuture
    @inline def createTransitGatewayVpcAttachmentFuture(
        params: CreateTransitGatewayVpcAttachmentRequest
    ): Future[CreateTransitGatewayVpcAttachmentResult] =
      service.createTransitGatewayVpcAttachment(params).promise().toFuture
    @inline def createVolumeFuture(params: CreateVolumeRequest): Future[Volume] =
      service.createVolume(params).promise().toFuture
    @inline def createVpcEndpointConnectionNotificationFuture(
        params: CreateVpcEndpointConnectionNotificationRequest
    ): Future[CreateVpcEndpointConnectionNotificationResult] =
      service.createVpcEndpointConnectionNotification(params).promise().toFuture
    @inline def createVpcEndpointFuture(params: CreateVpcEndpointRequest): Future[CreateVpcEndpointResult] =
      service.createVpcEndpoint(params).promise().toFuture
    @inline def createVpcEndpointServiceConfigurationFuture(
        params: CreateVpcEndpointServiceConfigurationRequest
    ): Future[CreateVpcEndpointServiceConfigurationResult] =
      service.createVpcEndpointServiceConfiguration(params).promise().toFuture
    @inline def createVpcFuture(params: CreateVpcRequest): Future[CreateVpcResult] =
      service.createVpc(params).promise().toFuture
    @inline def createVpcPeeringConnectionFuture(
        params: CreateVpcPeeringConnectionRequest
    ): Future[CreateVpcPeeringConnectionResult] = service.createVpcPeeringConnection(params).promise().toFuture
    @inline def createVpnConnectionFuture(params: CreateVpnConnectionRequest): Future[CreateVpnConnectionResult] =
      service.createVpnConnection(params).promise().toFuture
    @inline def createVpnConnectionRouteFuture(params: CreateVpnConnectionRouteRequest): Future[js.Object] =
      service.createVpnConnectionRoute(params).promise().toFuture
    @inline def createVpnGatewayFuture(params: CreateVpnGatewayRequest): Future[CreateVpnGatewayResult] =
      service.createVpnGateway(params).promise().toFuture
    @inline def deleteClientVpnEndpointFuture(
        params: DeleteClientVpnEndpointRequest
    ): Future[DeleteClientVpnEndpointResult] = service.deleteClientVpnEndpoint(params).promise().toFuture
    @inline def deleteClientVpnRouteFuture(params: DeleteClientVpnRouteRequest): Future[DeleteClientVpnRouteResult] =
      service.deleteClientVpnRoute(params).promise().toFuture
    @inline def deleteCustomerGatewayFuture(params: DeleteCustomerGatewayRequest): Future[js.Object] =
      service.deleteCustomerGateway(params).promise().toFuture
    @inline def deleteDhcpOptionsFuture(params: DeleteDhcpOptionsRequest): Future[js.Object] =
      service.deleteDhcpOptions(params).promise().toFuture
    @inline def deleteEgressOnlyInternetGatewayFuture(
        params: DeleteEgressOnlyInternetGatewayRequest
    ): Future[DeleteEgressOnlyInternetGatewayResult] =
      service.deleteEgressOnlyInternetGateway(params).promise().toFuture
    @inline def deleteFleetsFuture(params: DeleteFleetsRequest): Future[DeleteFleetsResult] =
      service.deleteFleets(params).promise().toFuture
    @inline def deleteFlowLogsFuture(params: DeleteFlowLogsRequest): Future[DeleteFlowLogsResult] =
      service.deleteFlowLogs(params).promise().toFuture
    @inline def deleteFpgaImageFuture(params: DeleteFpgaImageRequest): Future[DeleteFpgaImageResult] =
      service.deleteFpgaImage(params).promise().toFuture
    @inline def deleteInternetGatewayFuture(params: DeleteInternetGatewayRequest): Future[js.Object] =
      service.deleteInternetGateway(params).promise().toFuture
    @inline def deleteKeyPairFuture(params: DeleteKeyPairRequest): Future[js.Object] =
      service.deleteKeyPair(params).promise().toFuture
    @inline def deleteLaunchTemplateFuture(params: DeleteLaunchTemplateRequest): Future[DeleteLaunchTemplateResult] =
      service.deleteLaunchTemplate(params).promise().toFuture
    @inline def deleteLaunchTemplateVersionsFuture(
        params: DeleteLaunchTemplateVersionsRequest
    ): Future[DeleteLaunchTemplateVersionsResult] = service.deleteLaunchTemplateVersions(params).promise().toFuture
    @inline def deleteLocalGatewayRouteFuture(
        params: DeleteLocalGatewayRouteRequest
    ): Future[DeleteLocalGatewayRouteResult] = service.deleteLocalGatewayRoute(params).promise().toFuture
    @inline def deleteLocalGatewayRouteTableVpcAssociationFuture(
        params: DeleteLocalGatewayRouteTableVpcAssociationRequest
    ): Future[DeleteLocalGatewayRouteTableVpcAssociationResult] =
      service.deleteLocalGatewayRouteTableVpcAssociation(params).promise().toFuture
    @inline def deleteNatGatewayFuture(params: DeleteNatGatewayRequest): Future[DeleteNatGatewayResult] =
      service.deleteNatGateway(params).promise().toFuture
    @inline def deleteNetworkAclEntryFuture(params: DeleteNetworkAclEntryRequest): Future[js.Object] =
      service.deleteNetworkAclEntry(params).promise().toFuture
    @inline def deleteNetworkAclFuture(params: DeleteNetworkAclRequest): Future[js.Object] =
      service.deleteNetworkAcl(params).promise().toFuture
    @inline def deleteNetworkInterfaceFuture(params: DeleteNetworkInterfaceRequest): Future[js.Object] =
      service.deleteNetworkInterface(params).promise().toFuture
    @inline def deleteNetworkInterfacePermissionFuture(
        params: DeleteNetworkInterfacePermissionRequest
    ): Future[DeleteNetworkInterfacePermissionResult] =
      service.deleteNetworkInterfacePermission(params).promise().toFuture
    @inline def deletePlacementGroupFuture(params: DeletePlacementGroupRequest): Future[js.Object] =
      service.deletePlacementGroup(params).promise().toFuture
    @inline def deleteQueuedReservedInstancesFuture(
        params: DeleteQueuedReservedInstancesRequest
    ): Future[DeleteQueuedReservedInstancesResult] = service.deleteQueuedReservedInstances(params).promise().toFuture
    @inline def deleteRouteFuture(params: DeleteRouteRequest): Future[js.Object] =
      service.deleteRoute(params).promise().toFuture
    @inline def deleteRouteTableFuture(params: DeleteRouteTableRequest): Future[js.Object] =
      service.deleteRouteTable(params).promise().toFuture
    @inline def deleteSecurityGroupFuture(params: DeleteSecurityGroupRequest): Future[js.Object] =
      service.deleteSecurityGroup(params).promise().toFuture
    @inline def deleteSnapshotFuture(params: DeleteSnapshotRequest): Future[js.Object] =
      service.deleteSnapshot(params).promise().toFuture
    @inline def deleteSpotDatafeedSubscriptionFuture(params: DeleteSpotDatafeedSubscriptionRequest): Future[js.Object] =
      service.deleteSpotDatafeedSubscription(params).promise().toFuture
    @inline def deleteSubnetFuture(params: DeleteSubnetRequest): Future[js.Object] =
      service.deleteSubnet(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsRequest): Future[js.Object] =
      service.deleteTags(params).promise().toFuture
    @inline def deleteTrafficMirrorFilterFuture(
        params: DeleteTrafficMirrorFilterRequest
    ): Future[DeleteTrafficMirrorFilterResult] = service.deleteTrafficMirrorFilter(params).promise().toFuture
    @inline def deleteTrafficMirrorFilterRuleFuture(
        params: DeleteTrafficMirrorFilterRuleRequest
    ): Future[DeleteTrafficMirrorFilterRuleResult] = service.deleteTrafficMirrorFilterRule(params).promise().toFuture
    @inline def deleteTrafficMirrorSessionFuture(
        params: DeleteTrafficMirrorSessionRequest
    ): Future[DeleteTrafficMirrorSessionResult] = service.deleteTrafficMirrorSession(params).promise().toFuture
    @inline def deleteTrafficMirrorTargetFuture(
        params: DeleteTrafficMirrorTargetRequest
    ): Future[DeleteTrafficMirrorTargetResult] = service.deleteTrafficMirrorTarget(params).promise().toFuture
    @inline def deleteTransitGatewayFuture(params: DeleteTransitGatewayRequest): Future[DeleteTransitGatewayResult] =
      service.deleteTransitGateway(params).promise().toFuture
    @inline def deleteTransitGatewayMulticastDomainFuture(
        params: DeleteTransitGatewayMulticastDomainRequest
    ): Future[DeleteTransitGatewayMulticastDomainResult] =
      service.deleteTransitGatewayMulticastDomain(params).promise().toFuture
    @inline def deleteTransitGatewayPeeringAttachmentFuture(
        params: DeleteTransitGatewayPeeringAttachmentRequest
    ): Future[DeleteTransitGatewayPeeringAttachmentResult] =
      service.deleteTransitGatewayPeeringAttachment(params).promise().toFuture
    @inline def deleteTransitGatewayRouteFuture(
        params: DeleteTransitGatewayRouteRequest
    ): Future[DeleteTransitGatewayRouteResult] = service.deleteTransitGatewayRoute(params).promise().toFuture
    @inline def deleteTransitGatewayRouteTableFuture(
        params: DeleteTransitGatewayRouteTableRequest
    ): Future[DeleteTransitGatewayRouteTableResult] = service.deleteTransitGatewayRouteTable(params).promise().toFuture
    @inline def deleteTransitGatewayVpcAttachmentFuture(
        params: DeleteTransitGatewayVpcAttachmentRequest
    ): Future[DeleteTransitGatewayVpcAttachmentResult] =
      service.deleteTransitGatewayVpcAttachment(params).promise().toFuture
    @inline def deleteVolumeFuture(params: DeleteVolumeRequest): Future[js.Object] =
      service.deleteVolume(params).promise().toFuture
    @inline def deleteVpcEndpointConnectionNotificationsFuture(
        params: DeleteVpcEndpointConnectionNotificationsRequest
    ): Future[DeleteVpcEndpointConnectionNotificationsResult] =
      service.deleteVpcEndpointConnectionNotifications(params).promise().toFuture
    @inline def deleteVpcEndpointServiceConfigurationsFuture(
        params: DeleteVpcEndpointServiceConfigurationsRequest
    ): Future[DeleteVpcEndpointServiceConfigurationsResult] =
      service.deleteVpcEndpointServiceConfigurations(params).promise().toFuture
    @inline def deleteVpcEndpointsFuture(params: DeleteVpcEndpointsRequest): Future[DeleteVpcEndpointsResult] =
      service.deleteVpcEndpoints(params).promise().toFuture
    @inline def deleteVpcFuture(params: DeleteVpcRequest): Future[js.Object] =
      service.deleteVpc(params).promise().toFuture
    @inline def deleteVpcPeeringConnectionFuture(
        params: DeleteVpcPeeringConnectionRequest
    ): Future[DeleteVpcPeeringConnectionResult] = service.deleteVpcPeeringConnection(params).promise().toFuture
    @inline def deleteVpnConnectionFuture(params: DeleteVpnConnectionRequest): Future[js.Object] =
      service.deleteVpnConnection(params).promise().toFuture
    @inline def deleteVpnConnectionRouteFuture(params: DeleteVpnConnectionRouteRequest): Future[js.Object] =
      service.deleteVpnConnectionRoute(params).promise().toFuture
    @inline def deleteVpnGatewayFuture(params: DeleteVpnGatewayRequest): Future[js.Object] =
      service.deleteVpnGateway(params).promise().toFuture
    @inline def deprovisionByoipCidrFuture(params: DeprovisionByoipCidrRequest): Future[DeprovisionByoipCidrResult] =
      service.deprovisionByoipCidr(params).promise().toFuture
    @inline def deregisterImageFuture(params: DeregisterImageRequest): Future[js.Object] =
      service.deregisterImage(params).promise().toFuture
    @inline def deregisterTransitGatewayMulticastGroupMembersFuture(
        params: DeregisterTransitGatewayMulticastGroupMembersRequest
    ): Future[DeregisterTransitGatewayMulticastGroupMembersResult] =
      service.deregisterTransitGatewayMulticastGroupMembers(params).promise().toFuture
    @inline def deregisterTransitGatewayMulticastGroupSourcesFuture(
        params: DeregisterTransitGatewayMulticastGroupSourcesRequest
    ): Future[DeregisterTransitGatewayMulticastGroupSourcesResult] =
      service.deregisterTransitGatewayMulticastGroupSources(params).promise().toFuture
    @inline def describeAccountAttributesFuture(
        params: DescribeAccountAttributesRequest
    ): Future[DescribeAccountAttributesResult] = service.describeAccountAttributes(params).promise().toFuture
    @inline def describeAddressesFuture(params: DescribeAddressesRequest): Future[DescribeAddressesResult] =
      service.describeAddresses(params).promise().toFuture
    @inline def describeAggregateIdFormatFuture(
        params: DescribeAggregateIdFormatRequest
    ): Future[DescribeAggregateIdFormatResult] = service.describeAggregateIdFormat(params).promise().toFuture
    @inline def describeAvailabilityZonesFuture(
        params: DescribeAvailabilityZonesRequest
    ): Future[DescribeAvailabilityZonesResult] = service.describeAvailabilityZones(params).promise().toFuture
    @inline def describeBundleTasksFuture(params: DescribeBundleTasksRequest): Future[DescribeBundleTasksResult] =
      service.describeBundleTasks(params).promise().toFuture
    @inline def describeByoipCidrsFuture(params: DescribeByoipCidrsRequest): Future[DescribeByoipCidrsResult] =
      service.describeByoipCidrs(params).promise().toFuture
    @inline def describeCapacityReservationsFuture(
        params: DescribeCapacityReservationsRequest
    ): Future[DescribeCapacityReservationsResult] = service.describeCapacityReservations(params).promise().toFuture
    @inline def describeClassicLinkInstancesFuture(
        params: DescribeClassicLinkInstancesRequest
    ): Future[DescribeClassicLinkInstancesResult] = service.describeClassicLinkInstances(params).promise().toFuture
    @inline def describeClientVpnAuthorizationRulesFuture(
        params: DescribeClientVpnAuthorizationRulesRequest
    ): Future[DescribeClientVpnAuthorizationRulesResult] =
      service.describeClientVpnAuthorizationRules(params).promise().toFuture
    @inline def describeClientVpnConnectionsFuture(
        params: DescribeClientVpnConnectionsRequest
    ): Future[DescribeClientVpnConnectionsResult] = service.describeClientVpnConnections(params).promise().toFuture
    @inline def describeClientVpnEndpointsFuture(
        params: DescribeClientVpnEndpointsRequest
    ): Future[DescribeClientVpnEndpointsResult] = service.describeClientVpnEndpoints(params).promise().toFuture
    @inline def describeClientVpnRoutesFuture(
        params: DescribeClientVpnRoutesRequest
    ): Future[DescribeClientVpnRoutesResult] = service.describeClientVpnRoutes(params).promise().toFuture
    @inline def describeClientVpnTargetNetworksFuture(
        params: DescribeClientVpnTargetNetworksRequest
    ): Future[DescribeClientVpnTargetNetworksResult] =
      service.describeClientVpnTargetNetworks(params).promise().toFuture
    @inline def describeCoipPoolsFuture(params: DescribeCoipPoolsRequest): Future[DescribeCoipPoolsResult] =
      service.describeCoipPools(params).promise().toFuture
    @inline def describeConversionTasksFuture(
        params: DescribeConversionTasksRequest
    ): Future[DescribeConversionTasksResult] = service.describeConversionTasks(params).promise().toFuture
    @inline def describeCustomerGatewaysFuture(
        params: DescribeCustomerGatewaysRequest
    ): Future[DescribeCustomerGatewaysResult] = service.describeCustomerGateways(params).promise().toFuture
    @inline def describeDhcpOptionsFuture(params: DescribeDhcpOptionsRequest): Future[DescribeDhcpOptionsResult] =
      service.describeDhcpOptions(params).promise().toFuture
    @inline def describeEgressOnlyInternetGatewaysFuture(
        params: DescribeEgressOnlyInternetGatewaysRequest
    ): Future[DescribeEgressOnlyInternetGatewaysResult] =
      service.describeEgressOnlyInternetGateways(params).promise().toFuture
    @inline def describeElasticGpusFuture(params: DescribeElasticGpusRequest): Future[DescribeElasticGpusResult] =
      service.describeElasticGpus(params).promise().toFuture
    @inline def describeExportImageTasksFuture(
        params: DescribeExportImageTasksRequest
    ): Future[DescribeExportImageTasksResult] = service.describeExportImageTasks(params).promise().toFuture
    @inline def describeExportTasksFuture(params: DescribeExportTasksRequest): Future[DescribeExportTasksResult] =
      service.describeExportTasks(params).promise().toFuture
    @inline def describeFastSnapshotRestoresFuture(
        params: DescribeFastSnapshotRestoresRequest
    ): Future[DescribeFastSnapshotRestoresResult] = service.describeFastSnapshotRestores(params).promise().toFuture
    @inline def describeFleetHistoryFuture(params: DescribeFleetHistoryRequest): Future[DescribeFleetHistoryResult] =
      service.describeFleetHistory(params).promise().toFuture
    @inline def describeFleetInstancesFuture(
        params: DescribeFleetInstancesRequest
    ): Future[DescribeFleetInstancesResult] = service.describeFleetInstances(params).promise().toFuture
    @inline def describeFleetsFuture(params: DescribeFleetsRequest): Future[DescribeFleetsResult] =
      service.describeFleets(params).promise().toFuture
    @inline def describeFlowLogsFuture(params: DescribeFlowLogsRequest): Future[DescribeFlowLogsResult] =
      service.describeFlowLogs(params).promise().toFuture
    @inline def describeFpgaImageAttributeFuture(
        params: DescribeFpgaImageAttributeRequest
    ): Future[DescribeFpgaImageAttributeResult] = service.describeFpgaImageAttribute(params).promise().toFuture
    @inline def describeFpgaImagesFuture(params: DescribeFpgaImagesRequest): Future[DescribeFpgaImagesResult] =
      service.describeFpgaImages(params).promise().toFuture
    @inline def describeHostReservationOfferingsFuture(
        params: DescribeHostReservationOfferingsRequest
    ): Future[DescribeHostReservationOfferingsResult] =
      service.describeHostReservationOfferings(params).promise().toFuture
    @inline def describeHostReservationsFuture(
        params: DescribeHostReservationsRequest
    ): Future[DescribeHostReservationsResult] = service.describeHostReservations(params).promise().toFuture
    @inline def describeHostsFuture(params: DescribeHostsRequest): Future[DescribeHostsResult] =
      service.describeHosts(params).promise().toFuture
    @inline def describeIamInstanceProfileAssociationsFuture(
        params: DescribeIamInstanceProfileAssociationsRequest
    ): Future[DescribeIamInstanceProfileAssociationsResult] =
      service.describeIamInstanceProfileAssociations(params).promise().toFuture
    @inline def describeIdFormatFuture(params: DescribeIdFormatRequest): Future[DescribeIdFormatResult] =
      service.describeIdFormat(params).promise().toFuture
    @inline def describeIdentityIdFormatFuture(
        params: DescribeIdentityIdFormatRequest
    ): Future[DescribeIdentityIdFormatResult] = service.describeIdentityIdFormat(params).promise().toFuture
    @inline def describeImageAttributeFuture(params: DescribeImageAttributeRequest): Future[ImageAttribute] =
      service.describeImageAttribute(params).promise().toFuture
    @inline def describeImagesFuture(params: DescribeImagesRequest): Future[DescribeImagesResult] =
      service.describeImages(params).promise().toFuture
    @inline def describeImportImageTasksFuture(
        params: DescribeImportImageTasksRequest
    ): Future[DescribeImportImageTasksResult] = service.describeImportImageTasks(params).promise().toFuture
    @inline def describeImportSnapshotTasksFuture(
        params: DescribeImportSnapshotTasksRequest
    ): Future[DescribeImportSnapshotTasksResult] = service.describeImportSnapshotTasks(params).promise().toFuture
    @inline def describeInstanceAttributeFuture(params: DescribeInstanceAttributeRequest): Future[InstanceAttribute] =
      service.describeInstanceAttribute(params).promise().toFuture
    @inline def describeInstanceCreditSpecificationsFuture(
        params: DescribeInstanceCreditSpecificationsRequest
    ): Future[DescribeInstanceCreditSpecificationsResult] =
      service.describeInstanceCreditSpecifications(params).promise().toFuture
    @inline def describeInstanceStatusFuture(
        params: DescribeInstanceStatusRequest
    ): Future[DescribeInstanceStatusResult] = service.describeInstanceStatus(params).promise().toFuture
    @inline def describeInstanceTypeOfferingsFuture(
        params: DescribeInstanceTypeOfferingsRequest
    ): Future[DescribeInstanceTypeOfferingsResult] = service.describeInstanceTypeOfferings(params).promise().toFuture
    @inline def describeInstanceTypesFuture(params: DescribeInstanceTypesRequest): Future[DescribeInstanceTypesResult] =
      service.describeInstanceTypes(params).promise().toFuture
    @inline def describeInstancesFuture(params: DescribeInstancesRequest): Future[DescribeInstancesResult] =
      service.describeInstances(params).promise().toFuture
    @inline def describeInternetGatewaysFuture(
        params: DescribeInternetGatewaysRequest
    ): Future[DescribeInternetGatewaysResult] = service.describeInternetGateways(params).promise().toFuture
    @inline def describeIpv6PoolsFuture(params: DescribeIpv6PoolsRequest): Future[DescribeIpv6PoolsResult] =
      service.describeIpv6Pools(params).promise().toFuture
    @inline def describeKeyPairsFuture(params: DescribeKeyPairsRequest): Future[DescribeKeyPairsResult] =
      service.describeKeyPairs(params).promise().toFuture
    @inline def describeLaunchTemplateVersionsFuture(
        params: DescribeLaunchTemplateVersionsRequest
    ): Future[DescribeLaunchTemplateVersionsResult] = service.describeLaunchTemplateVersions(params).promise().toFuture
    @inline def describeLaunchTemplatesFuture(
        params: DescribeLaunchTemplatesRequest
    ): Future[DescribeLaunchTemplatesResult] = service.describeLaunchTemplates(params).promise().toFuture
    @inline def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsFuture(
        params: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
    ): Future[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult] =
      service.describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(params).promise().toFuture
    @inline def describeLocalGatewayRouteTableVpcAssociationsFuture(
        params: DescribeLocalGatewayRouteTableVpcAssociationsRequest
    ): Future[DescribeLocalGatewayRouteTableVpcAssociationsResult] =
      service.describeLocalGatewayRouteTableVpcAssociations(params).promise().toFuture
    @inline def describeLocalGatewayRouteTablesFuture(
        params: DescribeLocalGatewayRouteTablesRequest
    ): Future[DescribeLocalGatewayRouteTablesResult] =
      service.describeLocalGatewayRouteTables(params).promise().toFuture
    @inline def describeLocalGatewayVirtualInterfaceGroupsFuture(
        params: DescribeLocalGatewayVirtualInterfaceGroupsRequest
    ): Future[DescribeLocalGatewayVirtualInterfaceGroupsResult] =
      service.describeLocalGatewayVirtualInterfaceGroups(params).promise().toFuture
    @inline def describeLocalGatewayVirtualInterfacesFuture(
        params: DescribeLocalGatewayVirtualInterfacesRequest
    ): Future[DescribeLocalGatewayVirtualInterfacesResult] =
      service.describeLocalGatewayVirtualInterfaces(params).promise().toFuture
    @inline def describeLocalGatewaysFuture(params: DescribeLocalGatewaysRequest): Future[DescribeLocalGatewaysResult] =
      service.describeLocalGateways(params).promise().toFuture
    @inline def describeMovingAddressesFuture(
        params: DescribeMovingAddressesRequest
    ): Future[DescribeMovingAddressesResult] = service.describeMovingAddresses(params).promise().toFuture
    @inline def describeNatGatewaysFuture(params: DescribeNatGatewaysRequest): Future[DescribeNatGatewaysResult] =
      service.describeNatGateways(params).promise().toFuture
    @inline def describeNetworkAclsFuture(params: DescribeNetworkAclsRequest): Future[DescribeNetworkAclsResult] =
      service.describeNetworkAcls(params).promise().toFuture
    @inline def describeNetworkInterfaceAttributeFuture(
        params: DescribeNetworkInterfaceAttributeRequest
    ): Future[DescribeNetworkInterfaceAttributeResult] =
      service.describeNetworkInterfaceAttribute(params).promise().toFuture
    @inline def describeNetworkInterfacePermissionsFuture(
        params: DescribeNetworkInterfacePermissionsRequest
    ): Future[DescribeNetworkInterfacePermissionsResult] =
      service.describeNetworkInterfacePermissions(params).promise().toFuture
    @inline def describeNetworkInterfacesFuture(
        params: DescribeNetworkInterfacesRequest
    ): Future[DescribeNetworkInterfacesResult] = service.describeNetworkInterfaces(params).promise().toFuture
    @inline def describePlacementGroupsFuture(
        params: DescribePlacementGroupsRequest
    ): Future[DescribePlacementGroupsResult] = service.describePlacementGroups(params).promise().toFuture
    @inline def describePrefixListsFuture(params: DescribePrefixListsRequest): Future[DescribePrefixListsResult] =
      service.describePrefixLists(params).promise().toFuture
    @inline def describePrincipalIdFormatFuture(
        params: DescribePrincipalIdFormatRequest
    ): Future[DescribePrincipalIdFormatResult] = service.describePrincipalIdFormat(params).promise().toFuture
    @inline def describePublicIpv4PoolsFuture(
        params: DescribePublicIpv4PoolsRequest
    ): Future[DescribePublicIpv4PoolsResult] = service.describePublicIpv4Pools(params).promise().toFuture
    @inline def describeRegionsFuture(params: DescribeRegionsRequest): Future[DescribeRegionsResult] =
      service.describeRegions(params).promise().toFuture
    @inline def describeReservedInstancesFuture(
        params: DescribeReservedInstancesRequest
    ): Future[DescribeReservedInstancesResult] = service.describeReservedInstances(params).promise().toFuture
    @inline def describeReservedInstancesListingsFuture(
        params: DescribeReservedInstancesListingsRequest
    ): Future[DescribeReservedInstancesListingsResult] =
      service.describeReservedInstancesListings(params).promise().toFuture
    @inline def describeReservedInstancesModificationsFuture(
        params: DescribeReservedInstancesModificationsRequest
    ): Future[DescribeReservedInstancesModificationsResult] =
      service.describeReservedInstancesModifications(params).promise().toFuture
    @inline def describeReservedInstancesOfferingsFuture(
        params: DescribeReservedInstancesOfferingsRequest
    ): Future[DescribeReservedInstancesOfferingsResult] =
      service.describeReservedInstancesOfferings(params).promise().toFuture
    @inline def describeRouteTablesFuture(params: DescribeRouteTablesRequest): Future[DescribeRouteTablesResult] =
      service.describeRouteTables(params).promise().toFuture
    @inline def describeScheduledInstanceAvailabilityFuture(
        params: DescribeScheduledInstanceAvailabilityRequest
    ): Future[DescribeScheduledInstanceAvailabilityResult] =
      service.describeScheduledInstanceAvailability(params).promise().toFuture
    @inline def describeScheduledInstancesFuture(
        params: DescribeScheduledInstancesRequest
    ): Future[DescribeScheduledInstancesResult] = service.describeScheduledInstances(params).promise().toFuture
    @inline def describeSecurityGroupReferencesFuture(
        params: DescribeSecurityGroupReferencesRequest
    ): Future[DescribeSecurityGroupReferencesResult] =
      service.describeSecurityGroupReferences(params).promise().toFuture
    @inline def describeSecurityGroupsFuture(
        params: DescribeSecurityGroupsRequest
    ): Future[DescribeSecurityGroupsResult] = service.describeSecurityGroups(params).promise().toFuture
    @inline def describeSnapshotAttributeFuture(
        params: DescribeSnapshotAttributeRequest
    ): Future[DescribeSnapshotAttributeResult] = service.describeSnapshotAttribute(params).promise().toFuture
    @inline def describeSnapshotsFuture(params: DescribeSnapshotsRequest): Future[DescribeSnapshotsResult] =
      service.describeSnapshots(params).promise().toFuture
    @inline def describeSpotDatafeedSubscriptionFuture(
        params: DescribeSpotDatafeedSubscriptionRequest
    ): Future[DescribeSpotDatafeedSubscriptionResult] =
      service.describeSpotDatafeedSubscription(params).promise().toFuture
    @inline def describeSpotFleetInstancesFuture(
        params: DescribeSpotFleetInstancesRequest
    ): Future[DescribeSpotFleetInstancesResponse] = service.describeSpotFleetInstances(params).promise().toFuture
    @inline def describeSpotFleetRequestHistoryFuture(
        params: DescribeSpotFleetRequestHistoryRequest
    ): Future[DescribeSpotFleetRequestHistoryResponse] =
      service.describeSpotFleetRequestHistory(params).promise().toFuture
    @inline def describeSpotFleetRequestsFuture(
        params: DescribeSpotFleetRequestsRequest
    ): Future[DescribeSpotFleetRequestsResponse] = service.describeSpotFleetRequests(params).promise().toFuture
    @inline def describeSpotInstanceRequestsFuture(
        params: DescribeSpotInstanceRequestsRequest
    ): Future[DescribeSpotInstanceRequestsResult] = service.describeSpotInstanceRequests(params).promise().toFuture
    @inline def describeSpotPriceHistoryFuture(
        params: DescribeSpotPriceHistoryRequest
    ): Future[DescribeSpotPriceHistoryResult] = service.describeSpotPriceHistory(params).promise().toFuture
    @inline def describeStaleSecurityGroupsFuture(
        params: DescribeStaleSecurityGroupsRequest
    ): Future[DescribeStaleSecurityGroupsResult] = service.describeStaleSecurityGroups(params).promise().toFuture
    @inline def describeSubnetsFuture(params: DescribeSubnetsRequest): Future[DescribeSubnetsResult] =
      service.describeSubnets(params).promise().toFuture
    @inline def describeTagsFuture(params: DescribeTagsRequest): Future[DescribeTagsResult] =
      service.describeTags(params).promise().toFuture
    @inline def describeTrafficMirrorFiltersFuture(
        params: DescribeTrafficMirrorFiltersRequest
    ): Future[DescribeTrafficMirrorFiltersResult] = service.describeTrafficMirrorFilters(params).promise().toFuture
    @inline def describeTrafficMirrorSessionsFuture(
        params: DescribeTrafficMirrorSessionsRequest
    ): Future[DescribeTrafficMirrorSessionsResult] = service.describeTrafficMirrorSessions(params).promise().toFuture
    @inline def describeTrafficMirrorTargetsFuture(
        params: DescribeTrafficMirrorTargetsRequest
    ): Future[DescribeTrafficMirrorTargetsResult] = service.describeTrafficMirrorTargets(params).promise().toFuture
    @inline def describeTransitGatewayAttachmentsFuture(
        params: DescribeTransitGatewayAttachmentsRequest
    ): Future[DescribeTransitGatewayAttachmentsResult] =
      service.describeTransitGatewayAttachments(params).promise().toFuture
    @inline def describeTransitGatewayMulticastDomainsFuture(
        params: DescribeTransitGatewayMulticastDomainsRequest
    ): Future[DescribeTransitGatewayMulticastDomainsResult] =
      service.describeTransitGatewayMulticastDomains(params).promise().toFuture
    @inline def describeTransitGatewayPeeringAttachmentsFuture(
        params: DescribeTransitGatewayPeeringAttachmentsRequest
    ): Future[DescribeTransitGatewayPeeringAttachmentsResult] =
      service.describeTransitGatewayPeeringAttachments(params).promise().toFuture
    @inline def describeTransitGatewayRouteTablesFuture(
        params: DescribeTransitGatewayRouteTablesRequest
    ): Future[DescribeTransitGatewayRouteTablesResult] =
      service.describeTransitGatewayRouteTables(params).promise().toFuture
    @inline def describeTransitGatewayVpcAttachmentsFuture(
        params: DescribeTransitGatewayVpcAttachmentsRequest
    ): Future[DescribeTransitGatewayVpcAttachmentsResult] =
      service.describeTransitGatewayVpcAttachments(params).promise().toFuture
    @inline def describeTransitGatewaysFuture(
        params: DescribeTransitGatewaysRequest
    ): Future[DescribeTransitGatewaysResult] = service.describeTransitGateways(params).promise().toFuture
    @inline def describeVolumeAttributeFuture(
        params: DescribeVolumeAttributeRequest
    ): Future[DescribeVolumeAttributeResult] = service.describeVolumeAttribute(params).promise().toFuture
    @inline def describeVolumeStatusFuture(params: DescribeVolumeStatusRequest): Future[DescribeVolumeStatusResult] =
      service.describeVolumeStatus(params).promise().toFuture
    @inline def describeVolumesFuture(params: DescribeVolumesRequest): Future[DescribeVolumesResult] =
      service.describeVolumes(params).promise().toFuture
    @inline def describeVolumesModificationsFuture(
        params: DescribeVolumesModificationsRequest
    ): Future[DescribeVolumesModificationsResult] = service.describeVolumesModifications(params).promise().toFuture
    @inline def describeVpcAttributeFuture(params: DescribeVpcAttributeRequest): Future[DescribeVpcAttributeResult] =
      service.describeVpcAttribute(params).promise().toFuture
    @inline def describeVpcClassicLinkDnsSupportFuture(
        params: DescribeVpcClassicLinkDnsSupportRequest
    ): Future[DescribeVpcClassicLinkDnsSupportResult] =
      service.describeVpcClassicLinkDnsSupport(params).promise().toFuture
    @inline def describeVpcClassicLinkFuture(
        params: DescribeVpcClassicLinkRequest
    ): Future[DescribeVpcClassicLinkResult] = service.describeVpcClassicLink(params).promise().toFuture
    @inline def describeVpcEndpointConnectionNotificationsFuture(
        params: DescribeVpcEndpointConnectionNotificationsRequest
    ): Future[DescribeVpcEndpointConnectionNotificationsResult] =
      service.describeVpcEndpointConnectionNotifications(params).promise().toFuture
    @inline def describeVpcEndpointConnectionsFuture(
        params: DescribeVpcEndpointConnectionsRequest
    ): Future[DescribeVpcEndpointConnectionsResult] = service.describeVpcEndpointConnections(params).promise().toFuture
    @inline def describeVpcEndpointServiceConfigurationsFuture(
        params: DescribeVpcEndpointServiceConfigurationsRequest
    ): Future[DescribeVpcEndpointServiceConfigurationsResult] =
      service.describeVpcEndpointServiceConfigurations(params).promise().toFuture
    @inline def describeVpcEndpointServicePermissionsFuture(
        params: DescribeVpcEndpointServicePermissionsRequest
    ): Future[DescribeVpcEndpointServicePermissionsResult] =
      service.describeVpcEndpointServicePermissions(params).promise().toFuture
    @inline def describeVpcEndpointServicesFuture(
        params: DescribeVpcEndpointServicesRequest
    ): Future[DescribeVpcEndpointServicesResult] = service.describeVpcEndpointServices(params).promise().toFuture
    @inline def describeVpcEndpointsFuture(params: DescribeVpcEndpointsRequest): Future[DescribeVpcEndpointsResult] =
      service.describeVpcEndpoints(params).promise().toFuture
    @inline def describeVpcPeeringConnectionsFuture(
        params: DescribeVpcPeeringConnectionsRequest
    ): Future[DescribeVpcPeeringConnectionsResult] = service.describeVpcPeeringConnections(params).promise().toFuture
    @inline def describeVpcsFuture(params: DescribeVpcsRequest): Future[DescribeVpcsResult] =
      service.describeVpcs(params).promise().toFuture
    @inline def describeVpnConnectionsFuture(
        params: DescribeVpnConnectionsRequest
    ): Future[DescribeVpnConnectionsResult] = service.describeVpnConnections(params).promise().toFuture
    @inline def describeVpnGatewaysFuture(params: DescribeVpnGatewaysRequest): Future[DescribeVpnGatewaysResult] =
      service.describeVpnGateways(params).promise().toFuture
    @inline def detachClassicLinkVpcFuture(params: DetachClassicLinkVpcRequest): Future[DetachClassicLinkVpcResult] =
      service.detachClassicLinkVpc(params).promise().toFuture
    @inline def detachInternetGatewayFuture(params: DetachInternetGatewayRequest): Future[js.Object] =
      service.detachInternetGateway(params).promise().toFuture
    @inline def detachNetworkInterfaceFuture(params: DetachNetworkInterfaceRequest): Future[js.Object] =
      service.detachNetworkInterface(params).promise().toFuture
    @inline def detachVolumeFuture(params: DetachVolumeRequest): Future[VolumeAttachment] =
      service.detachVolume(params).promise().toFuture
    @inline def detachVpnGatewayFuture(params: DetachVpnGatewayRequest): Future[js.Object] =
      service.detachVpnGateway(params).promise().toFuture
    @inline def disableEbsEncryptionByDefaultFuture(
        params: DisableEbsEncryptionByDefaultRequest
    ): Future[DisableEbsEncryptionByDefaultResult] = service.disableEbsEncryptionByDefault(params).promise().toFuture
    @inline def disableFastSnapshotRestoresFuture(
        params: DisableFastSnapshotRestoresRequest
    ): Future[DisableFastSnapshotRestoresResult] = service.disableFastSnapshotRestores(params).promise().toFuture
    @inline def disableTransitGatewayRouteTablePropagationFuture(
        params: DisableTransitGatewayRouteTablePropagationRequest
    ): Future[DisableTransitGatewayRouteTablePropagationResult] =
      service.disableTransitGatewayRouteTablePropagation(params).promise().toFuture
    @inline def disableVgwRoutePropagationFuture(params: DisableVgwRoutePropagationRequest): Future[js.Object] =
      service.disableVgwRoutePropagation(params).promise().toFuture
    @inline def disableVpcClassicLinkDnsSupportFuture(
        params: DisableVpcClassicLinkDnsSupportRequest
    ): Future[DisableVpcClassicLinkDnsSupportResult] =
      service.disableVpcClassicLinkDnsSupport(params).promise().toFuture
    @inline def disableVpcClassicLinkFuture(params: DisableVpcClassicLinkRequest): Future[DisableVpcClassicLinkResult] =
      service.disableVpcClassicLink(params).promise().toFuture
    @inline def disassociateAddressFuture(params: DisassociateAddressRequest): Future[js.Object] =
      service.disassociateAddress(params).promise().toFuture
    @inline def disassociateClientVpnTargetNetworkFuture(
        params: DisassociateClientVpnTargetNetworkRequest
    ): Future[DisassociateClientVpnTargetNetworkResult] =
      service.disassociateClientVpnTargetNetwork(params).promise().toFuture
    @inline def disassociateIamInstanceProfileFuture(
        params: DisassociateIamInstanceProfileRequest
    ): Future[DisassociateIamInstanceProfileResult] = service.disassociateIamInstanceProfile(params).promise().toFuture
    @inline def disassociateRouteTableFuture(params: DisassociateRouteTableRequest): Future[js.Object] =
      service.disassociateRouteTable(params).promise().toFuture
    @inline def disassociateSubnetCidrBlockFuture(
        params: DisassociateSubnetCidrBlockRequest
    ): Future[DisassociateSubnetCidrBlockResult] = service.disassociateSubnetCidrBlock(params).promise().toFuture
    @inline def disassociateTransitGatewayMulticastDomainFuture(
        params: DisassociateTransitGatewayMulticastDomainRequest
    ): Future[DisassociateTransitGatewayMulticastDomainResult] =
      service.disassociateTransitGatewayMulticastDomain(params).promise().toFuture
    @inline def disassociateTransitGatewayRouteTableFuture(
        params: DisassociateTransitGatewayRouteTableRequest
    ): Future[DisassociateTransitGatewayRouteTableResult] =
      service.disassociateTransitGatewayRouteTable(params).promise().toFuture
    @inline def disassociateVpcCidrBlockFuture(
        params: DisassociateVpcCidrBlockRequest
    ): Future[DisassociateVpcCidrBlockResult] = service.disassociateVpcCidrBlock(params).promise().toFuture
    @inline def enableEbsEncryptionByDefaultFuture(
        params: EnableEbsEncryptionByDefaultRequest
    ): Future[EnableEbsEncryptionByDefaultResult] = service.enableEbsEncryptionByDefault(params).promise().toFuture
    @inline def enableFastSnapshotRestoresFuture(
        params: EnableFastSnapshotRestoresRequest
    ): Future[EnableFastSnapshotRestoresResult] = service.enableFastSnapshotRestores(params).promise().toFuture
    @inline def enableTransitGatewayRouteTablePropagationFuture(
        params: EnableTransitGatewayRouteTablePropagationRequest
    ): Future[EnableTransitGatewayRouteTablePropagationResult] =
      service.enableTransitGatewayRouteTablePropagation(params).promise().toFuture
    @inline def enableVgwRoutePropagationFuture(params: EnableVgwRoutePropagationRequest): Future[js.Object] =
      service.enableVgwRoutePropagation(params).promise().toFuture
    @inline def enableVolumeIOFuture(params: EnableVolumeIORequest): Future[js.Object] =
      service.enableVolumeIO(params).promise().toFuture
    @inline def enableVpcClassicLinkDnsSupportFuture(
        params: EnableVpcClassicLinkDnsSupportRequest
    ): Future[EnableVpcClassicLinkDnsSupportResult] = service.enableVpcClassicLinkDnsSupport(params).promise().toFuture
    @inline def enableVpcClassicLinkFuture(params: EnableVpcClassicLinkRequest): Future[EnableVpcClassicLinkResult] =
      service.enableVpcClassicLink(params).promise().toFuture
    @inline def exportClientVpnClientCertificateRevocationListFuture(
        params: ExportClientVpnClientCertificateRevocationListRequest
    ): Future[ExportClientVpnClientCertificateRevocationListResult] =
      service.exportClientVpnClientCertificateRevocationList(params).promise().toFuture
    @inline def exportClientVpnClientConfigurationFuture(
        params: ExportClientVpnClientConfigurationRequest
    ): Future[ExportClientVpnClientConfigurationResult] =
      service.exportClientVpnClientConfiguration(params).promise().toFuture
    @inline def exportImageFuture(params: ExportImageRequest): Future[ExportImageResult] =
      service.exportImage(params).promise().toFuture
    @inline def exportTransitGatewayRoutesFuture(
        params: ExportTransitGatewayRoutesRequest
    ): Future[ExportTransitGatewayRoutesResult] = service.exportTransitGatewayRoutes(params).promise().toFuture
    @inline def getAssociatedIpv6PoolCidrsFuture(
        params: GetAssociatedIpv6PoolCidrsRequest
    ): Future[GetAssociatedIpv6PoolCidrsResult] = service.getAssociatedIpv6PoolCidrs(params).promise().toFuture
    @inline def getCapacityReservationUsageFuture(
        params: GetCapacityReservationUsageRequest
    ): Future[GetCapacityReservationUsageResult] = service.getCapacityReservationUsage(params).promise().toFuture
    @inline def getCoipPoolUsageFuture(params: GetCoipPoolUsageRequest): Future[GetCoipPoolUsageResult] =
      service.getCoipPoolUsage(params).promise().toFuture
    @inline def getConsoleOutputFuture(params: GetConsoleOutputRequest): Future[GetConsoleOutputResult] =
      service.getConsoleOutput(params).promise().toFuture
    @inline def getConsoleScreenshotFuture(params: GetConsoleScreenshotRequest): Future[GetConsoleScreenshotResult] =
      service.getConsoleScreenshot(params).promise().toFuture
    @inline def getDefaultCreditSpecificationFuture(
        params: GetDefaultCreditSpecificationRequest
    ): Future[GetDefaultCreditSpecificationResult] = service.getDefaultCreditSpecification(params).promise().toFuture
    @inline def getEbsDefaultKmsKeyIdFuture(params: GetEbsDefaultKmsKeyIdRequest): Future[GetEbsDefaultKmsKeyIdResult] =
      service.getEbsDefaultKmsKeyId(params).promise().toFuture
    @inline def getEbsEncryptionByDefaultFuture(
        params: GetEbsEncryptionByDefaultRequest
    ): Future[GetEbsEncryptionByDefaultResult] = service.getEbsEncryptionByDefault(params).promise().toFuture
    @inline def getHostReservationPurchasePreviewFuture(
        params: GetHostReservationPurchasePreviewRequest
    ): Future[GetHostReservationPurchasePreviewResult] =
      service.getHostReservationPurchasePreview(params).promise().toFuture
    @inline def getLaunchTemplateDataFuture(params: GetLaunchTemplateDataRequest): Future[GetLaunchTemplateDataResult] =
      service.getLaunchTemplateData(params).promise().toFuture
    @inline def getPasswordDataFuture(params: GetPasswordDataRequest): Future[GetPasswordDataResult] =
      service.getPasswordData(params).promise().toFuture
    @inline def getReservedInstancesExchangeQuoteFuture(
        params: GetReservedInstancesExchangeQuoteRequest
    ): Future[GetReservedInstancesExchangeQuoteResult] =
      service.getReservedInstancesExchangeQuote(params).promise().toFuture
    @inline def getTransitGatewayAttachmentPropagationsFuture(
        params: GetTransitGatewayAttachmentPropagationsRequest
    ): Future[GetTransitGatewayAttachmentPropagationsResult] =
      service.getTransitGatewayAttachmentPropagations(params).promise().toFuture
    @inline def getTransitGatewayMulticastDomainAssociationsFuture(
        params: GetTransitGatewayMulticastDomainAssociationsRequest
    ): Future[GetTransitGatewayMulticastDomainAssociationsResult] =
      service.getTransitGatewayMulticastDomainAssociations(params).promise().toFuture
    @inline def getTransitGatewayRouteTableAssociationsFuture(
        params: GetTransitGatewayRouteTableAssociationsRequest
    ): Future[GetTransitGatewayRouteTableAssociationsResult] =
      service.getTransitGatewayRouteTableAssociations(params).promise().toFuture
    @inline def getTransitGatewayRouteTablePropagationsFuture(
        params: GetTransitGatewayRouteTablePropagationsRequest
    ): Future[GetTransitGatewayRouteTablePropagationsResult] =
      service.getTransitGatewayRouteTablePropagations(params).promise().toFuture
    @inline def importClientVpnClientCertificateRevocationListFuture(
        params: ImportClientVpnClientCertificateRevocationListRequest
    ): Future[ImportClientVpnClientCertificateRevocationListResult] =
      service.importClientVpnClientCertificateRevocationList(params).promise().toFuture
    @inline def importImageFuture(params: ImportImageRequest): Future[ImportImageResult] =
      service.importImage(params).promise().toFuture
    @inline def importInstanceFuture(params: ImportInstanceRequest): Future[ImportInstanceResult] =
      service.importInstance(params).promise().toFuture
    @inline def importKeyPairFuture(params: ImportKeyPairRequest): Future[ImportKeyPairResult] =
      service.importKeyPair(params).promise().toFuture
    @inline def importSnapshotFuture(params: ImportSnapshotRequest): Future[ImportSnapshotResult] =
      service.importSnapshot(params).promise().toFuture
    @inline def importVolumeFuture(params: ImportVolumeRequest): Future[ImportVolumeResult] =
      service.importVolume(params).promise().toFuture
    @inline def modifyCapacityReservationFuture(
        params: ModifyCapacityReservationRequest
    ): Future[ModifyCapacityReservationResult] = service.modifyCapacityReservation(params).promise().toFuture
    @inline def modifyClientVpnEndpointFuture(
        params: ModifyClientVpnEndpointRequest
    ): Future[ModifyClientVpnEndpointResult] = service.modifyClientVpnEndpoint(params).promise().toFuture
    @inline def modifyDefaultCreditSpecificationFuture(
        params: ModifyDefaultCreditSpecificationRequest
    ): Future[ModifyDefaultCreditSpecificationResult] =
      service.modifyDefaultCreditSpecification(params).promise().toFuture
    @inline def modifyEbsDefaultKmsKeyIdFuture(
        params: ModifyEbsDefaultKmsKeyIdRequest
    ): Future[ModifyEbsDefaultKmsKeyIdResult] = service.modifyEbsDefaultKmsKeyId(params).promise().toFuture
    @inline def modifyFleetFuture(params: ModifyFleetRequest): Future[ModifyFleetResult] =
      service.modifyFleet(params).promise().toFuture
    @inline def modifyFpgaImageAttributeFuture(
        params: ModifyFpgaImageAttributeRequest
    ): Future[ModifyFpgaImageAttributeResult] = service.modifyFpgaImageAttribute(params).promise().toFuture
    @inline def modifyHostsFuture(params: ModifyHostsRequest): Future[ModifyHostsResult] =
      service.modifyHosts(params).promise().toFuture
    @inline def modifyIdFormatFuture(params: ModifyIdFormatRequest): Future[js.Object] =
      service.modifyIdFormat(params).promise().toFuture
    @inline def modifyIdentityIdFormatFuture(params: ModifyIdentityIdFormatRequest): Future[js.Object] =
      service.modifyIdentityIdFormat(params).promise().toFuture
    @inline def modifyImageAttributeFuture(params: ModifyImageAttributeRequest): Future[js.Object] =
      service.modifyImageAttribute(params).promise().toFuture
    @inline def modifyInstanceAttributeFuture(params: ModifyInstanceAttributeRequest): Future[js.Object] =
      service.modifyInstanceAttribute(params).promise().toFuture
    @inline def modifyInstanceCapacityReservationAttributesFuture(
        params: ModifyInstanceCapacityReservationAttributesRequest
    ): Future[ModifyInstanceCapacityReservationAttributesResult] =
      service.modifyInstanceCapacityReservationAttributes(params).promise().toFuture
    @inline def modifyInstanceCreditSpecificationFuture(
        params: ModifyInstanceCreditSpecificationRequest
    ): Future[ModifyInstanceCreditSpecificationResult] =
      service.modifyInstanceCreditSpecification(params).promise().toFuture
    @inline def modifyInstanceEventStartTimeFuture(
        params: ModifyInstanceEventStartTimeRequest
    ): Future[ModifyInstanceEventStartTimeResult] = service.modifyInstanceEventStartTime(params).promise().toFuture
    @inline def modifyInstanceMetadataOptionsFuture(
        params: ModifyInstanceMetadataOptionsRequest
    ): Future[ModifyInstanceMetadataOptionsResult] = service.modifyInstanceMetadataOptions(params).promise().toFuture
    @inline def modifyInstancePlacementFuture(
        params: ModifyInstancePlacementRequest
    ): Future[ModifyInstancePlacementResult] = service.modifyInstancePlacement(params).promise().toFuture
    @inline def modifyLaunchTemplateFuture(params: ModifyLaunchTemplateRequest): Future[ModifyLaunchTemplateResult] =
      service.modifyLaunchTemplate(params).promise().toFuture
    @inline def modifyNetworkInterfaceAttributeFuture(
        params: ModifyNetworkInterfaceAttributeRequest
    ): Future[js.Object] = service.modifyNetworkInterfaceAttribute(params).promise().toFuture
    @inline def modifyReservedInstancesFuture(
        params: ModifyReservedInstancesRequest
    ): Future[ModifyReservedInstancesResult] = service.modifyReservedInstances(params).promise().toFuture
    @inline def modifySnapshotAttributeFuture(params: ModifySnapshotAttributeRequest): Future[js.Object] =
      service.modifySnapshotAttribute(params).promise().toFuture
    @inline def modifySpotFleetRequestFuture(
        params: ModifySpotFleetRequestRequest
    ): Future[ModifySpotFleetRequestResponse] = service.modifySpotFleetRequest(params).promise().toFuture
    @inline def modifySubnetAttributeFuture(params: ModifySubnetAttributeRequest): Future[js.Object] =
      service.modifySubnetAttribute(params).promise().toFuture
    @inline def modifyTrafficMirrorFilterNetworkServicesFuture(
        params: ModifyTrafficMirrorFilterNetworkServicesRequest
    ): Future[ModifyTrafficMirrorFilterNetworkServicesResult] =
      service.modifyTrafficMirrorFilterNetworkServices(params).promise().toFuture
    @inline def modifyTrafficMirrorFilterRuleFuture(
        params: ModifyTrafficMirrorFilterRuleRequest
    ): Future[ModifyTrafficMirrorFilterRuleResult] = service.modifyTrafficMirrorFilterRule(params).promise().toFuture
    @inline def modifyTrafficMirrorSessionFuture(
        params: ModifyTrafficMirrorSessionRequest
    ): Future[ModifyTrafficMirrorSessionResult] = service.modifyTrafficMirrorSession(params).promise().toFuture
    @inline def modifyTransitGatewayVpcAttachmentFuture(
        params: ModifyTransitGatewayVpcAttachmentRequest
    ): Future[ModifyTransitGatewayVpcAttachmentResult] =
      service.modifyTransitGatewayVpcAttachment(params).promise().toFuture
    @inline def modifyVolumeAttributeFuture(params: ModifyVolumeAttributeRequest): Future[js.Object] =
      service.modifyVolumeAttribute(params).promise().toFuture
    @inline def modifyVolumeFuture(params: ModifyVolumeRequest): Future[ModifyVolumeResult] =
      service.modifyVolume(params).promise().toFuture
    @inline def modifyVpcAttributeFuture(params: ModifyVpcAttributeRequest): Future[js.Object] =
      service.modifyVpcAttribute(params).promise().toFuture
    @inline def modifyVpcEndpointConnectionNotificationFuture(
        params: ModifyVpcEndpointConnectionNotificationRequest
    ): Future[ModifyVpcEndpointConnectionNotificationResult] =
      service.modifyVpcEndpointConnectionNotification(params).promise().toFuture
    @inline def modifyVpcEndpointFuture(params: ModifyVpcEndpointRequest): Future[ModifyVpcEndpointResult] =
      service.modifyVpcEndpoint(params).promise().toFuture
    @inline def modifyVpcEndpointServiceConfigurationFuture(
        params: ModifyVpcEndpointServiceConfigurationRequest
    ): Future[ModifyVpcEndpointServiceConfigurationResult] =
      service.modifyVpcEndpointServiceConfiguration(params).promise().toFuture
    @inline def modifyVpcEndpointServicePermissionsFuture(
        params: ModifyVpcEndpointServicePermissionsRequest
    ): Future[ModifyVpcEndpointServicePermissionsResult] =
      service.modifyVpcEndpointServicePermissions(params).promise().toFuture
    @inline def modifyVpcPeeringConnectionOptionsFuture(
        params: ModifyVpcPeeringConnectionOptionsRequest
    ): Future[ModifyVpcPeeringConnectionOptionsResult] =
      service.modifyVpcPeeringConnectionOptions(params).promise().toFuture
    @inline def modifyVpcTenancyFuture(params: ModifyVpcTenancyRequest): Future[ModifyVpcTenancyResult] =
      service.modifyVpcTenancy(params).promise().toFuture
    @inline def modifyVpnConnectionFuture(params: ModifyVpnConnectionRequest): Future[ModifyVpnConnectionResult] =
      service.modifyVpnConnection(params).promise().toFuture
    @inline def modifyVpnTunnelCertificateFuture(
        params: ModifyVpnTunnelCertificateRequest
    ): Future[ModifyVpnTunnelCertificateResult] = service.modifyVpnTunnelCertificate(params).promise().toFuture
    @inline def modifyVpnTunnelOptionsFuture(
        params: ModifyVpnTunnelOptionsRequest
    ): Future[ModifyVpnTunnelOptionsResult] = service.modifyVpnTunnelOptions(params).promise().toFuture
    @inline def monitorInstancesFuture(params: MonitorInstancesRequest): Future[MonitorInstancesResult] =
      service.monitorInstances(params).promise().toFuture
    @inline def moveAddressToVpcFuture(params: MoveAddressToVpcRequest): Future[MoveAddressToVpcResult] =
      service.moveAddressToVpc(params).promise().toFuture
    @inline def provisionByoipCidrFuture(params: ProvisionByoipCidrRequest): Future[ProvisionByoipCidrResult] =
      service.provisionByoipCidr(params).promise().toFuture
    @inline def purchaseHostReservationFuture(
        params: PurchaseHostReservationRequest
    ): Future[PurchaseHostReservationResult] = service.purchaseHostReservation(params).promise().toFuture
    @inline def purchaseReservedInstancesOfferingFuture(
        params: PurchaseReservedInstancesOfferingRequest
    ): Future[PurchaseReservedInstancesOfferingResult] =
      service.purchaseReservedInstancesOffering(params).promise().toFuture
    @inline def purchaseScheduledInstancesFuture(
        params: PurchaseScheduledInstancesRequest
    ): Future[PurchaseScheduledInstancesResult] = service.purchaseScheduledInstances(params).promise().toFuture
    @inline def rebootInstancesFuture(params: RebootInstancesRequest): Future[js.Object] =
      service.rebootInstances(params).promise().toFuture
    @inline def registerImageFuture(params: RegisterImageRequest): Future[RegisterImageResult] =
      service.registerImage(params).promise().toFuture
    @inline def registerTransitGatewayMulticastGroupMembersFuture(
        params: RegisterTransitGatewayMulticastGroupMembersRequest
    ): Future[RegisterTransitGatewayMulticastGroupMembersResult] =
      service.registerTransitGatewayMulticastGroupMembers(params).promise().toFuture
    @inline def registerTransitGatewayMulticastGroupSourcesFuture(
        params: RegisterTransitGatewayMulticastGroupSourcesRequest
    ): Future[RegisterTransitGatewayMulticastGroupSourcesResult] =
      service.registerTransitGatewayMulticastGroupSources(params).promise().toFuture
    @inline def rejectTransitGatewayPeeringAttachmentFuture(
        params: RejectTransitGatewayPeeringAttachmentRequest
    ): Future[RejectTransitGatewayPeeringAttachmentResult] =
      service.rejectTransitGatewayPeeringAttachment(params).promise().toFuture
    @inline def rejectTransitGatewayVpcAttachmentFuture(
        params: RejectTransitGatewayVpcAttachmentRequest
    ): Future[RejectTransitGatewayVpcAttachmentResult] =
      service.rejectTransitGatewayVpcAttachment(params).promise().toFuture
    @inline def rejectVpcEndpointConnectionsFuture(
        params: RejectVpcEndpointConnectionsRequest
    ): Future[RejectVpcEndpointConnectionsResult] = service.rejectVpcEndpointConnections(params).promise().toFuture
    @inline def rejectVpcPeeringConnectionFuture(
        params: RejectVpcPeeringConnectionRequest
    ): Future[RejectVpcPeeringConnectionResult] = service.rejectVpcPeeringConnection(params).promise().toFuture
    @inline def releaseAddressFuture(params: ReleaseAddressRequest): Future[js.Object] =
      service.releaseAddress(params).promise().toFuture
    @inline def releaseHostsFuture(params: ReleaseHostsRequest): Future[ReleaseHostsResult] =
      service.releaseHosts(params).promise().toFuture
    @inline def replaceIamInstanceProfileAssociationFuture(
        params: ReplaceIamInstanceProfileAssociationRequest
    ): Future[ReplaceIamInstanceProfileAssociationResult] =
      service.replaceIamInstanceProfileAssociation(params).promise().toFuture
    @inline def replaceNetworkAclAssociationFuture(
        params: ReplaceNetworkAclAssociationRequest
    ): Future[ReplaceNetworkAclAssociationResult] = service.replaceNetworkAclAssociation(params).promise().toFuture
    @inline def replaceNetworkAclEntryFuture(params: ReplaceNetworkAclEntryRequest): Future[js.Object] =
      service.replaceNetworkAclEntry(params).promise().toFuture
    @inline def replaceRouteFuture(params: ReplaceRouteRequest): Future[js.Object] =
      service.replaceRoute(params).promise().toFuture
    @inline def replaceRouteTableAssociationFuture(
        params: ReplaceRouteTableAssociationRequest
    ): Future[ReplaceRouteTableAssociationResult] = service.replaceRouteTableAssociation(params).promise().toFuture
    @inline def replaceTransitGatewayRouteFuture(
        params: ReplaceTransitGatewayRouteRequest
    ): Future[ReplaceTransitGatewayRouteResult] = service.replaceTransitGatewayRoute(params).promise().toFuture
    @inline def reportInstanceStatusFuture(params: ReportInstanceStatusRequest): Future[js.Object] =
      service.reportInstanceStatus(params).promise().toFuture
    @inline def requestSpotFleetFuture(params: RequestSpotFleetRequest): Future[RequestSpotFleetResponse] =
      service.requestSpotFleet(params).promise().toFuture
    @inline def requestSpotInstancesFuture(params: RequestSpotInstancesRequest): Future[RequestSpotInstancesResult] =
      service.requestSpotInstances(params).promise().toFuture
    @inline def resetEbsDefaultKmsKeyIdFuture(
        params: ResetEbsDefaultKmsKeyIdRequest
    ): Future[ResetEbsDefaultKmsKeyIdResult] = service.resetEbsDefaultKmsKeyId(params).promise().toFuture
    @inline def resetFpgaImageAttributeFuture(
        params: ResetFpgaImageAttributeRequest
    ): Future[ResetFpgaImageAttributeResult] = service.resetFpgaImageAttribute(params).promise().toFuture
    @inline def resetImageAttributeFuture(params: ResetImageAttributeRequest): Future[js.Object] =
      service.resetImageAttribute(params).promise().toFuture
    @inline def resetInstanceAttributeFuture(params: ResetInstanceAttributeRequest): Future[js.Object] =
      service.resetInstanceAttribute(params).promise().toFuture
    @inline def resetNetworkInterfaceAttributeFuture(params: ResetNetworkInterfaceAttributeRequest): Future[js.Object] =
      service.resetNetworkInterfaceAttribute(params).promise().toFuture
    @inline def resetSnapshotAttributeFuture(params: ResetSnapshotAttributeRequest): Future[js.Object] =
      service.resetSnapshotAttribute(params).promise().toFuture
    @inline def restoreAddressToClassicFuture(
        params: RestoreAddressToClassicRequest
    ): Future[RestoreAddressToClassicResult] = service.restoreAddressToClassic(params).promise().toFuture
    @inline def revokeClientVpnIngressFuture(
        params: RevokeClientVpnIngressRequest
    ): Future[RevokeClientVpnIngressResult] = service.revokeClientVpnIngress(params).promise().toFuture
    @inline def revokeSecurityGroupEgressFuture(params: RevokeSecurityGroupEgressRequest): Future[js.Object] =
      service.revokeSecurityGroupEgress(params).promise().toFuture
    @inline def revokeSecurityGroupIngressFuture(params: RevokeSecurityGroupIngressRequest): Future[js.Object] =
      service.revokeSecurityGroupIngress(params).promise().toFuture
    @inline def runInstancesFuture(params: RunInstancesRequest): Future[Reservation] =
      service.runInstances(params).promise().toFuture
    @inline def runScheduledInstancesFuture(params: RunScheduledInstancesRequest): Future[RunScheduledInstancesResult] =
      service.runScheduledInstances(params).promise().toFuture
    @inline def searchLocalGatewayRoutesFuture(
        params: SearchLocalGatewayRoutesRequest
    ): Future[SearchLocalGatewayRoutesResult] = service.searchLocalGatewayRoutes(params).promise().toFuture
    @inline def searchTransitGatewayMulticastGroupsFuture(
        params: SearchTransitGatewayMulticastGroupsRequest
    ): Future[SearchTransitGatewayMulticastGroupsResult] =
      service.searchTransitGatewayMulticastGroups(params).promise().toFuture
    @inline def searchTransitGatewayRoutesFuture(
        params: SearchTransitGatewayRoutesRequest
    ): Future[SearchTransitGatewayRoutesResult] = service.searchTransitGatewayRoutes(params).promise().toFuture
    @inline def sendDiagnosticInterruptFuture(params: SendDiagnosticInterruptRequest): Future[js.Object] =
      service.sendDiagnosticInterrupt(params).promise().toFuture
    @inline def startInstancesFuture(params: StartInstancesRequest): Future[StartInstancesResult] =
      service.startInstances(params).promise().toFuture
    @inline def startVpcEndpointServicePrivateDnsVerificationFuture(
        params: StartVpcEndpointServicePrivateDnsVerificationRequest
    ): Future[StartVpcEndpointServicePrivateDnsVerificationResult] =
      service.startVpcEndpointServicePrivateDnsVerification(params).promise().toFuture
    @inline def stopInstancesFuture(params: StopInstancesRequest): Future[StopInstancesResult] =
      service.stopInstances(params).promise().toFuture
    @inline def terminateClientVpnConnectionsFuture(
        params: TerminateClientVpnConnectionsRequest
    ): Future[TerminateClientVpnConnectionsResult] = service.terminateClientVpnConnections(params).promise().toFuture
    @inline def terminateInstancesFuture(params: TerminateInstancesRequest): Future[TerminateInstancesResult] =
      service.terminateInstances(params).promise().toFuture
    @inline def unassignIpv6AddressesFuture(params: UnassignIpv6AddressesRequest): Future[UnassignIpv6AddressesResult] =
      service.unassignIpv6Addresses(params).promise().toFuture
    @inline def unassignPrivateIpAddressesFuture(params: UnassignPrivateIpAddressesRequest): Future[js.Object] =
      service.unassignPrivateIpAddresses(params).promise().toFuture
    @inline def unmonitorInstancesFuture(params: UnmonitorInstancesRequest): Future[UnmonitorInstancesResult] =
      service.unmonitorInstances(params).promise().toFuture
    @inline def updateSecurityGroupRuleDescriptionsEgressFuture(
        params: UpdateSecurityGroupRuleDescriptionsEgressRequest
    ): Future[UpdateSecurityGroupRuleDescriptionsEgressResult] =
      service.updateSecurityGroupRuleDescriptionsEgress(params).promise().toFuture
    @inline def updateSecurityGroupRuleDescriptionsIngressFuture(
        params: UpdateSecurityGroupRuleDescriptionsIngressRequest
    ): Future[UpdateSecurityGroupRuleDescriptionsIngressResult] =
      service.updateSecurityGroupRuleDescriptionsIngress(params).promise().toFuture
    @inline def withdrawByoipCidrFuture(params: WithdrawByoipCidrRequest): Future[WithdrawByoipCidrResult] =
      service.withdrawByoipCidr(params).promise().toFuture
  }
}

package ec2 {
  @js.native
  @JSImport("aws-sdk", "EC2")
  class EC2() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptReservedInstancesExchangeQuote(
        params: AcceptReservedInstancesExchangeQuoteRequest
    ): Request[AcceptReservedInstancesExchangeQuoteResult] = js.native
    def acceptTransitGatewayPeeringAttachment(
        params: AcceptTransitGatewayPeeringAttachmentRequest
    ): Request[AcceptTransitGatewayPeeringAttachmentResult] = js.native
    def acceptTransitGatewayVpcAttachment(
        params: AcceptTransitGatewayVpcAttachmentRequest
    ): Request[AcceptTransitGatewayVpcAttachmentResult] = js.native
    def acceptVpcEndpointConnections(
        params: AcceptVpcEndpointConnectionsRequest
    ): Request[AcceptVpcEndpointConnectionsResult] = js.native
    def acceptVpcPeeringConnection(
        params: AcceptVpcPeeringConnectionRequest
    ): Request[AcceptVpcPeeringConnectionResult]                                                 = js.native
    def advertiseByoipCidr(params: AdvertiseByoipCidrRequest): Request[AdvertiseByoipCidrResult] = js.native
    def allocateAddress(params: AllocateAddressRequest): Request[AllocateAddressResult]          = js.native
    def allocateHosts(params: AllocateHostsRequest): Request[AllocateHostsResult]                = js.native
    def applySecurityGroupsToClientVpnTargetNetwork(
        params: ApplySecurityGroupsToClientVpnTargetNetworkRequest
    ): Request[ApplySecurityGroupsToClientVpnTargetNetworkResult]                                   = js.native
    def assignIpv6Addresses(params: AssignIpv6AddressesRequest): Request[AssignIpv6AddressesResult] = js.native
    def assignPrivateIpAddresses(params: AssignPrivateIpAddressesRequest): Request[AssignPrivateIpAddressesResult] =
      js.native
    def associateAddress(params: AssociateAddressRequest): Request[AssociateAddressResult] = js.native
    def associateClientVpnTargetNetwork(
        params: AssociateClientVpnTargetNetworkRequest
    ): Request[AssociateClientVpnTargetNetworkResult]                                 = js.native
    def associateDhcpOptions(params: AssociateDhcpOptionsRequest): Request[js.Object] = js.native
    def associateIamInstanceProfile(
        params: AssociateIamInstanceProfileRequest
    ): Request[AssociateIamInstanceProfileResult]                                                   = js.native
    def associateRouteTable(params: AssociateRouteTableRequest): Request[AssociateRouteTableResult] = js.native
    def associateSubnetCidrBlock(params: AssociateSubnetCidrBlockRequest): Request[AssociateSubnetCidrBlockResult] =
      js.native
    def associateTransitGatewayMulticastDomain(
        params: AssociateTransitGatewayMulticastDomainRequest
    ): Request[AssociateTransitGatewayMulticastDomainResult] = js.native
    def associateTransitGatewayRouteTable(
        params: AssociateTransitGatewayRouteTableRequest
    ): Request[AssociateTransitGatewayRouteTableResult]                                                      = js.native
    def associateVpcCidrBlock(params: AssociateVpcCidrBlockRequest): Request[AssociateVpcCidrBlockResult]    = js.native
    def attachClassicLinkVpc(params: AttachClassicLinkVpcRequest): Request[AttachClassicLinkVpcResult]       = js.native
    def attachInternetGateway(params: AttachInternetGatewayRequest): Request[js.Object]                      = js.native
    def attachNetworkInterface(params: AttachNetworkInterfaceRequest): Request[AttachNetworkInterfaceResult] = js.native
    def attachVolume(params: AttachVolumeRequest): Request[VolumeAttachment]                                 = js.native
    def attachVpnGateway(params: AttachVpnGatewayRequest): Request[AttachVpnGatewayResult]                   = js.native
    def authorizeClientVpnIngress(params: AuthorizeClientVpnIngressRequest): Request[AuthorizeClientVpnIngressResult] =
      js.native
    def authorizeSecurityGroupEgress(params: AuthorizeSecurityGroupEgressRequest): Request[js.Object]   = js.native
    def authorizeSecurityGroupIngress(params: AuthorizeSecurityGroupIngressRequest): Request[js.Object] = js.native
    def bundleInstance(params: BundleInstanceRequest): Request[BundleInstanceResult]                    = js.native
    def cancelBundleTask(params: CancelBundleTaskRequest): Request[CancelBundleTaskResult]              = js.native
    def cancelCapacityReservation(params: CancelCapacityReservationRequest): Request[CancelCapacityReservationResult] =
      js.native
    def cancelConversionTask(params: CancelConversionRequest): Request[js.Object]          = js.native
    def cancelExportTask(params: CancelExportTaskRequest): Request[js.Object]              = js.native
    def cancelImportTask(params: CancelImportTaskRequest): Request[CancelImportTaskResult] = js.native
    def cancelReservedInstancesListing(
        params: CancelReservedInstancesListingRequest
    ): Request[CancelReservedInstancesListingResult] = js.native
    def cancelSpotFleetRequests(params: CancelSpotFleetRequestsRequest): Request[CancelSpotFleetRequestsResponse] =
      js.native
    def cancelSpotInstanceRequests(
        params: CancelSpotInstanceRequestsRequest
    ): Request[CancelSpotInstanceRequestsResult]                                                             = js.native
    def confirmProductInstance(params: ConfirmProductInstanceRequest): Request[ConfirmProductInstanceResult] = js.native
    def copyFpgaImage(params: CopyFpgaImageRequest): Request[CopyFpgaImageResult]                            = js.native
    def copyImage(params: CopyImageRequest): Request[CopyImageResult]                                        = js.native
    def copySnapshot(params: CopySnapshotRequest): Request[CopySnapshotResult]                               = js.native
    def createCapacityReservation(params: CreateCapacityReservationRequest): Request[CreateCapacityReservationResult] =
      js.native
    def createClientVpnEndpoint(params: CreateClientVpnEndpointRequest): Request[CreateClientVpnEndpointResult] =
      js.native
    def createClientVpnRoute(params: CreateClientVpnRouteRequest): Request[CreateClientVpnRouteResult]    = js.native
    def createCustomerGateway(params: CreateCustomerGatewayRequest): Request[CreateCustomerGatewayResult] = js.native
    def createDefaultSubnet(params: CreateDefaultSubnetRequest): Request[CreateDefaultSubnetResult]       = js.native
    def createDefaultVpc(params: CreateDefaultVpcRequest): Request[CreateDefaultVpcResult]                = js.native
    def createDhcpOptions(params: CreateDhcpOptionsRequest): Request[CreateDhcpOptionsResult]             = js.native
    def createEgressOnlyInternetGateway(
        params: CreateEgressOnlyInternetGatewayRequest
    ): Request[CreateEgressOnlyInternetGatewayResult]                                   = js.native
    def createFleet(params: CreateFleetRequest): Request[CreateFleetResult]             = js.native
    def createFlowLogs(params: CreateFlowLogsRequest): Request[CreateFlowLogsResult]    = js.native
    def createFpgaImage(params: CreateFpgaImageRequest): Request[CreateFpgaImageResult] = js.native
    def createImage(params: CreateImageRequest): Request[CreateImageResult]             = js.native
    def createInstanceExportTask(params: CreateInstanceExportTaskRequest): Request[CreateInstanceExportTaskResult] =
      js.native
    def createInternetGateway(params: CreateInternetGatewayRequest): Request[CreateInternetGatewayResult] = js.native
    def createKeyPair(params: CreateKeyPairRequest): Request[KeyPair]                                     = js.native
    def createLaunchTemplate(params: CreateLaunchTemplateRequest): Request[CreateLaunchTemplateResult]    = js.native
    def createLaunchTemplateVersion(
        params: CreateLaunchTemplateVersionRequest
    ): Request[CreateLaunchTemplateVersionResult] = js.native
    def createLocalGatewayRoute(params: CreateLocalGatewayRouteRequest): Request[CreateLocalGatewayRouteResult] =
      js.native
    def createLocalGatewayRouteTableVpcAssociation(
        params: CreateLocalGatewayRouteTableVpcAssociationRequest
    ): Request[CreateLocalGatewayRouteTableVpcAssociationResult]                                             = js.native
    def createNatGateway(params: CreateNatGatewayRequest): Request[CreateNatGatewayResult]                   = js.native
    def createNetworkAcl(params: CreateNetworkAclRequest): Request[CreateNetworkAclResult]                   = js.native
    def createNetworkAclEntry(params: CreateNetworkAclEntryRequest): Request[js.Object]                      = js.native
    def createNetworkInterface(params: CreateNetworkInterfaceRequest): Request[CreateNetworkInterfaceResult] = js.native
    def createNetworkInterfacePermission(
        params: CreateNetworkInterfacePermissionRequest
    ): Request[CreateNetworkInterfacePermissionResult]                                = js.native
    def createPlacementGroup(params: CreatePlacementGroupRequest): Request[js.Object] = js.native
    def createReservedInstancesListing(
        params: CreateReservedInstancesListingRequest
    ): Request[CreateReservedInstancesListingResult]                                                = js.native
    def createRoute(params: CreateRouteRequest): Request[CreateRouteResult]                         = js.native
    def createRouteTable(params: CreateRouteTableRequest): Request[CreateRouteTableResult]          = js.native
    def createSecurityGroup(params: CreateSecurityGroupRequest): Request[CreateSecurityGroupResult] = js.native
    def createSnapshot(params: CreateSnapshotRequest): Request[Snapshot]                            = js.native
    def createSnapshots(params: CreateSnapshotsRequest): Request[CreateSnapshotsResult]             = js.native
    def createSpotDatafeedSubscription(
        params: CreateSpotDatafeedSubscriptionRequest
    ): Request[CreateSpotDatafeedSubscriptionResult]                           = js.native
    def createSubnet(params: CreateSubnetRequest): Request[CreateSubnetResult] = js.native
    def createTags(params: CreateTagsRequest): Request[js.Object]              = js.native
    def createTrafficMirrorFilter(params: CreateTrafficMirrorFilterRequest): Request[CreateTrafficMirrorFilterResult] =
      js.native
    def createTrafficMirrorFilterRule(
        params: CreateTrafficMirrorFilterRuleRequest
    ): Request[CreateTrafficMirrorFilterRuleResult] = js.native
    def createTrafficMirrorSession(
        params: CreateTrafficMirrorSessionRequest
    ): Request[CreateTrafficMirrorSessionResult] = js.native
    def createTrafficMirrorTarget(params: CreateTrafficMirrorTargetRequest): Request[CreateTrafficMirrorTargetResult] =
      js.native
    def createTransitGateway(params: CreateTransitGatewayRequest): Request[CreateTransitGatewayResult] = js.native
    def createTransitGatewayMulticastDomain(
        params: CreateTransitGatewayMulticastDomainRequest
    ): Request[CreateTransitGatewayMulticastDomainResult] = js.native
    def createTransitGatewayPeeringAttachment(
        params: CreateTransitGatewayPeeringAttachmentRequest
    ): Request[CreateTransitGatewayPeeringAttachmentResult] = js.native
    def createTransitGatewayRoute(params: CreateTransitGatewayRouteRequest): Request[CreateTransitGatewayRouteResult] =
      js.native
    def createTransitGatewayRouteTable(
        params: CreateTransitGatewayRouteTableRequest
    ): Request[CreateTransitGatewayRouteTableResult] = js.native
    def createTransitGatewayVpcAttachment(
        params: CreateTransitGatewayVpcAttachmentRequest
    ): Request[CreateTransitGatewayVpcAttachmentResult]                                       = js.native
    def createVolume(params: CreateVolumeRequest): Request[Volume]                            = js.native
    def createVpc(params: CreateVpcRequest): Request[CreateVpcResult]                         = js.native
    def createVpcEndpoint(params: CreateVpcEndpointRequest): Request[CreateVpcEndpointResult] = js.native
    def createVpcEndpointConnectionNotification(
        params: CreateVpcEndpointConnectionNotificationRequest
    ): Request[CreateVpcEndpointConnectionNotificationResult] = js.native
    def createVpcEndpointServiceConfiguration(
        params: CreateVpcEndpointServiceConfigurationRequest
    ): Request[CreateVpcEndpointServiceConfigurationResult] = js.native
    def createVpcPeeringConnection(
        params: CreateVpcPeeringConnectionRequest
    ): Request[CreateVpcPeeringConnectionResult]                                                    = js.native
    def createVpnConnection(params: CreateVpnConnectionRequest): Request[CreateVpnConnectionResult] = js.native
    def createVpnConnectionRoute(params: CreateVpnConnectionRouteRequest): Request[js.Object]       = js.native
    def createVpnGateway(params: CreateVpnGatewayRequest): Request[CreateVpnGatewayResult]          = js.native
    def deleteClientVpnEndpoint(params: DeleteClientVpnEndpointRequest): Request[DeleteClientVpnEndpointResult] =
      js.native
    def deleteClientVpnRoute(params: DeleteClientVpnRouteRequest): Request[DeleteClientVpnRouteResult] = js.native
    def deleteCustomerGateway(params: DeleteCustomerGatewayRequest): Request[js.Object]                = js.native
    def deleteDhcpOptions(params: DeleteDhcpOptionsRequest): Request[js.Object]                        = js.native
    def deleteEgressOnlyInternetGateway(
        params: DeleteEgressOnlyInternetGatewayRequest
    ): Request[DeleteEgressOnlyInternetGatewayResult]                                                  = js.native
    def deleteFleets(params: DeleteFleetsRequest): Request[DeleteFleetsResult]                         = js.native
    def deleteFlowLogs(params: DeleteFlowLogsRequest): Request[DeleteFlowLogsResult]                   = js.native
    def deleteFpgaImage(params: DeleteFpgaImageRequest): Request[DeleteFpgaImageResult]                = js.native
    def deleteInternetGateway(params: DeleteInternetGatewayRequest): Request[js.Object]                = js.native
    def deleteKeyPair(params: DeleteKeyPairRequest): Request[js.Object]                                = js.native
    def deleteLaunchTemplate(params: DeleteLaunchTemplateRequest): Request[DeleteLaunchTemplateResult] = js.native
    def deleteLaunchTemplateVersions(
        params: DeleteLaunchTemplateVersionsRequest
    ): Request[DeleteLaunchTemplateVersionsResult] = js.native
    def deleteLocalGatewayRoute(params: DeleteLocalGatewayRouteRequest): Request[DeleteLocalGatewayRouteResult] =
      js.native
    def deleteLocalGatewayRouteTableVpcAssociation(
        params: DeleteLocalGatewayRouteTableVpcAssociationRequest
    ): Request[DeleteLocalGatewayRouteTableVpcAssociationResult]                           = js.native
    def deleteNatGateway(params: DeleteNatGatewayRequest): Request[DeleteNatGatewayResult] = js.native
    def deleteNetworkAcl(params: DeleteNetworkAclRequest): Request[js.Object]              = js.native
    def deleteNetworkAclEntry(params: DeleteNetworkAclEntryRequest): Request[js.Object]    = js.native
    def deleteNetworkInterface(params: DeleteNetworkInterfaceRequest): Request[js.Object]  = js.native
    def deleteNetworkInterfacePermission(
        params: DeleteNetworkInterfacePermissionRequest
    ): Request[DeleteNetworkInterfacePermissionResult]                                = js.native
    def deletePlacementGroup(params: DeletePlacementGroupRequest): Request[js.Object] = js.native
    def deleteQueuedReservedInstances(
        params: DeleteQueuedReservedInstancesRequest
    ): Request[DeleteQueuedReservedInstancesResult]                                                       = js.native
    def deleteRoute(params: DeleteRouteRequest): Request[js.Object]                                       = js.native
    def deleteRouteTable(params: DeleteRouteTableRequest): Request[js.Object]                             = js.native
    def deleteSecurityGroup(params: DeleteSecurityGroupRequest): Request[js.Object]                       = js.native
    def deleteSnapshot(params: DeleteSnapshotRequest): Request[js.Object]                                 = js.native
    def deleteSpotDatafeedSubscription(params: DeleteSpotDatafeedSubscriptionRequest): Request[js.Object] = js.native
    def deleteSubnet(params: DeleteSubnetRequest): Request[js.Object]                                     = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object]                                         = js.native
    def deleteTrafficMirrorFilter(params: DeleteTrafficMirrorFilterRequest): Request[DeleteTrafficMirrorFilterResult] =
      js.native
    def deleteTrafficMirrorFilterRule(
        params: DeleteTrafficMirrorFilterRuleRequest
    ): Request[DeleteTrafficMirrorFilterRuleResult] = js.native
    def deleteTrafficMirrorSession(
        params: DeleteTrafficMirrorSessionRequest
    ): Request[DeleteTrafficMirrorSessionResult] = js.native
    def deleteTrafficMirrorTarget(params: DeleteTrafficMirrorTargetRequest): Request[DeleteTrafficMirrorTargetResult] =
      js.native
    def deleteTransitGateway(params: DeleteTransitGatewayRequest): Request[DeleteTransitGatewayResult] = js.native
    def deleteTransitGatewayMulticastDomain(
        params: DeleteTransitGatewayMulticastDomainRequest
    ): Request[DeleteTransitGatewayMulticastDomainResult] = js.native
    def deleteTransitGatewayPeeringAttachment(
        params: DeleteTransitGatewayPeeringAttachmentRequest
    ): Request[DeleteTransitGatewayPeeringAttachmentResult] = js.native
    def deleteTransitGatewayRoute(params: DeleteTransitGatewayRouteRequest): Request[DeleteTransitGatewayRouteResult] =
      js.native
    def deleteTransitGatewayRouteTable(
        params: DeleteTransitGatewayRouteTableRequest
    ): Request[DeleteTransitGatewayRouteTableResult] = js.native
    def deleteTransitGatewayVpcAttachment(
        params: DeleteTransitGatewayVpcAttachmentRequest
    ): Request[DeleteTransitGatewayVpcAttachmentResult]               = js.native
    def deleteVolume(params: DeleteVolumeRequest): Request[js.Object] = js.native
    def deleteVpc(params: DeleteVpcRequest): Request[js.Object]       = js.native
    def deleteVpcEndpointConnectionNotifications(
        params: DeleteVpcEndpointConnectionNotificationsRequest
    ): Request[DeleteVpcEndpointConnectionNotificationsResult] = js.native
    def deleteVpcEndpointServiceConfigurations(
        params: DeleteVpcEndpointServiceConfigurationsRequest
    ): Request[DeleteVpcEndpointServiceConfigurationsResult]                                     = js.native
    def deleteVpcEndpoints(params: DeleteVpcEndpointsRequest): Request[DeleteVpcEndpointsResult] = js.native
    def deleteVpcPeeringConnection(
        params: DeleteVpcPeeringConnectionRequest
    ): Request[DeleteVpcPeeringConnectionResult]                                                       = js.native
    def deleteVpnConnection(params: DeleteVpnConnectionRequest): Request[js.Object]                    = js.native
    def deleteVpnConnectionRoute(params: DeleteVpnConnectionRouteRequest): Request[js.Object]          = js.native
    def deleteVpnGateway(params: DeleteVpnGatewayRequest): Request[js.Object]                          = js.native
    def deprovisionByoipCidr(params: DeprovisionByoipCidrRequest): Request[DeprovisionByoipCidrResult] = js.native
    def deregisterImage(params: DeregisterImageRequest): Request[js.Object]                            = js.native
    def deregisterTransitGatewayMulticastGroupMembers(
        params: DeregisterTransitGatewayMulticastGroupMembersRequest
    ): Request[DeregisterTransitGatewayMulticastGroupMembersResult] = js.native
    def deregisterTransitGatewayMulticastGroupSources(
        params: DeregisterTransitGatewayMulticastGroupSourcesRequest
    ): Request[DeregisterTransitGatewayMulticastGroupSourcesResult] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesRequest): Request[DescribeAccountAttributesResult] =
      js.native
    def describeAddresses(params: DescribeAddressesRequest): Request[DescribeAddressesResult] = js.native
    def describeAggregateIdFormat(params: DescribeAggregateIdFormatRequest): Request[DescribeAggregateIdFormatResult] =
      js.native
    def describeAvailabilityZones(params: DescribeAvailabilityZonesRequest): Request[DescribeAvailabilityZonesResult] =
      js.native
    def describeBundleTasks(params: DescribeBundleTasksRequest): Request[DescribeBundleTasksResult] = js.native
    def describeByoipCidrs(params: DescribeByoipCidrsRequest): Request[DescribeByoipCidrsResult]    = js.native
    def describeCapacityReservations(
        params: DescribeCapacityReservationsRequest
    ): Request[DescribeCapacityReservationsResult] = js.native
    def describeClassicLinkInstances(
        params: DescribeClassicLinkInstancesRequest
    ): Request[DescribeClassicLinkInstancesResult] = js.native
    def describeClientVpnAuthorizationRules(
        params: DescribeClientVpnAuthorizationRulesRequest
    ): Request[DescribeClientVpnAuthorizationRulesResult] = js.native
    def describeClientVpnConnections(
        params: DescribeClientVpnConnectionsRequest
    ): Request[DescribeClientVpnConnectionsResult] = js.native
    def describeClientVpnEndpoints(
        params: DescribeClientVpnEndpointsRequest
    ): Request[DescribeClientVpnEndpointsResult] = js.native
    def describeClientVpnRoutes(params: DescribeClientVpnRoutesRequest): Request[DescribeClientVpnRoutesResult] =
      js.native
    def describeClientVpnTargetNetworks(
        params: DescribeClientVpnTargetNetworksRequest
    ): Request[DescribeClientVpnTargetNetworksResult]                                         = js.native
    def describeCoipPools(params: DescribeCoipPoolsRequest): Request[DescribeCoipPoolsResult] = js.native
    def describeConversionTasks(params: DescribeConversionTasksRequest): Request[DescribeConversionTasksResult] =
      js.native
    def describeCustomerGateways(params: DescribeCustomerGatewaysRequest): Request[DescribeCustomerGatewaysResult] =
      js.native
    def describeDhcpOptions(params: DescribeDhcpOptionsRequest): Request[DescribeDhcpOptionsResult] = js.native
    def describeEgressOnlyInternetGateways(
        params: DescribeEgressOnlyInternetGatewaysRequest
    ): Request[DescribeEgressOnlyInternetGatewaysResult]                                            = js.native
    def describeElasticGpus(params: DescribeElasticGpusRequest): Request[DescribeElasticGpusResult] = js.native
    def describeExportImageTasks(params: DescribeExportImageTasksRequest): Request[DescribeExportImageTasksResult] =
      js.native
    def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResult] = js.native
    def describeFastSnapshotRestores(
        params: DescribeFastSnapshotRestoresRequest
    ): Request[DescribeFastSnapshotRestoresResult]                                                           = js.native
    def describeFleetHistory(params: DescribeFleetHistoryRequest): Request[DescribeFleetHistoryResult]       = js.native
    def describeFleetInstances(params: DescribeFleetInstancesRequest): Request[DescribeFleetInstancesResult] = js.native
    def describeFleets(params: DescribeFleetsRequest): Request[DescribeFleetsResult]                         = js.native
    def describeFlowLogs(params: DescribeFlowLogsRequest): Request[DescribeFlowLogsResult]                   = js.native
    def describeFpgaImageAttribute(
        params: DescribeFpgaImageAttributeRequest
    ): Request[DescribeFpgaImageAttributeResult]                                                 = js.native
    def describeFpgaImages(params: DescribeFpgaImagesRequest): Request[DescribeFpgaImagesResult] = js.native
    def describeHostReservationOfferings(
        params: DescribeHostReservationOfferingsRequest
    ): Request[DescribeHostReservationOfferingsResult] = js.native
    def describeHostReservations(params: DescribeHostReservationsRequest): Request[DescribeHostReservationsResult] =
      js.native
    def describeHosts(params: DescribeHostsRequest): Request[DescribeHostsResult] = js.native
    def describeIamInstanceProfileAssociations(
        params: DescribeIamInstanceProfileAssociationsRequest
    ): Request[DescribeIamInstanceProfileAssociationsResult]                               = js.native
    def describeIdFormat(params: DescribeIdFormatRequest): Request[DescribeIdFormatResult] = js.native
    def describeIdentityIdFormat(params: DescribeIdentityIdFormatRequest): Request[DescribeIdentityIdFormatResult] =
      js.native
    def describeImageAttribute(params: DescribeImageAttributeRequest): Request[ImageAttribute] = js.native
    def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResult]           = js.native
    def describeImportImageTasks(params: DescribeImportImageTasksRequest): Request[DescribeImportImageTasksResult] =
      js.native
    def describeImportSnapshotTasks(
        params: DescribeImportSnapshotTasksRequest
    ): Request[DescribeImportSnapshotTasksResult]                                                       = js.native
    def describeInstanceAttribute(params: DescribeInstanceAttributeRequest): Request[InstanceAttribute] = js.native
    def describeInstanceCreditSpecifications(
        params: DescribeInstanceCreditSpecificationsRequest
    ): Request[DescribeInstanceCreditSpecificationsResult]                                                   = js.native
    def describeInstanceStatus(params: DescribeInstanceStatusRequest): Request[DescribeInstanceStatusResult] = js.native
    def describeInstanceTypeOfferings(
        params: DescribeInstanceTypeOfferingsRequest
    ): Request[DescribeInstanceTypeOfferingsResult]                                                       = js.native
    def describeInstanceTypes(params: DescribeInstanceTypesRequest): Request[DescribeInstanceTypesResult] = js.native
    def describeInstances(params: DescribeInstancesRequest): Request[DescribeInstancesResult]             = js.native
    def describeInternetGateways(params: DescribeInternetGatewaysRequest): Request[DescribeInternetGatewaysResult] =
      js.native
    def describeIpv6Pools(params: DescribeIpv6PoolsRequest): Request[DescribeIpv6PoolsResult] = js.native
    def describeKeyPairs(params: DescribeKeyPairsRequest): Request[DescribeKeyPairsResult]    = js.native
    def describeLaunchTemplateVersions(
        params: DescribeLaunchTemplateVersionsRequest
    ): Request[DescribeLaunchTemplateVersionsResult] = js.native
    def describeLaunchTemplates(params: DescribeLaunchTemplatesRequest): Request[DescribeLaunchTemplatesResult] =
      js.native
    def describeLocalGatewayRouteTableVirtualInterfaceGroupAssociations(
        params: DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
    ): Request[DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult] = js.native
    def describeLocalGatewayRouteTableVpcAssociations(
        params: DescribeLocalGatewayRouteTableVpcAssociationsRequest
    ): Request[DescribeLocalGatewayRouteTableVpcAssociationsResult] = js.native
    def describeLocalGatewayRouteTables(
        params: DescribeLocalGatewayRouteTablesRequest
    ): Request[DescribeLocalGatewayRouteTablesResult] = js.native
    def describeLocalGatewayVirtualInterfaceGroups(
        params: DescribeLocalGatewayVirtualInterfaceGroupsRequest
    ): Request[DescribeLocalGatewayVirtualInterfaceGroupsResult] = js.native
    def describeLocalGatewayVirtualInterfaces(
        params: DescribeLocalGatewayVirtualInterfacesRequest
    ): Request[DescribeLocalGatewayVirtualInterfacesResult]                                               = js.native
    def describeLocalGateways(params: DescribeLocalGatewaysRequest): Request[DescribeLocalGatewaysResult] = js.native
    def describeMovingAddresses(params: DescribeMovingAddressesRequest): Request[DescribeMovingAddressesResult] =
      js.native
    def describeNatGateways(params: DescribeNatGatewaysRequest): Request[DescribeNatGatewaysResult] = js.native
    def describeNetworkAcls(params: DescribeNetworkAclsRequest): Request[DescribeNetworkAclsResult] = js.native
    def describeNetworkInterfaceAttribute(
        params: DescribeNetworkInterfaceAttributeRequest
    ): Request[DescribeNetworkInterfaceAttributeResult] = js.native
    def describeNetworkInterfacePermissions(
        params: DescribeNetworkInterfacePermissionsRequest
    ): Request[DescribeNetworkInterfacePermissionsResult] = js.native
    def describeNetworkInterfaces(params: DescribeNetworkInterfacesRequest): Request[DescribeNetworkInterfacesResult] =
      js.native
    def describePlacementGroups(params: DescribePlacementGroupsRequest): Request[DescribePlacementGroupsResult] =
      js.native
    def describePrefixLists(params: DescribePrefixListsRequest): Request[DescribePrefixListsResult] = js.native
    def describePrincipalIdFormat(params: DescribePrincipalIdFormatRequest): Request[DescribePrincipalIdFormatResult] =
      js.native
    def describePublicIpv4Pools(params: DescribePublicIpv4PoolsRequest): Request[DescribePublicIpv4PoolsResult] =
      js.native
    def describeRegions(params: DescribeRegionsRequest): Request[DescribeRegionsResult] = js.native
    def describeReservedInstances(params: DescribeReservedInstancesRequest): Request[DescribeReservedInstancesResult] =
      js.native
    def describeReservedInstancesListings(
        params: DescribeReservedInstancesListingsRequest
    ): Request[DescribeReservedInstancesListingsResult] = js.native
    def describeReservedInstancesModifications(
        params: DescribeReservedInstancesModificationsRequest
    ): Request[DescribeReservedInstancesModificationsResult] = js.native
    def describeReservedInstancesOfferings(
        params: DescribeReservedInstancesOfferingsRequest
    ): Request[DescribeReservedInstancesOfferingsResult]                                            = js.native
    def describeRouteTables(params: DescribeRouteTablesRequest): Request[DescribeRouteTablesResult] = js.native
    def describeScheduledInstanceAvailability(
        params: DescribeScheduledInstanceAvailabilityRequest
    ): Request[DescribeScheduledInstanceAvailabilityResult] = js.native
    def describeScheduledInstances(
        params: DescribeScheduledInstancesRequest
    ): Request[DescribeScheduledInstancesResult] = js.native
    def describeSecurityGroupReferences(
        params: DescribeSecurityGroupReferencesRequest
    ): Request[DescribeSecurityGroupReferencesResult]                                                        = js.native
    def describeSecurityGroups(params: DescribeSecurityGroupsRequest): Request[DescribeSecurityGroupsResult] = js.native
    def describeSnapshotAttribute(params: DescribeSnapshotAttributeRequest): Request[DescribeSnapshotAttributeResult] =
      js.native
    def describeSnapshots(params: DescribeSnapshotsRequest): Request[DescribeSnapshotsResult] = js.native
    def describeSpotDatafeedSubscription(
        params: DescribeSpotDatafeedSubscriptionRequest
    ): Request[DescribeSpotDatafeedSubscriptionResult] = js.native
    def describeSpotFleetInstances(
        params: DescribeSpotFleetInstancesRequest
    ): Request[DescribeSpotFleetInstancesResponse] = js.native
    def describeSpotFleetRequestHistory(
        params: DescribeSpotFleetRequestHistoryRequest
    ): Request[DescribeSpotFleetRequestHistoryResponse] = js.native
    def describeSpotFleetRequests(
        params: DescribeSpotFleetRequestsRequest
    ): Request[DescribeSpotFleetRequestsResponse] = js.native
    def describeSpotInstanceRequests(
        params: DescribeSpotInstanceRequestsRequest
    ): Request[DescribeSpotInstanceRequestsResult] = js.native
    def describeSpotPriceHistory(params: DescribeSpotPriceHistoryRequest): Request[DescribeSpotPriceHistoryResult] =
      js.native
    def describeStaleSecurityGroups(
        params: DescribeStaleSecurityGroupsRequest
    ): Request[DescribeStaleSecurityGroupsResult]                                       = js.native
    def describeSubnets(params: DescribeSubnetsRequest): Request[DescribeSubnetsResult] = js.native
    def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult]          = js.native
    def describeTrafficMirrorFilters(
        params: DescribeTrafficMirrorFiltersRequest
    ): Request[DescribeTrafficMirrorFiltersResult] = js.native
    def describeTrafficMirrorSessions(
        params: DescribeTrafficMirrorSessionsRequest
    ): Request[DescribeTrafficMirrorSessionsResult] = js.native
    def describeTrafficMirrorTargets(
        params: DescribeTrafficMirrorTargetsRequest
    ): Request[DescribeTrafficMirrorTargetsResult] = js.native
    def describeTransitGatewayAttachments(
        params: DescribeTransitGatewayAttachmentsRequest
    ): Request[DescribeTransitGatewayAttachmentsResult] = js.native
    def describeTransitGatewayMulticastDomains(
        params: DescribeTransitGatewayMulticastDomainsRequest
    ): Request[DescribeTransitGatewayMulticastDomainsResult] = js.native
    def describeTransitGatewayPeeringAttachments(
        params: DescribeTransitGatewayPeeringAttachmentsRequest
    ): Request[DescribeTransitGatewayPeeringAttachmentsResult] = js.native
    def describeTransitGatewayRouteTables(
        params: DescribeTransitGatewayRouteTablesRequest
    ): Request[DescribeTransitGatewayRouteTablesResult] = js.native
    def describeTransitGatewayVpcAttachments(
        params: DescribeTransitGatewayVpcAttachmentsRequest
    ): Request[DescribeTransitGatewayVpcAttachmentsResult] = js.native
    def describeTransitGateways(params: DescribeTransitGatewaysRequest): Request[DescribeTransitGatewaysResult] =
      js.native
    def describeVolumeAttribute(params: DescribeVolumeAttributeRequest): Request[DescribeVolumeAttributeResult] =
      js.native
    def describeVolumeStatus(params: DescribeVolumeStatusRequest): Request[DescribeVolumeStatusResult] = js.native
    def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResult]                = js.native
    def describeVolumesModifications(
        params: DescribeVolumesModificationsRequest
    ): Request[DescribeVolumesModificationsResult]                                                           = js.native
    def describeVpcAttribute(params: DescribeVpcAttributeRequest): Request[DescribeVpcAttributeResult]       = js.native
    def describeVpcClassicLink(params: DescribeVpcClassicLinkRequest): Request[DescribeVpcClassicLinkResult] = js.native
    def describeVpcClassicLinkDnsSupport(
        params: DescribeVpcClassicLinkDnsSupportRequest
    ): Request[DescribeVpcClassicLinkDnsSupportResult] = js.native
    def describeVpcEndpointConnectionNotifications(
        params: DescribeVpcEndpointConnectionNotificationsRequest
    ): Request[DescribeVpcEndpointConnectionNotificationsResult] = js.native
    def describeVpcEndpointConnections(
        params: DescribeVpcEndpointConnectionsRequest
    ): Request[DescribeVpcEndpointConnectionsResult] = js.native
    def describeVpcEndpointServiceConfigurations(
        params: DescribeVpcEndpointServiceConfigurationsRequest
    ): Request[DescribeVpcEndpointServiceConfigurationsResult] = js.native
    def describeVpcEndpointServicePermissions(
        params: DescribeVpcEndpointServicePermissionsRequest
    ): Request[DescribeVpcEndpointServicePermissionsResult] = js.native
    def describeVpcEndpointServices(
        params: DescribeVpcEndpointServicesRequest
    ): Request[DescribeVpcEndpointServicesResult]                                                      = js.native
    def describeVpcEndpoints(params: DescribeVpcEndpointsRequest): Request[DescribeVpcEndpointsResult] = js.native
    def describeVpcPeeringConnections(
        params: DescribeVpcPeeringConnectionsRequest
    ): Request[DescribeVpcPeeringConnectionsResult]                                                          = js.native
    def describeVpcs(params: DescribeVpcsRequest): Request[DescribeVpcsResult]                               = js.native
    def describeVpnConnections(params: DescribeVpnConnectionsRequest): Request[DescribeVpnConnectionsResult] = js.native
    def describeVpnGateways(params: DescribeVpnGatewaysRequest): Request[DescribeVpnGatewaysResult]          = js.native
    def detachClassicLinkVpc(params: DetachClassicLinkVpcRequest): Request[DetachClassicLinkVpcResult]       = js.native
    def detachInternetGateway(params: DetachInternetGatewayRequest): Request[js.Object]                      = js.native
    def detachNetworkInterface(params: DetachNetworkInterfaceRequest): Request[js.Object]                    = js.native
    def detachVolume(params: DetachVolumeRequest): Request[VolumeAttachment]                                 = js.native
    def detachVpnGateway(params: DetachVpnGatewayRequest): Request[js.Object]                                = js.native
    def disableEbsEncryptionByDefault(
        params: DisableEbsEncryptionByDefaultRequest
    ): Request[DisableEbsEncryptionByDefaultResult] = js.native
    def disableFastSnapshotRestores(
        params: DisableFastSnapshotRestoresRequest
    ): Request[DisableFastSnapshotRestoresResult] = js.native
    def disableTransitGatewayRouteTablePropagation(
        params: DisableTransitGatewayRouteTablePropagationRequest
    ): Request[DisableTransitGatewayRouteTablePropagationResult]                                          = js.native
    def disableVgwRoutePropagation(params: DisableVgwRoutePropagationRequest): Request[js.Object]         = js.native
    def disableVpcClassicLink(params: DisableVpcClassicLinkRequest): Request[DisableVpcClassicLinkResult] = js.native
    def disableVpcClassicLinkDnsSupport(
        params: DisableVpcClassicLinkDnsSupportRequest
    ): Request[DisableVpcClassicLinkDnsSupportResult]                               = js.native
    def disassociateAddress(params: DisassociateAddressRequest): Request[js.Object] = js.native
    def disassociateClientVpnTargetNetwork(
        params: DisassociateClientVpnTargetNetworkRequest
    ): Request[DisassociateClientVpnTargetNetworkResult] = js.native
    def disassociateIamInstanceProfile(
        params: DisassociateIamInstanceProfileRequest
    ): Request[DisassociateIamInstanceProfileResult]                                      = js.native
    def disassociateRouteTable(params: DisassociateRouteTableRequest): Request[js.Object] = js.native
    def disassociateSubnetCidrBlock(
        params: DisassociateSubnetCidrBlockRequest
    ): Request[DisassociateSubnetCidrBlockResult] = js.native
    def disassociateTransitGatewayMulticastDomain(
        params: DisassociateTransitGatewayMulticastDomainRequest
    ): Request[DisassociateTransitGatewayMulticastDomainResult] = js.native
    def disassociateTransitGatewayRouteTable(
        params: DisassociateTransitGatewayRouteTableRequest
    ): Request[DisassociateTransitGatewayRouteTableResult] = js.native
    def disassociateVpcCidrBlock(params: DisassociateVpcCidrBlockRequest): Request[DisassociateVpcCidrBlockResult] =
      js.native
    def enableEbsEncryptionByDefault(
        params: EnableEbsEncryptionByDefaultRequest
    ): Request[EnableEbsEncryptionByDefaultResult] = js.native
    def enableFastSnapshotRestores(
        params: EnableFastSnapshotRestoresRequest
    ): Request[EnableFastSnapshotRestoresResult] = js.native
    def enableTransitGatewayRouteTablePropagation(
        params: EnableTransitGatewayRouteTablePropagationRequest
    ): Request[EnableTransitGatewayRouteTablePropagationResult]                                        = js.native
    def enableVgwRoutePropagation(params: EnableVgwRoutePropagationRequest): Request[js.Object]        = js.native
    def enableVolumeIO(params: EnableVolumeIORequest): Request[js.Object]                              = js.native
    def enableVpcClassicLink(params: EnableVpcClassicLinkRequest): Request[EnableVpcClassicLinkResult] = js.native
    def enableVpcClassicLinkDnsSupport(
        params: EnableVpcClassicLinkDnsSupportRequest
    ): Request[EnableVpcClassicLinkDnsSupportResult] = js.native
    def exportClientVpnClientCertificateRevocationList(
        params: ExportClientVpnClientCertificateRevocationListRequest
    ): Request[ExportClientVpnClientCertificateRevocationListResult] = js.native
    def exportClientVpnClientConfiguration(
        params: ExportClientVpnClientConfigurationRequest
    ): Request[ExportClientVpnClientConfigurationResult]                    = js.native
    def exportImage(params: ExportImageRequest): Request[ExportImageResult] = js.native
    def exportTransitGatewayRoutes(
        params: ExportTransitGatewayRoutesRequest
    ): Request[ExportTransitGatewayRoutesResult] = js.native
    def getAssociatedIpv6PoolCidrs(
        params: GetAssociatedIpv6PoolCidrsRequest
    ): Request[GetAssociatedIpv6PoolCidrsResult] = js.native
    def getCapacityReservationUsage(
        params: GetCapacityReservationUsageRequest
    ): Request[GetCapacityReservationUsageResult]                                                      = js.native
    def getCoipPoolUsage(params: GetCoipPoolUsageRequest): Request[GetCoipPoolUsageResult]             = js.native
    def getConsoleOutput(params: GetConsoleOutputRequest): Request[GetConsoleOutputResult]             = js.native
    def getConsoleScreenshot(params: GetConsoleScreenshotRequest): Request[GetConsoleScreenshotResult] = js.native
    def getDefaultCreditSpecification(
        params: GetDefaultCreditSpecificationRequest
    ): Request[GetDefaultCreditSpecificationResult]                                                       = js.native
    def getEbsDefaultKmsKeyId(params: GetEbsDefaultKmsKeyIdRequest): Request[GetEbsDefaultKmsKeyIdResult] = js.native
    def getEbsEncryptionByDefault(params: GetEbsEncryptionByDefaultRequest): Request[GetEbsEncryptionByDefaultResult] =
      js.native
    def getHostReservationPurchasePreview(
        params: GetHostReservationPurchasePreviewRequest
    ): Request[GetHostReservationPurchasePreviewResult]                                                   = js.native
    def getLaunchTemplateData(params: GetLaunchTemplateDataRequest): Request[GetLaunchTemplateDataResult] = js.native
    def getPasswordData(params: GetPasswordDataRequest): Request[GetPasswordDataResult]                   = js.native
    def getReservedInstancesExchangeQuote(
        params: GetReservedInstancesExchangeQuoteRequest
    ): Request[GetReservedInstancesExchangeQuoteResult] = js.native
    def getTransitGatewayAttachmentPropagations(
        params: GetTransitGatewayAttachmentPropagationsRequest
    ): Request[GetTransitGatewayAttachmentPropagationsResult] = js.native
    def getTransitGatewayMulticastDomainAssociations(
        params: GetTransitGatewayMulticastDomainAssociationsRequest
    ): Request[GetTransitGatewayMulticastDomainAssociationsResult] = js.native
    def getTransitGatewayRouteTableAssociations(
        params: GetTransitGatewayRouteTableAssociationsRequest
    ): Request[GetTransitGatewayRouteTableAssociationsResult] = js.native
    def getTransitGatewayRouteTablePropagations(
        params: GetTransitGatewayRouteTablePropagationsRequest
    ): Request[GetTransitGatewayRouteTablePropagationsResult] = js.native
    def importClientVpnClientCertificateRevocationList(
        params: ImportClientVpnClientCertificateRevocationListRequest
    ): Request[ImportClientVpnClientCertificateRevocationListResult]                 = js.native
    def importImage(params: ImportImageRequest): Request[ImportImageResult]          = js.native
    def importInstance(params: ImportInstanceRequest): Request[ImportInstanceResult] = js.native
    def importKeyPair(params: ImportKeyPairRequest): Request[ImportKeyPairResult]    = js.native
    def importSnapshot(params: ImportSnapshotRequest): Request[ImportSnapshotResult] = js.native
    def importVolume(params: ImportVolumeRequest): Request[ImportVolumeResult]       = js.native
    def modifyCapacityReservation(params: ModifyCapacityReservationRequest): Request[ModifyCapacityReservationResult] =
      js.native
    def modifyClientVpnEndpoint(params: ModifyClientVpnEndpointRequest): Request[ModifyClientVpnEndpointResult] =
      js.native
    def modifyDefaultCreditSpecification(
        params: ModifyDefaultCreditSpecificationRequest
    ): Request[ModifyDefaultCreditSpecificationResult] = js.native
    def modifyEbsDefaultKmsKeyId(params: ModifyEbsDefaultKmsKeyIdRequest): Request[ModifyEbsDefaultKmsKeyIdResult] =
      js.native
    def modifyFleet(params: ModifyFleetRequest): Request[ModifyFleetResult] = js.native
    def modifyFpgaImageAttribute(params: ModifyFpgaImageAttributeRequest): Request[ModifyFpgaImageAttributeResult] =
      js.native
    def modifyHosts(params: ModifyHostsRequest): Request[ModifyHostsResult]                 = js.native
    def modifyIdFormat(params: ModifyIdFormatRequest): Request[js.Object]                   = js.native
    def modifyIdentityIdFormat(params: ModifyIdentityIdFormatRequest): Request[js.Object]   = js.native
    def modifyImageAttribute(params: ModifyImageAttributeRequest): Request[js.Object]       = js.native
    def modifyInstanceAttribute(params: ModifyInstanceAttributeRequest): Request[js.Object] = js.native
    def modifyInstanceCapacityReservationAttributes(
        params: ModifyInstanceCapacityReservationAttributesRequest
    ): Request[ModifyInstanceCapacityReservationAttributesResult] = js.native
    def modifyInstanceCreditSpecification(
        params: ModifyInstanceCreditSpecificationRequest
    ): Request[ModifyInstanceCreditSpecificationResult] = js.native
    def modifyInstanceEventStartTime(
        params: ModifyInstanceEventStartTimeRequest
    ): Request[ModifyInstanceEventStartTimeResult] = js.native
    def modifyInstanceMetadataOptions(
        params: ModifyInstanceMetadataOptionsRequest
    ): Request[ModifyInstanceMetadataOptionsResult] = js.native
    def modifyInstancePlacement(params: ModifyInstancePlacementRequest): Request[ModifyInstancePlacementResult] =
      js.native
    def modifyLaunchTemplate(params: ModifyLaunchTemplateRequest): Request[ModifyLaunchTemplateResult]      = js.native
    def modifyNetworkInterfaceAttribute(params: ModifyNetworkInterfaceAttributeRequest): Request[js.Object] = js.native
    def modifyReservedInstances(params: ModifyReservedInstancesRequest): Request[ModifyReservedInstancesResult] =
      js.native
    def modifySnapshotAttribute(params: ModifySnapshotAttributeRequest): Request[js.Object] = js.native
    def modifySpotFleetRequest(params: ModifySpotFleetRequestRequest): Request[ModifySpotFleetRequestResponse] =
      js.native
    def modifySubnetAttribute(params: ModifySubnetAttributeRequest): Request[js.Object] = js.native
    def modifyTrafficMirrorFilterNetworkServices(
        params: ModifyTrafficMirrorFilterNetworkServicesRequest
    ): Request[ModifyTrafficMirrorFilterNetworkServicesResult] = js.native
    def modifyTrafficMirrorFilterRule(
        params: ModifyTrafficMirrorFilterRuleRequest
    ): Request[ModifyTrafficMirrorFilterRuleResult] = js.native
    def modifyTrafficMirrorSession(
        params: ModifyTrafficMirrorSessionRequest
    ): Request[ModifyTrafficMirrorSessionResult] = js.native
    def modifyTransitGatewayVpcAttachment(
        params: ModifyTransitGatewayVpcAttachmentRequest
    ): Request[ModifyTransitGatewayVpcAttachmentResult]                                       = js.native
    def modifyVolume(params: ModifyVolumeRequest): Request[ModifyVolumeResult]                = js.native
    def modifyVolumeAttribute(params: ModifyVolumeAttributeRequest): Request[js.Object]       = js.native
    def modifyVpcAttribute(params: ModifyVpcAttributeRequest): Request[js.Object]             = js.native
    def modifyVpcEndpoint(params: ModifyVpcEndpointRequest): Request[ModifyVpcEndpointResult] = js.native
    def modifyVpcEndpointConnectionNotification(
        params: ModifyVpcEndpointConnectionNotificationRequest
    ): Request[ModifyVpcEndpointConnectionNotificationResult] = js.native
    def modifyVpcEndpointServiceConfiguration(
        params: ModifyVpcEndpointServiceConfigurationRequest
    ): Request[ModifyVpcEndpointServiceConfigurationResult] = js.native
    def modifyVpcEndpointServicePermissions(
        params: ModifyVpcEndpointServicePermissionsRequest
    ): Request[ModifyVpcEndpointServicePermissionsResult] = js.native
    def modifyVpcPeeringConnectionOptions(
        params: ModifyVpcPeeringConnectionOptionsRequest
    ): Request[ModifyVpcPeeringConnectionOptionsResult]                                             = js.native
    def modifyVpcTenancy(params: ModifyVpcTenancyRequest): Request[ModifyVpcTenancyResult]          = js.native
    def modifyVpnConnection(params: ModifyVpnConnectionRequest): Request[ModifyVpnConnectionResult] = js.native
    def modifyVpnTunnelCertificate(
        params: ModifyVpnTunnelCertificateRequest
    ): Request[ModifyVpnTunnelCertificateResult]                                                             = js.native
    def modifyVpnTunnelOptions(params: ModifyVpnTunnelOptionsRequest): Request[ModifyVpnTunnelOptionsResult] = js.native
    def monitorInstances(params: MonitorInstancesRequest): Request[MonitorInstancesResult]                   = js.native
    def moveAddressToVpc(params: MoveAddressToVpcRequest): Request[MoveAddressToVpcResult]                   = js.native
    def provisionByoipCidr(params: ProvisionByoipCidrRequest): Request[ProvisionByoipCidrResult]             = js.native
    def purchaseHostReservation(params: PurchaseHostReservationRequest): Request[PurchaseHostReservationResult] =
      js.native
    def purchaseReservedInstancesOffering(
        params: PurchaseReservedInstancesOfferingRequest
    ): Request[PurchaseReservedInstancesOfferingResult] = js.native
    def purchaseScheduledInstances(
        params: PurchaseScheduledInstancesRequest
    ): Request[PurchaseScheduledInstancesResult]                                  = js.native
    def rebootInstances(params: RebootInstancesRequest): Request[js.Object]       = js.native
    def registerImage(params: RegisterImageRequest): Request[RegisterImageResult] = js.native
    def registerTransitGatewayMulticastGroupMembers(
        params: RegisterTransitGatewayMulticastGroupMembersRequest
    ): Request[RegisterTransitGatewayMulticastGroupMembersResult] = js.native
    def registerTransitGatewayMulticastGroupSources(
        params: RegisterTransitGatewayMulticastGroupSourcesRequest
    ): Request[RegisterTransitGatewayMulticastGroupSourcesResult] = js.native
    def rejectTransitGatewayPeeringAttachment(
        params: RejectTransitGatewayPeeringAttachmentRequest
    ): Request[RejectTransitGatewayPeeringAttachmentResult] = js.native
    def rejectTransitGatewayVpcAttachment(
        params: RejectTransitGatewayVpcAttachmentRequest
    ): Request[RejectTransitGatewayVpcAttachmentResult] = js.native
    def rejectVpcEndpointConnections(
        params: RejectVpcEndpointConnectionsRequest
    ): Request[RejectVpcEndpointConnectionsResult] = js.native
    def rejectVpcPeeringConnection(
        params: RejectVpcPeeringConnectionRequest
    ): Request[RejectVpcPeeringConnectionResult]                               = js.native
    def releaseAddress(params: ReleaseAddressRequest): Request[js.Object]      = js.native
    def releaseHosts(params: ReleaseHostsRequest): Request[ReleaseHostsResult] = js.native
    def replaceIamInstanceProfileAssociation(
        params: ReplaceIamInstanceProfileAssociationRequest
    ): Request[ReplaceIamInstanceProfileAssociationResult] = js.native
    def replaceNetworkAclAssociation(
        params: ReplaceNetworkAclAssociationRequest
    ): Request[ReplaceNetworkAclAssociationResult]                                        = js.native
    def replaceNetworkAclEntry(params: ReplaceNetworkAclEntryRequest): Request[js.Object] = js.native
    def replaceRoute(params: ReplaceRouteRequest): Request[js.Object]                     = js.native
    def replaceRouteTableAssociation(
        params: ReplaceRouteTableAssociationRequest
    ): Request[ReplaceRouteTableAssociationResult] = js.native
    def replaceTransitGatewayRoute(
        params: ReplaceTransitGatewayRouteRequest
    ): Request[ReplaceTransitGatewayRouteResult]                                                       = js.native
    def reportInstanceStatus(params: ReportInstanceStatusRequest): Request[js.Object]                  = js.native
    def requestSpotFleet(params: RequestSpotFleetRequest): Request[RequestSpotFleetResponse]           = js.native
    def requestSpotInstances(params: RequestSpotInstancesRequest): Request[RequestSpotInstancesResult] = js.native
    def resetEbsDefaultKmsKeyId(params: ResetEbsDefaultKmsKeyIdRequest): Request[ResetEbsDefaultKmsKeyIdResult] =
      js.native
    def resetFpgaImageAttribute(params: ResetFpgaImageAttributeRequest): Request[ResetFpgaImageAttributeResult] =
      js.native
    def resetImageAttribute(params: ResetImageAttributeRequest): Request[js.Object]                       = js.native
    def resetInstanceAttribute(params: ResetInstanceAttributeRequest): Request[js.Object]                 = js.native
    def resetNetworkInterfaceAttribute(params: ResetNetworkInterfaceAttributeRequest): Request[js.Object] = js.native
    def resetSnapshotAttribute(params: ResetSnapshotAttributeRequest): Request[js.Object]                 = js.native
    def restoreAddressToClassic(params: RestoreAddressToClassicRequest): Request[RestoreAddressToClassicResult] =
      js.native
    def revokeClientVpnIngress(params: RevokeClientVpnIngressRequest): Request[RevokeClientVpnIngressResult] = js.native
    def revokeSecurityGroupEgress(params: RevokeSecurityGroupEgressRequest): Request[js.Object]              = js.native
    def revokeSecurityGroupIngress(params: RevokeSecurityGroupIngressRequest): Request[js.Object]            = js.native
    def runInstances(params: RunInstancesRequest): Request[Reservation]                                      = js.native
    def runScheduledInstances(params: RunScheduledInstancesRequest): Request[RunScheduledInstancesResult]    = js.native
    def searchLocalGatewayRoutes(params: SearchLocalGatewayRoutesRequest): Request[SearchLocalGatewayRoutesResult] =
      js.native
    def searchTransitGatewayMulticastGroups(
        params: SearchTransitGatewayMulticastGroupsRequest
    ): Request[SearchTransitGatewayMulticastGroupsResult] = js.native
    def searchTransitGatewayRoutes(
        params: SearchTransitGatewayRoutesRequest
    ): Request[SearchTransitGatewayRoutesResult]                                            = js.native
    def sendDiagnosticInterrupt(params: SendDiagnosticInterruptRequest): Request[js.Object] = js.native
    def startInstances(params: StartInstancesRequest): Request[StartInstancesResult]        = js.native
    def startVpcEndpointServicePrivateDnsVerification(
        params: StartVpcEndpointServicePrivateDnsVerificationRequest
    ): Request[StartVpcEndpointServicePrivateDnsVerificationResult]               = js.native
    def stopInstances(params: StopInstancesRequest): Request[StopInstancesResult] = js.native
    def terminateClientVpnConnections(
        params: TerminateClientVpnConnectionsRequest
    ): Request[TerminateClientVpnConnectionsResult]                                                       = js.native
    def terminateInstances(params: TerminateInstancesRequest): Request[TerminateInstancesResult]          = js.native
    def unassignIpv6Addresses(params: UnassignIpv6AddressesRequest): Request[UnassignIpv6AddressesResult] = js.native
    def unassignPrivateIpAddresses(params: UnassignPrivateIpAddressesRequest): Request[js.Object]         = js.native
    def unmonitorInstances(params: UnmonitorInstancesRequest): Request[UnmonitorInstancesResult]          = js.native
    def updateSecurityGroupRuleDescriptionsEgress(
        params: UpdateSecurityGroupRuleDescriptionsEgressRequest
    ): Request[UpdateSecurityGroupRuleDescriptionsEgressResult] = js.native
    def updateSecurityGroupRuleDescriptionsIngress(
        params: UpdateSecurityGroupRuleDescriptionsIngressRequest
    ): Request[UpdateSecurityGroupRuleDescriptionsIngressResult]                              = js.native
    def withdrawByoipCidr(params: WithdrawByoipCidrRequest): Request[WithdrawByoipCidrResult] = js.native
  }

  /**
    * Contains the parameters for accepting the quote.
    */
  @js.native
  @Factory
  trait AcceptReservedInstancesExchangeQuoteRequest extends js.Object {
    var ReservedInstanceIds: ReservedInstanceIdSet
    var DryRun: js.UndefOr[Boolean]
    var TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet]
  }

  /**
    * The result of the exchange and whether it was <code>successful</code>.
    */
  @js.native
  @Factory
  trait AcceptReservedInstancesExchangeQuoteResult extends js.Object {
    var ExchangeId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AcceptTransitGatewayPeeringAttachmentRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AcceptTransitGatewayPeeringAttachmentResult extends js.Object {
    var TransitGatewayPeeringAttachment: js.UndefOr[TransitGatewayPeeringAttachment]
  }

  @js.native
  @Factory
  trait AcceptTransitGatewayVpcAttachmentRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AcceptTransitGatewayVpcAttachmentResult extends js.Object {
    var TransitGatewayVpcAttachment: js.UndefOr[TransitGatewayVpcAttachment]
  }

  @js.native
  @Factory
  trait AcceptVpcEndpointConnectionsRequest extends js.Object {
    var ServiceId: VpcEndpointServiceId
    var VpcEndpointIds: VpcEndpointIdList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AcceptVpcEndpointConnectionsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  @js.native
  @Factory
  trait AcceptVpcPeeringConnectionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var VpcPeeringConnectionId: js.UndefOr[VpcPeeringConnectionId]
  }

  @js.native
  @Factory
  trait AcceptVpcPeeringConnectionResult extends js.Object {
    var VpcPeeringConnection: js.UndefOr[VpcPeeringConnection]
  }

  /**
    * Describes an account attribute.
    */
  @js.native
  @Factory
  trait AccountAttribute extends js.Object {
    var AttributeName: js.UndefOr[String]
    var AttributeValues: js.UndefOr[AccountAttributeValueList]
  }

  @js.native
  sealed trait AccountAttributeName extends js.Any
  object AccountAttributeName extends js.Object {
    val `supported-platforms` = "supported-platforms".asInstanceOf[AccountAttributeName]
    val `default-vpc`         = "default-vpc".asInstanceOf[AccountAttributeName]

    val values = js.Object.freeze(js.Array(`supported-platforms`, `default-vpc`))
  }

  /**
    * Describes a value of an account attribute.
    */
  @js.native
  @Factory
  trait AccountAttributeValue extends js.Object {
    var AttributeValue: js.UndefOr[String]
  }

  /**
    * Describes a running instance in a Spot Fleet.
    */
  @js.native
  @Factory
  trait ActiveInstance extends js.Object {
    var InstanceHealth: js.UndefOr[InstanceHealthStatus]
    var InstanceId: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var SpotInstanceRequestId: js.UndefOr[String]
  }

  @js.native
  sealed trait ActivityStatus extends js.Any
  object ActivityStatus extends js.Object {
    val error               = "error".asInstanceOf[ActivityStatus]
    val pending_fulfillment = "pending_fulfillment".asInstanceOf[ActivityStatus]
    val pending_termination = "pending_termination".asInstanceOf[ActivityStatus]
    val fulfilled           = "fulfilled".asInstanceOf[ActivityStatus]

    val values = js.Object.freeze(js.Array(error, pending_fulfillment, pending_termination, fulfilled))
  }

  /**
    * Describes an Elastic IP address.
    */
  @js.native
  @Factory
  trait Address extends js.Object {
    var AllocationId: js.UndefOr[String]
    var AssociationId: js.UndefOr[String]
    var CustomerOwnedIp: js.UndefOr[String]
    var CustomerOwnedIpv4Pool: js.UndefOr[String]
    var Domain: js.UndefOr[DomainType]
    var InstanceId: js.UndefOr[String]
    var NetworkBorderGroup: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var NetworkInterfaceOwnerId: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var PublicIpv4Pool: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait AdvertiseByoipCidrRequest extends js.Object {
    var Cidr: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AdvertiseByoipCidrResult extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  @js.native
  sealed trait Affinity extends js.Any
  object Affinity extends js.Object {
    val default = "default".asInstanceOf[Affinity]
    val host    = "host".asInstanceOf[Affinity]

    val values = js.Object.freeze(js.Array(default, host))
  }

  @js.native
  @Factory
  trait AllocateAddressRequest extends js.Object {
    var Address: js.UndefOr[String]
    var CustomerOwnedIpv4Pool: js.UndefOr[String]
    var Domain: js.UndefOr[DomainType]
    var DryRun: js.UndefOr[Boolean]
    var NetworkBorderGroup: js.UndefOr[String]
    var PublicIpv4Pool: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AllocateAddressResult extends js.Object {
    var AllocationId: js.UndefOr[String]
    var CustomerOwnedIp: js.UndefOr[String]
    var CustomerOwnedIpv4Pool: js.UndefOr[String]
    var Domain: js.UndefOr[DomainType]
    var NetworkBorderGroup: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
    var PublicIpv4Pool: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AllocateHostsRequest extends js.Object {
    var AvailabilityZone: String
    var Quantity: Int
    var AutoPlacement: js.UndefOr[AutoPlacement]
    var ClientToken: js.UndefOr[String]
    var HostRecovery: js.UndefOr[HostRecovery]
    var InstanceFamily: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  /**
    * Contains the output of AllocateHosts.
    */
  @js.native
  @Factory
  trait AllocateHostsResult extends js.Object {
    var HostIds: js.UndefOr[ResponseHostIdList]
  }

  @js.native
  sealed trait AllocationState extends js.Any
  object AllocationState extends js.Object {
    val available                    = "available".asInstanceOf[AllocationState]
    val `under-assessment`           = "under-assessment".asInstanceOf[AllocationState]
    val `permanent-failure`          = "permanent-failure".asInstanceOf[AllocationState]
    val released                     = "released".asInstanceOf[AllocationState]
    val `released-permanent-failure` = "released-permanent-failure".asInstanceOf[AllocationState]
    val pending                      = "pending".asInstanceOf[AllocationState]

    val values = js.Object.freeze(
      js.Array(available, `under-assessment`, `permanent-failure`, released, `released-permanent-failure`, pending)
    )
  }

  @js.native
  sealed trait AllocationStrategy extends js.Any
  object AllocationStrategy extends js.Object {
    val lowestPrice       = "lowestPrice".asInstanceOf[AllocationStrategy]
    val diversified       = "diversified".asInstanceOf[AllocationStrategy]
    val capacityOptimized = "capacityOptimized".asInstanceOf[AllocationStrategy]

    val values = js.Object.freeze(js.Array(lowestPrice, diversified, capacityOptimized))
  }

  /**
    * Describes a principal.
    */
  @js.native
  @Factory
  trait AllowedPrincipal extends js.Object {
    var Principal: js.UndefOr[String]
    var PrincipalType: js.UndefOr[PrincipalType]
  }

  @js.native
  sealed trait AllowsMultipleInstanceTypes extends js.Any
  object AllowsMultipleInstanceTypes extends js.Object {
    val on  = "on".asInstanceOf[AllowsMultipleInstanceTypes]
    val off = "off".asInstanceOf[AllowsMultipleInstanceTypes]

    val values = js.Object.freeze(js.Array(on, off))
  }

  @js.native
  @Factory
  trait ApplySecurityGroupsToClientVpnTargetNetworkRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var SecurityGroupIds: ClientVpnSecurityGroupIdSet
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ApplySecurityGroupsToClientVpnTargetNetworkResult extends js.Object {
    var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet]
  }

  @js.native
  sealed trait ArchitectureType extends js.Any
  object ArchitectureType extends js.Object {
    val i386   = "i386".asInstanceOf[ArchitectureType]
    val x86_64 = "x86_64".asInstanceOf[ArchitectureType]
    val arm64  = "arm64".asInstanceOf[ArchitectureType]

    val values = js.Object.freeze(js.Array(i386, x86_64, arm64))
  }

  @js.native
  sealed trait ArchitectureValues extends js.Any
  object ArchitectureValues extends js.Object {
    val i386   = "i386".asInstanceOf[ArchitectureValues]
    val x86_64 = "x86_64".asInstanceOf[ArchitectureValues]
    val arm64  = "arm64".asInstanceOf[ArchitectureValues]

    val values = js.Object.freeze(js.Array(i386, x86_64, arm64))
  }

  @js.native
  @Factory
  trait AssignIpv6AddressesRequest extends js.Object {
    var NetworkInterfaceId: NetworkInterfaceId
    var Ipv6AddressCount: js.UndefOr[Int]
    var Ipv6Addresses: js.UndefOr[Ipv6AddressList]
  }

  @js.native
  @Factory
  trait AssignIpv6AddressesResult extends js.Object {
    var AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  /**
    * Contains the parameters for AssignPrivateIpAddresses.
    */
  @js.native
  @Factory
  trait AssignPrivateIpAddressesRequest extends js.Object {
    var NetworkInterfaceId: NetworkInterfaceId
    var AllowReassignment: js.UndefOr[Boolean]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait AssignPrivateIpAddressesResult extends js.Object {
    var AssignedPrivateIpAddresses: js.UndefOr[AssignedPrivateIpAddressList]
    var NetworkInterfaceId: js.UndefOr[String]
  }

  /**
    * Describes the private IP addresses assigned to a network interface.
    */
  @js.native
  @Factory
  trait AssignedPrivateIpAddress extends js.Object {
    var PrivateIpAddress: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AssociateAddressRequest extends js.Object {
    var AllocationId: js.UndefOr[AllocationId]
    var AllowReassociation: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[InstanceId]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var PrivateIpAddress: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AssociateAddressResult extends js.Object {
    var AssociationId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AssociateClientVpnTargetNetworkRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var SubnetId: SubnetId
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AssociateClientVpnTargetNetworkResult extends js.Object {
    var AssociationId: js.UndefOr[String]
    var Status: js.UndefOr[AssociationStatus]
  }

  @js.native
  @Factory
  trait AssociateDhcpOptionsRequest extends js.Object {
    var DhcpOptionsId: DefaultingDhcpOptionsId
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AssociateIamInstanceProfileRequest extends js.Object {
    var IamInstanceProfile: IamInstanceProfileSpecification
    var InstanceId: InstanceId
  }

  @js.native
  @Factory
  trait AssociateIamInstanceProfileResult extends js.Object {
    var IamInstanceProfileAssociation: js.UndefOr[IamInstanceProfileAssociation]
  }

  @js.native
  @Factory
  trait AssociateRouteTableRequest extends js.Object {
    var RouteTableId: RouteTableId
    var DryRun: js.UndefOr[Boolean]
    var GatewayId: js.UndefOr[RouteGatewayId]
    var SubnetId: js.UndefOr[SubnetId]
  }

  @js.native
  @Factory
  trait AssociateRouteTableResult extends js.Object {
    var AssociationId: js.UndefOr[String]
    var AssociationState: js.UndefOr[RouteTableAssociationState]
  }

  @js.native
  @Factory
  trait AssociateSubnetCidrBlockRequest extends js.Object {
    var Ipv6CidrBlock: String
    var SubnetId: SubnetId
  }

  @js.native
  @Factory
  trait AssociateSubnetCidrBlockResult extends js.Object {
    var Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation]
    var SubnetId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AssociateTransitGatewayMulticastDomainRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var SubnetIds: js.UndefOr[ValueStringList]
    var TransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId]
    var TransitGatewayMulticastDomainId: js.UndefOr[TransitGatewayMulticastDomainId]
  }

  @js.native
  @Factory
  trait AssociateTransitGatewayMulticastDomainResult extends js.Object {
    var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations]
  }

  @js.native
  @Factory
  trait AssociateTransitGatewayRouteTableRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AssociateTransitGatewayRouteTableResult extends js.Object {
    var Association: js.UndefOr[TransitGatewayAssociation]
  }

  @js.native
  @Factory
  trait AssociateVpcCidrBlockRequest extends js.Object {
    var VpcId: VpcId
    var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean]
    var CidrBlock: js.UndefOr[String]
    var Ipv6CidrBlock: js.UndefOr[String]
    var Ipv6CidrBlockNetworkBorderGroup: js.UndefOr[String]
    var Ipv6Pool: js.UndefOr[Ipv6PoolEc2Id]
  }

  @js.native
  @Factory
  trait AssociateVpcCidrBlockResult extends js.Object {
    var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation]
    var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation]
    var VpcId: js.UndefOr[String]
  }

  @js.native
  sealed trait AssociatedNetworkType extends js.Any
  object AssociatedNetworkType extends js.Object {
    val vpc = "vpc".asInstanceOf[AssociatedNetworkType]

    val values = js.Object.freeze(js.Array(vpc))
  }

  /**
    * Describes a target network that is associated with a Client VPN endpoint. A target network is a subnet in a VPC.
    */
  @js.native
  @Factory
  trait AssociatedTargetNetwork extends js.Object {
    var NetworkId: js.UndefOr[String]
    var NetworkType: js.UndefOr[AssociatedNetworkType]
  }

  /**
    * Describes the state of a target network association.
    */
  @js.native
  @Factory
  trait AssociationStatus extends js.Object {
    var Code: js.UndefOr[AssociationStatusCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait AssociationStatusCode extends js.Any
  object AssociationStatusCode extends js.Object {
    val associating          = "associating".asInstanceOf[AssociationStatusCode]
    val associated           = "associated".asInstanceOf[AssociationStatusCode]
    val `association-failed` = "association-failed".asInstanceOf[AssociationStatusCode]
    val disassociating       = "disassociating".asInstanceOf[AssociationStatusCode]
    val disassociated        = "disassociated".asInstanceOf[AssociationStatusCode]

    val values =
      js.Object.freeze(js.Array(associating, associated, `association-failed`, disassociating, disassociated))
  }

  @js.native
  @Factory
  trait AttachClassicLinkVpcRequest extends js.Object {
    var Groups: GroupIdStringList
    var InstanceId: InstanceId
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AttachClassicLinkVpcResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AttachInternetGatewayRequest extends js.Object {
    var InternetGatewayId: InternetGatewayId
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for AttachNetworkInterface.
    */
  @js.native
  @Factory
  trait AttachNetworkInterfaceRequest extends js.Object {
    var DeviceIndex: Int
    var InstanceId: InstanceId
    var NetworkInterfaceId: NetworkInterfaceId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of AttachNetworkInterface.
    */
  @js.native
  @Factory
  trait AttachNetworkInterfaceResult extends js.Object {
    var AttachmentId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait AttachVolumeRequest extends js.Object {
    var Device: String
    var InstanceId: InstanceId
    var VolumeId: VolumeId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for AttachVpnGateway.
    */
  @js.native
  @Factory
  trait AttachVpnGatewayRequest extends js.Object {
    var VpcId: VpcId
    var VpnGatewayId: VpnGatewayId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of AttachVpnGateway.
    */
  @js.native
  @Factory
  trait AttachVpnGatewayResult extends js.Object {
    var VpcAttachment: js.UndefOr[VpcAttachment]
  }

  @js.native
  sealed trait AttachmentStatus extends js.Any
  object AttachmentStatus extends js.Object {
    val attaching = "attaching".asInstanceOf[AttachmentStatus]
    val attached  = "attached".asInstanceOf[AttachmentStatus]
    val detaching = "detaching".asInstanceOf[AttachmentStatus]
    val detached  = "detached".asInstanceOf[AttachmentStatus]

    val values = js.Object.freeze(js.Array(attaching, attached, detaching, detached))
  }

  /**
    * Describes a value for a resource attribute that is a Boolean value.
    */
  @js.native
  @Factory
  trait AttributeBooleanValue extends js.Object {
    var Value: js.UndefOr[Boolean]
  }

  /**
    * Describes a value for a resource attribute that is a String.
    */
  @js.native
  @Factory
  trait AttributeValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * Information about an authorization rule.
    */
  @js.native
  @Factory
  trait AuthorizationRule extends js.Object {
    var AccessAll: js.UndefOr[Boolean]
    var ClientVpnEndpointId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DestinationCidr: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus]
  }

  @js.native
  @Factory
  trait AuthorizeClientVpnIngressRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var TargetNetworkCidr: String
    var AccessGroupId: js.UndefOr[String]
    var AuthorizeAllGroups: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait AuthorizeClientVpnIngressResult extends js.Object {
    var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus]
  }

  @js.native
  @Factory
  trait AuthorizeSecurityGroupEgressRequest extends js.Object {
    var GroupId: SecurityGroupId
    var CidrIp: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var FromPort: js.UndefOr[Int]
    var IpPermissions: js.UndefOr[IpPermissionList]
    var IpProtocol: js.UndefOr[String]
    var SourceSecurityGroupName: js.UndefOr[String]
    var SourceSecurityGroupOwnerId: js.UndefOr[String]
    var ToPort: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait AuthorizeSecurityGroupIngressRequest extends js.Object {
    var CidrIp: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var FromPort: js.UndefOr[Int]
    var GroupId: js.UndefOr[SecurityGroupId]
    var GroupName: js.UndefOr[SecurityGroupName]
    var IpPermissions: js.UndefOr[IpPermissionList]
    var IpProtocol: js.UndefOr[String]
    var SourceSecurityGroupName: js.UndefOr[String]
    var SourceSecurityGroupOwnerId: js.UndefOr[String]
    var ToPort: js.UndefOr[Int]
  }

  @js.native
  sealed trait AutoAcceptSharedAttachmentsValue extends js.Any
  object AutoAcceptSharedAttachmentsValue extends js.Object {
    val enable  = "enable".asInstanceOf[AutoAcceptSharedAttachmentsValue]
    val disable = "disable".asInstanceOf[AutoAcceptSharedAttachmentsValue]

    val values = js.Object.freeze(js.Array(enable, disable))
  }

  @js.native
  sealed trait AutoPlacement extends js.Any
  object AutoPlacement extends js.Object {
    val on  = "on".asInstanceOf[AutoPlacement]
    val off = "off".asInstanceOf[AutoPlacement]

    val values = js.Object.freeze(js.Array(on, off))
  }

  /**
    * Describes an Availability Zone or Local Zone.
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var GroupName: js.UndefOr[String]
    var Messages: js.UndefOr[AvailabilityZoneMessageList]
    var NetworkBorderGroup: js.UndefOr[String]
    var OptInStatus: js.UndefOr[AvailabilityZoneOptInStatus]
    var RegionName: js.UndefOr[String]
    var State: js.UndefOr[AvailabilityZoneState]
    var ZoneId: js.UndefOr[String]
    var ZoneName: js.UndefOr[String]
  }

  /**
    * Describes a message about an Availability Zone or Local Zone.
    */
  @js.native
  @Factory
  trait AvailabilityZoneMessage extends js.Object {
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait AvailabilityZoneOptInStatus extends js.Any
  object AvailabilityZoneOptInStatus extends js.Object {
    val `opt-in-not-required` = "opt-in-not-required".asInstanceOf[AvailabilityZoneOptInStatus]
    val `opted-in`            = "opted-in".asInstanceOf[AvailabilityZoneOptInStatus]
    val `not-opted-in`        = "not-opted-in".asInstanceOf[AvailabilityZoneOptInStatus]

    val values = js.Object.freeze(js.Array(`opt-in-not-required`, `opted-in`, `not-opted-in`))
  }

  @js.native
  sealed trait AvailabilityZoneState extends js.Any
  object AvailabilityZoneState extends js.Object {
    val available   = "available".asInstanceOf[AvailabilityZoneState]
    val information = "information".asInstanceOf[AvailabilityZoneState]
    val impaired    = "impaired".asInstanceOf[AvailabilityZoneState]
    val unavailable = "unavailable".asInstanceOf[AvailabilityZoneState]

    val values = js.Object.freeze(js.Array(available, information, impaired, unavailable))
  }

  /**
    * The capacity information for instances that can be launched onto the Dedicated Host.
    */
  @js.native
  @Factory
  trait AvailableCapacity extends js.Object {
    var AvailableInstanceCapacity: js.UndefOr[AvailableInstanceCapacityList]
    var AvailableVCpus: js.UndefOr[Int]
  }

  @js.native
  sealed trait BatchState extends js.Any
  object BatchState extends js.Object {
    val submitted             = "submitted".asInstanceOf[BatchState]
    val active                = "active".asInstanceOf[BatchState]
    val cancelled             = "cancelled".asInstanceOf[BatchState]
    val failed                = "failed".asInstanceOf[BatchState]
    val cancelled_running     = "cancelled_running".asInstanceOf[BatchState]
    val cancelled_terminating = "cancelled_terminating".asInstanceOf[BatchState]
    val modifying             = "modifying".asInstanceOf[BatchState]

    val values = js.Object.freeze(
      js.Array(submitted, active, cancelled, failed, cancelled_running, cancelled_terminating, modifying)
    )
  }

  @js.native
  @Factory
  trait BlobAttributeValue extends js.Object {
    var Value: js.UndefOr[Blob]
  }

  /**
    * Describes a block device mapping.
    */
  @js.native
  @Factory
  trait BlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[EbsBlockDevice]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  /**
    * Contains the parameters for BundleInstance.
    */
  @js.native
  @Factory
  trait BundleInstanceRequest extends js.Object {
    var InstanceId: InstanceId
    var Storage: Storage
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of BundleInstance.
    */
  @js.native
  @Factory
  trait BundleInstanceResult extends js.Object {
    var BundleTask: js.UndefOr[BundleTask]
  }

  /**
    * Describes a bundle task.
    */
  @js.native
  @Factory
  trait BundleTask extends js.Object {
    var BundleId: js.UndefOr[String]
    var BundleTaskError: js.UndefOr[BundleTaskError]
    var InstanceId: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var StartTime: js.UndefOr[DateTime]
    var State: js.UndefOr[BundleTaskState]
    var Storage: js.UndefOr[Storage]
    var UpdateTime: js.UndefOr[DateTime]
  }

  /**
    * Describes an error for <a>BundleInstance</a>.
    */
  @js.native
  @Factory
  trait BundleTaskError extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait BundleTaskState extends js.Any
  object BundleTaskState extends js.Object {
    val pending                = "pending".asInstanceOf[BundleTaskState]
    val `waiting-for-shutdown` = "waiting-for-shutdown".asInstanceOf[BundleTaskState]
    val bundling               = "bundling".asInstanceOf[BundleTaskState]
    val storing                = "storing".asInstanceOf[BundleTaskState]
    val cancelling             = "cancelling".asInstanceOf[BundleTaskState]
    val complete               = "complete".asInstanceOf[BundleTaskState]
    val failed                 = "failed".asInstanceOf[BundleTaskState]

    val values =
      js.Object.freeze(js.Array(pending, `waiting-for-shutdown`, bundling, storing, cancelling, complete, failed))
  }

  /**
    * Information about an address range that is provisioned for use with your AWS resources through bring your own IP addresses (BYOIP).
    */
  @js.native
  @Factory
  trait ByoipCidr extends js.Object {
    var Cidr: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var State: js.UndefOr[ByoipCidrState]
    var StatusMessage: js.UndefOr[String]
  }

  @js.native
  sealed trait ByoipCidrState extends js.Any
  object ByoipCidrState extends js.Object {
    val advertised                              = "advertised".asInstanceOf[ByoipCidrState]
    val deprovisioned                           = "deprovisioned".asInstanceOf[ByoipCidrState]
    val `failed-deprovision`                    = "failed-deprovision".asInstanceOf[ByoipCidrState]
    val `failed-provision`                      = "failed-provision".asInstanceOf[ByoipCidrState]
    val `pending-deprovision`                   = "pending-deprovision".asInstanceOf[ByoipCidrState]
    val `pending-provision`                     = "pending-provision".asInstanceOf[ByoipCidrState]
    val provisioned                             = "provisioned".asInstanceOf[ByoipCidrState]
    val `provisioned-not-publicly-advertisable` = "provisioned-not-publicly-advertisable".asInstanceOf[ByoipCidrState]

    val values = js.Object.freeze(
      js.Array(
        advertised,
        deprovisioned,
        `failed-deprovision`,
        `failed-provision`,
        `pending-deprovision`,
        `pending-provision`,
        provisioned,
        `provisioned-not-publicly-advertisable`
      )
    )
  }

  @js.native
  sealed trait CancelBatchErrorCode extends js.Any
  object CancelBatchErrorCode extends js.Object {
    val fleetRequestIdDoesNotExist        = "fleetRequestIdDoesNotExist".asInstanceOf[CancelBatchErrorCode]
    val fleetRequestIdMalformed           = "fleetRequestIdMalformed".asInstanceOf[CancelBatchErrorCode]
    val fleetRequestNotInCancellableState = "fleetRequestNotInCancellableState".asInstanceOf[CancelBatchErrorCode]
    val unexpectedError                   = "unexpectedError".asInstanceOf[CancelBatchErrorCode]

    val values = js.Object.freeze(
      js.Array(fleetRequestIdDoesNotExist, fleetRequestIdMalformed, fleetRequestNotInCancellableState, unexpectedError)
    )
  }

  /**
    * Contains the parameters for CancelBundleTask.
    */
  @js.native
  @Factory
  trait CancelBundleTaskRequest extends js.Object {
    var BundleId: BundleId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of CancelBundleTask.
    */
  @js.native
  @Factory
  trait CancelBundleTaskResult extends js.Object {
    var BundleTask: js.UndefOr[BundleTask]
  }

  @js.native
  @Factory
  trait CancelCapacityReservationRequest extends js.Object {
    var CapacityReservationId: CapacityReservationId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CancelCapacityReservationResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CancelConversionRequest extends js.Object {
    var ConversionTaskId: ConversionTaskId
    var DryRun: js.UndefOr[Boolean]
    var ReasonMessage: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CancelExportTaskRequest extends js.Object {
    var ExportTaskId: ExportTaskId
  }

  @js.native
  @Factory
  trait CancelImportTaskRequest extends js.Object {
    var CancelReason: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var ImportTaskId: js.UndefOr[ImportTaskId]
  }

  @js.native
  @Factory
  trait CancelImportTaskResult extends js.Object {
    var ImportTaskId: js.UndefOr[String]
    var PreviousState: js.UndefOr[String]
    var State: js.UndefOr[String]
  }

  /**
    * Contains the parameters for CancelReservedInstancesListing.
    */
  @js.native
  @Factory
  trait CancelReservedInstancesListingRequest extends js.Object {
    var ReservedInstancesListingId: ReservedInstancesListingId
  }

  /**
    * Contains the output of CancelReservedInstancesListing.
    */
  @js.native
  @Factory
  trait CancelReservedInstancesListingResult extends js.Object {
    var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList]
  }

  /**
    * Describes a Spot Fleet error.
    */
  @js.native
  @Factory
  trait CancelSpotFleetRequestsError extends js.Object {
    var Code: js.UndefOr[CancelBatchErrorCode]
    var Message: js.UndefOr[String]
  }

  /**
    * Describes a Spot Fleet request that was not successfully canceled.
    */
  @js.native
  @Factory
  trait CancelSpotFleetRequestsErrorItem extends js.Object {
    var Error: js.UndefOr[CancelSpotFleetRequestsError]
    var SpotFleetRequestId: js.UndefOr[String]
  }

  /**
    * Contains the parameters for CancelSpotFleetRequests.
    */
  @js.native
  @Factory
  trait CancelSpotFleetRequestsRequest extends js.Object {
    var SpotFleetRequestIds: SpotFleetRequestIdList
    var TerminateInstances: Boolean
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of CancelSpotFleetRequests.
    */
  @js.native
  @Factory
  trait CancelSpotFleetRequestsResponse extends js.Object {
    var SuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsSuccessSet]
    var UnsuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsErrorSet]
  }

  /**
    * Describes a Spot Fleet request that was successfully canceled.
    */
  @js.native
  @Factory
  trait CancelSpotFleetRequestsSuccessItem extends js.Object {
    var CurrentSpotFleetRequestState: js.UndefOr[BatchState]
    var PreviousSpotFleetRequestState: js.UndefOr[BatchState]
    var SpotFleetRequestId: js.UndefOr[String]
  }

  @js.native
  sealed trait CancelSpotInstanceRequestState extends js.Any
  object CancelSpotInstanceRequestState extends js.Object {
    val active    = "active".asInstanceOf[CancelSpotInstanceRequestState]
    val open      = "open".asInstanceOf[CancelSpotInstanceRequestState]
    val closed    = "closed".asInstanceOf[CancelSpotInstanceRequestState]
    val cancelled = "cancelled".asInstanceOf[CancelSpotInstanceRequestState]
    val completed = "completed".asInstanceOf[CancelSpotInstanceRequestState]

    val values = js.Object.freeze(js.Array(active, open, closed, cancelled, completed))
  }

  /**
    * Contains the parameters for CancelSpotInstanceRequests.
    */
  @js.native
  @Factory
  trait CancelSpotInstanceRequestsRequest extends js.Object {
    var SpotInstanceRequestIds: SpotInstanceRequestIdList
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of CancelSpotInstanceRequests.
    */
  @js.native
  @Factory
  trait CancelSpotInstanceRequestsResult extends js.Object {
    var CancelledSpotInstanceRequests: js.UndefOr[CancelledSpotInstanceRequestList]
  }

  /**
    * Describes a request to cancel a Spot Instance.
    */
  @js.native
  @Factory
  trait CancelledSpotInstanceRequest extends js.Object {
    var SpotInstanceRequestId: js.UndefOr[String]
    var State: js.UndefOr[CancelSpotInstanceRequestState]
  }

  /**
    * Describes a Capacity Reservation.
    */
  @js.native
  @Factory
  trait CapacityReservation extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var AvailabilityZoneId: js.UndefOr[String]
    var AvailableInstanceCount: js.UndefOr[Int]
    var CapacityReservationArn: js.UndefOr[String]
    var CapacityReservationId: js.UndefOr[String]
    var CreateDate: js.UndefOr[DateTime]
    var EbsOptimized: js.UndefOr[Boolean]
    var EndDate: js.UndefOr[DateTime]
    var EndDateType: js.UndefOr[EndDateType]
    var EphemeralStorage: js.UndefOr[Boolean]
    var InstanceMatchCriteria: js.UndefOr[InstanceMatchCriteria]
    var InstancePlatform: js.UndefOr[CapacityReservationInstancePlatform]
    var InstanceType: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var State: js.UndefOr[CapacityReservationState]
    var Tags: js.UndefOr[TagList]
    var Tenancy: js.UndefOr[CapacityReservationTenancy]
    var TotalInstanceCount: js.UndefOr[Int]
  }

  @js.native
  sealed trait CapacityReservationInstancePlatform extends js.Any
  object CapacityReservationInstancePlatform extends js.Object {
    val `Linux/UNIX`               = "Linux/UNIX".asInstanceOf[CapacityReservationInstancePlatform]
    val `Red Hat Enterprise Linux` = "Red Hat Enterprise Linux".asInstanceOf[CapacityReservationInstancePlatform]
    val `SUSE Linux`               = "SUSE Linux".asInstanceOf[CapacityReservationInstancePlatform]
    val Windows                    = "Windows".asInstanceOf[CapacityReservationInstancePlatform]
    val `Windows with SQL Server`  = "Windows with SQL Server".asInstanceOf[CapacityReservationInstancePlatform]
    val `Windows with SQL Server Enterprise` =
      "Windows with SQL Server Enterprise".asInstanceOf[CapacityReservationInstancePlatform]
    val `Windows with SQL Server Standard` =
      "Windows with SQL Server Standard".asInstanceOf[CapacityReservationInstancePlatform]
    val `Windows with SQL Server Web` = "Windows with SQL Server Web".asInstanceOf[CapacityReservationInstancePlatform]
    val `Linux with SQL Server Standard` =
      "Linux with SQL Server Standard".asInstanceOf[CapacityReservationInstancePlatform]
    val `Linux with SQL Server Web` = "Linux with SQL Server Web".asInstanceOf[CapacityReservationInstancePlatform]
    val `Linux with SQL Server Enterprise` =
      "Linux with SQL Server Enterprise".asInstanceOf[CapacityReservationInstancePlatform]

    val values = js.Object.freeze(
      js.Array(
        `Linux/UNIX`,
        `Red Hat Enterprise Linux`,
        `SUSE Linux`,
        Windows,
        `Windows with SQL Server`,
        `Windows with SQL Server Enterprise`,
        `Windows with SQL Server Standard`,
        `Windows with SQL Server Web`,
        `Linux with SQL Server Standard`,
        `Linux with SQL Server Web`,
        `Linux with SQL Server Enterprise`
      )
    )
  }

  /**
    * Describes the strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
    *
    * '''Note:'''This strategy can only be used if the EC2 Fleet is of type <code>instant</code>.
    * For more information about Capacity Reservations, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html|On-Demand Capacity Reservations]] in the <i>Amazon Elastic Compute Cloud User Guide</i>. For examples of using Capacity Reservations in an EC2 Fleet, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-examples.html|EC2 Fleet Example Configurations]] in the <i>Amazon Elastic Compute Cloud User Guide</i>.
    */
  @js.native
  @Factory
  trait CapacityReservationOptions extends js.Object {
    var UsageStrategy: js.UndefOr[FleetCapacityReservationUsageStrategy]
  }

  /**
    * Describes the strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
    *
    * '''Note:'''This strategy can only be used if the EC2 Fleet is of type <code>instant</code>.
    * For more information about Capacity Reservations, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html|On-Demand Capacity Reservations]] in the <i>Amazon Elastic Compute Cloud User Guide</i>. For examples of using Capacity Reservations in an EC2 Fleet, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-examples.html|EC2 Fleet Example Configurations]] in the <i>Amazon Elastic Compute Cloud User Guide</i>.
    */
  @js.native
  @Factory
  trait CapacityReservationOptionsRequest extends js.Object {
    var UsageStrategy: js.UndefOr[FleetCapacityReservationUsageStrategy]
  }

  @js.native
  sealed trait CapacityReservationPreference extends js.Any
  object CapacityReservationPreference extends js.Object {
    val open = "open".asInstanceOf[CapacityReservationPreference]
    val none = "none".asInstanceOf[CapacityReservationPreference]

    val values = js.Object.freeze(js.Array(open, none))
  }

  /**
    * Describes an instance's Capacity Reservation targeting option. You can specify only one parameter at a time. If you specify <code>CapacityReservationPreference</code> and <code>CapacityReservationTarget</code>, the request fails.
    *  Use the <code>CapacityReservationPreference</code> parameter to configure the instance to run as an On-Demand Instance or to run in any <code>open</code> Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). Use the <code>CapacityReservationTarget</code> parameter to explicitly target a specific Capacity Reservation.
    */
  @js.native
  @Factory
  trait CapacityReservationSpecification extends js.Object {
    var CapacityReservationPreference: js.UndefOr[CapacityReservationPreference]
    var CapacityReservationTarget: js.UndefOr[CapacityReservationTarget]
  }

  /**
    * Describes the instance's Capacity Reservation targeting preferences. The action returns the <code>capacityReservationPreference</code> response element if the instance is configured to run in On-Demand capacity, or if it is configured in run in any <code>open</code> Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). The action returns the <code>capacityReservationTarget</code> response element if the instance explicily targets a specific Capacity Reservation.
    */
  @js.native
  @Factory
  trait CapacityReservationSpecificationResponse extends js.Object {
    var CapacityReservationPreference: js.UndefOr[CapacityReservationPreference]
    var CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse]
  }

  @js.native
  sealed trait CapacityReservationState extends js.Any
  object CapacityReservationState extends js.Object {
    val active    = "active".asInstanceOf[CapacityReservationState]
    val expired   = "expired".asInstanceOf[CapacityReservationState]
    val cancelled = "cancelled".asInstanceOf[CapacityReservationState]
    val pending   = "pending".asInstanceOf[CapacityReservationState]
    val failed    = "failed".asInstanceOf[CapacityReservationState]

    val values = js.Object.freeze(js.Array(active, expired, cancelled, pending, failed))
  }

  /**
    * Describes a target Capacity Reservation.
    */
  @js.native
  @Factory
  trait CapacityReservationTarget extends js.Object {
    var CapacityReservationId: js.UndefOr[CapacityReservationId]
  }

  /**
    * Describes a target Capacity Reservation.
    */
  @js.native
  @Factory
  trait CapacityReservationTargetResponse extends js.Object {
    var CapacityReservationId: js.UndefOr[String]
  }

  @js.native
  sealed trait CapacityReservationTenancy extends js.Any
  object CapacityReservationTenancy extends js.Object {
    val default   = "default".asInstanceOf[CapacityReservationTenancy]
    val dedicated = "dedicated".asInstanceOf[CapacityReservationTenancy]

    val values = js.Object.freeze(js.Array(default, dedicated))
  }

  /**
    * Information about the client certificate used for authentication.
    */
  @js.native
  @Factory
  trait CertificateAuthentication extends js.Object {
    var ClientRootCertificateChain: js.UndefOr[String]
  }

  /**
    * Information about the client certificate to be used for authentication.
    */
  @js.native
  @Factory
  trait CertificateAuthenticationRequest extends js.Object {
    var ClientRootCertificateChainArn: js.UndefOr[String]
  }

  /**
    * Provides authorization for Amazon to bring a specific IP address range to a specific AWS account using bring your own IP addresses (BYOIP). For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#prepare-for-byoip|Prepare to Bring Your Address Range to Your AWS Account]] in the <i>Amazon Elastic Compute Cloud User Guide</i>.
    */
  @js.native
  @Factory
  trait CidrAuthorizationContext extends js.Object {
    var Message: String
    var Signature: String
  }

  /**
    * Describes an IPv4 CIDR block.
    */
  @js.native
  @Factory
  trait CidrBlock extends js.Object {
    var CidrBlock: js.UndefOr[String]
  }

  /**
    * Describes the ClassicLink DNS support status of a VPC.
    */
  @js.native
  @Factory
  trait ClassicLinkDnsSupport extends js.Object {
    var ClassicLinkDnsSupported: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes a linked EC2-Classic instance.
    */
  @js.native
  @Factory
  trait ClassicLinkInstance extends js.Object {
    var Groups: js.UndefOr[GroupIdentifierList]
    var InstanceId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes a Classic Load Balancer.
    */
  @js.native
  @Factory
  trait ClassicLoadBalancer extends js.Object {
    var Name: js.UndefOr[String]
  }

  /**
    * Describes the Classic Load Balancers to attach to a Spot Fleet. Spot Fleet registers the running Spot Instances with these Classic Load Balancers.
    */
  @js.native
  @Factory
  trait ClassicLoadBalancersConfig extends js.Object {
    var ClassicLoadBalancers: js.UndefOr[ClassicLoadBalancers]
  }

  /**
    * Describes the state of a client certificate revocation list.
    */
  @js.native
  @Factory
  trait ClientCertificateRevocationListStatus extends js.Object {
    var Code: js.UndefOr[ClientCertificateRevocationListStatusCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait ClientCertificateRevocationListStatusCode extends js.Any
  object ClientCertificateRevocationListStatusCode extends js.Object {
    val pending = "pending".asInstanceOf[ClientCertificateRevocationListStatusCode]
    val active  = "active".asInstanceOf[ClientCertificateRevocationListStatusCode]

    val values = js.Object.freeze(js.Array(pending, active))
  }

  /**
    * Describes the client-specific data.
    */
  @js.native
  @Factory
  trait ClientData extends js.Object {
    var Comment: js.UndefOr[String]
    var UploadEnd: js.UndefOr[DateTime]
    var UploadSize: js.UndefOr[Double]
    var UploadStart: js.UndefOr[DateTime]
  }

  /**
    * Describes the authentication methods used by a Client VPN endpoint. Client VPN supports Active Directory and mutual authentication. For more information, see [[https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/authentication-authrization.html#client-authentication|Authentication]] in the <i>AWS Client VPN Administrator Guide</i>.
    */
  @js.native
  @Factory
  trait ClientVpnAuthentication extends js.Object {
    var ActiveDirectory: js.UndefOr[DirectoryServiceAuthentication]
    var MutualAuthentication: js.UndefOr[CertificateAuthentication]
    var Type: js.UndefOr[ClientVpnAuthenticationType]
  }

  /**
    * Describes the authentication method to be used by a Client VPN endpoint. Client VPN supports Active Directory and mutual authentication. For more information, see [[https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/authentication-authrization.html#client-authentication|Authentication]] in the <i>AWS Client VPN Administrator Guide</i>.
    */
  @js.native
  @Factory
  trait ClientVpnAuthenticationRequest extends js.Object {
    var ActiveDirectory: js.UndefOr[DirectoryServiceAuthenticationRequest]
    var MutualAuthentication: js.UndefOr[CertificateAuthenticationRequest]
    var Type: js.UndefOr[ClientVpnAuthenticationType]
  }

  @js.native
  sealed trait ClientVpnAuthenticationType extends js.Any
  object ClientVpnAuthenticationType extends js.Object {
    val `certificate-authentication` = "certificate-authentication".asInstanceOf[ClientVpnAuthenticationType]
    val `directory-service-authentication` =
      "directory-service-authentication".asInstanceOf[ClientVpnAuthenticationType]

    val values = js.Object.freeze(js.Array(`certificate-authentication`, `directory-service-authentication`))
  }

  /**
    * Describes the state of an authorization rule.
    */
  @js.native
  @Factory
  trait ClientVpnAuthorizationRuleStatus extends js.Object {
    var Code: js.UndefOr[ClientVpnAuthorizationRuleStatusCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait ClientVpnAuthorizationRuleStatusCode extends js.Any
  object ClientVpnAuthorizationRuleStatusCode extends js.Object {
    val authorizing = "authorizing".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]
    val active      = "active".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]
    val failed      = "failed".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]
    val revoking    = "revoking".asInstanceOf[ClientVpnAuthorizationRuleStatusCode]

    val values = js.Object.freeze(js.Array(authorizing, active, failed, revoking))
  }

  /**
    * Describes a client connection.
    */
  @js.native
  @Factory
  trait ClientVpnConnection extends js.Object {
    var ClientIp: js.UndefOr[String]
    var ClientVpnEndpointId: js.UndefOr[String]
    var CommonName: js.UndefOr[String]
    var ConnectionEndTime: js.UndefOr[String]
    var ConnectionEstablishedTime: js.UndefOr[String]
    var ConnectionId: js.UndefOr[String]
    var EgressBytes: js.UndefOr[String]
    var EgressPackets: js.UndefOr[String]
    var IngressBytes: js.UndefOr[String]
    var IngressPackets: js.UndefOr[String]
    var Status: js.UndefOr[ClientVpnConnectionStatus]
    var Timestamp: js.UndefOr[String]
    var Username: js.UndefOr[String]
  }

  /**
    * Describes the status of a client connection.
    */
  @js.native
  @Factory
  trait ClientVpnConnectionStatus extends js.Object {
    var Code: js.UndefOr[ClientVpnConnectionStatusCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait ClientVpnConnectionStatusCode extends js.Any
  object ClientVpnConnectionStatusCode extends js.Object {
    val active                = "active".asInstanceOf[ClientVpnConnectionStatusCode]
    val `failed-to-terminate` = "failed-to-terminate".asInstanceOf[ClientVpnConnectionStatusCode]
    val terminating           = "terminating".asInstanceOf[ClientVpnConnectionStatusCode]
    val terminated            = "terminated".asInstanceOf[ClientVpnConnectionStatusCode]

    val values = js.Object.freeze(js.Array(active, `failed-to-terminate`, terminating, terminated))
  }

  /**
    * Describes a Client VPN endpoint.
    */
  @js.native
  @Factory
  trait ClientVpnEndpoint extends js.Object {
    var AssociatedTargetNetworks: js.UndefOr[AssociatedTargetNetworkSet]
    var AuthenticationOptions: js.UndefOr[ClientVpnAuthenticationList]
    var ClientCidrBlock: js.UndefOr[String]
    var ClientVpnEndpointId: js.UndefOr[String]
    var ConnectionLogOptions: js.UndefOr[ConnectionLogResponseOptions]
    var CreationTime: js.UndefOr[String]
    var DeletionTime: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DnsName: js.UndefOr[String]
    var DnsServers: js.UndefOr[ValueStringList]
    var ServerCertificateArn: js.UndefOr[String]
    var SplitTunnel: js.UndefOr[Boolean]
    var Status: js.UndefOr[ClientVpnEndpointStatus]
    var Tags: js.UndefOr[TagList]
    var TransportProtocol: js.UndefOr[TransportProtocol]
    var VpnPort: js.UndefOr[Int]
    var VpnProtocol: js.UndefOr[VpnProtocol]
  }

  /**
    * Describes the state of a Client VPN endpoint.
    */
  @js.native
  @Factory
  trait ClientVpnEndpointStatus extends js.Object {
    var Code: js.UndefOr[ClientVpnEndpointStatusCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait ClientVpnEndpointStatusCode extends js.Any
  object ClientVpnEndpointStatusCode extends js.Object {
    val `pending-associate` = "pending-associate".asInstanceOf[ClientVpnEndpointStatusCode]
    val available           = "available".asInstanceOf[ClientVpnEndpointStatusCode]
    val deleting            = "deleting".asInstanceOf[ClientVpnEndpointStatusCode]
    val deleted             = "deleted".asInstanceOf[ClientVpnEndpointStatusCode]

    val values = js.Object.freeze(js.Array(`pending-associate`, available, deleting, deleted))
  }

  /**
    * Information about a Client VPN endpoint route.
    */
  @js.native
  @Factory
  trait ClientVpnRoute extends js.Object {
    var ClientVpnEndpointId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DestinationCidr: js.UndefOr[String]
    var Origin: js.UndefOr[String]
    var Status: js.UndefOr[ClientVpnRouteStatus]
    var TargetSubnet: js.UndefOr[String]
    var Type: js.UndefOr[String]
  }

  /**
    * Describes the state of a Client VPN endpoint route.
    */
  @js.native
  @Factory
  trait ClientVpnRouteStatus extends js.Object {
    var Code: js.UndefOr[ClientVpnRouteStatusCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait ClientVpnRouteStatusCode extends js.Any
  object ClientVpnRouteStatusCode extends js.Object {
    val creating = "creating".asInstanceOf[ClientVpnRouteStatusCode]
    val active   = "active".asInstanceOf[ClientVpnRouteStatusCode]
    val failed   = "failed".asInstanceOf[ClientVpnRouteStatusCode]
    val deleting = "deleting".asInstanceOf[ClientVpnRouteStatusCode]

    val values = js.Object.freeze(js.Array(creating, active, failed, deleting))
  }

  /**
    * Describes address usage for a customer-owned address pool.
    */
  @js.native
  @Factory
  trait CoipAddressUsage extends js.Object {
    var AllocationId: js.UndefOr[String]
    var AwsAccountId: js.UndefOr[String]
    var AwsService: js.UndefOr[String]
    var CoIp: js.UndefOr[String]
  }

  /**
    * Describes a customer-owned address pool.
    */
  @js.native
  @Factory
  trait CoipPool extends js.Object {
    var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayRoutetableId]
    var PoolCidrs: js.UndefOr[ValueStringList]
    var PoolId: js.UndefOr[CoipPoolId]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ConfirmProductInstanceRequest extends js.Object {
    var InstanceId: InstanceId
    var ProductCode: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ConfirmProductInstanceResult extends js.Object {
    var OwnerId: js.UndefOr[String]
    var Return: js.UndefOr[Boolean]
  }

  /**
    * Describes the client connection logging options for the Client VPN endpoint.
    */
  @js.native
  @Factory
  trait ConnectionLogOptions extends js.Object {
    var CloudwatchLogGroup: js.UndefOr[String]
    var CloudwatchLogStream: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * Information about the client connection logging options for a Client VPN endpoint.
    */
  @js.native
  @Factory
  trait ConnectionLogResponseOptions extends js.Object {
    var CloudwatchLogGroup: js.UndefOr[String]
    var CloudwatchLogStream: js.UndefOr[String]
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * Describes a connection notification for a VPC endpoint or VPC endpoint service.
    */
  @js.native
  @Factory
  trait ConnectionNotification extends js.Object {
    var ConnectionEvents: js.UndefOr[ValueStringList]
    var ConnectionNotificationArn: js.UndefOr[String]
    var ConnectionNotificationId: js.UndefOr[String]
    var ConnectionNotificationState: js.UndefOr[ConnectionNotificationState]
    var ConnectionNotificationType: js.UndefOr[ConnectionNotificationType]
    var ServiceId: js.UndefOr[String]
    var VpcEndpointId: js.UndefOr[String]
  }

  @js.native
  sealed trait ConnectionNotificationState extends js.Any
  object ConnectionNotificationState extends js.Object {
    val Enabled  = "Enabled".asInstanceOf[ConnectionNotificationState]
    val Disabled = "Disabled".asInstanceOf[ConnectionNotificationState]

    val values = js.Object.freeze(js.Array(Enabled, Disabled))
  }

  @js.native
  sealed trait ConnectionNotificationType extends js.Any
  object ConnectionNotificationType extends js.Object {
    val Topic = "Topic".asInstanceOf[ConnectionNotificationType]

    val values = js.Object.freeze(js.Array(Topic))
  }

  @js.native
  sealed trait ContainerFormat extends js.Any
  object ContainerFormat extends js.Object {
    val ova = "ova".asInstanceOf[ContainerFormat]

    val values = js.Object.freeze(js.Array(ova))
  }

  /**
    * Describes a conversion task.
    */
  @js.native
  @Factory
  trait ConversionTask extends js.Object {
    var ConversionTaskId: js.UndefOr[String]
    var ExpirationTime: js.UndefOr[String]
    var ImportInstance: js.UndefOr[ImportInstanceTaskDetails]
    var ImportVolume: js.UndefOr[ImportVolumeTaskDetails]
    var State: js.UndefOr[ConversionTaskState]
    var StatusMessage: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait ConversionTaskState extends js.Any
  object ConversionTaskState extends js.Object {
    val active     = "active".asInstanceOf[ConversionTaskState]
    val cancelling = "cancelling".asInstanceOf[ConversionTaskState]
    val cancelled  = "cancelled".asInstanceOf[ConversionTaskState]
    val completed  = "completed".asInstanceOf[ConversionTaskState]

    val values = js.Object.freeze(js.Array(active, cancelling, cancelled, completed))
  }

  @js.native
  @Factory
  trait CopyFpgaImageRequest extends js.Object {
    var SourceFpgaImageId: FpgaImageId
    var SourceRegion: String
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CopyFpgaImageResult extends js.Object {
    var FpgaImageId: js.UndefOr[String]
  }

  /**
    * Contains the parameters for CopyImage.
    */
  @js.native
  @Factory
  trait CopyImageRequest extends js.Object {
    var Name: String
    var SourceImageId: String
    var SourceRegion: String
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[KmsKeyId]
  }

  /**
    * Contains the output of CopyImage.
    */
  @js.native
  @Factory
  trait CopyImageResult extends js.Object {
    var ImageId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CopySnapshotRequest extends js.Object {
    var SourceRegion: String
    var SourceSnapshotId: String
    var Description: js.UndefOr[String]
    var DestinationRegion: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var PresignedUrl: js.UndefOr[String]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CopySnapshotResult extends js.Object {
    var SnapshotId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait CopyTagsFromSource extends js.Any
  object CopyTagsFromSource extends js.Object {
    val volume = "volume".asInstanceOf[CopyTagsFromSource]

    val values = js.Object.freeze(js.Array(volume))
  }

  /**
    * The CPU options for the instance.
    */
  @js.native
  @Factory
  trait CpuOptions extends js.Object {
    var CoreCount: js.UndefOr[Int]
    var ThreadsPerCore: js.UndefOr[Int]
  }

  /**
    * The CPU options for the instance. Both the core count and threads per core must be specified in the request.
    */
  @js.native
  @Factory
  trait CpuOptionsRequest extends js.Object {
    var CoreCount: js.UndefOr[Int]
    var ThreadsPerCore: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait CreateCapacityReservationRequest extends js.Object {
    var InstanceCount: Int
    var InstancePlatform: CapacityReservationInstancePlatform
    var InstanceType: String
    var AvailabilityZone: js.UndefOr[String]
    var AvailabilityZoneId: js.UndefOr[String]
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var EbsOptimized: js.UndefOr[Boolean]
    var EndDate: js.UndefOr[DateTime]
    var EndDateType: js.UndefOr[EndDateType]
    var EphemeralStorage: js.UndefOr[Boolean]
    var InstanceMatchCriteria: js.UndefOr[InstanceMatchCriteria]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var Tenancy: js.UndefOr[CapacityReservationTenancy]
  }

  @js.native
  @Factory
  trait CreateCapacityReservationResult extends js.Object {
    var CapacityReservation: js.UndefOr[CapacityReservation]
  }

  @js.native
  @Factory
  trait CreateClientVpnEndpointRequest extends js.Object {
    var AuthenticationOptions: ClientVpnAuthenticationRequestList
    var ClientCidrBlock: String
    var ConnectionLogOptions: ConnectionLogOptions
    var ServerCertificateArn: String
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DnsServers: js.UndefOr[ValueStringList]
    var DryRun: js.UndefOr[Boolean]
    var SplitTunnel: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var TransportProtocol: js.UndefOr[TransportProtocol]
    var VpnPort: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait CreateClientVpnEndpointResult extends js.Object {
    var ClientVpnEndpointId: js.UndefOr[String]
    var DnsName: js.UndefOr[String]
    var Status: js.UndefOr[ClientVpnEndpointStatus]
  }

  @js.native
  @Factory
  trait CreateClientVpnRouteRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DestinationCidrBlock: String
    var TargetVpcSubnetId: SubnetId
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateClientVpnRouteResult extends js.Object {
    var Status: js.UndefOr[ClientVpnRouteStatus]
  }

  /**
    * Contains the parameters for CreateCustomerGateway.
    */
  @js.native
  @Factory
  trait CreateCustomerGatewayRequest extends js.Object {
    var BgpAsn: Int
    var Type: GatewayType
    var CertificateArn: js.UndefOr[String]
    var DeviceName: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var PublicIp: js.UndefOr[String]
  }

  /**
    * Contains the output of CreateCustomerGateway.
    */
  @js.native
  @Factory
  trait CreateCustomerGatewayResult extends js.Object {
    var CustomerGateway: js.UndefOr[CustomerGateway]
  }

  @js.native
  @Factory
  trait CreateDefaultSubnetRequest extends js.Object {
    var AvailabilityZone: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateDefaultSubnetResult extends js.Object {
    var Subnet: js.UndefOr[Subnet]
  }

  @js.native
  @Factory
  trait CreateDefaultVpcRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateDefaultVpcResult extends js.Object {
    var Vpc: js.UndefOr[Vpc]
  }

  @js.native
  @Factory
  trait CreateDhcpOptionsRequest extends js.Object {
    var DhcpConfigurations: NewDhcpConfigurationList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateDhcpOptionsResult extends js.Object {
    var DhcpOptions: js.UndefOr[DhcpOptions]
  }

  @js.native
  @Factory
  trait CreateEgressOnlyInternetGatewayRequest extends js.Object {
    var VpcId: VpcId
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateEgressOnlyInternetGatewayResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var EgressOnlyInternetGateway: js.UndefOr[EgressOnlyInternetGateway]
  }

  /**
    * Describes the instances that could not be launched by the fleet.
    */
  @js.native
  @Factory
  trait CreateFleetError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse]
    var Lifecycle: js.UndefOr[InstanceLifecycle]
  }

  /**
    * Describes the instances that were launched by the fleet.
    */
  @js.native
  @Factory
  trait CreateFleetInstance extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIdsSet]
    var InstanceType: js.UndefOr[InstanceType]
    var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse]
    var Lifecycle: js.UndefOr[InstanceLifecycle]
    var Platform: js.UndefOr[PlatformValues]
  }

  @js.native
  @Factory
  trait CreateFleetRequest extends js.Object {
    var LaunchTemplateConfigs: FleetLaunchTemplateConfigListRequest
    var TargetCapacitySpecification: TargetCapacitySpecificationRequest
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy]
    var OnDemandOptions: js.UndefOr[OnDemandOptionsRequest]
    var ReplaceUnhealthyInstances: js.UndefOr[Boolean]
    var SpotOptions: js.UndefOr[SpotOptionsRequest]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var TerminateInstancesWithExpiration: js.UndefOr[Boolean]
    var Type: js.UndefOr[FleetType]
    var ValidFrom: js.UndefOr[DateTime]
    var ValidUntil: js.UndefOr[DateTime]
  }

  @js.native
  @Factory
  trait CreateFleetResult extends js.Object {
    var Errors: js.UndefOr[CreateFleetErrorsSet]
    var FleetId: js.UndefOr[FleetIdentifier]
    var Instances: js.UndefOr[CreateFleetInstancesSet]
  }

  @js.native
  @Factory
  trait CreateFlowLogsRequest extends js.Object {
    var ResourceIds: FlowLogResourceIds
    var ResourceType: FlowLogsResourceType
    var TrafficType: TrafficType
    var ClientToken: js.UndefOr[String]
    var DeliverLogsPermissionArn: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var LogDestination: js.UndefOr[String]
    var LogDestinationType: js.UndefOr[LogDestinationType]
    var LogFormat: js.UndefOr[String]
    var LogGroupName: js.UndefOr[String]
    var MaxAggregationInterval: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait CreateFlowLogsResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var FlowLogIds: js.UndefOr[ValueStringList]
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  @js.native
  @Factory
  trait CreateFpgaImageRequest extends js.Object {
    var InputStorageLocation: StorageLocation
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var LogsStorageLocation: js.UndefOr[StorageLocation]
    var Name: js.UndefOr[String]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateFpgaImageResult extends js.Object {
    var FpgaImageGlobalId: js.UndefOr[String]
    var FpgaImageId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateImageRequest extends js.Object {
    var InstanceId: InstanceId
    var Name: String
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var NoReboot: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateImageResult extends js.Object {
    var ImageId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateInstanceExportTaskRequest extends js.Object {
    var InstanceId: InstanceId
    var Description: js.UndefOr[String]
    var ExportToS3Task: js.UndefOr[ExportToS3TaskSpecification]
    var TargetEnvironment: js.UndefOr[ExportEnvironment]
  }

  @js.native
  @Factory
  trait CreateInstanceExportTaskResult extends js.Object {
    var ExportTask: js.UndefOr[ExportTask]
  }

  @js.native
  @Factory
  trait CreateInternetGatewayRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateInternetGatewayResult extends js.Object {
    var InternetGateway: js.UndefOr[InternetGateway]
  }

  @js.native
  @Factory
  trait CreateKeyPairRequest extends js.Object {
    var KeyName: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateLaunchTemplateRequest extends js.Object {
    var LaunchTemplateData: RequestLaunchTemplateData
    var LaunchTemplateName: LaunchTemplateName
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  @js.native
  @Factory
  trait CreateLaunchTemplateResult extends js.Object {
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  @js.native
  @Factory
  trait CreateLaunchTemplateVersionRequest extends js.Object {
    var LaunchTemplateData: RequestLaunchTemplateData
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var LaunchTemplateId: js.UndefOr[LaunchTemplateId]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var SourceVersion: js.UndefOr[String]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  @js.native
  @Factory
  trait CreateLaunchTemplateVersionResult extends js.Object {
    var LaunchTemplateVersion: js.UndefOr[LaunchTemplateVersion]
  }

  @js.native
  @Factory
  trait CreateLocalGatewayRouteRequest extends js.Object {
    var DestinationCidrBlock: String
    var LocalGatewayRouteTableId: LocalGatewayRoutetableId
    var LocalGatewayVirtualInterfaceGroupId: LocalGatewayVirtualInterfaceGroupId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateLocalGatewayRouteResult extends js.Object {
    var Route: js.UndefOr[LocalGatewayRoute]
  }

  @js.native
  @Factory
  trait CreateLocalGatewayRouteTableVpcAssociationRequest extends js.Object {
    var LocalGatewayRouteTableId: LocalGatewayRoutetableId
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateLocalGatewayRouteTableVpcAssociationResult extends js.Object {
    var LocalGatewayRouteTableVpcAssociation: js.UndefOr[LocalGatewayRouteTableVpcAssociation]
  }

  @js.native
  @Factory
  trait CreateNatGatewayRequest extends js.Object {
    var AllocationId: AllocationId
    var SubnetId: SubnetId
    var ClientToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateNatGatewayResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var NatGateway: js.UndefOr[NatGateway]
  }

  @js.native
  @Factory
  trait CreateNetworkAclEntryRequest extends js.Object {
    var Egress: Boolean
    var NetworkAclId: NetworkAclId
    var Protocol: String
    var RuleAction: RuleAction
    var RuleNumber: Int
    var CidrBlock: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var IcmpTypeCode: js.UndefOr[IcmpTypeCode]
    var Ipv6CidrBlock: js.UndefOr[String]
    var PortRange: js.UndefOr[PortRange]
  }

  @js.native
  @Factory
  trait CreateNetworkAclRequest extends js.Object {
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateNetworkAclResult extends js.Object {
    var NetworkAcl: js.UndefOr[NetworkAcl]
  }

  /**
    * Contains the parameters for CreateNetworkInterfacePermission.
    */
  @js.native
  @Factory
  trait CreateNetworkInterfacePermissionRequest extends js.Object {
    var NetworkInterfaceId: NetworkInterfaceId
    var Permission: InterfacePermissionType
    var AwsAccountId: js.UndefOr[String]
    var AwsService: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of CreateNetworkInterfacePermission.
    */
  @js.native
  @Factory
  trait CreateNetworkInterfacePermissionResult extends js.Object {
    var InterfacePermission: js.UndefOr[NetworkInterfacePermission]
  }

  /**
    * Contains the parameters for CreateNetworkInterface.
    */
  @js.native
  @Factory
  trait CreateNetworkInterfaceRequest extends js.Object {
    var SubnetId: SubnetId
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Groups: js.UndefOr[SecurityGroupIdStringList]
    var InterfaceType: js.UndefOr[NetworkInterfaceCreationType]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
  }

  /**
    * Contains the output of CreateNetworkInterface.
    */
  @js.native
  @Factory
  trait CreateNetworkInterfaceResult extends js.Object {
    var NetworkInterface: js.UndefOr[NetworkInterface]
  }

  @js.native
  @Factory
  trait CreatePlacementGroupRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupName: js.UndefOr[String]
    var PartitionCount: js.UndefOr[Int]
    var Strategy: js.UndefOr[PlacementStrategy]
  }

  /**
    * Contains the parameters for CreateReservedInstancesListing.
    */
  @js.native
  @Factory
  trait CreateReservedInstancesListingRequest extends js.Object {
    var ClientToken: String
    var InstanceCount: Int
    var PriceSchedules: PriceScheduleSpecificationList
    var ReservedInstancesId: ReservationId
  }

  /**
    * Contains the output of CreateReservedInstancesListing.
    */
  @js.native
  @Factory
  trait CreateReservedInstancesListingResult extends js.Object {
    var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList]
  }

  @js.native
  @Factory
  trait CreateRouteRequest extends js.Object {
    var RouteTableId: RouteTableId
    var DestinationCidrBlock: js.UndefOr[String]
    var DestinationIpv6CidrBlock: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId]
    var GatewayId: js.UndefOr[RouteGatewayId]
    var InstanceId: js.UndefOr[InstanceId]
    var LocalGatewayId: js.UndefOr[LocalGatewayId]
    var NatGatewayId: js.UndefOr[NatGatewayId]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var TransitGatewayId: js.UndefOr[TransitGatewayId]
    var VpcPeeringConnectionId: js.UndefOr[VpcPeeringConnectionId]
  }

  @js.native
  @Factory
  trait CreateRouteResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateRouteTableRequest extends js.Object {
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateRouteTableResult extends js.Object {
    var RouteTable: js.UndefOr[RouteTable]
  }

  @js.native
  @Factory
  trait CreateSecurityGroupRequest extends js.Object {
    var Description: String
    var GroupName: String
    var DryRun: js.UndefOr[Boolean]
    var VpcId: js.UndefOr[VpcId]
  }

  @js.native
  @Factory
  trait CreateSecurityGroupResult extends js.Object {
    var GroupId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateSnapshotRequest extends js.Object {
    var VolumeId: VolumeId
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateSnapshotsRequest extends js.Object {
    var InstanceSpecification: InstanceSpecification
    var CopyTagsFromSource: js.UndefOr[CopyTagsFromSource]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateSnapshotsResult extends js.Object {
    var Snapshots: js.UndefOr[SnapshotSet]
  }

  /**
    * Contains the parameters for CreateSpotDatafeedSubscription.
    */
  @js.native
  @Factory
  trait CreateSpotDatafeedSubscriptionRequest extends js.Object {
    var Bucket: String
    var DryRun: js.UndefOr[Boolean]
    var Prefix: js.UndefOr[String]
  }

  /**
    * Contains the output of CreateSpotDatafeedSubscription.
    */
  @js.native
  @Factory
  trait CreateSpotDatafeedSubscriptionResult extends js.Object {
    var SpotDatafeedSubscription: js.UndefOr[SpotDatafeedSubscription]
  }

  @js.native
  @Factory
  trait CreateSubnetRequest extends js.Object {
    var CidrBlock: String
    var VpcId: VpcId
    var AvailabilityZone: js.UndefOr[String]
    var AvailabilityZoneId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Ipv6CidrBlock: js.UndefOr[String]
    var OutpostArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateSubnetResult extends js.Object {
    var Subnet: js.UndefOr[Subnet]
  }

  @js.native
  @Factory
  trait CreateTagsRequest extends js.Object {
    var Resources: ResourceIdList
    var Tags: TagList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateTrafficMirrorFilterRequest extends js.Object {
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateTrafficMirrorFilterResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var TrafficMirrorFilter: js.UndefOr[TrafficMirrorFilter]
  }

  @js.native
  @Factory
  trait CreateTrafficMirrorFilterRuleRequest extends js.Object {
    var DestinationCidrBlock: String
    var RuleAction: TrafficMirrorRuleAction
    var RuleNumber: Int
    var SourceCidrBlock: String
    var TrafficDirection: TrafficDirection
    var TrafficMirrorFilterId: TrafficMirrorFilterId
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest]
    var DryRun: js.UndefOr[Boolean]
    var Protocol: js.UndefOr[Int]
    var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest]
  }

  @js.native
  @Factory
  trait CreateTrafficMirrorFilterRuleResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var TrafficMirrorFilterRule: js.UndefOr[TrafficMirrorFilterRule]
  }

  @js.native
  @Factory
  trait CreateTrafficMirrorSessionRequest extends js.Object {
    var NetworkInterfaceId: NetworkInterfaceId
    var SessionNumber: Int
    var TrafficMirrorFilterId: TrafficMirrorFilterId
    var TrafficMirrorTargetId: TrafficMirrorTargetId
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var PacketLength: js.UndefOr[Int]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var VirtualNetworkId: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait CreateTrafficMirrorSessionResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var TrafficMirrorSession: js.UndefOr[TrafficMirrorSession]
  }

  @js.native
  @Factory
  trait CreateTrafficMirrorTargetRequest extends js.Object {
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var NetworkLoadBalancerArn: js.UndefOr[String]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateTrafficMirrorTargetResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var TrafficMirrorTarget: js.UndefOr[TrafficMirrorTarget]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayMulticastDomainRequest extends js.Object {
    var TransitGatewayId: TransitGatewayId
    var DryRun: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayMulticastDomainResult extends js.Object {
    var TransitGatewayMulticastDomain: js.UndefOr[TransitGatewayMulticastDomain]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayPeeringAttachmentRequest extends js.Object {
    var PeerAccountId: String
    var PeerRegion: String
    var PeerTransitGatewayId: String
    var TransitGatewayId: TransitGatewayId
    var DryRun: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayPeeringAttachmentResult extends js.Object {
    var TransitGatewayPeeringAttachment: js.UndefOr[TransitGatewayPeeringAttachment]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayRequest extends js.Object {
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Options: js.UndefOr[TransitGatewayRequestOptions]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayResult extends js.Object {
    var TransitGateway: js.UndefOr[TransitGateway]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayRouteRequest extends js.Object {
    var DestinationCidrBlock: String
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var Blackhole: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var TransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayRouteResult extends js.Object {
    var Route: js.UndefOr[TransitGatewayRoute]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayRouteTableRequest extends js.Object {
    var TransitGatewayId: TransitGatewayId
    var DryRun: js.UndefOr[Boolean]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayRouteTableResult extends js.Object {
    var TransitGatewayRouteTable: js.UndefOr[TransitGatewayRouteTable]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayVpcAttachmentRequest extends js.Object {
    var SubnetIds: TransitGatewaySubnetIdList
    var TransitGatewayId: TransitGatewayId
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
    var Options: js.UndefOr[CreateTransitGatewayVpcAttachmentRequestOptions]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  /**
    * Describes the options for a VPC attachment.
    */
  @js.native
  @Factory
  trait CreateTransitGatewayVpcAttachmentRequestOptions extends js.Object {
    var DnsSupport: js.UndefOr[DnsSupportValue]
    var Ipv6Support: js.UndefOr[Ipv6SupportValue]
  }

  @js.native
  @Factory
  trait CreateTransitGatewayVpcAttachmentResult extends js.Object {
    var TransitGatewayVpcAttachment: js.UndefOr[TransitGatewayVpcAttachment]
  }

  /**
    * Describes the user or group to be added or removed from the list of create volume permissions for a volume.
    */
  @js.native
  @Factory
  trait CreateVolumePermission extends js.Object {
    var Group: js.UndefOr[PermissionGroup]
    var UserId: js.UndefOr[String]
  }

  /**
    * Describes modifications to the list of create volume permissions for a volume.
    */
  @js.native
  @Factory
  trait CreateVolumePermissionModifications extends js.Object {
    var Add: js.UndefOr[CreateVolumePermissionList]
    var Remove: js.UndefOr[CreateVolumePermissionList]
  }

  @js.native
  @Factory
  trait CreateVolumeRequest extends js.Object {
    var AvailabilityZone: String
    var DryRun: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var MultiAttachEnabled: js.UndefOr[Boolean]
    var OutpostArn: js.UndefOr[String]
    var Size: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[SnapshotId]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var VolumeType: js.UndefOr[VolumeType]
  }

  @js.native
  @Factory
  trait CreateVpcEndpointConnectionNotificationRequest extends js.Object {
    var ConnectionEvents: ValueStringList
    var ConnectionNotificationArn: String
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var ServiceId: js.UndefOr[VpcEndpointServiceId]
    var VpcEndpointId: js.UndefOr[VpcEndpointId]
  }

  @js.native
  @Factory
  trait CreateVpcEndpointConnectionNotificationResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var ConnectionNotification: js.UndefOr[ConnectionNotification]
  }

  /**
    * Contains the parameters for CreateVpcEndpoint.
    */
  @js.native
  @Factory
  trait CreateVpcEndpointRequest extends js.Object {
    var ServiceName: String
    var VpcId: VpcId
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var PolicyDocument: js.UndefOr[String]
    var PrivateDnsEnabled: js.UndefOr[Boolean]
    var RouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList]
    var SecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList]
    var SubnetIds: js.UndefOr[VpcEndpointSubnetIdList]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var VpcEndpointType: js.UndefOr[VpcEndpointType]
  }

  /**
    * Contains the output of CreateVpcEndpoint.
    */
  @js.native
  @Factory
  trait CreateVpcEndpointResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var VpcEndpoint: js.UndefOr[VpcEndpoint]
  }

  @js.native
  @Factory
  trait CreateVpcEndpointServiceConfigurationRequest extends js.Object {
    var NetworkLoadBalancerArns: ValueStringList
    var AcceptanceRequired: js.UndefOr[Boolean]
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var PrivateDnsName: js.UndefOr[String]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
  }

  @js.native
  @Factory
  trait CreateVpcEndpointServiceConfigurationResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var ServiceConfiguration: js.UndefOr[ServiceConfiguration]
  }

  @js.native
  @Factory
  trait CreateVpcPeeringConnectionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var PeerOwnerId: js.UndefOr[String]
    var PeerRegion: js.UndefOr[String]
    var PeerVpcId: js.UndefOr[String]
    var VpcId: js.UndefOr[VpcId]
  }

  @js.native
  @Factory
  trait CreateVpcPeeringConnectionResult extends js.Object {
    var VpcPeeringConnection: js.UndefOr[VpcPeeringConnection]
  }

  @js.native
  @Factory
  trait CreateVpcRequest extends js.Object {
    var CidrBlock: String
    var AmazonProvidedIpv6CidrBlock: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var InstanceTenancy: js.UndefOr[Tenancy]
    var Ipv6CidrBlock: js.UndefOr[String]
    var Ipv6CidrBlockNetworkBorderGroup: js.UndefOr[String]
    var Ipv6Pool: js.UndefOr[Ipv6PoolEc2Id]
  }

  @js.native
  @Factory
  trait CreateVpcResult extends js.Object {
    var Vpc: js.UndefOr[Vpc]
  }

  /**
    * Contains the parameters for CreateVpnConnection.
    */
  @js.native
  @Factory
  trait CreateVpnConnectionRequest extends js.Object {
    var CustomerGatewayId: CustomerGatewayId
    var Type: String
    var DryRun: js.UndefOr[Boolean]
    var Options: js.UndefOr[VpnConnectionOptionsSpecification]
    var TransitGatewayId: js.UndefOr[TransitGatewayId]
    var VpnGatewayId: js.UndefOr[VpnGatewayId]
  }

  /**
    * Contains the output of CreateVpnConnection.
    */
  @js.native
  @Factory
  trait CreateVpnConnectionResult extends js.Object {
    var VpnConnection: js.UndefOr[VpnConnection]
  }

  /**
    * Contains the parameters for CreateVpnConnectionRoute.
    */
  @js.native
  @Factory
  trait CreateVpnConnectionRouteRequest extends js.Object {
    var DestinationCidrBlock: String
    var VpnConnectionId: VpnConnectionId
  }

  /**
    * Contains the parameters for CreateVpnGateway.
    */
  @js.native
  @Factory
  trait CreateVpnGatewayRequest extends js.Object {
    var Type: GatewayType
    var AmazonSideAsn: js.UndefOr[Double]
    var AvailabilityZone: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of CreateVpnGateway.
    */
  @js.native
  @Factory
  trait CreateVpnGatewayResult extends js.Object {
    var VpnGateway: js.UndefOr[VpnGateway]
  }

  /**
    * Describes the credit option for CPU usage of a T2 or T3 instance.
    */
  @js.native
  @Factory
  trait CreditSpecification extends js.Object {
    var CpuCredits: js.UndefOr[String]
  }

  /**
    * The credit option for CPU usage of a T2 or T3 instance.
    */
  @js.native
  @Factory
  trait CreditSpecificationRequest extends js.Object {
    var CpuCredits: String
  }

  @js.native
  sealed trait CurrencyCodeValues extends js.Any
  object CurrencyCodeValues extends js.Object {
    val USD = "USD".asInstanceOf[CurrencyCodeValues]

    val values = js.Object.freeze(js.Array(USD))
  }

  /**
    * Describes a customer gateway.
    */
  @js.native
  @Factory
  trait CustomerGateway extends js.Object {
    var BgpAsn: js.UndefOr[String]
    var CertificateArn: js.UndefOr[String]
    var CustomerGatewayId: js.UndefOr[String]
    var DeviceName: js.UndefOr[String]
    var IpAddress: js.UndefOr[String]
    var State: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[String]
  }

  @js.native
  sealed trait DatafeedSubscriptionState extends js.Any
  object DatafeedSubscriptionState extends js.Object {
    val Active   = "Active".asInstanceOf[DatafeedSubscriptionState]
    val Inactive = "Inactive".asInstanceOf[DatafeedSubscriptionState]

    val values = js.Object.freeze(js.Array(Active, Inactive))
  }

  @js.native
  sealed trait DefaultRouteTableAssociationValue extends js.Any
  object DefaultRouteTableAssociationValue extends js.Object {
    val enable  = "enable".asInstanceOf[DefaultRouteTableAssociationValue]
    val disable = "disable".asInstanceOf[DefaultRouteTableAssociationValue]

    val values = js.Object.freeze(js.Array(enable, disable))
  }

  @js.native
  sealed trait DefaultRouteTablePropagationValue extends js.Any
  object DefaultRouteTablePropagationValue extends js.Object {
    val enable  = "enable".asInstanceOf[DefaultRouteTablePropagationValue]
    val disable = "disable".asInstanceOf[DefaultRouteTablePropagationValue]

    val values = js.Object.freeze(js.Array(enable, disable))
  }

  @js.native
  sealed trait DefaultTargetCapacityType extends js.Any
  object DefaultTargetCapacityType extends js.Object {
    val spot        = "spot".asInstanceOf[DefaultTargetCapacityType]
    val `on-demand` = "on-demand".asInstanceOf[DefaultTargetCapacityType]

    val values = js.Object.freeze(js.Array(spot, `on-demand`))
  }

  @js.native
  @Factory
  trait DeleteClientVpnEndpointRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteClientVpnEndpointResult extends js.Object {
    var Status: js.UndefOr[ClientVpnEndpointStatus]
  }

  @js.native
  @Factory
  trait DeleteClientVpnRouteRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DestinationCidrBlock: String
    var DryRun: js.UndefOr[Boolean]
    var TargetVpcSubnetId: js.UndefOr[SubnetId]
  }

  @js.native
  @Factory
  trait DeleteClientVpnRouteResult extends js.Object {
    var Status: js.UndefOr[ClientVpnRouteStatus]
  }

  /**
    * Contains the parameters for DeleteCustomerGateway.
    */
  @js.native
  @Factory
  trait DeleteCustomerGatewayRequest extends js.Object {
    var CustomerGatewayId: CustomerGatewayId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteDhcpOptionsRequest extends js.Object {
    var DhcpOptionsId: DhcpOptionsId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteEgressOnlyInternetGatewayRequest extends js.Object {
    var EgressOnlyInternetGatewayId: EgressOnlyInternetGatewayId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteEgressOnlyInternetGatewayResult extends js.Object {
    var ReturnCode: js.UndefOr[Boolean]
  }

  /**
    * Describes an EC2 Fleet error.
    */
  @js.native
  @Factory
  trait DeleteFleetError extends js.Object {
    var Code: js.UndefOr[DeleteFleetErrorCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait DeleteFleetErrorCode extends js.Any
  object DeleteFleetErrorCode extends js.Object {
    val fleetIdDoesNotExist      = "fleetIdDoesNotExist".asInstanceOf[DeleteFleetErrorCode]
    val fleetIdMalformed         = "fleetIdMalformed".asInstanceOf[DeleteFleetErrorCode]
    val fleetNotInDeletableState = "fleetNotInDeletableState".asInstanceOf[DeleteFleetErrorCode]
    val unexpectedError          = "unexpectedError".asInstanceOf[DeleteFleetErrorCode]

    val values =
      js.Object.freeze(js.Array(fleetIdDoesNotExist, fleetIdMalformed, fleetNotInDeletableState, unexpectedError))
  }

  /**
    * Describes an EC2 Fleet that was not successfully deleted.
    */
  @js.native
  @Factory
  trait DeleteFleetErrorItem extends js.Object {
    var Error: js.UndefOr[DeleteFleetError]
    var FleetId: js.UndefOr[FleetIdentifier]
  }

  /**
    * Describes an EC2 Fleet that was successfully deleted.
    */
  @js.native
  @Factory
  trait DeleteFleetSuccessItem extends js.Object {
    var CurrentFleetState: js.UndefOr[FleetStateCode]
    var FleetId: js.UndefOr[FleetIdentifier]
    var PreviousFleetState: js.UndefOr[FleetStateCode]
  }

  @js.native
  @Factory
  trait DeleteFleetsRequest extends js.Object {
    var FleetIds: FleetIdSet
    var TerminateInstances: Boolean
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteFleetsResult extends js.Object {
    var SuccessfulFleetDeletions: js.UndefOr[DeleteFleetSuccessSet]
    var UnsuccessfulFleetDeletions: js.UndefOr[DeleteFleetErrorSet]
  }

  @js.native
  @Factory
  trait DeleteFlowLogsRequest extends js.Object {
    var FlowLogIds: FlowLogIdList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteFlowLogsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  @js.native
  @Factory
  trait DeleteFpgaImageRequest extends js.Object {
    var FpgaImageId: FpgaImageId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteFpgaImageResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteInternetGatewayRequest extends js.Object {
    var InternetGatewayId: InternetGatewayId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteKeyPairRequest extends js.Object {
    var KeyName: KeyPairName
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteLaunchTemplateRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var LaunchTemplateId: js.UndefOr[LaunchTemplateId]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
  }

  @js.native
  @Factory
  trait DeleteLaunchTemplateResult extends js.Object {
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  @js.native
  @Factory
  trait DeleteLaunchTemplateVersionsRequest extends js.Object {
    var Versions: VersionStringList
    var DryRun: js.UndefOr[Boolean]
    var LaunchTemplateId: js.UndefOr[LaunchTemplateId]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
  }

  /**
    * Describes a launch template version that could not be deleted.
    */
  @js.native
  @Factory
  trait DeleteLaunchTemplateVersionsResponseErrorItem extends js.Object {
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[String]
    var ResponseError: js.UndefOr[ResponseError]
    var VersionNumber: js.UndefOr[Double]
  }

  /**
    * Describes a launch template version that was successfully deleted.
    */
  @js.native
  @Factory
  trait DeleteLaunchTemplateVersionsResponseSuccessItem extends js.Object {
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[String]
    var VersionNumber: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait DeleteLaunchTemplateVersionsResult extends js.Object {
    var SuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseSuccessSet]
    var UnsuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseErrorSet]
  }

  @js.native
  @Factory
  trait DeleteLocalGatewayRouteRequest extends js.Object {
    var DestinationCidrBlock: String
    var LocalGatewayRouteTableId: LocalGatewayRoutetableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteLocalGatewayRouteResult extends js.Object {
    var Route: js.UndefOr[LocalGatewayRoute]
  }

  @js.native
  @Factory
  trait DeleteLocalGatewayRouteTableVpcAssociationRequest extends js.Object {
    var LocalGatewayRouteTableVpcAssociationId: LocalGatewayRouteTableVpcAssociationId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteLocalGatewayRouteTableVpcAssociationResult extends js.Object {
    var LocalGatewayRouteTableVpcAssociation: js.UndefOr[LocalGatewayRouteTableVpcAssociation]
  }

  @js.native
  @Factory
  trait DeleteNatGatewayRequest extends js.Object {
    var NatGatewayId: NatGatewayId
  }

  @js.native
  @Factory
  trait DeleteNatGatewayResult extends js.Object {
    var NatGatewayId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteNetworkAclEntryRequest extends js.Object {
    var Egress: Boolean
    var NetworkAclId: NetworkAclId
    var RuleNumber: Int
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteNetworkAclRequest extends js.Object {
    var NetworkAclId: NetworkAclId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for DeleteNetworkInterfacePermission.
    */
  @js.native
  @Factory
  trait DeleteNetworkInterfacePermissionRequest extends js.Object {
    var NetworkInterfacePermissionId: NetworkInterfacePermissionId
    var DryRun: js.UndefOr[Boolean]
    var Force: js.UndefOr[Boolean]
  }

  /**
    * Contains the output for DeleteNetworkInterfacePermission.
    */
  @js.native
  @Factory
  trait DeleteNetworkInterfacePermissionResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for DeleteNetworkInterface.
    */
  @js.native
  @Factory
  trait DeleteNetworkInterfaceRequest extends js.Object {
    var NetworkInterfaceId: NetworkInterfaceId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeletePlacementGroupRequest extends js.Object {
    var GroupName: PlacementGroupName
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Describes the error for a Reserved Instance whose queued purchase could not be deleted.
    */
  @js.native
  @Factory
  trait DeleteQueuedReservedInstancesError extends js.Object {
    var Code: js.UndefOr[DeleteQueuedReservedInstancesErrorCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait DeleteQueuedReservedInstancesErrorCode extends js.Any
  object DeleteQueuedReservedInstancesErrorCode extends js.Object {
    val `reserved-instances-id-invalid` =
      "reserved-instances-id-invalid".asInstanceOf[DeleteQueuedReservedInstancesErrorCode]
    val `reserved-instances-not-in-queued-state` =
      "reserved-instances-not-in-queued-state".asInstanceOf[DeleteQueuedReservedInstancesErrorCode]
    val `unexpected-error` = "unexpected-error".asInstanceOf[DeleteQueuedReservedInstancesErrorCode]

    val values = js.Object.freeze(
      js.Array(`reserved-instances-id-invalid`, `reserved-instances-not-in-queued-state`, `unexpected-error`)
    )
  }

  @js.native
  @Factory
  trait DeleteQueuedReservedInstancesRequest extends js.Object {
    var ReservedInstancesIds: DeleteQueuedReservedInstancesIdList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteQueuedReservedInstancesResult extends js.Object {
    var FailedQueuedPurchaseDeletions: js.UndefOr[FailedQueuedPurchaseDeletionSet]
    var SuccessfulQueuedPurchaseDeletions: js.UndefOr[SuccessfulQueuedPurchaseDeletionSet]
  }

  @js.native
  @Factory
  trait DeleteRouteRequest extends js.Object {
    var RouteTableId: RouteTableId
    var DestinationCidrBlock: js.UndefOr[String]
    var DestinationIpv6CidrBlock: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteRouteTableRequest extends js.Object {
    var RouteTableId: RouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteSecurityGroupRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupId: js.UndefOr[SecurityGroupId]
    var GroupName: js.UndefOr[SecurityGroupName]
  }

  @js.native
  @Factory
  trait DeleteSnapshotRequest extends js.Object {
    var SnapshotId: SnapshotId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for DeleteSpotDatafeedSubscription.
    */
  @js.native
  @Factory
  trait DeleteSpotDatafeedSubscriptionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteSubnetRequest extends js.Object {
    var SubnetId: SubnetId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTagsRequest extends js.Object {
    var Resources: ResourceIdList
    var DryRun: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait DeleteTrafficMirrorFilterRequest extends js.Object {
    var TrafficMirrorFilterId: TrafficMirrorFilterId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTrafficMirrorFilterResult extends js.Object {
    var TrafficMirrorFilterId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteTrafficMirrorFilterRuleRequest extends js.Object {
    var TrafficMirrorFilterRuleId: TrafficMirrorFilterRuleId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTrafficMirrorFilterRuleResult extends js.Object {
    var TrafficMirrorFilterRuleId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteTrafficMirrorSessionRequest extends js.Object {
    var TrafficMirrorSessionId: TrafficMirrorSessionId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTrafficMirrorSessionResult extends js.Object {
    var TrafficMirrorSessionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteTrafficMirrorTargetRequest extends js.Object {
    var TrafficMirrorTargetId: TrafficMirrorTargetId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTrafficMirrorTargetResult extends js.Object {
    var TrafficMirrorTargetId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayMulticastDomainRequest extends js.Object {
    var TransitGatewayMulticastDomainId: TransitGatewayMulticastDomainId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayMulticastDomainResult extends js.Object {
    var TransitGatewayMulticastDomain: js.UndefOr[TransitGatewayMulticastDomain]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayPeeringAttachmentRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayPeeringAttachmentResult extends js.Object {
    var TransitGatewayPeeringAttachment: js.UndefOr[TransitGatewayPeeringAttachment]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayRequest extends js.Object {
    var TransitGatewayId: TransitGatewayId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayResult extends js.Object {
    var TransitGateway: js.UndefOr[TransitGateway]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayRouteRequest extends js.Object {
    var DestinationCidrBlock: String
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayRouteResult extends js.Object {
    var Route: js.UndefOr[TransitGatewayRoute]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayRouteTableRequest extends js.Object {
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayRouteTableResult extends js.Object {
    var TransitGatewayRouteTable: js.UndefOr[TransitGatewayRouteTable]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayVpcAttachmentRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteTransitGatewayVpcAttachmentResult extends js.Object {
    var TransitGatewayVpcAttachment: js.UndefOr[TransitGatewayVpcAttachment]
  }

  @js.native
  @Factory
  trait DeleteVolumeRequest extends js.Object {
    var VolumeId: VolumeId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteVpcEndpointConnectionNotificationsRequest extends js.Object {
    var ConnectionNotificationIds: ValueStringList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteVpcEndpointConnectionNotificationsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  @js.native
  @Factory
  trait DeleteVpcEndpointServiceConfigurationsRequest extends js.Object {
    var ServiceIds: VpcEndpointServiceIdList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteVpcEndpointServiceConfigurationsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  /**
    * Contains the parameters for DeleteVpcEndpoints.
    */
  @js.native
  @Factory
  trait DeleteVpcEndpointsRequest extends js.Object {
    var VpcEndpointIds: VpcEndpointIdList
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of DeleteVpcEndpoints.
    */
  @js.native
  @Factory
  trait DeleteVpcEndpointsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  @js.native
  @Factory
  trait DeleteVpcPeeringConnectionRequest extends js.Object {
    var VpcPeeringConnectionId: VpcPeeringConnectionId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteVpcPeeringConnectionResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeleteVpcRequest extends js.Object {
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for DeleteVpnConnection.
    */
  @js.native
  @Factory
  trait DeleteVpnConnectionRequest extends js.Object {
    var VpnConnectionId: VpnConnectionId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for DeleteVpnConnectionRoute.
    */
  @js.native
  @Factory
  trait DeleteVpnConnectionRouteRequest extends js.Object {
    var DestinationCidrBlock: String
    var VpnConnectionId: VpnConnectionId
  }

  /**
    * Contains the parameters for DeleteVpnGateway.
    */
  @js.native
  @Factory
  trait DeleteVpnGatewayRequest extends js.Object {
    var VpnGatewayId: VpnGatewayId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeprovisionByoipCidrRequest extends js.Object {
    var Cidr: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeprovisionByoipCidrResult extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  /**
    * Contains the parameters for DeregisterImage.
    */
  @js.native
  @Factory
  trait DeregisterImageRequest extends js.Object {
    var ImageId: ImageId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DeregisterTransitGatewayMulticastGroupMembersRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupIpAddress: js.UndefOr[String]
    var NetworkInterfaceIds: js.UndefOr[TransitGatewayNetworkInterfaceIdList]
    var TransitGatewayMulticastDomainId: js.UndefOr[TransitGatewayMulticastDomainId]
  }

  @js.native
  @Factory
  trait DeregisterTransitGatewayMulticastGroupMembersResult extends js.Object {
    var DeregisteredMulticastGroupMembers: js.UndefOr[TransitGatewayMulticastDeregisteredGroupMembers]
  }

  @js.native
  @Factory
  trait DeregisterTransitGatewayMulticastGroupSourcesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupIpAddress: js.UndefOr[String]
    var NetworkInterfaceIds: js.UndefOr[TransitGatewayNetworkInterfaceIdList]
    var TransitGatewayMulticastDomainId: js.UndefOr[TransitGatewayMulticastDomainId]
  }

  @js.native
  @Factory
  trait DeregisterTransitGatewayMulticastGroupSourcesResult extends js.Object {
    var DeregisteredMulticastGroupSources: js.UndefOr[TransitGatewayMulticastDeregisteredGroupSources]
  }

  @js.native
  @Factory
  trait DescribeAccountAttributesRequest extends js.Object {
    var AttributeNames: js.UndefOr[AccountAttributeNameStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeAccountAttributesResult extends js.Object {
    var AccountAttributes: js.UndefOr[AccountAttributeList]
  }

  @js.native
  @Factory
  trait DescribeAddressesRequest extends js.Object {
    var AllocationIds: js.UndefOr[AllocationIdList]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var PublicIps: js.UndefOr[PublicIpStringList]
  }

  @js.native
  @Factory
  trait DescribeAddressesResult extends js.Object {
    var Addresses: js.UndefOr[AddressList]
  }

  @js.native
  @Factory
  trait DescribeAggregateIdFormatRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeAggregateIdFormatResult extends js.Object {
    var Statuses: js.UndefOr[IdFormatList]
    var UseLongIdsAggregated: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeAvailabilityZonesRequest extends js.Object {
    var AllAvailabilityZones: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var ZoneIds: js.UndefOr[ZoneIdStringList]
    var ZoneNames: js.UndefOr[ZoneNameStringList]
  }

  @js.native
  @Factory
  trait DescribeAvailabilityZonesResult extends js.Object {
    var AvailabilityZones: js.UndefOr[AvailabilityZoneList]
  }

  @js.native
  @Factory
  trait DescribeBundleTasksRequest extends js.Object {
    var BundleIds: js.UndefOr[BundleIdStringList]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
  }

  @js.native
  @Factory
  trait DescribeBundleTasksResult extends js.Object {
    var BundleTasks: js.UndefOr[BundleTaskList]
  }

  @js.native
  @Factory
  trait DescribeByoipCidrsRequest extends js.Object {
    var MaxResults: DescribeByoipCidrsMaxResults
    var DryRun: js.UndefOr[Boolean]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeByoipCidrsResult extends js.Object {
    var ByoipCidrs: js.UndefOr[ByoipCidrSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeCapacityReservationsRequest extends js.Object {
    var CapacityReservationIds: js.UndefOr[CapacityReservationIdSet]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeCapacityReservationsMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeCapacityReservationsResult extends js.Object {
    var CapacityReservations: js.UndefOr[CapacityReservationSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeClassicLinkInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var MaxResults: js.UndefOr[DescribeClassicLinkInstancesMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeClassicLinkInstancesResult extends js.Object {
    var Instances: js.UndefOr[ClassicLinkInstanceList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeClientVpnAuthorizationRulesRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeClientVpnAuthorizationRulesMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClientVpnAuthorizationRulesResult extends js.Object {
    var AuthorizationRules: js.UndefOr[AuthorizationRuleSet]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClientVpnConnectionsRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeClientVpnConnectionsMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClientVpnConnectionsResult extends js.Object {
    var Connections: js.UndefOr[ClientVpnConnectionSet]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClientVpnEndpointsRequest extends js.Object {
    var ClientVpnEndpointIds: js.UndefOr[ClientVpnEndpointIdList]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeClientVpnEndpointMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClientVpnEndpointsResult extends js.Object {
    var ClientVpnEndpoints: js.UndefOr[EndpointSet]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClientVpnRoutesRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeClientVpnRoutesMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClientVpnRoutesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Routes: js.UndefOr[ClientVpnRouteSet]
  }

  @js.native
  @Factory
  trait DescribeClientVpnTargetNetworksRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var AssociationIds: js.UndefOr[ValueStringList]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeClientVpnTargetNetworksMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeClientVpnTargetNetworksResult extends js.Object {
    var ClientVpnTargetNetworks: js.UndefOr[TargetNetworkSet]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeCoipPoolsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[CoipPoolMaxResults]
    var NextToken: js.UndefOr[String]
    var PoolIds: js.UndefOr[CoipPoolIdSet]
  }

  @js.native
  @Factory
  trait DescribeCoipPoolsResult extends js.Object {
    var CoipPools: js.UndefOr[CoipPoolSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeConversionTasksRequest extends js.Object {
    var ConversionTaskIds: js.UndefOr[ConversionIdStringList]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeConversionTasksResult extends js.Object {
    var ConversionTasks: js.UndefOr[DescribeConversionTaskList]
  }

  /**
    * Contains the parameters for DescribeCustomerGateways.
    */
  @js.native
  @Factory
  trait DescribeCustomerGatewaysRequest extends js.Object {
    var CustomerGatewayIds: js.UndefOr[CustomerGatewayIdStringList]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
  }

  /**
    * Contains the output of DescribeCustomerGateways.
    */
  @js.native
  @Factory
  trait DescribeCustomerGatewaysResult extends js.Object {
    var CustomerGateways: js.UndefOr[CustomerGatewayList]
  }

  @js.native
  @Factory
  trait DescribeDhcpOptionsRequest extends js.Object {
    var DhcpOptionsIds: js.UndefOr[DhcpOptionsIdStringList]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeDhcpOptionsMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeDhcpOptionsResult extends js.Object {
    var DhcpOptions: js.UndefOr[DhcpOptionsList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeEgressOnlyInternetGatewaysRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var EgressOnlyInternetGatewayIds: js.UndefOr[EgressOnlyInternetGatewayIdList]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeEgressOnlyInternetGatewaysMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeEgressOnlyInternetGatewaysResult extends js.Object {
    var EgressOnlyInternetGateways: js.UndefOr[EgressOnlyInternetGatewayList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeElasticGpusRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ElasticGpuIds: js.UndefOr[ElasticGpuIdSet]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeElasticGpusMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeElasticGpusResult extends js.Object {
    var ElasticGpuSet: js.UndefOr[ElasticGpuSet]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeExportImageTasksRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ExportImageTaskIds: js.UndefOr[ExportImageTaskIdList]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeExportImageTasksMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeExportImageTasksResult extends js.Object {
    var ExportImageTasks: js.UndefOr[ExportImageTaskList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeExportTasksRequest extends js.Object {
    var ExportTaskIds: js.UndefOr[ExportTaskIdStringList]
    var Filters: js.UndefOr[FilterList]
  }

  @js.native
  @Factory
  trait DescribeExportTasksResult extends js.Object {
    var ExportTasks: js.UndefOr[ExportTaskList]
  }

  /**
    * Describes fast snapshot restores for a snapshot.
    */
  @js.native
  @Factory
  trait DescribeFastSnapshotRestoreSuccessItem extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var DisabledTime: js.UndefOr[MillisecondDateTime]
    var DisablingTime: js.UndefOr[MillisecondDateTime]
    var EnabledTime: js.UndefOr[MillisecondDateTime]
    var EnablingTime: js.UndefOr[MillisecondDateTime]
    var OptimizingTime: js.UndefOr[MillisecondDateTime]
    var OwnerAlias: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var State: js.UndefOr[FastSnapshotRestoreStateCode]
    var StateTransitionReason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeFastSnapshotRestoresRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeFastSnapshotRestoresMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeFastSnapshotRestoresResult extends js.Object {
    var FastSnapshotRestores: js.UndefOr[DescribeFastSnapshotRestoreSuccessSet]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Describes the instances that could not be launched by the fleet.
    */
  @js.native
  @Factory
  trait DescribeFleetError extends js.Object {
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse]
    var Lifecycle: js.UndefOr[InstanceLifecycle]
  }

  @js.native
  @Factory
  trait DescribeFleetHistoryRequest extends js.Object {
    var FleetId: FleetIdentifier
    var StartTime: DateTime
    var DryRun: js.UndefOr[Boolean]
    var EventType: js.UndefOr[FleetEventType]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeFleetHistoryResult extends js.Object {
    var FleetId: js.UndefOr[FleetIdentifier]
    var HistoryRecords: js.UndefOr[HistoryRecordSet]
    var LastEvaluatedTime: js.UndefOr[DateTime]
    var NextToken: js.UndefOr[String]
    var StartTime: js.UndefOr[DateTime]
  }

  @js.native
  @Factory
  trait DescribeFleetInstancesRequest extends js.Object {
    var FleetId: FleetIdentifier
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeFleetInstancesResult extends js.Object {
    var ActiveInstances: js.UndefOr[ActiveInstanceSet]
    var FleetId: js.UndefOr[FleetIdentifier]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Describes the instances that were launched by the fleet.
    */
  @js.native
  @Factory
  trait DescribeFleetsInstances extends js.Object {
    var InstanceIds: js.UndefOr[InstanceIdsSet]
    var InstanceType: js.UndefOr[InstanceType]
    var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse]
    var Lifecycle: js.UndefOr[InstanceLifecycle]
    var Platform: js.UndefOr[PlatformValues]
  }

  @js.native
  @Factory
  trait DescribeFleetsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var FleetIds: js.UndefOr[FleetIdSet]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeFleetsResult extends js.Object {
    var Fleets: js.UndefOr[FleetSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeFlowLogsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filter: js.UndefOr[FilterList]
    var FlowLogIds: js.UndefOr[FlowLogIdList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeFlowLogsResult extends js.Object {
    var FlowLogs: js.UndefOr[FlowLogSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeFpgaImageAttributeRequest extends js.Object {
    var Attribute: FpgaImageAttributeName
    var FpgaImageId: FpgaImageId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeFpgaImageAttributeResult extends js.Object {
    var FpgaImageAttribute: js.UndefOr[FpgaImageAttribute]
  }

  @js.native
  @Factory
  trait DescribeFpgaImagesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var FpgaImageIds: js.UndefOr[FpgaImageIdList]
    var MaxResults: js.UndefOr[DescribeFpgaImagesMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var Owners: js.UndefOr[OwnerStringList]
  }

  @js.native
  @Factory
  trait DescribeFpgaImagesResult extends js.Object {
    var FpgaImages: js.UndefOr[FpgaImageList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeHostReservationOfferingsRequest extends js.Object {
    var Filter: js.UndefOr[FilterList]
    var MaxDuration: js.UndefOr[Int]
    var MaxResults: js.UndefOr[DescribeHostReservationsMaxResults]
    var MinDuration: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var OfferingId: js.UndefOr[OfferingId]
  }

  @js.native
  @Factory
  trait DescribeHostReservationOfferingsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var OfferingSet: js.UndefOr[HostOfferingSet]
  }

  @js.native
  @Factory
  trait DescribeHostReservationsRequest extends js.Object {
    var Filter: js.UndefOr[FilterList]
    var HostReservationIdSet: js.UndefOr[HostReservationIdSet]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeHostReservationsResult extends js.Object {
    var HostReservationSet: js.UndefOr[HostReservationSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeHostsRequest extends js.Object {
    var Filter: js.UndefOr[FilterList]
    var HostIds: js.UndefOr[RequestHostIdList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeHostsResult extends js.Object {
    var Hosts: js.UndefOr[HostList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeIamInstanceProfileAssociationsRequest extends js.Object {
    var AssociationIds: js.UndefOr[AssociationIdList]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeIamInstanceProfileAssociationsMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeIamInstanceProfileAssociationsResult extends js.Object {
    var IamInstanceProfileAssociations: js.UndefOr[IamInstanceProfileAssociationSet]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeIdFormatRequest extends js.Object {
    var Resource: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeIdFormatResult extends js.Object {
    var Statuses: js.UndefOr[IdFormatList]
  }

  @js.native
  @Factory
  trait DescribeIdentityIdFormatRequest extends js.Object {
    var PrincipalArn: String
    var Resource: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeIdentityIdFormatResult extends js.Object {
    var Statuses: js.UndefOr[IdFormatList]
  }

  /**
    * Contains the parameters for DescribeImageAttribute.
    */
  @js.native
  @Factory
  trait DescribeImageAttributeRequest extends js.Object {
    var Attribute: ImageAttributeName
    var ImageId: ImageId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeImagesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var ExecutableUsers: js.UndefOr[ExecutableByStringList]
    var Filters: js.UndefOr[FilterList]
    var ImageIds: js.UndefOr[ImageIdStringList]
    var Owners: js.UndefOr[OwnerStringList]
  }

  @js.native
  @Factory
  trait DescribeImagesResult extends js.Object {
    var Images: js.UndefOr[ImageList]
  }

  @js.native
  @Factory
  trait DescribeImportImageTasksRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var ImportTaskIds: js.UndefOr[ImportTaskIdList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeImportImageTasksResult extends js.Object {
    var ImportImageTasks: js.UndefOr[ImportImageTaskList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeImportSnapshotTasksRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var ImportTaskIds: js.UndefOr[ImportSnapshotTaskIdList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeImportSnapshotTasksResult extends js.Object {
    var ImportSnapshotTasks: js.UndefOr[ImportSnapshotTaskList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeInstanceAttributeRequest extends js.Object {
    var Attribute: InstanceAttributeName
    var InstanceId: InstanceId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeInstanceCreditSpecificationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var MaxResults: js.UndefOr[DescribeInstanceCreditSpecificationsMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeInstanceCreditSpecificationsResult extends js.Object {
    var InstanceCreditSpecifications: js.UndefOr[InstanceCreditSpecificationList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeInstanceStatusRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var IncludeAllInstances: js.UndefOr[Boolean]
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeInstanceStatusResult extends js.Object {
    var InstanceStatuses: js.UndefOr[InstanceStatusList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeInstanceTypeOfferingsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var LocationType: js.UndefOr[LocationType]
    var MaxResults: js.UndefOr[DITOMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstanceTypeOfferingsResult extends js.Object {
    var InstanceTypeOfferings: js.UndefOr[InstanceTypeOfferingsList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstanceTypesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var InstanceTypes: js.UndefOr[RequestInstanceTypeList]
    var MaxResults: js.UndefOr[DITMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstanceTypesResult extends js.Object {
    var InstanceTypes: js.UndefOr[InstanceTypeInfoList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var InstanceIds: js.UndefOr[InstanceIdStringList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeInstancesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Reservations: js.UndefOr[ReservationList]
  }

  @js.native
  @Factory
  trait DescribeInternetGatewaysRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var InternetGatewayIds: js.UndefOr[InternetGatewayIdList]
    var MaxResults: js.UndefOr[DescribeInternetGatewaysMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeInternetGatewaysResult extends js.Object {
    var InternetGateways: js.UndefOr[InternetGatewayList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeIpv6PoolsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Ipv6PoolMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PoolIds: js.UndefOr[Ipv6PoolIdList]
  }

  @js.native
  @Factory
  trait DescribeIpv6PoolsResult extends js.Object {
    var Ipv6Pools: js.UndefOr[Ipv6PoolSet]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait DescribeKeyPairsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var KeyNames: js.UndefOr[KeyNameStringList]
    var KeyPairIds: js.UndefOr[KeyPairIdStringList]
  }

  @js.native
  @Factory
  trait DescribeKeyPairsResult extends js.Object {
    var KeyPairs: js.UndefOr[KeyPairList]
  }

  @js.native
  @Factory
  trait DescribeLaunchTemplateVersionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var LaunchTemplateId: js.UndefOr[LaunchTemplateId]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var MaxResults: js.UndefOr[Int]
    var MaxVersion: js.UndefOr[String]
    var MinVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
    var Versions: js.UndefOr[VersionStringList]
  }

  @js.native
  @Factory
  trait DescribeLaunchTemplateVersionsResult extends js.Object {
    var LaunchTemplateVersions: js.UndefOr[LaunchTemplateVersionSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLaunchTemplatesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var LaunchTemplateIds: js.UndefOr[LaunchTemplateIdStringList]
    var LaunchTemplateNames: js.UndefOr[LaunchTemplateNameStringList]
    var MaxResults: js.UndefOr[DescribeLaunchTemplatesMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLaunchTemplatesResult extends js.Object {
    var LaunchTemplates: js.UndefOr[LaunchTemplateSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var LocalGatewayRouteTableVirtualInterfaceGroupAssociationIds: js.UndefOr[
      LocalGatewayRouteTableVirtualInterfaceGroupAssociationIdSet
    ]
    var MaxResults: js.UndefOr[LocalGatewayMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsResult extends js.Object {
    var LocalGatewayRouteTableVirtualInterfaceGroupAssociations: js.UndefOr[
      LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet
    ]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayRouteTableVpcAssociationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var LocalGatewayRouteTableVpcAssociationIds: js.UndefOr[LocalGatewayRouteTableVpcAssociationIdSet]
    var MaxResults: js.UndefOr[LocalGatewayMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayRouteTableVpcAssociationsResult extends js.Object {
    var LocalGatewayRouteTableVpcAssociations: js.UndefOr[LocalGatewayRouteTableVpcAssociationSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayRouteTablesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var LocalGatewayRouteTableIds: js.UndefOr[LocalGatewayRouteTableIdSet]
    var MaxResults: js.UndefOr[LocalGatewayMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayRouteTablesResult extends js.Object {
    var LocalGatewayRouteTables: js.UndefOr[LocalGatewayRouteTableSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayVirtualInterfaceGroupsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var LocalGatewayVirtualInterfaceGroupIds: js.UndefOr[LocalGatewayVirtualInterfaceGroupIdSet]
    var MaxResults: js.UndefOr[LocalGatewayMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayVirtualInterfaceGroupsResult extends js.Object {
    var LocalGatewayVirtualInterfaceGroups: js.UndefOr[LocalGatewayVirtualInterfaceGroupSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayVirtualInterfacesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var LocalGatewayVirtualInterfaceIds: js.UndefOr[LocalGatewayVirtualInterfaceIdSet]
    var MaxResults: js.UndefOr[LocalGatewayMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewayVirtualInterfacesResult extends js.Object {
    var LocalGatewayVirtualInterfaces: js.UndefOr[LocalGatewayVirtualInterfaceSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewaysRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var LocalGatewayIds: js.UndefOr[LocalGatewayIdSet]
    var MaxResults: js.UndefOr[LocalGatewayMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeLocalGatewaysResult extends js.Object {
    var LocalGateways: js.UndefOr[LocalGatewaySet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeMovingAddressesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeMovingAddressesMaxResults]
    var NextToken: js.UndefOr[String]
    var PublicIps: js.UndefOr[ValueStringList]
  }

  @js.native
  @Factory
  trait DescribeMovingAddressesResult extends js.Object {
    var MovingAddressStatuses: js.UndefOr[MovingAddressStatusSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeNatGatewaysRequest extends js.Object {
    var Filter: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeNatGatewaysMaxResults]
    var NatGatewayIds: js.UndefOr[NatGatewayIdStringList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeNatGatewaysResult extends js.Object {
    var NatGateways: js.UndefOr[NatGatewayList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeNetworkAclsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeNetworkAclsMaxResults]
    var NetworkAclIds: js.UndefOr[NetworkAclIdStringList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeNetworkAclsResult extends js.Object {
    var NetworkAcls: js.UndefOr[NetworkAclList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Contains the parameters for DescribeNetworkInterfaceAttribute.
    */
  @js.native
  @Factory
  trait DescribeNetworkInterfaceAttributeRequest extends js.Object {
    var NetworkInterfaceId: NetworkInterfaceId
    var Attribute: js.UndefOr[NetworkInterfaceAttribute]
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of DescribeNetworkInterfaceAttribute.
    */
  @js.native
  @Factory
  trait DescribeNetworkInterfaceAttributeResult extends js.Object {
    var Attachment: js.UndefOr[NetworkInterfaceAttachment]
    var Description: js.UndefOr[AttributeValue]
    var Groups: js.UndefOr[GroupIdentifierList]
    var NetworkInterfaceId: js.UndefOr[String]
    var SourceDestCheck: js.UndefOr[AttributeBooleanValue]
  }

  /**
    * Contains the parameters for DescribeNetworkInterfacePermissions.
    */
  @js.native
  @Factory
  trait DescribeNetworkInterfacePermissionsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeNetworkInterfacePermissionsMaxResults]
    var NetworkInterfacePermissionIds: js.UndefOr[NetworkInterfacePermissionIdList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Contains the output for DescribeNetworkInterfacePermissions.
    */
  @js.native
  @Factory
  trait DescribeNetworkInterfacePermissionsResult extends js.Object {
    var NetworkInterfacePermissions: js.UndefOr[NetworkInterfacePermissionList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Contains the parameters for DescribeNetworkInterfaces.
    */
  @js.native
  @Factory
  trait DescribeNetworkInterfacesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeNetworkInterfacesMaxResults]
    var NetworkInterfaceIds: js.UndefOr[NetworkInterfaceIdList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Contains the output of DescribeNetworkInterfaces.
    */
  @js.native
  @Factory
  trait DescribeNetworkInterfacesResult extends js.Object {
    var NetworkInterfaces: js.UndefOr[NetworkInterfaceList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribePlacementGroupsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var GroupIds: js.UndefOr[PlacementGroupIdStringList]
    var GroupNames: js.UndefOr[PlacementGroupStringList]
  }

  @js.native
  @Factory
  trait DescribePlacementGroupsResult extends js.Object {
    var PlacementGroups: js.UndefOr[PlacementGroupList]
  }

  @js.native
  @Factory
  trait DescribePrefixListsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var PrefixListIds: js.UndefOr[PrefixListResourceIdStringList]
  }

  @js.native
  @Factory
  trait DescribePrefixListsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var PrefixLists: js.UndefOr[PrefixListSet]
  }

  @js.native
  @Factory
  trait DescribePrincipalIdFormatRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[DescribePrincipalIdFormatMaxResults]
    var NextToken: js.UndefOr[String]
    var Resources: js.UndefOr[ResourceList]
  }

  @js.native
  @Factory
  trait DescribePrincipalIdFormatResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Principals: js.UndefOr[PrincipalIdFormatList]
  }

  @js.native
  @Factory
  trait DescribePublicIpv4PoolsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[PoolMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var PoolIds: js.UndefOr[PublicIpv4PoolIdStringList]
  }

  @js.native
  @Factory
  trait DescribePublicIpv4PoolsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var PublicIpv4Pools: js.UndefOr[PublicIpv4PoolSet]
  }

  @js.native
  @Factory
  trait DescribeRegionsRequest extends js.Object {
    var AllRegions: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var RegionNames: js.UndefOr[RegionNameStringList]
  }

  @js.native
  @Factory
  trait DescribeRegionsResult extends js.Object {
    var Regions: js.UndefOr[RegionList]
  }

  /**
    * Contains the parameters for DescribeReservedInstancesListings.
    */
  @js.native
  @Factory
  trait DescribeReservedInstancesListingsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var ReservedInstancesId: js.UndefOr[ReservationId]
    var ReservedInstancesListingId: js.UndefOr[ReservedInstancesListingId]
  }

  /**
    * Contains the output of DescribeReservedInstancesListings.
    */
  @js.native
  @Factory
  trait DescribeReservedInstancesListingsResult extends js.Object {
    var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList]
  }

  /**
    * Contains the parameters for DescribeReservedInstancesModifications.
    */
  @js.native
  @Factory
  trait DescribeReservedInstancesModificationsRequest extends js.Object {
    var Filters: js.UndefOr[FilterList]
    var NextToken: js.UndefOr[String]
    var ReservedInstancesModificationIds: js.UndefOr[ReservedInstancesModificationIdStringList]
  }

  /**
    * Contains the output of DescribeReservedInstancesModifications.
    */
  @js.native
  @Factory
  trait DescribeReservedInstancesModificationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var ReservedInstancesModifications: js.UndefOr[ReservedInstancesModificationList]
  }

  /**
    * Contains the parameters for DescribeReservedInstancesOfferings.
    */
  @js.native
  @Factory
  trait DescribeReservedInstancesOfferingsRequest extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var IncludeMarketplace: js.UndefOr[Boolean]
    var InstanceTenancy: js.UndefOr[Tenancy]
    var InstanceType: js.UndefOr[InstanceType]
    var MaxDuration: js.UndefOr[Double]
    var MaxInstanceCount: js.UndefOr[Int]
    var MaxResults: js.UndefOr[Int]
    var MinDuration: js.UndefOr[Double]
    var NextToken: js.UndefOr[String]
    var OfferingClass: js.UndefOr[OfferingClassType]
    var OfferingType: js.UndefOr[OfferingTypeValues]
    var ProductDescription: js.UndefOr[RIProductDescription]
    var ReservedInstancesOfferingIds: js.UndefOr[ReservedInstancesOfferingIdStringList]
  }

  /**
    * Contains the output of DescribeReservedInstancesOfferings.
    */
  @js.native
  @Factory
  trait DescribeReservedInstancesOfferingsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var ReservedInstancesOfferings: js.UndefOr[ReservedInstancesOfferingList]
  }

  /**
    * Contains the parameters for DescribeReservedInstances.
    */
  @js.native
  @Factory
  trait DescribeReservedInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var OfferingClass: js.UndefOr[OfferingClassType]
    var OfferingType: js.UndefOr[OfferingTypeValues]
    var ReservedInstancesIds: js.UndefOr[ReservedInstancesIdStringList]
  }

  /**
    * Contains the output for DescribeReservedInstances.
    */
  @js.native
  @Factory
  trait DescribeReservedInstancesResult extends js.Object {
    var ReservedInstances: js.UndefOr[ReservedInstancesList]
  }

  @js.native
  @Factory
  trait DescribeRouteTablesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeRouteTablesMaxResults]
    var NextToken: js.UndefOr[String]
    var RouteTableIds: js.UndefOr[RouteTableIdStringList]
  }

  /**
    * Contains the output of DescribeRouteTables.
    */
  @js.native
  @Factory
  trait DescribeRouteTablesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var RouteTables: js.UndefOr[RouteTableList]
  }

  /**
    * Contains the parameters for DescribeScheduledInstanceAvailability.
    */
  @js.native
  @Factory
  trait DescribeScheduledInstanceAvailabilityRequest extends js.Object {
    var FirstSlotStartTimeRange: SlotDateTimeRangeRequest
    var Recurrence: ScheduledInstanceRecurrenceRequest
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeScheduledInstanceAvailabilityMaxResults]
    var MaxSlotDurationInHours: js.UndefOr[Int]
    var MinSlotDurationInHours: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Contains the output of DescribeScheduledInstanceAvailability.
    */
  @js.native
  @Factory
  trait DescribeScheduledInstanceAvailabilityResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var ScheduledInstanceAvailabilitySet: js.UndefOr[ScheduledInstanceAvailabilitySet]
  }

  /**
    * Contains the parameters for DescribeScheduledInstances.
    */
  @js.native
  @Factory
  trait DescribeScheduledInstancesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var ScheduledInstanceIds: js.UndefOr[ScheduledInstanceIdRequestSet]
    var SlotStartTimeRange: js.UndefOr[SlotStartTimeRangeRequest]
  }

  /**
    * Contains the output of DescribeScheduledInstances.
    */
  @js.native
  @Factory
  trait DescribeScheduledInstancesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var ScheduledInstanceSet: js.UndefOr[ScheduledInstanceSet]
  }

  @js.native
  @Factory
  trait DescribeSecurityGroupReferencesRequest extends js.Object {
    var GroupId: GroupIds
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeSecurityGroupReferencesResult extends js.Object {
    var SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences]
  }

  @js.native
  @Factory
  trait DescribeSecurityGroupsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var GroupIds: js.UndefOr[GroupIdStringList]
    var GroupNames: js.UndefOr[GroupNameStringList]
    var MaxResults: js.UndefOr[DescribeSecurityGroupsMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeSecurityGroupsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[SecurityGroupList]
  }

  @js.native
  @Factory
  trait DescribeSnapshotAttributeRequest extends js.Object {
    var Attribute: SnapshotAttributeName
    var SnapshotId: SnapshotId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeSnapshotAttributeResult extends js.Object {
    var CreateVolumePermissions: js.UndefOr[CreateVolumePermissionList]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var SnapshotId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeSnapshotsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var OwnerIds: js.UndefOr[OwnerStringList]
    var RestorableByUserIds: js.UndefOr[RestorableByStringList]
    var SnapshotIds: js.UndefOr[SnapshotIdStringList]
  }

  @js.native
  @Factory
  trait DescribeSnapshotsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Snapshots: js.UndefOr[SnapshotList]
  }

  /**
    * Contains the parameters for DescribeSpotDatafeedSubscription.
    */
  @js.native
  @Factory
  trait DescribeSpotDatafeedSubscriptionRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of DescribeSpotDatafeedSubscription.
    */
  @js.native
  @Factory
  trait DescribeSpotDatafeedSubscriptionResult extends js.Object {
    var SpotDatafeedSubscription: js.UndefOr[SpotDatafeedSubscription]
  }

  /**
    * Contains the parameters for DescribeSpotFleetInstances.
    */
  @js.native
  @Factory
  trait DescribeSpotFleetInstancesRequest extends js.Object {
    var SpotFleetRequestId: SpotFleetRequestId
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[DescribeSpotFleetInstancesMaxResults]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Contains the output of DescribeSpotFleetInstances.
    */
  @js.native
  @Factory
  trait DescribeSpotFleetInstancesResponse extends js.Object {
    var ActiveInstances: js.UndefOr[ActiveInstanceSet]
    var NextToken: js.UndefOr[String]
    var SpotFleetRequestId: js.UndefOr[String]
  }

  /**
    * Contains the parameters for DescribeSpotFleetRequestHistory.
    */
  @js.native
  @Factory
  trait DescribeSpotFleetRequestHistoryRequest extends js.Object {
    var SpotFleetRequestId: SpotFleetRequestId
    var StartTime: DateTime
    var DryRun: js.UndefOr[Boolean]
    var EventType: js.UndefOr[EventType]
    var MaxResults: js.UndefOr[DescribeSpotFleetRequestHistoryMaxResults]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Contains the output of DescribeSpotFleetRequestHistory.
    */
  @js.native
  @Factory
  trait DescribeSpotFleetRequestHistoryResponse extends js.Object {
    var HistoryRecords: js.UndefOr[HistoryRecords]
    var LastEvaluatedTime: js.UndefOr[DateTime]
    var NextToken: js.UndefOr[String]
    var SpotFleetRequestId: js.UndefOr[String]
    var StartTime: js.UndefOr[DateTime]
  }

  /**
    * Contains the parameters for DescribeSpotFleetRequests.
    */
  @js.native
  @Factory
  trait DescribeSpotFleetRequestsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var SpotFleetRequestIds: js.UndefOr[SpotFleetRequestIdList]
  }

  /**
    * Contains the output of DescribeSpotFleetRequests.
    */
  @js.native
  @Factory
  trait DescribeSpotFleetRequestsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var SpotFleetRequestConfigs: js.UndefOr[SpotFleetRequestConfigSet]
  }

  /**
    * Contains the parameters for DescribeSpotInstanceRequests.
    */
  @js.native
  @Factory
  trait DescribeSpotInstanceRequestsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var SpotInstanceRequestIds: js.UndefOr[SpotInstanceRequestIdList]
  }

  /**
    * Contains the output of DescribeSpotInstanceRequests.
    */
  @js.native
  @Factory
  trait DescribeSpotInstanceRequestsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList]
  }

  /**
    * Contains the parameters for DescribeSpotPriceHistory.
    */
  @js.native
  @Factory
  trait DescribeSpotPriceHistoryRequest extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var EndTime: js.UndefOr[DateTime]
    var Filters: js.UndefOr[FilterList]
    var InstanceTypes: js.UndefOr[InstanceTypeList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var ProductDescriptions: js.UndefOr[ProductDescriptionList]
    var StartTime: js.UndefOr[DateTime]
  }

  /**
    * Contains the output of DescribeSpotPriceHistory.
    */
  @js.native
  @Factory
  trait DescribeSpotPriceHistoryResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var SpotPriceHistory: js.UndefOr[SpotPriceHistoryList]
  }

  @js.native
  @Factory
  trait DescribeStaleSecurityGroupsRequest extends js.Object {
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[DescribeStaleSecurityGroupsMaxResults]
    var NextToken: js.UndefOr[DescribeStaleSecurityGroupsNextToken]
  }

  @js.native
  @Factory
  trait DescribeStaleSecurityGroupsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var StaleSecurityGroupSet: js.UndefOr[StaleSecurityGroupSet]
  }

  @js.native
  @Factory
  trait DescribeSubnetsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeSubnetsMaxResults]
    var NextToken: js.UndefOr[String]
    var SubnetIds: js.UndefOr[SubnetIdStringList]
  }

  @js.native
  @Factory
  trait DescribeSubnetsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Subnets: js.UndefOr[SubnetList]
  }

  @js.native
  @Factory
  trait DescribeTagsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeTagsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Tags: js.UndefOr[TagDescriptionList]
  }

  @js.native
  @Factory
  trait DescribeTrafficMirrorFiltersRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TrafficMirroringMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TrafficMirrorFilterIds: js.UndefOr[TrafficMirrorFilterIdList]
  }

  @js.native
  @Factory
  trait DescribeTrafficMirrorFiltersResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TrafficMirrorFilters: js.UndefOr[TrafficMirrorFilterSet]
  }

  @js.native
  @Factory
  trait DescribeTrafficMirrorSessionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TrafficMirroringMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TrafficMirrorSessionIds: js.UndefOr[TrafficMirrorSessionIdList]
  }

  @js.native
  @Factory
  trait DescribeTrafficMirrorSessionsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TrafficMirrorSessions: js.UndefOr[TrafficMirrorSessionSet]
  }

  @js.native
  @Factory
  trait DescribeTrafficMirrorTargetsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TrafficMirroringMaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TrafficMirrorTargetIds: js.UndefOr[TrafficMirrorTargetIdList]
  }

  @js.native
  @Factory
  trait DescribeTrafficMirrorTargetsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TrafficMirrorTargets: js.UndefOr[TrafficMirrorTargetSet]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayAttachmentsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayAttachmentIds: js.UndefOr[TransitGatewayAttachmentIdStringList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayAttachmentsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TransitGatewayAttachments: js.UndefOr[TransitGatewayAttachmentList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayMulticastDomainsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayMulticastDomainIds: js.UndefOr[TransitGatewayMulticastDomainIdStringList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayMulticastDomainsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TransitGatewayMulticastDomains: js.UndefOr[TransitGatewayMulticastDomainList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayPeeringAttachmentsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayAttachmentIds: js.UndefOr[TransitGatewayAttachmentIdStringList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayPeeringAttachmentsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TransitGatewayPeeringAttachments: js.UndefOr[TransitGatewayPeeringAttachmentList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayRouteTablesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayRouteTableIds: js.UndefOr[TransitGatewayRouteTableIdStringList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayRouteTablesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TransitGatewayRouteTables: js.UndefOr[TransitGatewayRouteTableList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayVpcAttachmentsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayAttachmentIds: js.UndefOr[TransitGatewayAttachmentIdStringList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewayVpcAttachmentsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TransitGatewayVpcAttachments: js.UndefOr[TransitGatewayVpcAttachmentList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewaysRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayIds: js.UndefOr[TransitGatewayIdStringList]
  }

  @js.native
  @Factory
  trait DescribeTransitGatewaysResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TransitGateways: js.UndefOr[TransitGatewayList]
  }

  @js.native
  @Factory
  trait DescribeVolumeAttributeRequest extends js.Object {
    var Attribute: VolumeAttributeName
    var VolumeId: VolumeId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeVolumeAttributeResult extends js.Object {
    var AutoEnableIO: js.UndefOr[AttributeBooleanValue]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var VolumeId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeVolumeStatusRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var VolumeIds: js.UndefOr[VolumeIdStringList]
  }

  @js.native
  @Factory
  trait DescribeVolumeStatusResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var VolumeStatuses: js.UndefOr[VolumeStatusList]
  }

  @js.native
  @Factory
  trait DescribeVolumesModificationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var VolumeIds: js.UndefOr[VolumeIdStringList]
  }

  @js.native
  @Factory
  trait DescribeVolumesModificationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var VolumesModifications: js.UndefOr[VolumeModificationList]
  }

  @js.native
  @Factory
  trait DescribeVolumesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var VolumeIds: js.UndefOr[VolumeIdStringList]
  }

  @js.native
  @Factory
  trait DescribeVolumesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Volumes: js.UndefOr[VolumeList]
  }

  @js.native
  @Factory
  trait DescribeVpcAttributeRequest extends js.Object {
    var Attribute: VpcAttributeName
    var VpcId: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DescribeVpcAttributeResult extends js.Object {
    var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue]
    var EnableDnsSupport: js.UndefOr[AttributeBooleanValue]
    var VpcId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeVpcClassicLinkDnsSupportRequest extends js.Object {
    var MaxResults: js.UndefOr[DescribeVpcClassicLinkDnsSupportMaxResults]
    var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken]
    var VpcIds: js.UndefOr[VpcClassicLinkIdList]
  }

  @js.native
  @Factory
  trait DescribeVpcClassicLinkDnsSupportResult extends js.Object {
    var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken]
    var Vpcs: js.UndefOr[ClassicLinkDnsSupportList]
  }

  @js.native
  @Factory
  trait DescribeVpcClassicLinkRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var VpcIds: js.UndefOr[VpcClassicLinkIdList]
  }

  @js.native
  @Factory
  trait DescribeVpcClassicLinkResult extends js.Object {
    var Vpcs: js.UndefOr[VpcClassicLinkList]
  }

  @js.native
  @Factory
  trait DescribeVpcEndpointConnectionNotificationsRequest extends js.Object {
    var ConnectionNotificationId: js.UndefOr[ConnectionNotificationId]
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeVpcEndpointConnectionNotificationsResult extends js.Object {
    var ConnectionNotificationSet: js.UndefOr[ConnectionNotificationSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeVpcEndpointConnectionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeVpcEndpointConnectionsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var VpcEndpointConnections: js.UndefOr[VpcEndpointConnectionSet]
  }

  @js.native
  @Factory
  trait DescribeVpcEndpointServiceConfigurationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var ServiceIds: js.UndefOr[VpcEndpointServiceIdList]
  }

  @js.native
  @Factory
  trait DescribeVpcEndpointServiceConfigurationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var ServiceConfigurations: js.UndefOr[ServiceConfigurationSet]
  }

  @js.native
  @Factory
  trait DescribeVpcEndpointServicePermissionsRequest extends js.Object {
    var ServiceId: VpcEndpointServiceId
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeVpcEndpointServicePermissionsResult extends js.Object {
    var AllowedPrincipals: js.UndefOr[AllowedPrincipalSet]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Contains the parameters for DescribeVpcEndpointServices.
    */
  @js.native
  @Factory
  trait DescribeVpcEndpointServicesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var ServiceNames: js.UndefOr[ValueStringList]
  }

  /**
    * Contains the output of DescribeVpcEndpointServices.
    */
  @js.native
  @Factory
  trait DescribeVpcEndpointServicesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var ServiceDetails: js.UndefOr[ServiceDetailSet]
    var ServiceNames: js.UndefOr[ValueStringList]
  }

  /**
    * Contains the parameters for DescribeVpcEndpoints.
    */
  @js.native
  @Factory
  trait DescribeVpcEndpointsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
    var VpcEndpointIds: js.UndefOr[VpcEndpointIdList]
  }

  /**
    * Contains the output of DescribeVpcEndpoints.
    */
  @js.native
  @Factory
  trait DescribeVpcEndpointsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var VpcEndpoints: js.UndefOr[VpcEndpointSet]
  }

  @js.native
  @Factory
  trait DescribeVpcPeeringConnectionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeVpcPeeringConnectionsMaxResults]
    var NextToken: js.UndefOr[String]
    var VpcPeeringConnectionIds: js.UndefOr[VpcPeeringConnectionIdList]
  }

  @js.native
  @Factory
  trait DescribeVpcPeeringConnectionsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList]
  }

  @js.native
  @Factory
  trait DescribeVpcsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[DescribeVpcsMaxResults]
    var NextToken: js.UndefOr[String]
    var VpcIds: js.UndefOr[VpcIdStringList]
  }

  @js.native
  @Factory
  trait DescribeVpcsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Vpcs: js.UndefOr[VpcList]
  }

  /**
    * Contains the parameters for DescribeVpnConnections.
    */
  @js.native
  @Factory
  trait DescribeVpnConnectionsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var VpnConnectionIds: js.UndefOr[VpnConnectionIdStringList]
  }

  /**
    * Contains the output of DescribeVpnConnections.
    */
  @js.native
  @Factory
  trait DescribeVpnConnectionsResult extends js.Object {
    var VpnConnections: js.UndefOr[VpnConnectionList]
  }

  /**
    * Contains the parameters for DescribeVpnGateways.
    */
  @js.native
  @Factory
  trait DescribeVpnGatewaysRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var VpnGatewayIds: js.UndefOr[VpnGatewayIdStringList]
  }

  /**
    * Contains the output of DescribeVpnGateways.
    */
  @js.native
  @Factory
  trait DescribeVpnGatewaysResult extends js.Object {
    var VpnGateways: js.UndefOr[VpnGatewayList]
  }

  @js.native
  @Factory
  trait DetachClassicLinkVpcRequest extends js.Object {
    var InstanceId: InstanceId
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DetachClassicLinkVpcResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DetachInternetGatewayRequest extends js.Object {
    var InternetGatewayId: InternetGatewayId
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for DetachNetworkInterface.
    */
  @js.native
  @Factory
  trait DetachNetworkInterfaceRequest extends js.Object {
    var AttachmentId: NetworkInterfaceAttachmentId
    var DryRun: js.UndefOr[Boolean]
    var Force: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DetachVolumeRequest extends js.Object {
    var VolumeId: VolumeId
    var Device: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Force: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[InstanceId]
  }

  /**
    * Contains the parameters for DetachVpnGateway.
    */
  @js.native
  @Factory
  trait DetachVpnGatewayRequest extends js.Object {
    var VpcId: VpcId
    var VpnGatewayId: VpnGatewayId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait DeviceType extends js.Any
  object DeviceType extends js.Object {
    val ebs              = "ebs".asInstanceOf[DeviceType]
    val `instance-store` = "instance-store".asInstanceOf[DeviceType]

    val values = js.Object.freeze(js.Array(ebs, `instance-store`))
  }

  /**
    * Describes a DHCP configuration option.
    */
  @js.native
  @Factory
  trait DhcpConfiguration extends js.Object {
    var Key: js.UndefOr[String]
    var Values: js.UndefOr[DhcpConfigurationValueList]
  }

  /**
    * Describes a set of DHCP options.
    */
  @js.native
  @Factory
  trait DhcpOptions extends js.Object {
    var DhcpConfigurations: js.UndefOr[DhcpConfigurationList]
    var DhcpOptionsId: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes an Active Directory.
    */
  @js.native
  @Factory
  trait DirectoryServiceAuthentication extends js.Object {
    var DirectoryId: js.UndefOr[String]
  }

  /**
    * Describes the Active Directory to be used for client authentication.
    */
  @js.native
  @Factory
  trait DirectoryServiceAuthenticationRequest extends js.Object {
    var DirectoryId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DisableEbsEncryptionByDefaultRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisableEbsEncryptionByDefaultResult extends js.Object {
    var EbsEncryptionByDefault: js.UndefOr[Boolean]
  }

  /**
    * Contains information about the errors that occurred when disabling fast snapshot restores.
    */
  @js.native
  @Factory
  trait DisableFastSnapshotRestoreErrorItem extends js.Object {
    var FastSnapshotRestoreStateErrors: js.UndefOr[DisableFastSnapshotRestoreStateErrorSet]
    var SnapshotId: js.UndefOr[String]
  }

  /**
    * Describes an error that occurred when disabling fast snapshot restores.
    */
  @js.native
  @Factory
  trait DisableFastSnapshotRestoreStateError extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  /**
    * Contains information about an error that occurred when disabling fast snapshot restores.
    */
  @js.native
  @Factory
  trait DisableFastSnapshotRestoreStateErrorItem extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var Error: js.UndefOr[DisableFastSnapshotRestoreStateError]
  }

  /**
    * Describes fast snapshot restores that were successfully disabled.
    */
  @js.native
  @Factory
  trait DisableFastSnapshotRestoreSuccessItem extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var DisabledTime: js.UndefOr[MillisecondDateTime]
    var DisablingTime: js.UndefOr[MillisecondDateTime]
    var EnabledTime: js.UndefOr[MillisecondDateTime]
    var EnablingTime: js.UndefOr[MillisecondDateTime]
    var OptimizingTime: js.UndefOr[MillisecondDateTime]
    var OwnerAlias: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var State: js.UndefOr[FastSnapshotRestoreStateCode]
    var StateTransitionReason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DisableFastSnapshotRestoresRequest extends js.Object {
    var AvailabilityZones: AvailabilityZoneStringList
    var SourceSnapshotIds: SnapshotIdStringList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisableFastSnapshotRestoresResult extends js.Object {
    var Successful: js.UndefOr[DisableFastSnapshotRestoreSuccessSet]
    var Unsuccessful: js.UndefOr[DisableFastSnapshotRestoreErrorSet]
  }

  @js.native
  @Factory
  trait DisableTransitGatewayRouteTablePropagationRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisableTransitGatewayRouteTablePropagationResult extends js.Object {
    var Propagation: js.UndefOr[TransitGatewayPropagation]
  }

  /**
    * Contains the parameters for DisableVgwRoutePropagation.
    */
  @js.native
  @Factory
  trait DisableVgwRoutePropagationRequest extends js.Object {
    var GatewayId: VpnGatewayId
    var RouteTableId: RouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisableVpcClassicLinkDnsSupportRequest extends js.Object {
    var VpcId: js.UndefOr[VpcId]
  }

  @js.native
  @Factory
  trait DisableVpcClassicLinkDnsSupportResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisableVpcClassicLinkRequest extends js.Object {
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisableVpcClassicLinkResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisassociateAddressRequest extends js.Object {
    var AssociationId: js.UndefOr[ElasticIpAssociationId]
    var DryRun: js.UndefOr[Boolean]
    var PublicIp: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DisassociateClientVpnTargetNetworkRequest extends js.Object {
    var AssociationId: String
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisassociateClientVpnTargetNetworkResult extends js.Object {
    var AssociationId: js.UndefOr[String]
    var Status: js.UndefOr[AssociationStatus]
  }

  @js.native
  @Factory
  trait DisassociateIamInstanceProfileRequest extends js.Object {
    var AssociationId: IamInstanceProfileAssociationId
  }

  @js.native
  @Factory
  trait DisassociateIamInstanceProfileResult extends js.Object {
    var IamInstanceProfileAssociation: js.UndefOr[IamInstanceProfileAssociation]
  }

  @js.native
  @Factory
  trait DisassociateRouteTableRequest extends js.Object {
    var AssociationId: RouteTableAssociationId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisassociateSubnetCidrBlockRequest extends js.Object {
    var AssociationId: SubnetCidrAssociationId
  }

  @js.native
  @Factory
  trait DisassociateSubnetCidrBlockResult extends js.Object {
    var Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation]
    var SubnetId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DisassociateTransitGatewayMulticastDomainRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var SubnetIds: js.UndefOr[ValueStringList]
    var TransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId]
    var TransitGatewayMulticastDomainId: js.UndefOr[TransitGatewayMulticastDomainId]
  }

  @js.native
  @Factory
  trait DisassociateTransitGatewayMulticastDomainResult extends js.Object {
    var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations]
  }

  @js.native
  @Factory
  trait DisassociateTransitGatewayRouteTableRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait DisassociateTransitGatewayRouteTableResult extends js.Object {
    var Association: js.UndefOr[TransitGatewayAssociation]
  }

  @js.native
  @Factory
  trait DisassociateVpcCidrBlockRequest extends js.Object {
    var AssociationId: VpcCidrAssociationId
  }

  @js.native
  @Factory
  trait DisassociateVpcCidrBlockResult extends js.Object {
    var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation]
    var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes a disk image.
    */
  @js.native
  @Factory
  trait DiskImage extends js.Object {
    var Description: js.UndefOr[String]
    var Image: js.UndefOr[DiskImageDetail]
    var Volume: js.UndefOr[VolumeDetail]
  }

  /**
    * Describes a disk image.
    */
  @js.native
  @Factory
  trait DiskImageDescription extends js.Object {
    var Checksum: js.UndefOr[String]
    var Format: js.UndefOr[DiskImageFormat]
    var ImportManifestUrl: js.UndefOr[String]
    var Size: js.UndefOr[Double]
  }

  /**
    * Describes a disk image.
    */
  @js.native
  @Factory
  trait DiskImageDetail extends js.Object {
    var Bytes: Double
    var Format: DiskImageFormat
    var ImportManifestUrl: String
  }

  @js.native
  sealed trait DiskImageFormat extends js.Any
  object DiskImageFormat extends js.Object {
    val VMDK = "VMDK".asInstanceOf[DiskImageFormat]
    val RAW  = "RAW".asInstanceOf[DiskImageFormat]
    val VHD  = "VHD".asInstanceOf[DiskImageFormat]

    val values = js.Object.freeze(js.Array(VMDK, RAW, VHD))
  }

  /**
    * Describes a disk image volume.
    */
  @js.native
  @Factory
  trait DiskImageVolumeDescription extends js.Object {
    var Id: js.UndefOr[String]
    var Size: js.UndefOr[Double]
  }

  /**
    * Describes the disk.
    */
  @js.native
  @Factory
  trait DiskInfo extends js.Object {
    var Count: js.UndefOr[DiskCount]
    var SizeInGB: js.UndefOr[DiskSize]
    var Type: js.UndefOr[DiskType]
  }

  @js.native
  sealed trait DiskType extends js.Any
  object DiskType extends js.Object {
    val hdd = "hdd".asInstanceOf[DiskType]
    val ssd = "ssd".asInstanceOf[DiskType]

    val values = js.Object.freeze(js.Array(hdd, ssd))
  }

  /**
    * Describes a DNS entry.
    */
  @js.native
  @Factory
  trait DnsEntry extends js.Object {
    var DnsName: js.UndefOr[String]
    var HostedZoneId: js.UndefOr[String]
  }

  @js.native
  sealed trait DnsNameState extends js.Any
  object DnsNameState extends js.Object {
    val pendingVerification = "pendingVerification".asInstanceOf[DnsNameState]
    val verified            = "verified".asInstanceOf[DnsNameState]
    val failed              = "failed".asInstanceOf[DnsNameState]

    val values = js.Object.freeze(js.Array(pendingVerification, verified, failed))
  }

  /**
    * Information about the DNS server to be used.
    */
  @js.native
  @Factory
  trait DnsServersOptionsModifyStructure extends js.Object {
    var CustomDnsServers: js.UndefOr[ValueStringList]
    var Enabled: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait DnsSupportValue extends js.Any
  object DnsSupportValue extends js.Object {
    val enable  = "enable".asInstanceOf[DnsSupportValue]
    val disable = "disable".asInstanceOf[DnsSupportValue]

    val values = js.Object.freeze(js.Array(enable, disable))
  }

  @js.native
  sealed trait DomainType extends js.Any
  object DomainType extends js.Object {
    val vpc      = "vpc".asInstanceOf[DomainType]
    val standard = "standard".asInstanceOf[DomainType]

    val values = js.Object.freeze(js.Array(vpc, standard))
  }

  /**
    * Describes a block device for an EBS volume.
    */
  @js.native
  @Factory
  trait EbsBlockDevice extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var KmsKeyId: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var VolumeSize: js.UndefOr[Int]
    var VolumeType: js.UndefOr[VolumeType]
  }

  @js.native
  sealed trait EbsEncryptionSupport extends js.Any
  object EbsEncryptionSupport extends js.Object {
    val unsupported = "unsupported".asInstanceOf[EbsEncryptionSupport]
    val supported   = "supported".asInstanceOf[EbsEncryptionSupport]

    val values = js.Object.freeze(js.Array(unsupported, supported))
  }

  /**
    * Describes the Amazon EBS features supported by the instance type.
    */
  @js.native
  @Factory
  trait EbsInfo extends js.Object {
    var EbsOptimizedSupport: js.UndefOr[EbsOptimizedSupport]
    var EncryptionSupport: js.UndefOr[EbsEncryptionSupport]
  }

  /**
    * Describes a parameter used to set up an EBS volume in a block device mapping.
    */
  @js.native
  @Factory
  trait EbsInstanceBlockDevice extends js.Object {
    var AttachTime: js.UndefOr[DateTime]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Status: js.UndefOr[AttachmentStatus]
    var VolumeId: js.UndefOr[String]
  }

  /**
    * Describes information used to set up an EBS volume specified in a block device mapping.
    */
  @js.native
  @Factory
  trait EbsInstanceBlockDeviceSpecification extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var VolumeId: js.UndefOr[VolumeId]
  }

  @js.native
  sealed trait EbsOptimizedSupport extends js.Any
  object EbsOptimizedSupport extends js.Object {
    val unsupported = "unsupported".asInstanceOf[EbsOptimizedSupport]
    val supported   = "supported".asInstanceOf[EbsOptimizedSupport]
    val default     = "default".asInstanceOf[EbsOptimizedSupport]

    val values = js.Object.freeze(js.Array(unsupported, supported, default))
  }

  /**
    * Describes an egress-only internet gateway.
    */
  @js.native
  @Factory
  trait EgressOnlyInternetGateway extends js.Object {
    var Attachments: js.UndefOr[InternetGatewayAttachmentList]
    var EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes the association between an instance and an Elastic Graphics accelerator.
    */
  @js.native
  @Factory
  trait ElasticGpuAssociation extends js.Object {
    var ElasticGpuAssociationId: js.UndefOr[String]
    var ElasticGpuAssociationState: js.UndefOr[String]
    var ElasticGpuAssociationTime: js.UndefOr[String]
    var ElasticGpuId: js.UndefOr[String]
  }

  /**
    * Describes the status of an Elastic Graphics accelerator.
    */
  @js.native
  @Factory
  trait ElasticGpuHealth extends js.Object {
    var Status: js.UndefOr[ElasticGpuStatus]
  }

  /**
    * A specification for an Elastic Graphics accelerator.
    */
  @js.native
  @Factory
  trait ElasticGpuSpecification extends js.Object {
    var Type: String
  }

  /**
    * Describes an elastic GPU.
    */
  @js.native
  @Factory
  trait ElasticGpuSpecificationResponse extends js.Object {
    var Type: js.UndefOr[String]
  }

  @js.native
  sealed trait ElasticGpuState extends js.Any
  object ElasticGpuState extends js.Object {
    val ATTACHED = "ATTACHED".asInstanceOf[ElasticGpuState]

    val values = js.Object.freeze(js.Array(ATTACHED))
  }

  @js.native
  sealed trait ElasticGpuStatus extends js.Any
  object ElasticGpuStatus extends js.Object {
    val OK       = "OK".asInstanceOf[ElasticGpuStatus]
    val IMPAIRED = "IMPAIRED".asInstanceOf[ElasticGpuStatus]

    val values = js.Object.freeze(js.Array(OK, IMPAIRED))
  }

  /**
    * Describes an Elastic Graphics accelerator.
    */
  @js.native
  @Factory
  trait ElasticGpus extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var ElasticGpuHealth: js.UndefOr[ElasticGpuHealth]
    var ElasticGpuId: js.UndefOr[String]
    var ElasticGpuState: js.UndefOr[ElasticGpuState]
    var ElasticGpuType: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes an elastic inference accelerator.
    */
  @js.native
  @Factory
  trait ElasticInferenceAccelerator extends js.Object {
    var Type: String
    var Count: js.UndefOr[ElasticInferenceAcceleratorCount]
  }

  /**
    * Describes the association between an instance and an elastic inference accelerator.
    */
  @js.native
  @Factory
  trait ElasticInferenceAcceleratorAssociation extends js.Object {
    var ElasticInferenceAcceleratorArn: js.UndefOr[String]
    var ElasticInferenceAcceleratorAssociationId: js.UndefOr[String]
    var ElasticInferenceAcceleratorAssociationState: js.UndefOr[String]
    var ElasticInferenceAcceleratorAssociationTime: js.UndefOr[DateTime]
  }

  @js.native
  sealed trait EnaSupport extends js.Any
  object EnaSupport extends js.Object {
    val unsupported = "unsupported".asInstanceOf[EnaSupport]
    val supported   = "supported".asInstanceOf[EnaSupport]
    val required    = "required".asInstanceOf[EnaSupport]

    val values = js.Object.freeze(js.Array(unsupported, supported, required))
  }

  @js.native
  @Factory
  trait EnableEbsEncryptionByDefaultRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait EnableEbsEncryptionByDefaultResult extends js.Object {
    var EbsEncryptionByDefault: js.UndefOr[Boolean]
  }

  /**
    * Contains information about the errors that occurred when enabling fast snapshot restores.
    */
  @js.native
  @Factory
  trait EnableFastSnapshotRestoreErrorItem extends js.Object {
    var FastSnapshotRestoreStateErrors: js.UndefOr[EnableFastSnapshotRestoreStateErrorSet]
    var SnapshotId: js.UndefOr[String]
  }

  /**
    * Describes an error that occurred when enabling fast snapshot restores.
    */
  @js.native
  @Factory
  trait EnableFastSnapshotRestoreStateError extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  /**
    * Contains information about an error that occurred when enabling fast snapshot restores.
    */
  @js.native
  @Factory
  trait EnableFastSnapshotRestoreStateErrorItem extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var Error: js.UndefOr[EnableFastSnapshotRestoreStateError]
  }

  /**
    * Describes fast snapshot restores that were successfully enabled.
    */
  @js.native
  @Factory
  trait EnableFastSnapshotRestoreSuccessItem extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var DisabledTime: js.UndefOr[MillisecondDateTime]
    var DisablingTime: js.UndefOr[MillisecondDateTime]
    var EnabledTime: js.UndefOr[MillisecondDateTime]
    var EnablingTime: js.UndefOr[MillisecondDateTime]
    var OptimizingTime: js.UndefOr[MillisecondDateTime]
    var OwnerAlias: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var State: js.UndefOr[FastSnapshotRestoreStateCode]
    var StateTransitionReason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait EnableFastSnapshotRestoresRequest extends js.Object {
    var AvailabilityZones: AvailabilityZoneStringList
    var SourceSnapshotIds: SnapshotIdStringList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait EnableFastSnapshotRestoresResult extends js.Object {
    var Successful: js.UndefOr[EnableFastSnapshotRestoreSuccessSet]
    var Unsuccessful: js.UndefOr[EnableFastSnapshotRestoreErrorSet]
  }

  @js.native
  @Factory
  trait EnableTransitGatewayRouteTablePropagationRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait EnableTransitGatewayRouteTablePropagationResult extends js.Object {
    var Propagation: js.UndefOr[TransitGatewayPropagation]
  }

  /**
    * Contains the parameters for EnableVgwRoutePropagation.
    */
  @js.native
  @Factory
  trait EnableVgwRoutePropagationRequest extends js.Object {
    var GatewayId: VpnGatewayId
    var RouteTableId: RouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait EnableVolumeIORequest extends js.Object {
    var VolumeId: VolumeId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait EnableVpcClassicLinkDnsSupportRequest extends js.Object {
    var VpcId: js.UndefOr[VpcId]
  }

  @js.native
  @Factory
  trait EnableVpcClassicLinkDnsSupportResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait EnableVpcClassicLinkRequest extends js.Object {
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait EnableVpcClassicLinkResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait EndDateType extends js.Any
  object EndDateType extends js.Object {
    val unlimited = "unlimited".asInstanceOf[EndDateType]
    val limited   = "limited".asInstanceOf[EndDateType]

    val values = js.Object.freeze(js.Array(unlimited, limited))
  }

  @js.native
  sealed trait EventCode extends js.Any
  object EventCode extends js.Object {
    val `instance-reboot`     = "instance-reboot".asInstanceOf[EventCode]
    val `system-reboot`       = "system-reboot".asInstanceOf[EventCode]
    val `system-maintenance`  = "system-maintenance".asInstanceOf[EventCode]
    val `instance-retirement` = "instance-retirement".asInstanceOf[EventCode]
    val `instance-stop`       = "instance-stop".asInstanceOf[EventCode]

    val values = js.Object.freeze(
      js.Array(`instance-reboot`, `system-reboot`, `system-maintenance`, `instance-retirement`, `instance-stop`)
    )
  }

  /**
    * Describes an EC2 Fleet or Spot Fleet event.
    */
  @js.native
  @Factory
  trait EventInformation extends js.Object {
    var EventDescription: js.UndefOr[String]
    var EventSubType: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  @js.native
  sealed trait EventType extends js.Any
  object EventType extends js.Object {
    val instanceChange     = "instanceChange".asInstanceOf[EventType]
    val fleetRequestChange = "fleetRequestChange".asInstanceOf[EventType]
    val error              = "error".asInstanceOf[EventType]
    val information        = "information".asInstanceOf[EventType]

    val values = js.Object.freeze(js.Array(instanceChange, fleetRequestChange, error, information))
  }

  @js.native
  sealed trait ExcessCapacityTerminationPolicy extends js.Any
  object ExcessCapacityTerminationPolicy extends js.Object {
    val noTermination = "noTermination".asInstanceOf[ExcessCapacityTerminationPolicy]
    val default       = "default".asInstanceOf[ExcessCapacityTerminationPolicy]

    val values = js.Object.freeze(js.Array(noTermination, default))
  }

  @js.native
  @Factory
  trait ExportClientVpnClientCertificateRevocationListRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ExportClientVpnClientCertificateRevocationListResult extends js.Object {
    var CertificateRevocationList: js.UndefOr[String]
    var Status: js.UndefOr[ClientCertificateRevocationListStatus]
  }

  @js.native
  @Factory
  trait ExportClientVpnClientConfigurationRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ExportClientVpnClientConfigurationResult extends js.Object {
    var ClientConfiguration: js.UndefOr[String]
  }

  @js.native
  sealed trait ExportEnvironment extends js.Any
  object ExportEnvironment extends js.Object {
    val citrix    = "citrix".asInstanceOf[ExportEnvironment]
    val vmware    = "vmware".asInstanceOf[ExportEnvironment]
    val microsoft = "microsoft".asInstanceOf[ExportEnvironment]

    val values = js.Object.freeze(js.Array(citrix, vmware, microsoft))
  }

  @js.native
  @Factory
  trait ExportImageRequest extends js.Object {
    var DiskImageFormat: DiskImageFormat
    var ImageId: ImageId
    var S3ExportLocation: ExportTaskS3LocationRequest
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var RoleName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ExportImageResult extends js.Object {
    var Description: js.UndefOr[String]
    var DiskImageFormat: js.UndefOr[DiskImageFormat]
    var ExportImageTaskId: js.UndefOr[String]
    var ImageId: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var RoleName: js.UndefOr[String]
    var S3ExportLocation: js.UndefOr[ExportTaskS3Location]
    var Status: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
  }

  /**
    * Describes an export image task.
    */
  @js.native
  @Factory
  trait ExportImageTask extends js.Object {
    var Description: js.UndefOr[String]
    var ExportImageTaskId: js.UndefOr[String]
    var ImageId: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var S3ExportLocation: js.UndefOr[ExportTaskS3Location]
    var Status: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
  }

  /**
    * Describes an instance export task.
    */
  @js.native
  @Factory
  trait ExportTask extends js.Object {
    var Description: js.UndefOr[String]
    var ExportTaskId: js.UndefOr[String]
    var ExportToS3Task: js.UndefOr[ExportToS3Task]
    var InstanceExportDetails: js.UndefOr[InstanceExportDetails]
    var State: js.UndefOr[ExportTaskState]
    var StatusMessage: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes the destination for an export image task.
    */
  @js.native
  @Factory
  trait ExportTaskS3Location extends js.Object {
    var S3Bucket: js.UndefOr[String]
    var S3Prefix: js.UndefOr[String]
  }

  /**
    * Describes the destination for an export image task.
    */
  @js.native
  @Factory
  trait ExportTaskS3LocationRequest extends js.Object {
    var S3Bucket: String
    var S3Prefix: js.UndefOr[String]
  }

  @js.native
  sealed trait ExportTaskState extends js.Any
  object ExportTaskState extends js.Object {
    val active     = "active".asInstanceOf[ExportTaskState]
    val cancelling = "cancelling".asInstanceOf[ExportTaskState]
    val cancelled  = "cancelled".asInstanceOf[ExportTaskState]
    val completed  = "completed".asInstanceOf[ExportTaskState]

    val values = js.Object.freeze(js.Array(active, cancelling, cancelled, completed))
  }

  /**
    * Describes the format and location for an instance export task.
    */
  @js.native
  @Factory
  trait ExportToS3Task extends js.Object {
    var ContainerFormat: js.UndefOr[ContainerFormat]
    var DiskImageFormat: js.UndefOr[DiskImageFormat]
    var S3Bucket: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
  }

  /**
    * Describes an instance export task.
    */
  @js.native
  @Factory
  trait ExportToS3TaskSpecification extends js.Object {
    var ContainerFormat: js.UndefOr[ContainerFormat]
    var DiskImageFormat: js.UndefOr[DiskImageFormat]
    var S3Bucket: js.UndefOr[String]
    var S3Prefix: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ExportTransitGatewayRoutesRequest extends js.Object {
    var S3Bucket: String
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
  }

  @js.native
  @Factory
  trait ExportTransitGatewayRoutesResult extends js.Object {
    var S3Location: js.UndefOr[String]
  }

  /**
    * Describes a Reserved Instance whose queued purchase was not deleted.
    */
  @js.native
  @Factory
  trait FailedQueuedPurchaseDeletion extends js.Object {
    var Error: js.UndefOr[DeleteQueuedReservedInstancesError]
    var ReservedInstancesId: js.UndefOr[String]
  }

  @js.native
  sealed trait FastSnapshotRestoreStateCode extends js.Any
  object FastSnapshotRestoreStateCode extends js.Object {
    val enabling   = "enabling".asInstanceOf[FastSnapshotRestoreStateCode]
    val optimizing = "optimizing".asInstanceOf[FastSnapshotRestoreStateCode]
    val enabled    = "enabled".asInstanceOf[FastSnapshotRestoreStateCode]
    val disabling  = "disabling".asInstanceOf[FastSnapshotRestoreStateCode]
    val disabled   = "disabled".asInstanceOf[FastSnapshotRestoreStateCode]

    val values = js.Object.freeze(js.Array(enabling, optimizing, enabled, disabling, disabled))
  }

  /**
    * A filter name and value pair that is used to return a more specific list of results from a describe operation. Filters can be used to match a set of resources by specific criteria, such as tags, attributes, or IDs. The filters supported by a describe operation are documented with the describe operation. For example:
    * * <a>DescribeAvailabilityZones</a>
    *  * <a>DescribeImages</a>
    *  * <a>DescribeInstances</a>
    *  * <a>DescribeKeyPairs</a>
    *  * <a>DescribeSecurityGroups</a>
    *  * <a>DescribeSnapshots</a>
    *  * <a>DescribeSubnets</a>
    *  * <a>DescribeTags</a>
    *  * <a>DescribeVolumes</a>
    *  * <a>DescribeVpcs</a>
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Name: js.UndefOr[String]
    var Values: js.UndefOr[ValueStringList]
  }

  @js.native
  sealed trait FleetActivityStatus extends js.Any
  object FleetActivityStatus extends js.Object {
    val error               = "error".asInstanceOf[FleetActivityStatus]
    val pending_fulfillment = "pending_fulfillment".asInstanceOf[FleetActivityStatus]
    val pending_termination = "pending_termination".asInstanceOf[FleetActivityStatus]
    val fulfilled           = "fulfilled".asInstanceOf[FleetActivityStatus]

    val values = js.Object.freeze(js.Array(error, pending_fulfillment, pending_termination, fulfilled))
  }

  @js.native
  sealed trait FleetCapacityReservationUsageStrategy extends js.Any
  object FleetCapacityReservationUsageStrategy extends js.Object {
    val `use-capacity-reservations-first` =
      "use-capacity-reservations-first".asInstanceOf[FleetCapacityReservationUsageStrategy]

    val values = js.Object.freeze(js.Array(`use-capacity-reservations-first`))
  }

  /**
    * Describes an EC2 Fleet.
    */
  @js.native
  @Factory
  trait FleetData extends js.Object {
    var ActivityStatus: js.UndefOr[FleetActivityStatus]
    var ClientToken: js.UndefOr[String]
    var CreateTime: js.UndefOr[DateTime]
    var Errors: js.UndefOr[DescribeFleetsErrorSet]
    var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy]
    var FleetId: js.UndefOr[FleetIdentifier]
    var FleetState: js.UndefOr[FleetStateCode]
    var FulfilledCapacity: js.UndefOr[Double]
    var FulfilledOnDemandCapacity: js.UndefOr[Double]
    var Instances: js.UndefOr[DescribeFleetsInstancesSet]
    var LaunchTemplateConfigs: js.UndefOr[FleetLaunchTemplateConfigList]
    var OnDemandOptions: js.UndefOr[OnDemandOptions]
    var ReplaceUnhealthyInstances: js.UndefOr[Boolean]
    var SpotOptions: js.UndefOr[SpotOptions]
    var Tags: js.UndefOr[TagList]
    var TargetCapacitySpecification: js.UndefOr[TargetCapacitySpecification]
    var TerminateInstancesWithExpiration: js.UndefOr[Boolean]
    var Type: js.UndefOr[FleetType]
    var ValidFrom: js.UndefOr[DateTime]
    var ValidUntil: js.UndefOr[DateTime]
  }

  @js.native
  sealed trait FleetEventType extends js.Any
  object FleetEventType extends js.Object {
    val `instance-change` = "instance-change".asInstanceOf[FleetEventType]
    val `fleet-change`    = "fleet-change".asInstanceOf[FleetEventType]
    val `service-error`   = "service-error".asInstanceOf[FleetEventType]

    val values = js.Object.freeze(js.Array(`instance-change`, `fleet-change`, `service-error`))
  }

  @js.native
  sealed trait FleetExcessCapacityTerminationPolicy extends js.Any
  object FleetExcessCapacityTerminationPolicy extends js.Object {
    val `no-termination` = "no-termination".asInstanceOf[FleetExcessCapacityTerminationPolicy]
    val termination      = "termination".asInstanceOf[FleetExcessCapacityTerminationPolicy]

    val values = js.Object.freeze(js.Array(`no-termination`, termination))
  }

  /**
    * Describes a launch template and overrides.
    */
  @js.native
  @Factory
  trait FleetLaunchTemplateConfig extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification]
    var Overrides: js.UndefOr[FleetLaunchTemplateOverridesList]
  }

  /**
    * Describes a launch template and overrides.
    */
  @js.native
  @Factory
  trait FleetLaunchTemplateConfigRequest extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecificationRequest]
    var Overrides: js.UndefOr[FleetLaunchTemplateOverridesListRequest]
  }

  /**
    * Describes overrides for a launch template.
    */
  @js.native
  @Factory
  trait FleetLaunchTemplateOverrides extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var MaxPrice: js.UndefOr[String]
    var Placement: js.UndefOr[PlacementResponse]
    var Priority: js.UndefOr[Double]
    var SubnetId: js.UndefOr[String]
    var WeightedCapacity: js.UndefOr[Double]
  }

  /**
    * Describes overrides for a launch template.
    */
  @js.native
  @Factory
  trait FleetLaunchTemplateOverridesRequest extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var MaxPrice: js.UndefOr[String]
    var Placement: js.UndefOr[Placement]
    var Priority: js.UndefOr[Double]
    var SubnetId: js.UndefOr[SubnetId]
    var WeightedCapacity: js.UndefOr[Double]
  }

  /**
    * Describes a launch template.
    */
  @js.native
  @Factory
  trait FleetLaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Version: js.UndefOr[String]
  }

  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request.
    */
  @js.native
  @Factory
  trait FleetLaunchTemplateSpecificationRequest extends js.Object {
    var LaunchTemplateId: js.UndefOr[LaunchTemplateId]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Version: js.UndefOr[String]
  }

  @js.native
  sealed trait FleetOnDemandAllocationStrategy extends js.Any
  object FleetOnDemandAllocationStrategy extends js.Object {
    val `lowest-price` = "lowest-price".asInstanceOf[FleetOnDemandAllocationStrategy]
    val prioritized    = "prioritized".asInstanceOf[FleetOnDemandAllocationStrategy]

    val values = js.Object.freeze(js.Array(`lowest-price`, prioritized))
  }

  @js.native
  sealed trait FleetStateCode extends js.Any
  object FleetStateCode extends js.Object {
    val submitted           = "submitted".asInstanceOf[FleetStateCode]
    val active              = "active".asInstanceOf[FleetStateCode]
    val deleted             = "deleted".asInstanceOf[FleetStateCode]
    val failed              = "failed".asInstanceOf[FleetStateCode]
    val deleted_running     = "deleted_running".asInstanceOf[FleetStateCode]
    val deleted_terminating = "deleted_terminating".asInstanceOf[FleetStateCode]
    val modifying           = "modifying".asInstanceOf[FleetStateCode]

    val values =
      js.Object.freeze(js.Array(submitted, active, deleted, failed, deleted_running, deleted_terminating, modifying))
  }

  @js.native
  sealed trait FleetType extends js.Any
  object FleetType extends js.Object {
    val request  = "request".asInstanceOf[FleetType]
    val maintain = "maintain".asInstanceOf[FleetType]
    val instant  = "instant".asInstanceOf[FleetType]

    val values = js.Object.freeze(js.Array(request, maintain, instant))
  }

  /**
    * Describes a flow log.
    */
  @js.native
  @Factory
  trait FlowLog extends js.Object {
    var CreationTime: js.UndefOr[DateTime]
    var DeliverLogsErrorMessage: js.UndefOr[String]
    var DeliverLogsPermissionArn: js.UndefOr[String]
    var DeliverLogsStatus: js.UndefOr[String]
    var FlowLogId: js.UndefOr[String]
    var FlowLogStatus: js.UndefOr[String]
    var LogDestination: js.UndefOr[String]
    var LogDestinationType: js.UndefOr[LogDestinationType]
    var LogFormat: js.UndefOr[String]
    var LogGroupName: js.UndefOr[String]
    var MaxAggregationInterval: js.UndefOr[Int]
    var ResourceId: js.UndefOr[String]
    var TrafficType: js.UndefOr[TrafficType]
  }

  @js.native
  sealed trait FlowLogsResourceType extends js.Any
  object FlowLogsResourceType extends js.Object {
    val VPC              = "VPC".asInstanceOf[FlowLogsResourceType]
    val Subnet           = "Subnet".asInstanceOf[FlowLogsResourceType]
    val NetworkInterface = "NetworkInterface".asInstanceOf[FlowLogsResourceType]

    val values = js.Object.freeze(js.Array(VPC, Subnet, NetworkInterface))
  }

  /**
    * Describes the FPGA accelerator for the instance type.
    */
  @js.native
  @Factory
  trait FpgaDeviceInfo extends js.Object {
    var Count: js.UndefOr[FpgaDeviceCount]
    var Manufacturer: js.UndefOr[FpgaDeviceManufacturerName]
    var MemoryInfo: js.UndefOr[FpgaDeviceMemoryInfo]
    var Name: js.UndefOr[FpgaDeviceName]
  }

  /**
    * Describes the memory for the FPGA accelerator for the instance type.
    */
  @js.native
  @Factory
  trait FpgaDeviceMemoryInfo extends js.Object {
    var SizeInMiB: js.UndefOr[FpgaDeviceMemorySize]
  }

  /**
    * Describes an Amazon FPGA image (AFI).
    */
  @js.native
  @Factory
  trait FpgaImage extends js.Object {
    var CreateTime: js.UndefOr[DateTime]
    var DataRetentionSupport: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var FpgaImageGlobalId: js.UndefOr[String]
    var FpgaImageId: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var OwnerAlias: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var PciId: js.UndefOr[PciId]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var Public: js.UndefOr[Boolean]
    var ShellVersion: js.UndefOr[String]
    var State: js.UndefOr[FpgaImageState]
    var Tags: js.UndefOr[TagList]
    var UpdateTime: js.UndefOr[DateTime]
  }

  /**
    * Describes an Amazon FPGA image (AFI) attribute.
    */
  @js.native
  @Factory
  trait FpgaImageAttribute extends js.Object {
    var Description: js.UndefOr[String]
    var FpgaImageId: js.UndefOr[String]
    var LoadPermissions: js.UndefOr[LoadPermissionList]
    var Name: js.UndefOr[String]
    var ProductCodes: js.UndefOr[ProductCodeList]
  }

  @js.native
  sealed trait FpgaImageAttributeName extends js.Any
  object FpgaImageAttributeName extends js.Object {
    val description    = "description".asInstanceOf[FpgaImageAttributeName]
    val name           = "name".asInstanceOf[FpgaImageAttributeName]
    val loadPermission = "loadPermission".asInstanceOf[FpgaImageAttributeName]
    val productCodes   = "productCodes".asInstanceOf[FpgaImageAttributeName]

    val values = js.Object.freeze(js.Array(description, name, loadPermission, productCodes))
  }

  /**
    * Describes the state of the bitstream generation process for an Amazon FPGA image (AFI).
    */
  @js.native
  @Factory
  trait FpgaImageState extends js.Object {
    var Code: js.UndefOr[FpgaImageStateCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait FpgaImageStateCode extends js.Any
  object FpgaImageStateCode extends js.Object {
    val pending     = "pending".asInstanceOf[FpgaImageStateCode]
    val failed      = "failed".asInstanceOf[FpgaImageStateCode]
    val available   = "available".asInstanceOf[FpgaImageStateCode]
    val unavailable = "unavailable".asInstanceOf[FpgaImageStateCode]

    val values = js.Object.freeze(js.Array(pending, failed, available, unavailable))
  }

  /**
    * Describes the FPGAs for the instance type.
    */
  @js.native
  @Factory
  trait FpgaInfo extends js.Object {
    var Fpgas: js.UndefOr[FpgaDeviceInfoList]
    var TotalFpgaMemoryInMiB: js.UndefOr[totalFpgaMemory]
  }

  @js.native
  sealed trait GatewayType extends js.Any
  object GatewayType extends js.Object {
    val `ipsec.1` = "ipsec.1".asInstanceOf[GatewayType]

    val values = js.Object.freeze(js.Array(`ipsec.1`))
  }

  @js.native
  @Factory
  trait GetAssociatedIpv6PoolCidrsRequest extends js.Object {
    var PoolId: Ipv6PoolEc2Id
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[Ipv6PoolMaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetAssociatedIpv6PoolCidrsResult extends js.Object {
    var Ipv6CidrAssociations: js.UndefOr[Ipv6CidrAssociationSet]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetCapacityReservationUsageRequest extends js.Object {
    var CapacityReservationId: CapacityReservationId
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[GetCapacityReservationUsageRequestMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetCapacityReservationUsageResult extends js.Object {
    var AvailableInstanceCount: js.UndefOr[Int]
    var CapacityReservationId: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var InstanceUsages: js.UndefOr[InstanceUsageSet]
    var NextToken: js.UndefOr[String]
    var State: js.UndefOr[CapacityReservationState]
    var TotalInstanceCount: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait GetCoipPoolUsageRequest extends js.Object {
    var PoolId: CoipPoolId
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[CoipPoolMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetCoipPoolUsageResult extends js.Object {
    var CoipAddressUsages: js.UndefOr[CoipAddressUsageSet]
    var CoipPoolId: js.UndefOr[String]
    var LocalGatewayRouteTableId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetConsoleOutputRequest extends js.Object {
    var InstanceId: InstanceId
    var DryRun: js.UndefOr[Boolean]
    var Latest: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetConsoleOutputResult extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Output: js.UndefOr[String]
    var Timestamp: js.UndefOr[DateTime]
  }

  @js.native
  @Factory
  trait GetConsoleScreenshotRequest extends js.Object {
    var InstanceId: InstanceId
    var DryRun: js.UndefOr[Boolean]
    var WakeUp: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetConsoleScreenshotResult extends js.Object {
    var ImageData: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetDefaultCreditSpecificationRequest extends js.Object {
    var InstanceFamily: UnlimitedSupportedInstanceFamily
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetDefaultCreditSpecificationResult extends js.Object {
    var InstanceFamilyCreditSpecification: js.UndefOr[InstanceFamilyCreditSpecification]
  }

  @js.native
  @Factory
  trait GetEbsDefaultKmsKeyIdRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetEbsDefaultKmsKeyIdResult extends js.Object {
    var KmsKeyId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetEbsEncryptionByDefaultRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetEbsEncryptionByDefaultResult extends js.Object {
    var EbsEncryptionByDefault: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetHostReservationPurchasePreviewRequest extends js.Object {
    var HostIdSet: RequestHostIdSet
    var OfferingId: OfferingId
  }

  @js.native
  @Factory
  trait GetHostReservationPurchasePreviewResult extends js.Object {
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Purchase: js.UndefOr[PurchaseSet]
    var TotalHourlyPrice: js.UndefOr[String]
    var TotalUpfrontPrice: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetLaunchTemplateDataRequest extends js.Object {
    var InstanceId: InstanceId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetLaunchTemplateDataResult extends js.Object {
    var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData]
  }

  @js.native
  @Factory
  trait GetPasswordDataRequest extends js.Object {
    var InstanceId: InstanceId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait GetPasswordDataResult extends js.Object {
    var InstanceId: js.UndefOr[String]
    var PasswordData: js.UndefOr[String]
    var Timestamp: js.UndefOr[DateTime]
  }

  /**
    * Contains the parameters for GetReservedInstanceExchangeQuote.
    */
  @js.native
  @Factory
  trait GetReservedInstancesExchangeQuoteRequest extends js.Object {
    var ReservedInstanceIds: ReservedInstanceIdSet
    var DryRun: js.UndefOr[Boolean]
    var TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet]
  }

  /**
    * Contains the output of GetReservedInstancesExchangeQuote.
    */
  @js.native
  @Factory
  trait GetReservedInstancesExchangeQuoteResult extends js.Object {
    var CurrencyCode: js.UndefOr[String]
    var IsValidExchange: js.UndefOr[Boolean]
    var OutputReservedInstancesWillExpireAt: js.UndefOr[DateTime]
    var PaymentDue: js.UndefOr[String]
    var ReservedInstanceValueRollup: js.UndefOr[ReservationValue]
    var ReservedInstanceValueSet: js.UndefOr[ReservedInstanceReservationValueSet]
    var TargetConfigurationValueRollup: js.UndefOr[ReservationValue]
    var TargetConfigurationValueSet: js.UndefOr[TargetReservationValueSet]
    var ValidationFailureReason: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetTransitGatewayAttachmentPropagationsRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetTransitGatewayAttachmentPropagationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TransitGatewayAttachmentPropagations: js.UndefOr[TransitGatewayAttachmentPropagationList]
  }

  @js.native
  @Factory
  trait GetTransitGatewayMulticastDomainAssociationsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayMulticastDomainId: js.UndefOr[TransitGatewayMulticastDomainId]
  }

  @js.native
  @Factory
  trait GetTransitGatewayMulticastDomainAssociationsResult extends js.Object {
    var MulticastDomainAssociations: js.UndefOr[TransitGatewayMulticastDomainAssociationList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetTransitGatewayRouteTableAssociationsRequest extends js.Object {
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetTransitGatewayRouteTableAssociationsResult extends js.Object {
    var Associations: js.UndefOr[TransitGatewayRouteTableAssociationList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetTransitGatewayRouteTablePropagationsRequest extends js.Object {
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetTransitGatewayRouteTablePropagationsResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var TransitGatewayRouteTablePropagations: js.UndefOr[TransitGatewayRouteTablePropagationList]
  }

  /**
    * Describes the GPU accelerators for the instance type.
    */
  @js.native
  @Factory
  trait GpuDeviceInfo extends js.Object {
    var Count: js.UndefOr[GpuDeviceCount]
    var Manufacturer: js.UndefOr[GpuDeviceManufacturerName]
    var MemoryInfo: js.UndefOr[GpuDeviceMemoryInfo]
    var Name: js.UndefOr[GpuDeviceName]
  }

  /**
    * Describes the memory available to the GPU accelerator.
    */
  @js.native
  @Factory
  trait GpuDeviceMemoryInfo extends js.Object {
    var SizeInMiB: js.UndefOr[GpuDeviceMemorySize]
  }

  /**
    * Describes the GPU accelerators for the instance type.
    */
  @js.native
  @Factory
  trait GpuInfo extends js.Object {
    var Gpus: js.UndefOr[GpuDeviceInfoList]
    var TotalGpuMemoryInMiB: js.UndefOr[totalGpuMemory]
  }

  /**
    * Describes a security group.
    */
  @js.native
  @Factory
  trait GroupIdentifier extends js.Object {
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  /**
    * Indicates whether your instance is configured for hibernation. This parameter is valid only if the instance meets the [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites|hibernation prerequisites]]. For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html|Hibernate Your Instance]] in the <i>Amazon Elastic Compute Cloud User Guide</i>.
    */
  @js.native
  @Factory
  trait HibernationOptions extends js.Object {
    var Configured: js.UndefOr[Boolean]
  }

  /**
    * Indicates whether your instance is configured for hibernation. This parameter is valid only if the instance meets the [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites|hibernation prerequisites]]. For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html|Hibernate Your Instance]] in the <i>Amazon Elastic Compute Cloud User Guide</i>.
    */
  @js.native
  @Factory
  trait HibernationOptionsRequest extends js.Object {
    var Configured: js.UndefOr[Boolean]
  }

  /**
    * Describes an event in the history of the Spot Fleet request.
    */
  @js.native
  @Factory
  trait HistoryRecord extends js.Object {
    var EventInformation: js.UndefOr[EventInformation]
    var EventType: js.UndefOr[EventType]
    var Timestamp: js.UndefOr[DateTime]
  }

  /**
    * Describes an event in the history of an EC2 Fleet.
    */
  @js.native
  @Factory
  trait HistoryRecordEntry extends js.Object {
    var EventInformation: js.UndefOr[EventInformation]
    var EventType: js.UndefOr[FleetEventType]
    var Timestamp: js.UndefOr[DateTime]
  }

  /**
    * Describes the properties of the Dedicated Host.
    */
  @js.native
  @Factory
  trait Host extends js.Object {
    var AllocationTime: js.UndefOr[DateTime]
    var AllowsMultipleInstanceTypes: js.UndefOr[AllowsMultipleInstanceTypes]
    var AutoPlacement: js.UndefOr[AutoPlacement]
    var AvailabilityZone: js.UndefOr[String]
    var AvailabilityZoneId: js.UndefOr[String]
    var AvailableCapacity: js.UndefOr[AvailableCapacity]
    var ClientToken: js.UndefOr[String]
    var HostId: js.UndefOr[String]
    var HostProperties: js.UndefOr[HostProperties]
    var HostRecovery: js.UndefOr[HostRecovery]
    var HostReservationId: js.UndefOr[String]
    var Instances: js.UndefOr[HostInstanceList]
    var MemberOfServiceLinkedResourceGroup: js.UndefOr[Boolean]
    var OwnerId: js.UndefOr[String]
    var ReleaseTime: js.UndefOr[DateTime]
    var State: js.UndefOr[AllocationState]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes an instance running on a Dedicated Host.
    */
  @js.native
  @Factory
  trait HostInstance extends js.Object {
    var InstanceId: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
  }

  /**
    * Details about the Dedicated Host Reservation offering.
    */
  @js.native
  @Factory
  trait HostOffering extends js.Object {
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Int]
    var HourlyPrice: js.UndefOr[String]
    var InstanceFamily: js.UndefOr[String]
    var OfferingId: js.UndefOr[String]
    var PaymentOption: js.UndefOr[PaymentOption]
    var UpfrontPrice: js.UndefOr[String]
  }

  /**
    * Describes the properties of a Dedicated Host.
    */
  @js.native
  @Factory
  trait HostProperties extends js.Object {
    var Cores: js.UndefOr[Int]
    var InstanceFamily: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var Sockets: js.UndefOr[Int]
    var TotalVCpus: js.UndefOr[Int]
  }

  @js.native
  sealed trait HostRecovery extends js.Any
  object HostRecovery extends js.Object {
    val on  = "on".asInstanceOf[HostRecovery]
    val off = "off".asInstanceOf[HostRecovery]

    val values = js.Object.freeze(js.Array(on, off))
  }

  /**
    * Details about the Dedicated Host Reservation and associated Dedicated Hosts.
    */
  @js.native
  @Factory
  trait HostReservation extends js.Object {
    var Count: js.UndefOr[Int]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Int]
    var End: js.UndefOr[DateTime]
    var HostIdSet: js.UndefOr[ResponseHostIdSet]
    var HostReservationId: js.UndefOr[String]
    var HourlyPrice: js.UndefOr[String]
    var InstanceFamily: js.UndefOr[String]
    var OfferingId: js.UndefOr[String]
    var PaymentOption: js.UndefOr[PaymentOption]
    var Start: js.UndefOr[DateTime]
    var State: js.UndefOr[ReservationState]
    var Tags: js.UndefOr[TagList]
    var UpfrontPrice: js.UndefOr[String]
  }

  @js.native
  sealed trait HostTenancy extends js.Any
  object HostTenancy extends js.Object {
    val dedicated = "dedicated".asInstanceOf[HostTenancy]
    val host      = "host".asInstanceOf[HostTenancy]

    val values = js.Object.freeze(js.Array(dedicated, host))
  }

  @js.native
  sealed trait HttpTokensState extends js.Any
  object HttpTokensState extends js.Object {
    val optional = "optional".asInstanceOf[HttpTokensState]
    val required = "required".asInstanceOf[HttpTokensState]

    val values = js.Object.freeze(js.Array(optional, required))
  }

  @js.native
  sealed trait HypervisorType extends js.Any
  object HypervisorType extends js.Object {
    val ovm = "ovm".asInstanceOf[HypervisorType]
    val xen = "xen".asInstanceOf[HypervisorType]

    val values = js.Object.freeze(js.Array(ovm, xen))
  }

  /**
    * The internet key exchange (IKE) version permitted for the VPN tunnel.
    */
  @js.native
  @Factory
  trait IKEVersionsListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * The IKE version that is permitted for the VPN tunnel.
    */
  @js.native
  @Factory
  trait IKEVersionsRequestListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * Describes an IAM instance profile.
    */
  @js.native
  @Factory
  trait IamInstanceProfile extends js.Object {
    var Arn: js.UndefOr[String]
    var Id: js.UndefOr[String]
  }

  /**
    * Describes an association between an IAM instance profile and an instance.
    */
  @js.native
  @Factory
  trait IamInstanceProfileAssociation extends js.Object {
    var AssociationId: js.UndefOr[String]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfile]
    var InstanceId: js.UndefOr[String]
    var State: js.UndefOr[IamInstanceProfileAssociationState]
    var Timestamp: js.UndefOr[DateTime]
  }

  @js.native
  sealed trait IamInstanceProfileAssociationState extends js.Any
  object IamInstanceProfileAssociationState extends js.Object {
    val associating    = "associating".asInstanceOf[IamInstanceProfileAssociationState]
    val associated     = "associated".asInstanceOf[IamInstanceProfileAssociationState]
    val disassociating = "disassociating".asInstanceOf[IamInstanceProfileAssociationState]
    val disassociated  = "disassociated".asInstanceOf[IamInstanceProfileAssociationState]

    val values = js.Object.freeze(js.Array(associating, associated, disassociating, disassociated))
  }

  /**
    * Describes an IAM instance profile.
    */
  @js.native
  @Factory
  trait IamInstanceProfileSpecification extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  /**
    * Describes the ICMP type and code.
    */
  @js.native
  @Factory
  trait IcmpTypeCode extends js.Object {
    var Code: js.UndefOr[Int]
    var Type: js.UndefOr[Int]
  }

  /**
    * Describes the ID format for a resource.
    */
  @js.native
  @Factory
  trait IdFormat extends js.Object {
    var Deadline: js.UndefOr[DateTime]
    var Resource: js.UndefOr[String]
    var UseLongIds: js.UndefOr[Boolean]
  }

  /**
    * Describes an image.
    */
  @js.native
  @Factory
  trait Image extends js.Object {
    var Architecture: js.UndefOr[ArchitectureValues]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var CreationDate: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var EnaSupport: js.UndefOr[Boolean]
    var Hypervisor: js.UndefOr[HypervisorType]
    var ImageId: js.UndefOr[String]
    var ImageLocation: js.UndefOr[String]
    var ImageOwnerAlias: js.UndefOr[String]
    var ImageType: js.UndefOr[ImageTypeValues]
    var KernelId: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var Platform: js.UndefOr[PlatformValues]
    var PlatformDetails: js.UndefOr[String]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var Public: js.UndefOr[Boolean]
    var RamdiskId: js.UndefOr[String]
    var RootDeviceName: js.UndefOr[String]
    var RootDeviceType: js.UndefOr[DeviceType]
    var SriovNetSupport: js.UndefOr[String]
    var State: js.UndefOr[ImageState]
    var StateReason: js.UndefOr[StateReason]
    var Tags: js.UndefOr[TagList]
    var UsageOperation: js.UndefOr[String]
    var VirtualizationType: js.UndefOr[VirtualizationType]
  }

  /**
    * Describes an image attribute.
    */
  @js.native
  @Factory
  trait ImageAttribute extends js.Object {
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var Description: js.UndefOr[AttributeValue]
    var ImageId: js.UndefOr[String]
    var KernelId: js.UndefOr[AttributeValue]
    var LaunchPermissions: js.UndefOr[LaunchPermissionList]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var RamdiskId: js.UndefOr[AttributeValue]
    var SriovNetSupport: js.UndefOr[AttributeValue]
  }

  @js.native
  sealed trait ImageAttributeName extends js.Any
  object ImageAttributeName extends js.Object {
    val description        = "description".asInstanceOf[ImageAttributeName]
    val kernel             = "kernel".asInstanceOf[ImageAttributeName]
    val ramdisk            = "ramdisk".asInstanceOf[ImageAttributeName]
    val launchPermission   = "launchPermission".asInstanceOf[ImageAttributeName]
    val productCodes       = "productCodes".asInstanceOf[ImageAttributeName]
    val blockDeviceMapping = "blockDeviceMapping".asInstanceOf[ImageAttributeName]
    val sriovNetSupport    = "sriovNetSupport".asInstanceOf[ImageAttributeName]

    val values = js.Object.freeze(
      js.Array(description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping, sriovNetSupport)
    )
  }

  /**
    * Describes the disk container object for an import image task.
    */
  @js.native
  @Factory
  trait ImageDiskContainer extends js.Object {
    var Description: js.UndefOr[String]
    var DeviceName: js.UndefOr[String]
    var Format: js.UndefOr[String]
    var SnapshotId: js.UndefOr[SnapshotId]
    var Url: js.UndefOr[String]
    var UserBucket: js.UndefOr[UserBucket]
  }

  @js.native
  sealed trait ImageState extends js.Any
  object ImageState extends js.Object {
    val pending      = "pending".asInstanceOf[ImageState]
    val available    = "available".asInstanceOf[ImageState]
    val invalid      = "invalid".asInstanceOf[ImageState]
    val deregistered = "deregistered".asInstanceOf[ImageState]
    val transient    = "transient".asInstanceOf[ImageState]
    val failed       = "failed".asInstanceOf[ImageState]
    val error        = "error".asInstanceOf[ImageState]

    val values = js.Object.freeze(js.Array(pending, available, invalid, deregistered, transient, failed, error))
  }

  @js.native
  sealed trait ImageTypeValues extends js.Any
  object ImageTypeValues extends js.Object {
    val machine = "machine".asInstanceOf[ImageTypeValues]
    val kernel  = "kernel".asInstanceOf[ImageTypeValues]
    val ramdisk = "ramdisk".asInstanceOf[ImageTypeValues]

    val values = js.Object.freeze(js.Array(machine, kernel, ramdisk))
  }

  @js.native
  @Factory
  trait ImportClientVpnClientCertificateRevocationListRequest extends js.Object {
    var CertificateRevocationList: String
    var ClientVpnEndpointId: ClientVpnEndpointId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ImportClientVpnClientCertificateRevocationListResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  /**
    * The request information of license configurations.
    */
  @js.native
  @Factory
  trait ImportImageLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  /**
    * The response information for license configurations.
    */
  @js.native
  @Factory
  trait ImportImageLicenseConfigurationResponse extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ImportImageRequest extends js.Object {
    var Architecture: js.UndefOr[String]
    var ClientData: js.UndefOr[ClientData]
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DiskContainers: js.UndefOr[ImageDiskContainerList]
    var DryRun: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var Hypervisor: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListRequest]
    var LicenseType: js.UndefOr[String]
    var Platform: js.UndefOr[String]
    var RoleName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ImportImageResult extends js.Object {
    var Architecture: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var Hypervisor: js.UndefOr[String]
    var ImageId: js.UndefOr[String]
    var ImportTaskId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListResponse]
    var LicenseType: js.UndefOr[String]
    var Platform: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var SnapshotDetails: js.UndefOr[SnapshotDetailList]
    var Status: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
  }

  /**
    * Describes an import image task.
    */
  @js.native
  @Factory
  trait ImportImageTask extends js.Object {
    var Architecture: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var Hypervisor: js.UndefOr[String]
    var ImageId: js.UndefOr[String]
    var ImportTaskId: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var LicenseSpecifications: js.UndefOr[ImportImageLicenseSpecificationListResponse]
    var LicenseType: js.UndefOr[String]
    var Platform: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var SnapshotDetails: js.UndefOr[SnapshotDetailList]
    var Status: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes the launch specification for VM import.
    */
  @js.native
  @Factory
  trait ImportInstanceLaunchSpecification extends js.Object {
    var AdditionalInfo: js.UndefOr[String]
    var Architecture: js.UndefOr[ArchitectureValues]
    var GroupIds: js.UndefOr[SecurityGroupIdStringList]
    var GroupNames: js.UndefOr[SecurityGroupStringList]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior]
    var InstanceType: js.UndefOr[InstanceType]
    var Monitoring: js.UndefOr[Boolean]
    var Placement: js.UndefOr[Placement]
    var PrivateIpAddress: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
    var UserData: js.UndefOr[UserData]
  }

  @js.native
  @Factory
  trait ImportInstanceRequest extends js.Object {
    var Platform: PlatformValues
    var Description: js.UndefOr[String]
    var DiskImages: js.UndefOr[DiskImageList]
    var DryRun: js.UndefOr[Boolean]
    var LaunchSpecification: js.UndefOr[ImportInstanceLaunchSpecification]
  }

  @js.native
  @Factory
  trait ImportInstanceResult extends js.Object {
    var ConversionTask: js.UndefOr[ConversionTask]
  }

  /**
    * Describes an import instance task.
    */
  @js.native
  @Factory
  trait ImportInstanceTaskDetails extends js.Object {
    var Description: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var Platform: js.UndefOr[PlatformValues]
    var Volumes: js.UndefOr[ImportInstanceVolumeDetailSet]
  }

  /**
    * Describes an import volume task.
    */
  @js.native
  @Factory
  trait ImportInstanceVolumeDetailItem extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var BytesConverted: js.UndefOr[Double]
    var Description: js.UndefOr[String]
    var Image: js.UndefOr[DiskImageDescription]
    var Status: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
    var Volume: js.UndefOr[DiskImageVolumeDescription]
  }

  @js.native
  @Factory
  trait ImportKeyPairRequest extends js.Object {
    var KeyName: String
    var PublicKeyMaterial: Blob
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ImportKeyPairResult extends js.Object {
    var KeyFingerprint: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ImportSnapshotRequest extends js.Object {
    var ClientData: js.UndefOr[ClientData]
    var ClientToken: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var DiskContainer: js.UndefOr[SnapshotDiskContainer]
    var DryRun: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var RoleName: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ImportSnapshotResult extends js.Object {
    var Description: js.UndefOr[String]
    var ImportTaskId: js.UndefOr[String]
    var SnapshotTaskDetail: js.UndefOr[SnapshotTaskDetail]
  }

  /**
    * Describes an import snapshot task.
    */
  @js.native
  @Factory
  trait ImportSnapshotTask extends js.Object {
    var Description: js.UndefOr[String]
    var ImportTaskId: js.UndefOr[String]
    var SnapshotTaskDetail: js.UndefOr[SnapshotTaskDetail]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ImportVolumeRequest extends js.Object {
    var AvailabilityZone: String
    var Image: DiskImageDetail
    var Volume: VolumeDetail
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ImportVolumeResult extends js.Object {
    var ConversionTask: js.UndefOr[ConversionTask]
  }

  /**
    * Describes an import volume task.
    */
  @js.native
  @Factory
  trait ImportVolumeTaskDetails extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var BytesConverted: js.UndefOr[Double]
    var Description: js.UndefOr[String]
    var Image: js.UndefOr[DiskImageDescription]
    var Volume: js.UndefOr[DiskImageVolumeDescription]
  }

  /**
    * Describes the Inference accelerators for the instance type.
    */
  @js.native
  @Factory
  trait InferenceAcceleratorInfo extends js.Object {
    var Accelerators: js.UndefOr[InferenceDeviceInfoList]
  }

  /**
    * Describes the Inference accelerators for the instance type.
    */
  @js.native
  @Factory
  trait InferenceDeviceInfo extends js.Object {
    var Count: js.UndefOr[InferenceDeviceCount]
    var Manufacturer: js.UndefOr[InferenceDeviceManufacturerName]
    var Name: js.UndefOr[InferenceDeviceName]
  }

  /**
    * Describes an instance.
    */
  @js.native
  @Factory
  trait Instance extends js.Object {
    var AmiLaunchIndex: js.UndefOr[Int]
    var Architecture: js.UndefOr[ArchitectureValues]
    var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList]
    var CapacityReservationId: js.UndefOr[String]
    var CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecificationResponse]
    var ClientToken: js.UndefOr[String]
    var CpuOptions: js.UndefOr[CpuOptions]
    var EbsOptimized: js.UndefOr[Boolean]
    var ElasticGpuAssociations: js.UndefOr[ElasticGpuAssociationList]
    var ElasticInferenceAcceleratorAssociations: js.UndefOr[ElasticInferenceAcceleratorAssociationList]
    var EnaSupport: js.UndefOr[Boolean]
    var HibernationOptions: js.UndefOr[HibernationOptions]
    var Hypervisor: js.UndefOr[HypervisorType]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfile]
    var ImageId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var InstanceLifecycle: js.UndefOr[InstanceLifecycleType]
    var InstanceType: js.UndefOr[InstanceType]
    var KernelId: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
    var LaunchTime: js.UndefOr[DateTime]
    var Licenses: js.UndefOr[LicenseList]
    var MetadataOptions: js.UndefOr[InstanceMetadataOptionsResponse]
    var Monitoring: js.UndefOr[Monitoring]
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceList]
    var OutpostArn: js.UndefOr[String]
    var Placement: js.UndefOr[Placement]
    var Platform: js.UndefOr[PlatformValues]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var PublicDnsName: js.UndefOr[String]
    var PublicIpAddress: js.UndefOr[String]
    var RamdiskId: js.UndefOr[String]
    var RootDeviceName: js.UndefOr[String]
    var RootDeviceType: js.UndefOr[DeviceType]
    var SecurityGroups: js.UndefOr[GroupIdentifierList]
    var SourceDestCheck: js.UndefOr[Boolean]
    var SpotInstanceRequestId: js.UndefOr[String]
    var SriovNetSupport: js.UndefOr[String]
    var State: js.UndefOr[InstanceState]
    var StateReason: js.UndefOr[StateReason]
    var StateTransitionReason: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VirtualizationType: js.UndefOr[VirtualizationType]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes an instance attribute.
    */
  @js.native
  @Factory
  trait InstanceAttribute extends js.Object {
    var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList]
    var DisableApiTermination: js.UndefOr[AttributeBooleanValue]
    var EbsOptimized: js.UndefOr[AttributeBooleanValue]
    var EnaSupport: js.UndefOr[AttributeBooleanValue]
    var Groups: js.UndefOr[GroupIdentifierList]
    var InstanceId: js.UndefOr[String]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue]
    var InstanceType: js.UndefOr[AttributeValue]
    var KernelId: js.UndefOr[AttributeValue]
    var ProductCodes: js.UndefOr[ProductCodeList]
    var RamdiskId: js.UndefOr[AttributeValue]
    var RootDeviceName: js.UndefOr[AttributeValue]
    var SourceDestCheck: js.UndefOr[AttributeBooleanValue]
    var SriovNetSupport: js.UndefOr[AttributeValue]
    var UserData: js.UndefOr[AttributeValue]
  }

  @js.native
  sealed trait InstanceAttributeName extends js.Any
  object InstanceAttributeName extends js.Object {
    val instanceType                      = "instanceType".asInstanceOf[InstanceAttributeName]
    val kernel                            = "kernel".asInstanceOf[InstanceAttributeName]
    val ramdisk                           = "ramdisk".asInstanceOf[InstanceAttributeName]
    val userData                          = "userData".asInstanceOf[InstanceAttributeName]
    val disableApiTermination             = "disableApiTermination".asInstanceOf[InstanceAttributeName]
    val instanceInitiatedShutdownBehavior = "instanceInitiatedShutdownBehavior".asInstanceOf[InstanceAttributeName]
    val rootDeviceName                    = "rootDeviceName".asInstanceOf[InstanceAttributeName]
    val blockDeviceMapping                = "blockDeviceMapping".asInstanceOf[InstanceAttributeName]
    val productCodes                      = "productCodes".asInstanceOf[InstanceAttributeName]
    val sourceDestCheck                   = "sourceDestCheck".asInstanceOf[InstanceAttributeName]
    val groupSet                          = "groupSet".asInstanceOf[InstanceAttributeName]
    val ebsOptimized                      = "ebsOptimized".asInstanceOf[InstanceAttributeName]
    val sriovNetSupport                   = "sriovNetSupport".asInstanceOf[InstanceAttributeName]
    val enaSupport                        = "enaSupport".asInstanceOf[InstanceAttributeName]

    val values = js.Object.freeze(
      js.Array(
        instanceType,
        kernel,
        ramdisk,
        userData,
        disableApiTermination,
        instanceInitiatedShutdownBehavior,
        rootDeviceName,
        blockDeviceMapping,
        productCodes,
        sourceDestCheck,
        groupSet,
        ebsOptimized,
        sriovNetSupport,
        enaSupport
      )
    )
  }

  /**
    * Describes a block device mapping.
    */
  @js.native
  @Factory
  trait InstanceBlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[EbsInstanceBlockDevice]
  }

  /**
    * Describes a block device mapping entry.
    */
  @js.native
  @Factory
  trait InstanceBlockDeviceMappingSpecification extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  /**
    * Information about the number of instances that can be launched onto the Dedicated Host.
    */
  @js.native
  @Factory
  trait InstanceCapacity extends js.Object {
    var AvailableCapacity: js.UndefOr[Int]
    var InstanceType: js.UndefOr[String]
    var TotalCapacity: js.UndefOr[Int]
  }

  /**
    * Describes a Reserved Instance listing state.
    */
  @js.native
  @Factory
  trait InstanceCount extends js.Object {
    var InstanceCount: js.UndefOr[Int]
    var State: js.UndefOr[ListingState]
  }

  /**
    * Describes the credit option for CPU usage of a burstable performance instance.
    */
  @js.native
  @Factory
  trait InstanceCreditSpecification extends js.Object {
    var CpuCredits: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
  }

  /**
    * Describes the credit option for CPU usage of a burstable performance instance.
    */
  @js.native
  @Factory
  trait InstanceCreditSpecificationRequest extends js.Object {
    var CpuCredits: js.UndefOr[String]
    var InstanceId: js.UndefOr[InstanceId]
  }

  /**
    * Describes an instance to export.
    */
  @js.native
  @Factory
  trait InstanceExportDetails extends js.Object {
    var InstanceId: js.UndefOr[String]
    var TargetEnvironment: js.UndefOr[ExportEnvironment]
  }

  /**
    * Describes the default credit option for CPU usage of a burstable performance instance family.
    */
  @js.native
  @Factory
  trait InstanceFamilyCreditSpecification extends js.Object {
    var CpuCredits: js.UndefOr[String]
    var InstanceFamily: js.UndefOr[UnlimitedSupportedInstanceFamily]
  }

  @js.native
  sealed trait InstanceHealthStatus extends js.Any
  object InstanceHealthStatus extends js.Object {
    val healthy   = "healthy".asInstanceOf[InstanceHealthStatus]
    val unhealthy = "unhealthy".asInstanceOf[InstanceHealthStatus]

    val values = js.Object.freeze(js.Array(healthy, unhealthy))
  }

  @js.native
  sealed trait InstanceInterruptionBehavior extends js.Any
  object InstanceInterruptionBehavior extends js.Object {
    val hibernate = "hibernate".asInstanceOf[InstanceInterruptionBehavior]
    val stop      = "stop".asInstanceOf[InstanceInterruptionBehavior]
    val terminate = "terminate".asInstanceOf[InstanceInterruptionBehavior]

    val values = js.Object.freeze(js.Array(hibernate, stop, terminate))
  }

  /**
    * Describes an IPv6 address.
    */
  @js.native
  @Factory
  trait InstanceIpv6Address extends js.Object {
    var Ipv6Address: js.UndefOr[String]
  }

  /**
    * Describes an IPv6 address.
    */
  @js.native
  @Factory
  trait InstanceIpv6AddressRequest extends js.Object {
    var Ipv6Address: js.UndefOr[String]
  }

  @js.native
  sealed trait InstanceLifecycle extends js.Any
  object InstanceLifecycle extends js.Object {
    val spot        = "spot".asInstanceOf[InstanceLifecycle]
    val `on-demand` = "on-demand".asInstanceOf[InstanceLifecycle]

    val values = js.Object.freeze(js.Array(spot, `on-demand`))
  }

  @js.native
  sealed trait InstanceLifecycleType extends js.Any
  object InstanceLifecycleType extends js.Object {
    val spot      = "spot".asInstanceOf[InstanceLifecycleType]
    val scheduled = "scheduled".asInstanceOf[InstanceLifecycleType]

    val values = js.Object.freeze(js.Array(spot, scheduled))
  }

  /**
    * Describes the market (purchasing) option for the instances.
    */
  @js.native
  @Factory
  trait InstanceMarketOptionsRequest extends js.Object {
    var MarketType: js.UndefOr[MarketType]
    var SpotOptions: js.UndefOr[SpotMarketOptions]
  }

  @js.native
  sealed trait InstanceMatchCriteria extends js.Any
  object InstanceMatchCriteria extends js.Object {
    val open     = "open".asInstanceOf[InstanceMatchCriteria]
    val targeted = "targeted".asInstanceOf[InstanceMatchCriteria]

    val values = js.Object.freeze(js.Array(open, targeted))
  }

  @js.native
  sealed trait InstanceMetadataEndpointState extends js.Any
  object InstanceMetadataEndpointState extends js.Object {
    val disabled = "disabled".asInstanceOf[InstanceMetadataEndpointState]
    val enabled  = "enabled".asInstanceOf[InstanceMetadataEndpointState]

    val values = js.Object.freeze(js.Array(disabled, enabled))
  }

  /**
    * The metadata options for the instance.
    */
  @js.native
  @Factory
  trait InstanceMetadataOptionsRequest extends js.Object {
    var HttpEndpoint: js.UndefOr[InstanceMetadataEndpointState]
    var HttpPutResponseHopLimit: js.UndefOr[Int]
    var HttpTokens: js.UndefOr[HttpTokensState]
  }

  /**
    * The metadata options for the instance.
    */
  @js.native
  @Factory
  trait InstanceMetadataOptionsResponse extends js.Object {
    var HttpEndpoint: js.UndefOr[InstanceMetadataEndpointState]
    var HttpPutResponseHopLimit: js.UndefOr[Int]
    var HttpTokens: js.UndefOr[HttpTokensState]
    var State: js.UndefOr[InstanceMetadataOptionsState]
  }

  @js.native
  sealed trait InstanceMetadataOptionsState extends js.Any
  object InstanceMetadataOptionsState extends js.Object {
    val pending = "pending".asInstanceOf[InstanceMetadataOptionsState]
    val applied = "applied".asInstanceOf[InstanceMetadataOptionsState]

    val values = js.Object.freeze(js.Array(pending, applied))
  }

  /**
    * Describes the monitoring of an instance.
    */
  @js.native
  @Factory
  trait InstanceMonitoring extends js.Object {
    var InstanceId: js.UndefOr[String]
    var Monitoring: js.UndefOr[Monitoring]
  }

  /**
    * Describes a network interface.
    */
  @js.native
  @Factory
  trait InstanceNetworkInterface extends js.Object {
    var Association: js.UndefOr[InstanceNetworkInterfaceAssociation]
    var Attachment: js.UndefOr[InstanceNetworkInterfaceAttachment]
    var Description: js.UndefOr[String]
    var Groups: js.UndefOr[GroupIdentifierList]
    var InterfaceType: js.UndefOr[String]
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var MacAddress: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[InstancePrivateIpAddressList]
    var SourceDestCheck: js.UndefOr[Boolean]
    var Status: js.UndefOr[NetworkInterfaceStatus]
    var SubnetId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes association information for an Elastic IP address (IPv4).
    */
  @js.native
  @Factory
  trait InstanceNetworkInterfaceAssociation extends js.Object {
    var IpOwnerId: js.UndefOr[String]
    var PublicDnsName: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
  }

  /**
    * Describes a network interface attachment.
    */
  @js.native
  @Factory
  trait InstanceNetworkInterfaceAttachment extends js.Object {
    var AttachTime: js.UndefOr[DateTime]
    var AttachmentId: js.UndefOr[String]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var DeviceIndex: js.UndefOr[Int]
    var Status: js.UndefOr[AttachmentStatus]
  }

  /**
    * Describes a network interface.
    */
  @js.native
  @Factory
  trait InstanceNetworkInterfaceSpecification extends js.Object {
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var DeviceIndex: js.UndefOr[Int]
    var Groups: js.UndefOr[SecurityGroupIdStringList]
    var InterfaceType: js.UndefOr[String]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var NetworkInterfaceId: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
    var SubnetId: js.UndefOr[String]
  }

  /**
    * Describes a private IPv4 address.
    */
  @js.native
  @Factory
  trait InstancePrivateIpAddress extends js.Object {
    var Association: js.UndefOr[InstanceNetworkInterfaceAssociation]
    var Primary: js.UndefOr[Boolean]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
  }

  /**
    * The instance details to specify which volumes should be snapshotted.
    */
  @js.native
  @Factory
  trait InstanceSpecification extends js.Object {
    var ExcludeBootVolume: js.UndefOr[Boolean]
    var InstanceId: js.UndefOr[InstanceId]
  }

  /**
    * Describes the current state of an instance.
    */
  @js.native
  @Factory
  trait InstanceState extends js.Object {
    var Code: js.UndefOr[Int]
    var Name: js.UndefOr[InstanceStateName]
  }

  /**
    * Describes an instance state change.
    */
  @js.native
  @Factory
  trait InstanceStateChange extends js.Object {
    var CurrentState: js.UndefOr[InstanceState]
    var InstanceId: js.UndefOr[String]
    var PreviousState: js.UndefOr[InstanceState]
  }

  @js.native
  sealed trait InstanceStateName extends js.Any
  object InstanceStateName extends js.Object {
    val pending         = "pending".asInstanceOf[InstanceStateName]
    val running         = "running".asInstanceOf[InstanceStateName]
    val `shutting-down` = "shutting-down".asInstanceOf[InstanceStateName]
    val terminated      = "terminated".asInstanceOf[InstanceStateName]
    val stopping        = "stopping".asInstanceOf[InstanceStateName]
    val stopped         = "stopped".asInstanceOf[InstanceStateName]

    val values = js.Object.freeze(js.Array(pending, running, `shutting-down`, terminated, stopping, stopped))
  }

  /**
    * Describes the status of an instance.
    */
  @js.native
  @Factory
  trait InstanceStatus extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var Events: js.UndefOr[InstanceStatusEventList]
    var InstanceId: js.UndefOr[String]
    var InstanceState: js.UndefOr[InstanceState]
    var InstanceStatus: js.UndefOr[InstanceStatusSummary]
    var OutpostArn: js.UndefOr[String]
    var SystemStatus: js.UndefOr[InstanceStatusSummary]
  }

  /**
    * Describes the instance status.
    */
  @js.native
  @Factory
  trait InstanceStatusDetails extends js.Object {
    var ImpairedSince: js.UndefOr[DateTime]
    var Name: js.UndefOr[StatusName]
    var Status: js.UndefOr[StatusType]
  }

  /**
    * Describes a scheduled event for an instance.
    */
  @js.native
  @Factory
  trait InstanceStatusEvent extends js.Object {
    var Code: js.UndefOr[EventCode]
    var Description: js.UndefOr[String]
    var InstanceEventId: js.UndefOr[InstanceEventId]
    var NotAfter: js.UndefOr[DateTime]
    var NotBefore: js.UndefOr[DateTime]
    var NotBeforeDeadline: js.UndefOr[DateTime]
  }

  /**
    * Describes the status of an instance.
    */
  @js.native
  @Factory
  trait InstanceStatusSummary extends js.Object {
    var Details: js.UndefOr[InstanceStatusDetailsList]
    var Status: js.UndefOr[SummaryStatus]
  }

  /**
    * Describes the disks that are available for the instance type.
    */
  @js.native
  @Factory
  trait InstanceStorageInfo extends js.Object {
    var Disks: js.UndefOr[DiskInfoList]
    var TotalSizeInGB: js.UndefOr[DiskSize]
  }

  @js.native
  sealed trait InstanceType extends js.Any
  object InstanceType extends js.Object {
    val `t1.micro`      = "t1.micro".asInstanceOf[InstanceType]
    val `t2.nano`       = "t2.nano".asInstanceOf[InstanceType]
    val `t2.micro`      = "t2.micro".asInstanceOf[InstanceType]
    val `t2.small`      = "t2.small".asInstanceOf[InstanceType]
    val `t2.medium`     = "t2.medium".asInstanceOf[InstanceType]
    val `t2.large`      = "t2.large".asInstanceOf[InstanceType]
    val `t2.xlarge`     = "t2.xlarge".asInstanceOf[InstanceType]
    val `t2.2xlarge`    = "t2.2xlarge".asInstanceOf[InstanceType]
    val `t3.nano`       = "t3.nano".asInstanceOf[InstanceType]
    val `t3.micro`      = "t3.micro".asInstanceOf[InstanceType]
    val `t3.small`      = "t3.small".asInstanceOf[InstanceType]
    val `t3.medium`     = "t3.medium".asInstanceOf[InstanceType]
    val `t3.large`      = "t3.large".asInstanceOf[InstanceType]
    val `t3.xlarge`     = "t3.xlarge".asInstanceOf[InstanceType]
    val `t3.2xlarge`    = "t3.2xlarge".asInstanceOf[InstanceType]
    val `t3a.nano`      = "t3a.nano".asInstanceOf[InstanceType]
    val `t3a.micro`     = "t3a.micro".asInstanceOf[InstanceType]
    val `t3a.small`     = "t3a.small".asInstanceOf[InstanceType]
    val `t3a.medium`    = "t3a.medium".asInstanceOf[InstanceType]
    val `t3a.large`     = "t3a.large".asInstanceOf[InstanceType]
    val `t3a.xlarge`    = "t3a.xlarge".asInstanceOf[InstanceType]
    val `t3a.2xlarge`   = "t3a.2xlarge".asInstanceOf[InstanceType]
    val `m1.small`      = "m1.small".asInstanceOf[InstanceType]
    val `m1.medium`     = "m1.medium".asInstanceOf[InstanceType]
    val `m1.large`      = "m1.large".asInstanceOf[InstanceType]
    val `m1.xlarge`     = "m1.xlarge".asInstanceOf[InstanceType]
    val `m3.medium`     = "m3.medium".asInstanceOf[InstanceType]
    val `m3.large`      = "m3.large".asInstanceOf[InstanceType]
    val `m3.xlarge`     = "m3.xlarge".asInstanceOf[InstanceType]
    val `m3.2xlarge`    = "m3.2xlarge".asInstanceOf[InstanceType]
    val `m4.large`      = "m4.large".asInstanceOf[InstanceType]
    val `m4.xlarge`     = "m4.xlarge".asInstanceOf[InstanceType]
    val `m4.2xlarge`    = "m4.2xlarge".asInstanceOf[InstanceType]
    val `m4.4xlarge`    = "m4.4xlarge".asInstanceOf[InstanceType]
    val `m4.10xlarge`   = "m4.10xlarge".asInstanceOf[InstanceType]
    val `m4.16xlarge`   = "m4.16xlarge".asInstanceOf[InstanceType]
    val `m2.xlarge`     = "m2.xlarge".asInstanceOf[InstanceType]
    val `m2.2xlarge`    = "m2.2xlarge".asInstanceOf[InstanceType]
    val `m2.4xlarge`    = "m2.4xlarge".asInstanceOf[InstanceType]
    val `cr1.8xlarge`   = "cr1.8xlarge".asInstanceOf[InstanceType]
    val `r3.large`      = "r3.large".asInstanceOf[InstanceType]
    val `r3.xlarge`     = "r3.xlarge".asInstanceOf[InstanceType]
    val `r3.2xlarge`    = "r3.2xlarge".asInstanceOf[InstanceType]
    val `r3.4xlarge`    = "r3.4xlarge".asInstanceOf[InstanceType]
    val `r3.8xlarge`    = "r3.8xlarge".asInstanceOf[InstanceType]
    val `r4.large`      = "r4.large".asInstanceOf[InstanceType]
    val `r4.xlarge`     = "r4.xlarge".asInstanceOf[InstanceType]
    val `r4.2xlarge`    = "r4.2xlarge".asInstanceOf[InstanceType]
    val `r4.4xlarge`    = "r4.4xlarge".asInstanceOf[InstanceType]
    val `r4.8xlarge`    = "r4.8xlarge".asInstanceOf[InstanceType]
    val `r4.16xlarge`   = "r4.16xlarge".asInstanceOf[InstanceType]
    val `r5.large`      = "r5.large".asInstanceOf[InstanceType]
    val `r5.xlarge`     = "r5.xlarge".asInstanceOf[InstanceType]
    val `r5.2xlarge`    = "r5.2xlarge".asInstanceOf[InstanceType]
    val `r5.4xlarge`    = "r5.4xlarge".asInstanceOf[InstanceType]
    val `r5.8xlarge`    = "r5.8xlarge".asInstanceOf[InstanceType]
    val `r5.12xlarge`   = "r5.12xlarge".asInstanceOf[InstanceType]
    val `r5.16xlarge`   = "r5.16xlarge".asInstanceOf[InstanceType]
    val `r5.24xlarge`   = "r5.24xlarge".asInstanceOf[InstanceType]
    val `r5.metal`      = "r5.metal".asInstanceOf[InstanceType]
    val `r5a.large`     = "r5a.large".asInstanceOf[InstanceType]
    val `r5a.xlarge`    = "r5a.xlarge".asInstanceOf[InstanceType]
    val `r5a.2xlarge`   = "r5a.2xlarge".asInstanceOf[InstanceType]
    val `r5a.4xlarge`   = "r5a.4xlarge".asInstanceOf[InstanceType]
    val `r5a.8xlarge`   = "r5a.8xlarge".asInstanceOf[InstanceType]
    val `r5a.12xlarge`  = "r5a.12xlarge".asInstanceOf[InstanceType]
    val `r5a.16xlarge`  = "r5a.16xlarge".asInstanceOf[InstanceType]
    val `r5a.24xlarge`  = "r5a.24xlarge".asInstanceOf[InstanceType]
    val `r5d.large`     = "r5d.large".asInstanceOf[InstanceType]
    val `r5d.xlarge`    = "r5d.xlarge".asInstanceOf[InstanceType]
    val `r5d.2xlarge`   = "r5d.2xlarge".asInstanceOf[InstanceType]
    val `r5d.4xlarge`   = "r5d.4xlarge".asInstanceOf[InstanceType]
    val `r5d.8xlarge`   = "r5d.8xlarge".asInstanceOf[InstanceType]
    val `r5d.12xlarge`  = "r5d.12xlarge".asInstanceOf[InstanceType]
    val `r5d.16xlarge`  = "r5d.16xlarge".asInstanceOf[InstanceType]
    val `r5d.24xlarge`  = "r5d.24xlarge".asInstanceOf[InstanceType]
    val `r5d.metal`     = "r5d.metal".asInstanceOf[InstanceType]
    val `r5ad.large`    = "r5ad.large".asInstanceOf[InstanceType]
    val `r5ad.xlarge`   = "r5ad.xlarge".asInstanceOf[InstanceType]
    val `r5ad.2xlarge`  = "r5ad.2xlarge".asInstanceOf[InstanceType]
    val `r5ad.4xlarge`  = "r5ad.4xlarge".asInstanceOf[InstanceType]
    val `r5ad.8xlarge`  = "r5ad.8xlarge".asInstanceOf[InstanceType]
    val `r5ad.12xlarge` = "r5ad.12xlarge".asInstanceOf[InstanceType]
    val `r5ad.16xlarge` = "r5ad.16xlarge".asInstanceOf[InstanceType]
    val `r5ad.24xlarge` = "r5ad.24xlarge".asInstanceOf[InstanceType]
    val `x1.16xlarge`   = "x1.16xlarge".asInstanceOf[InstanceType]
    val `x1.32xlarge`   = "x1.32xlarge".asInstanceOf[InstanceType]
    val `x1e.xlarge`    = "x1e.xlarge".asInstanceOf[InstanceType]
    val `x1e.2xlarge`   = "x1e.2xlarge".asInstanceOf[InstanceType]
    val `x1e.4xlarge`   = "x1e.4xlarge".asInstanceOf[InstanceType]
    val `x1e.8xlarge`   = "x1e.8xlarge".asInstanceOf[InstanceType]
    val `x1e.16xlarge`  = "x1e.16xlarge".asInstanceOf[InstanceType]
    val `x1e.32xlarge`  = "x1e.32xlarge".asInstanceOf[InstanceType]
    val `i2.xlarge`     = "i2.xlarge".asInstanceOf[InstanceType]
    val `i2.2xlarge`    = "i2.2xlarge".asInstanceOf[InstanceType]
    val `i2.4xlarge`    = "i2.4xlarge".asInstanceOf[InstanceType]
    val `i2.8xlarge`    = "i2.8xlarge".asInstanceOf[InstanceType]
    val `i3.large`      = "i3.large".asInstanceOf[InstanceType]
    val `i3.xlarge`     = "i3.xlarge".asInstanceOf[InstanceType]
    val `i3.2xlarge`    = "i3.2xlarge".asInstanceOf[InstanceType]
    val `i3.4xlarge`    = "i3.4xlarge".asInstanceOf[InstanceType]
    val `i3.8xlarge`    = "i3.8xlarge".asInstanceOf[InstanceType]
    val `i3.16xlarge`   = "i3.16xlarge".asInstanceOf[InstanceType]
    val `i3.metal`      = "i3.metal".asInstanceOf[InstanceType]
    val `i3en.large`    = "i3en.large".asInstanceOf[InstanceType]
    val `i3en.xlarge`   = "i3en.xlarge".asInstanceOf[InstanceType]
    val `i3en.2xlarge`  = "i3en.2xlarge".asInstanceOf[InstanceType]
    val `i3en.3xlarge`  = "i3en.3xlarge".asInstanceOf[InstanceType]
    val `i3en.6xlarge`  = "i3en.6xlarge".asInstanceOf[InstanceType]
    val `i3en.12xlarge` = "i3en.12xlarge".asInstanceOf[InstanceType]
    val `i3en.24xlarge` = "i3en.24xlarge".asInstanceOf[InstanceType]
    val `i3en.metal`    = "i3en.metal".asInstanceOf[InstanceType]
    val `hi1.4xlarge`   = "hi1.4xlarge".asInstanceOf[InstanceType]
    val `hs1.8xlarge`   = "hs1.8xlarge".asInstanceOf[InstanceType]
    val `c1.medium`     = "c1.medium".asInstanceOf[InstanceType]
    val `c1.xlarge`     = "c1.xlarge".asInstanceOf[InstanceType]
    val `c3.large`      = "c3.large".asInstanceOf[InstanceType]
    val `c3.xlarge`     = "c3.xlarge".asInstanceOf[InstanceType]
    val `c3.2xlarge`    = "c3.2xlarge".asInstanceOf[InstanceType]
    val `c3.4xlarge`    = "c3.4xlarge".asInstanceOf[InstanceType]
    val `c3.8xlarge`    = "c3.8xlarge".asInstanceOf[InstanceType]
    val `c4.large`      = "c4.large".asInstanceOf[InstanceType]
    val `c4.xlarge`     = "c4.xlarge".asInstanceOf[InstanceType]
    val `c4.2xlarge`    = "c4.2xlarge".asInstanceOf[InstanceType]
    val `c4.4xlarge`    = "c4.4xlarge".asInstanceOf[InstanceType]
    val `c4.8xlarge`    = "c4.8xlarge".asInstanceOf[InstanceType]
    val `c5.large`      = "c5.large".asInstanceOf[InstanceType]
    val `c5.xlarge`     = "c5.xlarge".asInstanceOf[InstanceType]
    val `c5.2xlarge`    = "c5.2xlarge".asInstanceOf[InstanceType]
    val `c5.4xlarge`    = "c5.4xlarge".asInstanceOf[InstanceType]
    val `c5.9xlarge`    = "c5.9xlarge".asInstanceOf[InstanceType]
    val `c5.12xlarge`   = "c5.12xlarge".asInstanceOf[InstanceType]
    val `c5.18xlarge`   = "c5.18xlarge".asInstanceOf[InstanceType]
    val `c5.24xlarge`   = "c5.24xlarge".asInstanceOf[InstanceType]
    val `c5.metal`      = "c5.metal".asInstanceOf[InstanceType]
    val `c5d.large`     = "c5d.large".asInstanceOf[InstanceType]
    val `c5d.xlarge`    = "c5d.xlarge".asInstanceOf[InstanceType]
    val `c5d.2xlarge`   = "c5d.2xlarge".asInstanceOf[InstanceType]
    val `c5d.4xlarge`   = "c5d.4xlarge".asInstanceOf[InstanceType]
    val `c5d.9xlarge`   = "c5d.9xlarge".asInstanceOf[InstanceType]
    val `c5d.12xlarge`  = "c5d.12xlarge".asInstanceOf[InstanceType]
    val `c5d.18xlarge`  = "c5d.18xlarge".asInstanceOf[InstanceType]
    val `c5d.24xlarge`  = "c5d.24xlarge".asInstanceOf[InstanceType]
    val `c5d.metal`     = "c5d.metal".asInstanceOf[InstanceType]
    val `c5n.large`     = "c5n.large".asInstanceOf[InstanceType]
    val `c5n.xlarge`    = "c5n.xlarge".asInstanceOf[InstanceType]
    val `c5n.2xlarge`   = "c5n.2xlarge".asInstanceOf[InstanceType]
    val `c5n.4xlarge`   = "c5n.4xlarge".asInstanceOf[InstanceType]
    val `c5n.9xlarge`   = "c5n.9xlarge".asInstanceOf[InstanceType]
    val `c5n.18xlarge`  = "c5n.18xlarge".asInstanceOf[InstanceType]
    val `cc1.4xlarge`   = "cc1.4xlarge".asInstanceOf[InstanceType]
    val `cc2.8xlarge`   = "cc2.8xlarge".asInstanceOf[InstanceType]
    val `g2.2xlarge`    = "g2.2xlarge".asInstanceOf[InstanceType]
    val `g2.8xlarge`    = "g2.8xlarge".asInstanceOf[InstanceType]
    val `g3.4xlarge`    = "g3.4xlarge".asInstanceOf[InstanceType]
    val `g3.8xlarge`    = "g3.8xlarge".asInstanceOf[InstanceType]
    val `g3.16xlarge`   = "g3.16xlarge".asInstanceOf[InstanceType]
    val `g3s.xlarge`    = "g3s.xlarge".asInstanceOf[InstanceType]
    val `g4dn.xlarge`   = "g4dn.xlarge".asInstanceOf[InstanceType]
    val `g4dn.2xlarge`  = "g4dn.2xlarge".asInstanceOf[InstanceType]
    val `g4dn.4xlarge`  = "g4dn.4xlarge".asInstanceOf[InstanceType]
    val `g4dn.8xlarge`  = "g4dn.8xlarge".asInstanceOf[InstanceType]
    val `g4dn.12xlarge` = "g4dn.12xlarge".asInstanceOf[InstanceType]
    val `g4dn.16xlarge` = "g4dn.16xlarge".asInstanceOf[InstanceType]
    val `cg1.4xlarge`   = "cg1.4xlarge".asInstanceOf[InstanceType]
    val `p2.xlarge`     = "p2.xlarge".asInstanceOf[InstanceType]
    val `p2.8xlarge`    = "p2.8xlarge".asInstanceOf[InstanceType]
    val `p2.16xlarge`   = "p2.16xlarge".asInstanceOf[InstanceType]
    val `p3.2xlarge`    = "p3.2xlarge".asInstanceOf[InstanceType]
    val `p3.8xlarge`    = "p3.8xlarge".asInstanceOf[InstanceType]
    val `p3.16xlarge`   = "p3.16xlarge".asInstanceOf[InstanceType]
    val `p3dn.24xlarge` = "p3dn.24xlarge".asInstanceOf[InstanceType]
    val `d2.xlarge`     = "d2.xlarge".asInstanceOf[InstanceType]
    val `d2.2xlarge`    = "d2.2xlarge".asInstanceOf[InstanceType]
    val `d2.4xlarge`    = "d2.4xlarge".asInstanceOf[InstanceType]
    val `d2.8xlarge`    = "d2.8xlarge".asInstanceOf[InstanceType]
    val `f1.2xlarge`    = "f1.2xlarge".asInstanceOf[InstanceType]
    val `f1.4xlarge`    = "f1.4xlarge".asInstanceOf[InstanceType]
    val `f1.16xlarge`   = "f1.16xlarge".asInstanceOf[InstanceType]
    val `m5.large`      = "m5.large".asInstanceOf[InstanceType]
    val `m5.xlarge`     = "m5.xlarge".asInstanceOf[InstanceType]
    val `m5.2xlarge`    = "m5.2xlarge".asInstanceOf[InstanceType]
    val `m5.4xlarge`    = "m5.4xlarge".asInstanceOf[InstanceType]
    val `m5.8xlarge`    = "m5.8xlarge".asInstanceOf[InstanceType]
    val `m5.12xlarge`   = "m5.12xlarge".asInstanceOf[InstanceType]
    val `m5.16xlarge`   = "m5.16xlarge".asInstanceOf[InstanceType]
    val `m5.24xlarge`   = "m5.24xlarge".asInstanceOf[InstanceType]
    val `m5.metal`      = "m5.metal".asInstanceOf[InstanceType]
    val `m5a.large`     = "m5a.large".asInstanceOf[InstanceType]
    val `m5a.xlarge`    = "m5a.xlarge".asInstanceOf[InstanceType]
    val `m5a.2xlarge`   = "m5a.2xlarge".asInstanceOf[InstanceType]
    val `m5a.4xlarge`   = "m5a.4xlarge".asInstanceOf[InstanceType]
    val `m5a.8xlarge`   = "m5a.8xlarge".asInstanceOf[InstanceType]
    val `m5a.12xlarge`  = "m5a.12xlarge".asInstanceOf[InstanceType]
    val `m5a.16xlarge`  = "m5a.16xlarge".asInstanceOf[InstanceType]
    val `m5a.24xlarge`  = "m5a.24xlarge".asInstanceOf[InstanceType]
    val `m5d.large`     = "m5d.large".asInstanceOf[InstanceType]
    val `m5d.xlarge`    = "m5d.xlarge".asInstanceOf[InstanceType]
    val `m5d.2xlarge`   = "m5d.2xlarge".asInstanceOf[InstanceType]
    val `m5d.4xlarge`   = "m5d.4xlarge".asInstanceOf[InstanceType]
    val `m5d.8xlarge`   = "m5d.8xlarge".asInstanceOf[InstanceType]
    val `m5d.12xlarge`  = "m5d.12xlarge".asInstanceOf[InstanceType]
    val `m5d.16xlarge`  = "m5d.16xlarge".asInstanceOf[InstanceType]
    val `m5d.24xlarge`  = "m5d.24xlarge".asInstanceOf[InstanceType]
    val `m5d.metal`     = "m5d.metal".asInstanceOf[InstanceType]
    val `m5ad.large`    = "m5ad.large".asInstanceOf[InstanceType]
    val `m5ad.xlarge`   = "m5ad.xlarge".asInstanceOf[InstanceType]
    val `m5ad.2xlarge`  = "m5ad.2xlarge".asInstanceOf[InstanceType]
    val `m5ad.4xlarge`  = "m5ad.4xlarge".asInstanceOf[InstanceType]
    val `m5ad.8xlarge`  = "m5ad.8xlarge".asInstanceOf[InstanceType]
    val `m5ad.12xlarge` = "m5ad.12xlarge".asInstanceOf[InstanceType]
    val `m5ad.16xlarge` = "m5ad.16xlarge".asInstanceOf[InstanceType]
    val `m5ad.24xlarge` = "m5ad.24xlarge".asInstanceOf[InstanceType]
    val `h1.2xlarge`    = "h1.2xlarge".asInstanceOf[InstanceType]
    val `h1.4xlarge`    = "h1.4xlarge".asInstanceOf[InstanceType]
    val `h1.8xlarge`    = "h1.8xlarge".asInstanceOf[InstanceType]
    val `h1.16xlarge`   = "h1.16xlarge".asInstanceOf[InstanceType]
    val `z1d.large`     = "z1d.large".asInstanceOf[InstanceType]
    val `z1d.xlarge`    = "z1d.xlarge".asInstanceOf[InstanceType]
    val `z1d.2xlarge`   = "z1d.2xlarge".asInstanceOf[InstanceType]
    val `z1d.3xlarge`   = "z1d.3xlarge".asInstanceOf[InstanceType]
    val `z1d.6xlarge`   = "z1d.6xlarge".asInstanceOf[InstanceType]
    val `z1d.12xlarge`  = "z1d.12xlarge".asInstanceOf[InstanceType]
    val `z1d.metal`     = "z1d.metal".asInstanceOf[InstanceType]
    val `u-6tb1.metal`  = "u-6tb1.metal".asInstanceOf[InstanceType]
    val `u-9tb1.metal`  = "u-9tb1.metal".asInstanceOf[InstanceType]
    val `u-12tb1.metal` = "u-12tb1.metal".asInstanceOf[InstanceType]
    val `u-18tb1.metal` = "u-18tb1.metal".asInstanceOf[InstanceType]
    val `u-24tb1.metal` = "u-24tb1.metal".asInstanceOf[InstanceType]
    val `a1.medium`     = "a1.medium".asInstanceOf[InstanceType]
    val `a1.large`      = "a1.large".asInstanceOf[InstanceType]
    val `a1.xlarge`     = "a1.xlarge".asInstanceOf[InstanceType]
    val `a1.2xlarge`    = "a1.2xlarge".asInstanceOf[InstanceType]
    val `a1.4xlarge`    = "a1.4xlarge".asInstanceOf[InstanceType]
    val `a1.metal`      = "a1.metal".asInstanceOf[InstanceType]
    val `m5dn.large`    = "m5dn.large".asInstanceOf[InstanceType]
    val `m5dn.xlarge`   = "m5dn.xlarge".asInstanceOf[InstanceType]
    val `m5dn.2xlarge`  = "m5dn.2xlarge".asInstanceOf[InstanceType]
    val `m5dn.4xlarge`  = "m5dn.4xlarge".asInstanceOf[InstanceType]
    val `m5dn.8xlarge`  = "m5dn.8xlarge".asInstanceOf[InstanceType]
    val `m5dn.12xlarge` = "m5dn.12xlarge".asInstanceOf[InstanceType]
    val `m5dn.16xlarge` = "m5dn.16xlarge".asInstanceOf[InstanceType]
    val `m5dn.24xlarge` = "m5dn.24xlarge".asInstanceOf[InstanceType]
    val `m5n.large`     = "m5n.large".asInstanceOf[InstanceType]
    val `m5n.xlarge`    = "m5n.xlarge".asInstanceOf[InstanceType]
    val `m5n.2xlarge`   = "m5n.2xlarge".asInstanceOf[InstanceType]
    val `m5n.4xlarge`   = "m5n.4xlarge".asInstanceOf[InstanceType]
    val `m5n.8xlarge`   = "m5n.8xlarge".asInstanceOf[InstanceType]
    val `m5n.12xlarge`  = "m5n.12xlarge".asInstanceOf[InstanceType]
    val `m5n.16xlarge`  = "m5n.16xlarge".asInstanceOf[InstanceType]
    val `m5n.24xlarge`  = "m5n.24xlarge".asInstanceOf[InstanceType]
    val `r5dn.large`    = "r5dn.large".asInstanceOf[InstanceType]
    val `r5dn.xlarge`   = "r5dn.xlarge".asInstanceOf[InstanceType]
    val `r5dn.2xlarge`  = "r5dn.2xlarge".asInstanceOf[InstanceType]
    val `r5dn.4xlarge`  = "r5dn.4xlarge".asInstanceOf[InstanceType]
    val `r5dn.8xlarge`  = "r5dn.8xlarge".asInstanceOf[InstanceType]
    val `r5dn.12xlarge` = "r5dn.12xlarge".asInstanceOf[InstanceType]
    val `r5dn.16xlarge` = "r5dn.16xlarge".asInstanceOf[InstanceType]
    val `r5dn.24xlarge` = "r5dn.24xlarge".asInstanceOf[InstanceType]
    val `r5n.large`     = "r5n.large".asInstanceOf[InstanceType]
    val `r5n.xlarge`    = "r5n.xlarge".asInstanceOf[InstanceType]
    val `r5n.2xlarge`   = "r5n.2xlarge".asInstanceOf[InstanceType]
    val `r5n.4xlarge`   = "r5n.4xlarge".asInstanceOf[InstanceType]
    val `r5n.8xlarge`   = "r5n.8xlarge".asInstanceOf[InstanceType]
    val `r5n.12xlarge`  = "r5n.12xlarge".asInstanceOf[InstanceType]
    val `r5n.16xlarge`  = "r5n.16xlarge".asInstanceOf[InstanceType]
    val `r5n.24xlarge`  = "r5n.24xlarge".asInstanceOf[InstanceType]
    val `inf1.xlarge`   = "inf1.xlarge".asInstanceOf[InstanceType]
    val `inf1.2xlarge`  = "inf1.2xlarge".asInstanceOf[InstanceType]
    val `inf1.6xlarge`  = "inf1.6xlarge".asInstanceOf[InstanceType]
    val `inf1.24xlarge` = "inf1.24xlarge".asInstanceOf[InstanceType]

    val values = js.Object.freeze(
      js.Array(
        `t1.micro`,
        `t2.nano`,
        `t2.micro`,
        `t2.small`,
        `t2.medium`,
        `t2.large`,
        `t2.xlarge`,
        `t2.2xlarge`,
        `t3.nano`,
        `t3.micro`,
        `t3.small`,
        `t3.medium`,
        `t3.large`,
        `t3.xlarge`,
        `t3.2xlarge`,
        `t3a.nano`,
        `t3a.micro`,
        `t3a.small`,
        `t3a.medium`,
        `t3a.large`,
        `t3a.xlarge`,
        `t3a.2xlarge`,
        `m1.small`,
        `m1.medium`,
        `m1.large`,
        `m1.xlarge`,
        `m3.medium`,
        `m3.large`,
        `m3.xlarge`,
        `m3.2xlarge`,
        `m4.large`,
        `m4.xlarge`,
        `m4.2xlarge`,
        `m4.4xlarge`,
        `m4.10xlarge`,
        `m4.16xlarge`,
        `m2.xlarge`,
        `m2.2xlarge`,
        `m2.4xlarge`,
        `cr1.8xlarge`,
        `r3.large`,
        `r3.xlarge`,
        `r3.2xlarge`,
        `r3.4xlarge`,
        `r3.8xlarge`,
        `r4.large`,
        `r4.xlarge`,
        `r4.2xlarge`,
        `r4.4xlarge`,
        `r4.8xlarge`,
        `r4.16xlarge`,
        `r5.large`,
        `r5.xlarge`,
        `r5.2xlarge`,
        `r5.4xlarge`,
        `r5.8xlarge`,
        `r5.12xlarge`,
        `r5.16xlarge`,
        `r5.24xlarge`,
        `r5.metal`,
        `r5a.large`,
        `r5a.xlarge`,
        `r5a.2xlarge`,
        `r5a.4xlarge`,
        `r5a.8xlarge`,
        `r5a.12xlarge`,
        `r5a.16xlarge`,
        `r5a.24xlarge`,
        `r5d.large`,
        `r5d.xlarge`,
        `r5d.2xlarge`,
        `r5d.4xlarge`,
        `r5d.8xlarge`,
        `r5d.12xlarge`,
        `r5d.16xlarge`,
        `r5d.24xlarge`,
        `r5d.metal`,
        `r5ad.large`,
        `r5ad.xlarge`,
        `r5ad.2xlarge`,
        `r5ad.4xlarge`,
        `r5ad.8xlarge`,
        `r5ad.12xlarge`,
        `r5ad.16xlarge`,
        `r5ad.24xlarge`,
        `x1.16xlarge`,
        `x1.32xlarge`,
        `x1e.xlarge`,
        `x1e.2xlarge`,
        `x1e.4xlarge`,
        `x1e.8xlarge`,
        `x1e.16xlarge`,
        `x1e.32xlarge`,
        `i2.xlarge`,
        `i2.2xlarge`,
        `i2.4xlarge`,
        `i2.8xlarge`,
        `i3.large`,
        `i3.xlarge`,
        `i3.2xlarge`,
        `i3.4xlarge`,
        `i3.8xlarge`,
        `i3.16xlarge`,
        `i3.metal`,
        `i3en.large`,
        `i3en.xlarge`,
        `i3en.2xlarge`,
        `i3en.3xlarge`,
        `i3en.6xlarge`,
        `i3en.12xlarge`,
        `i3en.24xlarge`,
        `i3en.metal`,
        `hi1.4xlarge`,
        `hs1.8xlarge`,
        `c1.medium`,
        `c1.xlarge`,
        `c3.large`,
        `c3.xlarge`,
        `c3.2xlarge`,
        `c3.4xlarge`,
        `c3.8xlarge`,
        `c4.large`,
        `c4.xlarge`,
        `c4.2xlarge`,
        `c4.4xlarge`,
        `c4.8xlarge`,
        `c5.large`,
        `c5.xlarge`,
        `c5.2xlarge`,
        `c5.4xlarge`,
        `c5.9xlarge`,
        `c5.12xlarge`,
        `c5.18xlarge`,
        `c5.24xlarge`,
        `c5.metal`,
        `c5d.large`,
        `c5d.xlarge`,
        `c5d.2xlarge`,
        `c5d.4xlarge`,
        `c5d.9xlarge`,
        `c5d.12xlarge`,
        `c5d.18xlarge`,
        `c5d.24xlarge`,
        `c5d.metal`,
        `c5n.large`,
        `c5n.xlarge`,
        `c5n.2xlarge`,
        `c5n.4xlarge`,
        `c5n.9xlarge`,
        `c5n.18xlarge`,
        `cc1.4xlarge`,
        `cc2.8xlarge`,
        `g2.2xlarge`,
        `g2.8xlarge`,
        `g3.4xlarge`,
        `g3.8xlarge`,
        `g3.16xlarge`,
        `g3s.xlarge`,
        `g4dn.xlarge`,
        `g4dn.2xlarge`,
        `g4dn.4xlarge`,
        `g4dn.8xlarge`,
        `g4dn.12xlarge`,
        `g4dn.16xlarge`,
        `cg1.4xlarge`,
        `p2.xlarge`,
        `p2.8xlarge`,
        `p2.16xlarge`,
        `p3.2xlarge`,
        `p3.8xlarge`,
        `p3.16xlarge`,
        `p3dn.24xlarge`,
        `d2.xlarge`,
        `d2.2xlarge`,
        `d2.4xlarge`,
        `d2.8xlarge`,
        `f1.2xlarge`,
        `f1.4xlarge`,
        `f1.16xlarge`,
        `m5.large`,
        `m5.xlarge`,
        `m5.2xlarge`,
        `m5.4xlarge`,
        `m5.8xlarge`,
        `m5.12xlarge`,
        `m5.16xlarge`,
        `m5.24xlarge`,
        `m5.metal`,
        `m5a.large`,
        `m5a.xlarge`,
        `m5a.2xlarge`,
        `m5a.4xlarge`,
        `m5a.8xlarge`,
        `m5a.12xlarge`,
        `m5a.16xlarge`,
        `m5a.24xlarge`,
        `m5d.large`,
        `m5d.xlarge`,
        `m5d.2xlarge`,
        `m5d.4xlarge`,
        `m5d.8xlarge`,
        `m5d.12xlarge`,
        `m5d.16xlarge`,
        `m5d.24xlarge`,
        `m5d.metal`,
        `m5ad.large`,
        `m5ad.xlarge`,
        `m5ad.2xlarge`,
        `m5ad.4xlarge`,
        `m5ad.8xlarge`,
        `m5ad.12xlarge`,
        `m5ad.16xlarge`,
        `m5ad.24xlarge`,
        `h1.2xlarge`,
        `h1.4xlarge`,
        `h1.8xlarge`,
        `h1.16xlarge`,
        `z1d.large`,
        `z1d.xlarge`,
        `z1d.2xlarge`,
        `z1d.3xlarge`,
        `z1d.6xlarge`,
        `z1d.12xlarge`,
        `z1d.metal`,
        `u-6tb1.metal`,
        `u-9tb1.metal`,
        `u-12tb1.metal`,
        `u-18tb1.metal`,
        `u-24tb1.metal`,
        `a1.medium`,
        `a1.large`,
        `a1.xlarge`,
        `a1.2xlarge`,
        `a1.4xlarge`,
        `a1.metal`,
        `m5dn.large`,
        `m5dn.xlarge`,
        `m5dn.2xlarge`,
        `m5dn.4xlarge`,
        `m5dn.8xlarge`,
        `m5dn.12xlarge`,
        `m5dn.16xlarge`,
        `m5dn.24xlarge`,
        `m5n.large`,
        `m5n.xlarge`,
        `m5n.2xlarge`,
        `m5n.4xlarge`,
        `m5n.8xlarge`,
        `m5n.12xlarge`,
        `m5n.16xlarge`,
        `m5n.24xlarge`,
        `r5dn.large`,
        `r5dn.xlarge`,
        `r5dn.2xlarge`,
        `r5dn.4xlarge`,
        `r5dn.8xlarge`,
        `r5dn.12xlarge`,
        `r5dn.16xlarge`,
        `r5dn.24xlarge`,
        `r5n.large`,
        `r5n.xlarge`,
        `r5n.2xlarge`,
        `r5n.4xlarge`,
        `r5n.8xlarge`,
        `r5n.12xlarge`,
        `r5n.16xlarge`,
        `r5n.24xlarge`,
        `inf1.xlarge`,
        `inf1.2xlarge`,
        `inf1.6xlarge`,
        `inf1.24xlarge`
      )
    )
  }

  @js.native
  sealed trait InstanceTypeHypervisor extends js.Any
  object InstanceTypeHypervisor extends js.Object {
    val nitro = "nitro".asInstanceOf[InstanceTypeHypervisor]
    val xen   = "xen".asInstanceOf[InstanceTypeHypervisor]

    val values = js.Object.freeze(js.Array(nitro, xen))
  }

  /**
    * Describes the instance type.
    */
  @js.native
  @Factory
  trait InstanceTypeInfo extends js.Object {
    var AutoRecoverySupported: js.UndefOr[AutoRecoveryFlag]
    var BareMetal: js.UndefOr[BareMetalFlag]
    var BurstablePerformanceSupported: js.UndefOr[BurstablePerformanceFlag]
    var CurrentGeneration: js.UndefOr[CurrentGenerationFlag]
    var DedicatedHostsSupported: js.UndefOr[DedicatedHostFlag]
    var EbsInfo: js.UndefOr[EbsInfo]
    var FpgaInfo: js.UndefOr[FpgaInfo]
    var FreeTierEligible: js.UndefOr[FreeTierEligibleFlag]
    var GpuInfo: js.UndefOr[GpuInfo]
    var HibernationSupported: js.UndefOr[HibernationFlag]
    var Hypervisor: js.UndefOr[InstanceTypeHypervisor]
    var InferenceAcceleratorInfo: js.UndefOr[InferenceAcceleratorInfo]
    var InstanceStorageInfo: js.UndefOr[InstanceStorageInfo]
    var InstanceStorageSupported: js.UndefOr[InstanceStorageFlag]
    var InstanceType: js.UndefOr[InstanceType]
    var MemoryInfo: js.UndefOr[MemoryInfo]
    var NetworkInfo: js.UndefOr[NetworkInfo]
    var PlacementGroupInfo: js.UndefOr[PlacementGroupInfo]
    var ProcessorInfo: js.UndefOr[ProcessorInfo]
    var SupportedRootDeviceTypes: js.UndefOr[RootDeviceTypeList]
    var SupportedUsageClasses: js.UndefOr[UsageClassTypeList]
    var VCpuInfo: js.UndefOr[VCpuInfo]
  }

  /**
    * The instance types offered.
    */
  @js.native
  @Factory
  trait InstanceTypeOffering extends js.Object {
    var InstanceType: js.UndefOr[InstanceType]
    var Location: js.UndefOr[Location]
    var LocationType: js.UndefOr[LocationType]
  }

  /**
    * Information about the Capacity Reservation usage.
    */
  @js.native
  @Factory
  trait InstanceUsage extends js.Object {
    var AccountId: js.UndefOr[String]
    var UsedInstanceCount: js.UndefOr[Int]
  }

  @js.native
  sealed trait InterfacePermissionType extends js.Any
  object InterfacePermissionType extends js.Object {
    val `INSTANCE-ATTACH` = "INSTANCE-ATTACH".asInstanceOf[InterfacePermissionType]
    val `EIP-ASSOCIATE`   = "EIP-ASSOCIATE".asInstanceOf[InterfacePermissionType]

    val values = js.Object.freeze(js.Array(`INSTANCE-ATTACH`, `EIP-ASSOCIATE`))
  }

  /**
    * Describes an internet gateway.
    */
  @js.native
  @Factory
  trait InternetGateway extends js.Object {
    var Attachments: js.UndefOr[InternetGatewayAttachmentList]
    var InternetGatewayId: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes the attachment of a VPC to an internet gateway or an egress-only internet gateway.
    */
  @js.native
  @Factory
  trait InternetGatewayAttachment extends js.Object {
    var State: js.UndefOr[AttachmentStatus]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes a set of permissions for a security group rule.
    */
  @js.native
  @Factory
  trait IpPermission extends js.Object {
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[String]
    var IpRanges: js.UndefOr[IpRangeList]
    var Ipv6Ranges: js.UndefOr[Ipv6RangeList]
    var PrefixListIds: js.UndefOr[PrefixListIdList]
    var ToPort: js.UndefOr[Int]
    var UserIdGroupPairs: js.UndefOr[UserIdGroupPairList]
  }

  /**
    * Describes an IPv4 range.
    */
  @js.native
  @Factory
  trait IpRange extends js.Object {
    var CidrIp: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  /**
    * Describes an IPv6 CIDR block association.
    */
  @js.native
  @Factory
  trait Ipv6CidrAssociation extends js.Object {
    var AssociatedResource: js.UndefOr[String]
    var Ipv6Cidr: js.UndefOr[String]
  }

  /**
    * Describes an IPv6 CIDR block.
    */
  @js.native
  @Factory
  trait Ipv6CidrBlock extends js.Object {
    var Ipv6CidrBlock: js.UndefOr[String]
  }

  /**
    * Describes an IPv6 address pool.
    */
  @js.native
  @Factory
  trait Ipv6Pool extends js.Object {
    var Description: js.UndefOr[String]
    var PoolCidrBlocks: js.UndefOr[PoolCidrBlocksSet]
    var PoolId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * [EC2-VPC only] Describes an IPv6 range.
    */
  @js.native
  @Factory
  trait Ipv6Range extends js.Object {
    var CidrIpv6: js.UndefOr[String]
    var Description: js.UndefOr[String]
  }

  @js.native
  sealed trait Ipv6SupportValue extends js.Any
  object Ipv6SupportValue extends js.Object {
    val enable  = "enable".asInstanceOf[Ipv6SupportValue]
    val disable = "disable".asInstanceOf[Ipv6SupportValue]

    val values = js.Object.freeze(js.Array(enable, disable))
  }

  /**
    * Describes a key pair.
    */
  @js.native
  @Factory
  trait KeyPair extends js.Object {
    var KeyFingerprint: js.UndefOr[String]
    var KeyMaterial: js.UndefOr[SensitiveUserData]
    var KeyName: js.UndefOr[String]
    var KeyPairId: js.UndefOr[String]
  }

  /**
    * Describes a key pair.
    */
  @js.native
  @Factory
  trait KeyPairInfo extends js.Object {
    var KeyFingerprint: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
    var KeyPairId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * The last error that occurred for a VPC endpoint.
    */
  @js.native
  @Factory
  trait LastError extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  /**
    * Describes a launch permission.
    */
  @js.native
  @Factory
  trait LaunchPermission extends js.Object {
    var Group: js.UndefOr[PermissionGroup]
    var UserId: js.UndefOr[String]
  }

  /**
    * Describes a launch permission modification.
    */
  @js.native
  @Factory
  trait LaunchPermissionModifications extends js.Object {
    var Add: js.UndefOr[LaunchPermissionList]
    var Remove: js.UndefOr[LaunchPermissionList]
  }

  /**
    * Describes the launch specification for an instance.
    */
  @js.native
  @Factory
  trait LaunchSpecification extends js.Object {
    var AddressingType: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var EbsOptimized: js.UndefOr[Boolean]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var ImageId: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var KernelId: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
    var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled]
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList]
    var Placement: js.UndefOr[SpotPlacement]
    var RamdiskId: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[GroupIdentifierList]
    var SubnetId: js.UndefOr[String]
    var UserData: js.UndefOr[String]
  }

  /**
    * Describes a launch template.
    */
  @js.native
  @Factory
  trait LaunchTemplate extends js.Object {
    var CreateTime: js.UndefOr[DateTime]
    var CreatedBy: js.UndefOr[String]
    var DefaultVersionNumber: js.UndefOr[Double]
    var LatestVersionNumber: js.UndefOr[Double]
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes a launch template and overrides.
    */
  @js.native
  @Factory
  trait LaunchTemplateAndOverridesResponse extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification]
    var Overrides: js.UndefOr[FleetLaunchTemplateOverrides]
  }

  /**
    * Describes a block device mapping.
    */
  @js.native
  @Factory
  trait LaunchTemplateBlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[LaunchTemplateEbsBlockDevice]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  /**
    * Describes a block device mapping.
    */
  @js.native
  @Factory
  trait LaunchTemplateBlockDeviceMappingRequest extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[LaunchTemplateEbsBlockDeviceRequest]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  /**
    * Describes an instance's Capacity Reservation targeting option. You can specify only one option at a time. Use the <code>CapacityReservationPreference</code> parameter to configure the instance to run in On-Demand capacity or to run in any <code>open</code> Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). Use the <code>CapacityReservationTarget</code> parameter to explicitly target a specific Capacity Reservation.
    */
  @js.native
  @Factory
  trait LaunchTemplateCapacityReservationSpecificationRequest extends js.Object {
    var CapacityReservationPreference: js.UndefOr[CapacityReservationPreference]
    var CapacityReservationTarget: js.UndefOr[CapacityReservationTarget]
  }

  /**
    * Information about the Capacity Reservation targeting option.
    */
  @js.native
  @Factory
  trait LaunchTemplateCapacityReservationSpecificationResponse extends js.Object {
    var CapacityReservationPreference: js.UndefOr[CapacityReservationPreference]
    var CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse]
  }

  /**
    * Describes a launch template and overrides.
    */
  @js.native
  @Factory
  trait LaunchTemplateConfig extends js.Object {
    var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification]
    var Overrides: js.UndefOr[LaunchTemplateOverridesList]
  }

  /**
    * The CPU options for the instance.
    */
  @js.native
  @Factory
  trait LaunchTemplateCpuOptions extends js.Object {
    var CoreCount: js.UndefOr[Int]
    var ThreadsPerCore: js.UndefOr[Int]
  }

  /**
    * The CPU options for the instance. Both the core count and threads per core must be specified in the request.
    */
  @js.native
  @Factory
  trait LaunchTemplateCpuOptionsRequest extends js.Object {
    var CoreCount: js.UndefOr[Int]
    var ThreadsPerCore: js.UndefOr[Int]
  }

  /**
    * Describes a block device for an EBS volume.
    */
  @js.native
  @Factory
  trait LaunchTemplateEbsBlockDevice extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var SnapshotId: js.UndefOr[SnapshotId]
    var VolumeSize: js.UndefOr[Int]
    var VolumeType: js.UndefOr[VolumeType]
  }

  /**
    * The parameters for a block device for an EBS volume.
    */
  @js.native
  @Factory
  trait LaunchTemplateEbsBlockDeviceRequest extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var KmsKeyId: js.UndefOr[String]
    var SnapshotId: js.UndefOr[SnapshotId]
    var VolumeSize: js.UndefOr[Int]
    var VolumeType: js.UndefOr[VolumeType]
  }

  /**
    * Describes an elastic inference accelerator.
    */
  @js.native
  @Factory
  trait LaunchTemplateElasticInferenceAccelerator extends js.Object {
    var Type: String
    var Count: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorCount]
  }

  /**
    * Describes an elastic inference accelerator.
    */
  @js.native
  @Factory
  trait LaunchTemplateElasticInferenceAcceleratorResponse extends js.Object {
    var Count: js.UndefOr[Int]
    var Type: js.UndefOr[String]
  }

  @js.native
  sealed trait LaunchTemplateErrorCode extends js.Any
  object LaunchTemplateErrorCode extends js.Object {
    val launchTemplateIdDoesNotExist      = "launchTemplateIdDoesNotExist".asInstanceOf[LaunchTemplateErrorCode]
    val launchTemplateIdMalformed         = "launchTemplateIdMalformed".asInstanceOf[LaunchTemplateErrorCode]
    val launchTemplateNameDoesNotExist    = "launchTemplateNameDoesNotExist".asInstanceOf[LaunchTemplateErrorCode]
    val launchTemplateNameMalformed       = "launchTemplateNameMalformed".asInstanceOf[LaunchTemplateErrorCode]
    val launchTemplateVersionDoesNotExist = "launchTemplateVersionDoesNotExist".asInstanceOf[LaunchTemplateErrorCode]
    val unexpectedError                   = "unexpectedError".asInstanceOf[LaunchTemplateErrorCode]

    val values = js.Object.freeze(
      js.Array(
        launchTemplateIdDoesNotExist,
        launchTemplateIdMalformed,
        launchTemplateNameDoesNotExist,
        launchTemplateNameMalformed,
        launchTemplateVersionDoesNotExist,
        unexpectedError
      )
    )
  }

  /**
    * Indicates whether an instance is configured for hibernation.
    */
  @js.native
  @Factory
  trait LaunchTemplateHibernationOptions extends js.Object {
    var Configured: js.UndefOr[Boolean]
  }

  /**
    * Indicates whether the instance is configured for hibernation. This parameter is valid only if the instance meets the [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites|hibernation prerequisites]].
    */
  @js.native
  @Factory
  trait LaunchTemplateHibernationOptionsRequest extends js.Object {
    var Configured: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait LaunchTemplateHttpTokensState extends js.Any
  object LaunchTemplateHttpTokensState extends js.Object {
    val optional = "optional".asInstanceOf[LaunchTemplateHttpTokensState]
    val required = "required".asInstanceOf[LaunchTemplateHttpTokensState]

    val values = js.Object.freeze(js.Array(optional, required))
  }

  /**
    * Describes an IAM instance profile.
    */
  @js.native
  @Factory
  trait LaunchTemplateIamInstanceProfileSpecification extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  /**
    * An IAM instance profile.
    */
  @js.native
  @Factory
  trait LaunchTemplateIamInstanceProfileSpecificationRequest extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  /**
    * The market (purchasing) option for the instances.
    */
  @js.native
  @Factory
  trait LaunchTemplateInstanceMarketOptions extends js.Object {
    var MarketType: js.UndefOr[MarketType]
    var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptions]
  }

  /**
    * The market (purchasing) option for the instances.
    */
  @js.native
  @Factory
  trait LaunchTemplateInstanceMarketOptionsRequest extends js.Object {
    var MarketType: js.UndefOr[MarketType]
    var SpotOptions: js.UndefOr[LaunchTemplateSpotMarketOptionsRequest]
  }

  @js.native
  sealed trait LaunchTemplateInstanceMetadataEndpointState extends js.Any
  object LaunchTemplateInstanceMetadataEndpointState extends js.Object {
    val disabled = "disabled".asInstanceOf[LaunchTemplateInstanceMetadataEndpointState]
    val enabled  = "enabled".asInstanceOf[LaunchTemplateInstanceMetadataEndpointState]

    val values = js.Object.freeze(js.Array(disabled, enabled))
  }

  /**
    * The metadata options for the instance. For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html|Instance Metadata and User Data]] in the <i>Amazon Elastic Compute Cloud User Guide</i>.
    */
  @js.native
  @Factory
  trait LaunchTemplateInstanceMetadataOptions extends js.Object {
    var HttpEndpoint: js.UndefOr[LaunchTemplateInstanceMetadataEndpointState]
    var HttpPutResponseHopLimit: js.UndefOr[Int]
    var HttpTokens: js.UndefOr[LaunchTemplateHttpTokensState]
    var State: js.UndefOr[LaunchTemplateInstanceMetadataOptionsState]
  }

  /**
    * The metadata options for the instance. For more information, see [[https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html|Instance Metadata and User Data]] in the <i>Amazon Elastic Compute Cloud User Guide</i>.
    */
  @js.native
  @Factory
  trait LaunchTemplateInstanceMetadataOptionsRequest extends js.Object {
    var HttpEndpoint: js.UndefOr[LaunchTemplateInstanceMetadataEndpointState]
    var HttpPutResponseHopLimit: js.UndefOr[Int]
    var HttpTokens: js.UndefOr[LaunchTemplateHttpTokensState]
  }

  @js.native
  sealed trait LaunchTemplateInstanceMetadataOptionsState extends js.Any
  object LaunchTemplateInstanceMetadataOptionsState extends js.Object {
    val pending = "pending".asInstanceOf[LaunchTemplateInstanceMetadataOptionsState]
    val applied = "applied".asInstanceOf[LaunchTemplateInstanceMetadataOptionsState]

    val values = js.Object.freeze(js.Array(pending, applied))
  }

  /**
    * Describes a network interface.
    */
  @js.native
  @Factory
  trait LaunchTemplateInstanceNetworkInterfaceSpecification extends js.Object {
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var DeviceIndex: js.UndefOr[Int]
    var Groups: js.UndefOr[GroupIdStringList]
    var InterfaceType: js.UndefOr[String]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
    var SubnetId: js.UndefOr[SubnetId]
  }

  /**
    * The parameters for a network interface.
    */
  @js.native
  @Factory
  trait LaunchTemplateInstanceNetworkInterfaceSpecificationRequest extends js.Object {
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var DeviceIndex: js.UndefOr[Int]
    var Groups: js.UndefOr[SecurityGroupIdStringList]
    var InterfaceType: js.UndefOr[String]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressListRequest]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
    var SubnetId: js.UndefOr[SubnetId]
  }

  /**
    * Describes a license configuration.
    */
  @js.native
  @Factory
  trait LaunchTemplateLicenseConfiguration extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  /**
    * Describes a license configuration.
    */
  @js.native
  @Factory
  trait LaunchTemplateLicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  /**
    * Describes overrides for a launch template.
    */
  @js.native
  @Factory
  trait LaunchTemplateOverrides extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var Priority: js.UndefOr[Double]
    var SpotPrice: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
    var WeightedCapacity: js.UndefOr[Double]
  }

  /**
    * Describes the placement of an instance.
    */
  @js.native
  @Factory
  trait LaunchTemplatePlacement extends js.Object {
    var Affinity: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var HostId: js.UndefOr[String]
    var HostResourceGroupArn: js.UndefOr[String]
    var PartitionNumber: js.UndefOr[Int]
    var SpreadDomain: js.UndefOr[String]
    var Tenancy: js.UndefOr[Tenancy]
  }

  /**
    * Describes the placement of an instance.
    */
  @js.native
  @Factory
  trait LaunchTemplatePlacementRequest extends js.Object {
    var Affinity: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var GroupName: js.UndefOr[PlacementGroupName]
    var HostId: js.UndefOr[DedicatedHostId]
    var HostResourceGroupArn: js.UndefOr[String]
    var PartitionNumber: js.UndefOr[Int]
    var SpreadDomain: js.UndefOr[String]
    var Tenancy: js.UndefOr[Tenancy]
  }

  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request, but not both.
    */
  @js.native
  @Factory
  trait LaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[LaunchTemplateId]
    var LaunchTemplateName: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  /**
    * The options for Spot Instances.
    */
  @js.native
  @Factory
  trait LaunchTemplateSpotMarketOptions extends js.Object {
    var BlockDurationMinutes: js.UndefOr[Int]
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var MaxPrice: js.UndefOr[String]
    var SpotInstanceType: js.UndefOr[SpotInstanceType]
    var ValidUntil: js.UndefOr[DateTime]
  }

  /**
    * The options for Spot Instances.
    */
  @js.native
  @Factory
  trait LaunchTemplateSpotMarketOptionsRequest extends js.Object {
    var BlockDurationMinutes: js.UndefOr[Int]
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var MaxPrice: js.UndefOr[String]
    var SpotInstanceType: js.UndefOr[SpotInstanceType]
    var ValidUntil: js.UndefOr[DateTime]
  }

  /**
    * The tag specification for the launch template.
    */
  @js.native
  @Factory
  trait LaunchTemplateTagSpecification extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * The tags specification for the launch template.
    */
  @js.native
  @Factory
  trait LaunchTemplateTagSpecificationRequest extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes a launch template version.
    */
  @js.native
  @Factory
  trait LaunchTemplateVersion extends js.Object {
    var CreateTime: js.UndefOr[DateTime]
    var CreatedBy: js.UndefOr[String]
    var DefaultVersion: js.UndefOr[Boolean]
    var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData]
    var LaunchTemplateId: js.UndefOr[String]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var VersionDescription: js.UndefOr[VersionDescription]
    var VersionNumber: js.UndefOr[Double]
  }

  /**
    * Describes the monitoring for the instance.
    */
  @js.native
  @Factory
  trait LaunchTemplatesMonitoring extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * Describes the monitoring for the instance.
    */
  @js.native
  @Factory
  trait LaunchTemplatesMonitoringRequest extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * Describes a license configuration.
    */
  @js.native
  @Factory
  trait LicenseConfiguration extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  /**
    * Describes a license configuration.
    */
  @js.native
  @Factory
  trait LicenseConfigurationRequest extends js.Object {
    var LicenseConfigurationArn: js.UndefOr[String]
  }

  @js.native
  sealed trait ListingState extends js.Any
  object ListingState extends js.Object {
    val available = "available".asInstanceOf[ListingState]
    val sold      = "sold".asInstanceOf[ListingState]
    val cancelled = "cancelled".asInstanceOf[ListingState]
    val pending   = "pending".asInstanceOf[ListingState]

    val values = js.Object.freeze(js.Array(available, sold, cancelled, pending))
  }

  @js.native
  sealed trait ListingStatus extends js.Any
  object ListingStatus extends js.Object {
    val active    = "active".asInstanceOf[ListingStatus]
    val pending   = "pending".asInstanceOf[ListingStatus]
    val cancelled = "cancelled".asInstanceOf[ListingStatus]
    val closed    = "closed".asInstanceOf[ListingStatus]

    val values = js.Object.freeze(js.Array(active, pending, cancelled, closed))
  }

  /**
    * Describes the Classic Load Balancers and target groups to attach to a Spot Fleet request.
    */
  @js.native
  @Factory
  trait LoadBalancersConfig extends js.Object {
    var ClassicLoadBalancersConfig: js.UndefOr[ClassicLoadBalancersConfig]
    var TargetGroupsConfig: js.UndefOr[TargetGroupsConfig]
  }

  /**
    * Describes a load permission.
    */
  @js.native
  @Factory
  trait LoadPermission extends js.Object {
    var Group: js.UndefOr[PermissionGroup]
    var UserId: js.UndefOr[String]
  }

  /**
    * Describes modifications to the load permissions of an Amazon FPGA image (AFI).
    */
  @js.native
  @Factory
  trait LoadPermissionModifications extends js.Object {
    var Add: js.UndefOr[LoadPermissionListRequest]
    var Remove: js.UndefOr[LoadPermissionListRequest]
  }

  /**
    * Describes a load permission.
    */
  @js.native
  @Factory
  trait LoadPermissionRequest extends js.Object {
    var Group: js.UndefOr[PermissionGroup]
    var UserId: js.UndefOr[String]
  }

  /**
    * Describes a local gateway.
    */
  @js.native
  @Factory
  trait LocalGateway extends js.Object {
    var LocalGatewayId: js.UndefOr[LocalGatewayId]
    var OutpostArn: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var State: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes a route for a local gateway route table.
    */
  @js.native
  @Factory
  trait LocalGatewayRoute extends js.Object {
    var DestinationCidrBlock: js.UndefOr[String]
    var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayRoutetableId]
    var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[LocalGatewayVirtualInterfaceGroupId]
    var State: js.UndefOr[LocalGatewayRouteState]
    var Type: js.UndefOr[LocalGatewayRouteType]
  }

  @js.native
  sealed trait LocalGatewayRouteState extends js.Any
  object LocalGatewayRouteState extends js.Object {
    val pending   = "pending".asInstanceOf[LocalGatewayRouteState]
    val active    = "active".asInstanceOf[LocalGatewayRouteState]
    val blackhole = "blackhole".asInstanceOf[LocalGatewayRouteState]
    val deleting  = "deleting".asInstanceOf[LocalGatewayRouteState]
    val deleted   = "deleted".asInstanceOf[LocalGatewayRouteState]

    val values = js.Object.freeze(js.Array(pending, active, blackhole, deleting, deleted))
  }

  /**
    * Describes a local gateway route table.
    */
  @js.native
  @Factory
  trait LocalGatewayRouteTable extends js.Object {
    var LocalGatewayId: js.UndefOr[LocalGatewayId]
    var LocalGatewayRouteTableId: js.UndefOr[String]
    var OutpostArn: js.UndefOr[String]
    var State: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes an association between a local gateway route table and a virtual interface group.
    */
  @js.native
  @Factory
  trait LocalGatewayRouteTableVirtualInterfaceGroupAssociation extends js.Object {
    var LocalGatewayId: js.UndefOr[String]
    var LocalGatewayRouteTableId: js.UndefOr[LocalGatewayId]
    var LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: js.UndefOr[
      LocalGatewayRouteTableVirtualInterfaceGroupAssociationId
    ]
    var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[LocalGatewayVirtualInterfaceGroupId]
    var State: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes an association between a local gateway route table and a VPC.
    */
  @js.native
  @Factory
  trait LocalGatewayRouteTableVpcAssociation extends js.Object {
    var LocalGatewayId: js.UndefOr[String]
    var LocalGatewayRouteTableId: js.UndefOr[String]
    var LocalGatewayRouteTableVpcAssociationId: js.UndefOr[LocalGatewayRouteTableVpcAssociationId]
    var State: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  @js.native
  sealed trait LocalGatewayRouteType extends js.Any
  object LocalGatewayRouteType extends js.Object {
    val static     = "static".asInstanceOf[LocalGatewayRouteType]
    val propagated = "propagated".asInstanceOf[LocalGatewayRouteType]

    val values = js.Object.freeze(js.Array(static, propagated))
  }

  /**
    * Describes a local gateway virtual interface.
    */
  @js.native
  @Factory
  trait LocalGatewayVirtualInterface extends js.Object {
    var LocalAddress: js.UndefOr[String]
    var LocalBgpAsn: js.UndefOr[Int]
    var LocalGatewayId: js.UndefOr[String]
    var LocalGatewayVirtualInterfaceId: js.UndefOr[LocalGatewayVirtualInterfaceId]
    var PeerAddress: js.UndefOr[String]
    var PeerBgpAsn: js.UndefOr[Int]
    var Tags: js.UndefOr[TagList]
    var Vlan: js.UndefOr[Int]
  }

  /**
    * Describes a local gateway virtual interface group.
    */
  @js.native
  @Factory
  trait LocalGatewayVirtualInterfaceGroup extends js.Object {
    var LocalGatewayId: js.UndefOr[String]
    var LocalGatewayVirtualInterfaceGroupId: js.UndefOr[LocalGatewayVirtualInterfaceGroupId]
    var LocalGatewayVirtualInterfaceIds: js.UndefOr[LocalGatewayVirtualInterfaceIdSet]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait LocationType extends js.Any
  object LocationType extends js.Object {
    val region                 = "region".asInstanceOf[LocationType]
    val `availability-zone`    = "availability-zone".asInstanceOf[LocationType]
    val `availability-zone-id` = "availability-zone-id".asInstanceOf[LocationType]

    val values = js.Object.freeze(js.Array(region, `availability-zone`, `availability-zone-id`))
  }

  @js.native
  sealed trait LogDestinationType extends js.Any
  object LogDestinationType extends js.Object {
    val `cloud-watch-logs` = "cloud-watch-logs".asInstanceOf[LogDestinationType]
    val s3                 = "s3".asInstanceOf[LogDestinationType]

    val values = js.Object.freeze(js.Array(`cloud-watch-logs`, s3))
  }

  @js.native
  sealed trait MarketType extends js.Any
  object MarketType extends js.Object {
    val spot = "spot".asInstanceOf[MarketType]

    val values = js.Object.freeze(js.Array(spot))
  }

  @js.native
  sealed trait MembershipType extends js.Any
  object MembershipType extends js.Object {
    val static = "static".asInstanceOf[MembershipType]
    val igmp   = "igmp".asInstanceOf[MembershipType]

    val values = js.Object.freeze(js.Array(static, igmp))
  }

  /**
    * Describes the memory for the instance type.
    */
  @js.native
  @Factory
  trait MemoryInfo extends js.Object {
    var SizeInMiB: js.UndefOr[MemorySize]
  }

  @js.native
  @Factory
  trait ModifyCapacityReservationRequest extends js.Object {
    var CapacityReservationId: CapacityReservationId
    var DryRun: js.UndefOr[Boolean]
    var EndDate: js.UndefOr[DateTime]
    var EndDateType: js.UndefOr[EndDateType]
    var InstanceCount: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ModifyCapacityReservationResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyClientVpnEndpointRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var ConnectionLogOptions: js.UndefOr[ConnectionLogOptions]
    var Description: js.UndefOr[String]
    var DnsServers: js.UndefOr[DnsServersOptionsModifyStructure]
    var DryRun: js.UndefOr[Boolean]
    var ServerCertificateArn: js.UndefOr[String]
    var SplitTunnel: js.UndefOr[Boolean]
    var VpnPort: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ModifyClientVpnEndpointResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyDefaultCreditSpecificationRequest extends js.Object {
    var CpuCredits: String
    var InstanceFamily: UnlimitedSupportedInstanceFamily
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyDefaultCreditSpecificationResult extends js.Object {
    var InstanceFamilyCreditSpecification: js.UndefOr[InstanceFamilyCreditSpecification]
  }

  @js.native
  @Factory
  trait ModifyEbsDefaultKmsKeyIdRequest extends js.Object {
    var KmsKeyId: KmsKeyId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyEbsDefaultKmsKeyIdResult extends js.Object {
    var KmsKeyId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyFleetRequest extends js.Object {
    var FleetId: FleetIdentifier
    var TargetCapacitySpecification: TargetCapacitySpecificationRequest
    var DryRun: js.UndefOr[Boolean]
    var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy]
  }

  @js.native
  @Factory
  trait ModifyFleetResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyFpgaImageAttributeRequest extends js.Object {
    var FpgaImageId: FpgaImageId
    var Attribute: js.UndefOr[FpgaImageAttributeName]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var LoadPermission: js.UndefOr[LoadPermissionModifications]
    var Name: js.UndefOr[String]
    var OperationType: js.UndefOr[OperationType]
    var ProductCodes: js.UndefOr[ProductCodeStringList]
    var UserGroups: js.UndefOr[UserGroupStringList]
    var UserIds: js.UndefOr[UserIdStringList]
  }

  @js.native
  @Factory
  trait ModifyFpgaImageAttributeResult extends js.Object {
    var FpgaImageAttribute: js.UndefOr[FpgaImageAttribute]
  }

  @js.native
  @Factory
  trait ModifyHostsRequest extends js.Object {
    var HostIds: RequestHostIdList
    var AutoPlacement: js.UndefOr[AutoPlacement]
    var HostRecovery: js.UndefOr[HostRecovery]
    var InstanceFamily: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyHostsResult extends js.Object {
    var Successful: js.UndefOr[ResponseHostIdList]
    var Unsuccessful: js.UndefOr[UnsuccessfulItemList]
  }

  @js.native
  @Factory
  trait ModifyIdFormatRequest extends js.Object {
    var Resource: String
    var UseLongIds: Boolean
  }

  @js.native
  @Factory
  trait ModifyIdentityIdFormatRequest extends js.Object {
    var PrincipalArn: String
    var Resource: String
    var UseLongIds: Boolean
  }

  /**
    * Contains the parameters for ModifyImageAttribute.
    */
  @js.native
  @Factory
  trait ModifyImageAttributeRequest extends js.Object {
    var ImageId: ImageId
    var Attribute: js.UndefOr[String]
    var Description: js.UndefOr[AttributeValue]
    var DryRun: js.UndefOr[Boolean]
    var LaunchPermission: js.UndefOr[LaunchPermissionModifications]
    var OperationType: js.UndefOr[OperationType]
    var ProductCodes: js.UndefOr[ProductCodeStringList]
    var UserGroups: js.UndefOr[UserGroupStringList]
    var UserIds: js.UndefOr[UserIdStringList]
    var Value: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyInstanceAttributeRequest extends js.Object {
    var InstanceId: InstanceId
    var Attribute: js.UndefOr[InstanceAttributeName]
    var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingSpecificationList]
    var DisableApiTermination: js.UndefOr[AttributeBooleanValue]
    var DryRun: js.UndefOr[Boolean]
    var EbsOptimized: js.UndefOr[AttributeBooleanValue]
    var EnaSupport: js.UndefOr[AttributeBooleanValue]
    var Groups: js.UndefOr[GroupIdStringList]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue]
    var InstanceType: js.UndefOr[AttributeValue]
    var Kernel: js.UndefOr[AttributeValue]
    var Ramdisk: js.UndefOr[AttributeValue]
    var SourceDestCheck: js.UndefOr[AttributeBooleanValue]
    var SriovNetSupport: js.UndefOr[AttributeValue]
    var UserData: js.UndefOr[BlobAttributeValue]
    var Value: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifyInstanceCapacityReservationAttributesRequest extends js.Object {
    var CapacityReservationSpecification: CapacityReservationSpecification
    var InstanceId: InstanceId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyInstanceCapacityReservationAttributesResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyInstanceCreditSpecificationRequest extends js.Object {
    var InstanceCreditSpecifications: InstanceCreditSpecificationListRequest
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyInstanceCreditSpecificationResult extends js.Object {
    var SuccessfulInstanceCreditSpecifications: js.UndefOr[SuccessfulInstanceCreditSpecificationSet]
    var UnsuccessfulInstanceCreditSpecifications: js.UndefOr[UnsuccessfulInstanceCreditSpecificationSet]
  }

  @js.native
  @Factory
  trait ModifyInstanceEventStartTimeRequest extends js.Object {
    var InstanceEventId: String
    var InstanceId: InstanceId
    var NotBefore: DateTime
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyInstanceEventStartTimeResult extends js.Object {
    var Event: js.UndefOr[InstanceStatusEvent]
  }

  @js.native
  @Factory
  trait ModifyInstanceMetadataOptionsRequest extends js.Object {
    var InstanceId: InstanceId
    var DryRun: js.UndefOr[Boolean]
    var HttpEndpoint: js.UndefOr[InstanceMetadataEndpointState]
    var HttpPutResponseHopLimit: js.UndefOr[Int]
    var HttpTokens: js.UndefOr[HttpTokensState]
  }

  @js.native
  @Factory
  trait ModifyInstanceMetadataOptionsResult extends js.Object {
    var InstanceId: js.UndefOr[String]
    var InstanceMetadataOptions: js.UndefOr[InstanceMetadataOptionsResponse]
  }

  @js.native
  @Factory
  trait ModifyInstancePlacementRequest extends js.Object {
    var InstanceId: InstanceId
    var Affinity: js.UndefOr[Affinity]
    var GroupName: js.UndefOr[PlacementGroupName]
    var HostId: js.UndefOr[DedicatedHostId]
    var HostResourceGroupArn: js.UndefOr[String]
    var PartitionNumber: js.UndefOr[Int]
    var Tenancy: js.UndefOr[HostTenancy]
  }

  @js.native
  @Factory
  trait ModifyInstancePlacementResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyLaunchTemplateRequest extends js.Object {
    var ClientToken: js.UndefOr[String]
    var DefaultVersion: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var LaunchTemplateId: js.UndefOr[LaunchTemplateId]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
  }

  @js.native
  @Factory
  trait ModifyLaunchTemplateResult extends js.Object {
    var LaunchTemplate: js.UndefOr[LaunchTemplate]
  }

  /**
    * Contains the parameters for ModifyNetworkInterfaceAttribute.
    */
  @js.native
  @Factory
  trait ModifyNetworkInterfaceAttributeRequest extends js.Object {
    var NetworkInterfaceId: NetworkInterfaceId
    var Attachment: js.UndefOr[NetworkInterfaceAttachmentChanges]
    var Description: js.UndefOr[AttributeValue]
    var DryRun: js.UndefOr[Boolean]
    var Groups: js.UndefOr[SecurityGroupIdStringList]
    var SourceDestCheck: js.UndefOr[AttributeBooleanValue]
  }

  /**
    * Contains the parameters for ModifyReservedInstances.
    */
  @js.native
  @Factory
  trait ModifyReservedInstancesRequest extends js.Object {
    var ReservedInstancesIds: ReservedInstancesIdStringList
    var TargetConfigurations: ReservedInstancesConfigurationList
    var ClientToken: js.UndefOr[String]
  }

  /**
    * Contains the output of ModifyReservedInstances.
    */
  @js.native
  @Factory
  trait ModifyReservedInstancesResult extends js.Object {
    var ReservedInstancesModificationId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ModifySnapshotAttributeRequest extends js.Object {
    var SnapshotId: SnapshotId
    var Attribute: js.UndefOr[SnapshotAttributeName]
    var CreateVolumePermission: js.UndefOr[CreateVolumePermissionModifications]
    var DryRun: js.UndefOr[Boolean]
    var GroupNames: js.UndefOr[GroupNameStringList]
    var OperationType: js.UndefOr[OperationType]
    var UserIds: js.UndefOr[UserIdStringList]
  }

  /**
    * Contains the parameters for ModifySpotFleetRequest.
    */
  @js.native
  @Factory
  trait ModifySpotFleetRequestRequest extends js.Object {
    var SpotFleetRequestId: SpotFleetRequestId
    var ExcessCapacityTerminationPolicy: js.UndefOr[ExcessCapacityTerminationPolicy]
    var OnDemandTargetCapacity: js.UndefOr[Int]
    var TargetCapacity: js.UndefOr[Int]
  }

  /**
    * Contains the output of ModifySpotFleetRequest.
    */
  @js.native
  @Factory
  trait ModifySpotFleetRequestResponse extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifySubnetAttributeRequest extends js.Object {
    var SubnetId: SubnetId
    var AssignIpv6AddressOnCreation: js.UndefOr[AttributeBooleanValue]
    var MapPublicIpOnLaunch: js.UndefOr[AttributeBooleanValue]
  }

  @js.native
  @Factory
  trait ModifyTrafficMirrorFilterNetworkServicesRequest extends js.Object {
    var TrafficMirrorFilterId: TrafficMirrorFilterId
    var AddNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList]
    var DryRun: js.UndefOr[Boolean]
    var RemoveNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList]
  }

  @js.native
  @Factory
  trait ModifyTrafficMirrorFilterNetworkServicesResult extends js.Object {
    var TrafficMirrorFilter: js.UndefOr[TrafficMirrorFilter]
  }

  @js.native
  @Factory
  trait ModifyTrafficMirrorFilterRuleRequest extends js.Object {
    var TrafficMirrorFilterRuleId: TrafficMirrorFilterRuleId
    var Description: js.UndefOr[String]
    var DestinationCidrBlock: js.UndefOr[String]
    var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest]
    var DryRun: js.UndefOr[Boolean]
    var Protocol: js.UndefOr[Int]
    var RemoveFields: js.UndefOr[TrafficMirrorFilterRuleFieldList]
    var RuleAction: js.UndefOr[TrafficMirrorRuleAction]
    var RuleNumber: js.UndefOr[Int]
    var SourceCidrBlock: js.UndefOr[String]
    var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest]
    var TrafficDirection: js.UndefOr[TrafficDirection]
  }

  @js.native
  @Factory
  trait ModifyTrafficMirrorFilterRuleResult extends js.Object {
    var TrafficMirrorFilterRule: js.UndefOr[TrafficMirrorFilterRule]
  }

  @js.native
  @Factory
  trait ModifyTrafficMirrorSessionRequest extends js.Object {
    var TrafficMirrorSessionId: TrafficMirrorSessionId
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var PacketLength: js.UndefOr[Int]
    var RemoveFields: js.UndefOr[TrafficMirrorSessionFieldList]
    var SessionNumber: js.UndefOr[Int]
    var TrafficMirrorFilterId: js.UndefOr[TrafficMirrorFilterId]
    var TrafficMirrorTargetId: js.UndefOr[TrafficMirrorTargetId]
    var VirtualNetworkId: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait ModifyTrafficMirrorSessionResult extends js.Object {
    var TrafficMirrorSession: js.UndefOr[TrafficMirrorSession]
  }

  @js.native
  @Factory
  trait ModifyTransitGatewayVpcAttachmentRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var AddSubnetIds: js.UndefOr[TransitGatewaySubnetIdList]
    var DryRun: js.UndefOr[Boolean]
    var Options: js.UndefOr[ModifyTransitGatewayVpcAttachmentRequestOptions]
    var RemoveSubnetIds: js.UndefOr[TransitGatewaySubnetIdList]
  }

  /**
    * Describes the options for a VPC attachment.
    */
  @js.native
  @Factory
  trait ModifyTransitGatewayVpcAttachmentRequestOptions extends js.Object {
    var DnsSupport: js.UndefOr[DnsSupportValue]
    var Ipv6Support: js.UndefOr[Ipv6SupportValue]
  }

  @js.native
  @Factory
  trait ModifyTransitGatewayVpcAttachmentResult extends js.Object {
    var TransitGatewayVpcAttachment: js.UndefOr[TransitGatewayVpcAttachment]
  }

  @js.native
  @Factory
  trait ModifyVolumeAttributeRequest extends js.Object {
    var VolumeId: VolumeId
    var AutoEnableIO: js.UndefOr[AttributeBooleanValue]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVolumeRequest extends js.Object {
    var VolumeId: VolumeId
    var DryRun: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var Size: js.UndefOr[Int]
    var VolumeType: js.UndefOr[VolumeType]
  }

  @js.native
  @Factory
  trait ModifyVolumeResult extends js.Object {
    var VolumeModification: js.UndefOr[VolumeModification]
  }

  @js.native
  @Factory
  trait ModifyVpcAttributeRequest extends js.Object {
    var VpcId: VpcId
    var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue]
    var EnableDnsSupport: js.UndefOr[AttributeBooleanValue]
  }

  @js.native
  @Factory
  trait ModifyVpcEndpointConnectionNotificationRequest extends js.Object {
    var ConnectionNotificationId: ConnectionNotificationId
    var ConnectionEvents: js.UndefOr[ValueStringList]
    var ConnectionNotificationArn: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpcEndpointConnectionNotificationResult extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for ModifyVpcEndpoint.
    */
  @js.native
  @Factory
  trait ModifyVpcEndpointRequest extends js.Object {
    var VpcEndpointId: VpcEndpointId
    var AddRouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList]
    var AddSecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList]
    var AddSubnetIds: js.UndefOr[VpcEndpointSubnetIdList]
    var DryRun: js.UndefOr[Boolean]
    var PolicyDocument: js.UndefOr[String]
    var PrivateDnsEnabled: js.UndefOr[Boolean]
    var RemoveRouteTableIds: js.UndefOr[VpcEndpointRouteTableIdList]
    var RemoveSecurityGroupIds: js.UndefOr[VpcEndpointSecurityGroupIdList]
    var RemoveSubnetIds: js.UndefOr[VpcEndpointSubnetIdList]
    var ResetPolicy: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpcEndpointResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpcEndpointServiceConfigurationRequest extends js.Object {
    var ServiceId: VpcEndpointServiceId
    var AcceptanceRequired: js.UndefOr[Boolean]
    var AddNetworkLoadBalancerArns: js.UndefOr[ValueStringList]
    var DryRun: js.UndefOr[Boolean]
    var PrivateDnsName: js.UndefOr[String]
    var RemoveNetworkLoadBalancerArns: js.UndefOr[ValueStringList]
    var RemovePrivateDnsName: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpcEndpointServiceConfigurationResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpcEndpointServicePermissionsRequest extends js.Object {
    var ServiceId: VpcEndpointServiceId
    var AddAllowedPrincipals: js.UndefOr[ValueStringList]
    var DryRun: js.UndefOr[Boolean]
    var RemoveAllowedPrincipals: js.UndefOr[ValueStringList]
  }

  @js.native
  @Factory
  trait ModifyVpcEndpointServicePermissionsResult extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpcPeeringConnectionOptionsRequest extends js.Object {
    var VpcPeeringConnectionId: VpcPeeringConnectionId
    var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest]
    var DryRun: js.UndefOr[Boolean]
    var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptionsRequest]
  }

  @js.native
  @Factory
  trait ModifyVpcPeeringConnectionOptionsResult extends js.Object {
    var AccepterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions]
    var RequesterPeeringConnectionOptions: js.UndefOr[PeeringConnectionOptions]
  }

  @js.native
  @Factory
  trait ModifyVpcTenancyRequest extends js.Object {
    var InstanceTenancy: VpcTenancy
    var VpcId: VpcId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpcTenancyResult extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpnConnectionRequest extends js.Object {
    var VpnConnectionId: VpnConnectionId
    var CustomerGatewayId: js.UndefOr[CustomerGatewayId]
    var DryRun: js.UndefOr[Boolean]
    var TransitGatewayId: js.UndefOr[TransitGatewayId]
    var VpnGatewayId: js.UndefOr[VpnGatewayId]
  }

  @js.native
  @Factory
  trait ModifyVpnConnectionResult extends js.Object {
    var VpnConnection: js.UndefOr[VpnConnection]
  }

  @js.native
  @Factory
  trait ModifyVpnTunnelCertificateRequest extends js.Object {
    var VpnConnectionId: VpnConnectionId
    var VpnTunnelOutsideIpAddress: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpnTunnelCertificateResult extends js.Object {
    var VpnConnection: js.UndefOr[VpnConnection]
  }

  @js.native
  @Factory
  trait ModifyVpnTunnelOptionsRequest extends js.Object {
    var TunnelOptions: ModifyVpnTunnelOptionsSpecification
    var VpnConnectionId: VpnConnectionId
    var VpnTunnelOutsideIpAddress: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ModifyVpnTunnelOptionsResult extends js.Object {
    var VpnConnection: js.UndefOr[VpnConnection]
  }

  /**
    * The AWS Site-to-Site VPN tunnel options to modify.
    */
  @js.native
  @Factory
  trait ModifyVpnTunnelOptionsSpecification extends js.Object {
    var DPDTimeoutSeconds: js.UndefOr[Int]
    var IKEVersions: js.UndefOr[IKEVersionsRequestList]
    var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersRequestList]
    var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsRequestList]
    var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsRequestList]
    var Phase1LifetimeSeconds: js.UndefOr[Int]
    var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersRequestList]
    var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsRequestList]
    var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsRequestList]
    var Phase2LifetimeSeconds: js.UndefOr[Int]
    var PreSharedKey: js.UndefOr[String]
    var RekeyFuzzPercentage: js.UndefOr[Int]
    var RekeyMarginTimeSeconds: js.UndefOr[Int]
    var ReplayWindowSize: js.UndefOr[Int]
    var TunnelInsideCidr: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait MonitorInstancesRequest extends js.Object {
    var InstanceIds: InstanceIdStringList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait MonitorInstancesResult extends js.Object {
    var InstanceMonitorings: js.UndefOr[InstanceMonitoringList]
  }

  /**
    * Describes the monitoring of an instance.
    */
  @js.native
  @Factory
  trait Monitoring extends js.Object {
    var State: js.UndefOr[MonitoringState]
  }

  @js.native
  sealed trait MonitoringState extends js.Any
  object MonitoringState extends js.Object {
    val disabled  = "disabled".asInstanceOf[MonitoringState]
    val disabling = "disabling".asInstanceOf[MonitoringState]
    val enabled   = "enabled".asInstanceOf[MonitoringState]
    val pending   = "pending".asInstanceOf[MonitoringState]

    val values = js.Object.freeze(js.Array(disabled, disabling, enabled, pending))
  }

  @js.native
  @Factory
  trait MoveAddressToVpcRequest extends js.Object {
    var PublicIp: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait MoveAddressToVpcResult extends js.Object {
    var AllocationId: js.UndefOr[String]
    var Status: js.UndefOr[Status]
  }

  @js.native
  sealed trait MoveStatus extends js.Any
  object MoveStatus extends js.Object {
    val movingToVpc        = "movingToVpc".asInstanceOf[MoveStatus]
    val restoringToClassic = "restoringToClassic".asInstanceOf[MoveStatus]

    val values = js.Object.freeze(js.Array(movingToVpc, restoringToClassic))
  }

  /**
    * Describes the status of a moving Elastic IP address.
    */
  @js.native
  @Factory
  trait MovingAddressStatus extends js.Object {
    var MoveStatus: js.UndefOr[MoveStatus]
    var PublicIp: js.UndefOr[String]
  }

  @js.native
  sealed trait MulticastSupportValue extends js.Any
  object MulticastSupportValue extends js.Object {
    val enable  = "enable".asInstanceOf[MulticastSupportValue]
    val disable = "disable".asInstanceOf[MulticastSupportValue]

    val values = js.Object.freeze(js.Array(enable, disable))
  }

  /**
    * Describes a NAT gateway.
    */
  @js.native
  @Factory
  trait NatGateway extends js.Object {
    var CreateTime: js.UndefOr[DateTime]
    var DeleteTime: js.UndefOr[DateTime]
    var FailureCode: js.UndefOr[String]
    var FailureMessage: js.UndefOr[String]
    var NatGatewayAddresses: js.UndefOr[NatGatewayAddressList]
    var NatGatewayId: js.UndefOr[String]
    var ProvisionedBandwidth: js.UndefOr[ProvisionedBandwidth]
    var State: js.UndefOr[NatGatewayState]
    var SubnetId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes the IP addresses and network interface associated with a NAT gateway.
    */
  @js.native
  @Factory
  trait NatGatewayAddress extends js.Object {
    var AllocationId: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var PrivateIp: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
  }

  @js.native
  sealed trait NatGatewayState extends js.Any
  object NatGatewayState extends js.Object {
    val pending   = "pending".asInstanceOf[NatGatewayState]
    val failed    = "failed".asInstanceOf[NatGatewayState]
    val available = "available".asInstanceOf[NatGatewayState]
    val deleting  = "deleting".asInstanceOf[NatGatewayState]
    val deleted   = "deleted".asInstanceOf[NatGatewayState]

    val values = js.Object.freeze(js.Array(pending, failed, available, deleting, deleted))
  }

  /**
    * Describes a network ACL.
    */
  @js.native
  @Factory
  trait NetworkAcl extends js.Object {
    var Associations: js.UndefOr[NetworkAclAssociationList]
    var Entries: js.UndefOr[NetworkAclEntryList]
    var IsDefault: js.UndefOr[Boolean]
    var NetworkAclId: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes an association between a network ACL and a subnet.
    */
  @js.native
  @Factory
  trait NetworkAclAssociation extends js.Object {
    var NetworkAclAssociationId: js.UndefOr[String]
    var NetworkAclId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  /**
    * Describes an entry in a network ACL.
    */
  @js.native
  @Factory
  trait NetworkAclEntry extends js.Object {
    var CidrBlock: js.UndefOr[String]
    var Egress: js.UndefOr[Boolean]
    var IcmpTypeCode: js.UndefOr[IcmpTypeCode]
    var Ipv6CidrBlock: js.UndefOr[String]
    var PortRange: js.UndefOr[PortRange]
    var Protocol: js.UndefOr[String]
    var RuleAction: js.UndefOr[RuleAction]
    var RuleNumber: js.UndefOr[Int]
  }

  /**
    * Describes the networking features of the instance type.
    */
  @js.native
  @Factory
  trait NetworkInfo extends js.Object {
    var EnaSupport: js.UndefOr[EnaSupport]
    var Ipv4AddressesPerInterface: js.UndefOr[MaxIpv4AddrPerInterface]
    var Ipv6AddressesPerInterface: js.UndefOr[MaxIpv6AddrPerInterface]
    var Ipv6Supported: js.UndefOr[Ipv6Flag]
    var MaximumNetworkInterfaces: js.UndefOr[MaxNetworkInterfaces]
    var NetworkPerformance: js.UndefOr[NetworkPerformance]
  }

  /**
    * Describes a network interface.
    */
  @js.native
  @Factory
  trait NetworkInterface extends js.Object {
    var Association: js.UndefOr[NetworkInterfaceAssociation]
    var Attachment: js.UndefOr[NetworkInterfaceAttachment]
    var AvailabilityZone: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Groups: js.UndefOr[GroupIdentifierList]
    var InterfaceType: js.UndefOr[NetworkInterfaceType]
    var Ipv6Addresses: js.UndefOr[NetworkInterfaceIpv6AddressesList]
    var MacAddress: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var OutpostArn: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateIpAddresses: js.UndefOr[NetworkInterfacePrivateIpAddressList]
    var RequesterId: js.UndefOr[String]
    var RequesterManaged: js.UndefOr[Boolean]
    var SourceDestCheck: js.UndefOr[Boolean]
    var Status: js.UndefOr[NetworkInterfaceStatus]
    var SubnetId: js.UndefOr[String]
    var TagSet: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes association information for an Elastic IP address (IPv4 only).
    */
  @js.native
  @Factory
  trait NetworkInterfaceAssociation extends js.Object {
    var AllocationId: js.UndefOr[String]
    var AssociationId: js.UndefOr[String]
    var IpOwnerId: js.UndefOr[String]
    var PublicDnsName: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
  }

  /**
    * Describes a network interface attachment.
    */
  @js.native
  @Factory
  trait NetworkInterfaceAttachment extends js.Object {
    var AttachTime: js.UndefOr[DateTime]
    var AttachmentId: js.UndefOr[String]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var DeviceIndex: js.UndefOr[Int]
    var InstanceId: js.UndefOr[String]
    var InstanceOwnerId: js.UndefOr[String]
    var Status: js.UndefOr[AttachmentStatus]
  }

  /**
    * Describes an attachment change.
    */
  @js.native
  @Factory
  trait NetworkInterfaceAttachmentChanges extends js.Object {
    var AttachmentId: js.UndefOr[NetworkInterfaceAttachmentId]
    var DeleteOnTermination: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait NetworkInterfaceAttribute extends js.Any
  object NetworkInterfaceAttribute extends js.Object {
    val description     = "description".asInstanceOf[NetworkInterfaceAttribute]
    val groupSet        = "groupSet".asInstanceOf[NetworkInterfaceAttribute]
    val sourceDestCheck = "sourceDestCheck".asInstanceOf[NetworkInterfaceAttribute]
    val attachment      = "attachment".asInstanceOf[NetworkInterfaceAttribute]

    val values = js.Object.freeze(js.Array(description, groupSet, sourceDestCheck, attachment))
  }

  @js.native
  sealed trait NetworkInterfaceCreationType extends js.Any
  object NetworkInterfaceCreationType extends js.Object {
    val efa = "efa".asInstanceOf[NetworkInterfaceCreationType]

    val values = js.Object.freeze(js.Array(efa))
  }

  /**
    * Describes an IPv6 address associated with a network interface.
    */
  @js.native
  @Factory
  trait NetworkInterfaceIpv6Address extends js.Object {
    var Ipv6Address: js.UndefOr[String]
  }

  /**
    * Describes a permission for a network interface.
    */
  @js.native
  @Factory
  trait NetworkInterfacePermission extends js.Object {
    var AwsAccountId: js.UndefOr[String]
    var AwsService: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var NetworkInterfacePermissionId: js.UndefOr[String]
    var Permission: js.UndefOr[InterfacePermissionType]
    var PermissionState: js.UndefOr[NetworkInterfacePermissionState]
  }

  /**
    * Describes the state of a network interface permission.
    */
  @js.native
  @Factory
  trait NetworkInterfacePermissionState extends js.Object {
    var State: js.UndefOr[NetworkInterfacePermissionStateCode]
    var StatusMessage: js.UndefOr[String]
  }

  @js.native
  sealed trait NetworkInterfacePermissionStateCode extends js.Any
  object NetworkInterfacePermissionStateCode extends js.Object {
    val pending  = "pending".asInstanceOf[NetworkInterfacePermissionStateCode]
    val granted  = "granted".asInstanceOf[NetworkInterfacePermissionStateCode]
    val revoking = "revoking".asInstanceOf[NetworkInterfacePermissionStateCode]
    val revoked  = "revoked".asInstanceOf[NetworkInterfacePermissionStateCode]

    val values = js.Object.freeze(js.Array(pending, granted, revoking, revoked))
  }

  /**
    * Describes the private IPv4 address of a network interface.
    */
  @js.native
  @Factory
  trait NetworkInterfacePrivateIpAddress extends js.Object {
    var Association: js.UndefOr[NetworkInterfaceAssociation]
    var Primary: js.UndefOr[Boolean]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateIpAddress: js.UndefOr[String]
  }

  @js.native
  sealed trait NetworkInterfaceStatus extends js.Any
  object NetworkInterfaceStatus extends js.Object {
    val available  = "available".asInstanceOf[NetworkInterfaceStatus]
    val associated = "associated".asInstanceOf[NetworkInterfaceStatus]
    val attaching  = "attaching".asInstanceOf[NetworkInterfaceStatus]
    val `in-use`   = "in-use".asInstanceOf[NetworkInterfaceStatus]
    val detaching  = "detaching".asInstanceOf[NetworkInterfaceStatus]

    val values = js.Object.freeze(js.Array(available, associated, attaching, `in-use`, detaching))
  }

  @js.native
  sealed trait NetworkInterfaceType extends js.Any
  object NetworkInterfaceType extends js.Object {
    val interface  = "interface".asInstanceOf[NetworkInterfaceType]
    val natGateway = "natGateway".asInstanceOf[NetworkInterfaceType]
    val efa        = "efa".asInstanceOf[NetworkInterfaceType]

    val values = js.Object.freeze(js.Array(interface, natGateway, efa))
  }

  @js.native
  @Factory
  trait NewDhcpConfiguration extends js.Object {
    var Key: js.UndefOr[String]
    var Values: js.UndefOr[ValueStringList]
  }

  @js.native
  sealed trait OfferingClassType extends js.Any
  object OfferingClassType extends js.Object {
    val standard    = "standard".asInstanceOf[OfferingClassType]
    val convertible = "convertible".asInstanceOf[OfferingClassType]

    val values = js.Object.freeze(js.Array(standard, convertible))
  }

  @js.native
  sealed trait OfferingTypeValues extends js.Any
  object OfferingTypeValues extends js.Object {
    val `Heavy Utilization`  = "Heavy Utilization".asInstanceOf[OfferingTypeValues]
    val `Medium Utilization` = "Medium Utilization".asInstanceOf[OfferingTypeValues]
    val `Light Utilization`  = "Light Utilization".asInstanceOf[OfferingTypeValues]
    val `No Upfront`         = "No Upfront".asInstanceOf[OfferingTypeValues]
    val `Partial Upfront`    = "Partial Upfront".asInstanceOf[OfferingTypeValues]
    val `All Upfront`        = "All Upfront".asInstanceOf[OfferingTypeValues]

    val values = js.Object.freeze(
      js.Array(
        `Heavy Utilization`,
        `Medium Utilization`,
        `Light Utilization`,
        `No Upfront`,
        `Partial Upfront`,
        `All Upfront`
      )
    )
  }

  @js.native
  sealed trait OnDemandAllocationStrategy extends js.Any
  object OnDemandAllocationStrategy extends js.Object {
    val lowestPrice = "lowestPrice".asInstanceOf[OnDemandAllocationStrategy]
    val prioritized = "prioritized".asInstanceOf[OnDemandAllocationStrategy]

    val values = js.Object.freeze(js.Array(lowestPrice, prioritized))
  }

  /**
    * Describes the configuration of On-Demand Instances in an EC2 Fleet.
    */
  @js.native
  @Factory
  trait OnDemandOptions extends js.Object {
    var AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy]
    var CapacityReservationOptions: js.UndefOr[CapacityReservationOptions]
    var MaxTotalPrice: js.UndefOr[String]
    var MinTargetCapacity: js.UndefOr[Int]
    var SingleAvailabilityZone: js.UndefOr[Boolean]
    var SingleInstanceType: js.UndefOr[Boolean]
  }

  /**
    * Describes the configuration of On-Demand Instances in an EC2 Fleet.
    */
  @js.native
  @Factory
  trait OnDemandOptionsRequest extends js.Object {
    var AllocationStrategy: js.UndefOr[FleetOnDemandAllocationStrategy]
    var CapacityReservationOptions: js.UndefOr[CapacityReservationOptionsRequest]
    var MaxTotalPrice: js.UndefOr[String]
    var MinTargetCapacity: js.UndefOr[Int]
    var SingleAvailabilityZone: js.UndefOr[Boolean]
    var SingleInstanceType: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait OperationType extends js.Any
  object OperationType extends js.Object {
    val add    = "add".asInstanceOf[OperationType]
    val remove = "remove".asInstanceOf[OperationType]

    val values = js.Object.freeze(js.Array(add, remove))
  }

  @js.native
  sealed trait PaymentOption extends js.Any
  object PaymentOption extends js.Object {
    val AllUpfront     = "AllUpfront".asInstanceOf[PaymentOption]
    val PartialUpfront = "PartialUpfront".asInstanceOf[PaymentOption]
    val NoUpfront      = "NoUpfront".asInstanceOf[PaymentOption]

    val values = js.Object.freeze(js.Array(AllUpfront, PartialUpfront, NoUpfront))
  }

  /**
    * Describes the data that identifies an Amazon FPGA image (AFI) on the PCI bus.
    */
  @js.native
  @Factory
  trait PciId extends js.Object {
    var DeviceId: js.UndefOr[String]
    var SubsystemId: js.UndefOr[String]
    var SubsystemVendorId: js.UndefOr[String]
    var VendorId: js.UndefOr[String]
  }

  /**
    * The status of the transit gateway peering attachment.
    */
  @js.native
  @Factory
  trait PeeringAttachmentStatus extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  /**
    * Describes the VPC peering connection options.
    */
  @js.native
  @Factory
  trait PeeringConnectionOptions extends js.Object {
    var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean]
  }

  /**
    * The VPC peering connection options.
    */
  @js.native
  @Factory
  trait PeeringConnectionOptionsRequest extends js.Object {
    var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean]
  }

  /**
    * Information about the transit gateway in the peering attachment.
    */
  @js.native
  @Factory
  trait PeeringTgwInfo extends js.Object {
    var OwnerId: js.UndefOr[String]
    var Region: js.UndefOr[String]
    var TransitGatewayId: js.UndefOr[String]
  }

  @js.native
  sealed trait PermissionGroup extends js.Any
  object PermissionGroup extends js.Object {
    val all = "all".asInstanceOf[PermissionGroup]

    val values = js.Object.freeze(js.Array(all))
  }

  /**
    * The Diffie-Hellmann group number for phase 1 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase1DHGroupNumbersListValue extends js.Object {
    var Value: js.UndefOr[Int]
  }

  /**
    * Specifies a Diffie-Hellman group number for the VPN tunnel for phase 1 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase1DHGroupNumbersRequestListValue extends js.Object {
    var Value: js.UndefOr[Int]
  }

  /**
    * The encryption algorithm for phase 1 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase1EncryptionAlgorithmsListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * Specifies the encryption algorithm for the VPN tunnel for phase 1 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase1EncryptionAlgorithmsRequestListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * The integrity algorithm for phase 1 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase1IntegrityAlgorithmsListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * Specifies the integrity algorithm for the VPN tunnel for phase 1 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase1IntegrityAlgorithmsRequestListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * The Diffie-Hellmann group number for phase 2 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase2DHGroupNumbersListValue extends js.Object {
    var Value: js.UndefOr[Int]
  }

  /**
    * Specifies a Diffie-Hellman group number for the VPN tunnel for phase 2 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase2DHGroupNumbersRequestListValue extends js.Object {
    var Value: js.UndefOr[Int]
  }

  /**
    * The encryption algorithm for phase 2 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase2EncryptionAlgorithmsListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * Specifies the encryption algorithm for the VPN tunnel for phase 2 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase2EncryptionAlgorithmsRequestListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * The integrity algorithm for phase 2 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase2IntegrityAlgorithmsListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * Specifies the integrity algorithm for the VPN tunnel for phase 2 IKE negotiations.
    */
  @js.native
  @Factory
  trait Phase2IntegrityAlgorithmsRequestListValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  /**
    * Describes the placement of an instance.
    */
  @js.native
  @Factory
  trait Placement extends js.Object {
    var Affinity: js.UndefOr[String]
    var AvailabilityZone: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var HostId: js.UndefOr[String]
    var HostResourceGroupArn: js.UndefOr[String]
    var PartitionNumber: js.UndefOr[Int]
    var SpreadDomain: js.UndefOr[String]
    var Tenancy: js.UndefOr[Tenancy]
  }

  /**
    * Describes a placement group.
    */
  @js.native
  @Factory
  trait PlacementGroup extends js.Object {
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var PartitionCount: js.UndefOr[Int]
    var State: js.UndefOr[PlacementGroupState]
    var Strategy: js.UndefOr[PlacementStrategy]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes the placement group support of the instance type.
    */
  @js.native
  @Factory
  trait PlacementGroupInfo extends js.Object {
    var SupportedStrategies: js.UndefOr[PlacementGroupStrategyList]
  }

  @js.native
  sealed trait PlacementGroupState extends js.Any
  object PlacementGroupState extends js.Object {
    val pending   = "pending".asInstanceOf[PlacementGroupState]
    val available = "available".asInstanceOf[PlacementGroupState]
    val deleting  = "deleting".asInstanceOf[PlacementGroupState]
    val deleted   = "deleted".asInstanceOf[PlacementGroupState]

    val values = js.Object.freeze(js.Array(pending, available, deleting, deleted))
  }

  @js.native
  sealed trait PlacementGroupStrategy extends js.Any
  object PlacementGroupStrategy extends js.Object {
    val cluster   = "cluster".asInstanceOf[PlacementGroupStrategy]
    val partition = "partition".asInstanceOf[PlacementGroupStrategy]
    val spread    = "spread".asInstanceOf[PlacementGroupStrategy]

    val values = js.Object.freeze(js.Array(cluster, partition, spread))
  }

  /**
    * Describes the placement of an instance.
    */
  @js.native
  @Factory
  trait PlacementResponse extends js.Object {
    var GroupName: js.UndefOr[String]
  }

  @js.native
  sealed trait PlacementStrategy extends js.Any
  object PlacementStrategy extends js.Object {
    val cluster   = "cluster".asInstanceOf[PlacementStrategy]
    val spread    = "spread".asInstanceOf[PlacementStrategy]
    val partition = "partition".asInstanceOf[PlacementStrategy]

    val values = js.Object.freeze(js.Array(cluster, spread, partition))
  }

  @js.native
  sealed trait PlatformValues extends js.Any
  object PlatformValues extends js.Object {
    val Windows = "Windows".asInstanceOf[PlatformValues]

    val values = js.Object.freeze(js.Array(Windows))
  }

  /**
    * Describes a CIDR block for an address pool.
    */
  @js.native
  @Factory
  trait PoolCidrBlock extends js.Object {
    var Cidr: js.UndefOr[String]
  }

  /**
    * Describes a range of ports.
    */
  @js.native
  @Factory
  trait PortRange extends js.Object {
    var From: js.UndefOr[Int]
    var To: js.UndefOr[Int]
  }

  /**
    * Describes prefixes for AWS services.
    */
  @js.native
  @Factory
  trait PrefixList extends js.Object {
    var Cidrs: js.UndefOr[ValueStringList]
    var PrefixListId: js.UndefOr[String]
    var PrefixListName: js.UndefOr[String]
  }

  /**
    * Describes a prefix list ID.
    */
  @js.native
  @Factory
  trait PrefixListId extends js.Object {
    var Description: js.UndefOr[String]
    var PrefixListId: js.UndefOr[String]
  }

  /**
    * Describes the price for a Reserved Instance.
    */
  @js.native
  @Factory
  trait PriceSchedule extends js.Object {
    var Active: js.UndefOr[Boolean]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Price: js.UndefOr[Double]
    var Term: js.UndefOr[Double]
  }

  /**
    * Describes the price for a Reserved Instance.
    */
  @js.native
  @Factory
  trait PriceScheduleSpecification extends js.Object {
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Price: js.UndefOr[Double]
    var Term: js.UndefOr[Double]
  }

  /**
    * Describes a Reserved Instance offering.
    */
  @js.native
  @Factory
  trait PricingDetail extends js.Object {
    var Count: js.UndefOr[Int]
    var Price: js.UndefOr[Double]
  }

  /**
    * PrincipalIdFormat description
    */
  @js.native
  @Factory
  trait PrincipalIdFormat extends js.Object {
    var Arn: js.UndefOr[String]
    var Statuses: js.UndefOr[IdFormatList]
  }

  @js.native
  sealed trait PrincipalType extends js.Any
  object PrincipalType extends js.Object {
    val All              = "All".asInstanceOf[PrincipalType]
    val Service          = "Service".asInstanceOf[PrincipalType]
    val OrganizationUnit = "OrganizationUnit".asInstanceOf[PrincipalType]
    val Account          = "Account".asInstanceOf[PrincipalType]
    val User             = "User".asInstanceOf[PrincipalType]
    val Role             = "Role".asInstanceOf[PrincipalType]

    val values = js.Object.freeze(js.Array(All, Service, OrganizationUnit, Account, User, Role))
  }

  /**
    * Information about the private DNS name for the service endpoint. For more information about these parameters, see [[https://docs.aws.amazon.com/vpc/latest/userguide/ndpoint-services-dns-validation.html|VPC Endpoint Service Private DNS Name Verification]] in the <i>Amazon Virtual Private Cloud User Guide</i>.
    */
  @js.native
  @Factory
  trait PrivateDnsNameConfiguration extends js.Object {
    var Name: js.UndefOr[String]
    var State: js.UndefOr[DnsNameState]
    var Type: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * Describes a secondary private IPv4 address for a network interface.
    */
  @js.native
  @Factory
  trait PrivateIpAddressSpecification extends js.Object {
    var Primary: js.UndefOr[Boolean]
    var PrivateIpAddress: js.UndefOr[String]
  }

  /**
    * Describes the processor used by the instance type.
    */
  @js.native
  @Factory
  trait ProcessorInfo extends js.Object {
    var SupportedArchitectures: js.UndefOr[ArchitectureTypeList]
    var SustainedClockSpeedInGhz: js.UndefOr[ProcessorSustainedClockSpeed]
  }

  /**
    * Describes a product code.
    */
  @js.native
  @Factory
  trait ProductCode extends js.Object {
    var ProductCodeId: js.UndefOr[String]
    var ProductCodeType: js.UndefOr[ProductCodeValues]
  }

  @js.native
  sealed trait ProductCodeValues extends js.Any
  object ProductCodeValues extends js.Object {
    val devpay      = "devpay".asInstanceOf[ProductCodeValues]
    val marketplace = "marketplace".asInstanceOf[ProductCodeValues]

    val values = js.Object.freeze(js.Array(devpay, marketplace))
  }

  /**
    * Describes a virtual private gateway propagating route.
    */
  @js.native
  @Factory
  trait PropagatingVgw extends js.Object {
    var GatewayId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ProvisionByoipCidrRequest extends js.Object {
    var Cidr: String
    var CidrAuthorizationContext: js.UndefOr[CidrAuthorizationContext]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var PubliclyAdvertisable: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ProvisionByoipCidrResult extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  /**
    * Reserved. If you need to sustain traffic greater than the [[https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html|documented limits]], contact us through the [[https://console.aws.amazon.com/support/home?|Support Center]].
    */
  @js.native
  @Factory
  trait ProvisionedBandwidth extends js.Object {
    var ProvisionTime: js.UndefOr[DateTime]
    var Provisioned: js.UndefOr[String]
    var RequestTime: js.UndefOr[DateTime]
    var Requested: js.UndefOr[String]
    var Status: js.UndefOr[String]
  }

  /**
    * Describes an IPv4 address pool.
    */
  @js.native
  @Factory
  trait PublicIpv4Pool extends js.Object {
    var Description: js.UndefOr[String]
    var PoolAddressRanges: js.UndefOr[PublicIpv4PoolRangeSet]
    var PoolId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var TotalAddressCount: js.UndefOr[Int]
    var TotalAvailableAddressCount: js.UndefOr[Int]
  }

  /**
    * Describes an address range of an IPv4 address pool.
    */
  @js.native
  @Factory
  trait PublicIpv4PoolRange extends js.Object {
    var AddressCount: js.UndefOr[Int]
    var AvailableAddressCount: js.UndefOr[Int]
    var FirstAddress: js.UndefOr[String]
    var LastAddress: js.UndefOr[String]
  }

  /**
    * Describes the result of the purchase.
    */
  @js.native
  @Factory
  trait Purchase extends js.Object {
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Int]
    var HostIdSet: js.UndefOr[ResponseHostIdSet]
    var HostReservationId: js.UndefOr[String]
    var HourlyPrice: js.UndefOr[String]
    var InstanceFamily: js.UndefOr[String]
    var PaymentOption: js.UndefOr[PaymentOption]
    var UpfrontPrice: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PurchaseHostReservationRequest extends js.Object {
    var HostIdSet: RequestHostIdSet
    var OfferingId: OfferingId
    var ClientToken: js.UndefOr[String]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var LimitPrice: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PurchaseHostReservationResult extends js.Object {
    var ClientToken: js.UndefOr[String]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Purchase: js.UndefOr[PurchaseSet]
    var TotalHourlyPrice: js.UndefOr[String]
    var TotalUpfrontPrice: js.UndefOr[String]
  }

  /**
    * Describes a request to purchase Scheduled Instances.
    */
  @js.native
  @Factory
  trait PurchaseRequest extends js.Object {
    var InstanceCount: Int
    var PurchaseToken: String
  }

  /**
    * Contains the parameters for PurchaseReservedInstancesOffering.
    */
  @js.native
  @Factory
  trait PurchaseReservedInstancesOfferingRequest extends js.Object {
    var InstanceCount: Int
    var ReservedInstancesOfferingId: ReservedInstancesOfferingId
    var DryRun: js.UndefOr[Boolean]
    var LimitPrice: js.UndefOr[ReservedInstanceLimitPrice]
    var PurchaseTime: js.UndefOr[DateTime]
  }

  /**
    * Contains the output of PurchaseReservedInstancesOffering.
    */
  @js.native
  @Factory
  trait PurchaseReservedInstancesOfferingResult extends js.Object {
    var ReservedInstancesId: js.UndefOr[String]
  }

  /**
    * Contains the parameters for PurchaseScheduledInstances.
    */
  @js.native
  @Factory
  trait PurchaseScheduledInstancesRequest extends js.Object {
    var PurchaseRequests: PurchaseRequestSet
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of PurchaseScheduledInstances.
    */
  @js.native
  @Factory
  trait PurchaseScheduledInstancesResult extends js.Object {
    var ScheduledInstanceSet: js.UndefOr[PurchasedScheduledInstanceSet]
  }

  @js.native
  sealed trait RIProductDescription extends js.Any
  object RIProductDescription extends js.Object {
    val `Linux/UNIX`              = "Linux/UNIX".asInstanceOf[RIProductDescription]
    val `Linux/UNIX (Amazon VPC)` = "Linux/UNIX (Amazon VPC)".asInstanceOf[RIProductDescription]
    val Windows                   = "Windows".asInstanceOf[RIProductDescription]
    val `Windows (Amazon VPC)`    = "Windows (Amazon VPC)".asInstanceOf[RIProductDescription]

    val values = js.Object.freeze(js.Array(`Linux/UNIX`, `Linux/UNIX (Amazon VPC)`, Windows, `Windows (Amazon VPC)`))
  }

  @js.native
  @Factory
  trait RebootInstancesRequest extends js.Object {
    var InstanceIds: InstanceIdStringList
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Describes a recurring charge.
    */
  @js.native
  @Factory
  trait RecurringCharge extends js.Object {
    var Amount: js.UndefOr[Double]
    var Frequency: js.UndefOr[RecurringChargeFrequency]
  }

  @js.native
  sealed trait RecurringChargeFrequency extends js.Any
  object RecurringChargeFrequency extends js.Object {
    val Hourly = "Hourly".asInstanceOf[RecurringChargeFrequency]

    val values = js.Object.freeze(js.Array(Hourly))
  }

  /**
    * Describes a Region.
    */
  @js.native
  @Factory
  trait Region extends js.Object {
    var Endpoint: js.UndefOr[String]
    var OptInStatus: js.UndefOr[String]
    var RegionName: js.UndefOr[String]
  }

  /**
    * Contains the parameters for RegisterImage.
    */
  @js.native
  @Factory
  trait RegisterImageRequest extends js.Object {
    var Name: String
    var Architecture: js.UndefOr[ArchitectureValues]
    var BillingProducts: js.UndefOr[BillingProductList]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList]
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var EnaSupport: js.UndefOr[Boolean]
    var ImageLocation: js.UndefOr[String]
    var KernelId: js.UndefOr[KernelId]
    var RamdiskId: js.UndefOr[RamdiskId]
    var RootDeviceName: js.UndefOr[String]
    var SriovNetSupport: js.UndefOr[String]
    var VirtualizationType: js.UndefOr[String]
  }

  /**
    * Contains the output of RegisterImage.
    */
  @js.native
  @Factory
  trait RegisterImageResult extends js.Object {
    var ImageId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RegisterTransitGatewayMulticastGroupMembersRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupIpAddress: js.UndefOr[String]
    var NetworkInterfaceIds: js.UndefOr[TransitGatewayNetworkInterfaceIdList]
    var TransitGatewayMulticastDomainId: js.UndefOr[TransitGatewayMulticastDomainId]
  }

  @js.native
  @Factory
  trait RegisterTransitGatewayMulticastGroupMembersResult extends js.Object {
    var RegisteredMulticastGroupMembers: js.UndefOr[TransitGatewayMulticastRegisteredGroupMembers]
  }

  @js.native
  @Factory
  trait RegisterTransitGatewayMulticastGroupSourcesRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var GroupIpAddress: js.UndefOr[String]
    var NetworkInterfaceIds: js.UndefOr[TransitGatewayNetworkInterfaceIdList]
    var TransitGatewayMulticastDomainId: js.UndefOr[TransitGatewayMulticastDomainId]
  }

  @js.native
  @Factory
  trait RegisterTransitGatewayMulticastGroupSourcesResult extends js.Object {
    var RegisteredMulticastGroupSources: js.UndefOr[TransitGatewayMulticastRegisteredGroupSources]
  }

  @js.native
  @Factory
  trait RejectTransitGatewayPeeringAttachmentRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait RejectTransitGatewayPeeringAttachmentResult extends js.Object {
    var TransitGatewayPeeringAttachment: js.UndefOr[TransitGatewayPeeringAttachment]
  }

  @js.native
  @Factory
  trait RejectTransitGatewayVpcAttachmentRequest extends js.Object {
    var TransitGatewayAttachmentId: TransitGatewayAttachmentId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait RejectTransitGatewayVpcAttachmentResult extends js.Object {
    var TransitGatewayVpcAttachment: js.UndefOr[TransitGatewayVpcAttachment]
  }

  @js.native
  @Factory
  trait RejectVpcEndpointConnectionsRequest extends js.Object {
    var ServiceId: VpcEndpointServiceId
    var VpcEndpointIds: VpcEndpointIdList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait RejectVpcEndpointConnectionsResult extends js.Object {
    var Unsuccessful: js.UndefOr[UnsuccessfulItemSet]
  }

  @js.native
  @Factory
  trait RejectVpcPeeringConnectionRequest extends js.Object {
    var VpcPeeringConnectionId: VpcPeeringConnectionId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait RejectVpcPeeringConnectionResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ReleaseAddressRequest extends js.Object {
    var AllocationId: js.UndefOr[AllocationId]
    var DryRun: js.UndefOr[Boolean]
    var NetworkBorderGroup: js.UndefOr[String]
    var PublicIp: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ReleaseHostsRequest extends js.Object {
    var HostIds: RequestHostIdList
  }

  @js.native
  @Factory
  trait ReleaseHostsResult extends js.Object {
    var Successful: js.UndefOr[ResponseHostIdList]
    var Unsuccessful: js.UndefOr[UnsuccessfulItemList]
  }

  @js.native
  @Factory
  trait ReplaceIamInstanceProfileAssociationRequest extends js.Object {
    var AssociationId: IamInstanceProfileAssociationId
    var IamInstanceProfile: IamInstanceProfileSpecification
  }

  @js.native
  @Factory
  trait ReplaceIamInstanceProfileAssociationResult extends js.Object {
    var IamInstanceProfileAssociation: js.UndefOr[IamInstanceProfileAssociation]
  }

  @js.native
  @Factory
  trait ReplaceNetworkAclAssociationRequest extends js.Object {
    var AssociationId: NetworkAclAssociationId
    var NetworkAclId: NetworkAclId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ReplaceNetworkAclAssociationResult extends js.Object {
    var NewAssociationId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ReplaceNetworkAclEntryRequest extends js.Object {
    var Egress: Boolean
    var NetworkAclId: NetworkAclId
    var Protocol: String
    var RuleAction: RuleAction
    var RuleNumber: Int
    var CidrBlock: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var IcmpTypeCode: js.UndefOr[IcmpTypeCode]
    var Ipv6CidrBlock: js.UndefOr[String]
    var PortRange: js.UndefOr[PortRange]
  }

  @js.native
  @Factory
  trait ReplaceRouteRequest extends js.Object {
    var RouteTableId: RouteTableId
    var DestinationCidrBlock: js.UndefOr[String]
    var DestinationIpv6CidrBlock: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId]
    var GatewayId: js.UndefOr[RouteGatewayId]
    var InstanceId: js.UndefOr[InstanceId]
    var LocalGatewayId: js.UndefOr[LocalGatewayId]
    var LocalTarget: js.UndefOr[Boolean]
    var NatGatewayId: js.UndefOr[NatGatewayId]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var TransitGatewayId: js.UndefOr[TransitGatewayId]
    var VpcPeeringConnectionId: js.UndefOr[VpcPeeringConnectionId]
  }

  @js.native
  @Factory
  trait ReplaceRouteTableAssociationRequest extends js.Object {
    var AssociationId: RouteTableAssociationId
    var RouteTableId: RouteTableId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ReplaceRouteTableAssociationResult extends js.Object {
    var AssociationState: js.UndefOr[RouteTableAssociationState]
    var NewAssociationId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ReplaceTransitGatewayRouteRequest extends js.Object {
    var DestinationCidrBlock: String
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var Blackhole: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var TransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId]
  }

  @js.native
  @Factory
  trait ReplaceTransitGatewayRouteResult extends js.Object {
    var Route: js.UndefOr[TransitGatewayRoute]
  }

  @js.native
  sealed trait ReportInstanceReasonCodes extends js.Any
  object ReportInstanceReasonCodes extends js.Object {
    val `instance-stuck-in-state`    = "instance-stuck-in-state".asInstanceOf[ReportInstanceReasonCodes]
    val unresponsive                 = "unresponsive".asInstanceOf[ReportInstanceReasonCodes]
    val `not-accepting-credentials`  = "not-accepting-credentials".asInstanceOf[ReportInstanceReasonCodes]
    val `password-not-available`     = "password-not-available".asInstanceOf[ReportInstanceReasonCodes]
    val `performance-network`        = "performance-network".asInstanceOf[ReportInstanceReasonCodes]
    val `performance-instance-store` = "performance-instance-store".asInstanceOf[ReportInstanceReasonCodes]
    val `performance-ebs-volume`     = "performance-ebs-volume".asInstanceOf[ReportInstanceReasonCodes]
    val `performance-other`          = "performance-other".asInstanceOf[ReportInstanceReasonCodes]
    val other                        = "other".asInstanceOf[ReportInstanceReasonCodes]

    val values = js.Object.freeze(
      js.Array(
        `instance-stuck-in-state`,
        unresponsive,
        `not-accepting-credentials`,
        `password-not-available`,
        `performance-network`,
        `performance-instance-store`,
        `performance-ebs-volume`,
        `performance-other`,
        other
      )
    )
  }

  @js.native
  @Factory
  trait ReportInstanceStatusRequest extends js.Object {
    var Instances: InstanceIdStringList
    var ReasonCodes: ReasonCodesList
    var Status: ReportStatusType
    var Description: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var EndTime: js.UndefOr[DateTime]
    var StartTime: js.UndefOr[DateTime]
  }

  @js.native
  sealed trait ReportStatusType extends js.Any
  object ReportStatusType extends js.Object {
    val ok       = "ok".asInstanceOf[ReportStatusType]
    val impaired = "impaired".asInstanceOf[ReportStatusType]

    val values = js.Object.freeze(js.Array(ok, impaired))
  }

  /**
    * The information to include in the launch template.
    */
  @js.native
  @Factory
  trait RequestLaunchTemplateData extends js.Object {
    var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingRequestList]
    var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationRequest]
    var CpuOptions: js.UndefOr[LaunchTemplateCpuOptionsRequest]
    var CreditSpecification: js.UndefOr[CreditSpecificationRequest]
    var DisableApiTermination: js.UndefOr[Boolean]
    var EbsOptimized: js.UndefOr[Boolean]
    var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationList]
    var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorList]
    var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptionsRequest]
    var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecificationRequest]
    var ImageId: js.UndefOr[ImageId]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior]
    var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptionsRequest]
    var InstanceType: js.UndefOr[InstanceType]
    var KernelId: js.UndefOr[KernelId]
    var KeyName: js.UndefOr[KeyPairName]
    var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseSpecificationListRequest]
    var MetadataOptions: js.UndefOr[LaunchTemplateInstanceMetadataOptionsRequest]
    var Monitoring: js.UndefOr[LaunchTemplatesMonitoringRequest]
    var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList]
    var Placement: js.UndefOr[LaunchTemplatePlacementRequest]
    var RamDiskId: js.UndefOr[RamdiskId]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList]
    var SecurityGroups: js.UndefOr[SecurityGroupStringList]
    var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationRequestList]
    var UserData: js.UndefOr[String]
  }

  /**
    * Contains the parameters for RequestSpotFleet.
    */
  @js.native
  @Factory
  trait RequestSpotFleetRequest extends js.Object {
    var SpotFleetRequestConfig: SpotFleetRequestConfigData
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the output of RequestSpotFleet.
    */
  @js.native
  @Factory
  trait RequestSpotFleetResponse extends js.Object {
    var SpotFleetRequestId: js.UndefOr[String]
  }

  /**
    * Contains the parameters for RequestSpotInstances.
    */
  @js.native
  @Factory
  trait RequestSpotInstancesRequest extends js.Object {
    var AvailabilityZoneGroup: js.UndefOr[String]
    var BlockDurationMinutes: js.UndefOr[Int]
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var InstanceCount: js.UndefOr[Int]
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var LaunchGroup: js.UndefOr[String]
    var LaunchSpecification: js.UndefOr[RequestSpotLaunchSpecification]
    var SpotPrice: js.UndefOr[String]
    var Type: js.UndefOr[SpotInstanceType]
    var ValidFrom: js.UndefOr[DateTime]
    var ValidUntil: js.UndefOr[DateTime]
  }

  /**
    * Contains the output of RequestSpotInstances.
    */
  @js.native
  @Factory
  trait RequestSpotInstancesResult extends js.Object {
    var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList]
  }

  /**
    * Describes the launch specification for an instance.
    */
  @js.native
  @Factory
  trait RequestSpotLaunchSpecification extends js.Object {
    var AddressingType: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var EbsOptimized: js.UndefOr[Boolean]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var ImageId: js.UndefOr[ImageId]
    var InstanceType: js.UndefOr[InstanceType]
    var KernelId: js.UndefOr[KernelId]
    var KeyName: js.UndefOr[KeyPairName]
    var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled]
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList]
    var Placement: js.UndefOr[SpotPlacement]
    var RamdiskId: js.UndefOr[RamdiskId]
    var SecurityGroupIds: js.UndefOr[RequestSpotLaunchSpecificationSecurityGroupIdList]
    var SecurityGroups: js.UndefOr[RequestSpotLaunchSpecificationSecurityGroupList]
    var SubnetId: js.UndefOr[SubnetId]
    var UserData: js.UndefOr[String]
  }

  /**
    * Describes a reservation.
    */
  @js.native
  @Factory
  trait Reservation extends js.Object {
    var Groups: js.UndefOr[GroupIdentifierList]
    var Instances: js.UndefOr[InstanceList]
    var OwnerId: js.UndefOr[String]
    var RequesterId: js.UndefOr[String]
    var ReservationId: js.UndefOr[String]
  }

  @js.native
  sealed trait ReservationState extends js.Any
  object ReservationState extends js.Object {
    val `payment-pending` = "payment-pending".asInstanceOf[ReservationState]
    val `payment-failed`  = "payment-failed".asInstanceOf[ReservationState]
    val active            = "active".asInstanceOf[ReservationState]
    val retired           = "retired".asInstanceOf[ReservationState]

    val values = js.Object.freeze(js.Array(`payment-pending`, `payment-failed`, active, retired))
  }

  /**
    * The cost associated with the Reserved Instance.
    */
  @js.native
  @Factory
  trait ReservationValue extends js.Object {
    var HourlyPrice: js.UndefOr[String]
    var RemainingTotalValue: js.UndefOr[String]
    var RemainingUpfrontValue: js.UndefOr[String]
  }

  /**
    * Describes the limit price of a Reserved Instance offering.
    */
  @js.native
  @Factory
  trait ReservedInstanceLimitPrice extends js.Object {
    var Amount: js.UndefOr[Double]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
  }

  /**
    * The total value of the Convertible Reserved Instance.
    */
  @js.native
  @Factory
  trait ReservedInstanceReservationValue extends js.Object {
    var ReservationValue: js.UndefOr[ReservationValue]
    var ReservedInstanceId: js.UndefOr[String]
  }

  @js.native
  sealed trait ReservedInstanceState extends js.Any
  object ReservedInstanceState extends js.Object {
    val `payment-pending` = "payment-pending".asInstanceOf[ReservedInstanceState]
    val active            = "active".asInstanceOf[ReservedInstanceState]
    val `payment-failed`  = "payment-failed".asInstanceOf[ReservedInstanceState]
    val retired           = "retired".asInstanceOf[ReservedInstanceState]
    val queued            = "queued".asInstanceOf[ReservedInstanceState]
    val `queued-deleted`  = "queued-deleted".asInstanceOf[ReservedInstanceState]

    val values =
      js.Object.freeze(js.Array(`payment-pending`, active, `payment-failed`, retired, queued, `queued-deleted`))
  }

  /**
    * Describes a Reserved Instance.
    */
  @js.native
  @Factory
  trait ReservedInstances extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Double]
    var End: js.UndefOr[DateTime]
    var FixedPrice: js.UndefOr[Float]
    var InstanceCount: js.UndefOr[Int]
    var InstanceTenancy: js.UndefOr[Tenancy]
    var InstanceType: js.UndefOr[InstanceType]
    var OfferingClass: js.UndefOr[OfferingClassType]
    var OfferingType: js.UndefOr[OfferingTypeValues]
    var ProductDescription: js.UndefOr[RIProductDescription]
    var RecurringCharges: js.UndefOr[RecurringChargesList]
    var ReservedInstancesId: js.UndefOr[String]
    var Scope: js.UndefOr[scope]
    var Start: js.UndefOr[DateTime]
    var State: js.UndefOr[ReservedInstanceState]
    var Tags: js.UndefOr[TagList]
    var UsagePrice: js.UndefOr[Float]
  }

  /**
    * Describes the configuration settings for the modified Reserved Instances.
    */
  @js.native
  @Factory
  trait ReservedInstancesConfiguration extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var InstanceCount: js.UndefOr[Int]
    var InstanceType: js.UndefOr[InstanceType]
    var Platform: js.UndefOr[String]
    var Scope: js.UndefOr[scope]
  }

  /**
    * Describes the ID of a Reserved Instance.
    */
  @js.native
  @Factory
  trait ReservedInstancesId extends js.Object {
    var ReservedInstancesId: js.UndefOr[String]
  }

  /**
    * Describes a Reserved Instance listing.
    */
  @js.native
  @Factory
  trait ReservedInstancesListing extends js.Object {
    var ClientToken: js.UndefOr[String]
    var CreateDate: js.UndefOr[DateTime]
    var InstanceCounts: js.UndefOr[InstanceCountList]
    var PriceSchedules: js.UndefOr[PriceScheduleList]
    var ReservedInstancesId: js.UndefOr[String]
    var ReservedInstancesListingId: js.UndefOr[String]
    var Status: js.UndefOr[ListingStatus]
    var StatusMessage: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var UpdateDate: js.UndefOr[DateTime]
  }

  /**
    * Describes a Reserved Instance modification.
    */
  @js.native
  @Factory
  trait ReservedInstancesModification extends js.Object {
    var ClientToken: js.UndefOr[String]
    var CreateDate: js.UndefOr[DateTime]
    var EffectiveDate: js.UndefOr[DateTime]
    var ModificationResults: js.UndefOr[ReservedInstancesModificationResultList]
    var ReservedInstancesIds: js.UndefOr[ReservedIntancesIds]
    var ReservedInstancesModificationId: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
    var UpdateDate: js.UndefOr[DateTime]
  }

  /**
    * Describes the modification request/s.
    */
  @js.native
  @Factory
  trait ReservedInstancesModificationResult extends js.Object {
    var ReservedInstancesId: js.UndefOr[String]
    var TargetConfiguration: js.UndefOr[ReservedInstancesConfiguration]
  }

  /**
    * Describes a Reserved Instance offering.
    */
  @js.native
  @Factory
  trait ReservedInstancesOffering extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var CurrencyCode: js.UndefOr[CurrencyCodeValues]
    var Duration: js.UndefOr[Double]
    var FixedPrice: js.UndefOr[Float]
    var InstanceTenancy: js.UndefOr[Tenancy]
    var InstanceType: js.UndefOr[InstanceType]
    var Marketplace: js.UndefOr[Boolean]
    var OfferingClass: js.UndefOr[OfferingClassType]
    var OfferingType: js.UndefOr[OfferingTypeValues]
    var PricingDetails: js.UndefOr[PricingDetailsList]
    var ProductDescription: js.UndefOr[RIProductDescription]
    var RecurringCharges: js.UndefOr[RecurringChargesList]
    var ReservedInstancesOfferingId: js.UndefOr[String]
    var Scope: js.UndefOr[scope]
    var UsagePrice: js.UndefOr[Float]
  }

  @js.native
  @Factory
  trait ResetEbsDefaultKmsKeyIdRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ResetEbsDefaultKmsKeyIdResult extends js.Object {
    var KmsKeyId: js.UndefOr[String]
  }

  @js.native
  sealed trait ResetFpgaImageAttributeName extends js.Any
  object ResetFpgaImageAttributeName extends js.Object {
    val loadPermission = "loadPermission".asInstanceOf[ResetFpgaImageAttributeName]

    val values = js.Object.freeze(js.Array(loadPermission))
  }

  @js.native
  @Factory
  trait ResetFpgaImageAttributeRequest extends js.Object {
    var FpgaImageId: FpgaImageId
    var Attribute: js.UndefOr[ResetFpgaImageAttributeName]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ResetFpgaImageAttributeResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait ResetImageAttributeName extends js.Any
  object ResetImageAttributeName extends js.Object {
    val launchPermission = "launchPermission".asInstanceOf[ResetImageAttributeName]

    val values = js.Object.freeze(js.Array(launchPermission))
  }

  /**
    * Contains the parameters for ResetImageAttribute.
    */
  @js.native
  @Factory
  trait ResetImageAttributeRequest extends js.Object {
    var Attribute: ResetImageAttributeName
    var ImageId: ImageId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait ResetInstanceAttributeRequest extends js.Object {
    var Attribute: InstanceAttributeName
    var InstanceId: InstanceId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Contains the parameters for ResetNetworkInterfaceAttribute.
    */
  @js.native
  @Factory
  trait ResetNetworkInterfaceAttributeRequest extends js.Object {
    var NetworkInterfaceId: NetworkInterfaceId
    var DryRun: js.UndefOr[Boolean]
    var SourceDestCheck: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ResetSnapshotAttributeRequest extends js.Object {
    var Attribute: SnapshotAttributeName
    var SnapshotId: SnapshotId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait ResourceType extends js.Any
  object ResourceType extends js.Object {
    val `client-vpn-endpoint`              = "client-vpn-endpoint".asInstanceOf[ResourceType]
    val `customer-gateway`                 = "customer-gateway".asInstanceOf[ResourceType]
    val `dedicated-host`                   = "dedicated-host".asInstanceOf[ResourceType]
    val `dhcp-options`                     = "dhcp-options".asInstanceOf[ResourceType]
    val `elastic-ip`                       = "elastic-ip".asInstanceOf[ResourceType]
    val fleet                              = "fleet".asInstanceOf[ResourceType]
    val `fpga-image`                       = "fpga-image".asInstanceOf[ResourceType]
    val `host-reservation`                 = "host-reservation".asInstanceOf[ResourceType]
    val image                              = "image".asInstanceOf[ResourceType]
    val instance                           = "instance".asInstanceOf[ResourceType]
    val `internet-gateway`                 = "internet-gateway".asInstanceOf[ResourceType]
    val `key-pair`                         = "key-pair".asInstanceOf[ResourceType]
    val `launch-template`                  = "launch-template".asInstanceOf[ResourceType]
    val natgateway                         = "natgateway".asInstanceOf[ResourceType]
    val `network-acl`                      = "network-acl".asInstanceOf[ResourceType]
    val `network-interface`                = "network-interface".asInstanceOf[ResourceType]
    val `placement-group`                  = "placement-group".asInstanceOf[ResourceType]
    val `reserved-instances`               = "reserved-instances".asInstanceOf[ResourceType]
    val `route-table`                      = "route-table".asInstanceOf[ResourceType]
    val `security-group`                   = "security-group".asInstanceOf[ResourceType]
    val snapshot                           = "snapshot".asInstanceOf[ResourceType]
    val `spot-fleet-request`               = "spot-fleet-request".asInstanceOf[ResourceType]
    val `spot-instances-request`           = "spot-instances-request".asInstanceOf[ResourceType]
    val subnet                             = "subnet".asInstanceOf[ResourceType]
    val `traffic-mirror-filter`            = "traffic-mirror-filter".asInstanceOf[ResourceType]
    val `traffic-mirror-session`           = "traffic-mirror-session".asInstanceOf[ResourceType]
    val `traffic-mirror-target`            = "traffic-mirror-target".asInstanceOf[ResourceType]
    val `transit-gateway`                  = "transit-gateway".asInstanceOf[ResourceType]
    val `transit-gateway-attachment`       = "transit-gateway-attachment".asInstanceOf[ResourceType]
    val `transit-gateway-multicast-domain` = "transit-gateway-multicast-domain".asInstanceOf[ResourceType]
    val `transit-gateway-route-table`      = "transit-gateway-route-table".asInstanceOf[ResourceType]
    val volume                             = "volume".asInstanceOf[ResourceType]
    val vpc                                = "vpc".asInstanceOf[ResourceType]
    val `vpc-peering-connection`           = "vpc-peering-connection".asInstanceOf[ResourceType]
    val `vpn-connection`                   = "vpn-connection".asInstanceOf[ResourceType]
    val `vpn-gateway`                      = "vpn-gateway".asInstanceOf[ResourceType]

    val values = js.Object.freeze(
      js.Array(
        `client-vpn-endpoint`,
        `customer-gateway`,
        `dedicated-host`,
        `dhcp-options`,
        `elastic-ip`,
        fleet,
        `fpga-image`,
        `host-reservation`,
        image,
        instance,
        `internet-gateway`,
        `key-pair`,
        `launch-template`,
        natgateway,
        `network-acl`,
        `network-interface`,
        `placement-group`,
        `reserved-instances`,
        `route-table`,
        `security-group`,
        snapshot,
        `spot-fleet-request`,
        `spot-instances-request`,
        subnet,
        `traffic-mirror-filter`,
        `traffic-mirror-session`,
        `traffic-mirror-target`,
        `transit-gateway`,
        `transit-gateway-attachment`,
        `transit-gateway-multicast-domain`,
        `transit-gateway-route-table`,
        volume,
        vpc,
        `vpc-peering-connection`,
        `vpn-connection`,
        `vpn-gateway`
      )
    )
  }

  /**
    * Describes the error that's returned when you cannot delete a launch template version.
    */
  @js.native
  @Factory
  trait ResponseError extends js.Object {
    var Code: js.UndefOr[LaunchTemplateErrorCode]
    var Message: js.UndefOr[String]
  }

  /**
    * The information for a launch template.
    */
  @js.native
  @Factory
  trait ResponseLaunchTemplateData extends js.Object {
    var BlockDeviceMappings: js.UndefOr[LaunchTemplateBlockDeviceMappingList]
    var CapacityReservationSpecification: js.UndefOr[LaunchTemplateCapacityReservationSpecificationResponse]
    var CpuOptions: js.UndefOr[LaunchTemplateCpuOptions]
    var CreditSpecification: js.UndefOr[CreditSpecification]
    var DisableApiTermination: js.UndefOr[Boolean]
    var EbsOptimized: js.UndefOr[Boolean]
    var ElasticGpuSpecifications: js.UndefOr[ElasticGpuSpecificationResponseList]
    var ElasticInferenceAccelerators: js.UndefOr[LaunchTemplateElasticInferenceAcceleratorResponseList]
    var HibernationOptions: js.UndefOr[LaunchTemplateHibernationOptions]
    var IamInstanceProfile: js.UndefOr[LaunchTemplateIamInstanceProfileSpecification]
    var ImageId: js.UndefOr[String]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior]
    var InstanceMarketOptions: js.UndefOr[LaunchTemplateInstanceMarketOptions]
    var InstanceType: js.UndefOr[InstanceType]
    var KernelId: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
    var LicenseSpecifications: js.UndefOr[LaunchTemplateLicenseList]
    var MetadataOptions: js.UndefOr[LaunchTemplateInstanceMetadataOptions]
    var Monitoring: js.UndefOr[LaunchTemplatesMonitoring]
    var NetworkInterfaces: js.UndefOr[LaunchTemplateInstanceNetworkInterfaceSpecificationList]
    var Placement: js.UndefOr[LaunchTemplatePlacement]
    var RamDiskId: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[ValueStringList]
    var SecurityGroups: js.UndefOr[ValueStringList]
    var TagSpecifications: js.UndefOr[LaunchTemplateTagSpecificationList]
    var UserData: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RestoreAddressToClassicRequest extends js.Object {
    var PublicIp: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait RestoreAddressToClassicResult extends js.Object {
    var PublicIp: js.UndefOr[String]
    var Status: js.UndefOr[Status]
  }

  @js.native
  @Factory
  trait RevokeClientVpnIngressRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var TargetNetworkCidr: String
    var AccessGroupId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var RevokeAllGroups: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait RevokeClientVpnIngressResult extends js.Object {
    var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus]
  }

  @js.native
  @Factory
  trait RevokeSecurityGroupEgressRequest extends js.Object {
    var GroupId: SecurityGroupId
    var CidrIp: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var FromPort: js.UndefOr[Int]
    var IpPermissions: js.UndefOr[IpPermissionList]
    var IpProtocol: js.UndefOr[String]
    var SourceSecurityGroupName: js.UndefOr[String]
    var SourceSecurityGroupOwnerId: js.UndefOr[String]
    var ToPort: js.UndefOr[Int]
  }

  @js.native
  @Factory
  trait RevokeSecurityGroupIngressRequest extends js.Object {
    var CidrIp: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var FromPort: js.UndefOr[Int]
    var GroupId: js.UndefOr[SecurityGroupId]
    var GroupName: js.UndefOr[SecurityGroupName]
    var IpPermissions: js.UndefOr[IpPermissionList]
    var IpProtocol: js.UndefOr[String]
    var SourceSecurityGroupName: js.UndefOr[String]
    var SourceSecurityGroupOwnerId: js.UndefOr[String]
    var ToPort: js.UndefOr[Int]
  }

  @js.native
  sealed trait RootDeviceType extends js.Any
  object RootDeviceType extends js.Object {
    val ebs              = "ebs".asInstanceOf[RootDeviceType]
    val `instance-store` = "instance-store".asInstanceOf[RootDeviceType]

    val values = js.Object.freeze(js.Array(ebs, `instance-store`))
  }

  /**
    * Describes a route in a route table.
    */
  @js.native
  @Factory
  trait Route extends js.Object {
    var DestinationCidrBlock: js.UndefOr[String]
    var DestinationIpv6CidrBlock: js.UndefOr[String]
    var DestinationPrefixListId: js.UndefOr[String]
    var EgressOnlyInternetGatewayId: js.UndefOr[String]
    var GatewayId: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var InstanceOwnerId: js.UndefOr[String]
    var LocalGatewayId: js.UndefOr[String]
    var NatGatewayId: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var Origin: js.UndefOr[RouteOrigin]
    var State: js.UndefOr[RouteState]
    var TransitGatewayId: js.UndefOr[String]
    var VpcPeeringConnectionId: js.UndefOr[String]
  }

  @js.native
  sealed trait RouteOrigin extends js.Any
  object RouteOrigin extends js.Object {
    val CreateRouteTable          = "CreateRouteTable".asInstanceOf[RouteOrigin]
    val CreateRoute               = "CreateRoute".asInstanceOf[RouteOrigin]
    val EnableVgwRoutePropagation = "EnableVgwRoutePropagation".asInstanceOf[RouteOrigin]

    val values = js.Object.freeze(js.Array(CreateRouteTable, CreateRoute, EnableVgwRoutePropagation))
  }

  @js.native
  sealed trait RouteState extends js.Any
  object RouteState extends js.Object {
    val active    = "active".asInstanceOf[RouteState]
    val blackhole = "blackhole".asInstanceOf[RouteState]

    val values = js.Object.freeze(js.Array(active, blackhole))
  }

  /**
    * Describes a route table.
    */
  @js.native
  @Factory
  trait RouteTable extends js.Object {
    var Associations: js.UndefOr[RouteTableAssociationList]
    var OwnerId: js.UndefOr[String]
    var PropagatingVgws: js.UndefOr[PropagatingVgwList]
    var RouteTableId: js.UndefOr[String]
    var Routes: js.UndefOr[RouteList]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes an association between a route table and a subnet or gateway.
    */
  @js.native
  @Factory
  trait RouteTableAssociation extends js.Object {
    var AssociationState: js.UndefOr[RouteTableAssociationState]
    var GatewayId: js.UndefOr[String]
    var Main: js.UndefOr[Boolean]
    var RouteTableAssociationId: js.UndefOr[String]
    var RouteTableId: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
  }

  /**
    * Describes the state of an association between a route table and a subnet or gateway.
    */
  @js.native
  @Factory
  trait RouteTableAssociationState extends js.Object {
    var State: js.UndefOr[RouteTableAssociationStateCode]
    var StatusMessage: js.UndefOr[String]
  }

  @js.native
  sealed trait RouteTableAssociationStateCode extends js.Any
  object RouteTableAssociationStateCode extends js.Object {
    val associating    = "associating".asInstanceOf[RouteTableAssociationStateCode]
    val associated     = "associated".asInstanceOf[RouteTableAssociationStateCode]
    val disassociating = "disassociating".asInstanceOf[RouteTableAssociationStateCode]
    val disassociated  = "disassociated".asInstanceOf[RouteTableAssociationStateCode]
    val failed         = "failed".asInstanceOf[RouteTableAssociationStateCode]

    val values = js.Object.freeze(js.Array(associating, associated, disassociating, disassociated, failed))
  }

  @js.native
  sealed trait RuleAction extends js.Any
  object RuleAction extends js.Object {
    val allow = "allow".asInstanceOf[RuleAction]
    val deny  = "deny".asInstanceOf[RuleAction]

    val values = js.Object.freeze(js.Array(allow, deny))
  }

  /**
    * Describes the monitoring of an instance.
    */
  @js.native
  @Factory
  trait RunInstancesMonitoringEnabled extends js.Object {
    var Enabled: Boolean
  }

  @js.native
  @Factory
  trait RunInstancesRequest extends js.Object {
    var MaxCount: Int
    var MinCount: Int
    var AdditionalInfo: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList]
    var CapacityReservationSpecification: js.UndefOr[CapacityReservationSpecification]
    var ClientToken: js.UndefOr[String]
    var CpuOptions: js.UndefOr[CpuOptionsRequest]
    var CreditSpecification: js.UndefOr[CreditSpecificationRequest]
    var DisableApiTermination: js.UndefOr[Boolean]
    var DryRun: js.UndefOr[Boolean]
    var EbsOptimized: js.UndefOr[Boolean]
    var ElasticGpuSpecification: js.UndefOr[ElasticGpuSpecifications]
    var ElasticInferenceAccelerators: js.UndefOr[ElasticInferenceAccelerators]
    var HibernationOptions: js.UndefOr[HibernationOptionsRequest]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var ImageId: js.UndefOr[ImageId]
    var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior]
    var InstanceMarketOptions: js.UndefOr[InstanceMarketOptionsRequest]
    var InstanceType: js.UndefOr[InstanceType]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList]
    var KernelId: js.UndefOr[String]
    var KeyName: js.UndefOr[KeyPairName]
    var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification]
    var LicenseSpecifications: js.UndefOr[LicenseSpecificationListRequest]
    var MetadataOptions: js.UndefOr[InstanceMetadataOptionsRequest]
    var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled]
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList]
    var Placement: js.UndefOr[Placement]
    var PrivateIpAddress: js.UndefOr[String]
    var RamdiskId: js.UndefOr[String]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdStringList]
    var SecurityGroups: js.UndefOr[SecurityGroupStringList]
    var SubnetId: js.UndefOr[String]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var UserData: js.UndefOr[String]
  }

  /**
    * Contains the parameters for RunScheduledInstances.
    */
  @js.native
  @Factory
  trait RunScheduledInstancesRequest extends js.Object {
    var LaunchSpecification: ScheduledInstancesLaunchSpecification
    var ScheduledInstanceId: ScheduledInstanceId
    var ClientToken: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var InstanceCount: js.UndefOr[Int]
  }

  /**
    * Contains the output of RunScheduledInstances.
    */
  @js.native
  @Factory
  trait RunScheduledInstancesResult extends js.Object {
    var InstanceIdSet: js.UndefOr[InstanceIdSet]
  }

  /**
    * Describes the storage parameters for S3 and S3 buckets for an instance store-backed AMI.
    */
  @js.native
  @Factory
  trait S3Storage extends js.Object {
    var AWSAccessKeyId: js.UndefOr[String]
    var Bucket: js.UndefOr[String]
    var Prefix: js.UndefOr[String]
    var UploadPolicy: js.UndefOr[Blob]
    var UploadPolicySignature: js.UndefOr[String]
  }

  /**
    * Describes a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstance extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var CreateDate: js.UndefOr[DateTime]
    var HourlyPrice: js.UndefOr[String]
    var InstanceCount: js.UndefOr[Int]
    var InstanceType: js.UndefOr[String]
    var NetworkPlatform: js.UndefOr[String]
    var NextSlotStartTime: js.UndefOr[DateTime]
    var Platform: js.UndefOr[String]
    var PreviousSlotEndTime: js.UndefOr[DateTime]
    var Recurrence: js.UndefOr[ScheduledInstanceRecurrence]
    var ScheduledInstanceId: js.UndefOr[String]
    var SlotDurationInHours: js.UndefOr[Int]
    var TermEndDate: js.UndefOr[DateTime]
    var TermStartDate: js.UndefOr[DateTime]
    var TotalScheduledInstanceHours: js.UndefOr[Int]
  }

  /**
    * Describes a schedule that is available for your Scheduled Instances.
    */
  @js.native
  @Factory
  trait ScheduledInstanceAvailability extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var AvailableInstanceCount: js.UndefOr[Int]
    var FirstSlotStartTime: js.UndefOr[DateTime]
    var HourlyPrice: js.UndefOr[String]
    var InstanceType: js.UndefOr[String]
    var MaxTermDurationInDays: js.UndefOr[Int]
    var MinTermDurationInDays: js.UndefOr[Int]
    var NetworkPlatform: js.UndefOr[String]
    var Platform: js.UndefOr[String]
    var PurchaseToken: js.UndefOr[String]
    var Recurrence: js.UndefOr[ScheduledInstanceRecurrence]
    var SlotDurationInHours: js.UndefOr[Int]
    var TotalScheduledInstanceHours: js.UndefOr[Int]
  }

  /**
    * Describes the recurring schedule for a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstanceRecurrence extends js.Object {
    var Frequency: js.UndefOr[String]
    var Interval: js.UndefOr[Int]
    var OccurrenceDaySet: js.UndefOr[OccurrenceDaySet]
    var OccurrenceRelativeToEnd: js.UndefOr[Boolean]
    var OccurrenceUnit: js.UndefOr[String]
  }

  /**
    * Describes the recurring schedule for a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstanceRecurrenceRequest extends js.Object {
    var Frequency: js.UndefOr[String]
    var Interval: js.UndefOr[Int]
    var OccurrenceDays: js.UndefOr[OccurrenceDayRequestSet]
    var OccurrenceRelativeToEnd: js.UndefOr[Boolean]
    var OccurrenceUnit: js.UndefOr[String]
  }

  /**
    * Describes a block device mapping for a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstancesBlockDeviceMapping extends js.Object {
    var DeviceName: js.UndefOr[String]
    var Ebs: js.UndefOr[ScheduledInstancesEbs]
    var NoDevice: js.UndefOr[String]
    var VirtualName: js.UndefOr[String]
  }

  /**
    * Describes an EBS volume for a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstancesEbs extends js.Object {
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Encrypted: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[SnapshotId]
    var VolumeSize: js.UndefOr[Int]
    var VolumeType: js.UndefOr[String]
  }

  /**
    * Describes an IAM instance profile for a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstancesIamInstanceProfile extends js.Object {
    var Arn: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  /**
    * Describes an IPv6 address.
    */
  @js.native
  @Factory
  trait ScheduledInstancesIpv6Address extends js.Object {
    var Ipv6Address: js.UndefOr[Ipv6Address]
  }

  /**
    * Describes the launch specification for a Scheduled Instance.
    *  If you are launching the Scheduled Instance in EC2-VPC, you must specify the ID of the subnet. You can specify the subnet using either <code>SubnetId</code> or <code>NetworkInterface</code>.
    */
  @js.native
  @Factory
  trait ScheduledInstancesLaunchSpecification extends js.Object {
    var ImageId: ImageId
    var BlockDeviceMappings: js.UndefOr[ScheduledInstancesBlockDeviceMappingSet]
    var EbsOptimized: js.UndefOr[Boolean]
    var IamInstanceProfile: js.UndefOr[ScheduledInstancesIamInstanceProfile]
    var InstanceType: js.UndefOr[String]
    var KernelId: js.UndefOr[KernelId]
    var KeyName: js.UndefOr[KeyPairName]
    var Monitoring: js.UndefOr[ScheduledInstancesMonitoring]
    var NetworkInterfaces: js.UndefOr[ScheduledInstancesNetworkInterfaceSet]
    var Placement: js.UndefOr[ScheduledInstancesPlacement]
    var RamdiskId: js.UndefOr[RamdiskId]
    var SecurityGroupIds: js.UndefOr[ScheduledInstancesSecurityGroupIdSet]
    var SubnetId: js.UndefOr[SubnetId]
    var UserData: js.UndefOr[String]
  }

  /**
    * Describes whether monitoring is enabled for a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstancesMonitoring extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * Describes a network interface for a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstancesNetworkInterface extends js.Object {
    var AssociatePublicIpAddress: js.UndefOr[Boolean]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Description: js.UndefOr[String]
    var DeviceIndex: js.UndefOr[Int]
    var Groups: js.UndefOr[ScheduledInstancesSecurityGroupIdSet]
    var Ipv6AddressCount: js.UndefOr[Int]
    var Ipv6Addresses: js.UndefOr[ScheduledInstancesIpv6AddressList]
    var NetworkInterfaceId: js.UndefOr[NetworkInterfaceId]
    var PrivateIpAddress: js.UndefOr[String]
    var PrivateIpAddressConfigs: js.UndefOr[PrivateIpAddressConfigSet]
    var SecondaryPrivateIpAddressCount: js.UndefOr[Int]
    var SubnetId: js.UndefOr[SubnetId]
  }

  /**
    * Describes the placement for a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstancesPlacement extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var GroupName: js.UndefOr[PlacementGroupName]
  }

  /**
    * Describes a private IPv4 address for a Scheduled Instance.
    */
  @js.native
  @Factory
  trait ScheduledInstancesPrivateIpAddressConfig extends js.Object {
    var Primary: js.UndefOr[Boolean]
    var PrivateIpAddress: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SearchLocalGatewayRoutesRequest extends js.Object {
    var Filters: FilterList
    var LocalGatewayRouteTableId: LocalGatewayRoutetableId
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SearchLocalGatewayRoutesResult extends js.Object {
    var NextToken: js.UndefOr[String]
    var Routes: js.UndefOr[LocalGatewayRouteList]
  }

  @js.native
  @Factory
  trait SearchTransitGatewayMulticastGroupsRequest extends js.Object {
    var DryRun: js.UndefOr[Boolean]
    var Filters: js.UndefOr[FilterList]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
    var NextToken: js.UndefOr[String]
    var TransitGatewayMulticastDomainId: js.UndefOr[TransitGatewayMulticastDomainId]
  }

  @js.native
  @Factory
  trait SearchTransitGatewayMulticastGroupsResult extends js.Object {
    var MulticastGroups: js.UndefOr[TransitGatewayMulticastGroupList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SearchTransitGatewayRoutesRequest extends js.Object {
    var Filters: FilterList
    var TransitGatewayRouteTableId: TransitGatewayRouteTableId
    var DryRun: js.UndefOr[Boolean]
    var MaxResults: js.UndefOr[TransitGatewayMaxResults]
  }

  @js.native
  @Factory
  trait SearchTransitGatewayRoutesResult extends js.Object {
    var AdditionalRoutesAvailable: js.UndefOr[Boolean]
    var Routes: js.UndefOr[TransitGatewayRouteList]
  }

  /**
    * Describes a security group
    */
  @js.native
  @Factory
  trait SecurityGroup extends js.Object {
    var Description: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var IpPermissions: js.UndefOr[IpPermissionList]
    var IpPermissionsEgress: js.UndefOr[IpPermissionList]
    var OwnerId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes a security group.
    */
  @js.native
  @Factory
  trait SecurityGroupIdentifier extends js.Object {
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
  }

  /**
    * Describes a VPC with a security group that references your security group.
    */
  @js.native
  @Factory
  trait SecurityGroupReference extends js.Object {
    var GroupId: js.UndefOr[String]
    var ReferencingVpcId: js.UndefOr[String]
    var VpcPeeringConnectionId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait SendDiagnosticInterruptRequest extends js.Object {
    var InstanceId: InstanceId
    var DryRun: js.UndefOr[Boolean]
  }

  /**
    * Describes a service configuration for a VPC endpoint service.
    */
  @js.native
  @Factory
  trait ServiceConfiguration extends js.Object {
    var AcceptanceRequired: js.UndefOr[Boolean]
    var AvailabilityZones: js.UndefOr[ValueStringList]
    var BaseEndpointDnsNames: js.UndefOr[ValueStringList]
    var ManagesVpcEndpoints: js.UndefOr[Boolean]
    var NetworkLoadBalancerArns: js.UndefOr[ValueStringList]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateDnsNameConfiguration: js.UndefOr[PrivateDnsNameConfiguration]
    var ServiceId: js.UndefOr[String]
    var ServiceName: js.UndefOr[String]
    var ServiceState: js.UndefOr[ServiceState]
    var ServiceType: js.UndefOr[ServiceTypeDetailSet]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes a VPC endpoint service.
    */
  @js.native
  @Factory
  trait ServiceDetail extends js.Object {
    var AcceptanceRequired: js.UndefOr[Boolean]
    var AvailabilityZones: js.UndefOr[ValueStringList]
    var BaseEndpointDnsNames: js.UndefOr[ValueStringList]
    var ManagesVpcEndpoints: js.UndefOr[Boolean]
    var Owner: js.UndefOr[String]
    var PrivateDnsName: js.UndefOr[String]
    var PrivateDnsNameVerificationState: js.UndefOr[DnsNameState]
    var ServiceId: js.UndefOr[String]
    var ServiceName: js.UndefOr[String]
    var ServiceType: js.UndefOr[ServiceTypeDetailSet]
    var Tags: js.UndefOr[TagList]
    var VpcEndpointPolicySupported: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait ServiceState extends js.Any
  object ServiceState extends js.Object {
    val Pending   = "Pending".asInstanceOf[ServiceState]
    val Available = "Available".asInstanceOf[ServiceState]
    val Deleting  = "Deleting".asInstanceOf[ServiceState]
    val Deleted   = "Deleted".asInstanceOf[ServiceState]
    val Failed    = "Failed".asInstanceOf[ServiceState]

    val values = js.Object.freeze(js.Array(Pending, Available, Deleting, Deleted, Failed))
  }

  @js.native
  sealed trait ServiceType extends js.Any
  object ServiceType extends js.Object {
    val Interface = "Interface".asInstanceOf[ServiceType]
    val Gateway   = "Gateway".asInstanceOf[ServiceType]

    val values = js.Object.freeze(js.Array(Interface, Gateway))
  }

  /**
    * Describes the type of service for a VPC endpoint.
    */
  @js.native
  @Factory
  trait ServiceTypeDetail extends js.Object {
    var ServiceType: js.UndefOr[ServiceType]
  }

  @js.native
  sealed trait ShutdownBehavior extends js.Any
  object ShutdownBehavior extends js.Object {
    val stop      = "stop".asInstanceOf[ShutdownBehavior]
    val terminate = "terminate".asInstanceOf[ShutdownBehavior]

    val values = js.Object.freeze(js.Array(stop, terminate))
  }

  /**
    * Describes the time period for a Scheduled Instance to start its first schedule. The time period must span less than one day.
    */
  @js.native
  @Factory
  trait SlotDateTimeRangeRequest extends js.Object {
    var EarliestTime: DateTime
    var LatestTime: DateTime
  }

  /**
    * Describes the time period for a Scheduled Instance to start its first schedule.
    */
  @js.native
  @Factory
  trait SlotStartTimeRangeRequest extends js.Object {
    var EarliestTime: js.UndefOr[DateTime]
    var LatestTime: js.UndefOr[DateTime]
  }

  /**
    * Describes a snapshot.
    */
  @js.native
  @Factory
  trait Snapshot extends js.Object {
    var DataEncryptionKeyId: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var OwnerAlias: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var StartTime: js.UndefOr[DateTime]
    var State: js.UndefOr[SnapshotState]
    var StateMessage: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VolumeId: js.UndefOr[String]
    var VolumeSize: js.UndefOr[Int]
  }

  @js.native
  sealed trait SnapshotAttributeName extends js.Any
  object SnapshotAttributeName extends js.Object {
    val productCodes           = "productCodes".asInstanceOf[SnapshotAttributeName]
    val createVolumePermission = "createVolumePermission".asInstanceOf[SnapshotAttributeName]

    val values = js.Object.freeze(js.Array(productCodes, createVolumePermission))
  }

  /**
    * Describes the snapshot created from the imported disk.
    */
  @js.native
  @Factory
  trait SnapshotDetail extends js.Object {
    var Description: js.UndefOr[String]
    var DeviceName: js.UndefOr[String]
    var DiskImageSize: js.UndefOr[Double]
    var Format: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
    var Url: js.UndefOr[String]
    var UserBucket: js.UndefOr[UserBucketDetails]
  }

  /**
    * The disk container object for the import snapshot request.
    */
  @js.native
  @Factory
  trait SnapshotDiskContainer extends js.Object {
    var Description: js.UndefOr[String]
    var Format: js.UndefOr[String]
    var Url: js.UndefOr[String]
    var UserBucket: js.UndefOr[UserBucket]
  }

  /**
    * Information about a snapshot.
    */
  @js.native
  @Factory
  trait SnapshotInfo extends js.Object {
    var Description: js.UndefOr[String]
    var Encrypted: js.UndefOr[Boolean]
    var OwnerId: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var StartTime: js.UndefOr[MillisecondDateTime]
    var State: js.UndefOr[SnapshotState]
    var Tags: js.UndefOr[TagList]
    var VolumeId: js.UndefOr[String]
    var VolumeSize: js.UndefOr[Int]
  }

  @js.native
  sealed trait SnapshotState extends js.Any
  object SnapshotState extends js.Object {
    val pending   = "pending".asInstanceOf[SnapshotState]
    val completed = "completed".asInstanceOf[SnapshotState]
    val error     = "error".asInstanceOf[SnapshotState]

    val values = js.Object.freeze(js.Array(pending, completed, error))
  }

  /**
    * Details about the import snapshot task.
    */
  @js.native
  @Factory
  trait SnapshotTaskDetail extends js.Object {
    var Description: js.UndefOr[String]
    var DiskImageSize: js.UndefOr[Double]
    var Encrypted: js.UndefOr[Boolean]
    var Format: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var Progress: js.UndefOr[String]
    var SnapshotId: js.UndefOr[String]
    var Status: js.UndefOr[String]
    var StatusMessage: js.UndefOr[String]
    var Url: js.UndefOr[String]
    var UserBucket: js.UndefOr[UserBucketDetails]
  }

  @js.native
  sealed trait SpotAllocationStrategy extends js.Any
  object SpotAllocationStrategy extends js.Object {
    val `lowest-price`       = "lowest-price".asInstanceOf[SpotAllocationStrategy]
    val diversified          = "diversified".asInstanceOf[SpotAllocationStrategy]
    val `capacity-optimized` = "capacity-optimized".asInstanceOf[SpotAllocationStrategy]

    val values = js.Object.freeze(js.Array(`lowest-price`, diversified, `capacity-optimized`))
  }

  /**
    * Describes the data feed for a Spot Instance.
    */
  @js.native
  @Factory
  trait SpotDatafeedSubscription extends js.Object {
    var Bucket: js.UndefOr[String]
    var Fault: js.UndefOr[SpotInstanceStateFault]
    var OwnerId: js.UndefOr[String]
    var Prefix: js.UndefOr[String]
    var State: js.UndefOr[DatafeedSubscriptionState]
  }

  /**
    * Describes the launch specification for one or more Spot Instances. If you include On-Demand capacity in your fleet request, you can't use <code>SpotFleetLaunchSpecification</code>; you must use [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_LaunchTemplateConfig.html|LaunchTemplateConfig]].
    */
  @js.native
  @Factory
  trait SpotFleetLaunchSpecification extends js.Object {
    var AddressingType: js.UndefOr[String]
    var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList]
    var EbsOptimized: js.UndefOr[Boolean]
    var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification]
    var ImageId: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var KernelId: js.UndefOr[String]
    var KeyName: js.UndefOr[String]
    var Monitoring: js.UndefOr[SpotFleetMonitoring]
    var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList]
    var Placement: js.UndefOr[SpotPlacement]
    var RamdiskId: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[GroupIdentifierList]
    var SpotPrice: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
    var TagSpecifications: js.UndefOr[SpotFleetTagSpecificationList]
    var UserData: js.UndefOr[String]
    var WeightedCapacity: js.UndefOr[Double]
  }

  /**
    * Describes whether monitoring is enabled.
    */
  @js.native
  @Factory
  trait SpotFleetMonitoring extends js.Object {
    var Enabled: js.UndefOr[Boolean]
  }

  /**
    * Describes a Spot Fleet request.
    */
  @js.native
  @Factory
  trait SpotFleetRequestConfig extends js.Object {
    var ActivityStatus: js.UndefOr[ActivityStatus]
    var CreateTime: js.UndefOr[MillisecondDateTime]
    var SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData]
    var SpotFleetRequestId: js.UndefOr[String]
    var SpotFleetRequestState: js.UndefOr[BatchState]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Describes the configuration of a Spot Fleet request.
    */
  @js.native
  @Factory
  trait SpotFleetRequestConfigData extends js.Object {
    var IamFleetRole: String
    var TargetCapacity: Int
    var AllocationStrategy: js.UndefOr[AllocationStrategy]
    var ClientToken: js.UndefOr[String]
    var ExcessCapacityTerminationPolicy: js.UndefOr[ExcessCapacityTerminationPolicy]
    var FulfilledCapacity: js.UndefOr[Double]
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var InstancePoolsToUseCount: js.UndefOr[Int]
    var LaunchSpecifications: js.UndefOr[LaunchSpecsList]
    var LaunchTemplateConfigs: js.UndefOr[LaunchTemplateConfigList]
    var LoadBalancersConfig: js.UndefOr[LoadBalancersConfig]
    var OnDemandAllocationStrategy: js.UndefOr[OnDemandAllocationStrategy]
    var OnDemandFulfilledCapacity: js.UndefOr[Double]
    var OnDemandMaxTotalPrice: js.UndefOr[String]
    var OnDemandTargetCapacity: js.UndefOr[Int]
    var ReplaceUnhealthyInstances: js.UndefOr[Boolean]
    var SpotMaxTotalPrice: js.UndefOr[String]
    var SpotPrice: js.UndefOr[String]
    var TagSpecifications: js.UndefOr[TagSpecificationList]
    var TerminateInstancesWithExpiration: js.UndefOr[Boolean]
    var Type: js.UndefOr[FleetType]
    var ValidFrom: js.UndefOr[DateTime]
    var ValidUntil: js.UndefOr[DateTime]
  }

  /**
    * The tags for a Spot Fleet resource.
    */
  @js.native
  @Factory
  trait SpotFleetTagSpecification extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  sealed trait SpotInstanceInterruptionBehavior extends js.Any
  object SpotInstanceInterruptionBehavior extends js.Object {
    val hibernate = "hibernate".asInstanceOf[SpotInstanceInterruptionBehavior]
    val stop      = "stop".asInstanceOf[SpotInstanceInterruptionBehavior]
    val terminate = "terminate".asInstanceOf[SpotInstanceInterruptionBehavior]

    val values = js.Object.freeze(js.Array(hibernate, stop, terminate))
  }

  /**
    * Describes a Spot Instance request.
    */
  @js.native
  @Factory
  trait SpotInstanceRequest extends js.Object {
    var ActualBlockHourlyPrice: js.UndefOr[String]
    var AvailabilityZoneGroup: js.UndefOr[String]
    var BlockDurationMinutes: js.UndefOr[Int]
    var CreateTime: js.UndefOr[DateTime]
    var Fault: js.UndefOr[SpotInstanceStateFault]
    var InstanceId: js.UndefOr[InstanceId]
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var LaunchGroup: js.UndefOr[String]
    var LaunchSpecification: js.UndefOr[LaunchSpecification]
    var LaunchedAvailabilityZone: js.UndefOr[String]
    var ProductDescription: js.UndefOr[RIProductDescription]
    var SpotInstanceRequestId: js.UndefOr[String]
    var SpotPrice: js.UndefOr[String]
    var State: js.UndefOr[SpotInstanceState]
    var Status: js.UndefOr[SpotInstanceStatus]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[SpotInstanceType]
    var ValidFrom: js.UndefOr[DateTime]
    var ValidUntil: js.UndefOr[DateTime]
  }

  @js.native
  sealed trait SpotInstanceState extends js.Any
  object SpotInstanceState extends js.Object {
    val open      = "open".asInstanceOf[SpotInstanceState]
    val active    = "active".asInstanceOf[SpotInstanceState]
    val closed    = "closed".asInstanceOf[SpotInstanceState]
    val cancelled = "cancelled".asInstanceOf[SpotInstanceState]
    val failed    = "failed".asInstanceOf[SpotInstanceState]

    val values = js.Object.freeze(js.Array(open, active, closed, cancelled, failed))
  }

  /**
    * Describes a Spot Instance state change.
    */
  @js.native
  @Factory
  trait SpotInstanceStateFault extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  /**
    * Describes the status of a Spot Instance request.
    */
  @js.native
  @Factory
  trait SpotInstanceStatus extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
    var UpdateTime: js.UndefOr[DateTime]
  }

  @js.native
  sealed trait SpotInstanceType extends js.Any
  object SpotInstanceType extends js.Object {
    val `one-time` = "one-time".asInstanceOf[SpotInstanceType]
    val persistent = "persistent".asInstanceOf[SpotInstanceType]

    val values = js.Object.freeze(js.Array(`one-time`, persistent))
  }

  /**
    * The options for Spot Instances.
    */
  @js.native
  @Factory
  trait SpotMarketOptions extends js.Object {
    var BlockDurationMinutes: js.UndefOr[Int]
    var InstanceInterruptionBehavior: js.UndefOr[InstanceInterruptionBehavior]
    var MaxPrice: js.UndefOr[String]
    var SpotInstanceType: js.UndefOr[SpotInstanceType]
    var ValidUntil: js.UndefOr[DateTime]
  }

  /**
    * Describes the configuration of Spot Instances in an EC2 Fleet.
    */
  @js.native
  @Factory
  trait SpotOptions extends js.Object {
    var AllocationStrategy: js.UndefOr[SpotAllocationStrategy]
    var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior]
    var InstancePoolsToUseCount: js.UndefOr[Int]
    var MaxTotalPrice: js.UndefOr[String]
    var MinTargetCapacity: js.UndefOr[Int]
    var SingleAvailabilityZone: js.UndefOr[Boolean]
    var SingleInstanceType: js.UndefOr[Boolean]
  }

  /**
    * Describes the configuration of Spot Instances in an EC2 Fleet request.
    */
  @js.native
  @Factory
  trait SpotOptionsRequest extends js.Object {
    var AllocationStrategy: js.UndefOr[SpotAllocationStrategy]
    var InstanceInterruptionBehavior: js.UndefOr[SpotInstanceInterruptionBehavior]
    var InstancePoolsToUseCount: js.UndefOr[Int]
    var MaxTotalPrice: js.UndefOr[String]
    var MinTargetCapacity: js.UndefOr[Int]
    var SingleAvailabilityZone: js.UndefOr[Boolean]
    var SingleInstanceType: js.UndefOr[Boolean]
  }

  /**
    * Describes Spot Instance placement.
    */
  @js.native
  @Factory
  trait SpotPlacement extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var Tenancy: js.UndefOr[Tenancy]
  }

  /**
    * Describes the maximum price per hour that you are willing to pay for a Spot Instance.
    */
  @js.native
  @Factory
  trait SpotPrice extends js.Object {
    var AvailabilityZone: js.UndefOr[String]
    var InstanceType: js.UndefOr[InstanceType]
    var ProductDescription: js.UndefOr[RIProductDescription]
    var SpotPrice: js.UndefOr[String]
    var Timestamp: js.UndefOr[DateTime]
  }

  /**
    * Describes a stale rule in a security group.
    */
  @js.native
  @Factory
  trait StaleIpPermission extends js.Object {
    var FromPort: js.UndefOr[Int]
    var IpProtocol: js.UndefOr[String]
    var IpRanges: js.UndefOr[IpRanges]
    var PrefixListIds: js.UndefOr[PrefixListIdSet]
    var ToPort: js.UndefOr[Int]
    var UserIdGroupPairs: js.UndefOr[UserIdGroupPairSet]
  }

  /**
    * Describes a stale security group (a security group that contains stale rules).
    */
  @js.native
  @Factory
  trait StaleSecurityGroup extends js.Object {
    var Description: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var StaleIpPermissions: js.UndefOr[StaleIpPermissionSet]
    var StaleIpPermissionsEgress: js.UndefOr[StaleIpPermissionSet]
    var VpcId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait StartInstancesRequest extends js.Object {
    var InstanceIds: InstanceIdStringList
    var AdditionalInfo: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait StartInstancesResult extends js.Object {
    var StartingInstances: js.UndefOr[InstanceStateChangeList]
  }

  @js.native
  @Factory
  trait StartVpcEndpointServicePrivateDnsVerificationRequest extends js.Object {
    var ServiceId: VpcEndpointServiceId
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait StartVpcEndpointServicePrivateDnsVerificationResult extends js.Object {
    var ReturnValue: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait State extends js.Any
  object State extends js.Object {
    val PendingAcceptance = "PendingAcceptance".asInstanceOf[State]
    val Pending           = "Pending".asInstanceOf[State]
    val Available         = "Available".asInstanceOf[State]
    val Deleting          = "Deleting".asInstanceOf[State]
    val Deleted           = "Deleted".asInstanceOf[State]
    val Rejected          = "Rejected".asInstanceOf[State]
    val Failed            = "Failed".asInstanceOf[State]
    val Expired           = "Expired".asInstanceOf[State]

    val values =
      js.Object.freeze(js.Array(PendingAcceptance, Pending, Available, Deleting, Deleted, Rejected, Failed, Expired))
  }

  /**
    * Describes a state change.
    */
  @js.native
  @Factory
  trait StateReason extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val MoveInProgress = "MoveInProgress".asInstanceOf[Status]
    val InVpc          = "InVpc".asInstanceOf[Status]
    val InClassic      = "InClassic".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(MoveInProgress, InVpc, InClassic))
  }

  @js.native
  sealed trait StatusName extends js.Any
  object StatusName extends js.Object {
    val reachability = "reachability".asInstanceOf[StatusName]

    val values = js.Object.freeze(js.Array(reachability))
  }

  @js.native
  sealed trait StatusType extends js.Any
  object StatusType extends js.Object {
    val passed              = "passed".asInstanceOf[StatusType]
    val failed              = "failed".asInstanceOf[StatusType]
    val `insufficient-data` = "insufficient-data".asInstanceOf[StatusType]
    val initializing        = "initializing".asInstanceOf[StatusType]

    val values = js.Object.freeze(js.Array(passed, failed, `insufficient-data`, initializing))
  }

  @js.native
  @Factory
  trait StopInstancesRequest extends js.Object {
    var InstanceIds: InstanceIdStringList
    var DryRun: js.UndefOr[Boolean]
    var Force: js.UndefOr[Boolean]
    var Hibernate: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait StopInstancesResult extends js.Object {
    var StoppingInstances: js.UndefOr[InstanceStateChangeList]
  }

  /**
    * Describes the storage location for an instance store-backed AMI.
    */
  @js.native
  @Factory
  trait Storage extends js.Object {
    var S3: js.UndefOr[S3Storage]
  }

  /**
    * Describes a storage location in Amazon S3.
    */
  @js.native
  @Factory
  trait StorageLocation extends js.Object {
    var Bucket: js.UndefOr[String]
    var Key: js.UndefOr[String]
  }

  /**
    * Describes a subnet.
    */
  @js.native
  @Factory
  trait Subnet extends js.Object {
    var AssignIpv6AddressOnCreation: js.UndefOr[Boolean]
    var AvailabilityZone: js.UndefOr[String]
    var AvailabilityZoneId: js.UndefOr[String]
    var AvailableIpAddressCount: js.UndefOr[Int]
    var CidrBlock: js.UndefOr[String]
    var DefaultForAz: js.UndefOr[Boolean]
    var Ipv6CidrBlockAssociationSet: js.UndefOr[SubnetIpv6CidrBlockAssociationSet]
    var MapPublicIpOnLaunch: js.UndefOr[Boolean]
    var OutpostArn: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var State: js.UndefOr[SubnetState]
    var SubnetArn: js.UndefOr[String]
    var SubnetId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes the subnet association with the transit gateway multicast domain.
    */
  @js.native
  @Factory
  trait SubnetAssociation extends js.Object {
    var State: js.UndefOr[TransitGatewayMulitcastDomainAssociationState]
    var SubnetId: js.UndefOr[String]
  }

  /**
    * Describes the state of a CIDR block.
    */
  @js.native
  @Factory
  trait SubnetCidrBlockState extends js.Object {
    var State: js.UndefOr[SubnetCidrBlockStateCode]
    var StatusMessage: js.UndefOr[String]
  }

  @js.native
  sealed trait SubnetCidrBlockStateCode extends js.Any
  object SubnetCidrBlockStateCode extends js.Object {
    val associating    = "associating".asInstanceOf[SubnetCidrBlockStateCode]
    val associated     = "associated".asInstanceOf[SubnetCidrBlockStateCode]
    val disassociating = "disassociating".asInstanceOf[SubnetCidrBlockStateCode]
    val disassociated  = "disassociated".asInstanceOf[SubnetCidrBlockStateCode]
    val failing        = "failing".asInstanceOf[SubnetCidrBlockStateCode]
    val failed         = "failed".asInstanceOf[SubnetCidrBlockStateCode]

    val values = js.Object.freeze(js.Array(associating, associated, disassociating, disassociated, failing, failed))
  }

  /**
    * Describes an IPv6 CIDR block associated with a subnet.
    */
  @js.native
  @Factory
  trait SubnetIpv6CidrBlockAssociation extends js.Object {
    var AssociationId: js.UndefOr[String]
    var Ipv6CidrBlock: js.UndefOr[String]
    var Ipv6CidrBlockState: js.UndefOr[SubnetCidrBlockState]
  }

  @js.native
  sealed trait SubnetState extends js.Any
  object SubnetState extends js.Object {
    val pending   = "pending".asInstanceOf[SubnetState]
    val available = "available".asInstanceOf[SubnetState]

    val values = js.Object.freeze(js.Array(pending, available))
  }

  /**
    * Describes the burstable performance instance whose credit option for CPU usage was successfully modified.
    */
  @js.native
  @Factory
  trait SuccessfulInstanceCreditSpecificationItem extends js.Object {
    var InstanceId: js.UndefOr[String]
  }

  /**
    * Describes a Reserved Instance whose queued purchase was successfully deleted.
    */
  @js.native
  @Factory
  trait SuccessfulQueuedPurchaseDeletion extends js.Object {
    var ReservedInstancesId: js.UndefOr[String]
  }

  @js.native
  sealed trait SummaryStatus extends js.Any
  object SummaryStatus extends js.Object {
    val ok                  = "ok".asInstanceOf[SummaryStatus]
    val impaired            = "impaired".asInstanceOf[SummaryStatus]
    val `insufficient-data` = "insufficient-data".asInstanceOf[SummaryStatus]
    val `not-applicable`    = "not-applicable".asInstanceOf[SummaryStatus]
    val initializing        = "initializing".asInstanceOf[SummaryStatus]

    val values = js.Object.freeze(js.Array(ok, impaired, `insufficient-data`, `not-applicable`, initializing))
  }

  /**
    * Describes a tag.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  /**
    * Describes a tag.
    */
  @js.native
  @Factory
  trait TagDescription extends js.Object {
    var Key: js.UndefOr[String]
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[ResourceType]
    var Value: js.UndefOr[String]
  }

  /**
    * The tags to apply to a resource when the resource is being created.
    */
  @js.native
  @Factory
  trait TagSpecification extends js.Object {
    var ResourceType: js.UndefOr[ResourceType]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * The number of units to request. You can choose to set the target capacity in terms of instances or a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
    *  You can use the On-Demand Instance <code>MaxTotalPrice</code> parameter, the Spot Instance <code>MaxTotalPrice</code>, or both to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, EC2 Fleet will launch instances until it reaches the maximum amount that you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity. The <code>MaxTotalPrice</code> parameters are located in and
    */
  @js.native
  @Factory
  trait TargetCapacitySpecification extends js.Object {
    var DefaultTargetCapacityType: js.UndefOr[DefaultTargetCapacityType]
    var OnDemandTargetCapacity: js.UndefOr[Int]
    var SpotTargetCapacity: js.UndefOr[Int]
    var TotalTargetCapacity: js.UndefOr[Int]
  }

  /**
    * The number of units to request. You can choose to set the target capacity as the number of instances. Or you can set the target capacity to a performance characteristic that is important to your application workload, such as vCPUs, memory, or I/O. If the request type is <code>maintain</code>, you can specify a target capacity of 0 and add capacity later.
    *  You can use the On-Demand Instance <code>MaxTotalPrice</code> parameter, the Spot Instance <code>MaxTotalPrice</code> parameter, or both parameters to ensure that your fleet cost does not exceed your budget. If you set a maximum price per hour for the On-Demand Instances and Spot Instances in your request, EC2 Fleet will launch instances until it reaches the maximum amount that you're willing to pay. When the maximum amount you're willing to pay is reached, the fleet stops launching instances even if it hasn’t met the target capacity. The <code>MaxTotalPrice</code> parameters are located in and .
    */
  @js.native
  @Factory
  trait TargetCapacitySpecificationRequest extends js.Object {
    var TotalTargetCapacity: Int
    var DefaultTargetCapacityType: js.UndefOr[DefaultTargetCapacityType]
    var OnDemandTargetCapacity: js.UndefOr[Int]
    var SpotTargetCapacity: js.UndefOr[Int]
  }

  /**
    * Information about the Convertible Reserved Instance offering.
    */
  @js.native
  @Factory
  trait TargetConfiguration extends js.Object {
    var InstanceCount: js.UndefOr[Int]
    var OfferingId: js.UndefOr[String]
  }

  /**
    * Details about the target configuration.
    */
  @js.native
  @Factory
  trait TargetConfigurationRequest extends js.Object {
    var OfferingId: ReservedInstancesOfferingId
    var InstanceCount: js.UndefOr[Int]
  }

  /**
    * Describes a load balancer target group.
    */
  @js.native
  @Factory
  trait TargetGroup extends js.Object {
    var Arn: js.UndefOr[String]
  }

  /**
    * Describes the target groups to attach to a Spot Fleet. Spot Fleet registers the running Spot Instances with these target groups.
    */
  @js.native
  @Factory
  trait TargetGroupsConfig extends js.Object {
    var TargetGroups: js.UndefOr[TargetGroups]
  }

  /**
    * Describes a target network associated with a Client VPN endpoint.
    */
  @js.native
  @Factory
  trait TargetNetwork extends js.Object {
    var AssociationId: js.UndefOr[String]
    var ClientVpnEndpointId: js.UndefOr[String]
    var SecurityGroups: js.UndefOr[ValueStringList]
    var Status: js.UndefOr[AssociationStatus]
    var TargetNetworkId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  /**
    * The total value of the new Convertible Reserved Instances.
    */
  @js.native
  @Factory
  trait TargetReservationValue extends js.Object {
    var ReservationValue: js.UndefOr[ReservationValue]
    var TargetConfiguration: js.UndefOr[TargetConfiguration]
  }

  @js.native
  sealed trait TelemetryStatus extends js.Any
  object TelemetryStatus extends js.Object {
    val UP   = "UP".asInstanceOf[TelemetryStatus]
    val DOWN = "DOWN".asInstanceOf[TelemetryStatus]

    val values = js.Object.freeze(js.Array(UP, DOWN))
  }

  @js.native
  sealed trait Tenancy extends js.Any
  object Tenancy extends js.Object {
    val default   = "default".asInstanceOf[Tenancy]
    val dedicated = "dedicated".asInstanceOf[Tenancy]
    val host      = "host".asInstanceOf[Tenancy]

    val values = js.Object.freeze(js.Array(default, dedicated, host))
  }

  @js.native
  @Factory
  trait TerminateClientVpnConnectionsRequest extends js.Object {
    var ClientVpnEndpointId: ClientVpnEndpointId
    var ConnectionId: js.UndefOr[String]
    var DryRun: js.UndefOr[Boolean]
    var Username: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait TerminateClientVpnConnectionsResult extends js.Object {
    var ClientVpnEndpointId: js.UndefOr[String]
    var ConnectionStatuses: js.UndefOr[TerminateConnectionStatusSet]
    var Username: js.UndefOr[String]
  }

  /**
    * Information about a terminated Client VPN endpoint client connection.
    */
  @js.native
  @Factory
  trait TerminateConnectionStatus extends js.Object {
    var ConnectionId: js.UndefOr[String]
    var CurrentStatus: js.UndefOr[ClientVpnConnectionStatus]
    var PreviousStatus: js.UndefOr[ClientVpnConnectionStatus]
  }

  @js.native
  @Factory
  trait TerminateInstancesRequest extends js.Object {
    var InstanceIds: InstanceIdStringList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait TerminateInstancesResult extends js.Object {
    var TerminatingInstances: js.UndefOr[InstanceStateChangeList]
  }

  @js.native
  sealed trait TrafficDirection extends js.Any
  object TrafficDirection extends js.Object {
    val ingress = "ingress".asInstanceOf[TrafficDirection]
    val egress  = "egress".asInstanceOf[TrafficDirection]

    val values = js.Object.freeze(js.Array(ingress, egress))
  }

  /**
    * Describes the Traffic Mirror filter.
    */
  @js.native
  @Factory
  trait TrafficMirrorFilter extends js.Object {
    var Description: js.UndefOr[String]
    var EgressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList]
    var IngressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList]
    var NetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList]
    var Tags: js.UndefOr[TagList]
    var TrafficMirrorFilterId: js.UndefOr[String]
  }

  /**
    * Describes the Traffic Mirror rule.
    */
  @js.native
  @Factory
  trait TrafficMirrorFilterRule extends js.Object {
    var Description: js.UndefOr[String]
    var DestinationCidrBlock: js.UndefOr[String]
    var DestinationPortRange: js.UndefOr[TrafficMirrorPortRange]
    var Protocol: js.UndefOr[Int]
    var RuleAction: js.UndefOr[TrafficMirrorRuleAction]
    var RuleNumber: js.UndefOr[Int]
    var SourceCidrBlock: js.UndefOr[String]
    var SourcePortRange: js.UndefOr[TrafficMirrorPortRange]
    var TrafficDirection: js.UndefOr[TrafficDirection]
    var TrafficMirrorFilterId: js.UndefOr[String]
    var TrafficMirrorFilterRuleId: js.UndefOr[String]
  }

  @js.native
  sealed trait TrafficMirrorFilterRuleField extends js.Any
  object TrafficMirrorFilterRuleField extends js.Object {
    val `destination-port-range` = "destination-port-range".asInstanceOf[TrafficMirrorFilterRuleField]
    val `source-port-range`      = "source-port-range".asInstanceOf[TrafficMirrorFilterRuleField]
    val protocol                 = "protocol".asInstanceOf[TrafficMirrorFilterRuleField]
    val description              = "description".asInstanceOf[TrafficMirrorFilterRuleField]

    val values = js.Object.freeze(js.Array(`destination-port-range`, `source-port-range`, protocol, description))
  }

  @js.native
  sealed trait TrafficMirrorNetworkService extends js.Any
  object TrafficMirrorNetworkService extends js.Object {
    val `amazon-dns` = "amazon-dns".asInstanceOf[TrafficMirrorNetworkService]

    val values = js.Object.freeze(js.Array(`amazon-dns`))
  }

  /**
    * Describes the Traffic Mirror port range.
    */
  @js.native
  @Factory
  trait TrafficMirrorPortRange extends js.Object {
    var FromPort: js.UndefOr[Int]
    var ToPort: js.UndefOr[Int]
  }

  /**
    * Information about the Traffic Mirror filter rule port range.
    */
  @js.native
  @Factory
  trait TrafficMirrorPortRangeRequest extends js.Object {
    var FromPort: js.UndefOr[Int]
    var ToPort: js.UndefOr[Int]
  }

  @js.native
  sealed trait TrafficMirrorRuleAction extends js.Any
  object TrafficMirrorRuleAction extends js.Object {
    val accept = "accept".asInstanceOf[TrafficMirrorRuleAction]
    val reject = "reject".asInstanceOf[TrafficMirrorRuleAction]

    val values = js.Object.freeze(js.Array(accept, reject))
  }

  /**
    * Describes a Traffic Mirror session.
    */
  @js.native
  @Factory
  trait TrafficMirrorSession extends js.Object {
    var Description: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var PacketLength: js.UndefOr[Int]
    var SessionNumber: js.UndefOr[Int]
    var Tags: js.UndefOr[TagList]
    var TrafficMirrorFilterId: js.UndefOr[String]
    var TrafficMirrorSessionId: js.UndefOr[String]
    var TrafficMirrorTargetId: js.UndefOr[String]
    var VirtualNetworkId: js.UndefOr[Int]
  }

  @js.native
  sealed trait TrafficMirrorSessionField extends js.Any
  object TrafficMirrorSessionField extends js.Object {
    val `packet-length`      = "packet-length".asInstanceOf[TrafficMirrorSessionField]
    val description          = "description".asInstanceOf[TrafficMirrorSessionField]
    val `virtual-network-id` = "virtual-network-id".asInstanceOf[TrafficMirrorSessionField]

    val values = js.Object.freeze(js.Array(`packet-length`, description, `virtual-network-id`))
  }

  /**
    * Describes a Traffic Mirror target.
    */
  @js.native
  @Factory
  trait TrafficMirrorTarget extends js.Object {
    var Description: js.UndefOr[String]
    var NetworkInterfaceId: js.UndefOr[String]
    var NetworkLoadBalancerArn: js.UndefOr[String]
    var OwnerId: js.UndefOr[String]
    var Tags: js.UndefOr[TagList]
    var TrafficMirrorTargetId: js.UndefOr[String]
    var Type: js.UndefOr[TrafficMirrorTargetType]
  }

  @js.native
  sealed trait TrafficMirrorTargetType extends js.Any
  object TrafficMirrorTargetType extends js.Object {
    val `network-interface`     = "network-interface".asInstanceOf[TrafficMirrorTargetType]
    val `network-load-balancer` = "network-load-balancer".asInstanceOf[TrafficMirrorTargetType]

    val values = js.Object.freeze(js.Array(`network-interface`, `network-load-balancer`))
  }

  @js.native
  sealed trait TrafficType extends js.Any
  object TrafficType extends js.Object {
    val ACCEPT = "ACCEPT".asInstanceOf[TrafficType]
    val REJECT = "REJECT".asInstanceOf[TrafficType]
    val ALL    = "ALL".asInstanceOf[TrafficType]

    val values = js.Object.freeze(js.Array(ACCEPT, REJECT, ALL))
  }

  /**
    * Describes a transit gateway.
    */
  @js.native
  @Factory
  trait TransitGateway extends js.Object {
    var CreationTime: js.UndefOr[DateTime]
    var Description: js.UndefOr[String]
    var Options: js.UndefOr[TransitGatewayOptions]
    var OwnerId: js.UndefOr[String]
    var State: js.UndefOr[TransitGatewayState]
    var Tags: js.UndefOr[TagList]
    var TransitGatewayArn: js.UndefOr[String]
    var TransitGatewayId: js.UndefOr[String]
  }

  /**
    * Describes an association between a resource attachment and a transit gateway route table.
    */
  @js.native
  @Factory
  trait TransitGatewayAssociation extends js.Object {
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType]
    var State: js.UndefOr[TransitGatewayAssociationState]
    var TransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId]
    var TransitGatewayRouteTableId: js.UndefOr[TransitGatewayRouteTableId]
  }

  @js.native
  sealed trait TransitGatewayAssociationState extends js.Any
  object TransitGatewayAssociationState extends js.Object {
    val associating    = "associating".asInstanceOf[TransitGatewayAssociationState]
    val associated     = "associated".asInstanceOf[TransitGatewayAssociationState]
    val disassociating = "disassociating".asInstanceOf[TransitGatewayAssociationState]
    val disassociated  = "disassociated".asInstanceOf[TransitGatewayAssociationState]

    val values = js.Object.freeze(js.Array(associating, associated, disassociating, disassociated))
  }

  /**
    * Describes an attachment between a resource and a transit gateway.
    */
  @js.native
  @Factory
  trait TransitGatewayAttachment extends js.Object {
    var Association: js.UndefOr[TransitGatewayAttachmentAssociation]
    var CreationTime: js.UndefOr[DateTime]
    var ResourceId: js.UndefOr[String]
    var ResourceOwnerId: js.UndefOr[String]
    var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType]
    var State: js.UndefOr[TransitGatewayAttachmentState]
    var Tags: js.UndefOr[TagList]
    var TransitGatewayAttachmentId: js.UndefOr[String]
    var TransitGatewayId: js.UndefOr[String]
    var TransitGatewayOwnerId: js.UndefOr[String]
  }

  /**
    * Describes an association.
    */
  @js.native
  @Factory
  trait TransitGatewayAttachmentAssociation extends js.Object {
    var State: js.UndefOr[TransitGatewayAssociationState]
    var TransitGatewayRouteTableId: js.UndefOr[String]
  }

  /**
    * Describes a propagation route table.
    */
  @js.native
  @Factory
  trait TransitGatewayAttachmentPropagation extends js.Object {
    var State: js.UndefOr[TransitGatewayPropagationState]
    var TransitGatewayRouteTableId: js.UndefOr[String]
  }

  @js.native
  sealed trait TransitGatewayAttachmentResourceType extends js.Any
  object TransitGatewayAttachmentResourceType extends js.Object {
    val vpc                      = "vpc".asInstanceOf[TransitGatewayAttachmentResourceType]
    val vpn                      = "vpn".asInstanceOf[TransitGatewayAttachmentResourceType]
    val `direct-connect-gateway` = "direct-connect-gateway".asInstanceOf[TransitGatewayAttachmentResourceType]
    val `tgw-peering`            = "tgw-peering".asInstanceOf[TransitGatewayAttachmentResourceType]

    val values = js.Object.freeze(js.Array(vpc, vpn, `direct-connect-gateway`, `tgw-peering`))
  }

  @js.native
  sealed trait TransitGatewayAttachmentState extends js.Any
  object TransitGatewayAttachmentState extends js.Object {
    val initiating        = "initiating".asInstanceOf[TransitGatewayAttachmentState]
    val pendingAcceptance = "pendingAcceptance".asInstanceOf[TransitGatewayAttachmentState]
    val rollingBack       = "rollingBack".asInstanceOf[TransitGatewayAttachmentState]
    val pending           = "pending".asInstanceOf[TransitGatewayAttachmentState]
    val available         = "available".asInstanceOf[TransitGatewayAttachmentState]
    val modifying         = "modifying".asInstanceOf[TransitGatewayAttachmentState]
    val deleting          = "deleting".asInstanceOf[TransitGatewayAttachmentState]
    val deleted           = "deleted".asInstanceOf[TransitGatewayAttachmentState]
    val failed            = "failed".asInstanceOf[TransitGatewayAttachmentState]
    val rejected          = "rejected".asInstanceOf[TransitGatewayAttachmentState]
    val rejecting         = "rejecting".asInstanceOf[TransitGatewayAttachmentState]
    val failing           = "failing".asInstanceOf[TransitGatewayAttachmentState]

    val values = js.Object.freeze(
      js.Array(
        initiating,
        pendingAcceptance,
        rollingBack,
        pending,
        available,
        modifying,
        deleting,
        deleted,
        failed,
        rejected,
        rejecting,
        failing
      )
    )
  }

  @js.native
  sealed trait TransitGatewayMulitcastDomainAssociationState extends js.Any
  object TransitGatewayMulitcastDomainAssociationState extends js.Object {
    val associating    = "associating".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]
    val associated     = "associated".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]
    val disassociating = "disassociating".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]
    val disassociated  = "disassociated".asInstanceOf[TransitGatewayMulitcastDomainAssociationState]

    val values = js.Object.freeze(js.Array(associating, associated, disassociating, disassociated))
  }

  /**
    * Describes the deregistered transit gateway multicast group members.
    */
  @js.native
  @Factory
  trait TransitGatewayMulticastDeregisteredGroupMembers extends js.Object {
    var DeregisteredNetworkInterfaceIds: js.UndefOr[ValueStringList]
    var GroupIpAddress: js.UndefOr[String]
    var TransitGatewayMulticastDomainId: js.UndefOr[String]
  }

  /**
    * Describes the deregistered transit gateway multicast group sources.
    */
  @js.native
  @Factory
  trait TransitGatewayMulticastDeregisteredGroupSources extends js.Object {
    var DeregisteredNetworkInterfaceIds: js.UndefOr[ValueStringList]
    var GroupIpAddress: js.UndefOr[String]
    var TransitGatewayMulticastDomainId: js.UndefOr[String]
  }

  /**
    * Describes the transit gateway multicast domain.
    */
  @js.native
  @Factory
  trait TransitGatewayMulticastDomain extends js.Object {
    var CreationTime: js.UndefOr[DateTime]
    var State: js.UndefOr[TransitGatewayMulticastDomainState]
    var Tags: js.UndefOr[TagList]
    var TransitGatewayId: js.UndefOr[String]
    var TransitGatewayMulticastDomainId: js.UndefOr[String]
  }

  /**
    * Describes the resources associated with the transit gateway multicast domain.
    */
  @js.native
  @Factory
  trait TransitGatewayMulticastDomainAssociation extends js.Object {
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType]
    var Subnet: js.UndefOr[SubnetAssociation]
    var TransitGatewayAttachmentId: js.UndefOr[String]
  }

  /**
    * Describes the multicast domain associations.
    */
  @js.native
  @Factory
  trait TransitGatewayMulticastDomainAssociations extends js.Object {
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType]
    var Subnets: js.UndefOr[SubnetAssociationList]
    var TransitGatewayAttachmentId: js.UndefOr[String]
    var TransitGatewayMulticastDomainId: js.UndefOr[String]
  }

  @js.native
  sealed trait TransitGatewayMulticastDomainState extends js.Any
  object TransitGatewayMulticastDomainState extends js.Object {
    val pending   = "pending".asInstanceOf[TransitGatewayMulticastDomainState]
    val available = "available".asInstanceOf[TransitGatewayMulticastDomainState]
    val deleting  = "deleting".asInstanceOf[TransitGatewayMulticastDomainState]
    val deleted   = "deleted".asInstanceOf[TransitGatewayMulticastDomainState]

    val values = js.Object.freeze(js.Array(pending, available, deleting, deleted))
  }

  /**
    * Describes the transit gateway multicast group resources.
    */
  @js.native
  @Factory
  trait TransitGatewayMulticastGroup extends js.Object {
    var GroupIpAddress: js.UndefOr[String]
    var GroupMember: js.UndefOr[Boolean]
    var GroupSource: js.UndefOr[Boolean]
    var MemberType: js.UndefOr[MembershipType]
    var NetworkInterfaceId: js.UndefOr[String]
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType]
    var SourceType: js.UndefOr[MembershipType]
    var SubnetId: js.UndefOr[String]
    var TransitGatewayAttachmentId: js.UndefOr[String]
  }

  /**
    * Describes the registered transit gateway multicast group members.
    */
  @js.native
  @Factory
  trait TransitGatewayMulticastRegisteredGroupMembers extends js.Object {
    var GroupIpAddress: js.UndefOr[String]
    var RegisteredNetworkInterfaceIds: js.UndefOr[ValueStringList]
    var TransitGatewayMulticastDomainId: js.UndefOr[String]
  }

  /**
    * Describes the members registered with the transit gateway multicast group.
    */
  @js.native
  @Factory
  trait TransitGatewayMulticastRegisteredGroupSources extends js.Object {
    var GroupIpAddress: js.UndefOr[String]
    var RegisteredNetworkInterfaceIds: js.UndefOr[ValueStringList]
    var TransitGatewayMulticastDomainId: js.UndefOr[String]
  }

  /**
    * Describes the options for a transit gateway.
    */
  @js.native
  @Factory
  trait TransitGatewayOptions extends js.Object {
    var AmazonSideAsn: js.UndefOr[Double]
    var AssociationDefaultRouteTableId: js.UndefOr[String]
    var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue]
    var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue]
    var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue]
    var DnsSupport: js.UndefOr[DnsSupportValue]
    var MulticastSupport: js.UndefOr[MulticastSupportValue]
    var PropagationDefaultRouteTableId: js.UndefOr[String]
    var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue]
  }

  /**
    * Describes the transit gateway peering attachment.
    */
  @js.native
  @Factory
  trait TransitGatewayPeeringAttachment extends js.Object {
    var AccepterTgwInfo: js.UndefOr[PeeringTgwInfo]
    var CreationTime: js.UndefOr[DateTime]
    var RequesterTgwInfo: js.UndefOr[PeeringTgwInfo]
    var State: js.UndefOr[TransitGatewayAttachmentState]
    var Status: js.UndefOr[PeeringAttachmentStatus]
    var Tags: js.UndefOr[TagList]
    var TransitGatewayAttachmentId: js.UndefOr[String]
  }

  /**
    * Describes route propagation.
    */
  @js.native
  @Factory
  trait TransitGatewayPropagation extends js.Object {
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType]
    var State: js.UndefOr[TransitGatewayPropagationState]
    var TransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId]
    var TransitGatewayRouteTableId: js.UndefOr[String]
  }

  @js.native
  sealed trait TransitGatewayPropagationState extends js.Any
  object TransitGatewayPropagationState extends js.Object {
    val enabling  = "enabling".asInstanceOf[TransitGatewayPropagationState]
    val enabled   = "enabled".asInstanceOf[TransitGatewayPropagationState]
    val disabling = "disabling".asInstanceOf[TransitGatewayPropagationState]
    val disabled  = "disabled".asInstanceOf[TransitGatewayPropagationState]

    val values = js.Object.freeze(js.Array(enabling, enabled, disabling, disabled))
  }

  /**
    * Describes the options for a transit gateway.
    */
  @js.native
  @Factory
  trait TransitGatewayRequestOptions extends js.Object {
    var AmazonSideAsn: js.UndefOr[Double]
    var AutoAcceptSharedAttachments: js.UndefOr[AutoAcceptSharedAttachmentsValue]
    var DefaultRouteTableAssociation: js.UndefOr[DefaultRouteTableAssociationValue]
    var DefaultRouteTablePropagation: js.UndefOr[DefaultRouteTablePropagationValue]
    var DnsSupport: js.UndefOr[DnsSupportValue]
    var MulticastSupport: js.UndefOr[MulticastSupportValue]
    var VpnEcmpSupport: js.UndefOr[VpnEcmpSupportValue]
  }

  /**
    * Describes a route for a transit gateway route table.
    */
  @js.native
  @Factory
  trait TransitGatewayRoute extends js.Object {
    var DestinationCidrBlock: js.UndefOr[String]
    var State: js.UndefOr[TransitGatewayRouteState]
    var TransitGatewayAttachments: js.UndefOr[TransitGatewayRouteAttachmentList]
    var Type: js.UndefOr[TransitGatewayRouteType]
  }

  /**
    * Describes a route attachment.
    */
  @js.native
  @Factory
  trait TransitGatewayRouteAttachment extends js.Object {
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType]
    var TransitGatewayAttachmentId: js.UndefOr[String]
  }

  @js.native
  sealed trait TransitGatewayRouteState extends js.Any
  object TransitGatewayRouteState extends js.Object {
    val pending   = "pending".asInstanceOf[TransitGatewayRouteState]
    val active    = "active".asInstanceOf[TransitGatewayRouteState]
    val blackhole = "blackhole".asInstanceOf[TransitGatewayRouteState]
    val deleting  = "deleting".asInstanceOf[TransitGatewayRouteState]
    val deleted   = "deleted".asInstanceOf[TransitGatewayRouteState]

    val values = js.Object.freeze(js.Array(pending, active, blackhole, deleting, deleted))
  }

  /**
    * Describes a transit gateway route table.
    */
  @js.native
  @Factory
  trait TransitGatewayRouteTable extends js.Object {
    var CreationTime: js.UndefOr[DateTime]
    var DefaultAssociationRouteTable: js.UndefOr[Boolean]
    var DefaultPropagationRouteTable: js.UndefOr[Boolean]
    var State: js.UndefOr[TransitGatewayRouteTableState]
    var Tags: js.UndefOr[TagList]
    var TransitGatewayId: js.UndefOr[String]
    var TransitGatewayRouteTableId: js.UndefOr[String]
  }

  /**
    * Describes an association between a route table and a resource attachment.
    */
  @js.native
  @Factory
  trait TransitGatewayRouteTableAssociation extends js.Object {
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType]
    var State: js.UndefOr[TransitGatewayAssociationState]
    var TransitGatewayAttachmentId: js.UndefOr[String]
  }

  /**
    * Describes a route table propagation.
    */
  @js.native
  @Factory
  trait TransitGatewayRouteTablePropagation extends js.Object {
    var ResourceId: js.UndefOr[String]
    var ResourceType: js.UndefOr[TransitGatewayAttachmentResourceType]
    var State: js.UndefOr[TransitGatewayPropagationState]
    var TransitGatewayAttachmentId: js.UndefOr[String]
  }

  @js.native
  sealed trait TransitGatewayRouteTableState extends js.Any
  object TransitGatewayRouteTableState extends js.Object {
    val pending   = "pending".asInstanceOf[TransitGatewayRouteTableState]
    val available = "available".asInstanceOf[TransitGatewayRouteTableState]
    val deleting  = "deleting".asInstanceOf[TransitGatewayRouteTableState]
    val deleted   = "deleted".asInstanceOf[TransitGatewayRouteTableState]

    val values = js.Object.freeze(js.Array(pending, available, deleting, deleted))
  }

  @js.native
  sealed trait TransitGatewayRouteType extends js.Any
  object TransitGatewayRouteType extends js.Object {
    val static     = "static".asInstanceOf[TransitGatewayRouteType]
    val propagated = "propagated".asInstanceOf[TransitGatewayRouteType]

    val values = js.Object.freeze(js.Array(static, propagated))
  }

  @js.native
  sealed trait TransitGatewayState extends js.Any
  object TransitGatewayState extends js.Object {
    val pending   = "pending".asInstanceOf[TransitGatewayState]
    val available = "available".asInstanceOf[TransitGatewayState]
    val modifying = "modifying".asInstanceOf[TransitGatewayState]
    val deleting  = "deleting".asInstanceOf[TransitGatewayState]
    val deleted   = "deleted".asInstanceOf[TransitGatewayState]

    val values = js.Object.freeze(js.Array(pending, available, modifying, deleting, deleted))
  }

  /**
    * Describes a VPC attachment.
    */
  @js.native
  @Factory
  trait TransitGatewayVpcAttachment extends js.Object {
    var CreationTime: js.UndefOr[DateTime]
    var Options: js.UndefOr[TransitGatewayVpcAttachmentOptions]
    var State: js.UndefOr[TransitGatewayAttachmentState]
    var SubnetIds: js.UndefOr[ValueStringList]
    var Tags: js.UndefOr[TagList]
    var TransitGatewayAttachmentId: js.UndefOr[String]
    var TransitGatewayId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
    var VpcOwnerId: js.UndefOr[String]
  }

  /**
    * Describes the VPC attachment options.
    */
  @js.native
  @Factory
  trait TransitGatewayVpcAttachmentOptions extends js.Object {
    var DnsSupport: js.UndefOr[DnsSupportValue]
    var Ipv6Support: js.UndefOr[Ipv6SupportValue]
  }

  @js.native
  sealed trait TransportProtocol extends js.Any
  object TransportProtocol extends js.Object {
    val tcp = "tcp".asInstanceOf[TransportProtocol]
    val udp = "udp".asInstanceOf[TransportProtocol]

    val values = js.Object.freeze(js.Array(tcp, udp))
  }

  /**
    * The VPN tunnel options.
    */
  @js.native
  @Factory
  trait TunnelOption extends js.Object {
    var DpdTimeoutSeconds: js.UndefOr[Int]
    var IkeVersions: js.UndefOr[IKEVersionsList]
    var OutsideIpAddress: js.UndefOr[String]
    var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersList]
    var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsList]
    var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsList]
    var Phase1LifetimeSeconds: js.UndefOr[Int]
    var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersList]
    var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsList]
    var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsList]
    var Phase2LifetimeSeconds: js.UndefOr[Int]
    var PreSharedKey: js.UndefOr[String]
    var RekeyFuzzPercentage: js.UndefOr[Int]
    var RekeyMarginTimeSeconds: js.UndefOr[Int]
    var ReplayWindowSize: js.UndefOr[Int]
    var TunnelInsideCidr: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UnassignIpv6AddressesRequest extends js.Object {
    var Ipv6Addresses: Ipv6AddressList
    var NetworkInterfaceId: NetworkInterfaceId
  }

  @js.native
  @Factory
  trait UnassignIpv6AddressesResult extends js.Object {
    var NetworkInterfaceId: js.UndefOr[String]
    var UnassignedIpv6Addresses: js.UndefOr[Ipv6AddressList]
  }

  /**
    * Contains the parameters for UnassignPrivateIpAddresses.
    */
  @js.native
  @Factory
  trait UnassignPrivateIpAddressesRequest extends js.Object {
    var NetworkInterfaceId: NetworkInterfaceId
    var PrivateIpAddresses: PrivateIpAddressStringList
  }

  @js.native
  sealed trait UnlimitedSupportedInstanceFamily extends js.Any
  object UnlimitedSupportedInstanceFamily extends js.Object {
    val t2  = "t2".asInstanceOf[UnlimitedSupportedInstanceFamily]
    val t3  = "t3".asInstanceOf[UnlimitedSupportedInstanceFamily]
    val t3a = "t3a".asInstanceOf[UnlimitedSupportedInstanceFamily]

    val values = js.Object.freeze(js.Array(t2, t3, t3a))
  }

  @js.native
  @Factory
  trait UnmonitorInstancesRequest extends js.Object {
    var InstanceIds: InstanceIdStringList
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UnmonitorInstancesResult extends js.Object {
    var InstanceMonitorings: js.UndefOr[InstanceMonitoringList]
  }

  @js.native
  sealed trait UnsuccessfulInstanceCreditSpecificationErrorCode extends js.Any
  object UnsuccessfulInstanceCreditSpecificationErrorCode extends js.Object {
    val `InvalidInstanceID.Malformed` =
      "InvalidInstanceID.Malformed".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]
    val `InvalidInstanceID.NotFound` =
      "InvalidInstanceID.NotFound".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]
    val IncorrectInstanceState = "IncorrectInstanceState".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]
    val `InstanceCreditSpecification.NotSupported` =
      "InstanceCreditSpecification.NotSupported".asInstanceOf[UnsuccessfulInstanceCreditSpecificationErrorCode]

    val values = js.Object.freeze(
      js.Array(
        `InvalidInstanceID.Malformed`,
        `InvalidInstanceID.NotFound`,
        IncorrectInstanceState,
        `InstanceCreditSpecification.NotSupported`
      )
    )
  }

  /**
    * Describes the burstable performance instance whose credit option for CPU usage was not modified.
    */
  @js.native
  @Factory
  trait UnsuccessfulInstanceCreditSpecificationItem extends js.Object {
    var Error: js.UndefOr[UnsuccessfulInstanceCreditSpecificationItemError]
    var InstanceId: js.UndefOr[String]
  }

  /**
    * Information about the error for the burstable performance instance whose credit option for CPU usage was not modified.
    */
  @js.native
  @Factory
  trait UnsuccessfulInstanceCreditSpecificationItemError extends js.Object {
    var Code: js.UndefOr[UnsuccessfulInstanceCreditSpecificationErrorCode]
    var Message: js.UndefOr[String]
  }

  /**
    * Information about items that were not successfully processed in a batch call.
    */
  @js.native
  @Factory
  trait UnsuccessfulItem extends js.Object {
    var Error: js.UndefOr[UnsuccessfulItemError]
    var ResourceId: js.UndefOr[String]
  }

  /**
    * Information about the error that occurred. For more information about errors, see [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html|Error Codes]].
    */
  @js.native
  @Factory
  trait UnsuccessfulItemError extends js.Object {
    var Code: js.UndefOr[String]
    var Message: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateSecurityGroupRuleDescriptionsEgressRequest extends js.Object {
    var IpPermissions: IpPermissionList
    var DryRun: js.UndefOr[Boolean]
    var GroupId: js.UndefOr[SecurityGroupId]
    var GroupName: js.UndefOr[SecurityGroupName]
  }

  @js.native
  @Factory
  trait UpdateSecurityGroupRuleDescriptionsEgressResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpdateSecurityGroupRuleDescriptionsIngressRequest extends js.Object {
    var IpPermissions: IpPermissionList
    var DryRun: js.UndefOr[Boolean]
    var GroupId: js.UndefOr[SecurityGroupId]
    var GroupName: js.UndefOr[SecurityGroupName]
  }

  @js.native
  @Factory
  trait UpdateSecurityGroupRuleDescriptionsIngressResult extends js.Object {
    var Return: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait UsageClassType extends js.Any
  object UsageClassType extends js.Object {
    val spot        = "spot".asInstanceOf[UsageClassType]
    val `on-demand` = "on-demand".asInstanceOf[UsageClassType]

    val values = js.Object.freeze(js.Array(spot, `on-demand`))
  }

  /**
    * Describes the S3 bucket for the disk image.
    */
  @js.native
  @Factory
  trait UserBucket extends js.Object {
    var S3Bucket: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
  }

  /**
    * Describes the S3 bucket for the disk image.
    */
  @js.native
  @Factory
  trait UserBucketDetails extends js.Object {
    var S3Bucket: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
  }

  /**
    * Describes the user data for an instance.
    */
  @js.native
  @Factory
  trait UserData extends js.Object {
    var Data: js.UndefOr[String]
  }

  /**
    * Describes a security group and AWS account ID pair.
    */
  @js.native
  @Factory
  trait UserIdGroupPair extends js.Object {
    var Description: js.UndefOr[String]
    var GroupId: js.UndefOr[String]
    var GroupName: js.UndefOr[String]
    var PeeringStatus: js.UndefOr[String]
    var UserId: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
    var VpcPeeringConnectionId: js.UndefOr[String]
  }

  /**
    * Describes the vCPU configurations for the instance type.
    */
  @js.native
  @Factory
  trait VCpuInfo extends js.Object {
    var DefaultCores: js.UndefOr[CoreCount]
    var DefaultThreadsPerCore: js.UndefOr[ThreadsPerCore]
    var DefaultVCpus: js.UndefOr[VCpuCount]
    var ValidCores: js.UndefOr[CoreCountList]
    var ValidThreadsPerCore: js.UndefOr[ThreadsPerCoreList]
  }

  /**
    * Describes telemetry for a VPN tunnel.
    */
  @js.native
  @Factory
  trait VgwTelemetry extends js.Object {
    var AcceptedRouteCount: js.UndefOr[Int]
    var CertificateArn: js.UndefOr[String]
    var LastStatusChange: js.UndefOr[DateTime]
    var OutsideIpAddress: js.UndefOr[String]
    var Status: js.UndefOr[TelemetryStatus]
    var StatusMessage: js.UndefOr[String]
  }

  @js.native
  sealed trait VirtualizationType extends js.Any
  object VirtualizationType extends js.Object {
    val hvm         = "hvm".asInstanceOf[VirtualizationType]
    val paravirtual = "paravirtual".asInstanceOf[VirtualizationType]

    val values = js.Object.freeze(js.Array(hvm, paravirtual))
  }

  /**
    * Describes a volume.
    */
  @js.native
  @Factory
  trait Volume extends js.Object {
    var Attachments: js.UndefOr[VolumeAttachmentList]
    var AvailabilityZone: js.UndefOr[String]
    var CreateTime: js.UndefOr[DateTime]
    var Encrypted: js.UndefOr[Boolean]
    var FastRestored: js.UndefOr[Boolean]
    var Iops: js.UndefOr[Int]
    var KmsKeyId: js.UndefOr[String]
    var MultiAttachEnabled: js.UndefOr[Boolean]
    var OutpostArn: js.UndefOr[String]
    var Size: js.UndefOr[Int]
    var SnapshotId: js.UndefOr[String]
    var State: js.UndefOr[VolumeState]
    var Tags: js.UndefOr[TagList]
    var VolumeId: js.UndefOr[String]
    var VolumeType: js.UndefOr[VolumeType]
  }

  /**
    * Describes volume attachment details.
    */
  @js.native
  @Factory
  trait VolumeAttachment extends js.Object {
    var AttachTime: js.UndefOr[DateTime]
    var DeleteOnTermination: js.UndefOr[Boolean]
    var Device: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var State: js.UndefOr[VolumeAttachmentState]
    var VolumeId: js.UndefOr[String]
  }

  @js.native
  sealed trait VolumeAttachmentState extends js.Any
  object VolumeAttachmentState extends js.Object {
    val attaching = "attaching".asInstanceOf[VolumeAttachmentState]
    val attached  = "attached".asInstanceOf[VolumeAttachmentState]
    val detaching = "detaching".asInstanceOf[VolumeAttachmentState]
    val detached  = "detached".asInstanceOf[VolumeAttachmentState]
    val busy      = "busy".asInstanceOf[VolumeAttachmentState]

    val values = js.Object.freeze(js.Array(attaching, attached, detaching, detached, busy))
  }

  @js.native
  sealed trait VolumeAttributeName extends js.Any
  object VolumeAttributeName extends js.Object {
    val autoEnableIO = "autoEnableIO".asInstanceOf[VolumeAttributeName]
    val productCodes = "productCodes".asInstanceOf[VolumeAttributeName]

    val values = js.Object.freeze(js.Array(autoEnableIO, productCodes))
  }

  /**
    * Describes an EBS volume.
    */
  @js.native
  @Factory
  trait VolumeDetail extends js.Object {
    var Size: Double
  }

  /**
    * Describes the modification status of an EBS volume.
    *  If the volume has never been modified, some element values will be null.
    */
  @js.native
  @Factory
  trait VolumeModification extends js.Object {
    var EndTime: js.UndefOr[DateTime]
    var ModificationState: js.UndefOr[VolumeModificationState]
    var OriginalIops: js.UndefOr[Int]
    var OriginalSize: js.UndefOr[Int]
    var OriginalVolumeType: js.UndefOr[VolumeType]
    var Progress: js.UndefOr[Double]
    var StartTime: js.UndefOr[DateTime]
    var StatusMessage: js.UndefOr[String]
    var TargetIops: js.UndefOr[Int]
    var TargetSize: js.UndefOr[Int]
    var TargetVolumeType: js.UndefOr[VolumeType]
    var VolumeId: js.UndefOr[String]
  }

  @js.native
  sealed trait VolumeModificationState extends js.Any
  object VolumeModificationState extends js.Object {
    val modifying  = "modifying".asInstanceOf[VolumeModificationState]
    val optimizing = "optimizing".asInstanceOf[VolumeModificationState]
    val completed  = "completed".asInstanceOf[VolumeModificationState]
    val failed     = "failed".asInstanceOf[VolumeModificationState]

    val values = js.Object.freeze(js.Array(modifying, optimizing, completed, failed))
  }

  @js.native
  sealed trait VolumeState extends js.Any
  object VolumeState extends js.Object {
    val creating  = "creating".asInstanceOf[VolumeState]
    val available = "available".asInstanceOf[VolumeState]
    val `in-use`  = "in-use".asInstanceOf[VolumeState]
    val deleting  = "deleting".asInstanceOf[VolumeState]
    val deleted   = "deleted".asInstanceOf[VolumeState]
    val error     = "error".asInstanceOf[VolumeState]

    val values = js.Object.freeze(js.Array(creating, available, `in-use`, deleting, deleted, error))
  }

  /**
    * Describes a volume status operation code.
    */
  @js.native
  @Factory
  trait VolumeStatusAction extends js.Object {
    var Code: js.UndefOr[String]
    var Description: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var EventType: js.UndefOr[String]
  }

  /**
    * Information about the instances to which the volume is attached.
    */
  @js.native
  @Factory
  trait VolumeStatusAttachmentStatus extends js.Object {
    var InstanceId: js.UndefOr[String]
    var IoPerformance: js.UndefOr[String]
  }

  /**
    * Describes a volume status.
    */
  @js.native
  @Factory
  trait VolumeStatusDetails extends js.Object {
    var Name: js.UndefOr[VolumeStatusName]
    var Status: js.UndefOr[String]
  }

  /**
    * Describes a volume status event.
    */
  @js.native
  @Factory
  trait VolumeStatusEvent extends js.Object {
    var Description: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var EventType: js.UndefOr[String]
    var InstanceId: js.UndefOr[String]
    var NotAfter: js.UndefOr[MillisecondDateTime]
    var NotBefore: js.UndefOr[MillisecondDateTime]
  }

  /**
    * Describes the status of a volume.
    */
  @js.native
  @Factory
  trait VolumeStatusInfo extends js.Object {
    var Details: js.UndefOr[VolumeStatusDetailsList]
    var Status: js.UndefOr[VolumeStatusInfoStatus]
  }

  @js.native
  sealed trait VolumeStatusInfoStatus extends js.Any
  object VolumeStatusInfoStatus extends js.Object {
    val ok                  = "ok".asInstanceOf[VolumeStatusInfoStatus]
    val impaired            = "impaired".asInstanceOf[VolumeStatusInfoStatus]
    val `insufficient-data` = "insufficient-data".asInstanceOf[VolumeStatusInfoStatus]

    val values = js.Object.freeze(js.Array(ok, impaired, `insufficient-data`))
  }

  /**
    * Describes the volume status.
    */
  @js.native
  @Factory
  trait VolumeStatusItem extends js.Object {
    var Actions: js.UndefOr[VolumeStatusActionsList]
    var AttachmentStatuses: js.UndefOr[VolumeStatusAttachmentStatusList]
    var AvailabilityZone: js.UndefOr[String]
    var Events: js.UndefOr[VolumeStatusEventsList]
    var OutpostArn: js.UndefOr[String]
    var VolumeId: js.UndefOr[String]
    var VolumeStatus: js.UndefOr[VolumeStatusInfo]
  }

  @js.native
  sealed trait VolumeStatusName extends js.Any
  object VolumeStatusName extends js.Object {
    val `io-enabled`     = "io-enabled".asInstanceOf[VolumeStatusName]
    val `io-performance` = "io-performance".asInstanceOf[VolumeStatusName]

    val values = js.Object.freeze(js.Array(`io-enabled`, `io-performance`))
  }

  @js.native
  sealed trait VolumeType extends js.Any
  object VolumeType extends js.Object {
    val standard = "standard".asInstanceOf[VolumeType]
    val io1      = "io1".asInstanceOf[VolumeType]
    val gp2      = "gp2".asInstanceOf[VolumeType]
    val sc1      = "sc1".asInstanceOf[VolumeType]
    val st1      = "st1".asInstanceOf[VolumeType]

    val values = js.Object.freeze(js.Array(standard, io1, gp2, sc1, st1))
  }

  /**
    * Describes a VPC.
    */
  @js.native
  @Factory
  trait Vpc extends js.Object {
    var CidrBlock: js.UndefOr[String]
    var CidrBlockAssociationSet: js.UndefOr[VpcCidrBlockAssociationSet]
    var DhcpOptionsId: js.UndefOr[String]
    var InstanceTenancy: js.UndefOr[Tenancy]
    var Ipv6CidrBlockAssociationSet: js.UndefOr[VpcIpv6CidrBlockAssociationSet]
    var IsDefault: js.UndefOr[Boolean]
    var OwnerId: js.UndefOr[String]
    var State: js.UndefOr[VpcState]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes an attachment between a virtual private gateway and a VPC.
    */
  @js.native
  @Factory
  trait VpcAttachment extends js.Object {
    var State: js.UndefOr[AttachmentStatus]
    var VpcId: js.UndefOr[String]
  }

  @js.native
  sealed trait VpcAttributeName extends js.Any
  object VpcAttributeName extends js.Object {
    val enableDnsSupport   = "enableDnsSupport".asInstanceOf[VpcAttributeName]
    val enableDnsHostnames = "enableDnsHostnames".asInstanceOf[VpcAttributeName]

    val values = js.Object.freeze(js.Array(enableDnsSupport, enableDnsHostnames))
  }

  /**
    * Describes an IPv4 CIDR block associated with a VPC.
    */
  @js.native
  @Factory
  trait VpcCidrBlockAssociation extends js.Object {
    var AssociationId: js.UndefOr[String]
    var CidrBlock: js.UndefOr[String]
    var CidrBlockState: js.UndefOr[VpcCidrBlockState]
  }

  /**
    * Describes the state of a CIDR block.
    */
  @js.native
  @Factory
  trait VpcCidrBlockState extends js.Object {
    var State: js.UndefOr[VpcCidrBlockStateCode]
    var StatusMessage: js.UndefOr[String]
  }

  @js.native
  sealed trait VpcCidrBlockStateCode extends js.Any
  object VpcCidrBlockStateCode extends js.Object {
    val associating    = "associating".asInstanceOf[VpcCidrBlockStateCode]
    val associated     = "associated".asInstanceOf[VpcCidrBlockStateCode]
    val disassociating = "disassociating".asInstanceOf[VpcCidrBlockStateCode]
    val disassociated  = "disassociated".asInstanceOf[VpcCidrBlockStateCode]
    val failing        = "failing".asInstanceOf[VpcCidrBlockStateCode]
    val failed         = "failed".asInstanceOf[VpcCidrBlockStateCode]

    val values = js.Object.freeze(js.Array(associating, associated, disassociating, disassociated, failing, failed))
  }

  /**
    * Describes whether a VPC is enabled for ClassicLink.
    */
  @js.native
  @Factory
  trait VpcClassicLink extends js.Object {
    var ClassicLinkEnabled: js.UndefOr[Boolean]
    var Tags: js.UndefOr[TagList]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes a VPC endpoint.
    */
  @js.native
  @Factory
  trait VpcEndpoint extends js.Object {
    var CreationTimestamp: js.UndefOr[MillisecondDateTime]
    var DnsEntries: js.UndefOr[DnsEntrySet]
    var Groups: js.UndefOr[GroupIdentifierSet]
    var LastError: js.UndefOr[LastError]
    var NetworkInterfaceIds: js.UndefOr[ValueStringList]
    var OwnerId: js.UndefOr[String]
    var PolicyDocument: js.UndefOr[String]
    var PrivateDnsEnabled: js.UndefOr[Boolean]
    var RequesterManaged: js.UndefOr[Boolean]
    var RouteTableIds: js.UndefOr[ValueStringList]
    var ServiceName: js.UndefOr[String]
    var State: js.UndefOr[State]
    var SubnetIds: js.UndefOr[ValueStringList]
    var Tags: js.UndefOr[TagList]
    var VpcEndpointId: js.UndefOr[String]
    var VpcEndpointType: js.UndefOr[VpcEndpointType]
    var VpcId: js.UndefOr[String]
  }

  /**
    * Describes a VPC endpoint connection to a service.
    */
  @js.native
  @Factory
  trait VpcEndpointConnection extends js.Object {
    var CreationTimestamp: js.UndefOr[MillisecondDateTime]
    var DnsEntries: js.UndefOr[DnsEntrySet]
    var NetworkLoadBalancerArns: js.UndefOr[ValueStringList]
    var ServiceId: js.UndefOr[String]
    var VpcEndpointId: js.UndefOr[String]
    var VpcEndpointOwner: js.UndefOr[String]
    var VpcEndpointState: js.UndefOr[State]
  }

  @js.native
  sealed trait VpcEndpointType extends js.Any
  object VpcEndpointType extends js.Object {
    val Interface = "Interface".asInstanceOf[VpcEndpointType]
    val Gateway   = "Gateway".asInstanceOf[VpcEndpointType]

    val values = js.Object.freeze(js.Array(Interface, Gateway))
  }

  /**
    * Describes an IPv6 CIDR block associated with a VPC.
    */
  @js.native
  @Factory
  trait VpcIpv6CidrBlockAssociation extends js.Object {
    var AssociationId: js.UndefOr[String]
    var Ipv6CidrBlock: js.UndefOr[String]
    var Ipv6CidrBlockState: js.UndefOr[VpcCidrBlockState]
    var Ipv6Pool: js.UndefOr[String]
    var NetworkBorderGroup: js.UndefOr[String]
  }

  /**
    * Describes a VPC peering connection.
    */
  @js.native
  @Factory
  trait VpcPeeringConnection extends js.Object {
    var AccepterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo]
    var ExpirationTime: js.UndefOr[DateTime]
    var RequesterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo]
    var Status: js.UndefOr[VpcPeeringConnectionStateReason]
    var Tags: js.UndefOr[TagList]
    var VpcPeeringConnectionId: js.UndefOr[String]
  }

  /**
    * Describes the VPC peering connection options.
    */
  @js.native
  @Factory
  trait VpcPeeringConnectionOptionsDescription extends js.Object {
    var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean]
    var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean]
  }

  /**
    * Describes the status of a VPC peering connection.
    */
  @js.native
  @Factory
  trait VpcPeeringConnectionStateReason extends js.Object {
    var Code: js.UndefOr[VpcPeeringConnectionStateReasonCode]
    var Message: js.UndefOr[String]
  }

  @js.native
  sealed trait VpcPeeringConnectionStateReasonCode extends js.Any
  object VpcPeeringConnectionStateReasonCode extends js.Object {
    val `initiating-request` = "initiating-request".asInstanceOf[VpcPeeringConnectionStateReasonCode]
    val `pending-acceptance` = "pending-acceptance".asInstanceOf[VpcPeeringConnectionStateReasonCode]
    val active               = "active".asInstanceOf[VpcPeeringConnectionStateReasonCode]
    val deleted              = "deleted".asInstanceOf[VpcPeeringConnectionStateReasonCode]
    val rejected             = "rejected".asInstanceOf[VpcPeeringConnectionStateReasonCode]
    val failed               = "failed".asInstanceOf[VpcPeeringConnectionStateReasonCode]
    val expired              = "expired".asInstanceOf[VpcPeeringConnectionStateReasonCode]
    val provisioning         = "provisioning".asInstanceOf[VpcPeeringConnectionStateReasonCode]
    val deleting             = "deleting".asInstanceOf[VpcPeeringConnectionStateReasonCode]

    val values = js.Object.freeze(
      js.Array(
        `initiating-request`,
        `pending-acceptance`,
        active,
        deleted,
        rejected,
        failed,
        expired,
        provisioning,
        deleting
      )
    )
  }

  /**
    * Describes a VPC in a VPC peering connection.
    */
  @js.native
  @Factory
  trait VpcPeeringConnectionVpcInfo extends js.Object {
    var CidrBlock: js.UndefOr[String]
    var CidrBlockSet: js.UndefOr[CidrBlockSet]
    var Ipv6CidrBlockSet: js.UndefOr[Ipv6CidrBlockSet]
    var OwnerId: js.UndefOr[String]
    var PeeringOptions: js.UndefOr[VpcPeeringConnectionOptionsDescription]
    var Region: js.UndefOr[String]
    var VpcId: js.UndefOr[String]
  }

  @js.native
  sealed trait VpcState extends js.Any
  object VpcState extends js.Object {
    val pending   = "pending".asInstanceOf[VpcState]
    val available = "available".asInstanceOf[VpcState]

    val values = js.Object.freeze(js.Array(pending, available))
  }

  @js.native
  sealed trait VpcTenancy extends js.Any
  object VpcTenancy extends js.Object {
    val default = "default".asInstanceOf[VpcTenancy]

    val values = js.Object.freeze(js.Array(default))
  }

  /**
    * Describes a VPN connection.
    */
  @js.native
  @Factory
  trait VpnConnection extends js.Object {
    var Category: js.UndefOr[String]
    var CustomerGatewayConfiguration: js.UndefOr[String]
    var CustomerGatewayId: js.UndefOr[String]
    var Options: js.UndefOr[VpnConnectionOptions]
    var Routes: js.UndefOr[VpnStaticRouteList]
    var State: js.UndefOr[VpnState]
    var Tags: js.UndefOr[TagList]
    var TransitGatewayId: js.UndefOr[String]
    var Type: js.UndefOr[GatewayType]
    var VgwTelemetry: js.UndefOr[VgwTelemetryList]
    var VpnConnectionId: js.UndefOr[String]
    var VpnGatewayId: js.UndefOr[String]
  }

  /**
    * Describes VPN connection options.
    */
  @js.native
  @Factory
  trait VpnConnectionOptions extends js.Object {
    var EnableAcceleration: js.UndefOr[Boolean]
    var StaticRoutesOnly: js.UndefOr[Boolean]
    var TunnelOptions: js.UndefOr[TunnelOptionsList]
  }

  /**
    * Describes VPN connection options.
    */
  @js.native
  @Factory
  trait VpnConnectionOptionsSpecification extends js.Object {
    var EnableAcceleration: js.UndefOr[Boolean]
    var StaticRoutesOnly: js.UndefOr[Boolean]
    var TunnelOptions: js.UndefOr[VpnTunnelOptionsSpecificationsList]
  }

  @js.native
  sealed trait VpnEcmpSupportValue extends js.Any
  object VpnEcmpSupportValue extends js.Object {
    val enable  = "enable".asInstanceOf[VpnEcmpSupportValue]
    val disable = "disable".asInstanceOf[VpnEcmpSupportValue]

    val values = js.Object.freeze(js.Array(enable, disable))
  }

  /**
    * Describes a virtual private gateway.
    */
  @js.native
  @Factory
  trait VpnGateway extends js.Object {
    var AmazonSideAsn: js.UndefOr[Double]
    var AvailabilityZone: js.UndefOr[String]
    var State: js.UndefOr[VpnState]
    var Tags: js.UndefOr[TagList]
    var Type: js.UndefOr[GatewayType]
    var VpcAttachments: js.UndefOr[VpcAttachmentList]
    var VpnGatewayId: js.UndefOr[String]
  }

  @js.native
  sealed trait VpnProtocol extends js.Any
  object VpnProtocol extends js.Object {
    val openvpn = "openvpn".asInstanceOf[VpnProtocol]

    val values = js.Object.freeze(js.Array(openvpn))
  }

  @js.native
  sealed trait VpnState extends js.Any
  object VpnState extends js.Object {
    val pending   = "pending".asInstanceOf[VpnState]
    val available = "available".asInstanceOf[VpnState]
    val deleting  = "deleting".asInstanceOf[VpnState]
    val deleted   = "deleted".asInstanceOf[VpnState]

    val values = js.Object.freeze(js.Array(pending, available, deleting, deleted))
  }

  /**
    * Describes a static route for a VPN connection.
    */
  @js.native
  @Factory
  trait VpnStaticRoute extends js.Object {
    var DestinationCidrBlock: js.UndefOr[String]
    var Source: js.UndefOr[VpnStaticRouteSource]
    var State: js.UndefOr[VpnState]
  }

  @js.native
  sealed trait VpnStaticRouteSource extends js.Any
  object VpnStaticRouteSource extends js.Object {
    val Static = "Static".asInstanceOf[VpnStaticRouteSource]

    val values = js.Object.freeze(js.Array(Static))
  }

  /**
    * The tunnel options for a single VPN tunnel.
    */
  @js.native
  @Factory
  trait VpnTunnelOptionsSpecification extends js.Object {
    var DPDTimeoutSeconds: js.UndefOr[Int]
    var IKEVersions: js.UndefOr[IKEVersionsRequestList]
    var Phase1DHGroupNumbers: js.UndefOr[Phase1DHGroupNumbersRequestList]
    var Phase1EncryptionAlgorithms: js.UndefOr[Phase1EncryptionAlgorithmsRequestList]
    var Phase1IntegrityAlgorithms: js.UndefOr[Phase1IntegrityAlgorithmsRequestList]
    var Phase1LifetimeSeconds: js.UndefOr[Int]
    var Phase2DHGroupNumbers: js.UndefOr[Phase2DHGroupNumbersRequestList]
    var Phase2EncryptionAlgorithms: js.UndefOr[Phase2EncryptionAlgorithmsRequestList]
    var Phase2IntegrityAlgorithms: js.UndefOr[Phase2IntegrityAlgorithmsRequestList]
    var Phase2LifetimeSeconds: js.UndefOr[Int]
    var PreSharedKey: js.UndefOr[String]
    var RekeyFuzzPercentage: js.UndefOr[Int]
    var RekeyMarginTimeSeconds: js.UndefOr[Int]
    var ReplayWindowSize: js.UndefOr[Int]
    var TunnelInsideCidr: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait WithdrawByoipCidrRequest extends js.Object {
    var Cidr: String
    var DryRun: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait WithdrawByoipCidrResult extends js.Object {
    var ByoipCidr: js.UndefOr[ByoipCidr]
  }

  @js.native
  sealed trait scope extends js.Any
  object scope extends js.Object {
    val `Availability Zone` = "Availability Zone".asInstanceOf[scope]
    val Region              = "Region".asInstanceOf[scope]

    val values = js.Object.freeze(js.Array(`Availability Zone`, Region))
  }
}
