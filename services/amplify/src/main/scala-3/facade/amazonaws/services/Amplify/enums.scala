package facade.amazonaws.services.amplify

import scalajs.js

type DomainStatus = "PENDING_VERIFICATION" | "IN_PROGRESS" | "AVAILABLE" | "PENDING_DEPLOYMENT" | "FAILED" | "CREATING" | "REQUESTING_CERTIFICATE" | "UPDATING"
object DomainStatus {
  inline val PENDING_VERIFICATION: "PENDING_VERIFICATION" = "PENDING_VERIFICATION"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PENDING_DEPLOYMENT: "PENDING_DEPLOYMENT" = "PENDING_DEPLOYMENT"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CREATING: "CREATING" = "CREATING"
  inline val REQUESTING_CERTIFICATE: "REQUESTING_CERTIFICATE" = "REQUESTING_CERTIFICATE"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[DomainStatus] = js.Array(PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE, PENDING_DEPLOYMENT, FAILED, CREATING, REQUESTING_CERTIFICATE, UPDATING)
}

type JobStatus = "PENDING" | "PROVISIONING" | "RUNNING" | "FAILED" | "SUCCEED" | "CANCELLING" | "CANCELLED"
object JobStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCEED: "SUCCEED" = "SUCCEED"
  inline val CANCELLING: "CANCELLING" = "CANCELLING"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[JobStatus] = js.Array(PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED, CANCELLING, CANCELLED)
}

type JobType = "RELEASE" | "RETRY" | "MANUAL" | "WEB_HOOK"
object JobType {
  inline val RELEASE: "RELEASE" = "RELEASE"
  inline val RETRY: "RETRY" = "RETRY"
  inline val MANUAL: "MANUAL" = "MANUAL"
  inline val WEB_HOOK: "WEB_HOOK" = "WEB_HOOK"

  inline def values: js.Array[JobType] = js.Array(RELEASE, RETRY, MANUAL, WEB_HOOK)
}

type Platform = "WEB"
object Platform {
  inline val WEB: "WEB" = "WEB"

  inline def values: js.Array[Platform] = js.Array(WEB)
}

type Stage = "PRODUCTION" | "BETA" | "DEVELOPMENT" | "EXPERIMENTAL" | "PULL_REQUEST"
object Stage {
  inline val PRODUCTION: "PRODUCTION" = "PRODUCTION"
  inline val BETA: "BETA" = "BETA"
  inline val DEVELOPMENT: "DEVELOPMENT" = "DEVELOPMENT"
  inline val EXPERIMENTAL: "EXPERIMENTAL" = "EXPERIMENTAL"
  inline val PULL_REQUEST: "PULL_REQUEST" = "PULL_REQUEST"

  inline def values: js.Array[Stage] = js.Array(PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL, PULL_REQUEST)
}
