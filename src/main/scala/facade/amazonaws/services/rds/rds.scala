package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object rds {
  type AccountQuotaList = js.Array[AccountQuota]
  type ApplyMethod = String
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type BooleanOptional = Boolean
  type CertificateList = js.Array[Certificate]
  type DBEngineVersionList = js.Array[DBEngineVersion]
  type DBInstanceList = js.Array[DBInstance]
  type DBInstanceStatusInfoList = js.Array[DBInstanceStatusInfo]
  type DBParameterGroupList = js.Array[DBParameterGroup]
  type DBParameterGroupStatusList = js.Array[DBParameterGroupStatus]
  type DBSecurityGroupMembershipList = js.Array[DBSecurityGroupMembership]
  type DBSecurityGroupNameList = js.Array[String]
  type DBSecurityGroups = js.Array[DBSecurityGroup]
  type DBSnapshotList = js.Array[DBSnapshot]
  type DBSubnetGroups = js.Array[DBSubnetGroup]
  type DescribeDBLogFilesList = js.Array[DescribeDBLogFilesDetails]
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type IPRangeList = js.Array[IPRange]
  type IntegerOptional = Integer
  type KeyList = js.Array[String]
  type OptionConfigurationList = js.Array[OptionConfiguration]
  type OptionGroupMembershipList = js.Array[OptionGroupMembership]
  type OptionGroupOptionSettingsList = js.Array[OptionGroupOptionSetting]
  type OptionGroupOptionsList = js.Array[OptionGroupOption]
  type OptionGroupsList = js.Array[OptionGroup]
  type OptionNamesList = js.Array[String]
  type OptionSettingConfigurationList = js.Array[OptionSetting]
  type OptionSettingsList = js.Array[OptionSetting]
  type OptionsDependedOn = js.Array[String]
  type OptionsList = js.Array[Option]
  type OrderableDBInstanceOptionsList = js.Array[OrderableDBInstanceOption]
  type ParametersList = js.Array[Parameter]
  type PendingMaintenanceActionDetails = js.Array[PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[ResourcePendingMaintenanceActions]
  type ReadReplicaDBInstanceIdentifierList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservedDBInstanceList = js.Array[ReservedDBInstance]
  type ReservedDBInstancesOfferingList = js.Array[ReservedDBInstancesOffering]
  type SourceIdsList = js.Array[String]
  type SourceType = String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedCharacterSetsList = js.Array[CharacterSet]
  type TStamp = js.Date
  type TagList = js.Array[Tag]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
}

package rds {
  @js.native
  trait Rds extends js.Object {
    def addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage, callback: Callback[AddSourceIdentifierToSubscriptionResult]): Unit = js.native
    def addSourceIdentifierToSubscription(params: AddSourceIdentifierToSubscriptionMessage): Request[AddSourceIdentifierToSubscriptionResult] = js.native
    def addTagsToResource(params: AddTagsToResourceMessage, callback: Callback[js.Object]): Unit = js.native
    def addTagsToResource(params: AddTagsToResourceMessage): Request[js.Object] = js.native
    def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage, callback: Callback[ApplyPendingMaintenanceActionResult]): Unit = js.native
    def applyPendingMaintenanceAction(params: ApplyPendingMaintenanceActionMessage): Request[ApplyPendingMaintenanceActionResult] = js.native
    def authorizeDBSecurityGroupIngress(params: AuthorizeDBSecurityGroupIngressMessage, callback: Callback[AuthorizeDBSecurityGroupIngressResult]): Unit = js.native
    def authorizeDBSecurityGroupIngress(params: AuthorizeDBSecurityGroupIngressMessage): Request[AuthorizeDBSecurityGroupIngressResult] = js.native
    def copyDBParameterGroup(params: CopyDBParameterGroupMessage, callback: Callback[CopyDBParameterGroupResult]): Unit = js.native
    def copyDBParameterGroup(params: CopyDBParameterGroupMessage): Request[CopyDBParameterGroupResult] = js.native
    def copyDBSnapshot(params: CopyDBSnapshotMessage, callback: Callback[CopyDBSnapshotResult]): Unit = js.native
    def copyDBSnapshot(params: CopyDBSnapshotMessage): Request[CopyDBSnapshotResult] = js.native
    def copyOptionGroup(params: CopyOptionGroupMessage, callback: Callback[CopyOptionGroupResult]): Unit = js.native
    def copyOptionGroup(params: CopyOptionGroupMessage): Request[CopyOptionGroupResult] = js.native
    def createDBInstance(params: CreateDBInstanceMessage, callback: Callback[CreateDBInstanceResult]): Unit = js.native
    def createDBInstance(params: CreateDBInstanceMessage): Request[CreateDBInstanceResult] = js.native
    def createDBInstanceReadReplica(params: CreateDBInstanceReadReplicaMessage, callback: Callback[CreateDBInstanceReadReplicaResult]): Unit = js.native
    def createDBInstanceReadReplica(params: CreateDBInstanceReadReplicaMessage): Request[CreateDBInstanceReadReplicaResult] = js.native
    def createDBParameterGroup(params: CreateDBParameterGroupMessage, callback: Callback[CreateDBParameterGroupResult]): Unit = js.native
    def createDBParameterGroup(params: CreateDBParameterGroupMessage): Request[CreateDBParameterGroupResult] = js.native
    def createDBSecurityGroup(params: CreateDBSecurityGroupMessage, callback: Callback[CreateDBSecurityGroupResult]): Unit = js.native
    def createDBSecurityGroup(params: CreateDBSecurityGroupMessage): Request[CreateDBSecurityGroupResult] = js.native
    def createDBSnapshot(params: CreateDBSnapshotMessage, callback: Callback[CreateDBSnapshotResult]): Unit = js.native
    def createDBSnapshot(params: CreateDBSnapshotMessage): Request[CreateDBSnapshotResult] = js.native
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage, callback: Callback[CreateDBSubnetGroupResult]): Unit = js.native
    def createDBSubnetGroup(params: CreateDBSubnetGroupMessage): Request[CreateDBSubnetGroupResult] = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage, callback: Callback[CreateEventSubscriptionResult]): Unit = js.native
    def createEventSubscription(params: CreateEventSubscriptionMessage): Request[CreateEventSubscriptionResult] = js.native
    def createOptionGroup(params: CreateOptionGroupMessage, callback: Callback[CreateOptionGroupResult]): Unit = js.native
    def createOptionGroup(params: CreateOptionGroupMessage): Request[CreateOptionGroupResult] = js.native
    def deleteDBInstance(params: DeleteDBInstanceMessage, callback: Callback[DeleteDBInstanceResult]): Unit = js.native
    def deleteDBInstance(params: DeleteDBInstanceMessage): Request[DeleteDBInstanceResult] = js.native
    def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteDBParameterGroup(params: DeleteDBParameterGroupMessage): Request[js.Object] = js.native
    def deleteDBSecurityGroup(params: DeleteDBSecurityGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteDBSecurityGroup(params: DeleteDBSecurityGroupMessage): Request[js.Object] = js.native
    def deleteDBSnapshot(params: DeleteDBSnapshotMessage, callback: Callback[DeleteDBSnapshotResult]): Unit = js.native
    def deleteDBSnapshot(params: DeleteDBSnapshotMessage): Request[DeleteDBSnapshotResult] = js.native
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteDBSubnetGroup(params: DeleteDBSubnetGroupMessage): Request[js.Object] = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage, callback: Callback[DeleteEventSubscriptionResult]): Unit = js.native
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): Request[DeleteEventSubscriptionResult] = js.native
    def deleteOptionGroup(params: DeleteOptionGroupMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteOptionGroup(params: DeleteOptionGroupMessage): Request[js.Object] = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesMessage, callback: Callback[AccountAttributesMessage]): Unit = js.native
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): Request[AccountAttributesMessage] = js.native
    def describeCertificates(params: DescribeCertificatesMessage, callback: Callback[CertificateMessage]): Unit = js.native
    def describeCertificates(params: DescribeCertificatesMessage): Request[CertificateMessage] = js.native
    def describeDBEngineVersions(params: DescribeDBEngineVersionsMessage, callback: Callback[DBEngineVersionMessage]): Unit = js.native
    def describeDBEngineVersions(params: DescribeDBEngineVersionsMessage): Request[DBEngineVersionMessage] = js.native
    def describeDBInstances(params: DescribeDBInstancesMessage, callback: Callback[DBInstanceMessage]): Unit = js.native
    def describeDBInstances(params: DescribeDBInstancesMessage): Request[DBInstanceMessage] = js.native
    def describeDBLogFiles(params: DescribeDBLogFilesMessage, callback: Callback[DescribeDBLogFilesResponse]): Unit = js.native
    def describeDBLogFiles(params: DescribeDBLogFilesMessage): Request[DescribeDBLogFilesResponse] = js.native
    def describeDBParameterGroups(params: DescribeDBParameterGroupsMessage, callback: Callback[DBParameterGroupsMessage]): Unit = js.native
    def describeDBParameterGroups(params: DescribeDBParameterGroupsMessage): Request[DBParameterGroupsMessage] = js.native
    def describeDBParameters(params: DescribeDBParametersMessage, callback: Callback[DBParameterGroupDetails]): Unit = js.native
    def describeDBParameters(params: DescribeDBParametersMessage): Request[DBParameterGroupDetails] = js.native
    def describeDBSecurityGroups(params: DescribeDBSecurityGroupsMessage, callback: Callback[DBSecurityGroupMessage]): Unit = js.native
    def describeDBSecurityGroups(params: DescribeDBSecurityGroupsMessage): Request[DBSecurityGroupMessage] = js.native
    def describeDBSnapshots(params: DescribeDBSnapshotsMessage, callback: Callback[DBSnapshotMessage]): Unit = js.native
    def describeDBSnapshots(params: DescribeDBSnapshotsMessage): Request[DBSnapshotMessage] = js.native
    def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage, callback: Callback[DBSubnetGroupMessage]): Unit = js.native
    def describeDBSubnetGroups(params: DescribeDBSubnetGroupsMessage): Request[DBSubnetGroupMessage] = js.native
    def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage, callback: Callback[DescribeEngineDefaultParametersResult]): Unit = js.native
    def describeEngineDefaultParameters(params: DescribeEngineDefaultParametersMessage): Request[DescribeEngineDefaultParametersResult] = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage, callback: Callback[EventCategoriesMessage]): Unit = js.native
    def describeEventCategories(params: DescribeEventCategoriesMessage): Request[EventCategoriesMessage] = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage, callback: Callback[EventSubscriptionsMessage]): Unit = js.native
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): Request[EventSubscriptionsMessage] = js.native
    def describeEvents(params: DescribeEventsMessage, callback: Callback[EventsMessage]): Unit = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventsMessage] = js.native
    def describeOptionGroupOptions(params: DescribeOptionGroupOptionsMessage, callback: Callback[OptionGroupOptionsMessage]): Unit = js.native
    def describeOptionGroupOptions(params: DescribeOptionGroupOptionsMessage): Request[OptionGroupOptionsMessage] = js.native
    def describeOptionGroups(params: DescribeOptionGroupsMessage, callback: Callback[OptionGroups]): Unit = js.native
    def describeOptionGroups(params: DescribeOptionGroupsMessage): Request[OptionGroups] = js.native
    def describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage, callback: Callback[OrderableDBInstanceOptionsMessage]): Unit = js.native
    def describeOrderableDBInstanceOptions(params: DescribeOrderableDBInstanceOptionsMessage): Request[OrderableDBInstanceOptionsMessage] = js.native
    def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage, callback: Callback[PendingMaintenanceActionsMessage]): Unit = js.native
    def describePendingMaintenanceActions(params: DescribePendingMaintenanceActionsMessage): Request[PendingMaintenanceActionsMessage] = js.native
    def describeReservedDBInstances(params: DescribeReservedDBInstancesMessage, callback: Callback[ReservedDBInstanceMessage]): Unit = js.native
    def describeReservedDBInstances(params: DescribeReservedDBInstancesMessage): Request[ReservedDBInstanceMessage] = js.native
    def describeReservedDBInstancesOfferings(params: DescribeReservedDBInstancesOfferingsMessage, callback: Callback[ReservedDBInstancesOfferingMessage]): Unit = js.native
    def describeReservedDBInstancesOfferings(params: DescribeReservedDBInstancesOfferingsMessage): Request[ReservedDBInstancesOfferingMessage] = js.native
    def downloadDBLogFilePortion(params: DownloadDBLogFilePortionMessage, callback: Callback[DownloadDBLogFilePortionDetails]): Unit = js.native
    def downloadDBLogFilePortion(params: DownloadDBLogFilePortionMessage): Request[DownloadDBLogFilePortionDetails] = js.native
    def listTagsForResource(params: ListTagsForResourceMessage, callback: Callback[TagListMessage]): Unit = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[TagListMessage] = js.native
    def modifyDBInstance(params: ModifyDBInstanceMessage, callback: Callback[ModifyDBInstanceResult]): Unit = js.native
    def modifyDBInstance(params: ModifyDBInstanceMessage): Request[ModifyDBInstanceResult] = js.native
    def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage, callback: Callback[DBParameterGroupNameMessage]): Unit = js.native
    def modifyDBParameterGroup(params: ModifyDBParameterGroupMessage): Request[DBParameterGroupNameMessage] = js.native
    def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage, callback: Callback[ModifyDBSubnetGroupResult]): Unit = js.native
    def modifyDBSubnetGroup(params: ModifyDBSubnetGroupMessage): Request[ModifyDBSubnetGroupResult] = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage, callback: Callback[ModifyEventSubscriptionResult]): Unit = js.native
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): Request[ModifyEventSubscriptionResult] = js.native
    def modifyOptionGroup(params: ModifyOptionGroupMessage, callback: Callback[ModifyOptionGroupResult]): Unit = js.native
    def modifyOptionGroup(params: ModifyOptionGroupMessage): Request[ModifyOptionGroupResult] = js.native
    def promoteReadReplica(params: PromoteReadReplicaMessage, callback: Callback[PromoteReadReplicaResult]): Unit = js.native
    def promoteReadReplica(params: PromoteReadReplicaMessage): Request[PromoteReadReplicaResult] = js.native
    def purchaseReservedDBInstancesOffering(params: PurchaseReservedDBInstancesOfferingMessage, callback: Callback[PurchaseReservedDBInstancesOfferingResult]): Unit = js.native
    def purchaseReservedDBInstancesOffering(params: PurchaseReservedDBInstancesOfferingMessage): Request[PurchaseReservedDBInstancesOfferingResult] = js.native
    def rebootDBInstance(params: RebootDBInstanceMessage, callback: Callback[RebootDBInstanceResult]): Unit = js.native
    def rebootDBInstance(params: RebootDBInstanceMessage): Request[RebootDBInstanceResult] = js.native
    def removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage, callback: Callback[RemoveSourceIdentifierFromSubscriptionResult]): Unit = js.native
    def removeSourceIdentifierFromSubscription(params: RemoveSourceIdentifierFromSubscriptionMessage): Request[RemoveSourceIdentifierFromSubscriptionResult] = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage, callback: Callback[js.Object]): Unit = js.native
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): Request[js.Object] = js.native
    def resetDBParameterGroup(params: ResetDBParameterGroupMessage, callback: Callback[DBParameterGroupNameMessage]): Unit = js.native
    def resetDBParameterGroup(params: ResetDBParameterGroupMessage): Request[DBParameterGroupNameMessage] = js.native
    def restoreDBInstanceFromDBSnapshot(params: RestoreDBInstanceFromDBSnapshotMessage, callback: Callback[RestoreDBInstanceFromDBSnapshotResult]): Unit = js.native
    def restoreDBInstanceFromDBSnapshot(params: RestoreDBInstanceFromDBSnapshotMessage): Request[RestoreDBInstanceFromDBSnapshotResult] = js.native
    def restoreDBInstanceToPointInTime(params: RestoreDBInstanceToPointInTimeMessage, callback: Callback[RestoreDBInstanceToPointInTimeResult]): Unit = js.native
    def restoreDBInstanceToPointInTime(params: RestoreDBInstanceToPointInTimeMessage): Request[RestoreDBInstanceToPointInTimeResult] = js.native
    def revokeDBSecurityGroupIngress(params: RevokeDBSecurityGroupIngressMessage, callback: Callback[RevokeDBSecurityGroupIngressResult]): Unit = js.native
    def revokeDBSecurityGroupIngress(params: RevokeDBSecurityGroupIngressMessage): Request[RevokeDBSecurityGroupIngressResult] = js.native
  }

  /**
   * <p>Data returned by the <b>DescribeAccountAttributes</b> action.</p>
   */
  @js.native
  trait AccountAttributesMessage extends js.Object {
    var AccountQuotas: AccountQuotaList
  }

  object AccountAttributesMessage {
    def apply(
      AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined
    ): AccountAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountQuotas" -> AccountQuotas.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountAttributesMessage]
    }
  }

  /**
   * <p>Describes a quota for an AWS account, for example, the number of DB instances allowed.</p>
   */
  @js.native
  trait AccountQuota extends js.Object {
    var AccountQuotaName: String
    var Used: Long
    var Max: Long
  }

  object AccountQuota {
    def apply(
      AccountQuotaName: js.UndefOr[String] = js.undefined,
      Used: js.UndefOr[Long] = js.undefined,
      Max: js.UndefOr[Long] = js.undefined
    ): AccountQuota = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountQuotaName" -> AccountQuotaName.map { x => x: js.Any }),
        ("Used" -> Used.map { x => x: js.Any }),
        ("Max" -> Max.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountQuota]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait AddSourceIdentifierToSubscriptionMessage extends js.Object {
    var SubscriptionName: String
    var SourceIdentifier: String
  }

  object AddSourceIdentifierToSubscriptionMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined
    ): AddSourceIdentifierToSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any }),
        ("SourceIdentifier" -> SourceIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddSourceIdentifierToSubscriptionMessage]
    }
  }

  @js.native
  trait AddSourceIdentifierToSubscriptionResult extends js.Object {
    var EventSubscription: EventSubscription
  }

  object AddSourceIdentifierToSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): AddSourceIdentifierToSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSubscription" -> EventSubscription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddSourceIdentifierToSubscriptionResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait AddTagsToResourceMessage extends js.Object {
    var ResourceName: String
    var Tags: TagList
  }

  object AddTagsToResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): AddTagsToResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceName" -> ResourceName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsToResourceMessage]
    }
  }


  object ApplyMethodEnum {
    val immediate = "immediate"
    val `pending-reboot` = "pending-reboot"

    val values = IndexedSeq(immediate, `pending-reboot`)
  }

  /**
   * <p></p>
   */
  @js.native
  trait ApplyPendingMaintenanceActionMessage extends js.Object {
    var ResourceIdentifier: String
    var ApplyAction: String
    var OptInType: String
  }

  object ApplyPendingMaintenanceActionMessage {
    def apply(
      ResourceIdentifier: js.UndefOr[String] = js.undefined,
      ApplyAction: js.UndefOr[String] = js.undefined,
      OptInType: js.UndefOr[String] = js.undefined
    ): ApplyPendingMaintenanceActionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceIdentifier" -> ResourceIdentifier.map { x => x: js.Any }),
        ("ApplyAction" -> ApplyAction.map { x => x: js.Any }),
        ("OptInType" -> OptInType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplyPendingMaintenanceActionMessage]
    }
  }

  @js.native
  trait ApplyPendingMaintenanceActionResult extends js.Object {
    var ResourcePendingMaintenanceActions: ResourcePendingMaintenanceActions
  }

  object ApplyPendingMaintenanceActionResult {
    def apply(
      ResourcePendingMaintenanceActions: js.UndefOr[ResourcePendingMaintenanceActions] = js.undefined
    ): ApplyPendingMaintenanceActionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourcePendingMaintenanceActions" -> ResourcePendingMaintenanceActions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplyPendingMaintenanceActionResult]
    }
  }

  /**
   * <p> The specified CIDRIP or EC2 security group is already authorized for the specified DB security group. </p>
   */
  @js.native
  trait AuthorizationAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Specified CIDRIP or EC2 security group is not authorized for the specified DB security group. </p> <p>RDS may not also be authorized via IAM to perform necessary actions on your behalf.</p>
   */
  @js.native
  trait AuthorizationNotFoundFaultException extends js.Object {

  }

  /**
   * <p> DB security group authorization quota has been reached. </p>
   */
  @js.native
  trait AuthorizationQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait AuthorizeDBSecurityGroupIngressMessage extends js.Object {
    var CIDRIP: String
    var EC2SecurityGroupId: String
    var EC2SecurityGroupName: String
    var DBSecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  object AuthorizeDBSecurityGroupIngressMessage {
    def apply(
      CIDRIP: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): AuthorizeDBSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CIDRIP" -> CIDRIP.map { x => x: js.Any }),
        ("EC2SecurityGroupId" -> EC2SecurityGroupId.map { x => x: js.Any }),
        ("EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x: js.Any }),
        ("DBSecurityGroupName" -> DBSecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeDBSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait AuthorizeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: DBSecurityGroup
  }

  object AuthorizeDBSecurityGroupIngressResult {
    def apply(
      DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
    ): AuthorizeDBSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSecurityGroup" -> DBSecurityGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
    }
  }

  /**
   * <p> Contains Availability Zone information. </p> <p> This data type is used as an element in the following data type: <ul><li><a>OrderableDBInstanceOption</a></li></ul></p>
   */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: String
  }

  object AvailabilityZone {
    def apply(
      Name: js.UndefOr[String] = js.undefined
    ): AvailabilityZone = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AvailabilityZone]
    }
  }

  /**
   * <p>A CA certificate for an AWS account. </p>
   */
  @js.native
  trait Certificate extends js.Object {
    var ValidTill: TStamp
    var ValidFrom: TStamp
    var Thumbprint: String
    var CertificateIdentifier: String
    var CertificateType: String
  }

  object Certificate {
    def apply(
      ValidTill: js.UndefOr[TStamp] = js.undefined,
      ValidFrom: js.UndefOr[TStamp] = js.undefined,
      Thumbprint: js.UndefOr[String] = js.undefined,
      CertificateIdentifier: js.UndefOr[String] = js.undefined,
      CertificateType: js.UndefOr[String] = js.undefined
    ): Certificate = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ValidTill" -> ValidTill.map { x => x: js.Any }),
        ("ValidFrom" -> ValidFrom.map { x => x: js.Any }),
        ("Thumbprint" -> Thumbprint.map { x => x: js.Any }),
        ("CertificateIdentifier" -> CertificateIdentifier.map { x => x: js.Any }),
        ("CertificateType" -> CertificateType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Certificate]
    }
  }

  /**
   * <p>Data returned by the <b>DescribeCertificates</b> action.</p>
   */
  @js.native
  trait CertificateMessage extends js.Object {
    var Certificates: CertificateList
    var Marker: String
  }

  object CertificateMessage {
    def apply(
      Certificates: js.UndefOr[CertificateList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): CertificateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Certificates" -> Certificates.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CertificateMessage]
    }
  }

  /**
   * <p><i>CertificateIdentifier</i> does not refer to an existing certificate. </p>
   */
  @js.native
  trait CertificateNotFoundFaultException extends js.Object {

  }

  /**
   * <p> This data type is used as a response element in the action <a>DescribeDBEngineVersions</a>. </p>
   */
  @js.native
  trait CharacterSet extends js.Object {
    var CharacterSetName: String
    var CharacterSetDescription: String
  }

  object CharacterSet {
    def apply(
      CharacterSetName: js.UndefOr[String] = js.undefined,
      CharacterSetDescription: js.UndefOr[String] = js.undefined
    ): CharacterSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CharacterSetName" -> CharacterSetName.map { x => x: js.Any }),
        ("CharacterSetDescription" -> CharacterSetDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CharacterSet]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CopyDBParameterGroupMessage extends js.Object {
    var SourceDBParameterGroupIdentifier: String
    var TargetDBParameterGroupIdentifier: String
    var TargetDBParameterGroupDescription: String
    var Tags: TagList
  }

  object CopyDBParameterGroupMessage {
    def apply(
      SourceDBParameterGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetDBParameterGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetDBParameterGroupDescription: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CopyDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceDBParameterGroupIdentifier" -> SourceDBParameterGroupIdentifier.map { x => x: js.Any }),
        ("TargetDBParameterGroupIdentifier" -> TargetDBParameterGroupIdentifier.map { x => x: js.Any }),
        ("TargetDBParameterGroupDescription" -> TargetDBParameterGroupDescription.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBParameterGroupMessage]
    }
  }

  @js.native
  trait CopyDBParameterGroupResult extends js.Object {
    var DBParameterGroup: DBParameterGroup
  }

  object CopyDBParameterGroupResult {
    def apply(
      DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined
    ): CopyDBParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroup" -> DBParameterGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBParameterGroupResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CopyDBSnapshotMessage extends js.Object {
    var SourceDBSnapshotIdentifier: String
    var TargetDBSnapshotIdentifier: String
    var Tags: TagList
  }

  object CopyDBSnapshotMessage {
    def apply(
      SourceDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      TargetDBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CopyDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceDBSnapshotIdentifier" -> SourceDBSnapshotIdentifier.map { x => x: js.Any }),
        ("TargetDBSnapshotIdentifier" -> TargetDBSnapshotIdentifier.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBSnapshotMessage]
    }
  }

  @js.native
  trait CopyDBSnapshotResult extends js.Object {
    var DBSnapshot: DBSnapshot
  }

  object CopyDBSnapshotResult {
    def apply(
      DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
    ): CopyDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSnapshot" -> DBSnapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyDBSnapshotResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CopyOptionGroupMessage extends js.Object {
    var SourceOptionGroupIdentifier: String
    var TargetOptionGroupIdentifier: String
    var TargetOptionGroupDescription: String
    var Tags: TagList
  }

  object CopyOptionGroupMessage {
    def apply(
      SourceOptionGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetOptionGroupIdentifier: js.UndefOr[String] = js.undefined,
      TargetOptionGroupDescription: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CopyOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceOptionGroupIdentifier" -> SourceOptionGroupIdentifier.map { x => x: js.Any }),
        ("TargetOptionGroupIdentifier" -> TargetOptionGroupIdentifier.map { x => x: js.Any }),
        ("TargetOptionGroupDescription" -> TargetOptionGroupDescription.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyOptionGroupMessage]
    }
  }

  @js.native
  trait CopyOptionGroupResult extends js.Object {
    var OptionGroup: OptionGroup
  }

  object CopyOptionGroupResult {
    def apply(
      OptionGroup: js.UndefOr[OptionGroup] = js.undefined
    ): CopyOptionGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionGroup" -> OptionGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CopyOptionGroupResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateDBInstanceMessage extends js.Object {
    var PreferredMaintenanceWindow: String
    var CharacterSetName: String
    var DBInstanceClass: String
    var TdeCredentialPassword: String
    var Engine: String
    var OptionGroupName: String
    var MultiAZ: BooleanOptional
    var DBSecurityGroups: DBSecurityGroupNameList
    var DBName: String
    var KmsKeyId: String
    var AllocatedStorage: IntegerOptional
    var DBInstanceIdentifier: String
    var BackupRetentionPeriod: IntegerOptional
    var MasterUsername: String
    var AvailabilityZone: String
    var AutoMinorVersionUpgrade: BooleanOptional
    var VpcSecurityGroupIds: VpcSecurityGroupIdList
    var EngineVersion: String
    var DBSubnetGroupName: String
    var Port: IntegerOptional
    var MasterUserPassword: String
    var PreferredBackupWindow: String
    var Iops: IntegerOptional
    var StorageType: String
    var Tags: TagList
    var PubliclyAccessible: BooleanOptional
    var LicenseModel: String
    var TdeCredentialArn: String
    var DBParameterGroupName: String
    var StorageEncrypted: BooleanOptional
  }

  object CreateDBInstanceMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      StorageEncrypted: js.UndefOr[BooleanOptional] = js.undefined
    ): CreateDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("CharacterSetName" -> CharacterSetName.map { x => x: js.Any }),
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("TdeCredentialPassword" -> TdeCredentialPassword.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("DBSecurityGroups" -> DBSecurityGroups.map { x => x: js.Any }),
        ("DBName" -> DBName.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("AllocatedStorage" -> AllocatedStorage.map { x => x: js.Any }),
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x: js.Any }),
        ("MasterUsername" -> MasterUsername.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("DBSubnetGroupName" -> DBSubnetGroupName.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("MasterUserPassword" -> MasterUserPassword.map { x => x: js.Any }),
        ("PreferredBackupWindow" -> PreferredBackupWindow.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("StorageType" -> StorageType.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("PubliclyAccessible" -> PubliclyAccessible.map { x => x: js.Any }),
        ("LicenseModel" -> LicenseModel.map { x => x: js.Any }),
        ("TdeCredentialArn" -> TdeCredentialArn.map { x => x: js.Any }),
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any }),
        ("StorageEncrypted" -> StorageEncrypted.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceMessage]
    }
  }

  @js.native
  trait CreateDBInstanceReadReplicaMessage extends js.Object {
    var DBInstanceClass: String
    var OptionGroupName: String
    var SourceDBInstanceIdentifier: String
    var DBInstanceIdentifier: String
    var AvailabilityZone: String
    var AutoMinorVersionUpgrade: BooleanOptional
    var DBSubnetGroupName: String
    var Port: IntegerOptional
    var Iops: IntegerOptional
    var StorageType: String
    var Tags: TagList
    var PubliclyAccessible: BooleanOptional
  }

  object CreateDBInstanceReadReplicaMessage {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      SourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    ): CreateDBInstanceReadReplicaMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("SourceDBInstanceIdentifier" -> SourceDBInstanceIdentifier.map { x => x: js.Any }),
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("DBSubnetGroupName" -> DBSubnetGroupName.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("StorageType" -> StorageType.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("PubliclyAccessible" -> PubliclyAccessible.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceReadReplicaMessage]
    }
  }

  @js.native
  trait CreateDBInstanceReadReplicaResult extends js.Object {
    var DBInstance: DBInstance
  }

  object CreateDBInstanceReadReplicaResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): CreateDBInstanceReadReplicaResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstance" -> DBInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceReadReplicaResult]
    }
  }

  @js.native
  trait CreateDBInstanceResult extends js.Object {
    var DBInstance: DBInstance
  }

  object CreateDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): CreateDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstance" -> DBInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBInstanceResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
    var DBParameterGroupFamily: String
    var Description: String
    var Tags: TagList
  }

  object CreateDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any }),
        ("DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBParameterGroupMessage]
    }
  }

  @js.native
  trait CreateDBParameterGroupResult extends js.Object {
    var DBParameterGroup: DBParameterGroup
  }

  object CreateDBParameterGroupResult {
    def apply(
      DBParameterGroup: js.UndefOr[DBParameterGroup] = js.undefined
    ): CreateDBParameterGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroup" -> DBParameterGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBParameterGroupResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateDBSecurityGroupMessage extends js.Object {
    var DBSecurityGroupName: String
    var DBSecurityGroupDescription: String
    var Tags: TagList
  }

  object CreateDBSecurityGroupMessage {
    def apply(
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      DBSecurityGroupDescription: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSecurityGroupName" -> DBSecurityGroupName.map { x => x: js.Any }),
        ("DBSecurityGroupDescription" -> DBSecurityGroupDescription.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSecurityGroupMessage]
    }
  }

  @js.native
  trait CreateDBSecurityGroupResult extends js.Object {
    var DBSecurityGroup: DBSecurityGroup
  }

  object CreateDBSecurityGroupResult {
    def apply(
      DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
    ): CreateDBSecurityGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSecurityGroup" -> DBSecurityGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSecurityGroupResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: String
    var DBInstanceIdentifier: String
    var Tags: TagList
  }

  object CreateDBSnapshotMessage {
    def apply(
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x: js.Any }),
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSnapshotMessage]
    }
  }

  @js.native
  trait CreateDBSnapshotResult extends js.Object {
    var DBSnapshot: DBSnapshot
  }

  object CreateDBSnapshotResult {
    def apply(
      DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
    ): CreateDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSnapshot" -> DBSnapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSnapshotResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
    var DBSubnetGroupDescription: String
    var SubnetIds: SubnetIdentifierList
    var Tags: TagList
  }

  object CreateDBSubnetGroupMessage {
    def apply(
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      DBSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSubnetGroupName" -> DBSubnetGroupName.map { x => x: js.Any }),
        ("DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x => x: js.Any }),
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSubnetGroupMessage]
    }
  }

  @js.native
  trait CreateDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: DBSubnetGroup
  }

  object CreateDBSubnetGroupResult {
    def apply(
      DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
    ): CreateDBSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSubnetGroup" -> DBSubnetGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDBSubnetGroupResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateEventSubscriptionMessage extends js.Object {
    var Enabled: BooleanOptional
    var SourceIds: SourceIdsList
    var SubscriptionName: String
    var SnsTopicArn: String
    var EventCategories: EventCategoriesList
    var Tags: TagList
    var SourceType: String
  }

  object CreateEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SourceIds: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined
    ): CreateEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("SourceIds" -> SourceIds.map { x => x: js.Any }),
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any }),
        ("SnsTopicArn" -> SnsTopicArn.map { x => x: js.Any }),
        ("EventCategories" -> EventCategories.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionMessage]
    }
  }

  @js.native
  trait CreateEventSubscriptionResult extends js.Object {
    var EventSubscription: EventSubscription
  }

  object CreateEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): CreateEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSubscription" -> EventSubscription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEventSubscriptionResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateOptionGroupMessage extends js.Object {
    var MajorEngineVersion: String
    var OptionGroupName: String
    var EngineName: String
    var Tags: TagList
    var OptionGroupDescription: String
  }

  object CreateOptionGroupMessage {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      OptionGroupDescription: js.UndefOr[String] = js.undefined
    ): CreateOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MajorEngineVersion" -> MajorEngineVersion.map { x => x: js.Any }),
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("EngineName" -> EngineName.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("OptionGroupDescription" -> OptionGroupDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOptionGroupMessage]
    }
  }

  @js.native
  trait CreateOptionGroupResult extends js.Object {
    var OptionGroup: OptionGroup
  }

  object CreateOptionGroupResult {
    def apply(
      OptionGroup: js.UndefOr[OptionGroup] = js.undefined
    ): CreateOptionGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionGroup" -> OptionGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateOptionGroupResult]
    }
  }

  /**
   * <p> This data type is used as a response element in the action <a>DescribeDBEngineVersions</a>. </p>
   */
  @js.native
  trait DBEngineVersion extends js.Object {
    var DefaultCharacterSet: CharacterSet
    var Engine: String
    var DBEngineVersionDescription: String
    var DBEngineDescription: String
    var DBParameterGroupFamily: String
    var EngineVersion: String
    var SupportedCharacterSets: SupportedCharacterSetsList
  }

  object DBEngineVersion {
    def apply(
      DefaultCharacterSet: js.UndefOr[CharacterSet] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      DBEngineVersionDescription: js.UndefOr[String] = js.undefined,
      DBEngineDescription: js.UndefOr[String] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined
    ): DBEngineVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DefaultCharacterSet" -> DefaultCharacterSet.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("DBEngineVersionDescription" -> DBEngineVersionDescription.map { x => x: js.Any }),
        ("DBEngineDescription" -> DBEngineDescription.map { x => x: js.Any }),
        ("DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("SupportedCharacterSets" -> SupportedCharacterSets.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBEngineVersion]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBEngineVersions</a> action. </p>
   */
  @js.native
  trait DBEngineVersionMessage extends js.Object {
    var Marker: String
    var DBEngineVersions: DBEngineVersionList
  }

  object DBEngineVersionMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined
    ): DBEngineVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("DBEngineVersions" -> DBEngineVersions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBEngineVersionMessage]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the following actions: </p> <ul> <li> <a>CreateDBInstance</a> </li> <li> <a>DeleteDBInstance</a> </li> <li> <a>ModifyDBInstance</a> </li> </ul> <p>This data type is used as a response element in the <a>DescribeDBInstances</a> action.</p>
   */
  @js.native
  trait DBInstance extends js.Object {
    var PreferredMaintenanceWindow: String
    var CharacterSetName: String
    var DBInstanceClass: String
    var Engine: String
    var ReadReplicaDBInstanceIdentifiers: ReadReplicaDBInstanceIdentifierList
    var MultiAZ: Boolean
    var DBSecurityGroups: DBSecurityGroupMembershipList
    var DBName: String
    var DbiResourceId: String
    var StatusInfos: DBInstanceStatusInfoList
    var DBSubnetGroup: DBSubnetGroup
    var Endpoint: Endpoint
    var KmsKeyId: String
    var AllocatedStorage: Integer
    var PendingModifiedValues: PendingModifiedValues
    var OptionGroupMemberships: OptionGroupMembershipList
    var DBInstanceIdentifier: String
    var BackupRetentionPeriod: Integer
    var MasterUsername: String
    var AvailabilityZone: String
    var VpcSecurityGroups: VpcSecurityGroupMembershipList
    var AutoMinorVersionUpgrade: Boolean
    var EngineVersion: String
    var InstanceCreateTime: TStamp
    var PreferredBackupWindow: String
    var Iops: IntegerOptional
    var DBInstanceStatus: String
    var StorageType: String
    var LatestRestorableTime: TStamp
    var PubliclyAccessible: Boolean
    var SecondaryAvailabilityZone: String
    var ReadReplicaSourceDBInstanceIdentifier: String
    var DBParameterGroups: DBParameterGroupStatusList
    var CACertificateIdentifier: String
    var LicenseModel: String
    var TdeCredentialArn: String
    var StorageEncrypted: Boolean
  }

  object DBInstance {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      CharacterSetName: js.UndefOr[String] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      ReadReplicaDBInstanceIdentifiers: js.UndefOr[ReadReplicaDBInstanceIdentifierList] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      DbiResourceId: js.UndefOr[String] = js.undefined,
      StatusInfos: js.UndefOr[DBInstanceStatusInfoList] = js.undefined,
      DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined,
      Endpoint: js.UndefOr[Endpoint] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[Integer] = js.undefined,
      PendingModifiedValues: js.UndefOr[PendingModifiedValues] = js.undefined,
      OptionGroupMemberships: js.UndefOr[OptionGroupMembershipList] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      DBInstanceStatus: js.UndefOr[String] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      LatestRestorableTime: js.UndefOr[TStamp] = js.undefined,
      PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
      SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined,
      ReadReplicaSourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      DBParameterGroups: js.UndefOr[DBParameterGroupStatusList] = js.undefined,
      CACertificateIdentifier: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      StorageEncrypted: js.UndefOr[Boolean] = js.undefined
    ): DBInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("CharacterSetName" -> CharacterSetName.map { x => x: js.Any }),
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("ReadReplicaDBInstanceIdentifiers" -> ReadReplicaDBInstanceIdentifiers.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("DBSecurityGroups" -> DBSecurityGroups.map { x => x: js.Any }),
        ("DBName" -> DBName.map { x => x: js.Any }),
        ("DbiResourceId" -> DbiResourceId.map { x => x: js.Any }),
        ("StatusInfos" -> StatusInfos.map { x => x: js.Any }),
        ("DBSubnetGroup" -> DBSubnetGroup.map { x => x: js.Any }),
        ("Endpoint" -> Endpoint.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("AllocatedStorage" -> AllocatedStorage.map { x => x: js.Any }),
        ("PendingModifiedValues" -> PendingModifiedValues.map { x => x: js.Any }),
        ("OptionGroupMemberships" -> OptionGroupMemberships.map { x => x: js.Any }),
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x: js.Any }),
        ("MasterUsername" -> MasterUsername.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("VpcSecurityGroups" -> VpcSecurityGroups.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("InstanceCreateTime" -> InstanceCreateTime.map { x => x: js.Any }),
        ("PreferredBackupWindow" -> PreferredBackupWindow.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("DBInstanceStatus" -> DBInstanceStatus.map { x => x: js.Any }),
        ("StorageType" -> StorageType.map { x => x: js.Any }),
        ("LatestRestorableTime" -> LatestRestorableTime.map { x => x: js.Any }),
        ("PubliclyAccessible" -> PubliclyAccessible.map { x => x: js.Any }),
        ("SecondaryAvailabilityZone" -> SecondaryAvailabilityZone.map { x => x: js.Any }),
        ("ReadReplicaSourceDBInstanceIdentifier" -> ReadReplicaSourceDBInstanceIdentifier.map { x => x: js.Any }),
        ("DBParameterGroups" -> DBParameterGroups.map { x => x: js.Any }),
        ("CACertificateIdentifier" -> CACertificateIdentifier.map { x => x: js.Any }),
        ("LicenseModel" -> LicenseModel.map { x => x: js.Any }),
        ("TdeCredentialArn" -> TdeCredentialArn.map { x => x: js.Any }),
        ("StorageEncrypted" -> StorageEncrypted.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstance]
    }
  }

  /**
   * <p> User already has a DB instance with the given identifier. </p>
   */
  @js.native
  trait DBInstanceAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBInstances</a> action. </p>
   */
  @js.native
  trait DBInstanceMessage extends js.Object {
    var Marker: String
    var DBInstances: DBInstanceList
  }

  object DBInstanceMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBInstances: js.UndefOr[DBInstanceList] = js.undefined
    ): DBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("DBInstances" -> DBInstances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceMessage]
    }
  }

  /**
   * <p> <i>DBInstanceIdentifier</i> does not refer to an existing DB instance. </p>
   */
  @js.native
  trait DBInstanceNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Provides a list of status information for a DB instance.</p>
   */
  @js.native
  trait DBInstanceStatusInfo extends js.Object {
    var StatusType: String
    var Normal: Boolean
    var Status: String
    var Message: String
  }

  object DBInstanceStatusInfo {
    def apply(
      StatusType: js.UndefOr[String] = js.undefined,
      Normal: js.UndefOr[Boolean] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      Message: js.UndefOr[String] = js.undefined
    ): DBInstanceStatusInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StatusType" -> StatusType.map { x => x: js.Any }),
        ("Normal" -> Normal.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBInstanceStatusInfo]
    }
  }

  /**
   * <p>Contains the result of a successful invocation of the <a>CreateDBParameterGroup</a> action. </p> <p>This data type is used as a request parameter in the <a>DeleteDBParameterGroup</a> action, and as a response element in the <a>DescribeDBParameterGroups</a> action. </p>
   */
  @js.native
  trait DBParameterGroup extends js.Object {
    var DBParameterGroupName: String
    var DBParameterGroupFamily: String
    var Description: String
  }

  object DBParameterGroup {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined
    ): DBParameterGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any }),
        ("DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroup]
    }
  }

  /**
   * <p> A DB parameter group with the same name exists. </p>
   */
  @js.native
  trait DBParameterGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBParameters</a> action. </p>
   */
  @js.native
  trait DBParameterGroupDetails extends js.Object {
    var Parameters: ParametersList
    var Marker: String
  }

  object DBParameterGroupDetails {
    def apply(
      Parameters: js.UndefOr[ParametersList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DBParameterGroupDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Parameters" -> Parameters.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupDetails]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>ModifyDBParameterGroup</a> or <a>ResetDBParameterGroup</a> action. </p>
   */
  @js.native
  trait DBParameterGroupNameMessage extends js.Object {
    var DBParameterGroupName: String
  }

  object DBParameterGroupNameMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined
    ): DBParameterGroupNameMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupNameMessage]
    }
  }

  /**
   * <p> <i>DBParameterGroupName</i> does not refer to an existing DB parameter group. </p>
   */
  @js.native
  trait DBParameterGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p> Request would result in user exceeding the allowed number of DB parameter groups. </p>
   */
  @js.native
  trait DBParameterGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> The status of the DB parameter group. </p> <p>This data type is used as a response element in the following actions:</p> <ul> <li> <a>CreateDBInstance</a> </li> <li> <a>CreateDBInstanceReadReplica</a> </li> <li> <a>DeleteDBInstance</a> </li> <li> <a>ModifyDBInstance</a> </li> <li> <a>RebootDBInstance</a> </li> <li> <a>RestoreDBInstanceFromDBSnapshot</a> </li> </ul>
   */
  @js.native
  trait DBParameterGroupStatus extends js.Object {
    var DBParameterGroupName: String
    var ParameterApplyStatus: String
  }

  object DBParameterGroupStatus {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      ParameterApplyStatus: js.UndefOr[String] = js.undefined
    ): DBParameterGroupStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any }),
        ("ParameterApplyStatus" -> ParameterApplyStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupStatus]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBParameterGroups</a> action. </p>
   */
  @js.native
  trait DBParameterGroupsMessage extends js.Object {
    var Marker: String
    var DBParameterGroups: DBParameterGroupList
  }

  object DBParameterGroupsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBParameterGroups: js.UndefOr[DBParameterGroupList] = js.undefined
    ): DBParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("DBParameterGroups" -> DBParameterGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBParameterGroupsMessage]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the following actions: </p> <ul> <li> <a>DescribeDBSecurityGroups</a> </li> <li> <a>AuthorizeDBSecurityGroupIngress</a> </li> <li> <a>CreateDBSecurityGroup</a> </li> <li> <a>RevokeDBSecurityGroupIngress</a> </li> </ul> <p>This data type is used as a response element in the <a>DescribeDBSecurityGroups</a> action.</p>
   */
  @js.native
  trait DBSecurityGroup extends js.Object {
    var DBSecurityGroupDescription: String
    var IPRanges: IPRangeList
    var EC2SecurityGroups: EC2SecurityGroupList
    var OwnerId: String
    var DBSecurityGroupName: String
    var VpcId: String
  }

  object DBSecurityGroup {
    def apply(
      DBSecurityGroupDescription: js.UndefOr[String] = js.undefined,
      IPRanges: js.UndefOr[IPRangeList] = js.undefined,
      EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined,
      OwnerId: js.UndefOr[String] = js.undefined,
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): DBSecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSecurityGroupDescription" -> DBSecurityGroupDescription.map { x => x: js.Any }),
        ("IPRanges" -> IPRanges.map { x => x: js.Any }),
        ("EC2SecurityGroups" -> EC2SecurityGroups.map { x => x: js.Any }),
        ("OwnerId" -> OwnerId.map { x => x: js.Any }),
        ("DBSecurityGroupName" -> DBSecurityGroupName.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSecurityGroup]
    }
  }

  /**
   * <p> A DB security group with the name specified in <i>DBSecurityGroupName</i> already exists. </p>
   */
  @js.native
  trait DBSecurityGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> This data type is used as a response element in the following actions: </p> <ul> <li> <a>ModifyDBInstance</a> </li> <li> <a>RebootDBInstance</a> </li> <li> <a>RestoreDBInstanceFromDBSnapshot</a> </li> <li> <a>RestoreDBInstanceToPointInTime</a> </li> </ul>
   */
  @js.native
  trait DBSecurityGroupMembership extends js.Object {
    var DBSecurityGroupName: String
    var Status: String
  }

  object DBSecurityGroupMembership {
    def apply(
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): DBSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSecurityGroupName" -> DBSecurityGroupName.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSecurityGroupMembership]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBSecurityGroups</a> action. </p>
   */
  @js.native
  trait DBSecurityGroupMessage extends js.Object {
    var Marker: String
    var DBSecurityGroups: DBSecurityGroups
  }

  object DBSecurityGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroups] = js.undefined
    ): DBSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("DBSecurityGroups" -> DBSecurityGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSecurityGroupMessage]
    }
  }

  /**
   * <p> <i>DBSecurityGroupName</i> does not refer to an existing DB security group. </p>
   */
  @js.native
  trait DBSecurityGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p> A DB security group is not allowed for this action. </p>
   */
  @js.native
  trait DBSecurityGroupNotSupportedFaultException extends js.Object {

  }

  /**
   * <p> Request would result in user exceeding the allowed number of DB security groups. </p>
   */
  @js.native
  trait DBSecurityGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> Contains the result of a successful invocation of the following actions: </p> <ul> <li> <a>CreateDBSnapshot</a> </li> <li> <a>DeleteDBSnapshot</a> </li> </ul> <p>This data type is used as a response element in the <a>DescribeDBSnapshots</a> action.</p>
   */
  @js.native
  trait DBSnapshot extends js.Object {
    var SourceRegion: String
    var Engine: String
    var OptionGroupName: String
    var PercentProgress: Integer
    var KmsKeyId: String
    var AllocatedStorage: Integer
    var DBInstanceIdentifier: String
    var SnapshotCreateTime: TStamp
    var SnapshotType: String
    var MasterUsername: String
    var AvailabilityZone: String
    var Encrypted: Boolean
    var EngineVersion: String
    var InstanceCreateTime: TStamp
    var Port: Integer
    var Iops: IntegerOptional
    var StorageType: String
    var LicenseModel: String
    var TdeCredentialArn: String
    var DBSnapshotIdentifier: String
    var Status: String
    var VpcId: String
  }

  object DBSnapshot {
    def apply(
      SourceRegion: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      PercentProgress: js.UndefOr[Integer] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      AllocatedStorage: js.UndefOr[Integer] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      MasterUsername: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      Encrypted: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      InstanceCreateTime: js.UndefOr[TStamp] = js.undefined,
      Port: js.UndefOr[Integer] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): DBSnapshot = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceRegion" -> SourceRegion.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("PercentProgress" -> PercentProgress.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("AllocatedStorage" -> AllocatedStorage.map { x => x: js.Any }),
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("SnapshotCreateTime" -> SnapshotCreateTime.map { x => x: js.Any }),
        ("SnapshotType" -> SnapshotType.map { x => x: js.Any }),
        ("MasterUsername" -> MasterUsername.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("Encrypted" -> Encrypted.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("InstanceCreateTime" -> InstanceCreateTime.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("StorageType" -> StorageType.map { x => x: js.Any }),
        ("LicenseModel" -> LicenseModel.map { x => x: js.Any }),
        ("TdeCredentialArn" -> TdeCredentialArn.map { x => x: js.Any }),
        ("DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshot]
    }
  }

  /**
   * <p> <i>DBSnapshotIdentifier</i> is already used by an existing snapshot. </p>
   */
  @js.native
  trait DBSnapshotAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBSnapshots</a> action. </p>
   */
  @js.native
  trait DBSnapshotMessage extends js.Object {
    var Marker: String
    var DBSnapshots: DBSnapshotList
  }

  object DBSnapshotMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBSnapshots: js.UndefOr[DBSnapshotList] = js.undefined
    ): DBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("DBSnapshots" -> DBSnapshots.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSnapshotMessage]
    }
  }

  /**
   * <p> <i>DBSnapshotIdentifier</i> does not refer to an existing DB snapshot. </p>
   */
  @js.native
  trait DBSnapshotNotFoundFaultException extends js.Object {

  }

  /**
   * <p> Contains the result of a successful invocation of the following actions: </p> <ul> <li> <a>CreateDBSubnetGroup</a> </li> <li> <a>ModifyDBSubnetGroup</a> </li> <li> <a>DescribeDBSubnetGroups</a> </li> <li> <a>DeleteDBSubnetGroup</a> </li> </ul> <p>This data type is used as a response element in the <a>DescribeDBSubnetGroups</a> action.</p>
   */
  @js.native
  trait DBSubnetGroup extends js.Object {
    var DBSubnetGroupDescription: String
    var SubnetGroupStatus: String
    var Subnets: SubnetList
    var DBSubnetGroupName: String
    var VpcId: String
  }

  object DBSubnetGroup {
    def apply(
      DBSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetGroupStatus: js.UndefOr[String] = js.undefined,
      Subnets: js.UndefOr[SubnetList] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): DBSubnetGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x => x: js.Any }),
        ("SubnetGroupStatus" -> SubnetGroupStatus.map { x => x: js.Any }),
        ("Subnets" -> Subnets.map { x => x: js.Any }),
        ("DBSubnetGroupName" -> DBSubnetGroupName.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSubnetGroup]
    }
  }

  /**
   * <p> <i>DBSubnetGroupName</i> is already used by an existing DB subnet group. </p>
   */
  @js.native
  trait DBSubnetGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one Availability Zone. </p>
   */
  @js.native
  trait DBSubnetGroupDoesNotCoverEnoughAZsException extends js.Object {

  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeDBSubnetGroups</a> action. </p>
   */
  @js.native
  trait DBSubnetGroupMessage extends js.Object {
    var Marker: String
    var DBSubnetGroups: DBSubnetGroups
  }

  object DBSubnetGroupMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      DBSubnetGroups: js.UndefOr[DBSubnetGroups] = js.undefined
    ): DBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("DBSubnetGroups" -> DBSubnetGroups.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DBSubnetGroupMessage]
    }
  }

  /**
   * <p> Indicates that the DBSubnetGroup should not be specified while creating read replicas that lie in the same region as the source instance. </p>
   */
  @js.native
  trait DBSubnetGroupNotAllowedFaultException extends js.Object {

  }

  /**
   * <p> <i>DBSubnetGroupName</i> does not refer to an existing DB subnet group. </p>
   */
  @js.native
  trait DBSubnetGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p> Request would result in user exceeding the allowed number of DB subnet groups. </p>
   */
  @js.native
  trait DBSubnetGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> Request would result in user exceeding the allowed number of subnets in a DB subnet groups. </p>
   */
  @js.native
  trait DBSubnetQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> The DB upgrade failed because a resource the DB depends on could not be modified. </p>
   */
  @js.native
  trait DBUpgradeDependencyFailureFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var SkipFinalSnapshot: Boolean
    var FinalDBSnapshotIdentifier: String
  }

  object DeleteDBInstanceMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined,
      FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("SkipFinalSnapshot" -> SkipFinalSnapshot.map { x => x: js.Any }),
        ("FinalDBSnapshotIdentifier" -> FinalDBSnapshotIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBInstanceMessage]
    }
  }

  @js.native
  trait DeleteDBInstanceResult extends js.Object {
    var DBInstance: DBInstance
  }

  object DeleteDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): DeleteDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstance" -> DBInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBInstanceResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
  }

  object DeleteDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined
    ): DeleteDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBParameterGroupMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteDBSecurityGroupMessage extends js.Object {
    var DBSecurityGroupName: String
  }

  object DeleteDBSecurityGroupMessage {
    def apply(
      DBSecurityGroupName: js.UndefOr[String] = js.undefined
    ): DeleteDBSecurityGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSecurityGroupName" -> DBSecurityGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSecurityGroupMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteDBSnapshotMessage extends js.Object {
    var DBSnapshotIdentifier: String
  }

  object DeleteDBSnapshotMessage {
    def apply(
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): DeleteDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSnapshotMessage]
    }
  }

  @js.native
  trait DeleteDBSnapshotResult extends js.Object {
    var DBSnapshot: DBSnapshot
  }

  object DeleteDBSnapshotResult {
    def apply(
      DBSnapshot: js.UndefOr[DBSnapshot] = js.undefined
    ): DeleteDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSnapshot" -> DBSnapshot.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSnapshotResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
  }

  object DeleteDBSubnetGroupMessage {
    def apply(
      DBSubnetGroupName: js.UndefOr[String] = js.undefined
    ): DeleteDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSubnetGroupName" -> DBSubnetGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDBSubnetGroupMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteEventSubscriptionMessage extends js.Object {
    var SubscriptionName: String
  }

  object DeleteEventSubscriptionMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined
    ): DeleteEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionMessage]
    }
  }

  @js.native
  trait DeleteEventSubscriptionResult extends js.Object {
    var EventSubscription: EventSubscription
  }

  object DeleteEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): DeleteEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSubscription" -> EventSubscription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEventSubscriptionResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DeleteOptionGroupMessage extends js.Object {
    var OptionGroupName: String
  }

  object DeleteOptionGroupMessage {
    def apply(
      OptionGroupName: js.UndefOr[String] = js.undefined
    ): DeleteOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteOptionGroupMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeAccountAttributesMessage extends js.Object {

  }

  object DescribeAccountAttributesMessage {
    def apply(

    ): DescribeAccountAttributesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeCertificatesMessage extends js.Object {
    var CertificateIdentifier: String
    var Filters: FilterList
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeCertificatesMessage {
    def apply(
      CertificateIdentifier: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeCertificatesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CertificateIdentifier" -> CertificateIdentifier.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeCertificatesMessage]
    }
  }

  @js.native
  trait DescribeDBEngineVersionsMessage extends js.Object {
    var Engine: String
    var DefaultOnly: Boolean
    var DBParameterGroupFamily: String
    var EngineVersion: String
    var MaxRecords: IntegerOptional
    var ListSupportedCharacterSets: BooleanOptional
    var Filters: FilterList
    var Marker: String
  }

  object DescribeDBEngineVersionsMessage {
    def apply(
      Engine: js.UndefOr[String] = js.undefined,
      DefaultOnly: js.UndefOr[Boolean] = js.undefined,
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ListSupportedCharacterSets: js.UndefOr[BooleanOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBEngineVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("DefaultOnly" -> DefaultOnly.map { x => x: js.Any }),
        ("DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("ListSupportedCharacterSets" -> ListSupportedCharacterSets.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBEngineVersionsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeDBInstancesMessage extends js.Object {
    var DBInstanceIdentifier: String
    var Filters: FilterList
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeDBInstancesMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBInstancesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBInstancesMessage]
    }
  }

  /**
   * <p>This data type is used as a response element to <a>DescribeDBLogFiles</a>.</p>
   */
  @js.native
  trait DescribeDBLogFilesDetails extends js.Object {
    var LogFileName: String
    var LastWritten: Long
    var Size: Long
  }

  object DescribeDBLogFilesDetails {
    def apply(
      LogFileName: js.UndefOr[String] = js.undefined,
      LastWritten: js.UndefOr[Long] = js.undefined,
      Size: js.UndefOr[Long] = js.undefined
    ): DescribeDBLogFilesDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogFileName" -> LogFileName.map { x => x: js.Any }),
        ("LastWritten" -> LastWritten.map { x => x: js.Any }),
        ("Size" -> Size.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBLogFilesDetails]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeDBLogFilesMessage extends js.Object {
    var FileSize: Long
    var FilenameContains: String
    var DBInstanceIdentifier: String
    var MaxRecords: IntegerOptional
    var FileLastWritten: Long
    var Filters: FilterList
    var Marker: String
  }

  object DescribeDBLogFilesMessage {
    def apply(
      FileSize: js.UndefOr[Long] = js.undefined,
      FilenameContains: js.UndefOr[String] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      FileLastWritten: js.UndefOr[Long] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBLogFilesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FileSize" -> FileSize.map { x => x: js.Any }),
        ("FilenameContains" -> FilenameContains.map { x => x: js.Any }),
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("FileLastWritten" -> FileLastWritten.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBLogFilesMessage]
    }
  }

  /**
   * <p> The response from a call to <a>DescribeDBLogFiles</a>. </p>
   */
  @js.native
  trait DescribeDBLogFilesResponse extends js.Object {
    var DescribeDBLogFiles: DescribeDBLogFilesList
    var Marker: String
  }

  object DescribeDBLogFilesResponse {
    def apply(
      DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBLogFilesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DescribeDBLogFiles" -> DescribeDBLogFiles.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBLogFilesResponse]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeDBParameterGroupsMessage extends js.Object {
    var DBParameterGroupName: String
    var Filters: FilterList
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeDBParameterGroupsMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBParameterGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBParameterGroupsMessage]
    }
  }

  @js.native
  trait DescribeDBParametersMessage extends js.Object {
    var MaxRecords: IntegerOptional
    var Source: String
    var Filters: FilterList
    var DBParameterGroupName: String
    var Marker: String
  }

  object DescribeDBParametersMessage {
    def apply(
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBParametersMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeDBSecurityGroupsMessage extends js.Object {
    var DBSecurityGroupName: String
    var Filters: FilterList
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeDBSecurityGroupsMessage {
    def apply(
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBSecurityGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSecurityGroupName" -> DBSecurityGroupName.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSecurityGroupsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeDBSnapshotsMessage extends js.Object {
    var DBInstanceIdentifier: String
    var SnapshotType: String
    var MaxRecords: IntegerOptional
    var Filters: FilterList
    var DBSnapshotIdentifier: String
    var Marker: String
  }

  object DescribeDBSnapshotsMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      SnapshotType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBSnapshotsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("SnapshotType" -> SnapshotType.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSnapshotsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeDBSubnetGroupsMessage extends js.Object {
    var DBSubnetGroupName: String
    var Filters: FilterList
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeDBSubnetGroupsMessage {
    def apply(
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeDBSubnetGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSubnetGroupName" -> DBSubnetGroupName.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDBSubnetGroupsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeEngineDefaultParametersMessage extends js.Object {
    var DBParameterGroupFamily: String
    var Filters: FilterList
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeEngineDefaultParametersMessage {
    def apply(
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeEngineDefaultParametersMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultParametersMessage]
    }
  }

  @js.native
  trait DescribeEngineDefaultParametersResult extends js.Object {
    var EngineDefaults: EngineDefaults
  }

  object DescribeEngineDefaultParametersResult {
    def apply(
      EngineDefaults: js.UndefOr[EngineDefaults] = js.undefined
    ): DescribeEngineDefaultParametersResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EngineDefaults" -> EngineDefaults.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEngineDefaultParametersResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeEventCategoriesMessage extends js.Object {
    var SourceType: String
    var Filters: FilterList
  }

  object DescribeEventCategoriesMessage {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): DescribeEventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventCategoriesMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeEventSubscriptionsMessage extends js.Object {
    var SubscriptionName: String
    var Filters: FilterList
    var MaxRecords: IntegerOptional
    var Marker: String
  }

  object DescribeEventSubscriptionsMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeEventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventSubscriptionsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeEventsMessage extends js.Object {
    var Duration: IntegerOptional
    var SourceIdentifier: String
    var StartTime: TStamp
    var EndTime: TStamp
    var MaxRecords: IntegerOptional
    var EventCategories: EventCategoriesList
    var SourceType: SourceType
    var Filters: FilterList
    var Marker: String
  }

  object DescribeEventsMessage {
    def apply(
      Duration: js.UndefOr[IntegerOptional] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      EndTime: js.UndefOr[TStamp] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("SourceIdentifier" -> SourceIdentifier.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("EventCategories" -> EventCategories.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeOptionGroupOptionsMessage extends js.Object {
    var MajorEngineVersion: String
    var EngineName: String
    var MaxRecords: IntegerOptional
    var Filters: FilterList
    var Marker: String
  }

  object DescribeOptionGroupOptionsMessage {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeOptionGroupOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MajorEngineVersion" -> MajorEngineVersion.map { x => x: js.Any }),
        ("EngineName" -> EngineName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOptionGroupOptionsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeOptionGroupsMessage extends js.Object {
    var MajorEngineVersion: String
    var OptionGroupName: String
    var EngineName: String
    var MaxRecords: IntegerOptional
    var Filters: FilterList
    var Marker: String
  }

  object DescribeOptionGroupsMessage {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeOptionGroupsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MajorEngineVersion" -> MajorEngineVersion.map { x => x: js.Any }),
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("EngineName" -> EngineName.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOptionGroupsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeOrderableDBInstanceOptionsMessage extends js.Object {
    var DBInstanceClass: String
    var Engine: String
    var EngineVersion: String
    var MaxRecords: IntegerOptional
    var Vpc: BooleanOptional
    var Filters: FilterList
    var LicenseModel: String
    var Marker: String
  }

  object DescribeOrderableDBInstanceOptionsMessage {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      Vpc: js.UndefOr[BooleanOptional] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeOrderableDBInstanceOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("Vpc" -> Vpc.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("LicenseModel" -> LicenseModel.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeOrderableDBInstanceOptionsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribePendingMaintenanceActionsMessage extends js.Object {
    var ResourceIdentifier: String
    var Filters: FilterList
    var Marker: String
    var MaxRecords: IntegerOptional
  }

  object DescribePendingMaintenanceActionsMessage {
    def apply(
      ResourceIdentifier: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    ): DescribePendingMaintenanceActionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceIdentifier" -> ResourceIdentifier.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePendingMaintenanceActionsMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeReservedDBInstancesMessage extends js.Object {
    var DBInstanceClass: String
    var Duration: String
    var MultiAZ: BooleanOptional
    var OfferingType: String
    var MaxRecords: IntegerOptional
    var ReservedDBInstancesOfferingId: String
    var ReservedDBInstanceId: String
    var Filters: FilterList
    var ProductDescription: String
    var Marker: String
  }

  object DescribeReservedDBInstancesMessage {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeReservedDBInstancesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x: js.Any }),
        ("ReservedDBInstanceId" -> ReservedDBInstanceId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedDBInstancesMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DescribeReservedDBInstancesOfferingsMessage extends js.Object {
    var DBInstanceClass: String
    var Duration: String
    var MultiAZ: BooleanOptional
    var OfferingType: String
    var MaxRecords: IntegerOptional
    var ReservedDBInstancesOfferingId: String
    var Filters: FilterList
    var ProductDescription: String
    var Marker: String
  }

  object DescribeReservedDBInstancesOfferingsMessage {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): DescribeReservedDBInstancesOfferingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeReservedDBInstancesOfferingsMessage]
    }
  }

  /**
   * <p>This data type is used as a response element to <a>DownloadDBLogFilePortion</a>.</p>
   */
  @js.native
  trait DownloadDBLogFilePortionDetails extends js.Object {
    var LogFileData: String
    var Marker: String
    var AdditionalDataPending: Boolean
  }

  object DownloadDBLogFilePortionDetails {
    def apply(
      LogFileData: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      AdditionalDataPending: js.UndefOr[Boolean] = js.undefined
    ): DownloadDBLogFilePortionDetails = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LogFileData" -> LogFileData.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("AdditionalDataPending" -> AdditionalDataPending.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDBLogFilePortionDetails]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait DownloadDBLogFilePortionMessage extends js.Object {
    var DBInstanceIdentifier: String
    var LogFileName: String
    var Marker: String
    var NumberOfLines: Integer
  }

  object DownloadDBLogFilePortionMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      LogFileName: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      NumberOfLines: js.UndefOr[Integer] = js.undefined
    ): DownloadDBLogFilePortionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("LogFileName" -> LogFileName.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("NumberOfLines" -> NumberOfLines.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DownloadDBLogFilePortionMessage]
    }
  }

  /**
   * <p> This data type is used as a response element in the following actions: </p> <ul> <li> <a>AuthorizeDBSecurityGroupIngress</a> </li> <li> <a>DescribeDBSecurityGroups</a> </li> <li> <a>RevokeDBSecurityGroupIngress</a> </li> </ul>
   */
  @js.native
  trait EC2SecurityGroup extends js.Object {
    var Status: String
    var EC2SecurityGroupName: String
    var EC2SecurityGroupId: String
    var EC2SecurityGroupOwnerId: String
  }

  object EC2SecurityGroup {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): EC2SecurityGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupId" -> EC2SecurityGroupId.map { x => x: js.Any }),
        ("EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2SecurityGroup]
    }
  }

  /**
   * <p> This data type is used as a response element in the following actions: </p> <ul> <li> <a>CreateDBInstance</a> </li> <li> <a>DescribeDBInstances</a> </li> <li> <a>DeleteDBInstance</a> </li> </ul>
   */
  @js.native
  trait Endpoint extends js.Object {
    var Address: String
    var Port: Integer
  }

  object Endpoint {
    def apply(
      Address: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[Integer] = js.undefined
    ): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Address" -> Address.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeEngineDefaultParameters</a> action. </p>
   */
  @js.native
  trait EngineDefaults extends js.Object {
    var DBParameterGroupFamily: String
    var Marker: String
    var Parameters: ParametersList
  }

  object EngineDefaults {
    def apply(
      DBParameterGroupFamily: js.UndefOr[String] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined
    ): EngineDefaults = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupFamily" -> DBParameterGroupFamily.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EngineDefaults]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeEvents</a> action. </p>
   */
  @js.native
  trait Event extends js.Object {
    var SourceIdentifier: String
    var EventCategories: EventCategoriesList
    var Message: String
    var SourceType: SourceType
    var Date: TStamp
  }

  object Event {
    def apply(
      SourceIdentifier: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      Message: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[SourceType] = js.undefined,
      Date: js.UndefOr[TStamp] = js.undefined
    ): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceIdentifier" -> SourceIdentifier.map { x => x: js.Any }),
        ("EventCategories" -> EventCategories.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("Date" -> Date.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * <p>Contains the results of a successful invocation of the <a>DescribeEventCategories</a> action.</p>
   */
  @js.native
  trait EventCategoriesMap extends js.Object {
    var SourceType: String
    var EventCategories: EventCategoriesList
  }

  object EventCategoriesMap {
    def apply(
      SourceType: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    ): EventCategoriesMap = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("EventCategories" -> EventCategories.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMap]
    }
  }

  /**
   * <p>Data returned from the <b>DescribeEventCategories</b> action.</p>
   */
  @js.native
  trait EventCategoriesMessage extends js.Object {
    var EventCategoriesMapList: EventCategoriesMapList
  }

  object EventCategoriesMessage {
    def apply(
      EventCategoriesMapList: js.UndefOr[EventCategoriesMapList] = js.undefined
    ): EventCategoriesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventCategoriesMapList" -> EventCategoriesMapList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventCategoriesMessage]
    }
  }

  /**
   * <p>Contains the results of a successful invocation of the <a>DescribeEventSubscriptions</a> action.</p>
   */
  @js.native
  trait EventSubscription extends js.Object {
    var CustomerAwsId: String
    var Enabled: Boolean
    var CustSubscriptionId: String
    var SnsTopicArn: String
    var SourceType: String
    var EventCategoriesList: EventCategoriesList
    var SourceIdsList: SourceIdsList
    var SubscriptionCreationTime: String
    var Status: String
  }

  object EventSubscription {
    def apply(
      CustomerAwsId: js.UndefOr[String] = js.undefined,
      Enabled: js.UndefOr[Boolean] = js.undefined,
      CustSubscriptionId: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined,
      EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined,
      SubscriptionCreationTime: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): EventSubscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CustomerAwsId" -> CustomerAwsId.map { x => x: js.Any }),
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("CustSubscriptionId" -> CustSubscriptionId.map { x => x: js.Any }),
        ("SnsTopicArn" -> SnsTopicArn.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any }),
        ("EventCategoriesList" -> EventCategoriesList.map { x => x: js.Any }),
        ("SourceIdsList" -> SourceIdsList.map { x => x: js.Any }),
        ("SubscriptionCreationTime" -> SubscriptionCreationTime.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscription]
    }
  }

  /**
   * <p>You have reached the maximum number of event subscriptions.</p>
   */
  @js.native
  trait EventSubscriptionQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>Data returned by the <b>DescribeEventSubscriptions</b> action.</p>
   */
  @js.native
  trait EventSubscriptionsMessage extends js.Object {
    var Marker: String
    var EventSubscriptionsList: EventSubscriptionsList
  }

  object EventSubscriptionsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined
    ): EventSubscriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("EventSubscriptionsList" -> EventSubscriptionsList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSubscriptionsMessage]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeEvents</a> action. </p>
   */
  @js.native
  trait EventsMessage extends js.Object {
    var Marker: String
    var Events: EventList
  }

  object EventsMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      Events: js.UndefOr[EventList] = js.undefined
    ): EventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("Events" -> Events.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventsMessage]
    }
  }

  @js.native
  trait Filter extends js.Object {
    var Name: String
    var Values: FilterValueList
  }

  object Filter {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[FilterValueList] = js.undefined
    ): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeDBSecurityGroups</a> action. </p>
   */
  @js.native
  trait IPRange extends js.Object {
    var Status: String
    var CIDRIP: String
  }

  object IPRange {
    def apply(
      Status: js.UndefOr[String] = js.undefined,
      CIDRIP: js.UndefOr[String] = js.undefined
    ): IPRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Status" -> Status.map { x => x: js.Any }),
        ("CIDRIP" -> CIDRIP.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IPRange]
    }
  }

  /**
   * <p> Request would result in user exceeding the allowed number of DB instances. </p>
   */
  @js.native
  trait InstanceQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> Specified DB instance class is not available in the specified Availability Zone. </p>
   */
  @js.native
  trait InsufficientDBInstanceCapacityFaultException extends js.Object {

  }

  /**
   * <p> The specified DB instance is not in the <i>available</i> state. </p>
   */
  @js.native
  trait InvalidDBInstanceStateFaultException extends js.Object {

  }

  /**
   * <p> The DB parameter group cannot be deleted because it is in use. </p>
   */
  @js.native
  trait InvalidDBParameterGroupStateFaultException extends js.Object {

  }

  /**
   * <p> The state of the DB security group does not allow deletion. </p>
   */
  @js.native
  trait InvalidDBSecurityGroupStateFaultException extends js.Object {

  }

  /**
   * <p> The state of the DB snapshot does not allow deletion. </p>
   */
  @js.native
  trait InvalidDBSnapshotStateFaultException extends js.Object {

  }

  /**
   * <p> Indicates the DBSubnetGroup does not belong to the same VPC as that of an existing cross region read replica of the same source instance. </p>
   */
  @js.native
  trait InvalidDBSubnetGroupFaultException extends js.Object {

  }

  /**
   * <p> The DB subnet group cannot be deleted because it is in use. </p>
   */
  @js.native
  trait InvalidDBSubnetGroupStateFaultException extends js.Object {

  }

  /**
   * <p> The DB subnet is not in the <i>available</i> state. </p>
   */
  @js.native
  trait InvalidDBSubnetStateFaultException extends js.Object {

  }

  /**
   * <p>This error can occur if someone else is modifying a subscription. You should retry the action.</p>
   */
  @js.native
  trait InvalidEventSubscriptionStateFaultException extends js.Object {

  }

  /**
   * <p> The option group is not in the <i>available</i> state. </p>
   */
  @js.native
  trait InvalidOptionGroupStateFaultException extends js.Object {

  }

  /**
   * <p> Cannot restore from vpc backup to non-vpc DB instance. </p>
   */
  @js.native
  trait InvalidRestoreFaultException extends js.Object {

  }

  /**
   * <p> The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC. </p>
   */
  @js.native
  trait InvalidSubnetException extends js.Object {

  }

  /**
   * <p> DB subnet group does not cover all Availability Zones after it is created because users' change. </p>
   */
  @js.native
  trait InvalidVPCNetworkStateFaultException extends js.Object {

  }

  /**
   * <p> Error accessing KMS key. </p>
   */
  @js.native
  trait KMSKeyNotAccessibleFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceName: String
    var Filters: FilterList
  }

  object ListTagsForResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[FilterList] = js.undefined
    ): ListTagsForResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceName" -> ResourceName.map { x => x: js.Any }),
        ("Filters" -> Filters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ModifyDBInstanceMessage extends js.Object {
    var PreferredMaintenanceWindow: String
    var DBInstanceClass: String
    var TdeCredentialPassword: String
    var AllowMajorVersionUpgrade: Boolean
    var OptionGroupName: String
    var MultiAZ: BooleanOptional
    var DBSecurityGroups: DBSecurityGroupNameList
    var AllocatedStorage: IntegerOptional
    var DBInstanceIdentifier: String
    var BackupRetentionPeriod: IntegerOptional
    var AutoMinorVersionUpgrade: BooleanOptional
    var VpcSecurityGroupIds: VpcSecurityGroupIdList
    var EngineVersion: String
    var MasterUserPassword: String
    var NewDBInstanceIdentifier: String
    var PreferredBackupWindow: String
    var Iops: IntegerOptional
    var ApplyImmediately: Boolean
    var StorageType: String
    var CACertificateIdentifier: String
    var TdeCredentialArn: String
    var DBParameterGroupName: String
  }

  object ModifyDBInstanceMessage {
    def apply(
      PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      DBSecurityGroups: js.UndefOr[DBSecurityGroupNameList] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      NewDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      CACertificateIdentifier: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      DBParameterGroupName: js.UndefOr[String] = js.undefined
    ): ModifyDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PreferredMaintenanceWindow" -> PreferredMaintenanceWindow.map { x => x: js.Any }),
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("TdeCredentialPassword" -> TdeCredentialPassword.map { x => x: js.Any }),
        ("AllowMajorVersionUpgrade" -> AllowMajorVersionUpgrade.map { x => x: js.Any }),
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("DBSecurityGroups" -> DBSecurityGroups.map { x => x: js.Any }),
        ("AllocatedStorage" -> AllocatedStorage.map { x => x: js.Any }),
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("VpcSecurityGroupIds" -> VpcSecurityGroupIds.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("MasterUserPassword" -> MasterUserPassword.map { x => x: js.Any }),
        ("NewDBInstanceIdentifier" -> NewDBInstanceIdentifier.map { x => x: js.Any }),
        ("PreferredBackupWindow" -> PreferredBackupWindow.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("ApplyImmediately" -> ApplyImmediately.map { x => x: js.Any }),
        ("StorageType" -> StorageType.map { x => x: js.Any }),
        ("CACertificateIdentifier" -> CACertificateIdentifier.map { x => x: js.Any }),
        ("TdeCredentialArn" -> TdeCredentialArn.map { x => x: js.Any }),
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBInstanceMessage]
    }
  }

  @js.native
  trait ModifyDBInstanceResult extends js.Object {
    var DBInstance: DBInstance
  }

  object ModifyDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): ModifyDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstance" -> DBInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBInstanceResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ModifyDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
    var Parameters: ParametersList
  }

  object ModifyDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined
    ): ModifyDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBParameterGroupMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ModifyDBSubnetGroupMessage extends js.Object {
    var DBSubnetGroupName: String
    var DBSubnetGroupDescription: String
    var SubnetIds: SubnetIdentifierList
  }

  object ModifyDBSubnetGroupMessage {
    def apply(
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      DBSubnetGroupDescription: js.UndefOr[String] = js.undefined,
      SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
    ): ModifyDBSubnetGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSubnetGroupName" -> DBSubnetGroupName.map { x => x: js.Any }),
        ("DBSubnetGroupDescription" -> DBSubnetGroupDescription.map { x => x: js.Any }),
        ("SubnetIds" -> SubnetIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSubnetGroupMessage]
    }
  }

  @js.native
  trait ModifyDBSubnetGroupResult extends js.Object {
    var DBSubnetGroup: DBSubnetGroup
  }

  object ModifyDBSubnetGroupResult {
    def apply(
      DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
    ): ModifyDBSubnetGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSubnetGroup" -> DBSubnetGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyDBSubnetGroupResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ModifyEventSubscriptionMessage extends js.Object {
    var Enabled: BooleanOptional
    var SubscriptionName: String
    var SnsTopicArn: String
    var EventCategories: EventCategoriesList
    var SourceType: String
  }

  object ModifyEventSubscriptionMessage {
    def apply(
      Enabled: js.UndefOr[BooleanOptional] = js.undefined,
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SnsTopicArn: js.UndefOr[String] = js.undefined,
      EventCategories: js.UndefOr[EventCategoriesList] = js.undefined,
      SourceType: js.UndefOr[String] = js.undefined
    ): ModifyEventSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Enabled" -> Enabled.map { x => x: js.Any }),
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any }),
        ("SnsTopicArn" -> SnsTopicArn.map { x => x: js.Any }),
        ("EventCategories" -> EventCategories.map { x => x: js.Any }),
        ("SourceType" -> SourceType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionMessage]
    }
  }

  @js.native
  trait ModifyEventSubscriptionResult extends js.Object {
    var EventSubscription: EventSubscription
  }

  object ModifyEventSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): ModifyEventSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSubscription" -> EventSubscription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyEventSubscriptionResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait ModifyOptionGroupMessage extends js.Object {
    var OptionGroupName: String
    var OptionsToInclude: OptionConfigurationList
    var OptionsToRemove: OptionNamesList
    var ApplyImmediately: Boolean
  }

  object ModifyOptionGroupMessage {
    def apply(
      OptionGroupName: js.UndefOr[String] = js.undefined,
      OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.undefined,
      OptionsToRemove: js.UndefOr[OptionNamesList] = js.undefined,
      ApplyImmediately: js.UndefOr[Boolean] = js.undefined
    ): ModifyOptionGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("OptionsToInclude" -> OptionsToInclude.map { x => x: js.Any }),
        ("OptionsToRemove" -> OptionsToRemove.map { x => x: js.Any }),
        ("ApplyImmediately" -> ApplyImmediately.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyOptionGroupMessage]
    }
  }

  @js.native
  trait ModifyOptionGroupResult extends js.Object {
    var OptionGroup: OptionGroup
  }

  object ModifyOptionGroupResult {
    def apply(
      OptionGroup: js.UndefOr[OptionGroup] = js.undefined
    ): ModifyOptionGroupResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionGroup" -> OptionGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ModifyOptionGroupResult]
    }
  }

  /**
   * <p> Option details. </p>
   */
  @js.native
  trait Option extends js.Object {
    var Permanent: Boolean
    var OptionName: String
    var OptionDescription: String
    var OptionSettings: OptionSettingConfigurationList
    var Port: IntegerOptional
    var VpcSecurityGroupMemberships: VpcSecurityGroupMembershipList
    var DBSecurityGroupMemberships: DBSecurityGroupMembershipList
    var Persistent: Boolean
  }

  object Option {
    def apply(
      Permanent: js.UndefOr[Boolean] = js.undefined,
      OptionName: js.UndefOr[String] = js.undefined,
      OptionDescription: js.UndefOr[String] = js.undefined,
      OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined,
      DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined,
      Persistent: js.UndefOr[Boolean] = js.undefined
    ): Option = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Permanent" -> Permanent.map { x => x: js.Any }),
        ("OptionName" -> OptionName.map { x => x: js.Any }),
        ("OptionDescription" -> OptionDescription.map { x => x: js.Any }),
        ("OptionSettings" -> OptionSettings.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("VpcSecurityGroupMemberships" -> VpcSecurityGroupMemberships.map { x => x: js.Any }),
        ("DBSecurityGroupMemberships" -> DBSecurityGroupMemberships.map { x => x: js.Any }),
        ("Persistent" -> Persistent.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Option]
    }
  }

  /**
   * <p> A list of all available options </p>
   */
  @js.native
  trait OptionConfiguration extends js.Object {
    var OptionName: String
    var OptionSettings: OptionSettingsList
    var Port: IntegerOptional
    var VpcSecurityGroupMemberships: VpcSecurityGroupIdList
    var DBSecurityGroupMemberships: DBSecurityGroupNameList
  }

  object OptionConfiguration {
    def apply(
      OptionName: js.UndefOr[String] = js.undefined,
      OptionSettings: js.UndefOr[OptionSettingsList] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupIdList] = js.undefined,
      DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupNameList] = js.undefined
    ): OptionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionName" -> OptionName.map { x => x: js.Any }),
        ("OptionSettings" -> OptionSettings.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("VpcSecurityGroupMemberships" -> VpcSecurityGroupMemberships.map { x => x: js.Any }),
        ("DBSecurityGroupMemberships" -> DBSecurityGroupMemberships.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionConfiguration]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait OptionGroup extends js.Object {
    var MajorEngineVersion: String
    var OptionGroupName: String
    var EngineName: String
    var AllowsVpcAndNonVpcInstanceMemberships: Boolean
    var Options: OptionsList
    var OptionGroupDescription: String
    var VpcId: String
  }

  object OptionGroup {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.undefined,
      Options: js.UndefOr[OptionsList] = js.undefined,
      OptionGroupDescription: js.UndefOr[String] = js.undefined,
      VpcId: js.UndefOr[String] = js.undefined
    ): OptionGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MajorEngineVersion" -> MajorEngineVersion.map { x => x: js.Any }),
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("EngineName" -> EngineName.map { x => x: js.Any }),
        ("AllowsVpcAndNonVpcInstanceMemberships" -> AllowsVpcAndNonVpcInstanceMemberships.map { x => x: js.Any }),
        ("Options" -> Options.map { x => x: js.Any }),
        ("OptionGroupDescription" -> OptionGroupDescription.map { x => x: js.Any }),
        ("VpcId" -> VpcId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroup]
    }
  }

  /**
   * <p> The option group you are trying to create already exists. </p>
   */
  @js.native
  trait OptionGroupAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Provides information on the option groups the DB instance is a member of. </p>
   */
  @js.native
  trait OptionGroupMembership extends js.Object {
    var OptionGroupName: String
    var Status: String
  }

  object OptionGroupMembership {
    def apply(
      OptionGroupName: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): OptionGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupMembership]
    }
  }

  /**
   * <p> The specified option group could not be found. </p>
   */
  @js.native
  trait OptionGroupNotFoundFaultException extends js.Object {

  }

  /**
   * <p> Available option. </p>
   */
  @js.native
  trait OptionGroupOption extends js.Object {
    var MajorEngineVersion: String
    var Name: String
    var Permanent: Boolean
    var OptionGroupOptionSettings: OptionGroupOptionSettingsList
    var PortRequired: Boolean
    var Description: String
    var EngineName: String
    var OptionsDependedOn: OptionsDependedOn
    var DefaultPort: IntegerOptional
    var MinimumRequiredMinorEngineVersion: String
    var Persistent: Boolean
  }

  object OptionGroupOption {
    def apply(
      MajorEngineVersion: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      Permanent: js.UndefOr[Boolean] = js.undefined,
      OptionGroupOptionSettings: js.UndefOr[OptionGroupOptionSettingsList] = js.undefined,
      PortRequired: js.UndefOr[Boolean] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      EngineName: js.UndefOr[String] = js.undefined,
      OptionsDependedOn: js.UndefOr[OptionsDependedOn] = js.undefined,
      DefaultPort: js.UndefOr[IntegerOptional] = js.undefined,
      MinimumRequiredMinorEngineVersion: js.UndefOr[String] = js.undefined,
      Persistent: js.UndefOr[Boolean] = js.undefined
    ): OptionGroupOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MajorEngineVersion" -> MajorEngineVersion.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("Permanent" -> Permanent.map { x => x: js.Any }),
        ("OptionGroupOptionSettings" -> OptionGroupOptionSettings.map { x => x: js.Any }),
        ("PortRequired" -> PortRequired.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EngineName" -> EngineName.map { x => x: js.Any }),
        ("OptionsDependedOn" -> OptionsDependedOn.map { x => x: js.Any }),
        ("DefaultPort" -> DefaultPort.map { x => x: js.Any }),
        ("MinimumRequiredMinorEngineVersion" -> MinimumRequiredMinorEngineVersion.map { x => x: js.Any }),
        ("Persistent" -> Persistent.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupOption]
    }
  }

  /**
   * <p>Option group option settings are used to display settings available for each option with their default values and other information. These values are used with the DescribeOptionGroupOptions action. </p>
   */
  @js.native
  trait OptionGroupOptionSetting extends js.Object {
    var IsModifiable: Boolean
    var ApplyType: String
    var SettingName: String
    var SettingDescription: String
    var AllowedValues: String
    var DefaultValue: String
  }

  object OptionGroupOptionSetting {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      ApplyType: js.UndefOr[String] = js.undefined,
      SettingName: js.UndefOr[String] = js.undefined,
      SettingDescription: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      DefaultValue: js.UndefOr[String] = js.undefined
    ): OptionGroupOptionSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsModifiable" -> IsModifiable.map { x => x: js.Any }),
        ("ApplyType" -> ApplyType.map { x => x: js.Any }),
        ("SettingName" -> SettingName.map { x => x: js.Any }),
        ("SettingDescription" -> SettingDescription.map { x => x: js.Any }),
        ("AllowedValues" -> AllowedValues.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupOptionSetting]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait OptionGroupOptionsMessage extends js.Object {
    var OptionGroupOptions: OptionGroupOptionsList
    var Marker: String
  }

  object OptionGroupOptionsMessage {
    def apply(
      OptionGroupOptions: js.UndefOr[OptionGroupOptionsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): OptionGroupOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionGroupOptions" -> OptionGroupOptions.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroupOptionsMessage]
    }
  }

  /**
   * <p> The quota of 20 option groups was exceeded for this AWS account. </p>
   */
  @js.native
  trait OptionGroupQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> List of option groups. </p>
   */
  @js.native
  trait OptionGroups extends js.Object {
    var OptionGroupsList: OptionGroupsList
    var Marker: String
  }

  object OptionGroups {
    def apply(
      OptionGroupsList: js.UndefOr[OptionGroupsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): OptionGroups = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionGroupsList" -> OptionGroupsList.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionGroups]
    }
  }

  /**
   * <p> Option settings are the actual settings being applied or configured for that option. It is used when you modify an option group or describe option groups. For example, the NATIVE_NETWORK_ENCRYPTION option has a setting called SQLNET.ENCRYPTION_SERVER that can have several different values. </p>
   */
  @js.native
  trait OptionSetting extends js.Object {
    var IsModifiable: Boolean
    var Name: String
    var ApplyType: String
    var Description: String
    var IsCollection: Boolean
    var Value: String
    var AllowedValues: String
    var DefaultValue: String
    var DataType: String
  }

  object OptionSetting {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      ApplyType: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      IsCollection: js.UndefOr[Boolean] = js.undefined,
      Value: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      DefaultValue: js.UndefOr[String] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined
    ): OptionSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsModifiable" -> IsModifiable.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("ApplyType" -> ApplyType.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("IsCollection" -> IsCollection.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("AllowedValues" -> AllowedValues.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("DataType" -> DataType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionSetting]
    }
  }

  /**
   * <p> Contains a list of available options for a DB instance </p> <p> This data type is used as a response element in the <a>DescribeOrderableDBInstanceOptions</a> action. </p>
   */
  @js.native
  trait OrderableDBInstanceOption extends js.Object {
    var SupportsIops: Boolean
    var DBInstanceClass: String
    var Engine: String
    var MultiAZCapable: Boolean
    var EngineVersion: String
    var ReadReplicaCapable: Boolean
    var SupportsStorageEncryption: Boolean
    var StorageType: String
    var Vpc: Boolean
    var LicenseModel: String
    var AvailabilityZones: AvailabilityZoneList
  }

  object OrderableDBInstanceOption {
    def apply(
      SupportsIops: js.UndefOr[Boolean] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      MultiAZCapable: js.UndefOr[Boolean] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined,
      SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Vpc: js.UndefOr[Boolean] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
    ): OrderableDBInstanceOption = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SupportsIops" -> SupportsIops.map { x => x: js.Any }),
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("MultiAZCapable" -> MultiAZCapable.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("ReadReplicaCapable" -> ReadReplicaCapable.map { x => x: js.Any }),
        ("SupportsStorageEncryption" -> SupportsStorageEncryption.map { x => x: js.Any }),
        ("StorageType" -> StorageType.map { x => x: js.Any }),
        ("Vpc" -> Vpc.map { x => x: js.Any }),
        ("LicenseModel" -> LicenseModel.map { x => x: js.Any }),
        ("AvailabilityZones" -> AvailabilityZones.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableDBInstanceOption]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeOrderableDBInstanceOptions</a> action. </p>
   */
  @js.native
  trait OrderableDBInstanceOptionsMessage extends js.Object {
    var OrderableDBInstanceOptions: OrderableDBInstanceOptionsList
    var Marker: String
  }

  object OrderableDBInstanceOptionsMessage {
    def apply(
      OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): OrderableDBInstanceOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OrderableDBInstanceOptions" -> OrderableDBInstanceOptions.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OrderableDBInstanceOptionsMessage]
    }
  }

  /**
   * <p> This data type is used as a request parameter in the <a>ModifyDBParameterGroup</a> and <a>ResetDBParameterGroup</a> actions. </p> <p>This data type is used as a response element in the <a>DescribeEngineDefaultParameters</a> and <a>DescribeDBParameters</a> actions.</p>
   */
  @js.native
  trait Parameter extends js.Object {
    var IsModifiable: Boolean
    var ApplyType: String
    var Description: String
    var AllowedValues: String
    var Source: String
    var ApplyMethod: ApplyMethod
    var MinimumEngineVersion: String
    var ParameterValue: String
    var ParameterName: String
    var DataType: String
  }

  object Parameter {
    def apply(
      IsModifiable: js.UndefOr[Boolean] = js.undefined,
      ApplyType: js.UndefOr[String] = js.undefined,
      Description: js.UndefOr[String] = js.undefined,
      AllowedValues: js.UndefOr[String] = js.undefined,
      Source: js.UndefOr[String] = js.undefined,
      ApplyMethod: js.UndefOr[ApplyMethod] = js.undefined,
      MinimumEngineVersion: js.UndefOr[String] = js.undefined,
      ParameterValue: js.UndefOr[String] = js.undefined,
      ParameterName: js.UndefOr[String] = js.undefined,
      DataType: js.UndefOr[String] = js.undefined
    ): Parameter = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IsModifiable" -> IsModifiable.map { x => x: js.Any }),
        ("ApplyType" -> ApplyType.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("AllowedValues" -> AllowedValues.map { x => x: js.Any }),
        ("Source" -> Source.map { x => x: js.Any }),
        ("ApplyMethod" -> ApplyMethod.map { x => x: js.Any }),
        ("MinimumEngineVersion" -> MinimumEngineVersion.map { x => x: js.Any }),
        ("ParameterValue" -> ParameterValue.map { x => x: js.Any }),
        ("ParameterName" -> ParameterName.map { x => x: js.Any }),
        ("DataType" -> DataType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Parameter]
    }
  }

  /**
   * <p>Provides information about a pending maintenance action for a resource.</p>
   */
  @js.native
  trait PendingMaintenanceAction extends js.Object {
    var Description: String
    var OptInStatus: String
    var AutoAppliedAfterDate: TStamp
    var ForcedApplyDate: TStamp
    var Action: String
    var CurrentApplyDate: TStamp
  }

  object PendingMaintenanceAction {
    def apply(
      Description: js.UndefOr[String] = js.undefined,
      OptInStatus: js.UndefOr[String] = js.undefined,
      AutoAppliedAfterDate: js.UndefOr[TStamp] = js.undefined,
      ForcedApplyDate: js.UndefOr[TStamp] = js.undefined,
      Action: js.UndefOr[String] = js.undefined,
      CurrentApplyDate: js.UndefOr[TStamp] = js.undefined
    ): PendingMaintenanceAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("OptInStatus" -> OptInStatus.map { x => x: js.Any }),
        ("AutoAppliedAfterDate" -> AutoAppliedAfterDate.map { x => x: js.Any }),
        ("ForcedApplyDate" -> ForcedApplyDate.map { x => x: js.Any }),
        ("Action" -> Action.map { x => x: js.Any }),
        ("CurrentApplyDate" -> CurrentApplyDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingMaintenanceAction]
    }
  }

  /**
   * <p>Data returned from the <b>DescribePendingMaintenanceActions</b> action.</p>
   */
  @js.native
  trait PendingMaintenanceActionsMessage extends js.Object {
    var PendingMaintenanceActions: PendingMaintenanceActions
    var Marker: String
  }

  object PendingMaintenanceActionsMessage {
    def apply(
      PendingMaintenanceActions: js.UndefOr[PendingMaintenanceActions] = js.undefined,
      Marker: js.UndefOr[String] = js.undefined
    ): PendingMaintenanceActionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PendingMaintenanceActions" -> PendingMaintenanceActions.map { x => x: js.Any }),
        ("Marker" -> Marker.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingMaintenanceActionsMessage]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>ModifyDBInstance</a> action. </p>
   */
  @js.native
  trait PendingModifiedValues extends js.Object {
    var DBInstanceClass: String
    var MultiAZ: BooleanOptional
    var AllocatedStorage: IntegerOptional
    var DBInstanceIdentifier: String
    var BackupRetentionPeriod: IntegerOptional
    var EngineVersion: String
    var Port: IntegerOptional
    var MasterUserPassword: String
    var Iops: IntegerOptional
    var StorageType: String
    var CACertificateIdentifier: String
  }

  object PendingModifiedValues {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      EngineVersion: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      MasterUserPassword: js.UndefOr[String] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      CACertificateIdentifier: js.UndefOr[String] = js.undefined
    ): PendingModifiedValues = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("AllocatedStorage" -> AllocatedStorage.map { x => x: js.Any }),
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x: js.Any }),
        ("EngineVersion" -> EngineVersion.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("MasterUserPassword" -> MasterUserPassword.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("StorageType" -> StorageType.map { x => x: js.Any }),
        ("CACertificateIdentifier" -> CACertificateIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingModifiedValues]
    }
  }

  /**
   * <p> <i>SourceDBInstanceIdentifier</i> refers to a DB instance with <i>BackupRetentionPeriod</i> equal to 0. </p>
   */
  @js.native
  trait PointInTimeRestoreNotEnabledFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait PromoteReadReplicaMessage extends js.Object {
    var DBInstanceIdentifier: String
    var BackupRetentionPeriod: IntegerOptional
    var PreferredBackupWindow: String
  }

  object PromoteReadReplicaMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
      PreferredBackupWindow: js.UndefOr[String] = js.undefined
    ): PromoteReadReplicaMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("BackupRetentionPeriod" -> BackupRetentionPeriod.map { x => x: js.Any }),
        ("PreferredBackupWindow" -> PreferredBackupWindow.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaMessage]
    }
  }

  @js.native
  trait PromoteReadReplicaResult extends js.Object {
    var DBInstance: DBInstance
  }

  object PromoteReadReplicaResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): PromoteReadReplicaResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstance" -> DBInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PromoteReadReplicaResult]
    }
  }

  /**
   * <p> Provisioned IOPS not available in the specified Availability Zone. </p>
   */
  @js.native
  trait ProvisionedIopsNotAvailableInAZFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait PurchaseReservedDBInstancesOfferingMessage extends js.Object {
    var ReservedDBInstancesOfferingId: String
    var ReservedDBInstanceId: String
    var DBInstanceCount: IntegerOptional
    var Tags: TagList
  }

  object PurchaseReservedDBInstancesOfferingMessage {
    def apply(
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
      DBInstanceCount: js.UndefOr[IntegerOptional] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined
    ): PurchaseReservedDBInstancesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x: js.Any }),
        ("ReservedDBInstanceId" -> ReservedDBInstanceId.map { x => x: js.Any }),
        ("DBInstanceCount" -> DBInstanceCount.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedDBInstancesOfferingMessage]
    }
  }

  @js.native
  trait PurchaseReservedDBInstancesOfferingResult extends js.Object {
    var ReservedDBInstance: ReservedDBInstance
  }

  object PurchaseReservedDBInstancesOfferingResult {
    def apply(
      ReservedDBInstance: js.UndefOr[ReservedDBInstance] = js.undefined
    ): PurchaseReservedDBInstancesOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReservedDBInstance" -> ReservedDBInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseReservedDBInstancesOfferingResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait RebootDBInstanceMessage extends js.Object {
    var DBInstanceIdentifier: String
    var ForceFailover: BooleanOptional
  }

  object RebootDBInstanceMessage {
    def apply(
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
    ): RebootDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("ForceFailover" -> ForceFailover.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootDBInstanceMessage]
    }
  }

  @js.native
  trait RebootDBInstanceResult extends js.Object {
    var DBInstance: DBInstance
  }

  object RebootDBInstanceResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): RebootDBInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstance" -> DBInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootDBInstanceResult]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeReservedDBInstances</a> and <a>DescribeReservedDBInstancesOfferings</a> actions. </p>
   */
  @js.native
  trait RecurringCharge extends js.Object {
    var RecurringChargeAmount: Double
    var RecurringChargeFrequency: String
  }

  object RecurringCharge {
    def apply(
      RecurringChargeAmount: js.UndefOr[Double] = js.undefined,
      RecurringChargeFrequency: js.UndefOr[String] = js.undefined
    ): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RecurringChargeAmount" -> RecurringChargeAmount.map { x => x: js.Any }),
        ("RecurringChargeFrequency" -> RecurringChargeFrequency.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait RemoveSourceIdentifierFromSubscriptionMessage extends js.Object {
    var SubscriptionName: String
    var SourceIdentifier: String
  }

  object RemoveSourceIdentifierFromSubscriptionMessage {
    def apply(
      SubscriptionName: js.UndefOr[String] = js.undefined,
      SourceIdentifier: js.UndefOr[String] = js.undefined
    ): RemoveSourceIdentifierFromSubscriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionName" -> SubscriptionName.map { x => x: js.Any }),
        ("SourceIdentifier" -> SourceIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveSourceIdentifierFromSubscriptionMessage]
    }
  }

  @js.native
  trait RemoveSourceIdentifierFromSubscriptionResult extends js.Object {
    var EventSubscription: EventSubscription
  }

  object RemoveSourceIdentifierFromSubscriptionResult {
    def apply(
      EventSubscription: js.UndefOr[EventSubscription] = js.undefined
    ): RemoveSourceIdentifierFromSubscriptionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EventSubscription" -> EventSubscription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveSourceIdentifierFromSubscriptionResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait RemoveTagsFromResourceMessage extends js.Object {
    var ResourceName: String
    var TagKeys: KeyList
  }

  object RemoveTagsFromResourceMessage {
    def apply(
      ResourceName: js.UndefOr[String] = js.undefined,
      TagKeys: js.UndefOr[KeyList] = js.undefined
    ): RemoveTagsFromResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceName" -> ResourceName.map { x => x: js.Any }),
        ("TagKeys" -> TagKeys.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsFromResourceMessage]
    }
  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeReservedDBInstances</a> and <a>PurchaseReservedDBInstancesOffering</a> actions. </p>
   */
  @js.native
  trait ReservedDBInstance extends js.Object {
    var DBInstanceClass: String
    var CurrencyCode: String
    var Duration: Integer
    var FixedPrice: Double
    var MultiAZ: Boolean
    var RecurringCharges: RecurringChargeList
    var StartTime: TStamp
    var OfferingType: String
    var DBInstanceCount: Integer
    var UsagePrice: Double
    var ReservedDBInstancesOfferingId: String
    var ReservedDBInstanceId: String
    var State: String
    var ProductDescription: String
  }

  object ReservedDBInstance {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Integer] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      StartTime: js.UndefOr[TStamp] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      DBInstanceCount: js.UndefOr[Integer] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ReservedDBInstanceId: js.UndefOr[String] = js.undefined,
      State: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined
    ): ReservedDBInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("FixedPrice" -> FixedPrice.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("RecurringCharges" -> RecurringCharges.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("DBInstanceCount" -> DBInstanceCount.map { x => x: js.Any }),
        ("UsagePrice" -> UsagePrice.map { x => x: js.Any }),
        ("ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x: js.Any }),
        ("ReservedDBInstanceId" -> ReservedDBInstanceId.map { x => x: js.Any }),
        ("State" -> State.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstance]
    }
  }

  /**
   * <p> User already has a reservation with the given identifier. </p>
   */
  @js.native
  trait ReservedDBInstanceAlreadyExistsFaultException extends js.Object {

  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeReservedDBInstances</a> action. </p>
   */
  @js.native
  trait ReservedDBInstanceMessage extends js.Object {
    var Marker: String
    var ReservedDBInstances: ReservedDBInstanceList
  }

  object ReservedDBInstanceMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.undefined
    ): ReservedDBInstanceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ReservedDBInstances" -> ReservedDBInstances.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstanceMessage]
    }
  }

  /**
   * <p> The specified reserved DB Instance not found. </p>
   */
  @js.native
  trait ReservedDBInstanceNotFoundFaultException extends js.Object {

  }

  /**
   * <p> Request would exceed the user's DB Instance quota. </p>
   */
  @js.native
  trait ReservedDBInstanceQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeReservedDBInstancesOfferings</a> action. </p>
   */
  @js.native
  trait ReservedDBInstancesOffering extends js.Object {
    var DBInstanceClass: String
    var CurrencyCode: String
    var Duration: Integer
    var FixedPrice: Double
    var MultiAZ: Boolean
    var RecurringCharges: RecurringChargeList
    var OfferingType: String
    var UsagePrice: Double
    var ReservedDBInstancesOfferingId: String
    var ProductDescription: String
  }

  object ReservedDBInstancesOffering {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      CurrencyCode: js.UndefOr[String] = js.undefined,
      Duration: js.UndefOr[Integer] = js.undefined,
      FixedPrice: js.UndefOr[Double] = js.undefined,
      MultiAZ: js.UndefOr[Boolean] = js.undefined,
      RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined,
      OfferingType: js.UndefOr[String] = js.undefined,
      UsagePrice: js.UndefOr[Double] = js.undefined,
      ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined,
      ProductDescription: js.UndefOr[String] = js.undefined
    ): ReservedDBInstancesOffering = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("CurrencyCode" -> CurrencyCode.map { x => x: js.Any }),
        ("Duration" -> Duration.map { x => x: js.Any }),
        ("FixedPrice" -> FixedPrice.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("RecurringCharges" -> RecurringCharges.map { x => x: js.Any }),
        ("OfferingType" -> OfferingType.map { x => x: js.Any }),
        ("UsagePrice" -> UsagePrice.map { x => x: js.Any }),
        ("ReservedDBInstancesOfferingId" -> ReservedDBInstancesOfferingId.map { x => x: js.Any }),
        ("ProductDescription" -> ProductDescription.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstancesOffering]
    }
  }

  /**
   * <p> Contains the result of a successful invocation of the <a>DescribeReservedDBInstancesOfferings</a> action. </p>
   */
  @js.native
  trait ReservedDBInstancesOfferingMessage extends js.Object {
    var Marker: String
    var ReservedDBInstancesOfferings: ReservedDBInstancesOfferingList
  }

  object ReservedDBInstancesOfferingMessage {
    def apply(
      Marker: js.UndefOr[String] = js.undefined,
      ReservedDBInstancesOfferings: js.UndefOr[ReservedDBInstancesOfferingList] = js.undefined
    ): ReservedDBInstancesOfferingMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Marker" -> Marker.map { x => x: js.Any }),
        ("ReservedDBInstancesOfferings" -> ReservedDBInstancesOfferings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ReservedDBInstancesOfferingMessage]
    }
  }

  /**
   * <p> Specified offering does not exist. </p>
   */
  @js.native
  trait ReservedDBInstancesOfferingNotFoundFaultException extends js.Object {

  }

  /**
   * <p></p>
   */
  @js.native
  trait ResetDBParameterGroupMessage extends js.Object {
    var DBParameterGroupName: String
    var ResetAllParameters: Boolean
    var Parameters: ParametersList
  }

  object ResetDBParameterGroupMessage {
    def apply(
      DBParameterGroupName: js.UndefOr[String] = js.undefined,
      ResetAllParameters: js.UndefOr[Boolean] = js.undefined,
      Parameters: js.UndefOr[ParametersList] = js.undefined
    ): ResetDBParameterGroupMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBParameterGroupName" -> DBParameterGroupName.map { x => x: js.Any }),
        ("ResetAllParameters" -> ResetAllParameters.map { x => x: js.Any }),
        ("Parameters" -> Parameters.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetDBParameterGroupMessage]
    }
  }

  /**
   * <p>The specified resource ID was not found. </p>
   */
  @js.native
  trait ResourceNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Describes the pending maintenance actions for a resource.</p>
   */
  @js.native
  trait ResourcePendingMaintenanceActions extends js.Object {
    var ResourceIdentifier: String
    var PendingMaintenanceActionDetails: PendingMaintenanceActionDetails
  }

  object ResourcePendingMaintenanceActions {
    def apply(
      ResourceIdentifier: js.UndefOr[String] = js.undefined,
      PendingMaintenanceActionDetails: js.UndefOr[PendingMaintenanceActionDetails] = js.undefined
    ): ResourcePendingMaintenanceActions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceIdentifier" -> ResourceIdentifier.map { x => x: js.Any }),
        ("PendingMaintenanceActionDetails" -> PendingMaintenanceActionDetails.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourcePendingMaintenanceActions]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait RestoreDBInstanceFromDBSnapshotMessage extends js.Object {
    var DBInstanceClass: String
    var TdeCredentialPassword: String
    var Engine: String
    var OptionGroupName: String
    var MultiAZ: BooleanOptional
    var DBName: String
    var DBInstanceIdentifier: String
    var AvailabilityZone: String
    var AutoMinorVersionUpgrade: BooleanOptional
    var DBSubnetGroupName: String
    var Port: IntegerOptional
    var Iops: IntegerOptional
    var StorageType: String
    var Tags: TagList
    var PubliclyAccessible: BooleanOptional
    var LicenseModel: String
    var TdeCredentialArn: String
    var DBSnapshotIdentifier: String
  }

  object RestoreDBInstanceFromDBSnapshotMessage {
    def apply(
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      DBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined,
      DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
    ): RestoreDBInstanceFromDBSnapshotMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("TdeCredentialPassword" -> TdeCredentialPassword.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("DBName" -> DBName.map { x => x: js.Any }),
        ("DBInstanceIdentifier" -> DBInstanceIdentifier.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("DBSubnetGroupName" -> DBSubnetGroupName.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("StorageType" -> StorageType.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("PubliclyAccessible" -> PubliclyAccessible.map { x => x: js.Any }),
        ("LicenseModel" -> LicenseModel.map { x => x: js.Any }),
        ("TdeCredentialArn" -> TdeCredentialArn.map { x => x: js.Any }),
        ("DBSnapshotIdentifier" -> DBSnapshotIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromDBSnapshotMessage]
    }
  }

  @js.native
  trait RestoreDBInstanceFromDBSnapshotResult extends js.Object {
    var DBInstance: DBInstance
  }

  object RestoreDBInstanceFromDBSnapshotResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): RestoreDBInstanceFromDBSnapshotResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstance" -> DBInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceFromDBSnapshotResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait RestoreDBInstanceToPointInTimeMessage extends js.Object {
    var TargetDBInstanceIdentifier: String
    var DBInstanceClass: String
    var TdeCredentialPassword: String
    var Engine: String
    var RestoreTime: TStamp
    var OptionGroupName: String
    var MultiAZ: BooleanOptional
    var DBName: String
    var SourceDBInstanceIdentifier: String
    var AvailabilityZone: String
    var AutoMinorVersionUpgrade: BooleanOptional
    var DBSubnetGroupName: String
    var Port: IntegerOptional
    var Iops: IntegerOptional
    var StorageType: String
    var UseLatestRestorableTime: Boolean
    var Tags: TagList
    var PubliclyAccessible: BooleanOptional
    var LicenseModel: String
    var TdeCredentialArn: String
  }

  object RestoreDBInstanceToPointInTimeMessage {
    def apply(
      TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      DBInstanceClass: js.UndefOr[String] = js.undefined,
      TdeCredentialPassword: js.UndefOr[String] = js.undefined,
      Engine: js.UndefOr[String] = js.undefined,
      RestoreTime: js.UndefOr[TStamp] = js.undefined,
      OptionGroupName: js.UndefOr[String] = js.undefined,
      MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
      DBName: js.UndefOr[String] = js.undefined,
      SourceDBInstanceIdentifier: js.UndefOr[String] = js.undefined,
      AvailabilityZone: js.UndefOr[String] = js.undefined,
      AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
      DBSubnetGroupName: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[IntegerOptional] = js.undefined,
      Iops: js.UndefOr[IntegerOptional] = js.undefined,
      StorageType: js.UndefOr[String] = js.undefined,
      UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined,
      Tags: js.UndefOr[TagList] = js.undefined,
      PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
      LicenseModel: js.UndefOr[String] = js.undefined,
      TdeCredentialArn: js.UndefOr[String] = js.undefined
    ): RestoreDBInstanceToPointInTimeMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TargetDBInstanceIdentifier" -> TargetDBInstanceIdentifier.map { x => x: js.Any }),
        ("DBInstanceClass" -> DBInstanceClass.map { x => x: js.Any }),
        ("TdeCredentialPassword" -> TdeCredentialPassword.map { x => x: js.Any }),
        ("Engine" -> Engine.map { x => x: js.Any }),
        ("RestoreTime" -> RestoreTime.map { x => x: js.Any }),
        ("OptionGroupName" -> OptionGroupName.map { x => x: js.Any }),
        ("MultiAZ" -> MultiAZ.map { x => x: js.Any }),
        ("DBName" -> DBName.map { x => x: js.Any }),
        ("SourceDBInstanceIdentifier" -> SourceDBInstanceIdentifier.map { x => x: js.Any }),
        ("AvailabilityZone" -> AvailabilityZone.map { x => x: js.Any }),
        ("AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x => x: js.Any }),
        ("DBSubnetGroupName" -> DBSubnetGroupName.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any }),
        ("Iops" -> Iops.map { x => x: js.Any }),
        ("StorageType" -> StorageType.map { x => x: js.Any }),
        ("UseLatestRestorableTime" -> UseLatestRestorableTime.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("PubliclyAccessible" -> PubliclyAccessible.map { x => x: js.Any }),
        ("LicenseModel" -> LicenseModel.map { x => x: js.Any }),
        ("TdeCredentialArn" -> TdeCredentialArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceToPointInTimeMessage]
    }
  }

  @js.native
  trait RestoreDBInstanceToPointInTimeResult extends js.Object {
    var DBInstance: DBInstance
  }

  object RestoreDBInstanceToPointInTimeResult {
    def apply(
      DBInstance: js.UndefOr[DBInstance] = js.undefined
    ): RestoreDBInstanceToPointInTimeResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBInstance" -> DBInstance.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestoreDBInstanceToPointInTimeResult]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait RevokeDBSecurityGroupIngressMessage extends js.Object {
    var CIDRIP: String
    var EC2SecurityGroupId: String
    var EC2SecurityGroupName: String
    var DBSecurityGroupName: String
    var EC2SecurityGroupOwnerId: String
  }

  object RevokeDBSecurityGroupIngressMessage {
    def apply(
      CIDRIP: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupId: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupName: js.UndefOr[String] = js.undefined,
      DBSecurityGroupName: js.UndefOr[String] = js.undefined,
      EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
    ): RevokeDBSecurityGroupIngressMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CIDRIP" -> CIDRIP.map { x => x: js.Any }),
        ("EC2SecurityGroupId" -> EC2SecurityGroupId.map { x => x: js.Any }),
        ("EC2SecurityGroupName" -> EC2SecurityGroupName.map { x => x: js.Any }),
        ("DBSecurityGroupName" -> DBSecurityGroupName.map { x => x: js.Any }),
        ("EC2SecurityGroupOwnerId" -> EC2SecurityGroupOwnerId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeDBSecurityGroupIngressMessage]
    }
  }

  @js.native
  trait RevokeDBSecurityGroupIngressResult extends js.Object {
    var DBSecurityGroup: DBSecurityGroup
  }

  object RevokeDBSecurityGroupIngressResult {
    def apply(
      DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
    ): RevokeDBSecurityGroupIngressResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DBSecurityGroup" -> DBSecurityGroup.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RevokeDBSecurityGroupIngressResult]
    }
  }

  /**
   * <p>SNS has responded that there is a problem with the SND topic specified.</p>
   */
  @js.native
  trait SNSInvalidTopicFaultException extends js.Object {

  }

  /**
   * <p>You do not have permission to publish to the SNS topic ARN.</p>
   */
  @js.native
  trait SNSNoAuthorizationFaultException extends js.Object {

  }

  /**
   * <p>The SNS topic ARN does not exist.</p>
   */
  @js.native
  trait SNSTopicArnNotFoundFaultException extends js.Object {

  }

  /**
   * <p> Request would result in user exceeding the allowed number of DB snapshots. </p>
   */
  @js.native
  trait SnapshotQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p>The requested source could not be found.</p>
   */
  @js.native
  trait SourceNotFoundFaultException extends js.Object {

  }


  object SourceTypeEnum {
    val `db-instance` = "db-instance"
    val `db-parameter-group` = "db-parameter-group"
    val `db-security-group` = "db-security-group"
    val `db-snapshot` = "db-snapshot"

    val values = IndexedSeq(`db-instance`, `db-parameter-group`, `db-security-group`, `db-snapshot`)
  }

  /**
   * <p> Request would result in user exceeding the allowed amount of storage available across all DB instances. </p>
   */
  @js.native
  trait StorageQuotaExceededFaultException extends js.Object {

  }

  /**
   * <p> <i>StorageType</i> specified cannot be associated with the DB Instance. </p>
   */
  @js.native
  trait StorageTypeNotSupportedFaultException extends js.Object {

  }

  /**
   * <p> This data type is used as a response element in the <a>DescribeDBSubnetGroups</a> action. </p>
   */
  @js.native
  trait Subnet extends js.Object {
    var SubnetIdentifier: String
    var SubnetAvailabilityZone: AvailabilityZone
    var SubnetStatus: String
  }

  object Subnet {
    def apply(
      SubnetIdentifier: js.UndefOr[String] = js.undefined,
      SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
      SubnetStatus: js.UndefOr[String] = js.undefined
    ): Subnet = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubnetIdentifier" -> SubnetIdentifier.map { x => x: js.Any }),
        ("SubnetAvailabilityZone" -> SubnetAvailabilityZone.map { x => x: js.Any }),
        ("SubnetStatus" -> SubnetStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subnet]
    }
  }

  /**
   * <p> The DB subnet is already in use in the Availability Zone. </p>
   */
  @js.native
  trait SubnetAlreadyInUseException extends js.Object {

  }

  /**
   * <p>The supplied subscription name already exists.</p>
   */
  @js.native
  trait SubscriptionAlreadyExistFaultException extends js.Object {

  }

  /**
   * <p>The supplied category does not exist.</p>
   */
  @js.native
  trait SubscriptionCategoryNotFoundFaultException extends js.Object {

  }

  /**
   * <p>The subscription name does not exist.</p>
   */
  @js.native
  trait SubscriptionNotFoundFaultException extends js.Object {

  }

  /**
   * <p>Metadata assigned to an Amazon RDS resource consisting of a key-value pair.</p>
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
   * <p></p>
   */
  @js.native
  trait TagListMessage extends js.Object {
    var TagList: TagList
  }

  object TagListMessage {
    def apply(
      TagList: js.UndefOr[TagList] = js.undefined
    ): TagListMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TagList" -> TagList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TagListMessage]
    }
  }

  /**
   * <p>This data type is used as a response element for queries on VPC security group membership.</p>
   */
  @js.native
  trait VpcSecurityGroupMembership extends js.Object {
    var VpcSecurityGroupId: String
    var Status: String
  }

  object VpcSecurityGroupMembership {
    def apply(
      VpcSecurityGroupId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[String] = js.undefined
    ): VpcSecurityGroupMembership = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("VpcSecurityGroupId" -> VpcSecurityGroupId.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcSecurityGroupMembership]
    }
  }
}
