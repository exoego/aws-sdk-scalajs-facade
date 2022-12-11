package facade.amazonaws.services.opensearchserverless

import scalajs.js

@js.native
sealed trait AccessPolicyType extends js.Any
object AccessPolicyType {
  val data = "data".asInstanceOf[AccessPolicyType]

  @inline def values: js.Array[AccessPolicyType] = js.Array(data)
}

@js.native
sealed trait CollectionStatus extends js.Any
object CollectionStatus {
  val CREATING = "CREATING".asInstanceOf[CollectionStatus]
  val DELETING = "DELETING".asInstanceOf[CollectionStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[CollectionStatus]
  val FAILED = "FAILED".asInstanceOf[CollectionStatus]

  @inline def values: js.Array[CollectionStatus] = js.Array(CREATING, DELETING, ACTIVE, FAILED)
}

@js.native
sealed trait CollectionType extends js.Any
object CollectionType {
  val SEARCH = "SEARCH".asInstanceOf[CollectionType]
  val TIMESERIES = "TIMESERIES".asInstanceOf[CollectionType]

  @inline def values: js.Array[CollectionType] = js.Array(SEARCH, TIMESERIES)
}

@js.native
sealed trait SecurityConfigType extends js.Any
object SecurityConfigType {
  val saml = "saml".asInstanceOf[SecurityConfigType]

  @inline def values: js.Array[SecurityConfigType] = js.Array(saml)
}

@js.native
sealed trait SecurityPolicyType extends js.Any
object SecurityPolicyType {
  val encryption = "encryption".asInstanceOf[SecurityPolicyType]
  val network = "network".asInstanceOf[SecurityPolicyType]

  @inline def values: js.Array[SecurityPolicyType] = js.Array(encryption, network)
}

@js.native
sealed trait VpcEndpointStatus extends js.Any
object VpcEndpointStatus {
  val PENDING = "PENDING".asInstanceOf[VpcEndpointStatus]
  val DELETING = "DELETING".asInstanceOf[VpcEndpointStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[VpcEndpointStatus]
  val FAILED = "FAILED".asInstanceOf[VpcEndpointStatus]

  @inline def values: js.Array[VpcEndpointStatus] = js.Array(PENDING, DELETING, ACTIVE, FAILED)
}
