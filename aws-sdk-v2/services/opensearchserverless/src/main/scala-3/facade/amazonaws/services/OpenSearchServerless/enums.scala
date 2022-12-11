package facade.amazonaws.services.opensearchserverless

import scalajs.js

type AccessPolicyType = "data"
object AccessPolicyType {
  inline val data: "data" = "data"

  inline def values: js.Array[AccessPolicyType] = js.Array(data)
}

type CollectionStatus = "CREATING" | "DELETING" | "ACTIVE" | "FAILED"
object CollectionStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[CollectionStatus] = js.Array(CREATING, DELETING, ACTIVE, FAILED)
}

type CollectionType = "SEARCH" | "TIMESERIES"
object CollectionType {
  inline val SEARCH: "SEARCH" = "SEARCH"
  inline val TIMESERIES: "TIMESERIES" = "TIMESERIES"

  inline def values: js.Array[CollectionType] = js.Array(SEARCH, TIMESERIES)
}

type SecurityConfigType = "saml"
object SecurityConfigType {
  inline val saml: "saml" = "saml"

  inline def values: js.Array[SecurityConfigType] = js.Array(saml)
}

type SecurityPolicyType = "encryption" | "network"
object SecurityPolicyType {
  inline val encryption: "encryption" = "encryption"
  inline val network: "network" = "network"

  inline def values: js.Array[SecurityPolicyType] = js.Array(encryption, network)
}

type VpcEndpointStatus = "PENDING" | "DELETING" | "ACTIVE" | "FAILED"
object VpcEndpointStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[VpcEndpointStatus] = js.Array(PENDING, DELETING, ACTIVE, FAILED)
}
