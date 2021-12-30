package facade.amazonaws.services.applicationinsights

import scalajs.js

type CloudWatchEventSource = "EC2" | "CODE_DEPLOY" | "HEALTH" | "RDS"
object CloudWatchEventSource {
  inline val EC2: "EC2" = "EC2"
  inline val CODE_DEPLOY: "CODE_DEPLOY" = "CODE_DEPLOY"
  inline val HEALTH: "HEALTH" = "HEALTH"
  inline val RDS: "RDS" = "RDS"

  inline def values: js.Array[CloudWatchEventSource] = js.Array(EC2, CODE_DEPLOY, HEALTH, RDS)
}

type ConfigurationEventResourceType = "CLOUDWATCH_ALARM" | "CLOUDWATCH_LOG" | "CLOUDFORMATION" | "SSM_ASSOCIATION"
object ConfigurationEventResourceType {
  inline val CLOUDWATCH_ALARM: "CLOUDWATCH_ALARM" = "CLOUDWATCH_ALARM"
  inline val CLOUDWATCH_LOG: "CLOUDWATCH_LOG" = "CLOUDWATCH_LOG"
  inline val CLOUDFORMATION: "CLOUDFORMATION" = "CLOUDFORMATION"
  inline val SSM_ASSOCIATION: "SSM_ASSOCIATION" = "SSM_ASSOCIATION"

  inline def values: js.Array[ConfigurationEventResourceType] = js.Array(CLOUDWATCH_ALARM, CLOUDWATCH_LOG, CLOUDFORMATION, SSM_ASSOCIATION)
}

type ConfigurationEventStatus = "INFO" | "WARN" | "ERROR"
object ConfigurationEventStatus {
  inline val INFO: "INFO" = "INFO"
  inline val WARN: "WARN" = "WARN"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[ConfigurationEventStatus] = js.Array(INFO, WARN, ERROR)
}

type FeedbackKey = "INSIGHTS_FEEDBACK"
object FeedbackKey {
  inline val INSIGHTS_FEEDBACK: "INSIGHTS_FEEDBACK" = "INSIGHTS_FEEDBACK"

  inline def values: js.Array[FeedbackKey] = js.Array(INSIGHTS_FEEDBACK)
}

type FeedbackValue = "NOT_SPECIFIED" | "USEFUL" | "NOT_USEFUL"
object FeedbackValue {
  inline val NOT_SPECIFIED: "NOT_SPECIFIED" = "NOT_SPECIFIED"
  inline val USEFUL: "USEFUL" = "USEFUL"
  inline val NOT_USEFUL: "NOT_USEFUL" = "NOT_USEFUL"

  inline def values: js.Array[FeedbackValue] = js.Array(NOT_SPECIFIED, USEFUL, NOT_USEFUL)
}

type LogFilter = "ERROR" | "WARN" | "INFO"
object LogFilter {
  inline val ERROR: "ERROR" = "ERROR"
  inline val WARN: "WARN" = "WARN"
  inline val INFO: "INFO" = "INFO"

  inline def values: js.Array[LogFilter] = js.Array(ERROR, WARN, INFO)
}

type OsType = "WINDOWS" | "LINUX"
object OsType {
  inline val WINDOWS: "WINDOWS" = "WINDOWS"
  inline val LINUX: "LINUX" = "LINUX"

  inline def values: js.Array[OsType] = js.Array(WINDOWS, LINUX)
}

type SeverityLevel = "Low" | "Medium" | "High"
object SeverityLevel {
  inline val Low: "Low" = "Low"
  inline val Medium: "Medium" = "Medium"
  inline val High: "High" = "High"

  inline def values: js.Array[SeverityLevel] = js.Array(Low, Medium, High)
}

type Status = "IGNORE" | "RESOLVED" | "PENDING"
object Status {
  inline val IGNORE: "IGNORE" = "IGNORE"
  inline val RESOLVED: "RESOLVED" = "RESOLVED"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[Status] = js.Array(IGNORE, RESOLVED, PENDING)
}

type Tier = "CUSTOM" | "DEFAULT" | "DOT_NET_CORE" | "DOT_NET_WORKER" | "DOT_NET_WEB_TIER" | "DOT_NET_WEB" | "SQL_SERVER" | "SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP" | "MYSQL" | "POSTGRESQL" | "JAVA_JMX" | "ORACLE"
object Tier {
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val DOT_NET_CORE: "DOT_NET_CORE" = "DOT_NET_CORE"
  inline val DOT_NET_WORKER: "DOT_NET_WORKER" = "DOT_NET_WORKER"
  inline val DOT_NET_WEB_TIER: "DOT_NET_WEB_TIER" = "DOT_NET_WEB_TIER"
  inline val DOT_NET_WEB: "DOT_NET_WEB" = "DOT_NET_WEB"
  inline val SQL_SERVER: "SQL_SERVER" = "SQL_SERVER"
  inline val SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP: "SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP" = "SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP"
  inline val MYSQL: "MYSQL" = "MYSQL"
  inline val POSTGRESQL: "POSTGRESQL" = "POSTGRESQL"
  inline val JAVA_JMX: "JAVA_JMX" = "JAVA_JMX"
  inline val ORACLE: "ORACLE" = "ORACLE"

  inline def values: js.Array[Tier] = js.Array(
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
