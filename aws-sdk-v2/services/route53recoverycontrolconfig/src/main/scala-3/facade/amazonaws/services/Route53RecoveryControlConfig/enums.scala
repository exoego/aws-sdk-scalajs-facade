package facade.amazonaws.services.route53recoverycontrolconfig

import scalajs.js

/** An enumerated type that determines how the evaluated rules are processed. RuleType can be one of the following: ATLEAST - At least N routing controls must be set. You specify N as the Threshold in the rule configuration. AND - All routing controls must be set. This is a shortcut for "At least N," where N is the total number of controls in the rule. OR - Any control must be set. This is a shortcut for "At least N," where N is 1.
  */
type RuleType = "ATLEAST" | "AND" | "OR"
object RuleType {
  inline val ATLEAST: "ATLEAST" = "ATLEAST"
  inline val AND: "AND" = "AND"
  inline val OR: "OR" = "OR"

  inline def values: js.Array[RuleType] = js.Array(ATLEAST, AND, OR)
}

/** The deployment status of a resource. Status can be one of the following: PENDING: Amazon Route 53 Application Recovery Controller is creating the resource. DEPLOYED: The resource is deployed and ready to use. PENDING_DELETION: Amazon Route 53 Application Recovery Controller is deleting the resource.
  */
type Status = "PENDING" | "DEPLOYED" | "PENDING_DELETION"
object Status {
  inline val PENDING: "PENDING" = "PENDING"
  inline val DEPLOYED: "DEPLOYED" = "DEPLOYED"
  inline val PENDING_DELETION: "PENDING_DELETION" = "PENDING_DELETION"

  inline def values: js.Array[Status] = js.Array(PENDING, DEPLOYED, PENDING_DELETION)
}
