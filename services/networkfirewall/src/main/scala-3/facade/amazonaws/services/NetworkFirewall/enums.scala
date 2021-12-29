package facade.amazonaws.services.networkfirewall

import scalajs._

type AttachmentStatus = "CREATING" | "DELETING" | "SCALING" | "READY"
object AttachmentStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val SCALING: "SCALING" = "SCALING"
  inline val READY: "READY" = "READY"

  inline def values: js.Array[AttachmentStatus] = js.Array(CREATING, DELETING, SCALING, READY)
}

type ConfigurationSyncState = "PENDING" | "IN_SYNC"
object ConfigurationSyncState {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_SYNC: "IN_SYNC" = "IN_SYNC"

  inline def values: js.Array[ConfigurationSyncState] = js.Array(PENDING, IN_SYNC)
}

type FirewallStatusValue = "PROVISIONING" | "DELETING" | "READY"
object FirewallStatusValue {
  inline val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val READY: "READY" = "READY"

  inline def values: js.Array[FirewallStatusValue] = js.Array(PROVISIONING, DELETING, READY)
}

type GeneratedRulesType = "ALLOWLIST" | "DENYLIST"
object GeneratedRulesType {
  inline val ALLOWLIST: "ALLOWLIST" = "ALLOWLIST"
  inline val DENYLIST: "DENYLIST" = "DENYLIST"

  inline def values: js.Array[GeneratedRulesType] = js.Array(ALLOWLIST, DENYLIST)
}

type LogDestinationType = "S3" | "CloudWatchLogs" | "KinesisDataFirehose"
object LogDestinationType {
  inline val S3: "S3" = "S3"
  inline val CloudWatchLogs: "CloudWatchLogs" = "CloudWatchLogs"
  inline val KinesisDataFirehose: "KinesisDataFirehose" = "KinesisDataFirehose"

  inline def values: js.Array[LogDestinationType] = js.Array(S3, CloudWatchLogs, KinesisDataFirehose)
}

type LogType = "ALERT" | "FLOW"
object LogType {
  inline val ALERT: "ALERT" = "ALERT"
  inline val FLOW: "FLOW" = "FLOW"

  inline def values: js.Array[LogType] = js.Array(ALERT, FLOW)
}

type PerObjectSyncStatus = "PENDING" | "IN_SYNC"
object PerObjectSyncStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_SYNC: "IN_SYNC" = "IN_SYNC"

  inline def values: js.Array[PerObjectSyncStatus] = js.Array(PENDING, IN_SYNC)
}

type ResourceStatus = "ACTIVE" | "DELETING"
object ResourceStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ResourceStatus] = js.Array(ACTIVE, DELETING)
}

type RuleGroupType = "STATELESS" | "STATEFUL"
object RuleGroupType {
  inline val STATELESS: "STATELESS" = "STATELESS"
  inline val STATEFUL: "STATEFUL" = "STATEFUL"

  inline def values: js.Array[RuleGroupType] = js.Array(STATELESS, STATEFUL)
}

type StatefulAction = "PASS" | "DROP" | "ALERT"
object StatefulAction {
  inline val PASS: "PASS" = "PASS"
  inline val DROP: "DROP" = "DROP"
  inline val ALERT: "ALERT" = "ALERT"

  inline def values: js.Array[StatefulAction] = js.Array(PASS, DROP, ALERT)
}

type StatefulRuleDirection = "FORWARD" | "ANY"
object StatefulRuleDirection {
  inline val FORWARD: "FORWARD" = "FORWARD"
  inline val ANY: "ANY" = "ANY"

  inline def values: js.Array[StatefulRuleDirection] = js.Array(FORWARD, ANY)
}

type StatefulRuleProtocol = "IP" | "TCP" | "UDP" | "ICMP" | "HTTP" | "FTP" | "TLS" | "SMB" | "DNS" | "DCERPC" | "SSH" | "SMTP" | "IMAP" | "MSN" | "KRB5" | "IKEV2" | "TFTP" | "NTP" | "DHCP"
object StatefulRuleProtocol {
  inline val IP: "IP" = "IP"
  inline val TCP: "TCP" = "TCP"
  inline val UDP: "UDP" = "UDP"
  inline val ICMP: "ICMP" = "ICMP"
  inline val HTTP: "HTTP" = "HTTP"
  inline val FTP: "FTP" = "FTP"
  inline val TLS: "TLS" = "TLS"
  inline val SMB: "SMB" = "SMB"
  inline val DNS: "DNS" = "DNS"
  inline val DCERPC: "DCERPC" = "DCERPC"
  inline val SSH: "SSH" = "SSH"
  inline val SMTP: "SMTP" = "SMTP"
  inline val IMAP: "IMAP" = "IMAP"
  inline val MSN: "MSN" = "MSN"
  inline val KRB5: "KRB5" = "KRB5"
  inline val IKEV2: "IKEV2" = "IKEV2"
  inline val TFTP: "TFTP" = "TFTP"
  inline val NTP: "NTP" = "NTP"
  inline val DHCP: "DHCP" = "DHCP"

  inline def values: js.Array[StatefulRuleProtocol] = js.Array(IP, TCP, UDP, ICMP, HTTP, FTP, TLS, SMB, DNS, DCERPC, SSH, SMTP, IMAP, MSN, KRB5, IKEV2, TFTP, NTP, DHCP)
}

type TCPFlag = "FIN" | "SYN" | "RST" | "PSH" | "ACK" | "URG" | "ECE" | "CWR"
object TCPFlag {
  inline val FIN: "FIN" = "FIN"
  inline val SYN: "SYN" = "SYN"
  inline val RST: "RST" = "RST"
  inline val PSH: "PSH" = "PSH"
  inline val ACK: "ACK" = "ACK"
  inline val URG: "URG" = "URG"
  inline val ECE: "ECE" = "ECE"
  inline val CWR: "CWR" = "CWR"

  inline def values: js.Array[TCPFlag] = js.Array(FIN, SYN, RST, PSH, ACK, URG, ECE, CWR)
}

type TargetType = "TLS_SNI" | "HTTP_HOST"
object TargetType {
  inline val TLS_SNI: "TLS_SNI" = "TLS_SNI"
  inline val HTTP_HOST: "HTTP_HOST" = "HTTP_HOST"

  inline def values: js.Array[TargetType] = js.Array(TLS_SNI, HTTP_HOST)
}
