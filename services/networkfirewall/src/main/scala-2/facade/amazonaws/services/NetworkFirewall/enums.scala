package facade.amazonaws.services.networkfirewall

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AttachmentStatus extends js.Any
object AttachmentStatus {
  val CREATING = "CREATING".asInstanceOf[AttachmentStatus]
  val DELETING = "DELETING".asInstanceOf[AttachmentStatus]
  val SCALING = "SCALING".asInstanceOf[AttachmentStatus]
  val READY = "READY".asInstanceOf[AttachmentStatus]

  @inline def values = js.Array(CREATING, DELETING, SCALING, READY)
}

@js.native
sealed trait ConfigurationSyncState extends js.Any
object ConfigurationSyncState {
  val PENDING = "PENDING".asInstanceOf[ConfigurationSyncState]
  val IN_SYNC = "IN_SYNC".asInstanceOf[ConfigurationSyncState]

  @inline def values = js.Array(PENDING, IN_SYNC)
}

@js.native
sealed trait FirewallStatusValue extends js.Any
object FirewallStatusValue {
  val PROVISIONING = "PROVISIONING".asInstanceOf[FirewallStatusValue]
  val DELETING = "DELETING".asInstanceOf[FirewallStatusValue]
  val READY = "READY".asInstanceOf[FirewallStatusValue]

  @inline def values = js.Array(PROVISIONING, DELETING, READY)
}

@js.native
sealed trait GeneratedRulesType extends js.Any
object GeneratedRulesType {
  val ALLOWLIST = "ALLOWLIST".asInstanceOf[GeneratedRulesType]
  val DENYLIST = "DENYLIST".asInstanceOf[GeneratedRulesType]

  @inline def values = js.Array(ALLOWLIST, DENYLIST)
}

@js.native
sealed trait LogDestinationType extends js.Any
object LogDestinationType {
  val S3 = "S3".asInstanceOf[LogDestinationType]
  val CloudWatchLogs = "CloudWatchLogs".asInstanceOf[LogDestinationType]
  val KinesisDataFirehose = "KinesisDataFirehose".asInstanceOf[LogDestinationType]

  @inline def values = js.Array(S3, CloudWatchLogs, KinesisDataFirehose)
}

@js.native
sealed trait LogType extends js.Any
object LogType {
  val ALERT = "ALERT".asInstanceOf[LogType]
  val FLOW = "FLOW".asInstanceOf[LogType]

  @inline def values = js.Array(ALERT, FLOW)
}

@js.native
sealed trait PerObjectSyncStatus extends js.Any
object PerObjectSyncStatus {
  val PENDING = "PENDING".asInstanceOf[PerObjectSyncStatus]
  val IN_SYNC = "IN_SYNC".asInstanceOf[PerObjectSyncStatus]

  @inline def values = js.Array(PENDING, IN_SYNC)
}

@js.native
sealed trait ResourceStatus extends js.Any
object ResourceStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ResourceStatus]
  val DELETING = "DELETING".asInstanceOf[ResourceStatus]

  @inline def values = js.Array(ACTIVE, DELETING)
}

@js.native
sealed trait RuleGroupType extends js.Any
object RuleGroupType {
  val STATELESS = "STATELESS".asInstanceOf[RuleGroupType]
  val STATEFUL = "STATEFUL".asInstanceOf[RuleGroupType]

  @inline def values = js.Array(STATELESS, STATEFUL)
}

@js.native
sealed trait StatefulAction extends js.Any
object StatefulAction {
  val PASS = "PASS".asInstanceOf[StatefulAction]
  val DROP = "DROP".asInstanceOf[StatefulAction]
  val ALERT = "ALERT".asInstanceOf[StatefulAction]

  @inline def values = js.Array(PASS, DROP, ALERT)
}

@js.native
sealed trait StatefulRuleDirection extends js.Any
object StatefulRuleDirection {
  val FORWARD = "FORWARD".asInstanceOf[StatefulRuleDirection]
  val ANY = "ANY".asInstanceOf[StatefulRuleDirection]

  @inline def values = js.Array(FORWARD, ANY)
}

@js.native
sealed trait StatefulRuleProtocol extends js.Any
object StatefulRuleProtocol {
  val IP = "IP".asInstanceOf[StatefulRuleProtocol]
  val TCP = "TCP".asInstanceOf[StatefulRuleProtocol]
  val UDP = "UDP".asInstanceOf[StatefulRuleProtocol]
  val ICMP = "ICMP".asInstanceOf[StatefulRuleProtocol]
  val HTTP = "HTTP".asInstanceOf[StatefulRuleProtocol]
  val FTP = "FTP".asInstanceOf[StatefulRuleProtocol]
  val TLS = "TLS".asInstanceOf[StatefulRuleProtocol]
  val SMB = "SMB".asInstanceOf[StatefulRuleProtocol]
  val DNS = "DNS".asInstanceOf[StatefulRuleProtocol]
  val DCERPC = "DCERPC".asInstanceOf[StatefulRuleProtocol]
  val SSH = "SSH".asInstanceOf[StatefulRuleProtocol]
  val SMTP = "SMTP".asInstanceOf[StatefulRuleProtocol]
  val IMAP = "IMAP".asInstanceOf[StatefulRuleProtocol]
  val MSN = "MSN".asInstanceOf[StatefulRuleProtocol]
  val KRB5 = "KRB5".asInstanceOf[StatefulRuleProtocol]
  val IKEV2 = "IKEV2".asInstanceOf[StatefulRuleProtocol]
  val TFTP = "TFTP".asInstanceOf[StatefulRuleProtocol]
  val NTP = "NTP".asInstanceOf[StatefulRuleProtocol]
  val DHCP = "DHCP".asInstanceOf[StatefulRuleProtocol]

  @inline def values = js.Array(IP, TCP, UDP, ICMP, HTTP, FTP, TLS, SMB, DNS, DCERPC, SSH, SMTP, IMAP, MSN, KRB5, IKEV2, TFTP, NTP, DHCP)
}

@js.native
sealed trait TCPFlag extends js.Any
object TCPFlag {
  val FIN = "FIN".asInstanceOf[TCPFlag]
  val SYN = "SYN".asInstanceOf[TCPFlag]
  val RST = "RST".asInstanceOf[TCPFlag]
  val PSH = "PSH".asInstanceOf[TCPFlag]
  val ACK = "ACK".asInstanceOf[TCPFlag]
  val URG = "URG".asInstanceOf[TCPFlag]
  val ECE = "ECE".asInstanceOf[TCPFlag]
  val CWR = "CWR".asInstanceOf[TCPFlag]

  @inline def values = js.Array(FIN, SYN, RST, PSH, ACK, URG, ECE, CWR)
}

@js.native
sealed trait TargetType extends js.Any
object TargetType {
  val TLS_SNI = "TLS_SNI".asInstanceOf[TargetType]
  val HTTP_HOST = "HTTP_HOST".asInstanceOf[TargetType]

  @inline def values = js.Array(TLS_SNI, HTTP_HOST)
}
