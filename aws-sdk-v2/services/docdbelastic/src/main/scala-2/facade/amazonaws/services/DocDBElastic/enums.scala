package facade.amazonaws.services.docdbelastic

import scalajs.js

@js.native
sealed trait Auth extends js.Any
object Auth {
  val PLAIN_TEXT = "PLAIN_TEXT".asInstanceOf[Auth]
  val SECRET_ARN = "SECRET_ARN".asInstanceOf[Auth]

  @inline def values: js.Array[Auth] = js.Array(PLAIN_TEXT, SECRET_ARN)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val CREATING = "CREATING".asInstanceOf[Status]
  val ACTIVE = "ACTIVE".asInstanceOf[Status]
  val DELETING = "DELETING".asInstanceOf[Status]
  val UPDATING = "UPDATING".asInstanceOf[Status]
  val VPC_ENDPOINT_LIMIT_EXCEEDED = "VPC_ENDPOINT_LIMIT_EXCEEDED".asInstanceOf[Status]
  val IP_ADDRESS_LIMIT_EXCEEDED = "IP_ADDRESS_LIMIT_EXCEEDED".asInstanceOf[Status]
  val INVALID_SECURITY_GROUP_ID = "INVALID_SECURITY_GROUP_ID".asInstanceOf[Status]
  val INVALID_SUBNET_ID = "INVALID_SUBNET_ID".asInstanceOf[Status]
  val INACCESSIBLE_ENCRYPTION_CREDS = "INACCESSIBLE_ENCRYPTION_CREDS".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(
    CREATING,
    ACTIVE,
    DELETING,
    UPDATING,
    VPC_ENDPOINT_LIMIT_EXCEEDED,
    IP_ADDRESS_LIMIT_EXCEEDED,
    INVALID_SECURITY_GROUP_ID,
    INVALID_SUBNET_ID,
    INACCESSIBLE_ENCRYPTION_CREDS
  )
}
