package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object ssoadmin {
  type AccessControlAttributeKey = String
  type AccessControlAttributeList = js.Array[AccessControlAttribute]
  type AccessControlAttributeValueSource = String
  type AccessControlAttributeValueSourceList = js.Array[AccessControlAttributeValueSource]
  type AccountAssignmentList = js.Array[AccountAssignment]
  type AccountAssignmentOperationStatusList = js.Array[AccountAssignmentOperationStatusMetadata]
  type AccountId = String
  type AccountList = js.Array[AccountId]
  type AttachedManagedPolicyList = js.Array[AttachedManagedPolicy]
  type Date = js.Date
  type Duration = String
  type GeneralArn = String
  type Id = String
  type InstanceAccessControlAttributeConfigurationStatusReason = String
  type InstanceArn = String
  type InstanceList = js.Array[InstanceMetadata]
  type ManagedPolicyArn = String
  type MaxResults = Int
  type Name = String
  type PermissionSetArn = String
  type PermissionSetDescription = String
  type PermissionSetList = js.Array[PermissionSetArn]
  type PermissionSetName = String
  type PermissionSetPolicyDocument = String
  type PermissionSetProvisioningStatusList = js.Array[PermissionSetProvisioningStatusMetadata]
  type PrincipalId = String
  type Reason = String
  type RelayState = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetId = String
  type Token = String
  type UUId = String

  final class SSOAdminOps(private val service: SSOAdmin) extends AnyVal {

    @inline def attachManagedPolicyToPermissionSetFuture(params: AttachManagedPolicyToPermissionSetRequest): Future[AttachManagedPolicyToPermissionSetResponse] = service.attachManagedPolicyToPermissionSet(params).promise().toFuture
    @inline def createAccountAssignmentFuture(params: CreateAccountAssignmentRequest): Future[CreateAccountAssignmentResponse] = service.createAccountAssignment(params).promise().toFuture
    @inline def createInstanceAccessControlAttributeConfigurationFuture(params: CreateInstanceAccessControlAttributeConfigurationRequest): Future[CreateInstanceAccessControlAttributeConfigurationResponse] = service.createInstanceAccessControlAttributeConfiguration(params).promise().toFuture
    @inline def createPermissionSetFuture(params: CreatePermissionSetRequest): Future[CreatePermissionSetResponse] = service.createPermissionSet(params).promise().toFuture
    @inline def deleteAccountAssignmentFuture(params: DeleteAccountAssignmentRequest): Future[DeleteAccountAssignmentResponse] = service.deleteAccountAssignment(params).promise().toFuture
    @inline def deleteInlinePolicyFromPermissionSetFuture(params: DeleteInlinePolicyFromPermissionSetRequest): Future[DeleteInlinePolicyFromPermissionSetResponse] = service.deleteInlinePolicyFromPermissionSet(params).promise().toFuture
    @inline def deleteInstanceAccessControlAttributeConfigurationFuture(params: DeleteInstanceAccessControlAttributeConfigurationRequest): Future[DeleteInstanceAccessControlAttributeConfigurationResponse] = service.deleteInstanceAccessControlAttributeConfiguration(params).promise().toFuture
    @inline def deletePermissionSetFuture(params: DeletePermissionSetRequest): Future[DeletePermissionSetResponse] = service.deletePermissionSet(params).promise().toFuture
    @inline def describeAccountAssignmentCreationStatusFuture(params: DescribeAccountAssignmentCreationStatusRequest): Future[DescribeAccountAssignmentCreationStatusResponse] = service.describeAccountAssignmentCreationStatus(params).promise().toFuture
    @inline def describeAccountAssignmentDeletionStatusFuture(params: DescribeAccountAssignmentDeletionStatusRequest): Future[DescribeAccountAssignmentDeletionStatusResponse] = service.describeAccountAssignmentDeletionStatus(params).promise().toFuture
    @inline def describeInstanceAccessControlAttributeConfigurationFuture(params: DescribeInstanceAccessControlAttributeConfigurationRequest): Future[DescribeInstanceAccessControlAttributeConfigurationResponse] = service.describeInstanceAccessControlAttributeConfiguration(params).promise().toFuture
    @inline def describePermissionSetFuture(params: DescribePermissionSetRequest): Future[DescribePermissionSetResponse] = service.describePermissionSet(params).promise().toFuture
    @inline def describePermissionSetProvisioningStatusFuture(params: DescribePermissionSetProvisioningStatusRequest): Future[DescribePermissionSetProvisioningStatusResponse] = service.describePermissionSetProvisioningStatus(params).promise().toFuture
    @inline def detachManagedPolicyFromPermissionSetFuture(params: DetachManagedPolicyFromPermissionSetRequest): Future[DetachManagedPolicyFromPermissionSetResponse] = service.detachManagedPolicyFromPermissionSet(params).promise().toFuture
    @inline def getInlinePolicyForPermissionSetFuture(params: GetInlinePolicyForPermissionSetRequest): Future[GetInlinePolicyForPermissionSetResponse] = service.getInlinePolicyForPermissionSet(params).promise().toFuture
    @inline def listAccountAssignmentCreationStatusFuture(params: ListAccountAssignmentCreationStatusRequest): Future[ListAccountAssignmentCreationStatusResponse] = service.listAccountAssignmentCreationStatus(params).promise().toFuture
    @inline def listAccountAssignmentDeletionStatusFuture(params: ListAccountAssignmentDeletionStatusRequest): Future[ListAccountAssignmentDeletionStatusResponse] = service.listAccountAssignmentDeletionStatus(params).promise().toFuture
    @inline def listAccountAssignmentsFuture(params: ListAccountAssignmentsRequest): Future[ListAccountAssignmentsResponse] = service.listAccountAssignments(params).promise().toFuture
    @inline def listAccountsForProvisionedPermissionSetFuture(params: ListAccountsForProvisionedPermissionSetRequest): Future[ListAccountsForProvisionedPermissionSetResponse] = service.listAccountsForProvisionedPermissionSet(params).promise().toFuture
    @inline def listInstancesFuture(params: ListInstancesRequest): Future[ListInstancesResponse] = service.listInstances(params).promise().toFuture
    @inline def listManagedPoliciesInPermissionSetFuture(params: ListManagedPoliciesInPermissionSetRequest): Future[ListManagedPoliciesInPermissionSetResponse] = service.listManagedPoliciesInPermissionSet(params).promise().toFuture
    @inline def listPermissionSetProvisioningStatusFuture(params: ListPermissionSetProvisioningStatusRequest): Future[ListPermissionSetProvisioningStatusResponse] = service.listPermissionSetProvisioningStatus(params).promise().toFuture
    @inline def listPermissionSetsFuture(params: ListPermissionSetsRequest): Future[ListPermissionSetsResponse] = service.listPermissionSets(params).promise().toFuture
    @inline def listPermissionSetsProvisionedToAccountFuture(params: ListPermissionSetsProvisionedToAccountRequest): Future[ListPermissionSetsProvisionedToAccountResponse] = service.listPermissionSetsProvisionedToAccount(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def provisionPermissionSetFuture(params: ProvisionPermissionSetRequest): Future[ProvisionPermissionSetResponse] = service.provisionPermissionSet(params).promise().toFuture
    @inline def putInlinePolicyToPermissionSetFuture(params: PutInlinePolicyToPermissionSetRequest): Future[PutInlinePolicyToPermissionSetResponse] = service.putInlinePolicyToPermissionSet(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateInstanceAccessControlAttributeConfigurationFuture(params: UpdateInstanceAccessControlAttributeConfigurationRequest): Future[UpdateInstanceAccessControlAttributeConfigurationResponse] = service.updateInstanceAccessControlAttributeConfiguration(params).promise().toFuture
    @inline def updatePermissionSetFuture(params: UpdatePermissionSetRequest): Future[UpdatePermissionSetResponse] = service.updatePermissionSet(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ssoadmin", JSImport.Namespace, "AWS.SSOAdmin")
  class SSOAdmin() extends js.Object {
    def this(config: AWSConfig) = this()

    def attachManagedPolicyToPermissionSet(params: AttachManagedPolicyToPermissionSetRequest): Request[AttachManagedPolicyToPermissionSetResponse] = js.native
    def createAccountAssignment(params: CreateAccountAssignmentRequest): Request[CreateAccountAssignmentResponse] = js.native
    def createInstanceAccessControlAttributeConfiguration(params: CreateInstanceAccessControlAttributeConfigurationRequest): Request[CreateInstanceAccessControlAttributeConfigurationResponse] = js.native
    def createPermissionSet(params: CreatePermissionSetRequest): Request[CreatePermissionSetResponse] = js.native
    def deleteAccountAssignment(params: DeleteAccountAssignmentRequest): Request[DeleteAccountAssignmentResponse] = js.native
    def deleteInlinePolicyFromPermissionSet(params: DeleteInlinePolicyFromPermissionSetRequest): Request[DeleteInlinePolicyFromPermissionSetResponse] = js.native
    def deleteInstanceAccessControlAttributeConfiguration(params: DeleteInstanceAccessControlAttributeConfigurationRequest): Request[DeleteInstanceAccessControlAttributeConfigurationResponse] = js.native
    def deletePermissionSet(params: DeletePermissionSetRequest): Request[DeletePermissionSetResponse] = js.native
    def describeAccountAssignmentCreationStatus(params: DescribeAccountAssignmentCreationStatusRequest): Request[DescribeAccountAssignmentCreationStatusResponse] = js.native
    def describeAccountAssignmentDeletionStatus(params: DescribeAccountAssignmentDeletionStatusRequest): Request[DescribeAccountAssignmentDeletionStatusResponse] = js.native
    def describeInstanceAccessControlAttributeConfiguration(params: DescribeInstanceAccessControlAttributeConfigurationRequest): Request[DescribeInstanceAccessControlAttributeConfigurationResponse] = js.native
    def describePermissionSet(params: DescribePermissionSetRequest): Request[DescribePermissionSetResponse] = js.native
    def describePermissionSetProvisioningStatus(params: DescribePermissionSetProvisioningStatusRequest): Request[DescribePermissionSetProvisioningStatusResponse] = js.native
    def detachManagedPolicyFromPermissionSet(params: DetachManagedPolicyFromPermissionSetRequest): Request[DetachManagedPolicyFromPermissionSetResponse] = js.native
    def getInlinePolicyForPermissionSet(params: GetInlinePolicyForPermissionSetRequest): Request[GetInlinePolicyForPermissionSetResponse] = js.native
    def listAccountAssignmentCreationStatus(params: ListAccountAssignmentCreationStatusRequest): Request[ListAccountAssignmentCreationStatusResponse] = js.native
    def listAccountAssignmentDeletionStatus(params: ListAccountAssignmentDeletionStatusRequest): Request[ListAccountAssignmentDeletionStatusResponse] = js.native
    def listAccountAssignments(params: ListAccountAssignmentsRequest): Request[ListAccountAssignmentsResponse] = js.native
    def listAccountsForProvisionedPermissionSet(params: ListAccountsForProvisionedPermissionSetRequest): Request[ListAccountsForProvisionedPermissionSetResponse] = js.native
    def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse] = js.native
    def listManagedPoliciesInPermissionSet(params: ListManagedPoliciesInPermissionSetRequest): Request[ListManagedPoliciesInPermissionSetResponse] = js.native
    def listPermissionSetProvisioningStatus(params: ListPermissionSetProvisioningStatusRequest): Request[ListPermissionSetProvisioningStatusResponse] = js.native
    def listPermissionSets(params: ListPermissionSetsRequest): Request[ListPermissionSetsResponse] = js.native
    def listPermissionSetsProvisionedToAccount(params: ListPermissionSetsProvisionedToAccountRequest): Request[ListPermissionSetsProvisionedToAccountResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def provisionPermissionSet(params: ProvisionPermissionSetRequest): Request[ProvisionPermissionSetResponse] = js.native
    def putInlinePolicyToPermissionSet(params: PutInlinePolicyToPermissionSetRequest): Request[PutInlinePolicyToPermissionSetResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateInstanceAccessControlAttributeConfiguration(params: UpdateInstanceAccessControlAttributeConfigurationRequest): Request[UpdateInstanceAccessControlAttributeConfigurationResponse] = js.native
    def updatePermissionSet(params: UpdatePermissionSetRequest): Request[UpdatePermissionSetResponse] = js.native
  }
  object SSOAdmin {
    @inline implicit def toOps(service: SSOAdmin): SSOAdminOps = {
      new SSOAdminOps(service)
    }
  }

  /** These are AWS SSO identity store attributes that you can configure for use in attributes-based access control (ABAC). You can create permission policies that determine who can access your AWS resources based upon the configured attribute value(s). When you enable ABAC and specify AccessControlAttributes, AWS SSO passes the attribute(s) value of the authenticated user into IAM for use in policy evaluation.
    */
  @js.native
  trait AccessControlAttribute extends js.Object {
    var Key: AccessControlAttributeKey
    var Value: AccessControlAttributeValue
  }

  object AccessControlAttribute {
    @inline
    def apply(
        Key: AccessControlAttributeKey,
        Value: AccessControlAttributeValue
    ): AccessControlAttribute = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccessControlAttribute]
    }
  }

  /** The value used for mapping a specified attribute to an identity source.
    */
  @js.native
  trait AccessControlAttributeValue extends js.Object {
    var Source: AccessControlAttributeValueSourceList
  }

  object AccessControlAttributeValue {
    @inline
    def apply(
        Source: AccessControlAttributeValueSourceList
    ): AccessControlAttributeValue = {
      val __obj = js.Dynamic.literal(
        "Source" -> Source.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AccessControlAttributeValue]
    }
  }

  /** The assignment that indicates a principal's limited access to a specified AWS account with a specified permission set.
    *
    * '''Note:'''The term <i>principal</i> here refers to a user or group that is defined in AWS SSO.
    */
  @js.native
  trait AccountAssignment extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var PermissionSetArn: js.UndefOr[PermissionSetArn]
    var PrincipalId: js.UndefOr[PrincipalId]
    var PrincipalType: js.UndefOr[PrincipalType]
  }

  object AccountAssignment {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        PermissionSetArn: js.UndefOr[PermissionSetArn] = js.undefined,
        PrincipalId: js.UndefOr[PrincipalId] = js.undefined,
        PrincipalType: js.UndefOr[PrincipalType] = js.undefined
    ): AccountAssignment = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      PermissionSetArn.foreach(__v => __obj.updateDynamic("PermissionSetArn")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      PrincipalType.foreach(__v => __obj.updateDynamic("PrincipalType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAssignment]
    }
  }

  /** The status of the creation or deletion operation of an assignment that a principal needs to access an account.
    */
  @js.native
  trait AccountAssignmentOperationStatus extends js.Object {
    var CreatedDate: js.UndefOr[Date]
    var FailureReason: js.UndefOr[Reason]
    var PermissionSetArn: js.UndefOr[PermissionSetArn]
    var PrincipalId: js.UndefOr[PrincipalId]
    var PrincipalType: js.UndefOr[PrincipalType]
    var RequestId: js.UndefOr[UUId]
    var Status: js.UndefOr[StatusValues]
    var TargetId: js.UndefOr[TargetId]
    var TargetType: js.UndefOr[TargetType]
  }

  object AccountAssignmentOperationStatus {
    @inline
    def apply(
        CreatedDate: js.UndefOr[Date] = js.undefined,
        FailureReason: js.UndefOr[Reason] = js.undefined,
        PermissionSetArn: js.UndefOr[PermissionSetArn] = js.undefined,
        PrincipalId: js.UndefOr[PrincipalId] = js.undefined,
        PrincipalType: js.UndefOr[PrincipalType] = js.undefined,
        RequestId: js.UndefOr[UUId] = js.undefined,
        Status: js.UndefOr[StatusValues] = js.undefined,
        TargetId: js.UndefOr[TargetId] = js.undefined,
        TargetType: js.UndefOr[TargetType] = js.undefined
    ): AccountAssignmentOperationStatus = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      PermissionSetArn.foreach(__v => __obj.updateDynamic("PermissionSetArn")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      PrincipalType.foreach(__v => __obj.updateDynamic("PrincipalType")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetId.foreach(__v => __obj.updateDynamic("TargetId")(__v.asInstanceOf[js.Any]))
      TargetType.foreach(__v => __obj.updateDynamic("TargetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAssignmentOperationStatus]
    }
  }

  /** Provides information about the <a>AccountAssignment</a> creation request.
    */
  @js.native
  trait AccountAssignmentOperationStatusMetadata extends js.Object {
    var CreatedDate: js.UndefOr[Date]
    var RequestId: js.UndefOr[UUId]
    var Status: js.UndefOr[StatusValues]
  }

  object AccountAssignmentOperationStatusMetadata {
    @inline
    def apply(
        CreatedDate: js.UndefOr[Date] = js.undefined,
        RequestId: js.UndefOr[UUId] = js.undefined,
        Status: js.UndefOr[StatusValues] = js.undefined
    ): AccountAssignmentOperationStatusMetadata = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountAssignmentOperationStatusMetadata]
    }
  }

  @js.native
  trait AttachManagedPolicyToPermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var ManagedPolicyArn: ManagedPolicyArn
    var PermissionSetArn: PermissionSetArn
  }

  object AttachManagedPolicyToPermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        ManagedPolicyArn: ManagedPolicyArn,
        PermissionSetArn: PermissionSetArn
    ): AttachManagedPolicyToPermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "ManagedPolicyArn" -> ManagedPolicyArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AttachManagedPolicyToPermissionSetRequest]
    }
  }

  @js.native
  trait AttachManagedPolicyToPermissionSetResponse extends js.Object

  object AttachManagedPolicyToPermissionSetResponse {
    @inline
    def apply(): AttachManagedPolicyToPermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachManagedPolicyToPermissionSetResponse]
    }
  }

  /** A structure that stores the details of the IAM managed policy.
    */
  @js.native
  trait AttachedManagedPolicy extends js.Object {
    var Arn: js.UndefOr[ManagedPolicyArn]
    var Name: js.UndefOr[Name]
  }

  object AttachedManagedPolicy {
    @inline
    def apply(
        Arn: js.UndefOr[ManagedPolicyArn] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): AttachedManagedPolicy = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttachedManagedPolicy]
    }
  }

  @js.native
  trait CreateAccountAssignmentRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
    var PrincipalId: PrincipalId
    var PrincipalType: PrincipalType
    var TargetId: TargetId
    var TargetType: TargetType
  }

  object CreateAccountAssignmentRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn,
        PrincipalId: PrincipalId,
        PrincipalType: PrincipalType,
        TargetId: TargetId,
        TargetType: TargetType
    ): CreateAccountAssignmentRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any],
        "PrincipalId" -> PrincipalId.asInstanceOf[js.Any],
        "PrincipalType" -> PrincipalType.asInstanceOf[js.Any],
        "TargetId" -> TargetId.asInstanceOf[js.Any],
        "TargetType" -> TargetType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAccountAssignmentRequest]
    }
  }

  @js.native
  trait CreateAccountAssignmentResponse extends js.Object {
    var AccountAssignmentCreationStatus: js.UndefOr[AccountAssignmentOperationStatus]
  }

  object CreateAccountAssignmentResponse {
    @inline
    def apply(
        AccountAssignmentCreationStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.undefined
    ): CreateAccountAssignmentResponse = {
      val __obj = js.Dynamic.literal()
      AccountAssignmentCreationStatus.foreach(__v => __obj.updateDynamic("AccountAssignmentCreationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountAssignmentResponse]
    }
  }

  @js.native
  trait CreateInstanceAccessControlAttributeConfigurationRequest extends js.Object {
    var InstanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfiguration
    var InstanceArn: InstanceArn
  }

  object CreateInstanceAccessControlAttributeConfigurationRequest {
    @inline
    def apply(
        InstanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfiguration,
        InstanceArn: InstanceArn
    ): CreateInstanceAccessControlAttributeConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceAccessControlAttributeConfiguration" -> InstanceAccessControlAttributeConfiguration.asInstanceOf[js.Any],
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateInstanceAccessControlAttributeConfigurationRequest]
    }
  }

  @js.native
  trait CreateInstanceAccessControlAttributeConfigurationResponse extends js.Object

  object CreateInstanceAccessControlAttributeConfigurationResponse {
    @inline
    def apply(): CreateInstanceAccessControlAttributeConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateInstanceAccessControlAttributeConfigurationResponse]
    }
  }

  @js.native
  trait CreatePermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var Name: PermissionSetName
    var Description: js.UndefOr[PermissionSetDescription]
    var RelayState: js.UndefOr[RelayState]
    var SessionDuration: js.UndefOr[Duration]
    var Tags: js.UndefOr[TagList]
  }

  object CreatePermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        Name: PermissionSetName,
        Description: js.UndefOr[PermissionSetDescription] = js.undefined,
        RelayState: js.UndefOr[RelayState] = js.undefined,
        SessionDuration: js.UndefOr[Duration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreatePermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RelayState.foreach(__v => __obj.updateDynamic("RelayState")(__v.asInstanceOf[js.Any]))
      SessionDuration.foreach(__v => __obj.updateDynamic("SessionDuration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePermissionSetRequest]
    }
  }

  @js.native
  trait CreatePermissionSetResponse extends js.Object {
    var PermissionSet: js.UndefOr[PermissionSet]
  }

  object CreatePermissionSetResponse {
    @inline
    def apply(
        PermissionSet: js.UndefOr[PermissionSet] = js.undefined
    ): CreatePermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      PermissionSet.foreach(__v => __obj.updateDynamic("PermissionSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePermissionSetResponse]
    }
  }

  @js.native
  trait DeleteAccountAssignmentRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
    var PrincipalId: PrincipalId
    var PrincipalType: PrincipalType
    var TargetId: TargetId
    var TargetType: TargetType
  }

  object DeleteAccountAssignmentRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn,
        PrincipalId: PrincipalId,
        PrincipalType: PrincipalType,
        TargetId: TargetId,
        TargetType: TargetType
    ): DeleteAccountAssignmentRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any],
        "PrincipalId" -> PrincipalId.asInstanceOf[js.Any],
        "PrincipalType" -> PrincipalType.asInstanceOf[js.Any],
        "TargetId" -> TargetId.asInstanceOf[js.Any],
        "TargetType" -> TargetType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAccountAssignmentRequest]
    }
  }

  @js.native
  trait DeleteAccountAssignmentResponse extends js.Object {
    var AccountAssignmentDeletionStatus: js.UndefOr[AccountAssignmentOperationStatus]
  }

  object DeleteAccountAssignmentResponse {
    @inline
    def apply(
        AccountAssignmentDeletionStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.undefined
    ): DeleteAccountAssignmentResponse = {
      val __obj = js.Dynamic.literal()
      AccountAssignmentDeletionStatus.foreach(__v => __obj.updateDynamic("AccountAssignmentDeletionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccountAssignmentResponse]
    }
  }

  @js.native
  trait DeleteInlinePolicyFromPermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
  }

  object DeleteInlinePolicyFromPermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn
    ): DeleteInlinePolicyFromPermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInlinePolicyFromPermissionSetRequest]
    }
  }

  @js.native
  trait DeleteInlinePolicyFromPermissionSetResponse extends js.Object

  object DeleteInlinePolicyFromPermissionSetResponse {
    @inline
    def apply(): DeleteInlinePolicyFromPermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteInlinePolicyFromPermissionSetResponse]
    }
  }

  @js.native
  trait DeleteInstanceAccessControlAttributeConfigurationRequest extends js.Object {
    var InstanceArn: InstanceArn
  }

  object DeleteInstanceAccessControlAttributeConfigurationRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn
    ): DeleteInstanceAccessControlAttributeConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteInstanceAccessControlAttributeConfigurationRequest]
    }
  }

  @js.native
  trait DeleteInstanceAccessControlAttributeConfigurationResponse extends js.Object

  object DeleteInstanceAccessControlAttributeConfigurationResponse {
    @inline
    def apply(): DeleteInstanceAccessControlAttributeConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteInstanceAccessControlAttributeConfigurationResponse]
    }
  }

  @js.native
  trait DeletePermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
  }

  object DeletePermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn
    ): DeletePermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePermissionSetRequest]
    }
  }

  @js.native
  trait DeletePermissionSetResponse extends js.Object

  object DeletePermissionSetResponse {
    @inline
    def apply(): DeletePermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePermissionSetResponse]
    }
  }

  @js.native
  trait DescribeAccountAssignmentCreationStatusRequest extends js.Object {
    var AccountAssignmentCreationRequestId: UUId
    var InstanceArn: InstanceArn
  }

  object DescribeAccountAssignmentCreationStatusRequest {
    @inline
    def apply(
        AccountAssignmentCreationRequestId: UUId,
        InstanceArn: InstanceArn
    ): DescribeAccountAssignmentCreationStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AccountAssignmentCreationRequestId" -> AccountAssignmentCreationRequestId.asInstanceOf[js.Any],
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccountAssignmentCreationStatusRequest]
    }
  }

  @js.native
  trait DescribeAccountAssignmentCreationStatusResponse extends js.Object {
    var AccountAssignmentCreationStatus: js.UndefOr[AccountAssignmentOperationStatus]
  }

  object DescribeAccountAssignmentCreationStatusResponse {
    @inline
    def apply(
        AccountAssignmentCreationStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.undefined
    ): DescribeAccountAssignmentCreationStatusResponse = {
      val __obj = js.Dynamic.literal()
      AccountAssignmentCreationStatus.foreach(__v => __obj.updateDynamic("AccountAssignmentCreationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAssignmentCreationStatusResponse]
    }
  }

  @js.native
  trait DescribeAccountAssignmentDeletionStatusRequest extends js.Object {
    var AccountAssignmentDeletionRequestId: UUId
    var InstanceArn: InstanceArn
  }

  object DescribeAccountAssignmentDeletionStatusRequest {
    @inline
    def apply(
        AccountAssignmentDeletionRequestId: UUId,
        InstanceArn: InstanceArn
    ): DescribeAccountAssignmentDeletionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "AccountAssignmentDeletionRequestId" -> AccountAssignmentDeletionRequestId.asInstanceOf[js.Any],
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccountAssignmentDeletionStatusRequest]
    }
  }

  @js.native
  trait DescribeAccountAssignmentDeletionStatusResponse extends js.Object {
    var AccountAssignmentDeletionStatus: js.UndefOr[AccountAssignmentOperationStatus]
  }

  object DescribeAccountAssignmentDeletionStatusResponse {
    @inline
    def apply(
        AccountAssignmentDeletionStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.undefined
    ): DescribeAccountAssignmentDeletionStatusResponse = {
      val __obj = js.Dynamic.literal()
      AccountAssignmentDeletionStatus.foreach(__v => __obj.updateDynamic("AccountAssignmentDeletionStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAssignmentDeletionStatusResponse]
    }
  }

  @js.native
  trait DescribeInstanceAccessControlAttributeConfigurationRequest extends js.Object {
    var InstanceArn: InstanceArn
  }

  object DescribeInstanceAccessControlAttributeConfigurationRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn
    ): DescribeInstanceAccessControlAttributeConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeInstanceAccessControlAttributeConfigurationRequest]
    }
  }

  @js.native
  trait DescribeInstanceAccessControlAttributeConfigurationResponse extends js.Object {
    var InstanceAccessControlAttributeConfiguration: js.UndefOr[InstanceAccessControlAttributeConfiguration]
    var Status: js.UndefOr[InstanceAccessControlAttributeConfigurationStatus]
    var StatusReason: js.UndefOr[InstanceAccessControlAttributeConfigurationStatusReason]
  }

  object DescribeInstanceAccessControlAttributeConfigurationResponse {
    @inline
    def apply(
        InstanceAccessControlAttributeConfiguration: js.UndefOr[InstanceAccessControlAttributeConfiguration] = js.undefined,
        Status: js.UndefOr[InstanceAccessControlAttributeConfigurationStatus] = js.undefined,
        StatusReason: js.UndefOr[InstanceAccessControlAttributeConfigurationStatusReason] = js.undefined
    ): DescribeInstanceAccessControlAttributeConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      InstanceAccessControlAttributeConfiguration.foreach(__v => __obj.updateDynamic("InstanceAccessControlAttributeConfiguration")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstanceAccessControlAttributeConfigurationResponse]
    }
  }

  @js.native
  trait DescribePermissionSetProvisioningStatusRequest extends js.Object {
    var InstanceArn: InstanceArn
    var ProvisionPermissionSetRequestId: UUId
  }

  object DescribePermissionSetProvisioningStatusRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        ProvisionPermissionSetRequestId: UUId
    ): DescribePermissionSetProvisioningStatusRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "ProvisionPermissionSetRequestId" -> ProvisionPermissionSetRequestId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePermissionSetProvisioningStatusRequest]
    }
  }

  @js.native
  trait DescribePermissionSetProvisioningStatusResponse extends js.Object {
    var PermissionSetProvisioningStatus: js.UndefOr[PermissionSetProvisioningStatus]
  }

  object DescribePermissionSetProvisioningStatusResponse {
    @inline
    def apply(
        PermissionSetProvisioningStatus: js.UndefOr[PermissionSetProvisioningStatus] = js.undefined
    ): DescribePermissionSetProvisioningStatusResponse = {
      val __obj = js.Dynamic.literal()
      PermissionSetProvisioningStatus.foreach(__v => __obj.updateDynamic("PermissionSetProvisioningStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePermissionSetProvisioningStatusResponse]
    }
  }

  @js.native
  trait DescribePermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
  }

  object DescribePermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn
    ): DescribePermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePermissionSetRequest]
    }
  }

  @js.native
  trait DescribePermissionSetResponse extends js.Object {
    var PermissionSet: js.UndefOr[PermissionSet]
  }

  object DescribePermissionSetResponse {
    @inline
    def apply(
        PermissionSet: js.UndefOr[PermissionSet] = js.undefined
    ): DescribePermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      PermissionSet.foreach(__v => __obj.updateDynamic("PermissionSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePermissionSetResponse]
    }
  }

  @js.native
  trait DetachManagedPolicyFromPermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var ManagedPolicyArn: ManagedPolicyArn
    var PermissionSetArn: PermissionSetArn
  }

  object DetachManagedPolicyFromPermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        ManagedPolicyArn: ManagedPolicyArn,
        PermissionSetArn: PermissionSetArn
    ): DetachManagedPolicyFromPermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "ManagedPolicyArn" -> ManagedPolicyArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DetachManagedPolicyFromPermissionSetRequest]
    }
  }

  @js.native
  trait DetachManagedPolicyFromPermissionSetResponse extends js.Object

  object DetachManagedPolicyFromPermissionSetResponse {
    @inline
    def apply(): DetachManagedPolicyFromPermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DetachManagedPolicyFromPermissionSetResponse]
    }
  }

  @js.native
  trait GetInlinePolicyForPermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
  }

  object GetInlinePolicyForPermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn
    ): GetInlinePolicyForPermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetInlinePolicyForPermissionSetRequest]
    }
  }

  @js.native
  trait GetInlinePolicyForPermissionSetResponse extends js.Object {
    var InlinePolicy: js.UndefOr[PermissionSetPolicyDocument]
  }

  object GetInlinePolicyForPermissionSetResponse {
    @inline
    def apply(
        InlinePolicy: js.UndefOr[PermissionSetPolicyDocument] = js.undefined
    ): GetInlinePolicyForPermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      InlinePolicy.foreach(__v => __obj.updateDynamic("InlinePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInlinePolicyForPermissionSetResponse]
    }
  }

  /** Specifies the attributes to add to your attribute-based access control (ABAC) configuration.
    */
  @js.native
  trait InstanceAccessControlAttributeConfiguration extends js.Object {
    var AccessControlAttributes: AccessControlAttributeList
  }

  object InstanceAccessControlAttributeConfiguration {
    @inline
    def apply(
        AccessControlAttributes: AccessControlAttributeList
    ): InstanceAccessControlAttributeConfiguration = {
      val __obj = js.Dynamic.literal(
        "AccessControlAttributes" -> AccessControlAttributes.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InstanceAccessControlAttributeConfiguration]
    }
  }

  @js.native
  sealed trait InstanceAccessControlAttributeConfigurationStatus extends js.Any
  object InstanceAccessControlAttributeConfigurationStatus {
    val ENABLED = "ENABLED".asInstanceOf[InstanceAccessControlAttributeConfigurationStatus]
    val CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS".asInstanceOf[InstanceAccessControlAttributeConfigurationStatus]
    val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[InstanceAccessControlAttributeConfigurationStatus]

    @inline def values = js.Array(ENABLED, CREATION_IN_PROGRESS, CREATION_FAILED)
  }

  /** Provides information about the SSO instance.
    */
  @js.native
  trait InstanceMetadata extends js.Object {
    var IdentityStoreId: js.UndefOr[Id]
    var InstanceArn: js.UndefOr[InstanceArn]
  }

  object InstanceMetadata {
    @inline
    def apply(
        IdentityStoreId: js.UndefOr[Id] = js.undefined,
        InstanceArn: js.UndefOr[InstanceArn] = js.undefined
    ): InstanceMetadata = {
      val __obj = js.Dynamic.literal()
      IdentityStoreId.foreach(__v => __obj.updateDynamic("IdentityStoreId")(__v.asInstanceOf[js.Any]))
      InstanceArn.foreach(__v => __obj.updateDynamic("InstanceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceMetadata]
    }
  }

  @js.native
  trait ListAccountAssignmentCreationStatusRequest extends js.Object {
    var InstanceArn: InstanceArn
    var Filter: js.UndefOr[OperationStatusFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListAccountAssignmentCreationStatusRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        Filter: js.UndefOr[OperationStatusFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAccountAssignmentCreationStatusRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAssignmentCreationStatusRequest]
    }
  }

  @js.native
  trait ListAccountAssignmentCreationStatusResponse extends js.Object {
    var AccountAssignmentsCreationStatus: js.UndefOr[AccountAssignmentOperationStatusList]
    var NextToken: js.UndefOr[Token]
  }

  object ListAccountAssignmentCreationStatusResponse {
    @inline
    def apply(
        AccountAssignmentsCreationStatus: js.UndefOr[AccountAssignmentOperationStatusList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAccountAssignmentCreationStatusResponse = {
      val __obj = js.Dynamic.literal()
      AccountAssignmentsCreationStatus.foreach(__v => __obj.updateDynamic("AccountAssignmentsCreationStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAssignmentCreationStatusResponse]
    }
  }

  @js.native
  trait ListAccountAssignmentDeletionStatusRequest extends js.Object {
    var InstanceArn: InstanceArn
    var Filter: js.UndefOr[OperationStatusFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListAccountAssignmentDeletionStatusRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        Filter: js.UndefOr[OperationStatusFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAccountAssignmentDeletionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAssignmentDeletionStatusRequest]
    }
  }

  @js.native
  trait ListAccountAssignmentDeletionStatusResponse extends js.Object {
    var AccountAssignmentsDeletionStatus: js.UndefOr[AccountAssignmentOperationStatusList]
    var NextToken: js.UndefOr[Token]
  }

  object ListAccountAssignmentDeletionStatusResponse {
    @inline
    def apply(
        AccountAssignmentsDeletionStatus: js.UndefOr[AccountAssignmentOperationStatusList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAccountAssignmentDeletionStatusResponse = {
      val __obj = js.Dynamic.literal()
      AccountAssignmentsDeletionStatus.foreach(__v => __obj.updateDynamic("AccountAssignmentsDeletionStatus")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAssignmentDeletionStatusResponse]
    }
  }

  @js.native
  trait ListAccountAssignmentsRequest extends js.Object {
    var AccountId: TargetId
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListAccountAssignmentsRequest {
    @inline
    def apply(
        AccountId: TargetId,
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAccountAssignmentsRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAssignmentsRequest]
    }
  }

  @js.native
  trait ListAccountAssignmentsResponse extends js.Object {
    var AccountAssignments: js.UndefOr[AccountAssignmentList]
    var NextToken: js.UndefOr[Token]
  }

  object ListAccountAssignmentsResponse {
    @inline
    def apply(
        AccountAssignments: js.UndefOr[AccountAssignmentList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAccountAssignmentsResponse = {
      val __obj = js.Dynamic.literal()
      AccountAssignments.foreach(__v => __obj.updateDynamic("AccountAssignments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountAssignmentsResponse]
    }
  }

  @js.native
  trait ListAccountsForProvisionedPermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
    var ProvisioningStatus: js.UndefOr[ProvisioningStatus]
  }

  object ListAccountsForProvisionedPermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ProvisioningStatus: js.UndefOr[ProvisioningStatus] = js.undefined
    ): ListAccountsForProvisionedPermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProvisioningStatus.foreach(__v => __obj.updateDynamic("ProvisioningStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsForProvisionedPermissionSetRequest]
    }
  }

  @js.native
  trait ListAccountsForProvisionedPermissionSetResponse extends js.Object {
    var AccountIds: js.UndefOr[AccountList]
    var NextToken: js.UndefOr[Token]
  }

  object ListAccountsForProvisionedPermissionSetResponse {
    @inline
    def apply(
        AccountIds: js.UndefOr[AccountList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListAccountsForProvisionedPermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      AccountIds.foreach(__v => __obj.updateDynamic("AccountIds")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccountsForProvisionedPermissionSetResponse]
    }
  }

  @js.native
  trait ListInstancesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListInstancesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListInstancesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesRequest]
    }
  }

  @js.native
  trait ListInstancesResponse extends js.Object {
    var Instances: js.UndefOr[InstanceList]
    var NextToken: js.UndefOr[Token]
  }

  object ListInstancesResponse {
    @inline
    def apply(
        Instances: js.UndefOr[InstanceList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListInstancesResponse = {
      val __obj = js.Dynamic.literal()
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesResponse]
    }
  }

  @js.native
  trait ListManagedPoliciesInPermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListManagedPoliciesInPermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListManagedPoliciesInPermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedPoliciesInPermissionSetRequest]
    }
  }

  @js.native
  trait ListManagedPoliciesInPermissionSetResponse extends js.Object {
    var AttachedManagedPolicies: js.UndefOr[AttachedManagedPolicyList]
    var NextToken: js.UndefOr[Token]
  }

  object ListManagedPoliciesInPermissionSetResponse {
    @inline
    def apply(
        AttachedManagedPolicies: js.UndefOr[AttachedManagedPolicyList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListManagedPoliciesInPermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      AttachedManagedPolicies.foreach(__v => __obj.updateDynamic("AttachedManagedPolicies")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListManagedPoliciesInPermissionSetResponse]
    }
  }

  @js.native
  trait ListPermissionSetProvisioningStatusRequest extends js.Object {
    var InstanceArn: InstanceArn
    var Filter: js.UndefOr[OperationStatusFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListPermissionSetProvisioningStatusRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        Filter: js.UndefOr[OperationStatusFilter] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPermissionSetProvisioningStatusRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.updateDynamic("Filter")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionSetProvisioningStatusRequest]
    }
  }

  @js.native
  trait ListPermissionSetProvisioningStatusResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PermissionSetsProvisioningStatus: js.UndefOr[PermissionSetProvisioningStatusList]
  }

  object ListPermissionSetProvisioningStatusResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        PermissionSetsProvisioningStatus: js.UndefOr[PermissionSetProvisioningStatusList] = js.undefined
    ): ListPermissionSetProvisioningStatusResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PermissionSetsProvisioningStatus.foreach(__v => __obj.updateDynamic("PermissionSetsProvisioningStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionSetProvisioningStatusResponse]
    }
  }

  @js.native
  trait ListPermissionSetsProvisionedToAccountRequest extends js.Object {
    var AccountId: AccountId
    var InstanceArn: InstanceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
    var ProvisioningStatus: js.UndefOr[ProvisioningStatus]
  }

  object ListPermissionSetsProvisionedToAccountRequest {
    @inline
    def apply(
        AccountId: AccountId,
        InstanceArn: InstanceArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        ProvisioningStatus: js.UndefOr[ProvisioningStatus] = js.undefined
    ): ListPermissionSetsProvisionedToAccountRequest = {
      val __obj = js.Dynamic.literal(
        "AccountId" -> AccountId.asInstanceOf[js.Any],
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProvisioningStatus.foreach(__v => __obj.updateDynamic("ProvisioningStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionSetsProvisionedToAccountRequest]
    }
  }

  @js.native
  trait ListPermissionSetsProvisionedToAccountResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PermissionSets: js.UndefOr[PermissionSetList]
  }

  object ListPermissionSetsProvisionedToAccountResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        PermissionSets: js.UndefOr[PermissionSetList] = js.undefined
    ): ListPermissionSetsProvisionedToAccountResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PermissionSets.foreach(__v => __obj.updateDynamic("PermissionSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionSetsProvisionedToAccountResponse]
    }
  }

  @js.native
  trait ListPermissionSetsRequest extends js.Object {
    var InstanceArn: InstanceArn
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[Token]
  }

  object ListPermissionSetsRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPermissionSetsRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionSetsRequest]
    }
  }

  @js.native
  trait ListPermissionSetsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PermissionSets: js.UndefOr[PermissionSetList]
  }

  object ListPermissionSetsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        PermissionSets: js.UndefOr[PermissionSetList] = js.undefined
    ): ListPermissionSetsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PermissionSets.foreach(__v => __obj.updateDynamic("PermissionSets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionSetsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var InstanceArn: InstanceArn
    var ResourceArn: GeneralArn
    var NextToken: js.UndefOr[Token]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        ResourceArn: GeneralArn,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Filters he operation status list based on the passed attribute value.
    */
  @js.native
  trait OperationStatusFilter extends js.Object {
    var Status: js.UndefOr[StatusValues]
  }

  object OperationStatusFilter {
    @inline
    def apply(
        Status: js.UndefOr[StatusValues] = js.undefined
    ): OperationStatusFilter = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OperationStatusFilter]
    }
  }

  /** An entity that contains IAM policies.
    */
  @js.native
  trait PermissionSet extends js.Object {
    var CreatedDate: js.UndefOr[Date]
    var Description: js.UndefOr[PermissionSetDescription]
    var Name: js.UndefOr[PermissionSetName]
    var PermissionSetArn: js.UndefOr[PermissionSetArn]
    var RelayState: js.UndefOr[RelayState]
    var SessionDuration: js.UndefOr[Duration]
  }

  object PermissionSet {
    @inline
    def apply(
        CreatedDate: js.UndefOr[Date] = js.undefined,
        Description: js.UndefOr[PermissionSetDescription] = js.undefined,
        Name: js.UndefOr[PermissionSetName] = js.undefined,
        PermissionSetArn: js.UndefOr[PermissionSetArn] = js.undefined,
        RelayState: js.UndefOr[RelayState] = js.undefined,
        SessionDuration: js.UndefOr[Duration] = js.undefined
    ): PermissionSet = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PermissionSetArn.foreach(__v => __obj.updateDynamic("PermissionSetArn")(__v.asInstanceOf[js.Any]))
      RelayState.foreach(__v => __obj.updateDynamic("RelayState")(__v.asInstanceOf[js.Any]))
      SessionDuration.foreach(__v => __obj.updateDynamic("SessionDuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PermissionSet]
    }
  }

  /** A structure that is used to provide the status of the provisioning operation for a specified permission set.
    */
  @js.native
  trait PermissionSetProvisioningStatus extends js.Object {
    var AccountId: js.UndefOr[AccountId]
    var CreatedDate: js.UndefOr[Date]
    var FailureReason: js.UndefOr[Reason]
    var PermissionSetArn: js.UndefOr[PermissionSetArn]
    var RequestId: js.UndefOr[UUId]
    var Status: js.UndefOr[StatusValues]
  }

  object PermissionSetProvisioningStatus {
    @inline
    def apply(
        AccountId: js.UndefOr[AccountId] = js.undefined,
        CreatedDate: js.UndefOr[Date] = js.undefined,
        FailureReason: js.UndefOr[Reason] = js.undefined,
        PermissionSetArn: js.UndefOr[PermissionSetArn] = js.undefined,
        RequestId: js.UndefOr[UUId] = js.undefined,
        Status: js.UndefOr[StatusValues] = js.undefined
    ): PermissionSetProvisioningStatus = {
      val __obj = js.Dynamic.literal()
      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      FailureReason.foreach(__v => __obj.updateDynamic("FailureReason")(__v.asInstanceOf[js.Any]))
      PermissionSetArn.foreach(__v => __obj.updateDynamic("PermissionSetArn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PermissionSetProvisioningStatus]
    }
  }

  /** Provides information about the permission set provisioning status.
    */
  @js.native
  trait PermissionSetProvisioningStatusMetadata extends js.Object {
    var CreatedDate: js.UndefOr[Date]
    var RequestId: js.UndefOr[UUId]
    var Status: js.UndefOr[StatusValues]
  }

  object PermissionSetProvisioningStatusMetadata {
    @inline
    def apply(
        CreatedDate: js.UndefOr[Date] = js.undefined,
        RequestId: js.UndefOr[UUId] = js.undefined,
        Status: js.UndefOr[StatusValues] = js.undefined
    ): PermissionSetProvisioningStatusMetadata = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PermissionSetProvisioningStatusMetadata]
    }
  }

  @js.native
  sealed trait PrincipalType extends js.Any
  object PrincipalType {
    val USER = "USER".asInstanceOf[PrincipalType]
    val GROUP = "GROUP".asInstanceOf[PrincipalType]

    @inline def values = js.Array(USER, GROUP)
  }

  @js.native
  trait ProvisionPermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
    var TargetType: ProvisionTargetType
    var TargetId: js.UndefOr[TargetId]
  }

  object ProvisionPermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn,
        TargetType: ProvisionTargetType,
        TargetId: js.UndefOr[TargetId] = js.undefined
    ): ProvisionPermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any],
        "TargetType" -> TargetType.asInstanceOf[js.Any]
      )

      TargetId.foreach(__v => __obj.updateDynamic("TargetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionPermissionSetRequest]
    }
  }

  @js.native
  trait ProvisionPermissionSetResponse extends js.Object {
    var PermissionSetProvisioningStatus: js.UndefOr[PermissionSetProvisioningStatus]
  }

  object ProvisionPermissionSetResponse {
    @inline
    def apply(
        PermissionSetProvisioningStatus: js.UndefOr[PermissionSetProvisioningStatus] = js.undefined
    ): ProvisionPermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      PermissionSetProvisioningStatus.foreach(__v => __obj.updateDynamic("PermissionSetProvisioningStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionPermissionSetResponse]
    }
  }

  @js.native
  sealed trait ProvisionTargetType extends js.Any
  object ProvisionTargetType {
    val AWS_ACCOUNT = "AWS_ACCOUNT".asInstanceOf[ProvisionTargetType]
    val ALL_PROVISIONED_ACCOUNTS = "ALL_PROVISIONED_ACCOUNTS".asInstanceOf[ProvisionTargetType]

    @inline def values = js.Array(AWS_ACCOUNT, ALL_PROVISIONED_ACCOUNTS)
  }

  @js.native
  sealed trait ProvisioningStatus extends js.Any
  object ProvisioningStatus {
    val LATEST_PERMISSION_SET_PROVISIONED = "LATEST_PERMISSION_SET_PROVISIONED".asInstanceOf[ProvisioningStatus]
    val LATEST_PERMISSION_SET_NOT_PROVISIONED = "LATEST_PERMISSION_SET_NOT_PROVISIONED".asInstanceOf[ProvisioningStatus]

    @inline def values = js.Array(LATEST_PERMISSION_SET_PROVISIONED, LATEST_PERMISSION_SET_NOT_PROVISIONED)
  }

  @js.native
  trait PutInlinePolicyToPermissionSetRequest extends js.Object {
    var InlinePolicy: PermissionSetPolicyDocument
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
  }

  object PutInlinePolicyToPermissionSetRequest {
    @inline
    def apply(
        InlinePolicy: PermissionSetPolicyDocument,
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn
    ): PutInlinePolicyToPermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InlinePolicy" -> InlinePolicy.asInstanceOf[js.Any],
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutInlinePolicyToPermissionSetRequest]
    }
  }

  @js.native
  trait PutInlinePolicyToPermissionSetResponse extends js.Object

  object PutInlinePolicyToPermissionSetResponse {
    @inline
    def apply(): PutInlinePolicyToPermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutInlinePolicyToPermissionSetResponse]
    }
  }

  @js.native
  sealed trait StatusValues extends js.Any
  object StatusValues {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[StatusValues]
    val FAILED = "FAILED".asInstanceOf[StatusValues]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[StatusValues]

    @inline def values = js.Array(IN_PROGRESS, FAILED, SUCCEEDED)
  }

  /** A set of key-value pairs that are used to manage the resource. Tags can only be applied to permission sets and cannot be applied to corresponding roles that AWS SSO creates in AWS accounts.
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
    var InstanceArn: InstanceArn
    var ResourceArn: GeneralArn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        ResourceArn: GeneralArn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
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
  sealed trait TargetType extends js.Any
  object TargetType {
    val AWS_ACCOUNT = "AWS_ACCOUNT".asInstanceOf[TargetType]

    @inline def values = js.Array(AWS_ACCOUNT)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var InstanceArn: InstanceArn
    var ResourceArn: GeneralArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        ResourceArn: GeneralArn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
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
  trait UpdateInstanceAccessControlAttributeConfigurationRequest extends js.Object {
    var InstanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfiguration
    var InstanceArn: InstanceArn
  }

  object UpdateInstanceAccessControlAttributeConfigurationRequest {
    @inline
    def apply(
        InstanceAccessControlAttributeConfiguration: InstanceAccessControlAttributeConfiguration,
        InstanceArn: InstanceArn
    ): UpdateInstanceAccessControlAttributeConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceAccessControlAttributeConfiguration" -> InstanceAccessControlAttributeConfiguration.asInstanceOf[js.Any],
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateInstanceAccessControlAttributeConfigurationRequest]
    }
  }

  @js.native
  trait UpdateInstanceAccessControlAttributeConfigurationResponse extends js.Object

  object UpdateInstanceAccessControlAttributeConfigurationResponse {
    @inline
    def apply(): UpdateInstanceAccessControlAttributeConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateInstanceAccessControlAttributeConfigurationResponse]
    }
  }

  @js.native
  trait UpdatePermissionSetRequest extends js.Object {
    var InstanceArn: InstanceArn
    var PermissionSetArn: PermissionSetArn
    var Description: js.UndefOr[PermissionSetDescription]
    var RelayState: js.UndefOr[RelayState]
    var SessionDuration: js.UndefOr[Duration]
  }

  object UpdatePermissionSetRequest {
    @inline
    def apply(
        InstanceArn: InstanceArn,
        PermissionSetArn: PermissionSetArn,
        Description: js.UndefOr[PermissionSetDescription] = js.undefined,
        RelayState: js.UndefOr[RelayState] = js.undefined,
        SessionDuration: js.UndefOr[Duration] = js.undefined
    ): UpdatePermissionSetRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceArn" -> InstanceArn.asInstanceOf[js.Any],
        "PermissionSetArn" -> PermissionSetArn.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RelayState.foreach(__v => __obj.updateDynamic("RelayState")(__v.asInstanceOf[js.Any]))
      SessionDuration.foreach(__v => __obj.updateDynamic("SessionDuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePermissionSetRequest]
    }
  }

  @js.native
  trait UpdatePermissionSetResponse extends js.Object

  object UpdatePermissionSetResponse {
    @inline
    def apply(): UpdatePermissionSetResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdatePermissionSetResponse]
    }
  }
}
