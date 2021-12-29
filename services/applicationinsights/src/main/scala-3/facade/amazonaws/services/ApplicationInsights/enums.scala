package facade.amazonaws.services.applicationinsights

import scalajs._

type CloudWatchEventSource = "EC2" | "CODE_DEPLOY" | "HEALTH" | "RDS"
object CloudWatchEventSource {
  val EC2: "EC2" = "EC2"
  val CODE_DEPLOY: "CODE_DEPLOY" = "CODE_DEPLOY"
  val HEALTH: "HEALTH" = "HEALTH"
  val RDS: "RDS" = "RDS"

  @inline def values = js.Array[CloudWatchEventSource](EC2, CODE_DEPLOY, HEALTH, RDS)
}

type ConfigurationEventResourceType = "CLOUDWATCH_ALARM" | "CLOUDWATCH_LOG" | "CLOUDFORMATION" | "SSM_ASSOCIATION"
object ConfigurationEventResourceType {
  val CLOUDWATCH_ALARM: "CLOUDWATCH_ALARM" = "CLOUDWATCH_ALARM"
  val CLOUDWATCH_LOG: "CLOUDWATCH_LOG" = "CLOUDWATCH_LOG"
  val CLOUDFORMATION: "CLOUDFORMATION" = "CLOUDFORMATION"
  val SSM_ASSOCIATION: "SSM_ASSOCIATION" = "SSM_ASSOCIATION"

  @inline def values = js.Array[ConfigurationEventResourceType](CLOUDWATCH_ALARM, CLOUDWATCH_LOG, CLOUDFORMATION, SSM_ASSOCIATION)
}

type ConfigurationEventStatus = "INFO" | "WARN" | "ERROR"
object ConfigurationEventStatus {
  val INFO: "INFO" = "INFO"
  val WARN: "WARN" = "WARN"
  val ERROR: "ERROR" = "ERROR"

  @inline def values = js.Array[ConfigurationEventStatus](INFO, WARN, ERROR)
}

type FeedbackKey = "INSIGHTS_FEEDBACK"
object FeedbackKey {
  val INSIGHTS_FEEDBACK: "INSIGHTS_FEEDBACK" = "INSIGHTS_FEEDBACK"

  @inline def values = js.Array[FeedbackKey](INSIGHTS_FEEDBACK)
}

type FeedbackValue = "NOT_SPECIFIED" | "USEFUL" | "NOT_USEFUL"
object FeedbackValue {
  val NOT_SPECIFIED: "NOT_SPECIFIED" = "NOT_SPECIFIED"
  val USEFUL: "USEFUL" = "USEFUL"
  val NOT_USEFUL: "NOT_USEFUL" = "NOT_USEFUL"

  @inline def values = js.Array[FeedbackValue](NOT_SPECIFIED, USEFUL, NOT_USEFUL)
}

type LogFilter = "ERROR" | "WARN" | "INFO"
object LogFilter {
  val ERROR: "ERROR" = "ERROR"
  val WARN: "WARN" = "WARN"
  val INFO: "INFO" = "INFO"

  @inline def values = js.Array[LogFilter](ERROR, WARN, INFO)
}

type OsType = "WINDOWS" | "LINUX"
object OsType {
  val WINDOWS: "WINDOWS" = "WINDOWS"
  val LINUX: "LINUX" = "LINUX"

  @inline def values = js.Array[OsType](WINDOWS, LINUX)
}

type SeverityLevel = "Low" | "Medium" | "High"
object SeverityLevel {
  val Low: "Low" = "Low"
  val Medium: "Medium" = "Medium"
  val High: "High" = "High"

  @inline def values = js.Array[SeverityLevel](Low, Medium, High)
}

type Status = "IGNORE" | "RESOLVED" | "PENDING"
object Status {
  val IGNORE: "IGNORE" = "IGNORE"
  val RESOLVED: "RESOLVED" = "RESOLVED"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[Status](IGNORE, RESOLVED, PENDING)
}

type Tier = "CUSTOM" | "DEFAULT" | "DOT_NET_CORE" | "DOT_NET_WORKER" | "DOT_NET_WEB_TIER" | "DOT_NET_WEB" | "SQL_SERVER" | "SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP" | "MYSQL" | "POSTGRESQL" | "JAVA_JMX" | "ORACLE"
object Tier {
  val CUSTOM: "CUSTOM" = "CUSTOM"
  val DEFAULT: "DEFAULT" = "DEFAULT"
  val DOT_NET_CORE: "DOT_NET_CORE" = "DOT_NET_CORE"
  val DOT_NET_WORKER: "DOT_NET_WORKER" = "DOT_NET_WORKER"
  val DOT_NET_WEB_TIER: "DOT_NET_WEB_TIER" = "DOT_NET_WEB_TIER"
  val DOT_NET_WEB: "DOT_NET_WEB" = "DOT_NET_WEB"
  val SQL_SERVER: "SQL_SERVER" = "SQL_SERVER"
  val SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP: "SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP" = "SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP"
  val MYSQL: "MYSQL" = "MYSQL"
  val POSTGRESQL: "POSTGRESQL" = "POSTGRESQL"
  val JAVA_JMX: "JAVA_JMX" = "JAVA_JMX"
  val ORACLE: "ORACLE" = "ORACLE"

  @inline def values = js.Array[Tier](
    CUSTOM,
    DEFAULT,
    DOT_NET_CORE,
    DOT_NET_WORKER,
    DOT_NET_WEB_TIER,
    DOT_NET_WEB,
    SQL_SERVER,
    SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP,
    MYSQL,
    POSTGRESQL,
    JAVA_JMX,
    ORACLE
  )
}
