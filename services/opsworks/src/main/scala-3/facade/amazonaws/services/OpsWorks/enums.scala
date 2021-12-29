package facade.amazonaws.services.opsworks

import scalajs._

type AppAttributesKeys = "DocumentRoot" | "RailsEnv" | "AutoBundleOnDeploy" | "AwsFlowRubySettings"
object AppAttributesKeys {
  val DocumentRoot: "DocumentRoot" = "DocumentRoot"
  val RailsEnv: "RailsEnv" = "RailsEnv"
  val AutoBundleOnDeploy: "AutoBundleOnDeploy" = "AutoBundleOnDeploy"
  val AwsFlowRubySettings: "AwsFlowRubySettings" = "AwsFlowRubySettings"

  @inline def values = js.Array[AppAttributesKeys](DocumentRoot, RailsEnv, AutoBundleOnDeploy, AwsFlowRubySettings)
}

type AppType = "aws-flow-ruby" | "java" | "rails" | "php" | "nodejs" | "static" | "other"
object AppType {
  val `aws-flow-ruby`: "aws-flow-ruby" = "aws-flow-ruby"
  val java: "java" = "java"
  val rails: "rails" = "rails"
  val php: "php" = "php"
  val nodejs: "nodejs" = "nodejs"
  val static: "static" = "static"
  val other: "other" = "other"

  @inline def values = js.Array[AppType](`aws-flow-ruby`, java, rails, php, nodejs, static, other)
}

type Architecture = "x86_64" | "i386"
object Architecture {
  val x86_64: "x86_64" = "x86_64"
  val i386: "i386" = "i386"

  @inline def values = js.Array[Architecture](x86_64, i386)
}

type AutoScalingType = "load" | "timer"
object AutoScalingType {
  val load: "load" = "load"
  val timer: "timer" = "timer"

  @inline def values = js.Array[AutoScalingType](load, timer)
}

/** Specifies the encoding of the log file so that the file can be read correctly. The default is <code>utf_8</code>. Encodings supported by Python <code>codecs.decode()</code> can be used here.
  */
type CloudWatchLogsEncoding = "ascii" | "big5" | "big5hkscs" | "cp037" | "cp424" | "cp437" | "cp500" | "cp720" | "cp737" | "cp775" | "cp850" | "cp852" | "cp855" | "cp856" | "cp857" | "cp858" | "cp860" | "cp861" | "cp862" | "cp863" | "cp864" | "cp865" | "cp866" | "cp869" | "cp874" | "cp875" | "cp932" | "cp949" | "cp950" | "cp1006" | "cp1026" | "cp1140" | "cp1250" | "cp1251" | "cp1252" | "cp1253" | "cp1254" | "cp1255" | "cp1256" | "cp1257" | "cp1258" | "euc_jp" | "euc_jis_2004" | "euc_jisx0213" | "euc_kr" | "gb2312" | "gbk" | "gb18030" | "hz" | "iso2022_jp" | "iso2022_jp_1" | "iso2022_jp_2" | "iso2022_jp_2004" | "iso2022_jp_3" | "iso2022_jp_ext" | "iso2022_kr" | "latin_1" | "iso8859_2" | "iso8859_3" | "iso8859_4" | "iso8859_5" | "iso8859_6" | "iso8859_7" | "iso8859_8" | "iso8859_9" | "iso8859_10" | "iso8859_13" | "iso8859_14" | "iso8859_15" | "iso8859_16" | "johab" | "koi8_r" | "koi8_u" | "mac_cyrillic" | "mac_greek" | "mac_iceland" | "mac_latin2" | "mac_roman" | "mac_turkish" |
  "ptcp154" | "shift_jis" | "shift_jis_2004" | "shift_jisx0213" | "utf_32" | "utf_32_be" | "utf_32_le" | "utf_16" | "utf_16_be" | "utf_16_le" | "utf_7" | "utf_8" | "utf_8_sig"
object CloudWatchLogsEncoding {
  val ascii: "ascii" = "ascii"
  val big5: "big5" = "big5"
  val big5hkscs: "big5hkscs" = "big5hkscs"
  val cp037: "cp037" = "cp037"
  val cp424: "cp424" = "cp424"
  val cp437: "cp437" = "cp437"
  val cp500: "cp500" = "cp500"
  val cp720: "cp720" = "cp720"
  val cp737: "cp737" = "cp737"
  val cp775: "cp775" = "cp775"
  val cp850: "cp850" = "cp850"
  val cp852: "cp852" = "cp852"
  val cp855: "cp855" = "cp855"
  val cp856: "cp856" = "cp856"
  val cp857: "cp857" = "cp857"
  val cp858: "cp858" = "cp858"
  val cp860: "cp860" = "cp860"
  val cp861: "cp861" = "cp861"
  val cp862: "cp862" = "cp862"
  val cp863: "cp863" = "cp863"
  val cp864: "cp864" = "cp864"
  val cp865: "cp865" = "cp865"
  val cp866: "cp866" = "cp866"
  val cp869: "cp869" = "cp869"
  val cp874: "cp874" = "cp874"
  val cp875: "cp875" = "cp875"
  val cp932: "cp932" = "cp932"
  val cp949: "cp949" = "cp949"
  val cp950: "cp950" = "cp950"
  val cp1006: "cp1006" = "cp1006"
  val cp1026: "cp1026" = "cp1026"
  val cp1140: "cp1140" = "cp1140"
  val cp1250: "cp1250" = "cp1250"
  val cp1251: "cp1251" = "cp1251"
  val cp1252: "cp1252" = "cp1252"
  val cp1253: "cp1253" = "cp1253"
  val cp1254: "cp1254" = "cp1254"
  val cp1255: "cp1255" = "cp1255"
  val cp1256: "cp1256" = "cp1256"
  val cp1257: "cp1257" = "cp1257"
  val cp1258: "cp1258" = "cp1258"
  val euc_jp: "euc_jp" = "euc_jp"
  val euc_jis_2004: "euc_jis_2004" = "euc_jis_2004"
  val euc_jisx0213: "euc_jisx0213" = "euc_jisx0213"
  val euc_kr: "euc_kr" = "euc_kr"
  val gb2312: "gb2312" = "gb2312"
  val gbk: "gbk" = "gbk"
  val gb18030: "gb18030" = "gb18030"
  val hz: "hz" = "hz"
  val iso2022_jp: "iso2022_jp" = "iso2022_jp"
  val iso2022_jp_1: "iso2022_jp_1" = "iso2022_jp_1"
  val iso2022_jp_2: "iso2022_jp_2" = "iso2022_jp_2"
  val iso2022_jp_2004: "iso2022_jp_2004" = "iso2022_jp_2004"
  val iso2022_jp_3: "iso2022_jp_3" = "iso2022_jp_3"
  val iso2022_jp_ext: "iso2022_jp_ext" = "iso2022_jp_ext"
  val iso2022_kr: "iso2022_kr" = "iso2022_kr"
  val latin_1: "latin_1" = "latin_1"
  val iso8859_2: "iso8859_2" = "iso8859_2"
  val iso8859_3: "iso8859_3" = "iso8859_3"
  val iso8859_4: "iso8859_4" = "iso8859_4"
  val iso8859_5: "iso8859_5" = "iso8859_5"
  val iso8859_6: "iso8859_6" = "iso8859_6"
  val iso8859_7: "iso8859_7" = "iso8859_7"
  val iso8859_8: "iso8859_8" = "iso8859_8"
  val iso8859_9: "iso8859_9" = "iso8859_9"
  val iso8859_10: "iso8859_10" = "iso8859_10"
  val iso8859_13: "iso8859_13" = "iso8859_13"
  val iso8859_14: "iso8859_14" = "iso8859_14"
  val iso8859_15: "iso8859_15" = "iso8859_15"
  val iso8859_16: "iso8859_16" = "iso8859_16"
  val johab: "johab" = "johab"
  val koi8_r: "koi8_r" = "koi8_r"
  val koi8_u: "koi8_u" = "koi8_u"
  val mac_cyrillic: "mac_cyrillic" = "mac_cyrillic"
  val mac_greek: "mac_greek" = "mac_greek"
  val mac_iceland: "mac_iceland" = "mac_iceland"
  val mac_latin2: "mac_latin2" = "mac_latin2"
  val mac_roman: "mac_roman" = "mac_roman"
  val mac_turkish: "mac_turkish" = "mac_turkish"
  val ptcp154: "ptcp154" = "ptcp154"
  val shift_jis: "shift_jis" = "shift_jis"
  val shift_jis_2004: "shift_jis_2004" = "shift_jis_2004"
  val shift_jisx0213: "shift_jisx0213" = "shift_jisx0213"
  val utf_32: "utf_32" = "utf_32"
  val utf_32_be: "utf_32_be" = "utf_32_be"
  val utf_32_le: "utf_32_le" = "utf_32_le"
  val utf_16: "utf_16" = "utf_16"
  val utf_16_be: "utf_16_be" = "utf_16_be"
  val utf_16_le: "utf_16_le" = "utf_16_le"
  val utf_7: "utf_7" = "utf_7"
  val utf_8: "utf_8" = "utf_8"
  val utf_8_sig: "utf_8_sig" = "utf_8_sig"

  @inline def values = js.Array[CloudWatchLogsEncoding](
    ascii,
    big5,
    big5hkscs,
    cp037,
    cp424,
    cp437,
    cp500,
    cp720,
    cp737,
    cp775,
    cp850,
    cp852,
    cp855,
    cp856,
    cp857,
    cp858,
    cp860,
    cp861,
    cp862,
    cp863,
    cp864,
    cp865,
    cp866,
    cp869,
    cp874,
    cp875,
    cp932,
    cp949,
    cp950,
    cp1006,
    cp1026,
    cp1140,
    cp1250,
    cp1251,
    cp1252,
    cp1253,
    cp1254,
    cp1255,
    cp1256,
    cp1257,
    cp1258,
    euc_jp,
    euc_jis_2004,
    euc_jisx0213,
    euc_kr,
    gb2312,
    gbk,
    gb18030,
    hz,
    iso2022_jp,
    iso2022_jp_1,
    iso2022_jp_2,
    iso2022_jp_2004,
    iso2022_jp_3,
    iso2022_jp_ext,
    iso2022_kr,
    latin_1,
    iso8859_2,
    iso8859_3,
    iso8859_4,
    iso8859_5,
    iso8859_6,
    iso8859_7,
    iso8859_8,
    iso8859_9,
    iso8859_10,
    iso8859_13,
    iso8859_14,
    iso8859_15,
    iso8859_16,
    johab,
    koi8_r,
    koi8_u,
    mac_cyrillic,
    mac_greek,
    mac_iceland,
    mac_latin2,
    mac_roman,
    mac_turkish,
    ptcp154,
    shift_jis,
    shift_jis_2004,
    shift_jisx0213,
    utf_32,
    utf_32_be,
    utf_32_le,
    utf_16,
    utf_16_be,
    utf_16_le,
    utf_7,
    utf_8,
    utf_8_sig
  )
}

/** Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. It's only used if there is no state persisted for that log stream.
  */
type CloudWatchLogsInitialPosition = "start_of_file" | "end_of_file"
object CloudWatchLogsInitialPosition {
  val start_of_file: "start_of_file" = "start_of_file"
  val end_of_file: "end_of_file" = "end_of_file"

  @inline def values = js.Array[CloudWatchLogsInitialPosition](start_of_file, end_of_file)
}

/** The preferred time zone for logs streamed to CloudWatch Logs. Valid values are <code>LOCAL</code> and <code>UTC</code>, for Coordinated Universal Time.
  */
type CloudWatchLogsTimeZone = "LOCAL" | "UTC"
object CloudWatchLogsTimeZone {
  val LOCAL: "LOCAL" = "LOCAL"
  val UTC: "UTC" = "UTC"

  @inline def values = js.Array[CloudWatchLogsTimeZone](LOCAL, UTC)
}

type DeploymentCommandName = "install_dependencies" | "update_dependencies" | "update_custom_cookbooks" | "execute_recipes" | "configure" | "setup" | "deploy" | "rollback" | "start" | "stop" | "restart" | "undeploy"
object DeploymentCommandName {
  val install_dependencies: "install_dependencies" = "install_dependencies"
  val update_dependencies: "update_dependencies" = "update_dependencies"
  val update_custom_cookbooks: "update_custom_cookbooks" = "update_custom_cookbooks"
  val execute_recipes: "execute_recipes" = "execute_recipes"
  val configure: "configure" = "configure"
  val setup: "setup" = "setup"
  val deploy: "deploy" = "deploy"
  val rollback: "rollback" = "rollback"
  val start: "start" = "start"
  val stop: "stop" = "stop"
  val restart: "restart" = "restart"
  val undeploy: "undeploy" = "undeploy"

  @inline def values = js.Array[DeploymentCommandName](install_dependencies, update_dependencies, update_custom_cookbooks, execute_recipes, configure, setup, deploy, rollback, start, stop, restart, undeploy)
}

type LayerAttributesKeys = "EcsClusterArn" | "EnableHaproxyStats" | "HaproxyStatsUrl" | "HaproxyStatsUser" | "HaproxyStatsPassword" | "HaproxyHealthCheckUrl" | "HaproxyHealthCheckMethod" | "MysqlRootPassword" | "MysqlRootPasswordUbiquitous" | "GangliaUrl" | "GangliaUser" | "GangliaPassword" | "MemcachedMemory" | "NodejsVersion" | "RubyVersion" | "RubygemsVersion" | "ManageBundler" | "BundlerVersion" | "RailsStack" | "PassengerVersion" | "Jvm" | "JvmVersion" | "JvmOptions" | "JavaAppServer" | "JavaAppServerVersion"
object LayerAttributesKeys {
  val EcsClusterArn: "EcsClusterArn" = "EcsClusterArn"
  val EnableHaproxyStats: "EnableHaproxyStats" = "EnableHaproxyStats"
  val HaproxyStatsUrl: "HaproxyStatsUrl" = "HaproxyStatsUrl"
  val HaproxyStatsUser: "HaproxyStatsUser" = "HaproxyStatsUser"
  val HaproxyStatsPassword: "HaproxyStatsPassword" = "HaproxyStatsPassword"
  val HaproxyHealthCheckUrl: "HaproxyHealthCheckUrl" = "HaproxyHealthCheckUrl"
  val HaproxyHealthCheckMethod: "HaproxyHealthCheckMethod" = "HaproxyHealthCheckMethod"
  val MysqlRootPassword: "MysqlRootPassword" = "MysqlRootPassword"
  val MysqlRootPasswordUbiquitous: "MysqlRootPasswordUbiquitous" = "MysqlRootPasswordUbiquitous"
  val GangliaUrl: "GangliaUrl" = "GangliaUrl"
  val GangliaUser: "GangliaUser" = "GangliaUser"
  val GangliaPassword: "GangliaPassword" = "GangliaPassword"
  val MemcachedMemory: "MemcachedMemory" = "MemcachedMemory"
  val NodejsVersion: "NodejsVersion" = "NodejsVersion"
  val RubyVersion: "RubyVersion" = "RubyVersion"
  val RubygemsVersion: "RubygemsVersion" = "RubygemsVersion"
  val ManageBundler: "ManageBundler" = "ManageBundler"
  val BundlerVersion: "BundlerVersion" = "BundlerVersion"
  val RailsStack: "RailsStack" = "RailsStack"
  val PassengerVersion: "PassengerVersion" = "PassengerVersion"
  val Jvm: "Jvm" = "Jvm"
  val JvmVersion: "JvmVersion" = "JvmVersion"
  val JvmOptions: "JvmOptions" = "JvmOptions"
  val JavaAppServer: "JavaAppServer" = "JavaAppServer"
  val JavaAppServerVersion: "JavaAppServerVersion" = "JavaAppServerVersion"

  @inline def values = js.Array[LayerAttributesKeys](
    EcsClusterArn,
    EnableHaproxyStats,
    HaproxyStatsUrl,
    HaproxyStatsUser,
    HaproxyStatsPassword,
    HaproxyHealthCheckUrl,
    HaproxyHealthCheckMethod,
    MysqlRootPassword,
    MysqlRootPasswordUbiquitous,
    GangliaUrl,
    GangliaUser,
    GangliaPassword,
    MemcachedMemory,
    NodejsVersion,
    RubyVersion,
    RubygemsVersion,
    ManageBundler,
    BundlerVersion,
    RailsStack,
    PassengerVersion,
    Jvm,
    JvmVersion,
    JvmOptions,
    JavaAppServer,
    JavaAppServerVersion
  )
}

type LayerType = "aws-flow-ruby" | "ecs-cluster" | "java-app" | "lb" | "web" | "php-app" | "rails-app" | "nodejs-app" | "memcached" | "db-master" | "monitoring-master" | "custom"
object LayerType {
  val `aws-flow-ruby`: "aws-flow-ruby" = "aws-flow-ruby"
  val `ecs-cluster`: "ecs-cluster" = "ecs-cluster"
  val `java-app`: "java-app" = "java-app"
  val lb: "lb" = "lb"
  val web: "web" = "web"
  val `php-app`: "php-app" = "php-app"
  val `rails-app`: "rails-app" = "rails-app"
  val `nodejs-app`: "nodejs-app" = "nodejs-app"
  val memcached: "memcached" = "memcached"
  val `db-master`: "db-master" = "db-master"
  val `monitoring-master`: "monitoring-master" = "monitoring-master"
  val custom: "custom" = "custom"

  @inline def values = js.Array[LayerType](`aws-flow-ruby`, `ecs-cluster`, `java-app`, lb, web, `php-app`, `rails-app`, `nodejs-app`, memcached, `db-master`, `monitoring-master`, custom)
}

type RootDeviceType = "ebs" | "instance-store"
object RootDeviceType {
  val ebs: "ebs" = "ebs"
  val `instance-store`: "instance-store" = "instance-store"

  @inline def values = js.Array[RootDeviceType](ebs, `instance-store`)
}

type SourceType = "git" | "svn" | "archive" | "s3"
object SourceType {
  val git: "git" = "git"
  val svn: "svn" = "svn"
  val archive: "archive" = "archive"
  val s3: "s3" = "s3"

  @inline def values = js.Array[SourceType](git, svn, archive, s3)
}

type StackAttributesKeys = "Color"
object StackAttributesKeys {
  val Color: "Color" = "Color"

  @inline def values = js.Array[StackAttributesKeys](Color)
}

type VirtualizationType = "paravirtual" | "hvm"
object VirtualizationType {
  val paravirtual: "paravirtual" = "paravirtual"
  val hvm: "hvm" = "hvm"

  @inline def values = js.Array[VirtualizationType](paravirtual, hvm)
}

type VolumeType = "gp2" | "io1" | "standard"
object VolumeType {
  val gp2: "gp2" = "gp2"
  val io1: "io1" = "io1"
  val standard: "standard" = "standard"

  @inline def values = js.Array[VolumeType](gp2, io1, standard)
}
