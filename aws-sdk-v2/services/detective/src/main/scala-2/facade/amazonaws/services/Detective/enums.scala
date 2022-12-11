package facade.amazonaws.services.detective

import scalajs.js

@js.native
sealed trait DatasourcePackage extends js.Any
object DatasourcePackage {
  val DETECTIVE_CORE = "DETECTIVE_CORE".asInstanceOf[DatasourcePackage]
  val EKS_AUDIT = "EKS_AUDIT".asInstanceOf[DatasourcePackage]

  @inline def values: js.Array[DatasourcePackage] = js.Array(DETECTIVE_CORE, EKS_AUDIT)
}

@js.native
sealed trait DatasourcePackageIngestState extends js.Any
object DatasourcePackageIngestState {
  val STARTED = "STARTED".asInstanceOf[DatasourcePackageIngestState]
  val STOPPED = "STOPPED".asInstanceOf[DatasourcePackageIngestState]
  val DISABLED = "DISABLED".asInstanceOf[DatasourcePackageIngestState]

  @inline def values: js.Array[DatasourcePackageIngestState] = js.Array(STARTED, STOPPED, DISABLED)
}

@js.native
sealed trait InvitationType extends js.Any
object InvitationType {
  val INVITATION = "INVITATION".asInstanceOf[InvitationType]
  val ORGANIZATION = "ORGANIZATION".asInstanceOf[InvitationType]

  @inline def values: js.Array[InvitationType] = js.Array(INVITATION, ORGANIZATION)
}

@js.native
sealed trait MemberDisabledReason extends js.Any
object MemberDisabledReason {
  val VOLUME_TOO_HIGH = "VOLUME_TOO_HIGH".asInstanceOf[MemberDisabledReason]
  val VOLUME_UNKNOWN = "VOLUME_UNKNOWN".asInstanceOf[MemberDisabledReason]

  @inline def values: js.Array[MemberDisabledReason] = js.Array(VOLUME_TOO_HIGH, VOLUME_UNKNOWN)
}

@js.native
sealed trait MemberStatus extends js.Any
object MemberStatus {
  val INVITED = "INVITED".asInstanceOf[MemberStatus]
  val VERIFICATION_IN_PROGRESS = "VERIFICATION_IN_PROGRESS".asInstanceOf[MemberStatus]
  val VERIFICATION_FAILED = "VERIFICATION_FAILED".asInstanceOf[MemberStatus]
  val ENABLED = "ENABLED".asInstanceOf[MemberStatus]
  val ACCEPTED_BUT_DISABLED = "ACCEPTED_BUT_DISABLED".asInstanceOf[MemberStatus]

  @inline def values: js.Array[MemberStatus] = js.Array(INVITED, VERIFICATION_IN_PROGRESS, VERIFICATION_FAILED, ENABLED, ACCEPTED_BUT_DISABLED)
}
