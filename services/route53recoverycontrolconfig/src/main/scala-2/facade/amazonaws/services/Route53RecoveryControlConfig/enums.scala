package facade.amazonaws.services.route53recoverycontrolconfig

import scalajs.js

/** An enumerated type that determines how the evaluated rules are processed. RuleType can be one of the following: ATLEAST - At least N routing controls must be set. You specify N as the Threshold in the rule configuration. AND - All routing controls must be set. This is a shortcut for "At least N," where N is the total number of controls in the rule. OR - Any control must be set. This is a shortcut for "At least N," where N is 1.
  */
@js.native
sealed trait RuleType extends js.Any
object RuleType {
  val ATLEAST = "ATLEAST".asInstanceOf[RuleType]
  val AND = "AND".asInstanceOf[RuleType]
  val OR = "OR".asInstanceOf[RuleType]

  @inline def values: js.Array[RuleType] = js.Array(ATLEAST, AND, OR)
}

/** The deployment status of a resource. Status can be one of the following: PENDING: Amazon Route 53 Application Recovery Controller is creating the resource. DEPLOYED: The resource is deployed and ready to use. PENDING_DELETION: Amazon Route 53 Application Recovery Controller is deleting the resource.
  */
@js.native
sealed trait Status extends js.Any
object Status {
  val PENDING = "PENDING".asInstanceOf[Status]
  val DEPLOYED = "DEPLOYED".asInstanceOf[Status]
  val PENDING_DELETION = "PENDING_DELETION".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(PENDING, DEPLOYED, PENDING_DELETION)
}
