package facade.amazonaws.services.opsworks

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait AppAttributesKeys extends js.Any
object AppAttributesKeys {
  val DocumentRoot = "DocumentRoot".asInstanceOf[AppAttributesKeys]
  val RailsEnv = "RailsEnv".asInstanceOf[AppAttributesKeys]
  val AutoBundleOnDeploy = "AutoBundleOnDeploy".asInstanceOf[AppAttributesKeys]
  val AwsFlowRubySettings = "AwsFlowRubySettings".asInstanceOf[AppAttributesKeys]

  @inline def values = js.Array(DocumentRoot, RailsEnv, AutoBundleOnDeploy, AwsFlowRubySettings)
}

@js.native
sealed trait AppType extends js.Any
object AppType {
  val `aws-flow-ruby` = "aws-flow-ruby".asInstanceOf[AppType]
  val java = "java".asInstanceOf[AppType]
  val rails = "rails".asInstanceOf[AppType]
  val php = "php".asInstanceOf[AppType]
  val nodejs = "nodejs".asInstanceOf[AppType]
  val static = "static".asInstanceOf[AppType]
  val other = "other".asInstanceOf[AppType]

  @inline def values = js.Array(`aws-flow-ruby`, java, rails, php, nodejs, static, other)
}

@js.native
sealed trait Architecture extends js.Any
object Architecture {
  val x86_64 = "x86_64".asInstanceOf[Architecture]
  val i386 = "i386".asInstanceOf[Architecture]

  @inline def values = js.Array(x86_64, i386)
}

@js.native
sealed trait AutoScalingType extends js.Any
object AutoScalingType {
  val load = "load".asInstanceOf[AutoScalingType]
  val timer = "timer".asInstanceOf[AutoScalingType]

  @inline def values = js.Array(load, timer)
}

/** Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
  */
@js.native
sealed trait CloudWatchLogsEncoding extends js.Any
object CloudWatchLogsEncoding {
  val ascii = "ascii".asInstanceOf[CloudWatchLogsEncoding]
  val big5 = "big5".asInstanceOf[CloudWatchLogsEncoding]
  val big5hkscs = "big5hkscs".asInstanceOf[CloudWatchLogsEncoding]
  val cp037 = "cp037".asInstanceOf[CloudWatchLogsEncoding]
  val cp424 = "cp424".asInstanceOf[CloudWatchLogsEncoding]
  val cp437 = "cp437".asInstanceOf[CloudWatchLogsEncoding]
  val cp500 = "cp500".asInstanceOf[CloudWatchLogsEncoding]
  val cp720 = "cp720".asInstanceOf[CloudWatchLogsEncoding]
  val cp737 = "cp737".asInstanceOf[CloudWatchLogsEncoding]
  val cp775 = "cp775".asInstanceOf[CloudWatchLogsEncoding]
  val cp850 = "cp850".asInstanceOf[CloudWatchLogsEncoding]
  val cp852 = "cp852".asInstanceOf[CloudWatchLogsEncoding]
  val cp855 = "cp855".asInstanceOf[CloudWatchLogsEncoding]
  val cp856 = "cp856".asInstanceOf[CloudWatchLogsEncoding]
  val cp857 = "cp857".asInstanceOf[CloudWatchLogsEncoding]
  val cp858 = "cp858".asInstanceOf[CloudWatchLogsEncoding]
  val cp860 = "cp860".asInstanceOf[CloudWatchLogsEncoding]
  val cp861 = "cp861".asInstanceOf[CloudWatchLogsEncoding]
  val cp862 = "cp862".asInstanceOf[CloudWatchLogsEncoding]
  val cp863 = "cp863".asInstanceOf[CloudWatchLogsEncoding]
  val cp864 = "cp864".asInstanceOf[CloudWatchLogsEncoding]
  val cp865 = "cp865".asInstanceOf[CloudWatchLogsEncoding]
  val cp866 = "cp866".asInstanceOf[CloudWatchLogsEncoding]
  val cp869 = "cp869".asInstanceOf[CloudWatchLogsEncoding]
  val cp874 = "cp874".asInstanceOf[CloudWatchLogsEncoding]
  val cp875 = "cp875".asInstanceOf[CloudWatchLogsEncoding]
  val cp932 = "cp932".asInstanceOf[CloudWatchLogsEncoding]
  val cp949 = "cp949".asInstanceOf[CloudWatchLogsEncoding]
  val cp950 = "cp950".asInstanceOf[CloudWatchLogsEncoding]
  val cp1006 = "cp1006".asInstanceOf[CloudWatchLogsEncoding]
  val cp1026 = "cp1026".asInstanceOf[CloudWatchLogsEncoding]
  val cp1140 = "cp1140".asInstanceOf[CloudWatchLogsEncoding]
  val cp1250 = "cp1250".asInstanceOf[CloudWatchLogsEncoding]
  val cp1251 = "cp1251".asInstanceOf[CloudWatchLogsEncoding]
  val cp1252 = "cp1252".asInstanceOf[CloudWatchLogsEncoding]
  val cp1253 = "cp1253".asInstanceOf[CloudWatchLogsEncoding]
  val cp1254 = "cp1254".asInstanceOf[CloudWatchLogsEncoding]
  val cp1255 = "cp1255".asInstanceOf[CloudWatchLogsEncoding]
  val cp1256 = "cp1256".asInstanceOf[CloudWatchLogsEncoding]
  val cp1257 = "cp1257".asInstanceOf[CloudWatchLogsEncoding]
  val cp1258 = "cp1258".asInstanceOf[CloudWatchLogsEncoding]
  val euc_jp = "euc_jp".asInstanceOf[CloudWatchLogsEncoding]
  val euc_jis_2004 = "euc_jis_2004".asInstanceOf[CloudWatchLogsEncoding]
  val euc_jisx0213 = "euc_jisx0213".asInstanceOf[CloudWatchLogsEncoding]
  val euc_kr = "euc_kr".asInstanceOf[CloudWatchLogsEncoding]
  val gb2312 = "gb2312".asInstanceOf[CloudWatchLogsEncoding]
  val gbk = "gbk".asInstanceOf[CloudWatchLogsEncoding]
  val gb18030 = "gb18030".asInstanceOf[CloudWatchLogsEncoding]
  val hz = "hz".asInstanceOf[CloudWatchLogsEncoding]
  val iso2022_jp = "iso2022_jp".asInstanceOf[CloudWatchLogsEncoding]
  val iso2022_jp_1 = "iso2022_jp_1".asInstanceOf[CloudWatchLogsEncoding]
  val iso2022_jp_2 = "iso2022_jp_2".asInstanceOf[CloudWatchLogsEncoding]
  val iso2022_jp_2004 = "iso2022_jp_2004".asInstanceOf[CloudWatchLogsEncoding]
  val iso2022_jp_3 = "iso2022_jp_3".asInstanceOf[CloudWatchLogsEncoding]
  val iso2022_jp_ext = "iso2022_jp_ext".asInstanceOf[CloudWatchLogsEncoding]
  val iso2022_kr = "iso2022_kr".asInstanceOf[CloudWatchLogsEncoding]
  val latin_1 = "latin_1".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_2 = "iso8859_2".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_3 = "iso8859_3".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_4 = "iso8859_4".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_5 = "iso8859_5".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_6 = "iso8859_6".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_7 = "iso8859_7".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_8 = "iso8859_8".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_9 = "iso8859_9".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_10 = "iso8859_10".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_13 = "iso8859_13".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_14 = "iso8859_14".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_15 = "iso8859_15".asInstanceOf[CloudWatchLogsEncoding]
  val iso8859_16 = "iso8859_16".asInstanceOf[CloudWatchLogsEncoding]
  val johab = "johab".asInstanceOf[CloudWatchLogsEncoding]
  val koi8_r = "koi8_r".asInstanceOf[CloudWatchLogsEncoding]
  val koi8_u = "koi8_u".asInstanceOf[CloudWatchLogsEncoding]
  val mac_cyrillic = "mac_cyrillic".asInstanceOf[CloudWatchLogsEncoding]
  val mac_greek = "mac_greek".asInstanceOf[CloudWatchLogsEncoding]
  val mac_iceland = "mac_iceland".asInstanceOf[CloudWatchLogsEncoding]
  val mac_latin2 = "mac_latin2".asInstanceOf[CloudWatchLogsEncoding]
  val mac_roman = "mac_roman".asInstanceOf[CloudWatchLogsEncoding]
  val mac_turkish = "mac_turkish".asInstanceOf[CloudWatchLogsEncoding]
  val ptcp154 = "ptcp154".asInstanceOf[CloudWatchLogsEncoding]
  val shift_jis = "shift_jis".asInstanceOf[CloudWatchLogsEncoding]
  val shift_jis_2004 = "shift_jis_2004".asInstanceOf[CloudWatchLogsEncoding]
  val shift_jisx0213 = "shift_jisx0213".asInstanceOf[CloudWatchLogsEncoding]
  val utf_32 = "utf_32".asInstanceOf[CloudWatchLogsEncoding]
  val utf_32_be = "utf_32_be".asInstanceOf[CloudWatchLogsEncoding]
  val utf_32_le = "utf_32_le".asInstanceOf[CloudWatchLogsEncoding]
  val utf_16 = "utf_16".asInstanceOf[CloudWatchLogsEncoding]
  val utf_16_be = "utf_16_be".asInstanceOf[CloudWatchLogsEncoding]
  val utf_16_le = "utf_16_le".asInstanceOf[CloudWatchLogsEncoding]
  val utf_7 = "utf_7".asInstanceOf[CloudWatchLogsEncoding]
  val utf_8 = "utf_8".asInstanceOf[CloudWatchLogsEncoding]
  val utf_8_sig = "utf_8_sig".asInstanceOf[CloudWatchLogsEncoding]

  @inline def values = js.Array(ascii, big5, big5hkscs, cp037, cp424, cp437, cp500, cp720, cp737, cp775, cp850, cp852, cp855, cp856, cp857, cp858, cp860, cp861, cp862, cp863, cp864, cp865, cp866, cp869, cp874, cp875, cp932, cp949, cp950, cp1006, cp1026, cp1140, cp1250, cp1251, cp1252, cp1253, cp1254, cp1255, cp1256, cp1257, cp1258, euc_jp, euc_jis_2004, euc_jisx0213, euc_kr, gb2312, gbk, gb18030, hz, iso2022_jp, iso2022_jp_1, iso2022_jp_2, iso2022_jp_2004, iso2022_jp_3, iso2022_jp_ext, iso2022_kr, latin_1, iso8859_2, iso8859_3, iso8859_4, iso8859_5, iso8859_6, iso8859_7, iso8859_8, iso8859_9, iso8859_10, iso8859_13, iso8859_14, iso8859_15, iso8859_16, johab, koi8_r, koi8_u, mac_cyrillic, mac_greek, mac_iceland, mac_latin2, mac_roman, mac_turkish, ptcp154, shift_jis, shift_jis_2004, shift_jisx0213, utf_32, utf_32_be, utf_32_le, utf_16, utf_16_be, utf_16_le, utf_7, utf_8, utf_8_sig)
}

/** Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. It's only used if there is no state persisted for that log stream.
  */
@js.native
sealed trait CloudWatchLogsInitialPosition extends js.Any
object CloudWatchLogsInitialPosition {
  val start_of_file = "start_of_file".asInstanceOf[CloudWatchLogsInitialPosition]
  val end_of_file = "end_of_file".asInstanceOf[CloudWatchLogsInitialPosition]

  @inline def values = js.Array(start_of_file, end_of_file)
}

/** The preferred time zone for logs streamed to CloudWatch Logs. Valid values are <code>LOCAL</code> and <code>UTC</code>, for Coordinated Universal Time.
  */
@js.native
sealed trait CloudWatchLogsTimeZone extends js.Any
object CloudWatchLogsTimeZone {
  val LOCAL = "LOCAL".asInstanceOf[CloudWatchLogsTimeZone]
  val UTC = "UTC".asInstanceOf[CloudWatchLogsTimeZone]

  @inline def values = js.Array(LOCAL, UTC)
}

@js.native
sealed trait DeploymentCommandName extends js.Any
object DeploymentCommandName {
  val install_dependencies = "install_dependencies".asInstanceOf[DeploymentCommandName]
  val update_dependencies = "update_dependencies".asInstanceOf[DeploymentCommandName]
  val update_custom_cookbooks = "update_custom_cookbooks".asInstanceOf[DeploymentCommandName]
  val execute_recipes = "execute_recipes".asInstanceOf[DeploymentCommandName]
  val configure = "configure".asInstanceOf[DeploymentCommandName]
  val setup = "setup".asInstanceOf[DeploymentCommandName]
  val deploy = "deploy".asInstanceOf[DeploymentCommandName]
  val rollback = "rollback".asInstanceOf[DeploymentCommandName]
  val start = "start".asInstanceOf[DeploymentCommandName]
  val stop = "stop".asInstanceOf[DeploymentCommandName]
  val restart = "restart".asInstanceOf[DeploymentCommandName]
  val undeploy = "undeploy".asInstanceOf[DeploymentCommandName]

  @inline def values = js.Array(install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, configure, setup, deploy, rollback, start, stop, restart, undeploy)
}

@js.native
sealed trait LayerAttributesKeys extends js.Any
object LayerAttributesKeys {
  val EcsClusterArn = "EcsClusterArn".asInstanceOf[LayerAttributesKeys]
  val EnableHaproxyStats = "EnableHaproxyStats".asInstanceOf[LayerAttributesKeys]
  val HaproxyStatsUrl = "HaproxyStatsUrl".asInstanceOf[LayerAttributesKeys]
  val HaproxyStatsUser = "HaproxyStatsUser".asInstanceOf[LayerAttributesKeys]
  val HaproxyStatsPassword = "HaproxyStatsPassword".asInstanceOf[LayerAttributesKeys]
  val HaproxyHealthCheckUrl = "HaproxyHealthCheckUrl".asInstanceOf[LayerAttributesKeys]
  val HaproxyHealthCheckMethod = "HaproxyHealthCheckMethod".asInstanceOf[LayerAttributesKeys]
  val MysqlRootPassword = "MysqlRootPassword".asInstanceOf[LayerAttributesKeys]
  val MysqlRootPasswordUbiquitous = "MysqlRootPasswordUbiquitous".asInstanceOf[LayerAttributesKeys]
  val GangliaUrl = "GangliaUrl".asInstanceOf[LayerAttributesKeys]
  val GangliaUser = "GangliaUser".asInstanceOf[LayerAttributesKeys]
  val GangliaPassword = "GangliaPassword".asInstanceOf[LayerAttributesKeys]
  val MemcachedMemory = "MemcachedMemory".asInstanceOf[LayerAttributesKeys]
  val NodejsVersion = "NodejsVersion".asInstanceOf[LayerAttributesKeys]
  val RubyVersion = "RubyVersion".asInstanceOf[LayerAttributesKeys]
  val RubygemsVersion = "RubygemsVersion".asInstanceOf[LayerAttributesKeys]
  val ManageBundler = "ManageBundler".asInstanceOf[LayerAttributesKeys]
  val BundlerVersion = "BundlerVersion".asInstanceOf[LayerAttributesKeys]
  val RailsStack = "RailsStack".asInstanceOf[LayerAttributesKeys]
  val PassengerVersion = "PassengerVersion".asInstanceOf[LayerAttributesKeys]
  val Jvm = "Jvm".asInstanceOf[LayerAttributesKeys]
  val JvmVersion = "JvmVersion".asInstanceOf[LayerAttributesKeys]
  val JvmOptions = "JvmOptions".asInstanceOf[LayerAttributesKeys]
  val JavaAppServer = "JavaAppServer".asInstanceOf[LayerAttributesKeys]
  val JavaAppServerVersion = "JavaAppServerVersion".asInstanceOf[LayerAttributesKeys]

  @inline def values = js.Array(EcsClusterArn, EnableHaproxyStats, HaproxyStatsUrl, HaproxyStatsUser, HaproxyStatsPassword, HaproxyHealthCheckUrl, HaproxyHealthCheckMethod, MysqlRootPassword, MysqlRootPasswordUbiquitous, GangliaUrl, GangliaUser, GangliaPassword, MemcachedMemory, NodejsVersion, RubyVersion, RubygemsVersion, ManageBundler, BundlerVersion, RailsStack, PassengerVersion, Jvm, JvmVersion, JvmOptions, JavaAppServer, JavaAppServerVersion)
}

@js.native
sealed trait LayerType extends js.Any
object LayerType {
  val `aws-flow-ruby` = "aws-flow-ruby".asInstanceOf[LayerType]
  val `ecs-cluster` = "ecs-cluster".asInstanceOf[LayerType]
  val `java-app` = "java-app".asInstanceOf[LayerType]
  val lb = "lb".asInstanceOf[LayerType]
  val web = "web".asInstanceOf[LayerType]
  val `php-app` = "php-app".asInstanceOf[LayerType]
  val `rails-app` = "rails-app".asInstanceOf[LayerType]
  val `nodejs-app` = "nodejs-app".asInstanceOf[LayerType]
  val memcached = "memcached".asInstanceOf[LayerType]
  val `db-master` = "db-master".asInstanceOf[LayerType]
  val `monitoring-master` = "monitoring-master".asInstanceOf[LayerType]
  val custom = "custom".asInstanceOf[LayerType]

  @inline def values = js.Array(`aws-flow-ruby`, `ecs-cluster`, `java-app`, lb, web, `php-app`, `rails-app`, `nodejs-app`, memcached, `db-master`, `monitoring-master`, custom)
}

@js.native
sealed trait RootDeviceType extends js.Any
object RootDeviceType {
  val ebs = "ebs".asInstanceOf[RootDeviceType]
  val `instance-store` = "instance-store".asInstanceOf[RootDeviceType]

  @inline def values = js.Array(ebs, `instance-store`)
}

@js.native
sealed trait SourceType extends js.Any
object SourceType {
  val git = "git".asInstanceOf[SourceType]
  val svn = "svn".asInstanceOf[SourceType]
  val archive = "archive".asInstanceOf[SourceType]
  val s3 = "s3".asInstanceOf[SourceType]

  @inline def values = js.Array(git, svn, archive, s3)
}

@js.native
sealed trait StackAttributesKeys extends js.Any
object StackAttributesKeys {
  val Color = "Color".asInstanceOf[StackAttributesKeys]

  @inline def values = js.Array(Color)
}

@js.native
sealed trait VirtualizationType extends js.Any
object VirtualizationType {
  val paravirtual = "paravirtual".asInstanceOf[VirtualizationType]
  val hvm = "hvm".asInstanceOf[VirtualizationType]

  @inline def values = js.Array(paravirtual, hvm)
}

@js.native
sealed trait VolumeType extends js.Any
object VolumeType {
  val gp2 = "gp2".asInstanceOf[VolumeType]
  val io1 = "io1".asInstanceOf[VolumeType]
  val standard = "standard".asInstanceOf[VolumeType]

  @inline def values = js.Array(gp2, io1, standard)
}

