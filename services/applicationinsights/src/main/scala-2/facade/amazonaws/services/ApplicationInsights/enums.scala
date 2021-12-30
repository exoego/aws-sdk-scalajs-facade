package facade.amazonaws.services.applicationinsights

import scalajs.js

@js.native
sealed trait CloudWatchEventSource extends js.Any
object CloudWatchEventSource {
  val EC2 = "EC2".asInstanceOf[CloudWatchEventSource]
  val CODE_DEPLOY = "CODE_DEPLOY".asInstanceOf[CloudWatchEventSource]
  val HEALTH = "HEALTH".asInstanceOf[CloudWatchEventSource]
  val RDS = "RDS".asInstanceOf[CloudWatchEventSource]

  @inline def values: js.Array[CloudWatchEventSource] = js.Array(EC2, CODE_DEPLOY, HEALTH, RDS)
}

@js.native
sealed trait ConfigurationEventResourceType extends js.Any
object ConfigurationEventResourceType {
  val CLOUDWATCH_ALARM = "CLOUDWATCH_ALARM".asInstanceOf[ConfigurationEventResourceType]
  val CLOUDWATCH_LOG = "CLOUDWATCH_LOG".asInstanceOf[ConfigurationEventResourceType]
  val CLOUDFORMATION = "CLOUDFORMATION".asInstanceOf[ConfigurationEventResourceType]
  val SSM_ASSOCIATION = "SSM_ASSOCIATION".asInstanceOf[ConfigurationEventResourceType]

  @inline def values: js.Array[ConfigurationEventResourceType] = js.Array(CLOUDWATCH_ALARM, CLOUDWATCH_LOG, CLOUDFORMATION, SSM_ASSOCIATION)
}

@js.native
sealed trait ConfigurationEventStatus extends js.Any
object ConfigurationEventStatus {
  val INFO = "INFO".asInstanceOf[ConfigurationEventStatus]
  val WARN = "WARN".asInstanceOf[ConfigurationEventStatus]
  val ERROR = "ERROR".asInstanceOf[ConfigurationEventStatus]

  @inline def values: js.Array[ConfigurationEventStatus] = js.Array(INFO, WARN, ERROR)
}

@js.native
sealed trait FeedbackKey extends js.Any
object FeedbackKey {
  val INSIGHTS_FEEDBACK = "INSIGHTS_FEEDBACK".asInstanceOf[FeedbackKey]

  @inline def values: js.Array[FeedbackKey] = js.Array(INSIGHTS_FEEDBACK)
}

@js.native
sealed trait FeedbackValue extends js.Any
object FeedbackValue {
  val NOT_SPECIFIED = "NOT_SPECIFIED".asInstanceOf[FeedbackValue]
  val USEFUL = "USEFUL".asInstanceOf[FeedbackValue]
  val NOT_USEFUL = "NOT_USEFUL".asInstanceOf[FeedbackValue]

  @inline def values: js.Array[FeedbackValue] = js.Array(NOT_SPECIFIED, USEFUL, NOT_USEFUL)
}

@js.native
sealed trait LogFilter extends js.Any
object LogFilter {
  val ERROR = "ERROR".asInstanceOf[LogFilter]
  val WARN = "WARN".asInstanceOf[LogFilter]
  val INFO = "INFO".asInstanceOf[LogFilter]

  @inline def values: js.Array[LogFilter] = js.Array(ERROR, WARN, INFO)
}

@js.native
sealed trait OsType extends js.Any
object OsType {
  val WINDOWS = "WINDOWS".asInstanceOf[OsType]
  val LINUX = "LINUX".asInstanceOf[OsType]

  @inline def values: js.Array[OsType] = js.Array(WINDOWS, LINUX)
}

@js.native
sealed trait SeverityLevel extends js.Any
object SeverityLevel {
  val Low = "Low".asInstanceOf[SeverityLevel]
  val Medium = "Medium".asInstanceOf[SeverityLevel]
  val High = "High".asInstanceOf[SeverityLevel]

  @inline def values: js.Array[SeverityLevel] = js.Array(Low, Medium, High)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val IGNORE = "IGNORE".asInstanceOf[Status]
  val RESOLVED = "RESOLVED".asInstanceOf[Status]
  val PENDING = "PENDING".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(IGNORE, RESOLVED, PENDING)
}

@js.native
sealed trait Tier extends js.Any
object Tier {
  val CUSTOM = "CUSTOM".asInstanceOf[Tier]
  val DEFAULT = "DEFAULT".asInstanceOf[Tier]
  val DOT_NET_CORE = "DOT_NET_CORE".asInstanceOf[Tier]
  val DOT_NET_WORKER = "DOT_NET_WORKER".asInstanceOf[Tier]
  val DOT_NET_WEB_TIER = "DOT_NET_WEB_TIER".asInstanceOf[Tier]
  val DOT_NET_WEB = "DOT_NET_WEB".asInstanceOf[Tier]
  val SQL_SERVER = "SQL_SERVER".asInstanceOf[Tier]
  val SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP = "SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP".asInstanceOf[Tier]
  val MYSQL = "MYSQL".asInstanceOf[Tier]
  val POSTGRESQL = "POSTGRESQL".asInstanceOf[Tier]
  val JAVA_JMX = "JAVA_JMX".asInstanceOf[Tier]
  val ORACLE = "ORACLE".asInstanceOf[Tier]

  @inline def values: js.Array[Tier] = js.Array(
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
