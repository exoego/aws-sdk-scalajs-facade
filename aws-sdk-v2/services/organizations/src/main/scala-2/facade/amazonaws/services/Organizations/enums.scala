package facade.amazonaws.services.organizations

import scalajs.js

@js.native
sealed trait AccountJoinedMethod extends js.Any
object AccountJoinedMethod {
  val INVITED = "INVITED".asInstanceOf[AccountJoinedMethod]
  val CREATED = "CREATED".asInstanceOf[AccountJoinedMethod]

  @inline def values: js.Array[AccountJoinedMethod] = js.Array(INVITED, CREATED)
}

@js.native
sealed trait AccountStatus extends js.Any
object AccountStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[AccountStatus]
  val SUSPENDED = "SUSPENDED".asInstanceOf[AccountStatus]
  val PENDING_CLOSURE = "PENDING_CLOSURE".asInstanceOf[AccountStatus]

  @inline def values: js.Array[AccountStatus] = js.Array(ACTIVE, SUSPENDED, PENDING_CLOSURE)
}

@js.native
sealed trait ActionType extends js.Any
object ActionType {
  val INVITE = "INVITE".asInstanceOf[ActionType]
  val ENABLE_ALL_FEATURES = "ENABLE_ALL_FEATURES".asInstanceOf[ActionType]
  val APPROVE_ALL_FEATURES = "APPROVE_ALL_FEATURES".asInstanceOf[ActionType]
  val ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE = "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE".asInstanceOf[ActionType]

  @inline def values: js.Array[ActionType] = js.Array(INVITE, ENABLE_ALL_FEATURES, APPROVE_ALL_FEATURES, ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE)
}

@js.native
sealed trait ChildType extends js.Any
object ChildType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[ChildType]
  val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[ChildType]

  @inline def values: js.Array[ChildType] = js.Array(ACCOUNT, ORGANIZATIONAL_UNIT)
}

@js.native
sealed trait CreateAccountFailureReason extends js.Any
object CreateAccountFailureReason {
  val ACCOUNT_LIMIT_EXCEEDED = "ACCOUNT_LIMIT_EXCEEDED".asInstanceOf[CreateAccountFailureReason]
  val EMAIL_ALREADY_EXISTS = "EMAIL_ALREADY_EXISTS".asInstanceOf[CreateAccountFailureReason]
  val INVALID_ADDRESS = "INVALID_ADDRESS".asInstanceOf[CreateAccountFailureReason]
  val INVALID_EMAIL = "INVALID_EMAIL".asInstanceOf[CreateAccountFailureReason]
  val CONCURRENT_ACCOUNT_MODIFICATION = "CONCURRENT_ACCOUNT_MODIFICATION".asInstanceOf[CreateAccountFailureReason]
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[CreateAccountFailureReason]
  val GOVCLOUD_ACCOUNT_ALREADY_EXISTS = "GOVCLOUD_ACCOUNT_ALREADY_EXISTS".asInstanceOf[CreateAccountFailureReason]
  val MISSING_BUSINESS_VALIDATION = "MISSING_BUSINESS_VALIDATION".asInstanceOf[CreateAccountFailureReason]
  val FAILED_BUSINESS_VALIDATION = "FAILED_BUSINESS_VALIDATION".asInstanceOf[CreateAccountFailureReason]
  val PENDING_BUSINESS_VALIDATION = "PENDING_BUSINESS_VALIDATION".asInstanceOf[CreateAccountFailureReason]
  val INVALID_IDENTITY_FOR_BUSINESS_VALIDATION = "INVALID_IDENTITY_FOR_BUSINESS_VALIDATION".asInstanceOf[CreateAccountFailureReason]
  val UNKNOWN_BUSINESS_VALIDATION = "UNKNOWN_BUSINESS_VALIDATION".asInstanceOf[CreateAccountFailureReason]
  val MISSING_PAYMENT_INSTRUMENT = "MISSING_PAYMENT_INSTRUMENT".asInstanceOf[CreateAccountFailureReason]
  val INVALID_PAYMENT_INSTRUMENT = "INVALID_PAYMENT_INSTRUMENT".asInstanceOf[CreateAccountFailureReason]
  val UPDATE_EXISTING_RESOURCE_POLICY_WITH_TAGS_NOT_SUPPORTED = "UPDATE_EXISTING_RESOURCE_POLICY_WITH_TAGS_NOT_SUPPORTED".asInstanceOf[CreateAccountFailureReason]

  @inline def values: js.Array[CreateAccountFailureReason] = js.Array(
    ACCOUNT_LIMIT_EXCEEDED,
    EMAIL_ALREADY_EXISTS,
    INVALID_ADDRESS,
    INVALID_EMAIL,
    CONCURRENT_ACCOUNT_MODIFICATION,
    INTERNAL_FAILURE,
    GOVCLOUD_ACCOUNT_ALREADY_EXISTS,
    MISSING_BUSINESS_VALIDATION,
    FAILED_BUSINESS_VALIDATION,
    PENDING_BUSINESS_VALIDATION,
    INVALID_IDENTITY_FOR_BUSINESS_VALIDATION,
    UNKNOWN_BUSINESS_VALIDATION,
    MISSING_PAYMENT_INSTRUMENT,
    INVALID_PAYMENT_INSTRUMENT,
    UPDATE_EXISTING_RESOURCE_POLICY_WITH_TAGS_NOT_SUPPORTED
  )
}

@js.native
sealed trait CreateAccountState extends js.Any
object CreateAccountState {
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[CreateAccountState]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[CreateAccountState]
  val FAILED = "FAILED".asInstanceOf[CreateAccountState]

  @inline def values: js.Array[CreateAccountState] = js.Array(IN_PROGRESS, SUCCEEDED, FAILED)
}

@js.native
sealed trait EffectivePolicyType extends js.Any
object EffectivePolicyType {
  val TAG_POLICY = "TAG_POLICY".asInstanceOf[EffectivePolicyType]
  val BACKUP_POLICY = "BACKUP_POLICY".asInstanceOf[EffectivePolicyType]
  val AISERVICES_OPT_OUT_POLICY = "AISERVICES_OPT_OUT_POLICY".asInstanceOf[EffectivePolicyType]

  @inline def values: js.Array[EffectivePolicyType] = js.Array(TAG_POLICY, BACKUP_POLICY, AISERVICES_OPT_OUT_POLICY)
}

@js.native
sealed trait HandshakePartyType extends js.Any
object HandshakePartyType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[HandshakePartyType]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[HandshakePartyType]
  val EMAIL = "EMAIL".asInstanceOf[HandshakePartyType]

  @inline def values: js.Array[HandshakePartyType] = js.Array(ACCOUNT, ORGANIZATION, EMAIL)
}

@js.native
sealed trait HandshakeResourceType extends js.Any
object HandshakeResourceType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[HandshakeResourceType]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[HandshakeResourceType]
  val ORGANIZATION_FEATURE_SET = "ORGANIZATION_FEATURE_SET".asInstanceOf[HandshakeResourceType]
  val EMAIL = "EMAIL".asInstanceOf[HandshakeResourceType]
  val MASTER_EMAIL = "MASTER_EMAIL".asInstanceOf[HandshakeResourceType]
  val MASTER_NAME = "MASTER_NAME".asInstanceOf[HandshakeResourceType]
  val NOTES = "NOTES".asInstanceOf[HandshakeResourceType]
  val PARENT_HANDSHAKE = "PARENT_HANDSHAKE".asInstanceOf[HandshakeResourceType]

  @inline def values: js.Array[HandshakeResourceType] = js.Array(ACCOUNT, ORGANIZATION, ORGANIZATION_FEATURE_SET, EMAIL, MASTER_EMAIL, MASTER_NAME, NOTES, PARENT_HANDSHAKE)
}

@js.native
sealed trait HandshakeState extends js.Any
object HandshakeState {
  val REQUESTED = "REQUESTED".asInstanceOf[HandshakeState]
  val OPEN = "OPEN".asInstanceOf[HandshakeState]
  val CANCELED = "CANCELED".asInstanceOf[HandshakeState]
  val ACCEPTED = "ACCEPTED".asInstanceOf[HandshakeState]
  val DECLINED = "DECLINED".asInstanceOf[HandshakeState]
  val EXPIRED = "EXPIRED".asInstanceOf[HandshakeState]

  @inline def values: js.Array[HandshakeState] = js.Array(REQUESTED, OPEN, CANCELED, ACCEPTED, DECLINED, EXPIRED)
}

@js.native
sealed trait IAMUserAccessToBilling extends js.Any
object IAMUserAccessToBilling {
  val ALLOW = "ALLOW".asInstanceOf[IAMUserAccessToBilling]
  val DENY = "DENY".asInstanceOf[IAMUserAccessToBilling]

  @inline def values: js.Array[IAMUserAccessToBilling] = js.Array(ALLOW, DENY)
}

@js.native
sealed trait OrganizationFeatureSet extends js.Any
object OrganizationFeatureSet {
  val ALL = "ALL".asInstanceOf[OrganizationFeatureSet]
  val CONSOLIDATED_BILLING = "CONSOLIDATED_BILLING".asInstanceOf[OrganizationFeatureSet]

  @inline def values: js.Array[OrganizationFeatureSet] = js.Array(ALL, CONSOLIDATED_BILLING)
}

@js.native
sealed trait ParentType extends js.Any
object ParentType {
  val ROOT = "ROOT".asInstanceOf[ParentType]
  val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[ParentType]

  @inline def values: js.Array[ParentType] = js.Array(ROOT, ORGANIZATIONAL_UNIT)
}

@js.native
sealed trait PolicyType extends js.Any
object PolicyType {
  val SERVICE_CONTROL_POLICY = "SERVICE_CONTROL_POLICY".asInstanceOf[PolicyType]
  val TAG_POLICY = "TAG_POLICY".asInstanceOf[PolicyType]
  val BACKUP_POLICY = "BACKUP_POLICY".asInstanceOf[PolicyType]
  val AISERVICES_OPT_OUT_POLICY = "AISERVICES_OPT_OUT_POLICY".asInstanceOf[PolicyType]

  @inline def values: js.Array[PolicyType] = js.Array(SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY, AISERVICES_OPT_OUT_POLICY)
}

@js.native
sealed trait PolicyTypeStatus extends js.Any
object PolicyTypeStatus {
  val ENABLED = "ENABLED".asInstanceOf[PolicyTypeStatus]
  val PENDING_ENABLE = "PENDING_ENABLE".asInstanceOf[PolicyTypeStatus]
  val PENDING_DISABLE = "PENDING_DISABLE".asInstanceOf[PolicyTypeStatus]

  @inline def values: js.Array[PolicyTypeStatus] = js.Array(ENABLED, PENDING_ENABLE, PENDING_DISABLE)
}

@js.native
sealed trait TargetType extends js.Any
object TargetType {
  val ACCOUNT = "ACCOUNT".asInstanceOf[TargetType]
  val ORGANIZATIONAL_UNIT = "ORGANIZATIONAL_UNIT".asInstanceOf[TargetType]
  val ROOT = "ROOT".asInstanceOf[TargetType]

  @inline def values: js.Array[TargetType] = js.Array(ACCOUNT, ORGANIZATIONAL_UNIT, ROOT)
}
