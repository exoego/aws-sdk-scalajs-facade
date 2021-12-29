package facade.amazonaws.services.networkfirewall

import scalajs._

type AttachmentStatus = "CREATING" | "DELETING" | "SCALING" | "READY"
object AttachmentStatus {
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val SCALING: "SCALING" = "SCALING"
  val READY: "READY" = "READY"

  @inline def values = js.Array[AttachmentStatus](CREATING, DELETING, SCALING, READY)
}

type ConfigurationSyncState = "PENDING" | "IN_SYNC"
object ConfigurationSyncState {
  val PENDING: "PENDING" = "PENDING"
  val IN_SYNC: "IN_SYNC" = "IN_SYNC"

  @inline def values = js.Array[ConfigurationSyncState](PENDING, IN_SYNC)
}

type FirewallStatusValue = "PROVISIONING" | "DELETING" | "READY"
object FirewallStatusValue {
  val PROVISIONING: "PROVISIONING" = "PROVISIONING"
  val DELETING: "DELETING" = "DELETING"
  val READY: "READY" = "READY"

  @inline def values = js.Array[FirewallStatusValue](PROVISIONING, DELETING, READY)
}

type GeneratedRulesType = "ALLOWLIST" | "DENYLIST"
object GeneratedRulesType {
  val ALLOWLIST: "ALLOWLIST" = "ALLOWLIST"
  val DENYLIST: "DENYLIST" = "DENYLIST"

  @inline def values = js.Array[GeneratedRulesType](ALLOWLIST, DENYLIST)
}

type LogDestinationType = "S3" | "CloudWatchLogs" | "KinesisDataFirehose"
object LogDestinationType {
  val S3: "S3" = "S3"
  val CloudWatchLogs: "CloudWatchLogs" = "CloudWatchLogs"
  val KinesisDataFirehose: "KinesisDataFirehose" = "KinesisDataFirehose"

  @inline def values = js.Array[LogDestinationType](S3, CloudWatchLogs, KinesisDataFirehose)
}

type LogType = "ALERT" | "FLOW"
object LogType {
  val ALERT: "ALERT" = "ALERT"
  val FLOW: "FLOW" = "FLOW"

  @inline def values = js.Array[LogType](ALERT, FLOW)
}

type PerObjectSyncStatus = "PENDING" | "IN_SYNC"
object PerObjectSyncStatus {
  val PENDING: "PENDING" = "PENDING"
  val IN_SYNC: "IN_SYNC" = "IN_SYNC"

  @inline def values = js.Array[PerObjectSyncStatus](PENDING, IN_SYNC)
}

type ResourceStatus = "ACTIVE" | "DELETING"
object ResourceStatus {
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"

  @inline def values = js.Array[ResourceStatus](ACTIVE, DELETING)
}

type RuleGroupType = "STATELESS" | "STATEFUL"
object RuleGroupType {
  val STATELESS: "STATELESS" = "STATELESS"
  val STATEFUL: "STATEFUL" = "STATEFUL"

  @inline def values = js.Array[RuleGroupType](STATELESS, STATEFUL)
}

type StatefulAction = "PASS" | "DROP" | "ALERT"
object StatefulAction {
  val PASS: "PASS" = "PASS"
  val DROP: "DROP" = "DROP"
  val ALERT: "ALERT" = "ALERT"

  @inline def values = js.Array[StatefulAction](PASS, DROP, ALERT)
}

type StatefulRuleDirection = "FORWARD" | "ANY"
object StatefulRuleDirection {
  val FORWARD: "FORWARD" = "FORWARD"
  val ANY: "ANY" = "ANY"

  @inline def values = js.Array[StatefulRuleDirection](FORWARD, ANY)
}

type StatefulRuleProtocol = "IP" | "TCP" | "UDP" | "ICMP" | "HTTP" | "FTP" | "TLS" | "SMB" | "DNS" | "DCERPC" | "SSH" | "SMTP" | "IMAP" | "MSN" | "KRB5" | "IKEV2" | "TFTP" | "NTP" | "DHCP"
object StatefulRuleProtocol {
  val IP: "IP" = "IP"
  val TCP: "TCP" = "TCP"
  val UDP: "UDP" = "UDP"
  val ICMP: "ICMP" = "ICMP"
  val HTTP: "HTTP" = "HTTP"
  val FTP: "FTP" = "FTP"
  val TLS: "TLS" = "TLS"
  val SMB: "SMB" = "SMB"
  val DNS: "DNS" = "DNS"
  val DCERPC: "DCERPC" = "DCERPC"
  val SSH: "SSH" = "SSH"
  val SMTP: "SMTP" = "SMTP"
  val IMAP: "IMAP" = "IMAP"
  val MSN: "MSN" = "MSN"
  val KRB5: "KRB5" = "KRB5"
  val IKEV2: "IKEV2" = "IKEV2"
  val TFTP: "TFTP" = "TFTP"
  val NTP: "NTP" = "NTP"
  val DHCP: "DHCP" = "DHCP"

  @inline def values = js.Array[StatefulRuleProtocol](IP, TCP, UDP, ICMP, HTTP, FTP, TLS, SMB, DNS, DCERPC, SSH, SMTP, IMAP, MSN, KRB5, IKEV2, TFTP, NTP, DHCP)
}

type TCPFlag = "FIN" | "SYN" | "RST" | "PSH" | "ACK" | "URG" | "ECE" | "CWR"
object TCPFlag {
  val FIN: "FIN" = "FIN"
  val SYN: "SYN" = "SYN"
  val RST: "RST" = "RST"
  val PSH: "PSH" = "PSH"
  val ACK: "ACK" = "ACK"
  val URG: "URG" = "URG"
  val ECE: "ECE" = "ECE"
  val CWR: "CWR" = "CWR"

  @inline def values = js.Array[TCPFlag](FIN, SYN, RST, PSH, ACK, URG, ECE, CWR)
}

type TargetType = "TLS_SNI" | "HTTP_HOST"
object TargetType {
  val TLS_SNI: "TLS_SNI" = "TLS_SNI"
  val HTTP_HOST: "HTTP_HOST" = "HTTP_HOST"

  @inline def values = js.Array[TargetType](TLS_SNI, HTTP_HOST)
}
